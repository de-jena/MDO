/**
 * Copyright (c) 2012 - 2023 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.ibis.apis;

import org.osgi.annotation.versioning.ProviderType;

import de.jena.ibis.ibis_gnsslocationservice.GNSSLocationData;
import org.osgi.util.pushstream.PushEventSource;

/**
 * 
 * @author ilenia
 * @since Jan 17, 2023
 */
@ProviderType
public interface IbisGNSSLocationService extends GeneralIbisUDPService {
	
	PushEventSource<GNSSLocationData> connectToGNSSLocationData();
	
}
