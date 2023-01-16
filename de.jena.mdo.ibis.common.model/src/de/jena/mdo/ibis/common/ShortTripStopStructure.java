/*
 */
package de.jena.mdo.ibis.common;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Short Trip Stop Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.ShortTripStopStructure#getJourneyStopInformation <em>Journey Stop Information</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.ShortTripStopStructure#getFareZoneInformation <em>Fare Zone Information</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getShortTripStopStructure()
 * @model extendedMetaData="name='ShortTripStopStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ShortTripStopStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Journey Stop Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Journey Stop Information</em>' containment reference.
	 * @see #setJourneyStopInformation(JourneyStopInformationStructure)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getShortTripStopStructure_JourneyStopInformation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='JourneyStopInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	JourneyStopInformationStructure getJourneyStopInformation();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.ShortTripStopStructure#getJourneyStopInformation <em>Journey Stop Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Journey Stop Information</em>' containment reference.
	 * @see #getJourneyStopInformation()
	 * @generated
	 */
	void setJourneyStopInformation(JourneyStopInformationStructure value);

	/**
	 * Returns the value of the '<em><b>Fare Zone Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fare Zone Information</em>' containment reference.
	 * @see #setFareZoneInformation(FareZoneInformationStructure)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getShortTripStopStructure_FareZoneInformation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FareZoneInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	FareZoneInformationStructure getFareZoneInformation();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.ShortTripStopStructure#getFareZoneInformation <em>Fare Zone Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fare Zone Information</em>' containment reference.
	 * @see #getFareZoneInformation()
	 * @generated
	 */
	void setFareZoneInformation(FareZoneInformationStructure value);

} // ShortTripStopStructure
