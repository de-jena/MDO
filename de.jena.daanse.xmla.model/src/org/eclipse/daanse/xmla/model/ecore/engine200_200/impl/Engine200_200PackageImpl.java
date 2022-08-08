/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine200_200.impl;

import org.eclipse.daanse.xmla.model.ecore.engine.EnginePackage;

import org.eclipse.daanse.xmla.model.ecore.engine.impl.EnginePackageImpl;

import org.eclipse.daanse.xmla.model.ecore.engine100.Engine100Package;

import org.eclipse.daanse.xmla.model.ecore.engine100.impl.Engine100PackageImpl;

import org.eclipse.daanse.xmla.model.ecore.engine100_100.Engine100_100Package;

import org.eclipse.daanse.xmla.model.ecore.engine100_100.impl.Engine100_100PackageImpl;

import org.eclipse.daanse.xmla.model.ecore.engine2.Engine2Package;

import org.eclipse.daanse.xmla.model.ecore.engine2.impl.Engine2PackageImpl;

import org.eclipse.daanse.xmla.model.ecore.engine200.Engine200Package;

import org.eclipse.daanse.xmla.model.ecore.engine200.impl.Engine200PackageImpl;

import org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot;
import org.eclipse.daanse.xmla.model.ecore.engine200_200.Engine200_200Factory;
import org.eclipse.daanse.xmla.model.ecore.engine200_200.Engine200_200Package;
import org.eclipse.daanse.xmla.model.ecore.engine200_200.ExpressionBinding;
import org.eclipse.daanse.xmla.model.ecore.engine200_200.ProcessingRecommendationType;
import org.eclipse.daanse.xmla.model.ecore.engine200_200.ProcessingStateType;
import org.eclipse.daanse.xmla.model.ecore.engine200_200.RowNumberBinding;
import org.eclipse.daanse.xmla.model.ecore.engine200_200.ShareDimensionStorageType;
import org.eclipse.daanse.xmla.model.ecore.engine200_200.StorageEngineUsedType;

import org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package;

import org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl;

import org.eclipse.daanse.xmla.model.ecore.engine300_300.Engine300_300Package;

import org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.Engine300_300PackageImpl;

import org.eclipse.daanse.xmla.model.ecore.engine400.Engine400Package;

import org.eclipse.daanse.xmla.model.ecore.engine400.impl.Engine400PackageImpl;

import org.eclipse.daanse.xmla.model.ecore.engine600.Engine600Package;

import org.eclipse.daanse.xmla.model.ecore.engine600.impl.Engine600PackageImpl;

import org.eclipse.daanse.xmla.model.ecore.engine800.Engine800Package;

import org.eclipse.daanse.xmla.model.ecore.engine800.impl.Engine800PackageImpl;

import org.eclipse.daanse.xmla.model.ecore.ext.ExtPackage;

import org.eclipse.daanse.xmla.model.ecore.ext.impl.ExtPackageImpl;

import org.eclipse.daanse.xmla.model.ecore.msxmla.MsxmlaPackage;

import org.eclipse.daanse.xmla.model.ecore.msxmla.impl.MsxmlaPackageImpl;

import org.eclipse.daanse.xmla.model.ecore.schema.SchemaPackage;

import org.eclipse.daanse.xmla.model.ecore.schema.impl.SchemaPackageImpl;

import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl;

import org.eclipse.daanse.xmla.model.ecore.xmla_empty.Xmla_emptyPackage;

import org.eclipse.daanse.xmla.model.ecore.xmla_empty.impl.Xmla_emptyPackageImpl;

import org.eclipse.daanse.xmla.model.ecore.xmla_exception.Xmla_exceptionPackage;

import org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.Xmla_exceptionPackageImpl;

import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Xmla_mddatasetPackage;

import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.Xmla_mddatasetPackageImpl;

import org.eclipse.daanse.xmla.model.ecore.xmla_multipleresults.Xmla_multipleresultsPackage;

import org.eclipse.daanse.xmla.model.ecore.xmla_multipleresults.impl.Xmla_multipleresultsPackageImpl;

