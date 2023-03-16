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
 * A representation of the literals of the enumeration '<em><b>Door Open State Enumeration</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Information on the state of the doors in a vehicle
 * <!-- end-model-doc -->
 * @see de.jena.mdo.ibis.ibis_enumerations.IbisEnumerationsPackage#getDoorOpenStateEnumeration()
 * @model extendedMetaData="name='DoorOpenStateEnumeration'"
 * @generated
 */
@ProviderType
public enum DoorOpenStateEnumeration implements Enumerator {
	/**
	 * The '<em><b>Doors Open</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOORS_OPEN_VALUE
	 * @generated
	 * @ordered
	 */
	DOORS_OPEN(0, "DoorsOpen", "DoorsOpen"),

	/**
	 * The '<em><b>All Doors Closed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_DOORS_CLOSED_VALUE
	 * @generated
	 * @ordered
	 */
	ALL_DOORS_CLOSED(1, "AllDoorsClosed", "AllDoorsClosed"),

	/**
	 * The '<em><b>Single Door Open</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLE_DOOR_OPEN_VALUE
	 * @generated
	 * @ordered
	 */
	SINGLE_DOOR_OPEN(2, "SingleDoorOpen", "SingleDoorOpen"),

	/**
	 * The '<em><b>Single Door Closed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLE_DOOR_CLOSED_VALUE
	 * @generated
	 * @ordered
	 */
	SINGLE_DOOR_CLOSED(3, "SingleDoorClosed", "SingleDoorClosed");

	/**
	 * The '<em><b>Doors Open</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOORS_OPEN
	 * @model name="DoorsOpen"
	 * @generated
	 * @ordered
	 */
	public static final int DOORS_OPEN_VALUE = 0;

	/**
	 * The '<em><b>All Doors Closed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_DOORS_CLOSED
	 * @model name="AllDoorsClosed"
	 * @generated
	 * @ordered
	 */
	public static final int ALL_DOORS_CLOSED_VALUE = 1;

	/**
	 * The '<em><b>Single Door Open</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLE_DOOR_OPEN
	 * @model name="SingleDoorOpen"
	 * @generated
	 * @ordered
	 */
	public static final int SINGLE_DOOR_OPEN_VALUE = 2;

	/**
	 * The '<em><b>Single Door Closed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLE_DOOR_CLOSED
	 * @model name="SingleDoorClosed"
	 * @generated
	 * @ordered
	 */
	public static final int SINGLE_DOOR_CLOSED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Door Open State Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DoorOpenStateEnumeration[] VALUES_ARRAY =
		new DoorOpenStateEnumeration[] {
			DOORS_OPEN,
			ALL_DOORS_CLOSED,
			SINGLE_DOOR_OPEN,
			SINGLE_DOOR_CLOSED,
		};

	/**
	 * A public read-only list of all the '<em><b>Door Open State Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DoorOpenStateEnumeration> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Door Open State Enumeration</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DoorOpenStateEnumeration get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DoorOpenStateEnumeration result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Door Open State Enumeration</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DoorOpenStateEnumeration getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DoorOpenStateEnumeration result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Door Open State Enumeration</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DoorOpenStateEnumeration get(int value) {
		switch (value) {
			case DOORS_OPEN_VALUE: return DOORS_OPEN;
			case ALL_DOORS_CLOSED_VALUE: return ALL_DOORS_CLOSED;
			case SINGLE_DOOR_OPEN_VALUE: return SINGLE_DOOR_OPEN;
			case SINGLE_DOOR_CLOSED_VALUE: return SINGLE_DOOR_CLOSED;
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
	private DoorOpenStateEnumeration(int value, String name, String literal) {
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
	
} //DoorOpenStateEnumeration
