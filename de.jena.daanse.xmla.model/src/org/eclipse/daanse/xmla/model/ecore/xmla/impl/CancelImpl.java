/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.math.BigInteger;

import org.eclipse.daanse.xmla.model.ecore.xmla.Cancel;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cancel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CancelImpl#getConnectionID <em>Connection ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CancelImpl#getSessionID <em>Session ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CancelImpl#getSPID <em>SPID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CancelImpl#isCancelAssociated <em>Cancel Associated</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CancelImpl extends MinimalEObjectImpl.Container implements Cancel {
	/**
	 * The default value of the '{@link #getConnectionID() <em>Connection ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionID()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CONNECTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectionID() <em>Connection ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionID()
	 * @generated
	 * @ordered
	 */
	protected BigInteger connectionID = CONNECTION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSessionID() <em>Session ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionID()
	 * @generated
	 * @ordered
	 */
	protected static final String SESSION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSessionID() <em>Session ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionID()
	 * @generated
	 * @ordered
	 */
	protected String sessionID = SESSION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSPID() <em>SPID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPID()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SPID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSPID() <em>SPID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPID()
	 * @generated
	 * @ordered
	 */
	protected BigInteger sPID = SPID_EDEFAULT;

	/**
	 * The default value of the '{@link #isCancelAssociated() <em>Cancel Associated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCancelAssociated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CANCEL_ASSOCIATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCancelAssociated() <em>Cancel Associated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCancelAssociated()
	 * @generated
	 * @ordered
	 */
	protected boolean cancelAssociated = CANCEL_ASSOCIATED_EDEFAULT;

	/**
	 * This is true if the Cancel Associated attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cancelAssociatedESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CancelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.CANCEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getConnectionID() {
		return connectionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionID(BigInteger newConnectionID) {
		BigInteger oldConnectionID = connectionID;
		connectionID = newConnectionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CANCEL__CONNECTION_ID, oldConnectionID, connectionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSessionID() {
		return sessionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSessionID(String newSessionID) {
		String oldSessionID = sessionID;
		sessionID = newSessionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CANCEL__SESSION_ID, oldSessionID, sessionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getSPID() {
		return sPID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPID(BigInteger newSPID) {
		BigInteger oldSPID = sPID;
		sPID = newSPID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CANCEL__SPID, oldSPID, sPID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCancelAssociated() {
		return cancelAssociated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCancelAssociated(boolean newCancelAssociated) {
		boolean oldCancelAssociated = cancelAssociated;
		cancelAssociated = newCancelAssociated;
		boolean oldCancelAssociatedESet = cancelAssociatedESet;
		cancelAssociatedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CANCEL__CANCEL_ASSOCIATED, oldCancelAssociated, cancelAssociated, !oldCancelAssociatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCancelAssociated() {
		boolean oldCancelAssociated = cancelAssociated;
		boolean oldCancelAssociatedESet = cancelAssociatedESet;
		cancelAssociated = CANCEL_ASSOCIATED_EDEFAULT;
		cancelAssociatedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.CANCEL__CANCEL_ASSOCIATED, oldCancelAssociated, CANCEL_ASSOCIATED_EDEFAULT, oldCancelAssociatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCancelAssociated() {
		return cancelAssociatedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmlaPackage.CANCEL__CONNECTION_ID:
				return getConnectionID();
			case XmlaPackage.CANCEL__SESSION_ID:
				return getSessionID();
			case XmlaPackage.CANCEL__SPID:
				return getSPID();
			case XmlaPackage.CANCEL__CANCEL_ASSOCIATED:
				return isCancelAssociated();
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
			case XmlaPackage.CANCEL__CONNECTION_ID:
				setConnectionID((BigInteger)newValue);
				return;
			case XmlaPackage.CANCEL__SESSION_ID:
				setSessionID((String)newValue);
				return;
			case XmlaPackage.CANCEL__SPID:
				setSPID((BigInteger)newValue);
				return;
			case XmlaPackage.CANCEL__CANCEL_ASSOCIATED:
				setCancelAssociated((Boolean)newValue);
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
			case XmlaPackage.CANCEL__CONNECTION_ID:
				setConnectionID(CONNECTION_ID_EDEFAULT);
				return;
			case XmlaPackage.CANCEL__SESSION_ID:
				setSessionID(SESSION_ID_EDEFAULT);
				return;
			case XmlaPackage.CANCEL__SPID:
				setSPID(SPID_EDEFAULT);
				return;
			case XmlaPackage.CANCEL__CANCEL_ASSOCIATED:
				unsetCancelAssociated();
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
			case XmlaPackage.CANCEL__CONNECTION_ID:
				return CONNECTION_ID_EDEFAULT == null ? connectionID != null : !CONNECTION_ID_EDEFAULT.equals(connectionID);
			case XmlaPackage.CANCEL__SESSION_ID:
				return SESSION_ID_EDEFAULT == null ? sessionID != null : !SESSION_ID_EDEFAULT.equals(sessionID);
			case XmlaPackage.CANCEL__SPID:
				return SPID_EDEFAULT == null ? sPID != null : !SPID_EDEFAULT.equals(sPID);
			case XmlaPackage.CANCEL__CANCEL_ASSOCIATED:
				return isSetCancelAssociated();
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
		result.append(" (connectionID: ");
		result.append(connectionID);
		result.append(", sessionID: ");
		result.append(sessionID);
		result.append(", sPID: ");
		result.append(sPID);
		result.append(", cancelAssociated: ");
		if (cancelAssociatedESet) result.append(cancelAssociated); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CancelImpl
