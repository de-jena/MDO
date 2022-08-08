/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Permissions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DatabasePermissionsType#getDatabasePermission <em>Database Permission</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDatabasePermissionsType()
 * @model extendedMetaData="name='DatabasePermissions_._type' kind='elementOnly'"
 * @generated
 */
public interface DatabasePermissionsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Database Permission</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.DatabasePermission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Permission</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDatabasePermissionsType_DatabasePermission()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DatabasePermission'"
	 * @generated
	 */
	EList<DatabasePermission> getDatabasePermission();

} // DatabasePermissionsType
