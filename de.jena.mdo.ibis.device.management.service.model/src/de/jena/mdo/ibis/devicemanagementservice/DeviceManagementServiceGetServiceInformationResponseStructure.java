/*
 */
package de.jena.mdo.ibis.devicemanagementservice;

import de.jena.mdo.ibis.common.GeneralResponseStructure;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Management Service Get Service Information Response Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetServiceInformationResponseStructure#getDeviceManagementServiceGetServiceInformationResponseData <em>Device Management Service Get Service Information Response Data</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceManagementServiceGetServiceInformationResponseStructure()
 * @model extendedMetaData="name='DeviceManagementService.GetServiceInformationResponseStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeviceManagementServiceGetServiceInformationResponseStructure extends GeneralResponseStructure {
	/**
	 * Returns the value of the '<em><b>Device Management Service Get Service Information Response Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Management Service Get Service Information Response Data</em>' containment reference.
	 * @see #setDeviceManagementServiceGetServiceInformationResponseData(DeviceManagementServiceGetServiceInformationResponseDataStructure)
	 * @see de.jena.mdo.ibis.devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceManagementServiceGetServiceInformationResponseStructure_DeviceManagementServiceGetServiceInformationResponseData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeviceManagementService.GetServiceInformationResponseData' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceManagementServiceGetServiceInformationResponseDataStructure getDeviceManagementServiceGetServiceInformationResponseData();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetServiceInformationResponseStructure#getDeviceManagementServiceGetServiceInformationResponseData <em>Device Management Service Get Service Information Response Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Management Service Get Service Information Response Data</em>' containment reference.
	 * @see #getDeviceManagementServiceGetServiceInformationResponseData()
	 * @generated
	 */
	void setDeviceManagementServiceGetServiceInformationResponseData(DeviceManagementServiceGetServiceInformationResponseDataStructure value);

} // DeviceManagementServiceGetServiceInformationResponseStructure
