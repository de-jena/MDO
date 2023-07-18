/**
 */
package dcat.impl;

import dcat.DcatPackage;
import dcat.DcatResource;
import dcat.Relationship;

import foaf.Agent;
import foaf.Document;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rdf.DateOrDateTimeLiteral;
import rdf.PlainLiteral;
import rdf.Resource;

import rdf.impl.ResourceImpl;

import skos.Concept;

import terms.LicenseDocument;
import terms.RightsStatement;
import terms.Standard;

import vcard.Organization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dcat.impl.DcatResourceImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link dcat.impl.DcatResourceImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link dcat.impl.DcatResourceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link dcat.impl.DcatResourceImpl#getTheme <em>Theme</em>}</li>
 *   <li>{@link dcat.impl.DcatResourceImpl#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link dcat.impl.DcatResourceImpl#getType <em>Type</em>}</li>
 *   <li>{@link dcat.impl.DcatResourceImpl#getContactPoint <em>Contact Point</em>}</li>
 *   <li>{@link dcat.impl.DcatResourceImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link dcat.impl.DcatResourceImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link dcat.impl.DcatResourceImpl#getIssued <em>Issued</em>}</li>
 *   <li>{@link dcat.impl.DcatResourceImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link dcat.impl.DcatResourceImpl#getLandingPage <em>Landing Page</em>}</li>
 *   <li>{@link dcat.impl.DcatResourceImpl#getAccessRights <em>Access Rights</em>}</li>
 *   <li>{@link dcat.impl.DcatResourceImpl#getConformsTo <em>Conforms To</em>}</li>
 *   <li>{@link dcat.impl.DcatResourceImpl#getLicense <em>License</em>}</li>
 *   <li>{@link dcat.impl.DcatResourceImpl#getRights <em>Rights</em>}</li>
 *   <li>{@link dcat.impl.DcatResourceImpl#getHasPolicy <em>Has Policy</em>}</li>
 *   <li>{@link dcat.impl.DcatResourceImpl#getQualifiedAttribution <em>Qualified Attribution</em>}</li>
 *   <li>{@link dcat.impl.DcatResourceImpl#getRelation <em>Relation</em>}</li>
 *   <li>{@link dcat.impl.DcatResourceImpl#getQualifiedRelation <em>Qualified Relation</em>}</li>
 *   <li>{@link dcat.impl.DcatResourceImpl#getIsReferencedBy <em>Is Referenced By</em>}</li>
 *   <li>{@link dcat.impl.DcatResourceImpl#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DcatResourceImpl extends ResourceImpl implements DcatResource {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DcatResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DcatPackage.Literals.DCAT_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlainLiteral> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<PlainLiteral>(PlainLiteral.class, this, DcatPackage.DCAT_RESOURCE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlainLiteral> getTitle() {
		if (title == null) {
			title = new EObjectContainmentEList<PlainLiteral>(PlainLiteral.class, this, DcatPackage.DCAT_RESOURCE__TITLE);
		}
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlainLiteral> getDescription() {
		if (description == null) {
			description = new EObjectContainmentEList<PlainLiteral>(PlainLiteral.class, this, DcatPackage.DCAT_RESOURCE__DESCRIPTION);
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Concept> getTheme() {
		if (theme == null) {
			theme = new EObjectContainmentEList<Concept>(Concept.class, this, DcatPackage.DCAT_RESOURCE__THEME);
		}
		return theme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlainLiteral> getKeyword() {
		if (keyword == null) {
			keyword = new EObjectContainmentEList<PlainLiteral>(PlainLiteral.class, this, DcatPackage.DCAT_RESOURCE__KEYWORD);
		}
		return keyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Concept> getType() {
		if (type == null) {
			type = new EObjectContainmentEList<Concept>(Concept.class, this, DcatPackage.DCAT_RESOURCE__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Organization> getContactPoint() {
		if (contactPoint == null) {
			contactPoint = new EObjectContainmentEList<Organization>(Organization.class, this, DcatPackage.DCAT_RESOURCE__CONTACT_POINT);
		}
		return contactPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DcatPackage.DCAT_RESOURCE__CREATOR, oldCreator, newCreator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreator(Agent newCreator) {
		if (newCreator != creator) {
			NotificationChain msgs = null;
			if (creator != null)
				msgs = ((InternalEObject)creator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DcatPackage.DCAT_RESOURCE__CREATOR, null, msgs);
			if (newCreator != null)
				msgs = ((InternalEObject)newCreator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DcatPackage.DCAT_RESOURCE__CREATOR, null, msgs);
			msgs = basicSetCreator(newCreator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatPackage.DCAT_RESOURCE__CREATOR, newCreator, newCreator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DcatPackage.DCAT_RESOURCE__PUBLISHER, oldPublisher, newPublisher);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisher(Agent newPublisher) {
		if (newPublisher != publisher) {
			NotificationChain msgs = null;
			if (publisher != null)
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DcatPackage.DCAT_RESOURCE__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DcatPackage.DCAT_RESOURCE__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatPackage.DCAT_RESOURCE__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DcatPackage.DCAT_RESOURCE__ISSUED, oldIssued, newIssued);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssued(DateOrDateTimeLiteral newIssued) {
		if (newIssued != issued) {
			NotificationChain msgs = null;
			if (issued != null)
				msgs = ((InternalEObject)issued).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DcatPackage.DCAT_RESOURCE__ISSUED, null, msgs);
			if (newIssued != null)
				msgs = ((InternalEObject)newIssued).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DcatPackage.DCAT_RESOURCE__ISSUED, null, msgs);
			msgs = basicSetIssued(newIssued, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatPackage.DCAT_RESOURCE__ISSUED, newIssued, newIssued));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DcatPackage.DCAT_RESOURCE__MODIFIED, oldModified, newModified);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModified(DateOrDateTimeLiteral newModified) {
		if (newModified != modified) {
			NotificationChain msgs = null;
			if (modified != null)
				msgs = ((InternalEObject)modified).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DcatPackage.DCAT_RESOURCE__MODIFIED, null, msgs);
			if (newModified != null)
				msgs = ((InternalEObject)newModified).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DcatPackage.DCAT_RESOURCE__MODIFIED, null, msgs);
			msgs = basicSetModified(newModified, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatPackage.DCAT_RESOURCE__MODIFIED, newModified, newModified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Document> getLandingPage() {
		if (landingPage == null) {
			landingPage = new EObjectContainmentEList<Document>(Document.class, this, DcatPackage.DCAT_RESOURCE__LANDING_PAGE);
		}
		return landingPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DcatPackage.DCAT_RESOURCE__ACCESS_RIGHTS, oldAccessRights, newAccessRights);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessRights(Concept newAccessRights) {
		if (newAccessRights != accessRights) {
			NotificationChain msgs = null;
			if (accessRights != null)
				msgs = ((InternalEObject)accessRights).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DcatPackage.DCAT_RESOURCE__ACCESS_RIGHTS, null, msgs);
			if (newAccessRights != null)
				msgs = ((InternalEObject)newAccessRights).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DcatPackage.DCAT_RESOURCE__ACCESS_RIGHTS, null, msgs);
			msgs = basicSetAccessRights(newAccessRights, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatPackage.DCAT_RESOURCE__ACCESS_RIGHTS, newAccessRights, newAccessRights));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Standard> getConformsTo() {
		if (conformsTo == null) {
			conformsTo = new EObjectContainmentEList<Standard>(Standard.class, this, DcatPackage.DCAT_RESOURCE__CONFORMS_TO);
		}
		return conformsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DcatPackage.DCAT_RESOURCE__LICENSE, oldLicense, newLicense);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLicense(LicenseDocument newLicense) {
		if (newLicense != license) {
			NotificationChain msgs = null;
			if (license != null)
				msgs = ((InternalEObject)license).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DcatPackage.DCAT_RESOURCE__LICENSE, null, msgs);
			if (newLicense != null)
				msgs = ((InternalEObject)newLicense).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DcatPackage.DCAT_RESOURCE__LICENSE, null, msgs);
			msgs = basicSetLicense(newLicense, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatPackage.DCAT_RESOURCE__LICENSE, newLicense, newLicense));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RightsStatement> getRights() {
		if (rights == null) {
			rights = new EObjectContainmentEList<RightsStatement>(RightsStatement.class, this, DcatPackage.DCAT_RESOURCE__RIGHTS);
		}
		return rights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHasPolicy() {
		return hasPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasPolicy(String newHasPolicy) {
		String oldHasPolicy = hasPolicy;
		hasPolicy = newHasPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatPackage.DCAT_RESOURCE__HAS_POLICY, oldHasPolicy, hasPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getQualifiedAttribution() {
		if (qualifiedAttribution == null) {
			qualifiedAttribution = new EDataTypeEList<String>(String.class, this, DcatPackage.DCAT_RESOURCE__QUALIFIED_ATTRIBUTION);
		}
		return qualifiedAttribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getRelation() {
		if (relation == null) {
			relation = new EObjectContainmentEList<Resource>(Resource.class, this, DcatPackage.DCAT_RESOURCE__RELATION);
		}
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getQualifiedRelation() {
		if (qualifiedRelation == null) {
			qualifiedRelation = new EObjectContainmentEList<Relationship>(Relationship.class, this, DcatPackage.DCAT_RESOURCE__QUALIFIED_RELATION);
		}
		return qualifiedRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getIsReferencedBy() {
		if (isReferencedBy == null) {
			isReferencedBy = new EObjectContainmentEList<Resource>(Resource.class, this, DcatPackage.DCAT_RESOURCE__IS_REFERENCED_BY);
		}
		return isReferencedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getLanguage() {
		if (language == null) {
			language = new EObjectContainmentEList<Resource>(Resource.class, this, DcatPackage.DCAT_RESOURCE__LANGUAGE);
		}
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DcatPackage.DCAT_RESOURCE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case DcatPackage.DCAT_RESOURCE__TITLE:
				return ((InternalEList<?>)getTitle()).basicRemove(otherEnd, msgs);
			case DcatPackage.DCAT_RESOURCE__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case DcatPackage.DCAT_RESOURCE__THEME:
				return ((InternalEList<?>)getTheme()).basicRemove(otherEnd, msgs);
			case DcatPackage.DCAT_RESOURCE__KEYWORD:
				return ((InternalEList<?>)getKeyword()).basicRemove(otherEnd, msgs);
			case DcatPackage.DCAT_RESOURCE__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case DcatPackage.DCAT_RESOURCE__CONTACT_POINT:
				return ((InternalEList<?>)getContactPoint()).basicRemove(otherEnd, msgs);
			case DcatPackage.DCAT_RESOURCE__CREATOR:
				return basicSetCreator(null, msgs);
			case DcatPackage.DCAT_RESOURCE__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case DcatPackage.DCAT_RESOURCE__ISSUED:
				return basicSetIssued(null, msgs);
			case DcatPackage.DCAT_RESOURCE__MODIFIED:
				return basicSetModified(null, msgs);
			case DcatPackage.DCAT_RESOURCE__LANDING_PAGE:
				return ((InternalEList<?>)getLandingPage()).basicRemove(otherEnd, msgs);
			case DcatPackage.DCAT_RESOURCE__ACCESS_RIGHTS:
				return basicSetAccessRights(null, msgs);
			case DcatPackage.DCAT_RESOURCE__CONFORMS_TO:
				return ((InternalEList<?>)getConformsTo()).basicRemove(otherEnd, msgs);
			case DcatPackage.DCAT_RESOURCE__LICENSE:
				return basicSetLicense(null, msgs);
			case DcatPackage.DCAT_RESOURCE__RIGHTS:
				return ((InternalEList<?>)getRights()).basicRemove(otherEnd, msgs);
			case DcatPackage.DCAT_RESOURCE__RELATION:
				return ((InternalEList<?>)getRelation()).basicRemove(otherEnd, msgs);
			case DcatPackage.DCAT_RESOURCE__QUALIFIED_RELATION:
				return ((InternalEList<?>)getQualifiedRelation()).basicRemove(otherEnd, msgs);
			case DcatPackage.DCAT_RESOURCE__IS_REFERENCED_BY:
				return ((InternalEList<?>)getIsReferencedBy()).basicRemove(otherEnd, msgs);
			case DcatPackage.DCAT_RESOURCE__LANGUAGE:
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
			case DcatPackage.DCAT_RESOURCE__IDENTIFIER:
				return getIdentifier();
			case DcatPackage.DCAT_RESOURCE__TITLE:
				return getTitle();
			case DcatPackage.DCAT_RESOURCE__DESCRIPTION:
				return getDescription();
			case DcatPackage.DCAT_RESOURCE__THEME:
				return getTheme();
			case DcatPackage.DCAT_RESOURCE__KEYWORD:
				return getKeyword();
			case DcatPackage.DCAT_RESOURCE__TYPE:
				return getType();
			case DcatPackage.DCAT_RESOURCE__CONTACT_POINT:
				return getContactPoint();
			case DcatPackage.DCAT_RESOURCE__CREATOR:
				return getCreator();
			case DcatPackage.DCAT_RESOURCE__PUBLISHER:
				return getPublisher();
			case DcatPackage.DCAT_RESOURCE__ISSUED:
				return getIssued();
			case DcatPackage.DCAT_RESOURCE__MODIFIED:
				return getModified();
			case DcatPackage.DCAT_RESOURCE__LANDING_PAGE:
				return getLandingPage();
			case DcatPackage.DCAT_RESOURCE__ACCESS_RIGHTS:
				return getAccessRights();
			case DcatPackage.DCAT_RESOURCE__CONFORMS_TO:
				return getConformsTo();
			case DcatPackage.DCAT_RESOURCE__LICENSE:
				return getLicense();
			case DcatPackage.DCAT_RESOURCE__RIGHTS:
				return getRights();
			case DcatPackage.DCAT_RESOURCE__HAS_POLICY:
				return getHasPolicy();
			case DcatPackage.DCAT_RESOURCE__QUALIFIED_ATTRIBUTION:
				return getQualifiedAttribution();
			case DcatPackage.DCAT_RESOURCE__RELATION:
				return getRelation();
			case DcatPackage.DCAT_RESOURCE__QUALIFIED_RELATION:
				return getQualifiedRelation();
			case DcatPackage.DCAT_RESOURCE__IS_REFERENCED_BY:
				return getIsReferencedBy();
			case DcatPackage.DCAT_RESOURCE__LANGUAGE:
				return getLanguage();
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
			case DcatPackage.DCAT_RESOURCE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends PlainLiteral>)newValue);
				return;
			case DcatPackage.DCAT_RESOURCE__TITLE:
				getTitle().clear();
				getTitle().addAll((Collection<? extends PlainLiteral>)newValue);
				return;
			case DcatPackage.DCAT_RESOURCE__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends PlainLiteral>)newValue);
				return;
			case DcatPackage.DCAT_RESOURCE__THEME:
				getTheme().clear();
				getTheme().addAll((Collection<? extends Concept>)newValue);
				return;
			case DcatPackage.DCAT_RESOURCE__KEYWORD:
				getKeyword().clear();
				getKeyword().addAll((Collection<? extends PlainLiteral>)newValue);
				return;
			case DcatPackage.DCAT_RESOURCE__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends Concept>)newValue);
				return;
			case DcatPackage.DCAT_RESOURCE__CONTACT_POINT:
				getContactPoint().clear();
				getContactPoint().addAll((Collection<? extends Organization>)newValue);
				return;
			case DcatPackage.DCAT_RESOURCE__CREATOR:
				setCreator((Agent)newValue);
				return;
			case DcatPackage.DCAT_RESOURCE__PUBLISHER:
				setPublisher((Agent)newValue);
				return;
			case DcatPackage.DCAT_RESOURCE__ISSUED:
				setIssued((DateOrDateTimeLiteral)newValue);
				return;
			case DcatPackage.DCAT_RESOURCE__MODIFIED:
				setModified((DateOrDateTimeLiteral)newValue);
				return;
			case DcatPackage.DCAT_RESOURCE__LANDING_PAGE:
				getLandingPage().clear();
				getLandingPage().addAll((Collection<? extends Document>)newValue);
				return;
			case DcatPackage.DCAT_RESOURCE__ACCESS_RIGHTS:
				setAccessRights((Concept)newValue);
				return;
			case DcatPackage.DCAT_RESOURCE__CONFORMS_TO:
				getConformsTo().clear();
				getConformsTo().addAll((Collection<? extends Standard>)newValue);
				return;
			case DcatPackage.DCAT_RESOURCE__LICENSE:
				setLicense((LicenseDocument)newValue);
				return;
			case DcatPackage.DCAT_RESOURCE__RIGHTS:
				getRights().clear();
				getRights().addAll((Collection<? extends RightsStatement>)newValue);
				return;
			case DcatPackage.DCAT_RESOURCE__HAS_POLICY:
				setHasPolicy((String)newValue);
				return;
			case DcatPackage.DCAT_RESOURCE__QUALIFIED_ATTRIBUTION:
				getQualifiedAttribution().clear();
				getQualifiedAttribution().addAll((Collection<? extends String>)newValue);
				return;
			case DcatPackage.DCAT_RESOURCE__RELATION:
				getRelation().clear();
				getRelation().addAll((Collection<? extends Resource>)newValue);
				return;
			case DcatPackage.DCAT_RESOURCE__QUALIFIED_RELATION:
				getQualifiedRelation().clear();
				getQualifiedRelation().addAll((Collection<? extends Relationship>)newValue);
				return;
			case DcatPackage.DCAT_RESOURCE__IS_REFERENCED_BY:
				getIsReferencedBy().clear();
				getIsReferencedBy().addAll((Collection<? extends Resource>)newValue);
				return;
			case DcatPackage.DCAT_RESOURCE__LANGUAGE:
				getLanguage().clear();
				getLanguage().addAll((Collection<? extends Resource>)newValue);
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
			case DcatPackage.DCAT_RESOURCE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case DcatPackage.DCAT_RESOURCE__TITLE:
				getTitle().clear();
				return;
			case DcatPackage.DCAT_RESOURCE__DESCRIPTION:
				getDescription().clear();
				return;
			case DcatPackage.DCAT_RESOURCE__THEME:
				getTheme().clear();
				return;
			case DcatPackage.DCAT_RESOURCE__KEYWORD:
				getKeyword().clear();
				return;
			case DcatPackage.DCAT_RESOURCE__TYPE:
				getType().clear();
				return;
			case DcatPackage.DCAT_RESOURCE__CONTACT_POINT:
				getContactPoint().clear();
				return;
			case DcatPackage.DCAT_RESOURCE__CREATOR:
				setCreator((Agent)null);
				return;
			case DcatPackage.DCAT_RESOURCE__PUBLISHER:
				setPublisher((Agent)null);
				return;
			case DcatPackage.DCAT_RESOURCE__ISSUED:
				setIssued((DateOrDateTimeLiteral)null);
				return;
			case DcatPackage.DCAT_RESOURCE__MODIFIED:
				setModified((DateOrDateTimeLiteral)null);
				return;
			case DcatPackage.DCAT_RESOURCE__LANDING_PAGE:
				getLandingPage().clear();
				return;
			case DcatPackage.DCAT_RESOURCE__ACCESS_RIGHTS:
				setAccessRights((Concept)null);
				return;
			case DcatPackage.DCAT_RESOURCE__CONFORMS_TO:
				getConformsTo().clear();
				return;
			case DcatPackage.DCAT_RESOURCE__LICENSE:
				setLicense((LicenseDocument)null);
				return;
			case DcatPackage.DCAT_RESOURCE__RIGHTS:
				getRights().clear();
				return;
			case DcatPackage.DCAT_RESOURCE__HAS_POLICY:
				setHasPolicy(HAS_POLICY_EDEFAULT);
				return;
			case DcatPackage.DCAT_RESOURCE__QUALIFIED_ATTRIBUTION:
				getQualifiedAttribution().clear();
				return;
			case DcatPackage.DCAT_RESOURCE__RELATION:
				getRelation().clear();
				return;
			case DcatPackage.DCAT_RESOURCE__QUALIFIED_RELATION:
				getQualifiedRelation().clear();
				return;
			case DcatPackage.DCAT_RESOURCE__IS_REFERENCED_BY:
				getIsReferencedBy().clear();
				return;
			case DcatPackage.DCAT_RESOURCE__LANGUAGE:
				getLanguage().clear();
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
			case DcatPackage.DCAT_RESOURCE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case DcatPackage.DCAT_RESOURCE__TITLE:
				return title != null && !title.isEmpty();
			case DcatPackage.DCAT_RESOURCE__DESCRIPTION:
				return description != null && !description.isEmpty();
			case DcatPackage.DCAT_RESOURCE__THEME:
				return theme != null && !theme.isEmpty();
			case DcatPackage.DCAT_RESOURCE__KEYWORD:
				return keyword != null && !keyword.isEmpty();
			case DcatPackage.DCAT_RESOURCE__TYPE:
				return type != null && !type.isEmpty();
			case DcatPackage.DCAT_RESOURCE__CONTACT_POINT:
				return contactPoint != null && !contactPoint.isEmpty();
			case DcatPackage.DCAT_RESOURCE__CREATOR:
				return creator != null;
			case DcatPackage.DCAT_RESOURCE__PUBLISHER:
				return publisher != null;
			case DcatPackage.DCAT_RESOURCE__ISSUED:
				return issued != null;
			case DcatPackage.DCAT_RESOURCE__MODIFIED:
				return modified != null;
			case DcatPackage.DCAT_RESOURCE__LANDING_PAGE:
				return landingPage != null && !landingPage.isEmpty();
			case DcatPackage.DCAT_RESOURCE__ACCESS_RIGHTS:
				return accessRights != null;
			case DcatPackage.DCAT_RESOURCE__CONFORMS_TO:
				return conformsTo != null && !conformsTo.isEmpty();
			case DcatPackage.DCAT_RESOURCE__LICENSE:
				return license != null;
			case DcatPackage.DCAT_RESOURCE__RIGHTS:
				return rights != null && !rights.isEmpty();
			case DcatPackage.DCAT_RESOURCE__HAS_POLICY:
				return HAS_POLICY_EDEFAULT == null ? hasPolicy != null : !HAS_POLICY_EDEFAULT.equals(hasPolicy);
			case DcatPackage.DCAT_RESOURCE__QUALIFIED_ATTRIBUTION:
				return qualifiedAttribution != null && !qualifiedAttribution.isEmpty();
			case DcatPackage.DCAT_RESOURCE__RELATION:
				return relation != null && !relation.isEmpty();
			case DcatPackage.DCAT_RESOURCE__QUALIFIED_RELATION:
				return qualifiedRelation != null && !qualifiedRelation.isEmpty();
			case DcatPackage.DCAT_RESOURCE__IS_REFERENCED_BY:
				return isReferencedBy != null && !isReferencedBy.isEmpty();
			case DcatPackage.DCAT_RESOURCE__LANGUAGE:
				return language != null && !language.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //DcatResourceImpl
