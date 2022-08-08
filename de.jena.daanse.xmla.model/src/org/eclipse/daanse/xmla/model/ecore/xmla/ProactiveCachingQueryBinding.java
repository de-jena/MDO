/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import javax.xml.datatype.Duration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proactive Caching Query Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCachingQueryBinding#getRefreshInterval <em>Refresh Interval</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCachingQueryBinding#getQueryNotifications <em>Query Notifications</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getProactiveCachingQueryBinding()
 * @model extendedMetaData="name='ProactiveCachingQueryBinding' kind='elementOnly'"
 * @generated
 */
public interface ProactiveCachingQueryBinding extends ProactiveCachingBinding {
	/**
	 * Returns the value of the '<em><b>Refresh Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refresh Interval</em>' attribute.
	 * @see #setRefreshInterval(Duration)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getProactiveCachingQueryBinding_RefreshInterval()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration" required="true"
	 *        extendedMetaData="kind='element' name='RefreshInterval'"
	 * @generated
	 */
	Duration getRefreshInterval();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCachingQueryBinding#getRefreshInterval <em>Refresh Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refresh Interval</em>' attribute.
	 * @see #getRefreshInterval()
	 * @generated
	 */
	void setRefreshInterval(Duration value);

	/**
	 * Returns the value of the '<em><b>Query Notifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Notifications</em>' containment reference.
	 * @see #setQueryNotifications(QueryNotificationsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getProactiveCachingQueryBinding_QueryNotifications()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='QueryNotifications'"
	 * @generated
	 */
	QueryNotificationsType getQueryNotifications();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCachingQueryBinding#getQueryNotifications <em>Query Notifications</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Notifications</em>' containment reference.
	 * @see #getQueryNotifications()
	 * @generated
	 */
	void setQueryNotifications(QueryNotificationsType value);

} // ProactiveCachingQueryBinding
