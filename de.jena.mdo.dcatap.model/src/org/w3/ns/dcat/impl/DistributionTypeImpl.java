/**
 */
package org.w3.ns.dcat.impl;

import java.math.BigDecimal;

import java.util.Collection;

import javax.xml.datatype.Duration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.purl.dc.terms.terms.LicenseDocument;
import org.purl.dc.terms.terms.RightsStatement;
import org.purl.dc.terms.terms.Standard;

import org.w3.ns.dcat.DataServiceType;
import org.w3.ns.dcat.DcatPackage;
import org.w3.ns.dcat.DistributionType;

import org.w3.ns.rdf.DateOrDateTimeLiteral;
import org.w3.ns.rdf.PlainLiteral;

import org.w3.ns.skos.Concept;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distribution Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3.ns.dcat.impl.DistributionTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.DistributionTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.DistributionTypeImpl#getAccessService <em>Access Service</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.DistributionTypeImpl#getAccessURL <em>Access URL</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.DistributionTypeImpl#getDownloadURL <em>Download URL</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.DistributionTypeImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.DistributionTypeImpl#getMediaType <em>Media Type</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.DistributionTypeImpl#getPackageFormat <em>Package Format</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.DistributionTypeImpl#getByteSize <em>Byte Size</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.DistributionTypeImpl#getCompressFormat <em>Compress Format</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.DistributionTypeImpl#getSpatialResolutionInMeters <em>Spatial Resolution In Meters</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.DistributionTypeImpl#getTemporalResolution <em>Temporal Resolution</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.DistributionTypeImpl#getAccessRights <em>Access Rights</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.DistributionTypeImpl#getLicense <em>License</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.DistributionTypeImpl#getConformsTo <em>Conforms To</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.DistributionTypeImpl#getRights <em>Rights</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.DistributionTypeImpl#getHasPolicy <em>Has Policy</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.DistributionTypeImpl#getIssued <em>Issued</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.DistributionTypeImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.DistributionTypeImpl#getAbout <em>About</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.DistributionTypeImpl#getNodeID <em>Node ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DistributionTypeImpl extends MinimalEObjectImpl.Container implements DistributionType {
	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected PlainLiteral title;

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
	 * The cached value of the '{@link #getAccessService() <em>Access Service</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessService()
	 * @generated
	 * @ordered
	 */
	protected EList<DataServiceType> accessService;

	/**
	 * The cached value of the '{@link #getAccessURL() <em>Access URL</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessURL()
	 * @generated
	 * @ordered
	 */
	protected EList<String> accessURL;

	/**
	 * The cached value of the '{@link #getDownloadURL() <em>Download URL</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownloadURL()
	 * @generated
	 * @ordered
	 */
	protected EList<String> downloadURL;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected Concept format;

	/**
	 * The cached value of the '{@link #getMediaType() <em>Media Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaType()
	 * @generated
	 * @ordered
	 */
	protected EList<String> mediaType;

	/**
	 * The cached value of the '{@link #getPackageFormat() <em>Package Format</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageFormat()
	 * @generated
	 * @ordered
	 */
	protected EList<String> packageFormat;

	/**
	 * The cached value of the '{@link #getByteSize() <em>Byte Size</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteSize()
	 * @generated
	 * @ordered
	 */
	protected EList<BigDecimal> byteSize;

	/**
	 * The cached value of the '{@link #getCompressFormat() <em>Compress Format</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressFormat()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> compressFormat;

	/**
	 * The cached value of the '{@link #getSpatialResolutionInMeters() <em>Spatial Resolution In Meters</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpatialResolutionInMeters()
	 * @generated
	 * @ordered
	 */
	protected EList<BigDecimal> spatialResolutionInMeters;

	/**
	 * The cached value of the '{@link #getTemporalResolution() <em>Temporal Resolution</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporalResolution()
	 * @generated
	 * @ordered
	 */
	protected EList<Duration> temporalResolution;

	/**
	 * The cached value of the '{@link #getAccessRights() <em>Access Rights</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessRights()
	 * @generated
	 * @ordered
	 */
	protected EList<Concept> accessRights;

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
	 * The cached value of the '{@link #getConformsTo() <em>Conforms To</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformsTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Standard> conformsTo;

	/**
	 * The cached value of the '{@link #getRights() <em>Rights</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRights()
	 * @generated
	 * @ordered
	 */
	protected RightsStatement rights;

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
	 * The default value of the '{@link #getNodeID() <em>Node ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeID()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNodeID() <em>Node ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeID()
	 * @generated
	 * @ordered
	 */
	protected String nodeID = NODE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistributionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DcatPackage.Literals.DISTRIBUTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlainLiteral getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(PlainLiteral newTitle, NotificationChain msgs) {
		PlainLiteral oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DcatPackage.DISTRIBUTION_TYPE__TITLE, oldTitle, newTitle);
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
	public void setTitle(PlainLiteral newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DcatPackage.DISTRIBUTION_TYPE__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DcatPackage.DISTRIBUTION_TYPE__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatPackage.DISTRIBUTION_TYPE__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlainLiteral> getDescription() {
		if (description == null) {
			description = new EObjectContainmentEList<PlainLiteral>(PlainLiteral.class, this, DcatPackage.DISTRIBUTION_TYPE__DESCRIPTION);
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataServiceType> getAccessService() {
		if (accessService == null) {
			accessService = new EObjectContainmentEList<DataServiceType>(DataServiceType.class, this, DcatPackage.DISTRIBUTION_TYPE__ACCESS_SERVICE);
		}
		return accessService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAccessURL() {
		if (accessURL == null) {
			accessURL = new EDataTypeEList<String>(String.class, this, DcatPackage.DISTRIBUTION_TYPE__ACCESS_URL);
		}
		return accessURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getDownloadURL() {
		if (downloadURL == null) {
			downloadURL = new EDataTypeEList<String>(String.class, this, DcatPackage.DISTRIBUTION_TYPE__DOWNLOAD_URL);
		}
		return downloadURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Concept getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormat(Concept newFormat, NotificationChain msgs) {
		Concept oldFormat = format;
		format = newFormat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DcatPackage.DISTRIBUTION_TYPE__FORMAT, oldFormat, newFormat);
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
	public void setFormat(Concept newFormat) {
		if (newFormat != format) {
			NotificationChain msgs = null;
			if (format != null)
				msgs = ((InternalEObject)format).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DcatPackage.DISTRIBUTION_TYPE__FORMAT, null, msgs);
			if (newFormat != null)
				msgs = ((InternalEObject)newFormat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DcatPackage.DISTRIBUTION_TYPE__FORMAT, null, msgs);
			msgs = basicSetFormat(newFormat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatPackage.DISTRIBUTION_TYPE__FORMAT, newFormat, newFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getMediaType() {
		if (mediaType == null) {
			mediaType = new EDataTypeEList<String>(String.class, this, DcatPackage.DISTRIBUTION_TYPE__MEDIA_TYPE);
		}
		return mediaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPackageFormat() {
		if (packageFormat == null) {
			packageFormat = new EDataTypeEList<String>(String.class, this, DcatPackage.DISTRIBUTION_TYPE__PACKAGE_FORMAT);
		}
		return packageFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BigDecimal> getByteSize() {
		if (byteSize == null) {
			byteSize = new EDataTypeEList<BigDecimal>(BigDecimal.class, this, DcatPackage.DISTRIBUTION_TYPE__BYTE_SIZE);
		}
		return byteSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getCompressFormat() {
		if (compressFormat == null) {
			compressFormat = new EObjectContainmentEList<EObject>(EObject.class, this, DcatPackage.DISTRIBUTION_TYPE__COMPRESS_FORMAT);
		}
		return compressFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BigDecimal> getSpatialResolutionInMeters() {
		if (spatialResolutionInMeters == null) {
			spatialResolutionInMeters = new EDataTypeEList<BigDecimal>(BigDecimal.class, this, DcatPackage.DISTRIBUTION_TYPE__SPATIAL_RESOLUTION_IN_METERS);
		}
		return spatialResolutionInMeters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Duration> getTemporalResolution() {
		if (temporalResolution == null) {
			temporalResolution = new EDataTypeEList<Duration>(Duration.class, this, DcatPackage.DISTRIBUTION_TYPE__TEMPORAL_RESOLUTION);
		}
		return temporalResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Concept> getAccessRights() {
		if (accessRights == null) {
			accessRights = new EObjectContainmentEList<Concept>(Concept.class, this, DcatPackage.DISTRIBUTION_TYPE__ACCESS_RIGHTS);
		}
		return accessRights;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DcatPackage.DISTRIBUTION_TYPE__LICENSE, oldLicense, newLicense);
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
				msgs = ((InternalEObject)license).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DcatPackage.DISTRIBUTION_TYPE__LICENSE, null, msgs);
			if (newLicense != null)
				msgs = ((InternalEObject)newLicense).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DcatPackage.DISTRIBUTION_TYPE__LICENSE, null, msgs);
			msgs = basicSetLicense(newLicense, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatPackage.DISTRIBUTION_TYPE__LICENSE, newLicense, newLicense));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Standard> getConformsTo() {
		if (conformsTo == null) {
			conformsTo = new EObjectContainmentEList<Standard>(Standard.class, this, DcatPackage.DISTRIBUTION_TYPE__CONFORMS_TO);
		}
		return conformsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RightsStatement getRights() {
		return rights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRights(RightsStatement newRights, NotificationChain msgs) {
		RightsStatement oldRights = rights;
		rights = newRights;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DcatPackage.DISTRIBUTION_TYPE__RIGHTS, oldRights, newRights);
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
	public void setRights(RightsStatement newRights) {
		if (newRights != rights) {
			NotificationChain msgs = null;
			if (rights != null)
				msgs = ((InternalEObject)rights).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DcatPackage.DISTRIBUTION_TYPE__RIGHTS, null, msgs);
			if (newRights != null)
				msgs = ((InternalEObject)newRights).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DcatPackage.DISTRIBUTION_TYPE__RIGHTS, null, msgs);
			msgs = basicSetRights(newRights, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatPackage.DISTRIBUTION_TYPE__RIGHTS, newRights, newRights));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DcatPackage.DISTRIBUTION_TYPE__HAS_POLICY, oldHasPolicy, hasPolicy));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DcatPackage.DISTRIBUTION_TYPE__ISSUED, oldIssued, newIssued);
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
				msgs = ((InternalEObject)issued).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DcatPackage.DISTRIBUTION_TYPE__ISSUED, null, msgs);
			if (newIssued != null)
				msgs = ((InternalEObject)newIssued).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DcatPackage.DISTRIBUTION_TYPE__ISSUED, null, msgs);
			msgs = basicSetIssued(newIssued, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatPackage.DISTRIBUTION_TYPE__ISSUED, newIssued, newIssued));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DcatPackage.DISTRIBUTION_TYPE__MODIFIED, oldModified, newModified);
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
				msgs = ((InternalEObject)modified).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DcatPackage.DISTRIBUTION_TYPE__MODIFIED, null, msgs);
			if (newModified != null)
				msgs = ((InternalEObject)newModified).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DcatPackage.DISTRIBUTION_TYPE__MODIFIED, null, msgs);
			msgs = basicSetModified(newModified, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatPackage.DISTRIBUTION_TYPE__MODIFIED, newModified, newModified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DcatPackage.DISTRIBUTION_TYPE__ABOUT, oldAbout, about));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNodeID() {
		return nodeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNodeID(String newNodeID) {
		String oldNodeID = nodeID;
		nodeID = newNodeID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatPackage.DISTRIBUTION_TYPE__NODE_ID, oldNodeID, nodeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DcatPackage.DISTRIBUTION_TYPE__TITLE:
				return basicSetTitle(null, msgs);
			case DcatPackage.DISTRIBUTION_TYPE__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case DcatPackage.DISTRIBUTION_TYPE__ACCESS_SERVICE:
				return ((InternalEList<?>)getAccessService()).basicRemove(otherEnd, msgs);
			case DcatPackage.DISTRIBUTION_TYPE__FORMAT:
				return basicSetFormat(null, msgs);
			case DcatPackage.DISTRIBUTION_TYPE__COMPRESS_FORMAT:
				return ((InternalEList<?>)getCompressFormat()).basicRemove(otherEnd, msgs);
			case DcatPackage.DISTRIBUTION_TYPE__ACCESS_RIGHTS:
				return ((InternalEList<?>)getAccessRights()).basicRemove(otherEnd, msgs);
			case DcatPackage.DISTRIBUTION_TYPE__LICENSE:
				return basicSetLicense(null, msgs);
			case DcatPackage.DISTRIBUTION_TYPE__CONFORMS_TO:
				return ((InternalEList<?>)getConformsTo()).basicRemove(otherEnd, msgs);
			case DcatPackage.DISTRIBUTION_TYPE__RIGHTS:
				return basicSetRights(null, msgs);
			case DcatPackage.DISTRIBUTION_TYPE__ISSUED:
				return basicSetIssued(null, msgs);
			case DcatPackage.DISTRIBUTION_TYPE__MODIFIED:
				return basicSetModified(null, msgs);
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
			case DcatPackage.DISTRIBUTION_TYPE__TITLE:
				return getTitle();
			case DcatPackage.DISTRIBUTION_TYPE__DESCRIPTION:
				return getDescription();
			case DcatPackage.DISTRIBUTION_TYPE__ACCESS_SERVICE:
				return getAccessService();
			case DcatPackage.DISTRIBUTION_TYPE__ACCESS_URL:
				return getAccessURL();
			case DcatPackage.DISTRIBUTION_TYPE__DOWNLOAD_URL:
				return getDownloadURL();
			case DcatPackage.DISTRIBUTION_TYPE__FORMAT:
				return getFormat();
			case DcatPackage.DISTRIBUTION_TYPE__MEDIA_TYPE:
				return getMediaType();
			case DcatPackage.DISTRIBUTION_TYPE__PACKAGE_FORMAT:
				return getPackageFormat();
			case DcatPackage.DISTRIBUTION_TYPE__BYTE_SIZE:
				return getByteSize();
			case DcatPackage.DISTRIBUTION_TYPE__COMPRESS_FORMAT:
				return getCompressFormat();
			case DcatPackage.DISTRIBUTION_TYPE__SPATIAL_RESOLUTION_IN_METERS:
				return getSpatialResolutionInMeters();
			case DcatPackage.DISTRIBUTION_TYPE__TEMPORAL_RESOLUTION:
				return getTemporalResolution();
			case DcatPackage.DISTRIBUTION_TYPE__ACCESS_RIGHTS:
				return getAccessRights();
			case DcatPackage.DISTRIBUTION_TYPE__LICENSE:
				return getLicense();
			case DcatPackage.DISTRIBUTION_TYPE__CONFORMS_TO:
				return getConformsTo();
			case DcatPackage.DISTRIBUTION_TYPE__RIGHTS:
				return getRights();
			case DcatPackage.DISTRIBUTION_TYPE__HAS_POLICY:
				return getHasPolicy();
			case DcatPackage.DISTRIBUTION_TYPE__ISSUED:
				return getIssued();
			case DcatPackage.DISTRIBUTION_TYPE__MODIFIED:
				return getModified();
			case DcatPackage.DISTRIBUTION_TYPE__ABOUT:
				return getAbout();
			case DcatPackage.DISTRIBUTION_TYPE__NODE_ID:
				return getNodeID();
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
			case DcatPackage.DISTRIBUTION_TYPE__TITLE:
				setTitle((PlainLiteral)newValue);
				return;
			case DcatPackage.DISTRIBUTION_TYPE__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends PlainLiteral>)newValue);
				return;
			case DcatPackage.DISTRIBUTION_TYPE__ACCESS_SERVICE:
				getAccessService().clear();
				getAccessService().addAll((Collection<? extends DataServiceType>)newValue);
				return;
			case DcatPackage.DISTRIBUTION_TYPE__ACCESS_URL:
				getAccessURL().clear();
				getAccessURL().addAll((Collection<? extends String>)newValue);
				return;
			case DcatPackage.DISTRIBUTION_TYPE__DOWNLOAD_URL:
				getDownloadURL().clear();
				getDownloadURL().addAll((Collection<? extends String>)newValue);
				return;
			case DcatPackage.DISTRIBUTION_TYPE__FORMAT:
				setFormat((Concept)newValue);
				return;
			case DcatPackage.DISTRIBUTION_TYPE__MEDIA_TYPE:
				getMediaType().clear();
				getMediaType().addAll((Collection<? extends String>)newValue);
				return;
			case DcatPackage.DISTRIBUTION_TYPE__PACKAGE_FORMAT:
				getPackageFormat().clear();
				getPackageFormat().addAll((Collection<? extends String>)newValue);
				return;
			case DcatPackage.DISTRIBUTION_TYPE__BYTE_SIZE:
				getByteSize().clear();
				getByteSize().addAll((Collection<? extends BigDecimal>)newValue);
				return;
			case DcatPackage.DISTRIBUTION_TYPE__COMPRESS_FORMAT:
				getCompressFormat().clear();
				getCompressFormat().addAll((Collection<? extends EObject>)newValue);
				return;
			case DcatPackage.DISTRIBUTION_TYPE__SPATIAL_RESOLUTION_IN_METERS:
				getSpatialResolutionInMeters().clear();
				getSpatialResolutionInMeters().addAll((Collection<? extends BigDecimal>)newValue);
				return;
			case DcatPackage.DISTRIBUTION_TYPE__TEMPORAL_RESOLUTION:
				getTemporalResolution().clear();
				getTemporalResolution().addAll((Collection<? extends Duration>)newValue);
				return;
			case DcatPackage.DISTRIBUTION_TYPE__ACCESS_RIGHTS:
				getAccessRights().clear();
				getAccessRights().addAll((Collection<? extends Concept>)newValue);
				return;
			case DcatPackage.DISTRIBUTION_TYPE__LICENSE:
				setLicense((LicenseDocument)newValue);
				return;
			case DcatPackage.DISTRIBUTION_TYPE__CONFORMS_TO:
				getConformsTo().clear();
				getConformsTo().addAll((Collection<? extends Standard>)newValue);
				return;
			case DcatPackage.DISTRIBUTION_TYPE__RIGHTS:
				setRights((RightsStatement)newValue);
				return;
			case DcatPackage.DISTRIBUTION_TYPE__HAS_POLICY:
				setHasPolicy((String)newValue);
				return;
			case DcatPackage.DISTRIBUTION_TYPE__ISSUED:
				setIssued((DateOrDateTimeLiteral)newValue);
				return;
			case DcatPackage.DISTRIBUTION_TYPE__MODIFIED:
				setModified((DateOrDateTimeLiteral)newValue);
				return;
			case DcatPackage.DISTRIBUTION_TYPE__ABOUT:
				setAbout((String)newValue);
				return;
			case DcatPackage.DISTRIBUTION_TYPE__NODE_ID:
				setNodeID((String)newValue);
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
			case DcatPackage.DISTRIBUTION_TYPE__TITLE:
				setTitle((PlainLiteral)null);
				return;
			case DcatPackage.DISTRIBUTION_TYPE__DESCRIPTION:
				getDescription().clear();
				return;
			case DcatPackage.DISTRIBUTION_TYPE__ACCESS_SERVICE:
				getAccessService().clear();
				return;
			case DcatPackage.DISTRIBUTION_TYPE__ACCESS_URL:
				getAccessURL().clear();
				return;
			case DcatPackage.DISTRIBUTION_TYPE__DOWNLOAD_URL:
				getDownloadURL().clear();
				return;
			case DcatPackage.DISTRIBUTION_TYPE__FORMAT:
				setFormat((Concept)null);
				return;
			case DcatPackage.DISTRIBUTION_TYPE__MEDIA_TYPE:
				getMediaType().clear();
				return;
			case DcatPackage.DISTRIBUTION_TYPE__PACKAGE_FORMAT:
				getPackageFormat().clear();
				return;
			case DcatPackage.DISTRIBUTION_TYPE__BYTE_SIZE:
				getByteSize().clear();
				return;
			case DcatPackage.DISTRIBUTION_TYPE__COMPRESS_FORMAT:
				getCompressFormat().clear();
				return;
			case DcatPackage.DISTRIBUTION_TYPE__SPATIAL_RESOLUTION_IN_METERS:
				getSpatialResolutionInMeters().clear();
				return;
			case DcatPackage.DISTRIBUTION_TYPE__TEMPORAL_RESOLUTION:
				getTemporalResolution().clear();
				return;
			case DcatPackage.DISTRIBUTION_TYPE__ACCESS_RIGHTS:
				getAccessRights().clear();
				return;
			case DcatPackage.DISTRIBUTION_TYPE__LICENSE:
				setLicense((LicenseDocument)null);
				return;
			case DcatPackage.DISTRIBUTION_TYPE__CONFORMS_TO:
				getConformsTo().clear();
				return;
			case DcatPackage.DISTRIBUTION_TYPE__RIGHTS:
				setRights((RightsStatement)null);
				return;
			case DcatPackage.DISTRIBUTION_TYPE__HAS_POLICY:
				setHasPolicy(HAS_POLICY_EDEFAULT);
				return;
			case DcatPackage.DISTRIBUTION_TYPE__ISSUED:
				setIssued((DateOrDateTimeLiteral)null);
				return;
			case DcatPackage.DISTRIBUTION_TYPE__MODIFIED:
				setModified((DateOrDateTimeLiteral)null);
				return;
			case DcatPackage.DISTRIBUTION_TYPE__ABOUT:
				setAbout(ABOUT_EDEFAULT);
				return;
			case DcatPackage.DISTRIBUTION_TYPE__NODE_ID:
				setNodeID(NODE_ID_EDEFAULT);
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
			case DcatPackage.DISTRIBUTION_TYPE__TITLE:
				return title != null;
			case DcatPackage.DISTRIBUTION_TYPE__DESCRIPTION:
				return description != null && !description.isEmpty();
			case DcatPackage.DISTRIBUTION_TYPE__ACCESS_SERVICE:
				return accessService != null && !accessService.isEmpty();
			case DcatPackage.DISTRIBUTION_TYPE__ACCESS_URL:
				return accessURL != null && !accessURL.isEmpty();
			case DcatPackage.DISTRIBUTION_TYPE__DOWNLOAD_URL:
				return downloadURL != null && !downloadURL.isEmpty();
			case DcatPackage.DISTRIBUTION_TYPE__FORMAT:
				return format != null;
			case DcatPackage.DISTRIBUTION_TYPE__MEDIA_TYPE:
				return mediaType != null && !mediaType.isEmpty();
			case DcatPackage.DISTRIBUTION_TYPE__PACKAGE_FORMAT:
				return packageFormat != null && !packageFormat.isEmpty();
			case DcatPackage.DISTRIBUTION_TYPE__BYTE_SIZE:
				return byteSize != null && !byteSize.isEmpty();
			case DcatPackage.DISTRIBUTION_TYPE__COMPRESS_FORMAT:
				return compressFormat != null && !compressFormat.isEmpty();
			case DcatPackage.DISTRIBUTION_TYPE__SPATIAL_RESOLUTION_IN_METERS:
				return spatialResolutionInMeters != null && !spatialResolutionInMeters.isEmpty();
			case DcatPackage.DISTRIBUTION_TYPE__TEMPORAL_RESOLUTION:
				return temporalResolution != null && !temporalResolution.isEmpty();
			case DcatPackage.DISTRIBUTION_TYPE__ACCESS_RIGHTS:
				return accessRights != null && !accessRights.isEmpty();
			case DcatPackage.DISTRIBUTION_TYPE__LICENSE:
				return license != null;
			case DcatPackage.DISTRIBUTION_TYPE__CONFORMS_TO:
				return conformsTo != null && !conformsTo.isEmpty();
			case DcatPackage.DISTRIBUTION_TYPE__RIGHTS:
				return rights != null;
			case DcatPackage.DISTRIBUTION_TYPE__HAS_POLICY:
				return HAS_POLICY_EDEFAULT == null ? hasPolicy != null : !HAS_POLICY_EDEFAULT.equals(hasPolicy);
			case DcatPackage.DISTRIBUTION_TYPE__ISSUED:
				return issued != null;
			case DcatPackage.DISTRIBUTION_TYPE__MODIFIED:
				return modified != null;
			case DcatPackage.DISTRIBUTION_TYPE__ABOUT:
				return ABOUT_EDEFAULT == null ? about != null : !ABOUT_EDEFAULT.equals(about);
			case DcatPackage.DISTRIBUTION_TYPE__NODE_ID:
				return NODE_ID_EDEFAULT == null ? nodeID != null : !NODE_ID_EDEFAULT.equals(nodeID);
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
		result.append(" (accessURL: ");
		result.append(accessURL);
		result.append(", downloadURL: ");
		result.append(downloadURL);
		result.append(", mediaType: ");
		result.append(mediaType);
		result.append(", packageFormat: ");
		result.append(packageFormat);
		result.append(", byteSize: ");
		result.append(byteSize);
		result.append(", spatialResolutionInMeters: ");
		result.append(spatialResolutionInMeters);
		result.append(", temporalResolution: ");
		result.append(temporalResolution);
		result.append(", hasPolicy: ");
		result.append(hasPolicy);
		result.append(", about: ");
		result.append(about);
		result.append(", nodeID: ");
		result.append(nodeID);
		result.append(')');
		return result.toString();
	}

} //DistributionTypeImpl
