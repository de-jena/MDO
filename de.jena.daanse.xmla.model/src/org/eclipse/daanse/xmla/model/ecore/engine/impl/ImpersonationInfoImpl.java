/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine.impl;

import org.eclipse.daanse.xmla.model.ecore.engine.EnginePackage;
import org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationInfo;
import org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationInfoSecurityType;
import org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationModeType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Impersonation Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine.impl.ImpersonationInfoImpl#getImpersonationMode <em>Impersonation Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine.impl.ImpersonationInfoImpl#getAccount <em>Account</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine.impl.ImpersonationInfoImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine.impl.ImpersonationInfoImpl#getImpersonationInfoSecurity <em>Impersonation Info Security</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImpersonationInfoImpl extends MinimalEObjectImpl.Container implements ImpersonationInfo {
	/**
	 * The default value of the '{@link #getImpersonationMode() <em>Impersonation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpersonationMode()
	 * @generated
	 * @ordered
	 */
	protected static final ImpersonationModeType IMPERSONATION_MODE_EDEFAULT = ImpersonationModeType.DEFAULT;

	/**
	 * The cached value of the '{@link #getImpersonationMode() <em>Impersonation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpersonationMode()
	 * @generated
	 * @ordered
	 */
	protected ImpersonationModeType impersonationMode = IMPERSONATION_MODE_EDEFAULT;

	/**
	 * This is true if the Impersonation Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean impersonationModeESet;

	/**
	 * The default value of the '{@link #getAccount() <em>Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccount()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccount() <em>Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccount()
	 * @generated
	 * @ordered
	 */
	protected String account = ACCOUNT_EDEFAULT;

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
	 * The default value of the '{@link #getImpersonationInfoSecurity() <em>Impersonation Info Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpersonationInfoSecurity()
	 * @generated
	 * @ordered
	 */
	protected static final ImpersonationInfoSecurityType IMPERSONATION_INFO_SECURITY_EDEFAULT = ImpersonationInfoSecurityType.PASSWORD_REMOVED;

	/**
	 * The cached value of the '{@link #getImpersonationInfoSecurity() <em>Impersonation Info Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpersonationInfoSecurity()
	 * @generated
	 * @ordered
	 */
	protected ImpersonationInfoSecurityType impersonationInfoSecurity = IMPERSONATION_INFO_SECURITY_EDEFAULT;

	/**
	 * This is true if the Impersonation Info Security attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean impersonationInfoSecurityESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImpersonationInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnginePackage.Literals.IMPERSONATION_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImpersonationModeType getImpersonationMode() {
		return impersonationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpersonationMode(ImpersonationModeType newImpersonationMode) {
		ImpersonationModeType oldImpersonationMode = impersonationMode;
		impersonationMode = newImpersonationMode == null ? IMPERSONATION_MODE_EDEFAULT : newImpersonationMode;
		boolean oldImpersonationModeESet = impersonationModeESet;
		impersonationModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnginePackage.IMPERSONATION_INFO__IMPERSONATION_MODE, oldImpersonationMode, impersonationMode, !oldImpersonationModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetImpersonationMode() {
		ImpersonationModeType oldImpersonationMode = impersonationMode;
		boolean oldImpersonationModeESet = impersonationModeESet;
		impersonationMode = IMPERSONATION_MODE_EDEFAULT;
		impersonationModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EnginePackage.IMPERSONATION_INFO__IMPERSONATION_MODE, oldImpersonationMode, IMPERSONATION_MODE_EDEFAULT, oldImpersonationModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetImpersonationMode() {
		return impersonationModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccount() {
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccount(String newAccount) {
		String oldAccount = account;
		account = newAccount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnginePackage.IMPERSONATION_INFO__ACCOUNT, oldAccount, account));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EnginePackage.IMPERSONATION_INFO__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImpersonationInfoSecurityType getImpersonationInfoSecurity() {
		return impersonationInfoSecurity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpersonationInfoSecurity(ImpersonationInfoSecurityType newImpersonationInfoSecurity) {
		ImpersonationInfoSecurityType oldImpersonationInfoSecurity = impersonationInfoSecurity;
		impersonationInfoSecurity = newImpersonationInfoSecurity == null ? IMPERSONATION_INFO_SECURITY_EDEFAULT : newImpersonationInfoSecurity;
		boolean oldImpersonationInfoSecurityESet = impersonationInfoSecurityESet;
		impersonationInfoSecurityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnginePackage.IMPERSONATION_INFO__IMPERSONATION_INFO_SECURITY, oldImpersonationInfoSecurity, impersonationInfoSecurity, !oldImpersonationInfoSecurityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetImpersonationInfoSecurity() {
		ImpersonationInfoSecurityType oldImpersonationInfoSecurity = impersonationInfoSecurity;
		boolean oldImpersonationInfoSecurityESet = impersonationInfoSecurityESet;
		impersonationInfoSecurity = IMPERSONATION_INFO_SECURITY_EDEFAULT;
		impersonationInfoSecurityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EnginePackage.IMPERSONATION_INFO__IMPERSONATION_INFO_SECURITY, oldImpersonationInfoSecurity, IMPERSONATION_INFO_SECURITY_EDEFAULT, oldImpersonationInfoSecurityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetImpersonationInfoSecurity() {
		return impersonationInfoSecurityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EnginePackage.IMPERSONATION_INFO__IMPERSONATION_MODE:
				return getImpersonationMode();
			case EnginePackage.IMPERSONATION_INFO__ACCOUNT:
				return getAccount();
			case EnginePackage.IMPERSONATION_INFO__PASSWORD:
				return getPassword();
			case EnginePackage.IMPERSONATION_INFO__IMPERSONATION_INFO_SECURITY:
				return getImpersonationInfoSecurity();
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
			case EnginePackage.IMPERSONATION_INFO__IMPERSONATION_MODE:
				setImpersonationMode((ImpersonationModeType)newValue);
				return;
			case EnginePackage.IMPERSONATION_INFO__ACCOUNT:
				setAccount((String)newValue);
				return;
			case EnginePackage.IMPERSONATION_INFO__PASSWORD:
				setPassword((String)newValue);
				return;
			case EnginePackage.IMPERSONATION_INFO__IMPERSONATION_INFO_SECURITY:
				setImpersonationInfoSecurity((ImpersonationInfoSecurityType)newValue);
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
			case EnginePackage.IMPERSONATION_INFO__IMPERSONATION_MODE:
				unsetImpersonationMode();
				return;
			case EnginePackage.IMPERSONATION_INFO__ACCOUNT:
				setAccount(ACCOUNT_EDEFAULT);
				return;
			case EnginePackage.IMPERSONATION_INFO__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case EnginePackage.IMPERSONATION_INFO__IMPERSONATION_INFO_SECURITY:
				unsetImpersonationInfoSecurity();
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
			case EnginePackage.IMPERSONATION_INFO__IMPERSONATION_MODE:
				return isSetImpersonationMode();
			case EnginePackage.IMPERSONATION_INFO__ACCOUNT:
				return ACCOUNT_EDEFAULT == null ? account != null : !ACCOUNT_EDEFAULT.equals(account);
			case EnginePackage.IMPERSONATION_INFO__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case EnginePackage.IMPERSONATION_INFO__IMPERSONATION_INFO_SECURITY:
				return isSetImpersonationInfoSecurity();
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
		result.append(" (impersonationMode: ");
		if (impersonationModeESet) result.append(impersonationMode); else result.append("<unset>");
		result.append(", account: ");
		result.append(account);
		result.append(", password: ");
		result.append(password);
		result.append(", impersonationInfoSecurity: ");
		if (impersonationInfoSecurityESet) result.append(impersonationInfoSecurity); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ImpersonationInfoImpl
