/**
 */
package de.jena.mdo.ibis.common.util;

import de.jena.mdo.ibis.common.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.jena.mdo.ibis.common.IbisCommonPackage
 * @generated
 */
public class IbisCommonSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IbisCommonPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IbisCommonSwitch() {
		if (modelPackage == null) {
			modelPackage = IbisCommonPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT_STRUCTURE: {
				AdditionalAnnouncementStructure additionalAnnouncementStructure = (AdditionalAnnouncementStructure)theEObject;
				T result = caseAdditionalAnnouncementStructure(additionalAnnouncementStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.ANNOUNCEMENT_STRUCTURE: {
				AnnouncementStructure announcementStructure = (AnnouncementStructure)theEObject;
				T result = caseAnnouncementStructure(announcementStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.BAY_AREA_STRUCTURE: {
				BayAreaStructure bayAreaStructure = (BayAreaStructure)theEObject;
				T result = caseBayAreaStructure(bayAreaStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.BEACON_POINT_STRUCTURE: {
				BeaconPointStructure beaconPointStructure = (BeaconPointStructure)theEObject;
				T result = caseBeaconPointStructure(beaconPointStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.CARD_APPL_INFORMATIONS: {
				CardApplInformations cardApplInformations = (CardApplInformations)theEObject;
				T result = caseCardApplInformations(cardApplInformations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.CARD_TICKET_DATA: {
				CardTicketData cardTicketData = (CardTicketData)theEObject;
				T result = caseCardTicketData(cardTicketData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.CARD_TYPE: {
				CardType cardType = (CardType)theEObject;
				T result = caseCardType(cardType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.CONNECTION_STRUCTURE: {
				ConnectionStructure connectionStructure = (ConnectionStructure)theEObject;
				T result = caseConnectionStructure(connectionStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.DATA_ACCEPTED_RESPONSE_DATA_STRUCTURE: {
				DataAcceptedResponseDataStructure dataAcceptedResponseDataStructure = (DataAcceptedResponseDataStructure)theEObject;
				T result = caseDataAcceptedResponseDataStructure(dataAcceptedResponseDataStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.DATA_ACCEPTED_RESPONSE_STRUCTURE: {
				DataAcceptedResponseStructure dataAcceptedResponseStructure = (DataAcceptedResponseStructure)theEObject;
				T result = caseDataAcceptedResponseStructure(dataAcceptedResponseStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.DATA_VERSION_LIST_STRUCTURE: {
				DataVersionListStructure dataVersionListStructure = (DataVersionListStructure)theEObject;
				T result = caseDataVersionListStructure(dataVersionListStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.DATA_VERSION_STRUCTURE: {
				DataVersionStructure dataVersionStructure = (DataVersionStructure)theEObject;
				T result = caseDataVersionStructure(dataVersionStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.DEGREE_TYPE: {
				DegreeType degreeType = (DegreeType)theEObject;
				T result = caseDegreeType(degreeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.DESTINATION_STRUCTURE: {
				DestinationStructure destinationStructure = (DestinationStructure)theEObject;
				T result = caseDestinationStructure(destinationStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.DEVICE_INFORMATION_STRUCTURE: {
				DeviceInformationStructure deviceInformationStructure = (DeviceInformationStructure)theEObject;
				T result = caseDeviceInformationStructure(deviceInformationStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.DEVICE_SPECIFICATION_LIST_STRUCTURE: {
				DeviceSpecificationListStructure deviceSpecificationListStructure = (DeviceSpecificationListStructure)theEObject;
				T result = caseDeviceSpecificationListStructure(deviceSpecificationListStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.DEVICE_SPECIFICATION_STRUCTURE: {
				DeviceSpecificationStructure deviceSpecificationStructure = (DeviceSpecificationStructure)theEObject;
				T result = caseDeviceSpecificationStructure(deviceSpecificationStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.DEVICE_SPECIFICATION_WITH_STATE_LIST_STRUCTURE: {
				DeviceSpecificationWithStateListStructure deviceSpecificationWithStateListStructure = (DeviceSpecificationWithStateListStructure)theEObject;
				T result = caseDeviceSpecificationWithStateListStructure(deviceSpecificationWithStateListStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.DEVICE_SPECIFICATION_WITH_STATE_STRUCTURE: {
				DeviceSpecificationWithStateStructure deviceSpecificationWithStateStructure = (DeviceSpecificationWithStateStructure)theEObject;
				T result = caseDeviceSpecificationWithStateStructure(deviceSpecificationWithStateStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE: {
				DisplayContentStructure displayContentStructure = (DisplayContentStructure)theEObject;
				T result = caseDisplayContentStructure(displayContentStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.DOOR_COUNTING_LIST_STRUCTURE: {
				DoorCountingListStructure doorCountingListStructure = (DoorCountingListStructure)theEObject;
				T result = caseDoorCountingListStructure(doorCountingListStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.DOOR_COUNTING_STRUCTURE: {
				DoorCountingStructure doorCountingStructure = (DoorCountingStructure)theEObject;
				T result = caseDoorCountingStructure(doorCountingStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.DOOR_INFORMATION_STRUCTURE: {
				DoorInformationStructure doorInformationStructure = (DoorInformationStructure)theEObject;
				T result = caseDoorInformationStructure(doorInformationStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.DOOR_OPEN_STATE_STRUCTURE: {
				DoorOpenStateStructure doorOpenStateStructure = (DoorOpenStateStructure)theEObject;
				T result = caseDoorOpenStateStructure(doorOpenStateStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.DOOR_OPERATION_STATE_STRUCTURE: {
				DoorOperationStateStructure doorOperationStateStructure = (DoorOperationStateStructure)theEObject;
				T result = caseDoorOperationStateStructure(doorOperationStateStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.DOOR_STATE_STRUCTURE: {
				DoorStateStructure doorStateStructure = (DoorStateStructure)theEObject;
				T result = caseDoorStateStructure(doorStateStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.FARE_ZONE_INFORMATION_STRUCTURE: {
				FareZoneInformationStructure fareZoneInformationStructure = (FareZoneInformationStructure)theEObject;
				T result = caseFareZoneInformationStructure(fareZoneInformationStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.GLOBAL_CARD_STATUS: {
				GlobalCardStatus globalCardStatus = (GlobalCardStatus)theEObject;
				T result = caseGlobalCardStatus(globalCardStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.GNSS_COORDINATE_STRUCTURE: {
				GNSSCoordinateStructure gnssCoordinateStructure = (GNSSCoordinateStructure)theEObject;
				T result = caseGNSSCoordinateStructure(gnssCoordinateStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.GNSS_POINT_STRUCTURE: {
				GNSSPointStructure gnssPointStructure = (GNSSPointStructure)theEObject;
				T result = caseGNSSPointStructure(gnssPointStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.IBISIP_ANY_URI: {
				IBISIPAnyURI ibisipAnyURI = (IBISIPAnyURI)theEObject;
				T result = caseIBISIPAnyURI(ibisipAnyURI);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.IBISIP_BOOLEAN: {
				IBISIPBoolean ibisipBoolean = (IBISIPBoolean)theEObject;
				T result = caseIBISIPBoolean(ibisipBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.IBISIP_BYTE: {
				IBISIPByte ibisipByte = (IBISIPByte)theEObject;
				T result = caseIBISIPByte(ibisipByte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.IBISIP_DATE: {
				IBISIPDate ibisipDate = (IBISIPDate)theEObject;
				T result = caseIBISIPDate(ibisipDate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.IBISIP_DATE_TIME: {
				IBISIPDateTime ibisipDateTime = (IBISIPDateTime)theEObject;
				T result = caseIBISIPDateTime(ibisipDateTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.IBISIP_DOUBLE: {
				IBISIPDouble ibisipDouble = (IBISIPDouble)theEObject;
				T result = caseIBISIPDouble(ibisipDouble);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.IBISIP_DURATION: {
				IBISIPDuration ibisipDuration = (IBISIPDuration)theEObject;
				T result = caseIBISIPDuration(ibisipDuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.IBISIP_INT: {
				IBISIPInt ibisipInt = (IBISIPInt)theEObject;
				T result = caseIBISIPInt(ibisipInt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.IBISIP_LANGUAGE: {
				IBISIPLanguage ibisipLanguage = (IBISIPLanguage)theEObject;
				T result = caseIBISIPLanguage(ibisipLanguage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.IBISIPNMTOKEN: {
				IBISIPNMTOKEN ibisipnmtoken = (IBISIPNMTOKEN)theEObject;
				T result = caseIBISIPNMTOKEN(ibisipnmtoken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.IBISIP_NON_NEGATIVE_INTEGER: {
				IBISIPNonNegativeInteger ibisipNonNegativeInteger = (IBISIPNonNegativeInteger)theEObject;
				T result = caseIBISIPNonNegativeInteger(ibisipNonNegativeInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.IBISIP_NORMALIZED_STRING: {
				IBISIPNormalizedString ibisipNormalizedString = (IBISIPNormalizedString)theEObject;
				T result = caseIBISIPNormalizedString(ibisipNormalizedString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.IBISIP_STRING: {
				IBISIPString ibisipString = (IBISIPString)theEObject;
				T result = caseIBISIPString(ibisipString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.IBISIP_TIME: {
				IBISIPTime ibisipTime = (IBISIPTime)theEObject;
				T result = caseIBISIPTime(ibisipTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.IBISIP_UNSIGNED_INT: {
				IBISIPUnsignedInt ibisipUnsignedInt = (IBISIPUnsignedInt)theEObject;
				T result = caseIBISIPUnsignedInt(ibisipUnsignedInt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.IBISIP_UNSIGNED_LONG: {
				IBISIPUnsignedLong ibisipUnsignedLong = (IBISIPUnsignedLong)theEObject;
				T result = caseIBISIPUnsignedLong(ibisipUnsignedLong);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.INTERNATIONAL_TEXT_TYPE: {
				InternationalTextType internationalTextType = (InternationalTextType)theEObject;
				T result = caseInternationalTextType(internationalTextType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE: {
				JourneyStopInformationStructure journeyStopInformationStructure = (JourneyStopInformationStructure)theEObject;
				T result = caseJourneyStopInformationStructure(journeyStopInformationStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.LINE_INFORMATION_STRUCTURE: {
				LineInformationStructure lineInformationStructure = (LineInformationStructure)theEObject;
				T result = caseLineInformationStructure(lineInformationStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.LOG_MESSAGE_STRUCTURE: {
				LogMessageStructure logMessageStructure = (LogMessageStructure)theEObject;
				T result = caseLogMessageStructure(logMessageStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.MESSAGE_STRUCTURE: {
				MessageStructure messageStructure = (MessageStructure)theEObject;
				T result = caseMessageStructure(messageStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.NETEX_MODE: {
				NetexMode netexMode = (NetexMode)theEObject;
				T result = caseNetexMode(netexMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.POINT_SEQUENCE_STRUCTURE: {
				PointSequenceStructure pointSequenceStructure = (PointSequenceStructure)theEObject;
				T result = casePointSequenceStructure(pointSequenceStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.POINT_STRUCTURE: {
				PointStructure pointStructure = (PointStructure)theEObject;
				T result = casePointStructure(pointStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.POINT_TYPE_STRUCTURE: {
				PointTypeStructure pointTypeStructure = (PointTypeStructure)theEObject;
				T result = casePointTypeStructure(pointTypeStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.SERVICE_IDENTIFICATION_STRUCTURE: {
				ServiceIdentificationStructure serviceIdentificationStructure = (ServiceIdentificationStructure)theEObject;
				T result = caseServiceIdentificationStructure(serviceIdentificationStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.SERVICE_IDENTIFICATION_WITH_STATE_LIST_STRUCTURE: {
				ServiceIdentificationWithStateListStructure serviceIdentificationWithStateListStructure = (ServiceIdentificationWithStateListStructure)theEObject;
				T result = caseServiceIdentificationWithStateListStructure(serviceIdentificationWithStateListStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.SERVICE_IDENTIFICATION_WITH_STATE_STRUCTURE: {
				ServiceIdentificationWithStateStructure serviceIdentificationWithStateStructure = (ServiceIdentificationWithStateStructure)theEObject;
				T result = caseServiceIdentificationWithStateStructure(serviceIdentificationWithStateStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.SERVICE_INFORMATION_LIST_STRUCTURE: {
				ServiceInformationListStructure serviceInformationListStructure = (ServiceInformationListStructure)theEObject;
				T result = caseServiceInformationListStructure(serviceInformationListStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.SERVICE_INFORMATION_STRUCTURE: {
				ServiceInformationStructure serviceInformationStructure = (ServiceInformationStructure)theEObject;
				T result = caseServiceInformationStructure(serviceInformationStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.SERVICE_SPECIFICATION_STRUCTURE: {
				ServiceSpecificationStructure serviceSpecificationStructure = (ServiceSpecificationStructure)theEObject;
				T result = caseServiceSpecificationStructure(serviceSpecificationStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.SERVICE_SPECIFICATION_WITH_STATE_LIST_STRUCTURE: {
				ServiceSpecificationWithStateListStructure serviceSpecificationWithStateListStructure = (ServiceSpecificationWithStateListStructure)theEObject;
				T result = caseServiceSpecificationWithStateListStructure(serviceSpecificationWithStateListStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.SERVICE_SPECIFICATION_WITH_STATE_STRUCTURE: {
				ServiceSpecificationWithStateStructure serviceSpecificationWithStateStructure = (ServiceSpecificationWithStateStructure)theEObject;
				T result = caseServiceSpecificationWithStateStructure(serviceSpecificationWithStateStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.SERVICE_START_LIST_STRUCTURE: {
				ServiceStartListStructure serviceStartListStructure = (ServiceStartListStructure)theEObject;
				T result = caseServiceStartListStructure(serviceStartListStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.SERVICE_START_STRUCTURE: {
				ServiceStartStructure serviceStartStructure = (ServiceStartStructure)theEObject;
				T result = caseServiceStartStructure(serviceStartStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.SHORT_TRIP_STOP_LIST_STRUCTURE: {
				ShortTripStopListStructure shortTripStopListStructure = (ShortTripStopListStructure)theEObject;
				T result = caseShortTripStopListStructure(shortTripStopListStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.SHORT_TRIP_STOP_STRUCTURE: {
				ShortTripStopStructure shortTripStopStructure = (ShortTripStopStructure)theEObject;
				T result = caseShortTripStopStructure(shortTripStopStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.SPECIFIC_POINT_STRUCTURE: {
				SpecificPointStructure specificPointStructure = (SpecificPointStructure)theEObject;
				T result = caseSpecificPointStructure(specificPointStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.STOP_INFORMATION_REQUEST_STRUCTURE: {
				StopInformationRequestStructure stopInformationRequestStructure = (StopInformationRequestStructure)theEObject;
				T result = caseStopInformationRequestStructure(stopInformationRequestStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE: {
				StopInformationStructure stopInformationStructure = (StopInformationStructure)theEObject;
				T result = caseStopInformationStructure(stopInformationStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.STOP_POINT_TARIFF_INFORMATION_STRUCTURE: {
				StopPointTariffInformationStructure stopPointTariffInformationStructure = (StopPointTariffInformationStructure)theEObject;
				T result = caseStopPointTariffInformationStructure(stopPointTariffInformationStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.STOP_SEQUENCE_STRUCTURE: {
				StopSequenceStructure stopSequenceStructure = (StopSequenceStructure)theEObject;
				T result = caseStopSequenceStructure(stopSequenceStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.SUBSCRIBE_REQUEST_STRUCTURE: {
				SubscribeRequestStructure subscribeRequestStructure = (SubscribeRequestStructure)theEObject;
				T result = caseSubscribeRequestStructure(subscribeRequestStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.SUBSCRIBE_RESPONSE_STRUCTURE: {
				SubscribeResponseStructure subscribeResponseStructure = (SubscribeResponseStructure)theEObject;
				T result = caseSubscribeResponseStructure(subscribeResponseStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.TIMING_POINT_STRUCTURE: {
				TimingPointStructure timingPointStructure = (TimingPointStructure)theEObject;
				T result = caseTimingPointStructure(timingPointStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE: {
				TripInformationStructure tripInformationStructure = (TripInformationStructure)theEObject;
				T result = caseTripInformationStructure(tripInformationStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE: {
				TripSequenceStructure tripSequenceStructure = (TripSequenceStructure)theEObject;
				T result = caseTripSequenceStructure(tripSequenceStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.TSP_POINT_STRUCTURE: {
				TSPPointStructure tspPointStructure = (TSPPointStructure)theEObject;
				T result = caseTSPPointStructure(tspPointStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.UNSUBSCRIBE_REQUEST_STRUCTURE: {
				UnsubscribeRequestStructure unsubscribeRequestStructure = (UnsubscribeRequestStructure)theEObject;
				T result = caseUnsubscribeRequestStructure(unsubscribeRequestStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.UNSUBSCRIBE_RESPONSE_STRUCTURE: {
				UnsubscribeResponseStructure unsubscribeResponseStructure = (UnsubscribeResponseStructure)theEObject;
				T result = caseUnsubscribeResponseStructure(unsubscribeResponseStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.VEHICLE_STRUCTURE: {
				VehicleStructure vehicleStructure = (VehicleStructure)theEObject;
				T result = caseVehicleStructure(vehicleStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.VIA_POINT_STRUCTURE: {
				ViaPointStructure viaPointStructure = (ViaPointStructure)theEObject;
				T result = caseViaPointStructure(viaPointStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.ZONE_TYPE: {
				ZoneType zoneType = (ZoneType)theEObject;
				T result = caseZoneType(zoneType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Additional Announcement Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additional Announcement Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionalAnnouncementStructure(AdditionalAnnouncementStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Announcement Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Announcement Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnouncementStructure(AnnouncementStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bay Area Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bay Area Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBayAreaStructure(BayAreaStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Beacon Point Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Beacon Point Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeaconPointStructure(BeaconPointStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Card Appl Informations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Card Appl Informations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardApplInformations(CardApplInformations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Card Ticket Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Card Ticket Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardTicketData(CardTicketData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Card Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Card Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardType(CardType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionStructure(ConnectionStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Accepted Response Data Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Accepted Response Data Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataAcceptedResponseDataStructure(DataAcceptedResponseDataStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Accepted Response Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Accepted Response Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataAcceptedResponseStructure(DataAcceptedResponseStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Version List Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Version List Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataVersionListStructure(DataVersionListStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Version Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Version Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataVersionStructure(DataVersionStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Degree Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Degree Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDegreeType(DegreeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Destination Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Destination Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDestinationStructure(DestinationStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Information Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Information Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceInformationStructure(DeviceInformationStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Specification List Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Specification List Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceSpecificationListStructure(DeviceSpecificationListStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Specification Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Specification Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceSpecificationStructure(DeviceSpecificationStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Specification With State List Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Specification With State List Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceSpecificationWithStateListStructure(DeviceSpecificationWithStateListStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Specification With State Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Specification With State Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceSpecificationWithStateStructure(DeviceSpecificationWithStateStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Display Content Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Display Content Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisplayContentStructure(DisplayContentStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Door Counting List Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Door Counting List Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoorCountingListStructure(DoorCountingListStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Door Counting Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Door Counting Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoorCountingStructure(DoorCountingStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Door Information Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Door Information Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoorInformationStructure(DoorInformationStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Door Open State Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Door Open State Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoorOpenStateStructure(DoorOpenStateStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Door Operation State Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Door Operation State Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoorOperationStateStructure(DoorOperationStateStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Door State Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Door State Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoorStateStructure(DoorStateStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fare Zone Information Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fare Zone Information Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFareZoneInformationStructure(FareZoneInformationStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Card Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Card Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalCardStatus(GlobalCardStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GNSS Coordinate Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GNSS Coordinate Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGNSSCoordinateStructure(GNSSCoordinateStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GNSS Point Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GNSS Point Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGNSSPointStructure(GNSSPointStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IBISIP Any URI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBISIP Any URI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBISIPAnyURI(IBISIPAnyURI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IBISIP Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBISIP Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBISIPBoolean(IBISIPBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IBISIP Byte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBISIP Byte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBISIPByte(IBISIPByte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IBISIP Date</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBISIP Date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBISIPDate(IBISIPDate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IBISIP Date Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBISIP Date Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBISIPDateTime(IBISIPDateTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IBISIP Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBISIP Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBISIPDouble(IBISIPDouble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IBISIP Duration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBISIP Duration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBISIPDuration(IBISIPDuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IBISIP Int</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBISIP Int</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBISIPInt(IBISIPInt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IBISIP Language</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBISIP Language</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBISIPLanguage(IBISIPLanguage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IBISIPNMTOKEN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBISIPNMTOKEN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBISIPNMTOKEN(IBISIPNMTOKEN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IBISIP Non Negative Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBISIP Non Negative Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBISIPNonNegativeInteger(IBISIPNonNegativeInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IBISIP Normalized String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBISIP Normalized String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBISIPNormalizedString(IBISIPNormalizedString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IBISIP String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBISIP String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBISIPString(IBISIPString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IBISIP Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBISIP Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBISIPTime(IBISIPTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IBISIP Unsigned Int</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBISIP Unsigned Int</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBISIPUnsignedInt(IBISIPUnsignedInt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IBISIP Unsigned Long</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBISIP Unsigned Long</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBISIPUnsignedLong(IBISIPUnsignedLong object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>International Text Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>International Text Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternationalTextType(InternationalTextType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Journey Stop Information Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Journey Stop Information Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJourneyStopInformationStructure(JourneyStopInformationStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Information Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Information Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineInformationStructure(LineInformationStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Log Message Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Log Message Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogMessageStructure(LogMessageStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageStructure(MessageStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Netex Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Netex Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetexMode(NetexMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point Sequence Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point Sequence Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointSequenceStructure(PointSequenceStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointStructure(PointStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point Type Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point Type Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointTypeStructure(PointTypeStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Identification Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Identification Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceIdentificationStructure(ServiceIdentificationStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Identification With State List Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Identification With State List Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceIdentificationWithStateListStructure(ServiceIdentificationWithStateListStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Identification With State Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Identification With State Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceIdentificationWithStateStructure(ServiceIdentificationWithStateStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Information List Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Information List Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceInformationListStructure(ServiceInformationListStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Information Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Information Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceInformationStructure(ServiceInformationStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Specification Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Specification Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceSpecificationStructure(ServiceSpecificationStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Specification With State List Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Specification With State List Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceSpecificationWithStateListStructure(ServiceSpecificationWithStateListStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Specification With State Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Specification With State Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceSpecificationWithStateStructure(ServiceSpecificationWithStateStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Start List Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Start List Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceStartListStructure(ServiceStartListStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Start Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Start Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceStartStructure(ServiceStartStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Short Trip Stop List Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Short Trip Stop List Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShortTripStopListStructure(ShortTripStopListStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Short Trip Stop Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Short Trip Stop Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShortTripStopStructure(ShortTripStopStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific Point Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Point Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecificPointStructure(SpecificPointStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop Information Request Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop Information Request Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStopInformationRequestStructure(StopInformationRequestStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop Information Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop Information Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStopInformationStructure(StopInformationStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop Point Tariff Information Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop Point Tariff Information Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStopPointTariffInformationStructure(StopPointTariffInformationStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop Sequence Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop Sequence Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStopSequenceStructure(StopSequenceStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subscribe Request Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subscribe Request Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubscribeRequestStructure(SubscribeRequestStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subscribe Response Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subscribe Response Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubscribeResponseStructure(SubscribeResponseStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timing Point Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timing Point Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimingPointStructure(TimingPointStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trip Information Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trip Information Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTripInformationStructure(TripInformationStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trip Sequence Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trip Sequence Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTripSequenceStructure(TripSequenceStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TSP Point Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TSP Point Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTSPPointStructure(TSPPointStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unsubscribe Request Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unsubscribe Request Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnsubscribeRequestStructure(UnsubscribeRequestStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unsubscribe Response Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unsubscribe Response Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnsubscribeResponseStructure(UnsubscribeResponseStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vehicle Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vehicle Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVehicleStructure(VehicleStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Via Point Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Via Point Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViaPointStructure(ViaPointStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zone Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zone Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZoneType(ZoneType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //IbisCommonSwitch
