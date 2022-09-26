/**
 */
package org.w3.ns.locn;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.ns.locn.Address#getAddress <em>Address</em>}</li>
 * </ul>
 *
 * @see org.w3.ns.locn.LocnPackage#getAddress()
 * @model extendedMetaData="name='Address' kind='elementOnly'"
 * @generated
 */
public interface Address extends EObject {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(AddressType)
	 * @see org.w3.ns.locn.LocnPackage#getAddress_Address()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Address' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressType getAddress();

	/**
	 * Sets the value of the '{@link org.w3.ns.locn.Address#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(AddressType value);

} // Address
