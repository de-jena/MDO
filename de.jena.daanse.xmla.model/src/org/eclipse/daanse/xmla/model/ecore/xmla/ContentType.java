/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Content Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getContentType()
 * @model extendedMetaData="name='Content_._type'"
 * @generated
 */
public enum ContentType implements Enumerator {
	/**
	 * The '<em><b>Discrete</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCRETE_VALUE
	 * @generated
	 * @ordered
	 */
	DISCRETE(0, "Discrete", "Discrete"),

	/**
	 * The '<em><b>Continuous</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTINUOUS_VALUE
	 * @generated
	 * @ordered
	 */
	CONTINUOUS(1, "Continuous", "Continuous"),

	/**
	 * The '<em><b>Discretized</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCRETIZED_VALUE
	 * @generated
	 * @ordered
	 */
	DISCRETIZED(2, "Discretized", "Discretized"),

	/**
	 * The '<em><b>Ordered</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORDERED_VALUE
	 * @generated
	 * @ordered
	 */
	ORDERED(3, "Ordered", "Ordered"),

	/**
	 * The '<em><b>Cyclical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CYCLICAL_VALUE
	 * @generated
	 * @ordered
	 */
	CYCLICAL(4, "Cyclical", "Cyclical"),

	/**
	 * The '<em><b>Probability</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROBABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	PROBABILITY(5, "Probability", "Probability"),

	/**
	 * The '<em><b>Variance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARIANCE_VALUE
	 * @generated
	 * @ordered
	 */
	VARIANCE(6, "Variance", "Variance"),

	/**
	 * The '<em><b>Std Dev</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STD_DEV_VALUE
	 * @generated
	 * @ordered
	 */
	STD_DEV(7, "StdDev", "StdDev"),

	/**
	 * The '<em><b>Probability Variance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROBABILITY_VARIANCE_VALUE
	 * @generated
	 * @ordered
	 */
	PROBABILITY_VARIANCE(8, "ProbabilityVariance", "ProbabilityVariance"),

	/**
	 * The '<em><b>Probability Std Dev</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROBABILITY_STD_DEV_VALUE
	 * @generated
	 * @ordered
	 */
	PROBABILITY_STD_DEV(9, "ProbabilityStdDev", "ProbabilityStdDev"),

	/**
	 * The '<em><b>Support</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPPORT_VALUE
	 * @generated
	 * @ordered
	 */
	SUPPORT(10, "Support", "Support"),

	/**
	 * The '<em><b>Key</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEY_VALUE
	 * @generated
	 * @ordered
	 */
	KEY(11, "Key", "Key");

	/**
	 * The '<em><b>Discrete</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCRETE
	 * @model name="Discrete"
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE_VALUE = 0;

	/**
	 * The '<em><b>Continuous</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTINUOUS
	 * @model name="Continuous"
	 * @generated
	 * @ordered
	 */
	public static final int CONTINUOUS_VALUE = 1;

	/**
	 * The '<em><b>Discretized</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCRETIZED
	 * @model name="Discretized"
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETIZED_VALUE = 2;

	/**
	 * The '<em><b>Ordered</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORDERED
	 * @model name="Ordered"
	 * @generated
	 * @ordered
	 */
	public static final int ORDERED_VALUE = 3;

	/**
	 * The '<em><b>Cyclical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CYCLICAL
	 * @model name="Cyclical"
	 * @generated
	 * @ordered
	 */
	public static final int CYCLICAL_VALUE = 4;

	/**
	 * The '<em><b>Probability</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROBABILITY
	 * @model name="Probability"
	 * @generated
	 * @ordered
	 */
	public static final int PROBABILITY_VALUE = 5;

	/**
	 * The '<em><b>Variance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARIANCE
	 * @model name="Variance"
	 * @generated
	 * @ordered
	 */
	public static final int VARIANCE_VALUE = 6;

	/**
	 * The '<em><b>Std Dev</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STD_DEV
	 * @model name="StdDev"
	 * @generated
	 * @ordered
	 */
	public static final int STD_DEV_VALUE = 7;

	/**
	 * The '<em><b>Probability Variance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROBABILITY_VARIANCE
	 * @model name="ProbabilityVariance"
	 * @generated
	 * @ordered
	 */
	public static final int PROBABILITY_VARIANCE_VALUE = 8;

	/**
	 * The '<em><b>Probability Std Dev</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROBABILITY_STD_DEV
	 * @model name="ProbabilityStdDev"
	 * @generated
	 * @ordered
	 */
	public static final int PROBABILITY_STD_DEV_VALUE = 9;

	/**
	 * The '<em><b>Support</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPPORT
	 * @model name="Support"
	 * @generated
	 * @ordered
	 */
	public static final int SUPPORT_VALUE = 10;

	/**
	 * The '<em><b>Key</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEY
	 * @model name="Key"
	 * @generated
	 * @ordered
	 */
	public static final int KEY_VALUE = 11;

	/**
	 * An array of all the '<em><b>Content Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ContentType[] VALUES_ARRAY =
		new ContentType[] {
			DISCRETE,
			CONTINUOUS,
			DISCRETIZED,
			ORDERED,
			CYCLICAL,
			PROBABILITY,
			VARIANCE,
			STD_DEV,
			PROBABILITY_VARIANCE,
			PROBABILITY_STD_DEV,
			SUPPORT,
			KEY,
		};

	/**
	 * A public read-only list of all the '<em><b>Content Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ContentType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Content Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContentType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContentType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Content Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContentType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContentType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Content Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContentType get(int value) {
		switch (value) {
			case DISCRETE_VALUE: return DISCRETE;
			case CONTINUOUS_VALUE: return CONTINUOUS;
			case DISCRETIZED_VALUE: return DISCRETIZED;
			case ORDERED_VALUE: return ORDERED;
			case CYCLICAL_VALUE: return CYCLICAL;
			case PROBABILITY_VALUE: return PROBABILITY;
			case VARIANCE_VALUE: return VARIANCE;
			case STD_DEV_VALUE: return STD_DEV;
			case PROBABILITY_VARIANCE_VALUE: return PROBABILITY_VARIANCE;
			case PROBABILITY_STD_DEV_VALUE: return PROBABILITY_STD_DEV;
			case SUPPORT_VALUE: return SUPPORT;
			case KEY_VALUE: return KEY;
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
	private ContentType(int value, String name, String literal) {
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
	
} //ContentType
