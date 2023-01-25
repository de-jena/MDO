/*
 */
package de.jena.mdo.ibis.customerinformationservice.impl;

import de.jena.mdo.ibis.common.impl.GeneralResponseStructureImpl;

import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentDisplayContentData;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentDisplayContentResponseStructure;
import de.jena.mdo.ibis.customerinformationservice.IbisCustomerInformationServicePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer Information Service Get Current Display Content Response Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceGetCurrentDisplayContentResponseStructureImpl#getCurrentDisplayContentData <em>Current Display Content Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerInformationServiceGetCurrentDisplayContentResponseStructureImpl extends GeneralResponseStructureImpl implements CustomerInformationServiceGetCurrentDisplayContentResponseStructure {
	/**
	 * The cached value of the '{@link #getCurrentDisplayContentData() <em>Current Display Content Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentDisplayContentData()
	 * @generated
	 * @ordered
	 */
	protected CustomerInformationServiceCurrentDisplayContentData currentDisplayContentData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerInformationServiceGetCurrentDisplayContentResponseStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCustomerInformationServicePackage.Literals.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_DISPLAY_CONTENT_RESPONSE_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInformationServiceCurrentDisplayContentData getCurrentDisplayContentData() {
		return currentDisplayContentData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentDisplayContentData(CustomerInformationServiceCurrentDisplayContentData newCurrentDisplayContentData, NotificationChain msgs) {
		CustomerInformationServiceCurrentDisplayContentData oldCurrentDisplayContentData = currentDisplayContentData;
		currentDisplayContentData = newCurrentDisplayContentData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_DISPLAY_CONTENT_RESPONSE_STRUCTURE__CURRENT_DISPLAY_CONTENT_DATA, oldCurrentDisplayContentData, newCurrentDisplayContentData);
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
	public void setCurrentDisplayContentData(CustomerInformationServiceCurrentDisplayContentData newCurrentDisplayContentData) {
		if (newCurrentDisplayContentData != currentDisplayContentData) {
			NotificationChain msgs = null;
			if (currentDisplayContentData != null)
				msgs = ((InternalEObject)currentDisplayContentData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_DISPLAY_CONTENT_RESPONSE_STRUCTURE__CURRENT_DISPLAY_CONTENT_DATA, null, msgs);
			if (newCurrentDisplayContentData != null)
				msgs = ((InternalEObject)newCurrentDisplayContentData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_DISPLAY_CONTENT_RESPONSE_STRUCTURE__CURRENT_DISPLAY_CONTENT_DATA, null, msgs);
			msgs = basicSetCurrentDisplayContentData(newCurrentDisplayContentData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_DISPLAY_CONTENT_RESPONSE_STRUCTURE__CURRENT_DISPLAY_CONTENT_DATA, newCurrentDisplayContentData, newCurrentDisplayContentData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_DISPLAY_CONTENT_RESPONSE_STRUCTURE__CURRENT_DISPLAY_CONTENT_DATA:
				return basicSetCurrentDisplayContentData(null, msgs);
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
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_DISPLAY_CONTENT_RESPONSE_STRUCTURE__CURRENT_DISPLAY_CONTENT_DATA:
				return getCurrentDisplayContentData();
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
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_DISPLAY_CONTENT_RESPONSE_STRUCTURE__CURRENT_DISPLAY_CONTENT_DATA:
				setCurrentDisplayContentData((CustomerInformationServiceCurrentDisplayContentData)newValue);
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
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_DISPLAY_CONTENT_RESPONSE_STRUCTURE__CURRENT_DISPLAY_CONTENT_DATA:
				setCurrentDisplayContentData((CustomerInformationServiceCurrentDisplayContentData)null);
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
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_DISPLAY_CONTENT_RESPONSE_STRUCTURE__CURRENT_DISPLAY_CONTENT_DATA:
				return currentDisplayContentData != null;
		}
		return super.eIsSet(featureID);
	}

} //CustomerInformationServiceGetCurrentDisplayContentResponseStructureImpl
