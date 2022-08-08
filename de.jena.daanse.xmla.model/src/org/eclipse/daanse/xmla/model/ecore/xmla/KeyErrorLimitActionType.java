/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Key Error Limit Action Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getKeyErrorLimitActionType()
 * @model extendedMetaData="name='KeyErrorLimitAction_._type'"
 * @generated
 */
public enum KeyErrorLimitActionType implements Enumerator {
	/**
	 * The '<em><b>Stop Processing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOP_PROCESSING_VALUE
	 * @generated
	 * @ordered
	 */
	STOP_PROCESSING(0, "StopProcessing", "StopProcessing"),

	/**
	 * The '<em><b>Stop Logging</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOP_LOGGING_VALUE
	 * @generated
	 * @ordered
	 */
	STOP_LOGGING(1, "StopLogging", "StopLogging");

	/**
	 * The '<em><b>Stop Processing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOP_PROCESSING
	 * @model name="StopProcessing"
	 * @generated
	 * @ordered
	 */
	public static final int STOP_PROCESSING_VALUE = 0;

	/**
	 * The '<em><b>Stop Logging</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOP_LOGGING
	 * @model name="StopLogging"
	 * @generated
	 * @ordered
	 */
	public static final int STOP_LOGGING_VALUE = 1;

	/**
	 * An array of all the '<em><b>Key Error Limit Action Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final KeyErrorLimitActionType[] VALUES_ARRAY =
		new KeyErrorLimitActionType[] {
			STOP_PROCESSING,
			STOP_LOGGING,
		};

	/**
	 * A public read-only list of all the '<em><b>Key Error Limit Action Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<KeyErrorLimitActionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Key Error Limit Action Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static KeyErrorLimitActionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			KeyErrorLimitActionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Key Error Limit Action Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static KeyErrorLimitActionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			KeyErrorLimitActionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Key Error Limit Action Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static KeyErrorLimitActionType get(int value) {
		switch (value) {
			case STOP_PROCESSING_VALUE: return STOP_PROCESSING;
			case STOP_LOGGING_VALUE: return STOP_LOGGING;
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
	private KeyErrorLimitActionType(int value, String name, String literal) {
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
	
} //KeyErrorLimitActionType
