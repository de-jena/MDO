/**
 * Copyright (c) 2012 - 2025 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.mdo.git.epackage.registry;

import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gecko.emf.osgi.configurator.EPackageConfigurator;
import org.gecko.emf.osgi.constants.EMFNamespaces;
import org.gecko.jgit.api.GitService;
import org.gecko.jgit.api.TreeResult;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
import org.osgi.service.typedevent.TypedEventConstants;
import org.osgi.service.typedevent.TypedEventHandler;
import org.osgi.util.tracker.ServiceTracker;
import org.osgi.util.tracker.ServiceTrackerCustomizer;

import de.jena.mdo.git.epackage.registry.configurator.DynamicEPackageConfigurator;
import de.jena.mdo.git.epackage.registry.configurator.PrototypeEObjectServiceFactory;
import de.jena.mdo.github.webhook.model.githubWebhook.Commit;
import de.jena.mdo.github.webhook.model.githubWebhook.Payload;
import org.eclipse.fennec.persistence.eorm.EntityMappings;

/**
 * 
 * @author Juergen Albert
 * @since 8 Jan 2025
 */
@Component(name = "GitBasedEMFRegistry", service = {}, configurationPolicy = ConfigurationPolicy.REQUIRE)
@Designate(ocd = GitBasedEMFRegistry.Config.class, factory = true)
@SuppressWarnings("rawtypes")
public class GitBasedEMFRegistry implements TypedEventHandler<Payload> {

	private static final Logger LOG = System.getLogger(GitBasedEMFRegistry.class.getName());
	
	GitService gitService;
	ResourceSet resourceSet;
	
	Lock lock = new ReentrantLock();
	Map<String, Metadata> originalToNsUri = new HashMap<>();

	private BundleContext bundleContext;

	private ServiceRegistration<TypedEventHandler> handlerRegistration;

	private ServiceTracker eObjectTracker;

	private ServiceTracker ePackageTracker;
	
	@ObjectClassDefinition
	public static @interface Config {
		String gitserviceTarget();
		
	}
	
	private static class Metadata {
		String originalFileUri;
		Resource resource;
		Map<EObject, List<ServiceRegistration<?>>> services = new HashMap<>();
	}
	
	
	@SuppressWarnings("unchecked")
	@Activate
	public GitBasedEMFRegistry(@Reference(name = "gitservice") GitService gitService, @Reference ResourceSet resourceSet, BundleContext bundleContext) {
		this.gitService = gitService;
		this.resourceSet = resourceSet;
		this.bundleContext = bundleContext;
		
		resourceSet.getURIConverter().getURIHandlers().add(0, new GitURIHandler(gitService));
		
		eObjectTracker = new ServiceTracker(bundleContext, EntityMappings.class, new ServiceTrackerCustomizer<EntityMappings, EntityMappings>() {

			@Override
			public EntityMappings addingService(ServiceReference<EntityMappings> reference) {
				EntityMappings eObject = bundleContext.getService(reference);
				LOG.log(Level.INFO, "EObject Registered " + eObject);	
				return eObject;
			}

			@Override
			public void modifiedService(ServiceReference<EntityMappings> reference, EntityMappings service) {
				LOG.log(Level.INFO, "EObject Modified " + service);
			}

			@Override
			public void removedService(ServiceReference<EntityMappings> reference, EntityMappings service) {
				LOG.log(Level.INFO, "EObject Removed " + service);
			}
		});
//		eObjectTracker.open();
		
		ePackageTracker = new ServiceTracker(bundleContext, EPackage.class, new ServiceTrackerCustomizer<EPackage, EPackage>() {

			@Override
			public EPackage addingService(ServiceReference<EPackage> reference) {
				EPackage eObject = bundleContext.getService(reference);
				LOG.log(Level.INFO, "EPackage Registered " + eObject);	
				return eObject;
			}

			@Override
			public void modifiedService(ServiceReference<EPackage> reference, EPackage service) {
				LOG.log(Level.INFO, "EPackage Modified " + service);
			}

			@Override
			public void removedService(ServiceReference<EPackage> reference, EPackage service) {
				LOG.log(Level.INFO, "EPackage Removed " + service);
			}
		});
		
		gitService.fetch();
		
		ePackageTracker.open();
		
		TreeResult result = gitService.getFiles();
		loadNewResources(result);
		registerEventHandler();
	}
	
	@Deactivate
	void deactivate() {
		eObjectTracker.close();
		ePackageTracker.close();
		handlerRegistration.unregister();
		lock.lock();
		try {
			originalToNsUri.values().forEach(md -> md.services.values().forEach(reg -> reg.forEach(ServiceRegistration::unregister)));
			originalToNsUri.clear();
		} finally {
			lock.unlock();
		}
	}
	
