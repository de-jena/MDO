/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice;

import de.jena.mdo.ibis.ibis_common.IbisCommonPackage;

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
 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServiceFactory
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
	String eNAME = "ibis_devicemanagementservice";

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
	String eNS_PREFIX = "ibis_devicemanagementservice";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IbisDeviceManagementServicePackage eINSTANCE = de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.ChecksumImpl <em>Checksum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.ChecksumImpl
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getChecksum()
	 * @generated
	 */
	int CHECKSUM = 0;

	/**
	 * The feature id for the '<em><b>Checksum Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSUM__CHECKSUM_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Checksum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSUM__CHECKSUM = 1;

	/**
	 * The number of structural features of the '<em>Checksum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSUM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Checksum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSUM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.FinalizeUpdateRequestImpl <em>Finalize Update Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.FinalizeUpdateRequestImpl
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getFinalizeUpdateRequest()
	 * @generated
	 */
	int FINALIZE_UPDATE_REQUEST = 1;

	/**
	 * The feature id for the '<em><b>Update ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALIZE_UPDATE_REQUEST__UPDATE_ID = 0;

	/**
	 * The number of structural features of the '<em>Finalize Update Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALIZE_UPDATE_REQUEST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Finalize Update Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALIZE_UPDATE_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.FinalizeUpdateResponseImpl <em>Finalize Update Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.FinalizeUpdateResponseImpl
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getFinalizeUpdateResponse()
	 * @generated
	 */
	int FINALIZE_UPDATE_RESPONSE = 2;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALIZE_UPDATE_RESPONSE__OPERATION_ERROR_MESSAGE = IbisCommonPackage.GENERAL_RESPONSE__OPERATION_ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Update Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALIZE_UPDATE_RESPONSE__UPDATE_STATUS = IbisCommonPackage.GENERAL_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Finalize Update Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALIZE_UPDATE_RESPONSE_FEATURE_COUNT = IbisCommonPackage.GENERAL_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Finalize Update Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALIZE_UPDATE_RESPONSE_OPERATION_COUNT = IbisCommonPackage.GENERAL_RESPONSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.AllSubdeviceErrorMessagesDataImpl <em>All Subdevice Error Messages Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.AllSubdeviceErrorMessagesDataImpl
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getAllSubdeviceErrorMessagesData()
	 * @generated
	 */
	int ALL_SUBDEVICE_ERROR_MESSAGES_DATA = 3;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_SUBDEVICE_ERROR_MESSAGES_DATA__TIME_STAMP = 0;

	/**
	 * The feature id for the '<em><b>Subdevice Error Messages List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_SUBDEVICE_ERROR_MESSAGES_DATA__SUBDEVICE_ERROR_MESSAGES_LIST = 1;

	/**
	 * The number of structural features of the '<em>All Subdevice Error Messages Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_SUBDEVICE_ERROR_MESSAGES_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>All Subdevice Error Messages Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_SUBDEVICE_ERROR_MESSAGES_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.AllSubdeviceErrorMessagesResponseImpl <em>All Subdevice Error Messages Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.AllSubdeviceErrorMessagesResponseImpl
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getAllSubdeviceErrorMessagesResponse()
	 * @generated
	 */
	int ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE = 4;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE__OPERATION_ERROR_MESSAGE = IbisCommonPackage.GENERAL_RESPONSE__OPERATION_ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>All Subdevice Error Messages Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE__ALL_SUBDEVICE_ERROR_MESSAGES_DATA = IbisCommonPackage.GENERAL_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>All Subdevice Error Messages Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_FEATURE_COUNT = IbisCommonPackage.GENERAL_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>All Subdevice Error Messages Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_OPERATION_COUNT = IbisCommonPackage.GENERAL_RESPONSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.AllSubdeviceInformationDataImpl <em>All Subdevice Information Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.AllSubdeviceInformationDataImpl
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getAllSubdeviceInformationData()
	 * @generated
	 */
	int ALL_SUBDEVICE_INFORMATION_DATA = 5;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_SUBDEVICE_INFORMATION_DATA__TIME_STAMP = 0;

	/**
	 * The feature id for the '<em><b>Subdevice Information List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_SUBDEVICE_INFORMATION_DATA__SUBDEVICE_INFORMATION_LIST = 1;

	/**
	 * The number of structural features of the '<em>All Subdevice Information Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_SUBDEVICE_INFORMATION_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>All Subdevice Information Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_SUBDEVICE_INFORMATION_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.AllSubdeviceInformationResponseImpl <em>All Subdevice Information Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.AllSubdeviceInformationResponseImpl
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getAllSubdeviceInformationResponse()
	 * @generated
	 */
	int ALL_SUBDEVICE_INFORMATION_RESPONSE = 6;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_SUBDEVICE_INFORMATION_RESPONSE__OPERATION_ERROR_MESSAGE = IbisCommonPackage.GENERAL_RESPONSE__OPERATION_ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>All Subdevice Information Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_SUBDEVICE_INFORMATION_RESPONSE__ALL_SUBDEVICE_INFORMATION_DATA = IbisCommonPackage.GENERAL_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>All Subdevice Information Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_SUBDEVICE_INFORMATION_RESPONSE_FEATURE_COUNT = IbisCommonPackage.GENERAL_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>All Subdevice Information Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_SUBDEVICE_INFORMATION_RESPONSE_OPERATION_COUNT = IbisCommonPackage.GENERAL_RESPONSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.AllSubdeviceStatusInformationDataImpl <em>All Subdevice Status Information Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.AllSubdeviceStatusInformationDataImpl
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getAllSubdeviceStatusInformationData()
	 * @generated
	 */
	int ALL_SUBDEVICE_STATUS_INFORMATION_DATA = 7;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_SUBDEVICE_STATUS_INFORMATION_DATA__TIME_STAMP = 0;

	/**
	 * The feature id for the '<em><b>Subdevice Status Information List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_SUBDEVICE_STATUS_INFORMATION_DATA__SUBDEVICE_STATUS_INFORMATION_LIST = 1;

	/**
	 * The number of structural features of the '<em>All Subdevice Status Information Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_SUBDEVICE_STATUS_INFORMATION_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>All Subdevice Status Information Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_SUBDEVICE_STATUS_INFORMATION_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.AllSubdeviceStatusInformationResponseImpl <em>All Subdevice Status Information Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.AllSubdeviceStatusInformationResponseImpl
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getAllSubdeviceStatusInformationResponse()
	 * @generated
	 */
	int ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE = 8;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE__OPERATION_ERROR_MESSAGE = IbisCommonPackage.GENERAL_RESPONSE__OPERATION_ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>All Subdevice Status Information Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE__ALL_SUBDEVICE_STATUS_INFORMATION_DATA = IbisCommonPackage.GENERAL_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>All Subdevice Status Information Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_FEATURE_COUNT = IbisCommonPackage.GENERAL_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>All Subdevice Status Information Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_OPERATION_COUNT = IbisCommonPackage.GENERAL_RESPONSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceConfigurationDataImpl <em>Device Configuration Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceConfigurationDataImpl
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceConfigurationData()
	 * @generated
	 */
	int DEVICE_CONFIGURATION_DATA = 9;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CONFIGURATION_DATA__TIME_STAMP = 0;

	/**
	 * The feature id for the '<em><b>Device ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CONFIGURATION_DATA__DEVICE_ID = 1;

	/**
	 * The number of structural features of the '<em>Device Configuration Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CONFIGURATION_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Device Configuration Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CONFIGURATION_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceConfigurationResponseImpl <em>Device Configuration Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceConfigurationResponseImpl
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceConfigurationResponse()
	 * @generated
	 */
	int DEVICE_CONFIGURATION_RESPONSE = 10;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CONFIGURATION_RESPONSE__OPERATION_ERROR_MESSAGE = IbisCommonPackage.GENERAL_RESPONSE__OPERATION_ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Device Configuration Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CONFIGURATION_RESPONSE__DEVICE_CONFIGURATION_DATA = IbisCommonPackage.GENERAL_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Device Configuration Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CONFIGURATION_RESPONSE_FEATURE_COUNT = IbisCommonPackage.GENERAL_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Device Configuration Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CONFIGURATION_RESPONSE_OPERATION_COUNT = IbisCommonPackage.GENERAL_RESPONSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceErrorMessagesDataImpl <em>Device Error Messages Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceErrorMessagesDataImpl
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceErrorMessagesData()
	 * @generated
	 */
	int DEVICE_ERROR_MESSAGES_DATA = 11;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ERROR_MESSAGES_DATA__TIME_STAMP = 0;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ERROR_MESSAGES_DATA__ERROR_MESSAGE = 1;

	/**
	 * The number of structural features of the '<em>Device Error Messages Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ERROR_MESSAGES_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Device Error Messages Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ERROR_MESSAGES_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceErrorMessagesResponseImpl <em>Device Error Messages Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceErrorMessagesResponseImpl
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceErrorMessagesResponse()
	 * @generated
	 */
	int DEVICE_ERROR_MESSAGES_RESPONSE = 12;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ERROR_MESSAGES_RESPONSE__OPERATION_ERROR_MESSAGE = IbisCommonPackage.GENERAL_RESPONSE__OPERATION_ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Device Error Messages Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ERROR_MESSAGES_RESPONSE__DEVICE_ERROR_MESSAGES_DATA = IbisCommonPackage.GENERAL_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Device Error Messages Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ERROR_MESSAGES_RESPONSE_FEATURE_COUNT = IbisCommonPackage.GENERAL_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Device Error Messages Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ERROR_MESSAGES_RESPONSE_OPERATION_COUNT = IbisCommonPackage.GENERAL_RESPONSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceInformationDataImpl <em>Device Information Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceInformationDataImpl
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceInformationData()
	 * @generated
	 */
	int DEVICE_INFORMATION_DATA = 13;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INFORMATION_DATA__TIME_STAMP = 0;

	/**
	 * The feature id for the '<em><b>Device Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INFORMATION_DATA__DEVICE_INFORMATION = 1;

	/**
	 * The number of structural features of the '<em>Device Information Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INFORMATION_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Device Information Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INFORMATION_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceInformationResponseImpl <em>Device Information Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceInformationResponseImpl
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceInformationResponse()
	 * @generated
	 */
	int DEVICE_INFORMATION_RESPONSE = 14;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INFORMATION_RESPONSE__OPERATION_ERROR_MESSAGE = IbisCommonPackage.GENERAL_RESPONSE__OPERATION_ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Device Information Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INFORMATION_RESPONSE__DEVICE_INFORMATION_DATA = IbisCommonPackage.GENERAL_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Device Information Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INFORMATION_RESPONSE_FEATURE_COUNT = IbisCommonPackage.GENERAL_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Device Information Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INFORMATION_RESPONSE_OPERATION_COUNT = IbisCommonPackage.GENERAL_RESPONSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceStatusInformationDataImpl <em>Device Status Information Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceStatusInformationDataImpl
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceStatusInformationData()
	 * @generated
	 */
	int DEVICE_STATUS_INFORMATION_DATA = 15;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATUS_INFORMATION_DATA__TIME_STAMP = 0;

	/**
	 * The feature id for the '<em><b>Device Status Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATUS_INFORMATION_DATA__DEVICE_STATUS_INFORMATION = 1;

	/**
	 * The number of structural features of the '<em>Device Status Information Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATUS_INFORMATION_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Device Status Information Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATUS_INFORMATION_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceStatusInformationResponseImpl <em>Device Status Information Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceStatusInformationResponseImpl
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceStatusInformationResponse()
	 * @generated
	 */
	int DEVICE_STATUS_INFORMATION_RESPONSE = 16;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATUS_INFORMATION_RESPONSE__OPERATION_ERROR_MESSAGE = IbisCommonPackage.GENERAL_RESPONSE__OPERATION_ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Device Status Information Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATUS_INFORMATION_RESPONSE__DEVICE_STATUS_INFORMATION_DATA = IbisCommonPackage.GENERAL_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Device Status Information Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATUS_INFORMATION_RESPONSE_FEATURE_COUNT = IbisCommonPackage.GENERAL_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Device Status Information Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATUS_INFORMATION_RESPONSE_OPERATION_COUNT = IbisCommonPackage.GENERAL_RESPONSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceStatusDataImpl <em>Device Status Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceStatusDataImpl
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceStatusData()
	 * @generated
	 */
	int DEVICE_STATUS_DATA = 17;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATUS_DATA__TIME_STAMP = 0;

	/**
	 * The feature id for the '<em><b>Device State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATUS_DATA__DEVICE_STATE = 1;

	/**
	 * The number of structural features of the '<em>Device Status Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATUS_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Device Status Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATUS_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceStatusResponseImpl <em>Device Status Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceStatusResponseImpl
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceStatusResponse()
	 * @generated
	 */
	int DEVICE_STATUS_RESPONSE = 18;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATUS_RESPONSE__OPERATION_ERROR_MESSAGE = IbisCommonPackage.GENERAL_RESPONSE__OPERATION_ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Device Status Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATUS_RESPONSE__DEVICE_STATUS_DATA = IbisCommonPackage.GENERAL_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Device Status Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATUS_RESPONSE_FEATURE_COUNT = IbisCommonPackage.GENERAL_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Device Status Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATUS_RESPONSE_OPERATION_COUNT = IbisCommonPackage.GENERAL_RESPONSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.ServiceInformationDataImpl <em>Service Information Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.ServiceInformationDataImpl
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getServiceInformationData()
	 * @generated
	 */
	int SERVICE_INFORMATION_DATA = 19;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INFORMATION_DATA__TIME_STAMP = 0;

	/**
	 * The feature id for the '<em><b>Service Information List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INFORMATION_DATA__SERVICE_INFORMATION_LIST = 1;

	/**
	 * The number of structural features of the '<em>Service Information Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INFORMATION_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service Information Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INFORMATION_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.ServiceInformationResponseImpl <em>Service Information Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.ServiceInformationResponseImpl
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getServiceInformationResponse()
	 * @generated
	 */
	int SERVICE_INFORMATION_RESPONSE = 20;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INFORMATION_RESPONSE__OPERATION_ERROR_MESSAGE = IbisCommonPackage.GENERAL_RESPONSE__OPERATION_ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Service Information Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INFORMATION_RESPONSE__SERVICE_INFORMATION_DATA = IbisCommonPackage.GENERAL_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Information Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INFORMATION_RESPONSE_FEATURE_COUNT = IbisCommonPackage.GENERAL_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Service Information Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INFORMATION_RESPONSE_OPERATION_COUNT = IbisCommonPackage.GENERAL_RESPONSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.ServiceStatusDataImpl <em>Service Status Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.ServiceStatusDataImpl
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getServiceStatusData()
	 * @generated
	 */
	int SERVICE_STATUS_DATA = 21;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_STATUS_DATA__TIME_STAMP = 0;

	/**
	 * The feature id for the '<em><b>Service Specification With State List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_STATUS_DATA__SERVICE_SPECIFICATION_WITH_STATE_LIST = 1;

	/**
	 * The number of structural features of the '<em>Service Status Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_STATUS_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service Status Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_STATUS_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.ServiceStatusResponseImpl <em>Service Status Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.ServiceStatusResponseImpl
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getServiceStatusResponse()
	 * @generated
	 */
	int SERVICE_STATUS_RESPONSE = 22;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_STATUS_RESPONSE__OPERATION_ERROR_MESSAGE = IbisCommonPackage.GENERAL_RESPONSE__OPERATION_ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Service Status Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_STATUS_RESPONSE__SERVICE_STATUS_DATA = IbisCommonPackage.GENERAL_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Status Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_STATUS_RESPONSE_FEATURE_COUNT = IbisCommonPackage.GENERAL_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Service Status Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_STATUS_RESPONSE_OPERATION_COUNT = IbisCommonPackage.GENERAL_RESPONSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.UpdateHistoryResponseImpl <em>Update History Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.UpdateHistoryResponseImpl
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getUpdateHistoryResponse()
	 * @generated
	 */
	int UPDATE_HISTORY_RESPONSE = 23;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_HISTORY_RESPONSE__OPERATION_ERROR_MESSAGE = IbisCommonPackage.GENERAL_RESPONSE__OPERATION_ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Update History</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_HISTORY_RESPONSE__UPDATE_HISTORY = IbisCommonPackage.GENERAL_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Update History Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_HISTORY_RESPONSE_FEATURE_COUNT = IbisCommonPackage.GENERAL_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Update History Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_HISTORY_RESPONSE_OPERATION_COUNT = IbisCommonPackage.GENERAL_RESPONSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.InstallUpdateRequestImpl <em>Install Update Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.InstallUpdateRequestImpl
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getInstallUpdateRequest()
	 * @generated
	 */
	int INSTALL_UPDATE_REQUEST = 24;

	/**
	 * The feature id for the '<em><b>Update ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALL_UPDATE_REQUEST__UPDATE_ID = 0;

	/**
	 * The feature id for the '<em><b>Update Timestamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALL_UPDATE_REQUEST__UPDATE_TIMESTAMP = 1;

	/**
	 * The feature id for the '<em><b>Update URL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALL_UPDATE_REQUEST__UPDATE_URL = 2;

	/**
	 * The feature id for the '<em><b>Update File Checksum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALL_UPDATE_REQUEST__UPDATE_FILE_CHECKSUM = 3;

	/**
	 * The feature id for the '<em><b>Update File Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALL_UPDATE_REQUEST__UPDATE_FILE_SIZE = 4;

	/**
	 * The number of structural features of the '<em>Install Update Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALL_UPDATE_REQUEST_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Install Update Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALL_UPDATE_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.InstallUpdateResponseImpl <em>Install Update Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.InstallUpdateResponseImpl
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getInstallUpdateResponse()
	 * @generated
	 */
	int INSTALL_UPDATE_RESPONSE = 25;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALL_UPDATE_RESPONSE__OPERATION_ERROR_MESSAGE = IbisCommonPackage.GENERAL_RESPONSE__OPERATION_ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Update Accept</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALL_UPDATE_RESPONSE__UPDATE_ACCEPT = IbisCommonPackage.GENERAL_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Install Update Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALL_UPDATE_RESPONSE_FEATURE_COUNT = IbisCommonPackage.GENERAL_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Install Update Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALL_UPDATE_RESPONSE_OPERATION_COUNT = IbisCommonPackage.GENERAL_RESPONSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.RetrieveUpdateStateRequestImpl <em>Retrieve Update State Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.RetrieveUpdateStateRequestImpl
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getRetrieveUpdateStateRequest()
	 * @generated
	 */
	int RETRIEVE_UPDATE_STATE_REQUEST = 26;

	/**
	 * The feature id for the '<em><b>Update ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRIEVE_UPDATE_STATE_REQUEST__UPDATE_ID = 0;

	/**
	 * The number of structural features of the '<em>Retrieve Update State Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRIEVE_UPDATE_STATE_REQUEST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Retrieve Update State Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRIEVE_UPDATE_STATE_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.RetrieveUpdateStateResponseImpl <em>Retrieve Update State Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.RetrieveUpdateStateResponseImpl
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getRetrieveUpdateStateResponse()
	 * @generated
	 */
	int RETRIEVE_UPDATE_STATE_RESPONSE = 27;

	/**
	 * The feature id for the '<em><b>Operation Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRIEVE_UPDATE_STATE_RESPONSE__OPERATION_ERROR_MESSAGE = IbisCommonPackage.GENERAL_RESPONSE__OPERATION_ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Update State Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRIEVE_UPDATE_STATE_RESPONSE__UPDATE_STATE_DATA = IbisCommonPackage.GENERAL_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Retrieve Update State Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRIEVE_UPDATE_STATE_RESPONSE_FEATURE_COUNT = IbisCommonPackage.GENERAL_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Retrieve Update State Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRIEVE_UPDATE_STATE_RESPONSE_OPERATION_COUNT = IbisCommonPackage.GENERAL_RESPONSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.UpdateHistoryEntryImpl <em>Update History Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.UpdateHistoryEntryImpl
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getUpdateHistoryEntry()
	 * @generated
	 */
	int UPDATE_HISTORY_ENTRY = 28;

	/**
	 * The feature id for the '<em><b>Update ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_HISTORY_ENTRY__UPDATE_ID = 0;

	/**
	 * The feature id for the '<em><b>Update Timestamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_HISTORY_ENTRY__UPDATE_TIMESTAMP = 1;

	/**
	 * The feature id for the '<em><b>Update URL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_HISTORY_ENTRY__UPDATE_URL = 2;

	/**
	 * The feature id for the '<em><b>Update Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_HISTORY_ENTRY__UPDATE_STATUS = 3;

	/**
	 * The feature id for the '<em><b>Data Version List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_HISTORY_ENTRY__DATA_VERSION_LIST = 4;

	/**
	 * The feature id for the '<em><b>Update Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_HISTORY_ENTRY__UPDATE_DETAILS = 5;

	/**
	 * The number of structural features of the '<em>Update History Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_HISTORY_ENTRY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Update History Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_HISTORY_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.UpdateHistoryImpl <em>Update History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.UpdateHistoryImpl
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getUpdateHistory()
	 * @generated
	 */
	int UPDATE_HISTORY = 29;

	/**
	 * The feature id for the '<em><b>Update History Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_HISTORY__UPDATE_HISTORY_ENTRY = 0;

	/**
	 * The number of structural features of the '<em>Update History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_HISTORY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Update History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_HISTORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.UpdateStateDataImpl <em>Update State Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.UpdateStateDataImpl
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getUpdateStateData()
	 * @generated
	 */
	int UPDATE_STATE_DATA = 30;

	/**
	 * The feature id for the '<em><b>Update ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_STATE_DATA__UPDATE_ID = 0;

	/**
	 * The feature id for the '<em><b>Update Timestamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_STATE_DATA__UPDATE_TIMESTAMP = 1;

	/**
	 * The feature id for the '<em><b>Update Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_STATE_DATA__UPDATE_STATUS = 2;

	/**
	 * The feature id for the '<em><b>Update Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_STATE_DATA__UPDATE_DETAILS = 3;

	/**
	 * The number of structural features of the '<em>Update State Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_STATE_DATA_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Update State Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_STATE_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceStatusInformationImpl <em>Device Status Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceStatusInformationImpl
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceStatusInformation()
	 * @generated
	 */
	int DEVICE_STATUS_INFORMATION = 31;

	/**
	 * The feature id for the '<em><b>Device State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATUS_INFORMATION__DEVICE_STATE = 0;

	/**
	 * The feature id for the '<em><b>Device Status List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATUS_INFORMATION__DEVICE_STATUS_LIST = 1;

	/**
	 * The number of structural features of the '<em>Device Status Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATUS_INFORMATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Device Status Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATUS_INFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceStatusImpl <em>Device Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceStatusImpl
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceStatus()
	 * @generated
	 */
	int DEVICE_STATUS = 32;

	/**
	 * The feature id for the '<em><b>Device Status Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATUS__DEVICE_STATUS_NAME = 0;

	/**
	 * The feature id for the '<em><b>Device Status Flag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATUS__DEVICE_STATUS_FLAG = 1;

	/**
	 * The feature id for the '<em><b>Device Status Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATUS__DEVICE_STATUS_IMPACT = 2;

	/**
	 * The feature id for the '<em><b>Device Status Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATUS__DEVICE_STATUS_PRIORITY = 3;

	/**
	 * The number of structural features of the '<em>Device Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATUS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Device Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.SubdeviceErrorMessagesImpl <em>Subdevice Error Messages</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.SubdeviceErrorMessagesImpl
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getSubdeviceErrorMessages()
	 * @generated
	 */
	int SUBDEVICE_ERROR_MESSAGES = 33;

	/**
	 * The feature id for the '<em><b>Subdevice Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_ERROR_MESSAGES__SUBDEVICE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_ERROR_MESSAGES__ERROR_MESSAGE = 1;

	/**
	 * The number of structural features of the '<em>Subdevice Error Messages</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_ERROR_MESSAGES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Subdevice Error Messages</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_ERROR_MESSAGES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.SubdeviceInformationImpl <em>Subdevice Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.SubdeviceInformationImpl
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getSubdeviceInformation()
	 * @generated
	 */
	int SUBDEVICE_INFORMATION = 34;

	/**
	 * The feature id for the '<em><b>Subdevice Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_INFORMATION__SUBDEVICE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Device Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_INFORMATION__DEVICE_INFORMATION = 1;

	/**
	 * The number of structural features of the '<em>Subdevice Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_INFORMATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Subdevice Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_INFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.SubdeviceStatusInformationImpl <em>Subdevice Status Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.SubdeviceStatusInformationImpl
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getSubdeviceStatusInformation()
	 * @generated
	 */
	int SUBDEVICE_STATUS_INFORMATION = 35;

	/**
	 * The feature id for the '<em><b>Subdevice Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_STATUS_INFORMATION__SUBDEVICE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Device Status Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_STATUS_INFORMATION__DEVICE_STATUS_INFORMATION = 1;

	/**
	 * The number of structural features of the '<em>Subdevice Status Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_STATUS_INFORMATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Subdevice Status Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBDEVICE_STATUS_INFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.ChecksumType <em>Checksum Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.ChecksumType
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getChecksumType()
	 * @generated
	 */
	int CHECKSUM_TYPE = 36;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateAcceptType <em>Update Accept Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateAcceptType
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getUpdateAcceptType()
	 * @generated
	 */
	int UPDATE_ACCEPT_TYPE = 37;

	/**
	 * The meta object id for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateStatusType <em>Update Status Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateStatusType
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getUpdateStatusType()
	 * @generated
	 */
	int UPDATE_STATUS_TYPE = 38;

	/**
	 * The meta object id for the '<em>Checksum Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.ChecksumType
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getChecksumTypeObject()
	 * @generated
	 */
	int CHECKSUM_TYPE_OBJECT = 39;

	/**
	 * The meta object id for the '<em>Update Accept Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateAcceptType
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getUpdateAcceptTypeObject()
	 * @generated
	 */
	int UPDATE_ACCEPT_TYPE_OBJECT = 40;

	/**
	 * The meta object id for the '<em>Update Status Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateStatusType
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getUpdateStatusTypeObject()
	 * @generated
	 */
	int UPDATE_STATUS_TYPE_OBJECT = 41;


	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.Checksum <em>Checksum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Checksum</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.Checksum
	 * @generated
	 */
	EClass getChecksum();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.Checksum#getChecksumType <em>Checksum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checksum Type</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.Checksum#getChecksumType()
	 * @see #getChecksum()
	 * @generated
	 */
	EAttribute getChecksum_ChecksumType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.Checksum#getChecksum <em>Checksum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Checksum</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.Checksum#getChecksum()
	 * @see #getChecksum()
	 * @generated
	 */
	EReference getChecksum_Checksum();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.FinalizeUpdateRequest <em>Finalize Update Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finalize Update Request</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.FinalizeUpdateRequest
	 * @generated
	 */
	EClass getFinalizeUpdateRequest();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.FinalizeUpdateRequest#getUpdateID <em>Update ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update ID</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.FinalizeUpdateRequest#getUpdateID()
	 * @see #getFinalizeUpdateRequest()
	 * @generated
	 */
	EReference getFinalizeUpdateRequest_UpdateID();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.FinalizeUpdateResponse <em>Finalize Update Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finalize Update Response</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.FinalizeUpdateResponse
	 * @generated
	 */
	EClass getFinalizeUpdateResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.FinalizeUpdateResponse#getUpdateStatus <em>Update Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Status</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.FinalizeUpdateResponse#getUpdateStatus()
	 * @see #getFinalizeUpdateResponse()
	 * @generated
	 */
	EAttribute getFinalizeUpdateResponse_UpdateStatus();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceErrorMessagesData <em>All Subdevice Error Messages Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All Subdevice Error Messages Data</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceErrorMessagesData
	 * @generated
	 */
	EClass getAllSubdeviceErrorMessagesData();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceErrorMessagesData#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Stamp</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceErrorMessagesData#getTimeStamp()
	 * @see #getAllSubdeviceErrorMessagesData()
	 * @generated
	 */
	EReference getAllSubdeviceErrorMessagesData_TimeStamp();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceErrorMessagesData#getSubdeviceErrorMessagesList <em>Subdevice Error Messages List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subdevice Error Messages List</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceErrorMessagesData#getSubdeviceErrorMessagesList()
	 * @see #getAllSubdeviceErrorMessagesData()
	 * @generated
	 */
	EReference getAllSubdeviceErrorMessagesData_SubdeviceErrorMessagesList();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceErrorMessagesResponse <em>All Subdevice Error Messages Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All Subdevice Error Messages Response</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceErrorMessagesResponse
	 * @generated
	 */
	EClass getAllSubdeviceErrorMessagesResponse();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceErrorMessagesResponse#getAllSubdeviceErrorMessagesData <em>All Subdevice Error Messages Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All Subdevice Error Messages Data</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceErrorMessagesResponse#getAllSubdeviceErrorMessagesData()
	 * @see #getAllSubdeviceErrorMessagesResponse()
	 * @generated
	 */
	EReference getAllSubdeviceErrorMessagesResponse_AllSubdeviceErrorMessagesData();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceInformationData <em>All Subdevice Information Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All Subdevice Information Data</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceInformationData
	 * @generated
	 */
	EClass getAllSubdeviceInformationData();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceInformationData#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Stamp</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceInformationData#getTimeStamp()
	 * @see #getAllSubdeviceInformationData()
	 * @generated
	 */
	EReference getAllSubdeviceInformationData_TimeStamp();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceInformationData#getSubdeviceInformationList <em>Subdevice Information List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subdevice Information List</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceInformationData#getSubdeviceInformationList()
	 * @see #getAllSubdeviceInformationData()
	 * @generated
	 */
	EReference getAllSubdeviceInformationData_SubdeviceInformationList();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceInformationResponse <em>All Subdevice Information Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All Subdevice Information Response</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceInformationResponse
	 * @generated
	 */
	EClass getAllSubdeviceInformationResponse();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceInformationResponse#getAllSubdeviceInformationData <em>All Subdevice Information Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All Subdevice Information Data</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceInformationResponse#getAllSubdeviceInformationData()
	 * @see #getAllSubdeviceInformationResponse()
	 * @generated
	 */
	EReference getAllSubdeviceInformationResponse_AllSubdeviceInformationData();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceStatusInformationData <em>All Subdevice Status Information Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All Subdevice Status Information Data</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceStatusInformationData
	 * @generated
	 */
	EClass getAllSubdeviceStatusInformationData();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceStatusInformationData#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Stamp</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceStatusInformationData#getTimeStamp()
	 * @see #getAllSubdeviceStatusInformationData()
	 * @generated
	 */
	EReference getAllSubdeviceStatusInformationData_TimeStamp();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceStatusInformationData#getSubdeviceStatusInformationList <em>Subdevice Status Information List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subdevice Status Information List</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceStatusInformationData#getSubdeviceStatusInformationList()
	 * @see #getAllSubdeviceStatusInformationData()
	 * @generated
	 */
	EReference getAllSubdeviceStatusInformationData_SubdeviceStatusInformationList();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceStatusInformationResponse <em>All Subdevice Status Information Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All Subdevice Status Information Response</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceStatusInformationResponse
	 * @generated
	 */
	EClass getAllSubdeviceStatusInformationResponse();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceStatusInformationResponse#getAllSubdeviceStatusInformationData <em>All Subdevice Status Information Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All Subdevice Status Information Data</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceStatusInformationResponse#getAllSubdeviceStatusInformationData()
	 * @see #getAllSubdeviceStatusInformationResponse()
	 * @generated
	 */
	EReference getAllSubdeviceStatusInformationResponse_AllSubdeviceStatusInformationData();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceConfigurationData <em>Device Configuration Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Configuration Data</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceConfigurationData
	 * @generated
	 */
	EClass getDeviceConfigurationData();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceConfigurationData#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Stamp</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceConfigurationData#getTimeStamp()
	 * @see #getDeviceConfigurationData()
	 * @generated
	 */
	EReference getDeviceConfigurationData_TimeStamp();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceConfigurationData#getDeviceID <em>Device ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device ID</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceConfigurationData#getDeviceID()
	 * @see #getDeviceConfigurationData()
	 * @generated
	 */
	EReference getDeviceConfigurationData_DeviceID();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceConfigurationResponse <em>Device Configuration Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Configuration Response</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceConfigurationResponse
	 * @generated
	 */
	EClass getDeviceConfigurationResponse();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceConfigurationResponse#getDeviceConfigurationData <em>Device Configuration Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Configuration Data</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceConfigurationResponse#getDeviceConfigurationData()
	 * @see #getDeviceConfigurationResponse()
	 * @generated
	 */
	EReference getDeviceConfigurationResponse_DeviceConfigurationData();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceErrorMessagesData <em>Device Error Messages Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Error Messages Data</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceErrorMessagesData
	 * @generated
	 */
	EClass getDeviceErrorMessagesData();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceErrorMessagesData#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Stamp</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceErrorMessagesData#getTimeStamp()
	 * @see #getDeviceErrorMessagesData()
	 * @generated
	 */
	EReference getDeviceErrorMessagesData_TimeStamp();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceErrorMessagesData#getErrorMessage <em>Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Error Message</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceErrorMessagesData#getErrorMessage()
	 * @see #getDeviceErrorMessagesData()
	 * @generated
	 */
	EReference getDeviceErrorMessagesData_ErrorMessage();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceErrorMessagesResponse <em>Device Error Messages Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Error Messages Response</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceErrorMessagesResponse
	 * @generated
	 */
	EClass getDeviceErrorMessagesResponse();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceErrorMessagesResponse#getDeviceErrorMessagesData <em>Device Error Messages Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Error Messages Data</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceErrorMessagesResponse#getDeviceErrorMessagesData()
	 * @see #getDeviceErrorMessagesResponse()
	 * @generated
	 */
	EReference getDeviceErrorMessagesResponse_DeviceErrorMessagesData();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceInformationData <em>Device Information Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Information Data</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceInformationData
	 * @generated
	 */
	EClass getDeviceInformationData();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceInformationData#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Stamp</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceInformationData#getTimeStamp()
	 * @see #getDeviceInformationData()
	 * @generated
	 */
	EReference getDeviceInformationData_TimeStamp();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceInformationData#getDeviceInformation <em>Device Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Information</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceInformationData#getDeviceInformation()
	 * @see #getDeviceInformationData()
	 * @generated
	 */
	EReference getDeviceInformationData_DeviceInformation();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceInformationResponse <em>Device Information Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Information Response</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceInformationResponse
	 * @generated
	 */
	EClass getDeviceInformationResponse();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceInformationResponse#getDeviceInformationData <em>Device Information Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Information Data</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceInformationResponse#getDeviceInformationData()
	 * @see #getDeviceInformationResponse()
	 * @generated
	 */
	EReference getDeviceInformationResponse_DeviceInformationData();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusInformationData <em>Device Status Information Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Status Information Data</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusInformationData
	 * @generated
	 */
	EClass getDeviceStatusInformationData();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusInformationData#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Stamp</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusInformationData#getTimeStamp()
	 * @see #getDeviceStatusInformationData()
	 * @generated
	 */
	EReference getDeviceStatusInformationData_TimeStamp();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusInformationData#getDeviceStatusInformation <em>Device Status Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Status Information</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusInformationData#getDeviceStatusInformation()
	 * @see #getDeviceStatusInformationData()
	 * @generated
	 */
	EReference getDeviceStatusInformationData_DeviceStatusInformation();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusInformationResponse <em>Device Status Information Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Status Information Response</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusInformationResponse
	 * @generated
	 */
	EClass getDeviceStatusInformationResponse();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusInformationResponse#getDeviceStatusInformationData <em>Device Status Information Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Status Information Data</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusInformationResponse#getDeviceStatusInformationData()
	 * @see #getDeviceStatusInformationResponse()
	 * @generated
	 */
	EReference getDeviceStatusInformationResponse_DeviceStatusInformationData();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusData <em>Device Status Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Status Data</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusData
	 * @generated
	 */
	EClass getDeviceStatusData();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusData#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Stamp</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusData#getTimeStamp()
	 * @see #getDeviceStatusData()
	 * @generated
	 */
	EReference getDeviceStatusData_TimeStamp();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusData#getDeviceState <em>Device State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device State</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusData#getDeviceState()
	 * @see #getDeviceStatusData()
	 * @generated
	 */
	EAttribute getDeviceStatusData_DeviceState();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusResponse <em>Device Status Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Status Response</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusResponse
	 * @generated
	 */
	EClass getDeviceStatusResponse();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusResponse#getDeviceStatusData <em>Device Status Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Status Data</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusResponse#getDeviceStatusData()
	 * @see #getDeviceStatusResponse()
	 * @generated
	 */
	EReference getDeviceStatusResponse_DeviceStatusData();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceInformationData <em>Service Information Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Information Data</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceInformationData
	 * @generated
	 */
	EClass getServiceInformationData();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceInformationData#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Stamp</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceInformationData#getTimeStamp()
	 * @see #getServiceInformationData()
	 * @generated
	 */
	EReference getServiceInformationData_TimeStamp();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceInformationData#getServiceInformationList <em>Service Information List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Information List</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceInformationData#getServiceInformationList()
	 * @see #getServiceInformationData()
	 * @generated
	 */
	EReference getServiceInformationData_ServiceInformationList();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceInformationResponse <em>Service Information Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Information Response</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceInformationResponse
	 * @generated
	 */
	EClass getServiceInformationResponse();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceInformationResponse#getServiceInformationData <em>Service Information Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Information Data</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceInformationResponse#getServiceInformationData()
	 * @see #getServiceInformationResponse()
	 * @generated
	 */
	EReference getServiceInformationResponse_ServiceInformationData();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceStatusData <em>Service Status Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Status Data</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceStatusData
	 * @generated
	 */
	EClass getServiceStatusData();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceStatusData#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Stamp</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceStatusData#getTimeStamp()
	 * @see #getServiceStatusData()
	 * @generated
	 */
	EReference getServiceStatusData_TimeStamp();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceStatusData#getServiceSpecificationWithStateList <em>Service Specification With State List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Specification With State List</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceStatusData#getServiceSpecificationWithStateList()
	 * @see #getServiceStatusData()
	 * @generated
	 */
	EReference getServiceStatusData_ServiceSpecificationWithStateList();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceStatusResponse <em>Service Status Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Status Response</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceStatusResponse
	 * @generated
	 */
	EClass getServiceStatusResponse();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceStatusResponse#getServiceStatusData <em>Service Status Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Status Data</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceStatusResponse#getServiceStatusData()
	 * @see #getServiceStatusResponse()
	 * @generated
	 */
	EReference getServiceStatusResponse_ServiceStatusData();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistoryResponse <em>Update History Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update History Response</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistoryResponse
	 * @generated
	 */
	EClass getUpdateHistoryResponse();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistoryResponse#getUpdateHistory <em>Update History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update History</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistoryResponse#getUpdateHistory()
	 * @see #getUpdateHistoryResponse()
	 * @generated
	 */
	EReference getUpdateHistoryResponse_UpdateHistory();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.InstallUpdateRequest <em>Install Update Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Install Update Request</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.InstallUpdateRequest
	 * @generated
	 */
	EClass getInstallUpdateRequest();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.InstallUpdateRequest#getUpdateID <em>Update ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update ID</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.InstallUpdateRequest#getUpdateID()
	 * @see #getInstallUpdateRequest()
	 * @generated
	 */
	EReference getInstallUpdateRequest_UpdateID();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.InstallUpdateRequest#getUpdateTimestamp <em>Update Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update Timestamp</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.InstallUpdateRequest#getUpdateTimestamp()
	 * @see #getInstallUpdateRequest()
	 * @generated
	 */
	EReference getInstallUpdateRequest_UpdateTimestamp();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.InstallUpdateRequest#getUpdateURL <em>Update URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update URL</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.InstallUpdateRequest#getUpdateURL()
	 * @see #getInstallUpdateRequest()
	 * @generated
	 */
	EReference getInstallUpdateRequest_UpdateURL();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.InstallUpdateRequest#getUpdateFileChecksum <em>Update File Checksum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update File Checksum</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.InstallUpdateRequest#getUpdateFileChecksum()
	 * @see #getInstallUpdateRequest()
	 * @generated
	 */
	EReference getInstallUpdateRequest_UpdateFileChecksum();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.InstallUpdateRequest#getUpdateFileSize <em>Update File Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update File Size</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.InstallUpdateRequest#getUpdateFileSize()
	 * @see #getInstallUpdateRequest()
	 * @generated
	 */
	EReference getInstallUpdateRequest_UpdateFileSize();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.InstallUpdateResponse <em>Install Update Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Install Update Response</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.InstallUpdateResponse
	 * @generated
	 */
	EClass getInstallUpdateResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.InstallUpdateResponse#getUpdateAccept <em>Update Accept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Accept</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.InstallUpdateResponse#getUpdateAccept()
	 * @see #getInstallUpdateResponse()
	 * @generated
	 */
	EAttribute getInstallUpdateResponse_UpdateAccept();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.RetrieveUpdateStateRequest <em>Retrieve Update State Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Retrieve Update State Request</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.RetrieveUpdateStateRequest
	 * @generated
	 */
	EClass getRetrieveUpdateStateRequest();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.RetrieveUpdateStateRequest#getUpdateID <em>Update ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update ID</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.RetrieveUpdateStateRequest#getUpdateID()
	 * @see #getRetrieveUpdateStateRequest()
	 * @generated
	 */
	EReference getRetrieveUpdateStateRequest_UpdateID();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.RetrieveUpdateStateResponse <em>Retrieve Update State Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Retrieve Update State Response</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.RetrieveUpdateStateResponse
	 * @generated
	 */
	EClass getRetrieveUpdateStateResponse();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.RetrieveUpdateStateResponse#getUpdateStateData <em>Update State Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update State Data</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.RetrieveUpdateStateResponse#getUpdateStateData()
	 * @see #getRetrieveUpdateStateResponse()
	 * @generated
	 */
	EReference getRetrieveUpdateStateResponse_UpdateStateData();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistoryEntry <em>Update History Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update History Entry</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistoryEntry
	 * @generated
	 */
	EClass getUpdateHistoryEntry();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistoryEntry#getUpdateID <em>Update ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update ID</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistoryEntry#getUpdateID()
	 * @see #getUpdateHistoryEntry()
	 * @generated
	 */
	EReference getUpdateHistoryEntry_UpdateID();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistoryEntry#getUpdateTimestamp <em>Update Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update Timestamp</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistoryEntry#getUpdateTimestamp()
	 * @see #getUpdateHistoryEntry()
	 * @generated
	 */
	EReference getUpdateHistoryEntry_UpdateTimestamp();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistoryEntry#getUpdateURL <em>Update URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update URL</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistoryEntry#getUpdateURL()
	 * @see #getUpdateHistoryEntry()
	 * @generated
	 */
	EReference getUpdateHistoryEntry_UpdateURL();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistoryEntry#getUpdateStatus <em>Update Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Status</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistoryEntry#getUpdateStatus()
	 * @see #getUpdateHistoryEntry()
	 * @generated
	 */
	EAttribute getUpdateHistoryEntry_UpdateStatus();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistoryEntry#getDataVersionList <em>Data Version List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Version List</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistoryEntry#getDataVersionList()
	 * @see #getUpdateHistoryEntry()
	 * @generated
	 */
	EReference getUpdateHistoryEntry_DataVersionList();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistoryEntry#getUpdateDetails <em>Update Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update Details</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistoryEntry#getUpdateDetails()
	 * @see #getUpdateHistoryEntry()
	 * @generated
	 */
	EReference getUpdateHistoryEntry_UpdateDetails();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistory <em>Update History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update History</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistory
	 * @generated
	 */
	EClass getUpdateHistory();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistory#getUpdateHistoryEntry <em>Update History Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Update History Entry</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistory#getUpdateHistoryEntry()
	 * @see #getUpdateHistory()
	 * @generated
	 */
	EReference getUpdateHistory_UpdateHistoryEntry();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateStateData <em>Update State Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update State Data</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateStateData
	 * @generated
	 */
	EClass getUpdateStateData();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateStateData#getUpdateID <em>Update ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update ID</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateStateData#getUpdateID()
	 * @see #getUpdateStateData()
	 * @generated
	 */
	EReference getUpdateStateData_UpdateID();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateStateData#getUpdateTimestamp <em>Update Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update Timestamp</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateStateData#getUpdateTimestamp()
	 * @see #getUpdateStateData()
	 * @generated
	 */
	EReference getUpdateStateData_UpdateTimestamp();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateStateData#getUpdateStatus <em>Update Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Status</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateStateData#getUpdateStatus()
	 * @see #getUpdateStateData()
	 * @generated
	 */
	EAttribute getUpdateStateData_UpdateStatus();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateStateData#getUpdateDetails <em>Update Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update Details</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateStateData#getUpdateDetails()
	 * @see #getUpdateStateData()
	 * @generated
	 */
	EReference getUpdateStateData_UpdateDetails();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusInformation <em>Device Status Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Status Information</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusInformation
	 * @generated
	 */
	EClass getDeviceStatusInformation();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusInformation#getDeviceState <em>Device State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device State</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusInformation#getDeviceState()
	 * @see #getDeviceStatusInformation()
	 * @generated
	 */
	EAttribute getDeviceStatusInformation_DeviceState();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusInformation#getDeviceStatusList <em>Device Status List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Status List</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusInformation#getDeviceStatusList()
	 * @see #getDeviceStatusInformation()
	 * @generated
	 */
	EReference getDeviceStatusInformation_DeviceStatusList();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatus <em>Device Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Status</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatus
	 * @generated
	 */
	EClass getDeviceStatus();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatus#getDeviceStatusName <em>Device Status Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Status Name</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatus#getDeviceStatusName()
	 * @see #getDeviceStatus()
	 * @generated
	 */
	EReference getDeviceStatus_DeviceStatusName();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatus#getDeviceStatusFlag <em>Device Status Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Status Flag</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatus#getDeviceStatusFlag()
	 * @see #getDeviceStatus()
	 * @generated
	 */
	EReference getDeviceStatus_DeviceStatusFlag();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatus#getDeviceStatusImpact <em>Device Status Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Status Impact</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatus#getDeviceStatusImpact()
	 * @see #getDeviceStatus()
	 * @generated
	 */
	EAttribute getDeviceStatus_DeviceStatusImpact();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatus#getDeviceStatusPriority <em>Device Status Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Status Priority</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatus#getDeviceStatusPriority()
	 * @see #getDeviceStatus()
	 * @generated
	 */
	EReference getDeviceStatus_DeviceStatusPriority();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.SubdeviceErrorMessages <em>Subdevice Error Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subdevice Error Messages</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.SubdeviceErrorMessages
	 * @generated
	 */
	EClass getSubdeviceErrorMessages();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.SubdeviceErrorMessages#getSubdeviceName <em>Subdevice Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subdevice Name</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.SubdeviceErrorMessages#getSubdeviceName()
	 * @see #getSubdeviceErrorMessages()
	 * @generated
	 */
	EReference getSubdeviceErrorMessages_SubdeviceName();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.SubdeviceErrorMessages#getErrorMessage <em>Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Error Message</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.SubdeviceErrorMessages#getErrorMessage()
	 * @see #getSubdeviceErrorMessages()
	 * @generated
	 */
	EReference getSubdeviceErrorMessages_ErrorMessage();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.SubdeviceInformation <em>Subdevice Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subdevice Information</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.SubdeviceInformation
	 * @generated
	 */
	EClass getSubdeviceInformation();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.SubdeviceInformation#getSubdeviceName <em>Subdevice Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subdevice Name</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.SubdeviceInformation#getSubdeviceName()
	 * @see #getSubdeviceInformation()
	 * @generated
	 */
	EReference getSubdeviceInformation_SubdeviceName();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.SubdeviceInformation#getDeviceInformation <em>Device Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Information</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.SubdeviceInformation#getDeviceInformation()
	 * @see #getSubdeviceInformation()
	 * @generated
	 */
	EReference getSubdeviceInformation_DeviceInformation();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.SubdeviceStatusInformation <em>Subdevice Status Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subdevice Status Information</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.SubdeviceStatusInformation
	 * @generated
	 */
	EClass getSubdeviceStatusInformation();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.SubdeviceStatusInformation#getSubdeviceName <em>Subdevice Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subdevice Name</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.SubdeviceStatusInformation#getSubdeviceName()
	 * @see #getSubdeviceStatusInformation()
	 * @generated
	 */
	EReference getSubdeviceStatusInformation_SubdeviceName();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.SubdeviceStatusInformation#getDeviceStatusInformation <em>Device Status Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Status Information</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.SubdeviceStatusInformation#getDeviceStatusInformation()
	 * @see #getSubdeviceStatusInformation()
	 * @generated
	 */
	EReference getSubdeviceStatusInformation_DeviceStatusInformation();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.ChecksumType <em>Checksum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Checksum Type</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.ChecksumType
	 * @generated
	 */
	EEnum getChecksumType();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateAcceptType <em>Update Accept Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Update Accept Type</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateAcceptType
	 * @generated
	 */
	EEnum getUpdateAcceptType();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateStatusType <em>Update Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Update Status Type</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateStatusType
	 * @generated
	 */
	EEnum getUpdateStatusType();

	/**
	 * Returns the meta object for data type '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.ChecksumType <em>Checksum Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Checksum Type Object</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.ChecksumType
	 * @model instanceClass="de.jena.mdo.ibis.ibis_devicemanagementservice.ChecksumType"
	 *        extendedMetaData="name='ChecksumTypeEnumeration:Object' baseType='ChecksumTypeEnumeration'"
	 * @generated
	 */
	EDataType getChecksumTypeObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateAcceptType <em>Update Accept Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Update Accept Type Object</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateAcceptType
	 * @model instanceClass="de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateAcceptType"
	 *        extendedMetaData="name='UpdateAcceptEnumeration:Object' baseType='UpdateAcceptEnumeration'"
	 * @generated
	 */
	EDataType getUpdateAcceptTypeObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateStatusType <em>Update Status Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Update Status Type Object</em>'.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateStatusType
	 * @model instanceClass="de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateStatusType"
	 *        extendedMetaData="name='UpdateStatusEnumeration:Object' baseType='UpdateStatusEnumeration'"
	 * @generated
	 */
	EDataType getUpdateStatusTypeObject();

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
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.ChecksumImpl <em>Checksum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.ChecksumImpl
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getChecksum()
		 * @generated
		 */
		EClass CHECKSUM = eINSTANCE.getChecksum();

		/**
		 * The meta object literal for the '<em><b>Checksum Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECKSUM__CHECKSUM_TYPE = eINSTANCE.getChecksum_ChecksumType();

		/**
		 * The meta object literal for the '<em><b>Checksum</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECKSUM__CHECKSUM = eINSTANCE.getChecksum_Checksum();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.FinalizeUpdateRequestImpl <em>Finalize Update Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.FinalizeUpdateRequestImpl
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getFinalizeUpdateRequest()
		 * @generated
		 */
		EClass FINALIZE_UPDATE_REQUEST = eINSTANCE.getFinalizeUpdateRequest();

		/**
		 * The meta object literal for the '<em><b>Update ID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINALIZE_UPDATE_REQUEST__UPDATE_ID = eINSTANCE.getFinalizeUpdateRequest_UpdateID();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.FinalizeUpdateResponseImpl <em>Finalize Update Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.FinalizeUpdateResponseImpl
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getFinalizeUpdateResponse()
		 * @generated
		 */
		EClass FINALIZE_UPDATE_RESPONSE = eINSTANCE.getFinalizeUpdateResponse();

		/**
		 * The meta object literal for the '<em><b>Update Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINALIZE_UPDATE_RESPONSE__UPDATE_STATUS = eINSTANCE.getFinalizeUpdateResponse_UpdateStatus();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.AllSubdeviceErrorMessagesDataImpl <em>All Subdevice Error Messages Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.AllSubdeviceErrorMessagesDataImpl
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getAllSubdeviceErrorMessagesData()
		 * @generated
		 */
		EClass ALL_SUBDEVICE_ERROR_MESSAGES_DATA = eINSTANCE.getAllSubdeviceErrorMessagesData();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALL_SUBDEVICE_ERROR_MESSAGES_DATA__TIME_STAMP = eINSTANCE.getAllSubdeviceErrorMessagesData_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Subdevice Error Messages List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALL_SUBDEVICE_ERROR_MESSAGES_DATA__SUBDEVICE_ERROR_MESSAGES_LIST = eINSTANCE.getAllSubdeviceErrorMessagesData_SubdeviceErrorMessagesList();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.AllSubdeviceErrorMessagesResponseImpl <em>All Subdevice Error Messages Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.AllSubdeviceErrorMessagesResponseImpl
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getAllSubdeviceErrorMessagesResponse()
		 * @generated
		 */
		EClass ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE = eINSTANCE.getAllSubdeviceErrorMessagesResponse();

		/**
		 * The meta object literal for the '<em><b>All Subdevice Error Messages Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE__ALL_SUBDEVICE_ERROR_MESSAGES_DATA = eINSTANCE.getAllSubdeviceErrorMessagesResponse_AllSubdeviceErrorMessagesData();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.AllSubdeviceInformationDataImpl <em>All Subdevice Information Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.AllSubdeviceInformationDataImpl
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getAllSubdeviceInformationData()
		 * @generated
		 */
		EClass ALL_SUBDEVICE_INFORMATION_DATA = eINSTANCE.getAllSubdeviceInformationData();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALL_SUBDEVICE_INFORMATION_DATA__TIME_STAMP = eINSTANCE.getAllSubdeviceInformationData_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Subdevice Information List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALL_SUBDEVICE_INFORMATION_DATA__SUBDEVICE_INFORMATION_LIST = eINSTANCE.getAllSubdeviceInformationData_SubdeviceInformationList();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.AllSubdeviceInformationResponseImpl <em>All Subdevice Information Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.AllSubdeviceInformationResponseImpl
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getAllSubdeviceInformationResponse()
		 * @generated
		 */
		EClass ALL_SUBDEVICE_INFORMATION_RESPONSE = eINSTANCE.getAllSubdeviceInformationResponse();

		/**
		 * The meta object literal for the '<em><b>All Subdevice Information Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALL_SUBDEVICE_INFORMATION_RESPONSE__ALL_SUBDEVICE_INFORMATION_DATA = eINSTANCE.getAllSubdeviceInformationResponse_AllSubdeviceInformationData();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.AllSubdeviceStatusInformationDataImpl <em>All Subdevice Status Information Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.AllSubdeviceStatusInformationDataImpl
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getAllSubdeviceStatusInformationData()
		 * @generated
		 */
		EClass ALL_SUBDEVICE_STATUS_INFORMATION_DATA = eINSTANCE.getAllSubdeviceStatusInformationData();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALL_SUBDEVICE_STATUS_INFORMATION_DATA__TIME_STAMP = eINSTANCE.getAllSubdeviceStatusInformationData_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Subdevice Status Information List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALL_SUBDEVICE_STATUS_INFORMATION_DATA__SUBDEVICE_STATUS_INFORMATION_LIST = eINSTANCE.getAllSubdeviceStatusInformationData_SubdeviceStatusInformationList();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.AllSubdeviceStatusInformationResponseImpl <em>All Subdevice Status Information Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.AllSubdeviceStatusInformationResponseImpl
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getAllSubdeviceStatusInformationResponse()
		 * @generated
		 */
		EClass ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE = eINSTANCE.getAllSubdeviceStatusInformationResponse();

		/**
		 * The meta object literal for the '<em><b>All Subdevice Status Information Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE__ALL_SUBDEVICE_STATUS_INFORMATION_DATA = eINSTANCE.getAllSubdeviceStatusInformationResponse_AllSubdeviceStatusInformationData();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceConfigurationDataImpl <em>Device Configuration Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceConfigurationDataImpl
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceConfigurationData()
		 * @generated
		 */
		EClass DEVICE_CONFIGURATION_DATA = eINSTANCE.getDeviceConfigurationData();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_CONFIGURATION_DATA__TIME_STAMP = eINSTANCE.getDeviceConfigurationData_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Device ID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_CONFIGURATION_DATA__DEVICE_ID = eINSTANCE.getDeviceConfigurationData_DeviceID();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceConfigurationResponseImpl <em>Device Configuration Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceConfigurationResponseImpl
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceConfigurationResponse()
		 * @generated
		 */
		EClass DEVICE_CONFIGURATION_RESPONSE = eINSTANCE.getDeviceConfigurationResponse();

		/**
		 * The meta object literal for the '<em><b>Device Configuration Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_CONFIGURATION_RESPONSE__DEVICE_CONFIGURATION_DATA = eINSTANCE.getDeviceConfigurationResponse_DeviceConfigurationData();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceErrorMessagesDataImpl <em>Device Error Messages Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceErrorMessagesDataImpl
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceErrorMessagesData()
		 * @generated
		 */
		EClass DEVICE_ERROR_MESSAGES_DATA = eINSTANCE.getDeviceErrorMessagesData();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_ERROR_MESSAGES_DATA__TIME_STAMP = eINSTANCE.getDeviceErrorMessagesData_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Error Message</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_ERROR_MESSAGES_DATA__ERROR_MESSAGE = eINSTANCE.getDeviceErrorMessagesData_ErrorMessage();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceErrorMessagesResponseImpl <em>Device Error Messages Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceErrorMessagesResponseImpl
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceErrorMessagesResponse()
		 * @generated
		 */
		EClass DEVICE_ERROR_MESSAGES_RESPONSE = eINSTANCE.getDeviceErrorMessagesResponse();

		/**
		 * The meta object literal for the '<em><b>Device Error Messages Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_ERROR_MESSAGES_RESPONSE__DEVICE_ERROR_MESSAGES_DATA = eINSTANCE.getDeviceErrorMessagesResponse_DeviceErrorMessagesData();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceInformationDataImpl <em>Device Information Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceInformationDataImpl
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceInformationData()
		 * @generated
		 */
		EClass DEVICE_INFORMATION_DATA = eINSTANCE.getDeviceInformationData();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_INFORMATION_DATA__TIME_STAMP = eINSTANCE.getDeviceInformationData_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Device Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_INFORMATION_DATA__DEVICE_INFORMATION = eINSTANCE.getDeviceInformationData_DeviceInformation();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceInformationResponseImpl <em>Device Information Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceInformationResponseImpl
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceInformationResponse()
		 * @generated
		 */
		EClass DEVICE_INFORMATION_RESPONSE = eINSTANCE.getDeviceInformationResponse();

		/**
		 * The meta object literal for the '<em><b>Device Information Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_INFORMATION_RESPONSE__DEVICE_INFORMATION_DATA = eINSTANCE.getDeviceInformationResponse_DeviceInformationData();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceStatusInformationDataImpl <em>Device Status Information Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceStatusInformationDataImpl
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceStatusInformationData()
		 * @generated
		 */
		EClass DEVICE_STATUS_INFORMATION_DATA = eINSTANCE.getDeviceStatusInformationData();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_STATUS_INFORMATION_DATA__TIME_STAMP = eINSTANCE.getDeviceStatusInformationData_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Device Status Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_STATUS_INFORMATION_DATA__DEVICE_STATUS_INFORMATION = eINSTANCE.getDeviceStatusInformationData_DeviceStatusInformation();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceStatusInformationResponseImpl <em>Device Status Information Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceStatusInformationResponseImpl
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceStatusInformationResponse()
		 * @generated
		 */
		EClass DEVICE_STATUS_INFORMATION_RESPONSE = eINSTANCE.getDeviceStatusInformationResponse();

		/**
		 * The meta object literal for the '<em><b>Device Status Information Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_STATUS_INFORMATION_RESPONSE__DEVICE_STATUS_INFORMATION_DATA = eINSTANCE.getDeviceStatusInformationResponse_DeviceStatusInformationData();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceStatusDataImpl <em>Device Status Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceStatusDataImpl
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceStatusData()
		 * @generated
		 */
		EClass DEVICE_STATUS_DATA = eINSTANCE.getDeviceStatusData();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_STATUS_DATA__TIME_STAMP = eINSTANCE.getDeviceStatusData_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Device State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_STATUS_DATA__DEVICE_STATE = eINSTANCE.getDeviceStatusData_DeviceState();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceStatusResponseImpl <em>Device Status Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceStatusResponseImpl
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceStatusResponse()
		 * @generated
		 */
		EClass DEVICE_STATUS_RESPONSE = eINSTANCE.getDeviceStatusResponse();

		/**
		 * The meta object literal for the '<em><b>Device Status Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_STATUS_RESPONSE__DEVICE_STATUS_DATA = eINSTANCE.getDeviceStatusResponse_DeviceStatusData();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.ServiceInformationDataImpl <em>Service Information Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.ServiceInformationDataImpl
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getServiceInformationData()
		 * @generated
		 */
		EClass SERVICE_INFORMATION_DATA = eINSTANCE.getServiceInformationData();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INFORMATION_DATA__TIME_STAMP = eINSTANCE.getServiceInformationData_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Service Information List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INFORMATION_DATA__SERVICE_INFORMATION_LIST = eINSTANCE.getServiceInformationData_ServiceInformationList();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.ServiceInformationResponseImpl <em>Service Information Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.ServiceInformationResponseImpl
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getServiceInformationResponse()
		 * @generated
		 */
		EClass SERVICE_INFORMATION_RESPONSE = eINSTANCE.getServiceInformationResponse();

		/**
		 * The meta object literal for the '<em><b>Service Information Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INFORMATION_RESPONSE__SERVICE_INFORMATION_DATA = eINSTANCE.getServiceInformationResponse_ServiceInformationData();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.ServiceStatusDataImpl <em>Service Status Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.ServiceStatusDataImpl
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getServiceStatusData()
		 * @generated
		 */
		EClass SERVICE_STATUS_DATA = eINSTANCE.getServiceStatusData();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_STATUS_DATA__TIME_STAMP = eINSTANCE.getServiceStatusData_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Service Specification With State List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_STATUS_DATA__SERVICE_SPECIFICATION_WITH_STATE_LIST = eINSTANCE.getServiceStatusData_ServiceSpecificationWithStateList();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.ServiceStatusResponseImpl <em>Service Status Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.ServiceStatusResponseImpl
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getServiceStatusResponse()
		 * @generated
		 */
		EClass SERVICE_STATUS_RESPONSE = eINSTANCE.getServiceStatusResponse();

		/**
		 * The meta object literal for the '<em><b>Service Status Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_STATUS_RESPONSE__SERVICE_STATUS_DATA = eINSTANCE.getServiceStatusResponse_ServiceStatusData();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.UpdateHistoryResponseImpl <em>Update History Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.UpdateHistoryResponseImpl
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getUpdateHistoryResponse()
		 * @generated
		 */
		EClass UPDATE_HISTORY_RESPONSE = eINSTANCE.getUpdateHistoryResponse();

		/**
		 * The meta object literal for the '<em><b>Update History</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_HISTORY_RESPONSE__UPDATE_HISTORY = eINSTANCE.getUpdateHistoryResponse_UpdateHistory();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.InstallUpdateRequestImpl <em>Install Update Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.InstallUpdateRequestImpl
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getInstallUpdateRequest()
		 * @generated
		 */
		EClass INSTALL_UPDATE_REQUEST = eINSTANCE.getInstallUpdateRequest();

		/**
		 * The meta object literal for the '<em><b>Update ID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTALL_UPDATE_REQUEST__UPDATE_ID = eINSTANCE.getInstallUpdateRequest_UpdateID();

		/**
		 * The meta object literal for the '<em><b>Update Timestamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTALL_UPDATE_REQUEST__UPDATE_TIMESTAMP = eINSTANCE.getInstallUpdateRequest_UpdateTimestamp();

		/**
		 * The meta object literal for the '<em><b>Update URL</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTALL_UPDATE_REQUEST__UPDATE_URL = eINSTANCE.getInstallUpdateRequest_UpdateURL();

		/**
		 * The meta object literal for the '<em><b>Update File Checksum</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTALL_UPDATE_REQUEST__UPDATE_FILE_CHECKSUM = eINSTANCE.getInstallUpdateRequest_UpdateFileChecksum();

		/**
		 * The meta object literal for the '<em><b>Update File Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTALL_UPDATE_REQUEST__UPDATE_FILE_SIZE = eINSTANCE.getInstallUpdateRequest_UpdateFileSize();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.InstallUpdateResponseImpl <em>Install Update Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.InstallUpdateResponseImpl
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getInstallUpdateResponse()
		 * @generated
		 */
		EClass INSTALL_UPDATE_RESPONSE = eINSTANCE.getInstallUpdateResponse();

		/**
		 * The meta object literal for the '<em><b>Update Accept</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTALL_UPDATE_RESPONSE__UPDATE_ACCEPT = eINSTANCE.getInstallUpdateResponse_UpdateAccept();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.RetrieveUpdateStateRequestImpl <em>Retrieve Update State Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.RetrieveUpdateStateRequestImpl
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getRetrieveUpdateStateRequest()
		 * @generated
		 */
		EClass RETRIEVE_UPDATE_STATE_REQUEST = eINSTANCE.getRetrieveUpdateStateRequest();

		/**
		 * The meta object literal for the '<em><b>Update ID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETRIEVE_UPDATE_STATE_REQUEST__UPDATE_ID = eINSTANCE.getRetrieveUpdateStateRequest_UpdateID();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.RetrieveUpdateStateResponseImpl <em>Retrieve Update State Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.RetrieveUpdateStateResponseImpl
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getRetrieveUpdateStateResponse()
		 * @generated
		 */
		EClass RETRIEVE_UPDATE_STATE_RESPONSE = eINSTANCE.getRetrieveUpdateStateResponse();

		/**
		 * The meta object literal for the '<em><b>Update State Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETRIEVE_UPDATE_STATE_RESPONSE__UPDATE_STATE_DATA = eINSTANCE.getRetrieveUpdateStateResponse_UpdateStateData();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.UpdateHistoryEntryImpl <em>Update History Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.UpdateHistoryEntryImpl
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getUpdateHistoryEntry()
		 * @generated
		 */
		EClass UPDATE_HISTORY_ENTRY = eINSTANCE.getUpdateHistoryEntry();

		/**
		 * The meta object literal for the '<em><b>Update ID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_HISTORY_ENTRY__UPDATE_ID = eINSTANCE.getUpdateHistoryEntry_UpdateID();

		/**
		 * The meta object literal for the '<em><b>Update Timestamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_HISTORY_ENTRY__UPDATE_TIMESTAMP = eINSTANCE.getUpdateHistoryEntry_UpdateTimestamp();

		/**
		 * The meta object literal for the '<em><b>Update URL</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_HISTORY_ENTRY__UPDATE_URL = eINSTANCE.getUpdateHistoryEntry_UpdateURL();

		/**
		 * The meta object literal for the '<em><b>Update Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_HISTORY_ENTRY__UPDATE_STATUS = eINSTANCE.getUpdateHistoryEntry_UpdateStatus();

		/**
		 * The meta object literal for the '<em><b>Data Version List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_HISTORY_ENTRY__DATA_VERSION_LIST = eINSTANCE.getUpdateHistoryEntry_DataVersionList();

		/**
		 * The meta object literal for the '<em><b>Update Details</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_HISTORY_ENTRY__UPDATE_DETAILS = eINSTANCE.getUpdateHistoryEntry_UpdateDetails();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.UpdateHistoryImpl <em>Update History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.UpdateHistoryImpl
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getUpdateHistory()
		 * @generated
		 */
		EClass UPDATE_HISTORY = eINSTANCE.getUpdateHistory();

		/**
		 * The meta object literal for the '<em><b>Update History Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_HISTORY__UPDATE_HISTORY_ENTRY = eINSTANCE.getUpdateHistory_UpdateHistoryEntry();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.UpdateStateDataImpl <em>Update State Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.UpdateStateDataImpl
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getUpdateStateData()
		 * @generated
		 */
		EClass UPDATE_STATE_DATA = eINSTANCE.getUpdateStateData();

		/**
		 * The meta object literal for the '<em><b>Update ID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_STATE_DATA__UPDATE_ID = eINSTANCE.getUpdateStateData_UpdateID();

		/**
		 * The meta object literal for the '<em><b>Update Timestamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_STATE_DATA__UPDATE_TIMESTAMP = eINSTANCE.getUpdateStateData_UpdateTimestamp();

		/**
		 * The meta object literal for the '<em><b>Update Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_STATE_DATA__UPDATE_STATUS = eINSTANCE.getUpdateStateData_UpdateStatus();

		/**
		 * The meta object literal for the '<em><b>Update Details</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_STATE_DATA__UPDATE_DETAILS = eINSTANCE.getUpdateStateData_UpdateDetails();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceStatusInformationImpl <em>Device Status Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceStatusInformationImpl
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceStatusInformation()
		 * @generated
		 */
		EClass DEVICE_STATUS_INFORMATION = eINSTANCE.getDeviceStatusInformation();

		/**
		 * The meta object literal for the '<em><b>Device State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_STATUS_INFORMATION__DEVICE_STATE = eINSTANCE.getDeviceStatusInformation_DeviceState();

		/**
		 * The meta object literal for the '<em><b>Device Status List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_STATUS_INFORMATION__DEVICE_STATUS_LIST = eINSTANCE.getDeviceStatusInformation_DeviceStatusList();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceStatusImpl <em>Device Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceStatusImpl
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getDeviceStatus()
		 * @generated
		 */
		EClass DEVICE_STATUS = eINSTANCE.getDeviceStatus();

		/**
		 * The meta object literal for the '<em><b>Device Status Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_STATUS__DEVICE_STATUS_NAME = eINSTANCE.getDeviceStatus_DeviceStatusName();

		/**
		 * The meta object literal for the '<em><b>Device Status Flag</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_STATUS__DEVICE_STATUS_FLAG = eINSTANCE.getDeviceStatus_DeviceStatusFlag();

		/**
		 * The meta object literal for the '<em><b>Device Status Impact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_STATUS__DEVICE_STATUS_IMPACT = eINSTANCE.getDeviceStatus_DeviceStatusImpact();

		/**
		 * The meta object literal for the '<em><b>Device Status Priority</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_STATUS__DEVICE_STATUS_PRIORITY = eINSTANCE.getDeviceStatus_DeviceStatusPriority();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.SubdeviceErrorMessagesImpl <em>Subdevice Error Messages</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.SubdeviceErrorMessagesImpl
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getSubdeviceErrorMessages()
		 * @generated
		 */
		EClass SUBDEVICE_ERROR_MESSAGES = eINSTANCE.getSubdeviceErrorMessages();

		/**
		 * The meta object literal for the '<em><b>Subdevice Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBDEVICE_ERROR_MESSAGES__SUBDEVICE_NAME = eINSTANCE.getSubdeviceErrorMessages_SubdeviceName();

		/**
		 * The meta object literal for the '<em><b>Error Message</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBDEVICE_ERROR_MESSAGES__ERROR_MESSAGE = eINSTANCE.getSubdeviceErrorMessages_ErrorMessage();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.SubdeviceInformationImpl <em>Subdevice Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.SubdeviceInformationImpl
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getSubdeviceInformation()
		 * @generated
		 */
		EClass SUBDEVICE_INFORMATION = eINSTANCE.getSubdeviceInformation();

		/**
		 * The meta object literal for the '<em><b>Subdevice Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBDEVICE_INFORMATION__SUBDEVICE_NAME = eINSTANCE.getSubdeviceInformation_SubdeviceName();

		/**
		 * The meta object literal for the '<em><b>Device Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBDEVICE_INFORMATION__DEVICE_INFORMATION = eINSTANCE.getSubdeviceInformation_DeviceInformation();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.SubdeviceStatusInformationImpl <em>Subdevice Status Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.SubdeviceStatusInformationImpl
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getSubdeviceStatusInformation()
		 * @generated
		 */
		EClass SUBDEVICE_STATUS_INFORMATION = eINSTANCE.getSubdeviceStatusInformation();

		/**
		 * The meta object literal for the '<em><b>Subdevice Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBDEVICE_STATUS_INFORMATION__SUBDEVICE_NAME = eINSTANCE.getSubdeviceStatusInformation_SubdeviceName();

		/**
		 * The meta object literal for the '<em><b>Device Status Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBDEVICE_STATUS_INFORMATION__DEVICE_STATUS_INFORMATION = eINSTANCE.getSubdeviceStatusInformation_DeviceStatusInformation();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.ChecksumType <em>Checksum Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.ChecksumType
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getChecksumType()
		 * @generated
		 */
		EEnum CHECKSUM_TYPE = eINSTANCE.getChecksumType();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateAcceptType <em>Update Accept Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateAcceptType
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getUpdateAcceptType()
		 * @generated
		 */
		EEnum UPDATE_ACCEPT_TYPE = eINSTANCE.getUpdateAcceptType();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateStatusType <em>Update Status Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateStatusType
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getUpdateStatusType()
		 * @generated
		 */
		EEnum UPDATE_STATUS_TYPE = eINSTANCE.getUpdateStatusType();

		/**
		 * The meta object literal for the '<em>Checksum Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.ChecksumType
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getChecksumTypeObject()
		 * @generated
		 */
		EDataType CHECKSUM_TYPE_OBJECT = eINSTANCE.getChecksumTypeObject();

		/**
		 * The meta object literal for the '<em>Update Accept Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateAcceptType
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getUpdateAcceptTypeObject()
		 * @generated
		 */
		EDataType UPDATE_ACCEPT_TYPE_OBJECT = eINSTANCE.getUpdateAcceptTypeObject();

		/**
		 * The meta object literal for the '<em>Update Status Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateStatusType
		 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServicePackageImpl#getUpdateStatusTypeObject()
		 * @generated
		 */
		EDataType UPDATE_STATUS_TYPE_OBJECT = eINSTANCE.getUpdateStatusTypeObject();

	}

} //IbisDeviceManagementServicePackage
