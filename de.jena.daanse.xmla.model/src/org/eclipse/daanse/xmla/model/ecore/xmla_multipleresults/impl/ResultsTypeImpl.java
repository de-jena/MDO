/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla_multipleresults.impl;

import java.util.Collection;

import org.eclipse.daanse.xmla.model.ecore.xmla_empty.Emptyresult;

import org.eclipse.daanse.xmla.model.ecore.xmla_multipleresults.ResultsType;
import org.eclipse.daanse.xmla.model.ecore.xmla_multipleresults.Xmla_multipleresultsPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Results Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_multipleresults.impl.ResultsTypeImpl#getRoot <em>Root</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResultsTypeImpl extends MinimalEObjectImpl.Container implements ResultsType {
	/**
	 * The cached value of the '{@link #getRoot() <em>Root</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected EList<Emptyresult> root;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xmla_multipleresultsPackage.Literals.RESULTS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Emptyresult> getRoot() {
		if (root == null) {
			root = new EObjectContainmentEList<Emptyresult>(Emptyresult.class, this, Xmla_multipleresultsPackage.RESULTS_TYPE__ROOT);
		}
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Xmla_multipleresultsPackage.RESULTS_TYPE__ROOT:
				return ((InternalEList<?>)getRoot()).basicRemove(otherEnd, msgs);
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
			case Xmla_multipleresultsPackage.RESULTS_TYPE__ROOT:
				return getRoot();
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
			case Xmla_multipleresultsPackage.RESULTS_TYPE__ROOT:
				getRoot().clear();
				getRoot().addAll((Collection<? extends Emptyresult>)newValue);
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
			case Xmla_multipleresultsPackage.RESULTS_TYPE__ROOT:
				getRoot().clear();
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
			case Xmla_multipleresultsPackage.RESULTS_TYPE__ROOT:
				return root != null && !root.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResultsTypeImpl
