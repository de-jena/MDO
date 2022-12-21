/*
 */
package de.jena.mdo.asset.traffic;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DETECTOR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.asset.traffic.DETECTOR#getNO <em>NO</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.DETECTOR#getCODE <em>CODE</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.DETECTOR#getNAME <em>NAME</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.DETECTOR#getCOUNTLOCATIONNO <em>COUNTLOCATIONNO</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.DETECTOR#getTYPENO <em>TYPENO</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.DETECTOR#getXCOORD <em>XCOORD</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.DETECTOR#getYCOORD <em>YCOORD</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.DETECTOR#getLANEONLINK <em>LANEONLINK</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.DETECTOR#getNUMLANESONLINK <em>NUMLANESONLINK</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.DETECTOR#getENABLED <em>ENABLED</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.DETECTOR#getNODENO <em>NODENO</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.DETECTOR#getMAINNODENO <em>MAINNODENO</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.DETECTOR#getCHANNELNO <em>CHANNELNO</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.DETECTOR#getSTOPLINEDIST <em>STOPLINEDIST</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.DETECTOR#getLENGTH <em>LENGTH</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.DETECTOR#getTSYSSET <em>TSYSSET</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.DETECTOR#getSCNO <em>SCNO</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.DETECTOR#getDETECTORTYPE <em>DETECTORTYPE</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.DETECTOR#getDELAY <em>DELAY</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.DETECTOR#getEXTEND <em>EXTEND</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.DETECTOR#getCARRYOVER <em>CARRYOVER</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.DETECTOR#getQUEUELIMIT <em>QUEUELIMIT</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.DETECTOR#getDETECTORMODE <em>DETECTORMODE</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.DETECTOR#getADDEDINITIALMODE <em>ADDEDINITIALMODE</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.DETECTOR#getCALL <em>CALL</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.DETECTOR#getAMBERLOCK <em>AMBERLOCK</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.DETECTOR#getREDLOCK <em>REDLOCK</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.DETECTOR#getEXTENDSGS <em>EXTENDSGS</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.DETECTOR#getXSWITCHSGS <em>XSWITCHSGS</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.DETECTOR#getVEHDETECTORNO <em>VEHDETECTORNO</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.DETECTOR#getDELAYON <em>DELAYON</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.DETECTOR#getDELAYOFF <em>DELAYOFF</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.DETECTOR#getCONTROL <em>CONTROL</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.DETECTOR#getACTION <em>ACTION</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.DETECTOR#getACTIONSGNO <em>ACTIONSGNO</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.DETECTOR#getACTIONPREEMPTNO <em>ACTIONPREEMPTNO</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.DETECTOR#getACTIONTRANSITSGNO <em>ACTIONTRANSITSGNO</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.DETECTOR#getRBCNO <em>RBCNO</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.DETECTOR#getLABELPOSRELX <em>LABELPOSRELX</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.DETECTOR#getDET_AU <em>DET AU</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.DETECTOR#getDET_BEM <em>DET BEM</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.DETECTOR#getDET_KO <em>DET KO</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.DETECTOR#getDET_Q <em>DET Q</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.DETECTOR#getDET_QS <em>DET QS</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.DETECTOR#getDET_SP <em>DET SP</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.DETECTOR#getDET_ST <em>DET ST</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.DETECTOR#getDET_VO <em>DET VO</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR()
 * @model
 * @generated
 */
@ProviderType
public interface DETECTOR extends EObject {
	/**
	 * Returns the value of the '<em><b>NO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NO</em>' attribute.
	 * @see #setNO(BigInteger)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR_NO()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getNO();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.DETECTOR#getNO <em>NO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NO</em>' attribute.
	 * @see #getNO()
	 * @generated
	 */
	void setNO(BigInteger value);

	/**
	 * Returns the value of the '<em><b>CODE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CODE</em>' attribute.
	 * @see #setCODE(String)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR_CODE()
	 * @model
	 * @generated
	 */
	String getCODE();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.DETECTOR#getCODE <em>CODE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CODE</em>' attribute.
	 * @see #getCODE()
	 * @generated
	 */
	void setCODE(String value);

