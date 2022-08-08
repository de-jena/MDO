/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.NotifyTableChange;
import org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference;
import org.eclipse.daanse.xmla.model.ecore.xmla.TableNotificationsType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Notify Table Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.NotifyTableChangeImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.NotifyTableChangeImpl#getTableNotifications <em>Table Notifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NotifyTableChangeImpl extends MinimalEObjectImpl.Container implements NotifyTableChange {
	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected ObjectReference object;

	/**
	 * The cached value of the '{@link #getTableNotifications() <em>Table Notifications</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableNotifications()
	 * @generated
	 * @ordered
	 */
	protected TableNotificationsType1 tableNotifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotifyTableChangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.NOTIFY_TABLE_CHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectReference getObject() {
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObject(ObjectReference newObject, NotificationChain msgs) {
		ObjectReference oldObject = object;
		object = newObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.NOTIFY_TABLE_CHANGE__OBJECT, oldObject, newObject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject(ObjectReference newObject) {
		if (newObject != object) {
			NotificationChain msgs = null;
			if (object != null)
				msgs = ((InternalEObject)object).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.NOTIFY_TABLE_CHANGE__OBJECT, null, msgs);
			if (newObject != null)
				msgs = ((InternalEObject)newObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.NOTIFY_TABLE_CHANGE__OBJECT, null, msgs);
			msgs = basicSetObject(newObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.NOTIFY_TABLE_CHANGE__OBJECT, newObject, newObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableNotificationsType1 getTableNotifications() {
		return tableNotifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableNotifications(TableNotificationsType1 newTableNotifications, NotificationChain msgs) {
		TableNotificationsType1 oldTableNotifications = tableNotifications;
		tableNotifications = newTableNotifications;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.NOTIFY_TABLE_CHANGE__TABLE_NOTIFICATIONS, oldTableNotifications, newTableNotifications);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableNotifications(TableNotificationsType1 newTableNotifications) {
		if (newTableNotifications != tableNotifications) {
			NotificationChain msgs = null;
			if (tableNotifications != null)
				msgs = ((InternalEObject)tableNotifications).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.NOTIFY_TABLE_CHANGE__TABLE_NOTIFICATIONS, null, msgs);
			if (newTableNotifications != null)
				msgs = ((InternalEObject)newTableNotifications).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.NOTIFY_TABLE_CHANGE__TABLE_NOTIFICATIONS, null, msgs);
			msgs = basicSetTableNotifications(newTableNotifications, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.NOTIFY_TABLE_CHANGE__TABLE_NOTIFICATIONS, newTableNotifications, newTableNotifications));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.NOTIFY_TABLE_CHANGE__OBJECT:
				return basicSetObject(null, msgs);
			case XmlaPackage.NOTIFY_TABLE_CHANGE__TABLE_NOTIFICATIONS:
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
			case XmlaPackage.NOTIFY_TABLE_CHANGE__OBJECT:
				return getObject();
			case XmlaPackage.NOTIFY_TABLE_CHANGE__TABLE_NOTIFICATIONS:
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
			case XmlaPackage.NOTIFY_TABLE_CHANGE__OBJECT:
				setObject((ObjectReference)newValue);
				return;
			case XmlaPackage.NOTIFY_TABLE_CHANGE__TABLE_NOTIFICATIONS:
				setTableNotifications((TableNotificationsType1)newValue);
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
			case XmlaPackage.NOTIFY_TABLE_CHANGE__OBJECT:
				setObject((ObjectReference)null);
				return;
			case XmlaPackage.NOTIFY_TABLE_CHANGE__TABLE_NOTIFICATIONS:
				setTableNotifications((TableNotificationsType1)null);
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
			case XmlaPackage.NOTIFY_TABLE_CHANGE__OBJECT:
				return object != null;
			case XmlaPackage.NOTIFY_TABLE_CHANGE__TABLE_NOTIFICATIONS:
				return tableNotifications != null;
		}
		return super.eIsSet(featureID);
	}

} //NotifyTableChangeImpl
