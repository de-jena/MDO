/*
 */
package de.jena.mdo.ibis.customerinformationservice.impl;

import de.jena.mdo.ibis.common.impl.GeneralResponseStructureImpl;

import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentStopIndexData;
import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceGetCurrentStopIndexResponseStructure;
import de.jena.mdo.ibis.customerinformationservice.IbisCustomerInformationServicePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer Information Service Get Current Stop Index Response Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceGetCurrentStopIndexResponseStructureImpl#getCurrentStopIndexData <em>Current Stop Index Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerInformationServiceGetCurrentStopIndexResponseStructureImpl extends GeneralResponseStructureImpl implements CustomerInformationServiceGetCurrentStopIndexResponseStructure {
	/**
	 * The cached value of the '{@link #getCurrentStopIndexData() <em>Current Stop Index Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentStopIndexData()
	 * @generated
	 * @ordered
	 */
	protected CustomerInformationServiceCurrentStopIndexData currentStopIndexData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerInformationServiceGetCurrentStopIndexResponseStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCustomerInformationServicePackage.Literals.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_STOP_INDEX_RESPONSE_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInformationServiceCurrentStopIndexData getCurrentStopIndexData() {
		return currentStopIndexData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentStopIndexData(CustomerInformationServiceCurrentStopIndexData newCurrentStopIndexData, NotificationChain msgs) {
		CustomerInformationServiceCurrentStopIndexData oldCurrentStopIndexData = currentStopIndexData;
		currentStopIndexData = newCurrentStopIndexData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_STOP_INDEX_RESPONSE_STRUCTURE__CURRENT_STOP_INDEX_DATA, oldCurrentStopIndexData, newCurrentStopIndexData);
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
	public void setCurrentStopIndexData(CustomerInformationServiceCurrentStopIndexData newCurrentStopIndexData) {
		if (newCurrentStopIndexData != currentStopIndexData) {
			NotificationChain msgs = null;
			if (currentStopIndexData != null)
				msgs = ((InternalEObject)currentStopIndexData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_STOP_INDEX_RESPONSE_STRUCTURE__CURRENT_STOP_INDEX_DATA, null, msgs);
			if (newCurrentStopIndexData != null)
				msgs = ((InternalEObject)newCurrentStopIndexData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_STOP_INDEX_RESPONSE_STRUCTURE__CURRENT_STOP_INDEX_DATA, null, msgs);
			msgs = basicSetCurrentStopIndexData(newCurrentStopIndexData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_STOP_INDEX_RESPONSE_STRUCTURE__CURRENT_STOP_INDEX_DATA, newCurrentStopIndexData, newCurrentStopIndexData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_STOP_INDEX_RESPONSE_STRUCTURE__CURRENT_STOP_INDEX_DATA:
				return basicSetCurrentStopIndexData(null, msgs);
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
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_STOP_INDEX_RESPONSE_STRUCTURE__CURRENT_STOP_INDEX_DATA:
				return getCurrentStopIndexData();
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
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_STOP_INDEX_RESPONSE_STRUCTURE__CURRENT_STOP_INDEX_DATA:
				setCurrentStopIndexData((CustomerInformationServiceCurrentStopIndexData)newValue);
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
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_STOP_INDEX_RESPONSE_STRUCTURE__CURRENT_STOP_INDEX_DATA:
				setCurrentStopIndexData((CustomerInformationServiceCurrentStopIndexData)null);
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
			case IbisCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_STOP_INDEX_RESPONSE_STRUCTURE__CURRENT_STOP_INDEX_DATA:
				return currentStopIndexData != null;
		}
		return super.eIsSet(featureID);
	}

} //CustomerInformationServiceGetCurrentStopIndexResponseStructureImpl
