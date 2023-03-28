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
package de.jena.ibis.components.helper;

import de.jena.ibis.ibis_common.GeneralSubscribeRequest;
import de.jena.ibis.ibis_common.IBISIPInt;
import de.jena.ibis.ibis_common.IBISIPString;
import de.jena.ibis.ibis_common.IbisCommonPackage;

/**
 * 
 * @author ilenia
 * @since Mar 15, 2023
 */
public class IbisSubscriptionHelper {
	
	public static GeneralSubscribeRequest createSubscriptionRequest(IbisCommonPackage ibisCommonPackage, String clientIP, Long clientPort, String path) {
		GeneralSubscribeRequest subscriptionRequest = ibisCommonPackage.getIbisCommonFactory().createGeneralSubscribeRequest();
		
		IBISIPString ibisClientIP = ibisCommonPackage.getIbisCommonFactory().createIBISIPString();
		ibisClientIP.setValue(clientIP);
		
		IBISIPInt ibisClientPort = ibisCommonPackage.getIbisCommonFactory().createIBISIPInt();
		ibisClientPort.setValue((int)(long)clientPort);
		
		IBISIPString ibisClientPath = ibisCommonPackage.getIbisCommonFactory().createIBISIPString();
		ibisClientPath.setValue(path);
		
		subscriptionRequest.setClientIPAddress(ibisClientIP);
		subscriptionRequest.setReplyPort(ibisClientPort);
		subscriptionRequest.setReplyPath(ibisClientPath);
		
		return subscriptionRequest;
	}
}
