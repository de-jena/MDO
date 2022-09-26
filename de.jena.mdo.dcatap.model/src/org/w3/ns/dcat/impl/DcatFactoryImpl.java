/**
 */
package org.w3.ns.dcat.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.w3.ns.dcat.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DcatFactoryImpl extends EFactoryImpl implements DcatFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DcatFactory init() {
		try {
			DcatFactory theDcatFactory = (DcatFactory)EPackage.Registry.INSTANCE.getEFactory(DcatPackage.eNS_URI);
			if (theDcatFactory != null) {
				return theDcatFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DcatFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DcatFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DcatPackage.CATALOG: return createCatalog();
			case DcatPackage.CATALOG1: return createCatalog1();
			case DcatPackage.CATALOG_RECORD: return createCatalogRecord();
			case DcatPackage.CATALOG_RECORD_TYPE: return createCatalogRecordType();
			case DcatPackage.DATA_SERVICE_TYPE: return createDataServiceType();
			case DcatPackage.DATASET: return createDataset();
			case DcatPackage.DATASET_TYPE: return createDatasetType();
			case DcatPackage.DISTRIBUTION: return createDistribution();
			case DcatPackage.DISTRIBUTION_TYPE: return createDistributionType();
			case DcatPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case DcatPackage.RELATIONSHIP: return createRelationship();
			case DcatPackage.RELATIONSHIP_TYPE: return createRelationshipType();
			case DcatPackage.SERVICE: return createService();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Catalog createCatalog() {
		CatalogImpl catalog = new CatalogImpl();
		return catalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Catalog1 createCatalog1() {
		Catalog1Impl catalog1 = new Catalog1Impl();
		return catalog1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CatalogRecord createCatalogRecord() {
		CatalogRecordImpl catalogRecord = new CatalogRecordImpl();
		return catalogRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CatalogRecordType createCatalogRecordType() {
		CatalogRecordTypeImpl catalogRecordType = new CatalogRecordTypeImpl();
		return catalogRecordType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataServiceType createDataServiceType() {
		DataServiceTypeImpl dataServiceType = new DataServiceTypeImpl();
		return dataServiceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dataset createDataset() {
		DatasetImpl dataset = new DatasetImpl();
		return dataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatasetType createDatasetType() {
		DatasetTypeImpl datasetType = new DatasetTypeImpl();
		return datasetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Distribution createDistribution() {
		DistributionImpl distribution = new DistributionImpl();
		return distribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DistributionType createDistributionType() {
		DistributionTypeImpl distributionType = new DistributionTypeImpl();
		return distributionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Relationship createRelationship() {
		RelationshipImpl relationship = new RelationshipImpl();
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationshipType createRelationshipType() {
		RelationshipTypeImpl relationshipType = new RelationshipTypeImpl();
		return relationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DcatPackage getDcatPackage() {
		return (DcatPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DcatPackage getPackage() {
		return DcatPackage.eINSTANCE;
	}

} //DcatFactoryImpl
