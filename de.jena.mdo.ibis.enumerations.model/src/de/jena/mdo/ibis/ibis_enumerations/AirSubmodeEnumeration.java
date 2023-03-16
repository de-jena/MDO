/*
 */
package de.jena.mdo.ibis.ibis_enumerations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Air Submode Enumeration</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Values for Air MODEs of TRANSPORT: TPEG pti_table_08.
 * <!-- end-model-doc -->
 * @see de.jena.mdo.ibis.ibis_enumerations.IbisEnumerationsPackage#getAirSubmodeEnumeration()
 * @model extendedMetaData="name='AirSubmodeEnumeration'"
 * @generated
 */
@ProviderType
public enum AirSubmodeEnumeration implements Enumerator {
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
	 * The '<em><b>International Flight</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNATIONAL_FLIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	INTERNATIONAL_FLIGHT(2, "internationalFlight", "internationalFlight"),

	/**
	 * The '<em><b>Domestic Flight</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOMESTIC_FLIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	DOMESTIC_FLIGHT(3, "domesticFlight", "domesticFlight"),

	/**
	 * The '<em><b>Intercontinental Flight</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERCONTINENTAL_FLIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	INTERCONTINENTAL_FLIGHT(4, "intercontinentalFlight", "intercontinentalFlight"),

	/**
	 * The '<em><b>Domestic Scheduled Flight</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOMESTIC_SCHEDULED_FLIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	DOMESTIC_SCHEDULED_FLIGHT(5, "domesticScheduledFlight", "domesticScheduledFlight"),

	/**
	 * The '<em><b>Shuttle Flight</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHUTTLE_FLIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	SHUTTLE_FLIGHT(6, "shuttleFlight", "shuttleFlight"),

	/**
	 * The '<em><b>Intercontinental Charter Flight</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERCONTINENTAL_CHARTER_FLIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	INTERCONTINENTAL_CHARTER_FLIGHT(7, "intercontinentalCharterFlight", "intercontinentalCharterFlight"),

	/**
	 * The '<em><b>International Charter Flight</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNATIONAL_CHARTER_FLIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	INTERNATIONAL_CHARTER_FLIGHT(8, "internationalCharterFlight", "internationalCharterFlight"),

	/**
	 * The '<em><b>Round Trip Charter Flight</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROUND_TRIP_CHARTER_FLIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	ROUND_TRIP_CHARTER_FLIGHT(9, "roundTripCharterFlight", "roundTripCharterFlight"),

	/**
	 * The '<em><b>Sightseeing Flight</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGHTSEEING_FLIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	SIGHTSEEING_FLIGHT(10, "sightseeingFlight", "sightseeingFlight"),

	/**
	 * The '<em><b>Helicopter Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HELICOPTER_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	HELICOPTER_SERVICE(11, "helicopterService", "helicopterService"),

	/**
	 * The '<em><b>Domestic Charter Flight</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOMESTIC_CHARTER_FLIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	DOMESTIC_CHARTER_FLIGHT(12, "domesticCharterFlight", "domesticCharterFlight"),

	/**
	 * The '<em><b>Schengen Area Flight</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHENGEN_AREA_FLIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	SCHENGEN_AREA_FLIGHT(13, "SchengenAreaFlight", "SchengenAreaFlight"),

	/**
	 * The '<em><b>Airship Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIRSHIP_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	AIRSHIP_SERVICE(14, "airshipService", "airshipService"),

	/**
	 * The '<em><b>Short Haul International Flight</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHORT_HAUL_INTERNATIONAL_FLIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	SHORT_HAUL_INTERNATIONAL_FLIGHT(15, "shortHaulInternationalFlight", "shortHaulInternationalFlight"),

	/**
	 * The '<em><b>Canal Barge</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #CANAL_BARGE_VALUE
	 * @generated
	 * @ordered
	 */
	CANAL_BARGE(16, "canalBarge", "canalBarge");

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
	 * The '<em><b>International Flight</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNATIONAL_FLIGHT
	 * @model name="internationalFlight"
	 * @generated
	 * @ordered
	 */
	public static final int INTERNATIONAL_FLIGHT_VALUE = 2;

	/**
	 * The '<em><b>Domestic Flight</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOMESTIC_FLIGHT
	 * @model name="domesticFlight"
	 * @generated
	 * @ordered
	 */
	public static final int DOMESTIC_FLIGHT_VALUE = 3;

	/**
	 * The '<em><b>Intercontinental Flight</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERCONTINENTAL_FLIGHT
	 * @model name="intercontinentalFlight"
	 * @generated
	 * @ordered
	 */
	public static final int INTERCONTINENTAL_FLIGHT_VALUE = 4;

	/**
	 * The '<em><b>Domestic Scheduled Flight</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOMESTIC_SCHEDULED_FLIGHT
	 * @model name="domesticScheduledFlight"
	 * @generated
	 * @ordered
	 */
	public static final int DOMESTIC_SCHEDULED_FLIGHT_VALUE = 5;

	/**
	 * The '<em><b>Shuttle Flight</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHUTTLE_FLIGHT
	 * @model name="shuttleFlight"
	 * @generated
	 * @ordered
	 */
	public static final int SHUTTLE_FLIGHT_VALUE = 6;

	/**
	 * The '<em><b>Intercontinental Charter Flight</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERCONTINENTAL_CHARTER_FLIGHT
	 * @model name="intercontinentalCharterFlight"
	 * @generated
	 * @ordered
	 */
	public static final int INTERCONTINENTAL_CHARTER_FLIGHT_VALUE = 7;

