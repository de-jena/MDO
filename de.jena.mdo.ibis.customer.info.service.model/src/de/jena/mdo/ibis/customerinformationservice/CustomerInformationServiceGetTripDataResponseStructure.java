/*
 */
package de.jena.mdo.ibis.customerinformationservice;

import de.jena.mdo.ibis.common.GeneralResponseStructure;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer Information Service Get Trip Data Response Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetTripDataResponseStructure#getTripData <em>Trip Data</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.customerinformationservice.IbisCustomerInformationServicePackage#getCustomerInformationServiceGetTripDataResponseStructure()
 * @model extendedMetaData="name='CustomerInformationService.GetTripDataResponseStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CustomerInformationServiceGetTripDataResponseStructure extends GeneralResponseStructure {
	/**
	 * Returns the value of the '<em><b>Trip Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trip Data</em>' containment reference.
	 * @see #setTripData(CustomerInformationServiceTripData)
	 * @see de.jena.mdo.ibis.customerinformationservice.IbisCustomerInformationServicePackage#getCustomerInformationServiceGetTripDataResponseStructure_TripData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TripData' namespace='##targetNamespace'"
	 * @generated
	 */
	CustomerInformationServiceTripData getTripData();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetTripDataResponseStructure#getTripData <em>Trip Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trip Data</em>' containment reference.
	 * @see #getTripData()
	 * @generated
	 */
	void setTripData(CustomerInformationServiceTripData value);

} // CustomerInformationServiceGetTripDataResponseStructure
