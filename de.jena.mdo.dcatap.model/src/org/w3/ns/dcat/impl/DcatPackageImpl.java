/**
 */
package org.w3.ns.dcat.impl;

import com.xmlns.foaf.foaf.FoafPackage;

import com.xmlns.foaf.foaf.impl.FoafPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.purl.dc.terms.terms.TermsPackage;

import org.purl.dc.terms.terms.impl.TermsPackageImpl;

import org.schema.schema.SchemaPackage;

import org.schema.schema.impl.SchemaPackageImpl;

import org.w3.ns.adms.AdmsPackage;

import org.w3.ns.adms.impl.AdmsPackageImpl;

import org.w3.ns.dcat.Catalog;
import org.w3.ns.dcat.Catalog1;
import org.w3.ns.dcat.CatalogRecord;
import org.w3.ns.dcat.CatalogRecordType;
import org.w3.ns.dcat.DataServiceType;
import org.w3.ns.dcat.Dataset;
import org.w3.ns.dcat.DatasetType;
import org.w3.ns.dcat.DcatFactory;
import org.w3.ns.dcat.DcatPackage;
import org.w3.ns.dcat.Distribution;
import org.w3.ns.dcat.DistributionType;
import org.w3.ns.dcat.DocumentRoot;
import org.w3.ns.dcat.Relationship;
import org.w3.ns.dcat.RelationshipType;
import org.w3.ns.dcat.ResourceType;
import org.w3.ns.dcat.Service;

import org.w3.ns.locn.LocnPackage;

import org.w3.ns.locn.impl.LocnPackageImpl;

import org.w3.ns.odrl.OdrlPackage;

import org.w3.ns.odrl.impl.OdrlPackageImpl;

import org.w3.ns.owl.OwlPackage;

import org.w3.ns.owl.impl.OwlPackageImpl;

import org.w3.ns.prov.ProvPackage;

import org.w3.ns.prov.impl.ProvPackageImpl;

import org.w3.ns.rdf.RdfPackage;

import org.w3.ns.rdf.impl.RdfPackageImpl;

import org.w3.ns.skos.SkosPackage;

import org.w3.ns.skos.impl.SkosPackageImpl;

import org.w3.ns.vcard.VcardPackage;

