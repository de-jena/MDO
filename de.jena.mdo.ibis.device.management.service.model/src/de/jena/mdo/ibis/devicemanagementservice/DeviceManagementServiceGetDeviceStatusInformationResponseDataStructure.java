/*
 */
package de.jena.mdo.ibis.devicemanagementservice;

import de.jena.mdo.ibis.common.IBISIPDateTime;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Management Service Get Device Status Information Response Data Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceStatusInformationResponseDataStructure#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceStatusInformationResponseDataStructure#getDeviceStatusInformation <em>Device Status Information</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage#getDeviceManagementServiceGetDeviceStatusInformationResponseDataStructure()
 * @model extendedMetaData="name='DeviceManagementService.GetDeviceStatusInformationResponseDataStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeviceManagementServiceGetDeviceStatusInformationResponseDataStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' containment reference.
	 * @see #setTimeStamp(IBISIPDateTime)
	 * @see de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage#getDeviceManagementServiceGetDeviceStatusInformationResponseDataStructure_TimeStamp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TimeStamp' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDateTime getTimeStamp();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceStatusInformationResponseDataStructure#getTimeStamp <em>Time Stamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' containment reference.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(IBISIPDateTime value);

	/**
	 * Returns the value of the '<em><b>Device Status Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Status Information</em>' containment reference.
	 * @see #setDeviceStatusInformation(DeviceStatusInformationStructure)
	 * @see de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage#getDeviceManagementServiceGetDeviceStatusInformationResponseDataStructure_DeviceStatusInformation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DeviceStatusInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceStatusInformationStructure getDeviceStatusInformation();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceStatusInformationResponseDataStructure#getDeviceStatusInformation <em>Device Status Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Status Information</em>' containment reference.
	 * @see #getDeviceStatusInformation()
	 * @generated
	 */
	void setDeviceStatusInformation(DeviceStatusInformationStructure value);

} // DeviceManagementServiceGetDeviceStatusInformationResponseDataStructure
