/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice.impl;

import de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatus;
import de.jena.mdo.ibis.ibis_devicemanagementservice.DeviceStatusInformation;
import de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage;

import de.jena.mdo.ibis.ibis_enumerations.DeviceStateEnumeration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Status Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceStatusInformationImpl#getDeviceState <em>Device State</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.DeviceStatusInformationImpl#getDeviceStatusList <em>Device Status List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceStatusInformationImpl extends MinimalEObjectImpl.Container implements DeviceStatusInformation {
	/**
	 * The default value of the '{@link #getDeviceState() <em>Device State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceState()
	 * @generated
	 * @ordered
	 */
	protected static final DeviceStateEnumeration DEVICE_STATE_EDEFAULT = DeviceStateEnumeration.DEFECTIVE;

	/**
	 * The cached value of the '{@link #getDeviceState() <em>Device State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceState()
	 * @generated
	 * @ordered
	 */
	protected DeviceStateEnumeration deviceState = DEVICE_STATE_EDEFAULT;

	/**
	 * This is true if the Device State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deviceStateESet;

	/**
	 * The cached value of the '{@link #getDeviceStatusList() <em>Device Status List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceStatusList()
	 * @generated
	 * @ordered
	 */
	protected DeviceStatus deviceStatusList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceStatusInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisDeviceManagementServicePackage.Literals.DEVICE_STATUS_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceStateEnumeration getDeviceState() {
		return deviceState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeviceState(DeviceStateEnumeration newDeviceState) {
		DeviceStateEnumeration oldDeviceState = deviceState;
		deviceState = newDeviceState == null ? DEVICE_STATE_EDEFAULT : newDeviceState;
		boolean oldDeviceStateESet = deviceStateESet;
		deviceStateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION__DEVICE_STATE, oldDeviceState, deviceState, !oldDeviceStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDeviceState() {
		DeviceStateEnumeration oldDeviceState = deviceState;
		boolean oldDeviceStateESet = deviceStateESet;
		deviceState = DEVICE_STATE_EDEFAULT;
		deviceStateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION__DEVICE_STATE, oldDeviceState, DEVICE_STATE_EDEFAULT, oldDeviceStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDeviceState() {
		return deviceStateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceStatus getDeviceStatusList() {
		return deviceStatusList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceStatusList(DeviceStatus newDeviceStatusList, NotificationChain msgs) {
		DeviceStatus oldDeviceStatusList = deviceStatusList;
		deviceStatusList = newDeviceStatusList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION__DEVICE_STATUS_LIST, oldDeviceStatusList, newDeviceStatusList);
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
	public void setDeviceStatusList(DeviceStatus newDeviceStatusList) {
		if (newDeviceStatusList != deviceStatusList) {
			NotificationChain msgs = null;
			if (deviceStatusList != null)
				msgs = ((InternalEObject)deviceStatusList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION__DEVICE_STATUS_LIST, null, msgs);
			if (newDeviceStatusList != null)
				msgs = ((InternalEObject)newDeviceStatusList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION__DEVICE_STATUS_LIST, null, msgs);
			msgs = basicSetDeviceStatusList(newDeviceStatusList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION__DEVICE_STATUS_LIST, newDeviceStatusList, newDeviceStatusList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION__DEVICE_STATUS_LIST:
				return basicSetDeviceStatusList(null, msgs);
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
			case IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION__DEVICE_STATE:
				return getDeviceState();
			case IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION__DEVICE_STATUS_LIST:
				return getDeviceStatusList();
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
			case IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION__DEVICE_STATE:
				setDeviceState((DeviceStateEnumeration)newValue);
				return;
			case IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION__DEVICE_STATUS_LIST:
				setDeviceStatusList((DeviceStatus)newValue);
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
			case IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION__DEVICE_STATE:
				unsetDeviceState();
				return;
			case IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION__DEVICE_STATUS_LIST:
				setDeviceStatusList((DeviceStatus)null);
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
			case IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION__DEVICE_STATE:
				return isSetDeviceState();
			case IbisDeviceManagementServicePackage.DEVICE_STATUS_INFORMATION__DEVICE_STATUS_LIST:
				return deviceStatusList != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (deviceState: ");
		if (deviceStateESet) result.append(deviceState); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DeviceStatusInformationImpl
