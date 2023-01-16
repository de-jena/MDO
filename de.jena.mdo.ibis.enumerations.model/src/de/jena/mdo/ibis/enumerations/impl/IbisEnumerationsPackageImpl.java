/**
 */
package de.jena.mdo.ibis.enumerations.impl;

import de.jena.mdo.ibis.enumerations.AirSubmodeEnumeration;
import de.jena.mdo.ibis.enumerations.BusSubmodeEnumeration;
import de.jena.mdo.ibis.enumerations.CoachSubmodeEnumeration;
import de.jena.mdo.ibis.enumerations.ConnectionStateEnumeration;
import de.jena.mdo.ibis.enumerations.ConnectionTypeEnumeration;
import de.jena.mdo.ibis.enumerations.DataIntervalEnumeration;
import de.jena.mdo.ibis.enumerations.DeviceClassEnumeration;
import de.jena.mdo.ibis.enumerations.DeviceStateEnumeration;
import de.jena.mdo.ibis.enumerations.DeviceTaskEnumeration;
import de.jena.mdo.ibis.enumerations.DocumentRoot;
import de.jena.mdo.ibis.enumerations.DoorCountingObjectClassEnumeration;
import de.jena.mdo.ibis.enumerations.DoorCountingQualityEnumeration;
import de.jena.mdo.ibis.enumerations.DoorOpenStateEnumeration;
import de.jena.mdo.ibis.enumerations.DoorOperationStateEnumeration;
import de.jena.mdo.ibis.enumerations.ErrorCodeEnumeration;
import de.jena.mdo.ibis.enumerations.ExitSideEnumeration;
import de.jena.mdo.ibis.enumerations.FunicularSubmodeEnumeration;
import de.jena.mdo.ibis.enumerations.GNSSCoordinateSystemEnumeration;
import de.jena.mdo.ibis.enumerations.GNSSQualityEnumeration;
import de.jena.mdo.ibis.enumerations.GNSSTypeEnumeration;
import de.jena.mdo.ibis.enumerations.IbisEnumerationsFactory;
import de.jena.mdo.ibis.enumerations.IbisEnumerationsPackage;
import de.jena.mdo.ibis.enumerations.JourneyModeEnumeration;
import de.jena.mdo.ibis.enumerations.LocationStateEnumeration;
import de.jena.mdo.ibis.enumerations.MessageTypeEnumeration;
import de.jena.mdo.ibis.enumerations.MetroSubmodeEnumeration;
import de.jena.mdo.ibis.enumerations.PrivateSubModesEnumeration;
import de.jena.mdo.ibis.enumerations.PtSubModesEnumeration;
import de.jena.mdo.ibis.enumerations.RailSubmodeEnumeration;
import de.jena.mdo.ibis.enumerations.RouteDeviationEnumeration;
import de.jena.mdo.ibis.enumerations.RouteDirectionEnumeration;
import de.jena.mdo.ibis.enumerations.SelfDriveSubmodeEnumeration;
import de.jena.mdo.ibis.enumerations.ServiceNameEnumeration;
import de.jena.mdo.ibis.enumerations.ServiceStateEnumeration;
import de.jena.mdo.ibis.enumerations.SystemDocumentationInformationEnumeration;
import de.jena.mdo.ibis.enumerations.TaxiSubmodeEnumeration;
import de.jena.mdo.ibis.enumerations.TelecabinSubmodeEnumeration;
import de.jena.mdo.ibis.enumerations.TicketRazziaInformationEnumeration;
import de.jena.mdo.ibis.enumerations.TicketValidationEnumeration;
import de.jena.mdo.ibis.enumerations.TramSubmodeEnumeration;
import de.jena.mdo.ibis.enumerations.TripStateEnumeration;
import de.jena.mdo.ibis.enumerations.VehicleModeEnumeration;
import de.jena.mdo.ibis.enumerations.WaterSubmodeEnumeration;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IbisEnumerationsPackageImpl extends EPackageImpl implements IbisEnumerationsPackage {
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
	private EEnum airSubmodeEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum busSubmodeEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum coachSubmodeEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum connectionStateEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum connectionTypeEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataIntervalEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deviceClassEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deviceStateEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deviceTaskEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum doorCountingObjectClassEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum doorCountingQualityEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum doorOpenStateEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum doorOperationStateEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum errorCodeEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum exitSideEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum funicularSubmodeEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gnssCoordinateSystemEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gnssQualityEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gnssTypeEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum journeyModeEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum locationStateEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageTypeEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum metroSubmodeEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum privateSubModesEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ptSubModesEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum railSubmodeEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum routeDeviationEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum routeDirectionEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum selfDriveSubmodeEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serviceNameEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serviceStateEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum systemDocumentationInformationEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum taxiSubmodeEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum telecabinSubmodeEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ticketRazziaInformationEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ticketValidationEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tramSubmodeEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tripStateEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vehicleModeEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum waterSubmodeEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType airSubmodeEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType busSubmodeEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType coachSubmodeEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType connectionStateEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType connectionTypeEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dataIntervalEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType deviceClassEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType deviceStateEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType deviceTaskEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType doorCountingObjectClassEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType doorCountingQualityEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType doorOpenStateEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType doorOperationStateEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType errorCodeEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType exitSideEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType funicularSubmodeEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType gnssCoordinateSystemEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType gnssQualityEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType gnssTypeEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType journeyModeEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType locationStateEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType messageTypeEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType metroSubmodeEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType privateSubModesEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ptSubModesEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType railSubmodeEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType routeDeviationEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType routeDirectionEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType selfDriveSubmodeEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType serviceNameEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType serviceStateEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType systemDocumentationInformationEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType taxiSubmodeEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType telecabinSubmodeEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ticketRazziaInformationEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ticketValidationEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tramSubmodeEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tripStateEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType vehicleModeEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType waterSubmodeEnumerationObjectEDataType = null;

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
	 * @see de.jena.mdo.ibis.enumerations.IbisEnumerationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IbisEnumerationsPackageImpl() {
		super(eNS_URI, IbisEnumerationsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IbisEnumerationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IbisEnumerationsPackage init() {
		if (isInited) return (IbisEnumerationsPackage)EPackage.Registry.INSTANCE.getEPackage(IbisEnumerationsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredIbisEnumerationsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		IbisEnumerationsPackageImpl theIbisEnumerationsPackage = registeredIbisEnumerationsPackage instanceof IbisEnumerationsPackageImpl ? (IbisEnumerationsPackageImpl)registeredIbisEnumerationsPackage : new IbisEnumerationsPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theIbisEnumerationsPackage.createPackageContents();

		// Initialize created meta-data
		theIbisEnumerationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIbisEnumerationsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IbisEnumerationsPackage.eNS_URI, theIbisEnumerationsPackage);
		return theIbisEnumerationsPackage;
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
	public EAttribute getDocumentRoot_FunicularSubmode() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_MetroSubmode() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_RailSubmode() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_SelfDriveSubmode() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_TaxiSubmode() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_TelecabinSubmode() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_TramSubmode() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_WaterSubmode() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAirSubmodeEnumeration() {
		return airSubmodeEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBusSubmodeEnumeration() {
		return busSubmodeEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCoachSubmodeEnumeration() {
		return coachSubmodeEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getConnectionStateEnumeration() {
		return connectionStateEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getConnectionTypeEnumeration() {
		return connectionTypeEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDataIntervalEnumeration() {
		return dataIntervalEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDeviceClassEnumeration() {
		return deviceClassEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDeviceStateEnumeration() {
		return deviceStateEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDeviceTaskEnumeration() {
		return deviceTaskEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDoorCountingObjectClassEnumeration() {
		return doorCountingObjectClassEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDoorCountingQualityEnumeration() {
		return doorCountingQualityEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDoorOpenStateEnumeration() {
		return doorOpenStateEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDoorOperationStateEnumeration() {
		return doorOperationStateEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getErrorCodeEnumeration() {
		return errorCodeEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getExitSideEnumeration() {
		return exitSideEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFunicularSubmodeEnumeration() {
		return funicularSubmodeEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getGNSSCoordinateSystemEnumeration() {
		return gnssCoordinateSystemEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getGNSSQualityEnumeration() {
		return gnssQualityEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getGNSSTypeEnumeration() {
		return gnssTypeEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getJourneyModeEnumeration() {
		return journeyModeEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLocationStateEnumeration() {
		return locationStateEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMessageTypeEnumeration() {
		return messageTypeEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMetroSubmodeEnumeration() {
		return metroSubmodeEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPrivateSubModesEnumeration() {
		return privateSubModesEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPtSubModesEnumeration() {
		return ptSubModesEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRailSubmodeEnumeration() {
		return railSubmodeEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRouteDeviationEnumeration() {
		return routeDeviationEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRouteDirectionEnumeration() {
		return routeDirectionEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSelfDriveSubmodeEnumeration() {
		return selfDriveSubmodeEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getServiceNameEnumeration() {
		return serviceNameEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getServiceStateEnumeration() {
		return serviceStateEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSystemDocumentationInformationEnumeration() {
		return systemDocumentationInformationEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTaxiSubmodeEnumeration() {
		return taxiSubmodeEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTelecabinSubmodeEnumeration() {
		return telecabinSubmodeEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTicketRazziaInformationEnumeration() {
		return ticketRazziaInformationEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTicketValidationEnumeration() {
		return ticketValidationEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTramSubmodeEnumeration() {
		return tramSubmodeEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTripStateEnumeration() {
		return tripStateEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getVehicleModeEnumeration() {
		return vehicleModeEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getWaterSubmodeEnumeration() {
		return waterSubmodeEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAirSubmodeEnumerationObject() {
		return airSubmodeEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBusSubmodeEnumerationObject() {
		return busSubmodeEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCoachSubmodeEnumerationObject() {
		return coachSubmodeEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getConnectionStateEnumerationObject() {
		return connectionStateEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getConnectionTypeEnumerationObject() {
		return connectionTypeEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDataIntervalEnumerationObject() {
		return dataIntervalEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDeviceClassEnumerationObject() {
		return deviceClassEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDeviceStateEnumerationObject() {
		return deviceStateEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDeviceTaskEnumerationObject() {
		return deviceTaskEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDoorCountingObjectClassEnumerationObject() {
		return doorCountingObjectClassEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDoorCountingQualityEnumerationObject() {
		return doorCountingQualityEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDoorOpenStateEnumerationObject() {
		return doorOpenStateEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDoorOperationStateEnumerationObject() {
		return doorOperationStateEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getErrorCodeEnumerationObject() {
		return errorCodeEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getExitSideEnumerationObject() {
		return exitSideEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFunicularSubmodeEnumerationObject() {
		return funicularSubmodeEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getGNSSCoordinateSystemEnumerationObject() {
		return gnssCoordinateSystemEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getGNSSQualityEnumerationObject() {
		return gnssQualityEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getGNSSTypeEnumerationObject() {
		return gnssTypeEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getJourneyModeEnumerationObject() {
		return journeyModeEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLocationStateEnumerationObject() {
		return locationStateEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMessageTypeEnumerationObject() {
		return messageTypeEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMetroSubmodeEnumerationObject() {
		return metroSubmodeEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPrivateSubModesEnumerationObject() {
		return privateSubModesEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPtSubModesEnumerationObject() {
		return ptSubModesEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRailSubmodeEnumerationObject() {
		return railSubmodeEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRouteDeviationEnumerationObject() {
		return routeDeviationEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRouteDirectionEnumerationObject() {
		return routeDirectionEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSelfDriveSubmodeEnumerationObject() {
		return selfDriveSubmodeEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getServiceNameEnumerationObject() {
		return serviceNameEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getServiceStateEnumerationObject() {
		return serviceStateEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSystemDocumentationInformationEnumerationObject() {
		return systemDocumentationInformationEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTaxiSubmodeEnumerationObject() {
		return taxiSubmodeEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTelecabinSubmodeEnumerationObject() {
		return telecabinSubmodeEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTicketRazziaInformationEnumerationObject() {
		return ticketRazziaInformationEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTicketValidationEnumerationObject() {
		return ticketValidationEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTramSubmodeEnumerationObject() {
		return tramSubmodeEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTripStateEnumerationObject() {
		return tripStateEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getVehicleModeEnumerationObject() {
		return vehicleModeEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getWaterSubmodeEnumerationObject() {
		return waterSubmodeEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IbisEnumerationsFactory getIbisEnumerationsFactory() {
		return (IbisEnumerationsFactory)getEFactoryInstance();
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
		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__AIR_SUBMODE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__BUS_SUBMODE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__COACH_SUBMODE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__FUNICULAR_SUBMODE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__METRO_SUBMODE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__RAIL_SUBMODE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SELF_DRIVE_SUBMODE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TAXI_SUBMODE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TELECABIN_SUBMODE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TRAM_SUBMODE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__WATER_SUBMODE);

		// Create enums
		airSubmodeEnumerationEEnum = createEEnum(AIR_SUBMODE_ENUMERATION);
		busSubmodeEnumerationEEnum = createEEnum(BUS_SUBMODE_ENUMERATION);
		coachSubmodeEnumerationEEnum = createEEnum(COACH_SUBMODE_ENUMERATION);
		connectionStateEnumerationEEnum = createEEnum(CONNECTION_STATE_ENUMERATION);
		connectionTypeEnumerationEEnum = createEEnum(CONNECTION_TYPE_ENUMERATION);
		dataIntervalEnumerationEEnum = createEEnum(DATA_INTERVAL_ENUMERATION);
		deviceClassEnumerationEEnum = createEEnum(DEVICE_CLASS_ENUMERATION);
		deviceStateEnumerationEEnum = createEEnum(DEVICE_STATE_ENUMERATION);
		deviceTaskEnumerationEEnum = createEEnum(DEVICE_TASK_ENUMERATION);
		doorCountingObjectClassEnumerationEEnum = createEEnum(DOOR_COUNTING_OBJECT_CLASS_ENUMERATION);
		doorCountingQualityEnumerationEEnum = createEEnum(DOOR_COUNTING_QUALITY_ENUMERATION);
		doorOpenStateEnumerationEEnum = createEEnum(DOOR_OPEN_STATE_ENUMERATION);
		doorOperationStateEnumerationEEnum = createEEnum(DOOR_OPERATION_STATE_ENUMERATION);
		errorCodeEnumerationEEnum = createEEnum(ERROR_CODE_ENUMERATION);
		exitSideEnumerationEEnum = createEEnum(EXIT_SIDE_ENUMERATION);
		funicularSubmodeEnumerationEEnum = createEEnum(FUNICULAR_SUBMODE_ENUMERATION);
		gnssCoordinateSystemEnumerationEEnum = createEEnum(GNSS_COORDINATE_SYSTEM_ENUMERATION);
		gnssQualityEnumerationEEnum = createEEnum(GNSS_QUALITY_ENUMERATION);
		gnssTypeEnumerationEEnum = createEEnum(GNSS_TYPE_ENUMERATION);
		journeyModeEnumerationEEnum = createEEnum(JOURNEY_MODE_ENUMERATION);
		locationStateEnumerationEEnum = createEEnum(LOCATION_STATE_ENUMERATION);
		messageTypeEnumerationEEnum = createEEnum(MESSAGE_TYPE_ENUMERATION);
		metroSubmodeEnumerationEEnum = createEEnum(METRO_SUBMODE_ENUMERATION);
		privateSubModesEnumerationEEnum = createEEnum(PRIVATE_SUB_MODES_ENUMERATION);
		ptSubModesEnumerationEEnum = createEEnum(PT_SUB_MODES_ENUMERATION);
		railSubmodeEnumerationEEnum = createEEnum(RAIL_SUBMODE_ENUMERATION);
		routeDeviationEnumerationEEnum = createEEnum(ROUTE_DEVIATION_ENUMERATION);
		routeDirectionEnumerationEEnum = createEEnum(ROUTE_DIRECTION_ENUMERATION);
		selfDriveSubmodeEnumerationEEnum = createEEnum(SELF_DRIVE_SUBMODE_ENUMERATION);
		serviceNameEnumerationEEnum = createEEnum(SERVICE_NAME_ENUMERATION);
		serviceStateEnumerationEEnum = createEEnum(SERVICE_STATE_ENUMERATION);
		systemDocumentationInformationEnumerationEEnum = createEEnum(SYSTEM_DOCUMENTATION_INFORMATION_ENUMERATION);
		taxiSubmodeEnumerationEEnum = createEEnum(TAXI_SUBMODE_ENUMERATION);
		telecabinSubmodeEnumerationEEnum = createEEnum(TELECABIN_SUBMODE_ENUMERATION);
		ticketRazziaInformationEnumerationEEnum = createEEnum(TICKET_RAZZIA_INFORMATION_ENUMERATION);
		ticketValidationEnumerationEEnum = createEEnum(TICKET_VALIDATION_ENUMERATION);
		tramSubmodeEnumerationEEnum = createEEnum(TRAM_SUBMODE_ENUMERATION);
		tripStateEnumerationEEnum = createEEnum(TRIP_STATE_ENUMERATION);
		vehicleModeEnumerationEEnum = createEEnum(VEHICLE_MODE_ENUMERATION);
		waterSubmodeEnumerationEEnum = createEEnum(WATER_SUBMODE_ENUMERATION);

		// Create data types
		airSubmodeEnumerationObjectEDataType = createEDataType(AIR_SUBMODE_ENUMERATION_OBJECT);
		busSubmodeEnumerationObjectEDataType = createEDataType(BUS_SUBMODE_ENUMERATION_OBJECT);
		coachSubmodeEnumerationObjectEDataType = createEDataType(COACH_SUBMODE_ENUMERATION_OBJECT);
		connectionStateEnumerationObjectEDataType = createEDataType(CONNECTION_STATE_ENUMERATION_OBJECT);
		connectionTypeEnumerationObjectEDataType = createEDataType(CONNECTION_TYPE_ENUMERATION_OBJECT);
		dataIntervalEnumerationObjectEDataType = createEDataType(DATA_INTERVAL_ENUMERATION_OBJECT);
		deviceClassEnumerationObjectEDataType = createEDataType(DEVICE_CLASS_ENUMERATION_OBJECT);
		deviceStateEnumerationObjectEDataType = createEDataType(DEVICE_STATE_ENUMERATION_OBJECT);
		deviceTaskEnumerationObjectEDataType = createEDataType(DEVICE_TASK_ENUMERATION_OBJECT);
		doorCountingObjectClassEnumerationObjectEDataType = createEDataType(DOOR_COUNTING_OBJECT_CLASS_ENUMERATION_OBJECT);
		doorCountingQualityEnumerationObjectEDataType = createEDataType(DOOR_COUNTING_QUALITY_ENUMERATION_OBJECT);
		doorOpenStateEnumerationObjectEDataType = createEDataType(DOOR_OPEN_STATE_ENUMERATION_OBJECT);
		doorOperationStateEnumerationObjectEDataType = createEDataType(DOOR_OPERATION_STATE_ENUMERATION_OBJECT);
		errorCodeEnumerationObjectEDataType = createEDataType(ERROR_CODE_ENUMERATION_OBJECT);
		exitSideEnumerationObjectEDataType = createEDataType(EXIT_SIDE_ENUMERATION_OBJECT);
		funicularSubmodeEnumerationObjectEDataType = createEDataType(FUNICULAR_SUBMODE_ENUMERATION_OBJECT);
		gnssCoordinateSystemEnumerationObjectEDataType = createEDataType(GNSS_COORDINATE_SYSTEM_ENUMERATION_OBJECT);
		gnssQualityEnumerationObjectEDataType = createEDataType(GNSS_QUALITY_ENUMERATION_OBJECT);
		gnssTypeEnumerationObjectEDataType = createEDataType(GNSS_TYPE_ENUMERATION_OBJECT);
		journeyModeEnumerationObjectEDataType = createEDataType(JOURNEY_MODE_ENUMERATION_OBJECT);
		locationStateEnumerationObjectEDataType = createEDataType(LOCATION_STATE_ENUMERATION_OBJECT);
		messageTypeEnumerationObjectEDataType = createEDataType(MESSAGE_TYPE_ENUMERATION_OBJECT);
		metroSubmodeEnumerationObjectEDataType = createEDataType(METRO_SUBMODE_ENUMERATION_OBJECT);
		privateSubModesEnumerationObjectEDataType = createEDataType(PRIVATE_SUB_MODES_ENUMERATION_OBJECT);
		ptSubModesEnumerationObjectEDataType = createEDataType(PT_SUB_MODES_ENUMERATION_OBJECT);
		railSubmodeEnumerationObjectEDataType = createEDataType(RAIL_SUBMODE_ENUMERATION_OBJECT);
		routeDeviationEnumerationObjectEDataType = createEDataType(ROUTE_DEVIATION_ENUMERATION_OBJECT);
		routeDirectionEnumerationObjectEDataType = createEDataType(ROUTE_DIRECTION_ENUMERATION_OBJECT);
		selfDriveSubmodeEnumerationObjectEDataType = createEDataType(SELF_DRIVE_SUBMODE_ENUMERATION_OBJECT);
		serviceNameEnumerationObjectEDataType = createEDataType(SERVICE_NAME_ENUMERATION_OBJECT);
		serviceStateEnumerationObjectEDataType = createEDataType(SERVICE_STATE_ENUMERATION_OBJECT);
		systemDocumentationInformationEnumerationObjectEDataType = createEDataType(SYSTEM_DOCUMENTATION_INFORMATION_ENUMERATION_OBJECT);
		taxiSubmodeEnumerationObjectEDataType = createEDataType(TAXI_SUBMODE_ENUMERATION_OBJECT);
		telecabinSubmodeEnumerationObjectEDataType = createEDataType(TELECABIN_SUBMODE_ENUMERATION_OBJECT);
		ticketRazziaInformationEnumerationObjectEDataType = createEDataType(TICKET_RAZZIA_INFORMATION_ENUMERATION_OBJECT);
		ticketValidationEnumerationObjectEDataType = createEDataType(TICKET_VALIDATION_ENUMERATION_OBJECT);
		tramSubmodeEnumerationObjectEDataType = createEDataType(TRAM_SUBMODE_ENUMERATION_OBJECT);
		tripStateEnumerationObjectEDataType = createEDataType(TRIP_STATE_ENUMERATION_OBJECT);
		vehicleModeEnumerationObjectEDataType = createEDataType(VEHICLE_MODE_ENUMERATION_OBJECT);
		waterSubmodeEnumerationObjectEDataType = createEDataType(WATER_SUBMODE_ENUMERATION_OBJECT);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_AirSubmode(), this.getAirSubmodeEnumeration(), "airSubmode", "unknown", 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_BusSubmode(), this.getBusSubmodeEnumeration(), "busSubmode", "unknown", 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_CoachSubmode(), this.getCoachSubmodeEnumeration(), "coachSubmode", "unknown", 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_FunicularSubmode(), this.getFunicularSubmodeEnumeration(), "funicularSubmode", "unknown", 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_MetroSubmode(), this.getMetroSubmodeEnumeration(), "metroSubmode", "unknown", 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_RailSubmode(), this.getRailSubmodeEnumeration(), "railSubmode", "unknown", 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_SelfDriveSubmode(), this.getSelfDriveSubmodeEnumeration(), "selfDriveSubmode", "unknown", 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TaxiSubmode(), this.getTaxiSubmodeEnumeration(), "taxiSubmode", "unknown", 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TelecabinSubmode(), this.getTelecabinSubmodeEnumeration(), "telecabinSubmode", "unknown", 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TramSubmode(), this.getTramSubmodeEnumeration(), "tramSubmode", "unknown", 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_WaterSubmode(), this.getWaterSubmodeEnumeration(), "waterSubmode", "unknown", 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(airSubmodeEnumerationEEnum, AirSubmodeEnumeration.class, "AirSubmodeEnumeration");
		addEEnumLiteral(airSubmodeEnumerationEEnum, AirSubmodeEnumeration.UNKNOWN);
		addEEnumLiteral(airSubmodeEnumerationEEnum, AirSubmodeEnumeration.UNDEFINED);
		addEEnumLiteral(airSubmodeEnumerationEEnum, AirSubmodeEnumeration.INTERNATIONAL_FLIGHT);
		addEEnumLiteral(airSubmodeEnumerationEEnum, AirSubmodeEnumeration.DOMESTIC_FLIGHT);
		addEEnumLiteral(airSubmodeEnumerationEEnum, AirSubmodeEnumeration.INTERCONTINENTAL_FLIGHT);
		addEEnumLiteral(airSubmodeEnumerationEEnum, AirSubmodeEnumeration.DOMESTIC_SCHEDULED_FLIGHT);
		addEEnumLiteral(airSubmodeEnumerationEEnum, AirSubmodeEnumeration.SHUTTLE_FLIGHT);
		addEEnumLiteral(airSubmodeEnumerationEEnum, AirSubmodeEnumeration.INTERCONTINENTAL_CHARTER_FLIGHT);
		addEEnumLiteral(airSubmodeEnumerationEEnum, AirSubmodeEnumeration.INTERNATIONAL_CHARTER_FLIGHT);
		addEEnumLiteral(airSubmodeEnumerationEEnum, AirSubmodeEnumeration.ROUND_TRIP_CHARTER_FLIGHT);
		addEEnumLiteral(airSubmodeEnumerationEEnum, AirSubmodeEnumeration.SIGHTSEEING_FLIGHT);
		addEEnumLiteral(airSubmodeEnumerationEEnum, AirSubmodeEnumeration.HELICOPTER_SERVICE);
		addEEnumLiteral(airSubmodeEnumerationEEnum, AirSubmodeEnumeration.DOMESTIC_CHARTER_FLIGHT);
		addEEnumLiteral(airSubmodeEnumerationEEnum, AirSubmodeEnumeration.SCHENGEN_AREA_FLIGHT);
		addEEnumLiteral(airSubmodeEnumerationEEnum, AirSubmodeEnumeration.AIRSHIP_SERVICE);
		addEEnumLiteral(airSubmodeEnumerationEEnum, AirSubmodeEnumeration.SHORT_HAUL_INTERNATIONAL_FLIGHT);
		addEEnumLiteral(airSubmodeEnumerationEEnum, AirSubmodeEnumeration.CANAL_BARGE);

		initEEnum(busSubmodeEnumerationEEnum, BusSubmodeEnumeration.class, "BusSubmodeEnumeration");
		addEEnumLiteral(busSubmodeEnumerationEEnum, BusSubmodeEnumeration.UNKNOWN);
		addEEnumLiteral(busSubmodeEnumerationEEnum, BusSubmodeEnumeration.UNDEFINED);
		addEEnumLiteral(busSubmodeEnumerationEEnum, BusSubmodeEnumeration.LOCAL_BUS);
		addEEnumLiteral(busSubmodeEnumerationEEnum, BusSubmodeEnumeration.REGIONAL_BUS);
		addEEnumLiteral(busSubmodeEnumerationEEnum, BusSubmodeEnumeration.EXPRESS_BUS);
		addEEnumLiteral(busSubmodeEnumerationEEnum, BusSubmodeEnumeration.NIGHT_BUS);
		addEEnumLiteral(busSubmodeEnumerationEEnum, BusSubmodeEnumeration.POST_BUS);
		addEEnumLiteral(busSubmodeEnumerationEEnum, BusSubmodeEnumeration.SPECIAL_NEEDS_BUS);
		addEEnumLiteral(busSubmodeEnumerationEEnum, BusSubmodeEnumeration.MOBILITY_BUS);
		addEEnumLiteral(busSubmodeEnumerationEEnum, BusSubmodeEnumeration.MOBILITY_BUS_FOR_REGISTERED_DISABLED);
		addEEnumLiteral(busSubmodeEnumerationEEnum, BusSubmodeEnumeration.SIGHTSEEING_BUS);
		addEEnumLiteral(busSubmodeEnumerationEEnum, BusSubmodeEnumeration.SHUTTLE_BUS);
		addEEnumLiteral(busSubmodeEnumerationEEnum, BusSubmodeEnumeration.HIGH_FREQUENCY_BUS);
		addEEnumLiteral(busSubmodeEnumerationEEnum, BusSubmodeEnumeration.DEDICATED_LANE_BUS);
		addEEnumLiteral(busSubmodeEnumerationEEnum, BusSubmodeEnumeration.SCHOOL_BUS);
		addEEnumLiteral(busSubmodeEnumerationEEnum, BusSubmodeEnumeration.SCHOOL_AND_PUBLIC_SERVICE_BUS);
		addEEnumLiteral(busSubmodeEnumerationEEnum, BusSubmodeEnumeration.RAIL_REPLACEMENT_BUS);
		addEEnumLiteral(busSubmodeEnumerationEEnum, BusSubmodeEnumeration.DEMAND_AND_RESPONSE_BUS);
		addEEnumLiteral(busSubmodeEnumerationEEnum, BusSubmodeEnumeration.AIRPORT_LINK_BUS);

		initEEnum(coachSubmodeEnumerationEEnum, CoachSubmodeEnumeration.class, "CoachSubmodeEnumeration");
		addEEnumLiteral(coachSubmodeEnumerationEEnum, CoachSubmodeEnumeration.UNKNOWN);
		addEEnumLiteral(coachSubmodeEnumerationEEnum, CoachSubmodeEnumeration.UNDEFINED);
		addEEnumLiteral(coachSubmodeEnumerationEEnum, CoachSubmodeEnumeration.INTERNATIONAL_COACH);
		addEEnumLiteral(coachSubmodeEnumerationEEnum, CoachSubmodeEnumeration.NATIONAL_COACH);
		addEEnumLiteral(coachSubmodeEnumerationEEnum, CoachSubmodeEnumeration.SHUTTLE_COACH);
		addEEnumLiteral(coachSubmodeEnumerationEEnum, CoachSubmodeEnumeration.REGIONAL_COACH);
		addEEnumLiteral(coachSubmodeEnumerationEEnum, CoachSubmodeEnumeration.SPECIAL_COACH);
		addEEnumLiteral(coachSubmodeEnumerationEEnum, CoachSubmodeEnumeration.SCHOOL_COACH);
		addEEnumLiteral(coachSubmodeEnumerationEEnum, CoachSubmodeEnumeration.SIGHTSEEING_COACH);
		addEEnumLiteral(coachSubmodeEnumerationEEnum, CoachSubmodeEnumeration.TOURIST_COACH);
		addEEnumLiteral(coachSubmodeEnumerationEEnum, CoachSubmodeEnumeration.COMMUTER_COACH);

		initEEnum(connectionStateEnumerationEEnum, ConnectionStateEnumeration.class, "ConnectionStateEnumeration");
		addEEnumLiteral(connectionStateEnumerationEEnum, ConnectionStateEnumeration.CONNECTION_BROKEN);
		addEEnumLiteral(connectionStateEnumerationEEnum, ConnectionStateEnumeration.CONNECTION_OK);
		addEEnumLiteral(connectionStateEnumerationEEnum, ConnectionStateEnumeration.NO_INFORMATION_AVAILABLE);

		initEEnum(connectionTypeEnumerationEEnum, ConnectionTypeEnumeration.class, "ConnectionTypeEnumeration");
		addEEnumLiteral(connectionTypeEnumerationEEnum, ConnectionTypeEnumeration.INTERCHANGE);
		addEEnumLiteral(connectionTypeEnumerationEEnum, ConnectionTypeEnumeration.PROTECTED_CONNECTION);

		initEEnum(dataIntervalEnumerationEEnum, DataIntervalEnumeration.class, "DataIntervalEnumeration");
		addEEnumLiteral(dataIntervalEnumerationEEnum, DataIntervalEnumeration.DISTANCE_DATA);
		addEEnumLiteral(dataIntervalEnumerationEEnum, DataIntervalEnumeration.GNSS_DATA);
		addEEnumLiteral(dataIntervalEnumerationEEnum, DataIntervalEnumeration.HEARTBEAT);
		addEEnumLiteral(dataIntervalEnumerationEEnum, DataIntervalEnumeration.NETWORK_LOCATION_DATA);

		initEEnum(deviceClassEnumerationEEnum, DeviceClassEnumeration.class, "DeviceClassEnumeration");
		addEEnumLiteral(deviceClassEnumerationEEnum, DeviceClassEnumeration.ON_BOARD_UNIT);
		addEEnumLiteral(deviceClassEnumerationEEnum, DeviceClassEnumeration.SIDE_DISPLAY);
		addEEnumLiteral(deviceClassEnumerationEEnum, DeviceClassEnumeration.FRONT_DISPLAY);
		addEEnumLiteral(deviceClassEnumerationEEnum, DeviceClassEnumeration.INTERIOR_DISPLAY);
		addEEnumLiteral(deviceClassEnumerationEEnum, DeviceClassEnumeration.VALIDATOR);
		addEEnumLiteral(deviceClassEnumerationEEnum, DeviceClassEnumeration.TICKET_VENDING_MACHINE);
		addEEnumLiteral(deviceClassEnumerationEEnum, DeviceClassEnumeration.ANNOUNCEMENT_SYSTEM);
		addEEnumLiteral(deviceClassEnumerationEEnum, DeviceClassEnumeration.MMI);
		addEEnumLiteral(deviceClassEnumerationEEnum, DeviceClassEnumeration.VIDEO_SYSTEM);
		addEEnumLiteral(deviceClassEnumerationEEnum, DeviceClassEnumeration.APC);
		addEEnumLiteral(deviceClassEnumerationEEnum, DeviceClassEnumeration.MOBILE_INTERFACE);
		addEEnumLiteral(deviceClassEnumerationEEnum, DeviceClassEnumeration.OTHER);
		addEEnumLiteral(deviceClassEnumerationEEnum, DeviceClassEnumeration.TEST_DEVICE);
		addEEnumLiteral(deviceClassEnumerationEEnum, DeviceClassEnumeration.MULTI_FUNCTIONAL_DISPLAY);
		addEEnumLiteral(deviceClassEnumerationEEnum, DeviceClassEnumeration.COMBI_DEVICE);

		initEEnum(deviceStateEnumerationEEnum, DeviceStateEnumeration.class, "DeviceStateEnumeration");
		addEEnumLiteral(deviceStateEnumerationEEnum, DeviceStateEnumeration.DEFECTIVE);
		addEEnumLiteral(deviceStateEnumerationEEnum, DeviceStateEnumeration.WARNING);
		addEEnumLiteral(deviceStateEnumerationEEnum, DeviceStateEnumeration.NOTAVAILABLE);
		addEEnumLiteral(deviceStateEnumerationEEnum, DeviceStateEnumeration.RUNNING);
		addEEnumLiteral(deviceStateEnumerationEEnum, DeviceStateEnumeration.READY_FOR_SHUTDOWN);

		initEEnum(deviceTaskEnumerationEEnum, DeviceTaskEnumeration.class, "DeviceTaskEnumeration");
		addEEnumLiteral(deviceTaskEnumerationEEnum, DeviceTaskEnumeration.RESTART);
		addEEnumLiteral(deviceTaskEnumerationEEnum, DeviceTaskEnumeration.START_STANDBY);
		addEEnumLiteral(deviceTaskEnumerationEEnum, DeviceTaskEnumeration.STOP_STANDBY);

		initEEnum(doorCountingObjectClassEnumerationEEnum, DoorCountingObjectClassEnumeration.class, "DoorCountingObjectClassEnumeration");
		addEEnumLiteral(doorCountingObjectClassEnumerationEEnum, DoorCountingObjectClassEnumeration.ADULT);
		addEEnumLiteral(doorCountingObjectClassEnumerationEEnum, DoorCountingObjectClassEnumeration.CHILD);
		addEEnumLiteral(doorCountingObjectClassEnumerationEEnum, DoorCountingObjectClassEnumeration.BIKE);
		addEEnumLiteral(doorCountingObjectClassEnumerationEEnum, DoorCountingObjectClassEnumeration.WHEEL_CHAIR);
		addEEnumLiteral(doorCountingObjectClassEnumerationEEnum, DoorCountingObjectClassEnumeration.PRAM);
		addEEnumLiteral(doorCountingObjectClassEnumerationEEnum, DoorCountingObjectClassEnumeration.UNIDENTIFIED);
		addEEnumLiteral(doorCountingObjectClassEnumerationEEnum, DoorCountingObjectClassEnumeration.OTHER);

		initEEnum(doorCountingQualityEnumerationEEnum, DoorCountingQualityEnumeration.class, "DoorCountingQualityEnumeration");
		addEEnumLiteral(doorCountingQualityEnumerationEEnum, DoorCountingQualityEnumeration.DEFECT);
		addEEnumLiteral(doorCountingQualityEnumerationEEnum, DoorCountingQualityEnumeration.REGULAR);
		addEEnumLiteral(doorCountingQualityEnumerationEEnum, DoorCountingQualityEnumeration.SABOTAGE);
		addEEnumLiteral(doorCountingQualityEnumerationEEnum, DoorCountingQualityEnumeration.OTHER);

		initEEnum(doorOpenStateEnumerationEEnum, DoorOpenStateEnumeration.class, "DoorOpenStateEnumeration");
		addEEnumLiteral(doorOpenStateEnumerationEEnum, DoorOpenStateEnumeration.DOORS_OPEN);
		addEEnumLiteral(doorOpenStateEnumerationEEnum, DoorOpenStateEnumeration.ALL_DOORS_CLOSED);
		addEEnumLiteral(doorOpenStateEnumerationEEnum, DoorOpenStateEnumeration.SINGLE_DOOR_OPEN);
		addEEnumLiteral(doorOpenStateEnumerationEEnum, DoorOpenStateEnumeration.SINGLE_DOOR_CLOSED);

		initEEnum(doorOperationStateEnumerationEEnum, DoorOperationStateEnumeration.class, "DoorOperationStateEnumeration");
		addEEnumLiteral(doorOperationStateEnumerationEEnum, DoorOperationStateEnumeration.LOCKED);
		addEEnumLiteral(doorOperationStateEnumerationEEnum, DoorOperationStateEnumeration.NORMAL);
		addEEnumLiteral(doorOperationStateEnumerationEEnum, DoorOperationStateEnumeration.EMERGENCY_RELEASE);

		initEEnum(errorCodeEnumerationEEnum, ErrorCodeEnumeration.class, "ErrorCodeEnumeration");
		addEEnumLiteral(errorCodeEnumerationEEnum, ErrorCodeEnumeration.DATA_ESTIMATED);
		addEEnumLiteral(errorCodeEnumerationEEnum, ErrorCodeEnumeration.FAULT_DATA);
		addEEnumLiteral(errorCodeEnumerationEEnum, ErrorCodeEnumeration.NO_SCHEDULE_DATA_AVAILABLE);
		addEEnumLiteral(errorCodeEnumerationEEnum, ErrorCodeEnumeration.DEVICE_MISSING);
		addEEnumLiteral(errorCodeEnumerationEEnum, ErrorCodeEnumeration.NO_SERVICE_RESPONSE);
		addEEnumLiteral(errorCodeEnumerationEEnum, ErrorCodeEnumeration.IMPORTANT_DATA_NOT_AVAILABLE);
		addEEnumLiteral(errorCodeEnumerationEEnum, ErrorCodeEnumeration.DATA_NOT_VALID);
		addEEnumLiteral(errorCodeEnumerationEEnum, ErrorCodeEnumeration.OPERATION_NOT_SUPPORTED);

		initEEnum(exitSideEnumerationEEnum, ExitSideEnumeration.class, "ExitSideEnumeration");
		addEEnumLiteral(exitSideEnumerationEEnum, ExitSideEnumeration.BOTH);
		addEEnumLiteral(exitSideEnumerationEEnum, ExitSideEnumeration.LEFT);
		addEEnumLiteral(exitSideEnumerationEEnum, ExitSideEnumeration.RIGHT);
		addEEnumLiteral(exitSideEnumerationEEnum, ExitSideEnumeration.UNKNOWN);

		initEEnum(funicularSubmodeEnumerationEEnum, FunicularSubmodeEnumeration.class, "FunicularSubmodeEnumeration");
		addEEnumLiteral(funicularSubmodeEnumerationEEnum, FunicularSubmodeEnumeration.UNKNOWN);
		addEEnumLiteral(funicularSubmodeEnumerationEEnum, FunicularSubmodeEnumeration.FUNICULAR);
		addEEnumLiteral(funicularSubmodeEnumerationEEnum, FunicularSubmodeEnumeration.STREET_CABLE_CAR);
		addEEnumLiteral(funicularSubmodeEnumerationEEnum, FunicularSubmodeEnumeration.ALL_FUNICULAR_SERVICES);
		addEEnumLiteral(funicularSubmodeEnumerationEEnum, FunicularSubmodeEnumeration.UNDEFINED_FUNICULAR);

		initEEnum(gnssCoordinateSystemEnumerationEEnum, GNSSCoordinateSystemEnumeration.class, "GNSSCoordinateSystemEnumeration");
		addEEnumLiteral(gnssCoordinateSystemEnumerationEEnum, GNSSCoordinateSystemEnumeration.CH1903);
		addEEnumLiteral(gnssCoordinateSystemEnumerationEEnum, GNSSCoordinateSystemEnumeration.ETSR89);
		addEEnumLiteral(gnssCoordinateSystemEnumerationEEnum, GNSSCoordinateSystemEnumeration.IERS);
		addEEnumLiteral(gnssCoordinateSystemEnumerationEEnum, GNSSCoordinateSystemEnumeration.NAD27);
		addEEnumLiteral(gnssCoordinateSystemEnumerationEEnum, GNSSCoordinateSystemEnumeration.NAD83);
		addEEnumLiteral(gnssCoordinateSystemEnumerationEEnum, GNSSCoordinateSystemEnumeration.WGS84);
		addEEnumLiteral(gnssCoordinateSystemEnumerationEEnum, GNSSCoordinateSystemEnumeration.WGS72);
		addEEnumLiteral(gnssCoordinateSystemEnumerationEEnum, GNSSCoordinateSystemEnumeration.SGS85);
		addEEnumLiteral(gnssCoordinateSystemEnumerationEEnum, GNSSCoordinateSystemEnumeration.P90);

		initEEnum(gnssQualityEnumerationEEnum, GNSSQualityEnumeration.class, "GNSSQualityEnumeration");
		addEEnumLiteral(gnssQualityEnumerationEEnum, GNSSQualityEnumeration.DGPS);
		addEEnumLiteral(gnssQualityEnumerationEEnum, GNSSQualityEnumeration.ESTIMATED);
		addEEnumLiteral(gnssQualityEnumerationEEnum, GNSSQualityEnumeration.GPS);
		addEEnumLiteral(gnssQualityEnumerationEEnum, GNSSQualityEnumeration.NOT_VALID);
		addEEnumLiteral(gnssQualityEnumerationEEnum, GNSSQualityEnumeration.UNKNOWN);

		initEEnum(gnssTypeEnumerationEEnum, GNSSTypeEnumeration.class, "GNSSTypeEnumeration");
		addEEnumLiteral(gnssTypeEnumerationEEnum, GNSSTypeEnumeration.GPS);
		addEEnumLiteral(gnssTypeEnumerationEEnum, GNSSTypeEnumeration.GLONASS);
		addEEnumLiteral(gnssTypeEnumerationEEnum, GNSSTypeEnumeration.GALILEO);
		addEEnumLiteral(gnssTypeEnumerationEEnum, GNSSTypeEnumeration.BEIDOU);
		addEEnumLiteral(gnssTypeEnumerationEEnum, GNSSTypeEnumeration.IRNSS);
		addEEnumLiteral(gnssTypeEnumerationEEnum, GNSSTypeEnumeration.OTHER);
		addEEnumLiteral(gnssTypeEnumerationEEnum, GNSSTypeEnumeration.DEAD_RECKONING);
		addEEnumLiteral(gnssTypeEnumerationEEnum, GNSSTypeEnumeration.MIXED_GNSS_TYPES);

		initEEnum(journeyModeEnumerationEEnum, JourneyModeEnumeration.class, "JourneyModeEnumeration");
		addEEnumLiteral(journeyModeEnumerationEEnum, JourneyModeEnumeration.NO_TRIP);
		addEEnumLiteral(journeyModeEnumerationEEnum, JourneyModeEnumeration.ADDITIONAL_TRIP);
		addEEnumLiteral(journeyModeEnumerationEEnum, JourneyModeEnumeration.SERVICE_TRIP);

		initEEnum(locationStateEnumerationEEnum, LocationStateEnumeration.class, "LocationStateEnumeration");
		addEEnumLiteral(locationStateEnumerationEEnum, LocationStateEnumeration.AFTER_STOP);
		addEEnumLiteral(locationStateEnumerationEEnum, LocationStateEnumeration.AT_STOP);
		addEEnumLiteral(locationStateEnumerationEEnum, LocationStateEnumeration.BEFORE_STOP);
		addEEnumLiteral(locationStateEnumerationEEnum, LocationStateEnumeration.BETWEEN_STOP);

		initEEnum(messageTypeEnumerationEEnum, MessageTypeEnumeration.class, "MessageTypeEnumeration");
		addEEnumLiteral(messageTypeEnumerationEEnum, MessageTypeEnumeration.STATUS);
		addEEnumLiteral(messageTypeEnumerationEEnum, MessageTypeEnumeration.WARNING);
		addEEnumLiteral(messageTypeEnumerationEEnum, MessageTypeEnumeration.ERROR);

		initEEnum(metroSubmodeEnumerationEEnum, MetroSubmodeEnumeration.class, "MetroSubmodeEnumeration");
		addEEnumLiteral(metroSubmodeEnumerationEEnum, MetroSubmodeEnumeration.UNKNOWN);
		addEEnumLiteral(metroSubmodeEnumerationEEnum, MetroSubmodeEnumeration.UNDEFINED);
		addEEnumLiteral(metroSubmodeEnumerationEEnum, MetroSubmodeEnumeration.METRO);
		addEEnumLiteral(metroSubmodeEnumerationEEnum, MetroSubmodeEnumeration.TUBE);
		addEEnumLiteral(metroSubmodeEnumerationEEnum, MetroSubmodeEnumeration.URBAN_RAILWAY);

		initEEnum(privateSubModesEnumerationEEnum, PrivateSubModesEnumeration.class, "PrivateSubModesEnumeration");
		addEEnumLiteral(privateSubModesEnumerationEEnum, PrivateSubModesEnumeration.UNKNOWN);
		addEEnumLiteral(privateSubModesEnumerationEEnum, PrivateSubModesEnumeration.UNDEFINED);
		addEEnumLiteral(privateSubModesEnumerationEEnum, PrivateSubModesEnumeration.SELF_DRIVE_SUBMODE);
		addEEnumLiteral(privateSubModesEnumerationEEnum, PrivateSubModesEnumeration.TAXI_SUBMODE);

		initEEnum(ptSubModesEnumerationEEnum, PtSubModesEnumeration.class, "PtSubModesEnumeration");
		addEEnumLiteral(ptSubModesEnumerationEEnum, PtSubModesEnumeration.UNKNOWN);
		addEEnumLiteral(ptSubModesEnumerationEEnum, PtSubModesEnumeration.UNDEFINED);
		addEEnumLiteral(ptSubModesEnumerationEEnum, PtSubModesEnumeration.AIR_SUBMODE);
		addEEnumLiteral(ptSubModesEnumerationEEnum, PtSubModesEnumeration.BUS_SUBMODE);
		addEEnumLiteral(ptSubModesEnumerationEEnum, PtSubModesEnumeration.COACH_SUBMODE);
		addEEnumLiteral(ptSubModesEnumerationEEnum, PtSubModesEnumeration.FUNICULAR_SUBMODE);
		addEEnumLiteral(ptSubModesEnumerationEEnum, PtSubModesEnumeration.METRO_SUBMODE);
		addEEnumLiteral(ptSubModesEnumerationEEnum, PtSubModesEnumeration.TRAM_SUBMODE);
		addEEnumLiteral(ptSubModesEnumerationEEnum, PtSubModesEnumeration.TELECABIN_SUBMODE);
		addEEnumLiteral(ptSubModesEnumerationEEnum, PtSubModesEnumeration.RAIL_SUBMODE);
		addEEnumLiteral(ptSubModesEnumerationEEnum, PtSubModesEnumeration.WATER_SUBMODE);

		initEEnum(railSubmodeEnumerationEEnum, RailSubmodeEnumeration.class, "RailSubmodeEnumeration");
		addEEnumLiteral(railSubmodeEnumerationEEnum, RailSubmodeEnumeration.UNKNOWN);
		addEEnumLiteral(railSubmodeEnumerationEEnum, RailSubmodeEnumeration.LOCAL);
		addEEnumLiteral(railSubmodeEnumerationEEnum, RailSubmodeEnumeration.HIGH_SPEED_RAIL);
		addEEnumLiteral(railSubmodeEnumerationEEnum, RailSubmodeEnumeration.SUBURBAN_RAILWAY);
		addEEnumLiteral(railSubmodeEnumerationEEnum, RailSubmodeEnumeration.REGIONAL_RAIL);
		addEEnumLiteral(railSubmodeEnumerationEEnum, RailSubmodeEnumeration.INTERREGIONAL_RAIL);
		addEEnumLiteral(railSubmodeEnumerationEEnum, RailSubmodeEnumeration.LONG_DISTANCE);
		addEEnumLiteral(railSubmodeEnumerationEEnum, RailSubmodeEnumeration.INTERNATIONAL);
		addEEnumLiteral(railSubmodeEnumerationEEnum, RailSubmodeEnumeration.SLEEPER_RAIL_SERVICE);
		addEEnumLiteral(railSubmodeEnumerationEEnum, RailSubmodeEnumeration.NIGHT_RAIL);
		addEEnumLiteral(railSubmodeEnumerationEEnum, RailSubmodeEnumeration.CAR_TRANSPORT_RAIL_SERVICE);
		addEEnumLiteral(railSubmodeEnumerationEEnum, RailSubmodeEnumeration.TOURIST_RAILWAY);
		addEEnumLiteral(railSubmodeEnumerationEEnum, RailSubmodeEnumeration.AIRPORT_LINK_RAIL);
		addEEnumLiteral(railSubmodeEnumerationEEnum, RailSubmodeEnumeration.RAIL_SHUTTLE);
		addEEnumLiteral(railSubmodeEnumerationEEnum, RailSubmodeEnumeration.REPLACEMENT_RAIL_SERVICE);
		addEEnumLiteral(railSubmodeEnumerationEEnum, RailSubmodeEnumeration.SPECIAL_TRAIN);
		addEEnumLiteral(railSubmodeEnumerationEEnum, RailSubmodeEnumeration.CROSS_COUNTRY_RAIL);
		addEEnumLiteral(railSubmodeEnumerationEEnum, RailSubmodeEnumeration.RACK_AND_PINION_RAILWAY);

		initEEnum(routeDeviationEnumerationEEnum, RouteDeviationEnumeration.class, "RouteDeviationEnumeration");
		addEEnumLiteral(routeDeviationEnumerationEEnum, RouteDeviationEnumeration.ONROUTE);
		addEEnumLiteral(routeDeviationEnumerationEEnum, RouteDeviationEnumeration.OFFROUTE);
		addEEnumLiteral(routeDeviationEnumerationEEnum, RouteDeviationEnumeration.UNKNOWN);

		initEEnum(routeDirectionEnumerationEEnum, RouteDirectionEnumeration.class, "RouteDirectionEnumeration");
		addEEnumLiteral(routeDirectionEnumerationEEnum, RouteDirectionEnumeration.FORWARD);
		addEEnumLiteral(routeDirectionEnumerationEEnum, RouteDirectionEnumeration.BACKWARD);
		addEEnumLiteral(routeDirectionEnumerationEEnum, RouteDirectionEnumeration.CLOCKWISE);
		addEEnumLiteral(routeDirectionEnumerationEEnum, RouteDirectionEnumeration.COUNTERCLOCKWISE);
		addEEnumLiteral(routeDirectionEnumerationEEnum, RouteDirectionEnumeration.OTHER);

		initEEnum(selfDriveSubmodeEnumerationEEnum, SelfDriveSubmodeEnumeration.class, "SelfDriveSubmodeEnumeration");
		addEEnumLiteral(selfDriveSubmodeEnumerationEEnum, SelfDriveSubmodeEnumeration.UNKNOWN);
		addEEnumLiteral(selfDriveSubmodeEnumerationEEnum, SelfDriveSubmodeEnumeration.UNDEFINED);
		addEEnumLiteral(selfDriveSubmodeEnumerationEEnum, SelfDriveSubmodeEnumeration.HIRE_CAR);
		addEEnumLiteral(selfDriveSubmodeEnumerationEEnum, SelfDriveSubmodeEnumeration.HIRE_VAN);
		addEEnumLiteral(selfDriveSubmodeEnumerationEEnum, SelfDriveSubmodeEnumeration.HIRE_MOTORBIKE);
		addEEnumLiteral(selfDriveSubmodeEnumerationEEnum, SelfDriveSubmodeEnumeration.HIRE_CYCLE);
		addEEnumLiteral(selfDriveSubmodeEnumerationEEnum, SelfDriveSubmodeEnumeration.ALL_HIRE_VEHICLES);

		initEEnum(serviceNameEnumerationEEnum, ServiceNameEnumeration.class, "ServiceNameEnumeration");
		addEEnumLiteral(serviceNameEnumerationEEnum, ServiceNameEnumeration.CUSTOMER_INFORMATION_SERVICE);
		addEEnumLiteral(serviceNameEnumerationEEnum, ServiceNameEnumeration.DEVICE_MANAGEMENT_SERVICE);
		addEEnumLiteral(serviceNameEnumerationEEnum, ServiceNameEnumeration.JOURNEY_INFORMATION_SERVICE);
		addEEnumLiteral(serviceNameEnumerationEEnum, ServiceNameEnumeration.BEACON_LOCATION_SERVICE);
		addEEnumLiteral(serviceNameEnumerationEEnum, ServiceNameEnumeration.DISTANCE_LOCATION_SERVICE);
		addEEnumLiteral(serviceNameEnumerationEEnum, ServiceNameEnumeration.GNSS_LOCATION_SERVICE);
		addEEnumLiteral(serviceNameEnumerationEEnum, ServiceNameEnumeration.NETWORK_LOCATION_SERVICE);
		addEEnumLiteral(serviceNameEnumerationEEnum, ServiceNameEnumeration.PASSENGER_COUNTING_SERVICE);
		addEEnumLiteral(serviceNameEnumerationEEnum, ServiceNameEnumeration.TICKETING_SERVICE);
		addEEnumLiteral(serviceNameEnumerationEEnum, ServiceNameEnumeration.TIME_SERVICE);
		addEEnumLiteral(serviceNameEnumerationEEnum, ServiceNameEnumeration.TEST_SERVICE);
		addEEnumLiteral(serviceNameEnumerationEEnum, ServiceNameEnumeration.VIDEO_LIVE_SERVICE);
		addEEnumLiteral(serviceNameEnumerationEEnum, ServiceNameEnumeration.VIDEO_RECORDING_SERVICE);
		addEEnumLiteral(serviceNameEnumerationEEnum, ServiceNameEnumeration.VIDEO_DISPLAY_SERVICE);
		addEEnumLiteral(serviceNameEnumerationEEnum, ServiceNameEnumeration.DOOR_STATE_SERVICE);
		addEEnumLiteral(serviceNameEnumerationEEnum, ServiceNameEnumeration.TRAIN_SET_DATA_SERVICE);
		addEEnumLiteral(serviceNameEnumerationEEnum, ServiceNameEnumeration.TRAIN_SET_INFORMATION_SERVICE);
		addEEnumLiteral(serviceNameEnumerationEEnum, ServiceNameEnumeration.TRAIN_SET_MANAGEMENT_SERVICE);
		addEEnumLiteral(serviceNameEnumerationEEnum, ServiceNameEnumeration.TICKET_VALIDATION_SERVICE);
		addEEnumLiteral(serviceNameEnumerationEEnum, ServiceNameEnumeration.HTML_DISPLAY_SERVICE);
		addEEnumLiteral(serviceNameEnumerationEEnum, ServiceNameEnumeration.SYSTEM_MONITORING_SERVICE);

		initEEnum(serviceStateEnumerationEEnum, ServiceStateEnumeration.class, "ServiceStateEnumeration");
		addEEnumLiteral(serviceStateEnumerationEEnum, ServiceStateEnumeration.DEFECTIVE);
		addEEnumLiteral(serviceStateEnumerationEEnum, ServiceStateEnumeration.NOTRUNNING);
		addEEnumLiteral(serviceStateEnumerationEEnum, ServiceStateEnumeration.RUNNING);
		addEEnumLiteral(serviceStateEnumerationEEnum, ServiceStateEnumeration.STANDBY);
		addEEnumLiteral(serviceStateEnumerationEEnum, ServiceStateEnumeration.STARTING);

		initEEnum(systemDocumentationInformationEnumerationEEnum, SystemDocumentationInformationEnumeration.class, "SystemDocumentationInformationEnumeration");
		addEEnumLiteral(systemDocumentationInformationEnumerationEEnum, SystemDocumentationInformationEnumeration.ERROR_MESSAGE);
		addEEnumLiteral(systemDocumentationInformationEnumerationEEnum, SystemDocumentationInformationEnumeration.STATUS_MESSAGE);
		addEEnumLiteral(systemDocumentationInformationEnumerationEEnum, SystemDocumentationInformationEnumeration.WARNING_MESSAGE);
		addEEnumLiteral(systemDocumentationInformationEnumerationEEnum, SystemDocumentationInformationEnumeration.ALL);

		initEEnum(taxiSubmodeEnumerationEEnum, TaxiSubmodeEnumeration.class, "TaxiSubmodeEnumeration");
		addEEnumLiteral(taxiSubmodeEnumerationEEnum, TaxiSubmodeEnumeration.UNKNOWN);
		addEEnumLiteral(taxiSubmodeEnumerationEEnum, TaxiSubmodeEnumeration.UNDEFINED);
		addEEnumLiteral(taxiSubmodeEnumerationEEnum, TaxiSubmodeEnumeration.COMMUNAL_TAXI);
		addEEnumLiteral(taxiSubmodeEnumerationEEnum, TaxiSubmodeEnumeration.CHARTER_TAXI);
		addEEnumLiteral(taxiSubmodeEnumerationEEnum, TaxiSubmodeEnumeration.WATER_TAXI);
		addEEnumLiteral(taxiSubmodeEnumerationEEnum, TaxiSubmodeEnumeration.RAIL_TAXI);
		addEEnumLiteral(taxiSubmodeEnumerationEEnum, TaxiSubmodeEnumeration.BIKE_TAXI);
		addEEnumLiteral(taxiSubmodeEnumerationEEnum, TaxiSubmodeEnumeration.BLACK_CAB);
		addEEnumLiteral(taxiSubmodeEnumerationEEnum, TaxiSubmodeEnumeration.MINI_CAB);
		addEEnumLiteral(taxiSubmodeEnumerationEEnum, TaxiSubmodeEnumeration.ALL_TAXI_SERVICES);

		initEEnum(telecabinSubmodeEnumerationEEnum, TelecabinSubmodeEnumeration.class, "TelecabinSubmodeEnumeration");
		addEEnumLiteral(telecabinSubmodeEnumerationEEnum, TelecabinSubmodeEnumeration.UNKNOWN);
		addEEnumLiteral(telecabinSubmodeEnumerationEEnum, TelecabinSubmodeEnumeration.UNDEFINED);
		addEEnumLiteral(telecabinSubmodeEnumerationEEnum, TelecabinSubmodeEnumeration.TELECABIN);
		addEEnumLiteral(telecabinSubmodeEnumerationEEnum, TelecabinSubmodeEnumeration.CABLE_CAR);
		addEEnumLiteral(telecabinSubmodeEnumerationEEnum, TelecabinSubmodeEnumeration.LIFT);
		addEEnumLiteral(telecabinSubmodeEnumerationEEnum, TelecabinSubmodeEnumeration.CHAIR_LIFT);
		addEEnumLiteral(telecabinSubmodeEnumerationEEnum, TelecabinSubmodeEnumeration.DRAG_LIFT);
		addEEnumLiteral(telecabinSubmodeEnumerationEEnum, TelecabinSubmodeEnumeration.TELECABIN_LINK);

		initEEnum(ticketRazziaInformationEnumerationEEnum, TicketRazziaInformationEnumeration.class, "TicketRazziaInformationEnumeration");
		addEEnumLiteral(ticketRazziaInformationEnumerationEEnum, TicketRazziaInformationEnumeration.RAZZIA);
		addEEnumLiteral(ticketRazziaInformationEnumerationEEnum, TicketRazziaInformationEnumeration.NORAZZIA);

		initEEnum(ticketValidationEnumerationEEnum, TicketValidationEnumeration.class, "TicketValidationEnumeration");
		addEEnumLiteral(ticketValidationEnumerationEEnum, TicketValidationEnumeration.VALID);
		addEEnumLiteral(ticketValidationEnumerationEEnum, TicketValidationEnumeration.NOTVALID);
		addEEnumLiteral(ticketValidationEnumerationEEnum, TicketValidationEnumeration.NO_CARD);

		initEEnum(tramSubmodeEnumerationEEnum, TramSubmodeEnumeration.class, "TramSubmodeEnumeration");
		addEEnumLiteral(tramSubmodeEnumerationEEnum, TramSubmodeEnumeration.UNKNOWN);
		addEEnumLiteral(tramSubmodeEnumerationEEnum, TramSubmodeEnumeration.UNDEFINED);
		addEEnumLiteral(tramSubmodeEnumerationEEnum, TramSubmodeEnumeration.CITY_TRAM);
		addEEnumLiteral(tramSubmodeEnumerationEEnum, TramSubmodeEnumeration.LOCAL_TRAM);
		addEEnumLiteral(tramSubmodeEnumerationEEnum, TramSubmodeEnumeration.REGIONAL_TRAM);
		addEEnumLiteral(tramSubmodeEnumerationEEnum, TramSubmodeEnumeration.SIGHTSEEING_TRAM);
		addEEnumLiteral(tramSubmodeEnumerationEEnum, TramSubmodeEnumeration.SHUTTLE_TRAM);
		addEEnumLiteral(tramSubmodeEnumerationEEnum, TramSubmodeEnumeration.TRAIN_TRAM);

		initEEnum(tripStateEnumerationEEnum, TripStateEnumeration.class, "TripStateEnumeration");
		addEEnumLiteral(tripStateEnumerationEEnum, TripStateEnumeration.EMPTY_RUN);
		addEEnumLiteral(tripStateEnumerationEEnum, TripStateEnumeration.ON_TRIP);
		addEEnumLiteral(tripStateEnumerationEEnum, TripStateEnumeration.OFF_TRIP);
		addEEnumLiteral(tripStateEnumerationEEnum, TripStateEnumeration.TRIP_BREAK);
		addEEnumLiteral(tripStateEnumerationEEnum, TripStateEnumeration.OFF_DUTY);
		addEEnumLiteral(tripStateEnumerationEEnum, TripStateEnumeration.UNKNOWN);

		initEEnum(vehicleModeEnumerationEEnum, VehicleModeEnumeration.class, "VehicleModeEnumeration");
		addEEnumLiteral(vehicleModeEnumerationEEnum, VehicleModeEnumeration.AIR);
		addEEnumLiteral(vehicleModeEnumerationEEnum, VehicleModeEnumeration.BUS);
		addEEnumLiteral(vehicleModeEnumerationEEnum, VehicleModeEnumeration.COACH);
		addEEnumLiteral(vehicleModeEnumerationEEnum, VehicleModeEnumeration.FERRY);
		addEEnumLiteral(vehicleModeEnumerationEEnum, VehicleModeEnumeration.METRO);
		addEEnumLiteral(vehicleModeEnumerationEEnum, VehicleModeEnumeration.RAIL);
		addEEnumLiteral(vehicleModeEnumerationEEnum, VehicleModeEnumeration.TRAM);
		addEEnumLiteral(vehicleModeEnumerationEEnum, VehicleModeEnumeration.UNDERGROUND);

		initEEnum(waterSubmodeEnumerationEEnum, WaterSubmodeEnumeration.class, "WaterSubmodeEnumeration");
		addEEnumLiteral(waterSubmodeEnumerationEEnum, WaterSubmodeEnumeration.UNKNOWN);
		addEEnumLiteral(waterSubmodeEnumerationEEnum, WaterSubmodeEnumeration.UNDEFINED);
		addEEnumLiteral(waterSubmodeEnumerationEEnum, WaterSubmodeEnumeration.INTERNATIONAL_CAR_FERRY);
		addEEnumLiteral(waterSubmodeEnumerationEEnum, WaterSubmodeEnumeration.NATIONAL_CAR_FERRY);
		addEEnumLiteral(waterSubmodeEnumerationEEnum, WaterSubmodeEnumeration.REGIONAL_CAR_FERRY);
		addEEnumLiteral(waterSubmodeEnumerationEEnum, WaterSubmodeEnumeration.LOCAL_CAR_FERRY);
		addEEnumLiteral(waterSubmodeEnumerationEEnum, WaterSubmodeEnumeration.INTERNATIONAL_PASSENGER_FERRY);
		addEEnumLiteral(waterSubmodeEnumerationEEnum, WaterSubmodeEnumeration.NATIONAL_PASSENGER_FERRY);
		addEEnumLiteral(waterSubmodeEnumerationEEnum, WaterSubmodeEnumeration.REGIONAL_PASSENGER_FERRY);
		addEEnumLiteral(waterSubmodeEnumerationEEnum, WaterSubmodeEnumeration.LOCAL_PASSENGER_FERRY);
		addEEnumLiteral(waterSubmodeEnumerationEEnum, WaterSubmodeEnumeration.POST_BOAT);
		addEEnumLiteral(waterSubmodeEnumerationEEnum, WaterSubmodeEnumeration.TRAIN_FERRY);
		addEEnumLiteral(waterSubmodeEnumerationEEnum, WaterSubmodeEnumeration.ROAD_FERRY_LINK);
		addEEnumLiteral(waterSubmodeEnumerationEEnum, WaterSubmodeEnumeration.AIRPORT_BOAT_LINK);
		addEEnumLiteral(waterSubmodeEnumerationEEnum, WaterSubmodeEnumeration.HIGH_SPEED_VEHICLE_SERVICE);
		addEEnumLiteral(waterSubmodeEnumerationEEnum, WaterSubmodeEnumeration.HIGH_SPEED_PASSENGER_SERVICE);
		addEEnumLiteral(waterSubmodeEnumerationEEnum, WaterSubmodeEnumeration.SIGHTSEEING_SERVICE);
		addEEnumLiteral(waterSubmodeEnumerationEEnum, WaterSubmodeEnumeration.SCHOOL_BOAT);
		addEEnumLiteral(waterSubmodeEnumerationEEnum, WaterSubmodeEnumeration.CABLE_FERRY);
		addEEnumLiteral(waterSubmodeEnumerationEEnum, WaterSubmodeEnumeration.RIVER_BUS);
		addEEnumLiteral(waterSubmodeEnumerationEEnum, WaterSubmodeEnumeration.SCHEDULED_FERRY);
		addEEnumLiteral(waterSubmodeEnumerationEEnum, WaterSubmodeEnumeration.SHUTTLE_FERRY_SERVICE);

		// Initialize data types
		initEDataType(airSubmodeEnumerationObjectEDataType, AirSubmodeEnumeration.class, "AirSubmodeEnumerationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(busSubmodeEnumerationObjectEDataType, BusSubmodeEnumeration.class, "BusSubmodeEnumerationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(coachSubmodeEnumerationObjectEDataType, CoachSubmodeEnumeration.class, "CoachSubmodeEnumerationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(connectionStateEnumerationObjectEDataType, ConnectionStateEnumeration.class, "ConnectionStateEnumerationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(connectionTypeEnumerationObjectEDataType, ConnectionTypeEnumeration.class, "ConnectionTypeEnumerationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dataIntervalEnumerationObjectEDataType, DataIntervalEnumeration.class, "DataIntervalEnumerationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(deviceClassEnumerationObjectEDataType, DeviceClassEnumeration.class, "DeviceClassEnumerationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(deviceStateEnumerationObjectEDataType, DeviceStateEnumeration.class, "DeviceStateEnumerationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(deviceTaskEnumerationObjectEDataType, DeviceTaskEnumeration.class, "DeviceTaskEnumerationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(doorCountingObjectClassEnumerationObjectEDataType, DoorCountingObjectClassEnumeration.class, "DoorCountingObjectClassEnumerationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(doorCountingQualityEnumerationObjectEDataType, DoorCountingQualityEnumeration.class, "DoorCountingQualityEnumerationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(doorOpenStateEnumerationObjectEDataType, DoorOpenStateEnumeration.class, "DoorOpenStateEnumerationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(doorOperationStateEnumerationObjectEDataType, DoorOperationStateEnumeration.class, "DoorOperationStateEnumerationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(errorCodeEnumerationObjectEDataType, ErrorCodeEnumeration.class, "ErrorCodeEnumerationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(exitSideEnumerationObjectEDataType, ExitSideEnumeration.class, "ExitSideEnumerationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(funicularSubmodeEnumerationObjectEDataType, FunicularSubmodeEnumeration.class, "FunicularSubmodeEnumerationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(gnssCoordinateSystemEnumerationObjectEDataType, GNSSCoordinateSystemEnumeration.class, "GNSSCoordinateSystemEnumerationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(gnssQualityEnumerationObjectEDataType, GNSSQualityEnumeration.class, "GNSSQualityEnumerationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(gnssTypeEnumerationObjectEDataType, GNSSTypeEnumeration.class, "GNSSTypeEnumerationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(journeyModeEnumerationObjectEDataType, JourneyModeEnumeration.class, "JourneyModeEnumerationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(locationStateEnumerationObjectEDataType, LocationStateEnumeration.class, "LocationStateEnumerationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(messageTypeEnumerationObjectEDataType, MessageTypeEnumeration.class, "MessageTypeEnumerationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(metroSubmodeEnumerationObjectEDataType, MetroSubmodeEnumeration.class, "MetroSubmodeEnumerationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(privateSubModesEnumerationObjectEDataType, PrivateSubModesEnumeration.class, "PrivateSubModesEnumerationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ptSubModesEnumerationObjectEDataType, PtSubModesEnumeration.class, "PtSubModesEnumerationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(railSubmodeEnumerationObjectEDataType, RailSubmodeEnumeration.class, "RailSubmodeEnumerationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(routeDeviationEnumerationObjectEDataType, RouteDeviationEnumeration.class, "RouteDeviationEnumerationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(routeDirectionEnumerationObjectEDataType, RouteDirectionEnumeration.class, "RouteDirectionEnumerationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(selfDriveSubmodeEnumerationObjectEDataType, SelfDriveSubmodeEnumeration.class, "SelfDriveSubmodeEnumerationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(serviceNameEnumerationObjectEDataType, ServiceNameEnumeration.class, "ServiceNameEnumerationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(serviceStateEnumerationObjectEDataType, ServiceStateEnumeration.class, "ServiceStateEnumerationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(systemDocumentationInformationEnumerationObjectEDataType, SystemDocumentationInformationEnumeration.class, "SystemDocumentationInformationEnumerationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(taxiSubmodeEnumerationObjectEDataType, TaxiSubmodeEnumeration.class, "TaxiSubmodeEnumerationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(telecabinSubmodeEnumerationObjectEDataType, TelecabinSubmodeEnumeration.class, "TelecabinSubmodeEnumerationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ticketRazziaInformationEnumerationObjectEDataType, TicketRazziaInformationEnumeration.class, "TicketRazziaInformationEnumerationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ticketValidationEnumerationObjectEDataType, TicketValidationEnumeration.class, "TicketValidationEnumerationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tramSubmodeEnumerationObjectEDataType, TramSubmodeEnumeration.class, "TramSubmodeEnumerationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tripStateEnumerationObjectEDataType, TripStateEnumeration.class, "TripStateEnumerationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(vehicleModeEnumerationObjectEDataType, VehicleModeEnumeration.class, "VehicleModeEnumerationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(waterSubmodeEnumerationObjectEDataType, WaterSubmodeEnumeration.class, "WaterSubmodeEnumerationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
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
		  (airSubmodeEnumerationEEnum,
		   source,
		   new String[] {
			   "name", "AirSubmodeEnumeration"
		   });
		addAnnotation
		  (airSubmodeEnumerationObjectEDataType,
		   source,
		   new String[] {
			   "name", "AirSubmodeEnumeration:Object",
			   "baseType", "AirSubmodeEnumeration"
		   });
		addAnnotation
		  (busSubmodeEnumerationEEnum,
		   source,
		   new String[] {
			   "name", "BusSubmodeEnumeration"
		   });
		addAnnotation
		  (busSubmodeEnumerationObjectEDataType,
		   source,
		   new String[] {
			   "name", "BusSubmodeEnumeration:Object",
			   "baseType", "BusSubmodeEnumeration"
		   });
		addAnnotation
		  (coachSubmodeEnumerationEEnum,
		   source,
		   new String[] {
			   "name", "CoachSubmodeEnumeration"
		   });
		addAnnotation
		  (coachSubmodeEnumerationObjectEDataType,
		   source,
		   new String[] {
			   "name", "CoachSubmodeEnumeration:Object",
			   "baseType", "CoachSubmodeEnumeration"
		   });
		addAnnotation
		  (connectionStateEnumerationEEnum,
		   source,
		   new String[] {
			   "name", "ConnectionStateEnumeration"
		   });
		addAnnotation
		  (connectionStateEnumerationObjectEDataType,
		   source,
		   new String[] {
			   "name", "ConnectionStateEnumeration:Object",
			   "baseType", "ConnectionStateEnumeration"
		   });
		addAnnotation
		  (connectionTypeEnumerationEEnum,
		   source,
		   new String[] {
			   "name", "ConnectionTypeEnumeration"
		   });
		addAnnotation
		  (connectionTypeEnumerationObjectEDataType,
		   source,
		   new String[] {
			   "name", "ConnectionTypeEnumeration:Object",
			   "baseType", "ConnectionTypeEnumeration"
		   });
		addAnnotation
		  (dataIntervalEnumerationEEnum,
		   source,
		   new String[] {
			   "name", "DataIntervalEnumeration"
		   });
		addAnnotation
		  (dataIntervalEnumerationObjectEDataType,
		   source,
		   new String[] {
			   "name", "DataIntervalEnumeration:Object",
			   "baseType", "DataIntervalEnumeration"
		   });
		addAnnotation
		  (deviceClassEnumerationEEnum,
		   source,
		   new String[] {
			   "name", "DeviceClassEnumeration"
		   });
		addAnnotation
		  (deviceClassEnumerationObjectEDataType,
		   source,
		   new String[] {
			   "name", "DeviceClassEnumeration:Object",
			   "baseType", "DeviceClassEnumeration"
		   });
		addAnnotation
		  (deviceStateEnumerationEEnum,
		   source,
		   new String[] {
			   "name", "DeviceStateEnumeration"
		   });
		addAnnotation
		  (deviceStateEnumerationObjectEDataType,
		   source,
		   new String[] {
			   "name", "DeviceStateEnumeration:Object",
			   "baseType", "DeviceStateEnumeration"
		   });
		addAnnotation
		  (deviceTaskEnumerationEEnum,
		   source,
		   new String[] {
			   "name", "DeviceTaskEnumeration"
		   });
		addAnnotation
		  (deviceTaskEnumerationObjectEDataType,
		   source,
		   new String[] {
			   "name", "DeviceTaskEnumeration:Object",
			   "baseType", "DeviceTaskEnumeration"
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
		  (getDocumentRoot_WaterSubmode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "WaterSubmode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (doorCountingObjectClassEnumerationEEnum,
		   source,
		   new String[] {
			   "name", "DoorCountingObjectClassEnumeration"
		   });
		addAnnotation
		  (doorCountingObjectClassEnumerationObjectEDataType,
		   source,
		   new String[] {
			   "name", "DoorCountingObjectClassEnumeration:Object",
			   "baseType", "DoorCountingObjectClassEnumeration"
		   });
		addAnnotation
		  (doorCountingQualityEnumerationEEnum,
		   source,
		   new String[] {
			   "name", "DoorCountingQualityEnumeration"
		   });
		addAnnotation
		  (doorCountingQualityEnumerationObjectEDataType,
		   source,
		   new String[] {
			   "name", "DoorCountingQualityEnumeration:Object",
			   "baseType", "DoorCountingQualityEnumeration"
		   });
		addAnnotation
		  (doorOpenStateEnumerationEEnum,
		   source,
		   new String[] {
			   "name", "DoorOpenStateEnumeration"
		   });
		addAnnotation
		  (doorOpenStateEnumerationObjectEDataType,
		   source,
		   new String[] {
			   "name", "DoorOpenStateEnumeration:Object",
			   "baseType", "DoorOpenStateEnumeration"
		   });
		addAnnotation
		  (doorOperationStateEnumerationEEnum,
		   source,
		   new String[] {
			   "name", "DoorOperationStateEnumeration"
		   });
		addAnnotation
		  (doorOperationStateEnumerationObjectEDataType,
		   source,
		   new String[] {
			   "name", "DoorOperationStateEnumeration:Object",
			   "baseType", "DoorOperationStateEnumeration"
		   });
		addAnnotation
		  (errorCodeEnumerationEEnum,
		   source,
		   new String[] {
			   "name", "ErrorCodeEnumeration"
		   });
		addAnnotation
		  (errorCodeEnumerationObjectEDataType,
		   source,
		   new String[] {
			   "name", "ErrorCodeEnumeration:Object",
			   "baseType", "ErrorCodeEnumeration"
		   });
		addAnnotation
		  (exitSideEnumerationEEnum,
		   source,
		   new String[] {
			   "name", "ExitSideEnumeration"
		   });
		addAnnotation
		  (exitSideEnumerationObjectEDataType,
		   source,
		   new String[] {
			   "name", "ExitSideEnumeration:Object",
			   "baseType", "ExitSideEnumeration"
		   });
		addAnnotation
		  (funicularSubmodeEnumerationEEnum,
		   source,
		   new String[] {
			   "name", "FunicularSubmodeEnumeration"
		   });
		addAnnotation
		  (funicularSubmodeEnumerationObjectEDataType,
		   source,
		   new String[] {
			   "name", "FunicularSubmodeEnumeration:Object",
			   "baseType", "FunicularSubmodeEnumeration"
		   });
		addAnnotation
		  (gnssCoordinateSystemEnumerationEEnum,
		   source,
		   new String[] {
			   "name", "GNSSCoordinateSystemEnumeration"
		   });
		addAnnotation
		  (gnssCoordinateSystemEnumerationObjectEDataType,
		   source,
		   new String[] {
			   "name", "GNSSCoordinateSystemEnumeration:Object",
			   "baseType", "GNSSCoordinateSystemEnumeration"
		   });
		addAnnotation
		  (gnssQualityEnumerationEEnum,
		   source,
		   new String[] {
			   "name", "GNSSQualityEnumeration"
		   });
		addAnnotation
		  (gnssQualityEnumerationObjectEDataType,
		   source,
		   new String[] {
			   "name", "GNSSQualityEnumeration:Object",
			   "baseType", "GNSSQualityEnumeration"
		   });
		addAnnotation
		  (gnssTypeEnumerationEEnum,
		   source,
		   new String[] {
			   "name", "GNSSTypeEnumeration"
		   });
		addAnnotation
		  (gnssTypeEnumerationObjectEDataType,
		   source,
		   new String[] {
			   "name", "GNSSTypeEnumeration:Object",
			   "baseType", "GNSSTypeEnumeration"
		   });
		addAnnotation
		  (journeyModeEnumerationEEnum,
		   source,
		   new String[] {
			   "name", "JourneyModeEnumeration"
		   });
		addAnnotation
		  (journeyModeEnumerationObjectEDataType,
		   source,
		   new String[] {
			   "name", "JourneyModeEnumeration:Object",
			   "baseType", "JourneyModeEnumeration"
		   });
		addAnnotation
		  (locationStateEnumerationEEnum,
		   source,
		   new String[] {
			   "name", "LocationStateEnumeration"
		   });
		addAnnotation
		  (locationStateEnumerationObjectEDataType,
		   source,
		   new String[] {
			   "name", "LocationStateEnumeration:Object",
			   "baseType", "LocationStateEnumeration"
		   });
		addAnnotation
		  (messageTypeEnumerationEEnum,
		   source,
		   new String[] {
			   "name", "MessageTypeEnumeration"
		   });
		addAnnotation
		  (messageTypeEnumerationObjectEDataType,
		   source,
		   new String[] {
			   "name", "MessageTypeEnumeration:Object",
			   "baseType", "MessageTypeEnumeration"
		   });
		addAnnotation
		  (metroSubmodeEnumerationEEnum,
		   source,
		   new String[] {
			   "name", "MetroSubmodeEnumeration"
		   });
		addAnnotation
		  (metroSubmodeEnumerationObjectEDataType,
		   source,
		   new String[] {
			   "name", "MetroSubmodeEnumeration:Object",
			   "baseType", "MetroSubmodeEnumeration"
		   });
		addAnnotation
		  (privateSubModesEnumerationEEnum,
		   source,
		   new String[] {
			   "name", "PrivateSubModesEnumeration"
		   });
		addAnnotation
		  (privateSubModesEnumerationObjectEDataType,
		   source,
		   new String[] {
			   "name", "PrivateSubModesEnumeration:Object",
			   "baseType", "PrivateSubModesEnumeration"
		   });
		addAnnotation
		  (ptSubModesEnumerationEEnum,
		   source,
		   new String[] {
			   "name", "PtSubModesEnumeration"
		   });
		addAnnotation
		  (ptSubModesEnumerationObjectEDataType,
		   source,
		   new String[] {
			   "name", "PtSubModesEnumeration:Object",
			   "baseType", "PtSubModesEnumeration"
		   });
		addAnnotation
		  (railSubmodeEnumerationEEnum,
		   source,
		   new String[] {
			   "name", "RailSubmodeEnumeration"
		   });
		addAnnotation
		  (railSubmodeEnumerationObjectEDataType,
		   source,
		   new String[] {
			   "name", "RailSubmodeEnumeration:Object",
			   "baseType", "RailSubmodeEnumeration"
		   });
		addAnnotation
		  (routeDeviationEnumerationEEnum,
		   source,
		   new String[] {
			   "name", "RouteDeviationEnumeration"
		   });
		addAnnotation
		  (routeDeviationEnumerationObjectEDataType,
		   source,
		   new String[] {
			   "name", "RouteDeviationEnumeration:Object",
			   "baseType", "RouteDeviationEnumeration"
		   });
		addAnnotation
		  (routeDirectionEnumerationEEnum,
		   source,
		   new String[] {
			   "name", "RouteDirectionEnumeration"
		   });
		addAnnotation
		  (routeDirectionEnumerationObjectEDataType,
		   source,
		   new String[] {
			   "name", "RouteDirectionEnumeration:Object",
			   "baseType", "RouteDirectionEnumeration"
		   });
		addAnnotation
		  (selfDriveSubmodeEnumerationEEnum,
		   source,
		   new String[] {
			   "name", "SelfDriveSubmodeEnumeration"
		   });
		addAnnotation
		  (selfDriveSubmodeEnumerationObjectEDataType,
		   source,
		   new String[] {
			   "name", "SelfDriveSubmodeEnumeration:Object",
			   "baseType", "SelfDriveSubmodeEnumeration"
		   });
		addAnnotation
		  (serviceNameEnumerationEEnum,
		   source,
		   new String[] {
			   "name", "ServiceNameEnumeration"
		   });
		addAnnotation
		  (serviceNameEnumerationObjectEDataType,
		   source,
		   new String[] {
			   "name", "ServiceNameEnumeration:Object",
			   "baseType", "ServiceNameEnumeration"
		   });
		addAnnotation
		  (serviceStateEnumerationEEnum,
		   source,
		   new String[] {
			   "name", "ServiceStateEnumeration"
		   });
		addAnnotation
		  (serviceStateEnumerationObjectEDataType,
		   source,
		   new String[] {
			   "name", "ServiceStateEnumeration:Object",
			   "baseType", "ServiceStateEnumeration"
		   });
		addAnnotation
		  (systemDocumentationInformationEnumerationEEnum,
		   source,
		   new String[] {
			   "name", "SystemDocumentationInformationEnumeration"
		   });
		addAnnotation
		  (systemDocumentationInformationEnumerationObjectEDataType,
		   source,
		   new String[] {
			   "name", "SystemDocumentationInformationEnumeration:Object",
			   "baseType", "SystemDocumentationInformationEnumeration"
		   });
		addAnnotation
		  (taxiSubmodeEnumerationEEnum,
		   source,
		   new String[] {
			   "name", "TaxiSubmodeEnumeration"
		   });
		addAnnotation
		  (taxiSubmodeEnumerationObjectEDataType,
		   source,
		   new String[] {
			   "name", "TaxiSubmodeEnumeration:Object",
			   "baseType", "TaxiSubmodeEnumeration"
		   });
		addAnnotation
		  (telecabinSubmodeEnumerationEEnum,
		   source,
		   new String[] {
			   "name", "TelecabinSubmodeEnumeration"
		   });
		addAnnotation
		  (telecabinSubmodeEnumerationObjectEDataType,
		   source,
		   new String[] {
			   "name", "TelecabinSubmodeEnumeration:Object",
			   "baseType", "TelecabinSubmodeEnumeration"
		   });
		addAnnotation
		  (ticketRazziaInformationEnumerationEEnum,
		   source,
		   new String[] {
			   "name", "TicketRazziaInformationEnumeration"
		   });
		addAnnotation
		  (ticketRazziaInformationEnumerationObjectEDataType,
		   source,
		   new String[] {
			   "name", "TicketRazziaInformationEnumeration:Object",
			   "baseType", "TicketRazziaInformationEnumeration"
		   });
		addAnnotation
		  (ticketValidationEnumerationEEnum,
		   source,
		   new String[] {
			   "name", "TicketValidationEnumeration"
		   });
		addAnnotation
		  (ticketValidationEnumerationObjectEDataType,
		   source,
		   new String[] {
			   "name", "TicketValidationEnumeration:Object",
			   "baseType", "TicketValidationEnumeration"
		   });
		addAnnotation
		  (tramSubmodeEnumerationEEnum,
		   source,
		   new String[] {
			   "name", "TramSubmodeEnumeration"
		   });
		addAnnotation
		  (tramSubmodeEnumerationObjectEDataType,
		   source,
		   new String[] {
			   "name", "TramSubmodeEnumeration:Object",
			   "baseType", "TramSubmodeEnumeration"
		   });
		addAnnotation
		  (tripStateEnumerationEEnum,
		   source,
		   new String[] {
			   "name", "TripStateEnumeration"
		   });
		addAnnotation
		  (tripStateEnumerationObjectEDataType,
		   source,
		   new String[] {
			   "name", "TripStateEnumeration:Object",
			   "baseType", "TripStateEnumeration"
		   });
		addAnnotation
		  (vehicleModeEnumerationEEnum,
		   source,
		   new String[] {
			   "name", "VehicleModeEnumeration"
		   });
		addAnnotation
		  (vehicleModeEnumerationObjectEDataType,
		   source,
		   new String[] {
			   "name", "VehicleModeEnumeration:Object",
			   "baseType", "VehicleModeEnumeration"
		   });
		addAnnotation
		  (waterSubmodeEnumerationEEnum,
		   source,
		   new String[] {
			   "name", "WaterSubmodeEnumeration"
		   });
		addAnnotation
		  (waterSubmodeEnumerationObjectEDataType,
		   source,
		   new String[] {
			   "name", "WaterSubmodeEnumeration:Object",
			   "baseType", "WaterSubmodeEnumeration"
		   });
	}

} //IbisEnumerationsPackageImpl
