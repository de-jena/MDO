/*
 */
package de.jena.mdo.ibis.customerinformationservice.impl;

import de.jena.mdo.ibis.common.impl.GeneralResponseStructureImpl;

import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetVehicleDataResponseStructure;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceVehicleData;
import de.jena.mdo.ibis.customerinformationservice.IbisCustomerInformationServicePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer Information Service Get Vehicle Data Response Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceGetVehicleDataResponseStructureImpl#getVehicleData <em>Vehicle Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerInformationServiceGetVehicleDataResponseStructureImpl extends GeneralResponseStructureImpl implements CustomerInformationServiceGetVehicleDataResponseStructure {
	/**
	 * The cached value of the '{@link #getVehicleData() <em>Vehicle Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleData()
	 * @generated
	 * @ordered
	 */
	protected CustomerInformationServiceVehicleData vehicleData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerInformationServiceGetVehicleDataResponseStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCustomerInformationServicePackage.Literals.CUSTOMER_INFORMATION_SERVICE_GET_VEHICLE_DATA_RESPONSE_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInformationServiceVehicleData getVehicleData() {
		return vehicleData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVehicleData(CustomerInformationServiceVehicleData newVehicleData, NotificationChain msgs) {
		CustomerInformationServiceVehicleData oldVehicleData = vehicleData;
		vehicleData = newVehicleData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_VEHICLE_DATA_RESPONSE_STRUCTURE__VEHICLE_DATA, oldVehicleData, newVehicleData);
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
	public void setVehicleData(CustomerInformationServiceVehicleData newVehicleData) {
		if (newVehicleData != vehicleData) {
			NotificationChain msgs = null;
			if (vehicleData != null)
				msgs = ((InternalEObject)vehicleData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_VEHICLE_DATA_RESPONSE_STRUCTURE__VEHICLE_DATA, null, msgs);
			if (newVehicleData != null)
				msgs = ((InternalEObject)newVehicleData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_VEHICLE_DATA_RESPONSE_STRUCTURE__VEHICLE_DATA, null, msgs);
			msgs = basicSetVehicleData(newVehicleData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_VEHICLE_DATA_RESPONSE_STRUCTURE__VEHICLE_DATA, newVehicleData, newVehicleData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_VEHICLE_DATA_RESPONSE_STRUCTURE__VEHICLE_DATA:
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
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_VEHICLE_DATA_RESPONSE_STRUCTURE__VEHICLE_DATA:
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
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_VEHICLE_DATA_RESPONSE_STRUCTURE__VEHICLE_DATA:
				setVehicleData((CustomerInformationServiceVehicleData)newValue);
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
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_VEHICLE_DATA_RESPONSE_STRUCTURE__VEHICLE_DATA:
				setVehicleData((CustomerInformationServiceVehicleData)null);
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
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_VEHICLE_DATA_RESPONSE_STRUCTURE__VEHICLE_DATA:
				return vehicleData != null;
		}
		return super.eIsSet(featureID);
	}

} //CustomerInformationServiceGetVehicleDataResponseStructureImpl
