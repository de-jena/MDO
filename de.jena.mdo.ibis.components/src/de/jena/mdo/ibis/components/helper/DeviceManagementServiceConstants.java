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
	
//	GET Operations
	public static final String OPERATION_GET_DEVICE_INFO = "GetDeviceInfomation";
	public static final String OPERATION_GET_DEVICE_CONFIGURATION = "GetDeviceConfiguration";
	public static final String OPERATION_GET_DEVICE_STATUS = "GetDeviceSatus";
	public static final String OPERATION_GET_DEVICE_ERR_MSG = "GetDeviceErrorMessages";
	public static final String OPERATION_GET_SERVICE_INFO = "GetServiceInformation";
	public static final String OPERATION_GET_SERVICE_STATUS = "GetServiceStatus";
	public static final String OPERATION_GET_ALL_SUBDEVICE_INFO = "GetAllSubdeviceInformation";
	public static final String OPERATION_GET_DEVICE_STATUS_INFO = "GetDeviceStatusInformation";
	public static final String OPERATION_GET_ALL_SUBDEVICE_STATUS_INFO = "GetAllSubdeviceStatusInformation";
	public static final String OPERATION_GET_ALL_SUBDEVICE_ERR_MSG = "GetAllSubdevicesErrorMessages";
	
//	Subscribe/Unsubscribe Operations
	public static final String OPERATION_SUBSCRIBE_DEVICE_INFO = "SubscribeDeviceInformation";
	public static final String OPERATION_UNSUBSCRIBE_DEVICE_INFO = "UnsubscribeDeviceInformation";
	
	public static final String OPERATION_SUBSCRIBE_DEVICE_STATUS = "SubscribeDeviceStatus";
	public static final String OPERATION_UNSUBSCRIBE_DEVICE_STATUS = "UnsubscribeDeviceStatus";
	
	public static final String OPERATION_SUBSCRIBE_DEVICE_ERR_MSG = "SubscribeDeviceErrorMessages";
	public static final String OPERATION_UNSUBSCRIBE_DEVICE_ERR_MSG = "UnsubscribeDeviceErrorMessages";
	
	public static final String OPERATION_SUBSCRIBE_SERVICE_INFO = "SubscribeServiceInformation";
	public static final String OPERATION_UNSUBSCRIBE_SERVICE_INFO = "UnsubscribeServiceInformation";
	
	public static final String OPERATION_SUBSCRIBE_SERVICE_STATUS = "SubscribeServiceStatus";
	public static final String OPERATION_UNSUBSCRIBE_SERVICE_STATUS = "UnsubscribeServiceStatus";
	
	public static final String OPERATION_SUBSCRIBE_ALL_SUBDEVICE_INFO = "SubscribeAllSubdeviceInformation";
	public static final String OPERATION_UNSUBSCRIBE_ALL_SUBDEVICE_INFO = "UnsubscribeAllSubdeviceInformation";
	
	public static final String OPERATION_SUBSCRIBE_DEVICE_STATUS_INFO = "SubscribeDeviceStatusInformation";
	public static final String OPERATION_UNSUBSCRIBE_DEVICE_STATUS_INFO = "UnsubscribeDeviceStatusInformation";
	
	public static final String OPERATION_SUBSCRIBE_ALL_SUBDEVICE_STATUS_INFO = "SubscribeAllSubdeviceStatusInformation";
	public static final String OPERATION_UNSUBSCRIBE_ALL_SUBDEVICE_STATUS_INFO = "UnsubscribeAllSubdeviceStatusInformation";
	
	public static final String OPERATION_SUBSCRIBE_ALL_SUBDEVICE_ERR_MSG = "SubscribeAllSubdeviceErrorMessages";
	public static final String OPERATION_UNSUBSCRIBE_ALL_SUBDEVICE_ERR_MSG = "UnsubscribeAllSubdeviceErrorMessages";

}
