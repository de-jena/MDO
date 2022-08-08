/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Permissions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributePermissionsType#getAttributePermission <em>Attribute Permission</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAttributePermissionsType()
 * @model extendedMetaData="name='AttributePermissions_._type' kind='elementOnly'"
 * @generated
 */
public interface AttributePermissionsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute Permission</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributePermission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Permission</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAttributePermissionsType_AttributePermission()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AttributePermission'"
	 * @generated
	 */
	EList<AttributePermission> getAttributePermission();

} // AttributePermissionsType
