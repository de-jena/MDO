/*
 */
package de.jena.mdo.ibis.devicemanagementservice;

import de.jena.mdo.ibis.common.IBISIPString;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Management Service Get All Subdevice Error Messages Response Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure#getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseData <em>Device Management Service Get All Subdevice Error Messages Response Data</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure#getOperationErrorMessage <em>Operation Error Message</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage#getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure()
 * @model extendedMetaData="name='DeviceManagementService.GetAllSubdeviceErrorMessagesResponseStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Device Management Service Get All Subdevice Error Messages Response Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Management Service Get All Subdevice Error Messages Response Data</em>' containment reference.
	 * @see #setDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseData(DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure)
	 * @see de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage#getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure_DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeviceManagementService.GetAllSubdeviceErrorMessagesResponseData' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseData();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure#getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseData <em>Device Management Service Get All Subdevice Error Messages Response Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Management Service Get All Subdevice Error Messages Response Data</em>' containment reference.
	 * @see #getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseData()
	 * @generated
	 */
	void setDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseData(DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure value);

	/**
	 * Returns the value of the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Error Message</em>' containment reference.
	 * @see #setOperationErrorMessage(IBISIPString)
	 * @see de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage#getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure_OperationErrorMessage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OperationErrorMessage' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPString getOperationErrorMessage();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure#getOperationErrorMessage <em>Operation Error Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Error Message</em>' containment reference.
	 * @see #getOperationErrorMessage()
	 * @generated
	 */
	void setOperationErrorMessage(IBISIPString value);

} // DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure
