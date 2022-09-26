/**
 */
package com.xmlns.foaf.foaf;

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
 * <!-- begin-model-doc -->
 * 
 *       FOAF XML Schema (relevant parts for DCAT version 2)
 *       http://xmlns.com/foaf/0.1/
 *       Modified 2019-10-03
 *     
 * 
 *       RDF XML Schema (relevant parts for DCAT version 2)
 *       XML Schema for http://www.w3.org/1999/02/22-rdf-syntax-ns# namespace
 *       Modified 2019-10-03
 *     
 * 
 *       See http://www.w3.org/XML/1998/namespace.html and
 *       http://www.w3.org/TR/REC-xml for information about this namespace.
 * 
 *       This schema document describes the XML namespace, in a form
 *       suitable for import by other schema documents.
 * 
 *       Note that local names in this namespace are intended to be defined
 *       only by the World Wide Web Consortium or its subgroups. The
 *       following names are currently defined in this namespace and should
 *       not be used with conflicting semantics by any Working Group,
 *       specification, or document instance:
 * 
 *       base (as an attribute name): denotes an attribute whose value
 *       provides a URI to be used as the base for interpreting any
 *       relative URIs in the scope of the element on which it
 *       appears; its value is inherited. This name is reserved
 *       by virtue of its definition in the XML Base specification.
 * 
 *       lang (as an attribute name): denotes an attribute whose value
 *       is a language code for the natural language of the content of
 *       any element; its value is inherited. This name is reserved
 *       by virtue of its definition in the XML specification.
 * 
 *       space (as an attribute name): denotes an attribute whose
 *       value is a keyword indicating what whitespace processing
 *       discipline is intended for the content of the element; its
 *       value is inherited. This name is reserved by virtue of its
 *       definition in the XML specification.
 * 
 *       Father (in any context at all): denotes Jon Bosak, the chair of
 *       the original XML Working Group. This name is reserved by
 *       the following decision of the W3C XML Plenary and
 *       XML Coordination groups:
 * 
 *       In appreciation for his vision, leadership and dedication
 *       the W3C XML Plenary on this 10th day of February, 2000
 *       reserves for Jon Bosak in perpetuity the XML name
 *       xml:Father
 *     
 * This schema defines attributes and an attribute group
 *       suitable for use by
 *       schemas wishing to allow xml:base, xml:lang or xml:space attributes
 *       on elements they define.
 * 
 *       To enable this, such a schema must import this schema
 *       for the XML namespace, e.g. as follows:
 *       <schema . . .>
 *       . . .
 *       <import namespace="http://www.w3.org/XML/1998/namespace"
 *       schemaLocation="http://www.w3.org/2001/03/xml.xsd"/>
 * 
 *       Subsequently, qualified reference to any of the attributes
 *       or the group defined below will have the desired effect, e.g.
 * 
 *       <type . . .>
 *       . . .
 *       <attributeGroup ref="xml:specialAttrs"/>
 * 
 *       will define a type which will schema-validate an instance
 *       element with any of those attributes
 *     
 * In keeping with the XML Schema WG's standard versioning
 *       policy, this schema document will persist at
 *       http://www.w3.org/2001/03/xml.xsd.
 *       At the date of issue it can also be found at
 *       http://www.w3.org/2001/xml.xsd.
 *       The schema document at that URI may however change in the future,
 *       in order to remain compatible with the latest version of XML Schema
 *       itself. In other words, if the XML Schema namespace changes, the version
 *       of this document at
 *       http://www.w3.org/2001/xml.xsd will change
 *       accordingly; the version at
 *       http://www.w3.org/2001/03/xml.xsd will not change.
 *     
 * 
 *       DCAT version 2 XML Schema
 *       XML Schema for http://www.w3.org/ns/dcat# namespace
 * 
 *       Description: This is an XML Schema for the DCAT version 2 specification.
 *       The schema is based on the one used by GeoNetwork for storing GeoNetwork data internally.
 *       The schema adheres to a 'normalized' RDF/XML syntax that can be processed with good old XML Technology (XPath,
 *       XSLT, XQuery).
 *       The schema is not intended to be used outside GeoNetwork.
 * 
 *       Created 2019-10-03 / Author PW
 *     
 * 
 *       DCterms XML Schema (relevant parts for DCAT version 2)
 *       XML Schema for http://purl.org/dc/terms/ namespace
 *       updated 2019-10-03
 *       By PW
 *     
 * 
 *       SKOS XML Schema
 *       http://www.w3.org/2004/02/skos/core#
 *     
 * <!-- end-model-doc -->
 * @see com.xmlns.foaf.foaf.FoafFactory
 * @model kind="package"
 * @generated
 */
