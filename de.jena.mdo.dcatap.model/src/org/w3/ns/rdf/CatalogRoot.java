/**
 */
package org.w3.ns.rdf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.w3.ns.dcat.Catalog1;
import org.w3.ns.dcat.CatalogRecordType;
import org.w3.ns.dcat.DataServiceType;
import org.w3.ns.dcat.DatasetType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.ns.rdf.CatalogRoot#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3.ns.rdf.CatalogRoot#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link org.w3.ns.rdf.CatalogRoot#getCatalogRecord <em>Catalog Record</em>}</li>
 *   <li>{@link org.w3.ns.rdf.CatalogRoot#getDataset <em>Dataset</em>}</li>
 *   <li>{@link org.w3.ns.rdf.CatalogRoot#getDataService <em>Data Service</em>}</li>
 * </ul>
 *
 * @see org.w3.ns.rdf.RdfPackage#getCatalogRoot()
 * @model extendedMetaData="name='CatalogRoot' kind='elementOnly'"
 * @generated
 */
public interface CatalogRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.w3.ns.rdf.RdfPackage#getCatalogRoot_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Catalog</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3.ns.dcat.Catalog1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalog</em>' containment reference list.
	 * @see org.w3.ns.rdf.RdfPackage#getCatalogRoot_Catalog()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Catalog' namespace='http://www.w3.org/ns/dcat#' group='#group:0'"
	 * @generated
	 */
	EList<Catalog1> getCatalog();

	/**
	 * Returns the value of the '<em><b>Catalog Record</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3.ns.dcat.CatalogRecordType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalog Record</em>' containment reference list.
	 * @see org.w3.ns.rdf.RdfPackage#getCatalogRoot_CatalogRecord()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CatalogRecord' namespace='http://www.w3.org/ns/dcat#' group='#group:0'"
	 * @generated
	 */
	EList<CatalogRecordType> getCatalogRecord();

	/**
	 * Returns the value of the '<em><b>Dataset</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3.ns.dcat.DatasetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataset</em>' containment reference list.
	 * @see org.w3.ns.rdf.RdfPackage#getCatalogRoot_Dataset()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Dataset' namespace='http://www.w3.org/ns/dcat#' group='#group:0'"
	 * @generated
	 */
	EList<DatasetType> getDataset();

	/**
	 * Returns the value of the '<em><b>Data Service</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3.ns.dcat.DataServiceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Service</em>' containment reference list.
	 * @see org.w3.ns.rdf.RdfPackage#getCatalogRoot_DataService()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DataService' namespace='http://www.w3.org/ns/dcat#' group='#group:0'"
	 * @generated
	 */
	EList<DataServiceType> getDataService();

} // CatalogRoot
