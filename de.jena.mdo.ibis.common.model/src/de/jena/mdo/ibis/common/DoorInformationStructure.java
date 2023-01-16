/*
 */
package de.jena.mdo.ibis.common;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Door Information Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.DoorInformationStructure#getDoorID <em>Door ID</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.DoorInformationStructure#getCount <em>Count</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.DoorInformationStructure#getState <em>State</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDoorInformationStructure()
 * @model extendedMetaData="name='DoorInformationStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DoorInformationStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Door ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Door ID</em>' containment reference.
	 * @see #setDoorID(IBISIPNMTOKEN)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDoorInformationStructure_DoorID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DoorID' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPNMTOKEN getDoorID();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.DoorInformationStructure#getDoorID <em>Door ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Door ID</em>' containment reference.
	 * @see #getDoorID()
	 * @generated
	 */
	void setDoorID(IBISIPNMTOKEN value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.common.DoorCountingStructure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' containment reference list.
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDoorInformationStructure_Count()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Count' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DoorCountingStructure> getCount();

	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference.
	 * @see #setState(DoorStateStructure)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDoorInformationStructure_State()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='State' namespace='##targetNamespace'"
	 * @generated
	 */
	DoorStateStructure getState();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.DoorInformationStructure#getState <em>State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' containment reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(DoorStateStructure value);

} // DoorInformationStructure
