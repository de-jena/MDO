/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Incremental Processing Notifications Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.IncrementalProcessingNotificationsType#getIncrementalProcessingNotification <em>Incremental Processing Notification</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getIncrementalProcessingNotificationsType()
 * @model extendedMetaData="name='IncrementalProcessingNotifications_._type' kind='elementOnly'"
 * @generated
 */
public interface IncrementalProcessingNotificationsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Incremental Processing Notification</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.IncrementalProcessingNotification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incremental Processing Notification</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getIncrementalProcessingNotificationsType_IncrementalProcessingNotification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IncrementalProcessingNotification'"
	 * @generated
	 */
	EList<IncrementalProcessingNotification> getIncrementalProcessingNotification();

} // IncrementalProcessingNotificationsType
