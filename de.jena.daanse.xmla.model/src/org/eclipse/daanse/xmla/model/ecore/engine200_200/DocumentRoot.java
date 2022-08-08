/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine200_200;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot#getImagePath <em>Image Path</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot#getImageUniqueID <em>Image Unique ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot#getImageUrl <em>Image Url</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot#getImageVersion <em>Image Version</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot#getProcessingRecommendation <em>Processing Recommendation</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot#getProcessingState <em>Processing State</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot#getShareDimensionStorage <em>Share Dimension Storage</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot#getStorageEngineUsed <em>Storage Engine Used</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot#getToken <em>Token</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.Engine200_200Package#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.Engine200_200Package#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.Engine200_200Package#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.Engine200_200Package#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Path</em>' attribute.
	 * @see #setImagePath(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.Engine200_200Package#getDocumentRoot_ImagePath()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ImagePath' namespace='##targetNamespace'"
	 * @generated
	 */
	String getImagePath();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot#getImagePath <em>Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Path</em>' attribute.
	 * @see #getImagePath()
	 * @generated
	 */
	void setImagePath(String value);

	/**
	 * Returns the value of the '<em><b>Image Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Unique ID</em>' attribute.
	 * @see #setImageUniqueID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.Engine200_200Package#getDocumentRoot_ImageUniqueID()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ImageUniqueID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getImageUniqueID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot#getImageUniqueID <em>Image Unique ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Unique ID</em>' attribute.
	 * @see #getImageUniqueID()
	 * @generated
	 */
	void setImageUniqueID(String value);

	/**
	 * Returns the value of the '<em><b>Image Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Url</em>' attribute.
	 * @see #setImageUrl(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.Engine200_200Package#getDocumentRoot_ImageUrl()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ImageUrl' namespace='##targetNamespace'"
	 * @generated
	 */
	String getImageUrl();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot#getImageUrl <em>Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Url</em>' attribute.
	 * @see #getImageUrl()
	 * @generated
	 */
	void setImageUrl(String value);

	/**
	 * Returns the value of the '<em><b>Image Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Version</em>' attribute.
	 * @see #setImageVersion(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.Engine200_200Package#getDocumentRoot_ImageVersion()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ImageVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	String getImageVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot#getImageVersion <em>Image Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Version</em>' attribute.
	 * @see #getImageVersion()
	 * @generated
	 */
	void setImageVersion(String value);

	/**
	 * Returns the value of the '<em><b>Processing Recommendation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.engine200_200.ProcessingRecommendationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Recommendation</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.ProcessingRecommendationType
	 * @see #setProcessingRecommendation(ProcessingRecommendationType)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.Engine200_200Package#getDocumentRoot_ProcessingRecommendation()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProcessingRecommendation' namespace='##targetNamespace'"
	 * @generated
	 */
	ProcessingRecommendationType getProcessingRecommendation();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot#getProcessingRecommendation <em>Processing Recommendation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Recommendation</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.ProcessingRecommendationType
	 * @see #getProcessingRecommendation()
	 * @generated
	 */
	void setProcessingRecommendation(ProcessingRecommendationType value);

	/**
	 * Returns the value of the '<em><b>Processing State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.engine200_200.ProcessingStateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing State</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.ProcessingStateType
	 * @see #setProcessingState(ProcessingStateType)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.Engine200_200Package#getDocumentRoot_ProcessingState()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProcessingState' namespace='##targetNamespace'"
	 * @generated
	 */
	ProcessingStateType getProcessingState();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot#getProcessingState <em>Processing State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing State</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.ProcessingStateType
	 * @see #getProcessingState()
	 * @generated
	 */
	void setProcessingState(ProcessingStateType value);

	/**
	 * Returns the value of the '<em><b>Share Dimension Storage</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.engine200_200.ShareDimensionStorageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Share Dimension Storage</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.ShareDimensionStorageType
	 * @see #setShareDimensionStorage(ShareDimensionStorageType)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.Engine200_200Package#getDocumentRoot_ShareDimensionStorage()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ShareDimensionStorage' namespace='##targetNamespace'"
	 * @generated
	 */
	ShareDimensionStorageType getShareDimensionStorage();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot#getShareDimensionStorage <em>Share Dimension Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Share Dimension Storage</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.ShareDimensionStorageType
	 * @see #getShareDimensionStorage()
	 * @generated
	 */
	void setShareDimensionStorage(ShareDimensionStorageType value);

	/**
	 * Returns the value of the '<em><b>Storage Engine Used</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.engine200_200.StorageEngineUsedType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Engine Used</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.StorageEngineUsedType
	 * @see #setStorageEngineUsed(StorageEngineUsedType)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.Engine200_200Package#getDocumentRoot_StorageEngineUsed()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StorageEngineUsed' namespace='##targetNamespace'"
	 * @generated
	 */
	StorageEngineUsedType getStorageEngineUsed();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot#getStorageEngineUsed <em>Storage Engine Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Engine Used</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.StorageEngineUsedType
	 * @see #getStorageEngineUsed()
	 * @generated
	 */
	void setStorageEngineUsed(StorageEngineUsedType value);

	/**
	 * Returns the value of the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' attribute.
	 * @see #setToken(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.Engine200_200Package#getDocumentRoot_Token()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Token' namespace='##targetNamespace'"
	 * @generated
	 */
	String getToken();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot#getToken <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' attribute.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(String value);

} // DocumentRoot
