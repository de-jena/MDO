/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine300_300.impl;

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

import org.eclipse.daanse.xmla.model.ecore.engine200_200.Engine200_200Package;

import org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.Engine200_200PackageImpl;

import org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package;

import org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl;

import org.eclipse.daanse.xmla.model.ecore.engine300_300.AnnotationsType;
import org.eclipse.daanse.xmla.model.ecore.engine300_300.AttributeType;
import org.eclipse.daanse.xmla.model.ecore.engine300_300.AttributesType;
import org.eclipse.daanse.xmla.model.ecore.engine300_300.DirectQueryModeType;
import org.eclipse.daanse.xmla.model.ecore.engine300_300.DirectQueryUsageType;
import org.eclipse.daanse.xmla.model.ecore.engine300_300.DocumentRoot;
import org.eclipse.daanse.xmla.model.ecore.engine300_300.Engine300_300Factory;
import org.eclipse.daanse.xmla.model.ecore.engine300_300.Engine300_300Package;
import org.eclipse.daanse.xmla.model.ecore.engine300_300.MultiplicityType;
import org.eclipse.daanse.xmla.model.ecore.engine300_300.Relationship;
import org.eclipse.daanse.xmla.model.ecore.engine300_300.RelationshipEnd;
import org.eclipse.daanse.xmla.model.ecore.engine300_300.RelationshipEndTranslation;
import org.eclipse.daanse.xmla.model.ecore.engine300_300.Relationships;
import org.eclipse.daanse.xmla.model.ecore.engine300_300.TranslationsType;
import org.eclipse.daanse.xmla.model.ecore.engine300_300.XEventType;

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
public class Engine300_300PackageImpl extends EPackageImpl implements Engine300_300Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeTypeEClass = null;

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
	private EClass relationshipEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipEndTranslationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass translationsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xEventTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directQueryModeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directQueryUsageTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum multiplicityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType directQueryModeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType directQueryUsageTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType multiplicityTypeObjectEDataType = null;

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
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.Engine300_300Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Engine300_300PackageImpl() {
		super(eNS_URI, Engine300_300Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Engine300_300Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Engine300_300Package init() {
		if (isInited) return (Engine300_300Package)EPackage.Registry.INSTANCE.getEPackage(Engine300_300Package.eNS_URI);

		// Obtain or create and register package
		Object registeredEngine300_300Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Engine300_300PackageImpl theEngine300_300Package = registeredEngine300_300Package instanceof Engine300_300PackageImpl ? (Engine300_300PackageImpl)registeredEngine300_300Package : new Engine300_300PackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Engine200_200Package.eNS_URI);
		Engine200_200PackageImpl theEngine200_200Package = (Engine200_200PackageImpl)(registeredPackage instanceof Engine200_200PackageImpl ? registeredPackage : Engine200_200Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Engine200Package.eNS_URI);
		Engine200PackageImpl theEngine200Package = (Engine200PackageImpl)(registeredPackage instanceof Engine200PackageImpl ? registeredPackage : Engine200Package.eINSTANCE);
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
		theEngine300_300Package.createPackageContents();
		theEnginePackage.createPackageContents();
		theEngine100_100Package.createPackageContents();
		theEngine100Package.createPackageContents();
		theEngine2Package.createPackageContents();
		theEngine200_200Package.createPackageContents();
		theEngine200Package.createPackageContents();
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
		theEngine300_300Package.initializePackageContents();
		theEnginePackage.initializePackageContents();
		theEngine100_100Package.initializePackageContents();
		theEngine100Package.initializePackageContents();
		theEngine2Package.initializePackageContents();
		theEngine200_200Package.initializePackageContents();
		theEngine200Package.initializePackageContents();
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
		theEngine300_300Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Engine300_300Package.eNS_URI, theEngine300_300Package);
		return theEngine300_300Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationsType() {
		return annotationsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationsType_Annotation() {
		return (EReference)annotationsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributesType() {
		return attributesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributesType_Attribute() {
		return (EReference)attributesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeType() {
		return attributeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeType_AttributeID() {
		return (EAttribute)attributeTypeEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getDocumentRoot_AllowedRowsExpression() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DirectQueryMode() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DirectQueryUsage() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XEvent() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
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
	public EAttribute getRelationship_ID() {
		return (EAttribute)relationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationship_Visible() {
		return (EAttribute)relationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_FromRelationshipEnd() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_ToRelationshipEnd() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationshipEnd() {
		return relationshipEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipEnd_Role() {
		return (EAttribute)relationshipEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipEnd_Multiplicity() {
		return (EAttribute)relationshipEndEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipEnd_DimensionID() {
		return (EAttribute)relationshipEndEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipEnd_Attributes() {
		return (EReference)relationshipEndEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipEnd_Translations() {
		return (EReference)relationshipEndEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipEnd_VisualizationProperties() {
		return (EReference)relationshipEndEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationshipEndTranslation() {
		return relationshipEndTranslationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipEndTranslation_Language() {
		return (EAttribute)relationshipEndTranslationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipEndTranslation_Caption() {
		return (EAttribute)relationshipEndTranslationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipEndTranslation_CollectionCaption() {
		return (EAttribute)relationshipEndTranslationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipEndTranslation_Description() {
		return (EAttribute)relationshipEndTranslationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipEndTranslation_DisplayFolder() {
		return (EAttribute)relationshipEndTranslationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipEndTranslation_Annotations() {
		return (EReference)relationshipEndTranslationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationships() {
		return relationshipsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationships_Relationship() {
		return (EReference)relationshipsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTranslationsType() {
		return translationsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTranslationsType_Translation() {
		return (EReference)translationsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXEventType() {
		return xEventTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXEventType_EventSession() {
		return (EReference)xEventTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDirectQueryModeType() {
		return directQueryModeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDirectQueryUsageType() {
		return directQueryUsageTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMultiplicityType() {
		return multiplicityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDirectQueryModeTypeObject() {
		return directQueryModeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDirectQueryUsageTypeObject() {
		return directQueryUsageTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMultiplicityTypeObject() {
		return multiplicityTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Engine300_300Factory getEngine300_300Factory() {
		return (Engine300_300Factory)getEFactoryInstance();
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
		annotationsTypeEClass = createEClass(ANNOTATIONS_TYPE);
		createEReference(annotationsTypeEClass, ANNOTATIONS_TYPE__ANNOTATION);

		attributesTypeEClass = createEClass(ATTRIBUTES_TYPE);
		createEReference(attributesTypeEClass, ATTRIBUTES_TYPE__ATTRIBUTE);

		attributeTypeEClass = createEClass(ATTRIBUTE_TYPE);
		createEAttribute(attributeTypeEClass, ATTRIBUTE_TYPE__ATTRIBUTE_ID);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ALLOWED_ROWS_EXPRESSION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DIRECT_QUERY_MODE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DIRECT_QUERY_USAGE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XEVENT);

		relationshipEClass = createEClass(RELATIONSHIP);
		createEAttribute(relationshipEClass, RELATIONSHIP__ID);
		createEAttribute(relationshipEClass, RELATIONSHIP__VISIBLE);
		createEReference(relationshipEClass, RELATIONSHIP__FROM_RELATIONSHIP_END);
		createEReference(relationshipEClass, RELATIONSHIP__TO_RELATIONSHIP_END);

		relationshipEndEClass = createEClass(RELATIONSHIP_END);
		createEAttribute(relationshipEndEClass, RELATIONSHIP_END__ROLE);
		createEAttribute(relationshipEndEClass, RELATIONSHIP_END__MULTIPLICITY);
		createEAttribute(relationshipEndEClass, RELATIONSHIP_END__DIMENSION_ID);
		createEReference(relationshipEndEClass, RELATIONSHIP_END__ATTRIBUTES);
		createEReference(relationshipEndEClass, RELATIONSHIP_END__TRANSLATIONS);
		createEReference(relationshipEndEClass, RELATIONSHIP_END__VISUALIZATION_PROPERTIES);

		relationshipEndTranslationEClass = createEClass(RELATIONSHIP_END_TRANSLATION);
		createEAttribute(relationshipEndTranslationEClass, RELATIONSHIP_END_TRANSLATION__LANGUAGE);
		createEAttribute(relationshipEndTranslationEClass, RELATIONSHIP_END_TRANSLATION__CAPTION);
		createEAttribute(relationshipEndTranslationEClass, RELATIONSHIP_END_TRANSLATION__COLLECTION_CAPTION);
		createEAttribute(relationshipEndTranslationEClass, RELATIONSHIP_END_TRANSLATION__DESCRIPTION);
		createEAttribute(relationshipEndTranslationEClass, RELATIONSHIP_END_TRANSLATION__DISPLAY_FOLDER);
		createEReference(relationshipEndTranslationEClass, RELATIONSHIP_END_TRANSLATION__ANNOTATIONS);

		relationshipsEClass = createEClass(RELATIONSHIPS);
		createEReference(relationshipsEClass, RELATIONSHIPS__RELATIONSHIP);

		translationsTypeEClass = createEClass(TRANSLATIONS_TYPE);
		createEReference(translationsTypeEClass, TRANSLATIONS_TYPE__TRANSLATION);

		xEventTypeEClass = createEClass(XEVENT_TYPE);
		createEReference(xEventTypeEClass, XEVENT_TYPE__EVENT_SESSION);

		// Create enums
		directQueryModeTypeEEnum = createEEnum(DIRECT_QUERY_MODE_TYPE);
		directQueryUsageTypeEEnum = createEEnum(DIRECT_QUERY_USAGE_TYPE);
		multiplicityTypeEEnum = createEEnum(MULTIPLICITY_TYPE);

		// Create data types
		directQueryModeTypeObjectEDataType = createEDataType(DIRECT_QUERY_MODE_TYPE_OBJECT);
		directQueryUsageTypeObjectEDataType = createEDataType(DIRECT_QUERY_USAGE_TYPE_OBJECT);
		multiplicityTypeObjectEDataType = createEDataType(MULTIPLICITY_TYPE_OBJECT);
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
		Engine300Package theEngine300Package = (Engine300Package)EPackage.Registry.INSTANCE.getEPackage(Engine300Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(annotationsTypeEClass, AnnotationsType.class, "AnnotationsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotationsType_Annotation(), theXmlaPackage.getAnnotation(), null, "annotation", null, 0, -1, AnnotationsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributesTypeEClass, AttributesType.class, "AttributesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributesType_Attribute(), this.getAttributeType(), null, "attribute", null, 0, -1, AttributesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeTypeEClass, AttributeType.class, "AttributeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeType_AttributeID(), theXMLTypePackage.getString(), "attributeID", null, 1, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_AllowedRowsExpression(), theXMLTypePackage.getString(), "allowedRowsExpression", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_DirectQueryMode(), this.getDirectQueryModeType(), "directQueryMode", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_DirectQueryUsage(), this.getDirectQueryUsageType(), "directQueryUsage", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XEvent(), this.getXEventType(), null, "xEvent", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(relationshipEClass, Relationship.class, "Relationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationship_ID(), theXMLTypePackage.getString(), "iD", null, 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationship_Visible(), theXMLTypePackage.getBoolean(), "visible", null, 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_FromRelationshipEnd(), this.getRelationshipEnd(), null, "fromRelationshipEnd", null, 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_ToRelationshipEnd(), this.getRelationshipEnd(), null, "toRelationshipEnd", null, 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipEndEClass, RelationshipEnd.class, "RelationshipEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationshipEnd_Role(), theXMLTypePackage.getString(), "role", null, 1, 1, RelationshipEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipEnd_Multiplicity(), this.getMultiplicityType(), "multiplicity", null, 1, 1, RelationshipEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipEnd_DimensionID(), theXMLTypePackage.getString(), "dimensionID", null, 1, 1, RelationshipEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipEnd_Attributes(), this.getAttributesType(), null, "attributes", null, 0, 1, RelationshipEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipEnd_Translations(), this.getTranslationsType(), null, "translations", null, 0, 1, RelationshipEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipEnd_VisualizationProperties(), theEngine300Package.getRelationshipEndVisualizationProperties(), null, "visualizationProperties", null, 0, 1, RelationshipEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipEndTranslationEClass, RelationshipEndTranslation.class, "RelationshipEndTranslation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationshipEndTranslation_Language(), theXMLTypePackage.getUnsignedInt(), "language", null, 1, 1, RelationshipEndTranslation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipEndTranslation_Caption(), theXMLTypePackage.getString(), "caption", null, 0, 1, RelationshipEndTranslation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipEndTranslation_CollectionCaption(), theXMLTypePackage.getString(), "collectionCaption", null, 1, 1, RelationshipEndTranslation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipEndTranslation_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, RelationshipEndTranslation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipEndTranslation_DisplayFolder(), theXMLTypePackage.getString(), "displayFolder", null, 0, 1, RelationshipEndTranslation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipEndTranslation_Annotations(), this.getAnnotationsType(), null, "annotations", null, 0, 1, RelationshipEndTranslation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipsEClass, Relationships.class, "Relationships", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationships_Relationship(), this.getRelationship(), null, "relationship", null, 0, -1, Relationships.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(translationsTypeEClass, TranslationsType.class, "TranslationsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTranslationsType_Translation(), this.getRelationshipEndTranslation(), null, "translation", null, 0, -1, TranslationsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xEventTypeEClass, XEventType.class, "XEventType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXEventType_EventSession(), theXmlaPackage.getEventSession(), null, "eventSession", null, 1, 1, XEventType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(directQueryModeTypeEEnum, DirectQueryModeType.class, "DirectQueryModeType");
		addEEnumLiteral(directQueryModeTypeEEnum, DirectQueryModeType.IN_MEMORY);
		addEEnumLiteral(directQueryModeTypeEEnum, DirectQueryModeType.DIRECT_QUERY_WITH_IN_MEMORY);
		addEEnumLiteral(directQueryModeTypeEEnum, DirectQueryModeType.IN_MEMORY_WITH_DIRECT_QUERY);
		addEEnumLiteral(directQueryModeTypeEEnum, DirectQueryModeType.DIRECT_QUERY);

		initEEnum(directQueryUsageTypeEEnum, DirectQueryUsageType.class, "DirectQueryUsageType");
		addEEnumLiteral(directQueryUsageTypeEEnum, DirectQueryUsageType.IN_MEMORY_WITH_DIRECT_QUERY);
		addEEnumLiteral(directQueryUsageTypeEEnum, DirectQueryUsageType.DIRECT_QUERY_ONLY);
		addEEnumLiteral(directQueryUsageTypeEEnum, DirectQueryUsageType.IN_MEMORY_ONLY);

		initEEnum(multiplicityTypeEEnum, MultiplicityType.class, "MultiplicityType");
		addEEnumLiteral(multiplicityTypeEEnum, MultiplicityType.ONE);
		addEEnumLiteral(multiplicityTypeEEnum, MultiplicityType.MANY);

		// Initialize data types
		initEDataType(directQueryModeTypeObjectEDataType, DirectQueryModeType.class, "DirectQueryModeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(directQueryUsageTypeObjectEDataType, DirectQueryUsageType.class, "DirectQueryUsageTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(multiplicityTypeObjectEDataType, MultiplicityType.class, "MultiplicityTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (annotationsTypeEClass,
		   source,
		   new String[] {
			   "name", "Annotations_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAnnotationsType_Annotation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Annotation"
		   });
		addAnnotation
		  (attributesTypeEClass,
		   source,
		   new String[] {
			   "name", "Attributes_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAttributesType_Attribute(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Attribute"
		   });
		addAnnotation
		  (attributeTypeEClass,
		   source,
		   new String[] {
			   "name", "Attribute_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAttributeType_AttributeID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AttributeID"
		   });
		addAnnotation
		  (directQueryModeTypeEEnum,
		   source,
		   new String[] {
			   "name", "DirectQueryMode_._type"
		   });
		addAnnotation
		  (directQueryModeTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "DirectQueryMode_._type:Object",
			   "baseType", "DirectQueryMode_._type"
		   });
		addAnnotation
		  (directQueryUsageTypeEEnum,
		   source,
		   new String[] {
			   "name", "DirectQueryUsage_._type"
		   });
		addAnnotation
		  (directQueryUsageTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "DirectQueryUsage_._type:Object",
			   "baseType", "DirectQueryUsage_._type"
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
		  (getDocumentRoot_AllowedRowsExpression(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AllowedRowsExpression",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_DirectQueryMode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DirectQueryMode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_DirectQueryUsage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DirectQueryUsage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_XEvent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "XEvent",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (multiplicityTypeEEnum,
		   source,
		   new String[] {
			   "name", "Multiplicity_._type"
		   });
		addAnnotation
		  (multiplicityTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "Multiplicity_._type:Object",
			   "baseType", "Multiplicity_._type"
		   });
		addAnnotation
		  (relationshipEClass,
		   source,
		   new String[] {
			   "name", "Relationship",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRelationship_ID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID"
		   });
		addAnnotation
		  (getRelationship_Visible(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Visible"
		   });
		addAnnotation
		  (getRelationship_FromRelationshipEnd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FromRelationshipEnd"
		   });
		addAnnotation
		  (getRelationship_ToRelationshipEnd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ToRelationshipEnd"
		   });
		addAnnotation
		  (relationshipEndEClass,
		   source,
		   new String[] {
			   "name", "RelationshipEnd",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRelationshipEnd_Role(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Role"
		   });
		addAnnotation
		  (getRelationshipEnd_Multiplicity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Multiplicity"
		   });
		addAnnotation
		  (getRelationshipEnd_DimensionID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DimensionID"
		   });
		addAnnotation
		  (getRelationshipEnd_Attributes(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Attributes"
		   });
		addAnnotation
		  (getRelationshipEnd_Translations(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Translations"
		   });
		addAnnotation
		  (getRelationshipEnd_VisualizationProperties(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "VisualizationProperties"
		   });
		addAnnotation
		  (relationshipEndTranslationEClass,
		   source,
		   new String[] {
			   "name", "RelationshipEndTranslation",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRelationshipEndTranslation_Language(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Language"
		   });
		addAnnotation
		  (getRelationshipEndTranslation_Caption(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Caption"
		   });
		addAnnotation
		  (getRelationshipEndTranslation_CollectionCaption(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CollectionCaption"
		   });
		addAnnotation
		  (getRelationshipEndTranslation_Description(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Description"
		   });
		addAnnotation
		  (getRelationshipEndTranslation_DisplayFolder(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DisplayFolder"
		   });
		addAnnotation
		  (getRelationshipEndTranslation_Annotations(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Annotations"
		   });
		addAnnotation
		  (relationshipsEClass,
		   source,
		   new String[] {
			   "name", "Relationships",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRelationships_Relationship(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Relationship"
		   });
		addAnnotation
		  (translationsTypeEClass,
		   source,
		   new String[] {
			   "name", "Translations_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTranslationsType_Translation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Translation"
		   });
		addAnnotation
		  (xEventTypeEClass,
		   source,
		   new String[] {
			   "name", "XEvent_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getXEventType_EventSession(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "event_session",
			   "namespace", "urn:schemas-microsoft-com:xml-analysis"
		   });
	}

} //Engine300_300PackageImpl