import org.w3.ns.vcard.impl.VcardPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DcatPackageImpl extends EPackageImpl implements DcatPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalog1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogRecordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogRecordTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataServiceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datasetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datasetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distributionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.w3.ns.dcat.DcatPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DcatPackageImpl() {
		super(eNS_URI, DcatFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DcatPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DcatPackage init() {
		if (isInited) return (DcatPackage)EPackage.Registry.INSTANCE.getEPackage(DcatPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDcatPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DcatPackageImpl theDcatPackage = registeredDcatPackage instanceof DcatPackageImpl ? (DcatPackageImpl)registeredDcatPackage : new DcatPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI);
		TermsPackageImpl theTermsPackage = (TermsPackageImpl)(registeredPackage instanceof TermsPackageImpl ? registeredPackage : TermsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RdfPackage.eNS_URI);
		RdfPackageImpl theRdfPackage = (RdfPackageImpl)(registeredPackage instanceof RdfPackageImpl ? registeredPackage : RdfPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SkosPackage.eNS_URI);
		SkosPackageImpl theSkosPackage = (SkosPackageImpl)(registeredPackage instanceof SkosPackageImpl ? registeredPackage : SkosPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(VcardPackage.eNS_URI);
		VcardPackageImpl theVcardPackage = (VcardPackageImpl)(registeredPackage instanceof VcardPackageImpl ? registeredPackage : VcardPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FoafPackage.eNS_URI);
		FoafPackageImpl theFoafPackage = (FoafPackageImpl)(registeredPackage instanceof FoafPackageImpl ? registeredPackage : FoafPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SchemaPackage.eNS_URI);
		SchemaPackageImpl theSchemaPackage = (SchemaPackageImpl)(registeredPackage instanceof SchemaPackageImpl ? registeredPackage : SchemaPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LocnPackage.eNS_URI);
		LocnPackageImpl theLocnPackage = (LocnPackageImpl)(registeredPackage instanceof LocnPackageImpl ? registeredPackage : LocnPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OdrlPackage.eNS_URI);
		OdrlPackageImpl theOdrlPackage = (OdrlPackageImpl)(registeredPackage instanceof OdrlPackageImpl ? registeredPackage : OdrlPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AdmsPackage.eNS_URI);
		AdmsPackageImpl theAdmsPackage = (AdmsPackageImpl)(registeredPackage instanceof AdmsPackageImpl ? registeredPackage : AdmsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ProvPackage.eNS_URI);
		ProvPackageImpl theProvPackage = (ProvPackageImpl)(registeredPackage instanceof ProvPackageImpl ? registeredPackage : ProvPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OwlPackage.eNS_URI);
		OwlPackageImpl theOwlPackage = (OwlPackageImpl)(registeredPackage instanceof OwlPackageImpl ? registeredPackage : OwlPackage.eINSTANCE);

		// Create package meta-data objects
		theDcatPackage.createPackageContents();
		theTermsPackage.createPackageContents();
		theRdfPackage.createPackageContents();
		theSkosPackage.createPackageContents();
		theVcardPackage.createPackageContents();
		theFoafPackage.createPackageContents();
		theSchemaPackage.createPackageContents();
		theLocnPackage.createPackageContents();
		theOdrlPackage.createPackageContents();
		theAdmsPackage.createPackageContents();
		theProvPackage.createPackageContents();
		theOwlPackage.createPackageContents();

		// Initialize created meta-data
		theDcatPackage.initializePackageContents();
		theTermsPackage.initializePackageContents();
		theRdfPackage.initializePackageContents();
		theSkosPackage.initializePackageContents();
		theVcardPackage.initializePackageContents();
		theFoafPackage.initializePackageContents();
		theSchemaPackage.initializePackageContents();
		theLocnPackage.initializePackageContents();
		theOdrlPackage.initializePackageContents();
		theAdmsPackage.initializePackageContents();
		theProvPackage.initializePackageContents();
		theOwlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDcatPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DcatPackage.eNS_URI, theDcatPackage);
		return theDcatPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCatalog() {
		return catalogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalog_Catalog() {
		return (EReference)catalogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCatalog1() {
		return catalog1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalog1_Catalog() {
		return (EReference)catalog1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalog1_Record() {
		return (EReference)catalog1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalog1_Dataset() {
		return (EReference)catalog1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalog1_Service() {
		return (EReference)catalog1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalog1_ThemeTaxonomy() {
		return (EReference)catalog1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalog1_HasPart() {
		return (EReference)catalog1EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalog1_Homepage() {
		return (EReference)catalog1EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCatalogRecord() {
		return catalogRecordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalogRecord_CatalogRecord() {
		return (EReference)catalogRecordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCatalogRecordType() {
		return catalogRecordTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalogRecordType_Title() {
		return (EReference)catalogRecordTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalogRecordType_Description() {
		return (EReference)catalogRecordTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalogRecordType_Issued() {
		return (EReference)catalogRecordTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalogRecordType_Modified() {
		return (EReference)catalogRecordTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalogRecordType_PrimaryTopic() {
		return (EReference)catalogRecordTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalogRecordType_ConformsTo() {
		return (EReference)catalogRecordTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalogRecordType_Language() {
		return (EReference)catalogRecordTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogRecordType_About() {
		return (EAttribute)catalogRecordTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataServiceType() {
		return dataServiceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataServiceType_EndpointDescription() {
		return (EAttribute)dataServiceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataServiceType_EndpointURL() {
		return (EAttribute)dataServiceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataServiceType_ServesDataset() {
		return (EReference)dataServiceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataset() {
		return datasetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataset_Dataset() {
		return (EReference)datasetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatasetType() {
		return datasetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatasetType_Distribution() {
		return (EReference)datasetTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatasetType_SpatialResolutionInMeters() {
		return (EAttribute)datasetTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatasetType_TemporalResolution() {
		return (EAttribute)datasetTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatasetType_AccrualPeriodicity() {
		return (EReference)datasetTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatasetType_Spatial() {
		return (EReference)datasetTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatasetType_Temporal() {
		return (EReference)datasetTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatasetType_WasGeneratedBy() {
		return (EAttribute)datasetTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDistribution() {
		return distributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDistribution_Distribution() {
		return (EReference)distributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDistribution_Resource() {
		return (EAttribute)distributionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDistributionType() {
		return distributionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDistributionType_Title() {
		return (EReference)distributionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDistributionType_Description() {
		return (EReference)distributionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDistributionType_AccessService() {
		return (EReference)distributionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDistributionType_AccessURL() {
		return (EAttribute)distributionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDistributionType_DownloadURL() {
		return (EAttribute)distributionTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDistributionType_Format() {
		return (EReference)distributionTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDistributionType_MediaType() {
		return (EAttribute)distributionTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDistributionType_PackageFormat() {
		return (EAttribute)distributionTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDistributionType_ByteSize() {
		return (EAttribute)distributionTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDistributionType_CompressFormat() {
		return (EReference)distributionTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDistributionType_SpatialResolutionInMeters() {
		return (EAttribute)distributionTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDistributionType_TemporalResolution() {
		return (EAttribute)distributionTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDistributionType_AccessRights() {
		return (EReference)distributionTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDistributionType_License() {
		return (EReference)distributionTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDistributionType_ConformsTo() {
		return (EReference)distributionTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDistributionType_Rights() {
		return (EReference)distributionTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDistributionType_HasPolicy() {
		return (EAttribute)distributionTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDistributionType_Issued() {
		return (EReference)distributionTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDistributionType_Modified() {
		return (EReference)distributionTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDistributionType_About() {
		return (EAttribute)distributionTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDistributionType_NodeID() {
		return (EAttribute)distributionTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Catalog() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_CatalogRecord() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DataService() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Dataset() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelationship() {
		return relationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationship_Relationship() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelationshipType() {
		return relationshipTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationshipType_HadRole() {
		return (EReference)relationshipTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationshipType_Description() {
		return (EReference)relationshipTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelationshipType_About() {
		return (EAttribute)relationshipTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelationshipType_NodeID() {
		return (EAttribute)relationshipTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceType() {
		return resourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceType_Identifier() {
		return (EReference)resourceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceType_Title() {
		return (EReference)resourceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceType_Description() {
		return (EReference)resourceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceType_Theme() {
		return (EReference)resourceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceType_Keyword() {
		return (EReference)resourceTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceType_Type() {
		return (EReference)resourceTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceType_ContactPoint() {
		return (EReference)resourceTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceType_Creator() {
		return (EReference)resourceTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceType_Publisher() {
		return (EReference)resourceTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceType_Issued() {
		return (EReference)resourceTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceType_Modified() {
		return (EReference)resourceTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceType_LandingPage() {
		return (EReference)resourceTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceType_AccessRights() {
		return (EReference)resourceTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceType_ConformsTo() {
		return (EReference)resourceTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceType_License() {
		return (EReference)resourceTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceType_Rights() {
		return (EReference)resourceTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceType_HasPolicy() {
		return (EAttribute)resourceTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceType_QualifiedAttribution() {
		return (EAttribute)resourceTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceType_Relation() {
		return (EReference)resourceTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceType_QualifiedRelation() {
		return (EReference)resourceTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceType_IsReferencedBy() {
		return (EReference)resourceTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceType_Language() {
		return (EReference)resourceTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceType_About() {
		return (EAttribute)resourceTypeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getService_DataService() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DcatFactory getDcatFactory() {
		return (DcatFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		catalogEClass = createEClass(CATALOG);
		createEReference(catalogEClass, CATALOG__CATALOG);

		catalog1EClass = createEClass(CATALOG1);
		createEReference(catalog1EClass, CATALOG1__CATALOG);
		createEReference(catalog1EClass, CATALOG1__RECORD);
		createEReference(catalog1EClass, CATALOG1__DATASET);
		createEReference(catalog1EClass, CATALOG1__SERVICE);
		createEReference(catalog1EClass, CATALOG1__THEME_TAXONOMY);
		createEReference(catalog1EClass, CATALOG1__HAS_PART);
		createEReference(catalog1EClass, CATALOG1__HOMEPAGE);

		catalogRecordEClass = createEClass(CATALOG_RECORD);
		createEReference(catalogRecordEClass, CATALOG_RECORD__CATALOG_RECORD);

		catalogRecordTypeEClass = createEClass(CATALOG_RECORD_TYPE);
		createEReference(catalogRecordTypeEClass, CATALOG_RECORD_TYPE__TITLE);
		createEReference(catalogRecordTypeEClass, CATALOG_RECORD_TYPE__DESCRIPTION);
		createEReference(catalogRecordTypeEClass, CATALOG_RECORD_TYPE__ISSUED);
		createEReference(catalogRecordTypeEClass, CATALOG_RECORD_TYPE__MODIFIED);
		createEReference(catalogRecordTypeEClass, CATALOG_RECORD_TYPE__PRIMARY_TOPIC);
		createEReference(catalogRecordTypeEClass, CATALOG_RECORD_TYPE__CONFORMS_TO);
		createEReference(catalogRecordTypeEClass, CATALOG_RECORD_TYPE__LANGUAGE);
		createEAttribute(catalogRecordTypeEClass, CATALOG_RECORD_TYPE__ABOUT);

		dataServiceTypeEClass = createEClass(DATA_SERVICE_TYPE);
		createEAttribute(dataServiceTypeEClass, DATA_SERVICE_TYPE__ENDPOINT_DESCRIPTION);
		createEAttribute(dataServiceTypeEClass, DATA_SERVICE_TYPE__ENDPOINT_URL);
		createEReference(dataServiceTypeEClass, DATA_SERVICE_TYPE__SERVES_DATASET);

		datasetEClass = createEClass(DATASET);
		createEReference(datasetEClass, DATASET__DATASET);

		datasetTypeEClass = createEClass(DATASET_TYPE);
		createEReference(datasetTypeEClass, DATASET_TYPE__DISTRIBUTION);
		createEAttribute(datasetTypeEClass, DATASET_TYPE__SPATIAL_RESOLUTION_IN_METERS);
		createEAttribute(datasetTypeEClass, DATASET_TYPE__TEMPORAL_RESOLUTION);
		createEReference(datasetTypeEClass, DATASET_TYPE__ACCRUAL_PERIODICITY);
		createEReference(datasetTypeEClass, DATASET_TYPE__SPATIAL);
		createEReference(datasetTypeEClass, DATASET_TYPE__TEMPORAL);
		createEAttribute(datasetTypeEClass, DATASET_TYPE__WAS_GENERATED_BY);

		distributionEClass = createEClass(DISTRIBUTION);
		createEReference(distributionEClass, DISTRIBUTION__DISTRIBUTION);
		createEAttribute(distributionEClass, DISTRIBUTION__RESOURCE);

		distributionTypeEClass = createEClass(DISTRIBUTION_TYPE);
		createEReference(distributionTypeEClass, DISTRIBUTION_TYPE__TITLE);
		createEReference(distributionTypeEClass, DISTRIBUTION_TYPE__DESCRIPTION);
		createEReference(distributionTypeEClass, DISTRIBUTION_TYPE__ACCESS_SERVICE);
		createEAttribute(distributionTypeEClass, DISTRIBUTION_TYPE__ACCESS_URL);
		createEAttribute(distributionTypeEClass, DISTRIBUTION_TYPE__DOWNLOAD_URL);
		createEReference(distributionTypeEClass, DISTRIBUTION_TYPE__FORMAT);
		createEAttribute(distributionTypeEClass, DISTRIBUTION_TYPE__MEDIA_TYPE);
		createEAttribute(distributionTypeEClass, DISTRIBUTION_TYPE__PACKAGE_FORMAT);
		createEAttribute(distributionTypeEClass, DISTRIBUTION_TYPE__BYTE_SIZE);
		createEReference(distributionTypeEClass, DISTRIBUTION_TYPE__COMPRESS_FORMAT);
		createEAttribute(distributionTypeEClass, DISTRIBUTION_TYPE__SPATIAL_RESOLUTION_IN_METERS);
		createEAttribute(distributionTypeEClass, DISTRIBUTION_TYPE__TEMPORAL_RESOLUTION);
		createEReference(distributionTypeEClass, DISTRIBUTION_TYPE__ACCESS_RIGHTS);
		createEReference(distributionTypeEClass, DISTRIBUTION_TYPE__LICENSE);
		createEReference(distributionTypeEClass, DISTRIBUTION_TYPE__CONFORMS_TO);
		createEReference(distributionTypeEClass, DISTRIBUTION_TYPE__RIGHTS);
		createEAttribute(distributionTypeEClass, DISTRIBUTION_TYPE__HAS_POLICY);
		createEReference(distributionTypeEClass, DISTRIBUTION_TYPE__ISSUED);
		createEReference(distributionTypeEClass, DISTRIBUTION_TYPE__MODIFIED);
		createEAttribute(distributionTypeEClass, DISTRIBUTION_TYPE__ABOUT);
		createEAttribute(distributionTypeEClass, DISTRIBUTION_TYPE__NODE_ID);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CATALOG);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CATALOG_RECORD);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DATA_SERVICE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DATASET);

		relationshipEClass = createEClass(RELATIONSHIP);
		createEReference(relationshipEClass, RELATIONSHIP__RELATIONSHIP);

		relationshipTypeEClass = createEClass(RELATIONSHIP_TYPE);
		createEReference(relationshipTypeEClass, RELATIONSHIP_TYPE__HAD_ROLE);
		createEReference(relationshipTypeEClass, RELATIONSHIP_TYPE__DESCRIPTION);
		createEAttribute(relationshipTypeEClass, RELATIONSHIP_TYPE__ABOUT);
		createEAttribute(relationshipTypeEClass, RELATIONSHIP_TYPE__NODE_ID);

		resourceTypeEClass = createEClass(RESOURCE_TYPE);
		createEReference(resourceTypeEClass, RESOURCE_TYPE__IDENTIFIER);
		createEReference(resourceTypeEClass, RESOURCE_TYPE__TITLE);
		createEReference(resourceTypeEClass, RESOURCE_TYPE__DESCRIPTION);
		createEReference(resourceTypeEClass, RESOURCE_TYPE__THEME);
		createEReference(resourceTypeEClass, RESOURCE_TYPE__KEYWORD);
		createEReference(resourceTypeEClass, RESOURCE_TYPE__TYPE);
		createEReference(resourceTypeEClass, RESOURCE_TYPE__CONTACT_POINT);
		createEReference(resourceTypeEClass, RESOURCE_TYPE__CREATOR);
		createEReference(resourceTypeEClass, RESOURCE_TYPE__PUBLISHER);
		createEReference(resourceTypeEClass, RESOURCE_TYPE__ISSUED);
		createEReference(resourceTypeEClass, RESOURCE_TYPE__MODIFIED);
		createEReference(resourceTypeEClass, RESOURCE_TYPE__LANDING_PAGE);
		createEReference(resourceTypeEClass, RESOURCE_TYPE__ACCESS_RIGHTS);
		createEReference(resourceTypeEClass, RESOURCE_TYPE__CONFORMS_TO);
		createEReference(resourceTypeEClass, RESOURCE_TYPE__LICENSE);
		createEReference(resourceTypeEClass, RESOURCE_TYPE__RIGHTS);
		createEAttribute(resourceTypeEClass, RESOURCE_TYPE__HAS_POLICY);
		createEAttribute(resourceTypeEClass, RESOURCE_TYPE__QUALIFIED_ATTRIBUTION);
		createEReference(resourceTypeEClass, RESOURCE_TYPE__RELATION);
		createEReference(resourceTypeEClass, RESOURCE_TYPE__QUALIFIED_RELATION);
		createEReference(resourceTypeEClass, RESOURCE_TYPE__IS_REFERENCED_BY);
		createEReference(resourceTypeEClass, RESOURCE_TYPE__LANGUAGE);
		createEAttribute(resourceTypeEClass, RESOURCE_TYPE__ABOUT);

		serviceEClass = createEClass(SERVICE);
		createEReference(serviceEClass, SERVICE__DATA_SERVICE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SkosPackage theSkosPackage = (SkosPackage)EPackage.Registry.INSTANCE.getEPackage(SkosPackage.eNS_URI);
		RdfPackage theRdfPackage = (RdfPackage)EPackage.Registry.INSTANCE.getEPackage(RdfPackage.eNS_URI);
		TermsPackage theTermsPackage = (TermsPackage)EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		VcardPackage theVcardPackage = (VcardPackage)EPackage.Registry.INSTANCE.getEPackage(VcardPackage.eNS_URI);
		FoafPackage theFoafPackage = (FoafPackage)EPackage.Registry.INSTANCE.getEPackage(FoafPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		catalog1EClass.getESuperTypes().add(this.getDatasetType());
		dataServiceTypeEClass.getESuperTypes().add(this.getResourceType());
		datasetTypeEClass.getESuperTypes().add(this.getResourceType());

		// Initialize classes, features, and operations; add parameters
		initEClass(catalogEClass, Catalog.class, "Catalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCatalog_Catalog(), this.getCatalog1(), null, "catalog", null, 1, 1, Catalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(catalog1EClass, Catalog1.class, "Catalog1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCatalog1_Catalog(), this.getCatalog(), null, "catalog", null, 0, -1, Catalog1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalog1_Record(), this.getCatalogRecord(), null, "record", null, 0, -1, Catalog1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalog1_Dataset(), this.getDataset(), null, "dataset", null, 0, -1, Catalog1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalog1_Service(), this.getService(), null, "service", null, 0, -1, Catalog1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalog1_ThemeTaxonomy(), theSkosPackage.getConceptScheme(), null, "themeTaxonomy", null, 0, -1, Catalog1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalog1_HasPart(), theRdfPackage.getResource(), null, "hasPart", null, 0, -1, Catalog1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalog1_Homepage(), theRdfPackage.getResource(), null, "homepage", null, 0, 1, Catalog1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(catalogRecordEClass, CatalogRecord.class, "CatalogRecord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCatalogRecord_CatalogRecord(), this.getCatalogRecordType(), null, "catalogRecord", null, 1, 1, CatalogRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(catalogRecordTypeEClass, CatalogRecordType.class, "CatalogRecordType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCatalogRecordType_Title(), theRdfPackage.getPlainLiteral(), null, "title", null, 0, -1, CatalogRecordType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalogRecordType_Description(), theRdfPackage.getPlainLiteral(), null, "description", null, 0, -1, CatalogRecordType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalogRecordType_Issued(), theRdfPackage.getDateOrDateTimeLiteral(), null, "issued", null, 0, 1, CatalogRecordType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalogRecordType_Modified(), theRdfPackage.getDateOrDateTimeLiteral(), null, "modified", null, 1, 1, CatalogRecordType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalogRecordType_PrimaryTopic(), theRdfPackage.getResource(), null, "primaryTopic", null, 1, 1, CatalogRecordType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalogRecordType_ConformsTo(), theTermsPackage.getStandard(), null, "conformsTo", null, 0, 1, CatalogRecordType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalogRecordType_Language(), theRdfPackage.getResource(), null, "language", null, 0, -1, CatalogRecordType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogRecordType_About(), theXMLTypePackage.getAnyURI(), "about", null, 0, 1, CatalogRecordType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataServiceTypeEClass, DataServiceType.class, "DataServiceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataServiceType_EndpointDescription(), theXMLTypePackage.getString(), "endpointDescription", null, 0, -1, DataServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataServiceType_EndpointURL(), theXMLTypePackage.getString(), "endpointURL", null, 0, -1, DataServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataServiceType_ServesDataset(), this.getDataset(), null, "servesDataset", null, 0, 1, DataServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datasetEClass, Dataset.class, "Dataset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataset_Dataset(), this.getDatasetType(), null, "dataset", null, 1, 1, Dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datasetTypeEClass, DatasetType.class, "DatasetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatasetType_Distribution(), this.getDistribution(), null, "distribution", null, 0, -1, DatasetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatasetType_SpatialResolutionInMeters(), theXMLTypePackage.getDecimal(), "spatialResolutionInMeters", null, 0, -1, DatasetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatasetType_TemporalResolution(), theXMLTypePackage.getDuration(), "temporalResolution", null, 0, -1, DatasetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatasetType_AccrualPeriodicity(), theSkosPackage.getConcept(), null, "accrualPeriodicity", null, 0, 1, DatasetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatasetType_Spatial(), theTermsPackage.getLocation(), null, "spatial", null, 0, -1, DatasetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatasetType_Temporal(), theTermsPackage.getPeriodOfTime(), null, "temporal", null, 0, -1, DatasetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatasetType_WasGeneratedBy(), theXMLTypePackage.getAnyURI(), "wasGeneratedBy", null, 0, -1, DatasetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(distributionEClass, Distribution.class, "Distribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDistribution_Distribution(), this.getDistributionType(), null, "distribution", null, 1, 1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistribution_Resource(), ecorePackage.getEString(), "resource", null, 0, 1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(distributionTypeEClass, DistributionType.class, "DistributionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDistributionType_Title(), theRdfPackage.getPlainLiteral(), null, "title", null, 0, 1, DistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistributionType_Description(), theRdfPackage.getPlainLiteral(), null, "description", null, 1, -1, DistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistributionType_AccessService(), this.getDataServiceType(), null, "accessService", null, 1, -1, DistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistributionType_AccessURL(), theXMLTypePackage.getString(), "accessURL", null, 1, -1, DistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistributionType_DownloadURL(), theXMLTypePackage.getString(), "downloadURL", null, 1, -1, DistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistributionType_Format(), theSkosPackage.getConcept(), null, "format", null, 0, 1, DistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistributionType_MediaType(), theXMLTypePackage.getString(), "mediaType", null, 1, -1, DistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistributionType_PackageFormat(), theXMLTypePackage.getString(), "packageFormat", null, 1, -1, DistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistributionType_ByteSize(), theXMLTypePackage.getDecimal(), "byteSize", null, 1, -1, DistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistributionType_CompressFormat(), ecorePackage.getEObject(), null, "compressFormat", null, 1, -1, DistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistributionType_SpatialResolutionInMeters(), theXMLTypePackage.getDecimal(), "spatialResolutionInMeters", null, 1, -1, DistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistributionType_TemporalResolution(), theXMLTypePackage.getDuration(), "temporalResolution", null, 1, -1, DistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistributionType_AccessRights(), theSkosPackage.getConcept(), null, "accessRights", null, 1, -1, DistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistributionType_License(), theTermsPackage.getLicenseDocument(), null, "license", null, 1, 1, DistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistributionType_ConformsTo(), theTermsPackage.getStandard(), null, "conformsTo", null, 0, -1, DistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistributionType_Rights(), theTermsPackage.getRightsStatement(), null, "rights", null, 0, 1, DistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistributionType_HasPolicy(), theXMLTypePackage.getAnyURI(), "hasPolicy", null, 0, 1, DistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistributionType_Issued(), theRdfPackage.getDateOrDateTimeLiteral(), null, "issued", null, 0, 1, DistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistributionType_Modified(), theRdfPackage.getDateOrDateTimeLiteral(), null, "modified", null, 0, 1, DistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistributionType_About(), theXMLTypePackage.getAnyURI(), "about", null, 0, 1, DistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistributionType_NodeID(), theXMLTypePackage.getNCName(), "nodeID", null, 0, 1, DistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Catalog(), this.getCatalog1(), null, "catalog", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_CatalogRecord(), this.getCatalogRecordType(), null, "catalogRecord", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DataService(), this.getDataServiceType(), null, "dataService", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Dataset(), this.getDatasetType(), null, "dataset", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(relationshipEClass, Relationship.class, "Relationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationship_Relationship(), this.getRelationshipType(), null, "relationship", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipTypeEClass, RelationshipType.class, "RelationshipType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationshipType_HadRole(), ecorePackage.getEObject(), null, "hadRole", null, 0, 1, RelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipType_Description(), theRdfPackage.getPlainLiteral(), null, "description", null, 0, 1, RelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipType_About(), theXMLTypePackage.getAnyURI(), "about", null, 0, 1, RelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipType_NodeID(), theXMLTypePackage.getNCName(), "nodeID", null, 0, 1, RelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceTypeEClass, ResourceType.class, "ResourceType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceType_Identifier(), theRdfPackage.getPlainLiteral(), null, "identifier", null, 0, -1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceType_Title(), theRdfPackage.getPlainLiteral(), null, "title", null, 1, -1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceType_Description(), theRdfPackage.getPlainLiteral(), null, "description", null, 1, -1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceType_Theme(), theSkosPackage.getConcept(), null, "theme", null, 0, -1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceType_Keyword(), theRdfPackage.getPlainLiteral(), null, "keyword", null, 0, -1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceType_Type(), theSkosPackage.getConcept(), null, "type", null, 0, -1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceType_ContactPoint(), theVcardPackage.getOrganization(), null, "contactPoint", null, 0, -1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceType_Creator(), theFoafPackage.getAgent(), null, "creator", null, 0, 1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceType_Publisher(), theFoafPackage.getAgent(), null, "publisher", null, 0, 1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceType_Issued(), theRdfPackage.getDateOrDateTimeLiteral(), null, "issued", null, 0, 1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceType_Modified(), theRdfPackage.getDateOrDateTimeLiteral(), null, "modified", null, 0, 1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceType_LandingPage(), theFoafPackage.getDocument(), null, "landingPage", null, 0, -1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceType_AccessRights(), theSkosPackage.getConcept(), null, "accessRights", null, 0, 1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceType_ConformsTo(), theTermsPackage.getStandard(), null, "conformsTo", null, 0, -1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceType_License(), theTermsPackage.getLicenseDocument(), null, "license", null, 0, 1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceType_Rights(), theTermsPackage.getRightsStatement(), null, "rights", null, 0, -1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceType_HasPolicy(), theXMLTypePackage.getAnyURI(), "hasPolicy", null, 0, 1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceType_QualifiedAttribution(), theXMLTypePackage.getAnyURI(), "qualifiedAttribution", null, 0, -1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceType_Relation(), theRdfPackage.getResource(), null, "relation", null, 0, -1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceType_QualifiedRelation(), this.getRelationship(), null, "qualifiedRelation", null, 0, -1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceType_IsReferencedBy(), theRdfPackage.getResource(), null, "isReferencedBy", null, 0, -1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceType_Language(), theRdfPackage.getResource(), null, "language", null, 0, -1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceType_About(), theXMLTypePackage.getAnyURI(), "about", null, 0, 1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getService_DataService(), this.getDataServiceType(), null, "dataService", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (catalogEClass,
		   source,
		   new String[] {
			   "name", "catalog",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCatalog_Catalog(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Catalog",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (catalog1EClass,
		   source,
		   new String[] {
			   "name", "Catalog",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCatalog1_Catalog(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "catalog",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCatalog1_Record(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "record",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCatalog1_Dataset(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dataset",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCatalog1_Service(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "service",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCatalog1_ThemeTaxonomy(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "themeTaxonomy",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCatalog1_HasPart(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hasPart",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getCatalog1_Homepage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "homepage",
			   "namespace", "http://xmlns.com/foaf/0.1/"
		   });
		addAnnotation
		  (catalogRecordEClass,
		   source,
		   new String[] {
			   "name", "catalogRecord",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCatalogRecord_CatalogRecord(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CatalogRecord",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (catalogRecordTypeEClass,
		   source,
		   new String[] {
			   "name", "CatalogRecordType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCatalogRecordType_Title(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "title",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getCatalogRecordType_Description(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "description",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getCatalogRecordType_Issued(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "issued",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getCatalogRecordType_Modified(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "modified",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getCatalogRecordType_PrimaryTopic(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "primaryTopic",
			   "namespace", "http://xmlns.com/foaf/0.1/"
		   });
		addAnnotation
		  (getCatalogRecordType_ConformsTo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "conformsTo",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getCatalogRecordType_Language(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "language",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getCatalogRecordType_About(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "about",
			   "namespace", "http://www.w3.org/1999/02/22-rdf-syntax-ns#"
		   });
		addAnnotation
		  (dataServiceTypeEClass,
		   source,
		   new String[] {
			   "name", "DataServiceType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDataServiceType_EndpointDescription(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "endpointDescription",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataServiceType_EndpointURL(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "endpointURL",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataServiceType_ServesDataset(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "servesDataset",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (datasetEClass,
		   source,
		   new String[] {
			   "name", "dataset",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDataset_Dataset(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Dataset",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (datasetTypeEClass,
		   source,
		   new String[] {
			   "name", "DatasetType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDatasetType_Distribution(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "distribution",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDatasetType_SpatialResolutionInMeters(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "spatialResolutionInMeters",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDatasetType_TemporalResolution(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "temporalResolution",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDatasetType_AccrualPeriodicity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "accrualPeriodicity",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getDatasetType_Spatial(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "spatial",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getDatasetType_Temporal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "temporal",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getDatasetType_WasGeneratedBy(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wasGeneratedBy",
			   "namespace", "http://www.w3.org/ns/prov#"
		   });
		addAnnotation
		  (distributionEClass,
		   source,
		   new String[] {
			   "name", "Distribution",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDistribution_Distribution(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Distribution",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDistribution_Resource(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "resource",
			   "namespace", "http://www.w3.org/1999/02/22-rdf-syntax-ns#"
		   });
		addAnnotation
		  (distributionTypeEClass,
		   source,
		   new String[] {
			   "name", "Distribution_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDistributionType_Title(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "title",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getDistributionType_Description(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "description",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getDistributionType_AccessService(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "accessService",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDistributionType_AccessURL(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "accessURL",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDistributionType_DownloadURL(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "downloadURL",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDistributionType_Format(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "format",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getDistributionType_MediaType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "mediaType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDistributionType_PackageFormat(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "packageFormat",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDistributionType_ByteSize(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "byteSize",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDistributionType_CompressFormat(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "compressFormat",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDistributionType_SpatialResolutionInMeters(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "spatialResolutionInMeters",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDistributionType_TemporalResolution(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "temporalResolution",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDistributionType_AccessRights(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "accessRights",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getDistributionType_License(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "license",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getDistributionType_ConformsTo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "conformsTo",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getDistributionType_Rights(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "rights",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getDistributionType_HasPolicy(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hasPolicy",
			   "namespace", "http://www.w3.org/ns/odrl/2/"
		   });
		addAnnotation
		  (getDistributionType_Issued(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "issued",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getDistributionType_Modified(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "modified",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getDistributionType_About(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "about",
			   "namespace", "http://www.w3.org/1999/02/22-rdf-syntax-ns#"
		   });
		addAnnotation
		  (getDistributionType_NodeID(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nodeID",
			   "namespace", "http://www.w3.org/1999/02/22-rdf-syntax-ns#"
		   });
		addAnnotation
		  (documentRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDocumentRoot_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmlns:prefix"
		   });
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
		addAnnotation
		  (getDocumentRoot_Catalog(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Catalog",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_CatalogRecord(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CatalogRecord",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_DataService(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DataService",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Dataset(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Dataset",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (relationshipEClass,
		   source,
		   new String[] {
			   "name", "Relationship",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRelationship_Relationship(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Relationship",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (relationshipTypeEClass,
		   source,
		   new String[] {
			   "name", "Relationship_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRelationshipType_HadRole(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hadRole",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRelationshipType_Description(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "description",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getRelationshipType_About(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "about",
			   "namespace", "http://www.w3.org/1999/02/22-rdf-syntax-ns#"
		   });
		addAnnotation
		  (getRelationshipType_NodeID(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nodeID",
			   "namespace", "http://www.w3.org/1999/02/22-rdf-syntax-ns#"
		   });
		addAnnotation
		  (resourceTypeEClass,
		   source,
		   new String[] {
			   "name", "ResourceType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getResourceType_Identifier(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "identifier",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getResourceType_Title(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "title",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getResourceType_Description(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "description",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getResourceType_Theme(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "theme",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getResourceType_Keyword(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "keyword",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getResourceType_Type(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "type",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getResourceType_ContactPoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "contactPoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getResourceType_Creator(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "creator",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getResourceType_Publisher(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "publisher",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getResourceType_Issued(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "issued",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getResourceType_Modified(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "modified",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getResourceType_LandingPage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "landingPage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getResourceType_AccessRights(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "accessRights",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getResourceType_ConformsTo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "conformsTo",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getResourceType_License(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "license",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getResourceType_Rights(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "rights",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getResourceType_HasPolicy(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hasPolicy",
			   "namespace", "http://www.w3.org/ns/odrl/2/"
		   });
		addAnnotation
		  (getResourceType_QualifiedAttribution(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "qualifiedAttribution",
			   "namespace", "http://www.w3.org/ns/prov#"
		   });
		addAnnotation
		  (getResourceType_Relation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "relation",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getResourceType_QualifiedRelation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "qualifiedRelation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getResourceType_IsReferencedBy(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "isReferencedBy",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getResourceType_Language(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "language",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getResourceType_About(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "about",
			   "namespace", "http://www.w3.org/1999/02/22-rdf-syntax-ns#"
		   });
		addAnnotation
		  (serviceEClass,
		   source,
		   new String[] {
			   "name", "service",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getService_DataService(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DataService",
			   "namespace", "##targetNamespace"
		   });
	}

} //DcatPackageImpl
