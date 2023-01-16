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
 * A representation of the literals of the enumeration '<em><b>Location State Enumeration</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Information on the location in a very general way
 * <!-- end-model-doc -->
 * @see de.jena.mdo.ibis.enumerations.IbisEnumerationsPackage#getLocationStateEnumeration()
 * @model extendedMetaData="name='LocationStateEnumeration'"
 * @generated
 */
@ProviderType
public enum LocationStateEnumeration implements Enumerator {
	/**
	 * The '<em><b>After Stop</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFTER_STOP_VALUE
	 * @generated
	 * @ordered
	 */
	AFTER_STOP(0, "AfterStop", "AfterStop"),

	/**
	 * The '<em><b>At Stop</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AT_STOP_VALUE
	 * @generated
	 * @ordered
	 */
	AT_STOP(1, "AtStop", "AtStop"),

	/**
	 * The '<em><b>Before Stop</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEFORE_STOP_VALUE
	 * @generated
	 * @ordered
	 */
	BEFORE_STOP(2, "BeforeStop", "BeforeStop"),

	/**
	 * The '<em><b>Between Stop</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BETWEEN_STOP_VALUE
	 * @generated
	 * @ordered
	 */
	BETWEEN_STOP(3, "BetweenStop", "BetweenStop");

	/**
	 * The '<em><b>After Stop</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFTER_STOP
	 * @model name="AfterStop"
	 * @generated
	 * @ordered
	 */
	public static final int AFTER_STOP_VALUE = 0;

	/**
	 * The '<em><b>At Stop</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AT_STOP
	 * @model name="AtStop"
	 * @generated
	 * @ordered
	 */
	public static final int AT_STOP_VALUE = 1;

	/**
	 * The '<em><b>Before Stop</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEFORE_STOP
	 * @model name="BeforeStop"
	 * @generated
	 * @ordered
	 */
	public static final int BEFORE_STOP_VALUE = 2;

	/**
	 * The '<em><b>Between Stop</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BETWEEN_STOP
	 * @model name="BetweenStop"
	 * @generated
	 * @ordered
	 */
	public static final int BETWEEN_STOP_VALUE = 3;

	/**
	 * An array of all the '<em><b>Location State Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LocationStateEnumeration[] VALUES_ARRAY =
		new LocationStateEnumeration[] {
			AFTER_STOP,
			AT_STOP,
			BEFORE_STOP,
			BETWEEN_STOP,
		};

	/**
	 * A public read-only list of all the '<em><b>Location State Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LocationStateEnumeration> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Location State Enumeration</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LocationStateEnumeration get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LocationStateEnumeration result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Location State Enumeration</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LocationStateEnumeration getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LocationStateEnumeration result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Location State Enumeration</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LocationStateEnumeration get(int value) {
		switch (value) {
			case AFTER_STOP_VALUE: return AFTER_STOP;
			case AT_STOP_VALUE: return AT_STOP;
			case BEFORE_STOP_VALUE: return BEFORE_STOP;
			case BETWEEN_STOP_VALUE: return BETWEEN_STOP;
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
	private LocationStateEnumeration(int value, String name, String literal) {
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
	
} //LocationStateEnumeration
