/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proactive Caching Tables Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCachingTablesBinding#getNotificationTechnique <em>Notification Technique</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCachingTablesBinding#getTableNotifications <em>Table Notifications</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getProactiveCachingTablesBinding()
 * @model extendedMetaData="name='ProactiveCachingTablesBinding' kind='elementOnly'"
 * @generated
 */
public interface ProactiveCachingTablesBinding extends ProactiveCachingObjectNotificationBinding {
	/**
	 * Returns the value of the '<em><b>Notification Technique</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.NotificationTechniqueType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification Technique</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.NotificationTechniqueType
	 * @see #isSetNotificationTechnique()
	 * @see #unsetNotificationTechnique()
	 * @see #setNotificationTechnique(NotificationTechniqueType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getProactiveCachingTablesBinding_NotificationTechnique()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='NotificationTechnique'"
	 * @generated
	 */
	NotificationTechniqueType getNotificationTechnique();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCachingTablesBinding#getNotificationTechnique <em>Notification Technique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification Technique</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.NotificationTechniqueType
	 * @see #isSetNotificationTechnique()
	 * @see #unsetNotificationTechnique()
	 * @see #getNotificationTechnique()
	 * @generated
	 */
	void setNotificationTechnique(NotificationTechniqueType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCachingTablesBinding#getNotificationTechnique <em>Notification Technique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNotificationTechnique()
	 * @see #getNotificationTechnique()
	 * @see #setNotificationTechnique(NotificationTechniqueType)
	 * @generated
	 */
	void unsetNotificationTechnique();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCachingTablesBinding#getNotificationTechnique <em>Notification Technique</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Notification Technique</em>' attribute is set.
	 * @see #unsetNotificationTechnique()
	 * @see #getNotificationTechnique()
	 * @see #setNotificationTechnique(NotificationTechniqueType)
	 * @generated
	 */
	boolean isSetNotificationTechnique();

	/**
	 * Returns the value of the '<em><b>Table Notifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Notifications</em>' containment reference.
	 * @see #setTableNotifications(TableNotificationsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getProactiveCachingTablesBinding_TableNotifications()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TableNotifications'"
	 * @generated
	 */
	TableNotificationsType getTableNotifications();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCachingTablesBinding#getTableNotifications <em>Table Notifications</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Notifications</em>' containment reference.
	 * @see #getTableNotifications()
	 * @generated
	 */
	void setTableNotifications(TableNotificationsType value);

} // ProactiveCachingTablesBinding
