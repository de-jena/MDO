/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Aggregation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDataAggregationType()
 * @model extendedMetaData="name='DataAggregation_._type'"
 * @generated
 */
public enum DataAggregationType implements Enumerator {
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
	 * The '<em><b>Data Aggregatable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_AGGREGATABLE_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_AGGREGATABLE(1, "DataAggregatable", "DataAggregatable"),

	/**
	 * The '<em><b>Cache Aggregatable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CACHE_AGGREGATABLE_VALUE
	 * @generated
	 * @ordered
	 */
	CACHE_AGGREGATABLE(2, "CacheAggregatable", "CacheAggregatable"),

	/**
	 * The '<em><b>Data And Cache Aggregatable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_AND_CACHE_AGGREGATABLE_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_AND_CACHE_AGGREGATABLE(3, "DataAndCacheAggregatable", "DataAndCacheAggregatable");

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
	 * The '<em><b>Data Aggregatable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_AGGREGATABLE
	 * @model name="DataAggregatable"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_AGGREGATABLE_VALUE = 1;

	/**
	 * The '<em><b>Cache Aggregatable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CACHE_AGGREGATABLE
	 * @model name="CacheAggregatable"
	 * @generated
	 * @ordered
	 */
	public static final int CACHE_AGGREGATABLE_VALUE = 2;

	/**
	 * The '<em><b>Data And Cache Aggregatable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_AND_CACHE_AGGREGATABLE
	 * @model name="DataAndCacheAggregatable"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_AND_CACHE_AGGREGATABLE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Data Aggregation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataAggregationType[] VALUES_ARRAY =
		new DataAggregationType[] {
			NONE,
			DATA_AGGREGATABLE,
			CACHE_AGGREGATABLE,
			DATA_AND_CACHE_AGGREGATABLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Data Aggregation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataAggregationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Aggregation Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataAggregationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataAggregationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Aggregation Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataAggregationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataAggregationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Aggregation Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataAggregationType get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case DATA_AGGREGATABLE_VALUE: return DATA_AGGREGATABLE;
			case CACHE_AGGREGATABLE_VALUE: return CACHE_AGGREGATABLE;
			case DATA_AND_CACHE_AGGREGATABLE_VALUE: return DATA_AND_CACHE_AGGREGATABLE;
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
	private DataAggregationType(int value, String name, String literal) {
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
	
} //DataAggregationType
