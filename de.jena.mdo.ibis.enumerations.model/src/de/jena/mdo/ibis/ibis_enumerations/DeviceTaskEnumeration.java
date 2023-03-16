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
 * A representation of the literals of the enumeration '<em><b>Device Task Enumeration</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.jena.mdo.ibis.ibis_enumerations.IbisEnumerationsPackage#getDeviceTaskEnumeration()
 * @model extendedMetaData="name='DeviceTaskEnumeration'"
 * @generated
 */
@ProviderType
public enum DeviceTaskEnumeration implements Enumerator {
	/**
	 * The '<em><b>Restart</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESTART_VALUE
	 * @generated
	 * @ordered
	 */
	RESTART(0, "restart", "restart"),

	/**
	 * The '<em><b>Start Standby</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #START_STANDBY_VALUE
	 * @generated
	 * @ordered
	 */
	START_STANDBY(1, "startStandby", "start_standby"),

	/**
	 * The '<em><b>Stop Standby</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOP_STANDBY_VALUE
	 * @generated
	 * @ordered
	 */
	STOP_STANDBY(2, "stopStandby", "stop_standby");

	/**
	 * The '<em><b>Restart</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESTART
	 * @model name="restart"
	 * @generated
	 * @ordered
	 */
	public static final int RESTART_VALUE = 0;

	/**
	 * The '<em><b>Start Standby</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #START_STANDBY
	 * @model name="startStandby" literal="start_standby"
	 * @generated
	 * @ordered
	 */
	public static final int START_STANDBY_VALUE = 1;

	/**
	 * The '<em><b>Stop Standby</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOP_STANDBY
	 * @model name="stopStandby" literal="stop_standby"
	 * @generated
	 * @ordered
	 */
	public static final int STOP_STANDBY_VALUE = 2;

	/**
	 * An array of all the '<em><b>Device Task Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DeviceTaskEnumeration[] VALUES_ARRAY =
		new DeviceTaskEnumeration[] {
			RESTART,
			START_STANDBY,
			STOP_STANDBY,
		};

	/**
	 * A public read-only list of all the '<em><b>Device Task Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DeviceTaskEnumeration> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Device Task Enumeration</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeviceTaskEnumeration get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeviceTaskEnumeration result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Device Task Enumeration</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeviceTaskEnumeration getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeviceTaskEnumeration result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Device Task Enumeration</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeviceTaskEnumeration get(int value) {
		switch (value) {
			case RESTART_VALUE: return RESTART;
			case START_STANDBY_VALUE: return START_STANDBY;
			case STOP_STANDBY_VALUE: return STOP_STANDBY;
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
	private DeviceTaskEnumeration(int value, String name, String literal) {
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
	
} //DeviceTaskEnumeration
