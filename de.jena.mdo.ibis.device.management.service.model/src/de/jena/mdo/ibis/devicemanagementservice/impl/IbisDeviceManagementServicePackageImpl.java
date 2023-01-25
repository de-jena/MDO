/**
 */
package de.jena.mdo.ibis.devicemanagementservice.impl;

import de.jena.mdo.ibis.common.IbisCommonPackage;

import de.jena.mdo.ibis.devicemanagementservice.ChecksumStructure;
import de.jena.mdo.ibis.devicemanagementservice.ChecksumTypeEnumeration;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceFinalizeUpdateRequestStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceFinalizeUpdateResponseStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceInformationResponseStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceConfigurationResponseDataStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceConfigurationResponseStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceErrorMessagesResponseStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceInformationResponseDataStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceInformationResponseStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceStatusInformationResponseDataStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceStatusInformationResponseStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceStatusResponseDataStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceStatusResponseStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetServiceInformationResponseDataStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetServiceInformationResponseStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetServiceStatusResponseDataStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetServiceStatusResponseStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetUpdateHistoryResponseStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceInstallUpdateRequestStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceInstallUpdateResponseStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceRetrieveUpdateStateRequestStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceRetrieveUpdateStateResponseStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateHistoryEntryStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateHistoryStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateStateDataStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceStatusInformationStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceStatusStructure;
import de.jena.mdo.ibis.devicemanagementservice.IbisDeviceManagementServiceFactory;
import de.jena.mdo.ibis.devicemanagementservice.IbisDeviceManagementServicePackage;
import de.jena.mdo.ibis.devicemanagementservice.SubdeviceErrorMessagesStructure;
import de.jena.mdo.ibis.devicemanagementservice.SubdeviceInformationStructure;
import de.jena.mdo.ibis.devicemanagementservice.SubdeviceStatusInformationStructure;
import de.jena.mdo.ibis.devicemanagementservice.UpdateAcceptEnumeration;
import de.jena.mdo.ibis.devicemanagementservice.UpdateStatusEnumeration;

