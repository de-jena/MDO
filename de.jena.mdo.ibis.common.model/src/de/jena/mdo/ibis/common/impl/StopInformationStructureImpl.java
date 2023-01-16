/*
 */
package de.jena.mdo.ibis.common.impl;

import de.jena.mdo.ibis.common.AnnouncementStructure;
import de.jena.mdo.ibis.common.ConnectionStructure;
import de.jena.mdo.ibis.common.DisplayContentStructure;
import de.jena.mdo.ibis.common.IBISIPDateTime;
import de.jena.mdo.ibis.common.IBISIPInt;
import de.jena.mdo.ibis.common.IBISIPNMTOKEN;
import de.jena.mdo.ibis.common.IBISIPString;
import de.jena.mdo.ibis.common.IbisCommonPackage;
import de.jena.mdo.ibis.common.InternationalTextType;
import de.jena.mdo.ibis.common.StopInformationStructure;

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
 * An implementation of the model object '<em><b>Stop Information Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.impl.StopInformationStructureImpl#getStopIndex <em>Stop Index</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.StopInformationStructureImpl#getStopRef <em>Stop Ref</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.StopInformationStructureImpl#getStopName <em>Stop Name</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.StopInformationStructureImpl#getStopAlternativeName <em>Stop Alternative Name</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.StopInformationStructureImpl#getPlatform <em>Platform</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.StopInformationStructureImpl#getDisplayContent <em>Display Content</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.StopInformationStructureImpl#getStopAnnouncement <em>Stop Announcement</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.StopInformationStructureImpl#getArrivalScheduled <em>Arrival Scheduled</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.StopInformationStructureImpl#getArrivalExpected <em>Arrival Expected</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.StopInformationStructureImpl#getDepartureScheduled <em>Departure Scheduled</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.StopInformationStructureImpl#getDepartureExpected <em>Departure Expected</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.StopInformationStructureImpl#getRecordedArrivalTime <em>Recorded Arrival Time</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.StopInformationStructureImpl#getDistanceToNextStop <em>Distance To Next Stop</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.StopInformationStructureImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.StopInformationStructureImpl#getFareZone <em>Fare Zone</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StopInformationStructureImpl extends MinimalEObjectImpl.Container implements StopInformationStructure {
	/**
	 * The cached value of the '{@link #getStopIndex() <em>Stop Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopIndex()
	 * @generated
	 * @ordered
	 */
	protected IBISIPInt stopIndex;

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
	 * The cached value of the '{@link #getStopAnnouncement() <em>Stop Announcement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopAnnouncement()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnouncementStructure> stopAnnouncement;

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
	 * The cached value of the '{@link #getArrivalExpected() <em>Arrival Expected</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalExpected()
	 * @generated
	 * @ordered
	 */
	protected IBISIPDateTime arrivalExpected;

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
	 * The cached value of the '{@link #getDepartureExpected() <em>Departure Expected</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartureExpected()
	 * @generated
	 * @ordered
	 */
	protected IBISIPDateTime departureExpected;

	/**
	 * The cached value of the '{@link #getRecordedArrivalTime() <em>Recorded Arrival Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordedArrivalTime()
	 * @generated
	 * @ordered
	 */
	protected IBISIPDateTime recordedArrivalTime;

	/**
	 * The cached value of the '{@link #getDistanceToNextStop() <em>Distance To Next Stop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceToNextStop()
	 * @generated
	 * @ordered
	 */
	protected IBISIPInt distanceToNextStop;

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
	 * The cached value of the '{@link #getFareZone() <em>Fare Zone</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFareZone()
	 * @generated
	 * @ordered
	 */
	protected EList<IBISIPNMTOKEN> fareZone;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StopInformationStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.eINSTANCE.getStopInformationStructure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPInt getStopIndex() {
		return stopIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStopIndex(IBISIPInt newStopIndex, NotificationChain msgs) {
		IBISIPInt oldStopIndex = stopIndex;
		stopIndex = newStopIndex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.STOP_INFORMATION_STRUCTURE__STOP_INDEX, oldStopIndex, newStopIndex);
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
	public void setStopIndex(IBISIPInt newStopIndex) {
		if (newStopIndex != stopIndex) {
			NotificationChain msgs = null;
			if (stopIndex != null)
				msgs = ((InternalEObject)stopIndex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.STOP_INFORMATION_STRUCTURE__STOP_INDEX, null, msgs);
			if (newStopIndex != null)
				msgs = ((InternalEObject)newStopIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.STOP_INFORMATION_STRUCTURE__STOP_INDEX, null, msgs);
			msgs = basicSetStopIndex(newStopIndex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.STOP_INFORMATION_STRUCTURE__STOP_INDEX, newStopIndex, newStopIndex));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.STOP_INFORMATION_STRUCTURE__STOP_REF, oldStopRef, newStopRef);
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
				msgs = ((InternalEObject)stopRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.STOP_INFORMATION_STRUCTURE__STOP_REF, null, msgs);
			if (newStopRef != null)
				msgs = ((InternalEObject)newStopRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.STOP_INFORMATION_STRUCTURE__STOP_REF, null, msgs);
			msgs = basicSetStopRef(newStopRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.STOP_INFORMATION_STRUCTURE__STOP_REF, newStopRef, newStopRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InternationalTextType> getStopName() {
		if (stopName == null) {
			stopName = new EObjectContainmentEList<InternationalTextType>(InternationalTextType.class, this, IbisCommonPackage.STOP_INFORMATION_STRUCTURE__STOP_NAME);
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
			stopAlternativeName = new EObjectContainmentEList<InternationalTextType>(InternationalTextType.class, this, IbisCommonPackage.STOP_INFORMATION_STRUCTURE__STOP_ALTERNATIVE_NAME);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.STOP_INFORMATION_STRUCTURE__PLATFORM, oldPlatform, newPlatform);
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
				msgs = ((InternalEObject)platform).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.STOP_INFORMATION_STRUCTURE__PLATFORM, null, msgs);
			if (newPlatform != null)
				msgs = ((InternalEObject)newPlatform).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.STOP_INFORMATION_STRUCTURE__PLATFORM, null, msgs);
			msgs = basicSetPlatform(newPlatform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.STOP_INFORMATION_STRUCTURE__PLATFORM, newPlatform, newPlatform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DisplayContentStructure> getDisplayContent() {
		if (displayContent == null) {
			displayContent = new EObjectContainmentEList<DisplayContentStructure>(DisplayContentStructure.class, this, IbisCommonPackage.STOP_INFORMATION_STRUCTURE__DISPLAY_CONTENT);
		}
		return displayContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnouncementStructure> getStopAnnouncement() {
		if (stopAnnouncement == null) {
			stopAnnouncement = new EObjectContainmentEList<AnnouncementStructure>(AnnouncementStructure.class, this, IbisCommonPackage.STOP_INFORMATION_STRUCTURE__STOP_ANNOUNCEMENT);
		}
		return stopAnnouncement;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.STOP_INFORMATION_STRUCTURE__ARRIVAL_SCHEDULED, oldArrivalScheduled, newArrivalScheduled);
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
				msgs = ((InternalEObject)arrivalScheduled).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.STOP_INFORMATION_STRUCTURE__ARRIVAL_SCHEDULED, null, msgs);
			if (newArrivalScheduled != null)
				msgs = ((InternalEObject)newArrivalScheduled).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.STOP_INFORMATION_STRUCTURE__ARRIVAL_SCHEDULED, null, msgs);
			msgs = basicSetArrivalScheduled(newArrivalScheduled, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.STOP_INFORMATION_STRUCTURE__ARRIVAL_SCHEDULED, newArrivalScheduled, newArrivalScheduled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPDateTime getArrivalExpected() {
		return arrivalExpected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArrivalExpected(IBISIPDateTime newArrivalExpected, NotificationChain msgs) {
		IBISIPDateTime oldArrivalExpected = arrivalExpected;
		arrivalExpected = newArrivalExpected;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.STOP_INFORMATION_STRUCTURE__ARRIVAL_EXPECTED, oldArrivalExpected, newArrivalExpected);
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
	public void setArrivalExpected(IBISIPDateTime newArrivalExpected) {
		if (newArrivalExpected != arrivalExpected) {
			NotificationChain msgs = null;
			if (arrivalExpected != null)
				msgs = ((InternalEObject)arrivalExpected).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.STOP_INFORMATION_STRUCTURE__ARRIVAL_EXPECTED, null, msgs);
			if (newArrivalExpected != null)
				msgs = ((InternalEObject)newArrivalExpected).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.STOP_INFORMATION_STRUCTURE__ARRIVAL_EXPECTED, null, msgs);
			msgs = basicSetArrivalExpected(newArrivalExpected, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.STOP_INFORMATION_STRUCTURE__ARRIVAL_EXPECTED, newArrivalExpected, newArrivalExpected));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.STOP_INFORMATION_STRUCTURE__DEPARTURE_SCHEDULED, oldDepartureScheduled, newDepartureScheduled);
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
				msgs = ((InternalEObject)departureScheduled).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.STOP_INFORMATION_STRUCTURE__DEPARTURE_SCHEDULED, null, msgs);
			if (newDepartureScheduled != null)
				msgs = ((InternalEObject)newDepartureScheduled).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.STOP_INFORMATION_STRUCTURE__DEPARTURE_SCHEDULED, null, msgs);
			msgs = basicSetDepartureScheduled(newDepartureScheduled, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.STOP_INFORMATION_STRUCTURE__DEPARTURE_SCHEDULED, newDepartureScheduled, newDepartureScheduled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPDateTime getDepartureExpected() {
		return departureExpected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDepartureExpected(IBISIPDateTime newDepartureExpected, NotificationChain msgs) {
		IBISIPDateTime oldDepartureExpected = departureExpected;
		departureExpected = newDepartureExpected;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.STOP_INFORMATION_STRUCTURE__DEPARTURE_EXPECTED, oldDepartureExpected, newDepartureExpected);
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
	public void setDepartureExpected(IBISIPDateTime newDepartureExpected) {
		if (newDepartureExpected != departureExpected) {
			NotificationChain msgs = null;
			if (departureExpected != null)
				msgs = ((InternalEObject)departureExpected).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.STOP_INFORMATION_STRUCTURE__DEPARTURE_EXPECTED, null, msgs);
			if (newDepartureExpected != null)
				msgs = ((InternalEObject)newDepartureExpected).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.STOP_INFORMATION_STRUCTURE__DEPARTURE_EXPECTED, null, msgs);
			msgs = basicSetDepartureExpected(newDepartureExpected, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.STOP_INFORMATION_STRUCTURE__DEPARTURE_EXPECTED, newDepartureExpected, newDepartureExpected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPDateTime getRecordedArrivalTime() {
		return recordedArrivalTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecordedArrivalTime(IBISIPDateTime newRecordedArrivalTime, NotificationChain msgs) {
		IBISIPDateTime oldRecordedArrivalTime = recordedArrivalTime;
		recordedArrivalTime = newRecordedArrivalTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.STOP_INFORMATION_STRUCTURE__RECORDED_ARRIVAL_TIME, oldRecordedArrivalTime, newRecordedArrivalTime);
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
	public void setRecordedArrivalTime(IBISIPDateTime newRecordedArrivalTime) {
		if (newRecordedArrivalTime != recordedArrivalTime) {
			NotificationChain msgs = null;
			if (recordedArrivalTime != null)
				msgs = ((InternalEObject)recordedArrivalTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.STOP_INFORMATION_STRUCTURE__RECORDED_ARRIVAL_TIME, null, msgs);
			if (newRecordedArrivalTime != null)
				msgs = ((InternalEObject)newRecordedArrivalTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.STOP_INFORMATION_STRUCTURE__RECORDED_ARRIVAL_TIME, null, msgs);
			msgs = basicSetRecordedArrivalTime(newRecordedArrivalTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.STOP_INFORMATION_STRUCTURE__RECORDED_ARRIVAL_TIME, newRecordedArrivalTime, newRecordedArrivalTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPInt getDistanceToNextStop() {
		return distanceToNextStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistanceToNextStop(IBISIPInt newDistanceToNextStop, NotificationChain msgs) {
		IBISIPInt oldDistanceToNextStop = distanceToNextStop;
		distanceToNextStop = newDistanceToNextStop;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.STOP_INFORMATION_STRUCTURE__DISTANCE_TO_NEXT_STOP, oldDistanceToNextStop, newDistanceToNextStop);
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
	public void setDistanceToNextStop(IBISIPInt newDistanceToNextStop) {
		if (newDistanceToNextStop != distanceToNextStop) {
			NotificationChain msgs = null;
			if (distanceToNextStop != null)
				msgs = ((InternalEObject)distanceToNextStop).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.STOP_INFORMATION_STRUCTURE__DISTANCE_TO_NEXT_STOP, null, msgs);
			if (newDistanceToNextStop != null)
				msgs = ((InternalEObject)newDistanceToNextStop).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.STOP_INFORMATION_STRUCTURE__DISTANCE_TO_NEXT_STOP, null, msgs);
			msgs = basicSetDistanceToNextStop(newDistanceToNextStop, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.STOP_INFORMATION_STRUCTURE__DISTANCE_TO_NEXT_STOP, newDistanceToNextStop, newDistanceToNextStop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConnectionStructure> getConnection() {
		if (connection == null) {
			connection = new EObjectContainmentEList<ConnectionStructure>(ConnectionStructure.class, this, IbisCommonPackage.STOP_INFORMATION_STRUCTURE__CONNECTION);
		}
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IBISIPNMTOKEN> getFareZone() {
		if (fareZone == null) {
			fareZone = new EObjectContainmentEList<IBISIPNMTOKEN>(IBISIPNMTOKEN.class, this, IbisCommonPackage.STOP_INFORMATION_STRUCTURE__FARE_ZONE);
		}
		return fareZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__STOP_INDEX:
				return basicSetStopIndex(null, msgs);
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__STOP_REF:
				return basicSetStopRef(null, msgs);
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__STOP_NAME:
				return ((InternalEList<?>)getStopName()).basicRemove(otherEnd, msgs);
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__STOP_ALTERNATIVE_NAME:
				return ((InternalEList<?>)getStopAlternativeName()).basicRemove(otherEnd, msgs);
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__PLATFORM:
				return basicSetPlatform(null, msgs);
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__DISPLAY_CONTENT:
				return ((InternalEList<?>)getDisplayContent()).basicRemove(otherEnd, msgs);
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__STOP_ANNOUNCEMENT:
				return ((InternalEList<?>)getStopAnnouncement()).basicRemove(otherEnd, msgs);
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__ARRIVAL_SCHEDULED:
				return basicSetArrivalScheduled(null, msgs);
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__ARRIVAL_EXPECTED:
				return basicSetArrivalExpected(null, msgs);
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__DEPARTURE_SCHEDULED:
				return basicSetDepartureScheduled(null, msgs);
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__DEPARTURE_EXPECTED:
				return basicSetDepartureExpected(null, msgs);
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__RECORDED_ARRIVAL_TIME:
				return basicSetRecordedArrivalTime(null, msgs);
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__DISTANCE_TO_NEXT_STOP:
				return basicSetDistanceToNextStop(null, msgs);
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__CONNECTION:
				return ((InternalEList<?>)getConnection()).basicRemove(otherEnd, msgs);
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__FARE_ZONE:
				return ((InternalEList<?>)getFareZone()).basicRemove(otherEnd, msgs);
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
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__STOP_INDEX:
				return getStopIndex();
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__STOP_REF:
				return getStopRef();
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__STOP_NAME:
				return getStopName();
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__STOP_ALTERNATIVE_NAME:
				return getStopAlternativeName();
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__PLATFORM:
				return getPlatform();
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__DISPLAY_CONTENT:
				return getDisplayContent();
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__STOP_ANNOUNCEMENT:
				return getStopAnnouncement();
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__ARRIVAL_SCHEDULED:
				return getArrivalScheduled();
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__ARRIVAL_EXPECTED:
				return getArrivalExpected();
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__DEPARTURE_SCHEDULED:
				return getDepartureScheduled();
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__DEPARTURE_EXPECTED:
				return getDepartureExpected();
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__RECORDED_ARRIVAL_TIME:
				return getRecordedArrivalTime();
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__DISTANCE_TO_NEXT_STOP:
				return getDistanceToNextStop();
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__CONNECTION:
				return getConnection();
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__FARE_ZONE:
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
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__STOP_INDEX:
				setStopIndex((IBISIPInt)newValue);
				return;
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__STOP_REF:
				setStopRef((IBISIPNMTOKEN)newValue);
				return;
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__STOP_NAME:
				getStopName().clear();
				getStopName().addAll((Collection<? extends InternationalTextType>)newValue);
				return;
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__STOP_ALTERNATIVE_NAME:
				getStopAlternativeName().clear();
				getStopAlternativeName().addAll((Collection<? extends InternationalTextType>)newValue);
				return;
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__PLATFORM:
				setPlatform((IBISIPString)newValue);
				return;
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__DISPLAY_CONTENT:
				getDisplayContent().clear();
				getDisplayContent().addAll((Collection<? extends DisplayContentStructure>)newValue);
				return;
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__STOP_ANNOUNCEMENT:
				getStopAnnouncement().clear();
				getStopAnnouncement().addAll((Collection<? extends AnnouncementStructure>)newValue);
				return;
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__ARRIVAL_SCHEDULED:
				setArrivalScheduled((IBISIPDateTime)newValue);
				return;
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__ARRIVAL_EXPECTED:
				setArrivalExpected((IBISIPDateTime)newValue);
				return;
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__DEPARTURE_SCHEDULED:
				setDepartureScheduled((IBISIPDateTime)newValue);
				return;
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__DEPARTURE_EXPECTED:
				setDepartureExpected((IBISIPDateTime)newValue);
				return;
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__RECORDED_ARRIVAL_TIME:
				setRecordedArrivalTime((IBISIPDateTime)newValue);
				return;
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__DISTANCE_TO_NEXT_STOP:
				setDistanceToNextStop((IBISIPInt)newValue);
				return;
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__CONNECTION:
				getConnection().clear();
				getConnection().addAll((Collection<? extends ConnectionStructure>)newValue);
				return;
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__FARE_ZONE:
				getFareZone().clear();
				getFareZone().addAll((Collection<? extends IBISIPNMTOKEN>)newValue);
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
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__STOP_INDEX:
				setStopIndex((IBISIPInt)null);
				return;
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__STOP_REF:
				setStopRef((IBISIPNMTOKEN)null);
				return;
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__STOP_NAME:
				getStopName().clear();
				return;
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__STOP_ALTERNATIVE_NAME:
				getStopAlternativeName().clear();
				return;
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__PLATFORM:
				setPlatform((IBISIPString)null);
				return;
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__DISPLAY_CONTENT:
				getDisplayContent().clear();
				return;
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__STOP_ANNOUNCEMENT:
				getStopAnnouncement().clear();
				return;
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__ARRIVAL_SCHEDULED:
				setArrivalScheduled((IBISIPDateTime)null);
				return;
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__ARRIVAL_EXPECTED:
				setArrivalExpected((IBISIPDateTime)null);
				return;
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__DEPARTURE_SCHEDULED:
				setDepartureScheduled((IBISIPDateTime)null);
				return;
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__DEPARTURE_EXPECTED:
				setDepartureExpected((IBISIPDateTime)null);
				return;
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__RECORDED_ARRIVAL_TIME:
				setRecordedArrivalTime((IBISIPDateTime)null);
				return;
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__DISTANCE_TO_NEXT_STOP:
				setDistanceToNextStop((IBISIPInt)null);
				return;
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__CONNECTION:
				getConnection().clear();
				return;
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__FARE_ZONE:
				getFareZone().clear();
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
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__STOP_INDEX:
				return stopIndex != null;
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__STOP_REF:
				return stopRef != null;
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__STOP_NAME:
				return stopName != null && !stopName.isEmpty();
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__STOP_ALTERNATIVE_NAME:
				return stopAlternativeName != null && !stopAlternativeName.isEmpty();
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__PLATFORM:
				return platform != null;
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__DISPLAY_CONTENT:
				return displayContent != null && !displayContent.isEmpty();
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__STOP_ANNOUNCEMENT:
				return stopAnnouncement != null && !stopAnnouncement.isEmpty();
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__ARRIVAL_SCHEDULED:
				return arrivalScheduled != null;
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__ARRIVAL_EXPECTED:
				return arrivalExpected != null;
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__DEPARTURE_SCHEDULED:
				return departureScheduled != null;
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__DEPARTURE_EXPECTED:
				return departureExpected != null;
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__RECORDED_ARRIVAL_TIME:
				return recordedArrivalTime != null;
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__DISTANCE_TO_NEXT_STOP:
				return distanceToNextStop != null;
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__CONNECTION:
				return connection != null && !connection.isEmpty();
			case IbisCommonPackage.STOP_INFORMATION_STRUCTURE__FARE_ZONE:
				return fareZone != null && !fareZone.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StopInformationStructureImpl
