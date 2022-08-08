/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Type5</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTypeType5()
 * @model extendedMetaData="name='Type_._5_._type'"
 * @generated
 */
public enum TypeType5 implements Enumerator {
	/**
	 * The '<em><b>All</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_VALUE
	 * @generated
	 * @ordered
	 */
	ALL(0, "All", "All"),

	/**
	 * The '<em><b>Key</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEY_VALUE
	 * @generated
	 * @ordered
	 */
	KEY(1, "Key", "Key"),

	/**
	 * The '<em><b>Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAME_VALUE
	 * @generated
	 * @ordered
	 */
	NAME(2, "Name", "Name"),

	/**
	 * The '<em><b>Value</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALUE_VALUE
	 * @generated
	 * @ordered
	 */
	VALUE(3, "Value", "Value"),

	/**
	 * The '<em><b>Translation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSLATION_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSLATION(4, "Translation", "Translation"),

	/**
	 * The '<em><b>Unary Operator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNARY_OPERATOR_VALUE
	 * @generated
	 * @ordered
	 */
	UNARY_OPERATOR(5, "UnaryOperator", "UnaryOperator"),

	/**
	 * The '<em><b>Skipped Levels</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SKIPPED_LEVELS_VALUE
	 * @generated
	 * @ordered
	 */
	SKIPPED_LEVELS(6, "SkippedLevels", "SkippedLevels"),

	/**
	 * The '<em><b>Custom Rollup</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM_ROLLUP_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM_ROLLUP(7, "CustomRollup", "CustomRollup"),

	/**
	 * The '<em><b>Custom Rollup Properties</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM_ROLLUP_PROPERTIES_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM_ROLLUP_PROPERTIES(8, "CustomRollupProperties", "CustomRollupProperties");

	/**
	 * The '<em><b>All</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL
	 * @model name="All"
	 * @generated
	 * @ordered
	 */
	public static final int ALL_VALUE = 0;

	/**
	 * The '<em><b>Key</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEY
	 * @model name="Key"
	 * @generated
	 * @ordered
	 */
	public static final int KEY_VALUE = 1;

	/**
	 * The '<em><b>Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAME
	 * @model name="Name"
	 * @generated
	 * @ordered
	 */
	public static final int NAME_VALUE = 2;

	/**
	 * The '<em><b>Value</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALUE
	 * @model name="Value"
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_VALUE = 3;

	/**
	 * The '<em><b>Translation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSLATION
	 * @model name="Translation"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSLATION_VALUE = 4;

	/**
	 * The '<em><b>Unary Operator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNARY_OPERATOR
	 * @model name="UnaryOperator"
	 * @generated
	 * @ordered
	 */
	public static final int UNARY_OPERATOR_VALUE = 5;

	/**
	 * The '<em><b>Skipped Levels</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SKIPPED_LEVELS
	 * @model name="SkippedLevels"
	 * @generated
	 * @ordered
	 */
	public static final int SKIPPED_LEVELS_VALUE = 6;

	/**
	 * The '<em><b>Custom Rollup</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM_ROLLUP
	 * @model name="CustomRollup"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM_ROLLUP_VALUE = 7;

	/**
	 * The '<em><b>Custom Rollup Properties</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM_ROLLUP_PROPERTIES
	 * @model name="CustomRollupProperties"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM_ROLLUP_PROPERTIES_VALUE = 8;

	/**
	 * An array of all the '<em><b>Type Type5</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeType5[] VALUES_ARRAY =
		new TypeType5[] {
			ALL,
			KEY,
			NAME,
			VALUE,
			TRANSLATION,
			UNARY_OPERATOR,
			SKIPPED_LEVELS,
			CUSTOM_ROLLUP,
			CUSTOM_ROLLUP_PROPERTIES,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Type5</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeType5> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Type5</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeType5 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeType5 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Type5</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeType5 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeType5 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Type5</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeType5 get(int value) {
		switch (value) {
			case ALL_VALUE: return ALL;
			case KEY_VALUE: return KEY;
			case NAME_VALUE: return NAME;
			case VALUE_VALUE: return VALUE;
			case TRANSLATION_VALUE: return TRANSLATION;
			case UNARY_OPERATOR_VALUE: return UNARY_OPERATOR;
			case SKIPPED_LEVELS_VALUE: return SKIPPED_LEVELS;
			case CUSTOM_ROLLUP_VALUE: return CUSTOM_ROLLUP;
			case CUSTOM_ROLLUP_PROPERTIES_VALUE: return CUSTOM_ROLLUP_PROPERTIES;
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
	private TypeType5(int value, String name, String literal) {
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
	
} //TypeType5
