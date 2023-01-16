/*
 */
package de.jena.mdo.ibis.enumerations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Service Name Enumeration</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.jena.mdo.ibis.enumerations.IbisEnumerationsPackage#getServiceNameEnumeration()
 * @model extendedMetaData="name='ServiceNameEnumeration'"
 * @generated
 */
@ProviderType
public enum ServiceNameEnumeration implements Enumerator {
	/**
	 * The '<em><b>Customer Information Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOMER_INFORMATION_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOMER_INFORMATION_SERVICE(0, "CustomerInformationService", "CustomerInformationService"),

	/**
	 * The '<em><b>Device Management Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICE_MANAGEMENT_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE_MANAGEMENT_SERVICE(1, "DeviceManagementService", "DeviceManagementService"),

	/**
	 * The '<em><b>Journey Information Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JOURNEY_INFORMATION_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	JOURNEY_INFORMATION_SERVICE(2, "JourneyInformationService", "JourneyInformationService"),

	/**
	 * The '<em><b>Beacon Location Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEACON_LOCATION_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	BEACON_LOCATION_SERVICE(3, "BeaconLocationService", "BeaconLocationService"),

	/**
	 * The '<em><b>Distance Location Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTANCE_LOCATION_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	DISTANCE_LOCATION_SERVICE(4, "DistanceLocationService", "DistanceLocationService"),

	/**
	 * The '<em><b>GNSS Location Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GNSS_LOCATION_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	GNSS_LOCATION_SERVICE(5, "GNSSLocationService", "GNSSLocationService"),

	/**
	 * The '<em><b>Network Location Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NETWORK_LOCATION_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	NETWORK_LOCATION_SERVICE(6, "NetworkLocationService", "NetworkLocationService"),

	/**
	 * The '<em><b>Passenger Counting Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PASSENGER_COUNTING_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	PASSENGER_COUNTING_SERVICE(7, "PassengerCountingService", "PassengerCountingService"),

	/**
	 * The '<em><b>Ticketing Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TICKETING_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	TICKETING_SERVICE(8, "TicketingService", "TicketingService"),

	/**
	 * The '<em><b>Time Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_SERVICE(9, "TimeService", "TimeService"),

	/**
	 * The '<em><b>Test Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEST_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	TEST_SERVICE(10, "TestService", "TestService"),

	/**
	 * The '<em><b>Video Live Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEO_LIVE_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	VIDEO_LIVE_SERVICE(11, "VideoLiveService", "VideoLiveService"),

	/**
	 * The '<em><b>Video Recording Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEO_RECORDING_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	VIDEO_RECORDING_SERVICE(12, "VideoRecordingService", "VideoRecordingService"),

	/**
	 * The '<em><b>Video Display Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEO_DISPLAY_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	VIDEO_DISPLAY_SERVICE(13, "VideoDisplayService", "VideoDisplayService"),

	/**
	 * The '<em><b>Door State Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOOR_STATE_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	DOOR_STATE_SERVICE(14, "DoorStateService", "DoorStateService"),

	/**
	 * The '<em><b>Train Set Data Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAIN_SET_DATA_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	TRAIN_SET_DATA_SERVICE(15, "TrainSetDataService", "TrainSetDataService"),

	/**
	 * The '<em><b>Train Set Information Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAIN_SET_INFORMATION_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	TRAIN_SET_INFORMATION_SERVICE(16, "TrainSetInformationService", "TrainSetInformationService"),

	/**
	 * The '<em><b>Train Set Management Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAIN_SET_MANAGEMENT_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	TRAIN_SET_MANAGEMENT_SERVICE(17, "TrainSetManagementService", "TrainSetManagementService"),

	/**
	 * The '<em><b>Ticket Validation Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TICKET_VALIDATION_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	TICKET_VALIDATION_SERVICE(18, "TicketValidationService", "TicketValidationService"),

	/**
	 * The '<em><b>HTML Display Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTML_DISPLAY_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	HTML_DISPLAY_SERVICE(19, "HTMLDisplayService", "HTMLDisplayService"),

	/**
	 * The '<em><b>System Monitoring Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYSTEM_MONITORING_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	SYSTEM_MONITORING_SERVICE(20, "SystemMonitoringService", "SystemMonitoringService");

	/**
	 * The '<em><b>Customer Information Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOMER_INFORMATION_SERVICE
	 * @model name="CustomerInformationService"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOMER_INFORMATION_SERVICE_VALUE = 0;

	/**
	 * The '<em><b>Device Management Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICE_MANAGEMENT_SERVICE
	 * @model name="DeviceManagementService"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_MANAGEMENT_SERVICE_VALUE = 1;

	/**
	 * The '<em><b>Journey Information Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JOURNEY_INFORMATION_SERVICE
	 * @model name="JourneyInformationService"
	 * @generated
	 * @ordered
	 */
	public static final int JOURNEY_INFORMATION_SERVICE_VALUE = 2;

