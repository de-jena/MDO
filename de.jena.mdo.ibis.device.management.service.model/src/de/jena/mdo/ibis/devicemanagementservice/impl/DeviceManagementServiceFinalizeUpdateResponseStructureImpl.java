/*
 */
package de.jena.mdo.ibis.devicemanagementservice.impl;

import de.jena.mdo.ibis.common.impl.GeneralResponseStructureImpl;

import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceFinalizeUpdateResponseStructure;
import de.jena.mdo.ibis.devicemanagementservice.IbisDeviceManagementServicePackage;
import de.jena.mdo.ibis.devicemanagementservice.UpdateStatusEnumeration;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Management Service Finalize Update Response Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceFinalizeUpdateResponseStructureImpl#getUpdateStatus <em>Update Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceManagementServiceFinalizeUpdateResponseStructureImpl extends GeneralResponseStructureImpl implements DeviceManagementServiceFinalizeUpdateResponseStructure {
	/**
	 * The default value of the '{@link #getUpdateStatus() <em>Update Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateStatus()
	 * @generated
	 * @ordered
	 */
	protected static final UpdateStatusEnumeration UPDATE_STATUS_EDEFAULT = UpdateStatusEnumeration.UPDATE_RUNNING;

	/**
	 * The cached value of the '{@link #getUpdateStatus() <em>Update Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateStatus()
	 * @generated
	 * @ordered
	 */
	protected UpdateStatusEnumeration updateStatus = UPDATE_STATUS_EDEFAULT;

	/**
	 * This is true if the Update Status attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean updateStatusESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceManagementServiceFinalizeUpdateResponseStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisDeviceManagementServicePackage.Literals.DEVICE_MANAGEMENT_SERVICE_FINALIZE_UPDATE_RESPONSE_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpdateStatusEnumeration getUpdateStatus() {
		return updateStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdateStatus(UpdateStatusEnumeration newUpdateStatus) {
		UpdateStatusEnumeration oldUpdateStatus = updateStatus;
		updateStatus = newUpdateStatus == null ? UPDATE_STATUS_EDEFAULT : newUpdateStatus;
		boolean oldUpdateStatusESet = updateStatusESet;
		updateStatusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_FINALIZE_UPDATE_RESPONSE_STRUCTURE__UPDATE_STATUS, oldUpdateStatus, updateStatus, !oldUpdateStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetUpdateStatus() {
		UpdateStatusEnumeration oldUpdateStatus = updateStatus;
		boolean oldUpdateStatusESet = updateStatusESet;
		updateStatus = UPDATE_STATUS_EDEFAULT;
		updateStatusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_FINALIZE_UPDATE_RESPONSE_STRUCTURE__UPDATE_STATUS, oldUpdateStatus, UPDATE_STATUS_EDEFAULT, oldUpdateStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetUpdateStatus() {
		return updateStatusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_FINALIZE_UPDATE_RESPONSE_STRUCTURE__UPDATE_STATUS:
				return getUpdateStatus();
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
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_FINALIZE_UPDATE_RESPONSE_STRUCTURE__UPDATE_STATUS:
				setUpdateStatus((UpdateStatusEnumeration)newValue);
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
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_FINALIZE_UPDATE_RESPONSE_STRUCTURE__UPDATE_STATUS:
				unsetUpdateStatus();
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
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_FINALIZE_UPDATE_RESPONSE_STRUCTURE__UPDATE_STATUS:
				return isSetUpdateStatus();
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
		result.append(" (updateStatus: ");
		if (updateStatusESet) result.append(updateStatus); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DeviceManagementServiceFinalizeUpdateResponseStructureImpl
