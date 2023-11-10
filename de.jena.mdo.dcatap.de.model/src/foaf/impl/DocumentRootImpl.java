/*
 */
package foaf.impl;

import foaf.DocumentRoot;
import foaf.FoafPackage;
import foaf.Organization;
import foaf.Person;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import rdf.PlainLiteral;
import rdf.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link foaf.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link foaf.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link foaf.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link foaf.impl.DocumentRootImpl#getHomepage <em>Homepage</em>}</li>
 *   <li>{@link foaf.impl.DocumentRootImpl#getMbox <em>Mbox</em>}</li>
 *   <li>{@link foaf.impl.DocumentRootImpl#getName <em>Name</em>}</li>
 *   <li>{@link foaf.impl.DocumentRootImpl#getPage <em>Page</em>}</li>
 *   <li>{@link foaf.impl.DocumentRootImpl#getPhone <em>Phone</em>}</li>
 *   <li>{@link foaf.impl.DocumentRootImpl#getPrimaryTopic <em>Primary Topic</em>}</li>
 *   <li>{@link foaf.impl.DocumentRootImpl#getOrganisation <em>Organisation</em>}</li>
 *   <li>{@link foaf.impl.DocumentRootImpl#getPerson <em>Person</em>}</li>
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
	 * The cached value of the '{@link #getOrganisation() <em>Organisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganisation()
	 * @generated
	 * @ordered
	 */
	protected Organization organisation;

	/**
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected Person person;

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
		return FoafPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, FoafPackage.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, FoafPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, FoafPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getHomepage() {
		return (Resource)getMixed().get(FoafPackage.Literals.DOCUMENT_ROOT__HOMEPAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHomepage(Resource newHomepage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FoafPackage.Literals.DOCUMENT_ROOT__HOMEPAGE, newHomepage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHomepage(Resource newHomepage) {
		((FeatureMap.Internal)getMixed()).set(FoafPackage.Literals.DOCUMENT_ROOT__HOMEPAGE, newHomepage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getMbox() {
		return (Resource)getMixed().get(FoafPackage.Literals.DOCUMENT_ROOT__MBOX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMbox(Resource newMbox, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FoafPackage.Literals.DOCUMENT_ROOT__MBOX, newMbox, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMbox(Resource newMbox) {
		((FeatureMap.Internal)getMixed()).set(FoafPackage.Literals.DOCUMENT_ROOT__MBOX, newMbox);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainLiteral getName() {
		return (PlainLiteral)getMixed().get(FoafPackage.Literals.DOCUMENT_ROOT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(PlainLiteral newName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FoafPackage.Literals.DOCUMENT_ROOT__NAME, newName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(PlainLiteral newName) {
		((FeatureMap.Internal)getMixed()).set(FoafPackage.Literals.DOCUMENT_ROOT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getPage() {
		return (Resource)getMixed().get(FoafPackage.Literals.DOCUMENT_ROOT__PAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPage(Resource newPage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FoafPackage.Literals.DOCUMENT_ROOT__PAGE, newPage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPage(Resource newPage) {
		((FeatureMap.Internal)getMixed()).set(FoafPackage.Literals.DOCUMENT_ROOT__PAGE, newPage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getPhone() {
		return (Resource)getMixed().get(FoafPackage.Literals.DOCUMENT_ROOT__PHONE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhone(Resource newPhone, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FoafPackage.Literals.DOCUMENT_ROOT__PHONE, newPhone, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhone(Resource newPhone) {
		((FeatureMap.Internal)getMixed()).set(FoafPackage.Literals.DOCUMENT_ROOT__PHONE, newPhone);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getPrimaryTopic() {
		return (Resource)getMixed().get(FoafPackage.Literals.DOCUMENT_ROOT__PRIMARY_TOPIC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimaryTopic(Resource newPrimaryTopic, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FoafPackage.Literals.DOCUMENT_ROOT__PRIMARY_TOPIC, newPrimaryTopic, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryTopic(Resource newPrimaryTopic) {
		((FeatureMap.Internal)getMixed()).set(FoafPackage.Literals.DOCUMENT_ROOT__PRIMARY_TOPIC, newPrimaryTopic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getOrganisation() {
		return organisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganisation(Organization newOrganisation, NotificationChain msgs) {
		Organization oldOrganisation = organisation;
		organisation = newOrganisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FoafPackage.DOCUMENT_ROOT__ORGANISATION, oldOrganisation, newOrganisation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganisation(Organization newOrganisation) {
		if (newOrganisation != organisation) {
			NotificationChain msgs = null;
			if (organisation != null)
				msgs = ((InternalEObject)organisation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FoafPackage.DOCUMENT_ROOT__ORGANISATION, null, msgs);
			if (newOrganisation != null)
				msgs = ((InternalEObject)newOrganisation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FoafPackage.DOCUMENT_ROOT__ORGANISATION, null, msgs);
			msgs = basicSetOrganisation(newOrganisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoafPackage.DOCUMENT_ROOT__ORGANISATION, newOrganisation, newOrganisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getPerson() {
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerson(Person newPerson, NotificationChain msgs) {
		Person oldPerson = person;
		person = newPerson;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FoafPackage.DOCUMENT_ROOT__PERSON, oldPerson, newPerson);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerson(Person newPerson) {
		if (newPerson != person) {
			NotificationChain msgs = null;
			if (person != null)
				msgs = ((InternalEObject)person).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FoafPackage.DOCUMENT_ROOT__PERSON, null, msgs);
			if (newPerson != null)
				msgs = ((InternalEObject)newPerson).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FoafPackage.DOCUMENT_ROOT__PERSON, null, msgs);
			msgs = basicSetPerson(newPerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoafPackage.DOCUMENT_ROOT__PERSON, newPerson, newPerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FoafPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case FoafPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case FoafPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case FoafPackage.DOCUMENT_ROOT__HOMEPAGE:
				return basicSetHomepage(null, msgs);
			case FoafPackage.DOCUMENT_ROOT__MBOX:
				return basicSetMbox(null, msgs);
			case FoafPackage.DOCUMENT_ROOT__NAME:
				return basicSetName(null, msgs);
			case FoafPackage.DOCUMENT_ROOT__PAGE:
				return basicSetPage(null, msgs);
			case FoafPackage.DOCUMENT_ROOT__PHONE:
				return basicSetPhone(null, msgs);
			case FoafPackage.DOCUMENT_ROOT__PRIMARY_TOPIC:
				return basicSetPrimaryTopic(null, msgs);
			case FoafPackage.DOCUMENT_ROOT__ORGANISATION:
				return basicSetOrganisation(null, msgs);
			case FoafPackage.DOCUMENT_ROOT__PERSON:
				return basicSetPerson(null, msgs);
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
			case FoafPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case FoafPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case FoafPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case FoafPackage.DOCUMENT_ROOT__HOMEPAGE:
				return getHomepage();
			case FoafPackage.DOCUMENT_ROOT__MBOX:
				return getMbox();
			case FoafPackage.DOCUMENT_ROOT__NAME:
				return getName();
			case FoafPackage.DOCUMENT_ROOT__PAGE:
				return getPage();
			case FoafPackage.DOCUMENT_ROOT__PHONE:
				return getPhone();
			case FoafPackage.DOCUMENT_ROOT__PRIMARY_TOPIC:
				return getPrimaryTopic();
			case FoafPackage.DOCUMENT_ROOT__ORGANISATION:
				return getOrganisation();
			case FoafPackage.DOCUMENT_ROOT__PERSON:
				return getPerson();
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
			case FoafPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case FoafPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case FoafPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case FoafPackage.DOCUMENT_ROOT__HOMEPAGE:
				setHomepage((Resource)newValue);
				return;
			case FoafPackage.DOCUMENT_ROOT__MBOX:
				setMbox((Resource)newValue);
				return;
			case FoafPackage.DOCUMENT_ROOT__NAME:
				setName((PlainLiteral)newValue);
				return;
			case FoafPackage.DOCUMENT_ROOT__PAGE:
				setPage((Resource)newValue);
				return;
			case FoafPackage.DOCUMENT_ROOT__PHONE:
				setPhone((Resource)newValue);
				return;
			case FoafPackage.DOCUMENT_ROOT__PRIMARY_TOPIC:
				setPrimaryTopic((Resource)newValue);
				return;
			case FoafPackage.DOCUMENT_ROOT__ORGANISATION:
				setOrganisation((Organization)newValue);
				return;
			case FoafPackage.DOCUMENT_ROOT__PERSON:
				setPerson((Person)newValue);
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
			case FoafPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case FoafPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case FoafPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case FoafPackage.DOCUMENT_ROOT__HOMEPAGE:
				setHomepage((Resource)null);
				return;
			case FoafPackage.DOCUMENT_ROOT__MBOX:
				setMbox((Resource)null);
				return;
			case FoafPackage.DOCUMENT_ROOT__NAME:
				setName((PlainLiteral)null);
				return;
			case FoafPackage.DOCUMENT_ROOT__PAGE:
				setPage((Resource)null);
				return;
			case FoafPackage.DOCUMENT_ROOT__PHONE:
				setPhone((Resource)null);
				return;
			case FoafPackage.DOCUMENT_ROOT__PRIMARY_TOPIC:
				setPrimaryTopic((Resource)null);
				return;
			case FoafPackage.DOCUMENT_ROOT__ORGANISATION:
				setOrganisation((Organization)null);
				return;
			case FoafPackage.DOCUMENT_ROOT__PERSON:
				setPerson((Person)null);
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
			case FoafPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case FoafPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case FoafPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case FoafPackage.DOCUMENT_ROOT__HOMEPAGE:
				return getHomepage() != null;
			case FoafPackage.DOCUMENT_ROOT__MBOX:
				return getMbox() != null;
			case FoafPackage.DOCUMENT_ROOT__NAME:
				return getName() != null;
			case FoafPackage.DOCUMENT_ROOT__PAGE:
				return getPage() != null;
			case FoafPackage.DOCUMENT_ROOT__PHONE:
				return getPhone() != null;
			case FoafPackage.DOCUMENT_ROOT__PRIMARY_TOPIC:
				return getPrimaryTopic() != null;
			case FoafPackage.DOCUMENT_ROOT__ORGANISATION:
				return organisation != null;
			case FoafPackage.DOCUMENT_ROOT__PERSON:
				return person != null;
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
