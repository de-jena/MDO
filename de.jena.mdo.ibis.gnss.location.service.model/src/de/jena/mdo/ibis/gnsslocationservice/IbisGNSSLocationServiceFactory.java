/*
 */
package de.jena.mdo.ibis.gnsslocationservice;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.mdo.ibis.gnsslocationservice.IbisGNSSLocationServicePackage
 * @generated
 */
@ProviderType
public interface IbisGNSSLocationServiceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IbisGNSSLocationServiceFactory eINSTANCE = de.jena.mdo.ibis.gnsslocationservice.impl.IbisGNSSLocationServiceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>GNSS Location Service Data Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GNSS Location Service Data Structure</em>'.
	 * @generated
	 */
	GNSSLocationServiceDataStructure createGNSSLocationServiceDataStructure();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IbisGNSSLocationServicePackage getIbisGNSSLocationServicePackage();

} //IbisGNSSLocationServiceFactory
