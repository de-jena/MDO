/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimension Permissions Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionPermissionsType1#getDimensionPermission <em>Dimension Permission</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionPermissionsType1()
 * @model extendedMetaData="name='DimensionPermissions_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface DimensionPermissionsType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Dimension Permission</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimensionPermission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension Permission</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionPermissionsType1_DimensionPermission()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DimensionPermission'"
	 * @generated
	 */
	EList<CubeDimensionPermission> getDimensionPermission();

} // DimensionPermissionsType1
