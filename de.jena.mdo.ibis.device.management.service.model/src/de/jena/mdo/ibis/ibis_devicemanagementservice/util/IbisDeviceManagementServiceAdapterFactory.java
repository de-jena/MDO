/**
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice.util;

import de.jena.mdo.ibis.ibis_common.GeneralResponse;

import de.jena.mdo.ibis.ibis_devicemanagementservice.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage
 * @generated
 */
public class IbisDeviceManagementServiceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IbisDeviceManagementServicePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IbisDeviceManagementServiceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IbisDeviceManagementServicePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IbisDeviceManagementServiceSwitch<Adapter> modelSwitch =
		new IbisDeviceManagementServiceSwitch<Adapter>() {
			@Override
			public Adapter caseChecksum(Checksum object) {
				return createChecksumAdapter();
			}
			@Override
			public Adapter caseFinalizeUpdateRequest(FinalizeUpdateRequest object) {
				return createFinalizeUpdateRequestAdapter();
			}
			@Override
			public Adapter caseFinalizeUpdateResponse(FinalizeUpdateResponse object) {
				return createFinalizeUpdateResponseAdapter();
			}
			@Override
			public Adapter caseAllSubdeviceErrorMessagesData(AllSubdeviceErrorMessagesData object) {
				return createAllSubdeviceErrorMessagesDataAdapter();
			}
			@Override
			public Adapter caseAllSubdeviceErrorMessagesResponse(AllSubdeviceErrorMessagesResponse object) {
				return createAllSubdeviceErrorMessagesResponseAdapter();
			}
			@Override
			public Adapter caseAllSubdeviceInformationData(AllSubdeviceInformationData object) {
				return createAllSubdeviceInformationDataAdapter();
			}
			@Override
			public Adapter caseAllSubdeviceInformationResponse(AllSubdeviceInformationResponse object) {
				return createAllSubdeviceInformationResponseAdapter();
			}
			@Override
			public Adapter caseAllSubdeviceStatusInformationData(AllSubdeviceStatusInformationData object) {
				return createAllSubdeviceStatusInformationDataAdapter();
			}
			@Override
			public Adapter caseAllSubdeviceStatusInformationResponse(AllSubdeviceStatusInformationResponse object) {
				return createAllSubdeviceStatusInformationResponseAdapter();
			}
			@Override
			public Adapter caseDeviceConfigurationData(DeviceConfigurationData object) {
				return createDeviceConfigurationDataAdapter();
			}
			@Override
			public Adapter caseDeviceConfigurationResponse(DeviceConfigurationResponse object) {
				return createDeviceConfigurationResponseAdapter();
			}
			@Override
			public Adapter caseDeviceErrorMessagesData(DeviceErrorMessagesData object) {
				return createDeviceErrorMessagesDataAdapter();
			}
			@Override
			public Adapter caseDeviceErrorMessagesResponse(DeviceErrorMessagesResponse object) {
				return createDeviceErrorMessagesResponseAdapter();
			}
			@Override
			public Adapter caseDeviceInformationData(DeviceInformationData object) {
				return createDeviceInformationDataAdapter();
			}
			@Override
			public Adapter caseDeviceInformationResponse(DeviceInformationResponse object) {
				return createDeviceInformationResponseAdapter();
			}
			@Override
			public Adapter caseDeviceStatusInformationData(DeviceStatusInformationData object) {
				return createDeviceStatusInformationDataAdapter();
			}
			@Override
			public Adapter caseDeviceStatusInformationResponse(DeviceStatusInformationResponse object) {
				return createDeviceStatusInformationResponseAdapter();
			}
			@Override
			public Adapter caseDeviceStatusData(DeviceStatusData object) {
				return createDeviceStatusDataAdapter();
			}
			@Override
			public Adapter caseDeviceStatusResponse(DeviceStatusResponse object) {
				return createDeviceStatusResponseAdapter();
			}
			@Override
			public Adapter caseServiceInformationData(ServiceInformationData object) {
				return createServiceInformationDataAdapter();
			}
			@Override
			public Adapter caseServiceInformationResponse(ServiceInformationResponse object) {
				return createServiceInformationResponseAdapter();
			}
			@Override
			public Adapter caseServiceStatusData(ServiceStatusData object) {
				return createServiceStatusDataAdapter();
			}
			@Override
			public Adapter caseServiceStatusResponse(ServiceStatusResponse object) {
				return createServiceStatusResponseAdapter();
			}
			@Override
			public Adapter caseUpdateHistoryResponse(UpdateHistoryResponse object) {
				return createUpdateHistoryResponseAdapter();
			}
			@Override
			public Adapter caseInstallUpdateRequest(InstallUpdateRequest object) {
				return createInstallUpdateRequestAdapter();
			}
			@Override
			public Adapter caseInstallUpdateResponse(InstallUpdateResponse object) {
				return createInstallUpdateResponseAdapter();
			}
			@Override
			public Adapter caseRetrieveUpdateStateRequest(RetrieveUpdateStateRequest object) {
				return createRetrieveUpdateStateRequestAdapter();
			}
			@Override
			public Adapter caseRetrieveUpdateStateResponse(RetrieveUpdateStateResponse object) {
				return createRetrieveUpdateStateResponseAdapter();
			}
			@Override
			public Adapter caseUpdateHistoryEntry(UpdateHistoryEntry object) {
				return createUpdateHistoryEntryAdapter();
			}
			@Override
			public Adapter caseUpdateHistory(UpdateHistory object) {
				return createUpdateHistoryAdapter();
			}
			@Override
			public Adapter caseUpdateStateData(UpdateStateData object) {
				return createUpdateStateDataAdapter();
			}
			@Override
			public Adapter caseDeviceStatusInformation(DeviceStatusInformation object) {
				return createDeviceStatusInformationAdapter();
			}
			@Override
			public Adapter caseDeviceStatus(DeviceStatus object) {
				return createDeviceStatusAdapter();
			}
			@Override
			public Adapter caseSubdeviceErrorMessages(SubdeviceErrorMessages object) {
				return createSubdeviceErrorMessagesAdapter();
			}
			@Override
			public Adapter caseSubdeviceInformation(SubdeviceInformation object) {
				return createSubdeviceInformationAdapter();
			}
			@Override
			public Adapter caseSubdeviceStatusInformation(SubdeviceStatusInformation object) {
				return createSubdeviceStatusInformationAdapter();
			}
			@Override
			public Adapter caseGeneralResponse(GeneralResponse object) {
				return createGeneralResponseAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.Checksum <em>Checksum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.Checksum
	 * @generated
	 */
	public Adapter createChecksumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.FinalizeUpdateRequest <em>Finalize Update Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.FinalizeUpdateRequest
	 * @generated
	 */
	public Adapter createFinalizeUpdateRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.FinalizeUpdateResponse <em>Finalize Update Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.FinalizeUpdateResponse
	 * @generated
	 */
	public Adapter createFinalizeUpdateResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceErrorMessagesData <em>All Subdevice Error Messages Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceErrorMessagesData
	 * @generated
	 */
	public Adapter createAllSubdeviceErrorMessagesDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceErrorMessagesResponse <em>All Subdevice Error Messages Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceErrorMessagesResponse
	 * @generated
	 */
	public Adapter createAllSubdeviceErrorMessagesResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceInformationData <em>All Subdevice Information Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceInformationData
	 * @generated
	 */
	public Adapter createAllSubdeviceInformationDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceInformationResponse <em>All Subdevice Information Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceInformationResponse
	 * @generated
	 */
	public Adapter createAllSubdeviceInformationResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceStatusInformationData <em>All Subdevice Status Information Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceStatusInformationData
	 * @generated
	 */
	public Adapter createAllSubdeviceStatusInformationDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceStatusInformationResponse <em>All Subdevice Status Information Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceStatusInformationResponse
	 * @generated
	 */
	public Adapter createAllSubdeviceStatusInformationResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceConfigurationData <em>Device Configuration Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceConfigurationData
	 * @generated
	 */
	public Adapter createDeviceConfigurationDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceConfigurationResponse <em>Device Configuration Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceConfigurationResponse
	 * @generated
	 */
	public Adapter createDeviceConfigurationResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceErrorMessagesData <em>Device Error Messages Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceErrorMessagesData
	 * @generated
	 */
	public Adapter createDeviceErrorMessagesDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceErrorMessagesResponse <em>Device Error Messages Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceErrorMessagesResponse
	 * @generated
	 */
	public Adapter createDeviceErrorMessagesResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceInformationData <em>Device Information Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceInformationData
	 * @generated
	 */
	public Adapter createDeviceInformationDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceInformationResponse <em>Device Information Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceInformationResponse
	 * @generated
	 */
	public Adapter createDeviceInformationResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusInformationData <em>Device Status Information Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusInformationData
	 * @generated
	 */
	public Adapter createDeviceStatusInformationDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusInformationResponse <em>Device Status Information Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusInformationResponse
	 * @generated
	 */
	public Adapter createDeviceStatusInformationResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusData <em>Device Status Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusData
	 * @generated
	 */
	public Adapter createDeviceStatusDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusResponse <em>Device Status Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusResponse
	 * @generated
	 */
	public Adapter createDeviceStatusResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceInformationData <em>Service Information Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceInformationData
	 * @generated
	 */
	public Adapter createServiceInformationDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceInformationResponse <em>Service Information Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceInformationResponse
	 * @generated
	 */
	public Adapter createServiceInformationResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceStatusData <em>Service Status Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceStatusData
	 * @generated
	 */
	public Adapter createServiceStatusDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceStatusResponse <em>Service Status Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceStatusResponse
	 * @generated
	 */
	public Adapter createServiceStatusResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistoryResponse <em>Update History Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistoryResponse
	 * @generated
	 */
	public Adapter createUpdateHistoryResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.InstallUpdateRequest <em>Install Update Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.InstallUpdateRequest
	 * @generated
	 */
	public Adapter createInstallUpdateRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.InstallUpdateResponse <em>Install Update Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.InstallUpdateResponse
	 * @generated
	 */
	public Adapter createInstallUpdateResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.RetrieveUpdateStateRequest <em>Retrieve Update State Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.RetrieveUpdateStateRequest
	 * @generated
	 */
	public Adapter createRetrieveUpdateStateRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.RetrieveUpdateStateResponse <em>Retrieve Update State Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.RetrieveUpdateStateResponse
	 * @generated
	 */
	public Adapter createRetrieveUpdateStateResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistoryEntry <em>Update History Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistoryEntry
	 * @generated
	 */
	public Adapter createUpdateHistoryEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistory <em>Update History</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistory
	 * @generated
	 */
	public Adapter createUpdateHistoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateStateData <em>Update State Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateStateData
	 * @generated
	 */
	public Adapter createUpdateStateDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusInformation <em>Device Status Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusInformation
	 * @generated
	 */
	public Adapter createDeviceStatusInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatus <em>Device Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatus
	 * @generated
	 */
	public Adapter createDeviceStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.SubdeviceErrorMessages <em>Subdevice Error Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.SubdeviceErrorMessages
	 * @generated
	 */
	public Adapter createSubdeviceErrorMessagesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.SubdeviceInformation <em>Subdevice Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.SubdeviceInformation
	 * @generated
	 */
	public Adapter createSubdeviceInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_devicemanagementservice.SubdeviceStatusInformation <em>Subdevice Status Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.SubdeviceStatusInformation
	 * @generated
	 */
	public Adapter createSubdeviceStatusInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.GeneralResponse <em>General Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.GeneralResponse
	 * @generated
	 */
	public Adapter createGeneralResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //IbisDeviceManagementServiceAdapterFactory
