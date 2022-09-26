/**
 */
package org.w3.ns.rdf;

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
 * @see org.w3.ns.rdf.RdfFactory
 * @model kind="package"
 * @generated
 */
public interface RdfPackage extends EPackage {
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
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RdfPackage eINSTANCE = org.w3.ns.rdf.impl.RdfPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.w3.ns.rdf.impl.CatalogRootImpl <em>Catalog Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.ns.rdf.impl.CatalogRootImpl
	 * @see org.w3.ns.rdf.impl.RdfPackageImpl#getCatalogRoot()
	 * @generated
	 */
	int CATALOG_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_ROOT__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_ROOT__CATALOG = 1;

	/**
	 * The feature id for the '<em><b>Catalog Record</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_ROOT__CATALOG_RECORD = 2;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_ROOT__DATASET = 3;

	/**
	 * The feature id for the '<em><b>Data Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_ROOT__DATA_SERVICE = 4;

	/**
	 * The number of structural features of the '<em>Catalog Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_ROOT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Catalog Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3.ns.rdf.impl.DateLiteralImpl <em>Date Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.ns.rdf.impl.DateLiteralImpl
	 * @see org.w3.ns.rdf.impl.RdfPackageImpl#getDateLiteral()
	 * @generated
	 */
	int DATE_LITERAL = 1;

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
	 * The meta object id for the '{@link org.w3.ns.rdf.impl.DateOrDateTimeLiteralImpl <em>Date Or Date Time Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.ns.rdf.impl.DateOrDateTimeLiteralImpl
	 * @see org.w3.ns.rdf.impl.RdfPackageImpl#getDateOrDateTimeLiteral()
	 * @generated
	 */
	int DATE_OR_DATE_TIME_LITERAL = 2;

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
	 * The meta object id for the '{@link org.w3.ns.rdf.impl.DateTimeLiteralImpl <em>Date Time Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.ns.rdf.impl.DateTimeLiteralImpl
	 * @see org.w3.ns.rdf.impl.RdfPackageImpl#getDateTimeLiteral()
	 * @generated
	 */
	int DATE_TIME_LITERAL = 3;

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
	 * The meta object id for the '{@link org.w3.ns.rdf.impl.ObjectTypeImpl <em>Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.ns.rdf.impl.ObjectTypeImpl
	 * @see org.w3.ns.rdf.impl.RdfPackageImpl#getObjectType()
	 * @generated
	 */
	int OBJECT_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__DATATYPE = 1;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__RESOURCE = 2;

	/**
	 * The number of structural features of the '<em>Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3.ns.rdf.impl.PlainLiteralImpl <em>Plain Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.ns.rdf.impl.PlainLiteralImpl
	 * @see org.w3.ns.rdf.impl.RdfPackageImpl#getPlainLiteral()
	 * @generated
	 */
	int PLAIN_LITERAL = 5;

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
	 * The meta object id for the '{@link org.w3.ns.rdf.impl.PredicateTypeImpl <em>Predicate Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.ns.rdf.impl.PredicateTypeImpl
	 * @see org.w3.ns.rdf.impl.RdfPackageImpl#getPredicateType()
	 * @generated
	 */
	int PREDICATE_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_TYPE__RESOURCE = 0;

	/**
	 * The number of structural features of the '<em>Predicate Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Predicate Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3.ns.rdf.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.ns.rdf.impl.ResourceImpl
	 * @see org.w3.ns.rdf.impl.RdfPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 7;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__RESOURCE = 0;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3.ns.rdf.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.ns.rdf.impl.StatementImpl
	 * @see org.w3.ns.rdf.impl.RdfPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 8;

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
	 * The meta object id for the '{@link org.w3.ns.rdf.impl.StatementTypeImpl <em>Statement Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.ns.rdf.impl.StatementTypeImpl
	 * @see org.w3.ns.rdf.impl.RdfPackageImpl#getStatementType()
	 * @generated
	 */
	int STATEMENT_TYPE = 9;

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
	 * The meta object id for the '{@link org.w3.ns.rdf.impl.SubjectTypeImpl <em>Subject Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.ns.rdf.impl.SubjectTypeImpl
	 * @see org.w3.ns.rdf.impl.RdfPackageImpl#getSubjectType()
	 * @generated
	 */
	int SUBJECT_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_TYPE__RESOURCE = 0;

