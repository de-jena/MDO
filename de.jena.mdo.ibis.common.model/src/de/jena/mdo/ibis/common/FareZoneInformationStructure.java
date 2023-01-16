/*
 */
package de.jena.mdo.ibis.common;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fare Zone Information Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.FareZoneInformationStructure#getFareZoneID <em>Fare Zone ID</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.FareZoneInformationStructure#getFareZoneType <em>Fare Zone Type</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.FareZoneInformationStructure#getFareZoneLongName <em>Fare Zone Long Name</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.FareZoneInformationStructure#getFareZoneShortName <em>Fare Zone Short Name</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getFareZoneInformationStructure()
 * @model extendedMetaData="name='FareZoneInformationStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FareZoneInformationStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Fare Zone ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * unique ID for the farezone
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fare Zone ID</em>' containment reference.
	 * @see #setFareZoneID(IBISIPNMTOKEN)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getFareZoneInformationStructure_FareZoneID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FareZoneID' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPNMTOKEN getFareZoneID();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.FareZoneInformationStructure#getFareZoneID <em>Fare Zone ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fare Zone ID</em>' containment reference.
	 * @see #getFareZoneID()
	 * @generated
	 */
	void setFareZoneID(IBISIPNMTOKEN value);

	/**
	 * Returns the value of the '<em><b>Fare Zone Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fare Zone Type</em>' containment reference.
	 * @see #setFareZoneType(ZoneType)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getFareZoneInformationStructure_FareZoneType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FareZoneType' namespace='##targetNamespace'"
	 * @generated
	 */
	ZoneType getFareZoneType();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.FareZoneInformationStructure#getFareZoneType <em>Fare Zone Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fare Zone Type</em>' containment reference.
	 * @see #getFareZoneType()
	 * @generated
	 */
	void setFareZoneType(ZoneType value);

	/**
	 * Returns the value of the '<em><b>Fare Zone Long Name</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.common.InternationalTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fare Zone Long Name</em>' containment reference list.
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getFareZoneInformationStructure_FareZoneLongName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FareZoneLongName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InternationalTextType> getFareZoneLongName();

	/**
	 * Returns the value of the '<em><b>Fare Zone Short Name</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.common.InternationalTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fare Zone Short Name</em>' containment reference list.
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getFareZoneInformationStructure_FareZoneShortName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FareZoneShortName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InternationalTextType> getFareZoneShortName();

} // FareZoneInformationStructure
