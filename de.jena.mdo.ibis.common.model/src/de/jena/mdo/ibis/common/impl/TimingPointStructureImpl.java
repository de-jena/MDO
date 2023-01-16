/*
 */
package de.jena.mdo.ibis.common.impl;

import de.jena.mdo.ibis.common.GNSSPointStructure;
import de.jena.mdo.ibis.common.IBISIPDateTime;
import de.jena.mdo.ibis.common.IBISIPNMTOKEN;
import de.jena.mdo.ibis.common.IbisCommonPackage;
import de.jena.mdo.ibis.common.TimingPointStructure;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timing Point Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.impl.TimingPointStructureImpl#getTimingPointRef <em>Timing Point Ref</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.TimingPointStructureImpl#getScheduleTime <em>Schedule Time</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.TimingPointStructureImpl#getGNSSPoint <em>GNSS Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimingPointStructureImpl extends MinimalEObjectImpl.Container implements TimingPointStructure {
	/**
	 * The cached value of the '{@link #getTimingPointRef() <em>Timing Point Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingPointRef()
	 * @generated
	 * @ordered
	 */
	protected IBISIPNMTOKEN timingPointRef;

	/**
	 * The cached value of the '{@link #getScheduleTime() <em>Schedule Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleTime()
	 * @generated
	 * @ordered
	 */
	protected IBISIPDateTime scheduleTime;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimingPointStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.eINSTANCE.getTimingPointStructure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPNMTOKEN getTimingPointRef() {
		return timingPointRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimingPointRef(IBISIPNMTOKEN newTimingPointRef, NotificationChain msgs) {
		IBISIPNMTOKEN oldTimingPointRef = timingPointRef;
		timingPointRef = newTimingPointRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TIMING_POINT_STRUCTURE__TIMING_POINT_REF, oldTimingPointRef, newTimingPointRef);
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
	public void setTimingPointRef(IBISIPNMTOKEN newTimingPointRef) {
		if (newTimingPointRef != timingPointRef) {
			NotificationChain msgs = null;
			if (timingPointRef != null)
				msgs = ((InternalEObject)timingPointRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TIMING_POINT_STRUCTURE__TIMING_POINT_REF, null, msgs);
			if (newTimingPointRef != null)
				msgs = ((InternalEObject)newTimingPointRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TIMING_POINT_STRUCTURE__TIMING_POINT_REF, null, msgs);
			msgs = basicSetTimingPointRef(newTimingPointRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TIMING_POINT_STRUCTURE__TIMING_POINT_REF, newTimingPointRef, newTimingPointRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPDateTime getScheduleTime() {
		return scheduleTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScheduleTime(IBISIPDateTime newScheduleTime, NotificationChain msgs) {
		IBISIPDateTime oldScheduleTime = scheduleTime;
		scheduleTime = newScheduleTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TIMING_POINT_STRUCTURE__SCHEDULE_TIME, oldScheduleTime, newScheduleTime);
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
	public void setScheduleTime(IBISIPDateTime newScheduleTime) {
		if (newScheduleTime != scheduleTime) {
			NotificationChain msgs = null;
			if (scheduleTime != null)
				msgs = ((InternalEObject)scheduleTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TIMING_POINT_STRUCTURE__SCHEDULE_TIME, null, msgs);
			if (newScheduleTime != null)
				msgs = ((InternalEObject)newScheduleTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TIMING_POINT_STRUCTURE__SCHEDULE_TIME, null, msgs);
			msgs = basicSetScheduleTime(newScheduleTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TIMING_POINT_STRUCTURE__SCHEDULE_TIME, newScheduleTime, newScheduleTime));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TIMING_POINT_STRUCTURE__GNSS_POINT, oldGNSSPoint, newGNSSPoint);
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
				msgs = ((InternalEObject)gNSSPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TIMING_POINT_STRUCTURE__GNSS_POINT, null, msgs);
			if (newGNSSPoint != null)
				msgs = ((InternalEObject)newGNSSPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.TIMING_POINT_STRUCTURE__GNSS_POINT, null, msgs);
			msgs = basicSetGNSSPoint(newGNSSPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.TIMING_POINT_STRUCTURE__GNSS_POINT, newGNSSPoint, newGNSSPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.TIMING_POINT_STRUCTURE__TIMING_POINT_REF:
				return basicSetTimingPointRef(null, msgs);
			case IbisCommonPackage.TIMING_POINT_STRUCTURE__SCHEDULE_TIME:
				return basicSetScheduleTime(null, msgs);
			case IbisCommonPackage.TIMING_POINT_STRUCTURE__GNSS_POINT:
				return basicSetGNSSPoint(null, msgs);
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
			case IbisCommonPackage.TIMING_POINT_STRUCTURE__TIMING_POINT_REF:
				return getTimingPointRef();
			case IbisCommonPackage.TIMING_POINT_STRUCTURE__SCHEDULE_TIME:
				return getScheduleTime();
			case IbisCommonPackage.TIMING_POINT_STRUCTURE__GNSS_POINT:
				return getGNSSPoint();
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
			case IbisCommonPackage.TIMING_POINT_STRUCTURE__TIMING_POINT_REF:
				setTimingPointRef((IBISIPNMTOKEN)newValue);
				return;
			case IbisCommonPackage.TIMING_POINT_STRUCTURE__SCHEDULE_TIME:
				setScheduleTime((IBISIPDateTime)newValue);
				return;
			case IbisCommonPackage.TIMING_POINT_STRUCTURE__GNSS_POINT:
				setGNSSPoint((GNSSPointStructure)newValue);
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
			case IbisCommonPackage.TIMING_POINT_STRUCTURE__TIMING_POINT_REF:
				setTimingPointRef((IBISIPNMTOKEN)null);
				return;
			case IbisCommonPackage.TIMING_POINT_STRUCTURE__SCHEDULE_TIME:
				setScheduleTime((IBISIPDateTime)null);
				return;
			case IbisCommonPackage.TIMING_POINT_STRUCTURE__GNSS_POINT:
				setGNSSPoint((GNSSPointStructure)null);
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
			case IbisCommonPackage.TIMING_POINT_STRUCTURE__TIMING_POINT_REF:
				return timingPointRef != null;
			case IbisCommonPackage.TIMING_POINT_STRUCTURE__SCHEDULE_TIME:
				return scheduleTime != null;
			case IbisCommonPackage.TIMING_POINT_STRUCTURE__GNSS_POINT:
				return gNSSPoint != null;
		}
		return super.eIsSet(featureID);
	}

} //TimingPointStructureImpl
