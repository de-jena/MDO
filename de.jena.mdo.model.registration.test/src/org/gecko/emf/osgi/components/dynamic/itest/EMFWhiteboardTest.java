/**
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
package org.gecko.emf.osgi.components.dynamic.itest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.ecore.EPackage;
import org.gecko.emf.osgi.ResourceSetFactory;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.osgi.framework.BundleContext;
import org.osgi.service.cm.Configuration;
import org.osgi.service.cm.ConfigurationAdmin;
import org.osgi.test.common.annotation.InjectBundleContext;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.common.annotation.Property;
import org.osgi.test.common.annotation.config.WithFactoryConfiguration;
import org.osgi.test.common.service.ServiceAware;
import org.osgi.test.junit5.cm.ConfigurationExtension;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

/**
 * 
 * @author Juergen Albert
 * @since 16.03.2022
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
@ExtendWith(ConfigurationExtension.class)
public class EMFWhiteboardTest {

	@InjectBundleContext
	BundleContext bc;

	
	/**
	 * Trying to load an instance with a non registered {@link EPackage}
	 * 
	 * @throws IOException
	 * @throws InterruptedException 
	 */
	@Test
	@WithFactoryConfiguration(factoryPid = "DynamicPackageLoader", name = "something", location = "?",  properties = @Property(key = "url", value = "https://raw.githubusercontent.com/de-jena/5g-models/main/models/dim_device/device.ecore" ))
	public void testDynamicEPackageLoad(
			@InjectService(cardinality = 0) ServiceAware<ResourceSetFactory> sa,
			@InjectService(timeout = 2000, cardinality = 0) ServiceAware<EPackage> ePackages
			) throws IOException, InterruptedException {
//		List<EPackage> services = ePackages.getServices();
//		Assertions.assertThat(services).isNotEmpty();
//		services.forEach(p -> System.out.println(p.getName() + " " + p.getNsURI()));
		EPackage ePackage = ePackages.waitForService(500);
		assertNotNull(ePackage);
		
		System.out.println("Found Package " + ePackage.getName());
	}

	/**
	 * Trying to load an instance with a non registered {@link EPackage}
	 * 
	 * @throws IOException
	 * @throws InterruptedException 
	 */
	@Test
	@WithFactoryConfiguration(factoryPid = "DynamicPackageLoader", name = "something", location = "?",  properties = {
			@Property(key = "url", value = "https://raw.githubusercontent.com/de-jena/5g-models/main/models/dim_device/device.ecore" ),
			@Property(key = "additional.test", value = "true" )
	})
	public void testDynamicEPackageLoadWithAdditionalProps(
			@InjectService(cardinality = 0) ServiceAware<ResourceSetFactory> sa,
			@InjectService(timeout = 2000, cardinality = 0, filter = "(test=true)") ServiceAware<EPackage> ePackages
			) throws IOException, InterruptedException {
//		List<EPackage> services = ePackages.getServices();
//		Assertions.assertThat(services).isNotEmpty();
//		services.forEach(p -> System.out.println(p.getName() + " " + p.getNsURI()));
		EPackage ePackage = ePackages.waitForService(500);
		assertNotNull(ePackage);
		System.out.println("Found Package " + ePackage.getName());
	}

//	@Test
	public void testDynamicEPackageLoadManual(
			@InjectService(cardinality = 0) ServiceAware<ResourceSetFactory> sa,
			@InjectService(cardinality = 0) ServiceAware<EPackage> ePackages,
			@InjectService ConfigurationAdmin ca
			) throws IOException, InterruptedException {
//		Configuration configuration = ca.createFactoryConfiguration("DynamicPackageLoader~test", "?");
//		configuration.update(Dictionaries.dictionaryOf("url", "https://raw.githubusercontent.com/de-jena/5g-models/main/models/dim_device/device.ecore"));
//		List<EPackage> services = ePackages.getServices();
//		Assertions.assertThat(services).isNotEmpty();
//		services.forEach(p -> System.out.println(p.getName() + " " + p.getNsURI()));
		Configuration configuration = ca.createFactoryConfiguration("DynamicPackageLoader");
		Dictionary<String, String> props = new Hashtable<>();
		props.put("url", "test2");
		configuration.update(props);
		
		CountDownLatch latch = new CountDownLatch(1);
		latch.await(2, TimeUnit.SECONDS);
	}


}