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
package de.jena.piveau.api.connector;

import java.util.Map;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.util.promise.Promise;

import de.jena.piveau.dcat.Dataset;

/**
 * Connector for Piveau to register distributions or/and data sets for a given catalogue via certain protocol.
 * @author Mark Hoffmann
 * @since 25.11.2022
 */
@ProviderType
public interface DatasetConnector {
	
	public static final String DATASET_INDEX_URI = "indexdataset";
	
	Dataset createDataset(Dataset dataset, String datasetId, String catalogueId);
	
	Promise<Dataset> createDatasetAsync(Dataset dataset, String datasetId, String catalogueId);
	
	boolean deleteDataset(String datasetId, String catalogueId);
	
	Promise<Boolean> deleteDatasetAsync(String datasetId, String catalogueId);

	
	/**
	 * Returns adapter properties or an empty map
	 * @return adapter properties or an empty map
	 */
	Map<String, Object> getDatasetProperties();
}
