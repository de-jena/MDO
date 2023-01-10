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
package de.jena.piveau.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.ArgumentMatchers.anyMap;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Dictionary;
import java.util.concurrent.Executors;

import org.eclipse.emf.ecore.EPackage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
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
import org.osgi.util.promise.PromiseFactory;

import de.jena.piveau.api.DatasetProvider;
import de.jena.piveau.api.DistributionProvider;
import de.jena.piveau.api.PiveauRegistry;
import de.jena.piveau.api.connector.DatasetConnector;
import de.jena.piveau.api.connector.DistributionConnector;
import de.jena.piveau.dcat.Dataset;
import de.jena.piveau.dcat.DcatFactory;
import de.jena.piveau.dcat.Distribution;

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
public class PiveauDSFilterDistributionRegistrationTest {

	@Mock
	private EPackage testPackage;
	@Mock
	private EPackage toastPackage;
	@Mock
	private DatasetConnector datasetAdapter;
	@Mock
	private DistributionConnector distributionAdapter;
	@Mock
	private DatasetProvider datasetProvider;
	@Mock
	private DistributionProvider distributionProvider;

	private BundleContext ctx;
	private ServiceRegistration<EPackage> testRegistration;
	private ServiceRegistration<EPackage> toastRegistration;
	private ServiceRegistration<DatasetConnector> datasetConRegistration;
	private ServiceRegistration<DatasetProvider> datasetProviderRegistration;
	private ServiceRegistration<DistributionConnector> distributionConRegistration;
	private ServiceRegistration<DistributionProvider> distributionProviderRegistration;


	@BeforeEach
	public void before(@InjectBundleContext BundleContext ctx) {
		this.ctx = ctx;
		Dictionary<String, String> props = Dictionaries.dictionaryOf("piveau.connector", "TEST");
		datasetConRegistration = ctx.registerService(DatasetConnector.class, datasetAdapter, props);
		distributionConRegistration = ctx.registerService(DistributionConnector.class, distributionAdapter, props);
	}

	@AfterEach
	public void after() {
		if (datasetConRegistration != null) {
			datasetConRegistration.unregister();
		}
		if (datasetProviderRegistration != null) {
			datasetProviderRegistration.unregister();
		}
		if (distributionConRegistration != null) {
			distributionConRegistration.unregister();
		}
		if (distributionProviderRegistration != null) {
			distributionProviderRegistration.unregister();
		}
	}

	@Test
	@WithFactoryConfiguration(name="test", location = "?", factoryPid = "PiveauAdapter", properties = {
			@Property(key = "distributionConnector.target", value = "(piveau.connector=TEST)"),
			@Property(key = "datasetConnector.target", value = "(piveau.connector=TEST)"),
			@Property(key = "distributionProvider.target", value = "(piveau.provider=TEST)"),
			@Property(key = "datasetProvider.target", value = "(piveau.provider=TEST)"),
			@Property(key = "tracker.dataset", value = "true"),
			@Property(key = "tracker.filter", value = "(test=foo)")
	})
	public void testRegisterPackageCannotHandle(@InjectService(cardinality = 0) ServiceAware<PiveauRegistry> adapterAware) throws InterruptedException {
		assertTrue(adapterAware.isEmpty());

		Dataset dataset = DcatFactory.eINSTANCE.createDataset();
		dataset.setAbout("me");
		when(datasetProvider.getCatalogueId()).thenReturn("demo");
		when(datasetProvider.getDatasetId()).thenReturn("demods");
		when(datasetProvider.canHandleDataset(anyMap())).thenReturn(Boolean.TRUE);
		when(datasetProvider.createDataset(anyMap())).thenReturn(dataset);

		PromiseFactory pf = new PromiseFactory(Executors.newSingleThreadExecutor());
		when(datasetAdapter.createDatasetAsync(any(), anyString(), anyString())).thenReturn(pf.resolved(dataset));

		Dictionary<String, String> props = Dictionaries.dictionaryOf("piveau.provider", "TEST");
		datasetProviderRegistration = ctx.registerService(DatasetProvider.class, datasetProvider, props);
		distributionProviderRegistration = ctx.registerService(DistributionProvider.class, distributionProvider, props);

		PiveauRegistry registry = adapterAware.waitForService(500l);
		assertNotNull(registry);

		// we simulate to be not able to handle this distribution
		when(distributionProvider.canHandleDistribution(any(), anyMap())).thenReturn(false);
		Distribution distribution = DcatFactory.eINSTANCE.createDistribution();
		distribution.setAbout("my-dist");

		testRegistration = ctx.registerService(EPackage.class, testPackage, Dictionaries.dictionaryOf("emf.model.name", "test", "test", "test-ds"));
		toastRegistration = ctx.registerService(EPackage.class, toastPackage, Dictionaries.dictionaryOf("emf.model.name", "toast"));

		assertTrue(registry.getActiveDistributions().isEmpty());

		testRegistration.setProperties(Dictionaries.dictionaryOf("emf.model.name", "test", "test", "foo"));

		assertTrue(registry.getActiveDistributions().isEmpty());

		testRegistration.unregister();
		toastRegistration.unregister();

		assertTrue(registry.getActiveDistributions().isEmpty());

		verify(datasetProvider, times(1)).canHandleDataset(anyMap());
		verify(datasetAdapter, times(1)).createDatasetAsync(any(), anyString(), anyString());
		verify(distributionProvider, times(1)).canHandleDistribution(any(), anyMap());
		verify(distributionAdapter, never()).updateDistributions(anyList(), any(), anyString(), anyString());
	}
	
	@Test
	@WithFactoryConfiguration(name="test", location = "?", factoryPid = "PiveauAdapter", properties = {
			@Property(key = "distributionConnector.target", value = "(piveau.connector=TEST)"),
			@Property(key = "datasetConnector.target", value = "(piveau.connector=TEST)"),
			@Property(key = "distributionProvider.target", value = "(piveau.provider=TEST)"),
			@Property(key = "datasetProvider.target", value = "(piveau.provider=TEST)"),
			@Property(key = "tracker.dataset", value = "true"),
			@Property(key = "tracker.filter", value = "(test=foo)")
	})
	public void testRegisterPackage(@InjectService(cardinality = 0) ServiceAware<PiveauRegistry> adapterAware) throws InterruptedException {
		assertTrue(adapterAware.isEmpty());
		
		Dataset dataset = DcatFactory.eINSTANCE.createDataset();
		dataset.setAbout("me");
		when(datasetProvider.getCatalogueId()).thenReturn("demo");
		when(datasetProvider.getDatasetId()).thenReturn("demods");
		when(datasetProvider.canHandleDataset(anyMap())).thenReturn(Boolean.TRUE);
		when(datasetProvider.createDataset(anyMap())).thenReturn(dataset);
		
		PromiseFactory pf = new PromiseFactory(Executors.newSingleThreadExecutor());
		when(datasetAdapter.createDatasetAsync(any(), anyString(), anyString())).thenReturn(pf.resolved(dataset));
		
		Dictionary<String, String> props = Dictionaries.dictionaryOf("piveau.provider", "TEST");
		datasetProviderRegistration = ctx.registerService(DatasetProvider.class, datasetProvider, props);
		distributionProviderRegistration = ctx.registerService(DistributionProvider.class, distributionProvider, props);
		
		PiveauRegistry registry = adapterAware.waitForService(500l);
		assertNotNull(registry);
		
		// we simulate to be not able to handle this distribution
		when(distributionProvider.canHandleDistribution(any(), anyMap())).thenReturn(false);
		Distribution distribution = DcatFactory.eINSTANCE.createDistribution();
		distribution.setAbout("my-dist");
		when(distributionProvider.createDistributions(any(), anyMap())).thenReturn(new Distribution[] {distribution});
		
		testRegistration = ctx.registerService(EPackage.class, testPackage, Dictionaries.dictionaryOf("emf.model.name", "test", "Piveau", "test-ds"));
		toastRegistration = ctx.registerService(EPackage.class, toastPackage, Dictionaries.dictionaryOf("emf.model.name", "toast"));
		
		assertTrue(registry.getActiveDistributions().isEmpty());
		
		// now we simulate to be able to handle this distribution
		when(distributionProvider.canHandleDistribution(any(), anyMap())).thenReturn(true);
		testRegistration.setProperties(Dictionaries.dictionaryOf("emf.model.name", "test", "test", "foo"));
		
		assertEquals(1, registry.getActiveDistributions().size());
		assertEquals(distribution, registry.getActiveDistributions().get(0));
		
		testRegistration.unregister();
		toastRegistration.unregister();
		
		assertTrue(registry.getActiveDistributions().isEmpty());
		
		verify(datasetProvider, times(1)).canHandleDataset(anyMap());
		verify(datasetAdapter, times(1)).createDatasetAsync(any(), anyString(), anyString());
		verify(distributionProvider, times(1)).canHandleDistribution(any(), anyMap());
		verify(distributionAdapter, times(2)).updateDistributions(anyList(), any(), anyString(), anyString());
	}
	
