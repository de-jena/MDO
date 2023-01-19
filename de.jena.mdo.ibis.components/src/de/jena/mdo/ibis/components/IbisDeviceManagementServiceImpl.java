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

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;

import de.jena.mdo.ibis.apis.IbisDeviceManagementService;
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

@Component(name = "IbisDeviceManagementService", scope = ServiceScope.PROTOTYPE)
public class IbisDeviceManagementServiceImpl implements IbisDeviceManagementService{

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#getDeviceInformation()
	 */
	@Override
	public DeviceManagementServiceGetDeviceInformationResponseStructure getDeviceInformation() {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#getDeviceConfiguration()
	 */
	@Override
	public DeviceManagementServiceGetDeviceConfigurationResponseStructure getDeviceConfiguration() {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#getDeviceStatus()
	 */
	@Override
	public DeviceManagementServiceGetDeviceStatusResponseStructure getDeviceStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#getDeviceErrorMessages()
	 */
	@Override
	public DeviceManagementServiceGetDeviceErrorMessagesResponseStructure getDeviceErrorMessages() {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#getServiceInformation()
	 */
	@Override
	public DeviceManagementServiceGetServiceInformationResponseStructure getServiceInformation() {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#getServiceStatus()
	 */
	@Override
	public DeviceManagementServiceGetServiceStatusResponseStructure getServiceStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#getAllSubdeviceInformation()
	 */
	@Override
	public DeviceManagementServiceGetAllSubdeviceInformationResponseStructure getAllSubdeviceInformation() {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#getDeviceStatusInformation()
	 */
	@Override
	public DeviceManagementServiceGetDeviceStatusInformationResponseStructure getDeviceStatusInformation() {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#getAllSubdeviceStatusInformation()
	 */
	@Override
	public DeviceManagementServiceGetAllSubdeviceInformationResponseStructure getAllSubdeviceStatusInformation() {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#getAllSubdeviceErrorMessages()
	 */
	@Override
	public DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure getAllSubdeviceErrorMessages() {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#subscribeDeviceInformation(de.jena.mdo.ibis.common.SubscribeRequestStructure)
	 */
	@Override
	public SubscribeResponseStructure subscribeDeviceInformation(SubscribeRequestStructure subscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#unsubscribeDeviceInformation(de.jena.mdo.ibis.common.UnsubscribeRequestStructure)
	 */
	@Override
	public UnsubscribeResponseStructure unsubscribeDeviceInformation(
			UnsubscribeRequestStructure unsubscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#subscribeDeviceStatus(de.jena.mdo.ibis.common.SubscribeRequestStructure)
	 */
	@Override
	public SubscribeResponseStructure subscribeDeviceStatus(SubscribeRequestStructure subscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#unsubscribeDeviceStatus(de.jena.mdo.ibis.common.UnsubscribeRequestStructure)
	 */
	@Override
	public UnsubscribeResponseStructure unsubscribeDeviceStatus(
			UnsubscribeRequestStructure unsubscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#subscribeDeviceErrorMessages(de.jena.mdo.ibis.common.SubscribeRequestStructure)
	 */
	@Override
	public SubscribeResponseStructure subscribeDeviceErrorMessages(
			SubscribeRequestStructure subscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#unsubscribeDeviceErrorMessages(de.jena.mdo.ibis.common.UnsubscribeRequestStructure)
	 */
	@Override
	public UnsubscribeResponseStructure unsubscribeDeviceErrorMessages(
			UnsubscribeRequestStructure unsubscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#subscribeServiceInformation(de.jena.mdo.ibis.common.SubscribeRequestStructure)
	 */
	@Override
	public SubscribeResponseStructure subscribeServiceInformation(SubscribeRequestStructure subscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#unsubscribeServiceInformation(de.jena.mdo.ibis.common.UnsubscribeRequestStructure)
	 */
	@Override
	public UnsubscribeResponseStructure unsubscribeServiceInformation(
			UnsubscribeRequestStructure unsubscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#subscribeServiceStatus(de.jena.mdo.ibis.common.SubscribeRequestStructure)
	 */
	@Override
	public SubscribeResponseStructure subscribeServiceStatus(SubscribeRequestStructure subscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#unsubscribeServiceStatus(de.jena.mdo.ibis.common.UnsubscribeRequestStructure)
	 */
	@Override
	public UnsubscribeResponseStructure unsubscribeServiceStatus(
			UnsubscribeRequestStructure unsubscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#subscribeAllSubdeviceInformation(de.jena.mdo.ibis.common.SubscribeRequestStructure)
	 */
	@Override
	public SubscribeResponseStructure subscribeAllSubdeviceInformation(
			SubscribeRequestStructure subscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#unsubscribeAllSubdeviceInformation(de.jena.mdo.ibis.common.UnsubscribeRequestStructure)
	 */
	@Override
	public UnsubscribeResponseStructure unsubscribeAllSubdeviceInformation(
			UnsubscribeRequestStructure unsubscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#subscribeDeviceStatusInformation(de.jena.mdo.ibis.common.SubscribeRequestStructure)
	 */
	@Override
	public SubscribeResponseStructure subscribeDeviceStatusInformation(
			SubscribeRequestStructure subscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#unsubscribeDeviceStatusInformation(de.jena.mdo.ibis.common.UnsubscribeRequestStructure)
	 */
	@Override
	public UnsubscribeResponseStructure unsubscribeDeviceStatusInformation(
			UnsubscribeRequestStructure unsubscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#subscribeAllSubdeviceStatusInformation(de.jena.mdo.ibis.common.SubscribeRequestStructure)
	 */
	@Override
	public SubscribeResponseStructure subscribeAllSubdeviceStatusInformation(
			SubscribeRequestStructure subscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#unsubscribeAllSubdeviceStatusInformation(de.jena.mdo.ibis.common.UnsubscribeRequestStructure)
	 */
	@Override
	public UnsubscribeResponseStructure unsubscribeAllSubdeviceStatusInformation(
			UnsubscribeRequestStructure unsubscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#subscribeAllSubdeviceErrorMessages(de.jena.mdo.ibis.common.SubscribeRequestStructure)
	 */
	@Override
	public SubscribeResponseStructure subscribeAllSubdeviceErrorMessages(
			SubscribeRequestStructure subscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#unsubscribeAllSubdeviceErrorMessages(de.jena.mdo.ibis.common.UnsubscribeRequestStructure)
	 */
	@Override
	public UnsubscribeResponseStructure unsubscribeAllSubdeviceErrorMessages(
			UnsubscribeRequestStructure unsubscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#installUpdate(de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceInstallUpdateRequestStructure)
	 */
	@Override
	public DeviceManagementServiceInstallUpdateResponseStructure installUpdate(
			DeviceManagementServiceInstallUpdateRequestStructure request) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#retrieveUpdateState(de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceRetrieveUpdateStateRequestStructure)
	 */
	@Override
	public DeviceManagementServiceRetrieveUpdateStateResponseStructure retrieveUpdateState(
			DeviceManagementServiceRetrieveUpdateStateRequestStructure request) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#getUpdateHistory()
	 */
	@Override
	public DeviceManagementServiceGetUpdateHistoryResponseStructure getUpdateHistory() {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#finalizeUpdate(de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceFinalizeUpdateRequestStructure)
	 */
	@Override
	public DeviceManagementServiceFinalizeUpdateResponseStructure finalizeUpdate(
			DeviceManagementServiceFinalizeUpdateRequestStructure request) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisDeviceManagementService#finalizeAllPendingUpdates()
	 */
	@Override
	public DataAcceptedResponseStructure finalizeAllPendingUpdates() {
		// TODO Auto-generated method stub
		return null;
	}


}
