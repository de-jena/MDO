/*
 */
package de.jena.mdo.ibis.ibis_common.impl;

import de.jena.mdo.ibis.ibis_common.IBISIPInt;
import de.jena.mdo.ibis.ibis_common.IBISIPString;
import de.jena.mdo.ibis.ibis_common.IbisCommonPackage;
import de.jena.mdo.ibis.ibis_common.UnsubscribeRequest;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unsubscribe Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.UnsubscribeRequestImpl#getClientIPAddress <em>Client IP Address</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.UnsubscribeRequestImpl#getReplyPort <em>Reply Port</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.UnsubscribeRequestImpl#getReplyPath <em>Reply Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnsubscribeRequestImpl extends MinimalEObjectImpl.Container implements UnsubscribeRequest {
	/**
	 * The cached value of the '{@link #getClientIPAddress() <em>Client IP Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientIPAddress()
	 * @generated
	 * @ordered
	 */
	protected IBISIPString clientIPAddress;

	/**
	 * The cached value of the '{@link #getReplyPort() <em>Reply Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplyPort()
	 * @generated
	 * @ordered
	 */
	protected IBISIPInt replyPort;

	/**
	 * The cached value of the '{@link #getReplyPath() <em>Reply Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplyPath()
	 * @generated
	 * @ordered
	 */
	protected IBISIPString replyPath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnsubscribeRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.Literals.UNSUBSCRIBE_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPString getClientIPAddress() {
		return clientIPAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClientIPAddress(IBISIPString newClientIPAddress, NotificationChain msgs) {
		IBISIPString oldClientIPAddress = clientIPAddress;
		clientIPAddress = newClientIPAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.UNSUBSCRIBE_REQUEST__CLIENT_IP_ADDRESS, oldClientIPAddress, newClientIPAddress);
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
	public void setClientIPAddress(IBISIPString newClientIPAddress) {
		if (newClientIPAddress != clientIPAddress) {
			NotificationChain msgs = null;
			if (clientIPAddress != null)
				msgs = ((InternalEObject)clientIPAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.UNSUBSCRIBE_REQUEST__CLIENT_IP_ADDRESS, null, msgs);
			if (newClientIPAddress != null)
				msgs = ((InternalEObject)newClientIPAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.UNSUBSCRIBE_REQUEST__CLIENT_IP_ADDRESS, null, msgs);
			msgs = basicSetClientIPAddress(newClientIPAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.UNSUBSCRIBE_REQUEST__CLIENT_IP_ADDRESS, newClientIPAddress, newClientIPAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPInt getReplyPort() {
		return replyPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReplyPort(IBISIPInt newReplyPort, NotificationChain msgs) {
		IBISIPInt oldReplyPort = replyPort;
		replyPort = newReplyPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.UNSUBSCRIBE_REQUEST__REPLY_PORT, oldReplyPort, newReplyPort);
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
	public void setReplyPort(IBISIPInt newReplyPort) {
		if (newReplyPort != replyPort) {
			NotificationChain msgs = null;
			if (replyPort != null)
				msgs = ((InternalEObject)replyPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.UNSUBSCRIBE_REQUEST__REPLY_PORT, null, msgs);
			if (newReplyPort != null)
				msgs = ((InternalEObject)newReplyPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.UNSUBSCRIBE_REQUEST__REPLY_PORT, null, msgs);
			msgs = basicSetReplyPort(newReplyPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.UNSUBSCRIBE_REQUEST__REPLY_PORT, newReplyPort, newReplyPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPString getReplyPath() {
		return replyPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReplyPath(IBISIPString newReplyPath, NotificationChain msgs) {
		IBISIPString oldReplyPath = replyPath;
		replyPath = newReplyPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.UNSUBSCRIBE_REQUEST__REPLY_PATH, oldReplyPath, newReplyPath);
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
	public void setReplyPath(IBISIPString newReplyPath) {
		if (newReplyPath != replyPath) {
			NotificationChain msgs = null;
			if (replyPath != null)
				msgs = ((InternalEObject)replyPath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.UNSUBSCRIBE_REQUEST__REPLY_PATH, null, msgs);
			if (newReplyPath != null)
				msgs = ((InternalEObject)newReplyPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.UNSUBSCRIBE_REQUEST__REPLY_PATH, null, msgs);
			msgs = basicSetReplyPath(newReplyPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.UNSUBSCRIBE_REQUEST__REPLY_PATH, newReplyPath, newReplyPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.UNSUBSCRIBE_REQUEST__CLIENT_IP_ADDRESS:
				return basicSetClientIPAddress(null, msgs);
			case IbisCommonPackage.UNSUBSCRIBE_REQUEST__REPLY_PORT:
				return basicSetReplyPort(null, msgs);
			case IbisCommonPackage.UNSUBSCRIBE_REQUEST__REPLY_PATH:
				return basicSetReplyPath(null, msgs);
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
			case IbisCommonPackage.UNSUBSCRIBE_REQUEST__CLIENT_IP_ADDRESS:
				return getClientIPAddress();
			case IbisCommonPackage.UNSUBSCRIBE_REQUEST__REPLY_PORT:
				return getReplyPort();
			case IbisCommonPackage.UNSUBSCRIBE_REQUEST__REPLY_PATH:
				return getReplyPath();
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
			case IbisCommonPackage.UNSUBSCRIBE_REQUEST__CLIENT_IP_ADDRESS:
				setClientIPAddress((IBISIPString)newValue);
				return;
			case IbisCommonPackage.UNSUBSCRIBE_REQUEST__REPLY_PORT:
				setReplyPort((IBISIPInt)newValue);
				return;
			case IbisCommonPackage.UNSUBSCRIBE_REQUEST__REPLY_PATH:
				setReplyPath((IBISIPString)newValue);
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
			case IbisCommonPackage.UNSUBSCRIBE_REQUEST__CLIENT_IP_ADDRESS:
				setClientIPAddress((IBISIPString)null);
				return;
			case IbisCommonPackage.UNSUBSCRIBE_REQUEST__REPLY_PORT:
				setReplyPort((IBISIPInt)null);
				return;
			case IbisCommonPackage.UNSUBSCRIBE_REQUEST__REPLY_PATH:
				setReplyPath((IBISIPString)null);
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
			case IbisCommonPackage.UNSUBSCRIBE_REQUEST__CLIENT_IP_ADDRESS:
				return clientIPAddress != null;
			case IbisCommonPackage.UNSUBSCRIBE_REQUEST__REPLY_PORT:
				return replyPort != null;
			case IbisCommonPackage.UNSUBSCRIBE_REQUEST__REPLY_PATH:
				return replyPath != null;
		}
		return super.eIsSet(featureID);
	}

} //UnsubscribeRequestImpl
