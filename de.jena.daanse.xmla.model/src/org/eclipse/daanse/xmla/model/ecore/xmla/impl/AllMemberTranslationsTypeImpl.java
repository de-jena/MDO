/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.util.Collection;

import org.eclipse.daanse.xmla.model.ecore.xmla.AllMemberTranslationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Translation;
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
 * An implementation of the model object '<em><b>All Member Translations Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AllMemberTranslationsTypeImpl#getAllMemberTranslation <em>All Member Translation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllMemberTranslationsTypeImpl extends MinimalEObjectImpl.Container implements AllMemberTranslationsType {
	/**
	 * The cached value of the '{@link #getAllMemberTranslation() <em>All Member Translation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllMemberTranslation()
	 * @generated
	 * @ordered
	 */
	protected EList<Translation> allMemberTranslation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllMemberTranslationsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.ALL_MEMBER_TRANSLATIONS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Translation> getAllMemberTranslation() {
		if (allMemberTranslation == null) {
			allMemberTranslation = new EObjectContainmentEList<Translation>(Translation.class, this, XmlaPackage.ALL_MEMBER_TRANSLATIONS_TYPE__ALL_MEMBER_TRANSLATION);
		}
		return allMemberTranslation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.ALL_MEMBER_TRANSLATIONS_TYPE__ALL_MEMBER_TRANSLATION:
				return ((InternalEList<?>)getAllMemberTranslation()).basicRemove(otherEnd, msgs);
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
			case XmlaPackage.ALL_MEMBER_TRANSLATIONS_TYPE__ALL_MEMBER_TRANSLATION:
				return getAllMemberTranslation();
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
			case XmlaPackage.ALL_MEMBER_TRANSLATIONS_TYPE__ALL_MEMBER_TRANSLATION:
				getAllMemberTranslation().clear();
				getAllMemberTranslation().addAll((Collection<? extends Translation>)newValue);
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
			case XmlaPackage.ALL_MEMBER_TRANSLATIONS_TYPE__ALL_MEMBER_TRANSLATION:
				getAllMemberTranslation().clear();
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
			case XmlaPackage.ALL_MEMBER_TRANSLATIONS_TYPE__ALL_MEMBER_TRANSLATION:
				return allMemberTranslation != null && !allMemberTranslation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AllMemberTranslationsTypeImpl
