/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.util.Collection;

import org.eclipse.daanse.xmla.model.ecore.xmla.MdxScript;
import org.eclipse.daanse.xmla.model.ecore.xmla.MdxScriptsType;
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
 * An implementation of the model object '<em><b>Mdx Scripts Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MdxScriptsTypeImpl#getMdxScript <em>Mdx Script</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MdxScriptsTypeImpl extends MinimalEObjectImpl.Container implements MdxScriptsType {
	/**
	 * The cached value of the '{@link #getMdxScript() <em>Mdx Script</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdxScript()
	 * @generated
	 * @ordered
	 */
	protected EList<MdxScript> mdxScript;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MdxScriptsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.MDX_SCRIPTS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MdxScript> getMdxScript() {
		if (mdxScript == null) {
			mdxScript = new EObjectContainmentEList<MdxScript>(MdxScript.class, this, XmlaPackage.MDX_SCRIPTS_TYPE__MDX_SCRIPT);
		}
		return mdxScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.MDX_SCRIPTS_TYPE__MDX_SCRIPT:
				return ((InternalEList<?>)getMdxScript()).basicRemove(otherEnd, msgs);
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
			case XmlaPackage.MDX_SCRIPTS_TYPE__MDX_SCRIPT:
				return getMdxScript();
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
			case XmlaPackage.MDX_SCRIPTS_TYPE__MDX_SCRIPT:
				getMdxScript().clear();
				getMdxScript().addAll((Collection<? extends MdxScript>)newValue);
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
			case XmlaPackage.MDX_SCRIPTS_TYPE__MDX_SCRIPT:
				getMdxScript().clear();
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
			case XmlaPackage.MDX_SCRIPTS_TYPE__MDX_SCRIPT:
				return mdxScript != null && !mdxScript.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MdxScriptsTypeImpl
