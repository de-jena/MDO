/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice;

import de.jena.mdo.ibis.ibis_common.GeneralResponse;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Configuration Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceConfigurationResponse#getDeviceConfigurationData <em>Device Configuration Data</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceConfigurationResponse()
 * @model extendedMetaData="name='DeviceManagementService.GetDeviceConfigurationResponseStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeviceConfigurationResponse extends GeneralResponse {
	/**
	 * Returns the value of the '<em><b>Device Configuration Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Configuration Data</em>' containment reference.
	 * @see #setDeviceConfigurationData(DeviceConfigurationData)
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceConfigurationResponse_DeviceConfigurationData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeviceManagementService.GetDeviceConfigurationResponseData' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceConfigurationData getDeviceConfigurationData();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceConfigurationResponse#getDeviceConfigurationData <em>Device Configuration Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Configuration Data</em>' containment reference.
	 * @see #getDeviceConfigurationData()
	 * @generated
	 */
	void setDeviceConfigurationData(DeviceConfigurationData value);

} // DeviceConfigurationResponse
