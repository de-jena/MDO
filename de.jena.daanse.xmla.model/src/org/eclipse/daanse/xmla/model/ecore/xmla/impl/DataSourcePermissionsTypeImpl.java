/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.util.Collection;

import org.eclipse.daanse.xmla.model.ecore.xmla.DataSourcePermission;
import org.eclipse.daanse.xmla.model.ecore.xmla.DataSourcePermissionsType;
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
 * An implementation of the model object '<em><b>Data Source Permissions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DataSourcePermissionsTypeImpl#getDataSourcePermission <em>Data Source Permission</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataSourcePermissionsTypeImpl extends MinimalEObjectImpl.Container implements DataSourcePermissionsType {
	/**
	 * The cached value of the '{@link #getDataSourcePermission() <em>Data Source Permission</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSourcePermission()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSourcePermission> dataSourcePermission;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSourcePermissionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.DATA_SOURCE_PERMISSIONS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataSourcePermission> getDataSourcePermission() {
		if (dataSourcePermission == null) {
			dataSourcePermission = new EObjectContainmentEList<DataSourcePermission>(DataSourcePermission.class, this, XmlaPackage.DATA_SOURCE_PERMISSIONS_TYPE__DATA_SOURCE_PERMISSION);
		}
		return dataSourcePermission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.DATA_SOURCE_PERMISSIONS_TYPE__DATA_SOURCE_PERMISSION:
				return ((InternalEList<?>)getDataSourcePermission()).basicRemove(otherEnd, msgs);
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
			case XmlaPackage.DATA_SOURCE_PERMISSIONS_TYPE__DATA_SOURCE_PERMISSION:
				return getDataSourcePermission();
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
			case XmlaPackage.DATA_SOURCE_PERMISSIONS_TYPE__DATA_SOURCE_PERMISSION:
				getDataSourcePermission().clear();
				getDataSourcePermission().addAll((Collection<? extends DataSourcePermission>)newValue);
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
			case XmlaPackage.DATA_SOURCE_PERMISSIONS_TYPE__DATA_SOURCE_PERMISSION:
				getDataSourcePermission().clear();
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
			case XmlaPackage.DATA_SOURCE_PERMISSIONS_TYPE__DATA_SOURCE_PERMISSION:
				return dataSourcePermission != null && !dataSourcePermission.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataSourcePermissionsTypeImpl
