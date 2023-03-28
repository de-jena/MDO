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
package de.jena.ibis.tests;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.common.service.ServiceAware;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

import de.jena.ibis.apis.IbisCustomerInformationService;
import de.jena.ibis.apis.IbisDeviceConfigurator;

/**
 * 
 * @author ilenia
 * @since Mar 27, 2023
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
public class IbisDeviceConfiguratorTest {
	
	@BeforeEach
	public void before() {
		System.out.println("Test");
	}
	
	@Test
	public void testServices(@InjectService() ServiceAware<IbisCustomerInformationService> infoServiceAware, 
			@InjectService() ServiceAware<IbisDeviceConfigurator> deviceConfiguratorAware) {
		
		assertThat(infoServiceAware).isNotNull();
		IbisCustomerInformationService infoService = infoServiceAware.getService();
		assertThat(infoService).isNotNull();
		
		assertThat(deviceConfiguratorAware).isNotNull();
		IbisDeviceConfigurator deviceConfigurator = deviceConfiguratorAware.getService();
		assertThat(deviceConfigurator).isNotNull();
		
		assertThat(deviceConfigurator.getServiceNames()).isNotEmpty();
		assertThat(deviceConfigurator.getServiceNames()).hasSize(1);
		assertThat(deviceConfigurator.getServiceNames()).contains("de.jena.ibis.apis.IbisCustomerInformationService");
		
		assertThat(deviceConfigurator.getAllActiveTCPSubscriptions()).isNotEmpty();
		assertThat(deviceConfigurator.getAllActiveTCPSubscriptions()).hasSize(1);
		assertThat(deviceConfigurator.getAllActiveTCPSubscriptions()).containsKey("de.jena.ibis.apis.IbisCustomerInformationService-SubscribeAllData");
		assertThat(deviceConfigurator.getAllActiveTCPSubscriptions().get("de.jena.ibis.apis.IbisCustomerInformationService-SubscribeAllData")).isEqualTo(200);
	}

}
