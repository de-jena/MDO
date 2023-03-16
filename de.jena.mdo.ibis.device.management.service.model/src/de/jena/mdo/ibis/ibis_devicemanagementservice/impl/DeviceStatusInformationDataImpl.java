/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice.impl;

import de.jena.mdo.ibis.ibis_common.IBISIPDateTime;

import de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusInformation;
import de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusInformationData;
import de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Status Information Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceStatusInformationDataImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceStatusInformationDataImpl#getDeviceStatusInformation <em>Device Status Information</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceStatusInformationDataImpl extends MinimalEObjectImpl.Container implements DeviceStatusInformationData {
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
	 * The cached value of the '{@link #getDeviceStatusInformation() <em>Device Status Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceStatusInformation()
	 * @generated
	 * @ordered
	 */
	protected DeviceStatusInformation deviceStatusInformation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceStatusInformationDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisDeviceManagementServicePackage.Literals.DEVICE_STATUS_INFORMATION_DATA;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION_DATA__TIME_STAMP, oldTimeStamp, newTimeStamp);
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
				msgs = ((InternalEObject)timeStamp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION_DATA__TIME_STAMP, null, msgs);
			if (newTimeStamp != null)
				msgs = ((InternalEObject)newTimeStamp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION_DATA__TIME_STAMP, null, msgs);
			msgs = basicSetTimeStamp(newTimeStamp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION_DATA__TIME_STAMP, newTimeStamp, newTimeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceStatusInformation getDeviceStatusInformation() {
		return deviceStatusInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceStatusInformation(DeviceStatusInformation newDeviceStatusInformation, NotificationChain msgs) {
		DeviceStatusInformation oldDeviceStatusInformation = deviceStatusInformation;
		deviceStatusInformation = newDeviceStatusInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION_DATA__DEVICE_STATUS_INFORMATION, oldDeviceStatusInformation, newDeviceStatusInformation);
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
	public void setDeviceStatusInformation(DeviceStatusInformation newDeviceStatusInformation) {
		if (newDeviceStatusInformation != deviceStatusInformation) {
			NotificationChain msgs = null;
			if (deviceStatusInformation != null)
				msgs = ((InternalEObject)deviceStatusInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION_DATA__DEVICE_STATUS_INFORMATION, null, msgs);
			if (newDeviceStatusInformation != null)
				msgs = ((InternalEObject)newDeviceStatusInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION_DATA__DEVICE_STATUS_INFORMATION, null, msgs);
			msgs = basicSetDeviceStatusInformation(newDeviceStatusInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION_DATA__DEVICE_STATUS_INFORMATION, newDeviceStatusInformation, newDeviceStatusInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION_DATA__TIME_STAMP:
				return basicSetTimeStamp(null, msgs);
			case IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION_DATA__DEVICE_STATUS_INFORMATION:
				return basicSetDeviceStatusInformation(null, msgs);
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
			case IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION_DATA__TIME_STAMP:
				return getTimeStamp();
			case IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION_DATA__DEVICE_STATUS_INFORMATION:
				return getDeviceStatusInformation();
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
			case IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION_DATA__TIME_STAMP:
				setTimeStamp((IBISIPDateTime)newValue);
				return;
			case IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION_DATA__DEVICE_STATUS_INFORMATION:
				setDeviceStatusInformation((DeviceStatusInformation)newValue);
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
			case IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION_DATA__TIME_STAMP:
				setTimeStamp((IBISIPDateTime)null);
				return;
			case IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION_DATA__DEVICE_STATUS_INFORMATION:
				setDeviceStatusInformation((DeviceStatusInformation)null);
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
			case IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION_DATA__TIME_STAMP:
				return timeStamp != null;
			case IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION_DATA__DEVICE_STATUS_INFORMATION:
				return deviceStatusInformation != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceStatusInformationDataImpl
