///**
// * Copyright (c) 2012 - 2023 Data In Motion and others.
// * All rights reserved. 
// * 
// * This program and the accompanying materials are made available under the terms of the 
// * Eclipse Public License v1.0 which accompanies this distribution, and is available at
// * http://www.eclipse.org/legal/epl-v10.html
// * 
// * Contributors:
// *     Data In Motion - initial API and implementation
// */
//package de.jena.ibis.components;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//import org.eclipse.emf.ecore.EObject;
//import org.osgi.framework.BundleContext;
//import org.osgi.framework.InvalidSyntaxException;
//import org.osgi.framework.ServiceReference;
//import org.osgi.service.component.annotations.Activate;
//import org.osgi.service.component.annotations.Component;
//import org.osgi.service.component.annotations.ConfigurationPolicy;
//import org.osgi.service.component.annotations.Deactivate;
//import org.osgi.service.component.annotations.ServiceScope;
//import org.osgi.util.pushstream.PushEventSource;
//
//import de.jena.ibis.apis.GeneralIbisTCPService;
//import de.jena.ibis.apis.GeneralIbisUDPService;
//import de.jena.ibis.apis.IbisDeviceConfigurator;
//import de.jena.ibis.apis.IbisDeviceConfiguratorConfig;
//
//
///**
// * 
// * @author ilenia
// * @since Mar 27, 2023
// */
//@Component(name = "IbisDeviceConfigurator", scope = ServiceScope.PROTOTYPE, configurationPid = "IbisDeviceConfigurator", configurationPolicy = ConfigurationPolicy.REQUIRE)
//public class IbisDeviceConfiguratorImpl implements IbisDeviceConfigurator {
//	
//	private final static Logger LOGGER = Logger.getLogger(IbisDeviceConfiguratorImpl.class.getName());
//	
//	private IbisDeviceConfiguratorConfig  config;
//	private Map<String, Integer> tcpSubscriptionsMap = new HashMap<>();
//	private Map<String, PushEventSource<? extends EObject>> udpSubscriptionsMap = new HashMap<>();
//	private Map<String, GeneralIbisTCPService> tcpServices = new HashMap<>();
//	private Map<String, GeneralIbisUDPService> udpServices = new HashMap<>();
//	
//	
//	@Activate
//	public IbisDeviceConfiguratorImpl(IbisDeviceConfiguratorConfig config, BundleContext bundleCtx) {		
//		this.config = config;
//		addTCPServices(bundleCtx);
//		addUDPServices(bundleCtx);
//		performTCPSubscriptions();
//		performUDPSubscriptions();
//		LOGGER.info(String.format("Activated IbisDeviceConfigurator for %s ", config.deviceName()));
//	}
//	
//	
//	/* 
//	 * (non-Javadoc)
//	 * @see de.jena.ibis.apis.IbisDeviceConfigurator#executeTCPServiceOperation(java.lang.String)
//	 */
//	@Override
//	public Integer executeTCPServiceOperation(String operation) {
//		String[] split = operation.split("-");
//		if(split.length != 2) {
//			LOGGER.log(Level.WARNING, String.format("Operation %s is not in the right format <serviceName>.<operationName>. Skipping it.", operation));
//			return null;
//		}
//		String serviceName = split[0];
//		String action = split[1];
//		if(tcpServices.containsKey(serviceName)) {
//			return tcpServices.get(serviceName).executeSubscriptionOperation(action);
//		} else {
//			LOGGER.log(Level.SEVERE, String.format("No service %s was listed as refTCPServices or found from BundleContext. Cannot perform operation %s", serviceName, action));
//			return null;
//		}
//	}
//	
//	/* 
//	 * (non-Javadoc)
//	 * @see de.jena.ibis.apis.IbisDeviceConfigurator#executeTCPServiceOperation(java.lang.String)
//	 */
//	@Override
//	public PushEventSource<? extends EObject> executeUDPServiceOperation(String operation) {
//		String[] split = operation.split("-");
//		if(split.length != 2) {
//			LOGGER.log(Level.WARNING, String.format("Operation %s is not in the right format <serviceName>.<operationName>. Skipping it.", operation));
//			return null;
//		}
//		String serviceName = split[0];
//		String action = split[1];
//		if(udpServices.containsKey(serviceName)) {
//			return udpServices.get(serviceName).executeOperation(action);
//		} else {
//			LOGGER.log(Level.SEVERE, String.format("No service %s was listed as refUDPServices or found from BundleContext. Cannot perform operation %s", serviceName, action));
//			return null;
//		}
//	}
//	
//	/* 
//	 * (non-Javadoc)
//	 * @see de.jena.ibis.apis.IbisDeviceConfigurator#getAllActiveUDPSubscriptions()
//	 */
//	@Override
//	public Map<String, PushEventSource<? extends EObject>> getAllActiveUDPSubscriptions() {
//		return Map.copyOf(udpSubscriptionsMap);
//	}
//	
//	/* 
//	 * (non-Javadoc)
//	 * @see de.jena.ibis.apis.IbisDeviceConfigurator#getAllActiveTCPSubscriptions()
//	 */
//	@Override
//	public Map<String, Integer> getAllActiveTCPSubscriptions() {
//		return Map.copyOf(tcpSubscriptionsMap);
//	}
//	
//	/* 
//	 * (non-Javadoc)
//	 * @see de.jena.ibis.apis.IbisDeviceConfigurator#getServiceNames()
//	 */
//	@Override
//	public List<String> getServiceNames() {
//		List<String> serviceNames = new ArrayList<>();
//		serviceNames.addAll(tcpServices.keySet().stream().toList());
//		serviceNames.addAll(udpServices.keySet().stream().toList());
//		return serviceNames;
//	}
//	
//	@Deactivate
//	public void deactivate() {
//		tcpSubscriptionsMap.keySet().forEach(operation -> {
//			String[] split = operation.split("-");
//			String action = split[1];
//			if(action.startsWith("Subscribe")) {
//				action = action.replaceFirst("Subscribe", "Unsubscribe");
//				Integer responseStatus = executeTCPServiceOperation(operation);
//				if(responseStatus != 200) {
//					LOGGER.log(Level.SEVERE, String.format("Operation %s was performed but returned an HTTP status of %d", operation, responseStatus));
//				}
//			}
//		});
//		tcpSubscriptionsMap.clear();
////		TODO: not sure whether we need to do something here for udp
//		udpSubscriptionsMap.clear();
//	}
//	
//	@SuppressWarnings("unchecked")
//	private void addTCPServices(BundleContext bundleCtx) {
//		for(String service : config.refTCPServices()) {
//			String[] split = service.split("-");
//			String serviceName = "", serviceFilter = "";
//			if(split.length == 1) {
//				serviceName = split[0];
//			} else if(split.length == 2) {
//				serviceName = split[0];
//				serviceFilter = split[1];
//			} else {
//				LOGGER.log(Level.SEVERE, String.format("Service %s in refService config property is not properly formatted. It should be in the form <serviceClassName>.<serviceFilter>", service));
//				continue;
//			}
//			try {
//				ServiceReference<GeneralIbisTCPService>[] serviceReferences = (ServiceReference<GeneralIbisTCPService>[]) bundleCtx.getServiceReferences(serviceName, serviceFilter);
//				if(serviceReferences == null || serviceReferences.length == 0) {
//					LOGGER.log(Level.SEVERE, String.format("No service of class name %s and filter %s found!", serviceName, serviceFilter));
//					continue;
//				}
//				else if(serviceReferences.length > 1) {
//					LOGGER.log(Level.SEVERE, String.format("More than one service of class name %s and filter %s found! Keeping only the first one.", serviceName, serviceFilter));
//				}
//				tcpServices.put(serviceName, bundleCtx.getService(serviceReferences[0]));
//			} catch(InvalidSyntaxException e) {
//				LOGGER.log(Level.SEVERE, e.getMessage());
//				e.printStackTrace();
//			}
//		}
//	}
//	
//	@SuppressWarnings("unchecked")
//	private void addUDPServices(BundleContext bundleCtx) {
//		for(String service : config.refUDPServices()) {
//			String[] split = service.split("-");
//			String serviceName = "", serviceFilter = "";
//			if(split.length == 1) {
//				serviceName = split[0];
//			} else if(split.length == 2) {
//				serviceName = split[0];
//				serviceFilter = split[1];
//			} else {
//				LOGGER.log(Level.SEVERE, String.format("Service %s in refService config property is not properly formatted. It should be in the form <serviceClassName>.<serviceFilter>", service));
//				continue;
//			}
//			try {
//				ServiceReference<GeneralIbisUDPService>[] serviceReferences = (ServiceReference<GeneralIbisUDPService>[]) bundleCtx.getServiceReferences(serviceName, serviceFilter);
//				if(serviceReferences == null || serviceReferences.length == 0) {
//					LOGGER.log(Level.SEVERE, String.format("No service of class name %s and filter %s found!", serviceName, serviceFilter));
//					continue;
//				}
//				else if(serviceReferences.length > 1) {
//					LOGGER.log(Level.SEVERE, String.format("More than one service of class name %s and filter %s found! Keeping only the first one.", serviceName, serviceFilter));
//				}
//				udpServices.put(serviceName, bundleCtx.getService(serviceReferences[0]));
//			} catch(InvalidSyntaxException e) {
//				LOGGER.log(Level.SEVERE, e.getMessage());
//				e.printStackTrace();
//			}
//		}
//	}
//
//	private void performTCPSubscriptions() {
//		String[] operations = config.tcpOperations();
//		for(String operation : operations) {
//			Integer responseStatus = executeTCPServiceOperation(operation);
//			if(responseStatus == 200) {
//				tcpSubscriptionsMap.put(operation, responseStatus);
////				TODO: we need to set up a way for listening to this subscriptions. Or we do it directly on the service side.
//			} else {
//				LOGGER.log(Level.SEVERE, String.format("Operation %s was performed but returned an HTTP status of %d", operation, responseStatus));
//			}
//		}
//	}
//	
//	private void performUDPSubscriptions() {
//		String[] operations = config.udpOperations();
//		for(String operation : operations) {
//			PushEventSource<? extends EObject> eventSource = executeUDPServiceOperation(operation);
//			if(eventSource != null) {
//				udpSubscriptionsMap.put(operation, eventSource);
//			} else {
//				LOGGER.log(Level.SEVERE, String.format("Operation %s was performed but PushEventSource is null", operation));
//			}
//		}
//	}
//
//
//	
//}