	/**
	 * Returns the value of the '<em><b>NAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NAME</em>' attribute.
	 * @see #setNAME(String)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR_NAME()
	 * @model id="true"
	 * @generated
	 */
	String getNAME();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.DETECTOR#getNAME <em>NAME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NAME</em>' attribute.
	 * @see #getNAME()
	 * @generated
	 */
	void setNAME(String value);

	/**
	 * Returns the value of the '<em><b>COUNTLOCATIONNO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>COUNTLOCATIONNO</em>' attribute.
	 * @see #setCOUNTLOCATIONNO(BigInteger)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR_COUNTLOCATIONNO()
	 * @model
	 * @generated
	 */
	BigInteger getCOUNTLOCATIONNO();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.DETECTOR#getCOUNTLOCATIONNO <em>COUNTLOCATIONNO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>COUNTLOCATIONNO</em>' attribute.
	 * @see #getCOUNTLOCATIONNO()
	 * @generated
	 */
	void setCOUNTLOCATIONNO(BigInteger value);

	/**
	 * Returns the value of the '<em><b>TYPENO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TYPENO</em>' attribute.
	 * @see #setTYPENO(BigInteger)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR_TYPENO()
	 * @model
	 * @generated
	 */
	BigInteger getTYPENO();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.DETECTOR#getTYPENO <em>TYPENO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TYPENO</em>' attribute.
	 * @see #getTYPENO()
	 * @generated
	 */
	void setTYPENO(BigInteger value);

	/**
	 * Returns the value of the '<em><b>XCOORD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XCOORD</em>' attribute.
	 * @see #setXCOORD(double)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR_XCOORD()
	 * @model
	 * @generated
	 */
	double getXCOORD();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.DETECTOR#getXCOORD <em>XCOORD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XCOORD</em>' attribute.
	 * @see #getXCOORD()
	 * @generated
	 */
	void setXCOORD(double value);

	/**
	 * Returns the value of the '<em><b>YCOORD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YCOORD</em>' attribute.
	 * @see #setYCOORD(double)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR_YCOORD()
	 * @model
	 * @generated
	 */
	double getYCOORD();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.DETECTOR#getYCOORD <em>YCOORD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YCOORD</em>' attribute.
	 * @see #getYCOORD()
	 * @generated
	 */
	void setYCOORD(double value);

	/**
	 * Returns the value of the '<em><b>LANEONLINK</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LANEONLINK</em>' attribute.
	 * @see #setLANEONLINK(BigInteger)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR_LANEONLINK()
	 * @model
	 * @generated
	 */
	BigInteger getLANEONLINK();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.DETECTOR#getLANEONLINK <em>LANEONLINK</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LANEONLINK</em>' attribute.
	 * @see #getLANEONLINK()
	 * @generated
	 */
	void setLANEONLINK(BigInteger value);

	/**
	 * Returns the value of the '<em><b>NUMLANESONLINK</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NUMLANESONLINK</em>' attribute.
	 * @see #setNUMLANESONLINK(BigInteger)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR_NUMLANESONLINK()
	 * @model
	 * @generated
	 */
	BigInteger getNUMLANESONLINK();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.DETECTOR#getNUMLANESONLINK <em>NUMLANESONLINK</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NUMLANESONLINK</em>' attribute.
	 * @see #getNUMLANESONLINK()
	 * @generated
	 */
	void setNUMLANESONLINK(BigInteger value);

	/**
	 * Returns the value of the '<em><b>ENABLED</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ENABLED</em>' attribute.
	 * @see #setENABLED(BigInteger)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR_ENABLED()
	 * @model
	 * @generated
	 */
	BigInteger getENABLED();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.DETECTOR#getENABLED <em>ENABLED</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ENABLED</em>' attribute.
	 * @see #getENABLED()
	 * @generated
	 */
	void setENABLED(BigInteger value);

	/**
	 * Returns the value of the '<em><b>NODENO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NODENO</em>' attribute.
	 * @see #setNODENO(BigInteger)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR_NODENO()
	 * @model
	 * @generated
	 */
	BigInteger getNODENO();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.DETECTOR#getNODENO <em>NODENO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NODENO</em>' attribute.
	 * @see #getNODENO()
	 * @generated
	 */
	void setNODENO(BigInteger value);

