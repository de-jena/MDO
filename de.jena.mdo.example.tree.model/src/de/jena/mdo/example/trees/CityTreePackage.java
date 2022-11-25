/*
 */
package de.jena.mdo.example.trees;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.jena.mdo.example.trees.CityTreeFactory
 * @model kind="package"
 *        annotation="Version value='1.0'"
 * @generated
 */
@ProviderType
public interface CityTreePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "trees";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://example.de/trees/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "trees";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CityTreePackage eINSTANCE = de.jena.mdo.example.trees.impl.CityTreePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.jena.mdo.example.trees.impl.CityTreeImpl <em>City Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.example.trees.impl.CityTreeImpl
	 * @see de.jena.mdo.example.trees.impl.CityTreePackageImpl#getCityTree()
	 * @generated
	 */
	int CITY_TREE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_TREE__ID = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_TREE__LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_TREE__KIND = 2;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_TREE__DIMENSION = 3;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_TREE__NUMBER = 4;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_TREE__YEAR = 5;

	/**
	 * The number of structural features of the '<em>City Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_TREE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>City Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_TREE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.example.trees.impl.ConiferTreeImpl <em>Conifer Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.example.trees.impl.ConiferTreeImpl
	 * @see de.jena.mdo.example.trees.impl.CityTreePackageImpl#getConiferTree()
	 * @generated
	 */
	int CONIFER_TREE = 1;

	/**
	 * The number of structural features of the '<em>Conifer Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONIFER_TREE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Conifer Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONIFER_TREE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.example.trees.impl.DeciduousTreeImpl <em>Deciduous Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.example.trees.impl.DeciduousTreeImpl
	 * @see de.jena.mdo.example.trees.impl.CityTreePackageImpl#getDeciduousTree()
	 * @generated
	 */
	int DECIDUOUS_TREE = 2;

	/**
	 * The number of structural features of the '<em>Deciduous Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIDUOUS_TREE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Deciduous Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIDUOUS_TREE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.example.trees.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.example.trees.impl.LocationImpl
	 * @see de.jena.mdo.example.trees.impl.CityTreePackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LATITUDE = 0;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LONGITUDE = 1;

	/**
	 * The feature id for the '<em><b>Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ALTITUDE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__NAME = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__AREA = 5;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.example.trees.impl.KindImpl <em>Kind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.example.trees.impl.KindImpl
	 * @see de.jena.mdo.example.trees.impl.CityTreePackageImpl#getKind()
	 * @generated
	 */
	int KIND = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.example.trees.impl.DimensionImpl <em>Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.example.trees.impl.DimensionImpl
	 * @see de.jena.mdo.example.trees.impl.CityTreePackageImpl#getDimension()
	 * @generated
	 */
	int DIMENSION = 5;

	/**
	 * The feature id for the '<em><b>Diameter Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__DIAMETER_TOP = 0;

	/**
	 * The feature id for the '<em><b>Diameter Trunk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__DIAMETER_TRUNK = 1;

	/**
	 * The feature id for the '<em><b>Extent Trunk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__EXTENT_TRUNK = 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__HEIGHT = 3;

	/**
	 * The number of structural features of the '<em>Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.jena.mdo.example.trees.CityTree <em>City Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>City Tree</em>'.
	 * @see de.jena.mdo.example.trees.CityTree
	 * @generated
	 */
	EClass getCityTree();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.example.trees.CityTree#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.mdo.example.trees.CityTree#getId()
	 * @see #getCityTree()
	 * @generated
	 */
	EAttribute getCityTree_Id();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.example.trees.CityTree#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see de.jena.mdo.example.trees.CityTree#getLocation()
	 * @see #getCityTree()
	 * @generated
	 */
	EReference getCityTree_Location();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.example.trees.CityTree#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kind</em>'.
	 * @see de.jena.mdo.example.trees.CityTree#getKind()
	 * @see #getCityTree()
	 * @generated
	 */
	EReference getCityTree_Kind();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.example.trees.CityTree#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dimension</em>'.
	 * @see de.jena.mdo.example.trees.CityTree#getDimension()
	 * @see #getCityTree()
	 * @generated
	 */
	EReference getCityTree_Dimension();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.example.trees.CityTree#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see de.jena.mdo.example.trees.CityTree#getNumber()
	 * @see #getCityTree()
	 * @generated
	 */
	EAttribute getCityTree_Number();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.example.trees.CityTree#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see de.jena.mdo.example.trees.CityTree#getYear()
	 * @see #getCityTree()
	 * @generated
	 */
	EAttribute getCityTree_Year();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.example.trees.ConiferTree <em>Conifer Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conifer Tree</em>'.
	 * @see de.jena.mdo.example.trees.ConiferTree
	 * @generated
	 */
	EClass getConiferTree();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.example.trees.DeciduousTree <em>Deciduous Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deciduous Tree</em>'.
	 * @see de.jena.mdo.example.trees.DeciduousTree
	 * @generated
	 */
	EClass getDeciduousTree();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.example.trees.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see de.jena.mdo.example.trees.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.example.trees.Location#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see de.jena.mdo.example.trees.Location#getLatitude()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.example.trees.Location#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see de.jena.mdo.example.trees.Location#getLongitude()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.example.trees.Location#getAltitude <em>Altitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altitude</em>'.
	 * @see de.jena.mdo.example.trees.Location#getAltitude()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Altitude();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.example.trees.Location#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.jena.mdo.example.trees.Location#getName()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.example.trees.Location#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.jena.mdo.example.trees.Location#getDescription()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.example.trees.Location#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Area</em>'.
	 * @see de.jena.mdo.example.trees.Location#getArea()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Area();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.example.trees.Kind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kind</em>'.
	 * @see de.jena.mdo.example.trees.Kind
	 * @generated
	 */
	EClass getKind();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.example.trees.Kind#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.jena.mdo.example.trees.Kind#getName()
	 * @see #getKind()
	 * @generated
	 */
	EAttribute getKind_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.example.trees.Kind#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.jena.mdo.example.trees.Kind#getDescription()
	 * @see #getKind()
	 * @generated
	 */
	EAttribute getKind_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.example.trees.Kind#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.jena.mdo.example.trees.Kind#getType()
	 * @see #getKind()
	 * @generated
	 */
	EAttribute getKind_Type();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.example.trees.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension</em>'.
	 * @see de.jena.mdo.example.trees.Dimension
	 * @generated
	 */
	EClass getDimension();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.example.trees.Dimension#getDiameterTop <em>Diameter Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diameter Top</em>'.
	 * @see de.jena.mdo.example.trees.Dimension#getDiameterTop()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_DiameterTop();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.example.trees.Dimension#getDiameterTrunk <em>Diameter Trunk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diameter Trunk</em>'.
	 * @see de.jena.mdo.example.trees.Dimension#getDiameterTrunk()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_DiameterTrunk();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.example.trees.Dimension#getExtentTrunk <em>Extent Trunk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extent Trunk</em>'.
	 * @see de.jena.mdo.example.trees.Dimension#getExtentTrunk()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_ExtentTrunk();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.example.trees.Dimension#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see de.jena.mdo.example.trees.Dimension#getHeight()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Height();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CityTreeFactory getCityTreeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.jena.mdo.example.trees.impl.CityTreeImpl <em>City Tree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.example.trees.impl.CityTreeImpl
		 * @see de.jena.mdo.example.trees.impl.CityTreePackageImpl#getCityTree()
		 * @generated
		 */
		EClass CITY_TREE = eINSTANCE.getCityTree();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY_TREE__ID = eINSTANCE.getCityTree_Id();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY_TREE__LOCATION = eINSTANCE.getCityTree_Location();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY_TREE__KIND = eINSTANCE.getCityTree_Kind();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY_TREE__DIMENSION = eINSTANCE.getCityTree_Dimension();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY_TREE__NUMBER = eINSTANCE.getCityTree_Number();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY_TREE__YEAR = eINSTANCE.getCityTree_Year();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.example.trees.impl.ConiferTreeImpl <em>Conifer Tree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.example.trees.impl.ConiferTreeImpl
		 * @see de.jena.mdo.example.trees.impl.CityTreePackageImpl#getConiferTree()
		 * @generated
		 */
		EClass CONIFER_TREE = eINSTANCE.getConiferTree();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.example.trees.impl.DeciduousTreeImpl <em>Deciduous Tree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.example.trees.impl.DeciduousTreeImpl
		 * @see de.jena.mdo.example.trees.impl.CityTreePackageImpl#getDeciduousTree()
		 * @generated
		 */
		EClass DECIDUOUS_TREE = eINSTANCE.getDeciduousTree();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.example.trees.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.example.trees.impl.LocationImpl
		 * @see de.jena.mdo.example.trees.impl.CityTreePackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LATITUDE = eINSTANCE.getLocation_Latitude();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LONGITUDE = eINSTANCE.getLocation_Longitude();

		/**
		 * The meta object literal for the '<em><b>Altitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__ALTITUDE = eINSTANCE.getLocation_Altitude();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__NAME = eINSTANCE.getLocation_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__DESCRIPTION = eINSTANCE.getLocation_Description();

		/**
		 * The meta object literal for the '<em><b>Area</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__AREA = eINSTANCE.getLocation_Area();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.example.trees.impl.KindImpl <em>Kind</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.example.trees.impl.KindImpl
		 * @see de.jena.mdo.example.trees.impl.CityTreePackageImpl#getKind()
		 * @generated
		 */
		EClass KIND = eINSTANCE.getKind();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KIND__NAME = eINSTANCE.getKind_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KIND__DESCRIPTION = eINSTANCE.getKind_Description();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KIND__TYPE = eINSTANCE.getKind_Type();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.example.trees.impl.DimensionImpl <em>Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.example.trees.impl.DimensionImpl
		 * @see de.jena.mdo.example.trees.impl.CityTreePackageImpl#getDimension()
		 * @generated
		 */
		EClass DIMENSION = eINSTANCE.getDimension();

		/**
		 * The meta object literal for the '<em><b>Diameter Top</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__DIAMETER_TOP = eINSTANCE.getDimension_DiameterTop();

		/**
		 * The meta object literal for the '<em><b>Diameter Trunk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__DIAMETER_TRUNK = eINSTANCE.getDimension_DiameterTrunk();

		/**
		 * The meta object literal for the '<em><b>Extent Trunk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__EXTENT_TRUNK = eINSTANCE.getDimension_ExtentTrunk();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__HEIGHT = eINSTANCE.getDimension_Height();

	}

} //CityTreePackage
