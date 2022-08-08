/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.util.Collection;

import org.eclipse.daanse.xmla.model.ecore.xmla.AttributeRelationship;
import org.eclipse.daanse.xmla.model.ecore.xmla.AttributeRelationshipsType;
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
 * An implementation of the model object '<em><b>Attribute Relationships Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AttributeRelationshipsTypeImpl#getAttributeRelationship <em>Attribute Relationship</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeRelationshipsTypeImpl extends MinimalEObjectImpl.Container implements AttributeRelationshipsType {
	/**
	 * The cached value of the '{@link #getAttributeRelationship() <em>Attribute Relationship</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeRelationship> attributeRelationship;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeRelationshipsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.ATTRIBUTE_RELATIONSHIPS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeRelationship> getAttributeRelationship() {
		if (attributeRelationship == null) {
			attributeRelationship = new EObjectContainmentEList<AttributeRelationship>(AttributeRelationship.class, this, XmlaPackage.ATTRIBUTE_RELATIONSHIPS_TYPE__ATTRIBUTE_RELATIONSHIP);
		}
		return attributeRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.ATTRIBUTE_RELATIONSHIPS_TYPE__ATTRIBUTE_RELATIONSHIP:
				return ((InternalEList<?>)getAttributeRelationship()).basicRemove(otherEnd, msgs);
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
			case XmlaPackage.ATTRIBUTE_RELATIONSHIPS_TYPE__ATTRIBUTE_RELATIONSHIP:
				return getAttributeRelationship();
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
			case XmlaPackage.ATTRIBUTE_RELATIONSHIPS_TYPE__ATTRIBUTE_RELATIONSHIP:
				getAttributeRelationship().clear();
				getAttributeRelationship().addAll((Collection<? extends AttributeRelationship>)newValue);
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
			case XmlaPackage.ATTRIBUTE_RELATIONSHIPS_TYPE__ATTRIBUTE_RELATIONSHIP:
				getAttributeRelationship().clear();
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
			case XmlaPackage.ATTRIBUTE_RELATIONSHIPS_TYPE__ATTRIBUTE_RELATIONSHIP:
				return attributeRelationship != null && !attributeRelationship.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AttributeRelationshipsTypeImpl
