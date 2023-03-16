/*
 */
package de.jena.mdo.ibis.ibis_enumerations;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see de.jena.mdo.ibis.ibis_enumerations.IbisEnumerationsFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
@ProviderType
public interface IbisEnumerationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ibis_enumerations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://jena.de/mdo/ibis-enumerations/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ibis_enumerations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IbisEnumerationsPackage eINSTANCE = de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_enumerations.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.DocumentRootImpl
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Air Submode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AIR_SUBMODE = 3;

	/**
	 * The feature id for the '<em><b>Bus Submode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BUS_SUBMODE = 4;

	/**
	 * The feature id for the '<em><b>Coach Submode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COACH_SUBMODE = 5;

	/**
	 * The feature id for the '<em><b>Funicular Submode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FUNICULAR_SUBMODE = 6;

	/**
	 * The feature id for the '<em><b>Metro Submode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__METRO_SUBMODE = 7;

	/**
	 * The feature id for the '<em><b>Rail Submode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RAIL_SUBMODE = 8;

	/**
	 * The feature id for the '<em><b>Self Drive Submode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SELF_DRIVE_SUBMODE = 9;

	/**
	 * The feature id for the '<em><b>Taxi Submode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TAXI_SUBMODE = 10;

	/**
	 * The feature id for the '<em><b>Telecabin Submode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TELECABIN_SUBMODE = 11;

	/**
	 * The feature id for the '<em><b>Tram Submode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRAM_SUBMODE = 12;

	/**
	 * The feature id for the '<em><b>Water Submode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WATER_SUBMODE = 13;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_enumerations.AirSubmodeEnumeration <em>Air Submode Enumeration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.AirSubmodeEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getAirSubmodeEnumeration()
	 * @generated
	 */
	int AIR_SUBMODE_ENUMERATION = 1;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_enumerations.BusSubmodeEnumeration <em>Bus Submode Enumeration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.BusSubmodeEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getBusSubmodeEnumeration()
	 * @generated
	 */
	int BUS_SUBMODE_ENUMERATION = 2;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_enumerations.CoachSubmodeEnumeration <em>Coach Submode Enumeration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.CoachSubmodeEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getCoachSubmodeEnumeration()
	 * @generated
	 */
	int COACH_SUBMODE_ENUMERATION = 3;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_enumerations.ConnectionStateEnumeration <em>Connection State Enumeration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.ConnectionStateEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getConnectionStateEnumeration()
	 * @generated
	 */
	int CONNECTION_STATE_ENUMERATION = 4;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_enumerations.ConnectionTypeEnumeration <em>Connection Type Enumeration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.ConnectionTypeEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getConnectionTypeEnumeration()
	 * @generated
	 */
	int CONNECTION_TYPE_ENUMERATION = 5;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_enumerations.DataIntervalEnumeration <em>Data Interval Enumeration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.DataIntervalEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getDataIntervalEnumeration()
	 * @generated
	 */
	int DATA_INTERVAL_ENUMERATION = 6;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_enumerations.DeviceClassEnumeration <em>Device Class Enumeration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.DeviceClassEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getDeviceClassEnumeration()
	 * @generated
	 */
	int DEVICE_CLASS_ENUMERATION = 7;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_enumerations.DeviceStateEnumeration <em>Device State Enumeration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.DeviceStateEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getDeviceStateEnumeration()
	 * @generated
	 */
	int DEVICE_STATE_ENUMERATION = 8;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_enumerations.DeviceTaskEnumeration <em>Device Task Enumeration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.DeviceTaskEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getDeviceTaskEnumeration()
	 * @generated
	 */
	int DEVICE_TASK_ENUMERATION = 9;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_enumerations.DoorCountingObjectClassEnumeration <em>Door Counting Object Class Enumeration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.DoorCountingObjectClassEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getDoorCountingObjectClassEnumeration()
	 * @generated
	 */
	int DOOR_COUNTING_OBJECT_CLASS_ENUMERATION = 10;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_enumerations.DoorCountingQualityEnumeration <em>Door Counting Quality Enumeration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.DoorCountingQualityEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getDoorCountingQualityEnumeration()
	 * @generated
	 */
	int DOOR_COUNTING_QUALITY_ENUMERATION = 11;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_enumerations.DoorOpenStateEnumeration <em>Door Open State Enumeration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.DoorOpenStateEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getDoorOpenStateEnumeration()
	 * @generated
	 */
	int DOOR_OPEN_STATE_ENUMERATION = 12;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_enumerations.DoorOperationStateEnumeration <em>Door Operation State Enumeration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.DoorOperationStateEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getDoorOperationStateEnumeration()
	 * @generated
	 */
	int DOOR_OPERATION_STATE_ENUMERATION = 13;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_enumerations.ErrorCodeEnumeration <em>Error Code Enumeration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.ErrorCodeEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getErrorCodeEnumeration()
	 * @generated
	 */
	int ERROR_CODE_ENUMERATION = 14;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_enumerations.ExitSideEnumeration <em>Exit Side Enumeration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.ExitSideEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getExitSideEnumeration()
	 * @generated
	 */
	int EXIT_SIDE_ENUMERATION = 15;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_enumerations.FunicularSubmodeEnumeration <em>Funicular Submode Enumeration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.FunicularSubmodeEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getFunicularSubmodeEnumeration()
	 * @generated
	 */
	int FUNICULAR_SUBMODE_ENUMERATION = 16;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_enumerations.GNSSCoordinateSystemEnumeration <em>GNSS Coordinate System Enumeration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.GNSSCoordinateSystemEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getGNSSCoordinateSystemEnumeration()
	 * @generated
	 */
	int GNSS_COORDINATE_SYSTEM_ENUMERATION = 17;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_enumerations.GNSSQualityEnumeration <em>GNSS Quality Enumeration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.GNSSQualityEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getGNSSQualityEnumeration()
	 * @generated
	 */
	int GNSS_QUALITY_ENUMERATION = 18;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_enumerations.GNSSTypeEnumeration <em>GNSS Type Enumeration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.GNSSTypeEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getGNSSTypeEnumeration()
	 * @generated
	 */
	int GNSS_TYPE_ENUMERATION = 19;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_enumerations.JourneyModeEnumeration <em>Journey Mode Enumeration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.JourneyModeEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getJourneyModeEnumeration()
	 * @generated
	 */
	int JOURNEY_MODE_ENUMERATION = 20;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_enumerations.LocationStateEnumeration <em>Location State Enumeration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.LocationStateEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getLocationStateEnumeration()
	 * @generated
	 */
	int LOCATION_STATE_ENUMERATION = 21;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_enumerations.MessageTypeEnumeration <em>Message Type Enumeration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.MessageTypeEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getMessageTypeEnumeration()
	 * @generated
	 */
	int MESSAGE_TYPE_ENUMERATION = 22;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_enumerations.MetroSubmodeEnumeration <em>Metro Submode Enumeration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.MetroSubmodeEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getMetroSubmodeEnumeration()
	 * @generated
	 */
	int METRO_SUBMODE_ENUMERATION = 23;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_enumerations.PrivateSubModesEnumeration <em>Private Sub Modes Enumeration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.PrivateSubModesEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getPrivateSubModesEnumeration()
	 * @generated
	 */
	int PRIVATE_SUB_MODES_ENUMERATION = 24;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_enumerations.PtSubModesEnumeration <em>Pt Sub Modes Enumeration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.PtSubModesEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getPtSubModesEnumeration()
	 * @generated
	 */
	int PT_SUB_MODES_ENUMERATION = 25;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_enumerations.RailSubmodeEnumeration <em>Rail Submode Enumeration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.RailSubmodeEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getRailSubmodeEnumeration()
	 * @generated
	 */
	int RAIL_SUBMODE_ENUMERATION = 26;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_enumerations.RouteDeviationEnumeration <em>Route Deviation Enumeration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.RouteDeviationEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getRouteDeviationEnumeration()
	 * @generated
	 */
	int ROUTE_DEVIATION_ENUMERATION = 27;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_enumerations.RouteDirectionEnumeration <em>Route Direction Enumeration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.RouteDirectionEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getRouteDirectionEnumeration()
	 * @generated
	 */
	int ROUTE_DIRECTION_ENUMERATION = 28;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_enumerations.SelfDriveSubmodeEnumeration <em>Self Drive Submode Enumeration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.SelfDriveSubmodeEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getSelfDriveSubmodeEnumeration()
	 * @generated
	 */
	int SELF_DRIVE_SUBMODE_ENUMERATION = 29;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_enumerations.ServiceNameEnumeration <em>Service Name Enumeration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.ServiceNameEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getServiceNameEnumeration()
	 * @generated
	 */
	int SERVICE_NAME_ENUMERATION = 30;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_enumerations.ServiceStateEnumeration <em>Service State Enumeration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.ServiceStateEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getServiceStateEnumeration()
	 * @generated
	 */
	int SERVICE_STATE_ENUMERATION = 31;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_enumerations.SystemDocumentationInformationEnumeration <em>System Documentation Information Enumeration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.SystemDocumentationInformationEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getSystemDocumentationInformationEnumeration()
	 * @generated
	 */
	int SYSTEM_DOCUMENTATION_INFORMATION_ENUMERATION = 32;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_enumerations.TaxiSubmodeEnumeration <em>Taxi Submode Enumeration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.TaxiSubmodeEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getTaxiSubmodeEnumeration()
	 * @generated
	 */
	int TAXI_SUBMODE_ENUMERATION = 33;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_enumerations.TelecabinSubmodeEnumeration <em>Telecabin Submode Enumeration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.TelecabinSubmodeEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getTelecabinSubmodeEnumeration()
	 * @generated
	 */
	int TELECABIN_SUBMODE_ENUMERATION = 34;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_enumerations.TicketRazziaInformationEnumeration <em>Ticket Razzia Information Enumeration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.TicketRazziaInformationEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getTicketRazziaInformationEnumeration()
	 * @generated
	 */
	int TICKET_RAZZIA_INFORMATION_ENUMERATION = 35;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_enumerations.TicketValidationEnumeration <em>Ticket Validation Enumeration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.TicketValidationEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getTicketValidationEnumeration()
	 * @generated
	 */
	int TICKET_VALIDATION_ENUMERATION = 36;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_enumerations.TramSubmodeEnumeration <em>Tram Submode Enumeration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.TramSubmodeEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getTramSubmodeEnumeration()
	 * @generated
	 */
	int TRAM_SUBMODE_ENUMERATION = 37;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_enumerations.TripStateEnumeration <em>Trip State Enumeration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.TripStateEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getTripStateEnumeration()
	 * @generated
	 */
	int TRIP_STATE_ENUMERATION = 38;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_enumerations.VehicleModeEnumeration <em>Vehicle Mode Enumeration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.VehicleModeEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getVehicleModeEnumeration()
	 * @generated
	 */
	int VEHICLE_MODE_ENUMERATION = 39;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_enumerations.WaterSubmodeEnumeration <em>Water Submode Enumeration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.WaterSubmodeEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getWaterSubmodeEnumeration()
	 * @generated
	 */
	int WATER_SUBMODE_ENUMERATION = 40;

	/**
	 * The meta object id for the '<em>Air Submode Enumeration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.AirSubmodeEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getAirSubmodeEnumerationObject()
	 * @generated
	 */
	int AIR_SUBMODE_ENUMERATION_OBJECT = 41;

	/**
	 * The meta object id for the '<em>Bus Submode Enumeration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.BusSubmodeEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getBusSubmodeEnumerationObject()
	 * @generated
	 */
	int BUS_SUBMODE_ENUMERATION_OBJECT = 42;

	/**
	 * The meta object id for the '<em>Coach Submode Enumeration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.CoachSubmodeEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getCoachSubmodeEnumerationObject()
	 * @generated
	 */
	int COACH_SUBMODE_ENUMERATION_OBJECT = 43;

	/**
	 * The meta object id for the '<em>Connection State Enumeration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.ConnectionStateEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getConnectionStateEnumerationObject()
	 * @generated
	 */
	int CONNECTION_STATE_ENUMERATION_OBJECT = 44;

	/**
	 * The meta object id for the '<em>Connection Type Enumeration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.ConnectionTypeEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getConnectionTypeEnumerationObject()
	 * @generated
	 */
	int CONNECTION_TYPE_ENUMERATION_OBJECT = 45;

	/**
	 * The meta object id for the '<em>Data Interval Enumeration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.DataIntervalEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getDataIntervalEnumerationObject()
	 * @generated
	 */
	int DATA_INTERVAL_ENUMERATION_OBJECT = 46;

	/**
	 * The meta object id for the '<em>Device Class Enumeration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.DeviceClassEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getDeviceClassEnumerationObject()
	 * @generated
	 */
	int DEVICE_CLASS_ENUMERATION_OBJECT = 47;

	/**
	 * The meta object id for the '<em>Device State Enumeration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.DeviceStateEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getDeviceStateEnumerationObject()
	 * @generated
	 */
	int DEVICE_STATE_ENUMERATION_OBJECT = 48;

	/**
	 * The meta object id for the '<em>Device Task Enumeration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.DeviceTaskEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getDeviceTaskEnumerationObject()
	 * @generated
	 */
	int DEVICE_TASK_ENUMERATION_OBJECT = 49;

	/**
	 * The meta object id for the '<em>Door Counting Object Class Enumeration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.DoorCountingObjectClassEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getDoorCountingObjectClassEnumerationObject()
	 * @generated
	 */
	int DOOR_COUNTING_OBJECT_CLASS_ENUMERATION_OBJECT = 50;

	/**
	 * The meta object id for the '<em>Door Counting Quality Enumeration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.DoorCountingQualityEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getDoorCountingQualityEnumerationObject()
	 * @generated
	 */
	int DOOR_COUNTING_QUALITY_ENUMERATION_OBJECT = 51;

	/**
	 * The meta object id for the '<em>Door Open State Enumeration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.DoorOpenStateEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getDoorOpenStateEnumerationObject()
	 * @generated
	 */
	int DOOR_OPEN_STATE_ENUMERATION_OBJECT = 52;

	/**
	 * The meta object id for the '<em>Door Operation State Enumeration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.DoorOperationStateEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getDoorOperationStateEnumerationObject()
	 * @generated
	 */
	int DOOR_OPERATION_STATE_ENUMERATION_OBJECT = 53;

	/**
	 * The meta object id for the '<em>Error Code Enumeration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.ErrorCodeEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getErrorCodeEnumerationObject()
	 * @generated
	 */
	int ERROR_CODE_ENUMERATION_OBJECT = 54;

	/**
	 * The meta object id for the '<em>Exit Side Enumeration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.ExitSideEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getExitSideEnumerationObject()
	 * @generated
	 */
	int EXIT_SIDE_ENUMERATION_OBJECT = 55;

	/**
	 * The meta object id for the '<em>Funicular Submode Enumeration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.FunicularSubmodeEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getFunicularSubmodeEnumerationObject()
	 * @generated
	 */
	int FUNICULAR_SUBMODE_ENUMERATION_OBJECT = 56;

	/**
	 * The meta object id for the '<em>GNSS Coordinate System Enumeration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.GNSSCoordinateSystemEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getGNSSCoordinateSystemEnumerationObject()
	 * @generated
	 */
	int GNSS_COORDINATE_SYSTEM_ENUMERATION_OBJECT = 57;

	/**
	 * The meta object id for the '<em>GNSS Quality Enumeration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.GNSSQualityEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getGNSSQualityEnumerationObject()
	 * @generated
	 */
	int GNSS_QUALITY_ENUMERATION_OBJECT = 58;

	/**
	 * The meta object id for the '<em>GNSS Type Enumeration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.GNSSTypeEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getGNSSTypeEnumerationObject()
	 * @generated
	 */
	int GNSS_TYPE_ENUMERATION_OBJECT = 59;

	/**
	 * The meta object id for the '<em>Journey Mode Enumeration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.JourneyModeEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getJourneyModeEnumerationObject()
	 * @generated
	 */
	int JOURNEY_MODE_ENUMERATION_OBJECT = 60;

	/**
	 * The meta object id for the '<em>Location State Enumeration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.LocationStateEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getLocationStateEnumerationObject()
	 * @generated
	 */
	int LOCATION_STATE_ENUMERATION_OBJECT = 61;

	/**
	 * The meta object id for the '<em>Message Type Enumeration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.MessageTypeEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getMessageTypeEnumerationObject()
	 * @generated
	 */
	int MESSAGE_TYPE_ENUMERATION_OBJECT = 62;

	/**
	 * The meta object id for the '<em>Metro Submode Enumeration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.MetroSubmodeEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getMetroSubmodeEnumerationObject()
	 * @generated
	 */
	int METRO_SUBMODE_ENUMERATION_OBJECT = 63;

	/**
	 * The meta object id for the '<em>Private Sub Modes Enumeration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.PrivateSubModesEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getPrivateSubModesEnumerationObject()
	 * @generated
	 */
	int PRIVATE_SUB_MODES_ENUMERATION_OBJECT = 64;

	/**
	 * The meta object id for the '<em>Pt Sub Modes Enumeration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.PtSubModesEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getPtSubModesEnumerationObject()
	 * @generated
	 */
	int PT_SUB_MODES_ENUMERATION_OBJECT = 65;

	/**
	 * The meta object id for the '<em>Rail Submode Enumeration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.RailSubmodeEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getRailSubmodeEnumerationObject()
	 * @generated
	 */
	int RAIL_SUBMODE_ENUMERATION_OBJECT = 66;

	/**
	 * The meta object id for the '<em>Route Deviation Enumeration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.RouteDeviationEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getRouteDeviationEnumerationObject()
	 * @generated
	 */
	int ROUTE_DEVIATION_ENUMERATION_OBJECT = 67;

	/**
	 * The meta object id for the '<em>Route Direction Enumeration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.RouteDirectionEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getRouteDirectionEnumerationObject()
	 * @generated
	 */
	int ROUTE_DIRECTION_ENUMERATION_OBJECT = 68;

	/**
	 * The meta object id for the '<em>Self Drive Submode Enumeration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.SelfDriveSubmodeEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getSelfDriveSubmodeEnumerationObject()
	 * @generated
	 */
	int SELF_DRIVE_SUBMODE_ENUMERATION_OBJECT = 69;

	/**
	 * The meta object id for the '<em>Service Name Enumeration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.ServiceNameEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getServiceNameEnumerationObject()
	 * @generated
	 */
	int SERVICE_NAME_ENUMERATION_OBJECT = 70;

	/**
	 * The meta object id for the '<em>Service State Enumeration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.ServiceStateEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getServiceStateEnumerationObject()
	 * @generated
	 */
	int SERVICE_STATE_ENUMERATION_OBJECT = 71;

	/**
	 * The meta object id for the '<em>System Documentation Information Enumeration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.SystemDocumentationInformationEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getSystemDocumentationInformationEnumerationObject()
	 * @generated
	 */
	int SYSTEM_DOCUMENTATION_INFORMATION_ENUMERATION_OBJECT = 72;

	/**
	 * The meta object id for the '<em>Taxi Submode Enumeration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.TaxiSubmodeEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getTaxiSubmodeEnumerationObject()
	 * @generated
	 */
	int TAXI_SUBMODE_ENUMERATION_OBJECT = 73;

	/**
	 * The meta object id for the '<em>Telecabin Submode Enumeration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.TelecabinSubmodeEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getTelecabinSubmodeEnumerationObject()
	 * @generated
	 */
	int TELECABIN_SUBMODE_ENUMERATION_OBJECT = 74;

	/**
	 * The meta object id for the '<em>Ticket Razzia Information Enumeration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.TicketRazziaInformationEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getTicketRazziaInformationEnumerationObject()
	 * @generated
	 */
	int TICKET_RAZZIA_INFORMATION_ENUMERATION_OBJECT = 75;

	/**
	 * The meta object id for the '<em>Ticket Validation Enumeration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.TicketValidationEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getTicketValidationEnumerationObject()
	 * @generated
	 */
	int TICKET_VALIDATION_ENUMERATION_OBJECT = 76;

	/**
	 * The meta object id for the '<em>Tram Submode Enumeration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.TramSubmodeEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getTramSubmodeEnumerationObject()
	 * @generated
	 */
	int TRAM_SUBMODE_ENUMERATION_OBJECT = 77;

	/**
	 * The meta object id for the '<em>Trip State Enumeration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.TripStateEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getTripStateEnumerationObject()
	 * @generated
	 */
	int TRIP_STATE_ENUMERATION_OBJECT = 78;

	/**
	 * The meta object id for the '<em>Vehicle Mode Enumeration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.VehicleModeEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getVehicleModeEnumerationObject()
	 * @generated
	 */
	int VEHICLE_MODE_ENUMERATION_OBJECT = 79;

	/**
	 * The meta object id for the '<em>Water Submode Enumeration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_enumerations.WaterSubmodeEnumeration
	 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getWaterSubmodeEnumerationObject()
	 * @generated
	 */
	int WATER_SUBMODE_ENUMERATION_OBJECT = 80;


	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_enumerations.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link de.jena.mdo.ibis.ibis_enumerations.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link de.jena.mdo.ibis.ibis_enumerations.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link de.jena.mdo.ibis.ibis_enumerations.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_enumerations.DocumentRoot#getAirSubmode <em>Air Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Air Submode</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.DocumentRoot#getAirSubmode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AirSubmode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_enumerations.DocumentRoot#getBusSubmode <em>Bus Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bus Submode</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.DocumentRoot#getBusSubmode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_BusSubmode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_enumerations.DocumentRoot#getCoachSubmode <em>Coach Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coach Submode</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.DocumentRoot#getCoachSubmode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CoachSubmode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_enumerations.DocumentRoot#getFunicularSubmode <em>Funicular Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Funicular Submode</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.DocumentRoot#getFunicularSubmode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FunicularSubmode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_enumerations.DocumentRoot#getMetroSubmode <em>Metro Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metro Submode</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.DocumentRoot#getMetroSubmode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MetroSubmode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_enumerations.DocumentRoot#getRailSubmode <em>Rail Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rail Submode</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.DocumentRoot#getRailSubmode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_RailSubmode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_enumerations.DocumentRoot#getSelfDriveSubmode <em>Self Drive Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Self Drive Submode</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.DocumentRoot#getSelfDriveSubmode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SelfDriveSubmode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_enumerations.DocumentRoot#getTaxiSubmode <em>Taxi Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Taxi Submode</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.DocumentRoot#getTaxiSubmode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TaxiSubmode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_enumerations.DocumentRoot#getTelecabinSubmode <em>Telecabin Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telecabin Submode</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.DocumentRoot#getTelecabinSubmode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TelecabinSubmode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_enumerations.DocumentRoot#getTramSubmode <em>Tram Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tram Submode</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.DocumentRoot#getTramSubmode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TramSubmode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_enumerations.DocumentRoot#getWaterSubmode <em>Water Submode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Water Submode</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.DocumentRoot#getWaterSubmode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_WaterSubmode();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.ibis.ibis_enumerations.AirSubmodeEnumeration <em>Air Submode Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Air Submode Enumeration</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.AirSubmodeEnumeration
	 * @generated
	 */
	EEnum getAirSubmodeEnumeration();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.ibis.ibis_enumerations.BusSubmodeEnumeration <em>Bus Submode Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bus Submode Enumeration</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.BusSubmodeEnumeration
	 * @generated
	 */
	EEnum getBusSubmodeEnumeration();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.ibis.ibis_enumerations.CoachSubmodeEnumeration <em>Coach Submode Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Coach Submode Enumeration</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.CoachSubmodeEnumeration
	 * @generated
	 */
	EEnum getCoachSubmodeEnumeration();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.ibis.ibis_enumerations.ConnectionStateEnumeration <em>Connection State Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Connection State Enumeration</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.ConnectionStateEnumeration
	 * @generated
	 */
	EEnum getConnectionStateEnumeration();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.ibis.ibis_enumerations.ConnectionTypeEnumeration <em>Connection Type Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Connection Type Enumeration</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.ConnectionTypeEnumeration
	 * @generated
	 */
	EEnum getConnectionTypeEnumeration();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.ibis.ibis_enumerations.DataIntervalEnumeration <em>Data Interval Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Interval Enumeration</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.DataIntervalEnumeration
	 * @generated
	 */
	EEnum getDataIntervalEnumeration();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.ibis.ibis_enumerations.DeviceClassEnumeration <em>Device Class Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Device Class Enumeration</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.DeviceClassEnumeration
	 * @generated
	 */
	EEnum getDeviceClassEnumeration();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.ibis.ibis_enumerations.DeviceStateEnumeration <em>Device State Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Device State Enumeration</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.DeviceStateEnumeration
	 * @generated
	 */
	EEnum getDeviceStateEnumeration();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.ibis.ibis_enumerations.DeviceTaskEnumeration <em>Device Task Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Device Task Enumeration</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.DeviceTaskEnumeration
	 * @generated
	 */
	EEnum getDeviceTaskEnumeration();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.ibis.ibis_enumerations.DoorCountingObjectClassEnumeration <em>Door Counting Object Class Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Door Counting Object Class Enumeration</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.DoorCountingObjectClassEnumeration
	 * @generated
	 */
	EEnum getDoorCountingObjectClassEnumeration();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.ibis.ibis_enumerations.DoorCountingQualityEnumeration <em>Door Counting Quality Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Door Counting Quality Enumeration</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.DoorCountingQualityEnumeration
	 * @generated
	 */
	EEnum getDoorCountingQualityEnumeration();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.ibis.ibis_enumerations.DoorOpenStateEnumeration <em>Door Open State Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Door Open State Enumeration</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.DoorOpenStateEnumeration
	 * @generated
	 */
	EEnum getDoorOpenStateEnumeration();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.ibis.ibis_enumerations.DoorOperationStateEnumeration <em>Door Operation State Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Door Operation State Enumeration</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.DoorOperationStateEnumeration
	 * @generated
	 */
	EEnum getDoorOperationStateEnumeration();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.ibis.ibis_enumerations.ErrorCodeEnumeration <em>Error Code Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Error Code Enumeration</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.ErrorCodeEnumeration
	 * @generated
	 */
	EEnum getErrorCodeEnumeration();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.ibis.ibis_enumerations.ExitSideEnumeration <em>Exit Side Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Exit Side Enumeration</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.ExitSideEnumeration
	 * @generated
	 */
	EEnum getExitSideEnumeration();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.ibis.ibis_enumerations.FunicularSubmodeEnumeration <em>Funicular Submode Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Funicular Submode Enumeration</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.FunicularSubmodeEnumeration
	 * @generated
	 */
	EEnum getFunicularSubmodeEnumeration();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.ibis.ibis_enumerations.GNSSCoordinateSystemEnumeration <em>GNSS Coordinate System Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GNSS Coordinate System Enumeration</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.GNSSCoordinateSystemEnumeration
	 * @generated
	 */
	EEnum getGNSSCoordinateSystemEnumeration();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.ibis.ibis_enumerations.GNSSQualityEnumeration <em>GNSS Quality Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GNSS Quality Enumeration</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.GNSSQualityEnumeration
	 * @generated
	 */
	EEnum getGNSSQualityEnumeration();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.ibis.ibis_enumerations.GNSSTypeEnumeration <em>GNSS Type Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GNSS Type Enumeration</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.GNSSTypeEnumeration
	 * @generated
	 */
	EEnum getGNSSTypeEnumeration();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.ibis.ibis_enumerations.JourneyModeEnumeration <em>Journey Mode Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Journey Mode Enumeration</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.JourneyModeEnumeration
	 * @generated
	 */
	EEnum getJourneyModeEnumeration();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.ibis.ibis_enumerations.LocationStateEnumeration <em>Location State Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Location State Enumeration</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.LocationStateEnumeration
	 * @generated
	 */
	EEnum getLocationStateEnumeration();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.ibis.ibis_enumerations.MessageTypeEnumeration <em>Message Type Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Type Enumeration</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.MessageTypeEnumeration
	 * @generated
	 */
	EEnum getMessageTypeEnumeration();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.ibis.ibis_enumerations.MetroSubmodeEnumeration <em>Metro Submode Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Metro Submode Enumeration</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.MetroSubmodeEnumeration
	 * @generated
	 */
	EEnum getMetroSubmodeEnumeration();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.ibis.ibis_enumerations.PrivateSubModesEnumeration <em>Private Sub Modes Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Private Sub Modes Enumeration</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.PrivateSubModesEnumeration
	 * @generated
	 */
	EEnum getPrivateSubModesEnumeration();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.ibis.ibis_enumerations.PtSubModesEnumeration <em>Pt Sub Modes Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pt Sub Modes Enumeration</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.PtSubModesEnumeration
	 * @generated
	 */
	EEnum getPtSubModesEnumeration();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.ibis.ibis_enumerations.RailSubmodeEnumeration <em>Rail Submode Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rail Submode Enumeration</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.RailSubmodeEnumeration
	 * @generated
	 */
	EEnum getRailSubmodeEnumeration();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.ibis.ibis_enumerations.RouteDeviationEnumeration <em>Route Deviation Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Route Deviation Enumeration</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.RouteDeviationEnumeration
	 * @generated
	 */
	EEnum getRouteDeviationEnumeration();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.ibis.ibis_enumerations.RouteDirectionEnumeration <em>Route Direction Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Route Direction Enumeration</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.RouteDirectionEnumeration
	 * @generated
	 */
	EEnum getRouteDirectionEnumeration();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.ibis.ibis_enumerations.SelfDriveSubmodeEnumeration <em>Self Drive Submode Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Self Drive Submode Enumeration</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.SelfDriveSubmodeEnumeration
	 * @generated
	 */
	EEnum getSelfDriveSubmodeEnumeration();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.ibis.ibis_enumerations.ServiceNameEnumeration <em>Service Name Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Service Name Enumeration</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.ServiceNameEnumeration
	 * @generated
	 */
	EEnum getServiceNameEnumeration();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.ibis.ibis_enumerations.ServiceStateEnumeration <em>Service State Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Service State Enumeration</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.ServiceStateEnumeration
	 * @generated
	 */
	EEnum getServiceStateEnumeration();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.ibis.ibis_enumerations.SystemDocumentationInformationEnumeration <em>System Documentation Information Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>System Documentation Information Enumeration</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.SystemDocumentationInformationEnumeration
	 * @generated
	 */
	EEnum getSystemDocumentationInformationEnumeration();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.ibis.ibis_enumerations.TaxiSubmodeEnumeration <em>Taxi Submode Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Taxi Submode Enumeration</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.TaxiSubmodeEnumeration
	 * @generated
	 */
	EEnum getTaxiSubmodeEnumeration();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.ibis.ibis_enumerations.TelecabinSubmodeEnumeration <em>Telecabin Submode Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Telecabin Submode Enumeration</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.TelecabinSubmodeEnumeration
	 * @generated
	 */
	EEnum getTelecabinSubmodeEnumeration();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.ibis.ibis_enumerations.TicketRazziaInformationEnumeration <em>Ticket Razzia Information Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ticket Razzia Information Enumeration</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.TicketRazziaInformationEnumeration
	 * @generated
	 */
	EEnum getTicketRazziaInformationEnumeration();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.ibis.ibis_enumerations.TicketValidationEnumeration <em>Ticket Validation Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ticket Validation Enumeration</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.TicketValidationEnumeration
	 * @generated
	 */
	EEnum getTicketValidationEnumeration();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.ibis.ibis_enumerations.TramSubmodeEnumeration <em>Tram Submode Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tram Submode Enumeration</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.TramSubmodeEnumeration
	 * @generated
	 */
	EEnum getTramSubmodeEnumeration();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.ibis.ibis_enumerations.TripStateEnumeration <em>Trip State Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trip State Enumeration</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.TripStateEnumeration
	 * @generated
	 */
	EEnum getTripStateEnumeration();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.ibis.ibis_enumerations.VehicleModeEnumeration <em>Vehicle Mode Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vehicle Mode Enumeration</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.VehicleModeEnumeration
	 * @generated
	 */
	EEnum getVehicleModeEnumeration();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.ibis.ibis_enumerations.WaterSubmodeEnumeration <em>Water Submode Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Water Submode Enumeration</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.WaterSubmodeEnumeration
	 * @generated
	 */
	EEnum getWaterSubmodeEnumeration();

	/**
	 * Returns the meta object for data type '{@link de.jena.mdo.ibis.ibis_enumerations.AirSubmodeEnumeration <em>Air Submode Enumeration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Air Submode Enumeration Object</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.AirSubmodeEnumeration
	 * @model instanceClass="de.jena.mdo.ibis.ibis_enumerations.AirSubmodeEnumeration"
	 *        extendedMetaData="name='AirSubmodeEnumeration:Object' baseType='AirSubmodeEnumeration'"
	 * @generated
	 */
	EDataType getAirSubmodeEnumerationObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.mdo.ibis.ibis_enumerations.BusSubmodeEnumeration <em>Bus Submode Enumeration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bus Submode Enumeration Object</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.BusSubmodeEnumeration
	 * @model instanceClass="de.jena.mdo.ibis.ibis_enumerations.BusSubmodeEnumeration"
	 *        extendedMetaData="name='BusSubmodeEnumeration:Object' baseType='BusSubmodeEnumeration'"
	 * @generated
	 */
	EDataType getBusSubmodeEnumerationObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.mdo.ibis.ibis_enumerations.CoachSubmodeEnumeration <em>Coach Submode Enumeration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Coach Submode Enumeration Object</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.CoachSubmodeEnumeration
	 * @model instanceClass="de.jena.mdo.ibis.ibis_enumerations.CoachSubmodeEnumeration"
	 *        extendedMetaData="name='CoachSubmodeEnumeration:Object' baseType='CoachSubmodeEnumeration'"
	 * @generated
	 */
	EDataType getCoachSubmodeEnumerationObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.mdo.ibis.ibis_enumerations.ConnectionStateEnumeration <em>Connection State Enumeration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Connection State Enumeration Object</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.ConnectionStateEnumeration
	 * @model instanceClass="de.jena.mdo.ibis.ibis_enumerations.ConnectionStateEnumeration"
	 *        extendedMetaData="name='ConnectionStateEnumeration:Object' baseType='ConnectionStateEnumeration'"
	 * @generated
	 */
	EDataType getConnectionStateEnumerationObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.mdo.ibis.ibis_enumerations.ConnectionTypeEnumeration <em>Connection Type Enumeration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Connection Type Enumeration Object</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.ConnectionTypeEnumeration
	 * @model instanceClass="de.jena.mdo.ibis.ibis_enumerations.ConnectionTypeEnumeration"
	 *        extendedMetaData="name='ConnectionTypeEnumeration:Object' baseType='ConnectionTypeEnumeration'"
	 * @generated
	 */
	EDataType getConnectionTypeEnumerationObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.mdo.ibis.ibis_enumerations.DataIntervalEnumeration <em>Data Interval Enumeration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Data Interval Enumeration Object</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.DataIntervalEnumeration
	 * @model instanceClass="de.jena.mdo.ibis.ibis_enumerations.DataIntervalEnumeration"
	 *        extendedMetaData="name='DataIntervalEnumeration:Object' baseType='DataIntervalEnumeration'"
	 * @generated
	 */
	EDataType getDataIntervalEnumerationObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.mdo.ibis.ibis_enumerations.DeviceClassEnumeration <em>Device Class Enumeration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Device Class Enumeration Object</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.DeviceClassEnumeration
	 * @model instanceClass="de.jena.mdo.ibis.ibis_enumerations.DeviceClassEnumeration"
	 *        extendedMetaData="name='DeviceClassEnumeration:Object' baseType='DeviceClassEnumeration'"
	 * @generated
	 */
	EDataType getDeviceClassEnumerationObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.mdo.ibis.ibis_enumerations.DeviceStateEnumeration <em>Device State Enumeration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Device State Enumeration Object</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.DeviceStateEnumeration
	 * @model instanceClass="de.jena.mdo.ibis.ibis_enumerations.DeviceStateEnumeration"
	 *        extendedMetaData="name='DeviceStateEnumeration:Object' baseType='DeviceStateEnumeration'"
	 * @generated
	 */
	EDataType getDeviceStateEnumerationObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.mdo.ibis.ibis_enumerations.DeviceTaskEnumeration <em>Device Task Enumeration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Device Task Enumeration Object</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.DeviceTaskEnumeration
	 * @model instanceClass="de.jena.mdo.ibis.ibis_enumerations.DeviceTaskEnumeration"
	 *        extendedMetaData="name='DeviceTaskEnumeration:Object' baseType='DeviceTaskEnumeration'"
	 * @generated
	 */
	EDataType getDeviceTaskEnumerationObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.mdo.ibis.ibis_enumerations.DoorCountingObjectClassEnumeration <em>Door Counting Object Class Enumeration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Door Counting Object Class Enumeration Object</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.DoorCountingObjectClassEnumeration
	 * @model instanceClass="de.jena.mdo.ibis.ibis_enumerations.DoorCountingObjectClassEnumeration"
	 *        extendedMetaData="name='DoorCountingObjectClassEnumeration:Object' baseType='DoorCountingObjectClassEnumeration'"
	 * @generated
	 */
	EDataType getDoorCountingObjectClassEnumerationObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.mdo.ibis.ibis_enumerations.DoorCountingQualityEnumeration <em>Door Counting Quality Enumeration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Door Counting Quality Enumeration Object</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.DoorCountingQualityEnumeration
	 * @model instanceClass="de.jena.mdo.ibis.ibis_enumerations.DoorCountingQualityEnumeration"
	 *        extendedMetaData="name='DoorCountingQualityEnumeration:Object' baseType='DoorCountingQualityEnumeration'"
	 * @generated
	 */
	EDataType getDoorCountingQualityEnumerationObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.mdo.ibis.ibis_enumerations.DoorOpenStateEnumeration <em>Door Open State Enumeration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Door Open State Enumeration Object</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.DoorOpenStateEnumeration
	 * @model instanceClass="de.jena.mdo.ibis.ibis_enumerations.DoorOpenStateEnumeration"
	 *        extendedMetaData="name='DoorOpenStateEnumeration:Object' baseType='DoorOpenStateEnumeration'"
	 * @generated
	 */
	EDataType getDoorOpenStateEnumerationObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.mdo.ibis.ibis_enumerations.DoorOperationStateEnumeration <em>Door Operation State Enumeration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Door Operation State Enumeration Object</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.DoorOperationStateEnumeration
	 * @model instanceClass="de.jena.mdo.ibis.ibis_enumerations.DoorOperationStateEnumeration"
	 *        extendedMetaData="name='DoorOperationStateEnumeration:Object' baseType='DoorOperationStateEnumeration'"
	 * @generated
	 */
	EDataType getDoorOperationStateEnumerationObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.mdo.ibis.ibis_enumerations.ErrorCodeEnumeration <em>Error Code Enumeration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Error Code Enumeration Object</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.ErrorCodeEnumeration
	 * @model instanceClass="de.jena.mdo.ibis.ibis_enumerations.ErrorCodeEnumeration"
	 *        extendedMetaData="name='ErrorCodeEnumeration:Object' baseType='ErrorCodeEnumeration'"
	 * @generated
	 */
	EDataType getErrorCodeEnumerationObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.mdo.ibis.ibis_enumerations.ExitSideEnumeration <em>Exit Side Enumeration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Exit Side Enumeration Object</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.ExitSideEnumeration
	 * @model instanceClass="de.jena.mdo.ibis.ibis_enumerations.ExitSideEnumeration"
	 *        extendedMetaData="name='ExitSideEnumeration:Object' baseType='ExitSideEnumeration'"
	 * @generated
	 */
	EDataType getExitSideEnumerationObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.mdo.ibis.ibis_enumerations.FunicularSubmodeEnumeration <em>Funicular Submode Enumeration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Funicular Submode Enumeration Object</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.FunicularSubmodeEnumeration
	 * @model instanceClass="de.jena.mdo.ibis.ibis_enumerations.FunicularSubmodeEnumeration"
	 *        extendedMetaData="name='FunicularSubmodeEnumeration:Object' baseType='FunicularSubmodeEnumeration'"
	 * @generated
	 */
	EDataType getFunicularSubmodeEnumerationObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.mdo.ibis.ibis_enumerations.GNSSCoordinateSystemEnumeration <em>GNSS Coordinate System Enumeration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>GNSS Coordinate System Enumeration Object</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.GNSSCoordinateSystemEnumeration
	 * @model instanceClass="de.jena.mdo.ibis.ibis_enumerations.GNSSCoordinateSystemEnumeration"
	 *        extendedMetaData="name='GNSSCoordinateSystemEnumeration:Object' baseType='GNSSCoordinateSystemEnumeration'"
	 * @generated
	 */
	EDataType getGNSSCoordinateSystemEnumerationObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.mdo.ibis.ibis_enumerations.GNSSQualityEnumeration <em>GNSS Quality Enumeration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>GNSS Quality Enumeration Object</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.GNSSQualityEnumeration
	 * @model instanceClass="de.jena.mdo.ibis.ibis_enumerations.GNSSQualityEnumeration"
	 *        extendedMetaData="name='GNSSQualityEnumeration:Object' baseType='GNSSQualityEnumeration'"
	 * @generated
	 */
	EDataType getGNSSQualityEnumerationObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.mdo.ibis.ibis_enumerations.GNSSTypeEnumeration <em>GNSS Type Enumeration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>GNSS Type Enumeration Object</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.GNSSTypeEnumeration
	 * @model instanceClass="de.jena.mdo.ibis.ibis_enumerations.GNSSTypeEnumeration"
	 *        extendedMetaData="name='GNSSTypeEnumeration:Object' baseType='GNSSTypeEnumeration'"
	 * @generated
	 */
	EDataType getGNSSTypeEnumerationObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.mdo.ibis.ibis_enumerations.JourneyModeEnumeration <em>Journey Mode Enumeration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Journey Mode Enumeration Object</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.JourneyModeEnumeration
	 * @model instanceClass="de.jena.mdo.ibis.ibis_enumerations.JourneyModeEnumeration"
	 *        extendedMetaData="name='JourneyModeEnumeration:Object' baseType='JourneyModeEnumeration'"
	 * @generated
	 */
	EDataType getJourneyModeEnumerationObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.mdo.ibis.ibis_enumerations.LocationStateEnumeration <em>Location State Enumeration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Location State Enumeration Object</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.LocationStateEnumeration
	 * @model instanceClass="de.jena.mdo.ibis.ibis_enumerations.LocationStateEnumeration"
	 *        extendedMetaData="name='LocationStateEnumeration:Object' baseType='LocationStateEnumeration'"
	 * @generated
	 */
	EDataType getLocationStateEnumerationObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.mdo.ibis.ibis_enumerations.MessageTypeEnumeration <em>Message Type Enumeration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Message Type Enumeration Object</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.MessageTypeEnumeration
	 * @model instanceClass="de.jena.mdo.ibis.ibis_enumerations.MessageTypeEnumeration"
	 *        extendedMetaData="name='MessageTypeEnumeration:Object' baseType='MessageTypeEnumeration'"
	 * @generated
	 */
	EDataType getMessageTypeEnumerationObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.mdo.ibis.ibis_enumerations.MetroSubmodeEnumeration <em>Metro Submode Enumeration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Metro Submode Enumeration Object</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.MetroSubmodeEnumeration
	 * @model instanceClass="de.jena.mdo.ibis.ibis_enumerations.MetroSubmodeEnumeration"
	 *        extendedMetaData="name='MetroSubmodeEnumeration:Object' baseType='MetroSubmodeEnumeration'"
	 * @generated
	 */
	EDataType getMetroSubmodeEnumerationObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.mdo.ibis.ibis_enumerations.PrivateSubModesEnumeration <em>Private Sub Modes Enumeration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Private Sub Modes Enumeration Object</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.PrivateSubModesEnumeration
	 * @model instanceClass="de.jena.mdo.ibis.ibis_enumerations.PrivateSubModesEnumeration"
	 *        extendedMetaData="name='PrivateSubModesEnumeration:Object' baseType='PrivateSubModesEnumeration'"
	 * @generated
	 */
	EDataType getPrivateSubModesEnumerationObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.mdo.ibis.ibis_enumerations.PtSubModesEnumeration <em>Pt Sub Modes Enumeration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Pt Sub Modes Enumeration Object</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.PtSubModesEnumeration
	 * @model instanceClass="de.jena.mdo.ibis.ibis_enumerations.PtSubModesEnumeration"
	 *        extendedMetaData="name='PtSubModesEnumeration:Object' baseType='PtSubModesEnumeration'"
	 * @generated
	 */
	EDataType getPtSubModesEnumerationObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.mdo.ibis.ibis_enumerations.RailSubmodeEnumeration <em>Rail Submode Enumeration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rail Submode Enumeration Object</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.RailSubmodeEnumeration
	 * @model instanceClass="de.jena.mdo.ibis.ibis_enumerations.RailSubmodeEnumeration"
	 *        extendedMetaData="name='RailSubmodeEnumeration:Object' baseType='RailSubmodeEnumeration'"
	 * @generated
	 */
	EDataType getRailSubmodeEnumerationObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.mdo.ibis.ibis_enumerations.RouteDeviationEnumeration <em>Route Deviation Enumeration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Route Deviation Enumeration Object</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.RouteDeviationEnumeration
	 * @model instanceClass="de.jena.mdo.ibis.ibis_enumerations.RouteDeviationEnumeration"
	 *        extendedMetaData="name='RouteDeviationEnumeration:Object' baseType='RouteDeviationEnumeration'"
	 * @generated
	 */
	EDataType getRouteDeviationEnumerationObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.mdo.ibis.ibis_enumerations.RouteDirectionEnumeration <em>Route Direction Enumeration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Route Direction Enumeration Object</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.RouteDirectionEnumeration
	 * @model instanceClass="de.jena.mdo.ibis.ibis_enumerations.RouteDirectionEnumeration"
	 *        extendedMetaData="name='RouteDirectionEnumeration:Object' baseType='RouteDirectionEnumeration'"
	 * @generated
	 */
	EDataType getRouteDirectionEnumerationObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.mdo.ibis.ibis_enumerations.SelfDriveSubmodeEnumeration <em>Self Drive Submode Enumeration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Self Drive Submode Enumeration Object</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.SelfDriveSubmodeEnumeration
	 * @model instanceClass="de.jena.mdo.ibis.ibis_enumerations.SelfDriveSubmodeEnumeration"
	 *        extendedMetaData="name='SelfDriveSubmodeEnumeration:Object' baseType='SelfDriveSubmodeEnumeration'"
	 * @generated
	 */
	EDataType getSelfDriveSubmodeEnumerationObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.mdo.ibis.ibis_enumerations.ServiceNameEnumeration <em>Service Name Enumeration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Service Name Enumeration Object</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.ServiceNameEnumeration
	 * @model instanceClass="de.jena.mdo.ibis.ibis_enumerations.ServiceNameEnumeration"
	 *        extendedMetaData="name='ServiceNameEnumeration:Object' baseType='ServiceNameEnumeration'"
	 * @generated
	 */
	EDataType getServiceNameEnumerationObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.mdo.ibis.ibis_enumerations.ServiceStateEnumeration <em>Service State Enumeration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Service State Enumeration Object</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.ServiceStateEnumeration
	 * @model instanceClass="de.jena.mdo.ibis.ibis_enumerations.ServiceStateEnumeration"
	 *        extendedMetaData="name='ServiceStateEnumeration:Object' baseType='ServiceStateEnumeration'"
	 * @generated
	 */
	EDataType getServiceStateEnumerationObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.mdo.ibis.ibis_enumerations.SystemDocumentationInformationEnumeration <em>System Documentation Information Enumeration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>System Documentation Information Enumeration Object</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.SystemDocumentationInformationEnumeration
	 * @model instanceClass="de.jena.mdo.ibis.ibis_enumerations.SystemDocumentationInformationEnumeration"
	 *        extendedMetaData="name='SystemDocumentationInformationEnumeration:Object' baseType='SystemDocumentationInformationEnumeration'"
	 * @generated
	 */
	EDataType getSystemDocumentationInformationEnumerationObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.mdo.ibis.ibis_enumerations.TaxiSubmodeEnumeration <em>Taxi Submode Enumeration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Taxi Submode Enumeration Object</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.TaxiSubmodeEnumeration
	 * @model instanceClass="de.jena.mdo.ibis.ibis_enumerations.TaxiSubmodeEnumeration"
	 *        extendedMetaData="name='TaxiSubmodeEnumeration:Object' baseType='TaxiSubmodeEnumeration'"
	 * @generated
	 */
	EDataType getTaxiSubmodeEnumerationObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.mdo.ibis.ibis_enumerations.TelecabinSubmodeEnumeration <em>Telecabin Submode Enumeration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Telecabin Submode Enumeration Object</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.TelecabinSubmodeEnumeration
	 * @model instanceClass="de.jena.mdo.ibis.ibis_enumerations.TelecabinSubmodeEnumeration"
	 *        extendedMetaData="name='TelecabinSubmodeEnumeration:Object' baseType='TelecabinSubmodeEnumeration'"
	 * @generated
	 */
	EDataType getTelecabinSubmodeEnumerationObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.mdo.ibis.ibis_enumerations.TicketRazziaInformationEnumeration <em>Ticket Razzia Information Enumeration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ticket Razzia Information Enumeration Object</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.TicketRazziaInformationEnumeration
	 * @model instanceClass="de.jena.mdo.ibis.ibis_enumerations.TicketRazziaInformationEnumeration"
	 *        extendedMetaData="name='TicketRazziaInformationEnumeration:Object' baseType='TicketRazziaInformationEnumeration'"
	 * @generated
	 */
	EDataType getTicketRazziaInformationEnumerationObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.mdo.ibis.ibis_enumerations.TicketValidationEnumeration <em>Ticket Validation Enumeration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ticket Validation Enumeration Object</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.TicketValidationEnumeration
	 * @model instanceClass="de.jena.mdo.ibis.ibis_enumerations.TicketValidationEnumeration"
	 *        extendedMetaData="name='TicketValidationEnumeration:Object' baseType='TicketValidationEnumeration'"
	 * @generated
	 */
	EDataType getTicketValidationEnumerationObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.mdo.ibis.ibis_enumerations.TramSubmodeEnumeration <em>Tram Submode Enumeration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Tram Submode Enumeration Object</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.TramSubmodeEnumeration
	 * @model instanceClass="de.jena.mdo.ibis.ibis_enumerations.TramSubmodeEnumeration"
	 *        extendedMetaData="name='TramSubmodeEnumeration:Object' baseType='TramSubmodeEnumeration'"
	 * @generated
	 */
	EDataType getTramSubmodeEnumerationObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.mdo.ibis.ibis_enumerations.TripStateEnumeration <em>Trip State Enumeration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Trip State Enumeration Object</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.TripStateEnumeration
	 * @model instanceClass="de.jena.mdo.ibis.ibis_enumerations.TripStateEnumeration"
	 *        extendedMetaData="name='TripStateEnumeration:Object' baseType='TripStateEnumeration'"
	 * @generated
	 */
	EDataType getTripStateEnumerationObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.mdo.ibis.ibis_enumerations.VehicleModeEnumeration <em>Vehicle Mode Enumeration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Vehicle Mode Enumeration Object</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.VehicleModeEnumeration
	 * @model instanceClass="de.jena.mdo.ibis.ibis_enumerations.VehicleModeEnumeration"
	 *        extendedMetaData="name='VehicleModeEnumeration:Object' baseType='VehicleModeEnumeration'"
	 * @generated
	 */
	EDataType getVehicleModeEnumerationObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.mdo.ibis.ibis_enumerations.WaterSubmodeEnumeration <em>Water Submode Enumeration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Water Submode Enumeration Object</em>'.
	 * @see de.jena.mdo.ibis.ibis_enumerations.WaterSubmodeEnumeration
	 * @model instanceClass="de.jena.mdo.ibis.ibis_enumerations.WaterSubmodeEnumeration"
	 *        extendedMetaData="name='WaterSubmodeEnumeration:Object' baseType='WaterSubmodeEnumeration'"
	 * @generated
	 */
	EDataType getWaterSubmodeEnumerationObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IbisEnumerationsFactory getIbisEnumerationsFactory();

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
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_enumerations.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.DocumentRootImpl
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Air Submode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__AIR_SUBMODE = eINSTANCE.getDocumentRoot_AirSubmode();

		/**
		 * The meta object literal for the '<em><b>Bus Submode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__BUS_SUBMODE = eINSTANCE.getDocumentRoot_BusSubmode();

		/**
		 * The meta object literal for the '<em><b>Coach Submode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__COACH_SUBMODE = eINSTANCE.getDocumentRoot_CoachSubmode();

		/**
		 * The meta object literal for the '<em><b>Funicular Submode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__FUNICULAR_SUBMODE = eINSTANCE.getDocumentRoot_FunicularSubmode();

		/**
		 * The meta object literal for the '<em><b>Metro Submode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__METRO_SUBMODE = eINSTANCE.getDocumentRoot_MetroSubmode();

		/**
		 * The meta object literal for the '<em><b>Rail Submode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__RAIL_SUBMODE = eINSTANCE.getDocumentRoot_RailSubmode();

		/**
		 * The meta object literal for the '<em><b>Self Drive Submode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SELF_DRIVE_SUBMODE = eINSTANCE.getDocumentRoot_SelfDriveSubmode();

		/**
		 * The meta object literal for the '<em><b>Taxi Submode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TAXI_SUBMODE = eINSTANCE.getDocumentRoot_TaxiSubmode();

		/**
		 * The meta object literal for the '<em><b>Telecabin Submode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TELECABIN_SUBMODE = eINSTANCE.getDocumentRoot_TelecabinSubmode();

		/**
		 * The meta object literal for the '<em><b>Tram Submode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TRAM_SUBMODE = eINSTANCE.getDocumentRoot_TramSubmode();

		/**
		 * The meta object literal for the '<em><b>Water Submode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__WATER_SUBMODE = eINSTANCE.getDocumentRoot_WaterSubmode();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_enumerations.AirSubmodeEnumeration <em>Air Submode Enumeration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.AirSubmodeEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getAirSubmodeEnumeration()
		 * @generated
		 */
		EEnum AIR_SUBMODE_ENUMERATION = eINSTANCE.getAirSubmodeEnumeration();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_enumerations.BusSubmodeEnumeration <em>Bus Submode Enumeration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.BusSubmodeEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getBusSubmodeEnumeration()
		 * @generated
		 */
		EEnum BUS_SUBMODE_ENUMERATION = eINSTANCE.getBusSubmodeEnumeration();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_enumerations.CoachSubmodeEnumeration <em>Coach Submode Enumeration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.CoachSubmodeEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getCoachSubmodeEnumeration()
		 * @generated
		 */
		EEnum COACH_SUBMODE_ENUMERATION = eINSTANCE.getCoachSubmodeEnumeration();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_enumerations.ConnectionStateEnumeration <em>Connection State Enumeration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.ConnectionStateEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getConnectionStateEnumeration()
		 * @generated
		 */
		EEnum CONNECTION_STATE_ENUMERATION = eINSTANCE.getConnectionStateEnumeration();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_enumerations.ConnectionTypeEnumeration <em>Connection Type Enumeration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.ConnectionTypeEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getConnectionTypeEnumeration()
		 * @generated
		 */
		EEnum CONNECTION_TYPE_ENUMERATION = eINSTANCE.getConnectionTypeEnumeration();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_enumerations.DataIntervalEnumeration <em>Data Interval Enumeration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.DataIntervalEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getDataIntervalEnumeration()
		 * @generated
		 */
		EEnum DATA_INTERVAL_ENUMERATION = eINSTANCE.getDataIntervalEnumeration();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_enumerations.DeviceClassEnumeration <em>Device Class Enumeration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.DeviceClassEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getDeviceClassEnumeration()
		 * @generated
		 */
		EEnum DEVICE_CLASS_ENUMERATION = eINSTANCE.getDeviceClassEnumeration();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_enumerations.DeviceStateEnumeration <em>Device State Enumeration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.DeviceStateEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getDeviceStateEnumeration()
		 * @generated
		 */
		EEnum DEVICE_STATE_ENUMERATION = eINSTANCE.getDeviceStateEnumeration();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_enumerations.DeviceTaskEnumeration <em>Device Task Enumeration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.DeviceTaskEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getDeviceTaskEnumeration()
		 * @generated
		 */
		EEnum DEVICE_TASK_ENUMERATION = eINSTANCE.getDeviceTaskEnumeration();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_enumerations.DoorCountingObjectClassEnumeration <em>Door Counting Object Class Enumeration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.DoorCountingObjectClassEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getDoorCountingObjectClassEnumeration()
		 * @generated
		 */
		EEnum DOOR_COUNTING_OBJECT_CLASS_ENUMERATION = eINSTANCE.getDoorCountingObjectClassEnumeration();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_enumerations.DoorCountingQualityEnumeration <em>Door Counting Quality Enumeration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.DoorCountingQualityEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getDoorCountingQualityEnumeration()
		 * @generated
		 */
		EEnum DOOR_COUNTING_QUALITY_ENUMERATION = eINSTANCE.getDoorCountingQualityEnumeration();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_enumerations.DoorOpenStateEnumeration <em>Door Open State Enumeration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.DoorOpenStateEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getDoorOpenStateEnumeration()
		 * @generated
		 */
		EEnum DOOR_OPEN_STATE_ENUMERATION = eINSTANCE.getDoorOpenStateEnumeration();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_enumerations.DoorOperationStateEnumeration <em>Door Operation State Enumeration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.DoorOperationStateEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getDoorOperationStateEnumeration()
		 * @generated
		 */
		EEnum DOOR_OPERATION_STATE_ENUMERATION = eINSTANCE.getDoorOperationStateEnumeration();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_enumerations.ErrorCodeEnumeration <em>Error Code Enumeration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.ErrorCodeEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getErrorCodeEnumeration()
		 * @generated
		 */
		EEnum ERROR_CODE_ENUMERATION = eINSTANCE.getErrorCodeEnumeration();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_enumerations.ExitSideEnumeration <em>Exit Side Enumeration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.ExitSideEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getExitSideEnumeration()
		 * @generated
		 */
		EEnum EXIT_SIDE_ENUMERATION = eINSTANCE.getExitSideEnumeration();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_enumerations.FunicularSubmodeEnumeration <em>Funicular Submode Enumeration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.FunicularSubmodeEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getFunicularSubmodeEnumeration()
		 * @generated
		 */
		EEnum FUNICULAR_SUBMODE_ENUMERATION = eINSTANCE.getFunicularSubmodeEnumeration();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_enumerations.GNSSCoordinateSystemEnumeration <em>GNSS Coordinate System Enumeration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.GNSSCoordinateSystemEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getGNSSCoordinateSystemEnumeration()
		 * @generated
		 */
		EEnum GNSS_COORDINATE_SYSTEM_ENUMERATION = eINSTANCE.getGNSSCoordinateSystemEnumeration();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_enumerations.GNSSQualityEnumeration <em>GNSS Quality Enumeration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.GNSSQualityEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getGNSSQualityEnumeration()
		 * @generated
		 */
		EEnum GNSS_QUALITY_ENUMERATION = eINSTANCE.getGNSSQualityEnumeration();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_enumerations.GNSSTypeEnumeration <em>GNSS Type Enumeration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.GNSSTypeEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getGNSSTypeEnumeration()
		 * @generated
		 */
		EEnum GNSS_TYPE_ENUMERATION = eINSTANCE.getGNSSTypeEnumeration();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_enumerations.JourneyModeEnumeration <em>Journey Mode Enumeration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.JourneyModeEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getJourneyModeEnumeration()
		 * @generated
		 */
		EEnum JOURNEY_MODE_ENUMERATION = eINSTANCE.getJourneyModeEnumeration();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_enumerations.LocationStateEnumeration <em>Location State Enumeration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.LocationStateEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getLocationStateEnumeration()
		 * @generated
		 */
		EEnum LOCATION_STATE_ENUMERATION = eINSTANCE.getLocationStateEnumeration();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_enumerations.MessageTypeEnumeration <em>Message Type Enumeration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.MessageTypeEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getMessageTypeEnumeration()
		 * @generated
		 */
		EEnum MESSAGE_TYPE_ENUMERATION = eINSTANCE.getMessageTypeEnumeration();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_enumerations.MetroSubmodeEnumeration <em>Metro Submode Enumeration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.MetroSubmodeEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getMetroSubmodeEnumeration()
		 * @generated
		 */
		EEnum METRO_SUBMODE_ENUMERATION = eINSTANCE.getMetroSubmodeEnumeration();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_enumerations.PrivateSubModesEnumeration <em>Private Sub Modes Enumeration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.PrivateSubModesEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getPrivateSubModesEnumeration()
		 * @generated
		 */
		EEnum PRIVATE_SUB_MODES_ENUMERATION = eINSTANCE.getPrivateSubModesEnumeration();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_enumerations.PtSubModesEnumeration <em>Pt Sub Modes Enumeration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.PtSubModesEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getPtSubModesEnumeration()
		 * @generated
		 */
		EEnum PT_SUB_MODES_ENUMERATION = eINSTANCE.getPtSubModesEnumeration();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_enumerations.RailSubmodeEnumeration <em>Rail Submode Enumeration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.RailSubmodeEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getRailSubmodeEnumeration()
		 * @generated
		 */
		EEnum RAIL_SUBMODE_ENUMERATION = eINSTANCE.getRailSubmodeEnumeration();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_enumerations.RouteDeviationEnumeration <em>Route Deviation Enumeration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.RouteDeviationEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getRouteDeviationEnumeration()
		 * @generated
		 */
		EEnum ROUTE_DEVIATION_ENUMERATION = eINSTANCE.getRouteDeviationEnumeration();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_enumerations.RouteDirectionEnumeration <em>Route Direction Enumeration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.RouteDirectionEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getRouteDirectionEnumeration()
		 * @generated
		 */
		EEnum ROUTE_DIRECTION_ENUMERATION = eINSTANCE.getRouteDirectionEnumeration();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_enumerations.SelfDriveSubmodeEnumeration <em>Self Drive Submode Enumeration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.SelfDriveSubmodeEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getSelfDriveSubmodeEnumeration()
		 * @generated
		 */
		EEnum SELF_DRIVE_SUBMODE_ENUMERATION = eINSTANCE.getSelfDriveSubmodeEnumeration();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_enumerations.ServiceNameEnumeration <em>Service Name Enumeration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.ServiceNameEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getServiceNameEnumeration()
		 * @generated
		 */
		EEnum SERVICE_NAME_ENUMERATION = eINSTANCE.getServiceNameEnumeration();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_enumerations.ServiceStateEnumeration <em>Service State Enumeration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.ServiceStateEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getServiceStateEnumeration()
		 * @generated
		 */
		EEnum SERVICE_STATE_ENUMERATION = eINSTANCE.getServiceStateEnumeration();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_enumerations.SystemDocumentationInformationEnumeration <em>System Documentation Information Enumeration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.SystemDocumentationInformationEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getSystemDocumentationInformationEnumeration()
		 * @generated
		 */
		EEnum SYSTEM_DOCUMENTATION_INFORMATION_ENUMERATION = eINSTANCE.getSystemDocumentationInformationEnumeration();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_enumerations.TaxiSubmodeEnumeration <em>Taxi Submode Enumeration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.TaxiSubmodeEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getTaxiSubmodeEnumeration()
		 * @generated
		 */
		EEnum TAXI_SUBMODE_ENUMERATION = eINSTANCE.getTaxiSubmodeEnumeration();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_enumerations.TelecabinSubmodeEnumeration <em>Telecabin Submode Enumeration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.TelecabinSubmodeEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getTelecabinSubmodeEnumeration()
		 * @generated
		 */
		EEnum TELECABIN_SUBMODE_ENUMERATION = eINSTANCE.getTelecabinSubmodeEnumeration();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_enumerations.TicketRazziaInformationEnumeration <em>Ticket Razzia Information Enumeration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.TicketRazziaInformationEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getTicketRazziaInformationEnumeration()
		 * @generated
		 */
		EEnum TICKET_RAZZIA_INFORMATION_ENUMERATION = eINSTANCE.getTicketRazziaInformationEnumeration();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_enumerations.TicketValidationEnumeration <em>Ticket Validation Enumeration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.TicketValidationEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getTicketValidationEnumeration()
		 * @generated
		 */
		EEnum TICKET_VALIDATION_ENUMERATION = eINSTANCE.getTicketValidationEnumeration();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_enumerations.TramSubmodeEnumeration <em>Tram Submode Enumeration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.TramSubmodeEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getTramSubmodeEnumeration()
		 * @generated
		 */
		EEnum TRAM_SUBMODE_ENUMERATION = eINSTANCE.getTramSubmodeEnumeration();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_enumerations.TripStateEnumeration <em>Trip State Enumeration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.TripStateEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getTripStateEnumeration()
		 * @generated
		 */
		EEnum TRIP_STATE_ENUMERATION = eINSTANCE.getTripStateEnumeration();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_enumerations.VehicleModeEnumeration <em>Vehicle Mode Enumeration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.VehicleModeEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getVehicleModeEnumeration()
		 * @generated
		 */
		EEnum VEHICLE_MODE_ENUMERATION = eINSTANCE.getVehicleModeEnumeration();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_enumerations.WaterSubmodeEnumeration <em>Water Submode Enumeration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.WaterSubmodeEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getWaterSubmodeEnumeration()
		 * @generated
		 */
		EEnum WATER_SUBMODE_ENUMERATION = eINSTANCE.getWaterSubmodeEnumeration();

		/**
		 * The meta object literal for the '<em>Air Submode Enumeration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.AirSubmodeEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getAirSubmodeEnumerationObject()
		 * @generated
		 */
		EDataType AIR_SUBMODE_ENUMERATION_OBJECT = eINSTANCE.getAirSubmodeEnumerationObject();

		/**
		 * The meta object literal for the '<em>Bus Submode Enumeration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.BusSubmodeEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getBusSubmodeEnumerationObject()
		 * @generated
		 */
		EDataType BUS_SUBMODE_ENUMERATION_OBJECT = eINSTANCE.getBusSubmodeEnumerationObject();

		/**
		 * The meta object literal for the '<em>Coach Submode Enumeration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.CoachSubmodeEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getCoachSubmodeEnumerationObject()
		 * @generated
		 */
		EDataType COACH_SUBMODE_ENUMERATION_OBJECT = eINSTANCE.getCoachSubmodeEnumerationObject();

		/**
		 * The meta object literal for the '<em>Connection State Enumeration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.ConnectionStateEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getConnectionStateEnumerationObject()
		 * @generated
		 */
		EDataType CONNECTION_STATE_ENUMERATION_OBJECT = eINSTANCE.getConnectionStateEnumerationObject();

		/**
		 * The meta object literal for the '<em>Connection Type Enumeration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.ConnectionTypeEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getConnectionTypeEnumerationObject()
		 * @generated
		 */
		EDataType CONNECTION_TYPE_ENUMERATION_OBJECT = eINSTANCE.getConnectionTypeEnumerationObject();

		/**
		 * The meta object literal for the '<em>Data Interval Enumeration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.DataIntervalEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getDataIntervalEnumerationObject()
		 * @generated
		 */
		EDataType DATA_INTERVAL_ENUMERATION_OBJECT = eINSTANCE.getDataIntervalEnumerationObject();

		/**
		 * The meta object literal for the '<em>Device Class Enumeration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.DeviceClassEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getDeviceClassEnumerationObject()
		 * @generated
		 */
		EDataType DEVICE_CLASS_ENUMERATION_OBJECT = eINSTANCE.getDeviceClassEnumerationObject();

		/**
		 * The meta object literal for the '<em>Device State Enumeration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.DeviceStateEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getDeviceStateEnumerationObject()
		 * @generated
		 */
		EDataType DEVICE_STATE_ENUMERATION_OBJECT = eINSTANCE.getDeviceStateEnumerationObject();

		/**
		 * The meta object literal for the '<em>Device Task Enumeration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.DeviceTaskEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getDeviceTaskEnumerationObject()
		 * @generated
		 */
		EDataType DEVICE_TASK_ENUMERATION_OBJECT = eINSTANCE.getDeviceTaskEnumerationObject();

		/**
		 * The meta object literal for the '<em>Door Counting Object Class Enumeration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.DoorCountingObjectClassEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getDoorCountingObjectClassEnumerationObject()
		 * @generated
		 */
		EDataType DOOR_COUNTING_OBJECT_CLASS_ENUMERATION_OBJECT = eINSTANCE.getDoorCountingObjectClassEnumerationObject();

		/**
		 * The meta object literal for the '<em>Door Counting Quality Enumeration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.DoorCountingQualityEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getDoorCountingQualityEnumerationObject()
		 * @generated
		 */
		EDataType DOOR_COUNTING_QUALITY_ENUMERATION_OBJECT = eINSTANCE.getDoorCountingQualityEnumerationObject();

		/**
		 * The meta object literal for the '<em>Door Open State Enumeration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.DoorOpenStateEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getDoorOpenStateEnumerationObject()
		 * @generated
		 */
		EDataType DOOR_OPEN_STATE_ENUMERATION_OBJECT = eINSTANCE.getDoorOpenStateEnumerationObject();

		/**
		 * The meta object literal for the '<em>Door Operation State Enumeration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.DoorOperationStateEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getDoorOperationStateEnumerationObject()
		 * @generated
		 */
		EDataType DOOR_OPERATION_STATE_ENUMERATION_OBJECT = eINSTANCE.getDoorOperationStateEnumerationObject();

		/**
		 * The meta object literal for the '<em>Error Code Enumeration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.ErrorCodeEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getErrorCodeEnumerationObject()
		 * @generated
		 */
		EDataType ERROR_CODE_ENUMERATION_OBJECT = eINSTANCE.getErrorCodeEnumerationObject();

		/**
		 * The meta object literal for the '<em>Exit Side Enumeration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.ExitSideEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getExitSideEnumerationObject()
		 * @generated
		 */
		EDataType EXIT_SIDE_ENUMERATION_OBJECT = eINSTANCE.getExitSideEnumerationObject();

		/**
		 * The meta object literal for the '<em>Funicular Submode Enumeration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.FunicularSubmodeEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getFunicularSubmodeEnumerationObject()
		 * @generated
		 */
		EDataType FUNICULAR_SUBMODE_ENUMERATION_OBJECT = eINSTANCE.getFunicularSubmodeEnumerationObject();

		/**
		 * The meta object literal for the '<em>GNSS Coordinate System Enumeration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.GNSSCoordinateSystemEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getGNSSCoordinateSystemEnumerationObject()
		 * @generated
		 */
		EDataType GNSS_COORDINATE_SYSTEM_ENUMERATION_OBJECT = eINSTANCE.getGNSSCoordinateSystemEnumerationObject();

		/**
		 * The meta object literal for the '<em>GNSS Quality Enumeration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.GNSSQualityEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getGNSSQualityEnumerationObject()
		 * @generated
		 */
		EDataType GNSS_QUALITY_ENUMERATION_OBJECT = eINSTANCE.getGNSSQualityEnumerationObject();

		/**
		 * The meta object literal for the '<em>GNSS Type Enumeration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.GNSSTypeEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getGNSSTypeEnumerationObject()
		 * @generated
		 */
		EDataType GNSS_TYPE_ENUMERATION_OBJECT = eINSTANCE.getGNSSTypeEnumerationObject();

		/**
		 * The meta object literal for the '<em>Journey Mode Enumeration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.JourneyModeEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getJourneyModeEnumerationObject()
		 * @generated
		 */
		EDataType JOURNEY_MODE_ENUMERATION_OBJECT = eINSTANCE.getJourneyModeEnumerationObject();

		/**
		 * The meta object literal for the '<em>Location State Enumeration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.LocationStateEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getLocationStateEnumerationObject()
		 * @generated
		 */
		EDataType LOCATION_STATE_ENUMERATION_OBJECT = eINSTANCE.getLocationStateEnumerationObject();

		/**
		 * The meta object literal for the '<em>Message Type Enumeration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.MessageTypeEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getMessageTypeEnumerationObject()
		 * @generated
		 */
		EDataType MESSAGE_TYPE_ENUMERATION_OBJECT = eINSTANCE.getMessageTypeEnumerationObject();

		/**
		 * The meta object literal for the '<em>Metro Submode Enumeration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.MetroSubmodeEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getMetroSubmodeEnumerationObject()
		 * @generated
		 */
		EDataType METRO_SUBMODE_ENUMERATION_OBJECT = eINSTANCE.getMetroSubmodeEnumerationObject();

		/**
		 * The meta object literal for the '<em>Private Sub Modes Enumeration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.PrivateSubModesEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getPrivateSubModesEnumerationObject()
		 * @generated
		 */
		EDataType PRIVATE_SUB_MODES_ENUMERATION_OBJECT = eINSTANCE.getPrivateSubModesEnumerationObject();

		/**
		 * The meta object literal for the '<em>Pt Sub Modes Enumeration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.PtSubModesEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getPtSubModesEnumerationObject()
		 * @generated
		 */
		EDataType PT_SUB_MODES_ENUMERATION_OBJECT = eINSTANCE.getPtSubModesEnumerationObject();

		/**
		 * The meta object literal for the '<em>Rail Submode Enumeration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.RailSubmodeEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getRailSubmodeEnumerationObject()
		 * @generated
		 */
		EDataType RAIL_SUBMODE_ENUMERATION_OBJECT = eINSTANCE.getRailSubmodeEnumerationObject();

		/**
		 * The meta object literal for the '<em>Route Deviation Enumeration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.RouteDeviationEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getRouteDeviationEnumerationObject()
		 * @generated
		 */
		EDataType ROUTE_DEVIATION_ENUMERATION_OBJECT = eINSTANCE.getRouteDeviationEnumerationObject();

		/**
		 * The meta object literal for the '<em>Route Direction Enumeration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.RouteDirectionEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getRouteDirectionEnumerationObject()
		 * @generated
		 */
		EDataType ROUTE_DIRECTION_ENUMERATION_OBJECT = eINSTANCE.getRouteDirectionEnumerationObject();

		/**
		 * The meta object literal for the '<em>Self Drive Submode Enumeration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.SelfDriveSubmodeEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getSelfDriveSubmodeEnumerationObject()
		 * @generated
		 */
		EDataType SELF_DRIVE_SUBMODE_ENUMERATION_OBJECT = eINSTANCE.getSelfDriveSubmodeEnumerationObject();

		/**
		 * The meta object literal for the '<em>Service Name Enumeration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.ServiceNameEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getServiceNameEnumerationObject()
		 * @generated
		 */
		EDataType SERVICE_NAME_ENUMERATION_OBJECT = eINSTANCE.getServiceNameEnumerationObject();

		/**
		 * The meta object literal for the '<em>Service State Enumeration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.ServiceStateEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getServiceStateEnumerationObject()
		 * @generated
		 */
		EDataType SERVICE_STATE_ENUMERATION_OBJECT = eINSTANCE.getServiceStateEnumerationObject();

		/**
		 * The meta object literal for the '<em>System Documentation Information Enumeration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.SystemDocumentationInformationEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getSystemDocumentationInformationEnumerationObject()
		 * @generated
		 */
		EDataType SYSTEM_DOCUMENTATION_INFORMATION_ENUMERATION_OBJECT = eINSTANCE.getSystemDocumentationInformationEnumerationObject();

		/**
		 * The meta object literal for the '<em>Taxi Submode Enumeration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.TaxiSubmodeEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getTaxiSubmodeEnumerationObject()
		 * @generated
		 */
		EDataType TAXI_SUBMODE_ENUMERATION_OBJECT = eINSTANCE.getTaxiSubmodeEnumerationObject();

		/**
		 * The meta object literal for the '<em>Telecabin Submode Enumeration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.TelecabinSubmodeEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getTelecabinSubmodeEnumerationObject()
		 * @generated
		 */
		EDataType TELECABIN_SUBMODE_ENUMERATION_OBJECT = eINSTANCE.getTelecabinSubmodeEnumerationObject();

		/**
		 * The meta object literal for the '<em>Ticket Razzia Information Enumeration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.TicketRazziaInformationEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getTicketRazziaInformationEnumerationObject()
		 * @generated
		 */
		EDataType TICKET_RAZZIA_INFORMATION_ENUMERATION_OBJECT = eINSTANCE.getTicketRazziaInformationEnumerationObject();

		/**
		 * The meta object literal for the '<em>Ticket Validation Enumeration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.TicketValidationEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getTicketValidationEnumerationObject()
		 * @generated
		 */
		EDataType TICKET_VALIDATION_ENUMERATION_OBJECT = eINSTANCE.getTicketValidationEnumerationObject();

		/**
		 * The meta object literal for the '<em>Tram Submode Enumeration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.TramSubmodeEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getTramSubmodeEnumerationObject()
		 * @generated
		 */
		EDataType TRAM_SUBMODE_ENUMERATION_OBJECT = eINSTANCE.getTramSubmodeEnumerationObject();

		/**
		 * The meta object literal for the '<em>Trip State Enumeration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.TripStateEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getTripStateEnumerationObject()
		 * @generated
		 */
		EDataType TRIP_STATE_ENUMERATION_OBJECT = eINSTANCE.getTripStateEnumerationObject();

		/**
		 * The meta object literal for the '<em>Vehicle Mode Enumeration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.VehicleModeEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getVehicleModeEnumerationObject()
		 * @generated
		 */
		EDataType VEHICLE_MODE_ENUMERATION_OBJECT = eINSTANCE.getVehicleModeEnumerationObject();

		/**
		 * The meta object literal for the '<em>Water Submode Enumeration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_enumerations.WaterSubmodeEnumeration
		 * @see de.jena.mdo.ibis.ibis_enumerations.impl.IbisEnumerationsPackageImpl#getWaterSubmodeEnumerationObject()
		 * @generated
		 */
		EDataType WATER_SUBMODE_ENUMERATION_OBJECT = eINSTANCE.getWaterSubmodeEnumerationObject();

	}

} //IbisEnumerationsPackage
