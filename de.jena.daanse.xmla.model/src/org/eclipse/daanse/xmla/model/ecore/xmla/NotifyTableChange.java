/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Notify Table Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.NotifyTableChange#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.NotifyTableChange#getTableNotifications <em>Table Notifications</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getNotifyTableChange()
 * @model extendedMetaData="name='NotifyTableChange' kind='elementOnly'"
 * @generated
 */
public interface NotifyTableChange extends EObject {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(ObjectReference)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getNotifyTableChange_Object()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Object'"
	 * @generated
	 */
	ObjectReference getObject();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.NotifyTableChange#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(ObjectReference value);

	/**
	 * Returns the value of the '<em><b>Table Notifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Notifications</em>' containment reference.
	 * @see #setTableNotifications(TableNotificationsType1)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getNotifyTableChange_TableNotifications()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TableNotifications'"
	 * @generated
	 */
	TableNotificationsType1 getTableNotifications();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.NotifyTableChange#getTableNotifications <em>Table Notifications</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Notifications</em>' containment reference.
	 * @see #getTableNotifications()
	 * @generated
	 */
	void setTableNotifications(TableNotificationsType1 value);

} // NotifyTableChange
