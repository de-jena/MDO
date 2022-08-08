/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.util.Collection;

import org.eclipse.daanse.xmla.model.ecore.xmla.AndOrType;
import org.eclipse.daanse.xmla.model.ecore.xmla.BoolBinop;
import org.eclipse.daanse.xmla.model.ecore.xmla.NotType;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>And Or Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AndOrTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AndOrTypeImpl#getNot <em>Not</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AndOrTypeImpl#getOr <em>Or</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AndOrTypeImpl#getAnd <em>And</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AndOrTypeImpl#getEqual <em>Equal</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AndOrTypeImpl#getNotEqual <em>Not Equal</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AndOrTypeImpl#getLess <em>Less</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AndOrTypeImpl#getLessOrEqual <em>Less Or Equal</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AndOrTypeImpl#getGreater <em>Greater</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AndOrTypeImpl#getGreaterOrEqual <em>Greater Or Equal</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AndOrTypeImpl#getLike <em>Like</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AndOrTypeImpl#getNotLike <em>Not Like</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AndOrTypeImpl extends MinimalEObjectImpl.Container implements AndOrType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AndOrTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.AND_OR_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, XmlaPackage.AND_OR_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NotType> getNot() {
		return getGroup().list(XmlaPackage.Literals.AND_OR_TYPE__NOT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AndOrType> getOr() {
		return getGroup().list(XmlaPackage.Literals.AND_OR_TYPE__OR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AndOrType> getAnd() {
		return getGroup().list(XmlaPackage.Literals.AND_OR_TYPE__AND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BoolBinop> getEqual() {
		return getGroup().list(XmlaPackage.Literals.AND_OR_TYPE__EQUAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BoolBinop> getNotEqual() {
		return getGroup().list(XmlaPackage.Literals.AND_OR_TYPE__NOT_EQUAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BoolBinop> getLess() {
		return getGroup().list(XmlaPackage.Literals.AND_OR_TYPE__LESS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BoolBinop> getLessOrEqual() {
		return getGroup().list(XmlaPackage.Literals.AND_OR_TYPE__LESS_OR_EQUAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BoolBinop> getGreater() {
		return getGroup().list(XmlaPackage.Literals.AND_OR_TYPE__GREATER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BoolBinop> getGreaterOrEqual() {
		return getGroup().list(XmlaPackage.Literals.AND_OR_TYPE__GREATER_OR_EQUAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BoolBinop> getLike() {
		return getGroup().list(XmlaPackage.Literals.AND_OR_TYPE__LIKE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BoolBinop> getNotLike() {
		return getGroup().list(XmlaPackage.Literals.AND_OR_TYPE__NOT_LIKE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.AND_OR_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case XmlaPackage.AND_OR_TYPE__NOT:
				return ((InternalEList<?>)getNot()).basicRemove(otherEnd, msgs);
			case XmlaPackage.AND_OR_TYPE__OR:
				return ((InternalEList<?>)getOr()).basicRemove(otherEnd, msgs);
			case XmlaPackage.AND_OR_TYPE__AND:
				return ((InternalEList<?>)getAnd()).basicRemove(otherEnd, msgs);
			case XmlaPackage.AND_OR_TYPE__EQUAL:
				return ((InternalEList<?>)getEqual()).basicRemove(otherEnd, msgs);
			case XmlaPackage.AND_OR_TYPE__NOT_EQUAL:
				return ((InternalEList<?>)getNotEqual()).basicRemove(otherEnd, msgs);
			case XmlaPackage.AND_OR_TYPE__LESS:
				return ((InternalEList<?>)getLess()).basicRemove(otherEnd, msgs);
			case XmlaPackage.AND_OR_TYPE__LESS_OR_EQUAL:
				return ((InternalEList<?>)getLessOrEqual()).basicRemove(otherEnd, msgs);
			case XmlaPackage.AND_OR_TYPE__GREATER:
				return ((InternalEList<?>)getGreater()).basicRemove(otherEnd, msgs);
			case XmlaPackage.AND_OR_TYPE__GREATER_OR_EQUAL:
				return ((InternalEList<?>)getGreaterOrEqual()).basicRemove(otherEnd, msgs);
			case XmlaPackage.AND_OR_TYPE__LIKE:
				return ((InternalEList<?>)getLike()).basicRemove(otherEnd, msgs);
			case XmlaPackage.AND_OR_TYPE__NOT_LIKE:
				return ((InternalEList<?>)getNotLike()).basicRemove(otherEnd, msgs);
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
			case XmlaPackage.AND_OR_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case XmlaPackage.AND_OR_TYPE__NOT:
				return getNot();
			case XmlaPackage.AND_OR_TYPE__OR:
				return getOr();
			case XmlaPackage.AND_OR_TYPE__AND:
				return getAnd();
			case XmlaPackage.AND_OR_TYPE__EQUAL:
				return getEqual();
			case XmlaPackage.AND_OR_TYPE__NOT_EQUAL:
				return getNotEqual();
			case XmlaPackage.AND_OR_TYPE__LESS:
				return getLess();
			case XmlaPackage.AND_OR_TYPE__LESS_OR_EQUAL:
				return getLessOrEqual();
			case XmlaPackage.AND_OR_TYPE__GREATER:
				return getGreater();
			case XmlaPackage.AND_OR_TYPE__GREATER_OR_EQUAL:
				return getGreaterOrEqual();
			case XmlaPackage.AND_OR_TYPE__LIKE:
				return getLike();
			case XmlaPackage.AND_OR_TYPE__NOT_LIKE:
				return getNotLike();
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
			case XmlaPackage.AND_OR_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case XmlaPackage.AND_OR_TYPE__NOT:
				getNot().clear();
				getNot().addAll((Collection<? extends NotType>)newValue);
				return;
			case XmlaPackage.AND_OR_TYPE__OR:
				getOr().clear();
				getOr().addAll((Collection<? extends AndOrType>)newValue);
				return;
			case XmlaPackage.AND_OR_TYPE__AND:
				getAnd().clear();
				getAnd().addAll((Collection<? extends AndOrType>)newValue);
				return;
			case XmlaPackage.AND_OR_TYPE__EQUAL:
				getEqual().clear();
				getEqual().addAll((Collection<? extends BoolBinop>)newValue);
				return;
			case XmlaPackage.AND_OR_TYPE__NOT_EQUAL:
				getNotEqual().clear();
				getNotEqual().addAll((Collection<? extends BoolBinop>)newValue);
				return;
			case XmlaPackage.AND_OR_TYPE__LESS:
				getLess().clear();
				getLess().addAll((Collection<? extends BoolBinop>)newValue);
				return;
			case XmlaPackage.AND_OR_TYPE__LESS_OR_EQUAL:
				getLessOrEqual().clear();
				getLessOrEqual().addAll((Collection<? extends BoolBinop>)newValue);
				return;
			case XmlaPackage.AND_OR_TYPE__GREATER:
				getGreater().clear();
				getGreater().addAll((Collection<? extends BoolBinop>)newValue);
				return;
			case XmlaPackage.AND_OR_TYPE__GREATER_OR_EQUAL:
				getGreaterOrEqual().clear();
				getGreaterOrEqual().addAll((Collection<? extends BoolBinop>)newValue);
				return;
			case XmlaPackage.AND_OR_TYPE__LIKE:
				getLike().clear();
				getLike().addAll((Collection<? extends BoolBinop>)newValue);
				return;
			case XmlaPackage.AND_OR_TYPE__NOT_LIKE:
				getNotLike().clear();
				getNotLike().addAll((Collection<? extends BoolBinop>)newValue);
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
			case XmlaPackage.AND_OR_TYPE__GROUP:
				getGroup().clear();
				return;
			case XmlaPackage.AND_OR_TYPE__NOT:
				getNot().clear();
				return;
			case XmlaPackage.AND_OR_TYPE__OR:
				getOr().clear();
				return;
			case XmlaPackage.AND_OR_TYPE__AND:
				getAnd().clear();
				return;
			case XmlaPackage.AND_OR_TYPE__EQUAL:
				getEqual().clear();
				return;
			case XmlaPackage.AND_OR_TYPE__NOT_EQUAL:
				getNotEqual().clear();
				return;
			case XmlaPackage.AND_OR_TYPE__LESS:
				getLess().clear();
				return;
			case XmlaPackage.AND_OR_TYPE__LESS_OR_EQUAL:
				getLessOrEqual().clear();
				return;
			case XmlaPackage.AND_OR_TYPE__GREATER:
				getGreater().clear();
				return;
			case XmlaPackage.AND_OR_TYPE__GREATER_OR_EQUAL:
				getGreaterOrEqual().clear();
				return;
			case XmlaPackage.AND_OR_TYPE__LIKE:
				getLike().clear();
				return;
			case XmlaPackage.AND_OR_TYPE__NOT_LIKE:
				getNotLike().clear();
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
			case XmlaPackage.AND_OR_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case XmlaPackage.AND_OR_TYPE__NOT:
				return !getNot().isEmpty();
			case XmlaPackage.AND_OR_TYPE__OR:
				return !getOr().isEmpty();
			case XmlaPackage.AND_OR_TYPE__AND:
				return !getAnd().isEmpty();
			case XmlaPackage.AND_OR_TYPE__EQUAL:
				return !getEqual().isEmpty();
			case XmlaPackage.AND_OR_TYPE__NOT_EQUAL:
				return !getNotEqual().isEmpty();
			case XmlaPackage.AND_OR_TYPE__LESS:
				return !getLess().isEmpty();
			case XmlaPackage.AND_OR_TYPE__LESS_OR_EQUAL:
				return !getLessOrEqual().isEmpty();
			case XmlaPackage.AND_OR_TYPE__GREATER:
				return !getGreater().isEmpty();
			case XmlaPackage.AND_OR_TYPE__GREATER_OR_EQUAL:
				return !getGreaterOrEqual().isEmpty();
			case XmlaPackage.AND_OR_TYPE__LIKE:
				return !getLike().isEmpty();
			case XmlaPackage.AND_OR_TYPE__NOT_LIKE:
				return !getNotLike().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //AndOrTypeImpl
