/*
 */
package de.jena.mdo.ibis.common.impl;

import de.jena.mdo.ibis.common.FareZoneInformationStructure;
import de.jena.mdo.ibis.common.IbisCommonPackage;
import de.jena.mdo.ibis.common.JourneyStopInformationStructure;
import de.jena.mdo.ibis.common.StopPointTariffInformationStructure;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stop Point Tariff Information Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.impl.StopPointTariffInformationStructureImpl#getJourneyStopInformation <em>Journey Stop Information</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.StopPointTariffInformationStructureImpl#getFareZoneInformation <em>Fare Zone Information</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StopPointTariffInformationStructureImpl extends MinimalEObjectImpl.Container implements StopPointTariffInformationStructure {
	/**
	 * The cached value of the '{@link #getJourneyStopInformation() <em>Journey Stop Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJourneyStopInformation()
	 * @generated
	 * @ordered
	 */
	protected JourneyStopInformationStructure journeyStopInformation;

	/**
	 * The cached value of the '{@link #getFareZoneInformation() <em>Fare Zone Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFareZoneInformation()
	 * @generated
	 * @ordered
	 */
	protected FareZoneInformationStructure fareZoneInformation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StopPointTariffInformationStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.Literals.STOP_POINT_TARIFF_INFORMATION_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JourneyStopInformationStructure getJourneyStopInformation() {
		return journeyStopInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJourneyStopInformation(JourneyStopInformationStructure newJourneyStopInformation, NotificationChain msgs) {
		JourneyStopInformationStructure oldJourneyStopInformation = journeyStopInformation;
		journeyStopInformation = newJourneyStopInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.STOP_POINT_TARIFF_INFORMATION_STRUCTURE__JOURNEY_STOP_INFORMATION, oldJourneyStopInformation, newJourneyStopInformation);
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
	public void setJourneyStopInformation(JourneyStopInformationStructure newJourneyStopInformation) {
		if (newJourneyStopInformation != journeyStopInformation) {
			NotificationChain msgs = null;
			if (journeyStopInformation != null)
				msgs = ((InternalEObject)journeyStopInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.STOP_POINT_TARIFF_INFORMATION_STRUCTURE__JOURNEY_STOP_INFORMATION, null, msgs);
			if (newJourneyStopInformation != null)
				msgs = ((InternalEObject)newJourneyStopInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.STOP_POINT_TARIFF_INFORMATION_STRUCTURE__JOURNEY_STOP_INFORMATION, null, msgs);
			msgs = basicSetJourneyStopInformation(newJourneyStopInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.STOP_POINT_TARIFF_INFORMATION_STRUCTURE__JOURNEY_STOP_INFORMATION, newJourneyStopInformation, newJourneyStopInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FareZoneInformationStructure getFareZoneInformation() {
		return fareZoneInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFareZoneInformation(FareZoneInformationStructure newFareZoneInformation, NotificationChain msgs) {
		FareZoneInformationStructure oldFareZoneInformation = fareZoneInformation;
		fareZoneInformation = newFareZoneInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.STOP_POINT_TARIFF_INFORMATION_STRUCTURE__FARE_ZONE_INFORMATION, oldFareZoneInformation, newFareZoneInformation);
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
	public void setFareZoneInformation(FareZoneInformationStructure newFareZoneInformation) {
		if (newFareZoneInformation != fareZoneInformation) {
			NotificationChain msgs = null;
			if (fareZoneInformation != null)
				msgs = ((InternalEObject)fareZoneInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.STOP_POINT_TARIFF_INFORMATION_STRUCTURE__FARE_ZONE_INFORMATION, null, msgs);
			if (newFareZoneInformation != null)
				msgs = ((InternalEObject)newFareZoneInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.STOP_POINT_TARIFF_INFORMATION_STRUCTURE__FARE_ZONE_INFORMATION, null, msgs);
			msgs = basicSetFareZoneInformation(newFareZoneInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.STOP_POINT_TARIFF_INFORMATION_STRUCTURE__FARE_ZONE_INFORMATION, newFareZoneInformation, newFareZoneInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.STOP_POINT_TARIFF_INFORMATION_STRUCTURE__JOURNEY_STOP_INFORMATION:
				return basicSetJourneyStopInformation(null, msgs);
			case IbisCommonPackage.STOP_POINT_TARIFF_INFORMATION_STRUCTURE__FARE_ZONE_INFORMATION:
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
			case IbisCommonPackage.STOP_POINT_TARIFF_INFORMATION_STRUCTURE__JOURNEY_STOP_INFORMATION:
				return getJourneyStopInformation();
			case IbisCommonPackage.STOP_POINT_TARIFF_INFORMATION_STRUCTURE__FARE_ZONE_INFORMATION:
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
			case IbisCommonPackage.STOP_POINT_TARIFF_INFORMATION_STRUCTURE__JOURNEY_STOP_INFORMATION:
				setJourneyStopInformation((JourneyStopInformationStructure)newValue);
				return;
			case IbisCommonPackage.STOP_POINT_TARIFF_INFORMATION_STRUCTURE__FARE_ZONE_INFORMATION:
				setFareZoneInformation((FareZoneInformationStructure)newValue);
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
			case IbisCommonPackage.STOP_POINT_TARIFF_INFORMATION_STRUCTURE__JOURNEY_STOP_INFORMATION:
				setJourneyStopInformation((JourneyStopInformationStructure)null);
				return;
			case IbisCommonPackage.STOP_POINT_TARIFF_INFORMATION_STRUCTURE__FARE_ZONE_INFORMATION:
				setFareZoneInformation((FareZoneInformationStructure)null);
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
			case IbisCommonPackage.STOP_POINT_TARIFF_INFORMATION_STRUCTURE__JOURNEY_STOP_INFORMATION:
				return journeyStopInformation != null;
			case IbisCommonPackage.STOP_POINT_TARIFF_INFORMATION_STRUCTURE__FARE_ZONE_INFORMATION:
				return fareZoneInformation != null;
		}
		return super.eIsSet(featureID);
	}

} //StopPointTariffInformationStructureImpl
