/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.util.Collection;

import org.eclipse.daanse.xmla.model.ecore.xmla.DimensionPermission;
import org.eclipse.daanse.xmla.model.ecore.xmla.DimensionPermissionsType;
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
 * An implementation of the model object '<em><b>Dimension Permissions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionPermissionsTypeImpl#getDimensionPermission <em>Dimension Permission</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DimensionPermissionsTypeImpl extends MinimalEObjectImpl.Container implements DimensionPermissionsType {
	/**
	 * The cached value of the '{@link #getDimensionPermission() <em>Dimension Permission</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionPermission()
	 * @generated
	 * @ordered
	 */
	protected EList<DimensionPermission> dimensionPermission;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DimensionPermissionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.DIMENSION_PERMISSIONS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DimensionPermission> getDimensionPermission() {
		if (dimensionPermission == null) {
			dimensionPermission = new EObjectContainmentEList<DimensionPermission>(DimensionPermission.class, this, XmlaPackage.DIMENSION_PERMISSIONS_TYPE__DIMENSION_PERMISSION);
		}
		return dimensionPermission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.DIMENSION_PERMISSIONS_TYPE__DIMENSION_PERMISSION:
				return ((InternalEList<?>)getDimensionPermission()).basicRemove(otherEnd, msgs);
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
			case XmlaPackage.DIMENSION_PERMISSIONS_TYPE__DIMENSION_PERMISSION:
				return getDimensionPermission();
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
			case XmlaPackage.DIMENSION_PERMISSIONS_TYPE__DIMENSION_PERMISSION:
				getDimensionPermission().clear();
				getDimensionPermission().addAll((Collection<? extends DimensionPermission>)newValue);
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
			case XmlaPackage.DIMENSION_PERMISSIONS_TYPE__DIMENSION_PERMISSION:
				getDimensionPermission().clear();
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
			case XmlaPackage.DIMENSION_PERMISSIONS_TYPE__DIMENSION_PERMISSION:
				return dimensionPermission != null && !dimensionPermission.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DimensionPermissionsTypeImpl
