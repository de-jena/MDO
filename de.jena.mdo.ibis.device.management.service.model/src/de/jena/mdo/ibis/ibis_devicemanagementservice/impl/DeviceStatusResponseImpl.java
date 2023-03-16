/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice.impl;

import de.jena.mdo.ibis.ibis_common.impl.GeneralResponseImpl;

import de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusData;
import de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusResponse;
import de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Status Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceStatusResponseImpl#getDeviceStatusData <em>Device Status Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceStatusResponseImpl extends GeneralResponseImpl implements DeviceStatusResponse {
	/**
	 * The cached value of the '{@link #getDeviceStatusData() <em>Device Status Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceStatusData()
	 * @generated
	 * @ordered
	 */
	protected DeviceStatusData deviceStatusData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceStatusResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisDeviceManagementServicePackage.Literals.DEVICE_STATUS_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceStatusData getDeviceStatusData() {
		return deviceStatusData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceStatusData(DeviceStatusData newDeviceStatusData, NotificationChain msgs) {
		DeviceStatusData oldDeviceStatusData = deviceStatusData;
		deviceStatusData = newDeviceStatusData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.DEVICE_STATUS_RESPONSE__DEVICE_STATUS_DATA, oldDeviceStatusData, newDeviceStatusData);
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
	public void setDeviceStatusData(DeviceStatusData newDeviceStatusData) {
		if (newDeviceStatusData != deviceStatusData) {
			NotificationChain msgs = null;
			if (deviceStatusData != null)
				msgs = ((InternalEObject)deviceStatusData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.DEVICE_STATUS_RESPONSE__DEVICE_STATUS_DATA, null, msgs);
			if (newDeviceStatusData != null)
				msgs = ((InternalEObject)newDeviceStatusData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.DEVICE_STATUS_RESPONSE__DEVICE_STATUS_DATA, null, msgs);
			msgs = basicSetDeviceStatusData(newDeviceStatusData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.DEVICE_STATUS_RESPONSE__DEVICE_STATUS_DATA, newDeviceStatusData, newDeviceStatusData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisDeviceManagementServicePackage.DEVICE_STATUS_RESPONSE__DEVICE_STATUS_DATA:
				return basicSetDeviceStatusData(null, msgs);
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
			case IbisDeviceManagementServicePackage.DEVICE_STATUS_RESPONSE__DEVICE_STATUS_DATA:
				return getDeviceStatusData();
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
			case IbisDeviceManagementServicePackage.DEVICE_STATUS_RESPONSE__DEVICE_STATUS_DATA:
				setDeviceStatusData((DeviceStatusData)newValue);
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
			case IbisDeviceManagementServicePackage.DEVICE_STATUS_RESPONSE__DEVICE_STATUS_DATA:
				setDeviceStatusData((DeviceStatusData)null);
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
			case IbisDeviceManagementServicePackage.DEVICE_STATUS_RESPONSE__DEVICE_STATUS_DATA:
				return deviceStatusData != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceStatusResponseImpl
