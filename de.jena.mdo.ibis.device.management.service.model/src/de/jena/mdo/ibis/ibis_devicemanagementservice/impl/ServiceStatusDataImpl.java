/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice.impl;

import de.jena.mdo.ibis.ibis_common.IBISIPDateTime;
import de.jena.mdo.ibis.ibis_common.ServiceSpecificationWithStateList;

import de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage;
import de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceStatusData;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Status Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.ServiceStatusDataImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.ServiceStatusDataImpl#getServiceSpecificationWithStateList <em>Service Specification With State List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceStatusDataImpl extends MinimalEObjectImpl.Container implements ServiceStatusData {
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
	 * The cached value of the '{@link #getServiceSpecificationWithStateList() <em>Service Specification With State List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceSpecificationWithStateList()
	 * @generated
	 * @ordered
	 */
	protected ServiceSpecificationWithStateList serviceSpecificationWithStateList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceStatusDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisDeviceManagementServicePackage.Literals.SERVICE_STATUS_DATA;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.SERVICE_STATUS_DATA__TIME_STAMP, oldTimeStamp, newTimeStamp);
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
				msgs = ((InternalEObject)timeStamp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.SERVICE_STATUS_DATA__TIME_STAMP, null, msgs);
			if (newTimeStamp != null)
				msgs = ((InternalEObject)newTimeStamp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.SERVICE_STATUS_DATA__TIME_STAMP, null, msgs);
			msgs = basicSetTimeStamp(newTimeStamp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.SERVICE_STATUS_DATA__TIME_STAMP, newTimeStamp, newTimeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceSpecificationWithStateList getServiceSpecificationWithStateList() {
		return serviceSpecificationWithStateList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceSpecificationWithStateList(ServiceSpecificationWithStateList newServiceSpecificationWithStateList, NotificationChain msgs) {
		ServiceSpecificationWithStateList oldServiceSpecificationWithStateList = serviceSpecificationWithStateList;
		serviceSpecificationWithStateList = newServiceSpecificationWithStateList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.SERVICE_STATUS_DATA__SERVICE_SPECIFICATION_WITH_STATE_LIST, oldServiceSpecificationWithStateList, newServiceSpecificationWithStateList);
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
	public void setServiceSpecificationWithStateList(ServiceSpecificationWithStateList newServiceSpecificationWithStateList) {
		if (newServiceSpecificationWithStateList != serviceSpecificationWithStateList) {
			NotificationChain msgs = null;
			if (serviceSpecificationWithStateList != null)
				msgs = ((InternalEObject)serviceSpecificationWithStateList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.SERVICE_STATUS_DATA__SERVICE_SPECIFICATION_WITH_STATE_LIST, null, msgs);
			if (newServiceSpecificationWithStateList != null)
				msgs = ((InternalEObject)newServiceSpecificationWithStateList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.SERVICE_STATUS_DATA__SERVICE_SPECIFICATION_WITH_STATE_LIST, null, msgs);
			msgs = basicSetServiceSpecificationWithStateList(newServiceSpecificationWithStateList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.SERVICE_STATUS_DATA__SERVICE_SPECIFICATION_WITH_STATE_LIST, newServiceSpecificationWithStateList, newServiceSpecificationWithStateList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisDeviceManagementServicePackage.SERVICE_STATUS_DATA__TIME_STAMP:
				return basicSetTimeStamp(null, msgs);
			case IbisDeviceManagementServicePackage.SERVICE_STATUS_DATA__SERVICE_SPECIFICATION_WITH_STATE_LIST:
				return basicSetServiceSpecificationWithStateList(null, msgs);
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
			case IbisDeviceManagementServicePackage.SERVICE_STATUS_DATA__TIME_STAMP:
				return getTimeStamp();
			case IbisDeviceManagementServicePackage.SERVICE_STATUS_DATA__SERVICE_SPECIFICATION_WITH_STATE_LIST:
				return getServiceSpecificationWithStateList();
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
			case IbisDeviceManagementServicePackage.SERVICE_STATUS_DATA__TIME_STAMP:
				setTimeStamp((IBISIPDateTime)newValue);
				return;
			case IbisDeviceManagementServicePackage.SERVICE_STATUS_DATA__SERVICE_SPECIFICATION_WITH_STATE_LIST:
				setServiceSpecificationWithStateList((ServiceSpecificationWithStateList)newValue);
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
			case IbisDeviceManagementServicePackage.SERVICE_STATUS_DATA__TIME_STAMP:
				setTimeStamp((IBISIPDateTime)null);
				return;
			case IbisDeviceManagementServicePackage.SERVICE_STATUS_DATA__SERVICE_SPECIFICATION_WITH_STATE_LIST:
				setServiceSpecificationWithStateList((ServiceSpecificationWithStateList)null);
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
			case IbisDeviceManagementServicePackage.SERVICE_STATUS_DATA__TIME_STAMP:
				return timeStamp != null;
			case IbisDeviceManagementServicePackage.SERVICE_STATUS_DATA__SERVICE_SPECIFICATION_WITH_STATE_LIST:
				return serviceSpecificationWithStateList != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceStatusDataImpl
