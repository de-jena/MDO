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

/**
 * 
 * @author ilenia
 * @since Jan 25, 2023
 */
public interface DeviceManagementServiceConstants {
	
	public static final String SERVICE_NAME = "DeviceManagementService";
	
	public static final String OPERATION_GET_DEVICE_INFO = "GetDeviceInfomation";
	public static final String OPERATION_SUBSCRIBE_DEVICE_INFO = "SubscribeDeviceInformation";
	public static final String OPERATION_UNSUBSCRIBE_DEVICE_INFO = "UnsubscribeDeviceInformation";

//	TODO: add other operations when needed
}
