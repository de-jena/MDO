/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import javax.xml.datatype.Duration;

import org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.PersistenceType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.RefreshPolicyType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Group Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MeasureGroupBindingImpl#getDataSourceID <em>Data Source ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MeasureGroupBindingImpl#getCubeID <em>Cube ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MeasureGroupBindingImpl#getMeasureGroupID <em>Measure Group ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MeasureGroupBindingImpl#getPersistence <em>Persistence</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MeasureGroupBindingImpl#getRefreshPolicy <em>Refresh Policy</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MeasureGroupBindingImpl#getRefreshInterval <em>Refresh Interval</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MeasureGroupBindingImpl#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasureGroupBindingImpl extends BindingImpl implements MeasureGroupBinding {
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
	 * The default value of the '{@link #getCubeID() <em>Cube ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCubeID()
	 * @generated
	 * @ordered
	 */
	protected static final String CUBE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCubeID() <em>Cube ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCubeID()
	 * @generated
	 * @ordered
	 */
	protected String cubeID = CUBE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeasureGroupID() <em>Measure Group ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureGroupID()
	 * @generated
	 * @ordered
	 */
	protected static final String MEASURE_GROUP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeasureGroupID() <em>Measure Group ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureGroupID()
	 * @generated
	 * @ordered
	 */
	protected String measureGroupID = MEASURE_GROUP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPersistence() <em>Persistence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistence()
	 * @generated
	 * @ordered
	 */
	protected static final PersistenceType1 PERSISTENCE_EDEFAULT = PersistenceType1.NOT_PERSISTED;

	/**
	 * The cached value of the '{@link #getPersistence() <em>Persistence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistence()
	 * @generated
	 * @ordered
	 */
	protected PersistenceType1 persistence = PERSISTENCE_EDEFAULT;

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
	protected static final RefreshPolicyType1 REFRESH_POLICY_EDEFAULT = RefreshPolicyType1.BY_QUERY;

	/**
	 * The cached value of the '{@link #getRefreshPolicy() <em>Refresh Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshPolicy()
	 * @generated
	 * @ordered
	 */
	protected RefreshPolicyType1 refreshPolicy = REFRESH_POLICY_EDEFAULT;

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
	 * The default value of the '{@link #getFilter() <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected static final String FILTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected String filter = FILTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureGroupBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.MEASURE_GROUP_BINDING;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MEASURE_GROUP_BINDING__DATA_SOURCE_ID, oldDataSourceID, dataSourceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCubeID() {
		return cubeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCubeID(String newCubeID) {
		String oldCubeID = cubeID;
		cubeID = newCubeID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MEASURE_GROUP_BINDING__CUBE_ID, oldCubeID, cubeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeasureGroupID() {
		return measureGroupID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasureGroupID(String newMeasureGroupID) {
		String oldMeasureGroupID = measureGroupID;
		measureGroupID = newMeasureGroupID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MEASURE_GROUP_BINDING__MEASURE_GROUP_ID, oldMeasureGroupID, measureGroupID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceType1 getPersistence() {
		return persistence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistence(PersistenceType1 newPersistence) {
		PersistenceType1 oldPersistence = persistence;
		persistence = newPersistence == null ? PERSISTENCE_EDEFAULT : newPersistence;
		boolean oldPersistenceESet = persistenceESet;
		persistenceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MEASURE_GROUP_BINDING__PERSISTENCE, oldPersistence, persistence, !oldPersistenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPersistence() {
		PersistenceType1 oldPersistence = persistence;
		boolean oldPersistenceESet = persistenceESet;
		persistence = PERSISTENCE_EDEFAULT;
		persistenceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.MEASURE_GROUP_BINDING__PERSISTENCE, oldPersistence, PERSISTENCE_EDEFAULT, oldPersistenceESet));
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
	public RefreshPolicyType1 getRefreshPolicy() {
		return refreshPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefreshPolicy(RefreshPolicyType1 newRefreshPolicy) {
		RefreshPolicyType1 oldRefreshPolicy = refreshPolicy;
		refreshPolicy = newRefreshPolicy == null ? REFRESH_POLICY_EDEFAULT : newRefreshPolicy;
		boolean oldRefreshPolicyESet = refreshPolicyESet;
		refreshPolicyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MEASURE_GROUP_BINDING__REFRESH_POLICY, oldRefreshPolicy, refreshPolicy, !oldRefreshPolicyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRefreshPolicy() {
		RefreshPolicyType1 oldRefreshPolicy = refreshPolicy;
		boolean oldRefreshPolicyESet = refreshPolicyESet;
		refreshPolicy = REFRESH_POLICY_EDEFAULT;
		refreshPolicyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.MEASURE_GROUP_BINDING__REFRESH_POLICY, oldRefreshPolicy, REFRESH_POLICY_EDEFAULT, oldRefreshPolicyESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MEASURE_GROUP_BINDING__REFRESH_INTERVAL, oldRefreshInterval, refreshInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilter(String newFilter) {
		String oldFilter = filter;
		filter = newFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MEASURE_GROUP_BINDING__FILTER, oldFilter, filter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmlaPackage.MEASURE_GROUP_BINDING__DATA_SOURCE_ID:
				return getDataSourceID();
			case XmlaPackage.MEASURE_GROUP_BINDING__CUBE_ID:
				return getCubeID();
			case XmlaPackage.MEASURE_GROUP_BINDING__MEASURE_GROUP_ID:
				return getMeasureGroupID();
			case XmlaPackage.MEASURE_GROUP_BINDING__PERSISTENCE:
				return getPersistence();
			case XmlaPackage.MEASURE_GROUP_BINDING__REFRESH_POLICY:
				return getRefreshPolicy();
			case XmlaPackage.MEASURE_GROUP_BINDING__REFRESH_INTERVAL:
				return getRefreshInterval();
			case XmlaPackage.MEASURE_GROUP_BINDING__FILTER:
				return getFilter();
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
			case XmlaPackage.MEASURE_GROUP_BINDING__DATA_SOURCE_ID:
				setDataSourceID((String)newValue);
				return;
			case XmlaPackage.MEASURE_GROUP_BINDING__CUBE_ID:
				setCubeID((String)newValue);
				return;
			case XmlaPackage.MEASURE_GROUP_BINDING__MEASURE_GROUP_ID:
				setMeasureGroupID((String)newValue);
				return;
			case XmlaPackage.MEASURE_GROUP_BINDING__PERSISTENCE:
				setPersistence((PersistenceType1)newValue);
				return;
			case XmlaPackage.MEASURE_GROUP_BINDING__REFRESH_POLICY:
				setRefreshPolicy((RefreshPolicyType1)newValue);
				return;
			case XmlaPackage.MEASURE_GROUP_BINDING__REFRESH_INTERVAL:
				setRefreshInterval((Duration)newValue);
				return;
			case XmlaPackage.MEASURE_GROUP_BINDING__FILTER:
				setFilter((String)newValue);
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
			case XmlaPackage.MEASURE_GROUP_BINDING__DATA_SOURCE_ID:
				setDataSourceID(DATA_SOURCE_ID_EDEFAULT);
				return;
			case XmlaPackage.MEASURE_GROUP_BINDING__CUBE_ID:
				setCubeID(CUBE_ID_EDEFAULT);
				return;
			case XmlaPackage.MEASURE_GROUP_BINDING__MEASURE_GROUP_ID:
				setMeasureGroupID(MEASURE_GROUP_ID_EDEFAULT);
				return;
			case XmlaPackage.MEASURE_GROUP_BINDING__PERSISTENCE:
				unsetPersistence();
				return;
			case XmlaPackage.MEASURE_GROUP_BINDING__REFRESH_POLICY:
				unsetRefreshPolicy();
				return;
			case XmlaPackage.MEASURE_GROUP_BINDING__REFRESH_INTERVAL:
				setRefreshInterval(REFRESH_INTERVAL_EDEFAULT);
				return;
			case XmlaPackage.MEASURE_GROUP_BINDING__FILTER:
				setFilter(FILTER_EDEFAULT);
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
			case XmlaPackage.MEASURE_GROUP_BINDING__DATA_SOURCE_ID:
				return DATA_SOURCE_ID_EDEFAULT == null ? dataSourceID != null : !DATA_SOURCE_ID_EDEFAULT.equals(dataSourceID);
			case XmlaPackage.MEASURE_GROUP_BINDING__CUBE_ID:
				return CUBE_ID_EDEFAULT == null ? cubeID != null : !CUBE_ID_EDEFAULT.equals(cubeID);
			case XmlaPackage.MEASURE_GROUP_BINDING__MEASURE_GROUP_ID:
				return MEASURE_GROUP_ID_EDEFAULT == null ? measureGroupID != null : !MEASURE_GROUP_ID_EDEFAULT.equals(measureGroupID);
			case XmlaPackage.MEASURE_GROUP_BINDING__PERSISTENCE:
				return isSetPersistence();
			case XmlaPackage.MEASURE_GROUP_BINDING__REFRESH_POLICY:
				return isSetRefreshPolicy();
			case XmlaPackage.MEASURE_GROUP_BINDING__REFRESH_INTERVAL:
				return REFRESH_INTERVAL_EDEFAULT == null ? refreshInterval != null : !REFRESH_INTERVAL_EDEFAULT.equals(refreshInterval);
			case XmlaPackage.MEASURE_GROUP_BINDING__FILTER:
				return FILTER_EDEFAULT == null ? filter != null : !FILTER_EDEFAULT.equals(filter);
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
		result.append(", cubeID: ");
		result.append(cubeID);
		result.append(", measureGroupID: ");
		result.append(measureGroupID);
		result.append(", persistence: ");
		if (persistenceESet) result.append(persistence); else result.append("<unset>");
		result.append(", refreshPolicy: ");
		if (refreshPolicyESet) result.append(refreshPolicy); else result.append("<unset>");
		result.append(", refreshInterval: ");
		result.append(refreshInterval);
		result.append(", filter: ");
		result.append(filter);
		result.append(')');
		return result.toString();
	}

} //MeasureGroupBindingImpl
