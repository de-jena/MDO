/*
 */
package skos;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept Scheme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link skos.ConceptScheme#getConceptScheme <em>Concept Scheme</em>}</li>
 * </ul>
 *
 * @see skos.SkosPackage#getConceptScheme()
 * @model extendedMetaData="name='ConceptScheme' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ConceptScheme extends EObject {
	/**
	 * Returns the value of the '<em><b>Concept Scheme</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept Scheme</em>' containment reference.
	 * @see #setConceptScheme(ConceptSchemeType)
	 * @see skos.SkosPackage#getConceptScheme_ConceptScheme()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ConceptScheme' namespace='##targetNamespace'"
	 * @generated
	 */
	ConceptSchemeType getConceptScheme();

	/**
	 * Sets the value of the '{@link skos.ConceptScheme#getConceptScheme <em>Concept Scheme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concept Scheme</em>' containment reference.
	 * @see #getConceptScheme()
	 * @generated
	 */
	void setConceptScheme(ConceptSchemeType value);

} // ConceptScheme
