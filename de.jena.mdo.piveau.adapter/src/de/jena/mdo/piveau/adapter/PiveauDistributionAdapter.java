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
package de.jena.mdo.piveau.adapter;

import java.util.Map;

import org.osgi.annotation.versioning.ProviderType;

import dcat.Distribution;

/**
 * Adapter for Piveau to register distributions for a given catalogue and dataset
 * @author Mark Hoffmann
 * @since 25.11.2022
 */
@ProviderType
public interface PiveauDistributionAdapter {
	
	public static final String DISTRIBUTION_URI = "distributions";
	
	Distribution createDistribution(Map<String, Object> data, String datasetId, String catalogueId);
	
	boolean deleteDistribution(String distributionId);

}
