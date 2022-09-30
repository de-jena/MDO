/**
 */
package org.w3.ns.dcat;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.w3.ns.rdf.RdfPackage;

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
 *       SKOS XML Schema
 *       http://www.w3.org/2004/02/skos/core#
 *     
 * 
 *       FOAF XML Schema (relevant parts for DCAT version 2)
 *       http://xmlns.com/foaf/0.1/
 *       Modified 2019-10-03
 *     
 * 
 *       ISA Location XML Schema
 *       http://www.w3.org/ns/locn#
 *       Updated 2019-10-03
 *     
 * 
 *       VCARD XML Schema
 *       http://www.w3.org/2006/vcard/ns#
 *       Modified 2019-10-03
 *     
 * 
 *       ODRL XML Schema (relevant parts for DCAT version 2)
 *       http://www.w3.org/ns/odrl/2/
 *       Modified 2019-10-03
 *     
 * 
 *       PROV XML Schema (relevant parts for DCAT version 2)
 *       http://www.w3.org/ns/prov#
 *       Modified 2019-10-03
 *     
 * 
 *       ADMS XML Schema (relevant parts for DCAT version 2)
 *       http://www.w3.org/ns/adms#
 *       Modified 2019-10-03
 *     
 * <!-- end-model-doc -->
 * @see org.w3.ns.dcat.DcatFactory
 * @model kind="package"
 * @generated
 */
