/**
 */
package de.jena.mdo.ibis.customerinformationservice.impl;

import de.jena.mdo.ibis.common.IbisCommonPackage;

import de.jena.mdo.ibis.customerinformationservice.IBISCustomerInformationServiceFactory;
import de.jena.mdo.ibis.customerinformationservice.IBISCustomerInformationServicePackage;

import de.jena.mdo.ibis.enumerations.IbisEnumerationsPackage;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
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
public class IBISCustomerInformationServicePackageImpl extends EPackageImpl implements IBISCustomerInformationServicePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "customerinformationservice.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerInformationServiceAllDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerInformationServiceCurrentAnnouncementDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerInformationServiceCurrentConnectionInformationDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerInformationServiceCurrentDisplayContentDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerInformationServiceCurrentStopIndexDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerInformationServiceCurrentStopPointDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerInformationServiceGetAllDataResponseStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerInformationServiceGetCurrentAnnouncementResponseStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerInformationServiceGetCurrentConnectionInformationResponseStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerInformationServiceGetCurrentDisplayContentResponseStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerInformationServiceGetCurrentStopIndexResponseStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerInformationServiceGetCurrentStopPointResponseStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerInformationServiceGetTripDataResponseStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerInformationServiceGetVehicleDataResponseStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerInformationServicePartialStopSequenceDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerInformationServiceRetrievePartialStopSequenceRequestStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerInformationServiceRetrievePartialStopSequenceResponseStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerInformationServiceTripDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerInformationServiceVehicleDataEClass = null;

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
	 * @see de.jena.mdo.ibis.customerinformationservice.IBISCustomerInformationServicePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IBISCustomerInformationServicePackageImpl() {
		super(eNS_URI, IBISCustomerInformationServiceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IBISCustomerInformationServicePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static IBISCustomerInformationServicePackage init() {
		if (isInited) return (IBISCustomerInformationServicePackage)EPackage.Registry.INSTANCE.getEPackage(IBISCustomerInformationServicePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredIBISCustomerInformationServicePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		IBISCustomerInformationServicePackageImpl theIBISCustomerInformationServicePackage = registeredIBISCustomerInformationServicePackage instanceof IBISCustomerInformationServicePackageImpl ? (IBISCustomerInformationServicePackageImpl)registeredIBISCustomerInformationServicePackage : new IBISCustomerInformationServicePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		IbisCommonPackage.eINSTANCE.eClass();
		IbisEnumerationsPackage.eINSTANCE.eClass();

		// Load packages
		theIBISCustomerInformationServicePackage.loadPackage();

		// Fix loaded packages
		theIBISCustomerInformationServicePackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theIBISCustomerInformationServicePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IBISCustomerInformationServicePackage.eNS_URI, theIBISCustomerInformationServicePackage);
		return theIBISCustomerInformationServicePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerInformationServiceAllData() {
		if (customerInformationServiceAllDataEClass == null) {
			customerInformationServiceAllDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISCustomerInformationServicePackage.eNS_URI).getEClassifiers().get(0);
		}
		return customerInformationServiceAllDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceAllData_TimeStamp() {
        return (EReference)getCustomerInformationServiceAllData().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceAllData_VehicleRef() {
        return (EReference)getCustomerInformationServiceAllData().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceAllData_DefaultLanguage() {
        return (EReference)getCustomerInformationServiceAllData().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceAllData_TripInformation() {
        return (EReference)getCustomerInformationServiceAllData().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceAllData_CurrentStopIndex() {
        return (EReference)getCustomerInformationServiceAllData().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInformationServiceAllData_RouteDeviation() {
        return (EAttribute)getCustomerInformationServiceAllData().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInformationServiceAllData_DoorState() {
        return (EAttribute)getCustomerInformationServiceAllData().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceAllData_InPanic() {
        return (EReference)getCustomerInformationServiceAllData().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceAllData_VehicleStopRequested() {
        return (EReference)getCustomerInformationServiceAllData().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInformationServiceAllData_ExitSide() {
        return (EAttribute)getCustomerInformationServiceAllData().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceAllData_MovingDirectionForward() {
        return (EReference)getCustomerInformationServiceAllData().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInformationServiceAllData_VehicleMode() {
        return (EAttribute)getCustomerInformationServiceAllData().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceAllData_MyOwnVehicleMode() {
        return (EReference)getCustomerInformationServiceAllData().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceAllData_SpeakerActive() {
        return (EReference)getCustomerInformationServiceAllData().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceAllData_StopInformationActive() {
        return (EReference)getCustomerInformationServiceAllData().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInformationServiceAllData_TripState() {
        return (EAttribute)getCustomerInformationServiceAllData().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceAllData_GlobalDisplayContent() {
        return (EReference)getCustomerInformationServiceAllData().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerInformationServiceCurrentAnnouncementData() {
		if (customerInformationServiceCurrentAnnouncementDataEClass == null) {
			customerInformationServiceCurrentAnnouncementDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISCustomerInformationServicePackage.eNS_URI).getEClassifiers().get(1);
		}
		return customerInformationServiceCurrentAnnouncementDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceCurrentAnnouncementData_TimeStamp() {
        return (EReference)getCustomerInformationServiceCurrentAnnouncementData().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceCurrentAnnouncementData_CurrentAnnouncement() {
        return (EReference)getCustomerInformationServiceCurrentAnnouncementData().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerInformationServiceCurrentConnectionInformationData() {
		if (customerInformationServiceCurrentConnectionInformationDataEClass == null) {
			customerInformationServiceCurrentConnectionInformationDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISCustomerInformationServicePackage.eNS_URI).getEClassifiers().get(2);
		}
		return customerInformationServiceCurrentConnectionInformationDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceCurrentConnectionInformationData_TimeStamp() {
        return (EReference)getCustomerInformationServiceCurrentConnectionInformationData().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceCurrentConnectionInformationData_CurrentConnection() {
        return (EReference)getCustomerInformationServiceCurrentConnectionInformationData().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerInformationServiceCurrentDisplayContentData() {
		if (customerInformationServiceCurrentDisplayContentDataEClass == null) {
			customerInformationServiceCurrentDisplayContentDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISCustomerInformationServicePackage.eNS_URI).getEClassifiers().get(3);
		}
		return customerInformationServiceCurrentDisplayContentDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceCurrentDisplayContentData_TimeStamp() {
        return (EReference)getCustomerInformationServiceCurrentDisplayContentData().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceCurrentDisplayContentData_CurrentDisplayContent() {
        return (EReference)getCustomerInformationServiceCurrentDisplayContentData().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerInformationServiceCurrentStopIndexData() {
		if (customerInformationServiceCurrentStopIndexDataEClass == null) {
			customerInformationServiceCurrentStopIndexDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISCustomerInformationServicePackage.eNS_URI).getEClassifiers().get(4);
		}
		return customerInformationServiceCurrentStopIndexDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceCurrentStopIndexData_TimeStamp() {
        return (EReference)getCustomerInformationServiceCurrentStopIndexData().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceCurrentStopIndexData_CurrentStopIndex() {
        return (EReference)getCustomerInformationServiceCurrentStopIndexData().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerInformationServiceCurrentStopPointData() {
		if (customerInformationServiceCurrentStopPointDataEClass == null) {
			customerInformationServiceCurrentStopPointDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISCustomerInformationServicePackage.eNS_URI).getEClassifiers().get(5);
		}
		return customerInformationServiceCurrentStopPointDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceCurrentStopPointData_TimeStamp() {
        return (EReference)getCustomerInformationServiceCurrentStopPointData().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceCurrentStopPointData_CurrentStopPoint() {
        return (EReference)getCustomerInformationServiceCurrentStopPointData().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerInformationServiceGetAllDataResponseStructure() {
		if (customerInformationServiceGetAllDataResponseStructureEClass == null) {
			customerInformationServiceGetAllDataResponseStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISCustomerInformationServicePackage.eNS_URI).getEClassifiers().get(6);
		}
		return customerInformationServiceGetAllDataResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceGetAllDataResponseStructure_AllData() {
        return (EReference)getCustomerInformationServiceGetAllDataResponseStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceGetAllDataResponseStructure_OperationErrorMessage() {
        return (EReference)getCustomerInformationServiceGetAllDataResponseStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerInformationServiceGetCurrentAnnouncementResponseStructure() {
		if (customerInformationServiceGetCurrentAnnouncementResponseStructureEClass == null) {
			customerInformationServiceGetCurrentAnnouncementResponseStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISCustomerInformationServicePackage.eNS_URI).getEClassifiers().get(7);
		}
		return customerInformationServiceGetCurrentAnnouncementResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceGetCurrentAnnouncementResponseStructure_CurrentAnnouncementData() {
        return (EReference)getCustomerInformationServiceGetCurrentAnnouncementResponseStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceGetCurrentAnnouncementResponseStructure_OperationErrorMessage() {
        return (EReference)getCustomerInformationServiceGetCurrentAnnouncementResponseStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerInformationServiceGetCurrentConnectionInformationResponseStructure() {
		if (customerInformationServiceGetCurrentConnectionInformationResponseStructureEClass == null) {
			customerInformationServiceGetCurrentConnectionInformationResponseStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISCustomerInformationServicePackage.eNS_URI).getEClassifiers().get(8);
		}
		return customerInformationServiceGetCurrentConnectionInformationResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceGetCurrentConnectionInformationResponseStructure_CurrentConnectionData() {
        return (EReference)getCustomerInformationServiceGetCurrentConnectionInformationResponseStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceGetCurrentConnectionInformationResponseStructure_OperationErrorMessage() {
        return (EReference)getCustomerInformationServiceGetCurrentConnectionInformationResponseStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerInformationServiceGetCurrentDisplayContentResponseStructure() {
		if (customerInformationServiceGetCurrentDisplayContentResponseStructureEClass == null) {
			customerInformationServiceGetCurrentDisplayContentResponseStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISCustomerInformationServicePackage.eNS_URI).getEClassifiers().get(9);
		}
		return customerInformationServiceGetCurrentDisplayContentResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceGetCurrentDisplayContentResponseStructure_CurrentDisplayContentData() {
        return (EReference)getCustomerInformationServiceGetCurrentDisplayContentResponseStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceGetCurrentDisplayContentResponseStructure_OperationErrorMessage() {
        return (EReference)getCustomerInformationServiceGetCurrentDisplayContentResponseStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerInformationServiceGetCurrentStopIndexResponseStructure() {
		if (customerInformationServiceGetCurrentStopIndexResponseStructureEClass == null) {
			customerInformationServiceGetCurrentStopIndexResponseStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISCustomerInformationServicePackage.eNS_URI).getEClassifiers().get(10);
		}
		return customerInformationServiceGetCurrentStopIndexResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceGetCurrentStopIndexResponseStructure_CurrentStopIndexData() {
        return (EReference)getCustomerInformationServiceGetCurrentStopIndexResponseStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceGetCurrentStopIndexResponseStructure_OperationErrorMessage() {
        return (EReference)getCustomerInformationServiceGetCurrentStopIndexResponseStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerInformationServiceGetCurrentStopPointResponseStructure() {
		if (customerInformationServiceGetCurrentStopPointResponseStructureEClass == null) {
			customerInformationServiceGetCurrentStopPointResponseStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISCustomerInformationServicePackage.eNS_URI).getEClassifiers().get(11);
		}
		return customerInformationServiceGetCurrentStopPointResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceGetCurrentStopPointResponseStructure_CurrentStopPointData() {
        return (EReference)getCustomerInformationServiceGetCurrentStopPointResponseStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceGetCurrentStopPointResponseStructure_OperationErrorMessage() {
        return (EReference)getCustomerInformationServiceGetCurrentStopPointResponseStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerInformationServiceGetTripDataResponseStructure() {
		if (customerInformationServiceGetTripDataResponseStructureEClass == null) {
			customerInformationServiceGetTripDataResponseStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISCustomerInformationServicePackage.eNS_URI).getEClassifiers().get(12);
		}
		return customerInformationServiceGetTripDataResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceGetTripDataResponseStructure_TripData() {
        return (EReference)getCustomerInformationServiceGetTripDataResponseStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceGetTripDataResponseStructure_OperationErrorMessage() {
        return (EReference)getCustomerInformationServiceGetTripDataResponseStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerInformationServiceGetVehicleDataResponseStructure() {
		if (customerInformationServiceGetVehicleDataResponseStructureEClass == null) {
			customerInformationServiceGetVehicleDataResponseStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISCustomerInformationServicePackage.eNS_URI).getEClassifiers().get(13);
		}
		return customerInformationServiceGetVehicleDataResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceGetVehicleDataResponseStructure_VehicleData() {
        return (EReference)getCustomerInformationServiceGetVehicleDataResponseStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceGetVehicleDataResponseStructure_OperationErrorMessage() {
        return (EReference)getCustomerInformationServiceGetVehicleDataResponseStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerInformationServicePartialStopSequenceData() {
		if (customerInformationServicePartialStopSequenceDataEClass == null) {
			customerInformationServicePartialStopSequenceDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISCustomerInformationServicePackage.eNS_URI).getEClassifiers().get(14);
		}
		return customerInformationServicePartialStopSequenceDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServicePartialStopSequenceData_TimeStamp() {
        return (EReference)getCustomerInformationServicePartialStopSequenceData().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServicePartialStopSequenceData_StopSequence() {
        return (EReference)getCustomerInformationServicePartialStopSequenceData().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerInformationServiceRetrievePartialStopSequenceRequestStructure() {
		if (customerInformationServiceRetrievePartialStopSequenceRequestStructureEClass == null) {
			customerInformationServiceRetrievePartialStopSequenceRequestStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISCustomerInformationServicePackage.eNS_URI).getEClassifiers().get(15);
		}
		return customerInformationServiceRetrievePartialStopSequenceRequestStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceRetrievePartialStopSequenceRequestStructure_StartingStopIndex() {
        return (EReference)getCustomerInformationServiceRetrievePartialStopSequenceRequestStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceRetrievePartialStopSequenceRequestStructure_NumberOfStopPoints() {
        return (EReference)getCustomerInformationServiceRetrievePartialStopSequenceRequestStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerInformationServiceRetrievePartialStopSequenceResponseStructure() {
		if (customerInformationServiceRetrievePartialStopSequenceResponseStructureEClass == null) {
			customerInformationServiceRetrievePartialStopSequenceResponseStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISCustomerInformationServicePackage.eNS_URI).getEClassifiers().get(16);
		}
		return customerInformationServiceRetrievePartialStopSequenceResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceRetrievePartialStopSequenceResponseStructure_PartialStopSequenceData() {
        return (EReference)getCustomerInformationServiceRetrievePartialStopSequenceResponseStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceRetrievePartialStopSequenceResponseStructure_OperationErrorMessage() {
        return (EReference)getCustomerInformationServiceRetrievePartialStopSequenceResponseStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerInformationServiceTripData() {
		if (customerInformationServiceTripDataEClass == null) {
			customerInformationServiceTripDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISCustomerInformationServicePackage.eNS_URI).getEClassifiers().get(17);
		}
		return customerInformationServiceTripDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceTripData_TimeStamp() {
        return (EReference)getCustomerInformationServiceTripData().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceTripData_VehicleRef() {
        return (EReference)getCustomerInformationServiceTripData().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceTripData_DefaultLanguage() {
        return (EReference)getCustomerInformationServiceTripData().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceTripData_TripInformation() {
        return (EReference)getCustomerInformationServiceTripData().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceTripData_CurrentStopIndex() {
        return (EReference)getCustomerInformationServiceTripData().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerInformationServiceVehicleData() {
		if (customerInformationServiceVehicleDataEClass == null) {
			customerInformationServiceVehicleDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IBISCustomerInformationServicePackage.eNS_URI).getEClassifiers().get(18);
		}
		return customerInformationServiceVehicleDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceVehicleData_TimeStamp() {
        return (EReference)getCustomerInformationServiceVehicleData().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceVehicleData_VehicleRef() {
        return (EReference)getCustomerInformationServiceVehicleData().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInformationServiceVehicleData_RouteDeviation() {
        return (EAttribute)getCustomerInformationServiceVehicleData().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInformationServiceVehicleData_DoorState() {
        return (EAttribute)getCustomerInformationServiceVehicleData().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceVehicleData_InPanic() {
        return (EReference)getCustomerInformationServiceVehicleData().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceVehicleData_VehicleStopRequested() {
        return (EReference)getCustomerInformationServiceVehicleData().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInformationServiceVehicleData_ExitSide() {
        return (EAttribute)getCustomerInformationServiceVehicleData().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceVehicleData_MovingDirectionForward() {
        return (EReference)getCustomerInformationServiceVehicleData().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInformationServiceVehicleData_VehicleMode() {
        return (EAttribute)getCustomerInformationServiceVehicleData().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceVehicleData_MyOwnVehicleMode() {
        return (EReference)getCustomerInformationServiceVehicleData().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceVehicleData_SpeakerActive() {
        return (EReference)getCustomerInformationServiceVehicleData().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceVehicleData_StopInformationActive() {
        return (EReference)getCustomerInformationServiceVehicleData().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInformationServiceVehicleData_TripState() {
        return (EAttribute)getCustomerInformationServiceVehicleData().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISCustomerInformationServiceFactory getIBISCustomerInformationServiceFactory() {
		return (IBISCustomerInformationServiceFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("de.jena.mdo.ibis.customerinformationservice." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //IBISCustomerInformationServicePackageImpl
