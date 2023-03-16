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
 * A representation of the literals of the enumeration '<em><b>Telecabin Submode Enumeration</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Values for Telecabin MODEs of TRANSPORT: TPEG pti_table_09, col_table_14.
 * <!-- end-model-doc -->
 * @see de.jena.mdo.ibis.ibis_enumerations.IbisEnumerationsPackage#getTelecabinSubmodeEnumeration()
 * @model extendedMetaData="name='TelecabinSubmodeEnumeration'"
 * @generated
 */
@ProviderType
public enum TelecabinSubmodeEnumeration implements Enumerator {
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
	 * The '<em><b>Telecabin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TELECABIN_VALUE
	 * @generated
	 * @ordered
	 */
	TELECABIN(2, "telecabin", "telecabin"),

	/**
	 * The '<em><b>Cable Car</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CABLE_CAR_VALUE
	 * @generated
	 * @ordered
	 */
	CABLE_CAR(3, "cableCar", "cableCar"),

	/**
	 * The '<em><b>Lift</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIFT_VALUE
	 * @generated
	 * @ordered
	 */
	LIFT(4, "lift", "lift"),

	/**
	 * The '<em><b>Chair Lift</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHAIR_LIFT_VALUE
	 * @generated
	 * @ordered
	 */
	CHAIR_LIFT(5, "chairLift", "chairLift"),

	/**
	 * The '<em><b>Drag Lift</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRAG_LIFT_VALUE
	 * @generated
	 * @ordered
	 */
	DRAG_LIFT(6, "dragLift", "dragLift"),

	/**
	 * The '<em><b>Telecabin Link</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TELECABIN_LINK_VALUE
	 * @generated
	 * @ordered
	 */
	TELECABIN_LINK(7, "telecabinLink", "telecabinLink");

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
	 * The '<em><b>Telecabin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TELECABIN
	 * @model name="telecabin"
	 * @generated
	 * @ordered
	 */
	public static final int TELECABIN_VALUE = 2;

	/**
	 * The '<em><b>Cable Car</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CABLE_CAR
	 * @model name="cableCar"
	 * @generated
	 * @ordered
	 */
	public static final int CABLE_CAR_VALUE = 3;

	/**
	 * The '<em><b>Lift</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIFT
	 * @model name="lift"
	 * @generated
	 * @ordered
	 */
	public static final int LIFT_VALUE = 4;

	/**
	 * The '<em><b>Chair Lift</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHAIR_LIFT
	 * @model name="chairLift"
	 * @generated
	 * @ordered
	 */
	public static final int CHAIR_LIFT_VALUE = 5;

	/**
	 * The '<em><b>Drag Lift</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRAG_LIFT
	 * @model name="dragLift"
	 * @generated
	 * @ordered
	 */
	public static final int DRAG_LIFT_VALUE = 6;

	/**
	 * The '<em><b>Telecabin Link</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TELECABIN_LINK
	 * @model name="telecabinLink"
	 * @generated
	 * @ordered
	 */
	public static final int TELECABIN_LINK_VALUE = 7;

	/**
	 * An array of all the '<em><b>Telecabin Submode Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TelecabinSubmodeEnumeration[] VALUES_ARRAY =
		new TelecabinSubmodeEnumeration[] {
			UNKNOWN,
			UNDEFINED,
			TELECABIN,
			CABLE_CAR,
			LIFT,
			CHAIR_LIFT,
			DRAG_LIFT,
			TELECABIN_LINK,
		};

	/**
	 * A public read-only list of all the '<em><b>Telecabin Submode Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TelecabinSubmodeEnumeration> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Telecabin Submode Enumeration</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TelecabinSubmodeEnumeration get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TelecabinSubmodeEnumeration result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Telecabin Submode Enumeration</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TelecabinSubmodeEnumeration getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TelecabinSubmodeEnumeration result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Telecabin Submode Enumeration</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TelecabinSubmodeEnumeration get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case UNDEFINED_VALUE: return UNDEFINED;
			case TELECABIN_VALUE: return TELECABIN;
			case CABLE_CAR_VALUE: return CABLE_CAR;
			case LIFT_VALUE: return LIFT;
			case CHAIR_LIFT_VALUE: return CHAIR_LIFT;
			case DRAG_LIFT_VALUE: return DRAG_LIFT;
			case TELECABIN_LINK_VALUE: return TELECABIN_LINK;
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
	private TelecabinSubmodeEnumeration(int value, String name, String literal) {
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
	
} //TelecabinSubmodeEnumeration
