/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine200.impl;

import java.math.BigInteger;

import org.eclipse.daanse.xmla.model.ecore.engine200.CalculationErrorType;
import org.eclipse.daanse.xmla.model.ecore.engine200.DocumentRoot;
import org.eclipse.daanse.xmla.model.ecore.engine200.Engine200Package;
import org.eclipse.daanse.xmla.model.ecore.engine200.WarningColumnType;
import org.eclipse.daanse.xmla.model.ecore.engine200.WarningMeasureType;

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
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200.impl.DocumentRootImpl#getCalculationError <em>Calculation Error</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200.impl.DocumentRootImpl#getCompatibilityLevel <em>Compatibility Level</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200.impl.DocumentRootImpl#getWarningColumn <em>Warning Column</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200.impl.DocumentRootImpl#getWarningMeasure <em>Warning Measure</em>}</li>
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
	 * The default value of the '{@link #getCalculationError() <em>Calculation Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculationError()
	 * @generated
	 * @ordered
	 */
	protected static final CalculationErrorType CALCULATION_ERROR_EDEFAULT = CalculationErrorType.IGNORE_ERROR;

	/**
	 * The default value of the '{@link #getCompatibilityLevel() <em>Compatibility Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompatibilityLevel()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger COMPATIBILITY_LEVEL_EDEFAULT = null;

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
		return Engine200Package.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Engine200Package.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>((EClass) eStaticClass().getEStructuralFeature(Engine200Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP).getEType(), EStringToStringMapEntryImpl.class, this, Engine200Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>((EClass) eStaticClass().getEStructuralFeature(Engine200Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION).getEType(), EStringToStringMapEntryImpl.class, this, Engine200Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculationErrorType getCalculationError() {
		return (CalculationErrorType)getMixed().get(Engine200Package.Literals.DOCUMENT_ROOT__CALCULATION_ERROR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalculationError(CalculationErrorType newCalculationError) {
		((FeatureMap.Internal)getMixed()).set(Engine200Package.Literals.DOCUMENT_ROOT__CALCULATION_ERROR, newCalculationError);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCompatibilityLevel() {
		return (BigInteger)getMixed().get(Engine200Package.Literals.DOCUMENT_ROOT__COMPATIBILITY_LEVEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompatibilityLevel(BigInteger newCompatibilityLevel) {
		((FeatureMap.Internal)getMixed()).set(Engine200Package.Literals.DOCUMENT_ROOT__COMPATIBILITY_LEVEL, newCompatibilityLevel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WarningColumnType getWarningColumn() {
		return (WarningColumnType)getMixed().get(Engine200Package.Literals.DOCUMENT_ROOT__WARNING_COLUMN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWarningColumn(WarningColumnType newWarningColumn, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Engine200Package.Literals.DOCUMENT_ROOT__WARNING_COLUMN, newWarningColumn, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWarningColumn(WarningColumnType newWarningColumn) {
		((FeatureMap.Internal)getMixed()).set(Engine200Package.Literals.DOCUMENT_ROOT__WARNING_COLUMN, newWarningColumn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WarningMeasureType getWarningMeasure() {
		return (WarningMeasureType)getMixed().get(Engine200Package.Literals.DOCUMENT_ROOT__WARNING_MEASURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWarningMeasure(WarningMeasureType newWarningMeasure, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Engine200Package.Literals.DOCUMENT_ROOT__WARNING_MEASURE, newWarningMeasure, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWarningMeasure(WarningMeasureType newWarningMeasure) {
		((FeatureMap.Internal)getMixed()).set(Engine200Package.Literals.DOCUMENT_ROOT__WARNING_MEASURE, newWarningMeasure);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Engine200Package.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Engine200Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case Engine200Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case Engine200Package.DOCUMENT_ROOT__WARNING_COLUMN:
				return basicSetWarningColumn(null, msgs);
			case Engine200Package.DOCUMENT_ROOT__WARNING_MEASURE:
				return basicSetWarningMeasure(null, msgs);
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
			case Engine200Package.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Engine200Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case Engine200Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case Engine200Package.DOCUMENT_ROOT__CALCULATION_ERROR:
				return getCalculationError();
			case Engine200Package.DOCUMENT_ROOT__COMPATIBILITY_LEVEL:
				return getCompatibilityLevel();
			case Engine200Package.DOCUMENT_ROOT__WARNING_COLUMN:
				return getWarningColumn();
			case Engine200Package.DOCUMENT_ROOT__WARNING_MEASURE:
				return getWarningMeasure();
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
			case Engine200Package.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Engine200Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case Engine200Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case Engine200Package.DOCUMENT_ROOT__CALCULATION_ERROR:
				setCalculationError((CalculationErrorType)newValue);
				return;
			case Engine200Package.DOCUMENT_ROOT__COMPATIBILITY_LEVEL:
				setCompatibilityLevel((BigInteger)newValue);
				return;
			case Engine200Package.DOCUMENT_ROOT__WARNING_COLUMN:
				setWarningColumn((WarningColumnType)newValue);
				return;
			case Engine200Package.DOCUMENT_ROOT__WARNING_MEASURE:
				setWarningMeasure((WarningMeasureType)newValue);
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
			case Engine200Package.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case Engine200Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case Engine200Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case Engine200Package.DOCUMENT_ROOT__CALCULATION_ERROR:
				setCalculationError(CALCULATION_ERROR_EDEFAULT);
				return;
			case Engine200Package.DOCUMENT_ROOT__COMPATIBILITY_LEVEL:
				setCompatibilityLevel(COMPATIBILITY_LEVEL_EDEFAULT);
				return;
			case Engine200Package.DOCUMENT_ROOT__WARNING_COLUMN:
				setWarningColumn((WarningColumnType)null);
				return;
			case Engine200Package.DOCUMENT_ROOT__WARNING_MEASURE:
				setWarningMeasure((WarningMeasureType)null);
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
			case Engine200Package.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Engine200Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case Engine200Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case Engine200Package.DOCUMENT_ROOT__CALCULATION_ERROR:
				return getCalculationError() != CALCULATION_ERROR_EDEFAULT;
			case Engine200Package.DOCUMENT_ROOT__COMPATIBILITY_LEVEL:
				return COMPATIBILITY_LEVEL_EDEFAULT == null ? getCompatibilityLevel() != null : !COMPATIBILITY_LEVEL_EDEFAULT.equals(getCompatibilityLevel());
			case Engine200Package.DOCUMENT_ROOT__WARNING_COLUMN:
				return getWarningColumn() != null;
			case Engine200Package.DOCUMENT_ROOT__WARNING_MEASURE:
				return getWarningMeasure() != null;
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
