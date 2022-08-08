/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine300_300;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationships</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.Relationships#getRelationship <em>Relationship</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.Engine300_300Package#getRelationships()
 * @model extendedMetaData="name='Relationships' kind='elementOnly'"
 * @generated
 */
public interface Relationships extends EObject {
	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.engine300_300.Relationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.Engine300_300Package#getRelationships_Relationship()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Relationship'"
	 * @generated
	 */
	EList<Relationship> getRelationship();

} // Relationships
