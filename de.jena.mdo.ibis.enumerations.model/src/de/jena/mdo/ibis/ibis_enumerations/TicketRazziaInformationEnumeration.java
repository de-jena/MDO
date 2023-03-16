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
 * A representation of the literals of the enumeration '<em><b>Ticket Razzia Information Enumeration</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.jena.mdo.ibis.ibis_enumerations.IbisEnumerationsPackage#getTicketRazziaInformationEnumeration()
 * @model extendedMetaData="name='TicketRazziaInformationEnumeration'"
 * @generated
 */
@ProviderType
public enum TicketRazziaInformationEnumeration implements Enumerator {
	/**
	 * The '<em><b>Razzia</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAZZIA_VALUE
	 * @generated
	 * @ordered
	 */
	RAZZIA(0, "razzia", "razzia"),

	/**
	 * The '<em><b>Norazzia</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORAZZIA_VALUE
	 * @generated
	 * @ordered
	 */
	NORAZZIA(1, "norazzia", "norazzia");

	/**
	 * The '<em><b>Razzia</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAZZIA
	 * @model name="razzia"
	 * @generated
	 * @ordered
	 */
	public static final int RAZZIA_VALUE = 0;

	/**
	 * The '<em><b>Norazzia</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORAZZIA
	 * @model name="norazzia"
	 * @generated
	 * @ordered
	 */
	public static final int NORAZZIA_VALUE = 1;

	/**
	 * An array of all the '<em><b>Ticket Razzia Information Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TicketRazziaInformationEnumeration[] VALUES_ARRAY =
		new TicketRazziaInformationEnumeration[] {
			RAZZIA,
			NORAZZIA,
		};

	/**
	 * A public read-only list of all the '<em><b>Ticket Razzia Information Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TicketRazziaInformationEnumeration> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ticket Razzia Information Enumeration</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TicketRazziaInformationEnumeration get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TicketRazziaInformationEnumeration result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ticket Razzia Information Enumeration</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TicketRazziaInformationEnumeration getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TicketRazziaInformationEnumeration result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ticket Razzia Information Enumeration</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TicketRazziaInformationEnumeration get(int value) {
		switch (value) {
			case RAZZIA_VALUE: return RAZZIA;
			case NORAZZIA_VALUE: return NORAZZIA;
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
	private TicketRazziaInformationEnumeration(int value, String name, String literal) {
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
	
} //TicketRazziaInformationEnumeration
