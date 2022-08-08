/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.Backup;
import org.eclipse.daanse.xmla.model.ecore.xmla.LocationsType2;
import org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference;
import org.eclipse.daanse.xmla.model.ecore.xmla.SecurityType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Backup</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BackupImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BackupImpl#getFile <em>File</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BackupImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BackupImpl#isApplyCompression <em>Apply Compression</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BackupImpl#isAllowOverwrite <em>Allow Overwrite</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BackupImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BackupImpl#isBackupRemotePartitions <em>Backup Remote Partitions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.BackupImpl#getLocations <em>Locations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BackupImpl extends MinimalEObjectImpl.Container implements Backup {
	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected ObjectReference object;

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
	protected static final SecurityType1 SECURITY_EDEFAULT = SecurityType1.SKIP_MEMBERSHIP;

	/**
	 * The cached value of the '{@link #getSecurity() <em>Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected SecurityType1 security = SECURITY_EDEFAULT;

	/**
	 * This is true if the Security attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean securityESet;

	/**
	 * The default value of the '{@link #isApplyCompression() <em>Apply Compression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplyCompression()
	 * @generated
	 * @ordered
	 */
	protected static final boolean APPLY_COMPRESSION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isApplyCompression() <em>Apply Compression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplyCompression()
	 * @generated
	 * @ordered
	 */
	protected boolean applyCompression = APPLY_COMPRESSION_EDEFAULT;

	/**
	 * This is true if the Apply Compression attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean applyCompressionESet;

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
	 * The default value of the '{@link #isBackupRemotePartitions() <em>Backup Remote Partitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBackupRemotePartitions()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BACKUP_REMOTE_PARTITIONS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBackupRemotePartitions() <em>Backup Remote Partitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBackupRemotePartitions()
	 * @generated
	 * @ordered
	 */
	protected boolean backupRemotePartitions = BACKUP_REMOTE_PARTITIONS_EDEFAULT;

	/**
	 * This is true if the Backup Remote Partitions attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean backupRemotePartitionsESet;

	/**
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected LocationsType2 locations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BackupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.BACKUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectReference getObject() {
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObject(ObjectReference newObject, NotificationChain msgs) {
		ObjectReference oldObject = object;
		object = newObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.BACKUP__OBJECT, oldObject, newObject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject(ObjectReference newObject) {
		if (newObject != object) {
			NotificationChain msgs = null;
			if (object != null)
				msgs = ((InternalEObject)object).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.BACKUP__OBJECT, null, msgs);
			if (newObject != null)
				msgs = ((InternalEObject)newObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.BACKUP__OBJECT, null, msgs);
			msgs = basicSetObject(newObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.BACKUP__OBJECT, newObject, newObject));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.BACKUP__FILE, oldFile, file));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityType1 getSecurity() {
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurity(SecurityType1 newSecurity) {
		SecurityType1 oldSecurity = security;
		security = newSecurity == null ? SECURITY_EDEFAULT : newSecurity;
		boolean oldSecurityESet = securityESet;
		securityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.BACKUP__SECURITY, oldSecurity, security, !oldSecurityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSecurity() {
		SecurityType1 oldSecurity = security;
		boolean oldSecurityESet = securityESet;
		security = SECURITY_EDEFAULT;
		securityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.BACKUP__SECURITY, oldSecurity, SECURITY_EDEFAULT, oldSecurityESet));
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
	public boolean isApplyCompression() {
		return applyCompression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplyCompression(boolean newApplyCompression) {
		boolean oldApplyCompression = applyCompression;
		applyCompression = newApplyCompression;
		boolean oldApplyCompressionESet = applyCompressionESet;
		applyCompressionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.BACKUP__APPLY_COMPRESSION, oldApplyCompression, applyCompression, !oldApplyCompressionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetApplyCompression() {
		boolean oldApplyCompression = applyCompression;
		boolean oldApplyCompressionESet = applyCompressionESet;
		applyCompression = APPLY_COMPRESSION_EDEFAULT;
		applyCompressionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.BACKUP__APPLY_COMPRESSION, oldApplyCompression, APPLY_COMPRESSION_EDEFAULT, oldApplyCompressionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetApplyCompression() {
		return applyCompressionESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.BACKUP__ALLOW_OVERWRITE, oldAllowOverwrite, allowOverwrite, !oldAllowOverwriteESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.BACKUP__ALLOW_OVERWRITE, oldAllowOverwrite, ALLOW_OVERWRITE_EDEFAULT, oldAllowOverwriteESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.BACKUP__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBackupRemotePartitions() {
		return backupRemotePartitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackupRemotePartitions(boolean newBackupRemotePartitions) {
		boolean oldBackupRemotePartitions = backupRemotePartitions;
		backupRemotePartitions = newBackupRemotePartitions;
		boolean oldBackupRemotePartitionsESet = backupRemotePartitionsESet;
		backupRemotePartitionsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.BACKUP__BACKUP_REMOTE_PARTITIONS, oldBackupRemotePartitions, backupRemotePartitions, !oldBackupRemotePartitionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBackupRemotePartitions() {
		boolean oldBackupRemotePartitions = backupRemotePartitions;
		boolean oldBackupRemotePartitionsESet = backupRemotePartitionsESet;
		backupRemotePartitions = BACKUP_REMOTE_PARTITIONS_EDEFAULT;
		backupRemotePartitionsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.BACKUP__BACKUP_REMOTE_PARTITIONS, oldBackupRemotePartitions, BACKUP_REMOTE_PARTITIONS_EDEFAULT, oldBackupRemotePartitionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBackupRemotePartitions() {
		return backupRemotePartitionsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationsType2 getLocations() {
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocations(LocationsType2 newLocations, NotificationChain msgs) {
		LocationsType2 oldLocations = locations;
		locations = newLocations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.BACKUP__LOCATIONS, oldLocations, newLocations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocations(LocationsType2 newLocations) {
		if (newLocations != locations) {
			NotificationChain msgs = null;
			if (locations != null)
				msgs = ((InternalEObject)locations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.BACKUP__LOCATIONS, null, msgs);
			if (newLocations != null)
				msgs = ((InternalEObject)newLocations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.BACKUP__LOCATIONS, null, msgs);
			msgs = basicSetLocations(newLocations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.BACKUP__LOCATIONS, newLocations, newLocations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.BACKUP__OBJECT:
				return basicSetObject(null, msgs);
			case XmlaPackage.BACKUP__LOCATIONS:
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
			case XmlaPackage.BACKUP__OBJECT:
				return getObject();
			case XmlaPackage.BACKUP__FILE:
				return getFile();
			case XmlaPackage.BACKUP__SECURITY:
				return getSecurity();
			case XmlaPackage.BACKUP__APPLY_COMPRESSION:
				return isApplyCompression();
			case XmlaPackage.BACKUP__ALLOW_OVERWRITE:
				return isAllowOverwrite();
			case XmlaPackage.BACKUP__PASSWORD:
				return getPassword();
			case XmlaPackage.BACKUP__BACKUP_REMOTE_PARTITIONS:
				return isBackupRemotePartitions();
			case XmlaPackage.BACKUP__LOCATIONS:
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
			case XmlaPackage.BACKUP__OBJECT:
				setObject((ObjectReference)newValue);
				return;
			case XmlaPackage.BACKUP__FILE:
				setFile((String)newValue);
				return;
			case XmlaPackage.BACKUP__SECURITY:
				setSecurity((SecurityType1)newValue);
				return;
			case XmlaPackage.BACKUP__APPLY_COMPRESSION:
				setApplyCompression((Boolean)newValue);
				return;
			case XmlaPackage.BACKUP__ALLOW_OVERWRITE:
				setAllowOverwrite((Boolean)newValue);
				return;
			case XmlaPackage.BACKUP__PASSWORD:
				setPassword((String)newValue);
				return;
			case XmlaPackage.BACKUP__BACKUP_REMOTE_PARTITIONS:
				setBackupRemotePartitions((Boolean)newValue);
				return;
			case XmlaPackage.BACKUP__LOCATIONS:
				setLocations((LocationsType2)newValue);
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
			case XmlaPackage.BACKUP__OBJECT:
				setObject((ObjectReference)null);
				return;
			case XmlaPackage.BACKUP__FILE:
				setFile(FILE_EDEFAULT);
				return;
			case XmlaPackage.BACKUP__SECURITY:
				unsetSecurity();
				return;
			case XmlaPackage.BACKUP__APPLY_COMPRESSION:
				unsetApplyCompression();
				return;
			case XmlaPackage.BACKUP__ALLOW_OVERWRITE:
				unsetAllowOverwrite();
				return;
			case XmlaPackage.BACKUP__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case XmlaPackage.BACKUP__BACKUP_REMOTE_PARTITIONS:
				unsetBackupRemotePartitions();
				return;
			case XmlaPackage.BACKUP__LOCATIONS:
				setLocations((LocationsType2)null);
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
			case XmlaPackage.BACKUP__OBJECT:
				return object != null;
			case XmlaPackage.BACKUP__FILE:
				return FILE_EDEFAULT == null ? file != null : !FILE_EDEFAULT.equals(file);
			case XmlaPackage.BACKUP__SECURITY:
				return isSetSecurity();
			case XmlaPackage.BACKUP__APPLY_COMPRESSION:
				return isSetApplyCompression();
			case XmlaPackage.BACKUP__ALLOW_OVERWRITE:
				return isSetAllowOverwrite();
			case XmlaPackage.BACKUP__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case XmlaPackage.BACKUP__BACKUP_REMOTE_PARTITIONS:
				return isSetBackupRemotePartitions();
			case XmlaPackage.BACKUP__LOCATIONS:
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
		result.append(" (file: ");
		result.append(file);
		result.append(", security: ");
		if (securityESet) result.append(security); else result.append("<unset>");
		result.append(", applyCompression: ");
		if (applyCompressionESet) result.append(applyCompression); else result.append("<unset>");
		result.append(", allowOverwrite: ");
		if (allowOverwriteESet) result.append(allowOverwrite); else result.append("<unset>");
		result.append(", password: ");
		result.append(password);
		result.append(", backupRemotePartitions: ");
		if (backupRemotePartitionsESet) result.append(backupRemotePartitions); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BackupImpl
