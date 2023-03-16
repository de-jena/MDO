/*
 */
package de.jena.mdo.ibis.ibis_common.impl;

import de.jena.mdo.ibis.ibis_common.IBISIPBoolean;
import de.jena.mdo.ibis.ibis_common.IBISIPDuration;
import de.jena.mdo.ibis.ibis_common.IbisCommonPackage;
import de.jena.mdo.ibis.ibis_common.SubscribeResponse;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subscribe Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.SubscribeResponseImpl#getActive <em>Active</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.SubscribeResponseImpl#getHeartbeat <em>Heartbeat</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubscribeResponseImpl extends GeneralResponseImpl implements SubscribeResponse {
	/**
	 * The cached value of the '{@link #getActive() <em>Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive()
	 * @generated
	 * @ordered
	 */
	protected IBISIPBoolean active;

	/**
	 * The cached value of the '{@link #getHeartbeat() <em>Heartbeat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeartbeat()
	 * @generated
	 * @ordered
	 */
	protected IBISIPDuration heartbeat;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubscribeResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.Literals.SUBSCRIBE_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPBoolean getActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActive(IBISIPBoolean newActive, NotificationChain msgs) {
		IBISIPBoolean oldActive = active;
		active = newActive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.SUBSCRIBE_RESPONSE__ACTIVE, oldActive, newActive);
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
	public void setActive(IBISIPBoolean newActive) {
		if (newActive != active) {
			NotificationChain msgs = null;
			if (active != null)
				msgs = ((InternalEObject)active).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.SUBSCRIBE_RESPONSE__ACTIVE, null, msgs);
			if (newActive != null)
				msgs = ((InternalEObject)newActive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.SUBSCRIBE_RESPONSE__ACTIVE, null, msgs);
			msgs = basicSetActive(newActive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.SUBSCRIBE_RESPONSE__ACTIVE, newActive, newActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPDuration getHeartbeat() {
		return heartbeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeartbeat(IBISIPDuration newHeartbeat, NotificationChain msgs) {
		IBISIPDuration oldHeartbeat = heartbeat;
		heartbeat = newHeartbeat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.SUBSCRIBE_RESPONSE__HEARTBEAT, oldHeartbeat, newHeartbeat);
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
	public void setHeartbeat(IBISIPDuration newHeartbeat) {
		if (newHeartbeat != heartbeat) {
			NotificationChain msgs = null;
			if (heartbeat != null)
				msgs = ((InternalEObject)heartbeat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.SUBSCRIBE_RESPONSE__HEARTBEAT, null, msgs);
			if (newHeartbeat != null)
				msgs = ((InternalEObject)newHeartbeat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.SUBSCRIBE_RESPONSE__HEARTBEAT, null, msgs);
			msgs = basicSetHeartbeat(newHeartbeat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.SUBSCRIBE_RESPONSE__HEARTBEAT, newHeartbeat, newHeartbeat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.SUBSCRIBE_RESPONSE__ACTIVE:
				return basicSetActive(null, msgs);
			case IbisCommonPackage.SUBSCRIBE_RESPONSE__HEARTBEAT:
				return basicSetHeartbeat(null, msgs);
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
			case IbisCommonPackage.SUBSCRIBE_RESPONSE__ACTIVE:
				return getActive();
			case IbisCommonPackage.SUBSCRIBE_RESPONSE__HEARTBEAT:
				return getHeartbeat();
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
			case IbisCommonPackage.SUBSCRIBE_RESPONSE__ACTIVE:
				setActive((IBISIPBoolean)newValue);
				return;
			case IbisCommonPackage.SUBSCRIBE_RESPONSE__HEARTBEAT:
				setHeartbeat((IBISIPDuration)newValue);
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
			case IbisCommonPackage.SUBSCRIBE_RESPONSE__ACTIVE:
				setActive((IBISIPBoolean)null);
				return;
			case IbisCommonPackage.SUBSCRIBE_RESPONSE__HEARTBEAT:
				setHeartbeat((IBISIPDuration)null);
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
			case IbisCommonPackage.SUBSCRIBE_RESPONSE__ACTIVE:
				return active != null;
			case IbisCommonPackage.SUBSCRIBE_RESPONSE__HEARTBEAT:
				return heartbeat != null;
		}
		return super.eIsSet(featureID);
	}

} //SubscribeResponseImpl
