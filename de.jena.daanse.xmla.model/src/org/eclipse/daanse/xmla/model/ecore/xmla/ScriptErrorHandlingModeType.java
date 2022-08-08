/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Script Error Handling Mode Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getScriptErrorHandlingModeType()
 * @model extendedMetaData="name='ScriptErrorHandlingMode_._type'"
 * @generated
 */
public enum ScriptErrorHandlingModeType implements Enumerator {
	/**
	 * The '<em><b>Ignore None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IGNORE_NONE_VALUE
	 * @generated
	 * @ordered
	 */
	IGNORE_NONE(0, "IgnoreNone", "IgnoreNone"),

	/**
	 * The '<em><b>Ignore All</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IGNORE_ALL_VALUE
	 * @generated
	 * @ordered
	 */
	IGNORE_ALL(1, "IgnoreAll", "IgnoreAll");

	/**
	 * The '<em><b>Ignore None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IGNORE_NONE
	 * @model name="IgnoreNone"
	 * @generated
	 * @ordered
	 */
	public static final int IGNORE_NONE_VALUE = 0;

	/**
	 * The '<em><b>Ignore All</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IGNORE_ALL
	 * @model name="IgnoreAll"
	 * @generated
	 * @ordered
	 */
	public static final int IGNORE_ALL_VALUE = 1;

	/**
	 * An array of all the '<em><b>Script Error Handling Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ScriptErrorHandlingModeType[] VALUES_ARRAY =
		new ScriptErrorHandlingModeType[] {
			IGNORE_NONE,
			IGNORE_ALL,
		};

	/**
	 * A public read-only list of all the '<em><b>Script Error Handling Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ScriptErrorHandlingModeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Script Error Handling Mode Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ScriptErrorHandlingModeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ScriptErrorHandlingModeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Script Error Handling Mode Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ScriptErrorHandlingModeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ScriptErrorHandlingModeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Script Error Handling Mode Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ScriptErrorHandlingModeType get(int value) {
		switch (value) {
			case IGNORE_NONE_VALUE: return IGNORE_NONE;
			case IGNORE_ALL_VALUE: return IGNORE_ALL;
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
	private ScriptErrorHandlingModeType(int value, String name, String literal) {
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
	
} //ScriptErrorHandlingModeType
