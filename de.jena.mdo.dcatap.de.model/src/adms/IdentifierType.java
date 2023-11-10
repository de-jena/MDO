/*
 */
package adms;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

import rdf.TypedLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifier Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adms.IdentifierType#getNotation <em>Notation</em>}</li>
 *   <li>{@link adms.IdentifierType#getAbout <em>About</em>}</li>
 * </ul>
 *
 * @see adms.AdmsPackage#getIdentifierType()
 * @model extendedMetaData="name='Identifier_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface IdentifierType extends EObject {
	/**
	 * Returns the value of the '<em><b>Notation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notation</em>' containment reference.
	 * @see #setNotation(TypedLiteral)
	 * @see adms.AdmsPackage#getIdentifierType_Notation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='notation' namespace='http://www.w3.org/2004/02/skos/core#'"
	 * @generated
	 */
	TypedLiteral getNotation();

	/**
	 * Sets the value of the '{@link adms.IdentifierType#getNotation <em>Notation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notation</em>' containment reference.
	 * @see #getNotation()
	 * @generated
	 */
	void setNotation(TypedLiteral value);

	/**
	 * Returns the value of the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>About</em>' attribute.
	 * @see #setAbout(String)
	 * @see adms.AdmsPackage#getIdentifierType_About()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='about' namespace='http://www.w3.org/1999/02/22-rdf-syntax-ns#'"
	 * @generated
	 */
	String getAbout();

	/**
	 * Sets the value of the '{@link adms.IdentifierType#getAbout <em>About</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>About</em>' attribute.
	 * @see #getAbout()
	 * @generated
	 */
	void setAbout(String value);

} // IdentifierType
