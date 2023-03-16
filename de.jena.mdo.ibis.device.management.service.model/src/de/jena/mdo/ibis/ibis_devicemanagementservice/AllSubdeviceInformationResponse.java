/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice;

import de.jena.mdo.ibis.ibis_common.GeneralResponse;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>All Subdevice Information Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceInformationResponse#getAllSubdeviceInformationData <em>All Subdevice Information Data</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getAllSubdeviceInformationResponse()
 * @model extendedMetaData="name='DeviceManagementService.GetAllSubdeviceInformationResponseStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AllSubdeviceInformationResponse extends GeneralResponse {
	/**
	 * Returns the value of the '<em><b>All Subdevice Information Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Subdevice Information Data</em>' containment reference.
	 * @see #setAllSubdeviceInformationData(AllSubdeviceInformationData)
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getAllSubdeviceInformationResponse_AllSubdeviceInformationData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeviceManagementService.GetAllSubdeviceInformationResponseData' namespace='##targetNamespace'"
	 * @generated
	 */
	AllSubdeviceInformationData getAllSubdeviceInformationData();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceInformationResponse#getAllSubdeviceInformationData <em>All Subdevice Information Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Subdevice Information Data</em>' containment reference.
	 * @see #getAllSubdeviceInformationData()
	 * @generated
	 */
	void setAllSubdeviceInformationData(AllSubdeviceInformationData value);

} // AllSubdeviceInformationResponse
