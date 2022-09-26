/**
 */
package org.purl.dc.terms.terms.impl;

import com.xmlns.foaf.foaf.FoafPackage;

import com.xmlns.foaf.foaf.impl.FoafPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.purl.dc.terms.terms.DocumentRoot;
import org.purl.dc.terms.terms.LicenseDocument;
import org.purl.dc.terms.terms.LicenseDocumentType;
import org.purl.dc.terms.terms.Location;
import org.purl.dc.terms.terms.LocationType;
import org.purl.dc.terms.terms.PeriodOfTime;
import org.purl.dc.terms.terms.PeriodOfTimeType;
import org.purl.dc.terms.terms.ProvenanceStatement;
import org.purl.dc.terms.terms.ProvenanceStatementType;
import org.purl.dc.terms.terms.RightsStatement;
import org.purl.dc.terms.terms.RightsStatementType;
import org.purl.dc.terms.terms.Standard;
import org.purl.dc.terms.terms.StandardType;
import org.purl.dc.terms.terms.TermsFactory;
import org.purl.dc.terms.terms.TermsPackage;

import org.schema.schema.SchemaPackage;

import org.schema.schema.impl.SchemaPackageImpl;

import org.w3.ns.adms.AdmsPackage;

import org.w3.ns.adms.impl.AdmsPackageImpl;

import org.w3.ns.dcat.DcatPackage;

