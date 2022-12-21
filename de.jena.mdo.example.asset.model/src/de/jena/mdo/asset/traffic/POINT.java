/*
 */
package de.jena.mdo.asset.traffic;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>POINT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.asset.traffic.POINT#getID <em>ID</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.POINT#getXCOORD <em>XCOORD</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.POINT#getYCOORD <em>YCOORD</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.asset.traffic.TrafficPackage#getPOINT()
 * @model
 * @generated
 */
@ProviderType
public interface POINT extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(BigInteger)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getPOINT_ID()
	 * @model id="true" required="true"
	 * @generated
	 */
	BigInteger getID();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.POINT#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(BigInteger value);

	/**
	 * Returns the value of the '<em><b>XCOORD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XCOORD</em>' attribute.
	 * @see #setXCOORD(double)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getPOINT_XCOORD()
	 * @model
	 * @generated
	 */
	double getXCOORD();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.POINT#getXCOORD <em>XCOORD</em>}' attribute.
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
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getPOINT_YCOORD()
	 * @model
	 * @generated
	 */
	double getYCOORD();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.POINT#getYCOORD <em>YCOORD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YCOORD</em>' attribute.
	 * @see #getYCOORD()
	 * @generated
	 */
	void setYCOORD(double value);

} // POINT
