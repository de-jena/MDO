/**
 */
package de.jena.mdo.model.dbtree.impl;

import de.jena.mdo.model.dbtree.DBTree;
import de.jena.mdo.model.dbtree.DbtreeFactory;
import de.jena.mdo.model.dbtree.DbtreePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DbtreePackageImpl extends EPackageImpl implements DbtreePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dbTreeEClass = null;

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
	 * @see de.jena.mdo.model.dbtree.DbtreePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DbtreePackageImpl() {
		super(eNS_URI, DbtreeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DbtreePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DbtreePackage init() {
		if (isInited) return (DbtreePackage)EPackage.Registry.INSTANCE.getEPackage(DbtreePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDbtreePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DbtreePackageImpl theDbtreePackage = registeredDbtreePackage instanceof DbtreePackageImpl ? (DbtreePackageImpl)registeredDbtreePackage : new DbtreePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDbtreePackage.createPackageContents();

		// Initialize created meta-data
		theDbtreePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDbtreePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DbtreePackage.eNS_URI, theDbtreePackage);
		return theDbtreePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDBTree() {
		return dbTreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDBTree_TreeId() {
		return (EAttribute)dbTreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDBTree_AlkNumber() {
		return (EAttribute)dbTreeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDBTree_Height() {
		return (EAttribute)dbTreeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDBTree_Number() {
		return (EAttribute)dbTreeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDBTree_DiameterTreeTop() {
		return (EAttribute)dbTreeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDBTree_DiameterTreeTrunk() {
		return (EAttribute)dbTreeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDBTree_ExtentTreeTrunk() {
		return (EAttribute)dbTreeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDBTree_LastRegCheck() {
		return (EAttribute)dbTreeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDBTree_LastRegCheckText() {
		return (EAttribute)dbTreeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDBTree_LastRegCheckName() {
		return (EAttribute)dbTreeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDBTree_Genre() {
		return (EAttribute)dbTreeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDBTree_GenreType() {
		return (EAttribute)dbTreeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDBTree_GenreDetail() {
		return (EAttribute)dbTreeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDBTree_CutDate() {
		return (EAttribute)dbTreeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDBTree_Guid() {
		return (EAttribute)dbTreeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDBTree_GisId() {
		return (EAttribute)dbTreeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDBTree_PlantYear() {
		return (EAttribute)dbTreeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDBTree_Vitality() {
		return (EAttribute)dbTreeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDBTree_Tour() {
		return (EAttribute)dbTreeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDBTree_Department() {
		return (EAttribute)dbTreeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDBTree_UtmNorth() {
		return (EAttribute)dbTreeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDBTree_UtmEast() {
		return (EAttribute)dbTreeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDBTree_Origin() {
		return (EAttribute)dbTreeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDBTree_ResponsibilityEnd() {
		return (EAttribute)dbTreeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDBTree_Area() {
		return (EAttribute)dbTreeEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDBTree_Location() {
		return (EAttribute)dbTreeEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDBTree_StreetShort() {
		return (EAttribute)dbTreeEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDBTree_Street() {
		return (EAttribute)dbTreeEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDBTree_Simple() {
		return (EAttribute)dbTreeEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDBTree_XSISchemaLocation() {
		return (EReference)dbTreeEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DbtreeFactory getDbtreeFactory() {
		return (DbtreeFactory)getEFactoryInstance();
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
		dbTreeEClass = createEClass(DB_TREE);
		createEAttribute(dbTreeEClass, DB_TREE__TREE_ID);
		createEAttribute(dbTreeEClass, DB_TREE__ALK_NUMBER);
		createEAttribute(dbTreeEClass, DB_TREE__HEIGHT);
		createEAttribute(dbTreeEClass, DB_TREE__NUMBER);
		createEAttribute(dbTreeEClass, DB_TREE__DIAMETER_TREE_TOP);
		createEAttribute(dbTreeEClass, DB_TREE__DIAMETER_TREE_TRUNK);
		createEAttribute(dbTreeEClass, DB_TREE__EXTENT_TREE_TRUNK);
		createEAttribute(dbTreeEClass, DB_TREE__LAST_REG_CHECK);
		createEAttribute(dbTreeEClass, DB_TREE__LAST_REG_CHECK_TEXT);
		createEAttribute(dbTreeEClass, DB_TREE__LAST_REG_CHECK_NAME);
		createEAttribute(dbTreeEClass, DB_TREE__GENRE);
		createEAttribute(dbTreeEClass, DB_TREE__GENRE_TYPE);
		createEAttribute(dbTreeEClass, DB_TREE__GENRE_DETAIL);
		createEAttribute(dbTreeEClass, DB_TREE__CUT_DATE);
		createEAttribute(dbTreeEClass, DB_TREE__GUID);
		createEAttribute(dbTreeEClass, DB_TREE__GIS_ID);
		createEAttribute(dbTreeEClass, DB_TREE__PLANT_YEAR);
		createEAttribute(dbTreeEClass, DB_TREE__VITALITY);
		createEAttribute(dbTreeEClass, DB_TREE__TOUR);
		createEAttribute(dbTreeEClass, DB_TREE__DEPARTMENT);
		createEAttribute(dbTreeEClass, DB_TREE__UTM_NORTH);
		createEAttribute(dbTreeEClass, DB_TREE__UTM_EAST);
		createEAttribute(dbTreeEClass, DB_TREE__ORIGIN);
		createEAttribute(dbTreeEClass, DB_TREE__RESPONSIBILITY_END);
		createEAttribute(dbTreeEClass, DB_TREE__AREA);
		createEAttribute(dbTreeEClass, DB_TREE__LOCATION);
		createEAttribute(dbTreeEClass, DB_TREE__STREET_SHORT);
		createEAttribute(dbTreeEClass, DB_TREE__STREET);
		createEAttribute(dbTreeEClass, DB_TREE__SIMPLE);
		createEReference(dbTreeEClass, DB_TREE__XSI_SCHEMA_LOCATION);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(dbTreeEClass, DBTree.class, "DBTree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDBTree_TreeId(), ecorePackage.getELongObject(), "treeId", null, 0, 1, DBTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBTree_AlkNumber(), ecorePackage.getEString(), "alkNumber", null, 0, 1, DBTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBTree_Height(), ecorePackage.getEString(), "height", null, 0, 1, DBTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBTree_Number(), ecorePackage.getEString(), "number", null, 0, 1, DBTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBTree_DiameterTreeTop(), ecorePackage.getEDouble(), "diameterTreeTop", null, 0, 1, DBTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBTree_DiameterTreeTrunk(), ecorePackage.getEDouble(), "diameterTreeTrunk", null, 0, 1, DBTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBTree_ExtentTreeTrunk(), ecorePackage.getEDouble(), "extentTreeTrunk", null, 0, 1, DBTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBTree_LastRegCheck(), ecorePackage.getEDate(), "lastRegCheck", null, 0, 1, DBTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBTree_LastRegCheckText(), ecorePackage.getEString(), "lastRegCheckText", null, 0, 1, DBTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBTree_LastRegCheckName(), ecorePackage.getEString(), "lastRegCheckName", null, 0, 1, DBTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBTree_Genre(), ecorePackage.getEString(), "genre", null, 0, 1, DBTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBTree_GenreType(), ecorePackage.getEString(), "genreType", null, 0, 1, DBTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBTree_GenreDetail(), ecorePackage.getEString(), "genreDetail", null, 0, 1, DBTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBTree_CutDate(), ecorePackage.getEDate(), "cutDate", null, 0, 1, DBTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBTree_Guid(), ecorePackage.getEString(), "guid", null, 0, 1, DBTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBTree_GisId(), ecorePackage.getEString(), "gisId", null, 0, 1, DBTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBTree_PlantYear(), ecorePackage.getEInt(), "plantYear", null, 0, 1, DBTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBTree_Vitality(), ecorePackage.getEInt(), "vitality", null, 0, 1, DBTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBTree_Tour(), ecorePackage.getEString(), "tour", null, 0, 1, DBTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBTree_Department(), ecorePackage.getEString(), "department", null, 0, 1, DBTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBTree_UtmNorth(), ecorePackage.getEFloat(), "utmNorth", null, 0, 1, DBTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBTree_UtmEast(), ecorePackage.getEFloat(), "utmEast", null, 0, 1, DBTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBTree_Origin(), ecorePackage.getEString(), "origin", null, 0, 1, DBTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBTree_ResponsibilityEnd(), ecorePackage.getEDate(), "responsibilityEnd", null, 0, 1, DBTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBTree_Area(), ecorePackage.getEString(), "area", null, 0, 1, DBTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBTree_Location(), ecorePackage.getEString(), "location", null, 0, 1, DBTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBTree_StreetShort(), ecorePackage.getEString(), "streetShort", null, 0, 1, DBTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBTree_Street(), ecorePackage.getEString(), "street", null, 0, 1, DBTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBTree_Simple(), theXMLTypePackage.getString(), "simple", null, 0, 1, DBTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDBTree_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, DBTree.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// Version
		createVersionAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>Version</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createVersionAnnotations() {
		String source = "Version";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "value", "1.0"
		   });
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
		  (dbTreeEClass,
		   source,
		   new String[] {
			   "kind", "simple",
			   "name", "TREE",
			   "namespace", "emf.persistence"
		   });
		addAnnotation
		  (getDBTree_TreeId(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "TREEID",
			   "namespace", "emf.persistence"
		   });
		addAnnotation
		  (getDBTree_AlkNumber(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ALKNUMMER",
			   "namespace", "emf.persistence"
		   });
		addAnnotation
		  (getDBTree_Height(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "BAUMHOEHE",
			   "namespace", "emf.persistence"
		   });
		addAnnotation
		  (getDBTree_Number(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "BAUMNUMMER",
			   "namespace", "emf.persistence"
		   });
		addAnnotation
		  (getDBTree_DiameterTreeTop(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "KREISDURCHM",
			   "namespace", "emf.persistence"
		   });
		addAnnotation
		  (getDBTree_DiameterTreeTrunk(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "STDURCHM",
			   "namespace", "emf.persistence"
		   });
		addAnnotation
		  (getDBTree_ExtentTreeTrunk(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "STUMFANG",
			   "namespace", "emf.persistence"
		   });
		addAnnotation
		  (getDBTree_LastRegCheck(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "DATLR",
			   "namespace", "emf.persistence"
		   });
		addAnnotation
		  (getDBTree_LastRegCheckText(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ARGLR",
			   "namespace", "emf.persistence"
		   });
		addAnnotation
		  (getDBTree_LastRegCheckName(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "NAMELR",
			   "namespace", "emf.persistence"
		   });
		addAnnotation
		  (getDBTree_Genre(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "GATTUNG",
			   "namespace", "emf.persistence"
		   });
		addAnnotation
		  (getDBTree_GenreType(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "GATTUNGART",
			   "namespace", "emf.persistence"
		   });
		addAnnotation
		  (getDBTree_GenreDetail(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "GA_LANG",
			   "namespace", "emf.persistence"
		   });
		addAnnotation
		  (getDBTree_CutDate(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "GEFAELLTAM",
			   "namespace", "emf.persistence"
		   });
		addAnnotation
		  (getDBTree_Guid(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "GUID",
			   "namespace", "emf.persistence"
		   });
		addAnnotation
		  (getDBTree_GisId(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "GISID",
			   "namespace", "emf.persistence"
		   });
		addAnnotation
		  (getDBTree_PlantYear(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "PFLANZJAHR",
			   "namespace", "emf.persistence"
		   });
		addAnnotation
		  (getDBTree_Vitality(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "VITALITAET",
			   "namespace", "emf.persistence"
		   });
		addAnnotation
		  (getDBTree_Tour(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "TOUR",
			   "namespace", "emf.persistence"
		   });
		addAnnotation
		  (getDBTree_Department(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "PFLEGEBEREICH",
			   "namespace", "emf.persistence"
		   });
		addAnnotation
		  (getDBTree_UtmNorth(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "HOCHWERT",
			   "namespace", "emf.persistence"
		   });
		addAnnotation
		  (getDBTree_UtmEast(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "RECHTSWERT",
			   "namespace", "emf.persistence"
		   });
		addAnnotation
		  (getDBTree_Origin(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "HRHERKUNFT",
			   "namespace", "emf.persistence"
		   });
		addAnnotation
		  (getDBTree_ResponsibilityEnd(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "HISTORISCHAM",
			   "namespace", "emf.persistence"
		   });
		addAnnotation
		  (getDBTree_Area(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "GEBIET",
			   "namespace", "emf.persistence"
		   });
		addAnnotation
		  (getDBTree_Location(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "STANDORT",
			   "namespace", "emf.persistence"
		   });
		addAnnotation
		  (getDBTree_StreetShort(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "OBJKUERZEL",
			   "namespace", "emf.persistence"
		   });
		addAnnotation
		  (getDBTree_Street(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "STRASSE",
			   "namespace", "emf.persistence"
		   });
		addAnnotation
		  (getDBTree_Simple(),
		   source,
		   new String[] {
			   "kind", "simple"
		   });
		addAnnotation
		  (getDBTree_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (getDBTree_AlkNumber(),
		   source,
		   new String[] {
			   "documentation", "Nummer der Automatisierten Liegenschaftskarte"
		   });
		addAnnotation
		  (getDBTree_Height(),
		   source,
		   new String[] {
			   "documentation", "Register Hauptdaten: Baumh\u00f6he"
		   });
		addAnnotation
		  (getDBTree_Number(),
		   source,
		   new String[] {
			   "documentation", "Durchlaufende Baumnummer"
		   });
		addAnnotation
		  (getDBTree_DiameterTreeTop(),
		   source,
		   new String[] {
			   "documentation", "Register Hauptdaten: Durchmesser der Krone"
		   });
		addAnnotation
		  (getDBTree_DiameterTreeTrunk(),
		   source,
		   new String[] {
			   "documentation", "Register Stamm: Durchmesser des Stammes"
		   });
		addAnnotation
		  (getDBTree_ExtentTreeTrunk(),
		   source,
		   new String[] {
			   "documentation", "Register Stamm: Umfang des Stammes"
		   });
		addAnnotation
		  (getDBTree_LastRegCheck(),
		   source,
		   new String[] {
			   "documentation", "Letzte Regelkontrolle:Datum"
		   });
		addAnnotation
		  (getDBTree_LastRegCheckText(),
		   source,
		   new String[] {
			   "documentation", "Letzte Regelkontrolle:Bezeichnung"
		   });
		addAnnotation
		  (getDBTree_LastRegCheckName(),
		   source,
		   new String[] {
			   "documentation", "Letzte Regelkontrolle:Bearbeiter"
		   });
		addAnnotation
		  (getDBTree_Genre(),
		   source,
		   new String[] {
			   "documentation", "Gattung"
		   });
		addAnnotation
		  (getDBTree_GenreType(),
		   source,
		   new String[] {
			   "documentation", "Gattungsart"
		   });
		addAnnotation
		  (getDBTree_GenreDetail(),
		   source,
		   new String[] {
			   "documentation", "Gattung/Art: vollst\u00e4ndige Bezeichnung (lat.+deu.)"
		   });
		addAnnotation
		  (getDBTree_CutDate(),
		   source,
		   new String[] {
			   "documentation", "Wenn ein Baum gef\u00e4llt wurde,wird hier das Ausf\u00fchrungsdatumder Ma\u00dfnahme angezeigt"
		   });
		addAnnotation
		  (getDBTree_Guid(),
		   source,
		   new String[] {
			   "documentation", "Interne, eindeutige Datensatznummer"
		   });
		addAnnotation
		  (getDBTree_GisId(),
		   source,
		   new String[] {
			   "documentation", "GIS-ID f\u00fcr interaktive GIS-Kopplung"
		   });
		addAnnotation
		  (getDBTree_PlantYear(),
		   source,
		   new String[] {
			   "documentation", "Register Hauptdaten: Jahr der Pflanzung"
		   });
		addAnnotation
		  (getDBTree_Vitality(),
		   source,
		   new String[] {
			   "documentation", "Register Hauptdaten: Vitalit\u00e4t des Baumes"
		   });
		addAnnotation
		  (getDBTree_Tour(),
		   source,
		   new String[] {
			   "documentation", "k\u00f6nnen feste Touren f\u00fcr widerkehrende Aufgaben hinterlegt werden (gie\u00dfen, Kontrollen...)"
		   });
		addAnnotation
		  (getDBTree_Department(),
		   source,
		   new String[] {
			   "documentation", "r\u00e4umlich einen Pflegebereich (Stadtteil) zugeordnet"
		   });
		addAnnotation
		  (getDBTree_UtmNorth(),
		   source,
		   new String[] {
			   "documentation", "Y-Koordinate: Hochwert"
		   });
		addAnnotation
		  (getDBTree_UtmEast(),
		   source,
		   new String[] {
			   "documentation", "X-Koordinate: Rechtswert"
		   });
		addAnnotation
		  (getDBTree_Origin(),
		   source,
		   new String[] {
			   "documentation", "Herkunft Lagegenauigkeit"
		   });
		addAnnotation
		  (getDBTree_ResponsibilityEnd(),
		   source,
		   new String[] {
			   "documentation", "Datum eintragen an dem das Objekt (Baum) nicht mehr in unserer Pflegeverantwortung liegt"
		   });
		addAnnotation
		  (getDBTree_Area(),
		   source,
		   new String[] {
			   "documentation", "Objektart bzw. Gebiet"
		   });
		addAnnotation
		  (getDBTree_Location(),
		   source,
		   new String[] {
			   "documentation", "Standortbeschreibung zum Baum"
		   });
		addAnnotation
		  (getDBTree_StreetShort(),
		   source,
		   new String[] {
			   "documentation", "Feld STRASSE in Kurzform (8 Zeichen)"
		   });
		addAnnotation
		  (getDBTree_Street(),
		   source,
		   new String[] {
			   "documentation", "Objekt- bzw. Anlagenbezeichnung"
		   });
	}

} //DbtreePackageImpl
