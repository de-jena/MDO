/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine200_200;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Storage Engine Used Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.Engine200_200Package#getStorageEngineUsedType()
 * @model extendedMetaData="name='StorageEngineUsed_._type'"
 * @generated
 */
public enum StorageEngineUsedType implements Enumerator {
	/**
	 * The '<em><b>Traditional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRADITIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	TRADITIONAL(0, "Traditional", "Traditional"),

	/**
	 * The '<em><b>In Memory</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_MEMORY_VALUE
	 * @generated
	 * @ordered
	 */
	IN_MEMORY(1, "InMemory", "InMemory"),

	/**
	 * The '<em><b>Mixed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIXED_VALUE
	 * @generated
	 * @ordered
	 */
	MIXED(2, "Mixed", "Mixed"),

	/**
	 * The '<em><b>Tabular Metadata</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TABULAR_METADATA_VALUE
	 * @generated
	 * @ordered
	 */
	TABULAR_METADATA(3, "TabularMetadata", "TabularMetadata");

	/**
	 * The '<em><b>Traditional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRADITIONAL
	 * @model name="Traditional"
	 * @generated
	 * @ordered
	 */
	public static final int TRADITIONAL_VALUE = 0;

	/**
	 * The '<em><b>In Memory</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_MEMORY
	 * @model name="InMemory"
	 * @generated
	 * @ordered
	 */
	public static final int IN_MEMORY_VALUE = 1;

	/**
	 * The '<em><b>Mixed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIXED
	 * @model name="Mixed"
	 * @generated
	 * @ordered
	 */
	public static final int MIXED_VALUE = 2;

	/**
	 * The '<em><b>Tabular Metadata</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TABULAR_METADATA
	 * @model name="TabularMetadata"
	 * @generated
	 * @ordered
	 */
	public static final int TABULAR_METADATA_VALUE = 3;

	/**
	 * An array of all the '<em><b>Storage Engine Used Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StorageEngineUsedType[] VALUES_ARRAY =
		new StorageEngineUsedType[] {
			TRADITIONAL,
			IN_MEMORY,
			MIXED,
			TABULAR_METADATA,
		};

	/**
	 * A public read-only list of all the '<em><b>Storage Engine Used Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StorageEngineUsedType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Storage Engine Used Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StorageEngineUsedType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StorageEngineUsedType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Storage Engine Used Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StorageEngineUsedType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StorageEngineUsedType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Storage Engine Used Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StorageEngineUsedType get(int value) {
		switch (value) {
			case TRADITIONAL_VALUE: return TRADITIONAL;
			case IN_MEMORY_VALUE: return IN_MEMORY;
			case MIXED_VALUE: return MIXED;
			case TABULAR_METADATA_VALUE: return TABULAR_METADATA;
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
	private StorageEngineUsedType(int value, String name, String literal) {
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
	
} //StorageEngineUsedType
