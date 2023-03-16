/*
 */
package de.jena.mdo.ibis.ibis_common.impl;

import de.jena.mdo.ibis.ibis_common.IbisCommonPackage;
import de.jena.mdo.ibis.ibis_common.ServiceSpecificationWithState;
import de.jena.mdo.ibis.ibis_common.ServiceSpecificationWithStateList;

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
 * An implementation of the model object '<em><b>Service Specification With State List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.ServiceSpecificationWithStateListImpl#getServiceSpecificationWithState <em>Service Specification With State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceSpecificationWithStateListImpl extends MinimalEObjectImpl.Container implements ServiceSpecificationWithStateList {
	/**
	 * The cached value of the '{@link #getServiceSpecificationWithState() <em>Service Specification With State</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceSpecificationWithState()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceSpecificationWithState> serviceSpecificationWithState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceSpecificationWithStateListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.Literals.SERVICE_SPECIFICATION_WITH_STATE_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServiceSpecificationWithState> getServiceSpecificationWithState() {
		if (serviceSpecificationWithState == null) {
			serviceSpecificationWithState = new EObjectContainmentEList<ServiceSpecificationWithState>(ServiceSpecificationWithState.class, this, IbisCommonPackage.SERVICE_SPECIFICATION_WITH_STATE_LIST__SERVICE_SPECIFICATION_WITH_STATE);
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
			case IbisCommonPackage.SERVICE_SPECIFICATION_WITH_STATE_LIST__SERVICE_SPECIFICATION_WITH_STATE:
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
			case IbisCommonPackage.SERVICE_SPECIFICATION_WITH_STATE_LIST__SERVICE_SPECIFICATION_WITH_STATE:
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
			case IbisCommonPackage.SERVICE_SPECIFICATION_WITH_STATE_LIST__SERVICE_SPECIFICATION_WITH_STATE:
				getServiceSpecificationWithState().clear();
				getServiceSpecificationWithState().addAll((Collection<? extends ServiceSpecificationWithState>)newValue);
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
			case IbisCommonPackage.SERVICE_SPECIFICATION_WITH_STATE_LIST__SERVICE_SPECIFICATION_WITH_STATE:
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
			case IbisCommonPackage.SERVICE_SPECIFICATION_WITH_STATE_LIST__SERVICE_SPECIFICATION_WITH_STATE:
				return serviceSpecificationWithState != null && !serviceSpecificationWithState.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceSpecificationWithStateListImpl
