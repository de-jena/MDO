/*
 */
package de.jena.mdo.asset.traffic;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EDGE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Connects 2 Points in the Traffic Model
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.asset.traffic.EDGE#getID <em>ID</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.EDGE#getFROMPOINTID <em>FROMPOINTID</em>}</li>
 *   <li>{@link de.jena.mdo.asset.traffic.EDGE#getTOPOINTID <em>TOPOINTID</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.asset.traffic.TrafficPackage#getEDGE()
 * @model
 * @generated
 */
@ProviderType
public interface EDGE extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(BigInteger)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getEDGE_ID()
	 * @model id="true" required="true"
	 * @generated
	 */
	BigInteger getID();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.EDGE#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(BigInteger value);

	/**
	 * Returns the value of the '<em><b>FROMPOINTID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FROMPOINTID</em>' attribute.
	 * @see #setFROMPOINTID(BigInteger)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getEDGE_FROMPOINTID()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getFROMPOINTID();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.EDGE#getFROMPOINTID <em>FROMPOINTID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FROMPOINTID</em>' attribute.
	 * @see #getFROMPOINTID()
	 * @generated
	 */
	void setFROMPOINTID(BigInteger value);

	/**
	 * Returns the value of the '<em><b>TOPOINTID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TOPOINTID</em>' attribute.
	 * @see #setTOPOINTID(BigInteger)
	 * @see de.jena.mdo.asset.traffic.TrafficPackage#getEDGE_TOPOINTID()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getTOPOINTID();

	/**
	 * Sets the value of the '{@link de.jena.mdo.asset.traffic.EDGE#getTOPOINTID <em>TOPOINTID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TOPOINTID</em>' attribute.
	 * @see #getTOPOINTID()
	 * @generated
	 */
	void setTOPOINTID(BigInteger value);

} // EDGE
