/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.util.Collection;

import org.eclipse.daanse.xmla.model.ecore.xmla.AlgorithmParameter;
import org.eclipse.daanse.xmla.model.ecore.xmla.AlgorithmParametersType;
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
 * An implementation of the model object '<em><b>Algorithm Parameters Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AlgorithmParametersTypeImpl#getAlgorithmParameter <em>Algorithm Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlgorithmParametersTypeImpl extends MinimalEObjectImpl.Container implements AlgorithmParametersType {
	/**
	 * The cached value of the '{@link #getAlgorithmParameter() <em>Algorithm Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithmParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<AlgorithmParameter> algorithmParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlgorithmParametersTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.ALGORITHM_PARAMETERS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AlgorithmParameter> getAlgorithmParameter() {
		if (algorithmParameter == null) {
			algorithmParameter = new EObjectContainmentEList<AlgorithmParameter>(AlgorithmParameter.class, this, XmlaPackage.ALGORITHM_PARAMETERS_TYPE__ALGORITHM_PARAMETER);
		}
		return algorithmParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.ALGORITHM_PARAMETERS_TYPE__ALGORITHM_PARAMETER:
				return ((InternalEList<?>)getAlgorithmParameter()).basicRemove(otherEnd, msgs);
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
			case XmlaPackage.ALGORITHM_PARAMETERS_TYPE__ALGORITHM_PARAMETER:
				return getAlgorithmParameter();
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
			case XmlaPackage.ALGORITHM_PARAMETERS_TYPE__ALGORITHM_PARAMETER:
				getAlgorithmParameter().clear();
				getAlgorithmParameter().addAll((Collection<? extends AlgorithmParameter>)newValue);
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
			case XmlaPackage.ALGORITHM_PARAMETERS_TYPE__ALGORITHM_PARAMETER:
				getAlgorithmParameter().clear();
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
			case XmlaPackage.ALGORITHM_PARAMETERS_TYPE__ALGORITHM_PARAMETER:
				return algorithmParameter != null && !algorithmParameter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AlgorithmParametersTypeImpl
