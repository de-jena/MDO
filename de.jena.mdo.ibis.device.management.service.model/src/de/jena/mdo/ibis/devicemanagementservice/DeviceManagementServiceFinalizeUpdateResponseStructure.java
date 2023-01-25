/*
 */
package de.jena.mdo.ibis.devicemanagementservice;

import de.jena.mdo.ibis.common.GeneralResponseStructure;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Management Service Finalize Update Response Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceFinalizeUpdateResponseStructure#getUpdateStatus <em>Update Status</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceManagementServiceFinalizeUpdateResponseStructure()
 * @model extendedMetaData="name='DeviceManagementService.FinalizeUpdateResponseStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeviceManagementServiceFinalizeUpdateResponseStructure extends GeneralResponseStructure {
	/**
	 * Returns the value of the '<em><b>Update Status</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.devicemanagementservice.UpdateStatusEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Status of update on its finalization
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Update Status</em>' attribute.
	 * @see de.jena.mdo.ibis.devicemanagementservice.UpdateStatusEnumeration
	 * @see #isSetUpdateStatus()
	 * @see #unsetUpdateStatus()
	 * @see #setUpdateStatus(UpdateStatusEnumeration)
	 * @see de.jena.mdo.ibis.devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceManagementServiceFinalizeUpdateResponseStructure_UpdateStatus()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='UpdateStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdateStatusEnumeration getUpdateStatus();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceFinalizeUpdateResponseStructure#getUpdateStatus <em>Update Status</em>}' attribute.
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
	 * Unsets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceFinalizeUpdateResponseStructure#getUpdateStatus <em>Update Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUpdateStatus()
	 * @see #getUpdateStatus()
	 * @see #setUpdateStatus(UpdateStatusEnumeration)
	 * @generated
	 */
	void unsetUpdateStatus();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceFinalizeUpdateResponseStructure#getUpdateStatus <em>Update Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Update Status</em>' attribute is set.
	 * @see #unsetUpdateStatus()
	 * @see #getUpdateStatus()
	 * @see #setUpdateStatus(UpdateStatusEnumeration)
	 * @generated
	 */
	boolean isSetUpdateStatus();

} // DeviceManagementServiceFinalizeUpdateResponseStructure
