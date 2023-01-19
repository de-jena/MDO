/*
 */
package de.jena.mdo.ibis.devicemanagementservice.impl;

import de.jena.mdo.ibis.common.IBISIPBoolean;
import de.jena.mdo.ibis.common.IBISIPInt;
import de.jena.mdo.ibis.common.IBISIPString;

import de.jena.mdo.ibis.devicemanagementservice.DeviceStatusStructure;
import de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage;

import de.jena.mdo.ibis.enumerations.DeviceStateEnumeration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Status Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceStatusStructureImpl#getDeviceStatusName <em>Device Status Name</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceStatusStructureImpl#getDeviceStatusFlag <em>Device Status Flag</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceStatusStructureImpl#getDeviceStatusImpact <em>Device Status Impact</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.impl.DeviceStatusStructureImpl#getDeviceStatusPriority <em>Device Status Priority</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceStatusStructureImpl extends MinimalEObjectImpl.Container implements DeviceStatusStructure {
	/**
	 * The cached value of the '{@link #getDeviceStatusName() <em>Device Status Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceStatusName()
	 * @generated
	 * @ordered
	 */
	protected IBISIPString deviceStatusName;

	/**
	 * The cached value of the '{@link #getDeviceStatusFlag() <em>Device Status Flag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceStatusFlag()
	 * @generated
	 * @ordered
	 */
	protected IBISIPBoolean deviceStatusFlag;

	/**
	 * The default value of the '{@link #getDeviceStatusImpact() <em>Device Status Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceStatusImpact()
	 * @generated
	 * @ordered
	 */
	protected static final DeviceStateEnumeration DEVICE_STATUS_IMPACT_EDEFAULT = DeviceStateEnumeration.DEFECTIVE;

	/**
	 * The cached value of the '{@link #getDeviceStatusImpact() <em>Device Status Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceStatusImpact()
	 * @generated
	 * @ordered
	 */
	protected DeviceStateEnumeration deviceStatusImpact = DEVICE_STATUS_IMPACT_EDEFAULT;

	/**
	 * This is true if the Device Status Impact attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deviceStatusImpactESet;

	/**
	 * The cached value of the '{@link #getDeviceStatusPriority() <em>Device Status Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceStatusPriority()
	 * @generated
	 * @ordered
	 */
	protected IBISIPInt deviceStatusPriority;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceStatusStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IBISDeviceManagementServicePackage.eINSTANCE.getDeviceStatusStructure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPString getDeviceStatusName() {
		return deviceStatusName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceStatusName(IBISIPString newDeviceStatusName, NotificationChain msgs) {
		IBISIPString oldDeviceStatusName = deviceStatusName;
		deviceStatusName = newDeviceStatusName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_STATUS_STRUCTURE__DEVICE_STATUS_NAME, oldDeviceStatusName, newDeviceStatusName);
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
	public void setDeviceStatusName(IBISIPString newDeviceStatusName) {
		if (newDeviceStatusName != deviceStatusName) {
			NotificationChain msgs = null;
			if (deviceStatusName != null)
				msgs = ((InternalEObject)deviceStatusName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_STATUS_STRUCTURE__DEVICE_STATUS_NAME, null, msgs);
			if (newDeviceStatusName != null)
				msgs = ((InternalEObject)newDeviceStatusName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_STATUS_STRUCTURE__DEVICE_STATUS_NAME, null, msgs);
			msgs = basicSetDeviceStatusName(newDeviceStatusName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_STATUS_STRUCTURE__DEVICE_STATUS_NAME, newDeviceStatusName, newDeviceStatusName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPBoolean getDeviceStatusFlag() {
		return deviceStatusFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceStatusFlag(IBISIPBoolean newDeviceStatusFlag, NotificationChain msgs) {
		IBISIPBoolean oldDeviceStatusFlag = deviceStatusFlag;
		deviceStatusFlag = newDeviceStatusFlag;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_STATUS_STRUCTURE__DEVICE_STATUS_FLAG, oldDeviceStatusFlag, newDeviceStatusFlag);
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
	public void setDeviceStatusFlag(IBISIPBoolean newDeviceStatusFlag) {
		if (newDeviceStatusFlag != deviceStatusFlag) {
			NotificationChain msgs = null;
			if (deviceStatusFlag != null)
				msgs = ((InternalEObject)deviceStatusFlag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_STATUS_STRUCTURE__DEVICE_STATUS_FLAG, null, msgs);
			if (newDeviceStatusFlag != null)
				msgs = ((InternalEObject)newDeviceStatusFlag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_STATUS_STRUCTURE__DEVICE_STATUS_FLAG, null, msgs);
			msgs = basicSetDeviceStatusFlag(newDeviceStatusFlag, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_STATUS_STRUCTURE__DEVICE_STATUS_FLAG, newDeviceStatusFlag, newDeviceStatusFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceStateEnumeration getDeviceStatusImpact() {
		return deviceStatusImpact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeviceStatusImpact(DeviceStateEnumeration newDeviceStatusImpact) {
		DeviceStateEnumeration oldDeviceStatusImpact = deviceStatusImpact;
		deviceStatusImpact = newDeviceStatusImpact == null ? DEVICE_STATUS_IMPACT_EDEFAULT : newDeviceStatusImpact;
		boolean oldDeviceStatusImpactESet = deviceStatusImpactESet;
		deviceStatusImpactESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_STATUS_STRUCTURE__DEVICE_STATUS_IMPACT, oldDeviceStatusImpact, deviceStatusImpact, !oldDeviceStatusImpactESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDeviceStatusImpact() {
		DeviceStateEnumeration oldDeviceStatusImpact = deviceStatusImpact;
		boolean oldDeviceStatusImpactESet = deviceStatusImpactESet;
		deviceStatusImpact = DEVICE_STATUS_IMPACT_EDEFAULT;
		deviceStatusImpactESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IBISDeviceManagementServicePackage.DEVICE_STATUS_STRUCTURE__DEVICE_STATUS_IMPACT, oldDeviceStatusImpact, DEVICE_STATUS_IMPACT_EDEFAULT, oldDeviceStatusImpactESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDeviceStatusImpact() {
		return deviceStatusImpactESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPInt getDeviceStatusPriority() {
		return deviceStatusPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceStatusPriority(IBISIPInt newDeviceStatusPriority, NotificationChain msgs) {
		IBISIPInt oldDeviceStatusPriority = deviceStatusPriority;
		deviceStatusPriority = newDeviceStatusPriority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_STATUS_STRUCTURE__DEVICE_STATUS_PRIORITY, oldDeviceStatusPriority, newDeviceStatusPriority);
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
	public void setDeviceStatusPriority(IBISIPInt newDeviceStatusPriority) {
		if (newDeviceStatusPriority != deviceStatusPriority) {
			NotificationChain msgs = null;
			if (deviceStatusPriority != null)
				msgs = ((InternalEObject)deviceStatusPriority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_STATUS_STRUCTURE__DEVICE_STATUS_PRIORITY, null, msgs);
			if (newDeviceStatusPriority != null)
				msgs = ((InternalEObject)newDeviceStatusPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.DEVICE_STATUS_STRUCTURE__DEVICE_STATUS_PRIORITY, null, msgs);
			msgs = basicSetDeviceStatusPriority(newDeviceStatusPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.DEVICE_STATUS_STRUCTURE__DEVICE_STATUS_PRIORITY, newDeviceStatusPriority, newDeviceStatusPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IBISDeviceManagementServicePackage.DEVICE_STATUS_STRUCTURE__DEVICE_STATUS_NAME:
				return basicSetDeviceStatusName(null, msgs);
			case IBISDeviceManagementServicePackage.DEVICE_STATUS_STRUCTURE__DEVICE_STATUS_FLAG:
				return basicSetDeviceStatusFlag(null, msgs);
			case IBISDeviceManagementServicePackage.DEVICE_STATUS_STRUCTURE__DEVICE_STATUS_PRIORITY:
				return basicSetDeviceStatusPriority(null, msgs);
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
			case IBISDeviceManagementServicePackage.DEVICE_STATUS_STRUCTURE__DEVICE_STATUS_NAME:
				return getDeviceStatusName();
			case IBISDeviceManagementServicePackage.DEVICE_STATUS_STRUCTURE__DEVICE_STATUS_FLAG:
				return getDeviceStatusFlag();
			case IBISDeviceManagementServicePackage.DEVICE_STATUS_STRUCTURE__DEVICE_STATUS_IMPACT:
				return getDeviceStatusImpact();
			case IBISDeviceManagementServicePackage.DEVICE_STATUS_STRUCTURE__DEVICE_STATUS_PRIORITY:
				return getDeviceStatusPriority();
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
			case IBISDeviceManagementServicePackage.DEVICE_STATUS_STRUCTURE__DEVICE_STATUS_NAME:
				setDeviceStatusName((IBISIPString)newValue);
				return;
			case IBISDeviceManagementServicePackage.DEVICE_STATUS_STRUCTURE__DEVICE_STATUS_FLAG:
				setDeviceStatusFlag((IBISIPBoolean)newValue);
				return;
			case IBISDeviceManagementServicePackage.DEVICE_STATUS_STRUCTURE__DEVICE_STATUS_IMPACT:
				setDeviceStatusImpact((DeviceStateEnumeration)newValue);
				return;
			case IBISDeviceManagementServicePackage.DEVICE_STATUS_STRUCTURE__DEVICE_STATUS_PRIORITY:
				setDeviceStatusPriority((IBISIPInt)newValue);
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
			case IBISDeviceManagementServicePackage.DEVICE_STATUS_STRUCTURE__DEVICE_STATUS_NAME:
				setDeviceStatusName((IBISIPString)null);
				return;
			case IBISDeviceManagementServicePackage.DEVICE_STATUS_STRUCTURE__DEVICE_STATUS_FLAG:
				setDeviceStatusFlag((IBISIPBoolean)null);
				return;
			case IBISDeviceManagementServicePackage.DEVICE_STATUS_STRUCTURE__DEVICE_STATUS_IMPACT:
				unsetDeviceStatusImpact();
				return;
			case IBISDeviceManagementServicePackage.DEVICE_STATUS_STRUCTURE__DEVICE_STATUS_PRIORITY:
				setDeviceStatusPriority((IBISIPInt)null);
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
			case IBISDeviceManagementServicePackage.DEVICE_STATUS_STRUCTURE__DEVICE_STATUS_NAME:
				return deviceStatusName != null;
			case IBISDeviceManagementServicePackage.DEVICE_STATUS_STRUCTURE__DEVICE_STATUS_FLAG:
				return deviceStatusFlag != null;
			case IBISDeviceManagementServicePackage.DEVICE_STATUS_STRUCTURE__DEVICE_STATUS_IMPACT:
				return isSetDeviceStatusImpact();
			case IBISDeviceManagementServicePackage.DEVICE_STATUS_STRUCTURE__DEVICE_STATUS_PRIORITY:
				return deviceStatusPriority != null;
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
		result.append(" (deviceStatusImpact: ");
		if (deviceStatusImpactESet) result.append(deviceStatusImpact); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DeviceStatusStructureImpl
