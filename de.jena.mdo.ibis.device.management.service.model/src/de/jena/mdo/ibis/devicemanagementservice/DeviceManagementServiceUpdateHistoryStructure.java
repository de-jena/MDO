/*
 */
package de.jena.mdo.ibis.devicemanagementservice;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Management Service Update History Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateHistoryStructure#getUpdateHistoryEntry <em>Update History Entry</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage#getDeviceManagementServiceUpdateHistoryStructure()
 * @model extendedMetaData="name='DeviceManagementService.UpdateHistoryStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeviceManagementServiceUpdateHistoryStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Update History Entry</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateHistoryEntryStructure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minimum requirement for any device allowing updates is an update history depth of 1, 
	 * 					i.e. history shall contain at least the last update performed (regardless of its result), if there was any.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Update History Entry</em>' containment reference list.
	 * @see de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage#getDeviceManagementServiceUpdateHistoryStructure_UpdateHistoryEntry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='UpdateHistoryEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeviceManagementServiceUpdateHistoryEntryStructure> getUpdateHistoryEntry();

} // DeviceManagementServiceUpdateHistoryStructure
