/*
 */
package de.jena.mdo.ibis.common.impl;

import de.jena.mdo.ibis.common.BeaconPointStructure;
import de.jena.mdo.ibis.common.GNSSPointStructure;
import de.jena.mdo.ibis.common.IbisCommonPackage;
import de.jena.mdo.ibis.common.JourneyStopInformationStructure;
import de.jena.mdo.ibis.common.PointTypeStructure;
import de.jena.mdo.ibis.common.TSPPointStructure;
import de.jena.mdo.ibis.common.TimingPointStructure;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Point Type Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.impl.PointTypeStructureImpl#getStopPoint <em>Stop Point</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.PointTypeStructureImpl#getBeaconPoint <em>Beacon Point</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.PointTypeStructureImpl#getGNSSLocationPoint <em>GNSS Location Point</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.PointTypeStructureImpl#getTimingPoint <em>Timing Point</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.PointTypeStructureImpl#getTSPPoint <em>TSP Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PointTypeStructureImpl extends MinimalEObjectImpl.Container implements PointTypeStructure {
	/**
	 * The cached value of the '{@link #getStopPoint() <em>Stop Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopPoint()
	 * @generated
	 * @ordered
	 */
	protected JourneyStopInformationStructure stopPoint;

	/**
	 * The cached value of the '{@link #getBeaconPoint() <em>Beacon Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeaconPoint()
	 * @generated
	 * @ordered
	 */
	protected BeaconPointStructure beaconPoint;

	/**
	 * The cached value of the '{@link #getGNSSLocationPoint() <em>GNSS Location Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGNSSLocationPoint()
	 * @generated
	 * @ordered
	 */
	protected GNSSPointStructure gNSSLocationPoint;

	/**
	 * The cached value of the '{@link #getTimingPoint() <em>Timing Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingPoint()
	 * @generated
	 * @ordered
	 */
	protected TimingPointStructure timingPoint;

	/**
	 * The cached value of the '{@link #getTSPPoint() <em>TSP Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTSPPoint()
	 * @generated
	 * @ordered
	 */
	protected TSPPointStructure tSPPoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointTypeStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.Literals.POINT_TYPE_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JourneyStopInformationStructure getStopPoint() {
		return stopPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStopPoint(JourneyStopInformationStructure newStopPoint, NotificationChain msgs) {
		JourneyStopInformationStructure oldStopPoint = stopPoint;
		stopPoint = newStopPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.POINT_TYPE_STRUCTURE__STOP_POINT, oldStopPoint, newStopPoint);
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
	public void setStopPoint(JourneyStopInformationStructure newStopPoint) {
		if (newStopPoint != stopPoint) {
			NotificationChain msgs = null;
			if (stopPoint != null)
				msgs = ((InternalEObject)stopPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.POINT_TYPE_STRUCTURE__STOP_POINT, null, msgs);
			if (newStopPoint != null)
				msgs = ((InternalEObject)newStopPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.POINT_TYPE_STRUCTURE__STOP_POINT, null, msgs);
			msgs = basicSetStopPoint(newStopPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.POINT_TYPE_STRUCTURE__STOP_POINT, newStopPoint, newStopPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BeaconPointStructure getBeaconPoint() {
		return beaconPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeaconPoint(BeaconPointStructure newBeaconPoint, NotificationChain msgs) {
		BeaconPointStructure oldBeaconPoint = beaconPoint;
		beaconPoint = newBeaconPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.POINT_TYPE_STRUCTURE__BEACON_POINT, oldBeaconPoint, newBeaconPoint);
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
	public void setBeaconPoint(BeaconPointStructure newBeaconPoint) {
		if (newBeaconPoint != beaconPoint) {
			NotificationChain msgs = null;
			if (beaconPoint != null)
				msgs = ((InternalEObject)beaconPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.POINT_TYPE_STRUCTURE__BEACON_POINT, null, msgs);
			if (newBeaconPoint != null)
				msgs = ((InternalEObject)newBeaconPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.POINT_TYPE_STRUCTURE__BEACON_POINT, null, msgs);
			msgs = basicSetBeaconPoint(newBeaconPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.POINT_TYPE_STRUCTURE__BEACON_POINT, newBeaconPoint, newBeaconPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GNSSPointStructure getGNSSLocationPoint() {
		return gNSSLocationPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGNSSLocationPoint(GNSSPointStructure newGNSSLocationPoint, NotificationChain msgs) {
		GNSSPointStructure oldGNSSLocationPoint = gNSSLocationPoint;
		gNSSLocationPoint = newGNSSLocationPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.POINT_TYPE_STRUCTURE__GNSS_LOCATION_POINT, oldGNSSLocationPoint, newGNSSLocationPoint);
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
	public void setGNSSLocationPoint(GNSSPointStructure newGNSSLocationPoint) {
		if (newGNSSLocationPoint != gNSSLocationPoint) {
			NotificationChain msgs = null;
			if (gNSSLocationPoint != null)
				msgs = ((InternalEObject)gNSSLocationPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.POINT_TYPE_STRUCTURE__GNSS_LOCATION_POINT, null, msgs);
			if (newGNSSLocationPoint != null)
				msgs = ((InternalEObject)newGNSSLocationPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.POINT_TYPE_STRUCTURE__GNSS_LOCATION_POINT, null, msgs);
			msgs = basicSetGNSSLocationPoint(newGNSSLocationPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.POINT_TYPE_STRUCTURE__GNSS_LOCATION_POINT, newGNSSLocationPoint, newGNSSLocationPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimingPointStructure getTimingPoint() {
		return timingPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimingPoint(TimingPointStructure newTimingPoint, NotificationChain msgs) {
		TimingPointStructure oldTimingPoint = timingPoint;
		timingPoint = newTimingPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.POINT_TYPE_STRUCTURE__TIMING_POINT, oldTimingPoint, newTimingPoint);
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
	public void setTimingPoint(TimingPointStructure newTimingPoint) {
		if (newTimingPoint != timingPoint) {
			NotificationChain msgs = null;
			if (timingPoint != null)
				msgs = ((InternalEObject)timingPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.POINT_TYPE_STRUCTURE__TIMING_POINT, null, msgs);
			if (newTimingPoint != null)
				msgs = ((InternalEObject)newTimingPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.POINT_TYPE_STRUCTURE__TIMING_POINT, null, msgs);
			msgs = basicSetTimingPoint(newTimingPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.POINT_TYPE_STRUCTURE__TIMING_POINT, newTimingPoint, newTimingPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TSPPointStructure getTSPPoint() {
		return tSPPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTSPPoint(TSPPointStructure newTSPPoint, NotificationChain msgs) {
		TSPPointStructure oldTSPPoint = tSPPoint;
		tSPPoint = newTSPPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.POINT_TYPE_STRUCTURE__TSP_POINT, oldTSPPoint, newTSPPoint);
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
	public void setTSPPoint(TSPPointStructure newTSPPoint) {
		if (newTSPPoint != tSPPoint) {
			NotificationChain msgs = null;
			if (tSPPoint != null)
				msgs = ((InternalEObject)tSPPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.POINT_TYPE_STRUCTURE__TSP_POINT, null, msgs);
			if (newTSPPoint != null)
				msgs = ((InternalEObject)newTSPPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.POINT_TYPE_STRUCTURE__TSP_POINT, null, msgs);
			msgs = basicSetTSPPoint(newTSPPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.POINT_TYPE_STRUCTURE__TSP_POINT, newTSPPoint, newTSPPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.POINT_TYPE_STRUCTURE__STOP_POINT:
				return basicSetStopPoint(null, msgs);
			case IbisCommonPackage.POINT_TYPE_STRUCTURE__BEACON_POINT:
				return basicSetBeaconPoint(null, msgs);
			case IbisCommonPackage.POINT_TYPE_STRUCTURE__GNSS_LOCATION_POINT:
				return basicSetGNSSLocationPoint(null, msgs);
			case IbisCommonPackage.POINT_TYPE_STRUCTURE__TIMING_POINT:
				return basicSetTimingPoint(null, msgs);
			case IbisCommonPackage.POINT_TYPE_STRUCTURE__TSP_POINT:
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
			case IbisCommonPackage.POINT_TYPE_STRUCTURE__STOP_POINT:
				return getStopPoint();
			case IbisCommonPackage.POINT_TYPE_STRUCTURE__BEACON_POINT:
				return getBeaconPoint();
			case IbisCommonPackage.POINT_TYPE_STRUCTURE__GNSS_LOCATION_POINT:
				return getGNSSLocationPoint();
			case IbisCommonPackage.POINT_TYPE_STRUCTURE__TIMING_POINT:
				return getTimingPoint();
			case IbisCommonPackage.POINT_TYPE_STRUCTURE__TSP_POINT:
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
			case IbisCommonPackage.POINT_TYPE_STRUCTURE__STOP_POINT:
				setStopPoint((JourneyStopInformationStructure)newValue);
				return;
			case IbisCommonPackage.POINT_TYPE_STRUCTURE__BEACON_POINT:
				setBeaconPoint((BeaconPointStructure)newValue);
				return;
			case IbisCommonPackage.POINT_TYPE_STRUCTURE__GNSS_LOCATION_POINT:
				setGNSSLocationPoint((GNSSPointStructure)newValue);
				return;
			case IbisCommonPackage.POINT_TYPE_STRUCTURE__TIMING_POINT:
				setTimingPoint((TimingPointStructure)newValue);
				return;
			case IbisCommonPackage.POINT_TYPE_STRUCTURE__TSP_POINT:
				setTSPPoint((TSPPointStructure)newValue);
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
			case IbisCommonPackage.POINT_TYPE_STRUCTURE__STOP_POINT:
				setStopPoint((JourneyStopInformationStructure)null);
				return;
			case IbisCommonPackage.POINT_TYPE_STRUCTURE__BEACON_POINT:
				setBeaconPoint((BeaconPointStructure)null);
				return;
			case IbisCommonPackage.POINT_TYPE_STRUCTURE__GNSS_LOCATION_POINT:
				setGNSSLocationPoint((GNSSPointStructure)null);
				return;
			case IbisCommonPackage.POINT_TYPE_STRUCTURE__TIMING_POINT:
				setTimingPoint((TimingPointStructure)null);
				return;
			case IbisCommonPackage.POINT_TYPE_STRUCTURE__TSP_POINT:
				setTSPPoint((TSPPointStructure)null);
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
			case IbisCommonPackage.POINT_TYPE_STRUCTURE__STOP_POINT:
				return stopPoint != null;
			case IbisCommonPackage.POINT_TYPE_STRUCTURE__BEACON_POINT:
				return beaconPoint != null;
			case IbisCommonPackage.POINT_TYPE_STRUCTURE__GNSS_LOCATION_POINT:
				return gNSSLocationPoint != null;
			case IbisCommonPackage.POINT_TYPE_STRUCTURE__TIMING_POINT:
				return timingPoint != null;
			case IbisCommonPackage.POINT_TYPE_STRUCTURE__TSP_POINT:
				return tSPPoint != null;
		}
		return super.eIsSet(featureID);
	}

} //PointTypeStructureImpl
