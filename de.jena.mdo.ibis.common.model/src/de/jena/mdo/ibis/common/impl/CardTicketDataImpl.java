/*
 */
package de.jena.mdo.ibis.common.impl;

import de.jena.mdo.ibis.common.CardTicketData;
import de.jena.mdo.ibis.common.IBISIPByte;
import de.jena.mdo.ibis.common.IBISIPUnsignedInt;
import de.jena.mdo.ibis.common.IBISIPUnsignedLong;
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
 * An implementation of the model object '<em><b>Card Ticket Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.impl.CardTicketDataImpl#getCardTicketDataID <em>Card Ticket Data ID</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.CardTicketDataImpl#getCardTicketDataLength <em>Card Ticket Data Length</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.CardTicketDataImpl#getCardTicketData <em>Card Ticket Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CardTicketDataImpl extends MinimalEObjectImpl.Container implements CardTicketData {
	/**
	 * The cached value of the '{@link #getCardTicketDataID() <em>Card Ticket Data ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardTicketDataID()
	 * @generated
	 * @ordered
	 */
	protected IBISIPUnsignedLong cardTicketDataID;

	/**
	 * The cached value of the '{@link #getCardTicketDataLength() <em>Card Ticket Data Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardTicketDataLength()
	 * @generated
	 * @ordered
	 */
	protected IBISIPUnsignedInt cardTicketDataLength;

	/**
	 * The cached value of the '{@link #getCardTicketData() <em>Card Ticket Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardTicketData()
	 * @generated
	 * @ordered
	 */
	protected EList<IBISIPByte> cardTicketData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardTicketDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.eINSTANCE.getCardTicketData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPUnsignedLong getCardTicketDataID() {
		return cardTicketDataID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCardTicketDataID(IBISIPUnsignedLong newCardTicketDataID, NotificationChain msgs) {
		IBISIPUnsignedLong oldCardTicketDataID = cardTicketDataID;
		cardTicketDataID = newCardTicketDataID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.CARD_TICKET_DATA__CARD_TICKET_DATA_ID, oldCardTicketDataID, newCardTicketDataID);
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
	public void setCardTicketDataID(IBISIPUnsignedLong newCardTicketDataID) {
		if (newCardTicketDataID != cardTicketDataID) {
			NotificationChain msgs = null;
			if (cardTicketDataID != null)
				msgs = ((InternalEObject)cardTicketDataID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.CARD_TICKET_DATA__CARD_TICKET_DATA_ID, null, msgs);
			if (newCardTicketDataID != null)
				msgs = ((InternalEObject)newCardTicketDataID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.CARD_TICKET_DATA__CARD_TICKET_DATA_ID, null, msgs);
			msgs = basicSetCardTicketDataID(newCardTicketDataID, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.CARD_TICKET_DATA__CARD_TICKET_DATA_ID, newCardTicketDataID, newCardTicketDataID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPUnsignedInt getCardTicketDataLength() {
		return cardTicketDataLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCardTicketDataLength(IBISIPUnsignedInt newCardTicketDataLength, NotificationChain msgs) {
		IBISIPUnsignedInt oldCardTicketDataLength = cardTicketDataLength;
		cardTicketDataLength = newCardTicketDataLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.CARD_TICKET_DATA__CARD_TICKET_DATA_LENGTH, oldCardTicketDataLength, newCardTicketDataLength);
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
	public void setCardTicketDataLength(IBISIPUnsignedInt newCardTicketDataLength) {
		if (newCardTicketDataLength != cardTicketDataLength) {
			NotificationChain msgs = null;
			if (cardTicketDataLength != null)
				msgs = ((InternalEObject)cardTicketDataLength).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.CARD_TICKET_DATA__CARD_TICKET_DATA_LENGTH, null, msgs);
			if (newCardTicketDataLength != null)
				msgs = ((InternalEObject)newCardTicketDataLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.CARD_TICKET_DATA__CARD_TICKET_DATA_LENGTH, null, msgs);
			msgs = basicSetCardTicketDataLength(newCardTicketDataLength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.CARD_TICKET_DATA__CARD_TICKET_DATA_LENGTH, newCardTicketDataLength, newCardTicketDataLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IBISIPByte> getCardTicketData() {
		if (cardTicketData == null) {
			cardTicketData = new EObjectContainmentEList<IBISIPByte>(IBISIPByte.class, this, IbisCommonPackage.CARD_TICKET_DATA__CARD_TICKET_DATA);
		}
		return cardTicketData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.CARD_TICKET_DATA__CARD_TICKET_DATA_ID:
				return basicSetCardTicketDataID(null, msgs);
			case IbisCommonPackage.CARD_TICKET_DATA__CARD_TICKET_DATA_LENGTH:
				return basicSetCardTicketDataLength(null, msgs);
			case IbisCommonPackage.CARD_TICKET_DATA__CARD_TICKET_DATA:
				return ((InternalEList<?>)getCardTicketData()).basicRemove(otherEnd, msgs);
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
			case IbisCommonPackage.CARD_TICKET_DATA__CARD_TICKET_DATA_ID:
				return getCardTicketDataID();
			case IbisCommonPackage.CARD_TICKET_DATA__CARD_TICKET_DATA_LENGTH:
				return getCardTicketDataLength();
			case IbisCommonPackage.CARD_TICKET_DATA__CARD_TICKET_DATA:
				return getCardTicketData();
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
			case IbisCommonPackage.CARD_TICKET_DATA__CARD_TICKET_DATA_ID:
				setCardTicketDataID((IBISIPUnsignedLong)newValue);
				return;
			case IbisCommonPackage.CARD_TICKET_DATA__CARD_TICKET_DATA_LENGTH:
				setCardTicketDataLength((IBISIPUnsignedInt)newValue);
				return;
			case IbisCommonPackage.CARD_TICKET_DATA__CARD_TICKET_DATA:
				getCardTicketData().clear();
				getCardTicketData().addAll((Collection<? extends IBISIPByte>)newValue);
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
			case IbisCommonPackage.CARD_TICKET_DATA__CARD_TICKET_DATA_ID:
				setCardTicketDataID((IBISIPUnsignedLong)null);
				return;
			case IbisCommonPackage.CARD_TICKET_DATA__CARD_TICKET_DATA_LENGTH:
				setCardTicketDataLength((IBISIPUnsignedInt)null);
				return;
			case IbisCommonPackage.CARD_TICKET_DATA__CARD_TICKET_DATA:
				getCardTicketData().clear();
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
			case IbisCommonPackage.CARD_TICKET_DATA__CARD_TICKET_DATA_ID:
				return cardTicketDataID != null;
			case IbisCommonPackage.CARD_TICKET_DATA__CARD_TICKET_DATA_LENGTH:
				return cardTicketDataLength != null;
			case IbisCommonPackage.CARD_TICKET_DATA__CARD_TICKET_DATA:
				return cardTicketData != null && !cardTicketData.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CardTicketDataImpl
