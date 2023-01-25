/*
 */
package de.jena.mdo.ibis.common.impl;

import de.jena.mdo.ibis.common.AnnouncementStructure;
import de.jena.mdo.ibis.common.BayAreaStructure;
import de.jena.mdo.ibis.common.ConnectionStructure;
import de.jena.mdo.ibis.common.DisplayContentStructure;
import de.jena.mdo.ibis.common.GNSSPointStructure;
import de.jena.mdo.ibis.common.IBISIPDateTime;
import de.jena.mdo.ibis.common.IBISIPNMTOKEN;
import de.jena.mdo.ibis.common.IBISIPString;
import de.jena.mdo.ibis.common.IbisCommonPackage;
import de.jena.mdo.ibis.common.InternationalTextType;
import de.jena.mdo.ibis.common.JourneyStopInformationStructure;

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
 * An implementation of the model object '<em><b>Journey Stop Information Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.impl.JourneyStopInformationStructureImpl#getStopRef <em>Stop Ref</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.JourneyStopInformationStructureImpl#getStopName <em>Stop Name</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.JourneyStopInformationStructureImpl#getStopAlternativeName <em>Stop Alternative Name</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.JourneyStopInformationStructureImpl#getPlatform <em>Platform</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.JourneyStopInformationStructureImpl#getDisplayContent <em>Display Content</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.JourneyStopInformationStructureImpl#getAnnouncement <em>Announcement</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.JourneyStopInformationStructureImpl#getArrivalScheduled <em>Arrival Scheduled</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.JourneyStopInformationStructureImpl#getDepartureScheduled <em>Departure Scheduled</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.JourneyStopInformationStructureImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.JourneyStopInformationStructureImpl#getBayArea <em>Bay Area</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.JourneyStopInformationStructureImpl#getGNSSPoint <em>GNSS Point</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.JourneyStopInformationStructureImpl#getFareZone <em>Fare Zone</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JourneyStopInformationStructureImpl extends MinimalEObjectImpl.Container implements JourneyStopInformationStructure {
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
	protected EList<DisplayContentStructure> displayContent;

	/**
	 * The cached value of the '{@link #getAnnouncement() <em>Announcement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnouncement()
	 * @generated
	 * @ordered
	 */
	protected AnnouncementStructure announcement;

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
	protected EList<ConnectionStructure> connection;

	/**
	 * The cached value of the '{@link #getBayArea() <em>Bay Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBayArea()
	 * @generated
	 * @ordered
	 */
	protected BayAreaStructure bayArea;

	/**
	 * The cached value of the '{@link #getGNSSPoint() <em>GNSS Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGNSSPoint()
	 * @generated
	 * @ordered
	 */
	protected GNSSPointStructure gNSSPoint;

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
	protected JourneyStopInformationStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.Literals.JOURNEY_STOP_INFORMATION_STRUCTURE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__STOP_REF, oldStopRef, newStopRef);
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
				msgs = ((InternalEObject)stopRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__STOP_REF, null, msgs);
			if (newStopRef != null)
				msgs = ((InternalEObject)newStopRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__STOP_REF, null, msgs);
			msgs = basicSetStopRef(newStopRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__STOP_REF, newStopRef, newStopRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InternationalTextType> getStopName() {
		if (stopName == null) {
			stopName = new EObjectContainmentEList<InternationalTextType>(InternationalTextType.class, this, IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__STOP_NAME);
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
			stopAlternativeName = new EObjectContainmentEList<InternationalTextType>(InternationalTextType.class, this, IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__STOP_ALTERNATIVE_NAME);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__PLATFORM, oldPlatform, newPlatform);
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
				msgs = ((InternalEObject)platform).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__PLATFORM, null, msgs);
			if (newPlatform != null)
				msgs = ((InternalEObject)newPlatform).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__PLATFORM, null, msgs);
			msgs = basicSetPlatform(newPlatform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__PLATFORM, newPlatform, newPlatform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DisplayContentStructure> getDisplayContent() {
		if (displayContent == null) {
			displayContent = new EObjectContainmentEList<DisplayContentStructure>(DisplayContentStructure.class, this, IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__DISPLAY_CONTENT);
		}
		return displayContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnouncementStructure getAnnouncement() {
		return announcement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnouncement(AnnouncementStructure newAnnouncement, NotificationChain msgs) {
		AnnouncementStructure oldAnnouncement = announcement;
		announcement = newAnnouncement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__ANNOUNCEMENT, oldAnnouncement, newAnnouncement);
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
	public void setAnnouncement(AnnouncementStructure newAnnouncement) {
		if (newAnnouncement != announcement) {
			NotificationChain msgs = null;
			if (announcement != null)
				msgs = ((InternalEObject)announcement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__ANNOUNCEMENT, null, msgs);
			if (newAnnouncement != null)
				msgs = ((InternalEObject)newAnnouncement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__ANNOUNCEMENT, null, msgs);
			msgs = basicSetAnnouncement(newAnnouncement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__ANNOUNCEMENT, newAnnouncement, newAnnouncement));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__ARRIVAL_SCHEDULED, oldArrivalScheduled, newArrivalScheduled);
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
				msgs = ((InternalEObject)arrivalScheduled).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__ARRIVAL_SCHEDULED, null, msgs);
			if (newArrivalScheduled != null)
				msgs = ((InternalEObject)newArrivalScheduled).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__ARRIVAL_SCHEDULED, null, msgs);
			msgs = basicSetArrivalScheduled(newArrivalScheduled, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__ARRIVAL_SCHEDULED, newArrivalScheduled, newArrivalScheduled));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__DEPARTURE_SCHEDULED, oldDepartureScheduled, newDepartureScheduled);
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
				msgs = ((InternalEObject)departureScheduled).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__DEPARTURE_SCHEDULED, null, msgs);
			if (newDepartureScheduled != null)
				msgs = ((InternalEObject)newDepartureScheduled).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__DEPARTURE_SCHEDULED, null, msgs);
			msgs = basicSetDepartureScheduled(newDepartureScheduled, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__DEPARTURE_SCHEDULED, newDepartureScheduled, newDepartureScheduled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConnectionStructure> getConnection() {
		if (connection == null) {
			connection = new EObjectContainmentEList<ConnectionStructure>(ConnectionStructure.class, this, IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__CONNECTION);
		}
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BayAreaStructure getBayArea() {
		return bayArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBayArea(BayAreaStructure newBayArea, NotificationChain msgs) {
		BayAreaStructure oldBayArea = bayArea;
		bayArea = newBayArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__BAY_AREA, oldBayArea, newBayArea);
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
	public void setBayArea(BayAreaStructure newBayArea) {
		if (newBayArea != bayArea) {
			NotificationChain msgs = null;
			if (bayArea != null)
				msgs = ((InternalEObject)bayArea).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__BAY_AREA, null, msgs);
			if (newBayArea != null)
				msgs = ((InternalEObject)newBayArea).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__BAY_AREA, null, msgs);
			msgs = basicSetBayArea(newBayArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__BAY_AREA, newBayArea, newBayArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GNSSPointStructure getGNSSPoint() {
		return gNSSPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGNSSPoint(GNSSPointStructure newGNSSPoint, NotificationChain msgs) {
		GNSSPointStructure oldGNSSPoint = gNSSPoint;
		gNSSPoint = newGNSSPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__GNSS_POINT, oldGNSSPoint, newGNSSPoint);
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
	public void setGNSSPoint(GNSSPointStructure newGNSSPoint) {
		if (newGNSSPoint != gNSSPoint) {
			NotificationChain msgs = null;
			if (gNSSPoint != null)
				msgs = ((InternalEObject)gNSSPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__GNSS_POINT, null, msgs);
			if (newGNSSPoint != null)
				msgs = ((InternalEObject)newGNSSPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__GNSS_POINT, null, msgs);
			msgs = basicSetGNSSPoint(newGNSSPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__GNSS_POINT, newGNSSPoint, newGNSSPoint));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__FARE_ZONE, oldFareZone, newFareZone);
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
				msgs = ((InternalEObject)fareZone).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__FARE_ZONE, null, msgs);
			if (newFareZone != null)
				msgs = ((InternalEObject)newFareZone).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__FARE_ZONE, null, msgs);
			msgs = basicSetFareZone(newFareZone, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__FARE_ZONE, newFareZone, newFareZone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__STOP_REF:
				return basicSetStopRef(null, msgs);
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__STOP_NAME:
				return ((InternalEList<?>)getStopName()).basicRemove(otherEnd, msgs);
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__STOP_ALTERNATIVE_NAME:
				return ((InternalEList<?>)getStopAlternativeName()).basicRemove(otherEnd, msgs);
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__PLATFORM:
				return basicSetPlatform(null, msgs);
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__DISPLAY_CONTENT:
				return ((InternalEList<?>)getDisplayContent()).basicRemove(otherEnd, msgs);
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__ANNOUNCEMENT:
				return basicSetAnnouncement(null, msgs);
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__ARRIVAL_SCHEDULED:
				return basicSetArrivalScheduled(null, msgs);
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__DEPARTURE_SCHEDULED:
				return basicSetDepartureScheduled(null, msgs);
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__CONNECTION:
				return ((InternalEList<?>)getConnection()).basicRemove(otherEnd, msgs);
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__BAY_AREA:
				return basicSetBayArea(null, msgs);
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__GNSS_POINT:
				return basicSetGNSSPoint(null, msgs);
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__FARE_ZONE:
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
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__STOP_REF:
				return getStopRef();
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__STOP_NAME:
				return getStopName();
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__STOP_ALTERNATIVE_NAME:
				return getStopAlternativeName();
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__PLATFORM:
				return getPlatform();
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__DISPLAY_CONTENT:
				return getDisplayContent();
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__ANNOUNCEMENT:
				return getAnnouncement();
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__ARRIVAL_SCHEDULED:
				return getArrivalScheduled();
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__DEPARTURE_SCHEDULED:
				return getDepartureScheduled();
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__CONNECTION:
				return getConnection();
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__BAY_AREA:
				return getBayArea();
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__GNSS_POINT:
				return getGNSSPoint();
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__FARE_ZONE:
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
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__STOP_REF:
				setStopRef((IBISIPNMTOKEN)newValue);
				return;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__STOP_NAME:
				getStopName().clear();
				getStopName().addAll((Collection<? extends InternationalTextType>)newValue);
				return;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__STOP_ALTERNATIVE_NAME:
				getStopAlternativeName().clear();
				getStopAlternativeName().addAll((Collection<? extends InternationalTextType>)newValue);
				return;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__PLATFORM:
				setPlatform((IBISIPString)newValue);
				return;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__DISPLAY_CONTENT:
				getDisplayContent().clear();
				getDisplayContent().addAll((Collection<? extends DisplayContentStructure>)newValue);
				return;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__ANNOUNCEMENT:
				setAnnouncement((AnnouncementStructure)newValue);
				return;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__ARRIVAL_SCHEDULED:
				setArrivalScheduled((IBISIPDateTime)newValue);
				return;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__DEPARTURE_SCHEDULED:
				setDepartureScheduled((IBISIPDateTime)newValue);
				return;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__CONNECTION:
				getConnection().clear();
				getConnection().addAll((Collection<? extends ConnectionStructure>)newValue);
				return;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__BAY_AREA:
				setBayArea((BayAreaStructure)newValue);
				return;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__GNSS_POINT:
				setGNSSPoint((GNSSPointStructure)newValue);
				return;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__FARE_ZONE:
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
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__STOP_REF:
				setStopRef((IBISIPNMTOKEN)null);
				return;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__STOP_NAME:
				getStopName().clear();
				return;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__STOP_ALTERNATIVE_NAME:
				getStopAlternativeName().clear();
				return;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__PLATFORM:
				setPlatform((IBISIPString)null);
				return;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__DISPLAY_CONTENT:
				getDisplayContent().clear();
				return;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__ANNOUNCEMENT:
				setAnnouncement((AnnouncementStructure)null);
				return;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__ARRIVAL_SCHEDULED:
				setArrivalScheduled((IBISIPDateTime)null);
				return;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__DEPARTURE_SCHEDULED:
				setDepartureScheduled((IBISIPDateTime)null);
				return;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__CONNECTION:
				getConnection().clear();
				return;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__BAY_AREA:
				setBayArea((BayAreaStructure)null);
				return;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__GNSS_POINT:
				setGNSSPoint((GNSSPointStructure)null);
				return;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__FARE_ZONE:
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
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__STOP_REF:
				return stopRef != null;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__STOP_NAME:
				return stopName != null && !stopName.isEmpty();
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__STOP_ALTERNATIVE_NAME:
				return stopAlternativeName != null && !stopAlternativeName.isEmpty();
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__PLATFORM:
				return platform != null;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__DISPLAY_CONTENT:
				return displayContent != null && !displayContent.isEmpty();
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__ANNOUNCEMENT:
				return announcement != null;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__ARRIVAL_SCHEDULED:
				return arrivalScheduled != null;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__DEPARTURE_SCHEDULED:
				return departureScheduled != null;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__CONNECTION:
				return connection != null && !connection.isEmpty();
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__BAY_AREA:
				return bayArea != null;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__GNSS_POINT:
				return gNSSPoint != null;
			case IbisCommonPackage.JOURNEY_STOP_INFORMATION_STRUCTURE__FARE_ZONE:
				return fareZone != null;
		}
		return super.eIsSet(featureID);
	}

} //JourneyStopInformationStructureImpl
