/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine300_300;

import org.eclipse.daanse.xmla.model.ecore.xmla.EventSession;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XEvent Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.XEventType#getEventSession <em>Event Session</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.Engine300_300Package#getXEventType()
 * @model extendedMetaData="name='XEvent_._type' kind='elementOnly'"
 * @generated
 */
public interface XEventType extends EObject {
	/**
	 * Returns the value of the '<em><b>Event Session</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Session</em>' containment reference.
	 * @see #setEventSession(EventSession)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.Engine300_300Package#getXEventType_EventSession()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='event_session' namespace='urn:schemas-microsoft-com:xml-analysis'"
	 * @generated
	 */
	EventSession getEventSession();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.XEventType#getEventSession <em>Event Session</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Session</em>' containment reference.
	 * @see #getEventSession()
	 * @generated
	 */
	void setEventSession(EventSession value);

} // XEventType
