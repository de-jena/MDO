/**
 */
package org.w3.ns.skos;

import org.eclipse.emf.ecore.EObject;

import org.w3.ns.rdf.PlainLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept Scheme Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.ns.skos.ConceptSchemeType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.w3.ns.skos.ConceptSchemeType#getAbout <em>About</em>}</li>
 * </ul>
 *
 * @see org.w3.ns.skos.SkosPackage#getConceptSchemeType()
 * @model extendedMetaData="name='ConceptScheme_._type' kind='elementOnly'"
 * @generated
 */
public interface ConceptSchemeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(PlainLiteral)
	 * @see org.w3.ns.skos.SkosPackage#getConceptSchemeType_Title()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='title' namespace='http://purl.org/dc/terms/'"
	 * @generated
	 */
	PlainLiteral getTitle();

	/**
	 * Sets the value of the '{@link org.w3.ns.skos.ConceptSchemeType#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(PlainLiteral value);

	/**
	 * Returns the value of the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>About</em>' attribute.
	 * @see #setAbout(String)
	 * @see org.w3.ns.skos.SkosPackage#getConceptSchemeType_About()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='about' namespace='http://www.w3.org/1999/02/22-rdf-syntax-ns#'"
	 * @generated
	 */
	String getAbout();

	/**
	 * Sets the value of the '{@link org.w3.ns.skos.ConceptSchemeType#getAbout <em>About</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>About</em>' attribute.
	 * @see #getAbout()
	 * @generated
	 */
	void setAbout(String value);

} // ConceptSchemeType
