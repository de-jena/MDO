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
 * A representation of the literals of the enumeration '<em><b>Ticket Validation Enumeration</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Information about the result of ticket validation
 * <!-- end-model-doc -->
 * @see de.jena.mdo.ibis.enumerations.IbisEnumerationsPackage#getTicketValidationEnumeration()
 * @model extendedMetaData="name='TicketValidationEnumeration'"
 * @generated
 */
@ProviderType
public enum TicketValidationEnumeration implements Enumerator {
	/**
	 * The '<em><b>Valid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALID_VALUE
	 * @generated
	 * @ordered
	 */
	VALID(0, "valid", "valid"),

	/**
	 * The '<em><b>Notvalid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTVALID_VALUE
	 * @generated
	 * @ordered
	 */
	NOTVALID(1, "notvalid", "notvalid"),

	/**
	 * The '<em><b>No Card</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_CARD_VALUE
	 * @generated
	 * @ordered
	 */
	NO_CARD(2, "NoCard", "NoCard");

	/**
	 * The '<em><b>Valid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALID
	 * @model name="valid"
	 * @generated
	 * @ordered
	 */
	public static final int VALID_VALUE = 0;

	/**
	 * The '<em><b>Notvalid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTVALID
	 * @model name="notvalid"
	 * @generated
	 * @ordered
	 */
	public static final int NOTVALID_VALUE = 1;

	/**
	 * The '<em><b>No Card</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_CARD
	 * @model name="NoCard"
	 * @generated
	 * @ordered
	 */
	public static final int NO_CARD_VALUE = 2;

	/**
	 * An array of all the '<em><b>Ticket Validation Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TicketValidationEnumeration[] VALUES_ARRAY =
		new TicketValidationEnumeration[] {
			VALID,
			NOTVALID,
			NO_CARD,
		};

	/**
	 * A public read-only list of all the '<em><b>Ticket Validation Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TicketValidationEnumeration> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ticket Validation Enumeration</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TicketValidationEnumeration get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TicketValidationEnumeration result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ticket Validation Enumeration</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TicketValidationEnumeration getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TicketValidationEnumeration result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ticket Validation Enumeration</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TicketValidationEnumeration get(int value) {
		switch (value) {
			case VALID_VALUE: return VALID;
			case NOTVALID_VALUE: return NOTVALID;
			case NO_CARD_VALUE: return NO_CARD;
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
	private TicketValidationEnumeration(int value, String name, String literal) {
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
	
} //TicketValidationEnumeration
