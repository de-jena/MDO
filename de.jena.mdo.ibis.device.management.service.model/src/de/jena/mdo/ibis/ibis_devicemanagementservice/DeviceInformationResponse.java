/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice;

import de.jena.mdo.ibis.ibis_common.GeneralResponse;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Information Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceInformationResponse#getDeviceInformationData <em>Device Information Data</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceInformationResponse()
 * @model extendedMetaData="name='DeviceManagementService.GetDeviceInformationResponseStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeviceInformationResponse extends GeneralResponse {
	/**
	 * Returns the value of the '<em><b>Device Information Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Information Data</em>' containment reference.
	 * @see #setDeviceInformationData(DeviceInformationData)
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceInformationResponse_DeviceInformationData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeviceManagementService.GetDeviceInformationResponseData' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceInformationData getDeviceInformationData();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceInformationResponse#getDeviceInformationData <em>Device Information Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Information Data</em>' containment reference.
	 * @see #getDeviceInformationData()
	 * @generated
	 */
	void setDeviceInformationData(DeviceInformationData value);

} // DeviceInformationResponse
