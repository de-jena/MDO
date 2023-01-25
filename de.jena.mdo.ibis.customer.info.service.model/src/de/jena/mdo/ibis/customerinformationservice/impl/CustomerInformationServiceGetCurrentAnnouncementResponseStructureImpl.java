/*
 */
package de.jena.mdo.ibis.customerinformationservice.impl;

import de.jena.mdo.ibis.common.impl.GeneralResponseStructureImpl;

import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentAnnouncementData;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentAnnouncementResponseStructure;
import de.jena.mdo.ibis.customerinformationservice.IbisCustomerInformationServicePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer Information Service Get Current Announcement Response Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceGetCurrentAnnouncementResponseStructureImpl#getCurrentAnnouncementData <em>Current Announcement Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerInformationServiceGetCurrentAnnouncementResponseStructureImpl extends GeneralResponseStructureImpl implements CustomerInformationServiceGetCurrentAnnouncementResponseStructure {
	/**
	 * The cached value of the '{@link #getCurrentAnnouncementData() <em>Current Announcement Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentAnnouncementData()
	 * @generated
	 * @ordered
	 */
	protected CustomerInformationServiceCurrentAnnouncementData currentAnnouncementData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerInformationServiceGetCurrentAnnouncementResponseStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCustomerInformationServicePackage.Literals.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_ANNOUNCEMENT_RESPONSE_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInformationServiceCurrentAnnouncementData getCurrentAnnouncementData() {
		return currentAnnouncementData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentAnnouncementData(CustomerInformationServiceCurrentAnnouncementData newCurrentAnnouncementData, NotificationChain msgs) {
		CustomerInformationServiceCurrentAnnouncementData oldCurrentAnnouncementData = currentAnnouncementData;
		currentAnnouncementData = newCurrentAnnouncementData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_ANNOUNCEMENT_RESPONSE_STRUCTURE__CURRENT_ANNOUNCEMENT_DATA, oldCurrentAnnouncementData, newCurrentAnnouncementData);
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
	public void setCurrentAnnouncementData(CustomerInformationServiceCurrentAnnouncementData newCurrentAnnouncementData) {
		if (newCurrentAnnouncementData != currentAnnouncementData) {
			NotificationChain msgs = null;
			if (currentAnnouncementData != null)
				msgs = ((InternalEObject)currentAnnouncementData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_ANNOUNCEMENT_RESPONSE_STRUCTURE__CURRENT_ANNOUNCEMENT_DATA, null, msgs);
			if (newCurrentAnnouncementData != null)
				msgs = ((InternalEObject)newCurrentAnnouncementData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_ANNOUNCEMENT_RESPONSE_STRUCTURE__CURRENT_ANNOUNCEMENT_DATA, null, msgs);
			msgs = basicSetCurrentAnnouncementData(newCurrentAnnouncementData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_ANNOUNCEMENT_RESPONSE_STRUCTURE__CURRENT_ANNOUNCEMENT_DATA, newCurrentAnnouncementData, newCurrentAnnouncementData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_ANNOUNCEMENT_RESPONSE_STRUCTURE__CURRENT_ANNOUNCEMENT_DATA:
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
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_ANNOUNCEMENT_RESPONSE_STRUCTURE__CURRENT_ANNOUNCEMENT_DATA:
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
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_ANNOUNCEMENT_RESPONSE_STRUCTURE__CURRENT_ANNOUNCEMENT_DATA:
				setCurrentAnnouncementData((CustomerInformationServiceCurrentAnnouncementData)newValue);
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
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_ANNOUNCEMENT_RESPONSE_STRUCTURE__CURRENT_ANNOUNCEMENT_DATA:
				setCurrentAnnouncementData((CustomerInformationServiceCurrentAnnouncementData)null);
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
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_ANNOUNCEMENT_RESPONSE_STRUCTURE__CURRENT_ANNOUNCEMENT_DATA:
				return currentAnnouncementData != null;
		}
		return super.eIsSet(featureID);
	}

} //CustomerInformationServiceGetCurrentAnnouncementResponseStructureImpl
