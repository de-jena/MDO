/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice;

import de.jena.mdo.ibis.ibis_common.GeneralResponse;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update History Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistoryResponse#getUpdateHistory <em>Update History</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getUpdateHistoryResponse()
 * @model extendedMetaData="name='DeviceManagementService.GetUpdateHistoryResponseStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface UpdateHistoryResponse extends GeneralResponse {
	/**
	 * Returns the value of the '<em><b>Update History</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update History</em>' containment reference.
	 * @see #setUpdateHistory(UpdateHistory)
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getUpdateHistoryResponse_UpdateHistory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='UpdateHistory' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdateHistory getUpdateHistory();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistoryResponse#getUpdateHistory <em>Update History</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update History</em>' containment reference.
	 * @see #getUpdateHistory()
	 * @generated
	 */
	void setUpdateHistory(UpdateHistory value);

} // UpdateHistoryResponse
