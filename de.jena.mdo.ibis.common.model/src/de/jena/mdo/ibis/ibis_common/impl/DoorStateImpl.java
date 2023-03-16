/*
 */
package de.jena.mdo.ibis.ibis_common.impl;

import de.jena.mdo.ibis.ibis_common.DoorOpenState;
import de.jena.mdo.ibis.ibis_common.DoorOperationState;
import de.jena.mdo.ibis.ibis_common.DoorState;
import de.jena.mdo.ibis.ibis_common.IbisCommonPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Door State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.DoorStateImpl#getOpenState <em>Open State</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.DoorStateImpl#getOperationState <em>Operation State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DoorStateImpl extends MinimalEObjectImpl.Container implements DoorState {
	/**
	 * The cached value of the '{@link #getOpenState() <em>Open State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenState()
	 * @generated
	 * @ordered
	 */
	protected DoorOpenState openState;

	/**
	 * The cached value of the '{@link #getOperationState() <em>Operation State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationState()
	 * @generated
	 * @ordered
	 */
	protected DoorOperationState operationState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoorStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.Literals.DOOR_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoorOpenState getOpenState() {
		return openState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpenState(DoorOpenState newOpenState, NotificationChain msgs) {
		DoorOpenState oldOpenState = openState;
		openState = newOpenState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DOOR_STATE__OPEN_STATE, oldOpenState, newOpenState);
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
	public void setOpenState(DoorOpenState newOpenState) {
		if (newOpenState != openState) {
			NotificationChain msgs = null;
			if (openState != null)
				msgs = ((InternalEObject)openState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DOOR_STATE__OPEN_STATE, null, msgs);
			if (newOpenState != null)
				msgs = ((InternalEObject)newOpenState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DOOR_STATE__OPEN_STATE, null, msgs);
			msgs = basicSetOpenState(newOpenState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DOOR_STATE__OPEN_STATE, newOpenState, newOpenState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoorOperationState getOperationState() {
		return operationState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationState(DoorOperationState newOperationState, NotificationChain msgs) {
		DoorOperationState oldOperationState = operationState;
		operationState = newOperationState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DOOR_STATE__OPERATION_STATE, oldOperationState, newOperationState);
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
	public void setOperationState(DoorOperationState newOperationState) {
		if (newOperationState != operationState) {
			NotificationChain msgs = null;
			if (operationState != null)
				msgs = ((InternalEObject)operationState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DOOR_STATE__OPERATION_STATE, null, msgs);
			if (newOperationState != null)
				msgs = ((InternalEObject)newOperationState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DOOR_STATE__OPERATION_STATE, null, msgs);
			msgs = basicSetOperationState(newOperationState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DOOR_STATE__OPERATION_STATE, newOperationState, newOperationState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.DOOR_STATE__OPEN_STATE:
				return basicSetOpenState(null, msgs);
			case IbisCommonPackage.DOOR_STATE__OPERATION_STATE:
				return basicSetOperationState(null, msgs);
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
			case IbisCommonPackage.DOOR_STATE__OPEN_STATE:
				return getOpenState();
			case IbisCommonPackage.DOOR_STATE__OPERATION_STATE:
				return getOperationState();
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
			case IbisCommonPackage.DOOR_STATE__OPEN_STATE:
				setOpenState((DoorOpenState)newValue);
				return;
			case IbisCommonPackage.DOOR_STATE__OPERATION_STATE:
				setOperationState((DoorOperationState)newValue);
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
			case IbisCommonPackage.DOOR_STATE__OPEN_STATE:
				setOpenState((DoorOpenState)null);
				return;
			case IbisCommonPackage.DOOR_STATE__OPERATION_STATE:
				setOperationState((DoorOperationState)null);
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
			case IbisCommonPackage.DOOR_STATE__OPEN_STATE:
				return openState != null;
			case IbisCommonPackage.DOOR_STATE__OPERATION_STATE:
				return operationState != null;
		}
		return super.eIsSet(featureID);
	}

} //DoorStateImpl
