/*
 */
package de.jena.mdo.ibis.ibis_customerinformationservice.impl;

import de.jena.mdo.ibis.ibis_common.impl.GeneralResponseImpl;

import de.jena.mdo.ibis.ibis_customerinformationservice.CurrentAnnouncementData;
import de.jena.mdo.ibis.ibis_customerinformationservice.CurrentAnnouncementResponse;
import de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Current Announcement Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.CurrentAnnouncementResponseImpl#getCurrentAnnouncementData <em>Current Announcement Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CurrentAnnouncementResponseImpl extends GeneralResponseImpl implements CurrentAnnouncementResponse {
	/**
	 * The cached value of the '{@link #getCurrentAnnouncementData() <em>Current Announcement Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentAnnouncementData()
	 * @generated
	 * @ordered
	 */
	protected CurrentAnnouncementData currentAnnouncementData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurrentAnnouncementResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCustomerInformationServicePackage.Literals.CURRENT_ANNOUNCEMENT_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurrentAnnouncementData getCurrentAnnouncementData() {
		return currentAnnouncementData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentAnnouncementData(CurrentAnnouncementData newCurrentAnnouncementData, NotificationChain msgs) {
		CurrentAnnouncementData oldCurrentAnnouncementData = currentAnnouncementData;
		currentAnnouncementData = newCurrentAnnouncementData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.CURRENT_ANNOUNCEMENT_RESPONSE__CURRENT_ANNOUNCEMENT_DATA, oldCurrentAnnouncementData, newCurrentAnnouncementData);
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
	public void setCurrentAnnouncementData(CurrentAnnouncementData newCurrentAnnouncementData) {
		if (newCurrentAnnouncementData != currentAnnouncementData) {
			NotificationChain msgs = null;
			if (currentAnnouncementData != null)
				msgs = ((InternalEObject)currentAnnouncementData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.CURRENT_ANNOUNCEMENT_RESPONSE__CURRENT_ANNOUNCEMENT_DATA, null, msgs);
			if (newCurrentAnnouncementData != null)
				msgs = ((InternalEObject)newCurrentAnnouncementData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.CURRENT_ANNOUNCEMENT_RESPONSE__CURRENT_ANNOUNCEMENT_DATA, null, msgs);
			msgs = basicSetCurrentAnnouncementData(newCurrentAnnouncementData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.CURRENT_ANNOUNCEMENT_RESPONSE__CURRENT_ANNOUNCEMENT_DATA, newCurrentAnnouncementData, newCurrentAnnouncementData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCustomerInformationServicePackage.CURRENT_ANNOUNCEMENT_RESPONSE__CURRENT_ANNOUNCEMENT_DATA:
				return basicSetCurrentAnnouncementData(null, msgs);
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
			case IbisCustomerInformationServicePackage.CURRENT_ANNOUNCEMENT_RESPONSE__CURRENT_ANNOUNCEMENT_DATA:
				return getCurrentAnnouncementData();
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
			case IbisCustomerInformationServicePackage.CURRENT_ANNOUNCEMENT_RESPONSE__CURRENT_ANNOUNCEMENT_DATA:
				setCurrentAnnouncementData((CurrentAnnouncementData)newValue);
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
			case IbisCustomerInformationServicePackage.CURRENT_ANNOUNCEMENT_RESPONSE__CURRENT_ANNOUNCEMENT_DATA:
				setCurrentAnnouncementData((CurrentAnnouncementData)null);
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
			case IbisCustomerInformationServicePackage.CURRENT_ANNOUNCEMENT_RESPONSE__CURRENT_ANNOUNCEMENT_DATA:
				return currentAnnouncementData != null;
		}
		return super.eIsSet(featureID);
	}

} //CurrentAnnouncementResponseImpl