import org.eclipse.daanse.xmla.model.ecore.xmla_rowset.Xmla_rowsetPackage;

import org.eclipse.daanse.xmla.model.ecore.xmla_rowset.impl.Xmla_rowsetPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Engine200_200PackageImpl extends EPackageImpl implements Engine200_200Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rowNumberBindingEClass = null;

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
	private EEnum processingRecommendationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum processingStateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum shareDimensionStorageTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum storageEngineUsedTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType processingRecommendationTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType processingStateTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType shareDimensionStorageTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType storageEngineUsedTypeObjectEDataType = null;

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
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.Engine200_200Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Engine200_200PackageImpl() {
		super(eNS_URI, Engine200_200Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Engine200_200Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Engine200_200Package init() {
		if (isInited) return (Engine200_200Package)EPackage.Registry.INSTANCE.getEPackage(Engine200_200Package.eNS_URI);

		// Obtain or create and register package
		Object registeredEngine200_200Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Engine200_200PackageImpl theEngine200_200Package = registeredEngine200_200Package instanceof Engine200_200PackageImpl ? (Engine200_200PackageImpl)registeredEngine200_200Package : new Engine200_200PackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EnginePackage.eNS_URI);
		EnginePackageImpl theEnginePackage = (EnginePackageImpl)(registeredPackage instanceof EnginePackageImpl ? registeredPackage : EnginePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Engine100_100Package.eNS_URI);
		Engine100_100PackageImpl theEngine100_100Package = (Engine100_100PackageImpl)(registeredPackage instanceof Engine100_100PackageImpl ? registeredPackage : Engine100_100Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Engine100Package.eNS_URI);
		Engine100PackageImpl theEngine100Package = (Engine100PackageImpl)(registeredPackage instanceof Engine100PackageImpl ? registeredPackage : Engine100Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Engine2Package.eNS_URI);
		Engine2PackageImpl theEngine2Package = (Engine2PackageImpl)(registeredPackage instanceof Engine2PackageImpl ? registeredPackage : Engine2Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Engine200Package.eNS_URI);
		Engine200PackageImpl theEngine200Package = (Engine200PackageImpl)(registeredPackage instanceof Engine200PackageImpl ? registeredPackage : Engine200Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Engine300_300Package.eNS_URI);
		Engine300_300PackageImpl theEngine300_300Package = (Engine300_300PackageImpl)(registeredPackage instanceof Engine300_300PackageImpl ? registeredPackage : Engine300_300Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Engine300Package.eNS_URI);
		Engine300PackageImpl theEngine300Package = (Engine300PackageImpl)(registeredPackage instanceof Engine300PackageImpl ? registeredPackage : Engine300Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Engine400Package.eNS_URI);
		Engine400PackageImpl theEngine400Package = (Engine400PackageImpl)(registeredPackage instanceof Engine400PackageImpl ? registeredPackage : Engine400Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Engine600Package.eNS_URI);
		Engine600PackageImpl theEngine600Package = (Engine600PackageImpl)(registeredPackage instanceof Engine600PackageImpl ? registeredPackage : Engine600Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Engine800Package.eNS_URI);
		Engine800PackageImpl theEngine800Package = (Engine800PackageImpl)(registeredPackage instanceof Engine800PackageImpl ? registeredPackage : Engine800Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ExtPackage.eNS_URI);
		ExtPackageImpl theExtPackage = (ExtPackageImpl)(registeredPackage instanceof ExtPackageImpl ? registeredPackage : ExtPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MsxmlaPackage.eNS_URI);
		MsxmlaPackageImpl theMsxmlaPackage = (MsxmlaPackageImpl)(registeredPackage instanceof MsxmlaPackageImpl ? registeredPackage : MsxmlaPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SchemaPackage.eNS_URI);
		SchemaPackageImpl theSchemaPackage = (SchemaPackageImpl)(registeredPackage instanceof SchemaPackageImpl ? registeredPackage : SchemaPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Xmla_emptyPackage.eNS_URI);
		Xmla_emptyPackageImpl theXmla_emptyPackage = (Xmla_emptyPackageImpl)(registeredPackage instanceof Xmla_emptyPackageImpl ? registeredPackage : Xmla_emptyPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Xmla_exceptionPackage.eNS_URI);
		Xmla_exceptionPackageImpl theXmla_exceptionPackage = (Xmla_exceptionPackageImpl)(registeredPackage instanceof Xmla_exceptionPackageImpl ? registeredPackage : Xmla_exceptionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Xmla_mddatasetPackage.eNS_URI);
		Xmla_mddatasetPackageImpl theXmla_mddatasetPackage = (Xmla_mddatasetPackageImpl)(registeredPackage instanceof Xmla_mddatasetPackageImpl ? registeredPackage : Xmla_mddatasetPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Xmla_multipleresultsPackage.eNS_URI);
		Xmla_multipleresultsPackageImpl theXmla_multipleresultsPackage = (Xmla_multipleresultsPackageImpl)(registeredPackage instanceof Xmla_multipleresultsPackageImpl ? registeredPackage : Xmla_multipleresultsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Xmla_rowsetPackage.eNS_URI);
		Xmla_rowsetPackageImpl theXmla_rowsetPackage = (Xmla_rowsetPackageImpl)(registeredPackage instanceof Xmla_rowsetPackageImpl ? registeredPackage : Xmla_rowsetPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(XmlaPackage.eNS_URI);
		XmlaPackageImpl theXmlaPackage = (XmlaPackageImpl)(registeredPackage instanceof XmlaPackageImpl ? registeredPackage : XmlaPackage.eINSTANCE);

		// Create package meta-data objects
		theEngine200_200Package.createPackageContents();
		theEnginePackage.createPackageContents();
		theEngine100_100Package.createPackageContents();
		theEngine100Package.createPackageContents();
		theEngine2Package.createPackageContents();
		theEngine200Package.createPackageContents();
		theEngine300_300Package.createPackageContents();
		theEngine300Package.createPackageContents();
		theEngine400Package.createPackageContents();
		theEngine600Package.createPackageContents();
		theEngine800Package.createPackageContents();
		theExtPackage.createPackageContents();
		theMsxmlaPackage.createPackageContents();
		theSchemaPackage.createPackageContents();
		theXmla_emptyPackage.createPackageContents();
		theXmla_exceptionPackage.createPackageContents();
		theXmla_mddatasetPackage.createPackageContents();
		theXmla_multipleresultsPackage.createPackageContents();
		theXmla_rowsetPackage.createPackageContents();
		theXmlaPackage.createPackageContents();

		// Initialize created meta-data
		theEngine200_200Package.initializePackageContents();
		theEnginePackage.initializePackageContents();
		theEngine100_100Package.initializePackageContents();
		theEngine100Package.initializePackageContents();
		theEngine2Package.initializePackageContents();
		theEngine200Package.initializePackageContents();
		theEngine300_300Package.initializePackageContents();
		theEngine300Package.initializePackageContents();
		theEngine400Package.initializePackageContents();
		theEngine600Package.initializePackageContents();
		theEngine800Package.initializePackageContents();
		theExtPackage.initializePackageContents();
		theMsxmlaPackage.initializePackageContents();
		theSchemaPackage.initializePackageContents();
		theXmla_emptyPackage.initializePackageContents();
		theXmla_exceptionPackage.initializePackageContents();
		theXmla_mddatasetPackage.initializePackageContents();
		theXmla_multipleresultsPackage.initializePackageContents();
		theXmla_rowsetPackage.initializePackageContents();
		theXmlaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEngine200_200Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Engine200_200Package.eNS_URI, theEngine200_200Package);
		return theEngine200_200Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionBinding() {
		return expressionBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpressionBinding_Expression() {
		return (EAttribute)expressionBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRowNumberBinding() {
		return rowNumberBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ImagePath() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ImageUniqueID() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ImageUrl() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ImageVersion() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ProcessingRecommendation() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ProcessingState() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ShareDimensionStorage() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_StorageEngineUsed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Token() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcessingRecommendationType() {
		return processingRecommendationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcessingStateType() {
		return processingStateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getShareDimensionStorageType() {
		return shareDimensionStorageTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStorageEngineUsedType() {
		return storageEngineUsedTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getProcessingRecommendationTypeObject() {
		return processingRecommendationTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getProcessingStateTypeObject() {
		return processingStateTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getShareDimensionStorageTypeObject() {
		return shareDimensionStorageTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStorageEngineUsedTypeObject() {
		return storageEngineUsedTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Engine200_200Factory getEngine200_200Factory() {
		return (Engine200_200Factory)getEFactoryInstance();
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
		expressionBindingEClass = createEClass(EXPRESSION_BINDING);
		createEAttribute(expressionBindingEClass, EXPRESSION_BINDING__EXPRESSION);

		rowNumberBindingEClass = createEClass(ROW_NUMBER_BINDING);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__IMAGE_PATH);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__IMAGE_UNIQUE_ID);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__IMAGE_URL);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__IMAGE_VERSION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PROCESSING_RECOMMENDATION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PROCESSING_STATE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SHARE_DIMENSION_STORAGE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__STORAGE_ENGINE_USED);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TOKEN);

		// Create enums
		processingRecommendationTypeEEnum = createEEnum(PROCESSING_RECOMMENDATION_TYPE);
		processingStateTypeEEnum = createEEnum(PROCESSING_STATE_TYPE);
		shareDimensionStorageTypeEEnum = createEEnum(SHARE_DIMENSION_STORAGE_TYPE);
		storageEngineUsedTypeEEnum = createEEnum(STORAGE_ENGINE_USED_TYPE);

		// Create data types
		processingRecommendationTypeObjectEDataType = createEDataType(PROCESSING_RECOMMENDATION_TYPE_OBJECT);
		processingStateTypeObjectEDataType = createEDataType(PROCESSING_STATE_TYPE_OBJECT);
		shareDimensionStorageTypeObjectEDataType = createEDataType(SHARE_DIMENSION_STORAGE_TYPE_OBJECT);
		storageEngineUsedTypeObjectEDataType = createEDataType(STORAGE_ENGINE_USED_TYPE_OBJECT);
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
		XmlaPackage theXmlaPackage = (XmlaPackage)EPackage.Registry.INSTANCE.getEPackage(XmlaPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		expressionBindingEClass.getESuperTypes().add(theXmlaPackage.getBinding());
		rowNumberBindingEClass.getESuperTypes().add(theXmlaPackage.getBinding());

		// Initialize classes, features, and operations; add parameters
		initEClass(expressionBindingEClass, ExpressionBinding.class, "ExpressionBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpressionBinding_Expression(), theXMLTypePackage.getString(), "expression", null, 1, 1, ExpressionBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rowNumberBindingEClass, RowNumberBinding.class, "RowNumberBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ImagePath(), theXMLTypePackage.getString(), "imagePath", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ImageUniqueID(), theXMLTypePackage.getString(), "imageUniqueID", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ImageUrl(), theXMLTypePackage.getString(), "imageUrl", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ImageVersion(), theXMLTypePackage.getString(), "imageVersion", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ProcessingRecommendation(), this.getProcessingRecommendationType(), "processingRecommendation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ProcessingState(), this.getProcessingStateType(), "processingState", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ShareDimensionStorage(), this.getShareDimensionStorageType(), "shareDimensionStorage", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_StorageEngineUsed(), this.getStorageEngineUsedType(), "storageEngineUsed", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Token(), theXMLTypePackage.getString(), "token", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(processingRecommendationTypeEEnum, ProcessingRecommendationType.class, "ProcessingRecommendationType");
		addEEnumLiteral(processingRecommendationTypeEEnum, ProcessingRecommendationType.NONE);
		addEEnumLiteral(processingRecommendationTypeEEnum, ProcessingRecommendationType.STALE);

		initEEnum(processingStateTypeEEnum, ProcessingStateType.class, "ProcessingStateType");
		addEEnumLiteral(processingStateTypeEEnum, ProcessingStateType.PROCESSED);
		addEEnumLiteral(processingStateTypeEEnum, ProcessingStateType.UNPROCESSED);
		addEEnumLiteral(processingStateTypeEEnum, ProcessingStateType.INVALID_EXPRESSION);
		addEEnumLiteral(processingStateTypeEEnum, ProcessingStateType.CALCULATION_ERROR);
		addEEnumLiteral(processingStateTypeEEnum, ProcessingStateType.DEPENDENCY_ERROR);

		initEEnum(shareDimensionStorageTypeEEnum, ShareDimensionStorageType.class, "ShareDimensionStorageType");
		addEEnumLiteral(shareDimensionStorageTypeEEnum, ShareDimensionStorageType.DISTINCT);
		addEEnumLiteral(shareDimensionStorageTypeEEnum, ShareDimensionStorageType.SHARED);

		initEEnum(storageEngineUsedTypeEEnum, StorageEngineUsedType.class, "StorageEngineUsedType");
		addEEnumLiteral(storageEngineUsedTypeEEnum, StorageEngineUsedType.TRADITIONAL);
		addEEnumLiteral(storageEngineUsedTypeEEnum, StorageEngineUsedType.IN_MEMORY);
		addEEnumLiteral(storageEngineUsedTypeEEnum, StorageEngineUsedType.MIXED);
		addEEnumLiteral(storageEngineUsedTypeEEnum, StorageEngineUsedType.TABULAR_METADATA);

		// Initialize data types
		initEDataType(processingRecommendationTypeObjectEDataType, ProcessingRecommendationType.class, "ProcessingRecommendationTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(processingStateTypeObjectEDataType, ProcessingStateType.class, "ProcessingStateTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(shareDimensionStorageTypeObjectEDataType, ShareDimensionStorageType.class, "ShareDimensionStorageTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(storageEngineUsedTypeObjectEDataType, StorageEngineUsedType.class, "StorageEngineUsedTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// https://jakarta.ee/xml/ns/jaxb
		createJaxbAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>https://jakarta.ee/xml/ns/jaxb</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createJaxbAnnotations() {
		String source = "https://jakarta.ee/xml/ns/jaxb";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "version", "3.0"
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
		  (expressionBindingEClass,
		   source,
		   new String[] {
			   "name", "ExpressionBinding",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getExpressionBinding_Expression(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Expression"
		   });
		addAnnotation
		  (processingRecommendationTypeEEnum,
		   source,
		   new String[] {
			   "name", "ProcessingRecommendation_._type"
		   });
		addAnnotation
		  (processingRecommendationTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "ProcessingRecommendation_._type:Object",
			   "baseType", "ProcessingRecommendation_._type"
		   });
		addAnnotation
		  (processingStateTypeEEnum,
		   source,
		   new String[] {
			   "name", "ProcessingState_._type"
		   });
		addAnnotation
		  (processingStateTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "ProcessingState_._type:Object",
			   "baseType", "ProcessingState_._type"
		   });
		addAnnotation
		  (rowNumberBindingEClass,
		   source,
		   new String[] {
			   "name", "RowNumberBinding",
			   "kind", "empty"
		   });
		addAnnotation
		  (shareDimensionStorageTypeEEnum,
		   source,
		   new String[] {
			   "name", "ShareDimensionStorage_._type"
		   });
		addAnnotation
		  (shareDimensionStorageTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "ShareDimensionStorage_._type:Object",
			   "baseType", "ShareDimensionStorage_._type"
		   });
		addAnnotation
		  (storageEngineUsedTypeEEnum,
		   source,
		   new String[] {
			   "name", "StorageEngineUsed_._type"
		   });
		addAnnotation
		  (storageEngineUsedTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "StorageEngineUsed_._type:Object",
			   "baseType", "StorageEngineUsed_._type"
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
		  (getDocumentRoot_ImagePath(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ImagePath",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ImageUniqueID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ImageUniqueID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ImageUrl(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ImageUrl",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ImageVersion(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ImageVersion",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ProcessingRecommendation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ProcessingRecommendation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ProcessingState(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ProcessingState",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ShareDimensionStorage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ShareDimensionStorage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_StorageEngineUsed(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StorageEngineUsed",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Token(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Token",
			   "namespace", "##targetNamespace"
		   });
	}

} //Engine200_200PackageImpl
