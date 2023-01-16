/*
 */
package de.jena.mdo.ibis.common;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.mdo.ibis.common.IbisCommonPackage
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
	IbisCommonFactory eINSTANCE = de.jena.mdo.ibis.common.impl.IbisCommonFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Additional Announcement Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Additional Announcement Structure</em>'.
	 * @generated
	 */
	AdditionalAnnouncementStructure createAdditionalAnnouncementStructure();

	/**
	 * Returns a new object of class '<em>Announcement Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Announcement Structure</em>'.
	 * @generated
	 */
	AnnouncementStructure createAnnouncementStructure();

	/**
	 * Returns a new object of class '<em>Bay Area Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bay Area Structure</em>'.
	 * @generated
	 */
	BayAreaStructure createBayAreaStructure();

	/**
	 * Returns a new object of class '<em>Beacon Point Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Beacon Point Structure</em>'.
	 * @generated
	 */
	BeaconPointStructure createBeaconPointStructure();

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
	 * Returns a new object of class '<em>Connection Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Structure</em>'.
	 * @generated
	 */
	ConnectionStructure createConnectionStructure();

	/**
	 * Returns a new object of class '<em>Data Accepted Response Data Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Accepted Response Data Structure</em>'.
	 * @generated
	 */
	DataAcceptedResponseDataStructure createDataAcceptedResponseDataStructure();

	/**
	 * Returns a new object of class '<em>Data Accepted Response Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Accepted Response Structure</em>'.
	 * @generated
	 */
	DataAcceptedResponseStructure createDataAcceptedResponseStructure();

	/**
	 * Returns a new object of class '<em>Data Version List Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Version List Structure</em>'.
	 * @generated
	 */
	DataVersionListStructure createDataVersionListStructure();

	/**
	 * Returns a new object of class '<em>Data Version Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Version Structure</em>'.
	 * @generated
	 */
	DataVersionStructure createDataVersionStructure();

	/**
	 * Returns a new object of class '<em>Degree Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Degree Type</em>'.
	 * @generated
	 */
	DegreeType createDegreeType();

	/**
	 * Returns a new object of class '<em>Destination Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Destination Structure</em>'.
	 * @generated
	 */
	DestinationStructure createDestinationStructure();

	/**
	 * Returns a new object of class '<em>Device Information Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Information Structure</em>'.
	 * @generated
	 */
	DeviceInformationStructure createDeviceInformationStructure();

	/**
	 * Returns a new object of class '<em>Device Specification List Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Specification List Structure</em>'.
	 * @generated
	 */
	DeviceSpecificationListStructure createDeviceSpecificationListStructure();

	/**
	 * Returns a new object of class '<em>Device Specification Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Specification Structure</em>'.
	 * @generated
	 */
	DeviceSpecificationStructure createDeviceSpecificationStructure();

	/**
	 * Returns a new object of class '<em>Device Specification With State List Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Specification With State List Structure</em>'.
	 * @generated
	 */
	DeviceSpecificationWithStateListStructure createDeviceSpecificationWithStateListStructure();

	/**
	 * Returns a new object of class '<em>Device Specification With State Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Specification With State Structure</em>'.
	 * @generated
	 */
	DeviceSpecificationWithStateStructure createDeviceSpecificationWithStateStructure();

	/**
	 * Returns a new object of class '<em>Display Content Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Display Content Structure</em>'.
	 * @generated
	 */
	DisplayContentStructure createDisplayContentStructure();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Door Counting List Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Door Counting List Structure</em>'.
	 * @generated
	 */
	DoorCountingListStructure createDoorCountingListStructure();

	/**
	 * Returns a new object of class '<em>Door Counting Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Door Counting Structure</em>'.
	 * @generated
	 */
	DoorCountingStructure createDoorCountingStructure();

	/**
	 * Returns a new object of class '<em>Door Information Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Door Information Structure</em>'.
	 * @generated
	 */
	DoorInformationStructure createDoorInformationStructure();

	/**
	 * Returns a new object of class '<em>Door Open State Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Door Open State Structure</em>'.
	 * @generated
	 */
	DoorOpenStateStructure createDoorOpenStateStructure();

	/**
	 * Returns a new object of class '<em>Door Operation State Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Door Operation State Structure</em>'.
	 * @generated
	 */
	DoorOperationStateStructure createDoorOperationStateStructure();

	/**
	 * Returns a new object of class '<em>Door State Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Door State Structure</em>'.
	 * @generated
	 */
	DoorStateStructure createDoorStateStructure();

	/**
	 * Returns a new object of class '<em>Fare Zone Information Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fare Zone Information Structure</em>'.
	 * @generated
	 */
	FareZoneInformationStructure createFareZoneInformationStructure();

	/**
	 * Returns a new object of class '<em>Global Card Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global Card Status</em>'.
	 * @generated
	 */
	GlobalCardStatus createGlobalCardStatus();

	/**
	 * Returns a new object of class '<em>GNSS Coordinate Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GNSS Coordinate Structure</em>'.
	 * @generated
	 */
	GNSSCoordinateStructure createGNSSCoordinateStructure();

	/**
	 * Returns a new object of class '<em>GNSS Point Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GNSS Point Structure</em>'.
	 * @generated
	 */
	GNSSPointStructure createGNSSPointStructure();

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
	 * Returns a new object of class '<em>Journey Stop Information Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Journey Stop Information Structure</em>'.
	 * @generated
	 */
	JourneyStopInformationStructure createJourneyStopInformationStructure();

	/**
	 * Returns a new object of class '<em>Line Information Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line Information Structure</em>'.
	 * @generated
	 */
	LineInformationStructure createLineInformationStructure();

	/**
	 * Returns a new object of class '<em>Log Message Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Log Message Structure</em>'.
	 * @generated
	 */
	LogMessageStructure createLogMessageStructure();

	/**
	 * Returns a new object of class '<em>Message Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Structure</em>'.
	 * @generated
	 */
	MessageStructure createMessageStructure();

	/**
	 * Returns a new object of class '<em>Netex Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Netex Mode</em>'.
	 * @generated
	 */
	NetexMode createNetexMode();

	/**
	 * Returns a new object of class '<em>Point Sequence Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point Sequence Structure</em>'.
	 * @generated
	 */
	PointSequenceStructure createPointSequenceStructure();

	/**
	 * Returns a new object of class '<em>Point Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point Structure</em>'.
	 * @generated
	 */
	PointStructure createPointStructure();

	/**
	 * Returns a new object of class '<em>Point Type Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point Type Structure</em>'.
	 * @generated
	 */
	PointTypeStructure createPointTypeStructure();

	/**
	 * Returns a new object of class '<em>Service Identification Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Identification Structure</em>'.
	 * @generated
	 */
	ServiceIdentificationStructure createServiceIdentificationStructure();

	/**
	 * Returns a new object of class '<em>Service Identification With State List Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Identification With State List Structure</em>'.
	 * @generated
	 */
	ServiceIdentificationWithStateListStructure createServiceIdentificationWithStateListStructure();

	/**
	 * Returns a new object of class '<em>Service Identification With State Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Identification With State Structure</em>'.
	 * @generated
	 */
	ServiceIdentificationWithStateStructure createServiceIdentificationWithStateStructure();

	/**
	 * Returns a new object of class '<em>Service Information List Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Information List Structure</em>'.
	 * @generated
	 */
	ServiceInformationListStructure createServiceInformationListStructure();

	/**
	 * Returns a new object of class '<em>Service Information Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Information Structure</em>'.
	 * @generated
	 */
	ServiceInformationStructure createServiceInformationStructure();

	/**
	 * Returns a new object of class '<em>Service Specification Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Specification Structure</em>'.
	 * @generated
	 */
	ServiceSpecificationStructure createServiceSpecificationStructure();

	/**
	 * Returns a new object of class '<em>Service Specification With State List Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Specification With State List Structure</em>'.
	 * @generated
	 */
	ServiceSpecificationWithStateListStructure createServiceSpecificationWithStateListStructure();

	/**
	 * Returns a new object of class '<em>Service Specification With State Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Specification With State Structure</em>'.
	 * @generated
	 */
	ServiceSpecificationWithStateStructure createServiceSpecificationWithStateStructure();

	/**
	 * Returns a new object of class '<em>Service Start List Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Start List Structure</em>'.
	 * @generated
	 */
	ServiceStartListStructure createServiceStartListStructure();

	/**
	 * Returns a new object of class '<em>Service Start Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Start Structure</em>'.
	 * @generated
	 */
	ServiceStartStructure createServiceStartStructure();

	/**
	 * Returns a new object of class '<em>Short Trip Stop List Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Short Trip Stop List Structure</em>'.
	 * @generated
	 */
	ShortTripStopListStructure createShortTripStopListStructure();

	/**
	 * Returns a new object of class '<em>Short Trip Stop Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Short Trip Stop Structure</em>'.
	 * @generated
	 */
	ShortTripStopStructure createShortTripStopStructure();

	/**
	 * Returns a new object of class '<em>Specific Point Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specific Point Structure</em>'.
	 * @generated
	 */
	SpecificPointStructure createSpecificPointStructure();

	/**
	 * Returns a new object of class '<em>Stop Information Request Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stop Information Request Structure</em>'.
	 * @generated
	 */
	StopInformationRequestStructure createStopInformationRequestStructure();

	/**
	 * Returns a new object of class '<em>Stop Information Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stop Information Structure</em>'.
	 * @generated
	 */
	StopInformationStructure createStopInformationStructure();

	/**
	 * Returns a new object of class '<em>Stop Point Tariff Information Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stop Point Tariff Information Structure</em>'.
	 * @generated
	 */
	StopPointTariffInformationStructure createStopPointTariffInformationStructure();

	/**
	 * Returns a new object of class '<em>Stop Sequence Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stop Sequence Structure</em>'.
	 * @generated
	 */
	StopSequenceStructure createStopSequenceStructure();

	/**
	 * Returns a new object of class '<em>Subscribe Request Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subscribe Request Structure</em>'.
	 * @generated
	 */
	SubscribeRequestStructure createSubscribeRequestStructure();

	/**
	 * Returns a new object of class '<em>Subscribe Response Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subscribe Response Structure</em>'.
	 * @generated
	 */
	SubscribeResponseStructure createSubscribeResponseStructure();

	/**
	 * Returns a new object of class '<em>Timing Point Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timing Point Structure</em>'.
	 * @generated
	 */
	TimingPointStructure createTimingPointStructure();

	/**
	 * Returns a new object of class '<em>Trip Information Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trip Information Structure</em>'.
	 * @generated
	 */
	TripInformationStructure createTripInformationStructure();

	/**
	 * Returns a new object of class '<em>Trip Sequence Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trip Sequence Structure</em>'.
	 * @generated
	 */
	TripSequenceStructure createTripSequenceStructure();

	/**
	 * Returns a new object of class '<em>TSP Point Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TSP Point Structure</em>'.
	 * @generated
	 */
	TSPPointStructure createTSPPointStructure();

	/**
	 * Returns a new object of class '<em>Unsubscribe Request Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unsubscribe Request Structure</em>'.
	 * @generated
	 */
	UnsubscribeRequestStructure createUnsubscribeRequestStructure();

	/**
	 * Returns a new object of class '<em>Unsubscribe Response Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unsubscribe Response Structure</em>'.
	 * @generated
	 */
	UnsubscribeResponseStructure createUnsubscribeResponseStructure();

	/**
	 * Returns a new object of class '<em>Vehicle Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vehicle Structure</em>'.
	 * @generated
	 */
	VehicleStructure createVehicleStructure();

	/**
	 * Returns a new object of class '<em>Via Point Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Via Point Structure</em>'.
	 * @generated
	 */
	ViaPointStructure createViaPointStructure();

	/**
	 * Returns a new object of class '<em>Zone Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zone Type</em>'.
	 * @generated
	 */
	ZoneType createZoneType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IbisCommonPackage getIbisCommonPackage();

} //IbisCommonFactory
