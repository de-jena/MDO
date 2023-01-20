/**
 * Copyright (c) 2012 - 2018 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.mdo.ibis.tests;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.common.service.ServiceAware;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

import de.jena.mdo.ibis.apis.IbisCustomerInformationService;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceAllData;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetAllDataResponseStructure;

@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
public class IbisCustomerInfoServiceTest  {
	
	
	@Test
	public void testServices(@InjectService() ServiceAware<IbisCustomerInformationService> customerInfoAware) {
		assertThat(customerInfoAware).isNotNull();
		IbisCustomerInformationService customerInfoService = customerInfoAware.getService();
		assertThat(customerInfoService).isNotNull();
	}
	
	@Disabled("We do not have the right host/port yet to make an actual request")
	@Test
	public void testGetAllData(@InjectService() ServiceAware<IbisCustomerInformationService> customerInfoAware) {
		assertThat(customerInfoAware).isNotNull();
		IbisCustomerInformationService customerInfoService = customerInfoAware.getService();
		assertThat(customerInfoService).isNotNull();
		
		CustomerInformationServiceGetAllDataResponseStructure response = customerInfoService.getAllData();
		assertThat(response).isNotNull();
		assertThat(response.getOperationErrorMessage()).isNull();
		
		CustomerInformationServiceAllData responseData = response.getAllData();
		assertThat(responseData).isNotNull();
	}
	
}
