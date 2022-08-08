/**
 */
package org.eclipse.daanse.xmla.model.ecore.msxmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Norm Tuples Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.msxmla.NormTuplesType#getNormTuple <em>Norm Tuple</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.MsxmlaPackage#getNormTuplesType()
 * @model extendedMetaData="name='NormTuplesType' kind='elementOnly'"
 * @generated
 */
public interface NormTuplesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Norm Tuple</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.msxmla.NormTupleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Norm Tuple</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.MsxmlaPackage#getNormTuplesType_NormTuple()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NormTuple'"
	 * @generated
	 */
	EList<NormTupleType> getNormTuple();

} // NormTuplesType
