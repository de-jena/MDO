/*
 */
package de.jena.mdo.ibis.ibis_gnsslocationservice;

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
 * @see de.jena.mdo.ibis.ibis_gnsslocationservice.IbisGNSSLocationServiceFactory
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
	String eNAME = "ibis_gnsslocationservice";

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
	String eNS_PREFIX = "ibis_gnsslocationservice";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IbisGNSSLocationServicePackage eINSTANCE = de.jena.mdo.ibis.ibis_gnsslocationservice.impl.IbisGNSSLocationServicePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_gnsslocationservice.impl.GNSSLocationDataImpl <em>GNSS Location Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_gnsslocationservice.impl.GNSSLocationDataImpl
	 * @see de.jena.mdo.ibis.ibis_gnsslocationservice.impl.IbisGNSSLocationServicePackageImpl#getGNSSLocationData()
	 * @generated
	 */
	int GNSS_LOCATION_DATA = 0;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_LOCATION_DATA__LATITUDE = 0;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_LOCATION_DATA__LONGITUDE = 1;

	/**
	 * The feature id for the '<em><b>Altitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_LOCATION_DATA__ALTITUDE = 2;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_LOCATION_DATA__TIME = 3;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_LOCATION_DATA__DATE = 4;

	/**
	 * The feature id for the '<em><b>Speed Over Ground</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_LOCATION_DATA__SPEED_OVER_GROUND = 5;

	/**
	 * The feature id for the '<em><b>Signal Quality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_LOCATION_DATA__SIGNAL_QUALITY = 6;

	/**
	 * The feature id for the '<em><b>Number Of Satellites</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_LOCATION_DATA__NUMBER_OF_SATELLITES = 7;

	/**
	 * The feature id for the '<em><b>Horiziontal Dilution Of Precision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_LOCATION_DATA__HORIZIONTAL_DILUTION_OF_PRECISION = 8;

	/**
	 * The feature id for the '<em><b>Vertical Dilution Of Precision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_LOCATION_DATA__VERTICAL_DILUTION_OF_PRECISION = 9;

	/**
	 * The feature id for the '<em><b>Track Degree True</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_LOCATION_DATA__TRACK_DEGREE_TRUE = 10;

	/**
	 * The feature id for the '<em><b>Track Degree Magnetic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_LOCATION_DATA__TRACK_DEGREE_MAGNETIC = 11;

	/**
	 * The feature id for the '<em><b>GNSS Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_LOCATION_DATA__GNSS_TYPE = 12;

	/**
	 * The feature id for the '<em><b>GNSS Coordinate System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_LOCATION_DATA__GNSS_COORDINATE_SYSTEM = 13;

	/**
	 * The number of structural features of the '<em>GNSS Location Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_LOCATION_DATA_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>GNSS Location Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_LOCATION_DATA_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_gnsslocationservice.GNSSLocationData <em>GNSS Location Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GNSS Location Data</em>'.
	 * @see de.jena.mdo.ibis.ibis_gnsslocationservice.GNSSLocationData
	 * @generated
	 */
	EClass getGNSSLocationData();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_gnsslocationservice.GNSSLocationData#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Latitude</em>'.
	 * @see de.jena.mdo.ibis.ibis_gnsslocationservice.GNSSLocationData#getLatitude()
	 * @see #getGNSSLocationData()
	 * @generated
	 */
	EReference getGNSSLocationData_Latitude();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_gnsslocationservice.GNSSLocationData#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Longitude</em>'.
	 * @see de.jena.mdo.ibis.ibis_gnsslocationservice.GNSSLocationData#getLongitude()
	 * @see #getGNSSLocationData()
	 * @generated
	 */
	EReference getGNSSLocationData_Longitude();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_gnsslocationservice.GNSSLocationData#getAltitude <em>Altitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Altitude</em>'.
	 * @see de.jena.mdo.ibis.ibis_gnsslocationservice.GNSSLocationData#getAltitude()
	 * @see #getGNSSLocationData()
	 * @generated
	 */
	EReference getGNSSLocationData_Altitude();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_gnsslocationservice.GNSSLocationData#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time</em>'.
	 * @see de.jena.mdo.ibis.ibis_gnsslocationservice.GNSSLocationData#getTime()
	 * @see #getGNSSLocationData()
	 * @generated
	 */
	EReference getGNSSLocationData_Time();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_gnsslocationservice.GNSSLocationData#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date</em>'.
	 * @see de.jena.mdo.ibis.ibis_gnsslocationservice.GNSSLocationData#getDate()
	 * @see #getGNSSLocationData()
	 * @generated
	 */
	EReference getGNSSLocationData_Date();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_gnsslocationservice.GNSSLocationData#getSpeedOverGround <em>Speed Over Ground</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Speed Over Ground</em>'.
	 * @see de.jena.mdo.ibis.ibis_gnsslocationservice.GNSSLocationData#getSpeedOverGround()
	 * @see #getGNSSLocationData()
	 * @generated
	 */
	EReference getGNSSLocationData_SpeedOverGround();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_gnsslocationservice.GNSSLocationData#getSignalQuality <em>Signal Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signal Quality</em>'.
	 * @see de.jena.mdo.ibis.ibis_gnsslocationservice.GNSSLocationData#getSignalQuality()
	 * @see #getGNSSLocationData()
	 * @generated
	 */
	EAttribute getGNSSLocationData_SignalQuality();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_gnsslocationservice.GNSSLocationData#getNumberOfSatellites <em>Number Of Satellites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Number Of Satellites</em>'.
	 * @see de.jena.mdo.ibis.ibis_gnsslocationservice.GNSSLocationData#getNumberOfSatellites()
	 * @see #getGNSSLocationData()
	 * @generated
	 */
	EReference getGNSSLocationData_NumberOfSatellites();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_gnsslocationservice.GNSSLocationData#getHoriziontalDilutionOfPrecision <em>Horiziontal Dilution Of Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Horiziontal Dilution Of Precision</em>'.
	 * @see de.jena.mdo.ibis.ibis_gnsslocationservice.GNSSLocationData#getHoriziontalDilutionOfPrecision()
	 * @see #getGNSSLocationData()
	 * @generated
	 */
	EReference getGNSSLocationData_HoriziontalDilutionOfPrecision();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_gnsslocationservice.GNSSLocationData#getVerticalDilutionOfPrecision <em>Vertical Dilution Of Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vertical Dilution Of Precision</em>'.
	 * @see de.jena.mdo.ibis.ibis_gnsslocationservice.GNSSLocationData#getVerticalDilutionOfPrecision()
	 * @see #getGNSSLocationData()
	 * @generated
	 */
	EReference getGNSSLocationData_VerticalDilutionOfPrecision();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_gnsslocationservice.GNSSLocationData#getTrackDegreeTrue <em>Track Degree True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Track Degree True</em>'.
	 * @see de.jena.mdo.ibis.ibis_gnsslocationservice.GNSSLocationData#getTrackDegreeTrue()
	 * @see #getGNSSLocationData()
	 * @generated
	 */
	EReference getGNSSLocationData_TrackDegreeTrue();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_gnsslocationservice.GNSSLocationData#getTrackDegreeMagnetic <em>Track Degree Magnetic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Track Degree Magnetic</em>'.
	 * @see de.jena.mdo.ibis.ibis_gnsslocationservice.GNSSLocationData#getTrackDegreeMagnetic()
	 * @see #getGNSSLocationData()
	 * @generated
	 */
	EReference getGNSSLocationData_TrackDegreeMagnetic();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_gnsslocationservice.GNSSLocationData#getGNSSType <em>GNSS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>GNSS Type</em>'.
	 * @see de.jena.mdo.ibis.ibis_gnsslocationservice.GNSSLocationData#getGNSSType()
	 * @see #getGNSSLocationData()
	 * @generated
	 */
	EAttribute getGNSSLocationData_GNSSType();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_gnsslocationservice.GNSSLocationData#getGNSSCoordinateSystem <em>GNSS Coordinate System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>GNSS Coordinate System</em>'.
	 * @see de.jena.mdo.ibis.ibis_gnsslocationservice.GNSSLocationData#getGNSSCoordinateSystem()
	 * @see #getGNSSLocationData()
	 * @generated
	 */
	EAttribute getGNSSLocationData_GNSSCoordinateSystem();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IbisGNSSLocationServiceFactory getIbisGNSSLocationServiceFactory();

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
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_gnsslocationservice.impl.GNSSLocationDataImpl <em>GNSS Location Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_gnsslocationservice.impl.GNSSLocationDataImpl
		 * @see de.jena.mdo.ibis.ibis_gnsslocationservice.impl.IbisGNSSLocationServicePackageImpl#getGNSSLocationData()
		 * @generated
		 */
		EClass GNSS_LOCATION_DATA = eINSTANCE.getGNSSLocationData();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GNSS_LOCATION_DATA__LATITUDE = eINSTANCE.getGNSSLocationData_Latitude();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GNSS_LOCATION_DATA__LONGITUDE = eINSTANCE.getGNSSLocationData_Longitude();

		/**
		 * The meta object literal for the '<em><b>Altitude</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GNSS_LOCATION_DATA__ALTITUDE = eINSTANCE.getGNSSLocationData_Altitude();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GNSS_LOCATION_DATA__TIME = eINSTANCE.getGNSSLocationData_Time();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GNSS_LOCATION_DATA__DATE = eINSTANCE.getGNSSLocationData_Date();

		/**
		 * The meta object literal for the '<em><b>Speed Over Ground</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GNSS_LOCATION_DATA__SPEED_OVER_GROUND = eINSTANCE.getGNSSLocationData_SpeedOverGround();

		/**
		 * The meta object literal for the '<em><b>Signal Quality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GNSS_LOCATION_DATA__SIGNAL_QUALITY = eINSTANCE.getGNSSLocationData_SignalQuality();

		/**
		 * The meta object literal for the '<em><b>Number Of Satellites</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GNSS_LOCATION_DATA__NUMBER_OF_SATELLITES = eINSTANCE.getGNSSLocationData_NumberOfSatellites();

		/**
		 * The meta object literal for the '<em><b>Horiziontal Dilution Of Precision</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GNSS_LOCATION_DATA__HORIZIONTAL_DILUTION_OF_PRECISION = eINSTANCE.getGNSSLocationData_HoriziontalDilutionOfPrecision();

		/**
		 * The meta object literal for the '<em><b>Vertical Dilution Of Precision</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GNSS_LOCATION_DATA__VERTICAL_DILUTION_OF_PRECISION = eINSTANCE.getGNSSLocationData_VerticalDilutionOfPrecision();

		/**
		 * The meta object literal for the '<em><b>Track Degree True</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GNSS_LOCATION_DATA__TRACK_DEGREE_TRUE = eINSTANCE.getGNSSLocationData_TrackDegreeTrue();

		/**
		 * The meta object literal for the '<em><b>Track Degree Magnetic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GNSS_LOCATION_DATA__TRACK_DEGREE_MAGNETIC = eINSTANCE.getGNSSLocationData_TrackDegreeMagnetic();

		/**
		 * The meta object literal for the '<em><b>GNSS Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GNSS_LOCATION_DATA__GNSS_TYPE = eINSTANCE.getGNSSLocationData_GNSSType();

		/**
		 * The meta object literal for the '<em><b>GNSS Coordinate System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GNSS_LOCATION_DATA__GNSS_COORDINATE_SYSTEM = eINSTANCE.getGNSSLocationData_GNSSCoordinateSystem();

	}

} //IbisGNSSLocationServicePackage
