/**
 */
package skos;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import rdf.PlainLiteral;
import rdf.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link skos.ConceptType#getType <em>Type</em>}</li>
 *   <li>{@link skos.ConceptType#getPrefLabel <em>Pref Label</em>}</li>
 *   <li>{@link skos.ConceptType#getInScheme <em>In Scheme</em>}</li>
 *   <li>{@link skos.ConceptType#getAbout <em>About</em>}</li>
 * </ul>
 *
 * @see skos.SkosPackage#getConceptType()
 * @model extendedMetaData="name='Concept_._type' kind='elementOnly'"
 * @generated
 */
public interface ConceptType extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link rdf.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see skos.SkosPackage#getConceptType_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='http://www.w3.org/1999/02/22-rdf-syntax-ns#'"
	 * @generated
	 */
	EList<Resource> getType();

	/**
	 * Returns the value of the '<em><b>Pref Label</b></em>' containment reference list.
	 * The list contents are of type {@link rdf.PlainLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pref Label</em>' containment reference list.
	 * @see skos.SkosPackage#getConceptType_PrefLabel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='prefLabel' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PlainLiteral> getPrefLabel();

	/**
	 * Returns the value of the '<em><b>In Scheme</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Scheme</em>' containment reference.
	 * @see #setInScheme(InSchemeType)
	 * @see skos.SkosPackage#getConceptType_InScheme()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inScheme' namespace='##targetNamespace'"
	 * @generated
	 */
	InSchemeType getInScheme();

	/**
	 * Sets the value of the '{@link skos.ConceptType#getInScheme <em>In Scheme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Scheme</em>' containment reference.
	 * @see #getInScheme()
	 * @generated
	 */
	void setInScheme(InSchemeType value);

	/**
	 * Returns the value of the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>About</em>' attribute.
	 * @see #setAbout(String)
	 * @see skos.SkosPackage#getConceptType_About()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='about' namespace='http://www.w3.org/1999/02/22-rdf-syntax-ns#'"
	 * @generated
	 */
	String getAbout();

	/**
	 * Sets the value of the '{@link skos.ConceptType#getAbout <em>About</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>About</em>' attribute.
	 * @see #getAbout()
	 * @generated
	 */
	void setAbout(String value);

} // ConceptType
