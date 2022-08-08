/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import javax.xml.datatype.Duration;

import org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCachingQueryBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.QueryNotificationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proactive Caching Query Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ProactiveCachingQueryBindingImpl#getRefreshInterval <em>Refresh Interval</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ProactiveCachingQueryBindingImpl#getQueryNotifications <em>Query Notifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProactiveCachingQueryBindingImpl extends ProactiveCachingBindingImpl implements ProactiveCachingQueryBinding {
	/**
	 * The default value of the '{@link #getRefreshInterval() <em>Refresh Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshInterval()
	 * @generated
	 * @ordered
	 */
	protected static final Duration REFRESH_INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefreshInterval() <em>Refresh Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshInterval()
	 * @generated
	 * @ordered
	 */
	protected Duration refreshInterval = REFRESH_INTERVAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQueryNotifications() <em>Query Notifications</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryNotifications()
	 * @generated
	 * @ordered
	 */
	protected QueryNotificationsType queryNotifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProactiveCachingQueryBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.PROACTIVE_CACHING_QUERY_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getRefreshInterval() {
		return refreshInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefreshInterval(Duration newRefreshInterval) {
		Duration oldRefreshInterval = refreshInterval;
		refreshInterval = newRefreshInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROACTIVE_CACHING_QUERY_BINDING__REFRESH_INTERVAL, oldRefreshInterval, refreshInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryNotificationsType getQueryNotifications() {
		return queryNotifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueryNotifications(QueryNotificationsType newQueryNotifications, NotificationChain msgs) {
		QueryNotificationsType oldQueryNotifications = queryNotifications;
		queryNotifications = newQueryNotifications;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.PROACTIVE_CACHING_QUERY_BINDING__QUERY_NOTIFICATIONS, oldQueryNotifications, newQueryNotifications);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryNotifications(QueryNotificationsType newQueryNotifications) {
		if (newQueryNotifications != queryNotifications) {
			NotificationChain msgs = null;
			if (queryNotifications != null)
				msgs = ((InternalEObject)queryNotifications).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PROACTIVE_CACHING_QUERY_BINDING__QUERY_NOTIFICATIONS, null, msgs);
			if (newQueryNotifications != null)
				msgs = ((InternalEObject)newQueryNotifications).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PROACTIVE_CACHING_QUERY_BINDING__QUERY_NOTIFICATIONS, null, msgs);
			msgs = basicSetQueryNotifications(newQueryNotifications, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROACTIVE_CACHING_QUERY_BINDING__QUERY_NOTIFICATIONS, newQueryNotifications, newQueryNotifications));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.PROACTIVE_CACHING_QUERY_BINDING__QUERY_NOTIFICATIONS:
				return basicSetQueryNotifications(null, msgs);
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
			case XmlaPackage.PROACTIVE_CACHING_QUERY_BINDING__REFRESH_INTERVAL:
				return getRefreshInterval();
			case XmlaPackage.PROACTIVE_CACHING_QUERY_BINDING__QUERY_NOTIFICATIONS:
				return getQueryNotifications();
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
			case XmlaPackage.PROACTIVE_CACHING_QUERY_BINDING__REFRESH_INTERVAL:
				setRefreshInterval((Duration)newValue);
				return;
			case XmlaPackage.PROACTIVE_CACHING_QUERY_BINDING__QUERY_NOTIFICATIONS:
				setQueryNotifications((QueryNotificationsType)newValue);
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
			case XmlaPackage.PROACTIVE_CACHING_QUERY_BINDING__REFRESH_INTERVAL:
				setRefreshInterval(REFRESH_INTERVAL_EDEFAULT);
				return;
			case XmlaPackage.PROACTIVE_CACHING_QUERY_BINDING__QUERY_NOTIFICATIONS:
				setQueryNotifications((QueryNotificationsType)null);
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
			case XmlaPackage.PROACTIVE_CACHING_QUERY_BINDING__REFRESH_INTERVAL:
				return REFRESH_INTERVAL_EDEFAULT == null ? refreshInterval != null : !REFRESH_INTERVAL_EDEFAULT.equals(refreshInterval);
			case XmlaPackage.PROACTIVE_CACHING_QUERY_BINDING__QUERY_NOTIFICATIONS:
				return queryNotifications != null;
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
		result.append(" (refreshInterval: ");
		result.append(refreshInterval);
		result.append(')');
		return result.toString();
	}

} //ProactiveCachingQueryBindingImpl
