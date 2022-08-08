/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.util.Collection;

import org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructurePermission;
import org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructurePermissionsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mining Structure Permissions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningStructurePermissionsTypeImpl#getMiningStructurePermission <em>Mining Structure Permission</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MiningStructurePermissionsTypeImpl extends MinimalEObjectImpl.Container implements MiningStructurePermissionsType {
	/**
	 * The cached value of the '{@link #getMiningStructurePermission() <em>Mining Structure Permission</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningStructurePermission()
	 * @generated
	 * @ordered
	 */
	protected EList<MiningStructurePermission> miningStructurePermission;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MiningStructurePermissionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.MINING_STRUCTURE_PERMISSIONS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MiningStructurePermission> getMiningStructurePermission() {
		if (miningStructurePermission == null) {
			miningStructurePermission = new EObjectContainmentEList<MiningStructurePermission>(MiningStructurePermission.class, this, XmlaPackage.MINING_STRUCTURE_PERMISSIONS_TYPE__MINING_STRUCTURE_PERMISSION);
		}
		return miningStructurePermission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.MINING_STRUCTURE_PERMISSIONS_TYPE__MINING_STRUCTURE_PERMISSION:
				return ((InternalEList<?>)getMiningStructurePermission()).basicRemove(otherEnd, msgs);
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
			case XmlaPackage.MINING_STRUCTURE_PERMISSIONS_TYPE__MINING_STRUCTURE_PERMISSION:
				return getMiningStructurePermission();
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
			case XmlaPackage.MINING_STRUCTURE_PERMISSIONS_TYPE__MINING_STRUCTURE_PERMISSION:
				getMiningStructurePermission().clear();
				getMiningStructurePermission().addAll((Collection<? extends MiningStructurePermission>)newValue);
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
			case XmlaPackage.MINING_STRUCTURE_PERMISSIONS_TYPE__MINING_STRUCTURE_PERMISSION:
				getMiningStructurePermission().clear();
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
			case XmlaPackage.MINING_STRUCTURE_PERMISSIONS_TYPE__MINING_STRUCTURE_PERMISSION:
				return miningStructurePermission != null && !miningStructurePermission.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MiningStructurePermissionsTypeImpl
