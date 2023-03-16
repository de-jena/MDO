/*
 */
package de.jena.mdo.ibis.ibis_customerinformationservice;

import de.jena.mdo.ibis.ibis_common.GeneralResponse;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicle Data Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.VehicleDataResponse#getVehicleData <em>Vehicle Data</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage#getVehicleDataResponse()
 * @model extendedMetaData="name='CustomerInformationService.GetVehicleDataResponse' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface VehicleDataResponse extends GeneralResponse {
	/**
	 * Returns the value of the '<em><b>Vehicle Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle Data</em>' containment reference.
	 * @see #setVehicleData(VehicleData)
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage#getVehicleDataResponse_VehicleData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VehicleData' namespace='##targetNamespace'"
	 * @generated
	 */
	VehicleData getVehicleData();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.VehicleDataResponse#getVehicleData <em>Vehicle Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle Data</em>' containment reference.
	 * @see #getVehicleData()
	 * @generated
	 */
	void setVehicleData(VehicleData value);

} // VehicleDataResponse
