/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice;

import de.jena.mdo.ibis.ibis_common.GeneralResponse;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Finalize Update Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.FinalizeUpdateResponse#getUpdateStatus <em>Update Status</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getFinalizeUpdateResponse()
 * @model extendedMetaData="name='DeviceManagementService.FinalizeUpdateResponseStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FinalizeUpdateResponse extends GeneralResponse {
	/**
	 * Returns the value of the '<em><b>Update Status</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateStatusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Status of update on its finalization
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Update Status</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateStatusType
	 * @see #isSetUpdateStatus()
	 * @see #unsetUpdateStatus()
	 * @see #setUpdateStatus(UpdateStatusType)
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getFinalizeUpdateResponse_UpdateStatus()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='UpdateStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdateStatusType getUpdateStatus();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.FinalizeUpdateResponse#getUpdateStatus <em>Update Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Status</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateStatusType
	 * @see #isSetUpdateStatus()
	 * @see #unsetUpdateStatus()
	 * @see #getUpdateStatus()
	 * @generated
	 */
	void setUpdateStatus(UpdateStatusType value);

	/**
	 * Unsets the value of the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.FinalizeUpdateResponse#getUpdateStatus <em>Update Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUpdateStatus()
	 * @see #getUpdateStatus()
	 * @see #setUpdateStatus(UpdateStatusType)
	 * @generated
	 */
	void unsetUpdateStatus();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.FinalizeUpdateResponse#getUpdateStatus <em>Update Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Update Status</em>' attribute is set.
	 * @see #unsetUpdateStatus()
	 * @see #getUpdateStatus()
	 * @see #setUpdateStatus(UpdateStatusType)
	 * @generated
	 */
	boolean isSetUpdateStatus();

} // FinalizeUpdateResponse
