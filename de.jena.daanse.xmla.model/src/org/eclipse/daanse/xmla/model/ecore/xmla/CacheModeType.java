/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cache Mode Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCacheModeType()
 * @model extendedMetaData="name='CacheMode_._type'"
 * @generated
 */
public enum CacheModeType implements Enumerator {
	/**
	 * The '<em><b>Keep Training Cases</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEEP_TRAINING_CASES_VALUE
	 * @generated
	 * @ordered
	 */
	KEEP_TRAINING_CASES(0, "KeepTrainingCases", "KeepTrainingCases"),

	/**
	 * The '<em><b>Clear After Processing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLEAR_AFTER_PROCESSING_VALUE
	 * @generated
	 * @ordered
	 */
	CLEAR_AFTER_PROCESSING(1, "ClearAfterProcessing", "ClearAfterProcessing");

	/**
	 * The '<em><b>Keep Training Cases</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEEP_TRAINING_CASES
	 * @model name="KeepTrainingCases"
	 * @generated
	 * @ordered
	 */
	public static final int KEEP_TRAINING_CASES_VALUE = 0;

	/**
	 * The '<em><b>Clear After Processing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLEAR_AFTER_PROCESSING
	 * @model name="ClearAfterProcessing"
	 * @generated
	 * @ordered
	 */
	public static final int CLEAR_AFTER_PROCESSING_VALUE = 1;

	/**
	 * An array of all the '<em><b>Cache Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CacheModeType[] VALUES_ARRAY =
		new CacheModeType[] {
			KEEP_TRAINING_CASES,
			CLEAR_AFTER_PROCESSING,
		};

	/**
	 * A public read-only list of all the '<em><b>Cache Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CacheModeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cache Mode Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CacheModeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CacheModeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cache Mode Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CacheModeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CacheModeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cache Mode Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CacheModeType get(int value) {
		switch (value) {
			case KEEP_TRAINING_CASES_VALUE: return KEEP_TRAINING_CASES;
			case CLEAR_AFTER_PROCESSING_VALUE: return CLEAR_AFTER_PROCESSING;
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
	private CacheModeType(int value, String name, String literal) {
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
	
} //CacheModeType
