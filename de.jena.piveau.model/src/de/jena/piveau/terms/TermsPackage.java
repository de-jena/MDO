/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Data In Motion - initial API and implementation
 */
package de.jena.piveau.terms;


import de.jena.piveau.rdf.RdfPackage;

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
 * <!-- end-model-doc -->
 * @see de.jena.piveau.terms.TermsFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = TermsPackage.eNS_URI, genModel = "/model/dcatap.genmodel", genModelSourceLocations = {"model/dcatap.genmodel","de.jena.piveau.model/model/dcatap.genmodel"}, ecore="/model/terms.ecore", ecoreSourceLocations="/model/terms.ecore")
public interface TermsPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "terms";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://purl.org/dc/terms/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "terms";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TermsPackage eINSTANCE = de.jena.piveau.terms.impl.TermsPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.jena.piveau.terms.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.piveau.terms.impl.DocumentRootImpl
	 * @see de.jena.piveau.terms.impl.TermsPackageImpl#getDocumentRoot()
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
	 * The feature id for the '<em><b>Abstract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT = 3;

	/**
	 * The feature id for the '<em><b>Access Rights</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ACCESS_RIGHTS = 4;

	/**
	 * The feature id for the '<em><b>Accrual Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ACCRUAL_METHOD = 5;

	/**
	 * The feature id for the '<em><b>Accrual Periodicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ACCRUAL_PERIODICITY = 6;

	/**
	 * The feature id for the '<em><b>Accrual Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ACCRUAL_POLICY = 7;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ALTERNATIVE = 8;

	/**
	 * The feature id for the '<em><b>Audience</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUDIENCE = 9;

	/**
	 * The feature id for the '<em><b>Available</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AVAILABLE = 10;

	/**
	 * The feature id for the '<em><b>Bibliographic Citation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BIBLIOGRAPHIC_CITATION = 11;

	/**
	 * The feature id for the '<em><b>Conforms To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONFORMS_TO = 12;

	/**
	 * The feature id for the '<em><b>Created</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CREATED = 13;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CREATOR = 14;

	/**
	 * The feature id for the '<em><b>Date Accepted</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATE_ACCEPTED = 15;

	/**
	 * The feature id for the '<em><b>Date Copyrighted</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATE_COPYRIGHTED = 16;

	/**
	 * The feature id for the '<em><b>Date Submitted</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATE_SUBMITTED = 17;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DESCRIPTION = 18;

	/**
	 * The feature id for the '<em><b>Education Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EDUCATION_LEVEL = 19;

	/**
	 * The feature id for the '<em><b>Extent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTENT = 20;

	/**
	 * The feature id for the '<em><b>Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FORMAT = 21;

	/**
	 * The feature id for the '<em><b>Has Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HAS_FORMAT = 22;

	/**
	 * The feature id for the '<em><b>Has Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HAS_PART = 23;

	/**
	 * The feature id for the '<em><b>Has Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HAS_VERSION = 24;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IDENTIFIER = 25;

	/**
	 * The feature id for the '<em><b>Instructional Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INSTRUCTIONAL_METHOD = 26;

	/**
	 * The feature id for the '<em><b>Is Format Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IS_FORMAT_OF = 27;

	/**
	 * The feature id for the '<em><b>Is Part Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IS_PART_OF = 28;

	/**
	 * The feature id for the '<em><b>Is Referenced By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IS_REFERENCED_BY = 29;

	/**
	 * The feature id for the '<em><b>Is Replaced By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IS_REPLACED_BY = 30;

	/**
	 * The feature id for the '<em><b>Is Required By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IS_REQUIRED_BY = 31;

	/**
	 * The feature id for the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ISSUED = 32;

	/**
	 * The feature id for the '<em><b>Is Version Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IS_VERSION_OF = 33;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LANGUAGE = 34;

	/**
	 * The feature id for the '<em><b>License</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LICENSE = 35;

	/**
	 * The feature id for the '<em><b>Mediator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MEDIATOR = 36;

	/**
	 * The feature id for the '<em><b>Medium</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MEDIUM = 37;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MODIFIED = 38;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROVENANCE = 39;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PUBLISHER = 40;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REFERENCES = 41;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RELATION = 42;

	/**
	 * The feature id for the '<em><b>Replaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REPLACES = 43;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REQUIRES = 44;

	/**
	 * The feature id for the '<em><b>Rights</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RIGHTS = 45;

	/**
	 * The feature id for the '<em><b>Rights Holder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RIGHTS_HOLDER = 46;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SOURCE = 47;

	/**
	 * The feature id for the '<em><b>Spatial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPATIAL = 48;

	/**
	 * The feature id for the '<em><b>Table Of Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TABLE_OF_CONTENTS = 49;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEMPORAL = 50;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TITLE = 51;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TYPE = 52;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALID = 53;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 54;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.piveau.terms.impl.LicenseDocumentImpl <em>License Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.piveau.terms.impl.LicenseDocumentImpl
	 * @see de.jena.piveau.terms.impl.TermsPackageImpl#getLicenseDocument()
	 * @generated
	 */
	int LICENSE_DOCUMENT = 1;

	/**
	 * The feature id for the '<em><b>License Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_DOCUMENT__LICENSE_DOCUMENT = 0;

	/**
	 * The number of structural features of the '<em>License Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_DOCUMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>License Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_DOCUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.piveau.terms.impl.LicenseDocumentTypeImpl <em>License Document Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.piveau.terms.impl.LicenseDocumentTypeImpl
	 * @see de.jena.piveau.terms.impl.TermsPackageImpl#getLicenseDocumentType()
	 * @generated
	 */
	int LICENSE_DOCUMENT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_DOCUMENT_TYPE__RESOURCE = RdfPackage.RESOURCE__RESOURCE;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_DOCUMENT_TYPE__ABOUT = RdfPackage.RESOURCE__ABOUT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_DOCUMENT_TYPE__TYPE = RdfPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_DOCUMENT_TYPE__TITLE = RdfPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_DOCUMENT_TYPE__DESCRIPTION = RdfPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_DOCUMENT_TYPE__IDENTIFIER = RdfPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_DOCUMENT_TYPE__NODE_ID = RdfPackage.RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>License Document Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_DOCUMENT_TYPE_FEATURE_COUNT = RdfPackage.RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>License Document Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_DOCUMENT_TYPE_OPERATION_COUNT = RdfPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.piveau.terms.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.piveau.terms.impl.LocationImpl
	 * @see de.jena.piveau.terms.impl.TermsPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LOCATION = 0;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.piveau.terms.impl.LocationTypeImpl <em>Location Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.piveau.terms.impl.LocationTypeImpl
	 * @see de.jena.piveau.terms.impl.TermsPackageImpl#getLocationType()
	 * @generated
	 */
	int LOCATION_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__GEOMETRY = 0;

	/**
	 * The feature id for the '<em><b>Pref Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__PREF_LABEL = 1;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__ABOUT = 2;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__NODE_ID = 3;

	/**
	 * The number of structural features of the '<em>Location Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Location Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.piveau.terms.impl.PeriodOfTimeImpl <em>Period Of Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.piveau.terms.impl.PeriodOfTimeImpl
	 * @see de.jena.piveau.terms.impl.TermsPackageImpl#getPeriodOfTime()
	 * @generated
	 */
	int PERIOD_OF_TIME = 5;

	/**
	 * The feature id for the '<em><b>Period Of Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_OF_TIME__PERIOD_OF_TIME = 0;

	/**
	 * The number of structural features of the '<em>Period Of Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_OF_TIME_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Period Of Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_OF_TIME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.piveau.terms.impl.PeriodOfTimeTypeImpl <em>Period Of Time Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.piveau.terms.impl.PeriodOfTimeTypeImpl
	 * @see de.jena.piveau.terms.impl.TermsPackageImpl#getPeriodOfTimeType()
	 * @generated
	 */
	int PERIOD_OF_TIME_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_OF_TIME_TYPE__START_DATE = 0;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_OF_TIME_TYPE__END_DATE = 1;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_OF_TIME_TYPE__ABOUT = 2;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_OF_TIME_TYPE__NODE_ID = 3;

	/**
	 * The number of structural features of the '<em>Period Of Time Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_OF_TIME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Period Of Time Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_OF_TIME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.piveau.terms.impl.ProvenanceStatementImpl <em>Provenance Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.piveau.terms.impl.ProvenanceStatementImpl
	 * @see de.jena.piveau.terms.impl.TermsPackageImpl#getProvenanceStatement()
	 * @generated
	 */
	int PROVENANCE_STATEMENT = 7;

	/**
	 * The feature id for the '<em><b>Provenance Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVENANCE_STATEMENT__PROVENANCE_STATEMENT = 0;

	/**
	 * The number of structural features of the '<em>Provenance Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVENANCE_STATEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Provenance Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVENANCE_STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.piveau.terms.impl.ProvenanceStatementTypeImpl <em>Provenance Statement Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.piveau.terms.impl.ProvenanceStatementTypeImpl
	 * @see de.jena.piveau.terms.impl.TermsPackageImpl#getProvenanceStatementType()
	 * @generated
	 */
	int PROVENANCE_STATEMENT_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVENANCE_STATEMENT_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVENANCE_STATEMENT_TYPE__ABOUT = 1;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVENANCE_STATEMENT_TYPE__NODE_ID = 2;

	/**
	 * The number of structural features of the '<em>Provenance Statement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVENANCE_STATEMENT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Provenance Statement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVENANCE_STATEMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.piveau.terms.impl.RightsStatementImpl <em>Rights Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.piveau.terms.impl.RightsStatementImpl
	 * @see de.jena.piveau.terms.impl.TermsPackageImpl#getRightsStatement()
	 * @generated
	 */
	int RIGHTS_STATEMENT = 9;

	/**
	 * The feature id for the '<em><b>Rights Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTS_STATEMENT__RIGHTS_STATEMENT = 0;

	/**
	 * The number of structural features of the '<em>Rights Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTS_STATEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Rights Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTS_STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.piveau.terms.impl.RightsStatementTypeImpl <em>Rights Statement Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.piveau.terms.impl.RightsStatementTypeImpl
	 * @see de.jena.piveau.terms.impl.TermsPackageImpl#getRightsStatementType()
	 * @generated
	 */
	int RIGHTS_STATEMENT_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTS_STATEMENT_TYPE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTS_STATEMENT_TYPE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTS_STATEMENT_TYPE__ABOUT = 2;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTS_STATEMENT_TYPE__NODE_ID = 3;

	/**
	 * The number of structural features of the '<em>Rights Statement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTS_STATEMENT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Rights Statement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTS_STATEMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.piveau.terms.impl.StandardImpl <em>Standard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.piveau.terms.impl.StandardImpl
	 * @see de.jena.piveau.terms.impl.TermsPackageImpl#getStandard()
	 * @generated
	 */
	int STANDARD = 11;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__STANDARD = 0;

	/**
	 * The number of structural features of the '<em>Standard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Standard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.piveau.terms.impl.StandardTypeImpl <em>Standard Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.piveau.terms.impl.StandardTypeImpl
	 * @see de.jena.piveau.terms.impl.TermsPackageImpl#getStandardType()
	 * @generated
	 */
	int STANDARD_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_TYPE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_TYPE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_TYPE__ABOUT = 2;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_TYPE__NODE_ID = 3;

	/**
	 * The number of structural features of the '<em>Standard Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Standard Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_TYPE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.jena.piveau.terms.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link de.jena.piveau.terms.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link de.jena.piveau.terms.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link de.jena.piveau.terms.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.DocumentRoot#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getAbstract()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Abstract();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.DocumentRoot#getAccessRights <em>Access Rights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access Rights</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getAccessRights()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AccessRights();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.piveau.terms.DocumentRoot#getAccrualMethod <em>Accrual Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accrual Method</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getAccrualMethod()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AccrualMethod();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.DocumentRoot#getAccrualPeriodicity <em>Accrual Periodicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Accrual Periodicity</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getAccrualPeriodicity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AccrualPeriodicity();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.piveau.terms.DocumentRoot#getAccrualPolicy <em>Accrual Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accrual Policy</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getAccrualPolicy()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AccrualPolicy();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.DocumentRoot#getAlternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alternative</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getAlternative()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Alternative();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.piveau.terms.DocumentRoot#getAudience <em>Audience</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Audience</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getAudience()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Audience();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.DocumentRoot#getAvailable <em>Available</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Available</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getAvailable()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Available();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.DocumentRoot#getBibliographicCitation <em>Bibliographic Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bibliographic Citation</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getBibliographicCitation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BibliographicCitation();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.DocumentRoot#getConformsTo <em>Conforms To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conforms To</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getConformsTo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ConformsTo();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.DocumentRoot#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Created</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getCreated()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Created();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.DocumentRoot#getCreator <em>Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Creator</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getCreator()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Creator();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.DocumentRoot#getDateAccepted <em>Date Accepted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date Accepted</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getDateAccepted()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DateAccepted();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.DocumentRoot#getDateCopyrighted <em>Date Copyrighted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date Copyrighted</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getDateCopyrighted()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DateCopyrighted();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.DocumentRoot#getDateSubmitted <em>Date Submitted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date Submitted</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getDateSubmitted()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DateSubmitted();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.DocumentRoot#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getDescription()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.piveau.terms.DocumentRoot#getEducationLevel <em>Education Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Education Level</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getEducationLevel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_EducationLevel();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.DocumentRoot#getExtent <em>Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extent</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getExtent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Extent();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.DocumentRoot#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Format</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getFormat()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Format();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.piveau.terms.DocumentRoot#getHasFormat <em>Has Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Format</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getHasFormat()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_HasFormat();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.DocumentRoot#getHasPart <em>Has Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Part</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getHasPart()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HasPart();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.DocumentRoot#getHasVersion <em>Has Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Version</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getHasVersion()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HasVersion();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.DocumentRoot#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifier</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getIdentifier()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.piveau.terms.DocumentRoot#getInstructionalMethod <em>Instructional Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instructional Method</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getInstructionalMethod()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_InstructionalMethod();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.piveau.terms.DocumentRoot#getIsFormatOf <em>Is Format Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Format Of</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getIsFormatOf()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_IsFormatOf();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.DocumentRoot#getIsPartOf <em>Is Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Part Of</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getIsPartOf()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_IsPartOf();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.DocumentRoot#getIsReferencedBy <em>Is Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Referenced By</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getIsReferencedBy()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_IsReferencedBy();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.DocumentRoot#getIsReplacedBy <em>Is Replaced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Replaced By</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getIsReplacedBy()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_IsReplacedBy();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.piveau.terms.DocumentRoot#getIsRequiredBy <em>Is Required By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Required By</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getIsRequiredBy()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_IsRequiredBy();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.DocumentRoot#getIssued <em>Issued</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Issued</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getIssued()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Issued();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.DocumentRoot#getIsVersionOf <em>Is Version Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Version Of</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getIsVersionOf()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_IsVersionOf();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.DocumentRoot#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Language</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getLanguage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Language();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.DocumentRoot#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>License</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getLicense()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_License();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.piveau.terms.DocumentRoot#getMediator <em>Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mediator</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getMediator()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mediator();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.piveau.terms.DocumentRoot#getMedium <em>Medium</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Medium</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getMedium()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Medium();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.DocumentRoot#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Modified</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getModified()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Modified();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.DocumentRoot#getProvenance <em>Provenance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Provenance</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getProvenance()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Provenance();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.DocumentRoot#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publisher</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getPublisher()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Publisher();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.DocumentRoot#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>References</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getReferences()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_References();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.DocumentRoot#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relation</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getRelation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Relation();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.DocumentRoot#getReplaces <em>Replaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Replaces</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getReplaces()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Replaces();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.piveau.terms.DocumentRoot#getRequires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requires</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getRequires()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Requires();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.DocumentRoot#getRights <em>Rights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rights</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getRights()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Rights();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.DocumentRoot#getRightsHolder <em>Rights Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rights Holder</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getRightsHolder()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RightsHolder();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.DocumentRoot#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getSource()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Source();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.DocumentRoot#getSpatial <em>Spatial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spatial</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getSpatial()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Spatial();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.DocumentRoot#getTableOfContents <em>Table Of Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Of Contents</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getTableOfContents()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TableOfContents();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.DocumentRoot#getTemporal <em>Temporal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Temporal</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getTemporal()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Temporal();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.DocumentRoot#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getTitle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Title();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.DocumentRoot#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Type();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.DocumentRoot#getValid <em>Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valid</em>'.
	 * @see de.jena.piveau.terms.DocumentRoot#getValid()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Valid();

	/**
	 * Returns the meta object for class '{@link de.jena.piveau.terms.LicenseDocument <em>License Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>License Document</em>'.
	 * @see de.jena.piveau.terms.LicenseDocument
	 * @generated
	 */
	EClass getLicenseDocument();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.LicenseDocument#getLicenseDocument <em>License Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>License Document</em>'.
	 * @see de.jena.piveau.terms.LicenseDocument#getLicenseDocument()
	 * @see #getLicenseDocument()
	 * @generated
	 */
	EReference getLicenseDocument_LicenseDocument();

	/**
	 * Returns the meta object for class '{@link de.jena.piveau.terms.LicenseDocumentType <em>License Document Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>License Document Type</em>'.
	 * @see de.jena.piveau.terms.LicenseDocumentType
	 * @generated
	 */
	EClass getLicenseDocumentType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.piveau.terms.LicenseDocumentType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type</em>'.
	 * @see de.jena.piveau.terms.LicenseDocumentType#getType()
	 * @see #getLicenseDocumentType()
	 * @generated
	 */
	EReference getLicenseDocumentType_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.piveau.terms.LicenseDocumentType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Title</em>'.
	 * @see de.jena.piveau.terms.LicenseDocumentType#getTitle()
	 * @see #getLicenseDocumentType()
	 * @generated
	 */
	EReference getLicenseDocumentType_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.piveau.terms.LicenseDocumentType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see de.jena.piveau.terms.LicenseDocumentType#getDescription()
	 * @see #getLicenseDocumentType()
	 * @generated
	 */
	EReference getLicenseDocumentType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.piveau.terms.LicenseDocumentType#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Identifier</em>'.
	 * @see de.jena.piveau.terms.LicenseDocumentType#getIdentifier()
	 * @see #getLicenseDocumentType()
	 * @generated
	 */
	EReference getLicenseDocumentType_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.piveau.terms.LicenseDocumentType#getNodeID <em>Node ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node ID</em>'.
	 * @see de.jena.piveau.terms.LicenseDocumentType#getNodeID()
	 * @see #getLicenseDocumentType()
	 * @generated
	 */
	EAttribute getLicenseDocumentType_NodeID();

	/**
	 * Returns the meta object for class '{@link de.jena.piveau.terms.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see de.jena.piveau.terms.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.Location#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see de.jena.piveau.terms.Location#getLocation()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Location();

	/**
	 * Returns the meta object for class '{@link de.jena.piveau.terms.LocationType <em>Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Type</em>'.
	 * @see de.jena.piveau.terms.LocationType
	 * @generated
	 */
	EClass getLocationType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.piveau.terms.LocationType#getGeometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Geometry</em>'.
	 * @see de.jena.piveau.terms.LocationType#getGeometry()
	 * @see #getLocationType()
	 * @generated
	 */
	EReference getLocationType_Geometry();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.piveau.terms.LocationType#getPrefLabel <em>Pref Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pref Label</em>'.
	 * @see de.jena.piveau.terms.LocationType#getPrefLabel()
	 * @see #getLocationType()
	 * @generated
	 */
	EReference getLocationType_PrefLabel();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.piveau.terms.LocationType#getAbout <em>About</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>About</em>'.
	 * @see de.jena.piveau.terms.LocationType#getAbout()
	 * @see #getLocationType()
	 * @generated
	 */
	EAttribute getLocationType_About();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.piveau.terms.LocationType#getNodeID <em>Node ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node ID</em>'.
	 * @see de.jena.piveau.terms.LocationType#getNodeID()
	 * @see #getLocationType()
	 * @generated
	 */
	EAttribute getLocationType_NodeID();

	/**
	 * Returns the meta object for class '{@link de.jena.piveau.terms.PeriodOfTime <em>Period Of Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Period Of Time</em>'.
	 * @see de.jena.piveau.terms.PeriodOfTime
	 * @generated
	 */
	EClass getPeriodOfTime();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.PeriodOfTime#getPeriodOfTime <em>Period Of Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period Of Time</em>'.
	 * @see de.jena.piveau.terms.PeriodOfTime#getPeriodOfTime()
	 * @see #getPeriodOfTime()
	 * @generated
	 */
	EReference getPeriodOfTime_PeriodOfTime();

	/**
	 * Returns the meta object for class '{@link de.jena.piveau.terms.PeriodOfTimeType <em>Period Of Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Period Of Time Type</em>'.
	 * @see de.jena.piveau.terms.PeriodOfTimeType
	 * @generated
	 */
	EClass getPeriodOfTimeType();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.PeriodOfTimeType#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start Date</em>'.
	 * @see de.jena.piveau.terms.PeriodOfTimeType#getStartDate()
	 * @see #getPeriodOfTimeType()
	 * @generated
	 */
	EReference getPeriodOfTimeType_StartDate();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.PeriodOfTimeType#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End Date</em>'.
	 * @see de.jena.piveau.terms.PeriodOfTimeType#getEndDate()
	 * @see #getPeriodOfTimeType()
	 * @generated
	 */
	EReference getPeriodOfTimeType_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.piveau.terms.PeriodOfTimeType#getAbout <em>About</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>About</em>'.
	 * @see de.jena.piveau.terms.PeriodOfTimeType#getAbout()
	 * @see #getPeriodOfTimeType()
	 * @generated
	 */
	EAttribute getPeriodOfTimeType_About();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.piveau.terms.PeriodOfTimeType#getNodeID <em>Node ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node ID</em>'.
	 * @see de.jena.piveau.terms.PeriodOfTimeType#getNodeID()
	 * @see #getPeriodOfTimeType()
	 * @generated
	 */
	EAttribute getPeriodOfTimeType_NodeID();

	/**
	 * Returns the meta object for class '{@link de.jena.piveau.terms.ProvenanceStatement <em>Provenance Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provenance Statement</em>'.
	 * @see de.jena.piveau.terms.ProvenanceStatement
	 * @generated
	 */
	EClass getProvenanceStatement();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.ProvenanceStatement#getProvenanceStatement <em>Provenance Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Provenance Statement</em>'.
	 * @see de.jena.piveau.terms.ProvenanceStatement#getProvenanceStatement()
	 * @see #getProvenanceStatement()
	 * @generated
	 */
	EReference getProvenanceStatement_ProvenanceStatement();

	/**
	 * Returns the meta object for class '{@link de.jena.piveau.terms.ProvenanceStatementType <em>Provenance Statement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provenance Statement Type</em>'.
	 * @see de.jena.piveau.terms.ProvenanceStatementType
	 * @generated
	 */
	EClass getProvenanceStatementType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.piveau.terms.ProvenanceStatementType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see de.jena.piveau.terms.ProvenanceStatementType#getDescription()
	 * @see #getProvenanceStatementType()
	 * @generated
	 */
	EReference getProvenanceStatementType_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.piveau.terms.ProvenanceStatementType#getAbout <em>About</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>About</em>'.
	 * @see de.jena.piveau.terms.ProvenanceStatementType#getAbout()
	 * @see #getProvenanceStatementType()
	 * @generated
	 */
	EAttribute getProvenanceStatementType_About();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.piveau.terms.ProvenanceStatementType#getNodeID <em>Node ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node ID</em>'.
	 * @see de.jena.piveau.terms.ProvenanceStatementType#getNodeID()
	 * @see #getProvenanceStatementType()
	 * @generated
	 */
	EAttribute getProvenanceStatementType_NodeID();

	/**
	 * Returns the meta object for class '{@link de.jena.piveau.terms.RightsStatement <em>Rights Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rights Statement</em>'.
	 * @see de.jena.piveau.terms.RightsStatement
	 * @generated
	 */
	EClass getRightsStatement();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.RightsStatement#getRightsStatement <em>Rights Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rights Statement</em>'.
	 * @see de.jena.piveau.terms.RightsStatement#getRightsStatement()
	 * @see #getRightsStatement()
	 * @generated
	 */
	EReference getRightsStatement_RightsStatement();

	/**
	 * Returns the meta object for class '{@link de.jena.piveau.terms.RightsStatementType <em>Rights Statement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rights Statement Type</em>'.
	 * @see de.jena.piveau.terms.RightsStatementType
	 * @generated
	 */
	EClass getRightsStatementType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.piveau.terms.RightsStatementType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Title</em>'.
	 * @see de.jena.piveau.terms.RightsStatementType#getTitle()
	 * @see #getRightsStatementType()
	 * @generated
	 */
	EReference getRightsStatementType_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.piveau.terms.RightsStatementType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see de.jena.piveau.terms.RightsStatementType#getDescription()
	 * @see #getRightsStatementType()
	 * @generated
	 */
	EReference getRightsStatementType_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.piveau.terms.RightsStatementType#getAbout <em>About</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>About</em>'.
	 * @see de.jena.piveau.terms.RightsStatementType#getAbout()
	 * @see #getRightsStatementType()
	 * @generated
	 */
	EAttribute getRightsStatementType_About();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.piveau.terms.RightsStatementType#getNodeID <em>Node ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node ID</em>'.
	 * @see de.jena.piveau.terms.RightsStatementType#getNodeID()
	 * @see #getRightsStatementType()
	 * @generated
	 */
	EAttribute getRightsStatementType_NodeID();

	/**
	 * Returns the meta object for class '{@link de.jena.piveau.terms.Standard <em>Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard</em>'.
	 * @see de.jena.piveau.terms.Standard
	 * @generated
	 */
	EClass getStandard();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.piveau.terms.Standard#getStandard <em>Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Standard</em>'.
	 * @see de.jena.piveau.terms.Standard#getStandard()
	 * @see #getStandard()
	 * @generated
	 */
	EReference getStandard_Standard();

	/**
	 * Returns the meta object for class '{@link de.jena.piveau.terms.StandardType <em>Standard Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Type</em>'.
	 * @see de.jena.piveau.terms.StandardType
	 * @generated
	 */
	EClass getStandardType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.piveau.terms.StandardType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Title</em>'.
	 * @see de.jena.piveau.terms.StandardType#getTitle()
	 * @see #getStandardType()
	 * @generated
	 */
	EReference getStandardType_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.piveau.terms.StandardType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see de.jena.piveau.terms.StandardType#getDescription()
	 * @see #getStandardType()
	 * @generated
	 */
	EReference getStandardType_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.piveau.terms.StandardType#getAbout <em>About</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>About</em>'.
	 * @see de.jena.piveau.terms.StandardType#getAbout()
	 * @see #getStandardType()
	 * @generated
	 */
	EAttribute getStandardType_About();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.piveau.terms.StandardType#getNodeID <em>Node ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node ID</em>'.
	 * @see de.jena.piveau.terms.StandardType#getNodeID()
	 * @see #getStandardType()
	 * @generated
	 */
	EAttribute getStandardType_NodeID();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TermsFactory getTermsFactory();

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
		 * The meta object literal for the '{@link de.jena.piveau.terms.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.piveau.terms.impl.DocumentRootImpl
		 * @see de.jena.piveau.terms.impl.TermsPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Abstract</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ABSTRACT = eINSTANCE.getDocumentRoot_Abstract();

		/**
		 * The meta object literal for the '<em><b>Access Rights</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ACCESS_RIGHTS = eINSTANCE.getDocumentRoot_AccessRights();

		/**
		 * The meta object literal for the '<em><b>Accrual Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ACCRUAL_METHOD = eINSTANCE.getDocumentRoot_AccrualMethod();

		/**
		 * The meta object literal for the '<em><b>Accrual Periodicity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ACCRUAL_PERIODICITY = eINSTANCE.getDocumentRoot_AccrualPeriodicity();

		/**
		 * The meta object literal for the '<em><b>Accrual Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ACCRUAL_POLICY = eINSTANCE.getDocumentRoot_AccrualPolicy();

		/**
		 * The meta object literal for the '<em><b>Alternative</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ALTERNATIVE = eINSTANCE.getDocumentRoot_Alternative();

		/**
		 * The meta object literal for the '<em><b>Audience</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__AUDIENCE = eINSTANCE.getDocumentRoot_Audience();

		/**
		 * The meta object literal for the '<em><b>Available</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__AVAILABLE = eINSTANCE.getDocumentRoot_Available();

		/**
		 * The meta object literal for the '<em><b>Bibliographic Citation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BIBLIOGRAPHIC_CITATION = eINSTANCE.getDocumentRoot_BibliographicCitation();

		/**
		 * The meta object literal for the '<em><b>Conforms To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONFORMS_TO = eINSTANCE.getDocumentRoot_ConformsTo();

		/**
		 * The meta object literal for the '<em><b>Created</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CREATED = eINSTANCE.getDocumentRoot_Created();

		/**
		 * The meta object literal for the '<em><b>Creator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CREATOR = eINSTANCE.getDocumentRoot_Creator();

		/**
		 * The meta object literal for the '<em><b>Date Accepted</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DATE_ACCEPTED = eINSTANCE.getDocumentRoot_DateAccepted();

		/**
		 * The meta object literal for the '<em><b>Date Copyrighted</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DATE_COPYRIGHTED = eINSTANCE.getDocumentRoot_DateCopyrighted();

		/**
		 * The meta object literal for the '<em><b>Date Submitted</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DATE_SUBMITTED = eINSTANCE.getDocumentRoot_DateSubmitted();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DESCRIPTION = eINSTANCE.getDocumentRoot_Description();

		/**
		 * The meta object literal for the '<em><b>Education Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__EDUCATION_LEVEL = eINSTANCE.getDocumentRoot_EducationLevel();

		/**
		 * The meta object literal for the '<em><b>Extent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXTENT = eINSTANCE.getDocumentRoot_Extent();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FORMAT = eINSTANCE.getDocumentRoot_Format();

		/**
		 * The meta object literal for the '<em><b>Has Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__HAS_FORMAT = eINSTANCE.getDocumentRoot_HasFormat();

		/**
		 * The meta object literal for the '<em><b>Has Part</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__HAS_PART = eINSTANCE.getDocumentRoot_HasPart();

		/**
		 * The meta object literal for the '<em><b>Has Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__HAS_VERSION = eINSTANCE.getDocumentRoot_HasVersion();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__IDENTIFIER = eINSTANCE.getDocumentRoot_Identifier();

		/**
		 * The meta object literal for the '<em><b>Instructional Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__INSTRUCTIONAL_METHOD = eINSTANCE.getDocumentRoot_InstructionalMethod();

		/**
		 * The meta object literal for the '<em><b>Is Format Of</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__IS_FORMAT_OF = eINSTANCE.getDocumentRoot_IsFormatOf();

		/**
		 * The meta object literal for the '<em><b>Is Part Of</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__IS_PART_OF = eINSTANCE.getDocumentRoot_IsPartOf();

		/**
		 * The meta object literal for the '<em><b>Is Referenced By</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__IS_REFERENCED_BY = eINSTANCE.getDocumentRoot_IsReferencedBy();

		/**
		 * The meta object literal for the '<em><b>Is Replaced By</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__IS_REPLACED_BY = eINSTANCE.getDocumentRoot_IsReplacedBy();

		/**
		 * The meta object literal for the '<em><b>Is Required By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__IS_REQUIRED_BY = eINSTANCE.getDocumentRoot_IsRequiredBy();

		/**
		 * The meta object literal for the '<em><b>Issued</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ISSUED = eINSTANCE.getDocumentRoot_Issued();

		/**
		 * The meta object literal for the '<em><b>Is Version Of</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__IS_VERSION_OF = eINSTANCE.getDocumentRoot_IsVersionOf();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LANGUAGE = eINSTANCE.getDocumentRoot_Language();

		/**
		 * The meta object literal for the '<em><b>License</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LICENSE = eINSTANCE.getDocumentRoot_License();

		/**
		 * The meta object literal for the '<em><b>Mediator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MEDIATOR = eINSTANCE.getDocumentRoot_Mediator();

		/**
		 * The meta object literal for the '<em><b>Medium</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MEDIUM = eINSTANCE.getDocumentRoot_Medium();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MODIFIED = eINSTANCE.getDocumentRoot_Modified();

		/**
		 * The meta object literal for the '<em><b>Provenance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROVENANCE = eINSTANCE.getDocumentRoot_Provenance();

		/**
		 * The meta object literal for the '<em><b>Publisher</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PUBLISHER = eINSTANCE.getDocumentRoot_Publisher();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REFERENCES = eINSTANCE.getDocumentRoot_References();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RELATION = eINSTANCE.getDocumentRoot_Relation();

		/**
		 * The meta object literal for the '<em><b>Replaces</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REPLACES = eINSTANCE.getDocumentRoot_Replaces();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__REQUIRES = eINSTANCE.getDocumentRoot_Requires();

		/**
		 * The meta object literal for the '<em><b>Rights</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RIGHTS = eINSTANCE.getDocumentRoot_Rights();

		/**
		 * The meta object literal for the '<em><b>Rights Holder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RIGHTS_HOLDER = eINSTANCE.getDocumentRoot_RightsHolder();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SOURCE = eINSTANCE.getDocumentRoot_Source();

		/**
		 * The meta object literal for the '<em><b>Spatial</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SPATIAL = eINSTANCE.getDocumentRoot_Spatial();

		/**
		 * The meta object literal for the '<em><b>Table Of Contents</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TABLE_OF_CONTENTS = eINSTANCE.getDocumentRoot_TableOfContents();

		/**
		 * The meta object literal for the '<em><b>Temporal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TEMPORAL = eINSTANCE.getDocumentRoot_Temporal();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TITLE = eINSTANCE.getDocumentRoot_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TYPE = eINSTANCE.getDocumentRoot_Type();

		/**
		 * The meta object literal for the '<em><b>Valid</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__VALID = eINSTANCE.getDocumentRoot_Valid();

		/**
		 * The meta object literal for the '{@link de.jena.piveau.terms.impl.LicenseDocumentImpl <em>License Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.piveau.terms.impl.LicenseDocumentImpl
		 * @see de.jena.piveau.terms.impl.TermsPackageImpl#getLicenseDocument()
		 * @generated
		 */
		EClass LICENSE_DOCUMENT = eINSTANCE.getLicenseDocument();

		/**
		 * The meta object literal for the '<em><b>License Document</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LICENSE_DOCUMENT__LICENSE_DOCUMENT = eINSTANCE.getLicenseDocument_LicenseDocument();

		/**
		 * The meta object literal for the '{@link de.jena.piveau.terms.impl.LicenseDocumentTypeImpl <em>License Document Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.piveau.terms.impl.LicenseDocumentTypeImpl
		 * @see de.jena.piveau.terms.impl.TermsPackageImpl#getLicenseDocumentType()
		 * @generated
		 */
		EClass LICENSE_DOCUMENT_TYPE = eINSTANCE.getLicenseDocumentType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LICENSE_DOCUMENT_TYPE__TYPE = eINSTANCE.getLicenseDocumentType_Type();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LICENSE_DOCUMENT_TYPE__TITLE = eINSTANCE.getLicenseDocumentType_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LICENSE_DOCUMENT_TYPE__DESCRIPTION = eINSTANCE.getLicenseDocumentType_Description();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LICENSE_DOCUMENT_TYPE__IDENTIFIER = eINSTANCE.getLicenseDocumentType_Identifier();

		/**
		 * The meta object literal for the '<em><b>Node ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE_DOCUMENT_TYPE__NODE_ID = eINSTANCE.getLicenseDocumentType_NodeID();

		/**
		 * The meta object literal for the '{@link de.jena.piveau.terms.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.piveau.terms.impl.LocationImpl
		 * @see de.jena.piveau.terms.impl.TermsPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__LOCATION = eINSTANCE.getLocation_Location();

		/**
		 * The meta object literal for the '{@link de.jena.piveau.terms.impl.LocationTypeImpl <em>Location Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.piveau.terms.impl.LocationTypeImpl
		 * @see de.jena.piveau.terms.impl.TermsPackageImpl#getLocationType()
		 * @generated
		 */
		EClass LOCATION_TYPE = eINSTANCE.getLocationType();

		/**
		 * The meta object literal for the '<em><b>Geometry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_TYPE__GEOMETRY = eINSTANCE.getLocationType_Geometry();

		/**
		 * The meta object literal for the '<em><b>Pref Label</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_TYPE__PREF_LABEL = eINSTANCE.getLocationType_PrefLabel();

		/**
		 * The meta object literal for the '<em><b>About</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_TYPE__ABOUT = eINSTANCE.getLocationType_About();

		/**
		 * The meta object literal for the '<em><b>Node ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_TYPE__NODE_ID = eINSTANCE.getLocationType_NodeID();

		/**
		 * The meta object literal for the '{@link de.jena.piveau.terms.impl.PeriodOfTimeImpl <em>Period Of Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.piveau.terms.impl.PeriodOfTimeImpl
		 * @see de.jena.piveau.terms.impl.TermsPackageImpl#getPeriodOfTime()
		 * @generated
		 */
		EClass PERIOD_OF_TIME = eINSTANCE.getPeriodOfTime();

		/**
		 * The meta object literal for the '<em><b>Period Of Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIOD_OF_TIME__PERIOD_OF_TIME = eINSTANCE.getPeriodOfTime_PeriodOfTime();

		/**
		 * The meta object literal for the '{@link de.jena.piveau.terms.impl.PeriodOfTimeTypeImpl <em>Period Of Time Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.piveau.terms.impl.PeriodOfTimeTypeImpl
		 * @see de.jena.piveau.terms.impl.TermsPackageImpl#getPeriodOfTimeType()
		 * @generated
		 */
		EClass PERIOD_OF_TIME_TYPE = eINSTANCE.getPeriodOfTimeType();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIOD_OF_TIME_TYPE__START_DATE = eINSTANCE.getPeriodOfTimeType_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIOD_OF_TIME_TYPE__END_DATE = eINSTANCE.getPeriodOfTimeType_EndDate();

		/**
		 * The meta object literal for the '<em><b>About</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIOD_OF_TIME_TYPE__ABOUT = eINSTANCE.getPeriodOfTimeType_About();

		/**
		 * The meta object literal for the '<em><b>Node ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIOD_OF_TIME_TYPE__NODE_ID = eINSTANCE.getPeriodOfTimeType_NodeID();

		/**
		 * The meta object literal for the '{@link de.jena.piveau.terms.impl.ProvenanceStatementImpl <em>Provenance Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.piveau.terms.impl.ProvenanceStatementImpl
		 * @see de.jena.piveau.terms.impl.TermsPackageImpl#getProvenanceStatement()
		 * @generated
		 */
		EClass PROVENANCE_STATEMENT = eINSTANCE.getProvenanceStatement();

		/**
		 * The meta object literal for the '<em><b>Provenance Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVENANCE_STATEMENT__PROVENANCE_STATEMENT = eINSTANCE.getProvenanceStatement_ProvenanceStatement();

		/**
		 * The meta object literal for the '{@link de.jena.piveau.terms.impl.ProvenanceStatementTypeImpl <em>Provenance Statement Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.piveau.terms.impl.ProvenanceStatementTypeImpl
		 * @see de.jena.piveau.terms.impl.TermsPackageImpl#getProvenanceStatementType()
		 * @generated
		 */
		EClass PROVENANCE_STATEMENT_TYPE = eINSTANCE.getProvenanceStatementType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVENANCE_STATEMENT_TYPE__DESCRIPTION = eINSTANCE.getProvenanceStatementType_Description();

		/**
		 * The meta object literal for the '<em><b>About</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVENANCE_STATEMENT_TYPE__ABOUT = eINSTANCE.getProvenanceStatementType_About();

		/**
		 * The meta object literal for the '<em><b>Node ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVENANCE_STATEMENT_TYPE__NODE_ID = eINSTANCE.getProvenanceStatementType_NodeID();

		/**
		 * The meta object literal for the '{@link de.jena.piveau.terms.impl.RightsStatementImpl <em>Rights Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.piveau.terms.impl.RightsStatementImpl
		 * @see de.jena.piveau.terms.impl.TermsPackageImpl#getRightsStatement()
		 * @generated
		 */
		EClass RIGHTS_STATEMENT = eINSTANCE.getRightsStatement();

		/**
		 * The meta object literal for the '<em><b>Rights Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIGHTS_STATEMENT__RIGHTS_STATEMENT = eINSTANCE.getRightsStatement_RightsStatement();

		/**
		 * The meta object literal for the '{@link de.jena.piveau.terms.impl.RightsStatementTypeImpl <em>Rights Statement Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.piveau.terms.impl.RightsStatementTypeImpl
		 * @see de.jena.piveau.terms.impl.TermsPackageImpl#getRightsStatementType()
		 * @generated
		 */
		EClass RIGHTS_STATEMENT_TYPE = eINSTANCE.getRightsStatementType();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIGHTS_STATEMENT_TYPE__TITLE = eINSTANCE.getRightsStatementType_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIGHTS_STATEMENT_TYPE__DESCRIPTION = eINSTANCE.getRightsStatementType_Description();

		/**
		 * The meta object literal for the '<em><b>About</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIGHTS_STATEMENT_TYPE__ABOUT = eINSTANCE.getRightsStatementType_About();

		/**
		 * The meta object literal for the '<em><b>Node ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIGHTS_STATEMENT_TYPE__NODE_ID = eINSTANCE.getRightsStatementType_NodeID();

		/**
		 * The meta object literal for the '{@link de.jena.piveau.terms.impl.StandardImpl <em>Standard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.piveau.terms.impl.StandardImpl
		 * @see de.jena.piveau.terms.impl.TermsPackageImpl#getStandard()
		 * @generated
		 */
		EClass STANDARD = eINSTANCE.getStandard();

		/**
		 * The meta object literal for the '<em><b>Standard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STANDARD__STANDARD = eINSTANCE.getStandard_Standard();

		/**
		 * The meta object literal for the '{@link de.jena.piveau.terms.impl.StandardTypeImpl <em>Standard Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.piveau.terms.impl.StandardTypeImpl
		 * @see de.jena.piveau.terms.impl.TermsPackageImpl#getStandardType()
		 * @generated
		 */
		EClass STANDARD_TYPE = eINSTANCE.getStandardType();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STANDARD_TYPE__TITLE = eINSTANCE.getStandardType_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STANDARD_TYPE__DESCRIPTION = eINSTANCE.getStandardType_Description();

		/**
		 * The meta object literal for the '<em><b>About</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_TYPE__ABOUT = eINSTANCE.getStandardType_About();

		/**
		 * The meta object literal for the '<em><b>Node ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_TYPE__NODE_ID = eINSTANCE.getStandardType_NodeID();

	}

} //TermsPackage
