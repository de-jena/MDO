/**
 */
package org.w3.ns.rdf.impl;

import com.xmlns.foaf.foaf.FoafPackage;

import com.xmlns.foaf.foaf.impl.FoafPackageImpl;

import de.dcatde.dcatde.DcatDEPackage;

import de.dcatde.dcatde.impl.DcatDEPackageImpl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.purl.dc.terms.terms.TermsPackage;

import org.purl.dc.terms.terms.impl.TermsPackageImpl;

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

import org.w3.ns.rdf.CatalogRoot;
import org.w3.ns.rdf.DatatypeType;
import org.w3.ns.rdf.DateLiteral;
import org.w3.ns.rdf.DateOrDateTimeLiteral;
import org.w3.ns.rdf.DateTimeLiteral;
import org.w3.ns.rdf.DocumentRoot;
import org.w3.ns.rdf.ObjectType;
import org.w3.ns.rdf.PlainLiteral;
import org.w3.ns.rdf.PredicateType;
import org.w3.ns.rdf.RdfFactory;
import org.w3.ns.rdf.RdfPackage;
import org.w3.ns.rdf.Resource;
import org.w3.ns.rdf.Statement;
import org.w3.ns.rdf.StatementType;
import org.w3.ns.rdf.SubjectType;
import org.w3.ns.rdf.TypedLiteral;

