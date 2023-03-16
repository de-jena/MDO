/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice;

import de.jena.mdo.ibis.ibis_common.GeneralResponse;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Install Update Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.InstallUpdateResponse#getUpdateAccept <em>Update Accept</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getInstallUpdateResponse()
 * @model extendedMetaData="name='DeviceManagementService.InstallUpdateResponseStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface InstallUpdateResponse extends GeneralResponse {
	/**
	 * Returns the value of the '<em><b>Update Accept</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateAcceptType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Accept</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateAcceptType
	 * @see #isSetUpdateAccept()
	 * @see #unsetUpdateAccept()
	 * @see #setUpdateAccept(UpdateAcceptType)
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getInstallUpdateResponse_UpdateAccept()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='UpdateAccept' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdateAcceptType getUpdateAccept();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.InstallUpdateResponse#getUpdateAccept <em>Update Accept</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Accept</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateAcceptType
	 * @see #isSetUpdateAccept()
	 * @see #unsetUpdateAccept()
	 * @see #getUpdateAccept()
	 * @generated
	 */
	void setUpdateAccept(UpdateAcceptType value);

	/**
	 * Unsets the value of the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.InstallUpdateResponse#getUpdateAccept <em>Update Accept</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUpdateAccept()
	 * @see #getUpdateAccept()
	 * @see #setUpdateAccept(UpdateAcceptType)
	 * @generated
	 */
	void unsetUpdateAccept();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.InstallUpdateResponse#getUpdateAccept <em>Update Accept</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Update Accept</em>' attribute is set.
	 * @see #unsetUpdateAccept()
	 * @see #getUpdateAccept()
	 * @see #setUpdateAccept(UpdateAcceptType)
	 * @generated
	 */
	boolean isSetUpdateAccept();

} // InstallUpdateResponse
