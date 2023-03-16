/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice.impl;

import de.jena.mdo.ibis.ibis_common.impl.GeneralResponseImpl;

import de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage;
import de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistory;
import de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistoryResponse;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update History Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.UpdateHistoryResponseImpl#getUpdateHistory <em>Update History</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UpdateHistoryResponseImpl extends GeneralResponseImpl implements UpdateHistoryResponse {
	/**
	 * The cached value of the '{@link #getUpdateHistory() <em>Update History</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateHistory()
	 * @generated
	 * @ordered
	 */
	protected UpdateHistory updateHistory;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateHistoryResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisDeviceManagementServicePackage.Literals.UPDATE_HISTORY_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpdateHistory getUpdateHistory() {
		return updateHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdateHistory(UpdateHistory newUpdateHistory, NotificationChain msgs) {
		UpdateHistory oldUpdateHistory = updateHistory;
		updateHistory = newUpdateHistory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.UPDATE_HISTORY_RESPONSE__UPDATE_HISTORY, oldUpdateHistory, newUpdateHistory);
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
	public void setUpdateHistory(UpdateHistory newUpdateHistory) {
		if (newUpdateHistory != updateHistory) {
			NotificationChain msgs = null;
			if (updateHistory != null)
				msgs = ((InternalEObject)updateHistory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.UPDATE_HISTORY_RESPONSE__UPDATE_HISTORY, null, msgs);
			if (newUpdateHistory != null)
				msgs = ((InternalEObject)newUpdateHistory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.UPDATE_HISTORY_RESPONSE__UPDATE_HISTORY, null, msgs);
			msgs = basicSetUpdateHistory(newUpdateHistory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.UPDATE_HISTORY_RESPONSE__UPDATE_HISTORY, newUpdateHistory, newUpdateHistory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisDeviceManagementServicePackage.UPDATE_HISTORY_RESPONSE__UPDATE_HISTORY:
				return basicSetUpdateHistory(null, msgs);
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
			case IbisDeviceManagementServicePackage.UPDATE_HISTORY_RESPONSE__UPDATE_HISTORY:
				return getUpdateHistory();
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
			case IbisDeviceManagementServicePackage.UPDATE_HISTORY_RESPONSE__UPDATE_HISTORY:
				setUpdateHistory((UpdateHistory)newValue);
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
			case IbisDeviceManagementServicePackage.UPDATE_HISTORY_RESPONSE__UPDATE_HISTORY:
				setUpdateHistory((UpdateHistory)null);
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
			case IbisDeviceManagementServicePackage.UPDATE_HISTORY_RESPONSE__UPDATE_HISTORY:
				return updateHistory != null;
		}
		return super.eIsSet(featureID);
	}

} //UpdateHistoryResponseImpl
