/*
 */
package de.jena.mdo.ibis.common.impl;

import de.jena.mdo.ibis.common.IBISIPInt;
import de.jena.mdo.ibis.common.IBISIPNMTOKEN;
import de.jena.mdo.ibis.common.IBISIPTime;
import de.jena.mdo.ibis.common.IbisCommonPackage;
import de.jena.mdo.ibis.common.PointSequenceStructure;
import de.jena.mdo.ibis.common.TripSequenceStructure;

import de.jena.mdo.ibis.enumerations.JourneyModeEnumeration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trip Sequence Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.impl.TripSequenceStructureImpl#getTripRef <em>Trip Ref</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.TripSequenceStructureImpl#getTripIndex <em>Trip Index</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.TripSequenceStructureImpl#getTripStart <em>Trip Start</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.TripSequenceStructureImpl#getCurrentStopIndex <em>Current Stop Index</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.TripSequenceStructureImpl#getJourneyMode <em>Journey Mode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.TripSequenceStructureImpl#getPointSequence <em>Point Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TripSequenceStructureImpl extends MinimalEObjectImpl.Container implements TripSequenceStructure {
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
	 * The cached value of the '{@link #getTripIndex() <em>Trip Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTripIndex()
	 * @generated
	 * @ordered
	 */
	protected IBISIPInt tripIndex;

	/**
	 * The cached value of the '{@link #getTripStart() <em>Trip Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTripStart()
	 * @generated
	 * @ordered
	 */
	protected IBISIPTime tripStart;

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
	 * The default value of the '{@link #getJourneyMode() <em>Journey Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJourneyMode()
	 * @generated
	 * @ordered
	 */
	protected static final JourneyModeEnumeration JOURNEY_MODE_EDEFAULT = JourneyModeEnumeration.NO_TRIP;

	/**
	 * The cached value of the '{@link #getJourneyMode() <em>Journey Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJourneyMode()
	 * @generated
	 * @ordered
	 */
	protected JourneyModeEnumeration journeyMode = JOURNEY_MODE_EDEFAULT;

	/**
	 * This is true if the Journey Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean journeyModeESet;

	/**
	 * The cached value of the '{@link #getPointSequence() <em>Point Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointSequence()
	 * @generated
	 * @ordered
	 */
	protected PointSequenceStructure pointSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TripSequenceStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.Literals.TRIP_SEQUENCE_STRUCTURE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__TRIP_REF, oldTripRef, newTripRef);
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
				msgs = ((InternalEObject)tripRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__TRIP_REF, null, msgs);
			if (newTripRef != null)
				msgs = ((InternalEObject)newTripRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__TRIP_REF, null, msgs);
			msgs = basicSetTripRef(newTripRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__TRIP_REF, newTripRef, newTripRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPInt getTripIndex() {
		return tripIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTripIndex(IBISIPInt newTripIndex, NotificationChain msgs) {
		IBISIPInt oldTripIndex = tripIndex;
		tripIndex = newTripIndex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__TRIP_INDEX, oldTripIndex, newTripIndex);
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
	public void setTripIndex(IBISIPInt newTripIndex) {
		if (newTripIndex != tripIndex) {
			NotificationChain msgs = null;
			if (tripIndex != null)
				msgs = ((InternalEObject)tripIndex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__TRIP_INDEX, null, msgs);
			if (newTripIndex != null)
				msgs = ((InternalEObject)newTripIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__TRIP_INDEX, null, msgs);
			msgs = basicSetTripIndex(newTripIndex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__TRIP_INDEX, newTripIndex, newTripIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPTime getTripStart() {
		return tripStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTripStart(IBISIPTime newTripStart, NotificationChain msgs) {
		IBISIPTime oldTripStart = tripStart;
		tripStart = newTripStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__TRIP_START, oldTripStart, newTripStart);
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
	public void setTripStart(IBISIPTime newTripStart) {
		if (newTripStart != tripStart) {
			NotificationChain msgs = null;
			if (tripStart != null)
				msgs = ((InternalEObject)tripStart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__TRIP_START, null, msgs);
			if (newTripStart != null)
				msgs = ((InternalEObject)newTripStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__TRIP_START, null, msgs);
			msgs = basicSetTripStart(newTripStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__TRIP_START, newTripStart, newTripStart));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__CURRENT_STOP_INDEX, oldCurrentStopIndex, newCurrentStopIndex);
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
				msgs = ((InternalEObject)currentStopIndex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__CURRENT_STOP_INDEX, null, msgs);
			if (newCurrentStopIndex != null)
				msgs = ((InternalEObject)newCurrentStopIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__CURRENT_STOP_INDEX, null, msgs);
			msgs = basicSetCurrentStopIndex(newCurrentStopIndex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__CURRENT_STOP_INDEX, newCurrentStopIndex, newCurrentStopIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JourneyModeEnumeration getJourneyMode() {
		return journeyMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJourneyMode(JourneyModeEnumeration newJourneyMode) {
		JourneyModeEnumeration oldJourneyMode = journeyMode;
		journeyMode = newJourneyMode == null ? JOURNEY_MODE_EDEFAULT : newJourneyMode;
		boolean oldJourneyModeESet = journeyModeESet;
		journeyModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__JOURNEY_MODE, oldJourneyMode, journeyMode, !oldJourneyModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetJourneyMode() {
		JourneyModeEnumeration oldJourneyMode = journeyMode;
		boolean oldJourneyModeESet = journeyModeESet;
		journeyMode = JOURNEY_MODE_EDEFAULT;
		journeyModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__JOURNEY_MODE, oldJourneyMode, JOURNEY_MODE_EDEFAULT, oldJourneyModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetJourneyMode() {
		return journeyModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointSequenceStructure getPointSequence() {
		return pointSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointSequence(PointSequenceStructure newPointSequence, NotificationChain msgs) {
		PointSequenceStructure oldPointSequence = pointSequence;
		pointSequence = newPointSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__POINT_SEQUENCE, oldPointSequence, newPointSequence);
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
	public void setPointSequence(PointSequenceStructure newPointSequence) {
		if (newPointSequence != pointSequence) {
			NotificationChain msgs = null;
			if (pointSequence != null)
				msgs = ((InternalEObject)pointSequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__POINT_SEQUENCE, null, msgs);
			if (newPointSequence != null)
				msgs = ((InternalEObject)newPointSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__POINT_SEQUENCE, null, msgs);
			msgs = basicSetPointSequence(newPointSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__POINT_SEQUENCE, newPointSequence, newPointSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__TRIP_REF:
				return basicSetTripRef(null, msgs);
			case IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__TRIP_INDEX:
				return basicSetTripIndex(null, msgs);
			case IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__TRIP_START:
				return basicSetTripStart(null, msgs);
			case IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__CURRENT_STOP_INDEX:
				return basicSetCurrentStopIndex(null, msgs);
			case IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__POINT_SEQUENCE:
				return basicSetPointSequence(null, msgs);
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
			case IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__TRIP_REF:
				return getTripRef();
			case IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__TRIP_INDEX:
				return getTripIndex();
			case IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__TRIP_START:
				return getTripStart();
			case IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__CURRENT_STOP_INDEX:
				return getCurrentStopIndex();
			case IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__JOURNEY_MODE:
				return getJourneyMode();
			case IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__POINT_SEQUENCE:
				return getPointSequence();
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
			case IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__TRIP_REF:
				setTripRef((IBISIPNMTOKEN)newValue);
				return;
			case IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__TRIP_INDEX:
				setTripIndex((IBISIPInt)newValue);
				return;
			case IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__TRIP_START:
				setTripStart((IBISIPTime)newValue);
				return;
			case IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__CURRENT_STOP_INDEX:
				setCurrentStopIndex((IBISIPInt)newValue);
				return;
			case IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__JOURNEY_MODE:
				setJourneyMode((JourneyModeEnumeration)newValue);
				return;
			case IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__POINT_SEQUENCE:
				setPointSequence((PointSequenceStructure)newValue);
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
			case IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__TRIP_REF:
				setTripRef((IBISIPNMTOKEN)null);
				return;
			case IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__TRIP_INDEX:
				setTripIndex((IBISIPInt)null);
				return;
			case IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__TRIP_START:
				setTripStart((IBISIPTime)null);
				return;
			case IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__CURRENT_STOP_INDEX:
				setCurrentStopIndex((IBISIPInt)null);
				return;
			case IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__JOURNEY_MODE:
				unsetJourneyMode();
				return;
			case IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__POINT_SEQUENCE:
				setPointSequence((PointSequenceStructure)null);
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
			case IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__TRIP_REF:
				return tripRef != null;
			case IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__TRIP_INDEX:
				return tripIndex != null;
			case IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__TRIP_START:
				return tripStart != null;
			case IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__CURRENT_STOP_INDEX:
				return currentStopIndex != null;
			case IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__JOURNEY_MODE:
				return isSetJourneyMode();
			case IbisCommonPackage.TRIP_SEQUENCE_STRUCTURE__POINT_SEQUENCE:
				return pointSequence != null;
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
		result.append(" (journeyMode: ");
		if (journeyModeESet) result.append(journeyMode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TripSequenceStructureImpl
