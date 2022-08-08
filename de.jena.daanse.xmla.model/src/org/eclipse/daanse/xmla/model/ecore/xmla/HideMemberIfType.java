/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Hide Member If Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getHideMemberIfType()
 * @model extendedMetaData="name='HideMemberIf_._type'"
 * @generated
 */
public enum HideMemberIfType implements Enumerator {
	/**
	 * The '<em><b>Never</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEVER_VALUE
	 * @generated
	 * @ordered
	 */
	NEVER(0, "Never", "Never"),

	/**
	 * The '<em><b>Only Child With No Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONLY_CHILD_WITH_NO_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	ONLY_CHILD_WITH_NO_NAME(1, "OnlyChildWithNoName", "OnlyChildWithNoName"),

	/**
	 * The '<em><b>Only Child With Parent Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONLY_CHILD_WITH_PARENT_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	ONLY_CHILD_WITH_PARENT_NAME(2, "OnlyChildWithParentName", "OnlyChildWithParentName"),

	/**
	 * The '<em><b>No Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	NO_NAME(3, "NoName", "NoName"),

	/**
	 * The '<em><b>Parent Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARENT_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	PARENT_NAME(4, "ParentName", "ParentName");

	/**
	 * The '<em><b>Never</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEVER
	 * @model name="Never"
	 * @generated
	 * @ordered
	 */
	public static final int NEVER_VALUE = 0;

	/**
	 * The '<em><b>Only Child With No Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONLY_CHILD_WITH_NO_NAME
	 * @model name="OnlyChildWithNoName"
	 * @generated
	 * @ordered
	 */
	public static final int ONLY_CHILD_WITH_NO_NAME_VALUE = 1;

	/**
	 * The '<em><b>Only Child With Parent Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONLY_CHILD_WITH_PARENT_NAME
	 * @model name="OnlyChildWithParentName"
	 * @generated
	 * @ordered
	 */
	public static final int ONLY_CHILD_WITH_PARENT_NAME_VALUE = 2;

	/**
	 * The '<em><b>No Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_NAME
	 * @model name="NoName"
	 * @generated
	 * @ordered
	 */
	public static final int NO_NAME_VALUE = 3;

	/**
	 * The '<em><b>Parent Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARENT_NAME
	 * @model name="ParentName"
	 * @generated
	 * @ordered
	 */
	public static final int PARENT_NAME_VALUE = 4;

	/**
	 * An array of all the '<em><b>Hide Member If Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HideMemberIfType[] VALUES_ARRAY =
		new HideMemberIfType[] {
			NEVER,
			ONLY_CHILD_WITH_NO_NAME,
			ONLY_CHILD_WITH_PARENT_NAME,
			NO_NAME,
			PARENT_NAME,
		};

	/**
	 * A public read-only list of all the '<em><b>Hide Member If Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HideMemberIfType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Hide Member If Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HideMemberIfType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HideMemberIfType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hide Member If Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HideMemberIfType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HideMemberIfType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hide Member If Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HideMemberIfType get(int value) {
		switch (value) {
			case NEVER_VALUE: return NEVER;
			case ONLY_CHILD_WITH_NO_NAME_VALUE: return ONLY_CHILD_WITH_NO_NAME;
			case ONLY_CHILD_WITH_PARENT_NAME_VALUE: return ONLY_CHILD_WITH_PARENT_NAME;
			case NO_NAME_VALUE: return NO_NAME;
			case PARENT_NAME_VALUE: return PARENT_NAME;
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
	private HideMemberIfType(int value, String name, String literal) {
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
	
} //HideMemberIfType
