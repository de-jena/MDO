/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.engine300_300.XEventType;

import org.eclipse.daanse.xmla.model.ecore.xmla.EventTypeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.EventsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Type Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.EventTypeTypeImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.EventTypeTypeImpl#getXEvent <em>XEvent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventTypeTypeImpl extends MinimalEObjectImpl.Container implements EventTypeType {
	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EventsType events;

	/**
	 * The cached value of the '{@link #getXEvent() <em>XEvent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXEvent()
	 * @generated
	 * @ordered
	 */
	protected XEventType xEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventTypeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.EVENT_TYPE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventsType getEvents() {
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvents(EventsType newEvents, NotificationChain msgs) {
		EventsType oldEvents = events;
		events = newEvents;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.EVENT_TYPE_TYPE__EVENTS, oldEvents, newEvents);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvents(EventsType newEvents) {
		if (newEvents != events) {
			NotificationChain msgs = null;
			if (events != null)
				msgs = ((InternalEObject)events).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.EVENT_TYPE_TYPE__EVENTS, null, msgs);
			if (newEvents != null)
				msgs = ((InternalEObject)newEvents).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.EVENT_TYPE_TYPE__EVENTS, null, msgs);
			msgs = basicSetEvents(newEvents, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.EVENT_TYPE_TYPE__EVENTS, newEvents, newEvents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XEventType getXEvent() {
		return xEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXEvent(XEventType newXEvent, NotificationChain msgs) {
		XEventType oldXEvent = xEvent;
		xEvent = newXEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.EVENT_TYPE_TYPE__XEVENT, oldXEvent, newXEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXEvent(XEventType newXEvent) {
		if (newXEvent != xEvent) {
			NotificationChain msgs = null;
			if (xEvent != null)
				msgs = ((InternalEObject)xEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.EVENT_TYPE_TYPE__XEVENT, null, msgs);
			if (newXEvent != null)
				msgs = ((InternalEObject)newXEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.EVENT_TYPE_TYPE__XEVENT, null, msgs);
			msgs = basicSetXEvent(newXEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.EVENT_TYPE_TYPE__XEVENT, newXEvent, newXEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.EVENT_TYPE_TYPE__EVENTS:
				return basicSetEvents(null, msgs);
			case XmlaPackage.EVENT_TYPE_TYPE__XEVENT:
				return basicSetXEvent(null, msgs);
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
			case XmlaPackage.EVENT_TYPE_TYPE__EVENTS:
				return getEvents();
			case XmlaPackage.EVENT_TYPE_TYPE__XEVENT:
				return getXEvent();
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
			case XmlaPackage.EVENT_TYPE_TYPE__EVENTS:
				setEvents((EventsType)newValue);
				return;
			case XmlaPackage.EVENT_TYPE_TYPE__XEVENT:
				setXEvent((XEventType)newValue);
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
			case XmlaPackage.EVENT_TYPE_TYPE__EVENTS:
				setEvents((EventsType)null);
				return;
			case XmlaPackage.EVENT_TYPE_TYPE__XEVENT:
				setXEvent((XEventType)null);
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
			case XmlaPackage.EVENT_TYPE_TYPE__EVENTS:
				return events != null;
			case XmlaPackage.EVENT_TYPE_TYPE__XEVENT:
				return xEvent != null;
		}
		return super.eIsSet(featureID);
	}

} //EventTypeTypeImpl
