/*
 */
package de.jena.mdo.ibis.ibis_common;

import de.jena.mdo.ibis.ibis_enumerations.ServiceStateEnumeration;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Identification With State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.ServiceIdentificationWithState#getServiceIdentification <em>Service Identification</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.ServiceIdentificationWithState#getServiceState <em>Service State</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getServiceIdentificationWithState()
 * @model extendedMetaData="name='ServiceIdentificationWithStateStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ServiceIdentificationWithState extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Identification</em>' containment reference.
	 * @see #setServiceIdentification(ServiceIdentification)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getServiceIdentificationWithState_ServiceIdentification()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ServiceIdentification' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceIdentification getServiceIdentification();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.ServiceIdentificationWithState#getServiceIdentification <em>Service Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Identification</em>' containment reference.
	 * @see #getServiceIdentification()
	 * @generated
	 */
	void setServiceIdentification(ServiceIdentification value);

	/**
	 * Returns the value of the '<em><b>Service State</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.ibis_enumerations.ServiceStateEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service State</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_enumerations.ServiceStateEnumeration
	 * @see #isSetServiceState()
	 * @see #unsetServiceState()
	 * @see #setServiceState(ServiceStateEnumeration)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getServiceIdentificationWithState_ServiceState()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ServiceState' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceStateEnumeration getServiceState();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.ServiceIdentificationWithState#getServiceState <em>Service State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service State</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_enumerations.ServiceStateEnumeration
	 * @see #isSetServiceState()
	 * @see #unsetServiceState()
	 * @see #getServiceState()
	 * @generated
	 */
	void setServiceState(ServiceStateEnumeration value);

	/**
	 * Unsets the value of the '{@link de.jena.mdo.ibis.ibis_common.ServiceIdentificationWithState#getServiceState <em>Service State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServiceState()
	 * @see #getServiceState()
	 * @see #setServiceState(ServiceStateEnumeration)
	 * @generated
	 */
	void unsetServiceState();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.ibis_common.ServiceIdentificationWithState#getServiceState <em>Service State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Service State</em>' attribute is set.
	 * @see #unsetServiceState()
	 * @see #getServiceState()
	 * @see #setServiceState(ServiceStateEnumeration)
	 * @generated
	 */
	boolean isSetServiceState();

} // ServiceIdentificationWithState
