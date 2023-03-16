/*
 */
package de.jena.mdo.ibis.ibis_common.impl;

import de.jena.mdo.ibis.ibis_common.DeviceSpecification;
import de.jena.mdo.ibis.ibis_common.DeviceSpecificationWithState;
import de.jena.mdo.ibis.ibis_common.IbisCommonPackage;

import de.jena.mdo.ibis.ibis_enumerations.DeviceStateEnumeration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Specification With State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.DeviceSpecificationWithStateImpl#getDeviceSpecification <em>Device Specification</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.DeviceSpecificationWithStateImpl#getDeviceState <em>Device State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceSpecificationWithStateImpl extends MinimalEObjectImpl.Container implements DeviceSpecificationWithState {
	/**
	 * The cached value of the '{@link #getDeviceSpecification() <em>Device Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceSpecification()
	 * @generated
	 * @ordered
	 */
	protected DeviceSpecification deviceSpecification;

	/**
	 * The default value of the '{@link #getDeviceState() <em>Device State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceState()
	 * @generated
	 * @ordered
	 */
	protected static final DeviceStateEnumeration DEVICE_STATE_EDEFAULT = DeviceStateEnumeration.DEFECTIVE;

	/**
	 * The cached value of the '{@link #getDeviceState() <em>Device State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceState()
	 * @generated
	 * @ordered
	 */
	protected DeviceStateEnumeration deviceState = DEVICE_STATE_EDEFAULT;

	/**
	 * This is true if the Device State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deviceStateESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceSpecificationWithStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.Literals.DEVICE_SPECIFICATION_WITH_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceSpecification getDeviceSpecification() {
		return deviceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceSpecification(DeviceSpecification newDeviceSpecification, NotificationChain msgs) {
		DeviceSpecification oldDeviceSpecification = deviceSpecification;
		deviceSpecification = newDeviceSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DEVICE_SPECIFICATION_WITH_STATE__DEVICE_SPECIFICATION, oldDeviceSpecification, newDeviceSpecification);
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
	public void setDeviceSpecification(DeviceSpecification newDeviceSpecification) {
		if (newDeviceSpecification != deviceSpecification) {
			NotificationChain msgs = null;
			if (deviceSpecification != null)
				msgs = ((InternalEObject)deviceSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DEVICE_SPECIFICATION_WITH_STATE__DEVICE_SPECIFICATION, null, msgs);
			if (newDeviceSpecification != null)
				msgs = ((InternalEObject)newDeviceSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DEVICE_SPECIFICATION_WITH_STATE__DEVICE_SPECIFICATION, null, msgs);
			msgs = basicSetDeviceSpecification(newDeviceSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DEVICE_SPECIFICATION_WITH_STATE__DEVICE_SPECIFICATION, newDeviceSpecification, newDeviceSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceStateEnumeration getDeviceState() {
		return deviceState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeviceState(DeviceStateEnumeration newDeviceState) {
		DeviceStateEnumeration oldDeviceState = deviceState;
		deviceState = newDeviceState == null ? DEVICE_STATE_EDEFAULT : newDeviceState;
		boolean oldDeviceStateESet = deviceStateESet;
		deviceStateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DEVICE_SPECIFICATION_WITH_STATE__DEVICE_STATE, oldDeviceState, deviceState, !oldDeviceStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDeviceState() {
		DeviceStateEnumeration oldDeviceState = deviceState;
		boolean oldDeviceStateESet = deviceStateESet;
		deviceState = DEVICE_STATE_EDEFAULT;
		deviceStateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IbisCommonPackage.DEVICE_SPECIFICATION_WITH_STATE__DEVICE_STATE, oldDeviceState, DEVICE_STATE_EDEFAULT, oldDeviceStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDeviceState() {
		return deviceStateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.DEVICE_SPECIFICATION_WITH_STATE__DEVICE_SPECIFICATION:
				return basicSetDeviceSpecification(null, msgs);
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
			case IbisCommonPackage.DEVICE_SPECIFICATION_WITH_STATE__DEVICE_SPECIFICATION:
				return getDeviceSpecification();
			case IbisCommonPackage.DEVICE_SPECIFICATION_WITH_STATE__DEVICE_STATE:
				return getDeviceState();
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
			case IbisCommonPackage.DEVICE_SPECIFICATION_WITH_STATE__DEVICE_SPECIFICATION:
				setDeviceSpecification((DeviceSpecification)newValue);
				return;
			case IbisCommonPackage.DEVICE_SPECIFICATION_WITH_STATE__DEVICE_STATE:
				setDeviceState((DeviceStateEnumeration)newValue);
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
			case IbisCommonPackage.DEVICE_SPECIFICATION_WITH_STATE__DEVICE_SPECIFICATION:
				setDeviceSpecification((DeviceSpecification)null);
				return;
			case IbisCommonPackage.DEVICE_SPECIFICATION_WITH_STATE__DEVICE_STATE:
				unsetDeviceState();
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
			case IbisCommonPackage.DEVICE_SPECIFICATION_WITH_STATE__DEVICE_SPECIFICATION:
				return deviceSpecification != null;
			case IbisCommonPackage.DEVICE_SPECIFICATION_WITH_STATE__DEVICE_STATE:
				return isSetDeviceState();
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
		result.append(" (deviceState: ");
		if (deviceStateESet) result.append(deviceState); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DeviceSpecificationWithStateImpl
