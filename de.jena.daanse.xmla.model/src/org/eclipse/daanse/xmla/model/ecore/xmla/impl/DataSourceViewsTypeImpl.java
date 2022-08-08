/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.util.Collection;

import org.eclipse.daanse.xmla.model.ecore.xmla.DataSourceView;
import org.eclipse.daanse.xmla.model.ecore.xmla.DataSourceViewsType;
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
 * An implementation of the model object '<em><b>Data Source Views Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DataSourceViewsTypeImpl#getDataSourceView <em>Data Source View</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataSourceViewsTypeImpl extends MinimalEObjectImpl.Container implements DataSourceViewsType {
	/**
	 * The cached value of the '{@link #getDataSourceView() <em>Data Source View</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSourceView()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSourceView> dataSourceView;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSourceViewsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.DATA_SOURCE_VIEWS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataSourceView> getDataSourceView() {
		if (dataSourceView == null) {
			dataSourceView = new EObjectContainmentEList<DataSourceView>(DataSourceView.class, this, XmlaPackage.DATA_SOURCE_VIEWS_TYPE__DATA_SOURCE_VIEW);
		}
		return dataSourceView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.DATA_SOURCE_VIEWS_TYPE__DATA_SOURCE_VIEW:
				return ((InternalEList<?>)getDataSourceView()).basicRemove(otherEnd, msgs);
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
			case XmlaPackage.DATA_SOURCE_VIEWS_TYPE__DATA_SOURCE_VIEW:
				return getDataSourceView();
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
			case XmlaPackage.DATA_SOURCE_VIEWS_TYPE__DATA_SOURCE_VIEW:
				getDataSourceView().clear();
				getDataSourceView().addAll((Collection<? extends DataSourceView>)newValue);
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
			case XmlaPackage.DATA_SOURCE_VIEWS_TYPE__DATA_SOURCE_VIEW:
				getDataSourceView().clear();
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
			case XmlaPackage.DATA_SOURCE_VIEWS_TYPE__DATA_SOURCE_VIEW:
				return dataSourceView != null && !dataSourceView.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataSourceViewsTypeImpl
