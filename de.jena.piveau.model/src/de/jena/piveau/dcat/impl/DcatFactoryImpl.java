/**
 */
package de.jena.piveau.dcat.impl;

import de.jena.piveau.dcat.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
			case DcatPackage.DATASET: return createDataset();
			case DcatPackage.DISTRIBUTION: return createDistribution();
			case DcatPackage.RELATIONSHIP: return createRelationship();
			case DcatPackage.CATALOG_RECORD: return createCatalogRecord();
			case DcatPackage.DATA_SERVICE: return createDataService();
			case DcatPackage.DCATAP_ROOT: return createDCATAPRoot();
			case DcatPackage.DATASET_CONTAINER: return createDatasetContainer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Catalog createCatalog() {
		CatalogImpl catalog = new CatalogImpl();
		return catalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dataset createDataset() {
		DatasetImpl dataset = new DatasetImpl();
		return dataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Distribution createDistribution() {
		DistributionImpl distribution = new DistributionImpl();
		return distribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship createRelationship() {
		RelationshipImpl relationship = new RelationshipImpl();
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogRecord createCatalogRecord() {
		CatalogRecordImpl catalogRecord = new CatalogRecordImpl();
		return catalogRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataService createDataService() {
		DataServiceImpl dataService = new DataServiceImpl();
		return dataService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DCATAPRoot createDCATAPRoot() {
		DCATAPRootImpl dcatapRoot = new DCATAPRootImpl();
		return dcatapRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetContainer createDatasetContainer() {
		DatasetContainerImpl datasetContainer = new DatasetContainerImpl();
		return datasetContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
