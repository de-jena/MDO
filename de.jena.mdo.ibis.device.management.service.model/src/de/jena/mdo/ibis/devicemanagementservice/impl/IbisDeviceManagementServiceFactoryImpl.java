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
public class IbisDeviceManagementServiceFactoryImpl extends EFactoryImpl implements IbisDeviceManagementServiceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IbisDeviceManagementServiceFactory init() {
		try {
			IbisDeviceManagementServiceFactory theIbisDeviceManagementServiceFactory = (IbisDeviceManagementServiceFactory)EPackage.Registry.INSTANCE.getEFactory(IbisDeviceManagementServicePackage.eNS_URI);
			if (theIbisDeviceManagementServiceFactory != null) {
				return theIbisDeviceManagementServiceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IbisDeviceManagementServiceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IbisDeviceManagementServiceFactoryImpl() {
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
			case IbisDeviceManagementServicePackage.CHECKSUM_STRUCTURE: return createChecksumStructure();
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_FINALIZE_UPDATE_REQUEST_STRUCTURE: return createDeviceManagementServiceFinalizeUpdateRequestStructure();
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_FINALIZE_UPDATE_RESPONSE_STRUCTURE: return createDeviceManagementServiceFinalizeUpdateResponseStructure();
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_DATA_STRUCTURE: return createDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure();
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_STRUCTURE: return createDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure();
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_INFORMATION_RESPONSE_DATA_STRUCTURE: return createDeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure();
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_INFORMATION_RESPONSE_STRUCTURE: return createDeviceManagementServiceGetAllSubdeviceInformationResponseStructure();
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_DATA_STRUCTURE: return createDeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure();
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE: return createDeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure();
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_DATA_STRUCTURE: return createDeviceManagementServiceGetDeviceConfigurationResponseDataStructure();
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_STRUCTURE: return createDeviceManagementServiceGetDeviceConfigurationResponseStructure();
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_DATA_STRUCTURE: return createDeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure();
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_STRUCTURE: return createDeviceManagementServiceGetDeviceErrorMessagesResponseStructure();
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_DATA_STRUCTURE: return createDeviceManagementServiceGetDeviceInformationResponseDataStructure();
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_STRUCTURE: return createDeviceManagementServiceGetDeviceInformationResponseStructure();
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_DATA_STRUCTURE: return createDeviceManagementServiceGetDeviceStatusInformationResponseDataStructure();
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE: return createDeviceManagementServiceGetDeviceStatusInformationResponseStructure();
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_RESPONSE_DATA_STRUCTURE: return createDeviceManagementServiceGetDeviceStatusResponseDataStructure();
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_RESPONSE_STRUCTURE: return createDeviceManagementServiceGetDeviceStatusResponseStructure();
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_INFORMATION_RESPONSE_DATA_STRUCTURE: return createDeviceManagementServiceGetServiceInformationResponseDataStructure();
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_INFORMATION_RESPONSE_STRUCTURE: return createDeviceManagementServiceGetServiceInformationResponseStructure();
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_STATUS_RESPONSE_DATA_STRUCTURE: return createDeviceManagementServiceGetServiceStatusResponseDataStructure();
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_STATUS_RESPONSE_STRUCTURE: return createDeviceManagementServiceGetServiceStatusResponseStructure();
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_UPDATE_HISTORY_RESPONSE_STRUCTURE: return createDeviceManagementServiceGetUpdateHistoryResponseStructure();
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE: return createDeviceManagementServiceInstallUpdateRequestStructure();
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_RESPONSE_STRUCTURE: return createDeviceManagementServiceInstallUpdateResponseStructure();
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_RETRIEVE_UPDATE_STATE_REQUEST_STRUCTURE: return createDeviceManagementServiceRetrieveUpdateStateRequestStructure();
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_RETRIEVE_UPDATE_STATE_RESPONSE_STRUCTURE: return createDeviceManagementServiceRetrieveUpdateStateResponseStructure();
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE: return createDeviceManagementServiceUpdateHistoryEntryStructure();
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_STRUCTURE: return createDeviceManagementServiceUpdateHistoryStructure();
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_STATE_DATA_STRUCTURE: return createDeviceManagementServiceUpdateStateDataStructure();
			case IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION_STRUCTURE: return createDeviceStatusInformationStructure();
			case IbisDeviceManagementServicePackage.DEVICE_STATUS_STRUCTURE: return createDeviceStatusStructure();
			case IbisDeviceManagementServicePackage.SUBDEVICE_ERROR_MESSAGES_STRUCTURE: return createSubdeviceErrorMessagesStructure();
			case IbisDeviceManagementServicePackage.SUBDEVICE_INFORMATION_STRUCTURE: return createSubdeviceInformationStructure();
			case IbisDeviceManagementServicePackage.SUBDEVICE_STATUS_INFORMATION_STRUCTURE: return createSubdeviceStatusInformationStructure();
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
			case IbisDeviceManagementServicePackage.CHECKSUM_TYPE_ENUMERATION:
				return createChecksumTypeEnumerationFromString(eDataType, initialValue);
			case IbisDeviceManagementServicePackage.UPDATE_ACCEPT_ENUMERATION:
				return createUpdateAcceptEnumerationFromString(eDataType, initialValue);
			case IbisDeviceManagementServicePackage.UPDATE_STATUS_ENUMERATION:
				return createUpdateStatusEnumerationFromString(eDataType, initialValue);
			case IbisDeviceManagementServicePackage.CHECKSUM_TYPE_ENUMERATION_OBJECT:
				return createChecksumTypeEnumerationObjectFromString(eDataType, initialValue);
			case IbisDeviceManagementServicePackage.UPDATE_ACCEPT_ENUMERATION_OBJECT:
				return createUpdateAcceptEnumerationObjectFromString(eDataType, initialValue);
			case IbisDeviceManagementServicePackage.UPDATE_STATUS_ENUMERATION_OBJECT:
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
			case IbisDeviceManagementServicePackage.CHECKSUM_TYPE_ENUMERATION:
				return convertChecksumTypeEnumerationToString(eDataType, instanceValue);
			case IbisDeviceManagementServicePackage.UPDATE_ACCEPT_ENUMERATION:
				return convertUpdateAcceptEnumerationToString(eDataType, instanceValue);
			case IbisDeviceManagementServicePackage.UPDATE_STATUS_ENUMERATION:
				return convertUpdateStatusEnumerationToString(eDataType, instanceValue);
			case IbisDeviceManagementServicePackage.CHECKSUM_TYPE_ENUMERATION_OBJECT:
				return convertChecksumTypeEnumerationObjectToString(eDataType, instanceValue);
			case IbisDeviceManagementServicePackage.UPDATE_ACCEPT_ENUMERATION_OBJECT:
				return convertUpdateAcceptEnumerationObjectToString(eDataType, instanceValue);
			case IbisDeviceManagementServicePackage.UPDATE_STATUS_ENUMERATION_OBJECT:
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
		return createChecksumTypeEnumerationFromString(IbisDeviceManagementServicePackage.Literals.CHECKSUM_TYPE_ENUMERATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChecksumTypeEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertChecksumTypeEnumerationToString(IbisDeviceManagementServicePackage.Literals.CHECKSUM_TYPE_ENUMERATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateAcceptEnumeration createUpdateAcceptEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createUpdateAcceptEnumerationFromString(IbisDeviceManagementServicePackage.Literals.UPDATE_ACCEPT_ENUMERATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpdateAcceptEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUpdateAcceptEnumerationToString(IbisDeviceManagementServicePackage.Literals.UPDATE_ACCEPT_ENUMERATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateStatusEnumeration createUpdateStatusEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createUpdateStatusEnumerationFromString(IbisDeviceManagementServicePackage.Literals.UPDATE_STATUS_ENUMERATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpdateStatusEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUpdateStatusEnumerationToString(IbisDeviceManagementServicePackage.Literals.UPDATE_STATUS_ENUMERATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IbisDeviceManagementServicePackage getIbisDeviceManagementServicePackage() {
		return (IbisDeviceManagementServicePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IbisDeviceManagementServicePackage getPackage() {
		return IbisDeviceManagementServicePackage.eINSTANCE;
	}

} //IbisDeviceManagementServiceFactoryImpl
