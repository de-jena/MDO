/*
 */
package de.jena.mdo.ibis.common;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GNSS Point Structure</b></em>'.
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
 *   <li>{@link de.jena.mdo.ibis.common.GNSSPointStructure#getPointRef <em>Point Ref</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.GNSSPointStructure#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.GNSSPointStructure#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.GNSSPointStructure#getAltitude <em>Altitude</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getGNSSPointStructure()
 * @model extendedMetaData="name='GNSSPointStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GNSSPointStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Point Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the point in schedule data
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point Ref</em>' containment reference.
	 * @see #setPointRef(IBISIPNMTOKEN)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getGNSSPointStructure_PointRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PointRef' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPNMTOKEN getPointRef();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.GNSSPointStructure#getPointRef <em>Point Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Ref</em>' containment reference.
	 * @see #getPointRef()
	 * @generated
	 */
	void setPointRef(IBISIPNMTOKEN value);

	/**
	 * Returns the value of the '<em><b>Longitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitude</em>' containment reference.
	 * @see #setLongitude(GNSSCoordinateStructure)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getGNSSPointStructure_Longitude()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Longitude' namespace='##targetNamespace'"
	 * @generated
	 */
	GNSSCoordinateStructure getLongitude();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.GNSSPointStructure#getLongitude <em>Longitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude</em>' containment reference.
	 * @see #getLongitude()
	 * @generated
	 */
	void setLongitude(GNSSCoordinateStructure value);

	/**
	 * Returns the value of the '<em><b>Latitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latitude</em>' containment reference.
	 * @see #setLatitude(GNSSCoordinateStructure)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getGNSSPointStructure_Latitude()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Latitude' namespace='##targetNamespace'"
	 * @generated
	 */
	GNSSCoordinateStructure getLatitude();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.GNSSPointStructure#getLatitude <em>Latitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude</em>' containment reference.
	 * @see #getLatitude()
	 * @generated
	 */
	void setLatitude(GNSSCoordinateStructure value);

	/**
	 * Returns the value of the '<em><b>Altitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude</em>' containment reference.
	 * @see #setAltitude(IBISIPDouble)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getGNSSPointStructure_Altitude()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Altitude' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDouble getAltitude();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.GNSSPointStructure#getAltitude <em>Altitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude</em>' containment reference.
	 * @see #getAltitude()
	 * @generated
	 */
	void setAltitude(IBISIPDouble value);

} // GNSSPointStructure
