/*
 */
package de.jena.mdo.ibis.common.impl;

import de.jena.mdo.ibis.common.DoorOpenStateStructure;
import de.jena.mdo.ibis.common.DoorOperationStateStructure;
import de.jena.mdo.ibis.common.DoorStateStructure;
import de.jena.mdo.ibis.common.IbisCommonPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Door State Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DoorStateStructureImpl#getOpenState <em>Open State</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DoorStateStructureImpl#getOperationState <em>Operation State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DoorStateStructureImpl extends MinimalEObjectImpl.Container implements DoorStateStructure {
	/**
	 * The cached value of the '{@link #getOpenState() <em>Open State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenState()
	 * @generated
	 * @ordered
	 */
	protected DoorOpenStateStructure openState;

	/**
	 * The cached value of the '{@link #getOperationState() <em>Operation State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationState()
	 * @generated
	 * @ordered
	 */
	protected DoorOperationStateStructure operationState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoorStateStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.eINSTANCE.getDoorStateStructure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoorOpenStateStructure getOpenState() {
		return openState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpenState(DoorOpenStateStructure newOpenState, NotificationChain msgs) {
		DoorOpenStateStructure oldOpenState = openState;
		openState = newOpenState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DOOR_STATE_STRUCTURE__OPEN_STATE, oldOpenState, newOpenState);
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
	public void setOpenState(DoorOpenStateStructure newOpenState) {
		if (newOpenState != openState) {
			NotificationChain msgs = null;
			if (openState != null)
				msgs = ((InternalEObject)openState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DOOR_STATE_STRUCTURE__OPEN_STATE, null, msgs);
			if (newOpenState != null)
				msgs = ((InternalEObject)newOpenState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DOOR_STATE_STRUCTURE__OPEN_STATE, null, msgs);
			msgs = basicSetOpenState(newOpenState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DOOR_STATE_STRUCTURE__OPEN_STATE, newOpenState, newOpenState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoorOperationStateStructure getOperationState() {
		return operationState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationState(DoorOperationStateStructure newOperationState, NotificationChain msgs) {
		DoorOperationStateStructure oldOperationState = operationState;
		operationState = newOperationState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DOOR_STATE_STRUCTURE__OPERATION_STATE, oldOperationState, newOperationState);
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
	public void setOperationState(DoorOperationStateStructure newOperationState) {
		if (newOperationState != operationState) {
			NotificationChain msgs = null;
			if (operationState != null)
				msgs = ((InternalEObject)operationState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DOOR_STATE_STRUCTURE__OPERATION_STATE, null, msgs);
			if (newOperationState != null)
				msgs = ((InternalEObject)newOperationState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DOOR_STATE_STRUCTURE__OPERATION_STATE, null, msgs);
			msgs = basicSetOperationState(newOperationState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DOOR_STATE_STRUCTURE__OPERATION_STATE, newOperationState, newOperationState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.DOOR_STATE_STRUCTURE__OPEN_STATE:
				return basicSetOpenState(null, msgs);
			case IbisCommonPackage.DOOR_STATE_STRUCTURE__OPERATION_STATE:
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
			case IbisCommonPackage.DOOR_STATE_STRUCTURE__OPEN_STATE:
				return getOpenState();
			case IbisCommonPackage.DOOR_STATE_STRUCTURE__OPERATION_STATE:
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
			case IbisCommonPackage.DOOR_STATE_STRUCTURE__OPEN_STATE:
				setOpenState((DoorOpenStateStructure)newValue);
				return;
			case IbisCommonPackage.DOOR_STATE_STRUCTURE__OPERATION_STATE:
				setOperationState((DoorOperationStateStructure)newValue);
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
			case IbisCommonPackage.DOOR_STATE_STRUCTURE__OPEN_STATE:
				setOpenState((DoorOpenStateStructure)null);
				return;
			case IbisCommonPackage.DOOR_STATE_STRUCTURE__OPERATION_STATE:
				setOperationState((DoorOperationStateStructure)null);
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
			case IbisCommonPackage.DOOR_STATE_STRUCTURE__OPEN_STATE:
				return openState != null;
			case IbisCommonPackage.DOOR_STATE_STRUCTURE__OPERATION_STATE:
				return operationState != null;
		}
		return super.eIsSet(featureID);
	}

} //DoorStateStructureImpl
