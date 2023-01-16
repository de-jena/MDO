/*
 */
package de.jena.mdo.ibis.common.impl;

import de.jena.mdo.ibis.common.IBISIPDateTime;
import de.jena.mdo.ibis.common.IBISIPInt;
import de.jena.mdo.ibis.common.IBISIPString;
import de.jena.mdo.ibis.common.IbisCommonPackage;
import de.jena.mdo.ibis.common.MessageStructure;

import de.jena.mdo.ibis.enumerations.MessageTypeEnumeration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.impl.MessageStructureImpl#getMessageID <em>Message ID</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.MessageStructureImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.MessageStructureImpl#getMessageType <em>Message Type</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.MessageStructureImpl#getMessageText <em>Message Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageStructureImpl extends MinimalEObjectImpl.Container implements MessageStructure {
	/**
	 * The cached value of the '{@link #getMessageID() <em>Message ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageID()
	 * @generated
	 * @ordered
	 */
	protected IBISIPInt messageID;

	/**
	 * The cached value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected IBISIPDateTime timeStamp;

	/**
	 * The default value of the '{@link #getMessageType() <em>Message Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageType()
	 * @generated
	 * @ordered
	 */
	protected static final MessageTypeEnumeration MESSAGE_TYPE_EDEFAULT = MessageTypeEnumeration.STATUS;

	/**
	 * The cached value of the '{@link #getMessageType() <em>Message Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageType()
	 * @generated
	 * @ordered
	 */
	protected MessageTypeEnumeration messageType = MESSAGE_TYPE_EDEFAULT;

	/**
	 * This is true if the Message Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean messageTypeESet;

	/**
	 * The cached value of the '{@link #getMessageText() <em>Message Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageText()
	 * @generated
	 * @ordered
	 */
	protected IBISIPString messageText;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.eINSTANCE.getMessageStructure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPInt getMessageID() {
		return messageID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageID(IBISIPInt newMessageID, NotificationChain msgs) {
		IBISIPInt oldMessageID = messageID;
		messageID = newMessageID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.MESSAGE_STRUCTURE__MESSAGE_ID, oldMessageID, newMessageID);
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
	public void setMessageID(IBISIPInt newMessageID) {
		if (newMessageID != messageID) {
			NotificationChain msgs = null;
			if (messageID != null)
				msgs = ((InternalEObject)messageID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.MESSAGE_STRUCTURE__MESSAGE_ID, null, msgs);
			if (newMessageID != null)
				msgs = ((InternalEObject)newMessageID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.MESSAGE_STRUCTURE__MESSAGE_ID, null, msgs);
			msgs = basicSetMessageID(newMessageID, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.MESSAGE_STRUCTURE__MESSAGE_ID, newMessageID, newMessageID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPDateTime getTimeStamp() {
		return timeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeStamp(IBISIPDateTime newTimeStamp, NotificationChain msgs) {
		IBISIPDateTime oldTimeStamp = timeStamp;
		timeStamp = newTimeStamp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.MESSAGE_STRUCTURE__TIME_STAMP, oldTimeStamp, newTimeStamp);
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
	public void setTimeStamp(IBISIPDateTime newTimeStamp) {
		if (newTimeStamp != timeStamp) {
			NotificationChain msgs = null;
			if (timeStamp != null)
				msgs = ((InternalEObject)timeStamp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.MESSAGE_STRUCTURE__TIME_STAMP, null, msgs);
			if (newTimeStamp != null)
				msgs = ((InternalEObject)newTimeStamp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.MESSAGE_STRUCTURE__TIME_STAMP, null, msgs);
			msgs = basicSetTimeStamp(newTimeStamp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.MESSAGE_STRUCTURE__TIME_STAMP, newTimeStamp, newTimeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageTypeEnumeration getMessageType() {
		return messageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessageType(MessageTypeEnumeration newMessageType) {
		MessageTypeEnumeration oldMessageType = messageType;
		messageType = newMessageType == null ? MESSAGE_TYPE_EDEFAULT : newMessageType;
		boolean oldMessageTypeESet = messageTypeESet;
		messageTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.MESSAGE_STRUCTURE__MESSAGE_TYPE, oldMessageType, messageType, !oldMessageTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMessageType() {
		MessageTypeEnumeration oldMessageType = messageType;
		boolean oldMessageTypeESet = messageTypeESet;
		messageType = MESSAGE_TYPE_EDEFAULT;
		messageTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IbisCommonPackage.MESSAGE_STRUCTURE__MESSAGE_TYPE, oldMessageType, MESSAGE_TYPE_EDEFAULT, oldMessageTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMessageType() {
		return messageTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPString getMessageText() {
		return messageText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageText(IBISIPString newMessageText, NotificationChain msgs) {
		IBISIPString oldMessageText = messageText;
		messageText = newMessageText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.MESSAGE_STRUCTURE__MESSAGE_TEXT, oldMessageText, newMessageText);
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
	public void setMessageText(IBISIPString newMessageText) {
		if (newMessageText != messageText) {
			NotificationChain msgs = null;
			if (messageText != null)
				msgs = ((InternalEObject)messageText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.MESSAGE_STRUCTURE__MESSAGE_TEXT, null, msgs);
			if (newMessageText != null)
				msgs = ((InternalEObject)newMessageText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.MESSAGE_STRUCTURE__MESSAGE_TEXT, null, msgs);
			msgs = basicSetMessageText(newMessageText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.MESSAGE_STRUCTURE__MESSAGE_TEXT, newMessageText, newMessageText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.MESSAGE_STRUCTURE__MESSAGE_ID:
				return basicSetMessageID(null, msgs);
			case IbisCommonPackage.MESSAGE_STRUCTURE__TIME_STAMP:
				return basicSetTimeStamp(null, msgs);
			case IbisCommonPackage.MESSAGE_STRUCTURE__MESSAGE_TEXT:
				return basicSetMessageText(null, msgs);
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
			case IbisCommonPackage.MESSAGE_STRUCTURE__MESSAGE_ID:
				return getMessageID();
			case IbisCommonPackage.MESSAGE_STRUCTURE__TIME_STAMP:
				return getTimeStamp();
			case IbisCommonPackage.MESSAGE_STRUCTURE__MESSAGE_TYPE:
				return getMessageType();
			case IbisCommonPackage.MESSAGE_STRUCTURE__MESSAGE_TEXT:
				return getMessageText();
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
			case IbisCommonPackage.MESSAGE_STRUCTURE__MESSAGE_ID:
				setMessageID((IBISIPInt)newValue);
				return;
			case IbisCommonPackage.MESSAGE_STRUCTURE__TIME_STAMP:
				setTimeStamp((IBISIPDateTime)newValue);
				return;
			case IbisCommonPackage.MESSAGE_STRUCTURE__MESSAGE_TYPE:
				setMessageType((MessageTypeEnumeration)newValue);
				return;
			case IbisCommonPackage.MESSAGE_STRUCTURE__MESSAGE_TEXT:
				setMessageText((IBISIPString)newValue);
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
			case IbisCommonPackage.MESSAGE_STRUCTURE__MESSAGE_ID:
				setMessageID((IBISIPInt)null);
				return;
			case IbisCommonPackage.MESSAGE_STRUCTURE__TIME_STAMP:
				setTimeStamp((IBISIPDateTime)null);
				return;
			case IbisCommonPackage.MESSAGE_STRUCTURE__MESSAGE_TYPE:
				unsetMessageType();
				return;
			case IbisCommonPackage.MESSAGE_STRUCTURE__MESSAGE_TEXT:
				setMessageText((IBISIPString)null);
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
			case IbisCommonPackage.MESSAGE_STRUCTURE__MESSAGE_ID:
				return messageID != null;
			case IbisCommonPackage.MESSAGE_STRUCTURE__TIME_STAMP:
				return timeStamp != null;
			case IbisCommonPackage.MESSAGE_STRUCTURE__MESSAGE_TYPE:
				return isSetMessageType();
			case IbisCommonPackage.MESSAGE_STRUCTURE__MESSAGE_TEXT:
				return messageText != null;
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
		result.append(" (messageType: ");
		if (messageTypeESet) result.append(messageType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MessageStructureImpl
