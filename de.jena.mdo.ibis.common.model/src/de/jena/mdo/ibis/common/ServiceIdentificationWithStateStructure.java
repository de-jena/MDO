/*
 */
package de.jena.mdo.ibis.common;

import de.jena.mdo.ibis.enumerations.ServiceStateEnumeration;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Identification With State Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.ServiceIdentificationWithStateStructure#getServiceIdentification <em>Service Identification</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.ServiceIdentificationWithStateStructure#getServiceState <em>Service State</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getServiceIdentificationWithStateStructure()
 * @model extendedMetaData="name='ServiceIdentificationWithStateStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ServiceIdentificationWithStateStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Identification</em>' containment reference.
	 * @see #setServiceIdentification(ServiceIdentificationStructure)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getServiceIdentificationWithStateStructure_ServiceIdentification()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ServiceIdentification' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceIdentificationStructure getServiceIdentification();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.ServiceIdentificationWithStateStructure#getServiceIdentification <em>Service Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Identification</em>' containment reference.
	 * @see #getServiceIdentification()
	 * @generated
	 */
	void setServiceIdentification(ServiceIdentificationStructure value);

	/**
	 * Returns the value of the '<em><b>Service State</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.enumerations.ServiceStateEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service State</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.ServiceStateEnumeration
	 * @see #isSetServiceState()
	 * @see #unsetServiceState()
	 * @see #setServiceState(ServiceStateEnumeration)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getServiceIdentificationWithStateStructure_ServiceState()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ServiceState' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceStateEnumeration getServiceState();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.ServiceIdentificationWithStateStructure#getServiceState <em>Service State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service State</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.ServiceStateEnumeration
	 * @see #isSetServiceState()
	 * @see #unsetServiceState()
	 * @see #getServiceState()
	 * @generated
	 */
	void setServiceState(ServiceStateEnumeration value);

	/**
	 * Unsets the value of the '{@link de.jena.mdo.ibis.common.ServiceIdentificationWithStateStructure#getServiceState <em>Service State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServiceState()
	 * @see #getServiceState()
	 * @see #setServiceState(ServiceStateEnumeration)
	 * @generated
	 */
	void unsetServiceState();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.common.ServiceIdentificationWithStateStructure#getServiceState <em>Service State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Service State</em>' attribute is set.
	 * @see #unsetServiceState()
	 * @see #getServiceState()
	 * @see #setServiceState(ServiceStateEnumeration)
	 * @generated
	 */
	boolean isSetServiceState();

} // ServiceIdentificationWithStateStructure
