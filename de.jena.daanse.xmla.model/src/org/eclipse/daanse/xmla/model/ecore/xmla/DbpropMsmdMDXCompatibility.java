/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Dbprop Msmd MDX Compatibility</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDbpropMsmdMDXCompatibility()
 * @model extendedMetaData="name='DbpropMsmdMDXCompatibility_._type'"
 * @generated
 */
public enum DbpropMsmdMDXCompatibility implements Enumerator {
	/**
	 * The '<em><b>0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_0_VALUE
	 * @generated
	 * @ordered
	 */
	_0(0, "_0", "_0"),

	/**
	 * The '<em><b>1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_1_VALUE
	 * @generated
	 * @ordered
	 */
	_1(1, "_1", "1"),

	/**
	 * The '<em><b>2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_2_VALUE
	 * @generated
	 * @ordered
	 */
	_2(2, "_2", "2"),

	/**
	 * The '<em><b>3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_3_VALUE
	 * @generated
	 * @ordered
	 */
	_3(3, "_3", "3");

	/**
	 * The '<em><b>0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_0
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int _0_VALUE = 0;

	/**
	 * The '<em><b>1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_1
	 * @model literal="1"
	 * @generated
	 * @ordered
	 */
	public static final int _1_VALUE = 1;

	/**
	 * The '<em><b>2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_2
	 * @model literal="2"
	 * @generated
	 * @ordered
	 */
	public static final int _2_VALUE = 2;

	/**
	 * The '<em><b>3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_3
	 * @model literal="3"
	 * @generated
	 * @ordered
	 */
	public static final int _3_VALUE = 3;

	/**
	 * An array of all the '<em><b>Dbprop Msmd MDX Compatibility</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DbpropMsmdMDXCompatibility[] VALUES_ARRAY =
		new DbpropMsmdMDXCompatibility[] {
			_0,
			_1,
			_2,
			_3,
		};

	/**
	 * A public read-only list of all the '<em><b>Dbprop Msmd MDX Compatibility</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DbpropMsmdMDXCompatibility> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Dbprop Msmd MDX Compatibility</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DbpropMsmdMDXCompatibility get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DbpropMsmdMDXCompatibility result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dbprop Msmd MDX Compatibility</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DbpropMsmdMDXCompatibility getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DbpropMsmdMDXCompatibility result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dbprop Msmd MDX Compatibility</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DbpropMsmdMDXCompatibility get(int value) {
		switch (value) {
			case _0_VALUE: return _0;
			case _1_VALUE: return _1;
			case _2_VALUE: return _2;
			case _3_VALUE: return _3;
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
	private DbpropMsmdMDXCompatibility(int value, String name, String literal) {
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
	
} //DbpropMsmdMDXCompatibility
