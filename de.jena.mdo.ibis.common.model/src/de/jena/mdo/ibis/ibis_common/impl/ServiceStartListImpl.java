/*
 */
package de.jena.mdo.ibis.ibis_common.impl;

import de.jena.mdo.ibis.ibis_common.IbisCommonPackage;
import de.jena.mdo.ibis.ibis_common.ServiceIdentification;
import de.jena.mdo.ibis.ibis_common.ServiceStartList;

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
 * An implementation of the model object '<em><b>Service Start List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.ServiceStartListImpl#getServiceIdentification <em>Service Identification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceStartListImpl extends MinimalEObjectImpl.Container implements ServiceStartList {
	/**
	 * The cached value of the '{@link #getServiceIdentification() <em>Service Identification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceIdentification()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceIdentification> serviceIdentification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceStartListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.Literals.SERVICE_START_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServiceIdentification> getServiceIdentification() {
		if (serviceIdentification == null) {
			serviceIdentification = new EObjectContainmentEList<ServiceIdentification>(ServiceIdentification.class, this, IbisCommonPackage.SERVICE_START_LIST__SERVICE_IDENTIFICATION);
		}
		return serviceIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.SERVICE_START_LIST__SERVICE_IDENTIFICATION:
				return ((InternalEList<?>)getServiceIdentification()).basicRemove(otherEnd, msgs);
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
			case IbisCommonPackage.SERVICE_START_LIST__SERVICE_IDENTIFICATION:
				return getServiceIdentification();
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
			case IbisCommonPackage.SERVICE_START_LIST__SERVICE_IDENTIFICATION:
				getServiceIdentification().clear();
				getServiceIdentification().addAll((Collection<? extends ServiceIdentification>)newValue);
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
			case IbisCommonPackage.SERVICE_START_LIST__SERVICE_IDENTIFICATION:
				getServiceIdentification().clear();
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
			case IbisCommonPackage.SERVICE_START_LIST__SERVICE_IDENTIFICATION:
				return serviceIdentification != null && !serviceIdentification.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceStartListImpl
