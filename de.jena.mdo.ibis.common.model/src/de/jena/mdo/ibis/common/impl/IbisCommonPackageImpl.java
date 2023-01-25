/**
 */
package de.jena.mdo.ibis.common.impl;

import de.jena.mdo.ibis.common.AdditionalAnnouncementStructure;
import de.jena.mdo.ibis.common.AnnouncementStructure;
import de.jena.mdo.ibis.common.BayAreaStructure;
import de.jena.mdo.ibis.common.BeaconPointStructure;
import de.jena.mdo.ibis.common.CardApplInformations;
import de.jena.mdo.ibis.common.CardTicketData;
import de.jena.mdo.ibis.common.CardType;
import de.jena.mdo.ibis.common.ConnectionStructure;
import de.jena.mdo.ibis.common.DataAcceptedResponseDataStructure;
import de.jena.mdo.ibis.common.DataAcceptedResponseStructure;
import de.jena.mdo.ibis.common.DataVersionListStructure;
import de.jena.mdo.ibis.common.DataVersionStructure;
import de.jena.mdo.ibis.common.DegreeType;
import de.jena.mdo.ibis.common.DestinationStructure;
import de.jena.mdo.ibis.common.DeviceInformationStructure;
import de.jena.mdo.ibis.common.DeviceSpecificationListStructure;
import de.jena.mdo.ibis.common.DeviceSpecificationStructure;
import de.jena.mdo.ibis.common.DeviceSpecificationWithStateListStructure;
import de.jena.mdo.ibis.common.DeviceSpecificationWithStateStructure;
import de.jena.mdo.ibis.common.DisplayContentStructure;
import de.jena.mdo.ibis.common.DocumentRoot;
import de.jena.mdo.ibis.common.DoorCountingListStructure;
import de.jena.mdo.ibis.common.DoorCountingStructure;
import de.jena.mdo.ibis.common.DoorInformationStructure;
import de.jena.mdo.ibis.common.DoorOpenStateStructure;
import de.jena.mdo.ibis.common.DoorOperationStateStructure;
import de.jena.mdo.ibis.common.DoorStateStructure;
import de.jena.mdo.ibis.common.FareZoneInformationStructure;
import de.jena.mdo.ibis.common.GNSSCoordinateStructure;
import de.jena.mdo.ibis.common.GNSSPointStructure;
import de.jena.mdo.ibis.common.GlobalCardStatus;
import de.jena.mdo.ibis.common.IBISIPAnyURI;
import de.jena.mdo.ibis.common.IBISIPBoolean;
import de.jena.mdo.ibis.common.IBISIPByte;
import de.jena.mdo.ibis.common.IBISIPDate;
import de.jena.mdo.ibis.common.IBISIPDateTime;
import de.jena.mdo.ibis.common.IBISIPDouble;
import de.jena.mdo.ibis.common.IBISIPDuration;
import de.jena.mdo.ibis.common.IBISIPInt;
import de.jena.mdo.ibis.common.IBISIPLanguage;
import de.jena.mdo.ibis.common.IBISIPNonNegativeInteger;
import de.jena.mdo.ibis.common.IBISIPNormalizedString;
import de.jena.mdo.ibis.common.IBISIPString;
import de.jena.mdo.ibis.common.IBISIPTime;
import de.jena.mdo.ibis.common.IBISIPUnsignedInt;
import de.jena.mdo.ibis.common.IBISIPUnsignedLong;
import de.jena.mdo.ibis.common.IbisCommonFactory;
import de.jena.mdo.ibis.common.IbisCommonPackage;
import de.jena.mdo.ibis.common.InternationalTextType;
import de.jena.mdo.ibis.common.JourneyStopInformationStructure;
import de.jena.mdo.ibis.common.LineInformationStructure;
import de.jena.mdo.ibis.common.LogMessageStructure;
import de.jena.mdo.ibis.common.MessageStructure;
import de.jena.mdo.ibis.common.NetexMode;
import de.jena.mdo.ibis.common.PointSequenceStructure;
import de.jena.mdo.ibis.common.PointStructure;
import de.jena.mdo.ibis.common.PointTypeStructure;
import de.jena.mdo.ibis.common.ServiceIdentificationStructure;
import de.jena.mdo.ibis.common.ServiceIdentificationWithStateListStructure;
import de.jena.mdo.ibis.common.ServiceIdentificationWithStateStructure;
import de.jena.mdo.ibis.common.ServiceInformationListStructure;
import de.jena.mdo.ibis.common.ServiceInformationStructure;
import de.jena.mdo.ibis.common.ServiceSpecificationStructure;
import de.jena.mdo.ibis.common.ServiceSpecificationWithStateListStructure;
import de.jena.mdo.ibis.common.ServiceSpecificationWithStateStructure;
import de.jena.mdo.ibis.common.ServiceStartListStructure;
import de.jena.mdo.ibis.common.ServiceStartStructure;
import de.jena.mdo.ibis.common.ShortTripStopListStructure;
import de.jena.mdo.ibis.common.ShortTripStopStructure;
import de.jena.mdo.ibis.common.SpecificPointStructure;
import de.jena.mdo.ibis.common.StopInformationRequestStructure;
import de.jena.mdo.ibis.common.StopInformationStructure;
import de.jena.mdo.ibis.common.StopPointTariffInformationStructure;
import de.jena.mdo.ibis.common.StopSequenceStructure;
import de.jena.mdo.ibis.common.SubscribeRequestStructure;
import de.jena.mdo.ibis.common.SubscribeResponseStructure;
import de.jena.mdo.ibis.common.TSPPointStructure;
import de.jena.mdo.ibis.common.TimingPointStructure;
import de.jena.mdo.ibis.common.TripInformationStructure;
import de.jena.mdo.ibis.common.TripSequenceStructure;
import de.jena.mdo.ibis.common.UnsubscribeRequestStructure;
import de.jena.mdo.ibis.common.UnsubscribeResponseStructure;
import de.jena.mdo.ibis.common.VehicleStructure;
import de.jena.mdo.ibis.common.ViaPointStructure;
import de.jena.mdo.ibis.common.ZoneType;

