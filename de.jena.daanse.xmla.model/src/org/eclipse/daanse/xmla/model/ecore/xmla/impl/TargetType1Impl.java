/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.TargetType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TargetType1Impl#getDbStorageLocation <em>Db Storage Location</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TargetType1Impl#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TargetType1Impl#getDatabaseID <em>Database ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TargetType1Impl extends MinimalEObjectImpl.Container implements TargetType1 {
	/**
	 * The default value of the '{@link #getDbStorageLocation() <em>Db Storage Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbStorageLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String DB_STORAGE_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbStorageLocation() <em>Db Storage Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbStorageLocation()
	 * @generated
	 * @ordered
	 */
	protected String dbStorageLocation = DB_STORAGE_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatabaseName() <em>Database Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseName()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatabaseName() <em>Database Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseName()
	 * @generated
	 * @ordered
	 */
	protected String databaseName = DATABASE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatabaseID() <em>Database ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseID()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatabaseID() <em>Database ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseID()
	 * @generated
	 * @ordered
	 */
	protected String databaseID = DATABASE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.TARGET_TYPE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDbStorageLocation() {
		return dbStorageLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbStorageLocation(String newDbStorageLocation) {
		String oldDbStorageLocation = dbStorageLocation;
		dbStorageLocation = newDbStorageLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TARGET_TYPE1__DB_STORAGE_LOCATION, oldDbStorageLocation, dbStorageLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatabaseName() {
		return databaseName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseName(String newDatabaseName) {
		String oldDatabaseName = databaseName;
		databaseName = newDatabaseName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TARGET_TYPE1__DATABASE_NAME, oldDatabaseName, databaseName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatabaseID() {
		return databaseID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseID(String newDatabaseID) {
		String oldDatabaseID = databaseID;
		databaseID = newDatabaseID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TARGET_TYPE1__DATABASE_ID, oldDatabaseID, databaseID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmlaPackage.TARGET_TYPE1__DB_STORAGE_LOCATION:
				return getDbStorageLocation();
			case XmlaPackage.TARGET_TYPE1__DATABASE_NAME:
				return getDatabaseName();
			case XmlaPackage.TARGET_TYPE1__DATABASE_ID:
				return getDatabaseID();
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
			case XmlaPackage.TARGET_TYPE1__DB_STORAGE_LOCATION:
				setDbStorageLocation((String)newValue);
				return;
			case XmlaPackage.TARGET_TYPE1__DATABASE_NAME:
				setDatabaseName((String)newValue);
				return;
			case XmlaPackage.TARGET_TYPE1__DATABASE_ID:
				setDatabaseID((String)newValue);
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
			case XmlaPackage.TARGET_TYPE1__DB_STORAGE_LOCATION:
				setDbStorageLocation(DB_STORAGE_LOCATION_EDEFAULT);
				return;
			case XmlaPackage.TARGET_TYPE1__DATABASE_NAME:
				setDatabaseName(DATABASE_NAME_EDEFAULT);
				return;
			case XmlaPackage.TARGET_TYPE1__DATABASE_ID:
				setDatabaseID(DATABASE_ID_EDEFAULT);
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
			case XmlaPackage.TARGET_TYPE1__DB_STORAGE_LOCATION:
				return DB_STORAGE_LOCATION_EDEFAULT == null ? dbStorageLocation != null : !DB_STORAGE_LOCATION_EDEFAULT.equals(dbStorageLocation);
			case XmlaPackage.TARGET_TYPE1__DATABASE_NAME:
				return DATABASE_NAME_EDEFAULT == null ? databaseName != null : !DATABASE_NAME_EDEFAULT.equals(databaseName);
			case XmlaPackage.TARGET_TYPE1__DATABASE_ID:
				return DATABASE_ID_EDEFAULT == null ? databaseID != null : !DATABASE_ID_EDEFAULT.equals(databaseID);
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
		result.append(" (dbStorageLocation: ");
		result.append(dbStorageLocation);
		result.append(", databaseName: ");
		result.append(databaseName);
		result.append(", databaseID: ");
		result.append(databaseID);
		result.append(')');
		return result.toString();
	}

} //TargetType1Impl
