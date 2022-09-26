/**
 */
package org.w3.ns.dcat.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.w3.ns.dcat.DcatPackage;
import org.w3.ns.dcat.RelationshipType;

import org.w3.ns.rdf.PlainLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3.ns.dcat.impl.RelationshipTypeImpl#getHadRole <em>Had Role</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.RelationshipTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.RelationshipTypeImpl#getAbout <em>About</em>}</li>
 *   <li>{@link org.w3.ns.dcat.impl.RelationshipTypeImpl#getNodeID <em>Node ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationshipTypeImpl extends MinimalEObjectImpl.Container implements RelationshipType {
	/**
	 * The cached value of the '{@link #getHadRole() <em>Had Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHadRole()
	 * @generated
	 * @ordered
	 */
	protected EObject hadRole;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected PlainLiteral description;

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
	protected RelationshipTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DcatPackage.Literals.RELATIONSHIP_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getHadRole() {
		return hadRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHadRole(EObject newHadRole, NotificationChain msgs) {
		EObject oldHadRole = hadRole;
		hadRole = newHadRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DcatPackage.RELATIONSHIP_TYPE__HAD_ROLE, oldHadRole, newHadRole);
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
	public void setHadRole(EObject newHadRole) {
		if (newHadRole != hadRole) {
			NotificationChain msgs = null;
			if (hadRole != null)
				msgs = ((InternalEObject)hadRole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DcatPackage.RELATIONSHIP_TYPE__HAD_ROLE, null, msgs);
			if (newHadRole != null)
				msgs = ((InternalEObject)newHadRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DcatPackage.RELATIONSHIP_TYPE__HAD_ROLE, null, msgs);
			msgs = basicSetHadRole(newHadRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatPackage.RELATIONSHIP_TYPE__HAD_ROLE, newHadRole, newHadRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlainLiteral getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(PlainLiteral newDescription, NotificationChain msgs) {
		PlainLiteral oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DcatPackage.RELATIONSHIP_TYPE__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(PlainLiteral newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DcatPackage.RELATIONSHIP_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DcatPackage.RELATIONSHIP_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatPackage.RELATIONSHIP_TYPE__DESCRIPTION, newDescription, newDescription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DcatPackage.RELATIONSHIP_TYPE__ABOUT, oldAbout, about));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DcatPackage.RELATIONSHIP_TYPE__NODE_ID, oldNodeID, nodeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DcatPackage.RELATIONSHIP_TYPE__HAD_ROLE:
				return basicSetHadRole(null, msgs);
			case DcatPackage.RELATIONSHIP_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
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
			case DcatPackage.RELATIONSHIP_TYPE__HAD_ROLE:
				return getHadRole();
			case DcatPackage.RELATIONSHIP_TYPE__DESCRIPTION:
				return getDescription();
			case DcatPackage.RELATIONSHIP_TYPE__ABOUT:
				return getAbout();
			case DcatPackage.RELATIONSHIP_TYPE__NODE_ID:
				return getNodeID();
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
			case DcatPackage.RELATIONSHIP_TYPE__HAD_ROLE:
				setHadRole((EObject)newValue);
				return;
			case DcatPackage.RELATIONSHIP_TYPE__DESCRIPTION:
				setDescription((PlainLiteral)newValue);
				return;
			case DcatPackage.RELATIONSHIP_TYPE__ABOUT:
				setAbout((String)newValue);
				return;
			case DcatPackage.RELATIONSHIP_TYPE__NODE_ID:
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
			case DcatPackage.RELATIONSHIP_TYPE__HAD_ROLE:
				setHadRole((EObject)null);
				return;
			case DcatPackage.RELATIONSHIP_TYPE__DESCRIPTION:
				setDescription((PlainLiteral)null);
				return;
			case DcatPackage.RELATIONSHIP_TYPE__ABOUT:
				setAbout(ABOUT_EDEFAULT);
				return;
			case DcatPackage.RELATIONSHIP_TYPE__NODE_ID:
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
			case DcatPackage.RELATIONSHIP_TYPE__HAD_ROLE:
				return hadRole != null;
			case DcatPackage.RELATIONSHIP_TYPE__DESCRIPTION:
				return description != null;
			case DcatPackage.RELATIONSHIP_TYPE__ABOUT:
				return ABOUT_EDEFAULT == null ? about != null : !ABOUT_EDEFAULT.equals(about);
			case DcatPackage.RELATIONSHIP_TYPE__NODE_ID:
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

} //RelationshipTypeImpl
