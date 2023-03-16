/**
 */
package de.jena.mdo.ibis.ibis_customerinformationservice.impl;

import de.jena.mdo.ibis.ibis_customerinformationservice.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IbisCustomerInformationServiceFactoryImpl extends EFactoryImpl implements IbisCustomerInformationServiceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IbisCustomerInformationServiceFactory init() {
		try {
			IbisCustomerInformationServiceFactory theIbisCustomerInformationServiceFactory = (IbisCustomerInformationServiceFactory)EPackage.Registry.INSTANCE.getEFactory(IbisCustomerInformationServicePackage.eNS_URI);
			if (theIbisCustomerInformationServiceFactory != null) {
				return theIbisCustomerInformationServiceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IbisCustomerInformationServiceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IbisCustomerInformationServiceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IbisCustomerInformationServicePackage.ALL_DATA: return createAllData();
			case IbisCustomerInformationServicePackage.CURRENT_ANNOUNCEMENT_DATA: return createCurrentAnnouncementData();
			case IbisCustomerInformationServicePackage.CURRENT_CONNECTION_INFORMATION_DATA: return createCurrentConnectionInformationData();
			case IbisCustomerInformationServicePackage.CURRENT_DISPLAY_CONTENT_DATA: return createCurrentDisplayContentData();
			case IbisCustomerInformationServicePackage.CURRENT_STOP_INDEX_DATA: return createCurrentStopIndexData();
			case IbisCustomerInformationServicePackage.CURRENT_STOP_POINT_DATA: return createCurrentStopPointData();
			case IbisCustomerInformationServicePackage.ALL_DATA_RESPONSE: return createAllDataResponse();
			case IbisCustomerInformationServicePackage.CURRENT_ANNOUNCEMENT_RESPONSE: return createCurrentAnnouncementResponse();
			case IbisCustomerInformationServicePackage.CURRENT_CONNECTION_INFORMATION_RESPONSE: return createCurrentConnectionInformationResponse();
			case IbisCustomerInformationServicePackage.CURRENT_DISPLAY_CONTENT_RESPONSE: return createCurrentDisplayContentResponse();
			case IbisCustomerInformationServicePackage.CURRENT_STOP_INDEX_RESPONSE: return createCurrentStopIndexResponse();
			case IbisCustomerInformationServicePackage.CURRENT_STOP_POINT_RESPONSE: return createCurrentStopPointResponse();
			case IbisCustomerInformationServicePackage.TRIP_DATA_RESPONSE: return createTripDataResponse();
			case IbisCustomerInformationServicePackage.VEHICLE_DATA_RESPONSE: return createVehicleDataResponse();
			case IbisCustomerInformationServicePackage.PARTIAL_STOP_SEQUENCE_DATA: return createPartialStopSequenceData();
			case IbisCustomerInformationServicePackage.PARTIAL_STOP_SEQUENCE_REQUEST: return createPartialStopSequenceRequest();
			case IbisCustomerInformationServicePackage.PARTIAL_STOP_SEQUENCE_RESPONSE: return createPartialStopSequenceResponse();
			case IbisCustomerInformationServicePackage.TRIP_DATA: return createTripData();
			case IbisCustomerInformationServicePackage.VEHICLE_DATA: return createVehicleData();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllData createAllData() {
		AllDataImpl allData = new AllDataImpl();
		return allData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurrentAnnouncementData createCurrentAnnouncementData() {
		CurrentAnnouncementDataImpl currentAnnouncementData = new CurrentAnnouncementDataImpl();
		return currentAnnouncementData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurrentConnectionInformationData createCurrentConnectionInformationData() {
		CurrentConnectionInformationDataImpl currentConnectionInformationData = new CurrentConnectionInformationDataImpl();
		return currentConnectionInformationData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurrentDisplayContentData createCurrentDisplayContentData() {
		CurrentDisplayContentDataImpl currentDisplayContentData = new CurrentDisplayContentDataImpl();
		return currentDisplayContentData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurrentStopIndexData createCurrentStopIndexData() {
		CurrentStopIndexDataImpl currentStopIndexData = new CurrentStopIndexDataImpl();
		return currentStopIndexData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurrentStopPointData createCurrentStopPointData() {
		CurrentStopPointDataImpl currentStopPointData = new CurrentStopPointDataImpl();
		return currentStopPointData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllDataResponse createAllDataResponse() {
		AllDataResponseImpl allDataResponse = new AllDataResponseImpl();
		return allDataResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurrentAnnouncementResponse createCurrentAnnouncementResponse() {
		CurrentAnnouncementResponseImpl currentAnnouncementResponse = new CurrentAnnouncementResponseImpl();
		return currentAnnouncementResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurrentConnectionInformationResponse createCurrentConnectionInformationResponse() {
		CurrentConnectionInformationResponseImpl currentConnectionInformationResponse = new CurrentConnectionInformationResponseImpl();
		return currentConnectionInformationResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurrentDisplayContentResponse createCurrentDisplayContentResponse() {
		CurrentDisplayContentResponseImpl currentDisplayContentResponse = new CurrentDisplayContentResponseImpl();
		return currentDisplayContentResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurrentStopIndexResponse createCurrentStopIndexResponse() {
		CurrentStopIndexResponseImpl currentStopIndexResponse = new CurrentStopIndexResponseImpl();
		return currentStopIndexResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurrentStopPointResponse createCurrentStopPointResponse() {
		CurrentStopPointResponseImpl currentStopPointResponse = new CurrentStopPointResponseImpl();
		return currentStopPointResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TripDataResponse createTripDataResponse() {
		TripDataResponseImpl tripDataResponse = new TripDataResponseImpl();
		return tripDataResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VehicleDataResponse createVehicleDataResponse() {
		VehicleDataResponseImpl vehicleDataResponse = new VehicleDataResponseImpl();
		return vehicleDataResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartialStopSequenceData createPartialStopSequenceData() {
		PartialStopSequenceDataImpl partialStopSequenceData = new PartialStopSequenceDataImpl();
		return partialStopSequenceData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartialStopSequenceRequest createPartialStopSequenceRequest() {
		PartialStopSequenceRequestImpl partialStopSequenceRequest = new PartialStopSequenceRequestImpl();
		return partialStopSequenceRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartialStopSequenceResponse createPartialStopSequenceResponse() {
		PartialStopSequenceResponseImpl partialStopSequenceResponse = new PartialStopSequenceResponseImpl();
		return partialStopSequenceResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TripData createTripData() {
		TripDataImpl tripData = new TripDataImpl();
		return tripData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VehicleData createVehicleData() {
		VehicleDataImpl vehicleData = new VehicleDataImpl();
		return vehicleData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IbisCustomerInformationServicePackage getIbisCustomerInformationServicePackage() {
		return (IbisCustomerInformationServicePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IbisCustomerInformationServicePackage getPackage() {
		return IbisCustomerInformationServicePackage.eINSTANCE;
	}

} //IbisCustomerInformationServiceFactoryImpl
