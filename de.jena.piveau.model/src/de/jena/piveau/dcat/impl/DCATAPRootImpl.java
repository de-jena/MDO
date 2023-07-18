/*
 */
package de.jena.piveau.dcat.impl;

import de.jena.piveau.dcat.Catalog;
import de.jena.piveau.dcat.CatalogRecord;
import de.jena.piveau.dcat.DCATAPRoot;
import de.jena.piveau.dcat.DataService;
import de.jena.piveau.dcat.Dataset;
import de.jena.piveau.dcat.DcatPackage;
import de.jena.piveau.dcat.Distribution;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DCATAP Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.piveau.dcat.impl.DCATAPRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.impl.DCATAPRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.impl.DCATAPRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.impl.DCATAPRootImpl#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.impl.DCATAPRootImpl#getCatalogRecord <em>Catalog Record</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.impl.DCATAPRootImpl#getDataService <em>Data Service</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.impl.DCATAPRootImpl#getDataset <em>Dataset</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.impl.DCATAPRootImpl#getDistribution <em>Distribution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DCATAPRootImpl extends MinimalEObjectImpl.Container implements DCATAPRoot {
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
	protected DCATAPRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DcatPackage.Literals.DCATAP_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, DcatPackage.DCATAP_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, DcatPackage.DCATAP_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, DcatPackage.DCATAP_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Catalog getCatalog() {
		return (Catalog)getMixed().get(DcatPackage.Literals.DCATAP_ROOT__CATALOG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCatalog(Catalog newCatalog, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DcatPackage.Literals.DCATAP_ROOT__CATALOG, newCatalog, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatalog(Catalog newCatalog) {
		((FeatureMap.Internal)getMixed()).set(DcatPackage.Literals.DCATAP_ROOT__CATALOG, newCatalog);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogRecord getCatalogRecord() {
		return (CatalogRecord)getMixed().get(DcatPackage.Literals.DCATAP_ROOT__CATALOG_RECORD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCatalogRecord(CatalogRecord newCatalogRecord, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DcatPackage.Literals.DCATAP_ROOT__CATALOG_RECORD, newCatalogRecord, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatalogRecord(CatalogRecord newCatalogRecord) {
		((FeatureMap.Internal)getMixed()).set(DcatPackage.Literals.DCATAP_ROOT__CATALOG_RECORD, newCatalogRecord);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataService getDataService() {
		return (DataService)getMixed().get(DcatPackage.Literals.DCATAP_ROOT__DATA_SERVICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataService(DataService newDataService, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DcatPackage.Literals.DCATAP_ROOT__DATA_SERVICE, newDataService, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataService(DataService newDataService) {
		((FeatureMap.Internal)getMixed()).set(DcatPackage.Literals.DCATAP_ROOT__DATA_SERVICE, newDataService);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dataset getDataset() {
		return (Dataset)getMixed().get(DcatPackage.Literals.DCATAP_ROOT__DATASET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataset(Dataset newDataset, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DcatPackage.Literals.DCATAP_ROOT__DATASET, newDataset, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataset(Dataset newDataset) {
		((FeatureMap.Internal)getMixed()).set(DcatPackage.Literals.DCATAP_ROOT__DATASET, newDataset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Distribution getDistribution() {
		return (Distribution)getMixed().get(DcatPackage.Literals.DCATAP_ROOT__DISTRIBUTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistribution(Distribution newDistribution, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DcatPackage.Literals.DCATAP_ROOT__DISTRIBUTION, newDistribution, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistribution(Distribution newDistribution) {
		((FeatureMap.Internal)getMixed()).set(DcatPackage.Literals.DCATAP_ROOT__DISTRIBUTION, newDistribution);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DcatPackage.DCATAP_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case DcatPackage.DCATAP_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case DcatPackage.DCATAP_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case DcatPackage.DCATAP_ROOT__CATALOG:
				return basicSetCatalog(null, msgs);
			case DcatPackage.DCATAP_ROOT__CATALOG_RECORD:
				return basicSetCatalogRecord(null, msgs);
			case DcatPackage.DCATAP_ROOT__DATA_SERVICE:
				return basicSetDataService(null, msgs);
			case DcatPackage.DCATAP_ROOT__DATASET:
				return basicSetDataset(null, msgs);
			case DcatPackage.DCATAP_ROOT__DISTRIBUTION:
				return basicSetDistribution(null, msgs);
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
			case DcatPackage.DCATAP_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case DcatPackage.DCATAP_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case DcatPackage.DCATAP_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case DcatPackage.DCATAP_ROOT__CATALOG:
				return getCatalog();
			case DcatPackage.DCATAP_ROOT__CATALOG_RECORD:
				return getCatalogRecord();
			case DcatPackage.DCATAP_ROOT__DATA_SERVICE:
				return getDataService();
			case DcatPackage.DCATAP_ROOT__DATASET:
				return getDataset();
			case DcatPackage.DCATAP_ROOT__DISTRIBUTION:
				return getDistribution();
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
			case DcatPackage.DCATAP_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case DcatPackage.DCATAP_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case DcatPackage.DCATAP_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case DcatPackage.DCATAP_ROOT__CATALOG:
				setCatalog((Catalog)newValue);
				return;
			case DcatPackage.DCATAP_ROOT__CATALOG_RECORD:
				setCatalogRecord((CatalogRecord)newValue);
				return;
			case DcatPackage.DCATAP_ROOT__DATA_SERVICE:
				setDataService((DataService)newValue);
				return;
			case DcatPackage.DCATAP_ROOT__DATASET:
				setDataset((Dataset)newValue);
				return;
			case DcatPackage.DCATAP_ROOT__DISTRIBUTION:
				setDistribution((Distribution)newValue);
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
			case DcatPackage.DCATAP_ROOT__MIXED:
				getMixed().clear();
				return;
			case DcatPackage.DCATAP_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case DcatPackage.DCATAP_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case DcatPackage.DCATAP_ROOT__CATALOG:
				setCatalog((Catalog)null);
				return;
			case DcatPackage.DCATAP_ROOT__CATALOG_RECORD:
				setCatalogRecord((CatalogRecord)null);
				return;
			case DcatPackage.DCATAP_ROOT__DATA_SERVICE:
				setDataService((DataService)null);
				return;
			case DcatPackage.DCATAP_ROOT__DATASET:
				setDataset((Dataset)null);
				return;
			case DcatPackage.DCATAP_ROOT__DISTRIBUTION:
				setDistribution((Distribution)null);
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
			case DcatPackage.DCATAP_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case DcatPackage.DCATAP_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case DcatPackage.DCATAP_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case DcatPackage.DCATAP_ROOT__CATALOG:
				return getCatalog() != null;
			case DcatPackage.DCATAP_ROOT__CATALOG_RECORD:
				return getCatalogRecord() != null;
			case DcatPackage.DCATAP_ROOT__DATA_SERVICE:
				return getDataService() != null;
			case DcatPackage.DCATAP_ROOT__DATASET:
				return getDataset() != null;
			case DcatPackage.DCATAP_ROOT__DISTRIBUTION:
				return getDistribution() != null;
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

} //DCATAPRootImpl
