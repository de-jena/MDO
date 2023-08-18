/*
 */
package de.jena.mdo.asset.traffic.impl;

import de.jena.mdo.asset.traffic.DETECTOR;
import de.jena.mdo.asset.traffic.TrafficPackage;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DETECTOR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl#getNO <em>NO</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl#getCODE <em>CODE</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl#getNAME <em>NAME</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl#getCOUNTLOCATIONNO <em>COUNTLOCATIONNO</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl#getTYPENO <em>TYPENO</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl#getXCOORD <em>XCOORD</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl#getYCOORD <em>YCOORD</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl#getLANEONLINK <em>LANEONLINK</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl#getNUMLANESONLINK <em>NUMLANESONLINK</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl#getENABLED <em>ENABLED</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl#getNODENO <em>NODENO</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl#getMAINNODENO <em>MAINNODENO</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl#getCHANNELNO <em>CHANNELNO</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl#getSTOPLINEDIST <em>STOPLINEDIST</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl#getLENGTH <em>LENGTH</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl#getTSYSSET <em>TSYSSET</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl#getSCNO <em>SCNO</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl#getDETECTORTYPE <em>DETECTORTYPE</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl#getDELAY <em>DELAY</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl#getEXTEND <em>EXTEND</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl#getCARRYOVER <em>CARRYOVER</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl#getQUEUELIMIT <em>QUEUELIMIT</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl#getDETECTORMODE <em>DETECTORMODE</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl#getADDEDINITIALMODE <em>ADDEDINITIALMODE</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl#getCALL <em>CALL</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl#getAMBERLOCK <em>AMBERLOCK</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl#getREDLOCK <em>REDLOCK</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl#getEXTENDSGS <em>EXTENDSGS</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl#getXSWITCHSGS <em>XSWITCHSGS</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl#getVEHDETECTORNO <em>VEHDETECTORNO</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl#getDELAYON <em>DELAYON</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl#getDELAYOFF <em>DELAYOFF</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl#getCONTROL <em>CONTROL</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl#getACTION <em>ACTION</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl#getACTIONSGNO <em>ACTIONSGNO</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl#getACTIONPREEMPTNO <em>ACTIONPREEMPTNO</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl#getACTIONTRANSITSGNO <em>ACTIONTRANSITSGNO</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl#getRBCNO <em>RBCNO</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl#getLABELPOSRELX <em>LABELPOSRELX</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl#getDET_AU <em>DET AU</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl#getDET_BEM <em>DET BEM</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl#getDET_KO <em>DET KO</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl#getDET_Q <em>DET Q</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl#getDET_QS <em>DET QS</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl#getDET_SP <em>DET SP</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl#getDET_ST <em>DET ST</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.impl.DETECTORImpl#getDET_VO <em>DET VO</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DETECTORImpl extends MinimalEObjectImpl.Container implements DETECTOR {
	/**
	 * The default value of the '{@link #getNO() <em>NO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNO()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNO() <em>NO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNO()
	 * @generated
	 * @ordered
	 */
	protected BigInteger no = NO_EDEFAULT;

	/**
	 * The default value of the '{@link #getCODE() <em>CODE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCODE()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCODE() <em>CODE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCODE()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNAME() <em>NAME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNAME()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNAME() <em>NAME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNAME()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCOUNTLOCATIONNO() <em>COUNTLOCATIONNO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCOUNTLOCATIONNO()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger COUNTLOCATIONNO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCOUNTLOCATIONNO() <em>COUNTLOCATIONNO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCOUNTLOCATIONNO()
	 * @generated
	 * @ordered
	 */
	protected BigInteger countlocationno = COUNTLOCATIONNO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTYPENO() <em>TYPENO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTYPENO()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TYPENO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTYPENO() <em>TYPENO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTYPENO()
	 * @generated
	 * @ordered
	 */
	protected BigInteger typeno = TYPENO_EDEFAULT;

	/**
	 * The default value of the '{@link #getXCOORD() <em>XCOORD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXCOORD()
	 * @generated
	 * @ordered
	 */
	protected static final double XCOORD_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getXCOORD() <em>XCOORD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXCOORD()
	 * @generated
	 * @ordered
	 */
	protected double xcoord = XCOORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getYCOORD() <em>YCOORD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYCOORD()
	 * @generated
	 * @ordered
	 */
	protected static final double YCOORD_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getYCOORD() <em>YCOORD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYCOORD()
	 * @generated
	 * @ordered
	 */
	protected double ycoord = YCOORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getLANEONLINK() <em>LANEONLINK</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLANEONLINK()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger LANEONLINK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLANEONLINK() <em>LANEONLINK</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLANEONLINK()
	 * @generated
	 * @ordered
	 */
	protected BigInteger laneonlink = LANEONLINK_EDEFAULT;

	/**
	 * The default value of the '{@link #getNUMLANESONLINK() <em>NUMLANESONLINK</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNUMLANESONLINK()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUMLANESONLINK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNUMLANESONLINK() <em>NUMLANESONLINK</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNUMLANESONLINK()
	 * @generated
	 * @ordered
	 */
	protected BigInteger numlanesonlink = NUMLANESONLINK_EDEFAULT;

	/**
	 * The default value of the '{@link #getENABLED() <em>ENABLED</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getENABLED()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ENABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getENABLED() <em>ENABLED</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getENABLED()
	 * @generated
	 * @ordered
	 */
	protected BigInteger enabled = ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getNODENO() <em>NODENO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNODENO()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NODENO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNODENO() <em>NODENO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNODENO()
	 * @generated
	 * @ordered
	 */
	protected BigInteger nodeno = NODENO_EDEFAULT;

	/**
	 * The default value of the '{@link #getMAINNODENO() <em>MAINNODENO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMAINNODENO()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAINNODENO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMAINNODENO() <em>MAINNODENO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMAINNODENO()
	 * @generated
	 * @ordered
	 */
	protected BigInteger mainnodeno = MAINNODENO_EDEFAULT;

	/**
	 * The default value of the '{@link #getCHANNELNO() <em>CHANNELNO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCHANNELNO()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CHANNELNO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCHANNELNO() <em>CHANNELNO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCHANNELNO()
	 * @generated
	 * @ordered
	 */
	protected BigInteger channelno = CHANNELNO_EDEFAULT;

	/**
	 * The default value of the '{@link #getSTOPLINEDIST() <em>STOPLINEDIST</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTOPLINEDIST()
	 * @generated
	 * @ordered
	 */
	protected static final double STOPLINEDIST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSTOPLINEDIST() <em>STOPLINEDIST</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTOPLINEDIST()
	 * @generated
	 * @ordered
	 */
	protected double stoplinedist = STOPLINEDIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getLENGTH() <em>LENGTH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLENGTH()
	 * @generated
	 * @ordered
	 */
	protected static final double LENGTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLENGTH() <em>LENGTH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLENGTH()
	 * @generated
	 * @ordered
	 */
	protected double length = LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getTSYSSET() <em>TSYSSET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTSYSSET()
	 * @generated
	 * @ordered
	 */
	protected static final String TSYSSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTSYSSET() <em>TSYSSET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTSYSSET()
	 * @generated
	 * @ordered
	 */
	protected String tsysset = TSYSSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getSCNO() <em>SCNO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCNO()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SCNO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSCNO() <em>SCNO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCNO()
	 * @generated
	 * @ordered
	 */
	protected BigInteger scno = SCNO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDETECTORTYPE() <em>DETECTORTYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDETECTORTYPE()
	 * @generated
	 * @ordered
	 */
	protected static final String DETECTORTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDETECTORTYPE() <em>DETECTORTYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDETECTORTYPE()
	 * @generated
	 * @ordered
	 */
	protected String detectortype = DETECTORTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDELAY() <em>DELAY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDELAY()
	 * @generated
	 * @ordered
	 */
	protected static final double DELAY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDELAY() <em>DELAY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDELAY()
	 * @generated
	 * @ordered
	 */
	protected double delay = DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getEXTEND() <em>EXTEND</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEXTEND()
	 * @generated
	 * @ordered
	 */
	protected static final double EXTEND_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEXTEND() <em>EXTEND</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEXTEND()
	 * @generated
	 * @ordered
	 */
	protected double extend = EXTEND_EDEFAULT;

	/**
	 * The default value of the '{@link #getCARRYOVER() <em>CARRYOVER</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCARRYOVER()
	 * @generated
	 * @ordered
	 */
	protected static final double CARRYOVER_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCARRYOVER() <em>CARRYOVER</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCARRYOVER()
	 * @generated
	 * @ordered
	 */
	protected double carryover = CARRYOVER_EDEFAULT;

	/**
	 * The default value of the '{@link #getQUEUELIMIT() <em>QUEUELIMIT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQUEUELIMIT()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger QUEUELIMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQUEUELIMIT() <em>QUEUELIMIT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQUEUELIMIT()
	 * @generated
	 * @ordered
	 */
	protected BigInteger queuelimit = QUEUELIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDETECTORMODE() <em>DETECTORMODE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDETECTORMODE()
	 * @generated
	 * @ordered
	 */
	protected static final String DETECTORMODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDETECTORMODE() <em>DETECTORMODE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDETECTORMODE()
	 * @generated
	 * @ordered
	 */
	protected String detectormode = DETECTORMODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getADDEDINITIALMODE() <em>ADDEDINITIALMODE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getADDEDINITIALMODE()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ADDEDINITIALMODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getADDEDINITIALMODE() <em>ADDEDINITIALMODE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getADDEDINITIALMODE()
	 * @generated
	 * @ordered
	 */
	protected BigInteger addedinitialmode = ADDEDINITIALMODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCALL() <em>CALL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCALL()
	 * @generated
	 * @ordered
	 */
	protected static final String CALL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCALL() <em>CALL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCALL()
	 * @generated
	 * @ordered
	 */
	protected String call = CALL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAMBERLOCK() <em>AMBERLOCK</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAMBERLOCK()
	 * @generated
	 * @ordered
	 */
	protected static final String AMBERLOCK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAMBERLOCK() <em>AMBERLOCK</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAMBERLOCK()
	 * @generated
	 * @ordered
	 */
	protected String amberlock = AMBERLOCK_EDEFAULT;

	/**
	 * The default value of the '{@link #getREDLOCK() <em>REDLOCK</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getREDLOCK()
	 * @generated
	 * @ordered
	 */
	protected static final String REDLOCK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getREDLOCK() <em>REDLOCK</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getREDLOCK()
	 * @generated
	 * @ordered
	 */
	protected String redlock = REDLOCK_EDEFAULT;

	/**
	 * The default value of the '{@link #getEXTENDSGS() <em>EXTENDSGS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEXTENDSGS()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENDSGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEXTENDSGS() <em>EXTENDSGS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEXTENDSGS()
	 * @generated
	 * @ordered
	 */
	protected String extendsgs = EXTENDSGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getXSWITCHSGS() <em>XSWITCHSGS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSWITCHSGS()
	 * @generated
	 * @ordered
	 */
	protected static final String XSWITCHSGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXSWITCHSGS() <em>XSWITCHSGS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSWITCHSGS()
	 * @generated
	 * @ordered
	 */
	protected String xswitchsgs = XSWITCHSGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getVEHDETECTORNO() <em>VEHDETECTORNO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVEHDETECTORNO()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger VEHDETECTORNO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVEHDETECTORNO() <em>VEHDETECTORNO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVEHDETECTORNO()
	 * @generated
	 * @ordered
	 */
	protected BigInteger vehdetectorno = VEHDETECTORNO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDELAYON() <em>DELAYON</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDELAYON()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DELAYON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDELAYON() <em>DELAYON</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDELAYON()
	 * @generated
	 * @ordered
	 */
	protected BigInteger delayon = DELAYON_EDEFAULT;

	/**
	 * The default value of the '{@link #getDELAYOFF() <em>DELAYOFF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDELAYOFF()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DELAYOFF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDELAYOFF() <em>DELAYOFF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDELAYOFF()
	 * @generated
	 * @ordered
	 */
	protected BigInteger delayoff = DELAYOFF_EDEFAULT;

	/**
	 * The default value of the '{@link #getCONTROL() <em>CONTROL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTROL()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTROL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCONTROL() <em>CONTROL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTROL()
	 * @generated
	 * @ordered
	 */
	protected String control = CONTROL_EDEFAULT;

	/**
	 * The default value of the '{@link #getACTION() <em>ACTION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACTION()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getACTION() <em>ACTION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACTION()
	 * @generated
	 * @ordered
	 */
	protected String action = ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getACTIONSGNO() <em>ACTIONSGNO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACTIONSGNO()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ACTIONSGNO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getACTIONSGNO() <em>ACTIONSGNO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACTIONSGNO()
	 * @generated
	 * @ordered
	 */
	protected BigInteger actionsgno = ACTIONSGNO_EDEFAULT;

	/**
	 * The default value of the '{@link #getACTIONPREEMPTNO() <em>ACTIONPREEMPTNO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACTIONPREEMPTNO()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ACTIONPREEMPTNO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getACTIONPREEMPTNO() <em>ACTIONPREEMPTNO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACTIONPREEMPTNO()
	 * @generated
	 * @ordered
	 */
	protected BigInteger actionpreemptno = ACTIONPREEMPTNO_EDEFAULT;

	/**
	 * The default value of the '{@link #getACTIONTRANSITSGNO() <em>ACTIONTRANSITSGNO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACTIONTRANSITSGNO()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ACTIONTRANSITSGNO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getACTIONTRANSITSGNO() <em>ACTIONTRANSITSGNO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACTIONTRANSITSGNO()
	 * @generated
	 * @ordered
	 */
	protected BigInteger actiontransitsgno = ACTIONTRANSITSGNO_EDEFAULT;

	/**
	 * The default value of the '{@link #getRBCNO() <em>RBCNO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRBCNO()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger RBCNO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRBCNO() <em>RBCNO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRBCNO()
	 * @generated
	 * @ordered
	 */
	protected BigInteger rbcno = RBCNO_EDEFAULT;

	/**
	 * The default value of the '{@link #getLABELPOSRELX() <em>LABELPOSRELX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLABELPOSRELX()
	 * @generated
	 * @ordered
	 */
	protected static final double LABELPOSRELX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLABELPOSRELX() <em>LABELPOSRELX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLABELPOSRELX()
	 * @generated
	 * @ordered
	 */
	protected double labelposrelx = LABELPOSRELX_EDEFAULT;

	/**
	 * The default value of the '{@link #getDET_AU() <em>DET AU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDET_AU()
	 * @generated
	 * @ordered
	 */
	protected static final String DET_AU_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDET_AU() <em>DET AU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDET_AU()
	 * @generated
	 * @ordered
	 */
	protected String deT_AU = DET_AU_EDEFAULT;

	/**
	 * The default value of the '{@link #getDET_BEM() <em>DET BEM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDET_BEM()
	 * @generated
	 * @ordered
	 */
	protected static final String DET_BEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDET_BEM() <em>DET BEM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDET_BEM()
	 * @generated
	 * @ordered
	 */
	protected String deT_BEM = DET_BEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getDET_KO() <em>DET KO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDET_KO()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DET_KO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDET_KO() <em>DET KO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDET_KO()
	 * @generated
	 * @ordered
	 */
	protected BigInteger deT_KO = DET_KO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDET_Q() <em>DET Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDET_Q()
	 * @generated
	 * @ordered
	 */
	protected static final String DET_Q_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDET_Q() <em>DET Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDET_Q()
	 * @generated
	 * @ordered
	 */
	protected String deT_Q = DET_Q_EDEFAULT;

	/**
	 * The default value of the '{@link #getDET_QS() <em>DET QS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDET_QS()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DET_QS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDET_QS() <em>DET QS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDET_QS()
	 * @generated
	 * @ordered
	 */
	protected BigInteger deT_QS = DET_QS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDET_SP() <em>DET SP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDET_SP()
	 * @generated
	 * @ordered
	 */
	protected static final String DET_SP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDET_SP() <em>DET SP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDET_SP()
	 * @generated
	 * @ordered
	 */
	protected String deT_SP = DET_SP_EDEFAULT;

	/**
	 * The default value of the '{@link #getDET_ST() <em>DET ST</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDET_ST()
	 * @generated
	 * @ordered
	 */
	protected static final String DET_ST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDET_ST() <em>DET ST</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDET_ST()
	 * @generated
	 * @ordered
	 */
	protected String deT_ST = DET_ST_EDEFAULT;

	/**
	 * The default value of the '{@link #getDET_VO() <em>DET VO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDET_VO()
	 * @generated
	 * @ordered
	 */
	protected static final String DET_VO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDET_VO() <em>DET VO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDET_VO()
	 * @generated
	 * @ordered
	 */
	protected String deT_VO = DET_VO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DETECTORImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrafficPackage.Literals.DETECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getNO() {
		return no;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNO(BigInteger newNO) {
		BigInteger oldNO = no;
		no = newNO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.DETECTOR__NO, oldNO, no));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCODE() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCODE(String newCODE) {
		String oldCODE = code;
		code = newCODE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.DETECTOR__CODE, oldCODE, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNAME() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNAME(String newNAME) {
		String oldNAME = name;
		name = newNAME;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.DETECTOR__NAME, oldNAME, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getCOUNTLOCATIONNO() {
		return countlocationno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCOUNTLOCATIONNO(BigInteger newCOUNTLOCATIONNO) {
		BigInteger oldCOUNTLOCATIONNO = countlocationno;
		countlocationno = newCOUNTLOCATIONNO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.DETECTOR__COUNTLOCATIONNO, oldCOUNTLOCATIONNO, countlocationno));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getTYPENO() {
		return typeno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTYPENO(BigInteger newTYPENO) {
		BigInteger oldTYPENO = typeno;
		typeno = newTYPENO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.DETECTOR__TYPENO, oldTYPENO, typeno));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getXCOORD() {
		return xcoord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXCOORD(double newXCOORD) {
		double oldXCOORD = xcoord;
		xcoord = newXCOORD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.DETECTOR__XCOORD, oldXCOORD, xcoord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getYCOORD() {
		return ycoord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYCOORD(double newYCOORD) {
		double oldYCOORD = ycoord;
		ycoord = newYCOORD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.DETECTOR__YCOORD, oldYCOORD, ycoord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getLANEONLINK() {
		return laneonlink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLANEONLINK(BigInteger newLANEONLINK) {
		BigInteger oldLANEONLINK = laneonlink;
		laneonlink = newLANEONLINK;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.DETECTOR__LANEONLINK, oldLANEONLINK, laneonlink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getNUMLANESONLINK() {
		return numlanesonlink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNUMLANESONLINK(BigInteger newNUMLANESONLINK) {
		BigInteger oldNUMLANESONLINK = numlanesonlink;
		numlanesonlink = newNUMLANESONLINK;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.DETECTOR__NUMLANESONLINK, oldNUMLANESONLINK, numlanesonlink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getENABLED() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setENABLED(BigInteger newENABLED) {
		BigInteger oldENABLED = enabled;
		enabled = newENABLED;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.DETECTOR__ENABLED, oldENABLED, enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getNODENO() {
		return nodeno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNODENO(BigInteger newNODENO) {
		BigInteger oldNODENO = nodeno;
		nodeno = newNODENO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.DETECTOR__NODENO, oldNODENO, nodeno));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getMAINNODENO() {
		return mainnodeno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMAINNODENO(BigInteger newMAINNODENO) {
		BigInteger oldMAINNODENO = mainnodeno;
		mainnodeno = newMAINNODENO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.DETECTOR__MAINNODENO, oldMAINNODENO, mainnodeno));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getCHANNELNO() {
		return channelno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCHANNELNO(BigInteger newCHANNELNO) {
		BigInteger oldCHANNELNO = channelno;
		channelno = newCHANNELNO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.DETECTOR__CHANNELNO, oldCHANNELNO, channelno));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSTOPLINEDIST() {
		return stoplinedist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSTOPLINEDIST(double newSTOPLINEDIST) {
		double oldSTOPLINEDIST = stoplinedist;
		stoplinedist = newSTOPLINEDIST;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.DETECTOR__STOPLINEDIST, oldSTOPLINEDIST, stoplinedist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLENGTH() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLENGTH(double newLENGTH) {
		double oldLENGTH = length;
		length = newLENGTH;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.DETECTOR__LENGTH, oldLENGTH, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTSYSSET() {
		return tsysset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTSYSSET(String newTSYSSET) {
		String oldTSYSSET = tsysset;
		tsysset = newTSYSSET;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.DETECTOR__TSYSSET, oldTSYSSET, tsysset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getSCNO() {
		return scno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSCNO(BigInteger newSCNO) {
		BigInteger oldSCNO = scno;
		scno = newSCNO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.DETECTOR__SCNO, oldSCNO, scno));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDETECTORTYPE() {
		return detectortype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDETECTORTYPE(String newDETECTORTYPE) {
		String oldDETECTORTYPE = detectortype;
		detectortype = newDETECTORTYPE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.DETECTOR__DETECTORTYPE, oldDETECTORTYPE, detectortype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDELAY() {
		return delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDELAY(double newDELAY) {
		double oldDELAY = delay;
		delay = newDELAY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.DETECTOR__DELAY, oldDELAY, delay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getEXTEND() {
		return extend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEXTEND(double newEXTEND) {
		double oldEXTEND = extend;
		extend = newEXTEND;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.DETECTOR__EXTEND, oldEXTEND, extend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCARRYOVER() {
		return carryover;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCARRYOVER(double newCARRYOVER) {
		double oldCARRYOVER = carryover;
		carryover = newCARRYOVER;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.DETECTOR__CARRYOVER, oldCARRYOVER, carryover));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getQUEUELIMIT() {
		return queuelimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQUEUELIMIT(BigInteger newQUEUELIMIT) {
		BigInteger oldQUEUELIMIT = queuelimit;
		queuelimit = newQUEUELIMIT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.DETECTOR__QUEUELIMIT, oldQUEUELIMIT, queuelimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDETECTORMODE() {
		return detectormode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDETECTORMODE(String newDETECTORMODE) {
		String oldDETECTORMODE = detectormode;
		detectormode = newDETECTORMODE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.DETECTOR__DETECTORMODE, oldDETECTORMODE, detectormode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getADDEDINITIALMODE() {
		return addedinitialmode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setADDEDINITIALMODE(BigInteger newADDEDINITIALMODE) {
		BigInteger oldADDEDINITIALMODE = addedinitialmode;
		addedinitialmode = newADDEDINITIALMODE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.DETECTOR__ADDEDINITIALMODE, oldADDEDINITIALMODE, addedinitialmode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCALL() {
		return call;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCALL(String newCALL) {
		String oldCALL = call;
		call = newCALL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.DETECTOR__CALL, oldCALL, call));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAMBERLOCK() {
		return amberlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAMBERLOCK(String newAMBERLOCK) {
		String oldAMBERLOCK = amberlock;
		amberlock = newAMBERLOCK;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.DETECTOR__AMBERLOCK, oldAMBERLOCK, amberlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getREDLOCK() {
		return redlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setREDLOCK(String newREDLOCK) {
		String oldREDLOCK = redlock;
		redlock = newREDLOCK;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.DETECTOR__REDLOCK, oldREDLOCK, redlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEXTENDSGS() {
		return extendsgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEXTENDSGS(String newEXTENDSGS) {
		String oldEXTENDSGS = extendsgs;
		extendsgs = newEXTENDSGS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.DETECTOR__EXTENDSGS, oldEXTENDSGS, extendsgs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getXSWITCHSGS() {
		return xswitchsgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXSWITCHSGS(String newXSWITCHSGS) {
		String oldXSWITCHSGS = xswitchsgs;
		xswitchsgs = newXSWITCHSGS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.DETECTOR__XSWITCHSGS, oldXSWITCHSGS, xswitchsgs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getVEHDETECTORNO() {
		return vehdetectorno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVEHDETECTORNO(BigInteger newVEHDETECTORNO) {
		BigInteger oldVEHDETECTORNO = vehdetectorno;
		vehdetectorno = newVEHDETECTORNO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.DETECTOR__VEHDETECTORNO, oldVEHDETECTORNO, vehdetectorno));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getDELAYON() {
		return delayon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDELAYON(BigInteger newDELAYON) {
		BigInteger oldDELAYON = delayon;
		delayon = newDELAYON;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.DETECTOR__DELAYON, oldDELAYON, delayon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getDELAYOFF() {
		return delayoff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDELAYOFF(BigInteger newDELAYOFF) {
		BigInteger oldDELAYOFF = delayoff;
		delayoff = newDELAYOFF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.DETECTOR__DELAYOFF, oldDELAYOFF, delayoff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCONTROL() {
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTROL(String newCONTROL) {
		String oldCONTROL = control;
		control = newCONTROL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.DETECTOR__CONTROL, oldCONTROL, control));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getACTION() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setACTION(String newACTION) {
		String oldACTION = action;
		action = newACTION;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.DETECTOR__ACTION, oldACTION, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getACTIONSGNO() {
		return actionsgno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setACTIONSGNO(BigInteger newACTIONSGNO) {
		BigInteger oldACTIONSGNO = actionsgno;
		actionsgno = newACTIONSGNO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.DETECTOR__ACTIONSGNO, oldACTIONSGNO, actionsgno));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getACTIONPREEMPTNO() {
		return actionpreemptno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setACTIONPREEMPTNO(BigInteger newACTIONPREEMPTNO) {
		BigInteger oldACTIONPREEMPTNO = actionpreemptno;
		actionpreemptno = newACTIONPREEMPTNO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.DETECTOR__ACTIONPREEMPTNO, oldACTIONPREEMPTNO, actionpreemptno));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getACTIONTRANSITSGNO() {
		return actiontransitsgno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setACTIONTRANSITSGNO(BigInteger newACTIONTRANSITSGNO) {
		BigInteger oldACTIONTRANSITSGNO = actiontransitsgno;
		actiontransitsgno = newACTIONTRANSITSGNO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.DETECTOR__ACTIONTRANSITSGNO, oldACTIONTRANSITSGNO, actiontransitsgno));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getRBCNO() {
		return rbcno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRBCNO(BigInteger newRBCNO) {
		BigInteger oldRBCNO = rbcno;
		rbcno = newRBCNO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.DETECTOR__RBCNO, oldRBCNO, rbcno));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLABELPOSRELX() {
		return labelposrelx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLABELPOSRELX(double newLABELPOSRELX) {
		double oldLABELPOSRELX = labelposrelx;
		labelposrelx = newLABELPOSRELX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.DETECTOR__LABELPOSRELX, oldLABELPOSRELX, labelposrelx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDET_AU() {
		return deT_AU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDET_AU(String newDET_AU) {
		String oldDET_AU = deT_AU;
		deT_AU = newDET_AU;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.DETECTOR__DET_AU, oldDET_AU, deT_AU));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDET_BEM() {
		return deT_BEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDET_BEM(String newDET_BEM) {
		String oldDET_BEM = deT_BEM;
		deT_BEM = newDET_BEM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.DETECTOR__DET_BEM, oldDET_BEM, deT_BEM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getDET_KO() {
		return deT_KO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDET_KO(BigInteger newDET_KO) {
		BigInteger oldDET_KO = deT_KO;
		deT_KO = newDET_KO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.DETECTOR__DET_KO, oldDET_KO, deT_KO));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDET_Q() {
		return deT_Q;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDET_Q(String newDET_Q) {
		String oldDET_Q = deT_Q;
		deT_Q = newDET_Q;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.DETECTOR__DET_Q, oldDET_Q, deT_Q));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getDET_QS() {
		return deT_QS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDET_QS(BigInteger newDET_QS) {
		BigInteger oldDET_QS = deT_QS;
		deT_QS = newDET_QS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.DETECTOR__DET_QS, oldDET_QS, deT_QS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDET_SP() {
		return deT_SP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDET_SP(String newDET_SP) {
		String oldDET_SP = deT_SP;
		deT_SP = newDET_SP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.DETECTOR__DET_SP, oldDET_SP, deT_SP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDET_ST() {
		return deT_ST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDET_ST(String newDET_ST) {
		String oldDET_ST = deT_ST;
		deT_ST = newDET_ST;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.DETECTOR__DET_ST, oldDET_ST, deT_ST));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDET_VO() {
		return deT_VO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDET_VO(String newDET_VO) {
		String oldDET_VO = deT_VO;
		deT_VO = newDET_VO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficPackage.DETECTOR__DET_VO, oldDET_VO, deT_VO));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TrafficPackage.DETECTOR__NO:
				return getNO();
			case TrafficPackage.DETECTOR__CODE:
				return getCODE();
			case TrafficPackage.DETECTOR__NAME:
				return getNAME();
			case TrafficPackage.DETECTOR__COUNTLOCATIONNO:
				return getCOUNTLOCATIONNO();
			case TrafficPackage.DETECTOR__TYPENO:
				return getTYPENO();
			case TrafficPackage.DETECTOR__XCOORD:
				return getXCOORD();
			case TrafficPackage.DETECTOR__YCOORD:
				return getYCOORD();
			case TrafficPackage.DETECTOR__LANEONLINK:
				return getLANEONLINK();
			case TrafficPackage.DETECTOR__NUMLANESONLINK:
				return getNUMLANESONLINK();
			case TrafficPackage.DETECTOR__ENABLED:
				return getENABLED();
			case TrafficPackage.DETECTOR__NODENO:
				return getNODENO();
			case TrafficPackage.DETECTOR__MAINNODENO:
				return getMAINNODENO();
			case TrafficPackage.DETECTOR__CHANNELNO:
				return getCHANNELNO();
			case TrafficPackage.DETECTOR__STOPLINEDIST:
				return getSTOPLINEDIST();
			case TrafficPackage.DETECTOR__LENGTH:
				return getLENGTH();
			case TrafficPackage.DETECTOR__TSYSSET:
				return getTSYSSET();
			case TrafficPackage.DETECTOR__SCNO:
				return getSCNO();
			case TrafficPackage.DETECTOR__DETECTORTYPE:
				return getDETECTORTYPE();
			case TrafficPackage.DETECTOR__DELAY:
				return getDELAY();
			case TrafficPackage.DETECTOR__EXTEND:
				return getEXTEND();
			case TrafficPackage.DETECTOR__CARRYOVER:
				return getCARRYOVER();
			case TrafficPackage.DETECTOR__QUEUELIMIT:
				return getQUEUELIMIT();
			case TrafficPackage.DETECTOR__DETECTORMODE:
				return getDETECTORMODE();
			case TrafficPackage.DETECTOR__ADDEDINITIALMODE:
				return getADDEDINITIALMODE();
			case TrafficPackage.DETECTOR__CALL:
				return getCALL();
			case TrafficPackage.DETECTOR__AMBERLOCK:
				return getAMBERLOCK();
			case TrafficPackage.DETECTOR__REDLOCK:
				return getREDLOCK();
			case TrafficPackage.DETECTOR__EXTENDSGS:
				return getEXTENDSGS();
			case TrafficPackage.DETECTOR__XSWITCHSGS:
				return getXSWITCHSGS();
			case TrafficPackage.DETECTOR__VEHDETECTORNO:
				return getVEHDETECTORNO();
			case TrafficPackage.DETECTOR__DELAYON:
				return getDELAYON();
			case TrafficPackage.DETECTOR__DELAYOFF:
				return getDELAYOFF();
			case TrafficPackage.DETECTOR__CONTROL:
				return getCONTROL();
			case TrafficPackage.DETECTOR__ACTION:
				return getACTION();
			case TrafficPackage.DETECTOR__ACTIONSGNO:
				return getACTIONSGNO();
			case TrafficPackage.DETECTOR__ACTIONPREEMPTNO:
				return getACTIONPREEMPTNO();
			case TrafficPackage.DETECTOR__ACTIONTRANSITSGNO:
				return getACTIONTRANSITSGNO();
			case TrafficPackage.DETECTOR__RBCNO:
				return getRBCNO();
			case TrafficPackage.DETECTOR__LABELPOSRELX:
				return getLABELPOSRELX();
			case TrafficPackage.DETECTOR__DET_AU:
				return getDET_AU();
			case TrafficPackage.DETECTOR__DET_BEM:
				return getDET_BEM();
			case TrafficPackage.DETECTOR__DET_KO:
				return getDET_KO();
			case TrafficPackage.DETECTOR__DET_Q:
				return getDET_Q();
			case TrafficPackage.DETECTOR__DET_QS:
				return getDET_QS();
			case TrafficPackage.DETECTOR__DET_SP:
				return getDET_SP();
			case TrafficPackage.DETECTOR__DET_ST:
				return getDET_ST();
			case TrafficPackage.DETECTOR__DET_VO:
				return getDET_VO();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TrafficPackage.DETECTOR__NO:
				setNO((BigInteger)newValue);
				return;
			case TrafficPackage.DETECTOR__CODE:
				setCODE((String)newValue);
				return;
			case TrafficPackage.DETECTOR__NAME:
				setNAME((String)newValue);
				return;
			case TrafficPackage.DETECTOR__COUNTLOCATIONNO:
				setCOUNTLOCATIONNO((BigInteger)newValue);
				return;
			case TrafficPackage.DETECTOR__TYPENO:
				setTYPENO((BigInteger)newValue);
				return;
			case TrafficPackage.DETECTOR__XCOORD:
				setXCOORD((Double)newValue);
				return;
			case TrafficPackage.DETECTOR__YCOORD:
				setYCOORD((Double)newValue);
				return;
			case TrafficPackage.DETECTOR__LANEONLINK:
				setLANEONLINK((BigInteger)newValue);
				return;
			case TrafficPackage.DETECTOR__NUMLANESONLINK:
				setNUMLANESONLINK((BigInteger)newValue);
				return;
			case TrafficPackage.DETECTOR__ENABLED:
				setENABLED((BigInteger)newValue);
				return;
			case TrafficPackage.DETECTOR__NODENO:
				setNODENO((BigInteger)newValue);
				return;
			case TrafficPackage.DETECTOR__MAINNODENO:
				setMAINNODENO((BigInteger)newValue);
				return;
			case TrafficPackage.DETECTOR__CHANNELNO:
				setCHANNELNO((BigInteger)newValue);
				return;
			case TrafficPackage.DETECTOR__STOPLINEDIST:
				setSTOPLINEDIST((Double)newValue);
				return;
			case TrafficPackage.DETECTOR__LENGTH:
				setLENGTH((Double)newValue);
				return;
			case TrafficPackage.DETECTOR__TSYSSET:
				setTSYSSET((String)newValue);
				return;
			case TrafficPackage.DETECTOR__SCNO:
				setSCNO((BigInteger)newValue);
				return;
			case TrafficPackage.DETECTOR__DETECTORTYPE:
				setDETECTORTYPE((String)newValue);
				return;
			case TrafficPackage.DETECTOR__DELAY:
				setDELAY((Double)newValue);
				return;
			case TrafficPackage.DETECTOR__EXTEND:
				setEXTEND((Double)newValue);
				return;
			case TrafficPackage.DETECTOR__CARRYOVER:
				setCARRYOVER((Double)newValue);
				return;
			case TrafficPackage.DETECTOR__QUEUELIMIT:
				setQUEUELIMIT((BigInteger)newValue);
				return;
			case TrafficPackage.DETECTOR__DETECTORMODE:
				setDETECTORMODE((String)newValue);
				return;
			case TrafficPackage.DETECTOR__ADDEDINITIALMODE:
				setADDEDINITIALMODE((BigInteger)newValue);
				return;
			case TrafficPackage.DETECTOR__CALL:
				setCALL((String)newValue);
				return;
			case TrafficPackage.DETECTOR__AMBERLOCK:
				setAMBERLOCK((String)newValue);
				return;
			case TrafficPackage.DETECTOR__REDLOCK:
				setREDLOCK((String)newValue);
				return;
			case TrafficPackage.DETECTOR__EXTENDSGS:
				setEXTENDSGS((String)newValue);
				return;
			case TrafficPackage.DETECTOR__XSWITCHSGS:
				setXSWITCHSGS((String)newValue);
				return;
			case TrafficPackage.DETECTOR__VEHDETECTORNO:
				setVEHDETECTORNO((BigInteger)newValue);
				return;
			case TrafficPackage.DETECTOR__DELAYON:
				setDELAYON((BigInteger)newValue);
				return;
			case TrafficPackage.DETECTOR__DELAYOFF:
				setDELAYOFF((BigInteger)newValue);
				return;
			case TrafficPackage.DETECTOR__CONTROL:
				setCONTROL((String)newValue);
				return;
			case TrafficPackage.DETECTOR__ACTION:
				setACTION((String)newValue);
				return;
			case TrafficPackage.DETECTOR__ACTIONSGNO:
				setACTIONSGNO((BigInteger)newValue);
				return;
			case TrafficPackage.DETECTOR__ACTIONPREEMPTNO:
				setACTIONPREEMPTNO((BigInteger)newValue);
				return;
			case TrafficPackage.DETECTOR__ACTIONTRANSITSGNO:
				setACTIONTRANSITSGNO((BigInteger)newValue);
				return;
			case TrafficPackage.DETECTOR__RBCNO:
				setRBCNO((BigInteger)newValue);
				return;
			case TrafficPackage.DETECTOR__LABELPOSRELX:
				setLABELPOSRELX((Double)newValue);
				return;
			case TrafficPackage.DETECTOR__DET_AU:
				setDET_AU((String)newValue);
				return;
			case TrafficPackage.DETECTOR__DET_BEM:
				setDET_BEM((String)newValue);
				return;
			case TrafficPackage.DETECTOR__DET_KO:
				setDET_KO((BigInteger)newValue);
				return;
			case TrafficPackage.DETECTOR__DET_Q:
				setDET_Q((String)newValue);
				return;
			case TrafficPackage.DETECTOR__DET_QS:
				setDET_QS((BigInteger)newValue);
				return;
			case TrafficPackage.DETECTOR__DET_SP:
				setDET_SP((String)newValue);
				return;
			case TrafficPackage.DETECTOR__DET_ST:
				setDET_ST((String)newValue);
				return;
			case TrafficPackage.DETECTOR__DET_VO:
				setDET_VO((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TrafficPackage.DETECTOR__NO:
				setNO(NO_EDEFAULT);
				return;
			case TrafficPackage.DETECTOR__CODE:
				setCODE(CODE_EDEFAULT);
				return;
			case TrafficPackage.DETECTOR__NAME:
				setNAME(NAME_EDEFAULT);
				return;
			case TrafficPackage.DETECTOR__COUNTLOCATIONNO:
				setCOUNTLOCATIONNO(COUNTLOCATIONNO_EDEFAULT);
				return;
			case TrafficPackage.DETECTOR__TYPENO:
				setTYPENO(TYPENO_EDEFAULT);
				return;
			case TrafficPackage.DETECTOR__XCOORD:
				setXCOORD(XCOORD_EDEFAULT);
				return;
			case TrafficPackage.DETECTOR__YCOORD:
				setYCOORD(YCOORD_EDEFAULT);
				return;
			case TrafficPackage.DETECTOR__LANEONLINK:
				setLANEONLINK(LANEONLINK_EDEFAULT);
				return;
			case TrafficPackage.DETECTOR__NUMLANESONLINK:
				setNUMLANESONLINK(NUMLANESONLINK_EDEFAULT);
				return;
			case TrafficPackage.DETECTOR__ENABLED:
				setENABLED(ENABLED_EDEFAULT);
				return;
			case TrafficPackage.DETECTOR__NODENO:
				setNODENO(NODENO_EDEFAULT);
				return;
			case TrafficPackage.DETECTOR__MAINNODENO:
				setMAINNODENO(MAINNODENO_EDEFAULT);
				return;
			case TrafficPackage.DETECTOR__CHANNELNO:
				setCHANNELNO(CHANNELNO_EDEFAULT);
				return;
			case TrafficPackage.DETECTOR__STOPLINEDIST:
				setSTOPLINEDIST(STOPLINEDIST_EDEFAULT);
				return;
			case TrafficPackage.DETECTOR__LENGTH:
				setLENGTH(LENGTH_EDEFAULT);
				return;
			case TrafficPackage.DETECTOR__TSYSSET:
				setTSYSSET(TSYSSET_EDEFAULT);
				return;
			case TrafficPackage.DETECTOR__SCNO:
				setSCNO(SCNO_EDEFAULT);
				return;
			case TrafficPackage.DETECTOR__DETECTORTYPE:
				setDETECTORTYPE(DETECTORTYPE_EDEFAULT);
				return;
			case TrafficPackage.DETECTOR__DELAY:
				setDELAY(DELAY_EDEFAULT);
				return;
			case TrafficPackage.DETECTOR__EXTEND:
				setEXTEND(EXTEND_EDEFAULT);
				return;
			case TrafficPackage.DETECTOR__CARRYOVER:
				setCARRYOVER(CARRYOVER_EDEFAULT);
				return;
			case TrafficPackage.DETECTOR__QUEUELIMIT:
				setQUEUELIMIT(QUEUELIMIT_EDEFAULT);
				return;
			case TrafficPackage.DETECTOR__DETECTORMODE:
				setDETECTORMODE(DETECTORMODE_EDEFAULT);
				return;
			case TrafficPackage.DETECTOR__ADDEDINITIALMODE:
				setADDEDINITIALMODE(ADDEDINITIALMODE_EDEFAULT);
				return;
			case TrafficPackage.DETECTOR__CALL:
				setCALL(CALL_EDEFAULT);
				return;
			case TrafficPackage.DETECTOR__AMBERLOCK:
				setAMBERLOCK(AMBERLOCK_EDEFAULT);
				return;
			case TrafficPackage.DETECTOR__REDLOCK:
				setREDLOCK(REDLOCK_EDEFAULT);
				return;
			case TrafficPackage.DETECTOR__EXTENDSGS:
				setEXTENDSGS(EXTENDSGS_EDEFAULT);
				return;
			case TrafficPackage.DETECTOR__XSWITCHSGS:
				setXSWITCHSGS(XSWITCHSGS_EDEFAULT);
				return;
			case TrafficPackage.DETECTOR__VEHDETECTORNO:
				setVEHDETECTORNO(VEHDETECTORNO_EDEFAULT);
				return;
			case TrafficPackage.DETECTOR__DELAYON:
				setDELAYON(DELAYON_EDEFAULT);
				return;
			case TrafficPackage.DETECTOR__DELAYOFF:
				setDELAYOFF(DELAYOFF_EDEFAULT);
				return;
			case TrafficPackage.DETECTOR__CONTROL:
				setCONTROL(CONTROL_EDEFAULT);
				return;
			case TrafficPackage.DETECTOR__ACTION:
				setACTION(ACTION_EDEFAULT);
				return;
			case TrafficPackage.DETECTOR__ACTIONSGNO:
				setACTIONSGNO(ACTIONSGNO_EDEFAULT);
				return;
			case TrafficPackage.DETECTOR__ACTIONPREEMPTNO:
				setACTIONPREEMPTNO(ACTIONPREEMPTNO_EDEFAULT);
				return;
			case TrafficPackage.DETECTOR__ACTIONTRANSITSGNO:
				setACTIONTRANSITSGNO(ACTIONTRANSITSGNO_EDEFAULT);
				return;
			case TrafficPackage.DETECTOR__RBCNO:
				setRBCNO(RBCNO_EDEFAULT);
				return;
			case TrafficPackage.DETECTOR__LABELPOSRELX:
				setLABELPOSRELX(LABELPOSRELX_EDEFAULT);
				return;
			case TrafficPackage.DETECTOR__DET_AU:
				setDET_AU(DET_AU_EDEFAULT);
				return;
			case TrafficPackage.DETECTOR__DET_BEM:
				setDET_BEM(DET_BEM_EDEFAULT);
				return;
			case TrafficPackage.DETECTOR__DET_KO:
				setDET_KO(DET_KO_EDEFAULT);
				return;
			case TrafficPackage.DETECTOR__DET_Q:
				setDET_Q(DET_Q_EDEFAULT);
				return;
			case TrafficPackage.DETECTOR__DET_QS:
				setDET_QS(DET_QS_EDEFAULT);
				return;
			case TrafficPackage.DETECTOR__DET_SP:
				setDET_SP(DET_SP_EDEFAULT);
				return;
			case TrafficPackage.DETECTOR__DET_ST:
				setDET_ST(DET_ST_EDEFAULT);
				return;
			case TrafficPackage.DETECTOR__DET_VO:
				setDET_VO(DET_VO_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TrafficPackage.DETECTOR__NO:
				return NO_EDEFAULT == null ? no != null : !NO_EDEFAULT.equals(no);
			case TrafficPackage.DETECTOR__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case TrafficPackage.DETECTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TrafficPackage.DETECTOR__COUNTLOCATIONNO:
				return COUNTLOCATIONNO_EDEFAULT == null ? countlocationno != null : !COUNTLOCATIONNO_EDEFAULT.equals(countlocationno);
			case TrafficPackage.DETECTOR__TYPENO:
				return TYPENO_EDEFAULT == null ? typeno != null : !TYPENO_EDEFAULT.equals(typeno);
			case TrafficPackage.DETECTOR__XCOORD:
				return xcoord != XCOORD_EDEFAULT;
			case TrafficPackage.DETECTOR__YCOORD:
				return ycoord != YCOORD_EDEFAULT;
			case TrafficPackage.DETECTOR__LANEONLINK:
				return LANEONLINK_EDEFAULT == null ? laneonlink != null : !LANEONLINK_EDEFAULT.equals(laneonlink);
			case TrafficPackage.DETECTOR__NUMLANESONLINK:
				return NUMLANESONLINK_EDEFAULT == null ? numlanesonlink != null : !NUMLANESONLINK_EDEFAULT.equals(numlanesonlink);
			case TrafficPackage.DETECTOR__ENABLED:
				return ENABLED_EDEFAULT == null ? enabled != null : !ENABLED_EDEFAULT.equals(enabled);
			case TrafficPackage.DETECTOR__NODENO:
				return NODENO_EDEFAULT == null ? nodeno != null : !NODENO_EDEFAULT.equals(nodeno);
			case TrafficPackage.DETECTOR__MAINNODENO:
				return MAINNODENO_EDEFAULT == null ? mainnodeno != null : !MAINNODENO_EDEFAULT.equals(mainnodeno);
			case TrafficPackage.DETECTOR__CHANNELNO:
				return CHANNELNO_EDEFAULT == null ? channelno != null : !CHANNELNO_EDEFAULT.equals(channelno);
			case TrafficPackage.DETECTOR__STOPLINEDIST:
				return stoplinedist != STOPLINEDIST_EDEFAULT;
			case TrafficPackage.DETECTOR__LENGTH:
				return length != LENGTH_EDEFAULT;
			case TrafficPackage.DETECTOR__TSYSSET:
				return TSYSSET_EDEFAULT == null ? tsysset != null : !TSYSSET_EDEFAULT.equals(tsysset);
			case TrafficPackage.DETECTOR__SCNO:
				return SCNO_EDEFAULT == null ? scno != null : !SCNO_EDEFAULT.equals(scno);
			case TrafficPackage.DETECTOR__DETECTORTYPE:
				return DETECTORTYPE_EDEFAULT == null ? detectortype != null : !DETECTORTYPE_EDEFAULT.equals(detectortype);
			case TrafficPackage.DETECTOR__DELAY:
				return delay != DELAY_EDEFAULT;
			case TrafficPackage.DETECTOR__EXTEND:
				return extend != EXTEND_EDEFAULT;
			case TrafficPackage.DETECTOR__CARRYOVER:
				return carryover != CARRYOVER_EDEFAULT;
			case TrafficPackage.DETECTOR__QUEUELIMIT:
				return QUEUELIMIT_EDEFAULT == null ? queuelimit != null : !QUEUELIMIT_EDEFAULT.equals(queuelimit);
			case TrafficPackage.DETECTOR__DETECTORMODE:
				return DETECTORMODE_EDEFAULT == null ? detectormode != null : !DETECTORMODE_EDEFAULT.equals(detectormode);
			case TrafficPackage.DETECTOR__ADDEDINITIALMODE:
				return ADDEDINITIALMODE_EDEFAULT == null ? addedinitialmode != null : !ADDEDINITIALMODE_EDEFAULT.equals(addedinitialmode);
			case TrafficPackage.DETECTOR__CALL:
				return CALL_EDEFAULT == null ? call != null : !CALL_EDEFAULT.equals(call);
			case TrafficPackage.DETECTOR__AMBERLOCK:
				return AMBERLOCK_EDEFAULT == null ? amberlock != null : !AMBERLOCK_EDEFAULT.equals(amberlock);
			case TrafficPackage.DETECTOR__REDLOCK:
				return REDLOCK_EDEFAULT == null ? redlock != null : !REDLOCK_EDEFAULT.equals(redlock);
			case TrafficPackage.DETECTOR__EXTENDSGS:
				return EXTENDSGS_EDEFAULT == null ? extendsgs != null : !EXTENDSGS_EDEFAULT.equals(extendsgs);
			case TrafficPackage.DETECTOR__XSWITCHSGS:
				return XSWITCHSGS_EDEFAULT == null ? xswitchsgs != null : !XSWITCHSGS_EDEFAULT.equals(xswitchsgs);
			case TrafficPackage.DETECTOR__VEHDETECTORNO:
				return VEHDETECTORNO_EDEFAULT == null ? vehdetectorno != null : !VEHDETECTORNO_EDEFAULT.equals(vehdetectorno);
			case TrafficPackage.DETECTOR__DELAYON:
				return DELAYON_EDEFAULT == null ? delayon != null : !DELAYON_EDEFAULT.equals(delayon);
			case TrafficPackage.DETECTOR__DELAYOFF:
				return DELAYOFF_EDEFAULT == null ? delayoff != null : !DELAYOFF_EDEFAULT.equals(delayoff);
			case TrafficPackage.DETECTOR__CONTROL:
				return CONTROL_EDEFAULT == null ? control != null : !CONTROL_EDEFAULT.equals(control);
			case TrafficPackage.DETECTOR__ACTION:
				return ACTION_EDEFAULT == null ? action != null : !ACTION_EDEFAULT.equals(action);
			case TrafficPackage.DETECTOR__ACTIONSGNO:
				return ACTIONSGNO_EDEFAULT == null ? actionsgno != null : !ACTIONSGNO_EDEFAULT.equals(actionsgno);
			case TrafficPackage.DETECTOR__ACTIONPREEMPTNO:
				return ACTIONPREEMPTNO_EDEFAULT == null ? actionpreemptno != null : !ACTIONPREEMPTNO_EDEFAULT.equals(actionpreemptno);
			case TrafficPackage.DETECTOR__ACTIONTRANSITSGNO:
				return ACTIONTRANSITSGNO_EDEFAULT == null ? actiontransitsgno != null : !ACTIONTRANSITSGNO_EDEFAULT.equals(actiontransitsgno);
			case TrafficPackage.DETECTOR__RBCNO:
				return RBCNO_EDEFAULT == null ? rbcno != null : !RBCNO_EDEFAULT.equals(rbcno);
			case TrafficPackage.DETECTOR__LABELPOSRELX:
				return labelposrelx != LABELPOSRELX_EDEFAULT;
			case TrafficPackage.DETECTOR__DET_AU:
				return DET_AU_EDEFAULT == null ? deT_AU != null : !DET_AU_EDEFAULT.equals(deT_AU);
			case TrafficPackage.DETECTOR__DET_BEM:
				return DET_BEM_EDEFAULT == null ? deT_BEM != null : !DET_BEM_EDEFAULT.equals(deT_BEM);
			case TrafficPackage.DETECTOR__DET_KO:
				return DET_KO_EDEFAULT == null ? deT_KO != null : !DET_KO_EDEFAULT.equals(deT_KO);
			case TrafficPackage.DETECTOR__DET_Q:
				return DET_Q_EDEFAULT == null ? deT_Q != null : !DET_Q_EDEFAULT.equals(deT_Q);
			case TrafficPackage.DETECTOR__DET_QS:
				return DET_QS_EDEFAULT == null ? deT_QS != null : !DET_QS_EDEFAULT.equals(deT_QS);
			case TrafficPackage.DETECTOR__DET_SP:
				return DET_SP_EDEFAULT == null ? deT_SP != null : !DET_SP_EDEFAULT.equals(deT_SP);
			case TrafficPackage.DETECTOR__DET_ST:
				return DET_ST_EDEFAULT == null ? deT_ST != null : !DET_ST_EDEFAULT.equals(deT_ST);
			case TrafficPackage.DETECTOR__DET_VO:
				return DET_VO_EDEFAULT == null ? deT_VO != null : !DET_VO_EDEFAULT.equals(deT_VO);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (NO: ");
		result.append(no);
		result.append(", CODE: ");
		result.append(code);
		result.append(", NAME: ");
		result.append(name);
		result.append(", COUNTLOCATIONNO: ");
		result.append(countlocationno);
		result.append(", TYPENO: ");
		result.append(typeno);
		result.append(", XCOORD: ");
		result.append(xcoord);
		result.append(", YCOORD: ");
		result.append(ycoord);
		result.append(", LANEONLINK: ");
		result.append(laneonlink);
		result.append(", NUMLANESONLINK: ");
		result.append(numlanesonlink);
		result.append(", ENABLED: ");
		result.append(enabled);
		result.append(", NODENO: ");
		result.append(nodeno);
		result.append(", MAINNODENO: ");
		result.append(mainnodeno);
		result.append(", CHANNELNO: ");
		result.append(channelno);
		result.append(", STOPLINEDIST: ");
		result.append(stoplinedist);
		result.append(", LENGTH: ");
		result.append(length);
		result.append(", TSYSSET: ");
		result.append(tsysset);
		result.append(", SCNO: ");
		result.append(scno);
		result.append(", DETECTORTYPE: ");
		result.append(detectortype);
		result.append(", DELAY: ");
		result.append(delay);
		result.append(", EXTEND: ");
		result.append(extend);
		result.append(", CARRYOVER: ");
		result.append(carryover);
		result.append(", QUEUELIMIT: ");
		result.append(queuelimit);
		result.append(", DETECTORMODE: ");
		result.append(detectormode);
		result.append(", ADDEDINITIALMODE: ");
		result.append(addedinitialmode);
		result.append(", CALL: ");
		result.append(call);
		result.append(", AMBERLOCK: ");
		result.append(amberlock);
		result.append(", REDLOCK: ");
		result.append(redlock);
		result.append(", EXTENDSGS: ");
		result.append(extendsgs);
		result.append(", XSWITCHSGS: ");
		result.append(xswitchsgs);
		result.append(", VEHDETECTORNO: ");
		result.append(vehdetectorno);
		result.append(", DELAYON: ");
		result.append(delayon);
		result.append(", DELAYOFF: ");
		result.append(delayoff);
		result.append(", CONTROL: ");
		result.append(control);
		result.append(", ACTION: ");
		result.append(action);
		result.append(", ACTIONSGNO: ");
		result.append(actionsgno);
		result.append(", ACTIONPREEMPTNO: ");
		result.append(actionpreemptno);
		result.append(", ACTIONTRANSITSGNO: ");
		result.append(actiontransitsgno);
		result.append(", RBCNO: ");
		result.append(rbcno);
		result.append(", LABELPOSRELX: ");
		result.append(labelposrelx);
		result.append(", DET_AU: ");
		result.append(deT_AU);
		result.append(", DET_BEM: ");
		result.append(deT_BEM);
		result.append(", DET_KO: ");
		result.append(deT_KO);
		result.append(", DET_Q: ");
		result.append(deT_Q);
		result.append(", DET_QS: ");
		result.append(deT_QS);
		result.append(", DET_SP: ");
		result.append(deT_SP);
		result.append(", DET_ST: ");
		result.append(deT_ST);
		result.append(", DET_VO: ");
		result.append(deT_VO);
		result.append(')');
		return result.toString();
	}

} //DETECTORImpl
