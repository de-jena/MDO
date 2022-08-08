/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine200.impl;

import org.eclipse.daanse.xmla.model.ecore.engine200.Engine200Package;
import org.eclipse.daanse.xmla.model.ecore.engine200.WarningColumnType;
import org.eclipse.daanse.xmla.model.ecore.engine200.WarningLocationObject;
import org.eclipse.daanse.xmla.model.ecore.engine200.WarningMeasureType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Warning Location Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200.impl.WarningLocationObjectImpl#getWarningColumn <em>Warning Column</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200.impl.WarningLocationObjectImpl#getWarningMeasure <em>Warning Measure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WarningLocationObjectImpl extends MinimalEObjectImpl.Container implements WarningLocationObject {
	/**
	 * The cached value of the '{@link #getWarningColumn() <em>Warning Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarningColumn()
	 * @generated
	 * @ordered
	 */
	protected WarningColumnType warningColumn;

	/**
	 * The cached value of the '{@link #getWarningMeasure() <em>Warning Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarningMeasure()
	 * @generated
	 * @ordered
	 */
	protected WarningMeasureType warningMeasure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WarningLocationObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Engine200Package.Literals.WARNING_LOCATION_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WarningColumnType getWarningColumn() {
		return warningColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWarningColumn(WarningColumnType newWarningColumn, NotificationChain msgs) {
		WarningColumnType oldWarningColumn = warningColumn;
		warningColumn = newWarningColumn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Engine200Package.WARNING_LOCATION_OBJECT__WARNING_COLUMN, oldWarningColumn, newWarningColumn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWarningColumn(WarningColumnType newWarningColumn) {
		if (newWarningColumn != warningColumn) {
			NotificationChain msgs = null;
			if (warningColumn != null)
				msgs = ((InternalEObject)warningColumn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Engine200Package.WARNING_LOCATION_OBJECT__WARNING_COLUMN, null, msgs);
			if (newWarningColumn != null)
				msgs = ((InternalEObject)newWarningColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Engine200Package.WARNING_LOCATION_OBJECT__WARNING_COLUMN, null, msgs);
			msgs = basicSetWarningColumn(newWarningColumn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Engine200Package.WARNING_LOCATION_OBJECT__WARNING_COLUMN, newWarningColumn, newWarningColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WarningMeasureType getWarningMeasure() {
		return warningMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWarningMeasure(WarningMeasureType newWarningMeasure, NotificationChain msgs) {
		WarningMeasureType oldWarningMeasure = warningMeasure;
		warningMeasure = newWarningMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Engine200Package.WARNING_LOCATION_OBJECT__WARNING_MEASURE, oldWarningMeasure, newWarningMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWarningMeasure(WarningMeasureType newWarningMeasure) {
		if (newWarningMeasure != warningMeasure) {
			NotificationChain msgs = null;
			if (warningMeasure != null)
				msgs = ((InternalEObject)warningMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Engine200Package.WARNING_LOCATION_OBJECT__WARNING_MEASURE, null, msgs);
			if (newWarningMeasure != null)
				msgs = ((InternalEObject)newWarningMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Engine200Package.WARNING_LOCATION_OBJECT__WARNING_MEASURE, null, msgs);
			msgs = basicSetWarningMeasure(newWarningMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Engine200Package.WARNING_LOCATION_OBJECT__WARNING_MEASURE, newWarningMeasure, newWarningMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Engine200Package.WARNING_LOCATION_OBJECT__WARNING_COLUMN:
				return basicSetWarningColumn(null, msgs);
			case Engine200Package.WARNING_LOCATION_OBJECT__WARNING_MEASURE:
				return basicSetWarningMeasure(null, msgs);
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
			case Engine200Package.WARNING_LOCATION_OBJECT__WARNING_COLUMN:
				return getWarningColumn();
			case Engine200Package.WARNING_LOCATION_OBJECT__WARNING_MEASURE:
				return getWarningMeasure();
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
			case Engine200Package.WARNING_LOCATION_OBJECT__WARNING_COLUMN:
				setWarningColumn((WarningColumnType)newValue);
				return;
			case Engine200Package.WARNING_LOCATION_OBJECT__WARNING_MEASURE:
				setWarningMeasure((WarningMeasureType)newValue);
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
			case Engine200Package.WARNING_LOCATION_OBJECT__WARNING_COLUMN:
				setWarningColumn((WarningColumnType)null);
				return;
			case Engine200Package.WARNING_LOCATION_OBJECT__WARNING_MEASURE:
				setWarningMeasure((WarningMeasureType)null);
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
			case Engine200Package.WARNING_LOCATION_OBJECT__WARNING_COLUMN:
				return warningColumn != null;
			case Engine200Package.WARNING_LOCATION_OBJECT__WARNING_MEASURE:
				return warningMeasure != null;
		}
		return super.eIsSet(featureID);
	}

} //WarningLocationObjectImpl
