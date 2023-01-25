/*
 */
package de.jena.mdo.ibis.customerinformationservice;

import de.jena.mdo.ibis.common.GeneralResponseStructure;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer Information Service Get Vehicle Data Response Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetVehicleDataResponseStructure#getVehicleData <em>Vehicle Data</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.customerinformationservice.IbisCustomerInformationServicePackage#getCustomerInformationServiceGetVehicleDataResponseStructure()
 * @model extendedMetaData="name='CustomerInformationService.GetVehicleDataResponseStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CustomerInformationServiceGetVehicleDataResponseStructure extends GeneralResponseStructure {
	/**
	 * Returns the value of the '<em><b>Vehicle Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle Data</em>' containment reference.
	 * @see #setVehicleData(CustomerInformationServiceVehicleData)
	 * @see de.jena.mdo.ibis.customerinformationservice.IbisCustomerInformationServicePackage#getCustomerInformationServiceGetVehicleDataResponseStructure_VehicleData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VehicleData' namespace='##targetNamespace'"
	 * @generated
	 */
	CustomerInformationServiceVehicleData getVehicleData();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetVehicleDataResponseStructure#getVehicleData <em>Vehicle Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle Data</em>' containment reference.
	 * @see #getVehicleData()
	 * @generated
	 */
	void setVehicleData(CustomerInformationServiceVehicleData value);

} // CustomerInformationServiceGetVehicleDataResponseStructure
