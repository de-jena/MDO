/*
 */
package de.jena.piveau.terms.impl;

import de.jena.piveau.rdf.PlainLiteral;
import de.jena.piveau.rdf.TypedLiteral;

import de.jena.piveau.terms.LocationType;
import de.jena.piveau.terms.TermsPackage;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.piveau.terms.impl.LocationTypeImpl#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link de.jena.piveau.terms.impl.LocationTypeImpl#getPrefLabel <em>Pref Label</em>}</li>
 *   <li>{@link de.jena.piveau.terms.impl.LocationTypeImpl#getAbout <em>About</em>}</li>
 *   <li>{@link de.jena.piveau.terms.impl.LocationTypeImpl#getNodeID <em>Node ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationTypeImpl extends MinimalEObjectImpl.Container implements LocationType {
	/**
	 * The cached value of the '{@link #getGeometry() <em>Geometry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometry()
	 * @generated
	 * @ordered
	 */
	protected EList<TypedLiteral> geometry;

	/**
	 * The cached value of the '{@link #getPrefLabel() <em>Pref Label</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefLabel()
	 * @generated
	 * @ordered
	 */
	protected EList<PlainLiteral> prefLabel;

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
	protected LocationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TermsPackage.Literals.LOCATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypedLiteral> getGeometry() {
		if (geometry == null) {
			geometry = new EObjectContainmentEList<TypedLiteral>(TypedLiteral.class, this, TermsPackage.LOCATION_TYPE__GEOMETRY);
		}
		return geometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlainLiteral> getPrefLabel() {
		if (prefLabel == null) {
			prefLabel = new EObjectContainmentEList<PlainLiteral>(PlainLiteral.class, this, TermsPackage.LOCATION_TYPE__PREF_LABEL);
		}
		return prefLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAbout() {
		return about;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbout(String newAbout) {
		String oldAbout = about;
		about = newAbout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.LOCATION_TYPE__ABOUT, oldAbout, about));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNodeID() {
		return nodeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeID(String newNodeID) {
		String oldNodeID = nodeID;
		nodeID = newNodeID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.LOCATION_TYPE__NODE_ID, oldNodeID, nodeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TermsPackage.LOCATION_TYPE__GEOMETRY:
				return ((InternalEList<?>)getGeometry()).basicRemove(otherEnd, msgs);
			case TermsPackage.LOCATION_TYPE__PREF_LABEL:
				return ((InternalEList<?>)getPrefLabel()).basicRemove(otherEnd, msgs);
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
			case TermsPackage.LOCATION_TYPE__GEOMETRY:
				return getGeometry();
			case TermsPackage.LOCATION_TYPE__PREF_LABEL:
				return getPrefLabel();
			case TermsPackage.LOCATION_TYPE__ABOUT:
				return getAbout();
			case TermsPackage.LOCATION_TYPE__NODE_ID:
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
			case TermsPackage.LOCATION_TYPE__GEOMETRY:
				getGeometry().clear();
				getGeometry().addAll((Collection<? extends TypedLiteral>)newValue);
				return;
			case TermsPackage.LOCATION_TYPE__PREF_LABEL:
				getPrefLabel().clear();
				getPrefLabel().addAll((Collection<? extends PlainLiteral>)newValue);
				return;
			case TermsPackage.LOCATION_TYPE__ABOUT:
				setAbout((String)newValue);
				return;
			case TermsPackage.LOCATION_TYPE__NODE_ID:
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
			case TermsPackage.LOCATION_TYPE__GEOMETRY:
				getGeometry().clear();
				return;
			case TermsPackage.LOCATION_TYPE__PREF_LABEL:
				getPrefLabel().clear();
				return;
			case TermsPackage.LOCATION_TYPE__ABOUT:
				setAbout(ABOUT_EDEFAULT);
				return;
			case TermsPackage.LOCATION_TYPE__NODE_ID:
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
			case TermsPackage.LOCATION_TYPE__GEOMETRY:
				return geometry != null && !geometry.isEmpty();
			case TermsPackage.LOCATION_TYPE__PREF_LABEL:
				return prefLabel != null && !prefLabel.isEmpty();
			case TermsPackage.LOCATION_TYPE__ABOUT:
				return ABOUT_EDEFAULT == null ? about != null : !ABOUT_EDEFAULT.equals(about);
			case TermsPackage.LOCATION_TYPE__NODE_ID:
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

} //LocationTypeImpl
