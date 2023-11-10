/*
 */
package dcat.impl;

import dcat.Dataset;
import dcat.DatasetContainer;
import dcat.DcatPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dataset Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dcat.impl.DatasetContainerImpl#getDataset <em>Dataset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatasetContainerImpl extends MinimalEObjectImpl.Container implements DatasetContainer {
	/**
	 * The cached value of the '{@link #getDataset() <em>Dataset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataset()
	 * @generated
	 * @ordered
	 */
	protected Dataset dataset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatasetContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DcatPackage.Literals.DATASET_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dataset getDataset() {
		return dataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataset(Dataset newDataset, NotificationChain msgs) {
		Dataset oldDataset = dataset;
		dataset = newDataset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DcatPackage.DATASET_CONTAINER__DATASET, oldDataset, newDataset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataset(Dataset newDataset) {
		if (newDataset != dataset) {
			NotificationChain msgs = null;
			if (dataset != null)
				msgs = ((InternalEObject)dataset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DcatPackage.DATASET_CONTAINER__DATASET, null, msgs);
			if (newDataset != null)
				msgs = ((InternalEObject)newDataset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DcatPackage.DATASET_CONTAINER__DATASET, null, msgs);
			msgs = basicSetDataset(newDataset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatPackage.DATASET_CONTAINER__DATASET, newDataset, newDataset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DcatPackage.DATASET_CONTAINER__DATASET:
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
			case DcatPackage.DATASET_CONTAINER__DATASET:
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
			case DcatPackage.DATASET_CONTAINER__DATASET:
				setDataset((Dataset)newValue);
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
			case DcatPackage.DATASET_CONTAINER__DATASET:
				setDataset((Dataset)null);
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
			case DcatPackage.DATASET_CONTAINER__DATASET:
				return dataset != null;
		}
		return super.eIsSet(featureID);
	}

} //DatasetContainerImpl
