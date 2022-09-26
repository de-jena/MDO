/**
 */
package org.w3.ns.adms.impl;

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

import org.w3.ns.adms.AdmsFactory;
import org.w3.ns.adms.AdmsPackage;
import org.w3.ns.adms.DocumentRoot;
import org.w3.ns.adms.Identifier;
import org.w3.ns.adms.IdentifierType;

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
public class AdmsPackageImpl extends EPackageImpl implements AdmsPackage {
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
	private EClass identifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifierTypeEClass = null;

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
	 * @see org.w3.ns.adms.AdmsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AdmsPackageImpl() {
		super(eNS_URI, AdmsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AdmsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AdmsPackage init() {
		if (isInited) return (AdmsPackage)EPackage.Registry.INSTANCE.getEPackage(AdmsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAdmsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AdmsPackageImpl theAdmsPackage = registeredAdmsPackage instanceof AdmsPackageImpl ? (AdmsPackageImpl)registeredAdmsPackage : new AdmsPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ProvPackage.eNS_URI);
		ProvPackageImpl theProvPackage = (ProvPackageImpl)(registeredPackage instanceof ProvPackageImpl ? registeredPackage : ProvPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OwlPackage.eNS_URI);
		OwlPackageImpl theOwlPackage = (OwlPackageImpl)(registeredPackage instanceof OwlPackageImpl ? registeredPackage : OwlPackage.eINSTANCE);

		// Create package meta-data objects
		theAdmsPackage.createPackageContents();
		theTermsPackage.createPackageContents();
		theRdfPackage.createPackageContents();
		theSkosPackage.createPackageContents();
		theDcatPackage.createPackageContents();
		theVcardPackage.createPackageContents();
		theFoafPackage.createPackageContents();
		theSchemaPackage.createPackageContents();
		theLocnPackage.createPackageContents();
		theOdrlPackage.createPackageContents();
		theProvPackage.createPackageContents();
		theOwlPackage.createPackageContents();

		// Initialize created meta-data
		theAdmsPackage.initializePackageContents();
		theTermsPackage.initializePackageContents();
		theRdfPackage.initializePackageContents();
		theSkosPackage.initializePackageContents();
		theDcatPackage.initializePackageContents();
		theVcardPackage.initializePackageContents();
		theFoafPackage.initializePackageContents();
		theSchemaPackage.initializePackageContents();
		theLocnPackage.initializePackageContents();
		theOdrlPackage.initializePackageContents();
		theProvPackage.initializePackageContents();
		theOwlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAdmsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AdmsPackage.eNS_URI, theAdmsPackage);
		return theAdmsPackage;
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
	public EReference getDocumentRoot_Identifier() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Sample() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Status() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_VersionNotes() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdentifier() {
		return identifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIdentifier_Identifier() {
		return (EReference)identifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdentifierType() {
		return identifierTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIdentifierType_Notation() {
		return (EReference)identifierTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentifierType_About() {
		return (EAttribute)identifierTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdmsFactory getAdmsFactory() {
		return (AdmsFactory)getEFactoryInstance();
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
		createEReference(documentRootEClass, DOCUMENT_ROOT__IDENTIFIER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SAMPLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__STATUS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__VERSION_NOTES);

		identifierEClass = createEClass(IDENTIFIER);
		createEReference(identifierEClass, IDENTIFIER__IDENTIFIER);

		identifierTypeEClass = createEClass(IDENTIFIER_TYPE);
		createEReference(identifierTypeEClass, IDENTIFIER_TYPE__NOTATION);
		createEAttribute(identifierTypeEClass, IDENTIFIER_TYPE__ABOUT);
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
		DcatPackage theDcatPackage = (DcatPackage)EPackage.Registry.INSTANCE.getEPackage(DcatPackage.eNS_URI);
		SkosPackage theSkosPackage = (SkosPackage)EPackage.Registry.INSTANCE.getEPackage(SkosPackage.eNS_URI);
		RdfPackage theRdfPackage = (RdfPackage)EPackage.Registry.INSTANCE.getEPackage(RdfPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Identifier(), this.getIdentifier(), null, "identifier", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Sample(), theDcatPackage.getDistribution(), null, "sample", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Status(), theSkosPackage.getConcept(), null, "status", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_VersionNotes(), theRdfPackage.getPlainLiteral(), null, "versionNotes", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(identifierEClass, Identifier.class, "Identifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIdentifier_Identifier(), this.getIdentifierType(), null, "identifier", null, 1, 1, Identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifierTypeEClass, IdentifierType.class, "IdentifierType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIdentifierType_Notation(), theRdfPackage.getTypedLiteral(), null, "notation", null, 1, 1, IdentifierType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifierType_About(), theXMLTypePackage.getAnyURI(), "about", null, 0, 1, IdentifierType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (getDocumentRoot_Identifier(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "identifier",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Sample(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "sample",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Status(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "status",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_VersionNotes(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "versionNotes",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (identifierEClass,
		   source,
		   new String[] {
			   "name", "Identifier",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIdentifier_Identifier(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Identifier",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (identifierTypeEClass,
		   source,
		   new String[] {
			   "name", "Identifier_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIdentifierType_Notation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "notation",
			   "namespace", "http://www.w3.org/2004/02/skos/core#"
		   });
		addAnnotation
		  (getIdentifierType_About(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "about",
			   "namespace", "http://www.w3.org/1999/02/22-rdf-syntax-ns#"
		   });
	}

} //AdmsPackageImpl
