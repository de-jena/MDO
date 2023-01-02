/*
 */
package de.jena.piveau.dcatde;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.piveau.dcatde.DcatDEPackage
 * @generated
 */
@ProviderType
public interface DcatDEFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DcatDEFactory eINSTANCE = de.jena.piveau.dcatde.impl.DcatDEFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Contributor ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contributor ID</em>'.
	 * @generated
	 */
	ContributorID createContributorID();

	/**
	 * Returns a new object of class '<em>DCATDE Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DCATDE Root</em>'.
	 * @generated
	 */
	DCATDERoot createDCATDERoot();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DcatDEPackage getDcatDEPackage();

} //DcatDEFactory
