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
package de.jena.ibis.components;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

import de.jena.ibis.apis.GeneralIbisService;
import de.jena.ibis.apis.GeneralIbisTCPService;
import de.jena.ibis.apis.IbisCustomerInformationService;
import de.jena.ibis.apis.IbisTCPServiceConfig;
import de.jena.ibis.components.helper.CustomerInformationServiceConstants;
import de.jena.ibis.components.helper.IbisHttpRequestHelper;
import de.jena.ibis.components.helper.IbisSubscriptionHelper;
import de.jena.ibis.ibis_common.GeneralResponse;
import de.jena.ibis.ibis_common.IbisCommonPackage;
import de.jena.ibis.ibis_customerinformationservice.AllDataResponse;
import de.jena.ibis.ibis_customerinformationservice.CurrentAnnouncementResponse;
import de.jena.ibis.ibis_customerinformationservice.CurrentConnectionInformationResponse;
import de.jena.ibis.ibis_customerinformationservice.CurrentDisplayContentResponse;
import de.jena.ibis.ibis_customerinformationservice.CurrentStopIndexResponse;
import de.jena.ibis.ibis_customerinformationservice.CurrentStopPointResponse;
import de.jena.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage;
import de.jena.ibis.ibis_customerinformationservice.PartialStopSequenceRequest;
import de.jena.ibis.ibis_customerinformationservice.PartialStopSequenceResponse;
import de.jena.ibis.ibis_customerinformationservice.TripDataResponse;
import de.jena.ibis.ibis_customerinformationservice.VehicleDataResponse;


/**
 * 
 * @author ilenia
 * @since Jan 18, 2023
 */
@Component(name = "IbisCustomerInformationService", 
scope = ServiceScope.PROTOTYPE, service = {IbisCustomerInformationService.class, GeneralIbisTCPService.class, GeneralIbisService.class},
configurationPid = "IbisCustomerInformationService", configurationPolicy = ConfigurationPolicy.REQUIRE)
public class IbisCustomerInformationServiceImpl implements IbisCustomerInformationService {

	@Reference
	IbisCustomerInformationServicePackage customerInfoServicePackage;
	
	@Reference 
	IbisCommonPackage ibisCommonPackage;
	
	@Reference
	private ComponentServiceObjects<ResourceSet> resourceSetFactory;
	
    private final static Logger LOGGER = Logger.getLogger(IbisCustomerInformationServiceImpl.class.getName());

	private IbisTCPServiceConfig config;


