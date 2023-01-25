/*
 */
package de.jena.mdo.ibis.devicemanagementservice.impl;

import de.jena.mdo.ibis.common.impl.GeneralResponseStructureImpl;

import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceErrorMessagesResponseStructure;
import de.jena.mdo.ibis.devicemanagementservice.IbisDeviceManagementServicePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Management Service Get Device Error Messages Response Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetDeviceErrorMessagesResponseStructureImpl#getDeviceManagementServiceGetDeviceErrorMessagesResponseData <em>Device Management Service Get Device Error Messages Response Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceManagementServiceGetDeviceErrorMessagesResponseStructureImpl extends GeneralResponseStructureImpl implements DeviceManagementServiceGetDeviceErrorMessagesResponseStructure {
	/**
	 * The cached value of the '{@link #getDeviceManagementServiceGetDeviceErrorMessagesResponseData() <em>Device Management Service Get Device Error Messages Response Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceManagementServiceGetDeviceErrorMessagesResponseData()
	 * @generated
	 * @ordered
	 */
	protected DeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure deviceManagementServiceGetDeviceErrorMessagesResponseData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceManagementServiceGetDeviceErrorMessagesResponseStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisDeviceManagementServicePackage.Literals.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure getDeviceManagementServiceGetDeviceErrorMessagesResponseData() {
		return deviceManagementServiceGetDeviceErrorMessagesResponseData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceManagementServiceGetDeviceErrorMessagesResponseData(DeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure newDeviceManagementServiceGetDeviceErrorMessagesResponseData, NotificationChain msgs) {
		DeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure oldDeviceManagementServiceGetDeviceErrorMessagesResponseData = deviceManagementServiceGetDeviceErrorMessagesResponseData;
		deviceManagementServiceGetDeviceErrorMessagesResponseData = newDeviceManagementServiceGetDeviceErrorMessagesResponseData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_DATA, oldDeviceManagementServiceGetDeviceErrorMessagesResponseData, newDeviceManagementServiceGetDeviceErrorMessagesResponseData);
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
	public void setDeviceManagementServiceGetDeviceErrorMessagesResponseData(DeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure newDeviceManagementServiceGetDeviceErrorMessagesResponseData) {
		if (newDeviceManagementServiceGetDeviceErrorMessagesResponseData != deviceManagementServiceGetDeviceErrorMessagesResponseData) {
			NotificationChain msgs = null;
			if (deviceManagementServiceGetDeviceErrorMessagesResponseData != null)
				msgs = ((InternalEObject)deviceManagementServiceGetDeviceErrorMessagesResponseData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_DATA, null, msgs);
			if (newDeviceManagementServiceGetDeviceErrorMessagesResponseData != null)
				msgs = ((InternalEObject)newDeviceManagementServiceGetDeviceErrorMessagesResponseData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_DATA, null, msgs);
			msgs = basicSetDeviceManagementServiceGetDeviceErrorMessagesResponseData(newDeviceManagementServiceGetDeviceErrorMessagesResponseData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_DATA, newDeviceManagementServiceGetDeviceErrorMessagesResponseData, newDeviceManagementServiceGetDeviceErrorMessagesResponseData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_DATA:
				return basicSetDeviceManagementServiceGetDeviceErrorMessagesResponseData(null, msgs);
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
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_DATA:
				return getDeviceManagementServiceGetDeviceErrorMessagesResponseData();
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
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_DATA:
				setDeviceManagementServiceGetDeviceErrorMessagesResponseData((DeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure)newValue);
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
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_DATA:
				setDeviceManagementServiceGetDeviceErrorMessagesResponseData((DeviceManagementServiceGetDeviceErrorMessagesResponseDataStructure)null);
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
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_ERROR_MESSAGES_RESPONSE_DATA:
				return deviceManagementServiceGetDeviceErrorMessagesResponseData != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceManagementServiceGetDeviceErrorMessagesResponseStructureImpl
