/*
 */
package de.jena.mdo.ibis.devicemanagementservice.impl;

import de.jena.mdo.ibis.common.IBISIPString;

import de.jena.mdo.ibis.devicemanagementservice.DeviceStatusInformationStructure;
import de.jena.mdo.ibis.devicemanagementservice.IbisDeviceManagementServicePackage;
import de.jena.mdo.ibis.devicemanagementservice.SubdeviceStatusInformationStructure;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subdevice Status Information Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.impl.SubdeviceStatusInformationStructureImpl#getSubdeviceName <em>Subdevice Name</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.impl.SubdeviceStatusInformationStructureImpl#getDeviceStatusInformation <em>Device Status Information</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubdeviceStatusInformationStructureImpl extends MinimalEObjectImpl.Container implements SubdeviceStatusInformationStructure {
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
	 * The cached value of the '{@link #getDeviceStatusInformation() <em>Device Status Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceStatusInformation()
	 * @generated
	 * @ordered
	 */
	protected DeviceStatusInformationStructure deviceStatusInformation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubdeviceStatusInformationStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisDeviceManagementServicePackage.Literals.SUBDEVICE_STATUS_INFORMATION_STRUCTURE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.SUBDEVICE_STATUS_INFORMATION_STRUCTURE__SUBDEVICE_NAME, oldSubdeviceName, newSubdeviceName);
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
				msgs = ((InternalEObject)subdeviceName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.SUBDEVICE_STATUS_INFORMATION_STRUCTURE__SUBDEVICE_NAME, null, msgs);
			if (newSubdeviceName != null)
				msgs = ((InternalEObject)newSubdeviceName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.SUBDEVICE_STATUS_INFORMATION_STRUCTURE__SUBDEVICE_NAME, null, msgs);
			msgs = basicSetSubdeviceName(newSubdeviceName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.SUBDEVICE_STATUS_INFORMATION_STRUCTURE__SUBDEVICE_NAME, newSubdeviceName, newSubdeviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceStatusInformationStructure getDeviceStatusInformation() {
		return deviceStatusInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceStatusInformation(DeviceStatusInformationStructure newDeviceStatusInformation, NotificationChain msgs) {
		DeviceStatusInformationStructure oldDeviceStatusInformation = deviceStatusInformation;
		deviceStatusInformation = newDeviceStatusInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.SUBDEVICE_STATUS_INFORMATION_STRUCTURE__DEVICE_STATUS_INFORMATION, oldDeviceStatusInformation, newDeviceStatusInformation);
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
	public void setDeviceStatusInformation(DeviceStatusInformationStructure newDeviceStatusInformation) {
		if (newDeviceStatusInformation != deviceStatusInformation) {
			NotificationChain msgs = null;
			if (deviceStatusInformation != null)
				msgs = ((InternalEObject)deviceStatusInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.SUBDEVICE_STATUS_INFORMATION_STRUCTURE__DEVICE_STATUS_INFORMATION, null, msgs);
			if (newDeviceStatusInformation != null)
				msgs = ((InternalEObject)newDeviceStatusInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.SUBDEVICE_STATUS_INFORMATION_STRUCTURE__DEVICE_STATUS_INFORMATION, null, msgs);
			msgs = basicSetDeviceStatusInformation(newDeviceStatusInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.SUBDEVICE_STATUS_INFORMATION_STRUCTURE__DEVICE_STATUS_INFORMATION, newDeviceStatusInformation, newDeviceStatusInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisDeviceManagementServicePackage.SUBDEVICE_STATUS_INFORMATION_STRUCTURE__SUBDEVICE_NAME:
				return basicSetSubdeviceName(null, msgs);
			case IbisDeviceManagementServicePackage.SUBDEVICE_STATUS_INFORMATION_STRUCTURE__DEVICE_STATUS_INFORMATION:
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
			case IbisDeviceManagementServicePackage.SUBDEVICE_STATUS_INFORMATION_STRUCTURE__SUBDEVICE_NAME:
				return getSubdeviceName();
			case IbisDeviceManagementServicePackage.SUBDEVICE_STATUS_INFORMATION_STRUCTURE__DEVICE_STATUS_INFORMATION:
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
			case IbisDeviceManagementServicePackage.SUBDEVICE_STATUS_INFORMATION_STRUCTURE__SUBDEVICE_NAME:
				setSubdeviceName((IBISIPString)newValue);
				return;
			case IbisDeviceManagementServicePackage.SUBDEVICE_STATUS_INFORMATION_STRUCTURE__DEVICE_STATUS_INFORMATION:
				setDeviceStatusInformation((DeviceStatusInformationStructure)newValue);
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
			case IbisDeviceManagementServicePackage.SUBDEVICE_STATUS_INFORMATION_STRUCTURE__SUBDEVICE_NAME:
				setSubdeviceName((IBISIPString)null);
				return;
			case IbisDeviceManagementServicePackage.SUBDEVICE_STATUS_INFORMATION_STRUCTURE__DEVICE_STATUS_INFORMATION:
				setDeviceStatusInformation((DeviceStatusInformationStructure)null);
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
			case IbisDeviceManagementServicePackage.SUBDEVICE_STATUS_INFORMATION_STRUCTURE__SUBDEVICE_NAME:
				return subdeviceName != null;
			case IbisDeviceManagementServicePackage.SUBDEVICE_STATUS_INFORMATION_STRUCTURE__DEVICE_STATUS_INFORMATION:
				return deviceStatusInformation != null;
		}
		return super.eIsSet(featureID);
	}

} //SubdeviceStatusInformationStructureImpl
