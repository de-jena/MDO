/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice;

import de.jena.mdo.ibis.ibis_common.GeneralResponse;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Retrieve Update State Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.RetrieveUpdateStateResponse#getUpdateStateData <em>Update State Data</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getRetrieveUpdateStateResponse()
 * @model extendedMetaData="name='DeviceManagementService.RetrieveUpdateStateResponseStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface RetrieveUpdateStateResponse extends GeneralResponse {
	/**
	 * Returns the value of the '<em><b>Update State Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update State Data</em>' containment reference.
	 * @see #setUpdateStateData(UpdateStateData)
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getRetrieveUpdateStateResponse_UpdateStateData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='UpdateStateData' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdateStateData getUpdateStateData();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.RetrieveUpdateStateResponse#getUpdateStateData <em>Update State Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update State Data</em>' containment reference.
	 * @see #getUpdateStateData()
	 * @generated
	 */
	void setUpdateStateData(UpdateStateData value);

} // RetrieveUpdateStateResponse
