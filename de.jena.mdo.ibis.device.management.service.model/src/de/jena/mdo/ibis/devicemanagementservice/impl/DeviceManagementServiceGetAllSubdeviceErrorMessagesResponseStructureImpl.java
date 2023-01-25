/*
 */
package de.jena.mdo.ibis.devicemanagementservice.impl;

import de.jena.mdo.ibis.common.impl.GeneralResponseStructureImpl;

import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure;
import de.jena.mdo.ibis.devicemanagementservice.IbisDeviceManagementServicePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Management Service Get All Subdevice Error Messages Response Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructureImpl#getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseData <em>Device Management Service Get All Subdevice Error Messages Response Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructureImpl extends GeneralResponseStructureImpl implements DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructure {
	/**
	 * The cached value of the '{@link #getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseData() <em>Device Management Service Get All Subdevice Error Messages Response Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseData()
	 * @generated
	 * @ordered
	 */
	protected DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure deviceManagementServiceGetAllSubdeviceErrorMessagesResponseData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisDeviceManagementServicePackage.Literals.DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseData() {
		return deviceManagementServiceGetAllSubdeviceErrorMessagesResponseData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseData(DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure newDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseData, NotificationChain msgs) {
		DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure oldDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseData = deviceManagementServiceGetAllSubdeviceErrorMessagesResponseData;
		deviceManagementServiceGetAllSubdeviceErrorMessagesResponseData = newDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_DATA, oldDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseData, newDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseData);
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
	public void setDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseData(DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure newDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseData) {
		if (newDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseData != deviceManagementServiceGetAllSubdeviceErrorMessagesResponseData) {
			NotificationChain msgs = null;
			if (deviceManagementServiceGetAllSubdeviceErrorMessagesResponseData != null)
				msgs = ((InternalEObject)deviceManagementServiceGetAllSubdeviceErrorMessagesResponseData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_DATA, null, msgs);
			if (newDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseData != null)
				msgs = ((InternalEObject)newDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_DATA, null, msgs);
			msgs = basicSetDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseData(newDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_DATA, newDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseData, newDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_DATA:
				return basicSetDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseData(null, msgs);
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
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_DATA:
				return getDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseData();
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
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_DATA:
				setDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseData((DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure)newValue);
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
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_DATA:
				setDeviceManagementServiceGetAllSubdeviceErrorMessagesResponseData((DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseDataStructure)null);
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
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE_DATA:
				return deviceManagementServiceGetAllSubdeviceErrorMessagesResponseData != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceManagementServiceGetAllSubdeviceErrorMessagesResponseStructureImpl
