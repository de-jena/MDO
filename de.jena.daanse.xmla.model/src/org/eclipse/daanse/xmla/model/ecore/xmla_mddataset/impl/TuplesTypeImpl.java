/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl;

import java.util.Collection;

import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.TupleType;
import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.TuplesType;
import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Xmla_mddatasetPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tuples Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.TuplesTypeImpl#getTuple <em>Tuple</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TuplesTypeImpl extends MinimalEObjectImpl.Container implements TuplesType {
	/**
	 * The cached value of the '{@link #getTuple() <em>Tuple</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTuple()
	 * @generated
	 * @ordered
	 */
	protected EList<TupleType> tuple;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TuplesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xmla_mddatasetPackage.Literals.TUPLES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TupleType> getTuple() {
		if (tuple == null) {
			tuple = new EObjectContainmentEList<TupleType>(TupleType.class, this, Xmla_mddatasetPackage.TUPLES_TYPE__TUPLE);
		}
		return tuple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Xmla_mddatasetPackage.TUPLES_TYPE__TUPLE:
				return ((InternalEList<?>)getTuple()).basicRemove(otherEnd, msgs);
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
			case Xmla_mddatasetPackage.TUPLES_TYPE__TUPLE:
				return getTuple();
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
			case Xmla_mddatasetPackage.TUPLES_TYPE__TUPLE:
				getTuple().clear();
				getTuple().addAll((Collection<? extends TupleType>)newValue);
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
			case Xmla_mddatasetPackage.TUPLES_TYPE__TUPLE:
				getTuple().clear();
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
			case Xmla_mddatasetPackage.TUPLES_TYPE__TUPLE:
				return tuple != null && !tuple.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TuplesTypeImpl
