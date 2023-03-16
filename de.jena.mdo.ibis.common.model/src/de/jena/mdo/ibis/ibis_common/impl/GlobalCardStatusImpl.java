/*
 */
package de.jena.mdo.ibis.ibis_common.impl;

import de.jena.mdo.ibis.ibis_common.GlobalCardStatus;
import de.jena.mdo.ibis.ibis_common.IBISIPString;
import de.jena.mdo.ibis.ibis_common.IBISIPUnsignedInt;
import de.jena.mdo.ibis.ibis_common.IbisCommonPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Card Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.GlobalCardStatusImpl#getGlobalCardStausID <em>Global Card Staus ID</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.GlobalCardStatusImpl#getGlobalCardStatusText <em>Global Card Status Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlobalCardStatusImpl extends MinimalEObjectImpl.Container implements GlobalCardStatus {
	/**
	 * The cached value of the '{@link #getGlobalCardStausID() <em>Global Card Staus ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalCardStausID()
	 * @generated
	 * @ordered
	 */
	protected IBISIPUnsignedInt globalCardStausID;

	/**
	 * The cached value of the '{@link #getGlobalCardStatusText() <em>Global Card Status Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalCardStatusText()
	 * @generated
	 * @ordered
	 */
	protected EList<IBISIPString> globalCardStatusText;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalCardStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.Literals.GLOBAL_CARD_STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPUnsignedInt getGlobalCardStausID() {
		return globalCardStausID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalCardStausID(IBISIPUnsignedInt newGlobalCardStausID, NotificationChain msgs) {
		IBISIPUnsignedInt oldGlobalCardStausID = globalCardStausID;
		globalCardStausID = newGlobalCardStausID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.GLOBAL_CARD_STATUS__GLOBAL_CARD_STAUS_ID, oldGlobalCardStausID, newGlobalCardStausID);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlobalCardStausID(IBISIPUnsignedInt newGlobalCardStausID) {
		if (newGlobalCardStausID != globalCardStausID) {
			NotificationChain msgs = null;
			if (globalCardStausID != null)
				msgs = ((InternalEObject)globalCardStausID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.GLOBAL_CARD_STATUS__GLOBAL_CARD_STAUS_ID, null, msgs);
			if (newGlobalCardStausID != null)
				msgs = ((InternalEObject)newGlobalCardStausID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.GLOBAL_CARD_STATUS__GLOBAL_CARD_STAUS_ID, null, msgs);
			msgs = basicSetGlobalCardStausID(newGlobalCardStausID, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.GLOBAL_CARD_STATUS__GLOBAL_CARD_STAUS_ID, newGlobalCardStausID, newGlobalCardStausID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IBISIPString> getGlobalCardStatusText() {
		if (globalCardStatusText == null) {
			globalCardStatusText = new EObjectContainmentEList<IBISIPString>(IBISIPString.class, this, IbisCommonPackage.GLOBAL_CARD_STATUS__GLOBAL_CARD_STATUS_TEXT);
		}
		return globalCardStatusText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.GLOBAL_CARD_STATUS__GLOBAL_CARD_STAUS_ID:
				return basicSetGlobalCardStausID(null, msgs);
			case IbisCommonPackage.GLOBAL_CARD_STATUS__GLOBAL_CARD_STATUS_TEXT:
				return ((InternalEList<?>)getGlobalCardStatusText()).basicRemove(otherEnd, msgs);
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
			case IbisCommonPackage.GLOBAL_CARD_STATUS__GLOBAL_CARD_STAUS_ID:
				return getGlobalCardStausID();
			case IbisCommonPackage.GLOBAL_CARD_STATUS__GLOBAL_CARD_STATUS_TEXT:
				return getGlobalCardStatusText();
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
			case IbisCommonPackage.GLOBAL_CARD_STATUS__GLOBAL_CARD_STAUS_ID:
				setGlobalCardStausID((IBISIPUnsignedInt)newValue);
				return;
			case IbisCommonPackage.GLOBAL_CARD_STATUS__GLOBAL_CARD_STATUS_TEXT:
				getGlobalCardStatusText().clear();
				getGlobalCardStatusText().addAll((Collection<? extends IBISIPString>)newValue);
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
			case IbisCommonPackage.GLOBAL_CARD_STATUS__GLOBAL_CARD_STAUS_ID:
				setGlobalCardStausID((IBISIPUnsignedInt)null);
				return;
			case IbisCommonPackage.GLOBAL_CARD_STATUS__GLOBAL_CARD_STATUS_TEXT:
				getGlobalCardStatusText().clear();
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
			case IbisCommonPackage.GLOBAL_CARD_STATUS__GLOBAL_CARD_STAUS_ID:
				return globalCardStausID != null;
			case IbisCommonPackage.GLOBAL_CARD_STATUS__GLOBAL_CARD_STATUS_TEXT:
				return globalCardStatusText != null && !globalCardStatusText.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GlobalCardStatusImpl
