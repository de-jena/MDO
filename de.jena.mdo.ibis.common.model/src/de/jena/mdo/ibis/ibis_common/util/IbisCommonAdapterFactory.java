/**
 */
package de.jena.mdo.ibis.ibis_common.util;

import de.jena.mdo.ibis.ibis_common.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage
 * @generated
 */
public class IbisCommonAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IbisCommonPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IbisCommonAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IbisCommonPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IbisCommonSwitch<Adapter> modelSwitch =
		new IbisCommonSwitch<Adapter>() {
			@Override
			public Adapter caseAdditionalAnnouncement(AdditionalAnnouncement object) {
				return createAdditionalAnnouncementAdapter();
			}
			@Override
			public Adapter caseAnnouncement(Announcement object) {
				return createAnnouncementAdapter();
			}
			@Override
			public Adapter caseBayArea(BayArea object) {
				return createBayAreaAdapter();
			}
			@Override
			public Adapter caseBeaconPoint(BeaconPoint object) {
				return createBeaconPointAdapter();
			}
			@Override
			public Adapter caseCardApplInformations(CardApplInformations object) {
				return createCardApplInformationsAdapter();
			}
			@Override
			public Adapter caseCardTicketData(CardTicketData object) {
				return createCardTicketDataAdapter();
			}
			@Override
			public Adapter caseCardType(CardType object) {
				return createCardTypeAdapter();
			}
			@Override
			public Adapter caseConnection(Connection object) {
				return createConnectionAdapter();
			}
			@Override
			public Adapter caseDataAcceptedResponseData(DataAcceptedResponseData object) {
				return createDataAcceptedResponseDataAdapter();
			}
			@Override
			public Adapter caseDataAcceptedResponse(DataAcceptedResponse object) {
				return createDataAcceptedResponseAdapter();
			}
			@Override
			public Adapter caseDataVersionList(DataVersionList object) {
				return createDataVersionListAdapter();
			}
			@Override
			public Adapter caseDataVersion(DataVersion object) {
				return createDataVersionAdapter();
			}
			@Override
			public Adapter caseDegreeType(DegreeType object) {
				return createDegreeTypeAdapter();
			}
			@Override
			public Adapter caseDestination(Destination object) {
				return createDestinationAdapter();
			}
			@Override
			public Adapter caseDeviceInformation(DeviceInformation object) {
				return createDeviceInformationAdapter();
			}
			@Override
			public Adapter caseDeviceSpecificationList(DeviceSpecificationList object) {
				return createDeviceSpecificationListAdapter();
			}
			@Override
			public Adapter caseDeviceSpecification(DeviceSpecification object) {
				return createDeviceSpecificationAdapter();
			}
			@Override
			public Adapter caseDeviceSpecificationWithStateList(DeviceSpecificationWithStateList object) {
				return createDeviceSpecificationWithStateListAdapter();
			}
			@Override
			public Adapter caseDeviceSpecificationWithState(DeviceSpecificationWithState object) {
				return createDeviceSpecificationWithStateAdapter();
			}
			@Override
			public Adapter caseDisplayContent(DisplayContent object) {
				return createDisplayContentAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseDoorCountingList(DoorCountingList object) {
				return createDoorCountingListAdapter();
			}
			@Override
			public Adapter caseDoorCounting(DoorCounting object) {
				return createDoorCountingAdapter();
			}
			@Override
			public Adapter caseDoorInformation(DoorInformation object) {
				return createDoorInformationAdapter();
			}
			@Override
			public Adapter caseDoorOpenState(DoorOpenState object) {
				return createDoorOpenStateAdapter();
			}
			@Override
			public Adapter caseDoorOperationState(DoorOperationState object) {
				return createDoorOperationStateAdapter();
			}
			@Override
			public Adapter caseDoorState(DoorState object) {
				return createDoorStateAdapter();
			}
			@Override
			public Adapter caseFareZoneInformation(FareZoneInformation object) {
				return createFareZoneInformationAdapter();
			}
			@Override
			public Adapter caseGlobalCardStatus(GlobalCardStatus object) {
				return createGlobalCardStatusAdapter();
			}
			@Override
			public Adapter caseGNSSCoordinate(GNSSCoordinate object) {
				return createGNSSCoordinateAdapter();
			}
			@Override
			public Adapter caseGNSSPoint(GNSSPoint object) {
				return createGNSSPointAdapter();
			}
			@Override
			public Adapter caseIBISIPAnyURI(IBISIPAnyURI object) {
				return createIBISIPAnyURIAdapter();
			}
			@Override
			public Adapter caseIBISIPBoolean(IBISIPBoolean object) {
				return createIBISIPBooleanAdapter();
			}
			@Override
			public Adapter caseIBISIPByte(IBISIPByte object) {
				return createIBISIPByteAdapter();
			}
			@Override
			public Adapter caseIBISIPDate(IBISIPDate object) {
				return createIBISIPDateAdapter();
			}
			@Override
			public Adapter caseIBISIPDateTime(IBISIPDateTime object) {
				return createIBISIPDateTimeAdapter();
			}
			@Override
			public Adapter caseIBISIPDouble(IBISIPDouble object) {
				return createIBISIPDoubleAdapter();
			}
			@Override
			public Adapter caseIBISIPDuration(IBISIPDuration object) {
				return createIBISIPDurationAdapter();
			}
			@Override
			public Adapter caseIBISIPInt(IBISIPInt object) {
				return createIBISIPIntAdapter();
			}
			@Override
			public Adapter caseIBISIPLanguage(IBISIPLanguage object) {
				return createIBISIPLanguageAdapter();
			}
			@Override
			public Adapter caseIBISIPNMTOKEN(IBISIPNMTOKEN object) {
				return createIBISIPNMTOKENAdapter();
			}
			@Override
			public Adapter caseIBISIPNonNegativeInteger(IBISIPNonNegativeInteger object) {
				return createIBISIPNonNegativeIntegerAdapter();
			}
			@Override
			public Adapter caseIBISIPNormalizedString(IBISIPNormalizedString object) {
				return createIBISIPNormalizedStringAdapter();
			}
			@Override
			public Adapter caseIBISIPString(IBISIPString object) {
				return createIBISIPStringAdapter();
			}
			@Override
			public Adapter caseIBISIPTime(IBISIPTime object) {
				return createIBISIPTimeAdapter();
			}
			@Override
			public Adapter caseIBISIPUnsignedInt(IBISIPUnsignedInt object) {
				return createIBISIPUnsignedIntAdapter();
			}
			@Override
			public Adapter caseIBISIPUnsignedLong(IBISIPUnsignedLong object) {
				return createIBISIPUnsignedLongAdapter();
			}
			@Override
			public Adapter caseInternationalTextType(InternationalTextType object) {
				return createInternationalTextTypeAdapter();
			}
			@Override
			public Adapter caseJourneyStopInformation(JourneyStopInformation object) {
				return createJourneyStopInformationAdapter();
			}
			@Override
			public Adapter caseLineInformation(LineInformation object) {
				return createLineInformationAdapter();
			}
			@Override
			public Adapter caseLogMessage(LogMessage object) {
				return createLogMessageAdapter();
			}
			@Override
			public Adapter caseMessage(Message object) {
				return createMessageAdapter();
			}
			@Override
			public Adapter caseNetexMode(NetexMode object) {
				return createNetexModeAdapter();
			}
			@Override
			public Adapter casePointSequence(PointSequence object) {
				return createPointSequenceAdapter();
			}
			@Override
			public Adapter casePoint(Point object) {
				return createPointAdapter();
			}
			@Override
			public Adapter casePointType(PointType object) {
				return createPointTypeAdapter();
			}
			@Override
			public Adapter caseServiceIdentification(ServiceIdentification object) {
				return createServiceIdentificationAdapter();
			}
			@Override
			public Adapter caseServiceIdentificationWithStateList(ServiceIdentificationWithStateList object) {
				return createServiceIdentificationWithStateListAdapter();
			}
			@Override
			public Adapter caseServiceIdentificationWithState(ServiceIdentificationWithState object) {
				return createServiceIdentificationWithStateAdapter();
			}
			@Override
			public Adapter caseServiceInformationList(ServiceInformationList object) {
				return createServiceInformationListAdapter();
			}
			@Override
			public Adapter caseServiceInformation(ServiceInformation object) {
				return createServiceInformationAdapter();
			}
			@Override
			public Adapter caseServiceSpecification(ServiceSpecification object) {
				return createServiceSpecificationAdapter();
			}
			@Override
			public Adapter caseServiceSpecificationWithStateList(ServiceSpecificationWithStateList object) {
				return createServiceSpecificationWithStateListAdapter();
			}
			@Override
			public Adapter caseServiceSpecificationWithState(ServiceSpecificationWithState object) {
				return createServiceSpecificationWithStateAdapter();
			}
			@Override
			public Adapter caseServiceStartList(ServiceStartList object) {
				return createServiceStartListAdapter();
			}
			@Override
			public Adapter caseServiceStart(ServiceStart object) {
				return createServiceStartAdapter();
			}
			@Override
			public Adapter caseShortTripStopList(ShortTripStopList object) {
				return createShortTripStopListAdapter();
			}
			@Override
			public Adapter caseShortTripStop(ShortTripStop object) {
				return createShortTripStopAdapter();
			}
			@Override
			public Adapter caseSpecificPoint(SpecificPoint object) {
				return createSpecificPointAdapter();
			}
			@Override
			public Adapter caseStopInformationRequest(StopInformationRequest object) {
				return createStopInformationRequestAdapter();
			}
			@Override
			public Adapter caseStopInformation(StopInformation object) {
				return createStopInformationAdapter();
			}
			@Override
			public Adapter caseStopPointTariffInformation(StopPointTariffInformation object) {
				return createStopPointTariffInformationAdapter();
			}
			@Override
			public Adapter caseStopSequence(StopSequence object) {
				return createStopSequenceAdapter();
			}
			@Override
			public Adapter caseSubscribeRequest(SubscribeRequest object) {
				return createSubscribeRequestAdapter();
			}
			@Override
			public Adapter caseSubscribeResponse(SubscribeResponse object) {
				return createSubscribeResponseAdapter();
			}
			@Override
			public Adapter caseTimingPoint(TimingPoint object) {
				return createTimingPointAdapter();
			}
			@Override
			public Adapter caseTripInformation(TripInformation object) {
				return createTripInformationAdapter();
			}
			@Override
			public Adapter caseTripSequence(TripSequence object) {
				return createTripSequenceAdapter();
			}
			@Override
			public Adapter caseTSPPoint(TSPPoint object) {
				return createTSPPointAdapter();
			}
			@Override
			public Adapter caseUnsubscribeRequest(UnsubscribeRequest object) {
				return createUnsubscribeRequestAdapter();
			}
			@Override
			public Adapter caseUnsubscribeResponse(UnsubscribeResponse object) {
				return createUnsubscribeResponseAdapter();
			}
			@Override
			public Adapter caseVehicle(Vehicle object) {
				return createVehicleAdapter();
			}
			@Override
			public Adapter caseViaPoint(ViaPoint object) {
				return createViaPointAdapter();
			}
			@Override
			public Adapter caseZoneType(ZoneType object) {
				return createZoneTypeAdapter();
			}
			@Override
			public Adapter caseGeneralResponse(GeneralResponse object) {
				return createGeneralResponseAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.AdditionalAnnouncement <em>Additional Announcement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.AdditionalAnnouncement
	 * @generated
	 */
	public Adapter createAdditionalAnnouncementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.Announcement <em>Announcement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.Announcement
	 * @generated
	 */
	public Adapter createAnnouncementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.BayArea <em>Bay Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.BayArea
	 * @generated
	 */
	public Adapter createBayAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.BeaconPoint <em>Beacon Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.BeaconPoint
	 * @generated
	 */
	public Adapter createBeaconPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.CardApplInformations <em>Card Appl Informations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.CardApplInformations
	 * @generated
	 */
	public Adapter createCardApplInformationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.CardTicketData <em>Card Ticket Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.CardTicketData
	 * @generated
	 */
	public Adapter createCardTicketDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.CardType <em>Card Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.CardType
	 * @generated
	 */
	public Adapter createCardTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.DataAcceptedResponseData <em>Data Accepted Response Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.DataAcceptedResponseData
	 * @generated
	 */
	public Adapter createDataAcceptedResponseDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.DataAcceptedResponse <em>Data Accepted Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.DataAcceptedResponse
	 * @generated
	 */
	public Adapter createDataAcceptedResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.DataVersionList <em>Data Version List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.DataVersionList
	 * @generated
	 */
	public Adapter createDataVersionListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.DataVersion <em>Data Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.DataVersion
	 * @generated
	 */
	public Adapter createDataVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.DegreeType <em>Degree Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.DegreeType
	 * @generated
	 */
	public Adapter createDegreeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.Destination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.Destination
	 * @generated
	 */
	public Adapter createDestinationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.DeviceInformation <em>Device Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.DeviceInformation
	 * @generated
	 */
	public Adapter createDeviceInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.DeviceSpecificationList <em>Device Specification List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.DeviceSpecificationList
	 * @generated
	 */
	public Adapter createDeviceSpecificationListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.DeviceSpecification <em>Device Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.DeviceSpecification
	 * @generated
	 */
	public Adapter createDeviceSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.DeviceSpecificationWithStateList <em>Device Specification With State List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.DeviceSpecificationWithStateList
	 * @generated
	 */
	public Adapter createDeviceSpecificationWithStateListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.DeviceSpecificationWithState <em>Device Specification With State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.DeviceSpecificationWithState
	 * @generated
	 */
	public Adapter createDeviceSpecificationWithStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.DisplayContent <em>Display Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.DisplayContent
	 * @generated
	 */
	public Adapter createDisplayContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.DoorCountingList <em>Door Counting List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.DoorCountingList
	 * @generated
	 */
	public Adapter createDoorCountingListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.DoorCounting <em>Door Counting</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.DoorCounting
	 * @generated
	 */
	public Adapter createDoorCountingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.DoorInformation <em>Door Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.DoorInformation
	 * @generated
	 */
	public Adapter createDoorInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.DoorOpenState <em>Door Open State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.DoorOpenState
	 * @generated
	 */
	public Adapter createDoorOpenStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.DoorOperationState <em>Door Operation State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.DoorOperationState
	 * @generated
	 */
	public Adapter createDoorOperationStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.DoorState <em>Door State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.DoorState
	 * @generated
	 */
	public Adapter createDoorStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.FareZoneInformation <em>Fare Zone Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.FareZoneInformation
	 * @generated
	 */
	public Adapter createFareZoneInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.GlobalCardStatus <em>Global Card Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.GlobalCardStatus
	 * @generated
	 */
	public Adapter createGlobalCardStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.GNSSCoordinate <em>GNSS Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.GNSSCoordinate
	 * @generated
	 */
	public Adapter createGNSSCoordinateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.GNSSPoint <em>GNSS Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.GNSSPoint
	 * @generated
	 */
	public Adapter createGNSSPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.IBISIPAnyURI <em>IBISIP Any URI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPAnyURI
	 * @generated
	 */
	public Adapter createIBISIPAnyURIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.IBISIPBoolean <em>IBISIP Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPBoolean
	 * @generated
	 */
	public Adapter createIBISIPBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.IBISIPByte <em>IBISIP Byte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPByte
	 * @generated
	 */
	public Adapter createIBISIPByteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.IBISIPDate <em>IBISIP Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPDate
	 * @generated
	 */
	public Adapter createIBISIPDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.IBISIPDateTime <em>IBISIP Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPDateTime
	 * @generated
	 */
	public Adapter createIBISIPDateTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.IBISIPDouble <em>IBISIP Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPDouble
	 * @generated
	 */
	public Adapter createIBISIPDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.IBISIPDuration <em>IBISIP Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPDuration
	 * @generated
	 */
	public Adapter createIBISIPDurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.IBISIPInt <em>IBISIP Int</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPInt
	 * @generated
	 */
	public Adapter createIBISIPIntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.IBISIPLanguage <em>IBISIP Language</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPLanguage
	 * @generated
	 */
	public Adapter createIBISIPLanguageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.IBISIPNMTOKEN <em>IBISIPNMTOKEN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPNMTOKEN
	 * @generated
	 */
	public Adapter createIBISIPNMTOKENAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.IBISIPNonNegativeInteger <em>IBISIP Non Negative Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPNonNegativeInteger
	 * @generated
	 */
	public Adapter createIBISIPNonNegativeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.IBISIPNormalizedString <em>IBISIP Normalized String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPNormalizedString
	 * @generated
	 */
	public Adapter createIBISIPNormalizedStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.IBISIPString <em>IBISIP String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPString
	 * @generated
	 */
	public Adapter createIBISIPStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.IBISIPTime <em>IBISIP Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPTime
	 * @generated
	 */
	public Adapter createIBISIPTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.IBISIPUnsignedInt <em>IBISIP Unsigned Int</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPUnsignedInt
	 * @generated
	 */
	public Adapter createIBISIPUnsignedIntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.IBISIPUnsignedLong <em>IBISIP Unsigned Long</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.IBISIPUnsignedLong
	 * @generated
	 */
	public Adapter createIBISIPUnsignedLongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.InternationalTextType <em>International Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.InternationalTextType
	 * @generated
	 */
	public Adapter createInternationalTextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.JourneyStopInformation <em>Journey Stop Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.JourneyStopInformation
	 * @generated
	 */
	public Adapter createJourneyStopInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.LineInformation <em>Line Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.LineInformation
	 * @generated
	 */
	public Adapter createLineInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.LogMessage <em>Log Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.LogMessage
	 * @generated
	 */
	public Adapter createLogMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.NetexMode <em>Netex Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.NetexMode
	 * @generated
	 */
	public Adapter createNetexModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.PointSequence <em>Point Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.PointSequence
	 * @generated
	 */
	public Adapter createPointSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.Point
	 * @generated
	 */
	public Adapter createPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.PointType <em>Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.PointType
	 * @generated
	 */
	public Adapter createPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.ServiceIdentification <em>Service Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.ServiceIdentification
	 * @generated
	 */
	public Adapter createServiceIdentificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.ServiceIdentificationWithStateList <em>Service Identification With State List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.ServiceIdentificationWithStateList
	 * @generated
	 */
	public Adapter createServiceIdentificationWithStateListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.ServiceIdentificationWithState <em>Service Identification With State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.ServiceIdentificationWithState
	 * @generated
	 */
	public Adapter createServiceIdentificationWithStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.ServiceInformationList <em>Service Information List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.ServiceInformationList
	 * @generated
	 */
	public Adapter createServiceInformationListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.ServiceInformation <em>Service Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.ServiceInformation
	 * @generated
	 */
	public Adapter createServiceInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.ServiceSpecification <em>Service Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.ServiceSpecification
	 * @generated
	 */
	public Adapter createServiceSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.ServiceSpecificationWithStateList <em>Service Specification With State List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.ServiceSpecificationWithStateList
	 * @generated
	 */
	public Adapter createServiceSpecificationWithStateListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.ServiceSpecificationWithState <em>Service Specification With State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.ServiceSpecificationWithState
	 * @generated
	 */
	public Adapter createServiceSpecificationWithStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.ServiceStartList <em>Service Start List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.ServiceStartList
	 * @generated
	 */
	public Adapter createServiceStartListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.ServiceStart <em>Service Start</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.ServiceStart
	 * @generated
	 */
	public Adapter createServiceStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.ShortTripStopList <em>Short Trip Stop List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.ShortTripStopList
	 * @generated
	 */
	public Adapter createShortTripStopListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.ShortTripStop <em>Short Trip Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.ShortTripStop
	 * @generated
	 */
	public Adapter createShortTripStopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.SpecificPoint <em>Specific Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.SpecificPoint
	 * @generated
	 */
	public Adapter createSpecificPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.StopInformationRequest <em>Stop Information Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.StopInformationRequest
	 * @generated
	 */
	public Adapter createStopInformationRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.StopInformation <em>Stop Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.StopInformation
	 * @generated
	 */
	public Adapter createStopInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.StopPointTariffInformation <em>Stop Point Tariff Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.StopPointTariffInformation
	 * @generated
	 */
	public Adapter createStopPointTariffInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.StopSequence <em>Stop Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.StopSequence
	 * @generated
	 */
	public Adapter createStopSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.SubscribeRequest <em>Subscribe Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.SubscribeRequest
	 * @generated
	 */
	public Adapter createSubscribeRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.SubscribeResponse <em>Subscribe Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.SubscribeResponse
	 * @generated
	 */
	public Adapter createSubscribeResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.TimingPoint <em>Timing Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.TimingPoint
	 * @generated
	 */
	public Adapter createTimingPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.TripInformation <em>Trip Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.TripInformation
	 * @generated
	 */
	public Adapter createTripInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.TripSequence <em>Trip Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.TripSequence
	 * @generated
	 */
	public Adapter createTripSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.TSPPoint <em>TSP Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.TSPPoint
	 * @generated
	 */
	public Adapter createTSPPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.UnsubscribeRequest <em>Unsubscribe Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.UnsubscribeRequest
	 * @generated
	 */
	public Adapter createUnsubscribeRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.UnsubscribeResponse <em>Unsubscribe Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.UnsubscribeResponse
	 * @generated
	 */
	public Adapter createUnsubscribeResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.Vehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.Vehicle
	 * @generated
	 */
	public Adapter createVehicleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.ViaPoint <em>Via Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.ViaPoint
	 * @generated
	 */
	public Adapter createViaPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.ZoneType <em>Zone Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.ZoneType
	 * @generated
	 */
	public Adapter createZoneTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.ibis_common.GeneralResponse <em>General Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.ibis_common.GeneralResponse
	 * @generated
	 */
	public Adapter createGeneralResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //IbisCommonAdapterFactory
