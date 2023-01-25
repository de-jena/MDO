/*
 */
package de.jena.mdo.ibis.devicemanagementservice;

import de.jena.mdo.ibis.common.IBISIPDateTime;
import de.jena.mdo.ibis.common.IBISIPNMTOKEN;
import de.jena.mdo.ibis.common.IBISIPString;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Management Service Update State Data Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateStateDataStructure#getUpdateID <em>Update ID</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateStateDataStructure#getUpdateTimestamp <em>Update Timestamp</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateStateDataStructure#getUpdateStatus <em>Update Status</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateStateDataStructure#getUpdateDetails <em>Update Details</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceManagementServiceUpdateStateDataStructure()
 * @model extendedMetaData="name='DeviceManagementService.UpdateStateDataStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeviceManagementServiceUpdateStateDataStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Update ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update ID</em>' containment reference.
	 * @see #setUpdateID(IBISIPNMTOKEN)
	 * @see de.jena.mdo.ibis.devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceManagementServiceUpdateStateDataStructure_UpdateID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='UpdateID' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPNMTOKEN getUpdateID();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateStateDataStructure#getUpdateID <em>Update ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update ID</em>' containment reference.
	 * @see #getUpdateID()
	 * @generated
	 */
	void setUpdateID(IBISIPNMTOKEN value);

	/**
	 * Returns the value of the '<em><b>Update Timestamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Timestamp given by operation InstallUpdate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Update Timestamp</em>' containment reference.
	 * @see #setUpdateTimestamp(IBISIPDateTime)
	 * @see de.jena.mdo.ibis.devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceManagementServiceUpdateStateDataStructure_UpdateTimestamp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='UpdateTimestamp' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDateTime getUpdateTimestamp();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateStateDataStructure#getUpdateTimestamp <em>Update Timestamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Timestamp</em>' containment reference.
	 * @see #getUpdateTimestamp()
	 * @generated
	 */
	void setUpdateTimestamp(IBISIPDateTime value);

	/**
	 * Returns the value of the '<em><b>Update Status</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.devicemanagementservice.UpdateStatusEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Current status of update
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Update Status</em>' attribute.
	 * @see de.jena.mdo.ibis.devicemanagementservice.UpdateStatusEnumeration
	 * @see #isSetUpdateStatus()
	 * @see #unsetUpdateStatus()
	 * @see #setUpdateStatus(UpdateStatusEnumeration)
	 * @see de.jena.mdo.ibis.devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceManagementServiceUpdateStateDataStructure_UpdateStatus()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='UpdateStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdateStatusEnumeration getUpdateStatus();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateStateDataStructure#getUpdateStatus <em>Update Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Status</em>' attribute.
	 * @see de.jena.mdo.ibis.devicemanagementservice.UpdateStatusEnumeration
	 * @see #isSetUpdateStatus()
	 * @see #unsetUpdateStatus()
	 * @see #getUpdateStatus()
	 * @generated
	 */
	void setUpdateStatus(UpdateStatusEnumeration value);

	/**
	 * Unsets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateStateDataStructure#getUpdateStatus <em>Update Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUpdateStatus()
	 * @see #getUpdateStatus()
	 * @see #setUpdateStatus(UpdateStatusEnumeration)
	 * @generated
	 */
	void unsetUpdateStatus();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateStateDataStructure#getUpdateStatus <em>Update Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Update Status</em>' attribute is set.
	 * @see #unsetUpdateStatus()
	 * @see #getUpdateStatus()
	 * @see #setUpdateStatus(UpdateStatusEnumeration)
	 * @generated
	 */
	boolean isSetUpdateStatus();

	/**
	 * Returns the value of the '<em><b>Update Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional device specific update log
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Update Details</em>' containment reference.
	 * @see #setUpdateDetails(IBISIPString)
	 * @see de.jena.mdo.ibis.devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceManagementServiceUpdateStateDataStructure_UpdateDetails()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='UpdateDetails' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPString getUpdateDetails();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateStateDataStructure#getUpdateDetails <em>Update Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Details</em>' containment reference.
	 * @see #getUpdateDetails()
	 * @generated
	 */
	void setUpdateDetails(IBISIPString value);

} // DeviceManagementServiceUpdateStateDataStructure
