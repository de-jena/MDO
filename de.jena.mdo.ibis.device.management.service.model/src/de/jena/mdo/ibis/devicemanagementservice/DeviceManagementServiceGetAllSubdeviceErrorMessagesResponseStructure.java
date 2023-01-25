/*
 */
package de.jena.mdo.ibis.devicemanagementservice;

import de.jena.mdo.ibis.common.GeneralResponseStructure;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Management Service Get All Subdevice Error Messages Response Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure#getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseData <em>Device Management Service Get All Subdevice Error Messages Response Data</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure()
 * @model extendedMetaData="name='DeviceManagementService.GetAllSubdeviceErrorMessagesResponseStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure extends GeneralResponseStructure {
	/**
	 * Returns the value of the '<em><b>Device Management Service Get All Subdevice Error Messages Response Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Management Service Get All Subdevice Error Messages Response Data</em>' containment reference.
	 * @see #setDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseData(DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure)
	 * @see de.jena.mdo.ibis.devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure_DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeviceManagementService.GetAllSubdeviceErrorMessagesResponseData' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseData();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure#getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseData <em>Device Management Service Get All Subdevice Error Messages Response Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Management Service Get All Subdevice Error Messages Response Data</em>' containment reference.
	 * @see #getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseData()
	 * @generated
	 */
	void setDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseData(DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure value);

} // DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure
