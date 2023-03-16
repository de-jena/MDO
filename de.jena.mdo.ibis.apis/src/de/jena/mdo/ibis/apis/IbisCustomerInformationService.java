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
package de.jena.mdo.ibis.apis;

import org.osgi.annotation.versioning.ProviderType;

import de.jena.mdo.ibis.ibis_common.SubscribeRequest;
import de.jena.mdo.ibis.ibis_common.SubscribeResponse;
import de.jena.mdo.ibis.ibis_common.UnsubscribeRequest;
import de.jena.mdo.ibis.ibis_common.UnsubscribeResponse;
import de.jena.mdo.ibis.ibis_customerinformationservice.AllDataResponse;
import de.jena.mdo.ibis.ibis_customerinformationservice.CurrentAnnouncementResponse;
import de.jena.mdo.ibis.ibis_customerinformationservice.CurrentConnectionInformationResponse;
import de.jena.mdo.ibis.ibis_customerinformationservice.CurrentDisplayContentResponse;
import de.jena.mdo.ibis.ibis_customerinformationservice.CurrentStopIndexResponse;
import de.jena.mdo.ibis.ibis_customerinformationservice.CurrentStopPointResponse;
import de.jena.mdo.ibis.ibis_customerinformationservice.PartialStopSequenceRequest;
import de.jena.mdo.ibis.ibis_customerinformationservice.PartialStopSequenceResponse;
import de.jena.mdo.ibis.ibis_customerinformationservice.TripDataResponse;
import de.jena.mdo.ibis.ibis_customerinformationservice.VehicleDataResponse;



@ProviderType
public interface IbisCustomerInformationService{
	
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
	
	SubscribeResponse subscribeAllData();
	
	UnsubscribeResponse unsubscribeAllData(UnsubscribeRequest unsubscribeRequest);
	
	SubscribeResponse subscribeCurrentAnnouncement(SubscribeRequest subscribeRequest);
	
	UnsubscribeResponse unsubscribeCurrentAnnouncement(UnsubscribeRequest unsubscribeRequest);
	
	SubscribeResponse subscribeCurrentConnectionInformation(SubscribeRequest subscribeRequest);
	
	UnsubscribeResponse unsubscribeCurrentConnectionInformation(UnsubscribeRequest unsubscribeRequest);
	
	SubscribeResponse subscribeCurrentDisplayContent(SubscribeRequest subscribeRequest);
	
	UnsubscribeResponse unsubscribeCurrentDisplayContent(UnsubscribeRequest unsubscribeRequest);
	
	SubscribeResponse subscribeCurrentStopPoint(SubscribeRequest subscribeRequest);
	
	UnsubscribeResponse unsubscribeCurrentStopPoint(UnsubscribeRequest unsubscribeRequest);
	
	SubscribeResponse subscribeCurrentStopIndex(SubscribeRequest subscribeRequest);
	
	UnsubscribeResponse unsubscribeCurrentStopIndex(UnsubscribeRequest unsubscribeRequest);
	
	SubscribeResponse subscribeTripData(SubscribeRequest subscribeRequest);
	
	UnsubscribeResponse unsubscribeTripData(UnsubscribeRequest unsubscribeRequest);
	
	SubscribeResponse subscribeVehicleData(SubscribeRequest subscribeRequest);
	
	UnsubscribeResponse unsubscribeVehicleData(UnsubscribeRequest unsubscribeRequest);
	
	
//	RETRIEVE Operations
	
	PartialStopSequenceResponse 
	retrievePartialStopSequence(PartialStopSequenceRequest request);
	
}
