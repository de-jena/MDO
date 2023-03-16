/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice.impl;

import de.jena.mdo.ibis.ibis_common.impl.GeneralResponseImpl;

import de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage;
import de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceInformationData;
import de.jena.mdo.ibis.ibis_devicemanagementservice.ServiceInformationResponse;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Information Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.ServiceInformationResponseImpl#getServiceInformationData <em>Service Information Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceInformationResponseImpl extends GeneralResponseImpl implements ServiceInformationResponse {
	/**
	 * The cached value of the '{@link #getServiceInformationData() <em>Service Information Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceInformationData()
	 * @generated
	 * @ordered
	 */
	protected ServiceInformationData serviceInformationData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceInformationResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisDeviceManagementServicePackage.Literals.SERVICE_INFORMATION_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceInformationData getServiceInformationData() {
		return serviceInformationData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceInformationData(ServiceInformationData newServiceInformationData, NotificationChain msgs) {
		ServiceInformationData oldServiceInformationData = serviceInformationData;
		serviceInformationData = newServiceInformationData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.SERVICE_INFORMATION_RESPONSE__SERVICE_INFORMATION_DATA, oldServiceInformationData, newServiceInformationData);
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
	public void setServiceInformationData(ServiceInformationData newServiceInformationData) {
		if (newServiceInformationData != serviceInformationData) {
			NotificationChain msgs = null;
			if (serviceInformationData != null)
				msgs = ((InternalEObject)serviceInformationData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.SERVICE_INFORMATION_RESPONSE__SERVICE_INFORMATION_DATA, null, msgs);
			if (newServiceInformationData != null)
				msgs = ((InternalEObject)newServiceInformationData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.SERVICE_INFORMATION_RESPONSE__SERVICE_INFORMATION_DATA, null, msgs);
			msgs = basicSetServiceInformationData(newServiceInformationData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.SERVICE_INFORMATION_RESPONSE__SERVICE_INFORMATION_DATA, newServiceInformationData, newServiceInformationData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisDeviceManagementServicePackage.SERVICE_INFORMATION_RESPONSE__SERVICE_INFORMATION_DATA:
				return basicSetServiceInformationData(null, msgs);
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
			case IbisDeviceManagementServicePackage.SERVICE_INFORMATION_RESPONSE__SERVICE_INFORMATION_DATA:
				return getServiceInformationData();
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
			case IbisDeviceManagementServicePackage.SERVICE_INFORMATION_RESPONSE__SERVICE_INFORMATION_DATA:
				setServiceInformationData((ServiceInformationData)newValue);
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
			case IbisDeviceManagementServicePackage.SERVICE_INFORMATION_RESPONSE__SERVICE_INFORMATION_DATA:
				setServiceInformationData((ServiceInformationData)null);
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
			case IbisDeviceManagementServicePackage.SERVICE_INFORMATION_RESPONSE__SERVICE_INFORMATION_DATA:
				return serviceInformationData != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceInformationResponseImpl
