/*
 */
package de.jena.mdo.ibis.ibis_common;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Card Ticket Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.CardTicketData#getCardTicketDataID <em>Card Ticket Data ID</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.CardTicketData#getCardTicketDataLength <em>Card Ticket Data Length</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.CardTicketData#getCardTicketData <em>Card Ticket Data</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getCardTicketData()
 * @model extendedMetaData="name='CardTicketData' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CardTicketData extends EObject {
	/**
	 * Returns the value of the '<em><b>Card Ticket Data ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Ticket Data ID</em>' containment reference.
	 * @see #setCardTicketDataID(IBISIPUnsignedLong)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getCardTicketData_CardTicketDataID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CardTicketDataID' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPUnsignedLong getCardTicketDataID();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.CardTicketData#getCardTicketDataID <em>Card Ticket Data ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Ticket Data ID</em>' containment reference.
	 * @see #getCardTicketDataID()
	 * @generated
	 */
	void setCardTicketDataID(IBISIPUnsignedLong value);

	/**
	 * Returns the value of the '<em><b>Card Ticket Data Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Length of the bytearray of ticketdata
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Card Ticket Data Length</em>' containment reference.
	 * @see #setCardTicketDataLength(IBISIPUnsignedInt)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getCardTicketData_CardTicketDataLength()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CardTicketDataLength' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPUnsignedInt getCardTicketDataLength();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.CardTicketData#getCardTicketDataLength <em>Card Ticket Data Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Ticket Data Length</em>' containment reference.
	 * @see #getCardTicketDataLength()
	 * @generated
	 */
	void setCardTicketDataLength(IBISIPUnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Card Ticket Data</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.ibis_common.IBISIPByte}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ticketdata from Card as  Byte-Array
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Card Ticket Data</em>' containment reference list.
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getCardTicketData_CardTicketData()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CardTicketData' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IBISIPByte> getCardTicketData();

} // CardTicketData
