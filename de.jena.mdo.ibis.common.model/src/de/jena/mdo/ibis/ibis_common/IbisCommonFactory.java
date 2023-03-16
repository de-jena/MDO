/*
 */
package de.jena.mdo.ibis.ibis_common;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage
 * @generated
 */
@ProviderType
public interface IbisCommonFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IbisCommonFactory eINSTANCE = de.jena.mdo.ibis.ibis_common.impl.IbisCommonFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Additional Announcement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Additional Announcement</em>'.
	 * @generated
	 */
	AdditionalAnnouncement createAdditionalAnnouncement();

	/**
	 * Returns a new object of class '<em>Announcement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Announcement</em>'.
	 * @generated
	 */
	Announcement createAnnouncement();

	/**
	 * Returns a new object of class '<em>Bay Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bay Area</em>'.
	 * @generated
	 */
	BayArea createBayArea();

	/**
	 * Returns a new object of class '<em>Beacon Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Beacon Point</em>'.
	 * @generated
	 */
	BeaconPoint createBeaconPoint();

	/**
	 * Returns a new object of class '<em>Card Appl Informations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Card Appl Informations</em>'.
	 * @generated
	 */
	CardApplInformations createCardApplInformations();

	/**
	 * Returns a new object of class '<em>Card Ticket Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Card Ticket Data</em>'.
	 * @generated
	 */
	CardTicketData createCardTicketData();

	/**
	 * Returns a new object of class '<em>Card Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Card Type</em>'.
	 * @generated
	 */
	CardType createCardType();

	/**
	 * Returns a new object of class '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection</em>'.
	 * @generated
	 */
	Connection createConnection();

	/**
	 * Returns a new object of class '<em>Data Accepted Response Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Accepted Response Data</em>'.
	 * @generated
	 */
	DataAcceptedResponseData createDataAcceptedResponseData();

	/**
	 * Returns a new object of class '<em>Data Accepted Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Accepted Response</em>'.
	 * @generated
	 */
	DataAcceptedResponse createDataAcceptedResponse();

	/**
	 * Returns a new object of class '<em>Data Version List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Version List</em>'.
	 * @generated
	 */
	DataVersionList createDataVersionList();

	/**
	 * Returns a new object of class '<em>Data Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Version</em>'.
	 * @generated
	 */
	DataVersion createDataVersion();

	/**
	 * Returns a new object of class '<em>Degree Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Degree Type</em>'.
	 * @generated
	 */
	DegreeType createDegreeType();

	/**
	 * Returns a new object of class '<em>Destination</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Destination</em>'.
	 * @generated
	 */
	Destination createDestination();

	/**
	 * Returns a new object of class '<em>Device Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Information</em>'.
	 * @generated
	 */
	DeviceInformation createDeviceInformation();

	/**
	 * Returns a new object of class '<em>Device Specification List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Specification List</em>'.
	 * @generated
	 */
	DeviceSpecificationList createDeviceSpecificationList();

	/**
	 * Returns a new object of class '<em>Device Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Specification</em>'.
	 * @generated
	 */
	DeviceSpecification createDeviceSpecification();

	/**
	 * Returns a new object of class '<em>Device Specification With State List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Specification With State List</em>'.
	 * @generated
	 */
	DeviceSpecificationWithStateList createDeviceSpecificationWithStateList();

	/**
	 * Returns a new object of class '<em>Device Specification With State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Specification With State</em>'.
	 * @generated
	 */
	DeviceSpecificationWithState createDeviceSpecificationWithState();

	/**
	 * Returns a new object of class '<em>Display Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Display Content</em>'.
	 * @generated
	 */
	DisplayContent createDisplayContent();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Door Counting List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Door Counting List</em>'.
	 * @generated
	 */
	DoorCountingList createDoorCountingList();

	/**
	 * Returns a new object of class '<em>Door Counting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Door Counting</em>'.
	 * @generated
	 */
	DoorCounting createDoorCounting();

	/**
	 * Returns a new object of class '<em>Door Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Door Information</em>'.
	 * @generated
	 */
	DoorInformation createDoorInformation();

	/**
	 * Returns a new object of class '<em>Door Open State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Door Open State</em>'.
	 * @generated
	 */
	DoorOpenState createDoorOpenState();

	/**
	 * Returns a new object of class '<em>Door Operation State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Door Operation State</em>'.
	 * @generated
	 */
	DoorOperationState createDoorOperationState();

	/**
	 * Returns a new object of class '<em>Door State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Door State</em>'.
	 * @generated
	 */
	DoorState createDoorState();

	/**
	 * Returns a new object of class '<em>Fare Zone Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fare Zone Information</em>'.
	 * @generated
	 */
	FareZoneInformation createFareZoneInformation();

	/**
	 * Returns a new object of class '<em>Global Card Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global Card Status</em>'.
	 * @generated
	 */
	GlobalCardStatus createGlobalCardStatus();

	/**
	 * Returns a new object of class '<em>GNSS Coordinate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GNSS Coordinate</em>'.
	 * @generated
	 */
	GNSSCoordinate createGNSSCoordinate();

	/**
	 * Returns a new object of class '<em>GNSS Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GNSS Point</em>'.
	 * @generated
	 */
	GNSSPoint createGNSSPoint();

	/**
	 * Returns a new object of class '<em>IBISIP Any URI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IBISIP Any URI</em>'.
	 * @generated
	 */
	IBISIPAnyURI createIBISIPAnyURI();

	/**
	 * Returns a new object of class '<em>IBISIP Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IBISIP Boolean</em>'.
	 * @generated
	 */
	IBISIPBoolean createIBISIPBoolean();

	/**
	 * Returns a new object of class '<em>IBISIP Byte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IBISIP Byte</em>'.
	 * @generated
	 */
	IBISIPByte createIBISIPByte();

	/**
	 * Returns a new object of class '<em>IBISIP Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IBISIP Date</em>'.
	 * @generated
	 */
	IBISIPDate createIBISIPDate();

	/**
	 * Returns a new object of class '<em>IBISIP Date Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IBISIP Date Time</em>'.
	 * @generated
	 */
	IBISIPDateTime createIBISIPDateTime();

	/**
	 * Returns a new object of class '<em>IBISIP Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IBISIP Double</em>'.
	 * @generated
	 */
	IBISIPDouble createIBISIPDouble();

	/**
	 * Returns a new object of class '<em>IBISIP Duration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IBISIP Duration</em>'.
	 * @generated
	 */
	IBISIPDuration createIBISIPDuration();

	/**
	 * Returns a new object of class '<em>IBISIP Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IBISIP Int</em>'.
	 * @generated
	 */
	IBISIPInt createIBISIPInt();

	/**
	 * Returns a new object of class '<em>IBISIP Language</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IBISIP Language</em>'.
	 * @generated
	 */
	IBISIPLanguage createIBISIPLanguage();

	/**
	 * Returns a new object of class '<em>IBISIPNMTOKEN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IBISIPNMTOKEN</em>'.
	 * @generated
	 */
	IBISIPNMTOKEN createIBISIPNMTOKEN();

	/**
	 * Returns a new object of class '<em>IBISIP Non Negative Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IBISIP Non Negative Integer</em>'.
	 * @generated
	 */
	IBISIPNonNegativeInteger createIBISIPNonNegativeInteger();

	/**
	 * Returns a new object of class '<em>IBISIP Normalized String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IBISIP Normalized String</em>'.
	 * @generated
	 */
	IBISIPNormalizedString createIBISIPNormalizedString();

	/**
	 * Returns a new object of class '<em>IBISIP String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IBISIP String</em>'.
	 * @generated
	 */
	IBISIPString createIBISIPString();

	/**
	 * Returns a new object of class '<em>IBISIP Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IBISIP Time</em>'.
	 * @generated
	 */
	IBISIPTime createIBISIPTime();

	/**
	 * Returns a new object of class '<em>IBISIP Unsigned Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IBISIP Unsigned Int</em>'.
	 * @generated
	 */
	IBISIPUnsignedInt createIBISIPUnsignedInt();

	/**
	 * Returns a new object of class '<em>IBISIP Unsigned Long</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IBISIP Unsigned Long</em>'.
	 * @generated
	 */
	IBISIPUnsignedLong createIBISIPUnsignedLong();

	/**
	 * Returns a new object of class '<em>International Text Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>International Text Type</em>'.
	 * @generated
	 */
	InternationalTextType createInternationalTextType();

	/**
	 * Returns a new object of class '<em>Journey Stop Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Journey Stop Information</em>'.
	 * @generated
	 */
	JourneyStopInformation createJourneyStopInformation();

	/**
	 * Returns a new object of class '<em>Line Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line Information</em>'.
	 * @generated
	 */
	LineInformation createLineInformation();

	/**
	 * Returns a new object of class '<em>Log Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Log Message</em>'.
	 * @generated
	 */
	LogMessage createLogMessage();

	/**
	 * Returns a new object of class '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message</em>'.
	 * @generated
	 */
	Message createMessage();

	/**
	 * Returns a new object of class '<em>Netex Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Netex Mode</em>'.
	 * @generated
	 */
	NetexMode createNetexMode();

	/**
	 * Returns a new object of class '<em>Point Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point Sequence</em>'.
	 * @generated
	 */
	PointSequence createPointSequence();

	/**
	 * Returns a new object of class '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point</em>'.
	 * @generated
	 */
	Point createPoint();

	/**
	 * Returns a new object of class '<em>Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point Type</em>'.
	 * @generated
	 */
	PointType createPointType();

	/**
	 * Returns a new object of class '<em>Service Identification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Identification</em>'.
	 * @generated
	 */
	ServiceIdentification createServiceIdentification();

	/**
	 * Returns a new object of class '<em>Service Identification With State List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Identification With State List</em>'.
	 * @generated
	 */
	ServiceIdentificationWithStateList createServiceIdentificationWithStateList();

	/**
	 * Returns a new object of class '<em>Service Identification With State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Identification With State</em>'.
	 * @generated
	 */
	ServiceIdentificationWithState createServiceIdentificationWithState();

	/**
	 * Returns a new object of class '<em>Service Information List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Information List</em>'.
	 * @generated
	 */
	ServiceInformationList createServiceInformationList();

	/**
	 * Returns a new object of class '<em>Service Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Information</em>'.
	 * @generated
	 */
	ServiceInformation createServiceInformation();

	/**
	 * Returns a new object of class '<em>Service Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Specification</em>'.
	 * @generated
	 */
	ServiceSpecification createServiceSpecification();

	/**
	 * Returns a new object of class '<em>Service Specification With State List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Specification With State List</em>'.
	 * @generated
	 */
	ServiceSpecificationWithStateList createServiceSpecificationWithStateList();

	/**
	 * Returns a new object of class '<em>Service Specification With State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Specification With State</em>'.
	 * @generated
	 */
	ServiceSpecificationWithState createServiceSpecificationWithState();

	/**
	 * Returns a new object of class '<em>Service Start List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Start List</em>'.
	 * @generated
	 */
	ServiceStartList createServiceStartList();

	/**
	 * Returns a new object of class '<em>Service Start</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Start</em>'.
	 * @generated
	 */
	ServiceStart createServiceStart();

	/**
	 * Returns a new object of class '<em>Short Trip Stop List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Short Trip Stop List</em>'.
	 * @generated
	 */
	ShortTripStopList createShortTripStopList();

	/**
	 * Returns a new object of class '<em>Short Trip Stop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Short Trip Stop</em>'.
	 * @generated
	 */
	ShortTripStop createShortTripStop();

	/**
	 * Returns a new object of class '<em>Specific Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specific Point</em>'.
	 * @generated
	 */
	SpecificPoint createSpecificPoint();

	/**
	 * Returns a new object of class '<em>Stop Information Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stop Information Request</em>'.
	 * @generated
	 */
	StopInformationRequest createStopInformationRequest();

	/**
	 * Returns a new object of class '<em>Stop Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stop Information</em>'.
	 * @generated
	 */
	StopInformation createStopInformation();

	/**
	 * Returns a new object of class '<em>Stop Point Tariff Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stop Point Tariff Information</em>'.
	 * @generated
	 */
	StopPointTariffInformation createStopPointTariffInformation();

	/**
	 * Returns a new object of class '<em>Stop Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stop Sequence</em>'.
	 * @generated
	 */
	StopSequence createStopSequence();

	/**
	 * Returns a new object of class '<em>Subscribe Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subscribe Request</em>'.
	 * @generated
	 */
	SubscribeRequest createSubscribeRequest();

	/**
	 * Returns a new object of class '<em>Subscribe Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subscribe Response</em>'.
	 * @generated
	 */
	SubscribeResponse createSubscribeResponse();

	/**
	 * Returns a new object of class '<em>Timing Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timing Point</em>'.
	 * @generated
	 */
	TimingPoint createTimingPoint();

	/**
	 * Returns a new object of class '<em>Trip Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trip Information</em>'.
	 * @generated
	 */
	TripInformation createTripInformation();

	/**
	 * Returns a new object of class '<em>Trip Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trip Sequence</em>'.
	 * @generated
	 */
	TripSequence createTripSequence();

	/**
	 * Returns a new object of class '<em>TSP Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TSP Point</em>'.
	 * @generated
	 */
	TSPPoint createTSPPoint();

	/**
	 * Returns a new object of class '<em>Unsubscribe Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unsubscribe Request</em>'.
	 * @generated
	 */
	UnsubscribeRequest createUnsubscribeRequest();

	/**
	 * Returns a new object of class '<em>Unsubscribe Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unsubscribe Response</em>'.
	 * @generated
	 */
	UnsubscribeResponse createUnsubscribeResponse();

	/**
	 * Returns a new object of class '<em>Vehicle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vehicle</em>'.
	 * @generated
	 */
	Vehicle createVehicle();

	/**
	 * Returns a new object of class '<em>Via Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Via Point</em>'.
	 * @generated
	 */
	ViaPoint createViaPoint();

	/**
	 * Returns a new object of class '<em>Zone Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zone Type</em>'.
	 * @generated
	 */
	ZoneType createZoneType();

	/**
	 * Returns a new object of class '<em>General Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>General Response</em>'.
	 * @generated
	 */
	GeneralResponse createGeneralResponse();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IbisCommonPackage getIbisCommonPackage();

} //IbisCommonFactory
