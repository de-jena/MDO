/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Retention Modes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getRetentionModes()
 * @model extendedMetaData="name='retentionModes'"
 * @generated
 */
public enum RetentionModes implements Enumerator {
	/**
	 * The '<em><b>Allow Single Event Loss</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALLOW_SINGLE_EVENT_LOSS_VALUE
	 * @generated
	 * @ordered
	 */
	ALLOW_SINGLE_EVENT_LOSS(0, "allowSingleEventLoss", "allowSingleEventLoss"),

	/**
	 * The '<em><b>Allow Multiple Event Loss</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALLOW_MULTIPLE_EVENT_LOSS_VALUE
	 * @generated
	 * @ordered
	 */
	ALLOW_MULTIPLE_EVENT_LOSS(1, "allowMultipleEventLoss", "allowMultipleEventLoss"),

	/**
	 * The '<em><b>No Event Loss</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_EVENT_LOSS_VALUE
	 * @generated
	 * @ordered
	 */
	NO_EVENT_LOSS(2, "noEventLoss", "noEventLoss");

	/**
	 * The '<em><b>Allow Single Event Loss</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALLOW_SINGLE_EVENT_LOSS
	 * @model name="allowSingleEventLoss"
	 * @generated
	 * @ordered
	 */
	public static final int ALLOW_SINGLE_EVENT_LOSS_VALUE = 0;

	/**
	 * The '<em><b>Allow Multiple Event Loss</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALLOW_MULTIPLE_EVENT_LOSS
	 * @model name="allowMultipleEventLoss"
	 * @generated
	 * @ordered
	 */
	public static final int ALLOW_MULTIPLE_EVENT_LOSS_VALUE = 1;

	/**
	 * The '<em><b>No Event Loss</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_EVENT_LOSS
	 * @model name="noEventLoss"
	 * @generated
	 * @ordered
	 */
	public static final int NO_EVENT_LOSS_VALUE = 2;

	/**
	 * An array of all the '<em><b>Retention Modes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RetentionModes[] VALUES_ARRAY =
		new RetentionModes[] {
			ALLOW_SINGLE_EVENT_LOSS,
			ALLOW_MULTIPLE_EVENT_LOSS,
			NO_EVENT_LOSS,
		};

	/**
	 * A public read-only list of all the '<em><b>Retention Modes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RetentionModes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Retention Modes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RetentionModes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RetentionModes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Retention Modes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RetentionModes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RetentionModes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Retention Modes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RetentionModes get(int value) {
		switch (value) {
			case ALLOW_SINGLE_EVENT_LOSS_VALUE: return ALLOW_SINGLE_EVENT_LOSS;
			case ALLOW_MULTIPLE_EVENT_LOSS_VALUE: return ALLOW_MULTIPLE_EVENT_LOSS;
			case NO_EVENT_LOSS_VALUE: return NO_EVENT_LOSS;
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
	private RetentionModes(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	
} //RetentionModes
