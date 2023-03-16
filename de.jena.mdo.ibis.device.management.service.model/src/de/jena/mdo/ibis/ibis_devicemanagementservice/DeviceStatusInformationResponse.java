/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice;

import de.jena.mdo.ibis.ibis_common.GeneralResponse;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Status Information Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusInformationResponse#getDeviceStatusInformationData <em>Device Status Information Data</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceStatusInformationResponse()
 * @model extendedMetaData="name='DeviceManagementService.GetDeviceStatusInformationResponseStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeviceStatusInformationResponse extends GeneralResponse {
	/**
	 * Returns the value of the '<em><b>Device Status Information Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Status Information Data</em>' containment reference.
	 * @see #setDeviceStatusInformationData(DeviceStatusInformationData)
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceStatusInformationResponse_DeviceStatusInformationData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeviceManagementService.GetDeviceStatusInformationResponseData' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceStatusInformationData getDeviceStatusInformationData();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusInformationResponse#getDeviceStatusInformationData <em>Device Status Information Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Status Information Data</em>' containment reference.
	 * @see #getDeviceStatusInformationData()
	 * @generated
	 */
	void setDeviceStatusInformationData(DeviceStatusInformationData value);

} // DeviceStatusInformationResponse
