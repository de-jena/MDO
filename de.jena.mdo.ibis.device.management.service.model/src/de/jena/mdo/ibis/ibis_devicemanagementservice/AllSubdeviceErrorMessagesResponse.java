/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice;

import de.jena.mdo.ibis.ibis_common.GeneralResponse;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>All Subdevice Error Messages Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceErrorMessagesResponse#getAllSubdeviceErrorMessagesData <em>All Subdevice Error Messages Data</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getAllSubdeviceErrorMessagesResponse()
 * @model extendedMetaData="name='DeviceManagementService.GetAllSubdeviceErrorMessagesResponseStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AllSubdeviceErrorMessagesResponse extends GeneralResponse {
	/**
	 * Returns the value of the '<em><b>All Subdevice Error Messages Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Subdevice Error Messages Data</em>' containment reference.
	 * @see #setAllSubdeviceErrorMessagesData(AllSubdeviceErrorMessagesData)
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getAllSubdeviceErrorMessagesResponse_AllSubdeviceErrorMessagesData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeviceManagementService.GetAllSubdeviceErrorMessagesResponseData' namespace='##targetNamespace'"
	 * @generated
	 */
	AllSubdeviceErrorMessagesData getAllSubdeviceErrorMessagesData();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceErrorMessagesResponse#getAllSubdeviceErrorMessagesData <em>All Subdevice Error Messages Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Subdevice Error Messages Data</em>' containment reference.
	 * @see #getAllSubdeviceErrorMessagesData()
	 * @generated
	 */
	void setAllSubdeviceErrorMessagesData(AllSubdeviceErrorMessagesData value);

} // AllSubdeviceErrorMessagesResponse
