/**
 */
package org.w3.ns.rdf.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3.ns.dcat.Catalog1;
import org.w3.ns.dcat.CatalogRecordType;
import org.w3.ns.dcat.DataServiceType;
import org.w3.ns.dcat.DatasetType;

import org.w3.ns.rdf.CatalogRoot;
import org.w3.ns.rdf.RdfPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catalog Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3.ns.rdf.impl.CatalogRootImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3.ns.rdf.impl.CatalogRootImpl#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link org.w3.ns.rdf.impl.CatalogRootImpl#getCatalogRecord <em>Catalog Record</em>}</li>
 *   <li>{@link org.w3.ns.rdf.impl.CatalogRootImpl#getDataset <em>Dataset</em>}</li>
 *   <li>{@link org.w3.ns.rdf.impl.CatalogRootImpl#getDataService <em>Data Service</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CatalogRootImpl extends MinimalEObjectImpl.Container implements CatalogRoot {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatalogRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdfPackage.Literals.CATALOG_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, RdfPackage.CATALOG_ROOT__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Catalog1> getCatalog() {
		return getGroup().list(RdfPackage.Literals.CATALOG_ROOT__CATALOG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CatalogRecordType> getCatalogRecord() {
		return getGroup().list(RdfPackage.Literals.CATALOG_ROOT__CATALOG_RECORD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DatasetType> getDataset() {
		return getGroup().list(RdfPackage.Literals.CATALOG_ROOT__DATASET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataServiceType> getDataService() {
		return getGroup().list(RdfPackage.Literals.CATALOG_ROOT__DATA_SERVICE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdfPackage.CATALOG_ROOT__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case RdfPackage.CATALOG_ROOT__CATALOG:
				return ((InternalEList<?>)getCatalog()).basicRemove(otherEnd, msgs);
			case RdfPackage.CATALOG_ROOT__CATALOG_RECORD:
				return ((InternalEList<?>)getCatalogRecord()).basicRemove(otherEnd, msgs);
			case RdfPackage.CATALOG_ROOT__DATASET:
				return ((InternalEList<?>)getDataset()).basicRemove(otherEnd, msgs);
			case RdfPackage.CATALOG_ROOT__DATA_SERVICE:
				return ((InternalEList<?>)getDataService()).basicRemove(otherEnd, msgs);
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
			case RdfPackage.CATALOG_ROOT__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case RdfPackage.CATALOG_ROOT__CATALOG:
				return getCatalog();
			case RdfPackage.CATALOG_ROOT__CATALOG_RECORD:
				return getCatalogRecord();
			case RdfPackage.CATALOG_ROOT__DATASET:
				return getDataset();
			case RdfPackage.CATALOG_ROOT__DATA_SERVICE:
				return getDataService();
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
			case RdfPackage.CATALOG_ROOT__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case RdfPackage.CATALOG_ROOT__CATALOG:
				getCatalog().clear();
				getCatalog().addAll((Collection<? extends Catalog1>)newValue);
				return;
			case RdfPackage.CATALOG_ROOT__CATALOG_RECORD:
				getCatalogRecord().clear();
				getCatalogRecord().addAll((Collection<? extends CatalogRecordType>)newValue);
				return;
			case RdfPackage.CATALOG_ROOT__DATASET:
				getDataset().clear();
				getDataset().addAll((Collection<? extends DatasetType>)newValue);
				return;
			case RdfPackage.CATALOG_ROOT__DATA_SERVICE:
				getDataService().clear();
				getDataService().addAll((Collection<? extends DataServiceType>)newValue);
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
			case RdfPackage.CATALOG_ROOT__GROUP:
				getGroup().clear();
				return;
			case RdfPackage.CATALOG_ROOT__CATALOG:
				getCatalog().clear();
				return;
			case RdfPackage.CATALOG_ROOT__CATALOG_RECORD:
				getCatalogRecord().clear();
				return;
			case RdfPackage.CATALOG_ROOT__DATASET:
				getDataset().clear();
				return;
			case RdfPackage.CATALOG_ROOT__DATA_SERVICE:
				getDataService().clear();
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
			case RdfPackage.CATALOG_ROOT__GROUP:
				return group != null && !group.isEmpty();
			case RdfPackage.CATALOG_ROOT__CATALOG:
				return !getCatalog().isEmpty();
			case RdfPackage.CATALOG_ROOT__CATALOG_RECORD:
				return !getCatalogRecord().isEmpty();
			case RdfPackage.CATALOG_ROOT__DATASET:
				return !getDataset().isEmpty();
			case RdfPackage.CATALOG_ROOT__DATA_SERVICE:
				return !getDataService().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //CatalogRootImpl
