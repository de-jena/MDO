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
import org.eclipse.daanse.xmla.model.ecore.xmla.Annotations;
import org.eclipse.daanse.xmla.model.ecore.xmla.AxisFormat;
import org.eclipse.daanse.xmla.model.ecore.xmla.Binding;
import org.eclipse.daanse.xmla.model.ecore.xmla.CatalogLocation;
import org.eclipse.daanse.xmla.model.ecore.xmla.Content;
import org.eclipse.daanse.xmla.model.ecore.xmla.DbpropConcatNullBehavior;
import org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdAutoExists;
import org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdCompareCaseSensitiveStringFlags;
import org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdMDXCompatibility;
import org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdSubqueries;
import org.eclipse.daanse.xmla.model.ecore.xmla.DbpropNullCollation;
import org.eclipse.daanse.xmla.model.ecore.xmla.DbpropOutputParameterAvailable;
import org.eclipse.daanse.xmla.model.ecore.xmla.DbpropPersistentIdType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DbpropPrepareAbortBehavior;
import org.eclipse.daanse.xmla.model.ecore.xmla.DbpropPrepareCommitBehavior;
import org.eclipse.daanse.xmla.model.ecore.xmla.DbpropQuotedIdentifierCase;
import org.eclipse.daanse.xmla.model.ecore.xmla.Dialect;
import org.eclipse.daanse.xmla.model.ecore.xmla.Discover;
import org.eclipse.daanse.xmla.model.ecore.xmla.DiscoverResponse;
import org.eclipse.daanse.xmla.model.ecore.xmla.EventSession;
import org.eclipse.daanse.xmla.model.ecore.xmla.Format;
import org.eclipse.daanse.xmla.model.ecore.xmla.MDXSupport;
import org.eclipse.daanse.xmla.model.ecore.xmla.MdpropAggregateCellUpdate;
import org.eclipse.daanse.xmla.model.ecore.xmla.MdpropFlatteningSupport;
import org.eclipse.daanse.xmla.model.ecore.xmla.MdpropMdxNonMeasureExpressions;
import org.eclipse.daanse.xmla.model.ecore.xmla.MdpropMdxRangeRowset;
import org.eclipse.daanse.xmla.model.ecore.xmla.MdpropMdxSlicer;
import org.eclipse.daanse.xmla.model.ecore.xmla.MdxMissingMemberMode;
import org.eclipse.daanse.xmla.model.ecore.xmla.MemoryLockingMode;
import org.eclipse.daanse.xmla.model.ecore.xmla.PartitionModes;
import org.eclipse.daanse.xmla.model.ecore.xmla.Properties;
import org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList;
import org.eclipse.daanse.xmla.model.ecore.xmla.ProviderType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Request;
import org.eclipse.daanse.xmla.model.ecore.xmla.ResponseEncoding;
import org.eclipse.daanse.xmla.model.ecore.xmla.RestrictionList;
import org.eclipse.daanse.xmla.model.ecore.xmla.Restrictions;
import org.eclipse.daanse.xmla.model.ecore.xmla.RetentionModes;
import org.eclipse.daanse.xmla.model.ecore.xmla.Return;
import org.eclipse.daanse.xmla.model.ecore.xmla.SQLQueryMode;
import org.eclipse.daanse.xmla.model.ecore.xmla.SafetyOptions;
import org.eclipse.daanse.xmla.model.ecore.xmla.SecuredCellValue;
import org.eclipse.daanse.xmla.model.ecore.xmla.StateSupport;
import org.eclipse.daanse.xmla.model.ecore.xmla.UpdateIsolationLevel;
import org.eclipse.daanse.xmla.model.ecore.xmla.Visibility;
import org.eclipse.daanse.xmla.model.ecore.xmla.VisualMode;
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
	private EClass discoverResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discoverEClass = null;

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
	private EClass propertyListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restrictionListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restrictionsEClass = null;

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
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationsEClass = null;

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
	private EClass eventSessionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum requestEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum responseEncodingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stateSupportEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum formatEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum axisFormatEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mdxSupportEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum providerTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visualModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum catalogLocationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dbpropConcatNullBehaviorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dbpropNullCollationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dbpropOutputParameterAvailableEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dbpropPersistentIdTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dbpropPrepareAbortBehaviorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dbpropPrepareCommitBehaviorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dbpropQuotedIdentifierCaseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mdpropAggregateCellUpdateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mdpropFlatteningSupportEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mdpropMdxNonMeasureExpressionsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mdpropMdxRangeRowsetEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mdpropMdxSlicerEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mdxMissingMemberModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dbpropMsmdMDXCompatibilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dbpropMsmdCompareCaseSensitiveStringFlagsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum securedCellValueEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum safetyOptionsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dialectEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sqlQueryModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dbpropMsmdSubqueriesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dbpropMsmdAutoExistsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum updateIsolationLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum memoryLockingModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visibilityEEnum = null;

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
	public EClass getDiscoverResponse() {
		return discoverResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscoverResponse_Return() {
		return (EReference)discoverResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscover() {
		return discoverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscover_RequestType() {
		return (EAttribute)discoverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscover_Restrictions() {
		return (EReference)discoverEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscover_Properties() {
		return (EReference)discoverEClass.getEStructuralFeatures().get(2);
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
	public EClass getRestrictionList() {
		return restrictionListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRestrictionList_Any() {
		return (EAttribute)restrictionListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestrictions() {
		return restrictionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestrictions_RestrictionList() {
		return (EReference)restrictionsEClass.getEStructuralFeatures().get(0);
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
	public EClass getAnnotations() {
		return annotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotations_Annotation() {
		return (EReference)annotationsEClass.getEStructuralFeatures().get(0);
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
	public EClass getEventSession() {
		return eventSessionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventSession_TemplateCategory() {
		return (EAttribute)eventSessionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventSession_TemplateName() {
		return (EAttribute)eventSessionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventSession_TemplateDescription() {
		return (EAttribute)eventSessionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventSession_Event() {
		return (EReference)eventSessionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventSession_Target() {
		return (EReference)eventSessionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventSession_DispatchLatency() {
		return (EAttribute)eventSessionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventSession_EventRetentionMode() {
		return (EAttribute)eventSessionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventSession_MaxEventSize() {
		return (EAttribute)eventSessionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventSession_MaxMemory() {
		return (EAttribute)eventSessionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventSession_MemoryPartitionMode() {
		return (EAttribute)eventSessionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventSession_Name() {
		return (EAttribute)eventSessionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventSession_TrackCausality() {
		return (EAttribute)eventSessionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRequest() {
		return requestEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResponseEncoding() {
		return responseEncodingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStateSupport() {
		return stateSupportEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFormat() {
		return formatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContent() {
		return contentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAxisFormat() {
		return axisFormatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMDXSupport() {
		return mdxSupportEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProviderType() {
		return providerTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisualMode() {
		return visualModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCatalogLocation() {
		return catalogLocationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDbpropConcatNullBehavior() {
		return dbpropConcatNullBehaviorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDbpropNullCollation() {
		return dbpropNullCollationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDbpropOutputParameterAvailable() {
		return dbpropOutputParameterAvailableEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDbpropPersistentIdType() {
		return dbpropPersistentIdTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDbpropPrepareAbortBehavior() {
		return dbpropPrepareAbortBehaviorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDbpropPrepareCommitBehavior() {
		return dbpropPrepareCommitBehaviorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDbpropQuotedIdentifierCase() {
		return dbpropQuotedIdentifierCaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMdpropAggregateCellUpdate() {
		return mdpropAggregateCellUpdateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMdpropFlatteningSupport() {
		return mdpropFlatteningSupportEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMdpropMdxNonMeasureExpressions() {
		return mdpropMdxNonMeasureExpressionsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMdpropMdxRangeRowset() {
		return mdpropMdxRangeRowsetEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMdpropMdxSlicer() {
		return mdpropMdxSlicerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMdxMissingMemberMode() {
		return mdxMissingMemberModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDbpropMsmdMDXCompatibility() {
		return dbpropMsmdMDXCompatibilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDbpropMsmdCompareCaseSensitiveStringFlags() {
		return dbpropMsmdCompareCaseSensitiveStringFlagsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSecuredCellValue() {
		return securedCellValueEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSafetyOptions() {
		return safetyOptionsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDialect() {
		return dialectEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSQLQueryMode() {
		return sqlQueryModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDbpropMsmdSubqueries() {
		return dbpropMsmdSubqueriesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDbpropMsmdAutoExists() {
		return dbpropMsmdAutoExistsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUpdateIsolationLevel() {
		return updateIsolationLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMemoryLockingMode() {
		return memoryLockingModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisibility() {
		return visibilityEEnum;
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
		discoverResponseEClass = createEClass(DISCOVER_RESPONSE);
		createEReference(discoverResponseEClass, DISCOVER_RESPONSE__RETURN);

		discoverEClass = createEClass(DISCOVER);
		createEAttribute(discoverEClass, DISCOVER__REQUEST_TYPE);
		createEReference(discoverEClass, DISCOVER__RESTRICTIONS);
		createEReference(discoverEClass, DISCOVER__PROPERTIES);

		propertiesEClass = createEClass(PROPERTIES);
		createEReference(propertiesEClass, PROPERTIES__PROPERTY_LIST);

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

		restrictionListEClass = createEClass(RESTRICTION_LIST);
		createEAttribute(restrictionListEClass, RESTRICTION_LIST__ANY);

		restrictionsEClass = createEClass(RESTRICTIONS);
		createEReference(restrictionsEClass, RESTRICTIONS__RESTRICTION_LIST);

		returnEClass = createEClass(RETURN);
		createEReference(returnEClass, RETURN__ROOT);
		createEReference(returnEClass, RETURN__ROOT1);
		createEReference(returnEClass, RETURN__ROOT2);
		createEReference(returnEClass, RETURN__RESULTS);

		annotationEClass = createEClass(ANNOTATION);
		createEAttribute(annotationEClass, ANNOTATION__NAME);
		createEAttribute(annotationEClass, ANNOTATION__VISIBILITY);
		createEReference(annotationEClass, ANNOTATION__VALUE);

		annotationsEClass = createEClass(ANNOTATIONS);
		createEReference(annotationsEClass, ANNOTATIONS__ANNOTATION);

		bindingEClass = createEClass(BINDING);

		eventSessionEClass = createEClass(EVENT_SESSION);
		createEAttribute(eventSessionEClass, EVENT_SESSION__TEMPLATE_CATEGORY);
		createEAttribute(eventSessionEClass, EVENT_SESSION__TEMPLATE_NAME);
		createEAttribute(eventSessionEClass, EVENT_SESSION__TEMPLATE_DESCRIPTION);
		createEReference(eventSessionEClass, EVENT_SESSION__EVENT);
		createEReference(eventSessionEClass, EVENT_SESSION__TARGET);
		createEAttribute(eventSessionEClass, EVENT_SESSION__DISPATCH_LATENCY);
		createEAttribute(eventSessionEClass, EVENT_SESSION__EVENT_RETENTION_MODE);
		createEAttribute(eventSessionEClass, EVENT_SESSION__MAX_EVENT_SIZE);
		createEAttribute(eventSessionEClass, EVENT_SESSION__MAX_MEMORY);
		createEAttribute(eventSessionEClass, EVENT_SESSION__MEMORY_PARTITION_MODE);
		createEAttribute(eventSessionEClass, EVENT_SESSION__NAME);
		createEAttribute(eventSessionEClass, EVENT_SESSION__TRACK_CAUSALITY);

		// Create enums
		requestEEnum = createEEnum(REQUEST);
		responseEncodingEEnum = createEEnum(RESPONSE_ENCODING);
		stateSupportEEnum = createEEnum(STATE_SUPPORT);
		formatEEnum = createEEnum(FORMAT);
		contentEEnum = createEEnum(CONTENT);
		axisFormatEEnum = createEEnum(AXIS_FORMAT);
		mdxSupportEEnum = createEEnum(MDX_SUPPORT);
		providerTypeEEnum = createEEnum(PROVIDER_TYPE);
		visualModeEEnum = createEEnum(VISUAL_MODE);
		catalogLocationEEnum = createEEnum(CATALOG_LOCATION);
		dbpropConcatNullBehaviorEEnum = createEEnum(DBPROP_CONCAT_NULL_BEHAVIOR);
		dbpropNullCollationEEnum = createEEnum(DBPROP_NULL_COLLATION);
		dbpropOutputParameterAvailableEEnum = createEEnum(DBPROP_OUTPUT_PARAMETER_AVAILABLE);
		dbpropPersistentIdTypeEEnum = createEEnum(DBPROP_PERSISTENT_ID_TYPE);
		dbpropPrepareAbortBehaviorEEnum = createEEnum(DBPROP_PREPARE_ABORT_BEHAVIOR);
		dbpropPrepareCommitBehaviorEEnum = createEEnum(DBPROP_PREPARE_COMMIT_BEHAVIOR);
		dbpropQuotedIdentifierCaseEEnum = createEEnum(DBPROP_QUOTED_IDENTIFIER_CASE);
		mdpropAggregateCellUpdateEEnum = createEEnum(MDPROP_AGGREGATE_CELL_UPDATE);
		mdpropFlatteningSupportEEnum = createEEnum(MDPROP_FLATTENING_SUPPORT);
		mdpropMdxNonMeasureExpressionsEEnum = createEEnum(MDPROP_MDX_NON_MEASURE_EXPRESSIONS);
		mdpropMdxRangeRowsetEEnum = createEEnum(MDPROP_MDX_RANGE_ROWSET);
		mdpropMdxSlicerEEnum = createEEnum(MDPROP_MDX_SLICER);
		mdxMissingMemberModeEEnum = createEEnum(MDX_MISSING_MEMBER_MODE);
		dbpropMsmdMDXCompatibilityEEnum = createEEnum(DBPROP_MSMD_MDX_COMPATIBILITY);
		dbpropMsmdCompareCaseSensitiveStringFlagsEEnum = createEEnum(DBPROP_MSMD_COMPARE_CASE_SENSITIVE_STRING_FLAGS);
		securedCellValueEEnum = createEEnum(SECURED_CELL_VALUE);
		safetyOptionsEEnum = createEEnum(SAFETY_OPTIONS);
		dialectEEnum = createEEnum(DIALECT);
		sqlQueryModeEEnum = createEEnum(SQL_QUERY_MODE);
		dbpropMsmdSubqueriesEEnum = createEEnum(DBPROP_MSMD_SUBQUERIES);
		dbpropMsmdAutoExistsEEnum = createEEnum(DBPROP_MSMD_AUTO_EXISTS);
		updateIsolationLevelEEnum = createEEnum(UPDATE_ISOLATION_LEVEL);
		memoryLockingModeEEnum = createEEnum(MEMORY_LOCKING_MODE);
		visibilityEEnum = createEEnum(VISIBILITY);
		retentionModesEEnum = createEEnum(RETENTION_MODES);
		partitionModesEEnum = createEEnum(PARTITION_MODES);
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
		initEClass(discoverResponseEClass, DiscoverResponse.class, "DiscoverResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiscoverResponse_Return(), this.getReturn(), null, "return", null, 0, 1, DiscoverResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(discoverEClass, Discover.class, "Discover", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiscover_RequestType(), this.getRequest(), "requestType", null, 1, 1, Discover.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiscover_Restrictions(), this.getRestrictions(), null, "restrictions", null, 1, 1, Discover.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiscover_Properties(), this.getProperties(), null, "properties", null, 1, 1, Discover.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertiesEClass, Properties.class, "Properties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProperties_PropertyList(), this.getPropertyList(), null, "propertyList", null, 0, 1, Properties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyListEClass, PropertyList.class, "PropertyList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyList_DataSourceInfo(), ecorePackage.getEString(), "dataSourceInfo", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_Timeout(), ecorePackage.getEBigInteger(), "timeout", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_UserName(), ecorePackage.getEString(), "userName", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_Password(), ecorePackage.getEString(), "password", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_LocaleIdentifier(), ecorePackage.getEBigInteger(), "localeIdentifier", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_Catalog(), ecorePackage.getEString(), "catalog", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_StateSupport(), this.getStateSupport(), "stateSupport", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_Content(), this.getContent(), "content", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_Format(), this.getFormat(), "format", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_AxisFormat(), this.getAxisFormat(), "axisFormat", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_BeginRange(), ecorePackage.getEBigInteger(), "beginRange", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_EndRange(), ecorePackage.getEBigInteger(), "endRange", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MDXSupport(), this.getMDXSupport(), "mDXSupport", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_ProviderName(), ecorePackage.getEString(), "providerName", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_ProviderVersion(), ecorePackage.getEString(), "providerVersion", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DBMSVersion(), ecorePackage.getEString(), "dBMSVersion", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_ProviderType(), this.getProviderType(), "providerType", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_ShowHiddenCubes(), ecorePackage.getEBoolean(), "showHiddenCubes", null, 1, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_SQLSupport(), ecorePackage.getEBigInteger(), "sQLSupport", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_TransactionDDL(), ecorePackage.getEBigInteger(), "transactionDDL", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MaximumRows(), ecorePackage.getEBigInteger(), "maximumRows", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_Roles(), ecorePackage.getEString(), "roles", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_VisualMode(), this.getVisualMode(), "visualMode", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_EffectiveRoles(), ecorePackage.getEString(), "effectiveRoles", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_EffectiveUserName(), ecorePackage.getEString(), "effectiveUserName", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_ServerName(), ecorePackage.getEString(), "serverName", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_CatalogLocation(), this.getCatalogLocation(), "catalogLocation", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropCatalogTerm(), ecorePackage.getEString(), "dbpropCatalogTerm", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropCatalogUsage(), ecorePackage.getEBigInteger(), "dbpropCatalogUsage", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropColumnDefinition(), ecorePackage.getEBigInteger(), "dbpropColumnDefinition", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropConcatNullBehavior(), this.getDbpropConcatNullBehavior(), "dbpropConcatNullBehavior", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		initEAttribute(getPropertyList_DbpropNullCollation(), this.getDbpropNullCollation(), "dbpropNullCollation", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropOrderByColumnsInSelect(), ecorePackage.getEBoolean(), "dbpropOrderByColumnsInSelect", null, 1, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropOutputParameterAvailable(), this.getDbpropOutputParameterAvailable(), "dbpropOutputParameterAvailable", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropPersistentIdType(), this.getDbpropPersistentIdType(), "dbpropPersistentIdType", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropPrepareAbortBehavior(), this.getDbpropPrepareAbortBehavior(), "dbpropPrepareAbortBehavior", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropPrepareCommitBehavior(), this.getDbpropPrepareCommitBehavior(), "dbpropPrepareCommitBehavior", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropProcedureTerm(), ecorePackage.getEString(), "dbpropProcedureTerm", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropQuotedIdentifierCase(), this.getDbpropQuotedIdentifierCase(), "dbpropQuotedIdentifierCase", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropSchemaUsage(), ecorePackage.getEBigInteger(), "dbpropSchemaUsage", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropSqlSupport(), ecorePackage.getEBigInteger(), "dbpropSqlSupport", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropSubqueries(), ecorePackage.getEBigInteger(), "dbpropSubqueries", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropSupportedTxnDdl(), ecorePackage.getEBigInteger(), "dbpropSupportedTxnDdl", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MdpropMdxSubqueries(), ecorePackage.getEBigInteger(), "mdpropMdxSubqueries", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropSupportedTxnIsoLevels(), ecorePackage.getEBigInteger(), "dbpropSupportedTxnIsoLevels", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropSupportedTxnIsoRetain(), ecorePackage.getEBigInteger(), "dbpropSupportedTxnIsoRetain", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropTableTerm(), ecorePackage.getEString(), "dbpropTableTerm", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MdpropAggregateCellUpdate(), this.getMdpropAggregateCellUpdate(), "mdpropAggregateCellUpdate", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MdpropAxes(), ecorePackage.getEBigInteger(), "mdpropAxes", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MdpropFlatteningSupport(), this.getMdpropFlatteningSupport(), "mdpropFlatteningSupport", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MdpropMdxCaseSupport(), ecorePackage.getEBigInteger(), "mdpropMdxCaseSupport", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MdpropMdxDescFlags(), ecorePackage.getEBigInteger(), "mdpropMdxDescFlags", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MdpropMdxDrillFunctions(), ecorePackage.getEBigInteger(), "mdpropMdxDrillFunctions", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MdpropMdxFormulas(), ecorePackage.getEBigInteger(), "mdpropMdxFormulas", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MdpropMdxJoinCubes(), ecorePackage.getEBigInteger(), "mdpropMdxJoinCubes", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MdpropMdxMemberFunctions(), ecorePackage.getEBigInteger(), "mdpropMdxMemberFunctions", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MdpropMdxNonMeasureExpressions(), this.getMdpropMdxNonMeasureExpressions(), "mdpropMdxNonMeasureExpressions", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MdpropMdxNumericFunctions(), ecorePackage.getEBigInteger(), "mdpropMdxNumericFunctions", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MdpropMdxObjQualification(), ecorePackage.getEBigInteger(), "mdpropMdxObjQualification", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MdpropMdxOuterReference(), ecorePackage.getEBigInteger(), "mdpropMdxOuterReference", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MdpropMdxQueryByProperty(), ecorePackage.getEBoolean(), "mdpropMdxQueryByProperty", null, 1, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MdpropMdxRangeRowset(), this.getMdpropMdxRangeRowset(), "mdpropMdxRangeRowset", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MdpropMdxSetFunctions(), ecorePackage.getEBigInteger(), "mdpropMdxSetFunctions", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MdpropMdxSlicer(), this.getMdpropMdxSlicer(), "mdpropMdxSlicer", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MdpropMdxStringCompop(), ecorePackage.getEBigInteger(), "mdpropMdxStringCompop", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MdpropNamedLevels(), ecorePackage.getEBigInteger(), "mdpropNamedLevels", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropMsmdMDXCompatibility(), this.getDbpropMsmdMDXCompatibility(), "dbpropMsmdMDXCompatibility", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropMsmdSQLCompatibility(), ecorePackage.getEBigInteger(), "dbpropMsmdSQLCompatibility", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropMsmdMDXUniqueNameStyle(), ecorePackage.getEBigInteger(), "dbpropMsmdMDXUniqueNameStyle", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropMsmdCachePolicy(), ecorePackage.getEBigInteger(), "dbpropMsmdCachePolicy", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropMsmdCacheRatio(), ecorePackage.getEBigInteger(), "dbpropMsmdCacheRatio", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropMsmdCacheMode(), ecorePackage.getEBigInteger(), "dbpropMsmdCacheMode", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropMsmdCompareCaseSensitiveStringFlags(), this.getDbpropMsmdCompareCaseSensitiveStringFlags(), "dbpropMsmdCompareCaseSensitiveStringFlags", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropMsmdCompareCaseNotSensitiveStringFlags(), ecorePackage.getEBigInteger(), "dbpropMsmdCompareCaseNotSensitiveStringFlags", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropMsmdFlattened2(), ecorePackage.getEBoolean(), "dbpropMsmdFlattened2", null, 1, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropInitMode(), ecorePackage.getEBigInteger(), "dbpropInitMode", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_SspropInitAppName(), ecorePackage.getEString(), "sspropInitAppName", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_SspropInitWsid(), ecorePackage.getEString(), "sspropInitWsid", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_SspropInitPacketsize(), ecorePackage.getEBigInteger(), "sspropInitPacketsize", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_ReadOnlySession(), ecorePackage.getEBigInteger(), "readOnlySession", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_SecuredCellValue(), this.getSecuredCellValue(), "securedCellValue", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_NonEmptyThreshold(), ecorePackage.getEBigInteger(), "nonEmptyThreshold", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_SafetyOptions(), this.getSafetyOptions(), "safetyOptions", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropMsmdCacheRatio2(), theXMLTypePackage.getDouble(), "dbpropMsmdCacheRatio2", null, 1, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropMsmdUseFormulaCache(), ecorePackage.getEString(), "dbpropMsmdUseFormulaCache", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropMsmdDynamicDebugLimit(), ecorePackage.getEBigInteger(), "dbpropMsmdDynamicDebugLimit", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropMsmdDebugMode(), ecorePackage.getEString(), "dbpropMsmdDebugMode", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_Dialect(), this.getDialect(), "dialect", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_ImpactAnalysis(), ecorePackage.getEBoolean(), "impactAnalysis", null, 1, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_SQLQueryMode(), this.getSQLQueryMode(), "sQLQueryMode", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_ClientProcessID(), ecorePackage.getEBigInteger(), "clientProcessID", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_Cube(), ecorePackage.getEString(), "cube", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_ReturnCellProperties(), ecorePackage.getEBoolean(), "returnCellProperties", null, 1, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_CommitTimeout(), ecorePackage.getEBigInteger(), "commitTimeout", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_ForceCommitTimeout(), ecorePackage.getEBigInteger(), "forceCommitTimeout", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_ExecutionMode(), ecorePackage.getEString(), "executionMode", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_RealTimeOlap(), ecorePackage.getEBoolean(), "realTimeOlap", null, 1, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MdxMissingMemberMode(), this.getMdxMissingMemberMode(), "mdxMissingMemberMode", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MdpropMdxNamedSets(), ecorePackage.getEBigInteger(), "mdpropMdxNamedSets", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropMsmdSubqueries(), this.getDbpropMsmdSubqueries(), "dbpropMsmdSubqueries", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropMsmdAutoExists(), this.getDbpropMsmdAutoExists(), "dbpropMsmdAutoExists", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_CustomData(), ecorePackage.getEString(), "customData", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DisablePrefetchFacts(), ecorePackage.getEBoolean(), "disablePrefetchFacts", null, 1, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_UpdateIsolationLevel(), this.getUpdateIsolationLevel(), "updateIsolationLevel", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropMsmdErrorMessageMode(), ecorePackage.getEBigInteger(), "dbpropMsmdErrorMessageMode", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MdpropMdxDdlExtensions(), ecorePackage.getEBigInteger(), "mdpropMdxDdlExtensions", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_ResponseEncoding(), this.getResponseEncoding(), "responseEncoding", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_MemoryLockingMode(), this.getMemoryLockingMode(), "memoryLockingMode", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropMsmdOptimizeResponse(), ecorePackage.getEBigInteger(), "dbpropMsmdOptimizeResponse", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropMsmdActivityID(), ecorePackage.getEString(), "dbpropMsmdActivityID", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropMsmdRequestID(), ecorePackage.getEString(), "dbpropMsmdRequestID", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_ReturnAffectedObjects(), ecorePackage.getEBigInteger(), "returnAffectedObjects", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_DbpropMsmdRequestMemoryLimit(), ecorePackage.getEBigInteger(), "dbpropMsmdRequestMemoryLimit", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyList_ApplicationContext(), ecorePackage.getEString(), "applicationContext", null, 0, 1, PropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restrictionListEClass, RestrictionList.class, "RestrictionList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRestrictionList_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, RestrictionList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restrictionsEClass, Restrictions.class, "Restrictions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRestrictions_RestrictionList(), this.getRestrictionList(), null, "restrictionList", null, 0, 1, Restrictions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnEClass, Return.class, "Return", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturn_Root(), theXmla_mddatasetPackage.getMddataset(), null, "root", null, 0, 1, Return.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReturn_Root1(), theXmla_rowsetPackage.getRowset(), null, "root1", null, 0, 1, Return.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReturn_Root2(), theXmla_emptyPackage.getEmptyresult(), null, "root2", null, 0, 1, Return.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReturn_Results(), theXmla_multipleresultsPackage.getResultsType(), null, "results", null, 0, 1, Return.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotation_Name(), ecorePackage.getEString(), "name", null, 1, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotation_Visibility(), this.getVisibility(), "visibility", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotation_Value(), ecorePackage.getEObject(), null, "value", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationsEClass, Annotations.class, "Annotations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotations_Annotation(), this.getAnnotation(), null, "annotation", null, 0, -1, Annotations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingEClass, Binding.class, "Binding", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventSessionEClass, EventSession.class, "EventSession", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventSession_TemplateCategory(), ecorePackage.getEString(), "templateCategory", null, 0, 1, EventSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventSession_TemplateName(), ecorePackage.getEString(), "templateName", null, 0, 1, EventSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventSession_TemplateDescription(), ecorePackage.getEString(), "templateDescription", null, 0, 1, EventSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventSession_Event(), ecorePackage.getEObject(), null, "event", null, 0, -1, EventSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventSession_Target(), ecorePackage.getEObject(), null, "target", null, 0, -1, EventSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventSession_DispatchLatency(), theXMLTypePackage.getUnsignedInt(), "dispatchLatency", "30", 1, 1, EventSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventSession_EventRetentionMode(), this.getRetentionModes(), "eventRetentionMode", "allowSingleEventLoss", 0, 1, EventSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventSession_MaxEventSize(), theXMLTypePackage.getUnsignedInt(), "maxEventSize", "0", 1, 1, EventSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventSession_MaxMemory(), theXMLTypePackage.getUnsignedLong(), "maxMemory", "4", 0, 1, EventSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventSession_MemoryPartitionMode(), this.getPartitionModes(), "memoryPartitionMode", "none", 0, 1, EventSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventSession_Name(), ecorePackage.getEString(), "name", null, 1, 1, EventSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventSession_TrackCausality(), ecorePackage.getEBoolean(), "trackCausality", "false", 1, 1, EventSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(requestEEnum, Request.class, "Request");
		addEEnumLiteral(requestEEnum, Request.DBSCHEMACATALOGS);
		addEEnumLiteral(requestEEnum, Request.MDSCHEMACUBES);
		addEEnumLiteral(requestEEnum, Request.MDSCHEMADIMENSIONS);
		addEEnumLiteral(requestEEnum, Request.MDSCHEMAHIERARCHIES);
		addEEnumLiteral(requestEEnum, Request.MDSCHEMALEVELS);
		addEEnumLiteral(requestEEnum, Request.MDSCHEMAMEASURES);
		addEEnumLiteral(requestEEnum, Request.MDSCHEMAPROPERTIES);
		addEEnumLiteral(requestEEnum, Request.MDSCHEMAMEMBERS);
		addEEnumLiteral(requestEEnum, Request.MDSCHEMAACTIONS);
		addEEnumLiteral(requestEEnum, Request.MDSCHEMASETS);
		addEEnumLiteral(requestEEnum, Request.DISCOVERINSTANCES);
		addEEnumLiteral(requestEEnum, Request.MDSCHEMAKPIS);
		addEEnumLiteral(requestEEnum, Request.MDSCHEMAMEASUREGROUPS);
		addEEnumLiteral(requestEEnum, Request.MDSCHEMAMEASUREGROUPDIMENSIONS);
		addEEnumLiteral(requestEEnum, Request.DISCOVERPROPERTIES);
		addEEnumLiteral(requestEEnum, Request.DISCOVERLITERALS);
		addEEnumLiteral(requestEEnum, Request.DISCOVERSCHEMAROWSETS);
		addEEnumLiteral(requestEEnum, Request.DISCOVERKEYWORDS);
		addEEnumLiteral(requestEEnum, Request.DBSCHEMATABLES);
		addEEnumLiteral(requestEEnum, Request.DBSCHEMACOLUMNS);
		addEEnumLiteral(requestEEnum, Request.DBSCHEMAPROVIDERTYPES);
		addEEnumLiteral(requestEEnum, Request.MDSCHEMAINPUTDATASOURCES);
		addEEnumLiteral(requestEEnum, Request.DMSCHEMAMININGSERVICES);
		addEEnumLiteral(requestEEnum, Request.DMSCHEMAMININGSERVICEPARAMETERS);
		addEEnumLiteral(requestEEnum, Request.DMSCHEMAMININGFUNCTIONS);
		addEEnumLiteral(requestEEnum, Request.DMSCHEMAMININGMODELCONTENT);
		addEEnumLiteral(requestEEnum, Request.DMSCHEMAMININGMODELXML);
		addEEnumLiteral(requestEEnum, Request.DMSCHEMAMININGMODELCONTENTPMML);
		addEEnumLiteral(requestEEnum, Request.DMSCHEMAMININGMODELS);
		addEEnumLiteral(requestEEnum, Request.DMSCHEMAMININGCOLUMNS);
		addEEnumLiteral(requestEEnum, Request.DMSCHEMAMININGSTRUCTURES);
		addEEnumLiteral(requestEEnum, Request.DMSCHEMAMININGSTRUCTURECOLUMNS);
		addEEnumLiteral(requestEEnum, Request.DISCOVERDATASOURCES);
		addEEnumLiteral(requestEEnum, Request.DISCOVERENUMERATORS);
		addEEnumLiteral(requestEEnum, Request.DISCOVERXMLMETADATA);
		addEEnumLiteral(requestEEnum, Request.DISCOVERTRACES);
		addEEnumLiteral(requestEEnum, Request.DISCOVERTRACEDEFINITIONPROVIDERINFO);
		addEEnumLiteral(requestEEnum, Request.DISCOVERTRACECOLUMNS);
		addEEnumLiteral(requestEEnum, Request.DISCOVERTRACEEVENTCATEGORIES);
		addEEnumLiteral(requestEEnum, Request.DISCOVERMEMORYUSAGE);
		addEEnumLiteral(requestEEnum, Request.DISCOVERMEMORYGRANT);
		addEEnumLiteral(requestEEnum, Request.DISCOVERLOCKS);
		addEEnumLiteral(requestEEnum, Request.DISCOVERCONNECTIONS);
		addEEnumLiteral(requestEEnum, Request.DISCOVERSESSIONS);
		addEEnumLiteral(requestEEnum, Request.DISCOVERJOBS);
		addEEnumLiteral(requestEEnum, Request.DISCOVERTRANSACTIONS);
		addEEnumLiteral(requestEEnum, Request.DISCOVERDBCONNECTIONS);
		addEEnumLiteral(requestEEnum, Request.DISCOVERMASTERKEY);
		addEEnumLiteral(requestEEnum, Request.DISCOVERPERFORMANCECOUNTERS);
		addEEnumLiteral(requestEEnum, Request.DISCOVERLOCATIONS);
		addEEnumLiteral(requestEEnum, Request.DISCOVERPARTITIONDIMENSIONSTAT);
		addEEnumLiteral(requestEEnum, Request.DISCOVERPARTITIONSTAT);
		addEEnumLiteral(requestEEnum, Request.DISCOVERDIMENSIONSTAT);
		addEEnumLiteral(requestEEnum, Request.DISCOVERCOMMANDS);
		addEEnumLiteral(requestEEnum, Request.DISCOVERCOMMANDOBJECTS);
		addEEnumLiteral(requestEEnum, Request.DISCOVEROBJECTACTIVITY);
		addEEnumLiteral(requestEEnum, Request.DISCOVEROBJECTMEMORYUSAGE);
		addEEnumLiteral(requestEEnum, Request.DISCOVERSTORAGETABLES);
		addEEnumLiteral(requestEEnum, Request.DISCOVERSTORAGETABLECOLUMNS);
		addEEnumLiteral(requestEEnum, Request.DISCOVERSTORAGETABLECOLUMNSEGMENTS);
		addEEnumLiteral(requestEEnum, Request.DISCOVERCSDLMETADATA);
		addEEnumLiteral(requestEEnum, Request.DISCOVERCALCDEPENDENCY);
		addEEnumLiteral(requestEEnum, Request.MDSCHEMAFUNCTIONS);
		addEEnumLiteral(requestEEnum, Request.DISCOVERRINGBUFFERS);
		addEEnumLiteral(requestEEnum, Request.DISCOVERXEVENTTRACEDEFINITION);
		addEEnumLiteral(requestEEnum, Request.DISCOVERXEVENTPACKAGES);
		addEEnumLiteral(requestEEnum, Request.DISCOVERXEVENTOBJECTS);
		addEEnumLiteral(requestEEnum, Request.DISCOVERXEVENTOBJECTCOLUMNS);
		addEEnumLiteral(requestEEnum, Request.DISCOVERXEVENTSESSIONS);
		addEEnumLiteral(requestEEnum, Request.DISCOVERXEVENTSESSIONTARGETS);
		addEEnumLiteral(requestEEnum, Request.DISCOVERMEMSTATS);
		addEEnumLiteral(requestEEnum, Request.DISCOVERDBMEMSTATS);
		addEEnumLiteral(requestEEnum, Request.DISCOVEROBJECTCOUNTERS);

		initEEnum(responseEncodingEEnum, ResponseEncoding.class, "ResponseEncoding");
		addEEnumLiteral(responseEncodingEEnum, ResponseEncoding.DEFAULT);
		addEEnumLiteral(responseEncodingEEnum, ResponseEncoding.UTF8);
		addEEnumLiteral(responseEncodingEEnum, ResponseEncoding.UTF16);

		initEEnum(stateSupportEEnum, StateSupport.class, "StateSupport");
		addEEnumLiteral(stateSupportEEnum, StateSupport.NONE);
		addEEnumLiteral(stateSupportEEnum, StateSupport.SESSIONS);

		initEEnum(formatEEnum, Format.class, "Format");
		addEEnumLiteral(formatEEnum, Format.TABULAR);
		addEEnumLiteral(formatEEnum, Format.MULTIDIMENSIONAL);
		addEEnumLiteral(formatEEnum, Format.NATIVE);

		initEEnum(contentEEnum, Content.class, "Content");
		addEEnumLiteral(contentEEnum, Content.NONE);
		addEEnumLiteral(contentEEnum, Content.SCHEMA);
		addEEnumLiteral(contentEEnum, Content.DATA);
		addEEnumLiteral(contentEEnum, Content.SCHEMA_DATA);
		addEEnumLiteral(contentEEnum, Content.METADATA);

		initEEnum(axisFormatEEnum, AxisFormat.class, "AxisFormat");
		addEEnumLiteral(axisFormatEEnum, AxisFormat.CLUSTER_FORMAT);
		addEEnumLiteral(axisFormatEEnum, AxisFormat.CUSTOM_FORMAT);
		addEEnumLiteral(axisFormatEEnum, AxisFormat.TUPLE_FORMAT);

		initEEnum(mdxSupportEEnum, MDXSupport.class, "MDXSupport");
		addEEnumLiteral(mdxSupportEEnum, MDXSupport.CORE);

		initEEnum(providerTypeEEnum, ProviderType.class, "ProviderType");
		addEEnumLiteral(providerTypeEEnum, ProviderType._1);
		addEEnumLiteral(providerTypeEEnum, ProviderType._2);
		addEEnumLiteral(providerTypeEEnum, ProviderType._3);
		addEEnumLiteral(providerTypeEEnum, ProviderType._4);

		initEEnum(visualModeEEnum, VisualMode.class, "VisualMode");
		addEEnumLiteral(visualModeEEnum, VisualMode._0);
		addEEnumLiteral(visualModeEEnum, VisualMode._1);
		addEEnumLiteral(visualModeEEnum, VisualMode._2);

		initEEnum(catalogLocationEEnum, CatalogLocation.class, "CatalogLocation");
		addEEnumLiteral(catalogLocationEEnum, CatalogLocation._1);
		addEEnumLiteral(catalogLocationEEnum, CatalogLocation._2);

		initEEnum(dbpropConcatNullBehaviorEEnum, DbpropConcatNullBehavior.class, "DbpropConcatNullBehavior");
		addEEnumLiteral(dbpropConcatNullBehaviorEEnum, DbpropConcatNullBehavior._1);
		addEEnumLiteral(dbpropConcatNullBehaviorEEnum, DbpropConcatNullBehavior._2);

		initEEnum(dbpropNullCollationEEnum, DbpropNullCollation.class, "DbpropNullCollation");
		addEEnumLiteral(dbpropNullCollationEEnum, DbpropNullCollation._1);
		addEEnumLiteral(dbpropNullCollationEEnum, DbpropNullCollation._2);
		addEEnumLiteral(dbpropNullCollationEEnum, DbpropNullCollation._4);
		addEEnumLiteral(dbpropNullCollationEEnum, DbpropNullCollation._8);

		initEEnum(dbpropOutputParameterAvailableEEnum, DbpropOutputParameterAvailable.class, "DbpropOutputParameterAvailable");
		addEEnumLiteral(dbpropOutputParameterAvailableEEnum, DbpropOutputParameterAvailable._1);
		addEEnumLiteral(dbpropOutputParameterAvailableEEnum, DbpropOutputParameterAvailable._2);
		addEEnumLiteral(dbpropOutputParameterAvailableEEnum, DbpropOutputParameterAvailable._4);

		initEEnum(dbpropPersistentIdTypeEEnum, DbpropPersistentIdType.class, "DbpropPersistentIdType");
		addEEnumLiteral(dbpropPersistentIdTypeEEnum, DbpropPersistentIdType._1);
		addEEnumLiteral(dbpropPersistentIdTypeEEnum, DbpropPersistentIdType._2);
		addEEnumLiteral(dbpropPersistentIdTypeEEnum, DbpropPersistentIdType._4);
		addEEnumLiteral(dbpropPersistentIdTypeEEnum, DbpropPersistentIdType._8);
		addEEnumLiteral(dbpropPersistentIdTypeEEnum, DbpropPersistentIdType._16);
		addEEnumLiteral(dbpropPersistentIdTypeEEnum, DbpropPersistentIdType._32);
		addEEnumLiteral(dbpropPersistentIdTypeEEnum, DbpropPersistentIdType._64);

		initEEnum(dbpropPrepareAbortBehaviorEEnum, DbpropPrepareAbortBehavior.class, "DbpropPrepareAbortBehavior");
		addEEnumLiteral(dbpropPrepareAbortBehaviorEEnum, DbpropPrepareAbortBehavior._1);
		addEEnumLiteral(dbpropPrepareAbortBehaviorEEnum, DbpropPrepareAbortBehavior._2);

		initEEnum(dbpropPrepareCommitBehaviorEEnum, DbpropPrepareCommitBehavior.class, "DbpropPrepareCommitBehavior");
		addEEnumLiteral(dbpropPrepareCommitBehaviorEEnum, DbpropPrepareCommitBehavior._1);
		addEEnumLiteral(dbpropPrepareCommitBehaviorEEnum, DbpropPrepareCommitBehavior._2);

		initEEnum(dbpropQuotedIdentifierCaseEEnum, DbpropQuotedIdentifierCase.class, "DbpropQuotedIdentifierCase");
		addEEnumLiteral(dbpropQuotedIdentifierCaseEEnum, DbpropQuotedIdentifierCase._1);
		addEEnumLiteral(dbpropQuotedIdentifierCaseEEnum, DbpropQuotedIdentifierCase._2);
		addEEnumLiteral(dbpropQuotedIdentifierCaseEEnum, DbpropQuotedIdentifierCase._4);
		addEEnumLiteral(dbpropQuotedIdentifierCaseEEnum, DbpropQuotedIdentifierCase._8);

		initEEnum(mdpropAggregateCellUpdateEEnum, MdpropAggregateCellUpdate.class, "MdpropAggregateCellUpdate");
		addEEnumLiteral(mdpropAggregateCellUpdateEEnum, MdpropAggregateCellUpdate._0);
		addEEnumLiteral(mdpropAggregateCellUpdateEEnum, MdpropAggregateCellUpdate._1);
		addEEnumLiteral(mdpropAggregateCellUpdateEEnum, MdpropAggregateCellUpdate._2);

		initEEnum(mdpropFlatteningSupportEEnum, MdpropFlatteningSupport.class, "MdpropFlatteningSupport");
		addEEnumLiteral(mdpropFlatteningSupportEEnum, MdpropFlatteningSupport._1);
		addEEnumLiteral(mdpropFlatteningSupportEEnum, MdpropFlatteningSupport._2);
		addEEnumLiteral(mdpropFlatteningSupportEEnum, MdpropFlatteningSupport._3);
		addEEnumLiteral(mdpropFlatteningSupportEEnum, MdpropFlatteningSupport._4);

		initEEnum(mdpropMdxNonMeasureExpressionsEEnum, MdpropMdxNonMeasureExpressions.class, "MdpropMdxNonMeasureExpressions");
		addEEnumLiteral(mdpropMdxNonMeasureExpressionsEEnum, MdpropMdxNonMeasureExpressions._0);
		addEEnumLiteral(mdpropMdxNonMeasureExpressionsEEnum, MdpropMdxNonMeasureExpressions._1);

		initEEnum(mdpropMdxRangeRowsetEEnum, MdpropMdxRangeRowset.class, "MdpropMdxRangeRowset");
		addEEnumLiteral(mdpropMdxRangeRowsetEEnum, MdpropMdxRangeRowset._1);
		addEEnumLiteral(mdpropMdxRangeRowsetEEnum, MdpropMdxRangeRowset._2);
		addEEnumLiteral(mdpropMdxRangeRowsetEEnum, MdpropMdxRangeRowset._4);

		initEEnum(mdpropMdxSlicerEEnum, MdpropMdxSlicer.class, "MdpropMdxSlicer");
		addEEnumLiteral(mdpropMdxSlicerEEnum, MdpropMdxSlicer._1);
		addEEnumLiteral(mdpropMdxSlicerEEnum, MdpropMdxSlicer._2);

		initEEnum(mdxMissingMemberModeEEnum, MdxMissingMemberMode.class, "MdxMissingMemberMode");
		addEEnumLiteral(mdxMissingMemberModeEEnum, MdxMissingMemberMode.DEFAULT);
		addEEnumLiteral(mdxMissingMemberModeEEnum, MdxMissingMemberMode.IGNORE);
		addEEnumLiteral(mdxMissingMemberModeEEnum, MdxMissingMemberMode.ERROR);

		initEEnum(dbpropMsmdMDXCompatibilityEEnum, DbpropMsmdMDXCompatibility.class, "DbpropMsmdMDXCompatibility");
		addEEnumLiteral(dbpropMsmdMDXCompatibilityEEnum, DbpropMsmdMDXCompatibility._0);
		addEEnumLiteral(dbpropMsmdMDXCompatibilityEEnum, DbpropMsmdMDXCompatibility._1);
		addEEnumLiteral(dbpropMsmdMDXCompatibilityEEnum, DbpropMsmdMDXCompatibility._2);
		addEEnumLiteral(dbpropMsmdMDXCompatibilityEEnum, DbpropMsmdMDXCompatibility._3);

		initEEnum(dbpropMsmdCompareCaseSensitiveStringFlagsEEnum, DbpropMsmdCompareCaseSensitiveStringFlags.class, "DbpropMsmdCompareCaseSensitiveStringFlags");
		addEEnumLiteral(dbpropMsmdCompareCaseSensitiveStringFlagsEEnum, DbpropMsmdCompareCaseSensitiveStringFlags._1);
		addEEnumLiteral(dbpropMsmdCompareCaseSensitiveStringFlagsEEnum, DbpropMsmdCompareCaseSensitiveStringFlags._2);
		addEEnumLiteral(dbpropMsmdCompareCaseSensitiveStringFlagsEEnum, DbpropMsmdCompareCaseSensitiveStringFlags._16);
		addEEnumLiteral(dbpropMsmdCompareCaseSensitiveStringFlagsEEnum, DbpropMsmdCompareCaseSensitiveStringFlags._256);
		addEEnumLiteral(dbpropMsmdCompareCaseSensitiveStringFlagsEEnum, DbpropMsmdCompareCaseSensitiveStringFlags._4096);
		addEEnumLiteral(dbpropMsmdCompareCaseSensitiveStringFlagsEEnum, DbpropMsmdCompareCaseSensitiveStringFlags._65536);
		addEEnumLiteral(dbpropMsmdCompareCaseSensitiveStringFlagsEEnum, DbpropMsmdCompareCaseSensitiveStringFlags._1048576);

		initEEnum(securedCellValueEEnum, SecuredCellValue.class, "SecuredCellValue");
		addEEnumLiteral(securedCellValueEEnum, SecuredCellValue._0);
		addEEnumLiteral(securedCellValueEEnum, SecuredCellValue._1);
		addEEnumLiteral(securedCellValueEEnum, SecuredCellValue._2);
		addEEnumLiteral(securedCellValueEEnum, SecuredCellValue._3);
		addEEnumLiteral(securedCellValueEEnum, SecuredCellValue._4);
		addEEnumLiteral(securedCellValueEEnum, SecuredCellValue._5);

		initEEnum(safetyOptionsEEnum, SafetyOptions.class, "SafetyOptions");
		addEEnumLiteral(safetyOptionsEEnum, SafetyOptions._0);
		addEEnumLiteral(safetyOptionsEEnum, SafetyOptions._1);
		addEEnumLiteral(safetyOptionsEEnum, SafetyOptions._2);
		addEEnumLiteral(safetyOptionsEEnum, SafetyOptions._3);

		initEEnum(dialectEEnum, Dialect.class, "Dialect");
		addEEnumLiteral(dialectEEnum, Dialect.MDX);
		addEEnumLiteral(dialectEEnum, Dialect.DMX);
		addEEnumLiteral(dialectEEnum, Dialect.SQL);

		initEEnum(sqlQueryModeEEnum, SQLQueryMode.class, "SQLQueryMode");
		addEEnumLiteral(sqlQueryModeEEnum, SQLQueryMode.DATA);
		addEEnumLiteral(sqlQueryModeEEnum, SQLQueryMode.CALCULATED);
		addEEnumLiteral(sqlQueryModeEEnum, SQLQueryMode.INCLUDE_EMPTY);
		addEEnumLiteral(sqlQueryModeEEnum, SQLQueryMode.DATA_KEYS);

		initEEnum(dbpropMsmdSubqueriesEEnum, DbpropMsmdSubqueries.class, "DbpropMsmdSubqueries");
		addEEnumLiteral(dbpropMsmdSubqueriesEEnum, DbpropMsmdSubqueries._0);
		addEEnumLiteral(dbpropMsmdSubqueriesEEnum, DbpropMsmdSubqueries._1);
		addEEnumLiteral(dbpropMsmdSubqueriesEEnum, DbpropMsmdSubqueries._2);

		initEEnum(dbpropMsmdAutoExistsEEnum, DbpropMsmdAutoExists.class, "DbpropMsmdAutoExists");
		addEEnumLiteral(dbpropMsmdAutoExistsEEnum, DbpropMsmdAutoExists._0);
		addEEnumLiteral(dbpropMsmdAutoExistsEEnum, DbpropMsmdAutoExists._1);
		addEEnumLiteral(dbpropMsmdAutoExistsEEnum, DbpropMsmdAutoExists._2);
		addEEnumLiteral(dbpropMsmdAutoExistsEEnum, DbpropMsmdAutoExists._3);

		initEEnum(updateIsolationLevelEEnum, UpdateIsolationLevel.class, "UpdateIsolationLevel");
		addEEnumLiteral(updateIsolationLevelEEnum, UpdateIsolationLevel._1);
		addEEnumLiteral(updateIsolationLevelEEnum, UpdateIsolationLevel._2);

		initEEnum(memoryLockingModeEEnum, MemoryLockingMode.class, "MemoryLockingMode");
		addEEnumLiteral(memoryLockingModeEEnum, MemoryLockingMode._0);
		addEEnumLiteral(memoryLockingModeEEnum, MemoryLockingMode._1);

		initEEnum(visibilityEEnum, Visibility.class, "Visibility");
		addEEnumLiteral(visibilityEEnum, Visibility.SCHEMA_ROWSET);
		addEEnumLiteral(visibilityEEnum, Visibility.NONE);

		initEEnum(retentionModesEEnum, RetentionModes.class, "RetentionModes");
		addEEnumLiteral(retentionModesEEnum, RetentionModes.ALLOW_SINGLE_EVENT_LOSS);
		addEEnumLiteral(retentionModesEEnum, RetentionModes.ALLOW_MULTIPLE_EVENT_LOSS);
		addEEnumLiteral(retentionModesEEnum, RetentionModes.NO_EVENT_LOSS);

		initEEnum(partitionModesEEnum, PartitionModes.class, "PartitionModes");
		addEEnumLiteral(partitionModesEEnum, PartitionModes.NONE);
		addEEnumLiteral(partitionModesEEnum, PartitionModes.PER_NODE);
		addEEnumLiteral(partitionModesEEnum, PartitionModes.PER_CPU);

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
		  (discoverResponseEClass,
		   source,
		   new String[] {
			   "name", "DiscoverResponse_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDiscoverResponse_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return"
		   });
		addAnnotation
		  (discoverEClass,
		   source,
		   new String[] {
			   "name", "Discover_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDiscover_RequestType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RequestType"
		   });
		addAnnotation
		  (getDiscover_Restrictions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Restrictions"
		   });
		addAnnotation
		  (getDiscover_Properties(),
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
		  (requestEEnum,
		   source,
		   new String[] {
			   "name", "RequestType_._type"
		   });
		addAnnotation
		  (responseEncodingEEnum,
		   source,
		   new String[] {
			   "name", "ResponseEncoding_._type"
		   });
		addAnnotation
		  (restrictionListEClass,
		   source,
		   new String[] {
			   "name", "RestrictionList_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRestrictionList_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##any",
			   "name", ":0",
			   "processing", "strict"
		   });
		addAnnotation
		  (restrictionsEClass,
		   source,
		   new String[] {
			   "name", "Restrictions_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRestrictions_RestrictionList(),
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
		  (stateSupportEEnum,
		   source,
		   new String[] {
			   "name", "StateSupport_._type"
		   });
		addAnnotation
		  (formatEEnum,
		   source,
		   new String[] {
			   "name", "Format_._1_._type"
		   });
		addAnnotation
		  (contentEEnum,
		   source,
		   new String[] {
			   "name", "Content_._1_._type"
		   });
		addAnnotation
		  (axisFormatEEnum,
		   source,
		   new String[] {
			   "name", "AxisFormat_._type"
		   });
		addAnnotation
		  (mdxSupportEEnum,
		   source,
		   new String[] {
			   "name", "MDXSupport_._type"
		   });
		addAnnotation
		  (providerTypeEEnum,
		   source,
		   new String[] {
			   "name", "ProviderType_._type"
		   });
		addAnnotation
		  (visualModeEEnum,
		   source,
		   new String[] {
			   "name", "VisualMode_._type"
		   });
		addAnnotation
		  (catalogLocationEEnum,
		   source,
		   new String[] {
			   "name", "CatalogLocation_._type"
		   });
		addAnnotation
		  (dbpropConcatNullBehaviorEEnum,
		   source,
		   new String[] {
			   "name", "DbpropConcatNullBehavior_._type"
		   });
		addAnnotation
		  (dbpropNullCollationEEnum,
		   source,
		   new String[] {
			   "name", "DbpropNullCollation_._type"
		   });
		addAnnotation
		  (dbpropOutputParameterAvailableEEnum,
		   source,
		   new String[] {
			   "name", "DbpropOutputParameterAvailable_._type"
		   });
		addAnnotation
		  (dbpropPersistentIdTypeEEnum,
		   source,
		   new String[] {
			   "name", "DbpropPersistentIdType_._type"
		   });
		addAnnotation
		  (dbpropPrepareAbortBehaviorEEnum,
		   source,
		   new String[] {
			   "name", "DbpropPrepareAbortBehavior_._type"
		   });
		addAnnotation
		  (dbpropPrepareCommitBehaviorEEnum,
		   source,
		   new String[] {
			   "name", "DbpropPrepareCommitBehavior_._type"
		   });
		addAnnotation
		  (dbpropQuotedIdentifierCaseEEnum,
		   source,
		   new String[] {
			   "name", "DbpropQuotedIdentifierCase_._type"
		   });
		addAnnotation
		  (mdpropAggregateCellUpdateEEnum,
		   source,
		   new String[] {
			   "name", "MdpropAggregateCellUpdate_._type"
		   });
		addAnnotation
		  (mdpropFlatteningSupportEEnum,
		   source,
		   new String[] {
			   "name", "MdpropFlatteningSupport_._type"
		   });
		addAnnotation
		  (mdpropMdxNonMeasureExpressionsEEnum,
		   source,
		   new String[] {
			   "name", "MdpropMdxNonMeasureExpressions_._type"
		   });
		addAnnotation
		  (mdpropMdxRangeRowsetEEnum,
		   source,
		   new String[] {
			   "name", "MdpropMdxRangeRowset_._type"
		   });
		addAnnotation
		  (mdpropMdxSlicerEEnum,
		   source,
		   new String[] {
			   "name", "MdpropMdxSlicer_._type"
		   });
		addAnnotation
		  (mdxMissingMemberModeEEnum,
		   source,
		   new String[] {
			   "name", "MdxMissingMemberMode_._type"
		   });
		addAnnotation
		  (dbpropMsmdMDXCompatibilityEEnum,
		   source,
		   new String[] {
			   "name", "DbpropMsmdMDXCompatibility_._type"
		   });
		addAnnotation
		  (dbpropMsmdCompareCaseSensitiveStringFlagsEEnum,
		   source,
		   new String[] {
			   "name", "DbpropMsmdCompareCaseSensitiveStringFlags_._type"
		   });
		addAnnotation
		  (securedCellValueEEnum,
		   source,
		   new String[] {
			   "name", "SecuredCellValue_._type"
		   });
		addAnnotation
		  (safetyOptionsEEnum,
		   source,
		   new String[] {
			   "name", "SafetyOptions_._type"
		   });
		addAnnotation
		  (dialectEEnum,
		   source,
		   new String[] {
			   "name", "Dialect_._type"
		   });
		addAnnotation
		  (sqlQueryModeEEnum,
		   source,
		   new String[] {
			   "name", "SQLQueryMode_._type"
		   });
		addAnnotation
		  (dbpropMsmdSubqueriesEEnum,
		   source,
		   new String[] {
			   "name", "DbpropMsmdSubqueries_._type"
		   });
		addAnnotation
		  (dbpropMsmdAutoExistsEEnum,
		   source,
		   new String[] {
			   "name", "DbpropMsmdAutoExists_._type"
		   });
		addAnnotation
		  (updateIsolationLevelEEnum,
		   source,
		   new String[] {
			   "name", "UpdateIsolationLevel_._type"
		   });
		addAnnotation
		  (memoryLockingModeEEnum,
		   source,
		   new String[] {
			   "name", "MemoryLockingMode_._type"
		   });
		addAnnotation
		  (visibilityEEnum,
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
		  (annotationsEClass,
		   source,
		   new String[] {
			   "name", "Annotations_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAnnotations_Annotation(),
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
		  (eventSessionEClass,
		   source,
		   new String[] {
			   "name", "event_session_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEventSession_TemplateCategory(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "templateCategory"
		   });
		addAnnotation
		  (getEventSession_TemplateName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "templateName"
		   });
		addAnnotation
		  (getEventSession_TemplateDescription(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "templateDescription"
		   });
		addAnnotation
		  (getEventSession_Event(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "event"
		   });
		addAnnotation
		  (getEventSession_Target(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "target"
		   });
		addAnnotation
		  (getEventSession_DispatchLatency(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dispatchLatency"
		   });
		addAnnotation
		  (getEventSession_EventRetentionMode(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "eventRetentionMode"
		   });
		addAnnotation
		  (getEventSession_MaxEventSize(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "maxEventSize"
		   });
		addAnnotation
		  (getEventSession_MaxMemory(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "maxMemory"
		   });
		addAnnotation
		  (getEventSession_MemoryPartitionMode(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "memoryPartitionMode"
		   });
		addAnnotation
		  (getEventSession_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (getEventSession_TrackCausality(),
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
