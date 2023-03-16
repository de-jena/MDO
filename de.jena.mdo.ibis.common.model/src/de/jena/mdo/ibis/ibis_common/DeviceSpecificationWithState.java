/*
 */
package de.jena.mdo.ibis.ibis_common;

import de.jena.mdo.ibis.ibis_enumerations.DeviceStateEnumeration;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Specification With State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.DeviceSpecificationWithState#getDeviceSpecification <em>Device Specification</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.DeviceSpecificationWithState#getDeviceState <em>Device State</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getDeviceSpecificationWithState()
 * @model extendedMetaData="name='DeviceSpecificationWithStateStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeviceSpecificationWithState extends EObject {
	/**
	 * Returns the value of the '<em><b>Device Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Specification</em>' containment reference.
	 * @see #setDeviceSpecification(DeviceSpecification)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getDeviceSpecificationWithState_DeviceSpecification()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DeviceSpecification' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceSpecification getDeviceSpecification();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.DeviceSpecificationWithState#getDeviceSpecification <em>Device Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Specification</em>' containment reference.
	 * @see #getDeviceSpecification()
	 * @generated
	 */
	void setDeviceSpecification(DeviceSpecification value);

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
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getDeviceSpecificationWithState_DeviceState()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='DeviceState' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceStateEnumeration getDeviceState();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.DeviceSpecificationWithState#getDeviceState <em>Device State</em>}' attribute.
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
	 * Unsets the value of the '{@link de.jena.mdo.ibis.ibis_common.DeviceSpecificationWithState#getDeviceState <em>Device State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeviceState()
	 * @see #getDeviceState()
	 * @see #setDeviceState(DeviceStateEnumeration)
	 * @generated
	 */
	void unsetDeviceState();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.ibis_common.DeviceSpecificationWithState#getDeviceState <em>Device State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Device State</em>' attribute is set.
	 * @see #unsetDeviceState()
	 * @see #getDeviceState()
	 * @see #setDeviceState(DeviceStateEnumeration)
	 * @generated
	 */
	boolean isSetDeviceState();

} // DeviceSpecificationWithState
