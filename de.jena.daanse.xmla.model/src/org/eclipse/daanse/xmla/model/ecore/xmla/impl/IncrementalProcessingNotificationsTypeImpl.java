/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.util.Collection;

import org.eclipse.daanse.xmla.model.ecore.xmla.IncrementalProcessingNotification;
import org.eclipse.daanse.xmla.model.ecore.xmla.IncrementalProcessingNotificationsType;
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
 * An implementation of the model object '<em><b>Incremental Processing Notifications Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.IncrementalProcessingNotificationsTypeImpl#getIncrementalProcessingNotification <em>Incremental Processing Notification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IncrementalProcessingNotificationsTypeImpl extends MinimalEObjectImpl.Container implements IncrementalProcessingNotificationsType {
	/**
	 * The cached value of the '{@link #getIncrementalProcessingNotification() <em>Incremental Processing Notification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementalProcessingNotification()
	 * @generated
	 * @ordered
	 */
	protected EList<IncrementalProcessingNotification> incrementalProcessingNotification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncrementalProcessingNotificationsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.INCREMENTAL_PROCESSING_NOTIFICATIONS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IncrementalProcessingNotification> getIncrementalProcessingNotification() {
		if (incrementalProcessingNotification == null) {
			incrementalProcessingNotification = new EObjectContainmentEList<IncrementalProcessingNotification>(IncrementalProcessingNotification.class, this, XmlaPackage.INCREMENTAL_PROCESSING_NOTIFICATIONS_TYPE__INCREMENTAL_PROCESSING_NOTIFICATION);
		}
		return incrementalProcessingNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.INCREMENTAL_PROCESSING_NOTIFICATIONS_TYPE__INCREMENTAL_PROCESSING_NOTIFICATION:
				return ((InternalEList<?>)getIncrementalProcessingNotification()).basicRemove(otherEnd, msgs);
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
			case XmlaPackage.INCREMENTAL_PROCESSING_NOTIFICATIONS_TYPE__INCREMENTAL_PROCESSING_NOTIFICATION:
				return getIncrementalProcessingNotification();
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
			case XmlaPackage.INCREMENTAL_PROCESSING_NOTIFICATIONS_TYPE__INCREMENTAL_PROCESSING_NOTIFICATION:
				getIncrementalProcessingNotification().clear();
				getIncrementalProcessingNotification().addAll((Collection<? extends IncrementalProcessingNotification>)newValue);
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
			case XmlaPackage.INCREMENTAL_PROCESSING_NOTIFICATIONS_TYPE__INCREMENTAL_PROCESSING_NOTIFICATION:
				getIncrementalProcessingNotification().clear();
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
			case XmlaPackage.INCREMENTAL_PROCESSING_NOTIFICATIONS_TYPE__INCREMENTAL_PROCESSING_NOTIFICATION:
				return incrementalProcessingNotification != null && !incrementalProcessingNotification.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IncrementalProcessingNotificationsTypeImpl
