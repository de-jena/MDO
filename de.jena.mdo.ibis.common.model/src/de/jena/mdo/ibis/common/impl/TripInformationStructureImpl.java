/*
 */
package de.jena.mdo.ibis.common.impl;

import de.jena.mdo.ibis.common.AdditionalAnnouncementStructure;
import de.jena.mdo.ibis.common.IBISIPInt;
import de.jena.mdo.ibis.common.IBISIPNMTOKEN;
import de.jena.mdo.ibis.common.IbisCommonPackage;
import de.jena.mdo.ibis.common.InternationalTextType;
import de.jena.mdo.ibis.common.StopSequenceStructure;
import de.jena.mdo.ibis.common.TripInformationStructure;

import de.jena.mdo.ibis.enumerations.LocationStateEnumeration;
import de.jena.mdo.ibis.enumerations.RouteDirectionEnumeration;

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
 * An implementation of the model object '<em><b>Trip Information Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.impl.TripInformationStructureImpl#getTripRef <em>Trip Ref</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.TripInformationStructureImpl#getStopSequence <em>Stop Sequence</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.TripInformationStructureImpl#getLocationState <em>Location State</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.TripInformationStructureImpl#getTimetableDelay <em>Timetable Delay</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.TripInformationStructureImpl#getAdditionalTextMessage <em>Additional Text Message</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.TripInformationStructureImpl#getAdditionalTextMessage1 <em>Additional Text Message1</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.TripInformationStructureImpl#getAdditionalTextMessage2 <em>Additional Text Message2</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.TripInformationStructureImpl#getAdditionalTextMessage3 <em>Additional Text Message3</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.TripInformationStructureImpl#getAdditionalTextMessage4 <em>Additional Text Message4</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.TripInformationStructureImpl#getAdditionalTextMessage5 <em>Additional Text Message5</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.TripInformationStructureImpl#getAdditionalTextMessage6 <em>Additional Text Message6</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.TripInformationStructureImpl#getAdditionalTextMessage7 <em>Additional Text Message7</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.TripInformationStructureImpl#getAdditionalTextMessage8 <em>Additional Text Message8</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.TripInformationStructureImpl#getAdditionalTextMessage9 <em>Additional Text Message9</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.TripInformationStructureImpl#getAdditionalAnnouncement <em>Additional Announcement</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.TripInformationStructureImpl#getRouteDirection <em>Route Direction</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.TripInformationStructureImpl#getRunNumber <em>Run Number</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.TripInformationStructureImpl#getPatternNumber <em>Pattern Number</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.TripInformationStructureImpl#getPathDestinationNumber <em>Path Destination Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TripInformationStructureImpl extends MinimalEObjectImpl.Container implements TripInformationStructure {
	/**
	 * The cached value of the '{@link #getTripRef() <em>Trip Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTripRef()
	 * @generated
	 * @ordered
	 */
	protected IBISIPNMTOKEN tripRef;

	/**
	 * The cached value of the '{@link #getStopSequence() <em>Stop Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopSequence()
	 * @generated
	 * @ordered
	 */
	protected StopSequenceStructure stopSequence;

	/**
	 * The default value of the '{@link #getLocationState() <em>Location State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationState()
	 * @generated
	 * @ordered
	 */
	protected static final LocationStateEnumeration LOCATION_STATE_EDEFAULT = LocationStateEnumeration.AFTER_STOP;

	/**
	 * The cached value of the '{@link #getLocationState() <em>Location State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationState()
	 * @generated
	 * @ordered
	 */
	protected LocationStateEnumeration locationState = LOCATION_STATE_EDEFAULT;

	/**
	 * This is true if the Location State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean locationStateESet;

	/**
	 * The cached value of the '{@link #getTimetableDelay() <em>Timetable Delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimetableDelay()
	 * @generated
	 * @ordered
	 */
	protected IBISIPInt timetableDelay;

	/**
	 * The cached value of the '{@link #getAdditionalTextMessage() <em>Additional Text Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalTextMessage()
	 * @generated
	 * @ordered
	 */
	protected InternationalTextType additionalTextMessage;

	/**
	 * The cached value of the '{@link #getAdditionalTextMessage1() <em>Additional Text Message1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalTextMessage1()
	 * @generated
	 * @ordered
	 */
	protected InternationalTextType additionalTextMessage1;

	/**
	 * The cached value of the '{@link #getAdditionalTextMessage2() <em>Additional Text Message2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalTextMessage2()
	 * @generated
	 * @ordered
	 */
	protected InternationalTextType additionalTextMessage2;

	/**
	 * The cached value of the '{@link #getAdditionalTextMessage3() <em>Additional Text Message3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalTextMessage3()
	 * @generated
	 * @ordered
	 */
	protected InternationalTextType additionalTextMessage3;

	/**
	 * The cached value of the '{@link #getAdditionalTextMessage4() <em>Additional Text Message4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalTextMessage4()
	 * @generated
	 * @ordered
	 */
	protected InternationalTextType additionalTextMessage4;

	/**
	 * The cached value of the '{@link #getAdditionalTextMessage5() <em>Additional Text Message5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalTextMessage5()
	 * @generated
	 * @ordered
	 */
	protected InternationalTextType additionalTextMessage5;

	/**
	 * The cached value of the '{@link #getAdditionalTextMessage6() <em>Additional Text Message6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalTextMessage6()
	 * @generated
	 * @ordered
	 */
	protected InternationalTextType additionalTextMessage6;

	/**
	 * The cached value of the '{@link #getAdditionalTextMessage7() <em>Additional Text Message7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalTextMessage7()
	 * @generated
	 * @ordered
	 */
	protected InternationalTextType additionalTextMessage7;

	/**
	 * The cached value of the '{@link #getAdditionalTextMessage8() <em>Additional Text Message8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalTextMessage8()
	 * @generated
	 * @ordered
	 */
	protected InternationalTextType additionalTextMessage8;

	/**
	 * The cached value of the '{@link #getAdditionalTextMessage9() <em>Additional Text Message9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalTextMessage9()
	 * @generated
	 * @ordered
	 */
	protected InternationalTextType additionalTextMessage9;

	/**
	 * The cached value of the '{@link #getAdditionalAnnouncement() <em>Additional Announcement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalAnnouncement()
	 * @generated
	 * @ordered
	 */
	protected EList<AdditionalAnnouncementStructure> additionalAnnouncement;

	/**
	 * The default value of the '{@link #getRouteDirection() <em>Route Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteDirection()
	 * @generated
	 * @ordered
	 */
	protected static final RouteDirectionEnumeration ROUTE_DIRECTION_EDEFAULT = RouteDirectionEnumeration.FORWARD;

	/**
	 * The cached value of the '{@link #getRouteDirection() <em>Route Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteDirection()
	 * @generated
	 * @ordered
	 */
	protected RouteDirectionEnumeration routeDirection = ROUTE_DIRECTION_EDEFAULT;

	/**
	 * This is true if the Route Direction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean routeDirectionESet;

	/**
	 * The cached value of the '{@link #getRunNumber() <em>Run Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunNumber()
	 * @generated
	 * @ordered
	 */
	protected IBISIPInt runNumber;

	/**
	 * The cached value of the '{@link #getPatternNumber() <em>Pattern Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternNumber()
	 * @generated
	 * @ordered
	 */
	protected IBISIPInt patternNumber;

	/**
	 * The cached value of the '{@link #getPathDestinationNumber() <em>Path Destination Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathDestinationNumber()
	 * @generated
	 * @ordered
	 */
	protected IBISIPInt pathDestinationNumber;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TripInformationStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.eINSTANCE.getTripInformationStructure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPNMTOKEN getTripRef() {
		return tripRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTripRef(IBISIPNMTOKEN newTripRef, NotificationChain msgs) {
		IBISIPNMTOKEN oldTripRef = tripRef;
		tripRef = newTripRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__TRIP_REF, oldTripRef, newTripRef);
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
	public void setTripRef(IBISIPNMTOKEN newTripRef) {
		if (newTripRef != tripRef) {
			NotificationChain msgs = null;
			if (tripRef != null)
				msgs = ((InternalEObject)tripRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__TRIP_REF, null, msgs);
			if (newTripRef != null)
				msgs = ((InternalEObject)newTripRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__TRIP_REF, null, msgs);
			msgs = basicSetTripRef(newTripRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__TRIP_REF, newTripRef, newTripRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StopSequenceStructure getStopSequence() {
		return stopSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStopSequence(StopSequenceStructure newStopSequence, NotificationChain msgs) {
		StopSequenceStructure oldStopSequence = stopSequence;
		stopSequence = newStopSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__STOP_SEQUENCE, oldStopSequence, newStopSequence);
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
	public void setStopSequence(StopSequenceStructure newStopSequence) {
		if (newStopSequence != stopSequence) {
			NotificationChain msgs = null;
			if (stopSequence != null)
				msgs = ((InternalEObject)stopSequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__STOP_SEQUENCE, null, msgs);
			if (newStopSequence != null)
				msgs = ((InternalEObject)newStopSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__STOP_SEQUENCE, null, msgs);
			msgs = basicSetStopSequence(newStopSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__STOP_SEQUENCE, newStopSequence, newStopSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocationStateEnumeration getLocationState() {
		return locationState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocationState(LocationStateEnumeration newLocationState) {
		LocationStateEnumeration oldLocationState = locationState;
		locationState = newLocationState == null ? LOCATION_STATE_EDEFAULT : newLocationState;
		boolean oldLocationStateESet = locationStateESet;
		locationStateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__LOCATION_STATE, oldLocationState, locationState, !oldLocationStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLocationState() {
		LocationStateEnumeration oldLocationState = locationState;
		boolean oldLocationStateESet = locationStateESet;
		locationState = LOCATION_STATE_EDEFAULT;
		locationStateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__LOCATION_STATE, oldLocationState, LOCATION_STATE_EDEFAULT, oldLocationStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetLocationState() {
		return locationStateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPInt getTimetableDelay() {
		return timetableDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimetableDelay(IBISIPInt newTimetableDelay, NotificationChain msgs) {
		IBISIPInt oldTimetableDelay = timetableDelay;
		timetableDelay = newTimetableDelay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__TIMETABLE_DELAY, oldTimetableDelay, newTimetableDelay);
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
	public void setTimetableDelay(IBISIPInt newTimetableDelay) {
		if (newTimetableDelay != timetableDelay) {
			NotificationChain msgs = null;
			if (timetableDelay != null)
				msgs = ((InternalEObject)timetableDelay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__TIMETABLE_DELAY, null, msgs);
			if (newTimetableDelay != null)
				msgs = ((InternalEObject)newTimetableDelay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__TIMETABLE_DELAY, null, msgs);
			msgs = basicSetTimetableDelay(newTimetableDelay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__TIMETABLE_DELAY, newTimetableDelay, newTimetableDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternationalTextType getAdditionalTextMessage() {
		return additionalTextMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditionalTextMessage(InternationalTextType newAdditionalTextMessage, NotificationChain msgs) {
		InternationalTextType oldAdditionalTextMessage = additionalTextMessage;
		additionalTextMessage = newAdditionalTextMessage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE, oldAdditionalTextMessage, newAdditionalTextMessage);
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
	public void setAdditionalTextMessage(InternationalTextType newAdditionalTextMessage) {
		if (newAdditionalTextMessage != additionalTextMessage) {
			NotificationChain msgs = null;
			if (additionalTextMessage != null)
				msgs = ((InternalEObject)additionalTextMessage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE, null, msgs);
			if (newAdditionalTextMessage != null)
				msgs = ((InternalEObject)newAdditionalTextMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE, null, msgs);
			msgs = basicSetAdditionalTextMessage(newAdditionalTextMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE, newAdditionalTextMessage, newAdditionalTextMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternationalTextType getAdditionalTextMessage1() {
		return additionalTextMessage1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditionalTextMessage1(InternationalTextType newAdditionalTextMessage1, NotificationChain msgs) {
		InternationalTextType oldAdditionalTextMessage1 = additionalTextMessage1;
		additionalTextMessage1 = newAdditionalTextMessage1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE1, oldAdditionalTextMessage1, newAdditionalTextMessage1);
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
	public void setAdditionalTextMessage1(InternationalTextType newAdditionalTextMessage1) {
		if (newAdditionalTextMessage1 != additionalTextMessage1) {
			NotificationChain msgs = null;
			if (additionalTextMessage1 != null)
				msgs = ((InternalEObject)additionalTextMessage1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE1, null, msgs);
			if (newAdditionalTextMessage1 != null)
				msgs = ((InternalEObject)newAdditionalTextMessage1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE1, null, msgs);
			msgs = basicSetAdditionalTextMessage1(newAdditionalTextMessage1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE1, newAdditionalTextMessage1, newAdditionalTextMessage1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternationalTextType getAdditionalTextMessage2() {
		return additionalTextMessage2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditionalTextMessage2(InternationalTextType newAdditionalTextMessage2, NotificationChain msgs) {
		InternationalTextType oldAdditionalTextMessage2 = additionalTextMessage2;
		additionalTextMessage2 = newAdditionalTextMessage2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE2, oldAdditionalTextMessage2, newAdditionalTextMessage2);
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
	public void setAdditionalTextMessage2(InternationalTextType newAdditionalTextMessage2) {
		if (newAdditionalTextMessage2 != additionalTextMessage2) {
			NotificationChain msgs = null;
			if (additionalTextMessage2 != null)
				msgs = ((InternalEObject)additionalTextMessage2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE2, null, msgs);
			if (newAdditionalTextMessage2 != null)
				msgs = ((InternalEObject)newAdditionalTextMessage2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE2, null, msgs);
			msgs = basicSetAdditionalTextMessage2(newAdditionalTextMessage2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE2, newAdditionalTextMessage2, newAdditionalTextMessage2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternationalTextType getAdditionalTextMessage3() {
		return additionalTextMessage3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditionalTextMessage3(InternationalTextType newAdditionalTextMessage3, NotificationChain msgs) {
		InternationalTextType oldAdditionalTextMessage3 = additionalTextMessage3;
		additionalTextMessage3 = newAdditionalTextMessage3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE3, oldAdditionalTextMessage3, newAdditionalTextMessage3);
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
	public void setAdditionalTextMessage3(InternationalTextType newAdditionalTextMessage3) {
		if (newAdditionalTextMessage3 != additionalTextMessage3) {
			NotificationChain msgs = null;
			if (additionalTextMessage3 != null)
				msgs = ((InternalEObject)additionalTextMessage3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE3, null, msgs);
			if (newAdditionalTextMessage3 != null)
				msgs = ((InternalEObject)newAdditionalTextMessage3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE3, null, msgs);
			msgs = basicSetAdditionalTextMessage3(newAdditionalTextMessage3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE3, newAdditionalTextMessage3, newAdditionalTextMessage3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternationalTextType getAdditionalTextMessage4() {
		return additionalTextMessage4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditionalTextMessage4(InternationalTextType newAdditionalTextMessage4, NotificationChain msgs) {
		InternationalTextType oldAdditionalTextMessage4 = additionalTextMessage4;
		additionalTextMessage4 = newAdditionalTextMessage4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE4, oldAdditionalTextMessage4, newAdditionalTextMessage4);
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
	public void setAdditionalTextMessage4(InternationalTextType newAdditionalTextMessage4) {
		if (newAdditionalTextMessage4 != additionalTextMessage4) {
			NotificationChain msgs = null;
			if (additionalTextMessage4 != null)
				msgs = ((InternalEObject)additionalTextMessage4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE4, null, msgs);
			if (newAdditionalTextMessage4 != null)
				msgs = ((InternalEObject)newAdditionalTextMessage4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE4, null, msgs);
			msgs = basicSetAdditionalTextMessage4(newAdditionalTextMessage4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE4, newAdditionalTextMessage4, newAdditionalTextMessage4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternationalTextType getAdditionalTextMessage5() {
		return additionalTextMessage5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditionalTextMessage5(InternationalTextType newAdditionalTextMessage5, NotificationChain msgs) {
		InternationalTextType oldAdditionalTextMessage5 = additionalTextMessage5;
		additionalTextMessage5 = newAdditionalTextMessage5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE5, oldAdditionalTextMessage5, newAdditionalTextMessage5);
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
	public void setAdditionalTextMessage5(InternationalTextType newAdditionalTextMessage5) {
		if (newAdditionalTextMessage5 != additionalTextMessage5) {
			NotificationChain msgs = null;
			if (additionalTextMessage5 != null)
				msgs = ((InternalEObject)additionalTextMessage5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE5, null, msgs);
			if (newAdditionalTextMessage5 != null)
				msgs = ((InternalEObject)newAdditionalTextMessage5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE5, null, msgs);
			msgs = basicSetAdditionalTextMessage5(newAdditionalTextMessage5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE5, newAdditionalTextMessage5, newAdditionalTextMessage5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternationalTextType getAdditionalTextMessage6() {
		return additionalTextMessage6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditionalTextMessage6(InternationalTextType newAdditionalTextMessage6, NotificationChain msgs) {
		InternationalTextType oldAdditionalTextMessage6 = additionalTextMessage6;
		additionalTextMessage6 = newAdditionalTextMessage6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE6, oldAdditionalTextMessage6, newAdditionalTextMessage6);
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
	public void setAdditionalTextMessage6(InternationalTextType newAdditionalTextMessage6) {
		if (newAdditionalTextMessage6 != additionalTextMessage6) {
			NotificationChain msgs = null;
			if (additionalTextMessage6 != null)
				msgs = ((InternalEObject)additionalTextMessage6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE6, null, msgs);
			if (newAdditionalTextMessage6 != null)
				msgs = ((InternalEObject)newAdditionalTextMessage6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE6, null, msgs);
			msgs = basicSetAdditionalTextMessage6(newAdditionalTextMessage6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE6, newAdditionalTextMessage6, newAdditionalTextMessage6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternationalTextType getAdditionalTextMessage7() {
		return additionalTextMessage7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditionalTextMessage7(InternationalTextType newAdditionalTextMessage7, NotificationChain msgs) {
		InternationalTextType oldAdditionalTextMessage7 = additionalTextMessage7;
		additionalTextMessage7 = newAdditionalTextMessage7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE7, oldAdditionalTextMessage7, newAdditionalTextMessage7);
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
	public void setAdditionalTextMessage7(InternationalTextType newAdditionalTextMessage7) {
		if (newAdditionalTextMessage7 != additionalTextMessage7) {
			NotificationChain msgs = null;
			if (additionalTextMessage7 != null)
				msgs = ((InternalEObject)additionalTextMessage7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE7, null, msgs);
			if (newAdditionalTextMessage7 != null)
				msgs = ((InternalEObject)newAdditionalTextMessage7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE7, null, msgs);
			msgs = basicSetAdditionalTextMessage7(newAdditionalTextMessage7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE7, newAdditionalTextMessage7, newAdditionalTextMessage7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternationalTextType getAdditionalTextMessage8() {
		return additionalTextMessage8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditionalTextMessage8(InternationalTextType newAdditionalTextMessage8, NotificationChain msgs) {
		InternationalTextType oldAdditionalTextMessage8 = additionalTextMessage8;
		additionalTextMessage8 = newAdditionalTextMessage8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE8, oldAdditionalTextMessage8, newAdditionalTextMessage8);
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
	public void setAdditionalTextMessage8(InternationalTextType newAdditionalTextMessage8) {
		if (newAdditionalTextMessage8 != additionalTextMessage8) {
			NotificationChain msgs = null;
			if (additionalTextMessage8 != null)
				msgs = ((InternalEObject)additionalTextMessage8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE8, null, msgs);
			if (newAdditionalTextMessage8 != null)
				msgs = ((InternalEObject)newAdditionalTextMessage8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE8, null, msgs);
			msgs = basicSetAdditionalTextMessage8(newAdditionalTextMessage8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE8, newAdditionalTextMessage8, newAdditionalTextMessage8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternationalTextType getAdditionalTextMessage9() {
		return additionalTextMessage9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditionalTextMessage9(InternationalTextType newAdditionalTextMessage9, NotificationChain msgs) {
		InternationalTextType oldAdditionalTextMessage9 = additionalTextMessage9;
		additionalTextMessage9 = newAdditionalTextMessage9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE9, oldAdditionalTextMessage9, newAdditionalTextMessage9);
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
	public void setAdditionalTextMessage9(InternationalTextType newAdditionalTextMessage9) {
		if (newAdditionalTextMessage9 != additionalTextMessage9) {
			NotificationChain msgs = null;
			if (additionalTextMessage9 != null)
				msgs = ((InternalEObject)additionalTextMessage9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE9, null, msgs);
			if (newAdditionalTextMessage9 != null)
				msgs = ((InternalEObject)newAdditionalTextMessage9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE9, null, msgs);
			msgs = basicSetAdditionalTextMessage9(newAdditionalTextMessage9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE9, newAdditionalTextMessage9, newAdditionalTextMessage9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AdditionalAnnouncementStructure> getAdditionalAnnouncement() {
		if (additionalAnnouncement == null) {
			additionalAnnouncement = new EObjectContainmentEList<AdditionalAnnouncementStructure>(AdditionalAnnouncementStructure.class, this, IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_ANNOUNCEMENT);
		}
		return additionalAnnouncement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RouteDirectionEnumeration getRouteDirection() {
		return routeDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRouteDirection(RouteDirectionEnumeration newRouteDirection) {
		RouteDirectionEnumeration oldRouteDirection = routeDirection;
		routeDirection = newRouteDirection == null ? ROUTE_DIRECTION_EDEFAULT : newRouteDirection;
		boolean oldRouteDirectionESet = routeDirectionESet;
		routeDirectionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ROUTE_DIRECTION, oldRouteDirection, routeDirection, !oldRouteDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRouteDirection() {
		RouteDirectionEnumeration oldRouteDirection = routeDirection;
		boolean oldRouteDirectionESet = routeDirectionESet;
		routeDirection = ROUTE_DIRECTION_EDEFAULT;
		routeDirectionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ROUTE_DIRECTION, oldRouteDirection, ROUTE_DIRECTION_EDEFAULT, oldRouteDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRouteDirection() {
		return routeDirectionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPInt getRunNumber() {
		return runNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRunNumber(IBISIPInt newRunNumber, NotificationChain msgs) {
		IBISIPInt oldRunNumber = runNumber;
		runNumber = newRunNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__RUN_NUMBER, oldRunNumber, newRunNumber);
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
	public void setRunNumber(IBISIPInt newRunNumber) {
		if (newRunNumber != runNumber) {
			NotificationChain msgs = null;
			if (runNumber != null)
				msgs = ((InternalEObject)runNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__RUN_NUMBER, null, msgs);
			if (newRunNumber != null)
				msgs = ((InternalEObject)newRunNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__RUN_NUMBER, null, msgs);
			msgs = basicSetRunNumber(newRunNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__RUN_NUMBER, newRunNumber, newRunNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPInt getPatternNumber() {
		return patternNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternNumber(IBISIPInt newPatternNumber, NotificationChain msgs) {
		IBISIPInt oldPatternNumber = patternNumber;
		patternNumber = newPatternNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__PATTERN_NUMBER, oldPatternNumber, newPatternNumber);
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
	public void setPatternNumber(IBISIPInt newPatternNumber) {
		if (newPatternNumber != patternNumber) {
			NotificationChain msgs = null;
			if (patternNumber != null)
				msgs = ((InternalEObject)patternNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__PATTERN_NUMBER, null, msgs);
			if (newPatternNumber != null)
				msgs = ((InternalEObject)newPatternNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__PATTERN_NUMBER, null, msgs);
			msgs = basicSetPatternNumber(newPatternNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__PATTERN_NUMBER, newPatternNumber, newPatternNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPInt getPathDestinationNumber() {
		return pathDestinationNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPathDestinationNumber(IBISIPInt newPathDestinationNumber, NotificationChain msgs) {
		IBISIPInt oldPathDestinationNumber = pathDestinationNumber;
		pathDestinationNumber = newPathDestinationNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__PATH_DESTINATION_NUMBER, oldPathDestinationNumber, newPathDestinationNumber);
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
	public void setPathDestinationNumber(IBISIPInt newPathDestinationNumber) {
		if (newPathDestinationNumber != pathDestinationNumber) {
			NotificationChain msgs = null;
			if (pathDestinationNumber != null)
				msgs = ((InternalEObject)pathDestinationNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__PATH_DESTINATION_NUMBER, null, msgs);
			if (newPathDestinationNumber != null)
				msgs = ((InternalEObject)newPathDestinationNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__PATH_DESTINATION_NUMBER, null, msgs);
			msgs = basicSetPathDestinationNumber(newPathDestinationNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__PATH_DESTINATION_NUMBER, newPathDestinationNumber, newPathDestinationNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__TRIP_REF:
				return basicSetTripRef(null, msgs);
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__STOP_SEQUENCE:
				return basicSetStopSequence(null, msgs);
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__TIMETABLE_DELAY:
				return basicSetTimetableDelay(null, msgs);
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE:
				return basicSetAdditionalTextMessage(null, msgs);
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE1:
				return basicSetAdditionalTextMessage1(null, msgs);
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE2:
				return basicSetAdditionalTextMessage2(null, msgs);
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE3:
				return basicSetAdditionalTextMessage3(null, msgs);
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE4:
				return basicSetAdditionalTextMessage4(null, msgs);
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE5:
				return basicSetAdditionalTextMessage5(null, msgs);
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE6:
				return basicSetAdditionalTextMessage6(null, msgs);
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE7:
				return basicSetAdditionalTextMessage7(null, msgs);
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE8:
				return basicSetAdditionalTextMessage8(null, msgs);
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE9:
				return basicSetAdditionalTextMessage9(null, msgs);
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_ANNOUNCEMENT:
				return ((InternalEList<?>)getAdditionalAnnouncement()).basicRemove(otherEnd, msgs);
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__RUN_NUMBER:
				return basicSetRunNumber(null, msgs);
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__PATTERN_NUMBER:
				return basicSetPatternNumber(null, msgs);
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__PATH_DESTINATION_NUMBER:
				return basicSetPathDestinationNumber(null, msgs);
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
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__TRIP_REF:
				return getTripRef();
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__STOP_SEQUENCE:
				return getStopSequence();
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__LOCATION_STATE:
				return getLocationState();
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__TIMETABLE_DELAY:
				return getTimetableDelay();
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE:
				return getAdditionalTextMessage();
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE1:
				return getAdditionalTextMessage1();
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE2:
				return getAdditionalTextMessage2();
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE3:
				return getAdditionalTextMessage3();
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE4:
				return getAdditionalTextMessage4();
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE5:
				return getAdditionalTextMessage5();
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE6:
				return getAdditionalTextMessage6();
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE7:
				return getAdditionalTextMessage7();
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE8:
				return getAdditionalTextMessage8();
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE9:
				return getAdditionalTextMessage9();
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_ANNOUNCEMENT:
				return getAdditionalAnnouncement();
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ROUTE_DIRECTION:
				return getRouteDirection();
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__RUN_NUMBER:
				return getRunNumber();
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__PATTERN_NUMBER:
				return getPatternNumber();
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__PATH_DESTINATION_NUMBER:
				return getPathDestinationNumber();
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
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__TRIP_REF:
				setTripRef((IBISIPNMTOKEN)newValue);
				return;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__STOP_SEQUENCE:
				setStopSequence((StopSequenceStructure)newValue);
				return;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__LOCATION_STATE:
				setLocationState((LocationStateEnumeration)newValue);
				return;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__TIMETABLE_DELAY:
				setTimetableDelay((IBISIPInt)newValue);
				return;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE:
				setAdditionalTextMessage((InternationalTextType)newValue);
				return;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE1:
				setAdditionalTextMessage1((InternationalTextType)newValue);
				return;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE2:
				setAdditionalTextMessage2((InternationalTextType)newValue);
				return;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE3:
				setAdditionalTextMessage3((InternationalTextType)newValue);
				return;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE4:
				setAdditionalTextMessage4((InternationalTextType)newValue);
				return;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE5:
				setAdditionalTextMessage5((InternationalTextType)newValue);
				return;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE6:
				setAdditionalTextMessage6((InternationalTextType)newValue);
				return;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE7:
				setAdditionalTextMessage7((InternationalTextType)newValue);
				return;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE8:
				setAdditionalTextMessage8((InternationalTextType)newValue);
				return;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE9:
				setAdditionalTextMessage9((InternationalTextType)newValue);
				return;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_ANNOUNCEMENT:
				getAdditionalAnnouncement().clear();
				getAdditionalAnnouncement().addAll((Collection<? extends AdditionalAnnouncementStructure>)newValue);
				return;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ROUTE_DIRECTION:
				setRouteDirection((RouteDirectionEnumeration)newValue);
				return;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__RUN_NUMBER:
				setRunNumber((IBISIPInt)newValue);
				return;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__PATTERN_NUMBER:
				setPatternNumber((IBISIPInt)newValue);
				return;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__PATH_DESTINATION_NUMBER:
				setPathDestinationNumber((IBISIPInt)newValue);
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
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__TRIP_REF:
				setTripRef((IBISIPNMTOKEN)null);
				return;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__STOP_SEQUENCE:
				setStopSequence((StopSequenceStructure)null);
				return;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__LOCATION_STATE:
				unsetLocationState();
				return;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__TIMETABLE_DELAY:
				setTimetableDelay((IBISIPInt)null);
				return;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE:
				setAdditionalTextMessage((InternationalTextType)null);
				return;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE1:
				setAdditionalTextMessage1((InternationalTextType)null);
				return;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE2:
				setAdditionalTextMessage2((InternationalTextType)null);
				return;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE3:
				setAdditionalTextMessage3((InternationalTextType)null);
				return;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE4:
				setAdditionalTextMessage4((InternationalTextType)null);
				return;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE5:
				setAdditionalTextMessage5((InternationalTextType)null);
				return;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE6:
				setAdditionalTextMessage6((InternationalTextType)null);
				return;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE7:
				setAdditionalTextMessage7((InternationalTextType)null);
				return;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE8:
				setAdditionalTextMessage8((InternationalTextType)null);
				return;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE9:
				setAdditionalTextMessage9((InternationalTextType)null);
				return;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_ANNOUNCEMENT:
				getAdditionalAnnouncement().clear();
				return;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ROUTE_DIRECTION:
				unsetRouteDirection();
				return;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__RUN_NUMBER:
				setRunNumber((IBISIPInt)null);
				return;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__PATTERN_NUMBER:
				setPatternNumber((IBISIPInt)null);
				return;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__PATH_DESTINATION_NUMBER:
				setPathDestinationNumber((IBISIPInt)null);
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
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__TRIP_REF:
				return tripRef != null;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__STOP_SEQUENCE:
				return stopSequence != null;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__LOCATION_STATE:
				return isSetLocationState();
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__TIMETABLE_DELAY:
				return timetableDelay != null;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE:
				return additionalTextMessage != null;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE1:
				return additionalTextMessage1 != null;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE2:
				return additionalTextMessage2 != null;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE3:
				return additionalTextMessage3 != null;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE4:
				return additionalTextMessage4 != null;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE5:
				return additionalTextMessage5 != null;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE6:
				return additionalTextMessage6 != null;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE7:
				return additionalTextMessage7 != null;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE8:
				return additionalTextMessage8 != null;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_TEXT_MESSAGE9:
				return additionalTextMessage9 != null;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ADDITIONAL_ANNOUNCEMENT:
				return additionalAnnouncement != null && !additionalAnnouncement.isEmpty();
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__ROUTE_DIRECTION:
				return isSetRouteDirection();
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__RUN_NUMBER:
				return runNumber != null;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__PATTERN_NUMBER:
				return patternNumber != null;
			case IbisCommonPackage.TRIP_INFORMATION_STRUCTURE__PATH_DESTINATION_NUMBER:
				return pathDestinationNumber != null;
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
		result.append(" (locationState: ");
		if (locationStateESet) result.append(locationState); else result.append("<unset>");
		result.append(", routeDirection: ");
		if (routeDirectionESet) result.append(routeDirection); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TripInformationStructureImpl
