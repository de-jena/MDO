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
 * A representation of the literals of the enumeration '<em><b>Water Submode Enumeration</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Values for Water MODEs of TRANSPORT: TPEG pti_table_07.
 * <!-- end-model-doc -->
 * @see de.jena.mdo.ibis.enumerations.IbisEnumerationsPackage#getWaterSubmodeEnumeration()
 * @model extendedMetaData="name='WaterSubmodeEnumeration'"
 * @generated
 */
@ProviderType
public enum WaterSubmodeEnumeration implements Enumerator {
	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(0, "unknown", "unknown"),

	/**
	 * The '<em><b>Undefined</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	UNDEFINED(1, "undefined", "undefined"),

	/**
	 * The '<em><b>International Car Ferry</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNATIONAL_CAR_FERRY_VALUE
	 * @generated
	 * @ordered
	 */
	INTERNATIONAL_CAR_FERRY(2, "internationalCarFerry", "internationalCarFerry"),

	/**
	 * The '<em><b>National Car Ferry</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NATIONAL_CAR_FERRY_VALUE
	 * @generated
	 * @ordered
	 */
	NATIONAL_CAR_FERRY(3, "nationalCarFerry", "nationalCarFerry"),

	/**
	 * The '<em><b>Regional Car Ferry</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGIONAL_CAR_FERRY_VALUE
	 * @generated
	 * @ordered
	 */
	REGIONAL_CAR_FERRY(4, "regionalCarFerry", "regionalCarFerry"),

	/**
	 * The '<em><b>Local Car Ferry</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_CAR_FERRY_VALUE
	 * @generated
	 * @ordered
	 */
	LOCAL_CAR_FERRY(5, "localCarFerry", "localCarFerry"),

	/**
	 * The '<em><b>International Passenger Ferry</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNATIONAL_PASSENGER_FERRY_VALUE
	 * @generated
	 * @ordered
	 */
	INTERNATIONAL_PASSENGER_FERRY(6, "internationalPassengerFerry", "internationalPassengerFerry"),

	/**
	 * The '<em><b>National Passenger Ferry</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NATIONAL_PASSENGER_FERRY_VALUE
	 * @generated
	 * @ordered
	 */
	NATIONAL_PASSENGER_FERRY(7, "nationalPassengerFerry", "nationalPassengerFerry"),

	/**
	 * The '<em><b>Regional Passenger Ferry</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGIONAL_PASSENGER_FERRY_VALUE
	 * @generated
	 * @ordered
	 */
	REGIONAL_PASSENGER_FERRY(8, "regionalPassengerFerry", "regionalPassengerFerry"),

	/**
	 * The '<em><b>Local Passenger Ferry</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_PASSENGER_FERRY_VALUE
	 * @generated
	 * @ordered
	 */
	LOCAL_PASSENGER_FERRY(9, "localPassengerFerry", "localPassengerFerry"),

	/**
	 * The '<em><b>Post Boat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POST_BOAT_VALUE
	 * @generated
	 * @ordered
	 */
	POST_BOAT(10, "postBoat", "postBoat"),

	/**
	 * The '<em><b>Train Ferry</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAIN_FERRY_VALUE
	 * @generated
	 * @ordered
	 */
	TRAIN_FERRY(11, "trainFerry", "trainFerry"),

	/**
	 * The '<em><b>Road Ferry Link</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROAD_FERRY_LINK_VALUE
	 * @generated
	 * @ordered
	 */
	ROAD_FERRY_LINK(12, "roadFerryLink", "roadFerryLink"),

	/**
	 * The '<em><b>Airport Boat Link</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIRPORT_BOAT_LINK_VALUE
	 * @generated
	 * @ordered
	 */
	AIRPORT_BOAT_LINK(13, "airportBoatLink", "airportBoatLink"),

	/**
	 * The '<em><b>High Speed Vehicle Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGH_SPEED_VEHICLE_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	HIGH_SPEED_VEHICLE_SERVICE(14, "highSpeedVehicleService", "highSpeedVehicleService"),

	/**
	 * The '<em><b>High Speed Passenger Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGH_SPEED_PASSENGER_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	HIGH_SPEED_PASSENGER_SERVICE(15, "highSpeedPassengerService", "highSpeedPassengerService"),

	/**
	 * The '<em><b>Sightseeing Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGHTSEEING_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	SIGHTSEEING_SERVICE(16, "sightseeingService", "sightseeingService"),

	/**
	 * The '<em><b>School Boat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHOOL_BOAT_VALUE
	 * @generated
	 * @ordered
	 */
	SCHOOL_BOAT(17, "schoolBoat", "schoolBoat"),

	/**
	 * The '<em><b>Cable Ferry</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CABLE_FERRY_VALUE
	 * @generated
	 * @ordered
	 */
	CABLE_FERRY(18, "cableFerry", "cableFerry"),

	/**
	 * The '<em><b>River Bus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIVER_BUS_VALUE
	 * @generated
	 * @ordered
	 */
	RIVER_BUS(19, "riverBus", "riverBus"),

	/**
	 * The '<em><b>Scheduled Ferry</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHEDULED_FERRY_VALUE
	 * @generated
	 * @ordered
	 */
	SCHEDULED_FERRY(20, "scheduledFerry", "scheduledFerry"),

	/**
	 * The '<em><b>Shuttle Ferry Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHUTTLE_FERRY_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	SHUTTLE_FERRY_SERVICE(21, "shuttleFerryService", "shuttleFerryService");

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model name="unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 0;

	/**
	 * The '<em><b>Undefined</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED
	 * @model name="undefined"
	 * @generated
	 * @ordered
	 */
	public static final int UNDEFINED_VALUE = 1;

	/**
	 * The '<em><b>International Car Ferry</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNATIONAL_CAR_FERRY
	 * @model name="internationalCarFerry"
	 * @generated
	 * @ordered
	 */
	public static final int INTERNATIONAL_CAR_FERRY_VALUE = 2;

	/**
	 * The '<em><b>National Car Ferry</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NATIONAL_CAR_FERRY
	 * @model name="nationalCarFerry"
	 * @generated
	 * @ordered
	 */
	public static final int NATIONAL_CAR_FERRY_VALUE = 3;

	/**
	 * The '<em><b>Regional Car Ferry</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGIONAL_CAR_FERRY
	 * @model name="regionalCarFerry"
	 * @generated
	 * @ordered
	 */
	public static final int REGIONAL_CAR_FERRY_VALUE = 4;

	/**
	 * The '<em><b>Local Car Ferry</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_CAR_FERRY
	 * @model name="localCarFerry"
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_CAR_FERRY_VALUE = 5;

	/**
	 * The '<em><b>International Passenger Ferry</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNATIONAL_PASSENGER_FERRY
	 * @model name="internationalPassengerFerry"
	 * @generated
	 * @ordered
	 */
	public static final int INTERNATIONAL_PASSENGER_FERRY_VALUE = 6;

	/**
	 * The '<em><b>National Passenger Ferry</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NATIONAL_PASSENGER_FERRY
	 * @model name="nationalPassengerFerry"
	 * @generated
	 * @ordered
	 */
	public static final int NATIONAL_PASSENGER_FERRY_VALUE = 7;

	/**
	 * The '<em><b>Regional Passenger Ferry</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGIONAL_PASSENGER_FERRY
	 * @model name="regionalPassengerFerry"
	 * @generated
	 * @ordered
	 */
	public static final int REGIONAL_PASSENGER_FERRY_VALUE = 8;

	/**
	 * The '<em><b>Local Passenger Ferry</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_PASSENGER_FERRY
	 * @model name="localPassengerFerry"
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_PASSENGER_FERRY_VALUE = 9;

	/**
	 * The '<em><b>Post Boat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POST_BOAT
	 * @model name="postBoat"
	 * @generated
	 * @ordered
	 */
	public static final int POST_BOAT_VALUE = 10;

	/**
	 * The '<em><b>Train Ferry</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAIN_FERRY
	 * @model name="trainFerry"
	 * @generated
	 * @ordered
	 */
	public static final int TRAIN_FERRY_VALUE = 11;

	/**
	 * The '<em><b>Road Ferry Link</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROAD_FERRY_LINK
	 * @model name="roadFerryLink"
	 * @generated
	 * @ordered
	 */
	public static final int ROAD_FERRY_LINK_VALUE = 12;

	/**
	 * The '<em><b>Airport Boat Link</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIRPORT_BOAT_LINK
	 * @model name="airportBoatLink"
	 * @generated
	 * @ordered
	 */
	public static final int AIRPORT_BOAT_LINK_VALUE = 13;

	/**
	 * The '<em><b>High Speed Vehicle Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGH_SPEED_VEHICLE_SERVICE
	 * @model name="highSpeedVehicleService"
	 * @generated
	 * @ordered
	 */
	public static final int HIGH_SPEED_VEHICLE_SERVICE_VALUE = 14;

	/**
	 * The '<em><b>High Speed Passenger Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGH_SPEED_PASSENGER_SERVICE
	 * @model name="highSpeedPassengerService"
	 * @generated
	 * @ordered
	 */
	public static final int HIGH_SPEED_PASSENGER_SERVICE_VALUE = 15;

	/**
	 * The '<em><b>Sightseeing Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGHTSEEING_SERVICE
	 * @model name="sightseeingService"
	 * @generated
	 * @ordered
	 */
	public static final int SIGHTSEEING_SERVICE_VALUE = 16;

	/**
	 * The '<em><b>School Boat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHOOL_BOAT
	 * @model name="schoolBoat"
	 * @generated
	 * @ordered
	 */
	public static final int SCHOOL_BOAT_VALUE = 17;

