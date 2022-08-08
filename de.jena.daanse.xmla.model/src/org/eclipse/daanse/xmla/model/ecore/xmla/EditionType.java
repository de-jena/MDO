/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Edition Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getEditionType()
 * @model extendedMetaData="name='Edition_._type'"
 * @generated
 */
public enum EditionType implements Enumerator {
	/**
	 * The '<em><b>Standard</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD_VALUE
	 * @generated
	 * @ordered
	 */
	STANDARD(0, "Standard", "Standard"),

	/**
	 * The '<em><b>Standard64</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD64_VALUE
	 * @generated
	 * @ordered
	 */
	STANDARD64(1, "Standard64", "Standard64"),

	/**
	 * The '<em><b>Enterprise</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTERPRISE_VALUE
	 * @generated
	 * @ordered
	 */
	ENTERPRISE(2, "Enterprise", "Enterprise"),

	/**
	 * The '<em><b>Enterprise64</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTERPRISE64_VALUE
	 * @generated
	 * @ordered
	 */
	ENTERPRISE64(3, "Enterprise64", "Enterprise64"),

	/**
	 * The '<em><b>Developer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVELOPER_VALUE
	 * @generated
	 * @ordered
	 */
	DEVELOPER(4, "Developer", "Developer"),

	/**
	 * The '<em><b>Developer64</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVELOPER64_VALUE
	 * @generated
	 * @ordered
	 */
	DEVELOPER64(5, "Developer64", "Developer64"),

	/**
	 * The '<em><b>Evaluation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVALUATION_VALUE
	 * @generated
	 * @ordered
	 */
	EVALUATION(6, "Evaluation", "Evaluation"),

	/**
	 * The '<em><b>Evaluation64</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVALUATION64_VALUE
	 * @generated
	 * @ordered
	 */
	EVALUATION64(7, "Evaluation64", "Evaluation64"),

	/**
	 * The '<em><b>Local</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_VALUE
	 * @generated
	 * @ordered
	 */
	LOCAL(8, "Local", "Local"),

	/**
	 * The '<em><b>Local64</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL64_VALUE
	 * @generated
	 * @ordered
	 */
	LOCAL64(9, "Local64", "Local64"),

	/**
	 * The '<em><b>Business Intelligence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUSINESS_INTELLIGENCE_VALUE
	 * @generated
	 * @ordered
	 */
	BUSINESS_INTELLIGENCE(10, "BusinessIntelligence", "BusinessIntelligence"),

	/**
	 * The '<em><b>Business Intelligence64</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUSINESS_INTELLIGENCE64_VALUE
	 * @generated
	 * @ordered
	 */
	BUSINESS_INTELLIGENCE64(11, "BusinessIntelligence64", "BusinessIntelligence64");

	/**
	 * The '<em><b>Standard</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD
	 * @model name="Standard"
	 * @generated
	 * @ordered
	 */
	public static final int STANDARD_VALUE = 0;

	/**
	 * The '<em><b>Standard64</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD64
	 * @model name="Standard64"
	 * @generated
	 * @ordered
	 */
	public static final int STANDARD64_VALUE = 1;

	/**
	 * The '<em><b>Enterprise</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTERPRISE
	 * @model name="Enterprise"
	 * @generated
	 * @ordered
	 */
	public static final int ENTERPRISE_VALUE = 2;

	/**
	 * The '<em><b>Enterprise64</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTERPRISE64
	 * @model name="Enterprise64"
	 * @generated
	 * @ordered
	 */
	public static final int ENTERPRISE64_VALUE = 3;

	/**
	 * The '<em><b>Developer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVELOPER
	 * @model name="Developer"
	 * @generated
	 * @ordered
	 */
	public static final int DEVELOPER_VALUE = 4;

	/**
	 * The '<em><b>Developer64</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVELOPER64
	 * @model name="Developer64"
	 * @generated
	 * @ordered
	 */
	public static final int DEVELOPER64_VALUE = 5;

	/**
	 * The '<em><b>Evaluation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVALUATION
	 * @model name="Evaluation"
	 * @generated
	 * @ordered
	 */
	public static final int EVALUATION_VALUE = 6;

	/**
	 * The '<em><b>Evaluation64</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVALUATION64
	 * @model name="Evaluation64"
	 * @generated
	 * @ordered
	 */
	public static final int EVALUATION64_VALUE = 7;

	/**
	 * The '<em><b>Local</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL
	 * @model name="Local"
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_VALUE = 8;

	/**
	 * The '<em><b>Local64</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL64
	 * @model name="Local64"
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL64_VALUE = 9;

	/**
	 * The '<em><b>Business Intelligence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUSINESS_INTELLIGENCE
	 * @model name="BusinessIntelligence"
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_INTELLIGENCE_VALUE = 10;

	/**
	 * The '<em><b>Business Intelligence64</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUSINESS_INTELLIGENCE64
	 * @model name="BusinessIntelligence64"
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_INTELLIGENCE64_VALUE = 11;

	/**
	 * An array of all the '<em><b>Edition Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EditionType[] VALUES_ARRAY =
		new EditionType[] {
			STANDARD,
			STANDARD64,
			ENTERPRISE,
			ENTERPRISE64,
			DEVELOPER,
			DEVELOPER64,
			EVALUATION,
			EVALUATION64,
			LOCAL,
			LOCAL64,
			BUSINESS_INTELLIGENCE,
			BUSINESS_INTELLIGENCE64,
		};

	/**
	 * A public read-only list of all the '<em><b>Edition Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EditionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Edition Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EditionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EditionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Edition Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EditionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EditionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Edition Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EditionType get(int value) {
		switch (value) {
			case STANDARD_VALUE: return STANDARD;
			case STANDARD64_VALUE: return STANDARD64;
			case ENTERPRISE_VALUE: return ENTERPRISE;
			case ENTERPRISE64_VALUE: return ENTERPRISE64;
			case DEVELOPER_VALUE: return DEVELOPER;
			case DEVELOPER64_VALUE: return DEVELOPER64;
			case EVALUATION_VALUE: return EVALUATION;
			case EVALUATION64_VALUE: return EVALUATION64;
			case LOCAL_VALUE: return LOCAL;
			case LOCAL64_VALUE: return LOCAL64;
			case BUSINESS_INTELLIGENCE_VALUE: return BUSINESS_INTELLIGENCE;
			case BUSINESS_INTELLIGENCE64_VALUE: return BUSINESS_INTELLIGENCE64;
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
	private EditionType(int value, String name, String literal) {
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
	
} //EditionType
