/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Object Expansion</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getObjectExpansion()
 * @model extendedMetaData="name='ObjectExpansion'"
 * @generated
 */
public enum ObjectExpansion implements Enumerator {
	/**
	 * The '<em><b>Object Properties</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBJECT_PROPERTIES_VALUE
	 * @generated
	 * @ordered
	 */
	OBJECT_PROPERTIES(0, "ObjectProperties", "ObjectProperties"),

	/**
	 * The '<em><b>Expand Full</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPAND_FULL_VALUE
	 * @generated
	 * @ordered
	 */
	EXPAND_FULL(1, "ExpandFull", "ExpandFull");

	/**
	 * The '<em><b>Object Properties</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBJECT_PROPERTIES
	 * @model name="ObjectProperties"
	 * @generated
	 * @ordered
	 */
	public static final int OBJECT_PROPERTIES_VALUE = 0;

	/**
	 * The '<em><b>Expand Full</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPAND_FULL
	 * @model name="ExpandFull"
	 * @generated
	 * @ordered
	 */
	public static final int EXPAND_FULL_VALUE = 1;

	/**
	 * An array of all the '<em><b>Object Expansion</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ObjectExpansion[] VALUES_ARRAY =
		new ObjectExpansion[] {
			OBJECT_PROPERTIES,
			EXPAND_FULL,
		};

	/**
	 * A public read-only list of all the '<em><b>Object Expansion</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ObjectExpansion> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Object Expansion</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ObjectExpansion get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObjectExpansion result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Object Expansion</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ObjectExpansion getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObjectExpansion result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Object Expansion</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ObjectExpansion get(int value) {
		switch (value) {
			case OBJECT_PROPERTIES_VALUE: return OBJECT_PROPERTIES;
			case EXPAND_FULL_VALUE: return EXPAND_FULL;
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
	private ObjectExpansion(int value, String name, String literal) {
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
	
} //ObjectExpansion
