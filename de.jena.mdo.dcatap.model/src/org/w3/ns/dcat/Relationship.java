/**
 */
package org.w3.ns.dcat;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.ns.dcat.Relationship#getRelationship <em>Relationship</em>}</li>
 * </ul>
 *
 * @see org.w3.ns.dcat.DcatPackage#getRelationship()
 * @model extendedMetaData="name='Relationship' kind='elementOnly'"
 * @generated
 */
public interface Relationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference.
	 * @see #setRelationship(RelationshipType)
	 * @see org.w3.ns.dcat.DcatPackage#getRelationship_Relationship()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Relationship' namespace='##targetNamespace'"
	 * @generated
	 */
	RelationshipType getRelationship();

	/**
	 * Sets the value of the '{@link org.w3.ns.dcat.Relationship#getRelationship <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' containment reference.
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(RelationshipType value);

} // Relationship
