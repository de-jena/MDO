/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl;

import java.util.Collection;

import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CubeInfo;
import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.OlapInfoCube;
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
 * An implementation of the model object '<em><b>Cube Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.CubeInfoImpl#getCube <em>Cube</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CubeInfoImpl extends MinimalEObjectImpl.Container implements CubeInfo {
	/**
	 * The cached value of the '{@link #getCube() <em>Cube</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCube()
	 * @generated
	 * @ordered
	 */
	protected EList<OlapInfoCube> cube;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CubeInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xmla_mddatasetPackage.Literals.CUBE_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OlapInfoCube> getCube() {
		if (cube == null) {
			cube = new EObjectContainmentEList<OlapInfoCube>(OlapInfoCube.class, this, Xmla_mddatasetPackage.CUBE_INFO__CUBE);
		}
		return cube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Xmla_mddatasetPackage.CUBE_INFO__CUBE:
				return ((InternalEList<?>)getCube()).basicRemove(otherEnd, msgs);
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
			case Xmla_mddatasetPackage.CUBE_INFO__CUBE:
				return getCube();
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
			case Xmla_mddatasetPackage.CUBE_INFO__CUBE:
				getCube().clear();
				getCube().addAll((Collection<? extends OlapInfoCube>)newValue);
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
			case Xmla_mddatasetPackage.CUBE_INFO__CUBE:
				getCube().clear();
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
			case Xmla_mddatasetPackage.CUBE_INFO__CUBE:
				return cube != null && !cube.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CubeInfoImpl
