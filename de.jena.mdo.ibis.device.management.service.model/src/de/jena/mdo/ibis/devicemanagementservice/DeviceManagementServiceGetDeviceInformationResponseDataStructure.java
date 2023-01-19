/*
 */
package de.jena.mdo.ibis.devicemanagementservice;

import de.jena.mdo.ibis.common.DeviceInformationStructure;
import de.jena.mdo.ibis.common.IBISIPDateTime;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Management Service Get Device Information Response Data Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceInformationResponseDataStructure#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceInformationResponseDataStructure#getDeviceInformation <em>Device Information</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage#getDeviceManagementServiceGetDeviceInformationResponseDataStructure()
 * @model extendedMetaData="name='DeviceManagementService.GetDeviceInformationResponseDataStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeviceManagementServiceGetDeviceInformationResponseDataStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' containment reference.
	 * @see #setTimeStamp(IBISIPDateTime)
	 * @see de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage#getDeviceManagementServiceGetDeviceInformationResponseDataStructure_TimeStamp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TimeStamp' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDateTime getTimeStamp();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceInformationResponseDataStructure#getTimeStamp <em>Time Stamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' containment reference.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(IBISIPDateTime value);

	/**
	 * Returns the value of the '<em><b>Device Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Information</em>' containment reference.
	 * @see #setDeviceInformation(DeviceInformationStructure)
	 * @see de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage#getDeviceManagementServiceGetDeviceInformationResponseDataStructure_DeviceInformation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DeviceInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceInformationStructure getDeviceInformation();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceInformationResponseDataStructure#getDeviceInformation <em>Device Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Information</em>' containment reference.
	 * @see #getDeviceInformation()
	 * @generated
	 */
	void setDeviceInformation(DeviceInformationStructure value);

} // DeviceManagementServiceGetDeviceInformationResponseDataStructure
