/*
 */
package de.jena.mdo.ibis.common.impl;

import de.jena.mdo.ibis.common.IBISIPNonNegativeInteger;
import de.jena.mdo.ibis.common.IbisCommonPackage;

import de.jena.mdo.ibis.enumerations.ErrorCodeEnumeration;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IBISIP Non Negative Integer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.impl.IBISIPNonNegativeIntegerImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.IBISIPNonNegativeIntegerImpl#getErrorCode <em>Error Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IBISIPNonNegativeIntegerImpl extends MinimalEObjectImpl.Container implements IBISIPNonNegativeInteger {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected BigInteger value = VALUE_EDEFAULT;

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
	protected IBISIPNonNegativeIntegerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.eINSTANCE.getIBISIPNonNegativeInteger();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(BigInteger newValue) {
		BigInteger oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.IBISIP_NON_NEGATIVE_INTEGER__VALUE, oldValue, value));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.IBISIP_NON_NEGATIVE_INTEGER__ERROR_CODE, oldErrorCode, errorCode, !oldErrorCodeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, IbisCommonPackage.IBISIP_NON_NEGATIVE_INTEGER__ERROR_CODE, oldErrorCode, ERROR_CODE_EDEFAULT, oldErrorCodeESet));
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
			case IbisCommonPackage.IBISIP_NON_NEGATIVE_INTEGER__VALUE:
				return getValue();
			case IbisCommonPackage.IBISIP_NON_NEGATIVE_INTEGER__ERROR_CODE:
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
			case IbisCommonPackage.IBISIP_NON_NEGATIVE_INTEGER__VALUE:
				setValue((BigInteger)newValue);
				return;
			case IbisCommonPackage.IBISIP_NON_NEGATIVE_INTEGER__ERROR_CODE:
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
			case IbisCommonPackage.IBISIP_NON_NEGATIVE_INTEGER__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case IbisCommonPackage.IBISIP_NON_NEGATIVE_INTEGER__ERROR_CODE:
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
			case IbisCommonPackage.IBISIP_NON_NEGATIVE_INTEGER__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case IbisCommonPackage.IBISIP_NON_NEGATIVE_INTEGER__ERROR_CODE:
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
		result.append(", errorCode: ");
		if (errorCodeESet) result.append(errorCode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IBISIPNonNegativeIntegerImpl
