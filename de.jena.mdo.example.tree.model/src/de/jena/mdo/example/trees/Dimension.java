/*
 */
package de.jena.mdo.example.trees;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.example.trees.Dimension#getDiameterTop <em>Diameter Top</em>}</li>
 *   <li>{@link de.jena.mdo.example.trees.Dimension#getDiameterTrunk <em>Diameter Trunk</em>}</li>
 *   <li>{@link de.jena.mdo.example.trees.Dimension#getExtentTrunk <em>Extent Trunk</em>}</li>
 *   <li>{@link de.jena.mdo.example.trees.Dimension#getHeight <em>Height</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.example.trees.CityTreePackage#getDimension()
 * @model
 * @generated
 */
@ProviderType
public interface Dimension extends EObject {
	/**
	 * Returns the value of the '<em><b>Diameter Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diameter Top</em>' attribute.
	 * @see #setDiameterTop(double)
	 * @see de.jena.mdo.example.trees.CityTreePackage#getDimension_DiameterTop()
	 * @model
	 * @generated
	 */
	double getDiameterTop();

	/**
	 * Sets the value of the '{@link de.jena.mdo.example.trees.Dimension#getDiameterTop <em>Diameter Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diameter Top</em>' attribute.
	 * @see #getDiameterTop()
	 * @generated
	 */
	void setDiameterTop(double value);

	/**
	 * Returns the value of the '<em><b>Diameter Trunk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diameter Trunk</em>' attribute.
	 * @see #setDiameterTrunk(double)
	 * @see de.jena.mdo.example.trees.CityTreePackage#getDimension_DiameterTrunk()
	 * @model
	 * @generated
	 */
	double getDiameterTrunk();

	/**
	 * Sets the value of the '{@link de.jena.mdo.example.trees.Dimension#getDiameterTrunk <em>Diameter Trunk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diameter Trunk</em>' attribute.
	 * @see #getDiameterTrunk()
	 * @generated
	 */
	void setDiameterTrunk(double value);

	/**
	 * Returns the value of the '<em><b>Extent Trunk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extent Trunk</em>' attribute.
	 * @see #setExtentTrunk(double)
	 * @see de.jena.mdo.example.trees.CityTreePackage#getDimension_ExtentTrunk()
	 * @model
	 * @generated
	 */
	double getExtentTrunk();

	/**
	 * Sets the value of the '{@link de.jena.mdo.example.trees.Dimension#getExtentTrunk <em>Extent Trunk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extent Trunk</em>' attribute.
	 * @see #getExtentTrunk()
	 * @generated
	 */
	void setExtentTrunk(double value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(String)
	 * @see de.jena.mdo.example.trees.CityTreePackage#getDimension_Height()
	 * @model
	 * @generated
	 */
	String getHeight();

	/**
	 * Sets the value of the '{@link de.jena.mdo.example.trees.Dimension#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(String value);

} // Dimension