	/**
	 * Returns the value of the '<em><b>MAINNODENO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MAINNODENO</em>' attribute.
	 * @see #setMAINNODENO(BigInteger)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR_MAINNODENO()
	 * @model
	 * @generated
	 */
	BigInteger getMAINNODENO();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.DETECTOR#getMAINNODENO <em>MAINNODENO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MAINNODENO</em>' attribute.
	 * @see #getMAINNODENO()
	 * @generated
	 */
	void setMAINNODENO(BigInteger value);

	/**
	 * Returns the value of the '<em><b>CHANNELNO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CHANNELNO</em>' attribute.
	 * @see #setCHANNELNO(BigInteger)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR_CHANNELNO()
	 * @model
	 * @generated
	 */
	BigInteger getCHANNELNO();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.DETECTOR#getCHANNELNO <em>CHANNELNO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CHANNELNO</em>' attribute.
	 * @see #getCHANNELNO()
	 * @generated
	 */
	void setCHANNELNO(BigInteger value);

	/**
	 * Returns the value of the '<em><b>STOPLINEDIST</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>STOPLINEDIST</em>' attribute.
	 * @see #setSTOPLINEDIST(double)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR_STOPLINEDIST()
	 * @model
	 * @generated
	 */
	double getSTOPLINEDIST();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.DETECTOR#getSTOPLINEDIST <em>STOPLINEDIST</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>STOPLINEDIST</em>' attribute.
	 * @see #getSTOPLINEDIST()
	 * @generated
	 */
	void setSTOPLINEDIST(double value);

	/**
	 * Returns the value of the '<em><b>LENGTH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LENGTH</em>' attribute.
	 * @see #setLENGTH(double)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR_LENGTH()
	 * @model
	 * @generated
	 */
	double getLENGTH();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.DETECTOR#getLENGTH <em>LENGTH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LENGTH</em>' attribute.
	 * @see #getLENGTH()
	 * @generated
	 */
	void setLENGTH(double value);

	/**
	 * Returns the value of the '<em><b>TSYSSET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TSYSSET</em>' attribute.
	 * @see #setTSYSSET(String)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR_TSYSSET()
	 * @model
	 * @generated
	 */
	String getTSYSSET();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.DETECTOR#getTSYSSET <em>TSYSSET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TSYSSET</em>' attribute.
	 * @see #getTSYSSET()
	 * @generated
	 */
	void setTSYSSET(String value);

	/**
	 * Returns the value of the '<em><b>SCNO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SCNO</em>' attribute.
	 * @see #setSCNO(BigInteger)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR_SCNO()
	 * @model
	 * @generated
	 */
	BigInteger getSCNO();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.DETECTOR#getSCNO <em>SCNO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SCNO</em>' attribute.
	 * @see #getSCNO()
	 * @generated
	 */
	void setSCNO(BigInteger value);

	/**
	 * Returns the value of the '<em><b>DETECTORTYPE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DETECTORTYPE</em>' attribute.
	 * @see #setDETECTORTYPE(String)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR_DETECTORTYPE()
	 * @model
	 * @generated
	 */
	String getDETECTORTYPE();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.DETECTOR#getDETECTORTYPE <em>DETECTORTYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DETECTORTYPE</em>' attribute.
	 * @see #getDETECTORTYPE()
	 * @generated
	 */
	void setDETECTORTYPE(String value);

	/**
	 * Returns the value of the '<em><b>DELAY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DELAY</em>' attribute.
	 * @see #setDELAY(double)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR_DELAY()
	 * @model
	 * @generated
	 */
	double getDELAY();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.DETECTOR#getDELAY <em>DELAY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DELAY</em>' attribute.
	 * @see #getDELAY()
	 * @generated
	 */
	void setDELAY(double value);

	/**
	 * Returns the value of the '<em><b>EXTEND</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EXTEND</em>' attribute.
	 * @see #setEXTEND(double)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR_EXTEND()
	 * @model
	 * @generated
	 */
	double getEXTEND();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.DETECTOR#getEXTEND <em>EXTEND</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EXTEND</em>' attribute.
	 * @see #getEXTEND()
	 * @generated
	 */
	void setEXTEND(double value);

