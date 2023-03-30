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

import java.io.IOException;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Map;
import java.util.logging.Logger;

import org.osgi.service.cm.Configuration;
import org.osgi.service.cm.ConfigurationAdmin;
import org.osgi.service.cm.annotations.RequireConfigurationAdmin;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.component.annotations.ReferencePolicyOption;

import de.jena.ibis.apis.GeneralIbisTCPService;
import de.jena.ibis.apis.GeneralIbisUDPService;
import de.jena.ibis.apis.IbisDeviceConfiguratorConfig;

/**
 * 
 * @author ilenia
 * @since Mar 29, 2023
 */
@Component(configurationPid = "IbisDeviceConfigurator", configurationPolicy = ConfigurationPolicy.REQUIRE)
@RequireConfigurationAdmin
public class IbisDeviceConfigurator {

	public static final String TCP_SERVICE_TARGET_FILTER = "IbisTCPService.ref";
	public static final String UDP_SERVICE_TARGET_FILTER = "IbisUDPService.ref";
	private static final Logger LOGGER = Logger.getLogger(IbisDeviceConfigurator.class.getName());

	private ConfigurationAdmin configAdmin;
	private IbisDeviceConfiguratorConfig config;

	@Activate
	public IbisDeviceConfigurator(IbisDeviceConfiguratorConfig config, @Reference ConfigurationAdmin configAdmin) throws IOException  {
		this.config = config;
		this.configAdmin = configAdmin;
		String[] tcpServices = config.refTCPServices();
		for(String service : tcpServices) {
			updateServiceConfig(service);
		}
		String[] udpServices = config.refUDPServices();
		for(String service : udpServices) {
			updateServiceConfig(service);
		}
	}
	
	@Reference(cardinality = ReferenceCardinality.MULTIPLE, policy = ReferencePolicy.DYNAMIC,
			name = TCP_SERVICE_TARGET_FILTER,
			policyOption = ReferencePolicyOption.GREEDY, unbind = "unbindIbisTCPService")
	protected void bindIbisTCPService(GeneralIbisTCPService ibisService, Map<String, Object> properties) throws IOException {
		
		LOGGER.fine(()->"Binding IbisService " + ibisService.getServiceId());
//		ibisService.executeAllSubscriptionOperations();
		
	}

	protected void unbindIbisTCPService(GeneralIbisTCPService ibisService) {
		LOGGER.fine(()->"Unbinding IbisService " + ibisService.getServiceId());
//		ibisService.executeAllUnsubscriptionOperations();
	}
	
	@Reference(cardinality = ReferenceCardinality.MULTIPLE, policy = ReferencePolicy.DYNAMIC,
			name = UDP_SERVICE_TARGET_FILTER,
			policyOption = ReferencePolicyOption.GREEDY, unbind = "unbindIbisUDPService")
	protected void bindIbisUDPService(GeneralIbisUDPService ibisService, Map<String, Object> properties) throws IOException {
		
		LOGGER.fine(()->"Binding IbisService " + ibisService.getServiceId());
		ibisService.executeAllSubscriptionOperations();
		
	}

	protected void unbindIbisUDPService(GeneralIbisUDPService ibisService) {
		LOGGER.fine(()->"Unbinding IbisService " + ibisService.getServiceId());
//		ibisService.executeAllUnsubscriptionOperations();
	}
	
	private void updateServiceConfig(String service) throws IOException {		
		String factoryPid = service;
		Configuration serviceConfig = configAdmin.getFactoryConfiguration(factoryPid, config.deviceId(), "?");
		if(isSupportedTCPService(service)) {
			String servicePort = determineServicePort(service);
			serviceConfig.update(createTCPServiceProperties(service, servicePort));
		} else if(isSupportedUDPService(service)) {
			serviceConfig.update(createUDPServiceProperties(service));
		} else {
			throw new IllegalArgumentException(String.format("Unsupported Ibis Service %s", service));
		}				
	}
	
	private String determineServicePort(String service) {
		switch(service) {
		case "IbisCustomerInformationService":
			return config.customerInfoServicePort();
		case "IbisTicketValidationService":
			return config.ticketValidationServicePort();
		default:
			return null;
		}
	}
	
	private boolean isSupportedTCPService(String service) {
		if("IbisCustomerInformationService".equals(service) ||
				"IbisTicketValidationService".equals(service) ||
				"IbisDeviceManagementService".equals(service)) {
			return true;
		}
		return false;
	}
	
	private boolean isSupportedUDPService(String service) {
		if("IbisGNSSLocationService".equals(service)) return true;
		return false;
	}
	
	private Dictionary<String, Object> createTCPServiceProperties(String service, String servicePort) {
		Dictionary<String, Object> props = new Hashtable<String, Object>();
		props.put("serviceType", "TCP");
		props.put(TCP_SERVICE_TARGET_FILTER + ".target", "(deviceId="+config.deviceId()+")");
		props.put("deviceId", config.deviceId());
		props.put("serviceName", service);
		props.put("serviceId", service+"-"+config.deviceId());
		props.put("serviceIP", config.deviceIP());
		props.put("servicePort", servicePort);
		props.put("serviceClientSubscriptionPort", config.clientSubscriptionPort());
		props.put("serviceClientSubscriptionIP", config.clientSubscriptionIP());
		return props;
	}
	
	private Dictionary<String, Object> createUDPServiceProperties(String service) {
		Dictionary<String, Object> props = new Hashtable<String, Object>();
		props.put("serviceType", "UDP");
		props.put(UDP_SERVICE_TARGET_FILTER + ".target", "(deviceId="+config.deviceId()+")");
		props.put("deviceId", config.deviceId());
		props.put("serviceName", service);
		props.put("serviceId", service+"-"+config.deviceId());
		props.put("serviceIP", config.deviceIP());
		props.put("listenerNetworkInterface", config.updListenerNetworkInterface());
		props.put("multiCastGroupPort", config.udpMultiCastGroupPort());
		props.put("multiCastGroupIP", config.udpMultiCastGroupIP());
		props.put("listenerPort", config.udpListenerPort());
		return props;
	}
}
