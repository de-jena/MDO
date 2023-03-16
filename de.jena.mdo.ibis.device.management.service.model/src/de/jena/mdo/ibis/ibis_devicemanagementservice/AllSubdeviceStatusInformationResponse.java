/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice;

import de.jena.mdo.ibis.ibis_common.GeneralResponse;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>All Subdevice Status Information Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceStatusInformationResponse#getAllSubdeviceStatusInformationData <em>All Subdevice Status Information Data</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getAllSubdeviceStatusInformationResponse()
 * @model extendedMetaData="name='DeviceManagementService.GetAllSubdeviceStatusInformationResponseStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AllSubdeviceStatusInformationResponse extends GeneralResponse {
	/**
	 * Returns the value of the '<em><b>All Subdevice Status Information Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Subdevice Status Information Data</em>' containment reference.
	 * @see #setAllSubdeviceStatusInformationData(AllSubdeviceStatusInformationData)
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getAllSubdeviceStatusInformationResponse_AllSubdeviceStatusInformationData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeviceManagementService.GetAllSubdeviceStatusInformationResponseData' namespace='##targetNamespace'"
	 * @generated
	 */
	AllSubdeviceStatusInformationData getAllSubdeviceStatusInformationData();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceStatusInformationResponse#getAllSubdeviceStatusInformationData <em>All Subdevice Status Information Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Subdevice Status Information Data</em>' containment reference.
	 * @see #getAllSubdeviceStatusInformationData()
	 * @generated
	 */
	void setAllSubdeviceStatusInformationData(AllSubdeviceStatusInformationData value);

} // AllSubdeviceStatusInformationResponse
