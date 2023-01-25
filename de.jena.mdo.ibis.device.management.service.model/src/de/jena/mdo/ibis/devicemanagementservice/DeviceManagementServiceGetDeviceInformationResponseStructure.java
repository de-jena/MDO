/*
 */
package de.jena.mdo.ibis.devicemanagementservice;

import de.jena.mdo.ibis.common.GeneralResponseStructure;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Management Service Get Device Information Response Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceInformationResponseStructure#getDeviceManagementServiceGetDeviceInformationResponseData <em>Device Management Service Get Device Information Response Data</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceManagementServiceGetDeviceInformationResponseStructure()
 * @model extendedMetaData="name='DeviceManagementService.GetDeviceInformationResponseStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeviceManagementServiceGetDeviceInformationResponseStructure extends GeneralResponseStructure {
	/**
	 * Returns the value of the '<em><b>Device Management Service Get Device Information Response Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Management Service Get Device Information Response Data</em>' containment reference.
	 * @see #setDeviceManagementServiceGetDeviceInformationResponseData(DeviceManagementServiceGetDeviceInformationResponseDataStructure)
	 * @see de.jena.mdo.ibis.devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceManagementServiceGetDeviceInformationResponseStructure_DeviceManagementServiceGetDeviceInformationResponseData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeviceManagementService.GetDeviceInformationResponseData' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceManagementServiceGetDeviceInformationResponseDataStructure getDeviceManagementServiceGetDeviceInformationResponseData();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceInformationResponseStructure#getDeviceManagementServiceGetDeviceInformationResponseData <em>Device Management Service Get Device Information Response Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Management Service Get Device Information Response Data</em>' containment reference.
	 * @see #getDeviceManagementServiceGetDeviceInformationResponseData()
	 * @generated
	 */
	void setDeviceManagementServiceGetDeviceInformationResponseData(DeviceManagementServiceGetDeviceInformationResponseDataStructure value);

} // DeviceManagementServiceGetDeviceInformationResponseStructure
