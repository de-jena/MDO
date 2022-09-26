/**
 */
package org.w3.ns.dcat;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.ns.dcat.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3.ns.dcat.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.w3.ns.dcat.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.w3.ns.dcat.DocumentRoot#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link org.w3.ns.dcat.DocumentRoot#getCatalogRecord <em>Catalog Record</em>}</li>
 *   <li>{@link org.w3.ns.dcat.DocumentRoot#getDataService <em>Data Service</em>}</li>
 *   <li>{@link org.w3.ns.dcat.DocumentRoot#getDataset <em>Dataset</em>}</li>
 * </ul>
 *
 * @see org.w3.ns.dcat.DcatPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.w3.ns.dcat.DcatPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.w3.ns.dcat.DcatPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.w3.ns.dcat.DcatPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Catalog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalog</em>' containment reference.
	 * @see #setCatalog(Catalog1)
	 * @see org.w3.ns.dcat.DcatPackage#getDocumentRoot_Catalog()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Catalog' namespace='##targetNamespace'"
	 * @generated
	 */
	Catalog1 getCatalog();

	/**
	 * Sets the value of the '{@link org.w3.ns.dcat.DocumentRoot#getCatalog <em>Catalog</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalog</em>' containment reference.
	 * @see #getCatalog()
	 * @generated
	 */
	void setCatalog(Catalog1 value);

	/**
	 * Returns the value of the '<em><b>Catalog Record</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalog Record</em>' containment reference.
	 * @see #setCatalogRecord(CatalogRecordType)
	 * @see org.w3.ns.dcat.DcatPackage#getDocumentRoot_CatalogRecord()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CatalogRecord' namespace='##targetNamespace'"
	 * @generated
	 */
	CatalogRecordType getCatalogRecord();

	/**
	 * Sets the value of the '{@link org.w3.ns.dcat.DocumentRoot#getCatalogRecord <em>Catalog Record</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalog Record</em>' containment reference.
	 * @see #getCatalogRecord()
	 * @generated
	 */
	void setCatalogRecord(CatalogRecordType value);

	/**
	 * Returns the value of the '<em><b>Data Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Service</em>' containment reference.
	 * @see #setDataService(DataServiceType)
	 * @see org.w3.ns.dcat.DcatPackage#getDocumentRoot_DataService()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DataService' namespace='##targetNamespace'"
	 * @generated
	 */
	DataServiceType getDataService();

	/**
	 * Sets the value of the '{@link org.w3.ns.dcat.DocumentRoot#getDataService <em>Data Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Service</em>' containment reference.
	 * @see #getDataService()
	 * @generated
	 */
	void setDataService(DataServiceType value);

	/**
	 * Returns the value of the '<em><b>Dataset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataset</em>' containment reference.
	 * @see #setDataset(DatasetType)
	 * @see org.w3.ns.dcat.DcatPackage#getDocumentRoot_Dataset()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Dataset' namespace='##targetNamespace'"
	 * @generated
	 */
	DatasetType getDataset();

	/**
	 * Sets the value of the '{@link org.w3.ns.dcat.DocumentRoot#getDataset <em>Dataset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataset</em>' containment reference.
	 * @see #getDataset()
	 * @generated
	 */
	void setDataset(DatasetType value);

} // DocumentRoot
