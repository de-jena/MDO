/*
 */
package de.jena.mdo.ibis.ibis_customerinformationservice.impl;

import de.jena.mdo.ibis.ibis_common.impl.GeneralResponseImpl;

import de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage;
import de.jena.mdo.ibis.ibis_customerinformationservice.VehicleData;
import de.jena.mdo.ibis.ibis_customerinformationservice.VehicleDataResponse;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehicle Data Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.VehicleDataResponseImpl#getVehicleData <em>Vehicle Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VehicleDataResponseImpl extends GeneralResponseImpl implements VehicleDataResponse {
	/**
	 * The cached value of the '{@link #getVehicleData() <em>Vehicle Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleData()
	 * @generated
	 * @ordered
	 */
	protected VehicleData vehicleData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VehicleDataResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCustomerInformationServicePackage.Literals.VEHICLE_DATA_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VehicleData getVehicleData() {
		return vehicleData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVehicleData(VehicleData newVehicleData, NotificationChain msgs) {
		VehicleData oldVehicleData = vehicleData;
		vehicleData = newVehicleData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.VEHICLE_DATA_RESPONSE__VEHICLE_DATA, oldVehicleData, newVehicleData);
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
	public void setVehicleData(VehicleData newVehicleData) {
		if (newVehicleData != vehicleData) {
			NotificationChain msgs = null;
			if (vehicleData != null)
				msgs = ((InternalEObject)vehicleData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.VEHICLE_DATA_RESPONSE__VEHICLE_DATA, null, msgs);
			if (newVehicleData != null)
				msgs = ((InternalEObject)newVehicleData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.VEHICLE_DATA_RESPONSE__VEHICLE_DATA, null, msgs);
			msgs = basicSetVehicleData(newVehicleData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.VEHICLE_DATA_RESPONSE__VEHICLE_DATA, newVehicleData, newVehicleData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCustomerInformationServicePackage.VEHICLE_DATA_RESPONSE__VEHICLE_DATA:
				return basicSetVehicleData(null, msgs);
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
			case IbisCustomerInformationServicePackage.VEHICLE_DATA_RESPONSE__VEHICLE_DATA:
				return getVehicleData();
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
			case IbisCustomerInformationServicePackage.VEHICLE_DATA_RESPONSE__VEHICLE_DATA:
				setVehicleData((VehicleData)newValue);
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
			case IbisCustomerInformationServicePackage.VEHICLE_DATA_RESPONSE__VEHICLE_DATA:
				setVehicleData((VehicleData)null);
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
			case IbisCustomerInformationServicePackage.VEHICLE_DATA_RESPONSE__VEHICLE_DATA:
				return vehicleData != null;
		}
		return super.eIsSet(featureID);
	}

} //VehicleDataResponseImpl
