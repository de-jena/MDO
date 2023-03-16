/*
 */
package de.jena.mdo.ibis.ibis_common;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Information List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.ServiceInformationList#getServiceInformation <em>Service Information</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getServiceInformationList()
 * @model extendedMetaData="name='ServiceInformationListStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ServiceInformationList extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Information</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.ibis_common.ServiceInformation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Information</em>' containment reference list.
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getServiceInformationList_ServiceInformation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ServiceInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ServiceInformation> getServiceInformation();

} // ServiceInformationList
