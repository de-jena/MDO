/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import javax.xml.datatype.Duration;

import org.eclipse.daanse.xmla.model.ecore.xmla.DimensionBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.PersistenceType;
import org.eclipse.daanse.xmla.model.ecore.xmla.RefreshPolicyType;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dimension Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionBindingImpl#getDataSourceID <em>Data Source ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionBindingImpl#getDimensionID <em>Dimension ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionBindingImpl#getPersistence <em>Persistence</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionBindingImpl#getRefreshPolicy <em>Refresh Policy</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DimensionBindingImpl#getRefreshInterval <em>Refresh Interval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DimensionBindingImpl extends BindingImpl implements DimensionBinding {
	/**
	 * The default value of the '{@link #getDataSourceID() <em>Data Source ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSourceID()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_SOURCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataSourceID() <em>Data Source ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSourceID()
	 * @generated
	 * @ordered
	 */
	protected String dataSourceID = DATA_SOURCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDimensionID() <em>Dimension ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionID()
	 * @generated
	 * @ordered
	 */
	protected static final String DIMENSION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDimensionID() <em>Dimension ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionID()
	 * @generated
	 * @ordered
	 */
	protected String dimensionID = DIMENSION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPersistence() <em>Persistence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistence()
	 * @generated
	 * @ordered
	 */
	protected static final PersistenceType PERSISTENCE_EDEFAULT = PersistenceType.NOT_PERSISTED;

	/**
	 * The cached value of the '{@link #getPersistence() <em>Persistence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistence()
	 * @generated
	 * @ordered
	 */
	protected PersistenceType persistence = PERSISTENCE_EDEFAULT;

	/**
	 * This is true if the Persistence attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean persistenceESet;

	/**
	 * The default value of the '{@link #getRefreshPolicy() <em>Refresh Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final RefreshPolicyType REFRESH_POLICY_EDEFAULT = RefreshPolicyType.BY_QUERY;

	/**
	 * The cached value of the '{@link #getRefreshPolicy() <em>Refresh Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshPolicy()
	 * @generated
	 * @ordered
	 */
	protected RefreshPolicyType refreshPolicy = REFRESH_POLICY_EDEFAULT;

	/**
	 * This is true if the Refresh Policy attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean refreshPolicyESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DimensionBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.DIMENSION_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataSourceID() {
		return dataSourceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSourceID(String newDataSourceID) {
		String oldDataSourceID = dataSourceID;
		dataSourceID = newDataSourceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_BINDING__DATA_SOURCE_ID, oldDataSourceID, dataSourceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDimensionID() {
		return dimensionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimensionID(String newDimensionID) {
		String oldDimensionID = dimensionID;
		dimensionID = newDimensionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_BINDING__DIMENSION_ID, oldDimensionID, dimensionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceType getPersistence() {
		return persistence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistence(PersistenceType newPersistence) {
		PersistenceType oldPersistence = persistence;
		persistence = newPersistence == null ? PERSISTENCE_EDEFAULT : newPersistence;
		boolean oldPersistenceESet = persistenceESet;
		persistenceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_BINDING__PERSISTENCE, oldPersistence, persistence, !oldPersistenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPersistence() {
		PersistenceType oldPersistence = persistence;
		boolean oldPersistenceESet = persistenceESet;
		persistence = PERSISTENCE_EDEFAULT;
		persistenceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DIMENSION_BINDING__PERSISTENCE, oldPersistence, PERSISTENCE_EDEFAULT, oldPersistenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPersistence() {
		return persistenceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefreshPolicyType getRefreshPolicy() {
		return refreshPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefreshPolicy(RefreshPolicyType newRefreshPolicy) {
		RefreshPolicyType oldRefreshPolicy = refreshPolicy;
		refreshPolicy = newRefreshPolicy == null ? REFRESH_POLICY_EDEFAULT : newRefreshPolicy;
		boolean oldRefreshPolicyESet = refreshPolicyESet;
		refreshPolicyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_BINDING__REFRESH_POLICY, oldRefreshPolicy, refreshPolicy, !oldRefreshPolicyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRefreshPolicy() {
		RefreshPolicyType oldRefreshPolicy = refreshPolicy;
		boolean oldRefreshPolicyESet = refreshPolicyESet;
		refreshPolicy = REFRESH_POLICY_EDEFAULT;
		refreshPolicyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DIMENSION_BINDING__REFRESH_POLICY, oldRefreshPolicy, REFRESH_POLICY_EDEFAULT, oldRefreshPolicyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRefreshPolicy() {
		return refreshPolicyESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DIMENSION_BINDING__REFRESH_INTERVAL, oldRefreshInterval, refreshInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmlaPackage.DIMENSION_BINDING__DATA_SOURCE_ID:
				return getDataSourceID();
			case XmlaPackage.DIMENSION_BINDING__DIMENSION_ID:
				return getDimensionID();
			case XmlaPackage.DIMENSION_BINDING__PERSISTENCE:
				return getPersistence();
			case XmlaPackage.DIMENSION_BINDING__REFRESH_POLICY:
				return getRefreshPolicy();
			case XmlaPackage.DIMENSION_BINDING__REFRESH_INTERVAL:
				return getRefreshInterval();
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
			case XmlaPackage.DIMENSION_BINDING__DATA_SOURCE_ID:
				setDataSourceID((String)newValue);
				return;
			case XmlaPackage.DIMENSION_BINDING__DIMENSION_ID:
				setDimensionID((String)newValue);
				return;
			case XmlaPackage.DIMENSION_BINDING__PERSISTENCE:
				setPersistence((PersistenceType)newValue);
				return;
			case XmlaPackage.DIMENSION_BINDING__REFRESH_POLICY:
				setRefreshPolicy((RefreshPolicyType)newValue);
				return;
			case XmlaPackage.DIMENSION_BINDING__REFRESH_INTERVAL:
				setRefreshInterval((Duration)newValue);
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
			case XmlaPackage.DIMENSION_BINDING__DATA_SOURCE_ID:
				setDataSourceID(DATA_SOURCE_ID_EDEFAULT);
				return;
			case XmlaPackage.DIMENSION_BINDING__DIMENSION_ID:
				setDimensionID(DIMENSION_ID_EDEFAULT);
				return;
			case XmlaPackage.DIMENSION_BINDING__PERSISTENCE:
				unsetPersistence();
				return;
			case XmlaPackage.DIMENSION_BINDING__REFRESH_POLICY:
				unsetRefreshPolicy();
				return;
			case XmlaPackage.DIMENSION_BINDING__REFRESH_INTERVAL:
				setRefreshInterval(REFRESH_INTERVAL_EDEFAULT);
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
			case XmlaPackage.DIMENSION_BINDING__DATA_SOURCE_ID:
				return DATA_SOURCE_ID_EDEFAULT == null ? dataSourceID != null : !DATA_SOURCE_ID_EDEFAULT.equals(dataSourceID);
			case XmlaPackage.DIMENSION_BINDING__DIMENSION_ID:
				return DIMENSION_ID_EDEFAULT == null ? dimensionID != null : !DIMENSION_ID_EDEFAULT.equals(dimensionID);
			case XmlaPackage.DIMENSION_BINDING__PERSISTENCE:
				return isSetPersistence();
			case XmlaPackage.DIMENSION_BINDING__REFRESH_POLICY:
				return isSetRefreshPolicy();
			case XmlaPackage.DIMENSION_BINDING__REFRESH_INTERVAL:
				return REFRESH_INTERVAL_EDEFAULT == null ? refreshInterval != null : !REFRESH_INTERVAL_EDEFAULT.equals(refreshInterval);
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
		result.append(" (dataSourceID: ");
		result.append(dataSourceID);
		result.append(", dimensionID: ");
		result.append(dimensionID);
		result.append(", persistence: ");
		if (persistenceESet) result.append(persistence); else result.append("<unset>");
		result.append(", refreshPolicy: ");
		if (refreshPolicyESet) result.append(refreshPolicy); else result.append("<unset>");
		result.append(", refreshInterval: ");
		result.append(refreshInterval);
		result.append(')');
		return result.toString();
	}

} //DimensionBindingImpl
