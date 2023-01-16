/*
 */
package de.jena.mdo.ibis.common;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Specification With State List Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.ServiceSpecificationWithStateListStructure#getServiceSpecificationWithState <em>Service Specification With State</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getServiceSpecificationWithStateListStructure()
 * @model extendedMetaData="name='ServiceSpecificationWithStateListStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ServiceSpecificationWithStateListStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Specification With State</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.common.ServiceSpecificationWithStateStructure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Specification With State</em>' containment reference list.
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getServiceSpecificationWithStateListStructure_ServiceSpecificationWithState()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ServiceSpecificationWithState' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ServiceSpecificationWithStateStructure> getServiceSpecificationWithState();

} // ServiceSpecificationWithStateListStructure