import de.jena.mdo.ibis.enumerations.IbisEnumerationsPackage;

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
	private EClass additionalAnnouncementStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass announcementStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bayAreaStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beaconPointStructureEClass = null;

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
	private EClass connectionStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAcceptedResponseDataStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAcceptedResponseStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataVersionListStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataVersionStructureEClass = null;

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
	private EClass destinationStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceInformationStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceSpecificationListStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceSpecificationStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceSpecificationWithStateListStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceSpecificationWithStateStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass displayContentStructureEClass = null;

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
	private EClass doorCountingListStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doorCountingStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doorInformationStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doorOpenStateStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doorOperationStateStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doorStateStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fareZoneInformationStructureEClass = null;

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
	private EClass gnssCoordinateStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gnssPointStructureEClass = null;

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
	private EClass journeyStopInformationStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineInformationStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logMessageStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageStructureEClass = null;

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
	private EClass pointSequenceStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointTypeStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceIdentificationStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceIdentificationWithStateListStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceIdentificationWithStateStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceInformationListStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceInformationStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceSpecificationStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceSpecificationWithStateListStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceSpecificationWithStateStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceStartListStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceStartStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shortTripStopListStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shortTripStopStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificPointStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stopInformationRequestStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stopInformationStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stopPointTariffInformationStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stopSequenceStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subscribeRequestStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subscribeResponseStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timingPointStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tripInformationStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tripSequenceStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tspPointStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unsubscribeRequestStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unsubscribeResponseStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vehicleStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viaPointStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zoneTypeEClass = null;

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
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#eNS_URI
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
	public EClass getAdditionalAnnouncementStructure() {
		return additionalAnnouncementStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdditionalAnnouncementStructure_AnnouncementRef() {
		return (EReference)additionalAnnouncementStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdditionalAnnouncementStructure_AnnouncementText() {
		return (EReference)additionalAnnouncementStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdditionalAnnouncementStructure_AnnouncementTTSText() {
		return (EReference)additionalAnnouncementStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdditionalAnnouncementStructure_ImmediateInformation() {
		return (EReference)additionalAnnouncementStructureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdditionalAnnouncementStructure_PeriodicalInformation() {
		return (EReference)additionalAnnouncementStructureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdditionalAnnouncementStructure_SpecificPoint() {
		return (EReference)additionalAnnouncementStructureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnouncementStructure() {
		return announcementStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnouncementStructure_AnnouncementRef() {
		return (EReference)announcementStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnouncementStructure_AnnouncementText() {
		return (EReference)announcementStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnouncementStructure_AnnouncementTTSText() {
		return (EReference)announcementStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBayAreaStructure() {
		return bayAreaStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBayAreaStructure_BeforeBay() {
		return (EReference)bayAreaStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBayAreaStructure_BehindBay() {
		return (EReference)bayAreaStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBeaconPointStructure() {
		return beaconPointStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBeaconPointStructure_PointRef() {
		return (EReference)beaconPointStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBeaconPointStructure_BeaconCode() {
		return (EReference)beaconPointStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBeaconPointStructure_ShortName() {
		return (EReference)beaconPointStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBeaconPointStructure_Desciption() {
		return (EReference)beaconPointStructureEClass.getEStructuralFeatures().get(3);
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
	public EClass getConnectionStructure() {
		return connectionStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectionStructure_StopRef() {
		return (EReference)connectionStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectionStructure_ConnectionRef() {
		return (EReference)connectionStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectionStructure_ConnectionType() {
		return (EAttribute)connectionStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectionStructure_DisplayContent() {
		return (EReference)connectionStructureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectionStructure_Platform() {
		return (EReference)connectionStructureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectionStructure_ConnectionState() {
		return (EAttribute)connectionStructureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectionStructure_TransportMode() {
		return (EReference)connectionStructureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectionStructure_ConnectionMode() {
		return (EReference)connectionStructureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectionStructure_ExpectedDepartureTime() {
		return (EReference)connectionStructureEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectionStructure_ScheduledDepartureTime() {
		return (EReference)connectionStructureEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataAcceptedResponseDataStructure() {
		return dataAcceptedResponseDataStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataAcceptedResponseDataStructure_TimeStamp() {
		return (EReference)dataAcceptedResponseDataStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataAcceptedResponseDataStructure_DataAccepted() {
		return (EReference)dataAcceptedResponseDataStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataAcceptedResponseDataStructure_ErrorCode() {
		return (EAttribute)dataAcceptedResponseDataStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataAcceptedResponseDataStructure_ErrorInformation() {
		return (EReference)dataAcceptedResponseDataStructureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataAcceptedResponseStructure() {
		return dataAcceptedResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataAcceptedResponseStructure_DataAcceptedResponseData() {
		return (EReference)dataAcceptedResponseStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataAcceptedResponseStructure_OperationErrorMessage() {
		return (EReference)dataAcceptedResponseStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataVersionListStructure() {
		return dataVersionListStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataVersionListStructure_DataVersion() {
		return (EReference)dataVersionListStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataVersionStructure() {
		return dataVersionStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataVersionStructure_DataType() {
		return (EReference)dataVersionStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataVersionStructure_VersionRef() {
		return (EReference)dataVersionStructureEClass.getEStructuralFeatures().get(1);
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
	public EClass getDestinationStructure() {
		return destinationStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDestinationStructure_DestinationRef() {
		return (EReference)destinationStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDestinationStructure_DestinationName() {
		return (EReference)destinationStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDestinationStructure_DestinationShortName() {
		return (EReference)destinationStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceInformationStructure() {
		return deviceInformationStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceInformationStructure_DeviceName() {
		return (EReference)deviceInformationStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceInformationStructure_Manufacturer() {
		return (EReference)deviceInformationStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceInformationStructure_SerialNumber() {
		return (EReference)deviceInformationStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceInformationStructure_DeviceClass() {
		return (EAttribute)deviceInformationStructureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceInformationStructure_DataVersionList() {
		return (EReference)deviceInformationStructureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceInformationStructure_WebInterfaceAddress() {
		return (EReference)deviceInformationStructureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceSpecificationListStructure() {
		return deviceSpecificationListStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceSpecificationListStructure_DeviceSpecification() {
		return (EReference)deviceSpecificationListStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceSpecificationStructure() {
		return deviceSpecificationStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceSpecificationStructure_DeviceClass() {
		return (EAttribute)deviceSpecificationStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceSpecificationStructure_DeviceID() {
		return (EReference)deviceSpecificationStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceSpecificationWithStateListStructure() {
		return deviceSpecificationWithStateListStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceSpecificationWithStateListStructure_DeviceSpecificationWithState() {
		return (EReference)deviceSpecificationWithStateListStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceSpecificationWithStateStructure() {
		return deviceSpecificationWithStateStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceSpecificationWithStateStructure_DeviceSpecification() {
		return (EReference)deviceSpecificationWithStateStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceSpecificationWithStateStructure_DeviceState() {
		return (EAttribute)deviceSpecificationWithStateStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDisplayContentStructure() {
		return displayContentStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContentStructure_DisplayContentRef() {
		return (EReference)displayContentStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContentStructure_LineInformation() {
		return (EReference)displayContentStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContentStructure_Destination() {
		return (EReference)displayContentStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContentStructure_ViaPoint() {
		return (EReference)displayContentStructureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContentStructure_AdditionalInformation() {
		return (EReference)displayContentStructureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContentStructure_AdditionalInformation1() {
		return (EReference)displayContentStructureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContentStructure_AdditionalInformation2() {
		return (EReference)displayContentStructureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContentStructure_AdditionalInformation3() {
		return (EReference)displayContentStructureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContentStructure_AdditionalInformation4() {
		return (EReference)displayContentStructureEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContentStructure_AdditionalInformation5() {
		return (EReference)displayContentStructureEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContentStructure_AdditionalInformation6() {
		return (EReference)displayContentStructureEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContentStructure_AdditionalInformation7() {
		return (EReference)displayContentStructureEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContentStructure_AdditionalInformation8() {
		return (EReference)displayContentStructureEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContentStructure_AdditionalInformation9() {
		return (EReference)displayContentStructureEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContentStructure_RunNumber() {
		return (EReference)displayContentStructureEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContentStructure_Priority() {
		return (EReference)displayContentStructureEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContentStructure_PeriodDuration() {
		return (EReference)displayContentStructureEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContentStructure_Duration() {
		return (EReference)displayContentStructureEClass.getEStructuralFeatures().get(17);
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
	public EClass getDoorCountingListStructure() {
		return doorCountingListStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoorCountingListStructure_DoorID() {
		return (EReference)doorCountingListStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoorCountingListStructure_CountSet() {
		return (EReference)doorCountingListStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDoorCountingStructure() {
		return doorCountingStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoorCountingStructure_ObjectClass() {
		return (EAttribute)doorCountingStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoorCountingStructure_In() {
		return (EReference)doorCountingStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoorCountingStructure_Out() {
		return (EReference)doorCountingStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoorCountingStructure_CountQuality() {
		return (EAttribute)doorCountingStructureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDoorInformationStructure() {
		return doorInformationStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoorInformationStructure_DoorID() {
		return (EReference)doorInformationStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoorInformationStructure_Count() {
		return (EReference)doorInformationStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoorInformationStructure_State() {
		return (EReference)doorInformationStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDoorOpenStateStructure() {
		return doorOpenStateStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoorOpenStateStructure_Value() {
		return (EAttribute)doorOpenStateStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoorOpenStateStructure_ErrorCode() {
		return (EAttribute)doorOpenStateStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDoorOperationStateStructure() {
		return doorOperationStateStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoorOperationStateStructure_Value() {
		return (EAttribute)doorOperationStateStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoorOperationStateStructure_ErrorCode() {
		return (EAttribute)doorOperationStateStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDoorStateStructure() {
		return doorStateStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoorStateStructure_OpenState() {
		return (EReference)doorStateStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoorStateStructure_OperationState() {
		return (EReference)doorStateStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFareZoneInformationStructure() {
		return fareZoneInformationStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFareZoneInformationStructure_FareZoneID() {
		return (EReference)fareZoneInformationStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFareZoneInformationStructure_FareZoneType() {
		return (EReference)fareZoneInformationStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFareZoneInformationStructure_FareZoneLongName() {
		return (EReference)fareZoneInformationStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFareZoneInformationStructure_FareZoneShortName() {
		return (EReference)fareZoneInformationStructureEClass.getEStructuralFeatures().get(3);
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
	public EClass getGNSSCoordinateStructure() {
		return gnssCoordinateStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSCoordinateStructure_Degree() {
		return (EReference)gnssCoordinateStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSCoordinateStructure_Direction() {
		return (EReference)gnssCoordinateStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGNSSPointStructure() {
		return gnssPointStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSPointStructure_PointRef() {
		return (EReference)gnssPointStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSPointStructure_Longitude() {
		return (EReference)gnssPointStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSPointStructure_Latitude() {
		return (EReference)gnssPointStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSPointStructure_Altitude() {
		return (EReference)gnssPointStructureEClass.getEStructuralFeatures().get(3);
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
	public EClass getJourneyStopInformationStructure() {
		return journeyStopInformationStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourneyStopInformationStructure_StopRef() {
		return (EReference)journeyStopInformationStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourneyStopInformationStructure_StopName() {
		return (EReference)journeyStopInformationStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourneyStopInformationStructure_StopAlternativeName() {
		return (EReference)journeyStopInformationStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourneyStopInformationStructure_Platform() {
		return (EReference)journeyStopInformationStructureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourneyStopInformationStructure_DisplayContent() {
		return (EReference)journeyStopInformationStructureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourneyStopInformationStructure_Announcement() {
		return (EReference)journeyStopInformationStructureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourneyStopInformationStructure_ArrivalScheduled() {
		return (EReference)journeyStopInformationStructureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourneyStopInformationStructure_DepartureScheduled() {
		return (EReference)journeyStopInformationStructureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourneyStopInformationStructure_Connection() {
		return (EReference)journeyStopInformationStructureEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourneyStopInformationStructure_BayArea() {
		return (EReference)journeyStopInformationStructureEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourneyStopInformationStructure_GNSSPoint() {
		return (EReference)journeyStopInformationStructureEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourneyStopInformationStructure_FareZone() {
		return (EReference)journeyStopInformationStructureEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLineInformationStructure() {
		return lineInformationStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLineInformationStructure_LineRef() {
		return (EReference)lineInformationStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLineInformationStructure_LineName() {
		return (EReference)lineInformationStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLineInformationStructure_LineShortName() {
		return (EReference)lineInformationStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLineInformationStructure_LineNumber() {
		return (EReference)lineInformationStructureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLineInformationStructure_LineCode() {
		return (EReference)lineInformationStructureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogMessageStructure() {
		return logMessageStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogMessageStructure_MessageProvider() {
		return (EReference)logMessageStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogMessageStructure_Message() {
		return (EReference)logMessageStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMessageStructure() {
		return messageStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMessageStructure_MessageID() {
		return (EReference)messageStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMessageStructure_TimeStamp() {
		return (EReference)messageStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessageStructure_MessageType() {
		return (EAttribute)messageStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMessageStructure_MessageText() {
		return (EReference)messageStructureEClass.getEStructuralFeatures().get(3);
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
	public EClass getPointSequenceStructure() {
		return pointSequenceStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPointSequenceStructure_Point() {
		return (EReference)pointSequenceStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPointStructure() {
		return pointStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPointStructure_PointIndex() {
		return (EReference)pointStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPointStructure_PointType() {
		return (EReference)pointStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPointStructure_DistanceToPreviousPoint() {
		return (EReference)pointStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPointTypeStructure() {
		return pointTypeStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPointTypeStructure_StopPoint() {
		return (EReference)pointTypeStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPointTypeStructure_BeaconPoint() {
		return (EReference)pointTypeStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPointTypeStructure_GNSSLocationPoint() {
		return (EReference)pointTypeStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPointTypeStructure_TimingPoint() {
		return (EReference)pointTypeStructureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPointTypeStructure_TSPPoint() {
		return (EReference)pointTypeStructureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceIdentificationStructure() {
		return serviceIdentificationStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceIdentificationStructure_Service() {
		return (EReference)serviceIdentificationStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceIdentificationStructure_Device() {
		return (EReference)serviceIdentificationStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceIdentificationWithStateListStructure() {
		return serviceIdentificationWithStateListStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceIdentificationWithStateListStructure_ServiceIdentificationWithState() {
		return (EReference)serviceIdentificationWithStateListStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceIdentificationWithStateStructure() {
		return serviceIdentificationWithStateStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceIdentificationWithStateStructure_ServiceIdentification() {
		return (EReference)serviceIdentificationWithStateStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceIdentificationWithStateStructure_ServiceState() {
		return (EAttribute)serviceIdentificationWithStateStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceInformationListStructure() {
		return serviceInformationListStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceInformationListStructure_ServiceInformation() {
		return (EReference)serviceInformationListStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceInformationStructure() {
		return serviceInformationStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceInformationStructure_Service() {
		return (EReference)serviceInformationStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceInformationStructure_Autostart() {
		return (EReference)serviceInformationStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceSpecificationStructure() {
		return serviceSpecificationStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceSpecificationStructure_ServiceName() {
		return (EAttribute)serviceSpecificationStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceSpecificationStructure_IBISIPVersion() {
		return (EReference)serviceSpecificationStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceSpecificationWithStateListStructure() {
		return serviceSpecificationWithStateListStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceSpecificationWithStateListStructure_ServiceSpecificationWithState() {
		return (EReference)serviceSpecificationWithStateListStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceSpecificationWithStateStructure() {
		return serviceSpecificationWithStateStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceSpecificationWithStateStructure_ServiceSpecification() {
		return (EReference)serviceSpecificationWithStateStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceSpecificationWithStateStructure_ServiceState() {
		return (EAttribute)serviceSpecificationWithStateStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceStartListStructure() {
		return serviceStartListStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceStartListStructure_ServiceIdentification() {
		return (EReference)serviceStartListStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceStartStructure() {
		return serviceStartStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceStartStructure_ServiceIdentification() {
		return (EReference)serviceStartStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceStartStructure_Autostart() {
		return (EReference)serviceStartStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShortTripStopListStructure() {
		return shortTripStopListStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShortTripStopListStructure_ShortTripStop() {
		return (EReference)shortTripStopListStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShortTripStopStructure() {
		return shortTripStopStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShortTripStopStructure_JourneyStopInformation() {
		return (EReference)shortTripStopStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShortTripStopStructure_FareZoneInformation() {
		return (EReference)shortTripStopStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpecificPointStructure() {
		return specificPointStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpecificPointStructure_PointRef() {
		return (EReference)specificPointStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpecificPointStructure_DistanceToPreviousPoint() {
		return (EReference)specificPointStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStopInformationRequestStructure() {
		return stopInformationRequestStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationRequestStructure_StopIndex() {
		return (EReference)stopInformationRequestStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationRequestStructure_StopRef() {
		return (EReference)stopInformationRequestStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationRequestStructure_StopName() {
		return (EReference)stopInformationRequestStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationRequestStructure_DisplayContent() {
		return (EReference)stopInformationRequestStructureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationRequestStructure_StopAnnouncement() {
		return (EReference)stopInformationRequestStructureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationRequestStructure_ArrivalScheduled() {
		return (EReference)stopInformationRequestStructureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationRequestStructure_DepartureScheduled() {
		return (EReference)stopInformationRequestStructureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationRequestStructure_RecordedArrivalTime() {
		return (EReference)stopInformationRequestStructureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationRequestStructure_DistanceToNextStop() {
		return (EReference)stopInformationRequestStructureEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationRequestStructure_Connection() {
		return (EReference)stopInformationRequestStructureEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationRequestStructure_FareZone() {
		return (EReference)stopInformationRequestStructureEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStopInformationStructure() {
		return stopInformationStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationStructure_StopIndex() {
		return (EReference)stopInformationStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationStructure_StopRef() {
		return (EReference)stopInformationStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationStructure_StopName() {
		return (EReference)stopInformationStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationStructure_StopAlternativeName() {
		return (EReference)stopInformationStructureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationStructure_Platform() {
		return (EReference)stopInformationStructureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationStructure_DisplayContent() {
		return (EReference)stopInformationStructureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationStructure_StopAnnouncement() {
		return (EReference)stopInformationStructureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationStructure_ArrivalScheduled() {
		return (EReference)stopInformationStructureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationStructure_ArrivalExpected() {
		return (EReference)stopInformationStructureEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationStructure_DepartureScheduled() {
		return (EReference)stopInformationStructureEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationStructure_DepartureExpected() {
		return (EReference)stopInformationStructureEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationStructure_RecordedArrivalTime() {
		return (EReference)stopInformationStructureEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationStructure_DistanceToNextStop() {
		return (EReference)stopInformationStructureEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationStructure_Connection() {
		return (EReference)stopInformationStructureEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationStructure_FareZone() {
		return (EReference)stopInformationStructureEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStopPointTariffInformationStructure() {
		return stopPointTariffInformationStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopPointTariffInformationStructure_JourneyStopInformation() {
		return (EReference)stopPointTariffInformationStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopPointTariffInformationStructure_FareZoneInformation() {
		return (EReference)stopPointTariffInformationStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStopSequenceStructure() {
		return stopSequenceStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopSequenceStructure_StopPoint() {
		return (EReference)stopSequenceStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubscribeRequestStructure() {
		return subscribeRequestStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubscribeRequestStructure_ClientIPAddress() {
		return (EReference)subscribeRequestStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubscribeRequestStructure_ReplyPort() {
		return (EReference)subscribeRequestStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubscribeRequestStructure_ReplyPath() {
		return (EReference)subscribeRequestStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubscribeResponseStructure() {
		return subscribeResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubscribeResponseStructure_Active() {
		return (EReference)subscribeResponseStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubscribeResponseStructure_Heartbeat() {
		return (EReference)subscribeResponseStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubscribeResponseStructure_OperationErrorMessage() {
		return (EReference)subscribeResponseStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimingPointStructure() {
		return timingPointStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimingPointStructure_TimingPointRef() {
		return (EReference)timingPointStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimingPointStructure_ScheduleTime() {
		return (EReference)timingPointStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimingPointStructure_GNSSPoint() {
		return (EReference)timingPointStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTripInformationStructure() {
		return tripInformationStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformationStructure_TripRef() {
		return (EReference)tripInformationStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformationStructure_StopSequence() {
		return (EReference)tripInformationStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTripInformationStructure_LocationState() {
		return (EAttribute)tripInformationStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformationStructure_TimetableDelay() {
		return (EReference)tripInformationStructureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformationStructure_AdditionalTextMessage() {
		return (EReference)tripInformationStructureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformationStructure_AdditionalTextMessage1() {
		return (EReference)tripInformationStructureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformationStructure_AdditionalTextMessage2() {
		return (EReference)tripInformationStructureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformationStructure_AdditionalTextMessage3() {
		return (EReference)tripInformationStructureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformationStructure_AdditionalTextMessage4() {
		return (EReference)tripInformationStructureEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformationStructure_AdditionalTextMessage5() {
		return (EReference)tripInformationStructureEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformationStructure_AdditionalTextMessage6() {
		return (EReference)tripInformationStructureEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformationStructure_AdditionalTextMessage7() {
		return (EReference)tripInformationStructureEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformationStructure_AdditionalTextMessage8() {
		return (EReference)tripInformationStructureEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformationStructure_AdditionalTextMessage9() {
		return (EReference)tripInformationStructureEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformationStructure_AdditionalAnnouncement() {
		return (EReference)tripInformationStructureEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTripInformationStructure_RouteDirection() {
		return (EAttribute)tripInformationStructureEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformationStructure_RunNumber() {
		return (EReference)tripInformationStructureEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformationStructure_PatternNumber() {
		return (EReference)tripInformationStructureEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformationStructure_PathDestinationNumber() {
		return (EReference)tripInformationStructureEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTripSequenceStructure() {
		return tripSequenceStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripSequenceStructure_TripRef() {
		return (EReference)tripSequenceStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripSequenceStructure_TripIndex() {
		return (EReference)tripSequenceStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripSequenceStructure_TripStart() {
		return (EReference)tripSequenceStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripSequenceStructure_CurrentStopIndex() {
		return (EReference)tripSequenceStructureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTripSequenceStructure_JourneyMode() {
		return (EAttribute)tripSequenceStructureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripSequenceStructure_PointSequence() {
		return (EReference)tripSequenceStructureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTSPPointStructure() {
		return tspPointStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTSPPointStructure_TSPPointRef() {
		return (EReference)tspPointStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTSPPointStructure_TSPCode() {
		return (EReference)tspPointStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTSPPointStructure_ShortName() {
		return (EReference)tspPointStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTSPPointStructure_Desciption() {
		return (EReference)tspPointStructureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnsubscribeRequestStructure() {
		return unsubscribeRequestStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnsubscribeRequestStructure_ClientIPAddress() {
		return (EReference)unsubscribeRequestStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnsubscribeRequestStructure_ReplyPort() {
		return (EReference)unsubscribeRequestStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnsubscribeRequestStructure_ReplyPath() {
		return (EReference)unsubscribeRequestStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnsubscribeResponseStructure() {
		return unsubscribeResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnsubscribeResponseStructure_Active() {
		return (EReference)unsubscribeResponseStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnsubscribeResponseStructure_OperationErrorMessage() {
		return (EReference)unsubscribeResponseStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVehicleStructure() {
		return vehicleStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVehicleStructure_VehicleTypeRef() {
		return (EReference)vehicleStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVehicleStructure_Name() {
		return (EReference)vehicleStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getViaPointStructure() {
		return viaPointStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViaPointStructure_ViaPointRef() {
		return (EReference)viaPointStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViaPointStructure_PlaceRef() {
		return (EReference)viaPointStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViaPointStructure_PlaceName() {
		return (EReference)viaPointStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViaPointStructure_PlaceShortName() {
		return (EReference)viaPointStructureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViaPointStructure_ViaPointDisplayPriority() {
		return (EReference)viaPointStructureEClass.getEStructuralFeatures().get(4);
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
		additionalAnnouncementStructureEClass = createEClass(ADDITIONAL_ANNOUNCEMENT_STRUCTURE);
		createEReference(additionalAnnouncementStructureEClass, ADDITIONAL_ANNOUNCEMENT_STRUCTURE__ANNOUNCEMENT_REF);
		createEReference(additionalAnnouncementStructureEClass, ADDITIONAL_ANNOUNCEMENT_STRUCTURE__ANNOUNCEMENT_TEXT);
		createEReference(additionalAnnouncementStructureEClass, ADDITIONAL_ANNOUNCEMENT_STRUCTURE__ANNOUNCEMENT_TTS_TEXT);
		createEReference(additionalAnnouncementStructureEClass, ADDITIONAL_ANNOUNCEMENT_STRUCTURE__IMMEDIATE_INFORMATION);
		createEReference(additionalAnnouncementStructureEClass, ADDITIONAL_ANNOUNCEMENT_STRUCTURE__PERIODICAL_INFORMATION);
		createEReference(additionalAnnouncementStructureEClass, ADDITIONAL_ANNOUNCEMENT_STRUCTURE__SPECIFIC_POINT);

		announcementStructureEClass = createEClass(ANNOUNCEMENT_STRUCTURE);
		createEReference(announcementStructureEClass, ANNOUNCEMENT_STRUCTURE__ANNOUNCEMENT_REF);
		createEReference(announcementStructureEClass, ANNOUNCEMENT_STRUCTURE__ANNOUNCEMENT_TEXT);
		createEReference(announcementStructureEClass, ANNOUNCEMENT_STRUCTURE__ANNOUNCEMENT_TTS_TEXT);

		bayAreaStructureEClass = createEClass(BAY_AREA_STRUCTURE);
		createEReference(bayAreaStructureEClass, BAY_AREA_STRUCTURE__BEFORE_BAY);
		createEReference(bayAreaStructureEClass, BAY_AREA_STRUCTURE__BEHIND_BAY);

		beaconPointStructureEClass = createEClass(BEACON_POINT_STRUCTURE);
		createEReference(beaconPointStructureEClass, BEACON_POINT_STRUCTURE__POINT_REF);
		createEReference(beaconPointStructureEClass, BEACON_POINT_STRUCTURE__BEACON_CODE);
		createEReference(beaconPointStructureEClass, BEACON_POINT_STRUCTURE__SHORT_NAME);
		createEReference(beaconPointStructureEClass, BEACON_POINT_STRUCTURE__DESCIPTION);

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

		connectionStructureEClass = createEClass(CONNECTION_STRUCTURE);
		createEReference(connectionStructureEClass, CONNECTION_STRUCTURE__STOP_REF);
		createEReference(connectionStructureEClass, CONNECTION_STRUCTURE__CONNECTION_REF);
		createEAttribute(connectionStructureEClass, CONNECTION_STRUCTURE__CONNECTION_TYPE);
		createEReference(connectionStructureEClass, CONNECTION_STRUCTURE__DISPLAY_CONTENT);
		createEReference(connectionStructureEClass, CONNECTION_STRUCTURE__PLATFORM);
		createEAttribute(connectionStructureEClass, CONNECTION_STRUCTURE__CONNECTION_STATE);
		createEReference(connectionStructureEClass, CONNECTION_STRUCTURE__TRANSPORT_MODE);
		createEReference(connectionStructureEClass, CONNECTION_STRUCTURE__CONNECTION_MODE);
		createEReference(connectionStructureEClass, CONNECTION_STRUCTURE__EXPECTED_DEPARTURE_TIME);
		createEReference(connectionStructureEClass, CONNECTION_STRUCTURE__SCHEDULED_DEPARTURE_TIME);

		dataAcceptedResponseDataStructureEClass = createEClass(DATA_ACCEPTED_RESPONSE_DATA_STRUCTURE);
		createEReference(dataAcceptedResponseDataStructureEClass, DATA_ACCEPTED_RESPONSE_DATA_STRUCTURE__TIME_STAMP);
		createEReference(dataAcceptedResponseDataStructureEClass, DATA_ACCEPTED_RESPONSE_DATA_STRUCTURE__DATA_ACCEPTED);
		createEAttribute(dataAcceptedResponseDataStructureEClass, DATA_ACCEPTED_RESPONSE_DATA_STRUCTURE__ERROR_CODE);
		createEReference(dataAcceptedResponseDataStructureEClass, DATA_ACCEPTED_RESPONSE_DATA_STRUCTURE__ERROR_INFORMATION);

		dataAcceptedResponseStructureEClass = createEClass(DATA_ACCEPTED_RESPONSE_STRUCTURE);
		createEReference(dataAcceptedResponseStructureEClass, DATA_ACCEPTED_RESPONSE_STRUCTURE__DATA_ACCEPTED_RESPONSE_DATA);
		createEReference(dataAcceptedResponseStructureEClass, DATA_ACCEPTED_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE);

		dataVersionListStructureEClass = createEClass(DATA_VERSION_LIST_STRUCTURE);
		createEReference(dataVersionListStructureEClass, DATA_VERSION_LIST_STRUCTURE__DATA_VERSION);

		dataVersionStructureEClass = createEClass(DATA_VERSION_STRUCTURE);
		createEReference(dataVersionStructureEClass, DATA_VERSION_STRUCTURE__DATA_TYPE);
		createEReference(dataVersionStructureEClass, DATA_VERSION_STRUCTURE__VERSION_REF);

		degreeTypeEClass = createEClass(DEGREE_TYPE);
		createEReference(degreeTypeEClass, DEGREE_TYPE__DEGREE);
		createEReference(degreeTypeEClass, DEGREE_TYPE__ORIENTATION);

		destinationStructureEClass = createEClass(DESTINATION_STRUCTURE);
		createEReference(destinationStructureEClass, DESTINATION_STRUCTURE__DESTINATION_REF);
		createEReference(destinationStructureEClass, DESTINATION_STRUCTURE__DESTINATION_NAME);
		createEReference(destinationStructureEClass, DESTINATION_STRUCTURE__DESTINATION_SHORT_NAME);

		deviceInformationStructureEClass = createEClass(DEVICE_INFORMATION_STRUCTURE);
		createEReference(deviceInformationStructureEClass, DEVICE_INFORMATION_STRUCTURE__DEVICE_NAME);
		createEReference(deviceInformationStructureEClass, DEVICE_INFORMATION_STRUCTURE__MANUFACTURER);
		createEReference(deviceInformationStructureEClass, DEVICE_INFORMATION_STRUCTURE__SERIAL_NUMBER);
		createEAttribute(deviceInformationStructureEClass, DEVICE_INFORMATION_STRUCTURE__DEVICE_CLASS);
		createEReference(deviceInformationStructureEClass, DEVICE_INFORMATION_STRUCTURE__DATA_VERSION_LIST);
		createEReference(deviceInformationStructureEClass, DEVICE_INFORMATION_STRUCTURE__WEB_INTERFACE_ADDRESS);

		deviceSpecificationListStructureEClass = createEClass(DEVICE_SPECIFICATION_LIST_STRUCTURE);
		createEReference(deviceSpecificationListStructureEClass, DEVICE_SPECIFICATION_LIST_STRUCTURE__DEVICE_SPECIFICATION);

		deviceSpecificationStructureEClass = createEClass(DEVICE_SPECIFICATION_STRUCTURE);
		createEAttribute(deviceSpecificationStructureEClass, DEVICE_SPECIFICATION_STRUCTURE__DEVICE_CLASS);
		createEReference(deviceSpecificationStructureEClass, DEVICE_SPECIFICATION_STRUCTURE__DEVICE_ID);

		deviceSpecificationWithStateListStructureEClass = createEClass(DEVICE_SPECIFICATION_WITH_STATE_LIST_STRUCTURE);
		createEReference(deviceSpecificationWithStateListStructureEClass, DEVICE_SPECIFICATION_WITH_STATE_LIST_STRUCTURE__DEVICE_SPECIFICATION_WITH_STATE);

		deviceSpecificationWithStateStructureEClass = createEClass(DEVICE_SPECIFICATION_WITH_STATE_STRUCTURE);
		createEReference(deviceSpecificationWithStateStructureEClass, DEVICE_SPECIFICATION_WITH_STATE_STRUCTURE__DEVICE_SPECIFICATION);
		createEAttribute(deviceSpecificationWithStateStructureEClass, DEVICE_SPECIFICATION_WITH_STATE_STRUCTURE__DEVICE_STATE);

		displayContentStructureEClass = createEClass(DISPLAY_CONTENT_STRUCTURE);
		createEReference(displayContentStructureEClass, DISPLAY_CONTENT_STRUCTURE__DISPLAY_CONTENT_REF);
		createEReference(displayContentStructureEClass, DISPLAY_CONTENT_STRUCTURE__LINE_INFORMATION);
		createEReference(displayContentStructureEClass, DISPLAY_CONTENT_STRUCTURE__DESTINATION);
		createEReference(displayContentStructureEClass, DISPLAY_CONTENT_STRUCTURE__VIA_POINT);
		createEReference(displayContentStructureEClass, DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION);
		createEReference(displayContentStructureEClass, DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION1);
		createEReference(displayContentStructureEClass, DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION2);
		createEReference(displayContentStructureEClass, DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION3);
		createEReference(displayContentStructureEClass, DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION4);
		createEReference(displayContentStructureEClass, DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION5);
		createEReference(displayContentStructureEClass, DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION6);
		createEReference(displayContentStructureEClass, DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION7);
		createEReference(displayContentStructureEClass, DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION8);
		createEReference(displayContentStructureEClass, DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION9);
		createEReference(displayContentStructureEClass, DISPLAY_CONTENT_STRUCTURE__RUN_NUMBER);
		createEReference(displayContentStructureEClass, DISPLAY_CONTENT_STRUCTURE__PRIORITY);
		createEReference(displayContentStructureEClass, DISPLAY_CONTENT_STRUCTURE__PERIOD_DURATION);
		createEReference(displayContentStructureEClass, DISPLAY_CONTENT_STRUCTURE__DURATION);

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

		doorCountingListStructureEClass = createEClass(DOOR_COUNTING_LIST_STRUCTURE);
		createEReference(doorCountingListStructureEClass, DOOR_COUNTING_LIST_STRUCTURE__DOOR_ID);
		createEReference(doorCountingListStructureEClass, DOOR_COUNTING_LIST_STRUCTURE__COUNT_SET);

		doorCountingStructureEClass = createEClass(DOOR_COUNTING_STRUCTURE);
		createEAttribute(doorCountingStructureEClass, DOOR_COUNTING_STRUCTURE__OBJECT_CLASS);
		createEReference(doorCountingStructureEClass, DOOR_COUNTING_STRUCTURE__IN);
		createEReference(doorCountingStructureEClass, DOOR_COUNTING_STRUCTURE__OUT);
		createEAttribute(doorCountingStructureEClass, DOOR_COUNTING_STRUCTURE__COUNT_QUALITY);

		doorInformationStructureEClass = createEClass(DOOR_INFORMATION_STRUCTURE);
		createEReference(doorInformationStructureEClass, DOOR_INFORMATION_STRUCTURE__DOOR_ID);
		createEReference(doorInformationStructureEClass, DOOR_INFORMATION_STRUCTURE__COUNT);
		createEReference(doorInformationStructureEClass, DOOR_INFORMATION_STRUCTURE__STATE);

		doorOpenStateStructureEClass = createEClass(DOOR_OPEN_STATE_STRUCTURE);
		createEAttribute(doorOpenStateStructureEClass, DOOR_OPEN_STATE_STRUCTURE__VALUE);
		createEAttribute(doorOpenStateStructureEClass, DOOR_OPEN_STATE_STRUCTURE__ERROR_CODE);

		doorOperationStateStructureEClass = createEClass(DOOR_OPERATION_STATE_STRUCTURE);
		createEAttribute(doorOperationStateStructureEClass, DOOR_OPERATION_STATE_STRUCTURE__VALUE);
		createEAttribute(doorOperationStateStructureEClass, DOOR_OPERATION_STATE_STRUCTURE__ERROR_CODE);

		doorStateStructureEClass = createEClass(DOOR_STATE_STRUCTURE);
		createEReference(doorStateStructureEClass, DOOR_STATE_STRUCTURE__OPEN_STATE);
		createEReference(doorStateStructureEClass, DOOR_STATE_STRUCTURE__OPERATION_STATE);

		fareZoneInformationStructureEClass = createEClass(FARE_ZONE_INFORMATION_STRUCTURE);
		createEReference(fareZoneInformationStructureEClass, FARE_ZONE_INFORMATION_STRUCTURE__FARE_ZONE_ID);
		createEReference(fareZoneInformationStructureEClass, FARE_ZONE_INFORMATION_STRUCTURE__FARE_ZONE_TYPE);
		createEReference(fareZoneInformationStructureEClass, FARE_ZONE_INFORMATION_STRUCTURE__FARE_ZONE_LONG_NAME);
		createEReference(fareZoneInformationStructureEClass, FARE_ZONE_INFORMATION_STRUCTURE__FARE_ZONE_SHORT_NAME);

		globalCardStatusEClass = createEClass(GLOBAL_CARD_STATUS);
		createEReference(globalCardStatusEClass, GLOBAL_CARD_STATUS__GLOBAL_CARD_STAUS_ID);
		createEReference(globalCardStatusEClass, GLOBAL_CARD_STATUS__GLOBAL_CARD_STATUS_TEXT);

		gnssCoordinateStructureEClass = createEClass(GNSS_COORDINATE_STRUCTURE);
		createEReference(gnssCoordinateStructureEClass, GNSS_COORDINATE_STRUCTURE__DEGREE);
		createEReference(gnssCoordinateStructureEClass, GNSS_COORDINATE_STRUCTURE__DIRECTION);

		gnssPointStructureEClass = createEClass(GNSS_POINT_STRUCTURE);
		createEReference(gnssPointStructureEClass, GNSS_POINT_STRUCTURE__POINT_REF);
		createEReference(gnssPointStructureEClass, GNSS_POINT_STRUCTURE__LONGITUDE);
		createEReference(gnssPointStructureEClass, GNSS_POINT_STRUCTURE__LATITUDE);
		createEReference(gnssPointStructureEClass, GNSS_POINT_STRUCTURE__ALTITUDE);

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

		journeyStopInformationStructureEClass = createEClass(JOURNEY_STOP_INFORMATION_STRUCTURE);
		createEReference(journeyStopInformationStructureEClass, JOURNEY_STOP_INFORMATION_STRUCTURE__STOP_REF);
		createEReference(journeyStopInformationStructureEClass, JOURNEY_STOP_INFORMATION_STRUCTURE__STOP_NAME);
		createEReference(journeyStopInformationStructureEClass, JOURNEY_STOP_INFORMATION_STRUCTURE__STOP_ALTERNATIVE_NAME);
		createEReference(journeyStopInformationStructureEClass, JOURNEY_STOP_INFORMATION_STRUCTURE__PLATFORM);
		createEReference(journeyStopInformationStructureEClass, JOURNEY_STOP_INFORMATION_STRUCTURE__DISPLAY_CONTENT);
		createEReference(journeyStopInformationStructureEClass, JOURNEY_STOP_INFORMATION_STRUCTURE__ANNOUNCEMENT);
		createEReference(journeyStopInformationStructureEClass, JOURNEY_STOP_INFORMATION_STRUCTURE__ARRIVAL_SCHEDULED);
		createEReference(journeyStopInformationStructureEClass, JOURNEY_STOP_INFORMATION_STRUCTURE__DEPARTURE_SCHEDULED);
		createEReference(journeyStopInformationStructureEClass, JOURNEY_STOP_INFORMATION_STRUCTURE__CONNECTION);
		createEReference(journeyStopInformationStructureEClass, JOURNEY_STOP_INFORMATION_STRUCTURE__BAY_AREA);
		createEReference(journeyStopInformationStructureEClass, JOURNEY_STOP_INFORMATION_STRUCTURE__GNSS_POINT);
		createEReference(journeyStopInformationStructureEClass, JOURNEY_STOP_INFORMATION_STRUCTURE__FARE_ZONE);

		lineInformationStructureEClass = createEClass(LINE_INFORMATION_STRUCTURE);
		createEReference(lineInformationStructureEClass, LINE_INFORMATION_STRUCTURE__LINE_REF);
		createEReference(lineInformationStructureEClass, LINE_INFORMATION_STRUCTURE__LINE_NAME);
		createEReference(lineInformationStructureEClass, LINE_INFORMATION_STRUCTURE__LINE_SHORT_NAME);
		createEReference(lineInformationStructureEClass, LINE_INFORMATION_STRUCTURE__LINE_NUMBER);
		createEReference(lineInformationStructureEClass, LINE_INFORMATION_STRUCTURE__LINE_CODE);

		logMessageStructureEClass = createEClass(LOG_MESSAGE_STRUCTURE);
		createEReference(logMessageStructureEClass, LOG_MESSAGE_STRUCTURE__MESSAGE_PROVIDER);
		createEReference(logMessageStructureEClass, LOG_MESSAGE_STRUCTURE__MESSAGE);

		messageStructureEClass = createEClass(MESSAGE_STRUCTURE);
		createEReference(messageStructureEClass, MESSAGE_STRUCTURE__MESSAGE_ID);
		createEReference(messageStructureEClass, MESSAGE_STRUCTURE__TIME_STAMP);
		createEAttribute(messageStructureEClass, MESSAGE_STRUCTURE__MESSAGE_TYPE);
		createEReference(messageStructureEClass, MESSAGE_STRUCTURE__MESSAGE_TEXT);

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

		pointSequenceStructureEClass = createEClass(POINT_SEQUENCE_STRUCTURE);
		createEReference(pointSequenceStructureEClass, POINT_SEQUENCE_STRUCTURE__POINT);

		pointStructureEClass = createEClass(POINT_STRUCTURE);
		createEReference(pointStructureEClass, POINT_STRUCTURE__POINT_INDEX);
		createEReference(pointStructureEClass, POINT_STRUCTURE__POINT_TYPE);
		createEReference(pointStructureEClass, POINT_STRUCTURE__DISTANCE_TO_PREVIOUS_POINT);

		pointTypeStructureEClass = createEClass(POINT_TYPE_STRUCTURE);
		createEReference(pointTypeStructureEClass, POINT_TYPE_STRUCTURE__STOP_POINT);
		createEReference(pointTypeStructureEClass, POINT_TYPE_STRUCTURE__BEACON_POINT);
		createEReference(pointTypeStructureEClass, POINT_TYPE_STRUCTURE__GNSS_LOCATION_POINT);
		createEReference(pointTypeStructureEClass, POINT_TYPE_STRUCTURE__TIMING_POINT);
		createEReference(pointTypeStructureEClass, POINT_TYPE_STRUCTURE__TSP_POINT);

		serviceIdentificationStructureEClass = createEClass(SERVICE_IDENTIFICATION_STRUCTURE);
		createEReference(serviceIdentificationStructureEClass, SERVICE_IDENTIFICATION_STRUCTURE__SERVICE);
		createEReference(serviceIdentificationStructureEClass, SERVICE_IDENTIFICATION_STRUCTURE__DEVICE);

		serviceIdentificationWithStateListStructureEClass = createEClass(SERVICE_IDENTIFICATION_WITH_STATE_LIST_STRUCTURE);
		createEReference(serviceIdentificationWithStateListStructureEClass, SERVICE_IDENTIFICATION_WITH_STATE_LIST_STRUCTURE__SERVICE_IDENTIFICATION_WITH_STATE);

		serviceIdentificationWithStateStructureEClass = createEClass(SERVICE_IDENTIFICATION_WITH_STATE_STRUCTURE);
		createEReference(serviceIdentificationWithStateStructureEClass, SERVICE_IDENTIFICATION_WITH_STATE_STRUCTURE__SERVICE_IDENTIFICATION);
		createEAttribute(serviceIdentificationWithStateStructureEClass, SERVICE_IDENTIFICATION_WITH_STATE_STRUCTURE__SERVICE_STATE);

		serviceInformationListStructureEClass = createEClass(SERVICE_INFORMATION_LIST_STRUCTURE);
		createEReference(serviceInformationListStructureEClass, SERVICE_INFORMATION_LIST_STRUCTURE__SERVICE_INFORMATION);

		serviceInformationStructureEClass = createEClass(SERVICE_INFORMATION_STRUCTURE);
		createEReference(serviceInformationStructureEClass, SERVICE_INFORMATION_STRUCTURE__SERVICE);
		createEReference(serviceInformationStructureEClass, SERVICE_INFORMATION_STRUCTURE__AUTOSTART);

		serviceSpecificationStructureEClass = createEClass(SERVICE_SPECIFICATION_STRUCTURE);
		createEAttribute(serviceSpecificationStructureEClass, SERVICE_SPECIFICATION_STRUCTURE__SERVICE_NAME);
		createEReference(serviceSpecificationStructureEClass, SERVICE_SPECIFICATION_STRUCTURE__IBISIP_VERSION);

		serviceSpecificationWithStateListStructureEClass = createEClass(SERVICE_SPECIFICATION_WITH_STATE_LIST_STRUCTURE);
		createEReference(serviceSpecificationWithStateListStructureEClass, SERVICE_SPECIFICATION_WITH_STATE_LIST_STRUCTURE__SERVICE_SPECIFICATION_WITH_STATE);

		serviceSpecificationWithStateStructureEClass = createEClass(SERVICE_SPECIFICATION_WITH_STATE_STRUCTURE);
		createEReference(serviceSpecificationWithStateStructureEClass, SERVICE_SPECIFICATION_WITH_STATE_STRUCTURE__SERVICE_SPECIFICATION);
		createEAttribute(serviceSpecificationWithStateStructureEClass, SERVICE_SPECIFICATION_WITH_STATE_STRUCTURE__SERVICE_STATE);

		serviceStartListStructureEClass = createEClass(SERVICE_START_LIST_STRUCTURE);
		createEReference(serviceStartListStructureEClass, SERVICE_START_LIST_STRUCTURE__SERVICE_IDENTIFICATION);

		serviceStartStructureEClass = createEClass(SERVICE_START_STRUCTURE);
		createEReference(serviceStartStructureEClass, SERVICE_START_STRUCTURE__SERVICE_IDENTIFICATION);
		createEReference(serviceStartStructureEClass, SERVICE_START_STRUCTURE__AUTOSTART);

		shortTripStopListStructureEClass = createEClass(SHORT_TRIP_STOP_LIST_STRUCTURE);
		createEReference(shortTripStopListStructureEClass, SHORT_TRIP_STOP_LIST_STRUCTURE__SHORT_TRIP_STOP);

		shortTripStopStructureEClass = createEClass(SHORT_TRIP_STOP_STRUCTURE);
		createEReference(shortTripStopStructureEClass, SHORT_TRIP_STOP_STRUCTURE__JOURNEY_STOP_INFORMATION);
		createEReference(shortTripStopStructureEClass, SHORT_TRIP_STOP_STRUCTURE__FARE_ZONE_INFORMATION);

		specificPointStructureEClass = createEClass(SPECIFIC_POINT_STRUCTURE);
		createEReference(specificPointStructureEClass, SPECIFIC_POINT_STRUCTURE__POINT_REF);
		createEReference(specificPointStructureEClass, SPECIFIC_POINT_STRUCTURE__DISTANCE_TO_PREVIOUS_POINT);

		stopInformationRequestStructureEClass = createEClass(STOP_INFORMATION_REQUEST_STRUCTURE);
		createEReference(stopInformationRequestStructureEClass, STOP_INFORMATION_REQUEST_STRUCTURE__STOP_INDEX);
		createEReference(stopInformationRequestStructureEClass, STOP_INFORMATION_REQUEST_STRUCTURE__STOP_REF);
		createEReference(stopInformationRequestStructureEClass, STOP_INFORMATION_REQUEST_STRUCTURE__STOP_NAME);
		createEReference(stopInformationRequestStructureEClass, STOP_INFORMATION_REQUEST_STRUCTURE__DISPLAY_CONTENT);
		createEReference(stopInformationRequestStructureEClass, STOP_INFORMATION_REQUEST_STRUCTURE__STOP_ANNOUNCEMENT);
		createEReference(stopInformationRequestStructureEClass, STOP_INFORMATION_REQUEST_STRUCTURE__ARRIVAL_SCHEDULED);
		createEReference(stopInformationRequestStructureEClass, STOP_INFORMATION_REQUEST_STRUCTURE__DEPARTURE_SCHEDULED);
		createEReference(stopInformationRequestStructureEClass, STOP_INFORMATION_REQUEST_STRUCTURE__RECORDED_ARRIVAL_TIME);
		createEReference(stopInformationRequestStructureEClass, STOP_INFORMATION_REQUEST_STRUCTURE__DISTANCE_TO_NEXT_STOP);
		createEReference(stopInformationRequestStructureEClass, STOP_INFORMATION_REQUEST_STRUCTURE__CONNECTION);
		createEReference(stopInformationRequestStructureEClass, STOP_INFORMATION_REQUEST_STRUCTURE__FARE_ZONE);

		stopInformationStructureEClass = createEClass(STOP_INFORMATION_STRUCTURE);
		createEReference(stopInformationStructureEClass, STOP_INFORMATION_STRUCTURE__STOP_INDEX);
		createEReference(stopInformationStructureEClass, STOP_INFORMATION_STRUCTURE__STOP_REF);
		createEReference(stopInformationStructureEClass, STOP_INFORMATION_STRUCTURE__STOP_NAME);
		createEReference(stopInformationStructureEClass, STOP_INFORMATION_STRUCTURE__STOP_ALTERNATIVE_NAME);
		createEReference(stopInformationStructureEClass, STOP_INFORMATION_STRUCTURE__PLATFORM);
		createEReference(stopInformationStructureEClass, STOP_INFORMATION_STRUCTURE__DISPLAY_CONTENT);
		createEReference(stopInformationStructureEClass, STOP_INFORMATION_STRUCTURE__STOP_ANNOUNCEMENT);
		createEReference(stopInformationStructureEClass, STOP_INFORMATION_STRUCTURE__ARRIVAL_SCHEDULED);
		createEReference(stopInformationStructureEClass, STOP_INFORMATION_STRUCTURE__ARRIVAL_EXPECTED);
		createEReference(stopInformationStructureEClass, STOP_INFORMATION_STRUCTURE__DEPARTURE_SCHEDULED);
		createEReference(stopInformationStructureEClass, STOP_INFORMATION_STRUCTURE__DEPARTURE_EXPECTED);
		createEReference(stopInformationStructureEClass, STOP_INFORMATION_STRUCTURE__RECORDED_ARRIVAL_TIME);
		createEReference(stopInformationStructureEClass, STOP_INFORMATION_STRUCTURE__DISTANCE_TO_NEXT_STOP);
		createEReference(stopInformationStructureEClass, STOP_INFORMATION_STRUCTURE__CONNECTION);
		createEReference(stopInformationStructureEClass, STOP_INFORMATION_STRUCTURE__FARE_ZONE);

		stopPointTariffInformationStructureEClass = createEClass(STOP_POINT_TARIFF_INFORMATION_STRUCTURE);
		createEReference(stopPointTariffInformationStructureEClass, STOP_POINT_TARIFF_INFORMATION_STRUCTURE__JOURNEY_STOP_INFORMATION);
		createEReference(stopPointTariffInformationStructureEClass, STOP_POINT_TARIFF_INFORMATION_STRUCTURE__FARE_ZONE_INFORMATION);

		stopSequenceStructureEClass = createEClass(STOP_SEQUENCE_STRUCTURE);
		createEReference(stopSequenceStructureEClass, STOP_SEQUENCE_STRUCTURE__STOP_POINT);

		subscribeRequestStructureEClass = createEClass(SUBSCRIBE_REQUEST_STRUCTURE);
		createEReference(subscribeRequestStructureEClass, SUBSCRIBE_REQUEST_STRUCTURE__CLIENT_IP_ADDRESS);
		createEReference(subscribeRequestStructureEClass, SUBSCRIBE_REQUEST_STRUCTURE__REPLY_PORT);
		createEReference(subscribeRequestStructureEClass, SUBSCRIBE_REQUEST_STRUCTURE__REPLY_PATH);

		subscribeResponseStructureEClass = createEClass(SUBSCRIBE_RESPONSE_STRUCTURE);
		createEReference(subscribeResponseStructureEClass, SUBSCRIBE_RESPONSE_STRUCTURE__ACTIVE);
		createEReference(subscribeResponseStructureEClass, SUBSCRIBE_RESPONSE_STRUCTURE__HEARTBEAT);
		createEReference(subscribeResponseStructureEClass, SUBSCRIBE_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE);

		timingPointStructureEClass = createEClass(TIMING_POINT_STRUCTURE);
		createEReference(timingPointStructureEClass, TIMING_POINT_STRUCTURE__TIMING_POINT_REF);
		createEReference(timingPointStructureEClass, TIMING_POINT_STRUCTURE__SCHEDULE_TIME);
		createEReference(timingPointStructureEClass, TIMING_POINT_STRUCTURE__GNSS_POINT);

		tripInformationStructureEClass = createEClass(TRIP_INFORMATION_STRUCTURE);
		createEReference(tripInformationStructureEClass, TRIP_INFORMATION_STRUCTURE__TRIP_REF);
		createEReference(tripInformationStructureEClass, TRIP_INFORMATION_STRUCTURE__STOP_SEQUENCE);
		createEAttribute(tripInformationStructureEClass, TRIP_INFORMATION_STRUCTURE__LOCATION_STATE);
		createEReference(tripInformationStructureEClass, TRIP_INFORMATION_STRUCTURE__TIMETABLE_DELAY);
		createEReference(tripInformationStructureEClass, TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE);
		createEReference(tripInformationStructureEClass, TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE1);
		createEReference(tripInformationStructureEClass, TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE2);
		createEReference(tripInformationStructureEClass, TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE3);
		createEReference(tripInformationStructureEClass, TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE4);
		createEReference(tripInformationStructureEClass, TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE5);
		createEReference(tripInformationStructureEClass, TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE6);
		createEReference(tripInformationStructureEClass, TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE7);
		createEReference(tripInformationStructureEClass, TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE8);
		createEReference(tripInformationStructureEClass, TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE9);
		createEReference(tripInformationStructureEClass, TRIP_INFORMATION_STRUCTURE__ADDITIONAL_ANNOUNCEMENT);
		createEAttribute(tripInformationStructureEClass, TRIP_INFORMATION_STRUCTURE__ROUTE_DIRECTION);
		createEReference(tripInformationStructureEClass, TRIP_INFORMATION_STRUCTURE__RUN_NUMBER);
		createEReference(tripInformationStructureEClass, TRIP_INFORMATION_STRUCTURE__PATTERN_NUMBER);
		createEReference(tripInformationStructureEClass, TRIP_INFORMATION_STRUCTURE__PATH_DESTINATION_NUMBER);

		tripSequenceStructureEClass = createEClass(TRIP_SEQUENCE_STRUCTURE);
		createEReference(tripSequenceStructureEClass, TRIP_SEQUENCE_STRUCTURE__TRIP_REF);
		createEReference(tripSequenceStructureEClass, TRIP_SEQUENCE_STRUCTURE__TRIP_INDEX);
		createEReference(tripSequenceStructureEClass, TRIP_SEQUENCE_STRUCTURE__TRIP_START);
		createEReference(tripSequenceStructureEClass, TRIP_SEQUENCE_STRUCTURE__CURRENT_STOP_INDEX);
		createEAttribute(tripSequenceStructureEClass, TRIP_SEQUENCE_STRUCTURE__JOURNEY_MODE);
		createEReference(tripSequenceStructureEClass, TRIP_SEQUENCE_STRUCTURE__POINT_SEQUENCE);

		tspPointStructureEClass = createEClass(TSP_POINT_STRUCTURE);
		createEReference(tspPointStructureEClass, TSP_POINT_STRUCTURE__TSP_POINT_REF);
		createEReference(tspPointStructureEClass, TSP_POINT_STRUCTURE__TSP_CODE);
		createEReference(tspPointStructureEClass, TSP_POINT_STRUCTURE__SHORT_NAME);
		createEReference(tspPointStructureEClass, TSP_POINT_STRUCTURE__DESCIPTION);

		unsubscribeRequestStructureEClass = createEClass(UNSUBSCRIBE_REQUEST_STRUCTURE);
		createEReference(unsubscribeRequestStructureEClass, UNSUBSCRIBE_REQUEST_STRUCTURE__CLIENT_IP_ADDRESS);
		createEReference(unsubscribeRequestStructureEClass, UNSUBSCRIBE_REQUEST_STRUCTURE__REPLY_PORT);
		createEReference(unsubscribeRequestStructureEClass, UNSUBSCRIBE_REQUEST_STRUCTURE__REPLY_PATH);

		unsubscribeResponseStructureEClass = createEClass(UNSUBSCRIBE_RESPONSE_STRUCTURE);
		createEReference(unsubscribeResponseStructureEClass, UNSUBSCRIBE_RESPONSE_STRUCTURE__ACTIVE);
		createEReference(unsubscribeResponseStructureEClass, UNSUBSCRIBE_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE);

		vehicleStructureEClass = createEClass(VEHICLE_STRUCTURE);
		createEReference(vehicleStructureEClass, VEHICLE_STRUCTURE__VEHICLE_TYPE_REF);
		createEReference(vehicleStructureEClass, VEHICLE_STRUCTURE__NAME);

		viaPointStructureEClass = createEClass(VIA_POINT_STRUCTURE);
		createEReference(viaPointStructureEClass, VIA_POINT_STRUCTURE__VIA_POINT_REF);
		createEReference(viaPointStructureEClass, VIA_POINT_STRUCTURE__PLACE_REF);
		createEReference(viaPointStructureEClass, VIA_POINT_STRUCTURE__PLACE_NAME);
		createEReference(viaPointStructureEClass, VIA_POINT_STRUCTURE__PLACE_SHORT_NAME);
		createEReference(viaPointStructureEClass, VIA_POINT_STRUCTURE__VIA_POINT_DISPLAY_PRIORITY);

		zoneTypeEClass = createEClass(ZONE_TYPE);
		createEReference(zoneTypeEClass, ZONE_TYPE__FAREZONE_TYPE_ID);
		createEReference(zoneTypeEClass, ZONE_TYPE__FARE_ZONE_TYPE_NAME);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(additionalAnnouncementStructureEClass, AdditionalAnnouncementStructure.class, "AdditionalAnnouncementStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdditionalAnnouncementStructure_AnnouncementRef(), this.getIBISIPNMTOKEN(), null, "announcementRef", null, 1, 1, AdditionalAnnouncementStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdditionalAnnouncementStructure_AnnouncementText(), this.getInternationalTextType(), null, "announcementText", null, 0, -1, AdditionalAnnouncementStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdditionalAnnouncementStructure_AnnouncementTTSText(), this.getInternationalTextType(), null, "announcementTTSText", null, 0, -1, AdditionalAnnouncementStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdditionalAnnouncementStructure_ImmediateInformation(), this.getIBISIPBoolean(), null, "immediateInformation", null, 0, 1, AdditionalAnnouncementStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdditionalAnnouncementStructure_PeriodicalInformation(), this.getIBISIPDuration(), null, "periodicalInformation", null, 0, 1, AdditionalAnnouncementStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdditionalAnnouncementStructure_SpecificPoint(), this.getSpecificPointStructure(), null, "specificPoint", null, 0, 1, AdditionalAnnouncementStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(announcementStructureEClass, AnnouncementStructure.class, "AnnouncementStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnouncementStructure_AnnouncementRef(), this.getIBISIPNMTOKEN(), null, "announcementRef", null, 1, 1, AnnouncementStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnouncementStructure_AnnouncementText(), this.getInternationalTextType(), null, "announcementText", null, 0, -1, AnnouncementStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnouncementStructure_AnnouncementTTSText(), this.getInternationalTextType(), null, "announcementTTSText", null, 0, -1, AnnouncementStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bayAreaStructureEClass, BayAreaStructure.class, "BayAreaStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBayAreaStructure_BeforeBay(), this.getIBISIPDouble(), null, "beforeBay", null, 0, 1, BayAreaStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBayAreaStructure_BehindBay(), this.getIBISIPDouble(), null, "behindBay", null, 0, 1, BayAreaStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(beaconPointStructureEClass, BeaconPointStructure.class, "BeaconPointStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBeaconPointStructure_PointRef(), this.getIBISIPNMTOKEN(), null, "pointRef", null, 0, 1, BeaconPointStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBeaconPointStructure_BeaconCode(), this.getIBISIPNMTOKEN(), null, "beaconCode", null, 1, 1, BeaconPointStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBeaconPointStructure_ShortName(), this.getInternationalTextType(), null, "shortName", null, 0, -1, BeaconPointStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBeaconPointStructure_Desciption(), this.getInternationalTextType(), null, "desciption", null, 0, -1, BeaconPointStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(connectionStructureEClass, ConnectionStructure.class, "ConnectionStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionStructure_StopRef(), this.getIBISIPNMTOKEN(), null, "stopRef", null, 1, 1, ConnectionStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionStructure_ConnectionRef(), this.getIBISIPNMTOKEN(), null, "connectionRef", null, 1, 1, ConnectionStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionStructure_ConnectionType(), theIbisEnumerationsPackage.getConnectionTypeEnumeration(), "connectionType", null, 1, 1, ConnectionStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionStructure_DisplayContent(), this.getDisplayContentStructure(), null, "displayContent", null, 0, 1, ConnectionStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionStructure_Platform(), this.getIBISIPString(), null, "platform", null, 0, 1, ConnectionStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionStructure_ConnectionState(), theIbisEnumerationsPackage.getConnectionStateEnumeration(), "connectionState", null, 0, 1, ConnectionStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionStructure_TransportMode(), this.getVehicleStructure(), null, "transportMode", null, 0, 1, ConnectionStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionStructure_ConnectionMode(), this.getNetexMode(), null, "connectionMode", null, 0, 1, ConnectionStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionStructure_ExpectedDepartureTime(), this.getIBISIPDateTime(), null, "expectedDepartureTime", null, 0, 1, ConnectionStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionStructure_ScheduledDepartureTime(), this.getIBISIPDateTime(), null, "scheduledDepartureTime", null, 0, 1, ConnectionStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataAcceptedResponseDataStructureEClass, DataAcceptedResponseDataStructure.class, "DataAcceptedResponseDataStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataAcceptedResponseDataStructure_TimeStamp(), this.getIBISIPDateTime(), null, "timeStamp", null, 1, 1, DataAcceptedResponseDataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataAcceptedResponseDataStructure_DataAccepted(), this.getIBISIPBoolean(), null, "dataAccepted", null, 1, 1, DataAcceptedResponseDataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataAcceptedResponseDataStructure_ErrorCode(), theIbisEnumerationsPackage.getErrorCodeEnumeration(), "errorCode", null, 0, 1, DataAcceptedResponseDataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataAcceptedResponseDataStructure_ErrorInformation(), this.getIBISIPString(), null, "errorInformation", null, 0, 1, DataAcceptedResponseDataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataAcceptedResponseStructureEClass, DataAcceptedResponseStructure.class, "DataAcceptedResponseStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataAcceptedResponseStructure_DataAcceptedResponseData(), this.getDataAcceptedResponseDataStructure(), null, "dataAcceptedResponseData", null, 0, 1, DataAcceptedResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataAcceptedResponseStructure_OperationErrorMessage(), this.getIBISIPString(), null, "operationErrorMessage", null, 0, 1, DataAcceptedResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataVersionListStructureEClass, DataVersionListStructure.class, "DataVersionListStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataVersionListStructure_DataVersion(), this.getDataVersionStructure(), null, "dataVersion", null, 0, -1, DataVersionListStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataVersionStructureEClass, DataVersionStructure.class, "DataVersionStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataVersionStructure_DataType(), this.getIBISIPString(), null, "dataType", null, 1, 1, DataVersionStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataVersionStructure_VersionRef(), this.getIBISIPNMTOKEN(), null, "versionRef", null, 1, 1, DataVersionStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(degreeTypeEClass, DegreeType.class, "DegreeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDegreeType_Degree(), this.getIBISIPDouble(), null, "degree", null, 1, 1, DegreeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDegreeType_Orientation(), this.getIBISIPString(), null, "orientation", null, 1, 1, DegreeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(destinationStructureEClass, DestinationStructure.class, "DestinationStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDestinationStructure_DestinationRef(), this.getIBISIPNMTOKEN(), null, "destinationRef", null, 1, 1, DestinationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDestinationStructure_DestinationName(), this.getInternationalTextType(), null, "destinationName", null, 0, -1, DestinationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDestinationStructure_DestinationShortName(), this.getInternationalTextType(), null, "destinationShortName", null, 0, -1, DestinationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceInformationStructureEClass, DeviceInformationStructure.class, "DeviceInformationStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceInformationStructure_DeviceName(), this.getIBISIPString(), null, "deviceName", null, 1, 1, DeviceInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceInformationStructure_Manufacturer(), this.getIBISIPString(), null, "manufacturer", null, 1, 1, DeviceInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceInformationStructure_SerialNumber(), this.getIBISIPNMTOKEN(), null, "serialNumber", null, 1, 1, DeviceInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceInformationStructure_DeviceClass(), theIbisEnumerationsPackage.getDeviceClassEnumeration(), "deviceClass", null, 1, 1, DeviceInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceInformationStructure_DataVersionList(), this.getDataVersionListStructure(), null, "dataVersionList", null, 0, 1, DeviceInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceInformationStructure_WebInterfaceAddress(), this.getIBISIPAnyURI(), null, "webInterfaceAddress", null, 0, 1, DeviceInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceSpecificationListStructureEClass, DeviceSpecificationListStructure.class, "DeviceSpecificationListStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceSpecificationListStructure_DeviceSpecification(), this.getDeviceSpecificationStructure(), null, "deviceSpecification", null, 1, -1, DeviceSpecificationListStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceSpecificationStructureEClass, DeviceSpecificationStructure.class, "DeviceSpecificationStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeviceSpecificationStructure_DeviceClass(), theIbisEnumerationsPackage.getDeviceClassEnumeration(), "deviceClass", null, 1, 1, DeviceSpecificationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceSpecificationStructure_DeviceID(), this.getIBISIPNMTOKEN(), null, "deviceID", null, 1, 1, DeviceSpecificationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceSpecificationWithStateListStructureEClass, DeviceSpecificationWithStateListStructure.class, "DeviceSpecificationWithStateListStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceSpecificationWithStateListStructure_DeviceSpecificationWithState(), this.getDeviceSpecificationWithStateStructure(), null, "deviceSpecificationWithState", null, 0, -1, DeviceSpecificationWithStateListStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceSpecificationWithStateStructureEClass, DeviceSpecificationWithStateStructure.class, "DeviceSpecificationWithStateStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceSpecificationWithStateStructure_DeviceSpecification(), this.getDeviceSpecificationStructure(), null, "deviceSpecification", null, 1, 1, DeviceSpecificationWithStateStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceSpecificationWithStateStructure_DeviceState(), theIbisEnumerationsPackage.getDeviceStateEnumeration(), "deviceState", null, 1, 1, DeviceSpecificationWithStateStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(displayContentStructureEClass, DisplayContentStructure.class, "DisplayContentStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDisplayContentStructure_DisplayContentRef(), this.getIBISIPNMTOKEN(), null, "displayContentRef", null, 0, 1, DisplayContentStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisplayContentStructure_LineInformation(), this.getLineInformationStructure(), null, "lineInformation", null, 1, 1, DisplayContentStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisplayContentStructure_Destination(), this.getDestinationStructure(), null, "destination", null, 1, 1, DisplayContentStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisplayContentStructure_ViaPoint(), this.getViaPointStructure(), null, "viaPoint", null, 0, -1, DisplayContentStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisplayContentStructure_AdditionalInformation(), this.getInternationalTextType(), null, "additionalInformation", null, 0, -1, DisplayContentStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisplayContentStructure_AdditionalInformation1(), this.getInternationalTextType(), null, "additionalInformation1", null, 0, -1, DisplayContentStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisplayContentStructure_AdditionalInformation2(), this.getInternationalTextType(), null, "additionalInformation2", null, 0, -1, DisplayContentStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisplayContentStructure_AdditionalInformation3(), this.getInternationalTextType(), null, "additionalInformation3", null, 0, -1, DisplayContentStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisplayContentStructure_AdditionalInformation4(), this.getInternationalTextType(), null, "additionalInformation4", null, 0, -1, DisplayContentStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisplayContentStructure_AdditionalInformation5(), this.getInternationalTextType(), null, "additionalInformation5", null, 0, -1, DisplayContentStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisplayContentStructure_AdditionalInformation6(), this.getInternationalTextType(), null, "additionalInformation6", null, 0, -1, DisplayContentStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisplayContentStructure_AdditionalInformation7(), this.getInternationalTextType(), null, "additionalInformation7", null, 0, -1, DisplayContentStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisplayContentStructure_AdditionalInformation8(), this.getInternationalTextType(), null, "additionalInformation8", null, 0, -1, DisplayContentStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisplayContentStructure_AdditionalInformation9(), this.getInternationalTextType(), null, "additionalInformation9", null, 0, -1, DisplayContentStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisplayContentStructure_RunNumber(), this.getIBISIPInt(), null, "runNumber", null, 0, 1, DisplayContentStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisplayContentStructure_Priority(), this.getIBISIPNonNegativeInteger(), null, "priority", null, 0, 1, DisplayContentStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisplayContentStructure_PeriodDuration(), this.getIBISIPDuration(), null, "periodDuration", null, 0, 1, DisplayContentStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisplayContentStructure_Duration(), this.getIBISIPDuration(), null, "duration", null, 0, 1, DisplayContentStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_AirSubmode(), theIbisEnumerationsPackage.getAirSubmodeEnumeration(), "airSubmode", "unknown", 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_BusSubmode(), theIbisEnumerationsPackage.getBusSubmodeEnumeration(), "busSubmode", "unknown", 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_CoachSubmode(), theIbisEnumerationsPackage.getCoachSubmodeEnumeration(), "coachSubmode", "unknown", 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DataAcceptedResponse(), this.getDataAcceptedResponseStructure(), null, "dataAcceptedResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_FunicularSubmode(), theIbisEnumerationsPackage.getFunicularSubmodeEnumeration(), "funicularSubmode", "unknown", 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_MetroSubmode(), theIbisEnumerationsPackage.getMetroSubmodeEnumeration(), "metroSubmode", "unknown", 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_RailSubmode(), theIbisEnumerationsPackage.getRailSubmodeEnumeration(), "railSubmode", "unknown", 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_SelfDriveSubmode(), theIbisEnumerationsPackage.getSelfDriveSubmodeEnumeration(), "selfDriveSubmode", "unknown", 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SubscribeRequest(), this.getSubscribeRequestStructure(), null, "subscribeRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SubscribeResponse(), this.getSubscribeResponseStructure(), null, "subscribeResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TaxiSubmode(), theIbisEnumerationsPackage.getTaxiSubmodeEnumeration(), "taxiSubmode", "unknown", 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TelecabinSubmode(), theIbisEnumerationsPackage.getTelecabinSubmodeEnumeration(), "telecabinSubmode", "unknown", 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TramSubmode(), theIbisEnumerationsPackage.getTramSubmodeEnumeration(), "tramSubmode", "unknown", 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UnsubscribeRequest(), this.getUnsubscribeRequestStructure(), null, "unsubscribeRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UnsubscribeResponse(), this.getUnsubscribeResponseStructure(), null, "unsubscribeResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_WaterSubmode(), theIbisEnumerationsPackage.getWaterSubmodeEnumeration(), "waterSubmode", "unknown", 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(doorCountingListStructureEClass, DoorCountingListStructure.class, "DoorCountingListStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDoorCountingListStructure_DoorID(), this.getIBISIPNMTOKEN(), null, "doorID", null, 1, 1, DoorCountingListStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoorCountingListStructure_CountSet(), this.getDoorCountingStructure(), null, "countSet", null, 1, -1, DoorCountingListStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doorCountingStructureEClass, DoorCountingStructure.class, "DoorCountingStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoorCountingStructure_ObjectClass(), theIbisEnumerationsPackage.getDoorCountingObjectClassEnumeration(), "objectClass", null, 1, 1, DoorCountingStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoorCountingStructure_In(), this.getIBISIPInt(), null, "in", null, 1, 1, DoorCountingStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoorCountingStructure_Out(), this.getIBISIPInt(), null, "out", null, 1, 1, DoorCountingStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoorCountingStructure_CountQuality(), theIbisEnumerationsPackage.getDoorCountingQualityEnumeration(), "countQuality", null, 0, 1, DoorCountingStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doorInformationStructureEClass, DoorInformationStructure.class, "DoorInformationStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDoorInformationStructure_DoorID(), this.getIBISIPNMTOKEN(), null, "doorID", null, 1, 1, DoorInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoorInformationStructure_Count(), this.getDoorCountingStructure(), null, "count", null, 1, -1, DoorInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoorInformationStructure_State(), this.getDoorStateStructure(), null, "state", null, 0, 1, DoorInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doorOpenStateStructureEClass, DoorOpenStateStructure.class, "DoorOpenStateStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoorOpenStateStructure_Value(), theIbisEnumerationsPackage.getDoorOpenStateEnumeration(), "value", null, 1, 1, DoorOpenStateStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoorOpenStateStructure_ErrorCode(), theIbisEnumerationsPackage.getErrorCodeEnumeration(), "errorCode", null, 0, 1, DoorOpenStateStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doorOperationStateStructureEClass, DoorOperationStateStructure.class, "DoorOperationStateStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoorOperationStateStructure_Value(), theIbisEnumerationsPackage.getDoorOperationStateEnumeration(), "value", null, 1, 1, DoorOperationStateStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoorOperationStateStructure_ErrorCode(), theIbisEnumerationsPackage.getErrorCodeEnumeration(), "errorCode", null, 0, 1, DoorOperationStateStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doorStateStructureEClass, DoorStateStructure.class, "DoorStateStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDoorStateStructure_OpenState(), this.getDoorOpenStateStructure(), null, "openState", null, 1, 1, DoorStateStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoorStateStructure_OperationState(), this.getDoorOperationStateStructure(), null, "operationState", null, 0, 1, DoorStateStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fareZoneInformationStructureEClass, FareZoneInformationStructure.class, "FareZoneInformationStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFareZoneInformationStructure_FareZoneID(), this.getIBISIPNMTOKEN(), null, "fareZoneID", null, 1, 1, FareZoneInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareZoneInformationStructure_FareZoneType(), this.getZoneType(), null, "fareZoneType", null, 0, 1, FareZoneInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareZoneInformationStructure_FareZoneLongName(), this.getInternationalTextType(), null, "fareZoneLongName", null, 0, -1, FareZoneInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFareZoneInformationStructure_FareZoneShortName(), this.getInternationalTextType(), null, "fareZoneShortName", null, 0, -1, FareZoneInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(globalCardStatusEClass, GlobalCardStatus.class, "GlobalCardStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlobalCardStatus_GlobalCardStausID(), this.getIBISIPUnsignedInt(), null, "globalCardStausID", null, 1, 1, GlobalCardStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalCardStatus_GlobalCardStatusText(), this.getIBISIPString(), null, "globalCardStatusText", null, 0, -1, GlobalCardStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gnssCoordinateStructureEClass, GNSSCoordinateStructure.class, "GNSSCoordinateStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGNSSCoordinateStructure_Degree(), this.getIBISIPDouble(), null, "degree", null, 1, 1, GNSSCoordinateStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGNSSCoordinateStructure_Direction(), this.getIBISIPString(), null, "direction", null, 1, 1, GNSSCoordinateStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gnssPointStructureEClass, GNSSPointStructure.class, "GNSSPointStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGNSSPointStructure_PointRef(), this.getIBISIPNMTOKEN(), null, "pointRef", null, 0, 1, GNSSPointStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGNSSPointStructure_Longitude(), this.getGNSSCoordinateStructure(), null, "longitude", null, 1, 1, GNSSPointStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGNSSPointStructure_Latitude(), this.getGNSSCoordinateStructure(), null, "latitude", null, 1, 1, GNSSPointStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGNSSPointStructure_Altitude(), this.getIBISIPDouble(), null, "altitude", null, 0, 1, GNSSPointStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(ibisipnmtokenEClass, de.jena.mdo.ibis.common.IBISIPNMTOKEN.class, "IBISIPNMTOKEN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIBISIPNMTOKEN_Value(), theXMLTypePackage.getNMTOKEN(), "value", null, 1, 1, de.jena.mdo.ibis.common.IBISIPNMTOKEN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIBISIPNMTOKEN_ErrorCode(), theIbisEnumerationsPackage.getErrorCodeEnumeration(), "errorCode", null, 0, 1, de.jena.mdo.ibis.common.IBISIPNMTOKEN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(journeyStopInformationStructureEClass, JourneyStopInformationStructure.class, "JourneyStopInformationStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJourneyStopInformationStructure_StopRef(), this.getIBISIPNMTOKEN(), null, "stopRef", null, 1, 1, JourneyStopInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJourneyStopInformationStructure_StopName(), this.getInternationalTextType(), null, "stopName", null, 1, -1, JourneyStopInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJourneyStopInformationStructure_StopAlternativeName(), this.getInternationalTextType(), null, "stopAlternativeName", null, 0, -1, JourneyStopInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJourneyStopInformationStructure_Platform(), this.getIBISIPString(), null, "platform", null, 0, 1, JourneyStopInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJourneyStopInformationStructure_DisplayContent(), this.getDisplayContentStructure(), null, "displayContent", null, 1, -1, JourneyStopInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJourneyStopInformationStructure_Announcement(), this.getAnnouncementStructure(), null, "announcement", null, 0, 1, JourneyStopInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJourneyStopInformationStructure_ArrivalScheduled(), this.getIBISIPDateTime(), null, "arrivalScheduled", null, 0, 1, JourneyStopInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJourneyStopInformationStructure_DepartureScheduled(), this.getIBISIPDateTime(), null, "departureScheduled", null, 0, 1, JourneyStopInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJourneyStopInformationStructure_Connection(), this.getConnectionStructure(), null, "connection", null, 0, -1, JourneyStopInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJourneyStopInformationStructure_BayArea(), this.getBayAreaStructure(), null, "bayArea", null, 0, 1, JourneyStopInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJourneyStopInformationStructure_GNSSPoint(), this.getGNSSPointStructure(), null, "gNSSPoint", null, 0, 1, JourneyStopInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJourneyStopInformationStructure_FareZone(), this.getIBISIPNMTOKEN(), null, "fareZone", null, 0, 1, JourneyStopInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineInformationStructureEClass, LineInformationStructure.class, "LineInformationStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLineInformationStructure_LineRef(), this.getIBISIPNMTOKEN(), null, "lineRef", null, 1, 1, LineInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLineInformationStructure_LineName(), this.getInternationalTextType(), null, "lineName", null, 0, -1, LineInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLineInformationStructure_LineShortName(), this.getInternationalTextType(), null, "lineShortName", null, 0, -1, LineInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLineInformationStructure_LineNumber(), this.getIBISIPInt(), null, "lineNumber", null, 0, 1, LineInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLineInformationStructure_LineCode(), this.getIBISIPInt(), null, "lineCode", null, 0, 1, LineInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logMessageStructureEClass, LogMessageStructure.class, "LogMessageStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogMessageStructure_MessageProvider(), this.getDeviceSpecificationStructure(), null, "messageProvider", null, 1, 1, LogMessageStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogMessageStructure_Message(), this.getMessageStructure(), null, "message", null, 1, 1, LogMessageStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageStructureEClass, MessageStructure.class, "MessageStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessageStructure_MessageID(), this.getIBISIPInt(), null, "messageID", null, 1, 1, MessageStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageStructure_TimeStamp(), this.getIBISIPDateTime(), null, "timeStamp", null, 1, 1, MessageStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageStructure_MessageType(), theIbisEnumerationsPackage.getMessageTypeEnumeration(), "messageType", null, 1, 1, MessageStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageStructure_MessageText(), this.getIBISIPString(), null, "messageText", null, 1, 1, MessageStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(pointSequenceStructureEClass, PointSequenceStructure.class, "PointSequenceStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPointSequenceStructure_Point(), this.getPointStructure(), null, "point", null, 2, -1, PointSequenceStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointStructureEClass, PointStructure.class, "PointStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPointStructure_PointIndex(), this.getIBISIPInt(), null, "pointIndex", null, 1, 1, PointStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPointStructure_PointType(), this.getPointTypeStructure(), null, "pointType", null, 1, 1, PointStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPointStructure_DistanceToPreviousPoint(), this.getIBISIPInt(), null, "distanceToPreviousPoint", null, 1, 1, PointStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointTypeStructureEClass, PointTypeStructure.class, "PointTypeStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPointTypeStructure_StopPoint(), this.getJourneyStopInformationStructure(), null, "stopPoint", null, 0, 1, PointTypeStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPointTypeStructure_BeaconPoint(), this.getBeaconPointStructure(), null, "beaconPoint", null, 0, 1, PointTypeStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPointTypeStructure_GNSSLocationPoint(), this.getGNSSPointStructure(), null, "gNSSLocationPoint", null, 0, 1, PointTypeStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPointTypeStructure_TimingPoint(), this.getTimingPointStructure(), null, "timingPoint", null, 0, 1, PointTypeStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPointTypeStructure_TSPPoint(), this.getTSPPointStructure(), null, "tSPPoint", null, 0, 1, PointTypeStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceIdentificationStructureEClass, ServiceIdentificationStructure.class, "ServiceIdentificationStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceIdentificationStructure_Service(), this.getServiceSpecificationStructure(), null, "service", null, 1, 1, ServiceIdentificationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceIdentificationStructure_Device(), this.getDeviceSpecificationStructure(), null, "device", null, 1, 1, ServiceIdentificationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceIdentificationWithStateListStructureEClass, ServiceIdentificationWithStateListStructure.class, "ServiceIdentificationWithStateListStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceIdentificationWithStateListStructure_ServiceIdentificationWithState(), this.getServiceIdentificationWithStateStructure(), null, "serviceIdentificationWithState", null, 0, -1, ServiceIdentificationWithStateListStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceIdentificationWithStateStructureEClass, ServiceIdentificationWithStateStructure.class, "ServiceIdentificationWithStateStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceIdentificationWithStateStructure_ServiceIdentification(), this.getServiceIdentificationStructure(), null, "serviceIdentification", null, 1, 1, ServiceIdentificationWithStateStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceIdentificationWithStateStructure_ServiceState(), theIbisEnumerationsPackage.getServiceStateEnumeration(), "serviceState", null, 1, 1, ServiceIdentificationWithStateStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceInformationListStructureEClass, ServiceInformationListStructure.class, "ServiceInformationListStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceInformationListStructure_ServiceInformation(), this.getServiceInformationStructure(), null, "serviceInformation", null, 1, -1, ServiceInformationListStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceInformationStructureEClass, ServiceInformationStructure.class, "ServiceInformationStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceInformationStructure_Service(), this.getServiceSpecificationStructure(), null, "service", null, 1, 1, ServiceInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceInformationStructure_Autostart(), this.getIBISIPBoolean(), null, "autostart", null, 1, 1, ServiceInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceSpecificationStructureEClass, ServiceSpecificationStructure.class, "ServiceSpecificationStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceSpecificationStructure_ServiceName(), theIbisEnumerationsPackage.getServiceNameEnumeration(), "serviceName", null, 1, 1, ServiceSpecificationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceSpecificationStructure_IBISIPVersion(), this.getIBISIPNMTOKEN(), null, "iBISIPVersion", null, 1, 1, ServiceSpecificationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceSpecificationWithStateListStructureEClass, ServiceSpecificationWithStateListStructure.class, "ServiceSpecificationWithStateListStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceSpecificationWithStateListStructure_ServiceSpecificationWithState(), this.getServiceSpecificationWithStateStructure(), null, "serviceSpecificationWithState", null, 0, -1, ServiceSpecificationWithStateListStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceSpecificationWithStateStructureEClass, ServiceSpecificationWithStateStructure.class, "ServiceSpecificationWithStateStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceSpecificationWithStateStructure_ServiceSpecification(), this.getServiceSpecificationStructure(), null, "serviceSpecification", null, 1, 1, ServiceSpecificationWithStateStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceSpecificationWithStateStructure_ServiceState(), theIbisEnumerationsPackage.getServiceStateEnumeration(), "serviceState", null, 1, 1, ServiceSpecificationWithStateStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceStartListStructureEClass, ServiceStartListStructure.class, "ServiceStartListStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceStartListStructure_ServiceIdentification(), this.getServiceIdentificationStructure(), null, "serviceIdentification", null, 1, -1, ServiceStartListStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceStartStructureEClass, ServiceStartStructure.class, "ServiceStartStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceStartStructure_ServiceIdentification(), this.getServiceIdentificationStructure(), null, "serviceIdentification", null, 1, 1, ServiceStartStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceStartStructure_Autostart(), this.getIBISIPBoolean(), null, "autostart", null, 1, 1, ServiceStartStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shortTripStopListStructureEClass, ShortTripStopListStructure.class, "ShortTripStopListStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShortTripStopListStructure_ShortTripStop(), this.getShortTripStopStructure(), null, "shortTripStop", null, 1, -1, ShortTripStopListStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shortTripStopStructureEClass, ShortTripStopStructure.class, "ShortTripStopStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShortTripStopStructure_JourneyStopInformation(), this.getJourneyStopInformationStructure(), null, "journeyStopInformation", null, 1, 1, ShortTripStopStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShortTripStopStructure_FareZoneInformation(), this.getFareZoneInformationStructure(), null, "fareZoneInformation", null, 1, 1, ShortTripStopStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specificPointStructureEClass, SpecificPointStructure.class, "SpecificPointStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecificPointStructure_PointRef(), this.getIBISIPNMTOKEN(), null, "pointRef", null, 1, 1, SpecificPointStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificPointStructure_DistanceToPreviousPoint(), this.getIBISIPDouble(), null, "distanceToPreviousPoint", null, 1, 1, SpecificPointStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stopInformationRequestStructureEClass, StopInformationRequestStructure.class, "StopInformationRequestStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStopInformationRequestStructure_StopIndex(), this.getIBISIPInt(), null, "stopIndex", null, 0, 1, StopInformationRequestStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformationRequestStructure_StopRef(), this.getIBISIPNMTOKEN(), null, "stopRef", null, 0, 1, StopInformationRequestStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformationRequestStructure_StopName(), this.getInternationalTextType(), null, "stopName", null, 0, -1, StopInformationRequestStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformationRequestStructure_DisplayContent(), this.getDisplayContentStructure(), null, "displayContent", null, 1, -1, StopInformationRequestStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformationRequestStructure_StopAnnouncement(), this.getAnnouncementStructure(), null, "stopAnnouncement", null, 0, -1, StopInformationRequestStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformationRequestStructure_ArrivalScheduled(), this.getIBISIPDateTime(), null, "arrivalScheduled", null, 0, 1, StopInformationRequestStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformationRequestStructure_DepartureScheduled(), this.getIBISIPDateTime(), null, "departureScheduled", null, 0, 1, StopInformationRequestStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformationRequestStructure_RecordedArrivalTime(), this.getIBISIPDateTime(), null, "recordedArrivalTime", null, 0, 1, StopInformationRequestStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformationRequestStructure_DistanceToNextStop(), this.getIBISIPInt(), null, "distanceToNextStop", null, 0, 1, StopInformationRequestStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformationRequestStructure_Connection(), this.getConnectionStructure(), null, "connection", null, 0, -1, StopInformationRequestStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformationRequestStructure_FareZone(), this.getIBISIPNMTOKEN(), null, "fareZone", null, 0, -1, StopInformationRequestStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stopInformationStructureEClass, StopInformationStructure.class, "StopInformationStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStopInformationStructure_StopIndex(), this.getIBISIPInt(), null, "stopIndex", null, 1, 1, StopInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformationStructure_StopRef(), this.getIBISIPNMTOKEN(), null, "stopRef", null, 1, 1, StopInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformationStructure_StopName(), this.getInternationalTextType(), null, "stopName", null, 1, -1, StopInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformationStructure_StopAlternativeName(), this.getInternationalTextType(), null, "stopAlternativeName", null, 0, -1, StopInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformationStructure_Platform(), this.getIBISIPString(), null, "platform", null, 0, 1, StopInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformationStructure_DisplayContent(), this.getDisplayContentStructure(), null, "displayContent", null, 1, -1, StopInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformationStructure_StopAnnouncement(), this.getAnnouncementStructure(), null, "stopAnnouncement", null, 0, -1, StopInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformationStructure_ArrivalScheduled(), this.getIBISIPDateTime(), null, "arrivalScheduled", null, 0, 1, StopInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformationStructure_ArrivalExpected(), this.getIBISIPDateTime(), null, "arrivalExpected", null, 0, 1, StopInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformationStructure_DepartureScheduled(), this.getIBISIPDateTime(), null, "departureScheduled", null, 0, 1, StopInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformationStructure_DepartureExpected(), this.getIBISIPDateTime(), null, "departureExpected", null, 0, 1, StopInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformationStructure_RecordedArrivalTime(), this.getIBISIPDateTime(), null, "recordedArrivalTime", null, 0, 1, StopInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformationStructure_DistanceToNextStop(), this.getIBISIPInt(), null, "distanceToNextStop", null, 0, 1, StopInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformationStructure_Connection(), this.getConnectionStructure(), null, "connection", null, 0, -1, StopInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopInformationStructure_FareZone(), this.getIBISIPNMTOKEN(), null, "fareZone", null, 0, -1, StopInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stopPointTariffInformationStructureEClass, StopPointTariffInformationStructure.class, "StopPointTariffInformationStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStopPointTariffInformationStructure_JourneyStopInformation(), this.getJourneyStopInformationStructure(), null, "journeyStopInformation", null, 1, 1, StopPointTariffInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopPointTariffInformationStructure_FareZoneInformation(), this.getFareZoneInformationStructure(), null, "fareZoneInformation", null, 1, 1, StopPointTariffInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stopSequenceStructureEClass, StopSequenceStructure.class, "StopSequenceStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStopSequenceStructure_StopPoint(), this.getStopInformationStructure(), null, "stopPoint", null, 2, -1, StopSequenceStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subscribeRequestStructureEClass, SubscribeRequestStructure.class, "SubscribeRequestStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubscribeRequestStructure_ClientIPAddress(), this.getIBISIPString(), null, "clientIPAddress", null, 1, 1, SubscribeRequestStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubscribeRequestStructure_ReplyPort(), this.getIBISIPInt(), null, "replyPort", null, 0, 1, SubscribeRequestStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubscribeRequestStructure_ReplyPath(), this.getIBISIPString(), null, "replyPath", null, 0, 1, SubscribeRequestStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subscribeResponseStructureEClass, SubscribeResponseStructure.class, "SubscribeResponseStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubscribeResponseStructure_Active(), this.getIBISIPBoolean(), null, "active", null, 0, 1, SubscribeResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubscribeResponseStructure_Heartbeat(), this.getIBISIPDuration(), null, "heartbeat", null, 0, 1, SubscribeResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubscribeResponseStructure_OperationErrorMessage(), this.getIBISIPString(), null, "operationErrorMessage", null, 0, 1, SubscribeResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timingPointStructureEClass, TimingPointStructure.class, "TimingPointStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimingPointStructure_TimingPointRef(), this.getIBISIPNMTOKEN(), null, "timingPointRef", null, 0, 1, TimingPointStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimingPointStructure_ScheduleTime(), this.getIBISIPDateTime(), null, "scheduleTime", null, 1, 1, TimingPointStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimingPointStructure_GNSSPoint(), this.getGNSSPointStructure(), null, "gNSSPoint", null, 1, 1, TimingPointStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tripInformationStructureEClass, TripInformationStructure.class, "TripInformationStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTripInformationStructure_TripRef(), this.getIBISIPNMTOKEN(), null, "tripRef", null, 1, 1, TripInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripInformationStructure_StopSequence(), this.getStopSequenceStructure(), null, "stopSequence", null, 1, 1, TripInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTripInformationStructure_LocationState(), theIbisEnumerationsPackage.getLocationStateEnumeration(), "locationState", null, 0, 1, TripInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripInformationStructure_TimetableDelay(), this.getIBISIPInt(), null, "timetableDelay", null, 0, 1, TripInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripInformationStructure_AdditionalTextMessage(), this.getInternationalTextType(), null, "additionalTextMessage", null, 0, 1, TripInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripInformationStructure_AdditionalTextMessage1(), this.getInternationalTextType(), null, "additionalTextMessage1", null, 0, 1, TripInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripInformationStructure_AdditionalTextMessage2(), this.getInternationalTextType(), null, "additionalTextMessage2", null, 0, 1, TripInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripInformationStructure_AdditionalTextMessage3(), this.getInternationalTextType(), null, "additionalTextMessage3", null, 0, 1, TripInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripInformationStructure_AdditionalTextMessage4(), this.getInternationalTextType(), null, "additionalTextMessage4", null, 0, 1, TripInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripInformationStructure_AdditionalTextMessage5(), this.getInternationalTextType(), null, "additionalTextMessage5", null, 0, 1, TripInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripInformationStructure_AdditionalTextMessage6(), this.getInternationalTextType(), null, "additionalTextMessage6", null, 0, 1, TripInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripInformationStructure_AdditionalTextMessage7(), this.getInternationalTextType(), null, "additionalTextMessage7", null, 0, 1, TripInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripInformationStructure_AdditionalTextMessage8(), this.getInternationalTextType(), null, "additionalTextMessage8", null, 0, 1, TripInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripInformationStructure_AdditionalTextMessage9(), this.getInternationalTextType(), null, "additionalTextMessage9", null, 0, 1, TripInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripInformationStructure_AdditionalAnnouncement(), this.getAdditionalAnnouncementStructure(), null, "additionalAnnouncement", null, 0, -1, TripInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTripInformationStructure_RouteDirection(), theIbisEnumerationsPackage.getRouteDirectionEnumeration(), "routeDirection", null, 0, 1, TripInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripInformationStructure_RunNumber(), this.getIBISIPInt(), null, "runNumber", null, 0, 1, TripInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripInformationStructure_PatternNumber(), this.getIBISIPInt(), null, "patternNumber", null, 0, 1, TripInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripInformationStructure_PathDestinationNumber(), this.getIBISIPInt(), null, "pathDestinationNumber", null, 0, 1, TripInformationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tripSequenceStructureEClass, TripSequenceStructure.class, "TripSequenceStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTripSequenceStructure_TripRef(), this.getIBISIPNMTOKEN(), null, "tripRef", null, 1, 1, TripSequenceStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripSequenceStructure_TripIndex(), this.getIBISIPInt(), null, "tripIndex", null, 0, 1, TripSequenceStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripSequenceStructure_TripStart(), this.getIBISIPTime(), null, "tripStart", null, 0, 1, TripSequenceStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripSequenceStructure_CurrentStopIndex(), this.getIBISIPInt(), null, "currentStopIndex", null, 0, 1, TripSequenceStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTripSequenceStructure_JourneyMode(), theIbisEnumerationsPackage.getJourneyModeEnumeration(), "journeyMode", null, 0, 1, TripSequenceStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripSequenceStructure_PointSequence(), this.getPointSequenceStructure(), null, "pointSequence", null, 1, 1, TripSequenceStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tspPointStructureEClass, TSPPointStructure.class, "TSPPointStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTSPPointStructure_TSPPointRef(), this.getIBISIPNMTOKEN(), null, "tSPPointRef", null, 0, 1, TSPPointStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTSPPointStructure_TSPCode(), this.getIBISIPNMTOKEN(), null, "tSPCode", null, 1, 1, TSPPointStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTSPPointStructure_ShortName(), this.getInternationalTextType(), null, "shortName", null, 0, -1, TSPPointStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTSPPointStructure_Desciption(), this.getInternationalTextType(), null, "desciption", null, 0, -1, TSPPointStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unsubscribeRequestStructureEClass, UnsubscribeRequestStructure.class, "UnsubscribeRequestStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnsubscribeRequestStructure_ClientIPAddress(), this.getIBISIPString(), null, "clientIPAddress", null, 1, 1, UnsubscribeRequestStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnsubscribeRequestStructure_ReplyPort(), this.getIBISIPInt(), null, "replyPort", null, 0, 1, UnsubscribeRequestStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnsubscribeRequestStructure_ReplyPath(), this.getIBISIPString(), null, "replyPath", null, 0, 1, UnsubscribeRequestStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unsubscribeResponseStructureEClass, UnsubscribeResponseStructure.class, "UnsubscribeResponseStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnsubscribeResponseStructure_Active(), this.getIBISIPBoolean(), null, "active", null, 1, 1, UnsubscribeResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnsubscribeResponseStructure_OperationErrorMessage(), this.getIBISIPString(), null, "operationErrorMessage", null, 0, 1, UnsubscribeResponseStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vehicleStructureEClass, VehicleStructure.class, "VehicleStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVehicleStructure_VehicleTypeRef(), this.getIBISIPNMTOKEN(), null, "vehicleTypeRef", null, 1, 1, VehicleStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVehicleStructure_Name(), this.getInternationalTextType(), null, "name", null, 0, -1, VehicleStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viaPointStructureEClass, ViaPointStructure.class, "ViaPointStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViaPointStructure_ViaPointRef(), this.getIBISIPNMTOKEN(), null, "viaPointRef", null, 1, 1, ViaPointStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViaPointStructure_PlaceRef(), this.getIBISIPNMTOKEN(), null, "placeRef", null, 0, 1, ViaPointStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViaPointStructure_PlaceName(), this.getInternationalTextType(), null, "placeName", null, 0, -1, ViaPointStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViaPointStructure_PlaceShortName(), this.getInternationalTextType(), null, "placeShortName", null, 0, -1, ViaPointStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViaPointStructure_ViaPointDisplayPriority(), this.getIBISIPInt(), null, "viaPointDisplayPriority", null, 0, 1, ViaPointStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zoneTypeEClass, ZoneType.class, "ZoneType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZoneType_FarezoneTypeID(), this.getIBISIPNMTOKEN(), null, "farezoneTypeID", null, 1, 1, ZoneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZoneType_FareZoneTypeName(), this.getInternationalTextType(), null, "fareZoneTypeName", null, 0, -1, ZoneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (additionalAnnouncementStructureEClass,
		   source,
		   new String[] {
			   "name", "AdditionalAnnouncementStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAdditionalAnnouncementStructure_AnnouncementRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AnnouncementRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAdditionalAnnouncementStructure_AnnouncementText(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AnnouncementText",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAdditionalAnnouncementStructure_AnnouncementTTSText(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AnnouncementTTSText",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAdditionalAnnouncementStructure_ImmediateInformation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ImmediateInformation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAdditionalAnnouncementStructure_PeriodicalInformation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PeriodicalInformation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAdditionalAnnouncementStructure_SpecificPoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SpecificPoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (announcementStructureEClass,
		   source,
		   new String[] {
			   "name", "AnnouncementStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAnnouncementStructure_AnnouncementRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AnnouncementRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAnnouncementStructure_AnnouncementText(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AnnouncementText",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAnnouncementStructure_AnnouncementTTSText(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AnnouncementTTSText",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (bayAreaStructureEClass,
		   source,
		   new String[] {
			   "name", "BayAreaStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBayAreaStructure_BeforeBay(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BeforeBay",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBayAreaStructure_BehindBay(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BehindBay",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (beaconPointStructureEClass,
		   source,
		   new String[] {
			   "name", "BeaconPointStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBeaconPointStructure_PointRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PointRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBeaconPointStructure_BeaconCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BeaconCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBeaconPointStructure_ShortName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ShortName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBeaconPointStructure_Desciption(),
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
		  (connectionStructureEClass,
		   source,
		   new String[] {
			   "name", "ConnectionStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getConnectionStructure_StopRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StopRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getConnectionStructure_ConnectionRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ConnectionRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getConnectionStructure_ConnectionType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ConnectionType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getConnectionStructure_DisplayContent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DisplayContent",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getConnectionStructure_Platform(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Platform",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getConnectionStructure_ConnectionState(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ConnectionState",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getConnectionStructure_TransportMode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TransportMode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getConnectionStructure_ConnectionMode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ConnectionMode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getConnectionStructure_ExpectedDepartureTime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ExpectedDepartureTime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getConnectionStructure_ScheduledDepartureTime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ScheduledDepartureTime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (dataAcceptedResponseDataStructureEClass,
		   source,
		   new String[] {
			   "name", "DataAcceptedResponseDataStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDataAcceptedResponseDataStructure_TimeStamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimeStamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataAcceptedResponseDataStructure_DataAccepted(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DataAccepted",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataAcceptedResponseDataStructure_ErrorCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ErrorCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataAcceptedResponseDataStructure_ErrorInformation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ErrorInformation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (dataAcceptedResponseStructureEClass,
		   source,
		   new String[] {
			   "name", "DataAcceptedResponseStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDataAcceptedResponseStructure_DataAcceptedResponseData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DataAcceptedResponseData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataAcceptedResponseStructure_OperationErrorMessage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OperationErrorMessage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (dataVersionListStructureEClass,
		   source,
		   new String[] {
			   "name", "DataVersionListStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDataVersionListStructure_DataVersion(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DataVersion",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (dataVersionStructureEClass,
		   source,
		   new String[] {
			   "name", "DataVersionStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDataVersionStructure_DataType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DataType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataVersionStructure_VersionRef(),
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
		  (destinationStructureEClass,
		   source,
		   new String[] {
			   "name", "DestinationStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDestinationStructure_DestinationRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DestinationRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDestinationStructure_DestinationName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DestinationName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDestinationStructure_DestinationShortName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DestinationShortName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceInformationStructureEClass,
		   source,
		   new String[] {
			   "name", "DeviceInformationStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceInformationStructure_DeviceName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceInformationStructure_Manufacturer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Manufacturer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceInformationStructure_SerialNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SerialNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceInformationStructure_DeviceClass(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceClass",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceInformationStructure_DataVersionList(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DataVersionList",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceInformationStructure_WebInterfaceAddress(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "WebInterfaceAddress",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceSpecificationListStructureEClass,
		   source,
		   new String[] {
			   "name", "DeviceSpecificationListStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceSpecificationListStructure_DeviceSpecification(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceSpecification",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceSpecificationStructureEClass,
		   source,
		   new String[] {
			   "name", "DeviceSpecificationStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceSpecificationStructure_DeviceClass(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceClass",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceSpecificationStructure_DeviceID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceSpecificationWithStateListStructureEClass,
		   source,
		   new String[] {
			   "name", "DeviceSpecificationWithStateListStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceSpecificationWithStateListStructure_DeviceSpecificationWithState(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceSpecificationWithState",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (deviceSpecificationWithStateStructureEClass,
		   source,
		   new String[] {
			   "name", "DeviceSpecificationWithStateStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeviceSpecificationWithStateStructure_DeviceSpecification(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceSpecification",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDeviceSpecificationWithStateStructure_DeviceState(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DeviceState",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (displayContentStructureEClass,
		   source,
		   new String[] {
			   "name", "DisplayContentStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDisplayContentStructure_DisplayContentRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DisplayContentRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDisplayContentStructure_LineInformation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LineInformation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDisplayContentStructure_Destination(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Destination",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDisplayContentStructure_ViaPoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ViaPoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDisplayContentStructure_AdditionalInformation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalInformation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDisplayContentStructure_AdditionalInformation1(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalInformation1",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDisplayContentStructure_AdditionalInformation2(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalInformation2",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDisplayContentStructure_AdditionalInformation3(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalInformation3",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDisplayContentStructure_AdditionalInformation4(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalInformation4",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDisplayContentStructure_AdditionalInformation5(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalInformation5",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDisplayContentStructure_AdditionalInformation6(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalInformation6",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDisplayContentStructure_AdditionalInformation7(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalInformation7",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDisplayContentStructure_AdditionalInformation8(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalInformation8",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDisplayContentStructure_AdditionalInformation9(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalInformation9",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDisplayContentStructure_RunNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RunNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDisplayContentStructure_Priority(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Priority",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDisplayContentStructure_PeriodDuration(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PeriodDuration",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDisplayContentStructure_Duration(),
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
		  (doorCountingListStructureEClass,
		   source,
		   new String[] {
			   "name", "DoorCountingListStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDoorCountingListStructure_DoorID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DoorID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDoorCountingListStructure_CountSet(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CountSet",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (doorCountingStructureEClass,
		   source,
		   new String[] {
			   "name", "DoorCountingStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDoorCountingStructure_ObjectClass(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ObjectClass",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDoorCountingStructure_In(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "In",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDoorCountingStructure_Out(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Out",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDoorCountingStructure_CountQuality(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CountQuality",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (doorInformationStructureEClass,
		   source,
		   new String[] {
			   "name", "DoorInformationStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDoorInformationStructure_DoorID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DoorID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDoorInformationStructure_Count(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Count",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDoorInformationStructure_State(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "State",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (doorOpenStateStructureEClass,
		   source,
		   new String[] {
			   "name", "DoorOpenStateStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDoorOpenStateStructure_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Value",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDoorOpenStateStructure_ErrorCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ErrorCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (doorOperationStateStructureEClass,
		   source,
		   new String[] {
			   "name", "DoorOperationStateStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDoorOperationStateStructure_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Value",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDoorOperationStateStructure_ErrorCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ErrorCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (doorStateStructureEClass,
		   source,
		   new String[] {
			   "name", "DoorStateStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDoorStateStructure_OpenState(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OpenState",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDoorStateStructure_OperationState(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OperationState",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (fareZoneInformationStructureEClass,
		   source,
		   new String[] {
			   "name", "FareZoneInformationStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFareZoneInformationStructure_FareZoneID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FareZoneID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFareZoneInformationStructure_FareZoneType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FareZoneType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFareZoneInformationStructure_FareZoneLongName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FareZoneLongName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFareZoneInformationStructure_FareZoneShortName(),
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
		  (gnssCoordinateStructureEClass,
		   source,
		   new String[] {
			   "name", "GNSSCoordinateStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGNSSCoordinateStructure_Degree(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Degree",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGNSSCoordinateStructure_Direction(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Direction",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (gnssPointStructureEClass,
		   source,
		   new String[] {
			   "name", "GNSSPointStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGNSSPointStructure_PointRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PointRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGNSSPointStructure_Longitude(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Longitude",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGNSSPointStructure_Latitude(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Latitude",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGNSSPointStructure_Altitude(),
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
		  (journeyStopInformationStructureEClass,
		   source,
		   new String[] {
			   "name", "JourneyStopInformationStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getJourneyStopInformationStructure_StopRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StopRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getJourneyStopInformationStructure_StopName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StopName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getJourneyStopInformationStructure_StopAlternativeName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StopAlternativeName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getJourneyStopInformationStructure_Platform(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Platform",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getJourneyStopInformationStructure_DisplayContent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DisplayContent",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getJourneyStopInformationStructure_Announcement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Announcement",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getJourneyStopInformationStructure_ArrivalScheduled(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ArrivalScheduled",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getJourneyStopInformationStructure_DepartureScheduled(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DepartureScheduled",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getJourneyStopInformationStructure_Connection(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Connection",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getJourneyStopInformationStructure_BayArea(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BayArea",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getJourneyStopInformationStructure_GNSSPoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GNSSPoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getJourneyStopInformationStructure_FareZone(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FareZone",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (lineInformationStructureEClass,
		   source,
		   new String[] {
			   "name", "LineInformationStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLineInformationStructure_LineRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LineRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLineInformationStructure_LineName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LineName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLineInformationStructure_LineShortName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LineShortName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLineInformationStructure_LineNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LineNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLineInformationStructure_LineCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LineCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (logMessageStructureEClass,
		   source,
		   new String[] {
			   "name", "LogMessageStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLogMessageStructure_MessageProvider(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MessageProvider",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLogMessageStructure_Message(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Message",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (messageStructureEClass,
		   source,
		   new String[] {
			   "name", "MessageStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMessageStructure_MessageID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Message-ID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMessageStructure_TimeStamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimeStamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMessageStructure_MessageType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MessageType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMessageStructure_MessageText(),
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
		  (pointSequenceStructureEClass,
		   source,
		   new String[] {
			   "name", "PointSequenceStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPointSequenceStructure_Point(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Point",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (pointStructureEClass,
		   source,
		   new String[] {
			   "name", "PointStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPointStructure_PointIndex(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PointIndex",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPointStructure_PointType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PointType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPointStructure_DistanceToPreviousPoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DistanceToPreviousPoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (pointTypeStructureEClass,
		   source,
		   new String[] {
			   "name", "PointTypeStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPointTypeStructure_StopPoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StopPoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPointTypeStructure_BeaconPoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BeaconPoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPointTypeStructure_GNSSLocationPoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GNSSLocationPoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPointTypeStructure_TimingPoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimingPoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPointTypeStructure_TSPPoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TSPPoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (serviceIdentificationStructureEClass,
		   source,
		   new String[] {
			   "name", "ServiceIdentificationStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getServiceIdentificationStructure_Service(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Service",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getServiceIdentificationStructure_Device(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Device",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (serviceIdentificationWithStateListStructureEClass,
		   source,
		   new String[] {
			   "name", "ServiceIdentificationWithStateListStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getServiceIdentificationWithStateListStructure_ServiceIdentificationWithState(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ServiceIdentificationWithState",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (serviceIdentificationWithStateStructureEClass,
		   source,
		   new String[] {
			   "name", "ServiceIdentificationWithStateStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getServiceIdentificationWithStateStructure_ServiceIdentification(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ServiceIdentification",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getServiceIdentificationWithStateStructure_ServiceState(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ServiceState",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (serviceInformationListStructureEClass,
		   source,
		   new String[] {
			   "name", "ServiceInformationListStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getServiceInformationListStructure_ServiceInformation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ServiceInformation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (serviceInformationStructureEClass,
		   source,
		   new String[] {
			   "name", "ServiceInformationStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getServiceInformationStructure_Service(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Service",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getServiceInformationStructure_Autostart(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Autostart",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (serviceSpecificationStructureEClass,
		   source,
		   new String[] {
			   "name", "ServiceSpecificationStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getServiceSpecificationStructure_ServiceName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ServiceName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getServiceSpecificationStructure_IBISIPVersion(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "IBIS-IP-Version",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (serviceSpecificationWithStateListStructureEClass,
		   source,
		   new String[] {
			   "name", "ServiceSpecificationWithStateListStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getServiceSpecificationWithStateListStructure_ServiceSpecificationWithState(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ServiceSpecificationWithState",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (serviceSpecificationWithStateStructureEClass,
		   source,
		   new String[] {
			   "name", "ServiceSpecificationWithStateStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getServiceSpecificationWithStateStructure_ServiceSpecification(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ServiceSpecification",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getServiceSpecificationWithStateStructure_ServiceState(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ServiceState",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (serviceStartListStructureEClass,
		   source,
		   new String[] {
			   "name", "ServiceStartListStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getServiceStartListStructure_ServiceIdentification(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ServiceIdentification",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (serviceStartStructureEClass,
		   source,
		   new String[] {
			   "name", "ServiceStartStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getServiceStartStructure_ServiceIdentification(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ServiceIdentification",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getServiceStartStructure_Autostart(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Autostart",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (shortTripStopListStructureEClass,
		   source,
		   new String[] {
			   "name", "ShortTripStopListStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getShortTripStopListStructure_ShortTripStop(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ShortTripStop",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (shortTripStopStructureEClass,
		   source,
		   new String[] {
			   "name", "ShortTripStopStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getShortTripStopStructure_JourneyStopInformation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "JourneyStopInformation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getShortTripStopStructure_FareZoneInformation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FareZoneInformation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (specificPointStructureEClass,
		   source,
		   new String[] {
			   "name", "SpecificPointStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSpecificPointStructure_PointRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PointRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSpecificPointStructure_DistanceToPreviousPoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DistanceToPreviousPoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (stopInformationRequestStructureEClass,
		   source,
		   new String[] {
			   "name", "StopInformationRequestStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStopInformationRequestStructure_StopIndex(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StopIndex",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformationRequestStructure_StopRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StopRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformationRequestStructure_StopName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StopName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformationRequestStructure_DisplayContent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DisplayContent",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformationRequestStructure_StopAnnouncement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StopAnnouncement",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformationRequestStructure_ArrivalScheduled(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ArrivalScheduled",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformationRequestStructure_DepartureScheduled(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DepartureScheduled",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformationRequestStructure_RecordedArrivalTime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RecordedArrivalTime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformationRequestStructure_DistanceToNextStop(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DistanceToNextStop",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformationRequestStructure_Connection(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Connection",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformationRequestStructure_FareZone(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FareZone",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (stopInformationStructureEClass,
		   source,
		   new String[] {
			   "name", "StopInformationStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStopInformationStructure_StopIndex(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StopIndex",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformationStructure_StopRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StopRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformationStructure_StopName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StopName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformationStructure_StopAlternativeName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StopAlternativeName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformationStructure_Platform(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Platform",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformationStructure_DisplayContent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DisplayContent",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformationStructure_StopAnnouncement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StopAnnouncement",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformationStructure_ArrivalScheduled(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ArrivalScheduled",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformationStructure_ArrivalExpected(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ArrivalExpected",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformationStructure_DepartureScheduled(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DepartureScheduled",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformationStructure_DepartureExpected(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DepartureExpected",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformationStructure_RecordedArrivalTime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RecordedArrivalTime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformationStructure_DistanceToNextStop(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DistanceToNextStop",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformationStructure_Connection(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Connection",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopInformationStructure_FareZone(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FareZone",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (stopPointTariffInformationStructureEClass,
		   source,
		   new String[] {
			   "name", "StopPointTariffInformationStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStopPointTariffInformationStructure_JourneyStopInformation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "JourneyStopInformation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopPointTariffInformationStructure_FareZoneInformation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FareZoneInformation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (stopSequenceStructureEClass,
		   source,
		   new String[] {
			   "name", "StopSequenceStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStopSequenceStructure_StopPoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StopPoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (subscribeRequestStructureEClass,
		   source,
		   new String[] {
			   "name", "SubscribeRequestStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSubscribeRequestStructure_ClientIPAddress(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Client-IP-Address",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSubscribeRequestStructure_ReplyPort(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ReplyPort",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSubscribeRequestStructure_ReplyPath(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ReplyPath",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (subscribeResponseStructureEClass,
		   source,
		   new String[] {
			   "name", "SubscribeResponseStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSubscribeResponseStructure_Active(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Active",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSubscribeResponseStructure_Heartbeat(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Heartbeat",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSubscribeResponseStructure_OperationErrorMessage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OperationErrorMessage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (timingPointStructureEClass,
		   source,
		   new String[] {
			   "name", "TimingPointStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTimingPointStructure_TimingPointRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimingPointRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTimingPointStructure_ScheduleTime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ScheduleTime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTimingPointStructure_GNSSPoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GNSSPoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tripInformationStructureEClass,
		   source,
		   new String[] {
			   "name", "TripInformationStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTripInformationStructure_TripRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TripRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripInformationStructure_StopSequence(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StopSequence",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripInformationStructure_LocationState(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LocationState",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripInformationStructure_TimetableDelay(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimetableDelay",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripInformationStructure_AdditionalTextMessage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalTextMessage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripInformationStructure_AdditionalTextMessage1(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalTextMessage1",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripInformationStructure_AdditionalTextMessage2(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalTextMessage2",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripInformationStructure_AdditionalTextMessage3(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalTextMessage3",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripInformationStructure_AdditionalTextMessage4(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalTextMessage4",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripInformationStructure_AdditionalTextMessage5(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalTextMessage5",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripInformationStructure_AdditionalTextMessage6(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalTextMessage6",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripInformationStructure_AdditionalTextMessage7(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalTextMessage7",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripInformationStructure_AdditionalTextMessage8(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalTextMessage8",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripInformationStructure_AdditionalTextMessage9(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalTextMessage9",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripInformationStructure_AdditionalAnnouncement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalAnnouncement",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripInformationStructure_RouteDirection(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RouteDirection",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripInformationStructure_RunNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RunNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripInformationStructure_PatternNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PatternNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripInformationStructure_PathDestinationNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PathDestinationNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tripSequenceStructureEClass,
		   source,
		   new String[] {
			   "name", "TripSequenceStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTripSequenceStructure_TripRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TripRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripSequenceStructure_TripIndex(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TripIndex",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripSequenceStructure_TripStart(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TripStart",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripSequenceStructure_CurrentStopIndex(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CurrentStopIndex",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripSequenceStructure_JourneyMode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "JourneyMode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTripSequenceStructure_PointSequence(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PointSequence",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tspPointStructureEClass,
		   source,
		   new String[] {
			   "name", "TSPPointStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTSPPointStructure_TSPPointRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TSPPointRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTSPPointStructure_TSPCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TSPCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTSPPointStructure_ShortName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ShortName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTSPPointStructure_Desciption(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Desciption",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (unsubscribeRequestStructureEClass,
		   source,
		   new String[] {
			   "name", "UnsubscribeRequestStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUnsubscribeRequestStructure_ClientIPAddress(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Client-IP-Address",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUnsubscribeRequestStructure_ReplyPort(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ReplyPort",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUnsubscribeRequestStructure_ReplyPath(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ReplyPath",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (unsubscribeResponseStructureEClass,
		   source,
		   new String[] {
			   "name", "UnsubscribeResponseStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUnsubscribeResponseStructure_Active(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Active",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUnsubscribeResponseStructure_OperationErrorMessage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OperationErrorMessage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (vehicleStructureEClass,
		   source,
		   new String[] {
			   "name", "VehicleStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getVehicleStructure_VehicleTypeRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "VehicleTypeRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVehicleStructure_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (viaPointStructureEClass,
		   source,
		   new String[] {
			   "name", "ViaPointStructure",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getViaPointStructure_ViaPointRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ViaPointRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getViaPointStructure_PlaceRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PlaceRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getViaPointStructure_PlaceName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PlaceName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getViaPointStructure_PlaceShortName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PlaceShortName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getViaPointStructure_ViaPointDisplayPriority(),
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
		  (additionalAnnouncementStructureEClass,
		   source,
		   new String[] {
			   "documentation", "Structure for decscribing the informations for an additional announcement"
		   });
		addAnnotation
		  (getAdditionalAnnouncementStructure_AnnouncementRef(),
		   source,
		   new String[] {
			   "documentation", "Reference to the Announcement in the schedule data"
		   });
		addAnnotation
		  (getAdditionalAnnouncementStructure_AnnouncementText(),
		   source,
		   new String[] {
			   "documentation", "Text of the Announcement"
		   });
		addAnnotation
		  (getAdditionalAnnouncementStructure_AnnouncementTTSText(),
		   source,
		   new String[] {
			   "documentation", "Text of the Announcement for a text-to-speech-system"
		   });
		addAnnotation
		  (getAdditionalAnnouncementStructure_ImmediateInformation(),
		   source,
		   new String[] {
			   "documentation", "true, if the additional annoucement should be pronounced immiditaley"
		   });
		addAnnotation
		  (getAdditionalAnnouncementStructure_PeriodicalInformation(),
		   source,
		   new String[] {
			   "documentation", "period in which the addional announcement should be played "
		   });
		addAnnotation
		  (getAdditionalAnnouncementStructure_SpecificPoint(),
		   source,
		   new String[] {
			   "documentation", "describes a specific point, where the addional announcement should be played"
		   });
		addAnnotation
		  (announcementStructureEClass,
		   source,
		   new String[] {
			   "documentation", "Structure for decscribing the informations for an regular announcement"
		   });
		addAnnotation
		  (getAnnouncementStructure_AnnouncementRef(),
		   source,
		   new String[] {
			   "documentation", "Reference to the Announcement in the schedule data"
		   });
		addAnnotation
		  (getAnnouncementStructure_AnnouncementText(),
		   source,
		   new String[] {
			   "documentation", "Text of the Announcement"
		   });
		addAnnotation
		  (getAnnouncementStructure_AnnouncementTTSText(),
		   source,
		   new String[] {
			   "documentation", "Text of the Announcement for a text-to-speech-system"
		   });
		addAnnotation
		  (bayAreaStructureEClass,
		   source,
		   new String[] {
			   "documentation", "Structure for describing an area at the stop point for detecting the right stop position"
		   });
		addAnnotation
		  (getBayAreaStructure_BeforeBay(),
		   source,
		   new String[] {
			   "documentation", "Distance before the defined Stoppoint, where the detection area begins, value in [m]"
		   });
		addAnnotation
		  (getBayAreaStructure_BehindBay(),
		   source,
		   new String[] {
			   "documentation", "Distance behind the defined Stoppoint, where the detection area begins, value in [m]"
		   });
		addAnnotation
		  (beaconPointStructureEClass,
		   source,
		   new String[] {
			   "documentation", "Structure for describing a beacon point"
		   });
		addAnnotation
		  (getBeaconPointStructure_PointRef(),
		   source,
		   new String[] {
			   "documentation", "Reference to the beacon point in the schedule data"
		   });
		addAnnotation
		  (getBeaconPointStructure_BeaconCode(),
		   source,
		   new String[] {
			   "documentation", "Code of the beacon point"
		   });
		addAnnotation
		  (getBeaconPointStructure_ShortName(),
		   source,
		   new String[] {
			   "documentation", "Shortname of the beaon point"
		   });
		addAnnotation
		  (getBeaconPointStructure_Desciption(),
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
		  (connectionStructureEClass,
		   source,
		   new String[] {
			   "documentation", "Structure for describing a connection"
		   });
		addAnnotation
		  (getConnectionStructure_StopRef(),
		   source,
		   new String[] {
			   "documentation", "StopPoint, where the connection should take place (from planning system)"
		   });
		addAnnotation
		  (getConnectionStructure_ConnectionRef(),
		   source,
		   new String[] {
			   "documentation", "StopPoint-referenced connection-reference"
		   });
		addAnnotation
		  (getConnectionStructure_ConnectionType(),
		   source,
		   new String[] {
			   "documentation", "Describes the kind of connection "
		   });
		addAnnotation
		  (getConnectionStructure_DisplayContent(),
		   source,
		   new String[] {
			   "documentation", "Structure for desccribing the information which is shown on a head- or sidesign"
		   });
		addAnnotation
		  (getConnectionStructure_Platform(),
		   source,
		   new String[] {
			   "documentation", "Platform, on which the connection should take place"
		   });
		addAnnotation
		  (getConnectionStructure_ConnectionState(),
		   source,
		   new String[] {
			   "documentation", "Describes the status of the connection"
		   });
		addAnnotation
		  (getConnectionStructure_TransportMode(),
		   source,
		   new String[] {
			   "documentation", "Describes the mode of the pick-up vehicle, DEPRECATED !, THE ConnectionMode SHOULD BE USED INSTEAD"
		   });
		addAnnotation
		  (getConnectionStructure_ConnectionMode(),
		   source,
		   new String[] {
			   "documentation", "Mode- and Submode information of the pick-up vehicle in accordance with Netex"
		   });
		addAnnotation
		  (getConnectionStructure_ExpectedDepartureTime(),
		   source,
		   new String[] {
			   "documentation", "Information, at which time the leaving vehicle will depart based on realtime information"
		   });
		addAnnotation
		  (getConnectionStructure_ScheduledDepartureTime(),
		   source,
		   new String[] {
			   "documentation", "Information, at which time the leaving vehicle is planned to depart"
		   });
		addAnnotation
		  (dataVersionStructureEClass,
		   source,
		   new String[] {
			   "documentation", "Structure for describing data-versions"
		   });
		addAnnotation
		  (getDataVersionStructure_DataType(),
		   source,
		   new String[] {
			   "documentation", "Kind of data"
		   });
		addAnnotation
		  (getDataVersionStructure_VersionRef(),
		   source,
		   new String[] {
			   "documentation", "Versionreference of the data"
		   });
		addAnnotation
		  (destinationStructureEClass,
		   source,
		   new String[] {
			   "documentation", "Structure for describing destination information"
		   });
		addAnnotation
		  (getDestinationStructure_DestinationRef(),
		   source,
		   new String[] {
			   "documentation", "Reference to the destination-information in the schedule-data"
		   });
		addAnnotation
		  (getDestinationStructure_DestinationName(),
		   source,
		   new String[] {
			   "documentation", "Text of the destination"
		   });
		addAnnotation
		  (getDestinationStructure_DestinationShortName(),
		   source,
		   new String[] {
			   "documentation", "Shorttext of the destination if there is limited space"
		   });
		addAnnotation
		  (displayContentStructureEClass,
		   source,
		   new String[] {
			   "documentation", "Structure for describing the information for a headsign or a sidesign"
		   });
		addAnnotation
		  (getDisplayContentStructure_DisplayContentRef(),
		   source,
		   new String[] {
			   "documentation", "Reference to the display content information in the schedule data"
		   });
		addAnnotation
		  (getDisplayContentStructure_LineInformation(),
		   source,
		   new String[] {
			   "documentation", "Information on the line, which should be displayed"
		   });
		addAnnotation
		  (getDisplayContentStructure_Destination(),
		   source,
		   new String[] {
			   "documentation", "Information on the destination, which should be displayed"
		   });
		addAnnotation
		  (getDisplayContentStructure_ViaPoint(),
		   source,
		   new String[] {
			   "documentation", "Information on the via points which should be displayed"
		   });
		addAnnotation
		  (getDisplayContentStructure_AdditionalInformation(),
		   source,
		   new String[] {
			   "documentation", "Additional Information Text, which could be displayed, e.g. \"Extra Ride\", \"Express\", ... "
		   });
		addAnnotation
		  (getDisplayContentStructure_AdditionalInformation1(),
		   source,
		   new String[] {
			   "documentation", "Additional Information Text, which is assigned project-specific"
		   });
		addAnnotation
		  (getDisplayContentStructure_AdditionalInformation2(),
		   source,
		   new String[] {
			   "documentation", "Additional Information Text, which is assigned project-specific"
		   });
		addAnnotation
		  (getDisplayContentStructure_AdditionalInformation3(),
		   source,
		   new String[] {
			   "documentation", "Additional Information Text, which is assigned project-specific"
		   });
		addAnnotation
		  (getDisplayContentStructure_AdditionalInformation4(),
		   source,
		   new String[] {
			   "documentation", "Additional Information Text, which is assigned project-specific"
		   });
		addAnnotation
		  (getDisplayContentStructure_AdditionalInformation5(),
		   source,
		   new String[] {
			   "documentation", "Additional Information Text, which is assigned project-specific"
		   });
		addAnnotation
		  (getDisplayContentStructure_AdditionalInformation6(),
		   source,
		   new String[] {
			   "documentation", "Additional Information Text, which is assigned project-specific"
		   });
		addAnnotation
		  (getDisplayContentStructure_AdditionalInformation7(),
		   source,
		   new String[] {
			   "documentation", "Additional Information Text, which is assigned project-specific"
		   });
		addAnnotation
		  (getDisplayContentStructure_AdditionalInformation8(),
		   source,
		   new String[] {
			   "documentation", "Additional Information Text, which is assigned project-specific"
		   });
		addAnnotation
		  (getDisplayContentStructure_AdditionalInformation9(),
		   source,
		   new String[] {
			   "documentation", "Additional Information Text, which is assigned project-specific"
		   });
		addAnnotation
		  (getDisplayContentStructure_RunNumber(),
		   source,
		   new String[] {
			   "documentation", "The run number (Kurs-Nummer) the trip is operated "
		   });
		addAnnotation
		  (getDisplayContentStructure_Priority(),
		   source,
		   new String[] {
			   "documentation", "Value, which allows to decide which Information is shown, if there is not enough time to show all"
		   });
		addAnnotation
		  (getDisplayContentStructure_PeriodDuration(),
		   source,
		   new String[] {
			   "documentation", "If more than one Sign-Information is given, you need to know"
		   });
		addAnnotation
		  (getDisplayContentStructure_Duration(),
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
		  (getFareZoneInformationStructure_FareZoneID(),
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
		  (gnssCoordinateStructureEClass,
		   source,
		   new String[] {
			   "documentation", "Structure for describing a GNSS-Point"
		   });
		addAnnotation
		  (gnssPointStructureEClass,
		   source,
		   new String[] {
			   "documentation", "Structure for describing a GNSS-Point"
		   });
		addAnnotation
		  (getGNSSPointStructure_PointRef(),
		   source,
		   new String[] {
			   "documentation", "Reference to the point in schedule data"
		   });
		addAnnotation
		  (getJourneyStopInformationStructure_StopRef(),
		   source,
		   new String[] {
			   "documentation", "Reference to the stoppoint from the planning system\t"
		   });
		addAnnotation
		  (getJourneyStopInformationStructure_Connection(),
		   source,
		   new String[] {
			   "documentation", "Information on Connections or Interchanges; not in StopSequence because of RealTimeInformation"
		   });
		addAnnotation
		  (getLineInformationStructure_LineCode(),
		   source,
		   new String[] {
			   "documentation", "identifier of a symbol number , which is used by displays see LINIEN_CODE in VDV 452 chapter 9.7.2 REC_LID"
		   });
		addAnnotation
		  (getLogMessageStructure_MessageProvider(),
		   source,
		   new String[] {
			   "documentation", "Name of the Service or Device, which sends the message, which has to be logged"
		   });
		addAnnotation
		  (getMessageStructure_TimeStamp(),
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
		  (getPointStructure_DistanceToPreviousPoint(),
		   source,
		   new String[] {
			   "documentation", "aus REC-SEL bzw. REC_SEL_ZP der VDV 452"
		   });
		addAnnotation
		  (getPointTypeStructure_StopPoint(),
		   source,
		   new String[] {
			   "documentation", "In Analogie zu REC_ORT aus VDV 452"
		   });
		addAnnotation
		  (getPointTypeStructure_GNSSLocationPoint(),
		   source,
		   new String[] {
			   "documentation", "Point, where specific GNSS-Information is provided, \"GNSS-Solution\" for the Beacon-Points, analogue to REC_OM from VDV 452"
		   });
		addAnnotation
		  (getPointTypeStructure_TSPPoint(),
		   source,
		   new String[] {
			   "documentation", "Point, where Information for TrafficSignalPriorisation is provided "
		   });
		addAnnotation
		  (getStopInformationRequestStructure_StopIndex(),
		   source,
		   new String[] {
			   "documentation", "StopIndex on current trip\t"
		   });
		addAnnotation
		  (getStopInformationRequestStructure_StopRef(),
		   source,
		   new String[] {
			   "documentation", "Reference to the stoppoint from the planning system\t"
		   });
		addAnnotation
		  (getStopInformationRequestStructure_RecordedArrivalTime(),
		   source,
		   new String[] {
			   "documentation", "This Value is needed for the demonstration at the SSB"
		   });
		addAnnotation
		  (getStopInformationRequestStructure_DistanceToNextStop(),
		   source,
		   new String[] {
			   "documentation", "Soll-Abstand zwischen den Haltestellen"
		   });
		addAnnotation
		  (getStopInformationRequestStructure_Connection(),
		   source,
		   new String[] {
			   "documentation", "Information on Connections or Interchanges; not in StopSequence because of RealTimeInformation"
		   });
		addAnnotation
		  (getStopInformationStructure_StopIndex(),
		   source,
		   new String[] {
			   "documentation", "StopIndex on current trip\t"
		   });
		addAnnotation
		  (getStopInformationStructure_StopRef(),
		   source,
		   new String[] {
			   "documentation", "Reference to the stoppoint from the planning system\t"
		   });
		addAnnotation
		  (getStopInformationStructure_ArrivalExpected(),
		   source,
		   new String[] {
			   "documentation", "A resolution of 30s is recommended, for the display it is recommended to show the arrival time in minutes."
		   });
		addAnnotation
		  (getStopInformationStructure_RecordedArrivalTime(),
		   source,
		   new String[] {
			   "documentation", "This Value is needed for the demonstration at the SSB"
		   });
		addAnnotation
		  (getStopInformationStructure_DistanceToNextStop(),
		   source,
		   new String[] {
			   "documentation", "Soll-Abstand zwischen den Haltestellen"
		   });
		addAnnotation
		  (getStopInformationStructure_Connection(),
		   source,
		   new String[] {
			   "documentation", "Information on Connections or Interchanges; not in StopSequence because of RealTimeInformation"
		   });
		addAnnotation
		  (subscribeResponseStructureEClass,
		   source,
		   new String[] {
			   "documentation", "For compatibility reasons, this structure is now a sequence of members, all of which are optional - of course, at least one member should be included in meaningful data."
		   });
		addAnnotation
		  (getSubscribeResponseStructure_Heartbeat(),
		   source,
		   new String[] {
			   "documentation", "If the service returns a heartbeat value and it is not 0, the subscriber can expect that the service will send data at least every heartbeat seconds.\tThis heartbeat can be used to monitor the connection quality by the client. "
		   });
		addAnnotation
		  (getTripInformationStructure_StopSequence(),
		   source,
		   new String[] {
			   "documentation", "List of StopPoints; with additional information"
		   });
		addAnnotation
		  (getTripInformationStructure_LocationState(),
		   source,
		   new String[] {
			   "documentation", "Information of the location state"
		   });
		addAnnotation
		  (getTripInformationStructure_TimetableDelay(),
		   source,
		   new String[] {
			   "documentation", "Delay in seconds. Early times are shown as negative values.\n\n            \t\t\ttbd: what happens, if this value isn\'t set\n            \t\t"
		   });
		addAnnotation
		  (getTripInformationStructure_AdditionalAnnouncement(),
		   source,
		   new String[] {
			   "documentation", "not StopPointAnnouncements; additional announcements; e.g. of the operator or dispatcher"
		   });
		addAnnotation
		  (getTripInformationStructure_RouteDirection(),
		   source,
		   new String[] {
			   "documentation", "The direction of the route, 1->forward 2->backwards and  0->UNDEFINED "
		   });
		addAnnotation
		  (getTripInformationStructure_RunNumber(),
		   source,
		   new String[] {
			   "documentation", "The run number (Kurs-Nummer) the trip is operated "
		   });
		addAnnotation
		  (getTripInformationStructure_PatternNumber(),
		   source,
		   new String[] {
			   "documentation", "The pattern number (Linienfahrweg-Nummer) the trip is operated "
		   });
		addAnnotation
		  (getTripInformationStructure_PathDestinationNumber(),
		   source,
		   new String[] {
			   "documentation", "The path destination number (RoutenZiel-Nummer) the trip is operated "
		   });
		addAnnotation
		  (getTripSequenceStructure_TripStart(),
		   source,
		   new String[] {
			   "documentation", "Time, at which the trip is starting"
		   });
		addAnnotation
		  (getTripSequenceStructure_PointSequence(),
		   source,
		   new String[] {
			   "documentation", "In Analogie zu LID-Verlauf aus VDV 452"
		   });
		addAnnotation
		  (viaPointStructureEClass,
		   source,
		   new String[] {
			   "documentation", "Structure for describing a via point on journey."
		   });
		addAnnotation
		  (getViaPointStructure_PlaceRef(),
		   source,
		   new String[] {
			   "documentation", "The identifier of the via place in the journey; used to help identify the vehicle journey on arrival boards."
		   });
		addAnnotation
		  (getViaPointStructure_PlaceName(),
		   source,
		   new String[] {
			   "documentation", "The name of the via place in the journey; used to help identify the vehicle to the public."
		   });
		addAnnotation
		  (getViaPointStructure_PlaceShortName(),
		   source,
		   new String[] {
			   "documentation", "The short name of the via place in the journey; used to help identify the vehicle to the public."
		   });
		addAnnotation
		  (getViaPointStructure_ViaPointDisplayPriority(),
		   source,
		   new String[] {
			   "documentation", "Value, which defines a priority to select a number of via points, if not all via points can be shown"
		   });
	}

} //IbisCommonPackageImpl
