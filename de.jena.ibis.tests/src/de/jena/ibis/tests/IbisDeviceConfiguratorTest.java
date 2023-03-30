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

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.common.annotation.Property;
import org.osgi.test.common.annotation.Property.Type;
import org.osgi.test.common.annotation.config.WithConfiguration;
import org.osgi.test.common.service.ServiceAware;
import org.osgi.test.junit5.cm.ConfigurationExtension;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

import de.jena.ibis.apis.IbisCustomerInformationService;

/**
 * 
 * @author ilenia
 * @since Mar 27, 2023
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
@ExtendWith(ConfigurationExtension.class)
public class IbisDeviceConfiguratorTest {
	
	@Test
	@WithConfiguration(
			pid = "IbisDeviceConfigurator",
			location = "?",
			properties = {
					@Property(key = "deviceId", value = "202"),
					@Property(key = "deviceName", value = "Bus 202"),
					@Property(key = "deviceIP", value = "10.6.11.69"),
					@Property(key = "refTCPServices", value = {"IbisCustomerInformationService"}, type = Type.Array),	
				}
			)
	public void testServices(
			@InjectService(timeout=1000l) ServiceAware<IbisCustomerInformationService> infoServiceAware) throws Exception{
		
		assertThat(infoServiceAware).isNotNull();
		IbisCustomerInformationService infoService = infoServiceAware.getService();
		assertThat(infoService).isNotNull();
			
	}

}
