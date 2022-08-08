/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.util.Collection;

import org.eclipse.daanse.xmla.model.ecore.xmla.Translation;
import org.eclipse.daanse.xmla.model.ecore.xmla.UnknownMemberTranslationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unknown Member Translations Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.UnknownMemberTranslationsTypeImpl#getUnknownMemberTranslation <em>Unknown Member Translation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnknownMemberTranslationsTypeImpl extends MinimalEObjectImpl.Container implements UnknownMemberTranslationsType {
	/**
	 * The cached value of the '{@link #getUnknownMemberTranslation() <em>Unknown Member Translation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnknownMemberTranslation()
	 * @generated
	 * @ordered
	 */
	protected EList<Translation> unknownMemberTranslation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnknownMemberTranslationsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.UNKNOWN_MEMBER_TRANSLATIONS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Translation> getUnknownMemberTranslation() {
		if (unknownMemberTranslation == null) {
			unknownMemberTranslation = new EObjectContainmentEList<Translation>(Translation.class, this, XmlaPackage.UNKNOWN_MEMBER_TRANSLATIONS_TYPE__UNKNOWN_MEMBER_TRANSLATION);
		}
		return unknownMemberTranslation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.UNKNOWN_MEMBER_TRANSLATIONS_TYPE__UNKNOWN_MEMBER_TRANSLATION:
				return ((InternalEList<?>)getUnknownMemberTranslation()).basicRemove(otherEnd, msgs);
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
			case XmlaPackage.UNKNOWN_MEMBER_TRANSLATIONS_TYPE__UNKNOWN_MEMBER_TRANSLATION:
				return getUnknownMemberTranslation();
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
			case XmlaPackage.UNKNOWN_MEMBER_TRANSLATIONS_TYPE__UNKNOWN_MEMBER_TRANSLATION:
				getUnknownMemberTranslation().clear();
				getUnknownMemberTranslation().addAll((Collection<? extends Translation>)newValue);
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
			case XmlaPackage.UNKNOWN_MEMBER_TRANSLATIONS_TYPE__UNKNOWN_MEMBER_TRANSLATION:
				getUnknownMemberTranslation().clear();
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
			case XmlaPackage.UNKNOWN_MEMBER_TRANSLATIONS_TYPE__UNKNOWN_MEMBER_TRANSLATION:
				return unknownMemberTranslation != null && !unknownMemberTranslation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UnknownMemberTranslationsTypeImpl
