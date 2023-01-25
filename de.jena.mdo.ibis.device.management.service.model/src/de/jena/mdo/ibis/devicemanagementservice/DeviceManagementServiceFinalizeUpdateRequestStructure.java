/*
 */
package de.jena.mdo.ibis.devicemanagementservice;

import de.jena.mdo.ibis.common.IBISIPNMTOKEN;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Management Service Finalize Update Request Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceFinalizeUpdateRequestStructure#getUpdateID <em>Update ID</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceManagementServiceFinalizeUpdateRequestStructure()
 * @model extendedMetaData="name='DeviceManagementService.FinalizeUpdateRequestStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeviceManagementServiceFinalizeUpdateRequestStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Update ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update ID</em>' containment reference.
	 * @see #setUpdateID(IBISIPNMTOKEN)
	 * @see de.jena.mdo.ibis.devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceManagementServiceFinalizeUpdateRequestStructure_UpdateID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='UpdateID' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPNMTOKEN getUpdateID();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceFinalizeUpdateRequestStructure#getUpdateID <em>Update ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update ID</em>' containment reference.
	 * @see #getUpdateID()
	 * @generated
	 */
	void setUpdateID(IBISIPNMTOKEN value);

} // DeviceManagementServiceFinalizeUpdateRequestStructure
