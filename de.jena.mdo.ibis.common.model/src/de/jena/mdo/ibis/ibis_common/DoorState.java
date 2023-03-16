/*
 */
package de.jena.mdo.ibis.ibis_common;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Door State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.DoorState#getOpenState <em>Open State</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.DoorState#getOperationState <em>Operation State</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getDoorState()
 * @model extendedMetaData="name='DoorStateStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DoorState extends EObject {
	/**
	 * Returns the value of the '<em><b>Open State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open State</em>' containment reference.
	 * @see #setOpenState(DoorOpenState)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getDoorState_OpenState()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='OpenState' namespace='##targetNamespace'"
	 * @generated
	 */
	DoorOpenState getOpenState();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.DoorState#getOpenState <em>Open State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open State</em>' containment reference.
	 * @see #getOpenState()
	 * @generated
	 */
	void setOpenState(DoorOpenState value);

	/**
	 * Returns the value of the '<em><b>Operation State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation State</em>' containment reference.
	 * @see #setOperationState(DoorOperationState)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getDoorState_OperationState()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OperationState' namespace='##targetNamespace'"
	 * @generated
	 */
	DoorOperationState getOperationState();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.DoorState#getOperationState <em>Operation State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation State</em>' containment reference.
	 * @see #getOperationState()
	 * @generated
	 */
	void setOperationState(DoorOperationState value);

} // DoorState
