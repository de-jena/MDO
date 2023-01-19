/*
 */
package de.jena.mdo.ibis.devicemanagementservice.impl;

import de.jena.mdo.ibis.common.IBISIPString;

import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceInstallUpdateResponseStructure;
import de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage;
import de.jena.mdo.ibis.devicemanagementservice.UpdateAcceptEnumeration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Management Service Install Update Response Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceInstallUpdateResponseStructureImpl#getUpdateAccept <em>Update Accept</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceInstallUpdateResponseStructureImpl#getOperationErrorMessage <em>Operation Error Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceManagementServiceInstallUpdateResponseStructureImpl extends MinimalEObjectImpl.Container implements DeviceManagementServiceInstallUpdateResponseStructure {
	/**
	 * The default value of the '{@link #getUpdateAccept() <em>Update Accept</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateAccept()
	 * @generated
	 * @ordered
	 */
	protected static final UpdateAcceptEnumeration UPDATE_ACCEPT_EDEFAULT = UpdateAcceptEnumeration.UPDATE_ACCEPTED;

	/**
	 * The cached value of the '{@link #getUpdateAccept() <em>Update Accept</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateAccept()
	 * @generated
	 * @ordered
	 */
	protected UpdateAcceptEnumeration updateAccept = UPDATE_ACCEPT_EDEFAULT;

	/**
	 * This is true if the Update Accept attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean updateAcceptESet;

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
	protected DeviceManagementServiceInstallUpdateResponseStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IBISDeviceManagementServicePackage.eINSTANCE.getDeviceManagementServiceInstallUpdateResponseStructure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpdateAcceptEnumeration getUpdateAccept() {
		return updateAccept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdateAccept(UpdateAcceptEnumeration newUpdateAccept) {
		UpdateAcceptEnumeration oldUpdateAccept = updateAccept;
		updateAccept = newUpdateAccept == null ? UPDATE_ACCEPT_EDEFAULT : newUpdateAccept;
		boolean oldUpdateAcceptESet = updateAcceptESet;
		updateAcceptESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_RESPONSE_STRUCTURE__UPDATE_ACCEPT, oldUpdateAccept, updateAccept, !oldUpdateAcceptESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetUpdateAccept() {
		UpdateAcceptEnumeration oldUpdateAccept = updateAccept;
		boolean oldUpdateAcceptESet = updateAcceptESet;
		updateAccept = UPDATE_ACCEPT_EDEFAULT;
		updateAcceptESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_RESPONSE_STRUCTURE__UPDATE_ACCEPT, oldUpdateAccept, UPDATE_ACCEPT_EDEFAULT, oldUpdateAcceptESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetUpdateAccept() {
		return updateAcceptESet;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE, oldOperationErrorMessage, newOperationErrorMessage);
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
				msgs = ((InternalEObject)operationErrorMessage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE, null, msgs);
			if (newOperationErrorMessage != null)
				msgs = ((InternalEObject)newOperationErrorMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE, null, msgs);
			msgs = basicSetOperationErrorMessage(newOperationErrorMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE, newOperationErrorMessage, newOperationErrorMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE:
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
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_RESPONSE_STRUCTURE__UPDATE_ACCEPT:
				return getUpdateAccept();
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE:
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
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_RESPONSE_STRUCTURE__UPDATE_ACCEPT:
				setUpdateAccept((UpdateAcceptEnumeration)newValue);
				return;
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE:
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
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_RESPONSE_STRUCTURE__UPDATE_ACCEPT:
				unsetUpdateAccept();
				return;
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE:
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
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_RESPONSE_STRUCTURE__UPDATE_ACCEPT:
				return isSetUpdateAccept();
			case IBISDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE:
				return operationErrorMessage != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (updateAccept: ");
		if (updateAcceptESet) result.append(updateAccept); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DeviceManagementServiceInstallUpdateResponseStructureImpl
