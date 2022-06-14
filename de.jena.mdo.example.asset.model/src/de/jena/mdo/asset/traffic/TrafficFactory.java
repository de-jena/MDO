/**
 */
package de.jena.mdo.asset.traffic;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.mdo.asset.traffic.TrafficPackage
 * @generated
 */
public interface TrafficFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TrafficFactory eINSTANCE = de.jena.mdo.asset.traffic.impl.TrafficFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>DETECTOR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DETECTOR</em>'.
	 * @generated
	 */
	DETECTOR createDETECTOR();

	/**
	 * Returns a new object of class '<em>POINT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>POINT</em>'.
	 * @generated
	 */
	POINT createPOINT();

	/**
	 * Returns a new object of class '<em>EDGEITEM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EDGEITEM</em>'.
	 * @generated
	 */
	EDGEITEM createEDGEITEM();

	/**
	 * Returns a new object of class '<em>EDGE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EDGE</em>'.
	 * @generated
	 */
	EDGE createEDGE();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TrafficPackage getTrafficPackage();

} //TrafficFactory
