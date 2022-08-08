/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine300.impl;

import org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationInfo;

import org.eclipse.daanse.xmla.model.ecore.engine300.CurrentStringStoresCompatibilityLevelType;
import org.eclipse.daanse.xmla.model.ecore.engine300.DataEmbeddingStyleType;
import org.eclipse.daanse.xmla.model.ecore.engine300.DocumentRoot;
import org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package;
import org.eclipse.daanse.xmla.model.ecore.engine300.ProcessingStateType;
import org.eclipse.daanse.xmla.model.ecore.engine300.ServerModeType;
import org.eclipse.daanse.xmla.model.ecore.engine300.StringStoresCompatibilityLevelType;
import org.eclipse.daanse.xmla.model.ecore.engine300.StructureTypeType;

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
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.DocumentRootImpl#getCurrentStringStoresCompatibilityLevel <em>Current String Stores Compatibility Level</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.DocumentRootImpl#getDataEmbeddingStyle <em>Data Embedding Style</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.DocumentRootImpl#getProcessingState <em>Processing State</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.DocumentRootImpl#getQueryHints <em>Query Hints</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.DocumentRootImpl#getQueryImpersonationInfo <em>Query Impersonation Info</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.DocumentRootImpl#getServerMode <em>Server Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.DocumentRootImpl#getStringStoresCompatibilityLevel <em>String Stores Compatibility Level</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.DocumentRootImpl#getStructureType <em>Structure Type</em>}</li>
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
	 * The default value of the '{@link #getCurrentStringStoresCompatibilityLevel() <em>Current String Stores Compatibility Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentStringStoresCompatibilityLevel()
	 * @generated
	 * @ordered
	 */
	protected static final CurrentStringStoresCompatibilityLevelType CURRENT_STRING_STORES_COMPATIBILITY_LEVEL_EDEFAULT = CurrentStringStoresCompatibilityLevelType._1050;

	/**
	 * The default value of the '{@link #getDataEmbeddingStyle() <em>Data Embedding Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataEmbeddingStyle()
	 * @generated
	 * @ordered
	 */
	protected static final DataEmbeddingStyleType DATA_EMBEDDING_STYLE_EDEFAULT = DataEmbeddingStyleType.EMBEDDED;

	/**
	 * The default value of the '{@link #getProcessingState() <em>Processing State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingState()
	 * @generated
	 * @ordered
	 */
	protected static final ProcessingStateType PROCESSING_STATE_EDEFAULT = ProcessingStateType.PROCESSED;

	/**
	 * The default value of the '{@link #getQueryHints() <em>Query Hints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryHints()
	 * @generated
	 * @ordered
	 */
	protected static final String QUERY_HINTS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getServerMode() <em>Server Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerMode()
	 * @generated
	 * @ordered
	 */
	protected static final ServerModeType SERVER_MODE_EDEFAULT = ServerModeType.MULTIDIMENSIONAL;

	/**
	 * The default value of the '{@link #getStringStoresCompatibilityLevel() <em>String Stores Compatibility Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringStoresCompatibilityLevel()
	 * @generated
	 * @ordered
	 */
	protected static final StringStoresCompatibilityLevelType STRING_STORES_COMPATIBILITY_LEVEL_EDEFAULT = StringStoresCompatibilityLevelType._1050;

	/**
	 * The default value of the '{@link #getStructureType() <em>Structure Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureType()
	 * @generated
	 * @ordered
	 */
	protected static final StructureTypeType STRUCTURE_TYPE_EDEFAULT = StructureTypeType.NATURAL;

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
		return Engine300Package.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Engine300Package.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>((EClass) eStaticClass().getEStructuralFeature(Engine300Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP).getEType(), EStringToStringMapEntryImpl.class, this, Engine300Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>((EClass) eStaticClass().getEStructuralFeature(Engine300Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION).getEType(), EStringToStringMapEntryImpl.class, this, Engine300Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentStringStoresCompatibilityLevelType getCurrentStringStoresCompatibilityLevel() {
		return (CurrentStringStoresCompatibilityLevelType)getMixed().get(Engine300Package.Literals.DOCUMENT_ROOT__CURRENT_STRING_STORES_COMPATIBILITY_LEVEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentStringStoresCompatibilityLevel(CurrentStringStoresCompatibilityLevelType newCurrentStringStoresCompatibilityLevel) {
		((FeatureMap.Internal)getMixed()).set(Engine300Package.Literals.DOCUMENT_ROOT__CURRENT_STRING_STORES_COMPATIBILITY_LEVEL, newCurrentStringStoresCompatibilityLevel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataEmbeddingStyleType getDataEmbeddingStyle() {
		return (DataEmbeddingStyleType)getMixed().get(Engine300Package.Literals.DOCUMENT_ROOT__DATA_EMBEDDING_STYLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataEmbeddingStyle(DataEmbeddingStyleType newDataEmbeddingStyle) {
		((FeatureMap.Internal)getMixed()).set(Engine300Package.Literals.DOCUMENT_ROOT__DATA_EMBEDDING_STYLE, newDataEmbeddingStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingStateType getProcessingState() {
		return (ProcessingStateType)getMixed().get(Engine300Package.Literals.DOCUMENT_ROOT__PROCESSING_STATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingState(ProcessingStateType newProcessingState) {
		((FeatureMap.Internal)getMixed()).set(Engine300Package.Literals.DOCUMENT_ROOT__PROCESSING_STATE, newProcessingState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQueryHints() {
		return (String)getMixed().get(Engine300Package.Literals.DOCUMENT_ROOT__QUERY_HINTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryHints(String newQueryHints) {
		((FeatureMap.Internal)getMixed()).set(Engine300Package.Literals.DOCUMENT_ROOT__QUERY_HINTS, newQueryHints);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImpersonationInfo getQueryImpersonationInfo() {
		return (ImpersonationInfo)getMixed().get(Engine300Package.Literals.DOCUMENT_ROOT__QUERY_IMPERSONATION_INFO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueryImpersonationInfo(ImpersonationInfo newQueryImpersonationInfo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Engine300Package.Literals.DOCUMENT_ROOT__QUERY_IMPERSONATION_INFO, newQueryImpersonationInfo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryImpersonationInfo(ImpersonationInfo newQueryImpersonationInfo) {
		((FeatureMap.Internal)getMixed()).set(Engine300Package.Literals.DOCUMENT_ROOT__QUERY_IMPERSONATION_INFO, newQueryImpersonationInfo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerModeType getServerMode() {
		return (ServerModeType)getMixed().get(Engine300Package.Literals.DOCUMENT_ROOT__SERVER_MODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerMode(ServerModeType newServerMode) {
		((FeatureMap.Internal)getMixed()).set(Engine300Package.Literals.DOCUMENT_ROOT__SERVER_MODE, newServerMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringStoresCompatibilityLevelType getStringStoresCompatibilityLevel() {
		return (StringStoresCompatibilityLevelType)getMixed().get(Engine300Package.Literals.DOCUMENT_ROOT__STRING_STORES_COMPATIBILITY_LEVEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringStoresCompatibilityLevel(StringStoresCompatibilityLevelType newStringStoresCompatibilityLevel) {
		((FeatureMap.Internal)getMixed()).set(Engine300Package.Literals.DOCUMENT_ROOT__STRING_STORES_COMPATIBILITY_LEVEL, newStringStoresCompatibilityLevel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureTypeType getStructureType() {
		return (StructureTypeType)getMixed().get(Engine300Package.Literals.DOCUMENT_ROOT__STRUCTURE_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructureType(StructureTypeType newStructureType) {
		((FeatureMap.Internal)getMixed()).set(Engine300Package.Literals.DOCUMENT_ROOT__STRUCTURE_TYPE, newStructureType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Engine300Package.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Engine300Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case Engine300Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case Engine300Package.DOCUMENT_ROOT__QUERY_IMPERSONATION_INFO:
				return basicSetQueryImpersonationInfo(null, msgs);
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
			case Engine300Package.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Engine300Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case Engine300Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case Engine300Package.DOCUMENT_ROOT__CURRENT_STRING_STORES_COMPATIBILITY_LEVEL:
				return getCurrentStringStoresCompatibilityLevel();
			case Engine300Package.DOCUMENT_ROOT__DATA_EMBEDDING_STYLE:
				return getDataEmbeddingStyle();
			case Engine300Package.DOCUMENT_ROOT__PROCESSING_STATE:
				return getProcessingState();
			case Engine300Package.DOCUMENT_ROOT__QUERY_HINTS:
				return getQueryHints();
			case Engine300Package.DOCUMENT_ROOT__QUERY_IMPERSONATION_INFO:
				return getQueryImpersonationInfo();
			case Engine300Package.DOCUMENT_ROOT__SERVER_MODE:
				return getServerMode();
			case Engine300Package.DOCUMENT_ROOT__STRING_STORES_COMPATIBILITY_LEVEL:
				return getStringStoresCompatibilityLevel();
			case Engine300Package.DOCUMENT_ROOT__STRUCTURE_TYPE:
				return getStructureType();
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
			case Engine300Package.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Engine300Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case Engine300Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case Engine300Package.DOCUMENT_ROOT__CURRENT_STRING_STORES_COMPATIBILITY_LEVEL:
				setCurrentStringStoresCompatibilityLevel((CurrentStringStoresCompatibilityLevelType)newValue);
				return;
			case Engine300Package.DOCUMENT_ROOT__DATA_EMBEDDING_STYLE:
				setDataEmbeddingStyle((DataEmbeddingStyleType)newValue);
				return;
			case Engine300Package.DOCUMENT_ROOT__PROCESSING_STATE:
				setProcessingState((ProcessingStateType)newValue);
				return;
			case Engine300Package.DOCUMENT_ROOT__QUERY_HINTS:
				setQueryHints((String)newValue);
				return;
			case Engine300Package.DOCUMENT_ROOT__QUERY_IMPERSONATION_INFO:
				setQueryImpersonationInfo((ImpersonationInfo)newValue);
				return;
			case Engine300Package.DOCUMENT_ROOT__SERVER_MODE:
				setServerMode((ServerModeType)newValue);
				return;
			case Engine300Package.DOCUMENT_ROOT__STRING_STORES_COMPATIBILITY_LEVEL:
				setStringStoresCompatibilityLevel((StringStoresCompatibilityLevelType)newValue);
				return;
			case Engine300Package.DOCUMENT_ROOT__STRUCTURE_TYPE:
				setStructureType((StructureTypeType)newValue);
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
			case Engine300Package.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case Engine300Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case Engine300Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case Engine300Package.DOCUMENT_ROOT__CURRENT_STRING_STORES_COMPATIBILITY_LEVEL:
				setCurrentStringStoresCompatibilityLevel(CURRENT_STRING_STORES_COMPATIBILITY_LEVEL_EDEFAULT);
				return;
			case Engine300Package.DOCUMENT_ROOT__DATA_EMBEDDING_STYLE:
				setDataEmbeddingStyle(DATA_EMBEDDING_STYLE_EDEFAULT);
				return;
			case Engine300Package.DOCUMENT_ROOT__PROCESSING_STATE:
				setProcessingState(PROCESSING_STATE_EDEFAULT);
				return;
			case Engine300Package.DOCUMENT_ROOT__QUERY_HINTS:
				setQueryHints(QUERY_HINTS_EDEFAULT);
				return;
			case Engine300Package.DOCUMENT_ROOT__QUERY_IMPERSONATION_INFO:
				setQueryImpersonationInfo((ImpersonationInfo)null);
				return;
			case Engine300Package.DOCUMENT_ROOT__SERVER_MODE:
				setServerMode(SERVER_MODE_EDEFAULT);
				return;
			case Engine300Package.DOCUMENT_ROOT__STRING_STORES_COMPATIBILITY_LEVEL:
				setStringStoresCompatibilityLevel(STRING_STORES_COMPATIBILITY_LEVEL_EDEFAULT);
				return;
			case Engine300Package.DOCUMENT_ROOT__STRUCTURE_TYPE:
				setStructureType(STRUCTURE_TYPE_EDEFAULT);
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
			case Engine300Package.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Engine300Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case Engine300Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case Engine300Package.DOCUMENT_ROOT__CURRENT_STRING_STORES_COMPATIBILITY_LEVEL:
				return getCurrentStringStoresCompatibilityLevel() != CURRENT_STRING_STORES_COMPATIBILITY_LEVEL_EDEFAULT;
			case Engine300Package.DOCUMENT_ROOT__DATA_EMBEDDING_STYLE:
				return getDataEmbeddingStyle() != DATA_EMBEDDING_STYLE_EDEFAULT;
			case Engine300Package.DOCUMENT_ROOT__PROCESSING_STATE:
				return getProcessingState() != PROCESSING_STATE_EDEFAULT;
			case Engine300Package.DOCUMENT_ROOT__QUERY_HINTS:
				return QUERY_HINTS_EDEFAULT == null ? getQueryHints() != null : !QUERY_HINTS_EDEFAULT.equals(getQueryHints());
			case Engine300Package.DOCUMENT_ROOT__QUERY_IMPERSONATION_INFO:
				return getQueryImpersonationInfo() != null;
			case Engine300Package.DOCUMENT_ROOT__SERVER_MODE:
				return getServerMode() != SERVER_MODE_EDEFAULT;
			case Engine300Package.DOCUMENT_ROOT__STRING_STORES_COMPATIBILITY_LEVEL:
				return getStringStoresCompatibilityLevel() != STRING_STORES_COMPATIBILITY_LEVEL_EDEFAULT;
			case Engine300Package.DOCUMENT_ROOT__STRUCTURE_TYPE:
				return getStructureType() != STRUCTURE_TYPE_EDEFAULT;
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
