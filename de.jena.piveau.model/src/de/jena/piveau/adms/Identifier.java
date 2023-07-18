/*
 */
package de.jena.piveau.adms;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.piveau.adms.Identifier#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 *
 * @see de.jena.piveau.adms.AdmsPackage#getIdentifier()
 * @model extendedMetaData="name='Identifier' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Identifier extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(IdentifierType)
	 * @see de.jena.piveau.adms.AdmsPackage#getIdentifier_Identifier()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	IdentifierType getIdentifier();

	/**
	 * Sets the value of the '{@link de.jena.piveau.adms.Identifier#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(IdentifierType value);

} // Identifier
