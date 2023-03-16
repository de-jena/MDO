/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice;

import de.jena.mdo.ibis.ibis_common.IBISIPDateTime;
import de.jena.mdo.ibis.ibis_common.Message;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Error Messages Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceErrorMessagesData#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceErrorMessagesData#getErrorMessage <em>Error Message</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceErrorMessagesData()
 * @model extendedMetaData="name='DeviceManagementService.GetDeviceErrorMessagesResponseDataStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeviceErrorMessagesData extends EObject {
	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' containment reference.
	 * @see #setTimeStamp(IBISIPDateTime)
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceErrorMessagesData_TimeStamp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TimeStamp' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDateTime getTimeStamp();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceErrorMessagesData#getTimeStamp <em>Time Stamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' containment reference.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(IBISIPDateTime value);

	/**
	 * Returns the value of the '<em><b>Error Message</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.ibis_common.Message}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Warnings and errors only, no state messages
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Message</em>' containment reference list.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceErrorMessagesData_ErrorMessage()
	 * @model containment="true" lower="10"
	 *        extendedMetaData="kind='element' name='ErrorMessage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Message> getErrorMessage();

} // DeviceErrorMessagesData
