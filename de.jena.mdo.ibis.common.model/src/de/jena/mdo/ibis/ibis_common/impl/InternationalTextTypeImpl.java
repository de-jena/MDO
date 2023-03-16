/*
 */
package de.jena.mdo.ibis.ibis_common.impl;

import de.jena.mdo.ibis.ibis_common.IbisCommonPackage;
import de.jena.mdo.ibis.ibis_common.InternationalTextType;

import de.jena.mdo.ibis.ibis_enumerations.ErrorCodeEnumeration;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>International Text Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.InternationalTextTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.InternationalTextTypeImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.InternationalTextTypeImpl#getErrorCode <em>Error Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternationalTextTypeImpl extends MinimalEObjectImpl.Container implements InternationalTextType {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getErrorCode() <em>Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorCode()
	 * @generated
	 * @ordered
	 */
	protected static final ErrorCodeEnumeration ERROR_CODE_EDEFAULT = ErrorCodeEnumeration.DATA_ESTIMATED;

	/**
	 * The cached value of the '{@link #getErrorCode() <em>Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorCode()
	 * @generated
	 * @ordered
	 */
	protected ErrorCodeEnumeration errorCode = ERROR_CODE_EDEFAULT;

	/**
	 * This is true if the Error Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean errorCodeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternationalTextTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.Literals.INTERNATIONAL_TEXT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.INTERNATIONAL_TEXT_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.INTERNATIONAL_TEXT_TYPE__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErrorCodeEnumeration getErrorCode() {
		return errorCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorCode(ErrorCodeEnumeration newErrorCode) {
		ErrorCodeEnumeration oldErrorCode = errorCode;
		errorCode = newErrorCode == null ? ERROR_CODE_EDEFAULT : newErrorCode;
		boolean oldErrorCodeESet = errorCodeESet;
		errorCodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.INTERNATIONAL_TEXT_TYPE__ERROR_CODE, oldErrorCode, errorCode, !oldErrorCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetErrorCode() {
		ErrorCodeEnumeration oldErrorCode = errorCode;
		boolean oldErrorCodeESet = errorCodeESet;
		errorCode = ERROR_CODE_EDEFAULT;
		errorCodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IbisCommonPackage.INTERNATIONAL_TEXT_TYPE__ERROR_CODE, oldErrorCode, ERROR_CODE_EDEFAULT, oldErrorCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetErrorCode() {
		return errorCodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IbisCommonPackage.INTERNATIONAL_TEXT_TYPE__VALUE:
				return getValue();
			case IbisCommonPackage.INTERNATIONAL_TEXT_TYPE__LANGUAGE:
				return getLanguage();
			case IbisCommonPackage.INTERNATIONAL_TEXT_TYPE__ERROR_CODE:
				return getErrorCode();
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
			case IbisCommonPackage.INTERNATIONAL_TEXT_TYPE__VALUE:
				setValue((String)newValue);
				return;
			case IbisCommonPackage.INTERNATIONAL_TEXT_TYPE__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case IbisCommonPackage.INTERNATIONAL_TEXT_TYPE__ERROR_CODE:
				setErrorCode((ErrorCodeEnumeration)newValue);
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
			case IbisCommonPackage.INTERNATIONAL_TEXT_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case IbisCommonPackage.INTERNATIONAL_TEXT_TYPE__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case IbisCommonPackage.INTERNATIONAL_TEXT_TYPE__ERROR_CODE:
				unsetErrorCode();
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
			case IbisCommonPackage.INTERNATIONAL_TEXT_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case IbisCommonPackage.INTERNATIONAL_TEXT_TYPE__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case IbisCommonPackage.INTERNATIONAL_TEXT_TYPE__ERROR_CODE:
				return isSetErrorCode();
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
		result.append(" (value: ");
		result.append(value);
		result.append(", language: ");
		result.append(language);
		result.append(", errorCode: ");
		if (errorCodeESet) result.append(errorCode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //InternationalTextTypeImpl
