/*
 */
package de.jena.mdo.ibis.devicemanagementservice;

import de.jena.mdo.ibis.common.IBISIPString;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subdevice Status Information Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Status information of named subdevice
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.SubdeviceStatusInformationStructure#getSubdeviceName <em>Subdevice Name</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.SubdeviceStatusInformationStructure#getDeviceStatusInformation <em>Device Status Information</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.devicemanagementservice.IbisDeviceManagementServicePackage#getSubdeviceStatusInformationStructure()
 * @model extendedMetaData="name='SubdeviceStatusInformationStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SubdeviceStatusInformationStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Subdevice Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to identify subdevice
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subdevice Name</em>' containment reference.
	 * @see #setSubdeviceName(IBISIPString)
	 * @see de.jena.mdo.ibis.devicemanagementservice.IbisDeviceManagementServicePackage#getSubdeviceStatusInformationStructure_SubdeviceName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SubdeviceName' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPString getSubdeviceName();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.SubdeviceStatusInformationStructure#getSubdeviceName <em>Subdevice Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subdevice Name</em>' containment reference.
	 * @see #getSubdeviceName()
	 * @generated
	 */
	void setSubdeviceName(IBISIPString value);

	/**
	 * Returns the value of the '<em><b>Device Status Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Status information of subdevice
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Status Information</em>' containment reference.
	 * @see #setDeviceStatusInformation(DeviceStatusInformationStructure)
	 * @see de.jena.mdo.ibis.devicemanagementservice.IbisDeviceManagementServicePackage#getSubdeviceStatusInformationStructure_DeviceStatusInformation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DeviceStatusInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceStatusInformationStructure getDeviceStatusInformation();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.SubdeviceStatusInformationStructure#getDeviceStatusInformation <em>Device Status Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Status Information</em>' containment reference.
	 * @see #getDeviceStatusInformation()
	 * @generated
	 */
	void setDeviceStatusInformation(DeviceStatusInformationStructure value);

} // SubdeviceStatusInformationStructure
