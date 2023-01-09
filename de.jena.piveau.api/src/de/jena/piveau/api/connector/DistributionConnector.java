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

import java.util.List;
import java.util.Map;

import org.osgi.annotation.versioning.ProviderType;

import de.jena.piveau.dcat.Dataset;
import de.jena.piveau.dcat.Distribution;

/**
 * Connector for Piveau to register distributions for a given catalogue and dataset via certain protocol.
 * @author Mark Hoffmann
 * @since 25.11.2022
 */
@ProviderType
public interface DistributionConnector {
	
	Distribution createDistribution(Distribution distribution, String datasetId);
	
	Dataset updateDistributions(List<Distribution> distributions, Dataset dataset, String datasetId, String catalogueId);
	
	boolean deleteDistribution(String distributionId);
	
	/**
	 * Returns adapter properties or an empty map
	 * @return adapter properties or an empty map
	 */
	Map<String, Object> getDistributionProperties();
	
}
