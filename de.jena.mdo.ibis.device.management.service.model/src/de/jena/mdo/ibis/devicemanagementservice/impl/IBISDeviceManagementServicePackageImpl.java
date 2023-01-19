/**
 */
package de.jena.mdo.ibis.devicemanagementservice.impl;

import de.jena.mdo.ibis.common.IbisCommonPackage;

import de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServiceFactory;
import de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage;

import de.jena.mdo.ibis.enumerations.IbisEnumerationsPackage;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IBISDeviceManagementServicePackageImpl extends EPackageImpl implements IBISDeviceManagementServicePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "devicemanagementservice.ecore";

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
	 * @see de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IBISDeviceManagementServicePackageImpl() {
		super(eNS_URI, IBISDeviceManagementServiceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IBISDeviceManagementServicePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static IBISDeviceManagementServicePackage init() {
		if (isInited) return (IBISDeviceManagementServicePackage)EPackage.Registry.INSTANCE.getEPackage(IBISDeviceManagementServicePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredIBISDeviceManagementServicePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		IBISDeviceManagementServicePackageImpl theIBISDeviceManagementServicePackage = registeredIBISDeviceManagementServicePackage instanceof IBISDeviceManagementServicePackageImpl ? (IBISDeviceManagementServicePackageImpl)registeredIBISDeviceManagementServicePackage : new IBISDeviceManagementServicePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		IbisCommonPackage.eINSTANCE.eClass();
		IbisEnumerationsPackage.eINSTANCE.eClass();

		// Load packages
		theIBISDeviceManagementServicePackage.loadPackage();

		// Fix loaded packages
		theIBISDeviceManagementServicePackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theIBISDeviceManagementServicePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IBISDeviceManagementServicePackage.eNS_URI, theIBISDeviceManagementServicePackage);
		return theIBISDeviceManagementServicePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChecksumStructure() {
		if (checksumStructureEClass == null) {
			checksumStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISDeviceManagementServicePackage.eNS_URI).getEClassifiers().get(0);
		}
		return checksumStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChecksumStructure_ChecksumType() {
        return (EAttribute)getChecksumStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChecksumStructure_Checksum() {
        return (EReference)getChecksumStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceFinalizeUpdateRequestStructure() {
		if (deviceManagementServiceFinalizeUpdateRequestStructureEClass == null) {
			deviceManagementServiceFinalizeUpdateRequestStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISDeviceManagementServicePackage.eNS_URI).getEClassifiers().get(3);
		}
		return deviceManagementServiceFinalizeUpdateRequestStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceFinalizeUpdateRequestStructure_UpdateID() {
        return (EReference)getDeviceManagementServiceFinalizeUpdateRequestStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceFinalizeUpdateResponseStructure() {
		if (deviceManagementServiceFinalizeUpdateResponseStructureEClass == null) {
			deviceManagementServiceFinalizeUpdateResponseStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISDeviceManagementServicePackage.eNS_URI).getEClassifiers().get(4);
		}
		return deviceManagementServiceFinalizeUpdateResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceManagementServiceFinalizeUpdateResponseStructure_UpdateStatus() {
        return (EAttribute)getDeviceManagementServiceFinalizeUpdateResponseStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceFinalizeUpdateResponseStructure_OperationErrorMessage() {
        return (EReference)getDeviceManagementServiceFinalizeUpdateResponseStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure() {
		if (deviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructureEClass == null) {
			deviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISDeviceManagementServicePackage.eNS_URI).getEClassifiers().get(5);
		}
		return deviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure_TimeStamp() {
        return (EReference)getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure_SubdeviceErrorMessagesList() {
        return (EReference)getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure() {
		if (deviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructureEClass == null) {
			deviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISDeviceManagementServicePackage.eNS_URI).getEClassifiers().get(6);
		}
		return deviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure_DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseData() {
        return (EReference)getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure_OperationErrorMessage() {
        return (EReference)getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure() {
		if (deviceManagementServiceGetAllSubdeviceInformationResponseDataStructureEClass == null) {
			deviceManagementServiceGetAllSubdeviceInformationResponseDataStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISDeviceManagementServicePackage.eNS_URI).getEClassifiers().get(7);
		}
		return deviceManagementServiceGetAllSubdeviceInformationResponseDataStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure_TimeStamp() {
        return (EReference)getDeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure_SubdeviceInformationList() {
        return (EReference)getDeviceManagementServiceGetAllSubdeviceInformationResponseDataStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceGetAllSubdeviceInformationResponseStructure() {
		if (deviceManagementServiceGetAllSubdeviceInformationResponseStructureEClass == null) {
			deviceManagementServiceGetAllSubdeviceInformationResponseStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISDeviceManagementServicePackage.eNS_URI).getEClassifiers().get(8);
		}
		return deviceManagementServiceGetAllSubdeviceInformationResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetAllSubdeviceInformationResponseStructure_DeviceManagementServiceGetAllSubdeviceInformationResponseData() {
        return (EReference)getDeviceManagementServiceGetAllSubdeviceInformationResponseStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetAllSubdeviceInformationResponseStructure_OperationErrorMessage() {
        return (EReference)getDeviceManagementServiceGetAllSubdeviceInformationResponseStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure() {
		if (deviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructureEClass == null) {
			deviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISDeviceManagementServicePackage.eNS_URI).getEClassifiers().get(9);
		}
		return deviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure_TimeStamp() {
        return (EReference)getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure_SubdeviceStatusInformationList() {
        return (EReference)getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure() {
		if (deviceManagementServiceGetAllSubdeviceStatusInformationResponseStructureEClass == null) {
			deviceManagementServiceGetAllSubdeviceStatusInformationResponseStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISDeviceManagementServicePackage.eNS_URI).getEClassifiers().get(10);
		}
		return deviceManagementServiceGetAllSubdeviceStatusInformationResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure_DeviceManagementServiceGetAllSubdeviceStatusInformationResponseData() {
        return (EReference)getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure_OperationErrorMessage() {
        return (EReference)getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceGetDeviceConfigurationResponseDataStructure() {
		if (deviceManagementServiceGetDeviceConfigurationResponseDataStructureEClass == null) {
			deviceManagementServiceGetDeviceConfigurationResponseDataStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISDeviceManagementServicePackage.eNS_URI).getEClassifiers().get(11);
		}
		return deviceManagementServiceGetDeviceConfigurationResponseDataStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetDeviceConfigurationResponseDataStructure_TimeStamp() {
        return (EReference)getDeviceManagementServiceGetDeviceConfigurationResponseDataStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetDeviceConfigurationResponseDataStructure_DeviceID() {
        return (EReference)getDeviceManagementServiceGetDeviceConfigurationResponseDataStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceGetDeviceConfigurationResponseStructure() {
		if (deviceManagementServiceGetDeviceConfigurationResponseStructureEClass == null) {
			deviceManagementServiceGetDeviceConfigurationResponseStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISDeviceManagementServicePackage.eNS_URI).getEClassifiers().get(12);
		}
		return deviceManagementServiceGetDeviceConfigurationResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetDeviceConfigurationResponseStructure_DeviceManagementServiceGetDeviceConfigurationResponseData() {
        return (EReference)getDeviceManagementServiceGetDeviceConfigurationResponseStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetDeviceConfigurationResponseStructure_OperationErrorMessage() {
        return (EReference)getDeviceManagementServiceGetDeviceConfigurationResponseStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure() {
		if (deviceManagementServiceGetDeviceErrorMessagesResponseDataStructureEClass == null) {
			deviceManagementServiceGetDeviceErrorMessagesResponseDataStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISDeviceManagementServicePackage.eNS_URI).getEClassifiers().get(13);
		}
		return deviceManagementServiceGetDeviceErrorMessagesResponseDataStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure_TimeStamp() {
        return (EReference)getDeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure_ErrorMessage() {
        return (EReference)getDeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceGetDeviceErrorMessagesResponseStructure() {
		if (deviceManagementServiceGetDeviceErrorMessagesResponseStructureEClass == null) {
			deviceManagementServiceGetDeviceErrorMessagesResponseStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISDeviceManagementServicePackage.eNS_URI).getEClassifiers().get(14);
		}
		return deviceManagementServiceGetDeviceErrorMessagesResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetDeviceErrorMessagesResponseStructure_DeviceManagementServiceGetDeviceErrorMessagesResponseData() {
        return (EReference)getDeviceManagementServiceGetDeviceErrorMessagesResponseStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetDeviceErrorMessagesResponseStructure_OperationErrorMessage() {
        return (EReference)getDeviceManagementServiceGetDeviceErrorMessagesResponseStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceGetDeviceInformationResponseDataStructure() {
		if (deviceManagementServiceGetDeviceInformationResponseDataStructureEClass == null) {
			deviceManagementServiceGetDeviceInformationResponseDataStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISDeviceManagementServicePackage.eNS_URI).getEClassifiers().get(15);
		}
		return deviceManagementServiceGetDeviceInformationResponseDataStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetDeviceInformationResponseDataStructure_TimeStamp() {
        return (EReference)getDeviceManagementServiceGetDeviceInformationResponseDataStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetDeviceInformationResponseDataStructure_DeviceInformation() {
        return (EReference)getDeviceManagementServiceGetDeviceInformationResponseDataStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceGetDeviceInformationResponseStructure() {
		if (deviceManagementServiceGetDeviceInformationResponseStructureEClass == null) {
			deviceManagementServiceGetDeviceInformationResponseStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISDeviceManagementServicePackage.eNS_URI).getEClassifiers().get(16);
		}
		return deviceManagementServiceGetDeviceInformationResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetDeviceInformationResponseStructure_DeviceManagementServiceGetDeviceInformationResponseData() {
        return (EReference)getDeviceManagementServiceGetDeviceInformationResponseStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetDeviceInformationResponseStructure_OperationErrorMessage() {
        return (EReference)getDeviceManagementServiceGetDeviceInformationResponseStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceGetDeviceStatusInformationResponseDataStructure() {
		if (deviceManagementServiceGetDeviceStatusInformationResponseDataStructureEClass == null) {
			deviceManagementServiceGetDeviceStatusInformationResponseDataStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISDeviceManagementServicePackage.eNS_URI).getEClassifiers().get(17);
		}
		return deviceManagementServiceGetDeviceStatusInformationResponseDataStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetDeviceStatusInformationResponseDataStructure_TimeStamp() {
        return (EReference)getDeviceManagementServiceGetDeviceStatusInformationResponseDataStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetDeviceStatusInformationResponseDataStructure_DeviceStatusInformation() {
        return (EReference)getDeviceManagementServiceGetDeviceStatusInformationResponseDataStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceGetDeviceStatusInformationResponseStructure() {
		if (deviceManagementServiceGetDeviceStatusInformationResponseStructureEClass == null) {
			deviceManagementServiceGetDeviceStatusInformationResponseStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISDeviceManagementServicePackage.eNS_URI).getEClassifiers().get(18);
		}
		return deviceManagementServiceGetDeviceStatusInformationResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetDeviceStatusInformationResponseStructure_DeviceManagementServiceGetDeviceStatusInformationResponseData() {
        return (EReference)getDeviceManagementServiceGetDeviceStatusInformationResponseStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetDeviceStatusInformationResponseStructure_OperationErrorMessage() {
        return (EReference)getDeviceManagementServiceGetDeviceStatusInformationResponseStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceGetDeviceStatusResponseDataStructure() {
		if (deviceManagementServiceGetDeviceStatusResponseDataStructureEClass == null) {
			deviceManagementServiceGetDeviceStatusResponseDataStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISDeviceManagementServicePackage.eNS_URI).getEClassifiers().get(19);
		}
		return deviceManagementServiceGetDeviceStatusResponseDataStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetDeviceStatusResponseDataStructure_TimeStamp() {
        return (EReference)getDeviceManagementServiceGetDeviceStatusResponseDataStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceManagementServiceGetDeviceStatusResponseDataStructure_DeviceState() {
        return (EAttribute)getDeviceManagementServiceGetDeviceStatusResponseDataStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceGetDeviceStatusResponseStructure() {
		if (deviceManagementServiceGetDeviceStatusResponseStructureEClass == null) {
			deviceManagementServiceGetDeviceStatusResponseStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISDeviceManagementServicePackage.eNS_URI).getEClassifiers().get(20);
		}
		return deviceManagementServiceGetDeviceStatusResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetDeviceStatusResponseStructure_DeviceManagementServiceGetDeviceStatusResponseData() {
        return (EReference)getDeviceManagementServiceGetDeviceStatusResponseStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetDeviceStatusResponseStructure_OperationErrorMessage() {
        return (EReference)getDeviceManagementServiceGetDeviceStatusResponseStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceGetServiceInformationResponseDataStructure() {
		if (deviceManagementServiceGetServiceInformationResponseDataStructureEClass == null) {
			deviceManagementServiceGetServiceInformationResponseDataStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISDeviceManagementServicePackage.eNS_URI).getEClassifiers().get(21);
		}
		return deviceManagementServiceGetServiceInformationResponseDataStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetServiceInformationResponseDataStructure_TimeStamp() {
        return (EReference)getDeviceManagementServiceGetServiceInformationResponseDataStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetServiceInformationResponseDataStructure_ServiceInformationList() {
        return (EReference)getDeviceManagementServiceGetServiceInformationResponseDataStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceGetServiceInformationResponseStructure() {
		if (deviceManagementServiceGetServiceInformationResponseStructureEClass == null) {
			deviceManagementServiceGetServiceInformationResponseStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISDeviceManagementServicePackage.eNS_URI).getEClassifiers().get(22);
		}
		return deviceManagementServiceGetServiceInformationResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetServiceInformationResponseStructure_DeviceManagementServiceGetServiceInformationResponseData() {
        return (EReference)getDeviceManagementServiceGetServiceInformationResponseStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetServiceInformationResponseStructure_OperationErrorMessage() {
        return (EReference)getDeviceManagementServiceGetServiceInformationResponseStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceGetServiceStatusResponseDataStructure() {
		if (deviceManagementServiceGetServiceStatusResponseDataStructureEClass == null) {
			deviceManagementServiceGetServiceStatusResponseDataStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISDeviceManagementServicePackage.eNS_URI).getEClassifiers().get(23);
		}
		return deviceManagementServiceGetServiceStatusResponseDataStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetServiceStatusResponseDataStructure_TimeStamp() {
        return (EReference)getDeviceManagementServiceGetServiceStatusResponseDataStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetServiceStatusResponseDataStructure_ServiceSpecificationWithStateList() {
        return (EReference)getDeviceManagementServiceGetServiceStatusResponseDataStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceGetServiceStatusResponseStructure() {
		if (deviceManagementServiceGetServiceStatusResponseStructureEClass == null) {
			deviceManagementServiceGetServiceStatusResponseStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISDeviceManagementServicePackage.eNS_URI).getEClassifiers().get(24);
		}
		return deviceManagementServiceGetServiceStatusResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetServiceStatusResponseStructure_DeviceManagementServiceGetServiceStatusResponseData() {
        return (EReference)getDeviceManagementServiceGetServiceStatusResponseStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetServiceStatusResponseStructure_OperationErrorMessage() {
        return (EReference)getDeviceManagementServiceGetServiceStatusResponseStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceGetUpdateHistoryResponseStructure() {
		if (deviceManagementServiceGetUpdateHistoryResponseStructureEClass == null) {
			deviceManagementServiceGetUpdateHistoryResponseStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISDeviceManagementServicePackage.eNS_URI).getEClassifiers().get(25);
		}
		return deviceManagementServiceGetUpdateHistoryResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetUpdateHistoryResponseStructure_UpdateHistory() {
        return (EReference)getDeviceManagementServiceGetUpdateHistoryResponseStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceGetUpdateHistoryResponseStructure_OperationErrorMessage() {
        return (EReference)getDeviceManagementServiceGetUpdateHistoryResponseStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceInstallUpdateRequestStructure() {
		if (deviceManagementServiceInstallUpdateRequestStructureEClass == null) {
			deviceManagementServiceInstallUpdateRequestStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISDeviceManagementServicePackage.eNS_URI).getEClassifiers().get(26);
		}
		return deviceManagementServiceInstallUpdateRequestStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceInstallUpdateRequestStructure_UpdateID() {
        return (EReference)getDeviceManagementServiceInstallUpdateRequestStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceInstallUpdateRequestStructure_UpdateTimestamp() {
        return (EReference)getDeviceManagementServiceInstallUpdateRequestStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceInstallUpdateRequestStructure_UpdateURL() {
        return (EReference)getDeviceManagementServiceInstallUpdateRequestStructure().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceInstallUpdateRequestStructure_UpdateFileChecksum() {
        return (EReference)getDeviceManagementServiceInstallUpdateRequestStructure().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceInstallUpdateRequestStructure_UpdateFileSize() {
        return (EReference)getDeviceManagementServiceInstallUpdateRequestStructure().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceInstallUpdateResponseStructure() {
		if (deviceManagementServiceInstallUpdateResponseStructureEClass == null) {
			deviceManagementServiceInstallUpdateResponseStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISDeviceManagementServicePackage.eNS_URI).getEClassifiers().get(27);
		}
		return deviceManagementServiceInstallUpdateResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceManagementServiceInstallUpdateResponseStructure_UpdateAccept() {
        return (EAttribute)getDeviceManagementServiceInstallUpdateResponseStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceInstallUpdateResponseStructure_OperationErrorMessage() {
        return (EReference)getDeviceManagementServiceInstallUpdateResponseStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceRetrieveUpdateStateRequestStructure() {
		if (deviceManagementServiceRetrieveUpdateStateRequestStructureEClass == null) {
			deviceManagementServiceRetrieveUpdateStateRequestStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISDeviceManagementServicePackage.eNS_URI).getEClassifiers().get(28);
		}
		return deviceManagementServiceRetrieveUpdateStateRequestStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceRetrieveUpdateStateRequestStructure_UpdateID() {
        return (EReference)getDeviceManagementServiceRetrieveUpdateStateRequestStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceRetrieveUpdateStateResponseStructure() {
		if (deviceManagementServiceRetrieveUpdateStateResponseStructureEClass == null) {
			deviceManagementServiceRetrieveUpdateStateResponseStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISDeviceManagementServicePackage.eNS_URI).getEClassifiers().get(29);
		}
		return deviceManagementServiceRetrieveUpdateStateResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceRetrieveUpdateStateResponseStructure_UpdateStateData() {
        return (EReference)getDeviceManagementServiceRetrieveUpdateStateResponseStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceRetrieveUpdateStateResponseStructure_OperationErrorMessage() {
        return (EReference)getDeviceManagementServiceRetrieveUpdateStateResponseStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceUpdateHistoryEntryStructure() {
		if (deviceManagementServiceUpdateHistoryEntryStructureEClass == null) {
			deviceManagementServiceUpdateHistoryEntryStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISDeviceManagementServicePackage.eNS_URI).getEClassifiers().get(30);
		}
		return deviceManagementServiceUpdateHistoryEntryStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceUpdateHistoryEntryStructure_UpdateID() {
        return (EReference)getDeviceManagementServiceUpdateHistoryEntryStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceUpdateHistoryEntryStructure_UpdateTimestamp() {
        return (EReference)getDeviceManagementServiceUpdateHistoryEntryStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceUpdateHistoryEntryStructure_UpdateURL() {
        return (EReference)getDeviceManagementServiceUpdateHistoryEntryStructure().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceManagementServiceUpdateHistoryEntryStructure_UpdateStatus() {
        return (EAttribute)getDeviceManagementServiceUpdateHistoryEntryStructure().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceUpdateHistoryEntryStructure_DataVersionList() {
        return (EReference)getDeviceManagementServiceUpdateHistoryEntryStructure().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceUpdateHistoryEntryStructure_UpdateDetails() {
        return (EReference)getDeviceManagementServiceUpdateHistoryEntryStructure().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceUpdateHistoryStructure() {
		if (deviceManagementServiceUpdateHistoryStructureEClass == null) {
			deviceManagementServiceUpdateHistoryStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISDeviceManagementServicePackage.eNS_URI).getEClassifiers().get(31);
		}
		return deviceManagementServiceUpdateHistoryStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceUpdateHistoryStructure_UpdateHistoryEntry() {
        return (EReference)getDeviceManagementServiceUpdateHistoryStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceManagementServiceUpdateStateDataStructure() {
		if (deviceManagementServiceUpdateStateDataStructureEClass == null) {
			deviceManagementServiceUpdateStateDataStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISDeviceManagementServicePackage.eNS_URI).getEClassifiers().get(32);
		}
		return deviceManagementServiceUpdateStateDataStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceUpdateStateDataStructure_UpdateID() {
        return (EReference)getDeviceManagementServiceUpdateStateDataStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceUpdateStateDataStructure_UpdateTimestamp() {
        return (EReference)getDeviceManagementServiceUpdateStateDataStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceManagementServiceUpdateStateDataStructure_UpdateStatus() {
        return (EAttribute)getDeviceManagementServiceUpdateStateDataStructure().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceManagementServiceUpdateStateDataStructure_UpdateDetails() {
        return (EReference)getDeviceManagementServiceUpdateStateDataStructure().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceStatusInformationStructure() {
		if (deviceStatusInformationStructureEClass == null) {
			deviceStatusInformationStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISDeviceManagementServicePackage.eNS_URI).getEClassifiers().get(33);
		}
		return deviceStatusInformationStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceStatusInformationStructure_DeviceState() {
        return (EAttribute)getDeviceStatusInformationStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceStatusInformationStructure_DeviceStatusList() {
        return (EReference)getDeviceStatusInformationStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceStatusStructure() {
		if (deviceStatusStructureEClass == null) {
			deviceStatusStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISDeviceManagementServicePackage.eNS_URI).getEClassifiers().get(34);
		}
		return deviceStatusStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceStatusStructure_DeviceStatusName() {
        return (EReference)getDeviceStatusStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceStatusStructure_DeviceStatusFlag() {
        return (EReference)getDeviceStatusStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceStatusStructure_DeviceStatusImpact() {
        return (EAttribute)getDeviceStatusStructure().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceStatusStructure_DeviceStatusPriority() {
        return (EReference)getDeviceStatusStructure().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubdeviceErrorMessagesStructure() {
		if (subdeviceErrorMessagesStructureEClass == null) {
			subdeviceErrorMessagesStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISDeviceManagementServicePackage.eNS_URI).getEClassifiers().get(35);
		}
		return subdeviceErrorMessagesStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubdeviceErrorMessagesStructure_SubdeviceName() {
        return (EReference)getSubdeviceErrorMessagesStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubdeviceErrorMessagesStructure_ErrorMessage() {
        return (EReference)getSubdeviceErrorMessagesStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubdeviceInformationStructure() {
		if (subdeviceInformationStructureEClass == null) {
			subdeviceInformationStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISDeviceManagementServicePackage.eNS_URI).getEClassifiers().get(36);
		}
		return subdeviceInformationStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubdeviceInformationStructure_SubdeviceName() {
        return (EReference)getSubdeviceInformationStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubdeviceInformationStructure_DeviceInformation() {
        return (EReference)getSubdeviceInformationStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubdeviceStatusInformationStructure() {
		if (subdeviceStatusInformationStructureEClass == null) {
			subdeviceStatusInformationStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISDeviceManagementServicePackage.eNS_URI).getEClassifiers().get(37);
		}
		return subdeviceStatusInformationStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubdeviceStatusInformationStructure_SubdeviceName() {
        return (EReference)getSubdeviceStatusInformationStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubdeviceStatusInformationStructure_DeviceStatusInformation() {
        return (EReference)getSubdeviceStatusInformationStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getChecksumTypeEnumeration() {
		if (checksumTypeEnumerationEEnum == null) {
			checksumTypeEnumerationEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(IBISDeviceManagementServicePackage.eNS_URI).getEClassifiers().get(1);
		}
		return checksumTypeEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUpdateAcceptEnumeration() {
		if (updateAcceptEnumerationEEnum == null) {
			updateAcceptEnumerationEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(IBISDeviceManagementServicePackage.eNS_URI).getEClassifiers().get(38);
		}
		return updateAcceptEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUpdateStatusEnumeration() {
		if (updateStatusEnumerationEEnum == null) {
			updateStatusEnumerationEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(IBISDeviceManagementServicePackage.eNS_URI).getEClassifiers().get(40);
		}
		return updateStatusEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getChecksumTypeEnumerationObject() {
		if (checksumTypeEnumerationObjectEDataType == null) {
			checksumTypeEnumerationObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(IBISDeviceManagementServicePackage.eNS_URI).getEClassifiers().get(2);
		}
		return checksumTypeEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUpdateAcceptEnumerationObject() {
		if (updateAcceptEnumerationObjectEDataType == null) {
			updateAcceptEnumerationObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(IBISDeviceManagementServicePackage.eNS_URI).getEClassifiers().get(39);
		}
		return updateAcceptEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUpdateStatusEnumerationObject() {
		if (updateStatusEnumerationObjectEDataType == null) {
			updateStatusEnumerationObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(IBISDeviceManagementServicePackage.eNS_URI).getEClassifiers().get(41);
		}
		return updateStatusEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISDeviceManagementServiceFactory getIBISDeviceManagementServiceFactory() {
		return (IBISDeviceManagementServiceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("de.jena.mdo.ibis.devicemanagementservice." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //IBISDeviceManagementServicePackageImpl
