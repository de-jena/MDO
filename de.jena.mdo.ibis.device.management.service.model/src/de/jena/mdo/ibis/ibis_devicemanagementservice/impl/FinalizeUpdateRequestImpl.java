/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice.impl;

import de.jena.mdo.ibis.ibis_common.IBISIPNMTOKEN;

import de.jena.mdo.ibis.ibis_devicemanagementservice.FinalizeUpdateRequest;
import de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Finalize Update Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.FinalizeUpdateRequestImpl#getUpdateID <em>Update ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FinalizeUpdateRequestImpl extends MinimalEObjectImpl.Container implements FinalizeUpdateRequest {
	/**
	 * The cached value of the '{@link #getUpdateID() <em>Update ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateID()
	 * @generated
	 * @ordered
	 */
	protected IBISIPNMTOKEN updateID;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinalizeUpdateRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisDeviceManagementServicePackage.Literals.FINALIZE_UPDATE_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPNMTOKEN getUpdateID() {
		return updateID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdateID(IBISIPNMTOKEN newUpdateID, NotificationChain msgs) {
		IBISIPNMTOKEN oldUpdateID = updateID;
		updateID = newUpdateID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.FINALIZE_UPDATE_REQUEST__UPDATE_ID, oldUpdateID, newUpdateID);
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
	public void setUpdateID(IBISIPNMTOKEN newUpdateID) {
		if (newUpdateID != updateID) {
			NotificationChain msgs = null;
			if (updateID != null)
				msgs = ((InternalEObject)updateID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.FINALIZE_UPDATE_REQUEST__UPDATE_ID, null, msgs);
			if (newUpdateID != null)
				msgs = ((InternalEObject)newUpdateID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisDeviceManagementServicePackage.FINALIZE_UPDATE_REQUEST__UPDATE_ID, null, msgs);
			msgs = basicSetUpdateID(newUpdateID, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisDeviceManagementServicePackage.FINALIZE_UPDATE_REQUEST__UPDATE_ID, newUpdateID, newUpdateID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisDeviceManagementServicePackage.FINALIZE_UPDATE_REQUEST__UPDATE_ID:
				return basicSetUpdateID(null, msgs);
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
			case IbisDeviceManagementServicePackage.FINALIZE_UPDATE_REQUEST__UPDATE_ID:
				return getUpdateID();
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
			case IbisDeviceManagementServicePackage.FINALIZE_UPDATE_REQUEST__UPDATE_ID:
				setUpdateID((IBISIPNMTOKEN)newValue);
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
			case IbisDeviceManagementServicePackage.FINALIZE_UPDATE_REQUEST__UPDATE_ID:
				setUpdateID((IBISIPNMTOKEN)null);
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
			case IbisDeviceManagementServicePackage.FINALIZE_UPDATE_REQUEST__UPDATE_ID:
				return updateID != null;
		}
		return super.eIsSet(featureID);
	}

} //FinalizeUpdateRequestImpl
