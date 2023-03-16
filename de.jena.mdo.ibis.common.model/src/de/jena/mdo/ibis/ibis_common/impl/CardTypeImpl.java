/*
 */
package de.jena.mdo.ibis.ibis_common.impl;

import de.jena.mdo.ibis.ibis_common.CardType;
import de.jena.mdo.ibis.ibis_common.IBISIPNMTOKEN;
import de.jena.mdo.ibis.ibis_common.IbisCommonPackage;
import de.jena.mdo.ibis.ibis_common.InternationalTextType;

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
 * An implementation of the model object '<em><b>Card Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.CardTypeImpl#getCardSerialNumber <em>Card Serial Number</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.CardTypeImpl#getCardTypeID <em>Card Type ID</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.CardTypeImpl#getCardTypeText <em>Card Type Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CardTypeImpl extends MinimalEObjectImpl.Container implements CardType {
	/**
	 * The cached value of the '{@link #getCardSerialNumber() <em>Card Serial Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected IBISIPNMTOKEN cardSerialNumber;

	/**
	 * The cached value of the '{@link #getCardTypeID() <em>Card Type ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardTypeID()
	 * @generated
	 * @ordered
	 */
	protected IBISIPNMTOKEN cardTypeID;

	/**
	 * The cached value of the '{@link #getCardTypeText() <em>Card Type Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardTypeText()
	 * @generated
	 * @ordered
	 */
	protected EList<InternationalTextType> cardTypeText;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.Literals.CARD_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPNMTOKEN getCardSerialNumber() {
		return cardSerialNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCardSerialNumber(IBISIPNMTOKEN newCardSerialNumber, NotificationChain msgs) {
		IBISIPNMTOKEN oldCardSerialNumber = cardSerialNumber;
		cardSerialNumber = newCardSerialNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.CARD_TYPE__CARD_SERIAL_NUMBER, oldCardSerialNumber, newCardSerialNumber);
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
	public void setCardSerialNumber(IBISIPNMTOKEN newCardSerialNumber) {
		if (newCardSerialNumber != cardSerialNumber) {
			NotificationChain msgs = null;
			if (cardSerialNumber != null)
				msgs = ((InternalEObject)cardSerialNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.CARD_TYPE__CARD_SERIAL_NUMBER, null, msgs);
			if (newCardSerialNumber != null)
				msgs = ((InternalEObject)newCardSerialNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.CARD_TYPE__CARD_SERIAL_NUMBER, null, msgs);
			msgs = basicSetCardSerialNumber(newCardSerialNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.CARD_TYPE__CARD_SERIAL_NUMBER, newCardSerialNumber, newCardSerialNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPNMTOKEN getCardTypeID() {
		return cardTypeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCardTypeID(IBISIPNMTOKEN newCardTypeID, NotificationChain msgs) {
		IBISIPNMTOKEN oldCardTypeID = cardTypeID;
		cardTypeID = newCardTypeID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.CARD_TYPE__CARD_TYPE_ID, oldCardTypeID, newCardTypeID);
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
	public void setCardTypeID(IBISIPNMTOKEN newCardTypeID) {
		if (newCardTypeID != cardTypeID) {
			NotificationChain msgs = null;
			if (cardTypeID != null)
				msgs = ((InternalEObject)cardTypeID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.CARD_TYPE__CARD_TYPE_ID, null, msgs);
			if (newCardTypeID != null)
				msgs = ((InternalEObject)newCardTypeID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.CARD_TYPE__CARD_TYPE_ID, null, msgs);
			msgs = basicSetCardTypeID(newCardTypeID, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.CARD_TYPE__CARD_TYPE_ID, newCardTypeID, newCardTypeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InternationalTextType> getCardTypeText() {
		if (cardTypeText == null) {
			cardTypeText = new EObjectContainmentEList<InternationalTextType>(InternationalTextType.class, this, IbisCommonPackage.CARD_TYPE__CARD_TYPE_TEXT);
		}
		return cardTypeText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.CARD_TYPE__CARD_SERIAL_NUMBER:
				return basicSetCardSerialNumber(null, msgs);
			case IbisCommonPackage.CARD_TYPE__CARD_TYPE_ID:
				return basicSetCardTypeID(null, msgs);
			case IbisCommonPackage.CARD_TYPE__CARD_TYPE_TEXT:
				return ((InternalEList<?>)getCardTypeText()).basicRemove(otherEnd, msgs);
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
			case IbisCommonPackage.CARD_TYPE__CARD_SERIAL_NUMBER:
				return getCardSerialNumber();
			case IbisCommonPackage.CARD_TYPE__CARD_TYPE_ID:
				return getCardTypeID();
			case IbisCommonPackage.CARD_TYPE__CARD_TYPE_TEXT:
				return getCardTypeText();
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
			case IbisCommonPackage.CARD_TYPE__CARD_SERIAL_NUMBER:
				setCardSerialNumber((IBISIPNMTOKEN)newValue);
				return;
			case IbisCommonPackage.CARD_TYPE__CARD_TYPE_ID:
				setCardTypeID((IBISIPNMTOKEN)newValue);
				return;
			case IbisCommonPackage.CARD_TYPE__CARD_TYPE_TEXT:
				getCardTypeText().clear();
				getCardTypeText().addAll((Collection<? extends InternationalTextType>)newValue);
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
			case IbisCommonPackage.CARD_TYPE__CARD_SERIAL_NUMBER:
				setCardSerialNumber((IBISIPNMTOKEN)null);
				return;
			case IbisCommonPackage.CARD_TYPE__CARD_TYPE_ID:
				setCardTypeID((IBISIPNMTOKEN)null);
				return;
			case IbisCommonPackage.CARD_TYPE__CARD_TYPE_TEXT:
				getCardTypeText().clear();
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
			case IbisCommonPackage.CARD_TYPE__CARD_SERIAL_NUMBER:
				return cardSerialNumber != null;
			case IbisCommonPackage.CARD_TYPE__CARD_TYPE_ID:
				return cardTypeID != null;
			case IbisCommonPackage.CARD_TYPE__CARD_TYPE_TEXT:
				return cardTypeText != null && !cardTypeText.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CardTypeImpl