	/**
	 * The '<em><b>Beacon Location Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEACON_LOCATION_SERVICE
	 * @model name="BeaconLocationService"
	 * @generated
	 * @ordered
	 */
	public static final int BEACON_LOCATION_SERVICE_VALUE = 3;

	/**
	 * The '<em><b>Distance Location Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTANCE_LOCATION_SERVICE
	 * @model name="DistanceLocationService"
	 * @generated
	 * @ordered
	 */
	public static final int DISTANCE_LOCATION_SERVICE_VALUE = 4;

	/**
	 * The '<em><b>GNSS Location Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GNSS_LOCATION_SERVICE
	 * @model name="GNSSLocationService"
	 * @generated
	 * @ordered
	 */
	public static final int GNSS_LOCATION_SERVICE_VALUE = 5;

	/**
	 * The '<em><b>Network Location Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NETWORK_LOCATION_SERVICE
	 * @model name="NetworkLocationService"
	 * @generated
	 * @ordered
	 */
	public static final int NETWORK_LOCATION_SERVICE_VALUE = 6;

	/**
	 * The '<em><b>Passenger Counting Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PASSENGER_COUNTING_SERVICE
	 * @model name="PassengerCountingService"
	 * @generated
	 * @ordered
	 */
	public static final int PASSENGER_COUNTING_SERVICE_VALUE = 7;

	/**
	 * The '<em><b>Ticketing Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TICKETING_SERVICE
	 * @model name="TicketingService"
	 * @generated
	 * @ordered
	 */
	public static final int TICKETING_SERVICE_VALUE = 8;

	/**
	 * The '<em><b>Time Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_SERVICE
	 * @model name="TimeService"
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SERVICE_VALUE = 9;

	/**
	 * The '<em><b>Test Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEST_SERVICE
	 * @model name="TestService"
	 * @generated
	 * @ordered
	 */
	public static final int TEST_SERVICE_VALUE = 10;

	/**
	 * The '<em><b>Video Live Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEO_LIVE_SERVICE
	 * @model name="VideoLiveService"
	 * @generated
	 * @ordered
	 */
	public static final int VIDEO_LIVE_SERVICE_VALUE = 11;

	/**
	 * The '<em><b>Video Recording Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEO_RECORDING_SERVICE
	 * @model name="VideoRecordingService"
	 * @generated
	 * @ordered
	 */
	public static final int VIDEO_RECORDING_SERVICE_VALUE = 12;

	/**
	 * The '<em><b>Video Display Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEO_DISPLAY_SERVICE
	 * @model name="VideoDisplayService"
	 * @generated
	 * @ordered
	 */
	public static final int VIDEO_DISPLAY_SERVICE_VALUE = 13;

	/**
	 * The '<em><b>Door State Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOOR_STATE_SERVICE
	 * @model name="DoorStateService"
	 * @generated
	 * @ordered
	 */
	public static final int DOOR_STATE_SERVICE_VALUE = 14;

	/**
	 * The '<em><b>Train Set Data Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAIN_SET_DATA_SERVICE
	 * @model name="TrainSetDataService"
	 * @generated
	 * @ordered
	 */
	public static final int TRAIN_SET_DATA_SERVICE_VALUE = 15;

	/**
	 * The '<em><b>Train Set Information Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAIN_SET_INFORMATION_SERVICE
	 * @model name="TrainSetInformationService"
	 * @generated
	 * @ordered
	 */
	public static final int TRAIN_SET_INFORMATION_SERVICE_VALUE = 16;

	/**
	 * The '<em><b>Train Set Management Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAIN_SET_MANAGEMENT_SERVICE
	 * @model name="TrainSetManagementService"
	 * @generated
	 * @ordered
	 */
	public static final int TRAIN_SET_MANAGEMENT_SERVICE_VALUE = 17;

	/**
	 * The '<em><b>Ticket Validation Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TICKET_VALIDATION_SERVICE
	 * @model name="TicketValidationService"
	 * @generated
	 * @ordered
	 */
	public static final int TICKET_VALIDATION_SERVICE_VALUE = 18;

