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

import de.jena.ibis.ibis_common.GeneralResponse;

/**
 * 
 * @author ilenia
 * @since Mar 27, 2023
 */
public interface GeneralIbisTCPService {
		
	GeneralResponse executeGetOperation(String operation);
	
	Integer executeSubscriptionOperation(String operation);
	
}
