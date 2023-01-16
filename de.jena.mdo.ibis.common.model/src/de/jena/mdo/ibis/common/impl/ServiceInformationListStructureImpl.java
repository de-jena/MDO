/*
 */
package de.jena.mdo.ibis.common.impl;

import de.jena.mdo.ibis.common.IbisCommonPackage;
import de.jena.mdo.ibis.common.ServiceInformationListStructure;
import de.jena.mdo.ibis.common.ServiceInformationStructure;

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
 * An implementation of the model object '<em><b>Service Information List Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.impl.ServiceInformationListStructureImpl#getServiceInformation <em>Service Information</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceInformationListStructureImpl extends MinimalEObjectImpl.Container implements ServiceInformationListStructure {
	/**
	 * The cached value of the '{@link #getServiceInformation() <em>Service Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceInformationStructure> serviceInformation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceInformationListStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.eINSTANCE.getServiceInformationListStructure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServiceInformationStructure> getServiceInformation() {
		if (serviceInformation == null) {
			serviceInformation = new EObjectContainmentEList<ServiceInformationStructure>(ServiceInformationStructure.class, this, IbisCommonPackage.SERVICE_INFORMATION_LIST_STRUCTURE__SERVICE_INFORMATION);
		}
		return serviceInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.SERVICE_INFORMATION_LIST_STRUCTURE__SERVICE_INFORMATION:
				return ((InternalEList<?>)getServiceInformation()).basicRemove(otherEnd, msgs);
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
			case IbisCommonPackage.SERVICE_INFORMATION_LIST_STRUCTURE__SERVICE_INFORMATION:
				return getServiceInformation();
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
			case IbisCommonPackage.SERVICE_INFORMATION_LIST_STRUCTURE__SERVICE_INFORMATION:
				getServiceInformation().clear();
				getServiceInformation().addAll((Collection<? extends ServiceInformationStructure>)newValue);
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
			case IbisCommonPackage.SERVICE_INFORMATION_LIST_STRUCTURE__SERVICE_INFORMATION:
				getServiceInformation().clear();
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
			case IbisCommonPackage.SERVICE_INFORMATION_LIST_STRUCTURE__SERVICE_INFORMATION:
				return serviceInformation != null && !serviceInformation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceInformationListStructureImpl
