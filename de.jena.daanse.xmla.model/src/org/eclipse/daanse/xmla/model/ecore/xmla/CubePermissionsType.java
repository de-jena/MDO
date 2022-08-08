/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cube Permissions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubePermissionsType#getCubePermission <em>Cube Permission</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCubePermissionsType()
 * @model extendedMetaData="name='CubePermissions_._type' kind='elementOnly'"
 * @generated
 */
public interface CubePermissionsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Cube Permission</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.CubePermission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cube Permission</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCubePermissionsType_CubePermission()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CubePermission'"
	 * @generated
	 */
	EList<CubePermission> getCubePermission();

} // CubePermissionsType
