/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice.impl;

import de.jena.mdo.ibis.ibis_common.DeviceInformation;
import de.jena.mdo.ibis.ibis_common.IBISIPString;

import de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage;
import de.jena.mdo.ibis.ibis_devicemanagementservice.SubdeviceInformation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subdevice Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.SubdeviceInformationImpl#getSubdeviceName <em>Subdevice Name</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.SubdeviceInformationImpl#getDeviceInformation <em>Device Information</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubdeviceInformationImpl extends MinimalEObjectImpl.Container implements SubdeviceInformation {
	/**
	 * The cached value of the '{@link #getSubdeviceName() <em>Subdevice Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubdeviceName()
	 * @generated
	 * @ordered
	 */
	protected IBISIPString subdeviceName;

	/**
	 * The cached value of the '{@link #getDeviceInformation() <em>Device Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceInformation()
	 * @generated
	 * @ordered
	 */
	protected DeviceInformation deviceInformation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubdeviceInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisDeviceManagementServicePackage.Literals.SUBDEVICE_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPString getSubdeviceName() {
		return subdeviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubdeviceName(IBISIPString newSubdeviceName, NotificationChain msgs) {
		IBISIPString oldSubdeviceName = subdeviceName;
		subdeviceName = newSubdeviceName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.SUBDEVICE_INFORMATION__SUBDEVICE_NAME, oldSubdeviceName, newSubdeviceName);
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
	public void setSubdeviceName(IBISIPString newSubdeviceName) {
		if (newSubdeviceName != subdeviceName) {
			NotificationChain msgs = null;
			if (subdeviceName != null)
				msgs = ((InternalEObject)subdeviceName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.SUBDEVICE_INFORMATION__SUBDEVICE_NAME, null, msgs);
			if (newSubdeviceName != null)
				msgs = ((InternalEObject)newSubdeviceName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.SUBDEVICE_INFORMATION__SUBDEVICE_NAME, null, msgs);
			msgs = basicSetSubdeviceName(newSubdeviceName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.SUBDEVICE_INFORMATION__SUBDEVICE_NAME, newSubdeviceName, newSubdeviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceInformation getDeviceInformation() {
		return deviceInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceInformation(DeviceInformation newDeviceInformation, NotificationChain msgs) {
		DeviceInformation oldDeviceInformation = deviceInformation;
		deviceInformation = newDeviceInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.SUBDEVICE_INFORMATION__DEVICE_INFORMATION, oldDeviceInformation, newDeviceInformation);
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
	public void setDeviceInformation(DeviceInformation newDeviceInformation) {
		if (newDeviceInformation != deviceInformation) {
			NotificationChain msgs = null;
			if (deviceInformation != null)
				msgs = ((InternalEObject)deviceInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.SUBDEVICE_INFORMATION__DEVICE_INFORMATION, null, msgs);
			if (newDeviceInformation != null)
				msgs = ((InternalEObject)newDeviceInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.SUBDEVICE_INFORMATION__DEVICE_INFORMATION, null, msgs);
			msgs = basicSetDeviceInformation(newDeviceInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.SUBDEVICE_INFORMATION__DEVICE_INFORMATION, newDeviceInformation, newDeviceInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisDeviceManagementServicePackage.SUBDEVICE_INFORMATION__SUBDEVICE_NAME:
				return basicSetSubdeviceName(null, msgs);
			case IbisDeviceManagementServicePackage.SUBDEVICE_INFORMATION__DEVICE_INFORMATION:
				return basicSetDeviceInformation(null, msgs);
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
			case IbisDeviceManagementServicePackage.SUBDEVICE_INFORMATION__SUBDEVICE_NAME:
				return getSubdeviceName();
			case IbisDeviceManagementServicePackage.SUBDEVICE_INFORMATION__DEVICE_INFORMATION:
				return getDeviceInformation();
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
			case IbisDeviceManagementServicePackage.SUBDEVICE_INFORMATION__SUBDEVICE_NAME:
				setSubdeviceName((IBISIPString)newValue);
				return;
			case IbisDeviceManagementServicePackage.SUBDEVICE_INFORMATION__DEVICE_INFORMATION:
				setDeviceInformation((DeviceInformation)newValue);
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
			case IbisDeviceManagementServicePackage.SUBDEVICE_INFORMATION__SUBDEVICE_NAME:
				setSubdeviceName((IBISIPString)null);
				return;
			case IbisDeviceManagementServicePackage.SUBDEVICE_INFORMATION__DEVICE_INFORMATION:
				setDeviceInformation((DeviceInformation)null);
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
			case IbisDeviceManagementServicePackage.SUBDEVICE_INFORMATION__SUBDEVICE_NAME:
				return subdeviceName != null;
			case IbisDeviceManagementServicePackage.SUBDEVICE_INFORMATION__DEVICE_INFORMATION:
				return deviceInformation != null;
		}
		return super.eIsSet(featureID);
	}

} //SubdeviceInformationImpl
