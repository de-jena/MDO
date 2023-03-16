/*
 */
package de.jena.mdo.ibis.ibis_customerinformationservice.impl;

import de.jena.mdo.ibis.ibis_common.impl.GeneralResponseImpl;

import de.jena.mdo.ibis.ibis_customerinformationservice.CurrentStopPointData;
import de.jena.mdo.ibis.ibis_customerinformationservice.CurrentStopPointResponse;
import de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Current Stop Point Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.CurrentStopPointResponseImpl#getCurrentStopPointData <em>Current Stop Point Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CurrentStopPointResponseImpl extends GeneralResponseImpl implements CurrentStopPointResponse {
	/**
	 * The cached value of the '{@link #getCurrentStopPointData() <em>Current Stop Point Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentStopPointData()
	 * @generated
	 * @ordered
	 */
	protected CurrentStopPointData currentStopPointData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurrentStopPointResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCustomerInformationServicePackage.Literals.CURRENT_STOP_POINT_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurrentStopPointData getCurrentStopPointData() {
		return currentStopPointData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentStopPointData(CurrentStopPointData newCurrentStopPointData, NotificationChain msgs) {
		CurrentStopPointData oldCurrentStopPointData = currentStopPointData;
		currentStopPointData = newCurrentStopPointData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.CURRENT_STOP_POINT_RESPONSE__CURRENT_STOP_POINT_DATA, oldCurrentStopPointData, newCurrentStopPointData);
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
	public void setCurrentStopPointData(CurrentStopPointData newCurrentStopPointData) {
		if (newCurrentStopPointData != currentStopPointData) {
			NotificationChain msgs = null;
			if (currentStopPointData != null)
				msgs = ((InternalEObject)currentStopPointData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.CURRENT_STOP_POINT_RESPONSE__CURRENT_STOP_POINT_DATA, null, msgs);
			if (newCurrentStopPointData != null)
				msgs = ((InternalEObject)newCurrentStopPointData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.CURRENT_STOP_POINT_RESPONSE__CURRENT_STOP_POINT_DATA, null, msgs);
			msgs = basicSetCurrentStopPointData(newCurrentStopPointData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.CURRENT_STOP_POINT_RESPONSE__CURRENT_STOP_POINT_DATA, newCurrentStopPointData, newCurrentStopPointData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCustomerInformationServicePackage.CURRENT_STOP_POINT_RESPONSE__CURRENT_STOP_POINT_DATA:
				return basicSetCurrentStopPointData(null, msgs);
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
			case IbisCustomerInformationServicePackage.CURRENT_STOP_POINT_RESPONSE__CURRENT_STOP_POINT_DATA:
				return getCurrentStopPointData();
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
			case IbisCustomerInformationServicePackage.CURRENT_STOP_POINT_RESPONSE__CURRENT_STOP_POINT_DATA:
				setCurrentStopPointData((CurrentStopPointData)newValue);
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
			case IbisCustomerInformationServicePackage.CURRENT_STOP_POINT_RESPONSE__CURRENT_STOP_POINT_DATA:
				setCurrentStopPointData((CurrentStopPointData)null);
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
			case IbisCustomerInformationServicePackage.CURRENT_STOP_POINT_RESPONSE__CURRENT_STOP_POINT_DATA:
				return currentStopPointData != null;
		}
		return super.eIsSet(featureID);
	}

} //CurrentStopPointResponseImpl
