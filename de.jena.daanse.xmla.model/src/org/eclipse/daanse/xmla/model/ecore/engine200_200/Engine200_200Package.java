/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine200_200;

import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.Engine200_200Factory
 * @model kind="package"
 *        annotation="https://jakarta.ee/xml/ns/jaxb version='3.0'"
 * @generated
 */
public interface Engine200_200Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "engine200_200";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schemas.microsoft.com/analysisservices/2010/engine/200/200";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "engine200_200";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Engine200_200Package eINSTANCE = org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.Engine200_200PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.ExpressionBindingImpl <em>Expression Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.ExpressionBindingImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.Engine200_200PackageImpl#getExpressionBinding()
	 * @generated
	 */
	int EXPRESSION_BINDING = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_BINDING__EXPRESSION = XmlaPackage.BINDING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_BINDING_FEATURE_COUNT = XmlaPackage.BINDING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expression Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_BINDING_OPERATION_COUNT = XmlaPackage.BINDING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.RowNumberBindingImpl <em>Row Number Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.RowNumberBindingImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.Engine200_200PackageImpl#getRowNumberBinding()
	 * @generated
	 */
	int ROW_NUMBER_BINDING = 1;

	/**
	 * The number of structural features of the '<em>Row Number Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_NUMBER_BINDING_FEATURE_COUNT = XmlaPackage.BINDING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Row Number Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_NUMBER_BINDING_OPERATION_COUNT = XmlaPackage.BINDING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.DocumentRootImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.Engine200_200PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IMAGE_PATH = 3;

	/**
	 * The feature id for the '<em><b>Image Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IMAGE_UNIQUE_ID = 4;

	/**
	 * The feature id for the '<em><b>Image Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IMAGE_URL = 5;

	/**
	 * The feature id for the '<em><b>Image Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IMAGE_VERSION = 6;

	/**
	 * The feature id for the '<em><b>Processing Recommendation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROCESSING_RECOMMENDATION = 7;

	/**
	 * The feature id for the '<em><b>Processing State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROCESSING_STATE = 8;

	/**
	 * The feature id for the '<em><b>Share Dimension Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SHARE_DIMENSION_STORAGE = 9;

	/**
	 * The feature id for the '<em><b>Storage Engine Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STORAGE_ENGINE_USED = 10;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TOKEN = 11;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.ProcessingRecommendationType <em>Processing Recommendation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.ProcessingRecommendationType
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.Engine200_200PackageImpl#getProcessingRecommendationType()
	 * @generated
	 */
	int PROCESSING_RECOMMENDATION_TYPE = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.ProcessingStateType <em>Processing State Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.ProcessingStateType
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.Engine200_200PackageImpl#getProcessingStateType()
	 * @generated
	 */
	int PROCESSING_STATE_TYPE = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.ShareDimensionStorageType <em>Share Dimension Storage Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.ShareDimensionStorageType
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.Engine200_200PackageImpl#getShareDimensionStorageType()
	 * @generated
	 */
	int SHARE_DIMENSION_STORAGE_TYPE = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.StorageEngineUsedType <em>Storage Engine Used Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.StorageEngineUsedType
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.Engine200_200PackageImpl#getStorageEngineUsedType()
	 * @generated
	 */
	int STORAGE_ENGINE_USED_TYPE = 6;

	/**
	 * The meta object id for the '<em>Processing Recommendation Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.ProcessingRecommendationType
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.Engine200_200PackageImpl#getProcessingRecommendationTypeObject()
	 * @generated
	 */
	int PROCESSING_RECOMMENDATION_TYPE_OBJECT = 7;

	/**
	 * The meta object id for the '<em>Processing State Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.ProcessingStateType
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.Engine200_200PackageImpl#getProcessingStateTypeObject()
	 * @generated
	 */
	int PROCESSING_STATE_TYPE_OBJECT = 8;

	/**
	 * The meta object id for the '<em>Share Dimension Storage Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.ShareDimensionStorageType
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.Engine200_200PackageImpl#getShareDimensionStorageTypeObject()
	 * @generated
	 */
	int SHARE_DIMENSION_STORAGE_TYPE_OBJECT = 9;

	/**
	 * The meta object id for the '<em>Storage Engine Used Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.StorageEngineUsedType
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.Engine200_200PackageImpl#getStorageEngineUsedTypeObject()
	 * @generated
	 */
	int STORAGE_ENGINE_USED_TYPE_OBJECT = 10;


	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.ExpressionBinding <em>Expression Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Binding</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.ExpressionBinding
	 * @generated
	 */
	EClass getExpressionBinding();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.ExpressionBinding#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.ExpressionBinding#getExpression()
	 * @see #getExpressionBinding()
	 * @generated
	 */
	EAttribute getExpressionBinding_Expression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.RowNumberBinding <em>Row Number Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row Number Binding</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.RowNumberBinding
	 * @generated
	 */
	EClass getRowNumberBinding();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot#getImagePath <em>Image Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Path</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot#getImagePath()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ImagePath();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot#getImageUniqueID <em>Image Unique ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Unique ID</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot#getImageUniqueID()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ImageUniqueID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot#getImageUrl <em>Image Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Url</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot#getImageUrl()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ImageUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot#getImageVersion <em>Image Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Version</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot#getImageVersion()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ImageVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot#getProcessingRecommendation <em>Processing Recommendation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processing Recommendation</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot#getProcessingRecommendation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ProcessingRecommendation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot#getProcessingState <em>Processing State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processing State</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot#getProcessingState()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ProcessingState();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot#getShareDimensionStorage <em>Share Dimension Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Share Dimension Storage</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot#getShareDimensionStorage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ShareDimensionStorage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot#getStorageEngineUsed <em>Storage Engine Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage Engine Used</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot#getStorageEngineUsed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StorageEngineUsed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot#getToken()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Token();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.ProcessingRecommendationType <em>Processing Recommendation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Processing Recommendation Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.ProcessingRecommendationType
	 * @generated
	 */
	EEnum getProcessingRecommendationType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.ProcessingStateType <em>Processing State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Processing State Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.ProcessingStateType
	 * @generated
	 */
	EEnum getProcessingStateType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.ShareDimensionStorageType <em>Share Dimension Storage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Share Dimension Storage Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.ShareDimensionStorageType
	 * @generated
	 */
	EEnum getShareDimensionStorageType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.StorageEngineUsedType <em>Storage Engine Used Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Storage Engine Used Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.StorageEngineUsedType
	 * @generated
	 */
	EEnum getStorageEngineUsedType();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.ProcessingRecommendationType <em>Processing Recommendation Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Processing Recommendation Type Object</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.ProcessingRecommendationType
	 * @model instanceClass="org.eclipse.daanse.xmla.model.ecore.engine200_200.ProcessingRecommendationType"
	 *        extendedMetaData="name='ProcessingRecommendation_._type:Object' baseType='ProcessingRecommendation_._type'"
	 * @generated
	 */
	EDataType getProcessingRecommendationTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.ProcessingStateType <em>Processing State Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Processing State Type Object</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.ProcessingStateType
	 * @model instanceClass="org.eclipse.daanse.xmla.model.ecore.engine200_200.ProcessingStateType"
	 *        extendedMetaData="name='ProcessingState_._type:Object' baseType='ProcessingState_._type'"
	 * @generated
	 */
	EDataType getProcessingStateTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.ShareDimensionStorageType <em>Share Dimension Storage Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Share Dimension Storage Type Object</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.ShareDimensionStorageType
	 * @model instanceClass="org.eclipse.daanse.xmla.model.ecore.engine200_200.ShareDimensionStorageType"
	 *        extendedMetaData="name='ShareDimensionStorage_._type:Object' baseType='ShareDimensionStorage_._type'"
	 * @generated
	 */
	EDataType getShareDimensionStorageTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.StorageEngineUsedType <em>Storage Engine Used Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Storage Engine Used Type Object</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.StorageEngineUsedType
	 * @model instanceClass="org.eclipse.daanse.xmla.model.ecore.engine200_200.StorageEngineUsedType"
	 *        extendedMetaData="name='StorageEngineUsed_._type:Object' baseType='StorageEngineUsed_._type'"
	 * @generated
	 */
	EDataType getStorageEngineUsedTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Engine200_200Factory getEngine200_200Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.ExpressionBindingImpl <em>Expression Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.ExpressionBindingImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.Engine200_200PackageImpl#getExpressionBinding()
		 * @generated
		 */
		EClass EXPRESSION_BINDING = eINSTANCE.getExpressionBinding();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION_BINDING__EXPRESSION = eINSTANCE.getExpressionBinding_Expression();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.RowNumberBindingImpl <em>Row Number Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.RowNumberBindingImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.Engine200_200PackageImpl#getRowNumberBinding()
		 * @generated
		 */
		EClass ROW_NUMBER_BINDING = eINSTANCE.getRowNumberBinding();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.DocumentRootImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.Engine200_200PackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Image Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__IMAGE_PATH = eINSTANCE.getDocumentRoot_ImagePath();

		/**
		 * The meta object literal for the '<em><b>Image Unique ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__IMAGE_UNIQUE_ID = eINSTANCE.getDocumentRoot_ImageUniqueID();

		/**
		 * The meta object literal for the '<em><b>Image Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__IMAGE_URL = eINSTANCE.getDocumentRoot_ImageUrl();

		/**
		 * The meta object literal for the '<em><b>Image Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__IMAGE_VERSION = eINSTANCE.getDocumentRoot_ImageVersion();

		/**
		 * The meta object literal for the '<em><b>Processing Recommendation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__PROCESSING_RECOMMENDATION = eINSTANCE.getDocumentRoot_ProcessingRecommendation();

		/**
		 * The meta object literal for the '<em><b>Processing State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__PROCESSING_STATE = eINSTANCE.getDocumentRoot_ProcessingState();

		/**
		 * The meta object literal for the '<em><b>Share Dimension Storage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SHARE_DIMENSION_STORAGE = eINSTANCE.getDocumentRoot_ShareDimensionStorage();

		/**
		 * The meta object literal for the '<em><b>Storage Engine Used</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__STORAGE_ENGINE_USED = eINSTANCE.getDocumentRoot_StorageEngineUsed();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TOKEN = eINSTANCE.getDocumentRoot_Token();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.ProcessingRecommendationType <em>Processing Recommendation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.ProcessingRecommendationType
		 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.Engine200_200PackageImpl#getProcessingRecommendationType()
		 * @generated
		 */
		EEnum PROCESSING_RECOMMENDATION_TYPE = eINSTANCE.getProcessingRecommendationType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.ProcessingStateType <em>Processing State Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.ProcessingStateType
		 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.Engine200_200PackageImpl#getProcessingStateType()
		 * @generated
		 */
		EEnum PROCESSING_STATE_TYPE = eINSTANCE.getProcessingStateType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.ShareDimensionStorageType <em>Share Dimension Storage Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.ShareDimensionStorageType
		 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.Engine200_200PackageImpl#getShareDimensionStorageType()
		 * @generated
		 */
		EEnum SHARE_DIMENSION_STORAGE_TYPE = eINSTANCE.getShareDimensionStorageType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.StorageEngineUsedType <em>Storage Engine Used Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.StorageEngineUsedType
		 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.Engine200_200PackageImpl#getStorageEngineUsedType()
		 * @generated
		 */
		EEnum STORAGE_ENGINE_USED_TYPE = eINSTANCE.getStorageEngineUsedType();

		/**
		 * The meta object literal for the '<em>Processing Recommendation Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.ProcessingRecommendationType
		 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.Engine200_200PackageImpl#getProcessingRecommendationTypeObject()
		 * @generated
		 */
		EDataType PROCESSING_RECOMMENDATION_TYPE_OBJECT = eINSTANCE.getProcessingRecommendationTypeObject();

		/**
		 * The meta object literal for the '<em>Processing State Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.ProcessingStateType
		 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.Engine200_200PackageImpl#getProcessingStateTypeObject()
		 * @generated
		 */
		EDataType PROCESSING_STATE_TYPE_OBJECT = eINSTANCE.getProcessingStateTypeObject();

		/**
		 * The meta object literal for the '<em>Share Dimension Storage Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.ShareDimensionStorageType
		 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.Engine200_200PackageImpl#getShareDimensionStorageTypeObject()
		 * @generated
		 */
		EDataType SHARE_DIMENSION_STORAGE_TYPE_OBJECT = eINSTANCE.getShareDimensionStorageTypeObject();

		/**
		 * The meta object literal for the '<em>Storage Engine Used Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.StorageEngineUsedType
		 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.Engine200_200PackageImpl#getStorageEngineUsedTypeObject()
		 * @generated
		 */
		EDataType STORAGE_ENGINE_USED_TYPE_OBJECT = eINSTANCE.getStorageEngineUsedTypeObject();

	}

} //Engine200_200Package
