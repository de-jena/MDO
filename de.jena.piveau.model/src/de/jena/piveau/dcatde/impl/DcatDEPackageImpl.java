/**
 */
package de.jena.piveau.dcatde.impl;

import de.jena.piveau.adms.AdmsPackage;

import de.jena.piveau.adms.impl.AdmsPackageImpl;

import de.jena.piveau.dcat.DcatPackage;

import de.jena.piveau.dcat.impl.DcatPackageImpl;

import de.jena.piveau.dcatde.ContributorID;
import de.jena.piveau.dcatde.DCATDERoot;
import de.jena.piveau.dcatde.DcatDEFactory;
import de.jena.piveau.dcatde.DcatDEPackage;

import de.jena.piveau.foaf.FoafPackage;

import de.jena.piveau.foaf.impl.FoafPackageImpl;

import de.jena.piveau.locn.LocnPackage;

import de.jena.piveau.locn.impl.LocnPackageImpl;

import de.jena.piveau.odrl.OdrlPackage;

import de.jena.piveau.odrl.impl.OdrlPackageImpl;

import de.jena.piveau.owl.OwlPackage;

import de.jena.piveau.owl.impl.OwlPackageImpl;

import de.jena.piveau.prov.ProvPackage;

import de.jena.piveau.prov.impl.ProvPackageImpl;

import de.jena.piveau.rdf.RdfPackage;

import de.jena.piveau.rdf.impl.RdfPackageImpl;

import de.jena.piveau.schema.SchemaPackage;

import de.jena.piveau.schema.impl.SchemaPackageImpl;

import de.jena.piveau.skos.SkosPackage;

import de.jena.piveau.skos.impl.SkosPackageImpl;

import de.jena.piveau.terms.TermsPackage;

import de.jena.piveau.terms.impl.TermsPackageImpl;

import de.jena.piveau.vcard.VcardPackage;

import de.jena.piveau.vcard.impl.VcardPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DcatDEPackageImpl extends EPackageImpl implements DcatDEPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contributorIDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcatdeRootEClass = null;

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
	 * @see de.jena.piveau.dcatde.DcatDEPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DcatDEPackageImpl() {
		super(eNS_URI, DcatDEFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DcatDEPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DcatDEPackage init() {
		if (isInited) return (DcatDEPackage)EPackage.Registry.INSTANCE.getEPackage(DcatDEPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDcatDEPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DcatDEPackageImpl theDcatDEPackage = registeredDcatDEPackage instanceof DcatDEPackageImpl ? (DcatDEPackageImpl)registeredDcatDEPackage : new DcatDEPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DcatPackage.eNS_URI);
		DcatPackageImpl theDcatPackage = (DcatPackageImpl)(registeredPackage instanceof DcatPackageImpl ? registeredPackage : DcatPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FoafPackage.eNS_URI);
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

		// Create package meta-data objects
		theDcatDEPackage.createPackageContents();
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

		// Initialize created meta-data
		theDcatDEPackage.initializePackageContents();
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

		// Mark meta-data to indicate it can't be changed
		theDcatDEPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DcatDEPackage.eNS_URI, theDcatDEPackage);
		return theDcatDEPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContributorID() {
		return contributorIDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDCATDERoot() {
		return dcatdeRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCATDERoot_Mixed() {
		return (EAttribute)dcatdeRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDCATDERoot_XMLNSPrefixMap() {
		return (EReference)dcatdeRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDCATDERoot_XSISchemaLocation() {
		return (EReference)dcatdeRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDCATDERoot_LicenseAttributionByText() {
		return (EReference)dcatdeRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDCATDERoot_ContributorID() {
		return (EReference)dcatdeRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DcatDEFactory getDcatDEFactory() {
		return (DcatDEFactory)getEFactoryInstance();
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
		contributorIDEClass = createEClass(CONTRIBUTOR_ID);

		dcatdeRootEClass = createEClass(DCATDE_ROOT);
		createEAttribute(dcatdeRootEClass, DCATDE_ROOT__MIXED);
		createEReference(dcatdeRootEClass, DCATDE_ROOT__XMLNS_PREFIX_MAP);
		createEReference(dcatdeRootEClass, DCATDE_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(dcatdeRootEClass, DCATDE_ROOT__LICENSE_ATTRIBUTION_BY_TEXT);
		createEReference(dcatdeRootEClass, DCATDE_ROOT__CONTRIBUTOR_ID);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		contributorIDEClass.getESuperTypes().add(theRdfPackage.getResource());

		// Initialize classes, features, and operations; add parameters
		initEClass(contributorIDEClass, ContributorID.class, "ContributorID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dcatdeRootEClass, DCATDERoot.class, "DCATDERoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDCATDERoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDCATDERoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDCATDERoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDCATDERoot_LicenseAttributionByText(), theRdfPackage.getPlainLiteral(), null, "licenseAttributionByText", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDCATDERoot_ContributorID(), theRdfPackage.getResource(), null, "contributorID", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

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
		  (contributorIDEClass,
		   source,
		   new String[] {
			   "name", "Contributor",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (dcatdeRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDCATDERoot_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getDCATDERoot_XMLNSPrefixMap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmlns:prefix"
		   });
		addAnnotation
		  (getDCATDERoot_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
		addAnnotation
		  (getDCATDERoot_LicenseAttributionByText(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "licenseAttributionByText",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDCATDERoot_ContributorID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "contributorID",
			   "namespace", "##targetNamespace"
		   });
	}

} //DcatDEPackageImpl
