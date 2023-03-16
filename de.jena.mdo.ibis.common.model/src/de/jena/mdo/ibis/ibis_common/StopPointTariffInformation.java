/*
 */
package de.jena.mdo.ibis.ibis_common;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stop Point Tariff Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.StopPointTariffInformation#getJourneyStopInformation <em>Journey Stop Information</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.StopPointTariffInformation#getFareZoneInformation <em>Fare Zone Information</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getStopPointTariffInformation()
 * @model extendedMetaData="name='StopPointTariffInformationStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface StopPointTariffInformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Journey Stop Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Journey Stop Information</em>' containment reference.
	 * @see #setJourneyStopInformation(JourneyStopInformation)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getStopPointTariffInformation_JourneyStopInformation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='JourneyStopInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	JourneyStopInformation getJourneyStopInformation();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.StopPointTariffInformation#getJourneyStopInformation <em>Journey Stop Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Journey Stop Information</em>' containment reference.
	 * @see #getJourneyStopInformation()
	 * @generated
	 */
	void setJourneyStopInformation(JourneyStopInformation value);

	/**
	 * Returns the value of the '<em><b>Fare Zone Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fare Zone Information</em>' containment reference.
	 * @see #setFareZoneInformation(FareZoneInformation)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getStopPointTariffInformation_FareZoneInformation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FareZoneInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	FareZoneInformation getFareZoneInformation();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.StopPointTariffInformation#getFareZoneInformation <em>Fare Zone Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fare Zone Information</em>' containment reference.
	 * @see #getFareZoneInformation()
	 * @generated
	 */
	void setFareZoneInformation(FareZoneInformation value);

} // StopPointTariffInformation
