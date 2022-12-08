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

import java.util.List;
import java.util.Map;

/**
 * 
 * @author mark
 * @since 08.12.2022
 */
public interface PiveauRegistry {
	
	
	/**
	 * Returns the activeDistributions.
	 * @return the activeDistributions
	 */
	public List<String> getActiveDistributions();
	
	/**
	 * Returns the activePackages.
	 * @return the activePackages
	 */
	public Map<String, String> getActivePackages();

}
