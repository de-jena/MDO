/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Dbprop Msmd Compare Case Sensitive String Flags</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDbpropMsmdCompareCaseSensitiveStringFlags()
 * @model extendedMetaData="name='DbpropMsmdCompareCaseSensitiveStringFlags_._type'"
 * @generated
 */
public enum DbpropMsmdCompareCaseSensitiveStringFlags implements Enumerator {
	/**
	 * The '<em><b>1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_1_VALUE
	 * @generated
	 * @ordered
	 */
	_1(0, "_1", "1"),

	/**
	 * The '<em><b>2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_2_VALUE
	 * @generated
	 * @ordered
	 */
	_2(1, "_2", "2"),

	/**
	 * The '<em><b>16</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_16_VALUE
	 * @generated
	 * @ordered
	 */
	_16(2, "_16", "16"),

	/**
	 * The '<em><b>256</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_256_VALUE
	 * @generated
	 * @ordered
	 */
	_256(3, "_256", "256"),

	/**
	 * The '<em><b>4096</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_4096_VALUE
	 * @generated
	 * @ordered
	 */
	_4096(4, "_4096", "4096"),

	/**
	 * The '<em><b>65536</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_65536_VALUE
	 * @generated
	 * @ordered
	 */
	_65536(5, "_65536", "65536"),

	/**
	 * The '<em><b>1048576</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_1048576_VALUE
	 * @generated
	 * @ordered
	 */
	_1048576(6, "_1048576", "1048576");

	/**
	 * The '<em><b>1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_1
	 * @model literal="1"
	 * @generated
	 * @ordered
	 */
	public static final int _1_VALUE = 0;

	/**
	 * The '<em><b>2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_2
	 * @model literal="2"
	 * @generated
	 * @ordered
	 */
	public static final int _2_VALUE = 1;

	/**
	 * The '<em><b>16</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_16
	 * @model literal="16"
	 * @generated
	 * @ordered
	 */
	public static final int _16_VALUE = 2;

	/**
	 * The '<em><b>256</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_256
	 * @model literal="256"
	 * @generated
	 * @ordered
	 */
	public static final int _256_VALUE = 3;

	/**
	 * The '<em><b>4096</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_4096
	 * @model literal="4096"
	 * @generated
	 * @ordered
	 */
	public static final int _4096_VALUE = 4;

	/**
	 * The '<em><b>65536</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_65536
	 * @model literal="65536"
	 * @generated
	 * @ordered
	 */
	public static final int _65536_VALUE = 5;

	/**
	 * The '<em><b>1048576</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_1048576
	 * @model literal="1048576"
	 * @generated
	 * @ordered
	 */
	public static final int _1048576_VALUE = 6;

	/**
	 * An array of all the '<em><b>Dbprop Msmd Compare Case Sensitive String Flags</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DbpropMsmdCompareCaseSensitiveStringFlags[] VALUES_ARRAY =
		new DbpropMsmdCompareCaseSensitiveStringFlags[] {
			_1,
			_2,
			_16,
			_256,
			_4096,
			_65536,
			_1048576,
		};

	/**
	 * A public read-only list of all the '<em><b>Dbprop Msmd Compare Case Sensitive String Flags</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DbpropMsmdCompareCaseSensitiveStringFlags> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Dbprop Msmd Compare Case Sensitive String Flags</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DbpropMsmdCompareCaseSensitiveStringFlags get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DbpropMsmdCompareCaseSensitiveStringFlags result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dbprop Msmd Compare Case Sensitive String Flags</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DbpropMsmdCompareCaseSensitiveStringFlags getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DbpropMsmdCompareCaseSensitiveStringFlags result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dbprop Msmd Compare Case Sensitive String Flags</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DbpropMsmdCompareCaseSensitiveStringFlags get(int value) {
		switch (value) {
			case _1_VALUE: return _1;
			case _2_VALUE: return _2;
			case _16_VALUE: return _16;
			case _256_VALUE: return _256;
			case _4096_VALUE: return _4096;
			case _65536_VALUE: return _65536;
			case _1048576_VALUE: return _1048576;
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
	private DbpropMsmdCompareCaseSensitiveStringFlags(int value, String name, String literal) {
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
	
} //DbpropMsmdCompareCaseSensitiveStringFlags
