/*
 */
package de.jena.mdo.ibis.common;

import de.jena.mdo.ibis.enumerations.DeviceClassEnumeration;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Specification Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.DeviceSpecificationStructure#getDeviceClass <em>Device Class</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.DeviceSpecificationStructure#getDeviceID <em>Device ID</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDeviceSpecificationStructure()
 * @model extendedMetaData="name='DeviceSpecificationStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeviceSpecificationStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Device Class</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.enumerations.DeviceClassEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Class</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.DeviceClassEnumeration
	 * @see #isSetDeviceClass()
	 * @see #unsetDeviceClass()
	 * @see #setDeviceClass(DeviceClassEnumeration)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDeviceSpecificationStructure_DeviceClass()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='DeviceClass' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceClassEnumeration getDeviceClass();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.DeviceSpecificationStructure#getDeviceClass <em>Device Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Class</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.DeviceClassEnumeration
	 * @see #isSetDeviceClass()
	 * @see #unsetDeviceClass()
	 * @see #getDeviceClass()
	 * @generated
	 */
	void setDeviceClass(DeviceClassEnumeration value);

	/**
	 * Unsets the value of the '{@link de.jena.mdo.ibis.common.DeviceSpecificationStructure#getDeviceClass <em>Device Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeviceClass()
	 * @see #getDeviceClass()
	 * @see #setDeviceClass(DeviceClassEnumeration)
	 * @generated
	 */
	void unsetDeviceClass();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.common.DeviceSpecificationStructure#getDeviceClass <em>Device Class</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Device Class</em>' attribute is set.
	 * @see #unsetDeviceClass()
	 * @see #getDeviceClass()
	 * @see #setDeviceClass(DeviceClassEnumeration)
	 * @generated
	 */
	boolean isSetDeviceClass();

	/**
	 * Returns the value of the '<em><b>Device ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device ID</em>' containment reference.
	 * @see #setDeviceID(IBISIPNMTOKEN)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDeviceSpecificationStructure_DeviceID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DeviceID' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPNMTOKEN getDeviceID();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.DeviceSpecificationStructure#getDeviceID <em>Device ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device ID</em>' containment reference.
	 * @see #getDeviceID()
	 * @generated
	 */
	void setDeviceID(IBISIPNMTOKEN value);

} // DeviceSpecificationStructure