	/**
	 * Returns the value of the '<em><b>CARRYOVER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CARRYOVER</em>' attribute.
	 * @see #setCARRYOVER(double)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR_CARRYOVER()
	 * @model
	 * @generated
	 */
	double getCARRYOVER();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.DETECTOR#getCARRYOVER <em>CARRYOVER</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CARRYOVER</em>' attribute.
	 * @see #getCARRYOVER()
	 * @generated
	 */
	void setCARRYOVER(double value);

	/**
	 * Returns the value of the '<em><b>QUEUELIMIT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QUEUELIMIT</em>' attribute.
	 * @see #setQUEUELIMIT(BigInteger)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR_QUEUELIMIT()
	 * @model
	 * @generated
	 */
	BigInteger getQUEUELIMIT();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.DETECTOR#getQUEUELIMIT <em>QUEUELIMIT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QUEUELIMIT</em>' attribute.
	 * @see #getQUEUELIMIT()
	 * @generated
	 */
	void setQUEUELIMIT(BigInteger value);

	/**
	 * Returns the value of the '<em><b>DETECTORMODE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DETECTORMODE</em>' attribute.
	 * @see #setDETECTORMODE(String)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR_DETECTORMODE()
	 * @model
	 * @generated
	 */
	String getDETECTORMODE();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.DETECTOR#getDETECTORMODE <em>DETECTORMODE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DETECTORMODE</em>' attribute.
	 * @see #getDETECTORMODE()
	 * @generated
	 */
	void setDETECTORMODE(String value);

	/**
	 * Returns the value of the '<em><b>ADDEDINITIALMODE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ADDEDINITIALMODE</em>' attribute.
	 * @see #setADDEDINITIALMODE(BigInteger)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR_ADDEDINITIALMODE()
	 * @model
	 * @generated
	 */
	BigInteger getADDEDINITIALMODE();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.DETECTOR#getADDEDINITIALMODE <em>ADDEDINITIALMODE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ADDEDINITIALMODE</em>' attribute.
	 * @see #getADDEDINITIALMODE()
	 * @generated
	 */
	void setADDEDINITIALMODE(BigInteger value);

	/**
	 * Returns the value of the '<em><b>CALL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CALL</em>' attribute.
	 * @see #setCALL(String)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR_CALL()
	 * @model
	 * @generated
	 */
	String getCALL();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.DETECTOR#getCALL <em>CALL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CALL</em>' attribute.
	 * @see #getCALL()
	 * @generated
	 */
	void setCALL(String value);

	/**
	 * Returns the value of the '<em><b>AMBERLOCK</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AMBERLOCK</em>' attribute.
	 * @see #setAMBERLOCK(String)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR_AMBERLOCK()
	 * @model
	 * @generated
	 */
	String getAMBERLOCK();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.DETECTOR#getAMBERLOCK <em>AMBERLOCK</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AMBERLOCK</em>' attribute.
	 * @see #getAMBERLOCK()
	 * @generated
	 */
	void setAMBERLOCK(String value);

	/**
	 * Returns the value of the '<em><b>REDLOCK</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>REDLOCK</em>' attribute.
	 * @see #setREDLOCK(String)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR_REDLOCK()
	 * @model
	 * @generated
	 */
	String getREDLOCK();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.DETECTOR#getREDLOCK <em>REDLOCK</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>REDLOCK</em>' attribute.
	 * @see #getREDLOCK()
	 * @generated
	 */
	void setREDLOCK(String value);

	/**
	 * Returns the value of the '<em><b>EXTENDSGS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EXTENDSGS</em>' attribute.
	 * @see #setEXTENDSGS(String)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR_EXTENDSGS()
	 * @model
	 * @generated
	 */
	String getEXTENDSGS();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.DETECTOR#getEXTENDSGS <em>EXTENDSGS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EXTENDSGS</em>' attribute.
	 * @see #getEXTENDSGS()
	 * @generated
	 */
	void setEXTENDSGS(String value);

	/**
	 * Returns the value of the '<em><b>XSWITCHSGS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSWITCHSGS</em>' attribute.
	 * @see #setXSWITCHSGS(String)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR_XSWITCHSGS()
	 * @model
	 * @generated
	 */
	String getXSWITCHSGS();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.DETECTOR#getXSWITCHSGS <em>XSWITCHSGS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XSWITCHSGS</em>' attribute.
	 * @see #getXSWITCHSGS()
	 * @generated
	 */
	void setXSWITCHSGS(String value);

