/*
 */
package de.jena.mdo.ibis.devicemanagementservice.impl;

import de.jena.mdo.ibis.common.IBISIPString;

import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceInformationResponseDataStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetDeviceInformationResponseStructure;
import de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Management Service Get Device Information Response Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetDeviceInformationResponseStructureImpl#getDeviceManagementServiceGetDeviceInformationResponseData <em>Device Management Service Get Device Information Response Data</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetDeviceInformationResponseStructureImpl#getOperationErrorMessage <em>Operation Error Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceManagementServiceGetDeviceInformationResponseStructureImpl extends MinimalEObjectImpl.Container implements DeviceManagementServiceGetDeviceInformationResponseStructure {
	/**
	 * The cached value of the '{@link #getDeviceManagementServiceGetDeviceInformationResponseData() <em>Device Management Service Get Device Information Response Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceManagementServiceGetDeviceInformationResponseData()
	 * @generated
	 * @ordered
	 */
	protected DeviceManagementServiceGetDeviceInformationResponseDataStructure deviceManagementServiceGetDeviceInformationResponseData;

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
	protected DeviceManagementServiceGetDeviceInformationResponseStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IBISDeviceManagementServicePackage.eINSTANCE.getDeviceManagementServiceGetDeviceInformationResponseStructure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceManagementServiceGetDeviceInformationResponseDataStructure getDeviceManagementServiceGetDeviceInformationResponseData() {
		return deviceManagementServiceGetDeviceInformationResponseData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceManagementServiceGetDeviceInformationResponseData(DeviceManagementServiceGetDeviceInformationResponseDataStructure newDeviceManagementServiceGetDeviceInformationResponseData, NotificationChain msgs) {
		DeviceManagementServiceGetDeviceInformationResponseDataStructure oldDeviceManagementServiceGetDeviceInformationResponseData = deviceManagementServiceGetDeviceInformationResponseData;
		deviceManagementServiceGetDeviceInformationResponseData = newDeviceManagementServiceGetDeviceInformationResponseData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_DATA, oldDeviceManagementServiceGetDeviceInformationResponseData, newDeviceManagementServiceGetDeviceInformationResponseData);
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
	public void setDeviceManagementServiceGetDeviceInformationResponseData(DeviceManagementServiceGetDeviceInformationResponseDataStructure newDeviceManagementServiceGetDeviceInformationResponseData) {
		if (newDeviceManagementServiceGetDeviceInformationResponseData != deviceManagementServiceGetDeviceInformationResponseData) {
			NotificationChain msgs = null;
			if (deviceManagementServiceGetDeviceInformationResponseData != null)
				msgs = ((InternalEObject)deviceManagementServiceGetDeviceInformationResponseData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_DATA, null, msgs);
			if (newDeviceManagementServiceGetDeviceInformationResponseData != null)
				msgs = ((InternalEObject)newDeviceManagementServiceGetDeviceInformationResponseData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_DATA, null, msgs);
			msgs = basicSetDeviceManagementServiceGetDeviceInformationResponseData(newDeviceManagementServiceGetDeviceInformationResponseData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_DATA, newDeviceManagementServiceGetDeviceInformationResponseData, newDeviceManagementServiceGetDeviceInformationResponseData));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE, oldOperationErrorMessage, newOperationErrorMessage);
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
				msgs = ((InternalEObject)operationErrorMessage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE, null, msgs);
			if (newOperationErrorMessage != null)
				msgs = ((InternalEObject)newOperationErrorMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE, null, msgs);
			msgs = basicSetOperationErrorMessage(newOperationErrorMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE, newOperationErrorMessage, newOperationErrorMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_DATA:
				return basicSetDeviceManagementServiceGetDeviceInformationResponseData(null, msgs);
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE:
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
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_DATA:
				return getDeviceManagementServiceGetDeviceInformationResponseData();
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE:
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
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_DATA:
				setDeviceManagementServiceGetDeviceInformationResponseData((DeviceManagementServiceGetDeviceInformationResponseDataStructure)newValue);
				return;
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE:
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
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_DATA:
				setDeviceManagementServiceGetDeviceInformationResponseData((DeviceManagementServiceGetDeviceInformationResponseDataStructure)null);
				return;
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE:
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
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_STRUCTURE__DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_DATA:
				return deviceManagementServiceGetDeviceInformationResponseData != null;
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_DEVICE_INFORMATION_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE:
				return operationErrorMessage != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceManagementServiceGetDeviceInformationResponseStructureImpl
