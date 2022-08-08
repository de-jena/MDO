/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Notifications Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.TableNotificationsType1#getTableNotification <em>Table Notification</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTableNotificationsType1()
 * @model extendedMetaData="name='TableNotifications_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface TableNotificationsType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Table Notification</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.TableNotification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Notification</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTableNotificationsType1_TableNotification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TableNotification'"
	 * @generated
	 */
	EList<TableNotification> getTableNotification();

} // TableNotificationsType1
