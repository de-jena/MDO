/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Roles Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.RolesType#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getRolesType()
 * @model extendedMetaData="name='Roles_._type' kind='elementOnly'"
 * @generated
 */
public interface RolesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getRolesType_Role()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Role'"
	 * @generated
	 */
	EList<Role> getRole();

} // RolesType