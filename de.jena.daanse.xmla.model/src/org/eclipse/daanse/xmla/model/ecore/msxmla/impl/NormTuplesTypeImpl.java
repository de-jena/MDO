/**
 */
package org.eclipse.daanse.xmla.model.ecore.msxmla.impl;

import java.util.Collection;

import org.eclipse.daanse.xmla.model.ecore.msxmla.MsxmlaPackage;
import org.eclipse.daanse.xmla.model.ecore.msxmla.NormTupleType;
import org.eclipse.daanse.xmla.model.ecore.msxmla.NormTuplesType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Norm Tuples Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.msxmla.impl.NormTuplesTypeImpl#getNormTuple <em>Norm Tuple</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NormTuplesTypeImpl extends MinimalEObjectImpl.Container implements NormTuplesType {
	/**
	 * The cached value of the '{@link #getNormTuple() <em>Norm Tuple</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormTuple()
	 * @generated
	 * @ordered
	 */
	protected EList<NormTupleType> normTuple;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormTuplesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MsxmlaPackage.Literals.NORM_TUPLES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NormTupleType> getNormTuple() {
		if (normTuple == null) {
			normTuple = new EObjectContainmentEList<NormTupleType>(NormTupleType.class, this, MsxmlaPackage.NORM_TUPLES_TYPE__NORM_TUPLE);
		}
		return normTuple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MsxmlaPackage.NORM_TUPLES_TYPE__NORM_TUPLE:
				return ((InternalEList<?>)getNormTuple()).basicRemove(otherEnd, msgs);
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
			case MsxmlaPackage.NORM_TUPLES_TYPE__NORM_TUPLE:
				return getNormTuple();
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
			case MsxmlaPackage.NORM_TUPLES_TYPE__NORM_TUPLE:
				getNormTuple().clear();
				getNormTuple().addAll((Collection<? extends NormTupleType>)newValue);
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
			case MsxmlaPackage.NORM_TUPLES_TYPE__NORM_TUPLE:
				getNormTuple().clear();
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
			case MsxmlaPackage.NORM_TUPLES_TYPE__NORM_TUPLE:
				return normTuple != null && !normTuple.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NormTuplesTypeImpl
