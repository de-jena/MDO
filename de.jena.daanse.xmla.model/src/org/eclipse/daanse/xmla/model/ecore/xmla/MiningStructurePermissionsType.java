/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mining Structure Permissions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructurePermissionsType#getMiningStructurePermission <em>Mining Structure Permission</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningStructurePermissionsType()
 * @model extendedMetaData="name='MiningStructurePermissions_._type' kind='elementOnly'"
 * @generated
 */
public interface MiningStructurePermissionsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mining Structure Permission</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructurePermission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mining Structure Permission</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningStructurePermissionsType_MiningStructurePermission()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MiningStructurePermission'"
	 * @generated
	 */
	EList<MiningStructurePermission> getMiningStructurePermission();

} // MiningStructurePermissionsType
