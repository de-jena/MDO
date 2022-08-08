/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import javax.xml.datatype.Duration;

import org.eclipse.daanse.xmla.model.ecore.xmla.AggregationStorageType;
import org.eclipse.daanse.xmla.model.ecore.xmla.OnlineModeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCaching;
import org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCachingBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proactive Caching</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ProactiveCachingImpl#getOnlineMode <em>Online Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ProactiveCachingImpl#getAggregationStorage <em>Aggregation Storage</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ProactiveCachingImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ProactiveCachingImpl#getSilenceInterval <em>Silence Interval</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ProactiveCachingImpl#getLatency <em>Latency</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ProactiveCachingImpl#getSilenceOverrideInterval <em>Silence Override Interval</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ProactiveCachingImpl#getForceRebuildInterval <em>Force Rebuild Interval</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ProactiveCachingImpl#isEnabled <em>Enabled</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProactiveCachingImpl extends MinimalEObjectImpl.Container implements ProactiveCaching {
	/**
	 * The default value of the '{@link #getOnlineMode() <em>Online Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnlineMode()
	 * @generated
	 * @ordered
	 */
	protected static final OnlineModeType ONLINE_MODE_EDEFAULT = OnlineModeType.IMMEDIATE;

	/**
	 * The cached value of the '{@link #getOnlineMode() <em>Online Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnlineMode()
	 * @generated
	 * @ordered
	 */
	protected OnlineModeType onlineMode = ONLINE_MODE_EDEFAULT;

	/**
	 * This is true if the Online Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean onlineModeESet;

	/**
	 * The default value of the '{@link #getAggregationStorage() <em>Aggregation Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationStorage()
	 * @generated
	 * @ordered
	 */
	protected static final AggregationStorageType AGGREGATION_STORAGE_EDEFAULT = AggregationStorageType.REGULAR;

	/**
	 * The cached value of the '{@link #getAggregationStorage() <em>Aggregation Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationStorage()
	 * @generated
	 * @ordered
	 */
	protected AggregationStorageType aggregationStorage = AGGREGATION_STORAGE_EDEFAULT;

	/**
	 * This is true if the Aggregation Storage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aggregationStorageESet;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ProactiveCachingBinding source;

	/**
	 * The default value of the '{@link #getSilenceInterval() <em>Silence Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSilenceInterval()
	 * @generated
	 * @ordered
	 */
	protected static final Duration SILENCE_INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSilenceInterval() <em>Silence Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSilenceInterval()
	 * @generated
	 * @ordered
	 */
	protected Duration silenceInterval = SILENCE_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLatency() <em>Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatency()
	 * @generated
	 * @ordered
	 */
	protected static final Duration LATENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLatency() <em>Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatency()
	 * @generated
	 * @ordered
	 */
	protected Duration latency = LATENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSilenceOverrideInterval() <em>Silence Override Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSilenceOverrideInterval()
	 * @generated
	 * @ordered
	 */
	protected static final Duration SILENCE_OVERRIDE_INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSilenceOverrideInterval() <em>Silence Override Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSilenceOverrideInterval()
	 * @generated
	 * @ordered
	 */
	protected Duration silenceOverrideInterval = SILENCE_OVERRIDE_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getForceRebuildInterval() <em>Force Rebuild Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForceRebuildInterval()
	 * @generated
	 * @ordered
	 */
	protected static final Duration FORCE_REBUILD_INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForceRebuildInterval() <em>Force Rebuild Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForceRebuildInterval()
	 * @generated
	 * @ordered
	 */
	protected Duration forceRebuildInterval = FORCE_REBUILD_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean enabled = ENABLED_EDEFAULT;

	/**
	 * This is true if the Enabled attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean enabledESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProactiveCachingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.PROACTIVE_CACHING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnlineModeType getOnlineMode() {
		return onlineMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnlineMode(OnlineModeType newOnlineMode) {
		OnlineModeType oldOnlineMode = onlineMode;
		onlineMode = newOnlineMode == null ? ONLINE_MODE_EDEFAULT : newOnlineMode;
		boolean oldOnlineModeESet = onlineModeESet;
		onlineModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROACTIVE_CACHING__ONLINE_MODE, oldOnlineMode, onlineMode, !oldOnlineModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOnlineMode() {
		OnlineModeType oldOnlineMode = onlineMode;
		boolean oldOnlineModeESet = onlineModeESet;
		onlineMode = ONLINE_MODE_EDEFAULT;
		onlineModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROACTIVE_CACHING__ONLINE_MODE, oldOnlineMode, ONLINE_MODE_EDEFAULT, oldOnlineModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOnlineMode() {
		return onlineModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationStorageType getAggregationStorage() {
		return aggregationStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregationStorage(AggregationStorageType newAggregationStorage) {
		AggregationStorageType oldAggregationStorage = aggregationStorage;
		aggregationStorage = newAggregationStorage == null ? AGGREGATION_STORAGE_EDEFAULT : newAggregationStorage;
		boolean oldAggregationStorageESet = aggregationStorageESet;
		aggregationStorageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROACTIVE_CACHING__AGGREGATION_STORAGE, oldAggregationStorage, aggregationStorage, !oldAggregationStorageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAggregationStorage() {
		AggregationStorageType oldAggregationStorage = aggregationStorage;
		boolean oldAggregationStorageESet = aggregationStorageESet;
		aggregationStorage = AGGREGATION_STORAGE_EDEFAULT;
		aggregationStorageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROACTIVE_CACHING__AGGREGATION_STORAGE, oldAggregationStorage, AGGREGATION_STORAGE_EDEFAULT, oldAggregationStorageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAggregationStorage() {
		return aggregationStorageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProactiveCachingBinding getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(ProactiveCachingBinding newSource, NotificationChain msgs) {
		ProactiveCachingBinding oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.PROACTIVE_CACHING__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(ProactiveCachingBinding newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PROACTIVE_CACHING__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PROACTIVE_CACHING__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROACTIVE_CACHING__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getSilenceInterval() {
		return silenceInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSilenceInterval(Duration newSilenceInterval) {
		Duration oldSilenceInterval = silenceInterval;
		silenceInterval = newSilenceInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROACTIVE_CACHING__SILENCE_INTERVAL, oldSilenceInterval, silenceInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getLatency() {
		return latency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatency(Duration newLatency) {
		Duration oldLatency = latency;
		latency = newLatency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROACTIVE_CACHING__LATENCY, oldLatency, latency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getSilenceOverrideInterval() {
		return silenceOverrideInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSilenceOverrideInterval(Duration newSilenceOverrideInterval) {
		Duration oldSilenceOverrideInterval = silenceOverrideInterval;
		silenceOverrideInterval = newSilenceOverrideInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROACTIVE_CACHING__SILENCE_OVERRIDE_INTERVAL, oldSilenceOverrideInterval, silenceOverrideInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getForceRebuildInterval() {
		return forceRebuildInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForceRebuildInterval(Duration newForceRebuildInterval) {
		Duration oldForceRebuildInterval = forceRebuildInterval;
		forceRebuildInterval = newForceRebuildInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROACTIVE_CACHING__FORCE_REBUILD_INTERVAL, oldForceRebuildInterval, forceRebuildInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(boolean newEnabled) {
		boolean oldEnabled = enabled;
		enabled = newEnabled;
		boolean oldEnabledESet = enabledESet;
		enabledESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROACTIVE_CACHING__ENABLED, oldEnabled, enabled, !oldEnabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEnabled() {
		boolean oldEnabled = enabled;
		boolean oldEnabledESet = enabledESet;
		enabled = ENABLED_EDEFAULT;
		enabledESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROACTIVE_CACHING__ENABLED, oldEnabled, ENABLED_EDEFAULT, oldEnabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEnabled() {
		return enabledESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.PROACTIVE_CACHING__SOURCE:
				return basicSetSource(null, msgs);
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
			case XmlaPackage.PROACTIVE_CACHING__ONLINE_MODE:
				return getOnlineMode();
			case XmlaPackage.PROACTIVE_CACHING__AGGREGATION_STORAGE:
				return getAggregationStorage();
			case XmlaPackage.PROACTIVE_CACHING__SOURCE:
				return getSource();
			case XmlaPackage.PROACTIVE_CACHING__SILENCE_INTERVAL:
				return getSilenceInterval();
			case XmlaPackage.PROACTIVE_CACHING__LATENCY:
				return getLatency();
			case XmlaPackage.PROACTIVE_CACHING__SILENCE_OVERRIDE_INTERVAL:
				return getSilenceOverrideInterval();
			case XmlaPackage.PROACTIVE_CACHING__FORCE_REBUILD_INTERVAL:
				return getForceRebuildInterval();
			case XmlaPackage.PROACTIVE_CACHING__ENABLED:
				return isEnabled();
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
			case XmlaPackage.PROACTIVE_CACHING__ONLINE_MODE:
				setOnlineMode((OnlineModeType)newValue);
				return;
			case XmlaPackage.PROACTIVE_CACHING__AGGREGATION_STORAGE:
				setAggregationStorage((AggregationStorageType)newValue);
				return;
			case XmlaPackage.PROACTIVE_CACHING__SOURCE:
				setSource((ProactiveCachingBinding)newValue);
				return;
			case XmlaPackage.PROACTIVE_CACHING__SILENCE_INTERVAL:
				setSilenceInterval((Duration)newValue);
				return;
			case XmlaPackage.PROACTIVE_CACHING__LATENCY:
				setLatency((Duration)newValue);
				return;
			case XmlaPackage.PROACTIVE_CACHING__SILENCE_OVERRIDE_INTERVAL:
				setSilenceOverrideInterval((Duration)newValue);
				return;
			case XmlaPackage.PROACTIVE_CACHING__FORCE_REBUILD_INTERVAL:
				setForceRebuildInterval((Duration)newValue);
				return;
			case XmlaPackage.PROACTIVE_CACHING__ENABLED:
				setEnabled((Boolean)newValue);
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
			case XmlaPackage.PROACTIVE_CACHING__ONLINE_MODE:
				unsetOnlineMode();
				return;
			case XmlaPackage.PROACTIVE_CACHING__AGGREGATION_STORAGE:
				unsetAggregationStorage();
				return;
			case XmlaPackage.PROACTIVE_CACHING__SOURCE:
				setSource((ProactiveCachingBinding)null);
				return;
			case XmlaPackage.PROACTIVE_CACHING__SILENCE_INTERVAL:
				setSilenceInterval(SILENCE_INTERVAL_EDEFAULT);
				return;
			case XmlaPackage.PROACTIVE_CACHING__LATENCY:
				setLatency(LATENCY_EDEFAULT);
				return;
			case XmlaPackage.PROACTIVE_CACHING__SILENCE_OVERRIDE_INTERVAL:
				setSilenceOverrideInterval(SILENCE_OVERRIDE_INTERVAL_EDEFAULT);
				return;
			case XmlaPackage.PROACTIVE_CACHING__FORCE_REBUILD_INTERVAL:
				setForceRebuildInterval(FORCE_REBUILD_INTERVAL_EDEFAULT);
				return;
			case XmlaPackage.PROACTIVE_CACHING__ENABLED:
				unsetEnabled();
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
			case XmlaPackage.PROACTIVE_CACHING__ONLINE_MODE:
				return isSetOnlineMode();
			case XmlaPackage.PROACTIVE_CACHING__AGGREGATION_STORAGE:
				return isSetAggregationStorage();
			case XmlaPackage.PROACTIVE_CACHING__SOURCE:
				return source != null;
			case XmlaPackage.PROACTIVE_CACHING__SILENCE_INTERVAL:
				return SILENCE_INTERVAL_EDEFAULT == null ? silenceInterval != null : !SILENCE_INTERVAL_EDEFAULT.equals(silenceInterval);
			case XmlaPackage.PROACTIVE_CACHING__LATENCY:
				return LATENCY_EDEFAULT == null ? latency != null : !LATENCY_EDEFAULT.equals(latency);
			case XmlaPackage.PROACTIVE_CACHING__SILENCE_OVERRIDE_INTERVAL:
				return SILENCE_OVERRIDE_INTERVAL_EDEFAULT == null ? silenceOverrideInterval != null : !SILENCE_OVERRIDE_INTERVAL_EDEFAULT.equals(silenceOverrideInterval);
			case XmlaPackage.PROACTIVE_CACHING__FORCE_REBUILD_INTERVAL:
				return FORCE_REBUILD_INTERVAL_EDEFAULT == null ? forceRebuildInterval != null : !FORCE_REBUILD_INTERVAL_EDEFAULT.equals(forceRebuildInterval);
			case XmlaPackage.PROACTIVE_CACHING__ENABLED:
				return isSetEnabled();
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
		result.append(" (onlineMode: ");
		if (onlineModeESet) result.append(onlineMode); else result.append("<unset>");
		result.append(", aggregationStorage: ");
		if (aggregationStorageESet) result.append(aggregationStorage); else result.append("<unset>");
		result.append(", silenceInterval: ");
		result.append(silenceInterval);
		result.append(", latency: ");
		result.append(latency);
		result.append(", silenceOverrideInterval: ");
		result.append(silenceOverrideInterval);
		result.append(", forceRebuildInterval: ");
		result.append(forceRebuildInterval);
		result.append(", enabled: ");
		if (enabledESet) result.append(enabled); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ProactiveCachingImpl
