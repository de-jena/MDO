/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import javax.xml.datatype.Duration;

import org.eclipse.daanse.xmla.model.ecore.xmla.IncrementalProcessingNotificationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCachingIncrementalProcessingBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proactive Caching Incremental Processing Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ProactiveCachingIncrementalProcessingBindingImpl#getRefreshInterval <em>Refresh Interval</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ProactiveCachingIncrementalProcessingBindingImpl#getIncrementalProcessingNotifications <em>Incremental Processing Notifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProactiveCachingIncrementalProcessingBindingImpl extends ProactiveCachingBindingImpl implements ProactiveCachingIncrementalProcessingBinding {
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
	 * The cached value of the '{@link #getIncrementalProcessingNotifications() <em>Incremental Processing Notifications</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementalProcessingNotifications()
	 * @generated
	 * @ordered
	 */
	protected IncrementalProcessingNotificationsType incrementalProcessingNotifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProactiveCachingIncrementalProcessingBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.PROACTIVE_CACHING_INCREMENTAL_PROCESSING_BINDING;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROACTIVE_CACHING_INCREMENTAL_PROCESSING_BINDING__REFRESH_INTERVAL, oldRefreshInterval, refreshInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncrementalProcessingNotificationsType getIncrementalProcessingNotifications() {
		return incrementalProcessingNotifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncrementalProcessingNotifications(IncrementalProcessingNotificationsType newIncrementalProcessingNotifications, NotificationChain msgs) {
		IncrementalProcessingNotificationsType oldIncrementalProcessingNotifications = incrementalProcessingNotifications;
		incrementalProcessingNotifications = newIncrementalProcessingNotifications;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.PROACTIVE_CACHING_INCREMENTAL_PROCESSING_BINDING__INCREMENTAL_PROCESSING_NOTIFICATIONS, oldIncrementalProcessingNotifications, newIncrementalProcessingNotifications);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncrementalProcessingNotifications(IncrementalProcessingNotificationsType newIncrementalProcessingNotifications) {
		if (newIncrementalProcessingNotifications != incrementalProcessingNotifications) {
			NotificationChain msgs = null;
			if (incrementalProcessingNotifications != null)
				msgs = ((InternalEObject)incrementalProcessingNotifications).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PROACTIVE_CACHING_INCREMENTAL_PROCESSING_BINDING__INCREMENTAL_PROCESSING_NOTIFICATIONS, null, msgs);
			if (newIncrementalProcessingNotifications != null)
				msgs = ((InternalEObject)newIncrementalProcessingNotifications).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PROACTIVE_CACHING_INCREMENTAL_PROCESSING_BINDING__INCREMENTAL_PROCESSING_NOTIFICATIONS, null, msgs);
			msgs = basicSetIncrementalProcessingNotifications(newIncrementalProcessingNotifications, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROACTIVE_CACHING_INCREMENTAL_PROCESSING_BINDING__INCREMENTAL_PROCESSING_NOTIFICATIONS, newIncrementalProcessingNotifications, newIncrementalProcessingNotifications));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.PROACTIVE_CACHING_INCREMENTAL_PROCESSING_BINDING__INCREMENTAL_PROCESSING_NOTIFICATIONS:
				return basicSetIncrementalProcessingNotifications(null, msgs);
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
			case XmlaPackage.PROACTIVE_CACHING_INCREMENTAL_PROCESSING_BINDING__REFRESH_INTERVAL:
				return getRefreshInterval();
			case XmlaPackage.PROACTIVE_CACHING_INCREMENTAL_PROCESSING_BINDING__INCREMENTAL_PROCESSING_NOTIFICATIONS:
				return getIncrementalProcessingNotifications();
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
			case XmlaPackage.PROACTIVE_CACHING_INCREMENTAL_PROCESSING_BINDING__REFRESH_INTERVAL:
				setRefreshInterval((Duration)newValue);
				return;
			case XmlaPackage.PROACTIVE_CACHING_INCREMENTAL_PROCESSING_BINDING__INCREMENTAL_PROCESSING_NOTIFICATIONS:
				setIncrementalProcessingNotifications((IncrementalProcessingNotificationsType)newValue);
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
			case XmlaPackage.PROACTIVE_CACHING_INCREMENTAL_PROCESSING_BINDING__REFRESH_INTERVAL:
				setRefreshInterval(REFRESH_INTERVAL_EDEFAULT);
				return;
			case XmlaPackage.PROACTIVE_CACHING_INCREMENTAL_PROCESSING_BINDING__INCREMENTAL_PROCESSING_NOTIFICATIONS:
				setIncrementalProcessingNotifications((IncrementalProcessingNotificationsType)null);
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
			case XmlaPackage.PROACTIVE_CACHING_INCREMENTAL_PROCESSING_BINDING__REFRESH_INTERVAL:
				return REFRESH_INTERVAL_EDEFAULT == null ? refreshInterval != null : !REFRESH_INTERVAL_EDEFAULT.equals(refreshInterval);
			case XmlaPackage.PROACTIVE_CACHING_INCREMENTAL_PROCESSING_BINDING__INCREMENTAL_PROCESSING_NOTIFICATIONS:
				return incrementalProcessingNotifications != null;
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

} //ProactiveCachingIncrementalProcessingBindingImpl
