/*
 */
package de.jena.mdo.ibis.devicemanagementservice;

import de.jena.mdo.ibis.common.IBISIPString;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Management Service Get Device Error Messages Response Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceErrorMessagesResponseStructure#getDeviceManagementServiceGetDeviceErrorMessagesResponseData <em>Device Management Service Get Device Error Messages Response Data</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceErrorMessagesResponseStructure#getOperationErrorMessage <em>Operation Error Message</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage#getDeviceManagementServiceGetDeviceErrorMessagesResponseStructure()
 * @model extendedMetaData="name='DeviceManagementService.GetDeviceErrorMessagesResponseStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeviceManagementServiceGetDeviceErrorMessagesResponseStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Device Management Service Get Device Error Messages Response Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Management Service Get Device Error Messages Response Data</em>' containment reference.
	 * @see #setDeviceManagementServiceGetDeviceErrorMessagesResponseData(DeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure)
	 * @see de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage#getDeviceManagementServiceGetDeviceErrorMessagesResponseStructure_DeviceManagementServiceGetDeviceErrorMessagesResponseData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeviceManagementService.GetDeviceErrorMessagesResponseData' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure getDeviceManagementServiceGetDeviceErrorMessagesResponseData();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceErrorMessagesResponseStructure#getDeviceManagementServiceGetDeviceErrorMessagesResponseData <em>Device Management Service Get Device Error Messages Response Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Management Service Get Device Error Messages Response Data</em>' containment reference.
	 * @see #getDeviceManagementServiceGetDeviceErrorMessagesResponseData()
	 * @generated
	 */
	void setDeviceManagementServiceGetDeviceErrorMessagesResponseData(DeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure value);

	/**
	 * Returns the value of the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Error Message</em>' containment reference.
	 * @see #setOperationErrorMessage(IBISIPString)
	 * @see de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage#getDeviceManagementServiceGetDeviceErrorMessagesResponseStructure_OperationErrorMessage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OperationErrorMessage' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPString getOperationErrorMessage();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceErrorMessagesResponseStructure#getOperationErrorMessage <em>Operation Error Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Error Message</em>' containment reference.
	 * @see #getOperationErrorMessage()
	 * @generated
	 */
	void setOperationErrorMessage(IBISIPString value);

} // DeviceManagementServiceGetDeviceErrorMessagesResponseStructure
