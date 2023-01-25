/*
 */
package de.jena.mdo.ibis.devicemanagementservice;

import de.jena.mdo.ibis.common.GeneralResponseStructure;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Management Service Retrieve Update State Response Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceRetrieveUpdateStateResponseStructure#getUpdateStateData <em>Update State Data</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceManagementServiceRetrieveUpdateStateResponseStructure()
 * @model extendedMetaData="name='DeviceManagementService.RetrieveUpdateStateResponseStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeviceManagementServiceRetrieveUpdateStateResponseStructure extends GeneralResponseStructure {
	/**
	 * Returns the value of the '<em><b>Update State Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update State Data</em>' containment reference.
	 * @see #setUpdateStateData(DeviceManagementServiceUpdateStateDataStructure)
	 * @see de.jena.mdo.ibis.devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceManagementServiceRetrieveUpdateStateResponseStructure_UpdateStateData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='UpdateStateData' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceManagementServiceUpdateStateDataStructure getUpdateStateData();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceRetrieveUpdateStateResponseStructure#getUpdateStateData <em>Update State Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update State Data</em>' containment reference.
	 * @see #getUpdateStateData()
	 * @generated
	 */
	void setUpdateStateData(DeviceManagementServiceUpdateStateDataStructure value);

} // DeviceManagementServiceRetrieveUpdateStateResponseStructure
