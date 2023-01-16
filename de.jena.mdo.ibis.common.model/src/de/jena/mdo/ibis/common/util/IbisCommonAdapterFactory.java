/**
 */
package de.jena.mdo.ibis.common.util;

import de.jena.mdo.ibis.common.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.mdo.ibis.common.IbisCommonPackage
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
			public Adapter caseAdditionalAnnouncementStructure(AdditionalAnnouncementStructure object) {
				return createAdditionalAnnouncementStructureAdapter();
			}
			@Override
			public Adapter caseAnnouncementStructure(AnnouncementStructure object) {
				return createAnnouncementStructureAdapter();
			}
			@Override
			public Adapter caseBayAreaStructure(BayAreaStructure object) {
				return createBayAreaStructureAdapter();
			}
			@Override
			public Adapter caseBeaconPointStructure(BeaconPointStructure object) {
				return createBeaconPointStructureAdapter();
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
			public Adapter caseConnectionStructure(ConnectionStructure object) {
				return createConnectionStructureAdapter();
			}
			@Override
			public Adapter caseDataAcceptedResponseDataStructure(DataAcceptedResponseDataStructure object) {
				return createDataAcceptedResponseDataStructureAdapter();
			}
			@Override
			public Adapter caseDataAcceptedResponseStructure(DataAcceptedResponseStructure object) {
				return createDataAcceptedResponseStructureAdapter();
			}
			@Override
			public Adapter caseDataVersionListStructure(DataVersionListStructure object) {
				return createDataVersionListStructureAdapter();
			}
			@Override
			public Adapter caseDataVersionStructure(DataVersionStructure object) {
				return createDataVersionStructureAdapter();
			}
			@Override
			public Adapter caseDegreeType(DegreeType object) {
				return createDegreeTypeAdapter();
			}
			@Override
			public Adapter caseDestinationStructure(DestinationStructure object) {
				return createDestinationStructureAdapter();
			}
			@Override
			public Adapter caseDeviceInformationStructure(DeviceInformationStructure object) {
				return createDeviceInformationStructureAdapter();
			}
			@Override
			public Adapter caseDeviceSpecificationListStructure(DeviceSpecificationListStructure object) {
				return createDeviceSpecificationListStructureAdapter();
			}
			@Override
			public Adapter caseDeviceSpecificationStructure(DeviceSpecificationStructure object) {
				return createDeviceSpecificationStructureAdapter();
			}
			@Override
			public Adapter caseDeviceSpecificationWithStateListStructure(DeviceSpecificationWithStateListStructure object) {
				return createDeviceSpecificationWithStateListStructureAdapter();
			}
			@Override
			public Adapter caseDeviceSpecificationWithStateStructure(DeviceSpecificationWithStateStructure object) {
				return createDeviceSpecificationWithStateStructureAdapter();
			}
			@Override
			public Adapter caseDisplayContentStructure(DisplayContentStructure object) {
				return createDisplayContentStructureAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseDoorCountingListStructure(DoorCountingListStructure object) {
				return createDoorCountingListStructureAdapter();
			}
			@Override
			public Adapter caseDoorCountingStructure(DoorCountingStructure object) {
				return createDoorCountingStructureAdapter();
			}
			@Override
			public Adapter caseDoorInformationStructure(DoorInformationStructure object) {
				return createDoorInformationStructureAdapter();
			}
			@Override
			public Adapter caseDoorOpenStateStructure(DoorOpenStateStructure object) {
				return createDoorOpenStateStructureAdapter();
			}
			@Override
			public Adapter caseDoorOperationStateStructure(DoorOperationStateStructure object) {
				return createDoorOperationStateStructureAdapter();
			}
			@Override
			public Adapter caseDoorStateStructure(DoorStateStructure object) {
				return createDoorStateStructureAdapter();
			}
			@Override
			public Adapter caseFareZoneInformationStructure(FareZoneInformationStructure object) {
				return createFareZoneInformationStructureAdapter();
			}
			@Override
			public Adapter caseGlobalCardStatus(GlobalCardStatus object) {
				return createGlobalCardStatusAdapter();
			}
			@Override
			public Adapter caseGNSSCoordinateStructure(GNSSCoordinateStructure object) {
				return createGNSSCoordinateStructureAdapter();
			}
			@Override
			public Adapter caseGNSSPointStructure(GNSSPointStructure object) {
				return createGNSSPointStructureAdapter();
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
			public Adapter caseJourneyStopInformationStructure(JourneyStopInformationStructure object) {
				return createJourneyStopInformationStructureAdapter();
			}
			@Override
			public Adapter caseLineInformationStructure(LineInformationStructure object) {
				return createLineInformationStructureAdapter();
			}
			@Override
			public Adapter caseLogMessageStructure(LogMessageStructure object) {
				return createLogMessageStructureAdapter();
			}
			@Override
			public Adapter caseMessageStructure(MessageStructure object) {
				return createMessageStructureAdapter();
			}
			@Override
			public Adapter caseNetexMode(NetexMode object) {
				return createNetexModeAdapter();
			}
			@Override
			public Adapter casePointSequenceStructure(PointSequenceStructure object) {
				return createPointSequenceStructureAdapter();
			}
			@Override
			public Adapter casePointStructure(PointStructure object) {
				return createPointStructureAdapter();
			}
			@Override
			public Adapter casePointTypeStructure(PointTypeStructure object) {
				return createPointTypeStructureAdapter();
			}
			@Override
			public Adapter caseServiceIdentificationStructure(ServiceIdentificationStructure object) {
				return createServiceIdentificationStructureAdapter();
			}
			@Override
			public Adapter caseServiceIdentificationWithStateListStructure(ServiceIdentificationWithStateListStructure object) {
				return createServiceIdentificationWithStateListStructureAdapter();
			}
			@Override
			public Adapter caseServiceIdentificationWithStateStructure(ServiceIdentificationWithStateStructure object) {
				return createServiceIdentificationWithStateStructureAdapter();
			}
			@Override
			public Adapter caseServiceInformationListStructure(ServiceInformationListStructure object) {
				return createServiceInformationListStructureAdapter();
			}
			@Override
			public Adapter caseServiceInformationStructure(ServiceInformationStructure object) {
				return createServiceInformationStructureAdapter();
			}
			@Override
			public Adapter caseServiceSpecificationStructure(ServiceSpecificationStructure object) {
				return createServiceSpecificationStructureAdapter();
			}
			@Override
			public Adapter caseServiceSpecificationWithStateListStructure(ServiceSpecificationWithStateListStructure object) {
				return createServiceSpecificationWithStateListStructureAdapter();
			}
			@Override
			public Adapter caseServiceSpecificationWithStateStructure(ServiceSpecificationWithStateStructure object) {
				return createServiceSpecificationWithStateStructureAdapter();
			}
			@Override
			public Adapter caseServiceStartListStructure(ServiceStartListStructure object) {
				return createServiceStartListStructureAdapter();
			}
			@Override
			public Adapter caseServiceStartStructure(ServiceStartStructure object) {
				return createServiceStartStructureAdapter();
			}
			@Override
			public Adapter caseShortTripStopListStructure(ShortTripStopListStructure object) {
				return createShortTripStopListStructureAdapter();
			}
			@Override
			public Adapter caseShortTripStopStructure(ShortTripStopStructure object) {
				return createShortTripStopStructureAdapter();
			}
			@Override
			public Adapter caseSpecificPointStructure(SpecificPointStructure object) {
				return createSpecificPointStructureAdapter();
			}
			@Override
			public Adapter caseStopInformationRequestStructure(StopInformationRequestStructure object) {
				return createStopInformationRequestStructureAdapter();
			}
			@Override
			public Adapter caseStopInformationStructure(StopInformationStructure object) {
				return createStopInformationStructureAdapter();
			}
			@Override
			public Adapter caseStopPointTariffInformationStructure(StopPointTariffInformationStructure object) {
				return createStopPointTariffInformationStructureAdapter();
			}
			@Override
			public Adapter caseStopSequenceStructure(StopSequenceStructure object) {
				return createStopSequenceStructureAdapter();
			}
			@Override
			public Adapter caseSubscribeRequestStructure(SubscribeRequestStructure object) {
				return createSubscribeRequestStructureAdapter();
			}
			@Override
			public Adapter caseSubscribeResponseStructure(SubscribeResponseStructure object) {
				return createSubscribeResponseStructureAdapter();
			}
			@Override
			public Adapter caseTimingPointStructure(TimingPointStructure object) {
				return createTimingPointStructureAdapter();
			}
			@Override
			public Adapter caseTripInformationStructure(TripInformationStructure object) {
				return createTripInformationStructureAdapter();
			}
			@Override
			public Adapter caseTripSequenceStructure(TripSequenceStructure object) {
				return createTripSequenceStructureAdapter();
			}
			@Override
			public Adapter caseTSPPointStructure(TSPPointStructure object) {
				return createTSPPointStructureAdapter();
			}
			@Override
			public Adapter caseUnsubscribeRequestStructure(UnsubscribeRequestStructure object) {
				return createUnsubscribeRequestStructureAdapter();
			}
			@Override
			public Adapter caseUnsubscribeResponseStructure(UnsubscribeResponseStructure object) {
				return createUnsubscribeResponseStructureAdapter();
			}
			@Override
			public Adapter caseVehicleStructure(VehicleStructure object) {
				return createVehicleStructureAdapter();
			}
			@Override
			public Adapter caseViaPointStructure(ViaPointStructure object) {
				return createViaPointStructureAdapter();
			}
			@Override
			public Adapter caseZoneType(ZoneType object) {
				return createZoneTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.AdditionalAnnouncementStructure <em>Additional Announcement Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.AdditionalAnnouncementStructure
	 * @generated
	 */
	public Adapter createAdditionalAnnouncementStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.AnnouncementStructure <em>Announcement Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.AnnouncementStructure
	 * @generated
	 */
	public Adapter createAnnouncementStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.BayAreaStructure <em>Bay Area Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.BayAreaStructure
	 * @generated
	 */
	public Adapter createBayAreaStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.BeaconPointStructure <em>Beacon Point Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.BeaconPointStructure
	 * @generated
	 */
	public Adapter createBeaconPointStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.CardApplInformations <em>Card Appl Informations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.CardApplInformations
	 * @generated
	 */
	public Adapter createCardApplInformationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.CardTicketData <em>Card Ticket Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.CardTicketData
	 * @generated
	 */
	public Adapter createCardTicketDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.CardType <em>Card Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.CardType
	 * @generated
	 */
	public Adapter createCardTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.ConnectionStructure <em>Connection Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.ConnectionStructure
	 * @generated
	 */
	public Adapter createConnectionStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.DataAcceptedResponseDataStructure <em>Data Accepted Response Data Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.DataAcceptedResponseDataStructure
	 * @generated
	 */
	public Adapter createDataAcceptedResponseDataStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.DataAcceptedResponseStructure <em>Data Accepted Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.DataAcceptedResponseStructure
	 * @generated
	 */
	public Adapter createDataAcceptedResponseStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.DataVersionListStructure <em>Data Version List Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.DataVersionListStructure
	 * @generated
	 */
	public Adapter createDataVersionListStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.DataVersionStructure <em>Data Version Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.DataVersionStructure
	 * @generated
	 */
	public Adapter createDataVersionStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.DegreeType <em>Degree Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.DegreeType
	 * @generated
	 */
	public Adapter createDegreeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.DestinationStructure <em>Destination Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.DestinationStructure
	 * @generated
	 */
	public Adapter createDestinationStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.DeviceInformationStructure <em>Device Information Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.DeviceInformationStructure
	 * @generated
	 */
	public Adapter createDeviceInformationStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.DeviceSpecificationListStructure <em>Device Specification List Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.DeviceSpecificationListStructure
	 * @generated
	 */
	public Adapter createDeviceSpecificationListStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.DeviceSpecificationStructure <em>Device Specification Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.DeviceSpecificationStructure
	 * @generated
	 */
	public Adapter createDeviceSpecificationStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.DeviceSpecificationWithStateListStructure <em>Device Specification With State List Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.DeviceSpecificationWithStateListStructure
	 * @generated
	 */
	public Adapter createDeviceSpecificationWithStateListStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.DeviceSpecificationWithStateStructure <em>Device Specification With State Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.DeviceSpecificationWithStateStructure
	 * @generated
	 */
	public Adapter createDeviceSpecificationWithStateStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.DisplayContentStructure <em>Display Content Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.DisplayContentStructure
	 * @generated
	 */
	public Adapter createDisplayContentStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.DoorCountingListStructure <em>Door Counting List Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.DoorCountingListStructure
	 * @generated
	 */
	public Adapter createDoorCountingListStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.DoorCountingStructure <em>Door Counting Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.DoorCountingStructure
	 * @generated
	 */
	public Adapter createDoorCountingStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.DoorInformationStructure <em>Door Information Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.DoorInformationStructure
	 * @generated
	 */
	public Adapter createDoorInformationStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.DoorOpenStateStructure <em>Door Open State Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.DoorOpenStateStructure
	 * @generated
	 */
	public Adapter createDoorOpenStateStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.DoorOperationStateStructure <em>Door Operation State Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.DoorOperationStateStructure
	 * @generated
	 */
	public Adapter createDoorOperationStateStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.DoorStateStructure <em>Door State Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.DoorStateStructure
	 * @generated
	 */
	public Adapter createDoorStateStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.FareZoneInformationStructure <em>Fare Zone Information Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.FareZoneInformationStructure
	 * @generated
	 */
	public Adapter createFareZoneInformationStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.GlobalCardStatus <em>Global Card Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.GlobalCardStatus
	 * @generated
	 */
	public Adapter createGlobalCardStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.GNSSCoordinateStructure <em>GNSS Coordinate Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.GNSSCoordinateStructure
	 * @generated
	 */
	public Adapter createGNSSCoordinateStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.GNSSPointStructure <em>GNSS Point Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.GNSSPointStructure
	 * @generated
	 */
	public Adapter createGNSSPointStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.IBISIPAnyURI <em>IBISIP Any URI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.IBISIPAnyURI
	 * @generated
	 */
	public Adapter createIBISIPAnyURIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.IBISIPBoolean <em>IBISIP Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.IBISIPBoolean
	 * @generated
	 */
	public Adapter createIBISIPBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.IBISIPByte <em>IBISIP Byte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.IBISIPByte
	 * @generated
	 */
	public Adapter createIBISIPByteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.IBISIPDate <em>IBISIP Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.IBISIPDate
	 * @generated
	 */
	public Adapter createIBISIPDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.IBISIPDateTime <em>IBISIP Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.IBISIPDateTime
	 * @generated
	 */
	public Adapter createIBISIPDateTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.IBISIPDouble <em>IBISIP Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.IBISIPDouble
	 * @generated
	 */
	public Adapter createIBISIPDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.IBISIPDuration <em>IBISIP Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.IBISIPDuration
	 * @generated
	 */
	public Adapter createIBISIPDurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.IBISIPInt <em>IBISIP Int</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.IBISIPInt
	 * @generated
	 */
	public Adapter createIBISIPIntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.IBISIPLanguage <em>IBISIP Language</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.IBISIPLanguage
	 * @generated
	 */
	public Adapter createIBISIPLanguageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.IBISIPNMTOKEN <em>IBISIPNMTOKEN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.IBISIPNMTOKEN
	 * @generated
	 */
	public Adapter createIBISIPNMTOKENAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.IBISIPNonNegativeInteger <em>IBISIP Non Negative Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.IBISIPNonNegativeInteger
	 * @generated
	 */
	public Adapter createIBISIPNonNegativeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.IBISIPNormalizedString <em>IBISIP Normalized String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.IBISIPNormalizedString
	 * @generated
	 */
	public Adapter createIBISIPNormalizedStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.IBISIPString <em>IBISIP String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.IBISIPString
	 * @generated
	 */
	public Adapter createIBISIPStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.IBISIPTime <em>IBISIP Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.IBISIPTime
	 * @generated
	 */
	public Adapter createIBISIPTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.IBISIPUnsignedInt <em>IBISIP Unsigned Int</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.IBISIPUnsignedInt
	 * @generated
	 */
	public Adapter createIBISIPUnsignedIntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.IBISIPUnsignedLong <em>IBISIP Unsigned Long</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.IBISIPUnsignedLong
	 * @generated
	 */
	public Adapter createIBISIPUnsignedLongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.InternationalTextType <em>International Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.InternationalTextType
	 * @generated
	 */
	public Adapter createInternationalTextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.JourneyStopInformationStructure <em>Journey Stop Information Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.JourneyStopInformationStructure
	 * @generated
	 */
	public Adapter createJourneyStopInformationStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.LineInformationStructure <em>Line Information Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.LineInformationStructure
	 * @generated
	 */
	public Adapter createLineInformationStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.LogMessageStructure <em>Log Message Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.LogMessageStructure
	 * @generated
	 */
	public Adapter createLogMessageStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.MessageStructure <em>Message Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.MessageStructure
	 * @generated
	 */
	public Adapter createMessageStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.NetexMode <em>Netex Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.NetexMode
	 * @generated
	 */
	public Adapter createNetexModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.PointSequenceStructure <em>Point Sequence Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.PointSequenceStructure
	 * @generated
	 */
	public Adapter createPointSequenceStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.PointStructure <em>Point Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.PointStructure
	 * @generated
	 */
	public Adapter createPointStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.PointTypeStructure <em>Point Type Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.PointTypeStructure
	 * @generated
	 */
	public Adapter createPointTypeStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.ServiceIdentificationStructure <em>Service Identification Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.ServiceIdentificationStructure
	 * @generated
	 */
	public Adapter createServiceIdentificationStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.ServiceIdentificationWithStateListStructure <em>Service Identification With State List Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.ServiceIdentificationWithStateListStructure
	 * @generated
	 */
	public Adapter createServiceIdentificationWithStateListStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.ServiceIdentificationWithStateStructure <em>Service Identification With State Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.ServiceIdentificationWithStateStructure
	 * @generated
	 */
	public Adapter createServiceIdentificationWithStateStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.ServiceInformationListStructure <em>Service Information List Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.ServiceInformationListStructure
	 * @generated
	 */
	public Adapter createServiceInformationListStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.ServiceInformationStructure <em>Service Information Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.ServiceInformationStructure
	 * @generated
	 */
	public Adapter createServiceInformationStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.ServiceSpecificationStructure <em>Service Specification Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.ServiceSpecificationStructure
	 * @generated
	 */
	public Adapter createServiceSpecificationStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.ServiceSpecificationWithStateListStructure <em>Service Specification With State List Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.ServiceSpecificationWithStateListStructure
	 * @generated
	 */
	public Adapter createServiceSpecificationWithStateListStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.ServiceSpecificationWithStateStructure <em>Service Specification With State Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.ServiceSpecificationWithStateStructure
	 * @generated
	 */
	public Adapter createServiceSpecificationWithStateStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.ServiceStartListStructure <em>Service Start List Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.ServiceStartListStructure
	 * @generated
	 */
	public Adapter createServiceStartListStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.ServiceStartStructure <em>Service Start Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.ServiceStartStructure
	 * @generated
	 */
	public Adapter createServiceStartStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.ShortTripStopListStructure <em>Short Trip Stop List Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.ShortTripStopListStructure
	 * @generated
	 */
	public Adapter createShortTripStopListStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.ShortTripStopStructure <em>Short Trip Stop Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.ShortTripStopStructure
	 * @generated
	 */
	public Adapter createShortTripStopStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.SpecificPointStructure <em>Specific Point Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.SpecificPointStructure
	 * @generated
	 */
	public Adapter createSpecificPointStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.StopInformationRequestStructure <em>Stop Information Request Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.StopInformationRequestStructure
	 * @generated
	 */
	public Adapter createStopInformationRequestStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.StopInformationStructure <em>Stop Information Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.StopInformationStructure
	 * @generated
	 */
	public Adapter createStopInformationStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.StopPointTariffInformationStructure <em>Stop Point Tariff Information Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.StopPointTariffInformationStructure
	 * @generated
	 */
	public Adapter createStopPointTariffInformationStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.StopSequenceStructure <em>Stop Sequence Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.StopSequenceStructure
	 * @generated
	 */
	public Adapter createStopSequenceStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.SubscribeRequestStructure <em>Subscribe Request Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.SubscribeRequestStructure
	 * @generated
	 */
	public Adapter createSubscribeRequestStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.SubscribeResponseStructure <em>Subscribe Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.SubscribeResponseStructure
	 * @generated
	 */
	public Adapter createSubscribeResponseStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.TimingPointStructure <em>Timing Point Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.TimingPointStructure
	 * @generated
	 */
	public Adapter createTimingPointStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.TripInformationStructure <em>Trip Information Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.TripInformationStructure
	 * @generated
	 */
	public Adapter createTripInformationStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.TripSequenceStructure <em>Trip Sequence Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.TripSequenceStructure
	 * @generated
	 */
	public Adapter createTripSequenceStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.TSPPointStructure <em>TSP Point Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.TSPPointStructure
	 * @generated
	 */
	public Adapter createTSPPointStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.UnsubscribeRequestStructure <em>Unsubscribe Request Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.UnsubscribeRequestStructure
	 * @generated
	 */
	public Adapter createUnsubscribeRequestStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.UnsubscribeResponseStructure <em>Unsubscribe Response Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.UnsubscribeResponseStructure
	 * @generated
	 */
	public Adapter createUnsubscribeResponseStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.VehicleStructure <em>Vehicle Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.VehicleStructure
	 * @generated
	 */
	public Adapter createVehicleStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.ViaPointStructure <em>Via Point Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.ViaPointStructure
	 * @generated
	 */
	public Adapter createViaPointStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.ibis.common.ZoneType <em>Zone Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.ibis.common.ZoneType
	 * @generated
	 */
	public Adapter createZoneTypeAdapter() {
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
