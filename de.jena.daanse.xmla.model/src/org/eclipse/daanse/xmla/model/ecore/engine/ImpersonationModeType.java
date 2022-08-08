/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Impersonation Mode Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.engine.EnginePackage#getImpersonationModeType()
 * @model extendedMetaData="name='ImpersonationMode_._type'"
 * @generated
 */
public enum ImpersonationModeType implements Enumerator {
	/**
	 * The '<em><b>Default</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	DEFAULT(0, "Default", "Default"),

	/**
	 * The '<em><b>Impersonate Service Account</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPERSONATE_SERVICE_ACCOUNT_VALUE
	 * @generated
	 * @ordered
	 */
	IMPERSONATE_SERVICE_ACCOUNT(1, "ImpersonateServiceAccount", "ImpersonateServiceAccount"),

	/**
	 * The '<em><b>Impersonate Anonymous</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPERSONATE_ANONYMOUS_VALUE
	 * @generated
	 * @ordered
	 */
	IMPERSONATE_ANONYMOUS(2, "ImpersonateAnonymous", "ImpersonateAnonymous"),

	/**
	 * The '<em><b>Impersonate Current User</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPERSONATE_CURRENT_USER_VALUE
	 * @generated
	 * @ordered
	 */
	IMPERSONATE_CURRENT_USER(3, "ImpersonateCurrentUser", "ImpersonateCurrentUser"),

	/**
	 * The '<em><b>Impersonate Account</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPERSONATE_ACCOUNT_VALUE
	 * @generated
	 * @ordered
	 */
	IMPERSONATE_ACCOUNT(4, "ImpersonateAccount", "ImpersonateAccount");

	/**
	 * The '<em><b>Default</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULT
	 * @model name="Default"
	 * @generated
	 * @ordered
	 */
	public static final int DEFAULT_VALUE = 0;

	/**
	 * The '<em><b>Impersonate Service Account</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPERSONATE_SERVICE_ACCOUNT
	 * @model name="ImpersonateServiceAccount"
	 * @generated
	 * @ordered
	 */
	public static final int IMPERSONATE_SERVICE_ACCOUNT_VALUE = 1;

	/**
	 * The '<em><b>Impersonate Anonymous</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPERSONATE_ANONYMOUS
	 * @model name="ImpersonateAnonymous"
	 * @generated
	 * @ordered
	 */
	public static final int IMPERSONATE_ANONYMOUS_VALUE = 2;

	/**
	 * The '<em><b>Impersonate Current User</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPERSONATE_CURRENT_USER
	 * @model name="ImpersonateCurrentUser"
	 * @generated
	 * @ordered
	 */
	public static final int IMPERSONATE_CURRENT_USER_VALUE = 3;

	/**
	 * The '<em><b>Impersonate Account</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPERSONATE_ACCOUNT
	 * @model name="ImpersonateAccount"
	 * @generated
	 * @ordered
	 */
	public static final int IMPERSONATE_ACCOUNT_VALUE = 4;

	/**
	 * An array of all the '<em><b>Impersonation Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ImpersonationModeType[] VALUES_ARRAY =
		new ImpersonationModeType[] {
			DEFAULT,
			IMPERSONATE_SERVICE_ACCOUNT,
			IMPERSONATE_ANONYMOUS,
			IMPERSONATE_CURRENT_USER,
			IMPERSONATE_ACCOUNT,
		};

	/**
	 * A public read-only list of all the '<em><b>Impersonation Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ImpersonationModeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Impersonation Mode Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImpersonationModeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImpersonationModeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Impersonation Mode Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImpersonationModeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImpersonationModeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Impersonation Mode Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImpersonationModeType get(int value) {
		switch (value) {
			case DEFAULT_VALUE: return DEFAULT;
			case IMPERSONATE_SERVICE_ACCOUNT_VALUE: return IMPERSONATE_SERVICE_ACCOUNT;
			case IMPERSONATE_ANONYMOUS_VALUE: return IMPERSONATE_ANONYMOUS;
			case IMPERSONATE_CURRENT_USER_VALUE: return IMPERSONATE_CURRENT_USER;
			case IMPERSONATE_ACCOUNT_VALUE: return IMPERSONATE_ACCOUNT;
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
	private ImpersonationModeType(int value, String name, String literal) {
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
	
} //ImpersonationModeType
