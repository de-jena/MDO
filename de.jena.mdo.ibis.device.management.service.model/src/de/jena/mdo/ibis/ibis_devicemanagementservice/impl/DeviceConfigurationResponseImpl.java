/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice.impl;

import de.jena.mdo.ibis.ibis_common.impl.GeneralResponseImpl;

import de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceConfigurationData;
import de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceConfigurationResponse;
import de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Configuration Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceConfigurationResponseImpl#getDeviceConfigurationData <em>Device Configuration Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceConfigurationResponseImpl extends GeneralResponseImpl implements DeviceConfigurationResponse {
	/**
	 * The cached value of the '{@link #getDeviceConfigurationData() <em>Device Configuration Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceConfigurationData()
	 * @generated
	 * @ordered
	 */
	protected DeviceConfigurationData deviceConfigurationData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceConfigurationResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisDeviceManagementServicePackage.Literals.DEVICE_CONFIGURATION_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceConfigurationData getDeviceConfigurationData() {
		return deviceConfigurationData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceConfigurationData(DeviceConfigurationData newDeviceConfigurationData, NotificationChain msgs) {
		DeviceConfigurationData oldDeviceConfigurationData = deviceConfigurationData;
		deviceConfigurationData = newDeviceConfigurationData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.DEVICE_CONFIGURATION_RESPONSE__DEVICE_CONFIGURATION_DATA, oldDeviceConfigurationData, newDeviceConfigurationData);
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
	public void setDeviceConfigurationData(DeviceConfigurationData newDeviceConfigurationData) {
		if (newDeviceConfigurationData != deviceConfigurationData) {
			NotificationChain msgs = null;
			if (deviceConfigurationData != null)
				msgs = ((InternalEObject)deviceConfigurationData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.DEVICE_CONFIGURATION_RESPONSE__DEVICE_CONFIGURATION_DATA, null, msgs);
			if (newDeviceConfigurationData != null)
				msgs = ((InternalEObject)newDeviceConfigurationData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.DEVICE_CONFIGURATION_RESPONSE__DEVICE_CONFIGURATION_DATA, null, msgs);
			msgs = basicSetDeviceConfigurationData(newDeviceConfigurationData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.DEVICE_CONFIGURATION_RESPONSE__DEVICE_CONFIGURATION_DATA, newDeviceConfigurationData, newDeviceConfigurationData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisDeviceManagementServicePackage.DEVICE_CONFIGURATION_RESPONSE__DEVICE_CONFIGURATION_DATA:
				return basicSetDeviceConfigurationData(null, msgs);
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
			case IbisDeviceManagementServicePackage.DEVICE_CONFIGURATION_RESPONSE__DEVICE_CONFIGURATION_DATA:
				return getDeviceConfigurationData();
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
			case IbisDeviceManagementServicePackage.DEVICE_CONFIGURATION_RESPONSE__DEVICE_CONFIGURATION_DATA:
				setDeviceConfigurationData((DeviceConfigurationData)newValue);
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
			case IbisDeviceManagementServicePackage.DEVICE_CONFIGURATION_RESPONSE__DEVICE_CONFIGURATION_DATA:
				setDeviceConfigurationData((DeviceConfigurationData)null);
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
			case IbisDeviceManagementServicePackage.DEVICE_CONFIGURATION_RESPONSE__DEVICE_CONFIGURATION_DATA:
				return deviceConfigurationData != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceConfigurationResponseImpl
