/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Data In Motion - initial API and implementation
 */
package de.jena.piveau.dcat.configuration;

import de.jena.piveau.dcat.DcatFactory;
import de.jena.piveau.dcat.DcatPackage;

import de.jena.piveau.dcat.impl.DcatPackageImpl;

import de.jena.piveau.dcat.util.DcatResourceFactoryImpl;

import java.util.Hashtable;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource.Factory;

import org.gecko.emf.osgi.configurator.EPackageConfigurator;

import org.osgi.annotation.bundle.Capability;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

import org.osgi.service.condition.Condition;
/**
 * The <b>PackageConfiguration</b> for the model.
 * The package will be registered into a OSGi base model registry.
 * 
 * @generated
 */
@Component(name = "DcatConfigurator")
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"de.jena.piveau.dcat.util.DcatResourceFactoryImpl, org.eclipse.emf.ecore.resource.Resource$Factory\"" , "uses:=\"org.eclipse.emf.ecore.resource,de.jena.piveau.dcat.util\"" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"de.jena.piveau.dcat.DcatFactory, org.eclipse.emf.ecore.EFactory\"" , "uses:=\"org.eclipse.emf.ecore,de.jena.piveau.dcat\"" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"de.jena.piveau.dcat.DcatPackage, org.eclipse.emf.ecore.EPackage\"" , "uses:=\"org.eclipse.emf.ecore,de.jena.piveau.dcat\"" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.gecko.emf.osgi.configurator.EPackageConfigurator\"" , "uses:=\"org.eclipse.emf.ecore,de.jena.piveau.dcat\"" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.osgi.service.condition.Condition\"" , "uses:=org.osgi.service.condition" })
public class DcatConfigurationComponent {
	
	private ServiceRegistration<?> packageRegistration = null;
	private ServiceRegistration<EPackageConfigurator> ePackageConfiguratorRegistration = null;
	private ServiceRegistration<?> eFactoryRegistration = null;
	private ServiceRegistration<?> conditionRegistration = null;
	private ServiceRegistration<?> resourceFactoryRegistration = null;

	/**
	 * Activates the Configuration Component.
	 *
	 * @generated
	 */
	@Activate
	public void activate(BundleContext ctx) {
		DcatPackage ePackage = DcatPackageImpl.eINSTANCE;
		
		
		DcatEPackageConfigurator packageConfigurator = registerEPackageConfiguratorService(ePackage, ctx);
		registerResourceFactoryService(ctx);
		registerEPackageService(ePackage, packageConfigurator, ctx);
		registerEFactoryService(ePackage, packageConfigurator, ctx);
		registerConditionService(packageConfigurator, ctx);
	}
	
	/**
	 * Registers the DcatEPackageConfigurator as a service.
	 *
	 * @generated
	 */
	private DcatEPackageConfigurator registerEPackageConfiguratorService(DcatPackage ePackage, BundleContext ctx){
		DcatEPackageConfigurator packageConfigurator = new DcatEPackageConfigurator(ePackage);
		// register the EPackageConfigurator
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		ePackageConfiguratorRegistration = ctx.registerService(EPackageConfigurator.class, packageConfigurator, properties);

		return packageConfigurator;
	}

	/**
	 * Registers the DcatResourceFactoryImpl as a service.
	 *
	 * @generated
	 */
	private void registerResourceFactoryService(BundleContext ctx){
		DcatResourceFactoryImpl factory = new DcatResourceFactoryImpl();
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(factory.getServiceProperties());
		String[] serviceClasses = new String[] {DcatResourceFactoryImpl.class.getName(), Factory.class.getName()};
		resourceFactoryRegistration = ctx.registerService(serviceClasses, factory, properties);
	}

	/**
	 * Registers the DcatPackage as a service.
	 *
	 * @generated
	 */
	private void registerEPackageService(DcatPackage ePackage, DcatEPackageConfigurator packageConfigurator, BundleContext ctx){
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		String[] serviceClasses = new String[] {DcatPackage.class.getName(), EPackage.class.getName()};
		packageRegistration = ctx.registerService(serviceClasses, ePackage, properties);
	}

	/**
	 * Registers the DcatFactory as a service.
	 *
	 * @generated
	 */
	private void registerEFactoryService(DcatPackage ePackage, DcatEPackageConfigurator packageConfigurator, BundleContext ctx){
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		String[] serviceClasses = new String[] {DcatFactory.class.getName(), EFactory.class.getName()};
		eFactoryRegistration = ctx.registerService(serviceClasses, ePackage.getDcatFactory(), properties);
	}

	private void registerConditionService(DcatEPackageConfigurator packageConfigurator, BundleContext ctx){
		// register the EPackage
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		properties.put(Condition.CONDITION_ID, DcatPackage.eNS_URI);
		conditionRegistration = ctx.registerService(Condition.class, Condition.INSTANCE, properties);
	}

	/**
	 * Deactivates and unregisters everything.
	 *
	 * @generated
	 */
	@Deactivate
	public void deactivate() {
		conditionRegistration.unregister();
		eFactoryRegistration.unregister();
		packageRegistration.unregister();
		resourceFactoryRegistration.unregister();

		ePackageConfiguratorRegistration.unregister();
		EPackage.Registry.INSTANCE.remove(DcatPackage.eNS_URI);
	}
}
