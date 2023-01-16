/*
 */
package de.jena.mdo.ibis.common.impl;

import de.jena.mdo.ibis.common.DeviceSpecificationStructure;
import de.jena.mdo.ibis.common.IBISIPNMTOKEN;
import de.jena.mdo.ibis.common.IbisCommonPackage;

import de.jena.mdo.ibis.enumerations.DeviceClassEnumeration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Specification Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DeviceSpecificationStructureImpl#getDeviceClass <em>Device Class</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DeviceSpecificationStructureImpl#getDeviceID <em>Device ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceSpecificationStructureImpl extends MinimalEObjectImpl.Container implements DeviceSpecificationStructure {
	/**
	 * The default value of the '{@link #getDeviceClass() <em>Device Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceClass()
	 * @generated
	 * @ordered
	 */
	protected static final DeviceClassEnumeration DEVICE_CLASS_EDEFAULT = DeviceClassEnumeration.ON_BOARD_UNIT;

	/**
	 * The cached value of the '{@link #getDeviceClass() <em>Device Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceClass()
	 * @generated
	 * @ordered
	 */
	protected DeviceClassEnumeration deviceClass = DEVICE_CLASS_EDEFAULT;

	/**
	 * This is true if the Device Class attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deviceClassESet;

	/**
	 * The cached value of the '{@link #getDeviceID() <em>Device ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceID()
	 * @generated
	 * @ordered
	 */
	protected IBISIPNMTOKEN deviceID;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceSpecificationStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.eINSTANCE.getDeviceSpecificationStructure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceClassEnumeration getDeviceClass() {
		return deviceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeviceClass(DeviceClassEnumeration newDeviceClass) {
		DeviceClassEnumeration oldDeviceClass = deviceClass;
		deviceClass = newDeviceClass == null ? DEVICE_CLASS_EDEFAULT : newDeviceClass;
		boolean oldDeviceClassESet = deviceClassESet;
		deviceClassESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DEVICE_SPECIFICATION_STRUCTURE__DEVICE_CLASS, oldDeviceClass, deviceClass, !oldDeviceClassESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDeviceClass() {
		DeviceClassEnumeration oldDeviceClass = deviceClass;
		boolean oldDeviceClassESet = deviceClassESet;
		deviceClass = DEVICE_CLASS_EDEFAULT;
		deviceClassESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IbisCommonPackage.DEVICE_SPECIFICATION_STRUCTURE__DEVICE_CLASS, oldDeviceClass, DEVICE_CLASS_EDEFAULT, oldDeviceClassESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDeviceClass() {
		return deviceClassESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPNMTOKEN getDeviceID() {
		return deviceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceID(IBISIPNMTOKEN newDeviceID, NotificationChain msgs) {
		IBISIPNMTOKEN oldDeviceID = deviceID;
		deviceID = newDeviceID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DEVICE_SPECIFICATION_STRUCTURE__DEVICE_ID, oldDeviceID, newDeviceID);
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
	public void setDeviceID(IBISIPNMTOKEN newDeviceID) {
		if (newDeviceID != deviceID) {
			NotificationChain msgs = null;
			if (deviceID != null)
				msgs = ((InternalEObject)deviceID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DEVICE_SPECIFICATION_STRUCTURE__DEVICE_ID, null, msgs);
			if (newDeviceID != null)
				msgs = ((InternalEObject)newDeviceID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DEVICE_SPECIFICATION_STRUCTURE__DEVICE_ID, null, msgs);
			msgs = basicSetDeviceID(newDeviceID, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DEVICE_SPECIFICATION_STRUCTURE__DEVICE_ID, newDeviceID, newDeviceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.DEVICE_SPECIFICATION_STRUCTURE__DEVICE_ID:
				return basicSetDeviceID(null, msgs);
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
			case IbisCommonPackage.DEVICE_SPECIFICATION_STRUCTURE__DEVICE_CLASS:
				return getDeviceClass();
			case IbisCommonPackage.DEVICE_SPECIFICATION_STRUCTURE__DEVICE_ID:
				return getDeviceID();
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
			case IbisCommonPackage.DEVICE_SPECIFICATION_STRUCTURE__DEVICE_CLASS:
				setDeviceClass((DeviceClassEnumeration)newValue);
				return;
			case IbisCommonPackage.DEVICE_SPECIFICATION_STRUCTURE__DEVICE_ID:
				setDeviceID((IBISIPNMTOKEN)newValue);
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
			case IbisCommonPackage.DEVICE_SPECIFICATION_STRUCTURE__DEVICE_CLASS:
				unsetDeviceClass();
				return;
			case IbisCommonPackage.DEVICE_SPECIFICATION_STRUCTURE__DEVICE_ID:
				setDeviceID((IBISIPNMTOKEN)null);
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
			case IbisCommonPackage.DEVICE_SPECIFICATION_STRUCTURE__DEVICE_CLASS:
				return isSetDeviceClass();
			case IbisCommonPackage.DEVICE_SPECIFICATION_STRUCTURE__DEVICE_ID:
				return deviceID != null;
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
		result.append(" (deviceClass: ");
		if (deviceClassESet) result.append(deviceClass); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DeviceSpecificationStructureImpl
