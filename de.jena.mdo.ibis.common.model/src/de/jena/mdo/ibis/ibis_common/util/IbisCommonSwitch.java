/**
 */
package de.jena.mdo.ibis.ibis_common.util;

import de.jena.mdo.ibis.ibis_common.*;

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
 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage
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
			case IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT: {
				AdditionalAnnouncement additionalAnnouncement = (AdditionalAnnouncement)theEObject;
				T result = caseAdditionalAnnouncement(additionalAnnouncement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.ANNOUNCEMENT: {
				Announcement announcement = (Announcement)theEObject;
				T result = caseAnnouncement(announcement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.BAY_AREA: {
				BayArea bayArea = (BayArea)theEObject;
				T result = caseBayArea(bayArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.BEACON_POINT: {
				BeaconPoint beaconPoint = (BeaconPoint)theEObject;
				T result = caseBeaconPoint(beaconPoint);
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
			case IbisCommonPackage.CONNECTION: {
				Connection connection = (Connection)theEObject;
				T result = caseConnection(connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.DATA_ACCEPTED_RESPONSE_DATA: {
				DataAcceptedResponseData dataAcceptedResponseData = (DataAcceptedResponseData)theEObject;
				T result = caseDataAcceptedResponseData(dataAcceptedResponseData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.DATA_ACCEPTED_RESPONSE: {
				DataAcceptedResponse dataAcceptedResponse = (DataAcceptedResponse)theEObject;
				T result = caseDataAcceptedResponse(dataAcceptedResponse);
				if (result == null) result = caseGeneralResponse(dataAcceptedResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.DATA_VERSION_LIST: {
				DataVersionList dataVersionList = (DataVersionList)theEObject;
				T result = caseDataVersionList(dataVersionList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.DATA_VERSION: {
				DataVersion dataVersion = (DataVersion)theEObject;
				T result = caseDataVersion(dataVersion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.DEGREE_TYPE: {
				DegreeType degreeType = (DegreeType)theEObject;
				T result = caseDegreeType(degreeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.DESTINATION: {
				Destination destination = (Destination)theEObject;
				T result = caseDestination(destination);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.DEVICE_INFORMATION: {
				DeviceInformation deviceInformation = (DeviceInformation)theEObject;
				T result = caseDeviceInformation(deviceInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.DEVICE_SPECIFICATION_LIST: {
				DeviceSpecificationList deviceSpecificationList = (DeviceSpecificationList)theEObject;
				T result = caseDeviceSpecificationList(deviceSpecificationList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.DEVICE_SPECIFICATION: {
				DeviceSpecification deviceSpecification = (DeviceSpecification)theEObject;
				T result = caseDeviceSpecification(deviceSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.DEVICE_SPECIFICATION_WITH_STATE_LIST: {
				DeviceSpecificationWithStateList deviceSpecificationWithStateList = (DeviceSpecificationWithStateList)theEObject;
				T result = caseDeviceSpecificationWithStateList(deviceSpecificationWithStateList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.DEVICE_SPECIFICATION_WITH_STATE: {
				DeviceSpecificationWithState deviceSpecificationWithState = (DeviceSpecificationWithState)theEObject;
				T result = caseDeviceSpecificationWithState(deviceSpecificationWithState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.DISPLAY_CONTENT: {
				DisplayContent displayContent = (DisplayContent)theEObject;
				T result = caseDisplayContent(displayContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.DOOR_COUNTING_LIST: {
				DoorCountingList doorCountingList = (DoorCountingList)theEObject;
				T result = caseDoorCountingList(doorCountingList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.DOOR_COUNTING: {
				DoorCounting doorCounting = (DoorCounting)theEObject;
				T result = caseDoorCounting(doorCounting);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.DOOR_INFORMATION: {
				DoorInformation doorInformation = (DoorInformation)theEObject;
				T result = caseDoorInformation(doorInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.DOOR_OPEN_STATE: {
				DoorOpenState doorOpenState = (DoorOpenState)theEObject;
				T result = caseDoorOpenState(doorOpenState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.DOOR_OPERATION_STATE: {
				DoorOperationState doorOperationState = (DoorOperationState)theEObject;
				T result = caseDoorOperationState(doorOperationState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.DOOR_STATE: {
				DoorState doorState = (DoorState)theEObject;
				T result = caseDoorState(doorState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.FARE_ZONE_INFORMATION: {
				FareZoneInformation fareZoneInformation = (FareZoneInformation)theEObject;
				T result = caseFareZoneInformation(fareZoneInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.GLOBAL_CARD_STATUS: {
				GlobalCardStatus globalCardStatus = (GlobalCardStatus)theEObject;
				T result = caseGlobalCardStatus(globalCardStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.GNSS_COORDINATE: {
				GNSSCoordinate gnssCoordinate = (GNSSCoordinate)theEObject;
				T result = caseGNSSCoordinate(gnssCoordinate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.GNSS_POINT: {
				GNSSPoint gnssPoint = (GNSSPoint)theEObject;
				T result = caseGNSSPoint(gnssPoint);
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
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION: {
				JourneyStopInformation journeyStopInformation = (JourneyStopInformation)theEObject;
				T result = caseJourneyStopInformation(journeyStopInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.LINE_INFORMATION: {
				LineInformation lineInformation = (LineInformation)theEObject;
				T result = caseLineInformation(lineInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.LOG_MESSAGE: {
				LogMessage logMessage = (LogMessage)theEObject;
				T result = caseLogMessage(logMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.MESSAGE: {
				Message message = (Message)theEObject;
				T result = caseMessage(message);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.NETEX_MODE: {
				NetexMode netexMode = (NetexMode)theEObject;
				T result = caseNetexMode(netexMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.POINT_SEQUENCE: {
				PointSequence pointSequence = (PointSequence)theEObject;
				T result = casePointSequence(pointSequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.POINT: {
				Point point = (Point)theEObject;
				T result = casePoint(point);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.POINT_TYPE: {
				PointType pointType = (PointType)theEObject;
				T result = casePointType(pointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.SERVICE_IDENTIFICATION: {
				ServiceIdentification serviceIdentification = (ServiceIdentification)theEObject;
				T result = caseServiceIdentification(serviceIdentification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.SERVICE_IDENTIFICATION_WITH_STATE_LIST: {
				ServiceIdentificationWithStateList serviceIdentificationWithStateList = (ServiceIdentificationWithStateList)theEObject;
				T result = caseServiceIdentificationWithStateList(serviceIdentificationWithStateList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.SERVICE_IDENTIFICATION_WITH_STATE: {
				ServiceIdentificationWithState serviceIdentificationWithState = (ServiceIdentificationWithState)theEObject;
				T result = caseServiceIdentificationWithState(serviceIdentificationWithState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.SERVICE_INFORMATION_LIST: {
				ServiceInformationList serviceInformationList = (ServiceInformationList)theEObject;
				T result = caseServiceInformationList(serviceInformationList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.SERVICE_INFORMATION: {
				ServiceInformation serviceInformation = (ServiceInformation)theEObject;
				T result = caseServiceInformation(serviceInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.SERVICE_SPECIFICATION: {
				ServiceSpecification serviceSpecification = (ServiceSpecification)theEObject;
				T result = caseServiceSpecification(serviceSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.SERVICE_SPECIFICATION_WITH_STATE_LIST: {
				ServiceSpecificationWithStateList serviceSpecificationWithStateList = (ServiceSpecificationWithStateList)theEObject;
				T result = caseServiceSpecificationWithStateList(serviceSpecificationWithStateList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.SERVICE_SPECIFICATION_WITH_STATE: {
				ServiceSpecificationWithState serviceSpecificationWithState = (ServiceSpecificationWithState)theEObject;
				T result = caseServiceSpecificationWithState(serviceSpecificationWithState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.SERVICE_START_LIST: {
				ServiceStartList serviceStartList = (ServiceStartList)theEObject;
				T result = caseServiceStartList(serviceStartList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.SERVICE_START: {
				ServiceStart serviceStart = (ServiceStart)theEObject;
				T result = caseServiceStart(serviceStart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.SHORT_TRIP_STOP_LIST: {
				ShortTripStopList shortTripStopList = (ShortTripStopList)theEObject;
				T result = caseShortTripStopList(shortTripStopList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.SHORT_TRIP_STOP: {
				ShortTripStop shortTripStop = (ShortTripStop)theEObject;
				T result = caseShortTripStop(shortTripStop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.SPECIFIC_POINT: {
				SpecificPoint specificPoint = (SpecificPoint)theEObject;
				T result = caseSpecificPoint(specificPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.STOP_INFORMATION_REQUEST: {
				StopInformationRequest stopInformationRequest = (StopInformationRequest)theEObject;
				T result = caseStopInformationRequest(stopInformationRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.STOP_INFORMATION: {
				StopInformation stopInformation = (StopInformation)theEObject;
				T result = caseStopInformation(stopInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.STOP_POINT_TARIFF_INFORMATION: {
				StopPointTariffInformation stopPointTariffInformation = (StopPointTariffInformation)theEObject;
				T result = caseStopPointTariffInformation(stopPointTariffInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.STOP_SEQUENCE: {
				StopSequence stopSequence = (StopSequence)theEObject;
				T result = caseStopSequence(stopSequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.SUBSCRIBE_REQUEST: {
				SubscribeRequest subscribeRequest = (SubscribeRequest)theEObject;
				T result = caseSubscribeRequest(subscribeRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.SUBSCRIBE_RESPONSE: {
				SubscribeResponse subscribeResponse = (SubscribeResponse)theEObject;
				T result = caseSubscribeResponse(subscribeResponse);
				if (result == null) result = caseGeneralResponse(subscribeResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.TIMING_POINT: {
				TimingPoint timingPoint = (TimingPoint)theEObject;
				T result = caseTimingPoint(timingPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.TRIP_INFORMATION: {
				TripInformation tripInformation = (TripInformation)theEObject;
				T result = caseTripInformation(tripInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.TRIP_SEQUENCE: {
				TripSequence tripSequence = (TripSequence)theEObject;
				T result = caseTripSequence(tripSequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.TSP_POINT: {
				TSPPoint tspPoint = (TSPPoint)theEObject;
				T result = caseTSPPoint(tspPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.UNSUBSCRIBE_REQUEST: {
				UnsubscribeRequest unsubscribeRequest = (UnsubscribeRequest)theEObject;
				T result = caseUnsubscribeRequest(unsubscribeRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.UNSUBSCRIBE_RESPONSE: {
				UnsubscribeResponse unsubscribeResponse = (UnsubscribeResponse)theEObject;
				T result = caseUnsubscribeResponse(unsubscribeResponse);
				if (result == null) result = caseGeneralResponse(unsubscribeResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.VEHICLE: {
				Vehicle vehicle = (Vehicle)theEObject;
				T result = caseVehicle(vehicle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.VIA_POINT: {
				ViaPoint viaPoint = (ViaPoint)theEObject;
				T result = caseViaPoint(viaPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.ZONE_TYPE: {
				ZoneType zoneType = (ZoneType)theEObject;
				T result = caseZoneType(zoneType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisCommonPackage.GENERAL_RESPONSE: {
				GeneralResponse generalResponse = (GeneralResponse)theEObject;
				T result = caseGeneralResponse(generalResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Additional Announcement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additional Announcement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionalAnnouncement(AdditionalAnnouncement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Announcement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Announcement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnouncement(Announcement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bay Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bay Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBayArea(BayArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Beacon Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Beacon Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeaconPoint(BeaconPoint object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection(Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Accepted Response Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Accepted Response Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataAcceptedResponseData(DataAcceptedResponseData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Accepted Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Accepted Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataAcceptedResponse(DataAcceptedResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Version List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Version List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataVersionList(DataVersionList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataVersion(DataVersion object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Destination</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Destination</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDestination(Destination object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceInformation(DeviceInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Specification List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Specification List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceSpecificationList(DeviceSpecificationList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceSpecification(DeviceSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Specification With State List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Specification With State List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceSpecificationWithStateList(DeviceSpecificationWithStateList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Specification With State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Specification With State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceSpecificationWithState(DeviceSpecificationWithState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Display Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Display Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisplayContent(DisplayContent object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Door Counting List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Door Counting List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoorCountingList(DoorCountingList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Door Counting</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Door Counting</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoorCounting(DoorCounting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Door Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Door Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoorInformation(DoorInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Door Open State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Door Open State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoorOpenState(DoorOpenState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Door Operation State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Door Operation State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoorOperationState(DoorOperationState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Door State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Door State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoorState(DoorState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fare Zone Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fare Zone Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFareZoneInformation(FareZoneInformation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>GNSS Coordinate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GNSS Coordinate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGNSSCoordinate(GNSSCoordinate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GNSS Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GNSS Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGNSSPoint(GNSSPoint object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Journey Stop Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Journey Stop Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJourneyStopInformation(JourneyStopInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineInformation(LineInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Log Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Log Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogMessage(LogMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessage(Message object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Point Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointSequence(PointSequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePoint(Point object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointType(PointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Identification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Identification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceIdentification(ServiceIdentification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Identification With State List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Identification With State List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceIdentificationWithStateList(ServiceIdentificationWithStateList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Identification With State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Identification With State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceIdentificationWithState(ServiceIdentificationWithState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Information List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Information List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceInformationList(ServiceInformationList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceInformation(ServiceInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceSpecification(ServiceSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Specification With State List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Specification With State List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceSpecificationWithStateList(ServiceSpecificationWithStateList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Specification With State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Specification With State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceSpecificationWithState(ServiceSpecificationWithState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Start List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Start List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceStartList(ServiceStartList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Start</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceStart(ServiceStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Short Trip Stop List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Short Trip Stop List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShortTripStopList(ShortTripStopList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Short Trip Stop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Short Trip Stop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShortTripStop(ShortTripStop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecificPoint(SpecificPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop Information Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop Information Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStopInformationRequest(StopInformationRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStopInformation(StopInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop Point Tariff Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop Point Tariff Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStopPointTariffInformation(StopPointTariffInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStopSequence(StopSequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subscribe Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subscribe Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubscribeRequest(SubscribeRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subscribe Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subscribe Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubscribeResponse(SubscribeResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timing Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timing Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimingPoint(TimingPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trip Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trip Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTripInformation(TripInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trip Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trip Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTripSequence(TripSequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TSP Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TSP Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTSPPoint(TSPPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unsubscribe Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unsubscribe Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnsubscribeRequest(UnsubscribeRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unsubscribe Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unsubscribe Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnsubscribeResponse(UnsubscribeResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vehicle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vehicle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVehicle(Vehicle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Via Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Via Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViaPoint(ViaPoint object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>General Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralResponse(GeneralResponse object) {
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
