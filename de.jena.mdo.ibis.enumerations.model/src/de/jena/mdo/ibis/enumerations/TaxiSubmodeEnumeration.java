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
 * A representation of the literals of the enumeration '<em><b>Taxi Submode Enumeration</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Values for Taxi MODEs of TRANSPORT: TPEG pti_table_11.
 * <!-- end-model-doc -->
 * @see de.jena.mdo.ibis.enumerations.IbisEnumerationsPackage#getTaxiSubmodeEnumeration()
 * @model extendedMetaData="name='TaxiSubmodeEnumeration'"
 * @generated
 */
@ProviderType
public enum TaxiSubmodeEnumeration implements Enumerator {
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
	 * The '<em><b>Communal Taxi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMUNAL_TAXI_VALUE
	 * @generated
	 * @ordered
	 */
	COMMUNAL_TAXI(2, "communalTaxi", "communalTaxi"),

	/**
	 * The '<em><b>Charter Taxi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHARTER_TAXI_VALUE
	 * @generated
	 * @ordered
	 */
	CHARTER_TAXI(3, "charterTaxi", "charterTaxi"),

	/**
	 * The '<em><b>Water Taxi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WATER_TAXI_VALUE
	 * @generated
	 * @ordered
	 */
	WATER_TAXI(4, "waterTaxi", "waterTaxi"),

	/**
	 * The '<em><b>Rail Taxi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAIL_TAXI_VALUE
	 * @generated
	 * @ordered
	 */
	RAIL_TAXI(5, "railTaxi", "railTaxi"),

	/**
	 * The '<em><b>Bike Taxi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIKE_TAXI_VALUE
	 * @generated
	 * @ordered
	 */
	BIKE_TAXI(6, "bikeTaxi", "bikeTaxi"),

	/**
	 * The '<em><b>Black Cab</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLACK_CAB_VALUE
	 * @generated
	 * @ordered
	 */
	BLACK_CAB(7, "blackCab", "blackCab"),

	/**
	 * The '<em><b>Mini Cab</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINI_CAB_VALUE
	 * @generated
	 * @ordered
	 */
	MINI_CAB(8, "miniCab", "miniCab"),

	/**
	 * The '<em><b>All Taxi Services</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_TAXI_SERVICES_VALUE
	 * @generated
	 * @ordered
	 */
	ALL_TAXI_SERVICES(9, "allTaxiServices", "allTaxiServices");

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
	 * The '<em><b>Communal Taxi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMUNAL_TAXI
	 * @model name="communalTaxi"
	 * @generated
	 * @ordered
	 */
	public static final int COMMUNAL_TAXI_VALUE = 2;

	/**
	 * The '<em><b>Charter Taxi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHARTER_TAXI
	 * @model name="charterTaxi"
	 * @generated
	 * @ordered
	 */
	public static final int CHARTER_TAXI_VALUE = 3;

	/**
	 * The '<em><b>Water Taxi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WATER_TAXI
	 * @model name="waterTaxi"
	 * @generated
	 * @ordered
	 */
	public static final int WATER_TAXI_VALUE = 4;

	/**
	 * The '<em><b>Rail Taxi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAIL_TAXI
	 * @model name="railTaxi"
	 * @generated
	 * @ordered
	 */
	public static final int RAIL_TAXI_VALUE = 5;

	/**
	 * The '<em><b>Bike Taxi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIKE_TAXI
	 * @model name="bikeTaxi"
	 * @generated
	 * @ordered
	 */
	public static final int BIKE_TAXI_VALUE = 6;

	/**
	 * The '<em><b>Black Cab</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLACK_CAB
	 * @model name="blackCab"
	 * @generated
	 * @ordered
	 */
	public static final int BLACK_CAB_VALUE = 7;

	/**
	 * The '<em><b>Mini Cab</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINI_CAB
	 * @model name="miniCab"
	 * @generated
	 * @ordered
	 */
	public static final int MINI_CAB_VALUE = 8;

	/**
	 * The '<em><b>All Taxi Services</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_TAXI_SERVICES
	 * @model name="allTaxiServices"
	 * @generated
	 * @ordered
	 */
	public static final int ALL_TAXI_SERVICES_VALUE = 9;

	/**
	 * An array of all the '<em><b>Taxi Submode Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TaxiSubmodeEnumeration[] VALUES_ARRAY =
		new TaxiSubmodeEnumeration[] {
			UNKNOWN,
			UNDEFINED,
			COMMUNAL_TAXI,
			CHARTER_TAXI,
			WATER_TAXI,
			RAIL_TAXI,
			BIKE_TAXI,
			BLACK_CAB,
			MINI_CAB,
			ALL_TAXI_SERVICES,
		};

	/**
	 * A public read-only list of all the '<em><b>Taxi Submode Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TaxiSubmodeEnumeration> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Taxi Submode Enumeration</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TaxiSubmodeEnumeration get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TaxiSubmodeEnumeration result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Taxi Submode Enumeration</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TaxiSubmodeEnumeration getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TaxiSubmodeEnumeration result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Taxi Submode Enumeration</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TaxiSubmodeEnumeration get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case UNDEFINED_VALUE: return UNDEFINED;
			case COMMUNAL_TAXI_VALUE: return COMMUNAL_TAXI;
			case CHARTER_TAXI_VALUE: return CHARTER_TAXI;
			case WATER_TAXI_VALUE: return WATER_TAXI;
			case RAIL_TAXI_VALUE: return RAIL_TAXI;
			case BIKE_TAXI_VALUE: return BIKE_TAXI;
			case BLACK_CAB_VALUE: return BLACK_CAB;
			case MINI_CAB_VALUE: return MINI_CAB;
			case ALL_TAXI_SERVICES_VALUE: return ALL_TAXI_SERVICES;
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
	private TaxiSubmodeEnumeration(int value, String name, String literal) {
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
	
} //TaxiSubmodeEnumeration
