/*
 */
package de.jena.mdo.ibis.common.impl;

import de.jena.mdo.ibis.common.IbisCommonPackage;
import de.jena.mdo.ibis.common.ServiceSpecificationWithStateListStructure;
import de.jena.mdo.ibis.common.ServiceSpecificationWithStateStructure;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Specification With State List Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.impl.ServiceSpecificationWithStateListStructureImpl#getServiceSpecificationWithState <em>Service Specification With State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceSpecificationWithStateListStructureImpl extends MinimalEObjectImpl.Container implements ServiceSpecificationWithStateListStructure {
	/**
	 * The cached value of the '{@link #getServiceSpecificationWithState() <em>Service Specification With State</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceSpecificationWithState()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceSpecificationWithStateStructure> serviceSpecificationWithState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceSpecificationWithStateListStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.Literals.SERVICE_SPECIFICATION_WITH_STATE_LIST_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServiceSpecificationWithStateStructure> getServiceSpecificationWithState() {
		if (serviceSpecificationWithState == null) {
			serviceSpecificationWithState = new EObjectContainmentEList<ServiceSpecificationWithStateStructure>(ServiceSpecificationWithStateStructure.class, this, IbisCommonPackage.SERVICE_SPECIFICATION_WITH_STATE_LIST_STRUCTURE__SERVICE_SPECIFICATION_WITH_STATE);
		}
		return serviceSpecificationWithState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.SERVICE_SPECIFICATION_WITH_STATE_LIST_STRUCTURE__SERVICE_SPECIFICATION_WITH_STATE:
				return ((InternalEList<?>)getServiceSpecificationWithState()).basicRemove(otherEnd, msgs);
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
			case IbisCommonPackage.SERVICE_SPECIFICATION_WITH_STATE_LIST_STRUCTURE__SERVICE_SPECIFICATION_WITH_STATE:
				return getServiceSpecificationWithState();
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
			case IbisCommonPackage.SERVICE_SPECIFICATION_WITH_STATE_LIST_STRUCTURE__SERVICE_SPECIFICATION_WITH_STATE:
				getServiceSpecificationWithState().clear();
				getServiceSpecificationWithState().addAll((Collection<? extends ServiceSpecificationWithStateStructure>)newValue);
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
			case IbisCommonPackage.SERVICE_SPECIFICATION_WITH_STATE_LIST_STRUCTURE__SERVICE_SPECIFICATION_WITH_STATE:
				getServiceSpecificationWithState().clear();
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
			case IbisCommonPackage.SERVICE_SPECIFICATION_WITH_STATE_LIST_STRUCTURE__SERVICE_SPECIFICATION_WITH_STATE:
				return serviceSpecificationWithState != null && !serviceSpecificationWithState.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceSpecificationWithStateListStructureImpl
