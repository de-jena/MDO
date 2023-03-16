/*
 */
package de.jena.mdo.ibis.ibis_common.impl;

import de.jena.mdo.ibis.ibis_common.Announcement;
import de.jena.mdo.ibis.ibis_common.BayArea;
import de.jena.mdo.ibis.ibis_common.Connection;
import de.jena.mdo.ibis.ibis_common.DisplayContent;
import de.jena.mdo.ibis.ibis_common.GNSSPoint;
import de.jena.mdo.ibis.ibis_common.IBISIPDateTime;
import de.jena.mdo.ibis.ibis_common.IBISIPNMTOKEN;
import de.jena.mdo.ibis.ibis_common.IBISIPString;
import de.jena.mdo.ibis.ibis_common.IbisCommonPackage;
import de.jena.mdo.ibis.ibis_common.InternationalTextType;
import de.jena.mdo.ibis.ibis_common.JourneyStopInformation;

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
 * An implementation of the model object '<em><b>Journey Stop Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.JourneyStopInformationImpl#getStopRef <em>Stop Ref</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.JourneyStopInformationImpl#getStopName <em>Stop Name</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.JourneyStopInformationImpl#getStopAlternativeName <em>Stop Alternative Name</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.JourneyStopInformationImpl#getPlatform <em>Platform</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.JourneyStopInformationImpl#getDisplayContent <em>Display Content</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.JourneyStopInformationImpl#getAnnouncement <em>Announcement</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.JourneyStopInformationImpl#getArrivalScheduled <em>Arrival Scheduled</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.JourneyStopInformationImpl#getDepartureScheduled <em>Departure Scheduled</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.JourneyStopInformationImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.JourneyStopInformationImpl#getBayArea <em>Bay Area</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.JourneyStopInformationImpl#getGNSSPoint <em>GNSS Point</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.JourneyStopInformationImpl#getFareZone <em>Fare Zone</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JourneyStopInformationImpl extends MinimalEObjectImpl.Container implements JourneyStopInformation {
	/**
	 * The cached value of the '{@link #getStopRef() <em>Stop Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopRef()
	 * @generated
	 * @ordered
	 */
	protected IBISIPNMTOKEN stopRef;

	/**
	 * The cached value of the '{@link #getStopName() <em>Stop Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopName()
	 * @generated
	 * @ordered
	 */
	protected EList<InternationalTextType> stopName;

	/**
	 * The cached value of the '{@link #getStopAlternativeName() <em>Stop Alternative Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopAlternativeName()
	 * @generated
	 * @ordered
	 */
	protected EList<InternationalTextType> stopAlternativeName;

	/**
	 * The cached value of the '{@link #getPlatform() <em>Platform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatform()
	 * @generated
	 * @ordered
	 */
	protected IBISIPString platform;

	/**
	 * The cached value of the '{@link #getDisplayContent() <em>Display Content</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayContent()
	 * @generated
	 * @ordered
	 */
	protected EList<DisplayContent> displayContent;

	/**
	 * The cached value of the '{@link #getAnnouncement() <em>Announcement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnouncement()
	 * @generated
	 * @ordered
	 */
	protected Announcement announcement;

	/**
	 * The cached value of the '{@link #getArrivalScheduled() <em>Arrival Scheduled</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalScheduled()
	 * @generated
	 * @ordered
	 */
	protected IBISIPDateTime arrivalScheduled;

	/**
	 * The cached value of the '{@link #getDepartureScheduled() <em>Departure Scheduled</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartureScheduled()
	 * @generated
	 * @ordered
	 */
	protected IBISIPDateTime departureScheduled;

	/**
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connection;

	/**
	 * The cached value of the '{@link #getBayArea() <em>Bay Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBayArea()
	 * @generated
	 * @ordered
	 */
	protected BayArea bayArea;

	/**
	 * The cached value of the '{@link #getGNSSPoint() <em>GNSS Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGNSSPoint()
	 * @generated
	 * @ordered
	 */
	protected GNSSPoint gNSSPoint;

	/**
	 * The cached value of the '{@link #getFareZone() <em>Fare Zone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFareZone()
	 * @generated
	 * @ordered
	 */
	protected IBISIPNMTOKEN fareZone;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JourneyStopInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.Literals.JOURNEY_STOP_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPNMTOKEN getStopRef() {
		return stopRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStopRef(IBISIPNMTOKEN newStopRef, NotificationChain msgs) {
		IBISIPNMTOKEN oldStopRef = stopRef;
		stopRef = newStopRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.JOURNEY_STOP_INFORMATION__STOP_REF, oldStopRef, newStopRef);
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
	public void setStopRef(IBISIPNMTOKEN newStopRef) {
		if (newStopRef != stopRef) {
			NotificationChain msgs = null;
			if (stopRef != null)
				msgs = ((InternalEObject)stopRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.JOURNEY_STOP_INFORMATION__STOP_REF, null, msgs);
			if (newStopRef != null)
				msgs = ((InternalEObject)newStopRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.JOURNEY_STOP_INFORMATION__STOP_REF, null, msgs);
			msgs = basicSetStopRef(newStopRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.JOURNEY_STOP_INFORMATION__STOP_REF, newStopRef, newStopRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InternationalTextType> getStopName() {
		if (stopName == null) {
			stopName = new EObjectContainmentEList<InternationalTextType>(InternationalTextType.class, this, IbisCommonPackage.JOURNEY_STOP_INFORMATION__STOP_NAME);
		}
		return stopName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InternationalTextType> getStopAlternativeName() {
		if (stopAlternativeName == null) {
			stopAlternativeName = new EObjectContainmentEList<InternationalTextType>(InternationalTextType.class, this, IbisCommonPackage.JOURNEY_STOP_INFORMATION__STOP_ALTERNATIVE_NAME);
		}
		return stopAlternativeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPString getPlatform() {
		return platform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlatform(IBISIPString newPlatform, NotificationChain msgs) {
		IBISIPString oldPlatform = platform;
		platform = newPlatform;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.JOURNEY_STOP_INFORMATION__PLATFORM, oldPlatform, newPlatform);
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
	public void setPlatform(IBISIPString newPlatform) {
		if (newPlatform != platform) {
			NotificationChain msgs = null;
			if (platform != null)
				msgs = ((InternalEObject)platform).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.JOURNEY_STOP_INFORMATION__PLATFORM, null, msgs);
			if (newPlatform != null)
				msgs = ((InternalEObject)newPlatform).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.JOURNEY_STOP_INFORMATION__PLATFORM, null, msgs);
			msgs = basicSetPlatform(newPlatform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.JOURNEY_STOP_INFORMATION__PLATFORM, newPlatform, newPlatform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DisplayContent> getDisplayContent() {
		if (displayContent == null) {
			displayContent = new EObjectContainmentEList<DisplayContent>(DisplayContent.class, this, IbisCommonPackage.JOURNEY_STOP_INFORMATION__DISPLAY_CONTENT);
		}
		return displayContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Announcement getAnnouncement() {
		return announcement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnouncement(Announcement newAnnouncement, NotificationChain msgs) {
		Announcement oldAnnouncement = announcement;
		announcement = newAnnouncement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.JOURNEY_STOP_INFORMATION__ANNOUNCEMENT, oldAnnouncement, newAnnouncement);
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
	public void setAnnouncement(Announcement newAnnouncement) {
		if (newAnnouncement != announcement) {
			NotificationChain msgs = null;
			if (announcement != null)
				msgs = ((InternalEObject)announcement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.JOURNEY_STOP_INFORMATION__ANNOUNCEMENT, null, msgs);
			if (newAnnouncement != null)
				msgs = ((InternalEObject)newAnnouncement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.JOURNEY_STOP_INFORMATION__ANNOUNCEMENT, null, msgs);
			msgs = basicSetAnnouncement(newAnnouncement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.JOURNEY_STOP_INFORMATION__ANNOUNCEMENT, newAnnouncement, newAnnouncement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPDateTime getArrivalScheduled() {
		return arrivalScheduled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArrivalScheduled(IBISIPDateTime newArrivalScheduled, NotificationChain msgs) {
		IBISIPDateTime oldArrivalScheduled = arrivalScheduled;
		arrivalScheduled = newArrivalScheduled;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.JOURNEY_STOP_INFORMATION__ARRIVAL_SCHEDULED, oldArrivalScheduled, newArrivalScheduled);
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
	public void setArrivalScheduled(IBISIPDateTime newArrivalScheduled) {
		if (newArrivalScheduled != arrivalScheduled) {
			NotificationChain msgs = null;
			if (arrivalScheduled != null)
				msgs = ((InternalEObject)arrivalScheduled).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.JOURNEY_STOP_INFORMATION__ARRIVAL_SCHEDULED, null, msgs);
			if (newArrivalScheduled != null)
				msgs = ((InternalEObject)newArrivalScheduled).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.JOURNEY_STOP_INFORMATION__ARRIVAL_SCHEDULED, null, msgs);
			msgs = basicSetArrivalScheduled(newArrivalScheduled, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.JOURNEY_STOP_INFORMATION__ARRIVAL_SCHEDULED, newArrivalScheduled, newArrivalScheduled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPDateTime getDepartureScheduled() {
		return departureScheduled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDepartureScheduled(IBISIPDateTime newDepartureScheduled, NotificationChain msgs) {
		IBISIPDateTime oldDepartureScheduled = departureScheduled;
		departureScheduled = newDepartureScheduled;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.JOURNEY_STOP_INFORMATION__DEPARTURE_SCHEDULED, oldDepartureScheduled, newDepartureScheduled);
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
	public void setDepartureScheduled(IBISIPDateTime newDepartureScheduled) {
		if (newDepartureScheduled != departureScheduled) {
			NotificationChain msgs = null;
			if (departureScheduled != null)
				msgs = ((InternalEObject)departureScheduled).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.JOURNEY_STOP_INFORMATION__DEPARTURE_SCHEDULED, null, msgs);
			if (newDepartureScheduled != null)
				msgs = ((InternalEObject)newDepartureScheduled).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.JOURNEY_STOP_INFORMATION__DEPARTURE_SCHEDULED, null, msgs);
			msgs = basicSetDepartureScheduled(newDepartureScheduled, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.JOURNEY_STOP_INFORMATION__DEPARTURE_SCHEDULED, newDepartureScheduled, newDepartureScheduled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connection> getConnection() {
		if (connection == null) {
			connection = new EObjectContainmentEList<Connection>(Connection.class, this, IbisCommonPackage.JOURNEY_STOP_INFORMATION__CONNECTION);
		}
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BayArea getBayArea() {
		return bayArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBayArea(BayArea newBayArea, NotificationChain msgs) {
		BayArea oldBayArea = bayArea;
		bayArea = newBayArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.JOURNEY_STOP_INFORMATION__BAY_AREA, oldBayArea, newBayArea);
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
	public void setBayArea(BayArea newBayArea) {
		if (newBayArea != bayArea) {
			NotificationChain msgs = null;
			if (bayArea != null)
				msgs = ((InternalEObject)bayArea).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.JOURNEY_STOP_INFORMATION__BAY_AREA, null, msgs);
			if (newBayArea != null)
				msgs = ((InternalEObject)newBayArea).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.JOURNEY_STOP_INFORMATION__BAY_AREA, null, msgs);
			msgs = basicSetBayArea(newBayArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.JOURNEY_STOP_INFORMATION__BAY_AREA, newBayArea, newBayArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GNSSPoint getGNSSPoint() {
		return gNSSPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGNSSPoint(GNSSPoint newGNSSPoint, NotificationChain msgs) {
		GNSSPoint oldGNSSPoint = gNSSPoint;
		gNSSPoint = newGNSSPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.JOURNEY_STOP_INFORMATION__GNSS_POINT, oldGNSSPoint, newGNSSPoint);
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
	public void setGNSSPoint(GNSSPoint newGNSSPoint) {
		if (newGNSSPoint != gNSSPoint) {
			NotificationChain msgs = null;
			if (gNSSPoint != null)
				msgs = ((InternalEObject)gNSSPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.JOURNEY_STOP_INFORMATION__GNSS_POINT, null, msgs);
			if (newGNSSPoint != null)
				msgs = ((InternalEObject)newGNSSPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.JOURNEY_STOP_INFORMATION__GNSS_POINT, null, msgs);
			msgs = basicSetGNSSPoint(newGNSSPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.JOURNEY_STOP_INFORMATION__GNSS_POINT, newGNSSPoint, newGNSSPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPNMTOKEN getFareZone() {
		return fareZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFareZone(IBISIPNMTOKEN newFareZone, NotificationChain msgs) {
		IBISIPNMTOKEN oldFareZone = fareZone;
		fareZone = newFareZone;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.JOURNEY_STOP_INFORMATION__FARE_ZONE, oldFareZone, newFareZone);
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
	public void setFareZone(IBISIPNMTOKEN newFareZone) {
		if (newFareZone != fareZone) {
			NotificationChain msgs = null;
			if (fareZone != null)
				msgs = ((InternalEObject)fareZone).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.JOURNEY_STOP_INFORMATION__FARE_ZONE, null, msgs);
			if (newFareZone != null)
				msgs = ((InternalEObject)newFareZone).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.JOURNEY_STOP_INFORMATION__FARE_ZONE, null, msgs);
			msgs = basicSetFareZone(newFareZone, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.JOURNEY_STOP_INFORMATION__FARE_ZONE, newFareZone, newFareZone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__STOP_REF:
				return basicSetStopRef(null, msgs);
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__STOP_NAME:
				return ((InternalEList<?>)getStopName()).basicRemove(otherEnd, msgs);
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__STOP_ALTERNATIVE_NAME:
				return ((InternalEList<?>)getStopAlternativeName()).basicRemove(otherEnd, msgs);
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__PLATFORM:
				return basicSetPlatform(null, msgs);
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__DISPLAY_CONTENT:
				return ((InternalEList<?>)getDisplayContent()).basicRemove(otherEnd, msgs);
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__ANNOUNCEMENT:
				return basicSetAnnouncement(null, msgs);
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__ARRIVAL_SCHEDULED:
				return basicSetArrivalScheduled(null, msgs);
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__DEPARTURE_SCHEDULED:
				return basicSetDepartureScheduled(null, msgs);
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__CONNECTION:
				return ((InternalEList<?>)getConnection()).basicRemove(otherEnd, msgs);
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__BAY_AREA:
				return basicSetBayArea(null, msgs);
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__GNSS_POINT:
				return basicSetGNSSPoint(null, msgs);
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__FARE_ZONE:
				return basicSetFareZone(null, msgs);
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
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__STOP_REF:
				return getStopRef();
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__STOP_NAME:
				return getStopName();
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__STOP_ALTERNATIVE_NAME:
				return getStopAlternativeName();
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__PLATFORM:
				return getPlatform();
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__DISPLAY_CONTENT:
				return getDisplayContent();
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__ANNOUNCEMENT:
				return getAnnouncement();
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__ARRIVAL_SCHEDULED:
				return getArrivalScheduled();
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__DEPARTURE_SCHEDULED:
				return getDepartureScheduled();
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__CONNECTION:
				return getConnection();
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__BAY_AREA:
				return getBayArea();
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__GNSS_POINT:
				return getGNSSPoint();
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__FARE_ZONE:
				return getFareZone();
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
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__STOP_REF:
				setStopRef((IBISIPNMTOKEN)newValue);
				return;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__STOP_NAME:
				getStopName().clear();
				getStopName().addAll((Collection<? extends InternationalTextType>)newValue);
				return;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__STOP_ALTERNATIVE_NAME:
				getStopAlternativeName().clear();
				getStopAlternativeName().addAll((Collection<? extends InternationalTextType>)newValue);
				return;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__PLATFORM:
				setPlatform((IBISIPString)newValue);
				return;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__DISPLAY_CONTENT:
				getDisplayContent().clear();
				getDisplayContent().addAll((Collection<? extends DisplayContent>)newValue);
				return;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__ANNOUNCEMENT:
				setAnnouncement((Announcement)newValue);
				return;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__ARRIVAL_SCHEDULED:
				setArrivalScheduled((IBISIPDateTime)newValue);
				return;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__DEPARTURE_SCHEDULED:
				setDepartureScheduled((IBISIPDateTime)newValue);
				return;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__CONNECTION:
				getConnection().clear();
				getConnection().addAll((Collection<? extends Connection>)newValue);
				return;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__BAY_AREA:
				setBayArea((BayArea)newValue);
				return;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__GNSS_POINT:
				setGNSSPoint((GNSSPoint)newValue);
				return;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__FARE_ZONE:
				setFareZone((IBISIPNMTOKEN)newValue);
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
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__STOP_REF:
				setStopRef((IBISIPNMTOKEN)null);
				return;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__STOP_NAME:
				getStopName().clear();
				return;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__STOP_ALTERNATIVE_NAME:
				getStopAlternativeName().clear();
				return;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__PLATFORM:
				setPlatform((IBISIPString)null);
				return;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__DISPLAY_CONTENT:
				getDisplayContent().clear();
				return;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__ANNOUNCEMENT:
				setAnnouncement((Announcement)null);
				return;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__ARRIVAL_SCHEDULED:
				setArrivalScheduled((IBISIPDateTime)null);
				return;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__DEPARTURE_SCHEDULED:
				setDepartureScheduled((IBISIPDateTime)null);
				return;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__CONNECTION:
				getConnection().clear();
				return;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__BAY_AREA:
				setBayArea((BayArea)null);
				return;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__GNSS_POINT:
				setGNSSPoint((GNSSPoint)null);
				return;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__FARE_ZONE:
				setFareZone((IBISIPNMTOKEN)null);
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
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__STOP_REF:
				return stopRef != null;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__STOP_NAME:
				return stopName != null && !stopName.isEmpty();
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__STOP_ALTERNATIVE_NAME:
				return stopAlternativeName != null && !stopAlternativeName.isEmpty();
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__PLATFORM:
				return platform != null;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__DISPLAY_CONTENT:
				return displayContent != null && !displayContent.isEmpty();
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__ANNOUNCEMENT:
				return announcement != null;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__ARRIVAL_SCHEDULED:
				return arrivalScheduled != null;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__DEPARTURE_SCHEDULED:
				return departureScheduled != null;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__CONNECTION:
				return connection != null && !connection.isEmpty();
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__BAY_AREA:
				return bayArea != null;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__GNSS_POINT:
				return gNSSPoint != null;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION__FARE_ZONE:
				return fareZone != null;
		}
		return super.eIsSet(featureID);
	}

} //JourneyStopInformationImpl
