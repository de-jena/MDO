/**
 */
package org.eclipse.daanse.xmla.model.ecore.msxmla;

import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.TupleType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Members Lookup Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.msxmla.MembersLookupType#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.MsxmlaPackage#getMembersLookupType()
 * @model extendedMetaData="name='MembersLookup_._type' kind='elementOnly'"
 * @generated
 */
public interface MembersLookupType extends EObject {
	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.TupleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.MsxmlaPackage#getMembersLookupType_Members()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Members'"
	 * @generated
	 */
	EList<TupleType> getMembers();

} // MembersLookupType
