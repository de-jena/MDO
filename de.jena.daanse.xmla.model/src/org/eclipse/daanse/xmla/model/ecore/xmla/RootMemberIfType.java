/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Root Member If Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getRootMemberIfType()
 * @model extendedMetaData="name='RootMemberIf_._type'"
 * @generated
 */
public enum RootMemberIfType implements Enumerator {
	/**
	 * The '<em><b>Parent Is Blank Self Or Missing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARENT_IS_BLANK_SELF_OR_MISSING_VALUE
	 * @generated
	 * @ordered
	 */
	PARENT_IS_BLANK_SELF_OR_MISSING(0, "ParentIsBlankSelfOrMissing", "ParentIsBlankSelfOrMissing"),

	/**
	 * The '<em><b>Parent Is Blank</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARENT_IS_BLANK_VALUE
	 * @generated
	 * @ordered
	 */
	PARENT_IS_BLANK(1, "ParentIsBlank", "ParentIsBlank"),

	/**
	 * The '<em><b>Parent Is Self</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARENT_IS_SELF_VALUE
	 * @generated
	 * @ordered
	 */
	PARENT_IS_SELF(2, "ParentIsSelf", "ParentIsSelf"),

	/**
	 * The '<em><b>Parent Is Missing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARENT_IS_MISSING_VALUE
	 * @generated
	 * @ordered
	 */
	PARENT_IS_MISSING(3, "ParentIsMissing", "ParentIsMissing");

	/**
	 * The '<em><b>Parent Is Blank Self Or Missing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARENT_IS_BLANK_SELF_OR_MISSING
	 * @model name="ParentIsBlankSelfOrMissing"
	 * @generated
	 * @ordered
	 */
	public static final int PARENT_IS_BLANK_SELF_OR_MISSING_VALUE = 0;

	/**
	 * The '<em><b>Parent Is Blank</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARENT_IS_BLANK
	 * @model name="ParentIsBlank"
	 * @generated
	 * @ordered
	 */
	public static final int PARENT_IS_BLANK_VALUE = 1;

	/**
	 * The '<em><b>Parent Is Self</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARENT_IS_SELF
	 * @model name="ParentIsSelf"
	 * @generated
	 * @ordered
	 */
	public static final int PARENT_IS_SELF_VALUE = 2;

	/**
	 * The '<em><b>Parent Is Missing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARENT_IS_MISSING
	 * @model name="ParentIsMissing"
	 * @generated
	 * @ordered
	 */
	public static final int PARENT_IS_MISSING_VALUE = 3;

	/**
	 * An array of all the '<em><b>Root Member If Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RootMemberIfType[] VALUES_ARRAY =
		new RootMemberIfType[] {
			PARENT_IS_BLANK_SELF_OR_MISSING,
			PARENT_IS_BLANK,
			PARENT_IS_SELF,
			PARENT_IS_MISSING,
		};

	/**
	 * A public read-only list of all the '<em><b>Root Member If Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RootMemberIfType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Root Member If Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RootMemberIfType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RootMemberIfType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Root Member If Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RootMemberIfType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RootMemberIfType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Root Member If Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RootMemberIfType get(int value) {
		switch (value) {
			case PARENT_IS_BLANK_SELF_OR_MISSING_VALUE: return PARENT_IS_BLANK_SELF_OR_MISSING;
			case PARENT_IS_BLANK_VALUE: return PARENT_IS_BLANK;
			case PARENT_IS_SELF_VALUE: return PARENT_IS_SELF;
			case PARENT_IS_MISSING_VALUE: return PARENT_IS_MISSING;
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
	private RootMemberIfType(int value, String name, String literal) {
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
	
} //RootMemberIfType
