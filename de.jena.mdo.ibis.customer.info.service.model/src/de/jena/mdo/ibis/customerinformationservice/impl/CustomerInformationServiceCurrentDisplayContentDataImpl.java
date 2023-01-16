/*
 */
package de.jena.mdo.ibis.customerinformationservice.impl;

import de.jena.mdo.ibis.common.DisplayContentStructure;
import de.jena.mdo.ibis.common.IBISIPDateTime;

import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceCurrentDisplayContentData;
import de.jena.mdo.ibis.customerinformationservice.IBISCustomerInformationServicePackage;

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
 * An implementation of the model object '<em><b>Customer Information Service Current Display Content Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceCurrentDisplayContentDataImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceCurrentDisplayContentDataImpl#getCurrentDisplayContent <em>Current Display Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerInformationServiceCurrentDisplayContentDataImpl extends MinimalEObjectImpl.Container implements CustomerInformationServiceCurrentDisplayContentData {
	/**
	 * The cached value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected IBISIPDateTime timeStamp;

	/**
	 * The cached value of the '{@link #getCurrentDisplayContent() <em>Current Display Content</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentDisplayContent()
	 * @generated
	 * @ordered
	 */
	protected EList<DisplayContentStructure> currentDisplayContent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerInformationServiceCurrentDisplayContentDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IBISCustomerInformationServicePackage.eINSTANCE.getCustomerInformationServiceCurrentDisplayContentData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPDateTime getTimeStamp() {
		return timeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeStamp(IBISIPDateTime newTimeStamp, NotificationChain msgs) {
		IBISIPDateTime oldTimeStamp = timeStamp;
		timeStamp = newTimeStamp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_CURRENT_DISPLAY_CONTENT_DATA__TIME_STAMP, oldTimeStamp, newTimeStamp);
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
	public void setTimeStamp(IBISIPDateTime newTimeStamp) {
		if (newTimeStamp != timeStamp) {
			NotificationChain msgs = null;
			if (timeStamp != null)
				msgs = ((InternalEObject)timeStamp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_CURRENT_DISPLAY_CONTENT_DATA__TIME_STAMP, null, msgs);
			if (newTimeStamp != null)
				msgs = ((InternalEObject)newTimeStamp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_CURRENT_DISPLAY_CONTENT_DATA__TIME_STAMP, null, msgs);
			msgs = basicSetTimeStamp(newTimeStamp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_CURRENT_DISPLAY_CONTENT_DATA__TIME_STAMP, newTimeStamp, newTimeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DisplayContentStructure> getCurrentDisplayContent() {
		if (currentDisplayContent == null) {
			currentDisplayContent = new EObjectContainmentEList<DisplayContentStructure>(DisplayContentStructure.class, this, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_CURRENT_DISPLAY_CONTENT_DATA__CURRENT_DISPLAY_CONTENT);
		}
		return currentDisplayContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_CURRENT_DISPLAY_CONTENT_DATA__TIME_STAMP:
				return basicSetTimeStamp(null, msgs);
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_CURRENT_DISPLAY_CONTENT_DATA__CURRENT_DISPLAY_CONTENT:
				return ((InternalEList<?>)getCurrentDisplayContent()).basicRemove(otherEnd, msgs);
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
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_CURRENT_DISPLAY_CONTENT_DATA__TIME_STAMP:
				return getTimeStamp();
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_CURRENT_DISPLAY_CONTENT_DATA__CURRENT_DISPLAY_CONTENT:
				return getCurrentDisplayContent();
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
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_CURRENT_DISPLAY_CONTENT_DATA__TIME_STAMP:
				setTimeStamp((IBISIPDateTime)newValue);
				return;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_CURRENT_DISPLAY_CONTENT_DATA__CURRENT_DISPLAY_CONTENT:
				getCurrentDisplayContent().clear();
				getCurrentDisplayContent().addAll((Collection<? extends DisplayContentStructure>)newValue);
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
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_CURRENT_DISPLAY_CONTENT_DATA__TIME_STAMP:
				setTimeStamp((IBISIPDateTime)null);
				return;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_CURRENT_DISPLAY_CONTENT_DATA__CURRENT_DISPLAY_CONTENT:
				getCurrentDisplayContent().clear();
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
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_CURRENT_DISPLAY_CONTENT_DATA__TIME_STAMP:
				return timeStamp != null;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_CURRENT_DISPLAY_CONTENT_DATA__CURRENT_DISPLAY_CONTENT:
				return currentDisplayContent != null && !currentDisplayContent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CustomerInformationServiceCurrentDisplayContentDataImpl
