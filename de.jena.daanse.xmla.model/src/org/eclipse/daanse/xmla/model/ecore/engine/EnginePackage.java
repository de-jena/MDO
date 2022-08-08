/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine;

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
 * @see org.eclipse.daanse.xmla.model.ecore.engine.EngineFactory
 * @model kind="package"
 * @generated
 */
public interface EnginePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "engine";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schemas.microsoft.com/analysisservices/2003/engine";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "engine";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnginePackage eINSTANCE = org.eclipse.daanse.xmla.model.ecore.engine.impl.EnginePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine.impl.DocumentRootImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.engine.impl.EnginePackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

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
	 * The feature id for the '<em><b>Last Data Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LAST_DATA_UPDATE = 3;

	/**
	 * The feature id for the '<em><b>Last Schema Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LAST_SCHEMA_UPDATE = 4;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine.impl.ImpersonationInfoImpl <em>Impersonation Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine.impl.ImpersonationInfoImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.engine.impl.EnginePackageImpl#getImpersonationInfo()
	 * @generated
	 */
	int IMPERSONATION_INFO = 1;

	/**
	 * The feature id for the '<em><b>Impersonation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERSONATION_INFO__IMPERSONATION_MODE = 0;

	/**
	 * The feature id for the '<em><b>Account</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERSONATION_INFO__ACCOUNT = 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERSONATION_INFO__PASSWORD = 2;

	/**
	 * The feature id for the '<em><b>Impersonation Info Security</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERSONATION_INFO__IMPERSONATION_INFO_SECURITY = 3;

	/**
	 * The number of structural features of the '<em>Impersonation Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERSONATION_INFO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Impersonation Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERSONATION_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationInfoSecurityType <em>Impersonation Info Security Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationInfoSecurityType
	 * @see org.eclipse.daanse.xmla.model.ecore.engine.impl.EnginePackageImpl#getImpersonationInfoSecurityType()
	 * @generated
	 */
	int IMPERSONATION_INFO_SECURITY_TYPE = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationModeType <em>Impersonation Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationModeType
	 * @see org.eclipse.daanse.xmla.model.ecore.engine.impl.EnginePackageImpl#getImpersonationModeType()
	 * @generated
	 */
	int IMPERSONATION_MODE_TYPE = 3;

	/**
	 * The meta object id for the '<em>Impersonation Info Security Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationInfoSecurityType
	 * @see org.eclipse.daanse.xmla.model.ecore.engine.impl.EnginePackageImpl#getImpersonationInfoSecurityTypeObject()
	 * @generated
	 */
	int IMPERSONATION_INFO_SECURITY_TYPE_OBJECT = 4;

	/**
	 * The meta object id for the '<em>Impersonation Mode Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationModeType
	 * @see org.eclipse.daanse.xmla.model.ecore.engine.impl.EnginePackageImpl#getImpersonationModeTypeObject()
	 * @generated
	 */
	int IMPERSONATION_MODE_TYPE_OBJECT = 5;


	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.engine.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.daanse.xmla.model.ecore.engine.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.daanse.xmla.model.ecore.engine.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.daanse.xmla.model.ecore.engine.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine.DocumentRoot#getLastDataUpdate <em>Last Data Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Data Update</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine.DocumentRoot#getLastDataUpdate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LastDataUpdate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine.DocumentRoot#getLastSchemaUpdate <em>Last Schema Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Schema Update</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine.DocumentRoot#getLastSchemaUpdate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LastSchemaUpdate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationInfo <em>Impersonation Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Impersonation Info</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationInfo
	 * @generated
	 */
	EClass getImpersonationInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationInfo#getImpersonationMode <em>Impersonation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Impersonation Mode</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationInfo#getImpersonationMode()
	 * @see #getImpersonationInfo()
	 * @generated
	 */
	EAttribute getImpersonationInfo_ImpersonationMode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationInfo#getAccount <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationInfo#getAccount()
	 * @see #getImpersonationInfo()
	 * @generated
	 */
	EAttribute getImpersonationInfo_Account();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationInfo#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationInfo#getPassword()
	 * @see #getImpersonationInfo()
	 * @generated
	 */
	EAttribute getImpersonationInfo_Password();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationInfo#getImpersonationInfoSecurity <em>Impersonation Info Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Impersonation Info Security</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationInfo#getImpersonationInfoSecurity()
	 * @see #getImpersonationInfo()
	 * @generated
	 */
	EAttribute getImpersonationInfo_ImpersonationInfoSecurity();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationInfoSecurityType <em>Impersonation Info Security Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Impersonation Info Security Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationInfoSecurityType
	 * @generated
	 */
	EEnum getImpersonationInfoSecurityType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationModeType <em>Impersonation Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Impersonation Mode Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationModeType
	 * @generated
	 */
	EEnum getImpersonationModeType();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationInfoSecurityType <em>Impersonation Info Security Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Impersonation Info Security Type Object</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationInfoSecurityType
	 * @model instanceClass="org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationInfoSecurityType"
	 *        extendedMetaData="name='ImpersonationInfoSecurity_._type:Object' baseType='ImpersonationInfoSecurity_._type'"
	 * @generated
	 */
	EDataType getImpersonationInfoSecurityTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationModeType <em>Impersonation Mode Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Impersonation Mode Type Object</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationModeType
	 * @model instanceClass="org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationModeType"
	 *        extendedMetaData="name='ImpersonationMode_._type:Object' baseType='ImpersonationMode_._type'"
	 * @generated
	 */
	EDataType getImpersonationModeTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EngineFactory getEngineFactory();

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
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine.impl.DocumentRootImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.engine.impl.EnginePackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Last Data Update</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__LAST_DATA_UPDATE = eINSTANCE.getDocumentRoot_LastDataUpdate();

		/**
		 * The meta object literal for the '<em><b>Last Schema Update</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__LAST_SCHEMA_UPDATE = eINSTANCE.getDocumentRoot_LastSchemaUpdate();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine.impl.ImpersonationInfoImpl <em>Impersonation Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine.impl.ImpersonationInfoImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.engine.impl.EnginePackageImpl#getImpersonationInfo()
		 * @generated
		 */
		EClass IMPERSONATION_INFO = eINSTANCE.getImpersonationInfo();

		/**
		 * The meta object literal for the '<em><b>Impersonation Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPERSONATION_INFO__IMPERSONATION_MODE = eINSTANCE.getImpersonationInfo_ImpersonationMode();

		/**
		 * The meta object literal for the '<em><b>Account</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPERSONATION_INFO__ACCOUNT = eINSTANCE.getImpersonationInfo_Account();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPERSONATION_INFO__PASSWORD = eINSTANCE.getImpersonationInfo_Password();

		/**
		 * The meta object literal for the '<em><b>Impersonation Info Security</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPERSONATION_INFO__IMPERSONATION_INFO_SECURITY = eINSTANCE.getImpersonationInfo_ImpersonationInfoSecurity();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationInfoSecurityType <em>Impersonation Info Security Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationInfoSecurityType
		 * @see org.eclipse.daanse.xmla.model.ecore.engine.impl.EnginePackageImpl#getImpersonationInfoSecurityType()
		 * @generated
		 */
		EEnum IMPERSONATION_INFO_SECURITY_TYPE = eINSTANCE.getImpersonationInfoSecurityType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationModeType <em>Impersonation Mode Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationModeType
		 * @see org.eclipse.daanse.xmla.model.ecore.engine.impl.EnginePackageImpl#getImpersonationModeType()
		 * @generated
		 */
		EEnum IMPERSONATION_MODE_TYPE = eINSTANCE.getImpersonationModeType();

		/**
		 * The meta object literal for the '<em>Impersonation Info Security Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationInfoSecurityType
		 * @see org.eclipse.daanse.xmla.model.ecore.engine.impl.EnginePackageImpl#getImpersonationInfoSecurityTypeObject()
		 * @generated
		 */
		EDataType IMPERSONATION_INFO_SECURITY_TYPE_OBJECT = eINSTANCE.getImpersonationInfoSecurityTypeObject();

		/**
		 * The meta object literal for the '<em>Impersonation Mode Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationModeType
		 * @see org.eclipse.daanse.xmla.model.ecore.engine.impl.EnginePackageImpl#getImpersonationModeTypeObject()
		 * @generated
		 */
		EDataType IMPERSONATION_MODE_TYPE_OBJECT = eINSTANCE.getImpersonationModeTypeObject();

	}

} //EnginePackage
