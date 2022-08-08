/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import javax.xml.datatype.Duration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proactive Caching Incremental Processing Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCachingIncrementalProcessingBinding#getRefreshInterval <em>Refresh Interval</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCachingIncrementalProcessingBinding#getIncrementalProcessingNotifications <em>Incremental Processing Notifications</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getProactiveCachingIncrementalProcessingBinding()
 * @model extendedMetaData="name='ProactiveCachingIncrementalProcessingBinding' kind='elementOnly'"
 * @generated
 */
public interface ProactiveCachingIncrementalProcessingBinding extends ProactiveCachingBinding {
	/**
	 * Returns the value of the '<em><b>Refresh Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refresh Interval</em>' attribute.
	 * @see #setRefreshInterval(Duration)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getProactiveCachingIncrementalProcessingBinding_RefreshInterval()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='element' name='RefreshInterval'"
	 * @generated
	 */
	Duration getRefreshInterval();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCachingIncrementalProcessingBinding#getRefreshInterval <em>Refresh Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refresh Interval</em>' attribute.
	 * @see #getRefreshInterval()
	 * @generated
	 */
	void setRefreshInterval(Duration value);

	/**
	 * Returns the value of the '<em><b>Incremental Processing Notifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incremental Processing Notifications</em>' containment reference.
	 * @see #setIncrementalProcessingNotifications(IncrementalProcessingNotificationsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getProactiveCachingIncrementalProcessingBinding_IncrementalProcessingNotifications()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='IncrementalProcessingNotifications'"
	 * @generated
	 */
	IncrementalProcessingNotificationsType getIncrementalProcessingNotifications();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCachingIncrementalProcessingBinding#getIncrementalProcessingNotifications <em>Incremental Processing Notifications</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incremental Processing Notifications</em>' containment reference.
	 * @see #getIncrementalProcessingNotifications()
	 * @generated
	 */
	void setIncrementalProcessingNotifications(IncrementalProcessingNotificationsType value);

} // ProactiveCachingIncrementalProcessingBinding
