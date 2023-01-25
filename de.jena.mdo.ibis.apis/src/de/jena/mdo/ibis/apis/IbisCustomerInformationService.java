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

import de.jena.mdo.ibis.common.SubscribeRequestStructure;
import de.jena.mdo.ibis.common.SubscribeResponseStructure;
import de.jena.mdo.ibis.common.UnsubscribeRequestStructure;
import de.jena.mdo.ibis.common.UnsubscribeResponseStructure;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetAllDataResponseStructure;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentAnnouncementResponseStructure;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentConnectionInformationResponseStructure;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentDisplayContentResponseStructure;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentStopIndexResponseStructure;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentStopPointResponseStructure;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetTripDataResponseStructure;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetVehicleDataResponseStructure;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceRetrievePartialStopSequenceRequestStructure;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceRetrievePartialStopSequenceResponseStructure;



@ProviderType
public interface IbisCustomerInformationService{
	
//	GET Operations

	CustomerInformationServiceGetAllDataResponseStructure getAllData();
	
	CustomerInformationServiceGetCurrentAnnouncementResponseStructure getCurrentAnnouncement();
	
	CustomerInformationServiceGetCurrentConnectionInformationResponseStructure getCurrentConnectionInformation();
	
	CustomerInformationServiceGetCurrentDisplayContentResponseStructure getCurrentDisplayContent();
	
	CustomerInformationServiceGetCurrentStopPointResponseStructure getCurrentStopPoint();
	
	CustomerInformationServiceGetCurrentStopIndexResponseStructure getCurrentStopIndex();
	
	CustomerInformationServiceGetTripDataResponseStructure getTripData();
	
	CustomerInformationServiceGetVehicleDataResponseStructure getVehicleData();
	
	
//	SUBSCRIBE/UNSUBSCRIBE Operations
	
	SubscribeResponseStructure subscribeAllData(SubscribeRequestStructure subscribeRequestStructure);
	
	UnsubscribeResponseStructure unsubscribeAllData(UnsubscribeRequestStructure unsubscribeRequestStructure);
	
	SubscribeResponseStructure subscribeCurrentAnnouncement(SubscribeRequestStructure subscribeRequestStructure);
	
	UnsubscribeResponseStructure unsubscribeCurrentAnnouncement(UnsubscribeRequestStructure unsubscribeRequestStructure);
	
	SubscribeResponseStructure subscribeCurrentConnectionInformation(SubscribeRequestStructure subscribeRequestStructure);
	
	UnsubscribeResponseStructure unsubscribeCurrentConnectionInformation(UnsubscribeRequestStructure unsubscribeRequestStructure);
	
	SubscribeResponseStructure subscribeCurrentDisplayContent(SubscribeRequestStructure subscribeRequestStructure);
	
	UnsubscribeResponseStructure unsubscribeCurrentDisplayContent(UnsubscribeRequestStructure unsubscribeRequestStructure);
	
	SubscribeResponseStructure subscribeCurrentStopPoint(SubscribeRequestStructure subscribeRequestStructure);
	
	UnsubscribeResponseStructure unsubscribeCurrentStopPoint(UnsubscribeRequestStructure unsubscribeRequestStructure);
	
	SubscribeResponseStructure subscribeCurrentStopIndex(SubscribeRequestStructure subscribeRequestStructure);
	
	UnsubscribeResponseStructure unsubscribeCurrentStopIndex(UnsubscribeRequestStructure unsubscribeRequestStructure);
	
	SubscribeResponseStructure subscribeTripData(SubscribeRequestStructure subscribeRequestStructure);
	
	UnsubscribeResponseStructure unsubscribeTripData(UnsubscribeRequestStructure unsubscribeRequestStructure);
	
	SubscribeResponseStructure subscribeVehicleData(SubscribeRequestStructure subscribeRequestStructure);
	
	UnsubscribeResponseStructure unsubscribeVehicleData(UnsubscribeRequestStructure unsubscribeRequestStructure);
	
	
//	RETRIEVE Operations
	
	CustomerInformationServiceRetrievePartialStopSequenceResponseStructure 
	retrievePartialStopSequence(CustomerInformationServiceRetrievePartialStopSequenceRequestStructure requestStructure);
	
}
