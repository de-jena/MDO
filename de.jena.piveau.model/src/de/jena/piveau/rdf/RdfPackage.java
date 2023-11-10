/*
 */
package de.jena.piveau.rdf;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see de.jena.piveau.rdf.RdfFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = RdfPackage.eNS_URI, genModel = "/model/dcatap.genmodel", genModelSourceLocations = {"model/dcatap.genmodel","de.jena.piveau.model/model/dcatap.genmodel"}, ecore="/model/rdf.ecore", ecoreSourceLocations="/model/rdf.ecore")
public interface RdfPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rdf";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.w3.org/1999/02/22-rdf-syntax-ns#";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rdf";

	/**
	 * The package content type ID.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eCONTENT_TYPE = "dcat.rdf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RdfPackage eINSTANCE = de.jena.piveau.rdf.impl.RdfPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.jena.piveau.rdf.impl.DateLiteralImpl <em>Date Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.piveau.rdf.impl.DateLiteralImpl
	 * @see de.jena.piveau.rdf.impl.RdfPackageImpl#getDateLiteral()
	 * @generated
	 */
	int DATE_LITERAL = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_LITERAL__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_LITERAL__DATATYPE = 1;

	/**
	 * The number of structural features of the '<em>Date Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_LITERAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Date Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_LITERAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.piveau.rdf.impl.DateOrDateTimeLiteralImpl <em>Date Or Date Time Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.piveau.rdf.impl.DateOrDateTimeLiteralImpl
	 * @see de.jena.piveau.rdf.impl.RdfPackageImpl#getDateOrDateTimeLiteral()
	 * @generated
	 */
	int DATE_OR_DATE_TIME_LITERAL = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_OR_DATE_TIME_LITERAL__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_OR_DATE_TIME_LITERAL__DATATYPE = 1;

	/**
	 * The number of structural features of the '<em>Date Or Date Time Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_OR_DATE_TIME_LITERAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Date Or Date Time Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_OR_DATE_TIME_LITERAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.piveau.rdf.impl.DateTimeLiteralImpl <em>Date Time Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.piveau.rdf.impl.DateTimeLiteralImpl
	 * @see de.jena.piveau.rdf.impl.RdfPackageImpl#getDateTimeLiteral()
	 * @generated
	 */
	int DATE_TIME_LITERAL = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_LITERAL__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_LITERAL__DATATYPE = 1;

	/**
	 * The number of structural features of the '<em>Date Time Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_LITERAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Date Time Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_LITERAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.piveau.rdf.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.piveau.rdf.impl.ResourceImpl
	 * @see de.jena.piveau.rdf.impl.RdfPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 6;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ABOUT = 1;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.piveau.rdf.impl.ObjectTypeImpl <em>Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.piveau.rdf.impl.ObjectTypeImpl
	 * @see de.jena.piveau.rdf.impl.RdfPackageImpl#getObjectType()
	 * @generated
	 */
	int OBJECT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__RESOURCE = RESOURCE__RESOURCE;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__ABOUT = RESOURCE__ABOUT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__VALUE = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__DATATYPE = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.piveau.rdf.impl.PlainLiteralImpl <em>Plain Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.piveau.rdf.impl.PlainLiteralImpl
	 * @see de.jena.piveau.rdf.impl.RdfPackageImpl#getPlainLiteral()
	 * @generated
	 */
	int PLAIN_LITERAL = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_LITERAL__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_LITERAL__LANG = 1;

	/**
	 * The number of structural features of the '<em>Plain Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_LITERAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Plain Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_LITERAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.piveau.rdf.impl.PredicateTypeImpl <em>Predicate Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.piveau.rdf.impl.PredicateTypeImpl
	 * @see de.jena.piveau.rdf.impl.RdfPackageImpl#getPredicateType()
	 * @generated
	 */
	int PREDICATE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_TYPE__RESOURCE = RESOURCE__RESOURCE;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_TYPE__ABOUT = RESOURCE__ABOUT;

	/**
	 * The number of structural features of the '<em>Predicate Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_TYPE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Predicate Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_TYPE_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.piveau.rdf.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.piveau.rdf.impl.StatementImpl
	 * @see de.jena.piveau.rdf.impl.RdfPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 7;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__STATEMENT = 0;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.piveau.rdf.impl.StatementTypeImpl <em>Statement Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.piveau.rdf.impl.StatementTypeImpl
	 * @see de.jena.piveau.rdf.impl.RdfPackageImpl#getStatementType()
	 * @generated
	 */
	int STATEMENT_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_TYPE__SUBJECT = 0;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_TYPE__PREDICATE = 1;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_TYPE__OBJECT = 2;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_TYPE__ABOUT = 3;

	/**
	 * The number of structural features of the '<em>Statement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Statement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.piveau.rdf.impl.SubjectTypeImpl <em>Subject Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.piveau.rdf.impl.SubjectTypeImpl
	 * @see de.jena.piveau.rdf.impl.RdfPackageImpl#getSubjectType()
	 * @generated
	 */
	int SUBJECT_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_TYPE__RESOURCE = RESOURCE__RESOURCE;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_TYPE__ABOUT = RESOURCE__ABOUT;

	/**
	 * The number of structural features of the '<em>Subject Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_TYPE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Subject Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_TYPE_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.piveau.rdf.impl.TypedLiteralImpl <em>Typed Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.piveau.rdf.impl.TypedLiteralImpl
	 * @see de.jena.piveau.rdf.impl.RdfPackageImpl#getTypedLiteral()
	 * @generated
	 */
	int TYPED_LITERAL = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_LITERAL__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_LITERAL__DATATYPE = 1;

	/**
	 * The number of structural features of the '<em>Typed Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_LITERAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Typed Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_LITERAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.piveau.rdf.impl.RDFRootImpl <em>RDF Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.piveau.rdf.impl.RDFRootImpl
	 * @see de.jena.piveau.rdf.impl.RdfPackageImpl#getRDFRoot()
	 * @generated
	 */
	int RDF_ROOT = 11;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_ROOT__TYPE = 3;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_ROOT__ABOUT = 4;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_ROOT__DATATYPE = 5;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_ROOT__NODE_ID = 6;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_ROOT__RESOURCE = 7;

	/**
	 * The feature id for the '<em><b>RDF</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_ROOT__RDF = 8;

	/**
	 * The number of structural features of the '<em>RDF Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_ROOT_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>RDF Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.piveau.rdf.impl.DescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.piveau.rdf.impl.DescriptionImpl
	 * @see de.jena.piveau.rdf.impl.RdfPackageImpl#getDescription()
	 * @generated
	 */
	int DESCRIPTION = 12;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__ABOUT = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__MIXED = 1;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.piveau.rdf.DatatypeType <em>Datatype Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.piveau.rdf.DatatypeType
	 * @see de.jena.piveau.rdf.impl.RdfPackageImpl#getDatatypeType()
	 * @generated
	 */
	int DATATYPE_TYPE = 13;

	/**
	 * The meta object id for the '<em>Datatype Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.piveau.rdf.DatatypeType
	 * @see de.jena.piveau.rdf.impl.RdfPackageImpl#getDatatypeTypeObject()
	 * @generated
	 */
	int DATATYPE_TYPE_OBJECT = 14;

	/**
	 * The meta object id for the '<em>Date Or Date Time</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see de.jena.piveau.rdf.impl.RdfPackageImpl#getDateOrDateTime()
	 * @generated
	 */
	int DATE_OR_DATE_TIME = 15;


	/**
	 * Returns the meta object for class '{@link de.jena.piveau.rdf.DateLiteral <em>Date Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Literal</em>'.
	 * @see de.jena.piveau.rdf.DateLiteral
	 * @generated
	 */
	EClass getDateLiteral();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.piveau.rdf.DateLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.piveau.rdf.DateLiteral#getValue()
	 * @see #getDateLiteral()
	 * @generated
	 */
	EAttribute getDateLiteral_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.piveau.rdf.DateLiteral#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datatype</em>'.
	 * @see de.jena.piveau.rdf.DateLiteral#getDatatype()
	 * @see #getDateLiteral()
	 * @generated
	 */
	EAttribute getDateLiteral_Datatype();

	/**
	 * Returns the meta object for class '{@link de.jena.piveau.rdf.DateOrDateTimeLiteral <em>Date Or Date Time Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Or Date Time Literal</em>'.
	 * @see de.jena.piveau.rdf.DateOrDateTimeLiteral
	 * @generated
	 */
	EClass getDateOrDateTimeLiteral();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.piveau.rdf.DateOrDateTimeLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.piveau.rdf.DateOrDateTimeLiteral#getValue()
	 * @see #getDateOrDateTimeLiteral()
	 * @generated
	 */
	EAttribute getDateOrDateTimeLiteral_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.piveau.rdf.DateOrDateTimeLiteral#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datatype</em>'.
	 * @see de.jena.piveau.rdf.DateOrDateTimeLiteral#getDatatype()
	 * @see #getDateOrDateTimeLiteral()
	 * @generated
	 */
	EAttribute getDateOrDateTimeLiteral_Datatype();

	/**
	 * Returns the meta object for class '{@link de.jena.piveau.rdf.DateTimeLiteral <em>Date Time Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time Literal</em>'.
	 * @see de.jena.piveau.rdf.DateTimeLiteral
	 * @generated
	 */
	EClass getDateTimeLiteral();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.piveau.rdf.DateTimeLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.piveau.rdf.DateTimeLiteral#getValue()
	 * @see #getDateTimeLiteral()
	 * @generated
	 */
	EAttribute getDateTimeLiteral_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.piveau.rdf.DateTimeLiteral#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datatype</em>'.
	 * @see de.jena.piveau.rdf.DateTimeLiteral#getDatatype()
	 * @see #getDateTimeLiteral()
	 * @generated
	 */
	EAttribute getDateTimeLiteral_Datatype();

	/**
	 * Returns the meta object for class '{@link de.jena.piveau.rdf.ObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Type</em>'.
	 * @see de.jena.piveau.rdf.ObjectType
	 * @generated
	 */
	EClass getObjectType();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.piveau.rdf.ObjectType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.piveau.rdf.ObjectType#getValue()
	 * @see #getObjectType()
	 * @generated
	 */
	EAttribute getObjectType_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.piveau.rdf.ObjectType#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datatype</em>'.
	 * @see de.jena.piveau.rdf.ObjectType#getDatatype()
	 * @see #getObjectType()
	 * @generated
	 */
	EAttribute getObjectType_Datatype();

	/**
	 * Returns the meta object for class '{@link de.jena.piveau.rdf.PlainLiteral <em>Plain Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plain Literal</em>'.
	 * @see de.jena.piveau.rdf.PlainLiteral
	 * @generated
	 */
	EClass getPlainLiteral();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.piveau.rdf.PlainLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.piveau.rdf.PlainLiteral#getValue()
	 * @see #getPlainLiteral()
	 * @generated
	 */
	EAttribute getPlainLiteral_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.piveau.rdf.PlainLiteral#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see de.jena.piveau.rdf.PlainLiteral#getLang()
	 * @see #getPlainLiteral()
	 * @generated
	 */
	EAttribute getPlainLiteral_Lang();

	/**
	 * Returns the meta object for class '{@link de.jena.piveau.rdf.PredicateType <em>Predicate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate Type</em>'.
	 * @see de.jena.piveau.rdf.PredicateType
	 * @generated
	 */
	EClass getPredicateType();

	/**
	 * Returns the meta object for class '{@link de.jena.piveau.rdf.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see de.jena.piveau.rdf.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.piveau.rdf.Resource#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource</em>'.
	 * @see de.jena.piveau.rdf.Resource#getResource()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Resource();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.piveau.rdf.Resource#getAbout <em>About</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>About</em>'.
	 * @see de.jena.piveau.rdf.Resource#getAbout()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_About();

	/**
	 * Returns the meta object for class '{@link de.jena.piveau.rdf.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see de.jena.piveau.rdf.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.rdf.Statement#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statement</em>'.
	 * @see de.jena.piveau.rdf.Statement#getStatement()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_Statement();

	/**
	 * Returns the meta object for class '{@link de.jena.piveau.rdf.StatementType <em>Statement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Type</em>'.
	 * @see de.jena.piveau.rdf.StatementType
	 * @generated
	 */
	EClass getStatementType();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.rdf.StatementType#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subject</em>'.
	 * @see de.jena.piveau.rdf.StatementType#getSubject()
	 * @see #getStatementType()
	 * @generated
	 */
	EReference getStatementType_Subject();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.rdf.StatementType#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Predicate</em>'.
	 * @see de.jena.piveau.rdf.StatementType#getPredicate()
	 * @see #getStatementType()
	 * @generated
	 */
	EReference getStatementType_Predicate();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.rdf.StatementType#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see de.jena.piveau.rdf.StatementType#getObject()
	 * @see #getStatementType()
	 * @generated
	 */
	EReference getStatementType_Object();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.piveau.rdf.StatementType#getAbout <em>About</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>About</em>'.
	 * @see de.jena.piveau.rdf.StatementType#getAbout()
	 * @see #getStatementType()
	 * @generated
	 */
	EAttribute getStatementType_About();

	/**
	 * Returns the meta object for class '{@link de.jena.piveau.rdf.SubjectType <em>Subject Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subject Type</em>'.
	 * @see de.jena.piveau.rdf.SubjectType
	 * @generated
	 */
	EClass getSubjectType();

	/**
	 * Returns the meta object for class '{@link de.jena.piveau.rdf.TypedLiteral <em>Typed Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Literal</em>'.
	 * @see de.jena.piveau.rdf.TypedLiteral
	 * @generated
	 */
	EClass getTypedLiteral();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.piveau.rdf.TypedLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.piveau.rdf.TypedLiteral#getValue()
	 * @see #getTypedLiteral()
	 * @generated
	 */
	EAttribute getTypedLiteral_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.piveau.rdf.TypedLiteral#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datatype</em>'.
	 * @see de.jena.piveau.rdf.TypedLiteral#getDatatype()
	 * @see #getTypedLiteral()
	 * @generated
	 */
	EAttribute getTypedLiteral_Datatype();

	/**
	 * Returns the meta object for class '{@link de.jena.piveau.rdf.RDFRoot <em>RDF Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDF Root</em>'.
	 * @see de.jena.piveau.rdf.RDFRoot
	 * @generated
	 */
	EClass getRDFRoot();

	/**
	 * Returns the meta object for the attribute list '{@link de.jena.piveau.rdf.RDFRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.jena.piveau.rdf.RDFRoot#getMixed()
	 * @see #getRDFRoot()
	 * @generated
	 */
	EAttribute getRDFRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link de.jena.piveau.rdf.RDFRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see de.jena.piveau.rdf.RDFRoot#getXMLNSPrefixMap()
	 * @see #getRDFRoot()
	 * @generated
	 */
	EReference getRDFRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link de.jena.piveau.rdf.RDFRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see de.jena.piveau.rdf.RDFRoot#getXSISchemaLocation()
	 * @see #getRDFRoot()
	 * @generated
	 */
	EReference getRDFRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.rdf.RDFRoot#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see de.jena.piveau.rdf.RDFRoot#getType()
	 * @see #getRDFRoot()
	 * @generated
	 */
	EReference getRDFRoot_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.piveau.rdf.RDFRoot#getAbout <em>About</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>About</em>'.
	 * @see de.jena.piveau.rdf.RDFRoot#getAbout()
	 * @see #getRDFRoot()
	 * @generated
	 */
	EAttribute getRDFRoot_About();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.piveau.rdf.RDFRoot#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datatype</em>'.
	 * @see de.jena.piveau.rdf.RDFRoot#getDatatype()
	 * @see #getRDFRoot()
	 * @generated
	 */
	EAttribute getRDFRoot_Datatype();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.piveau.rdf.RDFRoot#getNodeID <em>Node ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node ID</em>'.
	 * @see de.jena.piveau.rdf.RDFRoot#getNodeID()
	 * @see #getRDFRoot()
	 * @generated
	 */
	EAttribute getRDFRoot_NodeID();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.piveau.rdf.RDFRoot#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource</em>'.
	 * @see de.jena.piveau.rdf.RDFRoot#getResource()
	 * @see #getRDFRoot()
	 * @generated
	 */
	EAttribute getRDFRoot_Resource();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.piveau.rdf.RDFRoot#getRDF <em>RDF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>RDF</em>'.
	 * @see de.jena.piveau.rdf.RDFRoot#getRDF()
	 * @see #getRDFRoot()
	 * @generated
	 */
	EReference getRDFRoot_RDF();

	/**
	 * Returns the meta object for class '{@link de.jena.piveau.rdf.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see de.jena.piveau.rdf.Description
	 * @generated
	 */
	EClass getDescription();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.piveau.rdf.Description#getAbout <em>About</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>About</em>'.
	 * @see de.jena.piveau.rdf.Description#getAbout()
	 * @see #getDescription()
	 * @generated
	 */
	EAttribute getDescription_About();

	/**
	 * Returns the meta object for the attribute list '{@link de.jena.piveau.rdf.Description#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.jena.piveau.rdf.Description#getMixed()
	 * @see #getDescription()
	 * @generated
	 */
	EAttribute getDescription_Mixed();

	/**
	 * Returns the meta object for enum '{@link de.jena.piveau.rdf.DatatypeType <em>Datatype Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Datatype Type</em>'.
	 * @see de.jena.piveau.rdf.DatatypeType
	 * @generated
	 */
	EEnum getDatatypeType();

	/**
	 * Returns the meta object for data type '{@link de.jena.piveau.rdf.DatatypeType <em>Datatype Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Datatype Type Object</em>'.
	 * @see de.jena.piveau.rdf.DatatypeType
	 * @model instanceClass="de.jena.piveau.rdf.DatatypeType"
	 *        extendedMetaData="name='datatype_._type:Object' baseType='datatype_._type'"
	 * @generated
	 */
	EDataType getDatatypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Date Or Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date Or Date Time</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='dateOrDateTime' memberTypes='http://www.eclipse.org/emf/2003/XMLType#date http://www.eclipse.org/emf/2003/XMLType#dateTime'"
	 * @generated
	 */
	EDataType getDateOrDateTime();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RdfFactory getRdfFactory();

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
		 * The meta object literal for the '{@link de.jena.piveau.rdf.impl.DateLiteralImpl <em>Date Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.piveau.rdf.impl.DateLiteralImpl
		 * @see de.jena.piveau.rdf.impl.RdfPackageImpl#getDateLiteral()
		 * @generated
		 */
		EClass DATE_LITERAL = eINSTANCE.getDateLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_LITERAL__VALUE = eINSTANCE.getDateLiteral_Value();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_LITERAL__DATATYPE = eINSTANCE.getDateLiteral_Datatype();

		/**
		 * The meta object literal for the '{@link de.jena.piveau.rdf.impl.DateOrDateTimeLiteralImpl <em>Date Or Date Time Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.piveau.rdf.impl.DateOrDateTimeLiteralImpl
		 * @see de.jena.piveau.rdf.impl.RdfPackageImpl#getDateOrDateTimeLiteral()
		 * @generated
		 */
		EClass DATE_OR_DATE_TIME_LITERAL = eINSTANCE.getDateOrDateTimeLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_OR_DATE_TIME_LITERAL__VALUE = eINSTANCE.getDateOrDateTimeLiteral_Value();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_OR_DATE_TIME_LITERAL__DATATYPE = eINSTANCE.getDateOrDateTimeLiteral_Datatype();

		/**
		 * The meta object literal for the '{@link de.jena.piveau.rdf.impl.DateTimeLiteralImpl <em>Date Time Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.piveau.rdf.impl.DateTimeLiteralImpl
		 * @see de.jena.piveau.rdf.impl.RdfPackageImpl#getDateTimeLiteral()
		 * @generated
		 */
		EClass DATE_TIME_LITERAL = eINSTANCE.getDateTimeLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_LITERAL__VALUE = eINSTANCE.getDateTimeLiteral_Value();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_LITERAL__DATATYPE = eINSTANCE.getDateTimeLiteral_Datatype();

		/**
		 * The meta object literal for the '{@link de.jena.piveau.rdf.impl.ObjectTypeImpl <em>Object Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.piveau.rdf.impl.ObjectTypeImpl
		 * @see de.jena.piveau.rdf.impl.RdfPackageImpl#getObjectType()
		 * @generated
		 */
		EClass OBJECT_TYPE = eINSTANCE.getObjectType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TYPE__VALUE = eINSTANCE.getObjectType_Value();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TYPE__DATATYPE = eINSTANCE.getObjectType_Datatype();

		/**
		 * The meta object literal for the '{@link de.jena.piveau.rdf.impl.PlainLiteralImpl <em>Plain Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.piveau.rdf.impl.PlainLiteralImpl
		 * @see de.jena.piveau.rdf.impl.RdfPackageImpl#getPlainLiteral()
		 * @generated
		 */
		EClass PLAIN_LITERAL = eINSTANCE.getPlainLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAIN_LITERAL__VALUE = eINSTANCE.getPlainLiteral_Value();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAIN_LITERAL__LANG = eINSTANCE.getPlainLiteral_Lang();

		/**
		 * The meta object literal for the '{@link de.jena.piveau.rdf.impl.PredicateTypeImpl <em>Predicate Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.piveau.rdf.impl.PredicateTypeImpl
		 * @see de.jena.piveau.rdf.impl.RdfPackageImpl#getPredicateType()
		 * @generated
		 */
		EClass PREDICATE_TYPE = eINSTANCE.getPredicateType();

		/**
		 * The meta object literal for the '{@link de.jena.piveau.rdf.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.piveau.rdf.impl.ResourceImpl
		 * @see de.jena.piveau.rdf.impl.RdfPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__RESOURCE = eINSTANCE.getResource_Resource();

		/**
		 * The meta object literal for the '<em><b>About</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__ABOUT = eINSTANCE.getResource_About();

		/**
		 * The meta object literal for the '{@link de.jena.piveau.rdf.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.piveau.rdf.impl.StatementImpl
		 * @see de.jena.piveau.rdf.impl.RdfPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT__STATEMENT = eINSTANCE.getStatement_Statement();

		/**
		 * The meta object literal for the '{@link de.jena.piveau.rdf.impl.StatementTypeImpl <em>Statement Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.piveau.rdf.impl.StatementTypeImpl
		 * @see de.jena.piveau.rdf.impl.RdfPackageImpl#getStatementType()
		 * @generated
		 */
		EClass STATEMENT_TYPE = eINSTANCE.getStatementType();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_TYPE__SUBJECT = eINSTANCE.getStatementType_Subject();

		/**
		 * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_TYPE__PREDICATE = eINSTANCE.getStatementType_Predicate();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_TYPE__OBJECT = eINSTANCE.getStatementType_Object();

		/**
		 * The meta object literal for the '<em><b>About</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT_TYPE__ABOUT = eINSTANCE.getStatementType_About();

		/**
		 * The meta object literal for the '{@link de.jena.piveau.rdf.impl.SubjectTypeImpl <em>Subject Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.piveau.rdf.impl.SubjectTypeImpl
		 * @see de.jena.piveau.rdf.impl.RdfPackageImpl#getSubjectType()
		 * @generated
		 */
		EClass SUBJECT_TYPE = eINSTANCE.getSubjectType();

		/**
		 * The meta object literal for the '{@link de.jena.piveau.rdf.impl.TypedLiteralImpl <em>Typed Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.piveau.rdf.impl.TypedLiteralImpl
		 * @see de.jena.piveau.rdf.impl.RdfPackageImpl#getTypedLiteral()
		 * @generated
		 */
		EClass TYPED_LITERAL = eINSTANCE.getTypedLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_LITERAL__VALUE = eINSTANCE.getTypedLiteral_Value();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_LITERAL__DATATYPE = eINSTANCE.getTypedLiteral_Datatype();

		/**
		 * The meta object literal for the '{@link de.jena.piveau.rdf.impl.RDFRootImpl <em>RDF Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.piveau.rdf.impl.RDFRootImpl
		 * @see de.jena.piveau.rdf.impl.RdfPackageImpl#getRDFRoot()
		 * @generated
		 */
		EClass RDF_ROOT = eINSTANCE.getRDFRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDF_ROOT__MIXED = eINSTANCE.getRDFRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getRDFRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getRDFRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_ROOT__TYPE = eINSTANCE.getRDFRoot_Type();

		/**
		 * The meta object literal for the '<em><b>About</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDF_ROOT__ABOUT = eINSTANCE.getRDFRoot_About();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDF_ROOT__DATATYPE = eINSTANCE.getRDFRoot_Datatype();

		/**
		 * The meta object literal for the '<em><b>Node ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDF_ROOT__NODE_ID = eINSTANCE.getRDFRoot_NodeID();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDF_ROOT__RESOURCE = eINSTANCE.getRDFRoot_Resource();

		/**
		 * The meta object literal for the '<em><b>RDF</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_ROOT__RDF = eINSTANCE.getRDFRoot_RDF();

		/**
		 * The meta object literal for the '{@link de.jena.piveau.rdf.impl.DescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.piveau.rdf.impl.DescriptionImpl
		 * @see de.jena.piveau.rdf.impl.RdfPackageImpl#getDescription()
		 * @generated
		 */
		EClass DESCRIPTION = eINSTANCE.getDescription();

		/**
		 * The meta object literal for the '<em><b>About</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION__ABOUT = eINSTANCE.getDescription_About();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION__MIXED = eINSTANCE.getDescription_Mixed();

		/**
		 * The meta object literal for the '{@link de.jena.piveau.rdf.DatatypeType <em>Datatype Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.piveau.rdf.DatatypeType
		 * @see de.jena.piveau.rdf.impl.RdfPackageImpl#getDatatypeType()
		 * @generated
		 */
		EEnum DATATYPE_TYPE = eINSTANCE.getDatatypeType();

		/**
		 * The meta object literal for the '<em>Datatype Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.piveau.rdf.DatatypeType
		 * @see de.jena.piveau.rdf.impl.RdfPackageImpl#getDatatypeTypeObject()
		 * @generated
		 */
		EDataType DATATYPE_TYPE_OBJECT = eINSTANCE.getDatatypeTypeObject();

		/**
		 * The meta object literal for the '<em>Date Or Date Time</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.datatype.XMLGregorianCalendar
		 * @see de.jena.piveau.rdf.impl.RdfPackageImpl#getDateOrDateTime()
		 * @generated
		 */
		EDataType DATE_OR_DATE_TIME = eINSTANCE.getDateOrDateTime();

	}

} //RdfPackage
