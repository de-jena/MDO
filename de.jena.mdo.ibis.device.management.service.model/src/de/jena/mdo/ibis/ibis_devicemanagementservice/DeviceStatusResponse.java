/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice;

import de.jena.mdo.ibis.ibis_common.GeneralResponse;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Status Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusResponse#getDeviceStatusData <em>Device Status Data</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceStatusResponse()
 * @model extendedMetaData="name='DeviceManagementService.GetDeviceStatusResponseStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeviceStatusResponse extends GeneralResponse {
	/**
	 * Returns the value of the '<em><b>Device Status Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Status Data</em>' containment reference.
	 * @see #setDeviceStatusData(DeviceStatusData)
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceStatusResponse_DeviceStatusData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeviceManagementService.GetDeviceStatusResponseData' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceStatusData getDeviceStatusData();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusResponse#getDeviceStatusData <em>Device Status Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Status Data</em>' containment reference.
	 * @see #getDeviceStatusData()
	 * @generated
	 */
	void setDeviceStatusData(DeviceStatusData value);

} // DeviceStatusResponse