	/**
	 * The number of structural features of the '<em>Subject Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Subject Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3.ns.rdf.impl.TypedLiteralImpl <em>Typed Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.ns.rdf.impl.TypedLiteralImpl
	 * @see org.w3.ns.rdf.impl.RdfPackageImpl#getTypedLiteral()
	 * @generated
	 */
	int TYPED_LITERAL = 11;

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
	 * The meta object id for the '{@link org.w3.ns.rdf.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.ns.rdf.impl.DocumentRootImpl
	 * @see org.w3.ns.rdf.impl.RdfPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 12;

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
	 * The feature id for the '<em><b>RDF</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RDF = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TYPE = 4;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABOUT = 5;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATATYPE = 6;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NODE_ID = 7;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESOURCE = 8;

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
	 * The meta object id for the '{@link org.w3.ns.rdf.DatatypeType <em>Datatype Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.ns.rdf.DatatypeType
	 * @see org.w3.ns.rdf.impl.RdfPackageImpl#getDatatypeType()
	 * @generated
	 */
	int DATATYPE_TYPE = 13;

	/**
	 * The meta object id for the '<em>Datatype Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.ns.rdf.DatatypeType
	 * @see org.w3.ns.rdf.impl.RdfPackageImpl#getDatatypeTypeObject()
	 * @generated
	 */
	int DATATYPE_TYPE_OBJECT = 14;

	/**
	 * The meta object id for the '<em>Date Or Date Time</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see org.w3.ns.rdf.impl.RdfPackageImpl#getDateOrDateTime()
	 * @generated
	 */
	int DATE_OR_DATE_TIME = 15;


	/**
	 * Returns the meta object for class '{@link org.w3.ns.rdf.CatalogRoot <em>Catalog Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalog Root</em>'.
	 * @see org.w3.ns.rdf.CatalogRoot
	 * @generated
	 */
	EClass getCatalogRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3.ns.rdf.CatalogRoot#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.w3.ns.rdf.CatalogRoot#getGroup()
	 * @see #getCatalogRoot()
	 * @generated
	 */
	EAttribute getCatalogRoot_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.ns.rdf.CatalogRoot#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Catalog</em>'.
	 * @see org.w3.ns.rdf.CatalogRoot#getCatalog()
	 * @see #getCatalogRoot()
	 * @generated
	 */
	EReference getCatalogRoot_Catalog();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.ns.rdf.CatalogRoot#getCatalogRecord <em>Catalog Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Catalog Record</em>'.
	 * @see org.w3.ns.rdf.CatalogRoot#getCatalogRecord()
	 * @see #getCatalogRoot()
	 * @generated
	 */
	EReference getCatalogRoot_CatalogRecord();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.ns.rdf.CatalogRoot#getDataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dataset</em>'.
	 * @see org.w3.ns.rdf.CatalogRoot#getDataset()
	 * @see #getCatalogRoot()
	 * @generated
	 */
	EReference getCatalogRoot_Dataset();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.ns.rdf.CatalogRoot#getDataService <em>Data Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Service</em>'.
	 * @see org.w3.ns.rdf.CatalogRoot#getDataService()
	 * @see #getCatalogRoot()
	 * @generated
	 */
	EReference getCatalogRoot_DataService();

	/**
	 * Returns the meta object for class '{@link org.w3.ns.rdf.DateLiteral <em>Date Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Literal</em>'.
	 * @see org.w3.ns.rdf.DateLiteral
	 * @generated
	 */
	EClass getDateLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.ns.rdf.DateLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.w3.ns.rdf.DateLiteral#getValue()
	 * @see #getDateLiteral()
	 * @generated
	 */
	EAttribute getDateLiteral_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.ns.rdf.DateLiteral#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datatype</em>'.
	 * @see org.w3.ns.rdf.DateLiteral#getDatatype()
	 * @see #getDateLiteral()
	 * @generated
	 */
	EAttribute getDateLiteral_Datatype();

	/**
	 * Returns the meta object for class '{@link org.w3.ns.rdf.DateOrDateTimeLiteral <em>Date Or Date Time Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Or Date Time Literal</em>'.
	 * @see org.w3.ns.rdf.DateOrDateTimeLiteral
	 * @generated
	 */
	EClass getDateOrDateTimeLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.ns.rdf.DateOrDateTimeLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.w3.ns.rdf.DateOrDateTimeLiteral#getValue()
	 * @see #getDateOrDateTimeLiteral()
	 * @generated
	 */
	EAttribute getDateOrDateTimeLiteral_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.ns.rdf.DateOrDateTimeLiteral#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datatype</em>'.
	 * @see org.w3.ns.rdf.DateOrDateTimeLiteral#getDatatype()
	 * @see #getDateOrDateTimeLiteral()
	 * @generated
	 */
	EAttribute getDateOrDateTimeLiteral_Datatype();

	/**
	 * Returns the meta object for class '{@link org.w3.ns.rdf.DateTimeLiteral <em>Date Time Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time Literal</em>'.
	 * @see org.w3.ns.rdf.DateTimeLiteral
	 * @generated
	 */
	EClass getDateTimeLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.ns.rdf.DateTimeLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.w3.ns.rdf.DateTimeLiteral#getValue()
	 * @see #getDateTimeLiteral()
	 * @generated
	 */
	EAttribute getDateTimeLiteral_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.ns.rdf.DateTimeLiteral#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datatype</em>'.
	 * @see org.w3.ns.rdf.DateTimeLiteral#getDatatype()
	 * @see #getDateTimeLiteral()
	 * @generated
	 */
	EAttribute getDateTimeLiteral_Datatype();

	/**
	 * Returns the meta object for class '{@link org.w3.ns.rdf.ObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Type</em>'.
	 * @see org.w3.ns.rdf.ObjectType
	 * @generated
	 */
	EClass getObjectType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.ns.rdf.ObjectType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.w3.ns.rdf.ObjectType#getValue()
	 * @see #getObjectType()
	 * @generated
	 */
	EAttribute getObjectType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.ns.rdf.ObjectType#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datatype</em>'.
	 * @see org.w3.ns.rdf.ObjectType#getDatatype()
	 * @see #getObjectType()
	 * @generated
	 */
	EAttribute getObjectType_Datatype();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.ns.rdf.ObjectType#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource</em>'.
	 * @see org.w3.ns.rdf.ObjectType#getResource()
	 * @see #getObjectType()
	 * @generated
	 */
	EAttribute getObjectType_Resource();

	/**
	 * Returns the meta object for class '{@link org.w3.ns.rdf.PlainLiteral <em>Plain Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plain Literal</em>'.
	 * @see org.w3.ns.rdf.PlainLiteral
	 * @generated
	 */
	EClass getPlainLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.ns.rdf.PlainLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.w3.ns.rdf.PlainLiteral#getValue()
	 * @see #getPlainLiteral()
	 * @generated
	 */
	EAttribute getPlainLiteral_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.ns.rdf.PlainLiteral#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.w3.ns.rdf.PlainLiteral#getLang()
	 * @see #getPlainLiteral()
	 * @generated
	 */
	EAttribute getPlainLiteral_Lang();

	/**
	 * Returns the meta object for class '{@link org.w3.ns.rdf.PredicateType <em>Predicate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate Type</em>'.
	 * @see org.w3.ns.rdf.PredicateType
	 * @generated
	 */
	EClass getPredicateType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.ns.rdf.PredicateType#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource</em>'.
	 * @see org.w3.ns.rdf.PredicateType#getResource()
	 * @see #getPredicateType()
	 * @generated
	 */
	EAttribute getPredicateType_Resource();

	/**
	 * Returns the meta object for class '{@link org.w3.ns.rdf.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see org.w3.ns.rdf.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.ns.rdf.Resource#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource</em>'.
	 * @see org.w3.ns.rdf.Resource#getResource()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Resource();

	/**
	 * Returns the meta object for class '{@link org.w3.ns.rdf.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see org.w3.ns.rdf.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.ns.rdf.Statement#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statement</em>'.
	 * @see org.w3.ns.rdf.Statement#getStatement()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_Statement();

	/**
	 * Returns the meta object for class '{@link org.w3.ns.rdf.StatementType <em>Statement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Type</em>'.
	 * @see org.w3.ns.rdf.StatementType
	 * @generated
	 */
	EClass getStatementType();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.ns.rdf.StatementType#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subject</em>'.
	 * @see org.w3.ns.rdf.StatementType#getSubject()
	 * @see #getStatementType()
	 * @generated
	 */
	EReference getStatementType_Subject();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.ns.rdf.StatementType#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Predicate</em>'.
	 * @see org.w3.ns.rdf.StatementType#getPredicate()
	 * @see #getStatementType()
	 * @generated
	 */
	EReference getStatementType_Predicate();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.ns.rdf.StatementType#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see org.w3.ns.rdf.StatementType#getObject()
	 * @see #getStatementType()
	 * @generated
	 */
	EReference getStatementType_Object();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.ns.rdf.StatementType#getAbout <em>About</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>About</em>'.
	 * @see org.w3.ns.rdf.StatementType#getAbout()
	 * @see #getStatementType()
	 * @generated
	 */
	EAttribute getStatementType_About();

	/**
	 * Returns the meta object for class '{@link org.w3.ns.rdf.SubjectType <em>Subject Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subject Type</em>'.
	 * @see org.w3.ns.rdf.SubjectType
	 * @generated
	 */
	EClass getSubjectType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.ns.rdf.SubjectType#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource</em>'.
	 * @see org.w3.ns.rdf.SubjectType#getResource()
	 * @see #getSubjectType()
	 * @generated
	 */
	EAttribute getSubjectType_Resource();

