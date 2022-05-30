/*
 * Copyright (c) 2012 - 2022 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *      Data In Motion - initial API and implementation
 */
package org.gecko.emf.osgi.components.dynamic;

import java.io.IOException;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Map;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gecko.emf.osgi.EMFNamespaces;
import org.gecko.emf.osgi.EPackageConfigurator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.cm.annotations.RequireConfigurationAdmin;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
import org.osgi.service.metatype.annotations.RequireMetaTypeImplementation;

/**
 * A URL can be configured, where a ecore is expected. The {@link EPackage} will then be loaded and together with a {@link EPackageConfigurator} registered for further use. 
 * Only the first EPackage is registered.
 * 
 * The {@link EPackage} and {@link EPackageConfigurator} will be registered with the properties {@link EMFNamespaces#EMF_MODEL_NAME} and {@link EMFNamespaces#EMF_MODEL_NSURI}. 
 * Additional properties can be defined with the prefix "additional.*". The prefix will be cut before used as registering properties.   
 * 
 * TODO: Needs to be enabled to handle ecores with more then one {@link EPackage}s in one ecore.
 *  
 * @author Juergen Albert
 * @since 16.03.2022
 */
@Component(name = "DynamicPackageLoader")
@Designate(ocd = org.gecko.emf.osgi.components.dynamic.DynamicPackageLoader.Config.class, factory = true)
@RequireConfigurationAdmin
@RequireMetaTypeImplementation
@ServiceCapability(EPackage.class)
@ServiceCapability(EPackageConfigurator.class)
public class DynamicPackageLoader{
	
	/** ADDTIONAL */
	private static final String ADDTIONAL = "additional";

	@Reference
	private ComponentServiceObjects<ResourceSet> resourceSetServiceObjects;
	
	private static final Logger logger = Logger.getLogger(DynamicPackageLoader.class.getName());
	private URI ecoreURI = null;
	private EPackage dynamicPackage = null;
	private BundleContext ctx;

	private ServiceRegistration<EPackage> packageRegistration;

	private ServiceRegistration<EPackageConfigurator> configuratorRegistration;

	private Map<String, Object> props;

	@ObjectClassDefinition(
			description = "A URL can be configured, where a ecore is expected. The EPackage will then be loaded and registered for further use. Only the first EPackage is registered."
			)
	public @interface Config {
		
		@AttributeDefinition(description = "A usefull identifier")
		String id();
		
		@AttributeDefinition(description = "A URL to a ecore file")
		String url();

		@AttributeDefinition(description = "Marks the requirement for a REST Endpoint representing.")
		boolean additionalRest() default true;

		@AttributeDefinition(description = "A List of EClasses in this package, to generate Testdata for.")
		String[] additionalTestDataList() default {};
		
		@AttributeDefinition(description = "The Amount of test Instances to be generated. Default is 1000.")
		long additionalTestInstances() default 1000L;
	}
	
	/**
	 * Called on components activation
	 * @param ctx the component context
	 * @param properties the component properties
	 * @throws ConfigurationException
	 */
	@Activate
	public void activate(BundleContext ctx, Config config, Map<String, Object> props) throws ConfigurationException {
		logger.info("Trying to load Package for " + config.url());
		this.props = props;
		this.ctx = ctx;
		ecoreURI = URI.createURI(config.url());
		
		try {
			loadModel();
		} catch (Exception e) {
			throw new ConfigurationException("url", "The EMF model at " + config.url() + " could not be loaded.", e);
		}
	}
	
	/**
	 * Loads the model from the given URL
	 */
	private void loadModel() {
		ResourceSet resourceSet = resourceSetServiceObjects.getService();
		try {
			Resource resource = resourceSet.createResource(ecoreURI);
			resource.load(null);
			
			if (resource.getContents().isEmpty()) {
				throw new IllegalStateException("Loaded ecore with no content '" + ecoreURI + "'");
			}
			dynamicPackage = (EPackage) resource.getContents().get(0);
			resource.setURI(URI.createURI(dynamicPackage.getNsURI()));
			resourceSet.getResources().clear();
		} catch (IOException e) {
			throw new IllegalStateException("Error loading ecore file at '" + ecoreURI + "'", e);
		} finally {
			resourceSetServiceObjects.ungetService(resourceSet);
		}
		Dictionary<String, Object> properties = new Hashtable<String, Object>();
		properties.put(EMFNamespaces.EMF_MODEL_NAME, dynamicPackage.getName());
		properties.put(EMFNamespaces.EMF_MODEL_NSURI, dynamicPackage.getNsURI());

		props.entrySet().stream().filter(e -> e.getKey().startsWith(ADDTIONAL)).forEach(e -> properties.put(e.getKey().substring(ADDTIONAL.length()), e.getValue()));
		
		logger.info("Registering Package " + dynamicPackage.getName() + " for with nsURI " + dynamicPackage.getNsURI());
		
		EPackage.Registry.INSTANCE.put(dynamicPackage.getNsURI(),dynamicPackage);
		configuratorRegistration = ctx.registerService(EPackageConfigurator.class, new DynamicPackageConfiguratorImpl(dynamicPackage), properties);
		packageRegistration =  ctx.registerService(EPackage.class, dynamicPackage, properties);
	}
	
	@Deactivate
	public void deactivate() {
		packageRegistration.unregister();
		configuratorRegistration.unregister();
		EPackage.Registry.INSTANCE.remove(dynamicPackage.getNsURI());
	}
}
