/*
 */
package de.jena.mdo.ibis.customerInformationService.impl;

import de.jena.mdo.ibis.common.IBISIPString;

import de.jena.mdo.ibis.customerInformationService.CustomerInformationServiceCurrentDisplayContentData;
import de.jena.mdo.ibis.customerInformationService.CustomerInformationServiceGetCurrentDisplayContentResponseStructure;
import de.jena.mdo.ibis.customerInformationService.IBISCustomerInformationServicePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer Information Service Get Current Display Content Response Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.customerInformationService.impl.CustomerInformationServiceGetCurrentDisplayContentResponseStructureImpl#getCurrentDisplayContentData <em>Current Display Content Data</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.customerInformationService.impl.CustomerInformationServiceGetCurrentDisplayContentResponseStructureImpl#getOperationErrorMessage <em>Operation Error Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerInformationServiceGetCurrentDisplayContentResponseStructureImpl extends MinimalEObjectImpl.Container implements CustomerInformationServiceGetCurrentDisplayContentResponseStructure {
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
		return IBISCustomerInformationServicePackage.eINSTANCE.getCustomerInformationServiceGetCurrentDisplayContentResponseStructure();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_DISPLAY_CONTENT_RESPONSE_STRUCTURE__CURRENT_DISPLAY_CONTENT_DATA, oldCurrentDisplayContentData, newCurrentDisplayContentData);
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
				msgs = ((InternalEObject)currentDisplayContentData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_DISPLAY_CONTENT_RESPONSE_STRUCTURE__CURRENT_DISPLAY_CONTENT_DATA, null, msgs);
			if (newCurrentDisplayContentData != null)
				msgs = ((InternalEObject)newCurrentDisplayContentData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_DISPLAY_CONTENT_RESPONSE_STRUCTURE__CURRENT_DISPLAY_CONTENT_DATA, null, msgs);
			msgs = basicSetCurrentDisplayContentData(newCurrentDisplayContentData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_DISPLAY_CONTENT_RESPONSE_STRUCTURE__CURRENT_DISPLAY_CONTENT_DATA, newCurrentDisplayContentData, newCurrentDisplayContentData));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_DISPLAY_CONTENT_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE, oldOperationErrorMessage, newOperationErrorMessage);
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
				msgs = ((InternalEObject)operationErrorMessage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_DISPLAY_CONTENT_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE, null, msgs);
			if (newOperationErrorMessage != null)
				msgs = ((InternalEObject)newOperationErrorMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_DISPLAY_CONTENT_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE, null, msgs);
			msgs = basicSetOperationErrorMessage(newOperationErrorMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_DISPLAY_CONTENT_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE, newOperationErrorMessage, newOperationErrorMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_DISPLAY_CONTENT_RESPONSE_STRUCTURE__CURRENT_DISPLAY_CONTENT_DATA:
				return basicSetCurrentDisplayContentData(null, msgs);
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_DISPLAY_CONTENT_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE:
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
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_DISPLAY_CONTENT_RESPONSE_STRUCTURE__CURRENT_DISPLAY_CONTENT_DATA:
				return getCurrentDisplayContentData();
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_DISPLAY_CONTENT_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE:
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
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_DISPLAY_CONTENT_RESPONSE_STRUCTURE__CURRENT_DISPLAY_CONTENT_DATA:
				setCurrentDisplayContentData((CustomerInformationServiceCurrentDisplayContentData)newValue);
				return;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_DISPLAY_CONTENT_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE:
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
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_DISPLAY_CONTENT_RESPONSE_STRUCTURE__CURRENT_DISPLAY_CONTENT_DATA:
				setCurrentDisplayContentData((CustomerInformationServiceCurrentDisplayContentData)null);
				return;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_DISPLAY_CONTENT_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE:
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
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_DISPLAY_CONTENT_RESPONSE_STRUCTURE__CURRENT_DISPLAY_CONTENT_DATA:
				return currentDisplayContentData != null;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_GET_CURRENT_DISPLAY_CONTENT_RESPONSE_STRUCTURE__OPERATION_ERROR_MESSAGE:
				return operationErrorMessage != null;
		}
		return super.eIsSet(featureID);
	}

} //CustomerInformationServiceGetCurrentDisplayContentResponseStructureImpl
