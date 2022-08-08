/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine200.impl;

import org.eclipse.daanse.xmla.model.ecore.engine200.Engine200Package;
import org.eclipse.daanse.xmla.model.ecore.engine200.WarningMeasureType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Warning Measure Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200.impl.WarningMeasureTypeImpl#getCube <em>Cube</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200.impl.WarningMeasureTypeImpl#getMeasureGroup <em>Measure Group</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200.impl.WarningMeasureTypeImpl#getMeasureName <em>Measure Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WarningMeasureTypeImpl extends MinimalEObjectImpl.Container implements WarningMeasureType {
	/**
	 * The default value of the '{@link #getCube() <em>Cube</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCube()
	 * @generated
	 * @ordered
	 */
	protected static final String CUBE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCube() <em>Cube</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCube()
	 * @generated
	 * @ordered
	 */
	protected String cube = CUBE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeasureGroup() <em>Measure Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String MEASURE_GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeasureGroup() <em>Measure Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureGroup()
	 * @generated
	 * @ordered
	 */
	protected String measureGroup = MEASURE_GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeasureName() <em>Measure Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureName()
	 * @generated
	 * @ordered
	 */
	protected static final String MEASURE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeasureName() <em>Measure Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureName()
	 * @generated
	 * @ordered
	 */
	protected String measureName = MEASURE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WarningMeasureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Engine200Package.Literals.WARNING_MEASURE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCube() {
		return cube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCube(String newCube) {
		String oldCube = cube;
		cube = newCube;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Engine200Package.WARNING_MEASURE_TYPE__CUBE, oldCube, cube));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeasureGroup() {
		return measureGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasureGroup(String newMeasureGroup) {
		String oldMeasureGroup = measureGroup;
		measureGroup = newMeasureGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Engine200Package.WARNING_MEASURE_TYPE__MEASURE_GROUP, oldMeasureGroup, measureGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeasureName() {
		return measureName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasureName(String newMeasureName) {
		String oldMeasureName = measureName;
		measureName = newMeasureName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Engine200Package.WARNING_MEASURE_TYPE__MEASURE_NAME, oldMeasureName, measureName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Engine200Package.WARNING_MEASURE_TYPE__CUBE:
				return getCube();
			case Engine200Package.WARNING_MEASURE_TYPE__MEASURE_GROUP:
				return getMeasureGroup();
			case Engine200Package.WARNING_MEASURE_TYPE__MEASURE_NAME:
				return getMeasureName();
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
			case Engine200Package.WARNING_MEASURE_TYPE__CUBE:
				setCube((String)newValue);
				return;
			case Engine200Package.WARNING_MEASURE_TYPE__MEASURE_GROUP:
				setMeasureGroup((String)newValue);
				return;
			case Engine200Package.WARNING_MEASURE_TYPE__MEASURE_NAME:
				setMeasureName((String)newValue);
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
			case Engine200Package.WARNING_MEASURE_TYPE__CUBE:
				setCube(CUBE_EDEFAULT);
				return;
			case Engine200Package.WARNING_MEASURE_TYPE__MEASURE_GROUP:
				setMeasureGroup(MEASURE_GROUP_EDEFAULT);
				return;
			case Engine200Package.WARNING_MEASURE_TYPE__MEASURE_NAME:
				setMeasureName(MEASURE_NAME_EDEFAULT);
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
			case Engine200Package.WARNING_MEASURE_TYPE__CUBE:
				return CUBE_EDEFAULT == null ? cube != null : !CUBE_EDEFAULT.equals(cube);
			case Engine200Package.WARNING_MEASURE_TYPE__MEASURE_GROUP:
				return MEASURE_GROUP_EDEFAULT == null ? measureGroup != null : !MEASURE_GROUP_EDEFAULT.equals(measureGroup);
			case Engine200Package.WARNING_MEASURE_TYPE__MEASURE_NAME:
				return MEASURE_NAME_EDEFAULT == null ? measureName != null : !MEASURE_NAME_EDEFAULT.equals(measureName);
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
		result.append(" (cube: ");
		result.append(cube);
		result.append(", measureGroup: ");
		result.append(measureGroup);
		result.append(", measureName: ");
		result.append(measureName);
		result.append(')');
		return result.toString();
	}

} //WarningMeasureTypeImpl
