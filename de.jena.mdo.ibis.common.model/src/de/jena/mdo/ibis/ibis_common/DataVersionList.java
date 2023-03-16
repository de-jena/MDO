/*
 */
package de.jena.mdo.ibis.ibis_common;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Version List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.DataVersionList#getDataVersion <em>Data Version</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getDataVersionList()
 * @model extendedMetaData="name='DataVersionListStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DataVersionList extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Version</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.ibis_common.DataVersion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Version</em>' containment reference list.
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getDataVersionList_DataVersion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DataVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DataVersion> getDataVersion();

} // DataVersionList