	private void registerEventHandler() {
		String gitUrl = gitService.getGitUrl();
		String topic = null;
		if(gitUrl.startsWith("git://")) {
			topic = gitUrl.substring("git://".length()); 
		}
		if(gitUrl.indexOf("@") != -1) {
			topic = gitUrl.substring(gitUrl.indexOf("@") +1); 
		}
		topic= topic.replace('.', '/').replace(':', '/');
		topic += "/" + gitService.getRef();
		handlerRegistration = bundleContext.registerService(TypedEventHandler.class, this, FrameworkUtil.asDictionary(Map.of(TypedEventConstants.TYPED_EVENT_TOPICS, topic)));
	}

	private void loadNewResources(TreeResult result) {
		lock.lock();
		try {
			loadResources(result.getFiles(), result.getCommitId());
		} finally {
			lock.unlock();
		}
	}
	
	private void loadResources(List<String> files, String commitId) {
		try {
			List<Resource> toHandle = new ArrayList<>();
			createResource(files, commitId, toHandle);
			loadResource(toHandle);
			handleEPackages(toHandle);
			handleEObjects(toHandle);
		} catch (Exception e) {
			LOG.log(Level.ERROR, "Unable to handle EObject/EPackage registration", e);
		} 
	}

	private void createResource(List<String> files, String commitId, List<Resource> toHandle) {
		for (String file : files) {
			int index = file.lastIndexOf('.');
			if(index != -1) {
				String fileExtension = file.substring(index + 1);
				if(resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().containsKey(fileExtension)) {
					Resource resource = resourceSet.createResource(URI.createURI("git://" + commitId + "/" + file));
					toHandle.add(resource);
				}
			}
		}
	}
	
	private void loadResource(List<Resource> toHandle) {
		for (Iterator<Resource> iterator = toHandle.iterator(); iterator.hasNext();) {
			Resource resource = iterator.next();
			try {
				resource.load(null);
			} catch (IOException e) {
				LOG.log(Level.ERROR, "Unable to load Resource for file " + resource.getURI().toString(), e);
			}
			if(resource.getContents().size() == 0) {
				resourceSet.getResources().remove(resource);
				iterator.remove();
			}
			
		}
	}
	
	private void handleEPackages(List<Resource> toHandle) {
		List<Metadata> metadataToHandle = new ArrayList<>();
		for (Resource resource : toHandle) {
			EObject eObject = resource.getContents().get(0);
			if(eObject instanceof EPackage) {
				EPackage ePackage = (EPackage) eObject;
				EcoreUtil.resolveAll(ePackage);
				
				Metadata metadata = new Metadata();
				metadata.originalFileUri = GitEMFHelper.getGitFilePath(resource.getURI());
				metadata.resource = resource;
				resource.setURI(URI.createURI(ePackage.getNsURI()));
				metadata.services.put(ePackage, new ArrayList<>());
				addSubPackages(metadata, ePackage.getESubpackages());
				originalToNsUri.put(metadata.originalFileUri, metadata);
				metadataToHandle.add(metadata);
			}
		}
		metadataToHandle.forEach(this::registerConfigurators);
		metadataToHandle.forEach(this::registerEPackage);
	}

	private void handleEObjects(List<Resource> toHandle) {
		List<Metadata> metadataToHandle = new ArrayList<>();
		for (Resource resource : toHandle) {
			for (EObject eObject : resource.getContents()) {
				if(eObject instanceof EPackage) {
					continue;
				}
				EcoreUtil.resolveAll(eObject);
				
				Metadata metadata = new Metadata();
				metadata.originalFileUri = GitEMFHelper.getGitFilePath(resource.getURI());
				metadata.resource = resource;
				metadata.services.put(eObject, new ArrayList<>());
				originalToNsUri.put(metadata.originalFileUri, metadata);
				metadataToHandle.add(metadata);
			}
		}
		metadataToHandle.forEach(this::registerEObject);
	}