	/**
	 * The '<em><b>Cable Ferry</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CABLE_FERRY
	 * @model name="cableFerry"
	 * @generated
	 * @ordered
	 */
	public static final int CABLE_FERRY_VALUE = 18;

	/**
	 * The '<em><b>River Bus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIVER_BUS
	 * @model name="riverBus"
	 * @generated
	 * @ordered
	 */
	public static final int RIVER_BUS_VALUE = 19;

	/**
	 * The '<em><b>Scheduled Ferry</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHEDULED_FERRY
	 * @model name="scheduledFerry"
	 * @generated
	 * @ordered
	 */
	public static final int SCHEDULED_FERRY_VALUE = 20;

	/**
	 * The '<em><b>Shuttle Ferry Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHUTTLE_FERRY_SERVICE
	 * @model name="shuttleFerryService"
	 * @generated
	 * @ordered
	 */
	public static final int SHUTTLE_FERRY_SERVICE_VALUE = 21;

	/**
	 * An array of all the '<em><b>Water Submode Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final WaterSubmodeEnumeration[] VALUES_ARRAY =
		new WaterSubmodeEnumeration[] {
			UNKNOWN,
			UNDEFINED,
			INTERNATIONAL_CAR_FERRY,
			NATIONAL_CAR_FERRY,
			REGIONAL_CAR_FERRY,
			LOCAL_CAR_FERRY,
			INTERNATIONAL_PASSENGER_FERRY,
			NATIONAL_PASSENGER_FERRY,
			REGIONAL_PASSENGER_FERRY,
			LOCAL_PASSENGER_FERRY,
			POST_BOAT,
			TRAIN_FERRY,
			ROAD_FERRY_LINK,
			AIRPORT_BOAT_LINK,
			HIGH_SPEED_VEHICLE_SERVICE,
			HIGH_SPEED_PASSENGER_SERVICE,
			SIGHTSEEING_SERVICE,
			SCHOOL_BOAT,
			CABLE_FERRY,
			RIVER_BUS,
			SCHEDULED_FERRY,
			SHUTTLE_FERRY_SERVICE,
		};

	/**
	 * A public read-only list of all the '<em><b>Water Submode Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<WaterSubmodeEnumeration> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Water Submode Enumeration</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WaterSubmodeEnumeration get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WaterSubmodeEnumeration result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Water Submode Enumeration</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WaterSubmodeEnumeration getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WaterSubmodeEnumeration result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Water Submode Enumeration</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WaterSubmodeEnumeration get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case UNDEFINED_VALUE: return UNDEFINED;
			case INTERNATIONAL_CAR_FERRY_VALUE: return INTERNATIONAL_CAR_FERRY;
			case NATIONAL_CAR_FERRY_VALUE: return NATIONAL_CAR_FERRY;
			case REGIONAL_CAR_FERRY_VALUE: return REGIONAL_CAR_FERRY;
			case LOCAL_CAR_FERRY_VALUE: return LOCAL_CAR_FERRY;
			case INTERNATIONAL_PASSENGER_FERRY_VALUE: return INTERNATIONAL_PASSENGER_FERRY;
			case NATIONAL_PASSENGER_FERRY_VALUE: return NATIONAL_PASSENGER_FERRY;
			case REGIONAL_PASSENGER_FERRY_VALUE: return REGIONAL_PASSENGER_FERRY;
			case LOCAL_PASSENGER_FERRY_VALUE: return LOCAL_PASSENGER_FERRY;
			case POST_BOAT_VALUE: return POST_BOAT;
			case TRAIN_FERRY_VALUE: return TRAIN_FERRY;
			case ROAD_FERRY_LINK_VALUE: return ROAD_FERRY_LINK;
			case AIRPORT_BOAT_LINK_VALUE: return AIRPORT_BOAT_LINK;
			case HIGH_SPEED_VEHICLE_SERVICE_VALUE: return HIGH_SPEED_VEHICLE_SERVICE;
			case HIGH_SPEED_PASSENGER_SERVICE_VALUE: return HIGH_SPEED_PASSENGER_SERVICE;
			case SIGHTSEEING_SERVICE_VALUE: return SIGHTSEEING_SERVICE;
			case SCHOOL_BOAT_VALUE: return SCHOOL_BOAT;
			case CABLE_FERRY_VALUE: return CABLE_FERRY;
			case RIVER_BUS_VALUE: return RIVER_BUS;
			case SCHEDULED_FERRY_VALUE: return SCHEDULED_FERRY;
			case SHUTTLE_FERRY_SERVICE_VALUE: return SHUTTLE_FERRY_SERVICE;
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
	private WaterSubmodeEnumeration(int value, String name, String literal) {
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
	
} //WaterSubmodeEnumeration
