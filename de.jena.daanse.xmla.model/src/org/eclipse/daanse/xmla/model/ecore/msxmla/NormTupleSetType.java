/**
 */
package org.eclipse.daanse.xmla.model.ecore.msxmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Norm Tuple Set Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.msxmla.NormTupleSetType#getNormTuples <em>Norm Tuples</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.msxmla.NormTupleSetType#getMembersLookup <em>Members Lookup</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.MsxmlaPackage#getNormTupleSetType()
 * @model extendedMetaData="name='NormTupleSet_._type' kind='elementOnly'"
 * @generated
 */
public interface NormTupleSetType extends EObject {
	/**
	 * Returns the value of the '<em><b>Norm Tuples</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Norm Tuples</em>' containment reference.
	 * @see #setNormTuples(NormTuplesType)
	 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.MsxmlaPackage#getNormTupleSetType_NormTuples()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='NormTuples'"
	 * @generated
	 */
	NormTuplesType getNormTuples();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.msxmla.NormTupleSetType#getNormTuples <em>Norm Tuples</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Norm Tuples</em>' containment reference.
	 * @see #getNormTuples()
	 * @generated
	 */
	void setNormTuples(NormTuplesType value);

	/**
	 * Returns the value of the '<em><b>Members Lookup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members Lookup</em>' containment reference.
	 * @see #setMembersLookup(MembersLookupType)
	 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.MsxmlaPackage#getNormTupleSetType_MembersLookup()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MembersLookup'"
	 * @generated
	 */
	MembersLookupType getMembersLookup();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.msxmla.NormTupleSetType#getMembersLookup <em>Members Lookup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Members Lookup</em>' containment reference.
	 * @see #getMembersLookup()
	 * @generated
	 */
	void setMembersLookup(MembersLookupType value);

} // NormTupleSetType
