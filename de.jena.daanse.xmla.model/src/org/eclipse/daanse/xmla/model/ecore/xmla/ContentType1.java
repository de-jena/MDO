/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Content Type1</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getContentType1()
 * @model extendedMetaData="name='Content_._1_._type'"
 * @generated
 */
public enum ContentType1 implements Enumerator {
	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "None", "None"),

	/**
	 * The '<em><b>Schema</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHEMA_VALUE
	 * @generated
	 * @ordered
	 */
	SCHEMA(1, "Schema", "Schema"),

	/**
	 * The '<em><b>Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_VALUE
	 * @generated
	 * @ordered
	 */
	DATA(2, "Data", "Data"),

	/**
	 * The '<em><b>Schema Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHEMA_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	SCHEMA_DATA(3, "SchemaData", "SchemaData"),

	/**
	 * The '<em><b>Metadata</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METADATA_VALUE
	 * @generated
	 * @ordered
	 */
	METADATA(4, "Metadata", "Metadata");

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="None"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>Schema</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHEMA
	 * @model name="Schema"
	 * @generated
	 * @ordered
	 */
	public static final int SCHEMA_VALUE = 1;

	/**
	 * The '<em><b>Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA
	 * @model name="Data"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_VALUE = 2;

	/**
	 * The '<em><b>Schema Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHEMA_DATA
	 * @model name="SchemaData"
	 * @generated
	 * @ordered
	 */
	public static final int SCHEMA_DATA_VALUE = 3;

	/**
	 * The '<em><b>Metadata</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METADATA
	 * @model name="Metadata"
	 * @generated
	 * @ordered
	 */
	public static final int METADATA_VALUE = 4;

	/**
	 * An array of all the '<em><b>Content Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ContentType1[] VALUES_ARRAY =
		new ContentType1[] {
			NONE,
			SCHEMA,
			DATA,
			SCHEMA_DATA,
			METADATA,
		};

	/**
	 * A public read-only list of all the '<em><b>Content Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ContentType1> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Content Type1</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContentType1 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContentType1 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Content Type1</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContentType1 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContentType1 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Content Type1</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContentType1 get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case SCHEMA_VALUE: return SCHEMA;
			case DATA_VALUE: return DATA;
			case SCHEMA_DATA_VALUE: return SCHEMA_DATA;
			case METADATA_VALUE: return METADATA;
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
	private ContentType1(int value, String name, String literal) {
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
	
} //ContentType1