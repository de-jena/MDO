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
package de.jena.piveau.rest.demo;

import java.util.Collections;
import java.util.concurrent.Executors;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Reference;
import org.osgi.util.promise.Promise;
import org.osgi.util.promise.PromiseFactory;

import de.jena.piveau.api.RDFHelper;
import de.jena.piveau.api.config.DatasetConfig;
import de.jena.piveau.api.connector.DatasetConnector;
import de.jena.piveau.dcat.Dataset;
import de.jena.piveau.dcat.DcatFactory;
import de.jena.piveau.dcat.Distribution;

/**
 * MDO Implementation to provide Distribution instances
 * @author Mark Hoffmann
 * @since 12.12.2022
 */
@Component(name = "DemoPiveauProvider", configurationPolicy = ConfigurationPolicy.REQUIRE)
public class DemoPiveauProvider {

	private DatasetConfig datasetConfig;

	@Reference
	private DatasetConnector connector;

	@Activate
	public void activate(DatasetConfig config, ComponentContext ctx) {
		this.datasetConfig = config;
		System.out.println("Activate " + config.id());
		Promise<Dataset> dsp = new PromiseFactory(Executors.newSingleThreadExecutor()).resolved(RDFHelper.createDataset(datasetConfig));
		dsp.delay(10000).map(dataset->{
			try {
				System.out.println("Create Dataset " + dataset.getAbout());
				return connector.createDataset(dataset, datasetConfig.id(), datasetConfig.catalogueId());
			} finally {
				System.out.println("Created Dataset " + dataset.getAbout());
			}
		}).delay(10000).map(dataset->{
			try {
				System.out.println("Update Dataset " + dataset.getAbout());
				Dataset ds = EcoreUtil.copy(dataset);
				Distribution dist = DcatFactory.eINSTANCE.createDistribution();
				dist.setAbout("my-fancy-distribution");
				ds = RDFHelper.appendDistributions(ds, Collections.singletonList(dist));
				connector.createDataset(ds, datasetConfig.id(), datasetConfig.catalogueId());
				return dataset;
			} finally {
				System.out.println("Updated Dataset " + dataset.getAbout());
			}
		}).delay(10000).map(dataset->{
			try {
				System.out.println("Update Dataset again " + dataset.getAbout());
				return connector.createDataset(dataset, datasetConfig.id(), datasetConfig.catalogueId());
			} finally {
				System.out.println("Updated Dataset again " + dataset.getAbout());
			}
		})
		.delay(10000).map(dataset->{
			boolean deleted = false;
			try {
				System.out.println("Delete Dataset " + deleted + " " + dataset.getAbout());
				deleted = connector.deleteDataset(datasetConfig.id(), datasetConfig.catalogueId());
				return deleted;
			} finally {
				System.out.println("Deleted Dataset " + deleted + " " + dataset.getAbout());
			}
		});

	}

	//	public Distribution[] createDistributions(Object object, Map<String, Object> properties) {
	//		Map<String, Object> distributionMap = new HashMap<>();
	//		if (!datasetConfig.catalogueId().isEmpty()) {
	//			distributionMap.put("distribution.catalogueId", datasetConfig.catalogueId());
	//		}
	//		if (!datasetConfig.distributionHost().isEmpty()) {
	//			distributionMap.put("distribution.distributionHost", datasetConfig.distributionHost());
	//		}
	//		String modelName = properties.getOrDefault("emf.model.name", "<none>").toString();
	//		updateEPackageInformation(modelName, distributionMap);
	//		return updateEndpointInformation(distributionMap, modelName, properties);
	//		
	//	}

}
