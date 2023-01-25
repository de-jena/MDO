/**
 */
package de.jena.mdo.ibis.common.impl;

import de.jena.mdo.ibis.common.*;

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
public class IbisCommonFactoryImpl extends EFactoryImpl implements IbisCommonFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IbisCommonFactory init() {
		try {
			IbisCommonFactory theIbisCommonFactory = (IbisCommonFactory)EPackage.Registry.INSTANCE.getEFactory(IbisCommonPackage.eNS_URI);
			if (theIbisCommonFactory != null) {
				return theIbisCommonFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IbisCommonFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IbisCommonFactoryImpl() {
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
			case IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT_STRUCTURE: return createAdditionalAnnouncementStructure();
			case IbisCommonPackage.ANNOUNCEMENT_STRUCTURE: return createAnnouncementStructure();
			case IbisCommonPackage.BAY_AREA_STRUCTURE: return createBayAreaStructure();
			case IbisCommonPackage.BEACON_POINT_STRUCTURE: return createBeaconPointStructure();
			case IbisCommonPackage.CARD_APPL_INFORMATIONS: return createCardApplInformations();
			case IbisCommonPackage.CARD_TICKET_DATA: return createCardTicketData();
			case IbisCommonPackage.CARD_TYPE: return createCardType();
			case IbisCommonPackage.CONNECTION_STRUCTURE: return createConnectionStructure();
			case IbisCommonPackage.DATA_ACCEPTED_RESPONSE_DATA_STRUCTURE: return createDataAcceptedResponseDataStructure();
			case IbisCommonPackage.DATA_ACCEPTED_RESPONSE_STRUCTURE: return createDataAcceptedResponseStructure();
			case IbisCommonPackage.DATA_VERSION_LIST_STRUCTURE: return createDataVersionListStructure();
			case IbisCommonPackage.DATA_VERSION_STRUCTURE: return createDataVersionStructure();
			case IbisCommonPackage.DEGREE_TYPE: return createDegreeType();
			case IbisCommonPackage.DESTINATION_STRUCTURE: return createDestinationStructure();
			case IbisCommonPackage.DEVICE_INFORMATION_STRUCTURE: return createDeviceInformationStructure();
			case IbisCommonPackage.DEVICE_SPECIFICATION_LIST_STRUCTURE: return createDeviceSpecificationListStructure();
			case IbisCommonPackage.DEVICE_SPECIFICATION_STRUCTURE: return createDeviceSpecificationStructure();
			case IbisCommonPackage.DEVICE_SPECIFICATION_WITH_STATE_LIST_STRUCTURE: return createDeviceSpecificationWithStateListStructure();
			case IbisCommonPackage.DEVICE_SPECIFICATION_WITH_STATE_STRUCTURE: return createDeviceSpecificationWithStateStructure();
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE: return createDisplayContentStructure();
			case IbisCommonPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case IbisCommonPackage.DOOR_COUNTING_LIST_STRUCTURE: return createDoorCountingListStructure();
			case IbisCommonPackage.DOOR_COUNTING_STRUCTURE: return createDoorCountingStructure();
			case IbisCommonPackage.DOOR_INFORMATION_STRUCTURE: return createDoorInformationStructure();
			case IbisCommonPackage.DOOR_OPEN_STATE_STRUCTURE: return createDoorOpenStateStructure();
			case IbisCommonPackage.DOOR_OPERATION_STATE_STRUCTURE: return createDoorOperationStateStructure();
			case IbisCommonPackage.DOOR_STATE_STRUCTURE: return createDoorStateStructure();
			case IbisCommonPackage.FARE_ZONE_INFORMATION_STRUCTURE: return createFareZoneInformationStructure();
			case IbisCommonPackage.GLOBAL_CARD_STATUS: return createGlobalCardStatus();
			case IbisCommonPackage.GNSS_COORDINATE_STRUCTURE: return createGNSSCoordinateStructure();
			case IbisCommonPackage.GNSS_POINT_STRUCTURE: return createGNSSPointStructure();
			case IbisCommonPackage.IBISIP_ANY_URI: return createIBISIPAnyURI();
			case IbisCommonPackage.IBISIP_BOOLEAN: return createIBISIPBoolean();
			case IbisCommonPackage.IBISIP_BYTE: return createIBISIPByte();
			case IbisCommonPackage.IBISIP_DATE: return createIBISIPDate();
			case IbisCommonPackage.IBISIP_DATE_TIME: return createIBISIPDateTime();
			case IbisCommonPackage.IBISIP_DOUBLE: return createIBISIPDouble();
			case IbisCommonPackage.IBISIP_DURATION: return createIBISIPDuration();
			case IbisCommonPackage.IBISIP_INT: return createIBISIPInt();
			case IbisCommonPackage.IBISIP_LANGUAGE: return createIBISIPLanguage();
			case IbisCommonPackage.IBISIPNMTOKEN: return createIBISIPNMTOKEN();
			case IbisCommonPackage.IBISIP_NON_NEGATIVE_INTEGER: return createIBISIPNonNegativeInteger();
			case IbisCommonPackage.IBISIP_NORMALIZED_STRING: return createIBISIPNormalizedString();
			case IbisCommonPackage.IBISIP_STRING: return createIBISIPString();
			case IbisCommonPackage.IBISIP_TIME: return createIBISIPTime();
			case IbisCommonPackage.IBISIP_UNSIGNED_INT: return createIBISIPUnsignedInt();
			case IbisCommonPackage.IBISIP_UNSIGNED_LONG: return createIBISIPUnsignedLong();
			case IbisCommonPackage.INTERNATIONAL_TEXT_TYPE: return createInternationalTextType();
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE: return createJourneyStopInformationStructure();
			case IbisCommonPackage.LINE_INFORMATION_STRUCTURE: return createLineInformationStructure();
			case IbisCommonPackage.LOG_MESSAGE_STRUCTURE: return createLogMessageStructure();
			case IbisCommonPackage.MESSAGE_STRUCTURE: return createMessageStructure();
			case IbisCommonPackage.NETEX_MODE: return createNetexMode();
			case IbisCommonPackage.POINT_SEQUENCE_STRUCTURE: return createPointSequenceStructure();
			case IbisCommonPackage.POINT_STRUCTURE: return createPointStructure();
			case IbisCommonPackage.POINT_TYPE_STRUCTURE: return createPointTypeStructure();
			case IbisCommonPackage.SERVICE_IDENTIFICATION_STRUCTURE: return createServiceIdentificationStructure();
			case IbisCommonPackage.SERVICE_IDENTIFICATION_WITH_STATE_LIST_STRUCTURE: return createServiceIdentificationWithStateListStructure();
			case IbisCommonPackage.SERVICE_IDENTIFICATION_WITH_STATE_STRUCTURE: return createServiceIdentificationWithStateStructure();
			case IbisCommonPackage.SERVICE_INFORMATION_LIST_STRUCTURE: return createServiceInformationListStructure();
			case IbisCommonPackage.SERVICE_INFORMATION_STRUCTURE: return createServiceInformationStructure();
			case IbisCommonPackage.SERVICE_SPECIFICATION_STRUCTURE: return createServiceSpecificationStructure();
			case IbisCommonPackage.SERVICE_SPECIFICATION_WITH_STATE_LIST_STRUCTURE: return createServiceSpecificationWithStateListStructure();
			case IbisCommonPackage.SERVICE_SPECIFICATION_WITH_STATE_STRUCTURE: return createServiceSpecificationWithStateStructure();
			case IbisCommonPackage.SERVICE_START_LIST_STRUCTURE: return createServiceStartListStructure();
			case IbisCommonPackage.SERVICE_START_STRUCTURE: return createServiceStartStructure();
			case IbisCommonPackage.SHORT_TRIP_STOP_LIST_STRUCTURE: return createShortTripStopListStructure();
			case IbisCommonPackage.SHORT_TRIP_STOP_STRUCTURE: return createShortTripStopStructure();
			case IbisCommonPackage.SPECIFIC_POINT_STRUCTURE: return createSpecificPointStructure();
			case IbisCommonPackage.STOP_INFORMATION_REQUEST_STRUCTURE: return createStopInformationRequestStructure();
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE: return createStopInformationStructure();
			case IbisCommonPackage.STOP_POINT_TARIFF_INFORMATION_STRUCTURE: return createStopPointTariffInformationStructure();
			case IbisCommonPackage.STOP_SEQUENCE_STRUCTURE: return createStopSequenceStructure();
			case IbisCommonPackage.SUBSCRIBE_REQUEST_STRUCTURE: return createSubscribeRequestStructure();
			case IbisCommonPackage.SUBSCRIBE_RESPONSE_STRUCTURE: return createSubscribeResponseStructure();
			case IbisCommonPackage.TIMING_POINT_STRUCTURE: return createTimingPointStructure();
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE: return createTripInformationStructure();
			case IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE: return createTripSequenceStructure();
			case IbisCommonPackage.TSP_POINT_STRUCTURE: return createTSPPointStructure();
			case IbisCommonPackage.UNSUBSCRIBE_REQUEST_STRUCTURE: return createUnsubscribeRequestStructure();
			case IbisCommonPackage.UNSUBSCRIBE_RESPONSE_STRUCTURE: return createUnsubscribeResponseStructure();
			case IbisCommonPackage.VEHICLE_STRUCTURE: return createVehicleStructure();
			case IbisCommonPackage.VIA_POINT_STRUCTURE: return createViaPointStructure();
			case IbisCommonPackage.ZONE_TYPE: return createZoneType();
			case IbisCommonPackage.GENERAL_RESPONSE_STRUCTURE: return createGeneralResponseStructure();
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
	public AdditionalAnnouncementStructure createAdditionalAnnouncementStructure() {
		AdditionalAnnouncementStructureImpl additionalAnnouncementStructure = new AdditionalAnnouncementStructureImpl();
		return additionalAnnouncementStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnouncementStructure createAnnouncementStructure() {
		AnnouncementStructureImpl announcementStructure = new AnnouncementStructureImpl();
		return announcementStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BayAreaStructure createBayAreaStructure() {
		BayAreaStructureImpl bayAreaStructure = new BayAreaStructureImpl();
		return bayAreaStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BeaconPointStructure createBeaconPointStructure() {
		BeaconPointStructureImpl beaconPointStructure = new BeaconPointStructureImpl();
		return beaconPointStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CardApplInformations createCardApplInformations() {
		CardApplInformationsImpl cardApplInformations = new CardApplInformationsImpl();
		return cardApplInformations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CardTicketData createCardTicketData() {
		CardTicketDataImpl cardTicketData = new CardTicketDataImpl();
		return cardTicketData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CardType createCardType() {
		CardTypeImpl cardType = new CardTypeImpl();
		return cardType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectionStructure createConnectionStructure() {
		ConnectionStructureImpl connectionStructure = new ConnectionStructureImpl();
		return connectionStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataAcceptedResponseDataStructure createDataAcceptedResponseDataStructure() {
		DataAcceptedResponseDataStructureImpl dataAcceptedResponseDataStructure = new DataAcceptedResponseDataStructureImpl();
		return dataAcceptedResponseDataStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataAcceptedResponseStructure createDataAcceptedResponseStructure() {
		DataAcceptedResponseStructureImpl dataAcceptedResponseStructure = new DataAcceptedResponseStructureImpl();
		return dataAcceptedResponseStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataVersionListStructure createDataVersionListStructure() {
		DataVersionListStructureImpl dataVersionListStructure = new DataVersionListStructureImpl();
		return dataVersionListStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataVersionStructure createDataVersionStructure() {
		DataVersionStructureImpl dataVersionStructure = new DataVersionStructureImpl();
		return dataVersionStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DegreeType createDegreeType() {
		DegreeTypeImpl degreeType = new DegreeTypeImpl();
		return degreeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DestinationStructure createDestinationStructure() {
		DestinationStructureImpl destinationStructure = new DestinationStructureImpl();
		return destinationStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceInformationStructure createDeviceInformationStructure() {
		DeviceInformationStructureImpl deviceInformationStructure = new DeviceInformationStructureImpl();
		return deviceInformationStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceSpecificationListStructure createDeviceSpecificationListStructure() {
		DeviceSpecificationListStructureImpl deviceSpecificationListStructure = new DeviceSpecificationListStructureImpl();
		return deviceSpecificationListStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceSpecificationStructure createDeviceSpecificationStructure() {
		DeviceSpecificationStructureImpl deviceSpecificationStructure = new DeviceSpecificationStructureImpl();
		return deviceSpecificationStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceSpecificationWithStateListStructure createDeviceSpecificationWithStateListStructure() {
		DeviceSpecificationWithStateListStructureImpl deviceSpecificationWithStateListStructure = new DeviceSpecificationWithStateListStructureImpl();
		return deviceSpecificationWithStateListStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceSpecificationWithStateStructure createDeviceSpecificationWithStateStructure() {
		DeviceSpecificationWithStateStructureImpl deviceSpecificationWithStateStructure = new DeviceSpecificationWithStateStructureImpl();
		return deviceSpecificationWithStateStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DisplayContentStructure createDisplayContentStructure() {
		DisplayContentStructureImpl displayContentStructure = new DisplayContentStructureImpl();
		return displayContentStructure;
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
	@Override
	public DoorCountingListStructure createDoorCountingListStructure() {
		DoorCountingListStructureImpl doorCountingListStructure = new DoorCountingListStructureImpl();
		return doorCountingListStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoorCountingStructure createDoorCountingStructure() {
		DoorCountingStructureImpl doorCountingStructure = new DoorCountingStructureImpl();
		return doorCountingStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoorInformationStructure createDoorInformationStructure() {
		DoorInformationStructureImpl doorInformationStructure = new DoorInformationStructureImpl();
		return doorInformationStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoorOpenStateStructure createDoorOpenStateStructure() {
		DoorOpenStateStructureImpl doorOpenStateStructure = new DoorOpenStateStructureImpl();
		return doorOpenStateStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoorOperationStateStructure createDoorOperationStateStructure() {
		DoorOperationStateStructureImpl doorOperationStateStructure = new DoorOperationStateStructureImpl();
		return doorOperationStateStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoorStateStructure createDoorStateStructure() {
		DoorStateStructureImpl doorStateStructure = new DoorStateStructureImpl();
		return doorStateStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FareZoneInformationStructure createFareZoneInformationStructure() {
		FareZoneInformationStructureImpl fareZoneInformationStructure = new FareZoneInformationStructureImpl();
		return fareZoneInformationStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlobalCardStatus createGlobalCardStatus() {
		GlobalCardStatusImpl globalCardStatus = new GlobalCardStatusImpl();
		return globalCardStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GNSSCoordinateStructure createGNSSCoordinateStructure() {
		GNSSCoordinateStructureImpl gnssCoordinateStructure = new GNSSCoordinateStructureImpl();
		return gnssCoordinateStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GNSSPointStructure createGNSSPointStructure() {
		GNSSPointStructureImpl gnssPointStructure = new GNSSPointStructureImpl();
		return gnssPointStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPAnyURI createIBISIPAnyURI() {
		IBISIPAnyURIImpl ibisipAnyURI = new IBISIPAnyURIImpl();
		return ibisipAnyURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPBoolean createIBISIPBoolean() {
		IBISIPBooleanImpl ibisipBoolean = new IBISIPBooleanImpl();
		return ibisipBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPByte createIBISIPByte() {
		IBISIPByteImpl ibisipByte = new IBISIPByteImpl();
		return ibisipByte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPDate createIBISIPDate() {
		IBISIPDateImpl ibisipDate = new IBISIPDateImpl();
		return ibisipDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPDateTime createIBISIPDateTime() {
		IBISIPDateTimeImpl ibisipDateTime = new IBISIPDateTimeImpl();
		return ibisipDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPDouble createIBISIPDouble() {
		IBISIPDoubleImpl ibisipDouble = new IBISIPDoubleImpl();
		return ibisipDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPDuration createIBISIPDuration() {
		IBISIPDurationImpl ibisipDuration = new IBISIPDurationImpl();
		return ibisipDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPInt createIBISIPInt() {
		IBISIPIntImpl ibisipInt = new IBISIPIntImpl();
		return ibisipInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPLanguage createIBISIPLanguage() {
		IBISIPLanguageImpl ibisipLanguage = new IBISIPLanguageImpl();
		return ibisipLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPNMTOKEN createIBISIPNMTOKEN() {
		IBISIPNMTOKENImpl ibisipnmtoken = new IBISIPNMTOKENImpl();
		return ibisipnmtoken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPNonNegativeInteger createIBISIPNonNegativeInteger() {
		IBISIPNonNegativeIntegerImpl ibisipNonNegativeInteger = new IBISIPNonNegativeIntegerImpl();
		return ibisipNonNegativeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPNormalizedString createIBISIPNormalizedString() {
		IBISIPNormalizedStringImpl ibisipNormalizedString = new IBISIPNormalizedStringImpl();
		return ibisipNormalizedString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPString createIBISIPString() {
		IBISIPStringImpl ibisipString = new IBISIPStringImpl();
		return ibisipString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPTime createIBISIPTime() {
		IBISIPTimeImpl ibisipTime = new IBISIPTimeImpl();
		return ibisipTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPUnsignedInt createIBISIPUnsignedInt() {
		IBISIPUnsignedIntImpl ibisipUnsignedInt = new IBISIPUnsignedIntImpl();
		return ibisipUnsignedInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPUnsignedLong createIBISIPUnsignedLong() {
		IBISIPUnsignedLongImpl ibisipUnsignedLong = new IBISIPUnsignedLongImpl();
		return ibisipUnsignedLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternationalTextType createInternationalTextType() {
		InternationalTextTypeImpl internationalTextType = new InternationalTextTypeImpl();
		return internationalTextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JourneyStopInformationStructure createJourneyStopInformationStructure() {
		JourneyStopInformationStructureImpl journeyStopInformationStructure = new JourneyStopInformationStructureImpl();
		return journeyStopInformationStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineInformationStructure createLineInformationStructure() {
		LineInformationStructureImpl lineInformationStructure = new LineInformationStructureImpl();
		return lineInformationStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogMessageStructure createLogMessageStructure() {
		LogMessageStructureImpl logMessageStructure = new LogMessageStructureImpl();
		return logMessageStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageStructure createMessageStructure() {
		MessageStructureImpl messageStructure = new MessageStructureImpl();
		return messageStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetexMode createNetexMode() {
		NetexModeImpl netexMode = new NetexModeImpl();
		return netexMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointSequenceStructure createPointSequenceStructure() {
		PointSequenceStructureImpl pointSequenceStructure = new PointSequenceStructureImpl();
		return pointSequenceStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointStructure createPointStructure() {
		PointStructureImpl pointStructure = new PointStructureImpl();
		return pointStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointTypeStructure createPointTypeStructure() {
		PointTypeStructureImpl pointTypeStructure = new PointTypeStructureImpl();
		return pointTypeStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceIdentificationStructure createServiceIdentificationStructure() {
		ServiceIdentificationStructureImpl serviceIdentificationStructure = new ServiceIdentificationStructureImpl();
		return serviceIdentificationStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceIdentificationWithStateListStructure createServiceIdentificationWithStateListStructure() {
		ServiceIdentificationWithStateListStructureImpl serviceIdentificationWithStateListStructure = new ServiceIdentificationWithStateListStructureImpl();
		return serviceIdentificationWithStateListStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceIdentificationWithStateStructure createServiceIdentificationWithStateStructure() {
		ServiceIdentificationWithStateStructureImpl serviceIdentificationWithStateStructure = new ServiceIdentificationWithStateStructureImpl();
		return serviceIdentificationWithStateStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceInformationListStructure createServiceInformationListStructure() {
		ServiceInformationListStructureImpl serviceInformationListStructure = new ServiceInformationListStructureImpl();
		return serviceInformationListStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceInformationStructure createServiceInformationStructure() {
		ServiceInformationStructureImpl serviceInformationStructure = new ServiceInformationStructureImpl();
		return serviceInformationStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceSpecificationStructure createServiceSpecificationStructure() {
		ServiceSpecificationStructureImpl serviceSpecificationStructure = new ServiceSpecificationStructureImpl();
		return serviceSpecificationStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceSpecificationWithStateListStructure createServiceSpecificationWithStateListStructure() {
		ServiceSpecificationWithStateListStructureImpl serviceSpecificationWithStateListStructure = new ServiceSpecificationWithStateListStructureImpl();
		return serviceSpecificationWithStateListStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceSpecificationWithStateStructure createServiceSpecificationWithStateStructure() {
		ServiceSpecificationWithStateStructureImpl serviceSpecificationWithStateStructure = new ServiceSpecificationWithStateStructureImpl();
		return serviceSpecificationWithStateStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceStartListStructure createServiceStartListStructure() {
		ServiceStartListStructureImpl serviceStartListStructure = new ServiceStartListStructureImpl();
		return serviceStartListStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceStartStructure createServiceStartStructure() {
		ServiceStartStructureImpl serviceStartStructure = new ServiceStartStructureImpl();
		return serviceStartStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShortTripStopListStructure createShortTripStopListStructure() {
		ShortTripStopListStructureImpl shortTripStopListStructure = new ShortTripStopListStructureImpl();
		return shortTripStopListStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShortTripStopStructure createShortTripStopStructure() {
		ShortTripStopStructureImpl shortTripStopStructure = new ShortTripStopStructureImpl();
		return shortTripStopStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecificPointStructure createSpecificPointStructure() {
		SpecificPointStructureImpl specificPointStructure = new SpecificPointStructureImpl();
		return specificPointStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StopInformationRequestStructure createStopInformationRequestStructure() {
		StopInformationRequestStructureImpl stopInformationRequestStructure = new StopInformationRequestStructureImpl();
		return stopInformationRequestStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StopInformationStructure createStopInformationStructure() {
		StopInformationStructureImpl stopInformationStructure = new StopInformationStructureImpl();
		return stopInformationStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StopPointTariffInformationStructure createStopPointTariffInformationStructure() {
		StopPointTariffInformationStructureImpl stopPointTariffInformationStructure = new StopPointTariffInformationStructureImpl();
		return stopPointTariffInformationStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StopSequenceStructure createStopSequenceStructure() {
		StopSequenceStructureImpl stopSequenceStructure = new StopSequenceStructureImpl();
		return stopSequenceStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubscribeRequestStructure createSubscribeRequestStructure() {
		SubscribeRequestStructureImpl subscribeRequestStructure = new SubscribeRequestStructureImpl();
		return subscribeRequestStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubscribeResponseStructure createSubscribeResponseStructure() {
		SubscribeResponseStructureImpl subscribeResponseStructure = new SubscribeResponseStructureImpl();
		return subscribeResponseStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimingPointStructure createTimingPointStructure() {
		TimingPointStructureImpl timingPointStructure = new TimingPointStructureImpl();
		return timingPointStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TripInformationStructure createTripInformationStructure() {
		TripInformationStructureImpl tripInformationStructure = new TripInformationStructureImpl();
		return tripInformationStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TripSequenceStructure createTripSequenceStructure() {
		TripSequenceStructureImpl tripSequenceStructure = new TripSequenceStructureImpl();
		return tripSequenceStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TSPPointStructure createTSPPointStructure() {
		TSPPointStructureImpl tspPointStructure = new TSPPointStructureImpl();
		return tspPointStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnsubscribeRequestStructure createUnsubscribeRequestStructure() {
		UnsubscribeRequestStructureImpl unsubscribeRequestStructure = new UnsubscribeRequestStructureImpl();
		return unsubscribeRequestStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnsubscribeResponseStructure createUnsubscribeResponseStructure() {
		UnsubscribeResponseStructureImpl unsubscribeResponseStructure = new UnsubscribeResponseStructureImpl();
		return unsubscribeResponseStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VehicleStructure createVehicleStructure() {
		VehicleStructureImpl vehicleStructure = new VehicleStructureImpl();
		return vehicleStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViaPointStructure createViaPointStructure() {
		ViaPointStructureImpl viaPointStructure = new ViaPointStructureImpl();
		return viaPointStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZoneType createZoneType() {
		ZoneTypeImpl zoneType = new ZoneTypeImpl();
		return zoneType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeneralResponseStructure createGeneralResponseStructure() {
		GeneralResponseStructureImpl generalResponseStructure = new GeneralResponseStructureImpl();
		return generalResponseStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IbisCommonPackage getIbisCommonPackage() {
		return (IbisCommonPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IbisCommonPackage getPackage() {
		return IbisCommonPackage.eINSTANCE;
	}

} //IbisCommonFactoryImpl
