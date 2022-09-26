/**
 */
package org.w3.ns.dcat.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3.ns.dcat.Catalog1;
import org.w3.ns.dcat.CatalogRecordType;
import org.w3.ns.dcat.DataServiceType;
import org.w3.ns.dcat.DatasetType;
import org.w3.ns.dcat.DcatPackage;
import org.w3.ns.dcat.DocumentRoot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3.ns.dcat.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.DocumentRootImpl#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.DocumentRootImpl#getCatalogRecord <em>Catalog Record</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.DocumentRootImpl#getDataService <em>Data Service</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.DocumentRootImpl#getDataset <em>Dataset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DcatPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, DcatPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>((EClass) eStaticClass().getEStructuralFeature(DcatPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP).getEType(), EStringToStringMapEntryImpl.class, this, DcatPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>((EClass) eStaticClass().getEStructuralFeature(DcatPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION).getEType(), EStringToStringMapEntryImpl.class, this, DcatPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Catalog1 getCatalog() {
		return (Catalog1)getMixed().get(DcatPackage.Literals.DOCUMENT_ROOT__CATALOG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCatalog(Catalog1 newCatalog, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DcatPackage.Literals.DOCUMENT_ROOT__CATALOG, newCatalog, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCatalog(Catalog1 newCatalog) {
		((FeatureMap.Internal)getMixed()).set(DcatPackage.Literals.DOCUMENT_ROOT__CATALOG, newCatalog);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CatalogRecordType getCatalogRecord() {
		return (CatalogRecordType)getMixed().get(DcatPackage.Literals.DOCUMENT_ROOT__CATALOG_RECORD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCatalogRecord(CatalogRecordType newCatalogRecord, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DcatPackage.Literals.DOCUMENT_ROOT__CATALOG_RECORD, newCatalogRecord, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCatalogRecord(CatalogRecordType newCatalogRecord) {
		((FeatureMap.Internal)getMixed()).set(DcatPackage.Literals.DOCUMENT_ROOT__CATALOG_RECORD, newCatalogRecord);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataServiceType getDataService() {
		return (DataServiceType)getMixed().get(DcatPackage.Literals.DOCUMENT_ROOT__DATA_SERVICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataService(DataServiceType newDataService, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DcatPackage.Literals.DOCUMENT_ROOT__DATA_SERVICE, newDataService, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataService(DataServiceType newDataService) {
		((FeatureMap.Internal)getMixed()).set(DcatPackage.Literals.DOCUMENT_ROOT__DATA_SERVICE, newDataService);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatasetType getDataset() {
		return (DatasetType)getMixed().get(DcatPackage.Literals.DOCUMENT_ROOT__DATASET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataset(DatasetType newDataset, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DcatPackage.Literals.DOCUMENT_ROOT__DATASET, newDataset, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataset(DatasetType newDataset) {
		((FeatureMap.Internal)getMixed()).set(DcatPackage.Literals.DOCUMENT_ROOT__DATASET, newDataset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DcatPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case DcatPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case DcatPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case DcatPackage.DOCUMENT_ROOT__CATALOG:
				return basicSetCatalog(null, msgs);
			case DcatPackage.DOCUMENT_ROOT__CATALOG_RECORD:
				return basicSetCatalogRecord(null, msgs);
			case DcatPackage.DOCUMENT_ROOT__DATA_SERVICE:
				return basicSetDataService(null, msgs);
			case DcatPackage.DOCUMENT_ROOT__DATASET:
				return basicSetDataset(null, msgs);
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
			case DcatPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case DcatPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case DcatPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case DcatPackage.DOCUMENT_ROOT__CATALOG:
				return getCatalog();
			case DcatPackage.DOCUMENT_ROOT__CATALOG_RECORD:
				return getCatalogRecord();
			case DcatPackage.DOCUMENT_ROOT__DATA_SERVICE:
				return getDataService();
			case DcatPackage.DOCUMENT_ROOT__DATASET:
				return getDataset();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DcatPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case DcatPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case DcatPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case DcatPackage.DOCUMENT_ROOT__CATALOG:
				setCatalog((Catalog1)newValue);
				return;
			case DcatPackage.DOCUMENT_ROOT__CATALOG_RECORD:
				setCatalogRecord((CatalogRecordType)newValue);
				return;
			case DcatPackage.DOCUMENT_ROOT__DATA_SERVICE:
				setDataService((DataServiceType)newValue);
				return;
			case DcatPackage.DOCUMENT_ROOT__DATASET:
				setDataset((DatasetType)newValue);
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
			case DcatPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case DcatPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case DcatPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case DcatPackage.DOCUMENT_ROOT__CATALOG:
				setCatalog((Catalog1)null);
				return;
			case DcatPackage.DOCUMENT_ROOT__CATALOG_RECORD:
				setCatalogRecord((CatalogRecordType)null);
				return;
			case DcatPackage.DOCUMENT_ROOT__DATA_SERVICE:
				setDataService((DataServiceType)null);
				return;
			case DcatPackage.DOCUMENT_ROOT__DATASET:
				setDataset((DatasetType)null);
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
			case DcatPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case DcatPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case DcatPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case DcatPackage.DOCUMENT_ROOT__CATALOG:
				return getCatalog() != null;
			case DcatPackage.DOCUMENT_ROOT__CATALOG_RECORD:
				return getCatalogRecord() != null;
			case DcatPackage.DOCUMENT_ROOT__DATA_SERVICE:
				return getDataService() != null;
			case DcatPackage.DOCUMENT_ROOT__DATASET:
				return getDataset() != null;
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
