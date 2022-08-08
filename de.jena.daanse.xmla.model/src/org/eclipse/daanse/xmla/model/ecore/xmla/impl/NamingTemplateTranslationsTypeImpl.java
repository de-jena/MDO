/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.util.Collection;

import org.eclipse.daanse.xmla.model.ecore.xmla.NamingTemplateTranslationsType;
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
 * An implementation of the model object '<em><b>Naming Template Translations Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.NamingTemplateTranslationsTypeImpl#getNamingTemplateTranslation <em>Naming Template Translation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamingTemplateTranslationsTypeImpl extends MinimalEObjectImpl.Container implements NamingTemplateTranslationsType {
	/**
	 * The cached value of the '{@link #getNamingTemplateTranslation() <em>Naming Template Translation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamingTemplateTranslation()
	 * @generated
	 * @ordered
	 */
	protected EList<Translation> namingTemplateTranslation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamingTemplateTranslationsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.NAMING_TEMPLATE_TRANSLATIONS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Translation> getNamingTemplateTranslation() {
		if (namingTemplateTranslation == null) {
			namingTemplateTranslation = new EObjectContainmentEList<Translation>(Translation.class, this, XmlaPackage.NAMING_TEMPLATE_TRANSLATIONS_TYPE__NAMING_TEMPLATE_TRANSLATION);
		}
		return namingTemplateTranslation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.NAMING_TEMPLATE_TRANSLATIONS_TYPE__NAMING_TEMPLATE_TRANSLATION:
				return ((InternalEList<?>)getNamingTemplateTranslation()).basicRemove(otherEnd, msgs);
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
			case XmlaPackage.NAMING_TEMPLATE_TRANSLATIONS_TYPE__NAMING_TEMPLATE_TRANSLATION:
				return getNamingTemplateTranslation();
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
			case XmlaPackage.NAMING_TEMPLATE_TRANSLATIONS_TYPE__NAMING_TEMPLATE_TRANSLATION:
				getNamingTemplateTranslation().clear();
				getNamingTemplateTranslation().addAll((Collection<? extends Translation>)newValue);
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
			case XmlaPackage.NAMING_TEMPLATE_TRANSLATIONS_TYPE__NAMING_TEMPLATE_TRANSLATION:
				getNamingTemplateTranslation().clear();
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
			case XmlaPackage.NAMING_TEMPLATE_TRANSLATIONS_TYPE__NAMING_TEMPLATE_TRANSLATION:
				return namingTemplateTranslation != null && !namingTemplateTranslation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NamingTemplateTranslationsTypeImpl
