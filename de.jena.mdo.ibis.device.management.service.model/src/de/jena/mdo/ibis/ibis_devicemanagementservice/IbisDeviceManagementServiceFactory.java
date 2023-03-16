/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage
 * @generated
 */
@ProviderType
public interface IbisDeviceManagementServiceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IbisDeviceManagementServiceFactory eINSTANCE = de.jena.mdo.ibis.ibis_devicemanagementservice.impl.IbisDeviceManagementServiceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Checksum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Checksum</em>'.
	 * @generated
	 */
	Checksum createChecksum();

	/**
	 * Returns a new object of class '<em>Finalize Update Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Finalize Update Request</em>'.
	 * @generated
	 */
	FinalizeUpdateRequest createFinalizeUpdateRequest();

	/**
	 * Returns a new object of class '<em>Finalize Update Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Finalize Update Response</em>'.
	 * @generated
	 */
	FinalizeUpdateResponse createFinalizeUpdateResponse();

	/**
	 * Returns a new object of class '<em>All Subdevice Error Messages Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>All Subdevice Error Messages Data</em>'.
	 * @generated
	 */
	AllSubdeviceErrorMessagesData createAllSubdeviceErrorMessagesData();

	/**
	 * Returns a new object of class '<em>All Subdevice Error Messages Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>All Subdevice Error Messages Response</em>'.
	 * @generated
	 */
	AllSubdeviceErrorMessagesResponse createAllSubdeviceErrorMessagesResponse();

	/**
	 * Returns a new object of class '<em>All Subdevice Information Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>All Subdevice Information Data</em>'.
	 * @generated
	 */
	AllSubdeviceInformationData createAllSubdeviceInformationData();

	/**
	 * Returns a new object of class '<em>All Subdevice Information Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>All Subdevice Information Response</em>'.
	 * @generated
	 */
	AllSubdeviceInformationResponse createAllSubdeviceInformationResponse();

	/**
	 * Returns a new object of class '<em>All Subdevice Status Information Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>All Subdevice Status Information Data</em>'.
	 * @generated
	 */
	AllSubdeviceStatusInformationData createAllSubdeviceStatusInformationData();

	/**
	 * Returns a new object of class '<em>All Subdevice Status Information Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>All Subdevice Status Information Response</em>'.
	 * @generated
	 */
	AllSubdeviceStatusInformationResponse createAllSubdeviceStatusInformationResponse();

	/**
	 * Returns a new object of class '<em>Device Configuration Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Configuration Data</em>'.
	 * @generated
	 */
	DeviceConfigurationData createDeviceConfigurationData();

	/**
	 * Returns a new object of class '<em>Device Configuration Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Configuration Response</em>'.
	 * @generated
	 */
	DeviceConfigurationResponse createDeviceConfigurationResponse();

	/**
	 * Returns a new object of class '<em>Device Error Messages Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Error Messages Data</em>'.
	 * @generated
	 */
	DeviceErrorMessagesData createDeviceErrorMessagesData();

	/**
	 * Returns a new object of class '<em>Device Error Messages Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Error Messages Response</em>'.
	 * @generated
	 */
	DeviceErrorMessagesResponse createDeviceErrorMessagesResponse();

	/**
	 * Returns a new object of class '<em>Device Information Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Information Data</em>'.
	 * @generated
	 */
	DeviceInformationData createDeviceInformationData();

	/**
	 * Returns a new object of class '<em>Device Information Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Information Response</em>'.
	 * @generated
	 */
	DeviceInformationResponse createDeviceInformationResponse();

	/**
	 * Returns a new object of class '<em>Device Status Information Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Status Information Data</em>'.
	 * @generated
	 */
	DeviceStatusInformationData createDeviceStatusInformationData();

	/**
	 * Returns a new object of class '<em>Device Status Information Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Status Information Response</em>'.
	 * @generated
	 */
	DeviceStatusInformationResponse createDeviceStatusInformationResponse();

	/**
	 * Returns a new object of class '<em>Device Status Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Status Data</em>'.
	 * @generated
	 */
	DeviceStatusData createDeviceStatusData();

	/**
	 * Returns a new object of class '<em>Device Status Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Status Response</em>'.
	 * @generated
	 */
	DeviceStatusResponse createDeviceStatusResponse();

	/**
	 * Returns a new object of class '<em>Service Information Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Information Data</em>'.
	 * @generated
	 */
	ServiceInformationData createServiceInformationData();

	/**
	 * Returns a new object of class '<em>Service Information Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Information Response</em>'.
	 * @generated
	 */
	ServiceInformationResponse createServiceInformationResponse();

	/**
	 * Returns a new object of class '<em>Service Status Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Status Data</em>'.
	 * @generated
	 */
	ServiceStatusData createServiceStatusData();

	/**
	 * Returns a new object of class '<em>Service Status Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Status Response</em>'.
	 * @generated
	 */
	ServiceStatusResponse createServiceStatusResponse();

	/**
	 * Returns a new object of class '<em>Update History Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update History Response</em>'.
	 * @generated
	 */
	UpdateHistoryResponse createUpdateHistoryResponse();

	/**
	 * Returns a new object of class '<em>Install Update Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Install Update Request</em>'.
	 * @generated
	 */
	InstallUpdateRequest createInstallUpdateRequest();

	/**
	 * Returns a new object of class '<em>Install Update Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Install Update Response</em>'.
	 * @generated
	 */
	InstallUpdateResponse createInstallUpdateResponse();

	/**
	 * Returns a new object of class '<em>Retrieve Update State Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Retrieve Update State Request</em>'.
	 * @generated
	 */
	RetrieveUpdateStateRequest createRetrieveUpdateStateRequest();

	/**
	 * Returns a new object of class '<em>Retrieve Update State Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Retrieve Update State Response</em>'.
	 * @generated
	 */
	RetrieveUpdateStateResponse createRetrieveUpdateStateResponse();

	/**
	 * Returns a new object of class '<em>Update History Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update History Entry</em>'.
	 * @generated
	 */
	UpdateHistoryEntry createUpdateHistoryEntry();

	/**
	 * Returns a new object of class '<em>Update History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update History</em>'.
	 * @generated
	 */
	UpdateHistory createUpdateHistory();

	/**
	 * Returns a new object of class '<em>Update State Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update State Data</em>'.
	 * @generated
	 */
	UpdateStateData createUpdateStateData();

	/**
	 * Returns a new object of class '<em>Device Status Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Status Information</em>'.
	 * @generated
	 */
	DeviceStatusInformation createDeviceStatusInformation();

	/**
	 * Returns a new object of class '<em>Device Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Status</em>'.
	 * @generated
	 */
	DeviceStatus createDeviceStatus();

	/**
	 * Returns a new object of class '<em>Subdevice Error Messages</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subdevice Error Messages</em>'.
	 * @generated
	 */
	SubdeviceErrorMessages createSubdeviceErrorMessages();

	/**
	 * Returns a new object of class '<em>Subdevice Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subdevice Information</em>'.
	 * @generated
	 */
	SubdeviceInformation createSubdeviceInformation();

	/**
	 * Returns a new object of class '<em>Subdevice Status Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subdevice Status Information</em>'.
	 * @generated
	 */
	SubdeviceStatusInformation createSubdeviceStatusInformation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IbisDeviceManagementServicePackage getIbisDeviceManagementServicePackage();

} //IbisDeviceManagementServiceFactory
