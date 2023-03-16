/**
 */
package de.jena.mdo.ibis.ibis_common.impl;

import de.jena.mdo.ibis.ibis_common.AdditionalAnnouncement;
import de.jena.mdo.ibis.ibis_common.Announcement;
import de.jena.mdo.ibis.ibis_common.BayArea;
import de.jena.mdo.ibis.ibis_common.BeaconPoint;
import de.jena.mdo.ibis.ibis_common.CardApplInformations;
import de.jena.mdo.ibis.ibis_common.CardTicketData;
import de.jena.mdo.ibis.ibis_common.CardType;
import de.jena.mdo.ibis.ibis_common.Connection;
import de.jena.mdo.ibis.ibis_common.DataAcceptedResponse;
import de.jena.mdo.ibis.ibis_common.DataAcceptedResponseData;
import de.jena.mdo.ibis.ibis_common.DataVersion;
import de.jena.mdo.ibis.ibis_common.DataVersionList;
import de.jena.mdo.ibis.ibis_common.DegreeType;
import de.jena.mdo.ibis.ibis_common.Destination;
import de.jena.mdo.ibis.ibis_common.DeviceInformation;
import de.jena.mdo.ibis.ibis_common.DeviceSpecification;
import de.jena.mdo.ibis.ibis_common.DeviceSpecificationList;
import de.jena.mdo.ibis.ibis_common.DeviceSpecificationWithState;
import de.jena.mdo.ibis.ibis_common.DeviceSpecificationWithStateList;
import de.jena.mdo.ibis.ibis_common.DisplayContent;
import de.jena.mdo.ibis.ibis_common.DocumentRoot;
import de.jena.mdo.ibis.ibis_common.DoorCounting;
import de.jena.mdo.ibis.ibis_common.DoorCountingList;
import de.jena.mdo.ibis.ibis_common.DoorInformation;
import de.jena.mdo.ibis.ibis_common.DoorOpenState;
import de.jena.mdo.ibis.ibis_common.DoorOperationState;
import de.jena.mdo.ibis.ibis_common.DoorState;
import de.jena.mdo.ibis.ibis_common.FareZoneInformation;
import de.jena.mdo.ibis.ibis_common.GNSSCoordinate;
import de.jena.mdo.ibis.ibis_common.GNSSPoint;
import de.jena.mdo.ibis.ibis_common.GeneralResponse;
import de.jena.mdo.ibis.ibis_common.GlobalCardStatus;
import de.jena.mdo.ibis.ibis_common.IBISIPAnyURI;
import de.jena.mdo.ibis.ibis_common.IBISIPBoolean;
import de.jena.mdo.ibis.ibis_common.IBISIPByte;
import de.jena.mdo.ibis.ibis_common.IBISIPDate;
import de.jena.mdo.ibis.ibis_common.IBISIPDateTime;
import de.jena.mdo.ibis.ibis_common.IBISIPDouble;
import de.jena.mdo.ibis.ibis_common.IBISIPDuration;
import de.jena.mdo.ibis.ibis_common.IBISIPInt;
import de.jena.mdo.ibis.ibis_common.IBISIPLanguage;
import de.jena.mdo.ibis.ibis_common.IBISIPNonNegativeInteger;
import de.jena.mdo.ibis.ibis_common.IBISIPNormalizedString;
import de.jena.mdo.ibis.ibis_common.IBISIPString;
import de.jena.mdo.ibis.ibis_common.IBISIPTime;
import de.jena.mdo.ibis.ibis_common.IBISIPUnsignedInt;
import de.jena.mdo.ibis.ibis_common.IBISIPUnsignedLong;
import de.jena.mdo.ibis.ibis_common.IbisCommonFactory;
import de.jena.mdo.ibis.ibis_common.IbisCommonPackage;
import de.jena.mdo.ibis.ibis_common.InternationalTextType;
import de.jena.mdo.ibis.ibis_common.JourneyStopInformation;
import de.jena.mdo.ibis.ibis_common.LineInformation;
import de.jena.mdo.ibis.ibis_common.LogMessage;
import de.jena.mdo.ibis.ibis_common.Message;
import de.jena.mdo.ibis.ibis_common.NetexMode;
import de.jena.mdo.ibis.ibis_common.Point;
import de.jena.mdo.ibis.ibis_common.PointSequence;
import de.jena.mdo.ibis.ibis_common.PointType;
import de.jena.mdo.ibis.ibis_common.ServiceIdentification;
import de.jena.mdo.ibis.ibis_common.ServiceIdentificationWithState;
import de.jena.mdo.ibis.ibis_common.ServiceIdentificationWithStateList;
import de.jena.mdo.ibis.ibis_common.ServiceInformation;
import de.jena.mdo.ibis.ibis_common.ServiceInformationList;
import de.jena.mdo.ibis.ibis_common.ServiceSpecification;
import de.jena.mdo.ibis.ibis_common.ServiceSpecificationWithState;
import de.jena.mdo.ibis.ibis_common.ServiceSpecificationWithStateList;
import de.jena.mdo.ibis.ibis_common.ServiceStart;
import de.jena.mdo.ibis.ibis_common.ServiceStartList;
import de.jena.mdo.ibis.ibis_common.ShortTripStop;
import de.jena.mdo.ibis.ibis_common.ShortTripStopList;
import de.jena.mdo.ibis.ibis_common.SpecificPoint;
import de.jena.mdo.ibis.ibis_common.StopInformation;
import de.jena.mdo.ibis.ibis_common.StopInformationRequest;
import de.jena.mdo.ibis.ibis_common.StopPointTariffInformation;
import de.jena.mdo.ibis.ibis_common.StopSequence;
import de.jena.mdo.ibis.ibis_common.SubscribeRequest;
import de.jena.mdo.ibis.ibis_common.SubscribeResponse;
import de.jena.mdo.ibis.ibis_common.TSPPoint;
import de.jena.mdo.ibis.ibis_common.TimingPoint;
import de.jena.mdo.ibis.ibis_common.TripInformation;
import de.jena.mdo.ibis.ibis_common.TripSequence;
import de.jena.mdo.ibis.ibis_common.UnsubscribeRequest;
import de.jena.mdo.ibis.ibis_common.UnsubscribeResponse;
import de.jena.mdo.ibis.ibis_common.Vehicle;
import de.jena.mdo.ibis.ibis_common.ViaPoint;
import de.jena.mdo.ibis.ibis_common.ZoneType;

