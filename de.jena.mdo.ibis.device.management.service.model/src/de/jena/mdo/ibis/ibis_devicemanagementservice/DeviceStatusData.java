/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice;

import de.jena.mdo.ibis.ibis_common.IBISIPDateTime;

import de.jena.mdo.ibis.ibis_enumerations.DeviceStateEnumeration;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Status Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusData#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusData#getDeviceState <em>Device State</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceStatusData()
 * @model extendedMetaData="name='DeviceManagementService.GetDeviceStatusResponseDataStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeviceStatusData extends EObject {
	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' containment reference.
	 * @see #setTimeStamp(IBISIPDateTime)
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceStatusData_TimeStamp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TimeStamp' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDateTime getTimeStamp();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusData#getTimeStamp <em>Time Stamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' containment reference.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(IBISIPDateTime value);

	/**
	 * Returns the value of the '<em><b>Device State</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.ibis_enumerations.DeviceStateEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device State</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_enumerations.DeviceStateEnumeration
	 * @see #isSetDeviceState()
	 * @see #unsetDeviceState()
	 * @see #setDeviceState(DeviceStateEnumeration)
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getDeviceStatusData_DeviceState()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='DeviceState' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceStateEnumeration getDeviceState();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusData#getDeviceState <em>Device State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device State</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_enumerations.DeviceStateEnumeration
	 * @see #isSetDeviceState()
	 * @see #unsetDeviceState()
	 * @see #getDeviceState()
	 * @generated
	 */
	void setDeviceState(DeviceStateEnumeration value);

	/**
	 * Unsets the value of the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusData#getDeviceState <em>Device State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeviceState()
	 * @see #getDeviceState()
	 * @see #setDeviceState(DeviceStateEnumeration)
	 * @generated
	 */
	void unsetDeviceState();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusData#getDeviceState <em>Device State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Device State</em>' attribute is set.
	 * @see #unsetDeviceState()
	 * @see #getDeviceState()
	 * @see #setDeviceState(DeviceStateEnumeration)
	 * @generated
	 */
	boolean isSetDeviceState();

} // DeviceStatusData
