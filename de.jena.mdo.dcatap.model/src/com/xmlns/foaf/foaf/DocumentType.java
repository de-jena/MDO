/**
 */
package com.xmlns.foaf.foaf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.w3.ns.rdf.PlainLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.xmlns.foaf.foaf.DocumentType#getName <em>Name</em>}</li>
 *   <li>{@link com.xmlns.foaf.foaf.DocumentType#getAbout <em>About</em>}</li>
 *   <li>{@link com.xmlns.foaf.foaf.DocumentType#getNodeID <em>Node ID</em>}</li>
 * </ul>
 *
 * @see com.xmlns.foaf.foaf.FoafPackage#getDocumentType()
 * @model extendedMetaData="name='Document_._type' kind='elementOnly'"
 * @generated
 */
public interface DocumentType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3.ns.rdf.PlainLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference list.
	 * @see com.xmlns.foaf.foaf.FoafPackage#getDocumentType_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PlainLiteral> getName();

	/**
	 * Returns the value of the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>About</em>' attribute.
	 * @see #setAbout(String)
	 * @see com.xmlns.foaf.foaf.FoafPackage#getDocumentType_About()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='about' namespace='http://www.w3.org/1999/02/22-rdf-syntax-ns#'"
	 * @generated
	 */
	String getAbout();

	/**
	 * Sets the value of the '{@link com.xmlns.foaf.foaf.DocumentType#getAbout <em>About</em>}' attribute.
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
	 * @see com.xmlns.foaf.foaf.FoafPackage#getDocumentType_NodeID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        extendedMetaData="kind='attribute' name='nodeID' namespace='http://www.w3.org/1999/02/22-rdf-syntax-ns#'"
	 * @generated
	 */
	String getNodeID();

	/**
	 * Sets the value of the '{@link com.xmlns.foaf.foaf.DocumentType#getNodeID <em>Node ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node ID</em>' attribute.
	 * @see #getNodeID()
	 * @generated
	 */
	void setNodeID(String value);

} // DocumentType
