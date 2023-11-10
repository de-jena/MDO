/*
 */
package dcatde.impl;

import dcatde.DCATDERoot;
import dcatde.DcatDEPackage;

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

import rdf.PlainLiteral;
import rdf.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DCATDE Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dcatde.impl.DCATDERootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link dcatde.impl.DCATDERootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link dcatde.impl.DCATDERootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link dcatde.impl.DCATDERootImpl#getLicenseAttributionByText <em>License Attribution By Text</em>}</li>
 *   <li>{@link dcatde.impl.DCATDERootImpl#getContributorID <em>Contributor ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DCATDERootImpl extends MinimalEObjectImpl.Container implements DCATDERoot {
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
	protected DCATDERootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DcatDEPackage.Literals.DCATDE_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, DcatDEPackage.DCATDE_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, DcatDEPackage.DCATDE_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, DcatDEPackage.DCATDE_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainLiteral getLicenseAttributionByText() {
		return (PlainLiteral)getMixed().get(DcatDEPackage.Literals.DCATDE_ROOT__LICENSE_ATTRIBUTION_BY_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLicenseAttributionByText(PlainLiteral newLicenseAttributionByText, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DcatDEPackage.Literals.DCATDE_ROOT__LICENSE_ATTRIBUTION_BY_TEXT, newLicenseAttributionByText, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLicenseAttributionByText(PlainLiteral newLicenseAttributionByText) {
		((FeatureMap.Internal)getMixed()).set(DcatDEPackage.Literals.DCATDE_ROOT__LICENSE_ATTRIBUTION_BY_TEXT, newLicenseAttributionByText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getContributorID() {
		return (Resource)getMixed().get(DcatDEPackage.Literals.DCATDE_ROOT__CONTRIBUTOR_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContributorID(Resource newContributorID, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DcatDEPackage.Literals.DCATDE_ROOT__CONTRIBUTOR_ID, newContributorID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContributorID(Resource newContributorID) {
		((FeatureMap.Internal)getMixed()).set(DcatDEPackage.Literals.DCATDE_ROOT__CONTRIBUTOR_ID, newContributorID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DcatDEPackage.DCATDE_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case DcatDEPackage.DCATDE_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case DcatDEPackage.DCATDE_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case DcatDEPackage.DCATDE_ROOT__LICENSE_ATTRIBUTION_BY_TEXT:
				return basicSetLicenseAttributionByText(null, msgs);
			case DcatDEPackage.DCATDE_ROOT__CONTRIBUTOR_ID:
				return basicSetContributorID(null, msgs);
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
			case DcatDEPackage.DCATDE_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case DcatDEPackage.DCATDE_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case DcatDEPackage.DCATDE_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case DcatDEPackage.DCATDE_ROOT__LICENSE_ATTRIBUTION_BY_TEXT:
				return getLicenseAttributionByText();
			case DcatDEPackage.DCATDE_ROOT__CONTRIBUTOR_ID:
				return getContributorID();
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
			case DcatDEPackage.DCATDE_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case DcatDEPackage.DCATDE_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case DcatDEPackage.DCATDE_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case DcatDEPackage.DCATDE_ROOT__LICENSE_ATTRIBUTION_BY_TEXT:
				setLicenseAttributionByText((PlainLiteral)newValue);
				return;
			case DcatDEPackage.DCATDE_ROOT__CONTRIBUTOR_ID:
				setContributorID((Resource)newValue);
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
			case DcatDEPackage.DCATDE_ROOT__MIXED:
				getMixed().clear();
				return;
			case DcatDEPackage.DCATDE_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case DcatDEPackage.DCATDE_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case DcatDEPackage.DCATDE_ROOT__LICENSE_ATTRIBUTION_BY_TEXT:
				setLicenseAttributionByText((PlainLiteral)null);
				return;
			case DcatDEPackage.DCATDE_ROOT__CONTRIBUTOR_ID:
				setContributorID((Resource)null);
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
			case DcatDEPackage.DCATDE_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case DcatDEPackage.DCATDE_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case DcatDEPackage.DCATDE_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case DcatDEPackage.DCATDE_ROOT__LICENSE_ATTRIBUTION_BY_TEXT:
				return getLicenseAttributionByText() != null;
			case DcatDEPackage.DCATDE_ROOT__CONTRIBUTOR_ID:
				return getContributorID() != null;
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

} //DCATDERootImpl
