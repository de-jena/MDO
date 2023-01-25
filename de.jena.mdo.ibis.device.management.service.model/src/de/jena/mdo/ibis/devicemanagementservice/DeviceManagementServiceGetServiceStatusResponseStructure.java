/*
 */
package de.jena.mdo.ibis.devicemanagementservice;

import de.jena.mdo.ibis.common.GeneralResponseStructure;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Management Service Get Service Status Response Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetServiceStatusResponseStructure#getDeviceManagementServiceGetServiceStatusResponseData <em>Device Management Service Get Service Status Response Data</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceManagementServiceGetServiceStatusResponseStructure()
 * @model extendedMetaData="name='DeviceManagementService.GetServiceStatusResponseStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeviceManagementServiceGetServiceStatusResponseStructure extends GeneralResponseStructure {
	/**
	 * Returns the value of the '<em><b>Device Management Service Get Service Status Response Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Management Service Get Service Status Response Data</em>' containment reference.
	 * @see #setDeviceManagementServiceGetServiceStatusResponseData(DeviceManagementServiceGetServiceStatusResponseDataStructure)
	 * @see de.jena.mdo.ibis.devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceManagementServiceGetServiceStatusResponseStructure_DeviceManagementServiceGetServiceStatusResponseData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeviceManagementService.GetServiceStatusResponseData' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceManagementServiceGetServiceStatusResponseDataStructure getDeviceManagementServiceGetServiceStatusResponseData();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetServiceStatusResponseStructure#getDeviceManagementServiceGetServiceStatusResponseData <em>Device Management Service Get Service Status Response Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Management Service Get Service Status Response Data</em>' containment reference.
	 * @see #getDeviceManagementServiceGetServiceStatusResponseData()
	 * @generated
	 */
	void setDeviceManagementServiceGetServiceStatusResponseData(DeviceManagementServiceGetServiceStatusResponseDataStructure value);

} // DeviceManagementServiceGetServiceStatusResponseStructure
