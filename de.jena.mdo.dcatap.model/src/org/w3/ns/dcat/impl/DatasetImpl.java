/**
 */
package org.w3.ns.dcat.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.w3.ns.dcat.Dataset;
import org.w3.ns.dcat.DatasetType;
import org.w3.ns.dcat.DcatPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dataset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3.ns.dcat.impl.DatasetImpl#getDataset <em>Dataset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatasetImpl extends MinimalEObjectImpl.Container implements Dataset {
	/**
	 * The cached value of the '{@link #getDataset() <em>Dataset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataset()
	 * @generated
	 * @ordered
	 */
	protected DatasetType dataset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatasetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DcatPackage.Literals.DATASET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatasetType getDataset() {
		return dataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataset(DatasetType newDataset, NotificationChain msgs) {
		DatasetType oldDataset = dataset;
		dataset = newDataset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DcatPackage.DATASET__DATASET, oldDataset, newDataset);
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
	public void setDataset(DatasetType newDataset) {
		if (newDataset != dataset) {
			NotificationChain msgs = null;
			if (dataset != null)
				msgs = ((InternalEObject)dataset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DcatPackage.DATASET__DATASET, null, msgs);
			if (newDataset != null)
				msgs = ((InternalEObject)newDataset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DcatPackage.DATASET__DATASET, null, msgs);
			msgs = basicSetDataset(newDataset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatPackage.DATASET__DATASET, newDataset, newDataset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DcatPackage.DATASET__DATASET:
				return basicSetDataset(null, msgs);
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
			case DcatPackage.DATASET__DATASET:
				return getDataset();
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
			case DcatPackage.DATASET__DATASET:
				setDataset((DatasetType)newValue);
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
			case DcatPackage.DATASET__DATASET:
				setDataset((DatasetType)null);
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
			case DcatPackage.DATASET__DATASET:
				return dataset != null;
		}
		return super.eIsSet(featureID);
	}

} //DatasetImpl
