/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice.impl;

import de.jena.mdo.ibis.ibis_common.impl.GeneralResponseImpl;

import de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage;
import de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceStatusData;
import de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceStatusResponse;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Status Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.ServiceStatusResponseImpl#getServiceStatusData <em>Service Status Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceStatusResponseImpl extends GeneralResponseImpl implements ServiceStatusResponse {
	/**
	 * The cached value of the '{@link #getServiceStatusData() <em>Service Status Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceStatusData()
	 * @generated
	 * @ordered
	 */
	protected ServiceStatusData serviceStatusData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceStatusResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisDeviceManagementServicePackage.Literals.SERVICE_STATUS_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceStatusData getServiceStatusData() {
		return serviceStatusData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceStatusData(ServiceStatusData newServiceStatusData, NotificationChain msgs) {
		ServiceStatusData oldServiceStatusData = serviceStatusData;
		serviceStatusData = newServiceStatusData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.SERVICE_STATUS_RESPONSE__SERVICE_STATUS_DATA, oldServiceStatusData, newServiceStatusData);
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
	public void setServiceStatusData(ServiceStatusData newServiceStatusData) {
		if (newServiceStatusData != serviceStatusData) {
			NotificationChain msgs = null;
			if (serviceStatusData != null)
				msgs = ((InternalEObject)serviceStatusData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.SERVICE_STATUS_RESPONSE__SERVICE_STATUS_DATA, null, msgs);
			if (newServiceStatusData != null)
				msgs = ((InternalEObject)newServiceStatusData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.SERVICE_STATUS_RESPONSE__SERVICE_STATUS_DATA, null, msgs);
			msgs = basicSetServiceStatusData(newServiceStatusData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.SERVICE_STATUS_RESPONSE__SERVICE_STATUS_DATA, newServiceStatusData, newServiceStatusData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisDeviceManagementServicePackage.SERVICE_STATUS_RESPONSE__SERVICE_STATUS_DATA:
				return basicSetServiceStatusData(null, msgs);
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
			case IbisDeviceManagementServicePackage.SERVICE_STATUS_RESPONSE__SERVICE_STATUS_DATA:
				return getServiceStatusData();
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
			case IbisDeviceManagementServicePackage.SERVICE_STATUS_RESPONSE__SERVICE_STATUS_DATA:
				setServiceStatusData((ServiceStatusData)newValue);
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
			case IbisDeviceManagementServicePackage.SERVICE_STATUS_RESPONSE__SERVICE_STATUS_DATA:
				setServiceStatusData((ServiceStatusData)null);
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
			case IbisDeviceManagementServicePackage.SERVICE_STATUS_RESPONSE__SERVICE_STATUS_DATA:
				return serviceStatusData != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceStatusResponseImpl
