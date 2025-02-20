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
package org.eclipse.daanse.demo.server.play;

import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.nio.file.Path;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent.Kind;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;

import org.eclipse.daanse.io.fs.watcher.api.FileSystemWatcherListener;
import org.eclipse.daanse.io.fs.watcher.api.propertytypes.FileSystemWatcherListenerProperties;
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
import org.osgi.service.component.annotations.ReferenceScope;
import org.osgi.util.tracker.ServiceTracker;
import org.osgi.util.tracker.ServiceTrackerCustomizer;

import de.jena.mdo.emf.common.configurator.DynamicEPackageConfigurator;
import de.jena.mdo.emf.common.configurator.PrototypeEObjectServiceFactory;
import de.jena.mdo.emf.common.ecore.EClassResolvingDynamicEFactory;

/**
 * 
 * @author Juergen Albert
 * @since 8 Jan 2025
 */
@Component(name = EMFFileWatcher.PID, configurationPolicy = ConfigurationPolicy.REQUIRE)
@FileSystemWatcherListenerProperties(recursive = true)
@SuppressWarnings("rawtypes")
public class EMFFileWatcher implements FileSystemWatcherListener {

	private static final Logger LOG = System.getLogger(EMFFileWatcher.class.getName());

	public static final String PID = "EMFFileWatcher";

	private final ResourceSet resourceSet;

	private final Lock lock = new ReentrantLock();
	private final Map<String, Metadata> originalToNsUri = new HashMap<>();

	private final BundleContext bundleContext;

	private final ServiceTracker eObjectTracker;

	private final ServiceTracker ePackageTracker;

	private Path unitName;

	private static class Metadata {
		String originalFileUri;
		Resource resource;
		Map<EObject, List<ServiceRegistration<?>>> services = new HashMap<>();
	}

	@SuppressWarnings("unchecked")
	@Activate
	public EMFFileWatcher(@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED) ResourceSet resourceSet,
			BundleContext bundleContext) {
		this.resourceSet = resourceSet;
		this.bundleContext = bundleContext;
		eObjectTracker = new ServiceTracker(bundleContext, EObject.class,
				new ServiceTrackerCustomizer<EObject, EObject>() {

					@Override
					public EObject addingService(ServiceReference<EObject> reference) {
						EObject eObject = bundleContext.getService(reference);
						LOG.log(Level.INFO, "EObject Registered " + eObject);
						return eObject;
					}

					@Override
					public void modifiedService(ServiceReference<EObject> reference, EObject service) {
						LOG.log(Level.INFO, "EObject Modified " + service);
					}

					@Override
					public void removedService(ServiceReference<EObject> reference, EObject service) {
						LOG.log(Level.INFO, "EObject Removed " + service);
					}
				});
		eObjectTracker.open();

		ePackageTracker = new ServiceTracker(bundleContext, EPackage.class,
				new ServiceTrackerCustomizer<EPackage, EPackage>() {

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

		ePackageTracker.open();
	}

	@Deactivate
	void deactivate() {
		eObjectTracker.close();
		ePackageTracker.close();
		lock.lock();
		try {
			originalToNsUri.values()
					.forEach(md -> md.services.values().forEach(reg -> reg.forEach(ServiceRegistration::unregister)));
			originalToNsUri.clear();
		} finally {
			lock.unlock();
		}
	}

	private void loadResources(List<String> uris) {
		try {
			List<Resource> toHandle = new ArrayList<>();
			createResource(uris, toHandle);
			loadResource(toHandle);
			handleEPackages(toHandle);
			handleEObjects(toHandle);
		} catch (Exception e) {
			LOG.log(Level.ERROR, "Unable to handle EObject/EPackage registration", e);
		}
	}

	private void createResource(List<String> uris, List<Resource> toHandle) {
		for (String uri : uris) {
			int index = uri.lastIndexOf('.');
			if (index != -1) {
				String fileExtension = uri.substring(index + 1);
				if (resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().containsKey(fileExtension)) {
					Resource resource = resourceSet.createResource(URI.createURI(uri));
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
			if (resource.getContents().size() == 0) {
				resourceSet.getResources().remove(resource);
				iterator.remove();
			} else {
				resource.getContents().forEach(EcoreUtil::resolveAll);
			}

		}
	}

	private void handleEPackages(List<Resource> toHandle) {
		List<Metadata> metadataToHandle = new ArrayList<>();
		for (Resource resource : toHandle) {
			EObject eObject = resource.getContents().get(0);
			if (eObject instanceof EPackage) {
				EPackage ePackage = (EPackage) eObject;

				ePackage.setEFactoryInstance(new EClassResolvingDynamicEFactory());

				Metadata metadata = new Metadata();
				metadata.originalFileUri = resource.getURI().toString();
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
				if (eObject instanceof EPackage) {
					continue;
				}

				Metadata metadata = new Metadata();
				metadata.originalFileUri = resource.getURI().toString();
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
		if (id == null) {
			return;
		}
		String idProp = eObject.eClass().getEIDAttribute().getName();
		PrototypeEObjectServiceFactory<EObject> factory = new PrototypeEObjectServiceFactory<>(eObject);
		List<String> interfaces = new ArrayList<>();
		EClass eClass = eObject.eClass();
		BundleContext theBundleContextToUse = bundleContext;
		if (eClass.getInstanceClass() != null && eClass.getInstanceClass() != DynamicEObjectImpl.class) {
			interfaces.add(eClass.getInstanceClass().getName());
			theBundleContextToUse = FrameworkUtil.getBundle(eClass.getInstanceClass()).getBundleContext();
		}
		for (EClass superType : eClass.getEAllSuperTypes()) {
			if (superType.getInstanceClass() != null) {
				interfaces.add(eClass.getInstanceClass().getName());
			}
		}

		interfaces.add(EObject.class.getName());
		List<String> eClassUris = new ArrayList<>();
		eClassUris.add(EcoreUtil.getURI(eClass).toString());
		eClass.getEAllSuperTypes().stream().map(EcoreUtil::getURI).map(Object::toString).forEach(eClassUris::add);
		ServiceRegistration<?> serviceRegistration = theBundleContextToUse.registerService(
				interfaces.toArray(new String[0]), factory, FrameworkUtil.asDictionary(Map.of(idProp, id,
						Constants.SERVICE_SCOPE, Constants.SCOPE_PROTOTYPE, "eClassUris", eClassUris, "Rest", true)));
		resigtrations.add(serviceRegistration);
	}

	private void registerConfigurators(Metadata data) {
		data.services.forEach(this::registerConfigurator);
	}

	private void registerConfigurator(EObject ePackage, List<ServiceRegistration<?>> resigtrations) {
		DynamicEPackageConfigurator configurator = new DynamicEPackageConfigurator((EPackage) ePackage);
		ServiceRegistration<EPackageConfigurator> serviceRegistration = bundleContext
				.registerService(EPackageConfigurator.class, configurator, getServiceProperties((EPackage) ePackage));
		resigtrations.add(serviceRegistration);
	}

	private void registerEPackage(Metadata data) {
		data.services.forEach(this::registerEPackage);
	}

	private void registerEPackage(EObject ePackage, List<ServiceRegistration<?>> resigtrations) {
		ServiceRegistration<EPackage> serviceRegistration = bundleContext.registerService(EPackage.class,
				(EPackage) ePackage, getServiceProperties((EPackage) ePackage));
		resigtrations.add(serviceRegistration);
	}

	private Dictionary<String, String> getServiceProperties(EPackage ePackage) {
		Dictionary<String, String> serviceProperties = new Hashtable<>();
		String nsUri = ePackage.getNsURI();
		serviceProperties.put(EMFNamespaces.EMF_MODEL_NAME, ePackage.getName());
		serviceProperties.put(EMFNamespaces.EMF_MODEL_NSURI, nsUri);
		serviceProperties.put(EMFNamespaces.EMF_MODEL_REGISTRATION, EMFNamespaces.MODEL_REGISTRATION_DYNAMIC);
		serviceProperties.put("repo.ref.target", "(repo_id=" + unitName + ")");
		EAnnotation eAnnotation = ePackage.getEAnnotation("properties");
		if (eAnnotation != null) {
			for (Entry<String, String> entry : eAnnotation.getDetails()) {
				if (entry.getKey() != null && entry.getValue() != null) {
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

	private void handleRemove(List<String> toRemove) {
		for (String remove : toRemove) {
			Metadata metadata = originalToNsUri.remove(remove);
			if (metadata != null) {
				metadata.services.forEach((k, v) -> v.forEach(ServiceRegistration::unregister));
				metadata.resource.unload();
				resourceSet.getResources().remove(metadata.resource);
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.daanse.io.fs.watcher.api.FileSystemWatcherListener#handleBasePath
	 * (java.nio.file.Path)
	 */
	@Override
	public void handleBasePath(Path basePath) {
		unitName = basePath.getName(basePath.getNameCount() - 2);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.daanse.io.fs.watcher.api.FileSystemWatcherListener#
	 * handleInitialPaths(java.util.List)
	 */
	@Override
	public void handleInitialPaths(List<Path> paths) {
		List<String> toAdd = paths.stream().map(Path::toUri).map(Object::toString).collect(Collectors.toList());
		loadResources(toAdd);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.daanse.io.fs.watcher.api.FileSystemWatcherListener#
	 * handlePathEvent(java.nio.file.Path, java.nio.file.WatchEvent.Kind)
	 */
	@Override
	public void handlePathEvent(Path path, Kind<Path> kind) {
		if (StandardWatchEventKinds.ENTRY_MODIFY.equals(kind)) {
			handleRemove(List.of(path.toUri().toString()));
			scheduleDelaied(path.toUri().toString());
		} else if (StandardWatchEventKinds.ENTRY_CREATE.equals(kind)) {
			scheduleDelaied(path.toUri().toString());
		} else if (StandardWatchEventKinds.ENTRY_DELETE.equals(kind)) {
			handleRemove(List.of(path.toUri().toString()));
		}
	}

	private List<String> uris = new ArrayList<>();

	Timer timer = new Timer();
	TimerTask task = null;

	private void scheduleDelaied(String uri) {
		lock.lock();
		try {
			uris.add(uri);
			if (task != null) {
				task.cancel();
			}
			task = new DelaiedTimerTask(this::loadDelaied);
			timer.schedule(task, 1000);
		} finally {
			lock.unlock();
		}
	}

	private static final class DelaiedTimerTask extends TimerTask {

		private Runnable runnable;

		public DelaiedTimerTask(Runnable runnable) {
			this.runnable = runnable;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.util.TimerTask#run()
		 */
		@Override
		public void run() {
			runnable.run();
		}

	}

	private void loadDelaied() {
		lock.lock();
		try {
			loadResources(uris);
			uris.clear();
		} finally {
			lock.unlock();
		}
	}

}
