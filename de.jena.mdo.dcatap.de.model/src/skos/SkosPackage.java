/*
 */
package skos;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import org.gecko.emf.osgi.annotation.provide.EPackage;

import org.osgi.annotation.versioning.ProviderType;

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
 *       SKOS XML Schema
 *       http://www.w3.org/2004/02/skos/core#
 *     
 * 
 *       DCterms XML Schema (relevant parts for DCAT version 2)
 *       XML Schema for http://purl.org/dc/terms/ namespace
 *       updated 2019-10-03
 *       By PW
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
 * <!-- end-model-doc -->
 * @see skos.SkosFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = SkosPackage.eNS_URI, genModel = "/model/dcatap.genmodel", genModelSourceLocations = {"model/dcatap.genmodel","de.jena.mdo.dcatap.de.model/model/dcatap.genmodel"}, ecore="/model/skos.ecore", ecoreSourceLocations="/model/skos.ecore")
public interface SkosPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "skos";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.w3.org/2004/02/skos/core#";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "skos";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SkosPackage eINSTANCE = skos.impl.SkosPackageImpl.init();

	/**
	 * The meta object id for the '{@link skos.impl.ConceptImpl <em>Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see skos.impl.ConceptImpl
	 * @see skos.impl.SkosPackageImpl#getConcept()
	 * @generated
	 */
	int CONCEPT = 0;

	/**
	 * The feature id for the '<em><b>Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__CONCEPT = 0;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__RESOURCE = 1;

	/**
	 * The number of structural features of the '<em>Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link skos.impl.ConceptSchemeImpl <em>Concept Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see skos.impl.ConceptSchemeImpl
	 * @see skos.impl.SkosPackageImpl#getConceptScheme()
	 * @generated
	 */
	int CONCEPT_SCHEME = 1;

	/**
	 * The feature id for the '<em><b>Concept Scheme</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_SCHEME__CONCEPT_SCHEME = 0;

	/**
	 * The number of structural features of the '<em>Concept Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_SCHEME_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Concept Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_SCHEME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link skos.impl.ConceptSchemeTypeImpl <em>Concept Scheme Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see skos.impl.ConceptSchemeTypeImpl
	 * @see skos.impl.SkosPackageImpl#getConceptSchemeType()
	 * @generated
	 */
	int CONCEPT_SCHEME_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_SCHEME_TYPE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_SCHEME_TYPE__ABOUT = 1;

	/**
	 * The number of structural features of the '<em>Concept Scheme Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_SCHEME_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Concept Scheme Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_SCHEME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link skos.impl.ConceptTypeImpl <em>Concept Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see skos.impl.ConceptTypeImpl
	 * @see skos.impl.SkosPackageImpl#getConceptType()
	 * @generated
	 */
	int CONCEPT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_TYPE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Pref Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_TYPE__PREF_LABEL = 1;

	/**
	 * The feature id for the '<em><b>In Scheme</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_TYPE__IN_SCHEME = 2;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_TYPE__ABOUT = 3;

	/**
	 * The number of structural features of the '<em>Concept Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Concept Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link skos.impl.InSchemeTypeImpl <em>In Scheme Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see skos.impl.InSchemeTypeImpl
	 * @see skos.impl.SkosPackageImpl#getInSchemeType()
	 * @generated
	 */
	int IN_SCHEME_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_SCHEME_TYPE__RESOURCE = 0;

	/**
	 * The number of structural features of the '<em>In Scheme Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_SCHEME_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>In Scheme Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_SCHEME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link skos.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see skos.impl.DocumentRootImpl
	 * @see skos.impl.SkosPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 5;

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
	 * The feature id for the '<em><b>Notation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NOTATION = 3;

	/**
	 * The feature id for the '<em><b>Pref Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PREF_LABEL = 4;

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
	 * Returns the meta object for class '{@link skos.Concept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept</em>'.
	 * @see skos.Concept
	 * @generated
	 */
	EClass getConcept();

	/**
	 * Returns the meta object for the containment reference '{@link skos.Concept#getConcept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Concept</em>'.
	 * @see skos.Concept#getConcept()
	 * @see #getConcept()
	 * @generated
	 */
	EReference getConcept_Concept();

	/**
	 * Returns the meta object for the attribute '{@link skos.Concept#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource</em>'.
	 * @see skos.Concept#getResource()
	 * @see #getConcept()
	 * @generated
	 */
	EAttribute getConcept_Resource();

	/**
	 * Returns the meta object for class '{@link skos.ConceptScheme <em>Concept Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept Scheme</em>'.
	 * @see skos.ConceptScheme
	 * @generated
	 */
	EClass getConceptScheme();

	/**
	 * Returns the meta object for the containment reference '{@link skos.ConceptScheme#getConceptScheme <em>Concept Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Concept Scheme</em>'.
	 * @see skos.ConceptScheme#getConceptScheme()
	 * @see #getConceptScheme()
	 * @generated
	 */
	EReference getConceptScheme_ConceptScheme();

	/**
	 * Returns the meta object for class '{@link skos.ConceptSchemeType <em>Concept Scheme Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept Scheme Type</em>'.
	 * @see skos.ConceptSchemeType
	 * @generated
	 */
	EClass getConceptSchemeType();

	/**
	 * Returns the meta object for the containment reference '{@link skos.ConceptSchemeType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see skos.ConceptSchemeType#getTitle()
	 * @see #getConceptSchemeType()
	 * @generated
	 */
	EReference getConceptSchemeType_Title();

	/**
	 * Returns the meta object for the attribute '{@link skos.ConceptSchemeType#getAbout <em>About</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>About</em>'.
	 * @see skos.ConceptSchemeType#getAbout()
	 * @see #getConceptSchemeType()
	 * @generated
	 */
	EAttribute getConceptSchemeType_About();

	/**
	 * Returns the meta object for class '{@link skos.ConceptType <em>Concept Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept Type</em>'.
	 * @see skos.ConceptType
	 * @generated
	 */
	EClass getConceptType();

	/**
	 * Returns the meta object for the containment reference list '{@link skos.ConceptType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type</em>'.
	 * @see skos.ConceptType#getType()
	 * @see #getConceptType()
	 * @generated
	 */
	EReference getConceptType_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link skos.ConceptType#getPrefLabel <em>Pref Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pref Label</em>'.
	 * @see skos.ConceptType#getPrefLabel()
	 * @see #getConceptType()
	 * @generated
	 */
	EReference getConceptType_PrefLabel();

	/**
	 * Returns the meta object for the containment reference '{@link skos.ConceptType#getInScheme <em>In Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>In Scheme</em>'.
	 * @see skos.ConceptType#getInScheme()
	 * @see #getConceptType()
	 * @generated
	 */
	EReference getConceptType_InScheme();

	/**
	 * Returns the meta object for the attribute '{@link skos.ConceptType#getAbout <em>About</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>About</em>'.
	 * @see skos.ConceptType#getAbout()
	 * @see #getConceptType()
	 * @generated
	 */
	EAttribute getConceptType_About();

	/**
	 * Returns the meta object for class '{@link skos.InSchemeType <em>In Scheme Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Scheme Type</em>'.
	 * @see skos.InSchemeType
	 * @generated
	 */
	EClass getInSchemeType();

	/**
	 * Returns the meta object for the attribute '{@link skos.InSchemeType#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource</em>'.
	 * @see skos.InSchemeType#getResource()
	 * @see #getInSchemeType()
	 * @generated
	 */
	EAttribute getInSchemeType_Resource();

	/**
	 * Returns the meta object for class '{@link skos.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see skos.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link skos.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see skos.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link skos.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see skos.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link skos.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see skos.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link skos.DocumentRoot#getNotation <em>Notation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Notation</em>'.
	 * @see skos.DocumentRoot#getNotation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Notation();

	/**
	 * Returns the meta object for the containment reference '{@link skos.DocumentRoot#getPrefLabel <em>Pref Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pref Label</em>'.
	 * @see skos.DocumentRoot#getPrefLabel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PrefLabel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SkosFactory getSkosFactory();

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
		 * The meta object literal for the '{@link skos.impl.ConceptImpl <em>Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see skos.impl.ConceptImpl
		 * @see skos.impl.SkosPackageImpl#getConcept()
		 * @generated
		 */
		EClass CONCEPT = eINSTANCE.getConcept();

		/**
		 * The meta object literal for the '<em><b>Concept</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT__CONCEPT = eINSTANCE.getConcept_Concept();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCEPT__RESOURCE = eINSTANCE.getConcept_Resource();

		/**
		 * The meta object literal for the '{@link skos.impl.ConceptSchemeImpl <em>Concept Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see skos.impl.ConceptSchemeImpl
		 * @see skos.impl.SkosPackageImpl#getConceptScheme()
		 * @generated
		 */
		EClass CONCEPT_SCHEME = eINSTANCE.getConceptScheme();

		/**
		 * The meta object literal for the '<em><b>Concept Scheme</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT_SCHEME__CONCEPT_SCHEME = eINSTANCE.getConceptScheme_ConceptScheme();

		/**
		 * The meta object literal for the '{@link skos.impl.ConceptSchemeTypeImpl <em>Concept Scheme Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see skos.impl.ConceptSchemeTypeImpl
		 * @see skos.impl.SkosPackageImpl#getConceptSchemeType()
		 * @generated
		 */
		EClass CONCEPT_SCHEME_TYPE = eINSTANCE.getConceptSchemeType();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT_SCHEME_TYPE__TITLE = eINSTANCE.getConceptSchemeType_Title();

		/**
		 * The meta object literal for the '<em><b>About</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCEPT_SCHEME_TYPE__ABOUT = eINSTANCE.getConceptSchemeType_About();

		/**
		 * The meta object literal for the '{@link skos.impl.ConceptTypeImpl <em>Concept Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see skos.impl.ConceptTypeImpl
		 * @see skos.impl.SkosPackageImpl#getConceptType()
		 * @generated
		 */
		EClass CONCEPT_TYPE = eINSTANCE.getConceptType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT_TYPE__TYPE = eINSTANCE.getConceptType_Type();

		/**
		 * The meta object literal for the '<em><b>Pref Label</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT_TYPE__PREF_LABEL = eINSTANCE.getConceptType_PrefLabel();

		/**
		 * The meta object literal for the '<em><b>In Scheme</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT_TYPE__IN_SCHEME = eINSTANCE.getConceptType_InScheme();

		/**
		 * The meta object literal for the '<em><b>About</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCEPT_TYPE__ABOUT = eINSTANCE.getConceptType_About();

		/**
		 * The meta object literal for the '{@link skos.impl.InSchemeTypeImpl <em>In Scheme Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see skos.impl.InSchemeTypeImpl
		 * @see skos.impl.SkosPackageImpl#getInSchemeType()
		 * @generated
		 */
		EClass IN_SCHEME_TYPE = eINSTANCE.getInSchemeType();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IN_SCHEME_TYPE__RESOURCE = eINSTANCE.getInSchemeType_Resource();

		/**
		 * The meta object literal for the '{@link skos.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see skos.impl.DocumentRootImpl
		 * @see skos.impl.SkosPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Notation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NOTATION = eINSTANCE.getDocumentRoot_Notation();

		/**
		 * The meta object literal for the '<em><b>Pref Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PREF_LABEL = eINSTANCE.getDocumentRoot_PrefLabel();

	}

} //SkosPackage
