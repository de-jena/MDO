/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.util.Collection;

import org.eclipse.daanse.xmla.model.ecore.xmla.CubePermission;
import org.eclipse.daanse.xmla.model.ecore.xmla.CubePermissionsType;
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
 * An implementation of the model object '<em><b>Cube Permissions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubePermissionsTypeImpl#getCubePermission <em>Cube Permission</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CubePermissionsTypeImpl extends MinimalEObjectImpl.Container implements CubePermissionsType {
	/**
	 * The cached value of the '{@link #getCubePermission() <em>Cube Permission</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCubePermission()
	 * @generated
	 * @ordered
	 */
	protected EList<CubePermission> cubePermission;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CubePermissionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.CUBE_PERMISSIONS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CubePermission> getCubePermission() {
		if (cubePermission == null) {
			cubePermission = new EObjectContainmentEList<CubePermission>(CubePermission.class, this, XmlaPackage.CUBE_PERMISSIONS_TYPE__CUBE_PERMISSION);
		}
		return cubePermission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.CUBE_PERMISSIONS_TYPE__CUBE_PERMISSION:
				return ((InternalEList<?>)getCubePermission()).basicRemove(otherEnd, msgs);
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
			case XmlaPackage.CUBE_PERMISSIONS_TYPE__CUBE_PERMISSION:
				return getCubePermission();
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
			case XmlaPackage.CUBE_PERMISSIONS_TYPE__CUBE_PERMISSION:
				getCubePermission().clear();
				getCubePermission().addAll((Collection<? extends CubePermission>)newValue);
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
			case XmlaPackage.CUBE_PERMISSIONS_TYPE__CUBE_PERMISSION:
				getCubePermission().clear();
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
			case XmlaPackage.CUBE_PERMISSIONS_TYPE__CUBE_PERMISSION:
				return cubePermission != null && !cubePermission.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CubePermissionsTypeImpl
