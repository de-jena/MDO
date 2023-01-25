/*
 */
package de.jena.mdo.ibis.customerinformationservice.impl;

import de.jena.mdo.ibis.common.impl.GeneralResponseStructureImpl;

import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentConnectionInformationData;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentConnectionInformationResponseStructure;
import de.jena.mdo.ibis.customerinformationservice.IbisCustomerInformationServicePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer Information Service Get Current Connection Information Response Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceGetCurrentConnectionInformationResponseStructureImpl#getCurrentConnectionData <em>Current Connection Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerInformationServiceGetCurrentConnectionInformationResponseStructureImpl extends GeneralResponseStructureImpl implements CustomerInformationServiceGetCurrentConnectionInformationResponseStructure {
	/**
	 * The cached value of the '{@link #getCurrentConnectionData() <em>Current Connection Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentConnectionData()
	 * @generated
	 * @ordered
	 */
	protected CustomerInformationServiceCurrentConnectionInformationData currentConnectionData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerInformationServiceGetCurrentConnectionInformationResponseStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCustomerInformationServicePackage.Literals.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_CONNECTION_INFORMATION_RESPONSE_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInformationServiceCurrentConnectionInformationData getCurrentConnectionData() {
		return currentConnectionData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentConnectionData(CustomerInformationServiceCurrentConnectionInformationData newCurrentConnectionData, NotificationChain msgs) {
		CustomerInformationServiceCurrentConnectionInformationData oldCurrentConnectionData = currentConnectionData;
		currentConnectionData = newCurrentConnectionData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_CONNECTION_INFORMATION_RESPONSE_STRUCTURE__CURRENT_CONNECTION_DATA, oldCurrentConnectionData, newCurrentConnectionData);
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
	public void setCurrentConnectionData(CustomerInformationServiceCurrentConnectionInformationData newCurrentConnectionData) {
		if (newCurrentConnectionData != currentConnectionData) {
			NotificationChain msgs = null;
			if (currentConnectionData != null)
				msgs = ((InternalEObject)currentConnectionData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_CONNECTION_INFORMATION_RESPONSE_STRUCTURE__CURRENT_CONNECTION_DATA, null, msgs);
			if (newCurrentConnectionData != null)
				msgs = ((InternalEObject)newCurrentConnectionData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_CONNECTION_INFORMATION_RESPONSE_STRUCTURE__CURRENT_CONNECTION_DATA, null, msgs);
			msgs = basicSetCurrentConnectionData(newCurrentConnectionData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_CONNECTION_INFORMATION_RESPONSE_STRUCTURE__CURRENT_CONNECTION_DATA, newCurrentConnectionData, newCurrentConnectionData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_CONNECTION_INFORMATION_RESPONSE_STRUCTURE__CURRENT_CONNECTION_DATA:
				return basicSetCurrentConnectionData(null, msgs);
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
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_CONNECTION_INFORMATION_RESPONSE_STRUCTURE__CURRENT_CONNECTION_DATA:
				return getCurrentConnectionData();
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
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_CONNECTION_INFORMATION_RESPONSE_STRUCTURE__CURRENT_CONNECTION_DATA:
				setCurrentConnectionData((CustomerInformationServiceCurrentConnectionInformationData)newValue);
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
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_CONNECTION_INFORMATION_RESPONSE_STRUCTURE__CURRENT_CONNECTION_DATA:
				setCurrentConnectionData((CustomerInformationServiceCurrentConnectionInformationData)null);
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
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_CONNECTION_INFORMATION_RESPONSE_STRUCTURE__CURRENT_CONNECTION_DATA:
				return currentConnectionData != null;
		}
		return super.eIsSet(featureID);
	}

} //CustomerInformationServiceGetCurrentConnectionInformationResponseStructureImpl
