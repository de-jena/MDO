/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.ColumnBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ColumnBindingImpl#getTableID <em>Table ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ColumnBindingImpl#getColumnID <em>Column ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColumnBindingImpl extends BindingImpl implements ColumnBinding {
	/**
	 * The default value of the '{@link #getTableID() <em>Table ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableID()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTableID() <em>Table ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableID()
	 * @generated
	 * @ordered
	 */
	protected String tableID = TABLE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnID() <em>Column ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnID()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnID() <em>Column ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnID()
	 * @generated
	 * @ordered
	 */
	protected String columnID = COLUMN_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.COLUMN_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTableID() {
		return tableID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableID(String newTableID) {
		String oldTableID = tableID;
		tableID = newTableID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.COLUMN_BINDING__TABLE_ID, oldTableID, tableID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnID() {
		return columnID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnID(String newColumnID) {
		String oldColumnID = columnID;
		columnID = newColumnID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.COLUMN_BINDING__COLUMN_ID, oldColumnID, columnID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmlaPackage.COLUMN_BINDING__TABLE_ID:
				return getTableID();
			case XmlaPackage.COLUMN_BINDING__COLUMN_ID:
				return getColumnID();
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
			case XmlaPackage.COLUMN_BINDING__TABLE_ID:
				setTableID((String)newValue);
				return;
			case XmlaPackage.COLUMN_BINDING__COLUMN_ID:
				setColumnID((String)newValue);
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
			case XmlaPackage.COLUMN_BINDING__TABLE_ID:
				setTableID(TABLE_ID_EDEFAULT);
				return;
			case XmlaPackage.COLUMN_BINDING__COLUMN_ID:
				setColumnID(COLUMN_ID_EDEFAULT);
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
			case XmlaPackage.COLUMN_BINDING__TABLE_ID:
				return TABLE_ID_EDEFAULT == null ? tableID != null : !TABLE_ID_EDEFAULT.equals(tableID);
			case XmlaPackage.COLUMN_BINDING__COLUMN_ID:
				return COLUMN_ID_EDEFAULT == null ? columnID != null : !COLUMN_ID_EDEFAULT.equals(columnID);
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
		result.append(" (tableID: ");
		result.append(tableID);
		result.append(", columnID: ");
		result.append(columnID);
		result.append(')');
		return result.toString();
	}

} //ColumnBindingImpl
