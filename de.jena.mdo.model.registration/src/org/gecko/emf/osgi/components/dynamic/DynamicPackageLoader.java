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
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

/**
 * @author Juergen Albert
 * @since 16.03.2022
 */
@Component(name = "DynamicPackageLoader", configurationPolicy=ConfigurationPolicy.REQUIRE)
@Designate(ocd = org.gecko.emf.osgi.components.dynamic.DynamicPackageLoader.Config.class)
public class DynamicPackageLoader{
	
	@Reference
	ComponentServiceObjects<ResourceSet> resourceSetServiceObjects;
	
	private static final Logger logger = Logger.getLogger(DynamicPackageLoader.class.getName());
	private URI ecoreURI = null;
	private EPackage dynamicPackage = null;
	private BundleContext ctx;

	private ServiceRegistration<EPackage> packageRegistration;

	private ServiceRegistration<EPackageConfigurator> configuratorRegistration;

	@ObjectClassDefinition
	public @interface Config {
		String url();
	}
	
	/**
	 * Called on components activation
	 * @param ctx the component context
	 * @param properties the component properties
	 * @throws ConfigurationException
	 */
	@Activate
	public void activate(BundleContext ctx, Config config) throws ConfigurationException {
		System.err.println("Activate is called");
		this.ctx = ctx;
		ecoreURI = URI.createURI(config.url());
		
		try {
			loadModel();
		} catch (Exception e) {
			throw new ConfigurationException("url", "The EMF model ecore file path is invalid please use: '<bsn>:(<version>)/(<path>)/<file>.ecore': " + e.getMessage());
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
			resource.getContents().clear();
			resourceSet.getResources().clear();
		} catch (IOException e) {
			throw new IllegalStateException("Error loading ecore file at '" + ecoreURI + "'", e);
		} finally {
			resourceSetServiceObjects.ungetService(resourceSet);
		}
		Dictionary<String, Object> properties = new Hashtable<String, Object>();
		properties.put(EMFNamespaces.EMF_MODEL_NAME, dynamicPackage.getName());
		properties.put(EMFNamespaces.EMF_MODEL_NSURI, dynamicPackage.getNsURI());
		
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
