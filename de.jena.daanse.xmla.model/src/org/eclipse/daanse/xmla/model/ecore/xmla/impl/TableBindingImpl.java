/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.TableBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TableBindingImpl#getDataSourceID <em>Data Source ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TableBindingImpl#getDbTableName <em>Db Table Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TableBindingImpl#getDbSchemaName <em>Db Schema Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableBindingImpl extends TabularBindingImpl implements TableBinding {
	/**
	 * The default value of the '{@link #getDataSourceID() <em>Data Source ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSourceID()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_SOURCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataSourceID() <em>Data Source ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSourceID()
	 * @generated
	 * @ordered
	 */
	protected String dataSourceID = DATA_SOURCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbTableName() <em>Db Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbTableName()
	 * @generated
	 * @ordered
	 */
	protected static final String DB_TABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbTableName() <em>Db Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbTableName()
	 * @generated
	 * @ordered
	 */
	protected String dbTableName = DB_TABLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbSchemaName() <em>Db Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbSchemaName()
	 * @generated
	 * @ordered
	 */
	protected static final String DB_SCHEMA_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbSchemaName() <em>Db Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbSchemaName()
	 * @generated
	 * @ordered
	 */
	protected String dbSchemaName = DB_SCHEMA_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.TABLE_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataSourceID() {
		return dataSourceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSourceID(String newDataSourceID) {
		String oldDataSourceID = dataSourceID;
		dataSourceID = newDataSourceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TABLE_BINDING__DATA_SOURCE_ID, oldDataSourceID, dataSourceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDbTableName() {
		return dbTableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbTableName(String newDbTableName) {
		String oldDbTableName = dbTableName;
		dbTableName = newDbTableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TABLE_BINDING__DB_TABLE_NAME, oldDbTableName, dbTableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDbSchemaName() {
		return dbSchemaName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbSchemaName(String newDbSchemaName) {
		String oldDbSchemaName = dbSchemaName;
		dbSchemaName = newDbSchemaName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TABLE_BINDING__DB_SCHEMA_NAME, oldDbSchemaName, dbSchemaName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmlaPackage.TABLE_BINDING__DATA_SOURCE_ID:
				return getDataSourceID();
			case XmlaPackage.TABLE_BINDING__DB_TABLE_NAME:
				return getDbTableName();
			case XmlaPackage.TABLE_BINDING__DB_SCHEMA_NAME:
				return getDbSchemaName();
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
			case XmlaPackage.TABLE_BINDING__DATA_SOURCE_ID:
				setDataSourceID((String)newValue);
				return;
			case XmlaPackage.TABLE_BINDING__DB_TABLE_NAME:
				setDbTableName((String)newValue);
				return;
			case XmlaPackage.TABLE_BINDING__DB_SCHEMA_NAME:
				setDbSchemaName((String)newValue);
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
			case XmlaPackage.TABLE_BINDING__DATA_SOURCE_ID:
				setDataSourceID(DATA_SOURCE_ID_EDEFAULT);
				return;
			case XmlaPackage.TABLE_BINDING__DB_TABLE_NAME:
				setDbTableName(DB_TABLE_NAME_EDEFAULT);
				return;
			case XmlaPackage.TABLE_BINDING__DB_SCHEMA_NAME:
				setDbSchemaName(DB_SCHEMA_NAME_EDEFAULT);
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
			case XmlaPackage.TABLE_BINDING__DATA_SOURCE_ID:
				return DATA_SOURCE_ID_EDEFAULT == null ? dataSourceID != null : !DATA_SOURCE_ID_EDEFAULT.equals(dataSourceID);
			case XmlaPackage.TABLE_BINDING__DB_TABLE_NAME:
				return DB_TABLE_NAME_EDEFAULT == null ? dbTableName != null : !DB_TABLE_NAME_EDEFAULT.equals(dbTableName);
			case XmlaPackage.TABLE_BINDING__DB_SCHEMA_NAME:
				return DB_SCHEMA_NAME_EDEFAULT == null ? dbSchemaName != null : !DB_SCHEMA_NAME_EDEFAULT.equals(dbSchemaName);
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
		result.append(" (dataSourceID: ");
		result.append(dataSourceID);
		result.append(", dbTableName: ");
		result.append(dbTableName);
		result.append(", dbSchemaName: ");
		result.append(dbSchemaName);
		result.append(')');
		return result.toString();
	}

} //TableBindingImpl
