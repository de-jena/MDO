/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Key Not Found Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getKeyNotFoundType()
 * @model extendedMetaData="name='KeyNotFound_._type'"
 * @generated
 */
public enum KeyNotFoundType implements Enumerator {
	/**
	 * The '<em><b>Ignore Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IGNORE_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	IGNORE_ERROR(0, "IgnoreError", "IgnoreError"),

	/**
	 * The '<em><b>Report And Continue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPORT_AND_CONTINUE_VALUE
	 * @generated
	 * @ordered
	 */
	REPORT_AND_CONTINUE(1, "ReportAndContinue", "ReportAndContinue"),

	/**
	 * The '<em><b>Report And Stop</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPORT_AND_STOP_VALUE
	 * @generated
	 * @ordered
	 */
	REPORT_AND_STOP(2, "ReportAndStop", "ReportAndStop");

	/**
	 * The '<em><b>Ignore Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IGNORE_ERROR
	 * @model name="IgnoreError"
	 * @generated
	 * @ordered
	 */
	public static final int IGNORE_ERROR_VALUE = 0;

	/**
	 * The '<em><b>Report And Continue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPORT_AND_CONTINUE
	 * @model name="ReportAndContinue"
	 * @generated
	 * @ordered
	 */
	public static final int REPORT_AND_CONTINUE_VALUE = 1;

	/**
	 * The '<em><b>Report And Stop</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPORT_AND_STOP
	 * @model name="ReportAndStop"
	 * @generated
	 * @ordered
	 */
	public static final int REPORT_AND_STOP_VALUE = 2;

	/**
	 * An array of all the '<em><b>Key Not Found Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final KeyNotFoundType[] VALUES_ARRAY =
		new KeyNotFoundType[] {
			IGNORE_ERROR,
			REPORT_AND_CONTINUE,
			REPORT_AND_STOP,
		};

	/**
	 * A public read-only list of all the '<em><b>Key Not Found Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<KeyNotFoundType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Key Not Found Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static KeyNotFoundType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			KeyNotFoundType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Key Not Found Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static KeyNotFoundType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			KeyNotFoundType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Key Not Found Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static KeyNotFoundType get(int value) {
		switch (value) {
			case IGNORE_ERROR_VALUE: return IGNORE_ERROR;
			case REPORT_AND_CONTINUE_VALUE: return REPORT_AND_CONTINUE;
			case REPORT_AND_STOP_VALUE: return REPORT_AND_STOP;
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
	private KeyNotFoundType(int value, String name, String literal) {
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
	
} //KeyNotFoundType