	/**
	 * Returns the meta object for class '{@link org.w3.ns.rdf.TypedLiteral <em>Typed Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Literal</em>'.
	 * @see org.w3.ns.rdf.TypedLiteral
	 * @generated
	 */
	EClass getTypedLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.ns.rdf.TypedLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.w3.ns.rdf.TypedLiteral#getValue()
	 * @see #getTypedLiteral()
	 * @generated
	 */
	EAttribute getTypedLiteral_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.ns.rdf.TypedLiteral#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datatype</em>'.
	 * @see org.w3.ns.rdf.TypedLiteral#getDatatype()
	 * @see #getTypedLiteral()
	 * @generated
	 */
	EAttribute getTypedLiteral_Datatype();

	/**
	 * Returns the meta object for class '{@link org.w3.ns.rdf.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.w3.ns.rdf.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3.ns.rdf.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.w3.ns.rdf.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.w3.ns.rdf.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.w3.ns.rdf.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.w3.ns.rdf.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.w3.ns.rdf.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.ns.rdf.DocumentRoot#getRDF <em>RDF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>RDF</em>'.
	 * @see org.w3.ns.rdf.DocumentRoot#getRDF()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RDF();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.ns.rdf.DocumentRoot#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.w3.ns.rdf.DocumentRoot#getType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.ns.rdf.DocumentRoot#getAbout <em>About</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>About</em>'.
	 * @see org.w3.ns.rdf.DocumentRoot#getAbout()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_About();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.ns.rdf.DocumentRoot#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datatype</em>'.
	 * @see org.w3.ns.rdf.DocumentRoot#getDatatype()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Datatype();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.ns.rdf.DocumentRoot#getNodeID <em>Node ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node ID</em>'.
	 * @see org.w3.ns.rdf.DocumentRoot#getNodeID()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_NodeID();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.ns.rdf.DocumentRoot#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource</em>'.
	 * @see org.w3.ns.rdf.DocumentRoot#getResource()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Resource();

	/**
	 * Returns the meta object for enum '{@link org.w3.ns.rdf.DatatypeType <em>Datatype Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Datatype Type</em>'.
	 * @see org.w3.ns.rdf.DatatypeType
	 * @generated
	 */
	EEnum getDatatypeType();

	/**
	 * Returns the meta object for data type '{@link org.w3.ns.rdf.DatatypeType <em>Datatype Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Datatype Type Object</em>'.
	 * @see org.w3.ns.rdf.DatatypeType
	 * @model instanceClass="org.w3.ns.rdf.DatatypeType"
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
		 * The meta object literal for the '{@link org.w3.ns.rdf.impl.CatalogRootImpl <em>Catalog Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.ns.rdf.impl.CatalogRootImpl
		 * @see org.w3.ns.rdf.impl.RdfPackageImpl#getCatalogRoot()
		 * @generated
		 */
		EClass CATALOG_ROOT = eINSTANCE.getCatalogRoot();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_ROOT__GROUP = eINSTANCE.getCatalogRoot_Group();

		/**
		 * The meta object literal for the '<em><b>Catalog</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG_ROOT__CATALOG = eINSTANCE.getCatalogRoot_Catalog();

		/**
		 * The meta object literal for the '<em><b>Catalog Record</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG_ROOT__CATALOG_RECORD = eINSTANCE.getCatalogRoot_CatalogRecord();

		/**
		 * The meta object literal for the '<em><b>Dataset</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG_ROOT__DATASET = eINSTANCE.getCatalogRoot_Dataset();

		/**
		 * The meta object literal for the '<em><b>Data Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG_ROOT__DATA_SERVICE = eINSTANCE.getCatalogRoot_DataService();

		/**
		 * The meta object literal for the '{@link org.w3.ns.rdf.impl.DateLiteralImpl <em>Date Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.ns.rdf.impl.DateLiteralImpl
		 * @see org.w3.ns.rdf.impl.RdfPackageImpl#getDateLiteral()
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
		 * The meta object literal for the '{@link org.w3.ns.rdf.impl.DateOrDateTimeLiteralImpl <em>Date Or Date Time Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.ns.rdf.impl.DateOrDateTimeLiteralImpl
		 * @see org.w3.ns.rdf.impl.RdfPackageImpl#getDateOrDateTimeLiteral()
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
		 * The meta object literal for the '{@link org.w3.ns.rdf.impl.DateTimeLiteralImpl <em>Date Time Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.ns.rdf.impl.DateTimeLiteralImpl
		 * @see org.w3.ns.rdf.impl.RdfPackageImpl#getDateTimeLiteral()
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
		 * The meta object literal for the '{@link org.w3.ns.rdf.impl.ObjectTypeImpl <em>Object Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.ns.rdf.impl.ObjectTypeImpl
		 * @see org.w3.ns.rdf.impl.RdfPackageImpl#getObjectType()
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
		 * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TYPE__RESOURCE = eINSTANCE.getObjectType_Resource();

		/**
		 * The meta object literal for the '{@link org.w3.ns.rdf.impl.PlainLiteralImpl <em>Plain Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.ns.rdf.impl.PlainLiteralImpl
		 * @see org.w3.ns.rdf.impl.RdfPackageImpl#getPlainLiteral()
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
		 * The meta object literal for the '{@link org.w3.ns.rdf.impl.PredicateTypeImpl <em>Predicate Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.ns.rdf.impl.PredicateTypeImpl
		 * @see org.w3.ns.rdf.impl.RdfPackageImpl#getPredicateType()
		 * @generated
		 */
		EClass PREDICATE_TYPE = eINSTANCE.getPredicateType();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDICATE_TYPE__RESOURCE = eINSTANCE.getPredicateType_Resource();

