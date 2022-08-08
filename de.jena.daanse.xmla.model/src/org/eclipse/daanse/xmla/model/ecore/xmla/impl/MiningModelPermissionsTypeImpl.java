/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.util.Collection;

import org.eclipse.daanse.xmla.model.ecore.xmla.MiningModelPermission;
import org.eclipse.daanse.xmla.model.ecore.xmla.MiningModelPermissionsType;
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
 * An implementation of the model object '<em><b>Mining Model Permissions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningModelPermissionsTypeImpl#getMiningModelPermission <em>Mining Model Permission</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MiningModelPermissionsTypeImpl extends MinimalEObjectImpl.Container implements MiningModelPermissionsType {
	/**
	 * The cached value of the '{@link #getMiningModelPermission() <em>Mining Model Permission</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningModelPermission()
	 * @generated
	 * @ordered
	 */
	protected EList<MiningModelPermission> miningModelPermission;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MiningModelPermissionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.MINING_MODEL_PERMISSIONS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MiningModelPermission> getMiningModelPermission() {
		if (miningModelPermission == null) {
			miningModelPermission = new EObjectContainmentEList<MiningModelPermission>(MiningModelPermission.class, this, XmlaPackage.MINING_MODEL_PERMISSIONS_TYPE__MINING_MODEL_PERMISSION);
		}
		return miningModelPermission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.MINING_MODEL_PERMISSIONS_TYPE__MINING_MODEL_PERMISSION:
				return ((InternalEList<?>)getMiningModelPermission()).basicRemove(otherEnd, msgs);
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
			case XmlaPackage.MINING_MODEL_PERMISSIONS_TYPE__MINING_MODEL_PERMISSION:
				return getMiningModelPermission();
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
			case XmlaPackage.MINING_MODEL_PERMISSIONS_TYPE__MINING_MODEL_PERMISSION:
				getMiningModelPermission().clear();
				getMiningModelPermission().addAll((Collection<? extends MiningModelPermission>)newValue);
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
			case XmlaPackage.MINING_MODEL_PERMISSIONS_TYPE__MINING_MODEL_PERMISSION:
				getMiningModelPermission().clear();
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
			case XmlaPackage.MINING_MODEL_PERMISSIONS_TYPE__MINING_MODEL_PERMISSION:
				return miningModelPermission != null && !miningModelPermission.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MiningModelPermissionsTypeImpl
