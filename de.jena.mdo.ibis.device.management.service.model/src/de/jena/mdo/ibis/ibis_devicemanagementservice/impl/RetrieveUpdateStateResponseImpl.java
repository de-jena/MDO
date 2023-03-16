/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice.impl;

import de.jena.mdo.ibis.ibis_common.impl.GeneralResponseImpl;

import de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage;
import de.jena.mdo.ibis.ibis_devicemanagementservice.RetrieveUpdateStateResponse;
import de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateStateData;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Retrieve Update State Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.RetrieveUpdateStateResponseImpl#getUpdateStateData <em>Update State Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RetrieveUpdateStateResponseImpl extends GeneralResponseImpl implements RetrieveUpdateStateResponse {
	/**
	 * The cached value of the '{@link #getUpdateStateData() <em>Update State Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateStateData()
	 * @generated
	 * @ordered
	 */
	protected UpdateStateData updateStateData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RetrieveUpdateStateResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisDeviceManagementServicePackage.Literals.RETRIEVE_UPDATE_STATE_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpdateStateData getUpdateStateData() {
		return updateStateData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdateStateData(UpdateStateData newUpdateStateData, NotificationChain msgs) {
		UpdateStateData oldUpdateStateData = updateStateData;
		updateStateData = newUpdateStateData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.RETRIEVE_UPDATE_STATE_RESPONSE__UPDATE_STATE_DATA, oldUpdateStateData, newUpdateStateData);
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
	public void setUpdateStateData(UpdateStateData newUpdateStateData) {
		if (newUpdateStateData != updateStateData) {
			NotificationChain msgs = null;
			if (updateStateData != null)
				msgs = ((InternalEObject)updateStateData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.RETRIEVE_UPDATE_STATE_RESPONSE__UPDATE_STATE_DATA, null, msgs);
			if (newUpdateStateData != null)
				msgs = ((InternalEObject)newUpdateStateData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.RETRIEVE_UPDATE_STATE_RESPONSE__UPDATE_STATE_DATA, null, msgs);
			msgs = basicSetUpdateStateData(newUpdateStateData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.RETRIEVE_UPDATE_STATE_RESPONSE__UPDATE_STATE_DATA, newUpdateStateData, newUpdateStateData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisDeviceManagementServicePackage.RETRIEVE_UPDATE_STATE_RESPONSE__UPDATE_STATE_DATA:
				return basicSetUpdateStateData(null, msgs);
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
			case IbisDeviceManagementServicePackage.RETRIEVE_UPDATE_STATE_RESPONSE__UPDATE_STATE_DATA:
				return getUpdateStateData();
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
			case IbisDeviceManagementServicePackage.RETRIEVE_UPDATE_STATE_RESPONSE__UPDATE_STATE_DATA:
				setUpdateStateData((UpdateStateData)newValue);
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
			case IbisDeviceManagementServicePackage.RETRIEVE_UPDATE_STATE_RESPONSE__UPDATE_STATE_DATA:
				setUpdateStateData((UpdateStateData)null);
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
			case IbisDeviceManagementServicePackage.RETRIEVE_UPDATE_STATE_RESPONSE__UPDATE_STATE_DATA:
				return updateStateData != null;
		}
		return super.eIsSet(featureID);
	}

} //RetrieveUpdateStateResponseImpl
