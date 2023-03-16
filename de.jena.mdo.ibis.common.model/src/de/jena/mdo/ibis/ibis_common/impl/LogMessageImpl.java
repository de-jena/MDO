/*
 */
package de.jena.mdo.ibis.ibis_common.impl;

import de.jena.mdo.ibis.ibis_common.DeviceSpecification;
import de.jena.mdo.ibis.ibis_common.IbisCommonPackage;
import de.jena.mdo.ibis.ibis_common.LogMessage;
import de.jena.mdo.ibis.ibis_common.Message;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Log Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.LogMessageImpl#getMessageProvider <em>Message Provider</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.LogMessageImpl#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogMessageImpl extends MinimalEObjectImpl.Container implements LogMessage {
	/**
	 * The cached value of the '{@link #getMessageProvider() <em>Message Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageProvider()
	 * @generated
	 * @ordered
	 */
	protected DeviceSpecification messageProvider;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected Message message;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.Literals.LOG_MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceSpecification getMessageProvider() {
		return messageProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageProvider(DeviceSpecification newMessageProvider, NotificationChain msgs) {
		DeviceSpecification oldMessageProvider = messageProvider;
		messageProvider = newMessageProvider;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.LOG_MESSAGE__MESSAGE_PROVIDER, oldMessageProvider, newMessageProvider);
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
	public void setMessageProvider(DeviceSpecification newMessageProvider) {
		if (newMessageProvider != messageProvider) {
			NotificationChain msgs = null;
			if (messageProvider != null)
				msgs = ((InternalEObject)messageProvider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.LOG_MESSAGE__MESSAGE_PROVIDER, null, msgs);
			if (newMessageProvider != null)
				msgs = ((InternalEObject)newMessageProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.LOG_MESSAGE__MESSAGE_PROVIDER, null, msgs);
			msgs = basicSetMessageProvider(newMessageProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.LOG_MESSAGE__MESSAGE_PROVIDER, newMessageProvider, newMessageProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Message getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessage(Message newMessage, NotificationChain msgs) {
		Message oldMessage = message;
		message = newMessage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.LOG_MESSAGE__MESSAGE, oldMessage, newMessage);
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
	public void setMessage(Message newMessage) {
		if (newMessage != message) {
			NotificationChain msgs = null;
			if (message != null)
				msgs = ((InternalEObject)message).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.LOG_MESSAGE__MESSAGE, null, msgs);
			if (newMessage != null)
				msgs = ((InternalEObject)newMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.LOG_MESSAGE__MESSAGE, null, msgs);
			msgs = basicSetMessage(newMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.LOG_MESSAGE__MESSAGE, newMessage, newMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.LOG_MESSAGE__MESSAGE_PROVIDER:
				return basicSetMessageProvider(null, msgs);
			case IbisCommonPackage.LOG_MESSAGE__MESSAGE:
				return basicSetMessage(null, msgs);
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
			case IbisCommonPackage.LOG_MESSAGE__MESSAGE_PROVIDER:
				return getMessageProvider();
			case IbisCommonPackage.LOG_MESSAGE__MESSAGE:
				return getMessage();
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
			case IbisCommonPackage.LOG_MESSAGE__MESSAGE_PROVIDER:
				setMessageProvider((DeviceSpecification)newValue);
				return;
			case IbisCommonPackage.LOG_MESSAGE__MESSAGE:
				setMessage((Message)newValue);
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
			case IbisCommonPackage.LOG_MESSAGE__MESSAGE_PROVIDER:
				setMessageProvider((DeviceSpecification)null);
				return;
			case IbisCommonPackage.LOG_MESSAGE__MESSAGE:
				setMessage((Message)null);
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
			case IbisCommonPackage.LOG_MESSAGE__MESSAGE_PROVIDER:
				return messageProvider != null;
			case IbisCommonPackage.LOG_MESSAGE__MESSAGE:
				return message != null;
		}
		return super.eIsSet(featureID);
	}

} //LogMessageImpl
