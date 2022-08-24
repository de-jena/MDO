/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>SQL Query Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getSQLQueryMode()
 * @model extendedMetaData="name='SQLQueryMode_._type'"
 * @generated
 */
public enum SQLQueryMode implements Enumerator {
	/**
	 * The '<em><b>Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_VALUE
	 * @generated
	 * @ordered
	 */
	DATA(0, "Data", "Data"),

	/**
	 * The '<em><b>Calculated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CALCULATED_VALUE
	 * @generated
	 * @ordered
	 */
	CALCULATED(1, "Calculated", "Calculated"),

	/**
	 * The '<em><b>Include Empty</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCLUDE_EMPTY_VALUE
	 * @generated
	 * @ordered
	 */
	INCLUDE_EMPTY(2, "IncludeEmpty", "IncludeEmpty"),

	/**
	 * The '<em><b>Data Keys</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_KEYS_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_KEYS(3, "DataKeys", "DataKeys");

	/**
	 * The '<em><b>Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA
	 * @model name="Data"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_VALUE = 0;

	/**
	 * The '<em><b>Calculated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CALCULATED
	 * @model name="Calculated"
	 * @generated
	 * @ordered
	 */
	public static final int CALCULATED_VALUE = 1;

	/**
	 * The '<em><b>Include Empty</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCLUDE_EMPTY
	 * @model name="IncludeEmpty"
	 * @generated
	 * @ordered
	 */
	public static final int INCLUDE_EMPTY_VALUE = 2;

	/**
	 * The '<em><b>Data Keys</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_KEYS
	 * @model name="DataKeys"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_KEYS_VALUE = 3;

	/**
	 * An array of all the '<em><b>SQL Query Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SQLQueryMode[] VALUES_ARRAY =
		new SQLQueryMode[] {
			DATA,
			CALCULATED,
			INCLUDE_EMPTY,
			DATA_KEYS,
		};

	/**
	 * A public read-only list of all the '<em><b>SQL Query Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SQLQueryMode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>SQL Query Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SQLQueryMode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SQLQueryMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SQL Query Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SQLQueryMode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SQLQueryMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SQL Query Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SQLQueryMode get(int value) {
		switch (value) {
			case DATA_VALUE: return DATA;
			case CALCULATED_VALUE: return CALCULATED;
			case INCLUDE_EMPTY_VALUE: return INCLUDE_EMPTY;
			case DATA_KEYS_VALUE: return DATA_KEYS;
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
	private SQLQueryMode(int value, String name, String literal) {
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
	
} //SQLQueryMode