		/**
		 * The meta object literal for the '{@link org.w3.ns.rdf.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.ns.rdf.impl.ResourceImpl
		 * @see org.w3.ns.rdf.impl.RdfPackageImpl#getResource()
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
		 * The meta object literal for the '{@link org.w3.ns.rdf.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.ns.rdf.impl.StatementImpl
		 * @see org.w3.ns.rdf.impl.RdfPackageImpl#getStatement()
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
		 * The meta object literal for the '{@link org.w3.ns.rdf.impl.StatementTypeImpl <em>Statement Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.ns.rdf.impl.StatementTypeImpl
		 * @see org.w3.ns.rdf.impl.RdfPackageImpl#getStatementType()
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
		 * The meta object literal for the '{@link org.w3.ns.rdf.impl.SubjectTypeImpl <em>Subject Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.ns.rdf.impl.SubjectTypeImpl
		 * @see org.w3.ns.rdf.impl.RdfPackageImpl#getSubjectType()
		 * @generated
		 */
		EClass SUBJECT_TYPE = eINSTANCE.getSubjectType();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBJECT_TYPE__RESOURCE = eINSTANCE.getSubjectType_Resource();

		/**
		 * The meta object literal for the '{@link org.w3.ns.rdf.impl.TypedLiteralImpl <em>Typed Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.ns.rdf.impl.TypedLiteralImpl
		 * @see org.w3.ns.rdf.impl.RdfPackageImpl#getTypedLiteral()
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
		 * The meta object literal for the '{@link org.w3.ns.rdf.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.ns.rdf.impl.DocumentRootImpl
		 * @see org.w3.ns.rdf.impl.RdfPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>RDF</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RDF = eINSTANCE.getDocumentRoot_RDF();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TYPE = eINSTANCE.getDocumentRoot_Type();

		/**
		 * The meta object literal for the '<em><b>About</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ABOUT = eINSTANCE.getDocumentRoot_About();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DATATYPE = eINSTANCE.getDocumentRoot_Datatype();

		/**
		 * The meta object literal for the '<em><b>Node ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__NODE_ID = eINSTANCE.getDocumentRoot_NodeID();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__RESOURCE = eINSTANCE.getDocumentRoot_Resource();

		/**
		 * The meta object literal for the '{@link org.w3.ns.rdf.DatatypeType <em>Datatype Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.ns.rdf.DatatypeType
		 * @see org.w3.ns.rdf.impl.RdfPackageImpl#getDatatypeType()
		 * @generated
		 */
		EEnum DATATYPE_TYPE = eINSTANCE.getDatatypeType();

		/**
		 * The meta object literal for the '<em>Datatype Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.ns.rdf.DatatypeType
		 * @see org.w3.ns.rdf.impl.RdfPackageImpl#getDatatypeTypeObject()
		 * @generated
		 */
		EDataType DATATYPE_TYPE_OBJECT = eINSTANCE.getDatatypeTypeObject();

		/**
		 * The meta object literal for the '<em>Date Or Date Time</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.datatype.XMLGregorianCalendar
		 * @see org.w3.ns.rdf.impl.RdfPackageImpl#getDateOrDateTime()
		 * @generated
		 */
		EDataType DATE_OR_DATE_TIME = eINSTANCE.getDateOrDateTime();

	}

} //RdfPackage
