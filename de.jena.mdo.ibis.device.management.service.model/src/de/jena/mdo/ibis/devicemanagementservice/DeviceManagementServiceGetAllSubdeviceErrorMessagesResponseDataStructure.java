/*
 */
package de.jena.mdo.ibis.devicemanagementservice;

import de.jena.mdo.ibis.common.IBISIPDateTime;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Management Service Get All Subdevice Error Messages Response Data Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure#getSubdeviceErrorMessagesList <em>Subdevice Error Messages List</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage#getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure()
 * @model extendedMetaData="name='DeviceManagementService.GetAllSubdeviceErrorMessagesResponseDataStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' containment reference.
	 * @see #setTimeStamp(IBISIPDateTime)
	 * @see de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage#getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure_TimeStamp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TimeStamp' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDateTime getTimeStamp();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure#getTimeStamp <em>Time Stamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' containment reference.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(IBISIPDateTime value);

	/**
	 * Returns the value of the '<em><b>Subdevice Error Messages List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subdevice Error Messages List</em>' containment reference.
	 * @see #setSubdeviceErrorMessagesList(SubdeviceErrorMessagesStructure)
	 * @see de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage#getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure_SubdeviceErrorMessagesList()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SubdeviceErrorMessagesList' namespace='##targetNamespace'"
	 * @generated
	 */
	SubdeviceErrorMessagesStructure getSubdeviceErrorMessagesList();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure#getSubdeviceErrorMessagesList <em>Subdevice Error Messages List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subdevice Error Messages List</em>' containment reference.
	 * @see #getSubdeviceErrorMessagesList()
	 * @generated
	 */
	void setSubdeviceErrorMessagesList(SubdeviceErrorMessagesStructure value);

} // DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure
