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
//import java.io.BufferedInputStream;
//import java.io.ByteArrayInputStream;
//import java.io.IOException;
//import java.net.DatagramPacket;
//import java.net.InetAddress;
//import java.net.InetSocketAddress;
//import java.net.MulticastSocket;
//import java.net.NetworkInterface;
//import java.net.SocketTimeoutException;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.concurrent.Executors;
//import java.util.logging.Logger;
//
//import org.eclipse.emf.common.util.URI;
//import org.eclipse.emf.ecore.resource.Resource;
//import org.eclipse.emf.ecore.resource.ResourceSet;
//import org.eclipse.emf.ecore.xmi.XMLResource;
//import org.osgi.service.cm.ConfigurationException;
//import org.osgi.service.component.ComponentServiceObjects;
//import org.osgi.service.component.annotations.Activate;
//import org.osgi.service.component.annotations.Component;
//import org.osgi.service.component.annotations.ConfigurationPolicy;
//import org.osgi.service.component.annotations.Reference;
//import org.osgi.service.component.annotations.ServiceScope;
//import org.osgi.util.promise.PromiseFactory;
//import org.osgi.util.pushstream.PushEventSource;
//import org.osgi.util.pushstream.PushStreamProvider;
//import org.osgi.util.pushstream.SimplePushEventSource;
//
//import de.jena.ibis.apis.GeneralIbisUDPService;
//import de.jena.ibis.apis.IbisGNSSLocationService;
//import de.jena.ibis.apis.IbisUDPServiceConfig;
//import de.jena.ibis.ibis_gnsslocationservice.GNSSLocationData;
//
///**
// * 
// * @author ilenia
// * @since Jan 18, 2023
// */
//@Component(name = "IbisGNSSLocationService", 
//scope = ServiceScope.PROTOTYPE, service = {IbisGNSSLocationService.class, GeneralIbisUDPService.class},
//configurationPid = "IbisGNSSLocationService", configurationPolicy = ConfigurationPolicy.REQUIRE)
//public class IbisGNSSLocationServiceImplOld implements IbisGNSSLocationService {
//
//	@Reference
//	private ComponentServiceObjects<ResourceSet> rsFactory;
//
//	private final static Logger LOGGER = Logger.getLogger(IbisDeviceManagementServiceImpl.class.getName());
//	private IbisUDPServiceConfig config;
//	private PromiseFactory promiseFactory = new PromiseFactory(Executors.newFixedThreadPool(4));
//	private PushStreamProvider pushStreamProvider = new PushStreamProvider();
//
//
//	@Activate
//	public void activate(IbisUDPServiceConfig config) throws ConfigurationException{
//		this.config = config;
//		if(config.multiCastGroupIP().isEmpty()) {
//			LOGGER.severe("Multicast Group for UDP Communication is not properly set for IbisGNSSLocationService");
//			throw new ConfigurationException("multiCastGroupIP", "Multicast Group for UDP Communication is not properly set for IbisGNSSLocationService");
//		} else if(config.multiCastGroupPort() == 0) {
//			LOGGER.severe("Multicast Group Port for UDP Communication is not properly set for IbisGNSSLocationService");
//			throw new ConfigurationException("multiCastGroupPort", "Listener Port for UDP Communication is not properly set for IbisGNSSLocationService");
//		} else if(config.listenerNetworkInterface().isEmpty()) {
//			LOGGER.severe("Listener Network Interface for UDP Communication is not properly set for IbisGNSSLocationService");
//			throw new ConfigurationException("listenerNetworkInterface", "Listener Network Interface for UDP Communication is not properly set for IbisGNSSLocationService");
//		} else if(config.listenerPort() == 0) {
//			LOGGER.severe("Listener Port for UDP Communication is not properly set for IbisGNSSLocationService");
//			throw new ConfigurationException("listenerPort", "Listener Port for UDP Communication is not properly set for IbisGNSSLocationService");
//		}  
//	}
//
//	/* 
//	 * (non-Javadoc)
//	 * @see de.jena.ibis.apis.IbisGNSSLocationService#connectToGNSSLocationData()
//	 */
//	@Override
//	public PushEventSource<GNSSLocationData> connectToGNSSLocationData() {
//		return doConnectToGNSSLocationData();
//	}
//
//	/* 
//	 * (non-Javadoc)
//	 * @see de.jena.ibis.apis.GeneralIbisUDPService#executeOperation(java.lang.String)
//	 */
//	@Override
//	public PushEventSource<GNSSLocationData> executeOperation(String operation) {
//		switch(operation) {
//		case "GetGNSSLocationData":
//			return connectToGNSSLocationData();
//		}
//		return null;
//	}
//
//
//	private PushEventSource<GNSSLocationData> doConnectToGNSSLocationData() {
//
//		SimplePushEventSource<GNSSLocationData> pushEventSource =
//				pushStreamProvider.createSimpleEventSource(GNSSLocationData.class);
//
//		promiseFactory.submit(() -> {
//			try(pushEventSource) {
//				pushEventSource.connectPromise().getValue();
//				try(MulticastSocket socket = new MulticastSocket(config.listenerPort());) {
//					InetAddress inetAddress = InetAddress.getByName(config.multiCastGroupIP());
//					InetSocketAddress group = new InetSocketAddress(inetAddress, config.multiCastGroupPort());
//					NetworkInterface networkInterface = NetworkInterface.getByName(config.listenerNetworkInterface());
//					socket.joinGroup(group, networkInterface);
//
//					while (socket.isConnected()) {
//
//						byte[] buffer = new byte[512];
//						DatagramPacket response = new DatagramPacket(buffer, buffer.length);
//						socket.receive(response);
//
//						ResourceSet set = rsFactory.getService();
//
//						try {
//							Resource res = set.createResource(URI.createURI("temp.xml"), "application/xml");
//							Map<String, Object> options = new HashMap<>();
//							options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
//							options.put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
//							options.put(XMLResource.OPTION_ENCODING, "UTF-8");
//							res.load(new BufferedInputStream(new ByteArrayInputStream(buffer)), options);
//							if(res.getContents() != null && !res.getContents().isEmpty()) {
//								pushEventSource.publish((GNSSLocationData) res.getContents().get(0));
//							}
//						} finally {
//							rsFactory.ungetService(set);
//						}
//					}
//					socket.leaveGroup(group, networkInterface);
//				} catch (SocketTimeoutException e) {
//					pushEventSource.error(e.getCause());
//				} catch (IOException e) {
//					pushEventSource.error(e.getCause());
//				} finally {
//
//				}
//			}			
//			return true;
//		});
//
//		return pushEventSource;
//	}
//}
