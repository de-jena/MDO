/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice.impl;

import de.jena.mdo.ibis.ibis_common.impl.GeneralResponseImpl;

import de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceInformationData;
import de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceInformationResponse;
import de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>All Subdevice Information Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.AllSubdeviceInformationResponseImpl#getAllSubdeviceInformationData <em>All Subdevice Information Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllSubdeviceInformationResponseImpl extends GeneralResponseImpl implements AllSubdeviceInformationResponse {
	/**
	 * The cached value of the '{@link #getAllSubdeviceInformationData() <em>All Subdevice Information Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllSubdeviceInformationData()
	 * @generated
	 * @ordered
	 */
	protected AllSubdeviceInformationData allSubdeviceInformationData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllSubdeviceInformationResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisDeviceManagementServicePackage.Literals.ALL_SUBDEVICE_INFORMATION_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllSubdeviceInformationData getAllSubdeviceInformationData() {
		return allSubdeviceInformationData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllSubdeviceInformationData(AllSubdeviceInformationData newAllSubdeviceInformationData, NotificationChain msgs) {
		AllSubdeviceInformationData oldAllSubdeviceInformationData = allSubdeviceInformationData;
		allSubdeviceInformationData = newAllSubdeviceInformationData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.ALL_SUBDEVICE_INFORMATION_RESPONSE__ALL_SUBDEVICE_INFORMATION_DATA, oldAllSubdeviceInformationData, newAllSubdeviceInformationData);
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
	public void setAllSubdeviceInformationData(AllSubdeviceInformationData newAllSubdeviceInformationData) {
		if (newAllSubdeviceInformationData != allSubdeviceInformationData) {
			NotificationChain msgs = null;
			if (allSubdeviceInformationData != null)
				msgs = ((InternalEObject)allSubdeviceInformationData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.ALL_SUBDEVICE_INFORMATION_RESPONSE__ALL_SUBDEVICE_INFORMATION_DATA, null, msgs);
			if (newAllSubdeviceInformationData != null)
				msgs = ((InternalEObject)newAllSubdeviceInformationData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.ALL_SUBDEVICE_INFORMATION_RESPONSE__ALL_SUBDEVICE_INFORMATION_DATA, null, msgs);
			msgs = basicSetAllSubdeviceInformationData(newAllSubdeviceInformationData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.ALL_SUBDEVICE_INFORMATION_RESPONSE__ALL_SUBDEVICE_INFORMATION_DATA, newAllSubdeviceInformationData, newAllSubdeviceInformationData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisDeviceManagementServicePackage.ALL_SUBDEVICE_INFORMATION_RESPONSE__ALL_SUBDEVICE_INFORMATION_DATA:
				return basicSetAllSubdeviceInformationData(null, msgs);
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
			case IbisDeviceManagementServicePackage.ALL_SUBDEVICE_INFORMATION_RESPONSE__ALL_SUBDEVICE_INFORMATION_DATA:
				return getAllSubdeviceInformationData();
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
			case IbisDeviceManagementServicePackage.ALL_SUBDEVICE_INFORMATION_RESPONSE__ALL_SUBDEVICE_INFORMATION_DATA:
				setAllSubdeviceInformationData((AllSubdeviceInformationData)newValue);
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
			case IbisDeviceManagementServicePackage.ALL_SUBDEVICE_INFORMATION_RESPONSE__ALL_SUBDEVICE_INFORMATION_DATA:
				setAllSubdeviceInformationData((AllSubdeviceInformationData)null);
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
			case IbisDeviceManagementServicePackage.ALL_SUBDEVICE_INFORMATION_RESPONSE__ALL_SUBDEVICE_INFORMATION_DATA:
				return allSubdeviceInformationData != null;
		}
		return super.eIsSet(featureID);
	}

} //AllSubdeviceInformationResponseImpl
