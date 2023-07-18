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
package de.jena.piveau.api;

import java.util.List;

import de.jena.piveau.dcat.Dataset;
import de.jena.piveau.dcat.Distribution;

/**
 * 
 * @author mark
 * @since 08.12.2022
 */
public interface PiveauRegistry {
	
	public static final String PROP_LOCAL_BASE_URI = "piveau.adapter.localBaseUri";
	
	/**
	 * Returns the activeDistributions.
	 * @return the activeDistributions
	 */
	public List<Distribution> getActiveDistributions();
	
	public Dataset getActiveDataset();
	
	public String getCatalogueId();
	
	public String getDatasetId();

}
