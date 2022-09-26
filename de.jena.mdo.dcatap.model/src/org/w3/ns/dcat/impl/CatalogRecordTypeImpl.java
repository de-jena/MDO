/**
 */
package org.w3.ns.dcat.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.purl.dc.terms.terms.Standard;

import org.w3.ns.dcat.CatalogRecordType;
import org.w3.ns.dcat.DcatPackage;

import org.w3.ns.rdf.DateOrDateTimeLiteral;
import org.w3.ns.rdf.PlainLiteral;
import org.w3.ns.rdf.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catalog Record Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3.ns.dcat.impl.CatalogRecordTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.CatalogRecordTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.CatalogRecordTypeImpl#getIssued <em>Issued</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.CatalogRecordTypeImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.CatalogRecordTypeImpl#getPrimaryTopic <em>Primary Topic</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.CatalogRecordTypeImpl#getConformsTo <em>Conforms To</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.CatalogRecordTypeImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.CatalogRecordTypeImpl#getAbout <em>About</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CatalogRecordTypeImpl extends MinimalEObjectImpl.Container implements CatalogRecordType {
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
	 * The cached value of the '{@link #getPrimaryTopic() <em>Primary Topic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryTopic()
	 * @generated
	 * @ordered
	 */
	protected Resource primaryTopic;

	/**
	 * The cached value of the '{@link #getConformsTo() <em>Conforms To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformsTo()
	 * @generated
	 * @ordered
	 */
	protected Standard conformsTo;

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
	protected CatalogRecordTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DcatPackage.Literals.CATALOG_RECORD_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlainLiteral> getTitle() {
		if (title == null) {
			title = new EObjectContainmentEList<PlainLiteral>(PlainLiteral.class, this, DcatPackage.CATALOG_RECORD_TYPE__TITLE);
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
			description = new EObjectContainmentEList<PlainLiteral>(PlainLiteral.class, this, DcatPackage.CATALOG_RECORD_TYPE__DESCRIPTION);
		}
		return description;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DcatPackage.CATALOG_RECORD_TYPE__ISSUED, oldIssued, newIssued);
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
				msgs = ((InternalEObject)issued).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DcatPackage.CATALOG_RECORD_TYPE__ISSUED, null, msgs);
			if (newIssued != null)
				msgs = ((InternalEObject)newIssued).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DcatPackage.CATALOG_RECORD_TYPE__ISSUED, null, msgs);
			msgs = basicSetIssued(newIssued, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatPackage.CATALOG_RECORD_TYPE__ISSUED, newIssued, newIssued));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DcatPackage.CATALOG_RECORD_TYPE__MODIFIED, oldModified, newModified);
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
				msgs = ((InternalEObject)modified).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DcatPackage.CATALOG_RECORD_TYPE__MODIFIED, null, msgs);
			if (newModified != null)
				msgs = ((InternalEObject)newModified).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DcatPackage.CATALOG_RECORD_TYPE__MODIFIED, null, msgs);
			msgs = basicSetModified(newModified, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatPackage.CATALOG_RECORD_TYPE__MODIFIED, newModified, newModified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource getPrimaryTopic() {
		return primaryTopic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimaryTopic(Resource newPrimaryTopic, NotificationChain msgs) {
		Resource oldPrimaryTopic = primaryTopic;
		primaryTopic = newPrimaryTopic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DcatPackage.CATALOG_RECORD_TYPE__PRIMARY_TOPIC, oldPrimaryTopic, newPrimaryTopic);
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
	public void setPrimaryTopic(Resource newPrimaryTopic) {
		if (newPrimaryTopic != primaryTopic) {
			NotificationChain msgs = null;
			if (primaryTopic != null)
				msgs = ((InternalEObject)primaryTopic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DcatPackage.CATALOG_RECORD_TYPE__PRIMARY_TOPIC, null, msgs);
			if (newPrimaryTopic != null)
				msgs = ((InternalEObject)newPrimaryTopic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DcatPackage.CATALOG_RECORD_TYPE__PRIMARY_TOPIC, null, msgs);
			msgs = basicSetPrimaryTopic(newPrimaryTopic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatPackage.CATALOG_RECORD_TYPE__PRIMARY_TOPIC, newPrimaryTopic, newPrimaryTopic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Standard getConformsTo() {
		return conformsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConformsTo(Standard newConformsTo, NotificationChain msgs) {
		Standard oldConformsTo = conformsTo;
		conformsTo = newConformsTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DcatPackage.CATALOG_RECORD_TYPE__CONFORMS_TO, oldConformsTo, newConformsTo);
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
	public void setConformsTo(Standard newConformsTo) {
		if (newConformsTo != conformsTo) {
			NotificationChain msgs = null;
			if (conformsTo != null)
				msgs = ((InternalEObject)conformsTo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DcatPackage.CATALOG_RECORD_TYPE__CONFORMS_TO, null, msgs);
			if (newConformsTo != null)
				msgs = ((InternalEObject)newConformsTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DcatPackage.CATALOG_RECORD_TYPE__CONFORMS_TO, null, msgs);
			msgs = basicSetConformsTo(newConformsTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatPackage.CATALOG_RECORD_TYPE__CONFORMS_TO, newConformsTo, newConformsTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Resource> getLanguage() {
		if (language == null) {
			language = new EObjectContainmentEList<Resource>(Resource.class, this, DcatPackage.CATALOG_RECORD_TYPE__LANGUAGE);
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
			eNotify(new ENotificationImpl(this, Notification.SET, DcatPackage.CATALOG_RECORD_TYPE__ABOUT, oldAbout, about));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DcatPackage.CATALOG_RECORD_TYPE__TITLE:
				return ((InternalEList<?>)getTitle()).basicRemove(otherEnd, msgs);
			case DcatPackage.CATALOG_RECORD_TYPE__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case DcatPackage.CATALOG_RECORD_TYPE__ISSUED:
				return basicSetIssued(null, msgs);
			case DcatPackage.CATALOG_RECORD_TYPE__MODIFIED:
				return basicSetModified(null, msgs);
			case DcatPackage.CATALOG_RECORD_TYPE__PRIMARY_TOPIC:
				return basicSetPrimaryTopic(null, msgs);
			case DcatPackage.CATALOG_RECORD_TYPE__CONFORMS_TO:
				return basicSetConformsTo(null, msgs);
			case DcatPackage.CATALOG_RECORD_TYPE__LANGUAGE:
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
			case DcatPackage.CATALOG_RECORD_TYPE__TITLE:
				return getTitle();
			case DcatPackage.CATALOG_RECORD_TYPE__DESCRIPTION:
				return getDescription();
			case DcatPackage.CATALOG_RECORD_TYPE__ISSUED:
				return getIssued();
			case DcatPackage.CATALOG_RECORD_TYPE__MODIFIED:
				return getModified();
			case DcatPackage.CATALOG_RECORD_TYPE__PRIMARY_TOPIC:
				return getPrimaryTopic();
			case DcatPackage.CATALOG_RECORD_TYPE__CONFORMS_TO:
				return getConformsTo();
			case DcatPackage.CATALOG_RECORD_TYPE__LANGUAGE:
				return getLanguage();
			case DcatPackage.CATALOG_RECORD_TYPE__ABOUT:
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
			case DcatPackage.CATALOG_RECORD_TYPE__TITLE:
				getTitle().clear();
				getTitle().addAll((Collection<? extends PlainLiteral>)newValue);
				return;
			case DcatPackage.CATALOG_RECORD_TYPE__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends PlainLiteral>)newValue);
				return;
			case DcatPackage.CATALOG_RECORD_TYPE__ISSUED:
				setIssued((DateOrDateTimeLiteral)newValue);
				return;
			case DcatPackage.CATALOG_RECORD_TYPE__MODIFIED:
				setModified((DateOrDateTimeLiteral)newValue);
				return;
			case DcatPackage.CATALOG_RECORD_TYPE__PRIMARY_TOPIC:
				setPrimaryTopic((Resource)newValue);
				return;
			case DcatPackage.CATALOG_RECORD_TYPE__CONFORMS_TO:
				setConformsTo((Standard)newValue);
				return;
			case DcatPackage.CATALOG_RECORD_TYPE__LANGUAGE:
				getLanguage().clear();
				getLanguage().addAll((Collection<? extends Resource>)newValue);
				return;
			case DcatPackage.CATALOG_RECORD_TYPE__ABOUT:
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
			case DcatPackage.CATALOG_RECORD_TYPE__TITLE:
				getTitle().clear();
				return;
			case DcatPackage.CATALOG_RECORD_TYPE__DESCRIPTION:
				getDescription().clear();
				return;
			case DcatPackage.CATALOG_RECORD_TYPE__ISSUED:
				setIssued((DateOrDateTimeLiteral)null);
				return;
			case DcatPackage.CATALOG_RECORD_TYPE__MODIFIED:
				setModified((DateOrDateTimeLiteral)null);
				return;
			case DcatPackage.CATALOG_RECORD_TYPE__PRIMARY_TOPIC:
				setPrimaryTopic((Resource)null);
				return;
			case DcatPackage.CATALOG_RECORD_TYPE__CONFORMS_TO:
				setConformsTo((Standard)null);
				return;
			case DcatPackage.CATALOG_RECORD_TYPE__LANGUAGE:
				getLanguage().clear();
				return;
			case DcatPackage.CATALOG_RECORD_TYPE__ABOUT:
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
			case DcatPackage.CATALOG_RECORD_TYPE__TITLE:
				return title != null && !title.isEmpty();
			case DcatPackage.CATALOG_RECORD_TYPE__DESCRIPTION:
				return description != null && !description.isEmpty();
			case DcatPackage.CATALOG_RECORD_TYPE__ISSUED:
				return issued != null;
			case DcatPackage.CATALOG_RECORD_TYPE__MODIFIED:
				return modified != null;
			case DcatPackage.CATALOG_RECORD_TYPE__PRIMARY_TOPIC:
				return primaryTopic != null;
			case DcatPackage.CATALOG_RECORD_TYPE__CONFORMS_TO:
				return conformsTo != null;
			case DcatPackage.CATALOG_RECORD_TYPE__LANGUAGE:
				return language != null && !language.isEmpty();
			case DcatPackage.CATALOG_RECORD_TYPE__ABOUT:
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
		result.append(" (about: ");
		result.append(about);
		result.append(')');
		return result.toString();
	}

} //CatalogRecordTypeImpl
