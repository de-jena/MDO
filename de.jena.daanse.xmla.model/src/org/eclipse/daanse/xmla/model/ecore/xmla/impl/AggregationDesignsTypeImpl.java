/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.util.Collection;

import org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesign;
import org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesignsType;
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
 * An implementation of the model object '<em><b>Aggregation Designs Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AggregationDesignsTypeImpl#getAggregationDesign <em>Aggregation Design</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AggregationDesignsTypeImpl extends MinimalEObjectImpl.Container implements AggregationDesignsType {
	/**
	 * The cached value of the '{@link #getAggregationDesign() <em>Aggregation Design</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationDesign()
	 * @generated
	 * @ordered
	 */
	protected EList<AggregationDesign> aggregationDesign;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregationDesignsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.AGGREGATION_DESIGNS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AggregationDesign> getAggregationDesign() {
		if (aggregationDesign == null) {
			aggregationDesign = new EObjectContainmentEList<AggregationDesign>(AggregationDesign.class, this, XmlaPackage.AGGREGATION_DESIGNS_TYPE__AGGREGATION_DESIGN);
		}
		return aggregationDesign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.AGGREGATION_DESIGNS_TYPE__AGGREGATION_DESIGN:
				return ((InternalEList<?>)getAggregationDesign()).basicRemove(otherEnd, msgs);
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
			case XmlaPackage.AGGREGATION_DESIGNS_TYPE__AGGREGATION_DESIGN:
				return getAggregationDesign();
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
			case XmlaPackage.AGGREGATION_DESIGNS_TYPE__AGGREGATION_DESIGN:
				getAggregationDesign().clear();
				getAggregationDesign().addAll((Collection<? extends AggregationDesign>)newValue);
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
			case XmlaPackage.AGGREGATION_DESIGNS_TYPE__AGGREGATION_DESIGN:
				getAggregationDesign().clear();
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
			case XmlaPackage.AGGREGATION_DESIGNS_TYPE__AGGREGATION_DESIGN:
				return aggregationDesign != null && !aggregationDesign.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AggregationDesignsTypeImpl
