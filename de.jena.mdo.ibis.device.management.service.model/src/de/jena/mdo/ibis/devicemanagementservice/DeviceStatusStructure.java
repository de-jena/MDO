/*
 */
package de.jena.mdo.ibis.devicemanagementservice;

import de.jena.mdo.ibis.common.IBISIPBoolean;
import de.jena.mdo.ibis.common.IBISIPInt;
import de.jena.mdo.ibis.common.IBISIPString;

import de.jena.mdo.ibis.enumerations.DeviceStateEnumeration;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Status Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.DeviceStatusStructure#getDeviceStatusName <em>Device Status Name</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.DeviceStatusStructure#getDeviceStatusFlag <em>Device Status Flag</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.DeviceStatusStructure#getDeviceStatusImpact <em>Device Status Impact</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.DeviceStatusStructure#getDeviceStatusPriority <em>Device Status Priority</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage#getDeviceStatusStructure()
 * @model extendedMetaData="name='DeviceStatusStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeviceStatusStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Device Status Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Status Name</em>' containment reference.
	 * @see #setDeviceStatusName(IBISIPString)
	 * @see de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage#getDeviceStatusStructure_DeviceStatusName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DeviceStatusName' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPString getDeviceStatusName();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceStatusStructure#getDeviceStatusName <em>Device Status Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Status Name</em>' containment reference.
	 * @see #getDeviceStatusName()
	 * @generated
	 */
	void setDeviceStatusName(IBISIPString value);

	/**
	 * Returns the value of the '<em><b>Device Status Flag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Status Flag</em>' containment reference.
	 * @see #setDeviceStatusFlag(IBISIPBoolean)
	 * @see de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage#getDeviceStatusStructure_DeviceStatusFlag()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DeviceStatusFlag' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPBoolean getDeviceStatusFlag();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceStatusStructure#getDeviceStatusFlag <em>Device Status Flag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Status Flag</em>' containment reference.
	 * @see #getDeviceStatusFlag()
	 * @generated
	 */
	void setDeviceStatusFlag(IBISIPBoolean value);

	/**
	 * Returns the value of the '<em><b>Device Status Impact</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.enumerations.DeviceStateEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Status Impact</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.DeviceStateEnumeration
	 * @see #isSetDeviceStatusImpact()
	 * @see #unsetDeviceStatusImpact()
	 * @see #setDeviceStatusImpact(DeviceStateEnumeration)
	 * @see de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage#getDeviceStatusStructure_DeviceStatusImpact()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='DeviceStatusImpact' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceStateEnumeration getDeviceStatusImpact();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceStatusStructure#getDeviceStatusImpact <em>Device Status Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Status Impact</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.DeviceStateEnumeration
	 * @see #isSetDeviceStatusImpact()
	 * @see #unsetDeviceStatusImpact()
	 * @see #getDeviceStatusImpact()
	 * @generated
	 */
	void setDeviceStatusImpact(DeviceStateEnumeration value);

	/**
	 * Unsets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceStatusStructure#getDeviceStatusImpact <em>Device Status Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeviceStatusImpact()
	 * @see #getDeviceStatusImpact()
	 * @see #setDeviceStatusImpact(DeviceStateEnumeration)
	 * @generated
	 */
	void unsetDeviceStatusImpact();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceStatusStructure#getDeviceStatusImpact <em>Device Status Impact</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Device Status Impact</em>' attribute is set.
	 * @see #unsetDeviceStatusImpact()
	 * @see #getDeviceStatusImpact()
	 * @see #setDeviceStatusImpact(DeviceStateEnumeration)
	 * @generated
	 */
	boolean isSetDeviceStatusImpact();

	/**
	 * Returns the value of the '<em><b>Device Status Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Status Priority</em>' containment reference.
	 * @see #setDeviceStatusPriority(IBISIPInt)
	 * @see de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage#getDeviceStatusStructure_DeviceStatusPriority()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DeviceStatusPriority' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPInt getDeviceStatusPriority();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceStatusStructure#getDeviceStatusPriority <em>Device Status Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Status Priority</em>' containment reference.
	 * @see #getDeviceStatusPriority()
	 * @generated
	 */
	void setDeviceStatusPriority(IBISIPInt value);

} // DeviceStatusStructure
