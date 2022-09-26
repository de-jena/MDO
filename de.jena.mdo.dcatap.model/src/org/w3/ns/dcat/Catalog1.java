/**
 */
package org.w3.ns.dcat;

import org.eclipse.emf.common.util.EList;

import org.w3.ns.rdf.Resource;

import org.w3.ns.skos.ConceptScheme;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         dcat:Catalog represents a catalog, which is a dataset in which
 *         each individual item is a metadata record
 *         describing some resource; the scope of dcat:Catalog
 *         is collections of metadata about datasets or data services.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.ns.dcat.Catalog1#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link org.w3.ns.dcat.Catalog1#getRecord <em>Record</em>}</li>
 *   <li>{@link org.w3.ns.dcat.Catalog1#getDataset <em>Dataset</em>}</li>
 *   <li>{@link org.w3.ns.dcat.Catalog1#getService <em>Service</em>}</li>
 *   <li>{@link org.w3.ns.dcat.Catalog1#getThemeTaxonomy <em>Theme Taxonomy</em>}</li>
 *   <li>{@link org.w3.ns.dcat.Catalog1#getHasPart <em>Has Part</em>}</li>
 *   <li>{@link org.w3.ns.dcat.Catalog1#getHomepage <em>Homepage</em>}</li>
 * </ul>
 *
 * @see org.w3.ns.dcat.DcatPackage#getCatalog1()
 * @model extendedMetaData="name='Catalog' kind='elementOnly'"
 * @generated
 */
public interface Catalog1 extends DatasetType {
	/**
	 * Returns the value of the '<em><b>Catalog</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3.ns.dcat.Catalog}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalog</em>' containment reference list.
	 * @see org.w3.ns.dcat.DcatPackage#getCatalog1_Catalog()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='catalog' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Catalog> getCatalog();

	/**
	 * Returns the value of the '<em><b>Record</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3.ns.dcat.CatalogRecord}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record</em>' containment reference list.
	 * @see org.w3.ns.dcat.DcatPackage#getCatalog1_Record()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='record' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CatalogRecord> getRecord();

	/**
	 * Returns the value of the '<em><b>Dataset</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3.ns.dcat.Dataset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataset</em>' containment reference list.
	 * @see org.w3.ns.dcat.DcatPackage#getCatalog1_Dataset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dataset' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Dataset> getDataset();

	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3.ns.dcat.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' containment reference list.
	 * @see org.w3.ns.dcat.DcatPackage#getCatalog1_Service()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='service' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Service> getService();

	/**
	 * Returns the value of the '<em><b>Theme Taxonomy</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3.ns.skos.ConceptScheme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Theme Taxonomy</em>' containment reference list.
	 * @see org.w3.ns.dcat.DcatPackage#getCatalog1_ThemeTaxonomy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='themeTaxonomy' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConceptScheme> getThemeTaxonomy();

	/**
	 * Returns the value of the '<em><b>Has Part</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3.ns.rdf.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Part</em>' containment reference list.
	 * @see org.w3.ns.dcat.DcatPackage#getCatalog1_HasPart()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hasPart' namespace='http://purl.org/dc/terms/'"
	 * @generated
	 */
	EList<Resource> getHasPart();

	/**
	 * Returns the value of the '<em><b>Homepage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Homepage</em>' containment reference.
	 * @see #setHomepage(Resource)
	 * @see org.w3.ns.dcat.DcatPackage#getCatalog1_Homepage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='homepage' namespace='http://xmlns.com/foaf/0.1/'"
	 * @generated
	 */
	Resource getHomepage();

	/**
	 * Sets the value of the '{@link org.w3.ns.dcat.Catalog1#getHomepage <em>Homepage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Homepage</em>' containment reference.
	 * @see #getHomepage()
	 * @generated
	 */
	void setHomepage(Resource value);

} // Catalog1
