/*
 */
package de.jena.mdo.ibis.common.impl;

import de.jena.mdo.ibis.common.DeviceSpecificationListStructure;
import de.jena.mdo.ibis.common.DeviceSpecificationStructure;
import de.jena.mdo.ibis.common.IbisCommonPackage;

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
 * An implementation of the model object '<em><b>Device Specification List Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DeviceSpecificationListStructureImpl#getDeviceSpecification <em>Device Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceSpecificationListStructureImpl extends MinimalEObjectImpl.Container implements DeviceSpecificationListStructure {
	/**
	 * The cached value of the '{@link #getDeviceSpecification() <em>Device Specification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceSpecification()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceSpecificationStructure> deviceSpecification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceSpecificationListStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.eINSTANCE.getDeviceSpecificationListStructure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeviceSpecificationStructure> getDeviceSpecification() {
		if (deviceSpecification == null) {
			deviceSpecification = new EObjectContainmentEList<DeviceSpecificationStructure>(DeviceSpecificationStructure.class, this, IbisCommonPackage.DEVICE_SPECIFICATION_LIST_STRUCTURE__DEVICE_SPECIFICATION);
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
			case IbisCommonPackage.DEVICE_SPECIFICATION_LIST_STRUCTURE__DEVICE_SPECIFICATION:
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
			case IbisCommonPackage.DEVICE_SPECIFICATION_LIST_STRUCTURE__DEVICE_SPECIFICATION:
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
			case IbisCommonPackage.DEVICE_SPECIFICATION_LIST_STRUCTURE__DEVICE_SPECIFICATION:
				getDeviceSpecification().clear();
				getDeviceSpecification().addAll((Collection<? extends DeviceSpecificationStructure>)newValue);
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
			case IbisCommonPackage.DEVICE_SPECIFICATION_LIST_STRUCTURE__DEVICE_SPECIFICATION:
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
			case IbisCommonPackage.DEVICE_SPECIFICATION_LIST_STRUCTURE__DEVICE_SPECIFICATION:
				return deviceSpecification != null && !deviceSpecification.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeviceSpecificationListStructureImpl
