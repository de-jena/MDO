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
package de.jena.sensinact.piveau.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.cm.Configuration;
import org.osgi.service.cm.ConfigurationAdmin;
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

import de.jena.piveau.api.PiveauRegistry;
import de.jena.piveau.api.connector.DatasetConnector;
import de.jena.piveau.api.connector.DistributionConnector;
import de.jena.piveau.dcat.Dataset;

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
public class SensinactPiveauProviderTest {
	
	public interface Demo {
		
	}
	
	@Mock
	private Demo testDemo;
	@Mock
	private Demo toastDemo;
	@Mock
	private DatasetConnector datasetAdapter;
	@Mock
	private DistributionConnector distributionAdapter;
	
	private BundleContext ctx;
	private ServiceRegistration<Demo> testRegistration;
	private ServiceRegistration<Demo> toastRegistration;
	private ServiceRegistration<DatasetConnector> datasetConRegistration;
	private ServiceRegistration<DistributionConnector> distributionConRegistration;
	
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
		if (distributionConRegistration != null) {
			distributionConRegistration.unregister();
		}
	}
	
	@Test
	@WithFactoryConfiguration(name="test", location = "?", factoryPid = "PiveauAdapter", properties = {
			@Property(key = "distributionConnector.target", value = "(piveau.connector=TEST)"),
			@Property(key = "datasetConnector.target", value = "(piveau.connector=TEST)"),
			@Property(key = "distributionProvider.target", value = "(piveau.provider=Sensinact)"),
			@Property(key = "datasetProvider.target", value = "(piveau.provider=Sensinact)"),
			@Property(key = "tracker.dataset", value = "true"),
			@Property(key = "tracker.filter", value = "(|(osgi.jakartars.name=sensinact-rest)(osgi.jakartars.name=sensorthings))")
	})
	public void testDatasetSensorthings(@InjectService(cardinality = 0) ServiceAware<PiveauRegistry> adapterAware, @InjectService ConfigurationAdmin ca) throws InterruptedException, IOException {
		assertTrue(adapterAware.isEmpty());
		
		PromiseFactory pf = new PromiseFactory(Executors.newSingleThreadExecutor());
		// Dataset that was provided to the connector mock. It should have the right setup with correct distribution references
		AtomicReference<Dataset> updatedDatasetRef = new AtomicReference<>();
		when(datasetAdapter.createDatasetAsync(any(), anyString(), anyString())).thenAnswer(im->{
			Dataset ds = im.getArgument(0);
			return pf.resolved(ds);
		});
		when(distributionAdapter.updateDistributions(any(), any(), anyString(), anyString())).thenAnswer(im->{
			Dataset ds = im.getArgument(1);
			updatedDatasetRef.set(ds);
			return ds;
		});
		
		Configuration providerConfig = ca.getFactoryConfiguration("SensinactPiveauProvider", "sensinact", "?");
		Dictionary<String, String> props = new Hashtable<>();
		props.put("dataset.catalogueId", "demo"); 
		props.put("dataset.id", "sensinact-ds");  
		props.put("dataset.title.en", "Example Sensinact Dataset");  
		props.put("dataset.title.de", "Das ist ein Beispiel-Datenset für Sensinact"); 
		props.put("dataset.description.en", "This is an example Sensinact Dataset"); 
		props.put("dataset.description.de", "Das ist ein Beispiel-Datenset für Sensinact"); 
		props.put("dataset.issued", "NOW"); 
		props.put("dataset.distributionHost", "sensinact.test.de");
		providerConfig.update(props);
		
		PiveauRegistry registry = adapterAware.waitForService(1000l);
		assertNotNull(registry);
		
		testRegistration = ctx.registerService(Demo.class, testDemo, Dictionaries.dictionaryOf("name", "test", "Piveau", "demods"));
		toastRegistration = ctx.registerService(Demo.class, toastDemo, Dictionaries.dictionaryOf("name", "toast", "osgi.jakartars.name", "sensorthings"));
		
		Dataset dataset = registry.getActiveDataset();
		assertNotNull(dataset);
		assertEquals(2, dataset.getTitle().size());
		assertEquals(2, dataset.getDescription().size());
		assertEquals("https://sensinact.test.de/demo/sensinact-ds", dataset.getAbout());
		assertEquals(8, registry.getActiveDistributions().size());
		String testDistributionHost = registry.getActiveDistributions().get(0).getAbout();
		assertTrue(testDistributionHost.contains("sensinact.test.de"));
		assertEquals(8, dataset.getDistribution().size());
		assertEquals(8, updatedDatasetRef.get().getDistribution().size());
		assertEquals(updatedDatasetRef.get().getAbout(), dataset.getAbout());
		
		testRegistration.unregister();
		toastRegistration.unregister();
		
		dataset = registry.getActiveDataset();
		assertTrue(registry.getActiveDistributions().isEmpty());
		assertTrue(dataset.getDistribution().isEmpty());
		assertTrue(updatedDatasetRef.get().getDistribution().isEmpty());
		assertEquals(updatedDatasetRef.get().getAbout(), dataset.getAbout());
		
		verify(datasetAdapter, times(1)).createDatasetAsync(any(), anyString(), anyString());
		verify(distributionAdapter, times(2)).updateDistributions(anyList(), any(), anyString(), anyString());
	}
	
	@Test
	@WithFactoryConfiguration(name="test", location = "?", factoryPid = "PiveauAdapter", properties = {
			@Property(key = "distributionConnector.target", value = "(piveau.connector=TEST)"),
			@Property(key = "datasetConnector.target", value = "(piveau.connector=TEST)"),
			@Property(key = "distributionProvider.target", value = "(piveau.provider=Sensinact)"),
			@Property(key = "datasetProvider.target", value = "(piveau.provider=Sensinact)"),
			@Property(key = "tracker.dataset", value = "true"),
			@Property(key = "tracker.filter", value = "(|(osgi.jakartars.name=sensinact-rest)(osgi.jakartars.name=sensorthings))")
	})
	public void testDatasetRests(@InjectService(cardinality = 0) ServiceAware<PiveauRegistry> adapterAware, @InjectService ConfigurationAdmin ca) throws InterruptedException, IOException {
		assertTrue(adapterAware.isEmpty());
		
		PromiseFactory pf = new PromiseFactory(Executors.newSingleThreadExecutor());
		// Dataset that was provided to the connector mock. It should have the right setup with correct distribution references
		AtomicReference<Dataset> updatedDatasetRef = new AtomicReference<>();
		when(datasetAdapter.createDatasetAsync(any(), anyString(), anyString())).thenAnswer(im->{
			Dataset ds = im.getArgument(0);
			return pf.resolved(ds);
		});
		when(distributionAdapter.updateDistributions(any(), any(), anyString(), anyString())).thenAnswer(im->{
			Dataset ds = im.getArgument(1);
			updatedDatasetRef.set(ds);
			return ds;
		});
		
		Configuration providerConfig = ca.getFactoryConfiguration("SensinactPiveauProvider", "sensinact", "?");
		Dictionary<String, String> props = new Hashtable<>();
		props.put("dataset.catalogueId", "demo"); 
		props.put("dataset.id", "sensinact-ds");  
		props.put("dataset.title.en", "Example Sensinact Dataset");  
		props.put("dataset.title.de", "Das ist ein Beispiel-Datenset für Sensinact"); 
		props.put("dataset.description.en", "This is an example Sensinact Dataset"); 
		props.put("dataset.description.de", "Das ist ein Beispiel-Datenset für Sensinact"); 
		props.put("dataset.issued", "NOW"); 
		props.put("dataset.distributionHost", "sensinact.test.de");
		providerConfig.update(props);
		
		PiveauRegistry registry = adapterAware.waitForService(1000l);
		assertNotNull(registry);
		
		testRegistration = ctx.registerService(Demo.class, testDemo, Dictionaries.dictionaryOf("name", "test", "Piveau", "demods"));
		toastRegistration = ctx.registerService(Demo.class, toastDemo, Dictionaries.dictionaryOf("name", "toast", "osgi.jakartars.name", "sensinact-rest"));
		
		Dataset dataset = registry.getActiveDataset();
		assertNotNull(dataset);
		assertEquals(2, dataset.getTitle().size());
		assertEquals(2, dataset.getDescription().size());
		assertEquals("https://sensinact.test.de/demo/sensinact-ds", dataset.getAbout());
		assertEquals(1, registry.getActiveDistributions().size());
		String testDistributionHost = registry.getActiveDistributions().get(0).getAbout();
		assertTrue(testDistributionHost.contains("sensinact.test.de"));
		assertEquals(1, dataset.getDistribution().size());
		assertEquals(1, updatedDatasetRef.get().getDistribution().size());
		assertEquals(updatedDatasetRef.get().getAbout(), dataset.getAbout());
		
		testRegistration.unregister();
		toastRegistration.unregister();
		
		dataset = registry.getActiveDataset();
		assertTrue(registry.getActiveDistributions().isEmpty());
		assertTrue(dataset.getDistribution().isEmpty());
		assertTrue(updatedDatasetRef.get().getDistribution().isEmpty());
		assertEquals(updatedDatasetRef.get().getAbout(), dataset.getAbout());
		
		verify(datasetAdapter, times(1)).createDatasetAsync(any(), anyString(), anyString());
		verify(distributionAdapter, times(2)).updateDistributions(anyList(), any(), anyString(), anyString());
	}

}
