/*
 */
package de.jena.mdo.ibis.customerInformationService.impl;

import de.jena.mdo.ibis.common.IBISIPInt;

import de.jena.mdo.ibis.customerInformationService.CustomerInformationServiceRetrievePartialStopSequenceRequestStructure;
import de.jena.mdo.ibis.customerInformationService.IBISCustomerInformationServicePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer Information Service Retrieve Partial Stop Sequence Request Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.customerInformationService.impl.CustomerInformationServiceRetrievePartialStopSequenceRequestStructureImpl#getStartingStopIndex <em>Starting Stop Index</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.customerInformationService.impl.CustomerInformationServiceRetrievePartialStopSequenceRequestStructureImpl#getNumberOfStopPoints <em>Number Of Stop Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerInformationServiceRetrievePartialStopSequenceRequestStructureImpl extends MinimalEObjectImpl.Container implements CustomerInformationServiceRetrievePartialStopSequenceRequestStructure {
	/**
	 * The cached value of the '{@link #getStartingStopIndex() <em>Starting Stop Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingStopIndex()
	 * @generated
	 * @ordered
	 */
	protected IBISIPInt startingStopIndex;

	/**
	 * The cached value of the '{@link #getNumberOfStopPoints() <em>Number Of Stop Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfStopPoints()
	 * @generated
	 * @ordered
	 */
	protected IBISIPInt numberOfStopPoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerInformationServiceRetrievePartialStopSequenceRequestStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IBISCustomerInformationServicePackage.eINSTANCE.getCustomerInformationServiceRetrievePartialStopSequenceRequestStructure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPInt getStartingStopIndex() {
		return startingStopIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartingStopIndex(IBISIPInt newStartingStopIndex, NotificationChain msgs) {
		IBISIPInt oldStartingStopIndex = startingStopIndex;
		startingStopIndex = newStartingStopIndex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_RETRIEVE_PARTIAL_STOP_SEQUENCE_REQUEST_STRUCTURE__STARTING_STOP_INDEX, oldStartingStopIndex, newStartingStopIndex);
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
	public void setStartingStopIndex(IBISIPInt newStartingStopIndex) {
		if (newStartingStopIndex != startingStopIndex) {
			NotificationChain msgs = null;
			if (startingStopIndex != null)
				msgs = ((InternalEObject)startingStopIndex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_RETRIEVE_PARTIAL_STOP_SEQUENCE_REQUEST_STRUCTURE__STARTING_STOP_INDEX, null, msgs);
			if (newStartingStopIndex != null)
				msgs = ((InternalEObject)newStartingStopIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_RETRIEVE_PARTIAL_STOP_SEQUENCE_REQUEST_STRUCTURE__STARTING_STOP_INDEX, null, msgs);
			msgs = basicSetStartingStopIndex(newStartingStopIndex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_RETRIEVE_PARTIAL_STOP_SEQUENCE_REQUEST_STRUCTURE__STARTING_STOP_INDEX, newStartingStopIndex, newStartingStopIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPInt getNumberOfStopPoints() {
		return numberOfStopPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumberOfStopPoints(IBISIPInt newNumberOfStopPoints, NotificationChain msgs) {
		IBISIPInt oldNumberOfStopPoints = numberOfStopPoints;
		numberOfStopPoints = newNumberOfStopPoints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_RETRIEVE_PARTIAL_STOP_SEQUENCE_REQUEST_STRUCTURE__NUMBER_OF_STOP_POINTS, oldNumberOfStopPoints, newNumberOfStopPoints);
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
	public void setNumberOfStopPoints(IBISIPInt newNumberOfStopPoints) {
		if (newNumberOfStopPoints != numberOfStopPoints) {
			NotificationChain msgs = null;
			if (numberOfStopPoints != null)
				msgs = ((InternalEObject)numberOfStopPoints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_RETRIEVE_PARTIAL_STOP_SEQUENCE_REQUEST_STRUCTURE__NUMBER_OF_STOP_POINTS, null, msgs);
			if (newNumberOfStopPoints != null)
				msgs = ((InternalEObject)newNumberOfStopPoints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_RETRIEVE_PARTIAL_STOP_SEQUENCE_REQUEST_STRUCTURE__NUMBER_OF_STOP_POINTS, null, msgs);
			msgs = basicSetNumberOfStopPoints(newNumberOfStopPoints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_RETRIEVE_PARTIAL_STOP_SEQUENCE_REQUEST_STRUCTURE__NUMBER_OF_STOP_POINTS, newNumberOfStopPoints, newNumberOfStopPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_RETRIEVE_PARTIAL_STOP_SEQUENCE_REQUEST_STRUCTURE__STARTING_STOP_INDEX:
				return basicSetStartingStopIndex(null, msgs);
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_RETRIEVE_PARTIAL_STOP_SEQUENCE_REQUEST_STRUCTURE__NUMBER_OF_STOP_POINTS:
				return basicSetNumberOfStopPoints(null, msgs);
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
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_RETRIEVE_PARTIAL_STOP_SEQUENCE_REQUEST_STRUCTURE__STARTING_STOP_INDEX:
				return getStartingStopIndex();
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_RETRIEVE_PARTIAL_STOP_SEQUENCE_REQUEST_STRUCTURE__NUMBER_OF_STOP_POINTS:
				return getNumberOfStopPoints();
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
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_RETRIEVE_PARTIAL_STOP_SEQUENCE_REQUEST_STRUCTURE__STARTING_STOP_INDEX:
				setStartingStopIndex((IBISIPInt)newValue);
				return;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_RETRIEVE_PARTIAL_STOP_SEQUENCE_REQUEST_STRUCTURE__NUMBER_OF_STOP_POINTS:
				setNumberOfStopPoints((IBISIPInt)newValue);
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
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_RETRIEVE_PARTIAL_STOP_SEQUENCE_REQUEST_STRUCTURE__STARTING_STOP_INDEX:
				setStartingStopIndex((IBISIPInt)null);
				return;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_RETRIEVE_PARTIAL_STOP_SEQUENCE_REQUEST_STRUCTURE__NUMBER_OF_STOP_POINTS:
				setNumberOfStopPoints((IBISIPInt)null);
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
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_RETRIEVE_PARTIAL_STOP_SEQUENCE_REQUEST_STRUCTURE__STARTING_STOP_INDEX:
				return startingStopIndex != null;
			case IBISCustomerInformationServicePackage.CUSTOMER_INFORMATION_SERVICE_RETRIEVE_PARTIAL_STOP_SEQUENCE_REQUEST_STRUCTURE__NUMBER_OF_STOP_POINTS:
				return numberOfStopPoints != null;
		}
		return super.eIsSet(featureID);
	}

} //CustomerInformationServiceRetrievePartialStopSequenceRequestStructureImpl
