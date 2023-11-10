/**
 */
package de.jena.mdo.asset.traffic.impl;

import de.jena.mdo.asset.traffic.Test;
import de.jena.mdo.asset.traffic.TrafficFactory;
import de.jena.mdo.asset.traffic.TrafficPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TrafficPackageImpl extends EPackageImpl implements TrafficPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass detectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeitemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testEClass = null;

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
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TrafficPackageImpl() {
		super(eNS_URI, TrafficFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TrafficPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TrafficPackage init() {
		if (isInited) return (TrafficPackage)EPackage.Registry.INSTANCE.getEPackage(TrafficPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTrafficPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TrafficPackageImpl theTrafficPackage = registeredTrafficPackage instanceof TrafficPackageImpl ? (TrafficPackageImpl)registeredTrafficPackage : new TrafficPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theTrafficPackage.createPackageContents();

		// Initialize created meta-data
		theTrafficPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTrafficPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TrafficPackage.eNS_URI, theTrafficPackage);
		return theTrafficPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDETECTOR() {
		return detectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDETECTOR_NO() {
		return (EAttribute)detectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDETECTOR_CODE() {
		return (EAttribute)detectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDETECTOR_NAME() {
		return (EAttribute)detectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDETECTOR_COUNTLOCATIONNO() {
		return (EAttribute)detectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDETECTOR_TYPENO() {
		return (EAttribute)detectorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDETECTOR_XCOORD() {
		return (EAttribute)detectorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDETECTOR_YCOORD() {
		return (EAttribute)detectorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDETECTOR_LANEONLINK() {
		return (EAttribute)detectorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDETECTOR_NUMLANESONLINK() {
		return (EAttribute)detectorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDETECTOR_ENABLED() {
		return (EAttribute)detectorEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDETECTOR_NODENO() {
		return (EAttribute)detectorEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDETECTOR_MAINNODENO() {
		return (EAttribute)detectorEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDETECTOR_CHANNELNO() {
		return (EAttribute)detectorEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDETECTOR_STOPLINEDIST() {
		return (EAttribute)detectorEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDETECTOR_LENGTH() {
		return (EAttribute)detectorEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDETECTOR_TSYSSET() {
		return (EAttribute)detectorEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDETECTOR_SCNO() {
		return (EAttribute)detectorEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDETECTOR_DETECTORTYPE() {
		return (EAttribute)detectorEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDETECTOR_DELAY() {
		return (EAttribute)detectorEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDETECTOR_EXTEND() {
		return (EAttribute)detectorEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDETECTOR_CARRYOVER() {
		return (EAttribute)detectorEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDETECTOR_QUEUELIMIT() {
		return (EAttribute)detectorEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDETECTOR_DETECTORMODE() {
		return (EAttribute)detectorEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDETECTOR_ADDEDINITIALMODE() {
		return (EAttribute)detectorEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDETECTOR_CALL() {
		return (EAttribute)detectorEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDETECTOR_AMBERLOCK() {
		return (EAttribute)detectorEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDETECTOR_REDLOCK() {
		return (EAttribute)detectorEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDETECTOR_EXTENDSGS() {
		return (EAttribute)detectorEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDETECTOR_XSWITCHSGS() {
		return (EAttribute)detectorEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDETECTOR_VEHDETECTORNO() {
		return (EAttribute)detectorEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDETECTOR_DELAYON() {
		return (EAttribute)detectorEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDETECTOR_DELAYOFF() {
		return (EAttribute)detectorEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDETECTOR_CONTROL() {
		return (EAttribute)detectorEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDETECTOR_ACTION() {
		return (EAttribute)detectorEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDETECTOR_ACTIONSGNO() {
		return (EAttribute)detectorEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDETECTOR_ACTIONPREEMPTNO() {
		return (EAttribute)detectorEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDETECTOR_ACTIONTRANSITSGNO() {
		return (EAttribute)detectorEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDETECTOR_RBCNO() {
		return (EAttribute)detectorEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDETECTOR_LABELPOSRELX() {
		return (EAttribute)detectorEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDETECTOR_DET_AU() {
		return (EAttribute)detectorEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDETECTOR_DET_BEM() {
		return (EAttribute)detectorEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDETECTOR_DET_KO() {
		return (EAttribute)detectorEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDETECTOR_DET_Q() {
		return (EAttribute)detectorEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDETECTOR_DET_QS() {
		return (EAttribute)detectorEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDETECTOR_DET_SP() {
		return (EAttribute)detectorEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDETECTOR_DET_ST() {
		return (EAttribute)detectorEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDETECTOR_DET_VO() {
		return (EAttribute)detectorEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPOINT() {
		return pointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPOINT_ID() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPOINT_XCOORD() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPOINT_YCOORD() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEDGEITEM() {
		return edgeitemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEDGEITEM_EDGEID() {
		return (EAttribute)edgeitemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEDGEITEM_INDEX() {
		return (EAttribute)edgeitemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEDGEITEM_XCOORD() {
		return (EAttribute)edgeitemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEDGEITEM_YCOORD() {
		return (EAttribute)edgeitemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEDGE() {
		return edgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEDGE_ID() {
		return (EAttribute)edgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEDGE_FROMPOINTID() {
		return (EAttribute)edgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEDGE_TOPOINTID() {
		return (EAttribute)edgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTest() {
		return testEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTest_Id() {
		return (EAttribute)testEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrafficFactory getTrafficFactory() {
		return (TrafficFactory)getEFactoryInstance();
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
		detectorEClass = createEClass(DETECTOR);
		createEAttribute(detectorEClass, DETECTOR__NO);
		createEAttribute(detectorEClass, DETECTOR__CODE);
		createEAttribute(detectorEClass, DETECTOR__NAME);
		createEAttribute(detectorEClass, DETECTOR__COUNTLOCATIONNO);
		createEAttribute(detectorEClass, DETECTOR__TYPENO);
		createEAttribute(detectorEClass, DETECTOR__XCOORD);
		createEAttribute(detectorEClass, DETECTOR__YCOORD);
		createEAttribute(detectorEClass, DETECTOR__LANEONLINK);
		createEAttribute(detectorEClass, DETECTOR__NUMLANESONLINK);
		createEAttribute(detectorEClass, DETECTOR__ENABLED);
		createEAttribute(detectorEClass, DETECTOR__NODENO);
		createEAttribute(detectorEClass, DETECTOR__MAINNODENO);
		createEAttribute(detectorEClass, DETECTOR__CHANNELNO);
		createEAttribute(detectorEClass, DETECTOR__STOPLINEDIST);
		createEAttribute(detectorEClass, DETECTOR__LENGTH);
		createEAttribute(detectorEClass, DETECTOR__TSYSSET);
		createEAttribute(detectorEClass, DETECTOR__SCNO);
		createEAttribute(detectorEClass, DETECTOR__DETECTORTYPE);
		createEAttribute(detectorEClass, DETECTOR__DELAY);
		createEAttribute(detectorEClass, DETECTOR__EXTEND);
		createEAttribute(detectorEClass, DETECTOR__CARRYOVER);
		createEAttribute(detectorEClass, DETECTOR__QUEUELIMIT);
		createEAttribute(detectorEClass, DETECTOR__DETECTORMODE);
		createEAttribute(detectorEClass, DETECTOR__ADDEDINITIALMODE);
		createEAttribute(detectorEClass, DETECTOR__CALL);
		createEAttribute(detectorEClass, DETECTOR__AMBERLOCK);
		createEAttribute(detectorEClass, DETECTOR__REDLOCK);
		createEAttribute(detectorEClass, DETECTOR__EXTENDSGS);
		createEAttribute(detectorEClass, DETECTOR__XSWITCHSGS);
		createEAttribute(detectorEClass, DETECTOR__VEHDETECTORNO);
		createEAttribute(detectorEClass, DETECTOR__DELAYON);
		createEAttribute(detectorEClass, DETECTOR__DELAYOFF);
		createEAttribute(detectorEClass, DETECTOR__CONTROL);
		createEAttribute(detectorEClass, DETECTOR__ACTION);
		createEAttribute(detectorEClass, DETECTOR__ACTIONSGNO);
		createEAttribute(detectorEClass, DETECTOR__ACTIONPREEMPTNO);
		createEAttribute(detectorEClass, DETECTOR__ACTIONTRANSITSGNO);
		createEAttribute(detectorEClass, DETECTOR__RBCNO);
		createEAttribute(detectorEClass, DETECTOR__LABELPOSRELX);
		createEAttribute(detectorEClass, DETECTOR__DET_AU);
		createEAttribute(detectorEClass, DETECTOR__DET_BEM);
		createEAttribute(detectorEClass, DETECTOR__DET_KO);
		createEAttribute(detectorEClass, DETECTOR__DET_Q);
		createEAttribute(detectorEClass, DETECTOR__DET_QS);
		createEAttribute(detectorEClass, DETECTOR__DET_SP);
		createEAttribute(detectorEClass, DETECTOR__DET_ST);
		createEAttribute(detectorEClass, DETECTOR__DET_VO);

		pointEClass = createEClass(POINT);
		createEAttribute(pointEClass, POINT__ID);
		createEAttribute(pointEClass, POINT__XCOORD);
		createEAttribute(pointEClass, POINT__YCOORD);

		edgeitemEClass = createEClass(EDGEITEM);
		createEAttribute(edgeitemEClass, EDGEITEM__EDGEID);
		createEAttribute(edgeitemEClass, EDGEITEM__INDEX);
		createEAttribute(edgeitemEClass, EDGEITEM__XCOORD);
		createEAttribute(edgeitemEClass, EDGEITEM__YCOORD);

		edgeEClass = createEClass(EDGE);
		createEAttribute(edgeEClass, EDGE__ID);
		createEAttribute(edgeEClass, EDGE__FROMPOINTID);
		createEAttribute(edgeEClass, EDGE__TOPOINTID);

		testEClass = createEClass(TEST);
		createEAttribute(testEClass, TEST__ID);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(detectorEClass, de.jena.mdo.asset.traffic.DETECTOR.class, "DETECTOR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDETECTOR_NO(), ecorePackage.getEBigInteger(), "NO", null, 1, 1, de.jena.mdo.asset.traffic.DETECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDETECTOR_CODE(), ecorePackage.getEString(), "CODE", null, 0, 1, de.jena.mdo.asset.traffic.DETECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDETECTOR_NAME(), ecorePackage.getEString(), "NAME", null, 0, 1, de.jena.mdo.asset.traffic.DETECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDETECTOR_COUNTLOCATIONNO(), ecorePackage.getEBigInteger(), "COUNTLOCATIONNO", null, 0, 1, de.jena.mdo.asset.traffic.DETECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDETECTOR_TYPENO(), ecorePackage.getEBigInteger(), "TYPENO", null, 0, 1, de.jena.mdo.asset.traffic.DETECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDETECTOR_XCOORD(), ecorePackage.getEDouble(), "XCOORD", null, 0, 1, de.jena.mdo.asset.traffic.DETECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDETECTOR_YCOORD(), ecorePackage.getEDouble(), "YCOORD", null, 0, 1, de.jena.mdo.asset.traffic.DETECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDETECTOR_LANEONLINK(), ecorePackage.getEBigInteger(), "LANEONLINK", null, 0, 1, de.jena.mdo.asset.traffic.DETECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDETECTOR_NUMLANESONLINK(), ecorePackage.getEBigInteger(), "NUMLANESONLINK", null, 0, 1, de.jena.mdo.asset.traffic.DETECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDETECTOR_ENABLED(), ecorePackage.getEBigInteger(), "ENABLED", null, 0, 1, de.jena.mdo.asset.traffic.DETECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDETECTOR_NODENO(), ecorePackage.getEBigInteger(), "NODENO", null, 0, 1, de.jena.mdo.asset.traffic.DETECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDETECTOR_MAINNODENO(), ecorePackage.getEBigInteger(), "MAINNODENO", null, 0, 1, de.jena.mdo.asset.traffic.DETECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDETECTOR_CHANNELNO(), ecorePackage.getEBigInteger(), "CHANNELNO", null, 0, 1, de.jena.mdo.asset.traffic.DETECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDETECTOR_STOPLINEDIST(), ecorePackage.getEDouble(), "STOPLINEDIST", null, 0, 1, de.jena.mdo.asset.traffic.DETECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDETECTOR_LENGTH(), ecorePackage.getEDouble(), "LENGTH", null, 0, 1, de.jena.mdo.asset.traffic.DETECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDETECTOR_TSYSSET(), ecorePackage.getEString(), "TSYSSET", null, 0, 1, de.jena.mdo.asset.traffic.DETECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDETECTOR_SCNO(), ecorePackage.getEBigInteger(), "SCNO", null, 0, 1, de.jena.mdo.asset.traffic.DETECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDETECTOR_DETECTORTYPE(), ecorePackage.getEString(), "DETECTORTYPE", null, 0, 1, de.jena.mdo.asset.traffic.DETECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDETECTOR_DELAY(), ecorePackage.getEDouble(), "DELAY", null, 0, 1, de.jena.mdo.asset.traffic.DETECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDETECTOR_EXTEND(), ecorePackage.getEDouble(), "EXTEND", null, 0, 1, de.jena.mdo.asset.traffic.DETECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDETECTOR_CARRYOVER(), ecorePackage.getEDouble(), "CARRYOVER", null, 0, 1, de.jena.mdo.asset.traffic.DETECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDETECTOR_QUEUELIMIT(), ecorePackage.getEBigInteger(), "QUEUELIMIT", null, 0, 1, de.jena.mdo.asset.traffic.DETECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDETECTOR_DETECTORMODE(), ecorePackage.getEString(), "DETECTORMODE", null, 0, 1, de.jena.mdo.asset.traffic.DETECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDETECTOR_ADDEDINITIALMODE(), ecorePackage.getEBigInteger(), "ADDEDINITIALMODE", null, 0, 1, de.jena.mdo.asset.traffic.DETECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDETECTOR_CALL(), ecorePackage.getEString(), "CALL", null, 0, 1, de.jena.mdo.asset.traffic.DETECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDETECTOR_AMBERLOCK(), ecorePackage.getEString(), "AMBERLOCK", null, 0, 1, de.jena.mdo.asset.traffic.DETECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDETECTOR_REDLOCK(), ecorePackage.getEString(), "REDLOCK", null, 0, 1, de.jena.mdo.asset.traffic.DETECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDETECTOR_EXTENDSGS(), ecorePackage.getEString(), "EXTENDSGS", null, 0, 1, de.jena.mdo.asset.traffic.DETECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDETECTOR_XSWITCHSGS(), ecorePackage.getEString(), "XSWITCHSGS", null, 0, 1, de.jena.mdo.asset.traffic.DETECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDETECTOR_VEHDETECTORNO(), ecorePackage.getEBigInteger(), "VEHDETECTORNO", null, 0, 1, de.jena.mdo.asset.traffic.DETECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDETECTOR_DELAYON(), ecorePackage.getEBigInteger(), "DELAYON", null, 0, 1, de.jena.mdo.asset.traffic.DETECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDETECTOR_DELAYOFF(), ecorePackage.getEBigInteger(), "DELAYOFF", null, 0, 1, de.jena.mdo.asset.traffic.DETECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDETECTOR_CONTROL(), ecorePackage.getEString(), "CONTROL", null, 0, 1, de.jena.mdo.asset.traffic.DETECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDETECTOR_ACTION(), ecorePackage.getEString(), "ACTION", null, 0, 1, de.jena.mdo.asset.traffic.DETECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDETECTOR_ACTIONSGNO(), ecorePackage.getEBigInteger(), "ACTIONSGNO", null, 0, 1, de.jena.mdo.asset.traffic.DETECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDETECTOR_ACTIONPREEMPTNO(), ecorePackage.getEBigInteger(), "ACTIONPREEMPTNO", null, 0, 1, de.jena.mdo.asset.traffic.DETECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDETECTOR_ACTIONTRANSITSGNO(), ecorePackage.getEBigInteger(), "ACTIONTRANSITSGNO", null, 0, 1, de.jena.mdo.asset.traffic.DETECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDETECTOR_RBCNO(), ecorePackage.getEBigInteger(), "RBCNO", null, 0, 1, de.jena.mdo.asset.traffic.DETECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDETECTOR_LABELPOSRELX(), ecorePackage.getEDouble(), "LABELPOSRELX", null, 0, 1, de.jena.mdo.asset.traffic.DETECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDETECTOR_DET_AU(), ecorePackage.getEString(), "DET_AU", null, 0, 1, de.jena.mdo.asset.traffic.DETECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDETECTOR_DET_BEM(), ecorePackage.getEString(), "DET_BEM", null, 0, 1, de.jena.mdo.asset.traffic.DETECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDETECTOR_DET_KO(), ecorePackage.getEBigInteger(), "DET_KO", null, 0, 1, de.jena.mdo.asset.traffic.DETECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDETECTOR_DET_Q(), ecorePackage.getEString(), "DET_Q", null, 0, 1, de.jena.mdo.asset.traffic.DETECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDETECTOR_DET_QS(), ecorePackage.getEBigInteger(), "DET_QS", null, 0, 1, de.jena.mdo.asset.traffic.DETECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDETECTOR_DET_SP(), ecorePackage.getEString(), "DET_SP", null, 0, 1, de.jena.mdo.asset.traffic.DETECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDETECTOR_DET_ST(), ecorePackage.getEString(), "DET_ST", null, 0, 1, de.jena.mdo.asset.traffic.DETECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDETECTOR_DET_VO(), ecorePackage.getEString(), "DET_VO", null, 0, 1, de.jena.mdo.asset.traffic.DETECTOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointEClass, de.jena.mdo.asset.traffic.POINT.class, "POINT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPOINT_ID(), ecorePackage.getEBigInteger(), "ID", null, 1, 1, de.jena.mdo.asset.traffic.POINT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPOINT_XCOORD(), ecorePackage.getEDouble(), "XCOORD", null, 0, 1, de.jena.mdo.asset.traffic.POINT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPOINT_YCOORD(), ecorePackage.getEDouble(), "YCOORD", null, 0, 1, de.jena.mdo.asset.traffic.POINT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgeitemEClass, de.jena.mdo.asset.traffic.EDGEITEM.class, "EDGEITEM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEDGEITEM_EDGEID(), ecorePackage.getEBigInteger(), "EDGEID", null, 1, 1, de.jena.mdo.asset.traffic.EDGEITEM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEDGEITEM_INDEX(), ecorePackage.getEBigInteger(), "INDEX", null, 1, 1, de.jena.mdo.asset.traffic.EDGEITEM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEDGEITEM_XCOORD(), ecorePackage.getEDouble(), "XCOORD", null, 0, 1, de.jena.mdo.asset.traffic.EDGEITEM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEDGEITEM_YCOORD(), ecorePackage.getEDouble(), "YCOORD", null, 0, 1, de.jena.mdo.asset.traffic.EDGEITEM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgeEClass, de.jena.mdo.asset.traffic.EDGE.class, "EDGE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEDGE_ID(), ecorePackage.getEBigInteger(), "ID", null, 1, 1, de.jena.mdo.asset.traffic.EDGE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEDGE_FROMPOINTID(), ecorePackage.getEBigInteger(), "FROMPOINTID", null, 1, 1, de.jena.mdo.asset.traffic.EDGE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEDGE_TOPOINTID(), ecorePackage.getEBigInteger(), "TOPOINTID", null, 1, 1, de.jena.mdo.asset.traffic.EDGE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testEClass, Test.class, "Test", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTest_Id(), ecorePackage.getEString(), "id", null, 0, 1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// Piveau
		createPiveauAnnotations();
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
			   "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>Piveau</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPiveauAnnotations() {
		String source = "Piveau";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "keyword", "verkehr, detektoren, detectors, traffic",
			   "theme", "http://publications.europa.eu/resource/authority/data-theme/TRAN",
			   "root", "DETECTOR"
		   });
	}

} //TrafficPackageImpl
