/*
 */
package de.jena.mdo.ibis.common;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Start List Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.ServiceStartListStructure#getServiceIdentification <em>Service Identification</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getServiceStartListStructure()
 * @model extendedMetaData="name='ServiceStartListStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ServiceStartListStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Identification</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.common.ServiceIdentificationStructure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Identification</em>' containment reference list.
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getServiceStartListStructure_ServiceIdentification()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ServiceIdentification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ServiceIdentificationStructure> getServiceIdentification();

} // ServiceStartListStructure
