/**
 */
package de.jena.mdo.ibis.customerinformationservice.impl;

import de.jena.mdo.ibis.common.IbisCommonPackage;

import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceAllData;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentAnnouncementData;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentConnectionInformationData;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentDisplayContentData;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentStopIndexData;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentStopPointData;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetAllDataResponseStructure;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentAnnouncementResponseStructure;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentConnectionInformationResponseStructure;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentDisplayContentResponseStructure;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentStopIndexResponseStructure;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentStopPointResponseStructure;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetTripDataResponseStructure;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetVehicleDataResponseStructure;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServicePartialStopSequenceData;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceRetrievePartialStopSequenceRequestStructure;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceRetrievePartialStopSequenceResponseStructure;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceTripData;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceVehicleData;
import de.jena.mdo.ibis.customerinformationservice.IbisCustomerInformationServiceFactory;
import de.jena.mdo.ibis.customerinformationservice.IbisCustomerInformationServicePackage;

import de.jena.mdo.ibis.enumerations.IbisEnumerationsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IbisCustomerInformationServicePackageImpl extends EPackageImpl implements IbisCustomerInformationServicePackage {
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
	 * @see de.jena.mdo.ibis.customerinformationservice.IbisCustomerInformationServicePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IbisCustomerInformationServicePackageImpl() {
		super(eNS_URI, IbisCustomerInformationServiceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IbisCustomerInformationServicePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IbisCustomerInformationServicePackage init() {
		if (isInited) return (IbisCustomerInformationServicePackage)EPackage.Registry.INSTANCE.getEPackage(IbisCustomerInformationServicePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredIbisCustomerInformationServicePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		IbisCustomerInformationServicePackageImpl theIbisCustomerInformationServicePackage = registeredIbisCustomerInformationServicePackage instanceof IbisCustomerInformationServicePackageImpl ? (IbisCustomerInformationServicePackageImpl)registeredIbisCustomerInformationServicePackage : new IbisCustomerInformationServicePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		IbisCommonPackage.eINSTANCE.eClass();
		IbisEnumerationsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theIbisCustomerInformationServicePackage.createPackageContents();

		// Initialize created meta-data
		theIbisCustomerInformationServicePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIbisCustomerInformationServicePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IbisCustomerInformationServicePackage.eNS_URI, theIbisCustomerInformationServicePackage);
		return theIbisCustomerInformationServicePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerInformationServiceAllData() {
		return customerInformationServiceAllDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceAllData_TimeStamp() {
		return (EReference)customerInformationServiceAllDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceAllData_VehicleRef() {
		return (EReference)customerInformationServiceAllDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceAllData_DefaultLanguage() {
		return (EReference)customerInformationServiceAllDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceAllData_TripInformation() {
		return (EReference)customerInformationServiceAllDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceAllData_CurrentStopIndex() {
		return (EReference)customerInformationServiceAllDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInformationServiceAllData_RouteDeviation() {
		return (EAttribute)customerInformationServiceAllDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInformationServiceAllData_DoorState() {
		return (EAttribute)customerInformationServiceAllDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceAllData_InPanic() {
		return (EReference)customerInformationServiceAllDataEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceAllData_VehicleStopRequested() {
		return (EReference)customerInformationServiceAllDataEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInformationServiceAllData_ExitSide() {
		return (EAttribute)customerInformationServiceAllDataEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceAllData_MovingDirectionForward() {
		return (EReference)customerInformationServiceAllDataEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInformationServiceAllData_VehicleMode() {
		return (EAttribute)customerInformationServiceAllDataEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceAllData_MyOwnVehicleMode() {
		return (EReference)customerInformationServiceAllDataEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceAllData_SpeakerActive() {
		return (EReference)customerInformationServiceAllDataEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceAllData_StopInformationActive() {
		return (EReference)customerInformationServiceAllDataEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInformationServiceAllData_TripState() {
		return (EAttribute)customerInformationServiceAllDataEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceAllData_GlobalDisplayContent() {
		return (EReference)customerInformationServiceAllDataEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerInformationServiceCurrentAnnouncementData() {
		return customerInformationServiceCurrentAnnouncementDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceCurrentAnnouncementData_TimeStamp() {
		return (EReference)customerInformationServiceCurrentAnnouncementDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceCurrentAnnouncementData_CurrentAnnouncement() {
		return (EReference)customerInformationServiceCurrentAnnouncementDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerInformationServiceCurrentConnectionInformationData() {
		return customerInformationServiceCurrentConnectionInformationDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceCurrentConnectionInformationData_TimeStamp() {
		return (EReference)customerInformationServiceCurrentConnectionInformationDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceCurrentConnectionInformationData_CurrentConnection() {
		return (EReference)customerInformationServiceCurrentConnectionInformationDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerInformationServiceCurrentDisplayContentData() {
		return customerInformationServiceCurrentDisplayContentDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceCurrentDisplayContentData_TimeStamp() {
		return (EReference)customerInformationServiceCurrentDisplayContentDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceCurrentDisplayContentData_CurrentDisplayContent() {
		return (EReference)customerInformationServiceCurrentDisplayContentDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerInformationServiceCurrentStopIndexData() {
		return customerInformationServiceCurrentStopIndexDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceCurrentStopIndexData_TimeStamp() {
		return (EReference)customerInformationServiceCurrentStopIndexDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceCurrentStopIndexData_CurrentStopIndex() {
		return (EReference)customerInformationServiceCurrentStopIndexDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerInformationServiceCurrentStopPointData() {
		return customerInformationServiceCurrentStopPointDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceCurrentStopPointData_TimeStamp() {
		return (EReference)customerInformationServiceCurrentStopPointDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceCurrentStopPointData_CurrentStopPoint() {
		return (EReference)customerInformationServiceCurrentStopPointDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerInformationServiceGetAllDataResponseStructure() {
		return customerInformationServiceGetAllDataResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceGetAllDataResponseStructure_AllData() {
		return (EReference)customerInformationServiceGetAllDataResponseStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceGetAllDataResponseStructure_OperationErrorMessage() {
		return (EReference)customerInformationServiceGetAllDataResponseStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerInformationServiceGetCurrentAnnouncementResponseStructure() {
		return customerInformationServiceGetCurrentAnnouncementResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceGetCurrentAnnouncementResponseStructure_CurrentAnnouncementData() {
		return (EReference)customerInformationServiceGetCurrentAnnouncementResponseStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceGetCurrentAnnouncementResponseStructure_OperationErrorMessage() {
		return (EReference)customerInformationServiceGetCurrentAnnouncementResponseStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerInformationServiceGetCurrentConnectionInformationResponseStructure() {
		return customerInformationServiceGetCurrentConnectionInformationResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceGetCurrentConnectionInformationResponseStructure_CurrentConnectionData() {
		return (EReference)customerInformationServiceGetCurrentConnectionInformationResponseStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceGetCurrentConnectionInformationResponseStructure_OperationErrorMessage() {
		return (EReference)customerInformationServiceGetCurrentConnectionInformationResponseStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerInformationServiceGetCurrentDisplayContentResponseStructure() {
		return customerInformationServiceGetCurrentDisplayContentResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceGetCurrentDisplayContentResponseStructure_CurrentDisplayContentData() {
		return (EReference)customerInformationServiceGetCurrentDisplayContentResponseStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceGetCurrentDisplayContentResponseStructure_OperationErrorMessage() {
		return (EReference)customerInformationServiceGetCurrentDisplayContentResponseStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerInformationServiceGetCurrentStopIndexResponseStructure() {
		return customerInformationServiceGetCurrentStopIndexResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceGetCurrentStopIndexResponseStructure_CurrentStopIndexData() {
		return (EReference)customerInformationServiceGetCurrentStopIndexResponseStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceGetCurrentStopIndexResponseStructure_OperationErrorMessage() {
		return (EReference)customerInformationServiceGetCurrentStopIndexResponseStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerInformationServiceGetCurrentStopPointResponseStructure() {
		return customerInformationServiceGetCurrentStopPointResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceGetCurrentStopPointResponseStructure_CurrentStopPointData() {
		return (EReference)customerInformationServiceGetCurrentStopPointResponseStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceGetCurrentStopPointResponseStructure_OperationErrorMessage() {
		return (EReference)customerInformationServiceGetCurrentStopPointResponseStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerInformationServiceGetTripDataResponseStructure() {
		return customerInformationServiceGetTripDataResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceGetTripDataResponseStructure_TripData() {
		return (EReference)customerInformationServiceGetTripDataResponseStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceGetTripDataResponseStructure_OperationErrorMessage() {
		return (EReference)customerInformationServiceGetTripDataResponseStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerInformationServiceGetVehicleDataResponseStructure() {
		return customerInformationServiceGetVehicleDataResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceGetVehicleDataResponseStructure_VehicleData() {
		return (EReference)customerInformationServiceGetVehicleDataResponseStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceGetVehicleDataResponseStructure_OperationErrorMessage() {
		return (EReference)customerInformationServiceGetVehicleDataResponseStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerInformationServicePartialStopSequenceData() {
		return customerInformationServicePartialStopSequenceDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServicePartialStopSequenceData_TimeStamp() {
		return (EReference)customerInformationServicePartialStopSequenceDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServicePartialStopSequenceData_StopSequence() {
		return (EReference)customerInformationServicePartialStopSequenceDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerInformationServiceRetrievePartialStopSequenceRequestStructure() {
		return customerInformationServiceRetrievePartialStopSequenceRequestStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceRetrievePartialStopSequenceRequestStructure_StartingStopIndex() {
		return (EReference)customerInformationServiceRetrievePartialStopSequenceRequestStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceRetrievePartialStopSequenceRequestStructure_NumberOfStopPoints() {
		return (EReference)customerInformationServiceRetrievePartialStopSequenceRequestStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerInformationServiceRetrievePartialStopSequenceResponseStructure() {
		return customerInformationServiceRetrievePartialStopSequenceResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceRetrievePartialStopSequenceResponseStructure_PartialStopSequenceData() {
		return (EReference)customerInformationServiceRetrievePartialStopSequenceResponseStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceRetrievePartialStopSequenceResponseStructure_OperationErrorMessage() {
		return (EReference)customerInformationServiceRetrievePartialStopSequenceResponseStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerInformationServiceTripData() {
		return customerInformationServiceTripDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceTripData_TimeStamp() {
		return (EReference)customerInformationServiceTripDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceTripData_VehicleRef() {
		return (EReference)customerInformationServiceTripDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceTripData_DefaultLanguage() {
		return (EReference)customerInformationServiceTripDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceTripData_TripInformation() {
		return (EReference)customerInformationServiceTripDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceTripData_CurrentStopIndex() {
		return (EReference)customerInformationServiceTripDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerInformationServiceVehicleData() {
		return customerInformationServiceVehicleDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceVehicleData_TimeStamp() {
		return (EReference)customerInformationServiceVehicleDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceVehicleData_VehicleRef() {
		return (EReference)customerInformationServiceVehicleDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInformationServiceVehicleData_RouteDeviation() {
		return (EAttribute)customerInformationServiceVehicleDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInformationServiceVehicleData_DoorState() {
		return (EAttribute)customerInformationServiceVehicleDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceVehicleData_InPanic() {
		return (EReference)customerInformationServiceVehicleDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceVehicleData_VehicleStopRequested() {
		return (EReference)customerInformationServiceVehicleDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInformationServiceVehicleData_ExitSide() {
		return (EAttribute)customerInformationServiceVehicleDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceVehicleData_MovingDirectionForward() {
		return (EReference)customerInformationServiceVehicleDataEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInformationServiceVehicleData_VehicleMode() {
		return (EAttribute)customerInformationServiceVehicleDataEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceVehicleData_MyOwnVehicleMode() {
		return (EReference)customerInformationServiceVehicleDataEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceVehicleData_SpeakerActive() {
		return (EReference)customerInformationServiceVehicleDataEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomerInformationServiceVehicleData_StopInformationActive() {
		return (EReference)customerInformationServiceVehicleDataEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInformationServiceVehicleData_TripState() {
		return (EAttribute)customerInformationServiceVehicleDataEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IbisCustomerInformationServiceFactory getIbisCustomerInformationServiceFactory() {
		return (IbisCustomerInformationServiceFactory)getEFactoryInstance();
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
		customerInformationServiceAllDataEClass = createEClass(CUSTOMER_INFORMATION_SERVICE_ALL_DATA);
		createEReference(customerInformationServiceAllDataEClass, CUSTOMER_INFORMATION_SERVICE_ALL_DATA__TIME_STAMP);
		createEReference(customerInformationServiceAllDataEClass, CUSTOMER_INFORMATION_SERVICE_ALL_DATA__VEHICLE_REF);
		createEReference(customerInformationServiceAllDataEClass, CUSTOMER_INFORMATION_SERVICE_ALL_DATA__DEFAULT_LANGUAGE);
		createEReference(customerInformationServiceAllDataEClass, CUSTOMER_INFORMATION_SERVICE_ALL_DATA__TRIP_INFORMATION);
		createEReference(customerInformationServiceAllDataEClass, CUSTOMER_INFORMATION_SERVICE_ALL_DATA__CURRENT_STOP_INDEX);
		createEAttribute(customerInformationServiceAllDataEClass, CUSTOMER_INFORMATION_SERVICE_ALL_DATA__ROUTE_DEVIATION);
		createEAttribute(customerInformationServiceAllDataEClass, CUSTOMER_INFORMATION_SERVICE_ALL_DATA__DOOR_STATE);
		createEReference(customerInformationServiceAllDataEClass, CUSTOMER_INFORMATION_SERVICE_ALL_DATA__IN_PANIC);
		createEReference(customerInformationServiceAllDataEClass, CUSTOMER_INFORMATION_SERVICE_ALL_DATA__VEHICLE_STOP_REQUESTED);
		createEAttribute(customerInformationServiceAllDataEClass, CUSTOMER_INFORMATION_SERVICE_ALL_DATA__EXIT_SIDE);
		createEReference(customerInformationServiceAllDataEClass, CUSTOMER_INFORMATION_SERVICE_ALL_DATA__MOVING_DIRECTION_FORWARD);
		createEAttribute(customerInformationServiceAllDataEClass, CUSTOMER_INFORMATION_SERVICE_ALL_DATA__VEHICLE_MODE);
		createEReference(customerInformationServiceAllDataEClass, CUSTOMER_INFORMATION_SERVICE_ALL_DATA__MY_OWN_VEHICLE_MODE);
		createEReference(customerInformationServiceAllDataEClass, CUSTOMER_INFORMATION_SERVICE_ALL_DATA__SPEAKER_ACTIVE);
		createEReference(customerInformationServiceAllDataEClass, CUSTOMER_INFORMATION_SERVICE_ALL_DATA__STOP_INFORMATION_ACTIVE);
		createEAttribute(customerInformationServiceAllDataEClass, CUSTOMER_INFORMATION_SERVICE_ALL_DATA__TRIP_STATE);
		createEReference(customerInformationServiceAllDataEClass, CUSTOMER_INFORMATION_SERVICE_ALL_DATA__GLOBAL_DISPLAY_CONTENT);

		customerInformationServiceCurrentAnnouncementDataEClass = createEClass(CUSTOMER_INFORMATION_SERVICE_CURRENT_ANNOUNCEMENT_DATA);
		createEReference(customerInformationServiceCurrentAnnouncementDataEClass, CUSTOMER_INFORMATION_SERVICE_CURRENT_ANNOUNCEMENT_DATA__TIME_STAMP);
		createEReference(customerInformationServiceCurrentAnnouncementDataEClass, CUSTOMER_INFORMATION_SERVICE_CURRENT_ANNOUNCEMENT_DATA__CURRENT_ANNOUNCEMENT);

		customerInformationServiceCurrentConnectionInformationDataEClass = createEClass(CUSTOMER_INFORMATION_SERVICE_CURRENT_CONNECTION_INFORMATION_DATA);
		createEReference(customerInformationServiceCurrentConnectionInformationDataEClass, CUSTOMER_INFORMATION_SERVICE_CURRENT_CONNECTION_INFORMATION_DATA__TIME_STAMP);
		createEReference(customerInformationServiceCurrentConnectionInformationDataEClass, CUSTOMER_INFORMATION_SERVICE_CURRENT_CONNECTION_INFORMATION_DATA__CURRENT_CONNECTION);

		customerInformationServiceCurrentDisplayContentDataEClass = createEClass(CUSTOMER_INFORMATION_SERVICE_CURRENT_DISPLAY_CONTENT_DATA);
		createEReference(customerInformationServiceCurrentDisplayContentDataEClass, CUSTOMER_INFORMATION_SERVICE_CURRENT_DISPLAY_CONTENT_DATA__TIME_STAMP);
		createEReference(customerInformationServiceCurrentDisplayContentDataEClass, CUSTOMER_INFORMATION_SERVICE_CURRENT_DISPLAY_CONTENT_DATA__CURRENT_DISPLAY_CONTENT);

		customerInformationServiceCurrentStopIndexDataEClass = createEClass(CUSTOMER_INFORMATION_SERVICE_CURRENT_STOP_INDEX_DATA);
		createEReference(customerInformationServiceCurrentStopIndexDataEClass, CUSTOMER_INFORMATION_SERVICE_CURRENT_STOP_INDEX_DATA__TIME_STAMP);
		createEReference(customerInformationServiceCurrentStopIndexDataEClass, CUSTOMER_INFORMATION_SERVICE_CURRENT_STOP_INDEX_DATA__CURRENT_STOP_INDEX);

		customerInformationServiceCurrentStopPointDataEClass = createEClass(CUSTOMER_INFORMATION_SERVICE_CURRENT_STOP_POINT_DATA);
		createEReference(customerInformationServiceCurrentStopPointDataEClass, CUSTOMER_INFORMATION_SERVICE_CURRENT_STOP_POINT_DATA__TIME_STAMP);
		createEReference(customerInformationServiceCurrentStopPointDataEClass, CUSTOMER_INFORMATION_SERVICE_CURRENT_STOP_POINT_DATA__CURRENT_STOP_POINT);

		customerInformationServiceGetAllDataResponseStructureEClass = createEClass(CUSTOMER_INFORMATION_SERVICE_GET_ALL_DATA_RESPONSE_STRUCTURE);
		createEReference(customerInformationServiceGetAllDataResponseStructureEClass, CUSTOMER_INFORMATION_SERVICE_GET_ALL_DATA_RESPONSE_STRUCTURE__ALL_DATA);
		createEReference(customerInformationServiceGetAllDataResponseStructureEClass, CUSTOMER_INFORMATION_SERVICE_GET_ALL_DATA_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE);

		customerInformationServiceGetCurrentAnnouncementResponseStructureEClass = createEClass(CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_ANNOUNCEMENT_RESPONSE_STRUCTURE);
		createEReference(customerInformationServiceGetCurrentAnnouncementResponseStructureEClass, CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_ANNOUNCEMENT_RESPONSE_STRUCTURE__CURRENT_ANNOUNCEMENT_DATA);
		createEReference(customerInformationServiceGetCurrentAnnouncementResponseStructureEClass, CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_ANNOUNCEMENT_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE);

		customerInformationServiceGetCurrentConnectionInformationResponseStructureEClass = createEClass(CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_CONNECTION_INFORMATION_RESPONSE_STRUCTURE);
		createEReference(customerInformationServiceGetCurrentConnectionInformationResponseStructureEClass, CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_CONNECTION_INFORMATION_RESPONSE_STRUCTURE__CURRENT_CONNECTION_DATA);
		createEReference(customerInformationServiceGetCurrentConnectionInformationResponseStructureEClass, CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_CONNECTION_INFORMATION_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE);

		customerInformationServiceGetCurrentDisplayContentResponseStructureEClass = createEClass(CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_DISPLAY_CONTENT_RESPONSE_STRUCTURE);
		createEReference(customerInformationServiceGetCurrentDisplayContentResponseStructureEClass, CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_DISPLAY_CONTENT_RESPONSE_STRUCTURE__CURRENT_DISPLAY_CONTENT_DATA);
		createEReference(customerInformationServiceGetCurrentDisplayContentResponseStructureEClass, CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_DISPLAY_CONTENT_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE);

		customerInformationServiceGetCurrentStopIndexResponseStructureEClass = createEClass(CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_STOP_INDEX_RESPONSE_STRUCTURE);
		createEReference(customerInformationServiceGetCurrentStopIndexResponseStructureEClass, CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_STOP_INDEX_RESPONSE_STRUCTURE__CURRENT_STOP_INDEX_DATA);
		createEReference(customerInformationServiceGetCurrentStopIndexResponseStructureEClass, CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_STOP_INDEX_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE);

		customerInformationServiceGetCurrentStopPointResponseStructureEClass = createEClass(CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_STOP_POINT_RESPONSE_STRUCTURE);
		createEReference(customerInformationServiceGetCurrentStopPointResponseStructureEClass, CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_STOP_POINT_RESPONSE_STRUCTURE__CURRENT_STOP_POINT_DATA);
		createEReference(customerInformationServiceGetCurrentStopPointResponseStructureEClass, CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_STOP_POINT_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE);

		customerInformationServiceGetTripDataResponseStructureEClass = createEClass(CUSTOMER_INFORMATION_SERVICE_GET_TRIP_DATA_RESPONSE_STRUCTURE);
		createEReference(customerInformationServiceGetTripDataResponseStructureEClass, CUSTOMER_INFORMATION_SERVICE_GET_TRIP_DATA_RESPONSE_STRUCTURE__TRIP_DATA);
		createEReference(customerInformationServiceGetTripDataResponseStructureEClass, CUSTOMER_INFORMATION_SERVICE_GET_TRIP_DATA_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE);

		customerInformationServiceGetVehicleDataResponseStructureEClass = createEClass(CUSTOMER_INFORMATION_SERVICE_GET_VEHICLE_DATA_RESPONSE_STRUCTURE);
		createEReference(customerInformationServiceGetVehicleDataResponseStructureEClass, CUSTOMER_INFORMATION_SERVICE_GET_VEHICLE_DATA_RESPONSE_STRUCTURE__VEHICLE_DATA);
		createEReference(customerInformationServiceGetVehicleDataResponseStructureEClass, CUSTOMER_INFORMATION_SERVICE_GET_VEHICLE_DATA_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE);

		customerInformationServicePartialStopSequenceDataEClass = createEClass(CUSTOMER_INFORMATION_SERVICE_PARTIAL_STOP_SEQUENCE_DATA);
		createEReference(customerInformationServicePartialStopSequenceDataEClass, CUSTOMER_INFORMATION_SERVICE_PARTIAL_STOP_SEQUENCE_DATA__TIME_STAMP);
		createEReference(customerInformationServicePartialStopSequenceDataEClass, CUSTOMER_INFORMATION_SERVICE_PARTIAL_STOP_SEQUENCE_DATA__STOP_SEQUENCE);

		customerInformationServiceRetrievePartialStopSequenceRequestStructureEClass = createEClass(CUSTOMER_INFORMATION_SERVICE_RETRIEVE_PARTIAL_STOP_SEQUENCE_REQUEST_STRUCTURE);
		createEReference(customerInformationServiceRetrievePartialStopSequenceRequestStructureEClass, CUSTOMER_INFORMATION_SERVICE_RETRIEVE_PARTIAL_STOP_SEQUENCE_REQUEST_STRUCTURE__STARTING_STOP_INDEX);
		createEReference(customerInformationServiceRetrievePartialStopSequenceRequestStructureEClass, CUSTOMER_INFORMATION_SERVICE_RETRIEVE_PARTIAL_STOP_SEQUENCE_REQUEST_STRUCTURE__NUMBER_OF_STOP_POINTS);

		customerInformationServiceRetrievePartialStopSequenceResponseStructureEClass = createEClass(CUSTOMER_INFORMATION_SERVICE_RETRIEVE_PARTIAL_STOP_SEQUENCE_RESPONSE_STRUCTURE);
		createEReference(customerInformationServiceRetrievePartialStopSequenceResponseStructureEClass, CUSTOMER_INFORMATION_SERVICE_RETRIEVE_PARTIAL_STOP_SEQUENCE_RESPONSE_STRUCTURE__PARTIAL_STOP_SEQUENCE_DATA);
		createEReference(customerInformationServiceRetrievePartialStopSequenceResponseStructureEClass, CUSTOMER_INFORMATION_SERVICE_RETRIEVE_PARTIAL_STOP_SEQUENCE_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE);

		customerInformationServiceTripDataEClass = createEClass(CUSTOMER_INFORMATION_SERVICE_TRIP_DATA);
		createEReference(customerInformationServiceTripDataEClass, CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__TIME_STAMP);
		createEReference(customerInformationServiceTripDataEClass, CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__VEHICLE_REF);
		createEReference(customerInformationServiceTripDataEClass, CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__DEFAULT_LANGUAGE);
		createEReference(customerInformationServiceTripDataEClass, CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__TRIP_INFORMATION);
		createEReference(customerInformationServiceTripDataEClass, CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__CURRENT_STOP_INDEX);

		customerInformationServiceVehicleDataEClass = createEClass(CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA);
		createEReference(customerInformationServiceVehicleDataEClass, CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__TIME_STAMP);
		createEReference(customerInformationServiceVehicleDataEClass, CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__VEHICLE_REF);
		createEAttribute(customerInformationServiceVehicleDataEClass, CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__ROUTE_DEVIATION);
		createEAttribute(customerInformationServiceVehicleDataEClass, CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__DOOR_STATE);
		createEReference(customerInformationServiceVehicleDataEClass, CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__IN_PANIC);
		createEReference(customerInformationServiceVehicleDataEClass, CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__VEHICLE_STOP_REQUESTED);
		createEAttribute(customerInformationServiceVehicleDataEClass, CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__EXIT_SIDE);
		createEReference(customerInformationServiceVehicleDataEClass, CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__MOVING_DIRECTION_FORWARD);
		createEAttribute(customerInformationServiceVehicleDataEClass, CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__VEHICLE_MODE);
		createEReference(customerInformationServiceVehicleDataEClass, CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__MY_OWN_VEHICLE_MODE);
		createEReference(customerInformationServiceVehicleDataEClass, CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__SPEAKER_ACTIVE);
		createEReference(customerInformationServiceVehicleDataEClass, CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__STOP_INFORMATION_ACTIVE);
		createEAttribute(customerInformationServiceVehicleDataEClass, CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__TRIP_STATE);
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
		initEClass(customerInformationServiceAllDataEClass, CustomerInformationServiceAllData.class, "CustomerInformationServiceAllData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomerInformationServiceAllData_TimeStamp(), theIbisCommonPackage.getIBISIPDateTime(), null, "timeStamp", null, 1, 1, CustomerInformationServiceAllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerInformationServiceAllData_VehicleRef(), theIbisCommonPackage.getIBISIPNMTOKEN(), null, "vehicleRef", null, 1, 1, CustomerInformationServiceAllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerInformationServiceAllData_DefaultLanguage(), theIbisCommonPackage.getIBISIPLanguage(), null, "defaultLanguage", null, 1, 1, CustomerInformationServiceAllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerInformationServiceAllData_TripInformation(), theIbisCommonPackage.getTripInformationStructure(), null, "tripInformation", null, 0, 2, CustomerInformationServiceAllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerInformationServiceAllData_CurrentStopIndex(), theIbisCommonPackage.getIBISIPInt(), null, "currentStopIndex", null, 1, 1, CustomerInformationServiceAllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInformationServiceAllData_RouteDeviation(), theIbisEnumerationsPackage.getRouteDeviationEnumeration(), "routeDeviation", null, 1, 1, CustomerInformationServiceAllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInformationServiceAllData_DoorState(), theIbisEnumerationsPackage.getDoorOpenStateEnumeration(), "doorState", null, 0, 1, CustomerInformationServiceAllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerInformationServiceAllData_InPanic(), theIbisCommonPackage.getIBISIPBoolean(), null, "inPanic", null, 0, 1, CustomerInformationServiceAllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerInformationServiceAllData_VehicleStopRequested(), theIbisCommonPackage.getIBISIPBoolean(), null, "vehicleStopRequested", null, 0, 1, CustomerInformationServiceAllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInformationServiceAllData_ExitSide(), theIbisEnumerationsPackage.getExitSideEnumeration(), "exitSide", null, 0, 1, CustomerInformationServiceAllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerInformationServiceAllData_MovingDirectionForward(), theIbisCommonPackage.getIBISIPBoolean(), null, "movingDirectionForward", null, 0, 1, CustomerInformationServiceAllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInformationServiceAllData_VehicleMode(), theIbisEnumerationsPackage.getVehicleModeEnumeration(), "vehicleMode", null, 0, 1, CustomerInformationServiceAllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerInformationServiceAllData_MyOwnVehicleMode(), theIbisCommonPackage.getNetexMode(), null, "myOwnVehicleMode", null, 0, 1, CustomerInformationServiceAllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerInformationServiceAllData_SpeakerActive(), theIbisCommonPackage.getIBISIPBoolean(), null, "speakerActive", null, 0, 1, CustomerInformationServiceAllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerInformationServiceAllData_StopInformationActive(), theIbisCommonPackage.getIBISIPBoolean(), null, "stopInformationActive", null, 0, 1, CustomerInformationServiceAllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInformationServiceAllData_TripState(), theIbisEnumerationsPackage.getTripStateEnumeration(), "tripState", null, 0, 1, CustomerInformationServiceAllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerInformationServiceAllData_GlobalDisplayContent(), theIbisCommonPackage.getDisplayContentStructure(), null, "globalDisplayContent", null, 0, -1, CustomerInformationServiceAllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerInformationServiceCurrentAnnouncementDataEClass, CustomerInformationServiceCurrentAnnouncementData.class, "CustomerInformationServiceCurrentAnnouncementData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomerInformationServiceCurrentAnnouncementData_TimeStamp(), theIbisCommonPackage.getIBISIPDateTime(), null, "timeStamp", null, 1, 1, CustomerInformationServiceCurrentAnnouncementData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerInformationServiceCurrentAnnouncementData_CurrentAnnouncement(), theIbisCommonPackage.getAnnouncementStructure(), null, "currentAnnouncement", null, 1, 1, CustomerInformationServiceCurrentAnnouncementData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerInformationServiceCurrentConnectionInformationDataEClass, CustomerInformationServiceCurrentConnectionInformationData.class, "CustomerInformationServiceCurrentConnectionInformationData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomerInformationServiceCurrentConnectionInformationData_TimeStamp(), theIbisCommonPackage.getIBISIPDateTime(), null, "timeStamp", null, 1, 1, CustomerInformationServiceCurrentConnectionInformationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerInformationServiceCurrentConnectionInformationData_CurrentConnection(), theIbisCommonPackage.getConnectionStructure(), null, "currentConnection", null, 0, -1, CustomerInformationServiceCurrentConnectionInformationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerInformationServiceCurrentDisplayContentDataEClass, CustomerInformationServiceCurrentDisplayContentData.class, "CustomerInformationServiceCurrentDisplayContentData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomerInformationServiceCurrentDisplayContentData_TimeStamp(), theIbisCommonPackage.getIBISIPDateTime(), null, "timeStamp", null, 1, 1, CustomerInformationServiceCurrentDisplayContentData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerInformationServiceCurrentDisplayContentData_CurrentDisplayContent(), theIbisCommonPackage.getDisplayContentStructure(), null, "currentDisplayContent", null, 1, -1, CustomerInformationServiceCurrentDisplayContentData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerInformationServiceCurrentStopIndexDataEClass, CustomerInformationServiceCurrentStopIndexData.class, "CustomerInformationServiceCurrentStopIndexData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomerInformationServiceCurrentStopIndexData_TimeStamp(), theIbisCommonPackage.getIBISIPDateTime(), null, "timeStamp", null, 1, 1, CustomerInformationServiceCurrentStopIndexData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerInformationServiceCurrentStopIndexData_CurrentStopIndex(), theIbisCommonPackage.getIBISIPInt(), null, "currentStopIndex", null, 1, 1, CustomerInformationServiceCurrentStopIndexData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerInformationServiceCurrentStopPointDataEClass, CustomerInformationServiceCurrentStopPointData.class, "CustomerInformationServiceCurrentStopPointData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomerInformationServiceCurrentStopPointData_TimeStamp(), theIbisCommonPackage.getIBISIPDateTime(), null, "timeStamp", null, 1, 1, CustomerInformationServiceCurrentStopPointData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerInformationServiceCurrentStopPointData_CurrentStopPoint(), theIbisCommonPackage.getStopInformationStructure(), null, "currentStopPoint", null, 1, 1, CustomerInformationServiceCurrentStopPointData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerInformationServiceGetAllDataResponseStructureEClass, CustomerInformationServiceGetAllDataResponseStructure.class, "CustomerInformationServiceGetAllDataResponseStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomerInformationServiceGetAllDataResponseStructure_AllData(), this.getCustomerInformationServiceAllData(), null, "allData", null, 0, 1, CustomerInformationServiceGetAllDataResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerInformationServiceGetAllDataResponseStructure_OperationErrorMessage(), theIbisCommonPackage.getIBISIPString(), null, "operationErrorMessage", null, 0, 1, CustomerInformationServiceGetAllDataResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerInformationServiceGetCurrentAnnouncementResponseStructureEClass, CustomerInformationServiceGetCurrentAnnouncementResponseStructure.class, "CustomerInformationServiceGetCurrentAnnouncementResponseStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomerInformationServiceGetCurrentAnnouncementResponseStructure_CurrentAnnouncementData(), this.getCustomerInformationServiceCurrentAnnouncementData(), null, "currentAnnouncementData", null, 0, 1, CustomerInformationServiceGetCurrentAnnouncementResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerInformationServiceGetCurrentAnnouncementResponseStructure_OperationErrorMessage(), theIbisCommonPackage.getIBISIPString(), null, "operationErrorMessage", null, 0, 1, CustomerInformationServiceGetCurrentAnnouncementResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerInformationServiceGetCurrentConnectionInformationResponseStructureEClass, CustomerInformationServiceGetCurrentConnectionInformationResponseStructure.class, "CustomerInformationServiceGetCurrentConnectionInformationResponseStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomerInformationServiceGetCurrentConnectionInformationResponseStructure_CurrentConnectionData(), this.getCustomerInformationServiceCurrentConnectionInformationData(), null, "currentConnectionData", null, 0, 1, CustomerInformationServiceGetCurrentConnectionInformationResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerInformationServiceGetCurrentConnectionInformationResponseStructure_OperationErrorMessage(), theIbisCommonPackage.getIBISIPString(), null, "operationErrorMessage", null, 0, 1, CustomerInformationServiceGetCurrentConnectionInformationResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerInformationServiceGetCurrentDisplayContentResponseStructureEClass, CustomerInformationServiceGetCurrentDisplayContentResponseStructure.class, "CustomerInformationServiceGetCurrentDisplayContentResponseStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomerInformationServiceGetCurrentDisplayContentResponseStructure_CurrentDisplayContentData(), this.getCustomerInformationServiceCurrentDisplayContentData(), null, "currentDisplayContentData", null, 0, 1, CustomerInformationServiceGetCurrentDisplayContentResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerInformationServiceGetCurrentDisplayContentResponseStructure_OperationErrorMessage(), theIbisCommonPackage.getIBISIPString(), null, "operationErrorMessage", null, 0, 1, CustomerInformationServiceGetCurrentDisplayContentResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerInformationServiceGetCurrentStopIndexResponseStructureEClass, CustomerInformationServiceGetCurrentStopIndexResponseStructure.class, "CustomerInformationServiceGetCurrentStopIndexResponseStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomerInformationServiceGetCurrentStopIndexResponseStructure_CurrentStopIndexData(), this.getCustomerInformationServiceCurrentStopIndexData(), null, "currentStopIndexData", null, 0, 1, CustomerInformationServiceGetCurrentStopIndexResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerInformationServiceGetCurrentStopIndexResponseStructure_OperationErrorMessage(), theIbisCommonPackage.getIBISIPString(), null, "operationErrorMessage", null, 0, 1, CustomerInformationServiceGetCurrentStopIndexResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerInformationServiceGetCurrentStopPointResponseStructureEClass, CustomerInformationServiceGetCurrentStopPointResponseStructure.class, "CustomerInformationServiceGetCurrentStopPointResponseStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomerInformationServiceGetCurrentStopPointResponseStructure_CurrentStopPointData(), this.getCustomerInformationServiceCurrentStopPointData(), null, "currentStopPointData", null, 0, 1, CustomerInformationServiceGetCurrentStopPointResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerInformationServiceGetCurrentStopPointResponseStructure_OperationErrorMessage(), theIbisCommonPackage.getIBISIPString(), null, "operationErrorMessage", null, 0, 1, CustomerInformationServiceGetCurrentStopPointResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerInformationServiceGetTripDataResponseStructureEClass, CustomerInformationServiceGetTripDataResponseStructure.class, "CustomerInformationServiceGetTripDataResponseStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomerInformationServiceGetTripDataResponseStructure_TripData(), this.getCustomerInformationServiceTripData(), null, "tripData", null, 0, 1, CustomerInformationServiceGetTripDataResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerInformationServiceGetTripDataResponseStructure_OperationErrorMessage(), theIbisCommonPackage.getIBISIPString(), null, "operationErrorMessage", null, 0, 1, CustomerInformationServiceGetTripDataResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerInformationServiceGetVehicleDataResponseStructureEClass, CustomerInformationServiceGetVehicleDataResponseStructure.class, "CustomerInformationServiceGetVehicleDataResponseStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomerInformationServiceGetVehicleDataResponseStructure_VehicleData(), this.getCustomerInformationServiceVehicleData(), null, "vehicleData", null, 0, 1, CustomerInformationServiceGetVehicleDataResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerInformationServiceGetVehicleDataResponseStructure_OperationErrorMessage(), theIbisCommonPackage.getIBISIPString(), null, "operationErrorMessage", null, 0, 1, CustomerInformationServiceGetVehicleDataResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerInformationServicePartialStopSequenceDataEClass, CustomerInformationServicePartialStopSequenceData.class, "CustomerInformationServicePartialStopSequenceData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomerInformationServicePartialStopSequenceData_TimeStamp(), theIbisCommonPackage.getIBISIPDateTime(), null, "timeStamp", null, 1, 1, CustomerInformationServicePartialStopSequenceData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerInformationServicePartialStopSequenceData_StopSequence(), theIbisCommonPackage.getStopSequenceStructure(), null, "stopSequence", null, 1, 1, CustomerInformationServicePartialStopSequenceData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerInformationServiceRetrievePartialStopSequenceRequestStructureEClass, CustomerInformationServiceRetrievePartialStopSequenceRequestStructure.class, "CustomerInformationServiceRetrievePartialStopSequenceRequestStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomerInformationServiceRetrievePartialStopSequenceRequestStructure_StartingStopIndex(), theIbisCommonPackage.getIBISIPInt(), null, "startingStopIndex", null, 1, 1, CustomerInformationServiceRetrievePartialStopSequenceRequestStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerInformationServiceRetrievePartialStopSequenceRequestStructure_NumberOfStopPoints(), theIbisCommonPackage.getIBISIPInt(), null, "numberOfStopPoints", null, 1, 1, CustomerInformationServiceRetrievePartialStopSequenceRequestStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerInformationServiceRetrievePartialStopSequenceResponseStructureEClass, CustomerInformationServiceRetrievePartialStopSequenceResponseStructure.class, "CustomerInformationServiceRetrievePartialStopSequenceResponseStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomerInformationServiceRetrievePartialStopSequenceResponseStructure_PartialStopSequenceData(), this.getCustomerInformationServicePartialStopSequenceData(), null, "partialStopSequenceData", null, 0, 1, CustomerInformationServiceRetrievePartialStopSequenceResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerInformationServiceRetrievePartialStopSequenceResponseStructure_OperationErrorMessage(), theIbisCommonPackage.getIBISIPString(), null, "operationErrorMessage", null, 0, 1, CustomerInformationServiceRetrievePartialStopSequenceResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerInformationServiceTripDataEClass, CustomerInformationServiceTripData.class, "CustomerInformationServiceTripData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomerInformationServiceTripData_TimeStamp(), theIbisCommonPackage.getIBISIPDateTime(), null, "timeStamp", null, 1, 1, CustomerInformationServiceTripData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerInformationServiceTripData_VehicleRef(), theIbisCommonPackage.getIBISIPNMTOKEN(), null, "vehicleRef", null, 1, 1, CustomerInformationServiceTripData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerInformationServiceTripData_DefaultLanguage(), theIbisCommonPackage.getIBISIPLanguage(), null, "defaultLanguage", null, 1, 1, CustomerInformationServiceTripData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerInformationServiceTripData_TripInformation(), theIbisCommonPackage.getTripInformationStructure(), null, "tripInformation", null, 1, 1, CustomerInformationServiceTripData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerInformationServiceTripData_CurrentStopIndex(), theIbisCommonPackage.getIBISIPInt(), null, "currentStopIndex", null, 1, 1, CustomerInformationServiceTripData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerInformationServiceVehicleDataEClass, CustomerInformationServiceVehicleData.class, "CustomerInformationServiceVehicleData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomerInformationServiceVehicleData_TimeStamp(), theIbisCommonPackage.getIBISIPDateTime(), null, "timeStamp", null, 1, 1, CustomerInformationServiceVehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerInformationServiceVehicleData_VehicleRef(), theIbisCommonPackage.getIBISIPNMTOKEN(), null, "vehicleRef", null, 1, 1, CustomerInformationServiceVehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInformationServiceVehicleData_RouteDeviation(), theIbisEnumerationsPackage.getRouteDeviationEnumeration(), "routeDeviation", null, 1, 1, CustomerInformationServiceVehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInformationServiceVehicleData_DoorState(), theIbisEnumerationsPackage.getDoorOpenStateEnumeration(), "doorState", null, 0, 1, CustomerInformationServiceVehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerInformationServiceVehicleData_InPanic(), theIbisCommonPackage.getIBISIPBoolean(), null, "inPanic", null, 0, 1, CustomerInformationServiceVehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerInformationServiceVehicleData_VehicleStopRequested(), theIbisCommonPackage.getIBISIPBoolean(), null, "vehicleStopRequested", null, 0, 1, CustomerInformationServiceVehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInformationServiceVehicleData_ExitSide(), theIbisEnumerationsPackage.getExitSideEnumeration(), "exitSide", null, 0, 1, CustomerInformationServiceVehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerInformationServiceVehicleData_MovingDirectionForward(), theIbisCommonPackage.getIBISIPBoolean(), null, "movingDirectionForward", null, 0, 1, CustomerInformationServiceVehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInformationServiceVehicleData_VehicleMode(), theIbisEnumerationsPackage.getVehicleModeEnumeration(), "vehicleMode", null, 0, 1, CustomerInformationServiceVehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerInformationServiceVehicleData_MyOwnVehicleMode(), theIbisCommonPackage.getNetexMode(), null, "myOwnVehicleMode", null, 0, 1, CustomerInformationServiceVehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerInformationServiceVehicleData_SpeakerActive(), theIbisCommonPackage.getIBISIPBoolean(), null, "speakerActive", null, 0, 1, CustomerInformationServiceVehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerInformationServiceVehicleData_StopInformationActive(), theIbisCommonPackage.getIBISIPBoolean(), null, "stopInformationActive", null, 0, 1, CustomerInformationServiceVehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInformationServiceVehicleData_TripState(), theIbisEnumerationsPackage.getTripStateEnumeration(), "tripState", null, 0, 1, CustomerInformationServiceVehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (this,
		   source,
		   new String[] {
			   "qualified", "false"
		   });
		addAnnotation
		  (customerInformationServiceAllDataEClass,
		   source,
		   new String[] {
			   "name", "CustomerInformationService.AllData",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCustomerInformationServiceAllData_TimeStamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimeStamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServiceAllData_VehicleRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "VehicleRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServiceAllData_DefaultLanguage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DefaultLanguage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServiceAllData_TripInformation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TripInformation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServiceAllData_CurrentStopIndex(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CurrentStopIndex",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServiceAllData_RouteDeviation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RouteDeviation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServiceAllData_DoorState(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DoorState",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServiceAllData_InPanic(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "InPanic",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServiceAllData_VehicleStopRequested(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "VehicleStopRequested",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServiceAllData_ExitSide(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ExitSide",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServiceAllData_MovingDirectionForward(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MovingDirectionForward",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServiceAllData_VehicleMode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "VehicleMode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServiceAllData_MyOwnVehicleMode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MyOwnVehicleMode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServiceAllData_SpeakerActive(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SpeakerActive",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServiceAllData_StopInformationActive(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StopInformationActive",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServiceAllData_TripState(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TripState",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServiceAllData_GlobalDisplayContent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GlobalDisplayContent",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (customerInformationServiceCurrentAnnouncementDataEClass,
		   source,
		   new String[] {
			   "name", "CustomerInformationService.CurrentAnnouncementData",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCustomerInformationServiceCurrentAnnouncementData_TimeStamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimeStamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServiceCurrentAnnouncementData_CurrentAnnouncement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CurrentAnnouncement",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (customerInformationServiceCurrentConnectionInformationDataEClass,
		   source,
		   new String[] {
			   "name", "CustomerInformationService.CurrentConnectionInformationData",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCustomerInformationServiceCurrentConnectionInformationData_TimeStamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimeStamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServiceCurrentConnectionInformationData_CurrentConnection(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CurrentConnection",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (customerInformationServiceCurrentDisplayContentDataEClass,
		   source,
		   new String[] {
			   "name", "CustomerInformationService.CurrentDisplayContentData",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCustomerInformationServiceCurrentDisplayContentData_TimeStamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimeStamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServiceCurrentDisplayContentData_CurrentDisplayContent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CurrentDisplayContent",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (customerInformationServiceCurrentStopIndexDataEClass,
		   source,
		   new String[] {
			   "name", "CustomerInformationService.CurrentStopIndexData",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCustomerInformationServiceCurrentStopIndexData_TimeStamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimeStamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServiceCurrentStopIndexData_CurrentStopIndex(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CurrentStopIndex",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (customerInformationServiceCurrentStopPointDataEClass,
		   source,
		   new String[] {
			   "name", "CustomerInformationService.CurrentStopPointData",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCustomerInformationServiceCurrentStopPointData_TimeStamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimeStamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServiceCurrentStopPointData_CurrentStopPoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CurrentStopPoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (customerInformationServiceGetAllDataResponseStructureEClass,
		   source,
		   new String[] {
			   "name", "CustomerInformationService.GetAllDataResponseStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCustomerInformationServiceGetAllDataResponseStructure_AllData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AllData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServiceGetAllDataResponseStructure_OperationErrorMessage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OperationErrorMessage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (customerInformationServiceGetCurrentAnnouncementResponseStructureEClass,
		   source,
		   new String[] {
			   "name", "CustomerInformationService.GetCurrentAnnouncementResponseStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCustomerInformationServiceGetCurrentAnnouncementResponseStructure_CurrentAnnouncementData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CurrentAnnouncementData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServiceGetCurrentAnnouncementResponseStructure_OperationErrorMessage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OperationErrorMessage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (customerInformationServiceGetCurrentConnectionInformationResponseStructureEClass,
		   source,
		   new String[] {
			   "name", "CustomerInformationService.GetCurrentConnectionInformationResponseStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCustomerInformationServiceGetCurrentConnectionInformationResponseStructure_CurrentConnectionData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CurrentConnectionData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServiceGetCurrentConnectionInformationResponseStructure_OperationErrorMessage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OperationErrorMessage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (customerInformationServiceGetCurrentDisplayContentResponseStructureEClass,
		   source,
		   new String[] {
			   "name", "CustomerInformationService.GetCurrentDisplayContentResponseStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCustomerInformationServiceGetCurrentDisplayContentResponseStructure_CurrentDisplayContentData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CurrentDisplayContentData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServiceGetCurrentDisplayContentResponseStructure_OperationErrorMessage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OperationErrorMessage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (customerInformationServiceGetCurrentStopIndexResponseStructureEClass,
		   source,
		   new String[] {
			   "name", "CustomerInformationService.GetCurrentStopIndexResponseStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCustomerInformationServiceGetCurrentStopIndexResponseStructure_CurrentStopIndexData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CurrentStopIndexData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServiceGetCurrentStopIndexResponseStructure_OperationErrorMessage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OperationErrorMessage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (customerInformationServiceGetCurrentStopPointResponseStructureEClass,
		   source,
		   new String[] {
			   "name", "CustomerInformationService.GetCurrentStopPointResponseStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCustomerInformationServiceGetCurrentStopPointResponseStructure_CurrentStopPointData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CurrentStopPointData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServiceGetCurrentStopPointResponseStructure_OperationErrorMessage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OperationErrorMessage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (customerInformationServiceGetTripDataResponseStructureEClass,
		   source,
		   new String[] {
			   "name", "CustomerInformationService.GetTripDataResponseStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCustomerInformationServiceGetTripDataResponseStructure_TripData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TripData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServiceGetTripDataResponseStructure_OperationErrorMessage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OperationErrorMessage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (customerInformationServiceGetVehicleDataResponseStructureEClass,
		   source,
		   new String[] {
			   "name", "CustomerInformationService.GetVehicleDataResponseStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCustomerInformationServiceGetVehicleDataResponseStructure_VehicleData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "VehicleData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServiceGetVehicleDataResponseStructure_OperationErrorMessage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OperationErrorMessage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (customerInformationServicePartialStopSequenceDataEClass,
		   source,
		   new String[] {
			   "name", "CustomerInformationService.PartialStopSequenceData",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCustomerInformationServicePartialStopSequenceData_TimeStamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimeStamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServicePartialStopSequenceData_StopSequence(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StopSequence",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (customerInformationServiceRetrievePartialStopSequenceRequestStructureEClass,
		   source,
		   new String[] {
			   "name", "CustomerInformationService.RetrievePartialStopSequenceRequestStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCustomerInformationServiceRetrievePartialStopSequenceRequestStructure_StartingStopIndex(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StartingStopIndex",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServiceRetrievePartialStopSequenceRequestStructure_NumberOfStopPoints(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NumberOfStopPoints",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (customerInformationServiceRetrievePartialStopSequenceResponseStructureEClass,
		   source,
		   new String[] {
			   "name", "CustomerInformationService.RetrievePartialStopSequenceResponseStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCustomerInformationServiceRetrievePartialStopSequenceResponseStructure_PartialStopSequenceData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PartialStopSequenceData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServiceRetrievePartialStopSequenceResponseStructure_OperationErrorMessage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OperationErrorMessage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (customerInformationServiceTripDataEClass,
		   source,
		   new String[] {
			   "name", "CustomerInformationService.TripData",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCustomerInformationServiceTripData_TimeStamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimeStamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServiceTripData_VehicleRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "VehicleRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServiceTripData_DefaultLanguage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DefaultLanguage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServiceTripData_TripInformation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TripInformation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServiceTripData_CurrentStopIndex(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CurrentStopIndex",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (customerInformationServiceVehicleDataEClass,
		   source,
		   new String[] {
			   "name", "CustomerInformationService.VehicleData",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCustomerInformationServiceVehicleData_TimeStamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimeStamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServiceVehicleData_VehicleRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "VehicleRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServiceVehicleData_RouteDeviation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RouteDeviation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServiceVehicleData_DoorState(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DoorState",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServiceVehicleData_InPanic(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "InPanic",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServiceVehicleData_VehicleStopRequested(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "VehicleStopRequested",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServiceVehicleData_ExitSide(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ExitSide",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServiceVehicleData_MovingDirectionForward(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MovingDirectionForward",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServiceVehicleData_VehicleMode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "VehicleMode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServiceVehicleData_MyOwnVehicleMode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MyOwnVehicleMode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServiceVehicleData_SpeakerActive(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SpeakerActive",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServiceVehicleData_StopInformationActive(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StopInformationActive",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCustomerInformationServiceVehicleData_TripState(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TripState",
			   "namespace", "##targetNamespace"
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
		  (getCustomerInformationServiceAllData_TripInformation(),
		   source,
		   new String[] {
			   "documentation", "if vehicle is not on a trip and no tripinformation is available occurrence typically is 0\n\t\t\t\t\t\t\t\t\tif vehicle is on a trip or knows the next trip to run  occurrence typically is 1\n\t\t\t\t\t\t\t\t\tif vehicle is on a trip and also knows the subsequent trip that info can be provided in the second TripInformation so occurrence is 2"
		   });
		addAnnotation
		  (getCustomerInformationServiceAllData_CurrentStopIndex(),
		   source,
		   new String[] {
			   "documentation", "Index of the Stoppoint in the Stopsequence, which is the next Stop"
		   });
		addAnnotation
		  (getCustomerInformationServiceAllData_RouteDeviation(),
		   source,
		   new String[] {
			   "documentation", "Contains the information about route deviation"
		   });
		addAnnotation
		  (getCustomerInformationServiceAllData_DoorState(),
		   source,
		   new String[] {
			   "documentation", "Information on DoorState"
		   });
		addAnnotation
		  (getCustomerInformationServiceAllData_InPanic(),
		   source,
		   new String[] {
			   "documentation", "Is the Emergency-Button pressed?"
		   });
		addAnnotation
		  (getCustomerInformationServiceAllData_VehicleStopRequested(),
		   source,
		   new String[] {
			   "documentation", "Is the Stop-Button inside the vehicle pressed? "
		   });
		addAnnotation
		  (getCustomerInformationServiceAllData_ExitSide(),
		   source,
		   new String[] {
			   "documentation", "Defines the exit side     \t\t"
		   });
		addAnnotation
		  (getCustomerInformationServiceAllData_MovingDirectionForward(),
		   source,
		   new String[] {
			   "documentation", "Gives information, if the vehicle is moving forward, default value is \"true\""
		   });
		addAnnotation
		  (getCustomerInformationServiceAllData_VehicleMode(),
		   source,
		   new String[] {
			   "documentation", "DEPRECATED, is of type VehicleModeEnumeration. MyOwnVehicleMode SHOULD BE USED INSTEAD"
		   });
		addAnnotation
		  (getCustomerInformationServiceAllData_MyOwnVehicleMode(),
		   source,
		   new String[] {
			   "documentation", "Mode- and Submode information vehicle I am in - in accordance with Netex"
		   });
		addAnnotation
		  (getCustomerInformationServiceAllData_SpeakerActive(),
		   source,
		   new String[] {
			   "documentation", "Gives information, if the loud speaker is activated for a passenger announcement"
		   });
		addAnnotation
		  (getCustomerInformationServiceAllData_StopInformationActive(),
		   source,
		   new String[] {
			   "documentation", "Gives information, if the stopInformation inside the vehicle is in active or in passiv state (intentionally, e.g. due to \"route left)"
		   });
		addAnnotation
		  (getCustomerInformationServiceAllData_GlobalDisplayContent(),
		   source,
		   new String[] {
			   "documentation", "Global display content - this content should be used if no stop specific display content is available\n\t\t\t\t\tplease make sure that the global display content and the stop specific content are provided for the same DisplayContentRefs. "
		   });
		addAnnotation
		  (getCustomerInformationServiceTripData_CurrentStopIndex(),
		   source,
		   new String[] {
			   "documentation", "Index of the Stoppoint in the Stopsequence, which is the next Stop in the first trip"
		   });
		addAnnotation
		  (getCustomerInformationServiceVehicleData_RouteDeviation(),
		   source,
		   new String[] {
			   "documentation", "Contains the information about route deviation"
		   });
		addAnnotation
		  (getCustomerInformationServiceVehicleData_DoorState(),
		   source,
		   new String[] {
			   "documentation", "Information on DoorState"
		   });
		addAnnotation
		  (getCustomerInformationServiceVehicleData_InPanic(),
		   source,
		   new String[] {
			   "documentation", "Is the Emergency-Button pressed?"
		   });
		addAnnotation
		  (getCustomerInformationServiceVehicleData_VehicleStopRequested(),
		   source,
		   new String[] {
			   "documentation", "Is the Stop-Button inside the vehicle pressed? "
		   });
		addAnnotation
		  (getCustomerInformationServiceVehicleData_ExitSide(),
		   source,
		   new String[] {
			   "documentation", "Defines the exit side     \t\t"
		   });
		addAnnotation
		  (getCustomerInformationServiceVehicleData_MovingDirectionForward(),
		   source,
		   new String[] {
			   "documentation", "Gives information, if the vehicle is moving forward, default value is \"true\""
		   });
		addAnnotation
		  (getCustomerInformationServiceVehicleData_VehicleMode(),
		   source,
		   new String[] {
			   "documentation", "DEPRECATED, is of type VehicleModeEnumeration. MyOwnVehicleMode SHOULD BE USED INSTEAD"
		   });
		addAnnotation
		  (getCustomerInformationServiceVehicleData_MyOwnVehicleMode(),
		   source,
		   new String[] {
			   "documentation", "Mode- and Submode information vehicle I am in - in accordance with Netex"
		   });
		addAnnotation
		  (getCustomerInformationServiceVehicleData_SpeakerActive(),
		   source,
		   new String[] {
			   "documentation", "Gives information, if the loud speaker is activated for a passenger announcement"
		   });
		addAnnotation
		  (getCustomerInformationServiceVehicleData_StopInformationActive(),
		   source,
		   new String[] {
			   "documentation", "Gives information, if the stopInformation inside the vehicle is in active or in passiv state (intentionally, e.g. due to \"route left)"
		   });
	}

} //IbisCustomerInformationServicePackageImpl
