/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Processing Mode Type1</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getProcessingModeType1()
 * @model extendedMetaData="name='ProcessingMode_._1_._type'"
 * @generated
 */
public enum ProcessingModeType1 implements Enumerator {
	/**
	 * The '<em><b>Regular</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGULAR_VALUE
	 * @generated
	 * @ordered
	 */
	REGULAR(0, "Regular", "Regular"),

	/**
	 * The '<em><b>Lazy Aggregations</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAZY_AGGREGATIONS_VALUE
	 * @generated
	 * @ordered
	 */
	LAZY_AGGREGATIONS(1, "LazyAggregations", "LazyAggregations");

	/**
	 * The '<em><b>Regular</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGULAR
	 * @model name="Regular"
	 * @generated
	 * @ordered
	 */
	public static final int REGULAR_VALUE = 0;

	/**
	 * The '<em><b>Lazy Aggregations</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAZY_AGGREGATIONS
	 * @model name="LazyAggregations"
	 * @generated
	 * @ordered
	 */
	public static final int LAZY_AGGREGATIONS_VALUE = 1;

	/**
	 * An array of all the '<em><b>Processing Mode Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProcessingModeType1[] VALUES_ARRAY =
		new ProcessingModeType1[] {
			REGULAR,
			LAZY_AGGREGATIONS,
		};

	/**
	 * A public read-only list of all the '<em><b>Processing Mode Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProcessingModeType1> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Processing Mode Type1</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProcessingModeType1 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProcessingModeType1 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Processing Mode Type1</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProcessingModeType1 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProcessingModeType1 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Processing Mode Type1</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProcessingModeType1 get(int value) {
		switch (value) {
			case REGULAR_VALUE: return REGULAR;
			case LAZY_AGGREGATIONS_VALUE: return LAZY_AGGREGATIONS;
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
	private ProcessingModeType1(int value, String name, String literal) {
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
	
} //ProcessingModeType1