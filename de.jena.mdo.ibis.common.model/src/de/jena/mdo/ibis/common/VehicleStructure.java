/*
 */
package de.jena.mdo.ibis.common;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicle Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.VehicleStructure#getVehicleTypeRef <em>Vehicle Type Ref</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.VehicleStructure#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getVehicleStructure()
 * @model extendedMetaData="name='VehicleStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface VehicleStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Vehicle Type Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle Type Ref</em>' containment reference.
	 * @see #setVehicleTypeRef(IBISIPNMTOKEN)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getVehicleStructure_VehicleTypeRef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='VehicleTypeRef' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPNMTOKEN getVehicleTypeRef();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.VehicleStructure#getVehicleTypeRef <em>Vehicle Type Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle Type Ref</em>' containment reference.
	 * @see #getVehicleTypeRef()
	 * @generated
	 */
	void setVehicleTypeRef(IBISIPNMTOKEN value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.common.InternationalTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference list.
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getVehicleStructure_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InternationalTextType> getName();

} // VehicleStructure