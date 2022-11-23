/**
 */
package terms.impl;

import foaf.Agent;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import rdf.DateOrDateTimeLiteral;
import rdf.PlainLiteral;
import rdf.Resource;

import skos.Concept;

import terms.DocumentRoot;
import terms.LicenseDocument;
import terms.Location;
import terms.PeriodOfTime;
import terms.ProvenanceStatement;
import terms.RightsStatement;
import terms.Standard;
import terms.TermsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link terms.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getAccessRights <em>Access Rights</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getAccrualMethod <em>Accrual Method</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getAccrualPeriodicity <em>Accrual Periodicity</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getAccrualPolicy <em>Accrual Policy</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getAudience <em>Audience</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getAvailable <em>Available</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getBibliographicCitation <em>Bibliographic Citation</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getConformsTo <em>Conforms To</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getDateAccepted <em>Date Accepted</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getDateCopyrighted <em>Date Copyrighted</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getDateSubmitted <em>Date Submitted</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getEducationLevel <em>Education Level</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getExtent <em>Extent</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getHasFormat <em>Has Format</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getHasPart <em>Has Part</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getHasVersion <em>Has Version</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getInstructionalMethod <em>Instructional Method</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getIsFormatOf <em>Is Format Of</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getIsPartOf <em>Is Part Of</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getIsReferencedBy <em>Is Referenced By</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getIsReplacedBy <em>Is Replaced By</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getIsRequiredBy <em>Is Required By</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getIssued <em>Issued</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getIsVersionOf <em>Is Version Of</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getLicense <em>License</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getMediator <em>Mediator</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getMedium <em>Medium</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getProvenance <em>Provenance</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getReferences <em>References</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getRelation <em>Relation</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getReplaces <em>Replaces</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getRights <em>Rights</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getRightsHolder <em>Rights Holder</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getSource <em>Source</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getSpatial <em>Spatial</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getTableOfContents <em>Table Of Contents</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getTemporal <em>Temporal</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getType <em>Type</em>}</li>
 *   <li>{@link terms.impl.DocumentRootImpl#getValid <em>Valid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #getAccrualMethod() <em>Accrual Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccrualMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCRUAL_METHOD_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAccrualPolicy() <em>Accrual Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccrualPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCRUAL_POLICY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAudience() <em>Audience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudience()
	 * @generated
	 * @ordered
	 */
	protected static final String AUDIENCE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEducationLevel() <em>Education Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEducationLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String EDUCATION_LEVEL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getHasFormat() <em>Has Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_FORMAT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getInstructionalMethod() <em>Instructional Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructionalMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTRUCTIONAL_METHOD_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getIsFormatOf() <em>Is Format Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsFormatOf()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_FORMAT_OF_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getIsRequiredBy() <em>Is Required By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsRequiredBy()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_REQUIRED_BY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMediator() <em>Mediator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediator()
	 * @generated
	 * @ordered
	 */
	protected static final String MEDIATOR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMedium() <em>Medium</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedium()
	 * @generated
	 * @ordered
	 */
	protected static final String MEDIUM_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getRequires() <em>Requires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequires()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUIRES_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TermsPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, TermsPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>((EClass) eStaticClass().getEStructuralFeature(TermsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP).getEType(), EStringToStringMapEntryImpl.class, this, TermsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>((EClass) eStaticClass().getEStructuralFeature(TermsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION).getEType(), EStringToStringMapEntryImpl.class, this, TermsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainLiteral getAbstract() {
		return (PlainLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__ABSTRACT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstract(PlainLiteral newAbstract, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__ABSTRACT, newAbstract, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(PlainLiteral newAbstract) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__ABSTRACT, newAbstract);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept getAccessRights() {
		return (Concept)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__ACCESS_RIGHTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccessRights(Concept newAccessRights, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__ACCESS_RIGHTS, newAccessRights, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessRights(Concept newAccessRights) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__ACCESS_RIGHTS, newAccessRights);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccrualMethod() {
		return (String)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__ACCRUAL_METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccrualMethod(String newAccrualMethod) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__ACCRUAL_METHOD, newAccrualMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept getAccrualPeriodicity() {
		return (Concept)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__ACCRUAL_PERIODICITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccrualPeriodicity(Concept newAccrualPeriodicity, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__ACCRUAL_PERIODICITY, newAccrualPeriodicity, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccrualPeriodicity(Concept newAccrualPeriodicity) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__ACCRUAL_PERIODICITY, newAccrualPeriodicity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccrualPolicy() {
		return (String)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__ACCRUAL_POLICY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccrualPolicy(String newAccrualPolicy) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__ACCRUAL_POLICY, newAccrualPolicy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainLiteral getAlternative() {
		return (PlainLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__ALTERNATIVE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlternative(PlainLiteral newAlternative, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__ALTERNATIVE, newAlternative, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlternative(PlainLiteral newAlternative) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__ALTERNATIVE, newAlternative);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAudience() {
		return (String)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__AUDIENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAudience(String newAudience) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__AUDIENCE, newAudience);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateOrDateTimeLiteral getAvailable() {
		return (DateOrDateTimeLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__AVAILABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAvailable(DateOrDateTimeLiteral newAvailable, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__AVAILABLE, newAvailable, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailable(DateOrDateTimeLiteral newAvailable) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__AVAILABLE, newAvailable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainLiteral getBibliographicCitation() {
		return (PlainLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__BIBLIOGRAPHIC_CITATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBibliographicCitation(PlainLiteral newBibliographicCitation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__BIBLIOGRAPHIC_CITATION, newBibliographicCitation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBibliographicCitation(PlainLiteral newBibliographicCitation) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__BIBLIOGRAPHIC_CITATION, newBibliographicCitation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Standard getConformsTo() {
		return (Standard)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__CONFORMS_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConformsTo(Standard newConformsTo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__CONFORMS_TO, newConformsTo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConformsTo(Standard newConformsTo) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__CONFORMS_TO, newConformsTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateOrDateTimeLiteral getCreated() {
		return (DateOrDateTimeLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__CREATED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreated(DateOrDateTimeLiteral newCreated, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__CREATED, newCreated, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated(DateOrDateTimeLiteral newCreated) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__CREATED, newCreated);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent getCreator() {
		return (Agent)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__CREATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreator(Agent newCreator, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__CREATOR, newCreator, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreator(Agent newCreator) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__CREATOR, newCreator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateOrDateTimeLiteral getDateAccepted() {
		return (DateOrDateTimeLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__DATE_ACCEPTED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateAccepted(DateOrDateTimeLiteral newDateAccepted, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__DATE_ACCEPTED, newDateAccepted, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateAccepted(DateOrDateTimeLiteral newDateAccepted) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__DATE_ACCEPTED, newDateAccepted);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateOrDateTimeLiteral getDateCopyrighted() {
		return (DateOrDateTimeLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__DATE_COPYRIGHTED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateCopyrighted(DateOrDateTimeLiteral newDateCopyrighted, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__DATE_COPYRIGHTED, newDateCopyrighted, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateCopyrighted(DateOrDateTimeLiteral newDateCopyrighted) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__DATE_COPYRIGHTED, newDateCopyrighted);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateOrDateTimeLiteral getDateSubmitted() {
		return (DateOrDateTimeLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__DATE_SUBMITTED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateSubmitted(DateOrDateTimeLiteral newDateSubmitted, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__DATE_SUBMITTED, newDateSubmitted, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateSubmitted(DateOrDateTimeLiteral newDateSubmitted) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__DATE_SUBMITTED, newDateSubmitted);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainLiteral getDescription() {
		return (PlainLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(PlainLiteral newDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__DESCRIPTION, newDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(PlainLiteral newDescription) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEducationLevel() {
		return (String)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__EDUCATION_LEVEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEducationLevel(String newEducationLevel) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__EDUCATION_LEVEL, newEducationLevel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getExtent() {
		return (Resource)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__EXTENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtent(Resource newExtent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__EXTENT, newExtent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtent(Resource newExtent) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__EXTENT, newExtent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept getFormat() {
		return (Concept)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__FORMAT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormat(Concept newFormat, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__FORMAT, newFormat, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormat(Concept newFormat) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__FORMAT, newFormat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHasFormat() {
		return (String)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__HAS_FORMAT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasFormat(String newHasFormat) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__HAS_FORMAT, newHasFormat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getHasPart() {
		return (Resource)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__HAS_PART, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasPart(Resource newHasPart, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__HAS_PART, newHasPart, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasPart(Resource newHasPart) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__HAS_PART, newHasPart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getHasVersion() {
		return (Resource)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__HAS_VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasVersion(Resource newHasVersion, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__HAS_VERSION, newHasVersion, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasVersion(Resource newHasVersion) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__HAS_VERSION, newHasVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainLiteral getIdentifier() {
		return (PlainLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__IDENTIFIER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(PlainLiteral newIdentifier, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__IDENTIFIER, newIdentifier, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(PlainLiteral newIdentifier) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__IDENTIFIER, newIdentifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstructionalMethod() {
		return (String)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__INSTRUCTIONAL_METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstructionalMethod(String newInstructionalMethod) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__INSTRUCTIONAL_METHOD, newInstructionalMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsFormatOf() {
		return (String)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__IS_FORMAT_OF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFormatOf(String newIsFormatOf) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__IS_FORMAT_OF, newIsFormatOf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getIsPartOf() {
		return (Resource)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__IS_PART_OF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsPartOf(Resource newIsPartOf, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__IS_PART_OF, newIsPartOf, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPartOf(Resource newIsPartOf) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__IS_PART_OF, newIsPartOf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getIsReferencedBy() {
		return (Resource)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__IS_REFERENCED_BY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsReferencedBy(Resource newIsReferencedBy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__IS_REFERENCED_BY, newIsReferencedBy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReferencedBy(Resource newIsReferencedBy) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__IS_REFERENCED_BY, newIsReferencedBy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getIsReplacedBy() {
		return (Resource)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__IS_REPLACED_BY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsReplacedBy(Resource newIsReplacedBy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__IS_REPLACED_BY, newIsReplacedBy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReplacedBy(Resource newIsReplacedBy) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__IS_REPLACED_BY, newIsReplacedBy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsRequiredBy() {
		return (String)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__IS_REQUIRED_BY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRequiredBy(String newIsRequiredBy) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__IS_REQUIRED_BY, newIsRequiredBy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateOrDateTimeLiteral getIssued() {
		return (DateOrDateTimeLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__ISSUED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssued(DateOrDateTimeLiteral newIssued, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__ISSUED, newIssued, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssued(DateOrDateTimeLiteral newIssued) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__ISSUED, newIssued);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getIsVersionOf() {
		return (Resource)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__IS_VERSION_OF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsVersionOf(Resource newIsVersionOf, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__IS_VERSION_OF, newIsVersionOf, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsVersionOf(Resource newIsVersionOf) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__IS_VERSION_OF, newIsVersionOf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getLanguage() {
		return (Resource)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__LANGUAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLanguage(Resource newLanguage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__LANGUAGE, newLanguage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(Resource newLanguage) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__LANGUAGE, newLanguage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LicenseDocument getLicense() {
		return (LicenseDocument)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__LICENSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLicense(LicenseDocument newLicense, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__LICENSE, newLicense, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLicense(LicenseDocument newLicense) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__LICENSE, newLicense);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMediator() {
		return (String)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__MEDIATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMediator(String newMediator) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__MEDIATOR, newMediator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMedium() {
		return (String)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__MEDIUM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedium(String newMedium) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__MEDIUM, newMedium);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateOrDateTimeLiteral getModified() {
		return (DateOrDateTimeLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__MODIFIED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModified(DateOrDateTimeLiteral newModified, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__MODIFIED, newModified, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModified(DateOrDateTimeLiteral newModified) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__MODIFIED, newModified);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvenanceStatement getProvenance() {
		return (ProvenanceStatement)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__PROVENANCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvenance(ProvenanceStatement newProvenance, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__PROVENANCE, newProvenance, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvenance(ProvenanceStatement newProvenance) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__PROVENANCE, newProvenance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent getPublisher() {
		return (Agent)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__PUBLISHER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublisher(Agent newPublisher, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__PUBLISHER, newPublisher, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisher(Agent newPublisher) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__PUBLISHER, newPublisher);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getReferences() {
		return (Resource)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__REFERENCES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferences(Resource newReferences, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__REFERENCES, newReferences, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferences(Resource newReferences) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__REFERENCES, newReferences);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getRelation() {
		return (Resource)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__RELATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelation(Resource newRelation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__RELATION, newRelation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelation(Resource newRelation) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__RELATION, newRelation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getReplaces() {
		return (Resource)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__REPLACES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReplaces(Resource newReplaces, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__REPLACES, newReplaces, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplaces(Resource newReplaces) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__REPLACES, newReplaces);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRequires() {
		return (String)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__REQUIRES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequires(String newRequires) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__REQUIRES, newRequires);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightsStatement getRights() {
		return (RightsStatement)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__RIGHTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRights(RightsStatement newRights, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__RIGHTS, newRights, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRights(RightsStatement newRights) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__RIGHTS, newRights);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent getRightsHolder() {
		return (Agent)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__RIGHTS_HOLDER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightsHolder(Agent newRightsHolder, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__RIGHTS_HOLDER, newRightsHolder, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightsHolder(Agent newRightsHolder) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__RIGHTS_HOLDER, newRightsHolder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getSource() {
		return (Resource)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__SOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Resource newSource, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__SOURCE, newSource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Resource newSource) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getSpatial() {
		return (Location)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__SPATIAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpatial(Location newSpatial, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__SPATIAL, newSpatial, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpatial(Location newSpatial) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__SPATIAL, newSpatial);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainLiteral getTableOfContents() {
		return (PlainLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__TABLE_OF_CONTENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableOfContents(PlainLiteral newTableOfContents, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__TABLE_OF_CONTENTS, newTableOfContents, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableOfContents(PlainLiteral newTableOfContents) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__TABLE_OF_CONTENTS, newTableOfContents);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodOfTime getTemporal() {
		return (PeriodOfTime)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__TEMPORAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemporal(PeriodOfTime newTemporal, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__TEMPORAL, newTemporal, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemporal(PeriodOfTime newTemporal) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__TEMPORAL, newTemporal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainLiteral getTitle() {
		return (PlainLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__TITLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(PlainLiteral newTitle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__TITLE, newTitle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(PlainLiteral newTitle) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept getType() {
		return (Concept)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Concept newType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__TYPE, newType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Concept newType) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateOrDateTimeLiteral getValid() {
		return (DateOrDateTimeLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__VALID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValid(DateOrDateTimeLiteral newValid, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__VALID, newValid, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValid(DateOrDateTimeLiteral newValid) {
		((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__VALID, newValid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TermsPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case TermsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case TermsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case TermsPackage.DOCUMENT_ROOT__ABSTRACT:
				return basicSetAbstract(null, msgs);
			case TermsPackage.DOCUMENT_ROOT__ACCESS_RIGHTS:
				return basicSetAccessRights(null, msgs);
			case TermsPackage.DOCUMENT_ROOT__ACCRUAL_PERIODICITY:
				return basicSetAccrualPeriodicity(null, msgs);
			case TermsPackage.DOCUMENT_ROOT__ALTERNATIVE:
				return basicSetAlternative(null, msgs);
			case TermsPackage.DOCUMENT_ROOT__AVAILABLE:
				return basicSetAvailable(null, msgs);
			case TermsPackage.DOCUMENT_ROOT__BIBLIOGRAPHIC_CITATION:
				return basicSetBibliographicCitation(null, msgs);
			case TermsPackage.DOCUMENT_ROOT__CONFORMS_TO:
				return basicSetConformsTo(null, msgs);
			case TermsPackage.DOCUMENT_ROOT__CREATED:
				return basicSetCreated(null, msgs);
			case TermsPackage.DOCUMENT_ROOT__CREATOR:
				return basicSetCreator(null, msgs);
			case TermsPackage.DOCUMENT_ROOT__DATE_ACCEPTED:
				return basicSetDateAccepted(null, msgs);
			case TermsPackage.DOCUMENT_ROOT__DATE_COPYRIGHTED:
				return basicSetDateCopyrighted(null, msgs);
			case TermsPackage.DOCUMENT_ROOT__DATE_SUBMITTED:
				return basicSetDateSubmitted(null, msgs);
			case TermsPackage.DOCUMENT_ROOT__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case TermsPackage.DOCUMENT_ROOT__EXTENT:
				return basicSetExtent(null, msgs);
			case TermsPackage.DOCUMENT_ROOT__FORMAT:
				return basicSetFormat(null, msgs);
			case TermsPackage.DOCUMENT_ROOT__HAS_PART:
				return basicSetHasPart(null, msgs);
			case TermsPackage.DOCUMENT_ROOT__HAS_VERSION:
				return basicSetHasVersion(null, msgs);
			case TermsPackage.DOCUMENT_ROOT__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case TermsPackage.DOCUMENT_ROOT__IS_PART_OF:
				return basicSetIsPartOf(null, msgs);
			case TermsPackage.DOCUMENT_ROOT__IS_REFERENCED_BY:
				return basicSetIsReferencedBy(null, msgs);
			case TermsPackage.DOCUMENT_ROOT__IS_REPLACED_BY:
				return basicSetIsReplacedBy(null, msgs);
			case TermsPackage.DOCUMENT_ROOT__ISSUED:
				return basicSetIssued(null, msgs);
			case TermsPackage.DOCUMENT_ROOT__IS_VERSION_OF:
				return basicSetIsVersionOf(null, msgs);
			case TermsPackage.DOCUMENT_ROOT__LANGUAGE:
				return basicSetLanguage(null, msgs);
			case TermsPackage.DOCUMENT_ROOT__LICENSE:
				return basicSetLicense(null, msgs);
			case TermsPackage.DOCUMENT_ROOT__MODIFIED:
				return basicSetModified(null, msgs);
			case TermsPackage.DOCUMENT_ROOT__PROVENANCE:
				return basicSetProvenance(null, msgs);
			case TermsPackage.DOCUMENT_ROOT__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case TermsPackage.DOCUMENT_ROOT__REFERENCES:
				return basicSetReferences(null, msgs);
			case TermsPackage.DOCUMENT_ROOT__RELATION:
				return basicSetRelation(null, msgs);
			case TermsPackage.DOCUMENT_ROOT__REPLACES:
				return basicSetReplaces(null, msgs);
			case TermsPackage.DOCUMENT_ROOT__RIGHTS:
				return basicSetRights(null, msgs);
			case TermsPackage.DOCUMENT_ROOT__RIGHTS_HOLDER:
				return basicSetRightsHolder(null, msgs);
			case TermsPackage.DOCUMENT_ROOT__SOURCE:
				return basicSetSource(null, msgs);
			case TermsPackage.DOCUMENT_ROOT__SPATIAL:
				return basicSetSpatial(null, msgs);
			case TermsPackage.DOCUMENT_ROOT__TABLE_OF_CONTENTS:
				return basicSetTableOfContents(null, msgs);
			case TermsPackage.DOCUMENT_ROOT__TEMPORAL:
				return basicSetTemporal(null, msgs);
			case TermsPackage.DOCUMENT_ROOT__TITLE:
				return basicSetTitle(null, msgs);
			case TermsPackage.DOCUMENT_ROOT__TYPE:
				return basicSetType(null, msgs);
			case TermsPackage.DOCUMENT_ROOT__VALID:
				return basicSetValid(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TermsPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case TermsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case TermsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case TermsPackage.DOCUMENT_ROOT__ABSTRACT:
				return getAbstract();
			case TermsPackage.DOCUMENT_ROOT__ACCESS_RIGHTS:
				return getAccessRights();
			case TermsPackage.DOCUMENT_ROOT__ACCRUAL_METHOD:
				return getAccrualMethod();
			case TermsPackage.DOCUMENT_ROOT__ACCRUAL_PERIODICITY:
				return getAccrualPeriodicity();
			case TermsPackage.DOCUMENT_ROOT__ACCRUAL_POLICY:
				return getAccrualPolicy();
			case TermsPackage.DOCUMENT_ROOT__ALTERNATIVE:
				return getAlternative();
			case TermsPackage.DOCUMENT_ROOT__AUDIENCE:
				return getAudience();
			case TermsPackage.DOCUMENT_ROOT__AVAILABLE:
				return getAvailable();
			case TermsPackage.DOCUMENT_ROOT__BIBLIOGRAPHIC_CITATION:
				return getBibliographicCitation();
			case TermsPackage.DOCUMENT_ROOT__CONFORMS_TO:
				return getConformsTo();
			case TermsPackage.DOCUMENT_ROOT__CREATED:
				return getCreated();
			case TermsPackage.DOCUMENT_ROOT__CREATOR:
				return getCreator();
			case TermsPackage.DOCUMENT_ROOT__DATE_ACCEPTED:
				return getDateAccepted();
			case TermsPackage.DOCUMENT_ROOT__DATE_COPYRIGHTED:
				return getDateCopyrighted();
			case TermsPackage.DOCUMENT_ROOT__DATE_SUBMITTED:
				return getDateSubmitted();
			case TermsPackage.DOCUMENT_ROOT__DESCRIPTION:
				return getDescription();
			case TermsPackage.DOCUMENT_ROOT__EDUCATION_LEVEL:
				return getEducationLevel();
			case TermsPackage.DOCUMENT_ROOT__EXTENT:
				return getExtent();
			case TermsPackage.DOCUMENT_ROOT__FORMAT:
				return getFormat();
			case TermsPackage.DOCUMENT_ROOT__HAS_FORMAT:
				return getHasFormat();
			case TermsPackage.DOCUMENT_ROOT__HAS_PART:
				return getHasPart();
			case TermsPackage.DOCUMENT_ROOT__HAS_VERSION:
				return getHasVersion();
			case TermsPackage.DOCUMENT_ROOT__IDENTIFIER:
				return getIdentifier();
			case TermsPackage.DOCUMENT_ROOT__INSTRUCTIONAL_METHOD:
				return getInstructionalMethod();
			case TermsPackage.DOCUMENT_ROOT__IS_FORMAT_OF:
				return getIsFormatOf();
			case TermsPackage.DOCUMENT_ROOT__IS_PART_OF:
				return getIsPartOf();
			case TermsPackage.DOCUMENT_ROOT__IS_REFERENCED_BY:
				return getIsReferencedBy();
			case TermsPackage.DOCUMENT_ROOT__IS_REPLACED_BY:
				return getIsReplacedBy();
			case TermsPackage.DOCUMENT_ROOT__IS_REQUIRED_BY:
				return getIsRequiredBy();
			case TermsPackage.DOCUMENT_ROOT__ISSUED:
				return getIssued();
			case TermsPackage.DOCUMENT_ROOT__IS_VERSION_OF:
				return getIsVersionOf();
			case TermsPackage.DOCUMENT_ROOT__LANGUAGE:
				return getLanguage();
			case TermsPackage.DOCUMENT_ROOT__LICENSE:
				return getLicense();
			case TermsPackage.DOCUMENT_ROOT__MEDIATOR:
				return getMediator();
			case TermsPackage.DOCUMENT_ROOT__MEDIUM:
				return getMedium();
			case TermsPackage.DOCUMENT_ROOT__MODIFIED:
				return getModified();
			case TermsPackage.DOCUMENT_ROOT__PROVENANCE:
				return getProvenance();
			case TermsPackage.DOCUMENT_ROOT__PUBLISHER:
				return getPublisher();
			case TermsPackage.DOCUMENT_ROOT__REFERENCES:
				return getReferences();
			case TermsPackage.DOCUMENT_ROOT__RELATION:
				return getRelation();
			case TermsPackage.DOCUMENT_ROOT__REPLACES:
				return getReplaces();
			case TermsPackage.DOCUMENT_ROOT__REQUIRES:
				return getRequires();
			case TermsPackage.DOCUMENT_ROOT__RIGHTS:
				return getRights();
			case TermsPackage.DOCUMENT_ROOT__RIGHTS_HOLDER:
				return getRightsHolder();
			case TermsPackage.DOCUMENT_ROOT__SOURCE:
				return getSource();
			case TermsPackage.DOCUMENT_ROOT__SPATIAL:
				return getSpatial();
			case TermsPackage.DOCUMENT_ROOT__TABLE_OF_CONTENTS:
				return getTableOfContents();
			case TermsPackage.DOCUMENT_ROOT__TEMPORAL:
				return getTemporal();
			case TermsPackage.DOCUMENT_ROOT__TITLE:
				return getTitle();
			case TermsPackage.DOCUMENT_ROOT__TYPE:
				return getType();
			case TermsPackage.DOCUMENT_ROOT__VALID:
				return getValid();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TermsPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__ABSTRACT:
				setAbstract((PlainLiteral)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__ACCESS_RIGHTS:
				setAccessRights((Concept)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__ACCRUAL_METHOD:
				setAccrualMethod((String)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__ACCRUAL_PERIODICITY:
				setAccrualPeriodicity((Concept)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__ACCRUAL_POLICY:
				setAccrualPolicy((String)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__ALTERNATIVE:
				setAlternative((PlainLiteral)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__AUDIENCE:
				setAudience((String)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__AVAILABLE:
				setAvailable((DateOrDateTimeLiteral)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__BIBLIOGRAPHIC_CITATION:
				setBibliographicCitation((PlainLiteral)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__CONFORMS_TO:
				setConformsTo((Standard)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__CREATED:
				setCreated((DateOrDateTimeLiteral)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__CREATOR:
				setCreator((Agent)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__DATE_ACCEPTED:
				setDateAccepted((DateOrDateTimeLiteral)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__DATE_COPYRIGHTED:
				setDateCopyrighted((DateOrDateTimeLiteral)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__DATE_SUBMITTED:
				setDateSubmitted((DateOrDateTimeLiteral)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__DESCRIPTION:
				setDescription((PlainLiteral)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__EDUCATION_LEVEL:
				setEducationLevel((String)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__EXTENT:
				setExtent((Resource)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__FORMAT:
				setFormat((Concept)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__HAS_FORMAT:
				setHasFormat((String)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__HAS_PART:
				setHasPart((Resource)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__HAS_VERSION:
				setHasVersion((Resource)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__IDENTIFIER:
				setIdentifier((PlainLiteral)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__INSTRUCTIONAL_METHOD:
				setInstructionalMethod((String)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__IS_FORMAT_OF:
				setIsFormatOf((String)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__IS_PART_OF:
				setIsPartOf((Resource)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__IS_REFERENCED_BY:
				setIsReferencedBy((Resource)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__IS_REPLACED_BY:
				setIsReplacedBy((Resource)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__IS_REQUIRED_BY:
				setIsRequiredBy((String)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__ISSUED:
				setIssued((DateOrDateTimeLiteral)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__IS_VERSION_OF:
				setIsVersionOf((Resource)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__LANGUAGE:
				setLanguage((Resource)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__LICENSE:
				setLicense((LicenseDocument)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__MEDIATOR:
				setMediator((String)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__MEDIUM:
				setMedium((String)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__MODIFIED:
				setModified((DateOrDateTimeLiteral)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__PROVENANCE:
				setProvenance((ProvenanceStatement)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__PUBLISHER:
				setPublisher((Agent)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__REFERENCES:
				setReferences((Resource)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__RELATION:
				setRelation((Resource)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__REPLACES:
				setReplaces((Resource)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__REQUIRES:
				setRequires((String)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__RIGHTS:
				setRights((RightsStatement)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__RIGHTS_HOLDER:
				setRightsHolder((Agent)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__SOURCE:
				setSource((Resource)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__SPATIAL:
				setSpatial((Location)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__TABLE_OF_CONTENTS:
				setTableOfContents((PlainLiteral)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__TEMPORAL:
				setTemporal((PeriodOfTime)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__TITLE:
				setTitle((PlainLiteral)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__TYPE:
				setType((Concept)newValue);
				return;
			case TermsPackage.DOCUMENT_ROOT__VALID:
				setValid((DateOrDateTimeLiteral)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TermsPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case TermsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case TermsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case TermsPackage.DOCUMENT_ROOT__ABSTRACT:
				setAbstract((PlainLiteral)null);
				return;
			case TermsPackage.DOCUMENT_ROOT__ACCESS_RIGHTS:
				setAccessRights((Concept)null);
				return;
			case TermsPackage.DOCUMENT_ROOT__ACCRUAL_METHOD:
				setAccrualMethod(ACCRUAL_METHOD_EDEFAULT);
				return;
			case TermsPackage.DOCUMENT_ROOT__ACCRUAL_PERIODICITY:
				setAccrualPeriodicity((Concept)null);
				return;
			case TermsPackage.DOCUMENT_ROOT__ACCRUAL_POLICY:
				setAccrualPolicy(ACCRUAL_POLICY_EDEFAULT);
				return;
			case TermsPackage.DOCUMENT_ROOT__ALTERNATIVE:
				setAlternative((PlainLiteral)null);
				return;
			case TermsPackage.DOCUMENT_ROOT__AUDIENCE:
				setAudience(AUDIENCE_EDEFAULT);
				return;
			case TermsPackage.DOCUMENT_ROOT__AVAILABLE:
				setAvailable((DateOrDateTimeLiteral)null);
				return;
			case TermsPackage.DOCUMENT_ROOT__BIBLIOGRAPHIC_CITATION:
				setBibliographicCitation((PlainLiteral)null);
				return;
			case TermsPackage.DOCUMENT_ROOT__CONFORMS_TO:
				setConformsTo((Standard)null);
				return;
			case TermsPackage.DOCUMENT_ROOT__CREATED:
				setCreated((DateOrDateTimeLiteral)null);
				return;
			case TermsPackage.DOCUMENT_ROOT__CREATOR:
				setCreator((Agent)null);
				return;
			case TermsPackage.DOCUMENT_ROOT__DATE_ACCEPTED:
				setDateAccepted((DateOrDateTimeLiteral)null);
				return;
			case TermsPackage.DOCUMENT_ROOT__DATE_COPYRIGHTED:
				setDateCopyrighted((DateOrDateTimeLiteral)null);
				return;
			case TermsPackage.DOCUMENT_ROOT__DATE_SUBMITTED:
				setDateSubmitted((DateOrDateTimeLiteral)null);
				return;
			case TermsPackage.DOCUMENT_ROOT__DESCRIPTION:
				setDescription((PlainLiteral)null);
				return;
			case TermsPackage.DOCUMENT_ROOT__EDUCATION_LEVEL:
				setEducationLevel(EDUCATION_LEVEL_EDEFAULT);
				return;
			case TermsPackage.DOCUMENT_ROOT__EXTENT:
				setExtent((Resource)null);
				return;
			case TermsPackage.DOCUMENT_ROOT__FORMAT:
				setFormat((Concept)null);
				return;
			case TermsPackage.DOCUMENT_ROOT__HAS_FORMAT:
				setHasFormat(HAS_FORMAT_EDEFAULT);
				return;
			case TermsPackage.DOCUMENT_ROOT__HAS_PART:
				setHasPart((Resource)null);
				return;
			case TermsPackage.DOCUMENT_ROOT__HAS_VERSION:
				setHasVersion((Resource)null);
				return;
			case TermsPackage.DOCUMENT_ROOT__IDENTIFIER:
				setIdentifier((PlainLiteral)null);
				return;
			case TermsPackage.DOCUMENT_ROOT__INSTRUCTIONAL_METHOD:
				setInstructionalMethod(INSTRUCTIONAL_METHOD_EDEFAULT);
				return;
			case TermsPackage.DOCUMENT_ROOT__IS_FORMAT_OF:
				setIsFormatOf(IS_FORMAT_OF_EDEFAULT);
				return;
			case TermsPackage.DOCUMENT_ROOT__IS_PART_OF:
				setIsPartOf((Resource)null);
				return;
			case TermsPackage.DOCUMENT_ROOT__IS_REFERENCED_BY:
				setIsReferencedBy((Resource)null);
				return;
			case TermsPackage.DOCUMENT_ROOT__IS_REPLACED_BY:
				setIsReplacedBy((Resource)null);
				return;
			case TermsPackage.DOCUMENT_ROOT__IS_REQUIRED_BY:
				setIsRequiredBy(IS_REQUIRED_BY_EDEFAULT);
				return;
			case TermsPackage.DOCUMENT_ROOT__ISSUED:
				setIssued((DateOrDateTimeLiteral)null);
				return;
			case TermsPackage.DOCUMENT_ROOT__IS_VERSION_OF:
				setIsVersionOf((Resource)null);
				return;
			case TermsPackage.DOCUMENT_ROOT__LANGUAGE:
				setLanguage((Resource)null);
				return;
			case TermsPackage.DOCUMENT_ROOT__LICENSE:
				setLicense((LicenseDocument)null);
				return;
			case TermsPackage.DOCUMENT_ROOT__MEDIATOR:
				setMediator(MEDIATOR_EDEFAULT);
				return;
			case TermsPackage.DOCUMENT_ROOT__MEDIUM:
				setMedium(MEDIUM_EDEFAULT);
				return;
			case TermsPackage.DOCUMENT_ROOT__MODIFIED:
				setModified((DateOrDateTimeLiteral)null);
				return;
			case TermsPackage.DOCUMENT_ROOT__PROVENANCE:
				setProvenance((ProvenanceStatement)null);
				return;
			case TermsPackage.DOCUMENT_ROOT__PUBLISHER:
				setPublisher((Agent)null);
				return;
			case TermsPackage.DOCUMENT_ROOT__REFERENCES:
				setReferences((Resource)null);
				return;
			case TermsPackage.DOCUMENT_ROOT__RELATION:
				setRelation((Resource)null);
				return;
			case TermsPackage.DOCUMENT_ROOT__REPLACES:
				setReplaces((Resource)null);
				return;
			case TermsPackage.DOCUMENT_ROOT__REQUIRES:
				setRequires(REQUIRES_EDEFAULT);
				return;
			case TermsPackage.DOCUMENT_ROOT__RIGHTS:
				setRights((RightsStatement)null);
				return;
			case TermsPackage.DOCUMENT_ROOT__RIGHTS_HOLDER:
				setRightsHolder((Agent)null);
				return;
			case TermsPackage.DOCUMENT_ROOT__SOURCE:
				setSource((Resource)null);
				return;
			case TermsPackage.DOCUMENT_ROOT__SPATIAL:
				setSpatial((Location)null);
				return;
			case TermsPackage.DOCUMENT_ROOT__TABLE_OF_CONTENTS:
				setTableOfContents((PlainLiteral)null);
				return;
			case TermsPackage.DOCUMENT_ROOT__TEMPORAL:
				setTemporal((PeriodOfTime)null);
				return;
			case TermsPackage.DOCUMENT_ROOT__TITLE:
				setTitle((PlainLiteral)null);
				return;
			case TermsPackage.DOCUMENT_ROOT__TYPE:
				setType((Concept)null);
				return;
			case TermsPackage.DOCUMENT_ROOT__VALID:
				setValid((DateOrDateTimeLiteral)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TermsPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case TermsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case TermsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case TermsPackage.DOCUMENT_ROOT__ABSTRACT:
				return getAbstract() != null;
			case TermsPackage.DOCUMENT_ROOT__ACCESS_RIGHTS:
				return getAccessRights() != null;
			case TermsPackage.DOCUMENT_ROOT__ACCRUAL_METHOD:
				return ACCRUAL_METHOD_EDEFAULT == null ? getAccrualMethod() != null : !ACCRUAL_METHOD_EDEFAULT.equals(getAccrualMethod());
			case TermsPackage.DOCUMENT_ROOT__ACCRUAL_PERIODICITY:
				return getAccrualPeriodicity() != null;
			case TermsPackage.DOCUMENT_ROOT__ACCRUAL_POLICY:
				return ACCRUAL_POLICY_EDEFAULT == null ? getAccrualPolicy() != null : !ACCRUAL_POLICY_EDEFAULT.equals(getAccrualPolicy());
			case TermsPackage.DOCUMENT_ROOT__ALTERNATIVE:
				return getAlternative() != null;
			case TermsPackage.DOCUMENT_ROOT__AUDIENCE:
				return AUDIENCE_EDEFAULT == null ? getAudience() != null : !AUDIENCE_EDEFAULT.equals(getAudience());
			case TermsPackage.DOCUMENT_ROOT__AVAILABLE:
				return getAvailable() != null;
			case TermsPackage.DOCUMENT_ROOT__BIBLIOGRAPHIC_CITATION:
				return getBibliographicCitation() != null;
			case TermsPackage.DOCUMENT_ROOT__CONFORMS_TO:
				return getConformsTo() != null;
			case TermsPackage.DOCUMENT_ROOT__CREATED:
				return getCreated() != null;
			case TermsPackage.DOCUMENT_ROOT__CREATOR:
				return getCreator() != null;
			case TermsPackage.DOCUMENT_ROOT__DATE_ACCEPTED:
				return getDateAccepted() != null;
			case TermsPackage.DOCUMENT_ROOT__DATE_COPYRIGHTED:
				return getDateCopyrighted() != null;
			case TermsPackage.DOCUMENT_ROOT__DATE_SUBMITTED:
				return getDateSubmitted() != null;
			case TermsPackage.DOCUMENT_ROOT__DESCRIPTION:
				return getDescription() != null;
			case TermsPackage.DOCUMENT_ROOT__EDUCATION_LEVEL:
				return EDUCATION_LEVEL_EDEFAULT == null ? getEducationLevel() != null : !EDUCATION_LEVEL_EDEFAULT.equals(getEducationLevel());
			case TermsPackage.DOCUMENT_ROOT__EXTENT:
				return getExtent() != null;
			case TermsPackage.DOCUMENT_ROOT__FORMAT:
				return getFormat() != null;
			case TermsPackage.DOCUMENT_ROOT__HAS_FORMAT:
				return HAS_FORMAT_EDEFAULT == null ? getHasFormat() != null : !HAS_FORMAT_EDEFAULT.equals(getHasFormat());
			case TermsPackage.DOCUMENT_ROOT__HAS_PART:
				return getHasPart() != null;
			case TermsPackage.DOCUMENT_ROOT__HAS_VERSION:
				return getHasVersion() != null;
			case TermsPackage.DOCUMENT_ROOT__IDENTIFIER:
				return getIdentifier() != null;
			case TermsPackage.DOCUMENT_ROOT__INSTRUCTIONAL_METHOD:
				return INSTRUCTIONAL_METHOD_EDEFAULT == null ? getInstructionalMethod() != null : !INSTRUCTIONAL_METHOD_EDEFAULT.equals(getInstructionalMethod());
			case TermsPackage.DOCUMENT_ROOT__IS_FORMAT_OF:
				return IS_FORMAT_OF_EDEFAULT == null ? getIsFormatOf() != null : !IS_FORMAT_OF_EDEFAULT.equals(getIsFormatOf());
			case TermsPackage.DOCUMENT_ROOT__IS_PART_OF:
				return getIsPartOf() != null;
			case TermsPackage.DOCUMENT_ROOT__IS_REFERENCED_BY:
				return getIsReferencedBy() != null;
			case TermsPackage.DOCUMENT_ROOT__IS_REPLACED_BY:
				return getIsReplacedBy() != null;
			case TermsPackage.DOCUMENT_ROOT__IS_REQUIRED_BY:
				return IS_REQUIRED_BY_EDEFAULT == null ? getIsRequiredBy() != null : !IS_REQUIRED_BY_EDEFAULT.equals(getIsRequiredBy());
			case TermsPackage.DOCUMENT_ROOT__ISSUED:
				return getIssued() != null;
			case TermsPackage.DOCUMENT_ROOT__IS_VERSION_OF:
				return getIsVersionOf() != null;
			case TermsPackage.DOCUMENT_ROOT__LANGUAGE:
				return getLanguage() != null;
			case TermsPackage.DOCUMENT_ROOT__LICENSE:
				return getLicense() != null;
			case TermsPackage.DOCUMENT_ROOT__MEDIATOR:
				return MEDIATOR_EDEFAULT == null ? getMediator() != null : !MEDIATOR_EDEFAULT.equals(getMediator());
			case TermsPackage.DOCUMENT_ROOT__MEDIUM:
				return MEDIUM_EDEFAULT == null ? getMedium() != null : !MEDIUM_EDEFAULT.equals(getMedium());
			case TermsPackage.DOCUMENT_ROOT__MODIFIED:
				return getModified() != null;
			case TermsPackage.DOCUMENT_ROOT__PROVENANCE:
				return getProvenance() != null;
			case TermsPackage.DOCUMENT_ROOT__PUBLISHER:
				return getPublisher() != null;
			case TermsPackage.DOCUMENT_ROOT__REFERENCES:
				return getReferences() != null;
			case TermsPackage.DOCUMENT_ROOT__RELATION:
				return getRelation() != null;
			case TermsPackage.DOCUMENT_ROOT__REPLACES:
				return getReplaces() != null;
			case TermsPackage.DOCUMENT_ROOT__REQUIRES:
				return REQUIRES_EDEFAULT == null ? getRequires() != null : !REQUIRES_EDEFAULT.equals(getRequires());
			case TermsPackage.DOCUMENT_ROOT__RIGHTS:
				return getRights() != null;
			case TermsPackage.DOCUMENT_ROOT__RIGHTS_HOLDER:
				return getRightsHolder() != null;
			case TermsPackage.DOCUMENT_ROOT__SOURCE:
				return getSource() != null;
			case TermsPackage.DOCUMENT_ROOT__SPATIAL:
				return getSpatial() != null;
			case TermsPackage.DOCUMENT_ROOT__TABLE_OF_CONTENTS:
				return getTableOfContents() != null;
			case TermsPackage.DOCUMENT_ROOT__TEMPORAL:
				return getTemporal() != null;
			case TermsPackage.DOCUMENT_ROOT__TITLE:
				return getTitle() != null;
			case TermsPackage.DOCUMENT_ROOT__TYPE:
				return getType() != null;
			case TermsPackage.DOCUMENT_ROOT__VALID:
				return getValid() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