	/**
	 * Returns the value of the '<em><b>VEHDETECTORNO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VEHDETECTORNO</em>' attribute.
	 * @see #setVEHDETECTORNO(BigInteger)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR_VEHDETECTORNO()
	 * @model
	 * @generated
	 */
	BigInteger getVEHDETECTORNO();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.DETECTOR#getVEHDETECTORNO <em>VEHDETECTORNO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VEHDETECTORNO</em>' attribute.
	 * @see #getVEHDETECTORNO()
	 * @generated
	 */
	void setVEHDETECTORNO(BigInteger value);

	/**
	 * Returns the value of the '<em><b>DELAYON</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DELAYON</em>' attribute.
	 * @see #setDELAYON(BigInteger)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR_DELAYON()
	 * @model
	 * @generated
	 */
	BigInteger getDELAYON();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.DETECTOR#getDELAYON <em>DELAYON</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DELAYON</em>' attribute.
	 * @see #getDELAYON()
	 * @generated
	 */
	void setDELAYON(BigInteger value);

	/**
	 * Returns the value of the '<em><b>DELAYOFF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DELAYOFF</em>' attribute.
	 * @see #setDELAYOFF(BigInteger)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR_DELAYOFF()
	 * @model
	 * @generated
	 */
	BigInteger getDELAYOFF();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.DETECTOR#getDELAYOFF <em>DELAYOFF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DELAYOFF</em>' attribute.
	 * @see #getDELAYOFF()
	 * @generated
	 */
	void setDELAYOFF(BigInteger value);

	/**
	 * Returns the value of the '<em><b>CONTROL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTROL</em>' attribute.
	 * @see #setCONTROL(String)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR_CONTROL()
	 * @model
	 * @generated
	 */
	String getCONTROL();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.DETECTOR#getCONTROL <em>CONTROL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTROL</em>' attribute.
	 * @see #getCONTROL()
	 * @generated
	 */
	void setCONTROL(String value);

	/**
	 * Returns the value of the '<em><b>ACTION</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ACTION</em>' attribute.
	 * @see #setACTION(String)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR_ACTION()
	 * @model
	 * @generated
	 */
	String getACTION();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.DETECTOR#getACTION <em>ACTION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ACTION</em>' attribute.
	 * @see #getACTION()
	 * @generated
	 */
	void setACTION(String value);

	/**
	 * Returns the value of the '<em><b>ACTIONSGNO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ACTIONSGNO</em>' attribute.
	 * @see #setACTIONSGNO(BigInteger)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR_ACTIONSGNO()
	 * @model
	 * @generated
	 */
	BigInteger getACTIONSGNO();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.DETECTOR#getACTIONSGNO <em>ACTIONSGNO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ACTIONSGNO</em>' attribute.
	 * @see #getACTIONSGNO()
	 * @generated
	 */
	void setACTIONSGNO(BigInteger value);

	/**
	 * Returns the value of the '<em><b>ACTIONPREEMPTNO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ACTIONPREEMPTNO</em>' attribute.
	 * @see #setACTIONPREEMPTNO(BigInteger)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR_ACTIONPREEMPTNO()
	 * @model
	 * @generated
	 */
	BigInteger getACTIONPREEMPTNO();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.DETECTOR#getACTIONPREEMPTNO <em>ACTIONPREEMPTNO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ACTIONPREEMPTNO</em>' attribute.
	 * @see #getACTIONPREEMPTNO()
	 * @generated
	 */
	void setACTIONPREEMPTNO(BigInteger value);

	/**
	 * Returns the value of the '<em><b>ACTIONTRANSITSGNO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ACTIONTRANSITSGNO</em>' attribute.
	 * @see #setACTIONTRANSITSGNO(BigInteger)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR_ACTIONTRANSITSGNO()
	 * @model
	 * @generated
	 */
	BigInteger getACTIONTRANSITSGNO();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.DETECTOR#getACTIONTRANSITSGNO <em>ACTIONTRANSITSGNO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ACTIONTRANSITSGNO</em>' attribute.
	 * @see #getACTIONTRANSITSGNO()
	 * @generated
	 */
	void setACTIONTRANSITSGNO(BigInteger value);

