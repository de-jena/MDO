/**
 */
package de.jena.mdo.ibis.devicemanagementservice.util;

import de.jena.mdo.ibis.devicemanagementservice.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.mdo.ibis.devicemanagementservice.IbisDeviceManagementServicePackage
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
			public Adapter caseChecksumStructure(ChecksumStructure object) {
				return createChecksumStructureAdapter();
			}
			@Override
			public Adapter caseDeviceManagementServiceFinalizeUpdateRequestStructure(DeviceManagementServiceFinalizeUpdateRequestStructure object) {
				return createDeviceManagementServiceFinalizeUpdateRequestStructureAdapter();
			}
			@Override
			public Adapter caseDeviceManagementServiceFinalizeUpdateResponseStructure(DeviceManagementServiceFinalizeUpdateResponseStructure object) {
				return createDeviceManagementServiceFinalizeUpdateResponseStructureAdapter();
			}
			@Override
			public Adapter caseDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure(DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure object) {
				return createDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructureAdapter();
			}
			@Override
			public Adapter caseDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure(DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure object) {
				return createDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructureAdapter();
			}
			@Override
			public Adapter caseDeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure(DeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure object) {
				return createDeviceManagementServiceGetAllSubdeviceInformationResponseDataStructureAdapter();
			}
			@Override
			public Adapter caseDeviceManagementServiceGetAllSubdeviceInformationResponseStructure(DeviceManagementServiceGetAllSubdeviceInformationResponseStructure object) {
				return createDeviceManagementServiceGetAllSubdeviceInformationResponseStructureAdapter();
			}
			@Override
			public Adapter caseDeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure(DeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure object) {
				return createDeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructureAdapter();
			}
			@Override
			public Adapter caseDeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure(DeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure object) {
				return createDeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructureAdapter();
			}
			@Override
			public Adapter caseDeviceManagementServiceGetDeviceConfigurationResponseDataStructure(DeviceManagementServiceGetDeviceConfigurationResponseDataStructure object) {
				return createDeviceManagementServiceGetDeviceConfigurationResponseDataStructureAdapter();
			}
			@Override
			public Adapter caseDeviceManagementServiceGetDeviceConfigurationResponseStructure(DeviceManagementServiceGetDeviceConfigurationResponseStructure object) {
				return createDeviceManagementServiceGetDeviceConfigurationResponseStructureAdapter();
			}
			@Override
			public Adapter caseDeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure(DeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure object) {
				return createDeviceManagementServiceGetDeviceErrorMessagesResponseDataStructureAdapter();
			}
			@Override
			public Adapter caseDeviceManagementServiceGetDeviceErrorMessagesResponseStructure(DeviceManagementServiceGetDeviceErrorMessagesResponseStructure object) {
				return createDeviceManagementServiceGetDeviceErrorMessagesResponseStructureAdapter();
			}
			@Override
			public Adapter caseDeviceManagementServiceGetDeviceInformationResponseDataStructure(DeviceManagementServiceGetDeviceInformationResponseDataStructure object) {
				return createDeviceManagementServiceGetDeviceInformationResponseDataStructureAdapter();
			}
			@Override
			public Adapter caseDeviceManagementServiceGetDeviceInformationResponseStructure(DeviceManagementServiceGetDeviceInformationResponseStructure object) {
				return createDeviceManagementServiceGetDeviceInformationResponseStructureAdapter();
			}
			@Override
			public Adapter caseDeviceManagementServiceGetDeviceStatusInformationResponseDataStructure(DeviceManagementServiceGetDeviceStatusInformationResponseDataStructure object) {
				return createDeviceManagementServiceGetDeviceStatusInformationResponseDataStructureAdapter();
			}
			@Override
			public Adapter caseDeviceManagementServiceGetDeviceStatusInformationResponseStructure(DeviceManagementServiceGetDeviceStatusInformationResponseStructure object) {
				return createDeviceManagementServiceGetDeviceStatusInformationResponseStructureAdapter();
			}
			@Override
			public Adapter caseDeviceManagementServiceGetDeviceStatusResponseDataStructure(DeviceManagementServiceGetDeviceStatusResponseDataStructure object) {
				return createDeviceManagementServiceGetDeviceStatusResponseDataStructureAdapter();
			}
			@Override
			public Adapter caseDeviceManagementServiceGetDeviceStatusResponseStructure(DeviceManagementServiceGetDeviceStatusResponseStructure object) {
				return createDeviceManagementServiceGetDeviceStatusResponseStructureAdapter();
			}
			@Override
			public Adapter caseDeviceManagementServiceGetServiceInformationResponseDataStructure(DeviceManagementServiceGetServiceInformationResponseDataStructure object) {
				return createDeviceManagementServiceGetServiceInformationResponseDataStructureAdapter();
			}
			@Override
			public Adapter caseDeviceManagementServiceGetServiceInformationResponseStructure(DeviceManagementServiceGetServiceInformationResponseStructure object) {
				return createDeviceManagementServiceGetServiceInformationResponseStructureAdapter();
			}
			@Override
			public Adapter caseDeviceManagementServiceGetServiceStatusResponseDataStructure(DeviceManagementServiceGetServiceStatusResponseDataStructure object) {
				return createDeviceManagementServiceGetServiceStatusResponseDataStructureAdapter();
			}
			@Override
			public Adapter caseDeviceManagementServiceGetServiceStatusResponseStructure(DeviceManagementServiceGetServiceStatusResponseStructure object) {
				return createDeviceManagementServiceGetServiceStatusResponseStructureAdapter();
			}
			@Override
			public Adapter caseDeviceManagementServiceGetUpdateHistoryResponseStructure(DeviceManagementServiceGetUpdateHistoryResponseStructure object) {
				return createDeviceManagementServiceGetUpdateHistoryResponseStructureAdapter();
			}
			@Override
			public Adapter caseDeviceManagementServiceInstallUpdateRequestStructure(DeviceManagementServiceInstallUpdateRequestStructure object) {
				return createDeviceManagementServiceInstallUpdateRequestStructureAdapter();
			}
			@Override
			public Adapter caseDeviceManagementServiceInstallUpdateResponseStructure(DeviceManagementServiceInstallUpdateResponseStructure object) {
				return createDeviceManagementServiceInstallUpdateResponseStructureAdapter();
			}
			@Override
			public Adapter caseDeviceManagementServiceRetrieveUpdateStateRequestStructure(DeviceManagementServiceRetrieveUpdateStateRequestStructure object) {
				return createDeviceManagementServiceRetrieveUpdateStateRequestStructureAdapter();
			}
			@Override
			public Adapter caseDeviceManagementServiceRetrieveUpdateStateResponseStructure(DeviceManagementServiceRetrieveUpdateStateResponseStructure object) {
				return createDeviceManagementServiceRetrieveUpdateStateResponseStructureAdapter();
			}
			@Override
			public Adapter caseDeviceManagementServiceUpdateHistoryEntryStructure(DeviceManagementServiceUpdateHistoryEntryStructure object) {
				return createDeviceManagementServiceUpdateHistoryEntryStructureAdapter();
			}
			@Override
			public Adapter caseDeviceManagementServiceUpdateHistoryStructure(DeviceManagementServiceUpdateHistoryStructure object) {
				return createDeviceManagementServiceUpdateHistoryStructureAdapter();
			}
			@Override
			public Adapter caseDeviceManagementServiceUpdateStateDataStructure(DeviceManagementServiceUpdateStateDataStructure object) {
				return createDeviceManagementServiceUpdateStateDataStructureAdapter();
			}
			@Override
			public Adapter caseDeviceStatusInformationStructure(DeviceStatusInformationStructure object) {
				return createDeviceStatusInformationStructureAdapter();
			}
			@Override
			public Adapter caseDeviceStatusStructure(DeviceStatusStructure object) {
				return createDeviceStatusStructureAdapter();
			}
			@Override
			public Adapter caseSubdeviceErrorMessagesStructure(SubdeviceErrorMessagesStructure object) {
				return createSubdeviceErrorMessagesStructureAdapter();
			}
			@Override
			public Adapter caseSubdeviceInformationStructure(SubdeviceInformationStructure object) {
				return createSubdeviceInformationStructureAdapter();
			}
			@Override
			public Adapter caseSubdeviceStatusInformationStructure(SubdeviceStatusInformationStructure object) {
				return createSubdeviceStatusInformationStructureAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.devicemanagementservice.ChecksumStructure <em>Checksum Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.devicemanagementservice.ChecksumStructure
	 * @generated
	 */
	public Adapter createChecksumStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceFinalizeUpdateRequestStructure <em>Device Management Service Finalize Update Request Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceFinalizeUpdateRequestStructure
	 * @generated
	 */
	public Adapter createDeviceManagementServiceFinalizeUpdateRequestStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceFinalizeUpdateResponseStructure <em>Device Management Service Finalize Update Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceFinalizeUpdateResponseStructure
	 * @generated
	 */
	public Adapter createDeviceManagementServiceFinalizeUpdateResponseStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure <em>Device Management Service Get All Subdevice Error Messages Response Data Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure
	 * @generated
	 */
	public Adapter createDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure <em>Device Management Service Get All Subdevice Error Messages Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure
	 * @generated
	 */
	public Adapter createDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure <em>Device Management Service Get All Subdevice Information Response Data Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure
	 * @generated
	 */
	public Adapter createDeviceManagementServiceGetAllSubdeviceInformationResponseDataStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceInformationResponseStructure <em>Device Management Service Get All Subdevice Information Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceInformationResponseStructure
	 * @generated
	 */
	public Adapter createDeviceManagementServiceGetAllSubdeviceInformationResponseStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure <em>Device Management Service Get All Subdevice Status Information Response Data Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure
	 * @generated
	 */
	public Adapter createDeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure <em>Device Management Service Get All Subdevice Status Information Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure
	 * @generated
	 */
	public Adapter createDeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceConfigurationResponseDataStructure <em>Device Management Service Get Device Configuration Response Data Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceConfigurationResponseDataStructure
	 * @generated
	 */
	public Adapter createDeviceManagementServiceGetDeviceConfigurationResponseDataStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceConfigurationResponseStructure <em>Device Management Service Get Device Configuration Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceConfigurationResponseStructure
	 * @generated
	 */
	public Adapter createDeviceManagementServiceGetDeviceConfigurationResponseStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure <em>Device Management Service Get Device Error Messages Response Data Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure
	 * @generated
	 */
	public Adapter createDeviceManagementServiceGetDeviceErrorMessagesResponseDataStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceErrorMessagesResponseStructure <em>Device Management Service Get Device Error Messages Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceErrorMessagesResponseStructure
	 * @generated
	 */
	public Adapter createDeviceManagementServiceGetDeviceErrorMessagesResponseStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceInformationResponseDataStructure <em>Device Management Service Get Device Information Response Data Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceInformationResponseDataStructure
	 * @generated
	 */
	public Adapter createDeviceManagementServiceGetDeviceInformationResponseDataStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceInformationResponseStructure <em>Device Management Service Get Device Information Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceInformationResponseStructure
	 * @generated
	 */
	public Adapter createDeviceManagementServiceGetDeviceInformationResponseStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceStatusInformationResponseDataStructure <em>Device Management Service Get Device Status Information Response Data Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceStatusInformationResponseDataStructure
	 * @generated
	 */
	public Adapter createDeviceManagementServiceGetDeviceStatusInformationResponseDataStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceStatusInformationResponseStructure <em>Device Management Service Get Device Status Information Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceStatusInformationResponseStructure
	 * @generated
	 */
	public Adapter createDeviceManagementServiceGetDeviceStatusInformationResponseStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceStatusResponseDataStructure <em>Device Management Service Get Device Status Response Data Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceStatusResponseDataStructure
	 * @generated
	 */
	public Adapter createDeviceManagementServiceGetDeviceStatusResponseDataStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceStatusResponseStructure <em>Device Management Service Get Device Status Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceStatusResponseStructure
	 * @generated
	 */
	public Adapter createDeviceManagementServiceGetDeviceStatusResponseStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetServiceInformationResponseDataStructure <em>Device Management Service Get Service Information Response Data Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetServiceInformationResponseDataStructure
	 * @generated
	 */
	public Adapter createDeviceManagementServiceGetServiceInformationResponseDataStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetServiceInformationResponseStructure <em>Device Management Service Get Service Information Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetServiceInformationResponseStructure
	 * @generated
	 */
	public Adapter createDeviceManagementServiceGetServiceInformationResponseStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetServiceStatusResponseDataStructure <em>Device Management Service Get Service Status Response Data Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetServiceStatusResponseDataStructure
	 * @generated
	 */
	public Adapter createDeviceManagementServiceGetServiceStatusResponseDataStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetServiceStatusResponseStructure <em>Device Management Service Get Service Status Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetServiceStatusResponseStructure
	 * @generated
	 */
	public Adapter createDeviceManagementServiceGetServiceStatusResponseStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetUpdateHistoryResponseStructure <em>Device Management Service Get Update History Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetUpdateHistoryResponseStructure
	 * @generated
	 */
	public Adapter createDeviceManagementServiceGetUpdateHistoryResponseStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceInstallUpdateRequestStructure <em>Device Management Service Install Update Request Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceInstallUpdateRequestStructure
	 * @generated
	 */
	public Adapter createDeviceManagementServiceInstallUpdateRequestStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceInstallUpdateResponseStructure <em>Device Management Service Install Update Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceInstallUpdateResponseStructure
	 * @generated
	 */
	public Adapter createDeviceManagementServiceInstallUpdateResponseStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceRetrieveUpdateStateRequestStructure <em>Device Management Service Retrieve Update State Request Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceRetrieveUpdateStateRequestStructure
	 * @generated
	 */
	public Adapter createDeviceManagementServiceRetrieveUpdateStateRequestStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceRetrieveUpdateStateResponseStructure <em>Device Management Service Retrieve Update State Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceRetrieveUpdateStateResponseStructure
	 * @generated
	 */
	public Adapter createDeviceManagementServiceRetrieveUpdateStateResponseStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateHistoryEntryStructure <em>Device Management Service Update History Entry Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateHistoryEntryStructure
	 * @generated
	 */
	public Adapter createDeviceManagementServiceUpdateHistoryEntryStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateHistoryStructure <em>Device Management Service Update History Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateHistoryStructure
	 * @generated
	 */
	public Adapter createDeviceManagementServiceUpdateHistoryStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateStateDataStructure <em>Device Management Service Update State Data Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateStateDataStructure
	 * @generated
	 */
	public Adapter createDeviceManagementServiceUpdateStateDataStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceStatusInformationStructure <em>Device Status Information Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceStatusInformationStructure
	 * @generated
	 */
	public Adapter createDeviceStatusInformationStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.devicemanagementservice.DeviceStatusStructure <em>Device Status Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.devicemanagementservice.DeviceStatusStructure
	 * @generated
	 */
	public Adapter createDeviceStatusStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.devicemanagementservice.SubdeviceErrorMessagesStructure <em>Subdevice Error Messages Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.devicemanagementservice.SubdeviceErrorMessagesStructure
	 * @generated
	 */
	public Adapter createSubdeviceErrorMessagesStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.devicemanagementservice.SubdeviceInformationStructure <em>Subdevice Information Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.devicemanagementservice.SubdeviceInformationStructure
	 * @generated
	 */
	public Adapter createSubdeviceInformationStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.devicemanagementservice.SubdeviceStatusInformationStructure <em>Subdevice Status Information Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.devicemanagementservice.SubdeviceStatusInformationStructure
	 * @generated
	 */
	public Adapter createSubdeviceStatusInformationStructureAdapter() {
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
