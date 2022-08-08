/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.daanse.xmla.model.ecore.engine300_300.XEventType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Type Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventTypeType#getEvents <em>Events</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventTypeType#getXEvent <em>XEvent</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getEventTypeType()
 * @model extendedMetaData="name='EventType_._type' kind='elementOnly'"
 * @generated
 */
public interface EventTypeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference.
	 * @see #setEvents(EventsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getEventTypeType_Events()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Events'"
	 * @generated
	 */
	EventsType getEvents();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventTypeType#getEvents <em>Events</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Events</em>' containment reference.
	 * @see #getEvents()
	 * @generated
	 */
	void setEvents(EventsType value);

	/**
	 * Returns the value of the '<em><b>XEvent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XEvent</em>' containment reference.
	 * @see #setXEvent(XEventType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getEventTypeType_XEvent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='XEvent' namespace='http://schemas.microsoft.com/analysisservices/2011/engine/300/300'"
	 * @generated
	 */
	XEventType getXEvent();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventTypeType#getXEvent <em>XEvent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XEvent</em>' containment reference.
	 * @see #getXEvent()
	 * @generated
	 */
	void setXEvent(XEventType value);

} // EventTypeType
