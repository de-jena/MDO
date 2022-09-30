/**
 */
package org.w3.ns.dcat;

import java.math.BigDecimal;

import javax.xml.datatype.Duration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.purl.dc.terms.terms.LicenseDocument;
import org.purl.dc.terms.terms.RightsStatement;
import org.purl.dc.terms.terms.Standard;

import org.w3.ns.rdf.DateOrDateTimeLiteral;
import org.w3.ns.rdf.PlainLiteral;
import org.w3.ns.rdf.Resource;

import org.w3.ns.skos.Concept;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distribution Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.ns.dcat.DistributionType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.w3.ns.dcat.DistributionType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.w3.ns.dcat.DistributionType#getAccessService <em>Access Service</em>}</li>
 *   <li>{@link org.w3.ns.dcat.DistributionType#getAccessURL <em>Access URL</em>}</li>
 *   <li>{@link org.w3.ns.dcat.DistributionType#getDownloadURL <em>Download URL</em>}</li>
 *   <li>{@link org.w3.ns.dcat.DistributionType#getFormat <em>Format</em>}</li>
 *   <li>{@link org.w3.ns.dcat.DistributionType#getMediaType <em>Media Type</em>}</li>
 *   <li>{@link org.w3.ns.dcat.DistributionType#getPackageFormat <em>Package Format</em>}</li>
 *   <li>{@link org.w3.ns.dcat.DistributionType#getByteSize <em>Byte Size</em>}</li>
 *   <li>{@link org.w3.ns.dcat.DistributionType#getCompressFormat <em>Compress Format</em>}</li>
 *   <li>{@link org.w3.ns.dcat.DistributionType#getSpatialResolutionInMeters <em>Spatial Resolution In Meters</em>}</li>
 *   <li>{@link org.w3.ns.dcat.DistributionType#getTemporalResolution <em>Temporal Resolution</em>}</li>
 *   <li>{@link org.w3.ns.dcat.DistributionType#getAccessRights <em>Access Rights</em>}</li>
 *   <li>{@link org.w3.ns.dcat.DistributionType#getLicense <em>License</em>}</li>
 *   <li>{@link org.w3.ns.dcat.DistributionType#getConformsTo <em>Conforms To</em>}</li>
 *   <li>{@link org.w3.ns.dcat.DistributionType#getRights <em>Rights</em>}</li>
 *   <li>{@link org.w3.ns.dcat.DistributionType#getHasPolicy <em>Has Policy</em>}</li>
 *   <li>{@link org.w3.ns.dcat.DistributionType#getIssued <em>Issued</em>}</li>
 *   <li>{@link org.w3.ns.dcat.DistributionType#getModified <em>Modified</em>}</li>
 *   <li>{@link org.w3.ns.dcat.DistributionType#getAbout <em>About</em>}</li>
 *   <li>{@link org.w3.ns.dcat.DistributionType#getNodeID <em>Node ID</em>}</li>
 * </ul>
 *
 * @see org.w3.ns.dcat.DcatPackage#getDistributionType()
 * @model extendedMetaData="name='Distribution_._type' kind='elementOnly'"
 * @generated
 */
public interface DistributionType extends Resource {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(PlainLiteral)
	 * @see org.w3.ns.dcat.DcatPackage#getDistributionType_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='title' namespace='http://purl.org/dc/terms/'"
	 * @generated
	 */
	PlainLiteral getTitle();

	/**
	 * Sets the value of the '{@link org.w3.ns.dcat.DistributionType#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(PlainLiteral value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3.ns.rdf.PlainLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference list.
	 * @see org.w3.ns.dcat.DcatPackage#getDistributionType_Description()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='description' namespace='http://purl.org/dc/terms/'"
	 * @generated
	 */
	EList<PlainLiteral> getDescription();

	/**
	 * Returns the value of the '<em><b>Access Service</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3.ns.dcat.DataServiceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Service</em>' containment reference list.
	 * @see org.w3.ns.dcat.DcatPackage#getDistributionType_AccessService()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='accessService' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DataServiceType> getAccessService();

	/**
	 * Returns the value of the '<em><b>Access URL</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access URL</em>' attribute list.
	 * @see org.w3.ns.dcat.DcatPackage#getDistributionType_AccessURL()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='accessURL' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getAccessURL();

	/**
	 * Returns the value of the '<em><b>Download URL</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Download URL</em>' attribute list.
	 * @see org.w3.ns.dcat.DcatPackage#getDistributionType_DownloadURL()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='downloadURL' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getDownloadURL();

	/**
	 * Returns the value of the '<em><b>Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' containment reference.
	 * @see #setFormat(Concept)
	 * @see org.w3.ns.dcat.DcatPackage#getDistributionType_Format()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='format' namespace='http://purl.org/dc/terms/'"
	 * @generated
	 */
	Concept getFormat();

	/**
	 * Sets the value of the '{@link org.w3.ns.dcat.DistributionType#getFormat <em>Format</em>}' containment reference.
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
	 * @see org.w3.ns.dcat.DcatPackage#getDistributionType_MediaType()
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
	 * @see org.w3.ns.dcat.DcatPackage#getDistributionType_PackageFormat()
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
	 * @see org.w3.ns.dcat.DcatPackage#getDistributionType_ByteSize()
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
	 * @see org.w3.ns.dcat.DcatPackage#getDistributionType_CompressFormat()
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
	 * @see org.w3.ns.dcat.DcatPackage#getDistributionType_SpatialResolutionInMeters()
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
	 * @see org.w3.ns.dcat.DcatPackage#getDistributionType_TemporalResolution()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Duration" required="true"
	 *        extendedMetaData="kind='element' name='temporalResolution' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Duration> getTemporalResolution();

	/**
	 * Returns the value of the '<em><b>Access Rights</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3.ns.skos.Concept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Rights</em>' containment reference list.
	 * @see org.w3.ns.dcat.DcatPackage#getDistributionType_AccessRights()
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
	 * @see #setLicense(LicenseDocument)
	 * @see org.w3.ns.dcat.DcatPackage#getDistributionType_License()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='license' namespace='http://purl.org/dc/terms/'"
	 * @generated
	 */
	LicenseDocument getLicense();

	/**
	 * Sets the value of the '{@link org.w3.ns.dcat.DistributionType#getLicense <em>License</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License</em>' containment reference.
	 * @see #getLicense()
	 * @generated
	 */
	void setLicense(LicenseDocument value);

	/**
	 * Returns the value of the '<em><b>Conforms To</b></em>' containment reference list.
	 * The list contents are of type {@link org.purl.dc.terms.terms.Standard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conforms To</em>' containment reference list.
	 * @see org.w3.ns.dcat.DcatPackage#getDistributionType_ConformsTo()
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
	 * @see org.w3.ns.dcat.DcatPackage#getDistributionType_Rights()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rights' namespace='http://purl.org/dc/terms/'"
	 * @generated
	 */
	RightsStatement getRights();

	/**
	 * Sets the value of the '{@link org.w3.ns.dcat.DistributionType#getRights <em>Rights</em>}' containment reference.
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
	 * @see org.w3.ns.dcat.DcatPackage#getDistributionType_HasPolicy()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='hasPolicy' namespace='http://www.w3.org/ns/odrl/2/'"
	 * @generated
	 */
	String getHasPolicy();

	/**
	 * Sets the value of the '{@link org.w3.ns.dcat.DistributionType#getHasPolicy <em>Has Policy</em>}' attribute.
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
	 * @see org.w3.ns.dcat.DcatPackage#getDistributionType_Issued()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='issued' namespace='http://purl.org/dc/terms/'"
	 * @generated
	 */
	DateOrDateTimeLiteral getIssued();

	/**
	 * Sets the value of the '{@link org.w3.ns.dcat.DistributionType#getIssued <em>Issued</em>}' containment reference.
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
	 * @see org.w3.ns.dcat.DcatPackage#getDistributionType_Modified()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modified' namespace='http://purl.org/dc/terms/'"
	 * @generated
	 */
	DateOrDateTimeLiteral getModified();

	/**
	 * Sets the value of the '{@link org.w3.ns.dcat.DistributionType#getModified <em>Modified</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified</em>' containment reference.
	 * @see #getModified()
	 * @generated
	 */
	void setModified(DateOrDateTimeLiteral value);

	/**
	 * Returns the value of the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>About</em>' attribute.
	 * @see #setAbout(String)
	 * @see org.w3.ns.dcat.DcatPackage#getDistributionType_About()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='about' namespace='http://www.w3.org/1999/02/22-rdf-syntax-ns#'"
	 * @generated
	 */
	String getAbout();

	/**
	 * Sets the value of the '{@link org.w3.ns.dcat.DistributionType#getAbout <em>About</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>About</em>' attribute.
	 * @see #getAbout()
	 * @generated
	 */
	void setAbout(String value);

	/**
	 * Returns the value of the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node ID</em>' attribute.
	 * @see #setNodeID(String)
	 * @see org.w3.ns.dcat.DcatPackage#getDistributionType_NodeID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        extendedMetaData="kind='attribute' name='nodeID' namespace='http://www.w3.org/1999/02/22-rdf-syntax-ns#'"
	 * @generated
	 */
	String getNodeID();

	/**
	 * Sets the value of the '{@link org.w3.ns.dcat.DistributionType#getNodeID <em>Node ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node ID</em>' attribute.
	 * @see #getNodeID()
	 * @generated
	 */
	void setNodeID(String value);

} // DistributionType
