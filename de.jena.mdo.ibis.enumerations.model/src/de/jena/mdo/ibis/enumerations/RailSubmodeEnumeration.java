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
 * A representation of the literals of the enumeration '<em><b>Rail Submode Enumeration</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Values for Rail MODEs of TRANSPORT: TPEG pti_table_02, train link loc_table_13.
 * <!-- end-model-doc -->
 * @see de.jena.mdo.ibis.enumerations.IbisEnumerationsPackage#getRailSubmodeEnumeration()
 * @model extendedMetaData="name='RailSubmodeEnumeration'"
 * @generated
 */
@ProviderType
public enum RailSubmodeEnumeration implements Enumerator {
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
	 * The '<em><b>Local</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_VALUE
	 * @generated
	 * @ordered
	 */
	LOCAL(1, "local", "local"),

	/**
	 * The '<em><b>High Speed Rail</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See ERA B.4.7009 - Name: Item description code: (8 high speed train). Long distance train formed by a unit capable for high speed running on high speed or normal lines most modern train unit
	 * <!-- end-model-doc -->
	 * @see #HIGH_SPEED_RAIL_VALUE
	 * @generated
	 * @ordered
	 */
	HIGH_SPEED_RAIL(2, "highSpeedRail", "highSpeedRail"),

	/**
	 * The '<em><b>Suburban Railway</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See ERA B.4.7009 - Name: Item description code: . (12 suburban) Regional train organised by the regional government public transport in and around cities, running on its own freeways underground or overground, operational running with signals
	 * <!-- end-model-doc -->
	 * @see #SUBURBAN_RAILWAY_VALUE
	 * @generated
	 * @ordered
	 */
	SUBURBAN_RAILWAY(3, "suburbanRailway", "suburbanRailway"),

	/**
	 * The '<em><b>Regional Rail</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See ERA B.4.7009 - Name: Item description code. (11 Regional) Regional train organised by the regional government even if formed by a unit capable for high speed running on high speed lines
	 * <!-- end-model-doc -->
	 * @see #REGIONAL_RAIL_VALUE
	 * @generated
	 * @ordered
	 */
	REGIONAL_RAIL(4, "regionalRail", "regionalRail"),

	/**
	 * The '<em><b>Interregional Rail</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See ERA B.4.7009 - Name: Item description code: (10 Interregional) Regional train running in more than one region.
	 * <!-- end-model-doc -->
	 * @see #INTERREGIONAL_RAIL_VALUE
	 * @generated
	 * @ordered
	 */
	INTERREGIONAL_RAIL(5, "interregionalRail", "interregionalRail"),

	/**
	 * The '<em><b>Long Distance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See ERA B.4.7009 - Name: Item description code: (9 Intercity). Long distance train formed by a unit capable for high speed or not running on high speed or normal lines modern train unit high quality service restricted stopping pattern
	 * <!-- end-model-doc -->
	 * @see #LONG_DISTANCE_VALUE
	 * @generated
	 * @ordered
	 */
	LONG_DISTANCE(6, "longDistance", "longDistance"),

	/**
	 * The '<em><b>International</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNATIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	INTERNATIONAL(7, "international", "international"),

	/**
	 * The '<em><b>Sleeper Rail Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SLEEPER_RAIL_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	SLEEPER_RAIL_SERVICE(8, "sleeperRailService", "sleeperRailService"),

	/**
	 * The '<em><b>Night Rail</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NIGHT_RAIL_VALUE
	 * @generated
	 * @ordered
	 */
	NIGHT_RAIL(9, "nightRail", "nightRail"),

	/**
	 * The '<em><b>Car Transport Rail Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See ERA B.4.7009 - Name: Item description code: (14 Motor rail) Service transporting passenger's motor vehicle passengers are admitted either with vehicle only or with or without vehicle Service mode
	 * <!-- end-model-doc -->
	 * @see #CAR_TRANSPORT_RAIL_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	CAR_TRANSPORT_RAIL_SERVICE(10, "carTransportRailService", "carTransportRailService"),

	/**
	 * The '<em><b>Tourist Railway</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See ERA B.4.7009 - Name: Item description code: (16 Historic train).
	 * <!-- end-model-doc -->
	 * @see #TOURIST_RAILWAY_VALUE
	 * @generated
	 * @ordered
	 */
	TOURIST_RAILWAY(11, "touristRailway", "touristRailway"),

	/**
	 * The '<em><b>Airport Link Rail</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIRPORT_LINK_RAIL_VALUE
	 * @generated
	 * @ordered
	 */
	AIRPORT_LINK_RAIL(12, "airportLinkRail", "airportLinkRail"),

	/**
	 * The '<em><b>Rail Shuttle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAIL_SHUTTLE_VALUE
	 * @generated
	 * @ordered
	 */
	RAIL_SHUTTLE(13, "railShuttle", "railShuttle"),

	/**
	 * The '<em><b>Replacement Rail Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPLACEMENT_RAIL_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	REPLACEMENT_RAIL_SERVICE(14, "replacementRailService", "replacementRailService"),

	/**
	 * The '<em><b>Special Train</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECIAL_TRAIN_VALUE
	 * @generated
	 * @ordered
	 */
	SPECIAL_TRAIN(15, "specialTrain", "specialTrain"),

	/**
	 * The '<em><b>Cross Country Rail</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CROSS_COUNTRY_RAIL_VALUE
	 * @generated
	 * @ordered
	 */
	CROSS_COUNTRY_RAIL(16, "crossCountryRail", "crossCountryRail"),

	/**
	 * The '<em><b>Rack And Pinion Railway</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See ERA B.4.7009 - Name: Item description code: (15 Mountain train) Local train adapted for running in mountain railway lines.
	 * <!-- end-model-doc -->
	 * @see #RACK_AND_PINION_RAILWAY_VALUE
	 * @generated
	 * @ordered
	 */
	RACK_AND_PINION_RAILWAY(17, "rackAndPinionRailway", "rackAndPinionRailway");

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
	 * The '<em><b>Local</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL
	 * @model name="local"
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_VALUE = 1;

	/**
	 * The '<em><b>High Speed Rail</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See ERA B.4.7009 - Name: Item description code: (8 high speed train). Long distance train formed by a unit capable for high speed running on high speed or normal lines most modern train unit
	 * <!-- end-model-doc -->
	 * @see #HIGH_SPEED_RAIL
	 * @model name="highSpeedRail"
	 * @generated
	 * @ordered
	 */
	public static final int HIGH_SPEED_RAIL_VALUE = 2;

	/**
	 * The '<em><b>Suburban Railway</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See ERA B.4.7009 - Name: Item description code: . (12 suburban) Regional train organised by the regional government public transport in and around cities, running on its own freeways underground or overground, operational running with signals
	 * <!-- end-model-doc -->
	 * @see #SUBURBAN_RAILWAY
	 * @model name="suburbanRailway"
	 * @generated
	 * @ordered
	 */
	public static final int SUBURBAN_RAILWAY_VALUE = 3;

	/**
	 * The '<em><b>Regional Rail</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See ERA B.4.7009 - Name: Item description code. (11 Regional) Regional train organised by the regional government even if formed by a unit capable for high speed running on high speed lines
	 * <!-- end-model-doc -->
	 * @see #REGIONAL_RAIL
	 * @model name="regionalRail"
	 * @generated
	 * @ordered
	 */
	public static final int REGIONAL_RAIL_VALUE = 4;

	/**
	 * The '<em><b>Interregional Rail</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See ERA B.4.7009 - Name: Item description code: (10 Interregional) Regional train running in more than one region.
	 * <!-- end-model-doc -->
	 * @see #INTERREGIONAL_RAIL
	 * @model name="interregionalRail"
	 * @generated
	 * @ordered
	 */
	public static final int INTERREGIONAL_RAIL_VALUE = 5;

	/**
	 * The '<em><b>Long Distance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See ERA B.4.7009 - Name: Item description code: (9 Intercity). Long distance train formed by a unit capable for high speed or not running on high speed or normal lines modern train unit high quality service restricted stopping pattern
	 * <!-- end-model-doc -->
	 * @see #LONG_DISTANCE
	 * @model name="longDistance"
	 * @generated
	 * @ordered
	 */
	public static final int LONG_DISTANCE_VALUE = 6;

	/**
	 * The '<em><b>International</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNATIONAL
	 * @model name="international"
	 * @generated
	 * @ordered
	 */
	public static final int INTERNATIONAL_VALUE = 7;

	/**
	 * The '<em><b>Sleeper Rail Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SLEEPER_RAIL_SERVICE
	 * @model name="sleeperRailService"
	 * @generated
	 * @ordered
	 */
	public static final int SLEEPER_RAIL_SERVICE_VALUE = 8;

	/**
	 * The '<em><b>Night Rail</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NIGHT_RAIL
	 * @model name="nightRail"
	 * @generated
	 * @ordered
	 */
	public static final int NIGHT_RAIL_VALUE = 9;

	/**
	 * The '<em><b>Car Transport Rail Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See ERA B.4.7009 - Name: Item description code: (14 Motor rail) Service transporting passenger's motor vehicle passengers are admitted either with vehicle only or with or without vehicle Service mode
	 * <!-- end-model-doc -->
	 * @see #CAR_TRANSPORT_RAIL_SERVICE
	 * @model name="carTransportRailService"
	 * @generated
	 * @ordered
	 */
	public static final int CAR_TRANSPORT_RAIL_SERVICE_VALUE = 10;

	/**
	 * The '<em><b>Tourist Railway</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See ERA B.4.7009 - Name: Item description code: (16 Historic train).
	 * <!-- end-model-doc -->
	 * @see #TOURIST_RAILWAY
	 * @model name="touristRailway"
	 * @generated
	 * @ordered
	 */
	public static final int TOURIST_RAILWAY_VALUE = 11;

