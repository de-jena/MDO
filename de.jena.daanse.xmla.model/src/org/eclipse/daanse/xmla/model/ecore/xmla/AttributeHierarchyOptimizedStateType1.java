/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Attribute Hierarchy Optimized State Type1</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAttributeHierarchyOptimizedStateType1()
 * @model extendedMetaData="name='AttributeHierarchyOptimizedState_._1_._type'"
 * @generated
 */
public enum AttributeHierarchyOptimizedStateType1 implements Enumerator {
	/**
	 * The '<em><b>Fully Optimized</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULLY_OPTIMIZED_VALUE
	 * @generated
	 * @ordered
	 */
	FULLY_OPTIMIZED(0, "FullyOptimized", "FullyOptimized"),

	/**
	 * The '<em><b>Not Optimized</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_OPTIMIZED_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_OPTIMIZED(1, "NotOptimized", "NotOptimized");

	/**
	 * The '<em><b>Fully Optimized</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULLY_OPTIMIZED
	 * @model name="FullyOptimized"
	 * @generated
	 * @ordered
	 */
	public static final int FULLY_OPTIMIZED_VALUE = 0;

	/**
	 * The '<em><b>Not Optimized</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_OPTIMIZED
	 * @model name="NotOptimized"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_OPTIMIZED_VALUE = 1;

	/**
	 * An array of all the '<em><b>Attribute Hierarchy Optimized State Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AttributeHierarchyOptimizedStateType1[] VALUES_ARRAY =
		new AttributeHierarchyOptimizedStateType1[] {
			FULLY_OPTIMIZED,
			NOT_OPTIMIZED,
		};

	/**
	 * A public read-only list of all the '<em><b>Attribute Hierarchy Optimized State Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AttributeHierarchyOptimizedStateType1> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Attribute Hierarchy Optimized State Type1</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AttributeHierarchyOptimizedStateType1 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AttributeHierarchyOptimizedStateType1 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Attribute Hierarchy Optimized State Type1</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AttributeHierarchyOptimizedStateType1 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AttributeHierarchyOptimizedStateType1 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Attribute Hierarchy Optimized State Type1</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AttributeHierarchyOptimizedStateType1 get(int value) {
		switch (value) {
			case FULLY_OPTIMIZED_VALUE: return FULLY_OPTIMIZED;
			case NOT_OPTIMIZED_VALUE: return NOT_OPTIMIZED;
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
	private AttributeHierarchyOptimizedStateType1(int value, String name, String literal) {
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
	
} //AttributeHierarchyOptimizedStateType1
