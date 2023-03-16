/*
 */
package de.jena.mdo.ibis.ibis_common;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Identification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.ServiceIdentification#getService <em>Service</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.ServiceIdentification#getDevice <em>Device</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getServiceIdentification()
 * @model extendedMetaData="name='ServiceIdentificationStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ServiceIdentification extends EObject {
	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' containment reference.
	 * @see #setService(ServiceSpecification)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getServiceIdentification_Service()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Service' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceSpecification getService();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.ServiceIdentification#getService <em>Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' containment reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(ServiceSpecification value);

	/**
	 * Returns the value of the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' containment reference.
	 * @see #setDevice(DeviceSpecification)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getServiceIdentification_Device()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Device' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceSpecification getDevice();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.ServiceIdentification#getDevice <em>Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' containment reference.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(DeviceSpecification value);

} // ServiceIdentification