	/**
	 * Returns the value of the '<em><b>RBCNO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RBCNO</em>' attribute.
	 * @see #setRBCNO(BigInteger)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR_RBCNO()
	 * @model
	 * @generated
	 */
	BigInteger getRBCNO();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.DETECTOR#getRBCNO <em>RBCNO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RBCNO</em>' attribute.
	 * @see #getRBCNO()
	 * @generated
	 */
	void setRBCNO(BigInteger value);

	/**
	 * Returns the value of the '<em><b>LABELPOSRELX</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LABELPOSRELX</em>' attribute.
	 * @see #setLABELPOSRELX(double)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR_LABELPOSRELX()
	 * @model
	 * @generated
	 */
	double getLABELPOSRELX();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.DETECTOR#getLABELPOSRELX <em>LABELPOSRELX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LABELPOSRELX</em>' attribute.
	 * @see #getLABELPOSRELX()
	 * @generated
	 */
	void setLABELPOSRELX(double value);

	/**
	 * Returns the value of the '<em><b>DET AU</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DET AU</em>' attribute.
	 * @see #setDET_AU(String)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR_DET_AU()
	 * @model
	 * @generated
	 */
	String getDET_AU();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.DETECTOR#getDET_AU <em>DET AU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DET AU</em>' attribute.
	 * @see #getDET_AU()
	 * @generated
	 */
	void setDET_AU(String value);

	/**
	 * Returns the value of the '<em><b>DET BEM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DET BEM</em>' attribute.
	 * @see #setDET_BEM(String)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR_DET_BEM()
	 * @model
	 * @generated
	 */
	String getDET_BEM();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.DETECTOR#getDET_BEM <em>DET BEM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DET BEM</em>' attribute.
	 * @see #getDET_BEM()
	 * @generated
	 */
	void setDET_BEM(String value);

	/**
	 * Returns the value of the '<em><b>DET KO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DET KO</em>' attribute.
	 * @see #setDET_KO(BigInteger)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR_DET_KO()
	 * @model
	 * @generated
	 */
	BigInteger getDET_KO();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.DETECTOR#getDET_KO <em>DET KO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DET KO</em>' attribute.
	 * @see #getDET_KO()
	 * @generated
	 */
	void setDET_KO(BigInteger value);

	/**
	 * Returns the value of the '<em><b>DET Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DET Q</em>' attribute.
	 * @see #setDET_Q(String)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR_DET_Q()
	 * @model
	 * @generated
	 */
	String getDET_Q();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.DETECTOR#getDET_Q <em>DET Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DET Q</em>' attribute.
	 * @see #getDET_Q()
	 * @generated
	 */
	void setDET_Q(String value);

	/**
	 * Returns the value of the '<em><b>DET QS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DET QS</em>' attribute.
	 * @see #setDET_QS(BigInteger)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR_DET_QS()
	 * @model
	 * @generated
	 */
	BigInteger getDET_QS();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.DETECTOR#getDET_QS <em>DET QS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DET QS</em>' attribute.
	 * @see #getDET_QS()
	 * @generated
	 */
	void setDET_QS(BigInteger value);

	/**
	 * Returns the value of the '<em><b>DET SP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DET SP</em>' attribute.
	 * @see #setDET_SP(String)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR_DET_SP()
	 * @model
	 * @generated
	 */
	String getDET_SP();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.DETECTOR#getDET_SP <em>DET SP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DET SP</em>' attribute.
	 * @see #getDET_SP()
	 * @generated
	 */
	void setDET_SP(String value);

	/**
	 * Returns the value of the '<em><b>DET ST</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DET ST</em>' attribute.
	 * @see #setDET_ST(String)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR_DET_ST()
	 * @model
	 * @generated
	 */
	String getDET_ST();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.DETECTOR#getDET_ST <em>DET ST</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DET ST</em>' attribute.
	 * @see #getDET_ST()
	 * @generated
	 */
	void setDET_ST(String value);

	/**
	 * Returns the value of the '<em><b>DET VO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DET VO</em>' attribute.
	 * @see #setDET_VO(String)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getDETECTOR_DET_VO()
	 * @model
	 * @generated
	 */
	String getDET_VO();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.DETECTOR#getDET_VO <em>DET VO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DET VO</em>' attribute.
	 * @see #getDET_VO()
	 * @generated
	 */
	void setDET_VO(String value);

} // DETECTOR
