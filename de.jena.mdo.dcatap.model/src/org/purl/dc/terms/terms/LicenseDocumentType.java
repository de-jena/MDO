/**
 */
package org.purl.dc.terms.terms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.w3.ns.rdf.PlainLiteral;

import org.w3.ns.skos.Concept;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>License Document Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.purl.dc.terms.terms.LicenseDocumentType#getType <em>Type</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.LicenseDocumentType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.LicenseDocumentType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.LicenseDocumentType#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.LicenseDocumentType#getAbout <em>About</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.LicenseDocumentType#getNodeID <em>Node ID</em>}</li>
 * </ul>
 *
 * @see org.purl.dc.terms.terms.TermsPackage#getLicenseDocumentType()
 * @model extendedMetaData="name='LicenseDocument_._type' kind='elementOnly'"
 * @generated
 */
public interface LicenseDocumentType extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3.ns.skos.Concept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see org.purl.dc.terms.terms.TermsPackage#getLicenseDocumentType_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Concept> getType();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3.ns.rdf.PlainLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference list.
	 * @see org.purl.dc.terms.terms.TermsPackage#getLicenseDocumentType_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PlainLiteral> getTitle();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3.ns.rdf.PlainLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference list.
	 * @see org.purl.dc.terms.terms.TermsPackage#getLicenseDocumentType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PlainLiteral> getDescription();

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3.ns.rdf.PlainLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.purl.dc.terms.terms.TermsPackage#getLicenseDocumentType_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PlainLiteral> getIdentifier();

	/**
	 * Returns the value of the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>About</em>' attribute.
	 * @see #setAbout(String)
	 * @see org.purl.dc.terms.terms.TermsPackage#getLicenseDocumentType_About()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='about' namespace='http://www.w3.org/1999/02/22-rdf-syntax-ns#'"
	 * @generated
	 */
	String getAbout();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.LicenseDocumentType#getAbout <em>About</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>About</em>' attribute.
	 * @see #getAbout()
	 * @generated
	 */
	void setAbout(String value);

	/**
	 * Returns the value of the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node ID</em>' attribute.
	 * @see #setNodeID(String)
	 * @see org.purl.dc.terms.terms.TermsPackage#getLicenseDocumentType_NodeID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        extendedMetaData="kind='attribute' name='nodeID' namespace='http://www.w3.org/1999/02/22-rdf-syntax-ns#'"
	 * @generated
	 */
	String getNodeID();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.LicenseDocumentType#getNodeID <em>Node ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node ID</em>' attribute.
	 * @see #getNodeID()
	 * @generated
	 */
	void setNodeID(String value);

} // LicenseDocumentType
