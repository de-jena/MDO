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

import de.jena.mdo.ibis.ibis_common.DataAcceptedResponse;
import de.jena.mdo.ibis.ibis_common.SubscribeRequest;
import de.jena.mdo.ibis.ibis_common.SubscribeResponse;
import de.jena.mdo.ibis.ibis_common.UnsubscribeRequest;
import de.jena.mdo.ibis.ibis_common.UnsubscribeResponse;
import de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceErrorMessagesResponse;
import de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceInformationResponse;
import de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceConfigurationResponse;
import de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceErrorMessagesResponse;
import de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceInformationResponse;
import de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusInformationResponse;
import de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusResponse;
import de.jena.mdo.ibis.ibis_devicemanagementservice.FinalizeUpdateRequest;
import de.jena.mdo.ibis.ibis_devicemanagementservice.FinalizeUpdateResponse;
import de.jena.mdo.ibis.ibis_devicemanagementservice.InstallUpdateRequest;
import de.jena.mdo.ibis.ibis_devicemanagementservice.InstallUpdateResponse;
import de.jena.mdo.ibis.ibis_devicemanagementservice.RetrieveUpdateStateRequest;
import de.jena.mdo.ibis.ibis_devicemanagementservice.RetrieveUpdateStateResponse;
import de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceInformationResponse;
import de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceStatusResponse;
import de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistoryResponse;

/**
 * 
 * @author ilenia
 * @since Jan 18, 2023
 */
public interface IbisDeviceManagementService {
	
//	GET Operations
	DeviceInformationResponse getDeviceInformation();
	
	DeviceConfigurationResponse getDeviceConfiguration();
	
	DeviceStatusResponse getDeviceStatus();
	
	DeviceErrorMessagesResponse getDeviceErrorMessages();
	
	ServiceInformationResponse getServiceInformation();
	
	ServiceStatusResponse getServiceStatus();
	
	AllSubdeviceInformationResponse getAllSubdeviceInformation();
	
	DeviceStatusInformationResponse getDeviceStatusInformation();
	
	AllSubdeviceInformationResponse getAllSubdeviceStatusInformation();
	
	AllSubdeviceErrorMessagesResponse getAllSubdeviceErrorMessages();
		
	
//	SUBSCRIBE/UNSUBSCRIBE Operations
	SubscribeResponse subscribeDeviceInformation(SubscribeRequest subscribeRequest);
	
	UnsubscribeResponse unsubscribeDeviceInformation(UnsubscribeRequest unsubscribeRequest);
	
	SubscribeResponse subscribeDeviceStatus(SubscribeRequest subscribeRequest);
	
	UnsubscribeResponse unsubscribeDeviceStatus(UnsubscribeRequest unsubscribeRequest);
	
	SubscribeResponse subscribeDeviceErrorMessages(SubscribeRequest subscribeRequest);
	
	UnsubscribeResponse unsubscribeDeviceErrorMessages(UnsubscribeRequest unsubscribeRequest);
	
	SubscribeResponse subscribeServiceInformation(SubscribeRequest subscribeRequest);
	
	UnsubscribeResponse unsubscribeServiceInformation(UnsubscribeRequest unsubscribeRequest);
	
	SubscribeResponse subscribeServiceStatus(SubscribeRequest subscribeRequest);
	
	UnsubscribeResponse unsubscribeServiceStatus(UnsubscribeRequest unsubscribeRequest);
	
	SubscribeResponse subscribeAllSubdeviceInformation(SubscribeRequest subscribeRequest);
	
	UnsubscribeResponse unsubscribeAllSubdeviceInformation(UnsubscribeRequest unsubscribeRequest);
	
	SubscribeResponse subscribeDeviceStatusInformation(SubscribeRequest subscribeRequest);
	
	UnsubscribeResponse unsubscribeDeviceStatusInformation(UnsubscribeRequest unsubscribeRequest);
	
	SubscribeResponse subscribeAllSubdeviceStatusInformation(SubscribeRequest subscribeRequest);
	
	UnsubscribeResponse unsubscribeAllSubdeviceStatusInformation(UnsubscribeRequest unsubscribeRequest);
	
	SubscribeResponse subscribeAllSubdeviceErrorMessages(SubscribeRequest subscribeRequest);
	
	UnsubscribeResponse unsubscribeAllSubdeviceErrorMessages(UnsubscribeRequest unsubscribeRequest);
	
	
//	UPDATE Operations (they are optional)
	InstallUpdateResponse installUpdate(InstallUpdateRequest request);
	
	RetrieveUpdateStateResponse retrieveUpdateState(RetrieveUpdateStateRequest request);
	
	UpdateHistoryResponse getUpdateHistory();
	
	FinalizeUpdateResponse finalizeUpdate(FinalizeUpdateRequest request);

	DataAcceptedResponse finalizeAllPendingUpdates();
}
