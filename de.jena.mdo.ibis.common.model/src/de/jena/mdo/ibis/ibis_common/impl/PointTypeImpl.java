/*
 */
package de.jena.mdo.ibis.ibis_common.impl;

import de.jena.mdo.ibis.ibis_common.BeaconPoint;
import de.jena.mdo.ibis.ibis_common.GNSSPoint;
import de.jena.mdo.ibis.ibis_common.IbisCommonPackage;
import de.jena.mdo.ibis.ibis_common.JourneyStopInformation;
import de.jena.mdo.ibis.ibis_common.PointType;
import de.jena.mdo.ibis.ibis_common.TSPPoint;
import de.jena.mdo.ibis.ibis_common.TimingPoint;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Point Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.PointTypeImpl#getStopPoint <em>Stop Point</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.PointTypeImpl#getBeaconPoint <em>Beacon Point</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.PointTypeImpl#getGNSSLocationPoint <em>GNSS Location Point</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.PointTypeImpl#getTimingPoint <em>Timing Point</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.PointTypeImpl#getTSPPoint <em>TSP Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PointTypeImpl extends MinimalEObjectImpl.Container implements PointType {
	/**
	 * The cached value of the '{@link #getStopPoint() <em>Stop Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopPoint()
	 * @generated
	 * @ordered
	 */
	protected JourneyStopInformation stopPoint;

	/**
	 * The cached value of the '{@link #getBeaconPoint() <em>Beacon Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeaconPoint()
	 * @generated
	 * @ordered
	 */
	protected BeaconPoint beaconPoint;

	/**
	 * The cached value of the '{@link #getGNSSLocationPoint() <em>GNSS Location Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGNSSLocationPoint()
	 * @generated
	 * @ordered
	 */
	protected GNSSPoint gNSSLocationPoint;

	/**
	 * The cached value of the '{@link #getTimingPoint() <em>Timing Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingPoint()
	 * @generated
	 * @ordered
	 */
	protected TimingPoint timingPoint;

	/**
	 * The cached value of the '{@link #getTSPPoint() <em>TSP Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTSPPoint()
	 * @generated
	 * @ordered
	 */
	protected TSPPoint tSPPoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.Literals.POINT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JourneyStopInformation getStopPoint() {
		return stopPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStopPoint(JourneyStopInformation newStopPoint, NotificationChain msgs) {
		JourneyStopInformation oldStopPoint = stopPoint;
		stopPoint = newStopPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.POINT_TYPE__STOP_POINT, oldStopPoint, newStopPoint);
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
	public void setStopPoint(JourneyStopInformation newStopPoint) {
		if (newStopPoint != stopPoint) {
			NotificationChain msgs = null;
			if (stopPoint != null)
				msgs = ((InternalEObject)stopPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.POINT_TYPE__STOP_POINT, null, msgs);
			if (newStopPoint != null)
				msgs = ((InternalEObject)newStopPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.POINT_TYPE__STOP_POINT, null, msgs);
			msgs = basicSetStopPoint(newStopPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.POINT_TYPE__STOP_POINT, newStopPoint, newStopPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BeaconPoint getBeaconPoint() {
		return beaconPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeaconPoint(BeaconPoint newBeaconPoint, NotificationChain msgs) {
		BeaconPoint oldBeaconPoint = beaconPoint;
		beaconPoint = newBeaconPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.POINT_TYPE__BEACON_POINT, oldBeaconPoint, newBeaconPoint);
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
	public void setBeaconPoint(BeaconPoint newBeaconPoint) {
		if (newBeaconPoint != beaconPoint) {
			NotificationChain msgs = null;
			if (beaconPoint != null)
				msgs = ((InternalEObject)beaconPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.POINT_TYPE__BEACON_POINT, null, msgs);
			if (newBeaconPoint != null)
				msgs = ((InternalEObject)newBeaconPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.POINT_TYPE__BEACON_POINT, null, msgs);
			msgs = basicSetBeaconPoint(newBeaconPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.POINT_TYPE__BEACON_POINT, newBeaconPoint, newBeaconPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GNSSPoint getGNSSLocationPoint() {
		return gNSSLocationPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGNSSLocationPoint(GNSSPoint newGNSSLocationPoint, NotificationChain msgs) {
		GNSSPoint oldGNSSLocationPoint = gNSSLocationPoint;
		gNSSLocationPoint = newGNSSLocationPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.POINT_TYPE__GNSS_LOCATION_POINT, oldGNSSLocationPoint, newGNSSLocationPoint);
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
	public void setGNSSLocationPoint(GNSSPoint newGNSSLocationPoint) {
		if (newGNSSLocationPoint != gNSSLocationPoint) {
			NotificationChain msgs = null;
			if (gNSSLocationPoint != null)
				msgs = ((InternalEObject)gNSSLocationPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.POINT_TYPE__GNSS_LOCATION_POINT, null, msgs);
			if (newGNSSLocationPoint != null)
				msgs = ((InternalEObject)newGNSSLocationPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.POINT_TYPE__GNSS_LOCATION_POINT, null, msgs);
			msgs = basicSetGNSSLocationPoint(newGNSSLocationPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.POINT_TYPE__GNSS_LOCATION_POINT, newGNSSLocationPoint, newGNSSLocationPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimingPoint getTimingPoint() {
		return timingPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimingPoint(TimingPoint newTimingPoint, NotificationChain msgs) {
		TimingPoint oldTimingPoint = timingPoint;
		timingPoint = newTimingPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.POINT_TYPE__TIMING_POINT, oldTimingPoint, newTimingPoint);
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
	public void setTimingPoint(TimingPoint newTimingPoint) {
		if (newTimingPoint != timingPoint) {
			NotificationChain msgs = null;
			if (timingPoint != null)
				msgs = ((InternalEObject)timingPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.POINT_TYPE__TIMING_POINT, null, msgs);
			if (newTimingPoint != null)
				msgs = ((InternalEObject)newTimingPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.POINT_TYPE__TIMING_POINT, null, msgs);
			msgs = basicSetTimingPoint(newTimingPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.POINT_TYPE__TIMING_POINT, newTimingPoint, newTimingPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TSPPoint getTSPPoint() {
		return tSPPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTSPPoint(TSPPoint newTSPPoint, NotificationChain msgs) {
		TSPPoint oldTSPPoint = tSPPoint;
		tSPPoint = newTSPPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.POINT_TYPE__TSP_POINT, oldTSPPoint, newTSPPoint);
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
	public void setTSPPoint(TSPPoint newTSPPoint) {
		if (newTSPPoint != tSPPoint) {
			NotificationChain msgs = null;
			if (tSPPoint != null)
				msgs = ((InternalEObject)tSPPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.POINT_TYPE__TSP_POINT, null, msgs);
			if (newTSPPoint != null)
				msgs = ((InternalEObject)newTSPPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.POINT_TYPE__TSP_POINT, null, msgs);
			msgs = basicSetTSPPoint(newTSPPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.POINT_TYPE__TSP_POINT, newTSPPoint, newTSPPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.POINT_TYPE__STOP_POINT:
				return basicSetStopPoint(null, msgs);
			case IbisCommonPackage.POINT_TYPE__BEACON_POINT:
				return basicSetBeaconPoint(null, msgs);
			case IbisCommonPackage.POINT_TYPE__GNSS_LOCATION_POINT:
				return basicSetGNSSLocationPoint(null, msgs);
			case IbisCommonPackage.POINT_TYPE__TIMING_POINT:
				return basicSetTimingPoint(null, msgs);
			case IbisCommonPackage.POINT_TYPE__TSP_POINT:
				return basicSetTSPPoint(null, msgs);
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
			case IbisCommonPackage.POINT_TYPE__STOP_POINT:
				return getStopPoint();
			case IbisCommonPackage.POINT_TYPE__BEACON_POINT:
				return getBeaconPoint();
			case IbisCommonPackage.POINT_TYPE__GNSS_LOCATION_POINT:
				return getGNSSLocationPoint();
			case IbisCommonPackage.POINT_TYPE__TIMING_POINT:
				return getTimingPoint();
			case IbisCommonPackage.POINT_TYPE__TSP_POINT:
				return getTSPPoint();
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
			case IbisCommonPackage.POINT_TYPE__STOP_POINT:
				setStopPoint((JourneyStopInformation)newValue);
				return;
			case IbisCommonPackage.POINT_TYPE__BEACON_POINT:
				setBeaconPoint((BeaconPoint)newValue);
				return;
			case IbisCommonPackage.POINT_TYPE__GNSS_LOCATION_POINT:
				setGNSSLocationPoint((GNSSPoint)newValue);
				return;
			case IbisCommonPackage.POINT_TYPE__TIMING_POINT:
				setTimingPoint((TimingPoint)newValue);
				return;
			case IbisCommonPackage.POINT_TYPE__TSP_POINT:
				setTSPPoint((TSPPoint)newValue);
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
			case IbisCommonPackage.POINT_TYPE__STOP_POINT:
				setStopPoint((JourneyStopInformation)null);
				return;
			case IbisCommonPackage.POINT_TYPE__BEACON_POINT:
				setBeaconPoint((BeaconPoint)null);
				return;
			case IbisCommonPackage.POINT_TYPE__GNSS_LOCATION_POINT:
				setGNSSLocationPoint((GNSSPoint)null);
				return;
			case IbisCommonPackage.POINT_TYPE__TIMING_POINT:
				setTimingPoint((TimingPoint)null);
				return;
			case IbisCommonPackage.POINT_TYPE__TSP_POINT:
				setTSPPoint((TSPPoint)null);
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
			case IbisCommonPackage.POINT_TYPE__STOP_POINT:
				return stopPoint != null;
			case IbisCommonPackage.POINT_TYPE__BEACON_POINT:
				return beaconPoint != null;
			case IbisCommonPackage.POINT_TYPE__GNSS_LOCATION_POINT:
				return gNSSLocationPoint != null;
			case IbisCommonPackage.POINT_TYPE__TIMING_POINT:
				return timingPoint != null;
			case IbisCommonPackage.POINT_TYPE__TSP_POINT:
				return tSPPoint != null;
		}
		return super.eIsSet(featureID);
	}

} //PointTypeImpl
