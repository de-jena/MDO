/*
 */
package de.jena.mdo.ibis.customerinformationservice.impl;

import de.jena.mdo.ibis.common.IBISIPBoolean;
import de.jena.mdo.ibis.common.IBISIPDateTime;
import de.jena.mdo.ibis.common.IBISIPNMTOKEN;
import de.jena.mdo.ibis.common.NetexMode;

import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceVehicleData;
import de.jena.mdo.ibis.customerinformationservice.IBISCustomerInformationServicePackage;

import de.jena.mdo.ibis.enumerations.DoorOpenStateEnumeration;
import de.jena.mdo.ibis.enumerations.ExitSideEnumeration;
import de.jena.mdo.ibis.enumerations.RouteDeviationEnumeration;
import de.jena.mdo.ibis.enumerations.TripStateEnumeration;
import de.jena.mdo.ibis.enumerations.VehicleModeEnumeration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer Information Service Vehicle Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceVehicleDataImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceVehicleDataImpl#getVehicleRef <em>Vehicle Ref</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceVehicleDataImpl#getRouteDeviation <em>Route Deviation</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceVehicleDataImpl#getDoorState <em>Door State</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceVehicleDataImpl#getInPanic <em>In Panic</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceVehicleDataImpl#getVehicleStopRequested <em>Vehicle Stop Requested</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceVehicleDataImpl#getExitSide <em>Exit Side</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceVehicleDataImpl#getMovingDirectionForward <em>Moving Direction Forward</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceVehicleDataImpl#getVehicleMode <em>Vehicle Mode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceVehicleDataImpl#getMyOwnVehicleMode <em>My Own Vehicle Mode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceVehicleDataImpl#getSpeakerActive <em>Speaker Active</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceVehicleDataImpl#getStopInformationActive <em>Stop Information Active</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceVehicleDataImpl#getTripState <em>Trip State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerInformationServiceVehicleDataImpl extends MinimalEObjectImpl.Container implements CustomerInformationServiceVehicleData {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerInformationServiceVehicleDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IBISCustomerInformationServicePackage.eINSTANCE.getCustomerInformationServiceVehicleData();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__TIME_STAMP, oldTimeStamp, newTimeStamp);
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
				msgs = ((InternalEObject)timeStamp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__TIME_STAMP, null, msgs);
			if (newTimeStamp != null)
				msgs = ((InternalEObject)newTimeStamp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__TIME_STAMP, null, msgs);
			msgs = basicSetTimeStamp(newTimeStamp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__TIME_STAMP, newTimeStamp, newTimeStamp));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__VEHICLE_REF, oldVehicleRef, newVehicleRef);
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
				msgs = ((InternalEObject)vehicleRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__VEHICLE_REF, null, msgs);
			if (newVehicleRef != null)
				msgs = ((InternalEObject)newVehicleRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__VEHICLE_REF, null, msgs);
			msgs = basicSetVehicleRef(newVehicleRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__VEHICLE_REF, newVehicleRef, newVehicleRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__ROUTE_DEVIATION, oldRouteDeviation, routeDeviation, !oldRouteDeviationESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__ROUTE_DEVIATION, oldRouteDeviation, ROUTE_DEVIATION_EDEFAULT, oldRouteDeviationESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__DOOR_STATE, oldDoorState, doorState, !oldDoorStateESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__DOOR_STATE, oldDoorState, DOOR_STATE_EDEFAULT, oldDoorStateESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__IN_PANIC, oldInPanic, newInPanic);
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
				msgs = ((InternalEObject)inPanic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__IN_PANIC, null, msgs);
			if (newInPanic != null)
				msgs = ((InternalEObject)newInPanic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__IN_PANIC, null, msgs);
			msgs = basicSetInPanic(newInPanic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__IN_PANIC, newInPanic, newInPanic));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__VEHICLE_STOP_REQUESTED, oldVehicleStopRequested, newVehicleStopRequested);
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
				msgs = ((InternalEObject)vehicleStopRequested).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__VEHICLE_STOP_REQUESTED, null, msgs);
			if (newVehicleStopRequested != null)
				msgs = ((InternalEObject)newVehicleStopRequested).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__VEHICLE_STOP_REQUESTED, null, msgs);
			msgs = basicSetVehicleStopRequested(newVehicleStopRequested, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__VEHICLE_STOP_REQUESTED, newVehicleStopRequested, newVehicleStopRequested));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__EXIT_SIDE, oldExitSide, exitSide, !oldExitSideESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__EXIT_SIDE, oldExitSide, EXIT_SIDE_EDEFAULT, oldExitSideESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__MOVING_DIRECTION_FORWARD, oldMovingDirectionForward, newMovingDirectionForward);
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
				msgs = ((InternalEObject)movingDirectionForward).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__MOVING_DIRECTION_FORWARD, null, msgs);
			if (newMovingDirectionForward != null)
				msgs = ((InternalEObject)newMovingDirectionForward).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__MOVING_DIRECTION_FORWARD, null, msgs);
			msgs = basicSetMovingDirectionForward(newMovingDirectionForward, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__MOVING_DIRECTION_FORWARD, newMovingDirectionForward, newMovingDirectionForward));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__VEHICLE_MODE, oldVehicleMode, vehicleMode, !oldVehicleModeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__VEHICLE_MODE, oldVehicleMode, VEHICLE_MODE_EDEFAULT, oldVehicleModeESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__MY_OWN_VEHICLE_MODE, oldMyOwnVehicleMode, newMyOwnVehicleMode);
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
				msgs = ((InternalEObject)myOwnVehicleMode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__MY_OWN_VEHICLE_MODE, null, msgs);
			if (newMyOwnVehicleMode != null)
				msgs = ((InternalEObject)newMyOwnVehicleMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__MY_OWN_VEHICLE_MODE, null, msgs);
			msgs = basicSetMyOwnVehicleMode(newMyOwnVehicleMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__MY_OWN_VEHICLE_MODE, newMyOwnVehicleMode, newMyOwnVehicleMode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__SPEAKER_ACTIVE, oldSpeakerActive, newSpeakerActive);
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
				msgs = ((InternalEObject)speakerActive).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__SPEAKER_ACTIVE, null, msgs);
			if (newSpeakerActive != null)
				msgs = ((InternalEObject)newSpeakerActive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__SPEAKER_ACTIVE, null, msgs);
			msgs = basicSetSpeakerActive(newSpeakerActive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__SPEAKER_ACTIVE, newSpeakerActive, newSpeakerActive));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__STOP_INFORMATION_ACTIVE, oldStopInformationActive, newStopInformationActive);
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
				msgs = ((InternalEObject)stopInformationActive).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__STOP_INFORMATION_ACTIVE, null, msgs);
			if (newStopInformationActive != null)
				msgs = ((InternalEObject)newStopInformationActive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__STOP_INFORMATION_ACTIVE, null, msgs);
			msgs = basicSetStopInformationActive(newStopInformationActive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__STOP_INFORMATION_ACTIVE, newStopInformationActive, newStopInformationActive));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__TRIP_STATE, oldTripState, tripState, !oldTripStateESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__TRIP_STATE, oldTripState, TRIP_STATE_EDEFAULT, oldTripStateESet));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__TIME_STAMP:
				return basicSetTimeStamp(null, msgs);
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__VEHICLE_REF:
				return basicSetVehicleRef(null, msgs);
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__IN_PANIC:
				return basicSetInPanic(null, msgs);
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__VEHICLE_STOP_REQUESTED:
				return basicSetVehicleStopRequested(null, msgs);
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__MOVING_DIRECTION_FORWARD:
				return basicSetMovingDirectionForward(null, msgs);
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__MY_OWN_VEHICLE_MODE:
				return basicSetMyOwnVehicleMode(null, msgs);
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__SPEAKER_ACTIVE:
				return basicSetSpeakerActive(null, msgs);
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__STOP_INFORMATION_ACTIVE:
				return basicSetStopInformationActive(null, msgs);
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
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__TIME_STAMP:
				return getTimeStamp();
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__VEHICLE_REF:
				return getVehicleRef();
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__ROUTE_DEVIATION:
				return getRouteDeviation();
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__DOOR_STATE:
				return getDoorState();
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__IN_PANIC:
				return getInPanic();
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__VEHICLE_STOP_REQUESTED:
				return getVehicleStopRequested();
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__EXIT_SIDE:
				return getExitSide();
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__MOVING_DIRECTION_FORWARD:
				return getMovingDirectionForward();
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__VEHICLE_MODE:
				return getVehicleMode();
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__MY_OWN_VEHICLE_MODE:
				return getMyOwnVehicleMode();
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__SPEAKER_ACTIVE:
				return getSpeakerActive();
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__STOP_INFORMATION_ACTIVE:
				return getStopInformationActive();
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__TRIP_STATE:
				return getTripState();
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
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__TIME_STAMP:
				setTimeStamp((IBISIPDateTime)newValue);
				return;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__VEHICLE_REF:
				setVehicleRef((IBISIPNMTOKEN)newValue);
				return;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__ROUTE_DEVIATION:
				setRouteDeviation((RouteDeviationEnumeration)newValue);
				return;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__DOOR_STATE:
				setDoorState((DoorOpenStateEnumeration)newValue);
				return;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__IN_PANIC:
				setInPanic((IBISIPBoolean)newValue);
				return;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__VEHICLE_STOP_REQUESTED:
				setVehicleStopRequested((IBISIPBoolean)newValue);
				return;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__EXIT_SIDE:
				setExitSide((ExitSideEnumeration)newValue);
				return;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__MOVING_DIRECTION_FORWARD:
				setMovingDirectionForward((IBISIPBoolean)newValue);
				return;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__VEHICLE_MODE:
				setVehicleMode((VehicleModeEnumeration)newValue);
				return;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__MY_OWN_VEHICLE_MODE:
				setMyOwnVehicleMode((NetexMode)newValue);
				return;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__SPEAKER_ACTIVE:
				setSpeakerActive((IBISIPBoolean)newValue);
				return;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__STOP_INFORMATION_ACTIVE:
				setStopInformationActive((IBISIPBoolean)newValue);
				return;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__TRIP_STATE:
				setTripState((TripStateEnumeration)newValue);
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
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__TIME_STAMP:
				setTimeStamp((IBISIPDateTime)null);
				return;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__VEHICLE_REF:
				setVehicleRef((IBISIPNMTOKEN)null);
				return;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__ROUTE_DEVIATION:
				unsetRouteDeviation();
				return;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__DOOR_STATE:
				unsetDoorState();
				return;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__IN_PANIC:
				setInPanic((IBISIPBoolean)null);
				return;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__VEHICLE_STOP_REQUESTED:
				setVehicleStopRequested((IBISIPBoolean)null);
				return;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__EXIT_SIDE:
				unsetExitSide();
				return;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__MOVING_DIRECTION_FORWARD:
				setMovingDirectionForward((IBISIPBoolean)null);
				return;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__VEHICLE_MODE:
				unsetVehicleMode();
				return;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__MY_OWN_VEHICLE_MODE:
				setMyOwnVehicleMode((NetexMode)null);
				return;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__SPEAKER_ACTIVE:
				setSpeakerActive((IBISIPBoolean)null);
				return;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__STOP_INFORMATION_ACTIVE:
				setStopInformationActive((IBISIPBoolean)null);
				return;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__TRIP_STATE:
				unsetTripState();
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
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__TIME_STAMP:
				return timeStamp != null;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__VEHICLE_REF:
				return vehicleRef != null;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__ROUTE_DEVIATION:
				return isSetRouteDeviation();
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__DOOR_STATE:
				return isSetDoorState();
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__IN_PANIC:
				return inPanic != null;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__VEHICLE_STOP_REQUESTED:
				return vehicleStopRequested != null;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__EXIT_SIDE:
				return isSetExitSide();
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__MOVING_DIRECTION_FORWARD:
				return movingDirectionForward != null;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__VEHICLE_MODE:
				return isSetVehicleMode();
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__MY_OWN_VEHICLE_MODE:
				return myOwnVehicleMode != null;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__SPEAKER_ACTIVE:
				return speakerActive != null;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__STOP_INFORMATION_ACTIVE:
				return stopInformationActive != null;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_VEHICLE_DATA__TRIP_STATE:
				return isSetTripState();
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

} //CustomerInformationServiceVehicleDataImpl