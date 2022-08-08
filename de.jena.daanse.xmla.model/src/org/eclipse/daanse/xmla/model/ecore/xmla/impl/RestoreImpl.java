/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.engine100.ReadWriteModeType;

import org.eclipse.daanse.xmla.model.ecore.xmla.LocationsType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.Restore;
import org.eclipse.daanse.xmla.model.ecore.xmla.SecurityType;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Restore</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.RestoreImpl#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.RestoreImpl#getDatabaseID <em>Database ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.RestoreImpl#getFile <em>File</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.RestoreImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.RestoreImpl#isAllowOverwrite <em>Allow Overwrite</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.RestoreImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.RestoreImpl#getDbStorageLocation <em>Db Storage Location</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.RestoreImpl#getReadWriteMode <em>Read Write Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.RestoreImpl#getLocations <em>Locations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RestoreImpl extends MinimalEObjectImpl.Container implements Restore {
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
	 * The default value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected String file = FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecurity() <em>Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected static final SecurityType SECURITY_EDEFAULT = SecurityType.SKIP_MEMBERSHIP;

	/**
	 * The cached value of the '{@link #getSecurity() <em>Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected SecurityType security = SECURITY_EDEFAULT;

	/**
	 * This is true if the Security attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean securityESet;

	/**
	 * The default value of the '{@link #isAllowOverwrite() <em>Allow Overwrite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowOverwrite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_OVERWRITE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowOverwrite() <em>Allow Overwrite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowOverwrite()
	 * @generated
	 * @ordered
	 */
	protected boolean allowOverwrite = ALLOW_OVERWRITE_EDEFAULT;

	/**
	 * This is true if the Allow Overwrite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean allowOverwriteESet;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

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
	 * The default value of the '{@link #getReadWriteMode() <em>Read Write Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadWriteMode()
	 * @generated
	 * @ordered
	 */
	protected static final ReadWriteModeType READ_WRITE_MODE_EDEFAULT = ReadWriteModeType.READ_WRITE;

	/**
	 * The cached value of the '{@link #getReadWriteMode() <em>Read Write Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadWriteMode()
	 * @generated
	 * @ordered
	 */
	protected ReadWriteModeType readWriteMode = READ_WRITE_MODE_EDEFAULT;

	/**
	 * This is true if the Read Write Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean readWriteModeESet;

	/**
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected LocationsType1 locations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.RESTORE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.RESTORE__DATABASE_NAME, oldDatabaseName, databaseName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.RESTORE__DATABASE_ID, oldDatabaseID, databaseID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFile() {
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFile(String newFile) {
		String oldFile = file;
		file = newFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.RESTORE__FILE, oldFile, file));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityType getSecurity() {
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurity(SecurityType newSecurity) {
		SecurityType oldSecurity = security;
		security = newSecurity == null ? SECURITY_EDEFAULT : newSecurity;
		boolean oldSecurityESet = securityESet;
		securityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.RESTORE__SECURITY, oldSecurity, security, !oldSecurityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSecurity() {
		SecurityType oldSecurity = security;
		boolean oldSecurityESet = securityESet;
		security = SECURITY_EDEFAULT;
		securityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.RESTORE__SECURITY, oldSecurity, SECURITY_EDEFAULT, oldSecurityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSecurity() {
		return securityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllowOverwrite() {
		return allowOverwrite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowOverwrite(boolean newAllowOverwrite) {
		boolean oldAllowOverwrite = allowOverwrite;
		allowOverwrite = newAllowOverwrite;
		boolean oldAllowOverwriteESet = allowOverwriteESet;
		allowOverwriteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.RESTORE__ALLOW_OVERWRITE, oldAllowOverwrite, allowOverwrite, !oldAllowOverwriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAllowOverwrite() {
		boolean oldAllowOverwrite = allowOverwrite;
		boolean oldAllowOverwriteESet = allowOverwriteESet;
		allowOverwrite = ALLOW_OVERWRITE_EDEFAULT;
		allowOverwriteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.RESTORE__ALLOW_OVERWRITE, oldAllowOverwrite, ALLOW_OVERWRITE_EDEFAULT, oldAllowOverwriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAllowOverwrite() {
		return allowOverwriteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.RESTORE__PASSWORD, oldPassword, password));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.RESTORE__DB_STORAGE_LOCATION, oldDbStorageLocation, dbStorageLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadWriteModeType getReadWriteMode() {
		return readWriteMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadWriteMode(ReadWriteModeType newReadWriteMode) {
		ReadWriteModeType oldReadWriteMode = readWriteMode;
		readWriteMode = newReadWriteMode == null ? READ_WRITE_MODE_EDEFAULT : newReadWriteMode;
		boolean oldReadWriteModeESet = readWriteModeESet;
		readWriteModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.RESTORE__READ_WRITE_MODE, oldReadWriteMode, readWriteMode, !oldReadWriteModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReadWriteMode() {
		ReadWriteModeType oldReadWriteMode = readWriteMode;
		boolean oldReadWriteModeESet = readWriteModeESet;
		readWriteMode = READ_WRITE_MODE_EDEFAULT;
		readWriteModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.RESTORE__READ_WRITE_MODE, oldReadWriteMode, READ_WRITE_MODE_EDEFAULT, oldReadWriteModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReadWriteMode() {
		return readWriteModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationsType1 getLocations() {
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocations(LocationsType1 newLocations, NotificationChain msgs) {
		LocationsType1 oldLocations = locations;
		locations = newLocations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.RESTORE__LOCATIONS, oldLocations, newLocations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocations(LocationsType1 newLocations) {
		if (newLocations != locations) {
			NotificationChain msgs = null;
			if (locations != null)
				msgs = ((InternalEObject)locations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.RESTORE__LOCATIONS, null, msgs);
			if (newLocations != null)
				msgs = ((InternalEObject)newLocations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.RESTORE__LOCATIONS, null, msgs);
			msgs = basicSetLocations(newLocations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.RESTORE__LOCATIONS, newLocations, newLocations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.RESTORE__LOCATIONS:
				return basicSetLocations(null, msgs);
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
			case XmlaPackage.RESTORE__DATABASE_NAME:
				return getDatabaseName();
			case XmlaPackage.RESTORE__DATABASE_ID:
				return getDatabaseID();
			case XmlaPackage.RESTORE__FILE:
				return getFile();
			case XmlaPackage.RESTORE__SECURITY:
				return getSecurity();
			case XmlaPackage.RESTORE__ALLOW_OVERWRITE:
				return isAllowOverwrite();
			case XmlaPackage.RESTORE__PASSWORD:
				return getPassword();
			case XmlaPackage.RESTORE__DB_STORAGE_LOCATION:
				return getDbStorageLocation();
			case XmlaPackage.RESTORE__READ_WRITE_MODE:
				return getReadWriteMode();
			case XmlaPackage.RESTORE__LOCATIONS:
				return getLocations();
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
			case XmlaPackage.RESTORE__DATABASE_NAME:
				setDatabaseName((String)newValue);
				return;
			case XmlaPackage.RESTORE__DATABASE_ID:
				setDatabaseID((String)newValue);
				return;
			case XmlaPackage.RESTORE__FILE:
				setFile((String)newValue);
				return;
			case XmlaPackage.RESTORE__SECURITY:
				setSecurity((SecurityType)newValue);
				return;
			case XmlaPackage.RESTORE__ALLOW_OVERWRITE:
				setAllowOverwrite((Boolean)newValue);
				return;
			case XmlaPackage.RESTORE__PASSWORD:
				setPassword((String)newValue);
				return;
			case XmlaPackage.RESTORE__DB_STORAGE_LOCATION:
				setDbStorageLocation((String)newValue);
				return;
			case XmlaPackage.RESTORE__READ_WRITE_MODE:
				setReadWriteMode((ReadWriteModeType)newValue);
				return;
			case XmlaPackage.RESTORE__LOCATIONS:
				setLocations((LocationsType1)newValue);
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
			case XmlaPackage.RESTORE__DATABASE_NAME:
				setDatabaseName(DATABASE_NAME_EDEFAULT);
				return;
			case XmlaPackage.RESTORE__DATABASE_ID:
				setDatabaseID(DATABASE_ID_EDEFAULT);
				return;
			case XmlaPackage.RESTORE__FILE:
				setFile(FILE_EDEFAULT);
				return;
			case XmlaPackage.RESTORE__SECURITY:
				unsetSecurity();
				return;
			case XmlaPackage.RESTORE__ALLOW_OVERWRITE:
				unsetAllowOverwrite();
				return;
			case XmlaPackage.RESTORE__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case XmlaPackage.RESTORE__DB_STORAGE_LOCATION:
				setDbStorageLocation(DB_STORAGE_LOCATION_EDEFAULT);
				return;
			case XmlaPackage.RESTORE__READ_WRITE_MODE:
				unsetReadWriteMode();
				return;
			case XmlaPackage.RESTORE__LOCATIONS:
				setLocations((LocationsType1)null);
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
			case XmlaPackage.RESTORE__DATABASE_NAME:
				return DATABASE_NAME_EDEFAULT == null ? databaseName != null : !DATABASE_NAME_EDEFAULT.equals(databaseName);
			case XmlaPackage.RESTORE__DATABASE_ID:
				return DATABASE_ID_EDEFAULT == null ? databaseID != null : !DATABASE_ID_EDEFAULT.equals(databaseID);
			case XmlaPackage.RESTORE__FILE:
				return FILE_EDEFAULT == null ? file != null : !FILE_EDEFAULT.equals(file);
			case XmlaPackage.RESTORE__SECURITY:
				return isSetSecurity();
			case XmlaPackage.RESTORE__ALLOW_OVERWRITE:
				return isSetAllowOverwrite();
			case XmlaPackage.RESTORE__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case XmlaPackage.RESTORE__DB_STORAGE_LOCATION:
				return DB_STORAGE_LOCATION_EDEFAULT == null ? dbStorageLocation != null : !DB_STORAGE_LOCATION_EDEFAULT.equals(dbStorageLocation);
			case XmlaPackage.RESTORE__READ_WRITE_MODE:
				return isSetReadWriteMode();
			case XmlaPackage.RESTORE__LOCATIONS:
				return locations != null;
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
		result.append(" (databaseName: ");
		result.append(databaseName);
		result.append(", databaseID: ");
		result.append(databaseID);
		result.append(", file: ");
		result.append(file);
		result.append(", security: ");
		if (securityESet) result.append(security); else result.append("<unset>");
		result.append(", allowOverwrite: ");
		if (allowOverwriteESet) result.append(allowOverwrite); else result.append("<unset>");
		result.append(", password: ");
		result.append(password);
		result.append(", dbStorageLocation: ");
		result.append(dbStorageLocation);
		result.append(", readWriteMode: ");
		if (readWriteModeESet) result.append(readWriteMode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RestoreImpl
