/*
 */
package de.jena.mdo.ibis.common;

import de.jena.mdo.ibis.enumerations.ServiceStateEnumeration;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Specification With State Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.ServiceSpecificationWithStateStructure#getServiceSpecification <em>Service Specification</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.ServiceSpecificationWithStateStructure#getServiceState <em>Service State</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getServiceSpecificationWithStateStructure()
 * @model extendedMetaData="name='ServiceSpecificationWithStateStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ServiceSpecificationWithStateStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Specification</em>' containment reference.
	 * @see #setServiceSpecification(ServiceSpecificationStructure)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getServiceSpecificationWithStateStructure_ServiceSpecification()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ServiceSpecification' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceSpecificationStructure getServiceSpecification();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.ServiceSpecificationWithStateStructure#getServiceSpecification <em>Service Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Specification</em>' containment reference.
	 * @see #getServiceSpecification()
	 * @generated
	 */
	void setServiceSpecification(ServiceSpecificationStructure value);

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
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getServiceSpecificationWithStateStructure_ServiceState()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ServiceState' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceStateEnumeration getServiceState();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.ServiceSpecificationWithStateStructure#getServiceState <em>Service State</em>}' attribute.
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
	 * Unsets the value of the '{@link de.jena.mdo.ibis.common.ServiceSpecificationWithStateStructure#getServiceState <em>Service State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServiceState()
	 * @see #getServiceState()
	 * @see #setServiceState(ServiceStateEnumeration)
	 * @generated
	 */
	void unsetServiceState();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.common.ServiceSpecificationWithStateStructure#getServiceState <em>Service State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Service State</em>' attribute is set.
	 * @see #unsetServiceState()
	 * @see #getServiceState()
	 * @see #setServiceState(ServiceStateEnumeration)
	 * @generated
	 */
	boolean isSetServiceState();

} // ServiceSpecificationWithStateStructure
