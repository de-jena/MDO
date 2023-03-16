/*
 */
package de.jena.mdo.ibis.ibis_common.impl;

import de.jena.mdo.ibis.ibis_common.DataAcceptedResponse;
import de.jena.mdo.ibis.ibis_common.DataAcceptedResponseData;
import de.jena.mdo.ibis.ibis_common.IbisCommonPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Accepted Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.DataAcceptedResponseImpl#getDataAcceptedResponseData <em>Data Accepted Response Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataAcceptedResponseImpl extends GeneralResponseImpl implements DataAcceptedResponse {
	/**
	 * The cached value of the '{@link #getDataAcceptedResponseData() <em>Data Accepted Response Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataAcceptedResponseData()
	 * @generated
	 * @ordered
	 */
	protected DataAcceptedResponseData dataAcceptedResponseData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataAcceptedResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.Literals.DATA_ACCEPTED_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataAcceptedResponseData getDataAcceptedResponseData() {
		return dataAcceptedResponseData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataAcceptedResponseData(DataAcceptedResponseData newDataAcceptedResponseData, NotificationChain msgs) {
		DataAcceptedResponseData oldDataAcceptedResponseData = dataAcceptedResponseData;
		dataAcceptedResponseData = newDataAcceptedResponseData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DATA_ACCEPTED_RESPONSE__DATA_ACCEPTED_RESPONSE_DATA, oldDataAcceptedResponseData, newDataAcceptedResponseData);
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
	public void setDataAcceptedResponseData(DataAcceptedResponseData newDataAcceptedResponseData) {
		if (newDataAcceptedResponseData != dataAcceptedResponseData) {
			NotificationChain msgs = null;
			if (dataAcceptedResponseData != null)
				msgs = ((InternalEObject)dataAcceptedResponseData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DATA_ACCEPTED_RESPONSE__DATA_ACCEPTED_RESPONSE_DATA, null, msgs);
			if (newDataAcceptedResponseData != null)
				msgs = ((InternalEObject)newDataAcceptedResponseData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DATA_ACCEPTED_RESPONSE__DATA_ACCEPTED_RESPONSE_DATA, null, msgs);
			msgs = basicSetDataAcceptedResponseData(newDataAcceptedResponseData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DATA_ACCEPTED_RESPONSE__DATA_ACCEPTED_RESPONSE_DATA, newDataAcceptedResponseData, newDataAcceptedResponseData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.DATA_ACCEPTED_RESPONSE__DATA_ACCEPTED_RESPONSE_DATA:
				return basicSetDataAcceptedResponseData(null, msgs);
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
			case IbisCommonPackage.DATA_ACCEPTED_RESPONSE__DATA_ACCEPTED_RESPONSE_DATA:
				return getDataAcceptedResponseData();
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
			case IbisCommonPackage.DATA_ACCEPTED_RESPONSE__DATA_ACCEPTED_RESPONSE_DATA:
				setDataAcceptedResponseData((DataAcceptedResponseData)newValue);
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
			case IbisCommonPackage.DATA_ACCEPTED_RESPONSE__DATA_ACCEPTED_RESPONSE_DATA:
				setDataAcceptedResponseData((DataAcceptedResponseData)null);
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
			case IbisCommonPackage.DATA_ACCEPTED_RESPONSE__DATA_ACCEPTED_RESPONSE_DATA:
				return dataAcceptedResponseData != null;
		}
		return super.eIsSet(featureID);
	}

} //DataAcceptedResponseImpl
