/*
 */
package de.jena.mdo.ibis.ibis_common.impl;

import de.jena.mdo.ibis.ibis_common.DataAcceptedResponseData;
import de.jena.mdo.ibis.ibis_common.IBISIPBoolean;
import de.jena.mdo.ibis.ibis_common.IBISIPDateTime;
import de.jena.mdo.ibis.ibis_common.IBISIPString;
import de.jena.mdo.ibis.ibis_common.IbisCommonPackage;

import de.jena.mdo.ibis.ibis_enumerations.ErrorCodeEnumeration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Accepted Response Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.DataAcceptedResponseDataImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.DataAcceptedResponseDataImpl#getDataAccepted <em>Data Accepted</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.DataAcceptedResponseDataImpl#getErrorCode <em>Error Code</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.DataAcceptedResponseDataImpl#getErrorInformation <em>Error Information</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataAcceptedResponseDataImpl extends MinimalEObjectImpl.Container implements DataAcceptedResponseData {
	/**
	 * The cached value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected IBISIPDateTime timeStamp;

	/**
	 * The cached value of the '{@link #getDataAccepted() <em>Data Accepted</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataAccepted()
	 * @generated
	 * @ordered
	 */
	protected IBISIPBoolean dataAccepted;

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
	 * The cached value of the '{@link #getErrorInformation() <em>Error Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorInformation()
	 * @generated
	 * @ordered
	 */
	protected IBISIPString errorInformation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataAcceptedResponseDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.Literals.DATA_ACCEPTED_RESPONSE_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPDateTime getTimeStamp() {
		return timeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeStamp(IBISIPDateTime newTimeStamp, NotificationChain msgs) {
		IBISIPDateTime oldTimeStamp = timeStamp;
		timeStamp = newTimeStamp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DATA_ACCEPTED_RESPONSE_DATA__TIME_STAMP, oldTimeStamp, newTimeStamp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeStamp(IBISIPDateTime newTimeStamp) {
		if (newTimeStamp != timeStamp) {
			NotificationChain msgs = null;
			if (timeStamp != null)
				msgs = ((InternalEObject)timeStamp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DATA_ACCEPTED_RESPONSE_DATA__TIME_STAMP, null, msgs);
			if (newTimeStamp != null)
				msgs = ((InternalEObject)newTimeStamp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DATA_ACCEPTED_RESPONSE_DATA__TIME_STAMP, null, msgs);
			msgs = basicSetTimeStamp(newTimeStamp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DATA_ACCEPTED_RESPONSE_DATA__TIME_STAMP, newTimeStamp, newTimeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPBoolean getDataAccepted() {
		return dataAccepted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataAccepted(IBISIPBoolean newDataAccepted, NotificationChain msgs) {
		IBISIPBoolean oldDataAccepted = dataAccepted;
		dataAccepted = newDataAccepted;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DATA_ACCEPTED_RESPONSE_DATA__DATA_ACCEPTED, oldDataAccepted, newDataAccepted);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataAccepted(IBISIPBoolean newDataAccepted) {
		if (newDataAccepted != dataAccepted) {
			NotificationChain msgs = null;
			if (dataAccepted != null)
				msgs = ((InternalEObject)dataAccepted).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DATA_ACCEPTED_RESPONSE_DATA__DATA_ACCEPTED, null, msgs);
			if (newDataAccepted != null)
				msgs = ((InternalEObject)newDataAccepted).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DATA_ACCEPTED_RESPONSE_DATA__DATA_ACCEPTED, null, msgs);
			msgs = basicSetDataAccepted(newDataAccepted, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DATA_ACCEPTED_RESPONSE_DATA__DATA_ACCEPTED, newDataAccepted, newDataAccepted));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DATA_ACCEPTED_RESPONSE_DATA__ERROR_CODE, oldErrorCode, errorCode, !oldErrorCodeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, IbisCommonPackage.DATA_ACCEPTED_RESPONSE_DATA__ERROR_CODE, oldErrorCode, ERROR_CODE_EDEFAULT, oldErrorCodeESet));
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
	public IBISIPString getErrorInformation() {
		return errorInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErrorInformation(IBISIPString newErrorInformation, NotificationChain msgs) {
		IBISIPString oldErrorInformation = errorInformation;
		errorInformation = newErrorInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DATA_ACCEPTED_RESPONSE_DATA__ERROR_INFORMATION, oldErrorInformation, newErrorInformation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorInformation(IBISIPString newErrorInformation) {
		if (newErrorInformation != errorInformation) {
			NotificationChain msgs = null;
			if (errorInformation != null)
				msgs = ((InternalEObject)errorInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DATA_ACCEPTED_RESPONSE_DATA__ERROR_INFORMATION, null, msgs);
			if (newErrorInformation != null)
				msgs = ((InternalEObject)newErrorInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DATA_ACCEPTED_RESPONSE_DATA__ERROR_INFORMATION, null, msgs);
			msgs = basicSetErrorInformation(newErrorInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DATA_ACCEPTED_RESPONSE_DATA__ERROR_INFORMATION, newErrorInformation, newErrorInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.DATA_ACCEPTED_RESPONSE_DATA__TIME_STAMP:
				return basicSetTimeStamp(null, msgs);
			case IbisCommonPackage.DATA_ACCEPTED_RESPONSE_DATA__DATA_ACCEPTED:
				return basicSetDataAccepted(null, msgs);
			case IbisCommonPackage.DATA_ACCEPTED_RESPONSE_DATA__ERROR_INFORMATION:
				return basicSetErrorInformation(null, msgs);
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
			case IbisCommonPackage.DATA_ACCEPTED_RESPONSE_DATA__TIME_STAMP:
				return getTimeStamp();
			case IbisCommonPackage.DATA_ACCEPTED_RESPONSE_DATA__DATA_ACCEPTED:
				return getDataAccepted();
			case IbisCommonPackage.DATA_ACCEPTED_RESPONSE_DATA__ERROR_CODE:
				return getErrorCode();
			case IbisCommonPackage.DATA_ACCEPTED_RESPONSE_DATA__ERROR_INFORMATION:
				return getErrorInformation();
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
			case IbisCommonPackage.DATA_ACCEPTED_RESPONSE_DATA__TIME_STAMP:
				setTimeStamp((IBISIPDateTime)newValue);
				return;
			case IbisCommonPackage.DATA_ACCEPTED_RESPONSE_DATA__DATA_ACCEPTED:
				setDataAccepted((IBISIPBoolean)newValue);
				return;
			case IbisCommonPackage.DATA_ACCEPTED_RESPONSE_DATA__ERROR_CODE:
				setErrorCode((ErrorCodeEnumeration)newValue);
				return;
			case IbisCommonPackage.DATA_ACCEPTED_RESPONSE_DATA__ERROR_INFORMATION:
				setErrorInformation((IBISIPString)newValue);
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
			case IbisCommonPackage.DATA_ACCEPTED_RESPONSE_DATA__TIME_STAMP:
				setTimeStamp((IBISIPDateTime)null);
				return;
			case IbisCommonPackage.DATA_ACCEPTED_RESPONSE_DATA__DATA_ACCEPTED:
				setDataAccepted((IBISIPBoolean)null);
				return;
			case IbisCommonPackage.DATA_ACCEPTED_RESPONSE_DATA__ERROR_CODE:
				unsetErrorCode();
				return;
			case IbisCommonPackage.DATA_ACCEPTED_RESPONSE_DATA__ERROR_INFORMATION:
				setErrorInformation((IBISIPString)null);
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
			case IbisCommonPackage.DATA_ACCEPTED_RESPONSE_DATA__TIME_STAMP:
				return timeStamp != null;
			case IbisCommonPackage.DATA_ACCEPTED_RESPONSE_DATA__DATA_ACCEPTED:
				return dataAccepted != null;
			case IbisCommonPackage.DATA_ACCEPTED_RESPONSE_DATA__ERROR_CODE:
				return isSetErrorCode();
			case IbisCommonPackage.DATA_ACCEPTED_RESPONSE_DATA__ERROR_INFORMATION:
				return errorInformation != null;
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
		result.append(" (errorCode: ");
		if (errorCodeESet) result.append(errorCode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DataAcceptedResponseDataImpl
