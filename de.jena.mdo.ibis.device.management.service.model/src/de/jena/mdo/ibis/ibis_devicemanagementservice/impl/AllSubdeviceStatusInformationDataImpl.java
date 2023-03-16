/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice.impl;

import de.jena.mdo.ibis.ibis_common.IBISIPDateTime;

import de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceStatusInformationData;
import de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage;
import de.jena.mdo.ibis.ibis_devicemanagementservice.SubdeviceStatusInformation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>All Subdevice Status Information Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.AllSubdeviceStatusInformationDataImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.AllSubdeviceStatusInformationDataImpl#getSubdeviceStatusInformationList <em>Subdevice Status Information List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllSubdeviceStatusInformationDataImpl extends MinimalEObjectImpl.Container implements AllSubdeviceStatusInformationData {
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
	 * The cached value of the '{@link #getSubdeviceStatusInformationList() <em>Subdevice Status Information List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubdeviceStatusInformationList()
	 * @generated
	 * @ordered
	 */
	protected SubdeviceStatusInformation subdeviceStatusInformationList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllSubdeviceStatusInformationDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisDeviceManagementServicePackage.Literals.ALL_SUBDEVICE_STATUS_INFORMATION_DATA;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.ALL_SUBDEVICE_STATUS_INFORMATION_DATA__TIME_STAMP, oldTimeStamp, newTimeStamp);
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
				msgs = ((InternalEObject)timeStamp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.ALL_SUBDEVICE_STATUS_INFORMATION_DATA__TIME_STAMP, null, msgs);
			if (newTimeStamp != null)
				msgs = ((InternalEObject)newTimeStamp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.ALL_SUBDEVICE_STATUS_INFORMATION_DATA__TIME_STAMP, null, msgs);
			msgs = basicSetTimeStamp(newTimeStamp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.ALL_SUBDEVICE_STATUS_INFORMATION_DATA__TIME_STAMP, newTimeStamp, newTimeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubdeviceStatusInformation getSubdeviceStatusInformationList() {
		return subdeviceStatusInformationList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubdeviceStatusInformationList(SubdeviceStatusInformation newSubdeviceStatusInformationList, NotificationChain msgs) {
		SubdeviceStatusInformation oldSubdeviceStatusInformationList = subdeviceStatusInformationList;
		subdeviceStatusInformationList = newSubdeviceStatusInformationList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.ALL_SUBDEVICE_STATUS_INFORMATION_DATA__SUBDEVICE_STATUS_INFORMATION_LIST, oldSubdeviceStatusInformationList, newSubdeviceStatusInformationList);
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
	public void setSubdeviceStatusInformationList(SubdeviceStatusInformation newSubdeviceStatusInformationList) {
		if (newSubdeviceStatusInformationList != subdeviceStatusInformationList) {
			NotificationChain msgs = null;
			if (subdeviceStatusInformationList != null)
				msgs = ((InternalEObject)subdeviceStatusInformationList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.ALL_SUBDEVICE_STATUS_INFORMATION_DATA__SUBDEVICE_STATUS_INFORMATION_LIST, null, msgs);
			if (newSubdeviceStatusInformationList != null)
				msgs = ((InternalEObject)newSubdeviceStatusInformationList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.ALL_SUBDEVICE_STATUS_INFORMATION_DATA__SUBDEVICE_STATUS_INFORMATION_LIST, null, msgs);
			msgs = basicSetSubdeviceStatusInformationList(newSubdeviceStatusInformationList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.ALL_SUBDEVICE_STATUS_INFORMATION_DATA__SUBDEVICE_STATUS_INFORMATION_LIST, newSubdeviceStatusInformationList, newSubdeviceStatusInformationList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisDeviceManagementServicePackage.ALL_SUBDEVICE_STATUS_INFORMATION_DATA__TIME_STAMP:
				return basicSetTimeStamp(null, msgs);
			case IbisDeviceManagementServicePackage.ALL_SUBDEVICE_STATUS_INFORMATION_DATA__SUBDEVICE_STATUS_INFORMATION_LIST:
				return basicSetSubdeviceStatusInformationList(null, msgs);
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
			case IbisDeviceManagementServicePackage.ALL_SUBDEVICE_STATUS_INFORMATION_DATA__TIME_STAMP:
				return getTimeStamp();
			case IbisDeviceManagementServicePackage.ALL_SUBDEVICE_STATUS_INFORMATION_DATA__SUBDEVICE_STATUS_INFORMATION_LIST:
				return getSubdeviceStatusInformationList();
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
			case IbisDeviceManagementServicePackage.ALL_SUBDEVICE_STATUS_INFORMATION_DATA__TIME_STAMP:
				setTimeStamp((IBISIPDateTime)newValue);
				return;
			case IbisDeviceManagementServicePackage.ALL_SUBDEVICE_STATUS_INFORMATION_DATA__SUBDEVICE_STATUS_INFORMATION_LIST:
				setSubdeviceStatusInformationList((SubdeviceStatusInformation)newValue);
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
			case IbisDeviceManagementServicePackage.ALL_SUBDEVICE_STATUS_INFORMATION_DATA__TIME_STAMP:
				setTimeStamp((IBISIPDateTime)null);
				return;
			case IbisDeviceManagementServicePackage.ALL_SUBDEVICE_STATUS_INFORMATION_DATA__SUBDEVICE_STATUS_INFORMATION_LIST:
				setSubdeviceStatusInformationList((SubdeviceStatusInformation)null);
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
			case IbisDeviceManagementServicePackage.ALL_SUBDEVICE_STATUS_INFORMATION_DATA__TIME_STAMP:
				return timeStamp != null;
			case IbisDeviceManagementServicePackage.ALL_SUBDEVICE_STATUS_INFORMATION_DATA__SUBDEVICE_STATUS_INFORMATION_LIST:
				return subdeviceStatusInformationList != null;
		}
		return super.eIsSet(featureID);
	}

} //AllSubdeviceStatusInformationDataImpl
