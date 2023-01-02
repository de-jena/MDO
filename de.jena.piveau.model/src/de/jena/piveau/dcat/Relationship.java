/*
 */
package de.jena.piveau.dcat;

import de.jena.piveau.rdf.PlainLiteral;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.piveau.dcat.Relationship#getHadRole <em>Had Role</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.Relationship#getDescription <em>Description</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.Relationship#getAbout <em>About</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.Relationship#getNodeID <em>Node ID</em>}</li>
 * </ul>
 *
 * @see de.jena.piveau.dcat.DcatPackage#getRelationship()
 * @model extendedMetaData="name='Relationship' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Relationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Had Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Had Role</em>' containment reference.
	 * @see #setHadRole(EObject)
	 * @see de.jena.piveau.dcat.DcatPackage#getRelationship_HadRole()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hadRole' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getHadRole();

	/**
	 * Sets the value of the '{@link de.jena.piveau.dcat.Relationship#getHadRole <em>Had Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Had Role</em>' containment reference.
	 * @see #getHadRole()
	 * @generated
	 */
	void setHadRole(EObject value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(PlainLiteral)
	 * @see de.jena.piveau.dcat.DcatPackage#getRelationship_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='http://purl.org/dc/terms/'"
	 * @generated
	 */
	PlainLiteral getDescription();

	/**
	 * Sets the value of the '{@link de.jena.piveau.dcat.Relationship#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(PlainLiteral value);

	/**
	 * Returns the value of the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>About</em>' attribute.
	 * @see #setAbout(String)
	 * @see de.jena.piveau.dcat.DcatPackage#getRelationship_About()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='about' namespace='http://www.w3.org/1999/02/22-rdf-syntax-ns#'"
	 * @generated
	 */
	String getAbout();

	/**
	 * Sets the value of the '{@link de.jena.piveau.dcat.Relationship#getAbout <em>About</em>}' attribute.
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
	 * @see de.jena.piveau.dcat.DcatPackage#getRelationship_NodeID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        extendedMetaData="kind='attribute' name='nodeID' namespace='http://www.w3.org/1999/02/22-rdf-syntax-ns#'"
	 * @generated
	 */
	String getNodeID();

	/**
	 * Sets the value of the '{@link de.jena.piveau.dcat.Relationship#getNodeID <em>Node ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node ID</em>' attribute.
	 * @see #getNodeID()
	 * @generated
	 */
	void setNodeID(String value);

} // Relationship
