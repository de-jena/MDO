/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice;

import de.jena.mdo.ibis.ibis_common.GeneralResponse;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Error Messages Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceErrorMessagesResponse#getDeviceErrorMessagesData <em>Device Error Messages Data</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceErrorMessagesResponse()
 * @model extendedMetaData="name='DeviceManagementService.GetDeviceErrorMessagesResponseStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeviceErrorMessagesResponse extends GeneralResponse {
	/**
	 * Returns the value of the '<em><b>Device Error Messages Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Error Messages Data</em>' containment reference.
	 * @see #setDeviceErrorMessagesData(DeviceErrorMessagesData)
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceErrorMessagesResponse_DeviceErrorMessagesData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeviceManagementService.GetDeviceErrorMessagesResponseData' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceErrorMessagesData getDeviceErrorMessagesData();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceErrorMessagesResponse#getDeviceErrorMessagesData <em>Device Error Messages Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Error Messages Data</em>' containment reference.
	 * @see #getDeviceErrorMessagesData()
	 * @generated
	 */
	void setDeviceErrorMessagesData(DeviceErrorMessagesData value);

} // DeviceErrorMessagesResponse
