/*
 */
package de.jena.mdo.ibis.gnsslocationservice;

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
 * @see de.jena.mdo.ibis.gnsslocationservice.IbisGNSSLocationServiceFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
public interface IbisGNSSLocationServicePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gnsslocationservice";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://jena.de/mdo/ibis-gnsslocationservice/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gnsslocationservice";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IbisGNSSLocationServicePackage eINSTANCE = de.jena.mdo.ibis.gnsslocationservice.impl.IbisGNSSLocationServicePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.gnsslocationservice.impl.GNSSLocationServiceDataStructureImpl <em>GNSS Location Service Data Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.gnsslocationservice.impl.GNSSLocationServiceDataStructureImpl
	 * @see de.jena.mdo.ibis.gnsslocationservice.impl.IbisGNSSLocationServicePackageImpl#getGNSSLocationServiceDataStructure()
	 * @generated
	 */
	int GNSS_LOCATION_SERVICE_DATA_STRUCTURE = 0;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_LOCATION_SERVICE_DATA_STRUCTURE__LATITUDE = 0;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_LOCATION_SERVICE_DATA_STRUCTURE__LONGITUDE = 1;

	/**
	 * The feature id for the '<em><b>Altitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_LOCATION_SERVICE_DATA_STRUCTURE__ALTITUDE = 2;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_LOCATION_SERVICE_DATA_STRUCTURE__TIME = 3;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_LOCATION_SERVICE_DATA_STRUCTURE__DATE = 4;

	/**
	 * The feature id for the '<em><b>Speed Over Ground</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_LOCATION_SERVICE_DATA_STRUCTURE__SPEED_OVER_GROUND = 5;

	/**
	 * The feature id for the '<em><b>Signal Quality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_LOCATION_SERVICE_DATA_STRUCTURE__SIGNAL_QUALITY = 6;

	/**
	 * The feature id for the '<em><b>Number Of Satellites</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_LOCATION_SERVICE_DATA_STRUCTURE__NUMBER_OF_SATELLITES = 7;

	/**
	 * The feature id for the '<em><b>Horiziontal Dilution Of Precision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_LOCATION_SERVICE_DATA_STRUCTURE__HORIZIONTAL_DILUTION_OF_PRECISION = 8;

	/**
	 * The feature id for the '<em><b>Vertical Dilution Of Precision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_LOCATION_SERVICE_DATA_STRUCTURE__VERTICAL_DILUTION_OF_PRECISION = 9;

	/**
	 * The feature id for the '<em><b>Track Degree True</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_LOCATION_SERVICE_DATA_STRUCTURE__TRACK_DEGREE_TRUE = 10;

	/**
	 * The feature id for the '<em><b>Track Degree Magnetic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_LOCATION_SERVICE_DATA_STRUCTURE__TRACK_DEGREE_MAGNETIC = 11;

	/**
	 * The feature id for the '<em><b>GNSS Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_LOCATION_SERVICE_DATA_STRUCTURE__GNSS_TYPE = 12;

	/**
	 * The feature id for the '<em><b>GNSS Coordinate System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_LOCATION_SERVICE_DATA_STRUCTURE__GNSS_COORDINATE_SYSTEM = 13;

	/**
	 * The number of structural features of the '<em>GNSS Location Service Data Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_LOCATION_SERVICE_DATA_STRUCTURE_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>GNSS Location Service Data Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_LOCATION_SERVICE_DATA_STRUCTURE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure <em>GNSS Location Service Data Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GNSS Location Service Data Structure</em>'.
	 * @see de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure
	 * @generated
	 */
	EClass getGNSSLocationServiceDataStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Latitude</em>'.
	 * @see de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getLatitude()
	 * @see #getGNSSLocationServiceDataStructure()
	 * @generated
	 */
	EReference getGNSSLocationServiceDataStructure_Latitude();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Longitude</em>'.
	 * @see de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getLongitude()
	 * @see #getGNSSLocationServiceDataStructure()
	 * @generated
	 */
	EReference getGNSSLocationServiceDataStructure_Longitude();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getAltitude <em>Altitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Altitude</em>'.
	 * @see de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getAltitude()
	 * @see #getGNSSLocationServiceDataStructure()
	 * @generated
	 */
	EReference getGNSSLocationServiceDataStructure_Altitude();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time</em>'.
	 * @see de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getTime()
	 * @see #getGNSSLocationServiceDataStructure()
	 * @generated
	 */
	EReference getGNSSLocationServiceDataStructure_Time();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date</em>'.
	 * @see de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getDate()
	 * @see #getGNSSLocationServiceDataStructure()
	 * @generated
	 */
	EReference getGNSSLocationServiceDataStructure_Date();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getSpeedOverGround <em>Speed Over Ground</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Speed Over Ground</em>'.
	 * @see de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getSpeedOverGround()
	 * @see #getGNSSLocationServiceDataStructure()
	 * @generated
	 */
	EReference getGNSSLocationServiceDataStructure_SpeedOverGround();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getSignalQuality <em>Signal Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signal Quality</em>'.
	 * @see de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getSignalQuality()
	 * @see #getGNSSLocationServiceDataStructure()
	 * @generated
	 */
	EAttribute getGNSSLocationServiceDataStructure_SignalQuality();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getNumberOfSatellites <em>Number Of Satellites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Number Of Satellites</em>'.
	 * @see de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getNumberOfSatellites()
	 * @see #getGNSSLocationServiceDataStructure()
	 * @generated
	 */
	EReference getGNSSLocationServiceDataStructure_NumberOfSatellites();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getHoriziontalDilutionOfPrecision <em>Horiziontal Dilution Of Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Horiziontal Dilution Of Precision</em>'.
	 * @see de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getHoriziontalDilutionOfPrecision()
	 * @see #getGNSSLocationServiceDataStructure()
	 * @generated
	 */
	EReference getGNSSLocationServiceDataStructure_HoriziontalDilutionOfPrecision();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getVerticalDilutionOfPrecision <em>Vertical Dilution Of Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vertical Dilution Of Precision</em>'.
	 * @see de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getVerticalDilutionOfPrecision()
	 * @see #getGNSSLocationServiceDataStructure()
	 * @generated
	 */
	EReference getGNSSLocationServiceDataStructure_VerticalDilutionOfPrecision();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getTrackDegreeTrue <em>Track Degree True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Track Degree True</em>'.
	 * @see de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getTrackDegreeTrue()
	 * @see #getGNSSLocationServiceDataStructure()
	 * @generated
	 */
	EReference getGNSSLocationServiceDataStructure_TrackDegreeTrue();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getTrackDegreeMagnetic <em>Track Degree Magnetic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Track Degree Magnetic</em>'.
	 * @see de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getTrackDegreeMagnetic()
	 * @see #getGNSSLocationServiceDataStructure()
	 * @generated
	 */
	EReference getGNSSLocationServiceDataStructure_TrackDegreeMagnetic();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getGNSSType <em>GNSS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>GNSS Type</em>'.
	 * @see de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getGNSSType()
	 * @see #getGNSSLocationServiceDataStructure()
	 * @generated
	 */
	EAttribute getGNSSLocationServiceDataStructure_GNSSType();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getGNSSCoordinateSystem <em>GNSS Coordinate System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>GNSS Coordinate System</em>'.
	 * @see de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getGNSSCoordinateSystem()
	 * @see #getGNSSLocationServiceDataStructure()
	 * @generated
	 */
	EAttribute getGNSSLocationServiceDataStructure_GNSSCoordinateSystem();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IbisGNSSLocationServiceFactory getIbisGNSSLocationServiceFactory();

} //IbisGNSSLocationServicePackage
