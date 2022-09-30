/**
 */
package dcat.impl;

import adms.AdmsPackage;

import adms.impl.AdmsPackageImpl;

import dcat.Catalog;
import dcat.CatalogRecord;
import dcat.DCATAPRoot;
import dcat.DataService;
import dcat.Dataset;
import dcat.DatasetContainer;
import dcat.DcatFactory;
import dcat.DcatPackage;
import dcat.DcatResource;
import dcat.Distribution;
import dcat.Relationship;

import dcatde.DcatDEPackage;

import dcatde.impl.DcatDEPackageImpl;

import foaf.FoafPackage;

import foaf.impl.FoafPackageImpl;

import locn.LocnPackage;

import locn.impl.LocnPackageImpl;

import odrl.OdrlPackage;

import odrl.impl.OdrlPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import owl.OwlPackage;

import owl.impl.OwlPackageImpl;

import prov.ProvPackage;

import prov.impl.ProvPackageImpl;

import rdf.RdfPackage;

import rdf.impl.RdfPackageImpl;

import schema.SchemaPackage;

import schema.impl.SchemaPackageImpl;

import skos.SkosPackage;

import skos.impl.SkosPackageImpl;

import terms.TermsPackage;

import terms.impl.TermsPackageImpl;

import vcard.VcardPackage;

