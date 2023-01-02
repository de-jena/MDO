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

import java.util.Map;

import de.jena.piveau.dcat.Dataset;

/**
 * Provider who delivers properties to create a dataset model instance from
 * @author Mark Hoffmann
 * @since 12.12.2022
 */
public interface DatasetProvider {
	
	Dataset createDataset(Map<String, Object> properties);
	
	String getDatasetId();
	
	String getCatalogueId();
	
	boolean canHandleDataset(Map<String, Object> properties);

}
