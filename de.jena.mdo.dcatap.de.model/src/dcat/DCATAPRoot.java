/**
 */
package dcat;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DCATAP Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dcat.DCATAPRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link dcat.DCATAPRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link dcat.DCATAPRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link dcat.DCATAPRoot#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link dcat.DCATAPRoot#getCatalogRecord <em>Catalog Record</em>}</li>
 *   <li>{@link dcat.DCATAPRoot#getDataService <em>Data Service</em>}</li>
 *   <li>{@link dcat.DCATAPRoot#getDataset <em>Dataset</em>}</li>
 *   <li>{@link dcat.DCATAPRoot#getDistribution <em>Distribution</em>}</li>
 * </ul>
 *
 * @see dcat.DcatPackage#getDCATAPRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DCATAPRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see dcat.DcatPackage#getDCATAPRoot_Mixed()
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
	 * @see dcat.DcatPackage#getDCATAPRoot_XMLNSPrefixMap()
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
	 * @see dcat.DcatPackage#getDCATAPRoot_XSISchemaLocation()
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
	 * @see #setCatalog(Catalog)
	 * @see dcat.DcatPackage#getDCATAPRoot_Catalog()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Catalog' namespace='##targetNamespace'"
	 * @generated
	 */
	Catalog getCatalog();

	/**
	 * Sets the value of the '{@link dcat.DCATAPRoot#getCatalog <em>Catalog</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalog</em>' containment reference.
	 * @see #getCatalog()
	 * @generated
	 */
	void setCatalog(Catalog value);

	/**
	 * Returns the value of the '<em><b>Catalog Record</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalog Record</em>' containment reference.
	 * @see #setCatalogRecord(CatalogRecord)
	 * @see dcat.DcatPackage#getDCATAPRoot_CatalogRecord()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CatalogRecord' namespace='##targetNamespace'"
	 * @generated
	 */
	CatalogRecord getCatalogRecord();

	/**
	 * Sets the value of the '{@link dcat.DCATAPRoot#getCatalogRecord <em>Catalog Record</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalog Record</em>' containment reference.
	 * @see #getCatalogRecord()
	 * @generated
	 */
	void setCatalogRecord(CatalogRecord value);

	/**
	 * Returns the value of the '<em><b>Data Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Service</em>' containment reference.
	 * @see #setDataService(DataService)
	 * @see dcat.DcatPackage#getDCATAPRoot_DataService()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DataService' namespace='##targetNamespace'"
	 * @generated
	 */
	DataService getDataService();

	/**
	 * Sets the value of the '{@link dcat.DCATAPRoot#getDataService <em>Data Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Service</em>' containment reference.
	 * @see #getDataService()
	 * @generated
	 */
	void setDataService(DataService value);

	/**
	 * Returns the value of the '<em><b>Dataset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataset</em>' containment reference.
	 * @see #setDataset(Dataset)
	 * @see dcat.DcatPackage#getDCATAPRoot_Dataset()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Dataset' namespace='##targetNamespace'"
	 * @generated
	 */
	Dataset getDataset();

	/**
	 * Sets the value of the '{@link dcat.DCATAPRoot#getDataset <em>Dataset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataset</em>' containment reference.
	 * @see #getDataset()
	 * @generated
	 */
	void setDataset(Dataset value);

	/**
	 * Returns the value of the '<em><b>Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution</em>' containment reference.
	 * @see #setDistribution(Distribution)
	 * @see dcat.DcatPackage#getDCATAPRoot_Distribution()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Distribution' namespace='##targetNamespace'"
	 * @generated
	 */
	Distribution getDistribution();

	/**
	 * Sets the value of the '{@link dcat.DCATAPRoot#getDistribution <em>Distribution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribution</em>' containment reference.
	 * @see #getDistribution()
	 * @generated
	 */
	void setDistribution(Distribution value);

} // DCATAPRoot
