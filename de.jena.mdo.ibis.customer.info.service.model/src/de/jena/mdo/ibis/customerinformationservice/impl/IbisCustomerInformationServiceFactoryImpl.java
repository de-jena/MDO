/**
 */
package de.jena.mdo.ibis.customerinformationservice.impl;

import de.jena.mdo.ibis.customerinformationservice.*;

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
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_ALL_DATA: return createCustomerInformationServiceAllData();
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_CURRENT_ANNOUNCEMENT_DATA: return createCustomerInformationServiceCurrentAnnouncementData();
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_CURRENT_CONNECTION_INFORMATION_DATA: return createCustomerInformationServiceCurrentConnectionInformationData();
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_CURRENT_DISPLAY_CONTENT_DATA: return createCustomerInformationServiceCurrentDisplayContentData();
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_CURRENT_STOP_INDEX_DATA: return createCustomerInformationServiceCurrentStopIndexData();
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_CURRENT_STOP_POINT_DATA: return createCustomerInformationServiceCurrentStopPointData();
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_ALL_DATA_RESPONSE_STRUCTURE: return createCustomerInformationServiceGetAllDataResponseStructure();
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_ANNOUNCEMENT_RESPONSE_STRUCTURE: return createCustomerInformationServiceGetCurrentAnnouncementResponseStructure();
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_CONNECTION_INFORMATION_RESPONSE_STRUCTURE: return createCustomerInformationServiceGetCurrentConnectionInformationResponseStructure();
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_DISPLAY_CONTENT_RESPONSE_STRUCTURE: return createCustomerInformationServiceGetCurrentDisplayContentResponseStructure();
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_STOP_INDEX_RESPONSE_STRUCTURE: return createCustomerInformationServiceGetCurrentStopIndexResponseStructure();
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_STOP_POINT_RESPONSE_STRUCTURE: return createCustomerInformationServiceGetCurrentStopPointResponseStructure();
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_TRIP_DATA_RESPONSE_STRUCTURE: return createCustomerInformationServiceGetTripDataResponseStructure();
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_VEHICLE_DATA_RESPONSE_STRUCTURE: return createCustomerInformationServiceGetVehicleDataResponseStructure();
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_PARTIAL_STOP_SEQUENCE_DATA: return createCustomerInformationServicePartialStopSequenceData();
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_RETRIEVE_PARTIAL_STOP_SEQUENCE_REQUEST_STRUCTURE: return createCustomerInformationServiceRetrievePartialStopSequenceRequestStructure();
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_RETRIEVE_PARTIAL_STOP_SEQUENCE_RESPONSE_STRUCTURE: return createCustomerInformationServiceRetrievePartialStopSequenceResponseStructure();
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_TRIP_DATA: return createCustomerInformationServiceTripData();
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA: return createCustomerInformationServiceVehicleData();
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
	public CustomerInformationServiceAllData createCustomerInformationServiceAllData() {
		CustomerInformationServiceAllDataImpl customerInformationServiceAllData = new CustomerInformationServiceAllDataImpl();
		return customerInformationServiceAllData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInformationServiceCurrentAnnouncementData createCustomerInformationServiceCurrentAnnouncementData() {
		CustomerInformationServiceCurrentAnnouncementDataImpl customerInformationServiceCurrentAnnouncementData = new CustomerInformationServiceCurrentAnnouncementDataImpl();
		return customerInformationServiceCurrentAnnouncementData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInformationServiceCurrentConnectionInformationData createCustomerInformationServiceCurrentConnectionInformationData() {
		CustomerInformationServiceCurrentConnectionInformationDataImpl customerInformationServiceCurrentConnectionInformationData = new CustomerInformationServiceCurrentConnectionInformationDataImpl();
		return customerInformationServiceCurrentConnectionInformationData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInformationServiceCurrentDisplayContentData createCustomerInformationServiceCurrentDisplayContentData() {
		CustomerInformationServiceCurrentDisplayContentDataImpl customerInformationServiceCurrentDisplayContentData = new CustomerInformationServiceCurrentDisplayContentDataImpl();
		return customerInformationServiceCurrentDisplayContentData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInformationServiceCurrentStopIndexData createCustomerInformationServiceCurrentStopIndexData() {
		CustomerInformationServiceCurrentStopIndexDataImpl customerInformationServiceCurrentStopIndexData = new CustomerInformationServiceCurrentStopIndexDataImpl();
		return customerInformationServiceCurrentStopIndexData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInformationServiceCurrentStopPointData createCustomerInformationServiceCurrentStopPointData() {
		CustomerInformationServiceCurrentStopPointDataImpl customerInformationServiceCurrentStopPointData = new CustomerInformationServiceCurrentStopPointDataImpl();
		return customerInformationServiceCurrentStopPointData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInformationServiceGetAllDataResponseStructure createCustomerInformationServiceGetAllDataResponseStructure() {
		CustomerInformationServiceGetAllDataResponseStructureImpl customerInformationServiceGetAllDataResponseStructure = new CustomerInformationServiceGetAllDataResponseStructureImpl();
		return customerInformationServiceGetAllDataResponseStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInformationServiceGetCurrentAnnouncementResponseStructure createCustomerInformationServiceGetCurrentAnnouncementResponseStructure() {
		CustomerInformationServiceGetCurrentAnnouncementResponseStructureImpl customerInformationServiceGetCurrentAnnouncementResponseStructure = new CustomerInformationServiceGetCurrentAnnouncementResponseStructureImpl();
		return customerInformationServiceGetCurrentAnnouncementResponseStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInformationServiceGetCurrentConnectionInformationResponseStructure createCustomerInformationServiceGetCurrentConnectionInformationResponseStructure() {
		CustomerInformationServiceGetCurrentConnectionInformationResponseStructureImpl customerInformationServiceGetCurrentConnectionInformationResponseStructure = new CustomerInformationServiceGetCurrentConnectionInformationResponseStructureImpl();
		return customerInformationServiceGetCurrentConnectionInformationResponseStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInformationServiceGetCurrentDisplayContentResponseStructure createCustomerInformationServiceGetCurrentDisplayContentResponseStructure() {
		CustomerInformationServiceGetCurrentDisplayContentResponseStructureImpl customerInformationServiceGetCurrentDisplayContentResponseStructure = new CustomerInformationServiceGetCurrentDisplayContentResponseStructureImpl();
		return customerInformationServiceGetCurrentDisplayContentResponseStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInformationServiceGetCurrentStopIndexResponseStructure createCustomerInformationServiceGetCurrentStopIndexResponseStructure() {
		CustomerInformationServiceGetCurrentStopIndexResponseStructureImpl customerInformationServiceGetCurrentStopIndexResponseStructure = new CustomerInformationServiceGetCurrentStopIndexResponseStructureImpl();
		return customerInformationServiceGetCurrentStopIndexResponseStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInformationServiceGetCurrentStopPointResponseStructure createCustomerInformationServiceGetCurrentStopPointResponseStructure() {
		CustomerInformationServiceGetCurrentStopPointResponseStructureImpl customerInformationServiceGetCurrentStopPointResponseStructure = new CustomerInformationServiceGetCurrentStopPointResponseStructureImpl();
		return customerInformationServiceGetCurrentStopPointResponseStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInformationServiceGetTripDataResponseStructure createCustomerInformationServiceGetTripDataResponseStructure() {
		CustomerInformationServiceGetTripDataResponseStructureImpl customerInformationServiceGetTripDataResponseStructure = new CustomerInformationServiceGetTripDataResponseStructureImpl();
		return customerInformationServiceGetTripDataResponseStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInformationServiceGetVehicleDataResponseStructure createCustomerInformationServiceGetVehicleDataResponseStructure() {
		CustomerInformationServiceGetVehicleDataResponseStructureImpl customerInformationServiceGetVehicleDataResponseStructure = new CustomerInformationServiceGetVehicleDataResponseStructureImpl();
		return customerInformationServiceGetVehicleDataResponseStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInformationServicePartialStopSequenceData createCustomerInformationServicePartialStopSequenceData() {
		CustomerInformationServicePartialStopSequenceDataImpl customerInformationServicePartialStopSequenceData = new CustomerInformationServicePartialStopSequenceDataImpl();
		return customerInformationServicePartialStopSequenceData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInformationServiceRetrievePartialStopSequenceRequestStructure createCustomerInformationServiceRetrievePartialStopSequenceRequestStructure() {
		CustomerInformationServiceRetrievePartialStopSequenceRequestStructureImpl customerInformationServiceRetrievePartialStopSequenceRequestStructure = new CustomerInformationServiceRetrievePartialStopSequenceRequestStructureImpl();
		return customerInformationServiceRetrievePartialStopSequenceRequestStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInformationServiceRetrievePartialStopSequenceResponseStructure createCustomerInformationServiceRetrievePartialStopSequenceResponseStructure() {
		CustomerInformationServiceRetrievePartialStopSequenceResponseStructureImpl customerInformationServiceRetrievePartialStopSequenceResponseStructure = new CustomerInformationServiceRetrievePartialStopSequenceResponseStructureImpl();
		return customerInformationServiceRetrievePartialStopSequenceResponseStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInformationServiceTripData createCustomerInformationServiceTripData() {
		CustomerInformationServiceTripDataImpl customerInformationServiceTripData = new CustomerInformationServiceTripDataImpl();
		return customerInformationServiceTripData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInformationServiceVehicleData createCustomerInformationServiceVehicleData() {
		CustomerInformationServiceVehicleDataImpl customerInformationServiceVehicleData = new CustomerInformationServiceVehicleDataImpl();
		return customerInformationServiceVehicleData;
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