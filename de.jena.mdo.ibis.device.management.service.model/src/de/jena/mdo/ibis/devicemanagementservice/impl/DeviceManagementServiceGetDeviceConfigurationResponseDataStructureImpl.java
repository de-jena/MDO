/*
 */
package de.jena.mdo.ibis.devicemanagementservice.impl;

import de.jena.mdo.ibis.common.IBISIPDateTime;
import de.jena.mdo.ibis.common.IBISIPInt;

import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceConfigurationResponseDataStructure;
import de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Management Service Get Device Configuration Response Data Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetDeviceConfigurationResponseDataStructureImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetDeviceConfigurationResponseDataStructureImpl#getDeviceID <em>Device ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceManagementServiceGetDeviceConfigurationResponseDataStructureImpl extends MinimalEObjectImpl.Container implements DeviceManagementServiceGetDeviceConfigurationResponseDataStructure {
	/**
	 * The cached value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected IBISIPDateTime timeStamp;

	/**
	 * The cached value of the '{@link #getDeviceID() <em>Device ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceID()
	 * @generated
	 * @ordered
	 */
	protected IBISIPInt deviceID;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceManagementServiceGetDeviceConfigurationResponseDataStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IBISDeviceManagementServicePackage.eINSTANCE.getDeviceManagementServiceGetDeviceConfigurationResponseDataStructure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPDateTime getTimeStamp() {
		return timeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeStamp(IBISIPDateTime newTimeStamp, NotificationChain msgs) {
		IBISIPDateTime oldTimeStamp = timeStamp;
		timeStamp = newTimeStamp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_DATA_STRUCTURE__TIME_STAMP, oldTimeStamp, newTimeStamp);
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
	public void setTimeStamp(IBISIPDateTime newTimeStamp) {
		if (newTimeStamp != timeStamp) {
			NotificationChain msgs = null;
			if (timeStamp != null)
				msgs = ((InternalEObject)timeStamp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_DATA_STRUCTURE__TIME_STAMP, null, msgs);
			if (newTimeStamp != null)
				msgs = ((InternalEObject)newTimeStamp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_DATA_STRUCTURE__TIME_STAMP, null, msgs);
			msgs = basicSetTimeStamp(newTimeStamp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_DATA_STRUCTURE__TIME_STAMP, newTimeStamp, newTimeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPInt getDeviceID() {
		return deviceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceID(IBISIPInt newDeviceID, NotificationChain msgs) {
		IBISIPInt oldDeviceID = deviceID;
		deviceID = newDeviceID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_DATA_STRUCTURE__DEVICE_ID, oldDeviceID, newDeviceID);
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
	public void setDeviceID(IBISIPInt newDeviceID) {
		if (newDeviceID != deviceID) {
			NotificationChain msgs = null;
			if (deviceID != null)
				msgs = ((InternalEObject)deviceID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_DATA_STRUCTURE__DEVICE_ID, null, msgs);
			if (newDeviceID != null)
				msgs = ((InternalEObject)newDeviceID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_DATA_STRUCTURE__DEVICE_ID, null, msgs);
			msgs = basicSetDeviceID(newDeviceID, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_DATA_STRUCTURE__DEVICE_ID, newDeviceID, newDeviceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_DATA_STRUCTURE__TIME_STAMP:
				return basicSetTimeStamp(null, msgs);
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_DATA_STRUCTURE__DEVICE_ID:
				return basicSetDeviceID(null, msgs);
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
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_DATA_STRUCTURE__TIME_STAMP:
				return getTimeStamp();
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_DATA_STRUCTURE__DEVICE_ID:
				return getDeviceID();
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
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_DATA_STRUCTURE__TIME_STAMP:
				setTimeStamp((IBISIPDateTime)newValue);
				return;
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_DATA_STRUCTURE__DEVICE_ID:
				setDeviceID((IBISIPInt)newValue);
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
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_DATA_STRUCTURE__TIME_STAMP:
				setTimeStamp((IBISIPDateTime)null);
				return;
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_DATA_STRUCTURE__DEVICE_ID:
				setDeviceID((IBISIPInt)null);
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
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_DATA_STRUCTURE__TIME_STAMP:
				return timeStamp != null;
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_CONFIGURATION_RESPONSE_DATA_STRUCTURE__DEVICE_ID:
				return deviceID != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceManagementServiceGetDeviceConfigurationResponseDataStructureImpl