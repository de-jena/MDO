/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.NotificationTechniqueType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCachingTablesBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.TableNotificationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proactive Caching Tables Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ProactiveCachingTablesBindingImpl#getNotificationTechnique <em>Notification Technique</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ProactiveCachingTablesBindingImpl#getTableNotifications <em>Table Notifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProactiveCachingTablesBindingImpl extends ProactiveCachingObjectNotificationBindingImpl implements ProactiveCachingTablesBinding {
	/**
	 * The default value of the '{@link #getNotificationTechnique() <em>Notification Technique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationTechnique()
	 * @generated
	 * @ordered
	 */
	protected static final NotificationTechniqueType NOTIFICATION_TECHNIQUE_EDEFAULT = NotificationTechniqueType.CLIENT;

	/**
	 * The cached value of the '{@link #getNotificationTechnique() <em>Notification Technique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationTechnique()
	 * @generated
	 * @ordered
	 */
	protected NotificationTechniqueType notificationTechnique = NOTIFICATION_TECHNIQUE_EDEFAULT;

	/**
	 * This is true if the Notification Technique attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean notificationTechniqueESet;

	/**
	 * The cached value of the '{@link #getTableNotifications() <em>Table Notifications</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableNotifications()
	 * @generated
	 * @ordered
	 */
	protected TableNotificationsType tableNotifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProactiveCachingTablesBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.PROACTIVE_CACHING_TABLES_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationTechniqueType getNotificationTechnique() {
		return notificationTechnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotificationTechnique(NotificationTechniqueType newNotificationTechnique) {
		NotificationTechniqueType oldNotificationTechnique = notificationTechnique;
		notificationTechnique = newNotificationTechnique == null ? NOTIFICATION_TECHNIQUE_EDEFAULT : newNotificationTechnique;
		boolean oldNotificationTechniqueESet = notificationTechniqueESet;
		notificationTechniqueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROACTIVE_CACHING_TABLES_BINDING__NOTIFICATION_TECHNIQUE, oldNotificationTechnique, notificationTechnique, !oldNotificationTechniqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNotificationTechnique() {
		NotificationTechniqueType oldNotificationTechnique = notificationTechnique;
		boolean oldNotificationTechniqueESet = notificationTechniqueESet;
		notificationTechnique = NOTIFICATION_TECHNIQUE_EDEFAULT;
		notificationTechniqueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROACTIVE_CACHING_TABLES_BINDING__NOTIFICATION_TECHNIQUE, oldNotificationTechnique, NOTIFICATION_TECHNIQUE_EDEFAULT, oldNotificationTechniqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNotificationTechnique() {
		return notificationTechniqueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableNotificationsType getTableNotifications() {
		return tableNotifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableNotifications(TableNotificationsType newTableNotifications, NotificationChain msgs) {
		TableNotificationsType oldTableNotifications = tableNotifications;
		tableNotifications = newTableNotifications;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.PROACTIVE_CACHING_TABLES_BINDING__TABLE_NOTIFICATIONS, oldTableNotifications, newTableNotifications);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableNotifications(TableNotificationsType newTableNotifications) {
		if (newTableNotifications != tableNotifications) {
			NotificationChain msgs = null;
			if (tableNotifications != null)
				msgs = ((InternalEObject)tableNotifications).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PROACTIVE_CACHING_TABLES_BINDING__TABLE_NOTIFICATIONS, null, msgs);
			if (newTableNotifications != null)
				msgs = ((InternalEObject)newTableNotifications).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PROACTIVE_CACHING_TABLES_BINDING__TABLE_NOTIFICATIONS, null, msgs);
			msgs = basicSetTableNotifications(newTableNotifications, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROACTIVE_CACHING_TABLES_BINDING__TABLE_NOTIFICATIONS, newTableNotifications, newTableNotifications));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.PROACTIVE_CACHING_TABLES_BINDING__TABLE_NOTIFICATIONS:
				return basicSetTableNotifications(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmlaPackage.PROACTIVE_CACHING_TABLES_BINDING__NOTIFICATION_TECHNIQUE:
				return getNotificationTechnique();
			case XmlaPackage.PROACTIVE_CACHING_TABLES_BINDING__TABLE_NOTIFICATIONS:
				return getTableNotifications();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XmlaPackage.PROACTIVE_CACHING_TABLES_BINDING__NOTIFICATION_TECHNIQUE:
				setNotificationTechnique((NotificationTechniqueType)newValue);
				return;
			case XmlaPackage.PROACTIVE_CACHING_TABLES_BINDING__TABLE_NOTIFICATIONS:
				setTableNotifications((TableNotificationsType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case XmlaPackage.PROACTIVE_CACHING_TABLES_BINDING__NOTIFICATION_TECHNIQUE:
				unsetNotificationTechnique();
				return;
			case XmlaPackage.PROACTIVE_CACHING_TABLES_BINDING__TABLE_NOTIFICATIONS:
				setTableNotifications((TableNotificationsType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XmlaPackage.PROACTIVE_CACHING_TABLES_BINDING__NOTIFICATION_TECHNIQUE:
				return isSetNotificationTechnique();
			case XmlaPackage.PROACTIVE_CACHING_TABLES_BINDING__TABLE_NOTIFICATIONS:
				return tableNotifications != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (notificationTechnique: ");
		if (notificationTechniqueESet) result.append(notificationTechnique); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ProactiveCachingTablesBindingImpl
