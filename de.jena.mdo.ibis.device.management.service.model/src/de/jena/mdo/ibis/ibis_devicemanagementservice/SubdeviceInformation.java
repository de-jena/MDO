/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice;

import de.jena.mdo.ibis.ibis_common.DeviceInformation;
import de.jena.mdo.ibis.ibis_common.IBISIPString;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subdevice Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Information on named subdevice
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.SubdeviceInformation#getSubdeviceName <em>Subdevice Name</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.SubdeviceInformation#getDeviceInformation <em>Device Information</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getSubdeviceInformation()
 * @model extendedMetaData="name='SubdeviceInformationStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SubdeviceInformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Subdevice Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to identify subdevice
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subdevice Name</em>' containment reference.
	 * @see #setSubdeviceName(IBISIPString)
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getSubdeviceInformation_SubdeviceName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SubdeviceName' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPString getSubdeviceName();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.SubdeviceInformation#getSubdeviceName <em>Subdevice Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subdevice Name</em>' containment reference.
	 * @see #getSubdeviceName()
	 * @generated
	 */
	void setSubdeviceName(IBISIPString value);

	/**
	 * Returns the value of the '<em><b>Device Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information on subdevice
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Information</em>' containment reference.
	 * @see #setDeviceInformation(DeviceInformation)
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getSubdeviceInformation_DeviceInformation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DeviceInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceInformation getDeviceInformation();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.SubdeviceInformation#getDeviceInformation <em>Device Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Information</em>' containment reference.
	 * @see #getDeviceInformation()
	 * @generated
	 */
	void setDeviceInformation(DeviceInformation value);

} // SubdeviceInformation