import org.w3.ns.rdf.util.RdfValidator;

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
public class RdfPackageImpl extends EPackageImpl implements RdfPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateOrDateTimeLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTimeLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plainLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subjectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedLiteralEClass = null;

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
	private EEnum datatypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType datatypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateOrDateTimeEDataType = null;

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
	 * @see org.w3.ns.rdf.RdfPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RdfPackageImpl() {
		super(eNS_URI, RdfFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RdfPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RdfPackage init() {
		if (isInited) return (RdfPackage)EPackage.Registry.INSTANCE.getEPackage(RdfPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRdfPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RdfPackageImpl theRdfPackage = registeredRdfPackage instanceof RdfPackageImpl ? (RdfPackageImpl)registeredRdfPackage : new RdfPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI);
		TermsPackageImpl theTermsPackage = (TermsPackageImpl)(registeredPackage instanceof TermsPackageImpl ? registeredPackage : TermsPackage.eINSTANCE);
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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DcatDEPackage.eNS_URI);
		DcatDEPackageImpl theDcatDEPackage = (DcatDEPackageImpl)(registeredPackage instanceof DcatDEPackageImpl ? registeredPackage : DcatDEPackage.eINSTANCE);

		// Create package meta-data objects
		theRdfPackage.createPackageContents();
		theTermsPackage.createPackageContents();
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
		theDcatDEPackage.createPackageContents();

		// Initialize created meta-data
		theRdfPackage.initializePackageContents();
		theTermsPackage.initializePackageContents();
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
		theDcatDEPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theRdfPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return RdfValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theRdfPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RdfPackage.eNS_URI, theRdfPackage);
		return theRdfPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCatalogRoot() {
		return catalogRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogRoot_Group() {
		return (EAttribute)catalogRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalogRoot_Catalog() {
		return (EReference)catalogRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalogRoot_CatalogRecord() {
		return (EReference)catalogRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalogRoot_Dataset() {
		return (EReference)catalogRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalogRoot_DataService() {
		return (EReference)catalogRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDateLiteral() {
		return dateLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateLiteral_Value() {
		return (EAttribute)dateLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateLiteral_Datatype() {
		return (EAttribute)dateLiteralEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDateOrDateTimeLiteral() {
		return dateOrDateTimeLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateOrDateTimeLiteral_Value() {
		return (EAttribute)dateOrDateTimeLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateOrDateTimeLiteral_Datatype() {
		return (EAttribute)dateOrDateTimeLiteralEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDateTimeLiteral() {
		return dateTimeLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateTimeLiteral_Value() {
		return (EAttribute)dateTimeLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateTimeLiteral_Datatype() {
		return (EAttribute)dateTimeLiteralEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObjectType() {
		return objectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjectType_Value() {
		return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjectType_Datatype() {
		return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjectType_Resource() {
		return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlainLiteral() {
		return plainLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlainLiteral_Value() {
		return (EAttribute)plainLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlainLiteral_Lang() {
		return (EAttribute)plainLiteralEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPredicateType() {
		return predicateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPredicateType_Resource() {
		return (EAttribute)predicateTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResource_Resource() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStatement_Statement() {
		return (EReference)statementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStatementType() {
		return statementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStatementType_Subject() {
		return (EReference)statementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStatementType_Predicate() {
		return (EReference)statementTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStatementType_Object() {
		return (EReference)statementTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatementType_About() {
		return (EAttribute)statementTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubjectType() {
		return subjectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubjectType_Resource() {
		return (EAttribute)subjectTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypedLiteral() {
		return typedLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTypedLiteral_Value() {
		return (EAttribute)typedLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTypedLiteral_Datatype() {
		return (EAttribute)typedLiteralEClass.getEStructuralFeatures().get(1);
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
	public EReference getDocumentRoot_RDF() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Type() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_About() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Datatype() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_NodeID() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Resource() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDatatypeType() {
		return datatypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDatatypeTypeObject() {
		return datatypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDateOrDateTime() {
		return dateOrDateTimeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RdfFactory getRdfFactory() {
		return (RdfFactory)getEFactoryInstance();
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
		catalogRootEClass = createEClass(CATALOG_ROOT);
		createEAttribute(catalogRootEClass, CATALOG_ROOT__GROUP);
		createEReference(catalogRootEClass, CATALOG_ROOT__CATALOG);
		createEReference(catalogRootEClass, CATALOG_ROOT__CATALOG_RECORD);
		createEReference(catalogRootEClass, CATALOG_ROOT__DATASET);
		createEReference(catalogRootEClass, CATALOG_ROOT__DATA_SERVICE);

		dateLiteralEClass = createEClass(DATE_LITERAL);
		createEAttribute(dateLiteralEClass, DATE_LITERAL__VALUE);
		createEAttribute(dateLiteralEClass, DATE_LITERAL__DATATYPE);

		dateOrDateTimeLiteralEClass = createEClass(DATE_OR_DATE_TIME_LITERAL);
		createEAttribute(dateOrDateTimeLiteralEClass, DATE_OR_DATE_TIME_LITERAL__VALUE);
		createEAttribute(dateOrDateTimeLiteralEClass, DATE_OR_DATE_TIME_LITERAL__DATATYPE);

		dateTimeLiteralEClass = createEClass(DATE_TIME_LITERAL);
		createEAttribute(dateTimeLiteralEClass, DATE_TIME_LITERAL__VALUE);
		createEAttribute(dateTimeLiteralEClass, DATE_TIME_LITERAL__DATATYPE);

		objectTypeEClass = createEClass(OBJECT_TYPE);
		createEAttribute(objectTypeEClass, OBJECT_TYPE__VALUE);
		createEAttribute(objectTypeEClass, OBJECT_TYPE__DATATYPE);
		createEAttribute(objectTypeEClass, OBJECT_TYPE__RESOURCE);

		plainLiteralEClass = createEClass(PLAIN_LITERAL);
		createEAttribute(plainLiteralEClass, PLAIN_LITERAL__VALUE);
		createEAttribute(plainLiteralEClass, PLAIN_LITERAL__LANG);

		predicateTypeEClass = createEClass(PREDICATE_TYPE);
		createEAttribute(predicateTypeEClass, PREDICATE_TYPE__RESOURCE);

		resourceEClass = createEClass(RESOURCE);
		createEAttribute(resourceEClass, RESOURCE__RESOURCE);

		statementEClass = createEClass(STATEMENT);
		createEReference(statementEClass, STATEMENT__STATEMENT);

		statementTypeEClass = createEClass(STATEMENT_TYPE);
		createEReference(statementTypeEClass, STATEMENT_TYPE__SUBJECT);
		createEReference(statementTypeEClass, STATEMENT_TYPE__PREDICATE);
		createEReference(statementTypeEClass, STATEMENT_TYPE__OBJECT);
		createEAttribute(statementTypeEClass, STATEMENT_TYPE__ABOUT);

		subjectTypeEClass = createEClass(SUBJECT_TYPE);
		createEAttribute(subjectTypeEClass, SUBJECT_TYPE__RESOURCE);

		typedLiteralEClass = createEClass(TYPED_LITERAL);
		createEAttribute(typedLiteralEClass, TYPED_LITERAL__VALUE);
		createEAttribute(typedLiteralEClass, TYPED_LITERAL__DATATYPE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RDF);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TYPE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ABOUT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DATATYPE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__NODE_ID);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__RESOURCE);

		// Create enums
		datatypeTypeEEnum = createEEnum(DATATYPE_TYPE);

		// Create data types
		datatypeTypeObjectEDataType = createEDataType(DATATYPE_TYPE_OBJECT);
		dateOrDateTimeEDataType = createEDataType(DATE_OR_DATE_TIME);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(catalogRootEClass, CatalogRoot.class, "CatalogRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCatalogRoot_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, CatalogRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalogRoot_Catalog(), theDcatPackage.getCatalog1(), null, "catalog", null, 0, -1, CatalogRoot.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCatalogRoot_CatalogRecord(), theDcatPackage.getCatalogRecordType(), null, "catalogRecord", null, 0, -1, CatalogRoot.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCatalogRoot_Dataset(), theDcatPackage.getDatasetType(), null, "dataset", null, 0, -1, CatalogRoot.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCatalogRoot_DataService(), theDcatPackage.getDataServiceType(), null, "dataService", null, 0, -1, CatalogRoot.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(dateLiteralEClass, DateLiteral.class, "DateLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateLiteral_Value(), theXMLTypePackage.getDate(), "value", null, 0, 1, DateLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateLiteral_Datatype(), theXMLTypePackage.getAnyURI(), "datatype", "http://www.w3.org/2001/XMLSchema#date", 0, 1, DateLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateOrDateTimeLiteralEClass, DateOrDateTimeLiteral.class, "DateOrDateTimeLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateOrDateTimeLiteral_Value(), this.getDateOrDateTime(), "value", null, 0, 1, DateOrDateTimeLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateOrDateTimeLiteral_Datatype(), this.getDatatypeType(), "datatype", null, 0, 1, DateOrDateTimeLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateTimeLiteralEClass, DateTimeLiteral.class, "DateTimeLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateTimeLiteral_Value(), theXMLTypePackage.getDateTime(), "value", null, 0, 1, DateTimeLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTimeLiteral_Datatype(), theXMLTypePackage.getAnyURI(), "datatype", "http://www.w3.org/2001/XMLSchema#dateTime", 0, 1, DateTimeLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectTypeEClass, ObjectType.class, "ObjectType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, ObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectType_Datatype(), theXMLTypePackage.getAnyURI(), "datatype", null, 0, 1, ObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectType_Resource(), theXMLTypePackage.getAnyURI(), "resource", null, 0, 1, ObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plainLiteralEClass, PlainLiteral.class, "PlainLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlainLiteral_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, PlainLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlainLiteral_Lang(), theXMLTypePackage.getLanguage(), "lang", null, 0, 1, PlainLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predicateTypeEClass, PredicateType.class, "PredicateType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPredicateType_Resource(), theXMLTypePackage.getAnyURI(), "resource", null, 1, 1, PredicateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResource_Resource(), theXMLTypePackage.getAnyURI(), "resource", null, 1, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatement_Statement(), this.getStatementType(), null, "statement", null, 1, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statementTypeEClass, StatementType.class, "StatementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatementType_Subject(), this.getSubjectType(), null, "subject", null, 1, 1, StatementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatementType_Predicate(), this.getPredicateType(), null, "predicate", null, 1, 1, StatementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatementType_Object(), this.getObjectType(), null, "object", null, 1, 1, StatementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatementType_About(), theXMLTypePackage.getAnyURI(), "about", null, 0, 1, StatementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subjectTypeEClass, SubjectType.class, "SubjectType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubjectType_Resource(), theXMLTypePackage.getAnyURI(), "resource", null, 1, 1, SubjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typedLiteralEClass, TypedLiteral.class, "TypedLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypedLiteral_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, TypedLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypedLiteral_Datatype(), theXMLTypePackage.getAnyURI(), "datatype", null, 0, 1, TypedLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RDF(), this.getCatalogRoot(), null, "rDF", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Type(), this.getResource(), null, "type", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_About(), theXMLTypePackage.getAnyURI(), "about", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Datatype(), theXMLTypePackage.getAnyURI(), "datatype", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_NodeID(), theXMLTypePackage.getNCName(), "nodeID", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Resource(), theXMLTypePackage.getAnyURI(), "resource", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(datatypeTypeEEnum, DatatypeType.class, "DatatypeType");
		addEEnumLiteral(datatypeTypeEEnum, DatatypeType.HTTP_WWW_W3_ORG2001_XML_SCHEMA_DATE);
		addEEnumLiteral(datatypeTypeEEnum, DatatypeType.HTTP_WWW_W3_ORG2001_XML_SCHEMA_DATE_TIME);

		// Initialize data types
		initEDataType(datatypeTypeObjectEDataType, DatatypeType.class, "DatatypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dateOrDateTimeEDataType, XMLGregorianCalendar.class, "DateOrDateTime", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (catalogRootEClass,
		   source,
		   new String[] {
			   "name", "CatalogRoot",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCatalogRoot_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:0"
		   });
		addAnnotation
		  (getCatalogRoot_Catalog(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Catalog",
			   "namespace", "http://www.w3.org/ns/dcat#",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getCatalogRoot_CatalogRecord(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CatalogRecord",
			   "namespace", "http://www.w3.org/ns/dcat#",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getCatalogRoot_Dataset(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Dataset",
			   "namespace", "http://www.w3.org/ns/dcat#",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getCatalogRoot_DataService(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DataService",
			   "namespace", "http://www.w3.org/ns/dcat#",
			   "group", "#group:0"
		   });
		addAnnotation
		  (datatypeTypeEEnum,
		   source,
		   new String[] {
			   "name", "datatype_._type"
		   });
		addAnnotation
		  (datatypeTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "datatype_._type:Object",
			   "baseType", "datatype_._type"
		   });
		addAnnotation
		  (dateLiteralEClass,
		   source,
		   new String[] {
			   "name", "DateLiteral",
			   "kind", "simple"
		   });
		addAnnotation
		  (getDateLiteral_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getDateLiteral_Datatype(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "datatype",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (dateOrDateTimeEDataType,
		   source,
		   new String[] {
			   "name", "dateOrDateTime",
			   "memberTypes", "http://www.eclipse.org/emf/2003/XMLType#date http://www.eclipse.org/emf/2003/XMLType#dateTime"
		   });
		addAnnotation
		  (dateOrDateTimeLiteralEClass,
		   source,
		   new String[] {
			   "name", "DateOrDateTimeLiteral",
			   "kind", "simple"
		   });
		addAnnotation
		  (getDateOrDateTimeLiteral_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getDateOrDateTimeLiteral_Datatype(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "datatype",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (dateTimeLiteralEClass,
		   source,
		   new String[] {
			   "name", "DateTimeLiteral",
			   "kind", "simple"
		   });
		addAnnotation
		  (getDateTimeLiteral_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getDateTimeLiteral_Datatype(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "datatype",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (objectTypeEClass,
		   source,
		   new String[] {
			   "name", "object_._type",
			   "kind", "simple"
		   });
		addAnnotation
		  (getObjectType_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getObjectType_Datatype(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "datatype",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getObjectType_Resource(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "resource",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (plainLiteralEClass,
		   source,
		   new String[] {
			   "name", "PlainLiteral",
			   "kind", "simple"
		   });
		addAnnotation
		  (getPlainLiteral_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getPlainLiteral_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (predicateTypeEClass,
		   source,
		   new String[] {
			   "name", "predicate_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (getPredicateType_Resource(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "resource",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (resourceEClass,
		   source,
		   new String[] {
			   "name", "Resource",
			   "kind", "empty"
		   });
		addAnnotation
		  (getResource_Resource(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "resource",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (statementEClass,
		   source,
		   new String[] {
			   "name", "Statement",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStatement_Statement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Statement",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (statementTypeEClass,
		   source,
		   new String[] {
			   "name", "Statement_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStatementType_Subject(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "subject",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStatementType_Predicate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "predicate",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStatementType_Object(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "object",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStatementType_About(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "about",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (subjectTypeEClass,
		   source,
		   new String[] {
			   "name", "subject_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (getSubjectType_Resource(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "resource",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (typedLiteralEClass,
		   source,
		   new String[] {
			   "name", "TypedLiteral",
			   "kind", "simple"
		   });
		addAnnotation
		  (getTypedLiteral_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getTypedLiteral_Datatype(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "datatype",
			   "namespace", "##targetNamespace"
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
		  (getDocumentRoot_RDF(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RDF",
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
		  (getDocumentRoot_About(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "about",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Datatype(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "datatype",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_NodeID(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nodeID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Resource(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "resource",
			   "namespace", "##targetNamespace"
		   });
	}

} //RdfPackageImpl