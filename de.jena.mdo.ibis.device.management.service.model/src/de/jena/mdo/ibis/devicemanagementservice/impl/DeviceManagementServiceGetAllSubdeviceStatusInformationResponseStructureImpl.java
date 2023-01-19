/*
 */
package de.jena.mdo.ibis.devicemanagementservice.impl;

import de.jena.mdo.ibis.common.IBISIPString;

import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure;
import de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Management Service Get All Subdevice Status Information Response Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructureImpl#getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseData <em>Device Management Service Get All Subdevice Status Information Response Data</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructureImpl#getOperationErrorMessage <em>Operation Error Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructureImpl extends MinimalEObjectImpl.Container implements DeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure {
	/**
	 * The cached value of the '{@link #getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseData() <em>Device Management Service Get All Subdevice Status Information Response Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseData()
	 * @generated
	 * @ordered
	 */
	protected DeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure deviceManagementServiceGetAllSubdeviceStatusInformationResponseData;

	/**
	 * The cached value of the '{@link #getOperationErrorMessage() <em>Operation Error Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationErrorMessage()
	 * @generated
	 * @ordered
	 */
	protected IBISIPString operationErrorMessage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IBISDeviceManagementServicePackage.eINSTANCE.getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseData() {
		return deviceManagementServiceGetAllSubdeviceStatusInformationResponseData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceManagementServiceGetAllSubdeviceStatusInformationResponseData(DeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure newDeviceManagementServiceGetAllSubdeviceStatusInformationResponseData, NotificationChain msgs) {
		DeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure oldDeviceManagementServiceGetAllSubdeviceStatusInformationResponseData = deviceManagementServiceGetAllSubdeviceStatusInformationResponseData;
		deviceManagementServiceGetAllSubdeviceStatusInformationResponseData = newDeviceManagementServiceGetAllSubdeviceStatusInformationResponseData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_DATA, oldDeviceManagementServiceGetAllSubdeviceStatusInformationResponseData, newDeviceManagementServiceGetAllSubdeviceStatusInformationResponseData);
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
	public void setDeviceManagementServiceGetAllSubdeviceStatusInformationResponseData(DeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure newDeviceManagementServiceGetAllSubdeviceStatusInformationResponseData) {
		if (newDeviceManagementServiceGetAllSubdeviceStatusInformationResponseData != deviceManagementServiceGetAllSubdeviceStatusInformationResponseData) {
			NotificationChain msgs = null;
			if (deviceManagementServiceGetAllSubdeviceStatusInformationResponseData != null)
				msgs = ((InternalEObject)deviceManagementServiceGetAllSubdeviceStatusInformationResponseData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_DATA, null, msgs);
			if (newDeviceManagementServiceGetAllSubdeviceStatusInformationResponseData != null)
				msgs = ((InternalEObject)newDeviceManagementServiceGetAllSubdeviceStatusInformationResponseData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_DATA, null, msgs);
			msgs = basicSetDeviceManagementServiceGetAllSubdeviceStatusInformationResponseData(newDeviceManagementServiceGetAllSubdeviceStatusInformationResponseData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_DATA, newDeviceManagementServiceGetAllSubdeviceStatusInformationResponseData, newDeviceManagementServiceGetAllSubdeviceStatusInformationResponseData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPString getOperationErrorMessage() {
		return operationErrorMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationErrorMessage(IBISIPString newOperationErrorMessage, NotificationChain msgs) {
		IBISIPString oldOperationErrorMessage = operationErrorMessage;
		operationErrorMessage = newOperationErrorMessage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE, oldOperationErrorMessage, newOperationErrorMessage);
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
	public void setOperationErrorMessage(IBISIPString newOperationErrorMessage) {
		if (newOperationErrorMessage != operationErrorMessage) {
			NotificationChain msgs = null;
			if (operationErrorMessage != null)
				msgs = ((InternalEObject)operationErrorMessage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE, null, msgs);
			if (newOperationErrorMessage != null)
				msgs = ((InternalEObject)newOperationErrorMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE, null, msgs);
			msgs = basicSetOperationErrorMessage(newOperationErrorMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE, newOperationErrorMessage, newOperationErrorMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_DATA:
				return basicSetDeviceManagementServiceGetAllSubdeviceStatusInformationResponseData(null, msgs);
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE:
				return basicSetOperationErrorMessage(null, msgs);
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
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_DATA:
				return getDeviceManagementServiceGetAllSubdeviceStatusInformationResponseData();
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE:
				return getOperationErrorMessage();
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
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_DATA:
				setDeviceManagementServiceGetAllSubdeviceStatusInformationResponseData((DeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure)newValue);
				return;
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE:
				setOperationErrorMessage((IBISIPString)newValue);
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
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_DATA:
				setDeviceManagementServiceGetAllSubdeviceStatusInformationResponseData((DeviceManagementServiceGetAllSubdeviceStatusInformationResponseDataStructure)null);
				return;
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE:
				setOperationErrorMessage((IBISIPString)null);
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
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_DATA:
				return deviceManagementServiceGetAllSubdeviceStatusInformationResponseData != null;
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_ALL_SUBDEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE:
				return operationErrorMessage != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceManagementServiceGetAllSubdeviceStatusInformationResponseStructureImpl
