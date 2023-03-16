/**
 * Copyright (c) 2012 - 2018 Data In Motion and others.
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

import java.util.Map;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

import de.jena.mdo.ibis.apis.IbisDeviceManagementService;
import de.jena.mdo.ibis.components.helper.DeviceManagementServiceConstants;
import de.jena.mdo.ibis.components.helper.IbisHttpRequestHelper;
import de.jena.mdo.ibis.ibis_common.DataAcceptedResponse;
import de.jena.mdo.ibis.ibis_common.IbisCommonPackage;
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
import de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage;
import de.jena.mdo.ibis.ibis_devicemanagementservice.InstallUpdateRequest;
import de.jena.mdo.ibis.ibis_devicemanagementservice.InstallUpdateResponse;
import de.jena.mdo.ibis.ibis_devicemanagementservice.RetrieveUpdateStateRequest;
import de.jena.mdo.ibis.ibis_devicemanagementservice.RetrieveUpdateStateResponse;
import de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceInformationResponse;
import de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceStatusResponse;
import de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistoryResponse;

@Component(name = "IbisDeviceManagementService", scope = ServiceScope.PROTOTYPE, configurationPid = "IbisDeviceManagementService", configurationPolicy = ConfigurationPolicy.REQUIRE)
public class IbisDeviceManagementServiceImpl implements IbisDeviceManagementService{
	
	@Reference
	IbisDeviceManagementServicePackage deviceManagementServicePackage;
	
	@Reference 
	IbisCommonPackage ibisCommonPackage;
	
	@Reference
	private ComponentServiceObjects<ResourceSet> resourceSetFactory;
	
    private final static Logger LOGGER = Logger.getLogger(IbisDeviceManagementServiceImpl.class.getName());

	private String host;
	private String port;


	@Activate
	public void activate(Map<String, Object> configProperties) {
		host = (String) configProperties.getOrDefault("ibis.device.management.service.host", null);
		port = (String) configProperties.getOrDefault("ibis.device.management.service.port", null);
		if(host == null || port == null) {
			LOGGER.severe("Host and/or Port are not properly set for IbisDeviceManagementService");
			throw new IllegalStateException("Host and/or Port are not properly set for IbisDeviceManagementService");
		}
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#getDeviceInformation()
	 */
	@Override
	public DeviceInformationResponse getDeviceInformation() {
		return IbisHttpRequestHelper.sendHttpRequest(host, port, DeviceManagementServiceConstants.SERVICE_NAME, 
				DeviceManagementServiceConstants.OPERATION_GET_DEVICE_INFO, null, 
				deviceManagementServicePackage.getDeviceInformationResponse(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#getDeviceConfiguration()
	 */
	@Override
	public DeviceConfigurationResponse getDeviceConfiguration() {
		return IbisHttpRequestHelper.sendHttpRequest(host, port, DeviceManagementServiceConstants.SERVICE_NAME, 
				DeviceManagementServiceConstants.OPERATION_GET_DEVICE_CONFIGURATION, null, 
				deviceManagementServicePackage.getDeviceConfigurationResponse(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#getDeviceStatus()
	 */
	@Override
	public DeviceStatusResponse getDeviceStatus() {
		return IbisHttpRequestHelper.sendHttpRequest(host, port, DeviceManagementServiceConstants.SERVICE_NAME, 
				DeviceManagementServiceConstants.OPERATION_GET_DEVICE_STATUS, null, 
				deviceManagementServicePackage.getDeviceStatusResponse(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#getDeviceErrorMessages()
	 */
	@Override
	public DeviceErrorMessagesResponse getDeviceErrorMessages() {
		return IbisHttpRequestHelper.sendHttpRequest(host, port, DeviceManagementServiceConstants.SERVICE_NAME, 
				DeviceManagementServiceConstants.OPERATION_GET_DEVICE_ERR_MSG, null, 
				deviceManagementServicePackage.getDeviceErrorMessagesResponse(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#getServiceInformation()
	 */
	@Override
	public ServiceInformationResponse getServiceInformation() {
		return IbisHttpRequestHelper.sendHttpRequest(host, port, DeviceManagementServiceConstants.SERVICE_NAME, 
				DeviceManagementServiceConstants.OPERATION_GET_SERVICE_INFO, null, 
				deviceManagementServicePackage.getServiceInformationResponse(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#getServiceStatus()
	 */
	@Override
	public ServiceStatusResponse getServiceStatus() {
		return IbisHttpRequestHelper.sendHttpRequest(host, port, DeviceManagementServiceConstants.SERVICE_NAME, 
				DeviceManagementServiceConstants.OPERATION_GET_SERVICE_STATUS, null, 
				deviceManagementServicePackage.getServiceStatusResponse(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#getAllSubdeviceInformation()
	 */
	@Override
	public AllSubdeviceInformationResponse getAllSubdeviceInformation() {
		return IbisHttpRequestHelper.sendHttpRequest(host, port, DeviceManagementServiceConstants.SERVICE_NAME, 
				DeviceManagementServiceConstants.OPERATION_GET_ALL_SUBDEVICE_INFO, null, 
				deviceManagementServicePackage.getAllSubdeviceInformationResponse(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#getDeviceStatusInformation()
	 */
	@Override
	public DeviceStatusInformationResponse getDeviceStatusInformation() {
		return IbisHttpRequestHelper.sendHttpRequest(host, port, DeviceManagementServiceConstants.SERVICE_NAME, 
				DeviceManagementServiceConstants.OPERATION_GET_DEVICE_STATUS_INFO, null, 
				deviceManagementServicePackage.getDeviceStatusInformationResponse(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#getAllSubdeviceStatusInformation()
	 */
	@Override
	public AllSubdeviceInformationResponse getAllSubdeviceStatusInformation() {
		return IbisHttpRequestHelper.sendHttpRequest(host, port, DeviceManagementServiceConstants.SERVICE_NAME, 
				DeviceManagementServiceConstants.OPERATION_GET_ALL_SUBDEVICE_STATUS_INFO, null, 
				deviceManagementServicePackage.getAllSubdeviceStatusInformationResponse(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#getAllSubdeviceErrorMessages()
	 */
	@Override
	public AllSubdeviceErrorMessagesResponse getAllSubdeviceErrorMessages() {
		return IbisHttpRequestHelper.sendHttpRequest(host, port, DeviceManagementServiceConstants.SERVICE_NAME, 
				DeviceManagementServiceConstants.OPERATION_GET_ALL_SUBDEVICE_ERR_MSG, null, 
				deviceManagementServicePackage.getAllSubdeviceErrorMessagesResponse(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#subscribeDeviceInformation(de.jena.mdo.ibis.common.SubscribeRequest)
	 */
	@Override
	public SubscribeResponse subscribeDeviceInformation(SubscribeRequest subscribeRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#unsubscribeDeviceInformation(de.jena.mdo.ibis.common.UnsubscribeRequest)
	 */
	@Override
	public UnsubscribeResponse unsubscribeDeviceInformation(
			UnsubscribeRequest unsubscribeRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#subscribeDeviceStatus(de.jena.mdo.ibis.common.SubscribeRequest)
	 */
	@Override
	public SubscribeResponse subscribeDeviceStatus(SubscribeRequest subscribeRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#unsubscribeDeviceStatus(de.jena.mdo.ibis.common.UnsubscribeRequest)
	 */
	@Override
	public UnsubscribeResponse unsubscribeDeviceStatus(
			UnsubscribeRequest unsubscribeRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#subscribeDeviceErrorMessages(de.jena.mdo.ibis.common.SubscribeRequest)
	 */
	@Override
	public SubscribeResponse subscribeDeviceErrorMessages(
			SubscribeRequest subscribeRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#unsubscribeDeviceErrorMessages(de.jena.mdo.ibis.common.UnsubscribeRequest)
	 */
	@Override
	public UnsubscribeResponse unsubscribeDeviceErrorMessages(
			UnsubscribeRequest unsubscribeRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#subscribeServiceInformation(de.jena.mdo.ibis.common.SubscribeRequest)
	 */
	@Override
	public SubscribeResponse subscribeServiceInformation(SubscribeRequest subscribeRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#unsubscribeServiceInformation(de.jena.mdo.ibis.common.UnsubscribeRequest)
	 */
	@Override
	public UnsubscribeResponse unsubscribeServiceInformation(
			UnsubscribeRequest unsubscribeRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#subscribeServiceStatus(de.jena.mdo.ibis.common.SubscribeRequest)
	 */
	@Override
	public SubscribeResponse subscribeServiceStatus(SubscribeRequest subscribeRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#unsubscribeServiceStatus(de.jena.mdo.ibis.common.UnsubscribeRequest)
	 */
	@Override
	public UnsubscribeResponse unsubscribeServiceStatus(
			UnsubscribeRequest unsubscribeRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#subscribeAllSubdeviceInformation(de.jena.mdo.ibis.common.SubscribeRequest)
	 */
	@Override
	public SubscribeResponse subscribeAllSubdeviceInformation(
			SubscribeRequest subscribeRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#unsubscribeAllSubdeviceInformation(de.jena.mdo.ibis.common.UnsubscribeRequest)
	 */
	@Override
	public UnsubscribeResponse unsubscribeAllSubdeviceInformation(
			UnsubscribeRequest unsubscribeRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#subscribeDeviceStatusInformation(de.jena.mdo.ibis.common.SubscribeRequest)
	 */
	@Override
	public SubscribeResponse subscribeDeviceStatusInformation(
			SubscribeRequest subscribeRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#unsubscribeDeviceStatusInformation(de.jena.mdo.ibis.common.UnsubscribeRequest)
	 */
	@Override
	public UnsubscribeResponse unsubscribeDeviceStatusInformation(
			UnsubscribeRequest unsubscribeRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#subscribeAllSubdeviceStatusInformation(de.jena.mdo.ibis.common.SubscribeRequest)
	 */
	@Override
	public SubscribeResponse subscribeAllSubdeviceStatusInformation(
			SubscribeRequest subscribeRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#unsubscribeAllSubdeviceStatusInformation(de.jena.mdo.ibis.common.UnsubscribeRequest)
	 */
	@Override
	public UnsubscribeResponse unsubscribeAllSubdeviceStatusInformation(
			UnsubscribeRequest unsubscribeRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#subscribeAllSubdeviceErrorMessages(de.jena.mdo.ibis.common.SubscribeRequest)
	 */
	@Override
	public SubscribeResponse subscribeAllSubdeviceErrorMessages(
			SubscribeRequest subscribeRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#unsubscribeAllSubdeviceErrorMessages(de.jena.mdo.ibis.common.UnsubscribeRequest)
	 */
	@Override
	public UnsubscribeResponse unsubscribeAllSubdeviceErrorMessages(
			UnsubscribeRequest unsubscribeRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#installUpdate(de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceInstallUpdateRequest)
	 */
	@Override
	public InstallUpdateResponse installUpdate(
			InstallUpdateRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#retrieveUpdateState(de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceRetrieveUpdateStateRequest)
	 */
	@Override
	public RetrieveUpdateStateResponse retrieveUpdateState(
			RetrieveUpdateStateRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#getUpdateHistory()
	 */
	@Override
	public UpdateHistoryResponse getUpdateHistory() {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#finalizeUpdate(de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceFinalizeUpdateRequest)
	 */
	@Override
	public FinalizeUpdateResponse finalizeUpdate(
			FinalizeUpdateRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#finalizeAllPendingUpdates()
	 */
	@Override
	public DataAcceptedResponse finalizeAllPendingUpdates() {
		// TODO Auto-generated method stub
		return null;
	}


}
