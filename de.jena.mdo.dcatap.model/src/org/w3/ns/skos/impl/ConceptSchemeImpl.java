/**
 */
package org.w3.ns.skos.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.w3.ns.skos.ConceptScheme;
import org.w3.ns.skos.ConceptSchemeType;
import org.w3.ns.skos.SkosPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept Scheme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3.ns.skos.impl.ConceptSchemeImpl#getConceptScheme <em>Concept Scheme</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConceptSchemeImpl extends MinimalEObjectImpl.Container implements ConceptScheme {
	/**
	 * The cached value of the '{@link #getConceptScheme() <em>Concept Scheme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConceptScheme()
	 * @generated
	 * @ordered
	 */
	protected ConceptSchemeType conceptScheme;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptSchemeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SkosPackage.Literals.CONCEPT_SCHEME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConceptSchemeType getConceptScheme() {
		return conceptScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConceptScheme(ConceptSchemeType newConceptScheme, NotificationChain msgs) {
		ConceptSchemeType oldConceptScheme = conceptScheme;
		conceptScheme = newConceptScheme;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SkosPackage.CONCEPT_SCHEME__CONCEPT_SCHEME, oldConceptScheme, newConceptScheme);
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
	public void setConceptScheme(ConceptSchemeType newConceptScheme) {
		if (newConceptScheme != conceptScheme) {
			NotificationChain msgs = null;
			if (conceptScheme != null)
				msgs = ((InternalEObject)conceptScheme).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SkosPackage.CONCEPT_SCHEME__CONCEPT_SCHEME, null, msgs);
			if (newConceptScheme != null)
				msgs = ((InternalEObject)newConceptScheme).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SkosPackage.CONCEPT_SCHEME__CONCEPT_SCHEME, null, msgs);
			msgs = basicSetConceptScheme(newConceptScheme, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SkosPackage.CONCEPT_SCHEME__CONCEPT_SCHEME, newConceptScheme, newConceptScheme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SkosPackage.CONCEPT_SCHEME__CONCEPT_SCHEME:
				return basicSetConceptScheme(null, msgs);
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
			case SkosPackage.CONCEPT_SCHEME__CONCEPT_SCHEME:
				return getConceptScheme();
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
			case SkosPackage.CONCEPT_SCHEME__CONCEPT_SCHEME:
				setConceptScheme((ConceptSchemeType)newValue);
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
			case SkosPackage.CONCEPT_SCHEME__CONCEPT_SCHEME:
				setConceptScheme((ConceptSchemeType)null);
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
			case SkosPackage.CONCEPT_SCHEME__CONCEPT_SCHEME:
				return conceptScheme != null;
		}
		return super.eIsSet(featureID);
	}

} //ConceptSchemeImpl