	/**
	 * Tests configuration with an invalid filter syntax for the tracker.filter property
	 * @param adapterAware
	 * @throws InterruptedException
	 */
	@Test
	@WithFactoryConfiguration(name="test", location = "?", factoryPid = "PiveauAdapter", properties = {
			@Property(key = "distributionConnector.target", value = "(piveau.connector=TEST)"),
			@Property(key = "datasetConnector.target", value = "(piveau.connector=TEST)"),
			@Property(key = "distributionProvider.target", value = "(piveau.provider=TEST)"),
			@Property(key = "datasetProvider.target", value = "(piveau.provider=TEST)"),
			@Property(key = "tracker.dataset", value = "true"),
			@Property(key = "tracker.filter", value = "foo")
	})
	public void testRegisterPackageInvalidFilter(@InjectService(cardinality = 0) ServiceAware<PiveauRegistry> adapterAware) throws InterruptedException {
		assertTrue(adapterAware.isEmpty());
		
		Dataset dataset = DcatFactory.eINSTANCE.createDataset();
		dataset.setAbout("me");
		when(datasetProvider.getCatalogueId()).thenReturn("demo");
		when(datasetProvider.getDatasetId()).thenReturn("demods");
		
		Dictionary<String, String> props = Dictionaries.dictionaryOf("piveau.provider", "TEST");
		datasetProviderRegistration = ctx.registerService(DatasetProvider.class, datasetProvider, props);
		distributionProviderRegistration = ctx.registerService(DistributionProvider.class, distributionProvider, props);
		
		PiveauRegistry registry = adapterAware.waitForService(500l);
		assertNull(registry);
		
	}
	
	@Test
	@WithFactoryConfiguration(name="test", location = "?", factoryPid = "PiveauAdapter", properties = {
			@Property(key = "distributionConnector.target", value = "(piveau.connector=TEST)"),
			@Property(key = "datasetConnector.target", value = "(piveau.connector=TEST)"),
			@Property(key = "distributionProvider.target", value = "(piveau.provider=TEST)"),
			@Property(key = "datasetProvider.target", value = "(piveau.provider=TEST)"),
			@Property(key = "tracker.dataset", value = "true"),
			@Property(key = "tracker.filter", value = "(test=foo)")
	})
	public void testRegisterPackageWrongFilter(@InjectService(cardinality = 0) ServiceAware<PiveauRegistry> adapterAware) throws InterruptedException {
		assertTrue(adapterAware.isEmpty());
		
		Dataset dataset = DcatFactory.eINSTANCE.createDataset();
		dataset.setAbout("me");
		when(datasetProvider.getCatalogueId()).thenReturn("demo");
		when(datasetProvider.getDatasetId()).thenReturn("demods");
		when(datasetProvider.canHandleDataset(anyMap())).thenReturn(Boolean.TRUE);
		when(datasetProvider.createDataset(anyMap())).thenReturn(dataset);
		
		PromiseFactory pf = new PromiseFactory(Executors.newSingleThreadExecutor());
		when(datasetAdapter.createDatasetAsync(any(), anyString(), anyString())).thenReturn(pf.resolved(dataset));
		
		Dictionary<String, String> props = Dictionaries.dictionaryOf("piveau.provider", "TEST");
		datasetProviderRegistration = ctx.registerService(DatasetProvider.class, datasetProvider, props);
		distributionProviderRegistration = ctx.registerService(DistributionProvider.class, distributionProvider, props);
		
		PiveauRegistry registry = adapterAware.waitForService(500l);
		assertNotNull(registry);
		
		// we simulate to be not able to handle this distribution
		Distribution distribution = DcatFactory.eINSTANCE.createDistribution();
		distribution.setAbout("my-dist");
		
		testRegistration = ctx.registerService(EPackage.class, testPackage, Dictionaries.dictionaryOf("emf.model.name", "test", "Piveau", "test-ds"));
		toastRegistration = ctx.registerService(EPackage.class, toastPackage, Dictionaries.dictionaryOf("emf.model.name", "toast"));
		
		assertTrue(registry.getActiveDistributions().isEmpty());
		
		// now we simulate to be able to handle this distribution
		testRegistration.setProperties(Dictionaries.dictionaryOf("emf.model.name", "test", "Piveau", "demods"));
		
		assertTrue(registry.getActiveDistributions().isEmpty());
		
		testRegistration.unregister();
		toastRegistration.unregister();
		
		assertTrue(registry.getActiveDistributions().isEmpty());
		
		verify(datasetProvider, times(1)).canHandleDataset(anyMap());
		verify(datasetAdapter, times(1)).createDatasetAsync(any(), anyString(), anyString());
		verify(distributionProvider, never()).canHandleDistribution(any(), anyMap());
		verify(distributionAdapter, never()).updateDistributions(anyList(), any(), anyString(), anyString());
	}
	
	@Test
	@WithFactoryConfiguration(name="test", location = "?", factoryPid = "PiveauAdapter", properties = {
			@Property(key = "distributionConnector.target", value = "(piveau.connector=TEST)"),
			@Property(key = "datasetConnector.target", value = "(piveau.connector=TEST)"),
			@Property(key = "distributionProvider.target", value = "(piveau.provider=TEST)"),
			@Property(key = "datasetProvider.target", value = "(piveau.provider=TEST)"),
			@Property(key = "tracker.dataset", value = "true"),
			@Property(key = "tracker.filter", value = "(test=foo)")
	})
	public void testRegisterPackageMany(@InjectService(cardinality = 0) ServiceAware<PiveauRegistry> adapterAware) throws InterruptedException {
		assertTrue(adapterAware.isEmpty());
		
		Dataset dataset = DcatFactory.eINSTANCE.createDataset();
		dataset.setAbout("me");
		when(datasetProvider.getCatalogueId()).thenReturn("demo");
		when(datasetProvider.getDatasetId()).thenReturn("demods");
		when(datasetProvider.canHandleDataset(anyMap())).thenReturn(Boolean.TRUE);
		when(datasetProvider.createDataset(anyMap())).thenReturn(dataset);
		
		PromiseFactory pf = new PromiseFactory(Executors.newSingleThreadExecutor());
		when(datasetAdapter.createDatasetAsync(any(), anyString(), anyString())).thenReturn(pf.resolved(dataset));
		
		Dictionary<String, String> props = Dictionaries.dictionaryOf("piveau.provider", "TEST");
		datasetProviderRegistration = ctx.registerService(DatasetProvider.class, datasetProvider, props);
		distributionProviderRegistration = ctx.registerService(DistributionProvider.class, distributionProvider, props);
		
		PiveauRegistry registry = adapterAware.waitForService(500l);
		assertNotNull(registry);
		
		// we simulate to be not able to handle this distribution
		when(distributionProvider.canHandleDistribution(any(), anyMap())).thenReturn(true);
		Distribution distribution01 = DcatFactory.eINSTANCE.createDistribution();
		distribution01.setAbout("my-dist-one");
		Distribution distribution02 = DcatFactory.eINSTANCE.createDistribution();
		distribution02.setAbout("my-dist-two");
		when(distributionProvider.createDistributions(any(), anyMap())).thenReturn(new Distribution[] {distribution01, distribution02});
		
		testRegistration = ctx.registerService(EPackage.class, testPackage, Dictionaries.dictionaryOf("emf.model.name", "test", "Piveau", "demods"));
		toastRegistration = ctx.registerService(EPackage.class, toastPackage, Dictionaries.dictionaryOf("emf.model.name", "toast", "test", "foo"));
		
		assertEquals(2, registry.getActiveDistributions().size());
		assertEquals(distribution01, registry.getActiveDistributions().get(0));
		assertEquals(distribution02, registry.getActiveDistributions().get(1));
		
		testRegistration.unregister();
		toastRegistration.unregister();
		
		assertTrue(registry.getActiveDistributions().isEmpty());
		
		verify(datasetProvider, times(1)).canHandleDataset(anyMap());
		verify(datasetAdapter, times(1)).createDatasetAsync(any(), anyString(), anyString());
		verify(distributionProvider, times(1)).canHandleDistribution(any(), anyMap());
		verify(distributionAdapter, times(2)).updateDistributions(anyList(), any(), anyString(), anyString());
	}

