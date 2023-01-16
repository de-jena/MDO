/*
 */
package de.jena.mdo.ibis.common.impl;

import de.jena.mdo.ibis.common.DataVersionStructure;
import de.jena.mdo.ibis.common.IBISIPNMTOKEN;
import de.jena.mdo.ibis.common.IBISIPString;
import de.jena.mdo.ibis.common.IbisCommonPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Version Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DataVersionStructureImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DataVersionStructureImpl#getVersionRef <em>Version Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataVersionStructureImpl extends MinimalEObjectImpl.Container implements DataVersionStructure {
	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected IBISIPString dataType;

	/**
	 * The cached value of the '{@link #getVersionRef() <em>Version Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionRef()
	 * @generated
	 * @ordered
	 */
	protected IBISIPNMTOKEN versionRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataVersionStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.eINSTANCE.getDataVersionStructure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPString getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataType(IBISIPString newDataType, NotificationChain msgs) {
		IBISIPString oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DATA_VERSION_STRUCTURE__DATA_TYPE, oldDataType, newDataType);
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
	public void setDataType(IBISIPString newDataType) {
		if (newDataType != dataType) {
			NotificationChain msgs = null;
			if (dataType != null)
				msgs = ((InternalEObject)dataType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DATA_VERSION_STRUCTURE__DATA_TYPE, null, msgs);
			if (newDataType != null)
				msgs = ((InternalEObject)newDataType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DATA_VERSION_STRUCTURE__DATA_TYPE, null, msgs);
			msgs = basicSetDataType(newDataType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DATA_VERSION_STRUCTURE__DATA_TYPE, newDataType, newDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPNMTOKEN getVersionRef() {
		return versionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersionRef(IBISIPNMTOKEN newVersionRef, NotificationChain msgs) {
		IBISIPNMTOKEN oldVersionRef = versionRef;
		versionRef = newVersionRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DATA_VERSION_STRUCTURE__VERSION_REF, oldVersionRef, newVersionRef);
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
	public void setVersionRef(IBISIPNMTOKEN newVersionRef) {
		if (newVersionRef != versionRef) {
			NotificationChain msgs = null;
			if (versionRef != null)
				msgs = ((InternalEObject)versionRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DATA_VERSION_STRUCTURE__VERSION_REF, null, msgs);
			if (newVersionRef != null)
				msgs = ((InternalEObject)newVersionRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DATA_VERSION_STRUCTURE__VERSION_REF, null, msgs);
			msgs = basicSetVersionRef(newVersionRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DATA_VERSION_STRUCTURE__VERSION_REF, newVersionRef, newVersionRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.DATA_VERSION_STRUCTURE__DATA_TYPE:
				return basicSetDataType(null, msgs);
			case IbisCommonPackage.DATA_VERSION_STRUCTURE__VERSION_REF:
				return basicSetVersionRef(null, msgs);
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
			case IbisCommonPackage.DATA_VERSION_STRUCTURE__DATA_TYPE:
				return getDataType();
			case IbisCommonPackage.DATA_VERSION_STRUCTURE__VERSION_REF:
				return getVersionRef();
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
			case IbisCommonPackage.DATA_VERSION_STRUCTURE__DATA_TYPE:
				setDataType((IBISIPString)newValue);
				return;
			case IbisCommonPackage.DATA_VERSION_STRUCTURE__VERSION_REF:
				setVersionRef((IBISIPNMTOKEN)newValue);
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
			case IbisCommonPackage.DATA_VERSION_STRUCTURE__DATA_TYPE:
				setDataType((IBISIPString)null);
				return;
			case IbisCommonPackage.DATA_VERSION_STRUCTURE__VERSION_REF:
				setVersionRef((IBISIPNMTOKEN)null);
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
			case IbisCommonPackage.DATA_VERSION_STRUCTURE__DATA_TYPE:
				return dataType != null;
			case IbisCommonPackage.DATA_VERSION_STRUCTURE__VERSION_REF:
				return versionRef != null;
		}
		return super.eIsSet(featureID);
	}

} //DataVersionStructureImpl
