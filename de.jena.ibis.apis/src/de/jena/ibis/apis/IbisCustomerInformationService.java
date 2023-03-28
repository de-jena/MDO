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
package de.jena.ibis.apis;

import org.osgi.annotation.versioning.ProviderType;

import de.jena.ibis.ibis_customerinformationservice.AllDataResponse;
import de.jena.ibis.ibis_customerinformationservice.CurrentAnnouncementResponse;
import de.jena.ibis.ibis_customerinformationservice.CurrentConnectionInformationResponse;
import de.jena.ibis.ibis_customerinformationservice.CurrentDisplayContentResponse;
import de.jena.ibis.ibis_customerinformationservice.CurrentStopIndexResponse;
import de.jena.ibis.ibis_customerinformationservice.CurrentStopPointResponse;
import de.jena.ibis.ibis_customerinformationservice.PartialStopSequenceRequest;
import de.jena.ibis.ibis_customerinformationservice.PartialStopSequenceResponse;
import de.jena.ibis.ibis_customerinformationservice.TripDataResponse;
import de.jena.ibis.ibis_customerinformationservice.VehicleDataResponse;



@ProviderType
public interface IbisCustomerInformationService extends GeneralIbisTCPService{
		
//	GET Operations

	AllDataResponse getAllData();
	
	CurrentAnnouncementResponse getCurrentAnnouncement();
	
	CurrentConnectionInformationResponse getCurrentConnectionInformation();
	
	CurrentDisplayContentResponse getCurrentDisplayContent();
	
	CurrentStopPointResponse getCurrentStopPoint();
	
	CurrentStopIndexResponse getCurrentStopIndex();
	
	TripDataResponse getTripData();
	
	VehicleDataResponse getVehicleData();
	
	
//	SUBSCRIBE/UNSUBSCRIBE Operations
	
	Integer subscribeAllData();
	
	Integer unsubscribeAllData();
	
	Integer subscribeCurrentAnnouncement();
	
	Integer unsubscribeCurrentAnnouncement();
	
	Integer subscribeCurrentConnectionInformation();
	
	Integer unsubscribeCurrentConnectionInformation();
	
	Integer subscribeCurrentDisplayContent();
	
	Integer unsubscribeCurrentDisplayContent();
	
	Integer subscribeCurrentStopPoint();
	
	Integer unsubscribeCurrentStopPoint();
	
	Integer subscribeCurrentStopIndex();
	
	Integer unsubscribeCurrentStopIndex();
	
	Integer subscribeTripData();
	
	Integer unsubscribeTripData();
	
	Integer subscribeVehicleData();
	
	Integer unsubscribeVehicleData();
	
	
//	RETRIEVE Operations
	
	PartialStopSequenceResponse 
	retrievePartialStopSequence(PartialStopSequenceRequest request);
	
}
