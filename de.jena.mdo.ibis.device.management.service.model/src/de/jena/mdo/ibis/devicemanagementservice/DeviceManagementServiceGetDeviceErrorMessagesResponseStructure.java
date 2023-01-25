/*
 */
package de.jena.mdo.ibis.devicemanagementservice;

import de.jena.mdo.ibis.common.GeneralResponseStructure;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Management Service Get Device Error Messages Response Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceErrorMessagesResponseStructure#getDeviceManagementServiceGetDeviceErrorMessagesResponseData <em>Device Management Service Get Device Error Messages Response Data</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceManagementServiceGetDeviceErrorMessagesResponseStructure()
 * @model extendedMetaData="name='DeviceManagementService.GetDeviceErrorMessagesResponseStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeviceManagementServiceGetDeviceErrorMessagesResponseStructure extends GeneralResponseStructure {
	/**
	 * Returns the value of the '<em><b>Device Management Service Get Device Error Messages Response Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Management Service Get Device Error Messages Response Data</em>' containment reference.
	 * @see #setDeviceManagementServiceGetDeviceErrorMessagesResponseData(DeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure)
	 * @see de.jena.mdo.ibis.devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceManagementServiceGetDeviceErrorMessagesResponseStructure_DeviceManagementServiceGetDeviceErrorMessagesResponseData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeviceManagementService.GetDeviceErrorMessagesResponseData' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure getDeviceManagementServiceGetDeviceErrorMessagesResponseData();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceErrorMessagesResponseStructure#getDeviceManagementServiceGetDeviceErrorMessagesResponseData <em>Device Management Service Get Device Error Messages Response Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Management Service Get Device Error Messages Response Data</em>' containment reference.
	 * @see #getDeviceManagementServiceGetDeviceErrorMessagesResponseData()
	 * @generated
	 */
	void setDeviceManagementServiceGetDeviceErrorMessagesResponseData(DeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure value);

} // DeviceManagementServiceGetDeviceErrorMessagesResponseStructure
