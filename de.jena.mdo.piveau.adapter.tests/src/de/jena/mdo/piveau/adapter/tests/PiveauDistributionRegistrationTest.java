/**
 * Copyright (c) 2012 - 2022 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.mdo.piveau.adapter.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.eclipse.emf.ecore.EPackage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.test.common.annotation.InjectBundleContext;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.common.annotation.Property;
import org.osgi.test.common.annotation.config.WithFactoryConfiguration;
import org.osgi.test.common.dictionary.Dictionaries;
import org.osgi.test.common.service.ServiceAware;
import org.osgi.test.junit5.cm.ConfigurationExtension;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

import de.jena.mdo.piveau.adapter.PiveauRegistry;

//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;

/**
 * See documentation here: 
 * 	https://github.com/osgi/osgi-test
 * 	https://github.com/osgi/osgi-test/wiki
 * Examples: https://github.com/osgi/osgi-test/tree/main/examples
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
@ExtendWith(ConfigurationExtension.class)
@ExtendWith(MockitoExtension.class)
public class PiveauDistributionRegistrationTest {
	
	@Mock
	private EPackage testPackage;
	@Mock
	private EPackage toastPackage;
	
	private BundleContext ctx;
	private ServiceRegistration<EPackage> testRegistration;
	private ServiceRegistration<EPackage> toastRegistration;
	

	@BeforeEach
	public void before(@InjectBundleContext BundleContext ctx) {
		this.ctx = ctx;
		Mockito.lenient().when(testPackage.getName()).thenReturn("test");
		Mockito.lenient().when(testPackage.getNsURI()).thenReturn("http://test");
		
		Mockito.lenient().when(toastPackage.getName()).thenReturn("toast");
		Mockito.lenient().when(toastPackage.getNsURI()).thenReturn("http://toast");
		
	}
	
	@AfterEach
	public void after() {
	}
	
	@Test
	@WithFactoryConfiguration(name="test", location = "?", factoryPid = "PiveauConnector", properties = {
			@Property(key = "base.uri", value = "http://localhost:8081"),
			@Property(key = "datasetSegment", value = "datasets"),
			@Property(key = "catalogueId", value = "demo"),
			@Property(key = "datasetId", value = "demo-dataset"),
			@Property(key = "dataset.title.en", value = "Example Dataset 1"),
			@Property(key = "dataset.title.de", value = "Beispiel Dataset 1"),
			@Property(key = "dataset.description.en", value = "This is an example Dataset"),
			@Property(key = "dataset.description.de", value = "Das ist ein Beispiel-Dataset"),
			@Property(key = "dataset.issued", value = "NOW"),
			@Property(key = "dataset.distributionHost", value = "mdo.jena.de")
	})
	public void testPackageOnly(@InjectService(timeout = 500) ServiceAware<PiveauRegistry> adapterAware) throws InterruptedException {
		assertFalse(adapterAware.isEmpty());
		PiveauRegistry registry = adapterAware.getService();
		assertTrue(registry.getActivePackages().isEmpty());
		assertTrue(registry.getActiveDistributions().isEmpty());
		
		testRegistration = ctx.registerService(EPackage.class, testPackage, Dictionaries.dictionaryOf("emf.model.name", "test", "Piveau", "demo-dataset"));
		toastRegistration = ctx.registerService(EPackage.class, toastPackage, Dictionaries.dictionaryOf("emf.model.name", "toast"));
		
		assertEquals(1, registry.getActivePackages().size());
		assertTrue(registry.getActivePackages().containsKey("test"));
		assertTrue(registry.getActiveDistributions().isEmpty());
		
		testRegistration.unregister();
		toastRegistration.unregister();
		
		assertTrue(registry.getActivePackages().isEmpty());
		assertTrue(registry.getActiveDistributions().isEmpty());
	}
	
	@Test
	@WithFactoryConfiguration(name="test", location = "?", factoryPid = "PiveauConnector", properties = {
			@Property(key = "base.uri", value = "http://localhost:8081"),
			@Property(key = "datasetSegment", value = "datasets"),
			@Property(key = "catalogueId", value = "demo"),
			@Property(key = "datasetId", value = "demo-dataset"),
			@Property(key = "dataset.title.en", value = "Example Dataset 1"),
			@Property(key = "dataset.title.de", value = "Beispiel Dataset 1"),
			@Property(key = "dataset.description.en", value = "This is an example Dataset"),
			@Property(key = "dataset.description.de", value = "Das ist ein Beispiel-Dataset"),
			@Property(key = "dataset.issued", value = "NOW"),
			@Property(key = "dataset.distributionHost", value = "mdo.jena.de")
	})
	public void testWrongDataset(@InjectService(timeout = 500) ServiceAware<PiveauRegistry> adapterAware) throws InterruptedException {
		assertFalse(adapterAware.isEmpty());
		PiveauRegistry registry = adapterAware.getService();
		assertTrue(registry.getActivePackages().isEmpty());
		assertTrue(registry.getActiveDistributions().isEmpty());
		
		testRegistration = ctx.registerService(EPackage.class, testPackage, Dictionaries.dictionaryOf("emf.model.name", "test", "Piveau", "test-dataset"));
		toastRegistration = ctx.registerService(EPackage.class, toastPackage, Dictionaries.dictionaryOf("emf.model.name", "toast"));
		
		assertTrue(registry.getActivePackages().isEmpty());
		assertTrue(registry.getActiveDistributions().isEmpty());
		
		testRegistration.unregister();
		toastRegistration.unregister();
		
		assertTrue(registry.getActivePackages().isEmpty());
		assertTrue(registry.getActiveDistributions().isEmpty());
	}
	
	@Test
	@WithFactoryConfiguration(name="test", location = "?", factoryPid = "PiveauConnector", properties = {
			@Property(key = "base.uri", value = "http://localhost:8081"),
			@Property(key = "datasetSegment", value = "datasets"),
			@Property(key = "catalogueId", value = "demo"),
			@Property(key = "datasetId", value = "demo-dataset"),
			@Property(key = "dataset.title.en", value = "Example Dataset 1"),
			@Property(key = "dataset.title.de", value = "Beispiel Dataset 1"),
			@Property(key = "dataset.description.en", value = "This is an example Dataset"),
			@Property(key = "dataset.description.de", value = "Das ist ein Beispiel-Dataset"),
			@Property(key = "dataset.issued", value = "NOW"),
			@Property(key = "dataset.distributionHost", value = "mdo.jena.de")
	})
	public void testChangeWrongDataset(@InjectService(timeout = 500) ServiceAware<PiveauRegistry> adapterAware) throws InterruptedException {
		assertFalse(adapterAware.isEmpty());
		PiveauRegistry registry = adapterAware.getService();
		assertTrue(registry.getActivePackages().isEmpty());
		assertTrue(registry.getActiveDistributions().isEmpty());
		
		testRegistration = ctx.registerService(EPackage.class, testPackage, Dictionaries.dictionaryOf("emf.model.name", "test", "Piveau", "test-dataset"));
		toastRegistration = ctx.registerService(EPackage.class, toastPackage, Dictionaries.dictionaryOf("emf.model.name", "toast"));
		
		assertTrue(registry.getActivePackages().isEmpty());
		assertTrue(registry.getActiveDistributions().isEmpty());
		
		testRegistration.setProperties(Dictionaries.dictionaryOf("emf.model.name", "test", "Piveau", "demo-dataset"));
		
		assertEquals(1, registry.getActivePackages().size());
		assertTrue(registry.getActivePackages().containsKey("test"));
		assertTrue(registry.getActiveDistributions().isEmpty());
		
		testRegistration.unregister();
		toastRegistration.unregister();
		
		assertTrue(registry.getActivePackages().isEmpty());
		assertTrue(registry.getActiveDistributions().isEmpty());
	}
	
	@Test
	@WithFactoryConfiguration(name="test", location = "?", factoryPid = "PiveauConnector", properties = {
			@Property(key = "base.uri", value = "http://localhost:8081"),
			@Property(key = "datasetSegment", value = "datasets"),
			@Property(key = "catalogueId", value = "demo"),
			@Property(key = "datasetId", value = "demo-dataset"),
			@Property(key = "dataset.title.en", value = "Example Dataset 1"),
			@Property(key = "dataset.title.de", value = "Beispiel Dataset 1"),
			@Property(key = "dataset.description.en", value = "This is an example Dataset"),
			@Property(key = "dataset.description.de", value = "Das ist ein Beispiel-Dataset"),
			@Property(key = "dataset.issued", value = "NOW"),
			@Property(key = "dataset.distributionHost", value = "mdo.jena.de")
	})
	public void testPackageAndResource(@InjectService(timeout = 500) ServiceAware<PiveauRegistry> adapterAware) throws InterruptedException {
		assertFalse(adapterAware.isEmpty());
		PiveauRegistry registry = adapterAware.getService();
		assertTrue(registry.getActivePackages().isEmpty());
		assertTrue(registry.getActiveDistributions().isEmpty());
		
		testRegistration = ctx.registerService(EPackage.class, testPackage, Dictionaries.dictionaryOf("emf.model.name", "test", "Piveau", "demo-dataset"));
		toastRegistration = ctx.registerService(EPackage.class, toastPackage, Dictionaries.dictionaryOf("emf.model.name", "toast"));
		ServiceRegistration<String> resourceRegistration = ctx.registerService(String.class, "Test", Dictionaries.dictionaryOf("emf.model.name", "test", "Piveau", "demo-dataset", "osgi.jaxrs.resource", "true"));
		
		assertEquals(1, registry.getActivePackages().size());
		assertTrue(registry.getActivePackages().containsKey("test"));
		assertEquals(1, registry.getActiveDistributions().size());
		
		testRegistration.unregister();
		toastRegistration.unregister();
		resourceRegistration.unregister();
		
		assertTrue(registry.getActivePackages().isEmpty());
		assertTrue(registry.getActiveDistributions().isEmpty());
	}

}
