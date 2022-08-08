/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine300_300;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Direct Query Mode Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.Engine300_300Package#getDirectQueryModeType()
 * @model extendedMetaData="name='DirectQueryMode_._type'"
 * @generated
 */
public enum DirectQueryModeType implements Enumerator {
	/**
	 * The '<em><b>In Memory</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_MEMORY_VALUE
	 * @generated
	 * @ordered
	 */
	IN_MEMORY(0, "InMemory", "InMemory"),

	/**
	 * The '<em><b>Direct Query With In Memory</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIRECT_QUERY_WITH_IN_MEMORY_VALUE
	 * @generated
	 * @ordered
	 */
	DIRECT_QUERY_WITH_IN_MEMORY(1, "DirectQueryWithInMemory", "DirectQueryWithInMemory"),

	/**
	 * The '<em><b>In Memory With Direct Query</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_MEMORY_WITH_DIRECT_QUERY_VALUE
	 * @generated
	 * @ordered
	 */
	IN_MEMORY_WITH_DIRECT_QUERY(2, "InMemoryWithDirectQuery", "InMemoryWithDirectQuery"),

	/**
	 * The '<em><b>Direct Query</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIRECT_QUERY_VALUE
	 * @generated
	 * @ordered
	 */
	DIRECT_QUERY(3, "DirectQuery", "DirectQuery");

	/**
	 * The '<em><b>In Memory</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_MEMORY
	 * @model name="InMemory"
	 * @generated
	 * @ordered
	 */
	public static final int IN_MEMORY_VALUE = 0;

	/**
	 * The '<em><b>Direct Query With In Memory</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIRECT_QUERY_WITH_IN_MEMORY
	 * @model name="DirectQueryWithInMemory"
	 * @generated
	 * @ordered
	 */
	public static final int DIRECT_QUERY_WITH_IN_MEMORY_VALUE = 1;

	/**
	 * The '<em><b>In Memory With Direct Query</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_MEMORY_WITH_DIRECT_QUERY
	 * @model name="InMemoryWithDirectQuery"
	 * @generated
	 * @ordered
	 */
	public static final int IN_MEMORY_WITH_DIRECT_QUERY_VALUE = 2;

	/**
	 * The '<em><b>Direct Query</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIRECT_QUERY
	 * @model name="DirectQuery"
	 * @generated
	 * @ordered
	 */
	public static final int DIRECT_QUERY_VALUE = 3;

	/**
	 * An array of all the '<em><b>Direct Query Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DirectQueryModeType[] VALUES_ARRAY =
		new DirectQueryModeType[] {
			IN_MEMORY,
			DIRECT_QUERY_WITH_IN_MEMORY,
			IN_MEMORY_WITH_DIRECT_QUERY,
			DIRECT_QUERY,
		};

	/**
	 * A public read-only list of all the '<em><b>Direct Query Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DirectQueryModeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Direct Query Mode Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DirectQueryModeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DirectQueryModeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Direct Query Mode Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DirectQueryModeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DirectQueryModeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Direct Query Mode Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DirectQueryModeType get(int value) {
		switch (value) {
			case IN_MEMORY_VALUE: return IN_MEMORY;
			case DIRECT_QUERY_WITH_IN_MEMORY_VALUE: return DIRECT_QUERY_WITH_IN_MEMORY;
			case IN_MEMORY_WITH_DIRECT_QUERY_VALUE: return IN_MEMORY_WITH_DIRECT_QUERY;
			case DIRECT_QUERY_VALUE: return DIRECT_QUERY;
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
	private DirectQueryModeType(int value, String name, String literal) {
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
	
} //DirectQueryModeType