import de.jena.mdo.ibis.ibis_enumerations.IbisEnumerationsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IbisCommonPackageImpl extends EPackageImpl implements IbisCommonPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionalAnnouncementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass announcementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bayAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beaconPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardApplInformationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardTicketDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAcceptedResponseDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAcceptedResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataVersionListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataVersionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass degreeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass destinationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceSpecificationListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceSpecificationWithStateListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceSpecificationWithStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass displayContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doorCountingListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doorCountingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doorInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doorOpenStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doorOperationStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doorStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fareZoneInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalCardStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gnssCoordinateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gnssPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ibisipAnyURIEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ibisipBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ibisipByteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ibisipDateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ibisipDateTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ibisipDoubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ibisipDurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ibisipIntEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ibisipLanguageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ibisipnmtokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ibisipNonNegativeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ibisipNormalizedStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ibisipStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ibisipTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ibisipUnsignedIntEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ibisipUnsignedLongEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internationalTextTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass journeyStopInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass netexModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointSequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceIdentificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceIdentificationWithStateListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceIdentificationWithStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceInformationListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceSpecificationWithStateListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceSpecificationWithStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceStartListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceStartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shortTripStopListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shortTripStopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stopInformationRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stopInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stopPointTariffInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stopSequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subscribeRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subscribeResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timingPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tripInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tripSequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tspPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unsubscribeRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unsubscribeResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vehicleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viaPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zoneTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalResponseEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IbisCommonPackageImpl() {
		super(eNS_URI, IbisCommonFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link IbisCommonPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IbisCommonPackage init() {
		if (isInited) return (IbisCommonPackage)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredIbisCommonPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		IbisCommonPackageImpl theIbisCommonPackage = registeredIbisCommonPackage instanceof IbisCommonPackageImpl ? (IbisCommonPackageImpl)registeredIbisCommonPackage : new IbisCommonPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		IbisEnumerationsPackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theIbisCommonPackage.createPackageContents();

		// Initialize created meta-data
		theIbisCommonPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIbisCommonPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IbisCommonPackage.eNS_URI, theIbisCommonPackage);
		return theIbisCommonPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdditionalAnnouncement() {
		return additionalAnnouncementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdditionalAnnouncement_AnnouncementRef() {
		return (EReference)additionalAnnouncementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdditionalAnnouncement_AnnouncementText() {
		return (EReference)additionalAnnouncementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdditionalAnnouncement_AnnouncementTTSText() {
		return (EReference)additionalAnnouncementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdditionalAnnouncement_ImmediateInformation() {
		return (EReference)additionalAnnouncementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdditionalAnnouncement_PeriodicalInformation() {
		return (EReference)additionalAnnouncementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdditionalAnnouncement_SpecificPoint() {
		return (EReference)additionalAnnouncementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnouncement() {
		return announcementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnouncement_AnnouncementRef() {
		return (EReference)announcementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnouncement_AnnouncementText() {
		return (EReference)announcementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnouncement_AnnouncementTTSText() {
		return (EReference)announcementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBayArea() {
		return bayAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBayArea_BeforeBay() {
		return (EReference)bayAreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBayArea_BehindBay() {
		return (EReference)bayAreaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBeaconPoint() {
		return beaconPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBeaconPoint_PointRef() {
		return (EReference)beaconPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBeaconPoint_BeaconCode() {
		return (EReference)beaconPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBeaconPoint_ShortName() {
		return (EReference)beaconPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBeaconPoint_Desciption() {
		return (EReference)beaconPointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCardApplInformations() {
		return cardApplInformationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCardApplInformations_CardApplInformationLength() {
		return (EReference)cardApplInformationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCardApplInformations_CardApplInformationData() {
		return (EReference)cardApplInformationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCardTicketData() {
		return cardTicketDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCardTicketData_CardTicketDataID() {
		return (EReference)cardTicketDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCardTicketData_CardTicketDataLength() {
		return (EReference)cardTicketDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCardTicketData_CardTicketData() {
		return (EReference)cardTicketDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCardType() {
		return cardTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCardType_CardSerialNumber() {
		return (EReference)cardTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCardType_CardTypeID() {
		return (EReference)cardTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCardType_CardTypeText() {
		return (EReference)cardTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnection_StopRef() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnection_ConnectionRef() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnection_ConnectionType() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnection_DisplayContent() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnection_Platform() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnection_ConnectionState() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnection_TransportMode() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnection_ConnectionMode() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnection_ExpectedDepartureTime() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnection_ScheduledDepartureTime() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataAcceptedResponseData() {
		return dataAcceptedResponseDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataAcceptedResponseData_TimeStamp() {
		return (EReference)dataAcceptedResponseDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataAcceptedResponseData_DataAccepted() {
		return (EReference)dataAcceptedResponseDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataAcceptedResponseData_ErrorCode() {
		return (EAttribute)dataAcceptedResponseDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataAcceptedResponseData_ErrorInformation() {
		return (EReference)dataAcceptedResponseDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataAcceptedResponse() {
		return dataAcceptedResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataAcceptedResponse_DataAcceptedResponseData() {
		return (EReference)dataAcceptedResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataVersionList() {
		return dataVersionListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataVersionList_DataVersion() {
		return (EReference)dataVersionListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataVersion() {
		return dataVersionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataVersion_DataType() {
		return (EReference)dataVersionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataVersion_VersionRef() {
		return (EReference)dataVersionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDegreeType() {
		return degreeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDegreeType_Degree() {
		return (EReference)degreeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDegreeType_Orientation() {
		return (EReference)degreeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDestination() {
		return destinationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDestination_DestinationRef() {
		return (EReference)destinationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDestination_DestinationName() {
		return (EReference)destinationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDestination_DestinationShortName() {
		return (EReference)destinationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceInformation() {
		return deviceInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceInformation_DeviceName() {
		return (EReference)deviceInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceInformation_Manufacturer() {
		return (EReference)deviceInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceInformation_SerialNumber() {
		return (EReference)deviceInformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceInformation_DeviceClass() {
		return (EAttribute)deviceInformationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceInformation_DataVersionList() {
		return (EReference)deviceInformationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceInformation_WebInterfaceAddress() {
		return (EReference)deviceInformationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceSpecificationList() {
		return deviceSpecificationListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceSpecificationList_DeviceSpecification() {
		return (EReference)deviceSpecificationListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceSpecification() {
		return deviceSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceSpecification_DeviceClass() {
		return (EAttribute)deviceSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceSpecification_DeviceID() {
		return (EReference)deviceSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceSpecificationWithStateList() {
		return deviceSpecificationWithStateListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceSpecificationWithStateList_DeviceSpecificationWithState() {
		return (EReference)deviceSpecificationWithStateListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceSpecificationWithState() {
		return deviceSpecificationWithStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceSpecificationWithState_DeviceSpecification() {
		return (EReference)deviceSpecificationWithStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceSpecificationWithState_DeviceState() {
		return (EAttribute)deviceSpecificationWithStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDisplayContent() {
		return displayContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContent_DisplayContentRef() {
		return (EReference)displayContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContent_LineInformation() {
		return (EReference)displayContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContent_Destination() {
		return (EReference)displayContentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContent_ViaPoint() {
		return (EReference)displayContentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContent_AdditionalInformation() {
		return (EReference)displayContentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContent_AdditionalInformation1() {
		return (EReference)displayContentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContent_AdditionalInformation2() {
		return (EReference)displayContentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContent_AdditionalInformation3() {
		return (EReference)displayContentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContent_AdditionalInformation4() {
		return (EReference)displayContentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContent_AdditionalInformation5() {
		return (EReference)displayContentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContent_AdditionalInformation6() {
		return (EReference)displayContentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContent_AdditionalInformation7() {
		return (EReference)displayContentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContent_AdditionalInformation8() {
		return (EReference)displayContentEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContent_AdditionalInformation9() {
		return (EReference)displayContentEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContent_RunNumber() {
		return (EReference)displayContentEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContent_Priority() {
		return (EReference)displayContentEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContent_PeriodDuration() {
		return (EReference)displayContentEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContent_Duration() {
		return (EReference)displayContentEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_AirSubmode() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_BusSubmode() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_CoachSubmode() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DataAcceptedResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_FunicularSubmode() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_MetroSubmode() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_RailSubmode() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_SelfDriveSubmode() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_SubscribeRequest() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_SubscribeResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_TaxiSubmode() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_TelecabinSubmode() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_TramSubmode() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_UnsubscribeRequest() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_UnsubscribeResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_WaterSubmode() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDoorCountingList() {
		return doorCountingListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoorCountingList_DoorID() {
		return (EReference)doorCountingListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoorCountingList_CountSet() {
		return (EReference)doorCountingListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDoorCounting() {
		return doorCountingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoorCounting_ObjectClass() {
		return (EAttribute)doorCountingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoorCounting_In() {
		return (EReference)doorCountingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoorCounting_Out() {
		return (EReference)doorCountingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoorCounting_CountQuality() {
		return (EAttribute)doorCountingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDoorInformation() {
		return doorInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoorInformation_DoorID() {
		return (EReference)doorInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoorInformation_Count() {
		return (EReference)doorInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoorInformation_State() {
		return (EReference)doorInformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDoorOpenState() {
		return doorOpenStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoorOpenState_Value() {
		return (EAttribute)doorOpenStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoorOpenState_ErrorCode() {
		return (EAttribute)doorOpenStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDoorOperationState() {
		return doorOperationStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoorOperationState_Value() {
		return (EAttribute)doorOperationStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoorOperationState_ErrorCode() {
		return (EAttribute)doorOperationStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDoorState() {
		return doorStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoorState_OpenState() {
		return (EReference)doorStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoorState_OperationState() {
		return (EReference)doorStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFareZoneInformation() {
		return fareZoneInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFareZoneInformation_FareZoneID() {
		return (EReference)fareZoneInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFareZoneInformation_FareZoneType() {
		return (EReference)fareZoneInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFareZoneInformation_FareZoneLongName() {
		return (EReference)fareZoneInformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFareZoneInformation_FareZoneShortName() {
		return (EReference)fareZoneInformationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlobalCardStatus() {
		return globalCardStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlobalCardStatus_GlobalCardStausID() {
		return (EReference)globalCardStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlobalCardStatus_GlobalCardStatusText() {
		return (EReference)globalCardStatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGNSSCoordinate() {
		return gnssCoordinateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSCoordinate_Degree() {
		return (EReference)gnssCoordinateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSCoordinate_Direction() {
		return (EReference)gnssCoordinateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGNSSPoint() {
		return gnssPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSPoint_PointRef() {
		return (EReference)gnssPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSPoint_Longitude() {
		return (EReference)gnssPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSPoint_Latitude() {
		return (EReference)gnssPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSPoint_Altitude() {
		return (EReference)gnssPointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIBISIPAnyURI() {
		return ibisipAnyURIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPAnyURI_Value() {
		return (EAttribute)ibisipAnyURIEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPAnyURI_ErrorCode() {
		return (EAttribute)ibisipAnyURIEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIBISIPBoolean() {
		return ibisipBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPBoolean_Value() {
		return (EAttribute)ibisipBooleanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPBoolean_ErrorCode() {
		return (EAttribute)ibisipBooleanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIBISIPByte() {
		return ibisipByteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPByte_Value() {
		return (EAttribute)ibisipByteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPByte_ErrorCode() {
		return (EAttribute)ibisipByteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIBISIPDate() {
		return ibisipDateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPDate_Value() {
		return (EAttribute)ibisipDateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPDate_ErrorCode() {
		return (EAttribute)ibisipDateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIBISIPDateTime() {
		return ibisipDateTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPDateTime_Value() {
		return (EAttribute)ibisipDateTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPDateTime_ErrorCode() {
		return (EAttribute)ibisipDateTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIBISIPDouble() {
		return ibisipDoubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPDouble_Value() {
		return (EAttribute)ibisipDoubleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPDouble_ErrorCode() {
		return (EAttribute)ibisipDoubleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIBISIPDuration() {
		return ibisipDurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPDuration_Value() {
		return (EAttribute)ibisipDurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPDuration_ErrorCode() {
		return (EAttribute)ibisipDurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIBISIPInt() {
		return ibisipIntEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPInt_Value() {
		return (EAttribute)ibisipIntEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPInt_ErrorCode() {
		return (EAttribute)ibisipIntEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIBISIPLanguage() {
		return ibisipLanguageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPLanguage_Value() {
		return (EAttribute)ibisipLanguageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPLanguage_ErrorCode() {
		return (EAttribute)ibisipLanguageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIBISIPNMTOKEN() {
		return ibisipnmtokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPNMTOKEN_Value() {
		return (EAttribute)ibisipnmtokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPNMTOKEN_ErrorCode() {
		return (EAttribute)ibisipnmtokenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIBISIPNonNegativeInteger() {
		return ibisipNonNegativeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPNonNegativeInteger_Value() {
		return (EAttribute)ibisipNonNegativeIntegerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPNonNegativeInteger_ErrorCode() {
		return (EAttribute)ibisipNonNegativeIntegerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIBISIPNormalizedString() {
		return ibisipNormalizedStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPNormalizedString_Value() {
		return (EAttribute)ibisipNormalizedStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPNormalizedString_ErrorCode() {
		return (EAttribute)ibisipNormalizedStringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIBISIPString() {
		return ibisipStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPString_Value() {
		return (EAttribute)ibisipStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPString_ErrorCode() {
		return (EAttribute)ibisipStringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIBISIPTime() {
		return ibisipTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPTime_Value() {
		return (EAttribute)ibisipTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPTime_ErrorCode() {
		return (EAttribute)ibisipTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIBISIPUnsignedInt() {
		return ibisipUnsignedIntEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPUnsignedInt_Value() {
		return (EAttribute)ibisipUnsignedIntEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPUnsignedInt_ErrorCode() {
		return (EAttribute)ibisipUnsignedIntEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIBISIPUnsignedLong() {
		return ibisipUnsignedLongEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPUnsignedLong_Value() {
		return (EAttribute)ibisipUnsignedLongEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPUnsignedLong_ErrorCode() {
		return (EAttribute)ibisipUnsignedLongEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternationalTextType() {
		return internationalTextTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternationalTextType_Value() {
		return (EAttribute)internationalTextTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternationalTextType_Language() {
		return (EAttribute)internationalTextTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternationalTextType_ErrorCode() {
		return (EAttribute)internationalTextTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJourneyStopInformation() {
		return journeyStopInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourneyStopInformation_StopRef() {
		return (EReference)journeyStopInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourneyStopInformation_StopName() {
		return (EReference)journeyStopInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourneyStopInformation_StopAlternativeName() {
		return (EReference)journeyStopInformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourneyStopInformation_Platform() {
		return (EReference)journeyStopInformationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourneyStopInformation_DisplayContent() {
		return (EReference)journeyStopInformationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourneyStopInformation_Announcement() {
		return (EReference)journeyStopInformationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourneyStopInformation_ArrivalScheduled() {
		return (EReference)journeyStopInformationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourneyStopInformation_DepartureScheduled() {
		return (EReference)journeyStopInformationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourneyStopInformation_Connection() {
		return (EReference)journeyStopInformationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourneyStopInformation_BayArea() {
		return (EReference)journeyStopInformationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourneyStopInformation_GNSSPoint() {
		return (EReference)journeyStopInformationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourneyStopInformation_FareZone() {
		return (EReference)journeyStopInformationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLineInformation() {
		return lineInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLineInformation_LineRef() {
		return (EReference)lineInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLineInformation_LineName() {
		return (EReference)lineInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLineInformation_LineShortName() {
		return (EReference)lineInformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLineInformation_LineNumber() {
		return (EReference)lineInformationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLineInformation_LineCode() {
		return (EReference)lineInformationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogMessage() {
		return logMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogMessage_MessageProvider() {
		return (EReference)logMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogMessage_Message() {
		return (EReference)logMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMessage_MessageID() {
		return (EReference)messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMessage_TimeStamp() {
		return (EReference)messageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessage_MessageType() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMessage_MessageText() {
		return (EReference)messageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetexMode() {
		return netexModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetexMode_PtMainMode() {
		return (EAttribute)netexModeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetexMode_PrivateMainMode() {
		return (EAttribute)netexModeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetexMode_AirSubmode() {
		return (EAttribute)netexModeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetexMode_BusSubmode() {
		return (EAttribute)netexModeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetexMode_CoachSubmode() {
		return (EAttribute)netexModeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetexMode_FunicularSubmode() {
		return (EAttribute)netexModeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetexMode_MetroSubmode() {
		return (EAttribute)netexModeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetexMode_TramSubmode() {
		return (EAttribute)netexModeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetexMode_TelecabinSubmode() {
		return (EAttribute)netexModeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetexMode_RailSubmode() {
		return (EAttribute)netexModeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetexMode_WaterSubmode() {
		return (EAttribute)netexModeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetexMode_TaxiSubmode() {
		return (EAttribute)netexModeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetexMode_SelfDriveSubmode() {
		return (EAttribute)netexModeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPointSequence() {
		return pointSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPointSequence_Point() {
		return (EReference)pointSequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPoint() {
		return pointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPoint_PointIndex() {
		return (EReference)pointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPoint_PointType() {
		return (EReference)pointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPoint_DistanceToPreviousPoint() {
		return (EReference)pointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPointType() {
		return pointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPointType_StopPoint() {
		return (EReference)pointTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPointType_BeaconPoint() {
		return (EReference)pointTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPointType_GNSSLocationPoint() {
		return (EReference)pointTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPointType_TimingPoint() {
		return (EReference)pointTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPointType_TSPPoint() {
		return (EReference)pointTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceIdentification() {
		return serviceIdentificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceIdentification_Service() {
		return (EReference)serviceIdentificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceIdentification_Device() {
		return (EReference)serviceIdentificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceIdentificationWithStateList() {
		return serviceIdentificationWithStateListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceIdentificationWithStateList_ServiceIdentificationWithState() {
		return (EReference)serviceIdentificationWithStateListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceIdentificationWithState() {
		return serviceIdentificationWithStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceIdentificationWithState_ServiceIdentification() {
		return (EReference)serviceIdentificationWithStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceIdentificationWithState_ServiceState() {
		return (EAttribute)serviceIdentificationWithStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceInformationList() {
		return serviceInformationListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceInformationList_ServiceInformation() {
		return (EReference)serviceInformationListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceInformation() {
		return serviceInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceInformation_Service() {
		return (EReference)serviceInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceInformation_Autostart() {
		return (EReference)serviceInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceSpecification() {
		return serviceSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceSpecification_ServiceName() {
		return (EAttribute)serviceSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceSpecification_IBISIPVersion() {
		return (EReference)serviceSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceSpecificationWithStateList() {
		return serviceSpecificationWithStateListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceSpecificationWithStateList_ServiceSpecificationWithState() {
		return (EReference)serviceSpecificationWithStateListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceSpecificationWithState() {
		return serviceSpecificationWithStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceSpecificationWithState_ServiceSpecification() {
		return (EReference)serviceSpecificationWithStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceSpecificationWithState_ServiceState() {
		return (EAttribute)serviceSpecificationWithStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceStartList() {
		return serviceStartListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceStartList_ServiceIdentification() {
		return (EReference)serviceStartListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceStart() {
		return serviceStartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceStart_ServiceIdentification() {
		return (EReference)serviceStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceStart_Autostart() {
		return (EReference)serviceStartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShortTripStopList() {
		return shortTripStopListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShortTripStopList_ShortTripStop() {
		return (EReference)shortTripStopListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShortTripStop() {
		return shortTripStopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShortTripStop_JourneyStopInformation() {
		return (EReference)shortTripStopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShortTripStop_FareZoneInformation() {
		return (EReference)shortTripStopEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpecificPoint() {
		return specificPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpecificPoint_PointRef() {
		return (EReference)specificPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpecificPoint_DistanceToPreviousPoint() {
		return (EReference)specificPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStopInformationRequest() {
		return stopInformationRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationRequest_StopIndex() {
		return (EReference)stopInformationRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationRequest_StopRef() {
		return (EReference)stopInformationRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationRequest_StopName() {
		return (EReference)stopInformationRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationRequest_DisplayContent() {
		return (EReference)stopInformationRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationRequest_StopAnnouncement() {
		return (EReference)stopInformationRequestEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationRequest_ArrivalScheduled() {
		return (EReference)stopInformationRequestEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationRequest_DepartureScheduled() {
		return (EReference)stopInformationRequestEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationRequest_RecordedArrivalTime() {
		return (EReference)stopInformationRequestEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationRequest_DistanceToNextStop() {
		return (EReference)stopInformationRequestEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationRequest_Connection() {
		return (EReference)stopInformationRequestEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationRequest_FareZone() {
		return (EReference)stopInformationRequestEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStopInformation() {
		return stopInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformation_StopIndex() {
		return (EReference)stopInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformation_StopRef() {
		return (EReference)stopInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformation_StopName() {
		return (EReference)stopInformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformation_StopAlternativeName() {
		return (EReference)stopInformationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformation_Platform() {
		return (EReference)stopInformationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformation_DisplayContent() {
		return (EReference)stopInformationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformation_StopAnnouncement() {
		return (EReference)stopInformationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformation_ArrivalScheduled() {
		return (EReference)stopInformationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformation_ArrivalExpected() {
		return (EReference)stopInformationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformation_DepartureScheduled() {
		return (EReference)stopInformationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformation_DepartureExpected() {
		return (EReference)stopInformationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformation_RecordedArrivalTime() {
		return (EReference)stopInformationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformation_DistanceToNextStop() {
		return (EReference)stopInformationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformation_Connection() {
		return (EReference)stopInformationEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformation_FareZone() {
		return (EReference)stopInformationEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStopPointTariffInformation() {
		return stopPointTariffInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopPointTariffInformation_JourneyStopInformation() {
		return (EReference)stopPointTariffInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopPointTariffInformation_FareZoneInformation() {
		return (EReference)stopPointTariffInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStopSequence() {
		return stopSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopSequence_StopPoint() {
		return (EReference)stopSequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubscribeRequest() {
		return subscribeRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubscribeRequest_ClientIPAddress() {
		return (EReference)subscribeRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubscribeRequest_ReplyPort() {
		return (EReference)subscribeRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubscribeRequest_ReplyPath() {
		return (EReference)subscribeRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubscribeResponse() {
		return subscribeResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubscribeResponse_Active() {
		return (EReference)subscribeResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubscribeResponse_Heartbeat() {
		return (EReference)subscribeResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimingPoint() {
		return timingPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimingPoint_TimingPointRef() {
		return (EReference)timingPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimingPoint_ScheduleTime() {
		return (EReference)timingPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimingPoint_GNSSPoint() {
		return (EReference)timingPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTripInformation() {
		return tripInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformation_TripRef() {
		return (EReference)tripInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformation_StopSequence() {
		return (EReference)tripInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTripInformation_LocationState() {
		return (EAttribute)tripInformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformation_TimetableDelay() {
		return (EReference)tripInformationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformation_AdditionalTextMessage() {
		return (EReference)tripInformationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformation_AdditionalTextMessage1() {
		return (EReference)tripInformationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformation_AdditionalTextMessage2() {
		return (EReference)tripInformationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformation_AdditionalTextMessage3() {
		return (EReference)tripInformationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformation_AdditionalTextMessage4() {
		return (EReference)tripInformationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformation_AdditionalTextMessage5() {
		return (EReference)tripInformationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformation_AdditionalTextMessage6() {
		return (EReference)tripInformationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformation_AdditionalTextMessage7() {
		return (EReference)tripInformationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformation_AdditionalTextMessage8() {
		return (EReference)tripInformationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformation_AdditionalTextMessage9() {
		return (EReference)tripInformationEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformation_AdditionalAnnouncement() {
		return (EReference)tripInformationEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTripInformation_RouteDirection() {
		return (EAttribute)tripInformationEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformation_RunNumber() {
		return (EReference)tripInformationEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformation_PatternNumber() {
		return (EReference)tripInformationEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformation_PathDestinationNumber() {
		return (EReference)tripInformationEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTripSequence() {
		return tripSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripSequence_TripRef() {
		return (EReference)tripSequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripSequence_TripIndex() {
		return (EReference)tripSequenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripSequence_TripStart() {
		return (EReference)tripSequenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripSequence_CurrentStopIndex() {
		return (EReference)tripSequenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTripSequence_JourneyMode() {
		return (EAttribute)tripSequenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripSequence_PointSequence() {
		return (EReference)tripSequenceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTSPPoint() {
		return tspPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTSPPoint_TSPPointRef() {
		return (EReference)tspPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTSPPoint_TSPCode() {
		return (EReference)tspPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTSPPoint_ShortName() {
		return (EReference)tspPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTSPPoint_Desciption() {
		return (EReference)tspPointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnsubscribeRequest() {
		return unsubscribeRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnsubscribeRequest_ClientIPAddress() {
		return (EReference)unsubscribeRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnsubscribeRequest_ReplyPort() {
		return (EReference)unsubscribeRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnsubscribeRequest_ReplyPath() {
		return (EReference)unsubscribeRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnsubscribeResponse() {
		return unsubscribeResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnsubscribeResponse_Active() {
		return (EReference)unsubscribeResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVehicle() {
		return vehicleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVehicle_VehicleTypeRef() {
		return (EReference)vehicleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVehicle_Name() {
		return (EReference)vehicleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getViaPoint() {
		return viaPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViaPoint_ViaPointRef() {
		return (EReference)viaPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViaPoint_PlaceRef() {
		return (EReference)viaPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViaPoint_PlaceName() {
		return (EReference)viaPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViaPoint_PlaceShortName() {
		return (EReference)viaPointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViaPoint_ViaPointDisplayPriority() {
		return (EReference)viaPointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZoneType() {
		return zoneTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZoneType_FarezoneTypeID() {
		return (EReference)zoneTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZoneType_FareZoneTypeName() {
		return (EReference)zoneTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeneralResponse() {
		return generalResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGeneralResponse_OperationErrorMessage() {
		return (EReference)generalResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IbisCommonFactory getIbisCommonFactory() {
		return (IbisCommonFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		additionalAnnouncementEClass = createEClass(ADDITIONAL_ANNOUNCEMENT);
		createEReference(additionalAnnouncementEClass, ADDITIONAL_ANNOUNCEMENT__ANNOUNCEMENT_REF);
		createEReference(additionalAnnouncementEClass, ADDITIONAL_ANNOUNCEMENT__ANNOUNCEMENT_TEXT);
		createEReference(additionalAnnouncementEClass, ADDITIONAL_ANNOUNCEMENT__ANNOUNCEMENT_TTS_TEXT);
		createEReference(additionalAnnouncementEClass, ADDITIONAL_ANNOUNCEMENT__IMMEDIATE_INFORMATION);
		createEReference(additionalAnnouncementEClass, ADDITIONAL_ANNOUNCEMENT__PERIODICAL_INFORMATION);
		createEReference(additionalAnnouncementEClass, ADDITIONAL_ANNOUNCEMENT__SPECIFIC_POINT);

		announcementEClass = createEClass(ANNOUNCEMENT);
		createEReference(announcementEClass, ANNOUNCEMENT__ANNOUNCEMENT_REF);
		createEReference(announcementEClass, ANNOUNCEMENT__ANNOUNCEMENT_TEXT);
		createEReference(announcementEClass, ANNOUNCEMENT__ANNOUNCEMENT_TTS_TEXT);

		bayAreaEClass = createEClass(BAY_AREA);
		createEReference(bayAreaEClass, BAY_AREA__BEFORE_BAY);
		createEReference(bayAreaEClass, BAY_AREA__BEHIND_BAY);

		beaconPointEClass = createEClass(BEACON_POINT);
		createEReference(beaconPointEClass, BEACON_POINT__POINT_REF);
		createEReference(beaconPointEClass, BEACON_POINT__BEACON_CODE);
		createEReference(beaconPointEClass, BEACON_POINT__SHORT_NAME);
		createEReference(beaconPointEClass, BEACON_POINT__DESCIPTION);

		cardApplInformationsEClass = createEClass(CARD_APPL_INFORMATIONS);
		createEReference(cardApplInformationsEClass, CARD_APPL_INFORMATIONS__CARD_APPL_INFORMATION_LENGTH);
		createEReference(cardApplInformationsEClass, CARD_APPL_INFORMATIONS__CARD_APPL_INFORMATION_DATA);

		cardTicketDataEClass = createEClass(CARD_TICKET_DATA);
		createEReference(cardTicketDataEClass, CARD_TICKET_DATA__CARD_TICKET_DATA_ID);
		createEReference(cardTicketDataEClass, CARD_TICKET_DATA__CARD_TICKET_DATA_LENGTH);
		createEReference(cardTicketDataEClass, CARD_TICKET_DATA__CARD_TICKET_DATA);

		cardTypeEClass = createEClass(CARD_TYPE);
		createEReference(cardTypeEClass, CARD_TYPE__CARD_SERIAL_NUMBER);
		createEReference(cardTypeEClass, CARD_TYPE__CARD_TYPE_ID);
		createEReference(cardTypeEClass, CARD_TYPE__CARD_TYPE_TEXT);

		connectionEClass = createEClass(CONNECTION);
		createEReference(connectionEClass, CONNECTION__STOP_REF);
		createEReference(connectionEClass, CONNECTION__CONNECTION_REF);
		createEAttribute(connectionEClass, CONNECTION__CONNECTION_TYPE);
		createEReference(connectionEClass, CONNECTION__DISPLAY_CONTENT);
		createEReference(connectionEClass, CONNECTION__PLATFORM);
		createEAttribute(connectionEClass, CONNECTION__CONNECTION_STATE);
		createEReference(connectionEClass, CONNECTION__TRANSPORT_MODE);
		createEReference(connectionEClass, CONNECTION__CONNECTION_MODE);
		createEReference(connectionEClass, CONNECTION__EXPECTED_DEPARTURE_TIME);
		createEReference(connectionEClass, CONNECTION__SCHEDULED_DEPARTURE_TIME);

		dataAcceptedResponseDataEClass = createEClass(DATA_ACCEPTED_RESPONSE_DATA);
		createEReference(dataAcceptedResponseDataEClass, DATA_ACCEPTED_RESPONSE_DATA__TIME_STAMP);
		createEReference(dataAcceptedResponseDataEClass, DATA_ACCEPTED_RESPONSE_DATA__DATA_ACCEPTED);
		createEAttribute(dataAcceptedResponseDataEClass, DATA_ACCEPTED_RESPONSE_DATA__ERROR_CODE);
		createEReference(dataAcceptedResponseDataEClass, DATA_ACCEPTED_RESPONSE_DATA__ERROR_INFORMATION);

		dataAcceptedResponseEClass = createEClass(DATA_ACCEPTED_RESPONSE);
		createEReference(dataAcceptedResponseEClass, DATA_ACCEPTED_RESPONSE__DATA_ACCEPTED_RESPONSE_DATA);

		dataVersionListEClass = createEClass(DATA_VERSION_LIST);
		createEReference(dataVersionListEClass, DATA_VERSION_LIST__DATA_VERSION);

		dataVersionEClass = createEClass(DATA_VERSION);
		createEReference(dataVersionEClass, DATA_VERSION__DATA_TYPE);
		createEReference(dataVersionEClass, DATA_VERSION__VERSION_REF);

		degreeTypeEClass = createEClass(DEGREE_TYPE);
		createEReference(degreeTypeEClass, DEGREE_TYPE__DEGREE);
		createEReference(degreeTypeEClass, DEGREE_TYPE__ORIENTATION);

		destinationEClass = createEClass(DESTINATION);
		createEReference(destinationEClass, DESTINATION__DESTINATION_REF);
		createEReference(destinationEClass, DESTINATION__DESTINATION_NAME);
		createEReference(destinationEClass, DESTINATION__DESTINATION_SHORT_NAME);

		deviceInformationEClass = createEClass(DEVICE_INFORMATION);
		createEReference(deviceInformationEClass, DEVICE_INFORMATION__DEVICE_NAME);
		createEReference(deviceInformationEClass, DEVICE_INFORMATION__MANUFACTURER);
		createEReference(deviceInformationEClass, DEVICE_INFORMATION__SERIAL_NUMBER);
		createEAttribute(deviceInformationEClass, DEVICE_INFORMATION__DEVICE_CLASS);
		createEReference(deviceInformationEClass, DEVICE_INFORMATION__DATA_VERSION_LIST);
		createEReference(deviceInformationEClass, DEVICE_INFORMATION__WEB_INTERFACE_ADDRESS);

		deviceSpecificationListEClass = createEClass(DEVICE_SPECIFICATION_LIST);
		createEReference(deviceSpecificationListEClass, DEVICE_SPECIFICATION_LIST__DEVICE_SPECIFICATION);

		deviceSpecificationEClass = createEClass(DEVICE_SPECIFICATION);
		createEAttribute(deviceSpecificationEClass, DEVICE_SPECIFICATION__DEVICE_CLASS);
		createEReference(deviceSpecificationEClass, DEVICE_SPECIFICATION__DEVICE_ID);

		deviceSpecificationWithStateListEClass = createEClass(DEVICE_SPECIFICATION_WITH_STATE_LIST);
		createEReference(deviceSpecificationWithStateListEClass, DEVICE_SPECIFICATION_WITH_STATE_LIST__DEVICE_SPECIFICATION_WITH_STATE);

		deviceSpecificationWithStateEClass = createEClass(DEVICE_SPECIFICATION_WITH_STATE);
		createEReference(deviceSpecificationWithStateEClass, DEVICE_SPECIFICATION_WITH_STATE__DEVICE_SPECIFICATION);
		createEAttribute(deviceSpecificationWithStateEClass, DEVICE_SPECIFICATION_WITH_STATE__DEVICE_STATE);

		displayContentEClass = createEClass(DISPLAY_CONTENT);
		createEReference(displayContentEClass, DISPLAY_CONTENT__DISPLAY_CONTENT_REF);
		createEReference(displayContentEClass, DISPLAY_CONTENT__LINE_INFORMATION);
		createEReference(displayContentEClass, DISPLAY_CONTENT__DESTINATION);
		createEReference(displayContentEClass, DISPLAY_CONTENT__VIA_POINT);
		createEReference(displayContentEClass, DISPLAY_CONTENT__ADDITIONAL_INFORMATION);
		createEReference(displayContentEClass, DISPLAY_CONTENT__ADDITIONAL_INFORMATION1);
		createEReference(displayContentEClass, DISPLAY_CONTENT__ADDITIONAL_INFORMATION2);
		createEReference(displayContentEClass, DISPLAY_CONTENT__ADDITIONAL_INFORMATION3);
		createEReference(displayContentEClass, DISPLAY_CONTENT__ADDITIONAL_INFORMATION4);
		createEReference(displayContentEClass, DISPLAY_CONTENT__ADDITIONAL_INFORMATION5);
		createEReference(displayContentEClass, DISPLAY_CONTENT__ADDITIONAL_INFORMATION6);
		createEReference(displayContentEClass, DISPLAY_CONTENT__ADDITIONAL_INFORMATION7);
		createEReference(displayContentEClass, DISPLAY_CONTENT__ADDITIONAL_INFORMATION8);
		createEReference(displayContentEClass, DISPLAY_CONTENT__ADDITIONAL_INFORMATION9);
		createEReference(displayContentEClass, DISPLAY_CONTENT__RUN_NUMBER);
		createEReference(displayContentEClass, DISPLAY_CONTENT__PRIORITY);
		createEReference(displayContentEClass, DISPLAY_CONTENT__PERIOD_DURATION);
		createEReference(displayContentEClass, DISPLAY_CONTENT__DURATION);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__AIR_SUBMODE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__BUS_SUBMODE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__COACH_SUBMODE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DATA_ACCEPTED_RESPONSE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__FUNICULAR_SUBMODE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__METRO_SUBMODE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__RAIL_SUBMODE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SELF_DRIVE_SUBMODE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SUBSCRIBE_REQUEST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SUBSCRIBE_RESPONSE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TAXI_SUBMODE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TELECABIN_SUBMODE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TRAM_SUBMODE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__UNSUBSCRIBE_REQUEST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__UNSUBSCRIBE_RESPONSE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__WATER_SUBMODE);

		doorCountingListEClass = createEClass(DOOR_COUNTING_LIST);
		createEReference(doorCountingListEClass, DOOR_COUNTING_LIST__DOOR_ID);
		createEReference(doorCountingListEClass, DOOR_COUNTING_LIST__COUNT_SET);

		doorCountingEClass = createEClass(DOOR_COUNTING);
		createEAttribute(doorCountingEClass, DOOR_COUNTING__OBJECT_CLASS);
		createEReference(doorCountingEClass, DOOR_COUNTING__IN);
		createEReference(doorCountingEClass, DOOR_COUNTING__OUT);
		createEAttribute(doorCountingEClass, DOOR_COUNTING__COUNT_QUALITY);

		doorInformationEClass = createEClass(DOOR_INFORMATION);
		createEReference(doorInformationEClass, DOOR_INFORMATION__DOOR_ID);
		createEReference(doorInformationEClass, DOOR_INFORMATION__COUNT);
		createEReference(doorInformationEClass, DOOR_INFORMATION__STATE);

		doorOpenStateEClass = createEClass(DOOR_OPEN_STATE);
		createEAttribute(doorOpenStateEClass, DOOR_OPEN_STATE__VALUE);
		createEAttribute(doorOpenStateEClass, DOOR_OPEN_STATE__ERROR_CODE);

		doorOperationStateEClass = createEClass(DOOR_OPERATION_STATE);
		createEAttribute(doorOperationStateEClass, DOOR_OPERATION_STATE__VALUE);
		createEAttribute(doorOperationStateEClass, DOOR_OPERATION_STATE__ERROR_CODE);

		doorStateEClass = createEClass(DOOR_STATE);
		createEReference(doorStateEClass, DOOR_STATE__OPEN_STATE);
		createEReference(doorStateEClass, DOOR_STATE__OPERATION_STATE);

		fareZoneInformationEClass = createEClass(FARE_ZONE_INFORMATION);
		createEReference(fareZoneInformationEClass, FARE_ZONE_INFORMATION__FARE_ZONE_ID);
		createEReference(fareZoneInformationEClass, FARE_ZONE_INFORMATION__FARE_ZONE_TYPE);
		createEReference(fareZoneInformationEClass, FARE_ZONE_INFORMATION__FARE_ZONE_LONG_NAME);
		createEReference(fareZoneInformationEClass, FARE_ZONE_INFORMATION__FARE_ZONE_SHORT_NAME);

		globalCardStatusEClass = createEClass(GLOBAL_CARD_STATUS);
		createEReference(globalCardStatusEClass, GLOBAL_CARD_STATUS__GLOBAL_CARD_STAUS_ID);
		createEReference(globalCardStatusEClass, GLOBAL_CARD_STATUS__GLOBAL_CARD_STATUS_TEXT);

		gnssCoordinateEClass = createEClass(GNSS_COORDINATE);
		createEReference(gnssCoordinateEClass, GNSS_COORDINATE__DEGREE);
		createEReference(gnssCoordinateEClass, GNSS_COORDINATE__DIRECTION);

		gnssPointEClass = createEClass(GNSS_POINT);
		createEReference(gnssPointEClass, GNSS_POINT__POINT_REF);
		createEReference(gnssPointEClass, GNSS_POINT__LONGITUDE);
		createEReference(gnssPointEClass, GNSS_POINT__LATITUDE);
		createEReference(gnssPointEClass, GNSS_POINT__ALTITUDE);

		ibisipAnyURIEClass = createEClass(IBISIP_ANY_URI);
		createEAttribute(ibisipAnyURIEClass, IBISIP_ANY_URI__VALUE);
		createEAttribute(ibisipAnyURIEClass, IBISIP_ANY_URI__ERROR_CODE);

		ibisipBooleanEClass = createEClass(IBISIP_BOOLEAN);
		createEAttribute(ibisipBooleanEClass, IBISIP_BOOLEAN__VALUE);
		createEAttribute(ibisipBooleanEClass, IBISIP_BOOLEAN__ERROR_CODE);

		ibisipByteEClass = createEClass(IBISIP_BYTE);
		createEAttribute(ibisipByteEClass, IBISIP_BYTE__VALUE);
		createEAttribute(ibisipByteEClass, IBISIP_BYTE__ERROR_CODE);

		ibisipDateEClass = createEClass(IBISIP_DATE);
		createEAttribute(ibisipDateEClass, IBISIP_DATE__VALUE);
		createEAttribute(ibisipDateEClass, IBISIP_DATE__ERROR_CODE);

		ibisipDateTimeEClass = createEClass(IBISIP_DATE_TIME);
		createEAttribute(ibisipDateTimeEClass, IBISIP_DATE_TIME__VALUE);
		createEAttribute(ibisipDateTimeEClass, IBISIP_DATE_TIME__ERROR_CODE);

		ibisipDoubleEClass = createEClass(IBISIP_DOUBLE);
		createEAttribute(ibisipDoubleEClass, IBISIP_DOUBLE__VALUE);
		createEAttribute(ibisipDoubleEClass, IBISIP_DOUBLE__ERROR_CODE);

		ibisipDurationEClass = createEClass(IBISIP_DURATION);
		createEAttribute(ibisipDurationEClass, IBISIP_DURATION__VALUE);
		createEAttribute(ibisipDurationEClass, IBISIP_DURATION__ERROR_CODE);

		ibisipIntEClass = createEClass(IBISIP_INT);
		createEAttribute(ibisipIntEClass, IBISIP_INT__VALUE);
		createEAttribute(ibisipIntEClass, IBISIP_INT__ERROR_CODE);

		ibisipLanguageEClass = createEClass(IBISIP_LANGUAGE);
		createEAttribute(ibisipLanguageEClass, IBISIP_LANGUAGE__VALUE);
		createEAttribute(ibisipLanguageEClass, IBISIP_LANGUAGE__ERROR_CODE);

		ibisipnmtokenEClass = createEClass(IBISIPNMTOKEN);
		createEAttribute(ibisipnmtokenEClass, IBISIPNMTOKEN__VALUE);
		createEAttribute(ibisipnmtokenEClass, IBISIPNMTOKEN__ERROR_CODE);

		ibisipNonNegativeIntegerEClass = createEClass(IBISIP_NON_NEGATIVE_INTEGER);
		createEAttribute(ibisipNonNegativeIntegerEClass, IBISIP_NON_NEGATIVE_INTEGER__VALUE);
		createEAttribute(ibisipNonNegativeIntegerEClass, IBISIP_NON_NEGATIVE_INTEGER__ERROR_CODE);

		ibisipNormalizedStringEClass = createEClass(IBISIP_NORMALIZED_STRING);
		createEAttribute(ibisipNormalizedStringEClass, IBISIP_NORMALIZED_STRING__VALUE);
		createEAttribute(ibisipNormalizedStringEClass, IBISIP_NORMALIZED_STRING__ERROR_CODE);

		ibisipStringEClass = createEClass(IBISIP_STRING);
		createEAttribute(ibisipStringEClass, IBISIP_STRING__VALUE);
		createEAttribute(ibisipStringEClass, IBISIP_STRING__ERROR_CODE);

		ibisipTimeEClass = createEClass(IBISIP_TIME);
		createEAttribute(ibisipTimeEClass, IBISIP_TIME__VALUE);
		createEAttribute(ibisipTimeEClass, IBISIP_TIME__ERROR_CODE);

		ibisipUnsignedIntEClass = createEClass(IBISIP_UNSIGNED_INT);
		createEAttribute(ibisipUnsignedIntEClass, IBISIP_UNSIGNED_INT__VALUE);
		createEAttribute(ibisipUnsignedIntEClass, IBISIP_UNSIGNED_INT__ERROR_CODE);

		ibisipUnsignedLongEClass = createEClass(IBISIP_UNSIGNED_LONG);
		createEAttribute(ibisipUnsignedLongEClass, IBISIP_UNSIGNED_LONG__VALUE);
		createEAttribute(ibisipUnsignedLongEClass, IBISIP_UNSIGNED_LONG__ERROR_CODE);

		internationalTextTypeEClass = createEClass(INTERNATIONAL_TEXT_TYPE);
		createEAttribute(internationalTextTypeEClass, INTERNATIONAL_TEXT_TYPE__VALUE);
		createEAttribute(internationalTextTypeEClass, INTERNATIONAL_TEXT_TYPE__LANGUAGE);
		createEAttribute(internationalTextTypeEClass, INTERNATIONAL_TEXT_TYPE__ERROR_CODE);

		journeyStopInformationEClass = createEClass(JOURNEY_STOP_INFORMATION);
		createEReference(journeyStopInformationEClass, JOURNEY_STOP_INFORMATION__STOP_REF);
		createEReference(journeyStopInformationEClass, JOURNEY_STOP_INFORMATION__STOP_NAME);
		createEReference(journeyStopInformationEClass, JOURNEY_STOP_INFORMATION__STOP_ALTERNATIVE_NAME);
		createEReference(journeyStopInformationEClass, JOURNEY_STOP_INFORMATION__PLATFORM);
		createEReference(journeyStopInformationEClass, JOURNEY_STOP_INFORMATION__DISPLAY_CONTENT);
		createEReference(journeyStopInformationEClass, JOURNEY_STOP_INFORMATION__ANNOUNCEMENT);
		createEReference(journeyStopInformationEClass, JOURNEY_STOP_INFORMATION__ARRIVAL_SCHEDULED);
		createEReference(journeyStopInformationEClass, JOURNEY_STOP_INFORMATION__DEPARTURE_SCHEDULED);
		createEReference(journeyStopInformationEClass, JOURNEY_STOP_INFORMATION__CONNECTION);
		createEReference(journeyStopInformationEClass, JOURNEY_STOP_INFORMATION__BAY_AREA);
		createEReference(journeyStopInformationEClass, JOURNEY_STOP_INFORMATION__GNSS_POINT);
		createEReference(journeyStopInformationEClass, JOURNEY_STOP_INFORMATION__FARE_ZONE);

		lineInformationEClass = createEClass(LINE_INFORMATION);
		createEReference(lineInformationEClass, LINE_INFORMATION__LINE_REF);
		createEReference(lineInformationEClass, LINE_INFORMATION__LINE_NAME);
		createEReference(lineInformationEClass, LINE_INFORMATION__LINE_SHORT_NAME);
		createEReference(lineInformationEClass, LINE_INFORMATION__LINE_NUMBER);
		createEReference(lineInformationEClass, LINE_INFORMATION__LINE_CODE);

		logMessageEClass = createEClass(LOG_MESSAGE);
		createEReference(logMessageEClass, LOG_MESSAGE__MESSAGE_PROVIDER);
		createEReference(logMessageEClass, LOG_MESSAGE__MESSAGE);

		messageEClass = createEClass(MESSAGE);
		createEReference(messageEClass, MESSAGE__MESSAGE_ID);
		createEReference(messageEClass, MESSAGE__TIME_STAMP);
		createEAttribute(messageEClass, MESSAGE__MESSAGE_TYPE);
		createEReference(messageEClass, MESSAGE__MESSAGE_TEXT);

		netexModeEClass = createEClass(NETEX_MODE);
		createEAttribute(netexModeEClass, NETEX_MODE__PT_MAIN_MODE);
		createEAttribute(netexModeEClass, NETEX_MODE__PRIVATE_MAIN_MODE);
		createEAttribute(netexModeEClass, NETEX_MODE__AIR_SUBMODE);
		createEAttribute(netexModeEClass, NETEX_MODE__BUS_SUBMODE);
		createEAttribute(netexModeEClass, NETEX_MODE__COACH_SUBMODE);
		createEAttribute(netexModeEClass, NETEX_MODE__FUNICULAR_SUBMODE);
		createEAttribute(netexModeEClass, NETEX_MODE__METRO_SUBMODE);
		createEAttribute(netexModeEClass, NETEX_MODE__TRAM_SUBMODE);
		createEAttribute(netexModeEClass, NETEX_MODE__TELECABIN_SUBMODE);
		createEAttribute(netexModeEClass, NETEX_MODE__RAIL_SUBMODE);
		createEAttribute(netexModeEClass, NETEX_MODE__WATER_SUBMODE);
		createEAttribute(netexModeEClass, NETEX_MODE__TAXI_SUBMODE);
		createEAttribute(netexModeEClass, NETEX_MODE__SELF_DRIVE_SUBMODE);

		pointSequenceEClass = createEClass(POINT_SEQUENCE);
		createEReference(pointSequenceEClass, POINT_SEQUENCE__POINT);

		pointEClass = createEClass(POINT);
		createEReference(pointEClass, POINT__POINT_INDEX);
		createEReference(pointEClass, POINT__POINT_TYPE);
		createEReference(pointEClass, POINT__DISTANCE_TO_PREVIOUS_POINT);

		pointTypeEClass = createEClass(POINT_TYPE);
		createEReference(pointTypeEClass, POINT_TYPE__STOP_POINT);
		createEReference(pointTypeEClass, POINT_TYPE__BEACON_POINT);
		createEReference(pointTypeEClass, POINT_TYPE__GNSS_LOCATION_POINT);
		createEReference(pointTypeEClass, POINT_TYPE__TIMING_POINT);
		createEReference(pointTypeEClass, POINT_TYPE__TSP_POINT);

		serviceIdentificationEClass = createEClass(SERVICE_IDENTIFICATION);
		createEReference(serviceIdentificationEClass, SERVICE_IDENTIFICATION__SERVICE);
		createEReference(serviceIdentificationEClass, SERVICE_IDENTIFICATION__DEVICE);

		serviceIdentificationWithStateListEClass = createEClass(SERVICE_IDENTIFICATION_WITH_STATE_LIST);
		createEReference(serviceIdentificationWithStateListEClass, SERVICE_IDENTIFICATION_WITH_STATE_LIST__SERVICE_IDENTIFICATION_WITH_STATE);

		serviceIdentificationWithStateEClass = createEClass(SERVICE_IDENTIFICATION_WITH_STATE);
		createEReference(serviceIdentificationWithStateEClass, SERVICE_IDENTIFICATION_WITH_STATE__SERVICE_IDENTIFICATION);
		createEAttribute(serviceIdentificationWithStateEClass, SERVICE_IDENTIFICATION_WITH_STATE__SERVICE_STATE);

		serviceInformationListEClass = createEClass(SERVICE_INFORMATION_LIST);
		createEReference(serviceInformationListEClass, SERVICE_INFORMATION_LIST__SERVICE_INFORMATION);

		serviceInformationEClass = createEClass(SERVICE_INFORMATION);
		createEReference(serviceInformationEClass, SERVICE_INFORMATION__SERVICE);
		createEReference(serviceInformationEClass, SERVICE_INFORMATION__AUTOSTART);

		serviceSpecificationEClass = createEClass(SERVICE_SPECIFICATION);
		createEAttribute(serviceSpecificationEClass, SERVICE_SPECIFICATION__SERVICE_NAME);
		createEReference(serviceSpecificationEClass, SERVICE_SPECIFICATION__IBISIP_VERSION);

		serviceSpecificationWithStateListEClass = createEClass(SERVICE_SPECIFICATION_WITH_STATE_LIST);
		createEReference(serviceSpecificationWithStateListEClass, SERVICE_SPECIFICATION_WITH_STATE_LIST__SERVICE_SPECIFICATION_WITH_STATE);

		serviceSpecificationWithStateEClass = createEClass(SERVICE_SPECIFICATION_WITH_STATE);
		createEReference(serviceSpecificationWithStateEClass, SERVICE_SPECIFICATION_WITH_STATE__SERVICE_SPECIFICATION);
		createEAttribute(serviceSpecificationWithStateEClass, SERVICE_SPECIFICATION_WITH_STATE__SERVICE_STATE);

		serviceStartListEClass = createEClass(SERVICE_START_LIST);
		createEReference(serviceStartListEClass, SERVICE_START_LIST__SERVICE_IDENTIFICATION);

		serviceStartEClass = createEClass(SERVICE_START);
		createEReference(serviceStartEClass, SERVICE_START__SERVICE_IDENTIFICATION);
		createEReference(serviceStartEClass, SERVICE_START__AUTOSTART);

		shortTripStopListEClass = createEClass(SHORT_TRIP_STOP_LIST);
		createEReference(shortTripStopListEClass, SHORT_TRIP_STOP_LIST__SHORT_TRIP_STOP);

		shortTripStopEClass = createEClass(SHORT_TRIP_STOP);
		createEReference(shortTripStopEClass, SHORT_TRIP_STOP__JOURNEY_STOP_INFORMATION);
		createEReference(shortTripStopEClass, SHORT_TRIP_STOP__FARE_ZONE_INFORMATION);

		specificPointEClass = createEClass(SPECIFIC_POINT);
		createEReference(specificPointEClass, SPECIFIC_POINT__POINT_REF);
		createEReference(specificPointEClass, SPECIFIC_POINT__DISTANCE_TO_PREVIOUS_POINT);

		stopInformationRequestEClass = createEClass(STOP_INFORMATION_REQUEST);
		createEReference(stopInformationRequestEClass, STOP_INFORMATION_REQUEST__STOP_INDEX);
		createEReference(stopInformationRequestEClass, STOP_INFORMATION_REQUEST__STOP_REF);
		createEReference(stopInformationRequestEClass, STOP_INFORMATION_REQUEST__STOP_NAME);
		createEReference(stopInformationRequestEClass, STOP_INFORMATION_REQUEST__DISPLAY_CONTENT);
		createEReference(stopInformationRequestEClass, STOP_INFORMATION_REQUEST__STOP_ANNOUNCEMENT);
		createEReference(stopInformationRequestEClass, STOP_INFORMATION_REQUEST__ARRIVAL_SCHEDULED);
		createEReference(stopInformationRequestEClass, STOP_INFORMATION_REQUEST__DEPARTURE_SCHEDULED);
		createEReference(stopInformationRequestEClass, STOP_INFORMATION_REQUEST__RECORDED_ARRIVAL_TIME);
		createEReference(stopInformationRequestEClass, STOP_INFORMATION_REQUEST__DISTANCE_TO_NEXT_STOP);
		createEReference(stopInformationRequestEClass, STOP_INFORMATION_REQUEST__CONNECTION);
		createEReference(stopInformationRequestEClass, STOP_INFORMATION_REQUEST__FARE_ZONE);

		stopInformationEClass = createEClass(STOP_INFORMATION);
		createEReference(stopInformationEClass, STOP_INFORMATION__STOP_INDEX);
		createEReference(stopInformationEClass, STOP_INFORMATION__STOP_REF);
		createEReference(stopInformationEClass, STOP_INFORMATION__STOP_NAME);
		createEReference(stopInformationEClass, STOP_INFORMATION__STOP_ALTERNATIVE_NAME);
		createEReference(stopInformationEClass, STOP_INFORMATION__PLATFORM);
		createEReference(stopInformationEClass, STOP_INFORMATION__DISPLAY_CONTENT);
		createEReference(stopInformationEClass, STOP_INFORMATION__STOP_ANNOUNCEMENT);
		createEReference(stopInformationEClass, STOP_INFORMATION__ARRIVAL_SCHEDULED);
		createEReference(stopInformationEClass, STOP_INFORMATION__ARRIVAL_EXPECTED);
		createEReference(stopInformationEClass, STOP_INFORMATION__DEPARTURE_SCHEDULED);
		createEReference(stopInformationEClass, STOP_INFORMATION__DEPARTURE_EXPECTED);
		createEReference(stopInformationEClass, STOP_INFORMATION__RECORDED_ARRIVAL_TIME);
		createEReference(stopInformationEClass, STOP_INFORMATION__DISTANCE_TO_NEXT_STOP);
		createEReference(stopInformationEClass, STOP_INFORMATION__CONNECTION);
		createEReference(stopInformationEClass, STOP_INFORMATION__FARE_ZONE);

		stopPointTariffInformationEClass = createEClass(STOP_POINT_TARIFF_INFORMATION);
		createEReference(stopPointTariffInformationEClass, STOP_POINT_TARIFF_INFORMATION__JOURNEY_STOP_INFORMATION);
		createEReference(stopPointTariffInformationEClass, STOP_POINT_TARIFF_INFORMATION__FARE_ZONE_INFORMATION);

		stopSequenceEClass = createEClass(STOP_SEQUENCE);
		createEReference(stopSequenceEClass, STOP_SEQUENCE__STOP_POINT);

		subscribeRequestEClass = createEClass(SUBSCRIBE_REQUEST);
		createEReference(subscribeRequestEClass, SUBSCRIBE_REQUEST__CLIENT_IP_ADDRESS);
		createEReference(subscribeRequestEClass, SUBSCRIBE_REQUEST__REPLY_PORT);
		createEReference(subscribeRequestEClass, SUBSCRIBE_REQUEST__REPLY_PATH);

		subscribeResponseEClass = createEClass(SUBSCRIBE_RESPONSE);
		createEReference(subscribeResponseEClass, SUBSCRIBE_RESPONSE__ACTIVE);
		createEReference(subscribeResponseEClass, SUBSCRIBE_RESPONSE__HEARTBEAT);

		timingPointEClass = createEClass(TIMING_POINT);
		createEReference(timingPointEClass, TIMING_POINT__TIMING_POINT_REF);
		createEReference(timingPointEClass, TIMING_POINT__SCHEDULE_TIME);
		createEReference(timingPointEClass, TIMING_POINT__GNSS_POINT);

		tripInformationEClass = createEClass(TRIP_INFORMATION);
		createEReference(tripInformationEClass, TRIP_INFORMATION__TRIP_REF);
		createEReference(tripInformationEClass, TRIP_INFORMATION__STOP_SEQUENCE);
		createEAttribute(tripInformationEClass, TRIP_INFORMATION__LOCATION_STATE);
		createEReference(tripInformationEClass, TRIP_INFORMATION__TIMETABLE_DELAY);
		createEReference(tripInformationEClass, TRIP_INFORMATION__ADDITIONAL_TEXT_MESSAGE);
		createEReference(tripInformationEClass, TRIP_INFORMATION__ADDITIONAL_TEXT_MESSAGE1);
		createEReference(tripInformationEClass, TRIP_INFORMATION__ADDITIONAL_TEXT_MESSAGE2);
		createEReference(tripInformationEClass, TRIP_INFORMATION__ADDITIONAL_TEXT_MESSAGE3);
		createEReference(tripInformationEClass, TRIP_INFORMATION__ADDITIONAL_TEXT_MESSAGE4);
		createEReference(tripInformationEClass, TRIP_INFORMATION__ADDITIONAL_TEXT_MESSAGE5);
		createEReference(tripInformationEClass, TRIP_INFORMATION__ADDITIONAL_TEXT_MESSAGE6);
		createEReference(tripInformationEClass, TRIP_INFORMATION__ADDITIONAL_TEXT_MESSAGE7);
		createEReference(tripInformationEClass, TRIP_INFORMATION__ADDITIONAL_TEXT_MESSAGE8);
		createEReference(tripInformationEClass, TRIP_INFORMATION__ADDITIONAL_TEXT_MESSAGE9);
		createEReference(tripInformationEClass, TRIP_INFORMATION__ADDITIONAL_ANNOUNCEMENT);
		createEAttribute(tripInformationEClass, TRIP_INFORMATION__ROUTE_DIRECTION);
		createEReference(tripInformationEClass, TRIP_INFORMATION__RUN_NUMBER);
		createEReference(tripInformationEClass, TRIP_INFORMATION__PATTERN_NUMBER);
		createEReference(tripInformationEClass, TRIP_INFORMATION__PATH_DESTINATION_NUMBER);

		tripSequenceEClass = createEClass(TRIP_SEQUENCE);
		createEReference(tripSequenceEClass, TRIP_SEQUENCE__TRIP_REF);
		createEReference(tripSequenceEClass, TRIP_SEQUENCE__TRIP_INDEX);
		createEReference(tripSequenceEClass, TRIP_SEQUENCE__TRIP_START);
		createEReference(tripSequenceEClass, TRIP_SEQUENCE__CURRENT_STOP_INDEX);
		createEAttribute(tripSequenceEClass, TRIP_SEQUENCE__JOURNEY_MODE);
		createEReference(tripSequenceEClass, TRIP_SEQUENCE__POINT_SEQUENCE);

		tspPointEClass = createEClass(TSP_POINT);
		createEReference(tspPointEClass, TSP_POINT__TSP_POINT_REF);
		createEReference(tspPointEClass, TSP_POINT__TSP_CODE);
		createEReference(tspPointEClass, TSP_POINT__SHORT_NAME);
		createEReference(tspPointEClass, TSP_POINT__DESCIPTION);

		unsubscribeRequestEClass = createEClass(UNSUBSCRIBE_REQUEST);
		createEReference(unsubscribeRequestEClass, UNSUBSCRIBE_REQUEST__CLIENT_IP_ADDRESS);
		createEReference(unsubscribeRequestEClass, UNSUBSCRIBE_REQUEST__REPLY_PORT);
		createEReference(unsubscribeRequestEClass, UNSUBSCRIBE_REQUEST__REPLY_PATH);

		unsubscribeResponseEClass = createEClass(UNSUBSCRIBE_RESPONSE);
		createEReference(unsubscribeResponseEClass, UNSUBSCRIBE_RESPONSE__ACTIVE);

		vehicleEClass = createEClass(VEHICLE);
		createEReference(vehicleEClass, VEHICLE__VEHICLE_TYPE_REF);
		createEReference(vehicleEClass, VEHICLE__NAME);

		viaPointEClass = createEClass(VIA_POINT);
		createEReference(viaPointEClass, VIA_POINT__VIA_POINT_REF);
		createEReference(viaPointEClass, VIA_POINT__PLACE_REF);
		createEReference(viaPointEClass, VIA_POINT__PLACE_NAME);
		createEReference(viaPointEClass, VIA_POINT__PLACE_SHORT_NAME);
		createEReference(viaPointEClass, VIA_POINT__VIA_POINT_DISPLAY_PRIORITY);

		zoneTypeEClass = createEClass(ZONE_TYPE);
		createEReference(zoneTypeEClass, ZONE_TYPE__FAREZONE_TYPE_ID);
		createEReference(zoneTypeEClass, ZONE_TYPE__FARE_ZONE_TYPE_NAME);

		generalResponseEClass = createEClass(GENERAL_RESPONSE);
		createEReference(generalResponseEClass, GENERAL_RESPONSE__OPERATION_ERROR_MESSAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		IbisEnumerationsPackage theIbisEnumerationsPackage = (IbisEnumerationsPackage)EPackage.Registry.INSTANCE.getEPackage(IbisEnumerationsPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dataAcceptedResponseEClass.getESuperTypes().add(this.getGeneralResponse());
		subscribeResponseEClass.getESuperTypes().add(this.getGeneralResponse());
		unsubscribeResponseEClass.getESuperTypes().add(this.getGeneralResponse());

		// Initialize classes, features, and operations; add parameters
		initEClass(additionalAnnouncementEClass, AdditionalAnnouncement.class, "AdditionalAnnouncement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdditionalAnnouncement_AnnouncementRef(), this.getIBISIPNMTOKEN(), null, "announcementRef", null, 1, 1, AdditionalAnnouncement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdditionalAnnouncement_AnnouncementText(), this.getInternationalTextType(), null, "announcementText", null, 0, -1, AdditionalAnnouncement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdditionalAnnouncement_AnnouncementTTSText(), this.getInternationalTextType(), null, "announcementTTSText", null, 0, -1, AdditionalAnnouncement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdditionalAnnouncement_ImmediateInformation(), this.getIBISIPBoolean(), null, "immediateInformation", null, 0, 1, AdditionalAnnouncement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdditionalAnnouncement_PeriodicalInformation(), this.getIBISIPDuration(), null, "periodicalInformation", null, 0, 1, AdditionalAnnouncement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdditionalAnnouncement_SpecificPoint(), this.getSpecificPoint(), null, "specificPoint", null, 0, 1, AdditionalAnnouncement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(announcementEClass, Announcement.class, "Announcement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnouncement_AnnouncementRef(), this.getIBISIPNMTOKEN(), null, "announcementRef", null, 1, 1, Announcement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnouncement_AnnouncementText(), this.getInternationalTextType(), null, "announcementText", null, 0, -1, Announcement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnouncement_AnnouncementTTSText(), this.getInternationalTextType(), null, "announcementTTSText", null, 0, -1, Announcement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bayAreaEClass, BayArea.class, "BayArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBayArea_BeforeBay(), this.getIBISIPDouble(), null, "beforeBay", null, 0, 1, BayArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBayArea_BehindBay(), this.getIBISIPDouble(), null, "behindBay", null, 0, 1, BayArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(beaconPointEClass, BeaconPoint.class, "BeaconPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBeaconPoint_PointRef(), this.getIBISIPNMTOKEN(), null, "pointRef", null, 0, 1, BeaconPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBeaconPoint_BeaconCode(), this.getIBISIPNMTOKEN(), null, "beaconCode", null, 1, 1, BeaconPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBeaconPoint_ShortName(), this.getInternationalTextType(), null, "shortName", null, 0, -1, BeaconPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBeaconPoint_Desciption(), this.getInternationalTextType(), null, "desciption", null, 0, -1, BeaconPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cardApplInformationsEClass, CardApplInformations.class, "CardApplInformations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCardApplInformations_CardApplInformationLength(), this.getIBISIPUnsignedInt(), null, "cardApplInformationLength", null, 1, 1, CardApplInformations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCardApplInformations_CardApplInformationData(), this.getIBISIPByte(), null, "cardApplInformationData", null, 1, -1, CardApplInformations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cardTicketDataEClass, CardTicketData.class, "CardTicketData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCardTicketData_CardTicketDataID(), this.getIBISIPUnsignedLong(), null, "cardTicketDataID", null, 1, 1, CardTicketData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCardTicketData_CardTicketDataLength(), this.getIBISIPUnsignedInt(), null, "cardTicketDataLength", null, 1, 1, CardTicketData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCardTicketData_CardTicketData(), this.getIBISIPByte(), null, "cardTicketData", null, 1, -1, CardTicketData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cardTypeEClass, CardType.class, "CardType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCardType_CardSerialNumber(), this.getIBISIPNMTOKEN(), null, "cardSerialNumber", null, 1, 1, CardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCardType_CardTypeID(), this.getIBISIPNMTOKEN(), null, "cardTypeID", null, 1, 1, CardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCardType_CardTypeText(), this.getInternationalTextType(), null, "cardTypeText", null, 0, -1, CardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionEClass, Connection.class, "Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnection_StopRef(), this.getIBISIPNMTOKEN(), null, "stopRef", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_ConnectionRef(), this.getIBISIPNMTOKEN(), null, "connectionRef", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_ConnectionType(), theIbisEnumerationsPackage.getConnectionTypeEnumeration(), "connectionType", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_DisplayContent(), this.getDisplayContent(), null, "displayContent", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_Platform(), this.getIBISIPString(), null, "platform", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_ConnectionState(), theIbisEnumerationsPackage.getConnectionStateEnumeration(), "connectionState", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_TransportMode(), this.getVehicle(), null, "transportMode", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_ConnectionMode(), this.getNetexMode(), null, "connectionMode", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_ExpectedDepartureTime(), this.getIBISIPDateTime(), null, "expectedDepartureTime", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_ScheduledDepartureTime(), this.getIBISIPDateTime(), null, "scheduledDepartureTime", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataAcceptedResponseDataEClass, DataAcceptedResponseData.class, "DataAcceptedResponseData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataAcceptedResponseData_TimeStamp(), this.getIBISIPDateTime(), null, "timeStamp", null, 1, 1, DataAcceptedResponseData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataAcceptedResponseData_DataAccepted(), this.getIBISIPBoolean(), null, "dataAccepted", null, 1, 1, DataAcceptedResponseData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataAcceptedResponseData_ErrorCode(), theIbisEnumerationsPackage.getErrorCodeEnumeration(), "errorCode", null, 0, 1, DataAcceptedResponseData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataAcceptedResponseData_ErrorInformation(), this.getIBISIPString(), null, "errorInformation", null, 0, 1, DataAcceptedResponseData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataAcceptedResponseEClass, DataAcceptedResponse.class, "DataAcceptedResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataAcceptedResponse_DataAcceptedResponseData(), this.getDataAcceptedResponseData(), null, "dataAcceptedResponseData", null, 0, 1, DataAcceptedResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataVersionListEClass, DataVersionList.class, "DataVersionList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataVersionList_DataVersion(), this.getDataVersion(), null, "dataVersion", null, 0, -1, DataVersionList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataVersionEClass, DataVersion.class, "DataVersion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataVersion_DataType(), this.getIBISIPString(), null, "dataType", null, 1, 1, DataVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataVersion_VersionRef(), this.getIBISIPNMTOKEN(), null, "versionRef", null, 1, 1, DataVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(degreeTypeEClass, DegreeType.class, "DegreeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDegreeType_Degree(), this.getIBISIPDouble(), null, "degree", null, 1, 1, DegreeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDegreeType_Orientation(), this.getIBISIPString(), null, "orientation", null, 1, 1, DegreeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(destinationEClass, Destination.class, "Destination", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDestination_DestinationRef(), this.getIBISIPNMTOKEN(), null, "destinationRef", null, 1, 1, Destination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDestination_DestinationName(), this.getInternationalTextType(), null, "destinationName", null, 0, -1, Destination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDestination_DestinationShortName(), this.getInternationalTextType(), null, "destinationShortName", null, 0, -1, Destination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceInformationEClass, DeviceInformation.class, "DeviceInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceInformation_DeviceName(), this.getIBISIPString(), null, "deviceName", null, 1, 1, DeviceInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceInformation_Manufacturer(), this.getIBISIPString(), null, "manufacturer", null, 1, 1, DeviceInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceInformation_SerialNumber(), this.getIBISIPNMTOKEN(), null, "serialNumber", null, 1, 1, DeviceInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceInformation_DeviceClass(), theIbisEnumerationsPackage.getDeviceClassEnumeration(), "deviceClass", null, 1, 1, DeviceInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceInformation_DataVersionList(), this.getDataVersionList(), null, "dataVersionList", null, 0, 1, DeviceInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceInformation_WebInterfaceAddress(), this.getIBISIPAnyURI(), null, "webInterfaceAddress", null, 0, 1, DeviceInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceSpecificationListEClass, DeviceSpecificationList.class, "DeviceSpecificationList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceSpecificationList_DeviceSpecification(), this.getDeviceSpecification(), null, "deviceSpecification", null, 1, -1, DeviceSpecificationList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceSpecificationEClass, DeviceSpecification.class, "DeviceSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeviceSpecification_DeviceClass(), theIbisEnumerationsPackage.getDeviceClassEnumeration(), "deviceClass", null, 1, 1, DeviceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceSpecification_DeviceID(), this.getIBISIPNMTOKEN(), null, "deviceID", null, 1, 1, DeviceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceSpecificationWithStateListEClass, DeviceSpecificationWithStateList.class, "DeviceSpecificationWithStateList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceSpecificationWithStateList_DeviceSpecificationWithState(), this.getDeviceSpecificationWithState(), null, "deviceSpecificationWithState", null, 0, -1, DeviceSpecificationWithStateList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceSpecificationWithStateEClass, DeviceSpecificationWithState.class, "DeviceSpecificationWithState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceSpecificationWithState_DeviceSpecification(), this.getDeviceSpecification(), null, "deviceSpecification", null, 1, 1, DeviceSpecificationWithState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceSpecificationWithState_DeviceState(), theIbisEnumerationsPackage.getDeviceStateEnumeration(), "deviceState", null, 1, 1, DeviceSpecificationWithState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(displayContentEClass, DisplayContent.class, "DisplayContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDisplayContent_DisplayContentRef(), this.getIBISIPNMTOKEN(), null, "displayContentRef", null, 0, 1, DisplayContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisplayContent_LineInformation(), this.getLineInformation(), null, "lineInformation", null, 1, 1, DisplayContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisplayContent_Destination(), this.getDestination(), null, "destination", null, 1, 1, DisplayContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisplayContent_ViaPoint(), this.getViaPoint(), null, "viaPoint", null, 0, -1, DisplayContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisplayContent_AdditionalInformation(), this.getInternationalTextType(), null, "additionalInformation", null, 0, -1, DisplayContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisplayContent_AdditionalInformation1(), this.getInternationalTextType(), null, "additionalInformation1", null, 0, -1, DisplayContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisplayContent_AdditionalInformation2(), this.getInternationalTextType(), null, "additionalInformation2", null, 0, -1, DisplayContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisplayContent_AdditionalInformation3(), this.getInternationalTextType(), null, "additionalInformation3", null, 0, -1, DisplayContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisplayContent_AdditionalInformation4(), this.getInternationalTextType(), null, "additionalInformation4", null, 0, -1, DisplayContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisplayContent_AdditionalInformation5(), this.getInternationalTextType(), null, "additionalInformation5", null, 0, -1, DisplayContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisplayContent_AdditionalInformation6(), this.getInternationalTextType(), null, "additionalInformation6", null, 0, -1, DisplayContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisplayContent_AdditionalInformation7(), this.getInternationalTextType(), null, "additionalInformation7", null, 0, -1, DisplayContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisplayContent_AdditionalInformation8(), this.getInternationalTextType(), null, "additionalInformation8", null, 0, -1, DisplayContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisplayContent_AdditionalInformation9(), this.getInternationalTextType(), null, "additionalInformation9", null, 0, -1, DisplayContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisplayContent_RunNumber(), this.getIBISIPInt(), null, "runNumber", null, 0, 1, DisplayContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisplayContent_Priority(), this.getIBISIPNonNegativeInteger(), null, "priority", null, 0, 1, DisplayContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisplayContent_PeriodDuration(), this.getIBISIPDuration(), null, "periodDuration", null, 0, 1, DisplayContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisplayContent_Duration(), this.getIBISIPDuration(), null, "duration", null, 0, 1, DisplayContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_AirSubmode(), theIbisEnumerationsPackage.getAirSubmodeEnumeration(), "airSubmode", "unknown", 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_BusSubmode(), theIbisEnumerationsPackage.getBusSubmodeEnumeration(), "busSubmode", "unknown", 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_CoachSubmode(), theIbisEnumerationsPackage.getCoachSubmodeEnumeration(), "coachSubmode", "unknown", 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DataAcceptedResponse(), this.getDataAcceptedResponse(), null, "dataAcceptedResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_FunicularSubmode(), theIbisEnumerationsPackage.getFunicularSubmodeEnumeration(), "funicularSubmode", "unknown", 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_MetroSubmode(), theIbisEnumerationsPackage.getMetroSubmodeEnumeration(), "metroSubmode", "unknown", 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_RailSubmode(), theIbisEnumerationsPackage.getRailSubmodeEnumeration(), "railSubmode", "unknown", 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_SelfDriveSubmode(), theIbisEnumerationsPackage.getSelfDriveSubmodeEnumeration(), "selfDriveSubmode", "unknown", 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SubscribeRequest(), this.getSubscribeRequest(), null, "subscribeRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SubscribeResponse(), this.getSubscribeResponse(), null, "subscribeResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TaxiSubmode(), theIbisEnumerationsPackage.getTaxiSubmodeEnumeration(), "taxiSubmode", "unknown", 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TelecabinSubmode(), theIbisEnumerationsPackage.getTelecabinSubmodeEnumeration(), "telecabinSubmode", "unknown", 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TramSubmode(), theIbisEnumerationsPackage.getTramSubmodeEnumeration(), "tramSubmode", "unknown", 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UnsubscribeRequest(), this.getUnsubscribeRequest(), null, "unsubscribeRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UnsubscribeResponse(), this.getUnsubscribeResponse(), null, "unsubscribeResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_WaterSubmode(), theIbisEnumerationsPackage.getWaterSubmodeEnumeration(), "waterSubmode", "unknown", 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(doorCountingListEClass, DoorCountingList.class, "DoorCountingList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDoorCountingList_DoorID(), this.getIBISIPNMTOKEN(), null, "doorID", null, 1, 1, DoorCountingList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoorCountingList_CountSet(), this.getDoorCounting(), null, "countSet", null, 1, -1, DoorCountingList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doorCountingEClass, DoorCounting.class, "DoorCounting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoorCounting_ObjectClass(), theIbisEnumerationsPackage.getDoorCountingObjectClassEnumeration(), "objectClass", null, 1, 1, DoorCounting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoorCounting_In(), this.getIBISIPInt(), null, "in", null, 1, 1, DoorCounting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoorCounting_Out(), this.getIBISIPInt(), null, "out", null, 1, 1, DoorCounting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoorCounting_CountQuality(), theIbisEnumerationsPackage.getDoorCountingQualityEnumeration(), "countQuality", null, 0, 1, DoorCounting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doorInformationEClass, DoorInformation.class, "DoorInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDoorInformation_DoorID(), this.getIBISIPNMTOKEN(), null, "doorID", null, 1, 1, DoorInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoorInformation_Count(), this.getDoorCounting(), null, "count", null, 1, -1, DoorInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoorInformation_State(), this.getDoorState(), null, "state", null, 0, 1, DoorInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doorOpenStateEClass, DoorOpenState.class, "DoorOpenState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoorOpenState_Value(), theIbisEnumerationsPackage.getDoorOpenStateEnumeration(), "value", null, 1, 1, DoorOpenState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoorOpenState_ErrorCode(), theIbisEnumerationsPackage.getErrorCodeEnumeration(), "errorCode", null, 0, 1, DoorOpenState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doorOperationStateEClass, DoorOperationState.class, "DoorOperationState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoorOperationState_Value(), theIbisEnumerationsPackage.getDoorOperationStateEnumeration(), "value", null, 1, 1, DoorOperationState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoorOperationState_ErrorCode(), theIbisEnumerationsPackage.getErrorCodeEnumeration(), "errorCode", null, 0, 1, DoorOperationState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doorStateEClass, DoorState.class, "DoorState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDoorState_OpenState(), this.getDoorOpenState(), null, "openState", null, 1, 1, DoorState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoorState_OperationState(), this.getDoorOperationState(), null, "operationState", null, 0, 1, DoorState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fareZoneInformationEClass, FareZoneInformation.class, "FareZoneInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFareZoneInformation_FareZoneID(), this.getIBISIPNMTOKEN(), null, "fareZoneID", null, 1, 1, FareZoneInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareZoneInformation_FareZoneType(), this.getZoneType(), null, "fareZoneType", null, 0, 1, FareZoneInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareZoneInformation_FareZoneLongName(), this.getInternationalTextType(), null, "fareZoneLongName", null, 0, -1, FareZoneInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareZoneInformation_FareZoneShortName(), this.getInternationalTextType(), null, "fareZoneShortName", null, 0, -1, FareZoneInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(globalCardStatusEClass, GlobalCardStatus.class, "GlobalCardStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlobalCardStatus_GlobalCardStausID(), this.getIBISIPUnsignedInt(), null, "globalCardStausID", null, 1, 1, GlobalCardStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalCardStatus_GlobalCardStatusText(), this.getIBISIPString(), null, "globalCardStatusText", null, 0, -1, GlobalCardStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gnssCoordinateEClass, GNSSCoordinate.class, "GNSSCoordinate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGNSSCoordinate_Degree(), this.getIBISIPDouble(), null, "degree", null, 1, 1, GNSSCoordinate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGNSSCoordinate_Direction(), this.getIBISIPString(), null, "direction", null, 1, 1, GNSSCoordinate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gnssPointEClass, GNSSPoint.class, "GNSSPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGNSSPoint_PointRef(), this.getIBISIPNMTOKEN(), null, "pointRef", null, 0, 1, GNSSPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGNSSPoint_Longitude(), this.getGNSSCoordinate(), null, "longitude", null, 1, 1, GNSSPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGNSSPoint_Latitude(), this.getGNSSCoordinate(), null, "latitude", null, 1, 1, GNSSPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGNSSPoint_Altitude(), this.getIBISIPDouble(), null, "altitude", null, 0, 1, GNSSPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ibisipAnyURIEClass, IBISIPAnyURI.class, "IBISIPAnyURI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIBISIPAnyURI_Value(), theXMLTypePackage.getAnyURI(), "value", null, 1, 1, IBISIPAnyURI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIBISIPAnyURI_ErrorCode(), theIbisEnumerationsPackage.getErrorCodeEnumeration(), "errorCode", null, 0, 1, IBISIPAnyURI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ibisipBooleanEClass, IBISIPBoolean.class, "IBISIPBoolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIBISIPBoolean_Value(), theXMLTypePackage.getBoolean(), "value", null, 1, 1, IBISIPBoolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIBISIPBoolean_ErrorCode(), theIbisEnumerationsPackage.getErrorCodeEnumeration(), "errorCode", null, 0, 1, IBISIPBoolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ibisipByteEClass, IBISIPByte.class, "IBISIPByte", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIBISIPByte_Value(), theXMLTypePackage.getByte(), "value", null, 1, 1, IBISIPByte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIBISIPByte_ErrorCode(), theIbisEnumerationsPackage.getErrorCodeEnumeration(), "errorCode", null, 0, 1, IBISIPByte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ibisipDateEClass, IBISIPDate.class, "IBISIPDate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIBISIPDate_Value(), theXMLTypePackage.getDate(), "value", null, 1, 1, IBISIPDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIBISIPDate_ErrorCode(), theIbisEnumerationsPackage.getErrorCodeEnumeration(), "errorCode", null, 0, 1, IBISIPDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ibisipDateTimeEClass, IBISIPDateTime.class, "IBISIPDateTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIBISIPDateTime_Value(), theXMLTypePackage.getDateTime(), "value", null, 1, 1, IBISIPDateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIBISIPDateTime_ErrorCode(), theIbisEnumerationsPackage.getErrorCodeEnumeration(), "errorCode", null, 0, 1, IBISIPDateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ibisipDoubleEClass, IBISIPDouble.class, "IBISIPDouble", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIBISIPDouble_Value(), theXMLTypePackage.getDouble(), "value", null, 1, 1, IBISIPDouble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIBISIPDouble_ErrorCode(), theIbisEnumerationsPackage.getErrorCodeEnumeration(), "errorCode", null, 0, 1, IBISIPDouble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ibisipDurationEClass, IBISIPDuration.class, "IBISIPDuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIBISIPDuration_Value(), theXMLTypePackage.getDuration(), "value", null, 1, 1, IBISIPDuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIBISIPDuration_ErrorCode(), theIbisEnumerationsPackage.getErrorCodeEnumeration(), "errorCode", null, 0, 1, IBISIPDuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ibisipIntEClass, IBISIPInt.class, "IBISIPInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIBISIPInt_Value(), theXMLTypePackage.getInt(), "value", null, 1, 1, IBISIPInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIBISIPInt_ErrorCode(), theIbisEnumerationsPackage.getErrorCodeEnumeration(), "errorCode", null, 0, 1, IBISIPInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ibisipLanguageEClass, IBISIPLanguage.class, "IBISIPLanguage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIBISIPLanguage_Value(), theXMLTypePackage.getLanguage(), "value", null, 1, 1, IBISIPLanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIBISIPLanguage_ErrorCode(), theIbisEnumerationsPackage.getErrorCodeEnumeration(), "errorCode", null, 0, 1, IBISIPLanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ibisipnmtokenEClass, de.jena.mdo.ibis.ibis_common.IBISIPNMTOKEN.class, "IBISIPNMTOKEN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIBISIPNMTOKEN_Value(), theXMLTypePackage.getNMTOKEN(), "value", null, 1, 1, de.jena.mdo.ibis.ibis_common.IBISIPNMTOKEN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIBISIPNMTOKEN_ErrorCode(), theIbisEnumerationsPackage.getErrorCodeEnumeration(), "errorCode", null, 0, 1, de.jena.mdo.ibis.ibis_common.IBISIPNMTOKEN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ibisipNonNegativeIntegerEClass, IBISIPNonNegativeInteger.class, "IBISIPNonNegativeInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIBISIPNonNegativeInteger_Value(), theXMLTypePackage.getNonNegativeInteger(), "value", null, 1, 1, IBISIPNonNegativeInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIBISIPNonNegativeInteger_ErrorCode(), theIbisEnumerationsPackage.getErrorCodeEnumeration(), "errorCode", null, 0, 1, IBISIPNonNegativeInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ibisipNormalizedStringEClass, IBISIPNormalizedString.class, "IBISIPNormalizedString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIBISIPNormalizedString_Value(), theXMLTypePackage.getNormalizedString(), "value", null, 1, 1, IBISIPNormalizedString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIBISIPNormalizedString_ErrorCode(), theIbisEnumerationsPackage.getErrorCodeEnumeration(), "errorCode", null, 0, 1, IBISIPNormalizedString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ibisipStringEClass, IBISIPString.class, "IBISIPString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIBISIPString_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, IBISIPString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIBISIPString_ErrorCode(), theIbisEnumerationsPackage.getErrorCodeEnumeration(), "errorCode", null, 0, 1, IBISIPString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ibisipTimeEClass, IBISIPTime.class, "IBISIPTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIBISIPTime_Value(), theXMLTypePackage.getTime(), "value", null, 1, 1, IBISIPTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIBISIPTime_ErrorCode(), theIbisEnumerationsPackage.getErrorCodeEnumeration(), "errorCode", null, 0, 1, IBISIPTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ibisipUnsignedIntEClass, IBISIPUnsignedInt.class, "IBISIPUnsignedInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIBISIPUnsignedInt_Value(), theXMLTypePackage.getUnsignedInt(), "value", null, 1, 1, IBISIPUnsignedInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIBISIPUnsignedInt_ErrorCode(), theIbisEnumerationsPackage.getErrorCodeEnumeration(), "errorCode", null, 0, 1, IBISIPUnsignedInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ibisipUnsignedLongEClass, IBISIPUnsignedLong.class, "IBISIPUnsignedLong", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIBISIPUnsignedLong_Value(), theXMLTypePackage.getUnsignedLong(), "value", null, 1, 1, IBISIPUnsignedLong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIBISIPUnsignedLong_ErrorCode(), theIbisEnumerationsPackage.getErrorCodeEnumeration(), "errorCode", null, 0, 1, IBISIPUnsignedLong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internationalTextTypeEClass, InternationalTextType.class, "InternationalTextType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInternationalTextType_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, InternationalTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInternationalTextType_Language(), theXMLTypePackage.getLanguage(), "language", null, 1, 1, InternationalTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInternationalTextType_ErrorCode(), theIbisEnumerationsPackage.getErrorCodeEnumeration(), "errorCode", null, 0, 1, InternationalTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(journeyStopInformationEClass, JourneyStopInformation.class, "JourneyStopInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJourneyStopInformation_StopRef(), this.getIBISIPNMTOKEN(), null, "stopRef", null, 1, 1, JourneyStopInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJourneyStopInformation_StopName(), this.getInternationalTextType(), null, "stopName", null, 1, -1, JourneyStopInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJourneyStopInformation_StopAlternativeName(), this.getInternationalTextType(), null, "stopAlternativeName", null, 0, -1, JourneyStopInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJourneyStopInformation_Platform(), this.getIBISIPString(), null, "platform", null, 0, 1, JourneyStopInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJourneyStopInformation_DisplayContent(), this.getDisplayContent(), null, "displayContent", null, 1, -1, JourneyStopInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJourneyStopInformation_Announcement(), this.getAnnouncement(), null, "announcement", null, 0, 1, JourneyStopInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJourneyStopInformation_ArrivalScheduled(), this.getIBISIPDateTime(), null, "arrivalScheduled", null, 0, 1, JourneyStopInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJourneyStopInformation_DepartureScheduled(), this.getIBISIPDateTime(), null, "departureScheduled", null, 0, 1, JourneyStopInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJourneyStopInformation_Connection(), this.getConnection(), null, "connection", null, 0, -1, JourneyStopInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJourneyStopInformation_BayArea(), this.getBayArea(), null, "bayArea", null, 0, 1, JourneyStopInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJourneyStopInformation_GNSSPoint(), this.getGNSSPoint(), null, "gNSSPoint", null, 0, 1, JourneyStopInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJourneyStopInformation_FareZone(), this.getIBISIPNMTOKEN(), null, "fareZone", null, 0, 1, JourneyStopInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineInformationEClass, LineInformation.class, "LineInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLineInformation_LineRef(), this.getIBISIPNMTOKEN(), null, "lineRef", null, 1, 1, LineInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLineInformation_LineName(), this.getInternationalTextType(), null, "lineName", null, 0, -1, LineInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLineInformation_LineShortName(), this.getInternationalTextType(), null, "lineShortName", null, 0, -1, LineInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLineInformation_LineNumber(), this.getIBISIPInt(), null, "lineNumber", null, 0, 1, LineInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLineInformation_LineCode(), this.getIBISIPInt(), null, "lineCode", null, 0, 1, LineInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logMessageEClass, LogMessage.class, "LogMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogMessage_MessageProvider(), this.getDeviceSpecification(), null, "messageProvider", null, 1, 1, LogMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogMessage_Message(), this.getMessage(), null, "message", null, 1, 1, LogMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessage_MessageID(), this.getIBISIPInt(), null, "messageID", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_TimeStamp(), this.getIBISIPDateTime(), null, "timeStamp", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_MessageType(), theIbisEnumerationsPackage.getMessageTypeEnumeration(), "messageType", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_MessageText(), this.getIBISIPString(), null, "messageText", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(netexModeEClass, NetexMode.class, "NetexMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetexMode_PtMainMode(), theIbisEnumerationsPackage.getPtSubModesEnumeration(), "ptMainMode", null, 0, 1, NetexMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetexMode_PrivateMainMode(), theIbisEnumerationsPackage.getPrivateSubModesEnumeration(), "privateMainMode", null, 0, 1, NetexMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetexMode_AirSubmode(), theIbisEnumerationsPackage.getAirSubmodeEnumeration(), "airSubmode", "unknown", 0, 1, NetexMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetexMode_BusSubmode(), theIbisEnumerationsPackage.getBusSubmodeEnumeration(), "busSubmode", "unknown", 0, 1, NetexMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetexMode_CoachSubmode(), theIbisEnumerationsPackage.getCoachSubmodeEnumeration(), "coachSubmode", "unknown", 0, 1, NetexMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetexMode_FunicularSubmode(), theIbisEnumerationsPackage.getFunicularSubmodeEnumeration(), "funicularSubmode", "unknown", 0, 1, NetexMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetexMode_MetroSubmode(), theIbisEnumerationsPackage.getMetroSubmodeEnumeration(), "metroSubmode", "unknown", 0, 1, NetexMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetexMode_TramSubmode(), theIbisEnumerationsPackage.getTramSubmodeEnumeration(), "tramSubmode", "unknown", 0, 1, NetexMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetexMode_TelecabinSubmode(), theIbisEnumerationsPackage.getTelecabinSubmodeEnumeration(), "telecabinSubmode", "unknown", 0, 1, NetexMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetexMode_RailSubmode(), theIbisEnumerationsPackage.getRailSubmodeEnumeration(), "railSubmode", "unknown", 0, 1, NetexMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetexMode_WaterSubmode(), theIbisEnumerationsPackage.getWaterSubmodeEnumeration(), "waterSubmode", "unknown", 0, 1, NetexMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetexMode_TaxiSubmode(), theIbisEnumerationsPackage.getTaxiSubmodeEnumeration(), "taxiSubmode", "unknown", 0, 1, NetexMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetexMode_SelfDriveSubmode(), theIbisEnumerationsPackage.getSelfDriveSubmodeEnumeration(), "selfDriveSubmode", "unknown", 0, 1, NetexMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointSequenceEClass, PointSequence.class, "PointSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPointSequence_Point(), this.getPoint(), null, "point", null, 2, -1, PointSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointEClass, Point.class, "Point", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPoint_PointIndex(), this.getIBISIPInt(), null, "pointIndex", null, 1, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPoint_PointType(), this.getPointType(), null, "pointType", null, 1, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPoint_DistanceToPreviousPoint(), this.getIBISIPInt(), null, "distanceToPreviousPoint", null, 1, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointTypeEClass, PointType.class, "PointType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPointType_StopPoint(), this.getJourneyStopInformation(), null, "stopPoint", null, 0, 1, PointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPointType_BeaconPoint(), this.getBeaconPoint(), null, "beaconPoint", null, 0, 1, PointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPointType_GNSSLocationPoint(), this.getGNSSPoint(), null, "gNSSLocationPoint", null, 0, 1, PointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPointType_TimingPoint(), this.getTimingPoint(), null, "timingPoint", null, 0, 1, PointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPointType_TSPPoint(), this.getTSPPoint(), null, "tSPPoint", null, 0, 1, PointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceIdentificationEClass, ServiceIdentification.class, "ServiceIdentification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceIdentification_Service(), this.getServiceSpecification(), null, "service", null, 1, 1, ServiceIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceIdentification_Device(), this.getDeviceSpecification(), null, "device", null, 1, 1, ServiceIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceIdentificationWithStateListEClass, ServiceIdentificationWithStateList.class, "ServiceIdentificationWithStateList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceIdentificationWithStateList_ServiceIdentificationWithState(), this.getServiceIdentificationWithState(), null, "serviceIdentificationWithState", null, 0, -1, ServiceIdentificationWithStateList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceIdentificationWithStateEClass, ServiceIdentificationWithState.class, "ServiceIdentificationWithState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceIdentificationWithState_ServiceIdentification(), this.getServiceIdentification(), null, "serviceIdentification", null, 1, 1, ServiceIdentificationWithState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceIdentificationWithState_ServiceState(), theIbisEnumerationsPackage.getServiceStateEnumeration(), "serviceState", null, 1, 1, ServiceIdentificationWithState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceInformationListEClass, ServiceInformationList.class, "ServiceInformationList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceInformationList_ServiceInformation(), this.getServiceInformation(), null, "serviceInformation", null, 1, -1, ServiceInformationList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceInformationEClass, ServiceInformation.class, "ServiceInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceInformation_Service(), this.getServiceSpecification(), null, "service", null, 1, 1, ServiceInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceInformation_Autostart(), this.getIBISIPBoolean(), null, "autostart", null, 1, 1, ServiceInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceSpecificationEClass, ServiceSpecification.class, "ServiceSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceSpecification_ServiceName(), theIbisEnumerationsPackage.getServiceNameEnumeration(), "serviceName", null, 1, 1, ServiceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceSpecification_IBISIPVersion(), this.getIBISIPNMTOKEN(), null, "iBISIPVersion", null, 1, 1, ServiceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceSpecificationWithStateListEClass, ServiceSpecificationWithStateList.class, "ServiceSpecificationWithStateList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceSpecificationWithStateList_ServiceSpecificationWithState(), this.getServiceSpecificationWithState(), null, "serviceSpecificationWithState", null, 0, -1, ServiceSpecificationWithStateList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceSpecificationWithStateEClass, ServiceSpecificationWithState.class, "ServiceSpecificationWithState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceSpecificationWithState_ServiceSpecification(), this.getServiceSpecification(), null, "serviceSpecification", null, 1, 1, ServiceSpecificationWithState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceSpecificationWithState_ServiceState(), theIbisEnumerationsPackage.getServiceStateEnumeration(), "serviceState", null, 1, 1, ServiceSpecificationWithState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceStartListEClass, ServiceStartList.class, "ServiceStartList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceStartList_ServiceIdentification(), this.getServiceIdentification(), null, "serviceIdentification", null, 1, -1, ServiceStartList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceStartEClass, ServiceStart.class, "ServiceStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceStart_ServiceIdentification(), this.getServiceIdentification(), null, "serviceIdentification", null, 1, 1, ServiceStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceStart_Autostart(), this.getIBISIPBoolean(), null, "autostart", null, 1, 1, ServiceStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shortTripStopListEClass, ShortTripStopList.class, "ShortTripStopList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShortTripStopList_ShortTripStop(), this.getShortTripStop(), null, "shortTripStop", null, 1, -1, ShortTripStopList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shortTripStopEClass, ShortTripStop.class, "ShortTripStop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShortTripStop_JourneyStopInformation(), this.getJourneyStopInformation(), null, "journeyStopInformation", null, 1, 1, ShortTripStop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShortTripStop_FareZoneInformation(), this.getFareZoneInformation(), null, "fareZoneInformation", null, 1, 1, ShortTripStop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specificPointEClass, SpecificPoint.class, "SpecificPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecificPoint_PointRef(), this.getIBISIPNMTOKEN(), null, "pointRef", null, 1, 1, SpecificPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificPoint_DistanceToPreviousPoint(), this.getIBISIPDouble(), null, "distanceToPreviousPoint", null, 1, 1, SpecificPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stopInformationRequestEClass, StopInformationRequest.class, "StopInformationRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStopInformationRequest_StopIndex(), this.getIBISIPInt(), null, "stopIndex", null, 0, 1, StopInformationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformationRequest_StopRef(), this.getIBISIPNMTOKEN(), null, "stopRef", null, 0, 1, StopInformationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformationRequest_StopName(), this.getInternationalTextType(), null, "stopName", null, 0, -1, StopInformationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformationRequest_DisplayContent(), this.getDisplayContent(), null, "displayContent", null, 1, -1, StopInformationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformationRequest_StopAnnouncement(), this.getAnnouncement(), null, "stopAnnouncement", null, 0, -1, StopInformationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformationRequest_ArrivalScheduled(), this.getIBISIPDateTime(), null, "arrivalScheduled", null, 0, 1, StopInformationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformationRequest_DepartureScheduled(), this.getIBISIPDateTime(), null, "departureScheduled", null, 0, 1, StopInformationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformationRequest_RecordedArrivalTime(), this.getIBISIPDateTime(), null, "recordedArrivalTime", null, 0, 1, StopInformationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformationRequest_DistanceToNextStop(), this.getIBISIPInt(), null, "distanceToNextStop", null, 0, 1, StopInformationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformationRequest_Connection(), this.getConnection(), null, "connection", null, 0, -1, StopInformationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformationRequest_FareZone(), this.getIBISIPNMTOKEN(), null, "fareZone", null, 0, -1, StopInformationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stopInformationEClass, StopInformation.class, "StopInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStopInformation_StopIndex(), this.getIBISIPInt(), null, "stopIndex", null, 1, 1, StopInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformation_StopRef(), this.getIBISIPNMTOKEN(), null, "stopRef", null, 1, 1, StopInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformation_StopName(), this.getInternationalTextType(), null, "stopName", null, 1, -1, StopInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformation_StopAlternativeName(), this.getInternationalTextType(), null, "stopAlternativeName", null, 0, -1, StopInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformation_Platform(), this.getIBISIPString(), null, "platform", null, 0, 1, StopInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformation_DisplayContent(), this.getDisplayContent(), null, "displayContent", null, 1, -1, StopInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformation_StopAnnouncement(), this.getAnnouncement(), null, "stopAnnouncement", null, 0, -1, StopInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformation_ArrivalScheduled(), this.getIBISIPDateTime(), null, "arrivalScheduled", null, 0, 1, StopInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformation_ArrivalExpected(), this.getIBISIPDateTime(), null, "arrivalExpected", null, 0, 1, StopInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformation_DepartureScheduled(), this.getIBISIPDateTime(), null, "departureScheduled", null, 0, 1, StopInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformation_DepartureExpected(), this.getIBISIPDateTime(), null, "departureExpected", null, 0, 1, StopInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformation_RecordedArrivalTime(), this.getIBISIPDateTime(), null, "recordedArrivalTime", null, 0, 1, StopInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformation_DistanceToNextStop(), this.getIBISIPInt(), null, "distanceToNextStop", null, 0, 1, StopInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformation_Connection(), this.getConnection(), null, "connection", null, 0, -1, StopInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformation_FareZone(), this.getIBISIPNMTOKEN(), null, "fareZone", null, 0, -1, StopInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stopPointTariffInformationEClass, StopPointTariffInformation.class, "StopPointTariffInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStopPointTariffInformation_JourneyStopInformation(), this.getJourneyStopInformation(), null, "journeyStopInformation", null, 1, 1, StopPointTariffInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopPointTariffInformation_FareZoneInformation(), this.getFareZoneInformation(), null, "fareZoneInformation", null, 1, 1, StopPointTariffInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stopSequenceEClass, StopSequence.class, "StopSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStopSequence_StopPoint(), this.getStopInformation(), null, "stopPoint", null, 2, -1, StopSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subscribeRequestEClass, SubscribeRequest.class, "SubscribeRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubscribeRequest_ClientIPAddress(), this.getIBISIPString(), null, "clientIPAddress", null, 1, 1, SubscribeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubscribeRequest_ReplyPort(), this.getIBISIPInt(), null, "replyPort", null, 0, 1, SubscribeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubscribeRequest_ReplyPath(), this.getIBISIPString(), null, "replyPath", null, 0, 1, SubscribeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subscribeResponseEClass, SubscribeResponse.class, "SubscribeResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubscribeResponse_Active(), this.getIBISIPBoolean(), null, "active", null, 0, 1, SubscribeResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubscribeResponse_Heartbeat(), this.getIBISIPDuration(), null, "heartbeat", null, 0, 1, SubscribeResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timingPointEClass, TimingPoint.class, "TimingPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimingPoint_TimingPointRef(), this.getIBISIPNMTOKEN(), null, "timingPointRef", null, 0, 1, TimingPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimingPoint_ScheduleTime(), this.getIBISIPDateTime(), null, "scheduleTime", null, 1, 1, TimingPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimingPoint_GNSSPoint(), this.getGNSSPoint(), null, "gNSSPoint", null, 1, 1, TimingPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tripInformationEClass, TripInformation.class, "TripInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTripInformation_TripRef(), this.getIBISIPNMTOKEN(), null, "tripRef", null, 1, 1, TripInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripInformation_StopSequence(), this.getStopSequence(), null, "stopSequence", null, 1, 1, TripInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTripInformation_LocationState(), theIbisEnumerationsPackage.getLocationStateEnumeration(), "locationState", null, 0, 1, TripInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripInformation_TimetableDelay(), this.getIBISIPInt(), null, "timetableDelay", null, 0, 1, TripInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripInformation_AdditionalTextMessage(), this.getInternationalTextType(), null, "additionalTextMessage", null, 0, 1, TripInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripInformation_AdditionalTextMessage1(), this.getInternationalTextType(), null, "additionalTextMessage1", null, 0, 1, TripInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripInformation_AdditionalTextMessage2(), this.getInternationalTextType(), null, "additionalTextMessage2", null, 0, 1, TripInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripInformation_AdditionalTextMessage3(), this.getInternationalTextType(), null, "additionalTextMessage3", null, 0, 1, TripInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripInformation_AdditionalTextMessage4(), this.getInternationalTextType(), null, "additionalTextMessage4", null, 0, 1, TripInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripInformation_AdditionalTextMessage5(), this.getInternationalTextType(), null, "additionalTextMessage5", null, 0, 1, TripInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripInformation_AdditionalTextMessage6(), this.getInternationalTextType(), null, "additionalTextMessage6", null, 0, 1, TripInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripInformation_AdditionalTextMessage7(), this.getInternationalTextType(), null, "additionalTextMessage7", null, 0, 1, TripInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripInformation_AdditionalTextMessage8(), this.getInternationalTextType(), null, "additionalTextMessage8", null, 0, 1, TripInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripInformation_AdditionalTextMessage9(), this.getInternationalTextType(), null, "additionalTextMessage9", null, 0, 1, TripInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripInformation_AdditionalAnnouncement(), this.getAdditionalAnnouncement(), null, "additionalAnnouncement", null, 0, -1, TripInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTripInformation_RouteDirection(), theIbisEnumerationsPackage.getRouteDirectionEnumeration(), "routeDirection", null, 0, 1, TripInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripInformation_RunNumber(), this.getIBISIPInt(), null, "runNumber", null, 0, 1, TripInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripInformation_PatternNumber(), this.getIBISIPInt(), null, "patternNumber", null, 0, 1, TripInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripInformation_PathDestinationNumber(), this.getIBISIPInt(), null, "pathDestinationNumber", null, 0, 1, TripInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tripSequenceEClass, TripSequence.class, "TripSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTripSequence_TripRef(), this.getIBISIPNMTOKEN(), null, "tripRef", null, 1, 1, TripSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripSequence_TripIndex(), this.getIBISIPInt(), null, "tripIndex", null, 0, 1, TripSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripSequence_TripStart(), this.getIBISIPTime(), null, "tripStart", null, 0, 1, TripSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripSequence_CurrentStopIndex(), this.getIBISIPInt(), null, "currentStopIndex", null, 0, 1, TripSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTripSequence_JourneyMode(), theIbisEnumerationsPackage.getJourneyModeEnumeration(), "journeyMode", null, 0, 1, TripSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripSequence_PointSequence(), this.getPointSequence(), null, "pointSequence", null, 1, 1, TripSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tspPointEClass, TSPPoint.class, "TSPPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTSPPoint_TSPPointRef(), this.getIBISIPNMTOKEN(), null, "tSPPointRef", null, 0, 1, TSPPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTSPPoint_TSPCode(), this.getIBISIPNMTOKEN(), null, "tSPCode", null, 1, 1, TSPPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTSPPoint_ShortName(), this.getInternationalTextType(), null, "shortName", null, 0, -1, TSPPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTSPPoint_Desciption(), this.getInternationalTextType(), null, "desciption", null, 0, -1, TSPPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unsubscribeRequestEClass, UnsubscribeRequest.class, "UnsubscribeRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnsubscribeRequest_ClientIPAddress(), this.getIBISIPString(), null, "clientIPAddress", null, 1, 1, UnsubscribeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnsubscribeRequest_ReplyPort(), this.getIBISIPInt(), null, "replyPort", null, 0, 1, UnsubscribeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnsubscribeRequest_ReplyPath(), this.getIBISIPString(), null, "replyPath", null, 0, 1, UnsubscribeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unsubscribeResponseEClass, UnsubscribeResponse.class, "UnsubscribeResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnsubscribeResponse_Active(), this.getIBISIPBoolean(), null, "active", null, 1, 1, UnsubscribeResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vehicleEClass, Vehicle.class, "Vehicle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVehicle_VehicleTypeRef(), this.getIBISIPNMTOKEN(), null, "vehicleTypeRef", null, 1, 1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVehicle_Name(), this.getInternationalTextType(), null, "name", null, 0, -1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viaPointEClass, ViaPoint.class, "ViaPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViaPoint_ViaPointRef(), this.getIBISIPNMTOKEN(), null, "viaPointRef", null, 1, 1, ViaPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViaPoint_PlaceRef(), this.getIBISIPNMTOKEN(), null, "placeRef", null, 0, 1, ViaPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViaPoint_PlaceName(), this.getInternationalTextType(), null, "placeName", null, 0, -1, ViaPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViaPoint_PlaceShortName(), this.getInternationalTextType(), null, "placeShortName", null, 0, -1, ViaPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViaPoint_ViaPointDisplayPriority(), this.getIBISIPInt(), null, "viaPointDisplayPriority", null, 0, 1, ViaPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zoneTypeEClass, ZoneType.class, "ZoneType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZoneType_FarezoneTypeID(), this.getIBISIPNMTOKEN(), null, "farezoneTypeID", null, 1, 1, ZoneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZoneType_FareZoneTypeName(), this.getInternationalTextType(), null, "fareZoneTypeName", null, 0, -1, ZoneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generalResponseEClass, GeneralResponse.class, "GeneralResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneralResponse_OperationErrorMessage(), this.getIBISIPString(), null, "operationErrorMessage", null, 0, 1, GeneralResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "qualified", "false"
		   });
		addAnnotation
		  (additionalAnnouncementEClass,
		   source,
		   new String[] {
			   "name", "AdditionalAnnouncementStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAdditionalAnnouncement_AnnouncementRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AnnouncementRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAdditionalAnnouncement_AnnouncementText(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AnnouncementText",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAdditionalAnnouncement_AnnouncementTTSText(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AnnouncementTTSText",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAdditionalAnnouncement_ImmediateInformation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ImmediateInformation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAdditionalAnnouncement_PeriodicalInformation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PeriodicalInformation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAdditionalAnnouncement_SpecificPoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SpecificPoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (announcementEClass,
		   source,
		   new String[] {
			   "name", "AnnouncementStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAnnouncement_AnnouncementRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AnnouncementRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAnnouncement_AnnouncementText(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AnnouncementText",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAnnouncement_AnnouncementTTSText(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AnnouncementTTSText",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (bayAreaEClass,
		   source,
		   new String[] {
			   "name", "BayAreaStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBayArea_BeforeBay(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BeforeBay",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBayArea_BehindBay(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BehindBay",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (beaconPointEClass,
		   source,
		   new String[] {
			   "name", "BeaconPointStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBeaconPoint_PointRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PointRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBeaconPoint_BeaconCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BeaconCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBeaconPoint_ShortName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ShortName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBeaconPoint_Desciption(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Desciption",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (cardApplInformationsEClass,
		   source,
		   new String[] {
			   "name", "CardApplInformations",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCardApplInformations_CardApplInformationLength(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CardApplInformationLength",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCardApplInformations_CardApplInformationData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CardApplInformationData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (cardTicketDataEClass,
		   source,
		   new String[] {
			   "name", "CardTicketData",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCardTicketData_CardTicketDataID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CardTicketDataID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCardTicketData_CardTicketDataLength(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CardTicketDataLength",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCardTicketData_CardTicketData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CardTicketData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (cardTypeEClass,
		   source,
		   new String[] {
			   "name", "CardType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCardType_CardSerialNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CardSerialNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCardType_CardTypeID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CardTypeID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCardType_CardTypeText(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CardTypeText",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (connectionEClass,
		   source,
		   new String[] {
			   "name", "ConnectionStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getConnection_StopRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StopRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getConnection_ConnectionRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ConnectionRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getConnection_ConnectionType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ConnectionType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getConnection_DisplayContent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DisplayContent",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getConnection_Platform(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Platform",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getConnection_ConnectionState(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ConnectionState",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getConnection_TransportMode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TransportMode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getConnection_ConnectionMode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ConnectionMode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getConnection_ExpectedDepartureTime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ExpectedDepartureTime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getConnection_ScheduledDepartureTime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ScheduledDepartureTime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (dataAcceptedResponseDataEClass,
		   source,
		   new String[] {
			   "name", "DataAcceptedResponseDataStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDataAcceptedResponseData_TimeStamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimeStamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataAcceptedResponseData_DataAccepted(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DataAccepted",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataAcceptedResponseData_ErrorCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ErrorCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataAcceptedResponseData_ErrorInformation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ErrorInformation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (dataAcceptedResponseEClass,
		   source,
		   new String[] {
			   "name", "DataAcceptedResponseStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDataAcceptedResponse_DataAcceptedResponseData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DataAcceptedResponseData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (dataVersionListEClass,
		   source,
		   new String[] {
			   "name", "DataVersionListStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDataVersionList_DataVersion(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DataVersion",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (dataVersionEClass,
		   source,
		   new String[] {
			   "name", "DataVersionStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDataVersion_DataType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DataType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataVersion_VersionRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "VersionRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (degreeTypeEClass,
		   source,
		   new String[] {
			   "name", "DegreeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDegreeType_Degree(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Degree",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDegreeType_Orientation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Orientation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (destinationEClass,
		   source,
		   new String[] {
			   "name", "DestinationStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDestination_DestinationRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DestinationRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDestination_DestinationName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DestinationName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDestination_DestinationShortName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DestinationShortName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceInformationEClass,
		   source,
		   new String[] {
			   "name", "DeviceInformationStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceInformation_DeviceName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceInformation_Manufacturer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Manufacturer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceInformation_SerialNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SerialNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceInformation_DeviceClass(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceClass",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceInformation_DataVersionList(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DataVersionList",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceInformation_WebInterfaceAddress(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "WebInterfaceAddress",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceSpecificationListEClass,
		   source,
		   new String[] {
			   "name", "DeviceSpecificationListStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceSpecificationList_DeviceSpecification(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceSpecification",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceSpecificationEClass,
		   source,
		   new String[] {
			   "name", "DeviceSpecificationStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceSpecification_DeviceClass(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceClass",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceSpecification_DeviceID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceSpecificationWithStateListEClass,
		   source,
		   new String[] {
			   "name", "DeviceSpecificationWithStateListStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceSpecificationWithStateList_DeviceSpecificationWithState(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceSpecificationWithState",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceSpecificationWithStateEClass,
		   source,
		   new String[] {
			   "name", "DeviceSpecificationWithStateStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceSpecificationWithState_DeviceSpecification(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceSpecification",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceSpecificationWithState_DeviceState(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceState",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (displayContentEClass,
		   source,
		   new String[] {
			   "name", "DisplayContentStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDisplayContent_DisplayContentRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DisplayContentRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDisplayContent_LineInformation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LineInformation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDisplayContent_Destination(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Destination",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDisplayContent_ViaPoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ViaPoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDisplayContent_AdditionalInformation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalInformation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDisplayContent_AdditionalInformation1(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalInformation1",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDisplayContent_AdditionalInformation2(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalInformation2",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDisplayContent_AdditionalInformation3(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalInformation3",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDisplayContent_AdditionalInformation4(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalInformation4",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDisplayContent_AdditionalInformation5(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalInformation5",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDisplayContent_AdditionalInformation6(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalInformation6",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDisplayContent_AdditionalInformation7(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalInformation7",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDisplayContent_AdditionalInformation8(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalInformation8",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDisplayContent_AdditionalInformation9(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalInformation9",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDisplayContent_RunNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RunNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDisplayContent_Priority(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Priority",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDisplayContent_PeriodDuration(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PeriodDuration",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDisplayContent_Duration(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Duration",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (documentRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDocumentRoot_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmlns:prefix"
		   });
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
		addAnnotation
		  (getDocumentRoot_AirSubmode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AirSubmode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_BusSubmode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BusSubmode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_CoachSubmode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CoachSubmode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_DataAcceptedResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DataAcceptedResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_FunicularSubmode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FunicularSubmode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_MetroSubmode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MetroSubmode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_RailSubmode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RailSubmode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_SelfDriveSubmode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SelfDriveSubmode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_SubscribeRequest(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SubscribeRequest",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_SubscribeResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SubscribeResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_TaxiSubmode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TaxiSubmode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_TelecabinSubmode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TelecabinSubmode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_TramSubmode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TramSubmode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_UnsubscribeRequest(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UnsubscribeRequest",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_UnsubscribeResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UnsubscribeResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_WaterSubmode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "WaterSubmode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (doorCountingListEClass,
		   source,
		   new String[] {
			   "name", "DoorCountingListStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDoorCountingList_DoorID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DoorID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDoorCountingList_CountSet(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CountSet",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (doorCountingEClass,
		   source,
		   new String[] {
			   "name", "DoorCountingStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDoorCounting_ObjectClass(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ObjectClass",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDoorCounting_In(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "In",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDoorCounting_Out(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Out",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDoorCounting_CountQuality(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CountQuality",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (doorInformationEClass,
		   source,
		   new String[] {
			   "name", "DoorInformationStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDoorInformation_DoorID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DoorID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDoorInformation_Count(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Count",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDoorInformation_State(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "State",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (doorOpenStateEClass,
		   source,
		   new String[] {
			   "name", "DoorOpenStateStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDoorOpenState_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Value",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDoorOpenState_ErrorCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ErrorCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (doorOperationStateEClass,
		   source,
		   new String[] {
			   "name", "DoorOperationStateStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDoorOperationState_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Value",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDoorOperationState_ErrorCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ErrorCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (doorStateEClass,
		   source,
		   new String[] {
			   "name", "DoorStateStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDoorState_OpenState(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OpenState",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDoorState_OperationState(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OperationState",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (fareZoneInformationEClass,
		   source,
		   new String[] {
			   "name", "FareZoneInformationStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFareZoneInformation_FareZoneID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FareZoneID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFareZoneInformation_FareZoneType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FareZoneType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFareZoneInformation_FareZoneLongName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FareZoneLongName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFareZoneInformation_FareZoneShortName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FareZoneShortName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (globalCardStatusEClass,
		   source,
		   new String[] {
			   "name", "GlobalCardStatus",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGlobalCardStatus_GlobalCardStausID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GlobalCardStausID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGlobalCardStatus_GlobalCardStatusText(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GlobalCardStatusText",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (gnssCoordinateEClass,
		   source,
		   new String[] {
			   "name", "GNSSCoordinateStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGNSSCoordinate_Degree(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Degree",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGNSSCoordinate_Direction(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Direction",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (gnssPointEClass,
		   source,
		   new String[] {
			   "name", "GNSSPointStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGNSSPoint_PointRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PointRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGNSSPoint_Longitude(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Longitude",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGNSSPoint_Latitude(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Latitude",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGNSSPoint_Altitude(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Altitude",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (ibisipAnyURIEClass,
		   source,
		   new String[] {
			   "name", "IBIS-IP.anyURI",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIBISIPAnyURI_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Value",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getIBISIPAnyURI_ErrorCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ErrorCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (ibisipBooleanEClass,
		   source,
		   new String[] {
			   "name", "IBIS-IP.boolean",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIBISIPBoolean_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Value",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getIBISIPBoolean_ErrorCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ErrorCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (ibisipByteEClass,
		   source,
		   new String[] {
			   "name", "IBIS-IP.byte",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIBISIPByte_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Value",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getIBISIPByte_ErrorCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ErrorCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (ibisipDateEClass,
		   source,
		   new String[] {
			   "name", "IBIS-IP.date",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIBISIPDate_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Value",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getIBISIPDate_ErrorCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ErrorCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (ibisipDateTimeEClass,
		   source,
		   new String[] {
			   "name", "IBIS-IP.dateTime",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIBISIPDateTime_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Value",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getIBISIPDateTime_ErrorCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ErrorCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (ibisipDoubleEClass,
		   source,
		   new String[] {
			   "name", "IBIS-IP.double",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIBISIPDouble_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Value",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getIBISIPDouble_ErrorCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ErrorCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (ibisipDurationEClass,
		   source,
		   new String[] {
			   "name", "IBIS-IP.duration",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIBISIPDuration_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Value",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getIBISIPDuration_ErrorCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ErrorCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (ibisipIntEClass,
		   source,
		   new String[] {
			   "name", "IBIS-IP.int",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIBISIPInt_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Value",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getIBISIPInt_ErrorCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ErrorCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (ibisipLanguageEClass,
		   source,
		   new String[] {
			   "name", "IBIS-IP.language",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIBISIPLanguage_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Value",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getIBISIPLanguage_ErrorCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ErrorCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (ibisipnmtokenEClass,
		   source,
		   new String[] {
			   "name", "IBIS-IP.NMTOKEN",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIBISIPNMTOKEN_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Value",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getIBISIPNMTOKEN_ErrorCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ErrorCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (ibisipNonNegativeIntegerEClass,
		   source,
		   new String[] {
			   "name", "IBIS-IP.nonNegativeInteger",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIBISIPNonNegativeInteger_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Value",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getIBISIPNonNegativeInteger_ErrorCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ErrorCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (ibisipNormalizedStringEClass,
		   source,
		   new String[] {
			   "name", "IBIS-IP.normalizedString",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIBISIPNormalizedString_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Value",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getIBISIPNormalizedString_ErrorCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ErrorCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (ibisipStringEClass,
		   source,
		   new String[] {
			   "name", "IBIS-IP.string",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIBISIPString_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Value",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getIBISIPString_ErrorCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ErrorCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (ibisipTimeEClass,
		   source,
		   new String[] {
			   "name", "IBIS-IP.time",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIBISIPTime_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Value",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getIBISIPTime_ErrorCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ErrorCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (ibisipUnsignedIntEClass,
		   source,
		   new String[] {
			   "name", "IBIS-IP.unsignedInt",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIBISIPUnsignedInt_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Value",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getIBISIPUnsignedInt_ErrorCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ErrorCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (ibisipUnsignedLongEClass,
		   source,
		   new String[] {
			   "name", "IBIS-IP.unsignedLong",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIBISIPUnsignedLong_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Value",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getIBISIPUnsignedLong_ErrorCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ErrorCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (internationalTextTypeEClass,
		   source,
		   new String[] {
			   "name", "InternationalTextType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getInternationalTextType_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Value",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInternationalTextType_Language(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Language",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInternationalTextType_ErrorCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ErrorCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (journeyStopInformationEClass,
		   source,
		   new String[] {
			   "name", "JourneyStopInformationStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getJourneyStopInformation_StopRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StopRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getJourneyStopInformation_StopName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StopName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getJourneyStopInformation_StopAlternativeName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StopAlternativeName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getJourneyStopInformation_Platform(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Platform",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getJourneyStopInformation_DisplayContent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DisplayContent",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getJourneyStopInformation_Announcement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Announcement",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getJourneyStopInformation_ArrivalScheduled(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ArrivalScheduled",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getJourneyStopInformation_DepartureScheduled(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DepartureScheduled",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getJourneyStopInformation_Connection(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Connection",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getJourneyStopInformation_BayArea(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BayArea",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getJourneyStopInformation_GNSSPoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GNSSPoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getJourneyStopInformation_FareZone(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FareZone",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (lineInformationEClass,
		   source,
		   new String[] {
			   "name", "LineInformationStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLineInformation_LineRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LineRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLineInformation_LineName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LineName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLineInformation_LineShortName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LineShortName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLineInformation_LineNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LineNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLineInformation_LineCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LineCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (logMessageEClass,
		   source,
		   new String[] {
			   "name", "LogMessageStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLogMessage_MessageProvider(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MessageProvider",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLogMessage_Message(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Message",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (messageEClass,
		   source,
		   new String[] {
			   "name", "MessageStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMessage_MessageID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Message-ID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMessage_TimeStamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimeStamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMessage_MessageType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MessageType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMessage_MessageText(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MessageText",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (netexModeEClass,
		   source,
		   new String[] {
			   "name", "NetexMode",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNetexMode_PtMainMode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PtMainMode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNetexMode_PrivateMainMode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PrivateMainMode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNetexMode_AirSubmode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AirSubmode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNetexMode_BusSubmode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BusSubmode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNetexMode_CoachSubmode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CoachSubmode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNetexMode_FunicularSubmode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FunicularSubmode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNetexMode_MetroSubmode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MetroSubmode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNetexMode_TramSubmode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TramSubmode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNetexMode_TelecabinSubmode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TelecabinSubmode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNetexMode_RailSubmode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RailSubmode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNetexMode_WaterSubmode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "WaterSubmode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNetexMode_TaxiSubmode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TaxiSubmode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNetexMode_SelfDriveSubmode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SelfDriveSubmode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (pointSequenceEClass,
		   source,
		   new String[] {
			   "name", "PointSequenceStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPointSequence_Point(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Point",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (pointEClass,
		   source,
		   new String[] {
			   "name", "PointStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPoint_PointIndex(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PointIndex",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPoint_PointType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PointType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPoint_DistanceToPreviousPoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DistanceToPreviousPoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (pointTypeEClass,
		   source,
		   new String[] {
			   "name", "PointTypeStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPointType_StopPoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StopPoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPointType_BeaconPoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BeaconPoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPointType_GNSSLocationPoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GNSSLocationPoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPointType_TimingPoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimingPoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPointType_TSPPoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TSPPoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (serviceIdentificationEClass,
		   source,
		   new String[] {
			   "name", "ServiceIdentificationStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getServiceIdentification_Service(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Service",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getServiceIdentification_Device(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Device",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (serviceIdentificationWithStateListEClass,
		   source,
		   new String[] {
			   "name", "ServiceIdentificationWithStateListStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getServiceIdentificationWithStateList_ServiceIdentificationWithState(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ServiceIdentificationWithState",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (serviceIdentificationWithStateEClass,
		   source,
		   new String[] {
			   "name", "ServiceIdentificationWithStateStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getServiceIdentificationWithState_ServiceIdentification(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ServiceIdentification",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getServiceIdentificationWithState_ServiceState(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ServiceState",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (serviceInformationListEClass,
		   source,
		   new String[] {
			   "name", "ServiceInformationListStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getServiceInformationList_ServiceInformation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ServiceInformation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (serviceInformationEClass,
		   source,
		   new String[] {
			   "name", "ServiceInformationStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getServiceInformation_Service(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Service",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getServiceInformation_Autostart(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Autostart",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (serviceSpecificationEClass,
		   source,
		   new String[] {
			   "name", "ServiceSpecificationStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getServiceSpecification_ServiceName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ServiceName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getServiceSpecification_IBISIPVersion(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "IBIS-IP-Version",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (serviceSpecificationWithStateListEClass,
		   source,
		   new String[] {
			   "name", "ServiceSpecificationWithStateListStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getServiceSpecificationWithStateList_ServiceSpecificationWithState(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ServiceSpecificationWithState",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (serviceSpecificationWithStateEClass,
		   source,
		   new String[] {
			   "name", "ServiceSpecificationWithStateStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getServiceSpecificationWithState_ServiceSpecification(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ServiceSpecification",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getServiceSpecificationWithState_ServiceState(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ServiceState",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (serviceStartListEClass,
		   source,
		   new String[] {
			   "name", "ServiceStartListStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getServiceStartList_ServiceIdentification(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ServiceIdentification",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (serviceStartEClass,
		   source,
		   new String[] {
			   "name", "ServiceStartStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getServiceStart_ServiceIdentification(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ServiceIdentification",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getServiceStart_Autostart(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Autostart",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (shortTripStopListEClass,
		   source,
		   new String[] {
			   "name", "ShortTripStopListStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getShortTripStopList_ShortTripStop(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ShortTripStop",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (shortTripStopEClass,
		   source,
		   new String[] {
			   "name", "ShortTripStopStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getShortTripStop_JourneyStopInformation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "JourneyStopInformation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getShortTripStop_FareZoneInformation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FareZoneInformation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (specificPointEClass,
		   source,
		   new String[] {
			   "name", "SpecificPointStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSpecificPoint_PointRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PointRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSpecificPoint_DistanceToPreviousPoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DistanceToPreviousPoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (stopInformationRequestEClass,
		   source,
		   new String[] {
			   "name", "StopInformationRequestStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStopInformationRequest_StopIndex(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StopIndex",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformationRequest_StopRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StopRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformationRequest_StopName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StopName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformationRequest_DisplayContent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DisplayContent",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformationRequest_StopAnnouncement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StopAnnouncement",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformationRequest_ArrivalScheduled(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ArrivalScheduled",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformationRequest_DepartureScheduled(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DepartureScheduled",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformationRequest_RecordedArrivalTime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RecordedArrivalTime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformationRequest_DistanceToNextStop(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DistanceToNextStop",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformationRequest_Connection(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Connection",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformationRequest_FareZone(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FareZone",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (stopInformationEClass,
		   source,
		   new String[] {
			   "name", "StopInformationStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStopInformation_StopIndex(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StopIndex",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformation_StopRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StopRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformation_StopName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StopName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformation_StopAlternativeName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StopAlternativeName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformation_Platform(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Platform",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformation_DisplayContent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DisplayContent",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformation_StopAnnouncement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StopAnnouncement",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformation_ArrivalScheduled(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ArrivalScheduled",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformation_ArrivalExpected(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ArrivalExpected",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformation_DepartureScheduled(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DepartureScheduled",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformation_DepartureExpected(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DepartureExpected",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformation_RecordedArrivalTime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RecordedArrivalTime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformation_DistanceToNextStop(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DistanceToNextStop",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformation_Connection(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Connection",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformation_FareZone(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FareZone",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (stopPointTariffInformationEClass,
		   source,
		   new String[] {
			   "name", "StopPointTariffInformationStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStopPointTariffInformation_JourneyStopInformation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "JourneyStopInformation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopPointTariffInformation_FareZoneInformation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FareZoneInformation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (stopSequenceEClass,
		   source,
		   new String[] {
			   "name", "StopSequenceStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStopSequence_StopPoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StopPoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (subscribeRequestEClass,
		   source,
		   new String[] {
			   "name", "SubscribeRequestStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSubscribeRequest_ClientIPAddress(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Client-IP-Address",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSubscribeRequest_ReplyPort(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ReplyPort",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSubscribeRequest_ReplyPath(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ReplyPath",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (subscribeResponseEClass,
		   source,
		   new String[] {
			   "name", "SubscribeResponseStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSubscribeResponse_Active(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Active",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSubscribeResponse_Heartbeat(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Heartbeat",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (timingPointEClass,
		   source,
		   new String[] {
			   "name", "TimingPointStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTimingPoint_TimingPointRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimingPointRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTimingPoint_ScheduleTime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ScheduleTime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTimingPoint_GNSSPoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GNSSPoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tripInformationEClass,
		   source,
		   new String[] {
			   "name", "TripInformationStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTripInformation_TripRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TripRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripInformation_StopSequence(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StopSequence",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripInformation_LocationState(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LocationState",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripInformation_TimetableDelay(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimetableDelay",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripInformation_AdditionalTextMessage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalTextMessage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripInformation_AdditionalTextMessage1(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalTextMessage1",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripInformation_AdditionalTextMessage2(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalTextMessage2",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripInformation_AdditionalTextMessage3(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalTextMessage3",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripInformation_AdditionalTextMessage4(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalTextMessage4",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripInformation_AdditionalTextMessage5(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalTextMessage5",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripInformation_AdditionalTextMessage6(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalTextMessage6",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripInformation_AdditionalTextMessage7(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalTextMessage7",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripInformation_AdditionalTextMessage8(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalTextMessage8",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripInformation_AdditionalTextMessage9(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalTextMessage9",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripInformation_AdditionalAnnouncement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalAnnouncement",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripInformation_RouteDirection(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RouteDirection",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripInformation_RunNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RunNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripInformation_PatternNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PatternNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripInformation_PathDestinationNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PathDestinationNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tripSequenceEClass,
		   source,
		   new String[] {
			   "name", "TripSequenceStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTripSequence_TripRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TripRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripSequence_TripIndex(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TripIndex",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripSequence_TripStart(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TripStart",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripSequence_CurrentStopIndex(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CurrentStopIndex",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripSequence_JourneyMode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "JourneyMode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripSequence_PointSequence(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PointSequence",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tspPointEClass,
		   source,
		   new String[] {
			   "name", "TSPPointStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTSPPoint_TSPPointRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TSPPointRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTSPPoint_TSPCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TSPCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTSPPoint_ShortName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ShortName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTSPPoint_Desciption(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Desciption",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (unsubscribeRequestEClass,
		   source,
		   new String[] {
			   "name", "UnsubscribeRequestStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUnsubscribeRequest_ClientIPAddress(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Client-IP-Address",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUnsubscribeRequest_ReplyPort(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ReplyPort",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUnsubscribeRequest_ReplyPath(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ReplyPath",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (unsubscribeResponseEClass,
		   source,
		   new String[] {
			   "name", "UnsubscribeResponseStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUnsubscribeResponse_Active(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Active",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (vehicleEClass,
		   source,
		   new String[] {
			   "name", "VehicleStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getVehicle_VehicleTypeRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "VehicleTypeRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVehicle_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (viaPointEClass,
		   source,
		   new String[] {
			   "name", "ViaPointStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getViaPoint_ViaPointRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ViaPointRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getViaPoint_PlaceRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PlaceRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getViaPoint_PlaceName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PlaceName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getViaPoint_PlaceShortName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PlaceShortName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getViaPoint_ViaPointDisplayPriority(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ViaPointDisplayPriority",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (zoneTypeEClass,
		   source,
		   new String[] {
			   "name", "ZoneType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZoneType_FarezoneTypeID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FarezoneTypeID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getZoneType_FareZoneTypeName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FareZoneTypeName",
			   "namespace", "##targetNamespace"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (additionalAnnouncementEClass,
		   source,
		   new String[] {
			   "documentation", "Structure for decscribing the informations for an additional announcement"
		   });
		addAnnotation
		  (getAdditionalAnnouncement_AnnouncementRef(),
		   source,
		   new String[] {
			   "documentation", "Reference to the Announcement in the schedule data"
		   });
		addAnnotation
		  (getAdditionalAnnouncement_AnnouncementText(),
		   source,
		   new String[] {
			   "documentation", "Text of the Announcement"
		   });
		addAnnotation
		  (getAdditionalAnnouncement_AnnouncementTTSText(),
		   source,
		   new String[] {
			   "documentation", "Text of the Announcement for a text-to-speech-system"
		   });
		addAnnotation
		  (getAdditionalAnnouncement_ImmediateInformation(),
		   source,
		   new String[] {
			   "documentation", "true, if the additional annoucement should be pronounced immiditaley"
		   });
		addAnnotation
		  (getAdditionalAnnouncement_PeriodicalInformation(),
		   source,
		   new String[] {
			   "documentation", "period in which the addional announcement should be played "
		   });
		addAnnotation
		  (getAdditionalAnnouncement_SpecificPoint(),
		   source,
		   new String[] {
			   "documentation", "describes a specific point, where the addional announcement should be played"
		   });
		addAnnotation
		  (announcementEClass,
		   source,
		   new String[] {
			   "documentation", "Structure for decscribing the informations for an regular announcement"
		   });
		addAnnotation
		  (getAnnouncement_AnnouncementRef(),
		   source,
		   new String[] {
			   "documentation", "Reference to the Announcement in the schedule data"
		   });
		addAnnotation
		  (getAnnouncement_AnnouncementText(),
		   source,
		   new String[] {
			   "documentation", "Text of the Announcement"
		   });
		addAnnotation
		  (getAnnouncement_AnnouncementTTSText(),
		   source,
		   new String[] {
			   "documentation", "Text of the Announcement for a text-to-speech-system"
		   });
		addAnnotation
		  (bayAreaEClass,
		   source,
		   new String[] {
			   "documentation", "Structure for describing an area at the stop point for detecting the right stop position"
		   });
		addAnnotation
		  (getBayArea_BeforeBay(),
		   source,
		   new String[] {
			   "documentation", "Distance before the defined Stoppoint, where the detection area begins, value in [m]"
		   });
		addAnnotation
		  (getBayArea_BehindBay(),
		   source,
		   new String[] {
			   "documentation", "Distance behind the defined Stoppoint, where the detection area begins, value in [m]"
		   });
		addAnnotation
		  (beaconPointEClass,
		   source,
		   new String[] {
			   "documentation", "Structure for describing a beacon point"
		   });
		addAnnotation
		  (getBeaconPoint_PointRef(),
		   source,
		   new String[] {
			   "documentation", "Reference to the beacon point in the schedule data"
		   });
		addAnnotation
		  (getBeaconPoint_BeaconCode(),
		   source,
		   new String[] {
			   "documentation", "Code of the beacon point"
		   });
		addAnnotation
		  (getBeaconPoint_ShortName(),
		   source,
		   new String[] {
			   "documentation", "Shortname of the beaon point"
		   });
		addAnnotation
		  (getBeaconPoint_Desciption(),
		   source,
		   new String[] {
			   "documentation", "Text, which gives some additional information on the beacon point"
		   });
		addAnnotation
		  (getCardApplInformations_CardApplInformationLength(),
		   source,
		   new String[] {
			   "documentation", "Length of the bytearray of applikationdata"
		   });
		addAnnotation
		  (getCardApplInformations_CardApplInformationData(),
		   source,
		   new String[] {
			   "documentation", "Applikationdata from Card as Byte-Array "
		   });
		addAnnotation
		  (getCardTicketData_CardTicketDataLength(),
		   source,
		   new String[] {
			   "documentation", "Length of the bytearray of ticketdata"
		   });
		addAnnotation
		  (getCardTicketData_CardTicketData(),
		   source,
		   new String[] {
			   "documentation", "Ticketdata from Card as  Byte-Array"
		   });
		addAnnotation
		  (connectionEClass,
		   source,
		   new String[] {
			   "documentation", "Structure for describing a connection"
		   });
		addAnnotation
		  (getConnection_StopRef(),
		   source,
		   new String[] {
			   "documentation", "StopPoint, where the connection should take place (from planning system)"
		   });
		addAnnotation
		  (getConnection_ConnectionRef(),
		   source,
		   new String[] {
			   "documentation", "StopPoint-referenced connection-reference"
		   });
		addAnnotation
		  (getConnection_ConnectionType(),
		   source,
		   new String[] {
			   "documentation", "Describes the kind of connection "
		   });
		addAnnotation
		  (getConnection_DisplayContent(),
		   source,
		   new String[] {
			   "documentation", "Structure for desccribing the information which is shown on a head- or sidesign"
		   });
		addAnnotation
		  (getConnection_Platform(),
		   source,
		   new String[] {
			   "documentation", "Platform, on which the connection should take place"
		   });
		addAnnotation
		  (getConnection_ConnectionState(),
		   source,
		   new String[] {
			   "documentation", "Describes the status of the connection"
		   });
		addAnnotation
		  (getConnection_TransportMode(),
		   source,
		   new String[] {
			   "documentation", "Describes the mode of the pick-up vehicle, DEPRECATED !, THE ConnectionMode SHOULD BE USED INSTEAD"
		   });
		addAnnotation
		  (getConnection_ConnectionMode(),
		   source,
		   new String[] {
			   "documentation", "Mode- and Submode information of the pick-up vehicle in accordance with Netex"
		   });
		addAnnotation
		  (getConnection_ExpectedDepartureTime(),
		   source,
		   new String[] {
			   "documentation", "Information, at which time the leaving vehicle will depart based on realtime information"
		   });
		addAnnotation
		  (getConnection_ScheduledDepartureTime(),
		   source,
		   new String[] {
			   "documentation", "Information, at which time the leaving vehicle is planned to depart"
		   });
		addAnnotation
		  (dataVersionEClass,
		   source,
		   new String[] {
			   "documentation", "Structure for describing data-versions"
		   });
		addAnnotation
		  (getDataVersion_DataType(),
		   source,
		   new String[] {
			   "documentation", "Kind of data"
		   });
		addAnnotation
		  (getDataVersion_VersionRef(),
		   source,
		   new String[] {
			   "documentation", "Versionreference of the data"
		   });
		addAnnotation
		  (destinationEClass,
		   source,
		   new String[] {
			   "documentation", "Structure for describing destination information"
		   });
		addAnnotation
		  (getDestination_DestinationRef(),
		   source,
		   new String[] {
			   "documentation", "Reference to the destination-information in the schedule-data"
		   });
		addAnnotation
		  (getDestination_DestinationName(),
		   source,
		   new String[] {
			   "documentation", "Text of the destination"
		   });
		addAnnotation
		  (getDestination_DestinationShortName(),
		   source,
		   new String[] {
			   "documentation", "Shorttext of the destination if there is limited space"
		   });
		addAnnotation
		  (displayContentEClass,
		   source,
		   new String[] {
			   "documentation", "Structure for describing the information for a headsign or a sidesign"
		   });
		addAnnotation
		  (getDisplayContent_DisplayContentRef(),
		   source,
		   new String[] {
			   "documentation", "Reference to the display content information in the schedule data"
		   });
		addAnnotation
		  (getDisplayContent_LineInformation(),
		   source,
		   new String[] {
			   "documentation", "Information on the line, which should be displayed"
		   });
		addAnnotation
		  (getDisplayContent_Destination(),
		   source,
		   new String[] {
			   "documentation", "Information on the destination, which should be displayed"
		   });
		addAnnotation
		  (getDisplayContent_ViaPoint(),
		   source,
		   new String[] {
			   "documentation", "Information on the via points which should be displayed"
		   });
		addAnnotation
		  (getDisplayContent_AdditionalInformation(),
		   source,
		   new String[] {
			   "documentation", "Additional Information Text, which could be displayed, e.g. \"Extra Ride\", \"Express\", ... "
		   });
		addAnnotation
		  (getDisplayContent_AdditionalInformation1(),
		   source,
		   new String[] {
			   "documentation", "Additional Information Text, which is assigned project-specific"
		   });
		addAnnotation
		  (getDisplayContent_AdditionalInformation2(),
		   source,
		   new String[] {
			   "documentation", "Additional Information Text, which is assigned project-specific"
		   });
		addAnnotation
		  (getDisplayContent_AdditionalInformation3(),
		   source,
		   new String[] {
			   "documentation", "Additional Information Text, which is assigned project-specific"
		   });
		addAnnotation
		  (getDisplayContent_AdditionalInformation4(),
		   source,
		   new String[] {
			   "documentation", "Additional Information Text, which is assigned project-specific"
		   });
		addAnnotation
		  (getDisplayContent_AdditionalInformation5(),
		   source,
		   new String[] {
			   "documentation", "Additional Information Text, which is assigned project-specific"
		   });
		addAnnotation
		  (getDisplayContent_AdditionalInformation6(),
		   source,
		   new String[] {
			   "documentation", "Additional Information Text, which is assigned project-specific"
		   });
		addAnnotation
		  (getDisplayContent_AdditionalInformation7(),
		   source,
		   new String[] {
			   "documentation", "Additional Information Text, which is assigned project-specific"
		   });
		addAnnotation
		  (getDisplayContent_AdditionalInformation8(),
		   source,
		   new String[] {
			   "documentation", "Additional Information Text, which is assigned project-specific"
		   });
		addAnnotation
		  (getDisplayContent_AdditionalInformation9(),
		   source,
		   new String[] {
			   "documentation", "Additional Information Text, which is assigned project-specific"
		   });
		addAnnotation
		  (getDisplayContent_RunNumber(),
		   source,
		   new String[] {
			   "documentation", "The run number (Kurs-Nummer) the trip is operated "
		   });
		addAnnotation
		  (getDisplayContent_Priority(),
		   source,
		   new String[] {
			   "documentation", "Value, which allows to decide which Information is shown, if there is not enough time to show all"
		   });
		addAnnotation
		  (getDisplayContent_PeriodDuration(),
		   source,
		   new String[] {
			   "documentation", "If more than one Sign-Information is given, you need to know"
		   });
		addAnnotation
		  (getDisplayContent_Duration(),
		   source,
		   new String[] {
			   "documentation", "Time-Value, which defines the part of the Periodtime in which this Sign-Information should be shown"
		   });
		addAnnotation
		  (getDocumentRoot_AirSubmode(),
		   source,
		   new String[] {
			   "documentation", "TPEG pti08 Air submodes."
		   });
		addAnnotation
		  (getDocumentRoot_BusSubmode(),
		   source,
		   new String[] {
			   "documentation", "TPEG pti05 Bus submodes."
		   });
		addAnnotation
		  (getDocumentRoot_CoachSubmode(),
		   source,
		   new String[] {
			   "documentation", "TPEG pti03 Coach submodes."
		   });
		addAnnotation
		  (getDocumentRoot_FunicularSubmode(),
		   source,
		   new String[] {
			   "documentation", "TPEG pti10 Funicular submodes."
		   });
		addAnnotation
		  (getDocumentRoot_MetroSubmode(),
		   source,
		   new String[] {
			   "documentation", "TPEG pti04 Metro submodes."
		   });
		addAnnotation
		  (getDocumentRoot_RailSubmode(),
		   source,
		   new String[] {
			   "documentation", "TPEG pti02 Rail submodes loc13.\n\t\t\tSee also See ERA B.4.7009 - Name: Item description code."
		   });
		addAnnotation
		  (getDocumentRoot_SelfDriveSubmode(),
		   source,
		   new String[] {
			   "documentation", "TPEG pti12 SelfDrive submodes."
		   });
		addAnnotation
		  (getDocumentRoot_TaxiSubmode(),
		   source,
		   new String[] {
			   "documentation", "TPEG pti11 Taxi submodes."
		   });
		addAnnotation
		  (getDocumentRoot_TelecabinSubmode(),
		   source,
		   new String[] {
			   "documentation", "TPEG pti09 Telecabin submodes."
		   });
		addAnnotation
		  (getDocumentRoot_TramSubmode(),
		   source,
		   new String[] {
			   "documentation", "TPEG pti06 Tram submodes."
		   });
		addAnnotation
		  (getDocumentRoot_WaterSubmode(),
		   source,
		   new String[] {
			   "documentation", "TPEG pti07 Water submodes."
		   });
		addAnnotation
		  (getFareZoneInformation_FareZoneID(),
		   source,
		   new String[] {
			   "documentation", "unique ID for the farezone"
		   });
		addAnnotation
		  (getGlobalCardStatus_GlobalCardStausID(),
		   source,
		   new String[] {
			   "documentation", "code according EN 1545"
		   });
		addAnnotation
		  (getGlobalCardStatus_GlobalCardStatusText(),
		   source,
		   new String[] {
			   "documentation", "text according EN 1545"
		   });
		addAnnotation
		  (gnssCoordinateEClass,
		   source,
		   new String[] {
			   "documentation", "Structure for describing a GNSS-Point"
		   });
		addAnnotation
		  (gnssPointEClass,
		   source,
		   new String[] {
			   "documentation", "Structure for describing a GNSS-Point"
		   });
		addAnnotation
		  (getGNSSPoint_PointRef(),
		   source,
		   new String[] {
			   "documentation", "Reference to the point in schedule data"
		   });
		addAnnotation
		  (getJourneyStopInformation_StopRef(),
		   source,
		   new String[] {
			   "documentation", "Reference to the stoppoint from the planning system\t"
		   });
		addAnnotation
		  (getJourneyStopInformation_Connection(),
		   source,
		   new String[] {
			   "documentation", "Information on Connections or Interchanges; not in StopSequence because of RealTimeInformation"
		   });
		addAnnotation
		  (getLineInformation_LineCode(),
		   source,
		   new String[] {
			   "documentation", "identifier of a symbol number , which is used by displays see LINIEN_CODE in VDV 452 chapter 9.7.2 REC_LID"
		   });
		addAnnotation
		  (getLogMessage_MessageProvider(),
		   source,
		   new String[] {
			   "documentation", "Name of the Service or Device, which sends the message, which has to be logged"
		   });
		addAnnotation
		  (getMessage_TimeStamp(),
		   source,
		   new String[] {
			   "documentation", "... of the ErrorMessage"
		   });
		addAnnotation
		  (netexModeEClass,
		   source,
		   new String[] {
			   "documentation", "a combined Mode and SubMode information in accordance with Netex \"netex_submode_version.xsd\""
		   });
		addAnnotation
		  (getNetexMode_AirSubmode(),
		   source,
		   new String[] {
			   "documentation", "TPEG pti08 Air submodes."
		   });
		addAnnotation
		  (getNetexMode_BusSubmode(),
		   source,
		   new String[] {
			   "documentation", "TPEG pti05 Bus submodes."
		   });
		addAnnotation
		  (getNetexMode_CoachSubmode(),
		   source,
		   new String[] {
			   "documentation", "TPEG pti03 Coach submodes."
		   });
		addAnnotation
		  (getNetexMode_FunicularSubmode(),
		   source,
		   new String[] {
			   "documentation", "TPEG pti10 Funicular submodes."
		   });
		addAnnotation
		  (getNetexMode_MetroSubmode(),
		   source,
		   new String[] {
			   "documentation", "TPEG pti04 Metro submodes."
		   });
		addAnnotation
		  (getNetexMode_TramSubmode(),
		   source,
		   new String[] {
			   "documentation", "TPEG pti06 Tram submodes."
		   });
		addAnnotation
		  (getNetexMode_TelecabinSubmode(),
		   source,
		   new String[] {
			   "documentation", "TPEG pti09 Telecabin submodes."
		   });
		addAnnotation
		  (getNetexMode_RailSubmode(),
		   source,
		   new String[] {
			   "documentation", "TPEG pti02 Rail submodes loc13.\n\t\t\tSee also See ERA B.4.7009 - Name: Item description code."
		   });
		addAnnotation
		  (getNetexMode_WaterSubmode(),
		   source,
		   new String[] {
			   "documentation", "TPEG pti07 Water submodes."
		   });
		addAnnotation
		  (getNetexMode_TaxiSubmode(),
		   source,
		   new String[] {
			   "documentation", "TPEG pti11 Taxi submodes."
		   });
		addAnnotation
		  (getNetexMode_SelfDriveSubmode(),
		   source,
		   new String[] {
			   "documentation", "TPEG pti12 SelfDrive submodes."
		   });
		addAnnotation
		  (getPoint_DistanceToPreviousPoint(),
		   source,
		   new String[] {
			   "documentation", "aus REC-SEL bzw. REC_SEL_ZP der VDV 452"
		   });
		addAnnotation
		  (getPointType_StopPoint(),
		   source,
		   new String[] {
			   "documentation", "In Analogie zu REC_ORT aus VDV 452"
		   });
		addAnnotation
		  (getPointType_GNSSLocationPoint(),
		   source,
		   new String[] {
			   "documentation", "Point, where specific GNSS-Information is provided, \"GNSS-Solution\" for the Beacon-Points, analogue to REC_OM from VDV 452"
		   });
		addAnnotation
		  (getPointType_TSPPoint(),
		   source,
		   new String[] {
			   "documentation", "Point, where Information for TrafficSignalPriorisation is provided "
		   });
		addAnnotation
		  (getStopInformationRequest_StopIndex(),
		   source,
		   new String[] {
			   "documentation", "StopIndex on current trip\t"
		   });
		addAnnotation
		  (getStopInformationRequest_StopRef(),
		   source,
		   new String[] {
			   "documentation", "Reference to the stoppoint from the planning system\t"
		   });
		addAnnotation
		  (getStopInformationRequest_RecordedArrivalTime(),
		   source,
		   new String[] {
			   "documentation", "This Value is needed for the demonstration at the SSB"
		   });
		addAnnotation
		  (getStopInformationRequest_DistanceToNextStop(),
		   source,
		   new String[] {
			   "documentation", "Soll-Abstand zwischen den Haltestellen"
		   });
		addAnnotation
		  (getStopInformationRequest_Connection(),
		   source,
		   new String[] {
			   "documentation", "Information on Connections or Interchanges; not in StopSequence because of RealTimeInformation"
		   });
		addAnnotation
		  (getStopInformation_StopIndex(),
		   source,
		   new String[] {
			   "documentation", "StopIndex on current trip\t"
		   });
		addAnnotation
		  (getStopInformation_StopRef(),
		   source,
		   new String[] {
			   "documentation", "Reference to the stoppoint from the planning system\t"
		   });
		addAnnotation
		  (getStopInformation_ArrivalExpected(),
		   source,
		   new String[] {
			   "documentation", "A resolution of 30s is recommended, for the display it is recommended to show the arrival time in minutes."
		   });
		addAnnotation
		  (getStopInformation_RecordedArrivalTime(),
		   source,
		   new String[] {
			   "documentation", "This Value is needed for the demonstration at the SSB"
		   });
		addAnnotation
		  (getStopInformation_DistanceToNextStop(),
		   source,
		   new String[] {
			   "documentation", "Soll-Abstand zwischen den Haltestellen"
		   });
		addAnnotation
		  (getStopInformation_Connection(),
		   source,
		   new String[] {
			   "documentation", "Information on Connections or Interchanges; not in StopSequence because of RealTimeInformation"
		   });
		addAnnotation
		  (subscribeResponseEClass,
		   source,
		   new String[] {
			   "documentation", "For compatibility reasons, this structure is now a sequence of members, all of which are optional - of course, at least one member should be included in meaningful data."
		   });
		addAnnotation
		  (getSubscribeResponse_Heartbeat(),
		   source,
		   new String[] {
			   "documentation", "If the service returns a heartbeat value and it is not 0, the subscriber can expect that the service will send data at least every heartbeat seconds.\tThis heartbeat can be used to monitor the connection quality by the client. "
		   });
		addAnnotation
		  (getTripInformation_StopSequence(),
		   source,
		   new String[] {
			   "documentation", "List of StopPoints; with additional information"
		   });
		addAnnotation
		  (getTripInformation_LocationState(),
		   source,
		   new String[] {
			   "documentation", "Information of the location state"
		   });
		addAnnotation
		  (getTripInformation_TimetableDelay(),
		   source,
		   new String[] {
			   "documentation", "Delay in seconds. Early times are shown as negative values.\n\n            \t\t\ttbd: what happens, if this value isn\'t set\n            \t\t"
		   });
		addAnnotation
		  (getTripInformation_AdditionalAnnouncement(),
		   source,
		   new String[] {
			   "documentation", "not StopPointAnnouncements; additional announcements; e.g. of the operator or dispatcher"
		   });
		addAnnotation
		  (getTripInformation_RouteDirection(),
		   source,
		   new String[] {
			   "documentation", "The direction of the route, 1->forward 2->backwards and  0->UNDEFINED "
		   });
		addAnnotation
		  (getTripInformation_RunNumber(),
		   source,
		   new String[] {
			   "documentation", "The run number (Kurs-Nummer) the trip is operated "
		   });
		addAnnotation
		  (getTripInformation_PatternNumber(),
		   source,
		   new String[] {
			   "documentation", "The pattern number (Linienfahrweg-Nummer) the trip is operated "
		   });
		addAnnotation
		  (getTripInformation_PathDestinationNumber(),
		   source,
		   new String[] {
			   "documentation", "The path destination number (RoutenZiel-Nummer) the trip is operated "
		   });
		addAnnotation
		  (getTripSequence_TripStart(),
		   source,
		   new String[] {
			   "documentation", "Time, at which the trip is starting"
		   });
		addAnnotation
		  (getTripSequence_PointSequence(),
		   source,
		   new String[] {
			   "documentation", "In Analogie zu LID-Verlauf aus VDV 452"
		   });
		addAnnotation
		  (viaPointEClass,
		   source,
		   new String[] {
			   "documentation", "Structure for describing a via point on journey."
		   });
		addAnnotation
		  (getViaPoint_PlaceRef(),
		   source,
		   new String[] {
			   "documentation", "The identifier of the via place in the journey; used to help identify the vehicle journey on arrival boards."
		   });
		addAnnotation
		  (getViaPoint_PlaceName(),
		   source,
		   new String[] {
			   "documentation", "The name of the via place in the journey; used to help identify the vehicle to the public."
		   });
		addAnnotation
		  (getViaPoint_PlaceShortName(),
		   source,
		   new String[] {
			   "documentation", "The short name of the via place in the journey; used to help identify the vehicle to the public."
		   });
		addAnnotation
		  (getViaPoint_ViaPointDisplayPriority(),
		   source,
		   new String[] {
			   "documentation", "Value, which defines a priority to select a number of via points, if not all via points can be shown"
		   });
	}

} //IbisCommonPackageImpl
