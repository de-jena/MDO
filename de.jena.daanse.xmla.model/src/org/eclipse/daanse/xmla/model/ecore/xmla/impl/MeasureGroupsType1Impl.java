/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.util.Collection;

import org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupsType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveMeasureGroup;
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
 * An implementation of the model object '<em><b>Measure Groups Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MeasureGroupsType1Impl#getMeasureGroup <em>Measure Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasureGroupsType1Impl extends MinimalEObjectImpl.Container implements MeasureGroupsType1 {
	/**
	 * The cached value of the '{@link #getMeasureGroup() <em>Measure Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<PerspectiveMeasureGroup> measureGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureGroupsType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.MEASURE_GROUPS_TYPE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PerspectiveMeasureGroup> getMeasureGroup() {
		if (measureGroup == null) {
			measureGroup = new EObjectContainmentEList<PerspectiveMeasureGroup>(PerspectiveMeasureGroup.class, this, XmlaPackage.MEASURE_GROUPS_TYPE1__MEASURE_GROUP);
		}
		return measureGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.MEASURE_GROUPS_TYPE1__MEASURE_GROUP:
				return ((InternalEList<?>)getMeasureGroup()).basicRemove(otherEnd, msgs);
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
			case XmlaPackage.MEASURE_GROUPS_TYPE1__MEASURE_GROUP:
				return getMeasureGroup();
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
			case XmlaPackage.MEASURE_GROUPS_TYPE1__MEASURE_GROUP:
				getMeasureGroup().clear();
				getMeasureGroup().addAll((Collection<? extends PerspectiveMeasureGroup>)newValue);
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
			case XmlaPackage.MEASURE_GROUPS_TYPE1__MEASURE_GROUP:
				getMeasureGroup().clear();
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
			case XmlaPackage.MEASURE_GROUPS_TYPE1__MEASURE_GROUP:
				return measureGroup != null && !measureGroup.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MeasureGroupsType1Impl
