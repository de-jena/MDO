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

import de.jena.piveau.rdf.DateOrDateTimeLiteral;
import de.jena.piveau.rdf.PlainLiteral;
import de.jena.piveau.rdf.Resource;

import de.jena.piveau.skos.Concept;

import de.jena.piveau.terms.LicenseDocumentType;
import de.jena.piveau.terms.RightsStatement;
import de.jena.piveau.terms.Standard;

import java.math.BigDecimal;

import javax.xml.datatype.Duration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.piveau.dcat.Distribution#getTitle <em>Title</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.Distribution#getDescription <em>Description</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.Distribution#getAccessService <em>Access Service</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.Distribution#getFormat <em>Format</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.Distribution#getMediaType <em>Media Type</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.Distribution#getPackageFormat <em>Package Format</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.Distribution#getByteSize <em>Byte Size</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.Distribution#getCompressFormat <em>Compress Format</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.Distribution#getSpatialResolutionInMeters <em>Spatial Resolution In Meters</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.Distribution#getTemporalResolution <em>Temporal Resolution</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.Distribution#getAccessRights <em>Access Rights</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.Distribution#getLicense <em>License</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.Distribution#getConformsTo <em>Conforms To</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.Distribution#getRights <em>Rights</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.Distribution#getHasPolicy <em>Has Policy</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.Distribution#getIssued <em>Issued</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.Distribution#getModified <em>Modified</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.Distribution#getNodeID <em>Node ID</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.Distribution#getDownloadURL <em>Download URL</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.Distribution#getAccessURL <em>Access URL</em>}</li>
 *   <li>{@link de.jena.piveau.dcat.Distribution#getLicenseAttributionByText <em>License Attribution By Text</em>}</li>
 * </ul>
 *
 * @see de.jena.piveau.dcat.DcatPackage#getDistribution()
 * @model extendedMetaData="name='Distribution' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Distribution extends Resource {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(PlainLiteral)
	 * @see de.jena.piveau.dcat.DcatPackage#getDistribution_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='title' namespace='http://purl.org/dc/terms/'"
	 * @generated
	 */
	PlainLiteral getTitle();

	/**
	 * Sets the value of the '{@link de.jena.piveau.dcat.Distribution#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(PlainLiteral value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.piveau.rdf.PlainLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference list.
	 * @see de.jena.piveau.dcat.DcatPackage#getDistribution_Description()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='description' namespace='http://purl.org/dc/terms/'"
	 * @generated
	 */
	EList<PlainLiteral> getDescription();

	/**
	 * Returns the value of the '<em><b>Access Service</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.piveau.dcat.DataService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Service</em>' containment reference list.
	 * @see de.jena.piveau.dcat.DcatPackage#getDistribution_AccessService()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='accessService' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DataService> getAccessService();

	/**
	 * Returns the value of the '<em><b>Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' containment reference.
	 * @see #setFormat(Concept)
	 * @see de.jena.piveau.dcat.DcatPackage#getDistribution_Format()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='format' namespace='http://purl.org/dc/terms/'"
	 * @generated
	 */
	Concept getFormat();

	/**
	 * Sets the value of the '{@link de.jena.piveau.dcat.Distribution#getFormat <em>Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' containment reference.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(Concept value);

	/**
	 * Returns the value of the '<em><b>Media Type</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Media Type</em>' attribute list.
	 * @see de.jena.piveau.dcat.DcatPackage#getDistribution_MediaType()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='mediaType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getMediaType();

	/**
	 * Returns the value of the '<em><b>Package Format</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Format</em>' attribute list.
	 * @see de.jena.piveau.dcat.DcatPackage#getDistribution_PackageFormat()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='packageFormat' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getPackageFormat();

	/**
	 * Returns the value of the '<em><b>Byte Size</b></em>' attribute list.
	 * The list contents are of type {@link java.math.BigDecimal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Byte Size</em>' attribute list.
	 * @see de.jena.piveau.dcat.DcatPackage#getDistribution_ByteSize()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Decimal" required="true"
	 *        extendedMetaData="kind='element' name='byteSize' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BigDecimal> getByteSize();

	/**
	 * Returns the value of the '<em><b>Compress Format</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compress Format</em>' containment reference list.
	 * @see de.jena.piveau.dcat.DcatPackage#getDistribution_CompressFormat()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='compressFormat' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EObject> getCompressFormat();

	/**
	 * Returns the value of the '<em><b>Spatial Resolution In Meters</b></em>' attribute list.
	 * The list contents are of type {@link java.math.BigDecimal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spatial Resolution In Meters</em>' attribute list.
	 * @see de.jena.piveau.dcat.DcatPackage#getDistribution_SpatialResolutionInMeters()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Decimal" required="true"
	 *        extendedMetaData="kind='element' name='spatialResolutionInMeters' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BigDecimal> getSpatialResolutionInMeters();

	/**
	 * Returns the value of the '<em><b>Temporal Resolution</b></em>' attribute list.
	 * The list contents are of type {@link javax.xml.datatype.Duration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal Resolution</em>' attribute list.
	 * @see de.jena.piveau.dcat.DcatPackage#getDistribution_TemporalResolution()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Duration" required="true"
	 *        extendedMetaData="kind='element' name='temporalResolution' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Duration> getTemporalResolution();

	/**
	 * Returns the value of the '<em><b>Access Rights</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.piveau.skos.Concept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Rights</em>' containment reference list.
	 * @see de.jena.piveau.dcat.DcatPackage#getDistribution_AccessRights()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='accessRights' namespace='http://purl.org/dc/terms/'"
	 * @generated
	 */
	EList<Concept> getAccessRights();

	/**
	 * Returns the value of the '<em><b>License</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License</em>' containment reference.
	 * @see #setLicense(LicenseDocumentType)
	 * @see de.jena.piveau.dcat.DcatPackage#getDistribution_License()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='license' namespace='http://purl.org/dc/terms/'"
	 * @generated
	 */
	LicenseDocumentType getLicense();

	/**
	 * Sets the value of the '{@link de.jena.piveau.dcat.Distribution#getLicense <em>License</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License</em>' containment reference.
	 * @see #getLicense()
	 * @generated
	 */
	void setLicense(LicenseDocumentType value);

	/**
	 * Returns the value of the '<em><b>Conforms To</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.piveau.terms.Standard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conforms To</em>' containment reference list.
	 * @see de.jena.piveau.dcat.DcatPackage#getDistribution_ConformsTo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='conformsTo' namespace='http://purl.org/dc/terms/'"
	 * @generated
	 */
	EList<Standard> getConformsTo();

	/**
	 * Returns the value of the '<em><b>Rights</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rights</em>' containment reference.
	 * @see #setRights(RightsStatement)
	 * @see de.jena.piveau.dcat.DcatPackage#getDistribution_Rights()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rights' namespace='http://purl.org/dc/terms/'"
	 * @generated
	 */
	RightsStatement getRights();

	/**
	 * Sets the value of the '{@link de.jena.piveau.dcat.Distribution#getRights <em>Rights</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rights</em>' containment reference.
	 * @see #getRights()
	 * @generated
	 */
	void setRights(RightsStatement value);

	/**
	 * Returns the value of the '<em><b>Has Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Policy</em>' attribute.
	 * @see #setHasPolicy(String)
	 * @see de.jena.piveau.dcat.DcatPackage#getDistribution_HasPolicy()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='hasPolicy' namespace='http://www.w3.org/ns/odrl/2/'"
	 * @generated
	 */
	String getHasPolicy();

	/**
	 * Sets the value of the '{@link de.jena.piveau.dcat.Distribution#getHasPolicy <em>Has Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Policy</em>' attribute.
	 * @see #getHasPolicy()
	 * @generated
	 */
	void setHasPolicy(String value);

	/**
	 * Returns the value of the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issued</em>' containment reference.
	 * @see #setIssued(DateOrDateTimeLiteral)
	 * @see de.jena.piveau.dcat.DcatPackage#getDistribution_Issued()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='issued' namespace='http://purl.org/dc/terms/'"
	 * @generated
	 */
	DateOrDateTimeLiteral getIssued();

	/**
	 * Sets the value of the '{@link de.jena.piveau.dcat.Distribution#getIssued <em>Issued</em>}' containment reference.
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
	 * @see de.jena.piveau.dcat.DcatPackage#getDistribution_Modified()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modified' namespace='http://purl.org/dc/terms/'"
	 * @generated
	 */
	DateOrDateTimeLiteral getModified();

	/**
	 * Sets the value of the '{@link de.jena.piveau.dcat.Distribution#getModified <em>Modified</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified</em>' containment reference.
	 * @see #getModified()
	 * @generated
	 */
	void setModified(DateOrDateTimeLiteral value);

	/**
	 * Returns the value of the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node ID</em>' attribute.
	 * @see #setNodeID(String)
	 * @see de.jena.piveau.dcat.DcatPackage#getDistribution_NodeID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        extendedMetaData="kind='attribute' name='nodeID' namespace='http://www.w3.org/1999/02/22-rdf-syntax-ns#'"
	 * @generated
	 */
	String getNodeID();

	/**
	 * Sets the value of the '{@link de.jena.piveau.dcat.Distribution#getNodeID <em>Node ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node ID</em>' attribute.
	 * @see #getNodeID()
	 * @generated
	 */
	void setNodeID(String value);

	/**
	 * Returns the value of the '<em><b>Download URL</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.piveau.rdf.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Download URL</em>' containment reference list.
	 * @see de.jena.piveau.dcat.DcatPackage#getDistribution_DownloadURL()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='downloadURL' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Resource> getDownloadURL();

	/**
	 * Returns the value of the '<em><b>Access URL</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.piveau.rdf.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access URL</em>' containment reference list.
	 * @see de.jena.piveau.dcat.DcatPackage#getDistribution_AccessURL()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='accessURL' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Resource> getAccessURL();

	/**
	 * Returns the value of the '<em><b>License Attribution By Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License Attribution By Text</em>' containment reference.
	 * @see #setLicenseAttributionByText(PlainLiteral)
	 * @see de.jena.piveau.dcat.DcatPackage#getDistribution_LicenseAttributionByText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='licenseAttributionByText' namespace='http://dcat-ap.de/def/dcatde/'"
	 * @generated
	 */
	PlainLiteral getLicenseAttributionByText();

	/**
	 * Sets the value of the '{@link de.jena.piveau.dcat.Distribution#getLicenseAttributionByText <em>License Attribution By Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License Attribution By Text</em>' containment reference.
	 * @see #getLicenseAttributionByText()
	 * @generated
	 */
	void setLicenseAttributionByText(PlainLiteral value);

} // Distribution
