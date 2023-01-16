/*
 */
package de.jena.mdo.ibis.common.impl;

import de.jena.mdo.ibis.common.IBISIPBoolean;
import de.jena.mdo.ibis.common.IBISIPDuration;
import de.jena.mdo.ibis.common.IBISIPString;
import de.jena.mdo.ibis.common.IbisCommonPackage;
import de.jena.mdo.ibis.common.SubscribeResponseStructure;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subscribe Response Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.impl.SubscribeResponseStructureImpl#getActive <em>Active</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.SubscribeResponseStructureImpl#getHeartbeat <em>Heartbeat</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.SubscribeResponseStructureImpl#getOperationErrorMessage <em>Operation Error Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubscribeResponseStructureImpl extends MinimalEObjectImpl.Container implements SubscribeResponseStructure {
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
	 * The cached value of the '{@link #getOperationErrorMessage() <em>Operation Error Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationErrorMessage()
	 * @generated
	 * @ordered
	 */
	protected IBISIPString operationErrorMessage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubscribeResponseStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.eINSTANCE.getSubscribeResponseStructure();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.SUBSCRIBE_RESPONSE_STRUCTURE__ACTIVE, oldActive, newActive);
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
				msgs = ((InternalEObject)active).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.SUBSCRIBE_RESPONSE_STRUCTURE__ACTIVE, null, msgs);
			if (newActive != null)
				msgs = ((InternalEObject)newActive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.SUBSCRIBE_RESPONSE_STRUCTURE__ACTIVE, null, msgs);
			msgs = basicSetActive(newActive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.SUBSCRIBE_RESPONSE_STRUCTURE__ACTIVE, newActive, newActive));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.SUBSCRIBE_RESPONSE_STRUCTURE__HEARTBEAT, oldHeartbeat, newHeartbeat);
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
				msgs = ((InternalEObject)heartbeat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.SUBSCRIBE_RESPONSE_STRUCTURE__HEARTBEAT, null, msgs);
			if (newHeartbeat != null)
				msgs = ((InternalEObject)newHeartbeat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.SUBSCRIBE_RESPONSE_STRUCTURE__HEARTBEAT, null, msgs);
			msgs = basicSetHeartbeat(newHeartbeat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.SUBSCRIBE_RESPONSE_STRUCTURE__HEARTBEAT, newHeartbeat, newHeartbeat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPString getOperationErrorMessage() {
		return operationErrorMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationErrorMessage(IBISIPString newOperationErrorMessage, NotificationChain msgs) {
		IBISIPString oldOperationErrorMessage = operationErrorMessage;
		operationErrorMessage = newOperationErrorMessage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.SUBSCRIBE_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE, oldOperationErrorMessage, newOperationErrorMessage);
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
	public void setOperationErrorMessage(IBISIPString newOperationErrorMessage) {
		if (newOperationErrorMessage != operationErrorMessage) {
			NotificationChain msgs = null;
			if (operationErrorMessage != null)
				msgs = ((InternalEObject)operationErrorMessage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.SUBSCRIBE_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE, null, msgs);
			if (newOperationErrorMessage != null)
				msgs = ((InternalEObject)newOperationErrorMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.SUBSCRIBE_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE, null, msgs);
			msgs = basicSetOperationErrorMessage(newOperationErrorMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.SUBSCRIBE_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE, newOperationErrorMessage, newOperationErrorMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.SUBSCRIBE_RESPONSE_STRUCTURE__ACTIVE:
				return basicSetActive(null, msgs);
			case IbisCommonPackage.SUBSCRIBE_RESPONSE_STRUCTURE__HEARTBEAT:
				return basicSetHeartbeat(null, msgs);
			case IbisCommonPackage.SUBSCRIBE_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE:
				return basicSetOperationErrorMessage(null, msgs);
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
			case IbisCommonPackage.SUBSCRIBE_RESPONSE_STRUCTURE__ACTIVE:
				return getActive();
			case IbisCommonPackage.SUBSCRIBE_RESPONSE_STRUCTURE__HEARTBEAT:
				return getHeartbeat();
			case IbisCommonPackage.SUBSCRIBE_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE:
				return getOperationErrorMessage();
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
			case IbisCommonPackage.SUBSCRIBE_RESPONSE_STRUCTURE__ACTIVE:
				setActive((IBISIPBoolean)newValue);
				return;
			case IbisCommonPackage.SUBSCRIBE_RESPONSE_STRUCTURE__HEARTBEAT:
				setHeartbeat((IBISIPDuration)newValue);
				return;
			case IbisCommonPackage.SUBSCRIBE_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE:
				setOperationErrorMessage((IBISIPString)newValue);
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
			case IbisCommonPackage.SUBSCRIBE_RESPONSE_STRUCTURE__ACTIVE:
				setActive((IBISIPBoolean)null);
				return;
			case IbisCommonPackage.SUBSCRIBE_RESPONSE_STRUCTURE__HEARTBEAT:
				setHeartbeat((IBISIPDuration)null);
				return;
			case IbisCommonPackage.SUBSCRIBE_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE:
				setOperationErrorMessage((IBISIPString)null);
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
			case IbisCommonPackage.SUBSCRIBE_RESPONSE_STRUCTURE__ACTIVE:
				return active != null;
			case IbisCommonPackage.SUBSCRIBE_RESPONSE_STRUCTURE__HEARTBEAT:
				return heartbeat != null;
			case IbisCommonPackage.SUBSCRIBE_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE:
				return operationErrorMessage != null;
		}
		return super.eIsSet(featureID);
	}

} //SubscribeResponseStructureImpl
