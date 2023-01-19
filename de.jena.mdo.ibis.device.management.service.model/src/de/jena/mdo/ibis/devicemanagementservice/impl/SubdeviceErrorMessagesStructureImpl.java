/*
 */
package de.jena.mdo.ibis.devicemanagementservice.impl;

import de.jena.mdo.ibis.common.IBISIPString;
import de.jena.mdo.ibis.common.MessageStructure;

import de.jena.mdo.ibis.devicemanagementservice.IBISDeviceManagementServicePackage;
import de.jena.mdo.ibis.devicemanagementservice.SubdeviceErrorMessagesStructure;

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
 * An implementation of the model object '<em><b>Subdevice Error Messages Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.impl.SubdeviceErrorMessagesStructureImpl#getSubdeviceName <em>Subdevice Name</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.devicemanagementservice.impl.SubdeviceErrorMessagesStructureImpl#getErrorMessage <em>Error Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubdeviceErrorMessagesStructureImpl extends MinimalEObjectImpl.Container implements SubdeviceErrorMessagesStructure {
	/**
	 * The cached value of the '{@link #getSubdeviceName() <em>Subdevice Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubdeviceName()
	 * @generated
	 * @ordered
	 */
	protected IBISIPString subdeviceName;

	/**
	 * The cached value of the '{@link #getErrorMessage() <em>Error Message</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorMessage()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageStructure> errorMessage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubdeviceErrorMessagesStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IBISDeviceManagementServicePackage.eINSTANCE.getSubdeviceErrorMessagesStructure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPString getSubdeviceName() {
		return subdeviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubdeviceName(IBISIPString newSubdeviceName, NotificationChain msgs) {
		IBISIPString oldSubdeviceName = subdeviceName;
		subdeviceName = newSubdeviceName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.SUBDEVICE_ERROR_MESSAGES_STRUCTURE__SUBDEVICE_NAME, oldSubdeviceName, newSubdeviceName);
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
	public void setSubdeviceName(IBISIPString newSubdeviceName) {
		if (newSubdeviceName != subdeviceName) {
			NotificationChain msgs = null;
			if (subdeviceName != null)
				msgs = ((InternalEObject)subdeviceName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.SUBDEVICE_ERROR_MESSAGES_STRUCTURE__SUBDEVICE_NAME, null, msgs);
			if (newSubdeviceName != null)
				msgs = ((InternalEObject)newSubdeviceName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IBISDeviceManagementServicePackage.SUBDEVICE_ERROR_MESSAGES_STRUCTURE__SUBDEVICE_NAME, null, msgs);
			msgs = basicSetSubdeviceName(newSubdeviceName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISDeviceManagementServicePackage.SUBDEVICE_ERROR_MESSAGES_STRUCTURE__SUBDEVICE_NAME, newSubdeviceName, newSubdeviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MessageStructure> getErrorMessage() {
		if (errorMessage == null) {
			errorMessage = new EObjectContainmentEList<MessageStructure>(MessageStructure.class, this, IBISDeviceManagementServicePackage.SUBDEVICE_ERROR_MESSAGES_STRUCTURE__ERROR_MESSAGE);
		}
		return errorMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IBISDeviceManagementServicePackage.SUBDEVICE_ERROR_MESSAGES_STRUCTURE__SUBDEVICE_NAME:
				return basicSetSubdeviceName(null, msgs);
			case IBISDeviceManagementServicePackage.SUBDEVICE_ERROR_MESSAGES_STRUCTURE__ERROR_MESSAGE:
				return ((InternalEList<?>)getErrorMessage()).basicRemove(otherEnd, msgs);
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
			case IBISDeviceManagementServicePackage.SUBDEVICE_ERROR_MESSAGES_STRUCTURE__SUBDEVICE_NAME:
				return getSubdeviceName();
			case IBISDeviceManagementServicePackage.SUBDEVICE_ERROR_MESSAGES_STRUCTURE__ERROR_MESSAGE:
				return getErrorMessage();
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
			case IBISDeviceManagementServicePackage.SUBDEVICE_ERROR_MESSAGES_STRUCTURE__SUBDEVICE_NAME:
				setSubdeviceName((IBISIPString)newValue);
				return;
			case IBISDeviceManagementServicePackage.SUBDEVICE_ERROR_MESSAGES_STRUCTURE__ERROR_MESSAGE:
				getErrorMessage().clear();
				getErrorMessage().addAll((Collection<? extends MessageStructure>)newValue);
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
			case IBISDeviceManagementServicePackage.SUBDEVICE_ERROR_MESSAGES_STRUCTURE__SUBDEVICE_NAME:
				setSubdeviceName((IBISIPString)null);
				return;
			case IBISDeviceManagementServicePackage.SUBDEVICE_ERROR_MESSAGES_STRUCTURE__ERROR_MESSAGE:
				getErrorMessage().clear();
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
			case IBISDeviceManagementServicePackage.SUBDEVICE_ERROR_MESSAGES_STRUCTURE__SUBDEVICE_NAME:
				return subdeviceName != null;
			case IBISDeviceManagementServicePackage.SUBDEVICE_ERROR_MESSAGES_STRUCTURE__ERROR_MESSAGE:
				return errorMessage != null && !errorMessage.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubdeviceErrorMessagesStructureImpl
