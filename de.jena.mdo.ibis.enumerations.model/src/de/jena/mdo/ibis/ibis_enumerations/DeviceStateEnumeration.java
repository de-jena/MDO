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
 * A representation of the literals of the enumeration '<em><b>Device State Enumeration</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.jena.mdo.ibis.ibis_enumerations.IbisEnumerationsPackage#getDeviceStateEnumeration()
 * @model extendedMetaData="name='DeviceStateEnumeration'"
 * @generated
 */
@ProviderType
public enum DeviceStateEnumeration implements Enumerator {
	/**
	 * The '<em><b>Defective</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFECTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	DEFECTIVE(0, "defective", "defective"),

	/**
	 * The '<em><b>Warning</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WARNING_VALUE
	 * @generated
	 * @ordered
	 */
	WARNING(1, "warning", "warning"),

	/**
	 * The '<em><b>Notavailable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTAVAILABLE_VALUE
	 * @generated
	 * @ordered
	 */
	NOTAVAILABLE(2, "notavailable", "notavailable"),

	/**
	 * The '<em><b>Running</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUNNING_VALUE
	 * @generated
	 * @ordered
	 */
	RUNNING(3, "running", "running"),

	/**
	 * The '<em><b>Ready For Shutdown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READY_FOR_SHUTDOWN_VALUE
	 * @generated
	 * @ordered
	 */
	READY_FOR_SHUTDOWN(4, "readyForShutdown", "readyForShutdown");

	/**
	 * The '<em><b>Defective</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFECTIVE
	 * @model name="defective"
	 * @generated
	 * @ordered
	 */
	public static final int DEFECTIVE_VALUE = 0;

	/**
	 * The '<em><b>Warning</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WARNING
	 * @model name="warning"
	 * @generated
	 * @ordered
	 */
	public static final int WARNING_VALUE = 1;

	/**
	 * The '<em><b>Notavailable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTAVAILABLE
	 * @model name="notavailable"
	 * @generated
	 * @ordered
	 */
	public static final int NOTAVAILABLE_VALUE = 2;

	/**
	 * The '<em><b>Running</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUNNING
	 * @model name="running"
	 * @generated
	 * @ordered
	 */
	public static final int RUNNING_VALUE = 3;

	/**
	 * The '<em><b>Ready For Shutdown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READY_FOR_SHUTDOWN
	 * @model name="readyForShutdown"
	 * @generated
	 * @ordered
	 */
	public static final int READY_FOR_SHUTDOWN_VALUE = 4;

	/**
	 * An array of all the '<em><b>Device State Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DeviceStateEnumeration[] VALUES_ARRAY =
		new DeviceStateEnumeration[] {
			DEFECTIVE,
			WARNING,
			NOTAVAILABLE,
			RUNNING,
			READY_FOR_SHUTDOWN,
		};

	/**
	 * A public read-only list of all the '<em><b>Device State Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DeviceStateEnumeration> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Device State Enumeration</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeviceStateEnumeration get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeviceStateEnumeration result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Device State Enumeration</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeviceStateEnumeration getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeviceStateEnumeration result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Device State Enumeration</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeviceStateEnumeration get(int value) {
		switch (value) {
			case DEFECTIVE_VALUE: return DEFECTIVE;
			case WARNING_VALUE: return WARNING;
			case NOTAVAILABLE_VALUE: return NOTAVAILABLE;
			case RUNNING_VALUE: return RUNNING;
			case READY_FOR_SHUTDOWN_VALUE: return READY_FOR_SHUTDOWN;
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
	private DeviceStateEnumeration(int value, String name, String literal) {
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
	
} //DeviceStateEnumeration
