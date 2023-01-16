/*
 */
package de.jena.mdo.ibis.common;

import de.jena.mdo.ibis.enumerations.ServiceNameEnumeration;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Specification Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.ServiceSpecificationStructure#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.ServiceSpecificationStructure#getIBISIPVersion <em>IBISIP Version</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getServiceSpecificationStructure()
 * @model extendedMetaData="name='ServiceSpecificationStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ServiceSpecificationStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Name</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.enumerations.ServiceNameEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Name</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.ServiceNameEnumeration
	 * @see #isSetServiceName()
	 * @see #unsetServiceName()
	 * @see #setServiceName(ServiceNameEnumeration)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getServiceSpecificationStructure_ServiceName()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ServiceName' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceNameEnumeration getServiceName();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.ServiceSpecificationStructure#getServiceName <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.ServiceNameEnumeration
	 * @see #isSetServiceName()
	 * @see #unsetServiceName()
	 * @see #getServiceName()
	 * @generated
	 */
	void setServiceName(ServiceNameEnumeration value);

	/**
	 * Unsets the value of the '{@link de.jena.mdo.ibis.common.ServiceSpecificationStructure#getServiceName <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServiceName()
	 * @see #getServiceName()
	 * @see #setServiceName(ServiceNameEnumeration)
	 * @generated
	 */
	void unsetServiceName();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.common.ServiceSpecificationStructure#getServiceName <em>Service Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Service Name</em>' attribute is set.
	 * @see #unsetServiceName()
	 * @see #getServiceName()
	 * @see #setServiceName(ServiceNameEnumeration)
	 * @generated
	 */
	boolean isSetServiceName();

	/**
	 * Returns the value of the '<em><b>IBISIP Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IBISIP Version</em>' containment reference.
	 * @see #setIBISIPVersion(IBISIPNMTOKEN)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getServiceSpecificationStructure_IBISIPVersion()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='IBIS-IP-Version' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPNMTOKEN getIBISIPVersion();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.ServiceSpecificationStructure#getIBISIPVersion <em>IBISIP Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IBISIP Version</em>' containment reference.
	 * @see #getIBISIPVersion()
	 * @generated
	 */
	void setIBISIPVersion(IBISIPNMTOKEN value);

} // ServiceSpecificationStructure
