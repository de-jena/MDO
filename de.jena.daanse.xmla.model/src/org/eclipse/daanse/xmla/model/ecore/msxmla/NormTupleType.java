/**
 */
package org.eclipse.daanse.xmla.model.ecore.msxmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Norm Tuple Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.msxmla.NormTupleType#getMemberRef <em>Member Ref</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.MsxmlaPackage#getNormTupleType()
 * @model extendedMetaData="name='NormTuple_._type' kind='elementOnly'"
 * @generated
 */
public interface NormTupleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Member Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.msxmla.MemberRefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Ref</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.MsxmlaPackage#getNormTupleType_MemberRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MemberRef'"
	 * @generated
	 */
	EList<MemberRefType> getMemberRef();

} // NormTupleType
