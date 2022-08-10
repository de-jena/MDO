/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

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

import org.eclipse.daanse.xmla.model.ecore.xmla.Annotation;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.AxisFormatType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Binding;
import org.eclipse.daanse.xmla.model.ecore.xmla.CatalogLocationType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ContentType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.DbpropConcatNullBehaviorType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdAutoExistsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdCompareCaseSensitiveStringFlagsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdMDXCompatibilityType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdSubqueriesType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DbpropNullCollationType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DbpropOutputParameterAvailableType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DbpropPersistentIdTypeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DbpropPrepareAbortBehaviorType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DbpropPrepareCommitBehaviorType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DbpropQuotedIdentifierCaseType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DialectType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DiscoverResponseType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DiscoverType;
import org.eclipse.daanse.xmla.model.ecore.xmla.EventSessionType;
import org.eclipse.daanse.xmla.model.ecore.xmla.FormatType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.MDXSupportType;
import org.eclipse.daanse.xmla.model.ecore.xmla.MdpropAggregateCellUpdateType;
import org.eclipse.daanse.xmla.model.ecore.xmla.MdpropFlatteningSupportType;
import org.eclipse.daanse.xmla.model.ecore.xmla.MdpropMdxNonMeasureExpressionsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.MdpropMdxRangeRowsetType;
import org.eclipse.daanse.xmla.model.ecore.xmla.MdpropMdxSlicerType;
import org.eclipse.daanse.xmla.model.ecore.xmla.MdxMissingMemberModeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.MdxMissingMemberModeType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.MemoryLockingModeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.PartitionModes;
import org.eclipse.daanse.xmla.model.ecore.xmla.Properties;
import org.eclipse.daanse.xmla.model.ecore.xmla.PropertiesType;
import org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList;
import org.eclipse.daanse.xmla.model.ecore.xmla.ProviderTypeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.RequestTypeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ResponseEncodingType;
import org.eclipse.daanse.xmla.model.ecore.xmla.RestrictionListType;
import org.eclipse.daanse.xmla.model.ecore.xmla.RestrictionsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.RetentionModes;
import org.eclipse.daanse.xmla.model.ecore.xmla.Return;
import org.eclipse.daanse.xmla.model.ecore.xmla.ReturnType;
import org.eclipse.daanse.xmla.model.ecore.xmla.SQLQueryModeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.SafetyOptionsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.SecuredCellValueType;
import org.eclipse.daanse.xmla.model.ecore.xmla.StateSupportType;
import org.eclipse.daanse.xmla.model.ecore.xmla.UpdateIsolationLevelType;
import org.eclipse.daanse.xmla.model.ecore.xmla.VisibilityType;
import org.eclipse.daanse.xmla.model.ecore.xmla.VisualModeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaFactory;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

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
public class XmlaPackageImpl extends EPackageImpl implements XmlaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discoverResponseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discoverTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restrictionListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restrictionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

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
	private EClass bindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventSessionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum requestTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum responseEncodingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stateSupportTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum formatType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contentType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum axisFormatTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mdxSupportTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum providerTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visualModeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum catalogLocationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dbpropConcatNullBehaviorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dbpropNullCollationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dbpropOutputParameterAvailableTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dbpropPersistentIdTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dbpropPrepareAbortBehaviorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dbpropPrepareCommitBehaviorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dbpropQuotedIdentifierCaseTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mdpropAggregateCellUpdateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mdpropFlatteningSupportTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mdpropMdxNonMeasureExpressionsTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mdpropMdxRangeRowsetTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mdpropMdxSlicerTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mdxMissingMemberModeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dbpropMsmdMDXCompatibilityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dbpropMsmdCompareCaseSensitiveStringFlagsTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum securedCellValueTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum safetyOptionsTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dialectTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sqlQueryModeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mdxMissingMemberModeType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dbpropMsmdSubqueriesTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dbpropMsmdAutoExistsTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum updateIsolationLevelTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum memoryLockingModeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visibilityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum retentionModesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum partitionModesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType requestTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType responseEncodingTypeObjectEDataType = null;

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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XmlaPackageImpl() {
		super(eNS_URI, XmlaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link XmlaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XmlaPackage init() {
		if (isInited) return (XmlaPackage)EPackage.Registry.INSTANCE.getEPackage(XmlaPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredXmlaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		XmlaPackageImpl theXmlaPackage = registeredXmlaPackage instanceof XmlaPackageImpl ? (XmlaPackageImpl)registeredXmlaPackage : new XmlaPackageImpl();

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

		// Create package meta-data objects
		theXmlaPackage.createPackageContents();
		theEnginePackage.createPackageContents();
		theEngine100_100Package.createPackageContents();
		theEngine100Package.createPackageContents();
		theEngine2Package.createPackageContents();
		theEngine200_200Package.createPackageContents();
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

		// Initialize created meta-data
		theXmlaPackage.initializePackageContents();
		theEnginePackage.initializePackageContents();
		theEngine100_100Package.initializePackageContents();
		theEngine100Package.initializePackageContents();
		theEngine2Package.initializePackageContents();
		theEngine200_200Package.initializePackageContents();
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

		// Mark meta-data to indicate it can't be changed
		theXmlaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XmlaPackage.eNS_URI, theXmlaPackage);
		return theXmlaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscoverResponseType() {
		return discoverResponseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscoverResponseType_Return() {
		return (EReference)discoverResponseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscoverType() {
		return discoverTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscoverType_RequestType() {
		return (EAttribute)discoverTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscoverType_Restrictions() {
		return (EReference)discoverTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscoverType_Properties() {
		return (EReference)discoverTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperties() {
		return propertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperties_PropertyList() {
		return (EReference)propertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertiesType() {
		return propertiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertiesType_PropertyList() {
		return (EReference)propertiesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyList() {
		return propertyListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DataSourceInfo() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_Timeout() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_UserName() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_Password() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_LocaleIdentifier() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_Catalog() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_StateSupport() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_Content() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_Format() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_AxisFormat() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_BeginRange() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_EndRange() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_MDXSupport() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_ProviderName() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_ProviderVersion() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DBMSVersion() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_ProviderType() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_ShowHiddenCubes() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_SQLSupport() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_TransactionDDL() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_MaximumRows() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_Roles() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_VisualMode() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_EffectiveRoles() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_EffectiveUserName() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_ServerName() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_CatalogLocation() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropCatalogTerm() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropCatalogUsage() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropColumnDefinition() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropConcatNullBehavior() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropDataSourceReadOnly() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropGroupBy() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropHeterogeneousTables() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropIdentifierCase() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropMaxIndexSize() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropMaxOpenChapters() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropMaxRowSize() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropMaxRowSizeIncludeBlob() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropMaxTablesInSelect() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropMultiTableUpdate() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropNullCollation() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropOrderByColumnsInSelect() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropOutputParameterAvailable() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropPersistentIdType() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropPrepareAbortBehavior() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropPrepareCommitBehavior() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropProcedureTerm() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropQuotedIdentifierCase() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropSchemaUsage() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropSqlSupport() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropSubqueries() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropSupportedTxnDdl() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_MdpropMdxSubqueries() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropSupportedTxnIsoLevels() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropSupportedTxnIsoRetain() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropTableTerm() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_MdpropAggregateCellUpdate() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_MdpropAxes() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_MdpropFlatteningSupport() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_MdpropMdxCaseSupport() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_MdpropMdxDescFlags() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_MdpropMdxDrillFunctions() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_MdpropMdxFormulas() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_MdpropMdxJoinCubes() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_MdpropMdxMemberFunctions() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_MdpropMdxNonMeasureExpressions() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_MdpropMdxNumericFunctions() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_MdpropMdxObjQualification() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_MdpropMdxOuterReference() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_MdpropMdxQueryByProperty() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_MdpropMdxRangeRowset() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_MdpropMdxSetFunctions() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_MdpropMdxSlicer() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_MdpropMdxStringCompop() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_MdpropNamedLevels() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropMsmdMDXCompatibility() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropMsmdSQLCompatibility() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropMsmdMDXUniqueNameStyle() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropMsmdCachePolicy() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropMsmdCacheRatio() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropMsmdCacheMode() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropMsmdCompareCaseSensitiveStringFlags() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropMsmdCompareCaseNotSensitiveStringFlags() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropMsmdFlattened2() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropInitMode() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_SspropInitAppName() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_SspropInitWsid() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_SspropInitPacketsize() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_ReadOnlySession() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_SecuredCellValue() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_NonEmptyThreshold() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_SafetyOptions() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropMsmdCacheRatio2() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropMsmdUseFormulaCache() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropMsmdDynamicDebugLimit() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropMsmdDebugMode() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_Dialect() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_ImpactAnalysis() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_SQLQueryMode() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_ClientProcessID() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_Cube() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_ReturnCellProperties() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_CommitTimeout() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_ForceCommitTimeout() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_ExecutionMode() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_RealTimeOlap() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_MdxMissingMemberMode() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_MdpropMdxNamedSets() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropMsmdSubqueries() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropMsmdAutoExists() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_CustomData() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DisablePrefetchFacts() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_UpdateIsolationLevel() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropMsmdErrorMessageMode() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_MdpropMdxDdlExtensions() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_ResponseEncoding() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_MemoryLockingMode() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropMsmdOptimizeResponse() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropMsmdActivityID() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropMsmdRequestID() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_ReturnAffectedObjects() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_DbpropMsmdRequestMemoryLimit() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyList_ApplicationContext() {
		return (EAttribute)propertyListEClass.getEStructuralFeatures().get(123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestrictionListType() {
		return restrictionListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRestrictionListType_Any() {
		return (EAttribute)restrictionListTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestrictionsType() {
		return restrictionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestrictionsType_RestrictionList() {
		return (EReference)restrictionsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturn() {
		return returnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReturn_Root() {
		return (EReference)returnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReturn_Root1() {
		return (EReference)returnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReturn_Root2() {
		return (EReference)returnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReturn_Results() {
		return (EReference)returnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnType() {
		return returnTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReturnType_Root() {
		return (EReference)returnTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotation() {
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotation_Name() {
		return (EAttribute)annotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotation_Visibility() {
		return (EAttribute)annotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotation_Value() {
		return (EReference)annotationEClass.getEStructuralFeatures().get(2);
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
	public EClass getBinding() {
		return bindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventSessionType() {
		return eventSessionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventSessionType_TemplateCategory() {
		return (EAttribute)eventSessionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventSessionType_TemplateName() {
		return (EAttribute)eventSessionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventSessionType_TemplateDescription() {
		return (EAttribute)eventSessionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventSessionType_Event() {
		return (EReference)eventSessionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventSessionType_Target() {
		return (EReference)eventSessionTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventSessionType_DispatchLatency() {
		return (EAttribute)eventSessionTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventSessionType_EventRetentionMode() {
		return (EAttribute)eventSessionTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventSessionType_MaxEventSize() {
		return (EAttribute)eventSessionTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventSessionType_MaxMemory() {
		return (EAttribute)eventSessionTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventSessionType_MemoryPartitionMode() {
		return (EAttribute)eventSessionTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventSessionType_Name() {
		return (EAttribute)eventSessionTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventSessionType_TrackCausality() {
		return (EAttribute)eventSessionTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRequestTypeType() {
		return requestTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResponseEncodingType() {
		return responseEncodingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStateSupportType() {
		return stateSupportTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFormatType1() {
		return formatType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContentType1() {
		return contentType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAxisFormatType() {
		return axisFormatTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMDXSupportType() {
		return mdxSupportTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProviderTypeType() {
		return providerTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisualModeType() {
		return visualModeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCatalogLocationType() {
		return catalogLocationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDbpropConcatNullBehaviorType() {
		return dbpropConcatNullBehaviorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDbpropNullCollationType() {
		return dbpropNullCollationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDbpropOutputParameterAvailableType() {
		return dbpropOutputParameterAvailableTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDbpropPersistentIdTypeType() {
		return dbpropPersistentIdTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDbpropPrepareAbortBehaviorType() {
		return dbpropPrepareAbortBehaviorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDbpropPrepareCommitBehaviorType() {
		return dbpropPrepareCommitBehaviorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDbpropQuotedIdentifierCaseType() {
		return dbpropQuotedIdentifierCaseTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMdpropAggregateCellUpdateType() {
		return mdpropAggregateCellUpdateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMdpropFlatteningSupportType() {
		return mdpropFlatteningSupportTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMdpropMdxNonMeasureExpressionsType() {
		return mdpropMdxNonMeasureExpressionsTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMdpropMdxRangeRowsetType() {
		return mdpropMdxRangeRowsetTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMdpropMdxSlicerType() {
		return mdpropMdxSlicerTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMdxMissingMemberModeType() {
		return mdxMissingMemberModeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDbpropMsmdMDXCompatibilityType() {
		return dbpropMsmdMDXCompatibilityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDbpropMsmdCompareCaseSensitiveStringFlagsType() {
		return dbpropMsmdCompareCaseSensitiveStringFlagsTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSecuredCellValueType() {
		return securedCellValueTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSafetyOptionsType() {
		return safetyOptionsTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDialectType() {
		return dialectTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSQLQueryModeType() {
		return sqlQueryModeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMdxMissingMemberModeType1() {
		return mdxMissingMemberModeType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDbpropMsmdSubqueriesType() {
		return dbpropMsmdSubqueriesTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDbpropMsmdAutoExistsType() {
		return dbpropMsmdAutoExistsTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUpdateIsolationLevelType() {
		return updateIsolationLevelTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMemoryLockingModeType() {
		return memoryLockingModeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisibilityType() {
		return visibilityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRetentionModes() {
		return retentionModesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPartitionModes() {
		return partitionModesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRequestTypeTypeObject() {
		return requestTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getResponseEncodingTypeObject() {
		return responseEncodingTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlaFactory getXmlaFactory() {
		return (XmlaFactory)getEFactoryInstance();
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
		discoverResponseTypeEClass = createEClass(DISCOVER_RESPONSE_TYPE);
		createEReference(discoverResponseTypeEClass, DISCOVER_RESPONSE_TYPE__RETURN);

		discoverTypeEClass = createEClass(DISCOVER_TYPE);
		createEAttribute(discoverTypeEClass, DISCOVER_TYPE__REQUEST_TYPE);
		createEReference(discoverTypeEClass, DISCOVER_TYPE__RESTRICTIONS);
		createEReference(discoverTypeEClass, DISCOVER_TYPE__PROPERTIES);

		propertiesEClass = createEClass(PROPERTIES);
		createEReference(propertiesEClass, PROPERTIES__PROPERTY_LIST);

		propertiesTypeEClass = createEClass(PROPERTIES_TYPE);
		createEReference(propertiesTypeEClass, PROPERTIES_TYPE__PROPERTY_LIST);

		propertyListEClass = createEClass(PROPERTY_LIST);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DATA_SOURCE_INFO);
		createEAttribute(propertyListEClass, PROPERTY_LIST__TIMEOUT);
		createEAttribute(propertyListEClass, PROPERTY_LIST__USER_NAME);
		createEAttribute(propertyListEClass, PROPERTY_LIST__PASSWORD);
		createEAttribute(propertyListEClass, PROPERTY_LIST__LOCALE_IDENTIFIER);
		createEAttribute(propertyListEClass, PROPERTY_LIST__CATALOG);
		createEAttribute(propertyListEClass, PROPERTY_LIST__STATE_SUPPORT);
		createEAttribute(propertyListEClass, PROPERTY_LIST__CONTENT);
		createEAttribute(propertyListEClass, PROPERTY_LIST__FORMAT);
		createEAttribute(propertyListEClass, PROPERTY_LIST__AXIS_FORMAT);
		createEAttribute(propertyListEClass, PROPERTY_LIST__BEGIN_RANGE);
		createEAttribute(propertyListEClass, PROPERTY_LIST__END_RANGE);
		createEAttribute(propertyListEClass, PROPERTY_LIST__MDX_SUPPORT);
		createEAttribute(propertyListEClass, PROPERTY_LIST__PROVIDER_NAME);
		createEAttribute(propertyListEClass, PROPERTY_LIST__PROVIDER_VERSION);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBMS_VERSION);
		createEAttribute(propertyListEClass, PROPERTY_LIST__PROVIDER_TYPE);
		createEAttribute(propertyListEClass, PROPERTY_LIST__SHOW_HIDDEN_CUBES);
		createEAttribute(propertyListEClass, PROPERTY_LIST__SQL_SUPPORT);
		createEAttribute(propertyListEClass, PROPERTY_LIST__TRANSACTION_DDL);
		createEAttribute(propertyListEClass, PROPERTY_LIST__MAXIMUM_ROWS);
		createEAttribute(propertyListEClass, PROPERTY_LIST__ROLES);
		createEAttribute(propertyListEClass, PROPERTY_LIST__VISUAL_MODE);
		createEAttribute(propertyListEClass, PROPERTY_LIST__EFFECTIVE_ROLES);
		createEAttribute(propertyListEClass, PROPERTY_LIST__EFFECTIVE_USER_NAME);
		createEAttribute(propertyListEClass, PROPERTY_LIST__SERVER_NAME);
		createEAttribute(propertyListEClass, PROPERTY_LIST__CATALOG_LOCATION);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_CATALOG_TERM);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_CATALOG_USAGE);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_COLUMN_DEFINITION);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_CONCAT_NULL_BEHAVIOR);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_DATA_SOURCE_READ_ONLY);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_GROUP_BY);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_HETEROGENEOUS_TABLES);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_IDENTIFIER_CASE);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_MAX_INDEX_SIZE);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_MAX_OPEN_CHAPTERS);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_MAX_ROW_SIZE);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_MAX_ROW_SIZE_INCLUDE_BLOB);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_MAX_TABLES_IN_SELECT);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_MULTI_TABLE_UPDATE);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_NULL_COLLATION);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_ORDER_BY_COLUMNS_IN_SELECT);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_OUTPUT_PARAMETER_AVAILABLE);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_PERSISTENT_ID_TYPE);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_PREPARE_ABORT_BEHAVIOR);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_PREPARE_COMMIT_BEHAVIOR);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_PROCEDURE_TERM);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_QUOTED_IDENTIFIER_CASE);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_SCHEMA_USAGE);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_SQL_SUPPORT);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_SUBQUERIES);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_SUPPORTED_TXN_DDL);
		createEAttribute(propertyListEClass, PROPERTY_LIST__MDPROP_MDX_SUBQUERIES);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_SUPPORTED_TXN_ISO_LEVELS);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_SUPPORTED_TXN_ISO_RETAIN);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_TABLE_TERM);
		createEAttribute(propertyListEClass, PROPERTY_LIST__MDPROP_AGGREGATE_CELL_UPDATE);
		createEAttribute(propertyListEClass, PROPERTY_LIST__MDPROP_AXES);
		createEAttribute(propertyListEClass, PROPERTY_LIST__MDPROP_FLATTENING_SUPPORT);
		createEAttribute(propertyListEClass, PROPERTY_LIST__MDPROP_MDX_CASE_SUPPORT);
		createEAttribute(propertyListEClass, PROPERTY_LIST__MDPROP_MDX_DESC_FLAGS);
		createEAttribute(propertyListEClass, PROPERTY_LIST__MDPROP_MDX_DRILL_FUNCTIONS);
		createEAttribute(propertyListEClass, PROPERTY_LIST__MDPROP_MDX_FORMULAS);
		createEAttribute(propertyListEClass, PROPERTY_LIST__MDPROP_MDX_JOIN_CUBES);
		createEAttribute(propertyListEClass, PROPERTY_LIST__MDPROP_MDX_MEMBER_FUNCTIONS);
		createEAttribute(propertyListEClass, PROPERTY_LIST__MDPROP_MDX_NON_MEASURE_EXPRESSIONS);
		createEAttribute(propertyListEClass, PROPERTY_LIST__MDPROP_MDX_NUMERIC_FUNCTIONS);
		createEAttribute(propertyListEClass, PROPERTY_LIST__MDPROP_MDX_OBJ_QUALIFICATION);
		createEAttribute(propertyListEClass, PROPERTY_LIST__MDPROP_MDX_OUTER_REFERENCE);
		createEAttribute(propertyListEClass, PROPERTY_LIST__MDPROP_MDX_QUERY_BY_PROPERTY);
		createEAttribute(propertyListEClass, PROPERTY_LIST__MDPROP_MDX_RANGE_ROWSET);
		createEAttribute(propertyListEClass, PROPERTY_LIST__MDPROP_MDX_SET_FUNCTIONS);
		createEAttribute(propertyListEClass, PROPERTY_LIST__MDPROP_MDX_SLICER);
		createEAttribute(propertyListEClass, PROPERTY_LIST__MDPROP_MDX_STRING_COMPOP);
		createEAttribute(propertyListEClass, PROPERTY_LIST__MDPROP_NAMED_LEVELS);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_MSMD_MDX_COMPATIBILITY);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_MSMD_SQL_COMPATIBILITY);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_MSMD_MDX_UNIQUE_NAME_STYLE);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_MSMD_CACHE_POLICY);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_MSMD_CACHE_RATIO);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_MSMD_CACHE_MODE);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_MSMD_COMPARE_CASE_SENSITIVE_STRING_FLAGS);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_MSMD_COMPARE_CASE_NOT_SENSITIVE_STRING_FLAGS);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_MSMD_FLATTENED2);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_INIT_MODE);
		createEAttribute(propertyListEClass, PROPERTY_LIST__SSPROP_INIT_APP_NAME);
		createEAttribute(propertyListEClass, PROPERTY_LIST__SSPROP_INIT_WSID);
		createEAttribute(propertyListEClass, PROPERTY_LIST__SSPROP_INIT_PACKETSIZE);
		createEAttribute(propertyListEClass, PROPERTY_LIST__READ_ONLY_SESSION);
		createEAttribute(propertyListEClass, PROPERTY_LIST__SECURED_CELL_VALUE);
		createEAttribute(propertyListEClass, PROPERTY_LIST__NON_EMPTY_THRESHOLD);
		createEAttribute(propertyListEClass, PROPERTY_LIST__SAFETY_OPTIONS);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_MSMD_CACHE_RATIO2);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_MSMD_USE_FORMULA_CACHE);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_MSMD_DYNAMIC_DEBUG_LIMIT);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_MSMD_DEBUG_MODE);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DIALECT);
		createEAttribute(propertyListEClass, PROPERTY_LIST__IMPACT_ANALYSIS);
		createEAttribute(propertyListEClass, PROPERTY_LIST__SQL_QUERY_MODE);
		createEAttribute(propertyListEClass, PROPERTY_LIST__CLIENT_PROCESS_ID);
		createEAttribute(propertyListEClass, PROPERTY_LIST__CUBE);
		createEAttribute(propertyListEClass, PROPERTY_LIST__RETURN_CELL_PROPERTIES);
		createEAttribute(propertyListEClass, PROPERTY_LIST__COMMIT_TIMEOUT);
		createEAttribute(propertyListEClass, PROPERTY_LIST__FORCE_COMMIT_TIMEOUT);
		createEAttribute(propertyListEClass, PROPERTY_LIST__EXECUTION_MODE);
		createEAttribute(propertyListEClass, PROPERTY_LIST__REAL_TIME_OLAP);
		createEAttribute(propertyListEClass, PROPERTY_LIST__MDX_MISSING_MEMBER_MODE);
		createEAttribute(propertyListEClass, PROPERTY_LIST__MDPROP_MDX_NAMED_SETS);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_MSMD_SUBQUERIES);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_MSMD_AUTO_EXISTS);
		createEAttribute(propertyListEClass, PROPERTY_LIST__CUSTOM_DATA);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DISABLE_PREFETCH_FACTS);
		createEAttribute(propertyListEClass, PROPERTY_LIST__UPDATE_ISOLATION_LEVEL);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_MSMD_ERROR_MESSAGE_MODE);
		createEAttribute(propertyListEClass, PROPERTY_LIST__MDPROP_MDX_DDL_EXTENSIONS);
		createEAttribute(propertyListEClass, PROPERTY_LIST__RESPONSE_ENCODING);
		createEAttribute(propertyListEClass, PROPERTY_LIST__MEMORY_LOCKING_MODE);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_MSMD_OPTIMIZE_RESPONSE);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_MSMD_ACTIVITY_ID);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_MSMD_REQUEST_ID);
		createEAttribute(propertyListEClass, PROPERTY_LIST__RETURN_AFFECTED_OBJECTS);
		createEAttribute(propertyListEClass, PROPERTY_LIST__DBPROP_MSMD_REQUEST_MEMORY_LIMIT);
		createEAttribute(propertyListEClass, PROPERTY_LIST__APPLICATION_CONTEXT);

		restrictionListTypeEClass = createEClass(RESTRICTION_LIST_TYPE);
		createEAttribute(restrictionListTypeEClass, RESTRICTION_LIST_TYPE__ANY);

		restrictionsTypeEClass = createEClass(RESTRICTIONS_TYPE);
		createEReference(restrictionsTypeEClass, RESTRICTIONS_TYPE__RESTRICTION_LIST);

		returnEClass = createEClass(RETURN);
		createEReference(returnEClass, RETURN__ROOT);
		createEReference(returnEClass, RETURN__ROOT1);
		createEReference(returnEClass, RETURN__ROOT2);
		createEReference(returnEClass, RETURN__RESULTS);

		returnTypeEClass = createEClass(RETURN_TYPE);
		createEReference(returnTypeEClass, RETURN_TYPE__ROOT);

		annotationEClass = createEClass(ANNOTATION);
		createEAttribute(annotationEClass, ANNOTATION__NAME);
		createEAttribute(annotationEClass, ANNOTATION__VISIBILITY);
		createEReference(annotationEClass, ANNOTATION__VALUE);

		annotationsTypeEClass = createEClass(ANNOTATIONS_TYPE);
		createEReference(annotationsTypeEClass, ANNOTATIONS_TYPE__ANNOTATION);

		bindingEClass = createEClass(BINDING);

		eventSessionTypeEClass = createEClass(EVENT_SESSION_TYPE);
		createEAttribute(eventSessionTypeEClass, EVENT_SESSION_TYPE__TEMPLATE_CATEGORY);
		createEAttribute(eventSessionTypeEClass, EVENT_SESSION_TYPE__TEMPLATE_NAME);
		createEAttribute(eventSessionTypeEClass, EVENT_SESSION_TYPE__TEMPLATE_DESCRIPTION);
		createEReference(eventSessionTypeEClass, EVENT_SESSION_TYPE__EVENT);
		createEReference(eventSessionTypeEClass, EVENT_SESSION_TYPE__TARGET);
		createEAttribute(eventSessionTypeEClass, EVENT_SESSION_TYPE__DISPATCH_LATENCY);
		createEAttribute(eventSessionTypeEClass, EVENT_SESSION_TYPE__EVENT_RETENTION_MODE);
		createEAttribute(eventSessionTypeEClass, EVENT_SESSION_TYPE__MAX_EVENT_SIZE);
		createEAttribute(eventSessionTypeEClass, EVENT_SESSION_TYPE__MAX_MEMORY);
		createEAttribute(eventSessionTypeEClass, EVENT_SESSION_TYPE__MEMORY_PARTITION_MODE);
		createEAttribute(eventSessionTypeEClass, EVENT_SESSION_TYPE__NAME);
		createEAttribute(eventSessionTypeEClass, EVENT_SESSION_TYPE__TRACK_CAUSALITY);

		// Create enums
		requestTypeTypeEEnum = createEEnum(REQUEST_TYPE_TYPE);
		responseEncodingTypeEEnum = createEEnum(RESPONSE_ENCODING_TYPE);
		stateSupportTypeEEnum = createEEnum(STATE_SUPPORT_TYPE);
		formatType1EEnum = createEEnum(FORMAT_TYPE1);
		contentType1EEnum = createEEnum(CONTENT_TYPE1);
		axisFormatTypeEEnum = createEEnum(AXIS_FORMAT_TYPE);
		mdxSupportTypeEEnum = createEEnum(MDX_SUPPORT_TYPE);
		providerTypeTypeEEnum = createEEnum(PROVIDER_TYPE_TYPE);
		visualModeTypeEEnum = createEEnum(VISUAL_MODE_TYPE);
		catalogLocationTypeEEnum = createEEnum(CATALOG_LOCATION_TYPE);
		dbpropConcatNullBehaviorTypeEEnum = createEEnum(DBPROP_CONCAT_NULL_BEHAVIOR_TYPE);
		dbpropNullCollationTypeEEnum = createEEnum(DBPROP_NULL_COLLATION_TYPE);
		dbpropOutputParameterAvailableTypeEEnum = createEEnum(DBPROP_OUTPUT_PARAMETER_AVAILABLE_TYPE);
		dbpropPersistentIdTypeTypeEEnum = createEEnum(DBPROP_PERSISTENT_ID_TYPE_TYPE);
		dbpropPrepareAbortBehaviorTypeEEnum = createEEnum(DBPROP_PREPARE_ABORT_BEHAVIOR_TYPE);
		dbpropPrepareCommitBehaviorTypeEEnum = createEEnum(DBPROP_PREPARE_COMMIT_BEHAVIOR_TYPE);
		dbpropQuotedIdentifierCaseTypeEEnum = createEEnum(DBPROP_QUOTED_IDENTIFIER_CASE_TYPE);
		mdpropAggregateCellUpdateTypeEEnum = createEEnum(MDPROP_AGGREGATE_CELL_UPDATE_TYPE);
		mdpropFlatteningSupportTypeEEnum = createEEnum(MDPROP_FLATTENING_SUPPORT_TYPE);
		mdpropMdxNonMeasureExpressionsTypeEEnum = createEEnum(MDPROP_MDX_NON_MEASURE_EXPRESSIONS_TYPE);
		mdpropMdxRangeRowsetTypeEEnum = createEEnum(MDPROP_MDX_RANGE_ROWSET_TYPE);
		mdpropMdxSlicerTypeEEnum = createEEnum(MDPROP_MDX_SLICER_TYPE);
		mdxMissingMemberModeTypeEEnum = createEEnum(MDX_MISSING_MEMBER_MODE_TYPE);
		dbpropMsmdMDXCompatibilityTypeEEnum = createEEnum(DBPROP_MSMD_MDX_COMPATIBILITY_TYPE);
		dbpropMsmdCompareCaseSensitiveStringFlagsTypeEEnum = createEEnum(DBPROP_MSMD_COMPARE_CASE_SENSITIVE_STRING_FLAGS_TYPE);
		securedCellValueTypeEEnum = createEEnum(SECURED_CELL_VALUE_TYPE);
		safetyOptionsTypeEEnum = createEEnum(SAFETY_OPTIONS_TYPE);
		dialectTypeEEnum = createEEnum(DIALECT_TYPE);
		sqlQueryModeTypeEEnum = createEEnum(SQL_QUERY_MODE_TYPE);
		mdxMissingMemberModeType1EEnum = createEEnum(MDX_MISSING_MEMBER_MODE_TYPE1);
		dbpropMsmdSubqueriesTypeEEnum = createEEnum(DBPROP_MSMD_SUBQUERIES_TYPE);
		dbpropMsmdAutoExistsTypeEEnum = createEEnum(DBPROP_MSMD_AUTO_EXISTS_TYPE);
		updateIsolationLevelTypeEEnum = createEEnum(UPDATE_ISOLATION_LEVEL_TYPE);
		memoryLockingModeTypeEEnum = createEEnum(MEMORY_LOCKING_MODE_TYPE);
		visibilityTypeEEnum = createEEnum(VISIBILITY_TYPE);
		retentionModesEEnum = createEEnum(RETENTION_MODES);
		partitionModesEEnum = createEEnum(PARTITION_MODES);

		// Create data types
		requestTypeTypeObjectEDataType = createEDataType(REQUEST_TYPE_TYPE_OBJECT);
		responseEncodingTypeObjectEDataType = createEDataType(RESPONSE_ENCODING_TYPE_OBJECT);
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
		Xmla_mddatasetPackage theXmla_mddatasetPackage = (Xmla_mddatasetPackage)EPackage.Registry.INSTANCE.getEPackage(Xmla_mddatasetPackage.eNS_URI);
		Xmla_rowsetPackage theXmla_rowsetPackage = (Xmla_rowsetPackage)EPackage.Registry.INSTANCE.getEPackage(Xmla_rowsetPackage.eNS_URI);
		Xmla_emptyPackage theXmla_emptyPackage = (Xmla_emptyPackage)EPackage.Registry.INSTANCE.getEPackage(Xmla_emptyPackage.eNS_URI);
		Xmla_multipleresultsPackage theXmla_multipleresultsPackage = (Xmla_multipleresultsPackage)EPackage.Registry.INSTANCE.getEPackage(Xmla_multipleresultsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(discoverResponseTypeEClass, DiscoverResponseType.class, "DiscoverResponseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiscoverResponseType_Return(), this.getReturnType(), null, "return", null, 0, 1, DiscoverResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(discoverTypeEClass, DiscoverType.class, "DiscoverType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiscoverType_RequestType(), this.getRequestTypeType(), "requestType", null, 1, 1, DiscoverType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiscoverType_Restrictions(), this.getRestrictionsType(), null, "restrictions", null, 1, 1, DiscoverType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiscoverType_Properties(), this.getProperties(), null, "properties", null, 1, 1, DiscoverType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertiesEClass, Properties.class, "Properties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProperties_PropertyList(), this.getPropertyList(), null, "propertyList", null, 0, 1, Properties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertiesTypeEClass, PropertiesType.class, "PropertiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertiesType_PropertyList(), this.getPropertyList(), null, "propertyList", null, 0, 1, PropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyListEClass, PropertyList.class, "PropertyList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyList_DataSourceInfo(), ecorePackage.getEString(), "dataSourceInfo", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_Timeout(), ecorePackage.getEBigInteger(), "timeout", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_UserName(), ecorePackage.getEString(), "userName", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_Password(), ecorePackage.getEString(), "password", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_LocaleIdentifier(), ecorePackage.getEBigInteger(), "localeIdentifier", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_Catalog(), ecorePackage.getEString(), "catalog", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_StateSupport(), this.getStateSupportType(), "stateSupport", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_Content(), this.getContentType1(), "content", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_Format(), this.getFormatType1(), "format", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_AxisFormat(), this.getAxisFormatType(), "axisFormat", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_BeginRange(), ecorePackage.getEBigInteger(), "beginRange", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_EndRange(), ecorePackage.getEBigInteger(), "endRange", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MDXSupport(), this.getMDXSupportType(), "mDXSupport", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_ProviderName(), ecorePackage.getEString(), "providerName", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_ProviderVersion(), ecorePackage.getEString(), "providerVersion", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DBMSVersion(), ecorePackage.getEString(), "dBMSVersion", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_ProviderType(), this.getProviderTypeType(), "providerType", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_ShowHiddenCubes(), ecorePackage.getEBoolean(), "showHiddenCubes", null, 1, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_SQLSupport(), ecorePackage.getEBigInteger(), "sQLSupport", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_TransactionDDL(), ecorePackage.getEBigInteger(), "transactionDDL", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MaximumRows(), ecorePackage.getEBigInteger(), "maximumRows", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_Roles(), ecorePackage.getEString(), "roles", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_VisualMode(), this.getVisualModeType(), "visualMode", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_EffectiveRoles(), ecorePackage.getEString(), "effectiveRoles", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_EffectiveUserName(), ecorePackage.getEString(), "effectiveUserName", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_ServerName(), ecorePackage.getEString(), "serverName", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_CatalogLocation(), this.getCatalogLocationType(), "catalogLocation", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropCatalogTerm(), ecorePackage.getEString(), "dbpropCatalogTerm", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropCatalogUsage(), ecorePackage.getEBigInteger(), "dbpropCatalogUsage", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropColumnDefinition(), ecorePackage.getEBigInteger(), "dbpropColumnDefinition", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropConcatNullBehavior(), this.getDbpropConcatNullBehaviorType(), "dbpropConcatNullBehavior", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropDataSourceReadOnly(), ecorePackage.getEBoolean(), "dbpropDataSourceReadOnly", null, 1, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropGroupBy(), ecorePackage.getEBigInteger(), "dbpropGroupBy", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropHeterogeneousTables(), ecorePackage.getEBigInteger(), "dbpropHeterogeneousTables", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropIdentifierCase(), ecorePackage.getEBigInteger(), "dbpropIdentifierCase", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropMaxIndexSize(), ecorePackage.getEBigInteger(), "dbpropMaxIndexSize", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropMaxOpenChapters(), ecorePackage.getEBigInteger(), "dbpropMaxOpenChapters", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropMaxRowSize(), ecorePackage.getEBigInteger(), "dbpropMaxRowSize", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropMaxRowSizeIncludeBlob(), ecorePackage.getEBoolean(), "dbpropMaxRowSizeIncludeBlob", null, 1, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropMaxTablesInSelect(), ecorePackage.getEBigInteger(), "dbpropMaxTablesInSelect", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropMultiTableUpdate(), ecorePackage.getEBoolean(), "dbpropMultiTableUpdate", null, 1, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropNullCollation(), this.getDbpropNullCollationType(), "dbpropNullCollation", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropOrderByColumnsInSelect(), ecorePackage.getEBoolean(), "dbpropOrderByColumnsInSelect", null, 1, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropOutputParameterAvailable(), this.getDbpropOutputParameterAvailableType(), "dbpropOutputParameterAvailable", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropPersistentIdType(), this.getDbpropPersistentIdTypeType(), "dbpropPersistentIdType", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropPrepareAbortBehavior(), this.getDbpropPrepareAbortBehaviorType(), "dbpropPrepareAbortBehavior", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropPrepareCommitBehavior(), this.getDbpropPrepareCommitBehaviorType(), "dbpropPrepareCommitBehavior", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropProcedureTerm(), ecorePackage.getEString(), "dbpropProcedureTerm", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropQuotedIdentifierCase(), this.getDbpropQuotedIdentifierCaseType(), "dbpropQuotedIdentifierCase", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropSchemaUsage(), ecorePackage.getEBigInteger(), "dbpropSchemaUsage", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropSqlSupport(), ecorePackage.getEBigInteger(), "dbpropSqlSupport", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropSubqueries(), ecorePackage.getEBigInteger(), "dbpropSubqueries", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropSupportedTxnDdl(), ecorePackage.getEBigInteger(), "dbpropSupportedTxnDdl", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MdpropMdxSubqueries(), ecorePackage.getEBigInteger(), "mdpropMdxSubqueries", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropSupportedTxnIsoLevels(), ecorePackage.getEBigInteger(), "dbpropSupportedTxnIsoLevels", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropSupportedTxnIsoRetain(), ecorePackage.getEBigInteger(), "dbpropSupportedTxnIsoRetain", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropTableTerm(), ecorePackage.getEString(), "dbpropTableTerm", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MdpropAggregateCellUpdate(), this.getMdpropAggregateCellUpdateType(), "mdpropAggregateCellUpdate", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MdpropAxes(), ecorePackage.getEBigInteger(), "mdpropAxes", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MdpropFlatteningSupport(), this.getMdpropFlatteningSupportType(), "mdpropFlatteningSupport", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MdpropMdxCaseSupport(), ecorePackage.getEBigInteger(), "mdpropMdxCaseSupport", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MdpropMdxDescFlags(), ecorePackage.getEBigInteger(), "mdpropMdxDescFlags", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MdpropMdxDrillFunctions(), ecorePackage.getEBigInteger(), "mdpropMdxDrillFunctions", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MdpropMdxFormulas(), ecorePackage.getEBigInteger(), "mdpropMdxFormulas", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MdpropMdxJoinCubes(), ecorePackage.getEBigInteger(), "mdpropMdxJoinCubes", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MdpropMdxMemberFunctions(), ecorePackage.getEBigInteger(), "mdpropMdxMemberFunctions", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MdpropMdxNonMeasureExpressions(), this.getMdpropMdxNonMeasureExpressionsType(), "mdpropMdxNonMeasureExpressions", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MdpropMdxNumericFunctions(), ecorePackage.getEBigInteger(), "mdpropMdxNumericFunctions", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MdpropMdxObjQualification(), ecorePackage.getEBigInteger(), "mdpropMdxObjQualification", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MdpropMdxOuterReference(), ecorePackage.getEBigInteger(), "mdpropMdxOuterReference", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MdpropMdxQueryByProperty(), ecorePackage.getEBoolean(), "mdpropMdxQueryByProperty", null, 1, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MdpropMdxRangeRowset(), this.getMdpropMdxRangeRowsetType(), "mdpropMdxRangeRowset", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MdpropMdxSetFunctions(), ecorePackage.getEBigInteger(), "mdpropMdxSetFunctions", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MdpropMdxSlicer(), this.getMdpropMdxSlicerType(), "mdpropMdxSlicer", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MdpropMdxStringCompop(), ecorePackage.getEBigInteger(), "mdpropMdxStringCompop", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MdpropNamedLevels(), ecorePackage.getEBigInteger(), "mdpropNamedLevels", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropMsmdMDXCompatibility(), this.getDbpropMsmdMDXCompatibilityType(), "dbpropMsmdMDXCompatibility", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropMsmdSQLCompatibility(), ecorePackage.getEBigInteger(), "dbpropMsmdSQLCompatibility", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropMsmdMDXUniqueNameStyle(), ecorePackage.getEBigInteger(), "dbpropMsmdMDXUniqueNameStyle", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropMsmdCachePolicy(), ecorePackage.getEBigInteger(), "dbpropMsmdCachePolicy", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropMsmdCacheRatio(), ecorePackage.getEBigInteger(), "dbpropMsmdCacheRatio", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropMsmdCacheMode(), ecorePackage.getEBigInteger(), "dbpropMsmdCacheMode", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropMsmdCompareCaseSensitiveStringFlags(), this.getDbpropMsmdCompareCaseSensitiveStringFlagsType(), "dbpropMsmdCompareCaseSensitiveStringFlags", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropMsmdCompareCaseNotSensitiveStringFlags(), ecorePackage.getEBigInteger(), "dbpropMsmdCompareCaseNotSensitiveStringFlags", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropMsmdFlattened2(), ecorePackage.getEBoolean(), "dbpropMsmdFlattened2", null, 1, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropInitMode(), ecorePackage.getEBigInteger(), "dbpropInitMode", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_SspropInitAppName(), ecorePackage.getEString(), "sspropInitAppName", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_SspropInitWsid(), ecorePackage.getEString(), "sspropInitWsid", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_SspropInitPacketsize(), ecorePackage.getEBigInteger(), "sspropInitPacketsize", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_ReadOnlySession(), ecorePackage.getEBigInteger(), "readOnlySession", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_SecuredCellValue(), this.getSecuredCellValueType(), "securedCellValue", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_NonEmptyThreshold(), ecorePackage.getEBigInteger(), "nonEmptyThreshold", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_SafetyOptions(), this.getSafetyOptionsType(), "safetyOptions", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropMsmdCacheRatio2(), theXMLTypePackage.getDouble(), "dbpropMsmdCacheRatio2", null, 1, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropMsmdUseFormulaCache(), ecorePackage.getEString(), "dbpropMsmdUseFormulaCache", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropMsmdDynamicDebugLimit(), ecorePackage.getEBigInteger(), "dbpropMsmdDynamicDebugLimit", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropMsmdDebugMode(), ecorePackage.getEString(), "dbpropMsmdDebugMode", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_Dialect(), this.getDialectType(), "dialect", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_ImpactAnalysis(), ecorePackage.getEBoolean(), "impactAnalysis", null, 1, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_SQLQueryMode(), this.getSQLQueryModeType(), "sQLQueryMode", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_ClientProcessID(), ecorePackage.getEBigInteger(), "clientProcessID", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_Cube(), ecorePackage.getEString(), "cube", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_ReturnCellProperties(), ecorePackage.getEBoolean(), "returnCellProperties", null, 1, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_CommitTimeout(), ecorePackage.getEBigInteger(), "commitTimeout", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_ForceCommitTimeout(), ecorePackage.getEBigInteger(), "forceCommitTimeout", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_ExecutionMode(), ecorePackage.getEString(), "executionMode", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_RealTimeOlap(), ecorePackage.getEBoolean(), "realTimeOlap", null, 1, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MdxMissingMemberMode(), this.getMdxMissingMemberModeType1(), "mdxMissingMemberMode", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MdpropMdxNamedSets(), ecorePackage.getEBigInteger(), "mdpropMdxNamedSets", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropMsmdSubqueries(), this.getDbpropMsmdSubqueriesType(), "dbpropMsmdSubqueries", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropMsmdAutoExists(), this.getDbpropMsmdAutoExistsType(), "dbpropMsmdAutoExists", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_CustomData(), ecorePackage.getEString(), "customData", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DisablePrefetchFacts(), ecorePackage.getEBoolean(), "disablePrefetchFacts", null, 1, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_UpdateIsolationLevel(), this.getUpdateIsolationLevelType(), "updateIsolationLevel", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropMsmdErrorMessageMode(), ecorePackage.getEBigInteger(), "dbpropMsmdErrorMessageMode", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MdpropMdxDdlExtensions(), ecorePackage.getEBigInteger(), "mdpropMdxDdlExtensions", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_ResponseEncoding(), this.getResponseEncodingType(), "responseEncoding", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MemoryLockingMode(), this.getMemoryLockingModeType(), "memoryLockingMode", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropMsmdOptimizeResponse(), ecorePackage.getEBigInteger(), "dbpropMsmdOptimizeResponse", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropMsmdActivityID(), ecorePackage.getEString(), "dbpropMsmdActivityID", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropMsmdRequestID(), ecorePackage.getEString(), "dbpropMsmdRequestID", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_ReturnAffectedObjects(), ecorePackage.getEBigInteger(), "returnAffectedObjects", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropMsmdRequestMemoryLimit(), ecorePackage.getEBigInteger(), "dbpropMsmdRequestMemoryLimit", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_ApplicationContext(), ecorePackage.getEString(), "applicationContext", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restrictionListTypeEClass, RestrictionListType.class, "RestrictionListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRestrictionListType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, RestrictionListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restrictionsTypeEClass, RestrictionsType.class, "RestrictionsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRestrictionsType_RestrictionList(), this.getRestrictionListType(), null, "restrictionList", null, 0, 1, RestrictionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnEClass, Return.class, "Return", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturn_Root(), theXmla_mddatasetPackage.getMddataset(), null, "root", null, 0, 1, Return.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReturn_Root1(), theXmla_rowsetPackage.getRowset(), null, "root1", null, 0, 1, Return.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReturn_Root2(), theXmla_emptyPackage.getEmptyresult(), null, "root2", null, 0, 1, Return.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReturn_Results(), theXmla_multipleresultsPackage.getResultsType(), null, "results", null, 0, 1, Return.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnTypeEClass, ReturnType.class, "ReturnType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturnType_Root(), theXmla_rowsetPackage.getRowset(), null, "root", null, 0, 1, ReturnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotation_Name(), ecorePackage.getEString(), "name", null, 1, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotation_Visibility(), this.getVisibilityType(), "visibility", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotation_Value(), ecorePackage.getEObject(), null, "value", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationsTypeEClass, AnnotationsType.class, "AnnotationsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotationsType_Annotation(), this.getAnnotation(), null, "annotation", null, 0, -1, AnnotationsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingEClass, Binding.class, "Binding", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventSessionTypeEClass, EventSessionType.class, "EventSessionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventSessionType_TemplateCategory(), ecorePackage.getEString(), "templateCategory", null, 0, 1, EventSessionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventSessionType_TemplateName(), ecorePackage.getEString(), "templateName", null, 0, 1, EventSessionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventSessionType_TemplateDescription(), ecorePackage.getEString(), "templateDescription", null, 0, 1, EventSessionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventSessionType_Event(), ecorePackage.getEObject(), null, "event", null, 0, -1, EventSessionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventSessionType_Target(), ecorePackage.getEObject(), null, "target", null, 0, -1, EventSessionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventSessionType_DispatchLatency(), theXMLTypePackage.getUnsignedInt(), "dispatchLatency", "30", 1, 1, EventSessionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventSessionType_EventRetentionMode(), this.getRetentionModes(), "eventRetentionMode", "allowSingleEventLoss", 0, 1, EventSessionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventSessionType_MaxEventSize(), theXMLTypePackage.getUnsignedInt(), "maxEventSize", "0", 1, 1, EventSessionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventSessionType_MaxMemory(), theXMLTypePackage.getUnsignedLong(), "maxMemory", "4", 0, 1, EventSessionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventSessionType_MemoryPartitionMode(), this.getPartitionModes(), "memoryPartitionMode", "none", 0, 1, EventSessionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventSessionType_Name(), ecorePackage.getEString(), "name", null, 1, 1, EventSessionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventSessionType_TrackCausality(), ecorePackage.getEBoolean(), "trackCausality", "false", 1, 1, EventSessionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(requestTypeTypeEEnum, RequestTypeType.class, "RequestTypeType");
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DBSCHEMACATALOGS);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.MDSCHEMACUBES);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.MDSCHEMADIMENSIONS);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.MDSCHEMAHIERARCHIES);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.MDSCHEMALEVELS);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.MDSCHEMAMEASURES);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.MDSCHEMAPROPERTIES);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.MDSCHEMAMEMBERS);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.MDSCHEMAACTIONS);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.MDSCHEMASETS);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DISCOVERINSTANCES);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.MDSCHEMAKPIS);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.MDSCHEMAMEASUREGROUPS);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.MDSCHEMAMEASUREGROUPDIMENSIONS);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DISCOVERPROPERTIES);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DISCOVERLITERALS);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DISCOVERSCHEMAROWSETS);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DISCOVERKEYWORDS);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DBSCHEMATABLES);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DBSCHEMACOLUMNS);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DBSCHEMAPROVIDERTYPES);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.MDSCHEMAINPUTDATASOURCES);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DMSCHEMAMININGSERVICES);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DMSCHEMAMININGSERVICEPARAMETERS);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DMSCHEMAMININGFUNCTIONS);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DMSCHEMAMININGMODELCONTENT);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DMSCHEMAMININGMODELXML);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DMSCHEMAMININGMODELCONTENTPMML);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DMSCHEMAMININGMODELS);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DMSCHEMAMININGCOLUMNS);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DMSCHEMAMININGSTRUCTURES);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DMSCHEMAMININGSTRUCTURECOLUMNS);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DISCOVERDATASOURCES);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DISCOVERENUMERATORS);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DISCOVERXMLMETADATA);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DISCOVERTRACES);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DISCOVERTRACEDEFINITIONPROVIDERINFO);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DISCOVERTRACECOLUMNS);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DISCOVERTRACEEVENTCATEGORIES);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DISCOVERMEMORYUSAGE);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DISCOVERMEMORYGRANT);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DISCOVERLOCKS);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DISCOVERCONNECTIONS);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DISCOVERSESSIONS);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DISCOVERJOBS);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DISCOVERTRANSACTIONS);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DISCOVERDBCONNECTIONS);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DISCOVERMASTERKEY);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DISCOVERPERFORMANCECOUNTERS);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DISCOVERLOCATIONS);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DISCOVERPARTITIONDIMENSIONSTAT);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DISCOVERPARTITIONSTAT);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DISCOVERDIMENSIONSTAT);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DISCOVERCOMMANDS);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DISCOVERCOMMANDOBJECTS);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DISCOVEROBJECTACTIVITY);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DISCOVEROBJECTMEMORYUSAGE);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DISCOVERSTORAGETABLES);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DISCOVERSTORAGETABLECOLUMNS);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DISCOVERSTORAGETABLECOLUMNSEGMENTS);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DISCOVERCSDLMETADATA);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DISCOVERCALCDEPENDENCY);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.MDSCHEMAFUNCTIONS);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DISCOVERRINGBUFFERS);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DISCOVERXEVENTTRACEDEFINITION);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DISCOVERXEVENTPACKAGES);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DISCOVERXEVENTOBJECTS);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DISCOVERXEVENTOBJECTCOLUMNS);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DISCOVERXEVENTSESSIONS);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DISCOVERXEVENTSESSIONTARGETS);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DISCOVERMEMSTATS);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DISCOVERDBMEMSTATS);
		addEEnumLiteral(requestTypeTypeEEnum, RequestTypeType.DISCOVEROBJECTCOUNTERS);

		initEEnum(responseEncodingTypeEEnum, ResponseEncodingType.class, "ResponseEncodingType");
		addEEnumLiteral(responseEncodingTypeEEnum, ResponseEncodingType.DEFAULT);
		addEEnumLiteral(responseEncodingTypeEEnum, ResponseEncodingType.UTF8);
		addEEnumLiteral(responseEncodingTypeEEnum, ResponseEncodingType.UTF16);

		initEEnum(stateSupportTypeEEnum, StateSupportType.class, "StateSupportType");
		addEEnumLiteral(stateSupportTypeEEnum, StateSupportType.NONE);
		addEEnumLiteral(stateSupportTypeEEnum, StateSupportType.SESSIONS);

		initEEnum(formatType1EEnum, FormatType1.class, "FormatType1");
		addEEnumLiteral(formatType1EEnum, FormatType1.TABULAR);
		addEEnumLiteral(formatType1EEnum, FormatType1.MULTIDIMENSIONAL);
		addEEnumLiteral(formatType1EEnum, FormatType1.NATIVE);

		initEEnum(contentType1EEnum, ContentType1.class, "ContentType1");
		addEEnumLiteral(contentType1EEnum, ContentType1.NONE);
		addEEnumLiteral(contentType1EEnum, ContentType1.SCHEMA);
		addEEnumLiteral(contentType1EEnum, ContentType1.DATA);
		addEEnumLiteral(contentType1EEnum, ContentType1.SCHEMA_DATA);
		addEEnumLiteral(contentType1EEnum, ContentType1.METADATA);

		initEEnum(axisFormatTypeEEnum, AxisFormatType.class, "AxisFormatType");
		addEEnumLiteral(axisFormatTypeEEnum, AxisFormatType.CLUSTER_FORMAT);
		addEEnumLiteral(axisFormatTypeEEnum, AxisFormatType.CUSTOM_FORMAT);
		addEEnumLiteral(axisFormatTypeEEnum, AxisFormatType.TUPLE_FORMAT);

		initEEnum(mdxSupportTypeEEnum, MDXSupportType.class, "MDXSupportType");
		addEEnumLiteral(mdxSupportTypeEEnum, MDXSupportType.CORE);

		initEEnum(providerTypeTypeEEnum, ProviderTypeType.class, "ProviderTypeType");
		addEEnumLiteral(providerTypeTypeEEnum, ProviderTypeType._1);
		addEEnumLiteral(providerTypeTypeEEnum, ProviderTypeType._2);
		addEEnumLiteral(providerTypeTypeEEnum, ProviderTypeType._3);
		addEEnumLiteral(providerTypeTypeEEnum, ProviderTypeType._4);

		initEEnum(visualModeTypeEEnum, VisualModeType.class, "VisualModeType");
		addEEnumLiteral(visualModeTypeEEnum, VisualModeType._0);
		addEEnumLiteral(visualModeTypeEEnum, VisualModeType._1);
		addEEnumLiteral(visualModeTypeEEnum, VisualModeType._2);

		initEEnum(catalogLocationTypeEEnum, CatalogLocationType.class, "CatalogLocationType");
		addEEnumLiteral(catalogLocationTypeEEnum, CatalogLocationType._1);
		addEEnumLiteral(catalogLocationTypeEEnum, CatalogLocationType._2);

		initEEnum(dbpropConcatNullBehaviorTypeEEnum, DbpropConcatNullBehaviorType.class, "DbpropConcatNullBehaviorType");
		addEEnumLiteral(dbpropConcatNullBehaviorTypeEEnum, DbpropConcatNullBehaviorType._1);
		addEEnumLiteral(dbpropConcatNullBehaviorTypeEEnum, DbpropConcatNullBehaviorType._2);

		initEEnum(dbpropNullCollationTypeEEnum, DbpropNullCollationType.class, "DbpropNullCollationType");
		addEEnumLiteral(dbpropNullCollationTypeEEnum, DbpropNullCollationType._1);
		addEEnumLiteral(dbpropNullCollationTypeEEnum, DbpropNullCollationType._2);
		addEEnumLiteral(dbpropNullCollationTypeEEnum, DbpropNullCollationType._4);
		addEEnumLiteral(dbpropNullCollationTypeEEnum, DbpropNullCollationType._8);

		initEEnum(dbpropOutputParameterAvailableTypeEEnum, DbpropOutputParameterAvailableType.class, "DbpropOutputParameterAvailableType");
		addEEnumLiteral(dbpropOutputParameterAvailableTypeEEnum, DbpropOutputParameterAvailableType._1);
		addEEnumLiteral(dbpropOutputParameterAvailableTypeEEnum, DbpropOutputParameterAvailableType._2);
		addEEnumLiteral(dbpropOutputParameterAvailableTypeEEnum, DbpropOutputParameterAvailableType._4);

		initEEnum(dbpropPersistentIdTypeTypeEEnum, DbpropPersistentIdTypeType.class, "DbpropPersistentIdTypeType");
		addEEnumLiteral(dbpropPersistentIdTypeTypeEEnum, DbpropPersistentIdTypeType._1);
		addEEnumLiteral(dbpropPersistentIdTypeTypeEEnum, DbpropPersistentIdTypeType._2);
		addEEnumLiteral(dbpropPersistentIdTypeTypeEEnum, DbpropPersistentIdTypeType._4);
		addEEnumLiteral(dbpropPersistentIdTypeTypeEEnum, DbpropPersistentIdTypeType._8);
		addEEnumLiteral(dbpropPersistentIdTypeTypeEEnum, DbpropPersistentIdTypeType._16);
		addEEnumLiteral(dbpropPersistentIdTypeTypeEEnum, DbpropPersistentIdTypeType._32);
		addEEnumLiteral(dbpropPersistentIdTypeTypeEEnum, DbpropPersistentIdTypeType._64);

		initEEnum(dbpropPrepareAbortBehaviorTypeEEnum, DbpropPrepareAbortBehaviorType.class, "DbpropPrepareAbortBehaviorType");
		addEEnumLiteral(dbpropPrepareAbortBehaviorTypeEEnum, DbpropPrepareAbortBehaviorType._1);
		addEEnumLiteral(dbpropPrepareAbortBehaviorTypeEEnum, DbpropPrepareAbortBehaviorType._2);

		initEEnum(dbpropPrepareCommitBehaviorTypeEEnum, DbpropPrepareCommitBehaviorType.class, "DbpropPrepareCommitBehaviorType");
		addEEnumLiteral(dbpropPrepareCommitBehaviorTypeEEnum, DbpropPrepareCommitBehaviorType._1);
		addEEnumLiteral(dbpropPrepareCommitBehaviorTypeEEnum, DbpropPrepareCommitBehaviorType._2);

		initEEnum(dbpropQuotedIdentifierCaseTypeEEnum, DbpropQuotedIdentifierCaseType.class, "DbpropQuotedIdentifierCaseType");
		addEEnumLiteral(dbpropQuotedIdentifierCaseTypeEEnum, DbpropQuotedIdentifierCaseType._1);
		addEEnumLiteral(dbpropQuotedIdentifierCaseTypeEEnum, DbpropQuotedIdentifierCaseType._2);
		addEEnumLiteral(dbpropQuotedIdentifierCaseTypeEEnum, DbpropQuotedIdentifierCaseType._4);
		addEEnumLiteral(dbpropQuotedIdentifierCaseTypeEEnum, DbpropQuotedIdentifierCaseType._8);

		initEEnum(mdpropAggregateCellUpdateTypeEEnum, MdpropAggregateCellUpdateType.class, "MdpropAggregateCellUpdateType");
		addEEnumLiteral(mdpropAggregateCellUpdateTypeEEnum, MdpropAggregateCellUpdateType._0);
		addEEnumLiteral(mdpropAggregateCellUpdateTypeEEnum, MdpropAggregateCellUpdateType._1);
		addEEnumLiteral(mdpropAggregateCellUpdateTypeEEnum, MdpropAggregateCellUpdateType._2);

		initEEnum(mdpropFlatteningSupportTypeEEnum, MdpropFlatteningSupportType.class, "MdpropFlatteningSupportType");
		addEEnumLiteral(mdpropFlatteningSupportTypeEEnum, MdpropFlatteningSupportType._1);
		addEEnumLiteral(mdpropFlatteningSupportTypeEEnum, MdpropFlatteningSupportType._2);
		addEEnumLiteral(mdpropFlatteningSupportTypeEEnum, MdpropFlatteningSupportType._3);
		addEEnumLiteral(mdpropFlatteningSupportTypeEEnum, MdpropFlatteningSupportType._4);

		initEEnum(mdpropMdxNonMeasureExpressionsTypeEEnum, MdpropMdxNonMeasureExpressionsType.class, "MdpropMdxNonMeasureExpressionsType");
		addEEnumLiteral(mdpropMdxNonMeasureExpressionsTypeEEnum, MdpropMdxNonMeasureExpressionsType._0);
		addEEnumLiteral(mdpropMdxNonMeasureExpressionsTypeEEnum, MdpropMdxNonMeasureExpressionsType._1);

		initEEnum(mdpropMdxRangeRowsetTypeEEnum, MdpropMdxRangeRowsetType.class, "MdpropMdxRangeRowsetType");
		addEEnumLiteral(mdpropMdxRangeRowsetTypeEEnum, MdpropMdxRangeRowsetType._1);
		addEEnumLiteral(mdpropMdxRangeRowsetTypeEEnum, MdpropMdxRangeRowsetType._2);
		addEEnumLiteral(mdpropMdxRangeRowsetTypeEEnum, MdpropMdxRangeRowsetType._4);

		initEEnum(mdpropMdxSlicerTypeEEnum, MdpropMdxSlicerType.class, "MdpropMdxSlicerType");
		addEEnumLiteral(mdpropMdxSlicerTypeEEnum, MdpropMdxSlicerType._1);
		addEEnumLiteral(mdpropMdxSlicerTypeEEnum, MdpropMdxSlicerType._2);

		initEEnum(mdxMissingMemberModeTypeEEnum, MdxMissingMemberModeType.class, "MdxMissingMemberModeType");
		addEEnumLiteral(mdxMissingMemberModeTypeEEnum, MdxMissingMemberModeType.DEFAULT);
		addEEnumLiteral(mdxMissingMemberModeTypeEEnum, MdxMissingMemberModeType.IGNORE);
		addEEnumLiteral(mdxMissingMemberModeTypeEEnum, MdxMissingMemberModeType.ERROR);

		initEEnum(dbpropMsmdMDXCompatibilityTypeEEnum, DbpropMsmdMDXCompatibilityType.class, "DbpropMsmdMDXCompatibilityType");
		addEEnumLiteral(dbpropMsmdMDXCompatibilityTypeEEnum, DbpropMsmdMDXCompatibilityType._0);
		addEEnumLiteral(dbpropMsmdMDXCompatibilityTypeEEnum, DbpropMsmdMDXCompatibilityType._1);
		addEEnumLiteral(dbpropMsmdMDXCompatibilityTypeEEnum, DbpropMsmdMDXCompatibilityType._2);
		addEEnumLiteral(dbpropMsmdMDXCompatibilityTypeEEnum, DbpropMsmdMDXCompatibilityType._3);

		initEEnum(dbpropMsmdCompareCaseSensitiveStringFlagsTypeEEnum, DbpropMsmdCompareCaseSensitiveStringFlagsType.class, "DbpropMsmdCompareCaseSensitiveStringFlagsType");
		addEEnumLiteral(dbpropMsmdCompareCaseSensitiveStringFlagsTypeEEnum, DbpropMsmdCompareCaseSensitiveStringFlagsType._1);
		addEEnumLiteral(dbpropMsmdCompareCaseSensitiveStringFlagsTypeEEnum, DbpropMsmdCompareCaseSensitiveStringFlagsType._2);
		addEEnumLiteral(dbpropMsmdCompareCaseSensitiveStringFlagsTypeEEnum, DbpropMsmdCompareCaseSensitiveStringFlagsType._16);
		addEEnumLiteral(dbpropMsmdCompareCaseSensitiveStringFlagsTypeEEnum, DbpropMsmdCompareCaseSensitiveStringFlagsType._256);
		addEEnumLiteral(dbpropMsmdCompareCaseSensitiveStringFlagsTypeEEnum, DbpropMsmdCompareCaseSensitiveStringFlagsType._4096);
		addEEnumLiteral(dbpropMsmdCompareCaseSensitiveStringFlagsTypeEEnum, DbpropMsmdCompareCaseSensitiveStringFlagsType._65536);
		addEEnumLiteral(dbpropMsmdCompareCaseSensitiveStringFlagsTypeEEnum, DbpropMsmdCompareCaseSensitiveStringFlagsType._1048576);

		initEEnum(securedCellValueTypeEEnum, SecuredCellValueType.class, "SecuredCellValueType");
		addEEnumLiteral(securedCellValueTypeEEnum, SecuredCellValueType._0);
		addEEnumLiteral(securedCellValueTypeEEnum, SecuredCellValueType._1);
		addEEnumLiteral(securedCellValueTypeEEnum, SecuredCellValueType._2);
		addEEnumLiteral(securedCellValueTypeEEnum, SecuredCellValueType._3);
		addEEnumLiteral(securedCellValueTypeEEnum, SecuredCellValueType._4);
		addEEnumLiteral(securedCellValueTypeEEnum, SecuredCellValueType._5);

		initEEnum(safetyOptionsTypeEEnum, SafetyOptionsType.class, "SafetyOptionsType");
		addEEnumLiteral(safetyOptionsTypeEEnum, SafetyOptionsType._0);
		addEEnumLiteral(safetyOptionsTypeEEnum, SafetyOptionsType._1);
		addEEnumLiteral(safetyOptionsTypeEEnum, SafetyOptionsType._2);
		addEEnumLiteral(safetyOptionsTypeEEnum, SafetyOptionsType._3);

		initEEnum(dialectTypeEEnum, DialectType.class, "DialectType");
		addEEnumLiteral(dialectTypeEEnum, DialectType.MDX);
		addEEnumLiteral(dialectTypeEEnum, DialectType.DMX);
		addEEnumLiteral(dialectTypeEEnum, DialectType.SQL);

		initEEnum(sqlQueryModeTypeEEnum, SQLQueryModeType.class, "SQLQueryModeType");
		addEEnumLiteral(sqlQueryModeTypeEEnum, SQLQueryModeType.DATA);
		addEEnumLiteral(sqlQueryModeTypeEEnum, SQLQueryModeType.CALCULATED);
		addEEnumLiteral(sqlQueryModeTypeEEnum, SQLQueryModeType.INCLUDE_EMPTY);
		addEEnumLiteral(sqlQueryModeTypeEEnum, SQLQueryModeType.DATA_KEYS);

		initEEnum(mdxMissingMemberModeType1EEnum, MdxMissingMemberModeType1.class, "MdxMissingMemberModeType1");
		addEEnumLiteral(mdxMissingMemberModeType1EEnum, MdxMissingMemberModeType1.DEFAULT);
		addEEnumLiteral(mdxMissingMemberModeType1EEnum, MdxMissingMemberModeType1.IGNORE);
		addEEnumLiteral(mdxMissingMemberModeType1EEnum, MdxMissingMemberModeType1.ERROR);

		initEEnum(dbpropMsmdSubqueriesTypeEEnum, DbpropMsmdSubqueriesType.class, "DbpropMsmdSubqueriesType");
		addEEnumLiteral(dbpropMsmdSubqueriesTypeEEnum, DbpropMsmdSubqueriesType._0);
		addEEnumLiteral(dbpropMsmdSubqueriesTypeEEnum, DbpropMsmdSubqueriesType._1);
		addEEnumLiteral(dbpropMsmdSubqueriesTypeEEnum, DbpropMsmdSubqueriesType._2);

		initEEnum(dbpropMsmdAutoExistsTypeEEnum, DbpropMsmdAutoExistsType.class, "DbpropMsmdAutoExistsType");
		addEEnumLiteral(dbpropMsmdAutoExistsTypeEEnum, DbpropMsmdAutoExistsType._0);
		addEEnumLiteral(dbpropMsmdAutoExistsTypeEEnum, DbpropMsmdAutoExistsType._1);
		addEEnumLiteral(dbpropMsmdAutoExistsTypeEEnum, DbpropMsmdAutoExistsType._2);
		addEEnumLiteral(dbpropMsmdAutoExistsTypeEEnum, DbpropMsmdAutoExistsType._3);

		initEEnum(updateIsolationLevelTypeEEnum, UpdateIsolationLevelType.class, "UpdateIsolationLevelType");
		addEEnumLiteral(updateIsolationLevelTypeEEnum, UpdateIsolationLevelType._1);
		addEEnumLiteral(updateIsolationLevelTypeEEnum, UpdateIsolationLevelType._2);

		initEEnum(memoryLockingModeTypeEEnum, MemoryLockingModeType.class, "MemoryLockingModeType");
		addEEnumLiteral(memoryLockingModeTypeEEnum, MemoryLockingModeType._0);
		addEEnumLiteral(memoryLockingModeTypeEEnum, MemoryLockingModeType._1);

		initEEnum(visibilityTypeEEnum, VisibilityType.class, "VisibilityType");
		addEEnumLiteral(visibilityTypeEEnum, VisibilityType.SCHEMA_ROWSET);
		addEEnumLiteral(visibilityTypeEEnum, VisibilityType.NONE);

		initEEnum(retentionModesEEnum, RetentionModes.class, "RetentionModes");
		addEEnumLiteral(retentionModesEEnum, RetentionModes.ALLOW_SINGLE_EVENT_LOSS);
		addEEnumLiteral(retentionModesEEnum, RetentionModes.ALLOW_MULTIPLE_EVENT_LOSS);
		addEEnumLiteral(retentionModesEEnum, RetentionModes.NO_EVENT_LOSS);

		initEEnum(partitionModesEEnum, PartitionModes.class, "PartitionModes");
		addEEnumLiteral(partitionModesEEnum, PartitionModes.NONE);
		addEEnumLiteral(partitionModesEEnum, PartitionModes.PER_NODE);
		addEEnumLiteral(partitionModesEEnum, PartitionModes.PER_CPU);

		// Initialize data types
		initEDataType(requestTypeTypeObjectEDataType, RequestTypeType.class, "RequestTypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(responseEncodingTypeObjectEDataType, ResponseEncodingType.class, "ResponseEncodingTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// https://jakarta.ee/xml/ns/jaxb
		createJaxbAnnotations();
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
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
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "_xmla_empty", "xmla_empty.ecore#/",
			   "_xmla_mddataset", "xmla_mddataset.ecore#/",
			   "_xmla_multipleresults", "xmla_multipleresults.ecore#/",
			   "_xmla_rowset", "xmla_rowset.ecore#/",
			   "ecore", "http://www.eclipse.org/emf/2002/Ecore",
			   "ecore.xml.type", "http://www.eclipse.org/emf/2003/XMLType"
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
		  (discoverResponseTypeEClass,
		   source,
		   new String[] {
			   "name", "DiscoverResponse_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDiscoverResponseType_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (discoverTypeEClass,
		   source,
		   new String[] {
			   "name", "Discover_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDiscoverType_RequestType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RequestType"
		   });
		addAnnotation
		  (getDiscoverType_Restrictions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Restrictions"
		   });
		addAnnotation
		  (getDiscoverType_Properties(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Properties"
		   });
		addAnnotation
		  (propertiesEClass,
		   source,
		   new String[] {
			   "name", "Properties",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getProperties_PropertyList(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PropertyList"
		   });
		addAnnotation
		  (propertiesTypeEClass,
		   source,
		   new String[] {
			   "name", "Properties_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPropertiesType_PropertyList(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PropertyList"
		   });
		addAnnotation
		  (propertyListEClass,
		   source,
		   new String[] {
			   "name", "PropertyList",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPropertyList_DataSourceInfo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DataSourceInfo"
		   });
		addAnnotation
		  (getPropertyList_Timeout(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Timeout"
		   });
		addAnnotation
		  (getPropertyList_UserName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UserName"
		   });
		addAnnotation
		  (getPropertyList_Password(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Password"
		   });
		addAnnotation
		  (getPropertyList_LocaleIdentifier(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LocaleIdentifier"
		   });
		addAnnotation
		  (getPropertyList_Catalog(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Catalog"
		   });
		addAnnotation
		  (getPropertyList_StateSupport(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StateSupport"
		   });
		addAnnotation
		  (getPropertyList_Content(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Content"
		   });
		addAnnotation
		  (getPropertyList_Format(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Format"
		   });
		addAnnotation
		  (getPropertyList_AxisFormat(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AxisFormat"
		   });
		addAnnotation
		  (getPropertyList_BeginRange(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BeginRange"
		   });
		addAnnotation
		  (getPropertyList_EndRange(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "EndRange"
		   });
		addAnnotation
		  (getPropertyList_MDXSupport(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MDXSupport"
		   });
		addAnnotation
		  (getPropertyList_ProviderName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ProviderName"
		   });
		addAnnotation
		  (getPropertyList_ProviderVersion(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ProviderVersion"
		   });
		addAnnotation
		  (getPropertyList_DBMSVersion(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DBMSVersion"
		   });
		addAnnotation
		  (getPropertyList_ProviderType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ProviderType"
		   });
		addAnnotation
		  (getPropertyList_ShowHiddenCubes(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ShowHiddenCubes"
		   });
		addAnnotation
		  (getPropertyList_SQLSupport(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SQLSupport"
		   });
		addAnnotation
		  (getPropertyList_TransactionDDL(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TransactionDDL"
		   });
		addAnnotation
		  (getPropertyList_MaximumRows(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaximumRows"
		   });
		addAnnotation
		  (getPropertyList_Roles(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Roles"
		   });
		addAnnotation
		  (getPropertyList_VisualMode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "VisualMode"
		   });
		addAnnotation
		  (getPropertyList_EffectiveRoles(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "EffectiveRoles"
		   });
		addAnnotation
		  (getPropertyList_EffectiveUserName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "EffectiveUserName"
		   });
		addAnnotation
		  (getPropertyList_ServerName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ServerName"
		   });
		addAnnotation
		  (getPropertyList_CatalogLocation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CatalogLocation"
		   });
		addAnnotation
		  (getPropertyList_DbpropCatalogTerm(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropCatalogTerm"
		   });
		addAnnotation
		  (getPropertyList_DbpropCatalogUsage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropCatalogUsage"
		   });
		addAnnotation
		  (getPropertyList_DbpropColumnDefinition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropColumnDefinition"
		   });
		addAnnotation
		  (getPropertyList_DbpropConcatNullBehavior(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropConcatNullBehavior"
		   });
		addAnnotation
		  (getPropertyList_DbpropDataSourceReadOnly(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropDataSourceReadOnly"
		   });
		addAnnotation
		  (getPropertyList_DbpropGroupBy(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropGroupBy"
		   });
		addAnnotation
		  (getPropertyList_DbpropHeterogeneousTables(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropHeterogeneousTables"
		   });
		addAnnotation
		  (getPropertyList_DbpropIdentifierCase(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropIdentifierCase"
		   });
		addAnnotation
		  (getPropertyList_DbpropMaxIndexSize(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropMaxIndexSize"
		   });
		addAnnotation
		  (getPropertyList_DbpropMaxOpenChapters(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropMaxOpenChapters"
		   });
		addAnnotation
		  (getPropertyList_DbpropMaxRowSize(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropMaxRowSize"
		   });
		addAnnotation
		  (getPropertyList_DbpropMaxRowSizeIncludeBlob(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropMaxRowSizeIncludeBlob"
		   });
		addAnnotation
		  (getPropertyList_DbpropMaxTablesInSelect(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropMaxTablesInSelect"
		   });
		addAnnotation
		  (getPropertyList_DbpropMultiTableUpdate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropMultiTableUpdate"
		   });
		addAnnotation
		  (getPropertyList_DbpropNullCollation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropNullCollation"
		   });
		addAnnotation
		  (getPropertyList_DbpropOrderByColumnsInSelect(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropOrderByColumnsInSelect"
		   });
		addAnnotation
		  (getPropertyList_DbpropOutputParameterAvailable(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropOutputParameterAvailable"
		   });
		addAnnotation
		  (getPropertyList_DbpropPersistentIdType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropPersistentIdType"
		   });
		addAnnotation
		  (getPropertyList_DbpropPrepareAbortBehavior(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropPrepareAbortBehavior"
		   });
		addAnnotation
		  (getPropertyList_DbpropPrepareCommitBehavior(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropPrepareCommitBehavior"
		   });
		addAnnotation
		  (getPropertyList_DbpropProcedureTerm(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropProcedureTerm"
		   });
		addAnnotation
		  (getPropertyList_DbpropQuotedIdentifierCase(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropQuotedIdentifierCase"
		   });
		addAnnotation
		  (getPropertyList_DbpropSchemaUsage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropSchemaUsage"
		   });
		addAnnotation
		  (getPropertyList_DbpropSqlSupport(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropSqlSupport"
		   });
		addAnnotation
		  (getPropertyList_DbpropSubqueries(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropSubqueries"
		   });
		addAnnotation
		  (getPropertyList_DbpropSupportedTxnDdl(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropSupportedTxnDdl"
		   });
		addAnnotation
		  (getPropertyList_MdpropMdxSubqueries(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MdpropMdxSubqueries"
		   });
		addAnnotation
		  (getPropertyList_DbpropSupportedTxnIsoLevels(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropSupportedTxnIsoLevels"
		   });
		addAnnotation
		  (getPropertyList_DbpropSupportedTxnIsoRetain(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropSupportedTxnIsoRetain"
		   });
		addAnnotation
		  (getPropertyList_DbpropTableTerm(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropTableTerm"
		   });
		addAnnotation
		  (getPropertyList_MdpropAggregateCellUpdate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MdpropAggregateCellUpdate"
		   });
		addAnnotation
		  (getPropertyList_MdpropAxes(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MdpropAxes"
		   });
		addAnnotation
		  (getPropertyList_MdpropFlatteningSupport(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MdpropFlatteningSupport"
		   });
		addAnnotation
		  (getPropertyList_MdpropMdxCaseSupport(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MdpropMdxCaseSupport"
		   });
		addAnnotation
		  (getPropertyList_MdpropMdxDescFlags(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MdpropMdxDescFlags"
		   });
		addAnnotation
		  (getPropertyList_MdpropMdxDrillFunctions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MdpropMdxDrillFunctions"
		   });
		addAnnotation
		  (getPropertyList_MdpropMdxFormulas(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MdpropMdxFormulas"
		   });
		addAnnotation
		  (getPropertyList_MdpropMdxJoinCubes(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MdpropMdxJoinCubes"
		   });
		addAnnotation
		  (getPropertyList_MdpropMdxMemberFunctions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MdpropMdxMemberFunctions"
		   });
		addAnnotation
		  (getPropertyList_MdpropMdxNonMeasureExpressions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MdpropMdxNonMeasureExpressions"
		   });
		addAnnotation
		  (getPropertyList_MdpropMdxNumericFunctions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MdpropMdxNumericFunctions"
		   });
		addAnnotation
		  (getPropertyList_MdpropMdxObjQualification(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MdpropMdxObjQualification"
		   });
		addAnnotation
		  (getPropertyList_MdpropMdxOuterReference(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MdpropMdxOuterReference"
		   });
		addAnnotation
		  (getPropertyList_MdpropMdxQueryByProperty(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MdpropMdxQueryByProperty"
		   });
		addAnnotation
		  (getPropertyList_MdpropMdxRangeRowset(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MdpropMdxRangeRowset"
		   });
		addAnnotation
		  (getPropertyList_MdpropMdxSetFunctions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MdpropMdxSetFunctions"
		   });
		addAnnotation
		  (getPropertyList_MdpropMdxSlicer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MdpropMdxSlicer"
		   });
		addAnnotation
		  (getPropertyList_MdpropMdxStringCompop(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MdpropMdxStringCompop"
		   });
		addAnnotation
		  (getPropertyList_MdpropNamedLevels(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MdpropNamedLevels"
		   });
		addAnnotation
		  (getPropertyList_DbpropMsmdMDXCompatibility(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropMsmdMDXCompatibility"
		   });
		addAnnotation
		  (getPropertyList_DbpropMsmdSQLCompatibility(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropMsmdSQLCompatibility"
		   });
		addAnnotation
		  (getPropertyList_DbpropMsmdMDXUniqueNameStyle(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropMsmdMDXUniqueNameStyle"
		   });
		addAnnotation
		  (getPropertyList_DbpropMsmdCachePolicy(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropMsmdCachePolicy"
		   });
		addAnnotation
		  (getPropertyList_DbpropMsmdCacheRatio(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropMsmdCacheRatio"
		   });
		addAnnotation
		  (getPropertyList_DbpropMsmdCacheMode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropMsmdCacheMode"
		   });
		addAnnotation
		  (getPropertyList_DbpropMsmdCompareCaseSensitiveStringFlags(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropMsmdCompareCaseSensitiveStringFlags"
		   });
		addAnnotation
		  (getPropertyList_DbpropMsmdCompareCaseNotSensitiveStringFlags(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropMsmdCompareCaseNotSensitiveStringFlags"
		   });
		addAnnotation
		  (getPropertyList_DbpropMsmdFlattened2(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropMsmdFlattened2"
		   });
		addAnnotation
		  (getPropertyList_DbpropInitMode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropInitMode"
		   });
		addAnnotation
		  (getPropertyList_SspropInitAppName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SspropInitAppName"
		   });
		addAnnotation
		  (getPropertyList_SspropInitWsid(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SspropInitWsid"
		   });
		addAnnotation
		  (getPropertyList_SspropInitPacketsize(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SspropInitPacketsize"
		   });
		addAnnotation
		  (getPropertyList_ReadOnlySession(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ReadOnlySession"
		   });
		addAnnotation
		  (getPropertyList_SecuredCellValue(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SecuredCellValue"
		   });
		addAnnotation
		  (getPropertyList_NonEmptyThreshold(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NonEmptyThreshold"
		   });
		addAnnotation
		  (getPropertyList_SafetyOptions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SafetyOptions"
		   });
		addAnnotation
		  (getPropertyList_DbpropMsmdCacheRatio2(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropMsmdCacheRatio2"
		   });
		addAnnotation
		  (getPropertyList_DbpropMsmdUseFormulaCache(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropMsmdUseFormulaCache"
		   });
		addAnnotation
		  (getPropertyList_DbpropMsmdDynamicDebugLimit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropMsmdDynamicDebugLimit"
		   });
		addAnnotation
		  (getPropertyList_DbpropMsmdDebugMode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropMsmdDebugMode"
		   });
		addAnnotation
		  (getPropertyList_Dialect(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Dialect"
		   });
		addAnnotation
		  (getPropertyList_ImpactAnalysis(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ImpactAnalysis"
		   });
		addAnnotation
		  (getPropertyList_SQLQueryMode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SQLQueryMode"
		   });
		addAnnotation
		  (getPropertyList_ClientProcessID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ClientProcessID"
		   });
		addAnnotation
		  (getPropertyList_Cube(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Cube"
		   });
		addAnnotation
		  (getPropertyList_ReturnCellProperties(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ReturnCellProperties"
		   });
		addAnnotation
		  (getPropertyList_CommitTimeout(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CommitTimeout"
		   });
		addAnnotation
		  (getPropertyList_ForceCommitTimeout(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ForceCommitTimeout"
		   });
		addAnnotation
		  (getPropertyList_ExecutionMode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ExecutionMode"
		   });
		addAnnotation
		  (getPropertyList_RealTimeOlap(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RealTimeOlap"
		   });
		addAnnotation
		  (getPropertyList_MdxMissingMemberMode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MdxMissingMemberMode"
		   });
		addAnnotation
		  (getPropertyList_MdpropMdxNamedSets(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MdpropMdxNamedSets"
		   });
		addAnnotation
		  (getPropertyList_DbpropMsmdSubqueries(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropMsmdSubqueries"
		   });
		addAnnotation
		  (getPropertyList_DbpropMsmdAutoExists(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropMsmdAutoExists"
		   });
		addAnnotation
		  (getPropertyList_CustomData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CustomData"
		   });
		addAnnotation
		  (getPropertyList_DisablePrefetchFacts(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DisablePrefetchFacts"
		   });
		addAnnotation
		  (getPropertyList_UpdateIsolationLevel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UpdateIsolationLevel"
		   });
		addAnnotation
		  (getPropertyList_DbpropMsmdErrorMessageMode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropMsmdErrorMessageMode"
		   });
		addAnnotation
		  (getPropertyList_MdpropMdxDdlExtensions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MdpropMdxDdlExtensions"
		   });
		addAnnotation
		  (getPropertyList_ResponseEncoding(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ResponseEncoding"
		   });
		addAnnotation
		  (getPropertyList_MemoryLockingMode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MemoryLockingMode"
		   });
		addAnnotation
		  (getPropertyList_DbpropMsmdOptimizeResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropMsmdOptimizeResponse"
		   });
		addAnnotation
		  (getPropertyList_DbpropMsmdActivityID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropMsmdActivityID"
		   });
		addAnnotation
		  (getPropertyList_DbpropMsmdRequestID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropMsmdRequestID"
		   });
		addAnnotation
		  (getPropertyList_ReturnAffectedObjects(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ReturnAffectedObjects"
		   });
		addAnnotation
		  (getPropertyList_DbpropMsmdRequestMemoryLimit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DbpropMsmdRequestMemoryLimit"
		   });
		addAnnotation
		  (getPropertyList_ApplicationContext(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ApplicationContext"
		   });
		addAnnotation
		  (requestTypeTypeEEnum,
		   source,
		   new String[] {
			   "name", "RequestType_._type"
		   });
		addAnnotation
		  (requestTypeTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "RequestType_._type:Object",
			   "baseType", "RequestType_._type"
		   });
		addAnnotation
		  (responseEncodingTypeEEnum,
		   source,
		   new String[] {
			   "name", "ResponseEncoding_._type"
		   });
		addAnnotation
		  (responseEncodingTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "ResponseEncoding_._type:Object",
			   "baseType", "ResponseEncoding_._type"
		   });
		addAnnotation
		  (restrictionListTypeEClass,
		   source,
		   new String[] {
			   "name", "RestrictionList_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRestrictionListType_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##any",
			   "name", ":0",
			   "processing", "strict"
		   });
		addAnnotation
		  (restrictionsTypeEClass,
		   source,
		   new String[] {
			   "name", "Restrictions_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRestrictionsType_RestrictionList(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RestrictionList"
		   });
		addAnnotation
		  (returnEClass,
		   source,
		   new String[] {
			   "name", "return",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getReturn_Root(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "root",
			   "namespace", "urn:schemas-microsoft-com:xml-analysis:mddataset"
		   });
		addAnnotation
		  (getReturn_Root1(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "root",
			   "namespace", "urn:schemas-microsoft-com:xml-analysis:rowset"
		   });
		addAnnotation
		  (getReturn_Root2(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "root",
			   "namespace", "urn:schemas-microsoft-com:xml-analysis:empty"
		   });
		addAnnotation
		  (getReturn_Results(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "results",
			   "namespace", "http://schemas.microsoft.com/analysisservices/2003/xmla-multipleresults"
		   });
		addAnnotation
		  (returnTypeEClass,
		   source,
		   new String[] {
			   "name", "return_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getReturnType_Root(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "root",
			   "namespace", "urn:schemas-microsoft-com:xml-analysis:rowset"
		   });
		addAnnotation
		  (stateSupportTypeEEnum,
		   source,
		   new String[] {
			   "name", "StateSupport_._type"
		   });
		addAnnotation
		  (formatType1EEnum,
		   source,
		   new String[] {
			   "name", "Format_._1_._type"
		   });
		addAnnotation
		  (contentType1EEnum,
		   source,
		   new String[] {
			   "name", "Content_._1_._type"
		   });
		addAnnotation
		  (axisFormatTypeEEnum,
		   source,
		   new String[] {
			   "name", "AxisFormat_._type"
		   });
		addAnnotation
		  (mdxSupportTypeEEnum,
		   source,
		   new String[] {
			   "name", "MDXSupport_._type"
		   });
		addAnnotation
		  (providerTypeTypeEEnum,
		   source,
		   new String[] {
			   "name", "ProviderType_._type"
		   });
		addAnnotation
		  (visualModeTypeEEnum,
		   source,
		   new String[] {
			   "name", "VisualMode_._type"
		   });
		addAnnotation
		  (catalogLocationTypeEEnum,
		   source,
		   new String[] {
			   "name", "CatalogLocation_._type"
		   });
		addAnnotation
		  (dbpropConcatNullBehaviorTypeEEnum,
		   source,
		   new String[] {
			   "name", "DbpropConcatNullBehavior_._type"
		   });
		addAnnotation
		  (dbpropNullCollationTypeEEnum,
		   source,
		   new String[] {
			   "name", "DbpropNullCollation_._type"
		   });
		addAnnotation
		  (dbpropOutputParameterAvailableTypeEEnum,
		   source,
		   new String[] {
			   "name", "DbpropOutputParameterAvailable_._type"
		   });
		addAnnotation
		  (dbpropPersistentIdTypeTypeEEnum,
		   source,
		   new String[] {
			   "name", "DbpropPersistentIdType_._type"
		   });
		addAnnotation
		  (dbpropPrepareAbortBehaviorTypeEEnum,
		   source,
		   new String[] {
			   "name", "DbpropPrepareAbortBehavior_._type"
		   });
		addAnnotation
		  (dbpropPrepareCommitBehaviorTypeEEnum,
		   source,
		   new String[] {
			   "name", "DbpropPrepareCommitBehavior_._type"
		   });
		addAnnotation
		  (dbpropQuotedIdentifierCaseTypeEEnum,
		   source,
		   new String[] {
			   "name", "DbpropQuotedIdentifierCase_._type"
		   });
		addAnnotation
		  (mdpropAggregateCellUpdateTypeEEnum,
		   source,
		   new String[] {
			   "name", "MdpropAggregateCellUpdate_._type"
		   });
		addAnnotation
		  (mdpropFlatteningSupportTypeEEnum,
		   source,
		   new String[] {
			   "name", "MdpropFlatteningSupport_._type"
		   });
		addAnnotation
		  (mdpropMdxNonMeasureExpressionsTypeEEnum,
		   source,
		   new String[] {
			   "name", "MdpropMdxNonMeasureExpressions_._type"
		   });
		addAnnotation
		  (mdpropMdxRangeRowsetTypeEEnum,
		   source,
		   new String[] {
			   "name", "MdpropMdxRangeRowset_._type"
		   });
		addAnnotation
		  (mdpropMdxSlicerTypeEEnum,
		   source,
		   new String[] {
			   "name", "MdpropMdxSlicer_._type"
		   });
		addAnnotation
		  (mdxMissingMemberModeTypeEEnum,
		   source,
		   new String[] {
			   "name", "MdxMissingMemberMode_._type"
		   });
		addAnnotation
		  (dbpropMsmdMDXCompatibilityTypeEEnum,
		   source,
		   new String[] {
			   "name", "DbpropMsmdMDXCompatibility_._type"
		   });
		addAnnotation
		  (dbpropMsmdCompareCaseSensitiveStringFlagsTypeEEnum,
		   source,
		   new String[] {
			   "name", "DbpropMsmdCompareCaseSensitiveStringFlags_._type"
		   });
		addAnnotation
		  (securedCellValueTypeEEnum,
		   source,
		   new String[] {
			   "name", "SecuredCellValue_._type"
		   });
		addAnnotation
		  (safetyOptionsTypeEEnum,
		   source,
		   new String[] {
			   "name", "SafetyOptions_._type"
		   });
		addAnnotation
		  (dialectTypeEEnum,
		   source,
		   new String[] {
			   "name", "Dialect_._type"
		   });
		addAnnotation
		  (sqlQueryModeTypeEEnum,
		   source,
		   new String[] {
			   "name", "SQLQueryMode_._type"
		   });
		addAnnotation
		  (mdxMissingMemberModeType1EEnum,
		   source,
		   new String[] {
			   "name", "MdxMissingMemberMode_._1_._type"
		   });
		addAnnotation
		  (dbpropMsmdSubqueriesTypeEEnum,
		   source,
		   new String[] {
			   "name", "DbpropMsmdSubqueries_._type"
		   });
		addAnnotation
		  (dbpropMsmdAutoExistsTypeEEnum,
		   source,
		   new String[] {
			   "name", "DbpropMsmdAutoExists_._type"
		   });
		addAnnotation
		  (updateIsolationLevelTypeEEnum,
		   source,
		   new String[] {
			   "name", "UpdateIsolationLevel_._type"
		   });
		addAnnotation
		  (memoryLockingModeTypeEEnum,
		   source,
		   new String[] {
			   "name", "MemoryLockingMode_._type"
		   });
		addAnnotation
		  (visibilityTypeEEnum,
		   source,
		   new String[] {
			   "name", "Visibility_._type"
		   });
		addAnnotation
		  (annotationEClass,
		   source,
		   new String[] {
			   "name", "Annotation",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAnnotation_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Name"
		   });
		addAnnotation
		  (getAnnotation_Visibility(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Visibility"
		   });
		addAnnotation
		  (getAnnotation_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Value"
		   });
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
		  (bindingEClass,
		   source,
		   new String[] {
			   "name", "Binding",
			   "kind", "empty"
		   });
		addAnnotation
		  (eventSessionTypeEClass,
		   source,
		   new String[] {
			   "name", "event_session_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEventSessionType_TemplateCategory(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "templateCategory"
		   });
		addAnnotation
		  (getEventSessionType_TemplateName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "templateName"
		   });
		addAnnotation
		  (getEventSessionType_TemplateDescription(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "templateDescription"
		   });
		addAnnotation
		  (getEventSessionType_Event(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "event"
		   });
		addAnnotation
		  (getEventSessionType_Target(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "target"
		   });
		addAnnotation
		  (getEventSessionType_DispatchLatency(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dispatchLatency"
		   });
		addAnnotation
		  (getEventSessionType_EventRetentionMode(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "eventRetentionMode"
		   });
		addAnnotation
		  (getEventSessionType_MaxEventSize(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "maxEventSize"
		   });
		addAnnotation
		  (getEventSessionType_MaxMemory(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "maxMemory"
		   });
		addAnnotation
		  (getEventSessionType_MemoryPartitionMode(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "memoryPartitionMode"
		   });
		addAnnotation
		  (getEventSessionType_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (getEventSessionType_TrackCausality(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "trackCausality"
		   });
		addAnnotation
		  (retentionModesEEnum,
		   source,
		   new String[] {
			   "name", "retentionModes"
		   });
		addAnnotation
		  (partitionModesEEnum,
		   source,
		   new String[] {
			   "name", "partitionModes"
		   });
	}

} //XmlaPackageImpl
