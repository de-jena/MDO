/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.util.Collection;

import org.eclipse.daanse.xmla.model.ecore.xmla.QueryNotification;
import org.eclipse.daanse.xmla.model.ecore.xmla.QueryNotificationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Notifications Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.QueryNotificationsTypeImpl#getQueryNotification <em>Query Notification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueryNotificationsTypeImpl extends MinimalEObjectImpl.Container implements QueryNotificationsType {
	/**
	 * The cached value of the '{@link #getQueryNotification() <em>Query Notification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryNotification()
	 * @generated
	 * @ordered
	 */
	protected EList<QueryNotification> queryNotification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryNotificationsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.QUERY_NOTIFICATIONS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QueryNotification> getQueryNotification() {
		if (queryNotification == null) {
			queryNotification = new EObjectContainmentEList<QueryNotification>(QueryNotification.class, this, XmlaPackage.QUERY_NOTIFICATIONS_TYPE__QUERY_NOTIFICATION);
		}
		return queryNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.QUERY_NOTIFICATIONS_TYPE__QUERY_NOTIFICATION:
				return ((InternalEList<?>)getQueryNotification()).basicRemove(otherEnd, msgs);
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
			case XmlaPackage.QUERY_NOTIFICATIONS_TYPE__QUERY_NOTIFICATION:
				return getQueryNotification();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XmlaPackage.QUERY_NOTIFICATIONS_TYPE__QUERY_NOTIFICATION:
				getQueryNotification().clear();
				getQueryNotification().addAll((Collection<? extends QueryNotification>)newValue);
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
			case XmlaPackage.QUERY_NOTIFICATIONS_TYPE__QUERY_NOTIFICATION:
				getQueryNotification().clear();
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
			case XmlaPackage.QUERY_NOTIFICATIONS_TYPE__QUERY_NOTIFICATION:
				return queryNotification != null && !queryNotification.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QueryNotificationsTypeImpl
