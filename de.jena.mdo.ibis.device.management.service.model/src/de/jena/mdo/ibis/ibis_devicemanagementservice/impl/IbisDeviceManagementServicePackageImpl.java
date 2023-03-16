/**
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice.impl;

import de.jena.mdo.ibis.ibis_common.IbisCommonPackage;

import de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceErrorMessagesData;
import de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceErrorMessagesResponse;
import de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceInformationData;
import de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceInformationResponse;
import de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceStatusInformationData;
import de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceStatusInformationResponse;
import de.jena.mdo.ibis.ibis_devicemanagementservice.Checksum;
import de.jena.mdo.ibis.ibis_devicemanagementservice.ChecksumType;
import de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceConfigurationData;
import de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceConfigurationResponse;
import de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceErrorMessagesData;
import de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceErrorMessagesResponse;
import de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceInformationData;
import de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceInformationResponse;
import de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatus;
import de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusData;
import de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusInformation;
import de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusInformationData;
import de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusInformationResponse;
import de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusResponse;
import de.jena.mdo.ibis.ibis_devicemanagementservice.FinalizeUpdateRequest;
import de.jena.mdo.ibis.ibis_devicemanagementservice.FinalizeUpdateResponse;
import de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServiceFactory;
import de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage;
import de.jena.mdo.ibis.ibis_devicemanagementservice.InstallUpdateRequest;
import de.jena.mdo.ibis.ibis_devicemanagementservice.InstallUpdateResponse;
import de.jena.mdo.ibis.ibis_devicemanagementservice.RetrieveUpdateStateRequest;
import de.jena.mdo.ibis.ibis_devicemanagementservice.RetrieveUpdateStateResponse;
import de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceInformationData;
import de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceInformationResponse;
import de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceStatusData;
import de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceStatusResponse;
import de.jena.mdo.ibis.ibis_devicemanagementservice.SubdeviceErrorMessages;
import de.jena.mdo.ibis.ibis_devicemanagementservice.SubdeviceInformation;
import de.jena.mdo.ibis.ibis_devicemanagementservice.SubdeviceStatusInformation;
import de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateAcceptType;
import de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistory;
import de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistoryEntry;
import de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistoryResponse;
import de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateStateData;
import de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateStatusType;

import de.jena.mdo.ibis.ibis_enumerations.IbisEnumerationsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IbisDeviceManagementServicePackageImpl extends EPackageImpl implements IbisDeviceManagementServicePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checksumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalizeUpdateRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalizeUpdateResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allSubdeviceErrorMessagesDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allSubdeviceErrorMessagesResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allSubdeviceInformationDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allSubdeviceInformationResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allSubdeviceStatusInformationDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allSubdeviceStatusInformationResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceConfigurationDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceConfigurationResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceErrorMessagesDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceErrorMessagesResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceInformationDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceInformationResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceStatusInformationDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceStatusInformationResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceStatusDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceStatusResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceInformationDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceInformationResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceStatusDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceStatusResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateHistoryResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass installUpdateRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass installUpdateResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass retrieveUpdateStateRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass retrieveUpdateStateResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateHistoryEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateHistoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateStateDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceStatusInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subdeviceErrorMessagesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subdeviceInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subdeviceStatusInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum checksumTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum updateAcceptTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum updateStatusTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType checksumTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType updateAcceptTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType updateStatusTypeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IbisDeviceManagementServicePackageImpl() {
		super(eNS_URI, IbisDeviceManagementServiceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link IbisDeviceManagementServicePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IbisDeviceManagementServicePackage init() {
		if (isInited) return (IbisDeviceManagementServicePackage)EPackage.Registry.INSTANCE.getEPackage(IbisDeviceManagementServicePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredIbisDeviceManagementServicePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		IbisDeviceManagementServicePackageImpl theIbisDeviceManagementServicePackage = registeredIbisDeviceManagementServicePackage instanceof IbisDeviceManagementServicePackageImpl ? (IbisDeviceManagementServicePackageImpl)registeredIbisDeviceManagementServicePackage : new IbisDeviceManagementServicePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		IbisCommonPackage.eINSTANCE.eClass();
		IbisEnumerationsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theIbisDeviceManagementServicePackage.createPackageContents();

		// Initialize created meta-data
		theIbisDeviceManagementServicePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIbisDeviceManagementServicePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IbisDeviceManagementServicePackage.eNS_URI, theIbisDeviceManagementServicePackage);
		return theIbisDeviceManagementServicePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChecksum() {
		return checksumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChecksum_ChecksumType() {
		return (EAttribute)checksumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChecksum_Checksum() {
		return (EReference)checksumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFinalizeUpdateRequest() {
		return finalizeUpdateRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFinalizeUpdateRequest_UpdateID() {
		return (EReference)finalizeUpdateRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFinalizeUpdateResponse() {
		return finalizeUpdateResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinalizeUpdateResponse_UpdateStatus() {
		return (EAttribute)finalizeUpdateResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllSubdeviceErrorMessagesData() {
		return allSubdeviceErrorMessagesDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllSubdeviceErrorMessagesData_TimeStamp() {
		return (EReference)allSubdeviceErrorMessagesDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllSubdeviceErrorMessagesData_SubdeviceErrorMessagesList() {
		return (EReference)allSubdeviceErrorMessagesDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllSubdeviceErrorMessagesResponse() {
		return allSubdeviceErrorMessagesResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllSubdeviceErrorMessagesResponse_AllSubdeviceErrorMessagesData() {
		return (EReference)allSubdeviceErrorMessagesResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllSubdeviceInformationData() {
		return allSubdeviceInformationDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllSubdeviceInformationData_TimeStamp() {
		return (EReference)allSubdeviceInformationDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllSubdeviceInformationData_SubdeviceInformationList() {
		return (EReference)allSubdeviceInformationDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllSubdeviceInformationResponse() {
		return allSubdeviceInformationResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllSubdeviceInformationResponse_AllSubdeviceInformationData() {
		return (EReference)allSubdeviceInformationResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllSubdeviceStatusInformationData() {
		return allSubdeviceStatusInformationDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllSubdeviceStatusInformationData_TimeStamp() {
		return (EReference)allSubdeviceStatusInformationDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllSubdeviceStatusInformationData_SubdeviceStatusInformationList() {
		return (EReference)allSubdeviceStatusInformationDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllSubdeviceStatusInformationResponse() {
		return allSubdeviceStatusInformationResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllSubdeviceStatusInformationResponse_AllSubdeviceStatusInformationData() {
		return (EReference)allSubdeviceStatusInformationResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceConfigurationData() {
		return deviceConfigurationDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceConfigurationData_TimeStamp() {
		return (EReference)deviceConfigurationDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceConfigurationData_DeviceID() {
		return (EReference)deviceConfigurationDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceConfigurationResponse() {
		return deviceConfigurationResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceConfigurationResponse_DeviceConfigurationData() {
		return (EReference)deviceConfigurationResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceErrorMessagesData() {
		return deviceErrorMessagesDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceErrorMessagesData_TimeStamp() {
		return (EReference)deviceErrorMessagesDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceErrorMessagesData_ErrorMessage() {
		return (EReference)deviceErrorMessagesDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceErrorMessagesResponse() {
		return deviceErrorMessagesResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceErrorMessagesResponse_DeviceErrorMessagesData() {
		return (EReference)deviceErrorMessagesResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceInformationData() {
		return deviceInformationDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceInformationData_TimeStamp() {
		return (EReference)deviceInformationDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceInformationData_DeviceInformation() {
		return (EReference)deviceInformationDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceInformationResponse() {
		return deviceInformationResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceInformationResponse_DeviceInformationData() {
		return (EReference)deviceInformationResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceStatusInformationData() {
		return deviceStatusInformationDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceStatusInformationData_TimeStamp() {
		return (EReference)deviceStatusInformationDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceStatusInformationData_DeviceStatusInformation() {
		return (EReference)deviceStatusInformationDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceStatusInformationResponse() {
		return deviceStatusInformationResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceStatusInformationResponse_DeviceStatusInformationData() {
		return (EReference)deviceStatusInformationResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceStatusData() {
		return deviceStatusDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceStatusData_TimeStamp() {
		return (EReference)deviceStatusDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceStatusData_DeviceState() {
		return (EAttribute)deviceStatusDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceStatusResponse() {
		return deviceStatusResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceStatusResponse_DeviceStatusData() {
		return (EReference)deviceStatusResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceInformationData() {
		return serviceInformationDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceInformationData_TimeStamp() {
		return (EReference)serviceInformationDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceInformationData_ServiceInformationList() {
		return (EReference)serviceInformationDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceInformationResponse() {
		return serviceInformationResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceInformationResponse_ServiceInformationData() {
		return (EReference)serviceInformationResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceStatusData() {
		return serviceStatusDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceStatusData_TimeStamp() {
		return (EReference)serviceStatusDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceStatusData_ServiceSpecificationWithStateList() {
		return (EReference)serviceStatusDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceStatusResponse() {
		return serviceStatusResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceStatusResponse_ServiceStatusData() {
		return (EReference)serviceStatusResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUpdateHistoryResponse() {
		return updateHistoryResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUpdateHistoryResponse_UpdateHistory() {
		return (EReference)updateHistoryResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInstallUpdateRequest() {
		return installUpdateRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInstallUpdateRequest_UpdateID() {
		return (EReference)installUpdateRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInstallUpdateRequest_UpdateTimestamp() {
		return (EReference)installUpdateRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInstallUpdateRequest_UpdateURL() {
		return (EReference)installUpdateRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInstallUpdateRequest_UpdateFileChecksum() {
		return (EReference)installUpdateRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInstallUpdateRequest_UpdateFileSize() {
		return (EReference)installUpdateRequestEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInstallUpdateResponse() {
		return installUpdateResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstallUpdateResponse_UpdateAccept() {
		return (EAttribute)installUpdateResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRetrieveUpdateStateRequest() {
		return retrieveUpdateStateRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRetrieveUpdateStateRequest_UpdateID() {
		return (EReference)retrieveUpdateStateRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRetrieveUpdateStateResponse() {
		return retrieveUpdateStateResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRetrieveUpdateStateResponse_UpdateStateData() {
		return (EReference)retrieveUpdateStateResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUpdateHistoryEntry() {
		return updateHistoryEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUpdateHistoryEntry_UpdateID() {
		return (EReference)updateHistoryEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUpdateHistoryEntry_UpdateTimestamp() {
		return (EReference)updateHistoryEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUpdateHistoryEntry_UpdateURL() {
		return (EReference)updateHistoryEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUpdateHistoryEntry_UpdateStatus() {
		return (EAttribute)updateHistoryEntryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUpdateHistoryEntry_DataVersionList() {
		return (EReference)updateHistoryEntryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUpdateHistoryEntry_UpdateDetails() {
		return (EReference)updateHistoryEntryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUpdateHistory() {
		return updateHistoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUpdateHistory_UpdateHistoryEntry() {
		return (EReference)updateHistoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUpdateStateData() {
		return updateStateDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUpdateStateData_UpdateID() {
		return (EReference)updateStateDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUpdateStateData_UpdateTimestamp() {
		return (EReference)updateStateDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUpdateStateData_UpdateStatus() {
		return (EAttribute)updateStateDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUpdateStateData_UpdateDetails() {
		return (EReference)updateStateDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceStatusInformation() {
		return deviceStatusInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceStatusInformation_DeviceState() {
		return (EAttribute)deviceStatusInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceStatusInformation_DeviceStatusList() {
		return (EReference)deviceStatusInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceStatus() {
		return deviceStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceStatus_DeviceStatusName() {
		return (EReference)deviceStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceStatus_DeviceStatusFlag() {
		return (EReference)deviceStatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceStatus_DeviceStatusImpact() {
		return (EAttribute)deviceStatusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceStatus_DeviceStatusPriority() {
		return (EReference)deviceStatusEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubdeviceErrorMessages() {
		return subdeviceErrorMessagesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubdeviceErrorMessages_SubdeviceName() {
		return (EReference)subdeviceErrorMessagesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubdeviceErrorMessages_ErrorMessage() {
		return (EReference)subdeviceErrorMessagesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubdeviceInformation() {
		return subdeviceInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubdeviceInformation_SubdeviceName() {
		return (EReference)subdeviceInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubdeviceInformation_DeviceInformation() {
		return (EReference)subdeviceInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubdeviceStatusInformation() {
		return subdeviceStatusInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubdeviceStatusInformation_SubdeviceName() {
		return (EReference)subdeviceStatusInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubdeviceStatusInformation_DeviceStatusInformation() {
		return (EReference)subdeviceStatusInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getChecksumType() {
		return checksumTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUpdateAcceptType() {
		return updateAcceptTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUpdateStatusType() {
		return updateStatusTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getChecksumTypeObject() {
		return checksumTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUpdateAcceptTypeObject() {
		return updateAcceptTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUpdateStatusTypeObject() {
		return updateStatusTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IbisDeviceManagementServiceFactory getIbisDeviceManagementServiceFactory() {
		return (IbisDeviceManagementServiceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		checksumEClass = createEClass(CHECKSUM);
		createEAttribute(checksumEClass, CHECKSUM__CHECKSUM_TYPE);
		createEReference(checksumEClass, CHECKSUM__CHECKSUM);

		finalizeUpdateRequestEClass = createEClass(FINALIZE_UPDATE_REQUEST);
		createEReference(finalizeUpdateRequestEClass, FINALIZE_UPDATE_REQUEST__UPDATE_ID);

		finalizeUpdateResponseEClass = createEClass(FINALIZE_UPDATE_RESPONSE);
		createEAttribute(finalizeUpdateResponseEClass, FINALIZE_UPDATE_RESPONSE__UPDATE_STATUS);

		allSubdeviceErrorMessagesDataEClass = createEClass(ALL_SUBDEVICE_ERROR_MESSAGES_DATA);
		createEReference(allSubdeviceErrorMessagesDataEClass, ALL_SUBDEVICE_ERROR_MESSAGES_DATA__TIME_STAMP);
		createEReference(allSubdeviceErrorMessagesDataEClass, ALL_SUBDEVICE_ERROR_MESSAGES_DATA__SUBDEVICE_ERROR_MESSAGES_LIST);

		allSubdeviceErrorMessagesResponseEClass = createEClass(ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE);
		createEReference(allSubdeviceErrorMessagesResponseEClass, ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE__ALL_SUBDEVICE_ERROR_MESSAGES_DATA);

		allSubdeviceInformationDataEClass = createEClass(ALL_SUBDEVICE_INFORMATION_DATA);
		createEReference(allSubdeviceInformationDataEClass, ALL_SUBDEVICE_INFORMATION_DATA__TIME_STAMP);
		createEReference(allSubdeviceInformationDataEClass, ALL_SUBDEVICE_INFORMATION_DATA__SUBDEVICE_INFORMATION_LIST);

		allSubdeviceInformationResponseEClass = createEClass(ALL_SUBDEVICE_INFORMATION_RESPONSE);
		createEReference(allSubdeviceInformationResponseEClass, ALL_SUBDEVICE_INFORMATION_RESPONSE__ALL_SUBDEVICE_INFORMATION_DATA);

		allSubdeviceStatusInformationDataEClass = createEClass(ALL_SUBDEVICE_STATUS_INFORMATION_DATA);
		createEReference(allSubdeviceStatusInformationDataEClass, ALL_SUBDEVICE_STATUS_INFORMATION_DATA__TIME_STAMP);
		createEReference(allSubdeviceStatusInformationDataEClass, ALL_SUBDEVICE_STATUS_INFORMATION_DATA__SUBDEVICE_STATUS_INFORMATION_LIST);

		allSubdeviceStatusInformationResponseEClass = createEClass(ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE);
		createEReference(allSubdeviceStatusInformationResponseEClass, ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE__ALL_SUBDEVICE_STATUS_INFORMATION_DATA);

		deviceConfigurationDataEClass = createEClass(DEVICE_CONFIGURATION_DATA);
		createEReference(deviceConfigurationDataEClass, DEVICE_CONFIGURATION_DATA__TIME_STAMP);
		createEReference(deviceConfigurationDataEClass, DEVICE_CONFIGURATION_DATA__DEVICE_ID);

		deviceConfigurationResponseEClass = createEClass(DEVICE_CONFIGURATION_RESPONSE);
		createEReference(deviceConfigurationResponseEClass, DEVICE_CONFIGURATION_RESPONSE__DEVICE_CONFIGURATION_DATA);

		deviceErrorMessagesDataEClass = createEClass(DEVICE_ERROR_MESSAGES_DATA);
		createEReference(deviceErrorMessagesDataEClass, DEVICE_ERROR_MESSAGES_DATA__TIME_STAMP);
		createEReference(deviceErrorMessagesDataEClass, DEVICE_ERROR_MESSAGES_DATA__ERROR_MESSAGE);

		deviceErrorMessagesResponseEClass = createEClass(DEVICE_ERROR_MESSAGES_RESPONSE);
		createEReference(deviceErrorMessagesResponseEClass, DEVICE_ERROR_MESSAGES_RESPONSE__DEVICE_ERROR_MESSAGES_DATA);

		deviceInformationDataEClass = createEClass(DEVICE_INFORMATION_DATA);
		createEReference(deviceInformationDataEClass, DEVICE_INFORMATION_DATA__TIME_STAMP);
		createEReference(deviceInformationDataEClass, DEVICE_INFORMATION_DATA__DEVICE_INFORMATION);

		deviceInformationResponseEClass = createEClass(DEVICE_INFORMATION_RESPONSE);
		createEReference(deviceInformationResponseEClass, DEVICE_INFORMATION_RESPONSE__DEVICE_INFORMATION_DATA);

		deviceStatusInformationDataEClass = createEClass(DEVICE_STATUS_INFORMATION_DATA);
		createEReference(deviceStatusInformationDataEClass, DEVICE_STATUS_INFORMATION_DATA__TIME_STAMP);
		createEReference(deviceStatusInformationDataEClass, DEVICE_STATUS_INFORMATION_DATA__DEVICE_STATUS_INFORMATION);

		deviceStatusInformationResponseEClass = createEClass(DEVICE_STATUS_INFORMATION_RESPONSE);
		createEReference(deviceStatusInformationResponseEClass, DEVICE_STATUS_INFORMATION_RESPONSE__DEVICE_STATUS_INFORMATION_DATA);

		deviceStatusDataEClass = createEClass(DEVICE_STATUS_DATA);
		createEReference(deviceStatusDataEClass, DEVICE_STATUS_DATA__TIME_STAMP);
		createEAttribute(deviceStatusDataEClass, DEVICE_STATUS_DATA__DEVICE_STATE);

		deviceStatusResponseEClass = createEClass(DEVICE_STATUS_RESPONSE);
		createEReference(deviceStatusResponseEClass, DEVICE_STATUS_RESPONSE__DEVICE_STATUS_DATA);

		serviceInformationDataEClass = createEClass(SERVICE_INFORMATION_DATA);
		createEReference(serviceInformationDataEClass, SERVICE_INFORMATION_DATA__TIME_STAMP);
		createEReference(serviceInformationDataEClass, SERVICE_INFORMATION_DATA__SERVICE_INFORMATION_LIST);

		serviceInformationResponseEClass = createEClass(SERVICE_INFORMATION_RESPONSE);
		createEReference(serviceInformationResponseEClass, SERVICE_INFORMATION_RESPONSE__SERVICE_INFORMATION_DATA);

		serviceStatusDataEClass = createEClass(SERVICE_STATUS_DATA);
		createEReference(serviceStatusDataEClass, SERVICE_STATUS_DATA__TIME_STAMP);
		createEReference(serviceStatusDataEClass, SERVICE_STATUS_DATA__SERVICE_SPECIFICATION_WITH_STATE_LIST);

		serviceStatusResponseEClass = createEClass(SERVICE_STATUS_RESPONSE);
		createEReference(serviceStatusResponseEClass, SERVICE_STATUS_RESPONSE__SERVICE_STATUS_DATA);

		updateHistoryResponseEClass = createEClass(UPDATE_HISTORY_RESPONSE);
		createEReference(updateHistoryResponseEClass, UPDATE_HISTORY_RESPONSE__UPDATE_HISTORY);

		installUpdateRequestEClass = createEClass(INSTALL_UPDATE_REQUEST);
		createEReference(installUpdateRequestEClass, INSTALL_UPDATE_REQUEST__UPDATE_ID);
		createEReference(installUpdateRequestEClass, INSTALL_UPDATE_REQUEST__UPDATE_TIMESTAMP);
		createEReference(installUpdateRequestEClass, INSTALL_UPDATE_REQUEST__UPDATE_URL);
		createEReference(installUpdateRequestEClass, INSTALL_UPDATE_REQUEST__UPDATE_FILE_CHECKSUM);
		createEReference(installUpdateRequestEClass, INSTALL_UPDATE_REQUEST__UPDATE_FILE_SIZE);

		installUpdateResponseEClass = createEClass(INSTALL_UPDATE_RESPONSE);
		createEAttribute(installUpdateResponseEClass, INSTALL_UPDATE_RESPONSE__UPDATE_ACCEPT);

		retrieveUpdateStateRequestEClass = createEClass(RETRIEVE_UPDATE_STATE_REQUEST);
		createEReference(retrieveUpdateStateRequestEClass, RETRIEVE_UPDATE_STATE_REQUEST__UPDATE_ID);

		retrieveUpdateStateResponseEClass = createEClass(RETRIEVE_UPDATE_STATE_RESPONSE);
		createEReference(retrieveUpdateStateResponseEClass, RETRIEVE_UPDATE_STATE_RESPONSE__UPDATE_STATE_DATA);

		updateHistoryEntryEClass = createEClass(UPDATE_HISTORY_ENTRY);
		createEReference(updateHistoryEntryEClass, UPDATE_HISTORY_ENTRY__UPDATE_ID);
		createEReference(updateHistoryEntryEClass, UPDATE_HISTORY_ENTRY__UPDATE_TIMESTAMP);
		createEReference(updateHistoryEntryEClass, UPDATE_HISTORY_ENTRY__UPDATE_URL);
		createEAttribute(updateHistoryEntryEClass, UPDATE_HISTORY_ENTRY__UPDATE_STATUS);
		createEReference(updateHistoryEntryEClass, UPDATE_HISTORY_ENTRY__DATA_VERSION_LIST);
		createEReference(updateHistoryEntryEClass, UPDATE_HISTORY_ENTRY__UPDATE_DETAILS);

		updateHistoryEClass = createEClass(UPDATE_HISTORY);
		createEReference(updateHistoryEClass, UPDATE_HISTORY__UPDATE_HISTORY_ENTRY);

		updateStateDataEClass = createEClass(UPDATE_STATE_DATA);
		createEReference(updateStateDataEClass, UPDATE_STATE_DATA__UPDATE_ID);
		createEReference(updateStateDataEClass, UPDATE_STATE_DATA__UPDATE_TIMESTAMP);
		createEAttribute(updateStateDataEClass, UPDATE_STATE_DATA__UPDATE_STATUS);
		createEReference(updateStateDataEClass, UPDATE_STATE_DATA__UPDATE_DETAILS);

		deviceStatusInformationEClass = createEClass(DEVICE_STATUS_INFORMATION);
		createEAttribute(deviceStatusInformationEClass, DEVICE_STATUS_INFORMATION__DEVICE_STATE);
		createEReference(deviceStatusInformationEClass, DEVICE_STATUS_INFORMATION__DEVICE_STATUS_LIST);

		deviceStatusEClass = createEClass(DEVICE_STATUS);
		createEReference(deviceStatusEClass, DEVICE_STATUS__DEVICE_STATUS_NAME);
		createEReference(deviceStatusEClass, DEVICE_STATUS__DEVICE_STATUS_FLAG);
		createEAttribute(deviceStatusEClass, DEVICE_STATUS__DEVICE_STATUS_IMPACT);
		createEReference(deviceStatusEClass, DEVICE_STATUS__DEVICE_STATUS_PRIORITY);

		subdeviceErrorMessagesEClass = createEClass(SUBDEVICE_ERROR_MESSAGES);
		createEReference(subdeviceErrorMessagesEClass, SUBDEVICE_ERROR_MESSAGES__SUBDEVICE_NAME);
		createEReference(subdeviceErrorMessagesEClass, SUBDEVICE_ERROR_MESSAGES__ERROR_MESSAGE);

		subdeviceInformationEClass = createEClass(SUBDEVICE_INFORMATION);
		createEReference(subdeviceInformationEClass, SUBDEVICE_INFORMATION__SUBDEVICE_NAME);
		createEReference(subdeviceInformationEClass, SUBDEVICE_INFORMATION__DEVICE_INFORMATION);

		subdeviceStatusInformationEClass = createEClass(SUBDEVICE_STATUS_INFORMATION);
		createEReference(subdeviceStatusInformationEClass, SUBDEVICE_STATUS_INFORMATION__SUBDEVICE_NAME);
		createEReference(subdeviceStatusInformationEClass, SUBDEVICE_STATUS_INFORMATION__DEVICE_STATUS_INFORMATION);

		// Create enums
		checksumTypeEEnum = createEEnum(CHECKSUM_TYPE);
		updateAcceptTypeEEnum = createEEnum(UPDATE_ACCEPT_TYPE);
		updateStatusTypeEEnum = createEEnum(UPDATE_STATUS_TYPE);

		// Create data types
		checksumTypeObjectEDataType = createEDataType(CHECKSUM_TYPE_OBJECT);
		updateAcceptTypeObjectEDataType = createEDataType(UPDATE_ACCEPT_TYPE_OBJECT);
		updateStatusTypeObjectEDataType = createEDataType(UPDATE_STATUS_TYPE_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		IbisCommonPackage theIbisCommonPackage = (IbisCommonPackage)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI);
		IbisEnumerationsPackage theIbisEnumerationsPackage = (IbisEnumerationsPackage)EPackage.Registry.INSTANCE.getEPackage(IbisEnumerationsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		finalizeUpdateResponseEClass.getESuperTypes().add(theIbisCommonPackage.getGeneralResponse());
		allSubdeviceErrorMessagesResponseEClass.getESuperTypes().add(theIbisCommonPackage.getGeneralResponse());
		allSubdeviceInformationResponseEClass.getESuperTypes().add(theIbisCommonPackage.getGeneralResponse());
		allSubdeviceStatusInformationResponseEClass.getESuperTypes().add(theIbisCommonPackage.getGeneralResponse());
		deviceConfigurationResponseEClass.getESuperTypes().add(theIbisCommonPackage.getGeneralResponse());
		deviceErrorMessagesResponseEClass.getESuperTypes().add(theIbisCommonPackage.getGeneralResponse());
		deviceInformationResponseEClass.getESuperTypes().add(theIbisCommonPackage.getGeneralResponse());
		deviceStatusInformationResponseEClass.getESuperTypes().add(theIbisCommonPackage.getGeneralResponse());
		deviceStatusResponseEClass.getESuperTypes().add(theIbisCommonPackage.getGeneralResponse());
		serviceInformationResponseEClass.getESuperTypes().add(theIbisCommonPackage.getGeneralResponse());
		serviceStatusResponseEClass.getESuperTypes().add(theIbisCommonPackage.getGeneralResponse());
		updateHistoryResponseEClass.getESuperTypes().add(theIbisCommonPackage.getGeneralResponse());
		installUpdateResponseEClass.getESuperTypes().add(theIbisCommonPackage.getGeneralResponse());
		retrieveUpdateStateResponseEClass.getESuperTypes().add(theIbisCommonPackage.getGeneralResponse());

		// Initialize classes, features, and operations; add parameters
		initEClass(checksumEClass, Checksum.class, "Checksum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChecksum_ChecksumType(), this.getChecksumType(), "checksumType", null, 1, 1, Checksum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChecksum_Checksum(), theIbisCommonPackage.getIBISIPByte(), null, "checksum", null, 4, 32, Checksum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(finalizeUpdateRequestEClass, FinalizeUpdateRequest.class, "FinalizeUpdateRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFinalizeUpdateRequest_UpdateID(), theIbisCommonPackage.getIBISIPNMTOKEN(), null, "updateID", null, 1, 1, FinalizeUpdateRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(finalizeUpdateResponseEClass, FinalizeUpdateResponse.class, "FinalizeUpdateResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFinalizeUpdateResponse_UpdateStatus(), this.getUpdateStatusType(), "updateStatus", null, 0, 1, FinalizeUpdateResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allSubdeviceErrorMessagesDataEClass, AllSubdeviceErrorMessagesData.class, "AllSubdeviceErrorMessagesData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllSubdeviceErrorMessagesData_TimeStamp(), theIbisCommonPackage.getIBISIPDateTime(), null, "timeStamp", null, 1, 1, AllSubdeviceErrorMessagesData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllSubdeviceErrorMessagesData_SubdeviceErrorMessagesList(), this.getSubdeviceErrorMessages(), null, "subdeviceErrorMessagesList", null, 1, 1, AllSubdeviceErrorMessagesData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allSubdeviceErrorMessagesResponseEClass, AllSubdeviceErrorMessagesResponse.class, "AllSubdeviceErrorMessagesResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllSubdeviceErrorMessagesResponse_AllSubdeviceErrorMessagesData(), this.getAllSubdeviceErrorMessagesData(), null, "allSubdeviceErrorMessagesData", null, 0, 1, AllSubdeviceErrorMessagesResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allSubdeviceInformationDataEClass, AllSubdeviceInformationData.class, "AllSubdeviceInformationData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllSubdeviceInformationData_TimeStamp(), theIbisCommonPackage.getIBISIPDateTime(), null, "timeStamp", null, 1, 1, AllSubdeviceInformationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllSubdeviceInformationData_SubdeviceInformationList(), this.getSubdeviceInformation(), null, "subdeviceInformationList", null, 1, 1, AllSubdeviceInformationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allSubdeviceInformationResponseEClass, AllSubdeviceInformationResponse.class, "AllSubdeviceInformationResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllSubdeviceInformationResponse_AllSubdeviceInformationData(), this.getAllSubdeviceInformationData(), null, "allSubdeviceInformationData", null, 0, 1, AllSubdeviceInformationResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allSubdeviceStatusInformationDataEClass, AllSubdeviceStatusInformationData.class, "AllSubdeviceStatusInformationData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllSubdeviceStatusInformationData_TimeStamp(), theIbisCommonPackage.getIBISIPDateTime(), null, "timeStamp", null, 1, 1, AllSubdeviceStatusInformationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllSubdeviceStatusInformationData_SubdeviceStatusInformationList(), this.getSubdeviceStatusInformation(), null, "subdeviceStatusInformationList", null, 1, 1, AllSubdeviceStatusInformationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allSubdeviceStatusInformationResponseEClass, AllSubdeviceStatusInformationResponse.class, "AllSubdeviceStatusInformationResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllSubdeviceStatusInformationResponse_AllSubdeviceStatusInformationData(), this.getAllSubdeviceStatusInformationData(), null, "allSubdeviceStatusInformationData", null, 0, 1, AllSubdeviceStatusInformationResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceConfigurationDataEClass, DeviceConfigurationData.class, "DeviceConfigurationData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceConfigurationData_TimeStamp(), theIbisCommonPackage.getIBISIPDateTime(), null, "timeStamp", null, 1, 1, DeviceConfigurationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceConfigurationData_DeviceID(), theIbisCommonPackage.getIBISIPInt(), null, "deviceID", null, 1, 1, DeviceConfigurationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceConfigurationResponseEClass, DeviceConfigurationResponse.class, "DeviceConfigurationResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceConfigurationResponse_DeviceConfigurationData(), this.getDeviceConfigurationData(), null, "deviceConfigurationData", null, 0, 1, DeviceConfigurationResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceErrorMessagesDataEClass, DeviceErrorMessagesData.class, "DeviceErrorMessagesData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceErrorMessagesData_TimeStamp(), theIbisCommonPackage.getIBISIPDateTime(), null, "timeStamp", null, 1, 1, DeviceErrorMessagesData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceErrorMessagesData_ErrorMessage(), theIbisCommonPackage.getMessage(), null, "errorMessage", null, 10, -1, DeviceErrorMessagesData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceErrorMessagesResponseEClass, DeviceErrorMessagesResponse.class, "DeviceErrorMessagesResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceErrorMessagesResponse_DeviceErrorMessagesData(), this.getDeviceErrorMessagesData(), null, "deviceErrorMessagesData", null, 0, 1, DeviceErrorMessagesResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceInformationDataEClass, DeviceInformationData.class, "DeviceInformationData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceInformationData_TimeStamp(), theIbisCommonPackage.getIBISIPDateTime(), null, "timeStamp", null, 1, 1, DeviceInformationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceInformationData_DeviceInformation(), theIbisCommonPackage.getDeviceInformation(), null, "deviceInformation", null, 1, 1, DeviceInformationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceInformationResponseEClass, DeviceInformationResponse.class, "DeviceInformationResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceInformationResponse_DeviceInformationData(), this.getDeviceInformationData(), null, "deviceInformationData", null, 0, 1, DeviceInformationResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceStatusInformationDataEClass, DeviceStatusInformationData.class, "DeviceStatusInformationData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceStatusInformationData_TimeStamp(), theIbisCommonPackage.getIBISIPDateTime(), null, "timeStamp", null, 1, 1, DeviceStatusInformationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceStatusInformationData_DeviceStatusInformation(), this.getDeviceStatusInformation(), null, "deviceStatusInformation", null, 1, 1, DeviceStatusInformationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceStatusInformationResponseEClass, DeviceStatusInformationResponse.class, "DeviceStatusInformationResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceStatusInformationResponse_DeviceStatusInformationData(), this.getDeviceStatusInformationData(), null, "deviceStatusInformationData", null, 0, 1, DeviceStatusInformationResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceStatusDataEClass, DeviceStatusData.class, "DeviceStatusData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceStatusData_TimeStamp(), theIbisCommonPackage.getIBISIPDateTime(), null, "timeStamp", null, 1, 1, DeviceStatusData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceStatusData_DeviceState(), theIbisEnumerationsPackage.getDeviceStateEnumeration(), "deviceState", null, 1, 1, DeviceStatusData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceStatusResponseEClass, DeviceStatusResponse.class, "DeviceStatusResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceStatusResponse_DeviceStatusData(), this.getDeviceStatusData(), null, "deviceStatusData", null, 0, 1, DeviceStatusResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceInformationDataEClass, ServiceInformationData.class, "ServiceInformationData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceInformationData_TimeStamp(), theIbisCommonPackage.getIBISIPDateTime(), null, "timeStamp", null, 1, 1, ServiceInformationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceInformationData_ServiceInformationList(), theIbisCommonPackage.getServiceInformationList(), null, "serviceInformationList", null, 1, 1, ServiceInformationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceInformationResponseEClass, ServiceInformationResponse.class, "ServiceInformationResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceInformationResponse_ServiceInformationData(), this.getServiceInformationData(), null, "serviceInformationData", null, 0, 1, ServiceInformationResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceStatusDataEClass, ServiceStatusData.class, "ServiceStatusData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceStatusData_TimeStamp(), theIbisCommonPackage.getIBISIPDateTime(), null, "timeStamp", null, 1, 1, ServiceStatusData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceStatusData_ServiceSpecificationWithStateList(), theIbisCommonPackage.getServiceSpecificationWithStateList(), null, "serviceSpecificationWithStateList", null, 1, 1, ServiceStatusData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceStatusResponseEClass, ServiceStatusResponse.class, "ServiceStatusResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceStatusResponse_ServiceStatusData(), this.getServiceStatusData(), null, "serviceStatusData", null, 0, 1, ServiceStatusResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateHistoryResponseEClass, UpdateHistoryResponse.class, "UpdateHistoryResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUpdateHistoryResponse_UpdateHistory(), this.getUpdateHistory(), null, "updateHistory", null, 0, 1, UpdateHistoryResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(installUpdateRequestEClass, InstallUpdateRequest.class, "InstallUpdateRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstallUpdateRequest_UpdateID(), theIbisCommonPackage.getIBISIPNMTOKEN(), null, "updateID", null, 1, 1, InstallUpdateRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstallUpdateRequest_UpdateTimestamp(), theIbisCommonPackage.getIBISIPDateTime(), null, "updateTimestamp", null, 1, 1, InstallUpdateRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstallUpdateRequest_UpdateURL(), theIbisCommonPackage.getIBISIPAnyURI(), null, "updateURL", null, 1, 1, InstallUpdateRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstallUpdateRequest_UpdateFileChecksum(), this.getChecksum(), null, "updateFileChecksum", null, 0, 1, InstallUpdateRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstallUpdateRequest_UpdateFileSize(), theIbisCommonPackage.getIBISIPUnsignedLong(), null, "updateFileSize", null, 0, 1, InstallUpdateRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(installUpdateResponseEClass, InstallUpdateResponse.class, "InstallUpdateResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstallUpdateResponse_UpdateAccept(), this.getUpdateAcceptType(), "updateAccept", null, 0, 1, InstallUpdateResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(retrieveUpdateStateRequestEClass, RetrieveUpdateStateRequest.class, "RetrieveUpdateStateRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRetrieveUpdateStateRequest_UpdateID(), theIbisCommonPackage.getIBISIPNMTOKEN(), null, "updateID", null, 1, 1, RetrieveUpdateStateRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(retrieveUpdateStateResponseEClass, RetrieveUpdateStateResponse.class, "RetrieveUpdateStateResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRetrieveUpdateStateResponse_UpdateStateData(), this.getUpdateStateData(), null, "updateStateData", null, 0, 1, RetrieveUpdateStateResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateHistoryEntryEClass, UpdateHistoryEntry.class, "UpdateHistoryEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUpdateHistoryEntry_UpdateID(), theIbisCommonPackage.getIBISIPNMTOKEN(), null, "updateID", null, 1, 1, UpdateHistoryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUpdateHistoryEntry_UpdateTimestamp(), theIbisCommonPackage.getIBISIPDateTime(), null, "updateTimestamp", null, 1, 1, UpdateHistoryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUpdateHistoryEntry_UpdateURL(), theIbisCommonPackage.getIBISIPAnyURI(), null, "updateURL", null, 1, 1, UpdateHistoryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdateHistoryEntry_UpdateStatus(), this.getUpdateStatusType(), "updateStatus", null, 1, 1, UpdateHistoryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUpdateHistoryEntry_DataVersionList(), theIbisCommonPackage.getDataVersionList(), null, "dataVersionList", null, 0, 1, UpdateHistoryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUpdateHistoryEntry_UpdateDetails(), theIbisCommonPackage.getIBISIPString(), null, "updateDetails", null, 0, 1, UpdateHistoryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateHistoryEClass, UpdateHistory.class, "UpdateHistory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUpdateHistory_UpdateHistoryEntry(), this.getUpdateHistoryEntry(), null, "updateHistoryEntry", null, 0, -1, UpdateHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateStateDataEClass, UpdateStateData.class, "UpdateStateData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUpdateStateData_UpdateID(), theIbisCommonPackage.getIBISIPNMTOKEN(), null, "updateID", null, 1, 1, UpdateStateData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUpdateStateData_UpdateTimestamp(), theIbisCommonPackage.getIBISIPDateTime(), null, "updateTimestamp", null, 1, 1, UpdateStateData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdateStateData_UpdateStatus(), this.getUpdateStatusType(), "updateStatus", null, 1, 1, UpdateStateData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUpdateStateData_UpdateDetails(), theIbisCommonPackage.getIBISIPString(), null, "updateDetails", null, 0, 1, UpdateStateData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceStatusInformationEClass, DeviceStatusInformation.class, "DeviceStatusInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeviceStatusInformation_DeviceState(), theIbisEnumerationsPackage.getDeviceStateEnumeration(), "deviceState", null, 1, 1, DeviceStatusInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceStatusInformation_DeviceStatusList(), this.getDeviceStatus(), null, "deviceStatusList", null, 0, 1, DeviceStatusInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceStatusEClass, DeviceStatus.class, "DeviceStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceStatus_DeviceStatusName(), theIbisCommonPackage.getIBISIPString(), null, "deviceStatusName", null, 1, 1, DeviceStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceStatus_DeviceStatusFlag(), theIbisCommonPackage.getIBISIPBoolean(), null, "deviceStatusFlag", null, 1, 1, DeviceStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceStatus_DeviceStatusImpact(), theIbisEnumerationsPackage.getDeviceStateEnumeration(), "deviceStatusImpact", null, 1, 1, DeviceStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceStatus_DeviceStatusPriority(), theIbisCommonPackage.getIBISIPInt(), null, "deviceStatusPriority", null, 1, 1, DeviceStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subdeviceErrorMessagesEClass, SubdeviceErrorMessages.class, "SubdeviceErrorMessages", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubdeviceErrorMessages_SubdeviceName(), theIbisCommonPackage.getIBISIPString(), null, "subdeviceName", null, 1, 1, SubdeviceErrorMessages.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubdeviceErrorMessages_ErrorMessage(), theIbisCommonPackage.getMessage(), null, "errorMessage", null, 10, -1, SubdeviceErrorMessages.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subdeviceInformationEClass, SubdeviceInformation.class, "SubdeviceInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubdeviceInformation_SubdeviceName(), theIbisCommonPackage.getIBISIPString(), null, "subdeviceName", null, 1, 1, SubdeviceInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubdeviceInformation_DeviceInformation(), theIbisCommonPackage.getDeviceInformation(), null, "deviceInformation", null, 1, 1, SubdeviceInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subdeviceStatusInformationEClass, SubdeviceStatusInformation.class, "SubdeviceStatusInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubdeviceStatusInformation_SubdeviceName(), theIbisCommonPackage.getIBISIPString(), null, "subdeviceName", null, 1, 1, SubdeviceStatusInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubdeviceStatusInformation_DeviceStatusInformation(), this.getDeviceStatusInformation(), null, "deviceStatusInformation", null, 1, 1, SubdeviceStatusInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(checksumTypeEEnum, ChecksumType.class, "ChecksumType");
		addEEnumLiteral(checksumTypeEEnum, ChecksumType.CRC32);
		addEEnumLiteral(checksumTypeEEnum, ChecksumType.MD5);
		addEEnumLiteral(checksumTypeEEnum, ChecksumType.SHA256);

		initEEnum(updateAcceptTypeEEnum, UpdateAcceptType.class, "UpdateAcceptType");
		addEEnumLiteral(updateAcceptTypeEEnum, UpdateAcceptType.UPDATE_ACCEPTED);
		addEEnumLiteral(updateAcceptTypeEEnum, UpdateAcceptType.URL_TYPE_UNKNOWN);
		addEEnumLiteral(updateAcceptTypeEEnum, UpdateAcceptType.NO_UPDATES_ALLOWED);
		addEEnumLiteral(updateAcceptTypeEEnum, UpdateAcceptType.TO_BE_POSTPONED);

		initEEnum(updateStatusTypeEEnum, UpdateStatusType.class, "UpdateStatusType");
		addEEnumLiteral(updateStatusTypeEEnum, UpdateStatusType.UPDATE_RUNNING);
		addEEnumLiteral(updateStatusTypeEEnum, UpdateStatusType.DEVICE_RESTART_REQUIRED);
		addEEnumLiteral(updateStatusTypeEEnum, UpdateStatusType.DOWNLOAD_UPDATE_FILE_FAILED);
		addEEnumLiteral(updateStatusTypeEEnum, UpdateStatusType.UPDATE_FILE_CORRUPTED);
		addEEnumLiteral(updateStatusTypeEEnum, UpdateStatusType.UPDATE_NOT_NECESSARY);
		addEEnumLiteral(updateStatusTypeEEnum, UpdateStatusType.INSTALLATION_FAILED);
		addEEnumLiteral(updateStatusTypeEEnum, UpdateStatusType.INSTALLATION_SUCCESSFUL);

		// Initialize data types
		initEDataType(checksumTypeObjectEDataType, ChecksumType.class, "ChecksumTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(updateAcceptTypeObjectEDataType, UpdateAcceptType.class, "UpdateAcceptTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(updateStatusTypeObjectEDataType, UpdateStatusType.class, "UpdateStatusTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (checksumEClass,
		   source,
		   new String[] {
			   "name", "ChecksumStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getChecksum_ChecksumType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ChecksumType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getChecksum_Checksum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Checksum",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (checksumTypeEEnum,
		   source,
		   new String[] {
			   "name", "ChecksumTypeEnumeration"
		   });
		addAnnotation
		  (checksumTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "ChecksumTypeEnumeration:Object",
			   "baseType", "ChecksumTypeEnumeration"
		   });
		addAnnotation
		  (finalizeUpdateRequestEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.FinalizeUpdateRequestStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFinalizeUpdateRequest_UpdateID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UpdateID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (finalizeUpdateResponseEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.FinalizeUpdateResponseStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFinalizeUpdateResponse_UpdateStatus(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UpdateStatus",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (allSubdeviceErrorMessagesDataEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.GetAllSubdeviceErrorMessagesResponseDataStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAllSubdeviceErrorMessagesData_TimeStamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimeStamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllSubdeviceErrorMessagesData_SubdeviceErrorMessagesList(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SubdeviceErrorMessagesList",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (allSubdeviceErrorMessagesResponseEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.GetAllSubdeviceErrorMessagesResponseStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAllSubdeviceErrorMessagesResponse_AllSubdeviceErrorMessagesData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceManagementService.GetAllSubdeviceErrorMessagesResponseData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (allSubdeviceInformationDataEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.GetAllSubdeviceInformationResponseDataStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAllSubdeviceInformationData_TimeStamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimeStamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllSubdeviceInformationData_SubdeviceInformationList(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SubdeviceInformationList",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (allSubdeviceInformationResponseEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.GetAllSubdeviceInformationResponseStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAllSubdeviceInformationResponse_AllSubdeviceInformationData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceManagementService.GetAllSubdeviceInformationResponseData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (allSubdeviceStatusInformationDataEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.GetAllSubdeviceStatusInformationResponseDataStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAllSubdeviceStatusInformationData_TimeStamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimeStamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllSubdeviceStatusInformationData_SubdeviceStatusInformationList(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SubdeviceStatusInformationList",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (allSubdeviceStatusInformationResponseEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.GetAllSubdeviceStatusInformationResponseStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAllSubdeviceStatusInformationResponse_AllSubdeviceStatusInformationData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceManagementService.GetAllSubdeviceStatusInformationResponseData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceConfigurationDataEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.GetDeviceConfigurationResponseDataStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceConfigurationData_TimeStamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimeStamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceConfigurationData_DeviceID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceConfigurationResponseEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.GetDeviceConfigurationResponseStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceConfigurationResponse_DeviceConfigurationData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceManagementService.GetDeviceConfigurationResponseData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceErrorMessagesDataEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.GetDeviceErrorMessagesResponseDataStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceErrorMessagesData_TimeStamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimeStamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceErrorMessagesData_ErrorMessage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ErrorMessage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceErrorMessagesResponseEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.GetDeviceErrorMessagesResponseStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceErrorMessagesResponse_DeviceErrorMessagesData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceManagementService.GetDeviceErrorMessagesResponseData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceInformationDataEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.GetDeviceInformationResponseDataStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceInformationData_TimeStamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimeStamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceInformationData_DeviceInformation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceInformation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceInformationResponseEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.GetDeviceInformationResponseStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceInformationResponse_DeviceInformationData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceManagementService.GetDeviceInformationResponseData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceStatusInformationDataEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.GetDeviceStatusInformationResponseDataStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceStatusInformationData_TimeStamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimeStamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceStatusInformationData_DeviceStatusInformation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceStatusInformation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceStatusInformationResponseEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.GetDeviceStatusInformationResponseStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceStatusInformationResponse_DeviceStatusInformationData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceManagementService.GetDeviceStatusInformationResponseData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceStatusDataEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.GetDeviceStatusResponseDataStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceStatusData_TimeStamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimeStamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceStatusData_DeviceState(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceState",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceStatusResponseEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.GetDeviceStatusResponseStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceStatusResponse_DeviceStatusData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceManagementService.GetDeviceStatusResponseData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (serviceInformationDataEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.GetServiceInformationResponseDataStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getServiceInformationData_TimeStamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimeStamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getServiceInformationData_ServiceInformationList(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ServiceInformationList",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (serviceInformationResponseEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.GetServiceInformationResponseStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getServiceInformationResponse_ServiceInformationData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceManagementService.GetServiceInformationResponseData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (serviceStatusDataEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.GetServiceStatusResponseDataStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getServiceStatusData_TimeStamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimeStamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getServiceStatusData_ServiceSpecificationWithStateList(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ServiceSpecificationWithStateList",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (serviceStatusResponseEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.GetServiceStatusResponseStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getServiceStatusResponse_ServiceStatusData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceManagementService.GetServiceStatusResponseData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (updateHistoryResponseEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.GetUpdateHistoryResponseStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUpdateHistoryResponse_UpdateHistory(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UpdateHistory",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (installUpdateRequestEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.InstallUpdateRequestStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getInstallUpdateRequest_UpdateID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UpdateID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInstallUpdateRequest_UpdateTimestamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UpdateTimestamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInstallUpdateRequest_UpdateURL(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UpdateURL",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInstallUpdateRequest_UpdateFileChecksum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UpdateFileChecksum",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInstallUpdateRequest_UpdateFileSize(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UpdateFileSize",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (installUpdateResponseEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.InstallUpdateResponseStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getInstallUpdateResponse_UpdateAccept(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UpdateAccept",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (retrieveUpdateStateRequestEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.RetrieveUpdateStateRequestStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRetrieveUpdateStateRequest_UpdateID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UpdateID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (retrieveUpdateStateResponseEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.RetrieveUpdateStateResponseStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRetrieveUpdateStateResponse_UpdateStateData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UpdateStateData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (updateHistoryEntryEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.UpdateHistoryEntryStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUpdateHistoryEntry_UpdateID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UpdateID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUpdateHistoryEntry_UpdateTimestamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UpdateTimestamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUpdateHistoryEntry_UpdateURL(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UpdateURL",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUpdateHistoryEntry_UpdateStatus(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UpdateStatus",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUpdateHistoryEntry_DataVersionList(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DataVersionList",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUpdateHistoryEntry_UpdateDetails(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UpdateDetails",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (updateHistoryEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.UpdateHistoryStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUpdateHistory_UpdateHistoryEntry(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UpdateHistoryEntry",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (updateStateDataEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.UpdateStateDataStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUpdateStateData_UpdateID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UpdateID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUpdateStateData_UpdateTimestamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UpdateTimestamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUpdateStateData_UpdateStatus(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UpdateStatus",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUpdateStateData_UpdateDetails(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UpdateDetails",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceStatusInformationEClass,
		   source,
		   new String[] {
			   "name", "DeviceStatusInformationStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceStatusInformation_DeviceState(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceState",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceStatusInformation_DeviceStatusList(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceStatusList",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceStatusEClass,
		   source,
		   new String[] {
			   "name", "DeviceStatusStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceStatus_DeviceStatusName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceStatusName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceStatus_DeviceStatusFlag(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceStatusFlag",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceStatus_DeviceStatusImpact(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceStatusImpact",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceStatus_DeviceStatusPriority(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceStatusPriority",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (subdeviceErrorMessagesEClass,
		   source,
		   new String[] {
			   "name", "SubdeviceErrorMessagesStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSubdeviceErrorMessages_SubdeviceName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SubdeviceName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSubdeviceErrorMessages_ErrorMessage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ErrorMessage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (subdeviceInformationEClass,
		   source,
		   new String[] {
			   "name", "SubdeviceInformationStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSubdeviceInformation_SubdeviceName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SubdeviceName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSubdeviceInformation_DeviceInformation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceInformation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (subdeviceStatusInformationEClass,
		   source,
		   new String[] {
			   "name", "SubdeviceStatusInformationStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSubdeviceStatusInformation_SubdeviceName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SubdeviceName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSubdeviceStatusInformation_DeviceStatusInformation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceStatusInformation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (updateAcceptTypeEEnum,
		   source,
		   new String[] {
			   "name", "UpdateAcceptEnumeration"
		   });
		addAnnotation
		  (updateAcceptTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "UpdateAcceptEnumeration:Object",
			   "baseType", "UpdateAcceptEnumeration"
		   });
		addAnnotation
		  (updateStatusTypeEEnum,
		   source,
		   new String[] {
			   "name", "UpdateStatusEnumeration"
		   });
		addAnnotation
		  (updateStatusTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "UpdateStatusEnumeration:Object",
			   "baseType", "UpdateStatusEnumeration"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (checksumTypeEEnum,
		   source,
		   new String[] {
			   "documentation", "Types of checksum"
		   });
		addAnnotation
		  (checksumTypeEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Cyclic redundancy check, 32-bit"
		   });
		addAnnotation
		  (checksumTypeEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Message digest algorithm 5, 128-bit"
		   });
		addAnnotation
		  (checksumTypeEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Secure hash algorithm, 256-bit"
		   });
		addAnnotation
		  (getFinalizeUpdateResponse_UpdateStatus(),
		   source,
		   new String[] {
			   "documentation", "Status of update on its finalization"
		   });
		addAnnotation
		  (getDeviceErrorMessagesData_ErrorMessage(),
		   source,
		   new String[] {
			   "documentation", "Warnings and errors only, no state messages"
		   });
		addAnnotation
		  (getInstallUpdateRequest_UpdateID(),
		   source,
		   new String[] {
			   "documentation", "Unique id generated by the controller to identify an update job"
		   });
		addAnnotation
		  (getInstallUpdateRequest_UpdateTimestamp(),
		   source,
		   new String[] {
			   "documentation", "Timestamp used for GetUpdateHistory and RetrieveUpdateState responses and for logging"
		   });
		addAnnotation
		  (getInstallUpdateRequest_UpdateURL(),
		   source,
		   new String[] {
			   "documentation", "URL from which the device shall download the update file"
		   });
		addAnnotation
		  (getInstallUpdateRequest_UpdateFileChecksum(),
		   source,
		   new String[] {
			   "documentation", "Optional checksum of update file"
		   });
		addAnnotation
		  (getInstallUpdateRequest_UpdateFileSize(),
		   source,
		   new String[] {
			   "documentation", "Optional size of update file"
		   });
		addAnnotation
		  (getUpdateHistoryEntry_UpdateTimestamp(),
		   source,
		   new String[] {
			   "documentation", "Timestamp given by operation InstallUpdate"
		   });
		addAnnotation
		  (getUpdateHistoryEntry_UpdateURL(),
		   source,
		   new String[] {
			   "documentation", "URL from which the device downloaded the update file"
		   });
		addAnnotation
		  (getUpdateHistoryEntry_UpdateStatus(),
		   source,
		   new String[] {
			   "documentation", "Status of update. Typically final status (InstallationSuccessfull or InstallationFailed)"
		   });
		addAnnotation
		  (getUpdateHistoryEntry_DataVersionList(),
		   source,
		   new String[] {
			   "documentation", "Optional list of updated components"
		   });
		addAnnotation
		  (getUpdateHistoryEntry_UpdateDetails(),
		   source,
		   new String[] {
			   "documentation", "Optional device specific update log"
		   });
		addAnnotation
		  (getUpdateHistory_UpdateHistoryEntry(),
		   source,
		   new String[] {
			   "documentation", "Minimum requirement for any device allowing updates is an update history depth of 1, \n\t\t\t\t\ti.e. history shall contain at least the last update performed (regardless of its result), if there was any."
		   });
		addAnnotation
		  (getUpdateStateData_UpdateTimestamp(),
		   source,
		   new String[] {
			   "documentation", "Timestamp given by operation InstallUpdate"
		   });
		addAnnotation
		  (getUpdateStateData_UpdateStatus(),
		   source,
		   new String[] {
			   "documentation", "Current status of update"
		   });
		addAnnotation
		  (getUpdateStateData_UpdateDetails(),
		   source,
		   new String[] {
			   "documentation", "Optional device specific update log"
		   });
		addAnnotation
		  (subdeviceErrorMessagesEClass,
		   source,
		   new String[] {
			   "documentation", "Error messages of named subdevice"
		   });
		addAnnotation
		  (getSubdeviceErrorMessages_SubdeviceName(),
		   source,
		   new String[] {
			   "documentation", "Used to identify subdevice"
		   });
		addAnnotation
		  (getSubdeviceErrorMessages_ErrorMessage(),
		   source,
		   new String[] {
			   "documentation", "Warnings and errors only, no state messages"
		   });
		addAnnotation
		  (subdeviceInformationEClass,
		   source,
		   new String[] {
			   "documentation", "Information on named subdevice"
		   });
		addAnnotation
		  (getSubdeviceInformation_SubdeviceName(),
		   source,
		   new String[] {
			   "documentation", "Used to identify subdevice"
		   });
		addAnnotation
		  (getSubdeviceInformation_DeviceInformation(),
		   source,
		   new String[] {
			   "documentation", "Information on subdevice"
		   });
		addAnnotation
		  (subdeviceStatusInformationEClass,
		   source,
		   new String[] {
			   "documentation", "Status information of named subdevice"
		   });
		addAnnotation
		  (getSubdeviceStatusInformation_SubdeviceName(),
		   source,
		   new String[] {
			   "documentation", "Used to identify subdevice"
		   });
		addAnnotation
		  (getSubdeviceStatusInformation_DeviceStatusInformation(),
		   source,
		   new String[] {
			   "documentation", "Status information of subdevice"
		   });
		addAnnotation
		  (updateAcceptTypeEEnum,
		   source,
		   new String[] {
			   "documentation", "Information about the result of InstallUpdate"
		   });
		addAnnotation
		  (updateAcceptTypeEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Update will be performed"
		   });
		addAnnotation
		  (updateAcceptTypeEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "URL type has been rejected, e.g. FTP may not supported by some devices"
		   });
		addAnnotation
		  (updateAcceptTypeEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "No updates are possible"
		   });
		addAnnotation
		  (updateAcceptTypeEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Update has to be postponed"
		   });
		addAnnotation
		  (updateStatusTypeEEnum,
		   source,
		   new String[] {
			   "documentation", "Information about the current status of update"
		   });
		addAnnotation
		  (updateStatusTypeEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Update in progress"
		   });
		addAnnotation
		  (updateStatusTypeEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Device has to be restarted by operation RestartDevice"
		   });
		addAnnotation
		  (updateStatusTypeEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Specified update file could not be downloaded from URL"
		   });
		addAnnotation
		  (updateStatusTypeEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Specified update file is not usable"
		   });
		addAnnotation
		  (updateStatusTypeEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "State of device firmware already as required"
		   });
		addAnnotation
		  (updateStatusTypeEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "documentation", "Update failed e.g. due to memory write error"
		   });
		addAnnotation
		  (updateStatusTypeEEnum.getELiterals().get(6),
		   source,
		   new String[] {
			   "documentation", "Update successfully completed"
		   });
	}

} //IbisDeviceManagementServicePackageImpl
