/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.engine100.ReadWriteModeType;

import org.eclipse.daanse.xmla.model.ecore.xmla.Attach;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attach</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AttachImpl#getFolder <em>Folder</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AttachImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AttachImpl#isAllowOverwrite <em>Allow Overwrite</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AttachImpl#getReadWriteMode <em>Read Write Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttachImpl extends MinimalEObjectImpl.Container implements Attach {
	/**
	 * The default value of the '{@link #getFolder() <em>Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFolder()
	 * @generated
	 * @ordered
	 */
	protected static final String FOLDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFolder() <em>Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFolder()
	 * @generated
	 * @ordered
	 */
	protected String folder = FOLDER_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttachImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.ATTACH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFolder() {
		return folder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFolder(String newFolder) {
		String oldFolder = folder;
		folder = newFolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.ATTACH__FOLDER, oldFolder, folder));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.ATTACH__PASSWORD, oldPassword, password));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.ATTACH__ALLOW_OVERWRITE, oldAllowOverwrite, allowOverwrite, !oldAllowOverwriteESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.ATTACH__ALLOW_OVERWRITE, oldAllowOverwrite, ALLOW_OVERWRITE_EDEFAULT, oldAllowOverwriteESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.ATTACH__READ_WRITE_MODE, oldReadWriteMode, readWriteMode, !oldReadWriteModeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.ATTACH__READ_WRITE_MODE, oldReadWriteMode, READ_WRITE_MODE_EDEFAULT, oldReadWriteModeESet));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmlaPackage.ATTACH__FOLDER:
				return getFolder();
			case XmlaPackage.ATTACH__PASSWORD:
				return getPassword();
			case XmlaPackage.ATTACH__ALLOW_OVERWRITE:
				return isAllowOverwrite();
			case XmlaPackage.ATTACH__READ_WRITE_MODE:
				return getReadWriteMode();
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
			case XmlaPackage.ATTACH__FOLDER:
				setFolder((String)newValue);
				return;
			case XmlaPackage.ATTACH__PASSWORD:
				setPassword((String)newValue);
				return;
			case XmlaPackage.ATTACH__ALLOW_OVERWRITE:
				setAllowOverwrite((Boolean)newValue);
				return;
			case XmlaPackage.ATTACH__READ_WRITE_MODE:
				setReadWriteMode((ReadWriteModeType)newValue);
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
			case XmlaPackage.ATTACH__FOLDER:
				setFolder(FOLDER_EDEFAULT);
				return;
			case XmlaPackage.ATTACH__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case XmlaPackage.ATTACH__ALLOW_OVERWRITE:
				unsetAllowOverwrite();
				return;
			case XmlaPackage.ATTACH__READ_WRITE_MODE:
				unsetReadWriteMode();
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
			case XmlaPackage.ATTACH__FOLDER:
				return FOLDER_EDEFAULT == null ? folder != null : !FOLDER_EDEFAULT.equals(folder);
			case XmlaPackage.ATTACH__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case XmlaPackage.ATTACH__ALLOW_OVERWRITE:
				return isSetAllowOverwrite();
			case XmlaPackage.ATTACH__READ_WRITE_MODE:
				return isSetReadWriteMode();
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
		result.append(" (folder: ");
		result.append(folder);
		result.append(", password: ");
		result.append(password);
		result.append(", allowOverwrite: ");
		if (allowOverwriteESet) result.append(allowOverwrite); else result.append("<unset>");
		result.append(", readWriteMode: ");
		if (readWriteModeESet) result.append(readWriteMode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AttachImpl
