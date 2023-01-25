/*
 */
package de.jena.mdo.ibis.customerinformationservice.impl;

import de.jena.mdo.ibis.common.impl.GeneralResponseStructureImpl;

import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetTripDataResponseStructure;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceTripData;
import de.jena.mdo.ibis.customerinformationservice.IbisCustomerInformationServicePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer Information Service Get Trip Data Response Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceGetTripDataResponseStructureImpl#getTripData <em>Trip Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerInformationServiceGetTripDataResponseStructureImpl extends GeneralResponseStructureImpl implements CustomerInformationServiceGetTripDataResponseStructure {
	/**
	 * The cached value of the '{@link #getTripData() <em>Trip Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTripData()
	 * @generated
	 * @ordered
	 */
	protected CustomerInformationServiceTripData tripData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerInformationServiceGetTripDataResponseStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCustomerInformationServicePackage.Literals.CUSTOMER_INFORMATION_SERVICE_GET_TRIP_DATA_RESPONSE_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInformationServiceTripData getTripData() {
		return tripData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTripData(CustomerInformationServiceTripData newTripData, NotificationChain msgs) {
		CustomerInformationServiceTripData oldTripData = tripData;
		tripData = newTripData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_TRIP_DATA_RESPONSE_STRUCTURE__TRIP_DATA, oldTripData, newTripData);
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
	public void setTripData(CustomerInformationServiceTripData newTripData) {
		if (newTripData != tripData) {
			NotificationChain msgs = null;
			if (tripData != null)
				msgs = ((InternalEObject)tripData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_TRIP_DATA_RESPONSE_STRUCTURE__TRIP_DATA, null, msgs);
			if (newTripData != null)
				msgs = ((InternalEObject)newTripData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_TRIP_DATA_RESPONSE_STRUCTURE__TRIP_DATA, null, msgs);
			msgs = basicSetTripData(newTripData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_TRIP_DATA_RESPONSE_STRUCTURE__TRIP_DATA, newTripData, newTripData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_TRIP_DATA_RESPONSE_STRUCTURE__TRIP_DATA:
				return basicSetTripData(null, msgs);
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
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_TRIP_DATA_RESPONSE_STRUCTURE__TRIP_DATA:
				return getTripData();
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
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_TRIP_DATA_RESPONSE_STRUCTURE__TRIP_DATA:
				setTripData((CustomerInformationServiceTripData)newValue);
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
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_TRIP_DATA_RESPONSE_STRUCTURE__TRIP_DATA:
				setTripData((CustomerInformationServiceTripData)null);
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
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_TRIP_DATA_RESPONSE_STRUCTURE__TRIP_DATA:
				return tripData != null;
		}
		return super.eIsSet(featureID);
	}

} //CustomerInformationServiceGetTripDataResponseStructureImpl