import vcard.impl.VcardPackageImpl;

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
	private EClass datasetEClass = null;

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
	private EClass relationshipEClass = null;

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
	private EClass dataServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcatResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcatapRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datasetContainerEClass = null;

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
	 * @see dcat.DcatPackage#eNS_URI
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
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FoafPackage.eNS_URI);
		FoafPackageImpl theFoafPackage = (FoafPackageImpl)(registeredPackage instanceof FoafPackageImpl ? registeredPackage : FoafPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RdfPackage.eNS_URI);
		RdfPackageImpl theRdfPackage = (RdfPackageImpl)(registeredPackage instanceof RdfPackageImpl ? registeredPackage : RdfPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SkosPackage.eNS_URI);
		SkosPackageImpl theSkosPackage = (SkosPackageImpl)(registeredPackage instanceof SkosPackageImpl ? registeredPackage : SkosPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI);
		TermsPackageImpl theTermsPackage = (TermsPackageImpl)(registeredPackage instanceof TermsPackageImpl ? registeredPackage : TermsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(VcardPackage.eNS_URI);
		VcardPackageImpl theVcardPackage = (VcardPackageImpl)(registeredPackage instanceof VcardPackageImpl ? registeredPackage : VcardPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AdmsPackage.eNS_URI);
		AdmsPackageImpl theAdmsPackage = (AdmsPackageImpl)(registeredPackage instanceof AdmsPackageImpl ? registeredPackage : AdmsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LocnPackage.eNS_URI);
		LocnPackageImpl theLocnPackage = (LocnPackageImpl)(registeredPackage instanceof LocnPackageImpl ? registeredPackage : LocnPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OdrlPackage.eNS_URI);
		OdrlPackageImpl theOdrlPackage = (OdrlPackageImpl)(registeredPackage instanceof OdrlPackageImpl ? registeredPackage : OdrlPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OwlPackage.eNS_URI);
		OwlPackageImpl theOwlPackage = (OwlPackageImpl)(registeredPackage instanceof OwlPackageImpl ? registeredPackage : OwlPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ProvPackage.eNS_URI);
		ProvPackageImpl theProvPackage = (ProvPackageImpl)(registeredPackage instanceof ProvPackageImpl ? registeredPackage : ProvPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SchemaPackage.eNS_URI);
		SchemaPackageImpl theSchemaPackage = (SchemaPackageImpl)(registeredPackage instanceof SchemaPackageImpl ? registeredPackage : SchemaPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DcatDEPackage.eNS_URI);
		DcatDEPackageImpl theDcatDEPackage = (DcatDEPackageImpl)(registeredPackage instanceof DcatDEPackageImpl ? registeredPackage : DcatDEPackage.eINSTANCE);

		// Create package meta-data objects
		theDcatPackage.createPackageContents();
		theFoafPackage.createPackageContents();
		theRdfPackage.createPackageContents();
		theSkosPackage.createPackageContents();
		theTermsPackage.createPackageContents();
		theVcardPackage.createPackageContents();
		theAdmsPackage.createPackageContents();
		theLocnPackage.createPackageContents();
		theOdrlPackage.createPackageContents();
		theOwlPackage.createPackageContents();
		theProvPackage.createPackageContents();
		theSchemaPackage.createPackageContents();
		theDcatDEPackage.createPackageContents();

		// Initialize created meta-data
		theDcatPackage.initializePackageContents();
		theFoafPackage.initializePackageContents();
		theRdfPackage.initializePackageContents();
		theSkosPackage.initializePackageContents();
		theTermsPackage.initializePackageContents();
		theVcardPackage.initializePackageContents();
		theAdmsPackage.initializePackageContents();
		theLocnPackage.initializePackageContents();
		theOdrlPackage.initializePackageContents();
		theOwlPackage.initializePackageContents();
		theProvPackage.initializePackageContents();
		theSchemaPackage.initializePackageContents();
		theDcatDEPackage.initializePackageContents();

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
	public EClass getCatalog() {
		return catalogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalog_Catalog() {
		return (EReference)catalogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalog_Record() {
		return (EReference)catalogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalog_Dataset() {
		return (EReference)catalogEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalog_Service() {
		return (EReference)catalogEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalog_ThemeTaxonomy() {
		return (EReference)catalogEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalog_HasPart() {
		return (EReference)catalogEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalog_Homepage() {
		return (EReference)catalogEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataset() {
		return datasetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataset_Distribution() {
		return (EReference)datasetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataset_SpatialResolutionInMeters() {
		return (EAttribute)datasetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataset_TemporalResolution() {
		return (EAttribute)datasetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataset_AccrualPeriodicity() {
		return (EReference)datasetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataset_Spatial() {
		return (EReference)datasetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataset_Temporal() {
		return (EReference)datasetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataset_WasGeneratedBy() {
		return (EAttribute)datasetEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataset_ContributorID() {
		return (EReference)datasetEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDistribution() {
		return distributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistribution_Title() {
		return (EReference)distributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistribution_Description() {
		return (EReference)distributionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistribution_AccessService() {
		return (EReference)distributionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistribution_Format() {
		return (EReference)distributionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistribution_MediaType() {
		return (EAttribute)distributionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistribution_PackageFormat() {
		return (EAttribute)distributionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistribution_ByteSize() {
		return (EAttribute)distributionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistribution_CompressFormat() {
		return (EReference)distributionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistribution_SpatialResolutionInMeters() {
		return (EAttribute)distributionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistribution_TemporalResolution() {
		return (EAttribute)distributionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistribution_AccessRights() {
		return (EReference)distributionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistribution_License() {
		return (EReference)distributionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistribution_ConformsTo() {
		return (EReference)distributionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistribution_Rights() {
		return (EReference)distributionEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistribution_HasPolicy() {
		return (EAttribute)distributionEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistribution_Issued() {
		return (EReference)distributionEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistribution_Modified() {
		return (EReference)distributionEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistribution_NodeID() {
		return (EAttribute)distributionEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistribution_DownloadURL() {
		return (EReference)distributionEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistribution_AccessURL() {
		return (EReference)distributionEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistribution_LicenseAttributionByText() {
		return (EReference)distributionEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationship() {
		return relationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_HadRole() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_Description() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationship_About() {
		return (EAttribute)relationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationship_NodeID() {
		return (EAttribute)relationshipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCatalogRecord() {
		return catalogRecordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalogRecord_Title() {
		return (EReference)catalogRecordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalogRecord_Description() {
		return (EReference)catalogRecordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalogRecord_Issued() {
		return (EReference)catalogRecordEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalogRecord_Modified() {
		return (EReference)catalogRecordEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalogRecord_PrimaryTopic() {
		return (EReference)catalogRecordEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalogRecord_ConformsTo() {
		return (EReference)catalogRecordEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalogRecord_Language() {
		return (EReference)catalogRecordEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCatalogRecord_About() {
		return (EAttribute)catalogRecordEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataService() {
		return dataServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataService_EndpointDescription() {
		return (EAttribute)dataServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataService_EndpointURL() {
		return (EAttribute)dataServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataService_ServesDataset() {
		return (EReference)dataServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDcatResource() {
		return dcatResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcatResource_Identifier() {
		return (EReference)dcatResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcatResource_Title() {
		return (EReference)dcatResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcatResource_Description() {
		return (EReference)dcatResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcatResource_Theme() {
		return (EReference)dcatResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcatResource_Keyword() {
		return (EReference)dcatResourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcatResource_Type() {
		return (EReference)dcatResourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcatResource_ContactPoint() {
		return (EReference)dcatResourceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcatResource_Creator() {
		return (EReference)dcatResourceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcatResource_Publisher() {
		return (EReference)dcatResourceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcatResource_Issued() {
		return (EReference)dcatResourceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcatResource_Modified() {
		return (EReference)dcatResourceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcatResource_LandingPage() {
		return (EReference)dcatResourceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcatResource_AccessRights() {
		return (EReference)dcatResourceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcatResource_ConformsTo() {
		return (EReference)dcatResourceEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcatResource_License() {
		return (EReference)dcatResourceEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcatResource_Rights() {
		return (EReference)dcatResourceEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDcatResource_HasPolicy() {
		return (EAttribute)dcatResourceEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDcatResource_QualifiedAttribution() {
		return (EAttribute)dcatResourceEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcatResource_Relation() {
		return (EReference)dcatResourceEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcatResource_QualifiedRelation() {
		return (EReference)dcatResourceEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcatResource_IsReferencedBy() {
		return (EReference)dcatResourceEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcatResource_Language() {
		return (EReference)dcatResourceEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDCATAPRoot() {
		return dcatapRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCATAPRoot_Mixed() {
		return (EAttribute)dcatapRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDCATAPRoot_XMLNSPrefixMap() {
		return (EReference)dcatapRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDCATAPRoot_XSISchemaLocation() {
		return (EReference)dcatapRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDCATAPRoot_Catalog() {
		return (EReference)dcatapRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDCATAPRoot_CatalogRecord() {
		return (EReference)dcatapRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDCATAPRoot_DataService() {
		return (EReference)dcatapRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDCATAPRoot_Dataset() {
		return (EReference)dcatapRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDCATAPRoot_Distribution() {
		return (EReference)dcatapRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatasetContainer() {
		return datasetContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatasetContainer_Dataset() {
		return (EReference)datasetContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
		createEReference(catalogEClass, CATALOG__RECORD);
		createEReference(catalogEClass, CATALOG__DATASET);
		createEReference(catalogEClass, CATALOG__SERVICE);
		createEReference(catalogEClass, CATALOG__THEME_TAXONOMY);
		createEReference(catalogEClass, CATALOG__HAS_PART);
		createEReference(catalogEClass, CATALOG__HOMEPAGE);

		datasetEClass = createEClass(DATASET);
		createEReference(datasetEClass, DATASET__DISTRIBUTION);
		createEAttribute(datasetEClass, DATASET__SPATIAL_RESOLUTION_IN_METERS);
		createEAttribute(datasetEClass, DATASET__TEMPORAL_RESOLUTION);
		createEReference(datasetEClass, DATASET__ACCRUAL_PERIODICITY);
		createEReference(datasetEClass, DATASET__SPATIAL);
		createEReference(datasetEClass, DATASET__TEMPORAL);
		createEAttribute(datasetEClass, DATASET__WAS_GENERATED_BY);
		createEReference(datasetEClass, DATASET__CONTRIBUTOR_ID);

		distributionEClass = createEClass(DISTRIBUTION);
		createEReference(distributionEClass, DISTRIBUTION__TITLE);
		createEReference(distributionEClass, DISTRIBUTION__DESCRIPTION);
		createEReference(distributionEClass, DISTRIBUTION__ACCESS_SERVICE);
		createEReference(distributionEClass, DISTRIBUTION__FORMAT);
		createEAttribute(distributionEClass, DISTRIBUTION__MEDIA_TYPE);
		createEAttribute(distributionEClass, DISTRIBUTION__PACKAGE_FORMAT);
		createEAttribute(distributionEClass, DISTRIBUTION__BYTE_SIZE);
		createEReference(distributionEClass, DISTRIBUTION__COMPRESS_FORMAT);
		createEAttribute(distributionEClass, DISTRIBUTION__SPATIAL_RESOLUTION_IN_METERS);
		createEAttribute(distributionEClass, DISTRIBUTION__TEMPORAL_RESOLUTION);
		createEReference(distributionEClass, DISTRIBUTION__ACCESS_RIGHTS);
		createEReference(distributionEClass, DISTRIBUTION__LICENSE);
		createEReference(distributionEClass, DISTRIBUTION__CONFORMS_TO);
		createEReference(distributionEClass, DISTRIBUTION__RIGHTS);
		createEAttribute(distributionEClass, DISTRIBUTION__HAS_POLICY);
		createEReference(distributionEClass, DISTRIBUTION__ISSUED);
		createEReference(distributionEClass, DISTRIBUTION__MODIFIED);
		createEAttribute(distributionEClass, DISTRIBUTION__NODE_ID);
		createEReference(distributionEClass, DISTRIBUTION__DOWNLOAD_URL);
		createEReference(distributionEClass, DISTRIBUTION__ACCESS_URL);
		createEReference(distributionEClass, DISTRIBUTION__LICENSE_ATTRIBUTION_BY_TEXT);

		relationshipEClass = createEClass(RELATIONSHIP);
		createEReference(relationshipEClass, RELATIONSHIP__HAD_ROLE);
		createEReference(relationshipEClass, RELATIONSHIP__DESCRIPTION);
		createEAttribute(relationshipEClass, RELATIONSHIP__ABOUT);
		createEAttribute(relationshipEClass, RELATIONSHIP__NODE_ID);

		catalogRecordEClass = createEClass(CATALOG_RECORD);
		createEReference(catalogRecordEClass, CATALOG_RECORD__TITLE);
		createEReference(catalogRecordEClass, CATALOG_RECORD__DESCRIPTION);
		createEReference(catalogRecordEClass, CATALOG_RECORD__ISSUED);
		createEReference(catalogRecordEClass, CATALOG_RECORD__MODIFIED);
		createEReference(catalogRecordEClass, CATALOG_RECORD__PRIMARY_TOPIC);
		createEReference(catalogRecordEClass, CATALOG_RECORD__CONFORMS_TO);
		createEReference(catalogRecordEClass, CATALOG_RECORD__LANGUAGE);
		createEAttribute(catalogRecordEClass, CATALOG_RECORD__ABOUT);

		dataServiceEClass = createEClass(DATA_SERVICE);
		createEAttribute(dataServiceEClass, DATA_SERVICE__ENDPOINT_DESCRIPTION);
		createEAttribute(dataServiceEClass, DATA_SERVICE__ENDPOINT_URL);
		createEReference(dataServiceEClass, DATA_SERVICE__SERVES_DATASET);

		dcatResourceEClass = createEClass(DCAT_RESOURCE);
		createEReference(dcatResourceEClass, DCAT_RESOURCE__IDENTIFIER);
		createEReference(dcatResourceEClass, DCAT_RESOURCE__TITLE);
		createEReference(dcatResourceEClass, DCAT_RESOURCE__DESCRIPTION);
		createEReference(dcatResourceEClass, DCAT_RESOURCE__THEME);
		createEReference(dcatResourceEClass, DCAT_RESOURCE__KEYWORD);
		createEReference(dcatResourceEClass, DCAT_RESOURCE__TYPE);
		createEReference(dcatResourceEClass, DCAT_RESOURCE__CONTACT_POINT);
		createEReference(dcatResourceEClass, DCAT_RESOURCE__CREATOR);
		createEReference(dcatResourceEClass, DCAT_RESOURCE__PUBLISHER);
		createEReference(dcatResourceEClass, DCAT_RESOURCE__ISSUED);
		createEReference(dcatResourceEClass, DCAT_RESOURCE__MODIFIED);
		createEReference(dcatResourceEClass, DCAT_RESOURCE__LANDING_PAGE);
		createEReference(dcatResourceEClass, DCAT_RESOURCE__ACCESS_RIGHTS);
		createEReference(dcatResourceEClass, DCAT_RESOURCE__CONFORMS_TO);
		createEReference(dcatResourceEClass, DCAT_RESOURCE__LICENSE);
		createEReference(dcatResourceEClass, DCAT_RESOURCE__RIGHTS);
		createEAttribute(dcatResourceEClass, DCAT_RESOURCE__HAS_POLICY);
		createEAttribute(dcatResourceEClass, DCAT_RESOURCE__QUALIFIED_ATTRIBUTION);
		createEReference(dcatResourceEClass, DCAT_RESOURCE__RELATION);
		createEReference(dcatResourceEClass, DCAT_RESOURCE__QUALIFIED_RELATION);
		createEReference(dcatResourceEClass, DCAT_RESOURCE__IS_REFERENCED_BY);
		createEReference(dcatResourceEClass, DCAT_RESOURCE__LANGUAGE);

		dcatapRootEClass = createEClass(DCATAP_ROOT);
		createEAttribute(dcatapRootEClass, DCATAP_ROOT__MIXED);
		createEReference(dcatapRootEClass, DCATAP_ROOT__XMLNS_PREFIX_MAP);
		createEReference(dcatapRootEClass, DCATAP_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(dcatapRootEClass, DCATAP_ROOT__CATALOG);
		createEReference(dcatapRootEClass, DCATAP_ROOT__CATALOG_RECORD);
		createEReference(dcatapRootEClass, DCATAP_ROOT__DATA_SERVICE);
		createEReference(dcatapRootEClass, DCATAP_ROOT__DATASET);
		createEReference(dcatapRootEClass, DCATAP_ROOT__DISTRIBUTION);

		datasetContainerEClass = createEClass(DATASET_CONTAINER);
		createEReference(datasetContainerEClass, DATASET_CONTAINER__DATASET);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		TermsPackage theTermsPackage = (TermsPackage)EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI);
		DcatDEPackage theDcatDEPackage = (DcatDEPackage)EPackage.Registry.INSTANCE.getEPackage(DcatDEPackage.eNS_URI);
		VcardPackage theVcardPackage = (VcardPackage)EPackage.Registry.INSTANCE.getEPackage(VcardPackage.eNS_URI);
		FoafPackage theFoafPackage = (FoafPackage)EPackage.Registry.INSTANCE.getEPackage(FoafPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		catalogEClass.getESuperTypes().add(this.getDataset());
		datasetEClass.getESuperTypes().add(this.getDcatResource());
		distributionEClass.getESuperTypes().add(theRdfPackage.getResource());
		dataServiceEClass.getESuperTypes().add(this.getDcatResource());
		dcatResourceEClass.getESuperTypes().add(theRdfPackage.getResource());

		// Initialize classes, features, and operations; add parameters
		initEClass(catalogEClass, Catalog.class, "Catalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCatalog_Catalog(), this.getCatalog(), null, "catalog", null, 0, -1, Catalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalog_Record(), this.getCatalogRecord(), null, "record", null, 0, -1, Catalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalog_Dataset(), this.getDatasetContainer(), null, "dataset", null, 0, -1, Catalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalog_Service(), this.getDataService(), null, "service", null, 0, -1, Catalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalog_ThemeTaxonomy(), theSkosPackage.getConceptScheme(), null, "themeTaxonomy", null, 0, -1, Catalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalog_HasPart(), theRdfPackage.getResource(), null, "hasPart", null, 0, -1, Catalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalog_Homepage(), theRdfPackage.getResource(), null, "homepage", null, 0, 1, Catalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datasetEClass, Dataset.class, "Dataset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataset_Distribution(), this.getDistribution(), null, "distribution", null, 0, -1, Dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataset_SpatialResolutionInMeters(), theXMLTypePackage.getDecimal(), "spatialResolutionInMeters", null, 0, -1, Dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataset_TemporalResolution(), theXMLTypePackage.getDuration(), "temporalResolution", null, 0, -1, Dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataset_AccrualPeriodicity(), theSkosPackage.getConcept(), null, "accrualPeriodicity", null, 0, 1, Dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataset_Spatial(), theTermsPackage.getLocation(), null, "spatial", null, 0, -1, Dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataset_Temporal(), theTermsPackage.getPeriodOfTime(), null, "temporal", null, 0, -1, Dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataset_WasGeneratedBy(), theXMLTypePackage.getAnyURI(), "wasGeneratedBy", null, 0, -1, Dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataset_ContributorID(), theDcatDEPackage.getContributorID(), null, "contributorID", null, 0, 1, Dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(distributionEClass, Distribution.class, "Distribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDistribution_Title(), theRdfPackage.getPlainLiteral(), null, "title", null, 0, 1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistribution_Description(), theRdfPackage.getPlainLiteral(), null, "description", null, 1, -1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistribution_AccessService(), this.getDataService(), null, "accessService", null, 1, -1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistribution_Format(), theSkosPackage.getConcept(), null, "format", null, 0, 1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistribution_MediaType(), theXMLTypePackage.getString(), "mediaType", null, 1, -1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistribution_PackageFormat(), theXMLTypePackage.getString(), "packageFormat", null, 1, -1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistribution_ByteSize(), theXMLTypePackage.getDecimal(), "byteSize", null, 1, -1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistribution_CompressFormat(), ecorePackage.getEObject(), null, "compressFormat", null, 1, -1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistribution_SpatialResolutionInMeters(), theXMLTypePackage.getDecimal(), "spatialResolutionInMeters", null, 1, -1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistribution_TemporalResolution(), theXMLTypePackage.getDuration(), "temporalResolution", null, 1, -1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistribution_AccessRights(), theSkosPackage.getConcept(), null, "accessRights", null, 1, -1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistribution_License(), theTermsPackage.getLicenseDocumentType(), null, "license", null, 1, 1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistribution_ConformsTo(), theTermsPackage.getStandard(), null, "conformsTo", null, 0, -1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistribution_Rights(), theTermsPackage.getRightsStatement(), null, "rights", null, 0, 1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistribution_HasPolicy(), theXMLTypePackage.getAnyURI(), "hasPolicy", null, 0, 1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistribution_Issued(), theRdfPackage.getDateOrDateTimeLiteral(), null, "issued", null, 0, 1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistribution_Modified(), theRdfPackage.getDateOrDateTimeLiteral(), null, "modified", null, 0, 1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistribution_NodeID(), theXMLTypePackage.getNCName(), "nodeID", null, 0, 1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistribution_DownloadURL(), theRdfPackage.getResource(), null, "downloadURL", null, 0, -1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistribution_AccessURL(), theRdfPackage.getResource(), null, "accessURL", null, 0, -1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistribution_LicenseAttributionByText(), theRdfPackage.getPlainLiteral(), null, "licenseAttributionByText", null, 0, 1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipEClass, Relationship.class, "Relationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationship_HadRole(), ecorePackage.getEObject(), null, "hadRole", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_Description(), theRdfPackage.getPlainLiteral(), null, "description", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationship_About(), theXMLTypePackage.getAnyURI(), "about", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationship_NodeID(), theXMLTypePackage.getNCName(), "nodeID", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(catalogRecordEClass, CatalogRecord.class, "CatalogRecord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCatalogRecord_Title(), theRdfPackage.getPlainLiteral(), null, "title", null, 0, -1, CatalogRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalogRecord_Description(), theRdfPackage.getPlainLiteral(), null, "description", null, 0, -1, CatalogRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalogRecord_Issued(), theRdfPackage.getDateOrDateTimeLiteral(), null, "issued", null, 0, 1, CatalogRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalogRecord_Modified(), theRdfPackage.getDateOrDateTimeLiteral(), null, "modified", null, 1, 1, CatalogRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalogRecord_PrimaryTopic(), theRdfPackage.getResource(), null, "primaryTopic", null, 1, 1, CatalogRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalogRecord_ConformsTo(), theTermsPackage.getStandard(), null, "conformsTo", null, 0, 1, CatalogRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalogRecord_Language(), theRdfPackage.getResource(), null, "language", null, 0, -1, CatalogRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogRecord_About(), theXMLTypePackage.getAnyURI(), "about", null, 0, 1, CatalogRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataServiceEClass, DataService.class, "DataService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataService_EndpointDescription(), theXMLTypePackage.getString(), "endpointDescription", null, 0, -1, DataService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataService_EndpointURL(), theXMLTypePackage.getString(), "endpointURL", null, 0, -1, DataService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataService_ServesDataset(), this.getDataset(), null, "servesDataset", null, 0, 1, DataService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dcatResourceEClass, DcatResource.class, "DcatResource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDcatResource_Identifier(), theRdfPackage.getPlainLiteral(), null, "identifier", null, 0, -1, DcatResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDcatResource_Title(), theRdfPackage.getPlainLiteral(), null, "title", null, 1, -1, DcatResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDcatResource_Description(), theRdfPackage.getPlainLiteral(), null, "description", null, 1, -1, DcatResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDcatResource_Theme(), theSkosPackage.getConcept(), null, "theme", null, 0, -1, DcatResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDcatResource_Keyword(), theRdfPackage.getPlainLiteral(), null, "keyword", null, 0, -1, DcatResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDcatResource_Type(), theSkosPackage.getConcept(), null, "type", null, 0, -1, DcatResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDcatResource_ContactPoint(), theVcardPackage.getOrganization(), null, "contactPoint", null, 0, -1, DcatResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDcatResource_Creator(), theFoafPackage.getAgent(), null, "creator", null, 0, 1, DcatResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDcatResource_Publisher(), theFoafPackage.getAgent(), null, "publisher", null, 0, 1, DcatResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDcatResource_Issued(), theRdfPackage.getDateOrDateTimeLiteral(), null, "issued", null, 0, 1, DcatResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDcatResource_Modified(), theRdfPackage.getDateOrDateTimeLiteral(), null, "modified", null, 0, 1, DcatResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDcatResource_LandingPage(), theFoafPackage.getDocument(), null, "landingPage", null, 0, -1, DcatResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDcatResource_AccessRights(), theSkosPackage.getConcept(), null, "accessRights", null, 0, 1, DcatResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDcatResource_ConformsTo(), theTermsPackage.getStandard(), null, "conformsTo", null, 0, -1, DcatResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDcatResource_License(), theTermsPackage.getLicenseDocument(), null, "license", null, 0, 1, DcatResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDcatResource_Rights(), theTermsPackage.getRightsStatement(), null, "rights", null, 0, -1, DcatResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDcatResource_HasPolicy(), theXMLTypePackage.getAnyURI(), "hasPolicy", null, 0, 1, DcatResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDcatResource_QualifiedAttribution(), theXMLTypePackage.getAnyURI(), "qualifiedAttribution", null, 0, -1, DcatResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDcatResource_Relation(), theRdfPackage.getResource(), null, "relation", null, 0, -1, DcatResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDcatResource_QualifiedRelation(), this.getRelationship(), null, "qualifiedRelation", null, 0, -1, DcatResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDcatResource_IsReferencedBy(), theRdfPackage.getResource(), null, "isReferencedBy", null, 0, -1, DcatResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDcatResource_Language(), theRdfPackage.getResource(), null, "language", null, 0, -1, DcatResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dcatapRootEClass, DCATAPRoot.class, "DCATAPRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDCATAPRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDCATAPRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDCATAPRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDCATAPRoot_Catalog(), this.getCatalog(), null, "catalog", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDCATAPRoot_CatalogRecord(), this.getCatalogRecord(), null, "catalogRecord", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDCATAPRoot_DataService(), this.getDataService(), null, "dataService", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDCATAPRoot_Dataset(), this.getDataset(), null, "dataset", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDCATAPRoot_Distribution(), this.getDistribution(), null, "distribution", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(datasetContainerEClass, DatasetContainer.class, "DatasetContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatasetContainer_Dataset(), this.getDataset(), null, "dataset", null, 1, 1, DatasetContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
			   "name", "Catalog",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCatalog_Catalog(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "catalog",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCatalog_Record(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "record",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCatalog_Dataset(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dataset",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCatalog_Service(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "service",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCatalog_ThemeTaxonomy(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "themeTaxonomy",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCatalog_HasPart(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hasPart",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getCatalog_Homepage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "homepage",
			   "namespace", "http://xmlns.com/foaf/0.1/"
		   });
		addAnnotation
		  (datasetEClass,
		   source,
		   new String[] {
			   "name", "Dataset",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDataset_Distribution(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "distribution",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataset_SpatialResolutionInMeters(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "spatialResolutionInMeters",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataset_TemporalResolution(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "temporalResolution",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataset_AccrualPeriodicity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "accrualPeriodicity",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getDataset_Spatial(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "spatial",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getDataset_Temporal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "temporal",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getDataset_WasGeneratedBy(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wasGeneratedBy",
			   "namespace", "http://www.w3.org/ns/prov#"
		   });
		addAnnotation
		  (getDataset_ContributorID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "namespace", "http://dcat-ap.de/def/dcatde/"
		   });
		addAnnotation
		  (distributionEClass,
		   source,
		   new String[] {
			   "name", "Distribution",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDistribution_Title(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "title",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getDistribution_Description(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "description",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getDistribution_AccessService(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "accessService",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDistribution_Format(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "format",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getDistribution_MediaType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "mediaType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDistribution_PackageFormat(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "packageFormat",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDistribution_ByteSize(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "byteSize",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDistribution_CompressFormat(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "compressFormat",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDistribution_SpatialResolutionInMeters(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "spatialResolutionInMeters",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDistribution_TemporalResolution(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "temporalResolution",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDistribution_AccessRights(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "accessRights",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getDistribution_License(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "license",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getDistribution_ConformsTo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "conformsTo",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getDistribution_Rights(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "rights",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getDistribution_HasPolicy(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hasPolicy",
			   "namespace", "http://www.w3.org/ns/odrl/2/"
		   });
		addAnnotation
		  (getDistribution_Issued(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "issued",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getDistribution_Modified(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "modified",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getDistribution_NodeID(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nodeID",
			   "namespace", "http://www.w3.org/1999/02/22-rdf-syntax-ns#"
		   });
		addAnnotation
		  (getDistribution_DownloadURL(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "downloadURL",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDistribution_AccessURL(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "accessURL",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDistribution_LicenseAttributionByText(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "licenseAttributionByText",
			   "namespace", "http://dcat-ap.de/def/dcatde/"
		   });
		addAnnotation
		  (relationshipEClass,
		   source,
		   new String[] {
			   "name", "Relationship",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRelationship_HadRole(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hadRole",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRelationship_Description(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "description",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getRelationship_About(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "about",
			   "namespace", "http://www.w3.org/1999/02/22-rdf-syntax-ns#"
		   });
		addAnnotation
		  (getRelationship_NodeID(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nodeID",
			   "namespace", "http://www.w3.org/1999/02/22-rdf-syntax-ns#"
		   });
		addAnnotation
		  (catalogRecordEClass,
		   source,
		   new String[] {
			   "name", "CatalogRecord",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCatalogRecord_Title(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "title",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getCatalogRecord_Description(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "description",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getCatalogRecord_Issued(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "issued",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getCatalogRecord_Modified(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "modified",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getCatalogRecord_PrimaryTopic(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "primaryTopic",
			   "namespace", "http://xmlns.com/foaf/0.1/"
		   });
		addAnnotation
		  (getCatalogRecord_ConformsTo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "conformsTo",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getCatalogRecord_Language(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "language",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getCatalogRecord_About(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "about",
			   "namespace", "http://www.w3.org/1999/02/22-rdf-syntax-ns#"
		   });
		addAnnotation
		  (dataServiceEClass,
		   source,
		   new String[] {
			   "name", "DataService",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDataService_EndpointDescription(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "endpointDescription",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataService_EndpointURL(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "endpointURL",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataService_ServesDataset(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "servesDataset",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (dcatResourceEClass,
		   source,
		   new String[] {
			   "name", "ResourceType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDcatResource_Identifier(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "identifier",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getDcatResource_Title(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "title",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getDcatResource_Description(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "description",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getDcatResource_Theme(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "theme",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDcatResource_Keyword(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "keyword",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDcatResource_Type(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "type",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getDcatResource_ContactPoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "contactPoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDcatResource_Creator(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "creator",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getDcatResource_Publisher(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "publisher",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getDcatResource_Issued(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "issued",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getDcatResource_Modified(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "modified",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getDcatResource_LandingPage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "landingPage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDcatResource_AccessRights(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "accessRights",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getDcatResource_ConformsTo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "conformsTo",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getDcatResource_License(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "license",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getDcatResource_Rights(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "rights",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getDcatResource_HasPolicy(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hasPolicy",
			   "namespace", "http://www.w3.org/ns/odrl/2/"
		   });
		addAnnotation
		  (getDcatResource_QualifiedAttribution(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "qualifiedAttribution",
			   "namespace", "http://www.w3.org/ns/prov#"
		   });
		addAnnotation
		  (getDcatResource_Relation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "relation",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getDcatResource_QualifiedRelation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "qualifiedRelation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDcatResource_IsReferencedBy(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "isReferencedBy",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (getDcatResource_Language(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "language",
			   "namespace", "http://purl.org/dc/terms/"
		   });
		addAnnotation
		  (dcatapRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDCATAPRoot_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getDCATAPRoot_XMLNSPrefixMap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmlns:prefix"
		   });
		addAnnotation
		  (getDCATAPRoot_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
		addAnnotation
		  (getDCATAPRoot_Catalog(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Catalog",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDCATAPRoot_CatalogRecord(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CatalogRecord",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDCATAPRoot_DataService(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DataService",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDCATAPRoot_Dataset(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Dataset",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDCATAPRoot_Distribution(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Distribution",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (datasetContainerEClass,
		   source,
		   new String[] {
			   "name", "dataset",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDatasetContainer_Dataset(),
		   source,
		   new String[] {
			   "kind", "element",
			   "namespace", "##targetNamespace",
			   "name", "Dataset"
		   });
	}

} //DcatPackageImpl
