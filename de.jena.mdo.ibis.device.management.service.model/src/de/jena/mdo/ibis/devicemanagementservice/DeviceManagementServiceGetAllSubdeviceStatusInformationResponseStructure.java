/*
 */
package de.jena.mdo.ibis.devicemanagementservice;

import de.jena.mdo.ibis.common.GeneralResponseStructure;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Management Service Get All Subdevice Status Information Response Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure#getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseData <em>Device Management Service Get All Subdevice Status Information Response Data</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure()
 * @model extendedMetaData="name='DeviceManagementService.GetAllSubdeviceStatusInformationResponseStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure extends GeneralResponseStructure {
	/**
	 * Returns the value of the '<em><b>Device Management Service Get All Subdevice Status Information Response Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Management Service Get All Subdevice Status Information Response Data</em>' containment reference.
	 * @see #setDeviceManagementServiceGetAllSubdeviceStatusInformationResponseData(DeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure)
	 * @see de.jena.mdo.ibis.devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure_DeviceManagementServiceGetAllSubdeviceStatusInformationResponseData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeviceManagementService.GetAllSubdeviceStatusInformationResponseData' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseData();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure#getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseData <em>Device Management Service Get All Subdevice Status Information Response Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Management Service Get All Subdevice Status Information Response Data</em>' containment reference.
	 * @see #getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseData()
	 * @generated
	 */
	void setDeviceManagementServiceGetAllSubdeviceStatusInformationResponseData(DeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure value);

} // DeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure
