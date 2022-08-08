/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine200_200.impl;

import org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot;
import org.eclipse.daanse.xmla.model.ecore.engine200_200.Engine200_200Package;
import org.eclipse.daanse.xmla.model.ecore.engine200_200.ProcessingRecommendationType;
import org.eclipse.daanse.xmla.model.ecore.engine200_200.ProcessingStateType;
import org.eclipse.daanse.xmla.model.ecore.engine200_200.ShareDimensionStorageType;
import org.eclipse.daanse.xmla.model.ecore.engine200_200.StorageEngineUsedType;

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
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.DocumentRootImpl#getImagePath <em>Image Path</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.DocumentRootImpl#getImageUniqueID <em>Image Unique ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.DocumentRootImpl#getImageUrl <em>Image Url</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.DocumentRootImpl#getImageVersion <em>Image Version</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.DocumentRootImpl#getProcessingRecommendation <em>Processing Recommendation</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.DocumentRootImpl#getProcessingState <em>Processing State</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.DocumentRootImpl#getShareDimensionStorage <em>Share Dimension Storage</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.DocumentRootImpl#getStorageEngineUsed <em>Storage Engine Used</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.DocumentRootImpl#getToken <em>Token</em>}</li>
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
	 * The default value of the '{@link #getImagePath() <em>Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagePath()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_PATH_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getImageUniqueID() <em>Image Unique ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageUniqueID()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_UNIQUE_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getImageUrl() <em>Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_URL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getImageVersion() <em>Image Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_VERSION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getProcessingRecommendation() <em>Processing Recommendation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingRecommendation()
	 * @generated
	 * @ordered
	 */
	protected static final ProcessingRecommendationType PROCESSING_RECOMMENDATION_EDEFAULT = ProcessingRecommendationType.NONE;

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
	 * The default value of the '{@link #getShareDimensionStorage() <em>Share Dimension Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShareDimensionStorage()
	 * @generated
	 * @ordered
	 */
	protected static final ShareDimensionStorageType SHARE_DIMENSION_STORAGE_EDEFAULT = ShareDimensionStorageType.DISTINCT;

	/**
	 * The default value of the '{@link #getStorageEngineUsed() <em>Storage Engine Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageEngineUsed()
	 * @generated
	 * @ordered
	 */
	protected static final StorageEngineUsedType STORAGE_ENGINE_USED_EDEFAULT = StorageEngineUsedType.TRADITIONAL;

	/**
	 * The default value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKEN_EDEFAULT = null;

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
		return Engine200_200Package.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Engine200_200Package.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>((EClass) eStaticClass().getEStructuralFeature(Engine200_200Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP).getEType(), EStringToStringMapEntryImpl.class, this, Engine200_200Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>((EClass) eStaticClass().getEStructuralFeature(Engine200_200Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION).getEType(), EStringToStringMapEntryImpl.class, this, Engine200_200Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImagePath() {
		return (String)getMixed().get(Engine200_200Package.Literals.DOCUMENT_ROOT__IMAGE_PATH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImagePath(String newImagePath) {
		((FeatureMap.Internal)getMixed()).set(Engine200_200Package.Literals.DOCUMENT_ROOT__IMAGE_PATH, newImagePath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImageUniqueID() {
		return (String)getMixed().get(Engine200_200Package.Literals.DOCUMENT_ROOT__IMAGE_UNIQUE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageUniqueID(String newImageUniqueID) {
		((FeatureMap.Internal)getMixed()).set(Engine200_200Package.Literals.DOCUMENT_ROOT__IMAGE_UNIQUE_ID, newImageUniqueID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImageUrl() {
		return (String)getMixed().get(Engine200_200Package.Literals.DOCUMENT_ROOT__IMAGE_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageUrl(String newImageUrl) {
		((FeatureMap.Internal)getMixed()).set(Engine200_200Package.Literals.DOCUMENT_ROOT__IMAGE_URL, newImageUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImageVersion() {
		return (String)getMixed().get(Engine200_200Package.Literals.DOCUMENT_ROOT__IMAGE_VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageVersion(String newImageVersion) {
		((FeatureMap.Internal)getMixed()).set(Engine200_200Package.Literals.DOCUMENT_ROOT__IMAGE_VERSION, newImageVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingRecommendationType getProcessingRecommendation() {
		return (ProcessingRecommendationType)getMixed().get(Engine200_200Package.Literals.DOCUMENT_ROOT__PROCESSING_RECOMMENDATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingRecommendation(ProcessingRecommendationType newProcessingRecommendation) {
		((FeatureMap.Internal)getMixed()).set(Engine200_200Package.Literals.DOCUMENT_ROOT__PROCESSING_RECOMMENDATION, newProcessingRecommendation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingStateType getProcessingState() {
		return (ProcessingStateType)getMixed().get(Engine200_200Package.Literals.DOCUMENT_ROOT__PROCESSING_STATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingState(ProcessingStateType newProcessingState) {
		((FeatureMap.Internal)getMixed()).set(Engine200_200Package.Literals.DOCUMENT_ROOT__PROCESSING_STATE, newProcessingState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShareDimensionStorageType getShareDimensionStorage() {
		return (ShareDimensionStorageType)getMixed().get(Engine200_200Package.Literals.DOCUMENT_ROOT__SHARE_DIMENSION_STORAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShareDimensionStorage(ShareDimensionStorageType newShareDimensionStorage) {
		((FeatureMap.Internal)getMixed()).set(Engine200_200Package.Literals.DOCUMENT_ROOT__SHARE_DIMENSION_STORAGE, newShareDimensionStorage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageEngineUsedType getStorageEngineUsed() {
		return (StorageEngineUsedType)getMixed().get(Engine200_200Package.Literals.DOCUMENT_ROOT__STORAGE_ENGINE_USED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStorageEngineUsed(StorageEngineUsedType newStorageEngineUsed) {
		((FeatureMap.Internal)getMixed()).set(Engine200_200Package.Literals.DOCUMENT_ROOT__STORAGE_ENGINE_USED, newStorageEngineUsed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToken() {
		return (String)getMixed().get(Engine200_200Package.Literals.DOCUMENT_ROOT__TOKEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToken(String newToken) {
		((FeatureMap.Internal)getMixed()).set(Engine200_200Package.Literals.DOCUMENT_ROOT__TOKEN, newToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Engine200_200Package.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Engine200_200Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case Engine200_200Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
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
			case Engine200_200Package.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Engine200_200Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case Engine200_200Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case Engine200_200Package.DOCUMENT_ROOT__IMAGE_PATH:
				return getImagePath();
			case Engine200_200Package.DOCUMENT_ROOT__IMAGE_UNIQUE_ID:
				return getImageUniqueID();
			case Engine200_200Package.DOCUMENT_ROOT__IMAGE_URL:
				return getImageUrl();
			case Engine200_200Package.DOCUMENT_ROOT__IMAGE_VERSION:
				return getImageVersion();
			case Engine200_200Package.DOCUMENT_ROOT__PROCESSING_RECOMMENDATION:
				return getProcessingRecommendation();
			case Engine200_200Package.DOCUMENT_ROOT__PROCESSING_STATE:
				return getProcessingState();
			case Engine200_200Package.DOCUMENT_ROOT__SHARE_DIMENSION_STORAGE:
				return getShareDimensionStorage();
			case Engine200_200Package.DOCUMENT_ROOT__STORAGE_ENGINE_USED:
				return getStorageEngineUsed();
			case Engine200_200Package.DOCUMENT_ROOT__TOKEN:
				return getToken();
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
			case Engine200_200Package.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Engine200_200Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case Engine200_200Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case Engine200_200Package.DOCUMENT_ROOT__IMAGE_PATH:
				setImagePath((String)newValue);
				return;
			case Engine200_200Package.DOCUMENT_ROOT__IMAGE_UNIQUE_ID:
				setImageUniqueID((String)newValue);
				return;
			case Engine200_200Package.DOCUMENT_ROOT__IMAGE_URL:
				setImageUrl((String)newValue);
				return;
			case Engine200_200Package.DOCUMENT_ROOT__IMAGE_VERSION:
				setImageVersion((String)newValue);
				return;
			case Engine200_200Package.DOCUMENT_ROOT__PROCESSING_RECOMMENDATION:
				setProcessingRecommendation((ProcessingRecommendationType)newValue);
				return;
			case Engine200_200Package.DOCUMENT_ROOT__PROCESSING_STATE:
				setProcessingState((ProcessingStateType)newValue);
				return;
			case Engine200_200Package.DOCUMENT_ROOT__SHARE_DIMENSION_STORAGE:
				setShareDimensionStorage((ShareDimensionStorageType)newValue);
				return;
			case Engine200_200Package.DOCUMENT_ROOT__STORAGE_ENGINE_USED:
				setStorageEngineUsed((StorageEngineUsedType)newValue);
				return;
			case Engine200_200Package.DOCUMENT_ROOT__TOKEN:
				setToken((String)newValue);
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
			case Engine200_200Package.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case Engine200_200Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case Engine200_200Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case Engine200_200Package.DOCUMENT_ROOT__IMAGE_PATH:
				setImagePath(IMAGE_PATH_EDEFAULT);
				return;
			case Engine200_200Package.DOCUMENT_ROOT__IMAGE_UNIQUE_ID:
				setImageUniqueID(IMAGE_UNIQUE_ID_EDEFAULT);
				return;
			case Engine200_200Package.DOCUMENT_ROOT__IMAGE_URL:
				setImageUrl(IMAGE_URL_EDEFAULT);
				return;
			case Engine200_200Package.DOCUMENT_ROOT__IMAGE_VERSION:
				setImageVersion(IMAGE_VERSION_EDEFAULT);
				return;
			case Engine200_200Package.DOCUMENT_ROOT__PROCESSING_RECOMMENDATION:
				setProcessingRecommendation(PROCESSING_RECOMMENDATION_EDEFAULT);
				return;
			case Engine200_200Package.DOCUMENT_ROOT__PROCESSING_STATE:
				setProcessingState(PROCESSING_STATE_EDEFAULT);
				return;
			case Engine200_200Package.DOCUMENT_ROOT__SHARE_DIMENSION_STORAGE:
				setShareDimensionStorage(SHARE_DIMENSION_STORAGE_EDEFAULT);
				return;
			case Engine200_200Package.DOCUMENT_ROOT__STORAGE_ENGINE_USED:
				setStorageEngineUsed(STORAGE_ENGINE_USED_EDEFAULT);
				return;
			case Engine200_200Package.DOCUMENT_ROOT__TOKEN:
				setToken(TOKEN_EDEFAULT);
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
			case Engine200_200Package.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Engine200_200Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case Engine200_200Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case Engine200_200Package.DOCUMENT_ROOT__IMAGE_PATH:
				return IMAGE_PATH_EDEFAULT == null ? getImagePath() != null : !IMAGE_PATH_EDEFAULT.equals(getImagePath());
			case Engine200_200Package.DOCUMENT_ROOT__IMAGE_UNIQUE_ID:
				return IMAGE_UNIQUE_ID_EDEFAULT == null ? getImageUniqueID() != null : !IMAGE_UNIQUE_ID_EDEFAULT.equals(getImageUniqueID());
			case Engine200_200Package.DOCUMENT_ROOT__IMAGE_URL:
				return IMAGE_URL_EDEFAULT == null ? getImageUrl() != null : !IMAGE_URL_EDEFAULT.equals(getImageUrl());
			case Engine200_200Package.DOCUMENT_ROOT__IMAGE_VERSION:
				return IMAGE_VERSION_EDEFAULT == null ? getImageVersion() != null : !IMAGE_VERSION_EDEFAULT.equals(getImageVersion());
			case Engine200_200Package.DOCUMENT_ROOT__PROCESSING_RECOMMENDATION:
				return getProcessingRecommendation() != PROCESSING_RECOMMENDATION_EDEFAULT;
			case Engine200_200Package.DOCUMENT_ROOT__PROCESSING_STATE:
				return getProcessingState() != PROCESSING_STATE_EDEFAULT;
			case Engine200_200Package.DOCUMENT_ROOT__SHARE_DIMENSION_STORAGE:
				return getShareDimensionStorage() != SHARE_DIMENSION_STORAGE_EDEFAULT;
			case Engine200_200Package.DOCUMENT_ROOT__STORAGE_ENGINE_USED:
				return getStorageEngineUsed() != STORAGE_ENGINE_USED_EDEFAULT;
			case Engine200_200Package.DOCUMENT_ROOT__TOKEN:
				return TOKEN_EDEFAULT == null ? getToken() != null : !TOKEN_EDEFAULT.equals(getToken());
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
