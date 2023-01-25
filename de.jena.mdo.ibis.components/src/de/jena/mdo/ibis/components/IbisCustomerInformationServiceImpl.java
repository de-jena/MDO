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

import de.jena.mdo.ibis.apis.IbisCustomerInformationService;
import de.jena.mdo.ibis.common.SubscribeRequestStructure;
import de.jena.mdo.ibis.common.SubscribeResponseStructure;
import de.jena.mdo.ibis.common.UnsubscribeRequestStructure;
import de.jena.mdo.ibis.common.UnsubscribeResponseStructure;
import de.jena.mdo.ibis.components.helper.CustomerInformationServiceConstants;
import de.jena.mdo.ibis.components.helper.IbisHttpRequestHelper;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetAllDataResponseStructure;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentAnnouncementResponseStructure;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentConnectionInformationResponseStructure;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentDisplayContentResponseStructure;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentStopIndexResponseStructure;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentStopPointResponseStructure;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetTripDataResponseStructure;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetVehicleDataResponseStructure;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceRetrievePartialStopSequenceRequestStructure;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceRetrievePartialStopSequenceResponseStructure;
import de.jena.mdo.ibis.customerinformationservice.IbisCustomerInformationServicePackage;


/**
 * 
 * @author ilenia
 * @since Jan 18, 2023
 */
@Component(name = "IbisCustomerInformationService", scope = ServiceScope.PROTOTYPE, configurationPid = "IbisCustomerInformationService", configurationPolicy = ConfigurationPolicy.REQUIRE)
public class IbisCustomerInformationServiceImpl implements IbisCustomerInformationService {

	@Reference
	IbisCustomerInformationServicePackage customerInfoServicePackage;
	
	@Reference
	private ComponentServiceObjects<ResourceSet> resourceSetFactory;
	
    private final static Logger LOGGER = Logger.getLogger(IbisCustomerInformationServiceImpl.class.getName());

	private String host;
	private String port;