	/**
	 * The '<em><b>Airport Link Rail</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIRPORT_LINK_RAIL
	 * @model name="airportLinkRail"
	 * @generated
	 * @ordered
	 */
	public static final int AIRPORT_LINK_RAIL_VALUE = 12;

	/**
	 * The '<em><b>Rail Shuttle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAIL_SHUTTLE
	 * @model name="railShuttle"
	 * @generated
	 * @ordered
	 */
	public static final int RAIL_SHUTTLE_VALUE = 13;

	/**
	 * The '<em><b>Replacement Rail Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPLACEMENT_RAIL_SERVICE
	 * @model name="replacementRailService"
	 * @generated
	 * @ordered
	 */
	public static final int REPLACEMENT_RAIL_SERVICE_VALUE = 14;

	/**
	 * The '<em><b>Special Train</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECIAL_TRAIN
	 * @model name="specialTrain"
	 * @generated
	 * @ordered
	 */
	public static final int SPECIAL_TRAIN_VALUE = 15;

	/**
	 * The '<em><b>Cross Country Rail</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CROSS_COUNTRY_RAIL
	 * @model name="crossCountryRail"
	 * @generated
	 * @ordered
	 */
	public static final int CROSS_COUNTRY_RAIL_VALUE = 16;

	/**
	 * The '<em><b>Rack And Pinion Railway</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See ERA B.4.7009 - Name: Item description code: (15 Mountain train) Local train adapted for running in mountain railway lines.
	 * <!-- end-model-doc -->
	 * @see #RACK_AND_PINION_RAILWAY
	 * @model name="rackAndPinionRailway"
	 * @generated
	 * @ordered
	 */
	public static final int RACK_AND_PINION_RAILWAY_VALUE = 17;

	/**
	 * An array of all the '<em><b>Rail Submode Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RailSubmodeEnumeration[] VALUES_ARRAY =
		new RailSubmodeEnumeration[] {
			UNKNOWN,
			LOCAL,
			HIGH_SPEED_RAIL,
			SUBURBAN_RAILWAY,
			REGIONAL_RAIL,
			INTERREGIONAL_RAIL,
			LONG_DISTANCE,
			INTERNATIONAL,
			SLEEPER_RAIL_SERVICE,
			NIGHT_RAIL,
			CAR_TRANSPORT_RAIL_SERVICE,
			TOURIST_RAILWAY,
			AIRPORT_LINK_RAIL,
			RAIL_SHUTTLE,
			REPLACEMENT_RAIL_SERVICE,
			SPECIAL_TRAIN,
			CROSS_COUNTRY_RAIL,
			RACK_AND_PINION_RAILWAY,
		};

	/**
	 * A public read-only list of all the '<em><b>Rail Submode Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RailSubmodeEnumeration> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Rail Submode Enumeration</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RailSubmodeEnumeration get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RailSubmodeEnumeration result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Rail Submode Enumeration</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RailSubmodeEnumeration getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RailSubmodeEnumeration result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Rail Submode Enumeration</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RailSubmodeEnumeration get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case LOCAL_VALUE: return LOCAL;
			case HIGH_SPEED_RAIL_VALUE: return HIGH_SPEED_RAIL;
			case SUBURBAN_RAILWAY_VALUE: return SUBURBAN_RAILWAY;
			case REGIONAL_RAIL_VALUE: return REGIONAL_RAIL;
			case INTERREGIONAL_RAIL_VALUE: return INTERREGIONAL_RAIL;
			case LONG_DISTANCE_VALUE: return LONG_DISTANCE;
			case INTERNATIONAL_VALUE: return INTERNATIONAL;
			case SLEEPER_RAIL_SERVICE_VALUE: return SLEEPER_RAIL_SERVICE;
			case NIGHT_RAIL_VALUE: return NIGHT_RAIL;
			case CAR_TRANSPORT_RAIL_SERVICE_VALUE: return CAR_TRANSPORT_RAIL_SERVICE;
			case TOURIST_RAILWAY_VALUE: return TOURIST_RAILWAY;
			case AIRPORT_LINK_RAIL_VALUE: return AIRPORT_LINK_RAIL;
			case RAIL_SHUTTLE_VALUE: return RAIL_SHUTTLE;
			case REPLACEMENT_RAIL_SERVICE_VALUE: return REPLACEMENT_RAIL_SERVICE;
			case SPECIAL_TRAIN_VALUE: return SPECIAL_TRAIN;
			case CROSS_COUNTRY_RAIL_VALUE: return CROSS_COUNTRY_RAIL;
			case RACK_AND_PINION_RAILWAY_VALUE: return RACK_AND_PINION_RAILWAY;
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
	private RailSubmodeEnumeration(int value, String name, String literal) {
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
	
} //RailSubmodeEnumeration
