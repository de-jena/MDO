/*
 */
package de.jena.mdo.ibis.devicemanagementservice;

import de.jena.mdo.ibis.common.IBISIPString;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Management Service Get All Subdevice Information Response Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceInformationResponseStructure#getDeviceManagementServiceGetAllSubdeviceInformationResponseData <em>Device Management Service Get All Subdevice Information Response Data</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceInformationResponseStructure#getOperationErrorMessage <em>Operation Error Message</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage#getDeviceManagementServiceGetAllSubdeviceInformationResponseStructure()
 * @model extendedMetaData="name='DeviceManagementService.GetAllSubdeviceInformationResponseStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeviceManagementServiceGetAllSubdeviceInformationResponseStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Device Management Service Get All Subdevice Information Response Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Management Service Get All Subdevice Information Response Data</em>' containment reference.
	 * @see #setDeviceManagementServiceGetAllSubdeviceInformationResponseData(DeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure)
	 * @see de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage#getDeviceManagementServiceGetAllSubdeviceInformationResponseStructure_DeviceManagementServiceGetAllSubdeviceInformationResponseData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeviceManagementService.GetAllSubdeviceInformationResponseData' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure getDeviceManagementServiceGetAllSubdeviceInformationResponseData();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceInformationResponseStructure#getDeviceManagementServiceGetAllSubdeviceInformationResponseData <em>Device Management Service Get All Subdevice Information Response Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Management Service Get All Subdevice Information Response Data</em>' containment reference.
	 * @see #getDeviceManagementServiceGetAllSubdeviceInformationResponseData()
	 * @generated
	 */
	void setDeviceManagementServiceGetAllSubdeviceInformationResponseData(DeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure value);

	/**
	 * Returns the value of the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Error Message</em>' containment reference.
	 * @see #setOperationErrorMessage(IBISIPString)
	 * @see de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage#getDeviceManagementServiceGetAllSubdeviceInformationResponseStructure_OperationErrorMessage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OperationErrorMessage' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPString getOperationErrorMessage();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceInformationResponseStructure#getOperationErrorMessage <em>Operation Error Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Error Message</em>' containment reference.
	 * @see #getOperationErrorMessage()
	 * @generated
	 */
	void setOperationErrorMessage(IBISIPString value);

} // DeviceManagementServiceGetAllSubdeviceInformationResponseStructure