/**
 */
package org.eclipse.daanse.xmla.model.ecore.ext;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.eclipse.daanse.xmla.model.ecore.ext.ExtFactory
 * @model kind="package"
 *        annotation="https://jakarta.ee/xml/ns/jaxb version='3.0'"
 * @generated
 */
public interface ExtPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ext";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schemas.microsoft.com/analysisservices/2003/ext";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ext";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExtPackage eINSTANCE = org.eclipse.daanse.xmla.model.ecore.ext.impl.ExtPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.ext.impl.AuthenticateResponseTypeImpl <em>Authenticate Response Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.ext.impl.AuthenticateResponseTypeImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.ext.impl.ExtPackageImpl#getAuthenticateResponseType()
	 * @generated
	 */
	int AUTHENTICATE_RESPONSE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATE_RESPONSE_TYPE__RETURN = 0;

	/**
	 * The number of structural features of the '<em>Authenticate Response Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATE_RESPONSE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Authenticate Response Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATE_RESPONSE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.ext.impl.AuthenticateTypeImpl <em>Authenticate Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.ext.impl.AuthenticateTypeImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.ext.impl.ExtPackageImpl#getAuthenticateType()
	 * @generated
	 */
	int AUTHENTICATE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Sspi Handshake</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATE_TYPE__SSPI_HANDSHAKE = 0;

	/**
	 * The number of structural features of the '<em>Authenticate Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Authenticate Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.ext.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.ext.impl.DocumentRootImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.ext.impl.ExtPackageImpl#getDocumentRoot()
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
	 * The feature id for the '<em><b>Authenticate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUTHENTICATE = 3;

	/**
	 * The feature id for the '<em><b>Authenticate Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUTHENTICATE_RESPONSE = 4;

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
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.ext.impl.ReturnTypeImpl <em>Return Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.ext.impl.ReturnTypeImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.ext.impl.ExtPackageImpl#getReturnType()
	 * @generated
	 */
	int RETURN_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Sspi Handshake</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE__SSPI_HANDSHAKE = 0;

	/**
	 * The number of structural features of the '<em>Return Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Return Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.ext.AuthenticateResponseType <em>Authenticate Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authenticate Response Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.ext.AuthenticateResponseType
	 * @generated
	 */
	EClass getAuthenticateResponseType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.ext.AuthenticateResponseType#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.ext.AuthenticateResponseType#getReturn()
	 * @see #getAuthenticateResponseType()
	 * @generated
	 */
	EReference getAuthenticateResponseType_Return();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.ext.AuthenticateType <em>Authenticate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authenticate Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.ext.AuthenticateType
	 * @generated
	 */
	EClass getAuthenticateType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.ext.AuthenticateType#getSspiHandshake <em>Sspi Handshake</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sspi Handshake</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.ext.AuthenticateType#getSspiHandshake()
	 * @see #getAuthenticateType()
	 * @generated
	 */
	EAttribute getAuthenticateType_SspiHandshake();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.ext.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.ext.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.daanse.xmla.model.ecore.ext.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.ext.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.daanse.xmla.model.ecore.ext.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.ext.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.daanse.xmla.model.ecore.ext.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.ext.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.ext.DocumentRoot#getAuthenticate <em>Authenticate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Authenticate</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.ext.DocumentRoot#getAuthenticate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Authenticate();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.ext.DocumentRoot#getAuthenticateResponse <em>Authenticate Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Authenticate Response</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.ext.DocumentRoot#getAuthenticateResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AuthenticateResponse();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.ext.ReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.ext.ReturnType
	 * @generated
	 */
	EClass getReturnType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.ext.ReturnType#getSspiHandshake <em>Sspi Handshake</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sspi Handshake</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.ext.ReturnType#getSspiHandshake()
	 * @see #getReturnType()
	 * @generated
	 */
	EAttribute getReturnType_SspiHandshake();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExtFactory getExtFactory();

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
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.ext.impl.AuthenticateResponseTypeImpl <em>Authenticate Response Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.ext.impl.AuthenticateResponseTypeImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.ext.impl.ExtPackageImpl#getAuthenticateResponseType()
		 * @generated
		 */
		EClass AUTHENTICATE_RESPONSE_TYPE = eINSTANCE.getAuthenticateResponseType();

		/**
		 * The meta object literal for the '<em><b>Return</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHENTICATE_RESPONSE_TYPE__RETURN = eINSTANCE.getAuthenticateResponseType_Return();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.ext.impl.AuthenticateTypeImpl <em>Authenticate Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.ext.impl.AuthenticateTypeImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.ext.impl.ExtPackageImpl#getAuthenticateType()
		 * @generated
		 */
		EClass AUTHENTICATE_TYPE = eINSTANCE.getAuthenticateType();

		/**
		 * The meta object literal for the '<em><b>Sspi Handshake</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATE_TYPE__SSPI_HANDSHAKE = eINSTANCE.getAuthenticateType_SspiHandshake();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.ext.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.ext.impl.DocumentRootImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.ext.impl.ExtPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Authenticate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__AUTHENTICATE = eINSTANCE.getDocumentRoot_Authenticate();

		/**
		 * The meta object literal for the '<em><b>Authenticate Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__AUTHENTICATE_RESPONSE = eINSTANCE.getDocumentRoot_AuthenticateResponse();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.ext.impl.ReturnTypeImpl <em>Return Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.ext.impl.ReturnTypeImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.ext.impl.ExtPackageImpl#getReturnType()
		 * @generated
		 */
		EClass RETURN_TYPE = eINSTANCE.getReturnType();

		/**
		 * The meta object literal for the '<em><b>Sspi Handshake</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_TYPE__SSPI_HANDSHAKE = eINSTANCE.getReturnType_SspiHandshake();

	}

} //ExtPackage
