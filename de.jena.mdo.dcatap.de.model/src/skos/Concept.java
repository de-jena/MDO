/*
 */
package skos;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link skos.Concept#getConcept <em>Concept</em>}</li>
 *   <li>{@link skos.Concept#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @see skos.SkosPackage#getConcept()
 * @model extendedMetaData="name='Concept' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Concept extends EObject {
	/**
	 * Returns the value of the '<em><b>Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept</em>' containment reference.
	 * @see #setConcept(ConceptType)
	 * @see skos.SkosPackage#getConcept_Concept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Concept' namespace='##targetNamespace'"
	 * @generated
	 */
	ConceptType getConcept();

	/**
	 * Sets the value of the '{@link skos.Concept#getConcept <em>Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concept</em>' containment reference.
	 * @see #getConcept()
	 * @generated
	 */
	void setConcept(ConceptType value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' attribute.
	 * @see #setResource(String)
	 * @see skos.SkosPackage#getConcept_Resource()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='resource' namespace='http://www.w3.org/1999/02/22-rdf-syntax-ns#'"
	 * @generated
	 */
	String getResource();

	/**
	 * Sets the value of the '{@link skos.Concept#getResource <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' attribute.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(String value);

} // Concept