import org.w3.ns.dcat.impl.DcatPackageImpl;

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
public class TermsPackageImpl extends EPackageImpl implements TermsPackage {
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
	private EClass licenseDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass licenseDocumentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass periodOfTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass periodOfTimeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass provenanceStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass provenanceStatementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rightsStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rightsStatementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardTypeEClass = null;

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
	 * @see org.purl.dc.terms.terms.TermsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TermsPackageImpl() {
		super(eNS_URI, TermsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TermsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TermsPackage init() {
		if (isInited) return (TermsPackage)EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTermsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TermsPackageImpl theTermsPackage = registeredTermsPackage instanceof TermsPackageImpl ? (TermsPackageImpl)registeredTermsPackage : new TermsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RdfPackage.eNS_URI);
		RdfPackageImpl theRdfPackage = (RdfPackageImpl)(registeredPackage instanceof RdfPackageImpl ? registeredPackage : RdfPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SkosPackage.eNS_URI);
		SkosPackageImpl theSkosPackage = (SkosPackageImpl)(registeredPackage instanceof SkosPackageImpl ? registeredPackage : SkosPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DcatPackage.eNS_URI);
		DcatPackageImpl theDcatPackage = (DcatPackageImpl)(registeredPackage instanceof DcatPackageImpl ? registeredPackage : DcatPackage.eINSTANCE);
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
		theTermsPackage.createPackageContents();
		theRdfPackage.createPackageContents();
		theSkosPackage.createPackageContents();
		theDcatPackage.createPackageContents();
		theVcardPackage.createPackageContents();
		theFoafPackage.createPackageContents();
		theSchemaPackage.createPackageContents();
		theLocnPackage.createPackageContents();
		theOdrlPackage.createPackageContents();
		theAdmsPackage.createPackageContents();
		theProvPackage.createPackageContents();
		theOwlPackage.createPackageContents();

		// Initialize created meta-data
		theTermsPackage.initializePackageContents();
		theRdfPackage.initializePackageContents();
		theSkosPackage.initializePackageContents();
		theDcatPackage.initializePackageContents();
		theVcardPackage.initializePackageContents();
		theFoafPackage.initializePackageContents();
		theSchemaPackage.initializePackageContents();
		theLocnPackage.initializePackageContents();
		theOdrlPackage.initializePackageContents();
		theAdmsPackage.initializePackageContents();
		theProvPackage.initializePackageContents();
		theOwlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTermsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TermsPackage.eNS_URI, theTermsPackage);
		return theTermsPackage;
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
	public EReference getDocumentRoot_Abstract() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_AccessRights() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_AccrualMethod() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_AccrualPeriodicity() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_AccrualPolicy() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Alternative() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Audience() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Available() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_BibliographicCitation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ConformsTo() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Created() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Creator() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DateAccepted() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DateCopyrighted() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DateSubmitted() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Description() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_EducationLevel() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Extent() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Format() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_HasFormat() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_HasPart() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_HasVersion() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Identifier() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_InstructionalMethod() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_IsFormatOf() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_IsPartOf() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_IsReferencedBy() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_IsReplacedBy() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_IsRequiredBy() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Issued() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_IsVersionOf() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Language() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_License() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Mediator() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Medium() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Modified() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Provenance() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Publisher() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_References() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Relation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Replaces() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Requires() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Rights() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_RightsHolder() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Source() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Spatial() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_TableOfContents() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Temporal() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Title() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Type() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Valid() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLicenseDocument() {
		return licenseDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLicenseDocument_LicenseDocument() {
		return (EReference)licenseDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLicenseDocumentType() {
		return licenseDocumentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLicenseDocumentType_Type() {
		return (EReference)licenseDocumentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLicenseDocumentType_Title() {
		return (EReference)licenseDocumentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLicenseDocumentType_Description() {
		return (EReference)licenseDocumentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLicenseDocumentType_Identifier() {
		return (EReference)licenseDocumentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLicenseDocumentType_About() {
		return (EAttribute)licenseDocumentTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLicenseDocumentType_NodeID() {
		return (EAttribute)licenseDocumentTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLocation_Location() {
		return (EReference)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocationType() {
		return locationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLocationType_Geometry() {
		return (EReference)locationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLocationType_PrefLabel() {
		return (EReference)locationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocationType_About() {
		return (EAttribute)locationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocationType_NodeID() {
		return (EAttribute)locationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPeriodOfTime() {
		return periodOfTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPeriodOfTime_PeriodOfTime() {
		return (EReference)periodOfTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPeriodOfTimeType() {
		return periodOfTimeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPeriodOfTimeType_StartDate() {
		return (EReference)periodOfTimeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPeriodOfTimeType_EndDate() {
		return (EReference)periodOfTimeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPeriodOfTimeType_About() {
		return (EAttribute)periodOfTimeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPeriodOfTimeType_NodeID() {
		return (EAttribute)periodOfTimeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProvenanceStatement() {
		return provenanceStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProvenanceStatement_ProvenanceStatement() {
		return (EReference)provenanceStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProvenanceStatementType() {
		return provenanceStatementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProvenanceStatementType_Description() {
		return (EReference)provenanceStatementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProvenanceStatementType_About() {
		return (EAttribute)provenanceStatementTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProvenanceStatementType_NodeID() {
		return (EAttribute)provenanceStatementTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRightsStatement() {
		return rightsStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRightsStatement_RightsStatement() {
		return (EReference)rightsStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRightsStatementType() {
		return rightsStatementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRightsStatementType_Title() {
		return (EReference)rightsStatementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRightsStatementType_Description() {
		return (EReference)rightsStatementTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRightsStatementType_About() {
		return (EAttribute)rightsStatementTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRightsStatementType_NodeID() {
		return (EAttribute)rightsStatementTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStandard() {
		return standardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStandard_Standard() {
		return (EReference)standardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStandardType() {
		return standardTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStandardType_Title() {
		return (EReference)standardTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStandardType_Description() {
		return (EReference)standardTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStandardType_About() {
		return (EAttribute)standardTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStandardType_NodeID() {
		return (EAttribute)standardTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TermsFactory getTermsFactory() {
		return (TermsFactory)getEFactoryInstance();
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
		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ABSTRACT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ACCESS_RIGHTS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ACCRUAL_METHOD);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ACCRUAL_PERIODICITY);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ACCRUAL_POLICY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ALTERNATIVE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__AUDIENCE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__AVAILABLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BIBLIOGRAPHIC_CITATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CONFORMS_TO);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CREATED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CREATOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DATE_ACCEPTED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DATE_COPYRIGHTED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DATE_SUBMITTED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DESCRIPTION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__EDUCATION_LEVEL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EXTENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FORMAT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__HAS_FORMAT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__HAS_PART);
		createEReference(documentRootEClass, DOCUMENT_ROOT__HAS_VERSION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IDENTIFIER);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__INSTRUCTIONAL_METHOD);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__IS_FORMAT_OF);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IS_PART_OF);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IS_REFERENCED_BY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IS_REPLACED_BY);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__IS_REQUIRED_BY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ISSUED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IS_VERSION_OF);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LANGUAGE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LICENSE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MEDIATOR);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MEDIUM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MODIFIED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROVENANCE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PUBLISHER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REFERENCES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RELATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REPLACES);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__REQUIRES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RIGHTS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RIGHTS_HOLDER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SOURCE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SPATIAL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TABLE_OF_CONTENTS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TEMPORAL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TITLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TYPE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__VALID);

		licenseDocumentEClass = createEClass(LICENSE_DOCUMENT);
		createEReference(licenseDocumentEClass, LICENSE_DOCUMENT__LICENSE_DOCUMENT);

		licenseDocumentTypeEClass = createEClass(LICENSE_DOCUMENT_TYPE);
		createEReference(licenseDocumentTypeEClass, LICENSE_DOCUMENT_TYPE__TYPE);
		createEReference(licenseDocumentTypeEClass, LICENSE_DOCUMENT_TYPE__TITLE);
		createEReference(licenseDocumentTypeEClass, LICENSE_DOCUMENT_TYPE__DESCRIPTION);
		createEReference(licenseDocumentTypeEClass, LICENSE_DOCUMENT_TYPE__IDENTIFIER);
		createEAttribute(licenseDocumentTypeEClass, LICENSE_DOCUMENT_TYPE__ABOUT);
		createEAttribute(licenseDocumentTypeEClass, LICENSE_DOCUMENT_TYPE__NODE_ID);

		locationEClass = createEClass(LOCATION);
		createEReference(locationEClass, LOCATION__LOCATION);

		locationTypeEClass = createEClass(LOCATION_TYPE);
		createEReference(locationTypeEClass, LOCATION_TYPE__GEOMETRY);
		createEReference(locationTypeEClass, LOCATION_TYPE__PREF_LABEL);
		createEAttribute(locationTypeEClass, LOCATION_TYPE__ABOUT);
		createEAttribute(locationTypeEClass, LOCATION_TYPE__NODE_ID);

		periodOfTimeEClass = createEClass(PERIOD_OF_TIME);
		createEReference(periodOfTimeEClass, PERIOD_OF_TIME__PERIOD_OF_TIME);

		periodOfTimeTypeEClass = createEClass(PERIOD_OF_TIME_TYPE);
		createEReference(periodOfTimeTypeEClass, PERIOD_OF_TIME_TYPE__START_DATE);
		createEReference(periodOfTimeTypeEClass, PERIOD_OF_TIME_TYPE__END_DATE);
		createEAttribute(periodOfTimeTypeEClass, PERIOD_OF_TIME_TYPE__ABOUT);
		createEAttribute(periodOfTimeTypeEClass, PERIOD_OF_TIME_TYPE__NODE_ID);

		provenanceStatementEClass = createEClass(PROVENANCE_STATEMENT);
		createEReference(provenanceStatementEClass, PROVENANCE_STATEMENT__PROVENANCE_STATEMENT);

		provenanceStatementTypeEClass = createEClass(PROVENANCE_STATEMENT_TYPE);
		createEReference(provenanceStatementTypeEClass, PROVENANCE_STATEMENT_TYPE__DESCRIPTION);
		createEAttribute(provenanceStatementTypeEClass, PROVENANCE_STATEMENT_TYPE__ABOUT);
		createEAttribute(provenanceStatementTypeEClass, PROVENANCE_STATEMENT_TYPE__NODE_ID);

		rightsStatementEClass = createEClass(RIGHTS_STATEMENT);
		createEReference(rightsStatementEClass, RIGHTS_STATEMENT__RIGHTS_STATEMENT);

		rightsStatementTypeEClass = createEClass(RIGHTS_STATEMENT_TYPE);
		createEReference(rightsStatementTypeEClass, RIGHTS_STATEMENT_TYPE__TITLE);
		createEReference(rightsStatementTypeEClass, RIGHTS_STATEMENT_TYPE__DESCRIPTION);
		createEAttribute(rightsStatementTypeEClass, RIGHTS_STATEMENT_TYPE__ABOUT);
		createEAttribute(rightsStatementTypeEClass, RIGHTS_STATEMENT_TYPE__NODE_ID);

		standardEClass = createEClass(STANDARD);
		createEReference(standardEClass, STANDARD__STANDARD);

		standardTypeEClass = createEClass(STANDARD_TYPE);
		createEReference(standardTypeEClass, STANDARD_TYPE__TITLE);
		createEReference(standardTypeEClass, STANDARD_TYPE__DESCRIPTION);
		createEAttribute(standardTypeEClass, STANDARD_TYPE__ABOUT);
		createEAttribute(standardTypeEClass, STANDARD_TYPE__NODE_ID);
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
		RdfPackage theRdfPackage = (RdfPackage)EPackage.Registry.INSTANCE.getEPackage(RdfPackage.eNS_URI);
		SkosPackage theSkosPackage = (SkosPackage)EPackage.Registry.INSTANCE.getEPackage(SkosPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		FoafPackage theFoafPackage = (FoafPackage)EPackage.Registry.INSTANCE.getEPackage(FoafPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Abstract(), theRdfPackage.getPlainLiteral(), null, "abstract", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AccessRights(), theSkosPackage.getConcept(), null, "accessRights", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_AccrualMethod(), theXMLTypePackage.getAnyURI(), "accrualMethod", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AccrualPeriodicity(), theSkosPackage.getConcept(), null, "accrualPeriodicity", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_AccrualPolicy(), theXMLTypePackage.getAnyURI(), "accrualPolicy", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Alternative(), theRdfPackage.getPlainLiteral(), null, "alternative", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Audience(), theXMLTypePackage.getAnyURI(), "audience", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Available(), theRdfPackage.getDateOrDateTimeLiteral(), null, "available", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_BibliographicCitation(), theRdfPackage.getPlainLiteral(), null, "bibliographicCitation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ConformsTo(), this.getStandard(), null, "conformsTo", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Created(), theRdfPackage.getDateOrDateTimeLiteral(), null, "created", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Creator(), theFoafPackage.getAgent(), null, "creator", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DateAccepted(), theRdfPackage.getDateOrDateTimeLiteral(), null, "dateAccepted", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DateCopyrighted(), theRdfPackage.getDateOrDateTimeLiteral(), null, "dateCopyrighted", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DateSubmitted(), theRdfPackage.getDateOrDateTimeLiteral(), null, "dateSubmitted", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Description(), theRdfPackage.getPlainLiteral(), null, "description", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_EducationLevel(), theXMLTypePackage.getAnyURI(), "educationLevel", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Extent(), theRdfPackage.getResource(), null, "extent", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Format(), theSkosPackage.getConcept(), null, "format", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_HasFormat(), theXMLTypePackage.getAnyURI(), "hasFormat", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_HasPart(), theRdfPackage.getResource(), null, "hasPart", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_HasVersion(), theRdfPackage.getResource(), null, "hasVersion", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Identifier(), theRdfPackage.getPlainLiteral(), null, "identifier", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_InstructionalMethod(), theXMLTypePackage.getAnyURI(), "instructionalMethod", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_IsFormatOf(), theXMLTypePackage.getAnyURI(), "isFormatOf", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_IsPartOf(), theRdfPackage.getResource(), null, "isPartOf", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_IsReferencedBy(), theRdfPackage.getResource(), null, "isReferencedBy", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_IsReplacedBy(), theRdfPackage.getResource(), null, "isReplacedBy", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_IsRequiredBy(), theXMLTypePackage.getAnyURI(), "isRequiredBy", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Issued(), theRdfPackage.getDateOrDateTimeLiteral(), null, "issued", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_IsVersionOf(), theRdfPackage.getResource(), null, "isVersionOf", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Language(), theRdfPackage.getResource(), null, "language", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_License(), this.getLicenseDocument(), null, "license", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Mediator(), theXMLTypePackage.getAnyURI(), "mediator", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Medium(), theXMLTypePackage.getAnyURI(), "medium", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Modified(), theRdfPackage.getDateOrDateTimeLiteral(), null, "modified", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Provenance(), this.getProvenanceStatement(), null, "provenance", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Publisher(), theFoafPackage.getAgent(), null, "publisher", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_References(), theRdfPackage.getResource(), null, "references", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Relation(), theRdfPackage.getResource(), null, "relation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Replaces(), theRdfPackage.getResource(), null, "replaces", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Requires(), theXMLTypePackage.getAnyURI(), "requires", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Rights(), this.getRightsStatement(), null, "rights", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RightsHolder(), theFoafPackage.getAgent(), null, "rightsHolder", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Source(), theRdfPackage.getResource(), null, "source", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Spatial(), this.getLocation(), null, "spatial", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TableOfContents(), theRdfPackage.getPlainLiteral(), null, "tableOfContents", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Temporal(), this.getPeriodOfTime(), null, "temporal", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Title(), theRdfPackage.getPlainLiteral(), null, "title", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Type(), theSkosPackage.getConcept(), null, "type", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Valid(), theRdfPackage.getDateOrDateTimeLiteral(), null, "valid", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(licenseDocumentEClass, LicenseDocument.class, "LicenseDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLicenseDocument_LicenseDocument(), this.getLicenseDocumentType(), null, "licenseDocument", null, 1, 1, LicenseDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(licenseDocumentTypeEClass, LicenseDocumentType.class, "LicenseDocumentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLicenseDocumentType_Type(), theSkosPackage.getConcept(), null, "type", null, 0, -1, LicenseDocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLicenseDocumentType_Title(), theRdfPackage.getPlainLiteral(), null, "title", null, 0, -1, LicenseDocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLicenseDocumentType_Description(), theRdfPackage.getPlainLiteral(), null, "description", null, 0, -1, LicenseDocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLicenseDocumentType_Identifier(), theRdfPackage.getPlainLiteral(), null, "identifier", null, 0, -1, LicenseDocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLicenseDocumentType_About(), theXMLTypePackage.getAnyURI(), "about", null, 0, 1, LicenseDocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLicenseDocumentType_NodeID(), theXMLTypePackage.getNCName(), "nodeID", null, 0, 1, LicenseDocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocation_Location(), this.getLocationType(), null, "location", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationTypeEClass, LocationType.class, "LocationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocationType_Geometry(), theRdfPackage.getTypedLiteral(), null, "geometry", null, 0, -1, LocationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocationType_PrefLabel(), theRdfPackage.getPlainLiteral(), null, "prefLabel", null, 0, -1, LocationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocationType_About(), theXMLTypePackage.getAnyURI(), "about", null, 0, 1, LocationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocationType_NodeID(), theXMLTypePackage.getNCName(), "nodeID", null, 0, 1, LocationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(periodOfTimeEClass, PeriodOfTime.class, "PeriodOfTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPeriodOfTime_PeriodOfTime(), this.getPeriodOfTimeType(), null, "periodOfTime", null, 1, 1, PeriodOfTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(periodOfTimeTypeEClass, PeriodOfTimeType.class, "PeriodOfTimeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPeriodOfTimeType_StartDate(), theRdfPackage.getDateOrDateTimeLiteral(), null, "startDate", null, 0, 1, PeriodOfTimeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPeriodOfTimeType_EndDate(), theRdfPackage.getDateOrDateTimeLiteral(), null, "endDate", null, 0, 1, PeriodOfTimeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPeriodOfTimeType_About(), theXMLTypePackage.getAnyURI(), "about", null, 0, 1, PeriodOfTimeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPeriodOfTimeType_NodeID(), theXMLTypePackage.getNCName(), "nodeID", null, 0, 1, PeriodOfTimeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(provenanceStatementEClass, ProvenanceStatement.class, "ProvenanceStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProvenanceStatement_ProvenanceStatement(), this.getProvenanceStatementType(), null, "provenanceStatement", null, 1, 1, ProvenanceStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(provenanceStatementTypeEClass, ProvenanceStatementType.class, "ProvenanceStatementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProvenanceStatementType_Description(), theRdfPackage.getPlainLiteral(), null, "description", null, 0, -1, ProvenanceStatementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProvenanceStatementType_About(), theXMLTypePackage.getAnyURI(), "about", null, 0, 1, ProvenanceStatementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProvenanceStatementType_NodeID(), theXMLTypePackage.getNCName(), "nodeID", null, 0, 1, ProvenanceStatementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rightsStatementEClass, RightsStatement.class, "RightsStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRightsStatement_RightsStatement(), this.getRightsStatementType(), null, "rightsStatement", null, 1, 1, RightsStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rightsStatementTypeEClass, RightsStatementType.class, "RightsStatementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRightsStatementType_Title(), theRdfPackage.getPlainLiteral(), null, "title", null, 0, -1, RightsStatementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRightsStatementType_Description(), theRdfPackage.getPlainLiteral(), null, "description", null, 0, -1, RightsStatementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRightsStatementType_About(), theXMLTypePackage.getAnyURI(), "about", null, 0, 1, RightsStatementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRightsStatementType_NodeID(), theXMLTypePackage.getNCName(), "nodeID", null, 0, 1, RightsStatementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(standardEClass, Standard.class, "Standard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStandard_Standard(), this.getStandardType(), null, "standard", null, 1, 1, Standard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(standardTypeEClass, StandardType.class, "StandardType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStandardType_Title(), theRdfPackage.getPlainLiteral(), null, "title", null, 0, -1, StandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStandardType_Description(), theRdfPackage.getPlainLiteral(), null, "description", null, 0, -1, StandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStandardType_About(), theXMLTypePackage.getAnyURI(), "about", null, 0, 1, StandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStandardType_NodeID(), theXMLTypePackage.getNCName(), "nodeID", null, 0, 1, StandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (getDocumentRoot_Abstract(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "abstract",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_AccessRights(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "accessRights",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_AccrualMethod(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "accrualMethod",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_AccrualPeriodicity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "accrualPeriodicity",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_AccrualPolicy(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "accrualPolicy",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Alternative(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "alternative",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Audience(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "audience",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Available(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "available",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_BibliographicCitation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "bibliographicCitation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ConformsTo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "conformsTo",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Created(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "created",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Creator(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "creator",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_DateAccepted(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dateAccepted",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_DateCopyrighted(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dateCopyrighted",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_DateSubmitted(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dateSubmitted",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Description(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "description",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_EducationLevel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "educationLevel",
			   "namespace", "##targetNamespace",
			   "affiliation", "audience"
		   });
		addAnnotation
		  (getDocumentRoot_Extent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "extent",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Format(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "format",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_HasFormat(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hasFormat",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_HasPart(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hasPart",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_HasVersion(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hasVersion",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Identifier(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "identifier",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_InstructionalMethod(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "instructionalMethod",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_IsFormatOf(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "isFormatOf",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_IsPartOf(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "isPartOf",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_IsReferencedBy(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "isReferencedBy",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_IsReplacedBy(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "isReplacedBy",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_IsRequiredBy(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "isRequiredBy",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Issued(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "issued",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_IsVersionOf(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "isVersionOf",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Language(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "language",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_License(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "license",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Mediator(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "mediator",
			   "namespace", "##targetNamespace",
			   "affiliation", "audience"
		   });
		addAnnotation
		  (getDocumentRoot_Medium(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "medium",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Modified(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "modified",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Provenance(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "provenance",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Publisher(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "publisher",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_References(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "references",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Relation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "relation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Replaces(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "replaces",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Requires(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "requires",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Rights(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "rights",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_RightsHolder(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "rightsHolder",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Source(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "source",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Spatial(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "spatial",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_TableOfContents(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "tableOfContents",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Temporal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "temporal",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Title(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "title",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Type(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "type",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Valid(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valid",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (licenseDocumentEClass,
		   source,
		   new String[] {
			   "name", "LicenseDocument",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLicenseDocument_LicenseDocument(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LicenseDocument",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (licenseDocumentTypeEClass,
		   source,
		   new String[] {
			   "name", "LicenseDocument_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLicenseDocumentType_Type(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "type",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLicenseDocumentType_Title(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "title",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLicenseDocumentType_Description(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "description",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLicenseDocumentType_Identifier(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "identifier",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLicenseDocumentType_About(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "about",
			   "namespace", "http://www.w3.org/1999/02/22-rdf-syntax-ns#"
		   });
		addAnnotation
		  (getLicenseDocumentType_NodeID(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nodeID",
			   "namespace", "http://www.w3.org/1999/02/22-rdf-syntax-ns#"
		   });
		addAnnotation
		  (locationEClass,
		   source,
		   new String[] {
			   "name", "Location",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLocation_Location(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Location",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (locationTypeEClass,
		   source,
		   new String[] {
			   "name", "Location_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLocationType_Geometry(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geometry",
			   "namespace", "http://www.w3.org/ns/locn#"
		   });
		addAnnotation
		  (getLocationType_PrefLabel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "prefLabel",
			   "namespace", "http://www.w3.org/2004/02/skos/core#"
		   });
		addAnnotation
		  (getLocationType_About(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "about",
			   "namespace", "http://www.w3.org/1999/02/22-rdf-syntax-ns#"
		   });
		addAnnotation
		  (getLocationType_NodeID(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nodeID",
			   "namespace", "http://www.w3.org/1999/02/22-rdf-syntax-ns#"
		   });
		addAnnotation
		  (periodOfTimeEClass,
		   source,
		   new String[] {
			   "name", "PeriodOfTime",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPeriodOfTime_PeriodOfTime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PeriodOfTime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (periodOfTimeTypeEClass,
		   source,
		   new String[] {
			   "name", "PeriodOfTime_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPeriodOfTimeType_StartDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "startDate",
			   "namespace", "http://schema.org/"
		   });
		addAnnotation
		  (getPeriodOfTimeType_EndDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "endDate",
			   "namespace", "http://schema.org/"
		   });
		addAnnotation
		  (getPeriodOfTimeType_About(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "about",
			   "namespace", "http://www.w3.org/1999/02/22-rdf-syntax-ns#"
		   });
		addAnnotation
		  (getPeriodOfTimeType_NodeID(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nodeID",
			   "namespace", "http://www.w3.org/1999/02/22-rdf-syntax-ns#"
		   });
		addAnnotation
		  (provenanceStatementEClass,
		   source,
		   new String[] {
			   "name", "ProvenanceStatement",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getProvenanceStatement_ProvenanceStatement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ProvenanceStatement",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (provenanceStatementTypeEClass,
		   source,
		   new String[] {
			   "name", "ProvenanceStatement_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getProvenanceStatementType_Description(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "description",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getProvenanceStatementType_About(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "about",
			   "namespace", "http://www.w3.org/1999/02/22-rdf-syntax-ns#"
		   });
		addAnnotation
		  (getProvenanceStatementType_NodeID(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nodeID",
			   "namespace", "http://www.w3.org/1999/02/22-rdf-syntax-ns#"
		   });
		addAnnotation
		  (rightsStatementEClass,
		   source,
		   new String[] {
			   "name", "RightsStatement",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRightsStatement_RightsStatement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RightsStatement",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (rightsStatementTypeEClass,
		   source,
		   new String[] {
			   "name", "RightsStatement_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRightsStatementType_Title(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "title",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRightsStatementType_Description(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "description",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRightsStatementType_About(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "about",
			   "namespace", "http://www.w3.org/1999/02/22-rdf-syntax-ns#"
		   });
		addAnnotation
		  (getRightsStatementType_NodeID(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nodeID",
			   "namespace", "http://www.w3.org/1999/02/22-rdf-syntax-ns#"
		   });
		addAnnotation
		  (standardEClass,
		   source,
		   new String[] {
			   "name", "Standard",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStandard_Standard(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Standard",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (standardTypeEClass,
		   source,
		   new String[] {
			   "name", "Standard_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStandardType_Title(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "title",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStandardType_Description(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "description",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStandardType_About(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "about",
			   "namespace", "http://www.w3.org/1999/02/22-rdf-syntax-ns#"
		   });
		addAnnotation
		  (getStandardType_NodeID(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nodeID",
			   "namespace", "http://www.w3.org/1999/02/22-rdf-syntax-ns#"
		   });
	}

} //TermsPackageImpl
