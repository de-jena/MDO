/*
 */
package de.jena.mdo.ibis.enumerations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>System Documentation Information Enumeration</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.jena.mdo.ibis.enumerations.IbisEnumerationsPackage#getSystemDocumentationInformationEnumeration()
 * @model extendedMetaData="name='SystemDocumentationInformationEnumeration'"
 * @generated
 */
@ProviderType
public enum SystemDocumentationInformationEnumeration implements Enumerator {
	/**
	 * The '<em><b>Error Message</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_MESSAGE_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_MESSAGE(0, "ErrorMessage", "ErrorMessage"),

	/**
	 * The '<em><b>Status Message</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATUS_MESSAGE_VALUE
	 * @generated
	 * @ordered
	 */
	STATUS_MESSAGE(1, "StatusMessage", "StatusMessage"),

	/**
	 * The '<em><b>Warning Message</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WARNING_MESSAGE_VALUE
	 * @generated
	 * @ordered
	 */
	WARNING_MESSAGE(2, "WarningMessage", "WarningMessage"),

	/**
	 * The '<em><b>All</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_VALUE
	 * @generated
	 * @ordered
	 */
	ALL(3, "All", "All");

	/**
	 * The '<em><b>Error Message</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_MESSAGE
	 * @model name="ErrorMessage"
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_MESSAGE_VALUE = 0;

	/**
	 * The '<em><b>Status Message</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATUS_MESSAGE
	 * @model name="StatusMessage"
	 * @generated
	 * @ordered
	 */
	public static final int STATUS_MESSAGE_VALUE = 1;

	/**
	 * The '<em><b>Warning Message</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WARNING_MESSAGE
	 * @model name="WarningMessage"
	 * @generated
	 * @ordered
	 */
	public static final int WARNING_MESSAGE_VALUE = 2;

	/**
	 * The '<em><b>All</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL
	 * @model name="All"
	 * @generated
	 * @ordered
	 */
	public static final int ALL_VALUE = 3;

	/**
	 * An array of all the '<em><b>System Documentation Information Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SystemDocumentationInformationEnumeration[] VALUES_ARRAY =
		new SystemDocumentationInformationEnumeration[] {
			ERROR_MESSAGE,
			STATUS_MESSAGE,
			WARNING_MESSAGE,
			ALL,
		};

	/**
	 * A public read-only list of all the '<em><b>System Documentation Information Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SystemDocumentationInformationEnumeration> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>System Documentation Information Enumeration</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SystemDocumentationInformationEnumeration get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SystemDocumentationInformationEnumeration result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>System Documentation Information Enumeration</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SystemDocumentationInformationEnumeration getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SystemDocumentationInformationEnumeration result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>System Documentation Information Enumeration</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SystemDocumentationInformationEnumeration get(int value) {
		switch (value) {
			case ERROR_MESSAGE_VALUE: return ERROR_MESSAGE;
			case STATUS_MESSAGE_VALUE: return STATUS_MESSAGE;
			case WARNING_MESSAGE_VALUE: return WARNING_MESSAGE;
			case ALL_VALUE: return ALL;
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
	private SystemDocumentationInformationEnumeration(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //SystemDocumentationInformationEnumeration
