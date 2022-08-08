/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine200_200;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.Engine200_200Package
 * @generated
 */
public interface Engine200_200Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Engine200_200Factory eINSTANCE = org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.Engine200_200FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Expression Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Binding</em>'.
	 * @generated
	 */
	ExpressionBinding createExpressionBinding();

	/**
	 * Returns a new object of class '<em>Row Number Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Row Number Binding</em>'.
	 * @generated
	 */
	RowNumberBinding createRowNumberBinding();

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
	Engine200_200Package getEngine200_200Package();

} //Engine200_200Factory
