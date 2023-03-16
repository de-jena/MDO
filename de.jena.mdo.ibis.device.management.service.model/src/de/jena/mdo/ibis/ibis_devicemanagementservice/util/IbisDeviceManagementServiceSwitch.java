/**
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice.util;

import de.jena.mdo.ibis.ibis_common.GeneralResponse;

import de.jena.mdo.ibis.ibis_devicemanagementservice.*;

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
 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage
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
			case IbisDeviceManagementServicePackage.CHECKSUM: {
				Checksum checksum = (Checksum)theEObject;
				T result = caseChecksum(checksum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.FINALIZE_UPDATE_REQUEST: {
				FinalizeUpdateRequest finalizeUpdateRequest = (FinalizeUpdateRequest)theEObject;
				T result = caseFinalizeUpdateRequest(finalizeUpdateRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.FINALIZE_UPDATE_RESPONSE: {
				FinalizeUpdateResponse finalizeUpdateResponse = (FinalizeUpdateResponse)theEObject;
				T result = caseFinalizeUpdateResponse(finalizeUpdateResponse);
				if (result == null) result = caseGeneralResponse(finalizeUpdateResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.ALL_SUBDEVICE_ERROR_MESSAGES_DATA: {
				AllSubdeviceErrorMessagesData allSubdeviceErrorMessagesData = (AllSubdeviceErrorMessagesData)theEObject;
				T result = caseAllSubdeviceErrorMessagesData(allSubdeviceErrorMessagesData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE: {
				AllSubdeviceErrorMessagesResponse allSubdeviceErrorMessagesResponse = (AllSubdeviceErrorMessagesResponse)theEObject;
				T result = caseAllSubdeviceErrorMessagesResponse(allSubdeviceErrorMessagesResponse);
				if (result == null) result = caseGeneralResponse(allSubdeviceErrorMessagesResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.ALL_SUBDEVICE_INFORMATION_DATA: {
				AllSubdeviceInformationData allSubdeviceInformationData = (AllSubdeviceInformationData)theEObject;
				T result = caseAllSubdeviceInformationData(allSubdeviceInformationData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.ALL_SUBDEVICE_INFORMATION_RESPONSE: {
				AllSubdeviceInformationResponse allSubdeviceInformationResponse = (AllSubdeviceInformationResponse)theEObject;
				T result = caseAllSubdeviceInformationResponse(allSubdeviceInformationResponse);
				if (result == null) result = caseGeneralResponse(allSubdeviceInformationResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.ALL_SUBDEVICE_STATUS_INFORMATION_DATA: {
				AllSubdeviceStatusInformationData allSubdeviceStatusInformationData = (AllSubdeviceStatusInformationData)theEObject;
				T result = caseAllSubdeviceStatusInformationData(allSubdeviceStatusInformationData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE: {
				AllSubdeviceStatusInformationResponse allSubdeviceStatusInformationResponse = (AllSubdeviceStatusInformationResponse)theEObject;
				T result = caseAllSubdeviceStatusInformationResponse(allSubdeviceStatusInformationResponse);
				if (result == null) result = caseGeneralResponse(allSubdeviceStatusInformationResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.DEVICE_CONFIGURATION_DATA: {
				DeviceConfigurationData deviceConfigurationData = (DeviceConfigurationData)theEObject;
				T result = caseDeviceConfigurationData(deviceConfigurationData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.DEVICE_CONFIGURATION_RESPONSE: {
				DeviceConfigurationResponse deviceConfigurationResponse = (DeviceConfigurationResponse)theEObject;
				T result = caseDeviceConfigurationResponse(deviceConfigurationResponse);
				if (result == null) result = caseGeneralResponse(deviceConfigurationResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.DEVICE_ERROR_MESSAGES_DATA: {
				DeviceErrorMessagesData deviceErrorMessagesData = (DeviceErrorMessagesData)theEObject;
				T result = caseDeviceErrorMessagesData(deviceErrorMessagesData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.DEVICE_ERROR_MESSAGES_RESPONSE: {
				DeviceErrorMessagesResponse deviceErrorMessagesResponse = (DeviceErrorMessagesResponse)theEObject;
				T result = caseDeviceErrorMessagesResponse(deviceErrorMessagesResponse);
				if (result == null) result = caseGeneralResponse(deviceErrorMessagesResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.DEVICE_INFORMATION_DATA: {
				DeviceInformationData deviceInformationData = (DeviceInformationData)theEObject;
				T result = caseDeviceInformationData(deviceInformationData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.DEVICE_INFORMATION_RESPONSE: {
				DeviceInformationResponse deviceInformationResponse = (DeviceInformationResponse)theEObject;
				T result = caseDeviceInformationResponse(deviceInformationResponse);
				if (result == null) result = caseGeneralResponse(deviceInformationResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION_DATA: {
				DeviceStatusInformationData deviceStatusInformationData = (DeviceStatusInformationData)theEObject;
				T result = caseDeviceStatusInformationData(deviceStatusInformationData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION_RESPONSE: {
				DeviceStatusInformationResponse deviceStatusInformationResponse = (DeviceStatusInformationResponse)theEObject;
				T result = caseDeviceStatusInformationResponse(deviceStatusInformationResponse);
				if (result == null) result = caseGeneralResponse(deviceStatusInformationResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.DEVICE_STATUS_DATA: {
				DeviceStatusData deviceStatusData = (DeviceStatusData)theEObject;
				T result = caseDeviceStatusData(deviceStatusData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.DEVICE_STATUS_RESPONSE: {
				DeviceStatusResponse deviceStatusResponse = (DeviceStatusResponse)theEObject;
				T result = caseDeviceStatusResponse(deviceStatusResponse);
				if (result == null) result = caseGeneralResponse(deviceStatusResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.SERVICE_INFORMATION_DATA: {
				ServiceInformationData serviceInformationData = (ServiceInformationData)theEObject;
				T result = caseServiceInformationData(serviceInformationData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.SERVICE_INFORMATION_RESPONSE: {
				ServiceInformationResponse serviceInformationResponse = (ServiceInformationResponse)theEObject;
				T result = caseServiceInformationResponse(serviceInformationResponse);
				if (result == null) result = caseGeneralResponse(serviceInformationResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.SERVICE_STATUS_DATA: {
				ServiceStatusData serviceStatusData = (ServiceStatusData)theEObject;
				T result = caseServiceStatusData(serviceStatusData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.SERVICE_STATUS_RESPONSE: {
				ServiceStatusResponse serviceStatusResponse = (ServiceStatusResponse)theEObject;
				T result = caseServiceStatusResponse(serviceStatusResponse);
				if (result == null) result = caseGeneralResponse(serviceStatusResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.UPDATE_HISTORY_RESPONSE: {
				UpdateHistoryResponse updateHistoryResponse = (UpdateHistoryResponse)theEObject;
				T result = caseUpdateHistoryResponse(updateHistoryResponse);
				if (result == null) result = caseGeneralResponse(updateHistoryResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.INSTALL_UPDATE_REQUEST: {
				InstallUpdateRequest installUpdateRequest = (InstallUpdateRequest)theEObject;
				T result = caseInstallUpdateRequest(installUpdateRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.INSTALL_UPDATE_RESPONSE: {
				InstallUpdateResponse installUpdateResponse = (InstallUpdateResponse)theEObject;
				T result = caseInstallUpdateResponse(installUpdateResponse);
				if (result == null) result = caseGeneralResponse(installUpdateResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.RETRIEVE_UPDATE_STATE_REQUEST: {
				RetrieveUpdateStateRequest retrieveUpdateStateRequest = (RetrieveUpdateStateRequest)theEObject;
				T result = caseRetrieveUpdateStateRequest(retrieveUpdateStateRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.RETRIEVE_UPDATE_STATE_RESPONSE: {
				RetrieveUpdateStateResponse retrieveUpdateStateResponse = (RetrieveUpdateStateResponse)theEObject;
				T result = caseRetrieveUpdateStateResponse(retrieveUpdateStateResponse);
				if (result == null) result = caseGeneralResponse(retrieveUpdateStateResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.UPDATE_HISTORY_ENTRY: {
				UpdateHistoryEntry updateHistoryEntry = (UpdateHistoryEntry)theEObject;
				T result = caseUpdateHistoryEntry(updateHistoryEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.UPDATE_HISTORY: {
				UpdateHistory updateHistory = (UpdateHistory)theEObject;
				T result = caseUpdateHistory(updateHistory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.UPDATE_STATE_DATA: {
				UpdateStateData updateStateData = (UpdateStateData)theEObject;
				T result = caseUpdateStateData(updateStateData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION: {
				DeviceStatusInformation deviceStatusInformation = (DeviceStatusInformation)theEObject;
				T result = caseDeviceStatusInformation(deviceStatusInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.DEVICE_STATUS: {
				DeviceStatus deviceStatus = (DeviceStatus)theEObject;
				T result = caseDeviceStatus(deviceStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.SUBDEVICE_ERROR_MESSAGES: {
				SubdeviceErrorMessages subdeviceErrorMessages = (SubdeviceErrorMessages)theEObject;
				T result = caseSubdeviceErrorMessages(subdeviceErrorMessages);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.SUBDEVICE_INFORMATION: {
				SubdeviceInformation subdeviceInformation = (SubdeviceInformation)theEObject;
				T result = caseSubdeviceInformation(subdeviceInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisDeviceManagementServicePackage.SUBDEVICE_STATUS_INFORMATION: {
				SubdeviceStatusInformation subdeviceStatusInformation = (SubdeviceStatusInformation)theEObject;
				T result = caseSubdeviceStatusInformation(subdeviceStatusInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Checksum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Checksum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChecksum(Checksum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Finalize Update Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Finalize Update Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinalizeUpdateRequest(FinalizeUpdateRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Finalize Update Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Finalize Update Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinalizeUpdateResponse(FinalizeUpdateResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>All Subdevice Error Messages Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>All Subdevice Error Messages Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllSubdeviceErrorMessagesData(AllSubdeviceErrorMessagesData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>All Subdevice Error Messages Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>All Subdevice Error Messages Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllSubdeviceErrorMessagesResponse(AllSubdeviceErrorMessagesResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>All Subdevice Information Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>All Subdevice Information Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllSubdeviceInformationData(AllSubdeviceInformationData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>All Subdevice Information Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>All Subdevice Information Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllSubdeviceInformationResponse(AllSubdeviceInformationResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>All Subdevice Status Information Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>All Subdevice Status Information Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllSubdeviceStatusInformationData(AllSubdeviceStatusInformationData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>All Subdevice Status Information Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>All Subdevice Status Information Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllSubdeviceStatusInformationResponse(AllSubdeviceStatusInformationResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Configuration Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Configuration Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceConfigurationData(DeviceConfigurationData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Configuration Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Configuration Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceConfigurationResponse(DeviceConfigurationResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Error Messages Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Error Messages Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceErrorMessagesData(DeviceErrorMessagesData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Error Messages Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Error Messages Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceErrorMessagesResponse(DeviceErrorMessagesResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Information Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Information Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceInformationData(DeviceInformationData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Information Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Information Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceInformationResponse(DeviceInformationResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Status Information Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Status Information Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceStatusInformationData(DeviceStatusInformationData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Status Information Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Status Information Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceStatusInformationResponse(DeviceStatusInformationResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Status Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Status Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceStatusData(DeviceStatusData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Status Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Status Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceStatusResponse(DeviceStatusResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Information Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Information Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceInformationData(ServiceInformationData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Information Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Information Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceInformationResponse(ServiceInformationResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Status Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Status Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceStatusData(ServiceStatusData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Status Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Status Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceStatusResponse(ServiceStatusResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update History Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update History Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateHistoryResponse(UpdateHistoryResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Install Update Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Install Update Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstallUpdateRequest(InstallUpdateRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Install Update Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Install Update Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstallUpdateResponse(InstallUpdateResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Retrieve Update State Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Retrieve Update State Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRetrieveUpdateStateRequest(RetrieveUpdateStateRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Retrieve Update State Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Retrieve Update State Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRetrieveUpdateStateResponse(RetrieveUpdateStateResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update History Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update History Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateHistoryEntry(UpdateHistoryEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateHistory(UpdateHistory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update State Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update State Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateStateData(UpdateStateData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Status Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Status Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceStatusInformation(DeviceStatusInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceStatus(DeviceStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subdevice Error Messages</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subdevice Error Messages</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubdeviceErrorMessages(SubdeviceErrorMessages object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subdevice Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subdevice Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubdeviceInformation(SubdeviceInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subdevice Status Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subdevice Status Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubdeviceStatusInformation(SubdeviceStatusInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralResponse(GeneralResponse object) {
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