	@Test
	@WithFactoryConfiguration(name="test", location = "?", factoryPid = "PiveauAdapter", properties = {
			@Property(key = "distributionConnector.target", value = "(piveau.connector=TEST)"),
			@Property(key = "datasetConnector.target", value = "(piveau.connector=TEST)"),
			@Property(key = "distributionProvider.target", value = "(piveau.provider=TEST)"),
			@Property(key = "datasetProvider.target", value = "(piveau.provider=TEST)"),
			@Property(key = "tracker.dataset", value = "true")
	})
	public void testRegisterPackageWrongDataset(@InjectService(cardinality = 0) ServiceAware<PiveauRegistry> adapterAware) throws InterruptedException {
		assertTrue(adapterAware.isEmpty());

		Dataset dataset = DcatFactory.eINSTANCE.createDataset();
		dataset.setAbout("me");
		when(datasetProvider.getCatalogueId()).thenReturn("demo");
		when(datasetProvider.getDatasetId()).thenReturn("demods");
		when(datasetProvider.canHandleDataset(anyMap())).thenReturn(Boolean.TRUE);
		when(datasetProvider.createDataset(anyMap())).thenReturn(dataset);

		PromiseFactory pf = new PromiseFactory(Executors.newSingleThreadExecutor());
		when(datasetAdapter.createDatasetAsync(any(), anyString(), anyString())).thenReturn(pf.resolved(dataset));

		Dictionary<String, String> props = Dictionaries.dictionaryOf("piveau.provider", "TEST");
		datasetProviderRegistration = ctx.registerService(DatasetProvider.class, datasetProvider, props);
		distributionProviderRegistration = ctx.registerService(DistributionProvider.class, distributionProvider, props);

		PiveauRegistry registry = adapterAware.waitForService(500l);
		assertNotNull(registry);

		testRegistration = ctx.registerService(EPackage.class, testPackage, Dictionaries.dictionaryOf("emf.model.name", "test", "Piveau", "test-ds"));
		toastRegistration = ctx.registerService(EPackage.class, toastPackage, Dictionaries.dictionaryOf("emf.model.name", "toast"));

		assertTrue(registry.getActiveDistributions().isEmpty());

		testRegistration.setProperties(Dictionaries.dictionaryOf("emf.model.name", "test", "Piveau", "demo-dataset"));

		assertTrue(registry.getActiveDistributions().isEmpty());

		testRegistration.unregister();
		toastRegistration.unregister();

		assertTrue(registry.getActiveDistributions().isEmpty());

		verify(datasetProvider, times(1)).canHandleDataset(anyMap());
		verify(datasetAdapter, times(1)).createDatasetAsync(any(), anyString(), anyString());
		verify(distributionProvider, never()).canHandleDistribution(any(), anyMap());
		verify(distributionAdapter, never()).updateDistributions(anyList(), any(), anyString(), anyString());
	}

}
