/**
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice.impl;

import de.jena.mdo.ibis.ibis_devicemanagementservice.*;

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
			case IbisDeviceManagementServicePackage.CHECKSUM: return createChecksum();
			case IbisDeviceManagementServicePackage.FINALIZE_UPDATE_REQUEST: return createFinalizeUpdateRequest();
			case IbisDeviceManagementServicePackage.FINALIZE_UPDATE_RESPONSE: return createFinalizeUpdateResponse();
			case IbisDeviceManagementServicePackage.ALL_SUBDEVICE_ERROR_MESSAGES_DATA: return createAllSubdeviceErrorMessagesData();
			case IbisDeviceManagementServicePackage.ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE: return createAllSubdeviceErrorMessagesResponse();
			case IbisDeviceManagementServicePackage.ALL_SUBDEVICE_INFORMATION_DATA: return createAllSubdeviceInformationData();
			case IbisDeviceManagementServicePackage.ALL_SUBDEVICE_INFORMATION_RESPONSE: return createAllSubdeviceInformationResponse();
			case IbisDeviceManagementServicePackage.ALL_SUBDEVICE_STATUS_INFORMATION_DATA: return createAllSubdeviceStatusInformationData();
			case IbisDeviceManagementServicePackage.ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE: return createAllSubdeviceStatusInformationResponse();
			case IbisDeviceManagementServicePackage.DEVICE_CONFIGURATION_DATA: return createDeviceConfigurationData();
			case IbisDeviceManagementServicePackage.DEVICE_CONFIGURATION_RESPONSE: return createDeviceConfigurationResponse();
			case IbisDeviceManagementServicePackage.DEVICE_ERROR_MESSAGES_DATA: return createDeviceErrorMessagesData();
			case IbisDeviceManagementServicePackage.DEVICE_ERROR_MESSAGES_RESPONSE: return createDeviceErrorMessagesResponse();
			case IbisDeviceManagementServicePackage.DEVICE_INFORMATION_DATA: return createDeviceInformationData();
			case IbisDeviceManagementServicePackage.DEVICE_INFORMATION_RESPONSE: return createDeviceInformationResponse();
			case IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION_DATA: return createDeviceStatusInformationData();
			case IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION_RESPONSE: return createDeviceStatusInformationResponse();
			case IbisDeviceManagementServicePackage.DEVICE_STATUS_DATA: return createDeviceStatusData();
			case IbisDeviceManagementServicePackage.DEVICE_STATUS_RESPONSE: return createDeviceStatusResponse();
			case IbisDeviceManagementServicePackage.SERVICE_INFORMATION_DATA: return createServiceInformationData();
			case IbisDeviceManagementServicePackage.SERVICE_INFORMATION_RESPONSE: return createServiceInformationResponse();
			case IbisDeviceManagementServicePackage.SERVICE_STATUS_DATA: return createServiceStatusData();
			case IbisDeviceManagementServicePackage.SERVICE_STATUS_RESPONSE: return createServiceStatusResponse();
			case IbisDeviceManagementServicePackage.UPDATE_HISTORY_RESPONSE: return createUpdateHistoryResponse();
			case IbisDeviceManagementServicePackage.INSTALL_UPDATE_REQUEST: return createInstallUpdateRequest();
			case IbisDeviceManagementServicePackage.INSTALL_UPDATE_RESPONSE: return createInstallUpdateResponse();
			case IbisDeviceManagementServicePackage.RETRIEVE_UPDATE_STATE_REQUEST: return createRetrieveUpdateStateRequest();
			case IbisDeviceManagementServicePackage.RETRIEVE_UPDATE_STATE_RESPONSE: return createRetrieveUpdateStateResponse();
			case IbisDeviceManagementServicePackage.UPDATE_HISTORY_ENTRY: return createUpdateHistoryEntry();
			case IbisDeviceManagementServicePackage.UPDATE_HISTORY: return createUpdateHistory();
			case IbisDeviceManagementServicePackage.UPDATE_STATE_DATA: return createUpdateStateData();
			case IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION: return createDeviceStatusInformation();
			case IbisDeviceManagementServicePackage.DEVICE_STATUS: return createDeviceStatus();
			case IbisDeviceManagementServicePackage.SUBDEVICE_ERROR_MESSAGES: return createSubdeviceErrorMessages();
			case IbisDeviceManagementServicePackage.SUBDEVICE_INFORMATION: return createSubdeviceInformation();
			case IbisDeviceManagementServicePackage.SUBDEVICE_STATUS_INFORMATION: return createSubdeviceStatusInformation();
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
			case IbisDeviceManagementServicePackage.CHECKSUM_TYPE:
				return createChecksumTypeFromString(eDataType, initialValue);
			case IbisDeviceManagementServicePackage.UPDATE_ACCEPT_TYPE:
				return createUpdateAcceptTypeFromString(eDataType, initialValue);
			case IbisDeviceManagementServicePackage.UPDATE_STATUS_TYPE:
				return createUpdateStatusTypeFromString(eDataType, initialValue);
			case IbisDeviceManagementServicePackage.CHECKSUM_TYPE_OBJECT:
				return createChecksumTypeObjectFromString(eDataType, initialValue);
			case IbisDeviceManagementServicePackage.UPDATE_ACCEPT_TYPE_OBJECT:
				return createUpdateAcceptTypeObjectFromString(eDataType, initialValue);
			case IbisDeviceManagementServicePackage.UPDATE_STATUS_TYPE_OBJECT:
				return createUpdateStatusTypeObjectFromString(eDataType, initialValue);
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
			case IbisDeviceManagementServicePackage.CHECKSUM_TYPE:
				return convertChecksumTypeToString(eDataType, instanceValue);
			case IbisDeviceManagementServicePackage.UPDATE_ACCEPT_TYPE:
				return convertUpdateAcceptTypeToString(eDataType, instanceValue);
			case IbisDeviceManagementServicePackage.UPDATE_STATUS_TYPE:
				return convertUpdateStatusTypeToString(eDataType, instanceValue);
			case IbisDeviceManagementServicePackage.CHECKSUM_TYPE_OBJECT:
				return convertChecksumTypeObjectToString(eDataType, instanceValue);
			case IbisDeviceManagementServicePackage.UPDATE_ACCEPT_TYPE_OBJECT:
				return convertUpdateAcceptTypeObjectToString(eDataType, instanceValue);
			case IbisDeviceManagementServicePackage.UPDATE_STATUS_TYPE_OBJECT:
				return convertUpdateStatusTypeObjectToString(eDataType, instanceValue);
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
	public Checksum createChecksum() {
		ChecksumImpl checksum = new ChecksumImpl();
		return checksum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalizeUpdateRequest createFinalizeUpdateRequest() {
		FinalizeUpdateRequestImpl finalizeUpdateRequest = new FinalizeUpdateRequestImpl();
		return finalizeUpdateRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalizeUpdateResponse createFinalizeUpdateResponse() {
		FinalizeUpdateResponseImpl finalizeUpdateResponse = new FinalizeUpdateResponseImpl();
		return finalizeUpdateResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllSubdeviceErrorMessagesData createAllSubdeviceErrorMessagesData() {
		AllSubdeviceErrorMessagesDataImpl allSubdeviceErrorMessagesData = new AllSubdeviceErrorMessagesDataImpl();
		return allSubdeviceErrorMessagesData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllSubdeviceErrorMessagesResponse createAllSubdeviceErrorMessagesResponse() {
		AllSubdeviceErrorMessagesResponseImpl allSubdeviceErrorMessagesResponse = new AllSubdeviceErrorMessagesResponseImpl();
		return allSubdeviceErrorMessagesResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllSubdeviceInformationData createAllSubdeviceInformationData() {
		AllSubdeviceInformationDataImpl allSubdeviceInformationData = new AllSubdeviceInformationDataImpl();
		return allSubdeviceInformationData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllSubdeviceInformationResponse createAllSubdeviceInformationResponse() {
		AllSubdeviceInformationResponseImpl allSubdeviceInformationResponse = new AllSubdeviceInformationResponseImpl();
		return allSubdeviceInformationResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllSubdeviceStatusInformationData createAllSubdeviceStatusInformationData() {
		AllSubdeviceStatusInformationDataImpl allSubdeviceStatusInformationData = new AllSubdeviceStatusInformationDataImpl();
		return allSubdeviceStatusInformationData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllSubdeviceStatusInformationResponse createAllSubdeviceStatusInformationResponse() {
		AllSubdeviceStatusInformationResponseImpl allSubdeviceStatusInformationResponse = new AllSubdeviceStatusInformationResponseImpl();
		return allSubdeviceStatusInformationResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceConfigurationData createDeviceConfigurationData() {
		DeviceConfigurationDataImpl deviceConfigurationData = new DeviceConfigurationDataImpl();
		return deviceConfigurationData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceConfigurationResponse createDeviceConfigurationResponse() {
		DeviceConfigurationResponseImpl deviceConfigurationResponse = new DeviceConfigurationResponseImpl();
		return deviceConfigurationResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceErrorMessagesData createDeviceErrorMessagesData() {
		DeviceErrorMessagesDataImpl deviceErrorMessagesData = new DeviceErrorMessagesDataImpl();
		return deviceErrorMessagesData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceErrorMessagesResponse createDeviceErrorMessagesResponse() {
		DeviceErrorMessagesResponseImpl deviceErrorMessagesResponse = new DeviceErrorMessagesResponseImpl();
		return deviceErrorMessagesResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceInformationData createDeviceInformationData() {
		DeviceInformationDataImpl deviceInformationData = new DeviceInformationDataImpl();
		return deviceInformationData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceInformationResponse createDeviceInformationResponse() {
		DeviceInformationResponseImpl deviceInformationResponse = new DeviceInformationResponseImpl();
		return deviceInformationResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceStatusInformationData createDeviceStatusInformationData() {
		DeviceStatusInformationDataImpl deviceStatusInformationData = new DeviceStatusInformationDataImpl();
		return deviceStatusInformationData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceStatusInformationResponse createDeviceStatusInformationResponse() {
		DeviceStatusInformationResponseImpl deviceStatusInformationResponse = new DeviceStatusInformationResponseImpl();
		return deviceStatusInformationResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceStatusData createDeviceStatusData() {
		DeviceStatusDataImpl deviceStatusData = new DeviceStatusDataImpl();
		return deviceStatusData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceStatusResponse createDeviceStatusResponse() {
		DeviceStatusResponseImpl deviceStatusResponse = new DeviceStatusResponseImpl();
		return deviceStatusResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceInformationData createServiceInformationData() {
		ServiceInformationDataImpl serviceInformationData = new ServiceInformationDataImpl();
		return serviceInformationData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceInformationResponse createServiceInformationResponse() {
		ServiceInformationResponseImpl serviceInformationResponse = new ServiceInformationResponseImpl();
		return serviceInformationResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceStatusData createServiceStatusData() {
		ServiceStatusDataImpl serviceStatusData = new ServiceStatusDataImpl();
		return serviceStatusData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceStatusResponse createServiceStatusResponse() {
		ServiceStatusResponseImpl serviceStatusResponse = new ServiceStatusResponseImpl();
		return serviceStatusResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpdateHistoryResponse createUpdateHistoryResponse() {
		UpdateHistoryResponseImpl updateHistoryResponse = new UpdateHistoryResponseImpl();
		return updateHistoryResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstallUpdateRequest createInstallUpdateRequest() {
		InstallUpdateRequestImpl installUpdateRequest = new InstallUpdateRequestImpl();
		return installUpdateRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstallUpdateResponse createInstallUpdateResponse() {
		InstallUpdateResponseImpl installUpdateResponse = new InstallUpdateResponseImpl();
		return installUpdateResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RetrieveUpdateStateRequest createRetrieveUpdateStateRequest() {
		RetrieveUpdateStateRequestImpl retrieveUpdateStateRequest = new RetrieveUpdateStateRequestImpl();
		return retrieveUpdateStateRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RetrieveUpdateStateResponse createRetrieveUpdateStateResponse() {
		RetrieveUpdateStateResponseImpl retrieveUpdateStateResponse = new RetrieveUpdateStateResponseImpl();
		return retrieveUpdateStateResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpdateHistoryEntry createUpdateHistoryEntry() {
		UpdateHistoryEntryImpl updateHistoryEntry = new UpdateHistoryEntryImpl();
		return updateHistoryEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpdateHistory createUpdateHistory() {
		UpdateHistoryImpl updateHistory = new UpdateHistoryImpl();
		return updateHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpdateStateData createUpdateStateData() {
		UpdateStateDataImpl updateStateData = new UpdateStateDataImpl();
		return updateStateData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceStatusInformation createDeviceStatusInformation() {
		DeviceStatusInformationImpl deviceStatusInformation = new DeviceStatusInformationImpl();
		return deviceStatusInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceStatus createDeviceStatus() {
		DeviceStatusImpl deviceStatus = new DeviceStatusImpl();
		return deviceStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubdeviceErrorMessages createSubdeviceErrorMessages() {
		SubdeviceErrorMessagesImpl subdeviceErrorMessages = new SubdeviceErrorMessagesImpl();
		return subdeviceErrorMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubdeviceInformation createSubdeviceInformation() {
		SubdeviceInformationImpl subdeviceInformation = new SubdeviceInformationImpl();
		return subdeviceInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubdeviceStatusInformation createSubdeviceStatusInformation() {
		SubdeviceStatusInformationImpl subdeviceStatusInformation = new SubdeviceStatusInformationImpl();
		return subdeviceStatusInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChecksumType createChecksumTypeFromString(EDataType eDataType, String initialValue) {
		ChecksumType result = ChecksumType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChecksumTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateAcceptType createUpdateAcceptTypeFromString(EDataType eDataType, String initialValue) {
		UpdateAcceptType result = UpdateAcceptType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpdateAcceptTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateStatusType createUpdateStatusTypeFromString(EDataType eDataType, String initialValue) {
		UpdateStatusType result = UpdateStatusType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpdateStatusTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChecksumType createChecksumTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createChecksumTypeFromString(IbisDeviceManagementServicePackage.Literals.CHECKSUM_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChecksumTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertChecksumTypeToString(IbisDeviceManagementServicePackage.Literals.CHECKSUM_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateAcceptType createUpdateAcceptTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createUpdateAcceptTypeFromString(IbisDeviceManagementServicePackage.Literals.UPDATE_ACCEPT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpdateAcceptTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUpdateAcceptTypeToString(IbisDeviceManagementServicePackage.Literals.UPDATE_ACCEPT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateStatusType createUpdateStatusTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createUpdateStatusTypeFromString(IbisDeviceManagementServicePackage.Literals.UPDATE_STATUS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpdateStatusTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUpdateStatusTypeToString(IbisDeviceManagementServicePackage.Literals.UPDATE_STATUS_TYPE, instanceValue);
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
