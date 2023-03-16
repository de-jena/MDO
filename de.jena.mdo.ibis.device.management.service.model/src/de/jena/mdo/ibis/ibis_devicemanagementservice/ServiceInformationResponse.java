/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice;

import de.jena.mdo.ibis.ibis_common.GeneralResponse;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Information Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceInformationResponse#getServiceInformationData <em>Service Information Data</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getServiceInformationResponse()
 * @model extendedMetaData="name='DeviceManagementService.GetServiceInformationResponseStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ServiceInformationResponse extends GeneralResponse {
	/**
	 * Returns the value of the '<em><b>Service Information Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Information Data</em>' containment reference.
	 * @see #setServiceInformationData(ServiceInformationData)
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getServiceInformationResponse_ServiceInformationData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeviceManagementService.GetServiceInformationResponseData' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceInformationData getServiceInformationData();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceInformationResponse#getServiceInformationData <em>Service Information Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Information Data</em>' containment reference.
	 * @see #getServiceInformationData()
	 * @generated
	 */
	void setServiceInformationData(ServiceInformationData value);

} // ServiceInformationResponse
