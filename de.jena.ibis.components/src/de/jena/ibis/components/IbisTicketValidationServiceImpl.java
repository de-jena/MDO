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

import org.apache.commons.lang3.NotImplementedException;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

import de.jena.ibis.apis.GeneralIbisService;
import de.jena.ibis.apis.GeneralIbisTCPService;
import de.jena.ibis.apis.IbisTCPServiceConfig;
import de.jena.ibis.apis.IbisTicketValidationService;
import de.jena.ibis.components.helper.IbisSubscriptionHelper;
import de.jena.ibis.components.helper.TicketValidationServiceConstants;
import de.jena.ibis.ibis_common.GeneralResponse;
import de.jena.ibis.ibis_common.IbisCommonPackage;

/**
 * 
 * @author ilenia
 * @since Mar 30, 2023
 */
@Component(name = "IbisTicketValidationService", 
scope = ServiceScope.PROTOTYPE, service = {IbisTicketValidationService.class, GeneralIbisTCPService.class, GeneralIbisService.class},
configurationPid = "IbisTicketValidationService", configurationPolicy = ConfigurationPolicy.REQUIRE)
public class IbisTicketValidationServiceImpl implements IbisTicketValidationService {
	
	@Reference 
	IbisCommonPackage ibisCommonPackage;
	
	@Reference
	private ComponentServiceObjects<ResourceSet> resourceSetFactory;
	
    private final static Logger LOGGER = Logger.getLogger(IbisTicketValidationServiceImpl.class.getName());

	private IbisTCPServiceConfig config;


	@Activate
	public void activate(IbisTCPServiceConfig config) {
		this.config = config;
		if(config.serviceIP().isEmpty() || config.servicePort().isEmpty()) {
			LOGGER.severe("config.serviceIP() and/or config.servicePort() are not properly set for IbisTicketValidationService");
			throw new IllegalStateException("config.serviceIP() and/or config.servicePort() are not properly set for IbisTicketValidationService");
		}
		if(config.serviceClientSubscriptionIP().isEmpty()) {
			LOGGER.severe("Client IP is not properly set for subscriptions in IbisTicketValidationService");
			throw new IllegalStateException("Client IP is not properly set for subscriptions in IbisTicketValidationService");
		}
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
	 * @see de.jena.ibis.apis.GeneralIbisTCPService#executeGetOperation(java.lang.String)
	 */
	@Override
	public GeneralResponse executeGetOperation(String operation) {
		throw new NotImplementedException("No GET operations currently implemented for TicketValidationService");
	}
	
	/* 
	 * (non-Javadoc)
	 * @see de.jena.ibis.apis.GeneralIbisTCPService#executeAllGetOperations()
	 */
	@Override
	public List<GeneralResponse> executeAllGetOperations() {
		throw new NotImplementedException("No GET operations currently implemented for TicketValidationService");
	}

	private Integer executeSubscriptionOperation(String operation) {
		return doSendSubscriptionRequest(operation);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.ibis.apis.GeneralIbisTCPService#executeAllSubscriptionOperations()
	 */
	@Override
	public List<Integer> executeAllSubscriptionOperations() {
		List<Integer> results = new ArrayList<>(); 
		TicketValidationServiceConstants.getAllSubscriptionOperations().forEach(operation -> {
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
		TicketValidationServiceConstants.getAllUnsubscriptionOperations().forEach(operation -> {
			 results.add(executeSubscriptionOperation(operation));
		 });
		return results;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.ibis.apis.IbisTicketValidationService#subscribeCurrentTariffStop()
	 */
	@Override
	public Integer subscribeCurrentTariffStop() {
		return doSendSubscriptionRequest(TicketValidationServiceConstants.OPERATION_SUBSCRIBE_CURRENT_TARIFF_STOP);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.ibis.apis.IbisTicketValidationService#unsubscribeCurrentTariffStop()
	 */
	@Override
	public Integer unsubscribeCurrentTariffStop() {
		return doSendSubscriptionRequest(TicketValidationServiceConstants.OPERATION_UNSUBSCRIBE_CURRENT_TARIFF_STOP);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.ibis.apis.IbisTicketValidationService#subscribeRazzia()
	 */
	@Override
	public Integer subscribeRazzia() {
		return doSendSubscriptionRequest(TicketValidationServiceConstants.OPERATION_SUBSCRIBE_RAZZIA);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.ibis.apis.IbisTicketValidationService#unsubscribeRazzia()
	 */
	@Override
	public Integer unsubscribeRazzia() {
		return doSendSubscriptionRequest(TicketValidationServiceConstants.OPERATION_UNSUBSCRIBE_RAZZIA);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.ibis.apis.IbisTicketValidationService#subscribeCurrentLine()
	 */
	@Override
	public Integer subscribeCurrentLine() {
		return doSendSubscriptionRequest(TicketValidationServiceConstants.OPERATION_SUBSCRIBE_CURRENT_LINE);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.ibis.apis.IbisTicketValidationService#unsubscribeCurrentLine()
	 */
	@Override
	public Integer unsubscribeCurrentLine() {
		return doSendSubscriptionRequest(TicketValidationServiceConstants.OPERATION_UNSUBSCRIBE_CURRENT_LINE);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.ibis.apis.IbisTicketValidationService#subscribeVehicleData()
	 */
	@Override
	public Integer subscribeVehicleData() {
		return doSendSubscriptionRequest(TicketValidationServiceConstants.OPERATION_SUBSCRIBE_VEHICLE_DATA);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.ibis.apis.IbisTicketValidationService#unsubscribeVehicleData()
	 */
	@Override
	public Integer unsubscribeVehicleData() {
		return doSendSubscriptionRequest(TicketValidationServiceConstants.OPERATION_UNSUBSCRIBE_VEHICLE_DATA);
	}
	
	private Integer doSendSubscriptionRequest(String operation) {
		return IbisSubscriptionHelper.sendSubscriptionRequest(config, operation, ibisCommonPackage, resourceSetFactory);
	}

	
}
