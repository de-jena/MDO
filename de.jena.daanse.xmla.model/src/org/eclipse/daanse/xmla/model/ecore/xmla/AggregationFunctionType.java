/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Aggregation Function Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAggregationFunctionType()
 * @model extendedMetaData="name='AggregationFunction_._type'"
 * @generated
 */
public enum AggregationFunctionType implements Enumerator {
	/**
	 * The '<em><b>Sum</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUM_VALUE
	 * @generated
	 * @ordered
	 */
	SUM(0, "Sum", "Sum"),

	/**
	 * The '<em><b>Count</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUNT_VALUE
	 * @generated
	 * @ordered
	 */
	COUNT(1, "Count", "Count"),

	/**
	 * The '<em><b>Min</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIN_VALUE
	 * @generated
	 * @ordered
	 */
	MIN(2, "Min", "Min"),

	/**
	 * The '<em><b>Max</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAX_VALUE
	 * @generated
	 * @ordered
	 */
	MAX(3, "Max", "Max"),

	/**
	 * The '<em><b>Distinct Count</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTINCT_COUNT_VALUE
	 * @generated
	 * @ordered
	 */
	DISTINCT_COUNT(4, "DistinctCount", "DistinctCount"),

	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(5, "None", "None"),

	/**
	 * The '<em><b>Average Of Children</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVERAGE_OF_CHILDREN_VALUE
	 * @generated
	 * @ordered
	 */
	AVERAGE_OF_CHILDREN(6, "AverageOfChildren", "AverageOfChildren"),

	/**
	 * The '<em><b>First Child</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRST_CHILD_VALUE
	 * @generated
	 * @ordered
	 */
	FIRST_CHILD(7, "FirstChild", "FirstChild"),

	/**
	 * The '<em><b>Last Child</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAST_CHILD_VALUE
	 * @generated
	 * @ordered
	 */
	LAST_CHILD(8, "LastChild", "LastChild"),

	/**
	 * The '<em><b>First Non Empty</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRST_NON_EMPTY_VALUE
	 * @generated
	 * @ordered
	 */
	FIRST_NON_EMPTY(9, "FirstNonEmpty", "FirstNonEmpty"),

	/**
	 * The '<em><b>Last Non Empty</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAST_NON_EMPTY_VALUE
	 * @generated
	 * @ordered
	 */
	LAST_NON_EMPTY(10, "LastNonEmpty", "LastNonEmpty");

	/**
	 * The '<em><b>Sum</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUM
	 * @model name="Sum"
	 * @generated
	 * @ordered
	 */
	public static final int SUM_VALUE = 0;

	/**
	 * The '<em><b>Count</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUNT
	 * @model name="Count"
	 * @generated
	 * @ordered
	 */
	public static final int COUNT_VALUE = 1;

	/**
	 * The '<em><b>Min</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIN
	 * @model name="Min"
	 * @generated
	 * @ordered
	 */
	public static final int MIN_VALUE = 2;

	/**
	 * The '<em><b>Max</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAX
	 * @model name="Max"
	 * @generated
	 * @ordered
	 */
	public static final int MAX_VALUE = 3;

	/**
	 * The '<em><b>Distinct Count</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTINCT_COUNT
	 * @model name="DistinctCount"
	 * @generated
	 * @ordered
	 */
	public static final int DISTINCT_COUNT_VALUE = 4;

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="None"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 5;

	/**
	 * The '<em><b>Average Of Children</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVERAGE_OF_CHILDREN
	 * @model name="AverageOfChildren"
	 * @generated
	 * @ordered
	 */
	public static final int AVERAGE_OF_CHILDREN_VALUE = 6;

	/**
	 * The '<em><b>First Child</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRST_CHILD
	 * @model name="FirstChild"
	 * @generated
	 * @ordered
	 */
	public static final int FIRST_CHILD_VALUE = 7;

	/**
	 * The '<em><b>Last Child</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAST_CHILD
	 * @model name="LastChild"
	 * @generated
	 * @ordered
	 */
	public static final int LAST_CHILD_VALUE = 8;

	/**
	 * The '<em><b>First Non Empty</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRST_NON_EMPTY
	 * @model name="FirstNonEmpty"
	 * @generated
	 * @ordered
	 */
	public static final int FIRST_NON_EMPTY_VALUE = 9;

	/**
	 * The '<em><b>Last Non Empty</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAST_NON_EMPTY
	 * @model name="LastNonEmpty"
	 * @generated
	 * @ordered
	 */
	public static final int LAST_NON_EMPTY_VALUE = 10;

	/**
	 * An array of all the '<em><b>Aggregation Function Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AggregationFunctionType[] VALUES_ARRAY =
		new AggregationFunctionType[] {
			SUM,
			COUNT,
			MIN,
			MAX,
			DISTINCT_COUNT,
			NONE,
			AVERAGE_OF_CHILDREN,
			FIRST_CHILD,
			LAST_CHILD,
			FIRST_NON_EMPTY,
			LAST_NON_EMPTY,
		};

	/**
	 * A public read-only list of all the '<em><b>Aggregation Function Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AggregationFunctionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Aggregation Function Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AggregationFunctionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AggregationFunctionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Aggregation Function Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AggregationFunctionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AggregationFunctionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Aggregation Function Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AggregationFunctionType get(int value) {
		switch (value) {
			case SUM_VALUE: return SUM;
			case COUNT_VALUE: return COUNT;
			case MIN_VALUE: return MIN;
			case MAX_VALUE: return MAX;
			case DISTINCT_COUNT_VALUE: return DISTINCT_COUNT;
			case NONE_VALUE: return NONE;
			case AVERAGE_OF_CHILDREN_VALUE: return AVERAGE_OF_CHILDREN;
			case FIRST_CHILD_VALUE: return FIRST_CHILD;
			case LAST_CHILD_VALUE: return LAST_CHILD;
			case FIRST_NON_EMPTY_VALUE: return FIRST_NON_EMPTY;
			case LAST_NON_EMPTY_VALUE: return LAST_NON_EMPTY;
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
	private AggregationFunctionType(int value, String name, String literal) {
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
	
} //AggregationFunctionType
