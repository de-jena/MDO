/*
 */
package de.jena.mdo.ibis.devicemanagementservice;

import de.jena.mdo.ibis.common.IBISIPDateTime;
import de.jena.mdo.ibis.common.ServiceSpecificationWithStateListStructure;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Management Service Get Service Status Response Data Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetServiceStatusResponseDataStructure#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetServiceStatusResponseDataStructure#getServiceSpecificationWithStateList <em>Service Specification With State List</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage#getDeviceManagementServiceGetServiceStatusResponseDataStructure()
 * @model extendedMetaData="name='DeviceManagementService.GetServiceStatusResponseDataStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeviceManagementServiceGetServiceStatusResponseDataStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' containment reference.
	 * @see #setTimeStamp(IBISIPDateTime)
	 * @see de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage#getDeviceManagementServiceGetServiceStatusResponseDataStructure_TimeStamp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TimeStamp' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDateTime getTimeStamp();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetServiceStatusResponseDataStructure#getTimeStamp <em>Time Stamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' containment reference.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(IBISIPDateTime value);

	/**
	 * Returns the value of the '<em><b>Service Specification With State List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Specification With State List</em>' containment reference.
	 * @see #setServiceSpecificationWithStateList(ServiceSpecificationWithStateListStructure)
	 * @see de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage#getDeviceManagementServiceGetServiceStatusResponseDataStructure_ServiceSpecificationWithStateList()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ServiceSpecificationWithStateList' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceSpecificationWithStateListStructure getServiceSpecificationWithStateList();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetServiceStatusResponseDataStructure#getServiceSpecificationWithStateList <em>Service Specification With State List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Specification With State List</em>' containment reference.
	 * @see #getServiceSpecificationWithStateList()
	 * @generated
	 */
	void setServiceSpecificationWithStateList(ServiceSpecificationWithStateListStructure value);

} // DeviceManagementServiceGetServiceStatusResponseDataStructure
