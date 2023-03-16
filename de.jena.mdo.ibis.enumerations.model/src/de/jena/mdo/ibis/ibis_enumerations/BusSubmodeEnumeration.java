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
 * A representation of the literals of the enumeration '<em><b>Bus Submode Enumeration</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Values for Bus MODEs of TRANSPORT: TPEG pti_table_05, col_table_10.
 * <!-- end-model-doc -->
 * @see de.jena.mdo.ibis.ibis_enumerations.IbisEnumerationsPackage#getBusSubmodeEnumeration()
 * @model extendedMetaData="name='BusSubmodeEnumeration'"
 * @generated
 */
@ProviderType
public enum BusSubmodeEnumeration implements Enumerator {
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
	 * The '<em><b>Local Bus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_BUS_VALUE
	 * @generated
	 * @ordered
	 */
	LOCAL_BUS(2, "localBus", "localBus"),

	/**
	 * The '<em><b>Regional Bus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGIONAL_BUS_VALUE
	 * @generated
	 * @ordered
	 */
	REGIONAL_BUS(3, "regionalBus", "regionalBus"),

	/**
	 * The '<em><b>Express Bus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPRESS_BUS_VALUE
	 * @generated
	 * @ordered
	 */
	EXPRESS_BUS(4, "expressBus", "expressBus"),

	/**
	 * The '<em><b>Night Bus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NIGHT_BUS_VALUE
	 * @generated
	 * @ordered
	 */
	NIGHT_BUS(5, "nightBus", "nightBus"),

	/**
	 * The '<em><b>Post Bus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POST_BUS_VALUE
	 * @generated
	 * @ordered
	 */
	POST_BUS(6, "postBus", "postBus"),

	/**
	 * The '<em><b>Special Needs Bus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECIAL_NEEDS_BUS_VALUE
	 * @generated
	 * @ordered
	 */
	SPECIAL_NEEDS_BUS(7, "specialNeedsBus", "specialNeedsBus"),

	/**
	 * The '<em><b>Mobility Bus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOBILITY_BUS_VALUE
	 * @generated
	 * @ordered
	 */
	MOBILITY_BUS(8, "mobilityBus", "mobilityBus"),

	/**
	 * The '<em><b>Mobility Bus For Registered Disabled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOBILITY_BUS_FOR_REGISTERED_DISABLED_VALUE
	 * @generated
	 * @ordered
	 */
	MOBILITY_BUS_FOR_REGISTERED_DISABLED(9, "mobilityBusForRegisteredDisabled", "mobilityBusForRegisteredDisabled"),

	/**
	 * The '<em><b>Sightseeing Bus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGHTSEEING_BUS_VALUE
	 * @generated
	 * @ordered
	 */
	SIGHTSEEING_BUS(10, "sightseeingBus", "sightseeingBus"),

	/**
	 * The '<em><b>Shuttle Bus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHUTTLE_BUS_VALUE
	 * @generated
	 * @ordered
	 */
	SHUTTLE_BUS(11, "shuttleBus", "shuttleBus"),

	/**
	 * The '<em><b>High Frequency Bus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGH_FREQUENCY_BUS_VALUE
	 * @generated
	 * @ordered
	 */
	HIGH_FREQUENCY_BUS(12, "highFrequencyBus", "highFrequencyBus"),

	/**
	 * The '<em><b>Dedicated Lane Bus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEDICATED_LANE_BUS_VALUE
	 * @generated
	 * @ordered
	 */
	DEDICATED_LANE_BUS(13, "dedicatedLaneBus", "dedicatedLaneBus"),

	/**
	 * The '<em><b>School Bus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHOOL_BUS_VALUE
	 * @generated
	 * @ordered
	 */
	SCHOOL_BUS(14, "schoolBus", "schoolBus"),

	/**
	 * The '<em><b>School And Public Service Bus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHOOL_AND_PUBLIC_SERVICE_BUS_VALUE
	 * @generated
	 * @ordered
	 */
	SCHOOL_AND_PUBLIC_SERVICE_BUS(15, "schoolAndPublicServiceBus", "schoolAndPublicServiceBus"),

