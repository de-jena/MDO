/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Permission Set Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPermissionSetType()
 * @model extendedMetaData="name='PermissionSet_._type'"
 * @generated
 */
public enum PermissionSetType implements Enumerator {
	/**
	 * The '<em><b>Safe</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAFE_VALUE
	 * @generated
	 * @ordered
	 */
	SAFE(0, "Safe", "Safe"),

	/**
	 * The '<em><b>External Access</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTERNAL_ACCESS_VALUE
	 * @generated
	 * @ordered
	 */
	EXTERNAL_ACCESS(1, "ExternalAccess", "ExternalAccess"),

	/**
	 * The '<em><b>Unrestricted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNRESTRICTED_VALUE
	 * @generated
	 * @ordered
	 */
	UNRESTRICTED(2, "Unrestricted", "Unrestricted");

	/**
	 * The '<em><b>Safe</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAFE
	 * @model name="Safe"
	 * @generated
	 * @ordered
	 */
	public static final int SAFE_VALUE = 0;

	/**
	 * The '<em><b>External Access</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTERNAL_ACCESS
	 * @model name="ExternalAccess"
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNAL_ACCESS_VALUE = 1;

	/**
	 * The '<em><b>Unrestricted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNRESTRICTED
	 * @model name="Unrestricted"
	 * @generated
	 * @ordered
	 */
	public static final int UNRESTRICTED_VALUE = 2;

	/**
	 * An array of all the '<em><b>Permission Set Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PermissionSetType[] VALUES_ARRAY =
		new PermissionSetType[] {
			SAFE,
			EXTERNAL_ACCESS,
			UNRESTRICTED,
		};

	/**
	 * A public read-only list of all the '<em><b>Permission Set Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PermissionSetType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Permission Set Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PermissionSetType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PermissionSetType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Permission Set Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PermissionSetType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PermissionSetType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Permission Set Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PermissionSetType get(int value) {
		switch (value) {
			case SAFE_VALUE: return SAFE;
			case EXTERNAL_ACCESS_VALUE: return EXTERNAL_ACCESS;
			case UNRESTRICTED_VALUE: return UNRESTRICTED;
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
	private PermissionSetType(int value, String name, String literal) {
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
	
} //PermissionSetType
