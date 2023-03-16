/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice.impl;

import de.jena.mdo.ibis.ibis_common.impl.GeneralResponseImpl;

import de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceStatusInformationData;
import de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceStatusInformationResponse;
import de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>All Subdevice Status Information Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.AllSubdeviceStatusInformationResponseImpl#getAllSubdeviceStatusInformationData <em>All Subdevice Status Information Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllSubdeviceStatusInformationResponseImpl extends GeneralResponseImpl implements AllSubdeviceStatusInformationResponse {
	/**
	 * The cached value of the '{@link #getAllSubdeviceStatusInformationData() <em>All Subdevice Status Information Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllSubdeviceStatusInformationData()
	 * @generated
	 * @ordered
	 */
	protected AllSubdeviceStatusInformationData allSubdeviceStatusInformationData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllSubdeviceStatusInformationResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisDeviceManagementServicePackage.Literals.ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllSubdeviceStatusInformationData getAllSubdeviceStatusInformationData() {
		return allSubdeviceStatusInformationData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllSubdeviceStatusInformationData(AllSubdeviceStatusInformationData newAllSubdeviceStatusInformationData, NotificationChain msgs) {
		AllSubdeviceStatusInformationData oldAllSubdeviceStatusInformationData = allSubdeviceStatusInformationData;
		allSubdeviceStatusInformationData = newAllSubdeviceStatusInformationData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE__ALL_SUBDEVICE_STATUS_INFORMATION_DATA, oldAllSubdeviceStatusInformationData, newAllSubdeviceStatusInformationData);
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
	public void setAllSubdeviceStatusInformationData(AllSubdeviceStatusInformationData newAllSubdeviceStatusInformationData) {
		if (newAllSubdeviceStatusInformationData != allSubdeviceStatusInformationData) {
			NotificationChain msgs = null;
			if (allSubdeviceStatusInformationData != null)
				msgs = ((InternalEObject)allSubdeviceStatusInformationData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE__ALL_SUBDEVICE_STATUS_INFORMATION_DATA, null, msgs);
			if (newAllSubdeviceStatusInformationData != null)
				msgs = ((InternalEObject)newAllSubdeviceStatusInformationData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE__ALL_SUBDEVICE_STATUS_INFORMATION_DATA, null, msgs);
			msgs = basicSetAllSubdeviceStatusInformationData(newAllSubdeviceStatusInformationData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE__ALL_SUBDEVICE_STATUS_INFORMATION_DATA, newAllSubdeviceStatusInformationData, newAllSubdeviceStatusInformationData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisDeviceManagementServicePackage.ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE__ALL_SUBDEVICE_STATUS_INFORMATION_DATA:
				return basicSetAllSubdeviceStatusInformationData(null, msgs);
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
			case IbisDeviceManagementServicePackage.ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE__ALL_SUBDEVICE_STATUS_INFORMATION_DATA:
				return getAllSubdeviceStatusInformationData();
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
			case IbisDeviceManagementServicePackage.ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE__ALL_SUBDEVICE_STATUS_INFORMATION_DATA:
				setAllSubdeviceStatusInformationData((AllSubdeviceStatusInformationData)newValue);
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
			case IbisDeviceManagementServicePackage.ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE__ALL_SUBDEVICE_STATUS_INFORMATION_DATA:
				setAllSubdeviceStatusInformationData((AllSubdeviceStatusInformationData)null);
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
			case IbisDeviceManagementServicePackage.ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE__ALL_SUBDEVICE_STATUS_INFORMATION_DATA:
				return allSubdeviceStatusInformationData != null;
		}
		return super.eIsSet(featureID);
	}

} //AllSubdeviceStatusInformationResponseImpl
