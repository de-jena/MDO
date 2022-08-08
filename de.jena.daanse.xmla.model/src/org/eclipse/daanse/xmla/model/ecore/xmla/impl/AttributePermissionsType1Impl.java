/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.util.Collection;

import org.eclipse.daanse.xmla.model.ecore.xmla.AttributePermission;
import org.eclipse.daanse.xmla.model.ecore.xmla.AttributePermissionsType1;
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
 * An implementation of the model object '<em><b>Attribute Permissions Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AttributePermissionsType1Impl#getAttributePermission <em>Attribute Permission</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributePermissionsType1Impl extends MinimalEObjectImpl.Container implements AttributePermissionsType1 {
	/**
	 * The cached value of the '{@link #getAttributePermission() <em>Attribute Permission</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributePermission()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributePermission> attributePermission;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributePermissionsType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.ATTRIBUTE_PERMISSIONS_TYPE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributePermission> getAttributePermission() {
		if (attributePermission == null) {
			attributePermission = new EObjectContainmentEList<AttributePermission>(AttributePermission.class, this, XmlaPackage.ATTRIBUTE_PERMISSIONS_TYPE1__ATTRIBUTE_PERMISSION);
		}
		return attributePermission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.ATTRIBUTE_PERMISSIONS_TYPE1__ATTRIBUTE_PERMISSION:
				return ((InternalEList<?>)getAttributePermission()).basicRemove(otherEnd, msgs);
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
			case XmlaPackage.ATTRIBUTE_PERMISSIONS_TYPE1__ATTRIBUTE_PERMISSION:
				return getAttributePermission();
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
			case XmlaPackage.ATTRIBUTE_PERMISSIONS_TYPE1__ATTRIBUTE_PERMISSION:
				getAttributePermission().clear();
				getAttributePermission().addAll((Collection<? extends AttributePermission>)newValue);
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
			case XmlaPackage.ATTRIBUTE_PERMISSIONS_TYPE1__ATTRIBUTE_PERMISSION:
				getAttributePermission().clear();
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
			case XmlaPackage.ATTRIBUTE_PERMISSIONS_TYPE1__ATTRIBUTE_PERMISSION:
				return attributePermission != null && !attributePermission.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AttributePermissionsType1Impl
