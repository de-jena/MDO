/*
 */
package de.jena.mdo.asset.traffic;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;

import org.gecko.emf.osgi.annotation.provide.EPackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.jena.mdo.asset.traffic.TrafficFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="Piveau keyword='verkehr, detektoren, detectors, traffic' theme='http://publications.europa.eu/resource/authority/data-theme/TRAN' root='DETECTOR'"
 * @generated
 */
@ProviderType
@EPackage(uri = TrafficPackage.eNS_URI, genModel = "/model/traffic.genmodel")
public interface TrafficPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "traffic";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://jena.de/mdo/traffic/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "traffic";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TrafficPackage eINSTANCE = de.jena.mdo.asset.traffic.impl.TrafficPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl <em>DETECTOR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.asset.traffic.impl.DETECTORImpl
	 * @see de.jena.mdo.asset.traffic.impl.TrafficPackageImpl#getDETECTOR()
	 * @generated
	 */
	int DETECTOR = 0;

	/**
	 * The feature id for the '<em><b>NO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__NO = 0;

	/**
	 * The feature id for the '<em><b>CODE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__CODE = 1;

	/**
	 * The feature id for the '<em><b>NAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__NAME = 2;

	/**
	 * The feature id for the '<em><b>COUNTLOCATIONNO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__COUNTLOCATIONNO = 3;

	/**
	 * The feature id for the '<em><b>TYPENO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__TYPENO = 4;

	/**
	 * The feature id for the '<em><b>XCOORD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__XCOORD = 5;

	/**
	 * The feature id for the '<em><b>YCOORD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__YCOORD = 6;

	/**
	 * The feature id for the '<em><b>LANEONLINK</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__LANEONLINK = 7;

	/**
	 * The feature id for the '<em><b>NUMLANESONLINK</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__NUMLANESONLINK = 8;

	/**
	 * The feature id for the '<em><b>ENABLED</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__ENABLED = 9;

	/**
	 * The feature id for the '<em><b>NODENO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__NODENO = 10;

	/**
	 * The feature id for the '<em><b>MAINNODENO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__MAINNODENO = 11;

	/**
	 * The feature id for the '<em><b>CHANNELNO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__CHANNELNO = 12;

	/**
	 * The feature id for the '<em><b>STOPLINEDIST</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__STOPLINEDIST = 13;

	/**
	 * The feature id for the '<em><b>LENGTH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__LENGTH = 14;

	/**
	 * The feature id for the '<em><b>TSYSSET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__TSYSSET = 15;

	/**
	 * The feature id for the '<em><b>SCNO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__SCNO = 16;

	/**
	 * The feature id for the '<em><b>DETECTORTYPE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__DETECTORTYPE = 17;

	/**
	 * The feature id for the '<em><b>DELAY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__DELAY = 18;

	/**
	 * The feature id for the '<em><b>EXTEND</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__EXTEND = 19;

	/**
	 * The feature id for the '<em><b>CARRYOVER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__CARRYOVER = 20;

	/**
	 * The feature id for the '<em><b>QUEUELIMIT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__QUEUELIMIT = 21;

	/**
	 * The feature id for the '<em><b>DETECTORMODE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__DETECTORMODE = 22;

	/**
	 * The feature id for the '<em><b>ADDEDINITIALMODE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__ADDEDINITIALMODE = 23;

	/**
	 * The feature id for the '<em><b>CALL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__CALL = 24;

	/**
	 * The feature id for the '<em><b>AMBERLOCK</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__AMBERLOCK = 25;

	/**
	 * The feature id for the '<em><b>REDLOCK</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__REDLOCK = 26;

	/**
	 * The feature id for the '<em><b>EXTENDSGS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__EXTENDSGS = 27;

	/**
	 * The feature id for the '<em><b>XSWITCHSGS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__XSWITCHSGS = 28;

	/**
	 * The feature id for the '<em><b>VEHDETECTORNO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__VEHDETECTORNO = 29;

	/**
	 * The feature id for the '<em><b>DELAYON</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__DELAYON = 30;

	/**
	 * The feature id for the '<em><b>DELAYOFF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__DELAYOFF = 31;

	/**
	 * The feature id for the '<em><b>CONTROL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__CONTROL = 32;

	/**
	 * The feature id for the '<em><b>ACTION</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__ACTION = 33;

	/**
	 * The feature id for the '<em><b>ACTIONSGNO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__ACTIONSGNO = 34;

	/**
	 * The feature id for the '<em><b>ACTIONPREEMPTNO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__ACTIONPREEMPTNO = 35;

	/**
	 * The feature id for the '<em><b>ACTIONTRANSITSGNO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__ACTIONTRANSITSGNO = 36;

	/**
	 * The feature id for the '<em><b>RBCNO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__RBCNO = 37;

	/**
	 * The feature id for the '<em><b>LABELPOSRELX</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__LABELPOSRELX = 38;

	/**
	 * The feature id for the '<em><b>DET AU</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__DET_AU = 39;

	/**
	 * The feature id for the '<em><b>DET BEM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__DET_BEM = 40;

	/**
	 * The feature id for the '<em><b>DET KO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__DET_KO = 41;

	/**
	 * The feature id for the '<em><b>DET Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__DET_Q = 42;

	/**
	 * The feature id for the '<em><b>DET QS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__DET_QS = 43;

	/**
	 * The feature id for the '<em><b>DET SP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__DET_SP = 44;

	/**
	 * The feature id for the '<em><b>DET ST</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__DET_ST = 45;

	/**
	 * The feature id for the '<em><b>DET VO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__DET_VO = 46;

	/**
	 * The number of structural features of the '<em>DETECTOR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR_FEATURE_COUNT = 47;

	/**
	 * The number of operations of the '<em>DETECTOR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.asset.traffic.impl.POINTImpl <em>POINT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.asset.traffic.impl.POINTImpl
	 * @see de.jena.mdo.asset.traffic.impl.TrafficPackageImpl#getPOINT()
	 * @generated
	 */
	int POINT = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__ID = 0;

	/**
	 * The feature id for the '<em><b>XCOORD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__XCOORD = 1;

	/**
	 * The feature id for the '<em><b>YCOORD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__YCOORD = 2;

	/**
	 * The number of structural features of the '<em>POINT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>POINT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.asset.traffic.impl.EDGEITEMImpl <em>EDGEITEM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.asset.traffic.impl.EDGEITEMImpl
	 * @see de.jena.mdo.asset.traffic.impl.TrafficPackageImpl#getEDGEITEM()
	 * @generated
	 */
	int EDGEITEM = 2;

	/**
	 * The feature id for the '<em><b>EDGEID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGEITEM__EDGEID = 0;

	/**
	 * The feature id for the '<em><b>INDEX</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGEITEM__INDEX = 1;

	/**
	 * The feature id for the '<em><b>XCOORD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGEITEM__XCOORD = 2;

	/**
	 * The feature id for the '<em><b>YCOORD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGEITEM__YCOORD = 3;

	/**
	 * The number of structural features of the '<em>EDGEITEM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGEITEM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>EDGEITEM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGEITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.asset.traffic.impl.EDGEImpl <em>EDGE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.asset.traffic.impl.EDGEImpl
	 * @see de.jena.mdo.asset.traffic.impl.TrafficPackageImpl#getEDGE()
	 * @generated
	 */
	int EDGE = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__ID = 0;

	/**
	 * The feature id for the '<em><b>FROMPOINTID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__FROMPOINTID = 1;

	/**
	 * The feature id for the '<em><b>TOPOINTID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TOPOINTID = 2;

	/**
	 * The number of structural features of the '<em>EDGE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>EDGE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.jena.mdo.asset.traffic.DETECTOR <em>DETECTOR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DETECTOR</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR
	 * @generated
	 */
	EClass getDETECTOR();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.DETECTOR#getNO <em>NO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NO</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR#getNO()
	 * @see #getDETECTOR()
	 * @generated
	 */
	EAttribute getDETECTOR_NO();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.DETECTOR#getCODE <em>CODE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CODE</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR#getCODE()
	 * @see #getDETECTOR()
	 * @generated
	 */
	EAttribute getDETECTOR_CODE();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.DETECTOR#getNAME <em>NAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NAME</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR#getNAME()
	 * @see #getDETECTOR()
	 * @generated
	 */
	EAttribute getDETECTOR_NAME();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.DETECTOR#getCOUNTLOCATIONNO <em>COUNTLOCATIONNO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>COUNTLOCATIONNO</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR#getCOUNTLOCATIONNO()
	 * @see #getDETECTOR()
	 * @generated
	 */
	EAttribute getDETECTOR_COUNTLOCATIONNO();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.DETECTOR#getTYPENO <em>TYPENO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TYPENO</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR#getTYPENO()
	 * @see #getDETECTOR()
	 * @generated
	 */
	EAttribute getDETECTOR_TYPENO();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.DETECTOR#getXCOORD <em>XCOORD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XCOORD</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR#getXCOORD()
	 * @see #getDETECTOR()
	 * @generated
	 */
	EAttribute getDETECTOR_XCOORD();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.DETECTOR#getYCOORD <em>YCOORD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YCOORD</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR#getYCOORD()
	 * @see #getDETECTOR()
	 * @generated
	 */
	EAttribute getDETECTOR_YCOORD();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.DETECTOR#getLANEONLINK <em>LANEONLINK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LANEONLINK</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR#getLANEONLINK()
	 * @see #getDETECTOR()
	 * @generated
	 */
	EAttribute getDETECTOR_LANEONLINK();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.DETECTOR#getNUMLANESONLINK <em>NUMLANESONLINK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NUMLANESONLINK</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR#getNUMLANESONLINK()
	 * @see #getDETECTOR()
	 * @generated
	 */
	EAttribute getDETECTOR_NUMLANESONLINK();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.DETECTOR#getENABLED <em>ENABLED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ENABLED</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR#getENABLED()
	 * @see #getDETECTOR()
	 * @generated
	 */
	EAttribute getDETECTOR_ENABLED();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.DETECTOR#getNODENO <em>NODENO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NODENO</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR#getNODENO()
	 * @see #getDETECTOR()
	 * @generated
	 */
	EAttribute getDETECTOR_NODENO();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.DETECTOR#getMAINNODENO <em>MAINNODENO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MAINNODENO</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR#getMAINNODENO()
	 * @see #getDETECTOR()
	 * @generated
	 */
	EAttribute getDETECTOR_MAINNODENO();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.DETECTOR#getCHANNELNO <em>CHANNELNO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CHANNELNO</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR#getCHANNELNO()
	 * @see #getDETECTOR()
	 * @generated
	 */
	EAttribute getDETECTOR_CHANNELNO();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.DETECTOR#getSTOPLINEDIST <em>STOPLINEDIST</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>STOPLINEDIST</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR#getSTOPLINEDIST()
	 * @see #getDETECTOR()
	 * @generated
	 */
	EAttribute getDETECTOR_STOPLINEDIST();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.DETECTOR#getLENGTH <em>LENGTH</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LENGTH</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR#getLENGTH()
	 * @see #getDETECTOR()
	 * @generated
	 */
	EAttribute getDETECTOR_LENGTH();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.DETECTOR#getTSYSSET <em>TSYSSET</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TSYSSET</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR#getTSYSSET()
	 * @see #getDETECTOR()
	 * @generated
	 */
	EAttribute getDETECTOR_TSYSSET();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.DETECTOR#getSCNO <em>SCNO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SCNO</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR#getSCNO()
	 * @see #getDETECTOR()
	 * @generated
	 */
	EAttribute getDETECTOR_SCNO();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.DETECTOR#getDETECTORTYPE <em>DETECTORTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DETECTORTYPE</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR#getDETECTORTYPE()
	 * @see #getDETECTOR()
	 * @generated
	 */
	EAttribute getDETECTOR_DETECTORTYPE();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.DETECTOR#getDELAY <em>DELAY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DELAY</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR#getDELAY()
	 * @see #getDETECTOR()
	 * @generated
	 */
	EAttribute getDETECTOR_DELAY();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.DETECTOR#getEXTEND <em>EXTEND</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EXTEND</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR#getEXTEND()
	 * @see #getDETECTOR()
	 * @generated
	 */
	EAttribute getDETECTOR_EXTEND();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.DETECTOR#getCARRYOVER <em>CARRYOVER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CARRYOVER</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR#getCARRYOVER()
	 * @see #getDETECTOR()
	 * @generated
	 */
	EAttribute getDETECTOR_CARRYOVER();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.DETECTOR#getQUEUELIMIT <em>QUEUELIMIT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>QUEUELIMIT</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR#getQUEUELIMIT()
	 * @see #getDETECTOR()
	 * @generated
	 */
	EAttribute getDETECTOR_QUEUELIMIT();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.DETECTOR#getDETECTORMODE <em>DETECTORMODE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DETECTORMODE</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR#getDETECTORMODE()
	 * @see #getDETECTOR()
	 * @generated
	 */
	EAttribute getDETECTOR_DETECTORMODE();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.DETECTOR#getADDEDINITIALMODE <em>ADDEDINITIALMODE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ADDEDINITIALMODE</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR#getADDEDINITIALMODE()
	 * @see #getDETECTOR()
	 * @generated
	 */
	EAttribute getDETECTOR_ADDEDINITIALMODE();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.DETECTOR#getCALL <em>CALL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CALL</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR#getCALL()
	 * @see #getDETECTOR()
	 * @generated
	 */
	EAttribute getDETECTOR_CALL();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.DETECTOR#getAMBERLOCK <em>AMBERLOCK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AMBERLOCK</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR#getAMBERLOCK()
	 * @see #getDETECTOR()
	 * @generated
	 */
	EAttribute getDETECTOR_AMBERLOCK();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.DETECTOR#getREDLOCK <em>REDLOCK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>REDLOCK</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR#getREDLOCK()
	 * @see #getDETECTOR()
	 * @generated
	 */
	EAttribute getDETECTOR_REDLOCK();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.DETECTOR#getEXTENDSGS <em>EXTENDSGS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EXTENDSGS</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR#getEXTENDSGS()
	 * @see #getDETECTOR()
	 * @generated
	 */
	EAttribute getDETECTOR_EXTENDSGS();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.DETECTOR#getXSWITCHSGS <em>XSWITCHSGS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XSWITCHSGS</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR#getXSWITCHSGS()
	 * @see #getDETECTOR()
	 * @generated
	 */
	EAttribute getDETECTOR_XSWITCHSGS();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.DETECTOR#getVEHDETECTORNO <em>VEHDETECTORNO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>VEHDETECTORNO</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR#getVEHDETECTORNO()
	 * @see #getDETECTOR()
	 * @generated
	 */
	EAttribute getDETECTOR_VEHDETECTORNO();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.DETECTOR#getDELAYON <em>DELAYON</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DELAYON</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR#getDELAYON()
	 * @see #getDETECTOR()
	 * @generated
	 */
	EAttribute getDETECTOR_DELAYON();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.DETECTOR#getDELAYOFF <em>DELAYOFF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DELAYOFF</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR#getDELAYOFF()
	 * @see #getDETECTOR()
	 * @generated
	 */
	EAttribute getDETECTOR_DELAYOFF();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.DETECTOR#getCONTROL <em>CONTROL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CONTROL</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR#getCONTROL()
	 * @see #getDETECTOR()
	 * @generated
	 */
	EAttribute getDETECTOR_CONTROL();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.DETECTOR#getACTION <em>ACTION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ACTION</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR#getACTION()
	 * @see #getDETECTOR()
	 * @generated
	 */
	EAttribute getDETECTOR_ACTION();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.DETECTOR#getACTIONSGNO <em>ACTIONSGNO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ACTIONSGNO</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR#getACTIONSGNO()
	 * @see #getDETECTOR()
	 * @generated
	 */
	EAttribute getDETECTOR_ACTIONSGNO();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.DETECTOR#getACTIONPREEMPTNO <em>ACTIONPREEMPTNO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ACTIONPREEMPTNO</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR#getACTIONPREEMPTNO()
	 * @see #getDETECTOR()
	 * @generated
	 */
	EAttribute getDETECTOR_ACTIONPREEMPTNO();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.DETECTOR#getACTIONTRANSITSGNO <em>ACTIONTRANSITSGNO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ACTIONTRANSITSGNO</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR#getACTIONTRANSITSGNO()
	 * @see #getDETECTOR()
	 * @generated
	 */
	EAttribute getDETECTOR_ACTIONTRANSITSGNO();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.DETECTOR#getRBCNO <em>RBCNO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RBCNO</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR#getRBCNO()
	 * @see #getDETECTOR()
	 * @generated
	 */
	EAttribute getDETECTOR_RBCNO();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.DETECTOR#getLABELPOSRELX <em>LABELPOSRELX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LABELPOSRELX</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR#getLABELPOSRELX()
	 * @see #getDETECTOR()
	 * @generated
	 */
	EAttribute getDETECTOR_LABELPOSRELX();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.DETECTOR#getDET_AU <em>DET AU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DET AU</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR#getDET_AU()
	 * @see #getDETECTOR()
	 * @generated
	 */
	EAttribute getDETECTOR_DET_AU();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.DETECTOR#getDET_BEM <em>DET BEM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DET BEM</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR#getDET_BEM()
	 * @see #getDETECTOR()
	 * @generated
	 */
	EAttribute getDETECTOR_DET_BEM();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.DETECTOR#getDET_KO <em>DET KO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DET KO</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR#getDET_KO()
	 * @see #getDETECTOR()
	 * @generated
	 */
	EAttribute getDETECTOR_DET_KO();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.DETECTOR#getDET_Q <em>DET Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DET Q</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR#getDET_Q()
	 * @see #getDETECTOR()
	 * @generated
	 */
	EAttribute getDETECTOR_DET_Q();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.DETECTOR#getDET_QS <em>DET QS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DET QS</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR#getDET_QS()
	 * @see #getDETECTOR()
	 * @generated
	 */
	EAttribute getDETECTOR_DET_QS();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.DETECTOR#getDET_SP <em>DET SP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DET SP</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR#getDET_SP()
	 * @see #getDETECTOR()
	 * @generated
	 */
	EAttribute getDETECTOR_DET_SP();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.DETECTOR#getDET_ST <em>DET ST</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DET ST</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR#getDET_ST()
	 * @see #getDETECTOR()
	 * @generated
	 */
	EAttribute getDETECTOR_DET_ST();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.DETECTOR#getDET_VO <em>DET VO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DET VO</em>'.
	 * @see de.jena.mdo.asset.traffic.DETECTOR#getDET_VO()
	 * @see #getDETECTOR()
	 * @generated
	 */
	EAttribute getDETECTOR_DET_VO();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.asset.traffic.POINT <em>POINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>POINT</em>'.
	 * @see de.jena.mdo.asset.traffic.POINT
	 * @generated
	 */
	EClass getPOINT();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.POINT#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see de.jena.mdo.asset.traffic.POINT#getID()
	 * @see #getPOINT()
	 * @generated
	 */
	EAttribute getPOINT_ID();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.POINT#getXCOORD <em>XCOORD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XCOORD</em>'.
	 * @see de.jena.mdo.asset.traffic.POINT#getXCOORD()
	 * @see #getPOINT()
	 * @generated
	 */
	EAttribute getPOINT_XCOORD();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.POINT#getYCOORD <em>YCOORD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YCOORD</em>'.
	 * @see de.jena.mdo.asset.traffic.POINT#getYCOORD()
	 * @see #getPOINT()
	 * @generated
	 */
	EAttribute getPOINT_YCOORD();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.asset.traffic.EDGEITEM <em>EDGEITEM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EDGEITEM</em>'.
	 * @see de.jena.mdo.asset.traffic.EDGEITEM
	 * @generated
	 */
	EClass getEDGEITEM();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.EDGEITEM#getEDGEID <em>EDGEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EDGEID</em>'.
	 * @see de.jena.mdo.asset.traffic.EDGEITEM#getEDGEID()
	 * @see #getEDGEITEM()
	 * @generated
	 */
	EAttribute getEDGEITEM_EDGEID();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.EDGEITEM#getINDEX <em>INDEX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>INDEX</em>'.
	 * @see de.jena.mdo.asset.traffic.EDGEITEM#getINDEX()
	 * @see #getEDGEITEM()
	 * @generated
	 */
	EAttribute getEDGEITEM_INDEX();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.EDGEITEM#getXCOORD <em>XCOORD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XCOORD</em>'.
	 * @see de.jena.mdo.asset.traffic.EDGEITEM#getXCOORD()
	 * @see #getEDGEITEM()
	 * @generated
	 */
	EAttribute getEDGEITEM_XCOORD();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.EDGEITEM#getYCOORD <em>YCOORD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YCOORD</em>'.
	 * @see de.jena.mdo.asset.traffic.EDGEITEM#getYCOORD()
	 * @see #getEDGEITEM()
	 * @generated
	 */
	EAttribute getEDGEITEM_YCOORD();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.asset.traffic.EDGE <em>EDGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EDGE</em>'.
	 * @see de.jena.mdo.asset.traffic.EDGE
	 * @generated
	 */
	EClass getEDGE();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.EDGE#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see de.jena.mdo.asset.traffic.EDGE#getID()
	 * @see #getEDGE()
	 * @generated
	 */
	EAttribute getEDGE_ID();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.EDGE#getFROMPOINTID <em>FROMPOINTID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FROMPOINTID</em>'.
	 * @see de.jena.mdo.asset.traffic.EDGE#getFROMPOINTID()
	 * @see #getEDGE()
	 * @generated
	 */
	EAttribute getEDGE_FROMPOINTID();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.asset.traffic.EDGE#getTOPOINTID <em>TOPOINTID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TOPOINTID</em>'.
	 * @see de.jena.mdo.asset.traffic.EDGE#getTOPOINTID()
	 * @see #getEDGE()
	 * @generated
	 */
	EAttribute getEDGE_TOPOINTID();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TrafficFactory getTrafficFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl <em>DETECTOR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.asset.traffic.impl.DETECTORImpl
		 * @see de.jena.mdo.asset.traffic.impl.TrafficPackageImpl#getDETECTOR()
		 * @generated
		 */
		EClass DETECTOR = eINSTANCE.getDETECTOR();

		/**
		 * The meta object literal for the '<em><b>NO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTOR__NO = eINSTANCE.getDETECTOR_NO();

		/**
		 * The meta object literal for the '<em><b>CODE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTOR__CODE = eINSTANCE.getDETECTOR_CODE();

		/**
		 * The meta object literal for the '<em><b>NAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTOR__NAME = eINSTANCE.getDETECTOR_NAME();

		/**
		 * The meta object literal for the '<em><b>COUNTLOCATIONNO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTOR__COUNTLOCATIONNO = eINSTANCE.getDETECTOR_COUNTLOCATIONNO();

		/**
		 * The meta object literal for the '<em><b>TYPENO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTOR__TYPENO = eINSTANCE.getDETECTOR_TYPENO();

		/**
		 * The meta object literal for the '<em><b>XCOORD</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTOR__XCOORD = eINSTANCE.getDETECTOR_XCOORD();

		/**
		 * The meta object literal for the '<em><b>YCOORD</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTOR__YCOORD = eINSTANCE.getDETECTOR_YCOORD();

		/**
		 * The meta object literal for the '<em><b>LANEONLINK</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTOR__LANEONLINK = eINSTANCE.getDETECTOR_LANEONLINK();

		/**
		 * The meta object literal for the '<em><b>NUMLANESONLINK</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTOR__NUMLANESONLINK = eINSTANCE.getDETECTOR_NUMLANESONLINK();

		/**
		 * The meta object literal for the '<em><b>ENABLED</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTOR__ENABLED = eINSTANCE.getDETECTOR_ENABLED();

		/**
		 * The meta object literal for the '<em><b>NODENO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTOR__NODENO = eINSTANCE.getDETECTOR_NODENO();

		/**
		 * The meta object literal for the '<em><b>MAINNODENO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTOR__MAINNODENO = eINSTANCE.getDETECTOR_MAINNODENO();

		/**
		 * The meta object literal for the '<em><b>CHANNELNO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTOR__CHANNELNO = eINSTANCE.getDETECTOR_CHANNELNO();

		/**
		 * The meta object literal for the '<em><b>STOPLINEDIST</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTOR__STOPLINEDIST = eINSTANCE.getDETECTOR_STOPLINEDIST();

		/**
		 * The meta object literal for the '<em><b>LENGTH</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTOR__LENGTH = eINSTANCE.getDETECTOR_LENGTH();

		/**
		 * The meta object literal for the '<em><b>TSYSSET</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTOR__TSYSSET = eINSTANCE.getDETECTOR_TSYSSET();

		/**
		 * The meta object literal for the '<em><b>SCNO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTOR__SCNO = eINSTANCE.getDETECTOR_SCNO();

		/**
		 * The meta object literal for the '<em><b>DETECTORTYPE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTOR__DETECTORTYPE = eINSTANCE.getDETECTOR_DETECTORTYPE();

		/**
		 * The meta object literal for the '<em><b>DELAY</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTOR__DELAY = eINSTANCE.getDETECTOR_DELAY();

		/**
		 * The meta object literal for the '<em><b>EXTEND</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTOR__EXTEND = eINSTANCE.getDETECTOR_EXTEND();

		/**
		 * The meta object literal for the '<em><b>CARRYOVER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTOR__CARRYOVER = eINSTANCE.getDETECTOR_CARRYOVER();

		/**
		 * The meta object literal for the '<em><b>QUEUELIMIT</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTOR__QUEUELIMIT = eINSTANCE.getDETECTOR_QUEUELIMIT();

		/**
		 * The meta object literal for the '<em><b>DETECTORMODE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTOR__DETECTORMODE = eINSTANCE.getDETECTOR_DETECTORMODE();

		/**
		 * The meta object literal for the '<em><b>ADDEDINITIALMODE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTOR__ADDEDINITIALMODE = eINSTANCE.getDETECTOR_ADDEDINITIALMODE();

		/**
		 * The meta object literal for the '<em><b>CALL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTOR__CALL = eINSTANCE.getDETECTOR_CALL();

		/**
		 * The meta object literal for the '<em><b>AMBERLOCK</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTOR__AMBERLOCK = eINSTANCE.getDETECTOR_AMBERLOCK();

		/**
		 * The meta object literal for the '<em><b>REDLOCK</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTOR__REDLOCK = eINSTANCE.getDETECTOR_REDLOCK();

		/**
		 * The meta object literal for the '<em><b>EXTENDSGS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTOR__EXTENDSGS = eINSTANCE.getDETECTOR_EXTENDSGS();

		/**
		 * The meta object literal for the '<em><b>XSWITCHSGS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTOR__XSWITCHSGS = eINSTANCE.getDETECTOR_XSWITCHSGS();

		/**
		 * The meta object literal for the '<em><b>VEHDETECTORNO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTOR__VEHDETECTORNO = eINSTANCE.getDETECTOR_VEHDETECTORNO();

		/**
		 * The meta object literal for the '<em><b>DELAYON</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTOR__DELAYON = eINSTANCE.getDETECTOR_DELAYON();

		/**
		 * The meta object literal for the '<em><b>DELAYOFF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTOR__DELAYOFF = eINSTANCE.getDETECTOR_DELAYOFF();

		/**
		 * The meta object literal for the '<em><b>CONTROL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTOR__CONTROL = eINSTANCE.getDETECTOR_CONTROL();

		/**
		 * The meta object literal for the '<em><b>ACTION</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTOR__ACTION = eINSTANCE.getDETECTOR_ACTION();

		/**
		 * The meta object literal for the '<em><b>ACTIONSGNO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTOR__ACTIONSGNO = eINSTANCE.getDETECTOR_ACTIONSGNO();

		/**
		 * The meta object literal for the '<em><b>ACTIONPREEMPTNO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTOR__ACTIONPREEMPTNO = eINSTANCE.getDETECTOR_ACTIONPREEMPTNO();

		/**
		 * The meta object literal for the '<em><b>ACTIONTRANSITSGNO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTOR__ACTIONTRANSITSGNO = eINSTANCE.getDETECTOR_ACTIONTRANSITSGNO();

		/**
		 * The meta object literal for the '<em><b>RBCNO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTOR__RBCNO = eINSTANCE.getDETECTOR_RBCNO();

		/**
		 * The meta object literal for the '<em><b>LABELPOSRELX</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTOR__LABELPOSRELX = eINSTANCE.getDETECTOR_LABELPOSRELX();

		/**
		 * The meta object literal for the '<em><b>DET AU</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTOR__DET_AU = eINSTANCE.getDETECTOR_DET_AU();

		/**
		 * The meta object literal for the '<em><b>DET BEM</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTOR__DET_BEM = eINSTANCE.getDETECTOR_DET_BEM();

		/**
		 * The meta object literal for the '<em><b>DET KO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTOR__DET_KO = eINSTANCE.getDETECTOR_DET_KO();

		/**
		 * The meta object literal for the '<em><b>DET Q</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTOR__DET_Q = eINSTANCE.getDETECTOR_DET_Q();

		/**
		 * The meta object literal for the '<em><b>DET QS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTOR__DET_QS = eINSTANCE.getDETECTOR_DET_QS();

		/**
		 * The meta object literal for the '<em><b>DET SP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTOR__DET_SP = eINSTANCE.getDETECTOR_DET_SP();

		/**
		 * The meta object literal for the '<em><b>DET ST</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTOR__DET_ST = eINSTANCE.getDETECTOR_DET_ST();

		/**
		 * The meta object literal for the '<em><b>DET VO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETECTOR__DET_VO = eINSTANCE.getDETECTOR_DET_VO();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.asset.traffic.impl.POINTImpl <em>POINT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.asset.traffic.impl.POINTImpl
		 * @see de.jena.mdo.asset.traffic.impl.TrafficPackageImpl#getPOINT()
		 * @generated
		 */
		EClass POINT = eINSTANCE.getPOINT();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__ID = eINSTANCE.getPOINT_ID();

		/**
		 * The meta object literal for the '<em><b>XCOORD</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__XCOORD = eINSTANCE.getPOINT_XCOORD();

		/**
		 * The meta object literal for the '<em><b>YCOORD</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__YCOORD = eINSTANCE.getPOINT_YCOORD();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.asset.traffic.impl.EDGEITEMImpl <em>EDGEITEM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.asset.traffic.impl.EDGEITEMImpl
		 * @see de.jena.mdo.asset.traffic.impl.TrafficPackageImpl#getEDGEITEM()
		 * @generated
		 */
		EClass EDGEITEM = eINSTANCE.getEDGEITEM();

		/**
		 * The meta object literal for the '<em><b>EDGEID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGEITEM__EDGEID = eINSTANCE.getEDGEITEM_EDGEID();

		/**
		 * The meta object literal for the '<em><b>INDEX</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGEITEM__INDEX = eINSTANCE.getEDGEITEM_INDEX();

		/**
		 * The meta object literal for the '<em><b>XCOORD</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGEITEM__XCOORD = eINSTANCE.getEDGEITEM_XCOORD();

		/**
		 * The meta object literal for the '<em><b>YCOORD</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGEITEM__YCOORD = eINSTANCE.getEDGEITEM_YCOORD();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.asset.traffic.impl.EDGEImpl <em>EDGE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.asset.traffic.impl.EDGEImpl
		 * @see de.jena.mdo.asset.traffic.impl.TrafficPackageImpl#getEDGE()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEDGE();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__ID = eINSTANCE.getEDGE_ID();

		/**
		 * The meta object literal for the '<em><b>FROMPOINTID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__FROMPOINTID = eINSTANCE.getEDGE_FROMPOINTID();

		/**
		 * The meta object literal for the '<em><b>TOPOINTID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__TOPOINTID = eINSTANCE.getEDGE_TOPOINTID();

	}

} //TrafficPackage
