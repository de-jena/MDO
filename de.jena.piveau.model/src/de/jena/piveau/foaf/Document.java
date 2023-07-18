/*
 */
package de.jena.piveau.foaf;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.piveau.foaf.Document#getDocument <em>Document</em>}</li>
 * </ul>
 *
 * @see de.jena.piveau.foaf.FoafPackage#getDocument()
 * @model extendedMetaData="name='Document' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Document extends EObject {
	/**
	 * Returns the value of the '<em><b>Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document</em>' containment reference.
	 * @see #setDocument(DocumentType)
	 * @see de.jena.piveau.foaf.FoafPackage#getDocument_Document()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Document' namespace='##targetNamespace'"
	 * @generated
	 */
	DocumentType getDocument();

	/**
	 * Sets the value of the '{@link de.jena.piveau.foaf.Document#getDocument <em>Document</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document</em>' containment reference.
	 * @see #getDocument()
	 * @generated
	 */
	void setDocument(DocumentType value);

} // Document
