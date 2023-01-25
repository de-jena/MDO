/*
 */
package de.jena.mdo.ibis.devicemanagementservice;

import de.jena.mdo.ibis.common.GeneralResponseStructure;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Management Service Get Device Status Information Response Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceStatusInformationResponseStructure#getDeviceManagementServiceGetDeviceStatusInformationResponseData <em>Device Management Service Get Device Status Information Response Data</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceManagementServiceGetDeviceStatusInformationResponseStructure()
 * @model extendedMetaData="name='DeviceManagementService.GetDeviceStatusInformationResponseStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeviceManagementServiceGetDeviceStatusInformationResponseStructure extends GeneralResponseStructure {
	/**
	 * Returns the value of the '<em><b>Device Management Service Get Device Status Information Response Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Management Service Get Device Status Information Response Data</em>' containment reference.
	 * @see #setDeviceManagementServiceGetDeviceStatusInformationResponseData(DeviceManagementServiceGetDeviceStatusInformationResponseDataStructure)
	 * @see de.jena.mdo.ibis.devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceManagementServiceGetDeviceStatusInformationResponseStructure_DeviceManagementServiceGetDeviceStatusInformationResponseData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeviceManagementService.GetDeviceStatusInformationResponseData' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceManagementServiceGetDeviceStatusInformationResponseDataStructure getDeviceManagementServiceGetDeviceStatusInformationResponseData();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceStatusInformationResponseStructure#getDeviceManagementServiceGetDeviceStatusInformationResponseData <em>Device Management Service Get Device Status Information Response Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Management Service Get Device Status Information Response Data</em>' containment reference.
	 * @see #getDeviceManagementServiceGetDeviceStatusInformationResponseData()
	 * @generated
	 */
	void setDeviceManagementServiceGetDeviceStatusInformationResponseData(DeviceManagementServiceGetDeviceStatusInformationResponseDataStructure value);

} // DeviceManagementServiceGetDeviceStatusInformationResponseStructure
