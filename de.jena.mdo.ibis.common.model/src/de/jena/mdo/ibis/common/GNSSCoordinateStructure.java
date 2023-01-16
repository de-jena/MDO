/*
 */
package de.jena.mdo.ibis.common;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GNSS Coordinate Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Structure for describing a GNSS-Point
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.GNSSCoordinateStructure#getDegree <em>Degree</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.GNSSCoordinateStructure#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getGNSSCoordinateStructure()
 * @model extendedMetaData="name='GNSSCoordinateStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GNSSCoordinateStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Degree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degree</em>' containment reference.
	 * @see #setDegree(IBISIPDouble)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getGNSSCoordinateStructure_Degree()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Degree' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDouble getDegree();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.GNSSCoordinateStructure#getDegree <em>Degree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degree</em>' containment reference.
	 * @see #getDegree()
	 * @generated
	 */
	void setDegree(IBISIPDouble value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' containment reference.
	 * @see #setDirection(IBISIPString)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getGNSSCoordinateStructure_Direction()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Direction' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPString getDirection();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.GNSSCoordinateStructure#getDirection <em>Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' containment reference.
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(IBISIPString value);

} // GNSSCoordinateStructure
