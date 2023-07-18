/*
 */
package de.jena.mdo.model.dbtree;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.mdo.model.dbtree.DbtreePackage
 * @generated
 */
@ProviderType
public interface DbtreeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DbtreeFactory eINSTANCE = de.jena.mdo.model.dbtree.impl.DbtreeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>DB Tree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DB Tree</em>'.
	 * @generated
	 */
	DBTree createDBTree();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DbtreePackage getDbtreePackage();

} //DbtreeFactory
