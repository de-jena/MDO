/*
 */
package de.jena.mdo.ibis.customerinformationservice.impl;

import de.jena.mdo.ibis.common.IBISIPDateTime;
import de.jena.mdo.ibis.common.IBISIPInt;
import de.jena.mdo.ibis.common.IBISIPLanguage;
import de.jena.mdo.ibis.common.IBISIPNMTOKEN;
import de.jena.mdo.ibis.common.TripInformationStructure;

import de.jena.mdo.ibis.customerinformationservice.CustomerInformationServiceTripData;
import de.jena.mdo.ibis.customerinformationservice.IBISCustomerInformationServicePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer Information Service Trip Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceTripDataImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceTripDataImpl#getVehicleRef <em>Vehicle Ref</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceTripDataImpl#getDefaultLanguage <em>Default Language</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceTripDataImpl#getTripInformation <em>Trip Information</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.customerinformationservice.impl.CustomerInformationServiceTripDataImpl#getCurrentStopIndex <em>Current Stop Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerInformationServiceTripDataImpl extends MinimalEObjectImpl.Container implements CustomerInformationServiceTripData {
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
	 * The cached value of the '{@link #getVehicleRef() <em>Vehicle Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleRef()
	 * @generated
	 * @ordered
	 */
	protected IBISIPNMTOKEN vehicleRef;

	/**
	 * The cached value of the '{@link #getDefaultLanguage() <em>Default Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultLanguage()
	 * @generated
	 * @ordered
	 */
	protected IBISIPLanguage defaultLanguage;

	/**
	 * The cached value of the '{@link #getTripInformation() <em>Trip Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTripInformation()
	 * @generated
	 * @ordered
	 */
	protected TripInformationStructure tripInformation;

	/**
	 * The cached value of the '{@link #getCurrentStopIndex() <em>Current Stop Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentStopIndex()
	 * @generated
	 * @ordered
	 */
	protected IBISIPInt currentStopIndex;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerInformationServiceTripDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IBISCustomerInformationServicePackage.eINSTANCE.getCustomerInformationServiceTripData();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__TIME_STAMP, oldTimeStamp, newTimeStamp);
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
				msgs = ((InternalEObject)timeStamp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__TIME_STAMP, null, msgs);
			if (newTimeStamp != null)
				msgs = ((InternalEObject)newTimeStamp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__TIME_STAMP, null, msgs);
			msgs = basicSetTimeStamp(newTimeStamp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__TIME_STAMP, newTimeStamp, newTimeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPNMTOKEN getVehicleRef() {
		return vehicleRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVehicleRef(IBISIPNMTOKEN newVehicleRef, NotificationChain msgs) {
		IBISIPNMTOKEN oldVehicleRef = vehicleRef;
		vehicleRef = newVehicleRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__VEHICLE_REF, oldVehicleRef, newVehicleRef);
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
	public void setVehicleRef(IBISIPNMTOKEN newVehicleRef) {
		if (newVehicleRef != vehicleRef) {
			NotificationChain msgs = null;
			if (vehicleRef != null)
				msgs = ((InternalEObject)vehicleRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__VEHICLE_REF, null, msgs);
			if (newVehicleRef != null)
				msgs = ((InternalEObject)newVehicleRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__VEHICLE_REF, null, msgs);
			msgs = basicSetVehicleRef(newVehicleRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__VEHICLE_REF, newVehicleRef, newVehicleRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPLanguage getDefaultLanguage() {
		return defaultLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultLanguage(IBISIPLanguage newDefaultLanguage, NotificationChain msgs) {
		IBISIPLanguage oldDefaultLanguage = defaultLanguage;
		defaultLanguage = newDefaultLanguage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__DEFAULT_LANGUAGE, oldDefaultLanguage, newDefaultLanguage);
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
	public void setDefaultLanguage(IBISIPLanguage newDefaultLanguage) {
		if (newDefaultLanguage != defaultLanguage) {
			NotificationChain msgs = null;
			if (defaultLanguage != null)
				msgs = ((InternalEObject)defaultLanguage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__DEFAULT_LANGUAGE, null, msgs);
			if (newDefaultLanguage != null)
				msgs = ((InternalEObject)newDefaultLanguage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__DEFAULT_LANGUAGE, null, msgs);
			msgs = basicSetDefaultLanguage(newDefaultLanguage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__DEFAULT_LANGUAGE, newDefaultLanguage, newDefaultLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TripInformationStructure getTripInformation() {
		return tripInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTripInformation(TripInformationStructure newTripInformation, NotificationChain msgs) {
		TripInformationStructure oldTripInformation = tripInformation;
		tripInformation = newTripInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__TRIP_INFORMATION, oldTripInformation, newTripInformation);
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
	public void setTripInformation(TripInformationStructure newTripInformation) {
		if (newTripInformation != tripInformation) {
			NotificationChain msgs = null;
			if (tripInformation != null)
				msgs = ((InternalEObject)tripInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__TRIP_INFORMATION, null, msgs);
			if (newTripInformation != null)
				msgs = ((InternalEObject)newTripInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__TRIP_INFORMATION, null, msgs);
			msgs = basicSetTripInformation(newTripInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__TRIP_INFORMATION, newTripInformation, newTripInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPInt getCurrentStopIndex() {
		return currentStopIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentStopIndex(IBISIPInt newCurrentStopIndex, NotificationChain msgs) {
		IBISIPInt oldCurrentStopIndex = currentStopIndex;
		currentStopIndex = newCurrentStopIndex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__CURRENT_STOP_INDEX, oldCurrentStopIndex, newCurrentStopIndex);
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
	public void setCurrentStopIndex(IBISIPInt newCurrentStopIndex) {
		if (newCurrentStopIndex != currentStopIndex) {
			NotificationChain msgs = null;
			if (currentStopIndex != null)
				msgs = ((InternalEObject)currentStopIndex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__CURRENT_STOP_INDEX, null, msgs);
			if (newCurrentStopIndex != null)
				msgs = ((InternalEObject)newCurrentStopIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__CURRENT_STOP_INDEX, null, msgs);
			msgs = basicSetCurrentStopIndex(newCurrentStopIndex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__CURRENT_STOP_INDEX, newCurrentStopIndex, newCurrentStopIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__TIME_STAMP:
				return basicSetTimeStamp(null, msgs);
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__VEHICLE_REF:
				return basicSetVehicleRef(null, msgs);
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__DEFAULT_LANGUAGE:
				return basicSetDefaultLanguage(null, msgs);
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__TRIP_INFORMATION:
				return basicSetTripInformation(null, msgs);
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__CURRENT_STOP_INDEX:
				return basicSetCurrentStopIndex(null, msgs);
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
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__TIME_STAMP:
				return getTimeStamp();
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__VEHICLE_REF:
				return getVehicleRef();
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__DEFAULT_LANGUAGE:
				return getDefaultLanguage();
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__TRIP_INFORMATION:
				return getTripInformation();
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__CURRENT_STOP_INDEX:
				return getCurrentStopIndex();
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
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__TIME_STAMP:
				setTimeStamp((IBISIPDateTime)newValue);
				return;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__VEHICLE_REF:
				setVehicleRef((IBISIPNMTOKEN)newValue);
				return;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__DEFAULT_LANGUAGE:
				setDefaultLanguage((IBISIPLanguage)newValue);
				return;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__TRIP_INFORMATION:
				setTripInformation((TripInformationStructure)newValue);
				return;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__CURRENT_STOP_INDEX:
				setCurrentStopIndex((IBISIPInt)newValue);
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
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__TIME_STAMP:
				setTimeStamp((IBISIPDateTime)null);
				return;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__VEHICLE_REF:
				setVehicleRef((IBISIPNMTOKEN)null);
				return;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__DEFAULT_LANGUAGE:
				setDefaultLanguage((IBISIPLanguage)null);
				return;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__TRIP_INFORMATION:
				setTripInformation((TripInformationStructure)null);
				return;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__CURRENT_STOP_INDEX:
				setCurrentStopIndex((IBISIPInt)null);
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
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__TIME_STAMP:
				return timeStamp != null;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__VEHICLE_REF:
				return vehicleRef != null;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__DEFAULT_LANGUAGE:
				return defaultLanguage != null;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__TRIP_INFORMATION:
				return tripInformation != null;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_TRIP_DATA__CURRENT_STOP_INDEX:
				return currentStopIndex != null;
		}
		return super.eIsSet(featureID);
	}

} //CustomerInformationServiceTripDataImpl