/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.MiningModelingFlag;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mining Modeling Flag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningModelingFlagImpl#getModelingFlag <em>Modeling Flag</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MiningModelingFlagImpl extends MinimalEObjectImpl.Container implements MiningModelingFlag {
	/**
	 * The default value of the '{@link #getModelingFlag() <em>Modeling Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelingFlag()
	 * @generated
	 * @ordered
	 */
	protected static final String MODELING_FLAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelingFlag() <em>Modeling Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelingFlag()
	 * @generated
	 * @ordered
	 */
	protected String modelingFlag = MODELING_FLAG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MiningModelingFlagImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.MINING_MODELING_FLAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelingFlag() {
		return modelingFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelingFlag(String newModelingFlag) {
		String oldModelingFlag = modelingFlag;
		modelingFlag = newModelingFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_MODELING_FLAG__MODELING_FLAG, oldModelingFlag, modelingFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmlaPackage.MINING_MODELING_FLAG__MODELING_FLAG:
				return getModelingFlag();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XmlaPackage.MINING_MODELING_FLAG__MODELING_FLAG:
				setModelingFlag((String)newValue);
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
			case XmlaPackage.MINING_MODELING_FLAG__MODELING_FLAG:
				setModelingFlag(MODELING_FLAG_EDEFAULT);
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
			case XmlaPackage.MINING_MODELING_FLAG__MODELING_FLAG:
				return MODELING_FLAG_EDEFAULT == null ? modelingFlag != null : !MODELING_FLAG_EDEFAULT.equals(modelingFlag);
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
		result.append(" (modelingFlag: ");
		result.append(modelingFlag);
		result.append(')');
		return result.toString();
	}

} //MiningModelingFlagImpl
