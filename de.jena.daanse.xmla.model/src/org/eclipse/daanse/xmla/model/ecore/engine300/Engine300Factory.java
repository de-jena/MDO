/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine300;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package
 * @generated
 */
public interface Engine300Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Engine300Factory eINSTANCE = org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Calculation Properties Visualization Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calculation Properties Visualization Properties</em>'.
	 * @generated
	 */
	CalculationPropertiesVisualizationProperties createCalculationPropertiesVisualizationProperties();

	/**
	 * Returns a new object of class '<em>Dimension Attribute Visualization Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dimension Attribute Visualization Properties</em>'.
	 * @generated
	 */
	DimensionAttributeVisualizationProperties createDimensionAttributeVisualizationProperties();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Hierarchy Visualization Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hierarchy Visualization Properties</em>'.
	 * @generated
	 */
	HierarchyVisualizationProperties createHierarchyVisualizationProperties();

	/**
	 * Returns a new object of class '<em>Relationship End Visualization Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship End Visualization Properties</em>'.
	 * @generated
	 */
	RelationshipEndVisualizationProperties createRelationshipEndVisualizationProperties();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Engine300Package getEngine300Package();

} //Engine300Factory
