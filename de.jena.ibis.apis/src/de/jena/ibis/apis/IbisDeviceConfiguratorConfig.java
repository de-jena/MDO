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
package de.jena.ibis.apis;

/**
 * 
 * @author ilenia
 * @since Mar 27, 2023
 */
public @interface IbisDeviceConfiguratorConfig {
	
	public String deviceId() default "";
	
	public String deviceName() default "";
	
	public String deviceIP() default "";
	
	public String clientSubscriptionIP() default "192.168.243.250";
	
	public long clientSubscriptionPort() default 52000;
	
	public long customerInfoServicePort() default 51000;
	
	public String[] tcpOperations() default {};
	
	public String[] udpOperations() default {};

	public String[] refTCPServices() default {};
	
	public String[] refUDPServices() default {};
	
}
