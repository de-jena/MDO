/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine300_300;

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
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.Relationship#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.Relationship#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.Relationship#getFromRelationshipEnd <em>From Relationship End</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.Relationship#getToRelationshipEnd <em>To Relationship End</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.Engine300_300Package#getRelationship()
 * @model extendedMetaData="name='Relationship' kind='elementOnly'"
 * @generated
 */
public interface Relationship extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.Engine300_300Package#getRelationship_ID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='ID'"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.Relationship#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see #isSetVisible()
	 * @see #unsetVisible()
	 * @see #setVisible(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.Engine300_300Package#getRelationship_Visible()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='Visible'"
	 * @generated
	 */
	boolean isVisible();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.Relationship#isVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible</em>' attribute.
	 * @see #isSetVisible()
	 * @see #unsetVisible()
	 * @see #isVisible()
	 * @generated
	 */
	void setVisible(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.Relationship#isVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVisible()
	 * @see #isVisible()
	 * @see #setVisible(boolean)
	 * @generated
	 */
	void unsetVisible();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.Relationship#isVisible <em>Visible</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Visible</em>' attribute is set.
	 * @see #unsetVisible()
	 * @see #isVisible()
	 * @see #setVisible(boolean)
	 * @generated
	 */
	boolean isSetVisible();

	/**
	 * Returns the value of the '<em><b>From Relationship End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Relationship End</em>' containment reference.
	 * @see #setFromRelationshipEnd(RelationshipEnd)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.Engine300_300Package#getRelationship_FromRelationshipEnd()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FromRelationshipEnd'"
	 * @generated
	 */
	RelationshipEnd getFromRelationshipEnd();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.Relationship#getFromRelationshipEnd <em>From Relationship End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Relationship End</em>' containment reference.
	 * @see #getFromRelationshipEnd()
	 * @generated
	 */
	void setFromRelationshipEnd(RelationshipEnd value);

	/**
	 * Returns the value of the '<em><b>To Relationship End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Relationship End</em>' containment reference.
	 * @see #setToRelationshipEnd(RelationshipEnd)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.Engine300_300Package#getRelationship_ToRelationshipEnd()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ToRelationshipEnd'"
	 * @generated
	 */
	RelationshipEnd getToRelationshipEnd();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.Relationship#getToRelationshipEnd <em>To Relationship End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Relationship End</em>' containment reference.
	 * @see #getToRelationshipEnd()
	 * @generated
	 */
	void setToRelationshipEnd(RelationshipEnd value);

} // Relationship
