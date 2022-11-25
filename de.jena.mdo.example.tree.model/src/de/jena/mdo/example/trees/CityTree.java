/*
 */
package de.jena.mdo.example.trees;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>City Tree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.example.trees.CityTree#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.mdo.example.trees.CityTree#getLocation <em>Location</em>}</li>
 *   <li>{@link de.jena.mdo.example.trees.CityTree#getKind <em>Kind</em>}</li>
 *   <li>{@link de.jena.mdo.example.trees.CityTree#getDimension <em>Dimension</em>}</li>
 *   <li>{@link de.jena.mdo.example.trees.CityTree#getNumber <em>Number</em>}</li>
 *   <li>{@link de.jena.mdo.example.trees.CityTree#getYear <em>Year</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.example.trees.CityTreePackage#getCityTree()
 * @model
 * @generated
 */
@ProviderType
public interface CityTree extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.jena.mdo.example.trees.CityTreePackage#getCityTree_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.jena.mdo.example.trees.CityTree#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Location)
	 * @see de.jena.mdo.example.trees.CityTreePackage#getCityTree_Location()
	 * @model containment="true"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link de.jena.mdo.example.trees.CityTree#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' containment reference.
	 * @see #setKind(Kind)
	 * @see de.jena.mdo.example.trees.CityTreePackage#getCityTree_Kind()
	 * @model containment="true"
	 * @generated
	 */
	Kind getKind();

	/**
	 * Sets the value of the '{@link de.jena.mdo.example.trees.CityTree#getKind <em>Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' containment reference.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(Kind value);

	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension</em>' containment reference.
	 * @see #setDimension(Dimension)
	 * @see de.jena.mdo.example.trees.CityTreePackage#getCityTree_Dimension()
	 * @model containment="true"
	 * @generated
	 */
	Dimension getDimension();

	/**
	 * Sets the value of the '{@link de.jena.mdo.example.trees.CityTree#getDimension <em>Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension</em>' containment reference.
	 * @see #getDimension()
	 * @generated
	 */
	void setDimension(Dimension value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(String)
	 * @see de.jena.mdo.example.trees.CityTreePackage#getCityTree_Number()
	 * @model
	 * @generated
	 */
	String getNumber();

	/**
	 * Sets the value of the '{@link de.jena.mdo.example.trees.CityTree#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(String value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see de.jena.mdo.example.trees.CityTreePackage#getCityTree_Year()
	 * @model
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link de.jena.mdo.example.trees.CityTree#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

} // CityTree
