/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla_exception;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.Xmla_exceptionPackage
 * @generated
 */
public interface Xmla_exceptionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Xmla_exceptionFactory eINSTANCE = org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.Xmla_exceptionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>End Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Type</em>'.
	 * @generated
	 */
	EndType createEndType();

	/**
	 * Returns a new object of class '<em>Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Type</em>'.
	 * @generated
	 */
	ErrorType createErrorType();

	/**
	 * Returns a new object of class '<em>Exception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exception</em>'.
	 * @generated
	 */
	Exception createException();

	/**
	 * Returns a new object of class '<em>Message Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Location</em>'.
	 * @generated
	 */
	MessageLocation createMessageLocation();

	/**
	 * Returns a new object of class '<em>Messages</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Messages</em>'.
	 * @generated
	 */
	Messages createMessages();

	/**
	 * Returns a new object of class '<em>Start Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Type</em>'.
	 * @generated
	 */
	StartType createStartType();

	/**
	 * Returns a new object of class '<em>Warning Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Warning Type</em>'.
	 * @generated
	 */
	WarningType createWarningType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Xmla_exceptionPackage getXmla_exceptionPackage();

} //Xmla_exceptionFactory
