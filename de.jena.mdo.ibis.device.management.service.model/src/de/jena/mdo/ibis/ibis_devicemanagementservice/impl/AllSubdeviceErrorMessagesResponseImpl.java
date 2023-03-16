/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice.impl;

import de.jena.mdo.ibis.ibis_common.impl.GeneralResponseImpl;

import de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceErrorMessagesData;
import de.jena.mdo.ibis.ibis_devicemanagementservice.AllSubdeviceErrorMessagesResponse;
import de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>All Subdevice Error Messages Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.AllSubdeviceErrorMessagesResponseImpl#getAllSubdeviceErrorMessagesData <em>All Subdevice Error Messages Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllSubdeviceErrorMessagesResponseImpl extends GeneralResponseImpl implements AllSubdeviceErrorMessagesResponse {
	/**
	 * The cached value of the '{@link #getAllSubdeviceErrorMessagesData() <em>All Subdevice Error Messages Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllSubdeviceErrorMessagesData()
	 * @generated
	 * @ordered
	 */
	protected AllSubdeviceErrorMessagesData allSubdeviceErrorMessagesData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllSubdeviceErrorMessagesResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisDeviceManagementServicePackage.Literals.ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllSubdeviceErrorMessagesData getAllSubdeviceErrorMessagesData() {
		return allSubdeviceErrorMessagesData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllSubdeviceErrorMessagesData(AllSubdeviceErrorMessagesData newAllSubdeviceErrorMessagesData, NotificationChain msgs) {
		AllSubdeviceErrorMessagesData oldAllSubdeviceErrorMessagesData = allSubdeviceErrorMessagesData;
		allSubdeviceErrorMessagesData = newAllSubdeviceErrorMessagesData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE__ALL_SUBDEVICE_ERROR_MESSAGES_DATA, oldAllSubdeviceErrorMessagesData, newAllSubdeviceErrorMessagesData);
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
	public void setAllSubdeviceErrorMessagesData(AllSubdeviceErrorMessagesData newAllSubdeviceErrorMessagesData) {
		if (newAllSubdeviceErrorMessagesData != allSubdeviceErrorMessagesData) {
			NotificationChain msgs = null;
			if (allSubdeviceErrorMessagesData != null)
				msgs = ((InternalEObject)allSubdeviceErrorMessagesData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE__ALL_SUBDEVICE_ERROR_MESSAGES_DATA, null, msgs);
			if (newAllSubdeviceErrorMessagesData != null)
				msgs = ((InternalEObject)newAllSubdeviceErrorMessagesData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE__ALL_SUBDEVICE_ERROR_MESSAGES_DATA, null, msgs);
			msgs = basicSetAllSubdeviceErrorMessagesData(newAllSubdeviceErrorMessagesData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE__ALL_SUBDEVICE_ERROR_MESSAGES_DATA, newAllSubdeviceErrorMessagesData, newAllSubdeviceErrorMessagesData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisDeviceManagementServicePackage.ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE__ALL_SUBDEVICE_ERROR_MESSAGES_DATA:
				return basicSetAllSubdeviceErrorMessagesData(null, msgs);
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
			case IbisDeviceManagementServicePackage.ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE__ALL_SUBDEVICE_ERROR_MESSAGES_DATA:
				return getAllSubdeviceErrorMessagesData();
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
			case IbisDeviceManagementServicePackage.ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE__ALL_SUBDEVICE_ERROR_MESSAGES_DATA:
				setAllSubdeviceErrorMessagesData((AllSubdeviceErrorMessagesData)newValue);
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
			case IbisDeviceManagementServicePackage.ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE__ALL_SUBDEVICE_ERROR_MESSAGES_DATA:
				setAllSubdeviceErrorMessagesData((AllSubdeviceErrorMessagesData)null);
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
			case IbisDeviceManagementServicePackage.ALL_SUBDEVICE_ERROR_MESSAGES_RESPONSE__ALL_SUBDEVICE_ERROR_MESSAGES_DATA:
				return allSubdeviceErrorMessagesData != null;
		}
		return super.eIsSet(featureID);
	}

} //AllSubdeviceErrorMessagesResponseImpl
