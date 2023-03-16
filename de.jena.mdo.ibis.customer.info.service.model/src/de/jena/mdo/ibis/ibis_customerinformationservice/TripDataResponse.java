/*
 */
package de.jena.mdo.ibis.ibis_customerinformationservice;

import de.jena.mdo.ibis.ibis_common.GeneralResponse;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trip Data Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.TripDataResponse#getTripData <em>Trip Data</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage#getTripDataResponse()
 * @model extendedMetaData="name='CustomerInformationService.GetTripDataResponse' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TripDataResponse extends GeneralResponse {
	/**
	 * Returns the value of the '<em><b>Trip Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trip Data</em>' containment reference.
	 * @see #setTripData(TripData)
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage#getTripDataResponse_TripData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TripData' namespace='##targetNamespace'"
	 * @generated
	 */
	TripData getTripData();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.TripDataResponse#getTripData <em>Trip Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trip Data</em>' containment reference.
	 * @see #getTripData()
	 * @generated
	 */
	void setTripData(TripData value);

} // TripDataResponse