	@Activate
	public void activate(Map<String, Object> configProperties) {
		host = (String) configProperties.getOrDefault("ibis.customer.info.service.host", null);
		port = (String) configProperties.getOrDefault("ibis.customer.info.service.port", null);
		if(host == null || port == null) {
			LOGGER.severe("Host and/or Port are not properly set for IbisCustomerInformationService");
			throw new IllegalStateException("Host and/or Port are not properly set for IbisCustomerInformationService");
		}
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#getAllData()
	 */
	@Override
	public CustomerInformationServiceGetAllDataResponseStructure getAllData() {
		return IbisHttpRequestHelper.sendHttpRequest(host, port, CustomerInformationServiceConstants.SERVICE_NAME, 
				CustomerInformationServiceConstants.OPERATION_GET_ALL_DATA, null, 
				customerInfoServicePackage.getCustomerInformationServiceGetAllDataResponseStructure(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#getCurrentAnnouncement()
	 */
	@Override
	public CustomerInformationServiceGetCurrentAnnouncementResponseStructure getCurrentAnnouncement() {
		return IbisHttpRequestHelper.sendHttpRequest(host, port, CustomerInformationServiceConstants.SERVICE_NAME, 
				CustomerInformationServiceConstants.OPERATION_GET_CURRENT_ANNOUNCEMENT, null, 
				customerInfoServicePackage.getCustomerInformationServiceGetCurrentAnnouncementResponseStructure(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#getCurrentConnectionInformation()
	 */
	@Override
	public CustomerInformationServiceGetCurrentConnectionInformationResponseStructure getCurrentConnectionInformation() {
		return IbisHttpRequestHelper.sendHttpRequest(host, port, CustomerInformationServiceConstants.SERVICE_NAME, 
				CustomerInformationServiceConstants.OPERATION_GET_CURRENT_CONNECTION_INFO, null, 
				customerInfoServicePackage.getCustomerInformationServiceGetCurrentConnectionInformationResponseStructure(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#getCurrentDisplayContent()
	 */
	@Override
	public CustomerInformationServiceGetCurrentDisplayContentResponseStructure getCurrentDisplayContent() {
		return IbisHttpRequestHelper.sendHttpRequest(host, port, CustomerInformationServiceConstants.SERVICE_NAME, 
				CustomerInformationServiceConstants.OPERATION_GET_CURRENT_DISPLAY_CONTENT, null, 
				customerInfoServicePackage.getCustomerInformationServiceGetCurrentDisplayContentResponseStructure(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#getCurrentStopPoint()
	 */
	@Override
	public CustomerInformationServiceGetCurrentStopPointResponseStructure getCurrentStopPoint() {
		return IbisHttpRequestHelper.sendHttpRequest(host, port, CustomerInformationServiceConstants.SERVICE_NAME, 
				CustomerInformationServiceConstants.OPERATION_GET_CURRENT_STOP_POINT, null, 
				customerInfoServicePackage.getCustomerInformationServiceGetCurrentStopPointResponseStructure(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#getCurrentStopIndex()
	 */
	@Override
	public CustomerInformationServiceGetCurrentStopIndexResponseStructure getCurrentStopIndex() {
		return IbisHttpRequestHelper.sendHttpRequest(host, port, CustomerInformationServiceConstants.SERVICE_NAME, 
				CustomerInformationServiceConstants.OPERATION_GET_CURRENT_STOP_INDEX, null, 
				customerInfoServicePackage.getCustomerInformationServiceGetCurrentStopIndexResponseStructure(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#getTripData()
	 */
	@Override
	public CustomerInformationServiceGetTripDataResponseStructure getTripData() {
		return IbisHttpRequestHelper.sendHttpRequest(host, port, CustomerInformationServiceConstants.SERVICE_NAME, 
				CustomerInformationServiceConstants.OPERATION_GET_TRIP_DATA, null,
				customerInfoServicePackage.getCustomerInformationServiceGetTripDataResponseStructure(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#getVehicleData()
	 */
	@Override
	public CustomerInformationServiceGetVehicleDataResponseStructure getVehicleData() {
		return IbisHttpRequestHelper.sendHttpRequest(host, port, CustomerInformationServiceConstants.SERVICE_NAME, 
				CustomerInformationServiceConstants.OPERATION_GET_VEHICLE_DATA, null, 
				customerInfoServicePackage.getCustomerInformationServiceGetVehicleDataResponseStructure(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#subscribeAllData(de.jena.mdo.ibis.common.SubscribeRequestStructure)
	 */
	@Override
	public SubscribeResponseStructure subscribeAllData(SubscribeRequestStructure subscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#unsubscribeAllData(de.jena.mdo.ibis.common.UnsubscribeRequestStructure)
	 */
	@Override
	public UnsubscribeResponseStructure unsubscribeAllData(UnsubscribeRequestStructure unsubscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#subscribeCurrentAnnouncement(de.jena.mdo.ibis.common.SubscribeRequestStructure)
	 */
	@Override
	public SubscribeResponseStructure subscribeCurrentAnnouncement(
			SubscribeRequestStructure subscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#unsubscribeCurrentAnnouncement(de.jena.mdo.ibis.common.UnsubscribeRequestStructure)
	 */
	@Override
	public UnsubscribeResponseStructure unsubscribeCurrentAnnouncement(
			UnsubscribeRequestStructure unsubscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#subscribeCurrentConnectionInformation(de.jena.mdo.ibis.common.SubscribeRequestStructure)
	 */
	@Override
	public SubscribeResponseStructure subscribeCurrentConnectionInformation(
			SubscribeRequestStructure subscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#unsubscribeCurrentConnectionInformation(de.jena.mdo.ibis.common.UnsubscribeRequestStructure)
	 */
	@Override
	public UnsubscribeResponseStructure unsubscribeCurrentConnectionInformation(
			UnsubscribeRequestStructure unsubscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#subscribeCurrentDisplayContent(de.jena.mdo.ibis.common.SubscribeRequestStructure)
	 */
	@Override
	public SubscribeResponseStructure subscribeCurrentDisplayContent(
			SubscribeRequestStructure subscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#unsubscribeCurrentDisplayContent(de.jena.mdo.ibis.common.UnsubscribeRequestStructure)
	 */
	@Override
	public UnsubscribeResponseStructure unsubscribeCurrentDisplayContent(
			UnsubscribeRequestStructure unsubscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#subscribeCurrentStopPoint(de.jena.mdo.ibis.common.SubscribeRequestStructure)
	 */
	@Override
	public SubscribeResponseStructure subscribeCurrentStopPoint(SubscribeRequestStructure subscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#unsubscribeCurrentStopPoint(de.jena.mdo.ibis.common.UnsubscribeRequestStructure)
	 */
	@Override
	public UnsubscribeResponseStructure unsubscribeCurrentStopPoint(
			UnsubscribeRequestStructure unsubscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#subscribeCurrentStopIndex(de.jena.mdo.ibis.common.SubscribeRequestStructure)
	 */
	@Override
	public SubscribeResponseStructure subscribeCurrentStopIndex(SubscribeRequestStructure subscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#unsubscribeCurrentStopIndex(de.jena.mdo.ibis.common.UnsubscribeRequestStructure)
	 */
	@Override
	public UnsubscribeResponseStructure unsubscribeCurrentStopIndex(
			UnsubscribeRequestStructure unsubscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#subscribeTripData(de.jena.mdo.ibis.common.SubscribeRequestStructure)
	 */
	@Override
	public SubscribeResponseStructure subscribeTripData(SubscribeRequestStructure subscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#unsubscribeTripData(de.jena.mdo.ibis.common.UnsubscribeRequestStructure)
	 */
	@Override
	public UnsubscribeResponseStructure unsubscribeTripData(UnsubscribeRequestStructure unsubscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#subscribeVehicleData(de.jena.mdo.ibis.common.SubscribeRequestStructure)
	 */
	@Override
	public SubscribeResponseStructure subscribeVehicleData(SubscribeRequestStructure subscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#unsubscribeVehicleData(de.jena.mdo.ibis.common.UnsubscribeRequestStructure)
	 */
	@Override
	public UnsubscribeResponseStructure unsubscribeVehicleData(
			UnsubscribeRequestStructure unsubscribeRequestStructure) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#retrievePartialStopSequence(de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceRetrievePartialStopSequenceRequestStructure)
	 */
	@Override
	public CustomerInformationServiceRetrievePartialStopSequenceResponseStructure retrievePartialStopSequence(
			CustomerInformationServiceRetrievePartialStopSequenceRequestStructure requestStructure) {
		// TODO Auto-generated method stub
		return null;
	}


}