public interface DcatPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dcat";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.w3.org/ns/dcat#";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dcat";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DcatPackage eINSTANCE = org.w3.ns.dcat.impl.DcatPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.w3.ns.dcat.impl.CatalogImpl <em>Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.ns.dcat.impl.CatalogImpl
	 * @see org.w3.ns.dcat.impl.DcatPackageImpl#getCatalog()
	 * @generated
	 */
	int CATALOG = 0;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__CATALOG = 0;

	/**
	 * The number of structural features of the '<em>Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3.ns.dcat.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.ns.dcat.impl.ResourceTypeImpl
	 * @see org.w3.ns.dcat.impl.DcatPackageImpl#getResourceType()
	 * @generated
	 */
	int RESOURCE_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Theme</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__THEME = 3;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__KEYWORD = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__TYPE = 5;

	/**
	 * The feature id for the '<em><b>Contact Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__CONTACT_POINT = 6;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__CREATOR = 7;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__PUBLISHER = 8;

	/**
	 * The feature id for the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__ISSUED = 9;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__MODIFIED = 10;

	/**
	 * The feature id for the '<em><b>Landing Page</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__LANDING_PAGE = 11;

	/**
	 * The feature id for the '<em><b>Access Rights</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__ACCESS_RIGHTS = 12;

	/**
	 * The feature id for the '<em><b>Conforms To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__CONFORMS_TO = 13;

	/**
	 * The feature id for the '<em><b>License</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__LICENSE = 14;

	/**
	 * The feature id for the '<em><b>Rights</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__RIGHTS = 15;

	/**
	 * The feature id for the '<em><b>Has Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__HAS_POLICY = 16;

	/**
	 * The feature id for the '<em><b>Qualified Attribution</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__QUALIFIED_ATTRIBUTION = 17;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__RELATION = 18;

	/**
	 * The feature id for the '<em><b>Qualified Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__QUALIFIED_RELATION = 19;

	/**
	 * The feature id for the '<em><b>Is Referenced By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__IS_REFERENCED_BY = 20;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__LANGUAGE = 21;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__ABOUT = 22;

	/**
	 * The number of structural features of the '<em>Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_FEATURE_COUNT = 23;

	/**
	 * The number of operations of the '<em>Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3.ns.dcat.impl.DatasetTypeImpl <em>Dataset Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.ns.dcat.impl.DatasetTypeImpl
	 * @see org.w3.ns.dcat.impl.DcatPackageImpl#getDatasetType()
	 * @generated
	 */
	int DATASET_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__IDENTIFIER = RESOURCE_TYPE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__TITLE = RESOURCE_TYPE__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__DESCRIPTION = RESOURCE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Theme</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__THEME = RESOURCE_TYPE__THEME;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__KEYWORD = RESOURCE_TYPE__KEYWORD;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__TYPE = RESOURCE_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Contact Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__CONTACT_POINT = RESOURCE_TYPE__CONTACT_POINT;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__CREATOR = RESOURCE_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__PUBLISHER = RESOURCE_TYPE__PUBLISHER;

	/**
	 * The feature id for the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__ISSUED = RESOURCE_TYPE__ISSUED;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__MODIFIED = RESOURCE_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Landing Page</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__LANDING_PAGE = RESOURCE_TYPE__LANDING_PAGE;

	/**
	 * The feature id for the '<em><b>Access Rights</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__ACCESS_RIGHTS = RESOURCE_TYPE__ACCESS_RIGHTS;

	/**
	 * The feature id for the '<em><b>Conforms To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__CONFORMS_TO = RESOURCE_TYPE__CONFORMS_TO;

	/**
	 * The feature id for the '<em><b>License</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__LICENSE = RESOURCE_TYPE__LICENSE;

	/**
	 * The feature id for the '<em><b>Rights</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__RIGHTS = RESOURCE_TYPE__RIGHTS;

	/**
	 * The feature id for the '<em><b>Has Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__HAS_POLICY = RESOURCE_TYPE__HAS_POLICY;

	/**
	 * The feature id for the '<em><b>Qualified Attribution</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__QUALIFIED_ATTRIBUTION = RESOURCE_TYPE__QUALIFIED_ATTRIBUTION;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__RELATION = RESOURCE_TYPE__RELATION;

	/**
	 * The feature id for the '<em><b>Qualified Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__QUALIFIED_RELATION = RESOURCE_TYPE__QUALIFIED_RELATION;

	/**
	 * The feature id for the '<em><b>Is Referenced By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__IS_REFERENCED_BY = RESOURCE_TYPE__IS_REFERENCED_BY;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__LANGUAGE = RESOURCE_TYPE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__ABOUT = RESOURCE_TYPE__ABOUT;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__DISTRIBUTION = RESOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Spatial Resolution In Meters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__SPATIAL_RESOLUTION_IN_METERS = RESOURCE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Temporal Resolution</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__TEMPORAL_RESOLUTION = RESOURCE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Accrual Periodicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__ACCRUAL_PERIODICITY = RESOURCE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Spatial</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__SPATIAL = RESOURCE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__TEMPORAL = RESOURCE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Was Generated By</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__WAS_GENERATED_BY = RESOURCE_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Contributor Id</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__CONTRIBUTOR_ID = RESOURCE_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Dataset Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE_FEATURE_COUNT = RESOURCE_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Dataset Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE_OPERATION_COUNT = RESOURCE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3.ns.dcat.impl.Catalog1Impl <em>Catalog1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.ns.dcat.impl.Catalog1Impl
	 * @see org.w3.ns.dcat.impl.DcatPackageImpl#getCatalog1()
	 * @generated
	 */
	int CATALOG1 = 1;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG1__IDENTIFIER = DATASET_TYPE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG1__TITLE = DATASET_TYPE__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG1__DESCRIPTION = DATASET_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Theme</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG1__THEME = DATASET_TYPE__THEME;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG1__KEYWORD = DATASET_TYPE__KEYWORD;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG1__TYPE = DATASET_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Contact Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG1__CONTACT_POINT = DATASET_TYPE__CONTACT_POINT;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG1__CREATOR = DATASET_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG1__PUBLISHER = DATASET_TYPE__PUBLISHER;

	/**
	 * The feature id for the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG1__ISSUED = DATASET_TYPE__ISSUED;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG1__MODIFIED = DATASET_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Landing Page</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG1__LANDING_PAGE = DATASET_TYPE__LANDING_PAGE;

	/**
	 * The feature id for the '<em><b>Access Rights</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG1__ACCESS_RIGHTS = DATASET_TYPE__ACCESS_RIGHTS;

	/**
	 * The feature id for the '<em><b>Conforms To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG1__CONFORMS_TO = DATASET_TYPE__CONFORMS_TO;

	/**
	 * The feature id for the '<em><b>License</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG1__LICENSE = DATASET_TYPE__LICENSE;

	/**
	 * The feature id for the '<em><b>Rights</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG1__RIGHTS = DATASET_TYPE__RIGHTS;

	/**
	 * The feature id for the '<em><b>Has Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG1__HAS_POLICY = DATASET_TYPE__HAS_POLICY;

	/**
	 * The feature id for the '<em><b>Qualified Attribution</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG1__QUALIFIED_ATTRIBUTION = DATASET_TYPE__QUALIFIED_ATTRIBUTION;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG1__RELATION = DATASET_TYPE__RELATION;

	/**
	 * The feature id for the '<em><b>Qualified Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG1__QUALIFIED_RELATION = DATASET_TYPE__QUALIFIED_RELATION;

	/**
	 * The feature id for the '<em><b>Is Referenced By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG1__IS_REFERENCED_BY = DATASET_TYPE__IS_REFERENCED_BY;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG1__LANGUAGE = DATASET_TYPE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG1__ABOUT = DATASET_TYPE__ABOUT;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG1__DISTRIBUTION = DATASET_TYPE__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Spatial Resolution In Meters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG1__SPATIAL_RESOLUTION_IN_METERS = DATASET_TYPE__SPATIAL_RESOLUTION_IN_METERS;

	/**
	 * The feature id for the '<em><b>Temporal Resolution</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG1__TEMPORAL_RESOLUTION = DATASET_TYPE__TEMPORAL_RESOLUTION;

	/**
	 * The feature id for the '<em><b>Accrual Periodicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG1__ACCRUAL_PERIODICITY = DATASET_TYPE__ACCRUAL_PERIODICITY;

	/**
	 * The feature id for the '<em><b>Spatial</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG1__SPATIAL = DATASET_TYPE__SPATIAL;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG1__TEMPORAL = DATASET_TYPE__TEMPORAL;

	/**
	 * The feature id for the '<em><b>Was Generated By</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG1__WAS_GENERATED_BY = DATASET_TYPE__WAS_GENERATED_BY;

	/**
	 * The feature id for the '<em><b>Contributor Id</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG1__CONTRIBUTOR_ID = DATASET_TYPE__CONTRIBUTOR_ID;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG1__CATALOG = DATASET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Record</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG1__RECORD = DATASET_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG1__DATASET = DATASET_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG1__SERVICE = DATASET_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Theme Taxonomy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG1__THEME_TAXONOMY = DATASET_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Has Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG1__HAS_PART = DATASET_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Homepage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG1__HOMEPAGE = DATASET_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Catalog1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG1_FEATURE_COUNT = DATASET_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Catalog1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG1_OPERATION_COUNT = DATASET_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3.ns.dcat.impl.CatalogRecordImpl <em>Catalog Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.ns.dcat.impl.CatalogRecordImpl
	 * @see org.w3.ns.dcat.impl.DcatPackageImpl#getCatalogRecord()
	 * @generated
	 */
	int CATALOG_RECORD = 2;

	/**
	 * The feature id for the '<em><b>Catalog Record</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RECORD__CATALOG_RECORD = 0;

	/**
	 * The number of structural features of the '<em>Catalog Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RECORD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Catalog Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RECORD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3.ns.dcat.impl.CatalogRecordTypeImpl <em>Catalog Record Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.ns.dcat.impl.CatalogRecordTypeImpl
	 * @see org.w3.ns.dcat.impl.DcatPackageImpl#getCatalogRecordType()
	 * @generated
	 */
	int CATALOG_RECORD_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RECORD_TYPE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RECORD_TYPE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RECORD_TYPE__ISSUED = 2;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RECORD_TYPE__MODIFIED = 3;

	/**
	 * The feature id for the '<em><b>Primary Topic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RECORD_TYPE__PRIMARY_TOPIC = 4;

	/**
	 * The feature id for the '<em><b>Conforms To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RECORD_TYPE__CONFORMS_TO = 5;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RECORD_TYPE__LANGUAGE = 6;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RECORD_TYPE__ABOUT = 7;

	/**
	 * The number of structural features of the '<em>Catalog Record Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RECORD_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Catalog Record Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RECORD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3.ns.dcat.impl.DataServiceTypeImpl <em>Data Service Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.ns.dcat.impl.DataServiceTypeImpl
	 * @see org.w3.ns.dcat.impl.DcatPackageImpl#getDataServiceType()
	 * @generated
	 */
	int DATA_SERVICE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE_TYPE__IDENTIFIER = RESOURCE_TYPE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE_TYPE__TITLE = RESOURCE_TYPE__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE_TYPE__DESCRIPTION = RESOURCE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Theme</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE_TYPE__THEME = RESOURCE_TYPE__THEME;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE_TYPE__KEYWORD = RESOURCE_TYPE__KEYWORD;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE_TYPE__TYPE = RESOURCE_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Contact Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE_TYPE__CONTACT_POINT = RESOURCE_TYPE__CONTACT_POINT;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE_TYPE__CREATOR = RESOURCE_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE_TYPE__PUBLISHER = RESOURCE_TYPE__PUBLISHER;

	/**
	 * The feature id for the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE_TYPE__ISSUED = RESOURCE_TYPE__ISSUED;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE_TYPE__MODIFIED = RESOURCE_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Landing Page</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE_TYPE__LANDING_PAGE = RESOURCE_TYPE__LANDING_PAGE;

	/**
	 * The feature id for the '<em><b>Access Rights</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE_TYPE__ACCESS_RIGHTS = RESOURCE_TYPE__ACCESS_RIGHTS;

	/**
	 * The feature id for the '<em><b>Conforms To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE_TYPE__CONFORMS_TO = RESOURCE_TYPE__CONFORMS_TO;

	/**
	 * The feature id for the '<em><b>License</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE_TYPE__LICENSE = RESOURCE_TYPE__LICENSE;

	/**
	 * The feature id for the '<em><b>Rights</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE_TYPE__RIGHTS = RESOURCE_TYPE__RIGHTS;

	/**
	 * The feature id for the '<em><b>Has Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE_TYPE__HAS_POLICY = RESOURCE_TYPE__HAS_POLICY;

	/**
	 * The feature id for the '<em><b>Qualified Attribution</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE_TYPE__QUALIFIED_ATTRIBUTION = RESOURCE_TYPE__QUALIFIED_ATTRIBUTION;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE_TYPE__RELATION = RESOURCE_TYPE__RELATION;

	/**
	 * The feature id for the '<em><b>Qualified Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE_TYPE__QUALIFIED_RELATION = RESOURCE_TYPE__QUALIFIED_RELATION;

	/**
	 * The feature id for the '<em><b>Is Referenced By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE_TYPE__IS_REFERENCED_BY = RESOURCE_TYPE__IS_REFERENCED_BY;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE_TYPE__LANGUAGE = RESOURCE_TYPE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE_TYPE__ABOUT = RESOURCE_TYPE__ABOUT;

	/**
	 * The feature id for the '<em><b>Endpoint Description</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE_TYPE__ENDPOINT_DESCRIPTION = RESOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Endpoint URL</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE_TYPE__ENDPOINT_URL = RESOURCE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Serves Dataset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE_TYPE__SERVES_DATASET = RESOURCE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Service Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE_TYPE_FEATURE_COUNT = RESOURCE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Data Service Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE_TYPE_OPERATION_COUNT = RESOURCE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3.ns.dcat.impl.DatasetImpl <em>Dataset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.ns.dcat.impl.DatasetImpl
	 * @see org.w3.ns.dcat.impl.DcatPackageImpl#getDataset()
	 * @generated
	 */
	int DATASET = 5;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__DATASET = 0;

	/**
	 * The number of structural features of the '<em>Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3.ns.dcat.impl.DistributionImpl <em>Distribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.ns.dcat.impl.DistributionImpl
	 * @see org.w3.ns.dcat.impl.DcatPackageImpl#getDistribution()
	 * @generated
	 */
	int DISTRIBUTION = 7;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__DISTRIBUTION = 0;

	/**
	 * The number of structural features of the '<em>Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3.ns.dcat.impl.DistributionTypeImpl <em>Distribution Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.ns.dcat.impl.DistributionTypeImpl
	 * @see org.w3.ns.dcat.impl.DcatPackageImpl#getDistributionType()
	 * @generated
	 */
	int DISTRIBUTION_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TYPE__RESOURCE = RdfPackage.RESOURCE__RESOURCE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TYPE__TITLE = RdfPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TYPE__DESCRIPTION = RdfPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Access Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TYPE__ACCESS_SERVICE = RdfPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Access URL</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TYPE__ACCESS_URL = RdfPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Download URL</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TYPE__DOWNLOAD_URL = RdfPackage.RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TYPE__FORMAT = RdfPackage.RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Media Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TYPE__MEDIA_TYPE = RdfPackage.RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Package Format</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TYPE__PACKAGE_FORMAT = RdfPackage.RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Byte Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TYPE__BYTE_SIZE = RdfPackage.RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Compress Format</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TYPE__COMPRESS_FORMAT = RdfPackage.RESOURCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Spatial Resolution In Meters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TYPE__SPATIAL_RESOLUTION_IN_METERS = RdfPackage.RESOURCE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Temporal Resolution</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TYPE__TEMPORAL_RESOLUTION = RdfPackage.RESOURCE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Access Rights</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TYPE__ACCESS_RIGHTS = RdfPackage.RESOURCE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>License</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TYPE__LICENSE = RdfPackage.RESOURCE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Conforms To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TYPE__CONFORMS_TO = RdfPackage.RESOURCE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Rights</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TYPE__RIGHTS = RdfPackage.RESOURCE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Has Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TYPE__HAS_POLICY = RdfPackage.RESOURCE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TYPE__ISSUED = RdfPackage.RESOURCE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TYPE__MODIFIED = RdfPackage.RESOURCE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TYPE__ABOUT = RdfPackage.RESOURCE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TYPE__NODE_ID = RdfPackage.RESOURCE_FEATURE_COUNT + 20;

	/**
	 * The number of structural features of the '<em>Distribution Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TYPE_FEATURE_COUNT = RdfPackage.RESOURCE_FEATURE_COUNT + 21;

	/**
	 * The number of operations of the '<em>Distribution Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_TYPE_OPERATION_COUNT = RdfPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3.ns.dcat.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.ns.dcat.impl.DocumentRootImpl
	 * @see org.w3.ns.dcat.impl.DcatPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 9;

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
	 * The feature id for the '<em><b>Catalog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CATALOG = 3;

	/**
	 * The feature id for the '<em><b>Catalog Record</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CATALOG_RECORD = 4;

	/**
	 * The feature id for the '<em><b>Data Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA_SERVICE = 5;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATASET = 6;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3.ns.dcat.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.ns.dcat.impl.RelationshipImpl
	 * @see org.w3.ns.dcat.impl.DcatPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 10;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__RELATIONSHIP = 0;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3.ns.dcat.impl.RelationshipTypeImpl <em>Relationship Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.ns.dcat.impl.RelationshipTypeImpl
	 * @see org.w3.ns.dcat.impl.DcatPackageImpl#getRelationshipType()
	 * @generated
	 */
	int RELATIONSHIP_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Had Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__HAD_ROLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__ABOUT = 2;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__NODE_ID = 3;

	/**
	 * The number of structural features of the '<em>Relationship Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Relationship Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3.ns.dcat.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.ns.dcat.impl.ServiceImpl
	 * @see org.w3.ns.dcat.impl.DcatPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 13;

	/**
	 * The feature id for the '<em><b>Data Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DATA_SERVICE = 0;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.w3.ns.dcat.Catalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalog</em>'.
	 * @see org.w3.ns.dcat.Catalog
	 * @generated
	 */
	EClass getCatalog();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.ns.dcat.Catalog#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Catalog</em>'.
	 * @see org.w3.ns.dcat.Catalog#getCatalog()
	 * @see #getCatalog()
	 * @generated
	 */
	EReference getCatalog_Catalog();

	/**
	 * Returns the meta object for class '{@link org.w3.ns.dcat.Catalog1 <em>Catalog1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalog1</em>'.
	 * @see org.w3.ns.dcat.Catalog1
	 * @generated
	 */
	EClass getCatalog1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.ns.dcat.Catalog1#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Catalog</em>'.
	 * @see org.w3.ns.dcat.Catalog1#getCatalog()
	 * @see #getCatalog1()
	 * @generated
	 */
	EReference getCatalog1_Catalog();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.ns.dcat.Catalog1#getRecord <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Record</em>'.
	 * @see org.w3.ns.dcat.Catalog1#getRecord()
	 * @see #getCatalog1()
	 * @generated
	 */
	EReference getCatalog1_Record();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.ns.dcat.Catalog1#getDataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dataset</em>'.
	 * @see org.w3.ns.dcat.Catalog1#getDataset()
	 * @see #getCatalog1()
	 * @generated
	 */
	EReference getCatalog1_Dataset();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.ns.dcat.Catalog1#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service</em>'.
	 * @see org.w3.ns.dcat.Catalog1#getService()
	 * @see #getCatalog1()
	 * @generated
	 */
	EReference getCatalog1_Service();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.ns.dcat.Catalog1#getThemeTaxonomy <em>Theme Taxonomy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Theme Taxonomy</em>'.
	 * @see org.w3.ns.dcat.Catalog1#getThemeTaxonomy()
	 * @see #getCatalog1()
	 * @generated
	 */
	EReference getCatalog1_ThemeTaxonomy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.ns.dcat.Catalog1#getHasPart <em>Has Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Part</em>'.
	 * @see org.w3.ns.dcat.Catalog1#getHasPart()
	 * @see #getCatalog1()
	 * @generated
	 */
	EReference getCatalog1_HasPart();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.ns.dcat.Catalog1#getHomepage <em>Homepage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Homepage</em>'.
	 * @see org.w3.ns.dcat.Catalog1#getHomepage()
	 * @see #getCatalog1()
	 * @generated
	 */
	EReference getCatalog1_Homepage();

	/**
	 * Returns the meta object for class '{@link org.w3.ns.dcat.CatalogRecord <em>Catalog Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalog Record</em>'.
	 * @see org.w3.ns.dcat.CatalogRecord
	 * @generated
	 */
	EClass getCatalogRecord();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.ns.dcat.CatalogRecord#getCatalogRecord <em>Catalog Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Catalog Record</em>'.
	 * @see org.w3.ns.dcat.CatalogRecord#getCatalogRecord()
	 * @see #getCatalogRecord()
	 * @generated
	 */
	EReference getCatalogRecord_CatalogRecord();

	/**
	 * Returns the meta object for class '{@link org.w3.ns.dcat.CatalogRecordType <em>Catalog Record Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalog Record Type</em>'.
	 * @see org.w3.ns.dcat.CatalogRecordType
	 * @generated
	 */
	EClass getCatalogRecordType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.ns.dcat.CatalogRecordType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Title</em>'.
	 * @see org.w3.ns.dcat.CatalogRecordType#getTitle()
	 * @see #getCatalogRecordType()
	 * @generated
	 */
	EReference getCatalogRecordType_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.ns.dcat.CatalogRecordType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.w3.ns.dcat.CatalogRecordType#getDescription()
	 * @see #getCatalogRecordType()
	 * @generated
	 */
	EReference getCatalogRecordType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.ns.dcat.CatalogRecordType#getIssued <em>Issued</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Issued</em>'.
	 * @see org.w3.ns.dcat.CatalogRecordType#getIssued()
	 * @see #getCatalogRecordType()
	 * @generated
	 */
	EReference getCatalogRecordType_Issued();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.ns.dcat.CatalogRecordType#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Modified</em>'.
	 * @see org.w3.ns.dcat.CatalogRecordType#getModified()
	 * @see #getCatalogRecordType()
	 * @generated
	 */
	EReference getCatalogRecordType_Modified();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.ns.dcat.CatalogRecordType#getPrimaryTopic <em>Primary Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primary Topic</em>'.
	 * @see org.w3.ns.dcat.CatalogRecordType#getPrimaryTopic()
	 * @see #getCatalogRecordType()
	 * @generated
	 */
	EReference getCatalogRecordType_PrimaryTopic();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.ns.dcat.CatalogRecordType#getConformsTo <em>Conforms To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conforms To</em>'.
	 * @see org.w3.ns.dcat.CatalogRecordType#getConformsTo()
	 * @see #getCatalogRecordType()
	 * @generated
	 */
	EReference getCatalogRecordType_ConformsTo();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.ns.dcat.CatalogRecordType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Language</em>'.
	 * @see org.w3.ns.dcat.CatalogRecordType#getLanguage()
	 * @see #getCatalogRecordType()
	 * @generated
	 */
	EReference getCatalogRecordType_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.ns.dcat.CatalogRecordType#getAbout <em>About</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>About</em>'.
	 * @see org.w3.ns.dcat.CatalogRecordType#getAbout()
	 * @see #getCatalogRecordType()
	 * @generated
	 */
	EAttribute getCatalogRecordType_About();

	/**
	 * Returns the meta object for class '{@link org.w3.ns.dcat.DataServiceType <em>Data Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Service Type</em>'.
	 * @see org.w3.ns.dcat.DataServiceType
	 * @generated
	 */
	EClass getDataServiceType();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3.ns.dcat.DataServiceType#getEndpointDescription <em>Endpoint Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Endpoint Description</em>'.
	 * @see org.w3.ns.dcat.DataServiceType#getEndpointDescription()
	 * @see #getDataServiceType()
	 * @generated
	 */
	EAttribute getDataServiceType_EndpointDescription();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3.ns.dcat.DataServiceType#getEndpointURL <em>Endpoint URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Endpoint URL</em>'.
	 * @see org.w3.ns.dcat.DataServiceType#getEndpointURL()
	 * @see #getDataServiceType()
	 * @generated
	 */
	EAttribute getDataServiceType_EndpointURL();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.ns.dcat.DataServiceType#getServesDataset <em>Serves Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Serves Dataset</em>'.
	 * @see org.w3.ns.dcat.DataServiceType#getServesDataset()
	 * @see #getDataServiceType()
	 * @generated
	 */
	EReference getDataServiceType_ServesDataset();

	/**
	 * Returns the meta object for class '{@link org.w3.ns.dcat.Dataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dataset</em>'.
	 * @see org.w3.ns.dcat.Dataset
	 * @generated
	 */
	EClass getDataset();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.ns.dcat.Dataset#getDataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dataset</em>'.
	 * @see org.w3.ns.dcat.Dataset#getDataset()
	 * @see #getDataset()
	 * @generated
	 */
	EReference getDataset_Dataset();

	/**
	 * Returns the meta object for class '{@link org.w3.ns.dcat.DatasetType <em>Dataset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dataset Type</em>'.
	 * @see org.w3.ns.dcat.DatasetType
	 * @generated
	 */
	EClass getDatasetType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.ns.dcat.DatasetType#getDistribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Distribution</em>'.
	 * @see org.w3.ns.dcat.DatasetType#getDistribution()
	 * @see #getDatasetType()
	 * @generated
	 */
	EReference getDatasetType_Distribution();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3.ns.dcat.DatasetType#getSpatialResolutionInMeters <em>Spatial Resolution In Meters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Spatial Resolution In Meters</em>'.
	 * @see org.w3.ns.dcat.DatasetType#getSpatialResolutionInMeters()
	 * @see #getDatasetType()
	 * @generated
	 */
	EAttribute getDatasetType_SpatialResolutionInMeters();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3.ns.dcat.DatasetType#getTemporalResolution <em>Temporal Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Temporal Resolution</em>'.
	 * @see org.w3.ns.dcat.DatasetType#getTemporalResolution()
	 * @see #getDatasetType()
	 * @generated
	 */
	EAttribute getDatasetType_TemporalResolution();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.ns.dcat.DatasetType#getAccrualPeriodicity <em>Accrual Periodicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Accrual Periodicity</em>'.
	 * @see org.w3.ns.dcat.DatasetType#getAccrualPeriodicity()
	 * @see #getDatasetType()
	 * @generated
	 */
	EReference getDatasetType_AccrualPeriodicity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.ns.dcat.DatasetType#getSpatial <em>Spatial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spatial</em>'.
	 * @see org.w3.ns.dcat.DatasetType#getSpatial()
	 * @see #getDatasetType()
	 * @generated
	 */
	EReference getDatasetType_Spatial();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.ns.dcat.DatasetType#getTemporal <em>Temporal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Temporal</em>'.
	 * @see org.w3.ns.dcat.DatasetType#getTemporal()
	 * @see #getDatasetType()
	 * @generated
	 */
	EReference getDatasetType_Temporal();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3.ns.dcat.DatasetType#getWasGeneratedBy <em>Was Generated By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Was Generated By</em>'.
	 * @see org.w3.ns.dcat.DatasetType#getWasGeneratedBy()
	 * @see #getDatasetType()
	 * @generated
	 */
	EAttribute getDatasetType_WasGeneratedBy();

	/**
	 * Returns the meta object for the reference list '{@link org.w3.ns.dcat.DatasetType#getContributorId <em>Contributor Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contributor Id</em>'.
	 * @see org.w3.ns.dcat.DatasetType#getContributorId()
	 * @see #getDatasetType()
	 * @generated
	 */
	EReference getDatasetType_ContributorId();

	/**
	 * Returns the meta object for class '{@link org.w3.ns.dcat.Distribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distribution</em>'.
	 * @see org.w3.ns.dcat.Distribution
	 * @generated
	 */
	EClass getDistribution();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.ns.dcat.Distribution#getDistribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distribution</em>'.
	 * @see org.w3.ns.dcat.Distribution#getDistribution()
	 * @see #getDistribution()
	 * @generated
	 */
	EReference getDistribution_Distribution();

	/**
	 * Returns the meta object for class '{@link org.w3.ns.dcat.DistributionType <em>Distribution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distribution Type</em>'.
	 * @see org.w3.ns.dcat.DistributionType
	 * @generated
	 */
	EClass getDistributionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.ns.dcat.DistributionType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see org.w3.ns.dcat.DistributionType#getTitle()
	 * @see #getDistributionType()
	 * @generated
	 */
	EReference getDistributionType_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.ns.dcat.DistributionType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.w3.ns.dcat.DistributionType#getDescription()
	 * @see #getDistributionType()
	 * @generated
	 */
	EReference getDistributionType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.ns.dcat.DistributionType#getAccessService <em>Access Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Access Service</em>'.
	 * @see org.w3.ns.dcat.DistributionType#getAccessService()
	 * @see #getDistributionType()
	 * @generated
	 */
	EReference getDistributionType_AccessService();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3.ns.dcat.DistributionType#getAccessURL <em>Access URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Access URL</em>'.
	 * @see org.w3.ns.dcat.DistributionType#getAccessURL()
	 * @see #getDistributionType()
	 * @generated
	 */
	EAttribute getDistributionType_AccessURL();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3.ns.dcat.DistributionType#getDownloadURL <em>Download URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Download URL</em>'.
	 * @see org.w3.ns.dcat.DistributionType#getDownloadURL()
	 * @see #getDistributionType()
	 * @generated
	 */
	EAttribute getDistributionType_DownloadURL();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.ns.dcat.DistributionType#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Format</em>'.
	 * @see org.w3.ns.dcat.DistributionType#getFormat()
	 * @see #getDistributionType()
	 * @generated
	 */
	EReference getDistributionType_Format();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3.ns.dcat.DistributionType#getMediaType <em>Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Media Type</em>'.
	 * @see org.w3.ns.dcat.DistributionType#getMediaType()
	 * @see #getDistributionType()
	 * @generated
	 */
	EAttribute getDistributionType_MediaType();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3.ns.dcat.DistributionType#getPackageFormat <em>Package Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Package Format</em>'.
	 * @see org.w3.ns.dcat.DistributionType#getPackageFormat()
	 * @see #getDistributionType()
	 * @generated
	 */
	EAttribute getDistributionType_PackageFormat();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3.ns.dcat.DistributionType#getByteSize <em>Byte Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Byte Size</em>'.
	 * @see org.w3.ns.dcat.DistributionType#getByteSize()
	 * @see #getDistributionType()
	 * @generated
	 */
	EAttribute getDistributionType_ByteSize();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.ns.dcat.DistributionType#getCompressFormat <em>Compress Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compress Format</em>'.
	 * @see org.w3.ns.dcat.DistributionType#getCompressFormat()
	 * @see #getDistributionType()
	 * @generated
	 */
	EReference getDistributionType_CompressFormat();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3.ns.dcat.DistributionType#getSpatialResolutionInMeters <em>Spatial Resolution In Meters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Spatial Resolution In Meters</em>'.
	 * @see org.w3.ns.dcat.DistributionType#getSpatialResolutionInMeters()
	 * @see #getDistributionType()
	 * @generated
	 */
	EAttribute getDistributionType_SpatialResolutionInMeters();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3.ns.dcat.DistributionType#getTemporalResolution <em>Temporal Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Temporal Resolution</em>'.
	 * @see org.w3.ns.dcat.DistributionType#getTemporalResolution()
	 * @see #getDistributionType()
	 * @generated
	 */
	EAttribute getDistributionType_TemporalResolution();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.ns.dcat.DistributionType#getAccessRights <em>Access Rights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Access Rights</em>'.
	 * @see org.w3.ns.dcat.DistributionType#getAccessRights()
	 * @see #getDistributionType()
	 * @generated
	 */
	EReference getDistributionType_AccessRights();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.ns.dcat.DistributionType#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>License</em>'.
	 * @see org.w3.ns.dcat.DistributionType#getLicense()
	 * @see #getDistributionType()
	 * @generated
	 */
	EReference getDistributionType_License();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.ns.dcat.DistributionType#getConformsTo <em>Conforms To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conforms To</em>'.
	 * @see org.w3.ns.dcat.DistributionType#getConformsTo()
	 * @see #getDistributionType()
	 * @generated
	 */
	EReference getDistributionType_ConformsTo();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.ns.dcat.DistributionType#getRights <em>Rights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rights</em>'.
	 * @see org.w3.ns.dcat.DistributionType#getRights()
	 * @see #getDistributionType()
	 * @generated
	 */
	EReference getDistributionType_Rights();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.ns.dcat.DistributionType#getHasPolicy <em>Has Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Policy</em>'.
	 * @see org.w3.ns.dcat.DistributionType#getHasPolicy()
	 * @see #getDistributionType()
	 * @generated
	 */
	EAttribute getDistributionType_HasPolicy();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.ns.dcat.DistributionType#getIssued <em>Issued</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Issued</em>'.
	 * @see org.w3.ns.dcat.DistributionType#getIssued()
	 * @see #getDistributionType()
	 * @generated
	 */
	EReference getDistributionType_Issued();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.ns.dcat.DistributionType#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Modified</em>'.
	 * @see org.w3.ns.dcat.DistributionType#getModified()
	 * @see #getDistributionType()
	 * @generated
	 */
	EReference getDistributionType_Modified();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.ns.dcat.DistributionType#getAbout <em>About</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>About</em>'.
	 * @see org.w3.ns.dcat.DistributionType#getAbout()
	 * @see #getDistributionType()
	 * @generated
	 */
	EAttribute getDistributionType_About();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.ns.dcat.DistributionType#getNodeID <em>Node ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node ID</em>'.
	 * @see org.w3.ns.dcat.DistributionType#getNodeID()
	 * @see #getDistributionType()
	 * @generated
	 */
	EAttribute getDistributionType_NodeID();

	/**
	 * Returns the meta object for class '{@link org.w3.ns.dcat.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.w3.ns.dcat.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3.ns.dcat.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.w3.ns.dcat.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.w3.ns.dcat.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.w3.ns.dcat.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.w3.ns.dcat.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.w3.ns.dcat.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.ns.dcat.DocumentRoot#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Catalog</em>'.
	 * @see org.w3.ns.dcat.DocumentRoot#getCatalog()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Catalog();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.ns.dcat.DocumentRoot#getCatalogRecord <em>Catalog Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Catalog Record</em>'.
	 * @see org.w3.ns.dcat.DocumentRoot#getCatalogRecord()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CatalogRecord();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.ns.dcat.DocumentRoot#getDataService <em>Data Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Service</em>'.
	 * @see org.w3.ns.dcat.DocumentRoot#getDataService()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DataService();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.ns.dcat.DocumentRoot#getDataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dataset</em>'.
	 * @see org.w3.ns.dcat.DocumentRoot#getDataset()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Dataset();

	/**
	 * Returns the meta object for class '{@link org.w3.ns.dcat.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see org.w3.ns.dcat.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.ns.dcat.Relationship#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relationship</em>'.
	 * @see org.w3.ns.dcat.Relationship#getRelationship()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Relationship();

	/**
	 * Returns the meta object for class '{@link org.w3.ns.dcat.RelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Type</em>'.
	 * @see org.w3.ns.dcat.RelationshipType
	 * @generated
	 */
	EClass getRelationshipType();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.ns.dcat.RelationshipType#getHadRole <em>Had Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Had Role</em>'.
	 * @see org.w3.ns.dcat.RelationshipType#getHadRole()
	 * @see #getRelationshipType()
	 * @generated
	 */
	EReference getRelationshipType_HadRole();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.ns.dcat.RelationshipType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.w3.ns.dcat.RelationshipType#getDescription()
	 * @see #getRelationshipType()
	 * @generated
	 */
	EReference getRelationshipType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.ns.dcat.RelationshipType#getAbout <em>About</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>About</em>'.
	 * @see org.w3.ns.dcat.RelationshipType#getAbout()
	 * @see #getRelationshipType()
	 * @generated
	 */
	EAttribute getRelationshipType_About();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.ns.dcat.RelationshipType#getNodeID <em>Node ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node ID</em>'.
	 * @see org.w3.ns.dcat.RelationshipType#getNodeID()
	 * @see #getRelationshipType()
	 * @generated
	 */
	EAttribute getRelationshipType_NodeID();

	/**
	 * Returns the meta object for class '{@link org.w3.ns.dcat.ResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Type</em>'.
	 * @see org.w3.ns.dcat.ResourceType
	 * @generated
	 */
	EClass getResourceType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.ns.dcat.ResourceType#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Identifier</em>'.
	 * @see org.w3.ns.dcat.ResourceType#getIdentifier()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_Identifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.ns.dcat.ResourceType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Title</em>'.
	 * @see org.w3.ns.dcat.ResourceType#getTitle()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.ns.dcat.ResourceType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.w3.ns.dcat.ResourceType#getDescription()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.ns.dcat.ResourceType#getTheme <em>Theme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Theme</em>'.
	 * @see org.w3.ns.dcat.ResourceType#getTheme()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_Theme();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.ns.dcat.ResourceType#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Keyword</em>'.
	 * @see org.w3.ns.dcat.ResourceType#getKeyword()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_Keyword();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.ns.dcat.ResourceType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type</em>'.
	 * @see org.w3.ns.dcat.ResourceType#getType()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.ns.dcat.ResourceType#getContactPoint <em>Contact Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contact Point</em>'.
	 * @see org.w3.ns.dcat.ResourceType#getContactPoint()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_ContactPoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.ns.dcat.ResourceType#getCreator <em>Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Creator</em>'.
	 * @see org.w3.ns.dcat.ResourceType#getCreator()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_Creator();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.ns.dcat.ResourceType#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publisher</em>'.
	 * @see org.w3.ns.dcat.ResourceType#getPublisher()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_Publisher();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.ns.dcat.ResourceType#getIssued <em>Issued</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Issued</em>'.
	 * @see org.w3.ns.dcat.ResourceType#getIssued()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_Issued();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.ns.dcat.ResourceType#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Modified</em>'.
	 * @see org.w3.ns.dcat.ResourceType#getModified()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_Modified();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.ns.dcat.ResourceType#getLandingPage <em>Landing Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Landing Page</em>'.
	 * @see org.w3.ns.dcat.ResourceType#getLandingPage()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_LandingPage();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.ns.dcat.ResourceType#getAccessRights <em>Access Rights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access Rights</em>'.
	 * @see org.w3.ns.dcat.ResourceType#getAccessRights()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_AccessRights();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.ns.dcat.ResourceType#getConformsTo <em>Conforms To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conforms To</em>'.
	 * @see org.w3.ns.dcat.ResourceType#getConformsTo()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_ConformsTo();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.ns.dcat.ResourceType#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>License</em>'.
	 * @see org.w3.ns.dcat.ResourceType#getLicense()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_License();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.ns.dcat.ResourceType#getRights <em>Rights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rights</em>'.
	 * @see org.w3.ns.dcat.ResourceType#getRights()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_Rights();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.ns.dcat.ResourceType#getHasPolicy <em>Has Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Policy</em>'.
	 * @see org.w3.ns.dcat.ResourceType#getHasPolicy()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_HasPolicy();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3.ns.dcat.ResourceType#getQualifiedAttribution <em>Qualified Attribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Qualified Attribution</em>'.
	 * @see org.w3.ns.dcat.ResourceType#getQualifiedAttribution()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_QualifiedAttribution();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.ns.dcat.ResourceType#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relation</em>'.
	 * @see org.w3.ns.dcat.ResourceType#getRelation()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_Relation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.ns.dcat.ResourceType#getQualifiedRelation <em>Qualified Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Qualified Relation</em>'.
	 * @see org.w3.ns.dcat.ResourceType#getQualifiedRelation()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_QualifiedRelation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.ns.dcat.ResourceType#getIsReferencedBy <em>Is Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Is Referenced By</em>'.
	 * @see org.w3.ns.dcat.ResourceType#getIsReferencedBy()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_IsReferencedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.ns.dcat.ResourceType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Language</em>'.
	 * @see org.w3.ns.dcat.ResourceType#getLanguage()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.ns.dcat.ResourceType#getAbout <em>About</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>About</em>'.
	 * @see org.w3.ns.dcat.ResourceType#getAbout()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_About();

	/**
	 * Returns the meta object for class '{@link org.w3.ns.dcat.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see org.w3.ns.dcat.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.ns.dcat.Service#getDataService <em>Data Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Service</em>'.
	 * @see org.w3.ns.dcat.Service#getDataService()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_DataService();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DcatFactory getDcatFactory();

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
		 * The meta object literal for the '{@link org.w3.ns.dcat.impl.CatalogImpl <em>Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.ns.dcat.impl.CatalogImpl
		 * @see org.w3.ns.dcat.impl.DcatPackageImpl#getCatalog()
		 * @generated
		 */
		EClass CATALOG = eINSTANCE.getCatalog();

		/**
		 * The meta object literal for the '<em><b>Catalog</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG__CATALOG = eINSTANCE.getCatalog_Catalog();

		/**
		 * The meta object literal for the '{@link org.w3.ns.dcat.impl.Catalog1Impl <em>Catalog1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.ns.dcat.impl.Catalog1Impl
		 * @see org.w3.ns.dcat.impl.DcatPackageImpl#getCatalog1()
		 * @generated
		 */
		EClass CATALOG1 = eINSTANCE.getCatalog1();

		/**
		 * The meta object literal for the '<em><b>Catalog</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG1__CATALOG = eINSTANCE.getCatalog1_Catalog();

		/**
		 * The meta object literal for the '<em><b>Record</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG1__RECORD = eINSTANCE.getCatalog1_Record();

		/**
		 * The meta object literal for the '<em><b>Dataset</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG1__DATASET = eINSTANCE.getCatalog1_Dataset();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG1__SERVICE = eINSTANCE.getCatalog1_Service();

		/**
		 * The meta object literal for the '<em><b>Theme Taxonomy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG1__THEME_TAXONOMY = eINSTANCE.getCatalog1_ThemeTaxonomy();

		/**
		 * The meta object literal for the '<em><b>Has Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG1__HAS_PART = eINSTANCE.getCatalog1_HasPart();

		/**
		 * The meta object literal for the '<em><b>Homepage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG1__HOMEPAGE = eINSTANCE.getCatalog1_Homepage();

		/**
		 * The meta object literal for the '{@link org.w3.ns.dcat.impl.CatalogRecordImpl <em>Catalog Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.ns.dcat.impl.CatalogRecordImpl
		 * @see org.w3.ns.dcat.impl.DcatPackageImpl#getCatalogRecord()
		 * @generated
		 */
		EClass CATALOG_RECORD = eINSTANCE.getCatalogRecord();

		/**
		 * The meta object literal for the '<em><b>Catalog Record</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG_RECORD__CATALOG_RECORD = eINSTANCE.getCatalogRecord_CatalogRecord();

		/**
		 * The meta object literal for the '{@link org.w3.ns.dcat.impl.CatalogRecordTypeImpl <em>Catalog Record Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.ns.dcat.impl.CatalogRecordTypeImpl
		 * @see org.w3.ns.dcat.impl.DcatPackageImpl#getCatalogRecordType()
		 * @generated
		 */
		EClass CATALOG_RECORD_TYPE = eINSTANCE.getCatalogRecordType();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG_RECORD_TYPE__TITLE = eINSTANCE.getCatalogRecordType_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG_RECORD_TYPE__DESCRIPTION = eINSTANCE.getCatalogRecordType_Description();

		/**
		 * The meta object literal for the '<em><b>Issued</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG_RECORD_TYPE__ISSUED = eINSTANCE.getCatalogRecordType_Issued();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG_RECORD_TYPE__MODIFIED = eINSTANCE.getCatalogRecordType_Modified();

		/**
		 * The meta object literal for the '<em><b>Primary Topic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG_RECORD_TYPE__PRIMARY_TOPIC = eINSTANCE.getCatalogRecordType_PrimaryTopic();

		/**
		 * The meta object literal for the '<em><b>Conforms To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG_RECORD_TYPE__CONFORMS_TO = eINSTANCE.getCatalogRecordType_ConformsTo();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG_RECORD_TYPE__LANGUAGE = eINSTANCE.getCatalogRecordType_Language();

		/**
		 * The meta object literal for the '<em><b>About</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_RECORD_TYPE__ABOUT = eINSTANCE.getCatalogRecordType_About();

		/**
		 * The meta object literal for the '{@link org.w3.ns.dcat.impl.DataServiceTypeImpl <em>Data Service Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.ns.dcat.impl.DataServiceTypeImpl
		 * @see org.w3.ns.dcat.impl.DcatPackageImpl#getDataServiceType()
		 * @generated
		 */
		EClass DATA_SERVICE_TYPE = eINSTANCE.getDataServiceType();

		/**
		 * The meta object literal for the '<em><b>Endpoint Description</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SERVICE_TYPE__ENDPOINT_DESCRIPTION = eINSTANCE.getDataServiceType_EndpointDescription();

		/**
		 * The meta object literal for the '<em><b>Endpoint URL</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SERVICE_TYPE__ENDPOINT_URL = eINSTANCE.getDataServiceType_EndpointURL();

		/**
		 * The meta object literal for the '<em><b>Serves Dataset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SERVICE_TYPE__SERVES_DATASET = eINSTANCE.getDataServiceType_ServesDataset();

		/**
		 * The meta object literal for the '{@link org.w3.ns.dcat.impl.DatasetImpl <em>Dataset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.ns.dcat.impl.DatasetImpl
		 * @see org.w3.ns.dcat.impl.DcatPackageImpl#getDataset()
		 * @generated
		 */
		EClass DATASET = eINSTANCE.getDataset();

		/**
		 * The meta object literal for the '<em><b>Dataset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATASET__DATASET = eINSTANCE.getDataset_Dataset();

		/**
		 * The meta object literal for the '{@link org.w3.ns.dcat.impl.DatasetTypeImpl <em>Dataset Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.ns.dcat.impl.DatasetTypeImpl
		 * @see org.w3.ns.dcat.impl.DcatPackageImpl#getDatasetType()
		 * @generated
		 */
		EClass DATASET_TYPE = eINSTANCE.getDatasetType();

		/**
		 * The meta object literal for the '<em><b>Distribution</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATASET_TYPE__DISTRIBUTION = eINSTANCE.getDatasetType_Distribution();

		/**
		 * The meta object literal for the '<em><b>Spatial Resolution In Meters</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET_TYPE__SPATIAL_RESOLUTION_IN_METERS = eINSTANCE.getDatasetType_SpatialResolutionInMeters();

		/**
		 * The meta object literal for the '<em><b>Temporal Resolution</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET_TYPE__TEMPORAL_RESOLUTION = eINSTANCE.getDatasetType_TemporalResolution();

		/**
		 * The meta object literal for the '<em><b>Accrual Periodicity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATASET_TYPE__ACCRUAL_PERIODICITY = eINSTANCE.getDatasetType_AccrualPeriodicity();

		/**
		 * The meta object literal for the '<em><b>Spatial</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATASET_TYPE__SPATIAL = eINSTANCE.getDatasetType_Spatial();

		/**
		 * The meta object literal for the '<em><b>Temporal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATASET_TYPE__TEMPORAL = eINSTANCE.getDatasetType_Temporal();

		/**
		 * The meta object literal for the '<em><b>Was Generated By</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET_TYPE__WAS_GENERATED_BY = eINSTANCE.getDatasetType_WasGeneratedBy();

		/**
		 * The meta object literal for the '<em><b>Contributor Id</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATASET_TYPE__CONTRIBUTOR_ID = eINSTANCE.getDatasetType_ContributorId();

		/**
		 * The meta object literal for the '{@link org.w3.ns.dcat.impl.DistributionImpl <em>Distribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.ns.dcat.impl.DistributionImpl
		 * @see org.w3.ns.dcat.impl.DcatPackageImpl#getDistribution()
		 * @generated
		 */
		EClass DISTRIBUTION = eINSTANCE.getDistribution();

		/**
		 * The meta object literal for the '<em><b>Distribution</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION__DISTRIBUTION = eINSTANCE.getDistribution_Distribution();

		/**
		 * The meta object literal for the '{@link org.w3.ns.dcat.impl.DistributionTypeImpl <em>Distribution Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.ns.dcat.impl.DistributionTypeImpl
		 * @see org.w3.ns.dcat.impl.DcatPackageImpl#getDistributionType()
		 * @generated
		 */
		EClass DISTRIBUTION_TYPE = eINSTANCE.getDistributionType();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_TYPE__TITLE = eINSTANCE.getDistributionType_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_TYPE__DESCRIPTION = eINSTANCE.getDistributionType_Description();

		/**
		 * The meta object literal for the '<em><b>Access Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_TYPE__ACCESS_SERVICE = eINSTANCE.getDistributionType_AccessService();

		/**
		 * The meta object literal for the '<em><b>Access URL</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION_TYPE__ACCESS_URL = eINSTANCE.getDistributionType_AccessURL();

		/**
		 * The meta object literal for the '<em><b>Download URL</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION_TYPE__DOWNLOAD_URL = eINSTANCE.getDistributionType_DownloadURL();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_TYPE__FORMAT = eINSTANCE.getDistributionType_Format();

		/**
		 * The meta object literal for the '<em><b>Media Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION_TYPE__MEDIA_TYPE = eINSTANCE.getDistributionType_MediaType();

		/**
		 * The meta object literal for the '<em><b>Package Format</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION_TYPE__PACKAGE_FORMAT = eINSTANCE.getDistributionType_PackageFormat();

		/**
		 * The meta object literal for the '<em><b>Byte Size</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION_TYPE__BYTE_SIZE = eINSTANCE.getDistributionType_ByteSize();

		/**
		 * The meta object literal for the '<em><b>Compress Format</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_TYPE__COMPRESS_FORMAT = eINSTANCE.getDistributionType_CompressFormat();

		/**
		 * The meta object literal for the '<em><b>Spatial Resolution In Meters</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION_TYPE__SPATIAL_RESOLUTION_IN_METERS = eINSTANCE.getDistributionType_SpatialResolutionInMeters();

		/**
		 * The meta object literal for the '<em><b>Temporal Resolution</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION_TYPE__TEMPORAL_RESOLUTION = eINSTANCE.getDistributionType_TemporalResolution();

		/**
		 * The meta object literal for the '<em><b>Access Rights</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_TYPE__ACCESS_RIGHTS = eINSTANCE.getDistributionType_AccessRights();

		/**
		 * The meta object literal for the '<em><b>License</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_TYPE__LICENSE = eINSTANCE.getDistributionType_License();

		/**
		 * The meta object literal for the '<em><b>Conforms To</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_TYPE__CONFORMS_TO = eINSTANCE.getDistributionType_ConformsTo();

		/**
		 * The meta object literal for the '<em><b>Rights</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_TYPE__RIGHTS = eINSTANCE.getDistributionType_Rights();

		/**
		 * The meta object literal for the '<em><b>Has Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION_TYPE__HAS_POLICY = eINSTANCE.getDistributionType_HasPolicy();

		/**
		 * The meta object literal for the '<em><b>Issued</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_TYPE__ISSUED = eINSTANCE.getDistributionType_Issued();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_TYPE__MODIFIED = eINSTANCE.getDistributionType_Modified();

		/**
		 * The meta object literal for the '<em><b>About</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION_TYPE__ABOUT = eINSTANCE.getDistributionType_About();

		/**
		 * The meta object literal for the '<em><b>Node ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION_TYPE__NODE_ID = eINSTANCE.getDistributionType_NodeID();

		/**
		 * The meta object literal for the '{@link org.w3.ns.dcat.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.ns.dcat.impl.DocumentRootImpl
		 * @see org.w3.ns.dcat.impl.DcatPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Catalog</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CATALOG = eINSTANCE.getDocumentRoot_Catalog();

		/**
		 * The meta object literal for the '<em><b>Catalog Record</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CATALOG_RECORD = eINSTANCE.getDocumentRoot_CatalogRecord();

		/**
		 * The meta object literal for the '<em><b>Data Service</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DATA_SERVICE = eINSTANCE.getDocumentRoot_DataService();

		/**
		 * The meta object literal for the '<em><b>Dataset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DATASET = eINSTANCE.getDocumentRoot_Dataset();

		/**
		 * The meta object literal for the '{@link org.w3.ns.dcat.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.ns.dcat.impl.RelationshipImpl
		 * @see org.w3.ns.dcat.impl.DcatPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Relationship</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__RELATIONSHIP = eINSTANCE.getRelationship_Relationship();

		/**
		 * The meta object literal for the '{@link org.w3.ns.dcat.impl.RelationshipTypeImpl <em>Relationship Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.ns.dcat.impl.RelationshipTypeImpl
		 * @see org.w3.ns.dcat.impl.DcatPackageImpl#getRelationshipType()
		 * @generated
		 */
		EClass RELATIONSHIP_TYPE = eINSTANCE.getRelationshipType();

		/**
		 * The meta object literal for the '<em><b>Had Role</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_TYPE__HAD_ROLE = eINSTANCE.getRelationshipType_HadRole();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_TYPE__DESCRIPTION = eINSTANCE.getRelationshipType_Description();

		/**
		 * The meta object literal for the '<em><b>About</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_TYPE__ABOUT = eINSTANCE.getRelationshipType_About();

		/**
		 * The meta object literal for the '<em><b>Node ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_TYPE__NODE_ID = eINSTANCE.getRelationshipType_NodeID();

		/**
		 * The meta object literal for the '{@link org.w3.ns.dcat.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.ns.dcat.impl.ResourceTypeImpl
		 * @see org.w3.ns.dcat.impl.DcatPackageImpl#getResourceType()
		 * @generated
		 */
		EClass RESOURCE_TYPE = eINSTANCE.getResourceType();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE__IDENTIFIER = eINSTANCE.getResourceType_Identifier();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE__TITLE = eINSTANCE.getResourceType_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE__DESCRIPTION = eINSTANCE.getResourceType_Description();

		/**
		 * The meta object literal for the '<em><b>Theme</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE__THEME = eINSTANCE.getResourceType_Theme();

		/**
		 * The meta object literal for the '<em><b>Keyword</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE__KEYWORD = eINSTANCE.getResourceType_Keyword();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE__TYPE = eINSTANCE.getResourceType_Type();

		/**
		 * The meta object literal for the '<em><b>Contact Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE__CONTACT_POINT = eINSTANCE.getResourceType_ContactPoint();

		/**
		 * The meta object literal for the '<em><b>Creator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE__CREATOR = eINSTANCE.getResourceType_Creator();

		/**
		 * The meta object literal for the '<em><b>Publisher</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE__PUBLISHER = eINSTANCE.getResourceType_Publisher();

		/**
		 * The meta object literal for the '<em><b>Issued</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE__ISSUED = eINSTANCE.getResourceType_Issued();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE__MODIFIED = eINSTANCE.getResourceType_Modified();

		/**
		 * The meta object literal for the '<em><b>Landing Page</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE__LANDING_PAGE = eINSTANCE.getResourceType_LandingPage();

		/**
		 * The meta object literal for the '<em><b>Access Rights</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE__ACCESS_RIGHTS = eINSTANCE.getResourceType_AccessRights();

		/**
		 * The meta object literal for the '<em><b>Conforms To</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE__CONFORMS_TO = eINSTANCE.getResourceType_ConformsTo();

		/**
		 * The meta object literal for the '<em><b>License</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE__LICENSE = eINSTANCE.getResourceType_License();

		/**
		 * The meta object literal for the '<em><b>Rights</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE__RIGHTS = eINSTANCE.getResourceType_Rights();

		/**
		 * The meta object literal for the '<em><b>Has Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__HAS_POLICY = eINSTANCE.getResourceType_HasPolicy();

		/**
		 * The meta object literal for the '<em><b>Qualified Attribution</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__QUALIFIED_ATTRIBUTION = eINSTANCE.getResourceType_QualifiedAttribution();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE__RELATION = eINSTANCE.getResourceType_Relation();

		/**
		 * The meta object literal for the '<em><b>Qualified Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE__QUALIFIED_RELATION = eINSTANCE.getResourceType_QualifiedRelation();

		/**
		 * The meta object literal for the '<em><b>Is Referenced By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE__IS_REFERENCED_BY = eINSTANCE.getResourceType_IsReferencedBy();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE__LANGUAGE = eINSTANCE.getResourceType_Language();

		/**
		 * The meta object literal for the '<em><b>About</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__ABOUT = eINSTANCE.getResourceType_About();

		/**
		 * The meta object literal for the '{@link org.w3.ns.dcat.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.ns.dcat.impl.ServiceImpl
		 * @see org.w3.ns.dcat.impl.DcatPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Data Service</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__DATA_SERVICE = eINSTANCE.getService_DataService();

	}

} //DcatPackage
