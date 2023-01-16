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
 * A representation of the literals of the enumeration '<em><b>Data Interval Enumeration</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.jena.mdo.ibis.enumerations.IbisEnumerationsPackage#getDataIntervalEnumeration()
 * @model extendedMetaData="name='DataIntervalEnumeration'"
 * @generated
 */
@ProviderType
public enum DataIntervalEnumeration implements Enumerator {
	/**
	 * The '<em><b>Distance Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTANCE_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	DISTANCE_DATA(0, "DistanceData", "DistanceData"),

	/**
	 * The '<em><b>GNSS Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GNSS_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	GNSS_DATA(1, "GNSSData", "GNSSData"),

	/**
	 * The '<em><b>Heartbeat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEARTBEAT_VALUE
	 * @generated
	 * @ordered
	 */
	HEARTBEAT(2, "Heartbeat", "Heartbeat"),

	/**
	 * The '<em><b>Network Location Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NETWORK_LOCATION_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	NETWORK_LOCATION_DATA(3, "NetworkLocationData", "NetworkLocationData");

	/**
	 * The '<em><b>Distance Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTANCE_DATA
	 * @model name="DistanceData"
	 * @generated
	 * @ordered
	 */
	public static final int DISTANCE_DATA_VALUE = 0;

	/**
	 * The '<em><b>GNSS Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GNSS_DATA
	 * @model name="GNSSData"
	 * @generated
	 * @ordered
	 */
	public static final int GNSS_DATA_VALUE = 1;

	/**
	 * The '<em><b>Heartbeat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEARTBEAT
	 * @model name="Heartbeat"
	 * @generated
	 * @ordered
	 */
	public static final int HEARTBEAT_VALUE = 2;

	/**
	 * The '<em><b>Network Location Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NETWORK_LOCATION_DATA
	 * @model name="NetworkLocationData"
	 * @generated
	 * @ordered
	 */
	public static final int NETWORK_LOCATION_DATA_VALUE = 3;

	/**
	 * An array of all the '<em><b>Data Interval Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataIntervalEnumeration[] VALUES_ARRAY =
		new DataIntervalEnumeration[] {
			DISTANCE_DATA,
			GNSS_DATA,
			HEARTBEAT,
			NETWORK_LOCATION_DATA,
		};

	/**
	 * A public read-only list of all the '<em><b>Data Interval Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataIntervalEnumeration> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Interval Enumeration</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataIntervalEnumeration get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataIntervalEnumeration result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Interval Enumeration</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataIntervalEnumeration getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataIntervalEnumeration result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Interval Enumeration</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataIntervalEnumeration get(int value) {
		switch (value) {
			case DISTANCE_DATA_VALUE: return DISTANCE_DATA;
			case GNSS_DATA_VALUE: return GNSS_DATA;
			case HEARTBEAT_VALUE: return HEARTBEAT;
			case NETWORK_LOCATION_DATA_VALUE: return NETWORK_LOCATION_DATA;
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
	private DataIntervalEnumeration(int value, String name, String literal) {
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
	
} //DataIntervalEnumeration
