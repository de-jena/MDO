/**
 */
package org.w3.ns.skos;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.w3.ns.skos.SkosPackage
 * @generated
 */
public interface SkosFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SkosFactory eINSTANCE = org.w3.ns.skos.impl.SkosFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Concept</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concept</em>'.
	 * @generated
	 */
	Concept createConcept();

	/**
	 * Returns a new object of class '<em>Concept Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concept Scheme</em>'.
	 * @generated
	 */
	ConceptScheme createConceptScheme();

	/**
	 * Returns a new object of class '<em>Concept Scheme Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concept Scheme Type</em>'.
	 * @generated
	 */
	ConceptSchemeType createConceptSchemeType();

	/**
	 * Returns a new object of class '<em>Concept Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concept Type</em>'.
	 * @generated
	 */
	ConceptType createConceptType();

	/**
	 * Returns a new object of class '<em>In Scheme Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>In Scheme Type</em>'.
	 * @generated
	 */
	InSchemeType createInSchemeType();

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
	SkosPackage getSkosPackage();

} //SkosFactory
