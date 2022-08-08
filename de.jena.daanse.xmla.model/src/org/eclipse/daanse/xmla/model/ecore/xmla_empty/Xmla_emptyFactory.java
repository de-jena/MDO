/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla_empty;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.xmla_empty.Xmla_emptyPackage
 * @generated
 */
public interface Xmla_emptyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Xmla_emptyFactory eINSTANCE = org.eclipse.daanse.xmla.model.ecore.xmla_empty.impl.Xmla_emptyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Emptyresult</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Emptyresult</em>'.
	 * @generated
	 */
	Emptyresult createEmptyresult();

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
	Xmla_emptyPackage getXmla_emptyPackage();

} //Xmla_emptyFactory
