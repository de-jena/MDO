/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proactive Caching Inherited Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCachingInheritedBinding#getNotificationTechnique <em>Notification Technique</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getProactiveCachingInheritedBinding()
 * @model extendedMetaData="name='ProactiveCachingInheritedBinding' kind='elementOnly'"
 * @generated
 */
public interface ProactiveCachingInheritedBinding extends ProactiveCachingObjectNotificationBinding {
	/**
	 * Returns the value of the '<em><b>Notification Technique</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.NotificationTechniqueType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification Technique</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.NotificationTechniqueType1
	 * @see #isSetNotificationTechnique()
	 * @see #unsetNotificationTechnique()
	 * @see #setNotificationTechnique(NotificationTechniqueType1)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getProactiveCachingInheritedBinding_NotificationTechnique()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='NotificationTechnique'"
	 * @generated
	 */
	NotificationTechniqueType1 getNotificationTechnique();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCachingInheritedBinding#getNotificationTechnique <em>Notification Technique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification Technique</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.NotificationTechniqueType1
	 * @see #isSetNotificationTechnique()
	 * @see #unsetNotificationTechnique()
	 * @see #getNotificationTechnique()
	 * @generated
	 */
	void setNotificationTechnique(NotificationTechniqueType1 value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCachingInheritedBinding#getNotificationTechnique <em>Notification Technique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNotificationTechnique()
	 * @see #getNotificationTechnique()
	 * @see #setNotificationTechnique(NotificationTechniqueType1)
	 * @generated
	 */
	void unsetNotificationTechnique();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCachingInheritedBinding#getNotificationTechnique <em>Notification Technique</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Notification Technique</em>' attribute is set.
	 * @see #unsetNotificationTechnique()
	 * @see #getNotificationTechnique()
	 * @see #setNotificationTechnique(NotificationTechniqueType1)
	 * @generated
	 */
	boolean isSetNotificationTechnique();

} // ProactiveCachingInheritedBinding
