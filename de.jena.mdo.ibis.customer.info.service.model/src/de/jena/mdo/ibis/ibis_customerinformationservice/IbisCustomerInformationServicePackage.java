/*
 */
package de.jena.mdo.ibis.ibis_customerinformationservice;

import de.jena.mdo.ibis.ibis_common.IbisCommonPackage;

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
 * @see de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServiceFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
@ProviderType
public interface IbisCustomerInformationServicePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ibis_customerinformationservice";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://jena.de/mdo/ibis-customerinfoservice/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ibis_customerinformationservice";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IbisCustomerInformationServicePackage eINSTANCE = de.jena.mdo.ibis.ibis_customerinformationservice.impl.IbisCustomerInformationServicePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.AllDataImpl <em>All Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.AllDataImpl
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.IbisCustomerInformationServicePackageImpl#getAllData()
	 * @generated
	 */
	int ALL_DATA = 0;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DATA__TIME_STAMP = 0;

	/**
	 * The feature id for the '<em><b>Vehicle Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DATA__VEHICLE_REF = 1;

	/**
	 * The feature id for the '<em><b>Default Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DATA__DEFAULT_LANGUAGE = 2;

	/**
	 * The feature id for the '<em><b>Trip Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DATA__TRIP_INFORMATION = 3;

	/**
	 * The feature id for the '<em><b>Current Stop Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DATA__CURRENT_STOP_INDEX = 4;

	/**
	 * The feature id for the '<em><b>Route Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DATA__ROUTE_DEVIATION = 5;

	/**
	 * The feature id for the '<em><b>Door State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DATA__DOOR_STATE = 6;

	/**
	 * The feature id for the '<em><b>In Panic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DATA__IN_PANIC = 7;

	/**
	 * The feature id for the '<em><b>Vehicle Stop Requested</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DATA__VEHICLE_STOP_REQUESTED = 8;

	/**
	 * The feature id for the '<em><b>Exit Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DATA__EXIT_SIDE = 9;

	/**
	 * The feature id for the '<em><b>Moving Direction Forward</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DATA__MOVING_DIRECTION_FORWARD = 10;

	/**
	 * The feature id for the '<em><b>Vehicle Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DATA__VEHICLE_MODE = 11;

	/**
	 * The feature id for the '<em><b>My Own Vehicle Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DATA__MY_OWN_VEHICLE_MODE = 12;

	/**
	 * The feature id for the '<em><b>Speaker Active</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DATA__SPEAKER_ACTIVE = 13;

	/**
	 * The feature id for the '<em><b>Stop Information Active</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DATA__STOP_INFORMATION_ACTIVE = 14;

	/**
	 * The feature id for the '<em><b>Trip State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DATA__TRIP_STATE = 15;

	/**
	 * The feature id for the '<em><b>Global Display Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DATA__GLOBAL_DISPLAY_CONTENT = 16;

	/**
	 * The number of structural features of the '<em>All Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DATA_FEATURE_COUNT = 17;

	/**
	 * The number of operations of the '<em>All Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.CurrentAnnouncementDataImpl <em>Current Announcement Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.CurrentAnnouncementDataImpl
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.IbisCustomerInformationServicePackageImpl#getCurrentAnnouncementData()
	 * @generated
	 */
	int CURRENT_ANNOUNCEMENT_DATA = 1;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_ANNOUNCEMENT_DATA__TIME_STAMP = 0;

	/**
	 * The feature id for the '<em><b>Current Announcement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_ANNOUNCEMENT_DATA__CURRENT_ANNOUNCEMENT = 1;

	/**
	 * The number of structural features of the '<em>Current Announcement Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_ANNOUNCEMENT_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Current Announcement Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_ANNOUNCEMENT_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.CurrentConnectionInformationDataImpl <em>Current Connection Information Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.CurrentConnectionInformationDataImpl
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.IbisCustomerInformationServicePackageImpl#getCurrentConnectionInformationData()
	 * @generated
	 */
	int CURRENT_CONNECTION_INFORMATION_DATA = 2;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_CONNECTION_INFORMATION_DATA__TIME_STAMP = 0;

	/**
	 * The feature id for the '<em><b>Current Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_CONNECTION_INFORMATION_DATA__CURRENT_CONNECTION = 1;

	/**
	 * The number of structural features of the '<em>Current Connection Information Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_CONNECTION_INFORMATION_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Current Connection Information Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_CONNECTION_INFORMATION_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.CurrentDisplayContentDataImpl <em>Current Display Content Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.CurrentDisplayContentDataImpl
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.IbisCustomerInformationServicePackageImpl#getCurrentDisplayContentData()
	 * @generated
	 */
	int CURRENT_DISPLAY_CONTENT_DATA = 3;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_DISPLAY_CONTENT_DATA__TIME_STAMP = 0;

	/**
	 * The feature id for the '<em><b>Current Display Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_DISPLAY_CONTENT_DATA__CURRENT_DISPLAY_CONTENT = 1;

	/**
	 * The number of structural features of the '<em>Current Display Content Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_DISPLAY_CONTENT_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Current Display Content Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_DISPLAY_CONTENT_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.CurrentStopIndexDataImpl <em>Current Stop Index Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.CurrentStopIndexDataImpl
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.IbisCustomerInformationServicePackageImpl#getCurrentStopIndexData()
	 * @generated
	 */
	int CURRENT_STOP_INDEX_DATA = 4;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_STOP_INDEX_DATA__TIME_STAMP = 0;

	/**
	 * The feature id for the '<em><b>Current Stop Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_STOP_INDEX_DATA__CURRENT_STOP_INDEX = 1;

	/**
	 * The number of structural features of the '<em>Current Stop Index Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_STOP_INDEX_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Current Stop Index Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_STOP_INDEX_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.CurrentStopPointDataImpl <em>Current Stop Point Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.CurrentStopPointDataImpl
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.IbisCustomerInformationServicePackageImpl#getCurrentStopPointData()
	 * @generated
	 */
	int CURRENT_STOP_POINT_DATA = 5;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_STOP_POINT_DATA__TIME_STAMP = 0;

	/**
	 * The feature id for the '<em><b>Current Stop Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_STOP_POINT_DATA__CURRENT_STOP_POINT = 1;

	/**
	 * The number of structural features of the '<em>Current Stop Point Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_STOP_POINT_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Current Stop Point Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_STOP_POINT_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.AllDataResponseImpl <em>All Data Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.AllDataResponseImpl
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.IbisCustomerInformationServicePackageImpl#getAllDataResponse()
	 * @generated
	 */
	int ALL_DATA_RESPONSE = 6;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DATA_RESPONSE__OPERATION_ERROR_MESSAGE = IbisCommonPackage.GENERAL_RESPONSE__OPERATION_ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>All Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DATA_RESPONSE__ALL_DATA = IbisCommonPackage.GENERAL_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>All Data Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DATA_RESPONSE_FEATURE_COUNT = IbisCommonPackage.GENERAL_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>All Data Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_DATA_RESPONSE_OPERATION_COUNT = IbisCommonPackage.GENERAL_RESPONSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.CurrentAnnouncementResponseImpl <em>Current Announcement Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.CurrentAnnouncementResponseImpl
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.IbisCustomerInformationServicePackageImpl#getCurrentAnnouncementResponse()
	 * @generated
	 */
	int CURRENT_ANNOUNCEMENT_RESPONSE = 7;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_ANNOUNCEMENT_RESPONSE__OPERATION_ERROR_MESSAGE = IbisCommonPackage.GENERAL_RESPONSE__OPERATION_ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Current Announcement Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_ANNOUNCEMENT_RESPONSE__CURRENT_ANNOUNCEMENT_DATA = IbisCommonPackage.GENERAL_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Current Announcement Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_ANNOUNCEMENT_RESPONSE_FEATURE_COUNT = IbisCommonPackage.GENERAL_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Current Announcement Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_ANNOUNCEMENT_RESPONSE_OPERATION_COUNT = IbisCommonPackage.GENERAL_RESPONSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.CurrentConnectionInformationResponseImpl <em>Current Connection Information Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.CurrentConnectionInformationResponseImpl
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.IbisCustomerInformationServicePackageImpl#getCurrentConnectionInformationResponse()
	 * @generated
	 */
	int CURRENT_CONNECTION_INFORMATION_RESPONSE = 8;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_CONNECTION_INFORMATION_RESPONSE__OPERATION_ERROR_MESSAGE = IbisCommonPackage.GENERAL_RESPONSE__OPERATION_ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Current Connection Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_CONNECTION_INFORMATION_RESPONSE__CURRENT_CONNECTION_DATA = IbisCommonPackage.GENERAL_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Current Connection Information Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_CONNECTION_INFORMATION_RESPONSE_FEATURE_COUNT = IbisCommonPackage.GENERAL_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Current Connection Information Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_CONNECTION_INFORMATION_RESPONSE_OPERATION_COUNT = IbisCommonPackage.GENERAL_RESPONSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.CurrentDisplayContentResponseImpl <em>Current Display Content Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.CurrentDisplayContentResponseImpl
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.IbisCustomerInformationServicePackageImpl#getCurrentDisplayContentResponse()
	 * @generated
	 */
	int CURRENT_DISPLAY_CONTENT_RESPONSE = 9;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_DISPLAY_CONTENT_RESPONSE__OPERATION_ERROR_MESSAGE = IbisCommonPackage.GENERAL_RESPONSE__OPERATION_ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Current Display Content Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_DISPLAY_CONTENT_RESPONSE__CURRENT_DISPLAY_CONTENT_DATA = IbisCommonPackage.GENERAL_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Current Display Content Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_DISPLAY_CONTENT_RESPONSE_FEATURE_COUNT = IbisCommonPackage.GENERAL_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Current Display Content Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_DISPLAY_CONTENT_RESPONSE_OPERATION_COUNT = IbisCommonPackage.GENERAL_RESPONSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.CurrentStopIndexResponseImpl <em>Current Stop Index Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.CurrentStopIndexResponseImpl
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.IbisCustomerInformationServicePackageImpl#getCurrentStopIndexResponse()
	 * @generated
	 */
	int CURRENT_STOP_INDEX_RESPONSE = 10;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_STOP_INDEX_RESPONSE__OPERATION_ERROR_MESSAGE = IbisCommonPackage.GENERAL_RESPONSE__OPERATION_ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Current Stop Index Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_STOP_INDEX_RESPONSE__CURRENT_STOP_INDEX_DATA = IbisCommonPackage.GENERAL_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Current Stop Index Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_STOP_INDEX_RESPONSE_FEATURE_COUNT = IbisCommonPackage.GENERAL_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Current Stop Index Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_STOP_INDEX_RESPONSE_OPERATION_COUNT = IbisCommonPackage.GENERAL_RESPONSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.CurrentStopPointResponseImpl <em>Current Stop Point Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.CurrentStopPointResponseImpl
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.IbisCustomerInformationServicePackageImpl#getCurrentStopPointResponse()
	 * @generated
	 */
	int CURRENT_STOP_POINT_RESPONSE = 11;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_STOP_POINT_RESPONSE__OPERATION_ERROR_MESSAGE = IbisCommonPackage.GENERAL_RESPONSE__OPERATION_ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Current Stop Point Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_STOP_POINT_RESPONSE__CURRENT_STOP_POINT_DATA = IbisCommonPackage.GENERAL_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Current Stop Point Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_STOP_POINT_RESPONSE_FEATURE_COUNT = IbisCommonPackage.GENERAL_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Current Stop Point Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_STOP_POINT_RESPONSE_OPERATION_COUNT = IbisCommonPackage.GENERAL_RESPONSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.TripDataResponseImpl <em>Trip Data Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.TripDataResponseImpl
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.IbisCustomerInformationServicePackageImpl#getTripDataResponse()
	 * @generated
	 */
	int TRIP_DATA_RESPONSE = 12;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_DATA_RESPONSE__OPERATION_ERROR_MESSAGE = IbisCommonPackage.GENERAL_RESPONSE__OPERATION_ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Trip Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_DATA_RESPONSE__TRIP_DATA = IbisCommonPackage.GENERAL_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trip Data Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_DATA_RESPONSE_FEATURE_COUNT = IbisCommonPackage.GENERAL_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trip Data Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_DATA_RESPONSE_OPERATION_COUNT = IbisCommonPackage.GENERAL_RESPONSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.VehicleDataResponseImpl <em>Vehicle Data Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.VehicleDataResponseImpl
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.IbisCustomerInformationServicePackageImpl#getVehicleDataResponse()
	 * @generated
	 */
	int VEHICLE_DATA_RESPONSE = 13;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_DATA_RESPONSE__OPERATION_ERROR_MESSAGE = IbisCommonPackage.GENERAL_RESPONSE__OPERATION_ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Vehicle Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_DATA_RESPONSE__VEHICLE_DATA = IbisCommonPackage.GENERAL_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Vehicle Data Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_DATA_RESPONSE_FEATURE_COUNT = IbisCommonPackage.GENERAL_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Vehicle Data Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_DATA_RESPONSE_OPERATION_COUNT = IbisCommonPackage.GENERAL_RESPONSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.PartialStopSequenceDataImpl <em>Partial Stop Sequence Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.PartialStopSequenceDataImpl
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.IbisCustomerInformationServicePackageImpl#getPartialStopSequenceData()
	 * @generated
	 */
	int PARTIAL_STOP_SEQUENCE_DATA = 14;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_STOP_SEQUENCE_DATA__TIME_STAMP = 0;

	/**
	 * The feature id for the '<em><b>Stop Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_STOP_SEQUENCE_DATA__STOP_SEQUENCE = 1;

	/**
	 * The number of structural features of the '<em>Partial Stop Sequence Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_STOP_SEQUENCE_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Partial Stop Sequence Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_STOP_SEQUENCE_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.PartialStopSequenceRequestImpl <em>Partial Stop Sequence Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.PartialStopSequenceRequestImpl
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.IbisCustomerInformationServicePackageImpl#getPartialStopSequenceRequest()
	 * @generated
	 */
	int PARTIAL_STOP_SEQUENCE_REQUEST = 15;

	/**
	 * The feature id for the '<em><b>Starting Stop Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_STOP_SEQUENCE_REQUEST__STARTING_STOP_INDEX = 0;

	/**
	 * The feature id for the '<em><b>Number Of Stop Points</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_STOP_SEQUENCE_REQUEST__NUMBER_OF_STOP_POINTS = 1;

	/**
	 * The number of structural features of the '<em>Partial Stop Sequence Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_STOP_SEQUENCE_REQUEST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Partial Stop Sequence Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_STOP_SEQUENCE_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.PartialStopSequenceResponseImpl <em>Partial Stop Sequence Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.PartialStopSequenceResponseImpl
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.IbisCustomerInformationServicePackageImpl#getPartialStopSequenceResponse()
	 * @generated
	 */
	int PARTIAL_STOP_SEQUENCE_RESPONSE = 16;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_STOP_SEQUENCE_RESPONSE__OPERATION_ERROR_MESSAGE = IbisCommonPackage.GENERAL_RESPONSE__OPERATION_ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Partial Stop Sequence Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_STOP_SEQUENCE_RESPONSE__PARTIAL_STOP_SEQUENCE_DATA = IbisCommonPackage.GENERAL_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Partial Stop Sequence Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_STOP_SEQUENCE_RESPONSE_FEATURE_COUNT = IbisCommonPackage.GENERAL_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Partial Stop Sequence Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_STOP_SEQUENCE_RESPONSE_OPERATION_COUNT = IbisCommonPackage.GENERAL_RESPONSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.TripDataImpl <em>Trip Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.TripDataImpl
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.IbisCustomerInformationServicePackageImpl#getTripData()
	 * @generated
	 */
	int TRIP_DATA = 17;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_DATA__TIME_STAMP = 0;

	/**
	 * The feature id for the '<em><b>Vehicle Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_DATA__VEHICLE_REF = 1;

	/**
	 * The feature id for the '<em><b>Default Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_DATA__DEFAULT_LANGUAGE = 2;

	/**
	 * The feature id for the '<em><b>Trip Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_DATA__TRIP_INFORMATION = 3;

	/**
	 * The feature id for the '<em><b>Current Stop Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_DATA__CURRENT_STOP_INDEX = 4;

	/**
	 * The number of structural features of the '<em>Trip Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_DATA_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Trip Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.VehicleDataImpl <em>Vehicle Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.VehicleDataImpl
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.IbisCustomerInformationServicePackageImpl#getVehicleData()
	 * @generated
	 */
	int VEHICLE_DATA = 18;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_DATA__TIME_STAMP = 0;

	/**
	 * The feature id for the '<em><b>Vehicle Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_DATA__VEHICLE_REF = 1;

	/**
	 * The feature id for the '<em><b>Route Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_DATA__ROUTE_DEVIATION = 2;

	/**
	 * The feature id for the '<em><b>Door State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_DATA__DOOR_STATE = 3;

	/**
	 * The feature id for the '<em><b>In Panic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_DATA__IN_PANIC = 4;

	/**
	 * The feature id for the '<em><b>Vehicle Stop Requested</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_DATA__VEHICLE_STOP_REQUESTED = 5;

	/**
	 * The feature id for the '<em><b>Exit Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_DATA__EXIT_SIDE = 6;

	/**
	 * The feature id for the '<em><b>Moving Direction Forward</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_DATA__MOVING_DIRECTION_FORWARD = 7;

	/**
	 * The feature id for the '<em><b>Vehicle Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_DATA__VEHICLE_MODE = 8;

	/**
	 * The feature id for the '<em><b>My Own Vehicle Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_DATA__MY_OWN_VEHICLE_MODE = 9;

	/**
	 * The feature id for the '<em><b>Speaker Active</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_DATA__SPEAKER_ACTIVE = 10;

	/**
	 * The feature id for the '<em><b>Stop Information Active</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_DATA__STOP_INFORMATION_ACTIVE = 11;

	/**
	 * The feature id for the '<em><b>Trip State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_DATA__TRIP_STATE = 12;

	/**
	 * The number of structural features of the '<em>Vehicle Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_DATA_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Vehicle Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_DATA_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData <em>All Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All Data</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.AllData
	 * @generated
	 */
	EClass getAllData();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Stamp</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getTimeStamp()
	 * @see #getAllData()
	 * @generated
	 */
	EReference getAllData_TimeStamp();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getVehicleRef <em>Vehicle Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vehicle Ref</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getVehicleRef()
	 * @see #getAllData()
	 * @generated
	 */
	EReference getAllData_VehicleRef();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getDefaultLanguage <em>Default Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Language</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getDefaultLanguage()
	 * @see #getAllData()
	 * @generated
	 */
	EReference getAllData_DefaultLanguage();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getTripInformation <em>Trip Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trip Information</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getTripInformation()
	 * @see #getAllData()
	 * @generated
	 */
	EReference getAllData_TripInformation();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getCurrentStopIndex <em>Current Stop Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Current Stop Index</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getCurrentStopIndex()
	 * @see #getAllData()
	 * @generated
	 */
	EReference getAllData_CurrentStopIndex();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getRouteDeviation <em>Route Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Route Deviation</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getRouteDeviation()
	 * @see #getAllData()
	 * @generated
	 */
	EAttribute getAllData_RouteDeviation();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getDoorState <em>Door State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Door State</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getDoorState()
	 * @see #getAllData()
	 * @generated
	 */
	EAttribute getAllData_DoorState();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getInPanic <em>In Panic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>In Panic</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getInPanic()
	 * @see #getAllData()
	 * @generated
	 */
	EReference getAllData_InPanic();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getVehicleStopRequested <em>Vehicle Stop Requested</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vehicle Stop Requested</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getVehicleStopRequested()
	 * @see #getAllData()
	 * @generated
	 */
	EReference getAllData_VehicleStopRequested();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getExitSide <em>Exit Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exit Side</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getExitSide()
	 * @see #getAllData()
	 * @generated
	 */
	EAttribute getAllData_ExitSide();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getMovingDirectionForward <em>Moving Direction Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Moving Direction Forward</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getMovingDirectionForward()
	 * @see #getAllData()
	 * @generated
	 */
	EReference getAllData_MovingDirectionForward();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getVehicleMode <em>Vehicle Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vehicle Mode</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getVehicleMode()
	 * @see #getAllData()
	 * @generated
	 */
	EAttribute getAllData_VehicleMode();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getMyOwnVehicleMode <em>My Own Vehicle Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>My Own Vehicle Mode</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getMyOwnVehicleMode()
	 * @see #getAllData()
	 * @generated
	 */
	EReference getAllData_MyOwnVehicleMode();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getSpeakerActive <em>Speaker Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Speaker Active</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getSpeakerActive()
	 * @see #getAllData()
	 * @generated
	 */
	EReference getAllData_SpeakerActive();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getStopInformationActive <em>Stop Information Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stop Information Active</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getStopInformationActive()
	 * @see #getAllData()
	 * @generated
	 */
	EReference getAllData_StopInformationActive();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getTripState <em>Trip State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trip State</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getTripState()
	 * @see #getAllData()
	 * @generated
	 */
	EAttribute getAllData_TripState();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getGlobalDisplayContent <em>Global Display Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Display Content</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.AllData#getGlobalDisplayContent()
	 * @see #getAllData()
	 * @generated
	 */
	EReference getAllData_GlobalDisplayContent();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_customerinformationservice.CurrentAnnouncementData <em>Current Announcement Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current Announcement Data</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.CurrentAnnouncementData
	 * @generated
	 */
	EClass getCurrentAnnouncementData();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_customerinformationservice.CurrentAnnouncementData#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Stamp</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.CurrentAnnouncementData#getTimeStamp()
	 * @see #getCurrentAnnouncementData()
	 * @generated
	 */
	EReference getCurrentAnnouncementData_TimeStamp();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_customerinformationservice.CurrentAnnouncementData#getCurrentAnnouncement <em>Current Announcement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Current Announcement</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.CurrentAnnouncementData#getCurrentAnnouncement()
	 * @see #getCurrentAnnouncementData()
	 * @generated
	 */
	EReference getCurrentAnnouncementData_CurrentAnnouncement();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_customerinformationservice.CurrentConnectionInformationData <em>Current Connection Information Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current Connection Information Data</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.CurrentConnectionInformationData
	 * @generated
	 */
	EClass getCurrentConnectionInformationData();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_customerinformationservice.CurrentConnectionInformationData#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Stamp</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.CurrentConnectionInformationData#getTimeStamp()
	 * @see #getCurrentConnectionInformationData()
	 * @generated
	 */
	EReference getCurrentConnectionInformationData_TimeStamp();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_customerinformationservice.CurrentConnectionInformationData#getCurrentConnection <em>Current Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Current Connection</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.CurrentConnectionInformationData#getCurrentConnection()
	 * @see #getCurrentConnectionInformationData()
	 * @generated
	 */
	EReference getCurrentConnectionInformationData_CurrentConnection();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_customerinformationservice.CurrentDisplayContentData <em>Current Display Content Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current Display Content Data</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.CurrentDisplayContentData
	 * @generated
	 */
	EClass getCurrentDisplayContentData();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_customerinformationservice.CurrentDisplayContentData#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Stamp</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.CurrentDisplayContentData#getTimeStamp()
	 * @see #getCurrentDisplayContentData()
	 * @generated
	 */
	EReference getCurrentDisplayContentData_TimeStamp();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_customerinformationservice.CurrentDisplayContentData#getCurrentDisplayContent <em>Current Display Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Current Display Content</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.CurrentDisplayContentData#getCurrentDisplayContent()
	 * @see #getCurrentDisplayContentData()
	 * @generated
	 */
	EReference getCurrentDisplayContentData_CurrentDisplayContent();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_customerinformationservice.CurrentStopIndexData <em>Current Stop Index Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current Stop Index Data</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.CurrentStopIndexData
	 * @generated
	 */
	EClass getCurrentStopIndexData();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_customerinformationservice.CurrentStopIndexData#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Stamp</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.CurrentStopIndexData#getTimeStamp()
	 * @see #getCurrentStopIndexData()
	 * @generated
	 */
	EReference getCurrentStopIndexData_TimeStamp();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_customerinformationservice.CurrentStopIndexData#getCurrentStopIndex <em>Current Stop Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Current Stop Index</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.CurrentStopIndexData#getCurrentStopIndex()
	 * @see #getCurrentStopIndexData()
	 * @generated
	 */
	EReference getCurrentStopIndexData_CurrentStopIndex();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_customerinformationservice.CurrentStopPointData <em>Current Stop Point Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current Stop Point Data</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.CurrentStopPointData
	 * @generated
	 */
	EClass getCurrentStopPointData();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_customerinformationservice.CurrentStopPointData#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Stamp</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.CurrentStopPointData#getTimeStamp()
	 * @see #getCurrentStopPointData()
	 * @generated
	 */
	EReference getCurrentStopPointData_TimeStamp();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_customerinformationservice.CurrentStopPointData#getCurrentStopPoint <em>Current Stop Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Current Stop Point</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.CurrentStopPointData#getCurrentStopPoint()
	 * @see #getCurrentStopPointData()
	 * @generated
	 */
	EReference getCurrentStopPointData_CurrentStopPoint();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllDataResponse <em>All Data Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All Data Response</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.AllDataResponse
	 * @generated
	 */
	EClass getAllDataResponse();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_customerinformationservice.AllDataResponse#getAllData <em>All Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All Data</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.AllDataResponse#getAllData()
	 * @see #getAllDataResponse()
	 * @generated
	 */
	EReference getAllDataResponse_AllData();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_customerinformationservice.CurrentAnnouncementResponse <em>Current Announcement Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current Announcement Response</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.CurrentAnnouncementResponse
	 * @generated
	 */
	EClass getCurrentAnnouncementResponse();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_customerinformationservice.CurrentAnnouncementResponse#getCurrentAnnouncementData <em>Current Announcement Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Current Announcement Data</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.CurrentAnnouncementResponse#getCurrentAnnouncementData()
	 * @see #getCurrentAnnouncementResponse()
	 * @generated
	 */
	EReference getCurrentAnnouncementResponse_CurrentAnnouncementData();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_customerinformationservice.CurrentConnectionInformationResponse <em>Current Connection Information Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current Connection Information Response</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.CurrentConnectionInformationResponse
	 * @generated
	 */
	EClass getCurrentConnectionInformationResponse();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_customerinformationservice.CurrentConnectionInformationResponse#getCurrentConnectionData <em>Current Connection Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Current Connection Data</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.CurrentConnectionInformationResponse#getCurrentConnectionData()
	 * @see #getCurrentConnectionInformationResponse()
	 * @generated
	 */
	EReference getCurrentConnectionInformationResponse_CurrentConnectionData();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_customerinformationservice.CurrentDisplayContentResponse <em>Current Display Content Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current Display Content Response</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.CurrentDisplayContentResponse
	 * @generated
	 */
	EClass getCurrentDisplayContentResponse();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_customerinformationservice.CurrentDisplayContentResponse#getCurrentDisplayContentData <em>Current Display Content Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Current Display Content Data</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.CurrentDisplayContentResponse#getCurrentDisplayContentData()
	 * @see #getCurrentDisplayContentResponse()
	 * @generated
	 */
	EReference getCurrentDisplayContentResponse_CurrentDisplayContentData();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_customerinformationservice.CurrentStopIndexResponse <em>Current Stop Index Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current Stop Index Response</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.CurrentStopIndexResponse
	 * @generated
	 */
	EClass getCurrentStopIndexResponse();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_customerinformationservice.CurrentStopIndexResponse#getCurrentStopIndexData <em>Current Stop Index Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Current Stop Index Data</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.CurrentStopIndexResponse#getCurrentStopIndexData()
	 * @see #getCurrentStopIndexResponse()
	 * @generated
	 */
	EReference getCurrentStopIndexResponse_CurrentStopIndexData();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_customerinformationservice.CurrentStopPointResponse <em>Current Stop Point Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current Stop Point Response</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.CurrentStopPointResponse
	 * @generated
	 */
	EClass getCurrentStopPointResponse();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_customerinformationservice.CurrentStopPointResponse#getCurrentStopPointData <em>Current Stop Point Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Current Stop Point Data</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.CurrentStopPointResponse#getCurrentStopPointData()
	 * @see #getCurrentStopPointResponse()
	 * @generated
	 */
	EReference getCurrentStopPointResponse_CurrentStopPointData();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_customerinformationservice.TripDataResponse <em>Trip Data Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trip Data Response</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.TripDataResponse
	 * @generated
	 */
	EClass getTripDataResponse();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_customerinformationservice.TripDataResponse#getTripData <em>Trip Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trip Data</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.TripDataResponse#getTripData()
	 * @see #getTripDataResponse()
	 * @generated
	 */
	EReference getTripDataResponse_TripData();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_customerinformationservice.VehicleDataResponse <em>Vehicle Data Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle Data Response</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.VehicleDataResponse
	 * @generated
	 */
	EClass getVehicleDataResponse();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_customerinformationservice.VehicleDataResponse#getVehicleData <em>Vehicle Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vehicle Data</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.VehicleDataResponse#getVehicleData()
	 * @see #getVehicleDataResponse()
	 * @generated
	 */
	EReference getVehicleDataResponse_VehicleData();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_customerinformationservice.PartialStopSequenceData <em>Partial Stop Sequence Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partial Stop Sequence Data</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.PartialStopSequenceData
	 * @generated
	 */
	EClass getPartialStopSequenceData();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_customerinformationservice.PartialStopSequenceData#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Stamp</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.PartialStopSequenceData#getTimeStamp()
	 * @see #getPartialStopSequenceData()
	 * @generated
	 */
	EReference getPartialStopSequenceData_TimeStamp();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_customerinformationservice.PartialStopSequenceData#getStopSequence <em>Stop Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stop Sequence</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.PartialStopSequenceData#getStopSequence()
	 * @see #getPartialStopSequenceData()
	 * @generated
	 */
	EReference getPartialStopSequenceData_StopSequence();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_customerinformationservice.PartialStopSequenceRequest <em>Partial Stop Sequence Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partial Stop Sequence Request</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.PartialStopSequenceRequest
	 * @generated
	 */
	EClass getPartialStopSequenceRequest();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_customerinformationservice.PartialStopSequenceRequest#getStartingStopIndex <em>Starting Stop Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Starting Stop Index</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.PartialStopSequenceRequest#getStartingStopIndex()
	 * @see #getPartialStopSequenceRequest()
	 * @generated
	 */
	EReference getPartialStopSequenceRequest_StartingStopIndex();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_customerinformationservice.PartialStopSequenceRequest#getNumberOfStopPoints <em>Number Of Stop Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Number Of Stop Points</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.PartialStopSequenceRequest#getNumberOfStopPoints()
	 * @see #getPartialStopSequenceRequest()
	 * @generated
	 */
	EReference getPartialStopSequenceRequest_NumberOfStopPoints();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_customerinformationservice.PartialStopSequenceResponse <em>Partial Stop Sequence Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partial Stop Sequence Response</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.PartialStopSequenceResponse
	 * @generated
	 */
	EClass getPartialStopSequenceResponse();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_customerinformationservice.PartialStopSequenceResponse#getPartialStopSequenceData <em>Partial Stop Sequence Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Partial Stop Sequence Data</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.PartialStopSequenceResponse#getPartialStopSequenceData()
	 * @see #getPartialStopSequenceResponse()
	 * @generated
	 */
	EReference getPartialStopSequenceResponse_PartialStopSequenceData();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_customerinformationservice.TripData <em>Trip Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trip Data</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.TripData
	 * @generated
	 */
	EClass getTripData();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_customerinformationservice.TripData#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Stamp</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.TripData#getTimeStamp()
	 * @see #getTripData()
	 * @generated
	 */
	EReference getTripData_TimeStamp();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_customerinformationservice.TripData#getVehicleRef <em>Vehicle Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vehicle Ref</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.TripData#getVehicleRef()
	 * @see #getTripData()
	 * @generated
	 */
	EReference getTripData_VehicleRef();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_customerinformationservice.TripData#getDefaultLanguage <em>Default Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Language</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.TripData#getDefaultLanguage()
	 * @see #getTripData()
	 * @generated
	 */
	EReference getTripData_DefaultLanguage();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_customerinformationservice.TripData#getTripInformation <em>Trip Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trip Information</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.TripData#getTripInformation()
	 * @see #getTripData()
	 * @generated
	 */
	EReference getTripData_TripInformation();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_customerinformationservice.TripData#getCurrentStopIndex <em>Current Stop Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Current Stop Index</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.TripData#getCurrentStopIndex()
	 * @see #getTripData()
	 * @generated
	 */
	EReference getTripData_CurrentStopIndex();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_customerinformationservice.VehicleData <em>Vehicle Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle Data</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.VehicleData
	 * @generated
	 */
	EClass getVehicleData();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_customerinformationservice.VehicleData#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Stamp</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.VehicleData#getTimeStamp()
	 * @see #getVehicleData()
	 * @generated
	 */
	EReference getVehicleData_TimeStamp();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_customerinformationservice.VehicleData#getVehicleRef <em>Vehicle Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vehicle Ref</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.VehicleData#getVehicleRef()
	 * @see #getVehicleData()
	 * @generated
	 */
	EReference getVehicleData_VehicleRef();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_customerinformationservice.VehicleData#getRouteDeviation <em>Route Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Route Deviation</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.VehicleData#getRouteDeviation()
	 * @see #getVehicleData()
	 * @generated
	 */
	EAttribute getVehicleData_RouteDeviation();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_customerinformationservice.VehicleData#getDoorState <em>Door State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Door State</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.VehicleData#getDoorState()
	 * @see #getVehicleData()
	 * @generated
	 */
	EAttribute getVehicleData_DoorState();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_customerinformationservice.VehicleData#getInPanic <em>In Panic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>In Panic</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.VehicleData#getInPanic()
	 * @see #getVehicleData()
	 * @generated
	 */
	EReference getVehicleData_InPanic();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_customerinformationservice.VehicleData#getVehicleStopRequested <em>Vehicle Stop Requested</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vehicle Stop Requested</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.VehicleData#getVehicleStopRequested()
	 * @see #getVehicleData()
	 * @generated
	 */
	EReference getVehicleData_VehicleStopRequested();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_customerinformationservice.VehicleData#getExitSide <em>Exit Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exit Side</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.VehicleData#getExitSide()
	 * @see #getVehicleData()
	 * @generated
	 */
	EAttribute getVehicleData_ExitSide();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_customerinformationservice.VehicleData#getMovingDirectionForward <em>Moving Direction Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Moving Direction Forward</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.VehicleData#getMovingDirectionForward()
	 * @see #getVehicleData()
	 * @generated
	 */
	EReference getVehicleData_MovingDirectionForward();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_customerinformationservice.VehicleData#getVehicleMode <em>Vehicle Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vehicle Mode</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.VehicleData#getVehicleMode()
	 * @see #getVehicleData()
	 * @generated
	 */
	EAttribute getVehicleData_VehicleMode();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_customerinformationservice.VehicleData#getMyOwnVehicleMode <em>My Own Vehicle Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>My Own Vehicle Mode</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.VehicleData#getMyOwnVehicleMode()
	 * @see #getVehicleData()
	 * @generated
	 */
	EReference getVehicleData_MyOwnVehicleMode();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_customerinformationservice.VehicleData#getSpeakerActive <em>Speaker Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Speaker Active</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.VehicleData#getSpeakerActive()
	 * @see #getVehicleData()
	 * @generated
	 */
	EReference getVehicleData_SpeakerActive();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_customerinformationservice.VehicleData#getStopInformationActive <em>Stop Information Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stop Information Active</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.VehicleData#getStopInformationActive()
	 * @see #getVehicleData()
	 * @generated
	 */
	EReference getVehicleData_StopInformationActive();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_customerinformationservice.VehicleData#getTripState <em>Trip State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trip State</em>'.
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.VehicleData#getTripState()
	 * @see #getVehicleData()
	 * @generated
	 */
	EAttribute getVehicleData_TripState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IbisCustomerInformationServiceFactory getIbisCustomerInformationServiceFactory();

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
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.AllDataImpl <em>All Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.AllDataImpl
		 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.IbisCustomerInformationServicePackageImpl#getAllData()
		 * @generated
		 */
		EClass ALL_DATA = eINSTANCE.getAllData();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALL_DATA__TIME_STAMP = eINSTANCE.getAllData_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Vehicle Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALL_DATA__VEHICLE_REF = eINSTANCE.getAllData_VehicleRef();

		/**
		 * The meta object literal for the '<em><b>Default Language</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALL_DATA__DEFAULT_LANGUAGE = eINSTANCE.getAllData_DefaultLanguage();

		/**
		 * The meta object literal for the '<em><b>Trip Information</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALL_DATA__TRIP_INFORMATION = eINSTANCE.getAllData_TripInformation();

		/**
		 * The meta object literal for the '<em><b>Current Stop Index</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALL_DATA__CURRENT_STOP_INDEX = eINSTANCE.getAllData_CurrentStopIndex();

		/**
		 * The meta object literal for the '<em><b>Route Deviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALL_DATA__ROUTE_DEVIATION = eINSTANCE.getAllData_RouteDeviation();

		/**
		 * The meta object literal for the '<em><b>Door State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALL_DATA__DOOR_STATE = eINSTANCE.getAllData_DoorState();

		/**
		 * The meta object literal for the '<em><b>In Panic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALL_DATA__IN_PANIC = eINSTANCE.getAllData_InPanic();

		/**
		 * The meta object literal for the '<em><b>Vehicle Stop Requested</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALL_DATA__VEHICLE_STOP_REQUESTED = eINSTANCE.getAllData_VehicleStopRequested();

		/**
		 * The meta object literal for the '<em><b>Exit Side</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALL_DATA__EXIT_SIDE = eINSTANCE.getAllData_ExitSide();

		/**
		 * The meta object literal for the '<em><b>Moving Direction Forward</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALL_DATA__MOVING_DIRECTION_FORWARD = eINSTANCE.getAllData_MovingDirectionForward();

		/**
		 * The meta object literal for the '<em><b>Vehicle Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALL_DATA__VEHICLE_MODE = eINSTANCE.getAllData_VehicleMode();

		/**
		 * The meta object literal for the '<em><b>My Own Vehicle Mode</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALL_DATA__MY_OWN_VEHICLE_MODE = eINSTANCE.getAllData_MyOwnVehicleMode();

		/**
		 * The meta object literal for the '<em><b>Speaker Active</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALL_DATA__SPEAKER_ACTIVE = eINSTANCE.getAllData_SpeakerActive();

		/**
		 * The meta object literal for the '<em><b>Stop Information Active</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALL_DATA__STOP_INFORMATION_ACTIVE = eINSTANCE.getAllData_StopInformationActive();

		/**
		 * The meta object literal for the '<em><b>Trip State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALL_DATA__TRIP_STATE = eINSTANCE.getAllData_TripState();

		/**
		 * The meta object literal for the '<em><b>Global Display Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALL_DATA__GLOBAL_DISPLAY_CONTENT = eINSTANCE.getAllData_GlobalDisplayContent();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.CurrentAnnouncementDataImpl <em>Current Announcement Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.CurrentAnnouncementDataImpl
		 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.IbisCustomerInformationServicePackageImpl#getCurrentAnnouncementData()
		 * @generated
		 */
		EClass CURRENT_ANNOUNCEMENT_DATA = eINSTANCE.getCurrentAnnouncementData();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENT_ANNOUNCEMENT_DATA__TIME_STAMP = eINSTANCE.getCurrentAnnouncementData_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Current Announcement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENT_ANNOUNCEMENT_DATA__CURRENT_ANNOUNCEMENT = eINSTANCE.getCurrentAnnouncementData_CurrentAnnouncement();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.CurrentConnectionInformationDataImpl <em>Current Connection Information Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.CurrentConnectionInformationDataImpl
		 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.IbisCustomerInformationServicePackageImpl#getCurrentConnectionInformationData()
		 * @generated
		 */
		EClass CURRENT_CONNECTION_INFORMATION_DATA = eINSTANCE.getCurrentConnectionInformationData();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENT_CONNECTION_INFORMATION_DATA__TIME_STAMP = eINSTANCE.getCurrentConnectionInformationData_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Current Connection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENT_CONNECTION_INFORMATION_DATA__CURRENT_CONNECTION = eINSTANCE.getCurrentConnectionInformationData_CurrentConnection();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.CurrentDisplayContentDataImpl <em>Current Display Content Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.CurrentDisplayContentDataImpl
		 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.IbisCustomerInformationServicePackageImpl#getCurrentDisplayContentData()
		 * @generated
		 */
		EClass CURRENT_DISPLAY_CONTENT_DATA = eINSTANCE.getCurrentDisplayContentData();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENT_DISPLAY_CONTENT_DATA__TIME_STAMP = eINSTANCE.getCurrentDisplayContentData_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Current Display Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENT_DISPLAY_CONTENT_DATA__CURRENT_DISPLAY_CONTENT = eINSTANCE.getCurrentDisplayContentData_CurrentDisplayContent();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.CurrentStopIndexDataImpl <em>Current Stop Index Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.CurrentStopIndexDataImpl
		 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.IbisCustomerInformationServicePackageImpl#getCurrentStopIndexData()
		 * @generated
		 */
		EClass CURRENT_STOP_INDEX_DATA = eINSTANCE.getCurrentStopIndexData();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENT_STOP_INDEX_DATA__TIME_STAMP = eINSTANCE.getCurrentStopIndexData_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Current Stop Index</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENT_STOP_INDEX_DATA__CURRENT_STOP_INDEX = eINSTANCE.getCurrentStopIndexData_CurrentStopIndex();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.CurrentStopPointDataImpl <em>Current Stop Point Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.CurrentStopPointDataImpl
		 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.IbisCustomerInformationServicePackageImpl#getCurrentStopPointData()
		 * @generated
		 */
		EClass CURRENT_STOP_POINT_DATA = eINSTANCE.getCurrentStopPointData();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENT_STOP_POINT_DATA__TIME_STAMP = eINSTANCE.getCurrentStopPointData_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Current Stop Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENT_STOP_POINT_DATA__CURRENT_STOP_POINT = eINSTANCE.getCurrentStopPointData_CurrentStopPoint();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.AllDataResponseImpl <em>All Data Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.AllDataResponseImpl
		 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.IbisCustomerInformationServicePackageImpl#getAllDataResponse()
		 * @generated
		 */
		EClass ALL_DATA_RESPONSE = eINSTANCE.getAllDataResponse();

		/**
		 * The meta object literal for the '<em><b>All Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALL_DATA_RESPONSE__ALL_DATA = eINSTANCE.getAllDataResponse_AllData();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.CurrentAnnouncementResponseImpl <em>Current Announcement Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.CurrentAnnouncementResponseImpl
		 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.IbisCustomerInformationServicePackageImpl#getCurrentAnnouncementResponse()
		 * @generated
		 */
		EClass CURRENT_ANNOUNCEMENT_RESPONSE = eINSTANCE.getCurrentAnnouncementResponse();

		/**
		 * The meta object literal for the '<em><b>Current Announcement Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENT_ANNOUNCEMENT_RESPONSE__CURRENT_ANNOUNCEMENT_DATA = eINSTANCE.getCurrentAnnouncementResponse_CurrentAnnouncementData();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.CurrentConnectionInformationResponseImpl <em>Current Connection Information Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.CurrentConnectionInformationResponseImpl
		 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.IbisCustomerInformationServicePackageImpl#getCurrentConnectionInformationResponse()
		 * @generated
		 */
		EClass CURRENT_CONNECTION_INFORMATION_RESPONSE = eINSTANCE.getCurrentConnectionInformationResponse();

		/**
		 * The meta object literal for the '<em><b>Current Connection Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENT_CONNECTION_INFORMATION_RESPONSE__CURRENT_CONNECTION_DATA = eINSTANCE.getCurrentConnectionInformationResponse_CurrentConnectionData();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.CurrentDisplayContentResponseImpl <em>Current Display Content Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.CurrentDisplayContentResponseImpl
		 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.IbisCustomerInformationServicePackageImpl#getCurrentDisplayContentResponse()
		 * @generated
		 */
		EClass CURRENT_DISPLAY_CONTENT_RESPONSE = eINSTANCE.getCurrentDisplayContentResponse();

		/**
		 * The meta object literal for the '<em><b>Current Display Content Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENT_DISPLAY_CONTENT_RESPONSE__CURRENT_DISPLAY_CONTENT_DATA = eINSTANCE.getCurrentDisplayContentResponse_CurrentDisplayContentData();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.CurrentStopIndexResponseImpl <em>Current Stop Index Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.CurrentStopIndexResponseImpl
		 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.IbisCustomerInformationServicePackageImpl#getCurrentStopIndexResponse()
		 * @generated
		 */
		EClass CURRENT_STOP_INDEX_RESPONSE = eINSTANCE.getCurrentStopIndexResponse();

		/**
		 * The meta object literal for the '<em><b>Current Stop Index Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENT_STOP_INDEX_RESPONSE__CURRENT_STOP_INDEX_DATA = eINSTANCE.getCurrentStopIndexResponse_CurrentStopIndexData();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.CurrentStopPointResponseImpl <em>Current Stop Point Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.CurrentStopPointResponseImpl
		 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.IbisCustomerInformationServicePackageImpl#getCurrentStopPointResponse()
		 * @generated
		 */
		EClass CURRENT_STOP_POINT_RESPONSE = eINSTANCE.getCurrentStopPointResponse();

		/**
		 * The meta object literal for the '<em><b>Current Stop Point Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENT_STOP_POINT_RESPONSE__CURRENT_STOP_POINT_DATA = eINSTANCE.getCurrentStopPointResponse_CurrentStopPointData();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.TripDataResponseImpl <em>Trip Data Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.TripDataResponseImpl
		 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.IbisCustomerInformationServicePackageImpl#getTripDataResponse()
		 * @generated
		 */
		EClass TRIP_DATA_RESPONSE = eINSTANCE.getTripDataResponse();

		/**
		 * The meta object literal for the '<em><b>Trip Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_DATA_RESPONSE__TRIP_DATA = eINSTANCE.getTripDataResponse_TripData();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.VehicleDataResponseImpl <em>Vehicle Data Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.VehicleDataResponseImpl
		 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.IbisCustomerInformationServicePackageImpl#getVehicleDataResponse()
		 * @generated
		 */
		EClass VEHICLE_DATA_RESPONSE = eINSTANCE.getVehicleDataResponse();

		/**
		 * The meta object literal for the '<em><b>Vehicle Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE_DATA_RESPONSE__VEHICLE_DATA = eINSTANCE.getVehicleDataResponse_VehicleData();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.PartialStopSequenceDataImpl <em>Partial Stop Sequence Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.PartialStopSequenceDataImpl
		 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.IbisCustomerInformationServicePackageImpl#getPartialStopSequenceData()
		 * @generated
		 */
		EClass PARTIAL_STOP_SEQUENCE_DATA = eINSTANCE.getPartialStopSequenceData();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_STOP_SEQUENCE_DATA__TIME_STAMP = eINSTANCE.getPartialStopSequenceData_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Stop Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_STOP_SEQUENCE_DATA__STOP_SEQUENCE = eINSTANCE.getPartialStopSequenceData_StopSequence();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.PartialStopSequenceRequestImpl <em>Partial Stop Sequence Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.PartialStopSequenceRequestImpl
		 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.IbisCustomerInformationServicePackageImpl#getPartialStopSequenceRequest()
		 * @generated
		 */
		EClass PARTIAL_STOP_SEQUENCE_REQUEST = eINSTANCE.getPartialStopSequenceRequest();

		/**
		 * The meta object literal for the '<em><b>Starting Stop Index</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_STOP_SEQUENCE_REQUEST__STARTING_STOP_INDEX = eINSTANCE.getPartialStopSequenceRequest_StartingStopIndex();

		/**
		 * The meta object literal for the '<em><b>Number Of Stop Points</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_STOP_SEQUENCE_REQUEST__NUMBER_OF_STOP_POINTS = eINSTANCE.getPartialStopSequenceRequest_NumberOfStopPoints();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.PartialStopSequenceResponseImpl <em>Partial Stop Sequence Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.PartialStopSequenceResponseImpl
		 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.IbisCustomerInformationServicePackageImpl#getPartialStopSequenceResponse()
		 * @generated
		 */
		EClass PARTIAL_STOP_SEQUENCE_RESPONSE = eINSTANCE.getPartialStopSequenceResponse();

		/**
		 * The meta object literal for the '<em><b>Partial Stop Sequence Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_STOP_SEQUENCE_RESPONSE__PARTIAL_STOP_SEQUENCE_DATA = eINSTANCE.getPartialStopSequenceResponse_PartialStopSequenceData();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.TripDataImpl <em>Trip Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.TripDataImpl
		 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.IbisCustomerInformationServicePackageImpl#getTripData()
		 * @generated
		 */
		EClass TRIP_DATA = eINSTANCE.getTripData();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_DATA__TIME_STAMP = eINSTANCE.getTripData_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Vehicle Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_DATA__VEHICLE_REF = eINSTANCE.getTripData_VehicleRef();

		/**
		 * The meta object literal for the '<em><b>Default Language</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_DATA__DEFAULT_LANGUAGE = eINSTANCE.getTripData_DefaultLanguage();

		/**
		 * The meta object literal for the '<em><b>Trip Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_DATA__TRIP_INFORMATION = eINSTANCE.getTripData_TripInformation();

		/**
		 * The meta object literal for the '<em><b>Current Stop Index</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_DATA__CURRENT_STOP_INDEX = eINSTANCE.getTripData_CurrentStopIndex();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.VehicleDataImpl <em>Vehicle Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.VehicleDataImpl
		 * @see de.jena.mdo.ibis.ibis_customerinformationservice.impl.IbisCustomerInformationServicePackageImpl#getVehicleData()
		 * @generated
		 */
		EClass VEHICLE_DATA = eINSTANCE.getVehicleData();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE_DATA__TIME_STAMP = eINSTANCE.getVehicleData_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Vehicle Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE_DATA__VEHICLE_REF = eINSTANCE.getVehicleData_VehicleRef();

		/**
		 * The meta object literal for the '<em><b>Route Deviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE_DATA__ROUTE_DEVIATION = eINSTANCE.getVehicleData_RouteDeviation();

		/**
		 * The meta object literal for the '<em><b>Door State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE_DATA__DOOR_STATE = eINSTANCE.getVehicleData_DoorState();

		/**
		 * The meta object literal for the '<em><b>In Panic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE_DATA__IN_PANIC = eINSTANCE.getVehicleData_InPanic();

		/**
		 * The meta object literal for the '<em><b>Vehicle Stop Requested</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE_DATA__VEHICLE_STOP_REQUESTED = eINSTANCE.getVehicleData_VehicleStopRequested();

		/**
		 * The meta object literal for the '<em><b>Exit Side</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE_DATA__EXIT_SIDE = eINSTANCE.getVehicleData_ExitSide();

		/**
		 * The meta object literal for the '<em><b>Moving Direction Forward</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE_DATA__MOVING_DIRECTION_FORWARD = eINSTANCE.getVehicleData_MovingDirectionForward();

		/**
		 * The meta object literal for the '<em><b>Vehicle Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE_DATA__VEHICLE_MODE = eINSTANCE.getVehicleData_VehicleMode();

		/**
		 * The meta object literal for the '<em><b>My Own Vehicle Mode</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE_DATA__MY_OWN_VEHICLE_MODE = eINSTANCE.getVehicleData_MyOwnVehicleMode();

		/**
		 * The meta object literal for the '<em><b>Speaker Active</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE_DATA__SPEAKER_ACTIVE = eINSTANCE.getVehicleData_SpeakerActive();

		/**
		 * The meta object literal for the '<em><b>Stop Information Active</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE_DATA__STOP_INFORMATION_ACTIVE = eINSTANCE.getVehicleData_StopInformationActive();

		/**
		 * The meta object literal for the '<em><b>Trip State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE_DATA__TRIP_STATE = eINSTANCE.getVehicleData_TripState();

	}

} //IbisCustomerInformationServicePackage
