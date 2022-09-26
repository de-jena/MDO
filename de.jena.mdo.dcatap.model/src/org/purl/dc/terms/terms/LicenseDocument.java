/**
 */
package org.purl.dc.terms.terms;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>License Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.purl.dc.terms.terms.LicenseDocument#getLicenseDocument <em>License Document</em>}</li>
 * </ul>
 *
 * @see org.purl.dc.terms.terms.TermsPackage#getLicenseDocument()
 * @model extendedMetaData="name='LicenseDocument' kind='elementOnly'"
 * @generated
 */
public interface LicenseDocument extends EObject {
	/**
	 * Returns the value of the '<em><b>License Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License Document</em>' containment reference.
	 * @see #setLicenseDocument(LicenseDocumentType)
	 * @see org.purl.dc.terms.terms.TermsPackage#getLicenseDocument_LicenseDocument()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LicenseDocument' namespace='##targetNamespace'"
	 * @generated
	 */
	LicenseDocumentType getLicenseDocument();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.LicenseDocument#getLicenseDocument <em>License Document</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License Document</em>' containment reference.
	 * @see #getLicenseDocument()
	 * @generated
	 */
	void setLicenseDocument(LicenseDocumentType value);

} // LicenseDocument