	private void registerEObject(Metadata data) {
		data.services.forEach(this::registerEObjectService);
	}
	
	
	private void registerEObjectService(EObject eObject, List<ServiceRegistration<?>> resigtrations) {
		String id = EcoreUtil.getID(eObject);
		String idProp = eObject.eClass().getEIDAttribute().getName();
		if(id == null) {
			return;
		}
		PrototypeEObjectServiceFactory<EObject> factory = new PrototypeEObjectServiceFactory<>(eObject);
		List<String> interfaces = new ArrayList<>();
		EClass eClass = eObject.eClass();
		if(eClass.getInstanceClass() != null && eClass.getInstanceClass() != DynamicEObjectImpl.class){
			interfaces.add(eClass.getInstanceClass().getName());
		}
		for (EClass superType : eClass.getEAllSuperTypes()) {
			if(superType.getInstanceClass() != null) {
				interfaces.add(eClass.getInstanceClass().getName());
			}
		}
		
		interfaces.add(EObject.class.getName());
		ServiceRegistration<?> serviceRegistration = bundleContext.registerService(interfaces.toArray(new String[0]), factory, FrameworkUtil.asDictionary(Map.of(idProp, id, Constants.SERVICE_SCOPE, Constants.SCOPE_PROTOTYPE)));
		resigtrations.add(serviceRegistration);
	}

	private void registerConfigurators(Metadata data) {
		data.services.forEach(this::registerConfigurator);
	}
	
	private void registerConfigurator(EObject ePackage, List<ServiceRegistration<?>> resigtrations) {
		DynamicEPackageConfigurator configurator = new DynamicEPackageConfigurator((EPackage) ePackage);
		ServiceRegistration<EPackageConfigurator> serviceRegistration = bundleContext.registerService(EPackageConfigurator.class, configurator, getServiceProperties((EPackage)ePackage));
		resigtrations.add(serviceRegistration);
	}

	private void registerEPackage(Metadata data) {
		data.services.forEach(this::registerEPackage);
	}
	
	private void registerEPackage(EObject ePackage, List<ServiceRegistration<?>> resigtrations) {
		ServiceRegistration<EPackage> serviceRegistration = bundleContext.registerService(EPackage.class, (EPackage) ePackage, getServiceProperties((EPackage) ePackage));
		resigtrations.add(serviceRegistration);
	}
	
	private Dictionary<String, String> getServiceProperties(EPackage ePackage){
		Dictionary<String, String> serviceProperties = new Hashtable<>();
		String nsUri = ePackage.getNsURI();
		serviceProperties.put(EMFNamespaces.EMF_MODEL_NAME, ePackage.getName());
		serviceProperties.put(EMFNamespaces.EMF_MODEL_NSURI, nsUri);
		serviceProperties.put(EMFNamespaces.EMF_MODEL_REGISTRATION, EMFNamespaces.MODEL_REGISTRATION_DYNAMIC);
		EAnnotation eAnnotation = ePackage.getEAnnotation("properties");
		if(eAnnotation != null) {
			for (Entry<String, String> entry : eAnnotation.getDetails()) {
				if(entry.getKey() != null  && entry.getValue() != null) {
					serviceProperties.put(entry.getKey(), entry.getValue());
				}
			}
		}
		return serviceProperties;
	}

	/**
	 * @param metadata
	 * @param eSubpackages
	 */
	private void addSubPackages(Metadata metadata, EList<EPackage> eSubpackages) {
		for (EPackage ePackage : eSubpackages) {
			metadata.services.put(ePackage, new ArrayList<>());
			addSubPackages(metadata, ePackage.getESubpackages());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.service.typedevent.TypedEventHandler#notify(java.lang.String,
	 * java.lang.Object)
	 */
	@Override
	public void notify(String topic, Payload event) {
		System.out.println("received Github Payload " + event);
		List<String> toRemove = new ArrayList<>();
		List<String> toAdd = new ArrayList<>();
		List<String> toModify = new ArrayList<>();
		for (Commit commit : event.getCommits()) {
			//handle Add
			toAdd.addAll(commit.getAdded());
			toRemove.removeAll(commit.getAdded()); //if it was removed in a previous commit, we have to remove the files from the toDo List
			
			toModify.addAll(commit.getModified());
			
			toRemove.addAll(commit.getRemoved());
			toAdd.removeAll(commit.getRemoved()); //if any previous commit added it, we have to remove it from the to add list as well
		}
		lock.lock();
		try {
			gitService.fetch();
			handleRemove(toRemove);
			handleAddModify(toAdd, toModify, event.getHead_commit().getId());
		} finally {
			lock.unlock();
		}
	}

	private void handleRemove(List<String> toRemove) {
		for(String remove : toRemove) {
			Metadata metadata = originalToNsUri.remove(remove);
			if(metadata != null) {
				metadata.services.forEach((k,v) -> v.forEach(ServiceRegistration::unregister));
				metadata.resource.unload();
				resourceSet.getResources().remove(metadata.resource);
			}
		}
	}
	
	private void handleAddModify(List<String> toAdd, List<String> toModify, String commitId) {
		handleRemove(toModify);
		List<String> all = new ArrayList<>(toModify);
		all.addAll(toAdd);
		loadResources(all, commitId);
	}

}
