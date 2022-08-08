/**
 */
package org.eclipse.daanse.xmla.model.ecore.msxmla.impl;

import java.util.Collection;

import org.eclipse.daanse.xmla.model.ecore.msxmla.MemberRefType;
import org.eclipse.daanse.xmla.model.ecore.msxmla.MsxmlaPackage;
import org.eclipse.daanse.xmla.model.ecore.msxmla.NormTupleType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Norm Tuple Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.msxmla.impl.NormTupleTypeImpl#getMemberRef <em>Member Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NormTupleTypeImpl extends MinimalEObjectImpl.Container implements NormTupleType {
	/**
	 * The cached value of the '{@link #getMemberRef() <em>Member Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberRef()
	 * @generated
	 * @ordered
	 */
	protected EList<MemberRefType> memberRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormTupleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MsxmlaPackage.Literals.NORM_TUPLE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MemberRefType> getMemberRef() {
		if (memberRef == null) {
			memberRef = new EObjectContainmentEList<MemberRefType>(MemberRefType.class, this, MsxmlaPackage.NORM_TUPLE_TYPE__MEMBER_REF);
		}
		return memberRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MsxmlaPackage.NORM_TUPLE_TYPE__MEMBER_REF:
				return ((InternalEList<?>)getMemberRef()).basicRemove(otherEnd, msgs);
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
			case MsxmlaPackage.NORM_TUPLE_TYPE__MEMBER_REF:
				return getMemberRef();
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
			case MsxmlaPackage.NORM_TUPLE_TYPE__MEMBER_REF:
				getMemberRef().clear();
				getMemberRef().addAll((Collection<? extends MemberRefType>)newValue);
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
			case MsxmlaPackage.NORM_TUPLE_TYPE__MEMBER_REF:
				getMemberRef().clear();
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
			case MsxmlaPackage.NORM_TUPLE_TYPE__MEMBER_REF:
				return memberRef != null && !memberRef.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NormTupleTypeImpl
