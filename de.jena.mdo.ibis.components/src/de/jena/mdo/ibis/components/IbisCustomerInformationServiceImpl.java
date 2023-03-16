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
import de.jena.mdo.ibis.components.helper.CustomerInformationServiceConstants;
import de.jena.mdo.ibis.components.helper.IbisHttpRequestHelper;
import de.jena.mdo.ibis.components.helper.IbisSubscriptionHelper;
import de.jena.mdo.ibis.ibis_common.IbisCommonPackage;
import de.jena.mdo.ibis.ibis_common.SubscribeRequest;
import de.jena.mdo.ibis.ibis_common.SubscribeResponse;
import de.jena.mdo.ibis.ibis_common.UnsubscribeRequest;
import de.jena.mdo.ibis.ibis_common.UnsubscribeResponse;
import de.jena.mdo.ibis.ibis_customerinformationservice.AllDataResponse;
import de.jena.mdo.ibis.ibis_customerinformationservice.CurrentAnnouncementResponse;
import de.jena.mdo.ibis.ibis_customerinformationservice.CurrentConnectionInformationResponse;
import de.jena.mdo.ibis.ibis_customerinformationservice.CurrentDisplayContentResponse;
import de.jena.mdo.ibis.ibis_customerinformationservice.CurrentStopIndexResponse;
import de.jena.mdo.ibis.ibis_customerinformationservice.CurrentStopPointResponse;
import de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage;
import de.jena.mdo.ibis.ibis_customerinformationservice.PartialStopSequenceRequest;
import de.jena.mdo.ibis.ibis_customerinformationservice.PartialStopSequenceResponse;
import de.jena.mdo.ibis.ibis_customerinformationservice.TripDataResponse;
import de.jena.mdo.ibis.ibis_customerinformationservice.VehicleDataResponse;


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
	IbisCommonPackage ibisCommonPackage;
	
	@Reference
	private ComponentServiceObjects<ResourceSet> resourceSetFactory;
	
    private final static Logger LOGGER = Logger.getLogger(IbisCustomerInformationServiceImpl.class.getName());

	private String host;
	private String port;
	private String subscriptionIP;
	private Long subscriptionPort;


	@Activate
	public void activate(Map<String, Object> configProperties) {
		host = (String) configProperties.getOrDefault("ibis.customer.info.service.host", null);
		port = (String) configProperties.getOrDefault("ibis.customer.info.service.port", null);
		subscriptionIP = (String) configProperties.getOrDefault("ibis.customer.info.service.subscription.ip", null);
		subscriptionPort = (Long) configProperties.getOrDefault("ibis.customer.info.service.subscription.port", null);
		if(host == null || port == null) {
			LOGGER.severe("Host and/or Port are not properly set for IbisCustomerInformationService");
			throw new IllegalStateException("Host and/or Port are not properly set for IbisCustomerInformationService");
		}
		if(subscriptionIP == null || subscriptionPort == null) {
			LOGGER.severe("Client IP and/or Port are not properly set for subscriptions in IbisCustomerInformationService");
			throw new IllegalStateException("Client IP and/or Port are not properly set for subscriptions in IbisCustomerInformationService");
		}
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#getAllData()
	 */
	@Override
	public AllDataResponse getAllData() {
		return IbisHttpRequestHelper.sendHttpRequest(host, port, CustomerInformationServiceConstants.SERVICE_NAME, 
				CustomerInformationServiceConstants.OPERATION_GET_ALL_DATA, null, 
				customerInfoServicePackage.getAllDataResponse(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#getCurrentAnnouncement()
	 */
	@Override
	public CurrentAnnouncementResponse getCurrentAnnouncement() {
		return IbisHttpRequestHelper.sendHttpRequest(host, port, CustomerInformationServiceConstants.SERVICE_NAME, 
				CustomerInformationServiceConstants.OPERATION_GET_CURRENT_ANNOUNCEMENT, null, 
				customerInfoServicePackage.getCurrentAnnouncementResponse(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#getCurrentConnectionInformation()
	 */
	@Override
	public CurrentConnectionInformationResponse getCurrentConnectionInformation() {
		return IbisHttpRequestHelper.sendHttpRequest(host, port, CustomerInformationServiceConstants.SERVICE_NAME, 
				CustomerInformationServiceConstants.OPERATION_GET_CURRENT_CONNECTION_INFO, null, 
				customerInfoServicePackage.getCurrentConnectionInformationResponse(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#getCurrentDisplayContent()
	 */
	@Override
	public CurrentDisplayContentResponse getCurrentDisplayContent() {
		return IbisHttpRequestHelper.sendHttpRequest(host, port, CustomerInformationServiceConstants.SERVICE_NAME, 
				CustomerInformationServiceConstants.OPERATION_GET_CURRENT_DISPLAY_CONTENT, null, 
				customerInfoServicePackage.getCurrentDisplayContentResponse(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#getCurrentStopPoint()
	 */
	@Override
	public CurrentStopPointResponse getCurrentStopPoint() {
		return IbisHttpRequestHelper.sendHttpRequest(host, port, CustomerInformationServiceConstants.SERVICE_NAME, 
				CustomerInformationServiceConstants.OPERATION_GET_CURRENT_STOP_POINT, null, 
				customerInfoServicePackage.getCurrentStopPointResponse(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#getCurrentStopIndex()
	 */
	@Override
	public CurrentStopIndexResponse getCurrentStopIndex() {
		return IbisHttpRequestHelper.sendHttpRequest(host, port, CustomerInformationServiceConstants.SERVICE_NAME, 
				CustomerInformationServiceConstants.OPERATION_GET_CURRENT_STOP_INDEX, null, 
				customerInfoServicePackage.getCurrentStopIndexResponse(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#getTripData()
	 */
	@Override
	public TripDataResponse getTripData() {
		return IbisHttpRequestHelper.sendHttpRequest(host, port, CustomerInformationServiceConstants.SERVICE_NAME, 
				CustomerInformationServiceConstants.OPERATION_GET_TRIP_DATA, null,
				customerInfoServicePackage.getTripDataResponse(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#getVehicleData()
	 */
	@Override
	public VehicleDataResponse getVehicleData() {
		return IbisHttpRequestHelper.sendHttpRequest(host, port, CustomerInformationServiceConstants.SERVICE_NAME, 
				CustomerInformationServiceConstants.OPERATION_GET_VEHICLE_DATA, null, 
				customerInfoServicePackage.getVehicleDataResponse(), resourceSetFactory);
	}

	
	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#subscribeAllData()
	 */
	@Override
	public SubscribeResponse subscribeAllData() {
		SubscribeRequest subscribeRequest = 
				IbisSubscriptionHelper.createSubscriptionRequest(ibisCommonPackage, subscriptionIP, subscriptionPort, CustomerInformationServiceConstants.SERVICE_NAME+"/"+CustomerInformationServiceConstants.OPERATION_SUBSCRIBE_ALL_DATA);
		
		return IbisHttpRequestHelper.sendHttpRequest(host, port, CustomerInformationServiceConstants.SERVICE_NAME, 
				CustomerInformationServiceConstants.OPERATION_SUBSCRIBE_ALL_DATA, subscribeRequest, 
				ibisCommonPackage.getSubscribeResponse(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#unsubscribeAllData(de.jena.mdo.ibis.common.UnsubscribeRequest)
	 */
	@Override
	public UnsubscribeResponse unsubscribeAllData(UnsubscribeRequest unsubscribeRequest) {
		return IbisHttpRequestHelper.sendHttpRequest(host, port, CustomerInformationServiceConstants.SERVICE_NAME, 
				CustomerInformationServiceConstants.OPERATION_UNSUBSCRIBE_ALL_DATA, unsubscribeRequest, 
				ibisCommonPackage.getUnsubscribeResponse(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#subscribeCurrentAnnouncement(de.jena.mdo.ibis.common.SubscribeRequest)
	 */
	@Override
	public SubscribeResponse subscribeCurrentAnnouncement(SubscribeRequest subscribeRequest) {
		return IbisHttpRequestHelper.sendHttpRequest(host, port, CustomerInformationServiceConstants.SERVICE_NAME, 
				CustomerInformationServiceConstants.OPERATION_SUBSCRIBE_CURRENT_ANNOUNCEMENT, subscribeRequest, 
				ibisCommonPackage.getSubscribeResponse(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#unsubscribeCurrentAnnouncement(de.jena.mdo.ibis.common.UnsubscribeRequest)
	 */
	@Override
	public UnsubscribeResponse unsubscribeCurrentAnnouncement(UnsubscribeRequest unsubscribeRequest) {
		return IbisHttpRequestHelper.sendHttpRequest(host, port, CustomerInformationServiceConstants.SERVICE_NAME, 
				CustomerInformationServiceConstants.OPERATION_UNSUBSCRIBE_CURRENT_ANNOUNCEMENT, unsubscribeRequest, 
				ibisCommonPackage.getUnsubscribeResponse(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#subscribeCurrentConnectionInformation(de.jena.mdo.ibis.common.SubscribeRequest)
	 */
	@Override
	public SubscribeResponse subscribeCurrentConnectionInformation(SubscribeRequest subscribeRequest) {
		return IbisHttpRequestHelper.sendHttpRequest(host, port, CustomerInformationServiceConstants.SERVICE_NAME, 
				CustomerInformationServiceConstants.OPERATION_SUBSCRIBE_CURRENT_CONNECTION_INFO, subscribeRequest, 
				ibisCommonPackage.getSubscribeResponse(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#unsubscribeCurrentConnectionInformation(de.jena.mdo.ibis.common.UnsubscribeRequest)
	 */
	@Override
	public UnsubscribeResponse unsubscribeCurrentConnectionInformation(UnsubscribeRequest unsubscribeRequest) {
		return IbisHttpRequestHelper.sendHttpRequest(host, port, CustomerInformationServiceConstants.SERVICE_NAME, 
				CustomerInformationServiceConstants.OPERATION_UNSUBSCRIBE_CURRENT_CONNECTION_INFO, unsubscribeRequest, 
				ibisCommonPackage.getUnsubscribeResponse(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#subscribeCurrentDisplayContent(de.jena.mdo.ibis.common.SubscribeRequest)
	 */
	@Override
	public SubscribeResponse subscribeCurrentDisplayContent(SubscribeRequest subscribeRequest) {
		return IbisHttpRequestHelper.sendHttpRequest(host, port, CustomerInformationServiceConstants.SERVICE_NAME, 
				CustomerInformationServiceConstants.OPERATION_SUBSCRIBE_CURRENT_DISPLAY_CONTENT, subscribeRequest, 
				ibisCommonPackage.getSubscribeResponse(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#unsubscribeCurrentDisplayContent(de.jena.mdo.ibis.common.UnsubscribeRequest)
	 */
	@Override
	public UnsubscribeResponse unsubscribeCurrentDisplayContent(UnsubscribeRequest unsubscribeRequest) {
		return IbisHttpRequestHelper.sendHttpRequest(host, port, CustomerInformationServiceConstants.SERVICE_NAME, 
				CustomerInformationServiceConstants.OPERATION_UNSUBSCRIBE_CURRENT_DISPLAY_CONTENT, unsubscribeRequest, 
				ibisCommonPackage.getUnsubscribeResponse(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#subscribeCurrentStopPoint(de.jena.mdo.ibis.common.SubscribeRequest)
	 */
	@Override
	public SubscribeResponse subscribeCurrentStopPoint(SubscribeRequest subscribeRequest) {
		return IbisHttpRequestHelper.sendHttpRequest(host, port, CustomerInformationServiceConstants.SERVICE_NAME, 
				CustomerInformationServiceConstants.OPERATION_SUBSCRIBE_CURRENT_STOP_POINT, subscribeRequest, 
				ibisCommonPackage.getSubscribeResponse(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#unsubscribeCurrentStopPoint(de.jena.mdo.ibis.common.UnsubscribeRequest)
	 */
	@Override
	public UnsubscribeResponse unsubscribeCurrentStopPoint(UnsubscribeRequest unsubscribeRequest) {
		return IbisHttpRequestHelper.sendHttpRequest(host, port, CustomerInformationServiceConstants.SERVICE_NAME, 
				CustomerInformationServiceConstants.OPERATION_UNSUBSCRIBE_CURRENT_STOP_POINT, unsubscribeRequest, 
				ibisCommonPackage.getUnsubscribeResponse(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#subscribeCurrentStopIndex(de.jena.mdo.ibis.common.SubscribeRequest)
	 */
	@Override
	public SubscribeResponse subscribeCurrentStopIndex(SubscribeRequest subscribeRequest) {
		return IbisHttpRequestHelper.sendHttpRequest(host, port, CustomerInformationServiceConstants.SERVICE_NAME, 
				CustomerInformationServiceConstants.OPERATION_SUBSCRIBE_CURRENT_STOP_INDEX, subscribeRequest, 
				ibisCommonPackage.getSubscribeResponse(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#unsubscribeCurrentStopIndex(de.jena.mdo.ibis.common.UnsubscribeRequest)
	 */
	@Override
	public UnsubscribeResponse unsubscribeCurrentStopIndex(UnsubscribeRequest unsubscribeRequest) {
		return IbisHttpRequestHelper.sendHttpRequest(host, port, CustomerInformationServiceConstants.SERVICE_NAME, 
				CustomerInformationServiceConstants.OPERATION_UNSUBSCRIBE_CURRENT_STOP_INDEX, unsubscribeRequest, 
				ibisCommonPackage.getUnsubscribeResponse(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#subscribeTripData(de.jena.mdo.ibis.common.SubscribeRequest)
	 */
	@Override
	public SubscribeResponse subscribeTripData(SubscribeRequest subscribeRequest) {
		return IbisHttpRequestHelper.sendHttpRequest(host, port, CustomerInformationServiceConstants.SERVICE_NAME, 
				CustomerInformationServiceConstants.OPERATION_SUBSCRIBE_TRIP_DATA, subscribeRequest, 
				ibisCommonPackage.getSubscribeResponse(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#unsubscribeTripData(de.jena.mdo.ibis.common.UnsubscribeRequest)
	 */
	@Override
	public UnsubscribeResponse unsubscribeTripData(UnsubscribeRequest unsubscribeRequest) {
		return IbisHttpRequestHelper.sendHttpRequest(host, port, CustomerInformationServiceConstants.SERVICE_NAME, 
				CustomerInformationServiceConstants.OPERATION_UNSUBSCRIBE_TRIP_DATA, unsubscribeRequest, 
				ibisCommonPackage.getUnsubscribeResponse(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#subscribeVehicleData(de.jena.mdo.ibis.common.SubscribeRequest)
	 */
	@Override
	public SubscribeResponse subscribeVehicleData(SubscribeRequest subscribeRequest) {
		return IbisHttpRequestHelper.sendHttpRequest(host, port, CustomerInformationServiceConstants.SERVICE_NAME, 
				CustomerInformationServiceConstants.OPERATION_SUBSCRIBE_VEHICLE_DATA, subscribeRequest, 
				ibisCommonPackage.getSubscribeResponse(), resourceSetFactory);	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#unsubscribeVehicleData(de.jena.mdo.ibis.common.UnsubscribeRequest)
	 */
	@Override
	public UnsubscribeResponse unsubscribeVehicleData(	UnsubscribeRequest unsubscribeRequest) {
		return IbisHttpRequestHelper.sendHttpRequest(host, port, CustomerInformationServiceConstants.SERVICE_NAME, 
				CustomerInformationServiceConstants.OPERATION_UNSUBSCRIBE_VEHICLE_DATA, unsubscribeRequest, 
				ibisCommonPackage.getUnsubscribeResponse(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisCustomerInformationService#retrievePartialStopSequence(de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceRetrievePartialStopSequenceRequest)
	 */
	@Override
	public PartialStopSequenceResponse retrievePartialStopSequence(
			PartialStopSequenceRequest request) {
		return IbisHttpRequestHelper.sendHttpRequest(host, port, CustomerInformationServiceConstants.SERVICE_NAME, 
				CustomerInformationServiceConstants.OPERATION_RETRIEVE_PARTIAL_STOP_SEQUENCE, request, 
				customerInfoServicePackage.getPartialStopSequenceResponse(), resourceSetFactory);
	}


}
