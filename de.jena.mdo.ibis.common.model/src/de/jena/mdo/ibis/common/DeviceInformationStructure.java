/*
 */
package de.jena.mdo.ibis.common;

import de.jena.mdo.ibis.enumerations.DeviceClassEnumeration;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Information Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.DeviceInformationStructure#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.DeviceInformationStructure#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.DeviceInformationStructure#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.DeviceInformationStructure#getDeviceClass <em>Device Class</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.DeviceInformationStructure#getDataVersionList <em>Data Version List</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.DeviceInformationStructure#getWebInterfaceAddress <em>Web Interface Address</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDeviceInformationStructure()
 * @model extendedMetaData="name='DeviceInformationStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeviceInformationStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Device Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Name</em>' containment reference.
	 * @see #setDeviceName(IBISIPString)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDeviceInformationStructure_DeviceName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DeviceName' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPString getDeviceName();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.DeviceInformationStructure#getDeviceName <em>Device Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Name</em>' containment reference.
	 * @see #getDeviceName()
	 * @generated
	 */
	void setDeviceName(IBISIPString value);

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manufacturer</em>' containment reference.
	 * @see #setManufacturer(IBISIPString)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDeviceInformationStructure_Manufacturer()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Manufacturer' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPString getManufacturer();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.DeviceInformationStructure#getManufacturer <em>Manufacturer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer</em>' containment reference.
	 * @see #getManufacturer()
	 * @generated
	 */
	void setManufacturer(IBISIPString value);

	/**
	 * Returns the value of the '<em><b>Serial Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serial Number</em>' containment reference.
	 * @see #setSerialNumber(IBISIPNMTOKEN)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDeviceInformationStructure_SerialNumber()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SerialNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPNMTOKEN getSerialNumber();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.DeviceInformationStructure#getSerialNumber <em>Serial Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serial Number</em>' containment reference.
	 * @see #getSerialNumber()
	 * @generated
	 */
	void setSerialNumber(IBISIPNMTOKEN value);

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
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDeviceInformationStructure_DeviceClass()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='DeviceClass' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceClassEnumeration getDeviceClass();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.DeviceInformationStructure#getDeviceClass <em>Device Class</em>}' attribute.
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
	 * Unsets the value of the '{@link de.jena.mdo.ibis.common.DeviceInformationStructure#getDeviceClass <em>Device Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeviceClass()
	 * @see #getDeviceClass()
	 * @see #setDeviceClass(DeviceClassEnumeration)
	 * @generated
	 */
	void unsetDeviceClass();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.common.DeviceInformationStructure#getDeviceClass <em>Device Class</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Data Version List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Version List</em>' containment reference.
	 * @see #setDataVersionList(DataVersionListStructure)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDeviceInformationStructure_DataVersionList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DataVersionList' namespace='##targetNamespace'"
	 * @generated
	 */
	DataVersionListStructure getDataVersionList();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.DeviceInformationStructure#getDataVersionList <em>Data Version List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Version List</em>' containment reference.
	 * @see #getDataVersionList()
	 * @generated
	 */
	void setDataVersionList(DataVersionListStructure value);

	/**
	 * Returns the value of the '<em><b>Web Interface Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Interface Address</em>' containment reference.
	 * @see #setWebInterfaceAddress(IBISIPAnyURI)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDeviceInformationStructure_WebInterfaceAddress()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='WebInterfaceAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPAnyURI getWebInterfaceAddress();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.DeviceInformationStructure#getWebInterfaceAddress <em>Web Interface Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Interface Address</em>' containment reference.
	 * @see #getWebInterfaceAddress()
	 * @generated
	 */
	void setWebInterfaceAddress(IBISIPAnyURI value);

} // DeviceInformationStructure