	@Activate
	public void activate(IbisTCPServiceConfig config) {
		this.config = config;
		if(config.serviceIP().isEmpty() || config.servicePort().isEmpty()) {
			LOGGER.severe("config.serviceIP() and/or config.servicePort() are not properly set for IbisCustomerInformationService");
			throw new IllegalStateException("config.serviceIP() and/or config.servicePort() are not properly set for IbisCustomerInformationService");
		}
		if(config.serviceClientSubscriptionIP().isEmpty()) {
			LOGGER.severe("Client IP is not properly set for subscriptions in IbisCustomerInformationService");
			throw new IllegalStateException("Client IP is not properly set for subscriptions in IbisCustomerInformationService");
		}
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.ibis.apis.IbisCustomerInformationService#getAllData()
	 */
	@Override
	public AllDataResponse getAllData() {
		return IbisHttpRequestHelper.sendHttpRequest(config.serviceIP(), config.servicePort(), CustomerInformationServiceConstants.SERVICE_NAME, 
				CustomerInformationServiceConstants.OPERATION_GET_ALL_DATA, null, 
				customerInfoServicePackage.getAllDataResponse(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.ibis.apis.IbisCustomerInformationService#getCurrentAnnouncement()
	 */
	@Override
	public CurrentAnnouncementResponse getCurrentAnnouncement() {
		return IbisHttpRequestHelper.sendHttpRequest(config.serviceIP(), config.servicePort(), CustomerInformationServiceConstants.SERVICE_NAME, 
				CustomerInformationServiceConstants.OPERATION_GET_CURRENT_ANNOUNCEMENT, null, 
				customerInfoServicePackage.getCurrentAnnouncementResponse(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.ibis.apis.IbisCustomerInformationService#getCurrentConnectionInformation()
	 */
	@Override
	public CurrentConnectionInformationResponse getCurrentConnectionInformation() {
		return IbisHttpRequestHelper.sendHttpRequest(config.serviceIP(), config.servicePort(), CustomerInformationServiceConstants.SERVICE_NAME, 
				CustomerInformationServiceConstants.OPERATION_GET_CURRENT_CONNECTION_INFO, null, 
				customerInfoServicePackage.getCurrentConnectionInformationResponse(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.ibis.apis.IbisCustomerInformationService#getCurrentDisplayContent()
	 */
	@Override
	public CurrentDisplayContentResponse getCurrentDisplayContent() {
		return IbisHttpRequestHelper.sendHttpRequest(config.serviceIP(), config.servicePort(), CustomerInformationServiceConstants.SERVICE_NAME, 
				CustomerInformationServiceConstants.OPERATION_GET_CURRENT_DISPLAY_CONTENT, null, 
				customerInfoServicePackage.getCurrentDisplayContentResponse(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.ibis.apis.IbisCustomerInformationService#getCurrentStopPoint()
	 */
	@Override
	public CurrentStopPointResponse getCurrentStopPoint() {
		return IbisHttpRequestHelper.sendHttpRequest(config.serviceIP(), config.servicePort(), CustomerInformationServiceConstants.SERVICE_NAME, 
				CustomerInformationServiceConstants.OPERATION_GET_CURRENT_STOP_POINT, null, 
				customerInfoServicePackage.getCurrentStopPointResponse(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.ibis.apis.IbisCustomerInformationService#getCurrentStopIndex()
	 */
	@Override
	public CurrentStopIndexResponse getCurrentStopIndex() {
		return IbisHttpRequestHelper.sendHttpRequest(config.serviceIP(), config.servicePort(), CustomerInformationServiceConstants.SERVICE_NAME, 
				CustomerInformationServiceConstants.OPERATION_GET_CURRENT_STOP_INDEX, null, 
				customerInfoServicePackage.getCurrentStopIndexResponse(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.ibis.apis.IbisCustomerInformationService#getTripData()
	 */
	@Override
	public TripDataResponse getTripData() {
		return IbisHttpRequestHelper.sendHttpRequest(config.serviceIP(), config.servicePort(), CustomerInformationServiceConstants.SERVICE_NAME, 
				CustomerInformationServiceConstants.OPERATION_GET_TRIP_DATA, null,
				customerInfoServicePackage.getTripDataResponse(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.ibis.apis.IbisCustomerInformationService#getVehicleData()
	 */
	@Override
	public VehicleDataResponse getVehicleData() {
		return IbisHttpRequestHelper.sendHttpRequest(config.serviceIP(), config.servicePort(), CustomerInformationServiceConstants.SERVICE_NAME, 
				CustomerInformationServiceConstants.OPERATION_GET_VEHICLE_DATA, null, 
				customerInfoServicePackage.getVehicleDataResponse(), resourceSetFactory);
	}

	
	/* 
	 * (non-Javadoc)
	 * @see de.jena.ibis.apis.IbisCustomerInformationService#subscribeAllData()
	 */
	@Override
	public Integer subscribeAllData() {
		return doSendSubscriptionRequest(CustomerInformationServiceConstants.OPERATION_SUBSCRIBE_ALL_DATA);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.ibis.apis.IbisCustomerInformationService#unsubscribeAllData(de.jena.ibis.common.UnsubscribeRequest)
	 */
	@Override
	public Integer unsubscribeAllData() {
		return doSendSubscriptionRequest(CustomerInformationServiceConstants.OPERATION_UNSUBSCRIBE_ALL_DATA);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.ibis.apis.IbisCustomerInformationService#subscribeCurrentAnnouncement(de.jena.ibis.common.SubscribeRequest)
	 */
	@Override
	public Integer subscribeCurrentAnnouncement() {
		return doSendSubscriptionRequest(CustomerInformationServiceConstants.OPERATION_SUBSCRIBE_CURRENT_ANNOUNCEMENT);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.ibis.apis.IbisCustomerInformationService#unsubscribeCurrentAnnouncement(de.jena.ibis.common.UnsubscribeRequest)
	 */
	@Override
	public Integer unsubscribeCurrentAnnouncement() {
		return doSendSubscriptionRequest(CustomerInformationServiceConstants.OPERATION_UNSUBSCRIBE_CURRENT_ANNOUNCEMENT);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.ibis.apis.IbisCustomerInformationService#subscribeCurrentConnectionInformation(de.jena.ibis.common.SubscribeRequest)
	 */
	@Override
	public Integer subscribeCurrentConnectionInformation() {
		return doSendSubscriptionRequest(CustomerInformationServiceConstants.OPERATION_SUBSCRIBE_CURRENT_CONNECTION_INFO);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.ibis.apis.IbisCustomerInformationService#unsubscribeCurrentConnectionInformation(de.jena.ibis.common.UnsubscribeRequest)
	 */
	@Override
	public Integer unsubscribeCurrentConnectionInformation() {
		return doSendSubscriptionRequest(CustomerInformationServiceConstants.OPERATION_UNSUBSCRIBE_CURRENT_CONNECTION_INFO);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.ibis.apis.IbisCustomerInformationService#subscribeCurrentDisplayContent(de.jena.ibis.common.SubscribeRequest)
	 */
	@Override
	public Integer subscribeCurrentDisplayContent() {
		return doSendSubscriptionRequest(CustomerInformationServiceConstants.OPERATION_SUBSCRIBE_CURRENT_DISPLAY_CONTENT);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.ibis.apis.IbisCustomerInformationService#unsubscribeCurrentDisplayContent(de.jena.ibis.common.UnsubscribeRequest)
	 */
	@Override
	public Integer unsubscribeCurrentDisplayContent() {
		return doSendSubscriptionRequest(CustomerInformationServiceConstants.OPERATION_UNSUBSCRIBE_CURRENT_DISPLAY_CONTENT);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.ibis.apis.IbisCustomerInformationService#subscribeCurrentStopPoint(de.jena.ibis.common.SubscribeRequest)
	 */
	@Override
	public Integer subscribeCurrentStopPoint() {
		return doSendSubscriptionRequest(CustomerInformationServiceConstants.OPERATION_SUBSCRIBE_CURRENT_STOP_POINT);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.ibis.apis.IbisCustomerInformationService#unsubscribeCurrentStopPoint(de.jena.ibis.common.UnsubscribeRequest)
	 */
	@Override
	public Integer unsubscribeCurrentStopPoint() {
		return doSendSubscriptionRequest(CustomerInformationServiceConstants.OPERATION_UNSUBSCRIBE_CURRENT_STOP_POINT);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.ibis.apis.IbisCustomerInformationService#subscribeCurrentStopIndex(de.jena.ibis.common.SubscribeRequest)
	 */
	@Override
	public Integer subscribeCurrentStopIndex() {
		return doSendSubscriptionRequest(CustomerInformationServiceConstants.OPERATION_SUBSCRIBE_CURRENT_STOP_INDEX);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.ibis.apis.IbisCustomerInformationService#unsubscribeCurrentStopIndex(de.jena.ibis.common.UnsubscribeRequest)
	 */
	@Override
	public Integer unsubscribeCurrentStopIndex() {
		return doSendSubscriptionRequest(CustomerInformationServiceConstants.OPERATION_UNSUBSCRIBE_CURRENT_STOP_INDEX);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.ibis.apis.IbisCustomerInformationService#subscribeTripData(de.jena.ibis.common.SubscribeRequest)
	 */
	@Override
	public Integer subscribeTripData() {
		return doSendSubscriptionRequest(CustomerInformationServiceConstants.OPERATION_SUBSCRIBE_TRIP_DATA);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.ibis.apis.IbisCustomerInformationService#unsubscribeTripData(de.jena.ibis.common.UnsubscribeRequest)
	 */
	@Override
	public Integer unsubscribeTripData() {
		return doSendSubscriptionRequest(CustomerInformationServiceConstants.OPERATION_UNSUBSCRIBE_TRIP_DATA);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.ibis.apis.IbisCustomerInformationService#subscribeVehicleData(de.jena.ibis.common.SubscribeRequest)
	 */
	@Override
	public Integer subscribeVehicleData() {
		return doSendSubscriptionRequest(CustomerInformationServiceConstants.OPERATION_SUBSCRIBE_VEHICLE_DATA);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.ibis.apis.IbisCustomerInformationService#unsubscribeVehicleData(de.jena.ibis.common.UnsubscribeRequest)
	 */
	@Override
	public Integer unsubscribeVehicleData(	) {
		return doSendSubscriptionRequest(CustomerInformationServiceConstants.OPERATION_UNSUBSCRIBE_VEHICLE_DATA);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.ibis.apis.IbisCustomerInformationService#retrievePartialStopSequence(de.jena.ibis.customerinformationservice.CustomerInformationServiceRetrievePartialStopSequenceRequest)
	 */
	@Override
	public PartialStopSequenceResponse retrievePartialStopSequence(
			PartialStopSequenceRequest request) {
		return IbisHttpRequestHelper.sendHttpRequest(config.serviceIP(), config.servicePort(), CustomerInformationServiceConstants.SERVICE_NAME, 
				CustomerInformationServiceConstants.OPERATION_RETRIEVE_PARTIAL_STOP_SEQUENCE, request, 
				customerInfoServicePackage.getPartialStopSequenceResponse(), resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.ibis.apis.GeneralIbisService#executeGetOperation(java.lang.String)
	 */
	@Override
	public GeneralResponse executeGetOperation(String operation) {
		switch(operation) {
		case CustomerInformationServiceConstants.OPERATION_GET_ALL_DATA:
			return getAllData();
		case CustomerInformationServiceConstants.OPERATION_GET_CURRENT_ANNOUNCEMENT:
			return getCurrentAnnouncement();
		case CustomerInformationServiceConstants.OPERATION_GET_CURRENT_CONNECTION_INFO:
			return getCurrentConnectionInformation();
		case CustomerInformationServiceConstants.OPERATION_GET_CURRENT_DISPLAY_CONTENT:
			return getCurrentDisplayContent();
		case CustomerInformationServiceConstants.OPERATION_GET_CURRENT_STOP_INDEX:
			return getCurrentStopIndex();
		case CustomerInformationServiceConstants.OPERATION_GET_CURRENT_STOP_POINT:
			return getCurrentStopPoint();
		case CustomerInformationServiceConstants.OPERATION_GET_TRIP_DATA:
			return getTripData();
		case CustomerInformationServiceConstants.OPERATION_GET_VEHICLE_DATA:
			return getVehicleData();
		default:
			throw new IllegalArgumentException(String.format("Operation %s not implemented for %s!", operation, config.serviceName()));			
		}
	}
	
	/* 
	 * (non-Javadoc)
	 * @see de.jena.ibis.apis.GeneralIbisTCPService#executeAllGetOperations()
	 */
	@Override
	public List<GeneralResponse> executeAllGetOperations() {
		List<GeneralResponse> results = new ArrayList<>();
		results.add(getAllData());
		results.add(getCurrentAnnouncement());
		results.add(getCurrentConnectionInformation());
		results.add(getCurrentDisplayContent());
		results.add(getCurrentStopIndex());
		results.add(getCurrentStopPoint());
		results.add(getTripData());
		results.add(getVehicleData());
		return results;
	}

	private Integer executeSubscriptionOperation(String operation) {
		return doSendSubscriptionRequest(operation);
	}
	
	private Integer doSendSubscriptionRequest(String operation) {
		return IbisSubscriptionHelper.sendSubscriptionRequest(config, operation, ibisCommonPackage, resourceSetFactory);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.ibis.apis.GeneralIbisTCPService#getServiceName()
	 */
	@Override
	public String getServiceName() {
		return config.serviceName();
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.ibis.apis.GeneralIbisTCPService#getServiceId()
	 */
	@Override
	public String getServiceId() {
		return config.serviceId();
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.ibis.apis.GeneralIbisTCPService#executeAllSubscriptionOperations()
	 */
	@Override
	public List<Integer> executeAllSubscriptionOperations() {
		List<Integer> results = new ArrayList<>();
		CustomerInformationServiceConstants.getAllSubscriptionOperations().forEach(operation -> {
			results.add(executeSubscriptionOperation(operation));
		});
		return results;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.ibis.apis.GeneralIbisTCPService#executeAllUnsubscriptionOperations()
	 */
	@Override
	public List<Integer> executeAllUnsubscriptionOperations() {
		List<Integer> results = new ArrayList<>();
		CustomerInformationServiceConstants.getAllUnsubscriptionOperations().forEach(operation -> {
			results.add(executeSubscriptionOperation(operation));
		});
		return results;
	}

	
}
