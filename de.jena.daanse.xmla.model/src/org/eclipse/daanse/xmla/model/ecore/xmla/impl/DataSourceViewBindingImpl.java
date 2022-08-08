/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.DataSourceViewBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Source View Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DataSourceViewBindingImpl#getDataSourceViewID <em>Data Source View ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataSourceViewBindingImpl extends BindingImpl implements DataSourceViewBinding {
	/**
	 * The default value of the '{@link #getDataSourceViewID() <em>Data Source View ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSourceViewID()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_SOURCE_VIEW_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataSourceViewID() <em>Data Source View ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSourceViewID()
	 * @generated
	 * @ordered
	 */
	protected String dataSourceViewID = DATA_SOURCE_VIEW_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSourceViewBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.DATA_SOURCE_VIEW_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataSourceViewID() {
		return dataSourceViewID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSourceViewID(String newDataSourceViewID) {
		String oldDataSourceViewID = dataSourceViewID;
		dataSourceViewID = newDataSourceViewID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATA_SOURCE_VIEW_BINDING__DATA_SOURCE_VIEW_ID, oldDataSourceViewID, dataSourceViewID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmlaPackage.DATA_SOURCE_VIEW_BINDING__DATA_SOURCE_VIEW_ID:
				return getDataSourceViewID();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XmlaPackage.DATA_SOURCE_VIEW_BINDING__DATA_SOURCE_VIEW_ID:
				setDataSourceViewID((String)newValue);
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
			case XmlaPackage.DATA_SOURCE_VIEW_BINDING__DATA_SOURCE_VIEW_ID:
				setDataSourceViewID(DATA_SOURCE_VIEW_ID_EDEFAULT);
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
			case XmlaPackage.DATA_SOURCE_VIEW_BINDING__DATA_SOURCE_VIEW_ID:
				return DATA_SOURCE_VIEW_ID_EDEFAULT == null ? dataSourceViewID != null : !DATA_SOURCE_VIEW_ID_EDEFAULT.equals(dataSourceViewID);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (dataSourceViewID: ");
		result.append(dataSourceViewID);
		result.append(')');
		return result.toString();
	}

} //DataSourceViewBindingImpl
