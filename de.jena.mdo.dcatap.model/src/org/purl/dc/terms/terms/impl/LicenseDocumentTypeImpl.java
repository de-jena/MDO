/**
 */
package org.purl.dc.terms.terms.impl;

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

import org.purl.dc.terms.terms.LicenseDocumentType;
import org.purl.dc.terms.terms.TermsPackage;

import org.w3.ns.rdf.PlainLiteral;

import org.w3.ns.skos.Concept;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>License Document Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.purl.dc.terms.terms.impl.LicenseDocumentTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.impl.LicenseDocumentTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.impl.LicenseDocumentTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.impl.LicenseDocumentTypeImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.impl.LicenseDocumentTypeImpl#getAbout <em>About</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.impl.LicenseDocumentTypeImpl#getNodeID <em>Node ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LicenseDocumentTypeImpl extends MinimalEObjectImpl.Container implements LicenseDocumentType {
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
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<PlainLiteral> identifier;

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
	protected LicenseDocumentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TermsPackage.Literals.LICENSE_DOCUMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Concept> getType() {
		if (type == null) {
			type = new EObjectContainmentEList<Concept>(Concept.class, this, TermsPackage.LICENSE_DOCUMENT_TYPE__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlainLiteral> getTitle() {
		if (title == null) {
			title = new EObjectContainmentEList<PlainLiteral>(PlainLiteral.class, this, TermsPackage.LICENSE_DOCUMENT_TYPE__TITLE);
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
			description = new EObjectContainmentEList<PlainLiteral>(PlainLiteral.class, this, TermsPackage.LICENSE_DOCUMENT_TYPE__DESCRIPTION);
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlainLiteral> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<PlainLiteral>(PlainLiteral.class, this, TermsPackage.LICENSE_DOCUMENT_TYPE__IDENTIFIER);
		}
		return identifier;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.LICENSE_DOCUMENT_TYPE__ABOUT, oldAbout, about));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.LICENSE_DOCUMENT_TYPE__NODE_ID, oldNodeID, nodeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TermsPackage.LICENSE_DOCUMENT_TYPE__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case TermsPackage.LICENSE_DOCUMENT_TYPE__TITLE:
				return ((InternalEList<?>)getTitle()).basicRemove(otherEnd, msgs);
			case TermsPackage.LICENSE_DOCUMENT_TYPE__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case TermsPackage.LICENSE_DOCUMENT_TYPE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
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
			case TermsPackage.LICENSE_DOCUMENT_TYPE__TYPE:
				return getType();
			case TermsPackage.LICENSE_DOCUMENT_TYPE__TITLE:
				return getTitle();
			case TermsPackage.LICENSE_DOCUMENT_TYPE__DESCRIPTION:
				return getDescription();
			case TermsPackage.LICENSE_DOCUMENT_TYPE__IDENTIFIER:
				return getIdentifier();
			case TermsPackage.LICENSE_DOCUMENT_TYPE__ABOUT:
				return getAbout();
			case TermsPackage.LICENSE_DOCUMENT_TYPE__NODE_ID:
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
			case TermsPackage.LICENSE_DOCUMENT_TYPE__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends Concept>)newValue);
				return;
			case TermsPackage.LICENSE_DOCUMENT_TYPE__TITLE:
				getTitle().clear();
				getTitle().addAll((Collection<? extends PlainLiteral>)newValue);
				return;
			case TermsPackage.LICENSE_DOCUMENT_TYPE__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends PlainLiteral>)newValue);
				return;
			case TermsPackage.LICENSE_DOCUMENT_TYPE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends PlainLiteral>)newValue);
				return;
			case TermsPackage.LICENSE_DOCUMENT_TYPE__ABOUT:
				setAbout((String)newValue);
				return;
			case TermsPackage.LICENSE_DOCUMENT_TYPE__NODE_ID:
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
			case TermsPackage.LICENSE_DOCUMENT_TYPE__TYPE:
				getType().clear();
				return;
			case TermsPackage.LICENSE_DOCUMENT_TYPE__TITLE:
				getTitle().clear();
				return;
			case TermsPackage.LICENSE_DOCUMENT_TYPE__DESCRIPTION:
				getDescription().clear();
				return;
			case TermsPackage.LICENSE_DOCUMENT_TYPE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case TermsPackage.LICENSE_DOCUMENT_TYPE__ABOUT:
				setAbout(ABOUT_EDEFAULT);
				return;
			case TermsPackage.LICENSE_DOCUMENT_TYPE__NODE_ID:
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
			case TermsPackage.LICENSE_DOCUMENT_TYPE__TYPE:
				return type != null && !type.isEmpty();
			case TermsPackage.LICENSE_DOCUMENT_TYPE__TITLE:
				return title != null && !title.isEmpty();
			case TermsPackage.LICENSE_DOCUMENT_TYPE__DESCRIPTION:
				return description != null && !description.isEmpty();
			case TermsPackage.LICENSE_DOCUMENT_TYPE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case TermsPackage.LICENSE_DOCUMENT_TYPE__ABOUT:
				return ABOUT_EDEFAULT == null ? about != null : !ABOUT_EDEFAULT.equals(about);
			case TermsPackage.LICENSE_DOCUMENT_TYPE__NODE_ID:
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
		result.append(" (about: ");
		result.append(about);
		result.append(", nodeID: ");
		result.append(nodeID);
		result.append(')');
		return result.toString();
	}

} //LicenseDocumentTypeImpl
