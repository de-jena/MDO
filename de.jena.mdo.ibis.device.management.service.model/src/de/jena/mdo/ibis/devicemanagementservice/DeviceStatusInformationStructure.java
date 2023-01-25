/*
 */
package de.jena.mdo.ibis.devicemanagementservice;

import de.jena.mdo.ibis.enumerations.DeviceStateEnumeration;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Status Information Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.DeviceStatusInformationStructure#getDeviceState <em>Device State</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.DeviceStatusInformationStructure#getDeviceStatusList <em>Device Status List</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceStatusInformationStructure()
 * @model extendedMetaData="name='DeviceStatusInformationStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeviceStatusInformationStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Device State</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.enumerations.DeviceStateEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device State</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.DeviceStateEnumeration
	 * @see #isSetDeviceState()
	 * @see #unsetDeviceState()
	 * @see #setDeviceState(DeviceStateEnumeration)
	 * @see de.jena.mdo.ibis.devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceStatusInformationStructure_DeviceState()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='DeviceState' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceStateEnumeration getDeviceState();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceStatusInformationStructure#getDeviceState <em>Device State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device State</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.DeviceStateEnumeration
	 * @see #isSetDeviceState()
	 * @see #unsetDeviceState()
	 * @see #getDeviceState()
	 * @generated
	 */
	void setDeviceState(DeviceStateEnumeration value);

	/**
	 * Unsets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceStatusInformationStructure#getDeviceState <em>Device State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeviceState()
	 * @see #getDeviceState()
	 * @see #setDeviceState(DeviceStateEnumeration)
	 * @generated
	 */
	void unsetDeviceState();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceStatusInformationStructure#getDeviceState <em>Device State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Device State</em>' attribute is set.
	 * @see #unsetDeviceState()
	 * @see #getDeviceState()
	 * @see #setDeviceState(DeviceStateEnumeration)
	 * @generated
	 */
	boolean isSetDeviceState();

	/**
	 * Returns the value of the '<em><b>Device Status List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Status List</em>' containment reference.
	 * @see #setDeviceStatusList(DeviceStatusStructure)
	 * @see de.jena.mdo.ibis.devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceStatusInformationStructure_DeviceStatusList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeviceStatusList' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceStatusStructure getDeviceStatusList();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceStatusInformationStructure#getDeviceStatusList <em>Device Status List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Status List</em>' containment reference.
	 * @see #getDeviceStatusList()
	 * @generated
	 */
	void setDeviceStatusList(DeviceStatusStructure value);

} // DeviceStatusInformationStructure
