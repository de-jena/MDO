/*
 */
package de.jena.mdo.ibis.ibis_customerinformationservice.impl;

import de.jena.mdo.ibis.ibis_common.IBISIPDateTime;
import de.jena.mdo.ibis.ibis_common.StopSequence;

import de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage;
import de.jena.mdo.ibis.ibis_customerinformationservice.PartialStopSequenceData;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partial Stop Sequence Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.PartialStopSequenceDataImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.PartialStopSequenceDataImpl#getStopSequence <em>Stop Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartialStopSequenceDataImpl extends MinimalEObjectImpl.Container implements PartialStopSequenceData {
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
	 * The cached value of the '{@link #getStopSequence() <em>Stop Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopSequence()
	 * @generated
	 * @ordered
	 */
	protected StopSequence stopSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartialStopSequenceDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCustomerInformationServicePackage.Literals.PARTIAL_STOP_SEQUENCE_DATA;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.PARTIAL_STOP_SEQUENCE_DATA__TIME_STAMP, oldTimeStamp, newTimeStamp);
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
				msgs = ((InternalEObject)timeStamp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.PARTIAL_STOP_SEQUENCE_DATA__TIME_STAMP, null, msgs);
			if (newTimeStamp != null)
				msgs = ((InternalEObject)newTimeStamp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.PARTIAL_STOP_SEQUENCE_DATA__TIME_STAMP, null, msgs);
			msgs = basicSetTimeStamp(newTimeStamp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.PARTIAL_STOP_SEQUENCE_DATA__TIME_STAMP, newTimeStamp, newTimeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StopSequence getStopSequence() {
		return stopSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStopSequence(StopSequence newStopSequence, NotificationChain msgs) {
		StopSequence oldStopSequence = stopSequence;
		stopSequence = newStopSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.PARTIAL_STOP_SEQUENCE_DATA__STOP_SEQUENCE, oldStopSequence, newStopSequence);
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
	public void setStopSequence(StopSequence newStopSequence) {
		if (newStopSequence != stopSequence) {
			NotificationChain msgs = null;
			if (stopSequence != null)
				msgs = ((InternalEObject)stopSequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.PARTIAL_STOP_SEQUENCE_DATA__STOP_SEQUENCE, null, msgs);
			if (newStopSequence != null)
				msgs = ((InternalEObject)newStopSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.PARTIAL_STOP_SEQUENCE_DATA__STOP_SEQUENCE, null, msgs);
			msgs = basicSetStopSequence(newStopSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.PARTIAL_STOP_SEQUENCE_DATA__STOP_SEQUENCE, newStopSequence, newStopSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCustomerInformationServicePackage.PARTIAL_STOP_SEQUENCE_DATA__TIME_STAMP:
				return basicSetTimeStamp(null, msgs);
			case IbisCustomerInformationServicePackage.PARTIAL_STOP_SEQUENCE_DATA__STOP_SEQUENCE:
				return basicSetStopSequence(null, msgs);
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
			case IbisCustomerInformationServicePackage.PARTIAL_STOP_SEQUENCE_DATA__TIME_STAMP:
				return getTimeStamp();
			case IbisCustomerInformationServicePackage.PARTIAL_STOP_SEQUENCE_DATA__STOP_SEQUENCE:
				return getStopSequence();
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
			case IbisCustomerInformationServicePackage.PARTIAL_STOP_SEQUENCE_DATA__TIME_STAMP:
				setTimeStamp((IBISIPDateTime)newValue);
				return;
			case IbisCustomerInformationServicePackage.PARTIAL_STOP_SEQUENCE_DATA__STOP_SEQUENCE:
				setStopSequence((StopSequence)newValue);
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
			case IbisCustomerInformationServicePackage.PARTIAL_STOP_SEQUENCE_DATA__TIME_STAMP:
				setTimeStamp((IBISIPDateTime)null);
				return;
			case IbisCustomerInformationServicePackage.PARTIAL_STOP_SEQUENCE_DATA__STOP_SEQUENCE:
				setStopSequence((StopSequence)null);
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
			case IbisCustomerInformationServicePackage.PARTIAL_STOP_SEQUENCE_DATA__TIME_STAMP:
				return timeStamp != null;
			case IbisCustomerInformationServicePackage.PARTIAL_STOP_SEQUENCE_DATA__STOP_SEQUENCE:
				return stopSequence != null;
		}
		return super.eIsSet(featureID);
	}

} //PartialStopSequenceDataImpl
