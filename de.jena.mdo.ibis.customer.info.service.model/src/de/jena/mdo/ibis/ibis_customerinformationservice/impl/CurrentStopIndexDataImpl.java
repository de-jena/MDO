/*
 */
package de.jena.mdo.ibis.ibis_customerinformationservice.impl;

import de.jena.mdo.ibis.ibis_common.IBISIPDateTime;
import de.jena.mdo.ibis.ibis_common.IBISIPInt;

import de.jena.mdo.ibis.ibis_customerinformationservice.CurrentStopIndexData;
import de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Current Stop Index Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.CurrentStopIndexDataImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.CurrentStopIndexDataImpl#getCurrentStopIndex <em>Current Stop Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CurrentStopIndexDataImpl extends MinimalEObjectImpl.Container implements CurrentStopIndexData {
	/**
	 * The cached value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected IBISIPDateTime timeStamp;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurrentStopIndexDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCustomerInformationServicePackage.Literals.CURRENT_STOP_INDEX_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPDateTime getTimeStamp() {
		return timeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeStamp(IBISIPDateTime newTimeStamp, NotificationChain msgs) {
		IBISIPDateTime oldTimeStamp = timeStamp;
		timeStamp = newTimeStamp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.CURRENT_STOP_INDEX_DATA__TIME_STAMP, oldTimeStamp, newTimeStamp);
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
	public void setTimeStamp(IBISIPDateTime newTimeStamp) {
		if (newTimeStamp != timeStamp) {
			NotificationChain msgs = null;
			if (timeStamp != null)
				msgs = ((InternalEObject)timeStamp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.CURRENT_STOP_INDEX_DATA__TIME_STAMP, null, msgs);
			if (newTimeStamp != null)
				msgs = ((InternalEObject)newTimeStamp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.CURRENT_STOP_INDEX_DATA__TIME_STAMP, null, msgs);
			msgs = basicSetTimeStamp(newTimeStamp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.CURRENT_STOP_INDEX_DATA__TIME_STAMP, newTimeStamp, newTimeStamp));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.CURRENT_STOP_INDEX_DATA__CURRENT_STOP_INDEX, oldCurrentStopIndex, newCurrentStopIndex);
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
				msgs = ((InternalEObject)currentStopIndex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.CURRENT_STOP_INDEX_DATA__CURRENT_STOP_INDEX, null, msgs);
			if (newCurrentStopIndex != null)
				msgs = ((InternalEObject)newCurrentStopIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.CURRENT_STOP_INDEX_DATA__CURRENT_STOP_INDEX, null, msgs);
			msgs = basicSetCurrentStopIndex(newCurrentStopIndex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.CURRENT_STOP_INDEX_DATA__CURRENT_STOP_INDEX, newCurrentStopIndex, newCurrentStopIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCustomerInformationServicePackage.CURRENT_STOP_INDEX_DATA__TIME_STAMP:
				return basicSetTimeStamp(null, msgs);
			case IbisCustomerInformationServicePackage.CURRENT_STOP_INDEX_DATA__CURRENT_STOP_INDEX:
				return basicSetCurrentStopIndex(null, msgs);
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
			case IbisCustomerInformationServicePackage.CURRENT_STOP_INDEX_DATA__TIME_STAMP:
				return getTimeStamp();
			case IbisCustomerInformationServicePackage.CURRENT_STOP_INDEX_DATA__CURRENT_STOP_INDEX:
				return getCurrentStopIndex();
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
			case IbisCustomerInformationServicePackage.CURRENT_STOP_INDEX_DATA__TIME_STAMP:
				setTimeStamp((IBISIPDateTime)newValue);
				return;
			case IbisCustomerInformationServicePackage.CURRENT_STOP_INDEX_DATA__CURRENT_STOP_INDEX:
				setCurrentStopIndex((IBISIPInt)newValue);
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
			case IbisCustomerInformationServicePackage.CURRENT_STOP_INDEX_DATA__TIME_STAMP:
				setTimeStamp((IBISIPDateTime)null);
				return;
			case IbisCustomerInformationServicePackage.CURRENT_STOP_INDEX_DATA__CURRENT_STOP_INDEX:
				setCurrentStopIndex((IBISIPInt)null);
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
			case IbisCustomerInformationServicePackage.CURRENT_STOP_INDEX_DATA__TIME_STAMP:
				return timeStamp != null;
			case IbisCustomerInformationServicePackage.CURRENT_STOP_INDEX_DATA__CURRENT_STOP_INDEX:
				return currentStopIndex != null;
		}
		return super.eIsSet(featureID);
	}

} //CurrentStopIndexDataImpl
