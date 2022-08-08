/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine300.impl;

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

import org.eclipse.daanse.xmla.model.ecore.engine300.AlignmentType;
import org.eclipse.daanse.xmla.model.ecore.engine300.AlignmentType1;
import org.eclipse.daanse.xmla.model.ecore.engine300.AttributeHierarchyProcessingState;
import org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties;
import org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType;
import org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType1;
import org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType2;
import org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType3;
import org.eclipse.daanse.xmla.model.ecore.engine300.CurrentStringStoresCompatibilityLevelType;
import org.eclipse.daanse.xmla.model.ecore.engine300.DataEmbeddingStyleType;
import org.eclipse.daanse.xmla.model.ecore.engine300.DefaultAggregateFunctionType;
import org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties;
import org.eclipse.daanse.xmla.model.ecore.engine300.DocumentRoot;
import org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Factory;
import org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package;
import org.eclipse.daanse.xmla.model.ecore.engine300.HierarchyVisualizationProperties;
import org.eclipse.daanse.xmla.model.ecore.engine300.ProcessingStateType;
import org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties;
import org.eclipse.daanse.xmla.model.ecore.engine300.ServerModeType;
import org.eclipse.daanse.xmla.model.ecore.engine300.SortDirectionType;
import org.eclipse.daanse.xmla.model.ecore.engine300.SortDirectionType1;
import org.eclipse.daanse.xmla.model.ecore.engine300.StringStoresCompatibilityLevelType;
import org.eclipse.daanse.xmla.model.ecore.engine300.StructureTypeType;

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
public class Engine300PackageImpl extends EPackageImpl implements Engine300Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculationPropertiesVisualizationPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionAttributeVisualizationPropertiesEClass = null;

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
	private EClass hierarchyVisualizationPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipEndVisualizationPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum alignmentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum alignmentType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum attributeHierarchyProcessingStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contextualNameRuleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contextualNameRuleType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contextualNameRuleType2EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contextualNameRuleType3EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum currentStringStoresCompatibilityLevelTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataEmbeddingStyleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum defaultAggregateFunctionTypeEEnum = null;

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
	private EEnum serverModeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sortDirectionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sortDirectionType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stringStoresCompatibilityLevelTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum structureTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType alignmentTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType alignmentTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType attributeHierarchyProcessingStateObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType contextualNameRuleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType contextualNameRuleTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType contextualNameRuleTypeObject2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType contextualNameRuleTypeObject3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType currentStringStoresCompatibilityLevelTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dataEmbeddingStyleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType defaultAggregateFunctionTypeObjectEDataType = null;

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
	private EDataType serverModeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sortDirectionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sortDirectionTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringStoresCompatibilityLevelTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType structureTypeTypeObjectEDataType = null;

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
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Engine300PackageImpl() {
		super(eNS_URI, Engine300Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Engine300Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Engine300Package init() {
		if (isInited) return (Engine300Package)EPackage.Registry.INSTANCE.getEPackage(Engine300Package.eNS_URI);

		// Obtain or create and register package
		Object registeredEngine300Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Engine300PackageImpl theEngine300Package = registeredEngine300Package instanceof Engine300PackageImpl ? (Engine300PackageImpl)registeredEngine300Package : new Engine300PackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Engine300_300Package.eNS_URI);
		Engine300_300PackageImpl theEngine300_300Package = (Engine300_300PackageImpl)(registeredPackage instanceof Engine300_300PackageImpl ? registeredPackage : Engine300_300Package.eINSTANCE);
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
		theEngine300Package.createPackageContents();
		theEnginePackage.createPackageContents();
		theEngine100_100Package.createPackageContents();
		theEngine100Package.createPackageContents();
		theEngine2Package.createPackageContents();
		theEngine200_200Package.createPackageContents();
		theEngine200Package.createPackageContents();
		theEngine300_300Package.createPackageContents();
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
		theEngine300Package.initializePackageContents();
		theEnginePackage.initializePackageContents();
		theEngine100_100Package.initializePackageContents();
		theEngine100Package.initializePackageContents();
		theEngine2Package.initializePackageContents();
		theEngine200_200Package.initializePackageContents();
		theEngine200Package.initializePackageContents();
		theEngine300_300Package.initializePackageContents();
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
		theEngine300Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Engine300Package.eNS_URI, theEngine300Package);
		return theEngine300Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalculationPropertiesVisualizationProperties() {
		return calculationPropertiesVisualizationPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalculationPropertiesVisualizationProperties_FolderPosition() {
		return (EAttribute)calculationPropertiesVisualizationPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalculationPropertiesVisualizationProperties_ContextualNameRule() {
		return (EAttribute)calculationPropertiesVisualizationPropertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalculationPropertiesVisualizationProperties_Alignment() {
		return (EAttribute)calculationPropertiesVisualizationPropertiesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalculationPropertiesVisualizationProperties_IsFolderDefault() {
		return (EAttribute)calculationPropertiesVisualizationPropertiesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalculationPropertiesVisualizationProperties_IsRightToLeft() {
		return (EAttribute)calculationPropertiesVisualizationPropertiesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalculationPropertiesVisualizationProperties_SortDirection() {
		return (EAttribute)calculationPropertiesVisualizationPropertiesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalculationPropertiesVisualizationProperties_Units() {
		return (EAttribute)calculationPropertiesVisualizationPropertiesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalculationPropertiesVisualizationProperties_Width() {
		return (EAttribute)calculationPropertiesVisualizationPropertiesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalculationPropertiesVisualizationProperties_IsDefaultMeasure() {
		return (EAttribute)calculationPropertiesVisualizationPropertiesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalculationPropertiesVisualizationProperties_DefaultDetailsPosition() {
		return (EAttribute)calculationPropertiesVisualizationPropertiesEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalculationPropertiesVisualizationProperties_SortPropertiesPosition() {
		return (EAttribute)calculationPropertiesVisualizationPropertiesEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalculationPropertiesVisualizationProperties_IsSimpleMeasure() {
		return (EAttribute)calculationPropertiesVisualizationPropertiesEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimensionAttributeVisualizationProperties() {
		return dimensionAttributeVisualizationPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensionAttributeVisualizationProperties_FolderPosition() {
		return (EAttribute)dimensionAttributeVisualizationPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensionAttributeVisualizationProperties_ContextualNameRule() {
		return (EAttribute)dimensionAttributeVisualizationPropertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensionAttributeVisualizationProperties_Alignment() {
		return (EAttribute)dimensionAttributeVisualizationPropertiesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensionAttributeVisualizationProperties_IsFolderDefault() {
		return (EAttribute)dimensionAttributeVisualizationPropertiesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensionAttributeVisualizationProperties_IsRightToLeft() {
		return (EAttribute)dimensionAttributeVisualizationPropertiesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensionAttributeVisualizationProperties_SortDirection() {
		return (EAttribute)dimensionAttributeVisualizationPropertiesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensionAttributeVisualizationProperties_Units() {
		return (EAttribute)dimensionAttributeVisualizationPropertiesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensionAttributeVisualizationProperties_Width() {
		return (EAttribute)dimensionAttributeVisualizationPropertiesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensionAttributeVisualizationProperties_DefaultDetailsPosition() {
		return (EAttribute)dimensionAttributeVisualizationPropertiesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensionAttributeVisualizationProperties_CommonIdentifierPosition() {
		return (EAttribute)dimensionAttributeVisualizationPropertiesEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensionAttributeVisualizationProperties_SortPropertiesPosition() {
		return (EAttribute)dimensionAttributeVisualizationPropertiesEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensionAttributeVisualizationProperties_DisplayKeyPosition() {
		return (EAttribute)dimensionAttributeVisualizationPropertiesEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensionAttributeVisualizationProperties_IsDefaultImage() {
		return (EAttribute)dimensionAttributeVisualizationPropertiesEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensionAttributeVisualizationProperties_DefaultAggregateFunction() {
		return (EAttribute)dimensionAttributeVisualizationPropertiesEClass.getEStructuralFeatures().get(13);
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
	public EAttribute getDocumentRoot_CurrentStringStoresCompatibilityLevel() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DataEmbeddingStyle() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ProcessingState() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_QueryHints() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_QueryImpersonationInfo() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ServerMode() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_StringStoresCompatibilityLevel() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_StructureType() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHierarchyVisualizationProperties() {
		return hierarchyVisualizationPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHierarchyVisualizationProperties_ContextualNameRule() {
		return (EAttribute)hierarchyVisualizationPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHierarchyVisualizationProperties_FolderPosition() {
		return (EAttribute)hierarchyVisualizationPropertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationshipEndVisualizationProperties() {
		return relationshipEndVisualizationPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipEndVisualizationProperties_FolderPosition() {
		return (EAttribute)relationshipEndVisualizationPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipEndVisualizationProperties_ContextualNameRule() {
		return (EAttribute)relationshipEndVisualizationPropertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipEndVisualizationProperties_DefaultDetailsPosition() {
		return (EAttribute)relationshipEndVisualizationPropertiesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipEndVisualizationProperties_DisplayKeyPosition() {
		return (EAttribute)relationshipEndVisualizationPropertiesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipEndVisualizationProperties_CommonIdentifierPosition() {
		return (EAttribute)relationshipEndVisualizationPropertiesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipEndVisualizationProperties_IsDefaultMeasure() {
		return (EAttribute)relationshipEndVisualizationPropertiesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipEndVisualizationProperties_IsDefaultImage() {
		return (EAttribute)relationshipEndVisualizationPropertiesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipEndVisualizationProperties_SortPropertiesPosition() {
		return (EAttribute)relationshipEndVisualizationPropertiesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAlignmentType() {
		return alignmentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAlignmentType1() {
		return alignmentType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAttributeHierarchyProcessingState() {
		return attributeHierarchyProcessingStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContextualNameRuleType() {
		return contextualNameRuleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContextualNameRuleType1() {
		return contextualNameRuleType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContextualNameRuleType2() {
		return contextualNameRuleType2EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContextualNameRuleType3() {
		return contextualNameRuleType3EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCurrentStringStoresCompatibilityLevelType() {
		return currentStringStoresCompatibilityLevelTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataEmbeddingStyleType() {
		return dataEmbeddingStyleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDefaultAggregateFunctionType() {
		return defaultAggregateFunctionTypeEEnum;
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
	public EEnum getServerModeType() {
		return serverModeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSortDirectionType() {
		return sortDirectionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSortDirectionType1() {
		return sortDirectionType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStringStoresCompatibilityLevelType() {
		return stringStoresCompatibilityLevelTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStructureTypeType() {
		return structureTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAlignmentTypeObject() {
		return alignmentTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAlignmentTypeObject1() {
		return alignmentTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAttributeHierarchyProcessingStateObject() {
		return attributeHierarchyProcessingStateObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getContextualNameRuleTypeObject() {
		return contextualNameRuleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getContextualNameRuleTypeObject1() {
		return contextualNameRuleTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getContextualNameRuleTypeObject2() {
		return contextualNameRuleTypeObject2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getContextualNameRuleTypeObject3() {
		return contextualNameRuleTypeObject3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCurrentStringStoresCompatibilityLevelTypeObject() {
		return currentStringStoresCompatibilityLevelTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDataEmbeddingStyleTypeObject() {
		return dataEmbeddingStyleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDefaultAggregateFunctionTypeObject() {
		return defaultAggregateFunctionTypeObjectEDataType;
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
	public EDataType getServerModeTypeObject() {
		return serverModeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSortDirectionTypeObject() {
		return sortDirectionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSortDirectionTypeObject1() {
		return sortDirectionTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStringStoresCompatibilityLevelTypeObject() {
		return stringStoresCompatibilityLevelTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStructureTypeTypeObject() {
		return structureTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Engine300Factory getEngine300Factory() {
		return (Engine300Factory)getEFactoryInstance();
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
		calculationPropertiesVisualizationPropertiesEClass = createEClass(CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES);
		createEAttribute(calculationPropertiesVisualizationPropertiesEClass, CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__FOLDER_POSITION);
		createEAttribute(calculationPropertiesVisualizationPropertiesEClass, CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__CONTEXTUAL_NAME_RULE);
		createEAttribute(calculationPropertiesVisualizationPropertiesEClass, CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__ALIGNMENT);
		createEAttribute(calculationPropertiesVisualizationPropertiesEClass, CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__IS_FOLDER_DEFAULT);
		createEAttribute(calculationPropertiesVisualizationPropertiesEClass, CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__IS_RIGHT_TO_LEFT);
		createEAttribute(calculationPropertiesVisualizationPropertiesEClass, CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__SORT_DIRECTION);
		createEAttribute(calculationPropertiesVisualizationPropertiesEClass, CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__UNITS);
		createEAttribute(calculationPropertiesVisualizationPropertiesEClass, CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__WIDTH);
		createEAttribute(calculationPropertiesVisualizationPropertiesEClass, CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__IS_DEFAULT_MEASURE);
		createEAttribute(calculationPropertiesVisualizationPropertiesEClass, CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__DEFAULT_DETAILS_POSITION);
		createEAttribute(calculationPropertiesVisualizationPropertiesEClass, CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__SORT_PROPERTIES_POSITION);
		createEAttribute(calculationPropertiesVisualizationPropertiesEClass, CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__IS_SIMPLE_MEASURE);

		dimensionAttributeVisualizationPropertiesEClass = createEClass(DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES);
		createEAttribute(dimensionAttributeVisualizationPropertiesEClass, DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__FOLDER_POSITION);
		createEAttribute(dimensionAttributeVisualizationPropertiesEClass, DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__CONTEXTUAL_NAME_RULE);
		createEAttribute(dimensionAttributeVisualizationPropertiesEClass, DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__ALIGNMENT);
		createEAttribute(dimensionAttributeVisualizationPropertiesEClass, DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__IS_FOLDER_DEFAULT);
		createEAttribute(dimensionAttributeVisualizationPropertiesEClass, DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__IS_RIGHT_TO_LEFT);
		createEAttribute(dimensionAttributeVisualizationPropertiesEClass, DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__SORT_DIRECTION);
		createEAttribute(dimensionAttributeVisualizationPropertiesEClass, DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__UNITS);
		createEAttribute(dimensionAttributeVisualizationPropertiesEClass, DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__WIDTH);
		createEAttribute(dimensionAttributeVisualizationPropertiesEClass, DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__DEFAULT_DETAILS_POSITION);
		createEAttribute(dimensionAttributeVisualizationPropertiesEClass, DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__COMMON_IDENTIFIER_POSITION);
		createEAttribute(dimensionAttributeVisualizationPropertiesEClass, DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__SORT_PROPERTIES_POSITION);
		createEAttribute(dimensionAttributeVisualizationPropertiesEClass, DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__DISPLAY_KEY_POSITION);
		createEAttribute(dimensionAttributeVisualizationPropertiesEClass, DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__IS_DEFAULT_IMAGE);
		createEAttribute(dimensionAttributeVisualizationPropertiesEClass, DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__DEFAULT_AGGREGATE_FUNCTION);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CURRENT_STRING_STORES_COMPATIBILITY_LEVEL);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DATA_EMBEDDING_STYLE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PROCESSING_STATE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__QUERY_HINTS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__QUERY_IMPERSONATION_INFO);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SERVER_MODE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__STRING_STORES_COMPATIBILITY_LEVEL);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__STRUCTURE_TYPE);

		hierarchyVisualizationPropertiesEClass = createEClass(HIERARCHY_VISUALIZATION_PROPERTIES);
		createEAttribute(hierarchyVisualizationPropertiesEClass, HIERARCHY_VISUALIZATION_PROPERTIES__CONTEXTUAL_NAME_RULE);
		createEAttribute(hierarchyVisualizationPropertiesEClass, HIERARCHY_VISUALIZATION_PROPERTIES__FOLDER_POSITION);

		relationshipEndVisualizationPropertiesEClass = createEClass(RELATIONSHIP_END_VISUALIZATION_PROPERTIES);
		createEAttribute(relationshipEndVisualizationPropertiesEClass, RELATIONSHIP_END_VISUALIZATION_PROPERTIES__FOLDER_POSITION);
		createEAttribute(relationshipEndVisualizationPropertiesEClass, RELATIONSHIP_END_VISUALIZATION_PROPERTIES__CONTEXTUAL_NAME_RULE);
		createEAttribute(relationshipEndVisualizationPropertiesEClass, RELATIONSHIP_END_VISUALIZATION_PROPERTIES__DEFAULT_DETAILS_POSITION);
		createEAttribute(relationshipEndVisualizationPropertiesEClass, RELATIONSHIP_END_VISUALIZATION_PROPERTIES__DISPLAY_KEY_POSITION);
		createEAttribute(relationshipEndVisualizationPropertiesEClass, RELATIONSHIP_END_VISUALIZATION_PROPERTIES__COMMON_IDENTIFIER_POSITION);
		createEAttribute(relationshipEndVisualizationPropertiesEClass, RELATIONSHIP_END_VISUALIZATION_PROPERTIES__IS_DEFAULT_MEASURE);
		createEAttribute(relationshipEndVisualizationPropertiesEClass, RELATIONSHIP_END_VISUALIZATION_PROPERTIES__IS_DEFAULT_IMAGE);
		createEAttribute(relationshipEndVisualizationPropertiesEClass, RELATIONSHIP_END_VISUALIZATION_PROPERTIES__SORT_PROPERTIES_POSITION);

		// Create enums
		alignmentTypeEEnum = createEEnum(ALIGNMENT_TYPE);
		alignmentType1EEnum = createEEnum(ALIGNMENT_TYPE1);
		attributeHierarchyProcessingStateEEnum = createEEnum(ATTRIBUTE_HIERARCHY_PROCESSING_STATE);
		contextualNameRuleTypeEEnum = createEEnum(CONTEXTUAL_NAME_RULE_TYPE);
		contextualNameRuleType1EEnum = createEEnum(CONTEXTUAL_NAME_RULE_TYPE1);
		contextualNameRuleType2EEnum = createEEnum(CONTEXTUAL_NAME_RULE_TYPE2);
		contextualNameRuleType3EEnum = createEEnum(CONTEXTUAL_NAME_RULE_TYPE3);
		currentStringStoresCompatibilityLevelTypeEEnum = createEEnum(CURRENT_STRING_STORES_COMPATIBILITY_LEVEL_TYPE);
		dataEmbeddingStyleTypeEEnum = createEEnum(DATA_EMBEDDING_STYLE_TYPE);
		defaultAggregateFunctionTypeEEnum = createEEnum(DEFAULT_AGGREGATE_FUNCTION_TYPE);
		processingStateTypeEEnum = createEEnum(PROCESSING_STATE_TYPE);
		serverModeTypeEEnum = createEEnum(SERVER_MODE_TYPE);
		sortDirectionTypeEEnum = createEEnum(SORT_DIRECTION_TYPE);
		sortDirectionType1EEnum = createEEnum(SORT_DIRECTION_TYPE1);
		stringStoresCompatibilityLevelTypeEEnum = createEEnum(STRING_STORES_COMPATIBILITY_LEVEL_TYPE);
		structureTypeTypeEEnum = createEEnum(STRUCTURE_TYPE_TYPE);

		// Create data types
		alignmentTypeObjectEDataType = createEDataType(ALIGNMENT_TYPE_OBJECT);
		alignmentTypeObject1EDataType = createEDataType(ALIGNMENT_TYPE_OBJECT1);
		attributeHierarchyProcessingStateObjectEDataType = createEDataType(ATTRIBUTE_HIERARCHY_PROCESSING_STATE_OBJECT);
		contextualNameRuleTypeObjectEDataType = createEDataType(CONTEXTUAL_NAME_RULE_TYPE_OBJECT);
		contextualNameRuleTypeObject1EDataType = createEDataType(CONTEXTUAL_NAME_RULE_TYPE_OBJECT1);
		contextualNameRuleTypeObject2EDataType = createEDataType(CONTEXTUAL_NAME_RULE_TYPE_OBJECT2);
		contextualNameRuleTypeObject3EDataType = createEDataType(CONTEXTUAL_NAME_RULE_TYPE_OBJECT3);
		currentStringStoresCompatibilityLevelTypeObjectEDataType = createEDataType(CURRENT_STRING_STORES_COMPATIBILITY_LEVEL_TYPE_OBJECT);
		dataEmbeddingStyleTypeObjectEDataType = createEDataType(DATA_EMBEDDING_STYLE_TYPE_OBJECT);
		defaultAggregateFunctionTypeObjectEDataType = createEDataType(DEFAULT_AGGREGATE_FUNCTION_TYPE_OBJECT);
		processingStateTypeObjectEDataType = createEDataType(PROCESSING_STATE_TYPE_OBJECT);
		serverModeTypeObjectEDataType = createEDataType(SERVER_MODE_TYPE_OBJECT);
		sortDirectionTypeObjectEDataType = createEDataType(SORT_DIRECTION_TYPE_OBJECT);
		sortDirectionTypeObject1EDataType = createEDataType(SORT_DIRECTION_TYPE_OBJECT1);
		stringStoresCompatibilityLevelTypeObjectEDataType = createEDataType(STRING_STORES_COMPATIBILITY_LEVEL_TYPE_OBJECT);
		structureTypeTypeObjectEDataType = createEDataType(STRUCTURE_TYPE_TYPE_OBJECT);
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
		EnginePackage theEnginePackage = (EnginePackage)EPackage.Registry.INSTANCE.getEPackage(EnginePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(calculationPropertiesVisualizationPropertiesEClass, CalculationPropertiesVisualizationProperties.class, "CalculationPropertiesVisualizationProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCalculationPropertiesVisualizationProperties_FolderPosition(), theXMLTypePackage.getInteger(), "folderPosition", "-1", 0, 1, CalculationPropertiesVisualizationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalculationPropertiesVisualizationProperties_ContextualNameRule(), this.getContextualNameRuleType3(), "contextualNameRule", "None", 0, 1, CalculationPropertiesVisualizationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalculationPropertiesVisualizationProperties_Alignment(), this.getAlignmentType1(), "alignment", "Default", 0, 1, CalculationPropertiesVisualizationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalculationPropertiesVisualizationProperties_IsFolderDefault(), theXMLTypePackage.getBoolean(), "isFolderDefault", "false", 0, 1, CalculationPropertiesVisualizationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalculationPropertiesVisualizationProperties_IsRightToLeft(), theXMLTypePackage.getBoolean(), "isRightToLeft", "false", 0, 1, CalculationPropertiesVisualizationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalculationPropertiesVisualizationProperties_SortDirection(), this.getSortDirectionType1(), "sortDirection", "Default", 0, 1, CalculationPropertiesVisualizationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalculationPropertiesVisualizationProperties_Units(), theXMLTypePackage.getString(), "units", "", 0, 1, CalculationPropertiesVisualizationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalculationPropertiesVisualizationProperties_Width(), theXMLTypePackage.getInteger(), "width", "-1", 0, 1, CalculationPropertiesVisualizationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalculationPropertiesVisualizationProperties_IsDefaultMeasure(), theXMLTypePackage.getBoolean(), "isDefaultMeasure", "false", 0, 1, CalculationPropertiesVisualizationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalculationPropertiesVisualizationProperties_DefaultDetailsPosition(), theXMLTypePackage.getInteger(), "defaultDetailsPosition", "-1", 0, 1, CalculationPropertiesVisualizationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalculationPropertiesVisualizationProperties_SortPropertiesPosition(), theXMLTypePackage.getInteger(), "sortPropertiesPosition", "-1", 0, 1, CalculationPropertiesVisualizationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalculationPropertiesVisualizationProperties_IsSimpleMeasure(), theXMLTypePackage.getBoolean(), "isSimpleMeasure", "false", 0, 1, CalculationPropertiesVisualizationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dimensionAttributeVisualizationPropertiesEClass, DimensionAttributeVisualizationProperties.class, "DimensionAttributeVisualizationProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDimensionAttributeVisualizationProperties_FolderPosition(), theXMLTypePackage.getInteger(), "folderPosition", "-1", 0, 1, DimensionAttributeVisualizationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDimensionAttributeVisualizationProperties_ContextualNameRule(), this.getContextualNameRuleType1(), "contextualNameRule", "None", 0, 1, DimensionAttributeVisualizationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDimensionAttributeVisualizationProperties_Alignment(), this.getAlignmentType(), "alignment", "Default", 0, 1, DimensionAttributeVisualizationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDimensionAttributeVisualizationProperties_IsFolderDefault(), theXMLTypePackage.getBoolean(), "isFolderDefault", "false", 0, 1, DimensionAttributeVisualizationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDimensionAttributeVisualizationProperties_IsRightToLeft(), theXMLTypePackage.getBoolean(), "isRightToLeft", "false", 0, 1, DimensionAttributeVisualizationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDimensionAttributeVisualizationProperties_SortDirection(), this.getSortDirectionType(), "sortDirection", "Default", 0, 1, DimensionAttributeVisualizationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDimensionAttributeVisualizationProperties_Units(), theXMLTypePackage.getString(), "units", "", 0, 1, DimensionAttributeVisualizationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDimensionAttributeVisualizationProperties_Width(), theXMLTypePackage.getInteger(), "width", "-1", 0, 1, DimensionAttributeVisualizationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDimensionAttributeVisualizationProperties_DefaultDetailsPosition(), theXMLTypePackage.getInteger(), "defaultDetailsPosition", "-1", 0, 1, DimensionAttributeVisualizationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDimensionAttributeVisualizationProperties_CommonIdentifierPosition(), theXMLTypePackage.getInteger(), "commonIdentifierPosition", "-1", 0, 1, DimensionAttributeVisualizationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDimensionAttributeVisualizationProperties_SortPropertiesPosition(), theXMLTypePackage.getInteger(), "sortPropertiesPosition", "-1", 0, 1, DimensionAttributeVisualizationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDimensionAttributeVisualizationProperties_DisplayKeyPosition(), theXMLTypePackage.getInteger(), "displayKeyPosition", "-1", 0, 1, DimensionAttributeVisualizationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDimensionAttributeVisualizationProperties_IsDefaultImage(), theXMLTypePackage.getBoolean(), "isDefaultImage", "false", 0, 1, DimensionAttributeVisualizationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDimensionAttributeVisualizationProperties_DefaultAggregateFunction(), this.getDefaultAggregateFunctionType(), "defaultAggregateFunction", "Default", 0, 1, DimensionAttributeVisualizationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_CurrentStringStoresCompatibilityLevel(), this.getCurrentStringStoresCompatibilityLevelType(), "currentStringStoresCompatibilityLevel", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_DataEmbeddingStyle(), this.getDataEmbeddingStyleType(), "dataEmbeddingStyle", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ProcessingState(), this.getProcessingStateType(), "processingState", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_QueryHints(), theXMLTypePackage.getString(), "queryHints", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_QueryImpersonationInfo(), theEnginePackage.getImpersonationInfo(), null, "queryImpersonationInfo", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ServerMode(), this.getServerModeType(), "serverMode", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_StringStoresCompatibilityLevel(), this.getStringStoresCompatibilityLevelType(), "stringStoresCompatibilityLevel", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_StructureType(), this.getStructureTypeType(), "structureType", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(hierarchyVisualizationPropertiesEClass, HierarchyVisualizationProperties.class, "HierarchyVisualizationProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHierarchyVisualizationProperties_ContextualNameRule(), this.getContextualNameRuleType2(), "contextualNameRule", "None", 0, 1, HierarchyVisualizationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHierarchyVisualizationProperties_FolderPosition(), theXMLTypePackage.getInteger(), "folderPosition", "-1", 0, 1, HierarchyVisualizationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipEndVisualizationPropertiesEClass, RelationshipEndVisualizationProperties.class, "RelationshipEndVisualizationProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationshipEndVisualizationProperties_FolderPosition(), theXMLTypePackage.getInteger(), "folderPosition", "-1", 0, 1, RelationshipEndVisualizationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipEndVisualizationProperties_ContextualNameRule(), this.getContextualNameRuleType(), "contextualNameRule", "None", 0, 1, RelationshipEndVisualizationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipEndVisualizationProperties_DefaultDetailsPosition(), theXMLTypePackage.getInteger(), "defaultDetailsPosition", "-1", 0, 1, RelationshipEndVisualizationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipEndVisualizationProperties_DisplayKeyPosition(), theXMLTypePackage.getInteger(), "displayKeyPosition", "-1", 0, 1, RelationshipEndVisualizationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipEndVisualizationProperties_CommonIdentifierPosition(), theXMLTypePackage.getInteger(), "commonIdentifierPosition", "-1", 0, 1, RelationshipEndVisualizationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipEndVisualizationProperties_IsDefaultMeasure(), theXMLTypePackage.getBoolean(), "isDefaultMeasure", "false", 0, 1, RelationshipEndVisualizationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipEndVisualizationProperties_IsDefaultImage(), theXMLTypePackage.getBoolean(), "isDefaultImage", "false", 0, 1, RelationshipEndVisualizationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipEndVisualizationProperties_SortPropertiesPosition(), theXMLTypePackage.getInteger(), "sortPropertiesPosition", "-1", 0, 1, RelationshipEndVisualizationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(alignmentTypeEEnum, AlignmentType.class, "AlignmentType");
		addEEnumLiteral(alignmentTypeEEnum, AlignmentType.DEFAULT);
		addEEnumLiteral(alignmentTypeEEnum, AlignmentType.LEFT);
		addEEnumLiteral(alignmentTypeEEnum, AlignmentType.RIGHT);
		addEEnumLiteral(alignmentTypeEEnum, AlignmentType.CENTER);

		initEEnum(alignmentType1EEnum, AlignmentType1.class, "AlignmentType1");
		addEEnumLiteral(alignmentType1EEnum, AlignmentType1.DEFAULT);
		addEEnumLiteral(alignmentType1EEnum, AlignmentType1.LEFT);
		addEEnumLiteral(alignmentType1EEnum, AlignmentType1.RIGHT);
		addEEnumLiteral(alignmentType1EEnum, AlignmentType1.CENTER);

		initEEnum(attributeHierarchyProcessingStateEEnum, AttributeHierarchyProcessingState.class, "AttributeHierarchyProcessingState");
		addEEnumLiteral(attributeHierarchyProcessingStateEEnum, AttributeHierarchyProcessingState.PROCESSED);
		addEEnumLiteral(attributeHierarchyProcessingStateEEnum, AttributeHierarchyProcessingState.UNPROCESSED);
		addEEnumLiteral(attributeHierarchyProcessingStateEEnum, AttributeHierarchyProcessingState.DEPENDENCY_ERROR);

		initEEnum(contextualNameRuleTypeEEnum, ContextualNameRuleType.class, "ContextualNameRuleType");
		addEEnumLiteral(contextualNameRuleTypeEEnum, ContextualNameRuleType.NONE);
		addEEnumLiteral(contextualNameRuleTypeEEnum, ContextualNameRuleType.CONTEXT);
		addEEnumLiteral(contextualNameRuleTypeEEnum, ContextualNameRuleType.MERGE);

		initEEnum(contextualNameRuleType1EEnum, ContextualNameRuleType1.class, "ContextualNameRuleType1");
		addEEnumLiteral(contextualNameRuleType1EEnum, ContextualNameRuleType1.NONE);
		addEEnumLiteral(contextualNameRuleType1EEnum, ContextualNameRuleType1.CONTEXT);
		addEEnumLiteral(contextualNameRuleType1EEnum, ContextualNameRuleType1.MERGE);

		initEEnum(contextualNameRuleType2EEnum, ContextualNameRuleType2.class, "ContextualNameRuleType2");
		addEEnumLiteral(contextualNameRuleType2EEnum, ContextualNameRuleType2.NONE);
		addEEnumLiteral(contextualNameRuleType2EEnum, ContextualNameRuleType2.CONTEXT);
		addEEnumLiteral(contextualNameRuleType2EEnum, ContextualNameRuleType2.MERGE);

		initEEnum(contextualNameRuleType3EEnum, ContextualNameRuleType3.class, "ContextualNameRuleType3");
		addEEnumLiteral(contextualNameRuleType3EEnum, ContextualNameRuleType3.NONE);
		addEEnumLiteral(contextualNameRuleType3EEnum, ContextualNameRuleType3.CONTEXT);
		addEEnumLiteral(contextualNameRuleType3EEnum, ContextualNameRuleType3.MERGE);

		initEEnum(currentStringStoresCompatibilityLevelTypeEEnum, CurrentStringStoresCompatibilityLevelType.class, "CurrentStringStoresCompatibilityLevelType");
		addEEnumLiteral(currentStringStoresCompatibilityLevelTypeEEnum, CurrentStringStoresCompatibilityLevelType._1050);
		addEEnumLiteral(currentStringStoresCompatibilityLevelTypeEEnum, CurrentStringStoresCompatibilityLevelType._1100);

		initEEnum(dataEmbeddingStyleTypeEEnum, DataEmbeddingStyleType.class, "DataEmbeddingStyleType");
		addEEnumLiteral(dataEmbeddingStyleTypeEEnum, DataEmbeddingStyleType.EMBEDDED);
		addEEnumLiteral(dataEmbeddingStyleTypeEEnum, DataEmbeddingStyleType.NOT_EMBEDDED);

		initEEnum(defaultAggregateFunctionTypeEEnum, DefaultAggregateFunctionType.class, "DefaultAggregateFunctionType");
		addEEnumLiteral(defaultAggregateFunctionTypeEEnum, DefaultAggregateFunctionType.DEFAULT);
		addEEnumLiteral(defaultAggregateFunctionTypeEEnum, DefaultAggregateFunctionType.NONE);
		addEEnumLiteral(defaultAggregateFunctionTypeEEnum, DefaultAggregateFunctionType.SUM);
		addEEnumLiteral(defaultAggregateFunctionTypeEEnum, DefaultAggregateFunctionType.MIN);
		addEEnumLiteral(defaultAggregateFunctionTypeEEnum, DefaultAggregateFunctionType.MAX);
		addEEnumLiteral(defaultAggregateFunctionTypeEEnum, DefaultAggregateFunctionType.COUNT);
		addEEnumLiteral(defaultAggregateFunctionTypeEEnum, DefaultAggregateFunctionType.AVERAGE);

		initEEnum(processingStateTypeEEnum, ProcessingStateType.class, "ProcessingStateType");
		addEEnumLiteral(processingStateTypeEEnum, ProcessingStateType.PROCESSED);
		addEEnumLiteral(processingStateTypeEEnum, ProcessingStateType.UNPROCESSED);
		addEEnumLiteral(processingStateTypeEEnum, ProcessingStateType.INVALID_EXPRESSION);
		addEEnumLiteral(processingStateTypeEEnum, ProcessingStateType.DEPENDENCY_ERROR);
		addEEnumLiteral(processingStateTypeEEnum, ProcessingStateType.CALCULATION_ERROR);

		initEEnum(serverModeTypeEEnum, ServerModeType.class, "ServerModeType");
		addEEnumLiteral(serverModeTypeEEnum, ServerModeType.MULTIDIMENSIONAL);
		addEEnumLiteral(serverModeTypeEEnum, ServerModeType.TABULAR);
		addEEnumLiteral(serverModeTypeEEnum, ServerModeType.SHARE_POINT);

		initEEnum(sortDirectionTypeEEnum, SortDirectionType.class, "SortDirectionType");
		addEEnumLiteral(sortDirectionTypeEEnum, SortDirectionType.DEFAULT);
		addEEnumLiteral(sortDirectionTypeEEnum, SortDirectionType.ASCENDING);
		addEEnumLiteral(sortDirectionTypeEEnum, SortDirectionType.DESCENDING);

		initEEnum(sortDirectionType1EEnum, SortDirectionType1.class, "SortDirectionType1");
		addEEnumLiteral(sortDirectionType1EEnum, SortDirectionType1.DEFAULT);
		addEEnumLiteral(sortDirectionType1EEnum, SortDirectionType1.ASCENDING);
		addEEnumLiteral(sortDirectionType1EEnum, SortDirectionType1.DESCENDING);

		initEEnum(stringStoresCompatibilityLevelTypeEEnum, StringStoresCompatibilityLevelType.class, "StringStoresCompatibilityLevelType");
		addEEnumLiteral(stringStoresCompatibilityLevelTypeEEnum, StringStoresCompatibilityLevelType._1050);
		addEEnumLiteral(stringStoresCompatibilityLevelTypeEEnum, StringStoresCompatibilityLevelType._1100);

		initEEnum(structureTypeTypeEEnum, StructureTypeType.class, "StructureTypeType");
		addEEnumLiteral(structureTypeTypeEEnum, StructureTypeType.NATURAL);
		addEEnumLiteral(structureTypeTypeEEnum, StructureTypeType.UNNATURAL);
		addEEnumLiteral(structureTypeTypeEEnum, StructureTypeType.UNKNOWN);

		// Initialize data types
		initEDataType(alignmentTypeObjectEDataType, AlignmentType.class, "AlignmentTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(alignmentTypeObject1EDataType, AlignmentType1.class, "AlignmentTypeObject1", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(attributeHierarchyProcessingStateObjectEDataType, AttributeHierarchyProcessingState.class, "AttributeHierarchyProcessingStateObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(contextualNameRuleTypeObjectEDataType, ContextualNameRuleType.class, "ContextualNameRuleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(contextualNameRuleTypeObject1EDataType, ContextualNameRuleType1.class, "ContextualNameRuleTypeObject1", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(contextualNameRuleTypeObject2EDataType, ContextualNameRuleType2.class, "ContextualNameRuleTypeObject2", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(contextualNameRuleTypeObject3EDataType, ContextualNameRuleType3.class, "ContextualNameRuleTypeObject3", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(currentStringStoresCompatibilityLevelTypeObjectEDataType, CurrentStringStoresCompatibilityLevelType.class, "CurrentStringStoresCompatibilityLevelTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dataEmbeddingStyleTypeObjectEDataType, DataEmbeddingStyleType.class, "DataEmbeddingStyleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(defaultAggregateFunctionTypeObjectEDataType, DefaultAggregateFunctionType.class, "DefaultAggregateFunctionTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(processingStateTypeObjectEDataType, ProcessingStateType.class, "ProcessingStateTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(serverModeTypeObjectEDataType, ServerModeType.class, "ServerModeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(sortDirectionTypeObjectEDataType, SortDirectionType.class, "SortDirectionTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(sortDirectionTypeObject1EDataType, SortDirectionType1.class, "SortDirectionTypeObject1", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stringStoresCompatibilityLevelTypeObjectEDataType, StringStoresCompatibilityLevelType.class, "StringStoresCompatibilityLevelTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(structureTypeTypeObjectEDataType, StructureTypeType.class, "StructureTypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (alignmentTypeEEnum,
		   source,
		   new String[] {
			   "name", "Alignment_._type"
		   });
		addAnnotation
		  (alignmentType1EEnum,
		   source,
		   new String[] {
			   "name", "Alignment_._1_._type"
		   });
		addAnnotation
		  (alignmentTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "Alignment_._type:Object",
			   "baseType", "Alignment_._type"
		   });
		addAnnotation
		  (alignmentTypeObject1EDataType,
		   source,
		   new String[] {
			   "name", "Alignment_._1_._type:Object",
			   "baseType", "Alignment_._1_._type"
		   });
		addAnnotation
		  (attributeHierarchyProcessingStateEEnum,
		   source,
		   new String[] {
			   "name", "AttributeHierarchyProcessingState"
		   });
		addAnnotation
		  (attributeHierarchyProcessingStateObjectEDataType,
		   source,
		   new String[] {
			   "name", "AttributeHierarchyProcessingState:Object",
			   "baseType", "AttributeHierarchyProcessingState"
		   });
		addAnnotation
		  (calculationPropertiesVisualizationPropertiesEClass,
		   source,
		   new String[] {
			   "name", "CalculationPropertiesVisualizationProperties",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCalculationPropertiesVisualizationProperties_FolderPosition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FolderPosition"
		   });
		addAnnotation
		  (getCalculationPropertiesVisualizationProperties_ContextualNameRule(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ContextualNameRule"
		   });
		addAnnotation
		  (getCalculationPropertiesVisualizationProperties_Alignment(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Alignment"
		   });
		addAnnotation
		  (getCalculationPropertiesVisualizationProperties_IsFolderDefault(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "IsFolderDefault"
		   });
		addAnnotation
		  (getCalculationPropertiesVisualizationProperties_IsRightToLeft(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "IsRightToLeft"
		   });
		addAnnotation
		  (getCalculationPropertiesVisualizationProperties_SortDirection(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SortDirection"
		   });
		addAnnotation
		  (getCalculationPropertiesVisualizationProperties_Units(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Units"
		   });
		addAnnotation
		  (getCalculationPropertiesVisualizationProperties_Width(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Width"
		   });
		addAnnotation
		  (getCalculationPropertiesVisualizationProperties_IsDefaultMeasure(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "IsDefaultMeasure"
		   });
		addAnnotation
		  (getCalculationPropertiesVisualizationProperties_DefaultDetailsPosition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DefaultDetailsPosition"
		   });
		addAnnotation
		  (getCalculationPropertiesVisualizationProperties_SortPropertiesPosition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SortPropertiesPosition"
		   });
		addAnnotation
		  (getCalculationPropertiesVisualizationProperties_IsSimpleMeasure(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "IsSimpleMeasure"
		   });
		addAnnotation
		  (contextualNameRuleTypeEEnum,
		   source,
		   new String[] {
			   "name", "ContextualNameRule_._type"
		   });
		addAnnotation
		  (contextualNameRuleType1EEnum,
		   source,
		   new String[] {
			   "name", "ContextualNameRule_._1_._type"
		   });
		addAnnotation
		  (contextualNameRuleType2EEnum,
		   source,
		   new String[] {
			   "name", "ContextualNameRule_._2_._type"
		   });
		addAnnotation
		  (contextualNameRuleType3EEnum,
		   source,
		   new String[] {
			   "name", "ContextualNameRule_._3_._type"
		   });
		addAnnotation
		  (contextualNameRuleTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "ContextualNameRule_._type:Object",
			   "baseType", "ContextualNameRule_._type"
		   });
		addAnnotation
		  (contextualNameRuleTypeObject1EDataType,
		   source,
		   new String[] {
			   "name", "ContextualNameRule_._1_._type:Object",
			   "baseType", "ContextualNameRule_._1_._type"
		   });
		addAnnotation
		  (contextualNameRuleTypeObject2EDataType,
		   source,
		   new String[] {
			   "name", "ContextualNameRule_._2_._type:Object",
			   "baseType", "ContextualNameRule_._2_._type"
		   });
		addAnnotation
		  (contextualNameRuleTypeObject3EDataType,
		   source,
		   new String[] {
			   "name", "ContextualNameRule_._3_._type:Object",
			   "baseType", "ContextualNameRule_._3_._type"
		   });
		addAnnotation
		  (currentStringStoresCompatibilityLevelTypeEEnum,
		   source,
		   new String[] {
			   "name", "CurrentStringStoresCompatibilityLevel_._type"
		   });
		addAnnotation
		  (currentStringStoresCompatibilityLevelTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "CurrentStringStoresCompatibilityLevel_._type:Object",
			   "baseType", "CurrentStringStoresCompatibilityLevel_._type"
		   });
		addAnnotation
		  (dataEmbeddingStyleTypeEEnum,
		   source,
		   new String[] {
			   "name", "DataEmbeddingStyle_._type"
		   });
		addAnnotation
		  (dataEmbeddingStyleTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "DataEmbeddingStyle_._type:Object",
			   "baseType", "DataEmbeddingStyle_._type"
		   });
		addAnnotation
		  (defaultAggregateFunctionTypeEEnum,
		   source,
		   new String[] {
			   "name", "DefaultAggregateFunction_._type"
		   });
		addAnnotation
		  (defaultAggregateFunctionTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "DefaultAggregateFunction_._type:Object",
			   "baseType", "DefaultAggregateFunction_._type"
		   });
		addAnnotation
		  (dimensionAttributeVisualizationPropertiesEClass,
		   source,
		   new String[] {
			   "name", "DimensionAttributeVisualizationProperties",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDimensionAttributeVisualizationProperties_FolderPosition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FolderPosition"
		   });
		addAnnotation
		  (getDimensionAttributeVisualizationProperties_ContextualNameRule(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ContextualNameRule"
		   });
		addAnnotation
		  (getDimensionAttributeVisualizationProperties_Alignment(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Alignment"
		   });
		addAnnotation
		  (getDimensionAttributeVisualizationProperties_IsFolderDefault(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "IsFolderDefault"
		   });
		addAnnotation
		  (getDimensionAttributeVisualizationProperties_IsRightToLeft(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "IsRightToLeft"
		   });
		addAnnotation
		  (getDimensionAttributeVisualizationProperties_SortDirection(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SortDirection"
		   });
		addAnnotation
		  (getDimensionAttributeVisualizationProperties_Units(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Units"
		   });
		addAnnotation
		  (getDimensionAttributeVisualizationProperties_Width(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Width"
		   });
		addAnnotation
		  (getDimensionAttributeVisualizationProperties_DefaultDetailsPosition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DefaultDetailsPosition"
		   });
		addAnnotation
		  (getDimensionAttributeVisualizationProperties_CommonIdentifierPosition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CommonIdentifierPosition"
		   });
		addAnnotation
		  (getDimensionAttributeVisualizationProperties_SortPropertiesPosition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SortPropertiesPosition"
		   });
		addAnnotation
		  (getDimensionAttributeVisualizationProperties_DisplayKeyPosition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DisplayKeyPosition"
		   });
		addAnnotation
		  (getDimensionAttributeVisualizationProperties_IsDefaultImage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "IsDefaultImage"
		   });
		addAnnotation
		  (getDimensionAttributeVisualizationProperties_DefaultAggregateFunction(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DefaultAggregateFunction"
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
		  (getDocumentRoot_CurrentStringStoresCompatibilityLevel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CurrentStringStoresCompatibilityLevel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_DataEmbeddingStyle(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DataEmbeddingStyle",
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
		  (getDocumentRoot_QueryHints(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "QueryHints",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_QueryImpersonationInfo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "QueryImpersonationInfo",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ServerMode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ServerMode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_StringStoresCompatibilityLevel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StringStoresCompatibilityLevel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_StructureType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StructureType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (hierarchyVisualizationPropertiesEClass,
		   source,
		   new String[] {
			   "name", "HierarchyVisualizationProperties",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHierarchyVisualizationProperties_ContextualNameRule(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ContextualNameRule"
		   });
		addAnnotation
		  (getHierarchyVisualizationProperties_FolderPosition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FolderPosition"
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
		  (relationshipEndVisualizationPropertiesEClass,
		   source,
		   new String[] {
			   "name", "RelationshipEndVisualizationProperties",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRelationshipEndVisualizationProperties_FolderPosition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FolderPosition"
		   });
		addAnnotation
		  (getRelationshipEndVisualizationProperties_ContextualNameRule(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ContextualNameRule"
		   });
		addAnnotation
		  (getRelationshipEndVisualizationProperties_DefaultDetailsPosition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DefaultDetailsPosition"
		   });
		addAnnotation
		  (getRelationshipEndVisualizationProperties_DisplayKeyPosition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DisplayKeyPosition"
		   });
		addAnnotation
		  (getRelationshipEndVisualizationProperties_CommonIdentifierPosition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CommonIdentifierPosition"
		   });
		addAnnotation
		  (getRelationshipEndVisualizationProperties_IsDefaultMeasure(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "IsDefaultMeasure"
		   });
		addAnnotation
		  (getRelationshipEndVisualizationProperties_IsDefaultImage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "IsDefaultImage"
		   });
		addAnnotation
		  (getRelationshipEndVisualizationProperties_SortPropertiesPosition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SortPropertiesPosition"
		   });
		addAnnotation
		  (serverModeTypeEEnum,
		   source,
		   new String[] {
			   "name", "ServerMode_._type"
		   });
		addAnnotation
		  (serverModeTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "ServerMode_._type:Object",
			   "baseType", "ServerMode_._type"
		   });
		addAnnotation
		  (sortDirectionTypeEEnum,
		   source,
		   new String[] {
			   "name", "SortDirection_._type"
		   });
		addAnnotation
		  (sortDirectionType1EEnum,
		   source,
		   new String[] {
			   "name", "SortDirection_._1_._type"
		   });
		addAnnotation
		  (sortDirectionTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "SortDirection_._type:Object",
			   "baseType", "SortDirection_._type"
		   });
		addAnnotation
		  (sortDirectionTypeObject1EDataType,
		   source,
		   new String[] {
			   "name", "SortDirection_._1_._type:Object",
			   "baseType", "SortDirection_._1_._type"
		   });
		addAnnotation
		  (stringStoresCompatibilityLevelTypeEEnum,
		   source,
		   new String[] {
			   "name", "StringStoresCompatibilityLevel_._type"
		   });
		addAnnotation
		  (stringStoresCompatibilityLevelTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "StringStoresCompatibilityLevel_._type:Object",
			   "baseType", "StringStoresCompatibilityLevel_._type"
		   });
		addAnnotation
		  (structureTypeTypeEEnum,
		   source,
		   new String[] {
			   "name", "StructureType_._type"
		   });
		addAnnotation
		  (structureTypeTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "StructureType_._type:Object",
			   "baseType", "StructureType_._type"
		   });
	}

} //Engine300PackageImpl
