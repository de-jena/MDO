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
package de.jena.mdo.ibis.components.helper;

import de.jena.mdo.ibis.ibis_common.IBISIPInt;
import de.jena.mdo.ibis.ibis_common.IBISIPString;
import de.jena.mdo.ibis.ibis_common.IbisCommonPackage;
import de.jena.mdo.ibis.ibis_common.SubscribeRequest;

/**
 * 
 * @author ilenia
 * @since Mar 15, 2023
 */
public class IbisSubscriptionHelper {
	
	public static SubscribeRequest createSubscriptionRequest(IbisCommonPackage ibisCommonPackage, String clientIP, Long clientPort, String path) {
		SubscribeRequest subscriptionRequest = ibisCommonPackage.getIbisCommonFactory().createSubscribeRequest();
		
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