	/**
	 * The '<em><b>Rail Replacement Bus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAIL_REPLACEMENT_BUS_VALUE
	 * @generated
	 * @ordered
	 */
	RAIL_REPLACEMENT_BUS(16, "railReplacementBus", "railReplacementBus"),

	/**
	 * The '<em><b>Demand And Response Bus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEMAND_AND_RESPONSE_BUS_VALUE
	 * @generated
	 * @ordered
	 */
	DEMAND_AND_RESPONSE_BUS(17, "demandAndResponseBus", "demandAndResponseBus"),

	/**
	 * The '<em><b>Airport Link Bus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIRPORT_LINK_BUS_VALUE
	 * @generated
	 * @ordered
	 */
	AIRPORT_LINK_BUS(18, "airportLinkBus", "airportLinkBus");

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
	 * The '<em><b>Local Bus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_BUS
	 * @model name="localBus"
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_BUS_VALUE = 2;

	/**
	 * The '<em><b>Regional Bus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGIONAL_BUS
	 * @model name="regionalBus"
	 * @generated
	 * @ordered
	 */
	public static final int REGIONAL_BUS_VALUE = 3;

	/**
	 * The '<em><b>Express Bus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPRESS_BUS
	 * @model name="expressBus"
	 * @generated
	 * @ordered
	 */
	public static final int EXPRESS_BUS_VALUE = 4;

	/**
	 * The '<em><b>Night Bus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NIGHT_BUS
	 * @model name="nightBus"
	 * @generated
	 * @ordered
	 */
	public static final int NIGHT_BUS_VALUE = 5;

	/**
	 * The '<em><b>Post Bus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POST_BUS
	 * @model name="postBus"
	 * @generated
	 * @ordered
	 */
	public static final int POST_BUS_VALUE = 6;

	/**
	 * The '<em><b>Special Needs Bus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECIAL_NEEDS_BUS
	 * @model name="specialNeedsBus"
	 * @generated
	 * @ordered
	 */
	public static final int SPECIAL_NEEDS_BUS_VALUE = 7;

	/**
	 * The '<em><b>Mobility Bus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOBILITY_BUS
	 * @model name="mobilityBus"
	 * @generated
	 * @ordered
	 */
	public static final int MOBILITY_BUS_VALUE = 8;

	/**
	 * The '<em><b>Mobility Bus For Registered Disabled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOBILITY_BUS_FOR_REGISTERED_DISABLED
	 * @model name="mobilityBusForRegisteredDisabled"
	 * @generated
	 * @ordered
	 */
	public static final int MOBILITY_BUS_FOR_REGISTERED_DISABLED_VALUE = 9;

	/**
	 * The '<em><b>Sightseeing Bus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGHTSEEING_BUS
	 * @model name="sightseeingBus"
	 * @generated
	 * @ordered
	 */
	public static final int SIGHTSEEING_BUS_VALUE = 10;

	/**
	 * The '<em><b>Shuttle Bus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHUTTLE_BUS
	 * @model name="shuttleBus"
	 * @generated
	 * @ordered
	 */
	public static final int SHUTTLE_BUS_VALUE = 11;

	/**
	 * The '<em><b>High Frequency Bus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGH_FREQUENCY_BUS
	 * @model name="highFrequencyBus"
	 * @generated
	 * @ordered
	 */
	public static final int HIGH_FREQUENCY_BUS_VALUE = 12;

	/**
	 * The '<em><b>Dedicated Lane Bus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEDICATED_LANE_BUS
	 * @model name="dedicatedLaneBus"
	 * @generated
	 * @ordered
	 */
	public static final int DEDICATED_LANE_BUS_VALUE = 13;

	/**
	 * The '<em><b>School Bus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHOOL_BUS
	 * @model name="schoolBus"
	 * @generated
	 * @ordered
	 */
	public static final int SCHOOL_BUS_VALUE = 14;

	/**
	 * The '<em><b>School And Public Service Bus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHOOL_AND_PUBLIC_SERVICE_BUS
	 * @model name="schoolAndPublicServiceBus"
	 * @generated
	 * @ordered
	 */
	public static final int SCHOOL_AND_PUBLIC_SERVICE_BUS_VALUE = 15;

	/**
	 * The '<em><b>Rail Replacement Bus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAIL_REPLACEMENT_BUS
	 * @model name="railReplacementBus"
	 * @generated
	 * @ordered
	 */
	public static final int RAIL_REPLACEMENT_BUS_VALUE = 16;

	/**
	 * The '<em><b>Demand And Response Bus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEMAND_AND_RESPONSE_BUS
	 * @model name="demandAndResponseBus"
	 * @generated
	 * @ordered
	 */
	public static final int DEMAND_AND_RESPONSE_BUS_VALUE = 17;

	/**
	 * The '<em><b>Airport Link Bus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIRPORT_LINK_BUS
	 * @model name="airportLinkBus"
	 * @generated
	 * @ordered
	 */
	public static final int AIRPORT_LINK_BUS_VALUE = 18;

	/**
	 * An array of all the '<em><b>Bus Submode Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BusSubmodeEnumeration[] VALUES_ARRAY =
		new BusSubmodeEnumeration[] {
			UNKNOWN,
			UNDEFINED,
			LOCAL_BUS,
			REGIONAL_BUS,
			EXPRESS_BUS,
			NIGHT_BUS,
			POST_BUS,
			SPECIAL_NEEDS_BUS,
			MOBILITY_BUS,
			MOBILITY_BUS_FOR_REGISTERED_DISABLED,
			SIGHTSEEING_BUS,
			SHUTTLE_BUS,
			HIGH_FREQUENCY_BUS,
			DEDICATED_LANE_BUS,
			SCHOOL_BUS,
			SCHOOL_AND_PUBLIC_SERVICE_BUS,
			RAIL_REPLACEMENT_BUS,
			DEMAND_AND_RESPONSE_BUS,
			AIRPORT_LINK_BUS,
		};

	/**
	 * A public read-only list of all the '<em><b>Bus Submode Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BusSubmodeEnumeration> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Bus Submode Enumeration</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BusSubmodeEnumeration get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BusSubmodeEnumeration result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Bus Submode Enumeration</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BusSubmodeEnumeration getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BusSubmodeEnumeration result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Bus Submode Enumeration</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BusSubmodeEnumeration get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case UNDEFINED_VALUE: return UNDEFINED;
			case LOCAL_BUS_VALUE: return LOCAL_BUS;
			case REGIONAL_BUS_VALUE: return REGIONAL_BUS;
			case EXPRESS_BUS_VALUE: return EXPRESS_BUS;
			case NIGHT_BUS_VALUE: return NIGHT_BUS;
			case POST_BUS_VALUE: return POST_BUS;
			case SPECIAL_NEEDS_BUS_VALUE: return SPECIAL_NEEDS_BUS;
			case MOBILITY_BUS_VALUE: return MOBILITY_BUS;
			case MOBILITY_BUS_FOR_REGISTERED_DISABLED_VALUE: return MOBILITY_BUS_FOR_REGISTERED_DISABLED;
			case SIGHTSEEING_BUS_VALUE: return SIGHTSEEING_BUS;
			case SHUTTLE_BUS_VALUE: return SHUTTLE_BUS;
			case HIGH_FREQUENCY_BUS_VALUE: return HIGH_FREQUENCY_BUS;
			case DEDICATED_LANE_BUS_VALUE: return DEDICATED_LANE_BUS;
			case SCHOOL_BUS_VALUE: return SCHOOL_BUS;
			case SCHOOL_AND_PUBLIC_SERVICE_BUS_VALUE: return SCHOOL_AND_PUBLIC_SERVICE_BUS;
			case RAIL_REPLACEMENT_BUS_VALUE: return RAIL_REPLACEMENT_BUS;
			case DEMAND_AND_RESPONSE_BUS_VALUE: return DEMAND_AND_RESPONSE_BUS;
			case AIRPORT_LINK_BUS_VALUE: return AIRPORT_LINK_BUS;
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
	private BusSubmodeEnumeration(int value, String name, String literal) {
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
	
} //BusSubmodeEnumeration
