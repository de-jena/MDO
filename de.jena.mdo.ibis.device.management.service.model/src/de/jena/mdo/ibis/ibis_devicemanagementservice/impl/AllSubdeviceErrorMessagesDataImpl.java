/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice.impl;

import de.jena.mdo.ibis.ibis_common.IBISIPDateTime;

import de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceErrorMessagesData;
import de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage;
import de.jena.mdo.ibis.ibis_devicemanagementservice.SubdeviceErrorMessages;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>All Subdevice Error Messages Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.AllSubdeviceErrorMessagesDataImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.AllSubdeviceErrorMessagesDataImpl#getSubdeviceErrorMessagesList <em>Subdevice Error Messages List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllSubdeviceErrorMessagesDataImpl extends MinimalEObjectImpl.Container implements AllSubdeviceErrorMessagesData {
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
	 * The cached value of the '{@link #getSubdeviceErrorMessagesList() <em>Subdevice Error Messages List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubdeviceErrorMessagesList()
	 * @generated
	 * @ordered
	 */
	protected SubdeviceErrorMessages subdeviceErrorMessagesList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllSubdeviceErrorMessagesDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisDeviceManagementServicePackage.Literals.ALL_SUBDEVICE_ERROR_MESSAGES_DATA;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.ALL_SUBDEVICE_ERROR_MESSAGES_DATA__TIME_STAMP, oldTimeStamp, newTimeStamp);
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
				msgs = ((InternalEObject)timeStamp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.ALL_SUBDEVICE_ERROR_MESSAGES_DATA__TIME_STAMP, null, msgs);
			if (newTimeStamp != null)
				msgs = ((InternalEObject)newTimeStamp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.ALL_SUBDEVICE_ERROR_MESSAGES_DATA__TIME_STAMP, null, msgs);
			msgs = basicSetTimeStamp(newTimeStamp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.ALL_SUBDEVICE_ERROR_MESSAGES_DATA__TIME_STAMP, newTimeStamp, newTimeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubdeviceErrorMessages getSubdeviceErrorMessagesList() {
		return subdeviceErrorMessagesList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubdeviceErrorMessagesList(SubdeviceErrorMessages newSubdeviceErrorMessagesList, NotificationChain msgs) {
		SubdeviceErrorMessages oldSubdeviceErrorMessagesList = subdeviceErrorMessagesList;
		subdeviceErrorMessagesList = newSubdeviceErrorMessagesList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.ALL_SUBDEVICE_ERROR_MESSAGES_DATA__SUBDEVICE_ERROR_MESSAGES_LIST, oldSubdeviceErrorMessagesList, newSubdeviceErrorMessagesList);
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
	public void setSubdeviceErrorMessagesList(SubdeviceErrorMessages newSubdeviceErrorMessagesList) {
		if (newSubdeviceErrorMessagesList != subdeviceErrorMessagesList) {
			NotificationChain msgs = null;
			if (subdeviceErrorMessagesList != null)
				msgs = ((InternalEObject)subdeviceErrorMessagesList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.ALL_SUBDEVICE_ERROR_MESSAGES_DATA__SUBDEVICE_ERROR_MESSAGES_LIST, null, msgs);
			if (newSubdeviceErrorMessagesList != null)
				msgs = ((InternalEObject)newSubdeviceErrorMessagesList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.ALL_SUBDEVICE_ERROR_MESSAGES_DATA__SUBDEVICE_ERROR_MESSAGES_LIST, null, msgs);
			msgs = basicSetSubdeviceErrorMessagesList(newSubdeviceErrorMessagesList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.ALL_SUBDEVICE_ERROR_MESSAGES_DATA__SUBDEVICE_ERROR_MESSAGES_LIST, newSubdeviceErrorMessagesList, newSubdeviceErrorMessagesList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisDeviceManagementServicePackage.ALL_SUBDEVICE_ERROR_MESSAGES_DATA__TIME_STAMP:
				return basicSetTimeStamp(null, msgs);
			case IbisDeviceManagementServicePackage.ALL_SUBDEVICE_ERROR_MESSAGES_DATA__SUBDEVICE_ERROR_MESSAGES_LIST:
				return basicSetSubdeviceErrorMessagesList(null, msgs);
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
			case IbisDeviceManagementServicePackage.ALL_SUBDEVICE_ERROR_MESSAGES_DATA__TIME_STAMP:
				return getTimeStamp();
			case IbisDeviceManagementServicePackage.ALL_SUBDEVICE_ERROR_MESSAGES_DATA__SUBDEVICE_ERROR_MESSAGES_LIST:
				return getSubdeviceErrorMessagesList();
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
			case IbisDeviceManagementServicePackage.ALL_SUBDEVICE_ERROR_MESSAGES_DATA__TIME_STAMP:
				setTimeStamp((IBISIPDateTime)newValue);
				return;
			case IbisDeviceManagementServicePackage.ALL_SUBDEVICE_ERROR_MESSAGES_DATA__SUBDEVICE_ERROR_MESSAGES_LIST:
				setSubdeviceErrorMessagesList((SubdeviceErrorMessages)newValue);
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
			case IbisDeviceManagementServicePackage.ALL_SUBDEVICE_ERROR_MESSAGES_DATA__TIME_STAMP:
				setTimeStamp((IBISIPDateTime)null);
				return;
			case IbisDeviceManagementServicePackage.ALL_SUBDEVICE_ERROR_MESSAGES_DATA__SUBDEVICE_ERROR_MESSAGES_LIST:
				setSubdeviceErrorMessagesList((SubdeviceErrorMessages)null);
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
			case IbisDeviceManagementServicePackage.ALL_SUBDEVICE_ERROR_MESSAGES_DATA__TIME_STAMP:
				return timeStamp != null;
			case IbisDeviceManagementServicePackage.ALL_SUBDEVICE_ERROR_MESSAGES_DATA__SUBDEVICE_ERROR_MESSAGES_LIST:
				return subdeviceErrorMessagesList != null;
		}
		return super.eIsSet(featureID);
	}

} //AllSubdeviceErrorMessagesDataImpl
