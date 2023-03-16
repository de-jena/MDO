/*
 */
package de.jena.mdo.ibis.ibis_common.impl;

import de.jena.mdo.ibis.ibis_common.DoorCounting;
import de.jena.mdo.ibis.ibis_common.DoorCountingList;
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
 * An implementation of the model object '<em><b>Door Counting List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.DoorCountingListImpl#getDoorID <em>Door ID</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.DoorCountingListImpl#getCountSet <em>Count Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DoorCountingListImpl extends MinimalEObjectImpl.Container implements DoorCountingList {
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
	 * The cached value of the '{@link #getCountSet() <em>Count Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountSet()
	 * @generated
	 * @ordered
	 */
	protected EList<DoorCounting> countSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoorCountingListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.Literals.DOOR_COUNTING_LIST;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DOOR_COUNTING_LIST__DOOR_ID, oldDoorID, newDoorID);
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
				msgs = ((InternalEObject)doorID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DOOR_COUNTING_LIST__DOOR_ID, null, msgs);
			if (newDoorID != null)
				msgs = ((InternalEObject)newDoorID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DOOR_COUNTING_LIST__DOOR_ID, null, msgs);
			msgs = basicSetDoorID(newDoorID, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DOOR_COUNTING_LIST__DOOR_ID, newDoorID, newDoorID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DoorCounting> getCountSet() {
		if (countSet == null) {
			countSet = new EObjectContainmentEList<DoorCounting>(DoorCounting.class, this, IbisCommonPackage.DOOR_COUNTING_LIST__COUNT_SET);
		}
		return countSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.DOOR_COUNTING_LIST__DOOR_ID:
				return basicSetDoorID(null, msgs);
			case IbisCommonPackage.DOOR_COUNTING_LIST__COUNT_SET:
				return ((InternalEList<?>)getCountSet()).basicRemove(otherEnd, msgs);
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
			case IbisCommonPackage.DOOR_COUNTING_LIST__DOOR_ID:
				return getDoorID();
			case IbisCommonPackage.DOOR_COUNTING_LIST__COUNT_SET:
				return getCountSet();
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
			case IbisCommonPackage.DOOR_COUNTING_LIST__DOOR_ID:
				setDoorID((IBISIPNMTOKEN)newValue);
				return;
			case IbisCommonPackage.DOOR_COUNTING_LIST__COUNT_SET:
				getCountSet().clear();
				getCountSet().addAll((Collection<? extends DoorCounting>)newValue);
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
			case IbisCommonPackage.DOOR_COUNTING_LIST__DOOR_ID:
				setDoorID((IBISIPNMTOKEN)null);
				return;
			case IbisCommonPackage.DOOR_COUNTING_LIST__COUNT_SET:
				getCountSet().clear();
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
			case IbisCommonPackage.DOOR_COUNTING_LIST__DOOR_ID:
				return doorID != null;
			case IbisCommonPackage.DOOR_COUNTING_LIST__COUNT_SET:
				return countSet != null && !countSet.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DoorCountingListImpl
