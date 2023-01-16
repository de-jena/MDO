/*
 */
package de.jena.mdo.ibis.common;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Door Counting List Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.DoorCountingListStructure#getDoorID <em>Door ID</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.DoorCountingListStructure#getCountSet <em>Count Set</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDoorCountingListStructure()
 * @model extendedMetaData="name='DoorCountingListStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DoorCountingListStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Door ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Door ID</em>' containment reference.
	 * @see #setDoorID(IBISIPNMTOKEN)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDoorCountingListStructure_DoorID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DoorID' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPNMTOKEN getDoorID();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.DoorCountingListStructure#getDoorID <em>Door ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Door ID</em>' containment reference.
	 * @see #getDoorID()
	 * @generated
	 */
	void setDoorID(IBISIPNMTOKEN value);

	/**
	 * Returns the value of the '<em><b>Count Set</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.common.DoorCountingStructure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count Set</em>' containment reference list.
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDoorCountingListStructure_CountSet()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CountSet' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DoorCountingStructure> getCountSet();

} // DoorCountingListStructure
