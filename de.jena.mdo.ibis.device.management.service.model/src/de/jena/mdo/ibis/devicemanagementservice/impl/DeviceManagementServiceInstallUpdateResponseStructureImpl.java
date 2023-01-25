/*
 */
package de.jena.mdo.ibis.devicemanagementservice.impl;

import de.jena.mdo.ibis.common.impl.GeneralResponseStructureImpl;

import de.jena.mdo.ibis.devicemanagementservice.DeviceManagementServiceInstallUpdateResponseStructure;
import de.jena.mdo.ibis.devicemanagementservice.IbisDeviceManagementServicePackage;
import de.jena.mdo.ibis.devicemanagementservice.UpdateAcceptEnumeration;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Management Service Install Update Response Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceManagementServiceInstallUpdateResponseStructureImpl#getUpdateAccept <em>Update Accept</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceManagementServiceInstallUpdateResponseStructureImpl extends GeneralResponseStructureImpl implements DeviceManagementServiceInstallUpdateResponseStructure {
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
		return IbisDeviceManagementServicePackage.Literals.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_RESPONSE_STRUCTURE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_RESPONSE_STRUCTURE__UPDATE_ACCEPT, oldUpdateAccept, updateAccept, !oldUpdateAcceptESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_RESPONSE_STRUCTURE__UPDATE_ACCEPT, oldUpdateAccept, UPDATE_ACCEPT_EDEFAULT, oldUpdateAcceptESet));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_RESPONSE_STRUCTURE__UPDATE_ACCEPT:
				return getUpdateAccept();
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
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_RESPONSE_STRUCTURE__UPDATE_ACCEPT:
				setUpdateAccept((UpdateAcceptEnumeration)newValue);
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
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_RESPONSE_STRUCTURE__UPDATE_ACCEPT:
				unsetUpdateAccept();
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
			case IbisDeviceManagementServicePackage.DEVICE_MANAGEMENT_SERVICE_INSTALL_UPDATE_RESPONSE_STRUCTURE__UPDATE_ACCEPT:
				return isSetUpdateAccept();
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
