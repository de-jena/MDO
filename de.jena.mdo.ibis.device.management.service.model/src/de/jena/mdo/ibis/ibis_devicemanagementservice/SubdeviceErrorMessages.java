/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice;

import de.jena.mdo.ibis.ibis_common.IBISIPString;
import de.jena.mdo.ibis.ibis_common.Message;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subdevice Error Messages</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Error messages of named subdevice
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.SubdeviceErrorMessages#getSubdeviceName <em>Subdevice Name</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.SubdeviceErrorMessages#getErrorMessage <em>Error Message</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getSubdeviceErrorMessages()
 * @model extendedMetaData="name='SubdeviceErrorMessagesStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SubdeviceErrorMessages extends EObject {
	/**
	 * Returns the value of the '<em><b>Subdevice Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to identify subdevice
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subdevice Name</em>' containment reference.
	 * @see #setSubdeviceName(IBISIPString)
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getSubdeviceErrorMessages_SubdeviceName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SubdeviceName' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPString getSubdeviceName();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.SubdeviceErrorMessages#getSubdeviceName <em>Subdevice Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subdevice Name</em>' containment reference.
	 * @see #getSubdeviceName()
	 * @generated
	 */
	void setSubdeviceName(IBISIPString value);

	/**
	 * Returns the value of the '<em><b>Error Message</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.ibis_common.Message}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Warnings and errors only, no state messages
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Message</em>' containment reference list.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getSubdeviceErrorMessages_ErrorMessage()
	 * @model containment="true" lower="10"
	 *        extendedMetaData="kind='element' name='ErrorMessage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Message> getErrorMessage();

} // SubdeviceErrorMessages
