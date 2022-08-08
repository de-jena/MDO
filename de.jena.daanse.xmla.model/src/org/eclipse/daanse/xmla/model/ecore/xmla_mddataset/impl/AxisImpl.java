/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl;

import java.util.Collection;

import org.eclipse.daanse.xmla.model.ecore.msxmla.NormTupleSetType;

import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Axis;
import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.MembersType;
import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.SetListType;
import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.TuplesType;
import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Xmla_mddatasetPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Axis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.AxisImpl#getSetType <em>Set Type</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.AxisImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.AxisImpl#getTuples <em>Tuples</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.AxisImpl#getCrossProduct <em>Cross Product</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.AxisImpl#getNormTupleSet <em>Norm Tuple Set</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.AxisImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AxisImpl extends MinimalEObjectImpl.Container implements Axis {
	/**
	 * The cached value of the '{@link #getSetType() <em>Set Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetType()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap setType;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AxisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xmla_mddatasetPackage.Literals.AXIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getSetType() {
		if (setType == null) {
			setType = new BasicFeatureMap(this, Xmla_mddatasetPackage.AXIS__SET_TYPE);
		}
		return setType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MembersType> getMembers() {
		return getSetType().list(Xmla_mddatasetPackage.Literals.AXIS__MEMBERS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TuplesType> getTuples() {
		return getSetType().list(Xmla_mddatasetPackage.Literals.AXIS__TUPLES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetListType> getCrossProduct() {
		return getSetType().list(Xmla_mddatasetPackage.Literals.AXIS__CROSS_PRODUCT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NormTupleSetType> getNormTupleSet() {
		return getSetType().list(Xmla_mddatasetPackage.Literals.AXIS__NORM_TUPLE_SET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xmla_mddatasetPackage.AXIS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Xmla_mddatasetPackage.AXIS__SET_TYPE:
				return ((InternalEList<?>)getSetType()).basicRemove(otherEnd, msgs);
			case Xmla_mddatasetPackage.AXIS__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
			case Xmla_mddatasetPackage.AXIS__TUPLES:
				return ((InternalEList<?>)getTuples()).basicRemove(otherEnd, msgs);
			case Xmla_mddatasetPackage.AXIS__CROSS_PRODUCT:
				return ((InternalEList<?>)getCrossProduct()).basicRemove(otherEnd, msgs);
			case Xmla_mddatasetPackage.AXIS__NORM_TUPLE_SET:
				return ((InternalEList<?>)getNormTupleSet()).basicRemove(otherEnd, msgs);
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
			case Xmla_mddatasetPackage.AXIS__SET_TYPE:
				if (coreType) return getSetType();
				return ((FeatureMap.Internal)getSetType()).getWrapper();
			case Xmla_mddatasetPackage.AXIS__MEMBERS:
				return getMembers();
			case Xmla_mddatasetPackage.AXIS__TUPLES:
				return getTuples();
			case Xmla_mddatasetPackage.AXIS__CROSS_PRODUCT:
				return getCrossProduct();
			case Xmla_mddatasetPackage.AXIS__NORM_TUPLE_SET:
				return getNormTupleSet();
			case Xmla_mddatasetPackage.AXIS__NAME:
				return getName();
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
			case Xmla_mddatasetPackage.AXIS__SET_TYPE:
				((FeatureMap.Internal)getSetType()).set(newValue);
				return;
			case Xmla_mddatasetPackage.AXIS__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends MembersType>)newValue);
				return;
			case Xmla_mddatasetPackage.AXIS__TUPLES:
				getTuples().clear();
				getTuples().addAll((Collection<? extends TuplesType>)newValue);
				return;
			case Xmla_mddatasetPackage.AXIS__CROSS_PRODUCT:
				getCrossProduct().clear();
				getCrossProduct().addAll((Collection<? extends SetListType>)newValue);
				return;
			case Xmla_mddatasetPackage.AXIS__NORM_TUPLE_SET:
				getNormTupleSet().clear();
				getNormTupleSet().addAll((Collection<? extends NormTupleSetType>)newValue);
				return;
			case Xmla_mddatasetPackage.AXIS__NAME:
				setName((String)newValue);
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
			case Xmla_mddatasetPackage.AXIS__SET_TYPE:
				getSetType().clear();
				return;
			case Xmla_mddatasetPackage.AXIS__MEMBERS:
				getMembers().clear();
				return;
			case Xmla_mddatasetPackage.AXIS__TUPLES:
				getTuples().clear();
				return;
			case Xmla_mddatasetPackage.AXIS__CROSS_PRODUCT:
				getCrossProduct().clear();
				return;
			case Xmla_mddatasetPackage.AXIS__NORM_TUPLE_SET:
				getNormTupleSet().clear();
				return;
			case Xmla_mddatasetPackage.AXIS__NAME:
				setName(NAME_EDEFAULT);
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
			case Xmla_mddatasetPackage.AXIS__SET_TYPE:
				return setType != null && !setType.isEmpty();
			case Xmla_mddatasetPackage.AXIS__MEMBERS:
				return !getMembers().isEmpty();
			case Xmla_mddatasetPackage.AXIS__TUPLES:
				return !getTuples().isEmpty();
			case Xmla_mddatasetPackage.AXIS__CROSS_PRODUCT:
				return !getCrossProduct().isEmpty();
			case Xmla_mddatasetPackage.AXIS__NORM_TUPLE_SET:
				return !getNormTupleSet().isEmpty();
			case Xmla_mddatasetPackage.AXIS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (setType: ");
		result.append(setType);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AxisImpl
