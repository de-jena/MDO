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

import de.jena.ibis.ibis_common.DataAcceptedResponse;
import de.jena.ibis.ibis_devicemanagementservice.AllSubdeviceErrorMessagesResponse;
import de.jena.ibis.ibis_devicemanagementservice.AllSubdeviceInformationResponse;
import de.jena.ibis.ibis_devicemanagementservice.DeviceConfigurationResponse;
import de.jena.ibis.ibis_devicemanagementservice.DeviceErrorMessagesResponse;
import de.jena.ibis.ibis_devicemanagementservice.DeviceInformationResponse;
import de.jena.ibis.ibis_devicemanagementservice.DeviceStatusInformationResponse;
import de.jena.ibis.ibis_devicemanagementservice.DeviceStatusResponse;
import de.jena.ibis.ibis_devicemanagementservice.FinalizeUpdateRequest;
import de.jena.ibis.ibis_devicemanagementservice.FinalizeUpdateResponse;
import de.jena.ibis.ibis_devicemanagementservice.InstallUpdateRequest;
import de.jena.ibis.ibis_devicemanagementservice.InstallUpdateResponse;
import de.jena.ibis.ibis_devicemanagementservice.RetrieveUpdateStateRequest;
import de.jena.ibis.ibis_devicemanagementservice.RetrieveUpdateStateResponse;
import de.jena.ibis.ibis_devicemanagementservice.ServiceInformationResponse;
import de.jena.ibis.ibis_devicemanagementservice.ServiceStatusResponse;
import de.jena.ibis.ibis_devicemanagementservice.UpdateHistoryResponse;

/**
 * 
 * @author ilenia
 * @since Jan 18, 2023
 */
public interface IbisDeviceManagementService extends GeneralIbisTCPService {
	
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
	Integer subscribeDeviceInformation();
	
	Integer unsubscribeDeviceInformation();
	
	Integer subscribeDeviceStatus();
	
	Integer unsubscribeDeviceStatus();
	
	Integer subscribeDeviceErrorMessages();
	
	Integer unsubscribeDeviceErrorMessages();
	
	Integer subscribeServiceInformation();
	
	Integer unsubscribeServiceInformation();
	
	Integer subscribeServiceStatus();
	
	Integer unsubscribeServiceStatus();
	
	Integer subscribeAllSubdeviceInformation();
	
	Integer unsubscribeAllSubdeviceInformation();
	
	Integer subscribeDeviceStatusInformation();
	
	Integer unsubscribeDeviceStatusInformation();
	
	Integer subscribeAllSubdeviceStatusInformation();
	
	Integer unsubscribeAllSubdeviceStatusInformation();
	
	Integer subscribeAllSubdeviceErrorMessages();
	
	Integer unsubscribeAllSubdeviceErrorMessages();
	
	
//	UPDATE Operations (they are optional)
	InstallUpdateResponse installUpdate(InstallUpdateRequest request);
	
	RetrieveUpdateStateResponse retrieveUpdateState(RetrieveUpdateStateRequest request);
	
	UpdateHistoryResponse getUpdateHistory();
	
	FinalizeUpdateResponse finalizeUpdate(FinalizeUpdateRequest request);

	DataAcceptedResponse finalizeAllPendingUpdates();
}