	/**
	 * The '<em><b>International Charter Flight</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNATIONAL_CHARTER_FLIGHT
	 * @model name="internationalCharterFlight"
	 * @generated
	 * @ordered
	 */
	public static final int INTERNATIONAL_CHARTER_FLIGHT_VALUE = 8;

	/**
	 * The '<em><b>Round Trip Charter Flight</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROUND_TRIP_CHARTER_FLIGHT
	 * @model name="roundTripCharterFlight"
	 * @generated
	 * @ordered
	 */
	public static final int ROUND_TRIP_CHARTER_FLIGHT_VALUE = 9;

	/**
	 * The '<em><b>Sightseeing Flight</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGHTSEEING_FLIGHT
	 * @model name="sightseeingFlight"
	 * @generated
	 * @ordered
	 */
	public static final int SIGHTSEEING_FLIGHT_VALUE = 10;

	/**
	 * The '<em><b>Helicopter Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HELICOPTER_SERVICE
	 * @model name="helicopterService"
	 * @generated
	 * @ordered
	 */
	public static final int HELICOPTER_SERVICE_VALUE = 11;

	/**
	 * The '<em><b>Domestic Charter Flight</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOMESTIC_CHARTER_FLIGHT
	 * @model name="domesticCharterFlight"
	 * @generated
	 * @ordered
	 */
	public static final int DOMESTIC_CHARTER_FLIGHT_VALUE = 12;

	/**
	 * The '<em><b>Schengen Area Flight</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHENGEN_AREA_FLIGHT
	 * @model name="SchengenAreaFlight"
	 * @generated
	 * @ordered
	 */
	public static final int SCHENGEN_AREA_FLIGHT_VALUE = 13;

	/**
	 * The '<em><b>Airship Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIRSHIP_SERVICE
	 * @model name="airshipService"
	 * @generated
	 * @ordered
	 */
	public static final int AIRSHIP_SERVICE_VALUE = 14;

	/**
	 * The '<em><b>Short Haul International Flight</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHORT_HAUL_INTERNATIONAL_FLIGHT
	 * @model name="shortHaulInternationalFlight"
	 * @generated
	 * @ordered
	 */
	public static final int SHORT_HAUL_INTERNATIONAL_FLIGHT_VALUE = 15;

	/**
	 * The '<em><b>Canal Barge</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #CANAL_BARGE
	 * @model name="canalBarge"
	 * @generated
	 * @ordered
	 */
	public static final int CANAL_BARGE_VALUE = 16;

	/**
	 * An array of all the '<em><b>Air Submode Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AirSubmodeEnumeration[] VALUES_ARRAY =
		new AirSubmodeEnumeration[] {
			UNKNOWN,
			UNDEFINED,
			INTERNATIONAL_FLIGHT,
			DOMESTIC_FLIGHT,
			INTERCONTINENTAL_FLIGHT,
			DOMESTIC_SCHEDULED_FLIGHT,
			SHUTTLE_FLIGHT,
			INTERCONTINENTAL_CHARTER_FLIGHT,
			INTERNATIONAL_CHARTER_FLIGHT,
			ROUND_TRIP_CHARTER_FLIGHT,
			SIGHTSEEING_FLIGHT,
			HELICOPTER_SERVICE,
			DOMESTIC_CHARTER_FLIGHT,
			SCHENGEN_AREA_FLIGHT,
			AIRSHIP_SERVICE,
			SHORT_HAUL_INTERNATIONAL_FLIGHT,
			CANAL_BARGE,
		};

	/**
	 * A public read-only list of all the '<em><b>Air Submode Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AirSubmodeEnumeration> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Air Submode Enumeration</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AirSubmodeEnumeration get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AirSubmodeEnumeration result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Air Submode Enumeration</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AirSubmodeEnumeration getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AirSubmodeEnumeration result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Air Submode Enumeration</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AirSubmodeEnumeration get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case UNDEFINED_VALUE: return UNDEFINED;
			case INTERNATIONAL_FLIGHT_VALUE: return INTERNATIONAL_FLIGHT;
			case DOMESTIC_FLIGHT_VALUE: return DOMESTIC_FLIGHT;
			case INTERCONTINENTAL_FLIGHT_VALUE: return INTERCONTINENTAL_FLIGHT;
			case DOMESTIC_SCHEDULED_FLIGHT_VALUE: return DOMESTIC_SCHEDULED_FLIGHT;
			case SHUTTLE_FLIGHT_VALUE: return SHUTTLE_FLIGHT;
			case INTERCONTINENTAL_CHARTER_FLIGHT_VALUE: return INTERCONTINENTAL_CHARTER_FLIGHT;
			case INTERNATIONAL_CHARTER_FLIGHT_VALUE: return INTERNATIONAL_CHARTER_FLIGHT;
			case ROUND_TRIP_CHARTER_FLIGHT_VALUE: return ROUND_TRIP_CHARTER_FLIGHT;
			case SIGHTSEEING_FLIGHT_VALUE: return SIGHTSEEING_FLIGHT;
			case HELICOPTER_SERVICE_VALUE: return HELICOPTER_SERVICE;
			case DOMESTIC_CHARTER_FLIGHT_VALUE: return DOMESTIC_CHARTER_FLIGHT;
			case SCHENGEN_AREA_FLIGHT_VALUE: return SCHENGEN_AREA_FLIGHT;
			case AIRSHIP_SERVICE_VALUE: return AIRSHIP_SERVICE;
			case SHORT_HAUL_INTERNATIONAL_FLIGHT_VALUE: return SHORT_HAUL_INTERNATIONAL_FLIGHT;
			case CANAL_BARGE_VALUE: return CANAL_BARGE;
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
	private AirSubmodeEnumeration(int value, String name, String literal) {
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
	
} //AirSubmodeEnumeration
