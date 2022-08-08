/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine200;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.engine200.Engine200Package
 * @generated
 */
public interface Engine200Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Engine200Factory eINSTANCE = org.eclipse.daanse.xmla.model.ecore.engine200.impl.Engine200FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Warning Column Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Warning Column Type</em>'.
	 * @generated
	 */
	WarningColumnType createWarningColumnType();

	/**
	 * Returns a new object of class '<em>Warning Location Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Warning Location Object</em>'.
	 * @generated
	 */
	WarningLocationObject createWarningLocationObject();

	/**
	 * Returns a new object of class '<em>Warning Measure Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Warning Measure Type</em>'.
	 * @generated
	 */
	WarningMeasureType createWarningMeasureType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Engine200Package getEngine200Package();

} //Engine200Factory
