/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Notifications Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.QueryNotificationsType#getQueryNotification <em>Query Notification</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getQueryNotificationsType()
 * @model extendedMetaData="name='QueryNotifications_._type' kind='elementOnly'"
 * @generated
 */
public interface QueryNotificationsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Query Notification</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.QueryNotification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Notification</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getQueryNotificationsType_QueryNotification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='QueryNotification'"
	 * @generated
	 */
	EList<QueryNotification> getQueryNotification();

} // QueryNotificationsType
