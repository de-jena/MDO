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

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Map;
import java.util.logging.Logger;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.ServiceScope;

import de.jena.mdo.ibis.apis.IbisGNSSLocationService;
import de.jena.mdo.ibis.ibis_gnsslocationservice.GNSSLocationData;

/**
 * 
 * @author ilenia
 * @since Jan 18, 2023
 */
@Component(name = "IbisGNSSLocationService", scope = ServiceScope.PROTOTYPE, configurationPid = "IbisGNSSLocationService", configurationPolicy = ConfigurationPolicy.REQUIRE)
public class IbisGNSSLocationServiceImpl implements IbisGNSSLocationService {
	
	 private final static Logger LOGGER = Logger.getLogger(IbisDeviceManagementServiceImpl.class.getName());

		private String host;
		private String port;


		@Activate
		public void activate(Map<String, Object> configProperties) {
			host = (String) configProperties.getOrDefault("ibis.gnss.location.service.host", null);
			port = (String) configProperties.getOrDefault("ibis.gnss.location.service.port", null);
			if(host == null || port == null) {
				LOGGER.severe("Host and/or Port are not properly set for IbisGNSSLocationService");
				throw new IllegalStateException("Host and/or Port are not properly set for IbisGNSSLocationService");
			}
		}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.ibis.apis.IbisGNSSLocationService#getGNSSLocationData()
	 */
	@Override
	public GNSSLocationData getGNSSLocationData() {
		
		String hostname = host;
        int port = Integer.valueOf(this.port);

        try(DatagramSocket socket = new DatagramSocket();) {
            InetAddress address = InetAddress.getByName(hostname);
 
            while (true) {
 
                DatagramPacket request = new DatagramPacket(new byte[1], 1, address, port);
                socket.send(request);
 
                byte[] buffer = new byte[512];
                DatagramPacket response = new DatagramPacket(buffer, buffer.length);
                socket.receive(response);
                
                String quote = new String(buffer, 0, response.getLength());
 
                System.out.println(quote);
                System.out.println();
 
                Thread.sleep(10000);
            }
 
        } catch (SocketTimeoutException ex) {
            System.out.println("Timeout error: " + ex.getMessage());
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println("Client error: " + ex.getMessage());
            ex.printStackTrace();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        } 
		return null;
	}

}
