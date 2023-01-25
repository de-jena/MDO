/*
 */
package de.jena.mdo.ibis.devicemanagementservice;

import de.jena.mdo.ibis.common.GeneralResponseStructure;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Management Service Get Update History Response Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetUpdateHistoryResponseStructure#getUpdateHistory <em>Update History</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceManagementServiceGetUpdateHistoryResponseStructure()
 * @model extendedMetaData="name='DeviceManagementService.GetUpdateHistoryResponseStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeviceManagementServiceGetUpdateHistoryResponseStructure extends GeneralResponseStructure {
	/**
	 * Returns the value of the '<em><b>Update History</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update History</em>' containment reference.
	 * @see #setUpdateHistory(DeviceManagementServiceUpdateHistoryStructure)
	 * @see de.jena.mdo.ibis.devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceManagementServiceGetUpdateHistoryResponseStructure_UpdateHistory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='UpdateHistory' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceManagementServiceUpdateHistoryStructure getUpdateHistory();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetUpdateHistoryResponseStructure#getUpdateHistory <em>Update History</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update History</em>' containment reference.
	 * @see #getUpdateHistory()
	 * @generated
	 */
	void setUpdateHistory(DeviceManagementServiceUpdateHistoryStructure value);

} // DeviceManagementServiceGetUpdateHistoryResponseStructure
