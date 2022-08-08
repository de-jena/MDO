/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl;

import java.util.Collection;

import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.AxesInfo;
import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.AxisInfo;
import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Xmla_mddatasetPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Axes Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.AxesInfoImpl#getAxisInfo <em>Axis Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AxesInfoImpl extends MinimalEObjectImpl.Container implements AxesInfo {
	/**
	 * The cached value of the '{@link #getAxisInfo() <em>Axis Info</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxisInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<AxisInfo> axisInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AxesInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xmla_mddatasetPackage.Literals.AXES_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AxisInfo> getAxisInfo() {
		if (axisInfo == null) {
			axisInfo = new EObjectContainmentEList<AxisInfo>(AxisInfo.class, this, Xmla_mddatasetPackage.AXES_INFO__AXIS_INFO);
		}
		return axisInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Xmla_mddatasetPackage.AXES_INFO__AXIS_INFO:
				return ((InternalEList<?>)getAxisInfo()).basicRemove(otherEnd, msgs);
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
			case Xmla_mddatasetPackage.AXES_INFO__AXIS_INFO:
				return getAxisInfo();
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
			case Xmla_mddatasetPackage.AXES_INFO__AXIS_INFO:
				getAxisInfo().clear();
				getAxisInfo().addAll((Collection<? extends AxisInfo>)newValue);
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
			case Xmla_mddatasetPackage.AXES_INFO__AXIS_INFO:
				getAxisInfo().clear();
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
			case Xmla_mddatasetPackage.AXES_INFO__AXIS_INFO:
				return axisInfo != null && !axisInfo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AxesInfoImpl
