/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine300_300.impl;

import org.eclipse.daanse.xmla.model.ecore.engine300_300.Engine300_300Package;
import org.eclipse.daanse.xmla.model.ecore.engine300_300.XEventType;

import org.eclipse.daanse.xmla.model.ecore.xmla.EventSession;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XEvent Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.XEventTypeImpl#getEventSession <em>Event Session</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XEventTypeImpl extends MinimalEObjectImpl.Container implements XEventType {
	/**
	 * The cached value of the '{@link #getEventSession() <em>Event Session</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventSession()
	 * @generated
	 * @ordered
	 */
	protected EventSession eventSession;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XEventTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Engine300_300Package.Literals.XEVENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventSession getEventSession() {
		return eventSession;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventSession(EventSession newEventSession, NotificationChain msgs) {
		EventSession oldEventSession = eventSession;
		eventSession = newEventSession;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Engine300_300Package.XEVENT_TYPE__EVENT_SESSION, oldEventSession, newEventSession);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventSession(EventSession newEventSession) {
		if (newEventSession != eventSession) {
			NotificationChain msgs = null;
			if (eventSession != null)
				msgs = ((InternalEObject)eventSession).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Engine300_300Package.XEVENT_TYPE__EVENT_SESSION, null, msgs);
			if (newEventSession != null)
				msgs = ((InternalEObject)newEventSession).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Engine300_300Package.XEVENT_TYPE__EVENT_SESSION, null, msgs);
			msgs = basicSetEventSession(newEventSession, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300_300Package.XEVENT_TYPE__EVENT_SESSION, newEventSession, newEventSession));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Engine300_300Package.XEVENT_TYPE__EVENT_SESSION:
				return basicSetEventSession(null, msgs);
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
			case Engine300_300Package.XEVENT_TYPE__EVENT_SESSION:
				return getEventSession();
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
			case Engine300_300Package.XEVENT_TYPE__EVENT_SESSION:
				setEventSession((EventSession)newValue);
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
			case Engine300_300Package.XEVENT_TYPE__EVENT_SESSION:
				setEventSession((EventSession)null);
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
			case Engine300_300Package.XEVENT_TYPE__EVENT_SESSION:
				return eventSession != null;
		}
		return super.eIsSet(featureID);
	}

} //XEventTypeImpl
