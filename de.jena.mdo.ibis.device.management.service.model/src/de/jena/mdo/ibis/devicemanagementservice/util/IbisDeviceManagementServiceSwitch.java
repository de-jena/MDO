/**
 */
package de.jena.mdo.ibis.devicemanagementservice.util;

import de.jena.mdo.ibis.common.GeneralResponseStructure;

import de.jena.mdo.ibis.devicemanagementservice.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.jena.mdo.ibis.devicemanagementservice.IbisDeviceManagementServicePackage
 * @generated
 */
public class IbisDeviceManagementServiceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IbisDeviceManagementServicePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IbisDeviceManagementServiceSwitch() {
		if (modelPackage == null) {
			modelPackage = IbisDeviceManagementServicePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case IbisDeviceManagementServicePackage.CHECKSUM_STRUCTURE: {
				ChecksumStructure checksumStructure = (ChecksumStructure)theEObject;
				T result = caseChecksumStructure(checksumStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_FINALIZE_UPDATE_REQUEST_STRUCTURE: {
				DeviceManagementServiceFinalizeUpdateRequestStructure deviceManagementServiceFinalizeUpdateRequestStructure = (DeviceManagementServiceFinalizeUpdateRequestStructure)theEObject;
				T result = caseDeviceManagementServiceFinalizeUpdateRequestStructure(deviceManagementServiceFinalizeUpdateRequestStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_FINALIZE_UPDATE_RESPONSE_STRUCTURE: {
				DeviceManagementServiceFinalizeUpdateResponseStructure deviceManagementServiceFinalizeUpdateResponseStructure = (DeviceManagementServiceFinalizeUpdateResponseStructure)theEObject;
				T result = caseDeviceManagementServiceFinalizeUpdateResponseStructure(deviceManagementServiceFinalizeUpdateResponseStructure);
				if (result == null) result = caseGeneralResponseStructure(deviceManagementServiceFinalizeUpdateResponseStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_DATA_STRUCTURE: {
				DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure deviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure = (DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure)theEObject;
				T result = caseDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure(deviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_STRUCTURE: {
				DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure deviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure = (DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure)theEObject;
				T result = caseDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure(deviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure);
				if (result == null) result = caseGeneralResponseStructure(deviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_INFORMATION_RESPONSE_DATA_STRUCTURE: {
				DeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure deviceManagementServiceGetAllSubdeviceInformationResponseDataStructure = (DeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure)theEObject;
				T result = caseDeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure(deviceManagementServiceGetAllSubdeviceInformationResponseDataStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_INFORMATION_RESPONSE_STRUCTURE: {
				DeviceManagementServiceGetAllSubdeviceInformationResponseStructure deviceManagementServiceGetAllSubdeviceInformationResponseStructure = (DeviceManagementServiceGetAllSubdeviceInformationResponseStructure)theEObject;
				T result = caseDeviceManagementServiceGetAllSubdeviceInformationResponseStructure(deviceManagementServiceGetAllSubdeviceInformationResponseStructure);
				if (result == null) result = caseGeneralResponseStructure(deviceManagementServiceGetAllSubdeviceInformationResponseStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_DATA_STRUCTURE: {
				DeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure deviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure = (DeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure)theEObject;
				T result = caseDeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure(deviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE: {
				DeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure deviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure = (DeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure)theEObject;
				T result = caseDeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure(deviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure);
				if (result == null) result = caseGeneralResponseStructure(deviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_DATA_STRUCTURE: {
				DeviceManagementServiceGetDeviceConfigurationResponseDataStructure deviceManagementServiceGetDeviceConfigurationResponseDataStructure = (DeviceManagementServiceGetDeviceConfigurationResponseDataStructure)theEObject;
				T result = caseDeviceManagementServiceGetDeviceConfigurationResponseDataStructure(deviceManagementServiceGetDeviceConfigurationResponseDataStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_STRUCTURE: {
				DeviceManagementServiceGetDeviceConfigurationResponseStructure deviceManagementServiceGetDeviceConfigurationResponseStructure = (DeviceManagementServiceGetDeviceConfigurationResponseStructure)theEObject;
				T result = caseDeviceManagementServiceGetDeviceConfigurationResponseStructure(deviceManagementServiceGetDeviceConfigurationResponseStructure);
				if (result == null) result = caseGeneralResponseStructure(deviceManagementServiceGetDeviceConfigurationResponseStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_DATA_STRUCTURE: {
				DeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure deviceManagementServiceGetDeviceErrorMessagesResponseDataStructure = (DeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure)theEObject;
				T result = caseDeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure(deviceManagementServiceGetDeviceErrorMessagesResponseDataStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_STRUCTURE: {
				DeviceManagementServiceGetDeviceErrorMessagesResponseStructure deviceManagementServiceGetDeviceErrorMessagesResponseStructure = (DeviceManagementServiceGetDeviceErrorMessagesResponseStructure)theEObject;
				T result = caseDeviceManagementServiceGetDeviceErrorMessagesResponseStructure(deviceManagementServiceGetDeviceErrorMessagesResponseStructure);
				if (result == null) result = caseGeneralResponseStructure(deviceManagementServiceGetDeviceErrorMessagesResponseStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_DATA_STRUCTURE: {
				DeviceManagementServiceGetDeviceInformationResponseDataStructure deviceManagementServiceGetDeviceInformationResponseDataStructure = (DeviceManagementServiceGetDeviceInformationResponseDataStructure)theEObject;
				T result = caseDeviceManagementServiceGetDeviceInformationResponseDataStructure(deviceManagementServiceGetDeviceInformationResponseDataStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_STRUCTURE: {
				DeviceManagementServiceGetDeviceInformationResponseStructure deviceManagementServiceGetDeviceInformationResponseStructure = (DeviceManagementServiceGetDeviceInformationResponseStructure)theEObject;
				T result = caseDeviceManagementServiceGetDeviceInformationResponseStructure(deviceManagementServiceGetDeviceInformationResponseStructure);
				if (result == null) result = caseGeneralResponseStructure(deviceManagementServiceGetDeviceInformationResponseStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_DATA_STRUCTURE: {
				DeviceManagementServiceGetDeviceStatusInformationResponseDataStructure deviceManagementServiceGetDeviceStatusInformationResponseDataStructure = (DeviceManagementServiceGetDeviceStatusInformationResponseDataStructure)theEObject;
				T result = caseDeviceManagementServiceGetDeviceStatusInformationResponseDataStructure(deviceManagementServiceGetDeviceStatusInformationResponseDataStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE: {
				DeviceManagementServiceGetDeviceStatusInformationResponseStructure deviceManagementServiceGetDeviceStatusInformationResponseStructure = (DeviceManagementServiceGetDeviceStatusInformationResponseStructure)theEObject;
				T result = caseDeviceManagementServiceGetDeviceStatusInformationResponseStructure(deviceManagementServiceGetDeviceStatusInformationResponseStructure);
				if (result == null) result = caseGeneralResponseStructure(deviceManagementServiceGetDeviceStatusInformationResponseStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_RESPONSE_DATA_STRUCTURE: {
				DeviceManagementServiceGetDeviceStatusResponseDataStructure deviceManagementServiceGetDeviceStatusResponseDataStructure = (DeviceManagementServiceGetDeviceStatusResponseDataStructure)theEObject;
				T result = caseDeviceManagementServiceGetDeviceStatusResponseDataStructure(deviceManagementServiceGetDeviceStatusResponseDataStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_RESPONSE_STRUCTURE: {
				DeviceManagementServiceGetDeviceStatusResponseStructure deviceManagementServiceGetDeviceStatusResponseStructure = (DeviceManagementServiceGetDeviceStatusResponseStructure)theEObject;
				T result = caseDeviceManagementServiceGetDeviceStatusResponseStructure(deviceManagementServiceGetDeviceStatusResponseStructure);
				if (result == null) result = caseGeneralResponseStructure(deviceManagementServiceGetDeviceStatusResponseStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_INFORMATION_RESPONSE_DATA_STRUCTURE: {
				DeviceManagementServiceGetServiceInformationResponseDataStructure deviceManagementServiceGetServiceInformationResponseDataStructure = (DeviceManagementServiceGetServiceInformationResponseDataStructure)theEObject;
				T result = caseDeviceManagementServiceGetServiceInformationResponseDataStructure(deviceManagementServiceGetServiceInformationResponseDataStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_INFORMATION_RESPONSE_STRUCTURE: {
				DeviceManagementServiceGetServiceInformationResponseStructure deviceManagementServiceGetServiceInformationResponseStructure = (DeviceManagementServiceGetServiceInformationResponseStructure)theEObject;
				T result = caseDeviceManagementServiceGetServiceInformationResponseStructure(deviceManagementServiceGetServiceInformationResponseStructure);
				if (result == null) result = caseGeneralResponseStructure(deviceManagementServiceGetServiceInformationResponseStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_STATUS_RESPONSE_DATA_STRUCTURE: {
				DeviceManagementServiceGetServiceStatusResponseDataStructure deviceManagementServiceGetServiceStatusResponseDataStructure = (DeviceManagementServiceGetServiceStatusResponseDataStructure)theEObject;
				T result = caseDeviceManagementServiceGetServiceStatusResponseDataStructure(deviceManagementServiceGetServiceStatusResponseDataStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_STATUS_RESPONSE_STRUCTURE: {
				DeviceManagementServiceGetServiceStatusResponseStructure deviceManagementServiceGetServiceStatusResponseStructure = (DeviceManagementServiceGetServiceStatusResponseStructure)theEObject;
				T result = caseDeviceManagementServiceGetServiceStatusResponseStructure(deviceManagementServiceGetServiceStatusResponseStructure);
				if (result == null) result = caseGeneralResponseStructure(deviceManagementServiceGetServiceStatusResponseStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_UPDATE_HISTORY_RESPONSE_STRUCTURE: {
				DeviceManagementServiceGetUpdateHistoryResponseStructure deviceManagementServiceGetUpdateHistoryResponseStructure = (DeviceManagementServiceGetUpdateHistoryResponseStructure)theEObject;
				T result = caseDeviceManagementServiceGetUpdateHistoryResponseStructure(deviceManagementServiceGetUpdateHistoryResponseStructure);
				if (result == null) result = caseGeneralResponseStructure(deviceManagementServiceGetUpdateHistoryResponseStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE: {
				DeviceManagementServiceInstallUpdateRequestStructure deviceManagementServiceInstallUpdateRequestStructure = (DeviceManagementServiceInstallUpdateRequestStructure)theEObject;
				T result = caseDeviceManagementServiceInstallUpdateRequestStructure(deviceManagementServiceInstallUpdateRequestStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_RESPONSE_STRUCTURE: {
				DeviceManagementServiceInstallUpdateResponseStructure deviceManagementServiceInstallUpdateResponseStructure = (DeviceManagementServiceInstallUpdateResponseStructure)theEObject;
				T result = caseDeviceManagementServiceInstallUpdateResponseStructure(deviceManagementServiceInstallUpdateResponseStructure);
				if (result == null) result = caseGeneralResponseStructure(deviceManagementServiceInstallUpdateResponseStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_RETRIEVE_UPDATE_STATE_REQUEST_STRUCTURE: {
				DeviceManagementServiceRetrieveUpdateStateRequestStructure deviceManagementServiceRetrieveUpdateStateRequestStructure = (DeviceManagementServiceRetrieveUpdateStateRequestStructure)theEObject;
				T result = caseDeviceManagementServiceRetrieveUpdateStateRequestStructure(deviceManagementServiceRetrieveUpdateStateRequestStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_RETRIEVE_UPDATE_STATE_RESPONSE_STRUCTURE: {
				DeviceManagementServiceRetrieveUpdateStateResponseStructure deviceManagementServiceRetrieveUpdateStateResponseStructure = (DeviceManagementServiceRetrieveUpdateStateResponseStructure)theEObject;
				T result = caseDeviceManagementServiceRetrieveUpdateStateResponseStructure(deviceManagementServiceRetrieveUpdateStateResponseStructure);
				if (result == null) result = caseGeneralResponseStructure(deviceManagementServiceRetrieveUpdateStateResponseStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE: {
				DeviceManagementServiceUpdateHistoryEntryStructure deviceManagementServiceUpdateHistoryEntryStructure = (DeviceManagementServiceUpdateHistoryEntryStructure)theEObject;
				T result = caseDeviceManagementServiceUpdateHistoryEntryStructure(deviceManagementServiceUpdateHistoryEntryStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_STRUCTURE: {
				DeviceManagementServiceUpdateHistoryStructure deviceManagementServiceUpdateHistoryStructure = (DeviceManagementServiceUpdateHistoryStructure)theEObject;
				T result = caseDeviceManagementServiceUpdateHistoryStructure(deviceManagementServiceUpdateHistoryStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_UPDATE_STATE_DATA_STRUCTURE: {
				DeviceManagementServiceUpdateStateDataStructure deviceManagementServiceUpdateStateDataStructure = (DeviceManagementServiceUpdateStateDataStructure)theEObject;
				T result = caseDeviceManagementServiceUpdateStateDataStructure(deviceManagementServiceUpdateStateDataStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION_STRUCTURE: {
				DeviceStatusInformationStructure deviceStatusInformationStructure = (DeviceStatusInformationStructure)theEObject;
				T result = caseDeviceStatusInformationStructure(deviceStatusInformationStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.DEVICE_STATUS_STRUCTURE: {
				DeviceStatusStructure deviceStatusStructure = (DeviceStatusStructure)theEObject;
				T result = caseDeviceStatusStructure(deviceStatusStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.SUBDEVICE_ERROR_MESSAGES_STRUCTURE: {
				SubdeviceErrorMessagesStructure subdeviceErrorMessagesStructure = (SubdeviceErrorMessagesStructure)theEObject;
				T result = caseSubdeviceErrorMessagesStructure(subdeviceErrorMessagesStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.SUBDEVICE_INFORMATION_STRUCTURE: {
				SubdeviceInformationStructure subdeviceInformationStructure = (SubdeviceInformationStructure)theEObject;
				T result = caseSubdeviceInformationStructure(subdeviceInformationStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.SUBDEVICE_STATUS_INFORMATION_STRUCTURE: {
				SubdeviceStatusInformationStructure subdeviceStatusInformationStructure = (SubdeviceStatusInformationStructure)theEObject;
				T result = caseSubdeviceStatusInformationStructure(subdeviceStatusInformationStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Checksum Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Checksum Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChecksumStructure(ChecksumStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Management Service Finalize Update Request Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Management Service Finalize Update Request Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceManagementServiceFinalizeUpdateRequestStructure(DeviceManagementServiceFinalizeUpdateRequestStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Management Service Finalize Update Response Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Management Service Finalize Update Response Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceManagementServiceFinalizeUpdateResponseStructure(DeviceManagementServiceFinalizeUpdateResponseStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Management Service Get All Subdevice Error Messages Response Data Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Management Service Get All Subdevice Error Messages Response Data Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure(DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Management Service Get All Subdevice Error Messages Response Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Management Service Get All Subdevice Error Messages Response Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure(DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Management Service Get All Subdevice Information Response Data Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Management Service Get All Subdevice Information Response Data Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure(DeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Management Service Get All Subdevice Information Response Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Management Service Get All Subdevice Information Response Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceManagementServiceGetAllSubdeviceInformationResponseStructure(DeviceManagementServiceGetAllSubdeviceInformationResponseStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Management Service Get All Subdevice Status Information Response Data Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Management Service Get All Subdevice Status Information Response Data Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure(DeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Management Service Get All Subdevice Status Information Response Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Management Service Get All Subdevice Status Information Response Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure(DeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Management Service Get Device Configuration Response Data Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Management Service Get Device Configuration Response Data Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceManagementServiceGetDeviceConfigurationResponseDataStructure(DeviceManagementServiceGetDeviceConfigurationResponseDataStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Management Service Get Device Configuration Response Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Management Service Get Device Configuration Response Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceManagementServiceGetDeviceConfigurationResponseStructure(DeviceManagementServiceGetDeviceConfigurationResponseStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Management Service Get Device Error Messages Response Data Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Management Service Get Device Error Messages Response Data Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure(DeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Management Service Get Device Error Messages Response Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Management Service Get Device Error Messages Response Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceManagementServiceGetDeviceErrorMessagesResponseStructure(DeviceManagementServiceGetDeviceErrorMessagesResponseStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Management Service Get Device Information Response Data Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Management Service Get Device Information Response Data Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceManagementServiceGetDeviceInformationResponseDataStructure(DeviceManagementServiceGetDeviceInformationResponseDataStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Management Service Get Device Information Response Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Management Service Get Device Information Response Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceManagementServiceGetDeviceInformationResponseStructure(DeviceManagementServiceGetDeviceInformationResponseStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Management Service Get Device Status Information Response Data Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Management Service Get Device Status Information Response Data Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceManagementServiceGetDeviceStatusInformationResponseDataStructure(DeviceManagementServiceGetDeviceStatusInformationResponseDataStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Management Service Get Device Status Information Response Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Management Service Get Device Status Information Response Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceManagementServiceGetDeviceStatusInformationResponseStructure(DeviceManagementServiceGetDeviceStatusInformationResponseStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Management Service Get Device Status Response Data Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Management Service Get Device Status Response Data Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceManagementServiceGetDeviceStatusResponseDataStructure(DeviceManagementServiceGetDeviceStatusResponseDataStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Management Service Get Device Status Response Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Management Service Get Device Status Response Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceManagementServiceGetDeviceStatusResponseStructure(DeviceManagementServiceGetDeviceStatusResponseStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Management Service Get Service Information Response Data Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Management Service Get Service Information Response Data Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceManagementServiceGetServiceInformationResponseDataStructure(DeviceManagementServiceGetServiceInformationResponseDataStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Management Service Get Service Information Response Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Management Service Get Service Information Response Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceManagementServiceGetServiceInformationResponseStructure(DeviceManagementServiceGetServiceInformationResponseStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Management Service Get Service Status Response Data Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Management Service Get Service Status Response Data Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceManagementServiceGetServiceStatusResponseDataStructure(DeviceManagementServiceGetServiceStatusResponseDataStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Management Service Get Service Status Response Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Management Service Get Service Status Response Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceManagementServiceGetServiceStatusResponseStructure(DeviceManagementServiceGetServiceStatusResponseStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Management Service Get Update History Response Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Management Service Get Update History Response Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceManagementServiceGetUpdateHistoryResponseStructure(DeviceManagementServiceGetUpdateHistoryResponseStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Management Service Install Update Request Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Management Service Install Update Request Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceManagementServiceInstallUpdateRequestStructure(DeviceManagementServiceInstallUpdateRequestStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Management Service Install Update Response Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Management Service Install Update Response Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceManagementServiceInstallUpdateResponseStructure(DeviceManagementServiceInstallUpdateResponseStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Management Service Retrieve Update State Request Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Management Service Retrieve Update State Request Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceManagementServiceRetrieveUpdateStateRequestStructure(DeviceManagementServiceRetrieveUpdateStateRequestStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Management Service Retrieve Update State Response Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Management Service Retrieve Update State Response Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceManagementServiceRetrieveUpdateStateResponseStructure(DeviceManagementServiceRetrieveUpdateStateResponseStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Management Service Update History Entry Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Management Service Update History Entry Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceManagementServiceUpdateHistoryEntryStructure(DeviceManagementServiceUpdateHistoryEntryStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Management Service Update History Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Management Service Update History Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceManagementServiceUpdateHistoryStructure(DeviceManagementServiceUpdateHistoryStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Management Service Update State Data Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Management Service Update State Data Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceManagementServiceUpdateStateDataStructure(DeviceManagementServiceUpdateStateDataStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Status Information Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Status Information Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceStatusInformationStructure(DeviceStatusInformationStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Status Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Status Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceStatusStructure(DeviceStatusStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subdevice Error Messages Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subdevice Error Messages Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubdeviceErrorMessagesStructure(SubdeviceErrorMessagesStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subdevice Information Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subdevice Information Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubdeviceInformationStructure(SubdeviceInformationStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subdevice Status Information Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subdevice Status Information Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubdeviceStatusInformationStructure(SubdeviceStatusInformationStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Response Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Response Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralResponseStructure(GeneralResponseStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //IbisDeviceManagementServiceSwitch
