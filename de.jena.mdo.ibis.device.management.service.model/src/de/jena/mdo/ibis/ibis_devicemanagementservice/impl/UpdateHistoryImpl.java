/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice.impl;

import de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage;
import de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistory;
import de.jena.mdo.ibis.ibis_devicemanagementservice.UpdateHistoryEntry;

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
 * An implementation of the model object '<em><b>Update History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_devicemanagementservice.impl.UpdateHistoryImpl#getUpdateHistoryEntry <em>Update History Entry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UpdateHistoryImpl extends MinimalEObjectImpl.Container implements UpdateHistory {
	/**
	 * The cached value of the '{@link #getUpdateHistoryEntry() <em>Update History Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateHistoryEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<UpdateHistoryEntry> updateHistoryEntry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateHistoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisDeviceManagementServicePackage.Literals.UPDATE_HISTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UpdateHistoryEntry> getUpdateHistoryEntry() {
		if (updateHistoryEntry == null) {
			updateHistoryEntry = new EObjectContainmentEList<UpdateHistoryEntry>(UpdateHistoryEntry.class, this, IbisDeviceManagementServicePackage.UPDATE_HISTORY__UPDATE_HISTORY_ENTRY);
		}
		return updateHistoryEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisDeviceManagementServicePackage.UPDATE_HISTORY__UPDATE_HISTORY_ENTRY:
				return ((InternalEList<?>)getUpdateHistoryEntry()).basicRemove(otherEnd, msgs);
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
			case IbisDeviceManagementServicePackage.UPDATE_HISTORY__UPDATE_HISTORY_ENTRY:
				return getUpdateHistoryEntry();
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
			case IbisDeviceManagementServicePackage.UPDATE_HISTORY__UPDATE_HISTORY_ENTRY:
				getUpdateHistoryEntry().clear();
				getUpdateHistoryEntry().addAll((Collection<? extends UpdateHistoryEntry>)newValue);
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
			case IbisDeviceManagementServicePackage.UPDATE_HISTORY__UPDATE_HISTORY_ENTRY:
				getUpdateHistoryEntry().clear();
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
			case IbisDeviceManagementServicePackage.UPDATE_HISTORY__UPDATE_HISTORY_ENTRY:
				return updateHistoryEntry != null && !updateHistoryEntry.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UpdateHistoryImpl
