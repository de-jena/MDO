/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Format Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getFormatType()
 * @model extendedMetaData="name='Format_._type'"
 * @generated
 */
public enum FormatType implements Enumerator {
	/**
	 * The '<em><b>Trim Right</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIM_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	TRIM_RIGHT(0, "TrimRight", "TrimRight"),

	/**
	 * The '<em><b>Trim Left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIM_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	TRIM_LEFT(1, "TrimLeft", "TrimLeft"),

	/**
	 * The '<em><b>Trim All</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIM_ALL_VALUE
	 * @generated
	 * @ordered
	 */
	TRIM_ALL(2, "TrimAll", "TrimAll"),

	/**
	 * The '<em><b>Trim None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIM_NONE_VALUE
	 * @generated
	 * @ordered
	 */
	TRIM_NONE(3, "TrimNone", "TrimNone");

	/**
	 * The '<em><b>Trim Right</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIM_RIGHT
	 * @model name="TrimRight"
	 * @generated
	 * @ordered
	 */
	public static final int TRIM_RIGHT_VALUE = 0;

	/**
	 * The '<em><b>Trim Left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIM_LEFT
	 * @model name="TrimLeft"
	 * @generated
	 * @ordered
	 */
	public static final int TRIM_LEFT_VALUE = 1;

	/**
	 * The '<em><b>Trim All</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIM_ALL
	 * @model name="TrimAll"
	 * @generated
	 * @ordered
	 */
	public static final int TRIM_ALL_VALUE = 2;

	/**
	 * The '<em><b>Trim None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIM_NONE
	 * @model name="TrimNone"
	 * @generated
	 * @ordered
	 */
	public static final int TRIM_NONE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Format Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FormatType[] VALUES_ARRAY =
		new FormatType[] {
			TRIM_RIGHT,
			TRIM_LEFT,
			TRIM_ALL,
			TRIM_NONE,
		};

	/**
	 * A public read-only list of all the '<em><b>Format Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FormatType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Format Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FormatType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FormatType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Format Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FormatType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FormatType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Format Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FormatType get(int value) {
		switch (value) {
			case TRIM_RIGHT_VALUE: return TRIM_RIGHT;
			case TRIM_LEFT_VALUE: return TRIM_LEFT;
			case TRIM_ALL_VALUE: return TRIM_ALL;
			case TRIM_NONE_VALUE: return TRIM_NONE;
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
	private FormatType(int value, String name, String literal) {
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
	
} //FormatType
