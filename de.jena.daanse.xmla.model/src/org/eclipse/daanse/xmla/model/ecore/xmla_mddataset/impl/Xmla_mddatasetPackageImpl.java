/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl;

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

import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl;

import org.eclipse.daanse.xmla.model.ecore.xmla_empty.Xmla_emptyPackage;

import org.eclipse.daanse.xmla.model.ecore.xmla_empty.impl.Xmla_emptyPackageImpl;

import org.eclipse.daanse.xmla.model.ecore.xmla_exception.Xmla_exceptionPackage;

import org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.Xmla_exceptionPackageImpl;

import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Axes;
import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.AxesInfo;
import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Axis;
import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.AxisInfo;
import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CellData;
import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CellInfo;
import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CellSetType;
import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CellType;
import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CellTypeError;
import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CubeInfo;
import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.DocumentRoot;
import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.HierarchyInfo;
import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Mddataset;
import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.MemberType;
import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.MembersType;
import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.OlapInfo;
import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.OlapInfoCube;
import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.SetListType;
import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.TupleType;
import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.TuplesType;
import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.ValueType;
import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Xmla_mddatasetFactory;
import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Xmla_mddatasetPackage;

import org.eclipse.daanse.xmla.model.ecore.xmla_multipleresults.Xmla_multipleresultsPackage;

import org.eclipse.daanse.xmla.model.ecore.xmla_multipleresults.impl.Xmla_multipleresultsPackageImpl;

import org.eclipse.daanse.xmla.model.ecore.xmla_rowset.Xmla_rowsetPackage;

import org.eclipse.daanse.xmla.model.ecore.xmla_rowset.impl.Xmla_rowsetPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class Xmla_mddatasetPackageImpl extends EPackageImpl implements Xmla_mddatasetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass axesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass axesInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass axisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass axisInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cellDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cellInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cellSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cellTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cellTypeErrorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cubeInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hierarchyInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mddatasetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass membersTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass olapInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass olapInfoCubeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuplesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tupleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Xmla_mddatasetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Xmla_mddatasetPackageImpl() {
		super(eNS_URI, Xmla_mddatasetFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Xmla_mddatasetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Xmla_mddatasetPackage init() {
		if (isInited) return (Xmla_mddatasetPackage)EPackage.Registry.INSTANCE.getEPackage(Xmla_mddatasetPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredXmla_mddatasetPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Xmla_mddatasetPackageImpl theXmla_mddatasetPackage = registeredXmla_mddatasetPackage instanceof Xmla_mddatasetPackageImpl ? (Xmla_mddatasetPackageImpl)registeredXmla_mddatasetPackage : new Xmla_mddatasetPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Xmla_multipleresultsPackage.eNS_URI);
		Xmla_multipleresultsPackageImpl theXmla_multipleresultsPackage = (Xmla_multipleresultsPackageImpl)(registeredPackage instanceof Xmla_multipleresultsPackageImpl ? registeredPackage : Xmla_multipleresultsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Xmla_rowsetPackage.eNS_URI);
		Xmla_rowsetPackageImpl theXmla_rowsetPackage = (Xmla_rowsetPackageImpl)(registeredPackage instanceof Xmla_rowsetPackageImpl ? registeredPackage : Xmla_rowsetPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(XmlaPackage.eNS_URI);
		XmlaPackageImpl theXmlaPackage = (XmlaPackageImpl)(registeredPackage instanceof XmlaPackageImpl ? registeredPackage : XmlaPackage.eINSTANCE);

		// Create package meta-data objects
		theXmla_mddatasetPackage.createPackageContents();
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
		theXmla_multipleresultsPackage.createPackageContents();
		theXmla_rowsetPackage.createPackageContents();
		theXmlaPackage.createPackageContents();

		// Initialize created meta-data
		theXmla_mddatasetPackage.initializePackageContents();
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
		theXmla_multipleresultsPackage.initializePackageContents();
		theXmla_rowsetPackage.initializePackageContents();
		theXmlaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theXmla_mddatasetPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Xmla_mddatasetPackage.eNS_URI, theXmla_mddatasetPackage);
		return theXmla_mddatasetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAxes() {
		return axesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAxes_Axis() {
		return (EReference)axesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAxesInfo() {
		return axesInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAxesInfo_AxisInfo() {
		return (EReference)axesInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAxis() {
		return axisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAxis_SetType() {
		return (EAttribute)axisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAxis_Members() {
		return (EReference)axisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAxis_Tuples() {
		return (EReference)axisEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAxis_CrossProduct() {
		return (EReference)axisEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAxis_NormTupleSet() {
		return (EReference)axisEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAxis_Name() {
		return (EAttribute)axisEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAxisInfo() {
		return axisInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAxisInfo_HierarchyInfo() {
		return (EReference)axisInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAxisInfo_Name() {
		return (EAttribute)axisInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCellData() {
		return cellDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCellData_Cell() {
		return (EReference)cellDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCellData_CellSet() {
		return (EReference)cellDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCellInfo() {
		return cellInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCellInfo_Any() {
		return (EAttribute)cellInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCellSetType() {
		return cellSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCellSetType_Data() {
		return (EAttribute)cellSetTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCellType() {
		return cellTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCellType_Value() {
		return (EReference)cellTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCellType_Any() {
		return (EAttribute)cellTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCellType_CellOrdinal() {
		return (EAttribute)cellTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCellTypeError() {
		return cellTypeErrorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCellTypeError_Description() {
		return (EAttribute)cellTypeErrorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCellTypeError_ErrorCode() {
		return (EAttribute)cellTypeErrorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCubeInfo() {
		return cubeInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCubeInfo_Cube() {
		return (EReference)cubeInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHierarchyInfo() {
		return hierarchyInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHierarchyInfo_Any() {
		return (EAttribute)hierarchyInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHierarchyInfo_Name() {
		return (EAttribute)hierarchyInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMddataset() {
		return mddatasetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMddataset_OlapInfo() {
		return (EReference)mddatasetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMddataset_Axes() {
		return (EReference)mddatasetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMddataset_CellData() {
		return (EReference)mddatasetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMddataset_Exception() {
		return (EReference)mddatasetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMddataset_Messages() {
		return (EReference)mddatasetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMembersType() {
		return membersTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMembersType_Member() {
		return (EReference)membersTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMembersType_Hierarchy() {
		return (EAttribute)membersTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemberType() {
		return memberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemberType_Any() {
		return (EAttribute)memberTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemberType_Hierarchy() {
		return (EAttribute)memberTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOlapInfo() {
		return olapInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOlapInfo_CubeInfo() {
		return (EReference)olapInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOlapInfo_AxesInfo() {
		return (EReference)olapInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOlapInfo_CellInfo() {
		return (EReference)olapInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOlapInfoCube() {
		return olapInfoCubeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOlapInfoCube_CubeName() {
		return (EAttribute)olapInfoCubeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOlapInfoCube_LastDataUpdate() {
		return (EAttribute)olapInfoCubeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOlapInfoCube_LastSchemaUpdate() {
		return (EAttribute)olapInfoCubeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetListType() {
		return setListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetListType_SetType() {
		return (EAttribute)setListTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetListType_Members() {
		return (EReference)setListTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetListType_Tuples() {
		return (EReference)setListTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetListType_CrossProduct() {
		return (EReference)setListTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetListType_NormTupleSet() {
		return (EReference)setListTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetListType_Size() {
		return (EAttribute)setListTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuplesType() {
		return tuplesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTuplesType_Tuple() {
		return (EReference)tuplesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTupleType() {
		return tupleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTupleType_Member() {
		return (EReference)tupleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueType() {
		return valueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueType_Error() {
		return (EReference)valueTypeEClass.getEStructuralFeatures().get(0);
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
	public EReference getDocumentRoot_Root() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xmla_mddatasetFactory getXmla_mddatasetFactory() {
		return (Xmla_mddatasetFactory)getEFactoryInstance();
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
		axesEClass = createEClass(AXES);
		createEReference(axesEClass, AXES__AXIS);

		axesInfoEClass = createEClass(AXES_INFO);
		createEReference(axesInfoEClass, AXES_INFO__AXIS_INFO);

		axisEClass = createEClass(AXIS);
		createEAttribute(axisEClass, AXIS__SET_TYPE);
		createEReference(axisEClass, AXIS__MEMBERS);
		createEReference(axisEClass, AXIS__TUPLES);
		createEReference(axisEClass, AXIS__CROSS_PRODUCT);
		createEReference(axisEClass, AXIS__NORM_TUPLE_SET);
		createEAttribute(axisEClass, AXIS__NAME);

		axisInfoEClass = createEClass(AXIS_INFO);
		createEReference(axisInfoEClass, AXIS_INFO__HIERARCHY_INFO);
		createEAttribute(axisInfoEClass, AXIS_INFO__NAME);

		cellDataEClass = createEClass(CELL_DATA);
		createEReference(cellDataEClass, CELL_DATA__CELL);
		createEReference(cellDataEClass, CELL_DATA__CELL_SET);

		cellInfoEClass = createEClass(CELL_INFO);
		createEAttribute(cellInfoEClass, CELL_INFO__ANY);

		cellSetTypeEClass = createEClass(CELL_SET_TYPE);
		createEAttribute(cellSetTypeEClass, CELL_SET_TYPE__DATA);

		cellTypeEClass = createEClass(CELL_TYPE);
		createEReference(cellTypeEClass, CELL_TYPE__VALUE);
		createEAttribute(cellTypeEClass, CELL_TYPE__ANY);
		createEAttribute(cellTypeEClass, CELL_TYPE__CELL_ORDINAL);

		cellTypeErrorEClass = createEClass(CELL_TYPE_ERROR);
		createEAttribute(cellTypeErrorEClass, CELL_TYPE_ERROR__DESCRIPTION);
		createEAttribute(cellTypeErrorEClass, CELL_TYPE_ERROR__ERROR_CODE);

		cubeInfoEClass = createEClass(CUBE_INFO);
		createEReference(cubeInfoEClass, CUBE_INFO__CUBE);

		hierarchyInfoEClass = createEClass(HIERARCHY_INFO);
		createEAttribute(hierarchyInfoEClass, HIERARCHY_INFO__ANY);
		createEAttribute(hierarchyInfoEClass, HIERARCHY_INFO__NAME);

		mddatasetEClass = createEClass(MDDATASET);
		createEReference(mddatasetEClass, MDDATASET__OLAP_INFO);
		createEReference(mddatasetEClass, MDDATASET__AXES);
		createEReference(mddatasetEClass, MDDATASET__CELL_DATA);
		createEReference(mddatasetEClass, MDDATASET__EXCEPTION);
		createEReference(mddatasetEClass, MDDATASET__MESSAGES);

		membersTypeEClass = createEClass(MEMBERS_TYPE);
		createEReference(membersTypeEClass, MEMBERS_TYPE__MEMBER);
		createEAttribute(membersTypeEClass, MEMBERS_TYPE__HIERARCHY);

		memberTypeEClass = createEClass(MEMBER_TYPE);
		createEAttribute(memberTypeEClass, MEMBER_TYPE__ANY);
		createEAttribute(memberTypeEClass, MEMBER_TYPE__HIERARCHY);

		olapInfoEClass = createEClass(OLAP_INFO);
		createEReference(olapInfoEClass, OLAP_INFO__CUBE_INFO);
		createEReference(olapInfoEClass, OLAP_INFO__AXES_INFO);
		createEReference(olapInfoEClass, OLAP_INFO__CELL_INFO);

		olapInfoCubeEClass = createEClass(OLAP_INFO_CUBE);
		createEAttribute(olapInfoCubeEClass, OLAP_INFO_CUBE__CUBE_NAME);
		createEAttribute(olapInfoCubeEClass, OLAP_INFO_CUBE__LAST_DATA_UPDATE);
		createEAttribute(olapInfoCubeEClass, OLAP_INFO_CUBE__LAST_SCHEMA_UPDATE);

		setListTypeEClass = createEClass(SET_LIST_TYPE);
		createEAttribute(setListTypeEClass, SET_LIST_TYPE__SET_TYPE);
		createEReference(setListTypeEClass, SET_LIST_TYPE__MEMBERS);
		createEReference(setListTypeEClass, SET_LIST_TYPE__TUPLES);
		createEReference(setListTypeEClass, SET_LIST_TYPE__CROSS_PRODUCT);
		createEReference(setListTypeEClass, SET_LIST_TYPE__NORM_TUPLE_SET);
		createEAttribute(setListTypeEClass, SET_LIST_TYPE__SIZE);

		tuplesTypeEClass = createEClass(TUPLES_TYPE);
		createEReference(tuplesTypeEClass, TUPLES_TYPE__TUPLE);

		tupleTypeEClass = createEClass(TUPLE_TYPE);
		createEReference(tupleTypeEClass, TUPLE_TYPE__MEMBER);

		valueTypeEClass = createEClass(VALUE_TYPE);
		createEReference(valueTypeEClass, VALUE_TYPE__ERROR);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ROOT);
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
		MsxmlaPackage theMsxmlaPackage = (MsxmlaPackage)EPackage.Registry.INSTANCE.getEPackage(MsxmlaPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		Xmla_exceptionPackage theXmla_exceptionPackage = (Xmla_exceptionPackage)EPackage.Registry.INSTANCE.getEPackage(Xmla_exceptionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(axesEClass, Axes.class, "Axes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAxes_Axis(), this.getAxis(), null, "axis", null, 1, -1, Axes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(axesInfoEClass, AxesInfo.class, "AxesInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAxesInfo_AxisInfo(), this.getAxisInfo(), null, "axisInfo", null, 1, -1, AxesInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(axisEClass, Axis.class, "Axis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAxis_SetType(), ecorePackage.getEFeatureMapEntry(), "setType", null, 0, -1, Axis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAxis_Members(), this.getMembersType(), null, "members", null, 0, -1, Axis.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAxis_Tuples(), this.getTuplesType(), null, "tuples", null, 0, -1, Axis.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAxis_CrossProduct(), this.getSetListType(), null, "crossProduct", null, 0, -1, Axis.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAxis_NormTupleSet(), theMsxmlaPackage.getNormTupleSetType(), null, "normTupleSet", null, 0, -1, Axis.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAxis_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Axis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(axisInfoEClass, AxisInfo.class, "AxisInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAxisInfo_HierarchyInfo(), this.getHierarchyInfo(), null, "hierarchyInfo", null, 0, -1, AxisInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAxisInfo_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, AxisInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cellDataEClass, CellData.class, "CellData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCellData_Cell(), this.getCellType(), null, "cell", null, 0, -1, CellData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCellData_CellSet(), this.getCellSetType(), null, "cellSet", null, 0, 1, CellData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cellInfoEClass, CellInfo.class, "CellInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCellInfo_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, CellInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cellSetTypeEClass, CellSetType.class, "CellSetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCellSetType_Data(), theXMLTypePackage.getBase64Binary(), "data", null, 1, -1, CellSetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cellTypeEClass, CellType.class, "CellType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCellType_Value(), this.getValueType(), null, "value", null, 0, 1, CellType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCellType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, CellType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCellType_CellOrdinal(), theXMLTypePackage.getUnsignedInt(), "cellOrdinal", null, 1, 1, CellType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cellTypeErrorEClass, CellTypeError.class, "CellTypeError", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCellTypeError_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, CellTypeError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCellTypeError_ErrorCode(), theXMLTypePackage.getLong(), "errorCode", null, 0, 1, CellTypeError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cubeInfoEClass, CubeInfo.class, "CubeInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCubeInfo_Cube(), this.getOlapInfoCube(), null, "cube", null, 1, -1, CubeInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hierarchyInfoEClass, HierarchyInfo.class, "HierarchyInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHierarchyInfo_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, HierarchyInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHierarchyInfo_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, HierarchyInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mddatasetEClass, Mddataset.class, "Mddataset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMddataset_OlapInfo(), this.getOlapInfo(), null, "olapInfo", null, 0, 1, Mddataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMddataset_Axes(), this.getAxes(), null, "axes", null, 0, 1, Mddataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMddataset_CellData(), this.getCellData(), null, "cellData", null, 0, 1, Mddataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMddataset_Exception(), theXmla_exceptionPackage.getException(), null, "exception", null, 0, 1, Mddataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMddataset_Messages(), theXmla_exceptionPackage.getMessages(), null, "messages", null, 0, 1, Mddataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(membersTypeEClass, MembersType.class, "MembersType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMembersType_Member(), this.getMemberType(), null, "member", null, 0, -1, MembersType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMembersType_Hierarchy(), theXMLTypePackage.getString(), "hierarchy", null, 1, 1, MembersType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memberTypeEClass, MemberType.class, "MemberType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMemberType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, MemberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemberType_Hierarchy(), theXMLTypePackage.getString(), "hierarchy", null, 0, 1, MemberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(olapInfoEClass, OlapInfo.class, "OlapInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOlapInfo_CubeInfo(), this.getCubeInfo(), null, "cubeInfo", null, 1, 1, OlapInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOlapInfo_AxesInfo(), this.getAxesInfo(), null, "axesInfo", null, 1, 1, OlapInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOlapInfo_CellInfo(), this.getCellInfo(), null, "cellInfo", null, 1, 1, OlapInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(olapInfoCubeEClass, OlapInfoCube.class, "OlapInfoCube", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOlapInfoCube_CubeName(), theXMLTypePackage.getString(), "cubeName", null, 1, 1, OlapInfoCube.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOlapInfoCube_LastDataUpdate(), theXMLTypePackage.getDateTime(), "lastDataUpdate", null, 0, 1, OlapInfoCube.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOlapInfoCube_LastSchemaUpdate(), theXMLTypePackage.getDateTime(), "lastSchemaUpdate", null, 0, 1, OlapInfoCube.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setListTypeEClass, SetListType.class, "SetListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetListType_SetType(), ecorePackage.getEFeatureMapEntry(), "setType", null, 0, -1, SetListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetListType_Members(), this.getMembersType(), null, "members", null, 0, -1, SetListType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSetListType_Tuples(), this.getTuplesType(), null, "tuples", null, 0, -1, SetListType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSetListType_CrossProduct(), this.getSetListType(), null, "crossProduct", null, 0, -1, SetListType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSetListType_NormTupleSet(), theMsxmlaPackage.getNormTupleSetType(), null, "normTupleSet", null, 0, -1, SetListType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetListType_Size(), theXMLTypePackage.getUnsignedInt(), "size", null, 0, 1, SetListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tuplesTypeEClass, TuplesType.class, "TuplesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTuplesType_Tuple(), this.getTupleType(), null, "tuple", null, 0, -1, TuplesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tupleTypeEClass, TupleType.class, "TupleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTupleType_Member(), this.getMemberType(), null, "member", null, 1, -1, TupleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueTypeEClass, ValueType.class, "ValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueType_Error(), this.getCellTypeError(), null, "error", null, 0, -1, ValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Root(), this.getMddataset(), null, "root", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

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
		  (axesEClass,
		   source,
		   new String[] {
			   "name", "Axes",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAxes_Axis(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Axis"
		   });
		addAnnotation
		  (axesInfoEClass,
		   source,
		   new String[] {
			   "name", "AxesInfo",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAxesInfo_AxisInfo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AxisInfo"
		   });
		addAnnotation
		  (axisEClass,
		   source,
		   new String[] {
			   "name", "Axis",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAxis_SetType(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "SetType:0"
		   });
		addAnnotation
		  (getAxis_Members(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Members",
			   "group", "#SetType:0"
		   });
		addAnnotation
		  (getAxis_Tuples(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Tuples",
			   "group", "#SetType:0"
		   });
		addAnnotation
		  (getAxis_CrossProduct(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CrossProduct",
			   "group", "#SetType:0"
		   });
		addAnnotation
		  (getAxis_NormTupleSet(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NormTupleSet",
			   "namespace", "http://schemas.microsoft.com/analysisservices/2003/xmla",
			   "group", "#SetType:0"
		   });
		addAnnotation
		  (getAxis_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (axisInfoEClass,
		   source,
		   new String[] {
			   "name", "AxisInfo",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAxisInfo_HierarchyInfo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "HierarchyInfo"
		   });
		addAnnotation
		  (getAxisInfo_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (cellDataEClass,
		   source,
		   new String[] {
			   "name", "CellData",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCellData_Cell(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Cell"
		   });
		addAnnotation
		  (getCellData_CellSet(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CellSet"
		   });
		addAnnotation
		  (cellInfoEClass,
		   source,
		   new String[] {
			   "name", "CellInfo",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCellInfo_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##targetNamespace",
			   "name", ":0",
			   "processing", "skip"
		   });
		addAnnotation
		  (cellSetTypeEClass,
		   source,
		   new String[] {
			   "name", "CellSetType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCellSetType_Data(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Data"
		   });
		addAnnotation
		  (cellTypeEClass,
		   source,
		   new String[] {
			   "name", "CellType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCellType_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Value"
		   });
		addAnnotation
		  (getCellType_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##targetNamespace",
			   "name", ":1",
			   "processing", "skip"
		   });
		addAnnotation
		  (getCellType_CellOrdinal(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "CellOrdinal"
		   });
		addAnnotation
		  (cellTypeErrorEClass,
		   source,
		   new String[] {
			   "name", "CellTypeError",
			   "kind", "empty"
		   });
		addAnnotation
		  (getCellTypeError_Description(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Description"
		   });
		addAnnotation
		  (getCellTypeError_ErrorCode(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ErrorCode"
		   });
		addAnnotation
		  (cubeInfoEClass,
		   source,
		   new String[] {
			   "name", "CubeInfo",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCubeInfo_Cube(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Cube"
		   });
		addAnnotation
		  (hierarchyInfoEClass,
		   source,
		   new String[] {
			   "name", "HierarchyInfo",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHierarchyInfo_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##targetNamespace",
			   "name", ":0",
			   "processing", "skip"
		   });
		addAnnotation
		  (getHierarchyInfo_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (mddatasetEClass,
		   source,
		   new String[] {
			   "name", "mddataset",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMddataset_OlapInfo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OlapInfo"
		   });
		addAnnotation
		  (getMddataset_Axes(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Axes"
		   });
		addAnnotation
		  (getMddataset_CellData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CellData"
		   });
		addAnnotation
		  (getMddataset_Exception(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Exception"
		   });
		addAnnotation
		  (getMddataset_Messages(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Messages"
		   });
		addAnnotation
		  (membersTypeEClass,
		   source,
		   new String[] {
			   "name", "MembersType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMembersType_Member(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Member"
		   });
		addAnnotation
		  (getMembersType_Hierarchy(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Hierarchy"
		   });
		addAnnotation
		  (memberTypeEClass,
		   source,
		   new String[] {
			   "name", "MemberType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMemberType_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##targetNamespace",
			   "name", ":0",
			   "processing", "skip"
		   });
		addAnnotation
		  (getMemberType_Hierarchy(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Hierarchy"
		   });
		addAnnotation
		  (olapInfoEClass,
		   source,
		   new String[] {
			   "name", "OlapInfo",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getOlapInfo_CubeInfo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CubeInfo"
		   });
		addAnnotation
		  (getOlapInfo_AxesInfo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AxesInfo"
		   });
		addAnnotation
		  (getOlapInfo_CellInfo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CellInfo"
		   });
		addAnnotation
		  (olapInfoCubeEClass,
		   source,
		   new String[] {
			   "name", "OlapInfoCube",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getOlapInfoCube_CubeName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CubeName"
		   });
		addAnnotation
		  (getOlapInfoCube_LastDataUpdate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LastDataUpdate",
			   "namespace", "http://schemas.microsoft.com/analysisservices/2003/engine"
		   });
		addAnnotation
		  (getOlapInfoCube_LastSchemaUpdate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LastSchemaUpdate",
			   "namespace", "http://schemas.microsoft.com/analysisservices/2003/engine"
		   });
		addAnnotation
		  (setListTypeEClass,
		   source,
		   new String[] {
			   "name", "SetListType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSetListType_SetType(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "SetType:0"
		   });
		addAnnotation
		  (getSetListType_Members(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Members",
			   "group", "#SetType:0"
		   });
		addAnnotation
		  (getSetListType_Tuples(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Tuples",
			   "group", "#SetType:0"
		   });
		addAnnotation
		  (getSetListType_CrossProduct(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CrossProduct",
			   "group", "#SetType:0"
		   });
		addAnnotation
		  (getSetListType_NormTupleSet(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NormTupleSet",
			   "namespace", "http://schemas.microsoft.com/analysisservices/2003/xmla",
			   "group", "#SetType:0"
		   });
		addAnnotation
		  (getSetListType_Size(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Size"
		   });
		addAnnotation
		  (tuplesTypeEClass,
		   source,
		   new String[] {
			   "name", "TuplesType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTuplesType_Tuple(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Tuple"
		   });
		addAnnotation
		  (tupleTypeEClass,
		   source,
		   new String[] {
			   "name", "TupleType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTupleType_Member(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Member"
		   });
		addAnnotation
		  (valueTypeEClass,
		   source,
		   new String[] {
			   "name", "Value_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getValueType_Error(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Error"
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
		  (getDocumentRoot_Root(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "root",
			   "namespace", "##targetNamespace"
		   });
	}

} //Xmla_mddatasetPackageImpl
