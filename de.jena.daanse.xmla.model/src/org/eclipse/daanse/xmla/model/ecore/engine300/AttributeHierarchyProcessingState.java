/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine300;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Attribute Hierarchy Processing State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getAttributeHierarchyProcessingState()
 * @model extendedMetaData="name='AttributeHierarchyProcessingState'"
 * @generated
 */
public enum AttributeHierarchyProcessingState implements Enumerator {
	/**
	 * The '<em><b>Processed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCESSED_VALUE
	 * @generated
	 * @ordered
	 */
	PROCESSED(0, "Processed", "Processed"),

	/**
	 * The '<em><b>Unprocessed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNPROCESSED_VALUE
	 * @generated
	 * @ordered
	 */
	UNPROCESSED(1, "Unprocessed", "Unprocessed"),

	/**
	 * The '<em><b>Dependency Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPENDENCY_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	DEPENDENCY_ERROR(2, "DependencyError", "DependencyError");

	/**
	 * The '<em><b>Processed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCESSED
	 * @model name="Processed"
	 * @generated
	 * @ordered
	 */
	public static final int PROCESSED_VALUE = 0;

	/**
	 * The '<em><b>Unprocessed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNPROCESSED
	 * @model name="Unprocessed"
	 * @generated
	 * @ordered
	 */
	public static final int UNPROCESSED_VALUE = 1;

	/**
	 * The '<em><b>Dependency Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPENDENCY_ERROR
	 * @model name="DependencyError"
	 * @generated
	 * @ordered
	 */
	public static final int DEPENDENCY_ERROR_VALUE = 2;

	/**
	 * An array of all the '<em><b>Attribute Hierarchy Processing State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AttributeHierarchyProcessingState[] VALUES_ARRAY =
		new AttributeHierarchyProcessingState[] {
			PROCESSED,
			UNPROCESSED,
			DEPENDENCY_ERROR,
		};

	/**
	 * A public read-only list of all the '<em><b>Attribute Hierarchy Processing State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AttributeHierarchyProcessingState> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Attribute Hierarchy Processing State</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AttributeHierarchyProcessingState get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AttributeHierarchyProcessingState result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Attribute Hierarchy Processing State</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AttributeHierarchyProcessingState getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AttributeHierarchyProcessingState result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Attribute Hierarchy Processing State</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AttributeHierarchyProcessingState get(int value) {
		switch (value) {
			case PROCESSED_VALUE: return PROCESSED;
			case UNPROCESSED_VALUE: return UNPROCESSED;
			case DEPENDENCY_ERROR_VALUE: return DEPENDENCY_ERROR;
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
	private AttributeHierarchyProcessingState(int value, String name, String literal) {
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
	
} //AttributeHierarchyProcessingState
