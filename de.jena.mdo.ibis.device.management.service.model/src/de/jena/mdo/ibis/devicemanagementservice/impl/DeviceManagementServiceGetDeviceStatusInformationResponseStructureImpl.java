/*
 */
package de.jena.mdo.ibis.devicemanagementservice.impl;

import de.jena.mdo.ibis.common.IBISIPString;

import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceStatusInformationResponseDataStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceStatusInformationResponseStructure;
import de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Management Service Get Device Status Information Response Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetDeviceStatusInformationResponseStructureImpl#getDeviceManagementServiceGetDeviceStatusInformationResponseData <em>Device Management Service Get Device Status Information Response Data</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetDeviceStatusInformationResponseStructureImpl#getOperationErrorMessage <em>Operation Error Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceManagementServiceGetDeviceStatusInformationResponseStructureImpl extends MinimalEObjectImpl.Container implements DeviceManagementServiceGetDeviceStatusInformationResponseStructure {
	/**
	 * The cached value of the '{@link #getDeviceManagementServiceGetDeviceStatusInformationResponseData() <em>Device Management Service Get Device Status Information Response Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceManagementServiceGetDeviceStatusInformationResponseData()
	 * @generated
	 * @ordered
	 */
	protected DeviceManagementServiceGetDeviceStatusInformationResponseDataStructure deviceManagementServiceGetDeviceStatusInformationResponseData;

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
	protected DeviceManagementServiceGetDeviceStatusInformationResponseStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IBISDeviceManagementServicePackage.eINSTANCE.getDeviceManagementServiceGetDeviceStatusInformationResponseStructure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceManagementServiceGetDeviceStatusInformationResponseDataStructure getDeviceManagementServiceGetDeviceStatusInformationResponseData() {
		return deviceManagementServiceGetDeviceStatusInformationResponseData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceManagementServiceGetDeviceStatusInformationResponseData(DeviceManagementServiceGetDeviceStatusInformationResponseDataStructure newDeviceManagementServiceGetDeviceStatusInformationResponseData, NotificationChain msgs) {
		DeviceManagementServiceGetDeviceStatusInformationResponseDataStructure oldDeviceManagementServiceGetDeviceStatusInformationResponseData = deviceManagementServiceGetDeviceStatusInformationResponseData;
		deviceManagementServiceGetDeviceStatusInformationResponseData = newDeviceManagementServiceGetDeviceStatusInformationResponseData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_DATA, oldDeviceManagementServiceGetDeviceStatusInformationResponseData, newDeviceManagementServiceGetDeviceStatusInformationResponseData);
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
	public void setDeviceManagementServiceGetDeviceStatusInformationResponseData(DeviceManagementServiceGetDeviceStatusInformationResponseDataStructure newDeviceManagementServiceGetDeviceStatusInformationResponseData) {
		if (newDeviceManagementServiceGetDeviceStatusInformationResponseData != deviceManagementServiceGetDeviceStatusInformationResponseData) {
			NotificationChain msgs = null;
			if (deviceManagementServiceGetDeviceStatusInformationResponseData != null)
				msgs = ((InternalEObject)deviceManagementServiceGetDeviceStatusInformationResponseData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_DATA, null, msgs);
			if (newDeviceManagementServiceGetDeviceStatusInformationResponseData != null)
				msgs = ((InternalEObject)newDeviceManagementServiceGetDeviceStatusInformationResponseData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_DATA, null, msgs);
			msgs = basicSetDeviceManagementServiceGetDeviceStatusInformationResponseData(newDeviceManagementServiceGetDeviceStatusInformationResponseData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_DATA, newDeviceManagementServiceGetDeviceStatusInformationResponseData, newDeviceManagementServiceGetDeviceStatusInformationResponseData));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE, oldOperationErrorMessage, newOperationErrorMessage);
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
				msgs = ((InternalEObject)operationErrorMessage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE, null, msgs);
			if (newOperationErrorMessage != null)
				msgs = ((InternalEObject)newOperationErrorMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE, null, msgs);
			msgs = basicSetOperationErrorMessage(newOperationErrorMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE, newOperationErrorMessage, newOperationErrorMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_DATA:
				return basicSetDeviceManagementServiceGetDeviceStatusInformationResponseData(null, msgs);
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE:
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
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_DATA:
				return getDeviceManagementServiceGetDeviceStatusInformationResponseData();
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE:
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
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_DATA:
				setDeviceManagementServiceGetDeviceStatusInformationResponseData((DeviceManagementServiceGetDeviceStatusInformationResponseDataStructure)newValue);
				return;
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE:
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
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_DATA:
				setDeviceManagementServiceGetDeviceStatusInformationResponseData((DeviceManagementServiceGetDeviceStatusInformationResponseDataStructure)null);
				return;
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE:
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
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_DATA:
				return deviceManagementServiceGetDeviceStatusInformationResponseData != null;
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_STATUS_INFORMATION_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE:
				return operationErrorMessage != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceManagementServiceGetDeviceStatusInformationResponseStructureImpl