/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine300;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Embedding Style Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getDataEmbeddingStyleType()
 * @model extendedMetaData="name='DataEmbeddingStyle_._type'"
 * @generated
 */
public enum DataEmbeddingStyleType implements Enumerator {
	/**
	 * The '<em><b>Embedded</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMBEDDED_VALUE
	 * @generated
	 * @ordered
	 */
	EMBEDDED(0, "Embedded", "Embedded"),

	/**
	 * The '<em><b>Not Embedded</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_EMBEDDED_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_EMBEDDED(1, "NotEmbedded", "NotEmbedded");

	/**
	 * The '<em><b>Embedded</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMBEDDED
	 * @model name="Embedded"
	 * @generated
	 * @ordered
	 */
	public static final int EMBEDDED_VALUE = 0;

	/**
	 * The '<em><b>Not Embedded</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_EMBEDDED
	 * @model name="NotEmbedded"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_EMBEDDED_VALUE = 1;

	/**
	 * An array of all the '<em><b>Data Embedding Style Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataEmbeddingStyleType[] VALUES_ARRAY =
		new DataEmbeddingStyleType[] {
			EMBEDDED,
			NOT_EMBEDDED,
		};

	/**
	 * A public read-only list of all the '<em><b>Data Embedding Style Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataEmbeddingStyleType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Embedding Style Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataEmbeddingStyleType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataEmbeddingStyleType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Embedding Style Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataEmbeddingStyleType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataEmbeddingStyleType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Embedding Style Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataEmbeddingStyleType get(int value) {
		switch (value) {
			case EMBEDDED_VALUE: return EMBEDDED;
			case NOT_EMBEDDED_VALUE: return NOT_EMBEDDED;
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
	private DataEmbeddingStyleType(int value, String name, String literal) {
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
	
} //DataEmbeddingStyleType
