/*
 */
package de.jena.mdo.ibis.ibis_common.impl;

import de.jena.mdo.ibis.ibis_common.DeviceSpecification;
import de.jena.mdo.ibis.ibis_common.DeviceSpecificationList;
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
 * An implementation of the model object '<em><b>Device Specification List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.DeviceSpecificationListImpl#getDeviceSpecification <em>Device Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceSpecificationListImpl extends MinimalEObjectImpl.Container implements DeviceSpecificationList {
	/**
	 * The cached value of the '{@link #getDeviceSpecification() <em>Device Specification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceSpecification()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceSpecification> deviceSpecification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceSpecificationListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.Literals.DEVICE_SPECIFICATION_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeviceSpecification> getDeviceSpecification() {
		if (deviceSpecification == null) {
			deviceSpecification = new EObjectContainmentEList<DeviceSpecification>(DeviceSpecification.class, this, IbisCommonPackage.DEVICE_SPECIFICATION_LIST__DEVICE_SPECIFICATION);
		}
		return deviceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.DEVICE_SPECIFICATION_LIST__DEVICE_SPECIFICATION:
				return ((InternalEList<?>)getDeviceSpecification()).basicRemove(otherEnd, msgs);
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
			case IbisCommonPackage.DEVICE_SPECIFICATION_LIST__DEVICE_SPECIFICATION:
				return getDeviceSpecification();
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
			case IbisCommonPackage.DEVICE_SPECIFICATION_LIST__DEVICE_SPECIFICATION:
				getDeviceSpecification().clear();
				getDeviceSpecification().addAll((Collection<? extends DeviceSpecification>)newValue);
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
			case IbisCommonPackage.DEVICE_SPECIFICATION_LIST__DEVICE_SPECIFICATION:
				getDeviceSpecification().clear();
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
			case IbisCommonPackage.DEVICE_SPECIFICATION_LIST__DEVICE_SPECIFICATION:
				return deviceSpecification != null && !deviceSpecification.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeviceSpecificationListImpl
