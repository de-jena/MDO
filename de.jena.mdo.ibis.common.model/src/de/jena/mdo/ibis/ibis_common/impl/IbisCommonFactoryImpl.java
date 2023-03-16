/**
 */
package de.jena.mdo.ibis.ibis_common.impl;

import de.jena.mdo.ibis.ibis_common.*;

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
			case IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT: return createAdditionalAnnouncement();
			case IbisCommonPackage.ANNOUNCEMENT: return createAnnouncement();
			case IbisCommonPackage.BAY_AREA: return createBayArea();
			case IbisCommonPackage.BEACON_POINT: return createBeaconPoint();
			case IbisCommonPackage.CARD_APPL_INFORMATIONS: return createCardApplInformations();
			case IbisCommonPackage.CARD_TICKET_DATA: return createCardTicketData();
			case IbisCommonPackage.CARD_TYPE: return createCardType();
			case IbisCommonPackage.CONNECTION: return createConnection();
			case IbisCommonPackage.DATA_ACCEPTED_RESPONSE_DATA: return createDataAcceptedResponseData();
			case IbisCommonPackage.DATA_ACCEPTED_RESPONSE: return createDataAcceptedResponse();
			case IbisCommonPackage.DATA_VERSION_LIST: return createDataVersionList();
			case IbisCommonPackage.DATA_VERSION: return createDataVersion();
			case IbisCommonPackage.DEGREE_TYPE: return createDegreeType();
			case IbisCommonPackage.DESTINATION: return createDestination();
			case IbisCommonPackage.DEVICE_INFORMATION: return createDeviceInformation();
			case IbisCommonPackage.DEVICE_SPECIFICATION_LIST: return createDeviceSpecificationList();
			case IbisCommonPackage.DEVICE_SPECIFICATION: return createDeviceSpecification();
			case IbisCommonPackage.DEVICE_SPECIFICATION_WITH_STATE_LIST: return createDeviceSpecificationWithStateList();
			case IbisCommonPackage.DEVICE_SPECIFICATION_WITH_STATE: return createDeviceSpecificationWithState();
			case IbisCommonPackage.DISPLAY_CONTENT: return createDisplayContent();
			case IbisCommonPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case IbisCommonPackage.DOOR_COUNTING_LIST: return createDoorCountingList();
			case IbisCommonPackage.DOOR_COUNTING: return createDoorCounting();
			case IbisCommonPackage.DOOR_INFORMATION: return createDoorInformation();
			case IbisCommonPackage.DOOR_OPEN_STATE: return createDoorOpenState();
			case IbisCommonPackage.DOOR_OPERATION_STATE: return createDoorOperationState();
			case IbisCommonPackage.DOOR_STATE: return createDoorState();
			case IbisCommonPackage.FARE_ZONE_INFORMATION: return createFareZoneInformation();
			case IbisCommonPackage.GLOBAL_CARD_STATUS: return createGlobalCardStatus();
			case IbisCommonPackage.GNSS_COORDINATE: return createGNSSCoordinate();
			case IbisCommonPackage.GNSS_POINT: return createGNSSPoint();
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
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION: return createJourneyStopInformation();
			case IbisCommonPackage.LINE_INFORMATION: return createLineInformation();
			case IbisCommonPackage.LOG_MESSAGE: return createLogMessage();
			case IbisCommonPackage.MESSAGE: return createMessage();
			case IbisCommonPackage.NETEX_MODE: return createNetexMode();
			case IbisCommonPackage.POINT_SEQUENCE: return createPointSequence();
			case IbisCommonPackage.POINT: return createPoint();
			case IbisCommonPackage.POINT_TYPE: return createPointType();
			case IbisCommonPackage.SERVICE_IDENTIFICATION: return createServiceIdentification();
			case IbisCommonPackage.SERVICE_IDENTIFICATION_WITH_STATE_LIST: return createServiceIdentificationWithStateList();
			case IbisCommonPackage.SERVICE_IDENTIFICATION_WITH_STATE: return createServiceIdentificationWithState();
			case IbisCommonPackage.SERVICE_INFORMATION_LIST: return createServiceInformationList();
			case IbisCommonPackage.SERVICE_INFORMATION: return createServiceInformation();
			case IbisCommonPackage.SERVICE_SPECIFICATION: return createServiceSpecification();
			case IbisCommonPackage.SERVICE_SPECIFICATION_WITH_STATE_LIST: return createServiceSpecificationWithStateList();
			case IbisCommonPackage.SERVICE_SPECIFICATION_WITH_STATE: return createServiceSpecificationWithState();
			case IbisCommonPackage.SERVICE_START_LIST: return createServiceStartList();
			case IbisCommonPackage.SERVICE_START: return createServiceStart();
			case IbisCommonPackage.SHORT_TRIP_STOP_LIST: return createShortTripStopList();
			case IbisCommonPackage.SHORT_TRIP_STOP: return createShortTripStop();
			case IbisCommonPackage.SPECIFIC_POINT: return createSpecificPoint();
			case IbisCommonPackage.STOP_INFORMATION_REQUEST: return createStopInformationRequest();
			case IbisCommonPackage.STOP_INFORMATION: return createStopInformation();
			case IbisCommonPackage.STOP_POINT_TARIFF_INFORMATION: return createStopPointTariffInformation();
			case IbisCommonPackage.STOP_SEQUENCE: return createStopSequence();
			case IbisCommonPackage.SUBSCRIBE_REQUEST: return createSubscribeRequest();
			case IbisCommonPackage.SUBSCRIBE_RESPONSE: return createSubscribeResponse();
			case IbisCommonPackage.TIMING_POINT: return createTimingPoint();
			case IbisCommonPackage.TRIP_INFORMATION: return createTripInformation();
			case IbisCommonPackage.TRIP_SEQUENCE: return createTripSequence();
			case IbisCommonPackage.TSP_POINT: return createTSPPoint();
			case IbisCommonPackage.UNSUBSCRIBE_REQUEST: return createUnsubscribeRequest();
			case IbisCommonPackage.UNSUBSCRIBE_RESPONSE: return createUnsubscribeResponse();
			case IbisCommonPackage.VEHICLE: return createVehicle();
			case IbisCommonPackage.VIA_POINT: return createViaPoint();
			case IbisCommonPackage.ZONE_TYPE: return createZoneType();
			case IbisCommonPackage.GENERAL_RESPONSE: return createGeneralResponse();
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
	public AdditionalAnnouncement createAdditionalAnnouncement() {
		AdditionalAnnouncementImpl additionalAnnouncement = new AdditionalAnnouncementImpl();
		return additionalAnnouncement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Announcement createAnnouncement() {
		AnnouncementImpl announcement = new AnnouncementImpl();
		return announcement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BayArea createBayArea() {
		BayAreaImpl bayArea = new BayAreaImpl();
		return bayArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BeaconPoint createBeaconPoint() {
		BeaconPointImpl beaconPoint = new BeaconPointImpl();
		return beaconPoint;
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
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataAcceptedResponseData createDataAcceptedResponseData() {
		DataAcceptedResponseDataImpl dataAcceptedResponseData = new DataAcceptedResponseDataImpl();
		return dataAcceptedResponseData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataAcceptedResponse createDataAcceptedResponse() {
		DataAcceptedResponseImpl dataAcceptedResponse = new DataAcceptedResponseImpl();
		return dataAcceptedResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataVersionList createDataVersionList() {
		DataVersionListImpl dataVersionList = new DataVersionListImpl();
		return dataVersionList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataVersion createDataVersion() {
		DataVersionImpl dataVersion = new DataVersionImpl();
		return dataVersion;
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
	public Destination createDestination() {
		DestinationImpl destination = new DestinationImpl();
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceInformation createDeviceInformation() {
		DeviceInformationImpl deviceInformation = new DeviceInformationImpl();
		return deviceInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceSpecificationList createDeviceSpecificationList() {
		DeviceSpecificationListImpl deviceSpecificationList = new DeviceSpecificationListImpl();
		return deviceSpecificationList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceSpecification createDeviceSpecification() {
		DeviceSpecificationImpl deviceSpecification = new DeviceSpecificationImpl();
		return deviceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceSpecificationWithStateList createDeviceSpecificationWithStateList() {
		DeviceSpecificationWithStateListImpl deviceSpecificationWithStateList = new DeviceSpecificationWithStateListImpl();
		return deviceSpecificationWithStateList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceSpecificationWithState createDeviceSpecificationWithState() {
		DeviceSpecificationWithStateImpl deviceSpecificationWithState = new DeviceSpecificationWithStateImpl();
		return deviceSpecificationWithState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DisplayContent createDisplayContent() {
		DisplayContentImpl displayContent = new DisplayContentImpl();
		return displayContent;
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
	public DoorCountingList createDoorCountingList() {
		DoorCountingListImpl doorCountingList = new DoorCountingListImpl();
		return doorCountingList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoorCounting createDoorCounting() {
		DoorCountingImpl doorCounting = new DoorCountingImpl();
		return doorCounting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoorInformation createDoorInformation() {
		DoorInformationImpl doorInformation = new DoorInformationImpl();
		return doorInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoorOpenState createDoorOpenState() {
		DoorOpenStateImpl doorOpenState = new DoorOpenStateImpl();
		return doorOpenState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoorOperationState createDoorOperationState() {
		DoorOperationStateImpl doorOperationState = new DoorOperationStateImpl();
		return doorOperationState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoorState createDoorState() {
		DoorStateImpl doorState = new DoorStateImpl();
		return doorState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FareZoneInformation createFareZoneInformation() {
		FareZoneInformationImpl fareZoneInformation = new FareZoneInformationImpl();
		return fareZoneInformation;
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
	public GNSSCoordinate createGNSSCoordinate() {
		GNSSCoordinateImpl gnssCoordinate = new GNSSCoordinateImpl();
		return gnssCoordinate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GNSSPoint createGNSSPoint() {
		GNSSPointImpl gnssPoint = new GNSSPointImpl();
		return gnssPoint;
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
	public JourneyStopInformation createJourneyStopInformation() {
		JourneyStopInformationImpl journeyStopInformation = new JourneyStopInformationImpl();
		return journeyStopInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineInformation createLineInformation() {
		LineInformationImpl lineInformation = new LineInformationImpl();
		return lineInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogMessage createLogMessage() {
		LogMessageImpl logMessage = new LogMessageImpl();
		return logMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
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
	public PointSequence createPointSequence() {
		PointSequenceImpl pointSequence = new PointSequenceImpl();
		return pointSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Point createPoint() {
		PointImpl point = new PointImpl();
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointType createPointType() {
		PointTypeImpl pointType = new PointTypeImpl();
		return pointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceIdentification createServiceIdentification() {
		ServiceIdentificationImpl serviceIdentification = new ServiceIdentificationImpl();
		return serviceIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceIdentificationWithStateList createServiceIdentificationWithStateList() {
		ServiceIdentificationWithStateListImpl serviceIdentificationWithStateList = new ServiceIdentificationWithStateListImpl();
		return serviceIdentificationWithStateList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceIdentificationWithState createServiceIdentificationWithState() {
		ServiceIdentificationWithStateImpl serviceIdentificationWithState = new ServiceIdentificationWithStateImpl();
		return serviceIdentificationWithState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceInformationList createServiceInformationList() {
		ServiceInformationListImpl serviceInformationList = new ServiceInformationListImpl();
		return serviceInformationList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceInformation createServiceInformation() {
		ServiceInformationImpl serviceInformation = new ServiceInformationImpl();
		return serviceInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceSpecification createServiceSpecification() {
		ServiceSpecificationImpl serviceSpecification = new ServiceSpecificationImpl();
		return serviceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceSpecificationWithStateList createServiceSpecificationWithStateList() {
		ServiceSpecificationWithStateListImpl serviceSpecificationWithStateList = new ServiceSpecificationWithStateListImpl();
		return serviceSpecificationWithStateList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceSpecificationWithState createServiceSpecificationWithState() {
		ServiceSpecificationWithStateImpl serviceSpecificationWithState = new ServiceSpecificationWithStateImpl();
		return serviceSpecificationWithState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceStartList createServiceStartList() {
		ServiceStartListImpl serviceStartList = new ServiceStartListImpl();
		return serviceStartList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceStart createServiceStart() {
		ServiceStartImpl serviceStart = new ServiceStartImpl();
		return serviceStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShortTripStopList createShortTripStopList() {
		ShortTripStopListImpl shortTripStopList = new ShortTripStopListImpl();
		return shortTripStopList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShortTripStop createShortTripStop() {
		ShortTripStopImpl shortTripStop = new ShortTripStopImpl();
		return shortTripStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecificPoint createSpecificPoint() {
		SpecificPointImpl specificPoint = new SpecificPointImpl();
		return specificPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StopInformationRequest createStopInformationRequest() {
		StopInformationRequestImpl stopInformationRequest = new StopInformationRequestImpl();
		return stopInformationRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StopInformation createStopInformation() {
		StopInformationImpl stopInformation = new StopInformationImpl();
		return stopInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StopPointTariffInformation createStopPointTariffInformation() {
		StopPointTariffInformationImpl stopPointTariffInformation = new StopPointTariffInformationImpl();
		return stopPointTariffInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StopSequence createStopSequence() {
		StopSequenceImpl stopSequence = new StopSequenceImpl();
		return stopSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubscribeRequest createSubscribeRequest() {
		SubscribeRequestImpl subscribeRequest = new SubscribeRequestImpl();
		return subscribeRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubscribeResponse createSubscribeResponse() {
		SubscribeResponseImpl subscribeResponse = new SubscribeResponseImpl();
		return subscribeResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimingPoint createTimingPoint() {
		TimingPointImpl timingPoint = new TimingPointImpl();
		return timingPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TripInformation createTripInformation() {
		TripInformationImpl tripInformation = new TripInformationImpl();
		return tripInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TripSequence createTripSequence() {
		TripSequenceImpl tripSequence = new TripSequenceImpl();
		return tripSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TSPPoint createTSPPoint() {
		TSPPointImpl tspPoint = new TSPPointImpl();
		return tspPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnsubscribeRequest createUnsubscribeRequest() {
		UnsubscribeRequestImpl unsubscribeRequest = new UnsubscribeRequestImpl();
		return unsubscribeRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnsubscribeResponse createUnsubscribeResponse() {
		UnsubscribeResponseImpl unsubscribeResponse = new UnsubscribeResponseImpl();
		return unsubscribeResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vehicle createVehicle() {
		VehicleImpl vehicle = new VehicleImpl();
		return vehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViaPoint createViaPoint() {
		ViaPointImpl viaPoint = new ViaPointImpl();
		return viaPoint;
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
	public GeneralResponse createGeneralResponse() {
		GeneralResponseImpl generalResponse = new GeneralResponseImpl();
		return generalResponse;
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
