/*
 */
package de.jena.mdo.ibis.devicemanagementservice;

import de.jena.mdo.ibis.common.IBISIPString;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Management Service Install Update Response Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceInstallUpdateResponseStructure#getUpdateAccept <em>Update Accept</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceInstallUpdateResponseStructure#getOperationErrorMessage <em>Operation Error Message</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage#getDeviceManagementServiceInstallUpdateResponseStructure()
 * @model extendedMetaData="name='DeviceManagementService.InstallUpdateResponseStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeviceManagementServiceInstallUpdateResponseStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Update Accept</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.devicemanagementservice.UpdateAcceptEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Accept</em>' attribute.
	 * @see de.jena.mdo.ibis.devicemanagementservice.UpdateAcceptEnumeration
	 * @see #isSetUpdateAccept()
	 * @see #unsetUpdateAccept()
	 * @see #setUpdateAccept(UpdateAcceptEnumeration)
	 * @see de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage#getDeviceManagementServiceInstallUpdateResponseStructure_UpdateAccept()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='UpdateAccept' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdateAcceptEnumeration getUpdateAccept();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceInstallUpdateResponseStructure#getUpdateAccept <em>Update Accept</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Accept</em>' attribute.
	 * @see de.jena.mdo.ibis.devicemanagementservice.UpdateAcceptEnumeration
	 * @see #isSetUpdateAccept()
	 * @see #unsetUpdateAccept()
	 * @see #getUpdateAccept()
	 * @generated
	 */
	void setUpdateAccept(UpdateAcceptEnumeration value);

	/**
	 * Unsets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceInstallUpdateResponseStructure#getUpdateAccept <em>Update Accept</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUpdateAccept()
	 * @see #getUpdateAccept()
	 * @see #setUpdateAccept(UpdateAcceptEnumeration)
	 * @generated
	 */
	void unsetUpdateAccept();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceInstallUpdateResponseStructure#getUpdateAccept <em>Update Accept</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Update Accept</em>' attribute is set.
	 * @see #unsetUpdateAccept()
	 * @see #getUpdateAccept()
	 * @see #setUpdateAccept(UpdateAcceptEnumeration)
	 * @generated
	 */
	boolean isSetUpdateAccept();

	/**
	 * Returns the value of the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Error Message</em>' containment reference.
	 * @see #setOperationErrorMessage(IBISIPString)
	 * @see de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage#getDeviceManagementServiceInstallUpdateResponseStructure_OperationErrorMessage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OperationErrorMessage' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPString getOperationErrorMessage();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceInstallUpdateResponseStructure#getOperationErrorMessage <em>Operation Error Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Error Message</em>' containment reference.
	 * @see #getOperationErrorMessage()
	 * @generated
	 */
	void setOperationErrorMessage(IBISIPString value);

} // DeviceManagementServiceInstallUpdateResponseStructure
