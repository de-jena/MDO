/*
 */
package de.jena.mdo.ibis.common.impl;

import de.jena.mdo.ibis.common.DataAcceptedResponseDataStructure;
import de.jena.mdo.ibis.common.DataAcceptedResponseStructure;
import de.jena.mdo.ibis.common.IbisCommonPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Accepted Response Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DataAcceptedResponseStructureImpl#getDataAcceptedResponseData <em>Data Accepted Response Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataAcceptedResponseStructureImpl extends GeneralResponseStructureImpl implements DataAcceptedResponseStructure {
	/**
	 * The cached value of the '{@link #getDataAcceptedResponseData() <em>Data Accepted Response Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataAcceptedResponseData()
	 * @generated
	 * @ordered
	 */
	protected DataAcceptedResponseDataStructure dataAcceptedResponseData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataAcceptedResponseStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.Literals.DATA_ACCEPTED_RESPONSE_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataAcceptedResponseDataStructure getDataAcceptedResponseData() {
		return dataAcceptedResponseData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataAcceptedResponseData(DataAcceptedResponseDataStructure newDataAcceptedResponseData, NotificationChain msgs) {
		DataAcceptedResponseDataStructure oldDataAcceptedResponseData = dataAcceptedResponseData;
		dataAcceptedResponseData = newDataAcceptedResponseData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DATA_ACCEPTED_RESPONSE_STRUCTURE__DATA_ACCEPTED_RESPONSE_DATA, oldDataAcceptedResponseData, newDataAcceptedResponseData);
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
	public void setDataAcceptedResponseData(DataAcceptedResponseDataStructure newDataAcceptedResponseData) {
		if (newDataAcceptedResponseData != dataAcceptedResponseData) {
			NotificationChain msgs = null;
			if (dataAcceptedResponseData != null)
				msgs = ((InternalEObject)dataAcceptedResponseData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DATA_ACCEPTED_RESPONSE_STRUCTURE__DATA_ACCEPTED_RESPONSE_DATA, null, msgs);
			if (newDataAcceptedResponseData != null)
				msgs = ((InternalEObject)newDataAcceptedResponseData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DATA_ACCEPTED_RESPONSE_STRUCTURE__DATA_ACCEPTED_RESPONSE_DATA, null, msgs);
			msgs = basicSetDataAcceptedResponseData(newDataAcceptedResponseData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DATA_ACCEPTED_RESPONSE_STRUCTURE__DATA_ACCEPTED_RESPONSE_DATA, newDataAcceptedResponseData, newDataAcceptedResponseData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.DATA_ACCEPTED_RESPONSE_STRUCTURE__DATA_ACCEPTED_RESPONSE_DATA:
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
			case IbisCommonPackage.DATA_ACCEPTED_RESPONSE_STRUCTURE__DATA_ACCEPTED_RESPONSE_DATA:
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
			case IbisCommonPackage.DATA_ACCEPTED_RESPONSE_STRUCTURE__DATA_ACCEPTED_RESPONSE_DATA:
				setDataAcceptedResponseData((DataAcceptedResponseDataStructure)newValue);
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
			case IbisCommonPackage.DATA_ACCEPTED_RESPONSE_STRUCTURE__DATA_ACCEPTED_RESPONSE_DATA:
				setDataAcceptedResponseData((DataAcceptedResponseDataStructure)null);
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
			case IbisCommonPackage.DATA_ACCEPTED_RESPONSE_STRUCTURE__DATA_ACCEPTED_RESPONSE_DATA:
				return dataAcceptedResponseData != null;
		}
		return super.eIsSet(featureID);
	}

} //DataAcceptedResponseStructureImpl
