/*
 */
package de.jena.mdo.ibis.devicemanagementservice.impl;

import de.jena.mdo.ibis.common.IBISIPString;

import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceGetUpdateHistoryResponseStructure;
import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceUpdateHistoryStructure;
import de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Management Service Get Update History Response Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetUpdateHistoryResponseStructureImpl#getUpdateHistory <em>Update History</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceGetUpdateHistoryResponseStructureImpl#getOperationErrorMessage <em>Operation Error Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceManagementServiceGetUpdateHistoryResponseStructureImpl extends MinimalEObjectImpl.Container implements DeviceManagementServiceGetUpdateHistoryResponseStructure {
	/**
	 * The cached value of the '{@link #getUpdateHistory() <em>Update History</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateHistory()
	 * @generated
	 * @ordered
	 */
	protected DeviceManagementServiceUpdateHistoryStructure updateHistory;

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
	protected DeviceManagementServiceGetUpdateHistoryResponseStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IBISDeviceManagementServicePackage.eINSTANCE.getDeviceManagementServiceGetUpdateHistoryResponseStructure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceManagementServiceUpdateHistoryStructure getUpdateHistory() {
		return updateHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdateHistory(DeviceManagementServiceUpdateHistoryStructure newUpdateHistory, NotificationChain msgs) {
		DeviceManagementServiceUpdateHistoryStructure oldUpdateHistory = updateHistory;
		updateHistory = newUpdateHistory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_UPDATE_HISTORY_RESPONSE_STRUCTURE__UPDATE_HISTORY, oldUpdateHistory, newUpdateHistory);
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
	public void setUpdateHistory(DeviceManagementServiceUpdateHistoryStructure newUpdateHistory) {
		if (newUpdateHistory != updateHistory) {
			NotificationChain msgs = null;
			if (updateHistory != null)
				msgs = ((InternalEObject)updateHistory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_UPDATE_HISTORY_RESPONSE_STRUCTURE__UPDATE_HISTORY, null, msgs);
			if (newUpdateHistory != null)
				msgs = ((InternalEObject)newUpdateHistory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_UPDATE_HISTORY_RESPONSE_STRUCTURE__UPDATE_HISTORY, null, msgs);
			msgs = basicSetUpdateHistory(newUpdateHistory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_UPDATE_HISTORY_RESPONSE_STRUCTURE__UPDATE_HISTORY, newUpdateHistory, newUpdateHistory));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_UPDATE_HISTORY_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE, oldOperationErrorMessage, newOperationErrorMessage);
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
				msgs = ((InternalEObject)operationErrorMessage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_UPDATE_HISTORY_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE, null, msgs);
			if (newOperationErrorMessage != null)
				msgs = ((InternalEObject)newOperationErrorMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_UPDATE_HISTORY_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE, null, msgs);
			msgs = basicSetOperationErrorMessage(newOperationErrorMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_UPDATE_HISTORY_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE, newOperationErrorMessage, newOperationErrorMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_UPDATE_HISTORY_RESPONSE_STRUCTURE__UPDATE_HISTORY:
				return basicSetUpdateHistory(null, msgs);
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_UPDATE_HISTORY_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE:
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
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_UPDATE_HISTORY_RESPONSE_STRUCTURE__UPDATE_HISTORY:
				return getUpdateHistory();
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_UPDATE_HISTORY_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE:
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
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_UPDATE_HISTORY_RESPONSE_STRUCTURE__UPDATE_HISTORY:
				setUpdateHistory((DeviceManagementServiceUpdateHistoryStructure)newValue);
				return;
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_UPDATE_HISTORY_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE:
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
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_UPDATE_HISTORY_RESPONSE_STRUCTURE__UPDATE_HISTORY:
				setUpdateHistory((DeviceManagementServiceUpdateHistoryStructure)null);
				return;
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_UPDATE_HISTORY_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE:
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
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_UPDATE_HISTORY_RESPONSE_STRUCTURE__UPDATE_HISTORY:
				return updateHistory != null;
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_GET_UPDATE_HISTORY_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE:
				return operationErrorMessage != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceManagementServiceGetUpdateHistoryResponseStructureImpl
