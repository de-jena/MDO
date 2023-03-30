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
package de.jena.ibis.components.helper;

import java.util.List;

/**
 * 
 * @author ilenia
 * @since Jan 18, 2023
 */
public interface CustomerInformationServiceConstants {
	
	public static final String SERVICE_NAME = "CustomerInformationService";
	
	public static final String OPERATION_GET_ALL_DATA = "GetAllData";
	public static final String OPERATION_SUBSCRIBE_ALL_DATA = "SubscribeAllData";
	public static final String OPERATION_UNSUBSCRIBE_ALL_DATA = "UnsubscribeAllData";
	
	public static final String OPERATION_GET_CURRENT_ANNOUNCEMENT = "GetCurrentAnnouncement";
	public static final String OPERATION_SUBSCRIBE_CURRENT_ANNOUNCEMENT = "SubscribeCurrentAnnouncement";
	public static final String OPERATION_UNSUBSCRIBE_CURRENT_ANNOUNCEMENT = "UnsubscribeCurrentAnnouncement";
	
	public static final String OPERATION_GET_CURRENT_CONNECTION_INFO = "GetCurrentConnectionInformation";
	public static final String OPERATION_SUBSCRIBE_CURRENT_CONNECTION_INFO = "SubscribeCurrentConnectionInformation";
	public static final String OPERATION_UNSUBSCRIBE_CURRENT_CONNECTION_INFO = "UnsubscribeCurrentConnectionInformation";
	
	public static final String OPERATION_GET_CURRENT_DISPLAY_CONTENT = "GetCurrentDisplayContent";
	public static final String OPERATION_SUBSCRIBE_CURRENT_DISPLAY_CONTENT = "SubscribeCurrentDisplayContent";
	public static final String OPERATION_UNSUBSCRIBE_CURRENT_DISPLAY_CONTENT = "UnsubscribeCurrentDisplayContent";
	
	public static final String OPERATION_GET_CURRENT_STOP_POINT = "GetCurrentStopPoint";
	public static final String OPERATION_SUBSCRIBE_CURRENT_STOP_POINT = "SubscribeCurrentStopPoint";
	public static final String OPERATION_UNSUBSCRIBE_CURRENT_STOP_POINT = "UnsubscribeCurrentStopPoint";
	
	public static final String OPERATION_GET_CURRENT_STOP_INDEX = "GetCurrentStopIndex";
	public static final String OPERATION_SUBSCRIBE_CURRENT_STOP_INDEX = "SubscribeCurrentStopIndex";
	public static final String OPERATION_UNSUBSCRIBE_CURRENT_STOP_INDEX = "UnsubscribeCurrentStopIndex";
	
	public static final String OPERATION_GET_TRIP_DATA = "GetTripData";
	public static final String OPERATION_SUBSCRIBE_TRIP_DATA = "SubscribeTripData";
	public static final String OPERATION_UNSUBSCRIBE_TRIP_DATA = "UnsubscribeTripData";
	
	public static final String OPERATION_GET_VEHICLE_DATA = "GetVehicleData";
	public static final String OPERATION_SUBSCRIBE_VEHICLE_DATA = "SubscribeVehicleData";
	public static final String OPERATION_UNSUBSCRIBE_VEHICLE_DATA = "UnsubscribeVehicleData";
	
	public static final String OPERATION_RETRIEVE_PARTIAL_STOP_SEQUENCE = "RetrievePartialStopSequence";
	
	public static List<String> getAllSubscriptionOperations() {
		return List.of(OPERATION_SUBSCRIBE_ALL_DATA, OPERATION_SUBSCRIBE_CURRENT_ANNOUNCEMENT, OPERATION_SUBSCRIBE_CURRENT_CONNECTION_INFO,
				OPERATION_SUBSCRIBE_CURRENT_DISPLAY_CONTENT, OPERATION_SUBSCRIBE_CURRENT_STOP_POINT, OPERATION_SUBSCRIBE_CURRENT_STOP_INDEX,
				OPERATION_SUBSCRIBE_TRIP_DATA, OPERATION_SUBSCRIBE_VEHICLE_DATA);
	}
	
	public static List<String> getAllUnsubscriptionOperations() {
		return List.of(OPERATION_UNSUBSCRIBE_ALL_DATA, OPERATION_UNSUBSCRIBE_CURRENT_ANNOUNCEMENT, OPERATION_UNSUBSCRIBE_CURRENT_CONNECTION_INFO,
				OPERATION_UNSUBSCRIBE_CURRENT_DISPLAY_CONTENT, OPERATION_UNSUBSCRIBE_CURRENT_STOP_POINT, OPERATION_UNSUBSCRIBE_CURRENT_STOP_INDEX,
				OPERATION_UNSUBSCRIBE_TRIP_DATA, OPERATION_UNSUBSCRIBE_VEHICLE_DATA);
	}
 }