import de.jena.mdo.ibis.enumerations.IbisEnumerationsPackage;

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
	private EClass checksumStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceManagementServiceFinalizeUpdateRequestStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceManagementServiceFinalizeUpdateResponseStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceManagementServiceGetAllSubdeviceInformationResponseDataStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceManagementServiceGetAllSubdeviceInformationResponseStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceManagementServiceGetAllSubdeviceStatusInformationResponseStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceManagementServiceGetDeviceConfigurationResponseDataStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceManagementServiceGetDeviceConfigurationResponseStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceManagementServiceGetDeviceErrorMessagesResponseDataStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceManagementServiceGetDeviceErrorMessagesResponseStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceManagementServiceGetDeviceInformationResponseDataStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceManagementServiceGetDeviceInformationResponseStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceManagementServiceGetDeviceStatusInformationResponseDataStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceManagementServiceGetDeviceStatusInformationResponseStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceManagementServiceGetDeviceStatusResponseDataStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceManagementServiceGetDeviceStatusResponseStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceManagementServiceGetServiceInformationResponseDataStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceManagementServiceGetServiceInformationResponseStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceManagementServiceGetServiceStatusResponseDataStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceManagementServiceGetServiceStatusResponseStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceManagementServiceGetUpdateHistoryResponseStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceManagementServiceInstallUpdateRequestStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceManagementServiceInstallUpdateResponseStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceManagementServiceRetrieveUpdateStateRequestStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceManagementServiceRetrieveUpdateStateResponseStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceManagementServiceUpdateHistoryEntryStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceManagementServiceUpdateHistoryStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceManagementServiceUpdateStateDataStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceStatusInformationStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceStatusStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subdeviceErrorMessagesStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subdeviceInformationStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subdeviceStatusInformationStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum checksumTypeEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum updateAcceptEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum updateStatusEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType checksumTypeEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType updateAcceptEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType updateStatusEnumerationObjectEDataType = null;

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
	 * @see de.jena.mdo.ibis.devicemanagementservice.IbisDeviceManagementServicePackage#eNS_URI
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
	public EClass getChecksumStructure() {
		return checksumStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChecksumStructure_ChecksumType() {
		return (EAttribute)checksumStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChecksumStructure_Checksum() {
		return (EReference)checksumStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceFinalizeUpdateRequestStructure() {
		return deviceManagementServiceFinalizeUpdateRequestStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceFinalizeUpdateRequestStructure_UpdateID() {
		return (EReference)deviceManagementServiceFinalizeUpdateRequestStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceFinalizeUpdateResponseStructure() {
		return deviceManagementServiceFinalizeUpdateResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceManagementServiceFinalizeUpdateResponseStructure_UpdateStatus() {
		return (EAttribute)deviceManagementServiceFinalizeUpdateResponseStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceFinalizeUpdateResponseStructure_OperationErrorMessage() {
		return (EReference)deviceManagementServiceFinalizeUpdateResponseStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure() {
		return deviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure_TimeStamp() {
		return (EReference)deviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure_SubdeviceErrorMessagesList() {
		return (EReference)deviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure() {
		return deviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure_DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseData() {
		return (EReference)deviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure_OperationErrorMessage() {
		return (EReference)deviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure() {
		return deviceManagementServiceGetAllSubdeviceInformationResponseDataStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure_TimeStamp() {
		return (EReference)deviceManagementServiceGetAllSubdeviceInformationResponseDataStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure_SubdeviceInformationList() {
		return (EReference)deviceManagementServiceGetAllSubdeviceInformationResponseDataStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceGetAllSubdeviceInformationResponseStructure() {
		return deviceManagementServiceGetAllSubdeviceInformationResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetAllSubdeviceInformationResponseStructure_DeviceManagementServiceGetAllSubdeviceInformationResponseData() {
		return (EReference)deviceManagementServiceGetAllSubdeviceInformationResponseStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetAllSubdeviceInformationResponseStructure_OperationErrorMessage() {
		return (EReference)deviceManagementServiceGetAllSubdeviceInformationResponseStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure() {
		return deviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure_TimeStamp() {
		return (EReference)deviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure_SubdeviceStatusInformationList() {
		return (EReference)deviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure() {
		return deviceManagementServiceGetAllSubdeviceStatusInformationResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure_DeviceManagementServiceGetAllSubdeviceStatusInformationResponseData() {
		return (EReference)deviceManagementServiceGetAllSubdeviceStatusInformationResponseStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure_OperationErrorMessage() {
		return (EReference)deviceManagementServiceGetAllSubdeviceStatusInformationResponseStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceGetDeviceConfigurationResponseDataStructure() {
		return deviceManagementServiceGetDeviceConfigurationResponseDataStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetDeviceConfigurationResponseDataStructure_TimeStamp() {
		return (EReference)deviceManagementServiceGetDeviceConfigurationResponseDataStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetDeviceConfigurationResponseDataStructure_DeviceID() {
		return (EReference)deviceManagementServiceGetDeviceConfigurationResponseDataStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceGetDeviceConfigurationResponseStructure() {
		return deviceManagementServiceGetDeviceConfigurationResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetDeviceConfigurationResponseStructure_DeviceManagementServiceGetDeviceConfigurationResponseData() {
		return (EReference)deviceManagementServiceGetDeviceConfigurationResponseStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetDeviceConfigurationResponseStructure_OperationErrorMessage() {
		return (EReference)deviceManagementServiceGetDeviceConfigurationResponseStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure() {
		return deviceManagementServiceGetDeviceErrorMessagesResponseDataStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure_TimeStamp() {
		return (EReference)deviceManagementServiceGetDeviceErrorMessagesResponseDataStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure_ErrorMessage() {
		return (EReference)deviceManagementServiceGetDeviceErrorMessagesResponseDataStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceGetDeviceErrorMessagesResponseStructure() {
		return deviceManagementServiceGetDeviceErrorMessagesResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetDeviceErrorMessagesResponseStructure_DeviceManagementServiceGetDeviceErrorMessagesResponseData() {
		return (EReference)deviceManagementServiceGetDeviceErrorMessagesResponseStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetDeviceErrorMessagesResponseStructure_OperationErrorMessage() {
		return (EReference)deviceManagementServiceGetDeviceErrorMessagesResponseStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceGetDeviceInformationResponseDataStructure() {
		return deviceManagementServiceGetDeviceInformationResponseDataStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetDeviceInformationResponseDataStructure_TimeStamp() {
		return (EReference)deviceManagementServiceGetDeviceInformationResponseDataStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetDeviceInformationResponseDataStructure_DeviceInformation() {
		return (EReference)deviceManagementServiceGetDeviceInformationResponseDataStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceGetDeviceInformationResponseStructure() {
		return deviceManagementServiceGetDeviceInformationResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetDeviceInformationResponseStructure_DeviceManagementServiceGetDeviceInformationResponseData() {
		return (EReference)deviceManagementServiceGetDeviceInformationResponseStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetDeviceInformationResponseStructure_OperationErrorMessage() {
		return (EReference)deviceManagementServiceGetDeviceInformationResponseStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceGetDeviceStatusInformationResponseDataStructure() {
		return deviceManagementServiceGetDeviceStatusInformationResponseDataStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetDeviceStatusInformationResponseDataStructure_TimeStamp() {
		return (EReference)deviceManagementServiceGetDeviceStatusInformationResponseDataStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetDeviceStatusInformationResponseDataStructure_DeviceStatusInformation() {
		return (EReference)deviceManagementServiceGetDeviceStatusInformationResponseDataStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceGetDeviceStatusInformationResponseStructure() {
		return deviceManagementServiceGetDeviceStatusInformationResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetDeviceStatusInformationResponseStructure_DeviceManagementServiceGetDeviceStatusInformationResponseData() {
		return (EReference)deviceManagementServiceGetDeviceStatusInformationResponseStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetDeviceStatusInformationResponseStructure_OperationErrorMessage() {
		return (EReference)deviceManagementServiceGetDeviceStatusInformationResponseStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceGetDeviceStatusResponseDataStructure() {
		return deviceManagementServiceGetDeviceStatusResponseDataStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetDeviceStatusResponseDataStructure_TimeStamp() {
		return (EReference)deviceManagementServiceGetDeviceStatusResponseDataStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceManagementServiceGetDeviceStatusResponseDataStructure_DeviceState() {
		return (EAttribute)deviceManagementServiceGetDeviceStatusResponseDataStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceGetDeviceStatusResponseStructure() {
		return deviceManagementServiceGetDeviceStatusResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetDeviceStatusResponseStructure_DeviceManagementServiceGetDeviceStatusResponseData() {
		return (EReference)deviceManagementServiceGetDeviceStatusResponseStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetDeviceStatusResponseStructure_OperationErrorMessage() {
		return (EReference)deviceManagementServiceGetDeviceStatusResponseStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceGetServiceInformationResponseDataStructure() {
		return deviceManagementServiceGetServiceInformationResponseDataStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetServiceInformationResponseDataStructure_TimeStamp() {
		return (EReference)deviceManagementServiceGetServiceInformationResponseDataStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetServiceInformationResponseDataStructure_ServiceInformationList() {
		return (EReference)deviceManagementServiceGetServiceInformationResponseDataStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceGetServiceInformationResponseStructure() {
		return deviceManagementServiceGetServiceInformationResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetServiceInformationResponseStructure_DeviceManagementServiceGetServiceInformationResponseData() {
		return (EReference)deviceManagementServiceGetServiceInformationResponseStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetServiceInformationResponseStructure_OperationErrorMessage() {
		return (EReference)deviceManagementServiceGetServiceInformationResponseStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceGetServiceStatusResponseDataStructure() {
		return deviceManagementServiceGetServiceStatusResponseDataStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetServiceStatusResponseDataStructure_TimeStamp() {
		return (EReference)deviceManagementServiceGetServiceStatusResponseDataStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetServiceStatusResponseDataStructure_ServiceSpecificationWithStateList() {
		return (EReference)deviceManagementServiceGetServiceStatusResponseDataStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceGetServiceStatusResponseStructure() {
		return deviceManagementServiceGetServiceStatusResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetServiceStatusResponseStructure_DeviceManagementServiceGetServiceStatusResponseData() {
		return (EReference)deviceManagementServiceGetServiceStatusResponseStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetServiceStatusResponseStructure_OperationErrorMessage() {
		return (EReference)deviceManagementServiceGetServiceStatusResponseStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceGetUpdateHistoryResponseStructure() {
		return deviceManagementServiceGetUpdateHistoryResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetUpdateHistoryResponseStructure_UpdateHistory() {
		return (EReference)deviceManagementServiceGetUpdateHistoryResponseStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetUpdateHistoryResponseStructure_OperationErrorMessage() {
		return (EReference)deviceManagementServiceGetUpdateHistoryResponseStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceInstallUpdateRequestStructure() {
		return deviceManagementServiceInstallUpdateRequestStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceInstallUpdateRequestStructure_UpdateID() {
		return (EReference)deviceManagementServiceInstallUpdateRequestStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceInstallUpdateRequestStructure_UpdateTimestamp() {
		return (EReference)deviceManagementServiceInstallUpdateRequestStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceInstallUpdateRequestStructure_UpdateURL() {
		return (EReference)deviceManagementServiceInstallUpdateRequestStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceInstallUpdateRequestStructure_UpdateFileChecksum() {
		return (EReference)deviceManagementServiceInstallUpdateRequestStructureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceInstallUpdateRequestStructure_UpdateFileSize() {
		return (EReference)deviceManagementServiceInstallUpdateRequestStructureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceInstallUpdateResponseStructure() {
		return deviceManagementServiceInstallUpdateResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceManagementServiceInstallUpdateResponseStructure_UpdateAccept() {
		return (EAttribute)deviceManagementServiceInstallUpdateResponseStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceInstallUpdateResponseStructure_OperationErrorMessage() {
		return (EReference)deviceManagementServiceInstallUpdateResponseStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceRetrieveUpdateStateRequestStructure() {
		return deviceManagementServiceRetrieveUpdateStateRequestStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceRetrieveUpdateStateRequestStructure_UpdateID() {
		return (EReference)deviceManagementServiceRetrieveUpdateStateRequestStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceRetrieveUpdateStateResponseStructure() {
		return deviceManagementServiceRetrieveUpdateStateResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceRetrieveUpdateStateResponseStructure_UpdateStateData() {
		return (EReference)deviceManagementServiceRetrieveUpdateStateResponseStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceRetrieveUpdateStateResponseStructure_OperationErrorMessage() {
		return (EReference)deviceManagementServiceRetrieveUpdateStateResponseStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceUpdateHistoryEntryStructure() {
		return deviceManagementServiceUpdateHistoryEntryStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceUpdateHistoryEntryStructure_UpdateID() {
		return (EReference)deviceManagementServiceUpdateHistoryEntryStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceUpdateHistoryEntryStructure_UpdateTimestamp() {
		return (EReference)deviceManagementServiceUpdateHistoryEntryStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceUpdateHistoryEntryStructure_UpdateURL() {
		return (EReference)deviceManagementServiceUpdateHistoryEntryStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceManagementServiceUpdateHistoryEntryStructure_UpdateStatus() {
		return (EAttribute)deviceManagementServiceUpdateHistoryEntryStructureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceUpdateHistoryEntryStructure_DataVersionList() {
		return (EReference)deviceManagementServiceUpdateHistoryEntryStructureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceUpdateHistoryEntryStructure_UpdateDetails() {
		return (EReference)deviceManagementServiceUpdateHistoryEntryStructureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceUpdateHistoryStructure() {
		return deviceManagementServiceUpdateHistoryStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceUpdateHistoryStructure_UpdateHistoryEntry() {
		return (EReference)deviceManagementServiceUpdateHistoryStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceUpdateStateDataStructure() {
		return deviceManagementServiceUpdateStateDataStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceUpdateStateDataStructure_UpdateID() {
		return (EReference)deviceManagementServiceUpdateStateDataStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceUpdateStateDataStructure_UpdateTimestamp() {
		return (EReference)deviceManagementServiceUpdateStateDataStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceManagementServiceUpdateStateDataStructure_UpdateStatus() {
		return (EAttribute)deviceManagementServiceUpdateStateDataStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceUpdateStateDataStructure_UpdateDetails() {
		return (EReference)deviceManagementServiceUpdateStateDataStructureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceStatusInformationStructure() {
		return deviceStatusInformationStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceStatusInformationStructure_DeviceState() {
		return (EAttribute)deviceStatusInformationStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceStatusInformationStructure_DeviceStatusList() {
		return (EReference)deviceStatusInformationStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceStatusStructure() {
		return deviceStatusStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceStatusStructure_DeviceStatusName() {
		return (EReference)deviceStatusStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceStatusStructure_DeviceStatusFlag() {
		return (EReference)deviceStatusStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceStatusStructure_DeviceStatusImpact() {
		return (EAttribute)deviceStatusStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceStatusStructure_DeviceStatusPriority() {
		return (EReference)deviceStatusStructureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubdeviceErrorMessagesStructure() {
		return subdeviceErrorMessagesStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubdeviceErrorMessagesStructure_SubdeviceName() {
		return (EReference)subdeviceErrorMessagesStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubdeviceErrorMessagesStructure_ErrorMessage() {
		return (EReference)subdeviceErrorMessagesStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubdeviceInformationStructure() {
		return subdeviceInformationStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubdeviceInformationStructure_SubdeviceName() {
		return (EReference)subdeviceInformationStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubdeviceInformationStructure_DeviceInformation() {
		return (EReference)subdeviceInformationStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubdeviceStatusInformationStructure() {
		return subdeviceStatusInformationStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubdeviceStatusInformationStructure_SubdeviceName() {
		return (EReference)subdeviceStatusInformationStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubdeviceStatusInformationStructure_DeviceStatusInformation() {
		return (EReference)subdeviceStatusInformationStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getChecksumTypeEnumeration() {
		return checksumTypeEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUpdateAcceptEnumeration() {
		return updateAcceptEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUpdateStatusEnumeration() {
		return updateStatusEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getChecksumTypeEnumerationObject() {
		return checksumTypeEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUpdateAcceptEnumerationObject() {
		return updateAcceptEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUpdateStatusEnumerationObject() {
		return updateStatusEnumerationObjectEDataType;
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
		checksumStructureEClass = createEClass(CHECKSUM_STRUCTURE);
		createEAttribute(checksumStructureEClass, CHECKSUM_STRUCTURE__CHECKSUM_TYPE);
		createEReference(checksumStructureEClass, CHECKSUM_STRUCTURE__CHECKSUM);

		deviceManagementServiceFinalizeUpdateRequestStructureEClass = createEClass(DEVICE_MANAGEMENT_SERVICE_FINALIZE_UPDATE_REQUEST_STRUCTURE);
		createEReference(deviceManagementServiceFinalizeUpdateRequestStructureEClass, DEVICE_MANAGEMENT_SERVICE_FINALIZE_UPDATE_REQUEST_STRUCTURE__UPDATE_ID);

		deviceManagementServiceFinalizeUpdateResponseStructureEClass = createEClass(DEVICE_MANAGEMENT_SERVICE_FINALIZE_UPDATE_RESPONSE_STRUCTURE);
		createEAttribute(deviceManagementServiceFinalizeUpdateResponseStructureEClass, DEVICE_MANAGEMENT_SERVICE_FINALIZE_UPDATE_RESPONSE_STRUCTURE__UPDATE_STATUS);
		createEReference(deviceManagementServiceFinalizeUpdateResponseStructureEClass, DEVICE_MANAGEMENT_SERVICE_FINALIZE_UPDATE_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE);

		deviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructureEClass = createEClass(DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_DATA_STRUCTURE);
		createEReference(deviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructureEClass, DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_DATA_STRUCTURE__TIME_STAMP);
		createEReference(deviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructureEClass, DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_DATA_STRUCTURE__SUBDEVICE_ERROR_MESSAGES_LIST);

		deviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructureEClass = createEClass(DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_STRUCTURE);
		createEReference(deviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructureEClass, DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_DATA);
		createEReference(deviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructureEClass, DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE);

		deviceManagementServiceGetAllSubdeviceInformationResponseDataStructureEClass = createEClass(DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_INFORMATION_RESPONSE_DATA_STRUCTURE);
		createEReference(deviceManagementServiceGetAllSubdeviceInformationResponseDataStructureEClass, DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_INFORMATION_RESPONSE_DATA_STRUCTURE__TIME_STAMP);
		createEReference(deviceManagementServiceGetAllSubdeviceInformationResponseDataStructureEClass, DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_INFORMATION_RESPONSE_DATA_STRUCTURE__SUBDEVICE_INFORMATION_LIST);

		deviceManagementServiceGetAllSubdeviceInformationResponseStructureEClass = createEClass(DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_INFORMATION_RESPONSE_STRUCTURE);
		createEReference(deviceManagementServiceGetAllSubdeviceInformationResponseStructureEClass, DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_INFORMATION_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_INFORMATION_RESPONSE_DATA);
		createEReference(deviceManagementServiceGetAllSubdeviceInformationResponseStructureEClass, DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_INFORMATION_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE);

		deviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructureEClass = createEClass(DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_DATA_STRUCTURE);
		createEReference(deviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructureEClass, DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_DATA_STRUCTURE__TIME_STAMP);
		createEReference(deviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructureEClass, DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_DATA_STRUCTURE__SUBDEVICE_STATUS_INFORMATION_LIST);

		deviceManagementServiceGetAllSubdeviceStatusInformationResponseStructureEClass = createEClass(DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE);
		createEReference(deviceManagementServiceGetAllSubdeviceStatusInformationResponseStructureEClass, DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_DATA);
		createEReference(deviceManagementServiceGetAllSubdeviceStatusInformationResponseStructureEClass, DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE);

		deviceManagementServiceGetDeviceConfigurationResponseDataStructureEClass = createEClass(DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_DATA_STRUCTURE);
		createEReference(deviceManagementServiceGetDeviceConfigurationResponseDataStructureEClass, DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_DATA_STRUCTURE__TIME_STAMP);
		createEReference(deviceManagementServiceGetDeviceConfigurationResponseDataStructureEClass, DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_DATA_STRUCTURE__DEVICE_ID);

		deviceManagementServiceGetDeviceConfigurationResponseStructureEClass = createEClass(DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_STRUCTURE);
		createEReference(deviceManagementServiceGetDeviceConfigurationResponseStructureEClass, DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_DATA);
		createEReference(deviceManagementServiceGetDeviceConfigurationResponseStructureEClass, DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE);

		deviceManagementServiceGetDeviceErrorMessagesResponseDataStructureEClass = createEClass(DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_DATA_STRUCTURE);
		createEReference(deviceManagementServiceGetDeviceErrorMessagesResponseDataStructureEClass, DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_DATA_STRUCTURE__TIME_STAMP);
		createEReference(deviceManagementServiceGetDeviceErrorMessagesResponseDataStructureEClass, DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_DATA_STRUCTURE__ERROR_MESSAGE);

		deviceManagementServiceGetDeviceErrorMessagesResponseStructureEClass = createEClass(DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_STRUCTURE);
		createEReference(deviceManagementServiceGetDeviceErrorMessagesResponseStructureEClass, DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_DATA);
		createEReference(deviceManagementServiceGetDeviceErrorMessagesResponseStructureEClass, DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE);

		deviceManagementServiceGetDeviceInformationResponseDataStructureEClass = createEClass(DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_DATA_STRUCTURE);
		createEReference(deviceManagementServiceGetDeviceInformationResponseDataStructureEClass, DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_DATA_STRUCTURE__TIME_STAMP);
		createEReference(deviceManagementServiceGetDeviceInformationResponseDataStructureEClass, DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_DATA_STRUCTURE__DEVICE_INFORMATION);

		deviceManagementServiceGetDeviceInformationResponseStructureEClass = createEClass(DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_STRUCTURE);
		createEReference(deviceManagementServiceGetDeviceInformationResponseStructureEClass, DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_DATA);
		createEReference(deviceManagementServiceGetDeviceInformationResponseStructureEClass, DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE);

		deviceManagementServiceGetDeviceStatusInformationResponseDataStructureEClass = createEClass(DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_DATA_STRUCTURE);
		createEReference(deviceManagementServiceGetDeviceStatusInformationResponseDataStructureEClass, DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_DATA_STRUCTURE__TIME_STAMP);
		createEReference(deviceManagementServiceGetDeviceStatusInformationResponseDataStructureEClass, DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_DATA_STRUCTURE__DEVICE_STATUS_INFORMATION);

		deviceManagementServiceGetDeviceStatusInformationResponseStructureEClass = createEClass(DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE);
		createEReference(deviceManagementServiceGetDeviceStatusInformationResponseStructureEClass, DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_DATA);
		createEReference(deviceManagementServiceGetDeviceStatusInformationResponseStructureEClass, DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE);

		deviceManagementServiceGetDeviceStatusResponseDataStructureEClass = createEClass(DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_RESPONSE_DATA_STRUCTURE);
		createEReference(deviceManagementServiceGetDeviceStatusResponseDataStructureEClass, DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_RESPONSE_DATA_STRUCTURE__TIME_STAMP);
		createEAttribute(deviceManagementServiceGetDeviceStatusResponseDataStructureEClass, DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_RESPONSE_DATA_STRUCTURE__DEVICE_STATE);

		deviceManagementServiceGetDeviceStatusResponseStructureEClass = createEClass(DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_RESPONSE_STRUCTURE);
		createEReference(deviceManagementServiceGetDeviceStatusResponseStructureEClass, DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_RESPONSE_DATA);
		createEReference(deviceManagementServiceGetDeviceStatusResponseStructureEClass, DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE);

		deviceManagementServiceGetServiceInformationResponseDataStructureEClass = createEClass(DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_INFORMATION_RESPONSE_DATA_STRUCTURE);
		createEReference(deviceManagementServiceGetServiceInformationResponseDataStructureEClass, DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_INFORMATION_RESPONSE_DATA_STRUCTURE__TIME_STAMP);
		createEReference(deviceManagementServiceGetServiceInformationResponseDataStructureEClass, DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_INFORMATION_RESPONSE_DATA_STRUCTURE__SERVICE_INFORMATION_LIST);

		deviceManagementServiceGetServiceInformationResponseStructureEClass = createEClass(DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_INFORMATION_RESPONSE_STRUCTURE);
		createEReference(deviceManagementServiceGetServiceInformationResponseStructureEClass, DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_INFORMATION_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_INFORMATION_RESPONSE_DATA);
		createEReference(deviceManagementServiceGetServiceInformationResponseStructureEClass, DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_INFORMATION_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE);

		deviceManagementServiceGetServiceStatusResponseDataStructureEClass = createEClass(DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_STATUS_RESPONSE_DATA_STRUCTURE);
		createEReference(deviceManagementServiceGetServiceStatusResponseDataStructureEClass, DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_STATUS_RESPONSE_DATA_STRUCTURE__TIME_STAMP);
		createEReference(deviceManagementServiceGetServiceStatusResponseDataStructureEClass, DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_STATUS_RESPONSE_DATA_STRUCTURE__SERVICE_SPECIFICATION_WITH_STATE_LIST);

		deviceManagementServiceGetServiceStatusResponseStructureEClass = createEClass(DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_STATUS_RESPONSE_STRUCTURE);
		createEReference(deviceManagementServiceGetServiceStatusResponseStructureEClass, DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_STATUS_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_STATUS_RESPONSE_DATA);
		createEReference(deviceManagementServiceGetServiceStatusResponseStructureEClass, DEVICE_MANAGEMENT_SERVICE_GET_SERVICE_STATUS_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE);

		deviceManagementServiceGetUpdateHistoryResponseStructureEClass = createEClass(DEVICE_MANAGEMENT_SERVICE_GET_UPDATE_HISTORY_RESPONSE_STRUCTURE);
		createEReference(deviceManagementServiceGetUpdateHistoryResponseStructureEClass, DEVICE_MANAGEMENT_SERVICE_GET_UPDATE_HISTORY_RESPONSE_STRUCTURE__UPDATE_HISTORY);
		createEReference(deviceManagementServiceGetUpdateHistoryResponseStructureEClass, DEVICE_MANAGEMENT_SERVICE_GET_UPDATE_HISTORY_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE);

		deviceManagementServiceInstallUpdateRequestStructureEClass = createEClass(DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE);
		createEReference(deviceManagementServiceInstallUpdateRequestStructureEClass, DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_ID);
		createEReference(deviceManagementServiceInstallUpdateRequestStructureEClass, DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_TIMESTAMP);
		createEReference(deviceManagementServiceInstallUpdateRequestStructureEClass, DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_URL);
		createEReference(deviceManagementServiceInstallUpdateRequestStructureEClass, DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_FILE_CHECKSUM);
		createEReference(deviceManagementServiceInstallUpdateRequestStructureEClass, DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_REQUEST_STRUCTURE__UPDATE_FILE_SIZE);

		deviceManagementServiceInstallUpdateResponseStructureEClass = createEClass(DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_RESPONSE_STRUCTURE);
		createEAttribute(deviceManagementServiceInstallUpdateResponseStructureEClass, DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_RESPONSE_STRUCTURE__UPDATE_ACCEPT);
		createEReference(deviceManagementServiceInstallUpdateResponseStructureEClass, DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE);

		deviceManagementServiceRetrieveUpdateStateRequestStructureEClass = createEClass(DEVICE_MANAGEMENT_SERVICE_RETRIEVE_UPDATE_STATE_REQUEST_STRUCTURE);
		createEReference(deviceManagementServiceRetrieveUpdateStateRequestStructureEClass, DEVICE_MANAGEMENT_SERVICE_RETRIEVE_UPDATE_STATE_REQUEST_STRUCTURE__UPDATE_ID);

		deviceManagementServiceRetrieveUpdateStateResponseStructureEClass = createEClass(DEVICE_MANAGEMENT_SERVICE_RETRIEVE_UPDATE_STATE_RESPONSE_STRUCTURE);
		createEReference(deviceManagementServiceRetrieveUpdateStateResponseStructureEClass, DEVICE_MANAGEMENT_SERVICE_RETRIEVE_UPDATE_STATE_RESPONSE_STRUCTURE__UPDATE_STATE_DATA);
		createEReference(deviceManagementServiceRetrieveUpdateStateResponseStructureEClass, DEVICE_MANAGEMENT_SERVICE_RETRIEVE_UPDATE_STATE_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE);

		deviceManagementServiceUpdateHistoryEntryStructureEClass = createEClass(DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE);
		createEReference(deviceManagementServiceUpdateHistoryEntryStructureEClass, DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_ID);
		createEReference(deviceManagementServiceUpdateHistoryEntryStructureEClass, DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_TIMESTAMP);
		createEReference(deviceManagementServiceUpdateHistoryEntryStructureEClass, DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_URL);
		createEAttribute(deviceManagementServiceUpdateHistoryEntryStructureEClass, DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_STATUS);
		createEReference(deviceManagementServiceUpdateHistoryEntryStructureEClass, DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__DATA_VERSION_LIST);
		createEReference(deviceManagementServiceUpdateHistoryEntryStructureEClass, DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_ENTRY_STRUCTURE__UPDATE_DETAILS);

		deviceManagementServiceUpdateHistoryStructureEClass = createEClass(DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_STRUCTURE);
		createEReference(deviceManagementServiceUpdateHistoryStructureEClass, DEVICE_MANAGEMENT_SERVICE_UPDATE_HISTORY_STRUCTURE__UPDATE_HISTORY_ENTRY);

		deviceManagementServiceUpdateStateDataStructureEClass = createEClass(DEVICE_MANAGEMENT_SERVICE_UPDATE_STATE_DATA_STRUCTURE);
		createEReference(deviceManagementServiceUpdateStateDataStructureEClass, DEVICE_MANAGEMENT_SERVICE_UPDATE_STATE_DATA_STRUCTURE__UPDATE_ID);
		createEReference(deviceManagementServiceUpdateStateDataStructureEClass, DEVICE_MANAGEMENT_SERVICE_UPDATE_STATE_DATA_STRUCTURE__UPDATE_TIMESTAMP);
		createEAttribute(deviceManagementServiceUpdateStateDataStructureEClass, DEVICE_MANAGEMENT_SERVICE_UPDATE_STATE_DATA_STRUCTURE__UPDATE_STATUS);
		createEReference(deviceManagementServiceUpdateStateDataStructureEClass, DEVICE_MANAGEMENT_SERVICE_UPDATE_STATE_DATA_STRUCTURE__UPDATE_DETAILS);

		deviceStatusInformationStructureEClass = createEClass(DEVICE_STATUS_INFORMATION_STRUCTURE);
		createEAttribute(deviceStatusInformationStructureEClass, DEVICE_STATUS_INFORMATION_STRUCTURE__DEVICE_STATE);
		createEReference(deviceStatusInformationStructureEClass, DEVICE_STATUS_INFORMATION_STRUCTURE__DEVICE_STATUS_LIST);

		deviceStatusStructureEClass = createEClass(DEVICE_STATUS_STRUCTURE);
		createEReference(deviceStatusStructureEClass, DEVICE_STATUS_STRUCTURE__DEVICE_STATUS_NAME);
		createEReference(deviceStatusStructureEClass, DEVICE_STATUS_STRUCTURE__DEVICE_STATUS_FLAG);
		createEAttribute(deviceStatusStructureEClass, DEVICE_STATUS_STRUCTURE__DEVICE_STATUS_IMPACT);
		createEReference(deviceStatusStructureEClass, DEVICE_STATUS_STRUCTURE__DEVICE_STATUS_PRIORITY);

		subdeviceErrorMessagesStructureEClass = createEClass(SUBDEVICE_ERROR_MESSAGES_STRUCTURE);
		createEReference(subdeviceErrorMessagesStructureEClass, SUBDEVICE_ERROR_MESSAGES_STRUCTURE__SUBDEVICE_NAME);
		createEReference(subdeviceErrorMessagesStructureEClass, SUBDEVICE_ERROR_MESSAGES_STRUCTURE__ERROR_MESSAGE);

		subdeviceInformationStructureEClass = createEClass(SUBDEVICE_INFORMATION_STRUCTURE);
		createEReference(subdeviceInformationStructureEClass, SUBDEVICE_INFORMATION_STRUCTURE__SUBDEVICE_NAME);
		createEReference(subdeviceInformationStructureEClass, SUBDEVICE_INFORMATION_STRUCTURE__DEVICE_INFORMATION);

		subdeviceStatusInformationStructureEClass = createEClass(SUBDEVICE_STATUS_INFORMATION_STRUCTURE);
		createEReference(subdeviceStatusInformationStructureEClass, SUBDEVICE_STATUS_INFORMATION_STRUCTURE__SUBDEVICE_NAME);
		createEReference(subdeviceStatusInformationStructureEClass, SUBDEVICE_STATUS_INFORMATION_STRUCTURE__DEVICE_STATUS_INFORMATION);

		// Create enums
		checksumTypeEnumerationEEnum = createEEnum(CHECKSUM_TYPE_ENUMERATION);
		updateAcceptEnumerationEEnum = createEEnum(UPDATE_ACCEPT_ENUMERATION);
		updateStatusEnumerationEEnum = createEEnum(UPDATE_STATUS_ENUMERATION);

		// Create data types
		checksumTypeEnumerationObjectEDataType = createEDataType(CHECKSUM_TYPE_ENUMERATION_OBJECT);
		updateAcceptEnumerationObjectEDataType = createEDataType(UPDATE_ACCEPT_ENUMERATION_OBJECT);
		updateStatusEnumerationObjectEDataType = createEDataType(UPDATE_STATUS_ENUMERATION_OBJECT);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(checksumStructureEClass, ChecksumStructure.class, "ChecksumStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChecksumStructure_ChecksumType(), this.getChecksumTypeEnumeration(), "checksumType", null, 1, 1, ChecksumStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChecksumStructure_Checksum(), theIbisCommonPackage.getIBISIPByte(), null, "checksum", null, 4, 32, ChecksumStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceManagementServiceFinalizeUpdateRequestStructureEClass, DeviceManagementServiceFinalizeUpdateRequestStructure.class, "DeviceManagementServiceFinalizeUpdateRequestStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceManagementServiceFinalizeUpdateRequestStructure_UpdateID(), theIbisCommonPackage.getIBISIPNMTOKEN(), null, "updateID", null, 1, 1, DeviceManagementServiceFinalizeUpdateRequestStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceManagementServiceFinalizeUpdateResponseStructureEClass, DeviceManagementServiceFinalizeUpdateResponseStructure.class, "DeviceManagementServiceFinalizeUpdateResponseStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeviceManagementServiceFinalizeUpdateResponseStructure_UpdateStatus(), this.getUpdateStatusEnumeration(), "updateStatus", null, 0, 1, DeviceManagementServiceFinalizeUpdateResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceManagementServiceFinalizeUpdateResponseStructure_OperationErrorMessage(), theIbisCommonPackage.getIBISIPString(), null, "operationErrorMessage", null, 0, 1, DeviceManagementServiceFinalizeUpdateResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructureEClass, DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure.class, "DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure_TimeStamp(), theIbisCommonPackage.getIBISIPDateTime(), null, "timeStamp", null, 1, 1, DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure_SubdeviceErrorMessagesList(), this.getSubdeviceErrorMessagesStructure(), null, "subdeviceErrorMessagesList", null, 1, 1, DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructureEClass, DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure.class, "DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure_DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseData(), this.getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure(), null, "deviceManagementServiceGetAllSubdeviceErrorMessagesResponseData", null, 0, 1, DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure_OperationErrorMessage(), theIbisCommonPackage.getIBISIPString(), null, "operationErrorMessage", null, 0, 1, DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceManagementServiceGetAllSubdeviceInformationResponseDataStructureEClass, DeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure.class, "DeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure_TimeStamp(), theIbisCommonPackage.getIBISIPDateTime(), null, "timeStamp", null, 1, 1, DeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure_SubdeviceInformationList(), this.getSubdeviceInformationStructure(), null, "subdeviceInformationList", null, 1, 1, DeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceManagementServiceGetAllSubdeviceInformationResponseStructureEClass, DeviceManagementServiceGetAllSubdeviceInformationResponseStructure.class, "DeviceManagementServiceGetAllSubdeviceInformationResponseStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceManagementServiceGetAllSubdeviceInformationResponseStructure_DeviceManagementServiceGetAllSubdeviceInformationResponseData(), this.getDeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure(), null, "deviceManagementServiceGetAllSubdeviceInformationResponseData", null, 0, 1, DeviceManagementServiceGetAllSubdeviceInformationResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceManagementServiceGetAllSubdeviceInformationResponseStructure_OperationErrorMessage(), theIbisCommonPackage.getIBISIPString(), null, "operationErrorMessage", null, 0, 1, DeviceManagementServiceGetAllSubdeviceInformationResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructureEClass, DeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure.class, "DeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure_TimeStamp(), theIbisCommonPackage.getIBISIPDateTime(), null, "timeStamp", null, 1, 1, DeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure_SubdeviceStatusInformationList(), this.getSubdeviceStatusInformationStructure(), null, "subdeviceStatusInformationList", null, 1, 1, DeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceManagementServiceGetAllSubdeviceStatusInformationResponseStructureEClass, DeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure.class, "DeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure_DeviceManagementServiceGetAllSubdeviceStatusInformationResponseData(), this.getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure(), null, "deviceManagementServiceGetAllSubdeviceStatusInformationResponseData", null, 0, 1, DeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure_OperationErrorMessage(), theIbisCommonPackage.getIBISIPString(), null, "operationErrorMessage", null, 0, 1, DeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceManagementServiceGetDeviceConfigurationResponseDataStructureEClass, DeviceManagementServiceGetDeviceConfigurationResponseDataStructure.class, "DeviceManagementServiceGetDeviceConfigurationResponseDataStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceManagementServiceGetDeviceConfigurationResponseDataStructure_TimeStamp(), theIbisCommonPackage.getIBISIPDateTime(), null, "timeStamp", null, 1, 1, DeviceManagementServiceGetDeviceConfigurationResponseDataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceManagementServiceGetDeviceConfigurationResponseDataStructure_DeviceID(), theIbisCommonPackage.getIBISIPInt(), null, "deviceID", null, 1, 1, DeviceManagementServiceGetDeviceConfigurationResponseDataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceManagementServiceGetDeviceConfigurationResponseStructureEClass, DeviceManagementServiceGetDeviceConfigurationResponseStructure.class, "DeviceManagementServiceGetDeviceConfigurationResponseStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceManagementServiceGetDeviceConfigurationResponseStructure_DeviceManagementServiceGetDeviceConfigurationResponseData(), this.getDeviceManagementServiceGetDeviceConfigurationResponseDataStructure(), null, "deviceManagementServiceGetDeviceConfigurationResponseData", null, 0, 1, DeviceManagementServiceGetDeviceConfigurationResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceManagementServiceGetDeviceConfigurationResponseStructure_OperationErrorMessage(), theIbisCommonPackage.getIBISIPString(), null, "operationErrorMessage", null, 0, 1, DeviceManagementServiceGetDeviceConfigurationResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceManagementServiceGetDeviceErrorMessagesResponseDataStructureEClass, DeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure.class, "DeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure_TimeStamp(), theIbisCommonPackage.getIBISIPDateTime(), null, "timeStamp", null, 1, 1, DeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure_ErrorMessage(), theIbisCommonPackage.getMessageStructure(), null, "errorMessage", null, 10, -1, DeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceManagementServiceGetDeviceErrorMessagesResponseStructureEClass, DeviceManagementServiceGetDeviceErrorMessagesResponseStructure.class, "DeviceManagementServiceGetDeviceErrorMessagesResponseStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceManagementServiceGetDeviceErrorMessagesResponseStructure_DeviceManagementServiceGetDeviceErrorMessagesResponseData(), this.getDeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure(), null, "deviceManagementServiceGetDeviceErrorMessagesResponseData", null, 0, 1, DeviceManagementServiceGetDeviceErrorMessagesResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceManagementServiceGetDeviceErrorMessagesResponseStructure_OperationErrorMessage(), theIbisCommonPackage.getIBISIPString(), null, "operationErrorMessage", null, 0, 1, DeviceManagementServiceGetDeviceErrorMessagesResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceManagementServiceGetDeviceInformationResponseDataStructureEClass, DeviceManagementServiceGetDeviceInformationResponseDataStructure.class, "DeviceManagementServiceGetDeviceInformationResponseDataStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceManagementServiceGetDeviceInformationResponseDataStructure_TimeStamp(), theIbisCommonPackage.getIBISIPDateTime(), null, "timeStamp", null, 1, 1, DeviceManagementServiceGetDeviceInformationResponseDataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceManagementServiceGetDeviceInformationResponseDataStructure_DeviceInformation(), theIbisCommonPackage.getDeviceInformationStructure(), null, "deviceInformation", null, 1, 1, DeviceManagementServiceGetDeviceInformationResponseDataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceManagementServiceGetDeviceInformationResponseStructureEClass, DeviceManagementServiceGetDeviceInformationResponseStructure.class, "DeviceManagementServiceGetDeviceInformationResponseStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceManagementServiceGetDeviceInformationResponseStructure_DeviceManagementServiceGetDeviceInformationResponseData(), this.getDeviceManagementServiceGetDeviceInformationResponseDataStructure(), null, "deviceManagementServiceGetDeviceInformationResponseData", null, 0, 1, DeviceManagementServiceGetDeviceInformationResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceManagementServiceGetDeviceInformationResponseStructure_OperationErrorMessage(), theIbisCommonPackage.getIBISIPString(), null, "operationErrorMessage", null, 0, 1, DeviceManagementServiceGetDeviceInformationResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceManagementServiceGetDeviceStatusInformationResponseDataStructureEClass, DeviceManagementServiceGetDeviceStatusInformationResponseDataStructure.class, "DeviceManagementServiceGetDeviceStatusInformationResponseDataStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceManagementServiceGetDeviceStatusInformationResponseDataStructure_TimeStamp(), theIbisCommonPackage.getIBISIPDateTime(), null, "timeStamp", null, 1, 1, DeviceManagementServiceGetDeviceStatusInformationResponseDataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceManagementServiceGetDeviceStatusInformationResponseDataStructure_DeviceStatusInformation(), this.getDeviceStatusInformationStructure(), null, "deviceStatusInformation", null, 1, 1, DeviceManagementServiceGetDeviceStatusInformationResponseDataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceManagementServiceGetDeviceStatusInformationResponseStructureEClass, DeviceManagementServiceGetDeviceStatusInformationResponseStructure.class, "DeviceManagementServiceGetDeviceStatusInformationResponseStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceManagementServiceGetDeviceStatusInformationResponseStructure_DeviceManagementServiceGetDeviceStatusInformationResponseData(), this.getDeviceManagementServiceGetDeviceStatusInformationResponseDataStructure(), null, "deviceManagementServiceGetDeviceStatusInformationResponseData", null, 0, 1, DeviceManagementServiceGetDeviceStatusInformationResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceManagementServiceGetDeviceStatusInformationResponseStructure_OperationErrorMessage(), theIbisCommonPackage.getIBISIPString(), null, "operationErrorMessage", null, 0, 1, DeviceManagementServiceGetDeviceStatusInformationResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceManagementServiceGetDeviceStatusResponseDataStructureEClass, DeviceManagementServiceGetDeviceStatusResponseDataStructure.class, "DeviceManagementServiceGetDeviceStatusResponseDataStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceManagementServiceGetDeviceStatusResponseDataStructure_TimeStamp(), theIbisCommonPackage.getIBISIPDateTime(), null, "timeStamp", null, 1, 1, DeviceManagementServiceGetDeviceStatusResponseDataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceManagementServiceGetDeviceStatusResponseDataStructure_DeviceState(), theIbisEnumerationsPackage.getDeviceStateEnumeration(), "deviceState", null, 1, 1, DeviceManagementServiceGetDeviceStatusResponseDataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceManagementServiceGetDeviceStatusResponseStructureEClass, DeviceManagementServiceGetDeviceStatusResponseStructure.class, "DeviceManagementServiceGetDeviceStatusResponseStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceManagementServiceGetDeviceStatusResponseStructure_DeviceManagementServiceGetDeviceStatusResponseData(), this.getDeviceManagementServiceGetDeviceStatusResponseDataStructure(), null, "deviceManagementServiceGetDeviceStatusResponseData", null, 0, 1, DeviceManagementServiceGetDeviceStatusResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceManagementServiceGetDeviceStatusResponseStructure_OperationErrorMessage(), theIbisCommonPackage.getIBISIPString(), null, "operationErrorMessage", null, 0, 1, DeviceManagementServiceGetDeviceStatusResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceManagementServiceGetServiceInformationResponseDataStructureEClass, DeviceManagementServiceGetServiceInformationResponseDataStructure.class, "DeviceManagementServiceGetServiceInformationResponseDataStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceManagementServiceGetServiceInformationResponseDataStructure_TimeStamp(), theIbisCommonPackage.getIBISIPDateTime(), null, "timeStamp", null, 1, 1, DeviceManagementServiceGetServiceInformationResponseDataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceManagementServiceGetServiceInformationResponseDataStructure_ServiceInformationList(), theIbisCommonPackage.getServiceInformationListStructure(), null, "serviceInformationList", null, 1, 1, DeviceManagementServiceGetServiceInformationResponseDataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceManagementServiceGetServiceInformationResponseStructureEClass, DeviceManagementServiceGetServiceInformationResponseStructure.class, "DeviceManagementServiceGetServiceInformationResponseStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceManagementServiceGetServiceInformationResponseStructure_DeviceManagementServiceGetServiceInformationResponseData(), this.getDeviceManagementServiceGetServiceInformationResponseDataStructure(), null, "deviceManagementServiceGetServiceInformationResponseData", null, 0, 1, DeviceManagementServiceGetServiceInformationResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceManagementServiceGetServiceInformationResponseStructure_OperationErrorMessage(), theIbisCommonPackage.getIBISIPString(), null, "operationErrorMessage", null, 0, 1, DeviceManagementServiceGetServiceInformationResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceManagementServiceGetServiceStatusResponseDataStructureEClass, DeviceManagementServiceGetServiceStatusResponseDataStructure.class, "DeviceManagementServiceGetServiceStatusResponseDataStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceManagementServiceGetServiceStatusResponseDataStructure_TimeStamp(), theIbisCommonPackage.getIBISIPDateTime(), null, "timeStamp", null, 1, 1, DeviceManagementServiceGetServiceStatusResponseDataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceManagementServiceGetServiceStatusResponseDataStructure_ServiceSpecificationWithStateList(), theIbisCommonPackage.getServiceSpecificationWithStateListStructure(), null, "serviceSpecificationWithStateList", null, 1, 1, DeviceManagementServiceGetServiceStatusResponseDataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceManagementServiceGetServiceStatusResponseStructureEClass, DeviceManagementServiceGetServiceStatusResponseStructure.class, "DeviceManagementServiceGetServiceStatusResponseStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceManagementServiceGetServiceStatusResponseStructure_DeviceManagementServiceGetServiceStatusResponseData(), this.getDeviceManagementServiceGetServiceStatusResponseDataStructure(), null, "deviceManagementServiceGetServiceStatusResponseData", null, 0, 1, DeviceManagementServiceGetServiceStatusResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceManagementServiceGetServiceStatusResponseStructure_OperationErrorMessage(), theIbisCommonPackage.getIBISIPString(), null, "operationErrorMessage", null, 0, 1, DeviceManagementServiceGetServiceStatusResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceManagementServiceGetUpdateHistoryResponseStructureEClass, DeviceManagementServiceGetUpdateHistoryResponseStructure.class, "DeviceManagementServiceGetUpdateHistoryResponseStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceManagementServiceGetUpdateHistoryResponseStructure_UpdateHistory(), this.getDeviceManagementServiceUpdateHistoryStructure(), null, "updateHistory", null, 0, 1, DeviceManagementServiceGetUpdateHistoryResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceManagementServiceGetUpdateHistoryResponseStructure_OperationErrorMessage(), theIbisCommonPackage.getIBISIPString(), null, "operationErrorMessage", null, 0, 1, DeviceManagementServiceGetUpdateHistoryResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceManagementServiceInstallUpdateRequestStructureEClass, DeviceManagementServiceInstallUpdateRequestStructure.class, "DeviceManagementServiceInstallUpdateRequestStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceManagementServiceInstallUpdateRequestStructure_UpdateID(), theIbisCommonPackage.getIBISIPNMTOKEN(), null, "updateID", null, 1, 1, DeviceManagementServiceInstallUpdateRequestStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceManagementServiceInstallUpdateRequestStructure_UpdateTimestamp(), theIbisCommonPackage.getIBISIPDateTime(), null, "updateTimestamp", null, 1, 1, DeviceManagementServiceInstallUpdateRequestStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceManagementServiceInstallUpdateRequestStructure_UpdateURL(), theIbisCommonPackage.getIBISIPAnyURI(), null, "updateURL", null, 1, 1, DeviceManagementServiceInstallUpdateRequestStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceManagementServiceInstallUpdateRequestStructure_UpdateFileChecksum(), this.getChecksumStructure(), null, "updateFileChecksum", null, 0, 1, DeviceManagementServiceInstallUpdateRequestStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceManagementServiceInstallUpdateRequestStructure_UpdateFileSize(), theIbisCommonPackage.getIBISIPUnsignedLong(), null, "updateFileSize", null, 0, 1, DeviceManagementServiceInstallUpdateRequestStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceManagementServiceInstallUpdateResponseStructureEClass, DeviceManagementServiceInstallUpdateResponseStructure.class, "DeviceManagementServiceInstallUpdateResponseStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeviceManagementServiceInstallUpdateResponseStructure_UpdateAccept(), this.getUpdateAcceptEnumeration(), "updateAccept", null, 0, 1, DeviceManagementServiceInstallUpdateResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceManagementServiceInstallUpdateResponseStructure_OperationErrorMessage(), theIbisCommonPackage.getIBISIPString(), null, "operationErrorMessage", null, 0, 1, DeviceManagementServiceInstallUpdateResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceManagementServiceRetrieveUpdateStateRequestStructureEClass, DeviceManagementServiceRetrieveUpdateStateRequestStructure.class, "DeviceManagementServiceRetrieveUpdateStateRequestStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceManagementServiceRetrieveUpdateStateRequestStructure_UpdateID(), theIbisCommonPackage.getIBISIPNMTOKEN(), null, "updateID", null, 1, 1, DeviceManagementServiceRetrieveUpdateStateRequestStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceManagementServiceRetrieveUpdateStateResponseStructureEClass, DeviceManagementServiceRetrieveUpdateStateResponseStructure.class, "DeviceManagementServiceRetrieveUpdateStateResponseStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceManagementServiceRetrieveUpdateStateResponseStructure_UpdateStateData(), this.getDeviceManagementServiceUpdateStateDataStructure(), null, "updateStateData", null, 0, 1, DeviceManagementServiceRetrieveUpdateStateResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceManagementServiceRetrieveUpdateStateResponseStructure_OperationErrorMessage(), theIbisCommonPackage.getIBISIPString(), null, "operationErrorMessage", null, 0, 1, DeviceManagementServiceRetrieveUpdateStateResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceManagementServiceUpdateHistoryEntryStructureEClass, DeviceManagementServiceUpdateHistoryEntryStructure.class, "DeviceManagementServiceUpdateHistoryEntryStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceManagementServiceUpdateHistoryEntryStructure_UpdateID(), theIbisCommonPackage.getIBISIPNMTOKEN(), null, "updateID", null, 1, 1, DeviceManagementServiceUpdateHistoryEntryStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceManagementServiceUpdateHistoryEntryStructure_UpdateTimestamp(), theIbisCommonPackage.getIBISIPDateTime(), null, "updateTimestamp", null, 1, 1, DeviceManagementServiceUpdateHistoryEntryStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceManagementServiceUpdateHistoryEntryStructure_UpdateURL(), theIbisCommonPackage.getIBISIPAnyURI(), null, "updateURL", null, 1, 1, DeviceManagementServiceUpdateHistoryEntryStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceManagementServiceUpdateHistoryEntryStructure_UpdateStatus(), this.getUpdateStatusEnumeration(), "updateStatus", null, 1, 1, DeviceManagementServiceUpdateHistoryEntryStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceManagementServiceUpdateHistoryEntryStructure_DataVersionList(), theIbisCommonPackage.getDataVersionListStructure(), null, "dataVersionList", null, 0, 1, DeviceManagementServiceUpdateHistoryEntryStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceManagementServiceUpdateHistoryEntryStructure_UpdateDetails(), theIbisCommonPackage.getIBISIPString(), null, "updateDetails", null, 0, 1, DeviceManagementServiceUpdateHistoryEntryStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceManagementServiceUpdateHistoryStructureEClass, DeviceManagementServiceUpdateHistoryStructure.class, "DeviceManagementServiceUpdateHistoryStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceManagementServiceUpdateHistoryStructure_UpdateHistoryEntry(), this.getDeviceManagementServiceUpdateHistoryEntryStructure(), null, "updateHistoryEntry", null, 0, -1, DeviceManagementServiceUpdateHistoryStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceManagementServiceUpdateStateDataStructureEClass, DeviceManagementServiceUpdateStateDataStructure.class, "DeviceManagementServiceUpdateStateDataStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceManagementServiceUpdateStateDataStructure_UpdateID(), theIbisCommonPackage.getIBISIPNMTOKEN(), null, "updateID", null, 1, 1, DeviceManagementServiceUpdateStateDataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceManagementServiceUpdateStateDataStructure_UpdateTimestamp(), theIbisCommonPackage.getIBISIPDateTime(), null, "updateTimestamp", null, 1, 1, DeviceManagementServiceUpdateStateDataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceManagementServiceUpdateStateDataStructure_UpdateStatus(), this.getUpdateStatusEnumeration(), "updateStatus", null, 1, 1, DeviceManagementServiceUpdateStateDataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceManagementServiceUpdateStateDataStructure_UpdateDetails(), theIbisCommonPackage.getIBISIPString(), null, "updateDetails", null, 0, 1, DeviceManagementServiceUpdateStateDataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceStatusInformationStructureEClass, DeviceStatusInformationStructure.class, "DeviceStatusInformationStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeviceStatusInformationStructure_DeviceState(), theIbisEnumerationsPackage.getDeviceStateEnumeration(), "deviceState", null, 1, 1, DeviceStatusInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceStatusInformationStructure_DeviceStatusList(), this.getDeviceStatusStructure(), null, "deviceStatusList", null, 0, 1, DeviceStatusInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceStatusStructureEClass, DeviceStatusStructure.class, "DeviceStatusStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceStatusStructure_DeviceStatusName(), theIbisCommonPackage.getIBISIPString(), null, "deviceStatusName", null, 1, 1, DeviceStatusStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceStatusStructure_DeviceStatusFlag(), theIbisCommonPackage.getIBISIPBoolean(), null, "deviceStatusFlag", null, 1, 1, DeviceStatusStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceStatusStructure_DeviceStatusImpact(), theIbisEnumerationsPackage.getDeviceStateEnumeration(), "deviceStatusImpact", null, 1, 1, DeviceStatusStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceStatusStructure_DeviceStatusPriority(), theIbisCommonPackage.getIBISIPInt(), null, "deviceStatusPriority", null, 1, 1, DeviceStatusStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subdeviceErrorMessagesStructureEClass, SubdeviceErrorMessagesStructure.class, "SubdeviceErrorMessagesStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubdeviceErrorMessagesStructure_SubdeviceName(), theIbisCommonPackage.getIBISIPString(), null, "subdeviceName", null, 1, 1, SubdeviceErrorMessagesStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubdeviceErrorMessagesStructure_ErrorMessage(), theIbisCommonPackage.getMessageStructure(), null, "errorMessage", null, 10, -1, SubdeviceErrorMessagesStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subdeviceInformationStructureEClass, SubdeviceInformationStructure.class, "SubdeviceInformationStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubdeviceInformationStructure_SubdeviceName(), theIbisCommonPackage.getIBISIPString(), null, "subdeviceName", null, 1, 1, SubdeviceInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubdeviceInformationStructure_DeviceInformation(), theIbisCommonPackage.getDeviceInformationStructure(), null, "deviceInformation", null, 1, 1, SubdeviceInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subdeviceStatusInformationStructureEClass, SubdeviceStatusInformationStructure.class, "SubdeviceStatusInformationStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubdeviceStatusInformationStructure_SubdeviceName(), theIbisCommonPackage.getIBISIPString(), null, "subdeviceName", null, 1, 1, SubdeviceStatusInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubdeviceStatusInformationStructure_DeviceStatusInformation(), this.getDeviceStatusInformationStructure(), null, "deviceStatusInformation", null, 1, 1, SubdeviceStatusInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(checksumTypeEnumerationEEnum, ChecksumTypeEnumeration.class, "ChecksumTypeEnumeration");
		addEEnumLiteral(checksumTypeEnumerationEEnum, ChecksumTypeEnumeration.CRC32);
		addEEnumLiteral(checksumTypeEnumerationEEnum, ChecksumTypeEnumeration.MD5);
		addEEnumLiteral(checksumTypeEnumerationEEnum, ChecksumTypeEnumeration.SHA256);

		initEEnum(updateAcceptEnumerationEEnum, UpdateAcceptEnumeration.class, "UpdateAcceptEnumeration");
		addEEnumLiteral(updateAcceptEnumerationEEnum, UpdateAcceptEnumeration.UPDATE_ACCEPTED);
		addEEnumLiteral(updateAcceptEnumerationEEnum, UpdateAcceptEnumeration.URL_TYPE_UNKNOWN);
		addEEnumLiteral(updateAcceptEnumerationEEnum, UpdateAcceptEnumeration.NO_UPDATES_ALLOWED);
		addEEnumLiteral(updateAcceptEnumerationEEnum, UpdateAcceptEnumeration.TO_BE_POSTPONED);

		initEEnum(updateStatusEnumerationEEnum, UpdateStatusEnumeration.class, "UpdateStatusEnumeration");
		addEEnumLiteral(updateStatusEnumerationEEnum, UpdateStatusEnumeration.UPDATE_RUNNING);
		addEEnumLiteral(updateStatusEnumerationEEnum, UpdateStatusEnumeration.DEVICE_RESTART_REQUIRED);
		addEEnumLiteral(updateStatusEnumerationEEnum, UpdateStatusEnumeration.DOWNLOAD_UPDATE_FILE_FAILED);
		addEEnumLiteral(updateStatusEnumerationEEnum, UpdateStatusEnumeration.UPDATE_FILE_CORRUPTED);
		addEEnumLiteral(updateStatusEnumerationEEnum, UpdateStatusEnumeration.UPDATE_NOT_NECESSARY);
		addEEnumLiteral(updateStatusEnumerationEEnum, UpdateStatusEnumeration.INSTALLATION_FAILED);
		addEEnumLiteral(updateStatusEnumerationEEnum, UpdateStatusEnumeration.INSTALLATION_SUCCESSFUL);

		// Initialize data types
		initEDataType(checksumTypeEnumerationObjectEDataType, ChecksumTypeEnumeration.class, "ChecksumTypeEnumerationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(updateAcceptEnumerationObjectEDataType, UpdateAcceptEnumeration.class, "UpdateAcceptEnumerationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(updateStatusEnumerationObjectEDataType, UpdateStatusEnumeration.class, "UpdateStatusEnumerationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (checksumStructureEClass,
		   source,
		   new String[] {
			   "name", "ChecksumStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getChecksumStructure_ChecksumType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ChecksumType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getChecksumStructure_Checksum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Checksum",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (checksumTypeEnumerationEEnum,
		   source,
		   new String[] {
			   "name", "ChecksumTypeEnumeration"
		   });
		addAnnotation
		  (checksumTypeEnumerationObjectEDataType,
		   source,
		   new String[] {
			   "name", "ChecksumTypeEnumeration:Object",
			   "baseType", "ChecksumTypeEnumeration"
		   });
		addAnnotation
		  (deviceManagementServiceFinalizeUpdateRequestStructureEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.FinalizeUpdateRequestStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceManagementServiceFinalizeUpdateRequestStructure_UpdateID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UpdateID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceManagementServiceFinalizeUpdateResponseStructureEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.FinalizeUpdateResponseStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceManagementServiceFinalizeUpdateResponseStructure_UpdateStatus(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UpdateStatus",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceManagementServiceFinalizeUpdateResponseStructure_OperationErrorMessage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OperationErrorMessage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructureEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.GetAllSubdeviceErrorMessagesResponseDataStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure_TimeStamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimeStamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure_SubdeviceErrorMessagesList(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SubdeviceErrorMessagesList",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructureEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.GetAllSubdeviceErrorMessagesResponseStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure_DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceManagementService.GetAllSubdeviceErrorMessagesResponseData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure_OperationErrorMessage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OperationErrorMessage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceManagementServiceGetAllSubdeviceInformationResponseDataStructureEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.GetAllSubdeviceInformationResponseDataStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure_TimeStamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimeStamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure_SubdeviceInformationList(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SubdeviceInformationList",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceManagementServiceGetAllSubdeviceInformationResponseStructureEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.GetAllSubdeviceInformationResponseStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceManagementServiceGetAllSubdeviceInformationResponseStructure_DeviceManagementServiceGetAllSubdeviceInformationResponseData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceManagementService.GetAllSubdeviceInformationResponseData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceManagementServiceGetAllSubdeviceInformationResponseStructure_OperationErrorMessage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OperationErrorMessage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructureEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.GetAllSubdeviceStatusInformationResponseDataStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure_TimeStamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimeStamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure_SubdeviceStatusInformationList(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SubdeviceStatusInformationList",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceManagementServiceGetAllSubdeviceStatusInformationResponseStructureEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.GetAllSubdeviceStatusInformationResponseStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure_DeviceManagementServiceGetAllSubdeviceStatusInformationResponseData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceManagementService.GetAllSubdeviceStatusInformationResponseData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure_OperationErrorMessage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OperationErrorMessage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceManagementServiceGetDeviceConfigurationResponseDataStructureEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.GetDeviceConfigurationResponseDataStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceManagementServiceGetDeviceConfigurationResponseDataStructure_TimeStamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimeStamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceManagementServiceGetDeviceConfigurationResponseDataStructure_DeviceID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceManagementServiceGetDeviceConfigurationResponseStructureEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.GetDeviceConfigurationResponseStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceManagementServiceGetDeviceConfigurationResponseStructure_DeviceManagementServiceGetDeviceConfigurationResponseData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceManagementService.GetDeviceConfigurationResponseData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceManagementServiceGetDeviceConfigurationResponseStructure_OperationErrorMessage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OperationErrorMessage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceManagementServiceGetDeviceErrorMessagesResponseDataStructureEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.GetDeviceErrorMessagesResponseDataStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure_TimeStamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimeStamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure_ErrorMessage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ErrorMessage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceManagementServiceGetDeviceErrorMessagesResponseStructureEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.GetDeviceErrorMessagesResponseStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceManagementServiceGetDeviceErrorMessagesResponseStructure_DeviceManagementServiceGetDeviceErrorMessagesResponseData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceManagementService.GetDeviceErrorMessagesResponseData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceManagementServiceGetDeviceErrorMessagesResponseStructure_OperationErrorMessage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OperationErrorMessage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceManagementServiceGetDeviceInformationResponseDataStructureEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.GetDeviceInformationResponseDataStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceManagementServiceGetDeviceInformationResponseDataStructure_TimeStamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimeStamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceManagementServiceGetDeviceInformationResponseDataStructure_DeviceInformation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceInformation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceManagementServiceGetDeviceInformationResponseStructureEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.GetDeviceInformationResponseStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceManagementServiceGetDeviceInformationResponseStructure_DeviceManagementServiceGetDeviceInformationResponseData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceManagementService.GetDeviceInformationResponseData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceManagementServiceGetDeviceInformationResponseStructure_OperationErrorMessage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OperationErrorMessage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceManagementServiceGetDeviceStatusInformationResponseDataStructureEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.GetDeviceStatusInformationResponseDataStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceManagementServiceGetDeviceStatusInformationResponseDataStructure_TimeStamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimeStamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceManagementServiceGetDeviceStatusInformationResponseDataStructure_DeviceStatusInformation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceStatusInformation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceManagementServiceGetDeviceStatusInformationResponseStructureEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.GetDeviceStatusInformationResponseStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceManagementServiceGetDeviceStatusInformationResponseStructure_DeviceManagementServiceGetDeviceStatusInformationResponseData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceManagementService.GetDeviceStatusInformationResponseData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceManagementServiceGetDeviceStatusInformationResponseStructure_OperationErrorMessage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OperationErrorMessage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceManagementServiceGetDeviceStatusResponseDataStructureEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.GetDeviceStatusResponseDataStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceManagementServiceGetDeviceStatusResponseDataStructure_TimeStamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimeStamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceManagementServiceGetDeviceStatusResponseDataStructure_DeviceState(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceState",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceManagementServiceGetDeviceStatusResponseStructureEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.GetDeviceStatusResponseStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceManagementServiceGetDeviceStatusResponseStructure_DeviceManagementServiceGetDeviceStatusResponseData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceManagementService.GetDeviceStatusResponseData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceManagementServiceGetDeviceStatusResponseStructure_OperationErrorMessage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OperationErrorMessage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceManagementServiceGetServiceInformationResponseDataStructureEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.GetServiceInformationResponseDataStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceManagementServiceGetServiceInformationResponseDataStructure_TimeStamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimeStamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceManagementServiceGetServiceInformationResponseDataStructure_ServiceInformationList(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ServiceInformationList",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceManagementServiceGetServiceInformationResponseStructureEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.GetServiceInformationResponseStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceManagementServiceGetServiceInformationResponseStructure_DeviceManagementServiceGetServiceInformationResponseData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceManagementService.GetServiceInformationResponseData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceManagementServiceGetServiceInformationResponseStructure_OperationErrorMessage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OperationErrorMessage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceManagementServiceGetServiceStatusResponseDataStructureEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.GetServiceStatusResponseDataStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceManagementServiceGetServiceStatusResponseDataStructure_TimeStamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimeStamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceManagementServiceGetServiceStatusResponseDataStructure_ServiceSpecificationWithStateList(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ServiceSpecificationWithStateList",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceManagementServiceGetServiceStatusResponseStructureEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.GetServiceStatusResponseStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceManagementServiceGetServiceStatusResponseStructure_DeviceManagementServiceGetServiceStatusResponseData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceManagementService.GetServiceStatusResponseData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceManagementServiceGetServiceStatusResponseStructure_OperationErrorMessage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OperationErrorMessage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceManagementServiceGetUpdateHistoryResponseStructureEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.GetUpdateHistoryResponseStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceManagementServiceGetUpdateHistoryResponseStructure_UpdateHistory(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UpdateHistory",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceManagementServiceGetUpdateHistoryResponseStructure_OperationErrorMessage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OperationErrorMessage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceManagementServiceInstallUpdateRequestStructureEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.InstallUpdateRequestStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceManagementServiceInstallUpdateRequestStructure_UpdateID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UpdateID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceManagementServiceInstallUpdateRequestStructure_UpdateTimestamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UpdateTimestamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceManagementServiceInstallUpdateRequestStructure_UpdateURL(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UpdateURL",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceManagementServiceInstallUpdateRequestStructure_UpdateFileChecksum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UpdateFileChecksum",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceManagementServiceInstallUpdateRequestStructure_UpdateFileSize(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UpdateFileSize",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceManagementServiceInstallUpdateResponseStructureEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.InstallUpdateResponseStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceManagementServiceInstallUpdateResponseStructure_UpdateAccept(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UpdateAccept",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceManagementServiceInstallUpdateResponseStructure_OperationErrorMessage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OperationErrorMessage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceManagementServiceRetrieveUpdateStateRequestStructureEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.RetrieveUpdateStateRequestStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceManagementServiceRetrieveUpdateStateRequestStructure_UpdateID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UpdateID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceManagementServiceRetrieveUpdateStateResponseStructureEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.RetrieveUpdateStateResponseStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceManagementServiceRetrieveUpdateStateResponseStructure_UpdateStateData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UpdateStateData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceManagementServiceRetrieveUpdateStateResponseStructure_OperationErrorMessage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OperationErrorMessage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceManagementServiceUpdateHistoryEntryStructureEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.UpdateHistoryEntryStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceManagementServiceUpdateHistoryEntryStructure_UpdateID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UpdateID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceManagementServiceUpdateHistoryEntryStructure_UpdateTimestamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UpdateTimestamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceManagementServiceUpdateHistoryEntryStructure_UpdateURL(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UpdateURL",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceManagementServiceUpdateHistoryEntryStructure_UpdateStatus(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UpdateStatus",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceManagementServiceUpdateHistoryEntryStructure_DataVersionList(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DataVersionList",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceManagementServiceUpdateHistoryEntryStructure_UpdateDetails(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UpdateDetails",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceManagementServiceUpdateHistoryStructureEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.UpdateHistoryStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceManagementServiceUpdateHistoryStructure_UpdateHistoryEntry(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UpdateHistoryEntry",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceManagementServiceUpdateStateDataStructureEClass,
		   source,
		   new String[] {
			   "name", "DeviceManagementService.UpdateStateDataStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceManagementServiceUpdateStateDataStructure_UpdateID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UpdateID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceManagementServiceUpdateStateDataStructure_UpdateTimestamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UpdateTimestamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceManagementServiceUpdateStateDataStructure_UpdateStatus(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UpdateStatus",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceManagementServiceUpdateStateDataStructure_UpdateDetails(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UpdateDetails",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceStatusInformationStructureEClass,
		   source,
		   new String[] {
			   "name", "DeviceStatusInformationStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceStatusInformationStructure_DeviceState(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceState",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceStatusInformationStructure_DeviceStatusList(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceStatusList",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceStatusStructureEClass,
		   source,
		   new String[] {
			   "name", "DeviceStatusStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceStatusStructure_DeviceStatusName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceStatusName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceStatusStructure_DeviceStatusFlag(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceStatusFlag",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceStatusStructure_DeviceStatusImpact(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceStatusImpact",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceStatusStructure_DeviceStatusPriority(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceStatusPriority",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (subdeviceErrorMessagesStructureEClass,
		   source,
		   new String[] {
			   "name", "SubdeviceErrorMessagesStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSubdeviceErrorMessagesStructure_SubdeviceName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SubdeviceName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSubdeviceErrorMessagesStructure_ErrorMessage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ErrorMessage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (subdeviceInformationStructureEClass,
		   source,
		   new String[] {
			   "name", "SubdeviceInformationStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSubdeviceInformationStructure_SubdeviceName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SubdeviceName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSubdeviceInformationStructure_DeviceInformation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceInformation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (subdeviceStatusInformationStructureEClass,
		   source,
		   new String[] {
			   "name", "SubdeviceStatusInformationStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSubdeviceStatusInformationStructure_SubdeviceName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SubdeviceName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSubdeviceStatusInformationStructure_DeviceStatusInformation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceStatusInformation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (updateAcceptEnumerationEEnum,
		   source,
		   new String[] {
			   "name", "UpdateAcceptEnumeration"
		   });
		addAnnotation
		  (updateAcceptEnumerationObjectEDataType,
		   source,
		   new String[] {
			   "name", "UpdateAcceptEnumeration:Object",
			   "baseType", "UpdateAcceptEnumeration"
		   });
		addAnnotation
		  (updateStatusEnumerationEEnum,
		   source,
		   new String[] {
			   "name", "UpdateStatusEnumeration"
		   });
		addAnnotation
		  (updateStatusEnumerationObjectEDataType,
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
		  (checksumTypeEnumerationEEnum,
		   source,
		   new String[] {
			   "documentation", "Types of checksum"
		   });
		addAnnotation
		  (checksumTypeEnumerationEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Cyclic redundancy check, 32-bit"
		   });
		addAnnotation
		  (checksumTypeEnumerationEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Message digest algorithm 5, 128-bit"
		   });
		addAnnotation
		  (checksumTypeEnumerationEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Secure hash algorithm, 256-bit"
		   });
		addAnnotation
		  (getDeviceManagementServiceFinalizeUpdateResponseStructure_UpdateStatus(),
		   source,
		   new String[] {
			   "documentation", "Status of update on its finalization"
		   });
		addAnnotation
		  (getDeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure_ErrorMessage(),
		   source,
		   new String[] {
			   "documentation", "Warnings and errors only, no state messages"
		   });
		addAnnotation
		  (getDeviceManagementServiceInstallUpdateRequestStructure_UpdateID(),
		   source,
		   new String[] {
			   "documentation", "Unique id generated by the controller to identify an update job"
		   });
		addAnnotation
		  (getDeviceManagementServiceInstallUpdateRequestStructure_UpdateTimestamp(),
		   source,
		   new String[] {
			   "documentation", "Timestamp used for GetUpdateHistory and RetrieveUpdateState responses and for logging"
		   });
		addAnnotation
		  (getDeviceManagementServiceInstallUpdateRequestStructure_UpdateURL(),
		   source,
		   new String[] {
			   "documentation", "URL from which the device shall download the update file"
		   });
		addAnnotation
		  (getDeviceManagementServiceInstallUpdateRequestStructure_UpdateFileChecksum(),
		   source,
		   new String[] {
			   "documentation", "Optional checksum of update file"
		   });
		addAnnotation
		  (getDeviceManagementServiceInstallUpdateRequestStructure_UpdateFileSize(),
		   source,
		   new String[] {
			   "documentation", "Optional size of update file"
		   });
		addAnnotation
		  (getDeviceManagementServiceUpdateHistoryEntryStructure_UpdateTimestamp(),
		   source,
		   new String[] {
			   "documentation", "Timestamp given by operation InstallUpdate"
		   });
		addAnnotation
		  (getDeviceManagementServiceUpdateHistoryEntryStructure_UpdateURL(),
		   source,
		   new String[] {
			   "documentation", "URL from which the device downloaded the update file"
		   });
		addAnnotation
		  (getDeviceManagementServiceUpdateHistoryEntryStructure_UpdateStatus(),
		   source,
		   new String[] {
			   "documentation", "Status of update. Typically final status (InstallationSuccessfull or InstallationFailed)"
		   });
		addAnnotation
		  (getDeviceManagementServiceUpdateHistoryEntryStructure_DataVersionList(),
		   source,
		   new String[] {
			   "documentation", "Optional list of updated components"
		   });
		addAnnotation
		  (getDeviceManagementServiceUpdateHistoryEntryStructure_UpdateDetails(),
		   source,
		   new String[] {
			   "documentation", "Optional device specific update log"
		   });
		addAnnotation
		  (getDeviceManagementServiceUpdateHistoryStructure_UpdateHistoryEntry(),
		   source,
		   new String[] {
			   "documentation", "Minimum requirement for any device allowing updates is an update history depth of 1, \n\t\t\t\t\ti.e. history shall contain at least the last update performed (regardless of its result), if there was any."
		   });
		addAnnotation
		  (getDeviceManagementServiceUpdateStateDataStructure_UpdateTimestamp(),
		   source,
		   new String[] {
			   "documentation", "Timestamp given by operation InstallUpdate"
		   });
		addAnnotation
		  (getDeviceManagementServiceUpdateStateDataStructure_UpdateStatus(),
		   source,
		   new String[] {
			   "documentation", "Current status of update"
		   });
		addAnnotation
		  (getDeviceManagementServiceUpdateStateDataStructure_UpdateDetails(),
		   source,
		   new String[] {
			   "documentation", "Optional device specific update log"
		   });
		addAnnotation
		  (subdeviceErrorMessagesStructureEClass,
		   source,
		   new String[] {
			   "documentation", "Error messages of named subdevice"
		   });
		addAnnotation
		  (getSubdeviceErrorMessagesStructure_SubdeviceName(),
		   source,
		   new String[] {
			   "documentation", "Used to identify subdevice"
		   });
		addAnnotation
		  (getSubdeviceErrorMessagesStructure_ErrorMessage(),
		   source,
		   new String[] {
			   "documentation", "Warnings and errors only, no state messages"
		   });
		addAnnotation
		  (subdeviceInformationStructureEClass,
		   source,
		   new String[] {
			   "documentation", "Information on named subdevice"
		   });
		addAnnotation
		  (getSubdeviceInformationStructure_SubdeviceName(),
		   source,
		   new String[] {
			   "documentation", "Used to identify subdevice"
		   });
		addAnnotation
		  (getSubdeviceInformationStructure_DeviceInformation(),
		   source,
		   new String[] {
			   "documentation", "Information on subdevice"
		   });
		addAnnotation
		  (subdeviceStatusInformationStructureEClass,
		   source,
		   new String[] {
			   "documentation", "Status information of named subdevice"
		   });
		addAnnotation
		  (getSubdeviceStatusInformationStructure_SubdeviceName(),
		   source,
		   new String[] {
			   "documentation", "Used to identify subdevice"
		   });
		addAnnotation
		  (getSubdeviceStatusInformationStructure_DeviceStatusInformation(),
		   source,
		   new String[] {
			   "documentation", "Status information of subdevice"
		   });
		addAnnotation
		  (updateAcceptEnumerationEEnum,
		   source,
		   new String[] {
			   "documentation", "Information about the result of InstallUpdate"
		   });
		addAnnotation
		  (updateAcceptEnumerationEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Update will be performed"
		   });
		addAnnotation
		  (updateAcceptEnumerationEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "URL type has been rejected, e.g. FTP may not supported by some devices"
		   });
		addAnnotation
		  (updateAcceptEnumerationEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "No updates are possible"
		   });
		addAnnotation
		  (updateAcceptEnumerationEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Update has to be postponed"
		   });
		addAnnotation
		  (updateStatusEnumerationEEnum,
		   source,
		   new String[] {
			   "documentation", "Information about the current status of update"
		   });
		addAnnotation
		  (updateStatusEnumerationEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Update in progress"
		   });
		addAnnotation
		  (updateStatusEnumerationEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Device has to be restarted by operation RestartDevice"
		   });
		addAnnotation
		  (updateStatusEnumerationEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Specified update file could not be downloaded from URL"
		   });
		addAnnotation
		  (updateStatusEnumerationEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Specified update file is not usable"
		   });
		addAnnotation
		  (updateStatusEnumerationEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "State of device firmware already as required"
		   });
		addAnnotation
		  (updateStatusEnumerationEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "documentation", "Update failed e.g. due to memory write error"
		   });
		addAnnotation
		  (updateStatusEnumerationEEnum.getELiterals().get(6),
		   source,
		   new String[] {
			   "documentation", "Update successfully completed"
		   });
	}

} //IbisDeviceManagementServicePackageImpl
