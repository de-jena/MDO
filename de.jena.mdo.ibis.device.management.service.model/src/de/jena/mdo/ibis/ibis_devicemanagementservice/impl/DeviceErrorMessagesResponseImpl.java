/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice.impl;

import de.jena.mdo.ibis.ibis_common.impl.GeneralResponseImpl;

import de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceErrorMessagesData;
import de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceErrorMessagesResponse;
import de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Error Messages Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceErrorMessagesResponseImpl#getDeviceErrorMessagesData <em>Device Error Messages Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceErrorMessagesResponseImpl extends GeneralResponseImpl implements DeviceErrorMessagesResponse {
	/**
	 * The cached value of the '{@link #getDeviceErrorMessagesData() <em>Device Error Messages Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceErrorMessagesData()
	 * @generated
	 * @ordered
	 */
	protected DeviceErrorMessagesData deviceErrorMessagesData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceErrorMessagesResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisDeviceManagementServicePackage.Literals.DEVICE_ERROR_MESSAGES_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceErrorMessagesData getDeviceErrorMessagesData() {
		return deviceErrorMessagesData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceErrorMessagesData(DeviceErrorMessagesData newDeviceErrorMessagesData, NotificationChain msgs) {
		DeviceErrorMessagesData oldDeviceErrorMessagesData = deviceErrorMessagesData;
		deviceErrorMessagesData = newDeviceErrorMessagesData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.DEVICE_ERROR_MESSAGES_RESPONSE__DEVICE_ERROR_MESSAGES_DATA, oldDeviceErrorMessagesData, newDeviceErrorMessagesData);
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
	public void setDeviceErrorMessagesData(DeviceErrorMessagesData newDeviceErrorMessagesData) {
		if (newDeviceErrorMessagesData != deviceErrorMessagesData) {
			NotificationChain msgs = null;
			if (deviceErrorMessagesData != null)
				msgs = ((InternalEObject)deviceErrorMessagesData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.DEVICE_ERROR_MESSAGES_RESPONSE__DEVICE_ERROR_MESSAGES_DATA, null, msgs);
			if (newDeviceErrorMessagesData != null)
				msgs = ((InternalEObject)newDeviceErrorMessagesData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.DEVICE_ERROR_MESSAGES_RESPONSE__DEVICE_ERROR_MESSAGES_DATA, null, msgs);
			msgs = basicSetDeviceErrorMessagesData(newDeviceErrorMessagesData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.DEVICE_ERROR_MESSAGES_RESPONSE__DEVICE_ERROR_MESSAGES_DATA, newDeviceErrorMessagesData, newDeviceErrorMessagesData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisDeviceManagementServicePackage.DEVICE_ERROR_MESSAGES_RESPONSE__DEVICE_ERROR_MESSAGES_DATA:
				return basicSetDeviceErrorMessagesData(null, msgs);
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
			case IbisDeviceManagementServicePackage.DEVICE_ERROR_MESSAGES_RESPONSE__DEVICE_ERROR_MESSAGES_DATA:
				return getDeviceErrorMessagesData();
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
			case IbisDeviceManagementServicePackage.DEVICE_ERROR_MESSAGES_RESPONSE__DEVICE_ERROR_MESSAGES_DATA:
				setDeviceErrorMessagesData((DeviceErrorMessagesData)newValue);
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
			case IbisDeviceManagementServicePackage.DEVICE_ERROR_MESSAGES_RESPONSE__DEVICE_ERROR_MESSAGES_DATA:
				setDeviceErrorMessagesData((DeviceErrorMessagesData)null);
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
			case IbisDeviceManagementServicePackage.DEVICE_ERROR_MESSAGES_RESPONSE__DEVICE_ERROR_MESSAGES_DATA:
				return deviceErrorMessagesData != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceErrorMessagesResponseImpl
