/**
 */
package org.purl.dc.terms.terms.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.purl.dc.terms.terms.PeriodOfTime;
import org.purl.dc.terms.terms.PeriodOfTimeType;
import org.purl.dc.terms.terms.TermsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Period Of Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.purl.dc.terms.terms.impl.PeriodOfTimeImpl#getPeriodOfTime <em>Period Of Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PeriodOfTimeImpl extends MinimalEObjectImpl.Container implements PeriodOfTime {
	/**
	 * The cached value of the '{@link #getPeriodOfTime() <em>Period Of Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodOfTime()
	 * @generated
	 * @ordered
	 */
	protected PeriodOfTimeType periodOfTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PeriodOfTimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TermsPackage.Literals.PERIOD_OF_TIME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PeriodOfTimeType getPeriodOfTime() {
		return periodOfTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriodOfTime(PeriodOfTimeType newPeriodOfTime, NotificationChain msgs) {
		PeriodOfTimeType oldPeriodOfTime = periodOfTime;
		periodOfTime = newPeriodOfTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TermsPackage.PERIOD_OF_TIME__PERIOD_OF_TIME, oldPeriodOfTime, newPeriodOfTime);
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
	public void setPeriodOfTime(PeriodOfTimeType newPeriodOfTime) {
		if (newPeriodOfTime != periodOfTime) {
			NotificationChain msgs = null;
			if (periodOfTime != null)
				msgs = ((InternalEObject)periodOfTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TermsPackage.PERIOD_OF_TIME__PERIOD_OF_TIME, null, msgs);
			if (newPeriodOfTime != null)
				msgs = ((InternalEObject)newPeriodOfTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TermsPackage.PERIOD_OF_TIME__PERIOD_OF_TIME, null, msgs);
			msgs = basicSetPeriodOfTime(newPeriodOfTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.PERIOD_OF_TIME__PERIOD_OF_TIME, newPeriodOfTime, newPeriodOfTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TermsPackage.PERIOD_OF_TIME__PERIOD_OF_TIME:
				return basicSetPeriodOfTime(null, msgs);
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
			case TermsPackage.PERIOD_OF_TIME__PERIOD_OF_TIME:
				return getPeriodOfTime();
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
			case TermsPackage.PERIOD_OF_TIME__PERIOD_OF_TIME:
				setPeriodOfTime((PeriodOfTimeType)newValue);
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
			case TermsPackage.PERIOD_OF_TIME__PERIOD_OF_TIME:
				setPeriodOfTime((PeriodOfTimeType)null);
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
			case TermsPackage.PERIOD_OF_TIME__PERIOD_OF_TIME:
				return periodOfTime != null;
		}
		return super.eIsSet(featureID);
	}

} //PeriodOfTimeImpl
