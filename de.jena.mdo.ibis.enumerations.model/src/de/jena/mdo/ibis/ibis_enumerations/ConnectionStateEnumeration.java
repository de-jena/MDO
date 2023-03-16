/*
 */
package de.jena.mdo.ibis.ibis_enumerations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Connection State Enumeration</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Information whether a connection will rest protected
 * <!-- end-model-doc -->
 * @see de.jena.mdo.ibis.ibis_enumerations.IbisEnumerationsPackage#getConnectionStateEnumeration()
 * @model extendedMetaData="name='ConnectionStateEnumeration'"
 * @generated
 */
@ProviderType
public enum ConnectionStateEnumeration implements Enumerator {
	/**
	 * The '<em><b>Connection Broken</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECTION_BROKEN_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECTION_BROKEN(0, "ConnectionBroken", "ConnectionBroken"),

	/**
	 * The '<em><b>Connection OK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECTION_OK_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECTION_OK(1, "ConnectionOK", "ConnectionOK"),

	/**
	 * The '<em><b>No Information Available</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_INFORMATION_AVAILABLE_VALUE
	 * @generated
	 * @ordered
	 */
	NO_INFORMATION_AVAILABLE(2, "NoInformationAvailable", "NoInformationAvailable");

	/**
	 * The '<em><b>Connection Broken</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECTION_BROKEN
	 * @model name="ConnectionBroken"
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTION_BROKEN_VALUE = 0;

	/**
	 * The '<em><b>Connection OK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECTION_OK
	 * @model name="ConnectionOK"
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTION_OK_VALUE = 1;

	/**
	 * The '<em><b>No Information Available</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_INFORMATION_AVAILABLE
	 * @model name="NoInformationAvailable"
	 * @generated
	 * @ordered
	 */
	public static final int NO_INFORMATION_AVAILABLE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Connection State Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConnectionStateEnumeration[] VALUES_ARRAY =
		new ConnectionStateEnumeration[] {
			CONNECTION_BROKEN,
			CONNECTION_OK,
			NO_INFORMATION_AVAILABLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Connection State Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConnectionStateEnumeration> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Connection State Enumeration</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConnectionStateEnumeration get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConnectionStateEnumeration result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Connection State Enumeration</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConnectionStateEnumeration getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConnectionStateEnumeration result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Connection State Enumeration</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConnectionStateEnumeration get(int value) {
		switch (value) {
			case CONNECTION_BROKEN_VALUE: return CONNECTION_BROKEN;
			case CONNECTION_OK_VALUE: return CONNECTION_OK;
			case NO_INFORMATION_AVAILABLE_VALUE: return NO_INFORMATION_AVAILABLE;
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
	private ConnectionStateEnumeration(int value, String name, String literal) {
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
	
} //ConnectionStateEnumeration
