/*
 */
package de.jena.mdo.ibis.ibis_common;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Beacon Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Structure for describing a beacon point
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.BeaconPoint#getPointRef <em>Point Ref</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.BeaconPoint#getBeaconCode <em>Beacon Code</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.BeaconPoint#getShortName <em>Short Name</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.BeaconPoint#getDesciption <em>Desciption</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getBeaconPoint()
 * @model extendedMetaData="name='BeaconPointStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BeaconPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Point Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the beacon point in the schedule data
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point Ref</em>' containment reference.
	 * @see #setPointRef(IBISIPNMTOKEN)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getBeaconPoint_PointRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PointRef' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPNMTOKEN getPointRef();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.BeaconPoint#getPointRef <em>Point Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Ref</em>' containment reference.
	 * @see #getPointRef()
	 * @generated
	 */
	void setPointRef(IBISIPNMTOKEN value);

	/**
	 * Returns the value of the '<em><b>Beacon Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Code of the beacon point
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Beacon Code</em>' containment reference.
	 * @see #setBeaconCode(IBISIPNMTOKEN)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getBeaconPoint_BeaconCode()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='BeaconCode' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPNMTOKEN getBeaconCode();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.BeaconPoint#getBeaconCode <em>Beacon Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beacon Code</em>' containment reference.
	 * @see #getBeaconCode()
	 * @generated
	 */
	void setBeaconCode(IBISIPNMTOKEN value);

	/**
	 * Returns the value of the '<em><b>Short Name</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.ibis_common.InternationalTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Shortname of the beaon point
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Short Name</em>' containment reference list.
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getBeaconPoint_ShortName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ShortName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InternationalTextType> getShortName();

	/**
	 * Returns the value of the '<em><b>Desciption</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.ibis_common.InternationalTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text, which gives some additional information on the beacon point
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Desciption</em>' containment reference list.
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getBeaconPoint_Desciption()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Desciption' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InternationalTextType> getDesciption();

} // BeaconPoint
