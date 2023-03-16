/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice;

import de.jena.mdo.ibis.ibis_common.GeneralResponse;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Status Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceStatusResponse#getServiceStatusData <em>Service Status Data</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getServiceStatusResponse()
 * @model extendedMetaData="name='DeviceManagementService.GetServiceStatusResponseStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ServiceStatusResponse extends GeneralResponse {
	/**
	 * Returns the value of the '<em><b>Service Status Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Status Data</em>' containment reference.
	 * @see #setServiceStatusData(ServiceStatusData)
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getServiceStatusResponse_ServiceStatusData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeviceManagementService.GetServiceStatusResponseData' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceStatusData getServiceStatusData();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceStatusResponse#getServiceStatusData <em>Service Status Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Status Data</em>' containment reference.
	 * @see #getServiceStatusData()
	 * @generated
	 */
	void setServiceStatusData(ServiceStatusData value);

} // ServiceStatusResponse
