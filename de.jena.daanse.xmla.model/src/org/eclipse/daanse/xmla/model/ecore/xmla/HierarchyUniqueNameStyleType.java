/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Hierarchy Unique Name Style Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getHierarchyUniqueNameStyleType()
 * @model extendedMetaData="name='HierarchyUniqueNameStyle_._type'"
 * @generated
 */
public enum HierarchyUniqueNameStyleType implements Enumerator {
	/**
	 * The '<em><b>Include Dimension Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCLUDE_DIMENSION_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	INCLUDE_DIMENSION_NAME(0, "IncludeDimensionName", "IncludeDimensionName"),

	/**
	 * The '<em><b>Exclude Dimension Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCLUDE_DIMENSION_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	EXCLUDE_DIMENSION_NAME(1, "ExcludeDimensionName", "ExcludeDimensionName");

	/**
	 * The '<em><b>Include Dimension Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCLUDE_DIMENSION_NAME
	 * @model name="IncludeDimensionName"
	 * @generated
	 * @ordered
	 */
	public static final int INCLUDE_DIMENSION_NAME_VALUE = 0;

	/**
	 * The '<em><b>Exclude Dimension Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCLUDE_DIMENSION_NAME
	 * @model name="ExcludeDimensionName"
	 * @generated
	 * @ordered
	 */
	public static final int EXCLUDE_DIMENSION_NAME_VALUE = 1;

	/**
	 * An array of all the '<em><b>Hierarchy Unique Name Style Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HierarchyUniqueNameStyleType[] VALUES_ARRAY =
		new HierarchyUniqueNameStyleType[] {
			INCLUDE_DIMENSION_NAME,
			EXCLUDE_DIMENSION_NAME,
		};

	/**
	 * A public read-only list of all the '<em><b>Hierarchy Unique Name Style Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HierarchyUniqueNameStyleType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Hierarchy Unique Name Style Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HierarchyUniqueNameStyleType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HierarchyUniqueNameStyleType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hierarchy Unique Name Style Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HierarchyUniqueNameStyleType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HierarchyUniqueNameStyleType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hierarchy Unique Name Style Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HierarchyUniqueNameStyleType get(int value) {
		switch (value) {
			case INCLUDE_DIMENSION_NAME_VALUE: return INCLUDE_DIMENSION_NAME;
			case EXCLUDE_DIMENSION_NAME_VALUE: return EXCLUDE_DIMENSION_NAME;
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
	private HierarchyUniqueNameStyleType(int value, String name, String literal) {
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
	
} //HierarchyUniqueNameStyleType