	/**
	 * The '<em><b>HTML Display Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTML_DISPLAY_SERVICE
	 * @model name="HTMLDisplayService"
	 * @generated
	 * @ordered
	 */
	public static final int HTML_DISPLAY_SERVICE_VALUE = 19;

	/**
	 * The '<em><b>System Monitoring Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYSTEM_MONITORING_SERVICE
	 * @model name="SystemMonitoringService"
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEM_MONITORING_SERVICE_VALUE = 20;

	/**
	 * An array of all the '<em><b>Service Name Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ServiceNameEnumeration[] VALUES_ARRAY =
		new ServiceNameEnumeration[] {
			CUSTOMER_INFORMATION_SERVICE,
			DEVICE_MANAGEMENT_SERVICE,
			JOURNEY_INFORMATION_SERVICE,
			BEACON_LOCATION_SERVICE,
			DISTANCE_LOCATION_SERVICE,
			GNSS_LOCATION_SERVICE,
			NETWORK_LOCATION_SERVICE,
			PASSENGER_COUNTING_SERVICE,
			TICKETING_SERVICE,
			TIME_SERVICE,
			TEST_SERVICE,
			VIDEO_LIVE_SERVICE,
			VIDEO_RECORDING_SERVICE,
			VIDEO_DISPLAY_SERVICE,
			DOOR_STATE_SERVICE,
			TRAIN_SET_DATA_SERVICE,
			TRAIN_SET_INFORMATION_SERVICE,
			TRAIN_SET_MANAGEMENT_SERVICE,
			TICKET_VALIDATION_SERVICE,
			HTML_DISPLAY_SERVICE,
			SYSTEM_MONITORING_SERVICE,
		};

	/**
	 * A public read-only list of all the '<em><b>Service Name Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ServiceNameEnumeration> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Service Name Enumeration</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ServiceNameEnumeration get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ServiceNameEnumeration result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Service Name Enumeration</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ServiceNameEnumeration getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ServiceNameEnumeration result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Service Name Enumeration</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ServiceNameEnumeration get(int value) {
		switch (value) {
			case CUSTOMER_INFORMATION_SERVICE_VALUE: return CUSTOMER_INFORMATION_SERVICE;
			case DEVICE_MANAGEMENT_SERVICE_VALUE: return DEVICE_MANAGEMENT_SERVICE;
			case JOURNEY_INFORMATION_SERVICE_VALUE: return JOURNEY_INFORMATION_SERVICE;
			case BEACON_LOCATION_SERVICE_VALUE: return BEACON_LOCATION_SERVICE;
			case DISTANCE_LOCATION_SERVICE_VALUE: return DISTANCE_LOCATION_SERVICE;
			case GNSS_LOCATION_SERVICE_VALUE: return GNSS_LOCATION_SERVICE;
			case NETWORK_LOCATION_SERVICE_VALUE: return NETWORK_LOCATION_SERVICE;
			case PASSENGER_COUNTING_SERVICE_VALUE: return PASSENGER_COUNTING_SERVICE;
			case TICKETING_SERVICE_VALUE: return TICKETING_SERVICE;
			case TIME_SERVICE_VALUE: return TIME_SERVICE;
			case TEST_SERVICE_VALUE: return TEST_SERVICE;
			case VIDEO_LIVE_SERVICE_VALUE: return VIDEO_LIVE_SERVICE;
			case VIDEO_RECORDING_SERVICE_VALUE: return VIDEO_RECORDING_SERVICE;
			case VIDEO_DISPLAY_SERVICE_VALUE: return VIDEO_DISPLAY_SERVICE;
			case DOOR_STATE_SERVICE_VALUE: return DOOR_STATE_SERVICE;
			case TRAIN_SET_DATA_SERVICE_VALUE: return TRAIN_SET_DATA_SERVICE;
			case TRAIN_SET_INFORMATION_SERVICE_VALUE: return TRAIN_SET_INFORMATION_SERVICE;
			case TRAIN_SET_MANAGEMENT_SERVICE_VALUE: return TRAIN_SET_MANAGEMENT_SERVICE;
			case TICKET_VALIDATION_SERVICE_VALUE: return TICKET_VALIDATION_SERVICE;
			case HTML_DISPLAY_SERVICE_VALUE: return HTML_DISPLAY_SERVICE;
			case SYSTEM_MONITORING_SERVICE_VALUE: return SYSTEM_MONITORING_SERVICE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ServiceNameEnumeration(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ServiceNameEnumeration
