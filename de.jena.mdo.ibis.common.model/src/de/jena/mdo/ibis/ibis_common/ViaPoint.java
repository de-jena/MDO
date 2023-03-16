/*
 */
package de.jena.mdo.ibis.ibis_common;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Via Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Structure for describing a via point on journey.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.ViaPoint#getViaPointRef <em>Via Point Ref</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.ViaPoint#getPlaceRef <em>Place Ref</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.ViaPoint#getPlaceName <em>Place Name</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.ViaPoint#getPlaceShortName <em>Place Short Name</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.ViaPoint#getViaPointDisplayPriority <em>Via Point Display Priority</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getViaPoint()
 * @model extendedMetaData="name='ViaPointStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ViaPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Via Point Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Via Point Ref</em>' containment reference.
	 * @see #setViaPointRef(IBISIPNMTOKEN)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getViaPoint_ViaPointRef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ViaPointRef' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPNMTOKEN getViaPointRef();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.ViaPoint#getViaPointRef <em>Via Point Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Via Point Ref</em>' containment reference.
	 * @see #getViaPointRef()
	 * @generated
	 */
	void setViaPointRef(IBISIPNMTOKEN value);

	/**
	 * Returns the value of the '<em><b>Place Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifier of the via place in the journey; used to help identify the vehicle journey on arrival boards.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Place Ref</em>' containment reference.
	 * @see #setPlaceRef(IBISIPNMTOKEN)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getViaPoint_PlaceRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PlaceRef' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPNMTOKEN getPlaceRef();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.ViaPoint#getPlaceRef <em>Place Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place Ref</em>' containment reference.
	 * @see #getPlaceRef()
	 * @generated
	 */
	void setPlaceRef(IBISIPNMTOKEN value);

	/**
	 * Returns the value of the '<em><b>Place Name</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.ibis_common.InternationalTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the via place in the journey; used to help identify the vehicle to the public.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Place Name</em>' containment reference list.
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getViaPoint_PlaceName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PlaceName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InternationalTextType> getPlaceName();

	/**
	 * Returns the value of the '<em><b>Place Short Name</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.ibis_common.InternationalTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The short name of the via place in the journey; used to help identify the vehicle to the public.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Place Short Name</em>' containment reference list.
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getViaPoint_PlaceShortName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PlaceShortName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InternationalTextType> getPlaceShortName();

	/**
	 * Returns the value of the '<em><b>Via Point Display Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Value, which defines a priority to select a number of via points, if not all via points can be shown
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Via Point Display Priority</em>' containment reference.
	 * @see #setViaPointDisplayPriority(IBISIPInt)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getViaPoint_ViaPointDisplayPriority()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ViaPointDisplayPriority' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPInt getViaPointDisplayPriority();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.ViaPoint#getViaPointDisplayPriority <em>Via Point Display Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Via Point Display Priority</em>' containment reference.
	 * @see #getViaPointDisplayPriority()
	 * @generated
	 */
	void setViaPointDisplayPriority(IBISIPInt value);

} // ViaPoint
