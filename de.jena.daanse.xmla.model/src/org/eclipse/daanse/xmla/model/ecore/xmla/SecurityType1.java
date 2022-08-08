/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Security Type1</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getSecurityType1()
 * @model extendedMetaData="name='Security_._1_._type'"
 * @generated
 */
public enum SecurityType1 implements Enumerator {
	/**
	 * The '<em><b>Skip Membership</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SKIP_MEMBERSHIP_VALUE
	 * @generated
	 * @ordered
	 */
	SKIP_MEMBERSHIP(0, "SkipMembership", "SkipMembership"),

	/**
	 * The '<em><b>Copy All</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COPY_ALL_VALUE
	 * @generated
	 * @ordered
	 */
	COPY_ALL(1, "CopyAll", "CopyAll"),

	/**
	 * The '<em><b>Ignore Security</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IGNORE_SECURITY_VALUE
	 * @generated
	 * @ordered
	 */
	IGNORE_SECURITY(2, "IgnoreSecurity", "IgnoreSecurity");

	/**
	 * The '<em><b>Skip Membership</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SKIP_MEMBERSHIP
	 * @model name="SkipMembership"
	 * @generated
	 * @ordered
	 */
	public static final int SKIP_MEMBERSHIP_VALUE = 0;

	/**
	 * The '<em><b>Copy All</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COPY_ALL
	 * @model name="CopyAll"
	 * @generated
	 * @ordered
	 */
	public static final int COPY_ALL_VALUE = 1;

	/**
	 * The '<em><b>Ignore Security</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IGNORE_SECURITY
	 * @model name="IgnoreSecurity"
	 * @generated
	 * @ordered
	 */
	public static final int IGNORE_SECURITY_VALUE = 2;

	/**
	 * An array of all the '<em><b>Security Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SecurityType1[] VALUES_ARRAY =
		new SecurityType1[] {
			SKIP_MEMBERSHIP,
			COPY_ALL,
			IGNORE_SECURITY,
		};

	/**
	 * A public read-only list of all the '<em><b>Security Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SecurityType1> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Security Type1</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SecurityType1 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SecurityType1 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Security Type1</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SecurityType1 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SecurityType1 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Security Type1</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SecurityType1 get(int value) {
		switch (value) {
			case SKIP_MEMBERSHIP_VALUE: return SKIP_MEMBERSHIP;
			case COPY_ALL_VALUE: return COPY_ALL;
			case IGNORE_SECURITY_VALUE: return IGNORE_SECURITY;
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
	private SecurityType1(int value, String name, String literal) {
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
	
} //SecurityType1
