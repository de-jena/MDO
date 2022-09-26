/**
 */
package org.w3.ns.dcat.impl;

import com.xmlns.foaf.foaf.Agent;
import com.xmlns.foaf.foaf.Document;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.purl.dc.terms.terms.LicenseDocument;
import org.purl.dc.terms.terms.RightsStatement;
import org.purl.dc.terms.terms.Standard;

import org.w3.ns.dcat.DcatPackage;
import org.w3.ns.dcat.Relationship;
import org.w3.ns.dcat.ResourceType;

import org.w3.ns.rdf.DateOrDateTimeLiteral;
import org.w3.ns.rdf.PlainLiteral;
import org.w3.ns.rdf.Resource;

import org.w3.ns.skos.Concept;

import org.w3.ns.vcard.Organization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3.ns.dcat.impl.ResourceTypeImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.ResourceTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.ResourceTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.ResourceTypeImpl#getTheme <em>Theme</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.ResourceTypeImpl#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.ResourceTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.ResourceTypeImpl#getContactPoint <em>Contact Point</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.ResourceTypeImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.ResourceTypeImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.ResourceTypeImpl#getIssued <em>Issued</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.ResourceTypeImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.ResourceTypeImpl#getLandingPage <em>Landing Page</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.ResourceTypeImpl#getAccessRights <em>Access Rights</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.ResourceTypeImpl#getConformsTo <em>Conforms To</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.ResourceTypeImpl#getLicense <em>License</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.ResourceTypeImpl#getRights <em>Rights</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.ResourceTypeImpl#getHasPolicy <em>Has Policy</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.ResourceTypeImpl#getQualifiedAttribution <em>Qualified Attribution</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.ResourceTypeImpl#getRelation <em>Relation</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.ResourceTypeImpl#getQualifiedRelation <em>Qualified Relation</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.ResourceTypeImpl#getIsReferencedBy <em>Is Referenced By</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.ResourceTypeImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.ResourceTypeImpl#getAbout <em>About</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ResourceTypeImpl extends MinimalEObjectImpl.Container implements ResourceType {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<PlainLiteral> identifier;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected EList<PlainLiteral> title;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<PlainLiteral> description;

	/**
	 * The cached value of the '{@link #getTheme() <em>Theme</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheme()
	 * @generated
	 * @ordered
	 */
	protected EList<Concept> theme;

	/**
	 * The cached value of the '{@link #getKeyword() <em>Keyword</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyword()
	 * @generated
	 * @ordered
	 */
	protected EList<PlainLiteral> keyword;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<Concept> type;

	/**
	 * The cached value of the '{@link #getContactPoint() <em>Contact Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<Organization> contactPoint;

	/**
	 * The cached value of the '{@link #getCreator() <em>Creator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreator()
	 * @generated
	 * @ordered
	 */
	protected Agent creator;

	/**
	 * The cached value of the '{@link #getPublisher() <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected Agent publisher;

	/**
	 * The cached value of the '{@link #getIssued() <em>Issued</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssued()
	 * @generated
	 * @ordered
	 */
	protected DateOrDateTimeLiteral issued;

	/**
	 * The cached value of the '{@link #getModified() <em>Modified</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected DateOrDateTimeLiteral modified;

	/**
	 * The cached value of the '{@link #getLandingPage() <em>Landing Page</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandingPage()
	 * @generated
	 * @ordered
	 */
	protected EList<Document> landingPage;

	/**
	 * The cached value of the '{@link #getAccessRights() <em>Access Rights</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessRights()
	 * @generated
	 * @ordered
	 */
	protected Concept accessRights;

	/**
	 * The cached value of the '{@link #getConformsTo() <em>Conforms To</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformsTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Standard> conformsTo;

	/**
	 * The cached value of the '{@link #getLicense() <em>License</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense()
	 * @generated
	 * @ordered
	 */
	protected LicenseDocument license;

	/**
	 * The cached value of the '{@link #getRights() <em>Rights</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRights()
	 * @generated
	 * @ordered
	 */
	protected EList<RightsStatement> rights;

	/**
	 * The default value of the '{@link #getHasPolicy() <em>Has Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_POLICY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHasPolicy() <em>Has Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPolicy()
	 * @generated
	 * @ordered
	 */
	protected String hasPolicy = HAS_POLICY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQualifiedAttribution() <em>Qualified Attribution</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedAttribution()
	 * @generated
	 * @ordered
	 */
	protected EList<String> qualifiedAttribution;

	/**
	 * The cached value of the '{@link #getRelation() <em>Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> relation;

	/**
	 * The cached value of the '{@link #getQualifiedRelation() <em>Qualified Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> qualifiedRelation;

	/**
	 * The cached value of the '{@link #getIsReferencedBy() <em>Is Referenced By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsReferencedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> isReferencedBy;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> language;

	/**
	 * The default value of the '{@link #getAbout() <em>About</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbout()
	 * @generated
	 * @ordered
	 */
	protected static final String ABOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbout() <em>About</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbout()
	 * @generated
	 * @ordered
	 */
	protected String about = ABOUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DcatPackage.Literals.RESOURCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlainLiteral> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<PlainLiteral>(PlainLiteral.class, this, DcatPackage.RESOURCE_TYPE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlainLiteral> getTitle() {
		if (title == null) {
			title = new EObjectContainmentEList<PlainLiteral>(PlainLiteral.class, this, DcatPackage.RESOURCE_TYPE__TITLE);
		}
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlainLiteral> getDescription() {
		if (description == null) {
			description = new EObjectContainmentEList<PlainLiteral>(PlainLiteral.class, this, DcatPackage.RESOURCE_TYPE__DESCRIPTION);
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Concept> getTheme() {
		if (theme == null) {
			theme = new EObjectContainmentEList<Concept>(Concept.class, this, DcatPackage.RESOURCE_TYPE__THEME);
		}
		return theme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlainLiteral> getKeyword() {
		if (keyword == null) {
			keyword = new EObjectContainmentEList<PlainLiteral>(PlainLiteral.class, this, DcatPackage.RESOURCE_TYPE__KEYWORD);
		}
		return keyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Concept> getType() {
		if (type == null) {
			type = new EObjectContainmentEList<Concept>(Concept.class, this, DcatPackage.RESOURCE_TYPE__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Organization> getContactPoint() {
		if (contactPoint == null) {
			contactPoint = new EObjectContainmentEList<Organization>(Organization.class, this, DcatPackage.RESOURCE_TYPE__CONTACT_POINT);
		}
		return contactPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Agent getCreator() {
		return creator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreator(Agent newCreator, NotificationChain msgs) {
		Agent oldCreator = creator;
		creator = newCreator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DcatPackage.RESOURCE_TYPE__CREATOR, oldCreator, newCreator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreator(Agent newCreator) {
		if (newCreator != creator) {
			NotificationChain msgs = null;
			if (creator != null)
				msgs = ((InternalEObject)creator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DcatPackage.RESOURCE_TYPE__CREATOR, null, msgs);
			if (newCreator != null)
				msgs = ((InternalEObject)newCreator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DcatPackage.RESOURCE_TYPE__CREATOR, null, msgs);
			msgs = basicSetCreator(newCreator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatPackage.RESOURCE_TYPE__CREATOR, newCreator, newCreator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Agent getPublisher() {
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublisher(Agent newPublisher, NotificationChain msgs) {
		Agent oldPublisher = publisher;
		publisher = newPublisher;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DcatPackage.RESOURCE_TYPE__PUBLISHER, oldPublisher, newPublisher);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublisher(Agent newPublisher) {
		if (newPublisher != publisher) {
			NotificationChain msgs = null;
			if (publisher != null)
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DcatPackage.RESOURCE_TYPE__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DcatPackage.RESOURCE_TYPE__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatPackage.RESOURCE_TYPE__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateOrDateTimeLiteral getIssued() {
		return issued;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssued(DateOrDateTimeLiteral newIssued, NotificationChain msgs) {
		DateOrDateTimeLiteral oldIssued = issued;
		issued = newIssued;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DcatPackage.RESOURCE_TYPE__ISSUED, oldIssued, newIssued);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssued(DateOrDateTimeLiteral newIssued) {
		if (newIssued != issued) {
			NotificationChain msgs = null;
			if (issued != null)
				msgs = ((InternalEObject)issued).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DcatPackage.RESOURCE_TYPE__ISSUED, null, msgs);
			if (newIssued != null)
				msgs = ((InternalEObject)newIssued).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DcatPackage.RESOURCE_TYPE__ISSUED, null, msgs);
			msgs = basicSetIssued(newIssued, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatPackage.RESOURCE_TYPE__ISSUED, newIssued, newIssued));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateOrDateTimeLiteral getModified() {
		return modified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModified(DateOrDateTimeLiteral newModified, NotificationChain msgs) {
		DateOrDateTimeLiteral oldModified = modified;
		modified = newModified;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DcatPackage.RESOURCE_TYPE__MODIFIED, oldModified, newModified);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModified(DateOrDateTimeLiteral newModified) {
		if (newModified != modified) {
			NotificationChain msgs = null;
			if (modified != null)
				msgs = ((InternalEObject)modified).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DcatPackage.RESOURCE_TYPE__MODIFIED, null, msgs);
			if (newModified != null)
				msgs = ((InternalEObject)newModified).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DcatPackage.RESOURCE_TYPE__MODIFIED, null, msgs);
			msgs = basicSetModified(newModified, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatPackage.RESOURCE_TYPE__MODIFIED, newModified, newModified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Document> getLandingPage() {
		if (landingPage == null) {
			landingPage = new EObjectContainmentEList<Document>(Document.class, this, DcatPackage.RESOURCE_TYPE__LANDING_PAGE);
		}
		return landingPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Concept getAccessRights() {
		return accessRights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccessRights(Concept newAccessRights, NotificationChain msgs) {
		Concept oldAccessRights = accessRights;
		accessRights = newAccessRights;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DcatPackage.RESOURCE_TYPE__ACCESS_RIGHTS, oldAccessRights, newAccessRights);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessRights(Concept newAccessRights) {
		if (newAccessRights != accessRights) {
			NotificationChain msgs = null;
			if (accessRights != null)
				msgs = ((InternalEObject)accessRights).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DcatPackage.RESOURCE_TYPE__ACCESS_RIGHTS, null, msgs);
			if (newAccessRights != null)
				msgs = ((InternalEObject)newAccessRights).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DcatPackage.RESOURCE_TYPE__ACCESS_RIGHTS, null, msgs);
			msgs = basicSetAccessRights(newAccessRights, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatPackage.RESOURCE_TYPE__ACCESS_RIGHTS, newAccessRights, newAccessRights));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Standard> getConformsTo() {
		if (conformsTo == null) {
			conformsTo = new EObjectContainmentEList<Standard>(Standard.class, this, DcatPackage.RESOURCE_TYPE__CONFORMS_TO);
		}
		return conformsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LicenseDocument getLicense() {
		return license;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLicense(LicenseDocument newLicense, NotificationChain msgs) {
		LicenseDocument oldLicense = license;
		license = newLicense;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DcatPackage.RESOURCE_TYPE__LICENSE, oldLicense, newLicense);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLicense(LicenseDocument newLicense) {
		if (newLicense != license) {
			NotificationChain msgs = null;
			if (license != null)
				msgs = ((InternalEObject)license).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DcatPackage.RESOURCE_TYPE__LICENSE, null, msgs);
			if (newLicense != null)
				msgs = ((InternalEObject)newLicense).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DcatPackage.RESOURCE_TYPE__LICENSE, null, msgs);
			msgs = basicSetLicense(newLicense, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatPackage.RESOURCE_TYPE__LICENSE, newLicense, newLicense));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RightsStatement> getRights() {
		if (rights == null) {
			rights = new EObjectContainmentEList<RightsStatement>(RightsStatement.class, this, DcatPackage.RESOURCE_TYPE__RIGHTS);
		}
		return rights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHasPolicy() {
		return hasPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasPolicy(String newHasPolicy) {
		String oldHasPolicy = hasPolicy;
		hasPolicy = newHasPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatPackage.RESOURCE_TYPE__HAS_POLICY, oldHasPolicy, hasPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getQualifiedAttribution() {
		if (qualifiedAttribution == null) {
			qualifiedAttribution = new EDataTypeEList<String>(String.class, this, DcatPackage.RESOURCE_TYPE__QUALIFIED_ATTRIBUTION);
		}
		return qualifiedAttribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Resource> getRelation() {
		if (relation == null) {
			relation = new EObjectContainmentEList<Resource>(Resource.class, this, DcatPackage.RESOURCE_TYPE__RELATION);
		}
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relationship> getQualifiedRelation() {
		if (qualifiedRelation == null) {
			qualifiedRelation = new EObjectContainmentEList<Relationship>(Relationship.class, this, DcatPackage.RESOURCE_TYPE__QUALIFIED_RELATION);
		}
		return qualifiedRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Resource> getIsReferencedBy() {
		if (isReferencedBy == null) {
			isReferencedBy = new EObjectContainmentEList<Resource>(Resource.class, this, DcatPackage.RESOURCE_TYPE__IS_REFERENCED_BY);
		}
		return isReferencedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Resource> getLanguage() {
		if (language == null) {
			language = new EObjectContainmentEList<Resource>(Resource.class, this, DcatPackage.RESOURCE_TYPE__LANGUAGE);
		}
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAbout() {
		return about;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbout(String newAbout) {
		String oldAbout = about;
		about = newAbout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatPackage.RESOURCE_TYPE__ABOUT, oldAbout, about));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DcatPackage.RESOURCE_TYPE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case DcatPackage.RESOURCE_TYPE__TITLE:
				return ((InternalEList<?>)getTitle()).basicRemove(otherEnd, msgs);
			case DcatPackage.RESOURCE_TYPE__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case DcatPackage.RESOURCE_TYPE__THEME:
				return ((InternalEList<?>)getTheme()).basicRemove(otherEnd, msgs);
			case DcatPackage.RESOURCE_TYPE__KEYWORD:
				return ((InternalEList<?>)getKeyword()).basicRemove(otherEnd, msgs);
			case DcatPackage.RESOURCE_TYPE__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case DcatPackage.RESOURCE_TYPE__CONTACT_POINT:
				return ((InternalEList<?>)getContactPoint()).basicRemove(otherEnd, msgs);
			case DcatPackage.RESOURCE_TYPE__CREATOR:
				return basicSetCreator(null, msgs);
			case DcatPackage.RESOURCE_TYPE__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case DcatPackage.RESOURCE_TYPE__ISSUED:
				return basicSetIssued(null, msgs);
			case DcatPackage.RESOURCE_TYPE__MODIFIED:
				return basicSetModified(null, msgs);
			case DcatPackage.RESOURCE_TYPE__LANDING_PAGE:
				return ((InternalEList<?>)getLandingPage()).basicRemove(otherEnd, msgs);
			case DcatPackage.RESOURCE_TYPE__ACCESS_RIGHTS:
				return basicSetAccessRights(null, msgs);
			case DcatPackage.RESOURCE_TYPE__CONFORMS_TO:
				return ((InternalEList<?>)getConformsTo()).basicRemove(otherEnd, msgs);
			case DcatPackage.RESOURCE_TYPE__LICENSE:
				return basicSetLicense(null, msgs);
			case DcatPackage.RESOURCE_TYPE__RIGHTS:
				return ((InternalEList<?>)getRights()).basicRemove(otherEnd, msgs);
			case DcatPackage.RESOURCE_TYPE__RELATION:
				return ((InternalEList<?>)getRelation()).basicRemove(otherEnd, msgs);
			case DcatPackage.RESOURCE_TYPE__QUALIFIED_RELATION:
				return ((InternalEList<?>)getQualifiedRelation()).basicRemove(otherEnd, msgs);
			case DcatPackage.RESOURCE_TYPE__IS_REFERENCED_BY:
				return ((InternalEList<?>)getIsReferencedBy()).basicRemove(otherEnd, msgs);
			case DcatPackage.RESOURCE_TYPE__LANGUAGE:
				return ((InternalEList<?>)getLanguage()).basicRemove(otherEnd, msgs);
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
			case DcatPackage.RESOURCE_TYPE__IDENTIFIER:
				return getIdentifier();
			case DcatPackage.RESOURCE_TYPE__TITLE:
				return getTitle();
			case DcatPackage.RESOURCE_TYPE__DESCRIPTION:
				return getDescription();
			case DcatPackage.RESOURCE_TYPE__THEME:
				return getTheme();
			case DcatPackage.RESOURCE_TYPE__KEYWORD:
				return getKeyword();
			case DcatPackage.RESOURCE_TYPE__TYPE:
				return getType();
			case DcatPackage.RESOURCE_TYPE__CONTACT_POINT:
				return getContactPoint();
			case DcatPackage.RESOURCE_TYPE__CREATOR:
				return getCreator();
			case DcatPackage.RESOURCE_TYPE__PUBLISHER:
				return getPublisher();
			case DcatPackage.RESOURCE_TYPE__ISSUED:
				return getIssued();
			case DcatPackage.RESOURCE_TYPE__MODIFIED:
				return getModified();
			case DcatPackage.RESOURCE_TYPE__LANDING_PAGE:
				return getLandingPage();
			case DcatPackage.RESOURCE_TYPE__ACCESS_RIGHTS:
				return getAccessRights();
			case DcatPackage.RESOURCE_TYPE__CONFORMS_TO:
				return getConformsTo();
			case DcatPackage.RESOURCE_TYPE__LICENSE:
				return getLicense();
			case DcatPackage.RESOURCE_TYPE__RIGHTS:
				return getRights();
			case DcatPackage.RESOURCE_TYPE__HAS_POLICY:
				return getHasPolicy();
			case DcatPackage.RESOURCE_TYPE__QUALIFIED_ATTRIBUTION:
				return getQualifiedAttribution();
			case DcatPackage.RESOURCE_TYPE__RELATION:
				return getRelation();
			case DcatPackage.RESOURCE_TYPE__QUALIFIED_RELATION:
				return getQualifiedRelation();
			case DcatPackage.RESOURCE_TYPE__IS_REFERENCED_BY:
				return getIsReferencedBy();
			case DcatPackage.RESOURCE_TYPE__LANGUAGE:
				return getLanguage();
			case DcatPackage.RESOURCE_TYPE__ABOUT:
				return getAbout();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DcatPackage.RESOURCE_TYPE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends PlainLiteral>)newValue);
				return;
			case DcatPackage.RESOURCE_TYPE__TITLE:
				getTitle().clear();
				getTitle().addAll((Collection<? extends PlainLiteral>)newValue);
				return;
			case DcatPackage.RESOURCE_TYPE__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends PlainLiteral>)newValue);
				return;
			case DcatPackage.RESOURCE_TYPE__THEME:
				getTheme().clear();
				getTheme().addAll((Collection<? extends Concept>)newValue);
				return;
			case DcatPackage.RESOURCE_TYPE__KEYWORD:
				getKeyword().clear();
				getKeyword().addAll((Collection<? extends PlainLiteral>)newValue);
				return;
			case DcatPackage.RESOURCE_TYPE__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends Concept>)newValue);
				return;
			case DcatPackage.RESOURCE_TYPE__CONTACT_POINT:
				getContactPoint().clear();
				getContactPoint().addAll((Collection<? extends Organization>)newValue);
				return;
			case DcatPackage.RESOURCE_TYPE__CREATOR:
				setCreator((Agent)newValue);
				return;
			case DcatPackage.RESOURCE_TYPE__PUBLISHER:
				setPublisher((Agent)newValue);
				return;
			case DcatPackage.RESOURCE_TYPE__ISSUED:
				setIssued((DateOrDateTimeLiteral)newValue);
				return;
			case DcatPackage.RESOURCE_TYPE__MODIFIED:
				setModified((DateOrDateTimeLiteral)newValue);
				return;
			case DcatPackage.RESOURCE_TYPE__LANDING_PAGE:
				getLandingPage().clear();
				getLandingPage().addAll((Collection<? extends Document>)newValue);
				return;
			case DcatPackage.RESOURCE_TYPE__ACCESS_RIGHTS:
				setAccessRights((Concept)newValue);
				return;
			case DcatPackage.RESOURCE_TYPE__CONFORMS_TO:
				getConformsTo().clear();
				getConformsTo().addAll((Collection<? extends Standard>)newValue);
				return;
			case DcatPackage.RESOURCE_TYPE__LICENSE:
				setLicense((LicenseDocument)newValue);
				return;
			case DcatPackage.RESOURCE_TYPE__RIGHTS:
				getRights().clear();
				getRights().addAll((Collection<? extends RightsStatement>)newValue);
				return;
			case DcatPackage.RESOURCE_TYPE__HAS_POLICY:
				setHasPolicy((String)newValue);
				return;
			case DcatPackage.RESOURCE_TYPE__QUALIFIED_ATTRIBUTION:
				getQualifiedAttribution().clear();
				getQualifiedAttribution().addAll((Collection<? extends String>)newValue);
				return;
			case DcatPackage.RESOURCE_TYPE__RELATION:
				getRelation().clear();
				getRelation().addAll((Collection<? extends Resource>)newValue);
				return;
			case DcatPackage.RESOURCE_TYPE__QUALIFIED_RELATION:
				getQualifiedRelation().clear();
				getQualifiedRelation().addAll((Collection<? extends Relationship>)newValue);
				return;
			case DcatPackage.RESOURCE_TYPE__IS_REFERENCED_BY:
				getIsReferencedBy().clear();
				getIsReferencedBy().addAll((Collection<? extends Resource>)newValue);
				return;
			case DcatPackage.RESOURCE_TYPE__LANGUAGE:
				getLanguage().clear();
				getLanguage().addAll((Collection<? extends Resource>)newValue);
				return;
			case DcatPackage.RESOURCE_TYPE__ABOUT:
				setAbout((String)newValue);
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
			case DcatPackage.RESOURCE_TYPE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case DcatPackage.RESOURCE_TYPE__TITLE:
				getTitle().clear();
				return;
			case DcatPackage.RESOURCE_TYPE__DESCRIPTION:
				getDescription().clear();
				return;
			case DcatPackage.RESOURCE_TYPE__THEME:
				getTheme().clear();
				return;
			case DcatPackage.RESOURCE_TYPE__KEYWORD:
				getKeyword().clear();
				return;
			case DcatPackage.RESOURCE_TYPE__TYPE:
				getType().clear();
				return;
			case DcatPackage.RESOURCE_TYPE__CONTACT_POINT:
				getContactPoint().clear();
				return;
			case DcatPackage.RESOURCE_TYPE__CREATOR:
				setCreator((Agent)null);
				return;
			case DcatPackage.RESOURCE_TYPE__PUBLISHER:
				setPublisher((Agent)null);
				return;
			case DcatPackage.RESOURCE_TYPE__ISSUED:
				setIssued((DateOrDateTimeLiteral)null);
				return;
			case DcatPackage.RESOURCE_TYPE__MODIFIED:
				setModified((DateOrDateTimeLiteral)null);
				return;
			case DcatPackage.RESOURCE_TYPE__LANDING_PAGE:
				getLandingPage().clear();
				return;
			case DcatPackage.RESOURCE_TYPE__ACCESS_RIGHTS:
				setAccessRights((Concept)null);
				return;
			case DcatPackage.RESOURCE_TYPE__CONFORMS_TO:
				getConformsTo().clear();
				return;
			case DcatPackage.RESOURCE_TYPE__LICENSE:
				setLicense((LicenseDocument)null);
				return;
			case DcatPackage.RESOURCE_TYPE__RIGHTS:
				getRights().clear();
				return;
			case DcatPackage.RESOURCE_TYPE__HAS_POLICY:
				setHasPolicy(HAS_POLICY_EDEFAULT);
				return;
			case DcatPackage.RESOURCE_TYPE__QUALIFIED_ATTRIBUTION:
				getQualifiedAttribution().clear();
				return;
			case DcatPackage.RESOURCE_TYPE__RELATION:
				getRelation().clear();
				return;
			case DcatPackage.RESOURCE_TYPE__QUALIFIED_RELATION:
				getQualifiedRelation().clear();
				return;
			case DcatPackage.RESOURCE_TYPE__IS_REFERENCED_BY:
				getIsReferencedBy().clear();
				return;
			case DcatPackage.RESOURCE_TYPE__LANGUAGE:
				getLanguage().clear();
				return;
			case DcatPackage.RESOURCE_TYPE__ABOUT:
				setAbout(ABOUT_EDEFAULT);
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
			case DcatPackage.RESOURCE_TYPE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case DcatPackage.RESOURCE_TYPE__TITLE:
				return title != null && !title.isEmpty();
			case DcatPackage.RESOURCE_TYPE__DESCRIPTION:
				return description != null && !description.isEmpty();
			case DcatPackage.RESOURCE_TYPE__THEME:
				return theme != null && !theme.isEmpty();
			case DcatPackage.RESOURCE_TYPE__KEYWORD:
				return keyword != null && !keyword.isEmpty();
			case DcatPackage.RESOURCE_TYPE__TYPE:
				return type != null && !type.isEmpty();
			case DcatPackage.RESOURCE_TYPE__CONTACT_POINT:
				return contactPoint != null && !contactPoint.isEmpty();
			case DcatPackage.RESOURCE_TYPE__CREATOR:
				return creator != null;
			case DcatPackage.RESOURCE_TYPE__PUBLISHER:
				return publisher != null;
			case DcatPackage.RESOURCE_TYPE__ISSUED:
				return issued != null;
			case DcatPackage.RESOURCE_TYPE__MODIFIED:
				return modified != null;
			case DcatPackage.RESOURCE_TYPE__LANDING_PAGE:
				return landingPage != null && !landingPage.isEmpty();
			case DcatPackage.RESOURCE_TYPE__ACCESS_RIGHTS:
				return accessRights != null;
			case DcatPackage.RESOURCE_TYPE__CONFORMS_TO:
				return conformsTo != null && !conformsTo.isEmpty();
			case DcatPackage.RESOURCE_TYPE__LICENSE:
				return license != null;
			case DcatPackage.RESOURCE_TYPE__RIGHTS:
				return rights != null && !rights.isEmpty();
			case DcatPackage.RESOURCE_TYPE__HAS_POLICY:
				return HAS_POLICY_EDEFAULT == null ? hasPolicy != null : !HAS_POLICY_EDEFAULT.equals(hasPolicy);
			case DcatPackage.RESOURCE_TYPE__QUALIFIED_ATTRIBUTION:
				return qualifiedAttribution != null && !qualifiedAttribution.isEmpty();
			case DcatPackage.RESOURCE_TYPE__RELATION:
				return relation != null && !relation.isEmpty();
			case DcatPackage.RESOURCE_TYPE__QUALIFIED_RELATION:
				return qualifiedRelation != null && !qualifiedRelation.isEmpty();
			case DcatPackage.RESOURCE_TYPE__IS_REFERENCED_BY:
				return isReferencedBy != null && !isReferencedBy.isEmpty();
			case DcatPackage.RESOURCE_TYPE__LANGUAGE:
				return language != null && !language.isEmpty();
			case DcatPackage.RESOURCE_TYPE__ABOUT:
				return ABOUT_EDEFAULT == null ? about != null : !ABOUT_EDEFAULT.equals(about);
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
		result.append(" (hasPolicy: ");
		result.append(hasPolicy);
		result.append(", qualifiedAttribution: ");
		result.append(qualifiedAttribution);
		result.append(", about: ");
		result.append(about);
		result.append(')');
		return result.toString();
	}

} //ResourceTypeImpl
