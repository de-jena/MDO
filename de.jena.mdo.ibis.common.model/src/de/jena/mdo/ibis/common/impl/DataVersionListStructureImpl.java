/*
 */
package de.jena.mdo.ibis.common.impl;

import de.jena.mdo.ibis.common.DataVersionListStructure;
import de.jena.mdo.ibis.common.DataVersionStructure;
import de.jena.mdo.ibis.common.IbisCommonPackage;

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
 * An implementation of the model object '<em><b>Data Version List Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DataVersionListStructureImpl#getDataVersion <em>Data Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataVersionListStructureImpl extends MinimalEObjectImpl.Container implements DataVersionListStructure {
	/**
	 * The cached value of the '{@link #getDataVersion() <em>Data Version</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataVersion()
	 * @generated
	 * @ordered
	 */
	protected EList<DataVersionStructure> dataVersion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataVersionListStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.Literals.DATA_VERSION_LIST_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataVersionStructure> getDataVersion() {
		if (dataVersion == null) {
			dataVersion = new EObjectContainmentEList<DataVersionStructure>(DataVersionStructure.class, this, IbisCommonPackage.DATA_VERSION_LIST_STRUCTURE__DATA_VERSION);
		}
		return dataVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.DATA_VERSION_LIST_STRUCTURE__DATA_VERSION:
				return ((InternalEList<?>)getDataVersion()).basicRemove(otherEnd, msgs);
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
			case IbisCommonPackage.DATA_VERSION_LIST_STRUCTURE__DATA_VERSION:
				return getDataVersion();
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
			case IbisCommonPackage.DATA_VERSION_LIST_STRUCTURE__DATA_VERSION:
				getDataVersion().clear();
				getDataVersion().addAll((Collection<? extends DataVersionStructure>)newValue);
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
			case IbisCommonPackage.DATA_VERSION_LIST_STRUCTURE__DATA_VERSION:
				getDataVersion().clear();
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
			case IbisCommonPackage.DATA_VERSION_LIST_STRUCTURE__DATA_VERSION:
				return dataVersion != null && !dataVersion.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataVersionListStructureImpl
