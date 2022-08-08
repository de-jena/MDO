/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl;

import java.util.Collection;

import org.eclipse.daanse.xmla.model.ecore.xmla_exception.ErrorType;
import org.eclipse.daanse.xmla.model.ecore.xmla_exception.Messages;
import org.eclipse.daanse.xmla.model.ecore.xmla_exception.WarningType;
import org.eclipse.daanse.xmla.model.ecore.xmla_exception.Xmla_exceptionPackage;

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
 * An implementation of the model object '<em><b>Messages</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.MessagesImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.MessagesImpl#getWarning <em>Warning</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.MessagesImpl#getError <em>Error</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessagesImpl extends MinimalEObjectImpl.Container implements Messages {
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
	protected MessagesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xmla_exceptionPackage.Literals.MESSAGES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Xmla_exceptionPackage.MESSAGES__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WarningType> getWarning() {
		return getGroup().list(Xmla_exceptionPackage.Literals.MESSAGES__WARNING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErrorType> getError() {
		return getGroup().list(Xmla_exceptionPackage.Literals.MESSAGES__ERROR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Xmla_exceptionPackage.MESSAGES__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Xmla_exceptionPackage.MESSAGES__WARNING:
				return ((InternalEList<?>)getWarning()).basicRemove(otherEnd, msgs);
			case Xmla_exceptionPackage.MESSAGES__ERROR:
				return ((InternalEList<?>)getError()).basicRemove(otherEnd, msgs);
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
			case Xmla_exceptionPackage.MESSAGES__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Xmla_exceptionPackage.MESSAGES__WARNING:
				return getWarning();
			case Xmla_exceptionPackage.MESSAGES__ERROR:
				return getError();
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
			case Xmla_exceptionPackage.MESSAGES__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Xmla_exceptionPackage.MESSAGES__WARNING:
				getWarning().clear();
				getWarning().addAll((Collection<? extends WarningType>)newValue);
				return;
			case Xmla_exceptionPackage.MESSAGES__ERROR:
				getError().clear();
				getError().addAll((Collection<? extends ErrorType>)newValue);
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
			case Xmla_exceptionPackage.MESSAGES__GROUP:
				getGroup().clear();
				return;
			case Xmla_exceptionPackage.MESSAGES__WARNING:
				getWarning().clear();
				return;
			case Xmla_exceptionPackage.MESSAGES__ERROR:
				getError().clear();
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
			case Xmla_exceptionPackage.MESSAGES__GROUP:
				return group != null && !group.isEmpty();
			case Xmla_exceptionPackage.MESSAGES__WARNING:
				return !getWarning().isEmpty();
			case Xmla_exceptionPackage.MESSAGES__ERROR:
				return !getError().isEmpty();
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

} //MessagesImpl
