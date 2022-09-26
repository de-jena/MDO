/**
 */
package org.purl.dc.terms.terms;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.purl.dc.terms.terms.Location#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see org.purl.dc.terms.terms.TermsPackage#getLocation()
 * @model extendedMetaData="name='Location' kind='elementOnly'"
 * @generated
 */
public interface Location extends EObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(LocationType)
	 * @see org.purl.dc.terms.terms.TermsPackage#getLocation_Location()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Location' namespace='##targetNamespace'"
	 * @generated
	 */
	LocationType getLocation();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.Location#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(LocationType value);

} // Location
