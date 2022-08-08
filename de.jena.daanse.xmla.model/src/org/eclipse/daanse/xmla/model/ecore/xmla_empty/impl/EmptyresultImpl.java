/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla_empty.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla_empty.Emptyresult;
import org.eclipse.daanse.xmla.model.ecore.xmla_empty.Xmla_emptyPackage;

import org.eclipse.daanse.xmla.model.ecore.xmla_exception.Messages;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Emptyresult</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_empty.impl.EmptyresultImpl#getException <em>Exception</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_empty.impl.EmptyresultImpl#getMessages <em>Messages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmptyresultImpl extends MinimalEObjectImpl.Container implements Emptyresult {
	/**
	 * The cached value of the '{@link #getException() <em>Exception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getException()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.daanse.xmla.model.ecore.xmla_exception.Exception exception;

	/**
	 * The cached value of the '{@link #getMessages() <em>Messages</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessages()
	 * @generated
	 * @ordered
	 */
	protected Messages messages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmptyresultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xmla_emptyPackage.Literals.EMPTYRESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.daanse.xmla.model.ecore.xmla_exception.Exception getException() {
		return exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetException(org.eclipse.daanse.xmla.model.ecore.xmla_exception.Exception newException, NotificationChain msgs) {
		org.eclipse.daanse.xmla.model.ecore.xmla_exception.Exception oldException = exception;
		exception = newException;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xmla_emptyPackage.EMPTYRESULT__EXCEPTION, oldException, newException);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setException(org.eclipse.daanse.xmla.model.ecore.xmla_exception.Exception newException) {
		if (newException != exception) {
			NotificationChain msgs = null;
			if (exception != null)
				msgs = ((InternalEObject)exception).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xmla_emptyPackage.EMPTYRESULT__EXCEPTION, null, msgs);
			if (newException != null)
				msgs = ((InternalEObject)newException).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xmla_emptyPackage.EMPTYRESULT__EXCEPTION, null, msgs);
			msgs = basicSetException(newException, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xmla_emptyPackage.EMPTYRESULT__EXCEPTION, newException, newException));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Messages getMessages() {
		return messages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessages(Messages newMessages, NotificationChain msgs) {
		Messages oldMessages = messages;
		messages = newMessages;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xmla_emptyPackage.EMPTYRESULT__MESSAGES, oldMessages, newMessages);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessages(Messages newMessages) {
		if (newMessages != messages) {
			NotificationChain msgs = null;
			if (messages != null)
				msgs = ((InternalEObject)messages).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xmla_emptyPackage.EMPTYRESULT__MESSAGES, null, msgs);
			if (newMessages != null)
				msgs = ((InternalEObject)newMessages).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xmla_emptyPackage.EMPTYRESULT__MESSAGES, null, msgs);
			msgs = basicSetMessages(newMessages, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xmla_emptyPackage.EMPTYRESULT__MESSAGES, newMessages, newMessages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Xmla_emptyPackage.EMPTYRESULT__EXCEPTION:
				return basicSetException(null, msgs);
			case Xmla_emptyPackage.EMPTYRESULT__MESSAGES:
				return basicSetMessages(null, msgs);
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
			case Xmla_emptyPackage.EMPTYRESULT__EXCEPTION:
				return getException();
			case Xmla_emptyPackage.EMPTYRESULT__MESSAGES:
				return getMessages();
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
			case Xmla_emptyPackage.EMPTYRESULT__EXCEPTION:
				setException((org.eclipse.daanse.xmla.model.ecore.xmla_exception.Exception)newValue);
				return;
			case Xmla_emptyPackage.EMPTYRESULT__MESSAGES:
				setMessages((Messages)newValue);
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
			case Xmla_emptyPackage.EMPTYRESULT__EXCEPTION:
				setException((org.eclipse.daanse.xmla.model.ecore.xmla_exception.Exception)null);
				return;
			case Xmla_emptyPackage.EMPTYRESULT__MESSAGES:
				setMessages((Messages)null);
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
			case Xmla_emptyPackage.EMPTYRESULT__EXCEPTION:
				return exception != null;
			case Xmla_emptyPackage.EMPTYRESULT__MESSAGES:
				return messages != null;
		}
		return super.eIsSet(featureID);
	}

} //EmptyresultImpl
