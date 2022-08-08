/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Source Permissions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSourcePermissionsType#getDataSourcePermission <em>Data Source Permission</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDataSourcePermissionsType()
 * @model extendedMetaData="name='DataSourcePermissions_._type' kind='elementOnly'"
 * @generated
 */
public interface DataSourcePermissionsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Source Permission</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSourcePermission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source Permission</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDataSourcePermissionsType_DataSourcePermission()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DataSourcePermission'"
	 * @generated
	 */
	EList<DataSourcePermission> getDataSourcePermission();

} // DataSourcePermissionsType
