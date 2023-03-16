/*
 */
package de.jena.mdo.ibis.ibis_customerinformationservice.impl;

import de.jena.mdo.ibis.ibis_common.impl.GeneralResponseImpl;

import de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage;
import de.jena.mdo.ibis.ibis_customerinformationservice.PartialStopSequenceData;
import de.jena.mdo.ibis.ibis_customerinformationservice.PartialStopSequenceResponse;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partial Stop Sequence Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.PartialStopSequenceResponseImpl#getPartialStopSequenceData <em>Partial Stop Sequence Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartialStopSequenceResponseImpl extends GeneralResponseImpl implements PartialStopSequenceResponse {
	/**
	 * The cached value of the '{@link #getPartialStopSequenceData() <em>Partial Stop Sequence Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartialStopSequenceData()
	 * @generated
	 * @ordered
	 */
	protected PartialStopSequenceData partialStopSequenceData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartialStopSequenceResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCustomerInformationServicePackage.Literals.PARTIAL_STOP_SEQUENCE_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartialStopSequenceData getPartialStopSequenceData() {
		return partialStopSequenceData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartialStopSequenceData(PartialStopSequenceData newPartialStopSequenceData, NotificationChain msgs) {
		PartialStopSequenceData oldPartialStopSequenceData = partialStopSequenceData;
		partialStopSequenceData = newPartialStopSequenceData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.PARTIAL_STOP_SEQUENCE_RESPONSE__PARTIAL_STOP_SEQUENCE_DATA, oldPartialStopSequenceData, newPartialStopSequenceData);
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
	public void setPartialStopSequenceData(PartialStopSequenceData newPartialStopSequenceData) {
		if (newPartialStopSequenceData != partialStopSequenceData) {
			NotificationChain msgs = null;
			if (partialStopSequenceData != null)
				msgs = ((InternalEObject)partialStopSequenceData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.PARTIAL_STOP_SEQUENCE_RESPONSE__PARTIAL_STOP_SEQUENCE_DATA, null, msgs);
			if (newPartialStopSequenceData != null)
				msgs = ((InternalEObject)newPartialStopSequenceData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.PARTIAL_STOP_SEQUENCE_RESPONSE__PARTIAL_STOP_SEQUENCE_DATA, null, msgs);
			msgs = basicSetPartialStopSequenceData(newPartialStopSequenceData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.PARTIAL_STOP_SEQUENCE_RESPONSE__PARTIAL_STOP_SEQUENCE_DATA, newPartialStopSequenceData, newPartialStopSequenceData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCustomerInformationServicePackage.PARTIAL_STOP_SEQUENCE_RESPONSE__PARTIAL_STOP_SEQUENCE_DATA:
				return basicSetPartialStopSequenceData(null, msgs);
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
			case IbisCustomerInformationServicePackage.PARTIAL_STOP_SEQUENCE_RESPONSE__PARTIAL_STOP_SEQUENCE_DATA:
				return getPartialStopSequenceData();
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
			case IbisCustomerInformationServicePackage.PARTIAL_STOP_SEQUENCE_RESPONSE__PARTIAL_STOP_SEQUENCE_DATA:
				setPartialStopSequenceData((PartialStopSequenceData)newValue);
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
			case IbisCustomerInformationServicePackage.PARTIAL_STOP_SEQUENCE_RESPONSE__PARTIAL_STOP_SEQUENCE_DATA:
				setPartialStopSequenceData((PartialStopSequenceData)null);
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
			case IbisCustomerInformationServicePackage.PARTIAL_STOP_SEQUENCE_RESPONSE__PARTIAL_STOP_SEQUENCE_DATA:
				return partialStopSequenceData != null;
		}
		return super.eIsSet(featureID);
	}

} //PartialStopSequenceResponseImpl
