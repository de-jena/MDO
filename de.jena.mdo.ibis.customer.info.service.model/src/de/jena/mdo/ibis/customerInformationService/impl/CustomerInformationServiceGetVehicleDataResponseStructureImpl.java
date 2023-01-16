/*
 */
package de.jena.mdo.ibis.customerInformationService.impl;

import de.jena.mdo.ibis.common.IBISIPString;

import de.jena.mdo.ibis.customerInformationService.CustomerInformationServiceGetVehicleDataResponseStructure;
import de.jena.mdo.ibis.customerInformationService.CustomerInformationServiceVehicleData;
import de.jena.mdo.ibis.customerInformationService.IBISCustomerInformationServicePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer Information Service Get Vehicle Data Response Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.customerInformationService.impl.CustomerInformationServiceGetVehicleDataResponseStructureImpl#getVehicleData <em>Vehicle Data</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.customerInformationService.impl.CustomerInformationServiceGetVehicleDataResponseStructureImpl#getOperationErrorMessage <em>Operation Error Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerInformationServiceGetVehicleDataResponseStructureImpl extends MinimalEObjectImpl.Container implements CustomerInformationServiceGetVehicleDataResponseStructure {
	/**
	 * The cached value of the '{@link #getVehicleData() <em>Vehicle Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleData()
	 * @generated
	 * @ordered
	 */
	protected CustomerInformationServiceVehicleData vehicleData;

	/**
	 * The cached value of the '{@link #getOperationErrorMessage() <em>Operation Error Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationErrorMessage()
	 * @generated
	 * @ordered
	 */
	protected IBISIPString operationErrorMessage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerInformationServiceGetVehicleDataResponseStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IBISCustomerInformationServicePackage.eINSTANCE.getCustomerInformationServiceGetVehicleDataResponseStructure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInformationServiceVehicleData getVehicleData() {
		return vehicleData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVehicleData(CustomerInformationServiceVehicleData newVehicleData, NotificationChain msgs) {
		CustomerInformationServiceVehicleData oldVehicleData = vehicleData;
		vehicleData = newVehicleData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_VEHICLE_DATA_RESPONSE_STRUCTURE__VEHICLE_DATA, oldVehicleData, newVehicleData);
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
	public void setVehicleData(CustomerInformationServiceVehicleData newVehicleData) {
		if (newVehicleData != vehicleData) {
			NotificationChain msgs = null;
			if (vehicleData != null)
				msgs = ((InternalEObject)vehicleData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_VEHICLE_DATA_RESPONSE_STRUCTURE__VEHICLE_DATA, null, msgs);
			if (newVehicleData != null)
				msgs = ((InternalEObject)newVehicleData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_VEHICLE_DATA_RESPONSE_STRUCTURE__VEHICLE_DATA, null, msgs);
			msgs = basicSetVehicleData(newVehicleData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_VEHICLE_DATA_RESPONSE_STRUCTURE__VEHICLE_DATA, newVehicleData, newVehicleData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPString getOperationErrorMessage() {
		return operationErrorMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationErrorMessage(IBISIPString newOperationErrorMessage, NotificationChain msgs) {
		IBISIPString oldOperationErrorMessage = operationErrorMessage;
		operationErrorMessage = newOperationErrorMessage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_VEHICLE_DATA_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE, oldOperationErrorMessage, newOperationErrorMessage);
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
	public void setOperationErrorMessage(IBISIPString newOperationErrorMessage) {
		if (newOperationErrorMessage != operationErrorMessage) {
			NotificationChain msgs = null;
			if (operationErrorMessage != null)
				msgs = ((InternalEObject)operationErrorMessage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_VEHICLE_DATA_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE, null, msgs);
			if (newOperationErrorMessage != null)
				msgs = ((InternalEObject)newOperationErrorMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_VEHICLE_DATA_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE, null, msgs);
			msgs = basicSetOperationErrorMessage(newOperationErrorMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_VEHICLE_DATA_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE, newOperationErrorMessage, newOperationErrorMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_VEHICLE_DATA_RESPONSE_STRUCTURE__VEHICLE_DATA:
				return basicSetVehicleData(null, msgs);
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_VEHICLE_DATA_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE:
				return basicSetOperationErrorMessage(null, msgs);
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
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_VEHICLE_DATA_RESPONSE_STRUCTURE__VEHICLE_DATA:
				return getVehicleData();
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_VEHICLE_DATA_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE:
				return getOperationErrorMessage();
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
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_VEHICLE_DATA_RESPONSE_STRUCTURE__VEHICLE_DATA:
				setVehicleData((CustomerInformationServiceVehicleData)newValue);
				return;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_VEHICLE_DATA_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE:
				setOperationErrorMessage((IBISIPString)newValue);
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
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_VEHICLE_DATA_RESPONSE_STRUCTURE__VEHICLE_DATA:
				setVehicleData((CustomerInformationServiceVehicleData)null);
				return;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_VEHICLE_DATA_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE:
				setOperationErrorMessage((IBISIPString)null);
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
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_VEHICLE_DATA_RESPONSE_STRUCTURE__VEHICLE_DATA:
				return vehicleData != null;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_VEHICLE_DATA_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE:
				return operationErrorMessage != null;
		}
		return super.eIsSet(featureID);
	}

} //CustomerInformationServiceGetVehicleDataResponseStructureImpl
