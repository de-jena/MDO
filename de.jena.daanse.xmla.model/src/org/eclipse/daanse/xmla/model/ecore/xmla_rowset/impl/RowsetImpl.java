/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla_rowset.impl;

import java.util.Collection;

import org.eclipse.daanse.xmla.model.ecore.xmla_exception.Messages;

import org.eclipse.daanse.xmla.model.ecore.xmla_rowset.Row;
import org.eclipse.daanse.xmla.model.ecore.xmla_rowset.Rowset;
import org.eclipse.daanse.xmla.model.ecore.xmla_rowset.Xmla_rowsetPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rowset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_rowset.impl.RowsetImpl#getRow <em>Row</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_rowset.impl.RowsetImpl#getException <em>Exception</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_rowset.impl.RowsetImpl#getMessages <em>Messages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RowsetImpl extends MinimalEObjectImpl.Container implements Rowset {
	/**
	 * The cached value of the '{@link #getRow() <em>Row</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected EList<Row> row;

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
	protected RowsetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xmla_rowsetPackage.Literals.ROWSET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Row> getRow() {
		if (row == null) {
			row = new EObjectContainmentEList<Row>(Row.class, this, Xmla_rowsetPackage.ROWSET__ROW);
		}
		return row;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xmla_rowsetPackage.ROWSET__EXCEPTION, oldException, newException);
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
				msgs = ((InternalEObject)exception).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xmla_rowsetPackage.ROWSET__EXCEPTION, null, msgs);
			if (newException != null)
				msgs = ((InternalEObject)newException).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xmla_rowsetPackage.ROWSET__EXCEPTION, null, msgs);
			msgs = basicSetException(newException, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xmla_rowsetPackage.ROWSET__EXCEPTION, newException, newException));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xmla_rowsetPackage.ROWSET__MESSAGES, oldMessages, newMessages);
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
				msgs = ((InternalEObject)messages).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xmla_rowsetPackage.ROWSET__MESSAGES, null, msgs);
			if (newMessages != null)
				msgs = ((InternalEObject)newMessages).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xmla_rowsetPackage.ROWSET__MESSAGES, null, msgs);
			msgs = basicSetMessages(newMessages, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xmla_rowsetPackage.ROWSET__MESSAGES, newMessages, newMessages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Xmla_rowsetPackage.ROWSET__ROW:
				return ((InternalEList<?>)getRow()).basicRemove(otherEnd, msgs);
			case Xmla_rowsetPackage.ROWSET__EXCEPTION:
				return basicSetException(null, msgs);
			case Xmla_rowsetPackage.ROWSET__MESSAGES:
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
			case Xmla_rowsetPackage.ROWSET__ROW:
				return getRow();
			case Xmla_rowsetPackage.ROWSET__EXCEPTION:
				return getException();
			case Xmla_rowsetPackage.ROWSET__MESSAGES:
				return getMessages();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Xmla_rowsetPackage.ROWSET__ROW:
				getRow().clear();
				getRow().addAll((Collection<? extends Row>)newValue);
				return;
			case Xmla_rowsetPackage.ROWSET__EXCEPTION:
				setException((org.eclipse.daanse.xmla.model.ecore.xmla_exception.Exception)newValue);
				return;
			case Xmla_rowsetPackage.ROWSET__MESSAGES:
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
			case Xmla_rowsetPackage.ROWSET__ROW:
				getRow().clear();
				return;
			case Xmla_rowsetPackage.ROWSET__EXCEPTION:
				setException((org.eclipse.daanse.xmla.model.ecore.xmla_exception.Exception)null);
				return;
			case Xmla_rowsetPackage.ROWSET__MESSAGES:
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
			case Xmla_rowsetPackage.ROWSET__ROW:
				return row != null && !row.isEmpty();
			case Xmla_rowsetPackage.ROWSET__EXCEPTION:
				return exception != null;
			case Xmla_rowsetPackage.ROWSET__MESSAGES:
				return messages != null;
		}
		return super.eIsSet(featureID);
	}

} //RowsetImpl
