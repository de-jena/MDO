/*
 */
package de.jena.mdo.ibis.devicemanagementservice;

import de.jena.mdo.ibis.common.IbisCommonPackage;

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
 * @see de.jena.mdo.ibis.devicemanagementservice.IbisDeviceManagementServiceFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
public interface IbisDeviceManagementServicePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "devicemanagementservice";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://jena.de/mdo/ibis-devicemanagementservice/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "devicemanagementservice";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IbisDeviceManagementServicePackage eINSTANCE = de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.ChecksumStructureImpl <em>Checksum Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.ChecksumStructureImpl
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getChecksumStructure()
	 * @generated
	 */
	int CHECKSUM_STRUCTURE = 0;

	/**
	 * The feature id for the '<em><b>Checksum Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSUM_STRUCTURE__CHECKSUM_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Checksum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSUM_STRUCTURE__CHECKSUM = 1;

	/**
	 * The number of structural features of the '<em>Checksum Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSUM_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Checksum Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSUM_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceFinalizeUpdateRequestStructureImpl <em>Device Management Service Finalize Update Request Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceFinalizeUpdateRequestStructureImpl
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceFinalizeUpdateRequestStructure()
	 * @generated
	 */
	int DEVICE_MANAGEMENT_SERVICE_FINALIZE_UPDATE_REQUEST_STRUCTURE = 1;

	/**
	 * The feature id for the '<em><b>Update ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_FINALIZE_UPDATE_REQUEST_STRUCTURE__UPDATE_ID = 0;

	/**
	 * The number of structural features of the '<em>Device Management Service Finalize Update Request Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_FINALIZE_UPDATE_REQUEST_STRUCTURE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Device Management Service Finalize Update Request Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_FINALIZE_UPDATE_REQUEST_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceFinalizeUpdateResponseStructureImpl <em>Device Management Service Finalize Update Response Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceFinalizeUpdateResponseStructureImpl
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceFinalizeUpdateResponseStructure()
	 * @generated
	 */
	int DEVICE_MANAGEMENT_SERVICE_FINALIZE_UPDATE_RESPONSE_STRUCTURE = 2;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_FINALIZE_UPDATE_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Update Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_FINALIZE_UPDATE_RESPONSE_STRUCTURE__UPDATE_STATUS = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Device Management Service Finalize Update Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_FINALIZE_UPDATE_RESPONSE_STRUCTURE_FEATURE_COUNT = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Device Management Service Finalize Update Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_FINALIZE_UPDATE_RESPONSE_STRUCTURE_OPERATION_COUNT = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructureImpl <em>Device Management Service Get All Subdevice Error Messages Response Data Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructureImpl
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure()
	 * @generated
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_DATA_STRUCTURE = 3;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_DATA_STRUCTURE__TIME_STAMP = 0;

	/**
	 * The feature id for the '<em><b>Subdevice Error Messages List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_DATA_STRUCTURE__SUBDEVICE_ERROR_MESSAGES_LIST = 1;

	/**
	 * The number of structural features of the '<em>Device Management Service Get All Subdevice Error Messages Response Data Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_DATA_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Device Management Service Get All Subdevice Error Messages Response Data Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_DATA_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructureImpl <em>Device Management Service Get All Subdevice Error Messages Response Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructureImpl
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure()
	 * @generated
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_STRUCTURE = 4;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Device Management Service Get All Subdevice Error Messages Response Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_DATA = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Device Management Service Get All Subdevice Error Messages Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_STRUCTURE_FEATURE_COUNT = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Device Management Service Get All Subdevice Error Messages Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_STRUCTURE_OPERATION_COUNT = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetAllSubdeviceInformationResponseDataStructureImpl <em>Device Management Service Get All Subdevice Information Response Data Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetAllSubdeviceInformationResponseDataStructureImpl
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure()
	 * @generated
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_INFORMATION_RESPONSE_DATA_STRUCTURE = 5;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_INFORMATION_RESPONSE_DATA_STRUCTURE__TIME_STAMP = 0;

	/**
	 * The feature id for the '<em><b>Subdevice Information List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_INFORMATION_RESPONSE_DATA_STRUCTURE__SUBDEVICE_INFORMATION_LIST = 1;

	/**
	 * The number of structural features of the '<em>Device Management Service Get All Subdevice Information Response Data Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_INFORMATION_RESPONSE_DATA_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Device Management Service Get All Subdevice Information Response Data Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_INFORMATION_RESPONSE_DATA_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetAllSubdeviceInformationResponseStructureImpl <em>Device Management Service Get All Subdevice Information Response Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetAllSubdeviceInformationResponseStructureImpl
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceGetAllSubdeviceInformationResponseStructure()
	 * @generated
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_INFORMATION_RESPONSE_STRUCTURE = 6;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_INFORMATION_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Device Management Service Get All Subdevice Information Response Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_INFORMATION_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_INFORMATION_RESPONSE_DATA = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Device Management Service Get All Subdevice Information Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_INFORMATION_RESPONSE_STRUCTURE_FEATURE_COUNT = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Device Management Service Get All Subdevice Information Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_INFORMATION_RESPONSE_STRUCTURE_OPERATION_COUNT = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructureImpl <em>Device Management Service Get All Subdevice Status Information Response Data Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructureImpl
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure()
	 * @generated
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_DATA_STRUCTURE = 7;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_DATA_STRUCTURE__TIME_STAMP = 0;

	/**
	 * The feature id for the '<em><b>Subdevice Status Information List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_DATA_STRUCTURE__SUBDEVICE_STATUS_INFORMATION_LIST = 1;

	/**
	 * The number of structural features of the '<em>Device Management Service Get All Subdevice Status Information Response Data Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_DATA_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Device Management Service Get All Subdevice Status Information Response Data Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_DATA_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructureImpl <em>Device Management Service Get All Subdevice Status Information Response Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructureImpl
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure()
	 * @generated
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE = 8;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Device Management Service Get All Subdevice Status Information Response Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_DATA = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Device Management Service Get All Subdevice Status Information Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE_FEATURE_COUNT = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Device Management Service Get All Subdevice Status Information Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE_OPERATION_COUNT = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetDeviceConfigurationResponseDataStructureImpl <em>Device Management Service Get Device Configuration Response Data Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetDeviceConfigurationResponseDataStructureImpl
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceGetDeviceConfigurationResponseDataStructure()
	 * @generated
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_DATA_STRUCTURE = 9;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_DATA_STRUCTURE__TIME_STAMP = 0;

	/**
	 * The feature id for the '<em><b>Device ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_DATA_STRUCTURE__DEVICE_ID = 1;

	/**
	 * The number of structural features of the '<em>Device Management Service Get Device Configuration Response Data Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_DATA_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Device Management Service Get Device Configuration Response Data Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_DATA_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetDeviceConfigurationResponseStructureImpl <em>Device Management Service Get Device Configuration Response Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetDeviceConfigurationResponseStructureImpl
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceGetDeviceConfigurationResponseStructure()
	 * @generated
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_STRUCTURE = 10;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Device Management Service Get Device Configuration Response Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_DATA = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Device Management Service Get Device Configuration Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_STRUCTURE_FEATURE_COUNT = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Device Management Service Get Device Configuration Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_STRUCTURE_OPERATION_COUNT = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetDeviceErrorMessagesResponseDataStructureImpl <em>Device Management Service Get Device Error Messages Response Data Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetDeviceErrorMessagesResponseDataStructureImpl
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure()
	 * @generated
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_DATA_STRUCTURE = 11;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_DATA_STRUCTURE__TIME_STAMP = 0;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_DATA_STRUCTURE__ERROR_MESSAGE = 1;

	/**
	 * The number of structural features of the '<em>Device Management Service Get Device Error Messages Response Data Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_DATA_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Device Management Service Get Device Error Messages Response Data Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_DATA_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetDeviceErrorMessagesResponseStructureImpl <em>Device Management Service Get Device Error Messages Response Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetDeviceErrorMessagesResponseStructureImpl
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceGetDeviceErrorMessagesResponseStructure()
	 * @generated
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_STRUCTURE = 12;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Device Management Service Get Device Error Messages Response Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_DATA = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Device Management Service Get Device Error Messages Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_STRUCTURE_FEATURE_COUNT = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Device Management Service Get Device Error Messages Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_STRUCTURE_OPERATION_COUNT = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetDeviceInformationResponseDataStructureImpl <em>Device Management Service Get Device Information Response Data Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetDeviceInformationResponseDataStructureImpl
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceGetDeviceInformationResponseDataStructure()
	 * @generated
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_DATA_STRUCTURE = 13;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_DATA_STRUCTURE__TIME_STAMP = 0;

	/**
	 * The feature id for the '<em><b>Device Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_DATA_STRUCTURE__DEVICE_INFORMATION = 1;

	/**
	 * The number of structural features of the '<em>Device Management Service Get Device Information Response Data Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_DATA_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Device Management Service Get Device Information Response Data Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_DATA_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetDeviceInformationResponseStructureImpl <em>Device Management Service Get Device Information Response Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetDeviceInformationResponseStructureImpl
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceGetDeviceInformationResponseStructure()
	 * @generated
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_STRUCTURE = 14;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Device Management Service Get Device Information Response Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_DATA = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Device Management Service Get Device Information Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_STRUCTURE_FEATURE_COUNT = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Device Management Service Get Device Information Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_STRUCTURE_OPERATION_COUNT = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetDeviceStatusInformationResponseDataStructureImpl <em>Device Management Service Get Device Status Information Response Data Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetDeviceStatusInformationResponseDataStructureImpl
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceGetDeviceStatusInformationResponseDataStructure()
	 * @generated
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_DATA_STRUCTURE = 15;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_DATA_STRUCTURE__TIME_STAMP = 0;

	/**
	 * The feature id for the '<em><b>Device Status Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_DATA_STRUCTURE__DEVICE_STATUS_INFORMATION = 1;

	/**
	 * The number of structural features of the '<em>Device Management Service Get Device Status Information Response Data Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_DATA_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Device Management Service Get Device Status Information Response Data Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_DATA_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetDeviceStatusInformationResponseStructureImpl <em>Device Management Service Get Device Status Information Response Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetDeviceStatusInformationResponseStructureImpl
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceGetDeviceStatusInformationResponseStructure()
	 * @generated
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE = 16;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Device Management Service Get Device Status Information Response Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_DATA = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Device Management Service Get Device Status Information Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE_FEATURE_COUNT = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Device Management Service Get Device Status Information Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE_OPERATION_COUNT = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetDeviceStatusResponseDataStructureImpl <em>Device Management Service Get Device Status Response Data Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetDeviceStatusResponseDataStructureImpl
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceGetDeviceStatusResponseDataStructure()
	 * @generated
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_RESPONSE_DATA_STRUCTURE = 17;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_RESPONSE_DATA_STRUCTURE__TIME_STAMP = 0;

	/**
	 * The feature id for the '<em><b>Device State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_RESPONSE_DATA_STRUCTURE__DEVICE_STATE = 1;

	/**
	 * The number of structural features of the '<em>Device Management Service Get Device Status Response Data Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_RESPONSE_DATA_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Device Management Service Get Device Status Response Data Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_RESPONSE_DATA_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetDeviceStatusResponseStructureImpl <em>Device Management Service Get Device Status Response Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetDeviceStatusResponseStructureImpl
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceGetDeviceStatusResponseStructure()
	 * @generated
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_RESPONSE_STRUCTURE = 18;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Device Management Service Get Device Status Response Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_RESPONSE_DATA = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Device Management Service Get Device Status Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_RESPONSE_STRUCTURE_FEATURE_COUNT = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Device Management Service Get Device Status Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_RESPONSE_STRUCTURE_OPERATION_COUNT = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetServiceInformationResponseDataStructureImpl <em>Device Management Service Get Service Information Response Data Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetServiceInformationResponseDataStructureImpl
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceGetServiceInformationResponseDataStructure()
	 * @generated
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_INFORMATION_RESPONSE_DATA_STRUCTURE = 19;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_INFORMATION_RESPONSE_DATA_STRUCTURE__TIME_STAMP = 0;

	/**
	 * The feature id for the '<em><b>Service Information List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_INFORMATION_RESPONSE_DATA_STRUCTURE__SERVICE_INFORMATION_LIST = 1;

	/**
	 * The number of structural features of the '<em>Device Management Service Get Service Information Response Data Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_INFORMATION_RESPONSE_DATA_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Device Management Service Get Service Information Response Data Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_INFORMATION_RESPONSE_DATA_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetServiceInformationResponseStructureImpl <em>Device Management Service Get Service Information Response Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetServiceInformationResponseStructureImpl
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceGetServiceInformationResponseStructure()
	 * @generated
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_INFORMATION_RESPONSE_STRUCTURE = 20;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_INFORMATION_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Device Management Service Get Service Information Response Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_INFORMATION_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_INFORMATION_RESPONSE_DATA = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Device Management Service Get Service Information Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_INFORMATION_RESPONSE_STRUCTURE_FEATURE_COUNT = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Device Management Service Get Service Information Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_INFORMATION_RESPONSE_STRUCTURE_OPERATION_COUNT = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetServiceStatusResponseDataStructureImpl <em>Device Management Service Get Service Status Response Data Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetServiceStatusResponseDataStructureImpl
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceGetServiceStatusResponseDataStructure()
	 * @generated
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_STATUS_RESPONSE_DATA_STRUCTURE = 21;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_STATUS_RESPONSE_DATA_STRUCTURE__TIME_STAMP = 0;

	/**
	 * The feature id for the '<em><b>Service Specification With State List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_STATUS_RESPONSE_DATA_STRUCTURE__SERVICE_SPECIFICATION_WITH_STATE_LIST = 1;

	/**
	 * The number of structural features of the '<em>Device Management Service Get Service Status Response Data Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_STATUS_RESPONSE_DATA_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Device Management Service Get Service Status Response Data Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_STATUS_RESPONSE_DATA_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetServiceStatusResponseStructureImpl <em>Device Management Service Get Service Status Response Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetServiceStatusResponseStructureImpl
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceGetServiceStatusResponseStructure()
	 * @generated
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_STATUS_RESPONSE_STRUCTURE = 22;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_STATUS_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Device Management Service Get Service Status Response Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_STATUS_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_STATUS_RESPONSE_DATA = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Device Management Service Get Service Status Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_STATUS_RESPONSE_STRUCTURE_FEATURE_COUNT = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Device Management Service Get Service Status Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_STATUS_RESPONSE_STRUCTURE_OPERATION_COUNT = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetUpdateHistoryResponseStructureImpl <em>Device Management Service Get Update History Response Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetUpdateHistoryResponseStructureImpl
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceGetUpdateHistoryResponseStructure()
	 * @generated
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_UPDATE_HISTORY_RESPONSE_STRUCTURE = 23;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_UPDATE_HISTORY_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Update History</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_UPDATE_HISTORY_RESPONSE_STRUCTURE__UPDATE_HISTORY = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Device Management Service Get Update History Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_UPDATE_HISTORY_RESPONSE_STRUCTURE_FEATURE_COUNT = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Device Management Service Get Update History Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_GET_UPDATE_HISTORY_RESPONSE_STRUCTURE_OPERATION_COUNT = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceInstallUpdateRequestStructureImpl <em>Device Management Service Install Update Request Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceInstallUpdateRequestStructureImpl
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceInstallUpdateRequestStructure()
	 * @generated
	 */
	int DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE = 24;

	/**
	 * The feature id for the '<em><b>Update ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_ID = 0;

	/**
	 * The feature id for the '<em><b>Update Timestamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_TIMESTAMP = 1;

	/**
	 * The feature id for the '<em><b>Update URL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_URL = 2;

	/**
	 * The feature id for the '<em><b>Update File Checksum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_FILE_CHECKSUM = 3;

	/**
	 * The feature id for the '<em><b>Update File Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_FILE_SIZE = 4;

	/**
	 * The number of structural features of the '<em>Device Management Service Install Update Request Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Device Management Service Install Update Request Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceInstallUpdateResponseStructureImpl <em>Device Management Service Install Update Response Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceInstallUpdateResponseStructureImpl
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceInstallUpdateResponseStructure()
	 * @generated
	 */
	int DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_RESPONSE_STRUCTURE = 25;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Update Accept</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_RESPONSE_STRUCTURE__UPDATE_ACCEPT = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Device Management Service Install Update Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_RESPONSE_STRUCTURE_FEATURE_COUNT = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Device Management Service Install Update Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_RESPONSE_STRUCTURE_OPERATION_COUNT = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceRetrieveUpdateStateRequestStructureImpl <em>Device Management Service Retrieve Update State Request Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceRetrieveUpdateStateRequestStructureImpl
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceRetrieveUpdateStateRequestStructure()
	 * @generated
	 */
	int DEVICE_MANAGEMENT_SERVICE_RETRIEVE_UPDATE_STATE_REQUEST_STRUCTURE = 26;

	/**
	 * The feature id for the '<em><b>Update ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_RETRIEVE_UPDATE_STATE_REQUEST_STRUCTURE__UPDATE_ID = 0;

	/**
	 * The number of structural features of the '<em>Device Management Service Retrieve Update State Request Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_RETRIEVE_UPDATE_STATE_REQUEST_STRUCTURE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Device Management Service Retrieve Update State Request Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_RETRIEVE_UPDATE_STATE_REQUEST_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceRetrieveUpdateStateResponseStructureImpl <em>Device Management Service Retrieve Update State Response Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceRetrieveUpdateStateResponseStructureImpl
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceRetrieveUpdateStateResponseStructure()
	 * @generated
	 */
	int DEVICE_MANAGEMENT_SERVICE_RETRIEVE_UPDATE_STATE_RESPONSE_STRUCTURE = 27;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_RETRIEVE_UPDATE_STATE_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Update State Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_RETRIEVE_UPDATE_STATE_RESPONSE_STRUCTURE__UPDATE_STATE_DATA = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Device Management Service Retrieve Update State Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_RETRIEVE_UPDATE_STATE_RESPONSE_STRUCTURE_FEATURE_COUNT = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Device Management Service Retrieve Update State Response Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_RETRIEVE_UPDATE_STATE_RESPONSE_STRUCTURE_OPERATION_COUNT = IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceUpdateHistoryEntryStructureImpl <em>Device Management Service Update History Entry Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceUpdateHistoryEntryStructureImpl
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceUpdateHistoryEntryStructure()
	 * @generated
	 */
	int DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE = 28;

	/**
	 * The feature id for the '<em><b>Update ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_ID = 0;

	/**
	 * The feature id for the '<em><b>Update Timestamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_TIMESTAMP = 1;

	/**
	 * The feature id for the '<em><b>Update URL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_URL = 2;

	/**
	 * The feature id for the '<em><b>Update Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_STATUS = 3;

	/**
	 * The feature id for the '<em><b>Data Version List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__DATA_VERSION_LIST = 4;

	/**
	 * The feature id for the '<em><b>Update Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_DETAILS = 5;

	/**
	 * The number of structural features of the '<em>Device Management Service Update History Entry Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Device Management Service Update History Entry Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceUpdateHistoryStructureImpl <em>Device Management Service Update History Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceUpdateHistoryStructureImpl
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceUpdateHistoryStructure()
	 * @generated
	 */
	int DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_STRUCTURE = 29;

	/**
	 * The feature id for the '<em><b>Update History Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_STRUCTURE__UPDATE_HISTORY_ENTRY = 0;

	/**
	 * The number of structural features of the '<em>Device Management Service Update History Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_STRUCTURE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Device Management Service Update History Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceUpdateStateDataStructureImpl <em>Device Management Service Update State Data Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceUpdateStateDataStructureImpl
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceUpdateStateDataStructure()
	 * @generated
	 */
	int DEVICE_MANAGEMENT_SERVICE_UPDATE_STATE_DATA_STRUCTURE = 30;

	/**
	 * The feature id for the '<em><b>Update ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_UPDATE_STATE_DATA_STRUCTURE__UPDATE_ID = 0;

	/**
	 * The feature id for the '<em><b>Update Timestamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_UPDATE_STATE_DATA_STRUCTURE__UPDATE_TIMESTAMP = 1;

	/**
	 * The feature id for the '<em><b>Update Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_UPDATE_STATE_DATA_STRUCTURE__UPDATE_STATUS = 2;

	/**
	 * The feature id for the '<em><b>Update Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_UPDATE_STATE_DATA_STRUCTURE__UPDATE_DETAILS = 3;

	/**
	 * The number of structural features of the '<em>Device Management Service Update State Data Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_UPDATE_STATE_DATA_STRUCTURE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Device Management Service Update State Data Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MANAGEMENT_SERVICE_UPDATE_STATE_DATA_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceStatusInformationStructureImpl <em>Device Status Information Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceStatusInformationStructureImpl
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceStatusInformationStructure()
	 * @generated
	 */
	int DEVICE_STATUS_INFORMATION_STRUCTURE = 31;

	/**
	 * The feature id for the '<em><b>Device State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATUS_INFORMATION_STRUCTURE__DEVICE_STATE = 0;

	/**
	 * The feature id for the '<em><b>Device Status List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATUS_INFORMATION_STRUCTURE__DEVICE_STATUS_LIST = 1;

	/**
	 * The number of structural features of the '<em>Device Status Information Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATUS_INFORMATION_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Device Status Information Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATUS_INFORMATION_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceStatusStructureImpl <em>Device Status Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceStatusStructureImpl
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceStatusStructure()
	 * @generated
	 */
	int DEVICE_STATUS_STRUCTURE = 32;

	/**
	 * The feature id for the '<em><b>Device Status Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATUS_STRUCTURE__DEVICE_STATUS_NAME = 0;

	/**
	 * The feature id for the '<em><b>Device Status Flag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATUS_STRUCTURE__DEVICE_STATUS_FLAG = 1;

	/**
	 * The feature id for the '<em><b>Device Status Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATUS_STRUCTURE__DEVICE_STATUS_IMPACT = 2;

	/**
	 * The feature id for the '<em><b>Device Status Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATUS_STRUCTURE__DEVICE_STATUS_PRIORITY = 3;

	/**
	 * The number of structural features of the '<em>Device Status Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATUS_STRUCTURE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Device Status Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATUS_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.SubdeviceErrorMessagesStructureImpl <em>Subdevice Error Messages Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.SubdeviceErrorMessagesStructureImpl
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getSubdeviceErrorMessagesStructure()
	 * @generated
	 */
	int SUBDEVICE_ERROR_MESSAGES_STRUCTURE = 33;

	/**
	 * The feature id for the '<em><b>Subdevice Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_ERROR_MESSAGES_STRUCTURE__SUBDEVICE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_ERROR_MESSAGES_STRUCTURE__ERROR_MESSAGE = 1;

	/**
	 * The number of structural features of the '<em>Subdevice Error Messages Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_ERROR_MESSAGES_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Subdevice Error Messages Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_ERROR_MESSAGES_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.SubdeviceInformationStructureImpl <em>Subdevice Information Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.SubdeviceInformationStructureImpl
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getSubdeviceInformationStructure()
	 * @generated
	 */
	int SUBDEVICE_INFORMATION_STRUCTURE = 34;

	/**
	 * The feature id for the '<em><b>Subdevice Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_INFORMATION_STRUCTURE__SUBDEVICE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Device Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_INFORMATION_STRUCTURE__DEVICE_INFORMATION = 1;

	/**
	 * The number of structural features of the '<em>Subdevice Information Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_INFORMATION_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Subdevice Information Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_INFORMATION_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.SubdeviceStatusInformationStructureImpl <em>Subdevice Status Information Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.SubdeviceStatusInformationStructureImpl
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getSubdeviceStatusInformationStructure()
	 * @generated
	 */
	int SUBDEVICE_STATUS_INFORMATION_STRUCTURE = 35;

	/**
	 * The feature id for the '<em><b>Subdevice Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_STATUS_INFORMATION_STRUCTURE__SUBDEVICE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Device Status Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_STATUS_INFORMATION_STRUCTURE__DEVICE_STATUS_INFORMATION = 1;

	/**
	 * The number of structural features of the '<em>Subdevice Status Information Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_STATUS_INFORMATION_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Subdevice Status Information Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_STATUS_INFORMATION_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.devicemanagementservice.ChecksumTypeEnumeration <em>Checksum Type Enumeration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.devicemanagementservice.ChecksumTypeEnumeration
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getChecksumTypeEnumeration()
	 * @generated
	 */
	int CHECKSUM_TYPE_ENUMERATION = 36;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.devicemanagementservice.UpdateAcceptEnumeration <em>Update Accept Enumeration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.devicemanagementservice.UpdateAcceptEnumeration
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getUpdateAcceptEnumeration()
	 * @generated
	 */
	int UPDATE_ACCEPT_ENUMERATION = 37;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.devicemanagementservice.UpdateStatusEnumeration <em>Update Status Enumeration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.devicemanagementservice.UpdateStatusEnumeration
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getUpdateStatusEnumeration()
	 * @generated
	 */
	int UPDATE_STATUS_ENUMERATION = 38;

	/**
	 * The meta object id for the '<em>Checksum Type Enumeration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.devicemanagementservice.ChecksumTypeEnumeration
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getChecksumTypeEnumerationObject()
	 * @generated
	 */
	int CHECKSUM_TYPE_ENUMERATION_OBJECT = 39;

	/**
	 * The meta object id for the '<em>Update Accept Enumeration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.devicemanagementservice.UpdateAcceptEnumeration
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getUpdateAcceptEnumerationObject()
	 * @generated
	 */
	int UPDATE_ACCEPT_ENUMERATION_OBJECT = 40;

	/**
	 * The meta object id for the '<em>Update Status Enumeration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.devicemanagementservice.UpdateStatusEnumeration
	 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getUpdateStatusEnumerationObject()
	 * @generated
	 */
	int UPDATE_STATUS_ENUMERATION_OBJECT = 41;


	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.devicemanagementservice.ChecksumStructure <em>Checksum Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Checksum Structure</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.ChecksumStructure
	 * @generated
	 */
	EClass getChecksumStructure();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.devicemanagementservice.ChecksumStructure#getChecksumType <em>Checksum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checksum Type</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.ChecksumStructure#getChecksumType()
	 * @see #getChecksumStructure()
	 * @generated
	 */
	EAttribute getChecksumStructure_ChecksumType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.devicemanagementservice.ChecksumStructure#getChecksum <em>Checksum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Checksum</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.ChecksumStructure#getChecksum()
	 * @see #getChecksumStructure()
	 * @generated
	 */
	EReference getChecksumStructure_Checksum();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceFinalizeUpdateRequestStructure <em>Device Management Service Finalize Update Request Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Management Service Finalize Update Request Structure</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceFinalizeUpdateRequestStructure
	 * @generated
	 */
	EClass getDeviceManagementServiceFinalizeUpdateRequestStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceFinalizeUpdateRequestStructure#getUpdateID <em>Update ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update ID</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceFinalizeUpdateRequestStructure#getUpdateID()
	 * @see #getDeviceManagementServiceFinalizeUpdateRequestStructure()
	 * @generated
	 */
	EReference getDeviceManagementServiceFinalizeUpdateRequestStructure_UpdateID();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceFinalizeUpdateResponseStructure <em>Device Management Service Finalize Update Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Management Service Finalize Update Response Structure</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceFinalizeUpdateResponseStructure
	 * @generated
	 */
	EClass getDeviceManagementServiceFinalizeUpdateResponseStructure();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceFinalizeUpdateResponseStructure#getUpdateStatus <em>Update Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Status</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceFinalizeUpdateResponseStructure#getUpdateStatus()
	 * @see #getDeviceManagementServiceFinalizeUpdateResponseStructure()
	 * @generated
	 */
	EAttribute getDeviceManagementServiceFinalizeUpdateResponseStructure_UpdateStatus();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure <em>Device Management Service Get All Subdevice Error Messages Response Data Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Management Service Get All Subdevice Error Messages Response Data Structure</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure
	 * @generated
	 */
	EClass getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Stamp</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure#getTimeStamp()
	 * @see #getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure()
	 * @generated
	 */
	EReference getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure_TimeStamp();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure#getSubdeviceErrorMessagesList <em>Subdevice Error Messages List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subdevice Error Messages List</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure#getSubdeviceErrorMessagesList()
	 * @see #getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure()
	 * @generated
	 */
	EReference getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure_SubdeviceErrorMessagesList();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure <em>Device Management Service Get All Subdevice Error Messages Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Management Service Get All Subdevice Error Messages Response Structure</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure
	 * @generated
	 */
	EClass getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure#getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseData <em>Device Management Service Get All Subdevice Error Messages Response Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Management Service Get All Subdevice Error Messages Response Data</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure#getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseData()
	 * @see #getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure()
	 * @generated
	 */
	EReference getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure_DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseData();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure <em>Device Management Service Get All Subdevice Information Response Data Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Management Service Get All Subdevice Information Response Data Structure</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure
	 * @generated
	 */
	EClass getDeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Stamp</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure#getTimeStamp()
	 * @see #getDeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure()
	 * @generated
	 */
	EReference getDeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure_TimeStamp();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure#getSubdeviceInformationList <em>Subdevice Information List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subdevice Information List</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure#getSubdeviceInformationList()
	 * @see #getDeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure()
	 * @generated
	 */
	EReference getDeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure_SubdeviceInformationList();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceInformationResponseStructure <em>Device Management Service Get All Subdevice Information Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Management Service Get All Subdevice Information Response Structure</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceInformationResponseStructure
	 * @generated
	 */
	EClass getDeviceManagementServiceGetAllSubdeviceInformationResponseStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceInformationResponseStructure#getDeviceManagementServiceGetAllSubdeviceInformationResponseData <em>Device Management Service Get All Subdevice Information Response Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Management Service Get All Subdevice Information Response Data</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceInformationResponseStructure#getDeviceManagementServiceGetAllSubdeviceInformationResponseData()
	 * @see #getDeviceManagementServiceGetAllSubdeviceInformationResponseStructure()
	 * @generated
	 */
	EReference getDeviceManagementServiceGetAllSubdeviceInformationResponseStructure_DeviceManagementServiceGetAllSubdeviceInformationResponseData();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure <em>Device Management Service Get All Subdevice Status Information Response Data Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Management Service Get All Subdevice Status Information Response Data Structure</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure
	 * @generated
	 */
	EClass getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Stamp</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure#getTimeStamp()
	 * @see #getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure()
	 * @generated
	 */
	EReference getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure_TimeStamp();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure#getSubdeviceStatusInformationList <em>Subdevice Status Information List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subdevice Status Information List</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure#getSubdeviceStatusInformationList()
	 * @see #getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure()
	 * @generated
	 */
	EReference getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure_SubdeviceStatusInformationList();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure <em>Device Management Service Get All Subdevice Status Information Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Management Service Get All Subdevice Status Information Response Structure</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure
	 * @generated
	 */
	EClass getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure#getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseData <em>Device Management Service Get All Subdevice Status Information Response Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Management Service Get All Subdevice Status Information Response Data</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure#getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseData()
	 * @see #getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure()
	 * @generated
	 */
	EReference getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure_DeviceManagementServiceGetAllSubdeviceStatusInformationResponseData();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceConfigurationResponseDataStructure <em>Device Management Service Get Device Configuration Response Data Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Management Service Get Device Configuration Response Data Structure</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceConfigurationResponseDataStructure
	 * @generated
	 */
	EClass getDeviceManagementServiceGetDeviceConfigurationResponseDataStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceConfigurationResponseDataStructure#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Stamp</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceConfigurationResponseDataStructure#getTimeStamp()
	 * @see #getDeviceManagementServiceGetDeviceConfigurationResponseDataStructure()
	 * @generated
	 */
	EReference getDeviceManagementServiceGetDeviceConfigurationResponseDataStructure_TimeStamp();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceConfigurationResponseDataStructure#getDeviceID <em>Device ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device ID</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceConfigurationResponseDataStructure#getDeviceID()
	 * @see #getDeviceManagementServiceGetDeviceConfigurationResponseDataStructure()
	 * @generated
	 */
	EReference getDeviceManagementServiceGetDeviceConfigurationResponseDataStructure_DeviceID();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceConfigurationResponseStructure <em>Device Management Service Get Device Configuration Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Management Service Get Device Configuration Response Structure</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceConfigurationResponseStructure
	 * @generated
	 */
	EClass getDeviceManagementServiceGetDeviceConfigurationResponseStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceConfigurationResponseStructure#getDeviceManagementServiceGetDeviceConfigurationResponseData <em>Device Management Service Get Device Configuration Response Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Management Service Get Device Configuration Response Data</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceConfigurationResponseStructure#getDeviceManagementServiceGetDeviceConfigurationResponseData()
	 * @see #getDeviceManagementServiceGetDeviceConfigurationResponseStructure()
	 * @generated
	 */
	EReference getDeviceManagementServiceGetDeviceConfigurationResponseStructure_DeviceManagementServiceGetDeviceConfigurationResponseData();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure <em>Device Management Service Get Device Error Messages Response Data Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Management Service Get Device Error Messages Response Data Structure</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure
	 * @generated
	 */
	EClass getDeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Stamp</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure#getTimeStamp()
	 * @see #getDeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure()
	 * @generated
	 */
	EReference getDeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure_TimeStamp();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure#getErrorMessage <em>Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Error Message</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure#getErrorMessage()
	 * @see #getDeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure()
	 * @generated
	 */
	EReference getDeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure_ErrorMessage();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceErrorMessagesResponseStructure <em>Device Management Service Get Device Error Messages Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Management Service Get Device Error Messages Response Structure</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceErrorMessagesResponseStructure
	 * @generated
	 */
	EClass getDeviceManagementServiceGetDeviceErrorMessagesResponseStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceErrorMessagesResponseStructure#getDeviceManagementServiceGetDeviceErrorMessagesResponseData <em>Device Management Service Get Device Error Messages Response Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Management Service Get Device Error Messages Response Data</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceErrorMessagesResponseStructure#getDeviceManagementServiceGetDeviceErrorMessagesResponseData()
	 * @see #getDeviceManagementServiceGetDeviceErrorMessagesResponseStructure()
	 * @generated
	 */
	EReference getDeviceManagementServiceGetDeviceErrorMessagesResponseStructure_DeviceManagementServiceGetDeviceErrorMessagesResponseData();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceInformationResponseDataStructure <em>Device Management Service Get Device Information Response Data Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Management Service Get Device Information Response Data Structure</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceInformationResponseDataStructure
	 * @generated
	 */
	EClass getDeviceManagementServiceGetDeviceInformationResponseDataStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceInformationResponseDataStructure#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Stamp</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceInformationResponseDataStructure#getTimeStamp()
	 * @see #getDeviceManagementServiceGetDeviceInformationResponseDataStructure()
	 * @generated
	 */
	EReference getDeviceManagementServiceGetDeviceInformationResponseDataStructure_TimeStamp();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceInformationResponseDataStructure#getDeviceInformation <em>Device Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Information</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceInformationResponseDataStructure#getDeviceInformation()
	 * @see #getDeviceManagementServiceGetDeviceInformationResponseDataStructure()
	 * @generated
	 */
	EReference getDeviceManagementServiceGetDeviceInformationResponseDataStructure_DeviceInformation();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceInformationResponseStructure <em>Device Management Service Get Device Information Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Management Service Get Device Information Response Structure</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceInformationResponseStructure
	 * @generated
	 */
	EClass getDeviceManagementServiceGetDeviceInformationResponseStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceInformationResponseStructure#getDeviceManagementServiceGetDeviceInformationResponseData <em>Device Management Service Get Device Information Response Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Management Service Get Device Information Response Data</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceInformationResponseStructure#getDeviceManagementServiceGetDeviceInformationResponseData()
	 * @see #getDeviceManagementServiceGetDeviceInformationResponseStructure()
	 * @generated
	 */
	EReference getDeviceManagementServiceGetDeviceInformationResponseStructure_DeviceManagementServiceGetDeviceInformationResponseData();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceStatusInformationResponseDataStructure <em>Device Management Service Get Device Status Information Response Data Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Management Service Get Device Status Information Response Data Structure</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceStatusInformationResponseDataStructure
	 * @generated
	 */
	EClass getDeviceManagementServiceGetDeviceStatusInformationResponseDataStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceStatusInformationResponseDataStructure#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Stamp</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceStatusInformationResponseDataStructure#getTimeStamp()
	 * @see #getDeviceManagementServiceGetDeviceStatusInformationResponseDataStructure()
	 * @generated
	 */
	EReference getDeviceManagementServiceGetDeviceStatusInformationResponseDataStructure_TimeStamp();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceStatusInformationResponseDataStructure#getDeviceStatusInformation <em>Device Status Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Status Information</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceStatusInformationResponseDataStructure#getDeviceStatusInformation()
	 * @see #getDeviceManagementServiceGetDeviceStatusInformationResponseDataStructure()
	 * @generated
	 */
	EReference getDeviceManagementServiceGetDeviceStatusInformationResponseDataStructure_DeviceStatusInformation();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceStatusInformationResponseStructure <em>Device Management Service Get Device Status Information Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Management Service Get Device Status Information Response Structure</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceStatusInformationResponseStructure
	 * @generated
	 */
	EClass getDeviceManagementServiceGetDeviceStatusInformationResponseStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceStatusInformationResponseStructure#getDeviceManagementServiceGetDeviceStatusInformationResponseData <em>Device Management Service Get Device Status Information Response Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Management Service Get Device Status Information Response Data</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceStatusInformationResponseStructure#getDeviceManagementServiceGetDeviceStatusInformationResponseData()
	 * @see #getDeviceManagementServiceGetDeviceStatusInformationResponseStructure()
	 * @generated
	 */
	EReference getDeviceManagementServiceGetDeviceStatusInformationResponseStructure_DeviceManagementServiceGetDeviceStatusInformationResponseData();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceStatusResponseDataStructure <em>Device Management Service Get Device Status Response Data Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Management Service Get Device Status Response Data Structure</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceStatusResponseDataStructure
	 * @generated
	 */
	EClass getDeviceManagementServiceGetDeviceStatusResponseDataStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceStatusResponseDataStructure#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Stamp</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceStatusResponseDataStructure#getTimeStamp()
	 * @see #getDeviceManagementServiceGetDeviceStatusResponseDataStructure()
	 * @generated
	 */
	EReference getDeviceManagementServiceGetDeviceStatusResponseDataStructure_TimeStamp();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceStatusResponseDataStructure#getDeviceState <em>Device State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device State</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceStatusResponseDataStructure#getDeviceState()
	 * @see #getDeviceManagementServiceGetDeviceStatusResponseDataStructure()
	 * @generated
	 */
	EAttribute getDeviceManagementServiceGetDeviceStatusResponseDataStructure_DeviceState();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceStatusResponseStructure <em>Device Management Service Get Device Status Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Management Service Get Device Status Response Structure</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceStatusResponseStructure
	 * @generated
	 */
	EClass getDeviceManagementServiceGetDeviceStatusResponseStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceStatusResponseStructure#getDeviceManagementServiceGetDeviceStatusResponseData <em>Device Management Service Get Device Status Response Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Management Service Get Device Status Response Data</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceStatusResponseStructure#getDeviceManagementServiceGetDeviceStatusResponseData()
	 * @see #getDeviceManagementServiceGetDeviceStatusResponseStructure()
	 * @generated
	 */
	EReference getDeviceManagementServiceGetDeviceStatusResponseStructure_DeviceManagementServiceGetDeviceStatusResponseData();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetServiceInformationResponseDataStructure <em>Device Management Service Get Service Information Response Data Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Management Service Get Service Information Response Data Structure</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetServiceInformationResponseDataStructure
	 * @generated
	 */
	EClass getDeviceManagementServiceGetServiceInformationResponseDataStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetServiceInformationResponseDataStructure#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Stamp</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetServiceInformationResponseDataStructure#getTimeStamp()
	 * @see #getDeviceManagementServiceGetServiceInformationResponseDataStructure()
	 * @generated
	 */
	EReference getDeviceManagementServiceGetServiceInformationResponseDataStructure_TimeStamp();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetServiceInformationResponseDataStructure#getServiceInformationList <em>Service Information List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Information List</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetServiceInformationResponseDataStructure#getServiceInformationList()
	 * @see #getDeviceManagementServiceGetServiceInformationResponseDataStructure()
	 * @generated
	 */
	EReference getDeviceManagementServiceGetServiceInformationResponseDataStructure_ServiceInformationList();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetServiceInformationResponseStructure <em>Device Management Service Get Service Information Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Management Service Get Service Information Response Structure</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetServiceInformationResponseStructure
	 * @generated
	 */
	EClass getDeviceManagementServiceGetServiceInformationResponseStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetServiceInformationResponseStructure#getDeviceManagementServiceGetServiceInformationResponseData <em>Device Management Service Get Service Information Response Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Management Service Get Service Information Response Data</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetServiceInformationResponseStructure#getDeviceManagementServiceGetServiceInformationResponseData()
	 * @see #getDeviceManagementServiceGetServiceInformationResponseStructure()
	 * @generated
	 */
	EReference getDeviceManagementServiceGetServiceInformationResponseStructure_DeviceManagementServiceGetServiceInformationResponseData();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetServiceStatusResponseDataStructure <em>Device Management Service Get Service Status Response Data Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Management Service Get Service Status Response Data Structure</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetServiceStatusResponseDataStructure
	 * @generated
	 */
	EClass getDeviceManagementServiceGetServiceStatusResponseDataStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetServiceStatusResponseDataStructure#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Stamp</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetServiceStatusResponseDataStructure#getTimeStamp()
	 * @see #getDeviceManagementServiceGetServiceStatusResponseDataStructure()
	 * @generated
	 */
	EReference getDeviceManagementServiceGetServiceStatusResponseDataStructure_TimeStamp();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetServiceStatusResponseDataStructure#getServiceSpecificationWithStateList <em>Service Specification With State List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Specification With State List</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetServiceStatusResponseDataStructure#getServiceSpecificationWithStateList()
	 * @see #getDeviceManagementServiceGetServiceStatusResponseDataStructure()
	 * @generated
	 */
	EReference getDeviceManagementServiceGetServiceStatusResponseDataStructure_ServiceSpecificationWithStateList();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetServiceStatusResponseStructure <em>Device Management Service Get Service Status Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Management Service Get Service Status Response Structure</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetServiceStatusResponseStructure
	 * @generated
	 */
	EClass getDeviceManagementServiceGetServiceStatusResponseStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetServiceStatusResponseStructure#getDeviceManagementServiceGetServiceStatusResponseData <em>Device Management Service Get Service Status Response Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Management Service Get Service Status Response Data</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetServiceStatusResponseStructure#getDeviceManagementServiceGetServiceStatusResponseData()
	 * @see #getDeviceManagementServiceGetServiceStatusResponseStructure()
	 * @generated
	 */
	EReference getDeviceManagementServiceGetServiceStatusResponseStructure_DeviceManagementServiceGetServiceStatusResponseData();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetUpdateHistoryResponseStructure <em>Device Management Service Get Update History Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Management Service Get Update History Response Structure</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetUpdateHistoryResponseStructure
	 * @generated
	 */
	EClass getDeviceManagementServiceGetUpdateHistoryResponseStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetUpdateHistoryResponseStructure#getUpdateHistory <em>Update History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update History</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetUpdateHistoryResponseStructure#getUpdateHistory()
	 * @see #getDeviceManagementServiceGetUpdateHistoryResponseStructure()
	 * @generated
	 */
	EReference getDeviceManagementServiceGetUpdateHistoryResponseStructure_UpdateHistory();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceInstallUpdateRequestStructure <em>Device Management Service Install Update Request Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Management Service Install Update Request Structure</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceInstallUpdateRequestStructure
	 * @generated
	 */
	EClass getDeviceManagementServiceInstallUpdateRequestStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceInstallUpdateRequestStructure#getUpdateID <em>Update ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update ID</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceInstallUpdateRequestStructure#getUpdateID()
	 * @see #getDeviceManagementServiceInstallUpdateRequestStructure()
	 * @generated
	 */
	EReference getDeviceManagementServiceInstallUpdateRequestStructure_UpdateID();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceInstallUpdateRequestStructure#getUpdateTimestamp <em>Update Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update Timestamp</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceInstallUpdateRequestStructure#getUpdateTimestamp()
	 * @see #getDeviceManagementServiceInstallUpdateRequestStructure()
	 * @generated
	 */
	EReference getDeviceManagementServiceInstallUpdateRequestStructure_UpdateTimestamp();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceInstallUpdateRequestStructure#getUpdateURL <em>Update URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update URL</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceInstallUpdateRequestStructure#getUpdateURL()
	 * @see #getDeviceManagementServiceInstallUpdateRequestStructure()
	 * @generated
	 */
	EReference getDeviceManagementServiceInstallUpdateRequestStructure_UpdateURL();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceInstallUpdateRequestStructure#getUpdateFileChecksum <em>Update File Checksum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update File Checksum</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceInstallUpdateRequestStructure#getUpdateFileChecksum()
	 * @see #getDeviceManagementServiceInstallUpdateRequestStructure()
	 * @generated
	 */
	EReference getDeviceManagementServiceInstallUpdateRequestStructure_UpdateFileChecksum();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceInstallUpdateRequestStructure#getUpdateFileSize <em>Update File Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update File Size</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceInstallUpdateRequestStructure#getUpdateFileSize()
	 * @see #getDeviceManagementServiceInstallUpdateRequestStructure()
	 * @generated
	 */
	EReference getDeviceManagementServiceInstallUpdateRequestStructure_UpdateFileSize();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceInstallUpdateResponseStructure <em>Device Management Service Install Update Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Management Service Install Update Response Structure</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceInstallUpdateResponseStructure
	 * @generated
	 */
	EClass getDeviceManagementServiceInstallUpdateResponseStructure();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceInstallUpdateResponseStructure#getUpdateAccept <em>Update Accept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Accept</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceInstallUpdateResponseStructure#getUpdateAccept()
	 * @see #getDeviceManagementServiceInstallUpdateResponseStructure()
	 * @generated
	 */
	EAttribute getDeviceManagementServiceInstallUpdateResponseStructure_UpdateAccept();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceRetrieveUpdateStateRequestStructure <em>Device Management Service Retrieve Update State Request Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Management Service Retrieve Update State Request Structure</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceRetrieveUpdateStateRequestStructure
	 * @generated
	 */
	EClass getDeviceManagementServiceRetrieveUpdateStateRequestStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceRetrieveUpdateStateRequestStructure#getUpdateID <em>Update ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update ID</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceRetrieveUpdateStateRequestStructure#getUpdateID()
	 * @see #getDeviceManagementServiceRetrieveUpdateStateRequestStructure()
	 * @generated
	 */
	EReference getDeviceManagementServiceRetrieveUpdateStateRequestStructure_UpdateID();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceRetrieveUpdateStateResponseStructure <em>Device Management Service Retrieve Update State Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Management Service Retrieve Update State Response Structure</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceRetrieveUpdateStateResponseStructure
	 * @generated
	 */
	EClass getDeviceManagementServiceRetrieveUpdateStateResponseStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceRetrieveUpdateStateResponseStructure#getUpdateStateData <em>Update State Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update State Data</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceRetrieveUpdateStateResponseStructure#getUpdateStateData()
	 * @see #getDeviceManagementServiceRetrieveUpdateStateResponseStructure()
	 * @generated
	 */
	EReference getDeviceManagementServiceRetrieveUpdateStateResponseStructure_UpdateStateData();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateHistoryEntryStructure <em>Device Management Service Update History Entry Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Management Service Update History Entry Structure</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateHistoryEntryStructure
	 * @generated
	 */
	EClass getDeviceManagementServiceUpdateHistoryEntryStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateHistoryEntryStructure#getUpdateID <em>Update ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update ID</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateHistoryEntryStructure#getUpdateID()
	 * @see #getDeviceManagementServiceUpdateHistoryEntryStructure()
	 * @generated
	 */
	EReference getDeviceManagementServiceUpdateHistoryEntryStructure_UpdateID();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateHistoryEntryStructure#getUpdateTimestamp <em>Update Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update Timestamp</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateHistoryEntryStructure#getUpdateTimestamp()
	 * @see #getDeviceManagementServiceUpdateHistoryEntryStructure()
	 * @generated
	 */
	EReference getDeviceManagementServiceUpdateHistoryEntryStructure_UpdateTimestamp();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateHistoryEntryStructure#getUpdateURL <em>Update URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update URL</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateHistoryEntryStructure#getUpdateURL()
	 * @see #getDeviceManagementServiceUpdateHistoryEntryStructure()
	 * @generated
	 */
	EReference getDeviceManagementServiceUpdateHistoryEntryStructure_UpdateURL();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateHistoryEntryStructure#getUpdateStatus <em>Update Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Status</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateHistoryEntryStructure#getUpdateStatus()
	 * @see #getDeviceManagementServiceUpdateHistoryEntryStructure()
	 * @generated
	 */
	EAttribute getDeviceManagementServiceUpdateHistoryEntryStructure_UpdateStatus();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateHistoryEntryStructure#getDataVersionList <em>Data Version List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Version List</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateHistoryEntryStructure#getDataVersionList()
	 * @see #getDeviceManagementServiceUpdateHistoryEntryStructure()
	 * @generated
	 */
	EReference getDeviceManagementServiceUpdateHistoryEntryStructure_DataVersionList();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateHistoryEntryStructure#getUpdateDetails <em>Update Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update Details</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateHistoryEntryStructure#getUpdateDetails()
	 * @see #getDeviceManagementServiceUpdateHistoryEntryStructure()
	 * @generated
	 */
	EReference getDeviceManagementServiceUpdateHistoryEntryStructure_UpdateDetails();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateHistoryStructure <em>Device Management Service Update History Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Management Service Update History Structure</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateHistoryStructure
	 * @generated
	 */
	EClass getDeviceManagementServiceUpdateHistoryStructure();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateHistoryStructure#getUpdateHistoryEntry <em>Update History Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Update History Entry</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateHistoryStructure#getUpdateHistoryEntry()
	 * @see #getDeviceManagementServiceUpdateHistoryStructure()
	 * @generated
	 */
	EReference getDeviceManagementServiceUpdateHistoryStructure_UpdateHistoryEntry();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateStateDataStructure <em>Device Management Service Update State Data Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Management Service Update State Data Structure</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateStateDataStructure
	 * @generated
	 */
	EClass getDeviceManagementServiceUpdateStateDataStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateStateDataStructure#getUpdateID <em>Update ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update ID</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateStateDataStructure#getUpdateID()
	 * @see #getDeviceManagementServiceUpdateStateDataStructure()
	 * @generated
	 */
	EReference getDeviceManagementServiceUpdateStateDataStructure_UpdateID();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateStateDataStructure#getUpdateTimestamp <em>Update Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update Timestamp</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateStateDataStructure#getUpdateTimestamp()
	 * @see #getDeviceManagementServiceUpdateStateDataStructure()
	 * @generated
	 */
	EReference getDeviceManagementServiceUpdateStateDataStructure_UpdateTimestamp();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateStateDataStructure#getUpdateStatus <em>Update Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Status</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateStateDataStructure#getUpdateStatus()
	 * @see #getDeviceManagementServiceUpdateStateDataStructure()
	 * @generated
	 */
	EAttribute getDeviceManagementServiceUpdateStateDataStructure_UpdateStatus();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateStateDataStructure#getUpdateDetails <em>Update Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update Details</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateStateDataStructure#getUpdateDetails()
	 * @see #getDeviceManagementServiceUpdateStateDataStructure()
	 * @generated
	 */
	EReference getDeviceManagementServiceUpdateStateDataStructure_UpdateDetails();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceStatusInformationStructure <em>Device Status Information Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Status Information Structure</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceStatusInformationStructure
	 * @generated
	 */
	EClass getDeviceStatusInformationStructure();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceStatusInformationStructure#getDeviceState <em>Device State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device State</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceStatusInformationStructure#getDeviceState()
	 * @see #getDeviceStatusInformationStructure()
	 * @generated
	 */
	EAttribute getDeviceStatusInformationStructure_DeviceState();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceStatusInformationStructure#getDeviceStatusList <em>Device Status List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Status List</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceStatusInformationStructure#getDeviceStatusList()
	 * @see #getDeviceStatusInformationStructure()
	 * @generated
	 */
	EReference getDeviceStatusInformationStructure_DeviceStatusList();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceStatusStructure <em>Device Status Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Status Structure</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceStatusStructure
	 * @generated
	 */
	EClass getDeviceStatusStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceStatusStructure#getDeviceStatusName <em>Device Status Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Status Name</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceStatusStructure#getDeviceStatusName()
	 * @see #getDeviceStatusStructure()
	 * @generated
	 */
	EReference getDeviceStatusStructure_DeviceStatusName();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceStatusStructure#getDeviceStatusFlag <em>Device Status Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Status Flag</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceStatusStructure#getDeviceStatusFlag()
	 * @see #getDeviceStatusStructure()
	 * @generated
	 */
	EReference getDeviceStatusStructure_DeviceStatusFlag();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceStatusStructure#getDeviceStatusImpact <em>Device Status Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Status Impact</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceStatusStructure#getDeviceStatusImpact()
	 * @see #getDeviceStatusStructure()
	 * @generated
	 */
	EAttribute getDeviceStatusStructure_DeviceStatusImpact();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceStatusStructure#getDeviceStatusPriority <em>Device Status Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Status Priority</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceStatusStructure#getDeviceStatusPriority()
	 * @see #getDeviceStatusStructure()
	 * @generated
	 */
	EReference getDeviceStatusStructure_DeviceStatusPriority();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.devicemanagementservice.SubdeviceErrorMessagesStructure <em>Subdevice Error Messages Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subdevice Error Messages Structure</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.SubdeviceErrorMessagesStructure
	 * @generated
	 */
	EClass getSubdeviceErrorMessagesStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.SubdeviceErrorMessagesStructure#getSubdeviceName <em>Subdevice Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subdevice Name</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.SubdeviceErrorMessagesStructure#getSubdeviceName()
	 * @see #getSubdeviceErrorMessagesStructure()
	 * @generated
	 */
	EReference getSubdeviceErrorMessagesStructure_SubdeviceName();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.devicemanagementservice.SubdeviceErrorMessagesStructure#getErrorMessage <em>Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Error Message</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.SubdeviceErrorMessagesStructure#getErrorMessage()
	 * @see #getSubdeviceErrorMessagesStructure()
	 * @generated
	 */
	EReference getSubdeviceErrorMessagesStructure_ErrorMessage();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.devicemanagementservice.SubdeviceInformationStructure <em>Subdevice Information Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subdevice Information Structure</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.SubdeviceInformationStructure
	 * @generated
	 */
	EClass getSubdeviceInformationStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.SubdeviceInformationStructure#getSubdeviceName <em>Subdevice Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subdevice Name</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.SubdeviceInformationStructure#getSubdeviceName()
	 * @see #getSubdeviceInformationStructure()
	 * @generated
	 */
	EReference getSubdeviceInformationStructure_SubdeviceName();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.SubdeviceInformationStructure#getDeviceInformation <em>Device Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Information</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.SubdeviceInformationStructure#getDeviceInformation()
	 * @see #getSubdeviceInformationStructure()
	 * @generated
	 */
	EReference getSubdeviceInformationStructure_DeviceInformation();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.devicemanagementservice.SubdeviceStatusInformationStructure <em>Subdevice Status Information Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subdevice Status Information Structure</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.SubdeviceStatusInformationStructure
	 * @generated
	 */
	EClass getSubdeviceStatusInformationStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.SubdeviceStatusInformationStructure#getSubdeviceName <em>Subdevice Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subdevice Name</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.SubdeviceStatusInformationStructure#getSubdeviceName()
	 * @see #getSubdeviceStatusInformationStructure()
	 * @generated
	 */
	EReference getSubdeviceStatusInformationStructure_SubdeviceName();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.devicemanagementservice.SubdeviceStatusInformationStructure#getDeviceStatusInformation <em>Device Status Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Status Information</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.SubdeviceStatusInformationStructure#getDeviceStatusInformation()
	 * @see #getSubdeviceStatusInformationStructure()
	 * @generated
	 */
	EReference getSubdeviceStatusInformationStructure_DeviceStatusInformation();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.ibis.devicemanagementservice.ChecksumTypeEnumeration <em>Checksum Type Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Checksum Type Enumeration</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.ChecksumTypeEnumeration
	 * @generated
	 */
	EEnum getChecksumTypeEnumeration();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.ibis.devicemanagementservice.UpdateAcceptEnumeration <em>Update Accept Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Update Accept Enumeration</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.UpdateAcceptEnumeration
	 * @generated
	 */
	EEnum getUpdateAcceptEnumeration();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.ibis.devicemanagementservice.UpdateStatusEnumeration <em>Update Status Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Update Status Enumeration</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.UpdateStatusEnumeration
	 * @generated
	 */
	EEnum getUpdateStatusEnumeration();

	/**
	 * Returns the meta object for data type '{@link de.jena.mdo.ibis.devicemanagementservice.ChecksumTypeEnumeration <em>Checksum Type Enumeration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Checksum Type Enumeration Object</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.ChecksumTypeEnumeration
	 * @model instanceClass="de.jena.mdo.ibis.devicemanagementservice.ChecksumTypeEnumeration"
	 *        extendedMetaData="name='ChecksumTypeEnumeration:Object' baseType='ChecksumTypeEnumeration'"
	 * @generated
	 */
	EDataType getChecksumTypeEnumerationObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.mdo.ibis.devicemanagementservice.UpdateAcceptEnumeration <em>Update Accept Enumeration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Update Accept Enumeration Object</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.UpdateAcceptEnumeration
	 * @model instanceClass="de.jena.mdo.ibis.devicemanagementservice.UpdateAcceptEnumeration"
	 *        extendedMetaData="name='UpdateAcceptEnumeration:Object' baseType='UpdateAcceptEnumeration'"
	 * @generated
	 */
	EDataType getUpdateAcceptEnumerationObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.mdo.ibis.devicemanagementservice.UpdateStatusEnumeration <em>Update Status Enumeration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Update Status Enumeration Object</em>'.
	 * @see de.jena.mdo.ibis.devicemanagementservice.UpdateStatusEnumeration
	 * @model instanceClass="de.jena.mdo.ibis.devicemanagementservice.UpdateStatusEnumeration"
	 *        extendedMetaData="name='UpdateStatusEnumeration:Object' baseType='UpdateStatusEnumeration'"
	 * @generated
	 */
	EDataType getUpdateStatusEnumerationObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IbisDeviceManagementServiceFactory getIbisDeviceManagementServiceFactory();

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
		 * The meta object literal for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.ChecksumStructureImpl <em>Checksum Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.ChecksumStructureImpl
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getChecksumStructure()
		 * @generated
		 */
		EClass CHECKSUM_STRUCTURE = eINSTANCE.getChecksumStructure();

		/**
		 * The meta object literal for the '<em><b>Checksum Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECKSUM_STRUCTURE__CHECKSUM_TYPE = eINSTANCE.getChecksumStructure_ChecksumType();

		/**
		 * The meta object literal for the '<em><b>Checksum</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECKSUM_STRUCTURE__CHECKSUM = eINSTANCE.getChecksumStructure_Checksum();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceFinalizeUpdateRequestStructureImpl <em>Device Management Service Finalize Update Request Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceFinalizeUpdateRequestStructureImpl
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceFinalizeUpdateRequestStructure()
		 * @generated
		 */
		EClass DEVICE_MANAGEMENT_SERVICE_FINALIZE_UPDATE_REQUEST_STRUCTURE = eINSTANCE.getDeviceManagementServiceFinalizeUpdateRequestStructure();

		/**
		 * The meta object literal for the '<em><b>Update ID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGEMENT_SERVICE_FINALIZE_UPDATE_REQUEST_STRUCTURE__UPDATE_ID = eINSTANCE.getDeviceManagementServiceFinalizeUpdateRequestStructure_UpdateID();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceFinalizeUpdateResponseStructureImpl <em>Device Management Service Finalize Update Response Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceFinalizeUpdateResponseStructureImpl
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceFinalizeUpdateResponseStructure()
		 * @generated
		 */
		EClass DEVICE_MANAGEMENT_SERVICE_FINALIZE_UPDATE_RESPONSE_STRUCTURE = eINSTANCE.getDeviceManagementServiceFinalizeUpdateResponseStructure();

		/**
		 * The meta object literal for the '<em><b>Update Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_MANAGEMENT_SERVICE_FINALIZE_UPDATE_RESPONSE_STRUCTURE__UPDATE_STATUS = eINSTANCE.getDeviceManagementServiceFinalizeUpdateResponseStructure_UpdateStatus();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructureImpl <em>Device Management Service Get All Subdevice Error Messages Response Data Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructureImpl
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure()
		 * @generated
		 */
		EClass DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_DATA_STRUCTURE = eINSTANCE.getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_DATA_STRUCTURE__TIME_STAMP = eINSTANCE.getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Subdevice Error Messages List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_DATA_STRUCTURE__SUBDEVICE_ERROR_MESSAGES_LIST = eINSTANCE.getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure_SubdeviceErrorMessagesList();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructureImpl <em>Device Management Service Get All Subdevice Error Messages Response Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructureImpl
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure()
		 * @generated
		 */
		EClass DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_STRUCTURE = eINSTANCE.getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure();

		/**
		 * The meta object literal for the '<em><b>Device Management Service Get All Subdevice Error Messages Response Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_DATA = eINSTANCE.getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure_DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseData();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetAllSubdeviceInformationResponseDataStructureImpl <em>Device Management Service Get All Subdevice Information Response Data Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetAllSubdeviceInformationResponseDataStructureImpl
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure()
		 * @generated
		 */
		EClass DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_INFORMATION_RESPONSE_DATA_STRUCTURE = eINSTANCE.getDeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_INFORMATION_RESPONSE_DATA_STRUCTURE__TIME_STAMP = eINSTANCE.getDeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Subdevice Information List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_INFORMATION_RESPONSE_DATA_STRUCTURE__SUBDEVICE_INFORMATION_LIST = eINSTANCE.getDeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure_SubdeviceInformationList();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetAllSubdeviceInformationResponseStructureImpl <em>Device Management Service Get All Subdevice Information Response Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetAllSubdeviceInformationResponseStructureImpl
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceGetAllSubdeviceInformationResponseStructure()
		 * @generated
		 */
		EClass DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_INFORMATION_RESPONSE_STRUCTURE = eINSTANCE.getDeviceManagementServiceGetAllSubdeviceInformationResponseStructure();

		/**
		 * The meta object literal for the '<em><b>Device Management Service Get All Subdevice Information Response Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_INFORMATION_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_INFORMATION_RESPONSE_DATA = eINSTANCE.getDeviceManagementServiceGetAllSubdeviceInformationResponseStructure_DeviceManagementServiceGetAllSubdeviceInformationResponseData();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructureImpl <em>Device Management Service Get All Subdevice Status Information Response Data Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructureImpl
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure()
		 * @generated
		 */
		EClass DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_DATA_STRUCTURE = eINSTANCE.getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_DATA_STRUCTURE__TIME_STAMP = eINSTANCE.getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Subdevice Status Information List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_DATA_STRUCTURE__SUBDEVICE_STATUS_INFORMATION_LIST = eINSTANCE.getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure_SubdeviceStatusInformationList();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructureImpl <em>Device Management Service Get All Subdevice Status Information Response Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructureImpl
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure()
		 * @generated
		 */
		EClass DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE = eINSTANCE.getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure();

		/**
		 * The meta object literal for the '<em><b>Device Management Service Get All Subdevice Status Information Response Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_DATA = eINSTANCE.getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure_DeviceManagementServiceGetAllSubdeviceStatusInformationResponseData();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetDeviceConfigurationResponseDataStructureImpl <em>Device Management Service Get Device Configuration Response Data Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetDeviceConfigurationResponseDataStructureImpl
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceGetDeviceConfigurationResponseDataStructure()
		 * @generated
		 */
		EClass DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_DATA_STRUCTURE = eINSTANCE.getDeviceManagementServiceGetDeviceConfigurationResponseDataStructure();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_DATA_STRUCTURE__TIME_STAMP = eINSTANCE.getDeviceManagementServiceGetDeviceConfigurationResponseDataStructure_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Device ID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_DATA_STRUCTURE__DEVICE_ID = eINSTANCE.getDeviceManagementServiceGetDeviceConfigurationResponseDataStructure_DeviceID();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetDeviceConfigurationResponseStructureImpl <em>Device Management Service Get Device Configuration Response Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetDeviceConfigurationResponseStructureImpl
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceGetDeviceConfigurationResponseStructure()
		 * @generated
		 */
		EClass DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_STRUCTURE = eINSTANCE.getDeviceManagementServiceGetDeviceConfigurationResponseStructure();

		/**
		 * The meta object literal for the '<em><b>Device Management Service Get Device Configuration Response Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_DATA = eINSTANCE.getDeviceManagementServiceGetDeviceConfigurationResponseStructure_DeviceManagementServiceGetDeviceConfigurationResponseData();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetDeviceErrorMessagesResponseDataStructureImpl <em>Device Management Service Get Device Error Messages Response Data Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetDeviceErrorMessagesResponseDataStructureImpl
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure()
		 * @generated
		 */
		EClass DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_DATA_STRUCTURE = eINSTANCE.getDeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_DATA_STRUCTURE__TIME_STAMP = eINSTANCE.getDeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Error Message</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_DATA_STRUCTURE__ERROR_MESSAGE = eINSTANCE.getDeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure_ErrorMessage();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetDeviceErrorMessagesResponseStructureImpl <em>Device Management Service Get Device Error Messages Response Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetDeviceErrorMessagesResponseStructureImpl
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceGetDeviceErrorMessagesResponseStructure()
		 * @generated
		 */
		EClass DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_STRUCTURE = eINSTANCE.getDeviceManagementServiceGetDeviceErrorMessagesResponseStructure();

		/**
		 * The meta object literal for the '<em><b>Device Management Service Get Device Error Messages Response Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_DATA = eINSTANCE.getDeviceManagementServiceGetDeviceErrorMessagesResponseStructure_DeviceManagementServiceGetDeviceErrorMessagesResponseData();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetDeviceInformationResponseDataStructureImpl <em>Device Management Service Get Device Information Response Data Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetDeviceInformationResponseDataStructureImpl
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceGetDeviceInformationResponseDataStructure()
		 * @generated
		 */
		EClass DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_DATA_STRUCTURE = eINSTANCE.getDeviceManagementServiceGetDeviceInformationResponseDataStructure();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_DATA_STRUCTURE__TIME_STAMP = eINSTANCE.getDeviceManagementServiceGetDeviceInformationResponseDataStructure_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Device Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_DATA_STRUCTURE__DEVICE_INFORMATION = eINSTANCE.getDeviceManagementServiceGetDeviceInformationResponseDataStructure_DeviceInformation();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetDeviceInformationResponseStructureImpl <em>Device Management Service Get Device Information Response Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetDeviceInformationResponseStructureImpl
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceGetDeviceInformationResponseStructure()
		 * @generated
		 */
		EClass DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_STRUCTURE = eINSTANCE.getDeviceManagementServiceGetDeviceInformationResponseStructure();

		/**
		 * The meta object literal for the '<em><b>Device Management Service Get Device Information Response Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_DATA = eINSTANCE.getDeviceManagementServiceGetDeviceInformationResponseStructure_DeviceManagementServiceGetDeviceInformationResponseData();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetDeviceStatusInformationResponseDataStructureImpl <em>Device Management Service Get Device Status Information Response Data Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetDeviceStatusInformationResponseDataStructureImpl
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceGetDeviceStatusInformationResponseDataStructure()
		 * @generated
		 */
		EClass DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_DATA_STRUCTURE = eINSTANCE.getDeviceManagementServiceGetDeviceStatusInformationResponseDataStructure();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_DATA_STRUCTURE__TIME_STAMP = eINSTANCE.getDeviceManagementServiceGetDeviceStatusInformationResponseDataStructure_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Device Status Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_DATA_STRUCTURE__DEVICE_STATUS_INFORMATION = eINSTANCE.getDeviceManagementServiceGetDeviceStatusInformationResponseDataStructure_DeviceStatusInformation();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetDeviceStatusInformationResponseStructureImpl <em>Device Management Service Get Device Status Information Response Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetDeviceStatusInformationResponseStructureImpl
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceGetDeviceStatusInformationResponseStructure()
		 * @generated
		 */
		EClass DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE = eINSTANCE.getDeviceManagementServiceGetDeviceStatusInformationResponseStructure();

		/**
		 * The meta object literal for the '<em><b>Device Management Service Get Device Status Information Response Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_DATA = eINSTANCE.getDeviceManagementServiceGetDeviceStatusInformationResponseStructure_DeviceManagementServiceGetDeviceStatusInformationResponseData();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetDeviceStatusResponseDataStructureImpl <em>Device Management Service Get Device Status Response Data Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetDeviceStatusResponseDataStructureImpl
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceGetDeviceStatusResponseDataStructure()
		 * @generated
		 */
		EClass DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_RESPONSE_DATA_STRUCTURE = eINSTANCE.getDeviceManagementServiceGetDeviceStatusResponseDataStructure();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_RESPONSE_DATA_STRUCTURE__TIME_STAMP = eINSTANCE.getDeviceManagementServiceGetDeviceStatusResponseDataStructure_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Device State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_RESPONSE_DATA_STRUCTURE__DEVICE_STATE = eINSTANCE.getDeviceManagementServiceGetDeviceStatusResponseDataStructure_DeviceState();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetDeviceStatusResponseStructureImpl <em>Device Management Service Get Device Status Response Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetDeviceStatusResponseStructureImpl
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceGetDeviceStatusResponseStructure()
		 * @generated
		 */
		EClass DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_RESPONSE_STRUCTURE = eINSTANCE.getDeviceManagementServiceGetDeviceStatusResponseStructure();

		/**
		 * The meta object literal for the '<em><b>Device Management Service Get Device Status Response Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_RESPONSE_DATA = eINSTANCE.getDeviceManagementServiceGetDeviceStatusResponseStructure_DeviceManagementServiceGetDeviceStatusResponseData();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetServiceInformationResponseDataStructureImpl <em>Device Management Service Get Service Information Response Data Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetServiceInformationResponseDataStructureImpl
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceGetServiceInformationResponseDataStructure()
		 * @generated
		 */
		EClass DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_INFORMATION_RESPONSE_DATA_STRUCTURE = eINSTANCE.getDeviceManagementServiceGetServiceInformationResponseDataStructure();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_INFORMATION_RESPONSE_DATA_STRUCTURE__TIME_STAMP = eINSTANCE.getDeviceManagementServiceGetServiceInformationResponseDataStructure_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Service Information List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_INFORMATION_RESPONSE_DATA_STRUCTURE__SERVICE_INFORMATION_LIST = eINSTANCE.getDeviceManagementServiceGetServiceInformationResponseDataStructure_ServiceInformationList();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetServiceInformationResponseStructureImpl <em>Device Management Service Get Service Information Response Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetServiceInformationResponseStructureImpl
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceGetServiceInformationResponseStructure()
		 * @generated
		 */
		EClass DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_INFORMATION_RESPONSE_STRUCTURE = eINSTANCE.getDeviceManagementServiceGetServiceInformationResponseStructure();

		/**
		 * The meta object literal for the '<em><b>Device Management Service Get Service Information Response Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_INFORMATION_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_INFORMATION_RESPONSE_DATA = eINSTANCE.getDeviceManagementServiceGetServiceInformationResponseStructure_DeviceManagementServiceGetServiceInformationResponseData();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetServiceStatusResponseDataStructureImpl <em>Device Management Service Get Service Status Response Data Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetServiceStatusResponseDataStructureImpl
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceGetServiceStatusResponseDataStructure()
		 * @generated
		 */
		EClass DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_STATUS_RESPONSE_DATA_STRUCTURE = eINSTANCE.getDeviceManagementServiceGetServiceStatusResponseDataStructure();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_STATUS_RESPONSE_DATA_STRUCTURE__TIME_STAMP = eINSTANCE.getDeviceManagementServiceGetServiceStatusResponseDataStructure_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Service Specification With State List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_STATUS_RESPONSE_DATA_STRUCTURE__SERVICE_SPECIFICATION_WITH_STATE_LIST = eINSTANCE.getDeviceManagementServiceGetServiceStatusResponseDataStructure_ServiceSpecificationWithStateList();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetServiceStatusResponseStructureImpl <em>Device Management Service Get Service Status Response Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetServiceStatusResponseStructureImpl
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceGetServiceStatusResponseStructure()
		 * @generated
		 */
		EClass DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_STATUS_RESPONSE_STRUCTURE = eINSTANCE.getDeviceManagementServiceGetServiceStatusResponseStructure();

		/**
		 * The meta object literal for the '<em><b>Device Management Service Get Service Status Response Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_STATUS_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_STATUS_RESPONSE_DATA = eINSTANCE.getDeviceManagementServiceGetServiceStatusResponseStructure_DeviceManagementServiceGetServiceStatusResponseData();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetUpdateHistoryResponseStructureImpl <em>Device Management Service Get Update History Response Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetUpdateHistoryResponseStructureImpl
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceGetUpdateHistoryResponseStructure()
		 * @generated
		 */
		EClass DEVICE_MANAGEMENT_SERVICE_GET_UPDATE_HISTORY_RESPONSE_STRUCTURE = eINSTANCE.getDeviceManagementServiceGetUpdateHistoryResponseStructure();

		/**
		 * The meta object literal for the '<em><b>Update History</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGEMENT_SERVICE_GET_UPDATE_HISTORY_RESPONSE_STRUCTURE__UPDATE_HISTORY = eINSTANCE.getDeviceManagementServiceGetUpdateHistoryResponseStructure_UpdateHistory();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceInstallUpdateRequestStructureImpl <em>Device Management Service Install Update Request Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceInstallUpdateRequestStructureImpl
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceInstallUpdateRequestStructure()
		 * @generated
		 */
		EClass DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE = eINSTANCE.getDeviceManagementServiceInstallUpdateRequestStructure();

		/**
		 * The meta object literal for the '<em><b>Update ID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_ID = eINSTANCE.getDeviceManagementServiceInstallUpdateRequestStructure_UpdateID();

		/**
		 * The meta object literal for the '<em><b>Update Timestamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_TIMESTAMP = eINSTANCE.getDeviceManagementServiceInstallUpdateRequestStructure_UpdateTimestamp();

		/**
		 * The meta object literal for the '<em><b>Update URL</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_URL = eINSTANCE.getDeviceManagementServiceInstallUpdateRequestStructure_UpdateURL();

		/**
		 * The meta object literal for the '<em><b>Update File Checksum</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_FILE_CHECKSUM = eINSTANCE.getDeviceManagementServiceInstallUpdateRequestStructure_UpdateFileChecksum();

		/**
		 * The meta object literal for the '<em><b>Update File Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_FILE_SIZE = eINSTANCE.getDeviceManagementServiceInstallUpdateRequestStructure_UpdateFileSize();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceInstallUpdateResponseStructureImpl <em>Device Management Service Install Update Response Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceInstallUpdateResponseStructureImpl
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceInstallUpdateResponseStructure()
		 * @generated
		 */
		EClass DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_RESPONSE_STRUCTURE = eINSTANCE.getDeviceManagementServiceInstallUpdateResponseStructure();

		/**
		 * The meta object literal for the '<em><b>Update Accept</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_RESPONSE_STRUCTURE__UPDATE_ACCEPT = eINSTANCE.getDeviceManagementServiceInstallUpdateResponseStructure_UpdateAccept();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceRetrieveUpdateStateRequestStructureImpl <em>Device Management Service Retrieve Update State Request Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceRetrieveUpdateStateRequestStructureImpl
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceRetrieveUpdateStateRequestStructure()
		 * @generated
		 */
		EClass DEVICE_MANAGEMENT_SERVICE_RETRIEVE_UPDATE_STATE_REQUEST_STRUCTURE = eINSTANCE.getDeviceManagementServiceRetrieveUpdateStateRequestStructure();

		/**
		 * The meta object literal for the '<em><b>Update ID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGEMENT_SERVICE_RETRIEVE_UPDATE_STATE_REQUEST_STRUCTURE__UPDATE_ID = eINSTANCE.getDeviceManagementServiceRetrieveUpdateStateRequestStructure_UpdateID();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceRetrieveUpdateStateResponseStructureImpl <em>Device Management Service Retrieve Update State Response Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceRetrieveUpdateStateResponseStructureImpl
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceRetrieveUpdateStateResponseStructure()
		 * @generated
		 */
		EClass DEVICE_MANAGEMENT_SERVICE_RETRIEVE_UPDATE_STATE_RESPONSE_STRUCTURE = eINSTANCE.getDeviceManagementServiceRetrieveUpdateStateResponseStructure();

		/**
		 * The meta object literal for the '<em><b>Update State Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGEMENT_SERVICE_RETRIEVE_UPDATE_STATE_RESPONSE_STRUCTURE__UPDATE_STATE_DATA = eINSTANCE.getDeviceManagementServiceRetrieveUpdateStateResponseStructure_UpdateStateData();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceUpdateHistoryEntryStructureImpl <em>Device Management Service Update History Entry Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceUpdateHistoryEntryStructureImpl
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceUpdateHistoryEntryStructure()
		 * @generated
		 */
		EClass DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE = eINSTANCE.getDeviceManagementServiceUpdateHistoryEntryStructure();

		/**
		 * The meta object literal for the '<em><b>Update ID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_ID = eINSTANCE.getDeviceManagementServiceUpdateHistoryEntryStructure_UpdateID();

		/**
		 * The meta object literal for the '<em><b>Update Timestamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_TIMESTAMP = eINSTANCE.getDeviceManagementServiceUpdateHistoryEntryStructure_UpdateTimestamp();

		/**
		 * The meta object literal for the '<em><b>Update URL</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_URL = eINSTANCE.getDeviceManagementServiceUpdateHistoryEntryStructure_UpdateURL();

		/**
		 * The meta object literal for the '<em><b>Update Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_STATUS = eINSTANCE.getDeviceManagementServiceUpdateHistoryEntryStructure_UpdateStatus();

		/**
		 * The meta object literal for the '<em><b>Data Version List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__DATA_VERSION_LIST = eINSTANCE.getDeviceManagementServiceUpdateHistoryEntryStructure_DataVersionList();

		/**
		 * The meta object literal for the '<em><b>Update Details</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_DETAILS = eINSTANCE.getDeviceManagementServiceUpdateHistoryEntryStructure_UpdateDetails();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceUpdateHistoryStructureImpl <em>Device Management Service Update History Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceUpdateHistoryStructureImpl
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceUpdateHistoryStructure()
		 * @generated
		 */
		EClass DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_STRUCTURE = eINSTANCE.getDeviceManagementServiceUpdateHistoryStructure();

		/**
		 * The meta object literal for the '<em><b>Update History Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_STRUCTURE__UPDATE_HISTORY_ENTRY = eINSTANCE.getDeviceManagementServiceUpdateHistoryStructure_UpdateHistoryEntry();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceUpdateStateDataStructureImpl <em>Device Management Service Update State Data Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceUpdateStateDataStructureImpl
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceManagementServiceUpdateStateDataStructure()
		 * @generated
		 */
		EClass DEVICE_MANAGEMENT_SERVICE_UPDATE_STATE_DATA_STRUCTURE = eINSTANCE.getDeviceManagementServiceUpdateStateDataStructure();

		/**
		 * The meta object literal for the '<em><b>Update ID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGEMENT_SERVICE_UPDATE_STATE_DATA_STRUCTURE__UPDATE_ID = eINSTANCE.getDeviceManagementServiceUpdateStateDataStructure_UpdateID();

		/**
		 * The meta object literal for the '<em><b>Update Timestamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGEMENT_SERVICE_UPDATE_STATE_DATA_STRUCTURE__UPDATE_TIMESTAMP = eINSTANCE.getDeviceManagementServiceUpdateStateDataStructure_UpdateTimestamp();

		/**
		 * The meta object literal for the '<em><b>Update Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_MANAGEMENT_SERVICE_UPDATE_STATE_DATA_STRUCTURE__UPDATE_STATUS = eINSTANCE.getDeviceManagementServiceUpdateStateDataStructure_UpdateStatus();

		/**
		 * The meta object literal for the '<em><b>Update Details</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MANAGEMENT_SERVICE_UPDATE_STATE_DATA_STRUCTURE__UPDATE_DETAILS = eINSTANCE.getDeviceManagementServiceUpdateStateDataStructure_UpdateDetails();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceStatusInformationStructureImpl <em>Device Status Information Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceStatusInformationStructureImpl
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceStatusInformationStructure()
		 * @generated
		 */
		EClass DEVICE_STATUS_INFORMATION_STRUCTURE = eINSTANCE.getDeviceStatusInformationStructure();

		/**
		 * The meta object literal for the '<em><b>Device State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_STATUS_INFORMATION_STRUCTURE__DEVICE_STATE = eINSTANCE.getDeviceStatusInformationStructure_DeviceState();

		/**
		 * The meta object literal for the '<em><b>Device Status List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_STATUS_INFORMATION_STRUCTURE__DEVICE_STATUS_LIST = eINSTANCE.getDeviceStatusInformationStructure_DeviceStatusList();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceStatusStructureImpl <em>Device Status Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.DeviceStatusStructureImpl
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceStatusStructure()
		 * @generated
		 */
		EClass DEVICE_STATUS_STRUCTURE = eINSTANCE.getDeviceStatusStructure();

		/**
		 * The meta object literal for the '<em><b>Device Status Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_STATUS_STRUCTURE__DEVICE_STATUS_NAME = eINSTANCE.getDeviceStatusStructure_DeviceStatusName();

		/**
		 * The meta object literal for the '<em><b>Device Status Flag</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_STATUS_STRUCTURE__DEVICE_STATUS_FLAG = eINSTANCE.getDeviceStatusStructure_DeviceStatusFlag();

		/**
		 * The meta object literal for the '<em><b>Device Status Impact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_STATUS_STRUCTURE__DEVICE_STATUS_IMPACT = eINSTANCE.getDeviceStatusStructure_DeviceStatusImpact();

		/**
		 * The meta object literal for the '<em><b>Device Status Priority</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_STATUS_STRUCTURE__DEVICE_STATUS_PRIORITY = eINSTANCE.getDeviceStatusStructure_DeviceStatusPriority();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.SubdeviceErrorMessagesStructureImpl <em>Subdevice Error Messages Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.SubdeviceErrorMessagesStructureImpl
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getSubdeviceErrorMessagesStructure()
		 * @generated
		 */
		EClass SUBDEVICE_ERROR_MESSAGES_STRUCTURE = eINSTANCE.getSubdeviceErrorMessagesStructure();

		/**
		 * The meta object literal for the '<em><b>Subdevice Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBDEVICE_ERROR_MESSAGES_STRUCTURE__SUBDEVICE_NAME = eINSTANCE.getSubdeviceErrorMessagesStructure_SubdeviceName();

		/**
		 * The meta object literal for the '<em><b>Error Message</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBDEVICE_ERROR_MESSAGES_STRUCTURE__ERROR_MESSAGE = eINSTANCE.getSubdeviceErrorMessagesStructure_ErrorMessage();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.SubdeviceInformationStructureImpl <em>Subdevice Information Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.SubdeviceInformationStructureImpl
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getSubdeviceInformationStructure()
		 * @generated
		 */
		EClass SUBDEVICE_INFORMATION_STRUCTURE = eINSTANCE.getSubdeviceInformationStructure();

		/**
		 * The meta object literal for the '<em><b>Subdevice Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBDEVICE_INFORMATION_STRUCTURE__SUBDEVICE_NAME = eINSTANCE.getSubdeviceInformationStructure_SubdeviceName();

		/**
		 * The meta object literal for the '<em><b>Device Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBDEVICE_INFORMATION_STRUCTURE__DEVICE_INFORMATION = eINSTANCE.getSubdeviceInformationStructure_DeviceInformation();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.devicemanagementservice.impl.SubdeviceStatusInformationStructureImpl <em>Subdevice Status Information Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.SubdeviceStatusInformationStructureImpl
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getSubdeviceStatusInformationStructure()
		 * @generated
		 */
		EClass SUBDEVICE_STATUS_INFORMATION_STRUCTURE = eINSTANCE.getSubdeviceStatusInformationStructure();

		/**
		 * The meta object literal for the '<em><b>Subdevice Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBDEVICE_STATUS_INFORMATION_STRUCTURE__SUBDEVICE_NAME = eINSTANCE.getSubdeviceStatusInformationStructure_SubdeviceName();

		/**
		 * The meta object literal for the '<em><b>Device Status Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBDEVICE_STATUS_INFORMATION_STRUCTURE__DEVICE_STATUS_INFORMATION = eINSTANCE.getSubdeviceStatusInformationStructure_DeviceStatusInformation();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.devicemanagementservice.ChecksumTypeEnumeration <em>Checksum Type Enumeration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.devicemanagementservice.ChecksumTypeEnumeration
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getChecksumTypeEnumeration()
		 * @generated
		 */
		EEnum CHECKSUM_TYPE_ENUMERATION = eINSTANCE.getChecksumTypeEnumeration();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.devicemanagementservice.UpdateAcceptEnumeration <em>Update Accept Enumeration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.devicemanagementservice.UpdateAcceptEnumeration
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getUpdateAcceptEnumeration()
		 * @generated
		 */
		EEnum UPDATE_ACCEPT_ENUMERATION = eINSTANCE.getUpdateAcceptEnumeration();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.devicemanagementservice.UpdateStatusEnumeration <em>Update Status Enumeration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.devicemanagementservice.UpdateStatusEnumeration
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getUpdateStatusEnumeration()
		 * @generated
		 */
		EEnum UPDATE_STATUS_ENUMERATION = eINSTANCE.getUpdateStatusEnumeration();

		/**
		 * The meta object literal for the '<em>Checksum Type Enumeration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.devicemanagementservice.ChecksumTypeEnumeration
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getChecksumTypeEnumerationObject()
		 * @generated
		 */
		EDataType CHECKSUM_TYPE_ENUMERATION_OBJECT = eINSTANCE.getChecksumTypeEnumerationObject();

		/**
		 * The meta object literal for the '<em>Update Accept Enumeration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.devicemanagementservice.UpdateAcceptEnumeration
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getUpdateAcceptEnumerationObject()
		 * @generated
		 */
		EDataType UPDATE_ACCEPT_ENUMERATION_OBJECT = eINSTANCE.getUpdateAcceptEnumerationObject();

		/**
		 * The meta object literal for the '<em>Update Status Enumeration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.devicemanagementservice.UpdateStatusEnumeration
		 * @see de.jena.mdo.ibis.devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getUpdateStatusEnumerationObject()
		 * @generated
		 */
		EDataType UPDATE_STATUS_ENUMERATION_OBJECT = eINSTANCE.getUpdateStatusEnumerationObject();

	}

} //IbisDeviceManagementServicePackage
