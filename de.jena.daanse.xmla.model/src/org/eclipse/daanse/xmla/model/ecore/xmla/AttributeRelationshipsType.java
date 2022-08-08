/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Relationships Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeRelationshipsType#getAttributeRelationship <em>Attribute Relationship</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAttributeRelationshipsType()
 * @model extendedMetaData="name='AttributeRelationships_._type' kind='elementOnly'"
 * @generated
 */
public interface AttributeRelationshipsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeRelationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Relationship</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAttributeRelationshipsType_AttributeRelationship()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AttributeRelationship'"
	 * @generated
	 */
	EList<AttributeRelationship> getAttributeRelationship();

} // AttributeRelationshipsType
