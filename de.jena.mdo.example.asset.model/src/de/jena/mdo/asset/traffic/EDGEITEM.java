/**
 */
package de.jena.mdo.asset.traffic;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EDGEITEM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.asset.traffic.EDGEITEM#getEDGEID <em>EDGEID</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.EDGEITEM#getINDEX <em>INDEX</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.EDGEITEM#getXCOORD <em>XCOORD</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.EDGEITEM#getYCOORD <em>YCOORD</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.asset.traffic.TrafficPackage#getEDGEITEM()
 * @model
 * @generated
 */
public interface EDGEITEM extends EObject {
	/**
	 * Returns the value of the '<em><b>EDGEID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EDGEID</em>' attribute.
	 * @see #setEDGEID(BigInteger)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getEDGEITEM_EDGEID()
	 * @model id="true" required="true"
	 * @generated
	 */
	BigInteger getEDGEID();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.EDGEITEM#getEDGEID <em>EDGEID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EDGEID</em>' attribute.
	 * @see #getEDGEID()
	 * @generated
	 */
	void setEDGEID(BigInteger value);

	/**
	 * Returns the value of the '<em><b>INDEX</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>INDEX</em>' attribute.
	 * @see #setINDEX(BigInteger)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getEDGEITEM_INDEX()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getINDEX();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.EDGEITEM#getINDEX <em>INDEX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>INDEX</em>' attribute.
	 * @see #getINDEX()
	 * @generated
	 */
	void setINDEX(BigInteger value);

	/**
	 * Returns the value of the '<em><b>XCOORD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XCOORD</em>' attribute.
	 * @see #setXCOORD(double)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getEDGEITEM_XCOORD()
	 * @model
	 * @generated
	 */
	double getXCOORD();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.EDGEITEM#getXCOORD <em>XCOORD</em>}' attribute.
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
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getEDGEITEM_YCOORD()
	 * @model
	 * @generated
	 */
	double getYCOORD();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.EDGEITEM#getYCOORD <em>YCOORD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YCOORD</em>' attribute.
	 * @see #getYCOORD()
	 * @generated
	 */
	void setYCOORD(double value);

} // EDGEITEM
