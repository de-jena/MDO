/*
 */
package de.jena.mdo.ibis.ibis_common.impl;

import de.jena.mdo.ibis.ibis_common.DoorCounting;
import de.jena.mdo.ibis.ibis_common.DoorInformation;
import de.jena.mdo.ibis.ibis_common.DoorState;
import de.jena.mdo.ibis.ibis_common.IBISIPNMTOKEN;
import de.jena.mdo.ibis.ibis_common.IbisCommonPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Door Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.DoorInformationImpl#getDoorID <em>Door ID</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.DoorInformationImpl#getCount <em>Count</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.DoorInformationImpl#getState <em>State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DoorInformationImpl extends MinimalEObjectImpl.Container implements DoorInformation {
	/**
	 * The cached value of the '{@link #getDoorID() <em>Door ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoorID()
	 * @generated
	 * @ordered
	 */
	protected IBISIPNMTOKEN doorID;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected EList<DoorCounting> count;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected DoorState state;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoorInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.Literals.DOOR_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPNMTOKEN getDoorID() {
		return doorID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoorID(IBISIPNMTOKEN newDoorID, NotificationChain msgs) {
		IBISIPNMTOKEN oldDoorID = doorID;
		doorID = newDoorID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DOOR_INFORMATION__DOOR_ID, oldDoorID, newDoorID);
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
	public void setDoorID(IBISIPNMTOKEN newDoorID) {
		if (newDoorID != doorID) {
			NotificationChain msgs = null;
			if (doorID != null)
				msgs = ((InternalEObject)doorID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DOOR_INFORMATION__DOOR_ID, null, msgs);
			if (newDoorID != null)
				msgs = ((InternalEObject)newDoorID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DOOR_INFORMATION__DOOR_ID, null, msgs);
			msgs = basicSetDoorID(newDoorID, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DOOR_INFORMATION__DOOR_ID, newDoorID, newDoorID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DoorCounting> getCount() {
		if (count == null) {
			count = new EObjectContainmentEList<DoorCounting>(DoorCounting.class, this, IbisCommonPackage.DOOR_INFORMATION__COUNT);
		}
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoorState getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetState(DoorState newState, NotificationChain msgs) {
		DoorState oldState = state;
		state = newState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DOOR_INFORMATION__STATE, oldState, newState);
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
	public void setState(DoorState newState) {
		if (newState != state) {
			NotificationChain msgs = null;
			if (state != null)
				msgs = ((InternalEObject)state).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DOOR_INFORMATION__STATE, null, msgs);
			if (newState != null)
				msgs = ((InternalEObject)newState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DOOR_INFORMATION__STATE, null, msgs);
			msgs = basicSetState(newState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DOOR_INFORMATION__STATE, newState, newState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.DOOR_INFORMATION__DOOR_ID:
				return basicSetDoorID(null, msgs);
			case IbisCommonPackage.DOOR_INFORMATION__COUNT:
				return ((InternalEList<?>)getCount()).basicRemove(otherEnd, msgs);
			case IbisCommonPackage.DOOR_INFORMATION__STATE:
				return basicSetState(null, msgs);
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
			case IbisCommonPackage.DOOR_INFORMATION__DOOR_ID:
				return getDoorID();
			case IbisCommonPackage.DOOR_INFORMATION__COUNT:
				return getCount();
			case IbisCommonPackage.DOOR_INFORMATION__STATE:
				return getState();
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
			case IbisCommonPackage.DOOR_INFORMATION__DOOR_ID:
				setDoorID((IBISIPNMTOKEN)newValue);
				return;
			case IbisCommonPackage.DOOR_INFORMATION__COUNT:
				getCount().clear();
				getCount().addAll((Collection<? extends DoorCounting>)newValue);
				return;
			case IbisCommonPackage.DOOR_INFORMATION__STATE:
				setState((DoorState)newValue);
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
			case IbisCommonPackage.DOOR_INFORMATION__DOOR_ID:
				setDoorID((IBISIPNMTOKEN)null);
				return;
			case IbisCommonPackage.DOOR_INFORMATION__COUNT:
				getCount().clear();
				return;
			case IbisCommonPackage.DOOR_INFORMATION__STATE:
				setState((DoorState)null);
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
			case IbisCommonPackage.DOOR_INFORMATION__DOOR_ID:
				return doorID != null;
			case IbisCommonPackage.DOOR_INFORMATION__COUNT:
				return count != null && !count.isEmpty();
			case IbisCommonPackage.DOOR_INFORMATION__STATE:
				return state != null;
		}
		return super.eIsSet(featureID);
	}

} //DoorInformationImpl
