/**
 */
package org.w3.ns.dcat;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.w3.ns.dcat.DcatPackage
 * @generated
 */
public interface DcatFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DcatFactory eINSTANCE = org.w3.ns.dcat.impl.DcatFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Catalog</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Catalog</em>'.
	 * @generated
	 */
	Catalog createCatalog();

	/**
	 * Returns a new object of class '<em>Catalog1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Catalog1</em>'.
	 * @generated
	 */
	Catalog1 createCatalog1();

	/**
	 * Returns a new object of class '<em>Catalog Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Catalog Record</em>'.
	 * @generated
	 */
	CatalogRecord createCatalogRecord();

	/**
	 * Returns a new object of class '<em>Catalog Record Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Catalog Record Type</em>'.
	 * @generated
	 */
	CatalogRecordType createCatalogRecordType();

	/**
	 * Returns a new object of class '<em>Data Service Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Service Type</em>'.
	 * @generated
	 */
	DataServiceType createDataServiceType();

	/**
	 * Returns a new object of class '<em>Dataset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dataset</em>'.
	 * @generated
	 */
	Dataset createDataset();

	/**
	 * Returns a new object of class '<em>Dataset Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dataset Type</em>'.
	 * @generated
	 */
	DatasetType createDatasetType();

	/**
	 * Returns a new object of class '<em>Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Distribution</em>'.
	 * @generated
	 */
	Distribution createDistribution();

	/**
	 * Returns a new object of class '<em>Distribution Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Distribution Type</em>'.
	 * @generated
	 */
	DistributionType createDistributionType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship</em>'.
	 * @generated
	 */
	Relationship createRelationship();

	/**
	 * Returns a new object of class '<em>Relationship Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship Type</em>'.
	 * @generated
	 */
	RelationshipType createRelationshipType();

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	Service createService();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DcatPackage getDcatPackage();

} //DcatFactory
