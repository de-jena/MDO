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
 * A representation of the literals of the enumeration '<em><b>Door Counting Object Class Enumeration</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.jena.mdo.ibis.ibis_enumerations.IbisEnumerationsPackage#getDoorCountingObjectClassEnumeration()
 * @model extendedMetaData="name='DoorCountingObjectClassEnumeration'"
 * @generated
 */
@ProviderType
public enum DoorCountingObjectClassEnumeration implements Enumerator {
	/**
	 * The '<em><b>Adult</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADULT_VALUE
	 * @generated
	 * @ordered
	 */
	ADULT(0, "Adult", "Adult"),

	/**
	 * The '<em><b>Child</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHILD_VALUE
	 * @generated
	 * @ordered
	 */
	CHILD(1, "Child", "Child"),

	/**
	 * The '<em><b>Bike</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIKE_VALUE
	 * @generated
	 * @ordered
	 */
	BIKE(2, "Bike", "Bike"),

	/**
	 * The '<em><b>Wheel Chair</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHEEL_CHAIR_VALUE
	 * @generated
	 * @ordered
	 */
	WHEEL_CHAIR(3, "WheelChair", "WheelChair"),

	/**
	 * The '<em><b>Pram</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRAM_VALUE
	 * @generated
	 * @ordered
	 */
	PRAM(4, "Pram", "Pram"),

	/**
	 * The '<em><b>Unidentified</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIDENTIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	UNIDENTIFIED(5, "Unidentified", "Unidentified"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(6, "Other", "Other");

	/**
	 * The '<em><b>Adult</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADULT
	 * @model name="Adult"
	 * @generated
	 * @ordered
	 */
	public static final int ADULT_VALUE = 0;

	/**
	 * The '<em><b>Child</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHILD
	 * @model name="Child"
	 * @generated
	 * @ordered
	 */
	public static final int CHILD_VALUE = 1;

	/**
	 * The '<em><b>Bike</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIKE
	 * @model name="Bike"
	 * @generated
	 * @ordered
	 */
	public static final int BIKE_VALUE = 2;

	/**
	 * The '<em><b>Wheel Chair</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHEEL_CHAIR
	 * @model name="WheelChair"
	 * @generated
	 * @ordered
	 */
	public static final int WHEEL_CHAIR_VALUE = 3;

	/**
	 * The '<em><b>Pram</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRAM
	 * @model name="Pram"
	 * @generated
	 * @ordered
	 */
	public static final int PRAM_VALUE = 4;

	/**
	 * The '<em><b>Unidentified</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIDENTIFIED
	 * @model name="Unidentified"
	 * @generated
	 * @ordered
	 */
	public static final int UNIDENTIFIED_VALUE = 5;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="Other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 6;

	/**
	 * An array of all the '<em><b>Door Counting Object Class Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DoorCountingObjectClassEnumeration[] VALUES_ARRAY =
		new DoorCountingObjectClassEnumeration[] {
			ADULT,
			CHILD,
			BIKE,
			WHEEL_CHAIR,
			PRAM,
			UNIDENTIFIED,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Door Counting Object Class Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DoorCountingObjectClassEnumeration> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Door Counting Object Class Enumeration</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DoorCountingObjectClassEnumeration get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DoorCountingObjectClassEnumeration result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Door Counting Object Class Enumeration</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DoorCountingObjectClassEnumeration getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DoorCountingObjectClassEnumeration result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Door Counting Object Class Enumeration</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DoorCountingObjectClassEnumeration get(int value) {
		switch (value) {
			case ADULT_VALUE: return ADULT;
			case CHILD_VALUE: return CHILD;
			case BIKE_VALUE: return BIKE;
			case WHEEL_CHAIR_VALUE: return WHEEL_CHAIR;
			case PRAM_VALUE: return PRAM;
			case UNIDENTIFIED_VALUE: return UNIDENTIFIED;
			case OTHER_VALUE: return OTHER;
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
	private DoorCountingObjectClassEnumeration(int value, String name, String literal) {
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
	
} //DoorCountingObjectClassEnumeration
