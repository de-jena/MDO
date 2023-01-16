/*
 */
package de.jena.mdo.ibis.common;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Version List Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.DataVersionListStructure#getDataVersion <em>Data Version</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDataVersionListStructure()
 * @model extendedMetaData="name='DataVersionListStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DataVersionListStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Version</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.common.DataVersionStructure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Version</em>' containment reference list.
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDataVersionListStructure_DataVersion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DataVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DataVersionStructure> getDataVersion();

} // DataVersionListStructure
