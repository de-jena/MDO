/**
 */
package de.jena.mdo.ibis.ibis_customerinformationservice.impl;

import de.jena.mdo.ibis.ibis_common.IbisCommonPackage;

import de.jena.mdo.ibis.ibis_customerinformationservice.AllData;
import de.jena.mdo.ibis.ibis_customerinformationservice.AllDataResponse;
import de.jena.mdo.ibis.ibis_customerinformationservice.CurrentAnnouncementData;
import de.jena.mdo.ibis.ibis_customerinformationservice.CurrentAnnouncementResponse;
import de.jena.mdo.ibis.ibis_customerinformationservice.CurrentConnectionInformationData;
import de.jena.mdo.ibis.ibis_customerinformationservice.CurrentConnectionInformationResponse;
import de.jena.mdo.ibis.ibis_customerinformationservice.CurrentDisplayContentData;
import de.jena.mdo.ibis.ibis_customerinformationservice.CurrentDisplayContentResponse;
import de.jena.mdo.ibis.ibis_customerinformationservice.CurrentStopIndexData;
import de.jena.mdo.ibis.ibis_customerinformationservice.CurrentStopIndexResponse;
import de.jena.mdo.ibis.ibis_customerinformationservice.CurrentStopPointData;
import de.jena.mdo.ibis.ibis_customerinformationservice.CurrentStopPointResponse;
import de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServiceFactory;
import de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage;
import de.jena.mdo.ibis.ibis_customerinformationservice.PartialStopSequenceData;
import de.jena.mdo.ibis.ibis_customerinformationservice.PartialStopSequenceRequest;
import de.jena.mdo.ibis.ibis_customerinformationservice.PartialStopSequenceResponse;
import de.jena.mdo.ibis.ibis_customerinformationservice.TripData;
import de.jena.mdo.ibis.ibis_customerinformationservice.TripDataResponse;
import de.jena.mdo.ibis.ibis_customerinformationservice.VehicleData;
import de.jena.mdo.ibis.ibis_customerinformationservice.VehicleDataResponse;

