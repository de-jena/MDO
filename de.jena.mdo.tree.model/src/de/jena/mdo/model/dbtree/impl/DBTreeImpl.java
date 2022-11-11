/**
 */
package de.jena.mdo.model.dbtree.impl;

import de.jena.mdo.model.dbtree.DBTree;
import de.jena.mdo.model.dbtree.DbtreePackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DB Tree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.model.dbtree.impl.DBTreeImpl#getTreeId <em>Tree Id</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.impl.DBTreeImpl#getAlkNumber <em>Alk Number</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.impl.DBTreeImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.impl.DBTreeImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.impl.DBTreeImpl#getDiameterTreeTop <em>Diameter Tree Top</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.impl.DBTreeImpl#getDiameterTreeTrunk <em>Diameter Tree Trunk</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.impl.DBTreeImpl#getExtentTreeTrunk <em>Extent Tree Trunk</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.impl.DBTreeImpl#getLastRegCheck <em>Last Reg Check</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.impl.DBTreeImpl#getLastRegCheckText <em>Last Reg Check Text</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.impl.DBTreeImpl#getLastRegCheckName <em>Last Reg Check Name</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.impl.DBTreeImpl#getGenre <em>Genre</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.impl.DBTreeImpl#getGenreType <em>Genre Type</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.impl.DBTreeImpl#getGenreDetail <em>Genre Detail</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.impl.DBTreeImpl#getCutDate <em>Cut Date</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.impl.DBTreeImpl#getGuid <em>Guid</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.impl.DBTreeImpl#getGisId <em>Gis Id</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.impl.DBTreeImpl#getPlantYear <em>Plant Year</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.impl.DBTreeImpl#getVitality <em>Vitality</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.impl.DBTreeImpl#getTour <em>Tour</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.impl.DBTreeImpl#getDepartment <em>Department</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.impl.DBTreeImpl#getUtmNorth <em>Utm North</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.impl.DBTreeImpl#getUtmEast <em>Utm East</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.impl.DBTreeImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.impl.DBTreeImpl#getResponsibilityEnd <em>Responsibility End</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.impl.DBTreeImpl#getArea <em>Area</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.impl.DBTreeImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.impl.DBTreeImpl#getStreetShort <em>Street Short</em>}</li>
 *   <li>{@link de.jena.mdo.model.dbtree.impl.DBTreeImpl#getStreet <em>Street</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DBTreeImpl extends MinimalEObjectImpl.Container implements DBTree {
	/**
	 * The default value of the '{@link #getTreeId() <em>Tree Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreeId()
	 * @generated
	 * @ordered
	 */
	protected static final long TREE_ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTreeId() <em>Tree Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreeId()
	 * @generated
	 * @ordered
	 */
	protected long treeId = TREE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlkNumber() <em>Alk Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlkNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String ALK_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlkNumber() <em>Alk Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlkNumber()
	 * @generated
	 * @ordered
	 */
	protected String alkNumber = ALK_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final String HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected String height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected String number = NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiameterTreeTop() <em>Diameter Tree Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiameterTreeTop()
	 * @generated
	 * @ordered
	 */
	protected static final double DIAMETER_TREE_TOP_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDiameterTreeTop() <em>Diameter Tree Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiameterTreeTop()
	 * @generated
	 * @ordered
	 */
	protected double diameterTreeTop = DIAMETER_TREE_TOP_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiameterTreeTrunk() <em>Diameter Tree Trunk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiameterTreeTrunk()
	 * @generated
	 * @ordered
	 */
	protected static final double DIAMETER_TREE_TRUNK_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDiameterTreeTrunk() <em>Diameter Tree Trunk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiameterTreeTrunk()
	 * @generated
	 * @ordered
	 */
	protected double diameterTreeTrunk = DIAMETER_TREE_TRUNK_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtentTreeTrunk() <em>Extent Tree Trunk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtentTreeTrunk()
	 * @generated
	 * @ordered
	 */
	protected static final double EXTENT_TREE_TRUNK_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getExtentTreeTrunk() <em>Extent Tree Trunk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtentTreeTrunk()
	 * @generated
	 * @ordered
	 */
	protected double extentTreeTrunk = EXTENT_TREE_TRUNK_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastRegCheck() <em>Last Reg Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastRegCheck()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_REG_CHECK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastRegCheck() <em>Last Reg Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastRegCheck()
	 * @generated
	 * @ordered
	 */
	protected Date lastRegCheck = LAST_REG_CHECK_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastRegCheckText() <em>Last Reg Check Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastRegCheckText()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_REG_CHECK_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastRegCheckText() <em>Last Reg Check Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastRegCheckText()
	 * @generated
	 * @ordered
	 */
	protected String lastRegCheckText = LAST_REG_CHECK_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastRegCheckName() <em>Last Reg Check Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastRegCheckName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_REG_CHECK_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastRegCheckName() <em>Last Reg Check Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastRegCheckName()
	 * @generated
	 * @ordered
	 */
	protected String lastRegCheckName = LAST_REG_CHECK_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getGenre() <em>Genre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenre()
	 * @generated
	 * @ordered
	 */
	protected static final String GENRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGenre() <em>Genre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenre()
	 * @generated
	 * @ordered
	 */
	protected String genre = GENRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGenreType() <em>Genre Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenreType()
	 * @generated
	 * @ordered
	 */
	protected static final String GENRE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGenreType() <em>Genre Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenreType()
	 * @generated
	 * @ordered
	 */
	protected String genreType = GENRE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGenreDetail() <em>Genre Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenreDetail()
	 * @generated
	 * @ordered
	 */
	protected static final String GENRE_DETAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGenreDetail() <em>Genre Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenreDetail()
	 * @generated
	 * @ordered
	 */
	protected String genreDetail = GENRE_DETAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCutDate() <em>Cut Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CUT_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCutDate() <em>Cut Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutDate()
	 * @generated
	 * @ordered
	 */
	protected Date cutDate = CUT_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuid() <em>Guid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuid()
	 * @generated
	 * @ordered
	 */
	protected static final String GUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuid() <em>Guid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuid()
	 * @generated
	 * @ordered
	 */
	protected String guid = GUID_EDEFAULT;

	/**
	 * The default value of the '{@link #getGisId() <em>Gis Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGisId()
	 * @generated
	 * @ordered
	 */
	protected static final String GIS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGisId() <em>Gis Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGisId()
	 * @generated
	 * @ordered
	 */
	protected String gisId = GIS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlantYear() <em>Plant Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlantYear()
	 * @generated
	 * @ordered
	 */
	protected static final int PLANT_YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPlantYear() <em>Plant Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlantYear()
	 * @generated
	 * @ordered
	 */
	protected int plantYear = PLANT_YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getVitality() <em>Vitality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitality()
	 * @generated
	 * @ordered
	 */
	protected static final int VITALITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVitality() <em>Vitality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitality()
	 * @generated
	 * @ordered
	 */
	protected int vitality = VITALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTour() <em>Tour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTour()
	 * @generated
	 * @ordered
	 */
	protected static final String TOUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTour() <em>Tour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTour()
	 * @generated
	 * @ordered
	 */
	protected String tour = TOUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDepartment() <em>Department</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartment()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPARTMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDepartment() <em>Department</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartment()
	 * @generated
	 * @ordered
	 */
	protected String department = DEPARTMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUtmNorth() <em>Utm North</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtmNorth()
	 * @generated
	 * @ordered
	 */
	protected static final float UTM_NORTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getUtmNorth() <em>Utm North</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtmNorth()
	 * @generated
	 * @ordered
	 */
	protected float utmNorth = UTM_NORTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getUtmEast() <em>Utm East</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtmEast()
	 * @generated
	 * @ordered
	 */
	protected static final float UTM_EAST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getUtmEast() <em>Utm East</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtmEast()
	 * @generated
	 * @ordered
	 */
	protected float utmEast = UTM_EAST_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrigin() <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected String origin = ORIGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getResponsibilityEnd() <em>Responsibility End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibilityEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Date RESPONSIBILITY_END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponsibilityEnd() <em>Responsibility End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibilityEnd()
	 * @generated
	 * @ordered
	 */
	protected Date responsibilityEnd = RESPONSIBILITY_END_EDEFAULT;

	/**
	 * The default value of the '{@link #getArea() <em>Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArea()
	 * @generated
	 * @ordered
	 */
	protected static final String AREA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArea() <em>Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArea()
	 * @generated
	 * @ordered
	 */
	protected String area = AREA_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStreetShort() <em>Street Short</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreetShort()
	 * @generated
	 * @ordered
	 */
	protected static final String STREET_SHORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStreetShort() <em>Street Short</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreetShort()
	 * @generated
	 * @ordered
	 */
	protected String streetShort = STREET_SHORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStreet() <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreet()
	 * @generated
	 * @ordered
	 */
	protected static final String STREET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStreet() <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreet()
	 * @generated
	 * @ordered
	 */
	protected String street = STREET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DBTreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbtreePackage.Literals.DB_TREE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTreeId() {
		return treeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTreeId(long newTreeId) {
		long oldTreeId = treeId;
		treeId = newTreeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbtreePackage.DB_TREE__TREE_ID, oldTreeId, treeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAlkNumber() {
		return alkNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlkNumber(String newAlkNumber) {
		String oldAlkNumber = alkNumber;
		alkNumber = newAlkNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbtreePackage.DB_TREE__ALK_NUMBER, oldAlkNumber, alkNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeight(String newHeight) {
		String oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbtreePackage.DB_TREE__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumber(String newNumber) {
		String oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbtreePackage.DB_TREE__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDiameterTreeTop() {
		return diameterTreeTop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiameterTreeTop(double newDiameterTreeTop) {
		double oldDiameterTreeTop = diameterTreeTop;
		diameterTreeTop = newDiameterTreeTop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbtreePackage.DB_TREE__DIAMETER_TREE_TOP, oldDiameterTreeTop, diameterTreeTop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDiameterTreeTrunk() {
		return diameterTreeTrunk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiameterTreeTrunk(double newDiameterTreeTrunk) {
		double oldDiameterTreeTrunk = diameterTreeTrunk;
		diameterTreeTrunk = newDiameterTreeTrunk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbtreePackage.DB_TREE__DIAMETER_TREE_TRUNK, oldDiameterTreeTrunk, diameterTreeTrunk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getExtentTreeTrunk() {
		return extentTreeTrunk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtentTreeTrunk(double newExtentTreeTrunk) {
		double oldExtentTreeTrunk = extentTreeTrunk;
		extentTreeTrunk = newExtentTreeTrunk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbtreePackage.DB_TREE__EXTENT_TREE_TRUNK, oldExtentTreeTrunk, extentTreeTrunk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastRegCheck() {
		return lastRegCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastRegCheck(Date newLastRegCheck) {
		Date oldLastRegCheck = lastRegCheck;
		lastRegCheck = newLastRegCheck;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbtreePackage.DB_TREE__LAST_REG_CHECK, oldLastRegCheck, lastRegCheck));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastRegCheckText() {
		return lastRegCheckText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastRegCheckText(String newLastRegCheckText) {
		String oldLastRegCheckText = lastRegCheckText;
		lastRegCheckText = newLastRegCheckText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbtreePackage.DB_TREE__LAST_REG_CHECK_TEXT, oldLastRegCheckText, lastRegCheckText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastRegCheckName() {
		return lastRegCheckName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastRegCheckName(String newLastRegCheckName) {
		String oldLastRegCheckName = lastRegCheckName;
		lastRegCheckName = newLastRegCheckName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbtreePackage.DB_TREE__LAST_REG_CHECK_NAME, oldLastRegCheckName, lastRegCheckName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGenre() {
		return genre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenre(String newGenre) {
		String oldGenre = genre;
		genre = newGenre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbtreePackage.DB_TREE__GENRE, oldGenre, genre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGenreType() {
		return genreType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenreType(String newGenreType) {
		String oldGenreType = genreType;
		genreType = newGenreType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbtreePackage.DB_TREE__GENRE_TYPE, oldGenreType, genreType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGenreDetail() {
		return genreDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenreDetail(String newGenreDetail) {
		String oldGenreDetail = genreDetail;
		genreDetail = newGenreDetail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbtreePackage.DB_TREE__GENRE_DETAIL, oldGenreDetail, genreDetail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCutDate() {
		return cutDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCutDate(Date newCutDate) {
		Date oldCutDate = cutDate;
		cutDate = newCutDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbtreePackage.DB_TREE__CUT_DATE, oldCutDate, cutDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGuid() {
		return guid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGuid(String newGuid) {
		String oldGuid = guid;
		guid = newGuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbtreePackage.DB_TREE__GUID, oldGuid, guid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGisId() {
		return gisId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGisId(String newGisId) {
		String oldGisId = gisId;
		gisId = newGisId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbtreePackage.DB_TREE__GIS_ID, oldGisId, gisId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPlantYear() {
		return plantYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlantYear(int newPlantYear) {
		int oldPlantYear = plantYear;
		plantYear = newPlantYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbtreePackage.DB_TREE__PLANT_YEAR, oldPlantYear, plantYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getVitality() {
		return vitality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVitality(int newVitality) {
		int oldVitality = vitality;
		vitality = newVitality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbtreePackage.DB_TREE__VITALITY, oldVitality, vitality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTour() {
		return tour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTour(String newTour) {
		String oldTour = tour;
		tour = newTour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbtreePackage.DB_TREE__TOUR, oldTour, tour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDepartment() {
		return department;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDepartment(String newDepartment) {
		String oldDepartment = department;
		department = newDepartment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbtreePackage.DB_TREE__DEPARTMENT, oldDepartment, department));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getUtmNorth() {
		return utmNorth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUtmNorth(float newUtmNorth) {
		float oldUtmNorth = utmNorth;
		utmNorth = newUtmNorth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbtreePackage.DB_TREE__UTM_NORTH, oldUtmNorth, utmNorth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getUtmEast() {
		return utmEast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUtmEast(float newUtmEast) {
		float oldUtmEast = utmEast;
		utmEast = newUtmEast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbtreePackage.DB_TREE__UTM_EAST, oldUtmEast, utmEast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrigin(String newOrigin) {
		String oldOrigin = origin;
		origin = newOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbtreePackage.DB_TREE__ORIGIN, oldOrigin, origin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getResponsibilityEnd() {
		return responsibilityEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponsibilityEnd(Date newResponsibilityEnd) {
		Date oldResponsibilityEnd = responsibilityEnd;
		responsibilityEnd = newResponsibilityEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbtreePackage.DB_TREE__RESPONSIBILITY_END, oldResponsibilityEnd, responsibilityEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getArea() {
		return area;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArea(String newArea) {
		String oldArea = area;
		area = newArea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbtreePackage.DB_TREE__AREA, oldArea, area));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbtreePackage.DB_TREE__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStreetShort() {
		return streetShort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStreetShort(String newStreetShort) {
		String oldStreetShort = streetShort;
		streetShort = newStreetShort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbtreePackage.DB_TREE__STREET_SHORT, oldStreetShort, streetShort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStreet() {
		return street;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStreet(String newStreet) {
		String oldStreet = street;
		street = newStreet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbtreePackage.DB_TREE__STREET, oldStreet, street));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DbtreePackage.DB_TREE__TREE_ID:
				return getTreeId();
			case DbtreePackage.DB_TREE__ALK_NUMBER:
				return getAlkNumber();
			case DbtreePackage.DB_TREE__HEIGHT:
				return getHeight();
			case DbtreePackage.DB_TREE__NUMBER:
				return getNumber();
			case DbtreePackage.DB_TREE__DIAMETER_TREE_TOP:
				return getDiameterTreeTop();
			case DbtreePackage.DB_TREE__DIAMETER_TREE_TRUNK:
				return getDiameterTreeTrunk();
			case DbtreePackage.DB_TREE__EXTENT_TREE_TRUNK:
				return getExtentTreeTrunk();
			case DbtreePackage.DB_TREE__LAST_REG_CHECK:
				return getLastRegCheck();
			case DbtreePackage.DB_TREE__LAST_REG_CHECK_TEXT:
				return getLastRegCheckText();
			case DbtreePackage.DB_TREE__LAST_REG_CHECK_NAME:
				return getLastRegCheckName();
			case DbtreePackage.DB_TREE__GENRE:
				return getGenre();
			case DbtreePackage.DB_TREE__GENRE_TYPE:
				return getGenreType();
			case DbtreePackage.DB_TREE__GENRE_DETAIL:
				return getGenreDetail();
			case DbtreePackage.DB_TREE__CUT_DATE:
				return getCutDate();
			case DbtreePackage.DB_TREE__GUID:
				return getGuid();
			case DbtreePackage.DB_TREE__GIS_ID:
				return getGisId();
			case DbtreePackage.DB_TREE__PLANT_YEAR:
				return getPlantYear();
			case DbtreePackage.DB_TREE__VITALITY:
				return getVitality();
			case DbtreePackage.DB_TREE__TOUR:
				return getTour();
			case DbtreePackage.DB_TREE__DEPARTMENT:
				return getDepartment();
			case DbtreePackage.DB_TREE__UTM_NORTH:
				return getUtmNorth();
			case DbtreePackage.DB_TREE__UTM_EAST:
				return getUtmEast();
			case DbtreePackage.DB_TREE__ORIGIN:
				return getOrigin();
			case DbtreePackage.DB_TREE__RESPONSIBILITY_END:
				return getResponsibilityEnd();
			case DbtreePackage.DB_TREE__AREA:
				return getArea();
			case DbtreePackage.DB_TREE__LOCATION:
				return getLocation();
			case DbtreePackage.DB_TREE__STREET_SHORT:
				return getStreetShort();
			case DbtreePackage.DB_TREE__STREET:
				return getStreet();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DbtreePackage.DB_TREE__TREE_ID:
				setTreeId((Long)newValue);
				return;
			case DbtreePackage.DB_TREE__ALK_NUMBER:
				setAlkNumber((String)newValue);
				return;
			case DbtreePackage.DB_TREE__HEIGHT:
				setHeight((String)newValue);
				return;
			case DbtreePackage.DB_TREE__NUMBER:
				setNumber((String)newValue);
				return;
			case DbtreePackage.DB_TREE__DIAMETER_TREE_TOP:
				setDiameterTreeTop((Double)newValue);
				return;
			case DbtreePackage.DB_TREE__DIAMETER_TREE_TRUNK:
				setDiameterTreeTrunk((Double)newValue);
				return;
			case DbtreePackage.DB_TREE__EXTENT_TREE_TRUNK:
				setExtentTreeTrunk((Double)newValue);
				return;
			case DbtreePackage.DB_TREE__LAST_REG_CHECK:
				setLastRegCheck((Date)newValue);
				return;
			case DbtreePackage.DB_TREE__LAST_REG_CHECK_TEXT:
				setLastRegCheckText((String)newValue);
				return;
			case DbtreePackage.DB_TREE__LAST_REG_CHECK_NAME:
				setLastRegCheckName((String)newValue);
				return;
			case DbtreePackage.DB_TREE__GENRE:
				setGenre((String)newValue);
				return;
			case DbtreePackage.DB_TREE__GENRE_TYPE:
				setGenreType((String)newValue);
				return;
			case DbtreePackage.DB_TREE__GENRE_DETAIL:
				setGenreDetail((String)newValue);
				return;
			case DbtreePackage.DB_TREE__CUT_DATE:
				setCutDate((Date)newValue);
				return;
			case DbtreePackage.DB_TREE__GUID:
				setGuid((String)newValue);
				return;
			case DbtreePackage.DB_TREE__GIS_ID:
				setGisId((String)newValue);
				return;
			case DbtreePackage.DB_TREE__PLANT_YEAR:
				setPlantYear((Integer)newValue);
				return;
			case DbtreePackage.DB_TREE__VITALITY:
				setVitality((Integer)newValue);
				return;
			case DbtreePackage.DB_TREE__TOUR:
				setTour((String)newValue);
				return;
			case DbtreePackage.DB_TREE__DEPARTMENT:
				setDepartment((String)newValue);
				return;
			case DbtreePackage.DB_TREE__UTM_NORTH:
				setUtmNorth((Float)newValue);
				return;
			case DbtreePackage.DB_TREE__UTM_EAST:
				setUtmEast((Float)newValue);
				return;
			case DbtreePackage.DB_TREE__ORIGIN:
				setOrigin((String)newValue);
				return;
			case DbtreePackage.DB_TREE__RESPONSIBILITY_END:
				setResponsibilityEnd((Date)newValue);
				return;
			case DbtreePackage.DB_TREE__AREA:
				setArea((String)newValue);
				return;
			case DbtreePackage.DB_TREE__LOCATION:
				setLocation((String)newValue);
				return;
			case DbtreePackage.DB_TREE__STREET_SHORT:
				setStreetShort((String)newValue);
				return;
			case DbtreePackage.DB_TREE__STREET:
				setStreet((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DbtreePackage.DB_TREE__TREE_ID:
				setTreeId(TREE_ID_EDEFAULT);
				return;
			case DbtreePackage.DB_TREE__ALK_NUMBER:
				setAlkNumber(ALK_NUMBER_EDEFAULT);
				return;
			case DbtreePackage.DB_TREE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case DbtreePackage.DB_TREE__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case DbtreePackage.DB_TREE__DIAMETER_TREE_TOP:
				setDiameterTreeTop(DIAMETER_TREE_TOP_EDEFAULT);
				return;
			case DbtreePackage.DB_TREE__DIAMETER_TREE_TRUNK:
				setDiameterTreeTrunk(DIAMETER_TREE_TRUNK_EDEFAULT);
				return;
			case DbtreePackage.DB_TREE__EXTENT_TREE_TRUNK:
				setExtentTreeTrunk(EXTENT_TREE_TRUNK_EDEFAULT);
				return;
			case DbtreePackage.DB_TREE__LAST_REG_CHECK:
				setLastRegCheck(LAST_REG_CHECK_EDEFAULT);
				return;
			case DbtreePackage.DB_TREE__LAST_REG_CHECK_TEXT:
				setLastRegCheckText(LAST_REG_CHECK_TEXT_EDEFAULT);
				return;
			case DbtreePackage.DB_TREE__LAST_REG_CHECK_NAME:
				setLastRegCheckName(LAST_REG_CHECK_NAME_EDEFAULT);
				return;
			case DbtreePackage.DB_TREE__GENRE:
				setGenre(GENRE_EDEFAULT);
				return;
			case DbtreePackage.DB_TREE__GENRE_TYPE:
				setGenreType(GENRE_TYPE_EDEFAULT);
				return;
			case DbtreePackage.DB_TREE__GENRE_DETAIL:
				setGenreDetail(GENRE_DETAIL_EDEFAULT);
				return;
			case DbtreePackage.DB_TREE__CUT_DATE:
				setCutDate(CUT_DATE_EDEFAULT);
				return;
			case DbtreePackage.DB_TREE__GUID:
				setGuid(GUID_EDEFAULT);
				return;
			case DbtreePackage.DB_TREE__GIS_ID:
				setGisId(GIS_ID_EDEFAULT);
				return;
			case DbtreePackage.DB_TREE__PLANT_YEAR:
				setPlantYear(PLANT_YEAR_EDEFAULT);
				return;
			case DbtreePackage.DB_TREE__VITALITY:
				setVitality(VITALITY_EDEFAULT);
				return;
			case DbtreePackage.DB_TREE__TOUR:
				setTour(TOUR_EDEFAULT);
				return;
			case DbtreePackage.DB_TREE__DEPARTMENT:
				setDepartment(DEPARTMENT_EDEFAULT);
				return;
			case DbtreePackage.DB_TREE__UTM_NORTH:
				setUtmNorth(UTM_NORTH_EDEFAULT);
				return;
			case DbtreePackage.DB_TREE__UTM_EAST:
				setUtmEast(UTM_EAST_EDEFAULT);
				return;
			case DbtreePackage.DB_TREE__ORIGIN:
				setOrigin(ORIGIN_EDEFAULT);
				return;
			case DbtreePackage.DB_TREE__RESPONSIBILITY_END:
				setResponsibilityEnd(RESPONSIBILITY_END_EDEFAULT);
				return;
			case DbtreePackage.DB_TREE__AREA:
				setArea(AREA_EDEFAULT);
				return;
			case DbtreePackage.DB_TREE__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case DbtreePackage.DB_TREE__STREET_SHORT:
				setStreetShort(STREET_SHORT_EDEFAULT);
				return;
			case DbtreePackage.DB_TREE__STREET:
				setStreet(STREET_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DbtreePackage.DB_TREE__TREE_ID:
				return treeId != TREE_ID_EDEFAULT;
			case DbtreePackage.DB_TREE__ALK_NUMBER:
				return ALK_NUMBER_EDEFAULT == null ? alkNumber != null : !ALK_NUMBER_EDEFAULT.equals(alkNumber);
			case DbtreePackage.DB_TREE__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case DbtreePackage.DB_TREE__NUMBER:
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
			case DbtreePackage.DB_TREE__DIAMETER_TREE_TOP:
				return diameterTreeTop != DIAMETER_TREE_TOP_EDEFAULT;
			case DbtreePackage.DB_TREE__DIAMETER_TREE_TRUNK:
				return diameterTreeTrunk != DIAMETER_TREE_TRUNK_EDEFAULT;
			case DbtreePackage.DB_TREE__EXTENT_TREE_TRUNK:
				return extentTreeTrunk != EXTENT_TREE_TRUNK_EDEFAULT;
			case DbtreePackage.DB_TREE__LAST_REG_CHECK:
				return LAST_REG_CHECK_EDEFAULT == null ? lastRegCheck != null : !LAST_REG_CHECK_EDEFAULT.equals(lastRegCheck);
			case DbtreePackage.DB_TREE__LAST_REG_CHECK_TEXT:
				return LAST_REG_CHECK_TEXT_EDEFAULT == null ? lastRegCheckText != null : !LAST_REG_CHECK_TEXT_EDEFAULT.equals(lastRegCheckText);
			case DbtreePackage.DB_TREE__LAST_REG_CHECK_NAME:
				return LAST_REG_CHECK_NAME_EDEFAULT == null ? lastRegCheckName != null : !LAST_REG_CHECK_NAME_EDEFAULT.equals(lastRegCheckName);
			case DbtreePackage.DB_TREE__GENRE:
				return GENRE_EDEFAULT == null ? genre != null : !GENRE_EDEFAULT.equals(genre);
			case DbtreePackage.DB_TREE__GENRE_TYPE:
				return GENRE_TYPE_EDEFAULT == null ? genreType != null : !GENRE_TYPE_EDEFAULT.equals(genreType);
			case DbtreePackage.DB_TREE__GENRE_DETAIL:
				return GENRE_DETAIL_EDEFAULT == null ? genreDetail != null : !GENRE_DETAIL_EDEFAULT.equals(genreDetail);
			case DbtreePackage.DB_TREE__CUT_DATE:
				return CUT_DATE_EDEFAULT == null ? cutDate != null : !CUT_DATE_EDEFAULT.equals(cutDate);
			case DbtreePackage.DB_TREE__GUID:
				return GUID_EDEFAULT == null ? guid != null : !GUID_EDEFAULT.equals(guid);
			case DbtreePackage.DB_TREE__GIS_ID:
				return GIS_ID_EDEFAULT == null ? gisId != null : !GIS_ID_EDEFAULT.equals(gisId);
			case DbtreePackage.DB_TREE__PLANT_YEAR:
				return plantYear != PLANT_YEAR_EDEFAULT;
			case DbtreePackage.DB_TREE__VITALITY:
				return vitality != VITALITY_EDEFAULT;
			case DbtreePackage.DB_TREE__TOUR:
				return TOUR_EDEFAULT == null ? tour != null : !TOUR_EDEFAULT.equals(tour);
			case DbtreePackage.DB_TREE__DEPARTMENT:
				return DEPARTMENT_EDEFAULT == null ? department != null : !DEPARTMENT_EDEFAULT.equals(department);
			case DbtreePackage.DB_TREE__UTM_NORTH:
				return utmNorth != UTM_NORTH_EDEFAULT;
			case DbtreePackage.DB_TREE__UTM_EAST:
				return utmEast != UTM_EAST_EDEFAULT;
			case DbtreePackage.DB_TREE__ORIGIN:
				return ORIGIN_EDEFAULT == null ? origin != null : !ORIGIN_EDEFAULT.equals(origin);
			case DbtreePackage.DB_TREE__RESPONSIBILITY_END:
				return RESPONSIBILITY_END_EDEFAULT == null ? responsibilityEnd != null : !RESPONSIBILITY_END_EDEFAULT.equals(responsibilityEnd);
			case DbtreePackage.DB_TREE__AREA:
				return AREA_EDEFAULT == null ? area != null : !AREA_EDEFAULT.equals(area);
			case DbtreePackage.DB_TREE__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case DbtreePackage.DB_TREE__STREET_SHORT:
				return STREET_SHORT_EDEFAULT == null ? streetShort != null : !STREET_SHORT_EDEFAULT.equals(streetShort);
			case DbtreePackage.DB_TREE__STREET:
				return STREET_EDEFAULT == null ? street != null : !STREET_EDEFAULT.equals(street);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (treeId: ");
		result.append(treeId);
		result.append(", alkNumber: ");
		result.append(alkNumber);
		result.append(", height: ");
		result.append(height);
		result.append(", number: ");
		result.append(number);
		result.append(", diameterTreeTop: ");
		result.append(diameterTreeTop);
		result.append(", diameterTreeTrunk: ");
		result.append(diameterTreeTrunk);
		result.append(", extentTreeTrunk: ");
		result.append(extentTreeTrunk);
		result.append(", lastRegCheck: ");
		result.append(lastRegCheck);
		result.append(", lastRegCheckText: ");
		result.append(lastRegCheckText);
		result.append(", lastRegCheckName: ");
		result.append(lastRegCheckName);
		result.append(", genre: ");
		result.append(genre);
		result.append(", genreType: ");
		result.append(genreType);
		result.append(", genreDetail: ");
		result.append(genreDetail);
		result.append(", cutDate: ");
		result.append(cutDate);
		result.append(", guid: ");
		result.append(guid);
		result.append(", gisId: ");
		result.append(gisId);
		result.append(", plantYear: ");
		result.append(plantYear);
		result.append(", vitality: ");
		result.append(vitality);
		result.append(", tour: ");
		result.append(tour);
		result.append(", department: ");
		result.append(department);
		result.append(", utmNorth: ");
		result.append(utmNorth);
		result.append(", utmEast: ");
		result.append(utmEast);
		result.append(", origin: ");
		result.append(origin);
		result.append(", responsibilityEnd: ");
		result.append(responsibilityEnd);
		result.append(", area: ");
		result.append(area);
		result.append(", location: ");
		result.append(location);
		result.append(", streetShort: ");
		result.append(streetShort);
		result.append(", street: ");
		result.append(street);
		result.append(')');
		return result.toString();
	}

} //DBTreeImpl
