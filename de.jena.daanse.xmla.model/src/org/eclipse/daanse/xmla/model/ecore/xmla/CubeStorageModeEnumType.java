/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cube Storage Mode Enum Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCubeStorageModeEnumType()
 * @model extendedMetaData="name='CubeStorageModeEnumType'"
 * @generated
 */
public enum CubeStorageModeEnumType implements Enumerator {
	/**
	 * The '<em><b>Molap</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOLAP_VALUE
	 * @generated
	 * @ordered
	 */
	MOLAP(0, "Molap", "Molap"),

	/**
	 * The '<em><b>Rolap</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROLAP_VALUE
	 * @generated
	 * @ordered
	 */
	ROLAP(1, "Rolap", "Rolap"),

	/**
	 * The '<em><b>Holap</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOLAP_VALUE
	 * @generated
	 * @ordered
	 */
	HOLAP(2, "Holap", "Holap"),

	/**
	 * The '<em><b>In Memory</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_MEMORY_VALUE
	 * @generated
	 * @ordered
	 */
	IN_MEMORY(3, "InMemory", "InMemory");

	/**
	 * The '<em><b>Molap</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOLAP
	 * @model name="Molap"
	 * @generated
	 * @ordered
	 */
	public static final int MOLAP_VALUE = 0;

	/**
	 * The '<em><b>Rolap</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROLAP
	 * @model name="Rolap"
	 * @generated
	 * @ordered
	 */
	public static final int ROLAP_VALUE = 1;

	/**
	 * The '<em><b>Holap</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOLAP
	 * @model name="Holap"
	 * @generated
	 * @ordered
	 */
	public static final int HOLAP_VALUE = 2;

	/**
	 * The '<em><b>In Memory</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_MEMORY
	 * @model name="InMemory"
	 * @generated
	 * @ordered
	 */
	public static final int IN_MEMORY_VALUE = 3;

	/**
	 * An array of all the '<em><b>Cube Storage Mode Enum Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CubeStorageModeEnumType[] VALUES_ARRAY =
		new CubeStorageModeEnumType[] {
			MOLAP,
			ROLAP,
			HOLAP,
			IN_MEMORY,
		};

	/**
	 * A public read-only list of all the '<em><b>Cube Storage Mode Enum Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CubeStorageModeEnumType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cube Storage Mode Enum Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CubeStorageModeEnumType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CubeStorageModeEnumType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cube Storage Mode Enum Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CubeStorageModeEnumType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CubeStorageModeEnumType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cube Storage Mode Enum Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CubeStorageModeEnumType get(int value) {
		switch (value) {
			case MOLAP_VALUE: return MOLAP;
			case ROLAP_VALUE: return ROLAP;
			case HOLAP_VALUE: return HOLAP;
			case IN_MEMORY_VALUE: return IN_MEMORY;
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
	private CubeStorageModeEnumType(int value, String name, String literal) {
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
	
} //CubeStorageModeEnumType
