/*
 */
package de.jena.mdo.ibis.common;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Card Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.CardType#getCardSerialNumber <em>Card Serial Number</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.CardType#getCardTypeID <em>Card Type ID</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.CardType#getCardTypeText <em>Card Type Text</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getCardType()
 * @model extendedMetaData="name='CardType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CardType extends EObject {
	/**
	 * Returns the value of the '<em><b>Card Serial Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Serial Number</em>' containment reference.
	 * @see #setCardSerialNumber(IBISIPNMTOKEN)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getCardType_CardSerialNumber()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CardSerialNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPNMTOKEN getCardSerialNumber();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.CardType#getCardSerialNumber <em>Card Serial Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Serial Number</em>' containment reference.
	 * @see #getCardSerialNumber()
	 * @generated
	 */
	void setCardSerialNumber(IBISIPNMTOKEN value);

	/**
	 * Returns the value of the '<em><b>Card Type ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Type ID</em>' containment reference.
	 * @see #setCardTypeID(IBISIPNMTOKEN)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getCardType_CardTypeID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CardTypeID' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPNMTOKEN getCardTypeID();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.CardType#getCardTypeID <em>Card Type ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Type ID</em>' containment reference.
	 * @see #getCardTypeID()
	 * @generated
	 */
	void setCardTypeID(IBISIPNMTOKEN value);

	/**
	 * Returns the value of the '<em><b>Card Type Text</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.common.InternationalTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Type Text</em>' containment reference list.
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getCardType_CardTypeText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CardTypeText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InternationalTextType> getCardTypeText();

} // CardType
