/*
 */
package de.jena.mdo.ibis.ibis_common.impl;

import de.jena.mdo.ibis.ibis_common.FareZoneInformation;
import de.jena.mdo.ibis.ibis_common.IbisCommonPackage;
import de.jena.mdo.ibis.ibis_common.JourneyStopInformation;
import de.jena.mdo.ibis.ibis_common.ShortTripStop;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Short Trip Stop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.ShortTripStopImpl#getJourneyStopInformation <em>Journey Stop Information</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.ShortTripStopImpl#getFareZoneInformation <em>Fare Zone Information</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShortTripStopImpl extends MinimalEObjectImpl.Container implements ShortTripStop {
	/**
	 * The cached value of the '{@link #getJourneyStopInformation() <em>Journey Stop Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJourneyStopInformation()
	 * @generated
	 * @ordered
	 */
	protected JourneyStopInformation journeyStopInformation;

	/**
	 * The cached value of the '{@link #getFareZoneInformation() <em>Fare Zone Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFareZoneInformation()
	 * @generated
	 * @ordered
	 */
	protected FareZoneInformation fareZoneInformation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShortTripStopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.Literals.SHORT_TRIP_STOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JourneyStopInformation getJourneyStopInformation() {
		return journeyStopInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJourneyStopInformation(JourneyStopInformation newJourneyStopInformation, NotificationChain msgs) {
		JourneyStopInformation oldJourneyStopInformation = journeyStopInformation;
		journeyStopInformation = newJourneyStopInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.SHORT_TRIP_STOP__JOURNEY_STOP_INFORMATION, oldJourneyStopInformation, newJourneyStopInformation);
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
	public void setJourneyStopInformation(JourneyStopInformation newJourneyStopInformation) {
		if (newJourneyStopInformation != journeyStopInformation) {
			NotificationChain msgs = null;
			if (journeyStopInformation != null)
				msgs = ((InternalEObject)journeyStopInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.SHORT_TRIP_STOP__JOURNEY_STOP_INFORMATION, null, msgs);
			if (newJourneyStopInformation != null)
				msgs = ((InternalEObject)newJourneyStopInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.SHORT_TRIP_STOP__JOURNEY_STOP_INFORMATION, null, msgs);
			msgs = basicSetJourneyStopInformation(newJourneyStopInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.SHORT_TRIP_STOP__JOURNEY_STOP_INFORMATION, newJourneyStopInformation, newJourneyStopInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FareZoneInformation getFareZoneInformation() {
		return fareZoneInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFareZoneInformation(FareZoneInformation newFareZoneInformation, NotificationChain msgs) {
		FareZoneInformation oldFareZoneInformation = fareZoneInformation;
		fareZoneInformation = newFareZoneInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.SHORT_TRIP_STOP__FARE_ZONE_INFORMATION, oldFareZoneInformation, newFareZoneInformation);
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
	public void setFareZoneInformation(FareZoneInformation newFareZoneInformation) {
		if (newFareZoneInformation != fareZoneInformation) {
			NotificationChain msgs = null;
			if (fareZoneInformation != null)
				msgs = ((InternalEObject)fareZoneInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.SHORT_TRIP_STOP__FARE_ZONE_INFORMATION, null, msgs);
			if (newFareZoneInformation != null)
				msgs = ((InternalEObject)newFareZoneInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.SHORT_TRIP_STOP__FARE_ZONE_INFORMATION, null, msgs);
			msgs = basicSetFareZoneInformation(newFareZoneInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.SHORT_TRIP_STOP__FARE_ZONE_INFORMATION, newFareZoneInformation, newFareZoneInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.SHORT_TRIP_STOP__JOURNEY_STOP_INFORMATION:
				return basicSetJourneyStopInformation(null, msgs);
			case IbisCommonPackage.SHORT_TRIP_STOP__FARE_ZONE_INFORMATION:
				return basicSetFareZoneInformation(null, msgs);
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
			case IbisCommonPackage.SHORT_TRIP_STOP__JOURNEY_STOP_INFORMATION:
				return getJourneyStopInformation();
			case IbisCommonPackage.SHORT_TRIP_STOP__FARE_ZONE_INFORMATION:
				return getFareZoneInformation();
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
			case IbisCommonPackage.SHORT_TRIP_STOP__JOURNEY_STOP_INFORMATION:
				setJourneyStopInformation((JourneyStopInformation)newValue);
				return;
			case IbisCommonPackage.SHORT_TRIP_STOP__FARE_ZONE_INFORMATION:
				setFareZoneInformation((FareZoneInformation)newValue);
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
			case IbisCommonPackage.SHORT_TRIP_STOP__JOURNEY_STOP_INFORMATION:
				setJourneyStopInformation((JourneyStopInformation)null);
				return;
			case IbisCommonPackage.SHORT_TRIP_STOP__FARE_ZONE_INFORMATION:
				setFareZoneInformation((FareZoneInformation)null);
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
			case IbisCommonPackage.SHORT_TRIP_STOP__JOURNEY_STOP_INFORMATION:
				return journeyStopInformation != null;
			case IbisCommonPackage.SHORT_TRIP_STOP__FARE_ZONE_INFORMATION:
				return fareZoneInformation != null;
		}
		return super.eIsSet(featureID);
	}

} //ShortTripStopImpl
