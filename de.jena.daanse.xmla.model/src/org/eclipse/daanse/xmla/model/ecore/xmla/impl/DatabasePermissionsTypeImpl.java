/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.util.Collection;

import org.eclipse.daanse.xmla.model.ecore.xmla.DatabasePermission;
import org.eclipse.daanse.xmla.model.ecore.xmla.DatabasePermissionsType;
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
 * An implementation of the model object '<em><b>Database Permissions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DatabasePermissionsTypeImpl#getDatabasePermission <em>Database Permission</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatabasePermissionsTypeImpl extends MinimalEObjectImpl.Container implements DatabasePermissionsType {
	/**
	 * The cached value of the '{@link #getDatabasePermission() <em>Database Permission</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabasePermission()
	 * @generated
	 * @ordered
	 */
	protected EList<DatabasePermission> databasePermission;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabasePermissionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.DATABASE_PERMISSIONS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatabasePermission> getDatabasePermission() {
		if (databasePermission == null) {
			databasePermission = new EObjectContainmentEList<DatabasePermission>(DatabasePermission.class, this, XmlaPackage.DATABASE_PERMISSIONS_TYPE__DATABASE_PERMISSION);
		}
		return databasePermission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.DATABASE_PERMISSIONS_TYPE__DATABASE_PERMISSION:
				return ((InternalEList<?>)getDatabasePermission()).basicRemove(otherEnd, msgs);
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
			case XmlaPackage.DATABASE_PERMISSIONS_TYPE__DATABASE_PERMISSION:
				return getDatabasePermission();
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
			case XmlaPackage.DATABASE_PERMISSIONS_TYPE__DATABASE_PERMISSION:
				getDatabasePermission().clear();
				getDatabasePermission().addAll((Collection<? extends DatabasePermission>)newValue);
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
			case XmlaPackage.DATABASE_PERMISSIONS_TYPE__DATABASE_PERMISSION:
				getDatabasePermission().clear();
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
			case XmlaPackage.DATABASE_PERMISSIONS_TYPE__DATABASE_PERMISSION:
				return databasePermission != null && !databasePermission.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DatabasePermissionsTypeImpl
