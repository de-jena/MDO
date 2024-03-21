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
package de.jena.piveau.dcat;

import de.jena.piveau.foaf.Agent;
import de.jena.piveau.foaf.Document;

import de.jena.piveau.rdf.DateOrDateTimeLiteral;
import de.jena.piveau.rdf.PlainLiteral;
import de.jena.piveau.rdf.Resource;

import de.jena.piveau.skos.Concept;

import de.jena.piveau.terms.LicenseDocument;
import de.jena.piveau.terms.RightsStatement;
import de.jena.piveau.terms.Standard;

import de.jena.piveau.vcard.Organization;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         dcat:Resource represents a dataset, a data service or any other resource
 *         that may be described by a metadata record in a catalog.
 * 
 *         This class is not intended to be used directly, but is the parent class of dcat:Dataset,
 *         dcat:DataService and dcat:Catalog.
 * 
 *         Member items in a catalog should be members of one of the sub-classes, or of a
 *         sub-class of these, or of a sub-class of dcat:Resource defined in a
 *         DCAT profile or other DCAT application.
 * 
 *         dcat:Resource is effectively an extension point for defining
 *         a catalog of any kind of resource. dcat:Dataset and dcat:DataService
 *         can be used for datasets and services which are not documented in any catalog.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.piveau.dcat.DcatResource#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.DcatResource#getTitle <em>Title</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.DcatResource#getDescription <em>Description</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.DcatResource#getTheme <em>Theme</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.DcatResource#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.DcatResource#getType <em>Type</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.DcatResource#getContactPoint <em>Contact Point</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.DcatResource#getCreator <em>Creator</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.DcatResource#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.DcatResource#getIssued <em>Issued</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.DcatResource#getModified <em>Modified</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.DcatResource#getLandingPage <em>Landing Page</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.DcatResource#getAccessRights <em>Access Rights</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.DcatResource#getConformsTo <em>Conforms To</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.DcatResource#getLicense <em>License</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.DcatResource#getRights <em>Rights</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.DcatResource#getHasPolicy <em>Has Policy</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.DcatResource#getQualifiedAttribution <em>Qualified Attribution</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.DcatResource#getRelation <em>Relation</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.DcatResource#getQualifiedRelation <em>Qualified Relation</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.DcatResource#getIsReferencedBy <em>Is Referenced By</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.DcatResource#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @see de.jena.piveau.dcat.DcatPackage#getDcatResource()
 * @model abstract="true"
 *        extendedMetaData="name='ResourceType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DcatResource extends Resource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.piveau.rdf.PlainLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see de.jena.piveau.dcat.DcatPackage#getDcatResource_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='http://purl.org/dc/terms/'"
	 * @generated
	 */
	EList<PlainLiteral> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.piveau.rdf.PlainLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference list.
	 * @see de.jena.piveau.dcat.DcatPackage#getDcatResource_Title()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='title' namespace='http://purl.org/dc/terms/'"
	 * @generated
	 */
	EList<PlainLiteral> getTitle();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.piveau.rdf.PlainLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference list.
	 * @see de.jena.piveau.dcat.DcatPackage#getDcatResource_Description()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='description' namespace='http://purl.org/dc/terms/'"
	 * @generated
	 */
	EList<PlainLiteral> getDescription();

	/**
	 * Returns the value of the '<em><b>Theme</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.piveau.skos.Concept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Theme</em>' containment reference list.
	 * @see de.jena.piveau.dcat.DcatPackage#getDcatResource_Theme()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='theme' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Concept> getTheme();

	/**
	 * Returns the value of the '<em><b>Keyword</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.piveau.rdf.PlainLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keyword</em>' containment reference list.
	 * @see de.jena.piveau.dcat.DcatPackage#getDcatResource_Keyword()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='keyword' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PlainLiteral> getKeyword();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.piveau.skos.Concept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see de.jena.piveau.dcat.DcatPackage#getDcatResource_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='http://purl.org/dc/terms/'"
	 * @generated
	 */
	EList<Concept> getType();

	/**
	 * Returns the value of the '<em><b>Contact Point</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.piveau.vcard.Organization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Point</em>' containment reference list.
	 * @see de.jena.piveau.dcat.DcatPackage#getDcatResource_ContactPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contactPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Organization> getContactPoint();

	/**
	 * Returns the value of the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creator</em>' containment reference.
	 * @see #setCreator(Agent)
	 * @see de.jena.piveau.dcat.DcatPackage#getDcatResource_Creator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='creator' namespace='http://purl.org/dc/terms/'"
	 * @generated
	 */
	Agent getCreator();

	/**
	 * Sets the value of the '{@link de.jena.piveau.dcat.DcatResource#getCreator <em>Creator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creator</em>' containment reference.
	 * @see #getCreator()
	 * @generated
	 */
	void setCreator(Agent value);

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher</em>' containment reference.
	 * @see #setPublisher(Agent)
	 * @see de.jena.piveau.dcat.DcatPackage#getDcatResource_Publisher()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='publisher' namespace='http://purl.org/dc/terms/'"
	 * @generated
	 */
	Agent getPublisher();

	/**
	 * Sets the value of the '{@link de.jena.piveau.dcat.DcatResource#getPublisher <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' containment reference.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(Agent value);

	/**
	 * Returns the value of the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issued</em>' containment reference.
	 * @see #setIssued(DateOrDateTimeLiteral)
	 * @see de.jena.piveau.dcat.DcatPackage#getDcatResource_Issued()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='issued' namespace='http://purl.org/dc/terms/'"
	 * @generated
	 */
	DateOrDateTimeLiteral getIssued();

	/**
	 * Sets the value of the '{@link de.jena.piveau.dcat.DcatResource#getIssued <em>Issued</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issued</em>' containment reference.
	 * @see #getIssued()
	 * @generated
	 */
	void setIssued(DateOrDateTimeLiteral value);

	/**
	 * Returns the value of the '<em><b>Modified</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified</em>' containment reference.
	 * @see #setModified(DateOrDateTimeLiteral)
	 * @see de.jena.piveau.dcat.DcatPackage#getDcatResource_Modified()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modified' namespace='http://purl.org/dc/terms/'"
	 * @generated
	 */
	DateOrDateTimeLiteral getModified();

	/**
	 * Sets the value of the '{@link de.jena.piveau.dcat.DcatResource#getModified <em>Modified</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified</em>' containment reference.
	 * @see #getModified()
	 * @generated
	 */
	void setModified(DateOrDateTimeLiteral value);

	/**
	 * Returns the value of the '<em><b>Landing Page</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.piveau.foaf.Document}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Landing Page</em>' containment reference list.
	 * @see de.jena.piveau.dcat.DcatPackage#getDcatResource_LandingPage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='landingPage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Document> getLandingPage();

	/**
	 * Returns the value of the '<em><b>Access Rights</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Rights</em>' containment reference.
	 * @see #setAccessRights(Concept)
	 * @see de.jena.piveau.dcat.DcatPackage#getDcatResource_AccessRights()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='accessRights' namespace='http://purl.org/dc/terms/'"
	 * @generated
	 */
	Concept getAccessRights();

	/**
	 * Sets the value of the '{@link de.jena.piveau.dcat.DcatResource#getAccessRights <em>Access Rights</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Rights</em>' containment reference.
	 * @see #getAccessRights()
	 * @generated
	 */
	void setAccessRights(Concept value);

	/**
	 * Returns the value of the '<em><b>Conforms To</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.piveau.terms.Standard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conforms To</em>' containment reference list.
	 * @see de.jena.piveau.dcat.DcatPackage#getDcatResource_ConformsTo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='conformsTo' namespace='http://purl.org/dc/terms/'"
	 * @generated
	 */
	EList<Standard> getConformsTo();

	/**
	 * Returns the value of the '<em><b>License</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License</em>' containment reference.
	 * @see #setLicense(LicenseDocument)
	 * @see de.jena.piveau.dcat.DcatPackage#getDcatResource_License()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='license' namespace='http://purl.org/dc/terms/'"
	 * @generated
	 */
	LicenseDocument getLicense();

	/**
	 * Sets the value of the '{@link de.jena.piveau.dcat.DcatResource#getLicense <em>License</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License</em>' containment reference.
	 * @see #getLicense()
	 * @generated
	 */
	void setLicense(LicenseDocument value);

	/**
	 * Returns the value of the '<em><b>Rights</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.piveau.terms.RightsStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rights</em>' containment reference list.
	 * @see de.jena.piveau.dcat.DcatPackage#getDcatResource_Rights()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rights' namespace='http://purl.org/dc/terms/'"
	 * @generated
	 */
	EList<RightsStatement> getRights();

	/**
	 * Returns the value of the '<em><b>Has Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Policy</em>' attribute.
	 * @see #setHasPolicy(String)
	 * @see de.jena.piveau.dcat.DcatPackage#getDcatResource_HasPolicy()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='hasPolicy' namespace='http://www.w3.org/ns/odrl/2/'"
	 * @generated
	 */
	String getHasPolicy();

	/**
	 * Sets the value of the '{@link de.jena.piveau.dcat.DcatResource#getHasPolicy <em>Has Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Policy</em>' attribute.
	 * @see #getHasPolicy()
	 * @generated
	 */
	void setHasPolicy(String value);

	/**
	 * Returns the value of the '<em><b>Qualified Attribution</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified Attribution</em>' attribute list.
	 * @see de.jena.piveau.dcat.DcatPackage#getDcatResource_QualifiedAttribution()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='qualifiedAttribution' namespace='http://www.w3.org/ns/prov#'"
	 * @generated
	 */
	EList<String> getQualifiedAttribution();

	/**
	 * Returns the value of the '<em><b>Relation</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.piveau.rdf.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' containment reference list.
	 * @see de.jena.piveau.dcat.DcatPackage#getDcatResource_Relation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relation' namespace='http://purl.org/dc/terms/'"
	 * @generated
	 */
	EList<Resource> getRelation();

	/**
	 * Returns the value of the '<em><b>Qualified Relation</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.piveau.dcat.Relationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified Relation</em>' containment reference list.
	 * @see de.jena.piveau.dcat.DcatPackage#getDcatResource_QualifiedRelation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='qualifiedRelation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Relationship> getQualifiedRelation();

	/**
	 * Returns the value of the '<em><b>Is Referenced By</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.piveau.rdf.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Referenced By</em>' containment reference list.
	 * @see de.jena.piveau.dcat.DcatPackage#getDcatResource_IsReferencedBy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='isReferencedBy' namespace='http://purl.org/dc/terms/'"
	 * @generated
	 */
	EList<Resource> getIsReferencedBy();

	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.piveau.rdf.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' containment reference list.
	 * @see de.jena.piveau.dcat.DcatPackage#getDcatResource_Language()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='language' namespace='http://purl.org/dc/terms/'"
	 * @generated
	 */
	EList<Resource> getLanguage();

} // DcatResource
