/**
 */
package org.eclipse.daanse.xmla.model.ecore.ext.impl;

import org.eclipse.daanse.xmla.model.ecore.ext.AuthenticateType;
import org.eclipse.daanse.xmla.model.ecore.ext.ExtPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authenticate Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.ext.impl.AuthenticateTypeImpl#getSspiHandshake <em>Sspi Handshake</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuthenticateTypeImpl extends MinimalEObjectImpl.Container implements AuthenticateType {
	/**
	 * The default value of the '{@link #getSspiHandshake() <em>Sspi Handshake</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSspiHandshake()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] SSPI_HANDSHAKE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSspiHandshake() <em>Sspi Handshake</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSspiHandshake()
	 * @generated
	 * @ordered
	 */
	protected byte[] sspiHandshake = SSPI_HANDSHAKE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthenticateTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtPackage.Literals.AUTHENTICATE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getSspiHandshake() {
		return sspiHandshake;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSspiHandshake(byte[] newSspiHandshake) {
		byte[] oldSspiHandshake = sspiHandshake;
		sspiHandshake = newSspiHandshake;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtPackage.AUTHENTICATE_TYPE__SSPI_HANDSHAKE, oldSspiHandshake, sspiHandshake));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtPackage.AUTHENTICATE_TYPE__SSPI_HANDSHAKE:
				return getSspiHandshake();
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
			case ExtPackage.AUTHENTICATE_TYPE__SSPI_HANDSHAKE:
				setSspiHandshake((byte[])newValue);
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
			case ExtPackage.AUTHENTICATE_TYPE__SSPI_HANDSHAKE:
				setSspiHandshake(SSPI_HANDSHAKE_EDEFAULT);
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
			case ExtPackage.AUTHENTICATE_TYPE__SSPI_HANDSHAKE:
				return SSPI_HANDSHAKE_EDEFAULT == null ? sspiHandshake != null : !SSPI_HANDSHAKE_EDEFAULT.equals(sspiHandshake);
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
		result.append(" (sspiHandshake: ");
		result.append(sspiHandshake);
		result.append(')');
		return result.toString();
	}

} //AuthenticateTypeImpl
