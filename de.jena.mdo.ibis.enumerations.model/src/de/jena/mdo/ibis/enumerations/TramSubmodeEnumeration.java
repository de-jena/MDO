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
 * A representation of the literals of the enumeration '<em><b>Tram Submode Enumeration</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Values for Tram MODEs of TRANSPORT: TPEG pti_table_06, col_table_12.
 * <!-- end-model-doc -->
 * @see de.jena.mdo.ibis.enumerations.IbisEnumerationsPackage#getTramSubmodeEnumeration()
 * @model extendedMetaData="name='TramSubmodeEnumeration'"
 * @generated
 */
@ProviderType
public enum TramSubmodeEnumeration implements Enumerator {
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
	 * The '<em><b>City Tram</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CITY_TRAM_VALUE
	 * @generated
	 * @ordered
	 */
	CITY_TRAM(2, "cityTram", "cityTram"),

	/**
	 * The '<em><b>Local Tram</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_TRAM_VALUE
	 * @generated
	 * @ordered
	 */
	LOCAL_TRAM(3, "localTram", "localTram"),

	/**
	 * The '<em><b>Regional Tram</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGIONAL_TRAM_VALUE
	 * @generated
	 * @ordered
	 */
	REGIONAL_TRAM(4, "regionalTram", "regionalTram"),

	/**
	 * The '<em><b>Sightseeing Tram</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGHTSEEING_TRAM_VALUE
	 * @generated
	 * @ordered
	 */
	SIGHTSEEING_TRAM(5, "sightseeingTram", "sightseeingTram"),

	/**
	 * The '<em><b>Shuttle Tram</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHUTTLE_TRAM_VALUE
	 * @generated
	 * @ordered
	 */
	SHUTTLE_TRAM(6, "shuttleTram", "shuttleTram"),

	/**
	 * The '<em><b>Train Tram</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAIN_TRAM_VALUE
	 * @generated
	 * @ordered
	 */
	TRAIN_TRAM(7, "trainTram", "trainTram");

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
	 * The '<em><b>City Tram</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CITY_TRAM
	 * @model name="cityTram"
	 * @generated
	 * @ordered
	 */
	public static final int CITY_TRAM_VALUE = 2;

	/**
	 * The '<em><b>Local Tram</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_TRAM
	 * @model name="localTram"
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_TRAM_VALUE = 3;

	/**
	 * The '<em><b>Regional Tram</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGIONAL_TRAM
	 * @model name="regionalTram"
	 * @generated
	 * @ordered
	 */
	public static final int REGIONAL_TRAM_VALUE = 4;

	/**
	 * The '<em><b>Sightseeing Tram</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGHTSEEING_TRAM
	 * @model name="sightseeingTram"
	 * @generated
	 * @ordered
	 */
	public static final int SIGHTSEEING_TRAM_VALUE = 5;

	/**
	 * The '<em><b>Shuttle Tram</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHUTTLE_TRAM
	 * @model name="shuttleTram"
	 * @generated
	 * @ordered
	 */
	public static final int SHUTTLE_TRAM_VALUE = 6;

	/**
	 * The '<em><b>Train Tram</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAIN_TRAM
	 * @model name="trainTram"
	 * @generated
	 * @ordered
	 */
	public static final int TRAIN_TRAM_VALUE = 7;

	/**
	 * An array of all the '<em><b>Tram Submode Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TramSubmodeEnumeration[] VALUES_ARRAY =
		new TramSubmodeEnumeration[] {
			UNKNOWN,
			UNDEFINED,
			CITY_TRAM,
			LOCAL_TRAM,
			REGIONAL_TRAM,
			SIGHTSEEING_TRAM,
			SHUTTLE_TRAM,
			TRAIN_TRAM,
		};

	/**
	 * A public read-only list of all the '<em><b>Tram Submode Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TramSubmodeEnumeration> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tram Submode Enumeration</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TramSubmodeEnumeration get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TramSubmodeEnumeration result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tram Submode Enumeration</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TramSubmodeEnumeration getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TramSubmodeEnumeration result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tram Submode Enumeration</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TramSubmodeEnumeration get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case UNDEFINED_VALUE: return UNDEFINED;
			case CITY_TRAM_VALUE: return CITY_TRAM;
			case LOCAL_TRAM_VALUE: return LOCAL_TRAM;
			case REGIONAL_TRAM_VALUE: return REGIONAL_TRAM;
			case SIGHTSEEING_TRAM_VALUE: return SIGHTSEEING_TRAM;
			case SHUTTLE_TRAM_VALUE: return SHUTTLE_TRAM;
			case TRAIN_TRAM_VALUE: return TRAIN_TRAM;
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
	private TramSubmodeEnumeration(int value, String name, String literal) {
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
	
} //TramSubmodeEnumeration
