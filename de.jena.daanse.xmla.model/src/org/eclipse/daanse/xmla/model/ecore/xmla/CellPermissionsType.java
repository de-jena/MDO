/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cell Permissions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CellPermissionsType#getCellPermission <em>Cell Permission</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCellPermissionsType()
 * @model extendedMetaData="name='CellPermissions_._type' kind='elementOnly'"
 * @generated
 */
public interface CellPermissionsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Cell Permission</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.CellPermission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell Permission</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCellPermissionsType_CellPermission()
	 * @model containment="true" upper="3"
	 *        extendedMetaData="kind='element' name='CellPermission'"
	 * @generated
	 */
	EList<CellPermission> getCellPermission();

} // CellPermissionsType
