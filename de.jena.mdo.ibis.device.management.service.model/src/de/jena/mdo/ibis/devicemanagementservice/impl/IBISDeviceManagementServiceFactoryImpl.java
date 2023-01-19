/**
 */
package de.jena.mdo.ibis.devicemanagementservice.impl;

import de.jena.mdo.ibis.devicemanagementservice.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IBISDeviceManagementServiceFactoryImpl extends EFactoryImpl implements IBISDeviceManagementServiceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IBISDeviceManagementServiceFactory init() {
		try {
			IBISDeviceManagementServiceFactory theIBISDeviceManagementServiceFactory = (IBISDeviceManagementServiceFactory)EPackage.Registry.INSTANCE.getEFactory(IBISDeviceManagementServicePackage.eNS_URI);
			if (theIBISDeviceManagementServiceFactory != null) {
				return theIBISDeviceManagementServiceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IBISDeviceManagementServiceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IBISDeviceManagementServiceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IBISDeviceManagementServicePackage.CHECKSUM_STRUCTURE: return createChecksumStructure();
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_FINALIZE_UPDATE_REQUEST_STRUCTURE: return createDeviceManagementServiceFinalizeUpdateRequestStructure();
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_FINALIZE_UPDATE_RESPONSE_STRUCTURE: return createDeviceManagementServiceFinalizeUpdateResponseStructure();
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_DATA_STRUCTURE: return createDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure();
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_STRUCTURE: return createDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure();
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_INFORMATION_RESPONSE_DATA_STRUCTURE: return createDeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure();
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_INFORMATION_RESPONSE_STRUCTURE: return createDeviceManagementServiceGetAllSubdeviceInformationResponseStructure();
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_DATA_STRUCTURE: return createDeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure();
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE: return createDeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure();
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_DATA_STRUCTURE: return createDeviceManagementServiceGetDeviceConfigurationResponseDataStructure();
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_STRUCTURE: return createDeviceManagementServiceGetDeviceConfigurationResponseStructure();
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_DATA_STRUCTURE: return createDeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure();
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_STRUCTURE: return createDeviceManagementServiceGetDeviceErrorMessagesResponseStructure();
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_DATA_STRUCTURE: return createDeviceManagementServiceGetDeviceInformationResponseDataStructure();
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_STRUCTURE: return createDeviceManagementServiceGetDeviceInformationResponseStructure();
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_DATA_STRUCTURE: return createDeviceManagementServiceGetDeviceStatusInformationResponseDataStructure();
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE: return createDeviceManagementServiceGetDeviceStatusInformationResponseStructure();
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_RESPONSE_DATA_STRUCTURE: return createDeviceManagementServiceGetDeviceStatusResponseDataStructure();
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_RESPONSE_STRUCTURE: return createDeviceManagementServiceGetDeviceStatusResponseStructure();
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_INFORMATION_RESPONSE_DATA_STRUCTURE: return createDeviceManagementServiceGetServiceInformationResponseDataStructure();
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_INFORMATION_RESPONSE_STRUCTURE: return createDeviceManagementServiceGetServiceInformationResponseStructure();
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_STATUS_RESPONSE_DATA_STRUCTURE: return createDeviceManagementServiceGetServiceStatusResponseDataStructure();
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_STATUS_RESPONSE_STRUCTURE: return createDeviceManagementServiceGetServiceStatusResponseStructure();
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_UPDATE_HISTORY_RESPONSE_STRUCTURE: return createDeviceManagementServiceGetUpdateHistoryResponseStructure();
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE: return createDeviceManagementServiceInstallUpdateRequestStructure();
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_RESPONSE_STRUCTURE: return createDeviceManagementServiceInstallUpdateResponseStructure();
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_RETRIEVE_UPDATE_STATE_REQUEST_STRUCTURE: return createDeviceManagementServiceRetrieveUpdateStateRequestStructure();
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_RETRIEVE_UPDATE_STATE_RESPONSE_STRUCTURE: return createDeviceManagementServiceRetrieveUpdateStateResponseStructure();
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE: return createDeviceManagementServiceUpdateHistoryEntryStructure();
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_STRUCTURE: return createDeviceManagementServiceUpdateHistoryStructure();
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_STATE_DATA_STRUCTURE: return createDeviceManagementServiceUpdateStateDataStructure();
			case IBISDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION_STRUCTURE: return createDeviceStatusInformationStructure();
			case IBISDeviceManagementServicePackage.DEVICE_STATUS_STRUCTURE: return createDeviceStatusStructure();
			case IBISDeviceManagementServicePackage.SUBDEVICE_ERROR_MESSAGES_STRUCTURE: return createSubdeviceErrorMessagesStructure();
			case IBISDeviceManagementServicePackage.SUBDEVICE_INFORMATION_STRUCTURE: return createSubdeviceInformationStructure();
			case IBISDeviceManagementServicePackage.SUBDEVICE_STATUS_INFORMATION_STRUCTURE: return createSubdeviceStatusInformationStructure();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case IBISDeviceManagementServicePackage.CHECKSUM_TYPE_ENUMERATION:
				return createChecksumTypeEnumerationFromString(eDataType, initialValue);
			case IBISDeviceManagementServicePackage.UPDATE_ACCEPT_ENUMERATION:
				return createUpdateAcceptEnumerationFromString(eDataType, initialValue);
			case IBISDeviceManagementServicePackage.UPDATE_STATUS_ENUMERATION:
				return createUpdateStatusEnumerationFromString(eDataType, initialValue);
			case IBISDeviceManagementServicePackage.CHECKSUM_TYPE_ENUMERATION_OBJECT:
				return createChecksumTypeEnumerationObjectFromString(eDataType, initialValue);
			case IBISDeviceManagementServicePackage.UPDATE_ACCEPT_ENUMERATION_OBJECT:
				return createUpdateAcceptEnumerationObjectFromString(eDataType, initialValue);
			case IBISDeviceManagementServicePackage.UPDATE_STATUS_ENUMERATION_OBJECT:
				return createUpdateStatusEnumerationObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case IBISDeviceManagementServicePackage.CHECKSUM_TYPE_ENUMERATION:
				return convertChecksumTypeEnumerationToString(eDataType, instanceValue);
			case IBISDeviceManagementServicePackage.UPDATE_ACCEPT_ENUMERATION:
				return convertUpdateAcceptEnumerationToString(eDataType, instanceValue);
			case IBISDeviceManagementServicePackage.UPDATE_STATUS_ENUMERATION:
				return convertUpdateStatusEnumerationToString(eDataType, instanceValue);
			case IBISDeviceManagementServicePackage.CHECKSUM_TYPE_ENUMERATION_OBJECT:
				return convertChecksumTypeEnumerationObjectToString(eDataType, instanceValue);
			case IBISDeviceManagementServicePackage.UPDATE_ACCEPT_ENUMERATION_OBJECT:
				return convertUpdateAcceptEnumerationObjectToString(eDataType, instanceValue);
			case IBISDeviceManagementServicePackage.UPDATE_STATUS_ENUMERATION_OBJECT:
				return convertUpdateStatusEnumerationObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChecksumStructure createChecksumStructure() {
		ChecksumStructureImpl checksumStructure = new ChecksumStructureImpl();
		return checksumStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceManagementServiceFinalizeUpdateRequestStructure createDeviceManagementServiceFinalizeUpdateRequestStructure() {
		DeviceManagementServiceFinalizeUpdateRequestStructureImpl deviceManagementServiceFinalizeUpdateRequestStructure = new DeviceManagementServiceFinalizeUpdateRequestStructureImpl();
		return deviceManagementServiceFinalizeUpdateRequestStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceManagementServiceFinalizeUpdateResponseStructure createDeviceManagementServiceFinalizeUpdateResponseStructure() {
		DeviceManagementServiceFinalizeUpdateResponseStructureImpl deviceManagementServiceFinalizeUpdateResponseStructure = new DeviceManagementServiceFinalizeUpdateResponseStructureImpl();
		return deviceManagementServiceFinalizeUpdateResponseStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure createDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure() {
		DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructureImpl deviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure = new DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructureImpl();
		return deviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure createDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure() {
		DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructureImpl deviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure = new DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructureImpl();
		return deviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure createDeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure() {
		DeviceManagementServiceGetAllSubdeviceInformationResponseDataStructureImpl deviceManagementServiceGetAllSubdeviceInformationResponseDataStructure = new DeviceManagementServiceGetAllSubdeviceInformationResponseDataStructureImpl();
		return deviceManagementServiceGetAllSubdeviceInformationResponseDataStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceManagementServiceGetAllSubdeviceInformationResponseStructure createDeviceManagementServiceGetAllSubdeviceInformationResponseStructure() {
		DeviceManagementServiceGetAllSubdeviceInformationResponseStructureImpl deviceManagementServiceGetAllSubdeviceInformationResponseStructure = new DeviceManagementServiceGetAllSubdeviceInformationResponseStructureImpl();
		return deviceManagementServiceGetAllSubdeviceInformationResponseStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure createDeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure() {
		DeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructureImpl deviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure = new DeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructureImpl();
		return deviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure createDeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure() {
		DeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructureImpl deviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure = new DeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructureImpl();
		return deviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceManagementServiceGetDeviceConfigurationResponseDataStructure createDeviceManagementServiceGetDeviceConfigurationResponseDataStructure() {
		DeviceManagementServiceGetDeviceConfigurationResponseDataStructureImpl deviceManagementServiceGetDeviceConfigurationResponseDataStructure = new DeviceManagementServiceGetDeviceConfigurationResponseDataStructureImpl();
		return deviceManagementServiceGetDeviceConfigurationResponseDataStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceManagementServiceGetDeviceConfigurationResponseStructure createDeviceManagementServiceGetDeviceConfigurationResponseStructure() {
		DeviceManagementServiceGetDeviceConfigurationResponseStructureImpl deviceManagementServiceGetDeviceConfigurationResponseStructure = new DeviceManagementServiceGetDeviceConfigurationResponseStructureImpl();
		return deviceManagementServiceGetDeviceConfigurationResponseStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure createDeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure() {
		DeviceManagementServiceGetDeviceErrorMessagesResponseDataStructureImpl deviceManagementServiceGetDeviceErrorMessagesResponseDataStructure = new DeviceManagementServiceGetDeviceErrorMessagesResponseDataStructureImpl();
		return deviceManagementServiceGetDeviceErrorMessagesResponseDataStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceManagementServiceGetDeviceErrorMessagesResponseStructure createDeviceManagementServiceGetDeviceErrorMessagesResponseStructure() {
		DeviceManagementServiceGetDeviceErrorMessagesResponseStructureImpl deviceManagementServiceGetDeviceErrorMessagesResponseStructure = new DeviceManagementServiceGetDeviceErrorMessagesResponseStructureImpl();
		return deviceManagementServiceGetDeviceErrorMessagesResponseStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceManagementServiceGetDeviceInformationResponseDataStructure createDeviceManagementServiceGetDeviceInformationResponseDataStructure() {
		DeviceManagementServiceGetDeviceInformationResponseDataStructureImpl deviceManagementServiceGetDeviceInformationResponseDataStructure = new DeviceManagementServiceGetDeviceInformationResponseDataStructureImpl();
		return deviceManagementServiceGetDeviceInformationResponseDataStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceManagementServiceGetDeviceInformationResponseStructure createDeviceManagementServiceGetDeviceInformationResponseStructure() {
		DeviceManagementServiceGetDeviceInformationResponseStructureImpl deviceManagementServiceGetDeviceInformationResponseStructure = new DeviceManagementServiceGetDeviceInformationResponseStructureImpl();
		return deviceManagementServiceGetDeviceInformationResponseStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceManagementServiceGetDeviceStatusInformationResponseDataStructure createDeviceManagementServiceGetDeviceStatusInformationResponseDataStructure() {
		DeviceManagementServiceGetDeviceStatusInformationResponseDataStructureImpl deviceManagementServiceGetDeviceStatusInformationResponseDataStructure = new DeviceManagementServiceGetDeviceStatusInformationResponseDataStructureImpl();
		return deviceManagementServiceGetDeviceStatusInformationResponseDataStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceManagementServiceGetDeviceStatusInformationResponseStructure createDeviceManagementServiceGetDeviceStatusInformationResponseStructure() {
		DeviceManagementServiceGetDeviceStatusInformationResponseStructureImpl deviceManagementServiceGetDeviceStatusInformationResponseStructure = new DeviceManagementServiceGetDeviceStatusInformationResponseStructureImpl();
		return deviceManagementServiceGetDeviceStatusInformationResponseStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceManagementServiceGetDeviceStatusResponseDataStructure createDeviceManagementServiceGetDeviceStatusResponseDataStructure() {
		DeviceManagementServiceGetDeviceStatusResponseDataStructureImpl deviceManagementServiceGetDeviceStatusResponseDataStructure = new DeviceManagementServiceGetDeviceStatusResponseDataStructureImpl();
		return deviceManagementServiceGetDeviceStatusResponseDataStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceManagementServiceGetDeviceStatusResponseStructure createDeviceManagementServiceGetDeviceStatusResponseStructure() {
		DeviceManagementServiceGetDeviceStatusResponseStructureImpl deviceManagementServiceGetDeviceStatusResponseStructure = new DeviceManagementServiceGetDeviceStatusResponseStructureImpl();
		return deviceManagementServiceGetDeviceStatusResponseStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceManagementServiceGetServiceInformationResponseDataStructure createDeviceManagementServiceGetServiceInformationResponseDataStructure() {
		DeviceManagementServiceGetServiceInformationResponseDataStructureImpl deviceManagementServiceGetServiceInformationResponseDataStructure = new DeviceManagementServiceGetServiceInformationResponseDataStructureImpl();
		return deviceManagementServiceGetServiceInformationResponseDataStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceManagementServiceGetServiceInformationResponseStructure createDeviceManagementServiceGetServiceInformationResponseStructure() {
		DeviceManagementServiceGetServiceInformationResponseStructureImpl deviceManagementServiceGetServiceInformationResponseStructure = new DeviceManagementServiceGetServiceInformationResponseStructureImpl();
		return deviceManagementServiceGetServiceInformationResponseStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceManagementServiceGetServiceStatusResponseDataStructure createDeviceManagementServiceGetServiceStatusResponseDataStructure() {
		DeviceManagementServiceGetServiceStatusResponseDataStructureImpl deviceManagementServiceGetServiceStatusResponseDataStructure = new DeviceManagementServiceGetServiceStatusResponseDataStructureImpl();
		return deviceManagementServiceGetServiceStatusResponseDataStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceManagementServiceGetServiceStatusResponseStructure createDeviceManagementServiceGetServiceStatusResponseStructure() {
		DeviceManagementServiceGetServiceStatusResponseStructureImpl deviceManagementServiceGetServiceStatusResponseStructure = new DeviceManagementServiceGetServiceStatusResponseStructureImpl();
		return deviceManagementServiceGetServiceStatusResponseStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceManagementServiceGetUpdateHistoryResponseStructure createDeviceManagementServiceGetUpdateHistoryResponseStructure() {
		DeviceManagementServiceGetUpdateHistoryResponseStructureImpl deviceManagementServiceGetUpdateHistoryResponseStructure = new DeviceManagementServiceGetUpdateHistoryResponseStructureImpl();
		return deviceManagementServiceGetUpdateHistoryResponseStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceManagementServiceInstallUpdateRequestStructure createDeviceManagementServiceInstallUpdateRequestStructure() {
		DeviceManagementServiceInstallUpdateRequestStructureImpl deviceManagementServiceInstallUpdateRequestStructure = new DeviceManagementServiceInstallUpdateRequestStructureImpl();
		return deviceManagementServiceInstallUpdateRequestStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceManagementServiceInstallUpdateResponseStructure createDeviceManagementServiceInstallUpdateResponseStructure() {
		DeviceManagementServiceInstallUpdateResponseStructureImpl deviceManagementServiceInstallUpdateResponseStructure = new DeviceManagementServiceInstallUpdateResponseStructureImpl();
		return deviceManagementServiceInstallUpdateResponseStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceManagementServiceRetrieveUpdateStateRequestStructure createDeviceManagementServiceRetrieveUpdateStateRequestStructure() {
		DeviceManagementServiceRetrieveUpdateStateRequestStructureImpl deviceManagementServiceRetrieveUpdateStateRequestStructure = new DeviceManagementServiceRetrieveUpdateStateRequestStructureImpl();
		return deviceManagementServiceRetrieveUpdateStateRequestStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceManagementServiceRetrieveUpdateStateResponseStructure createDeviceManagementServiceRetrieveUpdateStateResponseStructure() {
		DeviceManagementServiceRetrieveUpdateStateResponseStructureImpl deviceManagementServiceRetrieveUpdateStateResponseStructure = new DeviceManagementServiceRetrieveUpdateStateResponseStructureImpl();
		return deviceManagementServiceRetrieveUpdateStateResponseStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceManagementServiceUpdateHistoryEntryStructure createDeviceManagementServiceUpdateHistoryEntryStructure() {
		DeviceManagementServiceUpdateHistoryEntryStructureImpl deviceManagementServiceUpdateHistoryEntryStructure = new DeviceManagementServiceUpdateHistoryEntryStructureImpl();
		return deviceManagementServiceUpdateHistoryEntryStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceManagementServiceUpdateHistoryStructure createDeviceManagementServiceUpdateHistoryStructure() {
		DeviceManagementServiceUpdateHistoryStructureImpl deviceManagementServiceUpdateHistoryStructure = new DeviceManagementServiceUpdateHistoryStructureImpl();
		return deviceManagementServiceUpdateHistoryStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceManagementServiceUpdateStateDataStructure createDeviceManagementServiceUpdateStateDataStructure() {
		DeviceManagementServiceUpdateStateDataStructureImpl deviceManagementServiceUpdateStateDataStructure = new DeviceManagementServiceUpdateStateDataStructureImpl();
		return deviceManagementServiceUpdateStateDataStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceStatusInformationStructure createDeviceStatusInformationStructure() {
		DeviceStatusInformationStructureImpl deviceStatusInformationStructure = new DeviceStatusInformationStructureImpl();
		return deviceStatusInformationStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceStatusStructure createDeviceStatusStructure() {
		DeviceStatusStructureImpl deviceStatusStructure = new DeviceStatusStructureImpl();
		return deviceStatusStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubdeviceErrorMessagesStructure createSubdeviceErrorMessagesStructure() {
		SubdeviceErrorMessagesStructureImpl subdeviceErrorMessagesStructure = new SubdeviceErrorMessagesStructureImpl();
		return subdeviceErrorMessagesStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubdeviceInformationStructure createSubdeviceInformationStructure() {
		SubdeviceInformationStructureImpl subdeviceInformationStructure = new SubdeviceInformationStructureImpl();
		return subdeviceInformationStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubdeviceStatusInformationStructure createSubdeviceStatusInformationStructure() {
		SubdeviceStatusInformationStructureImpl subdeviceStatusInformationStructure = new SubdeviceStatusInformationStructureImpl();
		return subdeviceStatusInformationStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChecksumTypeEnumeration createChecksumTypeEnumerationFromString(EDataType eDataType, String initialValue) {
		ChecksumTypeEnumeration result = ChecksumTypeEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChecksumTypeEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateAcceptEnumeration createUpdateAcceptEnumerationFromString(EDataType eDataType, String initialValue) {
		UpdateAcceptEnumeration result = UpdateAcceptEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpdateAcceptEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateStatusEnumeration createUpdateStatusEnumerationFromString(EDataType eDataType, String initialValue) {
		UpdateStatusEnumeration result = UpdateStatusEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpdateStatusEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChecksumTypeEnumeration createChecksumTypeEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createChecksumTypeEnumerationFromString(IBISDeviceManagementServicePackage.eINSTANCE.getChecksumTypeEnumeration(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChecksumTypeEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertChecksumTypeEnumerationToString(IBISDeviceManagementServicePackage.eINSTANCE.getChecksumTypeEnumeration(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateAcceptEnumeration createUpdateAcceptEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createUpdateAcceptEnumerationFromString(IBISDeviceManagementServicePackage.eINSTANCE.getUpdateAcceptEnumeration(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpdateAcceptEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUpdateAcceptEnumerationToString(IBISDeviceManagementServicePackage.eINSTANCE.getUpdateAcceptEnumeration(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateStatusEnumeration createUpdateStatusEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createUpdateStatusEnumerationFromString(IBISDeviceManagementServicePackage.eINSTANCE.getUpdateStatusEnumeration(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpdateStatusEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUpdateStatusEnumerationToString(IBISDeviceManagementServicePackage.eINSTANCE.getUpdateStatusEnumeration(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISDeviceManagementServicePackage getIBISDeviceManagementServicePackage() {
		return (IBISDeviceManagementServicePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IBISDeviceManagementServicePackage getPackage() {
		return IBISDeviceManagementServicePackage.eINSTANCE;
	}

} //IBISDeviceManagementServiceFactoryImpl
