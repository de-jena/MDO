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
 * A representation of the literals of the enumeration '<em><b>Service State Enumeration</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.jena.mdo.ibis.ibis_enumerations.IbisEnumerationsPackage#getServiceStateEnumeration()
 * @model extendedMetaData="name='ServiceStateEnumeration'"
 * @generated
 */
@ProviderType
public enum ServiceStateEnumeration implements Enumerator {
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
	 * The '<em><b>Notrunning</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTRUNNING_VALUE
	 * @generated
	 * @ordered
	 */
	NOTRUNNING(1, "notrunning", "notrunning"),

	/**
	 * The '<em><b>Running</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUNNING_VALUE
	 * @generated
	 * @ordered
	 */
	RUNNING(2, "running", "running"),

	/**
	 * The '<em><b>Standby</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDBY_VALUE
	 * @generated
	 * @ordered
	 */
	STANDBY(3, "standby", "standby"),

	/**
	 * The '<em><b>Starting</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STARTING_VALUE
	 * @generated
	 * @ordered
	 */
	STARTING(4, "starting", "starting");

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
	 * The '<em><b>Notrunning</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTRUNNING
	 * @model name="notrunning"
	 * @generated
	 * @ordered
	 */
	public static final int NOTRUNNING_VALUE = 1;

	/**
	 * The '<em><b>Running</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUNNING
	 * @model name="running"
	 * @generated
	 * @ordered
	 */
	public static final int RUNNING_VALUE = 2;

	/**
	 * The '<em><b>Standby</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDBY
	 * @model name="standby"
	 * @generated
	 * @ordered
	 */
	public static final int STANDBY_VALUE = 3;

	/**
	 * The '<em><b>Starting</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STARTING
	 * @model name="starting"
	 * @generated
	 * @ordered
	 */
	public static final int STARTING_VALUE = 4;

	/**
	 * An array of all the '<em><b>Service State Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ServiceStateEnumeration[] VALUES_ARRAY =
		new ServiceStateEnumeration[] {
			DEFECTIVE,
			NOTRUNNING,
			RUNNING,
			STANDBY,
			STARTING,
		};

	/**
	 * A public read-only list of all the '<em><b>Service State Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ServiceStateEnumeration> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Service State Enumeration</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ServiceStateEnumeration get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ServiceStateEnumeration result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Service State Enumeration</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ServiceStateEnumeration getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ServiceStateEnumeration result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Service State Enumeration</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ServiceStateEnumeration get(int value) {
		switch (value) {
			case DEFECTIVE_VALUE: return DEFECTIVE;
			case NOTRUNNING_VALUE: return NOTRUNNING;
			case RUNNING_VALUE: return RUNNING;
			case STANDBY_VALUE: return STANDBY;
			case STARTING_VALUE: return STARTING;
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
	private ServiceStateEnumeration(int value, String name, String literal) {
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
	
} //ServiceStateEnumeration
