/*
 */
package de.jena.mdo.ibis.ibis_common.impl;

import de.jena.mdo.ibis.ibis_common.DeviceSpecificationWithState;
import de.jena.mdo.ibis.ibis_common.DeviceSpecificationWithStateList;
import de.jena.mdo.ibis.ibis_common.IbisCommonPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Specification With State List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.DeviceSpecificationWithStateListImpl#getDeviceSpecificationWithState <em>Device Specification With State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceSpecificationWithStateListImpl extends MinimalEObjectImpl.Container implements DeviceSpecificationWithStateList {
	/**
	 * The cached value of the '{@link #getDeviceSpecificationWithState() <em>Device Specification With State</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceSpecificationWithState()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceSpecificationWithState> deviceSpecificationWithState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceSpecificationWithStateListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.Literals.DEVICE_SPECIFICATION_WITH_STATE_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeviceSpecificationWithState> getDeviceSpecificationWithState() {
		if (deviceSpecificationWithState == null) {
			deviceSpecificationWithState = new EObjectContainmentEList<DeviceSpecificationWithState>(DeviceSpecificationWithState.class, this, IbisCommonPackage.DEVICE_SPECIFICATION_WITH_STATE_LIST__DEVICE_SPECIFICATION_WITH_STATE);
		}
		return deviceSpecificationWithState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.DEVICE_SPECIFICATION_WITH_STATE_LIST__DEVICE_SPECIFICATION_WITH_STATE:
				return ((InternalEList<?>)getDeviceSpecificationWithState()).basicRemove(otherEnd, msgs);
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
			case IbisCommonPackage.DEVICE_SPECIFICATION_WITH_STATE_LIST__DEVICE_SPECIFICATION_WITH_STATE:
				return getDeviceSpecificationWithState();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IbisCommonPackage.DEVICE_SPECIFICATION_WITH_STATE_LIST__DEVICE_SPECIFICATION_WITH_STATE:
				getDeviceSpecificationWithState().clear();
				getDeviceSpecificationWithState().addAll((Collection<? extends DeviceSpecificationWithState>)newValue);
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
			case IbisCommonPackage.DEVICE_SPECIFICATION_WITH_STATE_LIST__DEVICE_SPECIFICATION_WITH_STATE:
				getDeviceSpecificationWithState().clear();
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
			case IbisCommonPackage.DEVICE_SPECIFICATION_WITH_STATE_LIST__DEVICE_SPECIFICATION_WITH_STATE:
				return deviceSpecificationWithState != null && !deviceSpecificationWithState.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeviceSpecificationWithStateListImpl
