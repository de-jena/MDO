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

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.osgi.annotation.versioning.ProviderType;
import org.osgi.util.pushstream.PushEventSource;

/**
 * 
 * @author ilenia
 * @since Mar 27, 2023
 */
@ProviderType
public interface IbisDeviceConfigurator {

	List<String> getServiceNames();
	
	Integer executeTCPServiceOperation(String operation);
	
	PushEventSource<? extends EObject> executeUDPServiceOperation(String operation);
	
	Map<String, PushEventSource<? extends EObject>> getAllActiveUDPSubscriptions();
	
	Map<String, Integer> getAllActiveTCPSubscriptions();
	
}
