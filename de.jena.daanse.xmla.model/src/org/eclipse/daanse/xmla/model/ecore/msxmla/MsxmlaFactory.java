/**
 */
package org.eclipse.daanse.xmla.model.ecore.msxmla;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.MsxmlaPackage
 * @generated
 */
public interface MsxmlaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MsxmlaFactory eINSTANCE = org.eclipse.daanse.xmla.model.ecore.msxmla.impl.MsxmlaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Member Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Member Ref Type</em>'.
	 * @generated
	 */
	MemberRefType createMemberRefType();

	/**
	 * Returns a new object of class '<em>Members Lookup Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Members Lookup Type</em>'.
	 * @generated
	 */
	MembersLookupType createMembersLookupType();

	/**
	 * Returns a new object of class '<em>Norm Tuple Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Norm Tuple Set Type</em>'.
	 * @generated
	 */
	NormTupleSetType createNormTupleSetType();

	/**
	 * Returns a new object of class '<em>Norm Tuples Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Norm Tuples Type</em>'.
	 * @generated
	 */
	NormTuplesType createNormTuplesType();

	/**
	 * Returns a new object of class '<em>Norm Tuple Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Norm Tuple Type</em>'.
	 * @generated
	 */
	NormTupleType createNormTupleType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MsxmlaPackage getMsxmlaPackage();

} //MsxmlaFactory