public interface FoafPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "foaf";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://xmlns.com/foaf/0.1/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "foaf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FoafPackage eINSTANCE = com.xmlns.foaf.foaf.impl.FoafPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.xmlns.foaf.foaf.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.xmlns.foaf.foaf.impl.AgentImpl
	 * @see com.xmlns.foaf.foaf.impl.FoafPackageImpl#getAgent()
	 * @generated
	 */
	int AGENT = 0;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__AGENT = 0;

	/**
	 * The number of structural features of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.xmlns.foaf.foaf.impl.AgentTypeImpl <em>Agent Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.xmlns.foaf.foaf.impl.AgentTypeImpl
	 * @see com.xmlns.foaf.foaf.impl.FoafPackageImpl#getAgentType()
	 * @generated
	 */
	int AGENT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_TYPE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_TYPE__PHONE = 2;

	/**
	 * The feature id for the '<em><b>Mbox</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_TYPE__MBOX = 3;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_TYPE__ABOUT = 4;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_TYPE__NODE_ID = 5;

	/**
	 * The number of structural features of the '<em>Agent Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Agent Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.xmlns.foaf.foaf.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.xmlns.foaf.foaf.impl.DocumentImpl
	 * @see com.xmlns.foaf.foaf.impl.FoafPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 2;

	/**
	 * The feature id for the '<em><b>Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__DOCUMENT = 0;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.xmlns.foaf.foaf.impl.DocumentTypeImpl <em>Document Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.xmlns.foaf.foaf.impl.DocumentTypeImpl
	 * @see com.xmlns.foaf.foaf.impl.FoafPackageImpl#getDocumentType()
	 * @generated
	 */
	int DOCUMENT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__ABOUT = 1;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__NODE_ID = 2;

	/**
	 * The number of structural features of the '<em>Document Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Document Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.xmlns.foaf.foaf.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.xmlns.foaf.foaf.impl.DocumentRootImpl
	 * @see com.xmlns.foaf.foaf.impl.FoafPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 4;

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
	 * The feature id for the '<em><b>Homepage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HOMEPAGE = 3;

	/**
	 * The feature id for the '<em><b>Mbox</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MBOX = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NAME = 5;

	/**
	 * The feature id for the '<em><b>Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PAGE = 6;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PHONE = 7;

	/**
	 * The feature id for the '<em><b>Primary Topic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PRIMARY_TOPIC = 8;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.xmlns.foaf.foaf.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent</em>'.
	 * @see com.xmlns.foaf.foaf.Agent
	 * @generated
	 */
	EClass getAgent();

	/**
	 * Returns the meta object for the containment reference '{@link com.xmlns.foaf.foaf.Agent#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Agent</em>'.
	 * @see com.xmlns.foaf.foaf.Agent#getAgent()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Agent();

	/**
	 * Returns the meta object for class '{@link com.xmlns.foaf.foaf.AgentType <em>Agent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent Type</em>'.
	 * @see com.xmlns.foaf.foaf.AgentType
	 * @generated
	 */
	EClass getAgentType();

	/**
	 * Returns the meta object for the containment reference '{@link com.xmlns.foaf.foaf.AgentType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see com.xmlns.foaf.foaf.AgentType#getName()
	 * @see #getAgentType()
	 * @generated
	 */
	EReference getAgentType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link com.xmlns.foaf.foaf.AgentType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see com.xmlns.foaf.foaf.AgentType#getType()
	 * @see #getAgentType()
	 * @generated
	 */
	EReference getAgentType_Type();

	/**
	 * Returns the meta object for the containment reference '{@link com.xmlns.foaf.foaf.AgentType#getPhone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Phone</em>'.
	 * @see com.xmlns.foaf.foaf.AgentType#getPhone()
	 * @see #getAgentType()
	 * @generated
	 */
	EReference getAgentType_Phone();

	/**
	 * Returns the meta object for the containment reference '{@link com.xmlns.foaf.foaf.AgentType#getMbox <em>Mbox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mbox</em>'.
	 * @see com.xmlns.foaf.foaf.AgentType#getMbox()
	 * @see #getAgentType()
	 * @generated
	 */
	EReference getAgentType_Mbox();

	/**
	 * Returns the meta object for the attribute '{@link com.xmlns.foaf.foaf.AgentType#getAbout <em>About</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>About</em>'.
	 * @see com.xmlns.foaf.foaf.AgentType#getAbout()
	 * @see #getAgentType()
	 * @generated
	 */
	EAttribute getAgentType_About();

	/**
	 * Returns the meta object for the attribute '{@link com.xmlns.foaf.foaf.AgentType#getNodeID <em>Node ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node ID</em>'.
	 * @see com.xmlns.foaf.foaf.AgentType#getNodeID()
	 * @see #getAgentType()
	 * @generated
	 */
	EAttribute getAgentType_NodeID();

	/**
	 * Returns the meta object for class '{@link com.xmlns.foaf.foaf.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see com.xmlns.foaf.foaf.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for the containment reference '{@link com.xmlns.foaf.foaf.Document#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Document</em>'.
	 * @see com.xmlns.foaf.foaf.Document#getDocument()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Document();

	/**
	 * Returns the meta object for class '{@link com.xmlns.foaf.foaf.DocumentType <em>Document Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Type</em>'.
	 * @see com.xmlns.foaf.foaf.DocumentType
	 * @generated
	 */
	EClass getDocumentType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.xmlns.foaf.foaf.DocumentType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Name</em>'.
	 * @see com.xmlns.foaf.foaf.DocumentType#getName()
	 * @see #getDocumentType()
	 * @generated
	 */
	EReference getDocumentType_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.xmlns.foaf.foaf.DocumentType#getAbout <em>About</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>About</em>'.
	 * @see com.xmlns.foaf.foaf.DocumentType#getAbout()
	 * @see #getDocumentType()
	 * @generated
	 */
	EAttribute getDocumentType_About();

	/**
	 * Returns the meta object for the attribute '{@link com.xmlns.foaf.foaf.DocumentType#getNodeID <em>Node ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node ID</em>'.
	 * @see com.xmlns.foaf.foaf.DocumentType#getNodeID()
	 * @see #getDocumentType()
	 * @generated
	 */
	EAttribute getDocumentType_NodeID();

	/**
	 * Returns the meta object for class '{@link com.xmlns.foaf.foaf.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see com.xmlns.foaf.foaf.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link com.xmlns.foaf.foaf.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see com.xmlns.foaf.foaf.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link com.xmlns.foaf.foaf.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see com.xmlns.foaf.foaf.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link com.xmlns.foaf.foaf.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see com.xmlns.foaf.foaf.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link com.xmlns.foaf.foaf.DocumentRoot#getHomepage <em>Homepage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Homepage</em>'.
	 * @see com.xmlns.foaf.foaf.DocumentRoot#getHomepage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Homepage();

	/**
	 * Returns the meta object for the containment reference '{@link com.xmlns.foaf.foaf.DocumentRoot#getMbox <em>Mbox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mbox</em>'.
	 * @see com.xmlns.foaf.foaf.DocumentRoot#getMbox()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Mbox();

	/**
	 * Returns the meta object for the containment reference '{@link com.xmlns.foaf.foaf.DocumentRoot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see com.xmlns.foaf.foaf.DocumentRoot#getName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Name();

	/**
	 * Returns the meta object for the containment reference '{@link com.xmlns.foaf.foaf.DocumentRoot#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Page</em>'.
	 * @see com.xmlns.foaf.foaf.DocumentRoot#getPage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Page();

	/**
	 * Returns the meta object for the containment reference '{@link com.xmlns.foaf.foaf.DocumentRoot#getPhone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Phone</em>'.
	 * @see com.xmlns.foaf.foaf.DocumentRoot#getPhone()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Phone();

	/**
	 * Returns the meta object for the containment reference '{@link com.xmlns.foaf.foaf.DocumentRoot#getPrimaryTopic <em>Primary Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primary Topic</em>'.
	 * @see com.xmlns.foaf.foaf.DocumentRoot#getPrimaryTopic()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PrimaryTopic();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FoafFactory getFoafFactory();

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
		 * The meta object literal for the '{@link com.xmlns.foaf.foaf.impl.AgentImpl <em>Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.xmlns.foaf.foaf.impl.AgentImpl
		 * @see com.xmlns.foaf.foaf.impl.FoafPackageImpl#getAgent()
		 * @generated
		 */
		EClass AGENT = eINSTANCE.getAgent();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__AGENT = eINSTANCE.getAgent_Agent();

		/**
		 * The meta object literal for the '{@link com.xmlns.foaf.foaf.impl.AgentTypeImpl <em>Agent Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.xmlns.foaf.foaf.impl.AgentTypeImpl
		 * @see com.xmlns.foaf.foaf.impl.FoafPackageImpl#getAgentType()
		 * @generated
		 */
		EClass AGENT_TYPE = eINSTANCE.getAgentType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_TYPE__NAME = eINSTANCE.getAgentType_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_TYPE__TYPE = eINSTANCE.getAgentType_Type();

		/**
		 * The meta object literal for the '<em><b>Phone</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_TYPE__PHONE = eINSTANCE.getAgentType_Phone();

		/**
		 * The meta object literal for the '<em><b>Mbox</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_TYPE__MBOX = eINSTANCE.getAgentType_Mbox();

		/**
		 * The meta object literal for the '<em><b>About</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT_TYPE__ABOUT = eINSTANCE.getAgentType_About();

		/**
		 * The meta object literal for the '<em><b>Node ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT_TYPE__NODE_ID = eINSTANCE.getAgentType_NodeID();

		/**
		 * The meta object literal for the '{@link com.xmlns.foaf.foaf.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.xmlns.foaf.foaf.impl.DocumentImpl
		 * @see com.xmlns.foaf.foaf.impl.FoafPackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '<em><b>Document</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__DOCUMENT = eINSTANCE.getDocument_Document();

		/**
		 * The meta object literal for the '{@link com.xmlns.foaf.foaf.impl.DocumentTypeImpl <em>Document Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.xmlns.foaf.foaf.impl.DocumentTypeImpl
		 * @see com.xmlns.foaf.foaf.impl.FoafPackageImpl#getDocumentType()
		 * @generated
		 */
		EClass DOCUMENT_TYPE = eINSTANCE.getDocumentType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_TYPE__NAME = eINSTANCE.getDocumentType_Name();

		/**
		 * The meta object literal for the '<em><b>About</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_TYPE__ABOUT = eINSTANCE.getDocumentType_About();

		/**
		 * The meta object literal for the '<em><b>Node ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_TYPE__NODE_ID = eINSTANCE.getDocumentType_NodeID();

		/**
		 * The meta object literal for the '{@link com.xmlns.foaf.foaf.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.xmlns.foaf.foaf.impl.DocumentRootImpl
		 * @see com.xmlns.foaf.foaf.impl.FoafPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Homepage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__HOMEPAGE = eINSTANCE.getDocumentRoot_Homepage();

		/**
		 * The meta object literal for the '<em><b>Mbox</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MBOX = eINSTANCE.getDocumentRoot_Mbox();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NAME = eINSTANCE.getDocumentRoot_Name();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PAGE = eINSTANCE.getDocumentRoot_Page();

		/**
		 * The meta object literal for the '<em><b>Phone</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PHONE = eINSTANCE.getDocumentRoot_Phone();

		/**
		 * The meta object literal for the '<em><b>Primary Topic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PRIMARY_TOPIC = eINSTANCE.getDocumentRoot_PrimaryTopic();

	}

} //FoafPackage
