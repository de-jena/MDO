/**
 */
package de.jena.mdo.ibis.common.impl;

import de.jena.mdo.ibis.common.IbisCommonFactory;
import de.jena.mdo.ibis.common.IbisCommonPackage;

import de.jena.mdo.ibis.enumerations.IbisEnumerationsPackage;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

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
	protected String packageFilename = "common.ecore";

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

		// Load packages
		theIbisCommonPackage.loadPackage();

		// Fix loaded packages
		theIbisCommonPackage.fixPackageContents();

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
		if (additionalAnnouncementStructureEClass == null) {
			additionalAnnouncementStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(0);
		}
		return additionalAnnouncementStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdditionalAnnouncementStructure_AnnouncementRef() {
        return (EReference)getAdditionalAnnouncementStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdditionalAnnouncementStructure_AnnouncementText() {
        return (EReference)getAdditionalAnnouncementStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdditionalAnnouncementStructure_AnnouncementTTSText() {
        return (EReference)getAdditionalAnnouncementStructure().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdditionalAnnouncementStructure_ImmediateInformation() {
        return (EReference)getAdditionalAnnouncementStructure().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdditionalAnnouncementStructure_PeriodicalInformation() {
        return (EReference)getAdditionalAnnouncementStructure().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdditionalAnnouncementStructure_SpecificPoint() {
        return (EReference)getAdditionalAnnouncementStructure().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnouncementStructure() {
		if (announcementStructureEClass == null) {
			announcementStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(1);
		}
		return announcementStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnouncementStructure_AnnouncementRef() {
        return (EReference)getAnnouncementStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnouncementStructure_AnnouncementText() {
        return (EReference)getAnnouncementStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnouncementStructure_AnnouncementTTSText() {
        return (EReference)getAnnouncementStructure().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBayAreaStructure() {
		if (bayAreaStructureEClass == null) {
			bayAreaStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(2);
		}
		return bayAreaStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBayAreaStructure_BeforeBay() {
        return (EReference)getBayAreaStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBayAreaStructure_BehindBay() {
        return (EReference)getBayAreaStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBeaconPointStructure() {
		if (beaconPointStructureEClass == null) {
			beaconPointStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(3);
		}
		return beaconPointStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBeaconPointStructure_PointRef() {
        return (EReference)getBeaconPointStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBeaconPointStructure_BeaconCode() {
        return (EReference)getBeaconPointStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBeaconPointStructure_ShortName() {
        return (EReference)getBeaconPointStructure().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBeaconPointStructure_Desciption() {
        return (EReference)getBeaconPointStructure().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCardApplInformations() {
		if (cardApplInformationsEClass == null) {
			cardApplInformationsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(4);
		}
		return cardApplInformationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCardApplInformations_CardApplInformationLength() {
        return (EReference)getCardApplInformations().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCardApplInformations_CardApplInformationData() {
        return (EReference)getCardApplInformations().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCardTicketData() {
		if (cardTicketDataEClass == null) {
			cardTicketDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(5);
		}
		return cardTicketDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCardTicketData_CardTicketDataID() {
        return (EReference)getCardTicketData().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCardTicketData_CardTicketDataLength() {
        return (EReference)getCardTicketData().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCardTicketData_CardTicketData() {
        return (EReference)getCardTicketData().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCardType() {
		if (cardTypeEClass == null) {
			cardTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(6);
		}
		return cardTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCardType_CardSerialNumber() {
        return (EReference)getCardType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCardType_CardTypeID() {
        return (EReference)getCardType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCardType_CardTypeText() {
        return (EReference)getCardType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnectionStructure() {
		if (connectionStructureEClass == null) {
			connectionStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(7);
		}
		return connectionStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectionStructure_StopRef() {
        return (EReference)getConnectionStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectionStructure_ConnectionRef() {
        return (EReference)getConnectionStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectionStructure_ConnectionType() {
        return (EAttribute)getConnectionStructure().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectionStructure_DisplayContent() {
        return (EReference)getConnectionStructure().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectionStructure_Platform() {
        return (EReference)getConnectionStructure().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectionStructure_ConnectionState() {
        return (EAttribute)getConnectionStructure().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectionStructure_TransportMode() {
        return (EReference)getConnectionStructure().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectionStructure_ConnectionMode() {
        return (EReference)getConnectionStructure().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectionStructure_ExpectedDepartureTime() {
        return (EReference)getConnectionStructure().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectionStructure_ScheduledDepartureTime() {
        return (EReference)getConnectionStructure().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataAcceptedResponseDataStructure() {
		if (dataAcceptedResponseDataStructureEClass == null) {
			dataAcceptedResponseDataStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(8);
		}
		return dataAcceptedResponseDataStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataAcceptedResponseDataStructure_TimeStamp() {
        return (EReference)getDataAcceptedResponseDataStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataAcceptedResponseDataStructure_DataAccepted() {
        return (EReference)getDataAcceptedResponseDataStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataAcceptedResponseDataStructure_ErrorCode() {
        return (EAttribute)getDataAcceptedResponseDataStructure().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataAcceptedResponseDataStructure_ErrorInformation() {
        return (EReference)getDataAcceptedResponseDataStructure().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataAcceptedResponseStructure() {
		if (dataAcceptedResponseStructureEClass == null) {
			dataAcceptedResponseStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(9);
		}
		return dataAcceptedResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataAcceptedResponseStructure_DataAcceptedResponseData() {
        return (EReference)getDataAcceptedResponseStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataAcceptedResponseStructure_OperationErrorMessage() {
        return (EReference)getDataAcceptedResponseStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataVersionListStructure() {
		if (dataVersionListStructureEClass == null) {
			dataVersionListStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(10);
		}
		return dataVersionListStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataVersionListStructure_DataVersion() {
        return (EReference)getDataVersionListStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataVersionStructure() {
		if (dataVersionStructureEClass == null) {
			dataVersionStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(11);
		}
		return dataVersionStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataVersionStructure_DataType() {
        return (EReference)getDataVersionStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataVersionStructure_VersionRef() {
        return (EReference)getDataVersionStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDegreeType() {
		if (degreeTypeEClass == null) {
			degreeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(12);
		}
		return degreeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDegreeType_Degree() {
        return (EReference)getDegreeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDegreeType_Orientation() {
        return (EReference)getDegreeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDestinationStructure() {
		if (destinationStructureEClass == null) {
			destinationStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(13);
		}
		return destinationStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDestinationStructure_DestinationRef() {
        return (EReference)getDestinationStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDestinationStructure_DestinationName() {
        return (EReference)getDestinationStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDestinationStructure_DestinationShortName() {
        return (EReference)getDestinationStructure().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceInformationStructure() {
		if (deviceInformationStructureEClass == null) {
			deviceInformationStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(14);
		}
		return deviceInformationStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceInformationStructure_DeviceName() {
        return (EReference)getDeviceInformationStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceInformationStructure_Manufacturer() {
        return (EReference)getDeviceInformationStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceInformationStructure_SerialNumber() {
        return (EReference)getDeviceInformationStructure().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceInformationStructure_DeviceClass() {
        return (EAttribute)getDeviceInformationStructure().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceInformationStructure_DataVersionList() {
        return (EReference)getDeviceInformationStructure().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceInformationStructure_WebInterfaceAddress() {
        return (EReference)getDeviceInformationStructure().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceSpecificationListStructure() {
		if (deviceSpecificationListStructureEClass == null) {
			deviceSpecificationListStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(15);
		}
		return deviceSpecificationListStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceSpecificationListStructure_DeviceSpecification() {
        return (EReference)getDeviceSpecificationListStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceSpecificationStructure() {
		if (deviceSpecificationStructureEClass == null) {
			deviceSpecificationStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(16);
		}
		return deviceSpecificationStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceSpecificationStructure_DeviceClass() {
        return (EAttribute)getDeviceSpecificationStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceSpecificationStructure_DeviceID() {
        return (EReference)getDeviceSpecificationStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceSpecificationWithStateListStructure() {
		if (deviceSpecificationWithStateListStructureEClass == null) {
			deviceSpecificationWithStateListStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(17);
		}
		return deviceSpecificationWithStateListStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceSpecificationWithStateListStructure_DeviceSpecificationWithState() {
        return (EReference)getDeviceSpecificationWithStateListStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceSpecificationWithStateStructure() {
		if (deviceSpecificationWithStateStructureEClass == null) {
			deviceSpecificationWithStateStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(18);
		}
		return deviceSpecificationWithStateStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceSpecificationWithStateStructure_DeviceSpecification() {
        return (EReference)getDeviceSpecificationWithStateStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceSpecificationWithStateStructure_DeviceState() {
        return (EAttribute)getDeviceSpecificationWithStateStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDisplayContentStructure() {
		if (displayContentStructureEClass == null) {
			displayContentStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(19);
		}
		return displayContentStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContentStructure_DisplayContentRef() {
        return (EReference)getDisplayContentStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContentStructure_LineInformation() {
        return (EReference)getDisplayContentStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContentStructure_Destination() {
        return (EReference)getDisplayContentStructure().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContentStructure_ViaPoint() {
        return (EReference)getDisplayContentStructure().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContentStructure_AdditionalInformation() {
        return (EReference)getDisplayContentStructure().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContentStructure_AdditionalInformation1() {
        return (EReference)getDisplayContentStructure().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContentStructure_AdditionalInformation2() {
        return (EReference)getDisplayContentStructure().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContentStructure_AdditionalInformation3() {
        return (EReference)getDisplayContentStructure().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContentStructure_AdditionalInformation4() {
        return (EReference)getDisplayContentStructure().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContentStructure_AdditionalInformation5() {
        return (EReference)getDisplayContentStructure().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContentStructure_AdditionalInformation6() {
        return (EReference)getDisplayContentStructure().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContentStructure_AdditionalInformation7() {
        return (EReference)getDisplayContentStructure().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContentStructure_AdditionalInformation8() {
        return (EReference)getDisplayContentStructure().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContentStructure_AdditionalInformation9() {
        return (EReference)getDisplayContentStructure().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContentStructure_RunNumber() {
        return (EReference)getDisplayContentStructure().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContentStructure_Priority() {
        return (EReference)getDisplayContentStructure().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContentStructure_PeriodDuration() {
        return (EReference)getDisplayContentStructure().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayContentStructure_Duration() {
        return (EReference)getDisplayContentStructure().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentRoot() {
		if (documentRootEClass == null) {
			documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(20);
		}
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_AirSubmode() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_BusSubmode() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_CoachSubmode() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DataAcceptedResponse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_FunicularSubmode() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_MetroSubmode() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_RailSubmode() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_SelfDriveSubmode() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_SubscribeRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_SubscribeResponse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_TaxiSubmode() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_TelecabinSubmode() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_TramSubmode() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_UnsubscribeRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_UnsubscribeResponse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_WaterSubmode() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDoorCountingListStructure() {
		if (doorCountingListStructureEClass == null) {
			doorCountingListStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(21);
		}
		return doorCountingListStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoorCountingListStructure_DoorID() {
        return (EReference)getDoorCountingListStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoorCountingListStructure_CountSet() {
        return (EReference)getDoorCountingListStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDoorCountingStructure() {
		if (doorCountingStructureEClass == null) {
			doorCountingStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(22);
		}
		return doorCountingStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoorCountingStructure_ObjectClass() {
        return (EAttribute)getDoorCountingStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoorCountingStructure_In() {
        return (EReference)getDoorCountingStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoorCountingStructure_Out() {
        return (EReference)getDoorCountingStructure().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoorCountingStructure_CountQuality() {
        return (EAttribute)getDoorCountingStructure().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDoorInformationStructure() {
		if (doorInformationStructureEClass == null) {
			doorInformationStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(23);
		}
		return doorInformationStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoorInformationStructure_DoorID() {
        return (EReference)getDoorInformationStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoorInformationStructure_Count() {
        return (EReference)getDoorInformationStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoorInformationStructure_State() {
        return (EReference)getDoorInformationStructure().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDoorOpenStateStructure() {
		if (doorOpenStateStructureEClass == null) {
			doorOpenStateStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(24);
		}
		return doorOpenStateStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoorOpenStateStructure_Value() {
        return (EAttribute)getDoorOpenStateStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoorOpenStateStructure_ErrorCode() {
        return (EAttribute)getDoorOpenStateStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDoorOperationStateStructure() {
		if (doorOperationStateStructureEClass == null) {
			doorOperationStateStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(25);
		}
		return doorOperationStateStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoorOperationStateStructure_Value() {
        return (EAttribute)getDoorOperationStateStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoorOperationStateStructure_ErrorCode() {
        return (EAttribute)getDoorOperationStateStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDoorStateStructure() {
		if (doorStateStructureEClass == null) {
			doorStateStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(26);
		}
		return doorStateStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoorStateStructure_OpenState() {
        return (EReference)getDoorStateStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoorStateStructure_OperationState() {
        return (EReference)getDoorStateStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFareZoneInformationStructure() {
		if (fareZoneInformationStructureEClass == null) {
			fareZoneInformationStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(27);
		}
		return fareZoneInformationStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFareZoneInformationStructure_FareZoneID() {
        return (EReference)getFareZoneInformationStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFareZoneInformationStructure_FareZoneType() {
        return (EReference)getFareZoneInformationStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFareZoneInformationStructure_FareZoneLongName() {
        return (EReference)getFareZoneInformationStructure().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFareZoneInformationStructure_FareZoneShortName() {
        return (EReference)getFareZoneInformationStructure().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlobalCardStatus() {
		if (globalCardStatusEClass == null) {
			globalCardStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(28);
		}
		return globalCardStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlobalCardStatus_GlobalCardStausID() {
        return (EReference)getGlobalCardStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlobalCardStatus_GlobalCardStatusText() {
        return (EReference)getGlobalCardStatus().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGNSSCoordinateStructure() {
		if (gnssCoordinateStructureEClass == null) {
			gnssCoordinateStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(29);
		}
		return gnssCoordinateStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSCoordinateStructure_Degree() {
        return (EReference)getGNSSCoordinateStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSCoordinateStructure_Direction() {
        return (EReference)getGNSSCoordinateStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGNSSPointStructure() {
		if (gnssPointStructureEClass == null) {
			gnssPointStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(30);
		}
		return gnssPointStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSPointStructure_PointRef() {
        return (EReference)getGNSSPointStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSPointStructure_Longitude() {
        return (EReference)getGNSSPointStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSPointStructure_Latitude() {
        return (EReference)getGNSSPointStructure().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGNSSPointStructure_Altitude() {
        return (EReference)getGNSSPointStructure().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIBISIPAnyURI() {
		if (ibisipAnyURIEClass == null) {
			ibisipAnyURIEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(31);
		}
		return ibisipAnyURIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPAnyURI_Value() {
        return (EAttribute)getIBISIPAnyURI().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPAnyURI_ErrorCode() {
        return (EAttribute)getIBISIPAnyURI().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIBISIPBoolean() {
		if (ibisipBooleanEClass == null) {
			ibisipBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(32);
		}
		return ibisipBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPBoolean_Value() {
        return (EAttribute)getIBISIPBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPBoolean_ErrorCode() {
        return (EAttribute)getIBISIPBoolean().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIBISIPByte() {
		if (ibisipByteEClass == null) {
			ibisipByteEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(33);
		}
		return ibisipByteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPByte_Value() {
        return (EAttribute)getIBISIPByte().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPByte_ErrorCode() {
        return (EAttribute)getIBISIPByte().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIBISIPDate() {
		if (ibisipDateEClass == null) {
			ibisipDateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(34);
		}
		return ibisipDateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPDate_Value() {
        return (EAttribute)getIBISIPDate().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPDate_ErrorCode() {
        return (EAttribute)getIBISIPDate().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIBISIPDateTime() {
		if (ibisipDateTimeEClass == null) {
			ibisipDateTimeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(35);
		}
		return ibisipDateTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPDateTime_Value() {
        return (EAttribute)getIBISIPDateTime().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPDateTime_ErrorCode() {
        return (EAttribute)getIBISIPDateTime().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIBISIPDouble() {
		if (ibisipDoubleEClass == null) {
			ibisipDoubleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(36);
		}
		return ibisipDoubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPDouble_Value() {
        return (EAttribute)getIBISIPDouble().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPDouble_ErrorCode() {
        return (EAttribute)getIBISIPDouble().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIBISIPDuration() {
		if (ibisipDurationEClass == null) {
			ibisipDurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(37);
		}
		return ibisipDurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPDuration_Value() {
        return (EAttribute)getIBISIPDuration().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPDuration_ErrorCode() {
        return (EAttribute)getIBISIPDuration().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIBISIPInt() {
		if (ibisipIntEClass == null) {
			ibisipIntEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(38);
		}
		return ibisipIntEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPInt_Value() {
        return (EAttribute)getIBISIPInt().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPInt_ErrorCode() {
        return (EAttribute)getIBISIPInt().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIBISIPLanguage() {
		if (ibisipLanguageEClass == null) {
			ibisipLanguageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(39);
		}
		return ibisipLanguageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPLanguage_Value() {
        return (EAttribute)getIBISIPLanguage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPLanguage_ErrorCode() {
        return (EAttribute)getIBISIPLanguage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIBISIPNMTOKEN() {
		if (ibisipnmtokenEClass == null) {
			ibisipnmtokenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(40);
		}
		return ibisipnmtokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPNMTOKEN_Value() {
        return (EAttribute)getIBISIPNMTOKEN().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPNMTOKEN_ErrorCode() {
        return (EAttribute)getIBISIPNMTOKEN().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIBISIPNonNegativeInteger() {
		if (ibisipNonNegativeIntegerEClass == null) {
			ibisipNonNegativeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(41);
		}
		return ibisipNonNegativeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPNonNegativeInteger_Value() {
        return (EAttribute)getIBISIPNonNegativeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPNonNegativeInteger_ErrorCode() {
        return (EAttribute)getIBISIPNonNegativeInteger().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIBISIPNormalizedString() {
		if (ibisipNormalizedStringEClass == null) {
			ibisipNormalizedStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(42);
		}
		return ibisipNormalizedStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPNormalizedString_Value() {
        return (EAttribute)getIBISIPNormalizedString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPNormalizedString_ErrorCode() {
        return (EAttribute)getIBISIPNormalizedString().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIBISIPString() {
		if (ibisipStringEClass == null) {
			ibisipStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(43);
		}
		return ibisipStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPString_Value() {
        return (EAttribute)getIBISIPString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPString_ErrorCode() {
        return (EAttribute)getIBISIPString().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIBISIPTime() {
		if (ibisipTimeEClass == null) {
			ibisipTimeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(44);
		}
		return ibisipTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPTime_Value() {
        return (EAttribute)getIBISIPTime().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPTime_ErrorCode() {
        return (EAttribute)getIBISIPTime().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIBISIPUnsignedInt() {
		if (ibisipUnsignedIntEClass == null) {
			ibisipUnsignedIntEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(45);
		}
		return ibisipUnsignedIntEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPUnsignedInt_Value() {
        return (EAttribute)getIBISIPUnsignedInt().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPUnsignedInt_ErrorCode() {
        return (EAttribute)getIBISIPUnsignedInt().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIBISIPUnsignedLong() {
		if (ibisipUnsignedLongEClass == null) {
			ibisipUnsignedLongEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(46);
		}
		return ibisipUnsignedLongEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPUnsignedLong_Value() {
        return (EAttribute)getIBISIPUnsignedLong().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIBISIPUnsignedLong_ErrorCode() {
        return (EAttribute)getIBISIPUnsignedLong().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternationalTextType() {
		if (internationalTextTypeEClass == null) {
			internationalTextTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(47);
		}
		return internationalTextTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternationalTextType_Value() {
        return (EAttribute)getInternationalTextType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternationalTextType_Language() {
        return (EAttribute)getInternationalTextType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternationalTextType_ErrorCode() {
        return (EAttribute)getInternationalTextType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJourneyStopInformationStructure() {
		if (journeyStopInformationStructureEClass == null) {
			journeyStopInformationStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(48);
		}
		return journeyStopInformationStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourneyStopInformationStructure_StopRef() {
        return (EReference)getJourneyStopInformationStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourneyStopInformationStructure_StopName() {
        return (EReference)getJourneyStopInformationStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourneyStopInformationStructure_StopAlternativeName() {
        return (EReference)getJourneyStopInformationStructure().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourneyStopInformationStructure_Platform() {
        return (EReference)getJourneyStopInformationStructure().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourneyStopInformationStructure_DisplayContent() {
        return (EReference)getJourneyStopInformationStructure().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourneyStopInformationStructure_Announcement() {
        return (EReference)getJourneyStopInformationStructure().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourneyStopInformationStructure_ArrivalScheduled() {
        return (EReference)getJourneyStopInformationStructure().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourneyStopInformationStructure_DepartureScheduled() {
        return (EReference)getJourneyStopInformationStructure().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourneyStopInformationStructure_Connection() {
        return (EReference)getJourneyStopInformationStructure().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourneyStopInformationStructure_BayArea() {
        return (EReference)getJourneyStopInformationStructure().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourneyStopInformationStructure_GNSSPoint() {
        return (EReference)getJourneyStopInformationStructure().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourneyStopInformationStructure_FareZone() {
        return (EReference)getJourneyStopInformationStructure().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLineInformationStructure() {
		if (lineInformationStructureEClass == null) {
			lineInformationStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(49);
		}
		return lineInformationStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLineInformationStructure_LineRef() {
        return (EReference)getLineInformationStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLineInformationStructure_LineName() {
        return (EReference)getLineInformationStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLineInformationStructure_LineShortName() {
        return (EReference)getLineInformationStructure().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLineInformationStructure_LineNumber() {
        return (EReference)getLineInformationStructure().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLineInformationStructure_LineCode() {
        return (EReference)getLineInformationStructure().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogMessageStructure() {
		if (logMessageStructureEClass == null) {
			logMessageStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(50);
		}
		return logMessageStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogMessageStructure_MessageProvider() {
        return (EReference)getLogMessageStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogMessageStructure_Message() {
        return (EReference)getLogMessageStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMessageStructure() {
		if (messageStructureEClass == null) {
			messageStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(51);
		}
		return messageStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMessageStructure_MessageID() {
        return (EReference)getMessageStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMessageStructure_TimeStamp() {
        return (EReference)getMessageStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessageStructure_MessageType() {
        return (EAttribute)getMessageStructure().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMessageStructure_MessageText() {
        return (EReference)getMessageStructure().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetexMode() {
		if (netexModeEClass == null) {
			netexModeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(52);
		}
		return netexModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetexMode_PtMainMode() {
        return (EAttribute)getNetexMode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetexMode_PrivateMainMode() {
        return (EAttribute)getNetexMode().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetexMode_AirSubmode() {
        return (EAttribute)getNetexMode().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetexMode_BusSubmode() {
        return (EAttribute)getNetexMode().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetexMode_CoachSubmode() {
        return (EAttribute)getNetexMode().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetexMode_FunicularSubmode() {
        return (EAttribute)getNetexMode().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetexMode_MetroSubmode() {
        return (EAttribute)getNetexMode().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetexMode_TramSubmode() {
        return (EAttribute)getNetexMode().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetexMode_TelecabinSubmode() {
        return (EAttribute)getNetexMode().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetexMode_RailSubmode() {
        return (EAttribute)getNetexMode().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetexMode_WaterSubmode() {
        return (EAttribute)getNetexMode().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetexMode_TaxiSubmode() {
        return (EAttribute)getNetexMode().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetexMode_SelfDriveSubmode() {
        return (EAttribute)getNetexMode().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPointSequenceStructure() {
		if (pointSequenceStructureEClass == null) {
			pointSequenceStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(53);
		}
		return pointSequenceStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPointSequenceStructure_Point() {
        return (EReference)getPointSequenceStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPointStructure() {
		if (pointStructureEClass == null) {
			pointStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(54);
		}
		return pointStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPointStructure_PointIndex() {
        return (EReference)getPointStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPointStructure_PointType() {
        return (EReference)getPointStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPointStructure_DistanceToPreviousPoint() {
        return (EReference)getPointStructure().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPointTypeStructure() {
		if (pointTypeStructureEClass == null) {
			pointTypeStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(55);
		}
		return pointTypeStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPointTypeStructure_StopPoint() {
        return (EReference)getPointTypeStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPointTypeStructure_BeaconPoint() {
        return (EReference)getPointTypeStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPointTypeStructure_GNSSLocationPoint() {
        return (EReference)getPointTypeStructure().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPointTypeStructure_TimingPoint() {
        return (EReference)getPointTypeStructure().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPointTypeStructure_TSPPoint() {
        return (EReference)getPointTypeStructure().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceIdentificationStructure() {
		if (serviceIdentificationStructureEClass == null) {
			serviceIdentificationStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(56);
		}
		return serviceIdentificationStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceIdentificationStructure_Service() {
        return (EReference)getServiceIdentificationStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceIdentificationStructure_Device() {
        return (EReference)getServiceIdentificationStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceIdentificationWithStateListStructure() {
		if (serviceIdentificationWithStateListStructureEClass == null) {
			serviceIdentificationWithStateListStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(57);
		}
		return serviceIdentificationWithStateListStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceIdentificationWithStateListStructure_ServiceIdentificationWithState() {
        return (EReference)getServiceIdentificationWithStateListStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceIdentificationWithStateStructure() {
		if (serviceIdentificationWithStateStructureEClass == null) {
			serviceIdentificationWithStateStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(58);
		}
		return serviceIdentificationWithStateStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceIdentificationWithStateStructure_ServiceIdentification() {
        return (EReference)getServiceIdentificationWithStateStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceIdentificationWithStateStructure_ServiceState() {
        return (EAttribute)getServiceIdentificationWithStateStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceInformationListStructure() {
		if (serviceInformationListStructureEClass == null) {
			serviceInformationListStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(59);
		}
		return serviceInformationListStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceInformationListStructure_ServiceInformation() {
        return (EReference)getServiceInformationListStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceInformationStructure() {
		if (serviceInformationStructureEClass == null) {
			serviceInformationStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(60);
		}
		return serviceInformationStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceInformationStructure_Service() {
        return (EReference)getServiceInformationStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceInformationStructure_Autostart() {
        return (EReference)getServiceInformationStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceSpecificationStructure() {
		if (serviceSpecificationStructureEClass == null) {
			serviceSpecificationStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(61);
		}
		return serviceSpecificationStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceSpecificationStructure_ServiceName() {
        return (EAttribute)getServiceSpecificationStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceSpecificationStructure_IBISIPVersion() {
        return (EReference)getServiceSpecificationStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceSpecificationWithStateListStructure() {
		if (serviceSpecificationWithStateListStructureEClass == null) {
			serviceSpecificationWithStateListStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(62);
		}
		return serviceSpecificationWithStateListStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceSpecificationWithStateListStructure_ServiceSpecificationWithState() {
        return (EReference)getServiceSpecificationWithStateListStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceSpecificationWithStateStructure() {
		if (serviceSpecificationWithStateStructureEClass == null) {
			serviceSpecificationWithStateStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(63);
		}
		return serviceSpecificationWithStateStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceSpecificationWithStateStructure_ServiceSpecification() {
        return (EReference)getServiceSpecificationWithStateStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceSpecificationWithStateStructure_ServiceState() {
        return (EAttribute)getServiceSpecificationWithStateStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceStartListStructure() {
		if (serviceStartListStructureEClass == null) {
			serviceStartListStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(64);
		}
		return serviceStartListStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceStartListStructure_ServiceIdentification() {
        return (EReference)getServiceStartListStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceStartStructure() {
		if (serviceStartStructureEClass == null) {
			serviceStartStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(65);
		}
		return serviceStartStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceStartStructure_ServiceIdentification() {
        return (EReference)getServiceStartStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceStartStructure_Autostart() {
        return (EReference)getServiceStartStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShortTripStopListStructure() {
		if (shortTripStopListStructureEClass == null) {
			shortTripStopListStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(66);
		}
		return shortTripStopListStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShortTripStopListStructure_ShortTripStop() {
        return (EReference)getShortTripStopListStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShortTripStopStructure() {
		if (shortTripStopStructureEClass == null) {
			shortTripStopStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(67);
		}
		return shortTripStopStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShortTripStopStructure_JourneyStopInformation() {
        return (EReference)getShortTripStopStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShortTripStopStructure_FareZoneInformation() {
        return (EReference)getShortTripStopStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpecificPointStructure() {
		if (specificPointStructureEClass == null) {
			specificPointStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(68);
		}
		return specificPointStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpecificPointStructure_PointRef() {
        return (EReference)getSpecificPointStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpecificPointStructure_DistanceToPreviousPoint() {
        return (EReference)getSpecificPointStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStopInformationRequestStructure() {
		if (stopInformationRequestStructureEClass == null) {
			stopInformationRequestStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(69);
		}
		return stopInformationRequestStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationRequestStructure_StopIndex() {
        return (EReference)getStopInformationRequestStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationRequestStructure_StopRef() {
        return (EReference)getStopInformationRequestStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationRequestStructure_StopName() {
        return (EReference)getStopInformationRequestStructure().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationRequestStructure_DisplayContent() {
        return (EReference)getStopInformationRequestStructure().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationRequestStructure_StopAnnouncement() {
        return (EReference)getStopInformationRequestStructure().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationRequestStructure_ArrivalScheduled() {
        return (EReference)getStopInformationRequestStructure().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationRequestStructure_DepartureScheduled() {
        return (EReference)getStopInformationRequestStructure().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationRequestStructure_RecordedArrivalTime() {
        return (EReference)getStopInformationRequestStructure().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationRequestStructure_DistanceToNextStop() {
        return (EReference)getStopInformationRequestStructure().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationRequestStructure_Connection() {
        return (EReference)getStopInformationRequestStructure().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationRequestStructure_FareZone() {
        return (EReference)getStopInformationRequestStructure().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStopInformationStructure() {
		if (stopInformationStructureEClass == null) {
			stopInformationStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(70);
		}
		return stopInformationStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationStructure_StopIndex() {
        return (EReference)getStopInformationStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationStructure_StopRef() {
        return (EReference)getStopInformationStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationStructure_StopName() {
        return (EReference)getStopInformationStructure().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationStructure_StopAlternativeName() {
        return (EReference)getStopInformationStructure().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationStructure_Platform() {
        return (EReference)getStopInformationStructure().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationStructure_DisplayContent() {
        return (EReference)getStopInformationStructure().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationStructure_StopAnnouncement() {
        return (EReference)getStopInformationStructure().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationStructure_ArrivalScheduled() {
        return (EReference)getStopInformationStructure().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationStructure_ArrivalExpected() {
        return (EReference)getStopInformationStructure().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationStructure_DepartureScheduled() {
        return (EReference)getStopInformationStructure().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationStructure_DepartureExpected() {
        return (EReference)getStopInformationStructure().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationStructure_RecordedArrivalTime() {
        return (EReference)getStopInformationStructure().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationStructure_DistanceToNextStop() {
        return (EReference)getStopInformationStructure().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationStructure_Connection() {
        return (EReference)getStopInformationStructure().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopInformationStructure_FareZone() {
        return (EReference)getStopInformationStructure().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStopPointTariffInformationStructure() {
		if (stopPointTariffInformationStructureEClass == null) {
			stopPointTariffInformationStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(71);
		}
		return stopPointTariffInformationStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopPointTariffInformationStructure_JourneyStopInformation() {
        return (EReference)getStopPointTariffInformationStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopPointTariffInformationStructure_FareZoneInformation() {
        return (EReference)getStopPointTariffInformationStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStopSequenceStructure() {
		if (stopSequenceStructureEClass == null) {
			stopSequenceStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(72);
		}
		return stopSequenceStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStopSequenceStructure_StopPoint() {
        return (EReference)getStopSequenceStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubscribeRequestStructure() {
		if (subscribeRequestStructureEClass == null) {
			subscribeRequestStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(73);
		}
		return subscribeRequestStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubscribeRequestStructure_ClientIPAddress() {
        return (EReference)getSubscribeRequestStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubscribeRequestStructure_ReplyPort() {
        return (EReference)getSubscribeRequestStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubscribeRequestStructure_ReplyPath() {
        return (EReference)getSubscribeRequestStructure().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubscribeResponseStructure() {
		if (subscribeResponseStructureEClass == null) {
			subscribeResponseStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(74);
		}
		return subscribeResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubscribeResponseStructure_Active() {
        return (EReference)getSubscribeResponseStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubscribeResponseStructure_Heartbeat() {
        return (EReference)getSubscribeResponseStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubscribeResponseStructure_OperationErrorMessage() {
        return (EReference)getSubscribeResponseStructure().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimingPointStructure() {
		if (timingPointStructureEClass == null) {
			timingPointStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(75);
		}
		return timingPointStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimingPointStructure_TimingPointRef() {
        return (EReference)getTimingPointStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimingPointStructure_ScheduleTime() {
        return (EReference)getTimingPointStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimingPointStructure_GNSSPoint() {
        return (EReference)getTimingPointStructure().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTripInformationStructure() {
		if (tripInformationStructureEClass == null) {
			tripInformationStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(76);
		}
		return tripInformationStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformationStructure_TripRef() {
        return (EReference)getTripInformationStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformationStructure_StopSequence() {
        return (EReference)getTripInformationStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTripInformationStructure_LocationState() {
        return (EAttribute)getTripInformationStructure().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformationStructure_TimetableDelay() {
        return (EReference)getTripInformationStructure().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformationStructure_AdditionalTextMessage() {
        return (EReference)getTripInformationStructure().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformationStructure_AdditionalTextMessage1() {
        return (EReference)getTripInformationStructure().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformationStructure_AdditionalTextMessage2() {
        return (EReference)getTripInformationStructure().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformationStructure_AdditionalTextMessage3() {
        return (EReference)getTripInformationStructure().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformationStructure_AdditionalTextMessage4() {
        return (EReference)getTripInformationStructure().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformationStructure_AdditionalTextMessage5() {
        return (EReference)getTripInformationStructure().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformationStructure_AdditionalTextMessage6() {
        return (EReference)getTripInformationStructure().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformationStructure_AdditionalTextMessage7() {
        return (EReference)getTripInformationStructure().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformationStructure_AdditionalTextMessage8() {
        return (EReference)getTripInformationStructure().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformationStructure_AdditionalTextMessage9() {
        return (EReference)getTripInformationStructure().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformationStructure_AdditionalAnnouncement() {
        return (EReference)getTripInformationStructure().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTripInformationStructure_RouteDirection() {
        return (EAttribute)getTripInformationStructure().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformationStructure_RunNumber() {
        return (EReference)getTripInformationStructure().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformationStructure_PatternNumber() {
        return (EReference)getTripInformationStructure().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripInformationStructure_PathDestinationNumber() {
        return (EReference)getTripInformationStructure().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTripSequenceStructure() {
		if (tripSequenceStructureEClass == null) {
			tripSequenceStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(77);
		}
		return tripSequenceStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripSequenceStructure_TripRef() {
        return (EReference)getTripSequenceStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripSequenceStructure_TripIndex() {
        return (EReference)getTripSequenceStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripSequenceStructure_TripStart() {
        return (EReference)getTripSequenceStructure().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripSequenceStructure_CurrentStopIndex() {
        return (EReference)getTripSequenceStructure().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTripSequenceStructure_JourneyMode() {
        return (EAttribute)getTripSequenceStructure().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTripSequenceStructure_PointSequence() {
        return (EReference)getTripSequenceStructure().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTSPPointStructure() {
		if (tspPointStructureEClass == null) {
			tspPointStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(78);
		}
		return tspPointStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTSPPointStructure_TSPPointRef() {
        return (EReference)getTSPPointStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTSPPointStructure_TSPCode() {
        return (EReference)getTSPPointStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTSPPointStructure_ShortName() {
        return (EReference)getTSPPointStructure().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTSPPointStructure_Desciption() {
        return (EReference)getTSPPointStructure().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnsubscribeRequestStructure() {
		if (unsubscribeRequestStructureEClass == null) {
			unsubscribeRequestStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(79);
		}
		return unsubscribeRequestStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnsubscribeRequestStructure_ClientIPAddress() {
        return (EReference)getUnsubscribeRequestStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnsubscribeRequestStructure_ReplyPort() {
        return (EReference)getUnsubscribeRequestStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnsubscribeRequestStructure_ReplyPath() {
        return (EReference)getUnsubscribeRequestStructure().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnsubscribeResponseStructure() {
		if (unsubscribeResponseStructureEClass == null) {
			unsubscribeResponseStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(80);
		}
		return unsubscribeResponseStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnsubscribeResponseStructure_Active() {
        return (EReference)getUnsubscribeResponseStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnsubscribeResponseStructure_OperationErrorMessage() {
        return (EReference)getUnsubscribeResponseStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVehicleStructure() {
		if (vehicleStructureEClass == null) {
			vehicleStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(81);
		}
		return vehicleStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVehicleStructure_VehicleTypeRef() {
        return (EReference)getVehicleStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVehicleStructure_Name() {
        return (EReference)getVehicleStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getViaPointStructure() {
		if (viaPointStructureEClass == null) {
			viaPointStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(82);
		}
		return viaPointStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViaPointStructure_ViaPointRef() {
        return (EReference)getViaPointStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViaPointStructure_PlaceRef() {
        return (EReference)getViaPointStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViaPointStructure_PlaceName() {
        return (EReference)getViaPointStructure().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViaPointStructure_PlaceShortName() {
        return (EReference)getViaPointStructure().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViaPointStructure_ViaPointDisplayPriority() {
        return (EReference)getViaPointStructure().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZoneType() {
		if (zoneTypeEClass == null) {
			zoneTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(IbisCommonPackage.eNS_URI).getEClassifiers().get(83);
		}
		return zoneTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZoneType_FarezoneTypeID() {
        return (EReference)getZoneType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZoneType_FareZoneTypeName() {
        return (EReference)getZoneType().getEStructuralFeatures().get(1);
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
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("de.jena.mdo.ibis.common." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //IbisCommonPackageImpl
