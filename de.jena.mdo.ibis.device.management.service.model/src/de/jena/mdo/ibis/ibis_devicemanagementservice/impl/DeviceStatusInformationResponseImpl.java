/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice.impl;

import de.jena.mdo.ibis.ibis_common.impl.GeneralResponseImpl;

import de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusInformationData;
import de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusInformationResponse;
import de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Status Information Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceStatusInformationResponseImpl#getDeviceStatusInformationData <em>Device Status Information Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceStatusInformationResponseImpl extends GeneralResponseImpl implements DeviceStatusInformationResponse {
	/**
	 * The cached value of the '{@link #getDeviceStatusInformationData() <em>Device Status Information Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceStatusInformationData()
	 * @generated
	 * @ordered
	 */
	protected DeviceStatusInformationData deviceStatusInformationData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceStatusInformationResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisDeviceManagementServicePackage.Literals.DEVICE_STATUS_INFORMATION_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceStatusInformationData getDeviceStatusInformationData() {
		return deviceStatusInformationData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceStatusInformationData(DeviceStatusInformationData newDeviceStatusInformationData, NotificationChain msgs) {
		DeviceStatusInformationData oldDeviceStatusInformationData = deviceStatusInformationData;
		deviceStatusInformationData = newDeviceStatusInformationData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION_RESPONSE__DEVICE_STATUS_INFORMATION_DATA, oldDeviceStatusInformationData, newDeviceStatusInformationData);
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
	public void setDeviceStatusInformationData(DeviceStatusInformationData newDeviceStatusInformationData) {
		if (newDeviceStatusInformationData != deviceStatusInformationData) {
			NotificationChain msgs = null;
			if (deviceStatusInformationData != null)
				msgs = ((InternalEObject)deviceStatusInformationData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION_RESPONSE__DEVICE_STATUS_INFORMATION_DATA, null, msgs);
			if (newDeviceStatusInformationData != null)
				msgs = ((InternalEObject)newDeviceStatusInformationData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION_RESPONSE__DEVICE_STATUS_INFORMATION_DATA, null, msgs);
			msgs = basicSetDeviceStatusInformationData(newDeviceStatusInformationData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION_RESPONSE__DEVICE_STATUS_INFORMATION_DATA, newDeviceStatusInformationData, newDeviceStatusInformationData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION_RESPONSE__DEVICE_STATUS_INFORMATION_DATA:
				return basicSetDeviceStatusInformationData(null, msgs);
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
			case IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION_RESPONSE__DEVICE_STATUS_INFORMATION_DATA:
				return getDeviceStatusInformationData();
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
			case IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION_RESPONSE__DEVICE_STATUS_INFORMATION_DATA:
				setDeviceStatusInformationData((DeviceStatusInformationData)newValue);
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
			case IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION_RESPONSE__DEVICE_STATUS_INFORMATION_DATA:
				setDeviceStatusInformationData((DeviceStatusInformationData)null);
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
			case IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION_RESPONSE__DEVICE_STATUS_INFORMATION_DATA:
				return deviceStatusInformationData != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceStatusInformationResponseImpl
