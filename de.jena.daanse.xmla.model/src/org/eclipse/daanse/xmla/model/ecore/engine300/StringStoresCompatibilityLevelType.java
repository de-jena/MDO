/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine300;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>String Stores Compatibility Level Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getStringStoresCompatibilityLevelType()
 * @model extendedMetaData="name='StringStoresCompatibilityLevel_._type'"
 * @generated
 */
public enum StringStoresCompatibilityLevelType implements Enumerator {
	/**
	 * The '<em><b>1050</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_1050_VALUE
	 * @generated
	 * @ordered
	 */
	_1050(0, "_1050", "1050"),

	/**
	 * The '<em><b>1100</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_1100_VALUE
	 * @generated
	 * @ordered
	 */
	_1100(1, "_1100", "1100");

	/**
	 * The '<em><b>1050</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_1050
	 * @model literal="1050"
	 * @generated
	 * @ordered
	 */
	public static final int _1050_VALUE = 0;

	/**
	 * The '<em><b>1100</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_1100
	 * @model literal="1100"
	 * @generated
	 * @ordered
	 */
	public static final int _1100_VALUE = 1;

	/**
	 * An array of all the '<em><b>String Stores Compatibility Level Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StringStoresCompatibilityLevelType[] VALUES_ARRAY =
		new StringStoresCompatibilityLevelType[] {
			_1050,
			_1100,
		};

	/**
	 * A public read-only list of all the '<em><b>String Stores Compatibility Level Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StringStoresCompatibilityLevelType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>String Stores Compatibility Level Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StringStoresCompatibilityLevelType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StringStoresCompatibilityLevelType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>String Stores Compatibility Level Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StringStoresCompatibilityLevelType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StringStoresCompatibilityLevelType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>String Stores Compatibility Level Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StringStoresCompatibilityLevelType get(int value) {
		switch (value) {
			case _1050_VALUE: return _1050;
			case _1100_VALUE: return _1100;
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
	private StringStoresCompatibilityLevelType(int value, String name, String literal) {
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
	
} //StringStoresCompatibilityLevelType
