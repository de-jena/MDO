/*
 */
package de.jena.mdo.ibis.ibis_customerinformationservice.impl;

import de.jena.mdo.ibis.ibis_common.DisplayContent;
import de.jena.mdo.ibis.ibis_common.IBISIPBoolean;
import de.jena.mdo.ibis.ibis_common.IBISIPDateTime;
import de.jena.mdo.ibis.ibis_common.IBISIPInt;
import de.jena.mdo.ibis.ibis_common.IBISIPLanguage;
import de.jena.mdo.ibis.ibis_common.IBISIPNMTOKEN;
import de.jena.mdo.ibis.ibis_common.NetexMode;
import de.jena.mdo.ibis.ibis_common.TripInformation;

import de.jena.mdo.ibis.ibis_customerinformationservice.AllData;
import de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage;

import de.jena.mdo.ibis.ibis_enumerations.DoorOpenStateEnumeration;
import de.jena.mdo.ibis.ibis_enumerations.ExitSideEnumeration;
import de.jena.mdo.ibis.ibis_enumerations.RouteDeviationEnumeration;
import de.jena.mdo.ibis.ibis_enumerations.TripStateEnumeration;
import de.jena.mdo.ibis.ibis_enumerations.VehicleModeEnumeration;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>All Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.AllDataImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.AllDataImpl#getVehicleRef <em>Vehicle Ref</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.AllDataImpl#getDefaultLanguage <em>Default Language</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.AllDataImpl#getTripInformation <em>Trip Information</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.AllDataImpl#getCurrentStopIndex <em>Current Stop Index</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.AllDataImpl#getRouteDeviation <em>Route Deviation</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.AllDataImpl#getDoorState <em>Door State</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.AllDataImpl#getInPanic <em>In Panic</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.AllDataImpl#getVehicleStopRequested <em>Vehicle Stop Requested</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.AllDataImpl#getExitSide <em>Exit Side</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.AllDataImpl#getMovingDirectionForward <em>Moving Direction Forward</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.AllDataImpl#getVehicleMode <em>Vehicle Mode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.AllDataImpl#getMyOwnVehicleMode <em>My Own Vehicle Mode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.AllDataImpl#getSpeakerActive <em>Speaker Active</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.AllDataImpl#getStopInformationActive <em>Stop Information Active</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.AllDataImpl#getTripState <em>Trip State</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.AllDataImpl#getGlobalDisplayContent <em>Global Display Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllDataImpl extends MinimalEObjectImpl.Container implements AllData {
	/**
	 * The cached value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected IBISIPDateTime timeStamp;

	/**
	 * The cached value of the '{@link #getVehicleRef() <em>Vehicle Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleRef()
	 * @generated
	 * @ordered
	 */
	protected IBISIPNMTOKEN vehicleRef;

	/**
	 * The cached value of the '{@link #getDefaultLanguage() <em>Default Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultLanguage()
	 * @generated
	 * @ordered
	 */
	protected IBISIPLanguage defaultLanguage;

	/**
	 * The cached value of the '{@link #getTripInformation() <em>Trip Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTripInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<TripInformation> tripInformation;

	/**
	 * The cached value of the '{@link #getCurrentStopIndex() <em>Current Stop Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentStopIndex()
	 * @generated
	 * @ordered
	 */
	protected IBISIPInt currentStopIndex;

	/**
	 * The default value of the '{@link #getRouteDeviation() <em>Route Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteDeviation()
	 * @generated
	 * @ordered
	 */
	protected static final RouteDeviationEnumeration ROUTE_DEVIATION_EDEFAULT = RouteDeviationEnumeration.ONROUTE;

	/**
	 * The cached value of the '{@link #getRouteDeviation() <em>Route Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteDeviation()
	 * @generated
	 * @ordered
	 */
	protected RouteDeviationEnumeration routeDeviation = ROUTE_DEVIATION_EDEFAULT;

	/**
	 * This is true if the Route Deviation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean routeDeviationESet;

	/**
	 * The default value of the '{@link #getDoorState() <em>Door State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoorState()
	 * @generated
	 * @ordered
	 */
	protected static final DoorOpenStateEnumeration DOOR_STATE_EDEFAULT = DoorOpenStateEnumeration.DOORS_OPEN;

	/**
	 * The cached value of the '{@link #getDoorState() <em>Door State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoorState()
	 * @generated
	 * @ordered
	 */
	protected DoorOpenStateEnumeration doorState = DOOR_STATE_EDEFAULT;

	/**
	 * This is true if the Door State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean doorStateESet;

	/**
	 * The cached value of the '{@link #getInPanic() <em>In Panic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInPanic()
	 * @generated
	 * @ordered
	 */
	protected IBISIPBoolean inPanic;

	/**
	 * The cached value of the '{@link #getVehicleStopRequested() <em>Vehicle Stop Requested</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleStopRequested()
	 * @generated
	 * @ordered
	 */
	protected IBISIPBoolean vehicleStopRequested;

	/**
	 * The default value of the '{@link #getExitSide() <em>Exit Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExitSide()
	 * @generated
	 * @ordered
	 */
	protected static final ExitSideEnumeration EXIT_SIDE_EDEFAULT = ExitSideEnumeration.BOTH;

	/**
	 * The cached value of the '{@link #getExitSide() <em>Exit Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExitSide()
	 * @generated
	 * @ordered
	 */
	protected ExitSideEnumeration exitSide = EXIT_SIDE_EDEFAULT;

	/**
	 * This is true if the Exit Side attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean exitSideESet;

	/**
	 * The cached value of the '{@link #getMovingDirectionForward() <em>Moving Direction Forward</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovingDirectionForward()
	 * @generated
	 * @ordered
	 */
	protected IBISIPBoolean movingDirectionForward;

	/**
	 * The default value of the '{@link #getVehicleMode() <em>Vehicle Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleMode()
	 * @generated
	 * @ordered
	 */
	protected static final VehicleModeEnumeration VEHICLE_MODE_EDEFAULT = VehicleModeEnumeration.AIR;

	/**
	 * The cached value of the '{@link #getVehicleMode() <em>Vehicle Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleMode()
	 * @generated
	 * @ordered
	 */
	protected VehicleModeEnumeration vehicleMode = VEHICLE_MODE_EDEFAULT;

	/**
	 * This is true if the Vehicle Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean vehicleModeESet;

	/**
	 * The cached value of the '{@link #getMyOwnVehicleMode() <em>My Own Vehicle Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyOwnVehicleMode()
	 * @generated
	 * @ordered
	 */
	protected NetexMode myOwnVehicleMode;

	/**
	 * The cached value of the '{@link #getSpeakerActive() <em>Speaker Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeakerActive()
	 * @generated
	 * @ordered
	 */
	protected IBISIPBoolean speakerActive;

	/**
	 * The cached value of the '{@link #getStopInformationActive() <em>Stop Information Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopInformationActive()
	 * @generated
	 * @ordered
	 */
	protected IBISIPBoolean stopInformationActive;

	/**
	 * The default value of the '{@link #getTripState() <em>Trip State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTripState()
	 * @generated
	 * @ordered
	 */
	protected static final TripStateEnumeration TRIP_STATE_EDEFAULT = TripStateEnumeration.EMPTY_RUN;

	/**
	 * The cached value of the '{@link #getTripState() <em>Trip State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTripState()
	 * @generated
	 * @ordered
	 */
	protected TripStateEnumeration tripState = TRIP_STATE_EDEFAULT;

	/**
	 * This is true if the Trip State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tripStateESet;

	/**
	 * The cached value of the '{@link #getGlobalDisplayContent() <em>Global Display Content</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalDisplayContent()
	 * @generated
	 * @ordered
	 */
	protected EList<DisplayContent> globalDisplayContent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCustomerInformationServicePackage.Literals.ALL_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPDateTime getTimeStamp() {
		return timeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeStamp(IBISIPDateTime newTimeStamp, NotificationChain msgs) {
		IBISIPDateTime oldTimeStamp = timeStamp;
		timeStamp = newTimeStamp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.ALL_DATA__TIME_STAMP, oldTimeStamp, newTimeStamp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeStamp(IBISIPDateTime newTimeStamp) {
		if (newTimeStamp != timeStamp) {
			NotificationChain msgs = null;
			if (timeStamp != null)
				msgs = ((InternalEObject)timeStamp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.ALL_DATA__TIME_STAMP, null, msgs);
			if (newTimeStamp != null)
				msgs = ((InternalEObject)newTimeStamp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.ALL_DATA__TIME_STAMP, null, msgs);
			msgs = basicSetTimeStamp(newTimeStamp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.ALL_DATA__TIME_STAMP, newTimeStamp, newTimeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPNMTOKEN getVehicleRef() {
		return vehicleRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVehicleRef(IBISIPNMTOKEN newVehicleRef, NotificationChain msgs) {
		IBISIPNMTOKEN oldVehicleRef = vehicleRef;
		vehicleRef = newVehicleRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.ALL_DATA__VEHICLE_REF, oldVehicleRef, newVehicleRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVehicleRef(IBISIPNMTOKEN newVehicleRef) {
		if (newVehicleRef != vehicleRef) {
			NotificationChain msgs = null;
			if (vehicleRef != null)
				msgs = ((InternalEObject)vehicleRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.ALL_DATA__VEHICLE_REF, null, msgs);
			if (newVehicleRef != null)
				msgs = ((InternalEObject)newVehicleRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.ALL_DATA__VEHICLE_REF, null, msgs);
			msgs = basicSetVehicleRef(newVehicleRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.ALL_DATA__VEHICLE_REF, newVehicleRef, newVehicleRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPLanguage getDefaultLanguage() {
		return defaultLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultLanguage(IBISIPLanguage newDefaultLanguage, NotificationChain msgs) {
		IBISIPLanguage oldDefaultLanguage = defaultLanguage;
		defaultLanguage = newDefaultLanguage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.ALL_DATA__DEFAULT_LANGUAGE, oldDefaultLanguage, newDefaultLanguage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultLanguage(IBISIPLanguage newDefaultLanguage) {
		if (newDefaultLanguage != defaultLanguage) {
			NotificationChain msgs = null;
			if (defaultLanguage != null)
				msgs = ((InternalEObject)defaultLanguage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.ALL_DATA__DEFAULT_LANGUAGE, null, msgs);
			if (newDefaultLanguage != null)
				msgs = ((InternalEObject)newDefaultLanguage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.ALL_DATA__DEFAULT_LANGUAGE, null, msgs);
			msgs = basicSetDefaultLanguage(newDefaultLanguage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.ALL_DATA__DEFAULT_LANGUAGE, newDefaultLanguage, newDefaultLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TripInformation> getTripInformation() {
		if (tripInformation == null) {
			tripInformation = new EObjectContainmentEList<TripInformation>(TripInformation.class, this, IbisCustomerInformationServicePackage.ALL_DATA__TRIP_INFORMATION);
		}
		return tripInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPInt getCurrentStopIndex() {
		return currentStopIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentStopIndex(IBISIPInt newCurrentStopIndex, NotificationChain msgs) {
		IBISIPInt oldCurrentStopIndex = currentStopIndex;
		currentStopIndex = newCurrentStopIndex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.ALL_DATA__CURRENT_STOP_INDEX, oldCurrentStopIndex, newCurrentStopIndex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentStopIndex(IBISIPInt newCurrentStopIndex) {
		if (newCurrentStopIndex != currentStopIndex) {
			NotificationChain msgs = null;
			if (currentStopIndex != null)
				msgs = ((InternalEObject)currentStopIndex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.ALL_DATA__CURRENT_STOP_INDEX, null, msgs);
			if (newCurrentStopIndex != null)
				msgs = ((InternalEObject)newCurrentStopIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.ALL_DATA__CURRENT_STOP_INDEX, null, msgs);
			msgs = basicSetCurrentStopIndex(newCurrentStopIndex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.ALL_DATA__CURRENT_STOP_INDEX, newCurrentStopIndex, newCurrentStopIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RouteDeviationEnumeration getRouteDeviation() {
		return routeDeviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRouteDeviation(RouteDeviationEnumeration newRouteDeviation) {
		RouteDeviationEnumeration oldRouteDeviation = routeDeviation;
		routeDeviation = newRouteDeviation == null ? ROUTE_DEVIATION_EDEFAULT : newRouteDeviation;
		boolean oldRouteDeviationESet = routeDeviationESet;
		routeDeviationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.ALL_DATA__ROUTE_DEVIATION, oldRouteDeviation, routeDeviation, !oldRouteDeviationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRouteDeviation() {
		RouteDeviationEnumeration oldRouteDeviation = routeDeviation;
		boolean oldRouteDeviationESet = routeDeviationESet;
		routeDeviation = ROUTE_DEVIATION_EDEFAULT;
		routeDeviationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IbisCustomerInformationServicePackage.ALL_DATA__ROUTE_DEVIATION, oldRouteDeviation, ROUTE_DEVIATION_EDEFAULT, oldRouteDeviationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRouteDeviation() {
		return routeDeviationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoorOpenStateEnumeration getDoorState() {
		return doorState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoorState(DoorOpenStateEnumeration newDoorState) {
		DoorOpenStateEnumeration oldDoorState = doorState;
		doorState = newDoorState == null ? DOOR_STATE_EDEFAULT : newDoorState;
		boolean oldDoorStateESet = doorStateESet;
		doorStateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.ALL_DATA__DOOR_STATE, oldDoorState, doorState, !oldDoorStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDoorState() {
		DoorOpenStateEnumeration oldDoorState = doorState;
		boolean oldDoorStateESet = doorStateESet;
		doorState = DOOR_STATE_EDEFAULT;
		doorStateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IbisCustomerInformationServicePackage.ALL_DATA__DOOR_STATE, oldDoorState, DOOR_STATE_EDEFAULT, oldDoorStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDoorState() {
		return doorStateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPBoolean getInPanic() {
		return inPanic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInPanic(IBISIPBoolean newInPanic, NotificationChain msgs) {
		IBISIPBoolean oldInPanic = inPanic;
		inPanic = newInPanic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.ALL_DATA__IN_PANIC, oldInPanic, newInPanic);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInPanic(IBISIPBoolean newInPanic) {
		if (newInPanic != inPanic) {
			NotificationChain msgs = null;
			if (inPanic != null)
				msgs = ((InternalEObject)inPanic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.ALL_DATA__IN_PANIC, null, msgs);
			if (newInPanic != null)
				msgs = ((InternalEObject)newInPanic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.ALL_DATA__IN_PANIC, null, msgs);
			msgs = basicSetInPanic(newInPanic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.ALL_DATA__IN_PANIC, newInPanic, newInPanic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPBoolean getVehicleStopRequested() {
		return vehicleStopRequested;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVehicleStopRequested(IBISIPBoolean newVehicleStopRequested, NotificationChain msgs) {
		IBISIPBoolean oldVehicleStopRequested = vehicleStopRequested;
		vehicleStopRequested = newVehicleStopRequested;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.ALL_DATA__VEHICLE_STOP_REQUESTED, oldVehicleStopRequested, newVehicleStopRequested);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVehicleStopRequested(IBISIPBoolean newVehicleStopRequested) {
		if (newVehicleStopRequested != vehicleStopRequested) {
			NotificationChain msgs = null;
			if (vehicleStopRequested != null)
				msgs = ((InternalEObject)vehicleStopRequested).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.ALL_DATA__VEHICLE_STOP_REQUESTED, null, msgs);
			if (newVehicleStopRequested != null)
				msgs = ((InternalEObject)newVehicleStopRequested).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.ALL_DATA__VEHICLE_STOP_REQUESTED, null, msgs);
			msgs = basicSetVehicleStopRequested(newVehicleStopRequested, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.ALL_DATA__VEHICLE_STOP_REQUESTED, newVehicleStopRequested, newVehicleStopRequested));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExitSideEnumeration getExitSide() {
		return exitSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExitSide(ExitSideEnumeration newExitSide) {
		ExitSideEnumeration oldExitSide = exitSide;
		exitSide = newExitSide == null ? EXIT_SIDE_EDEFAULT : newExitSide;
		boolean oldExitSideESet = exitSideESet;
		exitSideESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.ALL_DATA__EXIT_SIDE, oldExitSide, exitSide, !oldExitSideESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetExitSide() {
		ExitSideEnumeration oldExitSide = exitSide;
		boolean oldExitSideESet = exitSideESet;
		exitSide = EXIT_SIDE_EDEFAULT;
		exitSideESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IbisCustomerInformationServicePackage.ALL_DATA__EXIT_SIDE, oldExitSide, EXIT_SIDE_EDEFAULT, oldExitSideESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetExitSide() {
		return exitSideESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPBoolean getMovingDirectionForward() {
		return movingDirectionForward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMovingDirectionForward(IBISIPBoolean newMovingDirectionForward, NotificationChain msgs) {
		IBISIPBoolean oldMovingDirectionForward = movingDirectionForward;
		movingDirectionForward = newMovingDirectionForward;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.ALL_DATA__MOVING_DIRECTION_FORWARD, oldMovingDirectionForward, newMovingDirectionForward);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMovingDirectionForward(IBISIPBoolean newMovingDirectionForward) {
		if (newMovingDirectionForward != movingDirectionForward) {
			NotificationChain msgs = null;
			if (movingDirectionForward != null)
				msgs = ((InternalEObject)movingDirectionForward).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.ALL_DATA__MOVING_DIRECTION_FORWARD, null, msgs);
			if (newMovingDirectionForward != null)
				msgs = ((InternalEObject)newMovingDirectionForward).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.ALL_DATA__MOVING_DIRECTION_FORWARD, null, msgs);
			msgs = basicSetMovingDirectionForward(newMovingDirectionForward, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.ALL_DATA__MOVING_DIRECTION_FORWARD, newMovingDirectionForward, newMovingDirectionForward));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VehicleModeEnumeration getVehicleMode() {
		return vehicleMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVehicleMode(VehicleModeEnumeration newVehicleMode) {
		VehicleModeEnumeration oldVehicleMode = vehicleMode;
		vehicleMode = newVehicleMode == null ? VEHICLE_MODE_EDEFAULT : newVehicleMode;
		boolean oldVehicleModeESet = vehicleModeESet;
		vehicleModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.ALL_DATA__VEHICLE_MODE, oldVehicleMode, vehicleMode, !oldVehicleModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetVehicleMode() {
		VehicleModeEnumeration oldVehicleMode = vehicleMode;
		boolean oldVehicleModeESet = vehicleModeESet;
		vehicleMode = VEHICLE_MODE_EDEFAULT;
		vehicleModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IbisCustomerInformationServicePackage.ALL_DATA__VEHICLE_MODE, oldVehicleMode, VEHICLE_MODE_EDEFAULT, oldVehicleModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetVehicleMode() {
		return vehicleModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetexMode getMyOwnVehicleMode() {
		return myOwnVehicleMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMyOwnVehicleMode(NetexMode newMyOwnVehicleMode, NotificationChain msgs) {
		NetexMode oldMyOwnVehicleMode = myOwnVehicleMode;
		myOwnVehicleMode = newMyOwnVehicleMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.ALL_DATA__MY_OWN_VEHICLE_MODE, oldMyOwnVehicleMode, newMyOwnVehicleMode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMyOwnVehicleMode(NetexMode newMyOwnVehicleMode) {
		if (newMyOwnVehicleMode != myOwnVehicleMode) {
			NotificationChain msgs = null;
			if (myOwnVehicleMode != null)
				msgs = ((InternalEObject)myOwnVehicleMode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.ALL_DATA__MY_OWN_VEHICLE_MODE, null, msgs);
			if (newMyOwnVehicleMode != null)
				msgs = ((InternalEObject)newMyOwnVehicleMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.ALL_DATA__MY_OWN_VEHICLE_MODE, null, msgs);
			msgs = basicSetMyOwnVehicleMode(newMyOwnVehicleMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.ALL_DATA__MY_OWN_VEHICLE_MODE, newMyOwnVehicleMode, newMyOwnVehicleMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPBoolean getSpeakerActive() {
		return speakerActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpeakerActive(IBISIPBoolean newSpeakerActive, NotificationChain msgs) {
		IBISIPBoolean oldSpeakerActive = speakerActive;
		speakerActive = newSpeakerActive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.ALL_DATA__SPEAKER_ACTIVE, oldSpeakerActive, newSpeakerActive);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpeakerActive(IBISIPBoolean newSpeakerActive) {
		if (newSpeakerActive != speakerActive) {
			NotificationChain msgs = null;
			if (speakerActive != null)
				msgs = ((InternalEObject)speakerActive).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.ALL_DATA__SPEAKER_ACTIVE, null, msgs);
			if (newSpeakerActive != null)
				msgs = ((InternalEObject)newSpeakerActive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.ALL_DATA__SPEAKER_ACTIVE, null, msgs);
			msgs = basicSetSpeakerActive(newSpeakerActive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.ALL_DATA__SPEAKER_ACTIVE, newSpeakerActive, newSpeakerActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPBoolean getStopInformationActive() {
		return stopInformationActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStopInformationActive(IBISIPBoolean newStopInformationActive, NotificationChain msgs) {
		IBISIPBoolean oldStopInformationActive = stopInformationActive;
		stopInformationActive = newStopInformationActive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.ALL_DATA__STOP_INFORMATION_ACTIVE, oldStopInformationActive, newStopInformationActive);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStopInformationActive(IBISIPBoolean newStopInformationActive) {
		if (newStopInformationActive != stopInformationActive) {
			NotificationChain msgs = null;
			if (stopInformationActive != null)
				msgs = ((InternalEObject)stopInformationActive).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.ALL_DATA__STOP_INFORMATION_ACTIVE, null, msgs);
			if (newStopInformationActive != null)
				msgs = ((InternalEObject)newStopInformationActive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.ALL_DATA__STOP_INFORMATION_ACTIVE, null, msgs);
			msgs = basicSetStopInformationActive(newStopInformationActive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.ALL_DATA__STOP_INFORMATION_ACTIVE, newStopInformationActive, newStopInformationActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TripStateEnumeration getTripState() {
		return tripState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTripState(TripStateEnumeration newTripState) {
		TripStateEnumeration oldTripState = tripState;
		tripState = newTripState == null ? TRIP_STATE_EDEFAULT : newTripState;
		boolean oldTripStateESet = tripStateESet;
		tripStateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.ALL_DATA__TRIP_STATE, oldTripState, tripState, !oldTripStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTripState() {
		TripStateEnumeration oldTripState = tripState;
		boolean oldTripStateESet = tripStateESet;
		tripState = TRIP_STATE_EDEFAULT;
		tripStateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IbisCustomerInformationServicePackage.ALL_DATA__TRIP_STATE, oldTripState, TRIP_STATE_EDEFAULT, oldTripStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTripState() {
		return tripStateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DisplayContent> getGlobalDisplayContent() {
		if (globalDisplayContent == null) {
			globalDisplayContent = new EObjectContainmentEList<DisplayContent>(DisplayContent.class, this, IbisCustomerInformationServicePackage.ALL_DATA__GLOBAL_DISPLAY_CONTENT);
		}
		return globalDisplayContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCustomerInformationServicePackage.ALL_DATA__TIME_STAMP:
				return basicSetTimeStamp(null, msgs);
			case IbisCustomerInformationServicePackage.ALL_DATA__VEHICLE_REF:
				return basicSetVehicleRef(null, msgs);
			case IbisCustomerInformationServicePackage.ALL_DATA__DEFAULT_LANGUAGE:
				return basicSetDefaultLanguage(null, msgs);
			case IbisCustomerInformationServicePackage.ALL_DATA__TRIP_INFORMATION:
				return ((InternalEList<?>)getTripInformation()).basicRemove(otherEnd, msgs);
			case IbisCustomerInformationServicePackage.ALL_DATA__CURRENT_STOP_INDEX:
				return basicSetCurrentStopIndex(null, msgs);
			case IbisCustomerInformationServicePackage.ALL_DATA__IN_PANIC:
				return basicSetInPanic(null, msgs);
			case IbisCustomerInformationServicePackage.ALL_DATA__VEHICLE_STOP_REQUESTED:
				return basicSetVehicleStopRequested(null, msgs);
			case IbisCustomerInformationServicePackage.ALL_DATA__MOVING_DIRECTION_FORWARD:
				return basicSetMovingDirectionForward(null, msgs);
			case IbisCustomerInformationServicePackage.ALL_DATA__MY_OWN_VEHICLE_MODE:
				return basicSetMyOwnVehicleMode(null, msgs);
			case IbisCustomerInformationServicePackage.ALL_DATA__SPEAKER_ACTIVE:
				return basicSetSpeakerActive(null, msgs);
			case IbisCustomerInformationServicePackage.ALL_DATA__STOP_INFORMATION_ACTIVE:
				return basicSetStopInformationActive(null, msgs);
			case IbisCustomerInformationServicePackage.ALL_DATA__GLOBAL_DISPLAY_CONTENT:
				return ((InternalEList<?>)getGlobalDisplayContent()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IbisCustomerInformationServicePackage.ALL_DATA__TIME_STAMP:
				return getTimeStamp();
			case IbisCustomerInformationServicePackage.ALL_DATA__VEHICLE_REF:
				return getVehicleRef();
			case IbisCustomerInformationServicePackage.ALL_DATA__DEFAULT_LANGUAGE:
				return getDefaultLanguage();
			case IbisCustomerInformationServicePackage.ALL_DATA__TRIP_INFORMATION:
				return getTripInformation();
			case IbisCustomerInformationServicePackage.ALL_DATA__CURRENT_STOP_INDEX:
				return getCurrentStopIndex();
			case IbisCustomerInformationServicePackage.ALL_DATA__ROUTE_DEVIATION:
				return getRouteDeviation();
			case IbisCustomerInformationServicePackage.ALL_DATA__DOOR_STATE:
				return getDoorState();
			case IbisCustomerInformationServicePackage.ALL_DATA__IN_PANIC:
				return getInPanic();
			case IbisCustomerInformationServicePackage.ALL_DATA__VEHICLE_STOP_REQUESTED:
				return getVehicleStopRequested();
			case IbisCustomerInformationServicePackage.ALL_DATA__EXIT_SIDE:
				return getExitSide();
			case IbisCustomerInformationServicePackage.ALL_DATA__MOVING_DIRECTION_FORWARD:
				return getMovingDirectionForward();
			case IbisCustomerInformationServicePackage.ALL_DATA__VEHICLE_MODE:
				return getVehicleMode();
			case IbisCustomerInformationServicePackage.ALL_DATA__MY_OWN_VEHICLE_MODE:
				return getMyOwnVehicleMode();
			case IbisCustomerInformationServicePackage.ALL_DATA__SPEAKER_ACTIVE:
				return getSpeakerActive();
			case IbisCustomerInformationServicePackage.ALL_DATA__STOP_INFORMATION_ACTIVE:
				return getStopInformationActive();
			case IbisCustomerInformationServicePackage.ALL_DATA__TRIP_STATE:
				return getTripState();
			case IbisCustomerInformationServicePackage.ALL_DATA__GLOBAL_DISPLAY_CONTENT:
				return getGlobalDisplayContent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IbisCustomerInformationServicePackage.ALL_DATA__TIME_STAMP:
				setTimeStamp((IBISIPDateTime)newValue);
				return;
			case IbisCustomerInformationServicePackage.ALL_DATA__VEHICLE_REF:
				setVehicleRef((IBISIPNMTOKEN)newValue);
				return;
			case IbisCustomerInformationServicePackage.ALL_DATA__DEFAULT_LANGUAGE:
				setDefaultLanguage((IBISIPLanguage)newValue);
				return;
			case IbisCustomerInformationServicePackage.ALL_DATA__TRIP_INFORMATION:
				getTripInformation().clear();
				getTripInformation().addAll((Collection<? extends TripInformation>)newValue);
				return;
			case IbisCustomerInformationServicePackage.ALL_DATA__CURRENT_STOP_INDEX:
				setCurrentStopIndex((IBISIPInt)newValue);
				return;
			case IbisCustomerInformationServicePackage.ALL_DATA__ROUTE_DEVIATION:
				setRouteDeviation((RouteDeviationEnumeration)newValue);
				return;
			case IbisCustomerInformationServicePackage.ALL_DATA__DOOR_STATE:
				setDoorState((DoorOpenStateEnumeration)newValue);
				return;
			case IbisCustomerInformationServicePackage.ALL_DATA__IN_PANIC:
				setInPanic((IBISIPBoolean)newValue);
				return;
			case IbisCustomerInformationServicePackage.ALL_DATA__VEHICLE_STOP_REQUESTED:
				setVehicleStopRequested((IBISIPBoolean)newValue);
				return;
			case IbisCustomerInformationServicePackage.ALL_DATA__EXIT_SIDE:
				setExitSide((ExitSideEnumeration)newValue);
				return;
			case IbisCustomerInformationServicePackage.ALL_DATA__MOVING_DIRECTION_FORWARD:
				setMovingDirectionForward((IBISIPBoolean)newValue);
				return;
			case IbisCustomerInformationServicePackage.ALL_DATA__VEHICLE_MODE:
				setVehicleMode((VehicleModeEnumeration)newValue);
				return;
			case IbisCustomerInformationServicePackage.ALL_DATA__MY_OWN_VEHICLE_MODE:
				setMyOwnVehicleMode((NetexMode)newValue);
				return;
			case IbisCustomerInformationServicePackage.ALL_DATA__SPEAKER_ACTIVE:
				setSpeakerActive((IBISIPBoolean)newValue);
				return;
			case IbisCustomerInformationServicePackage.ALL_DATA__STOP_INFORMATION_ACTIVE:
				setStopInformationActive((IBISIPBoolean)newValue);
				return;
			case IbisCustomerInformationServicePackage.ALL_DATA__TRIP_STATE:
				setTripState((TripStateEnumeration)newValue);
				return;
			case IbisCustomerInformationServicePackage.ALL_DATA__GLOBAL_DISPLAY_CONTENT:
				getGlobalDisplayContent().clear();
				getGlobalDisplayContent().addAll((Collection<? extends DisplayContent>)newValue);
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
			case IbisCustomerInformationServicePackage.ALL_DATA__TIME_STAMP:
				setTimeStamp((IBISIPDateTime)null);
				return;
			case IbisCustomerInformationServicePackage.ALL_DATA__VEHICLE_REF:
				setVehicleRef((IBISIPNMTOKEN)null);
				return;
			case IbisCustomerInformationServicePackage.ALL_DATA__DEFAULT_LANGUAGE:
				setDefaultLanguage((IBISIPLanguage)null);
				return;
			case IbisCustomerInformationServicePackage.ALL_DATA__TRIP_INFORMATION:
				getTripInformation().clear();
				return;
			case IbisCustomerInformationServicePackage.ALL_DATA__CURRENT_STOP_INDEX:
				setCurrentStopIndex((IBISIPInt)null);
				return;
			case IbisCustomerInformationServicePackage.ALL_DATA__ROUTE_DEVIATION:
				unsetRouteDeviation();
				return;
			case IbisCustomerInformationServicePackage.ALL_DATA__DOOR_STATE:
				unsetDoorState();
				return;
			case IbisCustomerInformationServicePackage.ALL_DATA__IN_PANIC:
				setInPanic((IBISIPBoolean)null);
				return;
			case IbisCustomerInformationServicePackage.ALL_DATA__VEHICLE_STOP_REQUESTED:
				setVehicleStopRequested((IBISIPBoolean)null);
				return;
			case IbisCustomerInformationServicePackage.ALL_DATA__EXIT_SIDE:
				unsetExitSide();
				return;
			case IbisCustomerInformationServicePackage.ALL_DATA__MOVING_DIRECTION_FORWARD:
				setMovingDirectionForward((IBISIPBoolean)null);
				return;
			case IbisCustomerInformationServicePackage.ALL_DATA__VEHICLE_MODE:
				unsetVehicleMode();
				return;
			case IbisCustomerInformationServicePackage.ALL_DATA__MY_OWN_VEHICLE_MODE:
				setMyOwnVehicleMode((NetexMode)null);
				return;
			case IbisCustomerInformationServicePackage.ALL_DATA__SPEAKER_ACTIVE:
				setSpeakerActive((IBISIPBoolean)null);
				return;
			case IbisCustomerInformationServicePackage.ALL_DATA__STOP_INFORMATION_ACTIVE:
				setStopInformationActive((IBISIPBoolean)null);
				return;
			case IbisCustomerInformationServicePackage.ALL_DATA__TRIP_STATE:
				unsetTripState();
				return;
			case IbisCustomerInformationServicePackage.ALL_DATA__GLOBAL_DISPLAY_CONTENT:
				getGlobalDisplayContent().clear();
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
			case IbisCustomerInformationServicePackage.ALL_DATA__TIME_STAMP:
				return timeStamp != null;
			case IbisCustomerInformationServicePackage.ALL_DATA__VEHICLE_REF:
				return vehicleRef != null;
			case IbisCustomerInformationServicePackage.ALL_DATA__DEFAULT_LANGUAGE:
				return defaultLanguage != null;
			case IbisCustomerInformationServicePackage.ALL_DATA__TRIP_INFORMATION:
				return tripInformation != null && !tripInformation.isEmpty();
			case IbisCustomerInformationServicePackage.ALL_DATA__CURRENT_STOP_INDEX:
				return currentStopIndex != null;
			case IbisCustomerInformationServicePackage.ALL_DATA__ROUTE_DEVIATION:
				return isSetRouteDeviation();
			case IbisCustomerInformationServicePackage.ALL_DATA__DOOR_STATE:
				return isSetDoorState();
			case IbisCustomerInformationServicePackage.ALL_DATA__IN_PANIC:
				return inPanic != null;
			case IbisCustomerInformationServicePackage.ALL_DATA__VEHICLE_STOP_REQUESTED:
				return vehicleStopRequested != null;
			case IbisCustomerInformationServicePackage.ALL_DATA__EXIT_SIDE:
				return isSetExitSide();
			case IbisCustomerInformationServicePackage.ALL_DATA__MOVING_DIRECTION_FORWARD:
				return movingDirectionForward != null;
			case IbisCustomerInformationServicePackage.ALL_DATA__VEHICLE_MODE:
				return isSetVehicleMode();
			case IbisCustomerInformationServicePackage.ALL_DATA__MY_OWN_VEHICLE_MODE:
				return myOwnVehicleMode != null;
			case IbisCustomerInformationServicePackage.ALL_DATA__SPEAKER_ACTIVE:
				return speakerActive != null;
			case IbisCustomerInformationServicePackage.ALL_DATA__STOP_INFORMATION_ACTIVE:
				return stopInformationActive != null;
			case IbisCustomerInformationServicePackage.ALL_DATA__TRIP_STATE:
				return isSetTripState();
			case IbisCustomerInformationServicePackage.ALL_DATA__GLOBAL_DISPLAY_CONTENT:
				return globalDisplayContent != null && !globalDisplayContent.isEmpty();
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
		result.append(" (routeDeviation: ");
		if (routeDeviationESet) result.append(routeDeviation); else result.append("<unset>");
		result.append(", doorState: ");
		if (doorStateESet) result.append(doorState); else result.append("<unset>");
		result.append(", exitSide: ");
		if (exitSideESet) result.append(exitSide); else result.append("<unset>");
		result.append(", vehicleMode: ");
		if (vehicleModeESet) result.append(vehicleMode); else result.append("<unset>");
		result.append(", tripState: ");
		if (tripStateESet) result.append(tripState); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AllDataImpl