import de.jena.mdo.ibis.ibis_enumerations.IbisEnumerationsPackage;

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
	private EClass allDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currentAnnouncementDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currentConnectionInformationDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currentDisplayContentDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currentStopIndexDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currentStopPointDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allDataResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currentAnnouncementResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currentConnectionInformationResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currentDisplayContentResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currentStopIndexResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currentStopPointResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tripDataResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vehicleDataResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partialStopSequenceDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partialStopSequenceRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partialStopSequenceResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tripDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vehicleDataEClass = null;

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
	 * @see de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage#eNS_URI
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
	public EClass getAllData() {
		return allDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllData_TimeStamp() {
		return (EReference)allDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllData_VehicleRef() {
		return (EReference)allDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllData_DefaultLanguage() {
		return (EReference)allDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllData_TripInformation() {
		return (EReference)allDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllData_CurrentStopIndex() {
		return (EReference)allDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAllData_RouteDeviation() {
		return (EAttribute)allDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAllData_DoorState() {
		return (EAttribute)allDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllData_InPanic() {
		return (EReference)allDataEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllData_VehicleStopRequested() {
		return (EReference)allDataEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAllData_ExitSide() {
		return (EAttribute)allDataEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllData_MovingDirectionForward() {
		return (EReference)allDataEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAllData_VehicleMode() {
		return (EAttribute)allDataEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllData_MyOwnVehicleMode() {
		return (EReference)allDataEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllData_SpeakerActive() {
		return (EReference)allDataEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllData_StopInformationActive() {
		return (EReference)allDataEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAllData_TripState() {
		return (EAttribute)allDataEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllData_GlobalDisplayContent() {
		return (EReference)allDataEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCurrentAnnouncementData() {
		return currentAnnouncementDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCurrentAnnouncementData_TimeStamp() {
		return (EReference)currentAnnouncementDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCurrentAnnouncementData_CurrentAnnouncement() {
		return (EReference)currentAnnouncementDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCurrentConnectionInformationData() {
		return currentConnectionInformationDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCurrentConnectionInformationData_TimeStamp() {
		return (EReference)currentConnectionInformationDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCurrentConnectionInformationData_CurrentConnection() {
		return (EReference)currentConnectionInformationDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCurrentDisplayContentData() {
		return currentDisplayContentDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCurrentDisplayContentData_TimeStamp() {
		return (EReference)currentDisplayContentDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCurrentDisplayContentData_CurrentDisplayContent() {
		return (EReference)currentDisplayContentDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCurrentStopIndexData() {
		return currentStopIndexDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCurrentStopIndexData_TimeStamp() {
		return (EReference)currentStopIndexDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCurrentStopIndexData_CurrentStopIndex() {
		return (EReference)currentStopIndexDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCurrentStopPointData() {
		return currentStopPointDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCurrentStopPointData_TimeStamp() {
		return (EReference)currentStopPointDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCurrentStopPointData_CurrentStopPoint() {
		return (EReference)currentStopPointDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllDataResponse() {
		return allDataResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllDataResponse_AllData() {
		return (EReference)allDataResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCurrentAnnouncementResponse() {
		return currentAnnouncementResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCurrentAnnouncementResponse_CurrentAnnouncementData() {
		return (EReference)currentAnnouncementResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCurrentConnectionInformationResponse() {
		return currentConnectionInformationResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCurrentConnectionInformationResponse_CurrentConnectionData() {
		return (EReference)currentConnectionInformationResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCurrentDisplayContentResponse() {
		return currentDisplayContentResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCurrentDisplayContentResponse_CurrentDisplayContentData() {
		return (EReference)currentDisplayContentResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCurrentStopIndexResponse() {
		return currentStopIndexResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCurrentStopIndexResponse_CurrentStopIndexData() {
		return (EReference)currentStopIndexResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCurrentStopPointResponse() {
		return currentStopPointResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCurrentStopPointResponse_CurrentStopPointData() {
		return (EReference)currentStopPointResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTripDataResponse() {
		return tripDataResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripDataResponse_TripData() {
		return (EReference)tripDataResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVehicleDataResponse() {
		return vehicleDataResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVehicleDataResponse_VehicleData() {
		return (EReference)vehicleDataResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartialStopSequenceData() {
		return partialStopSequenceDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartialStopSequenceData_TimeStamp() {
		return (EReference)partialStopSequenceDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartialStopSequenceData_StopSequence() {
		return (EReference)partialStopSequenceDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartialStopSequenceRequest() {
		return partialStopSequenceRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartialStopSequenceRequest_StartingStopIndex() {
		return (EReference)partialStopSequenceRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartialStopSequenceRequest_NumberOfStopPoints() {
		return (EReference)partialStopSequenceRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartialStopSequenceResponse() {
		return partialStopSequenceResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartialStopSequenceResponse_PartialStopSequenceData() {
		return (EReference)partialStopSequenceResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTripData() {
		return tripDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripData_TimeStamp() {
		return (EReference)tripDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripData_VehicleRef() {
		return (EReference)tripDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripData_DefaultLanguage() {
		return (EReference)tripDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripData_TripInformation() {
		return (EReference)tripDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripData_CurrentStopIndex() {
		return (EReference)tripDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVehicleData() {
		return vehicleDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVehicleData_TimeStamp() {
		return (EReference)vehicleDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVehicleData_VehicleRef() {
		return (EReference)vehicleDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVehicleData_RouteDeviation() {
		return (EAttribute)vehicleDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVehicleData_DoorState() {
		return (EAttribute)vehicleDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVehicleData_InPanic() {
		return (EReference)vehicleDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVehicleData_VehicleStopRequested() {
		return (EReference)vehicleDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVehicleData_ExitSide() {
		return (EAttribute)vehicleDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVehicleData_MovingDirectionForward() {
		return (EReference)vehicleDataEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVehicleData_VehicleMode() {
		return (EAttribute)vehicleDataEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVehicleData_MyOwnVehicleMode() {
		return (EReference)vehicleDataEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVehicleData_SpeakerActive() {
		return (EReference)vehicleDataEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVehicleData_StopInformationActive() {
		return (EReference)vehicleDataEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVehicleData_TripState() {
		return (EAttribute)vehicleDataEClass.getEStructuralFeatures().get(12);
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
		allDataEClass = createEClass(ALL_DATA);
		createEReference(allDataEClass, ALL_DATA__TIME_STAMP);
		createEReference(allDataEClass, ALL_DATA__VEHICLE_REF);
		createEReference(allDataEClass, ALL_DATA__DEFAULT_LANGUAGE);
		createEReference(allDataEClass, ALL_DATA__TRIP_INFORMATION);
		createEReference(allDataEClass, ALL_DATA__CURRENT_STOP_INDEX);
		createEAttribute(allDataEClass, ALL_DATA__ROUTE_DEVIATION);
		createEAttribute(allDataEClass, ALL_DATA__DOOR_STATE);
		createEReference(allDataEClass, ALL_DATA__IN_PANIC);
		createEReference(allDataEClass, ALL_DATA__VEHICLE_STOP_REQUESTED);
		createEAttribute(allDataEClass, ALL_DATA__EXIT_SIDE);
		createEReference(allDataEClass, ALL_DATA__MOVING_DIRECTION_FORWARD);
		createEAttribute(allDataEClass, ALL_DATA__VEHICLE_MODE);
		createEReference(allDataEClass, ALL_DATA__MY_OWN_VEHICLE_MODE);
		createEReference(allDataEClass, ALL_DATA__SPEAKER_ACTIVE);
		createEReference(allDataEClass, ALL_DATA__STOP_INFORMATION_ACTIVE);
		createEAttribute(allDataEClass, ALL_DATA__TRIP_STATE);
		createEReference(allDataEClass, ALL_DATA__GLOBAL_DISPLAY_CONTENT);

		currentAnnouncementDataEClass = createEClass(CURRENT_ANNOUNCEMENT_DATA);
		createEReference(currentAnnouncementDataEClass, CURRENT_ANNOUNCEMENT_DATA__TIME_STAMP);
		createEReference(currentAnnouncementDataEClass, CURRENT_ANNOUNCEMENT_DATA__CURRENT_ANNOUNCEMENT);

		currentConnectionInformationDataEClass = createEClass(CURRENT_CONNECTION_INFORMATION_DATA);
		createEReference(currentConnectionInformationDataEClass, CURRENT_CONNECTION_INFORMATION_DATA__TIME_STAMP);
		createEReference(currentConnectionInformationDataEClass, CURRENT_CONNECTION_INFORMATION_DATA__CURRENT_CONNECTION);

		currentDisplayContentDataEClass = createEClass(CURRENT_DISPLAY_CONTENT_DATA);
		createEReference(currentDisplayContentDataEClass, CURRENT_DISPLAY_CONTENT_DATA__TIME_STAMP);
		createEReference(currentDisplayContentDataEClass, CURRENT_DISPLAY_CONTENT_DATA__CURRENT_DISPLAY_CONTENT);

		currentStopIndexDataEClass = createEClass(CURRENT_STOP_INDEX_DATA);
		createEReference(currentStopIndexDataEClass, CURRENT_STOP_INDEX_DATA__TIME_STAMP);
		createEReference(currentStopIndexDataEClass, CURRENT_STOP_INDEX_DATA__CURRENT_STOP_INDEX);

		currentStopPointDataEClass = createEClass(CURRENT_STOP_POINT_DATA);
		createEReference(currentStopPointDataEClass, CURRENT_STOP_POINT_DATA__TIME_STAMP);
		createEReference(currentStopPointDataEClass, CURRENT_STOP_POINT_DATA__CURRENT_STOP_POINT);

		allDataResponseEClass = createEClass(ALL_DATA_RESPONSE);
		createEReference(allDataResponseEClass, ALL_DATA_RESPONSE__ALL_DATA);

		currentAnnouncementResponseEClass = createEClass(CURRENT_ANNOUNCEMENT_RESPONSE);
		createEReference(currentAnnouncementResponseEClass, CURRENT_ANNOUNCEMENT_RESPONSE__CURRENT_ANNOUNCEMENT_DATA);

		currentConnectionInformationResponseEClass = createEClass(CURRENT_CONNECTION_INFORMATION_RESPONSE);
		createEReference(currentConnectionInformationResponseEClass, CURRENT_CONNECTION_INFORMATION_RESPONSE__CURRENT_CONNECTION_DATA);

		currentDisplayContentResponseEClass = createEClass(CURRENT_DISPLAY_CONTENT_RESPONSE);
		createEReference(currentDisplayContentResponseEClass, CURRENT_DISPLAY_CONTENT_RESPONSE__CURRENT_DISPLAY_CONTENT_DATA);

		currentStopIndexResponseEClass = createEClass(CURRENT_STOP_INDEX_RESPONSE);
		createEReference(currentStopIndexResponseEClass, CURRENT_STOP_INDEX_RESPONSE__CURRENT_STOP_INDEX_DATA);

		currentStopPointResponseEClass = createEClass(CURRENT_STOP_POINT_RESPONSE);
		createEReference(currentStopPointResponseEClass, CURRENT_STOP_POINT_RESPONSE__CURRENT_STOP_POINT_DATA);

		tripDataResponseEClass = createEClass(TRIP_DATA_RESPONSE);
		createEReference(tripDataResponseEClass, TRIP_DATA_RESPONSE__TRIP_DATA);

		vehicleDataResponseEClass = createEClass(VEHICLE_DATA_RESPONSE);
		createEReference(vehicleDataResponseEClass, VEHICLE_DATA_RESPONSE__VEHICLE_DATA);

		partialStopSequenceDataEClass = createEClass(PARTIAL_STOP_SEQUENCE_DATA);
		createEReference(partialStopSequenceDataEClass, PARTIAL_STOP_SEQUENCE_DATA__TIME_STAMP);
		createEReference(partialStopSequenceDataEClass, PARTIAL_STOP_SEQUENCE_DATA__STOP_SEQUENCE);

		partialStopSequenceRequestEClass = createEClass(PARTIAL_STOP_SEQUENCE_REQUEST);
		createEReference(partialStopSequenceRequestEClass, PARTIAL_STOP_SEQUENCE_REQUEST__STARTING_STOP_INDEX);
		createEReference(partialStopSequenceRequestEClass, PARTIAL_STOP_SEQUENCE_REQUEST__NUMBER_OF_STOP_POINTS);

		partialStopSequenceResponseEClass = createEClass(PARTIAL_STOP_SEQUENCE_RESPONSE);
		createEReference(partialStopSequenceResponseEClass, PARTIAL_STOP_SEQUENCE_RESPONSE__PARTIAL_STOP_SEQUENCE_DATA);

		tripDataEClass = createEClass(TRIP_DATA);
		createEReference(tripDataEClass, TRIP_DATA__TIME_STAMP);
		createEReference(tripDataEClass, TRIP_DATA__VEHICLE_REF);
		createEReference(tripDataEClass, TRIP_DATA__DEFAULT_LANGUAGE);
		createEReference(tripDataEClass, TRIP_DATA__TRIP_INFORMATION);
		createEReference(tripDataEClass, TRIP_DATA__CURRENT_STOP_INDEX);

		vehicleDataEClass = createEClass(VEHICLE_DATA);
		createEReference(vehicleDataEClass, VEHICLE_DATA__TIME_STAMP);
		createEReference(vehicleDataEClass, VEHICLE_DATA__VEHICLE_REF);
		createEAttribute(vehicleDataEClass, VEHICLE_DATA__ROUTE_DEVIATION);
		createEAttribute(vehicleDataEClass, VEHICLE_DATA__DOOR_STATE);
		createEReference(vehicleDataEClass, VEHICLE_DATA__IN_PANIC);
		createEReference(vehicleDataEClass, VEHICLE_DATA__VEHICLE_STOP_REQUESTED);
		createEAttribute(vehicleDataEClass, VEHICLE_DATA__EXIT_SIDE);
		createEReference(vehicleDataEClass, VEHICLE_DATA__MOVING_DIRECTION_FORWARD);
		createEAttribute(vehicleDataEClass, VEHICLE_DATA__VEHICLE_MODE);
		createEReference(vehicleDataEClass, VEHICLE_DATA__MY_OWN_VEHICLE_MODE);
		createEReference(vehicleDataEClass, VEHICLE_DATA__SPEAKER_ACTIVE);
		createEReference(vehicleDataEClass, VEHICLE_DATA__STOP_INFORMATION_ACTIVE);
		createEAttribute(vehicleDataEClass, VEHICLE_DATA__TRIP_STATE);
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
		allDataResponseEClass.getESuperTypes().add(theIbisCommonPackage.getGeneralResponse());
		currentAnnouncementResponseEClass.getESuperTypes().add(theIbisCommonPackage.getGeneralResponse());
		currentConnectionInformationResponseEClass.getESuperTypes().add(theIbisCommonPackage.getGeneralResponse());
		currentDisplayContentResponseEClass.getESuperTypes().add(theIbisCommonPackage.getGeneralResponse());
		currentStopIndexResponseEClass.getESuperTypes().add(theIbisCommonPackage.getGeneralResponse());
		currentStopPointResponseEClass.getESuperTypes().add(theIbisCommonPackage.getGeneralResponse());
		tripDataResponseEClass.getESuperTypes().add(theIbisCommonPackage.getGeneralResponse());
		vehicleDataResponseEClass.getESuperTypes().add(theIbisCommonPackage.getGeneralResponse());
		partialStopSequenceResponseEClass.getESuperTypes().add(theIbisCommonPackage.getGeneralResponse());

		// Initialize classes, features, and operations; add parameters
		initEClass(allDataEClass, AllData.class, "AllData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllData_TimeStamp(), theIbisCommonPackage.getIBISIPDateTime(), null, "timeStamp", null, 1, 1, AllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllData_VehicleRef(), theIbisCommonPackage.getIBISIPNMTOKEN(), null, "vehicleRef", null, 1, 1, AllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllData_DefaultLanguage(), theIbisCommonPackage.getIBISIPLanguage(), null, "defaultLanguage", null, 1, 1, AllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllData_TripInformation(), theIbisCommonPackage.getTripInformation(), null, "tripInformation", null, 0, 2, AllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllData_CurrentStopIndex(), theIbisCommonPackage.getIBISIPInt(), null, "currentStopIndex", null, 1, 1, AllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllData_RouteDeviation(), theIbisEnumerationsPackage.getRouteDeviationEnumeration(), "routeDeviation", null, 1, 1, AllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllData_DoorState(), theIbisEnumerationsPackage.getDoorOpenStateEnumeration(), "doorState", null, 0, 1, AllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllData_InPanic(), theIbisCommonPackage.getIBISIPBoolean(), null, "inPanic", null, 0, 1, AllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllData_VehicleStopRequested(), theIbisCommonPackage.getIBISIPBoolean(), null, "vehicleStopRequested", null, 0, 1, AllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllData_ExitSide(), theIbisEnumerationsPackage.getExitSideEnumeration(), "exitSide", null, 0, 1, AllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllData_MovingDirectionForward(), theIbisCommonPackage.getIBISIPBoolean(), null, "movingDirectionForward", null, 0, 1, AllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllData_VehicleMode(), theIbisEnumerationsPackage.getVehicleModeEnumeration(), "vehicleMode", null, 0, 1, AllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllData_MyOwnVehicleMode(), theIbisCommonPackage.getNetexMode(), null, "myOwnVehicleMode", null, 0, 1, AllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllData_SpeakerActive(), theIbisCommonPackage.getIBISIPBoolean(), null, "speakerActive", null, 0, 1, AllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllData_StopInformationActive(), theIbisCommonPackage.getIBISIPBoolean(), null, "stopInformationActive", null, 0, 1, AllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllData_TripState(), theIbisEnumerationsPackage.getTripStateEnumeration(), "tripState", null, 0, 1, AllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllData_GlobalDisplayContent(), theIbisCommonPackage.getDisplayContent(), null, "globalDisplayContent", null, 0, -1, AllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(currentAnnouncementDataEClass, CurrentAnnouncementData.class, "CurrentAnnouncementData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCurrentAnnouncementData_TimeStamp(), theIbisCommonPackage.getIBISIPDateTime(), null, "timeStamp", null, 1, 1, CurrentAnnouncementData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCurrentAnnouncementData_CurrentAnnouncement(), theIbisCommonPackage.getAnnouncement(), null, "currentAnnouncement", null, 1, 1, CurrentAnnouncementData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(currentConnectionInformationDataEClass, CurrentConnectionInformationData.class, "CurrentConnectionInformationData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCurrentConnectionInformationData_TimeStamp(), theIbisCommonPackage.getIBISIPDateTime(), null, "timeStamp", null, 1, 1, CurrentConnectionInformationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCurrentConnectionInformationData_CurrentConnection(), theIbisCommonPackage.getConnection(), null, "currentConnection", null, 0, -1, CurrentConnectionInformationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(currentDisplayContentDataEClass, CurrentDisplayContentData.class, "CurrentDisplayContentData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCurrentDisplayContentData_TimeStamp(), theIbisCommonPackage.getIBISIPDateTime(), null, "timeStamp", null, 1, 1, CurrentDisplayContentData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCurrentDisplayContentData_CurrentDisplayContent(), theIbisCommonPackage.getDisplayContent(), null, "currentDisplayContent", null, 1, -1, CurrentDisplayContentData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(currentStopIndexDataEClass, CurrentStopIndexData.class, "CurrentStopIndexData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCurrentStopIndexData_TimeStamp(), theIbisCommonPackage.getIBISIPDateTime(), null, "timeStamp", null, 1, 1, CurrentStopIndexData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCurrentStopIndexData_CurrentStopIndex(), theIbisCommonPackage.getIBISIPInt(), null, "currentStopIndex", null, 1, 1, CurrentStopIndexData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(currentStopPointDataEClass, CurrentStopPointData.class, "CurrentStopPointData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCurrentStopPointData_TimeStamp(), theIbisCommonPackage.getIBISIPDateTime(), null, "timeStamp", null, 1, 1, CurrentStopPointData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCurrentStopPointData_CurrentStopPoint(), theIbisCommonPackage.getStopInformation(), null, "currentStopPoint", null, 1, 1, CurrentStopPointData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allDataResponseEClass, AllDataResponse.class, "AllDataResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllDataResponse_AllData(), this.getAllData(), null, "allData", null, 0, 1, AllDataResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(currentAnnouncementResponseEClass, CurrentAnnouncementResponse.class, "CurrentAnnouncementResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCurrentAnnouncementResponse_CurrentAnnouncementData(), this.getCurrentAnnouncementData(), null, "currentAnnouncementData", null, 0, 1, CurrentAnnouncementResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(currentConnectionInformationResponseEClass, CurrentConnectionInformationResponse.class, "CurrentConnectionInformationResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCurrentConnectionInformationResponse_CurrentConnectionData(), this.getCurrentConnectionInformationData(), null, "currentConnectionData", null, 0, 1, CurrentConnectionInformationResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(currentDisplayContentResponseEClass, CurrentDisplayContentResponse.class, "CurrentDisplayContentResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCurrentDisplayContentResponse_CurrentDisplayContentData(), this.getCurrentDisplayContentData(), null, "currentDisplayContentData", null, 0, 1, CurrentDisplayContentResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(currentStopIndexResponseEClass, CurrentStopIndexResponse.class, "CurrentStopIndexResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCurrentStopIndexResponse_CurrentStopIndexData(), this.getCurrentStopIndexData(), null, "currentStopIndexData", null, 0, 1, CurrentStopIndexResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(currentStopPointResponseEClass, CurrentStopPointResponse.class, "CurrentStopPointResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCurrentStopPointResponse_CurrentStopPointData(), this.getCurrentStopPointData(), null, "currentStopPointData", null, 0, 1, CurrentStopPointResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tripDataResponseEClass, TripDataResponse.class, "TripDataResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTripDataResponse_TripData(), this.getTripData(), null, "tripData", null, 0, 1, TripDataResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vehicleDataResponseEClass, VehicleDataResponse.class, "VehicleDataResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVehicleDataResponse_VehicleData(), this.getVehicleData(), null, "vehicleData", null, 0, 1, VehicleDataResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partialStopSequenceDataEClass, PartialStopSequenceData.class, "PartialStopSequenceData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartialStopSequenceData_TimeStamp(), theIbisCommonPackage.getIBISIPDateTime(), null, "timeStamp", null, 1, 1, PartialStopSequenceData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartialStopSequenceData_StopSequence(), theIbisCommonPackage.getStopSequence(), null, "stopSequence", null, 1, 1, PartialStopSequenceData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partialStopSequenceRequestEClass, PartialStopSequenceRequest.class, "PartialStopSequenceRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartialStopSequenceRequest_StartingStopIndex(), theIbisCommonPackage.getIBISIPInt(), null, "startingStopIndex", null, 1, 1, PartialStopSequenceRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartialStopSequenceRequest_NumberOfStopPoints(), theIbisCommonPackage.getIBISIPInt(), null, "numberOfStopPoints", null, 1, 1, PartialStopSequenceRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partialStopSequenceResponseEClass, PartialStopSequenceResponse.class, "PartialStopSequenceResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartialStopSequenceResponse_PartialStopSequenceData(), this.getPartialStopSequenceData(), null, "partialStopSequenceData", null, 0, 1, PartialStopSequenceResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tripDataEClass, TripData.class, "TripData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTripData_TimeStamp(), theIbisCommonPackage.getIBISIPDateTime(), null, "timeStamp", null, 1, 1, TripData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripData_VehicleRef(), theIbisCommonPackage.getIBISIPNMTOKEN(), null, "vehicleRef", null, 1, 1, TripData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripData_DefaultLanguage(), theIbisCommonPackage.getIBISIPLanguage(), null, "defaultLanguage", null, 1, 1, TripData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripData_TripInformation(), theIbisCommonPackage.getTripInformation(), null, "tripInformation", null, 1, 1, TripData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripData_CurrentStopIndex(), theIbisCommonPackage.getIBISIPInt(), null, "currentStopIndex", null, 1, 1, TripData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vehicleDataEClass, VehicleData.class, "VehicleData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVehicleData_TimeStamp(), theIbisCommonPackage.getIBISIPDateTime(), null, "timeStamp", null, 1, 1, VehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVehicleData_VehicleRef(), theIbisCommonPackage.getIBISIPNMTOKEN(), null, "vehicleRef", null, 1, 1, VehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicleData_RouteDeviation(), theIbisEnumerationsPackage.getRouteDeviationEnumeration(), "routeDeviation", null, 1, 1, VehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicleData_DoorState(), theIbisEnumerationsPackage.getDoorOpenStateEnumeration(), "doorState", null, 0, 1, VehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVehicleData_InPanic(), theIbisCommonPackage.getIBISIPBoolean(), null, "inPanic", null, 0, 1, VehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVehicleData_VehicleStopRequested(), theIbisCommonPackage.getIBISIPBoolean(), null, "vehicleStopRequested", null, 0, 1, VehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicleData_ExitSide(), theIbisEnumerationsPackage.getExitSideEnumeration(), "exitSide", null, 0, 1, VehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVehicleData_MovingDirectionForward(), theIbisCommonPackage.getIBISIPBoolean(), null, "movingDirectionForward", null, 0, 1, VehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicleData_VehicleMode(), theIbisEnumerationsPackage.getVehicleModeEnumeration(), "vehicleMode", null, 0, 1, VehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVehicleData_MyOwnVehicleMode(), theIbisCommonPackage.getNetexMode(), null, "myOwnVehicleMode", null, 0, 1, VehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVehicleData_SpeakerActive(), theIbisCommonPackage.getIBISIPBoolean(), null, "speakerActive", null, 0, 1, VehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVehicleData_StopInformationActive(), theIbisCommonPackage.getIBISIPBoolean(), null, "stopInformationActive", null, 0, 1, VehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicleData_TripState(), theIbisEnumerationsPackage.getTripStateEnumeration(), "tripState", null, 0, 1, VehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (allDataEClass,
		   source,
		   new String[] {
			   "name", "CustomerInformationService.AllData",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAllData_TimeStamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimeStamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllData_VehicleRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "VehicleRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllData_DefaultLanguage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DefaultLanguage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllData_TripInformation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TripInformation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllData_CurrentStopIndex(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CurrentStopIndex",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllData_RouteDeviation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RouteDeviation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllData_DoorState(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DoorState",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllData_InPanic(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "InPanic",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllData_VehicleStopRequested(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "VehicleStopRequested",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllData_ExitSide(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ExitSide",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllData_MovingDirectionForward(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MovingDirectionForward",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllData_VehicleMode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "VehicleMode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllData_MyOwnVehicleMode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MyOwnVehicleMode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllData_SpeakerActive(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SpeakerActive",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllData_StopInformationActive(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StopInformationActive",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllData_TripState(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TripState",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllData_GlobalDisplayContent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GlobalDisplayContent",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (currentAnnouncementDataEClass,
		   source,
		   new String[] {
			   "name", "CustomerInformationService.CurrentAnnouncementData",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCurrentAnnouncementData_TimeStamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimeStamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCurrentAnnouncementData_CurrentAnnouncement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CurrentAnnouncement",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (currentConnectionInformationDataEClass,
		   source,
		   new String[] {
			   "name", "CustomerInformationService.CurrentConnectionInformationData",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCurrentConnectionInformationData_TimeStamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimeStamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCurrentConnectionInformationData_CurrentConnection(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CurrentConnection",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (currentDisplayContentDataEClass,
		   source,
		   new String[] {
			   "name", "CustomerInformationService.CurrentDisplayContentData",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCurrentDisplayContentData_TimeStamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimeStamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCurrentDisplayContentData_CurrentDisplayContent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CurrentDisplayContent",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (currentStopIndexDataEClass,
		   source,
		   new String[] {
			   "name", "CustomerInformationService.CurrentStopIndexData",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCurrentStopIndexData_TimeStamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimeStamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCurrentStopIndexData_CurrentStopIndex(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CurrentStopIndex",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (currentStopPointDataEClass,
		   source,
		   new String[] {
			   "name", "CustomerInformationService.CurrentStopPointData",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCurrentStopPointData_TimeStamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimeStamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCurrentStopPointData_CurrentStopPoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CurrentStopPoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (allDataResponseEClass,
		   source,
		   new String[] {
			   "name", "CustomerInformationService.GetAllDataResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAllDataResponse_AllData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AllData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (currentAnnouncementResponseEClass,
		   source,
		   new String[] {
			   "name", "CustomerInformationService.GetCurrentAnnouncementResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCurrentAnnouncementResponse_CurrentAnnouncementData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CurrentAnnouncementData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (currentConnectionInformationResponseEClass,
		   source,
		   new String[] {
			   "name", "CustomerInformationService.GetCurrentConnectionInformationResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCurrentConnectionInformationResponse_CurrentConnectionData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CurrentConnectionData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (currentDisplayContentResponseEClass,
		   source,
		   new String[] {
			   "name", "CustomerInformationService.GetCurrentDisplayContentResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCurrentDisplayContentResponse_CurrentDisplayContentData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CurrentDisplayContentData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (currentStopIndexResponseEClass,
		   source,
		   new String[] {
			   "name", "CustomerInformationService.GetCurrentStopIndexResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCurrentStopIndexResponse_CurrentStopIndexData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CurrentStopIndexData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (currentStopPointResponseEClass,
		   source,
		   new String[] {
			   "name", "CustomerInformationService.GetCurrentStopPointResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCurrentStopPointResponse_CurrentStopPointData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CurrentStopPointData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tripDataResponseEClass,
		   source,
		   new String[] {
			   "name", "CustomerInformationService.GetTripDataResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTripDataResponse_TripData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TripData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (vehicleDataResponseEClass,
		   source,
		   new String[] {
			   "name", "CustomerInformationService.GetVehicleDataResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getVehicleDataResponse_VehicleData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "VehicleData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (partialStopSequenceDataEClass,
		   source,
		   new String[] {
			   "name", "CustomerInformationService.PartialStopSequenceData",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPartialStopSequenceData_TimeStamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimeStamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPartialStopSequenceData_StopSequence(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StopSequence",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (partialStopSequenceRequestEClass,
		   source,
		   new String[] {
			   "name", "CustomerInformationService.RetrievePartialStopSequenceRequestStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPartialStopSequenceRequest_StartingStopIndex(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StartingStopIndex",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPartialStopSequenceRequest_NumberOfStopPoints(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NumberOfStopPoints",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (partialStopSequenceResponseEClass,
		   source,
		   new String[] {
			   "name", "CustomerInformationService.RetrievePartialStopSequenceResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPartialStopSequenceResponse_PartialStopSequenceData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PartialStopSequenceData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tripDataEClass,
		   source,
		   new String[] {
			   "name", "CustomerInformationService.TripData",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTripData_TimeStamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimeStamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripData_VehicleRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "VehicleRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripData_DefaultLanguage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DefaultLanguage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripData_TripInformation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TripInformation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripData_CurrentStopIndex(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CurrentStopIndex",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (vehicleDataEClass,
		   source,
		   new String[] {
			   "name", "CustomerInformationService.VehicleData",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getVehicleData_TimeStamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimeStamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVehicleData_VehicleRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "VehicleRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVehicleData_RouteDeviation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RouteDeviation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVehicleData_DoorState(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DoorState",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVehicleData_InPanic(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "InPanic",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVehicleData_VehicleStopRequested(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "VehicleStopRequested",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVehicleData_ExitSide(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ExitSide",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVehicleData_MovingDirectionForward(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MovingDirectionForward",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVehicleData_VehicleMode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "VehicleMode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVehicleData_MyOwnVehicleMode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MyOwnVehicleMode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVehicleData_SpeakerActive(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SpeakerActive",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVehicleData_StopInformationActive(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StopInformationActive",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVehicleData_TripState(),
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
		  (getAllData_TripInformation(),
		   source,
		   new String[] {
			   "documentation", "if vehicle is not on a trip and no tripinformation is available occurrence typically is 0\n\t\t\t\t\t\t\t\t\tif vehicle is on a trip or knows the next trip to run  occurrence typically is 1\n\t\t\t\t\t\t\t\t\tif vehicle is on a trip and also knows the subsequent trip that info can be provided in the second TripInformation so occurrence is 2"
		   });
		addAnnotation
		  (getAllData_CurrentStopIndex(),
		   source,
		   new String[] {
			   "documentation", "Index of the Stoppoint in the Stopsequence, which is the next Stop"
		   });
		addAnnotation
		  (getAllData_RouteDeviation(),
		   source,
		   new String[] {
			   "documentation", "Contains the information about route deviation"
		   });
		addAnnotation
		  (getAllData_DoorState(),
		   source,
		   new String[] {
			   "documentation", "Information on DoorState"
		   });
		addAnnotation
		  (getAllData_InPanic(),
		   source,
		   new String[] {
			   "documentation", "Is the Emergency-Button pressed?"
		   });
		addAnnotation
		  (getAllData_VehicleStopRequested(),
		   source,
		   new String[] {
			   "documentation", "Is the Stop-Button inside the vehicle pressed? "
		   });
		addAnnotation
		  (getAllData_ExitSide(),
		   source,
		   new String[] {
			   "documentation", "Defines the exit side     \t\t"
		   });
		addAnnotation
		  (getAllData_MovingDirectionForward(),
		   source,
		   new String[] {
			   "documentation", "Gives information, if the vehicle is moving forward, default value is \"true\""
		   });
		addAnnotation
		  (getAllData_VehicleMode(),
		   source,
		   new String[] {
			   "documentation", "DEPRECATED, is of type VehicleModeEnumeration. MyOwnVehicleMode SHOULD BE USED INSTEAD"
		   });
		addAnnotation
		  (getAllData_MyOwnVehicleMode(),
		   source,
		   new String[] {
			   "documentation", "Mode- and Submode information vehicle I am in - in accordance with Netex"
		   });
		addAnnotation
		  (getAllData_SpeakerActive(),
		   source,
		   new String[] {
			   "documentation", "Gives information, if the loud speaker is activated for a passenger announcement"
		   });
		addAnnotation
		  (getAllData_StopInformationActive(),
		   source,
		   new String[] {
			   "documentation", "Gives information, if the stopInformation inside the vehicle is in active or in passiv state (intentionally, e.g. due to \"route left)"
		   });
		addAnnotation
		  (getAllData_GlobalDisplayContent(),
		   source,
		   new String[] {
			   "documentation", "Global display content - this content should be used if no stop specific display content is available\n\t\t\t\t\tplease make sure that the global display content and the stop specific content are provided for the same DisplayContentRefs. "
		   });
		addAnnotation
		  (getTripData_CurrentStopIndex(),
		   source,
		   new String[] {
			   "documentation", "Index of the Stoppoint in the Stopsequence, which is the next Stop in the first trip"
		   });
		addAnnotation
		  (getVehicleData_RouteDeviation(),
		   source,
		   new String[] {
			   "documentation", "Contains the information about route deviation"
		   });
		addAnnotation
		  (getVehicleData_DoorState(),
		   source,
		   new String[] {
			   "documentation", "Information on DoorState"
		   });
		addAnnotation
		  (getVehicleData_InPanic(),
		   source,
		   new String[] {
			   "documentation", "Is the Emergency-Button pressed?"
		   });
		addAnnotation
		  (getVehicleData_VehicleStopRequested(),
		   source,
		   new String[] {
			   "documentation", "Is the Stop-Button inside the vehicle pressed? "
		   });
		addAnnotation
		  (getVehicleData_ExitSide(),
		   source,
		   new String[] {
			   "documentation", "Defines the exit side     \t\t"
		   });
		addAnnotation
		  (getVehicleData_MovingDirectionForward(),
		   source,
		   new String[] {
			   "documentation", "Gives information, if the vehicle is moving forward, default value is \"true\""
		   });
		addAnnotation
		  (getVehicleData_VehicleMode(),
		   source,
		   new String[] {
			   "documentation", "DEPRECATED, is of type VehicleModeEnumeration. MyOwnVehicleMode SHOULD BE USED INSTEAD"
		   });
		addAnnotation
		  (getVehicleData_MyOwnVehicleMode(),
		   source,
		   new String[] {
			   "documentation", "Mode- and Submode information vehicle I am in - in accordance with Netex"
		   });
		addAnnotation
		  (getVehicleData_SpeakerActive(),
		   source,
		   new String[] {
			   "documentation", "Gives information, if the loud speaker is activated for a passenger announcement"
		   });
		addAnnotation
		  (getVehicleData_StopInformationActive(),
		   source,
		   new String[] {
			   "documentation", "Gives information, if the stopInformation inside the vehicle is in active or in passiv state (intentionally, e.g. due to \"route left)"
		   });
	}

} //IbisCustomerInformationServicePackageImpl
