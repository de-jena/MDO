/*
 */
package de.jena.mdo.ibis.devicemanagementservice;

import de.jena.mdo.ibis.common.IBISIPDateTime;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Management Service Get All Subdevice Status Information Response Data Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure#getSubdeviceStatusInformationList <em>Subdevice Status Information List</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage#getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure()
 * @model extendedMetaData="name='DeviceManagementService.GetAllSubdeviceStatusInformationResponseDataStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' containment reference.
	 * @see #setTimeStamp(IBISIPDateTime)
	 * @see de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage#getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure_TimeStamp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TimeStamp' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDateTime getTimeStamp();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure#getTimeStamp <em>Time Stamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' containment reference.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(IBISIPDateTime value);

	/**
	 * Returns the value of the '<em><b>Subdevice Status Information List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subdevice Status Information List</em>' containment reference.
	 * @see #setSubdeviceStatusInformationList(SubdeviceStatusInformationStructure)
	 * @see de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage#getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure_SubdeviceStatusInformationList()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SubdeviceStatusInformationList' namespace='##targetNamespace'"
	 * @generated
	 */
	SubdeviceStatusInformationStructure getSubdeviceStatusInformationList();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure#getSubdeviceStatusInformationList <em>Subdevice Status Information List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subdevice Status Information List</em>' containment reference.
	 * @see #getSubdeviceStatusInformationList()
	 * @generated
	 */
	void setSubdeviceStatusInformationList(SubdeviceStatusInformationStructure value);

} // DeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure
