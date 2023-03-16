/*
 */
package de.jena.mdo.ibis.ibis_common;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Card Appl Informations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.CardApplInformations#getCardApplInformationLength <em>Card Appl Information Length</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.CardApplInformations#getCardApplInformationData <em>Card Appl Information Data</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getCardApplInformations()
 * @model extendedMetaData="name='CardApplInformations' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CardApplInformations extends EObject {
	/**
	 * Returns the value of the '<em><b>Card Appl Information Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Length of the bytearray of applikationdata
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Card Appl Information Length</em>' containment reference.
	 * @see #setCardApplInformationLength(IBISIPUnsignedInt)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getCardApplInformations_CardApplInformationLength()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CardApplInformationLength' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPUnsignedInt getCardApplInformationLength();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.CardApplInformations#getCardApplInformationLength <em>Card Appl Information Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Appl Information Length</em>' containment reference.
	 * @see #getCardApplInformationLength()
	 * @generated
	 */
	void setCardApplInformationLength(IBISIPUnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Card Appl Information Data</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.ibis_common.IBISIPByte}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Applikationdata from Card as Byte-Array 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Card Appl Information Data</em>' containment reference list.
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getCardApplInformations_CardApplInformationData()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CardApplInformationData' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IBISIPByte> getCardApplInformationData();

} // CardApplInformations
