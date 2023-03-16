/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice.impl;

import de.jena.mdo.ibis.ibis_common.impl.GeneralResponseImpl;

import de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceInformationData;
import de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceInformationResponse;
import de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Information Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceInformationResponseImpl#getDeviceInformationData <em>Device Information Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceInformationResponseImpl extends GeneralResponseImpl implements DeviceInformationResponse {
	/**
	 * The cached value of the '{@link #getDeviceInformationData() <em>Device Information Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceInformationData()
	 * @generated
	 * @ordered
	 */
	protected DeviceInformationData deviceInformationData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceInformationResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisDeviceManagementServicePackage.Literals.DEVICE_INFORMATION_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceInformationData getDeviceInformationData() {
		return deviceInformationData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceInformationData(DeviceInformationData newDeviceInformationData, NotificationChain msgs) {
		DeviceInformationData oldDeviceInformationData = deviceInformationData;
		deviceInformationData = newDeviceInformationData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.DEVICE_INFORMATION_RESPONSE__DEVICE_INFORMATION_DATA, oldDeviceInformationData, newDeviceInformationData);
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
	public void setDeviceInformationData(DeviceInformationData newDeviceInformationData) {
		if (newDeviceInformationData != deviceInformationData) {
			NotificationChain msgs = null;
			if (deviceInformationData != null)
				msgs = ((InternalEObject)deviceInformationData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.DEVICE_INFORMATION_RESPONSE__DEVICE_INFORMATION_DATA, null, msgs);
			if (newDeviceInformationData != null)
				msgs = ((InternalEObject)newDeviceInformationData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.DEVICE_INFORMATION_RESPONSE__DEVICE_INFORMATION_DATA, null, msgs);
			msgs = basicSetDeviceInformationData(newDeviceInformationData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.DEVICE_INFORMATION_RESPONSE__DEVICE_INFORMATION_DATA, newDeviceInformationData, newDeviceInformationData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisDeviceManagementServicePackage.DEVICE_INFORMATION_RESPONSE__DEVICE_INFORMATION_DATA:
				return basicSetDeviceInformationData(null, msgs);
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
			case IbisDeviceManagementServicePackage.DEVICE_INFORMATION_RESPONSE__DEVICE_INFORMATION_DATA:
				return getDeviceInformationData();
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
			case IbisDeviceManagementServicePackage.DEVICE_INFORMATION_RESPONSE__DEVICE_INFORMATION_DATA:
				setDeviceInformationData((DeviceInformationData)newValue);
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
			case IbisDeviceManagementServicePackage.DEVICE_INFORMATION_RESPONSE__DEVICE_INFORMATION_DATA:
				setDeviceInformationData((DeviceInformationData)null);
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
			case IbisDeviceManagementServicePackage.DEVICE_INFORMATION_RESPONSE__DEVICE_INFORMATION_DATA:
				return deviceInformationData != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceInformationResponseImpl
