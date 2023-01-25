/*
 */
package de.jena.mdo.ibis.devicemanagementservice;

import de.jena.mdo.ibis.common.GeneralResponseStructure;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Management Service Get Device Status Response Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceStatusResponseStructure#getDeviceManagementServiceGetDeviceStatusResponseData <em>Device Management Service Get Device Status Response Data</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceManagementServiceGetDeviceStatusResponseStructure()
 * @model extendedMetaData="name='DeviceManagementService.GetDeviceStatusResponseStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeviceManagementServiceGetDeviceStatusResponseStructure extends GeneralResponseStructure {
	/**
	 * Returns the value of the '<em><b>Device Management Service Get Device Status Response Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Management Service Get Device Status Response Data</em>' containment reference.
	 * @see #setDeviceManagementServiceGetDeviceStatusResponseData(DeviceManagementServiceGetDeviceStatusResponseDataStructure)
	 * @see de.jena.mdo.ibis.devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceManagementServiceGetDeviceStatusResponseStructure_DeviceManagementServiceGetDeviceStatusResponseData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeviceManagementService.GetDeviceStatusResponseData' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceManagementServiceGetDeviceStatusResponseDataStructure getDeviceManagementServiceGetDeviceStatusResponseData();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceStatusResponseStructure#getDeviceManagementServiceGetDeviceStatusResponseData <em>Device Management Service Get Device Status Response Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Management Service Get Device Status Response Data</em>' containment reference.
	 * @see #getDeviceManagementServiceGetDeviceStatusResponseData()
	 * @generated
	 */
	void setDeviceManagementServiceGetDeviceStatusResponseData(DeviceManagementServiceGetDeviceStatusResponseDataStructure value);

} // DeviceManagementServiceGetDeviceStatusResponseStructure
