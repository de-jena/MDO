/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine100_100.impl;

import org.eclipse.daanse.xmla.model.ecore.engine100_100.DocumentRoot;
import org.eclipse.daanse.xmla.model.ecore.engine100_100.Engine100_100Package;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine100_100.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine100_100.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine100_100.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine100_100.impl.DocumentRootImpl#getDbStorageLocation <em>Db Storage Location</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine100_100.impl.DocumentRootImpl#getHoldoutActualSize <em>Holdout Actual Size</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine100_100.impl.DocumentRootImpl#getHoldoutMaxCases <em>Holdout Max Cases</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine100_100.impl.DocumentRootImpl#getHoldoutMaxPercent <em>Holdout Max Percent</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine100_100.impl.DocumentRootImpl#getHoldoutSeed <em>Holdout Seed</em>}</li>
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
	 * The default value of the '{@link #getDbStorageLocation() <em>Db Storage Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbStorageLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String DB_STORAGE_LOCATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getHoldoutActualSize() <em>Holdout Actual Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoldoutActualSize()
	 * @generated
	 * @ordered
	 */
	protected static final int HOLDOUT_ACTUAL_SIZE_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getHoldoutMaxCases() <em>Holdout Max Cases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoldoutMaxCases()
	 * @generated
	 * @ordered
	 */
	protected static final int HOLDOUT_MAX_CASES_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getHoldoutMaxPercent() <em>Holdout Max Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoldoutMaxPercent()
	 * @generated
	 * @ordered
	 */
	protected static final int HOLDOUT_MAX_PERCENT_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getHoldoutSeed() <em>Holdout Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoldoutSeed()
	 * @generated
	 * @ordered
	 */
	protected static final int HOLDOUT_SEED_EDEFAULT = 0;

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
		return Engine100_100Package.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Engine100_100Package.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>((EClass) eStaticClass().getEStructuralFeature(Engine100_100Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP).getEType(), EStringToStringMapEntryImpl.class, this, Engine100_100Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>((EClass) eStaticClass().getEStructuralFeature(Engine100_100Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION).getEType(), EStringToStringMapEntryImpl.class, this, Engine100_100Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDbStorageLocation() {
		return (String)getMixed().get(Engine100_100Package.Literals.DOCUMENT_ROOT__DB_STORAGE_LOCATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbStorageLocation(String newDbStorageLocation) {
		((FeatureMap.Internal)getMixed()).set(Engine100_100Package.Literals.DOCUMENT_ROOT__DB_STORAGE_LOCATION, newDbStorageLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHoldoutActualSize() {
		return (Integer)getMixed().get(Engine100_100Package.Literals.DOCUMENT_ROOT__HOLDOUT_ACTUAL_SIZE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHoldoutActualSize(int newHoldoutActualSize) {
		((FeatureMap.Internal)getMixed()).set(Engine100_100Package.Literals.DOCUMENT_ROOT__HOLDOUT_ACTUAL_SIZE, newHoldoutActualSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHoldoutMaxCases() {
		return (Integer)getMixed().get(Engine100_100Package.Literals.DOCUMENT_ROOT__HOLDOUT_MAX_CASES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHoldoutMaxCases(int newHoldoutMaxCases) {
		((FeatureMap.Internal)getMixed()).set(Engine100_100Package.Literals.DOCUMENT_ROOT__HOLDOUT_MAX_CASES, newHoldoutMaxCases);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHoldoutMaxPercent() {
		return (Integer)getMixed().get(Engine100_100Package.Literals.DOCUMENT_ROOT__HOLDOUT_MAX_PERCENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHoldoutMaxPercent(int newHoldoutMaxPercent) {
		((FeatureMap.Internal)getMixed()).set(Engine100_100Package.Literals.DOCUMENT_ROOT__HOLDOUT_MAX_PERCENT, newHoldoutMaxPercent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHoldoutSeed() {
		return (Integer)getMixed().get(Engine100_100Package.Literals.DOCUMENT_ROOT__HOLDOUT_SEED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHoldoutSeed(int newHoldoutSeed) {
		((FeatureMap.Internal)getMixed()).set(Engine100_100Package.Literals.DOCUMENT_ROOT__HOLDOUT_SEED, newHoldoutSeed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Engine100_100Package.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Engine100_100Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case Engine100_100Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
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
			case Engine100_100Package.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Engine100_100Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case Engine100_100Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case Engine100_100Package.DOCUMENT_ROOT__DB_STORAGE_LOCATION:
				return getDbStorageLocation();
			case Engine100_100Package.DOCUMENT_ROOT__HOLDOUT_ACTUAL_SIZE:
				return getHoldoutActualSize();
			case Engine100_100Package.DOCUMENT_ROOT__HOLDOUT_MAX_CASES:
				return getHoldoutMaxCases();
			case Engine100_100Package.DOCUMENT_ROOT__HOLDOUT_MAX_PERCENT:
				return getHoldoutMaxPercent();
			case Engine100_100Package.DOCUMENT_ROOT__HOLDOUT_SEED:
				return getHoldoutSeed();
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
			case Engine100_100Package.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Engine100_100Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case Engine100_100Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case Engine100_100Package.DOCUMENT_ROOT__DB_STORAGE_LOCATION:
				setDbStorageLocation((String)newValue);
				return;
			case Engine100_100Package.DOCUMENT_ROOT__HOLDOUT_ACTUAL_SIZE:
				setHoldoutActualSize((Integer)newValue);
				return;
			case Engine100_100Package.DOCUMENT_ROOT__HOLDOUT_MAX_CASES:
				setHoldoutMaxCases((Integer)newValue);
				return;
			case Engine100_100Package.DOCUMENT_ROOT__HOLDOUT_MAX_PERCENT:
				setHoldoutMaxPercent((Integer)newValue);
				return;
			case Engine100_100Package.DOCUMENT_ROOT__HOLDOUT_SEED:
				setHoldoutSeed((Integer)newValue);
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
			case Engine100_100Package.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case Engine100_100Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case Engine100_100Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case Engine100_100Package.DOCUMENT_ROOT__DB_STORAGE_LOCATION:
				setDbStorageLocation(DB_STORAGE_LOCATION_EDEFAULT);
				return;
			case Engine100_100Package.DOCUMENT_ROOT__HOLDOUT_ACTUAL_SIZE:
				setHoldoutActualSize(HOLDOUT_ACTUAL_SIZE_EDEFAULT);
				return;
			case Engine100_100Package.DOCUMENT_ROOT__HOLDOUT_MAX_CASES:
				setHoldoutMaxCases(HOLDOUT_MAX_CASES_EDEFAULT);
				return;
			case Engine100_100Package.DOCUMENT_ROOT__HOLDOUT_MAX_PERCENT:
				setHoldoutMaxPercent(HOLDOUT_MAX_PERCENT_EDEFAULT);
				return;
			case Engine100_100Package.DOCUMENT_ROOT__HOLDOUT_SEED:
				setHoldoutSeed(HOLDOUT_SEED_EDEFAULT);
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
			case Engine100_100Package.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Engine100_100Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case Engine100_100Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case Engine100_100Package.DOCUMENT_ROOT__DB_STORAGE_LOCATION:
				return DB_STORAGE_LOCATION_EDEFAULT == null ? getDbStorageLocation() != null : !DB_STORAGE_LOCATION_EDEFAULT.equals(getDbStorageLocation());
			case Engine100_100Package.DOCUMENT_ROOT__HOLDOUT_ACTUAL_SIZE:
				return getHoldoutActualSize() != HOLDOUT_ACTUAL_SIZE_EDEFAULT;
			case Engine100_100Package.DOCUMENT_ROOT__HOLDOUT_MAX_CASES:
				return getHoldoutMaxCases() != HOLDOUT_MAX_CASES_EDEFAULT;
			case Engine100_100Package.DOCUMENT_ROOT__HOLDOUT_MAX_PERCENT:
				return getHoldoutMaxPercent() != HOLDOUT_MAX_PERCENT_EDEFAULT;
			case Engine100_100Package.DOCUMENT_ROOT__HOLDOUT_SEED:
				return getHoldoutSeed() != HOLDOUT_SEED_EDEFAULT;
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
