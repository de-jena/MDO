/**
 */
package de.jena.mdo.model.dbtree;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see de.jena.mdo.model.dbtree.DbtreeFactory
 * @model kind="package"
 *        annotation="Version value='1.0'"
 * @generated
 */
public interface DbtreePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dbtree";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://jena.de/mdo/tree/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dbtree";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DbtreePackage eINSTANCE = de.jena.mdo.model.dbtree.impl.DbtreePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.jena.mdo.model.dbtree.impl.DBTreeImpl <em>DB Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.model.dbtree.impl.DBTreeImpl
	 * @see de.jena.mdo.model.dbtree.impl.DbtreePackageImpl#getDBTree()
	 * @generated
	 */
	int DB_TREE = 0;

	/**
	 * The feature id for the '<em><b>Tree Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_TREE__TREE_ID = 0;

	/**
	 * The feature id for the '<em><b>Alk Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_TREE__ALK_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_TREE__HEIGHT = 2;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_TREE__NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Diameter Tree Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_TREE__DIAMETER_TREE_TOP = 4;

	/**
	 * The feature id for the '<em><b>Diameter Tree Trunk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_TREE__DIAMETER_TREE_TRUNK = 5;

	/**
	 * The feature id for the '<em><b>Extent Tree Trunk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_TREE__EXTENT_TREE_TRUNK = 6;

	/**
	 * The feature id for the '<em><b>Last Reg Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_TREE__LAST_REG_CHECK = 7;

	/**
	 * The feature id for the '<em><b>Last Reg Check Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_TREE__LAST_REG_CHECK_TEXT = 8;

	/**
	 * The feature id for the '<em><b>Last Reg Check Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_TREE__LAST_REG_CHECK_NAME = 9;

	/**
	 * The feature id for the '<em><b>Genre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_TREE__GENRE = 10;

	/**
	 * The feature id for the '<em><b>Genre Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_TREE__GENRE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Genre Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_TREE__GENRE_DETAIL = 12;

	/**
	 * The feature id for the '<em><b>Cut Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_TREE__CUT_DATE = 13;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_TREE__GUID = 14;

	/**
	 * The feature id for the '<em><b>Gis Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_TREE__GIS_ID = 15;

	/**
	 * The feature id for the '<em><b>Plant Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_TREE__PLANT_YEAR = 16;

	/**
	 * The feature id for the '<em><b>Vitality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_TREE__VITALITY = 17;

	/**
	 * The feature id for the '<em><b>Tour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_TREE__TOUR = 18;

	/**
	 * The feature id for the '<em><b>Department</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_TREE__DEPARTMENT = 19;

	/**
	 * The feature id for the '<em><b>Utm North</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_TREE__UTM_NORTH = 20;

	/**
	 * The feature id for the '<em><b>Utm East</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_TREE__UTM_EAST = 21;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_TREE__ORIGIN = 22;

	/**
	 * The feature id for the '<em><b>Responsibility End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_TREE__RESPONSIBILITY_END = 23;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_TREE__AREA = 24;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_TREE__LOCATION = 25;

	/**
	 * The feature id for the '<em><b>Street Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_TREE__STREET_SHORT = 26;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_TREE__STREET = 27;

	/**
	 * The number of structural features of the '<em>DB Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_TREE_FEATURE_COUNT = 28;

	/**
	 * The number of operations of the '<em>DB Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_TREE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.jena.mdo.model.dbtree.DBTree <em>DB Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DB Tree</em>'.
	 * @see de.jena.mdo.model.dbtree.DBTree
	 * @generated
	 */
	EClass getDBTree();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.model.dbtree.DBTree#getTreeId <em>Tree Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tree Id</em>'.
	 * @see de.jena.mdo.model.dbtree.DBTree#getTreeId()
	 * @see #getDBTree()
	 * @generated
	 */
	EAttribute getDBTree_TreeId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.model.dbtree.DBTree#getAlkNumber <em>Alk Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alk Number</em>'.
	 * @see de.jena.mdo.model.dbtree.DBTree#getAlkNumber()
	 * @see #getDBTree()
	 * @generated
	 */
	EAttribute getDBTree_AlkNumber();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.model.dbtree.DBTree#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see de.jena.mdo.model.dbtree.DBTree#getHeight()
	 * @see #getDBTree()
	 * @generated
	 */
	EAttribute getDBTree_Height();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.model.dbtree.DBTree#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see de.jena.mdo.model.dbtree.DBTree#getNumber()
	 * @see #getDBTree()
	 * @generated
	 */
	EAttribute getDBTree_Number();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.model.dbtree.DBTree#getDiameterTreeTop <em>Diameter Tree Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diameter Tree Top</em>'.
	 * @see de.jena.mdo.model.dbtree.DBTree#getDiameterTreeTop()
	 * @see #getDBTree()
	 * @generated
	 */
	EAttribute getDBTree_DiameterTreeTop();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.model.dbtree.DBTree#getDiameterTreeTrunk <em>Diameter Tree Trunk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diameter Tree Trunk</em>'.
	 * @see de.jena.mdo.model.dbtree.DBTree#getDiameterTreeTrunk()
	 * @see #getDBTree()
	 * @generated
	 */
	EAttribute getDBTree_DiameterTreeTrunk();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.model.dbtree.DBTree#getExtentTreeTrunk <em>Extent Tree Trunk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extent Tree Trunk</em>'.
	 * @see de.jena.mdo.model.dbtree.DBTree#getExtentTreeTrunk()
	 * @see #getDBTree()
	 * @generated
	 */
	EAttribute getDBTree_ExtentTreeTrunk();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.model.dbtree.DBTree#getLastRegCheck <em>Last Reg Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Reg Check</em>'.
	 * @see de.jena.mdo.model.dbtree.DBTree#getLastRegCheck()
	 * @see #getDBTree()
	 * @generated
	 */
	EAttribute getDBTree_LastRegCheck();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.model.dbtree.DBTree#getLastRegCheckText <em>Last Reg Check Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Reg Check Text</em>'.
	 * @see de.jena.mdo.model.dbtree.DBTree#getLastRegCheckText()
	 * @see #getDBTree()
	 * @generated
	 */
	EAttribute getDBTree_LastRegCheckText();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.model.dbtree.DBTree#getLastRegCheckName <em>Last Reg Check Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Reg Check Name</em>'.
	 * @see de.jena.mdo.model.dbtree.DBTree#getLastRegCheckName()
	 * @see #getDBTree()
	 * @generated
	 */
	EAttribute getDBTree_LastRegCheckName();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.model.dbtree.DBTree#getGenre <em>Genre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Genre</em>'.
	 * @see de.jena.mdo.model.dbtree.DBTree#getGenre()
	 * @see #getDBTree()
	 * @generated
	 */
	EAttribute getDBTree_Genre();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.model.dbtree.DBTree#getGenreType <em>Genre Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Genre Type</em>'.
	 * @see de.jena.mdo.model.dbtree.DBTree#getGenreType()
	 * @see #getDBTree()
	 * @generated
	 */
	EAttribute getDBTree_GenreType();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.model.dbtree.DBTree#getGenreDetail <em>Genre Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Genre Detail</em>'.
	 * @see de.jena.mdo.model.dbtree.DBTree#getGenreDetail()
	 * @see #getDBTree()
	 * @generated
	 */
	EAttribute getDBTree_GenreDetail();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.model.dbtree.DBTree#getCutDate <em>Cut Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cut Date</em>'.
	 * @see de.jena.mdo.model.dbtree.DBTree#getCutDate()
	 * @see #getDBTree()
	 * @generated
	 */
	EAttribute getDBTree_CutDate();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.model.dbtree.DBTree#getGuid <em>Guid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guid</em>'.
	 * @see de.jena.mdo.model.dbtree.DBTree#getGuid()
	 * @see #getDBTree()
	 * @generated
	 */
	EAttribute getDBTree_Guid();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.model.dbtree.DBTree#getGisId <em>Gis Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gis Id</em>'.
	 * @see de.jena.mdo.model.dbtree.DBTree#getGisId()
	 * @see #getDBTree()
	 * @generated
	 */
	EAttribute getDBTree_GisId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.model.dbtree.DBTree#getPlantYear <em>Plant Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plant Year</em>'.
	 * @see de.jena.mdo.model.dbtree.DBTree#getPlantYear()
	 * @see #getDBTree()
	 * @generated
	 */
	EAttribute getDBTree_PlantYear();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.model.dbtree.DBTree#getVitality <em>Vitality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vitality</em>'.
	 * @see de.jena.mdo.model.dbtree.DBTree#getVitality()
	 * @see #getDBTree()
	 * @generated
	 */
	EAttribute getDBTree_Vitality();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.model.dbtree.DBTree#getTour <em>Tour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tour</em>'.
	 * @see de.jena.mdo.model.dbtree.DBTree#getTour()
	 * @see #getDBTree()
	 * @generated
	 */
	EAttribute getDBTree_Tour();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.model.dbtree.DBTree#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Department</em>'.
	 * @see de.jena.mdo.model.dbtree.DBTree#getDepartment()
	 * @see #getDBTree()
	 * @generated
	 */
	EAttribute getDBTree_Department();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.model.dbtree.DBTree#getUtmNorth <em>Utm North</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Utm North</em>'.
	 * @see de.jena.mdo.model.dbtree.DBTree#getUtmNorth()
	 * @see #getDBTree()
	 * @generated
	 */
	EAttribute getDBTree_UtmNorth();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.model.dbtree.DBTree#getUtmEast <em>Utm East</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Utm East</em>'.
	 * @see de.jena.mdo.model.dbtree.DBTree#getUtmEast()
	 * @see #getDBTree()
	 * @generated
	 */
	EAttribute getDBTree_UtmEast();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.model.dbtree.DBTree#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin</em>'.
	 * @see de.jena.mdo.model.dbtree.DBTree#getOrigin()
	 * @see #getDBTree()
	 * @generated
	 */
	EAttribute getDBTree_Origin();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.model.dbtree.DBTree#getResponsibilityEnd <em>Responsibility End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Responsibility End</em>'.
	 * @see de.jena.mdo.model.dbtree.DBTree#getResponsibilityEnd()
	 * @see #getDBTree()
	 * @generated
	 */
	EAttribute getDBTree_ResponsibilityEnd();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.model.dbtree.DBTree#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Area</em>'.
	 * @see de.jena.mdo.model.dbtree.DBTree#getArea()
	 * @see #getDBTree()
	 * @generated
	 */
	EAttribute getDBTree_Area();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.model.dbtree.DBTree#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see de.jena.mdo.model.dbtree.DBTree#getLocation()
	 * @see #getDBTree()
	 * @generated
	 */
	EAttribute getDBTree_Location();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.model.dbtree.DBTree#getStreetShort <em>Street Short</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street Short</em>'.
	 * @see de.jena.mdo.model.dbtree.DBTree#getStreetShort()
	 * @see #getDBTree()
	 * @generated
	 */
	EAttribute getDBTree_StreetShort();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.model.dbtree.DBTree#getStreet <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street</em>'.
	 * @see de.jena.mdo.model.dbtree.DBTree#getStreet()
	 * @see #getDBTree()
	 * @generated
	 */
	EAttribute getDBTree_Street();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DbtreeFactory getDbtreeFactory();

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
		 * The meta object literal for the '{@link de.jena.mdo.model.dbtree.impl.DBTreeImpl <em>DB Tree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.model.dbtree.impl.DBTreeImpl
		 * @see de.jena.mdo.model.dbtree.impl.DbtreePackageImpl#getDBTree()
		 * @generated
		 */
		EClass DB_TREE = eINSTANCE.getDBTree();

		/**
		 * The meta object literal for the '<em><b>Tree Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_TREE__TREE_ID = eINSTANCE.getDBTree_TreeId();

		/**
		 * The meta object literal for the '<em><b>Alk Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_TREE__ALK_NUMBER = eINSTANCE.getDBTree_AlkNumber();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_TREE__HEIGHT = eINSTANCE.getDBTree_Height();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_TREE__NUMBER = eINSTANCE.getDBTree_Number();

		/**
		 * The meta object literal for the '<em><b>Diameter Tree Top</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_TREE__DIAMETER_TREE_TOP = eINSTANCE.getDBTree_DiameterTreeTop();

		/**
		 * The meta object literal for the '<em><b>Diameter Tree Trunk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_TREE__DIAMETER_TREE_TRUNK = eINSTANCE.getDBTree_DiameterTreeTrunk();

		/**
		 * The meta object literal for the '<em><b>Extent Tree Trunk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_TREE__EXTENT_TREE_TRUNK = eINSTANCE.getDBTree_ExtentTreeTrunk();

		/**
		 * The meta object literal for the '<em><b>Last Reg Check</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_TREE__LAST_REG_CHECK = eINSTANCE.getDBTree_LastRegCheck();

		/**
		 * The meta object literal for the '<em><b>Last Reg Check Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_TREE__LAST_REG_CHECK_TEXT = eINSTANCE.getDBTree_LastRegCheckText();

		/**
		 * The meta object literal for the '<em><b>Last Reg Check Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_TREE__LAST_REG_CHECK_NAME = eINSTANCE.getDBTree_LastRegCheckName();

		/**
		 * The meta object literal for the '<em><b>Genre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_TREE__GENRE = eINSTANCE.getDBTree_Genre();

		/**
		 * The meta object literal for the '<em><b>Genre Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_TREE__GENRE_TYPE = eINSTANCE.getDBTree_GenreType();

		/**
		 * The meta object literal for the '<em><b>Genre Detail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_TREE__GENRE_DETAIL = eINSTANCE.getDBTree_GenreDetail();

		/**
		 * The meta object literal for the '<em><b>Cut Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_TREE__CUT_DATE = eINSTANCE.getDBTree_CutDate();

		/**
		 * The meta object literal for the '<em><b>Guid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_TREE__GUID = eINSTANCE.getDBTree_Guid();

		/**
		 * The meta object literal for the '<em><b>Gis Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_TREE__GIS_ID = eINSTANCE.getDBTree_GisId();

		/**
		 * The meta object literal for the '<em><b>Plant Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_TREE__PLANT_YEAR = eINSTANCE.getDBTree_PlantYear();

		/**
		 * The meta object literal for the '<em><b>Vitality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_TREE__VITALITY = eINSTANCE.getDBTree_Vitality();

		/**
		 * The meta object literal for the '<em><b>Tour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_TREE__TOUR = eINSTANCE.getDBTree_Tour();

		/**
		 * The meta object literal for the '<em><b>Department</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_TREE__DEPARTMENT = eINSTANCE.getDBTree_Department();

		/**
		 * The meta object literal for the '<em><b>Utm North</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_TREE__UTM_NORTH = eINSTANCE.getDBTree_UtmNorth();

		/**
		 * The meta object literal for the '<em><b>Utm East</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_TREE__UTM_EAST = eINSTANCE.getDBTree_UtmEast();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_TREE__ORIGIN = eINSTANCE.getDBTree_Origin();

		/**
		 * The meta object literal for the '<em><b>Responsibility End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_TREE__RESPONSIBILITY_END = eINSTANCE.getDBTree_ResponsibilityEnd();

		/**
		 * The meta object literal for the '<em><b>Area</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_TREE__AREA = eINSTANCE.getDBTree_Area();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_TREE__LOCATION = eINSTANCE.getDBTree_Location();

		/**
		 * The meta object literal for the '<em><b>Street Short</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_TREE__STREET_SHORT = eINSTANCE.getDBTree_StreetShort();

		/**
		 * The meta object literal for the '<em><b>Street</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_TREE__STREET = eINSTANCE.getDBTree_Street();

	}

} //DbtreePackage
