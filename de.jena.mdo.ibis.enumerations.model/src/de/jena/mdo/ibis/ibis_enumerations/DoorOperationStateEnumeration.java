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
 * A representation of the literals of the enumeration '<em><b>Door Operation State Enumeration</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.jena.mdo.ibis.ibis_enumerations.IbisEnumerationsPackage#getDoorOperationStateEnumeration()
 * @model extendedMetaData="name='DoorOperationStateEnumeration'"
 * @generated
 */
@ProviderType
public enum DoorOperationStateEnumeration implements Enumerator {
	/**
	 * The '<em><b>Locked</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCKED_VALUE
	 * @generated
	 * @ordered
	 */
	LOCKED(0, "Locked", "Locked"),

	/**
	 * The '<em><b>Normal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMAL_VALUE
	 * @generated
	 * @ordered
	 */
	NORMAL(1, "Normal", "Normal"),

	/**
	 * The '<em><b>Emergency Release</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMERGENCY_RELEASE_VALUE
	 * @generated
	 * @ordered
	 */
	EMERGENCY_RELEASE(2, "EmergencyRelease", "EmergencyRelease");

	/**
	 * The '<em><b>Locked</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCKED
	 * @model name="Locked"
	 * @generated
	 * @ordered
	 */
	public static final int LOCKED_VALUE = 0;

	/**
	 * The '<em><b>Normal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMAL
	 * @model name="Normal"
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_VALUE = 1;

	/**
	 * The '<em><b>Emergency Release</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMERGENCY_RELEASE
	 * @model name="EmergencyRelease"
	 * @generated
	 * @ordered
	 */
	public static final int EMERGENCY_RELEASE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Door Operation State Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DoorOperationStateEnumeration[] VALUES_ARRAY =
		new DoorOperationStateEnumeration[] {
			LOCKED,
			NORMAL,
			EMERGENCY_RELEASE,
		};

	/**
	 * A public read-only list of all the '<em><b>Door Operation State Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DoorOperationStateEnumeration> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Door Operation State Enumeration</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DoorOperationStateEnumeration get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DoorOperationStateEnumeration result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Door Operation State Enumeration</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DoorOperationStateEnumeration getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DoorOperationStateEnumeration result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Door Operation State Enumeration</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DoorOperationStateEnumeration get(int value) {
		switch (value) {
			case LOCKED_VALUE: return LOCKED;
			case NORMAL_VALUE: return NORMAL;
			case EMERGENCY_RELEASE_VALUE: return EMERGENCY_RELEASE;
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
	private DoorOperationStateEnumeration(int value, String name, String literal) {
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
	
} //DoorOperationStateEnumeration
