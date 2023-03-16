/*
 */
package de.jena.mdo.ibis.ibis_common.impl;

import de.jena.mdo.ibis.ibis_common.IbisCommonPackage;
import de.jena.mdo.ibis.ibis_common.ServiceIdentificationWithState;
import de.jena.mdo.ibis.ibis_common.ServiceIdentificationWithStateList;

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
 * An implementation of the model object '<em><b>Service Identification With State List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.ServiceIdentificationWithStateListImpl#getServiceIdentificationWithState <em>Service Identification With State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceIdentificationWithStateListImpl extends MinimalEObjectImpl.Container implements ServiceIdentificationWithStateList {
	/**
	 * The cached value of the '{@link #getServiceIdentificationWithState() <em>Service Identification With State</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceIdentificationWithState()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceIdentificationWithState> serviceIdentificationWithState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceIdentificationWithStateListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.Literals.SERVICE_IDENTIFICATION_WITH_STATE_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServiceIdentificationWithState> getServiceIdentificationWithState() {
		if (serviceIdentificationWithState == null) {
			serviceIdentificationWithState = new EObjectContainmentEList<ServiceIdentificationWithState>(ServiceIdentificationWithState.class, this, IbisCommonPackage.SERVICE_IDENTIFICATION_WITH_STATE_LIST__SERVICE_IDENTIFICATION_WITH_STATE);
		}
		return serviceIdentificationWithState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.SERVICE_IDENTIFICATION_WITH_STATE_LIST__SERVICE_IDENTIFICATION_WITH_STATE:
				return ((InternalEList<?>)getServiceIdentificationWithState()).basicRemove(otherEnd, msgs);
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
			case IbisCommonPackage.SERVICE_IDENTIFICATION_WITH_STATE_LIST__SERVICE_IDENTIFICATION_WITH_STATE:
				return getServiceIdentificationWithState();
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
			case IbisCommonPackage.SERVICE_IDENTIFICATION_WITH_STATE_LIST__SERVICE_IDENTIFICATION_WITH_STATE:
				getServiceIdentificationWithState().clear();
				getServiceIdentificationWithState().addAll((Collection<? extends ServiceIdentificationWithState>)newValue);
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
			case IbisCommonPackage.SERVICE_IDENTIFICATION_WITH_STATE_LIST__SERVICE_IDENTIFICATION_WITH_STATE:
				getServiceIdentificationWithState().clear();
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
			case IbisCommonPackage.SERVICE_IDENTIFICATION_WITH_STATE_LIST__SERVICE_IDENTIFICATION_WITH_STATE:
				return serviceIdentificationWithState != null && !serviceIdentificationWithState.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceIdentificationWithStateListImpl
