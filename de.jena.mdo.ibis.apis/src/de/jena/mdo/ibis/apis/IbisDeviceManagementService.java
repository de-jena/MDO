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
package de.jena.mdo.ibis.apis;

import de.jena.mdo.ibis.common.DataAcceptedResponseStructure;
import de.jena.mdo.ibis.common.SubscribeRequestStructure;
import de.jena.mdo.ibis.common.SubscribeResponseStructure;
import de.jena.mdo.ibis.common.UnsubscribeRequestStructure;
import de.jena.mdo.ibis.common.UnsubscribeResponseStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceFinalizeUpdateRequestStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceFinalizeUpdateResponseStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceInformationResponseStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceConfigurationResponseStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceErrorMessagesResponseStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceInformationResponseStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceStatusInformationResponseStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceStatusResponseStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetServiceInformationResponseStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetServiceStatusResponseStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetUpdateHistoryResponseStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceInstallUpdateRequestStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceInstallUpdateResponseStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceRetrieveUpdateStateRequestStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceRetrieveUpdateStateResponseStructure;

/**
 * 
 * @author ilenia
 * @since Jan 18, 2023
 */
public interface IbisDeviceManagementService {
	
//	GET Operations
	DeviceManagementServiceGetDeviceInformationResponseStructure getDeviceInformation();
	
	DeviceManagementServiceGetDeviceConfigurationResponseStructure getDeviceConfiguration();
	
	DeviceManagementServiceGetDeviceStatusResponseStructure getDeviceStatus();
	
	DeviceManagementServiceGetDeviceErrorMessagesResponseStructure getDeviceErrorMessages();
	
	DeviceManagementServiceGetServiceInformationResponseStructure getServiceInformation();
	
	DeviceManagementServiceGetServiceStatusResponseStructure getServiceStatus();
	
	DeviceManagementServiceGetAllSubdeviceInformationResponseStructure getAllSubdeviceInformation();
	
	DeviceManagementServiceGetDeviceStatusInformationResponseStructure getDeviceStatusInformation();
	
	DeviceManagementServiceGetAllSubdeviceInformationResponseStructure getAllSubdeviceStatusInformation();
	
	DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure getAllSubdeviceErrorMessages();
		
	
//	SUBSCRIBE/UNSUBSCRIBE Operations
	SubscribeResponseStructure subscribeDeviceInformation(SubscribeRequestStructure subscribeRequestStructure);
	
	UnsubscribeResponseStructure unsubscribeDeviceInformation(UnsubscribeRequestStructure unsubscribeRequestStructure);
	
	SubscribeResponseStructure subscribeDeviceStatus(SubscribeRequestStructure subscribeRequestStructure);
	
	UnsubscribeResponseStructure unsubscribeDeviceStatus(UnsubscribeRequestStructure unsubscribeRequestStructure);
	
	SubscribeResponseStructure subscribeDeviceErrorMessages(SubscribeRequestStructure subscribeRequestStructure);
	
	UnsubscribeResponseStructure unsubscribeDeviceErrorMessages(UnsubscribeRequestStructure unsubscribeRequestStructure);
	
	SubscribeResponseStructure subscribeServiceInformation(SubscribeRequestStructure subscribeRequestStructure);
	
	UnsubscribeResponseStructure unsubscribeServiceInformation(UnsubscribeRequestStructure unsubscribeRequestStructure);
	
	SubscribeResponseStructure subscribeServiceStatus(SubscribeRequestStructure subscribeRequestStructure);
	
	UnsubscribeResponseStructure unsubscribeServiceStatus(UnsubscribeRequestStructure unsubscribeRequestStructure);
	
	SubscribeResponseStructure subscribeAllSubdeviceInformation(SubscribeRequestStructure subscribeRequestStructure);
	
	UnsubscribeResponseStructure unsubscribeAllSubdeviceInformation(UnsubscribeRequestStructure unsubscribeRequestStructure);
	
	SubscribeResponseStructure subscribeDeviceStatusInformation(SubscribeRequestStructure subscribeRequestStructure);
	
	UnsubscribeResponseStructure unsubscribeDeviceStatusInformation(UnsubscribeRequestStructure unsubscribeRequestStructure);
	
	SubscribeResponseStructure subscribeAllSubdeviceStatusInformation(SubscribeRequestStructure subscribeRequestStructure);
	
	UnsubscribeResponseStructure unsubscribeAllSubdeviceStatusInformation(UnsubscribeRequestStructure unsubscribeRequestStructure);
	
	SubscribeResponseStructure subscribeAllSubdeviceErrorMessages(SubscribeRequestStructure subscribeRequestStructure);
	
	UnsubscribeResponseStructure unsubscribeAllSubdeviceErrorMessages(UnsubscribeRequestStructure unsubscribeRequestStructure);
	
	
//	UPDATE Operations (they are optional)
	DeviceManagementServiceInstallUpdateResponseStructure installUpdate(DeviceManagementServiceInstallUpdateRequestStructure request);
	
	DeviceManagementServiceRetrieveUpdateStateResponseStructure retrieveUpdateState(DeviceManagementServiceRetrieveUpdateStateRequestStructure request);
	
	DeviceManagementServiceGetUpdateHistoryResponseStructure getUpdateHistory();
	
	DeviceManagementServiceFinalizeUpdateResponseStructure finalizeUpdate(DeviceManagementServiceFinalizeUpdateRequestStructure request);

	DataAcceptedResponseStructure finalizeAllPendingUpdates();
}
