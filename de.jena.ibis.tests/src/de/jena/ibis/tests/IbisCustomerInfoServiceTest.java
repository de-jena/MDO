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
package de.jena.ibis.tests;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.common.service.ServiceAware;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

import de.jena.ibis.apis.IbisCustomerInformationService;
import de.jena.ibis.ibis_customerinformationservice.AllData;
import de.jena.ibis.ibis_customerinformationservice.AllDataResponse;
import de.jena.ibis.ibis_customerinformationservice.CurrentAnnouncementData;
import de.jena.ibis.ibis_customerinformationservice.CurrentAnnouncementResponse;
import de.jena.ibis.ibis_customerinformationservice.CurrentConnectionInformationData;
import de.jena.ibis.ibis_customerinformationservice.CurrentConnectionInformationResponse;
import de.jena.ibis.ibis_customerinformationservice.CurrentDisplayContentData;
import de.jena.ibis.ibis_customerinformationservice.CurrentDisplayContentResponse;
import de.jena.ibis.ibis_customerinformationservice.CurrentStopIndexData;
import de.jena.ibis.ibis_customerinformationservice.CurrentStopIndexResponse;
import de.jena.ibis.ibis_customerinformationservice.CurrentStopPointData;
import de.jena.ibis.ibis_customerinformationservice.CurrentStopPointResponse;
import de.jena.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage;
import de.jena.ibis.ibis_customerinformationservice.TripData;
import de.jena.ibis.ibis_customerinformationservice.TripDataResponse;
import de.jena.ibis.ibis_customerinformationservice.VehicleData;
import de.jena.ibis.ibis_customerinformationservice.VehicleDataResponse;



@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
public class IbisCustomerInfoServiceTest  {

	@Disabled
	@Test
	public void testServices(@InjectService() ServiceAware<IbisCustomerInformationService> customerInfoAware) {
		assertThat(customerInfoAware).isNotNull();
		IbisCustomerInformationService customerInfoService = customerInfoAware.getService();
		assertThat(customerInfoService).isNotNull();
	}

	@Disabled
	@Test
	public void testGetAllData(@InjectService() ServiceAware<IbisCustomerInformationService> customerInfoAware) {
		assertThat(customerInfoAware).isNotNull();
		IbisCustomerInformationService customerInfoService = customerInfoAware.getService();
		assertThat(customerInfoService).isNotNull();

		AllDataResponse response = customerInfoService.getAllData();
		assertThat(response).isNotNull();
		assertThat(response.getOperationErrorMessage()).isNull();

		AllData responseData = response.getAllData();
		assertThat(responseData).isNotNull();
	}
	
	@Disabled
	@Test
	public void testGetCurrentAnnouncement(@InjectService() ServiceAware<IbisCustomerInformationService> customerInfoAware) {
		assertThat(customerInfoAware).isNotNull();
		IbisCustomerInformationService customerInfoService = customerInfoAware.getService();
		assertThat(customerInfoService).isNotNull();

		CurrentAnnouncementResponse response = customerInfoService.getCurrentAnnouncement();
		assertThat(response).isNotNull();
		assertThat(response.getOperationErrorMessage()).isNull();

		CurrentAnnouncementData responseData = response.getCurrentAnnouncementData();
		assertThat(responseData).isNotNull();
	}
	
	@Disabled
	@Test
	public void testGetCurrentConnectionInfo(@InjectService() ServiceAware<IbisCustomerInformationService> customerInfoAware) {
		assertThat(customerInfoAware).isNotNull();
		IbisCustomerInformationService customerInfoService = customerInfoAware.getService();
		assertThat(customerInfoService).isNotNull();

		CurrentConnectionInformationResponse response = customerInfoService.getCurrentConnectionInformation();
		assertThat(response).isNotNull();
		assertThat(response.getOperationErrorMessage()).isNull();

		CurrentConnectionInformationData responseData = response.getCurrentConnectionData();
		assertThat(responseData).isNotNull();
	}
	
	@Disabled
	@Test
	public void testGetCurrentDisplayContent(@InjectService() ServiceAware<IbisCustomerInformationService> customerInfoAware) {
		assertThat(customerInfoAware).isNotNull();
		IbisCustomerInformationService customerInfoService = customerInfoAware.getService();
		assertThat(customerInfoService).isNotNull();

		CurrentDisplayContentResponse response = customerInfoService.getCurrentDisplayContent();
		assertThat(response).isNotNull();
		assertThat(response.getOperationErrorMessage()).isNull();

		CurrentDisplayContentData responseData = response.getCurrentDisplayContentData();
		assertThat(responseData).isNotNull();
	}
	
	@Disabled
	@Test
	public void testGetCurrentStopPoint(@InjectService() ServiceAware<IbisCustomerInformationService> customerInfoAware) {
		assertThat(customerInfoAware).isNotNull();
		IbisCustomerInformationService customerInfoService = customerInfoAware.getService();
		assertThat(customerInfoService).isNotNull();

		CurrentStopPointResponse response = customerInfoService.getCurrentStopPoint();
		assertThat(response).isNotNull();
		assertThat(response.getOperationErrorMessage()).isNull();

		CurrentStopPointData responseData = response.getCurrentStopPointData();
		assertThat(responseData).isNotNull();
	}
	
	@Disabled
	@Test
	public void testGetCurrentStopIndex(@InjectService() ServiceAware<IbisCustomerInformationService> customerInfoAware) {
		assertThat(customerInfoAware).isNotNull();
		IbisCustomerInformationService customerInfoService = customerInfoAware.getService();
		assertThat(customerInfoService).isNotNull();

		CurrentStopIndexResponse response = customerInfoService.getCurrentStopIndex();
		assertThat(response).isNotNull();
		assertThat(response.getOperationErrorMessage()).isNull();

		CurrentStopIndexData responseData = response.getCurrentStopIndexData();
		assertThat(responseData).isNotNull();
	}
	
	@Disabled
	@Test
	public void testGetTripData(@InjectService() ServiceAware<IbisCustomerInformationService> customerInfoAware) {
		assertThat(customerInfoAware).isNotNull();
		IbisCustomerInformationService customerInfoService = customerInfoAware.getService();
		assertThat(customerInfoService).isNotNull();

		TripDataResponse response = customerInfoService.getTripData();
		assertThat(response).isNotNull();
		assertThat(response.getOperationErrorMessage()).isNull();

		TripData responseData = response.getTripData();
		assertThat(responseData).isNotNull();
	}
	
	@Disabled
	@Test
	public void testGetVehicleData(@InjectService() ServiceAware<IbisCustomerInformationService> customerInfoAware) {
		assertThat(customerInfoAware).isNotNull();
		IbisCustomerInformationService customerInfoService = customerInfoAware.getService();
		assertThat(customerInfoService).isNotNull();

		VehicleDataResponse response = customerInfoService.getVehicleData();
		assertThat(response).isNotNull();
		assertThat(response.getOperationErrorMessage()).isNull();

		VehicleData responseData = response.getVehicleData();
		assertThat(responseData).isNotNull();
	}
	
	@Disabled
	@Test
	public void testSubscribeAllData(@InjectService() ServiceAware<IbisCustomerInformationService> customerInfoAware) {
		assertThat(customerInfoAware).isNotNull();
		IbisCustomerInformationService customerInfoService = customerInfoAware.getService();
		assertThat(customerInfoService).isNotNull();

		Integer response = customerInfoService.subscribeAllData();
		assertThat(response).isNotNull();
		assertThat(response).isEqualTo(200);
		
		response = customerInfoService.unsubscribeAllData();
		assertThat(response).isNotNull();
		assertThat(response).isEqualTo(200);
	}

	@Disabled
	@Test
	public void testReadXMLResponseFromFile(@InjectService() ServiceAware<ResourceSet> resourceSetAware, @InjectService() ServiceAware<IbisCustomerInformationServicePackage> packageAware) throws Exception{
		assertThat(resourceSetAware).isNotNull();
		ResourceSet resourceSet = resourceSetAware.getService();
		assertThat(resourceSet).isNotNull();

		assertThat(packageAware).isNotNull();
		IbisCustomerInformationServicePackage modelPackage = packageAware.getService();

		resourceSet.getPackageRegistry().put(null, modelPackage);

		URI uri = URI.createFileURI(System.getProperty("base.path") + "/data/response.xml");
		Resource requestRes = resourceSet.createResource(uri, "application/xml");
		Map<Object, Object> options = new HashMap<>();
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		options.put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
		options.put(XMLResource.OPTION_ENCODING, "UTF-8");
		requestRes.load(options);
		assertThat(requestRes.getContents()).isNotEmpty();
		EObject obj = requestRes.getContents().get(0);
		assertThat(obj instanceof AllDataResponse).isTrue();
	}
}
