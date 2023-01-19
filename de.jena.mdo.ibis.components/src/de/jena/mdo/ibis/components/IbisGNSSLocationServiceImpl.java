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
package de.jena.mdo.ibis.components;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;

import de.jena.mdo.ibis.apis.IbisGNSSLocationService;
import de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure;

/**
 * 
 * @author ilenia
 * @since Jan 18, 2023
 */
@Component(name = "IbisGNSSLocationService", scope = ServiceScope.PROTOTYPE)
public class IbisGNSSLocationServiceImpl implements IbisGNSSLocationService {

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisGNSSLocationService#getGNSSLocationData()
	 */
	@Override
	public GNSSLocationServiceDataStructure getGNSSLocationData() {
		// TODO Auto-generated method stub
		return null;
	}

}
