/*
 */
package de.jena.mdo.ibis.ibis_common.impl;

import de.jena.mdo.ibis.ibis_common.IbisCommonPackage;
import de.jena.mdo.ibis.ibis_common.NetexMode;

import de.jena.mdo.ibis.ibis_enumerations.AirSubmodeEnumeration;
import de.jena.mdo.ibis.ibis_enumerations.BusSubmodeEnumeration;
import de.jena.mdo.ibis.ibis_enumerations.CoachSubmodeEnumeration;
import de.jena.mdo.ibis.ibis_enumerations.FunicularSubmodeEnumeration;
import de.jena.mdo.ibis.ibis_enumerations.MetroSubmodeEnumeration;
import de.jena.mdo.ibis.ibis_enumerations.PrivateSubModesEnumeration;
import de.jena.mdo.ibis.ibis_enumerations.PtSubModesEnumeration;
import de.jena.mdo.ibis.ibis_enumerations.RailSubmodeEnumeration;
import de.jena.mdo.ibis.ibis_enumerations.SelfDriveSubmodeEnumeration;
import de.jena.mdo.ibis.ibis_enumerations.TaxiSubmodeEnumeration;
import de.jena.mdo.ibis.ibis_enumerations.TelecabinSubmodeEnumeration;
import de.jena.mdo.ibis.ibis_enumerations.TramSubmodeEnumeration;
import de.jena.mdo.ibis.ibis_enumerations.WaterSubmodeEnumeration;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Netex Mode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.NetexModeImpl#getPtMainMode <em>Pt Main Mode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.NetexModeImpl#getPrivateMainMode <em>Private Main Mode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.NetexModeImpl#getAirSubmode <em>Air Submode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.NetexModeImpl#getBusSubmode <em>Bus Submode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.NetexModeImpl#getCoachSubmode <em>Coach Submode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.NetexModeImpl#getFunicularSubmode <em>Funicular Submode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.NetexModeImpl#getMetroSubmode <em>Metro Submode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.NetexModeImpl#getTramSubmode <em>Tram Submode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.NetexModeImpl#getTelecabinSubmode <em>Telecabin Submode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.NetexModeImpl#getRailSubmode <em>Rail Submode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.NetexModeImpl#getWaterSubmode <em>Water Submode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.NetexModeImpl#getTaxiSubmode <em>Taxi Submode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.NetexModeImpl#getSelfDriveSubmode <em>Self Drive Submode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetexModeImpl extends MinimalEObjectImpl.Container implements NetexMode {
	/**
	 * The default value of the '{@link #getPtMainMode() <em>Pt Main Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPtMainMode()
	 * @generated
	 * @ordered
	 */
	protected static final PtSubModesEnumeration PT_MAIN_MODE_EDEFAULT = PtSubModesEnumeration.UNKNOWN;

	/**
	 * The cached value of the '{@link #getPtMainMode() <em>Pt Main Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPtMainMode()
	 * @generated
	 * @ordered
	 */
	protected PtSubModesEnumeration ptMainMode = PT_MAIN_MODE_EDEFAULT;

	/**
	 * This is true if the Pt Main Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ptMainModeESet;

	/**
	 * The default value of the '{@link #getPrivateMainMode() <em>Private Main Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateMainMode()
	 * @generated
	 * @ordered
	 */
	protected static final PrivateSubModesEnumeration PRIVATE_MAIN_MODE_EDEFAULT = PrivateSubModesEnumeration.UNKNOWN;

	/**
	 * The cached value of the '{@link #getPrivateMainMode() <em>Private Main Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateMainMode()
	 * @generated
	 * @ordered
	 */
	protected PrivateSubModesEnumeration privateMainMode = PRIVATE_MAIN_MODE_EDEFAULT;

	/**
	 * This is true if the Private Main Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean privateMainModeESet;

	/**
	 * The default value of the '{@link #getAirSubmode() <em>Air Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirSubmode()
	 * @generated
	 * @ordered
	 */
	protected static final AirSubmodeEnumeration AIR_SUBMODE_EDEFAULT = AirSubmodeEnumeration.UNKNOWN;

	/**
	 * The cached value of the '{@link #getAirSubmode() <em>Air Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirSubmode()
	 * @generated
	 * @ordered
	 */
	protected AirSubmodeEnumeration airSubmode = AIR_SUBMODE_EDEFAULT;

	/**
	 * This is true if the Air Submode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean airSubmodeESet;

	/**
	 * The default value of the '{@link #getBusSubmode() <em>Bus Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusSubmode()
	 * @generated
	 * @ordered
	 */
	protected static final BusSubmodeEnumeration BUS_SUBMODE_EDEFAULT = BusSubmodeEnumeration.UNKNOWN;

	/**
	 * The cached value of the '{@link #getBusSubmode() <em>Bus Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusSubmode()
	 * @generated
	 * @ordered
	 */
	protected BusSubmodeEnumeration busSubmode = BUS_SUBMODE_EDEFAULT;

	/**
	 * This is true if the Bus Submode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean busSubmodeESet;

	/**
	 * The default value of the '{@link #getCoachSubmode() <em>Coach Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoachSubmode()
	 * @generated
	 * @ordered
	 */
	protected static final CoachSubmodeEnumeration COACH_SUBMODE_EDEFAULT = CoachSubmodeEnumeration.UNKNOWN;

	/**
	 * The cached value of the '{@link #getCoachSubmode() <em>Coach Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoachSubmode()
	 * @generated
	 * @ordered
	 */
	protected CoachSubmodeEnumeration coachSubmode = COACH_SUBMODE_EDEFAULT;

	/**
	 * This is true if the Coach Submode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean coachSubmodeESet;

	/**
	 * The default value of the '{@link #getFunicularSubmode() <em>Funicular Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunicularSubmode()
	 * @generated
	 * @ordered
	 */
	protected static final FunicularSubmodeEnumeration FUNICULAR_SUBMODE_EDEFAULT = FunicularSubmodeEnumeration.UNKNOWN;

	/**
	 * The cached value of the '{@link #getFunicularSubmode() <em>Funicular Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunicularSubmode()
	 * @generated
	 * @ordered
	 */
	protected FunicularSubmodeEnumeration funicularSubmode = FUNICULAR_SUBMODE_EDEFAULT;

	/**
	 * This is true if the Funicular Submode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean funicularSubmodeESet;

	/**
	 * The default value of the '{@link #getMetroSubmode() <em>Metro Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetroSubmode()
	 * @generated
	 * @ordered
	 */
	protected static final MetroSubmodeEnumeration METRO_SUBMODE_EDEFAULT = MetroSubmodeEnumeration.UNKNOWN;

	/**
	 * The cached value of the '{@link #getMetroSubmode() <em>Metro Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetroSubmode()
	 * @generated
	 * @ordered
	 */
	protected MetroSubmodeEnumeration metroSubmode = METRO_SUBMODE_EDEFAULT;

	/**
	 * This is true if the Metro Submode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean metroSubmodeESet;

	/**
	 * The default value of the '{@link #getTramSubmode() <em>Tram Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTramSubmode()
	 * @generated
	 * @ordered
	 */
	protected static final TramSubmodeEnumeration TRAM_SUBMODE_EDEFAULT = TramSubmodeEnumeration.UNKNOWN;

	/**
	 * The cached value of the '{@link #getTramSubmode() <em>Tram Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTramSubmode()
	 * @generated
	 * @ordered
	 */
	protected TramSubmodeEnumeration tramSubmode = TRAM_SUBMODE_EDEFAULT;

	/**
	 * This is true if the Tram Submode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tramSubmodeESet;

	/**
	 * The default value of the '{@link #getTelecabinSubmode() <em>Telecabin Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelecabinSubmode()
	 * @generated
	 * @ordered
	 */
	protected static final TelecabinSubmodeEnumeration TELECABIN_SUBMODE_EDEFAULT = TelecabinSubmodeEnumeration.UNKNOWN;

	/**
	 * The cached value of the '{@link #getTelecabinSubmode() <em>Telecabin Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelecabinSubmode()
	 * @generated
	 * @ordered
	 */
	protected TelecabinSubmodeEnumeration telecabinSubmode = TELECABIN_SUBMODE_EDEFAULT;

	/**
	 * This is true if the Telecabin Submode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean telecabinSubmodeESet;

	/**
	 * The default value of the '{@link #getRailSubmode() <em>Rail Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRailSubmode()
	 * @generated
	 * @ordered
	 */
	protected static final RailSubmodeEnumeration RAIL_SUBMODE_EDEFAULT = RailSubmodeEnumeration.UNKNOWN;

	/**
	 * The cached value of the '{@link #getRailSubmode() <em>Rail Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRailSubmode()
	 * @generated
	 * @ordered
	 */
	protected RailSubmodeEnumeration railSubmode = RAIL_SUBMODE_EDEFAULT;

	/**
	 * This is true if the Rail Submode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean railSubmodeESet;

	/**
	 * The default value of the '{@link #getWaterSubmode() <em>Water Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaterSubmode()
	 * @generated
	 * @ordered
	 */
	protected static final WaterSubmodeEnumeration WATER_SUBMODE_EDEFAULT = WaterSubmodeEnumeration.UNKNOWN;

	/**
	 * The cached value of the '{@link #getWaterSubmode() <em>Water Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaterSubmode()
	 * @generated
	 * @ordered
	 */
	protected WaterSubmodeEnumeration waterSubmode = WATER_SUBMODE_EDEFAULT;

	/**
	 * This is true if the Water Submode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean waterSubmodeESet;

	/**
	 * The default value of the '{@link #getTaxiSubmode() <em>Taxi Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxiSubmode()
	 * @generated
	 * @ordered
	 */
	protected static final TaxiSubmodeEnumeration TAXI_SUBMODE_EDEFAULT = TaxiSubmodeEnumeration.UNKNOWN;

	/**
	 * The cached value of the '{@link #getTaxiSubmode() <em>Taxi Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxiSubmode()
	 * @generated
	 * @ordered
	 */
	protected TaxiSubmodeEnumeration taxiSubmode = TAXI_SUBMODE_EDEFAULT;

	/**
	 * This is true if the Taxi Submode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean taxiSubmodeESet;

	/**
	 * The default value of the '{@link #getSelfDriveSubmode() <em>Self Drive Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfDriveSubmode()
	 * @generated
	 * @ordered
	 */
	protected static final SelfDriveSubmodeEnumeration SELF_DRIVE_SUBMODE_EDEFAULT = SelfDriveSubmodeEnumeration.UNKNOWN;

	/**
	 * The cached value of the '{@link #getSelfDriveSubmode() <em>Self Drive Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfDriveSubmode()
	 * @generated
	 * @ordered
	 */
	protected SelfDriveSubmodeEnumeration selfDriveSubmode = SELF_DRIVE_SUBMODE_EDEFAULT;

	/**
	 * This is true if the Self Drive Submode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean selfDriveSubmodeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetexModeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.Literals.NETEX_MODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PtSubModesEnumeration getPtMainMode() {
		return ptMainMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPtMainMode(PtSubModesEnumeration newPtMainMode) {
		PtSubModesEnumeration oldPtMainMode = ptMainMode;
		ptMainMode = newPtMainMode == null ? PT_MAIN_MODE_EDEFAULT : newPtMainMode;
		boolean oldPtMainModeESet = ptMainModeESet;
		ptMainModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.NETEX_MODE__PT_MAIN_MODE, oldPtMainMode, ptMainMode, !oldPtMainModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPtMainMode() {
		PtSubModesEnumeration oldPtMainMode = ptMainMode;
		boolean oldPtMainModeESet = ptMainModeESet;
		ptMainMode = PT_MAIN_MODE_EDEFAULT;
		ptMainModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IbisCommonPackage.NETEX_MODE__PT_MAIN_MODE, oldPtMainMode, PT_MAIN_MODE_EDEFAULT, oldPtMainModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPtMainMode() {
		return ptMainModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrivateSubModesEnumeration getPrivateMainMode() {
		return privateMainMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrivateMainMode(PrivateSubModesEnumeration newPrivateMainMode) {
		PrivateSubModesEnumeration oldPrivateMainMode = privateMainMode;
		privateMainMode = newPrivateMainMode == null ? PRIVATE_MAIN_MODE_EDEFAULT : newPrivateMainMode;
		boolean oldPrivateMainModeESet = privateMainModeESet;
		privateMainModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.NETEX_MODE__PRIVATE_MAIN_MODE, oldPrivateMainMode, privateMainMode, !oldPrivateMainModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPrivateMainMode() {
		PrivateSubModesEnumeration oldPrivateMainMode = privateMainMode;
		boolean oldPrivateMainModeESet = privateMainModeESet;
		privateMainMode = PRIVATE_MAIN_MODE_EDEFAULT;
		privateMainModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IbisCommonPackage.NETEX_MODE__PRIVATE_MAIN_MODE, oldPrivateMainMode, PRIVATE_MAIN_MODE_EDEFAULT, oldPrivateMainModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPrivateMainMode() {
		return privateMainModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AirSubmodeEnumeration getAirSubmode() {
		return airSubmode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAirSubmode(AirSubmodeEnumeration newAirSubmode) {
		AirSubmodeEnumeration oldAirSubmode = airSubmode;
		airSubmode = newAirSubmode == null ? AIR_SUBMODE_EDEFAULT : newAirSubmode;
		boolean oldAirSubmodeESet = airSubmodeESet;
		airSubmodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.NETEX_MODE__AIR_SUBMODE, oldAirSubmode, airSubmode, !oldAirSubmodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAirSubmode() {
		AirSubmodeEnumeration oldAirSubmode = airSubmode;
		boolean oldAirSubmodeESet = airSubmodeESet;
		airSubmode = AIR_SUBMODE_EDEFAULT;
		airSubmodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IbisCommonPackage.NETEX_MODE__AIR_SUBMODE, oldAirSubmode, AIR_SUBMODE_EDEFAULT, oldAirSubmodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAirSubmode() {
		return airSubmodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BusSubmodeEnumeration getBusSubmode() {
		return busSubmode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBusSubmode(BusSubmodeEnumeration newBusSubmode) {
		BusSubmodeEnumeration oldBusSubmode = busSubmode;
		busSubmode = newBusSubmode == null ? BUS_SUBMODE_EDEFAULT : newBusSubmode;
		boolean oldBusSubmodeESet = busSubmodeESet;
		busSubmodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.NETEX_MODE__BUS_SUBMODE, oldBusSubmode, busSubmode, !oldBusSubmodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBusSubmode() {
		BusSubmodeEnumeration oldBusSubmode = busSubmode;
		boolean oldBusSubmodeESet = busSubmodeESet;
		busSubmode = BUS_SUBMODE_EDEFAULT;
		busSubmodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IbisCommonPackage.NETEX_MODE__BUS_SUBMODE, oldBusSubmode, BUS_SUBMODE_EDEFAULT, oldBusSubmodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBusSubmode() {
		return busSubmodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoachSubmodeEnumeration getCoachSubmode() {
		return coachSubmode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoachSubmode(CoachSubmodeEnumeration newCoachSubmode) {
		CoachSubmodeEnumeration oldCoachSubmode = coachSubmode;
		coachSubmode = newCoachSubmode == null ? COACH_SUBMODE_EDEFAULT : newCoachSubmode;
		boolean oldCoachSubmodeESet = coachSubmodeESet;
		coachSubmodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.NETEX_MODE__COACH_SUBMODE, oldCoachSubmode, coachSubmode, !oldCoachSubmodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetCoachSubmode() {
		CoachSubmodeEnumeration oldCoachSubmode = coachSubmode;
		boolean oldCoachSubmodeESet = coachSubmodeESet;
		coachSubmode = COACH_SUBMODE_EDEFAULT;
		coachSubmodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IbisCommonPackage.NETEX_MODE__COACH_SUBMODE, oldCoachSubmode, COACH_SUBMODE_EDEFAULT, oldCoachSubmodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetCoachSubmode() {
		return coachSubmodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunicularSubmodeEnumeration getFunicularSubmode() {
		return funicularSubmode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunicularSubmode(FunicularSubmodeEnumeration newFunicularSubmode) {
		FunicularSubmodeEnumeration oldFunicularSubmode = funicularSubmode;
		funicularSubmode = newFunicularSubmode == null ? FUNICULAR_SUBMODE_EDEFAULT : newFunicularSubmode;
		boolean oldFunicularSubmodeESet = funicularSubmodeESet;
		funicularSubmodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.NETEX_MODE__FUNICULAR_SUBMODE, oldFunicularSubmode, funicularSubmode, !oldFunicularSubmodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFunicularSubmode() {
		FunicularSubmodeEnumeration oldFunicularSubmode = funicularSubmode;
		boolean oldFunicularSubmodeESet = funicularSubmodeESet;
		funicularSubmode = FUNICULAR_SUBMODE_EDEFAULT;
		funicularSubmodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IbisCommonPackage.NETEX_MODE__FUNICULAR_SUBMODE, oldFunicularSubmode, FUNICULAR_SUBMODE_EDEFAULT, oldFunicularSubmodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFunicularSubmode() {
		return funicularSubmodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetroSubmodeEnumeration getMetroSubmode() {
		return metroSubmode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetroSubmode(MetroSubmodeEnumeration newMetroSubmode) {
		MetroSubmodeEnumeration oldMetroSubmode = metroSubmode;
		metroSubmode = newMetroSubmode == null ? METRO_SUBMODE_EDEFAULT : newMetroSubmode;
		boolean oldMetroSubmodeESet = metroSubmodeESet;
		metroSubmodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.NETEX_MODE__METRO_SUBMODE, oldMetroSubmode, metroSubmode, !oldMetroSubmodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMetroSubmode() {
		MetroSubmodeEnumeration oldMetroSubmode = metroSubmode;
		boolean oldMetroSubmodeESet = metroSubmodeESet;
		metroSubmode = METRO_SUBMODE_EDEFAULT;
		metroSubmodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IbisCommonPackage.NETEX_MODE__METRO_SUBMODE, oldMetroSubmode, METRO_SUBMODE_EDEFAULT, oldMetroSubmodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMetroSubmode() {
		return metroSubmodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TramSubmodeEnumeration getTramSubmode() {
		return tramSubmode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTramSubmode(TramSubmodeEnumeration newTramSubmode) {
		TramSubmodeEnumeration oldTramSubmode = tramSubmode;
		tramSubmode = newTramSubmode == null ? TRAM_SUBMODE_EDEFAULT : newTramSubmode;
		boolean oldTramSubmodeESet = tramSubmodeESet;
		tramSubmodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.NETEX_MODE__TRAM_SUBMODE, oldTramSubmode, tramSubmode, !oldTramSubmodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTramSubmode() {
		TramSubmodeEnumeration oldTramSubmode = tramSubmode;
		boolean oldTramSubmodeESet = tramSubmodeESet;
		tramSubmode = TRAM_SUBMODE_EDEFAULT;
		tramSubmodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IbisCommonPackage.NETEX_MODE__TRAM_SUBMODE, oldTramSubmode, TRAM_SUBMODE_EDEFAULT, oldTramSubmodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTramSubmode() {
		return tramSubmodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TelecabinSubmodeEnumeration getTelecabinSubmode() {
		return telecabinSubmode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTelecabinSubmode(TelecabinSubmodeEnumeration newTelecabinSubmode) {
		TelecabinSubmodeEnumeration oldTelecabinSubmode = telecabinSubmode;
		telecabinSubmode = newTelecabinSubmode == null ? TELECABIN_SUBMODE_EDEFAULT : newTelecabinSubmode;
		boolean oldTelecabinSubmodeESet = telecabinSubmodeESet;
		telecabinSubmodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.NETEX_MODE__TELECABIN_SUBMODE, oldTelecabinSubmode, telecabinSubmode, !oldTelecabinSubmodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTelecabinSubmode() {
		TelecabinSubmodeEnumeration oldTelecabinSubmode = telecabinSubmode;
		boolean oldTelecabinSubmodeESet = telecabinSubmodeESet;
		telecabinSubmode = TELECABIN_SUBMODE_EDEFAULT;
		telecabinSubmodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IbisCommonPackage.NETEX_MODE__TELECABIN_SUBMODE, oldTelecabinSubmode, TELECABIN_SUBMODE_EDEFAULT, oldTelecabinSubmodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTelecabinSubmode() {
		return telecabinSubmodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RailSubmodeEnumeration getRailSubmode() {
		return railSubmode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRailSubmode(RailSubmodeEnumeration newRailSubmode) {
		RailSubmodeEnumeration oldRailSubmode = railSubmode;
		railSubmode = newRailSubmode == null ? RAIL_SUBMODE_EDEFAULT : newRailSubmode;
		boolean oldRailSubmodeESet = railSubmodeESet;
		railSubmodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.NETEX_MODE__RAIL_SUBMODE, oldRailSubmode, railSubmode, !oldRailSubmodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRailSubmode() {
		RailSubmodeEnumeration oldRailSubmode = railSubmode;
		boolean oldRailSubmodeESet = railSubmodeESet;
		railSubmode = RAIL_SUBMODE_EDEFAULT;
		railSubmodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IbisCommonPackage.NETEX_MODE__RAIL_SUBMODE, oldRailSubmode, RAIL_SUBMODE_EDEFAULT, oldRailSubmodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRailSubmode() {
		return railSubmodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WaterSubmodeEnumeration getWaterSubmode() {
		return waterSubmode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWaterSubmode(WaterSubmodeEnumeration newWaterSubmode) {
		WaterSubmodeEnumeration oldWaterSubmode = waterSubmode;
		waterSubmode = newWaterSubmode == null ? WATER_SUBMODE_EDEFAULT : newWaterSubmode;
		boolean oldWaterSubmodeESet = waterSubmodeESet;
		waterSubmodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.NETEX_MODE__WATER_SUBMODE, oldWaterSubmode, waterSubmode, !oldWaterSubmodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetWaterSubmode() {
		WaterSubmodeEnumeration oldWaterSubmode = waterSubmode;
		boolean oldWaterSubmodeESet = waterSubmodeESet;
		waterSubmode = WATER_SUBMODE_EDEFAULT;
		waterSubmodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IbisCommonPackage.NETEX_MODE__WATER_SUBMODE, oldWaterSubmode, WATER_SUBMODE_EDEFAULT, oldWaterSubmodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetWaterSubmode() {
		return waterSubmodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaxiSubmodeEnumeration getTaxiSubmode() {
		return taxiSubmode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxiSubmode(TaxiSubmodeEnumeration newTaxiSubmode) {
		TaxiSubmodeEnumeration oldTaxiSubmode = taxiSubmode;
		taxiSubmode = newTaxiSubmode == null ? TAXI_SUBMODE_EDEFAULT : newTaxiSubmode;
		boolean oldTaxiSubmodeESet = taxiSubmodeESet;
		taxiSubmodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.NETEX_MODE__TAXI_SUBMODE, oldTaxiSubmode, taxiSubmode, !oldTaxiSubmodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTaxiSubmode() {
		TaxiSubmodeEnumeration oldTaxiSubmode = taxiSubmode;
		boolean oldTaxiSubmodeESet = taxiSubmodeESet;
		taxiSubmode = TAXI_SUBMODE_EDEFAULT;
		taxiSubmodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IbisCommonPackage.NETEX_MODE__TAXI_SUBMODE, oldTaxiSubmode, TAXI_SUBMODE_EDEFAULT, oldTaxiSubmodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTaxiSubmode() {
		return taxiSubmodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelfDriveSubmodeEnumeration getSelfDriveSubmode() {
		return selfDriveSubmode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelfDriveSubmode(SelfDriveSubmodeEnumeration newSelfDriveSubmode) {
		SelfDriveSubmodeEnumeration oldSelfDriveSubmode = selfDriveSubmode;
		selfDriveSubmode = newSelfDriveSubmode == null ? SELF_DRIVE_SUBMODE_EDEFAULT : newSelfDriveSubmode;
		boolean oldSelfDriveSubmodeESet = selfDriveSubmodeESet;
		selfDriveSubmodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.NETEX_MODE__SELF_DRIVE_SUBMODE, oldSelfDriveSubmode, selfDriveSubmode, !oldSelfDriveSubmodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSelfDriveSubmode() {
		SelfDriveSubmodeEnumeration oldSelfDriveSubmode = selfDriveSubmode;
		boolean oldSelfDriveSubmodeESet = selfDriveSubmodeESet;
		selfDriveSubmode = SELF_DRIVE_SUBMODE_EDEFAULT;
		selfDriveSubmodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IbisCommonPackage.NETEX_MODE__SELF_DRIVE_SUBMODE, oldSelfDriveSubmode, SELF_DRIVE_SUBMODE_EDEFAULT, oldSelfDriveSubmodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSelfDriveSubmode() {
		return selfDriveSubmodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IbisCommonPackage.NETEX_MODE__PT_MAIN_MODE:
				return getPtMainMode();
			case IbisCommonPackage.NETEX_MODE__PRIVATE_MAIN_MODE:
				return getPrivateMainMode();
			case IbisCommonPackage.NETEX_MODE__AIR_SUBMODE:
				return getAirSubmode();
			case IbisCommonPackage.NETEX_MODE__BUS_SUBMODE:
				return getBusSubmode();
			case IbisCommonPackage.NETEX_MODE__COACH_SUBMODE:
				return getCoachSubmode();
			case IbisCommonPackage.NETEX_MODE__FUNICULAR_SUBMODE:
				return getFunicularSubmode();
			case IbisCommonPackage.NETEX_MODE__METRO_SUBMODE:
				return getMetroSubmode();
			case IbisCommonPackage.NETEX_MODE__TRAM_SUBMODE:
				return getTramSubmode();
			case IbisCommonPackage.NETEX_MODE__TELECABIN_SUBMODE:
				return getTelecabinSubmode();
			case IbisCommonPackage.NETEX_MODE__RAIL_SUBMODE:
				return getRailSubmode();
			case IbisCommonPackage.NETEX_MODE__WATER_SUBMODE:
				return getWaterSubmode();
			case IbisCommonPackage.NETEX_MODE__TAXI_SUBMODE:
				return getTaxiSubmode();
			case IbisCommonPackage.NETEX_MODE__SELF_DRIVE_SUBMODE:
				return getSelfDriveSubmode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IbisCommonPackage.NETEX_MODE__PT_MAIN_MODE:
				setPtMainMode((PtSubModesEnumeration)newValue);
				return;
			case IbisCommonPackage.NETEX_MODE__PRIVATE_MAIN_MODE:
				setPrivateMainMode((PrivateSubModesEnumeration)newValue);
				return;
			case IbisCommonPackage.NETEX_MODE__AIR_SUBMODE:
				setAirSubmode((AirSubmodeEnumeration)newValue);
				return;
			case IbisCommonPackage.NETEX_MODE__BUS_SUBMODE:
				setBusSubmode((BusSubmodeEnumeration)newValue);
				return;
			case IbisCommonPackage.NETEX_MODE__COACH_SUBMODE:
				setCoachSubmode((CoachSubmodeEnumeration)newValue);
				return;
			case IbisCommonPackage.NETEX_MODE__FUNICULAR_SUBMODE:
				setFunicularSubmode((FunicularSubmodeEnumeration)newValue);
				return;
			case IbisCommonPackage.NETEX_MODE__METRO_SUBMODE:
				setMetroSubmode((MetroSubmodeEnumeration)newValue);
				return;
			case IbisCommonPackage.NETEX_MODE__TRAM_SUBMODE:
				setTramSubmode((TramSubmodeEnumeration)newValue);
				return;
			case IbisCommonPackage.NETEX_MODE__TELECABIN_SUBMODE:
				setTelecabinSubmode((TelecabinSubmodeEnumeration)newValue);
				return;
			case IbisCommonPackage.NETEX_MODE__RAIL_SUBMODE:
				setRailSubmode((RailSubmodeEnumeration)newValue);
				return;
			case IbisCommonPackage.NETEX_MODE__WATER_SUBMODE:
				setWaterSubmode((WaterSubmodeEnumeration)newValue);
				return;
			case IbisCommonPackage.NETEX_MODE__TAXI_SUBMODE:
				setTaxiSubmode((TaxiSubmodeEnumeration)newValue);
				return;
			case IbisCommonPackage.NETEX_MODE__SELF_DRIVE_SUBMODE:
				setSelfDriveSubmode((SelfDriveSubmodeEnumeration)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IbisCommonPackage.NETEX_MODE__PT_MAIN_MODE:
				unsetPtMainMode();
				return;
			case IbisCommonPackage.NETEX_MODE__PRIVATE_MAIN_MODE:
				unsetPrivateMainMode();
				return;
			case IbisCommonPackage.NETEX_MODE__AIR_SUBMODE:
				unsetAirSubmode();
				return;
			case IbisCommonPackage.NETEX_MODE__BUS_SUBMODE:
				unsetBusSubmode();
				return;
			case IbisCommonPackage.NETEX_MODE__COACH_SUBMODE:
				unsetCoachSubmode();
				return;
			case IbisCommonPackage.NETEX_MODE__FUNICULAR_SUBMODE:
				unsetFunicularSubmode();
				return;
			case IbisCommonPackage.NETEX_MODE__METRO_SUBMODE:
				unsetMetroSubmode();
				return;
			case IbisCommonPackage.NETEX_MODE__TRAM_SUBMODE:
				unsetTramSubmode();
				return;
			case IbisCommonPackage.NETEX_MODE__TELECABIN_SUBMODE:
				unsetTelecabinSubmode();
				return;
			case IbisCommonPackage.NETEX_MODE__RAIL_SUBMODE:
				unsetRailSubmode();
				return;
			case IbisCommonPackage.NETEX_MODE__WATER_SUBMODE:
				unsetWaterSubmode();
				return;
			case IbisCommonPackage.NETEX_MODE__TAXI_SUBMODE:
				unsetTaxiSubmode();
				return;
			case IbisCommonPackage.NETEX_MODE__SELF_DRIVE_SUBMODE:
				unsetSelfDriveSubmode();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IbisCommonPackage.NETEX_MODE__PT_MAIN_MODE:
				return isSetPtMainMode();
			case IbisCommonPackage.NETEX_MODE__PRIVATE_MAIN_MODE:
				return isSetPrivateMainMode();
			case IbisCommonPackage.NETEX_MODE__AIR_SUBMODE:
				return isSetAirSubmode();
			case IbisCommonPackage.NETEX_MODE__BUS_SUBMODE:
				return isSetBusSubmode();
			case IbisCommonPackage.NETEX_MODE__COACH_SUBMODE:
				return isSetCoachSubmode();
			case IbisCommonPackage.NETEX_MODE__FUNICULAR_SUBMODE:
				return isSetFunicularSubmode();
			case IbisCommonPackage.NETEX_MODE__METRO_SUBMODE:
				return isSetMetroSubmode();
			case IbisCommonPackage.NETEX_MODE__TRAM_SUBMODE:
				return isSetTramSubmode();
			case IbisCommonPackage.NETEX_MODE__TELECABIN_SUBMODE:
				return isSetTelecabinSubmode();
			case IbisCommonPackage.NETEX_MODE__RAIL_SUBMODE:
				return isSetRailSubmode();
			case IbisCommonPackage.NETEX_MODE__WATER_SUBMODE:
				return isSetWaterSubmode();
			case IbisCommonPackage.NETEX_MODE__TAXI_SUBMODE:
				return isSetTaxiSubmode();
			case IbisCommonPackage.NETEX_MODE__SELF_DRIVE_SUBMODE:
				return isSetSelfDriveSubmode();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (ptMainMode: ");
		if (ptMainModeESet) result.append(ptMainMode); else result.append("<unset>");
		result.append(", privateMainMode: ");
		if (privateMainModeESet) result.append(privateMainMode); else result.append("<unset>");
		result.append(", airSubmode: ");
		if (airSubmodeESet) result.append(airSubmode); else result.append("<unset>");
		result.append(", busSubmode: ");
		if (busSubmodeESet) result.append(busSubmode); else result.append("<unset>");
		result.append(", coachSubmode: ");
		if (coachSubmodeESet) result.append(coachSubmode); else result.append("<unset>");
		result.append(", funicularSubmode: ");
		if (funicularSubmodeESet) result.append(funicularSubmode); else result.append("<unset>");
		result.append(", metroSubmode: ");
		if (metroSubmodeESet) result.append(metroSubmode); else result.append("<unset>");
		result.append(", tramSubmode: ");
		if (tramSubmodeESet) result.append(tramSubmode); else result.append("<unset>");
		result.append(", telecabinSubmode: ");
		if (telecabinSubmodeESet) result.append(telecabinSubmode); else result.append("<unset>");
		result.append(", railSubmode: ");
		if (railSubmodeESet) result.append(railSubmode); else result.append("<unset>");
		result.append(", waterSubmode: ");
		if (waterSubmodeESet) result.append(waterSubmode); else result.append("<unset>");
		result.append(", taxiSubmode: ");
		if (taxiSubmodeESet) result.append(taxiSubmode); else result.append("<unset>");
		result.append(", selfDriveSubmode: ");
		if (selfDriveSubmodeESet) result.append(selfDriveSubmode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //NetexModeImpl
