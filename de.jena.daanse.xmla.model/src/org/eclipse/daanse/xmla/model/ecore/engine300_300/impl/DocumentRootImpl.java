/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine300_300.impl;

import org.eclipse.daanse.xmla.model.ecore.engine300_300.DirectQueryModeType;
import org.eclipse.daanse.xmla.model.ecore.engine300_300.DirectQueryUsageType;
import org.eclipse.daanse.xmla.model.ecore.engine300_300.DocumentRoot;
import org.eclipse.daanse.xmla.model.ecore.engine300_300.Engine300_300Package;
import org.eclipse.daanse.xmla.model.ecore.engine300_300.XEventType;

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
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.DocumentRootImpl#getAllowedRowsExpression <em>Allowed Rows Expression</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.DocumentRootImpl#getDirectQueryMode <em>Direct Query Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.DocumentRootImpl#getDirectQueryUsage <em>Direct Query Usage</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.DocumentRootImpl#getXEvent <em>XEvent</em>}</li>
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
	 * The default value of the '{@link #getAllowedRowsExpression() <em>Allowed Rows Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedRowsExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOWED_ROWS_EXPRESSION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDirectQueryMode() <em>Direct Query Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectQueryMode()
	 * @generated
	 * @ordered
	 */
	protected static final DirectQueryModeType DIRECT_QUERY_MODE_EDEFAULT = DirectQueryModeType.IN_MEMORY;

	/**
	 * The default value of the '{@link #getDirectQueryUsage() <em>Direct Query Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectQueryUsage()
	 * @generated
	 * @ordered
	 */
	protected static final DirectQueryUsageType DIRECT_QUERY_USAGE_EDEFAULT = DirectQueryUsageType.IN_MEMORY_WITH_DIRECT_QUERY;

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
		return Engine300_300Package.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Engine300_300Package.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>((EClass) eStaticClass().getEStructuralFeature(Engine300_300Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP).getEType(), EStringToStringMapEntryImpl.class, this, Engine300_300Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>((EClass) eStaticClass().getEStructuralFeature(Engine300_300Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION).getEType(), EStringToStringMapEntryImpl.class, this, Engine300_300Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAllowedRowsExpression() {
		return (String)getMixed().get(Engine300_300Package.Literals.DOCUMENT_ROOT__ALLOWED_ROWS_EXPRESSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowedRowsExpression(String newAllowedRowsExpression) {
		((FeatureMap.Internal)getMixed()).set(Engine300_300Package.Literals.DOCUMENT_ROOT__ALLOWED_ROWS_EXPRESSION, newAllowedRowsExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectQueryModeType getDirectQueryMode() {
		return (DirectQueryModeType)getMixed().get(Engine300_300Package.Literals.DOCUMENT_ROOT__DIRECT_QUERY_MODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectQueryMode(DirectQueryModeType newDirectQueryMode) {
		((FeatureMap.Internal)getMixed()).set(Engine300_300Package.Literals.DOCUMENT_ROOT__DIRECT_QUERY_MODE, newDirectQueryMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectQueryUsageType getDirectQueryUsage() {
		return (DirectQueryUsageType)getMixed().get(Engine300_300Package.Literals.DOCUMENT_ROOT__DIRECT_QUERY_USAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectQueryUsage(DirectQueryUsageType newDirectQueryUsage) {
		((FeatureMap.Internal)getMixed()).set(Engine300_300Package.Literals.DOCUMENT_ROOT__DIRECT_QUERY_USAGE, newDirectQueryUsage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XEventType getXEvent() {
		return (XEventType)getMixed().get(Engine300_300Package.Literals.DOCUMENT_ROOT__XEVENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXEvent(XEventType newXEvent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Engine300_300Package.Literals.DOCUMENT_ROOT__XEVENT, newXEvent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXEvent(XEventType newXEvent) {
		((FeatureMap.Internal)getMixed()).set(Engine300_300Package.Literals.DOCUMENT_ROOT__XEVENT, newXEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Engine300_300Package.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Engine300_300Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case Engine300_300Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case Engine300_300Package.DOCUMENT_ROOT__XEVENT:
				return basicSetXEvent(null, msgs);
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
			case Engine300_300Package.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Engine300_300Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case Engine300_300Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case Engine300_300Package.DOCUMENT_ROOT__ALLOWED_ROWS_EXPRESSION:
				return getAllowedRowsExpression();
			case Engine300_300Package.DOCUMENT_ROOT__DIRECT_QUERY_MODE:
				return getDirectQueryMode();
			case Engine300_300Package.DOCUMENT_ROOT__DIRECT_QUERY_USAGE:
				return getDirectQueryUsage();
			case Engine300_300Package.DOCUMENT_ROOT__XEVENT:
				return getXEvent();
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
			case Engine300_300Package.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Engine300_300Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case Engine300_300Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case Engine300_300Package.DOCUMENT_ROOT__ALLOWED_ROWS_EXPRESSION:
				setAllowedRowsExpression((String)newValue);
				return;
			case Engine300_300Package.DOCUMENT_ROOT__DIRECT_QUERY_MODE:
				setDirectQueryMode((DirectQueryModeType)newValue);
				return;
			case Engine300_300Package.DOCUMENT_ROOT__DIRECT_QUERY_USAGE:
				setDirectQueryUsage((DirectQueryUsageType)newValue);
				return;
			case Engine300_300Package.DOCUMENT_ROOT__XEVENT:
				setXEvent((XEventType)newValue);
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
			case Engine300_300Package.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case Engine300_300Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case Engine300_300Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case Engine300_300Package.DOCUMENT_ROOT__ALLOWED_ROWS_EXPRESSION:
				setAllowedRowsExpression(ALLOWED_ROWS_EXPRESSION_EDEFAULT);
				return;
			case Engine300_300Package.DOCUMENT_ROOT__DIRECT_QUERY_MODE:
				setDirectQueryMode(DIRECT_QUERY_MODE_EDEFAULT);
				return;
			case Engine300_300Package.DOCUMENT_ROOT__DIRECT_QUERY_USAGE:
				setDirectQueryUsage(DIRECT_QUERY_USAGE_EDEFAULT);
				return;
			case Engine300_300Package.DOCUMENT_ROOT__XEVENT:
				setXEvent((XEventType)null);
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
			case Engine300_300Package.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Engine300_300Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case Engine300_300Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case Engine300_300Package.DOCUMENT_ROOT__ALLOWED_ROWS_EXPRESSION:
				return ALLOWED_ROWS_EXPRESSION_EDEFAULT == null ? getAllowedRowsExpression() != null : !ALLOWED_ROWS_EXPRESSION_EDEFAULT.equals(getAllowedRowsExpression());
			case Engine300_300Package.DOCUMENT_ROOT__DIRECT_QUERY_MODE:
				return getDirectQueryMode() != DIRECT_QUERY_MODE_EDEFAULT;
			case Engine300_300Package.DOCUMENT_ROOT__DIRECT_QUERY_USAGE:
				return getDirectQueryUsage() != DIRECT_QUERY_USAGE_EDEFAULT;
			case Engine300_300Package.DOCUMENT_ROOT__XEVENT:
				return getXEvent() != null;
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
