/*
 */
package de.jena.mdo.ibis.customerinformationservice;

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
 * @see de.jena.mdo.ibis.customerinformationservice.IBISCustomerInformationServiceFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
@ProviderType
public interface IBISCustomerInformationServicePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "customerinformationservice";

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
	String eNS_PREFIX = "customerinformationservice";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IBISCustomerInformationServicePackage eINSTANCE = de.jena.mdo.ibis.customerinformationservice.impl.IBISCustomerInformationServicePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceAllDataImpl <em>Customer Information Service All Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceAllDataImpl
	 * @see de.jena.mdo.ibis.customerinformationservice.impl.IBISCustomerInformationServicePackageImpl#getCustomerInformationServiceAllData()
	 * @generated
	 */
	int CUSTOMER_INFORMATION_SERVICE_ALL_DATA = 0;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_ALL_DATA__TIME_STAMP = 0;

	/**
	 * The feature id for the '<em><b>Vehicle Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_ALL_DATA__VEHICLE_REF = 1;

	/**
	 * The feature id for the '<em><b>Default Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_ALL_DATA__DEFAULT_LANGUAGE = 2;

	/**
	 * The feature id for the '<em><b>Trip Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_ALL_DATA__TRIP_INFORMATION = 3;

	/**
	 * The feature id for the '<em><b>Current Stop Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_ALL_DATA__CURRENT_STOP_INDEX = 4;

	/**
	 * The feature id for the '<em><b>Route Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_ALL_DATA__ROUTE_DEVIATION = 5;

	/**
	 * The feature id for the '<em><b>Door State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_ALL_DATA__DOOR_STATE = 6;

	/**
	 * The feature id for the '<em><b>In Panic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_ALL_DATA__IN_PANIC = 7;

	/**
	 * The feature id for the '<em><b>Vehicle Stop Requested</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_ALL_DATA__VEHICLE_STOP_REQUESTED = 8;

	/**
	 * The feature id for the '<em><b>Exit Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_ALL_DATA__EXIT_SIDE = 9;

	/**
	 * The feature id for the '<em><b>Moving Direction Forward</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_ALL_DATA__MOVING_DIRECTION_FORWARD = 10;

	/**
	 * The feature id for the '<em><b>Vehicle Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_ALL_DATA__VEHICLE_MODE = 11;

	/**
	 * The feature id for the '<em><b>My Own Vehicle Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_ALL_DATA__MY_OWN_VEHICLE_MODE = 12;

	/**
	 * The feature id for the '<em><b>Speaker Active</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_ALL_DATA__SPEAKER_ACTIVE = 13;

	/**
	 * The feature id for the '<em><b>Stop Information Active</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_ALL_DATA__STOP_INFORMATION_ACTIVE = 14;

	/**
	 * The feature id for the '<em><b>Trip State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_ALL_DATA__TRIP_STATE = 15;

	/**
	 * The feature id for the '<em><b>Global Display Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_ALL_DATA__GLOBAL_DISPLAY_CONTENT = 16;

	/**
	 * The number of structural features of the '<em>Customer Information Service All Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_ALL_DATA_FEATURE_COUNT = 17;

	/**
	 * The number of operations of the '<em>Customer Information Service All Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_ALL_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceCurrentAnnouncementDataImpl <em>Customer Information Service Current Announcement Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceCurrentAnnouncementDataImpl
	 * @see de.jena.mdo.ibis.customerinformationservice.impl.IBISCustomerInformationServicePackageImpl#getCustomerInformationServiceCurrentAnnouncementData()
	 * @generated
	 */
	int CUSTOMER_INFORMATION_SERVICE_CURRENT_ANNOUNCEMENT_DATA = 1;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_CURRENT_ANNOUNCEMENT_DATA__TIME_STAMP = 0;

	/**
	 * The feature id for the '<em><b>Current Announcement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_CURRENT_ANNOUNCEMENT_DATA__CURRENT_ANNOUNCEMENT = 1;

	/**
	 * The number of structural features of the '<em>Customer Information Service Current Announcement Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_CURRENT_ANNOUNCEMENT_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Customer Information Service Current Announcement Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_CURRENT_ANNOUNCEMENT_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceCurrentConnectionInformationDataImpl <em>Customer Information Service Current Connection Information Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceCurrentConnectionInformationDataImpl
	 * @see de.jena.mdo.ibis.customerinformationservice.impl.IBISCustomerInformationServicePackageImpl#getCustomerInformationServiceCurrentConnectionInformationData()
	 * @generated
	 */
	int CUSTOMER_INFORMATION_SERVICE_CURRENT_CONNECTION_INFORMATION_DATA = 2;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_CURRENT_CONNECTION_INFORMATION_DATA__TIME_STAMP = 0;

	/**
	 * The feature id for the '<em><b>Current Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_CURRENT_CONNECTION_INFORMATION_DATA__CURRENT_CONNECTION = 1;

	/**
	 * The number of structural features of the '<em>Customer Information Service Current Connection Information Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_CURRENT_CONNECTION_INFORMATION_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Customer Information Service Current Connection Information Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_CURRENT_CONNECTION_INFORMATION_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceCurrentDisplayContentDataImpl <em>Customer Information Service Current Display Content Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceCurrentDisplayContentDataImpl
	 * @see de.jena.mdo.ibis.customerinformationservice.impl.IBISCustomerInformationServicePackageImpl#getCustomerInformationServiceCurrentDisplayContentData()
	 * @generated
	 */
	int CUSTOMER_INFORMATION_SERVICE_CURRENT_DISPLAY_CONTENT_DATA = 3;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_CURRENT_DISPLAY_CONTENT_DATA__TIME_STAMP = 0;

	/**
	 * The feature id for the '<em><b>Current Display Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_CURRENT_DISPLAY_CONTENT_DATA__CURRENT_DISPLAY_CONTENT = 1;

	/**
	 * The number of structural features of the '<em>Customer Information Service Current Display Content Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_CURRENT_DISPLAY_CONTENT_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Customer Information Service Current Display Content Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_CURRENT_DISPLAY_CONTENT_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceCurrentStopIndexDataImpl <em>Customer Information Service Current Stop Index Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceCurrentStopIndexDataImpl
	 * @see de.jena.mdo.ibis.customerinformationservice.impl.IBISCustomerInformationServicePackageImpl#getCustomerInformationServiceCurrentStopIndexData()
	 * @generated
	 */
	int CUSTOMER_INFORMATION_SERVICE_CURRENT_STOP_INDEX_DATA = 4;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_CURRENT_STOP_INDEX_DATA__TIME_STAMP = 0;

	/**
	 * The feature id for the '<em><b>Current Stop Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_CURRENT_STOP_INDEX_DATA__CURRENT_STOP_INDEX = 1;

	/**
	 * The number of structural features of the '<em>Customer Information Service Current Stop Index Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_CURRENT_STOP_INDEX_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Customer Information Service Current Stop Index Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_CURRENT_STOP_INDEX_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceCurrentStopPointDataImpl <em>Customer Information Service Current Stop Point Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceCurrentStopPointDataImpl
	 * @see de.jena.mdo.ibis.customerinformationservice.impl.IBISCustomerInformationServicePackageImpl#getCustomerInformationServiceCurrentStopPointData()
	 * @generated
	 */
	int CUSTOMER_INFORMATION_SERVICE_CURRENT_STOP_POINT_DATA = 5;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_CURRENT_STOP_POINT_DATA__TIME_STAMP = 0;

	/**
	 * The feature id for the '<em><b>Current Stop Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_CURRENT_STOP_POINT_DATA__CURRENT_STOP_POINT = 1;

	/**
	 * The number of structural features of the '<em>Customer Information Service Current Stop Point Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_CURRENT_STOP_POINT_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Customer Information Service Current Stop Point Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_CURRENT_STOP_POINT_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceGetAllDataResponseStructureImpl <em>Customer Information Service Get All Data Response Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceGetAllDataResponseStructureImpl
	 * @see de.jena.mdo.ibis.customerinformationservice.impl.IBISCustomerInformationServicePackageImpl#getCustomerInformationServiceGetAllDataResponseStructure()
	 * @generated
	 */
	int CUSTOMER_INFORMATION_SERVICE_GET_ALL_DATA_RESPONSE_STRUCTURE = 6;

	/**
	 * The feature id for the '<em><b>All Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_GET_ALL_DATA_RESPONSE_STRUCTURE__ALL_DATA = 0;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_GET_ALL_DATA_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE = 1;

	/**
	 * The number of structural features of the '<em>Customer Information Service Get All Data Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_GET_ALL_DATA_RESPONSE_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Customer Information Service Get All Data Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_GET_ALL_DATA_RESPONSE_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceGetCurrentAnnouncementResponseStructureImpl <em>Customer Information Service Get Current Announcement Response Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceGetCurrentAnnouncementResponseStructureImpl
	 * @see de.jena.mdo.ibis.customerinformationservice.impl.IBISCustomerInformationServicePackageImpl#getCustomerInformationServiceGetCurrentAnnouncementResponseStructure()
	 * @generated
	 */
	int CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_ANNOUNCEMENT_RESPONSE_STRUCTURE = 7;

	/**
	 * The feature id for the '<em><b>Current Announcement Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_ANNOUNCEMENT_RESPONSE_STRUCTURE__CURRENT_ANNOUNCEMENT_DATA = 0;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_ANNOUNCEMENT_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE = 1;

	/**
	 * The number of structural features of the '<em>Customer Information Service Get Current Announcement Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_ANNOUNCEMENT_RESPONSE_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Customer Information Service Get Current Announcement Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_ANNOUNCEMENT_RESPONSE_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceGetCurrentConnectionInformationResponseStructureImpl <em>Customer Information Service Get Current Connection Information Response Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceGetCurrentConnectionInformationResponseStructureImpl
	 * @see de.jena.mdo.ibis.customerinformationservice.impl.IBISCustomerInformationServicePackageImpl#getCustomerInformationServiceGetCurrentConnectionInformationResponseStructure()
	 * @generated
	 */
	int CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_CONNECTION_INFORMATION_RESPONSE_STRUCTURE = 8;

	/**
	 * The feature id for the '<em><b>Current Connection Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_CONNECTION_INFORMATION_RESPONSE_STRUCTURE__CURRENT_CONNECTION_DATA = 0;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_CONNECTION_INFORMATION_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE = 1;

	/**
	 * The number of structural features of the '<em>Customer Information Service Get Current Connection Information Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_CONNECTION_INFORMATION_RESPONSE_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Customer Information Service Get Current Connection Information Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_CONNECTION_INFORMATION_RESPONSE_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceGetCurrentDisplayContentResponseStructureImpl <em>Customer Information Service Get Current Display Content Response Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceGetCurrentDisplayContentResponseStructureImpl
	 * @see de.jena.mdo.ibis.customerinformationservice.impl.IBISCustomerInformationServicePackageImpl#getCustomerInformationServiceGetCurrentDisplayContentResponseStructure()
	 * @generated
	 */
	int CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_DISPLAY_CONTENT_RESPONSE_STRUCTURE = 9;

	/**
	 * The feature id for the '<em><b>Current Display Content Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_DISPLAY_CONTENT_RESPONSE_STRUCTURE__CURRENT_DISPLAY_CONTENT_DATA = 0;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_DISPLAY_CONTENT_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE = 1;

	/**
	 * The number of structural features of the '<em>Customer Information Service Get Current Display Content Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_DISPLAY_CONTENT_RESPONSE_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Customer Information Service Get Current Display Content Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_DISPLAY_CONTENT_RESPONSE_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceGetCurrentStopIndexResponseStructureImpl <em>Customer Information Service Get Current Stop Index Response Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceGetCurrentStopIndexResponseStructureImpl
	 * @see de.jena.mdo.ibis.customerinformationservice.impl.IBISCustomerInformationServicePackageImpl#getCustomerInformationServiceGetCurrentStopIndexResponseStructure()
	 * @generated
	 */
	int CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_STOP_INDEX_RESPONSE_STRUCTURE = 10;

	/**
	 * The feature id for the '<em><b>Current Stop Index Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_STOP_INDEX_RESPONSE_STRUCTURE__CURRENT_STOP_INDEX_DATA = 0;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_STOP_INDEX_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE = 1;

	/**
	 * The number of structural features of the '<em>Customer Information Service Get Current Stop Index Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_STOP_INDEX_RESPONSE_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Customer Information Service Get Current Stop Index Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_STOP_INDEX_RESPONSE_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceGetCurrentStopPointResponseStructureImpl <em>Customer Information Service Get Current Stop Point Response Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceGetCurrentStopPointResponseStructureImpl
	 * @see de.jena.mdo.ibis.customerinformationservice.impl.IBISCustomerInformationServicePackageImpl#getCustomerInformationServiceGetCurrentStopPointResponseStructure()
	 * @generated
	 */
	int CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_STOP_POINT_RESPONSE_STRUCTURE = 11;

	/**
	 * The feature id for the '<em><b>Current Stop Point Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_STOP_POINT_RESPONSE_STRUCTURE__CURRENT_STOP_POINT_DATA = 0;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_STOP_POINT_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE = 1;

	/**
	 * The number of structural features of the '<em>Customer Information Service Get Current Stop Point Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_STOP_POINT_RESPONSE_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Customer Information Service Get Current Stop Point Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_STOP_POINT_RESPONSE_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceGetTripDataResponseStructureImpl <em>Customer Information Service Get Trip Data Response Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceGetTripDataResponseStructureImpl
	 * @see de.jena.mdo.ibis.customerinformationservice.impl.IBISCustomerInformationServicePackageImpl#getCustomerInformationServiceGetTripDataResponseStructure()
	 * @generated
	 */
	int CUSTOMER_INFORMATION_SERVICE_GET_TRIP_DATA_RESPONSE_STRUCTURE = 12;

	/**
	 * The feature id for the '<em><b>Trip Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_GET_TRIP_DATA_RESPONSE_STRUCTURE__TRIP_DATA = 0;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_GET_TRIP_DATA_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE = 1;

	/**
	 * The number of structural features of the '<em>Customer Information Service Get Trip Data Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_GET_TRIP_DATA_RESPONSE_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Customer Information Service Get Trip Data Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_GET_TRIP_DATA_RESPONSE_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceGetVehicleDataResponseStructureImpl <em>Customer Information Service Get Vehicle Data Response Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceGetVehicleDataResponseStructureImpl
	 * @see de.jena.mdo.ibis.customerinformationservice.impl.IBISCustomerInformationServicePackageImpl#getCustomerInformationServiceGetVehicleDataResponseStructure()
	 * @generated
	 */
	int CUSTOMER_INFORMATION_SERVICE_GET_VEHICLE_DATA_RESPONSE_STRUCTURE = 13;

	/**
	 * The feature id for the '<em><b>Vehicle Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_GET_VEHICLE_DATA_RESPONSE_STRUCTURE__VEHICLE_DATA = 0;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_GET_VEHICLE_DATA_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE = 1;

	/**
	 * The number of structural features of the '<em>Customer Information Service Get Vehicle Data Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_GET_VEHICLE_DATA_RESPONSE_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Customer Information Service Get Vehicle Data Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_GET_VEHICLE_DATA_RESPONSE_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServicePartialStopSequenceDataImpl <em>Customer Information Service Partial Stop Sequence Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServicePartialStopSequenceDataImpl
	 * @see de.jena.mdo.ibis.customerinformationservice.impl.IBISCustomerInformationServicePackageImpl#getCustomerInformationServicePartialStopSequenceData()
	 * @generated
	 */
	int CUSTOMER_INFORMATION_SERVICE_PARTIAL_STOP_SEQUENCE_DATA = 14;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_PARTIAL_STOP_SEQUENCE_DATA__TIME_STAMP = 0;

	/**
	 * The feature id for the '<em><b>Stop Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_PARTIAL_STOP_SEQUENCE_DATA__STOP_SEQUENCE = 1;

	/**
	 * The number of structural features of the '<em>Customer Information Service Partial Stop Sequence Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_PARTIAL_STOP_SEQUENCE_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Customer Information Service Partial Stop Sequence Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_PARTIAL_STOP_SEQUENCE_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceRetrievePartialStopSequenceRequestStructureImpl <em>Customer Information Service Retrieve Partial Stop Sequence Request Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceRetrievePartialStopSequenceRequestStructureImpl
	 * @see de.jena.mdo.ibis.customerinformationservice.impl.IBISCustomerInformationServicePackageImpl#getCustomerInformationServiceRetrievePartialStopSequenceRequestStructure()
	 * @generated
	 */
	int CUSTOMER_INFORMATION_SERVICE_RETRIEVE_PARTIAL_STOP_SEQUENCE_REQUEST_STRUCTURE = 15;

	/**
	 * The feature id for the '<em><b>Starting Stop Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_RETRIEVE_PARTIAL_STOP_SEQUENCE_REQUEST_STRUCTURE__STARTING_STOP_INDEX = 0;

	/**
	 * The feature id for the '<em><b>Number Of Stop Points</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_RETRIEVE_PARTIAL_STOP_SEQUENCE_REQUEST_STRUCTURE__NUMBER_OF_STOP_POINTS = 1;

	/**
	 * The number of structural features of the '<em>Customer Information Service Retrieve Partial Stop Sequence Request Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_RETRIEVE_PARTIAL_STOP_SEQUENCE_REQUEST_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Customer Information Service Retrieve Partial Stop Sequence Request Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_RETRIEVE_PARTIAL_STOP_SEQUENCE_REQUEST_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceRetrievePartialStopSequenceResponseStructureImpl <em>Customer Information Service Retrieve Partial Stop Sequence Response Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceRetrievePartialStopSequenceResponseStructureImpl
	 * @see de.jena.mdo.ibis.customerinformationservice.impl.IBISCustomerInformationServicePackageImpl#getCustomerInformationServiceRetrievePartialStopSequenceResponseStructure()
	 * @generated
	 */
	int CUSTOMER_INFORMATION_SERVICE_RETRIEVE_PARTIAL_STOP_SEQUENCE_RESPONSE_STRUCTURE = 16;

	/**
	 * The feature id for the '<em><b>Partial Stop Sequence Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_RETRIEVE_PARTIAL_STOP_SEQUENCE_RESPONSE_STRUCTURE__PARTIAL_STOP_SEQUENCE_DATA = 0;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_RETRIEVE_PARTIAL_STOP_SEQUENCE_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE = 1;

	/**
	 * The number of structural features of the '<em>Customer Information Service Retrieve Partial Stop Sequence Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_RETRIEVE_PARTIAL_STOP_SEQUENCE_RESPONSE_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Customer Information Service Retrieve Partial Stop Sequence Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_RETRIEVE_PARTIAL_STOP_SEQUENCE_RESPONSE_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceTripDataImpl <em>Customer Information Service Trip Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceTripDataImpl
	 * @see de.jena.mdo.ibis.customerinformationservice.impl.IBISCustomerInformationServicePackageImpl#getCustomerInformationServiceTripData()
	 * @generated
	 */
	int CUSTOMER_INFORMATION_SERVICE_TRIP_DATA = 17;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__TIME_STAMP = 0;

	/**
	 * The feature id for the '<em><b>Vehicle Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__VEHICLE_REF = 1;

	/**
	 * The feature id for the '<em><b>Default Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__DEFAULT_LANGUAGE = 2;

	/**
	 * The feature id for the '<em><b>Trip Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__TRIP_INFORMATION = 3;

	/**
	 * The feature id for the '<em><b>Current Stop Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__CURRENT_STOP_INDEX = 4;

	/**
	 * The number of structural features of the '<em>Customer Information Service Trip Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_TRIP_DATA_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Customer Information Service Trip Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_TRIP_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceVehicleDataImpl <em>Customer Information Service Vehicle Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceVehicleDataImpl
	 * @see de.jena.mdo.ibis.customerinformationservice.impl.IBISCustomerInformationServicePackageImpl#getCustomerInformationServiceVehicleData()
	 * @generated
	 */
	int CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA = 18;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__TIME_STAMP = 0;

	/**
	 * The feature id for the '<em><b>Vehicle Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__VEHICLE_REF = 1;

	/**
	 * The feature id for the '<em><b>Route Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__ROUTE_DEVIATION = 2;

	/**
	 * The feature id for the '<em><b>Door State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__DOOR_STATE = 3;

	/**
	 * The feature id for the '<em><b>In Panic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__IN_PANIC = 4;

	/**
	 * The feature id for the '<em><b>Vehicle Stop Requested</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__VEHICLE_STOP_REQUESTED = 5;

	/**
	 * The feature id for the '<em><b>Exit Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__EXIT_SIDE = 6;

	/**
	 * The feature id for the '<em><b>Moving Direction Forward</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__MOVING_DIRECTION_FORWARD = 7;

	/**
	 * The feature id for the '<em><b>Vehicle Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__VEHICLE_MODE = 8;

	/**
	 * The feature id for the '<em><b>My Own Vehicle Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__MY_OWN_VEHICLE_MODE = 9;

	/**
	 * The feature id for the '<em><b>Speaker Active</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__SPEAKER_ACTIVE = 10;

	/**
	 * The feature id for the '<em><b>Stop Information Active</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__STOP_INFORMATION_ACTIVE = 11;

	/**
	 * The feature id for the '<em><b>Trip State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__TRIP_STATE = 12;

	/**
	 * The number of structural features of the '<em>Customer Information Service Vehicle Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Customer Information Service Vehicle Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceAllData <em>Customer Information Service All Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Information Service All Data</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceAllData
	 * @generated
	 */
	EClass getCustomerInformationServiceAllData();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceAllData#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Stamp</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceAllData#getTimeStamp()
	 * @see #getCustomerInformationServiceAllData()
	 * @generated
	 */
	EReference getCustomerInformationServiceAllData_TimeStamp();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceAllData#getVehicleRef <em>Vehicle Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vehicle Ref</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceAllData#getVehicleRef()
	 * @see #getCustomerInformationServiceAllData()
	 * @generated
	 */
	EReference getCustomerInformationServiceAllData_VehicleRef();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceAllData#getDefaultLanguage <em>Default Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Language</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceAllData#getDefaultLanguage()
	 * @see #getCustomerInformationServiceAllData()
	 * @generated
	 */
	EReference getCustomerInformationServiceAllData_DefaultLanguage();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceAllData#getTripInformation <em>Trip Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trip Information</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceAllData#getTripInformation()
	 * @see #getCustomerInformationServiceAllData()
	 * @generated
	 */
	EReference getCustomerInformationServiceAllData_TripInformation();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceAllData#getCurrentStopIndex <em>Current Stop Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Current Stop Index</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceAllData#getCurrentStopIndex()
	 * @see #getCustomerInformationServiceAllData()
	 * @generated
	 */
	EReference getCustomerInformationServiceAllData_CurrentStopIndex();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceAllData#getRouteDeviation <em>Route Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Route Deviation</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceAllData#getRouteDeviation()
	 * @see #getCustomerInformationServiceAllData()
	 * @generated
	 */
	EAttribute getCustomerInformationServiceAllData_RouteDeviation();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceAllData#getDoorState <em>Door State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Door State</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceAllData#getDoorState()
	 * @see #getCustomerInformationServiceAllData()
	 * @generated
	 */
	EAttribute getCustomerInformationServiceAllData_DoorState();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceAllData#getInPanic <em>In Panic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>In Panic</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceAllData#getInPanic()
	 * @see #getCustomerInformationServiceAllData()
	 * @generated
	 */
	EReference getCustomerInformationServiceAllData_InPanic();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceAllData#getVehicleStopRequested <em>Vehicle Stop Requested</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vehicle Stop Requested</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceAllData#getVehicleStopRequested()
	 * @see #getCustomerInformationServiceAllData()
	 * @generated
	 */
	EReference getCustomerInformationServiceAllData_VehicleStopRequested();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceAllData#getExitSide <em>Exit Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exit Side</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceAllData#getExitSide()
	 * @see #getCustomerInformationServiceAllData()
	 * @generated
	 */
	EAttribute getCustomerInformationServiceAllData_ExitSide();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceAllData#getMovingDirectionForward <em>Moving Direction Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Moving Direction Forward</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceAllData#getMovingDirectionForward()
	 * @see #getCustomerInformationServiceAllData()
	 * @generated
	 */
	EReference getCustomerInformationServiceAllData_MovingDirectionForward();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceAllData#getVehicleMode <em>Vehicle Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vehicle Mode</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceAllData#getVehicleMode()
	 * @see #getCustomerInformationServiceAllData()
	 * @generated
	 */
	EAttribute getCustomerInformationServiceAllData_VehicleMode();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceAllData#getMyOwnVehicleMode <em>My Own Vehicle Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>My Own Vehicle Mode</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceAllData#getMyOwnVehicleMode()
	 * @see #getCustomerInformationServiceAllData()
	 * @generated
	 */
	EReference getCustomerInformationServiceAllData_MyOwnVehicleMode();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceAllData#getSpeakerActive <em>Speaker Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Speaker Active</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceAllData#getSpeakerActive()
	 * @see #getCustomerInformationServiceAllData()
	 * @generated
	 */
	EReference getCustomerInformationServiceAllData_SpeakerActive();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceAllData#getStopInformationActive <em>Stop Information Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stop Information Active</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceAllData#getStopInformationActive()
	 * @see #getCustomerInformationServiceAllData()
	 * @generated
	 */
	EReference getCustomerInformationServiceAllData_StopInformationActive();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceAllData#getTripState <em>Trip State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trip State</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceAllData#getTripState()
	 * @see #getCustomerInformationServiceAllData()
	 * @generated
	 */
	EAttribute getCustomerInformationServiceAllData_TripState();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceAllData#getGlobalDisplayContent <em>Global Display Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Display Content</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceAllData#getGlobalDisplayContent()
	 * @see #getCustomerInformationServiceAllData()
	 * @generated
	 */
	EReference getCustomerInformationServiceAllData_GlobalDisplayContent();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentAnnouncementData <em>Customer Information Service Current Announcement Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Information Service Current Announcement Data</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentAnnouncementData
	 * @generated
	 */
	EClass getCustomerInformationServiceCurrentAnnouncementData();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentAnnouncementData#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Stamp</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentAnnouncementData#getTimeStamp()
	 * @see #getCustomerInformationServiceCurrentAnnouncementData()
	 * @generated
	 */
	EReference getCustomerInformationServiceCurrentAnnouncementData_TimeStamp();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentAnnouncementData#getCurrentAnnouncement <em>Current Announcement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Current Announcement</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentAnnouncementData#getCurrentAnnouncement()
	 * @see #getCustomerInformationServiceCurrentAnnouncementData()
	 * @generated
	 */
	EReference getCustomerInformationServiceCurrentAnnouncementData_CurrentAnnouncement();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentConnectionInformationData <em>Customer Information Service Current Connection Information Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Information Service Current Connection Information Data</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentConnectionInformationData
	 * @generated
	 */
	EClass getCustomerInformationServiceCurrentConnectionInformationData();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentConnectionInformationData#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Stamp</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentConnectionInformationData#getTimeStamp()
	 * @see #getCustomerInformationServiceCurrentConnectionInformationData()
	 * @generated
	 */
	EReference getCustomerInformationServiceCurrentConnectionInformationData_TimeStamp();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentConnectionInformationData#getCurrentConnection <em>Current Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Current Connection</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentConnectionInformationData#getCurrentConnection()
	 * @see #getCustomerInformationServiceCurrentConnectionInformationData()
	 * @generated
	 */
	EReference getCustomerInformationServiceCurrentConnectionInformationData_CurrentConnection();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentDisplayContentData <em>Customer Information Service Current Display Content Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Information Service Current Display Content Data</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentDisplayContentData
	 * @generated
	 */
	EClass getCustomerInformationServiceCurrentDisplayContentData();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentDisplayContentData#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Stamp</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentDisplayContentData#getTimeStamp()
	 * @see #getCustomerInformationServiceCurrentDisplayContentData()
	 * @generated
	 */
	EReference getCustomerInformationServiceCurrentDisplayContentData_TimeStamp();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentDisplayContentData#getCurrentDisplayContent <em>Current Display Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Current Display Content</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentDisplayContentData#getCurrentDisplayContent()
	 * @see #getCustomerInformationServiceCurrentDisplayContentData()
	 * @generated
	 */
	EReference getCustomerInformationServiceCurrentDisplayContentData_CurrentDisplayContent();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentStopIndexData <em>Customer Information Service Current Stop Index Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Information Service Current Stop Index Data</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentStopIndexData
	 * @generated
	 */
	EClass getCustomerInformationServiceCurrentStopIndexData();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentStopIndexData#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Stamp</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentStopIndexData#getTimeStamp()
	 * @see #getCustomerInformationServiceCurrentStopIndexData()
	 * @generated
	 */
	EReference getCustomerInformationServiceCurrentStopIndexData_TimeStamp();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentStopIndexData#getCurrentStopIndex <em>Current Stop Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Current Stop Index</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentStopIndexData#getCurrentStopIndex()
	 * @see #getCustomerInformationServiceCurrentStopIndexData()
	 * @generated
	 */
	EReference getCustomerInformationServiceCurrentStopIndexData_CurrentStopIndex();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentStopPointData <em>Customer Information Service Current Stop Point Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Information Service Current Stop Point Data</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentStopPointData
	 * @generated
	 */
	EClass getCustomerInformationServiceCurrentStopPointData();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentStopPointData#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Stamp</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentStopPointData#getTimeStamp()
	 * @see #getCustomerInformationServiceCurrentStopPointData()
	 * @generated
	 */
	EReference getCustomerInformationServiceCurrentStopPointData_TimeStamp();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentStopPointData#getCurrentStopPoint <em>Current Stop Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Current Stop Point</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentStopPointData#getCurrentStopPoint()
	 * @see #getCustomerInformationServiceCurrentStopPointData()
	 * @generated
	 */
	EReference getCustomerInformationServiceCurrentStopPointData_CurrentStopPoint();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetAllDataResponseStructure <em>Customer Information Service Get All Data Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Information Service Get All Data Response Structure</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetAllDataResponseStructure
	 * @generated
	 */
	EClass getCustomerInformationServiceGetAllDataResponseStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetAllDataResponseStructure#getAllData <em>All Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All Data</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetAllDataResponseStructure#getAllData()
	 * @see #getCustomerInformationServiceGetAllDataResponseStructure()
	 * @generated
	 */
	EReference getCustomerInformationServiceGetAllDataResponseStructure_AllData();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetAllDataResponseStructure#getOperationErrorMessage <em>Operation Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation Error Message</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetAllDataResponseStructure#getOperationErrorMessage()
	 * @see #getCustomerInformationServiceGetAllDataResponseStructure()
	 * @generated
	 */
	EReference getCustomerInformationServiceGetAllDataResponseStructure_OperationErrorMessage();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentAnnouncementResponseStructure <em>Customer Information Service Get Current Announcement Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Information Service Get Current Announcement Response Structure</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentAnnouncementResponseStructure
	 * @generated
	 */
	EClass getCustomerInformationServiceGetCurrentAnnouncementResponseStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentAnnouncementResponseStructure#getCurrentAnnouncementData <em>Current Announcement Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Current Announcement Data</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentAnnouncementResponseStructure#getCurrentAnnouncementData()
	 * @see #getCustomerInformationServiceGetCurrentAnnouncementResponseStructure()
	 * @generated
	 */
	EReference getCustomerInformationServiceGetCurrentAnnouncementResponseStructure_CurrentAnnouncementData();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentAnnouncementResponseStructure#getOperationErrorMessage <em>Operation Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation Error Message</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentAnnouncementResponseStructure#getOperationErrorMessage()
	 * @see #getCustomerInformationServiceGetCurrentAnnouncementResponseStructure()
	 * @generated
	 */
	EReference getCustomerInformationServiceGetCurrentAnnouncementResponseStructure_OperationErrorMessage();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentConnectionInformationResponseStructure <em>Customer Information Service Get Current Connection Information Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Information Service Get Current Connection Information Response Structure</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentConnectionInformationResponseStructure
	 * @generated
	 */
	EClass getCustomerInformationServiceGetCurrentConnectionInformationResponseStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentConnectionInformationResponseStructure#getCurrentConnectionData <em>Current Connection Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Current Connection Data</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentConnectionInformationResponseStructure#getCurrentConnectionData()
	 * @see #getCustomerInformationServiceGetCurrentConnectionInformationResponseStructure()
	 * @generated
	 */
	EReference getCustomerInformationServiceGetCurrentConnectionInformationResponseStructure_CurrentConnectionData();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentConnectionInformationResponseStructure#getOperationErrorMessage <em>Operation Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation Error Message</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentConnectionInformationResponseStructure#getOperationErrorMessage()
	 * @see #getCustomerInformationServiceGetCurrentConnectionInformationResponseStructure()
	 * @generated
	 */
	EReference getCustomerInformationServiceGetCurrentConnectionInformationResponseStructure_OperationErrorMessage();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentDisplayContentResponseStructure <em>Customer Information Service Get Current Display Content Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Information Service Get Current Display Content Response Structure</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentDisplayContentResponseStructure
	 * @generated
	 */
	EClass getCustomerInformationServiceGetCurrentDisplayContentResponseStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentDisplayContentResponseStructure#getCurrentDisplayContentData <em>Current Display Content Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Current Display Content Data</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentDisplayContentResponseStructure#getCurrentDisplayContentData()
	 * @see #getCustomerInformationServiceGetCurrentDisplayContentResponseStructure()
	 * @generated
	 */
	EReference getCustomerInformationServiceGetCurrentDisplayContentResponseStructure_CurrentDisplayContentData();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentDisplayContentResponseStructure#getOperationErrorMessage <em>Operation Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation Error Message</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentDisplayContentResponseStructure#getOperationErrorMessage()
	 * @see #getCustomerInformationServiceGetCurrentDisplayContentResponseStructure()
	 * @generated
	 */
	EReference getCustomerInformationServiceGetCurrentDisplayContentResponseStructure_OperationErrorMessage();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentStopIndexResponseStructure <em>Customer Information Service Get Current Stop Index Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Information Service Get Current Stop Index Response Structure</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentStopIndexResponseStructure
	 * @generated
	 */
	EClass getCustomerInformationServiceGetCurrentStopIndexResponseStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentStopIndexResponseStructure#getCurrentStopIndexData <em>Current Stop Index Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Current Stop Index Data</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentStopIndexResponseStructure#getCurrentStopIndexData()
	 * @see #getCustomerInformationServiceGetCurrentStopIndexResponseStructure()
	 * @generated
	 */
	EReference getCustomerInformationServiceGetCurrentStopIndexResponseStructure_CurrentStopIndexData();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentStopIndexResponseStructure#getOperationErrorMessage <em>Operation Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation Error Message</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentStopIndexResponseStructure#getOperationErrorMessage()
	 * @see #getCustomerInformationServiceGetCurrentStopIndexResponseStructure()
	 * @generated
	 */
	EReference getCustomerInformationServiceGetCurrentStopIndexResponseStructure_OperationErrorMessage();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentStopPointResponseStructure <em>Customer Information Service Get Current Stop Point Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Information Service Get Current Stop Point Response Structure</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentStopPointResponseStructure
	 * @generated
	 */
	EClass getCustomerInformationServiceGetCurrentStopPointResponseStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentStopPointResponseStructure#getCurrentStopPointData <em>Current Stop Point Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Current Stop Point Data</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentStopPointResponseStructure#getCurrentStopPointData()
	 * @see #getCustomerInformationServiceGetCurrentStopPointResponseStructure()
	 * @generated
	 */
	EReference getCustomerInformationServiceGetCurrentStopPointResponseStructure_CurrentStopPointData();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentStopPointResponseStructure#getOperationErrorMessage <em>Operation Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation Error Message</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentStopPointResponseStructure#getOperationErrorMessage()
	 * @see #getCustomerInformationServiceGetCurrentStopPointResponseStructure()
	 * @generated
	 */
	EReference getCustomerInformationServiceGetCurrentStopPointResponseStructure_OperationErrorMessage();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetTripDataResponseStructure <em>Customer Information Service Get Trip Data Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Information Service Get Trip Data Response Structure</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetTripDataResponseStructure
	 * @generated
	 */
	EClass getCustomerInformationServiceGetTripDataResponseStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetTripDataResponseStructure#getTripData <em>Trip Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trip Data</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetTripDataResponseStructure#getTripData()
	 * @see #getCustomerInformationServiceGetTripDataResponseStructure()
	 * @generated
	 */
	EReference getCustomerInformationServiceGetTripDataResponseStructure_TripData();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetTripDataResponseStructure#getOperationErrorMessage <em>Operation Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation Error Message</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetTripDataResponseStructure#getOperationErrorMessage()
	 * @see #getCustomerInformationServiceGetTripDataResponseStructure()
	 * @generated
	 */
	EReference getCustomerInformationServiceGetTripDataResponseStructure_OperationErrorMessage();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetVehicleDataResponseStructure <em>Customer Information Service Get Vehicle Data Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Information Service Get Vehicle Data Response Structure</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetVehicleDataResponseStructure
	 * @generated
	 */
	EClass getCustomerInformationServiceGetVehicleDataResponseStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetVehicleDataResponseStructure#getVehicleData <em>Vehicle Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vehicle Data</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetVehicleDataResponseStructure#getVehicleData()
	 * @see #getCustomerInformationServiceGetVehicleDataResponseStructure()
	 * @generated
	 */
	EReference getCustomerInformationServiceGetVehicleDataResponseStructure_VehicleData();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetVehicleDataResponseStructure#getOperationErrorMessage <em>Operation Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation Error Message</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetVehicleDataResponseStructure#getOperationErrorMessage()
	 * @see #getCustomerInformationServiceGetVehicleDataResponseStructure()
	 * @generated
	 */
	EReference getCustomerInformationServiceGetVehicleDataResponseStructure_OperationErrorMessage();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServicePartialStopSequenceData <em>Customer Information Service Partial Stop Sequence Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Information Service Partial Stop Sequence Data</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServicePartialStopSequenceData
	 * @generated
	 */
	EClass getCustomerInformationServicePartialStopSequenceData();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServicePartialStopSequenceData#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Stamp</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServicePartialStopSequenceData#getTimeStamp()
	 * @see #getCustomerInformationServicePartialStopSequenceData()
	 * @generated
	 */
	EReference getCustomerInformationServicePartialStopSequenceData_TimeStamp();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServicePartialStopSequenceData#getStopSequence <em>Stop Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stop Sequence</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServicePartialStopSequenceData#getStopSequence()
	 * @see #getCustomerInformationServicePartialStopSequenceData()
	 * @generated
	 */
	EReference getCustomerInformationServicePartialStopSequenceData_StopSequence();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceRetrievePartialStopSequenceRequestStructure <em>Customer Information Service Retrieve Partial Stop Sequence Request Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Information Service Retrieve Partial Stop Sequence Request Structure</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceRetrievePartialStopSequenceRequestStructure
	 * @generated
	 */
	EClass getCustomerInformationServiceRetrievePartialStopSequenceRequestStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceRetrievePartialStopSequenceRequestStructure#getStartingStopIndex <em>Starting Stop Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Starting Stop Index</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceRetrievePartialStopSequenceRequestStructure#getStartingStopIndex()
	 * @see #getCustomerInformationServiceRetrievePartialStopSequenceRequestStructure()
	 * @generated
	 */
	EReference getCustomerInformationServiceRetrievePartialStopSequenceRequestStructure_StartingStopIndex();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceRetrievePartialStopSequenceRequestStructure#getNumberOfStopPoints <em>Number Of Stop Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Number Of Stop Points</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceRetrievePartialStopSequenceRequestStructure#getNumberOfStopPoints()
	 * @see #getCustomerInformationServiceRetrievePartialStopSequenceRequestStructure()
	 * @generated
	 */
	EReference getCustomerInformationServiceRetrievePartialStopSequenceRequestStructure_NumberOfStopPoints();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceRetrievePartialStopSequenceResponseStructure <em>Customer Information Service Retrieve Partial Stop Sequence Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Information Service Retrieve Partial Stop Sequence Response Structure</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceRetrievePartialStopSequenceResponseStructure
	 * @generated
	 */
	EClass getCustomerInformationServiceRetrievePartialStopSequenceResponseStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceRetrievePartialStopSequenceResponseStructure#getPartialStopSequenceData <em>Partial Stop Sequence Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Partial Stop Sequence Data</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceRetrievePartialStopSequenceResponseStructure#getPartialStopSequenceData()
	 * @see #getCustomerInformationServiceRetrievePartialStopSequenceResponseStructure()
	 * @generated
	 */
	EReference getCustomerInformationServiceRetrievePartialStopSequenceResponseStructure_PartialStopSequenceData();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceRetrievePartialStopSequenceResponseStructure#getOperationErrorMessage <em>Operation Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation Error Message</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceRetrievePartialStopSequenceResponseStructure#getOperationErrorMessage()
	 * @see #getCustomerInformationServiceRetrievePartialStopSequenceResponseStructure()
	 * @generated
	 */
	EReference getCustomerInformationServiceRetrievePartialStopSequenceResponseStructure_OperationErrorMessage();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceTripData <em>Customer Information Service Trip Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Information Service Trip Data</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceTripData
	 * @generated
	 */
	EClass getCustomerInformationServiceTripData();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceTripData#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Stamp</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceTripData#getTimeStamp()
	 * @see #getCustomerInformationServiceTripData()
	 * @generated
	 */
	EReference getCustomerInformationServiceTripData_TimeStamp();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceTripData#getVehicleRef <em>Vehicle Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vehicle Ref</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceTripData#getVehicleRef()
	 * @see #getCustomerInformationServiceTripData()
	 * @generated
	 */
	EReference getCustomerInformationServiceTripData_VehicleRef();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceTripData#getDefaultLanguage <em>Default Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Language</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceTripData#getDefaultLanguage()
	 * @see #getCustomerInformationServiceTripData()
	 * @generated
	 */
	EReference getCustomerInformationServiceTripData_DefaultLanguage();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceTripData#getTripInformation <em>Trip Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trip Information</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceTripData#getTripInformation()
	 * @see #getCustomerInformationServiceTripData()
	 * @generated
	 */
	EReference getCustomerInformationServiceTripData_TripInformation();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceTripData#getCurrentStopIndex <em>Current Stop Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Current Stop Index</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceTripData#getCurrentStopIndex()
	 * @see #getCustomerInformationServiceTripData()
	 * @generated
	 */
	EReference getCustomerInformationServiceTripData_CurrentStopIndex();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceVehicleData <em>Customer Information Service Vehicle Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Information Service Vehicle Data</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceVehicleData
	 * @generated
	 */
	EClass getCustomerInformationServiceVehicleData();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceVehicleData#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Stamp</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceVehicleData#getTimeStamp()
	 * @see #getCustomerInformationServiceVehicleData()
	 * @generated
	 */
	EReference getCustomerInformationServiceVehicleData_TimeStamp();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceVehicleData#getVehicleRef <em>Vehicle Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vehicle Ref</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceVehicleData#getVehicleRef()
	 * @see #getCustomerInformationServiceVehicleData()
	 * @generated
	 */
	EReference getCustomerInformationServiceVehicleData_VehicleRef();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceVehicleData#getRouteDeviation <em>Route Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Route Deviation</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceVehicleData#getRouteDeviation()
	 * @see #getCustomerInformationServiceVehicleData()
	 * @generated
	 */
	EAttribute getCustomerInformationServiceVehicleData_RouteDeviation();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceVehicleData#getDoorState <em>Door State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Door State</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceVehicleData#getDoorState()
	 * @see #getCustomerInformationServiceVehicleData()
	 * @generated
	 */
	EAttribute getCustomerInformationServiceVehicleData_DoorState();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceVehicleData#getInPanic <em>In Panic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>In Panic</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceVehicleData#getInPanic()
	 * @see #getCustomerInformationServiceVehicleData()
	 * @generated
	 */
	EReference getCustomerInformationServiceVehicleData_InPanic();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceVehicleData#getVehicleStopRequested <em>Vehicle Stop Requested</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vehicle Stop Requested</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceVehicleData#getVehicleStopRequested()
	 * @see #getCustomerInformationServiceVehicleData()
	 * @generated
	 */
	EReference getCustomerInformationServiceVehicleData_VehicleStopRequested();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceVehicleData#getExitSide <em>Exit Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exit Side</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceVehicleData#getExitSide()
	 * @see #getCustomerInformationServiceVehicleData()
	 * @generated
	 */
	EAttribute getCustomerInformationServiceVehicleData_ExitSide();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceVehicleData#getMovingDirectionForward <em>Moving Direction Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Moving Direction Forward</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceVehicleData#getMovingDirectionForward()
	 * @see #getCustomerInformationServiceVehicleData()
	 * @generated
	 */
	EReference getCustomerInformationServiceVehicleData_MovingDirectionForward();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceVehicleData#getVehicleMode <em>Vehicle Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vehicle Mode</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceVehicleData#getVehicleMode()
	 * @see #getCustomerInformationServiceVehicleData()
	 * @generated
	 */
	EAttribute getCustomerInformationServiceVehicleData_VehicleMode();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceVehicleData#getMyOwnVehicleMode <em>My Own Vehicle Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>My Own Vehicle Mode</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceVehicleData#getMyOwnVehicleMode()
	 * @see #getCustomerInformationServiceVehicleData()
	 * @generated
	 */
	EReference getCustomerInformationServiceVehicleData_MyOwnVehicleMode();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceVehicleData#getSpeakerActive <em>Speaker Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Speaker Active</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceVehicleData#getSpeakerActive()
	 * @see #getCustomerInformationServiceVehicleData()
	 * @generated
	 */
	EReference getCustomerInformationServiceVehicleData_SpeakerActive();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceVehicleData#getStopInformationActive <em>Stop Information Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stop Information Active</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceVehicleData#getStopInformationActive()
	 * @see #getCustomerInformationServiceVehicleData()
	 * @generated
	 */
	EReference getCustomerInformationServiceVehicleData_StopInformationActive();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceVehicleData#getTripState <em>Trip State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trip State</em>'.
	 * @see de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceVehicleData#getTripState()
	 * @see #getCustomerInformationServiceVehicleData()
	 * @generated
	 */
	EAttribute getCustomerInformationServiceVehicleData_TripState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IBISCustomerInformationServiceFactory getIBISCustomerInformationServiceFactory();

} //IBISCustomerInformationServicePackage
