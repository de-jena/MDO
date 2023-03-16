/**
 */
package de.jena.mdo.ibis.ibis_enumerations.impl;

import de.jena.mdo.ibis.ibis_enumerations.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class IbisEnumerationsFactoryImpl extends EFactoryImpl implements IbisEnumerationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IbisEnumerationsFactory init() {
		try {
			IbisEnumerationsFactory theIbisEnumerationsFactory = (IbisEnumerationsFactory)EPackage.Registry.INSTANCE.getEFactory(IbisEnumerationsPackage.eNS_URI);
			if (theIbisEnumerationsFactory != null) {
				return theIbisEnumerationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IbisEnumerationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IbisEnumerationsFactoryImpl() {
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
			case IbisEnumerationsPackage.DOCUMENT_ROOT: return createDocumentRoot();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case IbisEnumerationsPackage.AIR_SUBMODE_ENUMERATION:
				return createAirSubmodeEnumerationFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.BUS_SUBMODE_ENUMERATION:
				return createBusSubmodeEnumerationFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.COACH_SUBMODE_ENUMERATION:
				return createCoachSubmodeEnumerationFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.CONNECTION_STATE_ENUMERATION:
				return createConnectionStateEnumerationFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.CONNECTION_TYPE_ENUMERATION:
				return createConnectionTypeEnumerationFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.DATA_INTERVAL_ENUMERATION:
				return createDataIntervalEnumerationFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.DEVICE_CLASS_ENUMERATION:
				return createDeviceClassEnumerationFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.DEVICE_STATE_ENUMERATION:
				return createDeviceStateEnumerationFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.DEVICE_TASK_ENUMERATION:
				return createDeviceTaskEnumerationFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.DOOR_COUNTING_OBJECT_CLASS_ENUMERATION:
				return createDoorCountingObjectClassEnumerationFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.DOOR_COUNTING_QUALITY_ENUMERATION:
				return createDoorCountingQualityEnumerationFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.DOOR_OPEN_STATE_ENUMERATION:
				return createDoorOpenStateEnumerationFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.DOOR_OPERATION_STATE_ENUMERATION:
				return createDoorOperationStateEnumerationFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.ERROR_CODE_ENUMERATION:
				return createErrorCodeEnumerationFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.EXIT_SIDE_ENUMERATION:
				return createExitSideEnumerationFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.FUNICULAR_SUBMODE_ENUMERATION:
				return createFunicularSubmodeEnumerationFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.GNSS_COORDINATE_SYSTEM_ENUMERATION:
				return createGNSSCoordinateSystemEnumerationFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.GNSS_QUALITY_ENUMERATION:
				return createGNSSQualityEnumerationFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.GNSS_TYPE_ENUMERATION:
				return createGNSSTypeEnumerationFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.JOURNEY_MODE_ENUMERATION:
				return createJourneyModeEnumerationFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.LOCATION_STATE_ENUMERATION:
				return createLocationStateEnumerationFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.MESSAGE_TYPE_ENUMERATION:
				return createMessageTypeEnumerationFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.METRO_SUBMODE_ENUMERATION:
				return createMetroSubmodeEnumerationFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.PRIVATE_SUB_MODES_ENUMERATION:
				return createPrivateSubModesEnumerationFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.PT_SUB_MODES_ENUMERATION:
				return createPtSubModesEnumerationFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.RAIL_SUBMODE_ENUMERATION:
				return createRailSubmodeEnumerationFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.ROUTE_DEVIATION_ENUMERATION:
				return createRouteDeviationEnumerationFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.ROUTE_DIRECTION_ENUMERATION:
				return createRouteDirectionEnumerationFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.SELF_DRIVE_SUBMODE_ENUMERATION:
				return createSelfDriveSubmodeEnumerationFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.SERVICE_NAME_ENUMERATION:
				return createServiceNameEnumerationFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.SERVICE_STATE_ENUMERATION:
				return createServiceStateEnumerationFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.SYSTEM_DOCUMENTATION_INFORMATION_ENUMERATION:
				return createSystemDocumentationInformationEnumerationFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.TAXI_SUBMODE_ENUMERATION:
				return createTaxiSubmodeEnumerationFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.TELECABIN_SUBMODE_ENUMERATION:
				return createTelecabinSubmodeEnumerationFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.TICKET_RAZZIA_INFORMATION_ENUMERATION:
				return createTicketRazziaInformationEnumerationFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.TICKET_VALIDATION_ENUMERATION:
				return createTicketValidationEnumerationFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.TRAM_SUBMODE_ENUMERATION:
				return createTramSubmodeEnumerationFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.TRIP_STATE_ENUMERATION:
				return createTripStateEnumerationFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.VEHICLE_MODE_ENUMERATION:
				return createVehicleModeEnumerationFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.WATER_SUBMODE_ENUMERATION:
				return createWaterSubmodeEnumerationFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.AIR_SUBMODE_ENUMERATION_OBJECT:
				return createAirSubmodeEnumerationObjectFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.BUS_SUBMODE_ENUMERATION_OBJECT:
				return createBusSubmodeEnumerationObjectFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.COACH_SUBMODE_ENUMERATION_OBJECT:
				return createCoachSubmodeEnumerationObjectFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.CONNECTION_STATE_ENUMERATION_OBJECT:
				return createConnectionStateEnumerationObjectFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.CONNECTION_TYPE_ENUMERATION_OBJECT:
				return createConnectionTypeEnumerationObjectFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.DATA_INTERVAL_ENUMERATION_OBJECT:
				return createDataIntervalEnumerationObjectFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.DEVICE_CLASS_ENUMERATION_OBJECT:
				return createDeviceClassEnumerationObjectFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.DEVICE_STATE_ENUMERATION_OBJECT:
				return createDeviceStateEnumerationObjectFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.DEVICE_TASK_ENUMERATION_OBJECT:
				return createDeviceTaskEnumerationObjectFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.DOOR_COUNTING_OBJECT_CLASS_ENUMERATION_OBJECT:
				return createDoorCountingObjectClassEnumerationObjectFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.DOOR_COUNTING_QUALITY_ENUMERATION_OBJECT:
				return createDoorCountingQualityEnumerationObjectFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.DOOR_OPEN_STATE_ENUMERATION_OBJECT:
				return createDoorOpenStateEnumerationObjectFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.DOOR_OPERATION_STATE_ENUMERATION_OBJECT:
				return createDoorOperationStateEnumerationObjectFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.ERROR_CODE_ENUMERATION_OBJECT:
				return createErrorCodeEnumerationObjectFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.EXIT_SIDE_ENUMERATION_OBJECT:
				return createExitSideEnumerationObjectFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.FUNICULAR_SUBMODE_ENUMERATION_OBJECT:
				return createFunicularSubmodeEnumerationObjectFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.GNSS_COORDINATE_SYSTEM_ENUMERATION_OBJECT:
				return createGNSSCoordinateSystemEnumerationObjectFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.GNSS_QUALITY_ENUMERATION_OBJECT:
				return createGNSSQualityEnumerationObjectFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.GNSS_TYPE_ENUMERATION_OBJECT:
				return createGNSSTypeEnumerationObjectFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.JOURNEY_MODE_ENUMERATION_OBJECT:
				return createJourneyModeEnumerationObjectFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.LOCATION_STATE_ENUMERATION_OBJECT:
				return createLocationStateEnumerationObjectFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.MESSAGE_TYPE_ENUMERATION_OBJECT:
				return createMessageTypeEnumerationObjectFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.METRO_SUBMODE_ENUMERATION_OBJECT:
				return createMetroSubmodeEnumerationObjectFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.PRIVATE_SUB_MODES_ENUMERATION_OBJECT:
				return createPrivateSubModesEnumerationObjectFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.PT_SUB_MODES_ENUMERATION_OBJECT:
				return createPtSubModesEnumerationObjectFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.RAIL_SUBMODE_ENUMERATION_OBJECT:
				return createRailSubmodeEnumerationObjectFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.ROUTE_DEVIATION_ENUMERATION_OBJECT:
				return createRouteDeviationEnumerationObjectFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.ROUTE_DIRECTION_ENUMERATION_OBJECT:
				return createRouteDirectionEnumerationObjectFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.SELF_DRIVE_SUBMODE_ENUMERATION_OBJECT:
				return createSelfDriveSubmodeEnumerationObjectFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.SERVICE_NAME_ENUMERATION_OBJECT:
				return createServiceNameEnumerationObjectFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.SERVICE_STATE_ENUMERATION_OBJECT:
				return createServiceStateEnumerationObjectFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.SYSTEM_DOCUMENTATION_INFORMATION_ENUMERATION_OBJECT:
				return createSystemDocumentationInformationEnumerationObjectFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.TAXI_SUBMODE_ENUMERATION_OBJECT:
				return createTaxiSubmodeEnumerationObjectFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.TELECABIN_SUBMODE_ENUMERATION_OBJECT:
				return createTelecabinSubmodeEnumerationObjectFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.TICKET_RAZZIA_INFORMATION_ENUMERATION_OBJECT:
				return createTicketRazziaInformationEnumerationObjectFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.TICKET_VALIDATION_ENUMERATION_OBJECT:
				return createTicketValidationEnumerationObjectFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.TRAM_SUBMODE_ENUMERATION_OBJECT:
				return createTramSubmodeEnumerationObjectFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.TRIP_STATE_ENUMERATION_OBJECT:
				return createTripStateEnumerationObjectFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.VEHICLE_MODE_ENUMERATION_OBJECT:
				return createVehicleModeEnumerationObjectFromString(eDataType, initialValue);
			case IbisEnumerationsPackage.WATER_SUBMODE_ENUMERATION_OBJECT:
				return createWaterSubmodeEnumerationObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case IbisEnumerationsPackage.AIR_SUBMODE_ENUMERATION:
				return convertAirSubmodeEnumerationToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.BUS_SUBMODE_ENUMERATION:
				return convertBusSubmodeEnumerationToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.COACH_SUBMODE_ENUMERATION:
				return convertCoachSubmodeEnumerationToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.CONNECTION_STATE_ENUMERATION:
				return convertConnectionStateEnumerationToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.CONNECTION_TYPE_ENUMERATION:
				return convertConnectionTypeEnumerationToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.DATA_INTERVAL_ENUMERATION:
				return convertDataIntervalEnumerationToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.DEVICE_CLASS_ENUMERATION:
				return convertDeviceClassEnumerationToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.DEVICE_STATE_ENUMERATION:
				return convertDeviceStateEnumerationToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.DEVICE_TASK_ENUMERATION:
				return convertDeviceTaskEnumerationToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.DOOR_COUNTING_OBJECT_CLASS_ENUMERATION:
				return convertDoorCountingObjectClassEnumerationToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.DOOR_COUNTING_QUALITY_ENUMERATION:
				return convertDoorCountingQualityEnumerationToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.DOOR_OPEN_STATE_ENUMERATION:
				return convertDoorOpenStateEnumerationToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.DOOR_OPERATION_STATE_ENUMERATION:
				return convertDoorOperationStateEnumerationToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.ERROR_CODE_ENUMERATION:
				return convertErrorCodeEnumerationToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.EXIT_SIDE_ENUMERATION:
				return convertExitSideEnumerationToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.FUNICULAR_SUBMODE_ENUMERATION:
				return convertFunicularSubmodeEnumerationToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.GNSS_COORDINATE_SYSTEM_ENUMERATION:
				return convertGNSSCoordinateSystemEnumerationToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.GNSS_QUALITY_ENUMERATION:
				return convertGNSSQualityEnumerationToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.GNSS_TYPE_ENUMERATION:
				return convertGNSSTypeEnumerationToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.JOURNEY_MODE_ENUMERATION:
				return convertJourneyModeEnumerationToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.LOCATION_STATE_ENUMERATION:
				return convertLocationStateEnumerationToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.MESSAGE_TYPE_ENUMERATION:
				return convertMessageTypeEnumerationToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.METRO_SUBMODE_ENUMERATION:
				return convertMetroSubmodeEnumerationToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.PRIVATE_SUB_MODES_ENUMERATION:
				return convertPrivateSubModesEnumerationToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.PT_SUB_MODES_ENUMERATION:
				return convertPtSubModesEnumerationToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.RAIL_SUBMODE_ENUMERATION:
				return convertRailSubmodeEnumerationToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.ROUTE_DEVIATION_ENUMERATION:
				return convertRouteDeviationEnumerationToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.ROUTE_DIRECTION_ENUMERATION:
				return convertRouteDirectionEnumerationToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.SELF_DRIVE_SUBMODE_ENUMERATION:
				return convertSelfDriveSubmodeEnumerationToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.SERVICE_NAME_ENUMERATION:
				return convertServiceNameEnumerationToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.SERVICE_STATE_ENUMERATION:
				return convertServiceStateEnumerationToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.SYSTEM_DOCUMENTATION_INFORMATION_ENUMERATION:
				return convertSystemDocumentationInformationEnumerationToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.TAXI_SUBMODE_ENUMERATION:
				return convertTaxiSubmodeEnumerationToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.TELECABIN_SUBMODE_ENUMERATION:
				return convertTelecabinSubmodeEnumerationToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.TICKET_RAZZIA_INFORMATION_ENUMERATION:
				return convertTicketRazziaInformationEnumerationToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.TICKET_VALIDATION_ENUMERATION:
				return convertTicketValidationEnumerationToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.TRAM_SUBMODE_ENUMERATION:
				return convertTramSubmodeEnumerationToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.TRIP_STATE_ENUMERATION:
				return convertTripStateEnumerationToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.VEHICLE_MODE_ENUMERATION:
				return convertVehicleModeEnumerationToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.WATER_SUBMODE_ENUMERATION:
				return convertWaterSubmodeEnumerationToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.AIR_SUBMODE_ENUMERATION_OBJECT:
				return convertAirSubmodeEnumerationObjectToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.BUS_SUBMODE_ENUMERATION_OBJECT:
				return convertBusSubmodeEnumerationObjectToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.COACH_SUBMODE_ENUMERATION_OBJECT:
				return convertCoachSubmodeEnumerationObjectToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.CONNECTION_STATE_ENUMERATION_OBJECT:
				return convertConnectionStateEnumerationObjectToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.CONNECTION_TYPE_ENUMERATION_OBJECT:
				return convertConnectionTypeEnumerationObjectToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.DATA_INTERVAL_ENUMERATION_OBJECT:
				return convertDataIntervalEnumerationObjectToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.DEVICE_CLASS_ENUMERATION_OBJECT:
				return convertDeviceClassEnumerationObjectToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.DEVICE_STATE_ENUMERATION_OBJECT:
				return convertDeviceStateEnumerationObjectToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.DEVICE_TASK_ENUMERATION_OBJECT:
				return convertDeviceTaskEnumerationObjectToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.DOOR_COUNTING_OBJECT_CLASS_ENUMERATION_OBJECT:
				return convertDoorCountingObjectClassEnumerationObjectToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.DOOR_COUNTING_QUALITY_ENUMERATION_OBJECT:
				return convertDoorCountingQualityEnumerationObjectToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.DOOR_OPEN_STATE_ENUMERATION_OBJECT:
				return convertDoorOpenStateEnumerationObjectToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.DOOR_OPERATION_STATE_ENUMERATION_OBJECT:
				return convertDoorOperationStateEnumerationObjectToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.ERROR_CODE_ENUMERATION_OBJECT:
				return convertErrorCodeEnumerationObjectToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.EXIT_SIDE_ENUMERATION_OBJECT:
				return convertExitSideEnumerationObjectToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.FUNICULAR_SUBMODE_ENUMERATION_OBJECT:
				return convertFunicularSubmodeEnumerationObjectToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.GNSS_COORDINATE_SYSTEM_ENUMERATION_OBJECT:
				return convertGNSSCoordinateSystemEnumerationObjectToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.GNSS_QUALITY_ENUMERATION_OBJECT:
				return convertGNSSQualityEnumerationObjectToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.GNSS_TYPE_ENUMERATION_OBJECT:
				return convertGNSSTypeEnumerationObjectToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.JOURNEY_MODE_ENUMERATION_OBJECT:
				return convertJourneyModeEnumerationObjectToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.LOCATION_STATE_ENUMERATION_OBJECT:
				return convertLocationStateEnumerationObjectToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.MESSAGE_TYPE_ENUMERATION_OBJECT:
				return convertMessageTypeEnumerationObjectToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.METRO_SUBMODE_ENUMERATION_OBJECT:
				return convertMetroSubmodeEnumerationObjectToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.PRIVATE_SUB_MODES_ENUMERATION_OBJECT:
				return convertPrivateSubModesEnumerationObjectToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.PT_SUB_MODES_ENUMERATION_OBJECT:
				return convertPtSubModesEnumerationObjectToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.RAIL_SUBMODE_ENUMERATION_OBJECT:
				return convertRailSubmodeEnumerationObjectToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.ROUTE_DEVIATION_ENUMERATION_OBJECT:
				return convertRouteDeviationEnumerationObjectToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.ROUTE_DIRECTION_ENUMERATION_OBJECT:
				return convertRouteDirectionEnumerationObjectToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.SELF_DRIVE_SUBMODE_ENUMERATION_OBJECT:
				return convertSelfDriveSubmodeEnumerationObjectToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.SERVICE_NAME_ENUMERATION_OBJECT:
				return convertServiceNameEnumerationObjectToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.SERVICE_STATE_ENUMERATION_OBJECT:
				return convertServiceStateEnumerationObjectToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.SYSTEM_DOCUMENTATION_INFORMATION_ENUMERATION_OBJECT:
				return convertSystemDocumentationInformationEnumerationObjectToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.TAXI_SUBMODE_ENUMERATION_OBJECT:
				return convertTaxiSubmodeEnumerationObjectToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.TELECABIN_SUBMODE_ENUMERATION_OBJECT:
				return convertTelecabinSubmodeEnumerationObjectToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.TICKET_RAZZIA_INFORMATION_ENUMERATION_OBJECT:
				return convertTicketRazziaInformationEnumerationObjectToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.TICKET_VALIDATION_ENUMERATION_OBJECT:
				return convertTicketValidationEnumerationObjectToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.TRAM_SUBMODE_ENUMERATION_OBJECT:
				return convertTramSubmodeEnumerationObjectToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.TRIP_STATE_ENUMERATION_OBJECT:
				return convertTripStateEnumerationObjectToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.VEHICLE_MODE_ENUMERATION_OBJECT:
				return convertVehicleModeEnumerationObjectToString(eDataType, instanceValue);
			case IbisEnumerationsPackage.WATER_SUBMODE_ENUMERATION_OBJECT:
				return convertWaterSubmodeEnumerationObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AirSubmodeEnumeration createAirSubmodeEnumerationFromString(EDataType eDataType, String initialValue) {
		AirSubmodeEnumeration result = AirSubmodeEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAirSubmodeEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusSubmodeEnumeration createBusSubmodeEnumerationFromString(EDataType eDataType, String initialValue) {
		BusSubmodeEnumeration result = BusSubmodeEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBusSubmodeEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoachSubmodeEnumeration createCoachSubmodeEnumerationFromString(EDataType eDataType, String initialValue) {
		CoachSubmodeEnumeration result = CoachSubmodeEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCoachSubmodeEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionStateEnumeration createConnectionStateEnumerationFromString(EDataType eDataType, String initialValue) {
		ConnectionStateEnumeration result = ConnectionStateEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConnectionStateEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionTypeEnumeration createConnectionTypeEnumerationFromString(EDataType eDataType, String initialValue) {
		ConnectionTypeEnumeration result = ConnectionTypeEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConnectionTypeEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataIntervalEnumeration createDataIntervalEnumerationFromString(EDataType eDataType, String initialValue) {
		DataIntervalEnumeration result = DataIntervalEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataIntervalEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceClassEnumeration createDeviceClassEnumerationFromString(EDataType eDataType, String initialValue) {
		DeviceClassEnumeration result = DeviceClassEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceClassEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceStateEnumeration createDeviceStateEnumerationFromString(EDataType eDataType, String initialValue) {
		DeviceStateEnumeration result = DeviceStateEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceStateEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceTaskEnumeration createDeviceTaskEnumerationFromString(EDataType eDataType, String initialValue) {
		DeviceTaskEnumeration result = DeviceTaskEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceTaskEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoorCountingObjectClassEnumeration createDoorCountingObjectClassEnumerationFromString(EDataType eDataType, String initialValue) {
		DoorCountingObjectClassEnumeration result = DoorCountingObjectClassEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDoorCountingObjectClassEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoorCountingQualityEnumeration createDoorCountingQualityEnumerationFromString(EDataType eDataType, String initialValue) {
		DoorCountingQualityEnumeration result = DoorCountingQualityEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDoorCountingQualityEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoorOpenStateEnumeration createDoorOpenStateEnumerationFromString(EDataType eDataType, String initialValue) {
		DoorOpenStateEnumeration result = DoorOpenStateEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDoorOpenStateEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoorOperationStateEnumeration createDoorOperationStateEnumerationFromString(EDataType eDataType, String initialValue) {
		DoorOperationStateEnumeration result = DoorOperationStateEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDoorOperationStateEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorCodeEnumeration createErrorCodeEnumerationFromString(EDataType eDataType, String initialValue) {
		ErrorCodeEnumeration result = ErrorCodeEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertErrorCodeEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExitSideEnumeration createExitSideEnumerationFromString(EDataType eDataType, String initialValue) {
		ExitSideEnumeration result = ExitSideEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExitSideEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunicularSubmodeEnumeration createFunicularSubmodeEnumerationFromString(EDataType eDataType, String initialValue) {
		FunicularSubmodeEnumeration result = FunicularSubmodeEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFunicularSubmodeEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GNSSCoordinateSystemEnumeration createGNSSCoordinateSystemEnumerationFromString(EDataType eDataType, String initialValue) {
		GNSSCoordinateSystemEnumeration result = GNSSCoordinateSystemEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGNSSCoordinateSystemEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GNSSQualityEnumeration createGNSSQualityEnumerationFromString(EDataType eDataType, String initialValue) {
		GNSSQualityEnumeration result = GNSSQualityEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGNSSQualityEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GNSSTypeEnumeration createGNSSTypeEnumerationFromString(EDataType eDataType, String initialValue) {
		GNSSTypeEnumeration result = GNSSTypeEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGNSSTypeEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JourneyModeEnumeration createJourneyModeEnumerationFromString(EDataType eDataType, String initialValue) {
		JourneyModeEnumeration result = JourneyModeEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJourneyModeEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationStateEnumeration createLocationStateEnumerationFromString(EDataType eDataType, String initialValue) {
		LocationStateEnumeration result = LocationStateEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocationStateEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageTypeEnumeration createMessageTypeEnumerationFromString(EDataType eDataType, String initialValue) {
		MessageTypeEnumeration result = MessageTypeEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageTypeEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetroSubmodeEnumeration createMetroSubmodeEnumerationFromString(EDataType eDataType, String initialValue) {
		MetroSubmodeEnumeration result = MetroSubmodeEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMetroSubmodeEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivateSubModesEnumeration createPrivateSubModesEnumerationFromString(EDataType eDataType, String initialValue) {
		PrivateSubModesEnumeration result = PrivateSubModesEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrivateSubModesEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtSubModesEnumeration createPtSubModesEnumerationFromString(EDataType eDataType, String initialValue) {
		PtSubModesEnumeration result = PtSubModesEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPtSubModesEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailSubmodeEnumeration createRailSubmodeEnumerationFromString(EDataType eDataType, String initialValue) {
		RailSubmodeEnumeration result = RailSubmodeEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRailSubmodeEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteDeviationEnumeration createRouteDeviationEnumerationFromString(EDataType eDataType, String initialValue) {
		RouteDeviationEnumeration result = RouteDeviationEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRouteDeviationEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteDirectionEnumeration createRouteDirectionEnumerationFromString(EDataType eDataType, String initialValue) {
		RouteDirectionEnumeration result = RouteDirectionEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRouteDirectionEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelfDriveSubmodeEnumeration createSelfDriveSubmodeEnumerationFromString(EDataType eDataType, String initialValue) {
		SelfDriveSubmodeEnumeration result = SelfDriveSubmodeEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSelfDriveSubmodeEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceNameEnumeration createServiceNameEnumerationFromString(EDataType eDataType, String initialValue) {
		ServiceNameEnumeration result = ServiceNameEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceNameEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceStateEnumeration createServiceStateEnumerationFromString(EDataType eDataType, String initialValue) {
		ServiceStateEnumeration result = ServiceStateEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceStateEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemDocumentationInformationEnumeration createSystemDocumentationInformationEnumerationFromString(EDataType eDataType, String initialValue) {
		SystemDocumentationInformationEnumeration result = SystemDocumentationInformationEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSystemDocumentationInformationEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaxiSubmodeEnumeration createTaxiSubmodeEnumerationFromString(EDataType eDataType, String initialValue) {
		TaxiSubmodeEnumeration result = TaxiSubmodeEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaxiSubmodeEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelecabinSubmodeEnumeration createTelecabinSubmodeEnumerationFromString(EDataType eDataType, String initialValue) {
		TelecabinSubmodeEnumeration result = TelecabinSubmodeEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTelecabinSubmodeEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TicketRazziaInformationEnumeration createTicketRazziaInformationEnumerationFromString(EDataType eDataType, String initialValue) {
		TicketRazziaInformationEnumeration result = TicketRazziaInformationEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTicketRazziaInformationEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TicketValidationEnumeration createTicketValidationEnumerationFromString(EDataType eDataType, String initialValue) {
		TicketValidationEnumeration result = TicketValidationEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTicketValidationEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TramSubmodeEnumeration createTramSubmodeEnumerationFromString(EDataType eDataType, String initialValue) {
		TramSubmodeEnumeration result = TramSubmodeEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTramSubmodeEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TripStateEnumeration createTripStateEnumerationFromString(EDataType eDataType, String initialValue) {
		TripStateEnumeration result = TripStateEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTripStateEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleModeEnumeration createVehicleModeEnumerationFromString(EDataType eDataType, String initialValue) {
		VehicleModeEnumeration result = VehicleModeEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVehicleModeEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaterSubmodeEnumeration createWaterSubmodeEnumerationFromString(EDataType eDataType, String initialValue) {
		WaterSubmodeEnumeration result = WaterSubmodeEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWaterSubmodeEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AirSubmodeEnumeration createAirSubmodeEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createAirSubmodeEnumerationFromString(IbisEnumerationsPackage.Literals.AIR_SUBMODE_ENUMERATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAirSubmodeEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAirSubmodeEnumerationToString(IbisEnumerationsPackage.Literals.AIR_SUBMODE_ENUMERATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusSubmodeEnumeration createBusSubmodeEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createBusSubmodeEnumerationFromString(IbisEnumerationsPackage.Literals.BUS_SUBMODE_ENUMERATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBusSubmodeEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBusSubmodeEnumerationToString(IbisEnumerationsPackage.Literals.BUS_SUBMODE_ENUMERATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoachSubmodeEnumeration createCoachSubmodeEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createCoachSubmodeEnumerationFromString(IbisEnumerationsPackage.Literals.COACH_SUBMODE_ENUMERATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCoachSubmodeEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCoachSubmodeEnumerationToString(IbisEnumerationsPackage.Literals.COACH_SUBMODE_ENUMERATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionStateEnumeration createConnectionStateEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createConnectionStateEnumerationFromString(IbisEnumerationsPackage.Literals.CONNECTION_STATE_ENUMERATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConnectionStateEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConnectionStateEnumerationToString(IbisEnumerationsPackage.Literals.CONNECTION_STATE_ENUMERATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionTypeEnumeration createConnectionTypeEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createConnectionTypeEnumerationFromString(IbisEnumerationsPackage.Literals.CONNECTION_TYPE_ENUMERATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConnectionTypeEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConnectionTypeEnumerationToString(IbisEnumerationsPackage.Literals.CONNECTION_TYPE_ENUMERATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataIntervalEnumeration createDataIntervalEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createDataIntervalEnumerationFromString(IbisEnumerationsPackage.Literals.DATA_INTERVAL_ENUMERATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataIntervalEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDataIntervalEnumerationToString(IbisEnumerationsPackage.Literals.DATA_INTERVAL_ENUMERATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceClassEnumeration createDeviceClassEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createDeviceClassEnumerationFromString(IbisEnumerationsPackage.Literals.DEVICE_CLASS_ENUMERATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceClassEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeviceClassEnumerationToString(IbisEnumerationsPackage.Literals.DEVICE_CLASS_ENUMERATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceStateEnumeration createDeviceStateEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createDeviceStateEnumerationFromString(IbisEnumerationsPackage.Literals.DEVICE_STATE_ENUMERATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceStateEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeviceStateEnumerationToString(IbisEnumerationsPackage.Literals.DEVICE_STATE_ENUMERATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceTaskEnumeration createDeviceTaskEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createDeviceTaskEnumerationFromString(IbisEnumerationsPackage.Literals.DEVICE_TASK_ENUMERATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceTaskEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeviceTaskEnumerationToString(IbisEnumerationsPackage.Literals.DEVICE_TASK_ENUMERATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoorCountingObjectClassEnumeration createDoorCountingObjectClassEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createDoorCountingObjectClassEnumerationFromString(IbisEnumerationsPackage.Literals.DOOR_COUNTING_OBJECT_CLASS_ENUMERATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDoorCountingObjectClassEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDoorCountingObjectClassEnumerationToString(IbisEnumerationsPackage.Literals.DOOR_COUNTING_OBJECT_CLASS_ENUMERATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoorCountingQualityEnumeration createDoorCountingQualityEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createDoorCountingQualityEnumerationFromString(IbisEnumerationsPackage.Literals.DOOR_COUNTING_QUALITY_ENUMERATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDoorCountingQualityEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDoorCountingQualityEnumerationToString(IbisEnumerationsPackage.Literals.DOOR_COUNTING_QUALITY_ENUMERATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoorOpenStateEnumeration createDoorOpenStateEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createDoorOpenStateEnumerationFromString(IbisEnumerationsPackage.Literals.DOOR_OPEN_STATE_ENUMERATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDoorOpenStateEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDoorOpenStateEnumerationToString(IbisEnumerationsPackage.Literals.DOOR_OPEN_STATE_ENUMERATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoorOperationStateEnumeration createDoorOperationStateEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createDoorOperationStateEnumerationFromString(IbisEnumerationsPackage.Literals.DOOR_OPERATION_STATE_ENUMERATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDoorOperationStateEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDoorOperationStateEnumerationToString(IbisEnumerationsPackage.Literals.DOOR_OPERATION_STATE_ENUMERATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorCodeEnumeration createErrorCodeEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createErrorCodeEnumerationFromString(IbisEnumerationsPackage.Literals.ERROR_CODE_ENUMERATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertErrorCodeEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertErrorCodeEnumerationToString(IbisEnumerationsPackage.Literals.ERROR_CODE_ENUMERATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExitSideEnumeration createExitSideEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createExitSideEnumerationFromString(IbisEnumerationsPackage.Literals.EXIT_SIDE_ENUMERATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExitSideEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertExitSideEnumerationToString(IbisEnumerationsPackage.Literals.EXIT_SIDE_ENUMERATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunicularSubmodeEnumeration createFunicularSubmodeEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createFunicularSubmodeEnumerationFromString(IbisEnumerationsPackage.Literals.FUNICULAR_SUBMODE_ENUMERATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFunicularSubmodeEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFunicularSubmodeEnumerationToString(IbisEnumerationsPackage.Literals.FUNICULAR_SUBMODE_ENUMERATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GNSSCoordinateSystemEnumeration createGNSSCoordinateSystemEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createGNSSCoordinateSystemEnumerationFromString(IbisEnumerationsPackage.Literals.GNSS_COORDINATE_SYSTEM_ENUMERATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGNSSCoordinateSystemEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGNSSCoordinateSystemEnumerationToString(IbisEnumerationsPackage.Literals.GNSS_COORDINATE_SYSTEM_ENUMERATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GNSSQualityEnumeration createGNSSQualityEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createGNSSQualityEnumerationFromString(IbisEnumerationsPackage.Literals.GNSS_QUALITY_ENUMERATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGNSSQualityEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGNSSQualityEnumerationToString(IbisEnumerationsPackage.Literals.GNSS_QUALITY_ENUMERATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GNSSTypeEnumeration createGNSSTypeEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createGNSSTypeEnumerationFromString(IbisEnumerationsPackage.Literals.GNSS_TYPE_ENUMERATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGNSSTypeEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGNSSTypeEnumerationToString(IbisEnumerationsPackage.Literals.GNSS_TYPE_ENUMERATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JourneyModeEnumeration createJourneyModeEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createJourneyModeEnumerationFromString(IbisEnumerationsPackage.Literals.JOURNEY_MODE_ENUMERATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJourneyModeEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertJourneyModeEnumerationToString(IbisEnumerationsPackage.Literals.JOURNEY_MODE_ENUMERATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationStateEnumeration createLocationStateEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createLocationStateEnumerationFromString(IbisEnumerationsPackage.Literals.LOCATION_STATE_ENUMERATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocationStateEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLocationStateEnumerationToString(IbisEnumerationsPackage.Literals.LOCATION_STATE_ENUMERATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageTypeEnumeration createMessageTypeEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createMessageTypeEnumerationFromString(IbisEnumerationsPackage.Literals.MESSAGE_TYPE_ENUMERATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageTypeEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMessageTypeEnumerationToString(IbisEnumerationsPackage.Literals.MESSAGE_TYPE_ENUMERATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetroSubmodeEnumeration createMetroSubmodeEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createMetroSubmodeEnumerationFromString(IbisEnumerationsPackage.Literals.METRO_SUBMODE_ENUMERATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMetroSubmodeEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMetroSubmodeEnumerationToString(IbisEnumerationsPackage.Literals.METRO_SUBMODE_ENUMERATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivateSubModesEnumeration createPrivateSubModesEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createPrivateSubModesEnumerationFromString(IbisEnumerationsPackage.Literals.PRIVATE_SUB_MODES_ENUMERATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrivateSubModesEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPrivateSubModesEnumerationToString(IbisEnumerationsPackage.Literals.PRIVATE_SUB_MODES_ENUMERATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtSubModesEnumeration createPtSubModesEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createPtSubModesEnumerationFromString(IbisEnumerationsPackage.Literals.PT_SUB_MODES_ENUMERATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPtSubModesEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPtSubModesEnumerationToString(IbisEnumerationsPackage.Literals.PT_SUB_MODES_ENUMERATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailSubmodeEnumeration createRailSubmodeEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createRailSubmodeEnumerationFromString(IbisEnumerationsPackage.Literals.RAIL_SUBMODE_ENUMERATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRailSubmodeEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRailSubmodeEnumerationToString(IbisEnumerationsPackage.Literals.RAIL_SUBMODE_ENUMERATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteDeviationEnumeration createRouteDeviationEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createRouteDeviationEnumerationFromString(IbisEnumerationsPackage.Literals.ROUTE_DEVIATION_ENUMERATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRouteDeviationEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRouteDeviationEnumerationToString(IbisEnumerationsPackage.Literals.ROUTE_DEVIATION_ENUMERATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteDirectionEnumeration createRouteDirectionEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createRouteDirectionEnumerationFromString(IbisEnumerationsPackage.Literals.ROUTE_DIRECTION_ENUMERATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRouteDirectionEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRouteDirectionEnumerationToString(IbisEnumerationsPackage.Literals.ROUTE_DIRECTION_ENUMERATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelfDriveSubmodeEnumeration createSelfDriveSubmodeEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createSelfDriveSubmodeEnumerationFromString(IbisEnumerationsPackage.Literals.SELF_DRIVE_SUBMODE_ENUMERATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSelfDriveSubmodeEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSelfDriveSubmodeEnumerationToString(IbisEnumerationsPackage.Literals.SELF_DRIVE_SUBMODE_ENUMERATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceNameEnumeration createServiceNameEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createServiceNameEnumerationFromString(IbisEnumerationsPackage.Literals.SERVICE_NAME_ENUMERATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceNameEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertServiceNameEnumerationToString(IbisEnumerationsPackage.Literals.SERVICE_NAME_ENUMERATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceStateEnumeration createServiceStateEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createServiceStateEnumerationFromString(IbisEnumerationsPackage.Literals.SERVICE_STATE_ENUMERATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceStateEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertServiceStateEnumerationToString(IbisEnumerationsPackage.Literals.SERVICE_STATE_ENUMERATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemDocumentationInformationEnumeration createSystemDocumentationInformationEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createSystemDocumentationInformationEnumerationFromString(IbisEnumerationsPackage.Literals.SYSTEM_DOCUMENTATION_INFORMATION_ENUMERATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSystemDocumentationInformationEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSystemDocumentationInformationEnumerationToString(IbisEnumerationsPackage.Literals.SYSTEM_DOCUMENTATION_INFORMATION_ENUMERATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaxiSubmodeEnumeration createTaxiSubmodeEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createTaxiSubmodeEnumerationFromString(IbisEnumerationsPackage.Literals.TAXI_SUBMODE_ENUMERATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaxiSubmodeEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTaxiSubmodeEnumerationToString(IbisEnumerationsPackage.Literals.TAXI_SUBMODE_ENUMERATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelecabinSubmodeEnumeration createTelecabinSubmodeEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createTelecabinSubmodeEnumerationFromString(IbisEnumerationsPackage.Literals.TELECABIN_SUBMODE_ENUMERATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTelecabinSubmodeEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTelecabinSubmodeEnumerationToString(IbisEnumerationsPackage.Literals.TELECABIN_SUBMODE_ENUMERATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TicketRazziaInformationEnumeration createTicketRazziaInformationEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createTicketRazziaInformationEnumerationFromString(IbisEnumerationsPackage.Literals.TICKET_RAZZIA_INFORMATION_ENUMERATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTicketRazziaInformationEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTicketRazziaInformationEnumerationToString(IbisEnumerationsPackage.Literals.TICKET_RAZZIA_INFORMATION_ENUMERATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TicketValidationEnumeration createTicketValidationEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createTicketValidationEnumerationFromString(IbisEnumerationsPackage.Literals.TICKET_VALIDATION_ENUMERATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTicketValidationEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTicketValidationEnumerationToString(IbisEnumerationsPackage.Literals.TICKET_VALIDATION_ENUMERATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TramSubmodeEnumeration createTramSubmodeEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createTramSubmodeEnumerationFromString(IbisEnumerationsPackage.Literals.TRAM_SUBMODE_ENUMERATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTramSubmodeEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTramSubmodeEnumerationToString(IbisEnumerationsPackage.Literals.TRAM_SUBMODE_ENUMERATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TripStateEnumeration createTripStateEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createTripStateEnumerationFromString(IbisEnumerationsPackage.Literals.TRIP_STATE_ENUMERATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTripStateEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTripStateEnumerationToString(IbisEnumerationsPackage.Literals.TRIP_STATE_ENUMERATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleModeEnumeration createVehicleModeEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createVehicleModeEnumerationFromString(IbisEnumerationsPackage.Literals.VEHICLE_MODE_ENUMERATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVehicleModeEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVehicleModeEnumerationToString(IbisEnumerationsPackage.Literals.VEHICLE_MODE_ENUMERATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaterSubmodeEnumeration createWaterSubmodeEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createWaterSubmodeEnumerationFromString(IbisEnumerationsPackage.Literals.WATER_SUBMODE_ENUMERATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWaterSubmodeEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertWaterSubmodeEnumerationToString(IbisEnumerationsPackage.Literals.WATER_SUBMODE_ENUMERATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IbisEnumerationsPackage getIbisEnumerationsPackage() {
		return (IbisEnumerationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IbisEnumerationsPackage getPackage() {
		return IbisEnumerationsPackage.eINSTANCE;
	}

} //IbisEnumerationsFactoryImpl
