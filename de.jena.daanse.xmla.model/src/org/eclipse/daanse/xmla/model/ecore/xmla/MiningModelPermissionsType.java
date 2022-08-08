/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mining Model Permissions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModelPermissionsType#getMiningModelPermission <em>Mining Model Permission</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningModelPermissionsType()
 * @model extendedMetaData="name='MiningModelPermissions_._type' kind='elementOnly'"
 * @generated
 */
public interface MiningModelPermissionsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mining Model Permission</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModelPermission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mining Model Permission</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningModelPermissionsType_MiningModelPermission()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MiningModelPermission'"
	 * @generated
	 */
	EList<MiningModelPermission> getMiningModelPermission();

} // MiningModelPermissionsType
