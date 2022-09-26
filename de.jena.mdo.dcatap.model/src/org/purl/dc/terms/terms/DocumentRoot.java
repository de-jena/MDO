/**
 */
package org.purl.dc.terms.terms;

import com.xmlns.foaf.foaf.Agent;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.w3.ns.rdf.DateOrDateTimeLiteral;
import org.w3.ns.rdf.PlainLiteral;
import org.w3.ns.rdf.Resource;

import org.w3.ns.skos.Concept;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getAccessRights <em>Access Rights</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getAccrualMethod <em>Accrual Method</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getAccrualPeriodicity <em>Accrual Periodicity</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getAccrualPolicy <em>Accrual Policy</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getAudience <em>Audience</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getAvailable <em>Available</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getBibliographicCitation <em>Bibliographic Citation</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getConformsTo <em>Conforms To</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getCreated <em>Created</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getCreator <em>Creator</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getDateAccepted <em>Date Accepted</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getDateCopyrighted <em>Date Copyrighted</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getDateSubmitted <em>Date Submitted</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getDescription <em>Description</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getEducationLevel <em>Education Level</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getExtent <em>Extent</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getFormat <em>Format</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getHasFormat <em>Has Format</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getHasPart <em>Has Part</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getHasVersion <em>Has Version</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getInstructionalMethod <em>Instructional Method</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getIsFormatOf <em>Is Format Of</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getIsPartOf <em>Is Part Of</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getIsReferencedBy <em>Is Referenced By</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getIsReplacedBy <em>Is Replaced By</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getIsRequiredBy <em>Is Required By</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getIssued <em>Issued</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getIsVersionOf <em>Is Version Of</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getLicense <em>License</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getMediator <em>Mediator</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getMedium <em>Medium</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getModified <em>Modified</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getProvenance <em>Provenance</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getReferences <em>References</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getRelation <em>Relation</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getReplaces <em>Replaces</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getRequires <em>Requires</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getRights <em>Rights</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getRightsHolder <em>Rights Holder</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getSource <em>Source</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getSpatial <em>Spatial</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getTableOfContents <em>Table Of Contents</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getTemporal <em>Temporal</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getTitle <em>Title</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getType <em>Type</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.DocumentRoot#getValid <em>Valid</em>}</li>
 * </ul>
 *
 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' containment reference.
	 * @see #setAbstract(PlainLiteral)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_Abstract()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract' namespace='##targetNamespace'"
	 * @generated
	 */
	PlainLiteral getAbstract();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getAbstract <em>Abstract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' containment reference.
	 * @see #getAbstract()
	 * @generated
	 */
	void setAbstract(PlainLiteral value);

	/**
	 * Returns the value of the '<em><b>Access Rights</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Rights</em>' containment reference.
	 * @see #setAccessRights(Concept)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_AccessRights()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='accessRights' namespace='##targetNamespace'"
	 * @generated
	 */
	Concept getAccessRights();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getAccessRights <em>Access Rights</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Rights</em>' containment reference.
	 * @see #getAccessRights()
	 * @generated
	 */
	void setAccessRights(Concept value);

	/**
	 * Returns the value of the '<em><b>Accrual Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accrual Method</em>' attribute.
	 * @see #setAccrualMethod(String)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_AccrualMethod()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='accrualMethod' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAccrualMethod();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getAccrualMethod <em>Accrual Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accrual Method</em>' attribute.
	 * @see #getAccrualMethod()
	 * @generated
	 */
	void setAccrualMethod(String value);

	/**
	 * Returns the value of the '<em><b>Accrual Periodicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accrual Periodicity</em>' containment reference.
	 * @see #setAccrualPeriodicity(Concept)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_AccrualPeriodicity()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='accrualPeriodicity' namespace='##targetNamespace'"
	 * @generated
	 */
	Concept getAccrualPeriodicity();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getAccrualPeriodicity <em>Accrual Periodicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accrual Periodicity</em>' containment reference.
	 * @see #getAccrualPeriodicity()
	 * @generated
	 */
	void setAccrualPeriodicity(Concept value);

	/**
	 * Returns the value of the '<em><b>Accrual Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accrual Policy</em>' attribute.
	 * @see #setAccrualPolicy(String)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_AccrualPolicy()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='accrualPolicy' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAccrualPolicy();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getAccrualPolicy <em>Accrual Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accrual Policy</em>' attribute.
	 * @see #getAccrualPolicy()
	 * @generated
	 */
	void setAccrualPolicy(String value);

	/**
	 * Returns the value of the '<em><b>Alternative</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative</em>' containment reference.
	 * @see #setAlternative(PlainLiteral)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_Alternative()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='alternative' namespace='##targetNamespace'"
	 * @generated
	 */
	PlainLiteral getAlternative();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getAlternative <em>Alternative</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternative</em>' containment reference.
	 * @see #getAlternative()
	 * @generated
	 */
	void setAlternative(PlainLiteral value);

	/**
	 * Returns the value of the '<em><b>Audience</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Audience</em>' attribute.
	 * @see #setAudience(String)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_Audience()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='audience' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAudience();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getAudience <em>Audience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audience</em>' attribute.
	 * @see #getAudience()
	 * @generated
	 */
	void setAudience(String value);

	/**
	 * Returns the value of the '<em><b>Available</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available</em>' containment reference.
	 * @see #setAvailable(DateOrDateTimeLiteral)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_Available()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='available' namespace='##targetNamespace'"
	 * @generated
	 */
	DateOrDateTimeLiteral getAvailable();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getAvailable <em>Available</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available</em>' containment reference.
	 * @see #getAvailable()
	 * @generated
	 */
	void setAvailable(DateOrDateTimeLiteral value);

	/**
	 * Returns the value of the '<em><b>Bibliographic Citation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bibliographic Citation</em>' containment reference.
	 * @see #setBibliographicCitation(PlainLiteral)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_BibliographicCitation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bibliographicCitation' namespace='##targetNamespace'"
	 * @generated
	 */
	PlainLiteral getBibliographicCitation();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getBibliographicCitation <em>Bibliographic Citation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bibliographic Citation</em>' containment reference.
	 * @see #getBibliographicCitation()
	 * @generated
	 */
	void setBibliographicCitation(PlainLiteral value);

	/**
	 * Returns the value of the '<em><b>Conforms To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conforms To</em>' containment reference.
	 * @see #setConformsTo(Standard)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_ConformsTo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conformsTo' namespace='##targetNamespace'"
	 * @generated
	 */
	Standard getConformsTo();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getConformsTo <em>Conforms To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conforms To</em>' containment reference.
	 * @see #getConformsTo()
	 * @generated
	 */
	void setConformsTo(Standard value);

	/**
	 * Returns the value of the '<em><b>Created</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created</em>' containment reference.
	 * @see #setCreated(DateOrDateTimeLiteral)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_Created()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='created' namespace='##targetNamespace'"
	 * @generated
	 */
	DateOrDateTimeLiteral getCreated();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getCreated <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' containment reference.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(DateOrDateTimeLiteral value);

	/**
	 * Returns the value of the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creator</em>' containment reference.
	 * @see #setCreator(Agent)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_Creator()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='creator' namespace='##targetNamespace'"
	 * @generated
	 */
	Agent getCreator();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getCreator <em>Creator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creator</em>' containment reference.
	 * @see #getCreator()
	 * @generated
	 */
	void setCreator(Agent value);

	/**
	 * Returns the value of the '<em><b>Date Accepted</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Accepted</em>' containment reference.
	 * @see #setDateAccepted(DateOrDateTimeLiteral)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_DateAccepted()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dateAccepted' namespace='##targetNamespace'"
	 * @generated
	 */
	DateOrDateTimeLiteral getDateAccepted();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getDateAccepted <em>Date Accepted</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Accepted</em>' containment reference.
	 * @see #getDateAccepted()
	 * @generated
	 */
	void setDateAccepted(DateOrDateTimeLiteral value);

	/**
	 * Returns the value of the '<em><b>Date Copyrighted</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Copyrighted</em>' containment reference.
	 * @see #setDateCopyrighted(DateOrDateTimeLiteral)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_DateCopyrighted()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dateCopyrighted' namespace='##targetNamespace'"
	 * @generated
	 */
	DateOrDateTimeLiteral getDateCopyrighted();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getDateCopyrighted <em>Date Copyrighted</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Copyrighted</em>' containment reference.
	 * @see #getDateCopyrighted()
	 * @generated
	 */
	void setDateCopyrighted(DateOrDateTimeLiteral value);

	/**
	 * Returns the value of the '<em><b>Date Submitted</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Submitted</em>' containment reference.
	 * @see #setDateSubmitted(DateOrDateTimeLiteral)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_DateSubmitted()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dateSubmitted' namespace='##targetNamespace'"
	 * @generated
	 */
	DateOrDateTimeLiteral getDateSubmitted();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getDateSubmitted <em>Date Submitted</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Submitted</em>' containment reference.
	 * @see #getDateSubmitted()
	 * @generated
	 */
	void setDateSubmitted(DateOrDateTimeLiteral value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(PlainLiteral)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_Description()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	PlainLiteral getDescription();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(PlainLiteral value);

	/**
	 * Returns the value of the '<em><b>Education Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Education Level</em>' attribute.
	 * @see #setEducationLevel(String)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_EducationLevel()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='educationLevel' namespace='##targetNamespace' affiliation='audience'"
	 * @generated
	 */
	String getEducationLevel();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getEducationLevel <em>Education Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Education Level</em>' attribute.
	 * @see #getEducationLevel()
	 * @generated
	 */
	void setEducationLevel(String value);

	/**
	 * Returns the value of the '<em><b>Extent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extent</em>' containment reference.
	 * @see #setExtent(Resource)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_Extent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='extent' namespace='##targetNamespace'"
	 * @generated
	 */
	Resource getExtent();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getExtent <em>Extent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extent</em>' containment reference.
	 * @see #getExtent()
	 * @generated
	 */
	void setExtent(Resource value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' containment reference.
	 * @see #setFormat(Concept)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_Format()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='format' namespace='##targetNamespace'"
	 * @generated
	 */
	Concept getFormat();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getFormat <em>Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' containment reference.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(Concept value);

	/**
	 * Returns the value of the '<em><b>Has Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Format</em>' attribute.
	 * @see #setHasFormat(String)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_HasFormat()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hasFormat' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHasFormat();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getHasFormat <em>Has Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Format</em>' attribute.
	 * @see #getHasFormat()
	 * @generated
	 */
	void setHasFormat(String value);

	/**
	 * Returns the value of the '<em><b>Has Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Part</em>' containment reference.
	 * @see #setHasPart(Resource)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_HasPart()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hasPart' namespace='##targetNamespace'"
	 * @generated
	 */
	Resource getHasPart();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getHasPart <em>Has Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Part</em>' containment reference.
	 * @see #getHasPart()
	 * @generated
	 */
	void setHasPart(Resource value);

	/**
	 * Returns the value of the '<em><b>Has Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Version</em>' containment reference.
	 * @see #setHasVersion(Resource)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_HasVersion()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hasVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	Resource getHasVersion();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getHasVersion <em>Has Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Version</em>' containment reference.
	 * @see #getHasVersion()
	 * @generated
	 */
	void setHasVersion(Resource value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(PlainLiteral)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_Identifier()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	PlainLiteral getIdentifier();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(PlainLiteral value);

	/**
	 * Returns the value of the '<em><b>Instructional Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructional Method</em>' attribute.
	 * @see #setInstructionalMethod(String)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_InstructionalMethod()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='instructionalMethod' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInstructionalMethod();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getInstructionalMethod <em>Instructional Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instructional Method</em>' attribute.
	 * @see #getInstructionalMethod()
	 * @generated
	 */
	void setInstructionalMethod(String value);

	/**
	 * Returns the value of the '<em><b>Is Format Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Format Of</em>' attribute.
	 * @see #setIsFormatOf(String)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_IsFormatOf()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='isFormatOf' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIsFormatOf();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getIsFormatOf <em>Is Format Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Format Of</em>' attribute.
	 * @see #getIsFormatOf()
	 * @generated
	 */
	void setIsFormatOf(String value);

	/**
	 * Returns the value of the '<em><b>Is Part Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Part Of</em>' containment reference.
	 * @see #setIsPartOf(Resource)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_IsPartOf()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='isPartOf' namespace='##targetNamespace'"
	 * @generated
	 */
	Resource getIsPartOf();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getIsPartOf <em>Is Part Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Part Of</em>' containment reference.
	 * @see #getIsPartOf()
	 * @generated
	 */
	void setIsPartOf(Resource value);

	/**
	 * Returns the value of the '<em><b>Is Referenced By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Referenced By</em>' containment reference.
	 * @see #setIsReferencedBy(Resource)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_IsReferencedBy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='isReferencedBy' namespace='##targetNamespace'"
	 * @generated
	 */
	Resource getIsReferencedBy();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getIsReferencedBy <em>Is Referenced By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Referenced By</em>' containment reference.
	 * @see #getIsReferencedBy()
	 * @generated
	 */
	void setIsReferencedBy(Resource value);

	/**
	 * Returns the value of the '<em><b>Is Replaced By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Replaced By</em>' containment reference.
	 * @see #setIsReplacedBy(Resource)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_IsReplacedBy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='isReplacedBy' namespace='##targetNamespace'"
	 * @generated
	 */
	Resource getIsReplacedBy();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getIsReplacedBy <em>Is Replaced By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Replaced By</em>' containment reference.
	 * @see #getIsReplacedBy()
	 * @generated
	 */
	void setIsReplacedBy(Resource value);

	/**
	 * Returns the value of the '<em><b>Is Required By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Required By</em>' attribute.
	 * @see #setIsRequiredBy(String)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_IsRequiredBy()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='isRequiredBy' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIsRequiredBy();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getIsRequiredBy <em>Is Required By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Required By</em>' attribute.
	 * @see #getIsRequiredBy()
	 * @generated
	 */
	void setIsRequiredBy(String value);

	/**
	 * Returns the value of the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issued</em>' containment reference.
	 * @see #setIssued(DateOrDateTimeLiteral)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_Issued()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='issued' namespace='##targetNamespace'"
	 * @generated
	 */
	DateOrDateTimeLiteral getIssued();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getIssued <em>Issued</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issued</em>' containment reference.
	 * @see #getIssued()
	 * @generated
	 */
	void setIssued(DateOrDateTimeLiteral value);

	/**
	 * Returns the value of the '<em><b>Is Version Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Version Of</em>' containment reference.
	 * @see #setIsVersionOf(Resource)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_IsVersionOf()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='isVersionOf' namespace='##targetNamespace'"
	 * @generated
	 */
	Resource getIsVersionOf();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getIsVersionOf <em>Is Version Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Version Of</em>' containment reference.
	 * @see #getIsVersionOf()
	 * @generated
	 */
	void setIsVersionOf(Resource value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' containment reference.
	 * @see #setLanguage(Resource)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_Language()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='language' namespace='##targetNamespace'"
	 * @generated
	 */
	Resource getLanguage();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getLanguage <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' containment reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(Resource value);

	/**
	 * Returns the value of the '<em><b>License</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License</em>' containment reference.
	 * @see #setLicense(LicenseDocument)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_License()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='license' namespace='##targetNamespace'"
	 * @generated
	 */
	LicenseDocument getLicense();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getLicense <em>License</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License</em>' containment reference.
	 * @see #getLicense()
	 * @generated
	 */
	void setLicense(LicenseDocument value);

	/**
	 * Returns the value of the '<em><b>Mediator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mediator</em>' attribute.
	 * @see #setMediator(String)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_Mediator()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mediator' namespace='##targetNamespace' affiliation='audience'"
	 * @generated
	 */
	String getMediator();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getMediator <em>Mediator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mediator</em>' attribute.
	 * @see #getMediator()
	 * @generated
	 */
	void setMediator(String value);

	/**
	 * Returns the value of the '<em><b>Medium</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medium</em>' attribute.
	 * @see #setMedium(String)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_Medium()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='medium' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMedium();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getMedium <em>Medium</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medium</em>' attribute.
	 * @see #getMedium()
	 * @generated
	 */
	void setMedium(String value);

	/**
	 * Returns the value of the '<em><b>Modified</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified</em>' containment reference.
	 * @see #setModified(DateOrDateTimeLiteral)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_Modified()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='modified' namespace='##targetNamespace'"
	 * @generated
	 */
	DateOrDateTimeLiteral getModified();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getModified <em>Modified</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified</em>' containment reference.
	 * @see #getModified()
	 * @generated
	 */
	void setModified(DateOrDateTimeLiteral value);

	/**
	 * Returns the value of the '<em><b>Provenance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provenance</em>' containment reference.
	 * @see #setProvenance(ProvenanceStatement)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_Provenance()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='provenance' namespace='##targetNamespace'"
	 * @generated
	 */
	ProvenanceStatement getProvenance();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getProvenance <em>Provenance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provenance</em>' containment reference.
	 * @see #getProvenance()
	 * @generated
	 */
	void setProvenance(ProvenanceStatement value);

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher</em>' containment reference.
	 * @see #setPublisher(Agent)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_Publisher()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='publisher' namespace='##targetNamespace'"
	 * @generated
	 */
	Agent getPublisher();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getPublisher <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' containment reference.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(Agent value);

	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference.
	 * @see #setReferences(Resource)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_References()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='references' namespace='##targetNamespace'"
	 * @generated
	 */
	Resource getReferences();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getReferences <em>References</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>References</em>' containment reference.
	 * @see #getReferences()
	 * @generated
	 */
	void setReferences(Resource value);

	/**
	 * Returns the value of the '<em><b>Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' containment reference.
	 * @see #setRelation(Resource)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_Relation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='relation' namespace='##targetNamespace'"
	 * @generated
	 */
	Resource getRelation();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getRelation <em>Relation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation</em>' containment reference.
	 * @see #getRelation()
	 * @generated
	 */
	void setRelation(Resource value);

	/**
	 * Returns the value of the '<em><b>Replaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replaces</em>' containment reference.
	 * @see #setReplaces(Resource)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_Replaces()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='replaces' namespace='##targetNamespace'"
	 * @generated
	 */
	Resource getReplaces();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getReplaces <em>Replaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replaces</em>' containment reference.
	 * @see #getReplaces()
	 * @generated
	 */
	void setReplaces(Resource value);

	/**
	 * Returns the value of the '<em><b>Requires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires</em>' attribute.
	 * @see #setRequires(String)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_Requires()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='requires' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRequires();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getRequires <em>Requires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requires</em>' attribute.
	 * @see #getRequires()
	 * @generated
	 */
	void setRequires(String value);

	/**
	 * Returns the value of the '<em><b>Rights</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rights</em>' containment reference.
	 * @see #setRights(RightsStatement)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_Rights()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rights' namespace='##targetNamespace'"
	 * @generated
	 */
	RightsStatement getRights();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getRights <em>Rights</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rights</em>' containment reference.
	 * @see #getRights()
	 * @generated
	 */
	void setRights(RightsStatement value);

	/**
	 * Returns the value of the '<em><b>Rights Holder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rights Holder</em>' containment reference.
	 * @see #setRightsHolder(Agent)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_RightsHolder()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rightsHolder' namespace='##targetNamespace'"
	 * @generated
	 */
	Agent getRightsHolder();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getRightsHolder <em>Rights Holder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rights Holder</em>' containment reference.
	 * @see #getRightsHolder()
	 * @generated
	 */
	void setRightsHolder(Agent value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(Resource)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_Source()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	Resource getSource();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Resource value);

	/**
	 * Returns the value of the '<em><b>Spatial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spatial</em>' containment reference.
	 * @see #setSpatial(Location)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_Spatial()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='spatial' namespace='##targetNamespace'"
	 * @generated
	 */
	Location getSpatial();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getSpatial <em>Spatial</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spatial</em>' containment reference.
	 * @see #getSpatial()
	 * @generated
	 */
	void setSpatial(Location value);

	/**
	 * Returns the value of the '<em><b>Table Of Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Of Contents</em>' containment reference.
	 * @see #setTableOfContents(PlainLiteral)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_TableOfContents()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tableOfContents' namespace='##targetNamespace'"
	 * @generated
	 */
	PlainLiteral getTableOfContents();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getTableOfContents <em>Table Of Contents</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Of Contents</em>' containment reference.
	 * @see #getTableOfContents()
	 * @generated
	 */
	void setTableOfContents(PlainLiteral value);

	/**
	 * Returns the value of the '<em><b>Temporal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal</em>' containment reference.
	 * @see #setTemporal(PeriodOfTime)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_Temporal()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='temporal' namespace='##targetNamespace'"
	 * @generated
	 */
	PeriodOfTime getTemporal();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getTemporal <em>Temporal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temporal</em>' containment reference.
	 * @see #getTemporal()
	 * @generated
	 */
	void setTemporal(PeriodOfTime value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(PlainLiteral)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_Title()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	PlainLiteral getTitle();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(PlainLiteral value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Concept)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_Type()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	Concept getType();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Concept value);

	/**
	 * Returns the value of the '<em><b>Valid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid</em>' containment reference.
	 * @see #setValid(DateOrDateTimeLiteral)
	 * @see org.purl.dc.terms.terms.TermsPackage#getDocumentRoot_Valid()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='valid' namespace='##targetNamespace'"
	 * @generated
	 */
	DateOrDateTimeLiteral getValid();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.DocumentRoot#getValid <em>Valid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid</em>' containment reference.
	 * @see #getValid()
	 * @generated
	 */
	void setValid(DateOrDateTimeLiteral value);

} // DocumentRoot
