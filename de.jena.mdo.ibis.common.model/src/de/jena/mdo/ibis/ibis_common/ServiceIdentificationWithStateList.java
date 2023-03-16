/*
 */
package de.jena.mdo.ibis.ibis_common;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Identification With State List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.ServiceIdentificationWithStateList#getServiceIdentificationWithState <em>Service Identification With State</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getServiceIdentificationWithStateList()
 * @model extendedMetaData="name='ServiceIdentificationWithStateListStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ServiceIdentificationWithStateList extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Identification With State</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.ibis_common.ServiceIdentificationWithState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Identification With State</em>' containment reference list.
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getServiceIdentificationWithStateList_ServiceIdentificationWithState()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ServiceIdentificationWithState' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ServiceIdentificationWithState> getServiceIdentificationWithState();

} // ServiceIdentificationWithStateList
