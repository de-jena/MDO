/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.util.Collection;

import org.eclipse.daanse.xmla.model.ecore.xmla.MiningModelingFlag;
import org.eclipse.daanse.xmla.model.ecore.xmla.ModelingFlagsType;
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
 * An implementation of the model object '<em><b>Modeling Flags Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ModelingFlagsTypeImpl#getModelingFlag <em>Modeling Flag</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelingFlagsTypeImpl extends MinimalEObjectImpl.Container implements ModelingFlagsType {
	/**
	 * The cached value of the '{@link #getModelingFlag() <em>Modeling Flag</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelingFlag()
	 * @generated
	 * @ordered
	 */
	protected EList<MiningModelingFlag> modelingFlag;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelingFlagsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.MODELING_FLAGS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MiningModelingFlag> getModelingFlag() {
		if (modelingFlag == null) {
			modelingFlag = new EObjectContainmentEList<MiningModelingFlag>(MiningModelingFlag.class, this, XmlaPackage.MODELING_FLAGS_TYPE__MODELING_FLAG);
		}
		return modelingFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.MODELING_FLAGS_TYPE__MODELING_FLAG:
				return ((InternalEList<?>)getModelingFlag()).basicRemove(otherEnd, msgs);
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
			case XmlaPackage.MODELING_FLAGS_TYPE__MODELING_FLAG:
				return getModelingFlag();
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
			case XmlaPackage.MODELING_FLAGS_TYPE__MODELING_FLAG:
				getModelingFlag().clear();
				getModelingFlag().addAll((Collection<? extends MiningModelingFlag>)newValue);
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
			case XmlaPackage.MODELING_FLAGS_TYPE__MODELING_FLAG:
				getModelingFlag().clear();
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
			case XmlaPackage.MODELING_FLAGS_TYPE__MODELING_FLAG:
				return modelingFlag != null && !modelingFlag.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelingFlagsTypeImpl
