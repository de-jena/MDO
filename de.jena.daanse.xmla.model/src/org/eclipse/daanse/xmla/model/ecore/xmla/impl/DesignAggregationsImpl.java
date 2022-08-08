/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.math.BigInteger;

import javax.xml.datatype.Duration;

import org.eclipse.daanse.xmla.model.ecore.xmla.DesignAggregations;
import org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference;
import org.eclipse.daanse.xmla.model.ecore.xmla.QueriesType;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Design Aggregations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DesignAggregationsImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DesignAggregationsImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DesignAggregationsImpl#getSteps <em>Steps</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DesignAggregationsImpl#getOptimization <em>Optimization</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DesignAggregationsImpl#getStorage <em>Storage</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DesignAggregationsImpl#isMaterialize <em>Materialize</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DesignAggregationsImpl#getQueries <em>Queries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DesignAggregationsImpl extends MinimalEObjectImpl.Container implements DesignAggregations {
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
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final Duration TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected Duration time = TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSteps() <em>Steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger STEPS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected BigInteger steps = STEPS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOptimization() <em>Optimization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptimization()
	 * @generated
	 * @ordered
	 */
	protected static final double OPTIMIZATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOptimization() <em>Optimization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptimization()
	 * @generated
	 * @ordered
	 */
	protected double optimization = OPTIMIZATION_EDEFAULT;

	/**
	 * This is true if the Optimization attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean optimizationESet;

	/**
	 * The default value of the '{@link #getStorage() <em>Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorage()
	 * @generated
	 * @ordered
	 */
	protected static final long STORAGE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getStorage() <em>Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorage()
	 * @generated
	 * @ordered
	 */
	protected long storage = STORAGE_EDEFAULT;

	/**
	 * This is true if the Storage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean storageESet;

	/**
	 * The default value of the '{@link #isMaterialize() <em>Materialize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMaterialize()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MATERIALIZE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMaterialize() <em>Materialize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMaterialize()
	 * @generated
	 * @ordered
	 */
	protected boolean materialize = MATERIALIZE_EDEFAULT;

	/**
	 * This is true if the Materialize attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean materializeESet;

	/**
	 * The cached value of the '{@link #getQueries() <em>Queries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueries()
	 * @generated
	 * @ordered
	 */
	protected QueriesType queries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DesignAggregationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.DESIGN_AGGREGATIONS;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DESIGN_AGGREGATIONS__OBJECT, oldObject, newObject);
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
				msgs = ((InternalEObject)object).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DESIGN_AGGREGATIONS__OBJECT, null, msgs);
			if (newObject != null)
				msgs = ((InternalEObject)newObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DESIGN_AGGREGATIONS__OBJECT, null, msgs);
			msgs = basicSetObject(newObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DESIGN_AGGREGATIONS__OBJECT, newObject, newObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(Duration newTime) {
		Duration oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DESIGN_AGGREGATIONS__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getSteps() {
		return steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSteps(BigInteger newSteps) {
		BigInteger oldSteps = steps;
		steps = newSteps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DESIGN_AGGREGATIONS__STEPS, oldSteps, steps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getOptimization() {
		return optimization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptimization(double newOptimization) {
		double oldOptimization = optimization;
		optimization = newOptimization;
		boolean oldOptimizationESet = optimizationESet;
		optimizationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DESIGN_AGGREGATIONS__OPTIMIZATION, oldOptimization, optimization, !oldOptimizationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOptimization() {
		double oldOptimization = optimization;
		boolean oldOptimizationESet = optimizationESet;
		optimization = OPTIMIZATION_EDEFAULT;
		optimizationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DESIGN_AGGREGATIONS__OPTIMIZATION, oldOptimization, OPTIMIZATION_EDEFAULT, oldOptimizationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOptimization() {
		return optimizationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getStorage() {
		return storage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStorage(long newStorage) {
		long oldStorage = storage;
		storage = newStorage;
		boolean oldStorageESet = storageESet;
		storageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DESIGN_AGGREGATIONS__STORAGE, oldStorage, storage, !oldStorageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStorage() {
		long oldStorage = storage;
		boolean oldStorageESet = storageESet;
		storage = STORAGE_EDEFAULT;
		storageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DESIGN_AGGREGATIONS__STORAGE, oldStorage, STORAGE_EDEFAULT, oldStorageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStorage() {
		return storageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMaterialize() {
		return materialize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaterialize(boolean newMaterialize) {
		boolean oldMaterialize = materialize;
		materialize = newMaterialize;
		boolean oldMaterializeESet = materializeESet;
		materializeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DESIGN_AGGREGATIONS__MATERIALIZE, oldMaterialize, materialize, !oldMaterializeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaterialize() {
		boolean oldMaterialize = materialize;
		boolean oldMaterializeESet = materializeESet;
		materialize = MATERIALIZE_EDEFAULT;
		materializeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DESIGN_AGGREGATIONS__MATERIALIZE, oldMaterialize, MATERIALIZE_EDEFAULT, oldMaterializeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaterialize() {
		return materializeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueriesType getQueries() {
		return queries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueries(QueriesType newQueries, NotificationChain msgs) {
		QueriesType oldQueries = queries;
		queries = newQueries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DESIGN_AGGREGATIONS__QUERIES, oldQueries, newQueries);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueries(QueriesType newQueries) {
		if (newQueries != queries) {
			NotificationChain msgs = null;
			if (queries != null)
				msgs = ((InternalEObject)queries).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DESIGN_AGGREGATIONS__QUERIES, null, msgs);
			if (newQueries != null)
				msgs = ((InternalEObject)newQueries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DESIGN_AGGREGATIONS__QUERIES, null, msgs);
			msgs = basicSetQueries(newQueries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DESIGN_AGGREGATIONS__QUERIES, newQueries, newQueries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.DESIGN_AGGREGATIONS__OBJECT:
				return basicSetObject(null, msgs);
			case XmlaPackage.DESIGN_AGGREGATIONS__QUERIES:
				return basicSetQueries(null, msgs);
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
			case XmlaPackage.DESIGN_AGGREGATIONS__OBJECT:
				return getObject();
			case XmlaPackage.DESIGN_AGGREGATIONS__TIME:
				return getTime();
			case XmlaPackage.DESIGN_AGGREGATIONS__STEPS:
				return getSteps();
			case XmlaPackage.DESIGN_AGGREGATIONS__OPTIMIZATION:
				return getOptimization();
			case XmlaPackage.DESIGN_AGGREGATIONS__STORAGE:
				return getStorage();
			case XmlaPackage.DESIGN_AGGREGATIONS__MATERIALIZE:
				return isMaterialize();
			case XmlaPackage.DESIGN_AGGREGATIONS__QUERIES:
				return getQueries();
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
			case XmlaPackage.DESIGN_AGGREGATIONS__OBJECT:
				setObject((ObjectReference)newValue);
				return;
			case XmlaPackage.DESIGN_AGGREGATIONS__TIME:
				setTime((Duration)newValue);
				return;
			case XmlaPackage.DESIGN_AGGREGATIONS__STEPS:
				setSteps((BigInteger)newValue);
				return;
			case XmlaPackage.DESIGN_AGGREGATIONS__OPTIMIZATION:
				setOptimization((Double)newValue);
				return;
			case XmlaPackage.DESIGN_AGGREGATIONS__STORAGE:
				setStorage((Long)newValue);
				return;
			case XmlaPackage.DESIGN_AGGREGATIONS__MATERIALIZE:
				setMaterialize((Boolean)newValue);
				return;
			case XmlaPackage.DESIGN_AGGREGATIONS__QUERIES:
				setQueries((QueriesType)newValue);
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
			case XmlaPackage.DESIGN_AGGREGATIONS__OBJECT:
				setObject((ObjectReference)null);
				return;
			case XmlaPackage.DESIGN_AGGREGATIONS__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case XmlaPackage.DESIGN_AGGREGATIONS__STEPS:
				setSteps(STEPS_EDEFAULT);
				return;
			case XmlaPackage.DESIGN_AGGREGATIONS__OPTIMIZATION:
				unsetOptimization();
				return;
			case XmlaPackage.DESIGN_AGGREGATIONS__STORAGE:
				unsetStorage();
				return;
			case XmlaPackage.DESIGN_AGGREGATIONS__MATERIALIZE:
				unsetMaterialize();
				return;
			case XmlaPackage.DESIGN_AGGREGATIONS__QUERIES:
				setQueries((QueriesType)null);
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
			case XmlaPackage.DESIGN_AGGREGATIONS__OBJECT:
				return object != null;
			case XmlaPackage.DESIGN_AGGREGATIONS__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case XmlaPackage.DESIGN_AGGREGATIONS__STEPS:
				return STEPS_EDEFAULT == null ? steps != null : !STEPS_EDEFAULT.equals(steps);
			case XmlaPackage.DESIGN_AGGREGATIONS__OPTIMIZATION:
				return isSetOptimization();
			case XmlaPackage.DESIGN_AGGREGATIONS__STORAGE:
				return isSetStorage();
			case XmlaPackage.DESIGN_AGGREGATIONS__MATERIALIZE:
				return isSetMaterialize();
			case XmlaPackage.DESIGN_AGGREGATIONS__QUERIES:
				return queries != null;
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
		result.append(" (time: ");
		result.append(time);
		result.append(", steps: ");
		result.append(steps);
		result.append(", optimization: ");
		if (optimizationESet) result.append(optimization); else result.append("<unset>");
		result.append(", storage: ");
		if (storageESet) result.append(storage); else result.append("<unset>");
		result.append(", materialize: ");
		if (materializeESet) result.append(materialize); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DesignAggregationsImpl
