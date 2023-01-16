/*
 */
package de.jena.mdo.ibis.common.impl;

import de.jena.mdo.ibis.common.CardApplInformations;
import de.jena.mdo.ibis.common.IBISIPByte;
import de.jena.mdo.ibis.common.IBISIPUnsignedInt;
import de.jena.mdo.ibis.common.IbisCommonPackage;

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
 * An implementation of the model object '<em><b>Card Appl Informations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.impl.CardApplInformationsImpl#getCardApplInformationLength <em>Card Appl Information Length</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.CardApplInformationsImpl#getCardApplInformationData <em>Card Appl Information Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CardApplInformationsImpl extends MinimalEObjectImpl.Container implements CardApplInformations {
	/**
	 * The cached value of the '{@link #getCardApplInformationLength() <em>Card Appl Information Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardApplInformationLength()
	 * @generated
	 * @ordered
	 */
	protected IBISIPUnsignedInt cardApplInformationLength;

	/**
	 * The cached value of the '{@link #getCardApplInformationData() <em>Card Appl Information Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardApplInformationData()
	 * @generated
	 * @ordered
	 */
	protected EList<IBISIPByte> cardApplInformationData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardApplInformationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.eINSTANCE.getCardApplInformations();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPUnsignedInt getCardApplInformationLength() {
		return cardApplInformationLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCardApplInformationLength(IBISIPUnsignedInt newCardApplInformationLength, NotificationChain msgs) {
		IBISIPUnsignedInt oldCardApplInformationLength = cardApplInformationLength;
		cardApplInformationLength = newCardApplInformationLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.CARD_APPL_INFORMATIONS__CARD_APPL_INFORMATION_LENGTH, oldCardApplInformationLength, newCardApplInformationLength);
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
	public void setCardApplInformationLength(IBISIPUnsignedInt newCardApplInformationLength) {
		if (newCardApplInformationLength != cardApplInformationLength) {
			NotificationChain msgs = null;
			if (cardApplInformationLength != null)
				msgs = ((InternalEObject)cardApplInformationLength).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.CARD_APPL_INFORMATIONS__CARD_APPL_INFORMATION_LENGTH, null, msgs);
			if (newCardApplInformationLength != null)
				msgs = ((InternalEObject)newCardApplInformationLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.CARD_APPL_INFORMATIONS__CARD_APPL_INFORMATION_LENGTH, null, msgs);
			msgs = basicSetCardApplInformationLength(newCardApplInformationLength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.CARD_APPL_INFORMATIONS__CARD_APPL_INFORMATION_LENGTH, newCardApplInformationLength, newCardApplInformationLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IBISIPByte> getCardApplInformationData() {
		if (cardApplInformationData == null) {
			cardApplInformationData = new EObjectContainmentEList<IBISIPByte>(IBISIPByte.class, this, IbisCommonPackage.CARD_APPL_INFORMATIONS__CARD_APPL_INFORMATION_DATA);
		}
		return cardApplInformationData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.CARD_APPL_INFORMATIONS__CARD_APPL_INFORMATION_LENGTH:
				return basicSetCardApplInformationLength(null, msgs);
			case IbisCommonPackage.CARD_APPL_INFORMATIONS__CARD_APPL_INFORMATION_DATA:
				return ((InternalEList<?>)getCardApplInformationData()).basicRemove(otherEnd, msgs);
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
			case IbisCommonPackage.CARD_APPL_INFORMATIONS__CARD_APPL_INFORMATION_LENGTH:
				return getCardApplInformationLength();
			case IbisCommonPackage.CARD_APPL_INFORMATIONS__CARD_APPL_INFORMATION_DATA:
				return getCardApplInformationData();
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
			case IbisCommonPackage.CARD_APPL_INFORMATIONS__CARD_APPL_INFORMATION_LENGTH:
				setCardApplInformationLength((IBISIPUnsignedInt)newValue);
				return;
			case IbisCommonPackage.CARD_APPL_INFORMATIONS__CARD_APPL_INFORMATION_DATA:
				getCardApplInformationData().clear();
				getCardApplInformationData().addAll((Collection<? extends IBISIPByte>)newValue);
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
			case IbisCommonPackage.CARD_APPL_INFORMATIONS__CARD_APPL_INFORMATION_LENGTH:
				setCardApplInformationLength((IBISIPUnsignedInt)null);
				return;
			case IbisCommonPackage.CARD_APPL_INFORMATIONS__CARD_APPL_INFORMATION_DATA:
				getCardApplInformationData().clear();
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
			case IbisCommonPackage.CARD_APPL_INFORMATIONS__CARD_APPL_INFORMATION_LENGTH:
				return cardApplInformationLength != null;
			case IbisCommonPackage.CARD_APPL_INFORMATIONS__CARD_APPL_INFORMATION_DATA:
				return cardApplInformationData != null && !cardApplInformationData.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CardApplInformationsImpl
